# -*- coding: utf-8 -*-
"""
将 decrypted_sms/runtime_request_trace.json 中所有可逆编码内容批量解码/还原：
- URL/query string
- application/x-www-form-urlencoded
- JSON 字符串
- Cookie 键值和 Cookie 内部 URL 编码/JSON/PHP 序列化片段
- %xx / %uXXXX URL 编码
- JWT header/payload
- 可读 Base64/Base64URL
输出：runtime_request_trace_decrypted.json / .csv / .txt
"""
import base64
import csv
import json
import re
import string
import urllib.parse
from pathlib import Path

ROOT = Path(__file__).resolve().parent
INFILE = ROOT / "decrypted_sms" / "runtime_request_trace.json"
OUT_JSON = ROOT / "decrypted_sms" / "runtime_request_trace_decrypted.json"
OUT_CSV = ROOT / "decrypted_sms" / "runtime_request_trace_decrypted_flat.csv"
OUT_TXT = ROOT / "decrypted_sms" / "runtime_request_trace_decoded_summary.txt"

PRINTABLE = set(string.printable) | set("，。！？；：、（）【】《》“”‘’￥·—…")

stats = {
    "url_unquote": 0,
    "json_parse": 0,
    "form_parse": 0,
    "cookie_parse": 0,
    "jwt_decode": 0,
    "base64_decode": 0,
    "php_serialized_hint": 0,
}


def decode_percent_u(s: str) -> str:
    def repl(m):
        try:
            return chr(int(m.group(1), 16))
        except Exception:
            return m.group(0)
    return re.sub(r"%u([0-9a-fA-F]{4})", repl, s)


def url_unquote_recursive(s: str, rounds: int = 3) -> str:
    old = s
    for _ in range(rounds):
        new = decode_percent_u(urllib.parse.unquote(old))
        if new == old:
            break
        old = new
    return old


def try_json(s: str):
    if not isinstance(s, str):
        return None
    t = s.strip()
    if not t or t[0] not in "[{\"":
        return None
    try:
        return json.loads(t)
    except Exception:
        return None


def is_mostly_text(b: bytes) -> bool:
    if not b:
        return False
    try:
        txt = b.decode("utf-8")
    except Exception:
        return False
    if not txt:
        return False
    # 控制字符太多则不是可读文本
    bad = sum(1 for ch in txt if ord(ch) < 32 and ch not in "\r\n\t")
    return bad == 0 and len(txt) >= 4


def b64url_decode_segment(seg: str):
    try:
        pad = "=" * ((4 - len(seg) % 4) % 4)
        return base64.urlsafe_b64decode((seg + pad).encode())
    except Exception:
        return None


def try_jwt(s: str):
    token = s.strip()
    if token.lower().startswith("bearer "):
        token = token.split(None, 1)[1]
    # 提取一段 JWT，而不是误把 URL 当 JWT
    m = re.fullmatch(r"([A-Za-z0-9_-]{8,})\.([A-Za-z0-9_-]{8,})\.([A-Za-z0-9_-]*)", token)
    if not m:
        return None
    parts = token.split(".")
    decoded = []
    for part in parts[:2]:
        raw = b64url_decode_segment(part)
        if raw is None:
            return None
        try:
            decoded.append(json.loads(raw.decode("utf-8")))
        except Exception:
            return None
    return {"header": decoded[0], "payload": decoded[1], "signature_b64url": parts[2]}


def try_base64_text(s: str):
    t = s.strip()
    if len(t) < 12 or len(t) > 2000:
        return None
    if "://" in t or "@" in t or "=" in t[:3]:
        return None
    # 避免把普通域名/UA/uuid/hex/md5 都误判
    if re.fullmatch(r"[0-9a-fA-F]{16,}", t):
        return None
    if not re.fullmatch(r"[A-Za-z0-9+/=_-]+", t):
        return None
    for decoder in (base64.b64decode, base64.urlsafe_b64decode):
        try:
            pad = "=" * ((4 - len(t) % 4) % 4)
            b = decoder((t + pad).encode(), validate=False) if decoder is base64.b64decode else decoder((t + pad).encode())
            if is_mostly_text(b):
                txt = b.decode("utf-8")
                # 只有明显结构化/自然语言才保存，减少误报
                if any(ch in txt for ch in "{}[]:=,;?&中文手机号验证码tokenTOKEN") or re.search(r"[\u4e00-\u9fff]", txt):
                    return txt
        except Exception:
            pass
    return None


def parse_cookie(s: str):
    parts = []
    for raw in s.split(";"):
        raw = raw.strip()
        if not raw:
            continue
        if "=" in raw:
            k, v = raw.split("=", 1)
            parts.append({"name": k.strip(), "value": v.strip(), "decoded": decode_string(v.strip())})
        else:
            parts.append({"name": raw, "value": ""})
    return parts


def parse_form(s: str):
    if "=" not in s:
        return None
    # 对明显 JSON 跳过
    if s.strip().startswith(("{", "[")):
        return None
    parsed = urllib.parse.parse_qs(s, keep_blank_values=True)
    if not parsed:
        return None
    # 至少包含 & 或 %xx，或者很像 key=value 表单
    if "&" not in s and "%" not in s and len(parsed) == 1 and not re.fullmatch(r"[A-Za-z0-9_\-.]+=[\s\S]*", s):
        return None
    return {k: (v[0] if len(v) == 1 else v) for k, v in parsed.items()}


def php_serialized_hint(s: str):
    # 不完整 PHP unserialize，只给可读还原和提示；city_info 这类可直接看到中文字段
    if re.match(r"^[aObisNd]:", s):
        return {"type": "php_serialized", "decoded_text": s}
    return None


def decode_string(s: str):
    result = {}

    unq = url_unquote_recursive(s)
    if unq != s:
        stats["url_unquote"] += 1
        result["url_decoded"] = unq

    # JSON：原文或 URL 解码后都尝试
    for cand in (s, unq):
        js = try_json(cand)
        if js is not None:
            stats["json_parse"] += 1
            result["json_parsed"] = decode_any(js)
            break

    form = parse_form(unq)
    if form is not None:
        stats["form_parse"] += 1
        result["form_parsed"] = decode_any(form)

    jwt = try_jwt(s) or try_jwt(unq)
    if jwt is not None:
        stats["jwt_decode"] += 1
        result["jwt_decoded"] = jwt

    b64 = try_base64_text(s)
    if b64 is not None:
        stats["base64_decode"] += 1
        result["base64_decoded_text"] = b64
        js = try_json(b64)
        if js is not None:
            result["base64_json_parsed"] = decode_any(js)

    php = php_serialized_hint(unq)
    if php is not None:
        stats["php_serialized_hint"] += 1
        result["php_serialized"] = php

    return result or None


def decode_any(x):
    if isinstance(x, dict):
        out = {}
        for k, v in x.items():
            out[k] = decode_any(v)
        return out
    if isinstance(x, list):
        return [decode_any(v) for v in x]
    if isinstance(x, str):
        dec = decode_string(x)
        if dec:
            return {"_value": x, "_decoded": dec}
        return x
    return x


def decode_url(url: str):
    parsed = urllib.parse.urlsplit(url)
    q = urllib.parse.parse_qs(parsed.query, keep_blank_values=True)
    flat_q = {k: (v[0] if len(v) == 1 else v) for k, v in q.items()}
    return {
        "url_decoded": url_unquote_recursive(url),
        "scheme": parsed.scheme,
        "host": parsed.netloc,
        "path": url_unquote_recursive(parsed.path),
        "query": decode_any(flat_q),
    }


def decode_call(call: dict, index: int):
    out = dict(call)
    decoded = {}
    url = call.get("url")
    if isinstance(url, str):
        decoded["url"] = decode_url(url)
    headers = call.get("headers")
    if isinstance(headers, dict):
        headers_dec = decode_any(headers)
        # Cookie 额外拆分
        for hk, hv in headers.items():
            if hk.lower() == "cookie" and isinstance(hv, str):
                stats["cookie_parse"] += 1
                headers_dec[hk] = {"_value": hv, "_cookies": parse_cookie(hv)}
            if hk.lower() == "authorization" and isinstance(hv, str):
                jwt = try_jwt(hv)
                if jwt:
                    headers_dec[hk] = {"_value": hv, "jwt_decoded": jwt}
        decoded["headers"] = headers_dec
    for k in ("params", "json", "data"):
        if k in call:
            decoded[k] = decode_any(call[k])
    out["decoded"] = decoded
    out["trace_index"] = index
    return out


def flatten_for_csv(call):
    dec = call.get("decoded", {})
    data = dec.get("data", call.get("data"))
    params = dec.get("params", call.get("params"))
    js = dec.get("json", call.get("json"))
    return {
        "trace_index": call.get("trace_index"),
        "method": call.get("method"),
        "host": dec.get("url", {}).get("host", ""),
        "url": call.get("url"),
        "url_decoded": dec.get("url", {}).get("url_decoded", ""),
        "query_decoded": json.dumps(dec.get("url", {}).get("query", {}), ensure_ascii=False),
        "params_decoded": json.dumps(params, ensure_ascii=False),
        "json_decoded": json.dumps(js, ensure_ascii=False),
        "data_decoded": json.dumps(data, ensure_ascii=False),
        "headers_decoded": json.dumps(dec.get("headers", {}), ensure_ascii=False),
    }


def main():
    src = json.loads(INFILE.read_text(encoding="utf-8"))
    calls = src.get("calls", [])
    decoded_calls = [decode_call(c, i + 1) for i, c in enumerate(calls)]
    out = {
        "source_file": str(INFILE),
        "note": "可逆编码/可解析结构已展开；哈希、真实不可逆密文不会被强行伪解密。",
        "original_call_count": src.get("call_count"),
        "decoded_call_count": len(decoded_calls),
        "decode_stats": stats,
        "calls": decoded_calls,
    }
    OUT_JSON.write_text(json.dumps(out, ensure_ascii=False, indent=2), encoding="utf-8")

    rows = [flatten_for_csv(c) for c in decoded_calls]
    with OUT_CSV.open("w", encoding="utf-8-sig", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=list(rows[0].keys()))
        writer.writeheader()
        writer.writerows(rows)

    lines = []
    lines.append(f"source: {INFILE}")
    lines.append(f"calls: {len(decoded_calls)}")
    lines.append("decode_stats:")
    for k, v in stats.items():
        lines.append(f"  {k}: {v}")
    lines.append("")
    for c in decoded_calls:
        host = c.get("decoded", {}).get("url", {}).get("host", "")
        lines.append(f"[{c['trace_index']}] {c.get('method')} {host} {c.get('url')}")
    OUT_TXT.write_text("\n".join(lines), encoding="utf-8")
    print("written:")
    print(OUT_JSON)
    print(OUT_CSV)
    print(OUT_TXT)
    print(json.dumps(stats, ensure_ascii=False, indent=2))


if __name__ == "__main__":
    main()
