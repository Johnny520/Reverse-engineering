#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
get_user_cloud_data.py — 获取用户云端数据工具（挖红薯呀 / top.anjao2024.xp1whs）

复现 Android 客户端（p000/n90.java）的授权验证请求，向作者服务器
verify.php 发起 POST 验签，获取该授权码 + 小红书ID 对应的云端授权数据。

原理：
  * 授权码前缀决定接口与 HMAC 密钥（前缀 WHS-X- 走正式接口，WHS-Y- 走公开接口）
  * 请求体  : key=<激活码>&redbook_id=<小红书ID>&sign=<sign>
  * sign    : URLEncode( Hex( HmacSHA256("key=...&redbook_id=...", 密钥) ) )
  * 响应二次验签：删除 sign 字段，剩余字段按键名排序，
                序列化为 key=URLEncode(value) 用 & 连接，重算 HMAC 比对。

仅使用 Python 标准库，无第三方依赖。

用法：
  python get_user_cloud_data.py --key <激活码> --uid <小红书ID>
  python get_user_cloud_data.py --key <激活码> --uid <小红书ID> --json
  python get_user_cloud_data.py --selftest        # 离线自检，不发网络请求

本工具仅模拟客户端正常行为，服务器仍是最终验证方，无法凭空生成有效授权码。
"""

import argparse
import hashlib
import hmac
import io
import json
import sys
import urllib.parse
import urllib.request
import urllib.error

# Windows 控制台默认可能不是 UTF-8，统一 stdout/stderr 为 UTF-8 避免中文乱码
try:
    sys.stdout.reconfigure(encoding="utf-8")
    sys.stderr.reconfigure(encoding="utf-8")
except (AttributeError, ValueError):
    pass

# ---------------------------------------------------------------------------
# 常量：接口与密钥（提取自反编译源码 p000/n90.java）
# ---------------------------------------------------------------------------
# 授权码前缀 -> (接口URL, HMAC密钥)
ENDPOINTS = {
    "WHS-X-": {
        "url": "https://anjao2024.top/auth/verify.php",
        "secret": "lQF7RGJwJwSsUKsQu8nOWBaM3dXywnzP/3BAxa1EFu0=",
    },
    "WHS-Y-": {
        "url": "https://anjao2024.top/auth_public/verify.php",
        "secret": "XkT+heMGMAIP02ryj66hi7Cpwhar5Oi1z7yYcthAhXL6JSbn",
    },
}

DEFAULT_TIMEOUT = 8  # 秒，与客户端 setConnectTimeout/setReadTimeout 一致


# ---------------------------------------------------------------------------
# 签名与验签（对齐 n90.java 的 m2647K / m2649M / m2650N）
# ---------------------------------------------------------------------------
def hmac_sha256_hex(data: str, secret: str) -> str:
    """Hex(HmacSHA256(data, secret))，小写 hex。对应 n90.m2647K。"""
    digest = hmac.new(secret.encode("utf-8"), data.encode("utf-8"), hashlib.sha256).digest()
    return digest.hex()


def build_request_sign(key: str, uid: str, secret: str) -> str:
    """
    构造请求体签名。
    n90.java:354-355:
      str5 = "key=" + URLEncode(key) + "&redbook_id=" + URLEncode(uid)
      body = str5 + "&sign=" + URLEncode(Hex(HmacSHA256(str5, secret)))
    """
    base = "key={}&redbook_id={}".format(
        urllib.parse.quote(key, safe=""),
        urllib.parse.quote(uid, safe=""),
    )
    return urllib.parse.quote(hmac_sha256_hex(base, secret), safe="")


def verify_response_sign(response: dict, secret: str) -> bool:
    """
    客户端二次验签（n90.java:194-219）：
      1. 取 sign，为空则失败
      2. 删除 sign 字段
      3. 剩余字段按键名升序排序
      4. 序列化为 key=URLEncode(value)（value 先 str()），用 & 连接
      5. Hex(HmacSHA256(payload, secret)) 与 sign 比对
    """
    server_sign = response.get("sign")
    if not isinstance(server_sign, str) or not server_sign:
        return False
    clone = {k: v for k, v in response.items() if k != "sign"}
    parts = []
    for k in sorted(clone.keys()):
        value = urllib.parse.quote(str(clone[k]), safe="")
        parts.append("{}={}".format(k, value))
    payload = "&".join(parts)
    return hmac_sha256_hex(payload, secret) == server_sign


def pick_endpoint(key: str) -> dict:
    """按授权码前缀选择接口，返回 ENDPOINTS 条目。"""
    for prefix in ("WHS-X-", "WHS-Y-"):
        if key.startswith(prefix):
            return ENDPOINTS[prefix]
    raise ValueError("无效授权码格式：必须以 WHS-X- 或 WHS-Y- 开头")


# ---------------------------------------------------------------------------
# 云端请求
# ---------------------------------------------------------------------------
def fetch_user_cloud_data(key: str, uid: str, timeout: int = DEFAULT_TIMEOUT) -> dict:
    """模拟客户端发起授权验证请求，返回云端数据 + 本地验签结论。"""
    endpoint = pick_endpoint(key)
    url = endpoint["url"]
    secret = endpoint["secret"]

    base = "key={}&redbook_id={}".format(
        urllib.parse.quote(key, safe=""),
        urllib.parse.quote(uid, safe=""),
    )
    body = "{}&sign={}".format(base, build_request_sign(key, uid, secret))

    req = urllib.request.Request(
        url,
        data=body.encode("utf-8"),
        headers={"Content-Type": "application/x-www-form-urlencoded"},
        method="POST",
    )

    try:
        with urllib.request.urlopen(req, timeout=timeout) as resp:
            raw = resp.read().decode("utf-8")
    except urllib.error.HTTPError as e:
        return {"ok": False, "error": "http_error: {} {}".format(e.code, e.reason)}
    except urllib.error.URLError as e:
        return {"ok": False, "error": "network_error: {}".format(e.reason)}
    except Exception as e:  # noqa: BLE001
        return {"ok": False, "error": "request_error: {}".format(e)}

    try:
        data = json.loads(raw)
    except json.JSONDecodeError:
        return {"ok": False, "error": "invalid_json", "raw_body": raw[:500]}

    sign_valid = verify_response_sign(data, secret)
    code = data.get("code")
    return {
        "ok": True,
        "endpoint": url,
        "secret_prefix": key[:7],
        "authorized": sign_valid and code == 200,
        "sign_valid": sign_valid,
        "server_code": code,
        "server_msg": data.get("msg"),
        "cloud_data": data,
    }


# ---------------------------------------------------------------------------
# CLI
# ---------------------------------------------------------------------------
def human_output(result: dict) -> str:
    if not result.get("ok"):
        return "查询失败：{}".format(result.get("error", "未知错误"))

    lines = []
    lines.append("云端数据（授权验证）：")
    lines.append("  接口      : {}".format(result["endpoint"]))
    lines.append("  授权码前缀: {}".format(result["secret_prefix"]))
    lines.append("  响应验签  : {}".format("通过" if result["sign_valid"] else "失败/缺失"))
    lines.append("  服务器 code: {}".format(result["server_code"]))
    if result["server_msg"]:
        lines.append("  服务器 msg : {}".format(result["server_msg"]))
    lines.append("  授权状态  : {}".format(
        "已授权（code=200 且验签通过）" if result["authorized"]
        else "未授权 / 激活码无效（见 code 与 msg）"
    ))
    lines.append("  云端原始数据:")
    lines.append(json.dumps(result["cloud_data"], ensure_ascii=False, indent=2))
    return "\n".join(lines)


def selftest() -> int:
    """离线自检：验证签名/验签函数与接口选择逻辑，不发任何网络请求。"""
    print("== 自检开始 ==")
    # 1. HMAC-SHA256 已知向量（RFC 4231 Test Case 2：key="Jefe", data 上述字符串）
    expected = "5bdcc146bf60754e6a042426089575c75a003f089d2739839dec58b964ec3843"
    got = hmac_sha256_hex("what do ya want for nothing?", "Jefe")
    status = "通过" if got == expected else "失败"
    print("[1] HmacSHA256 已知向量: {}".format(status))
    if got != expected:
        return 1
    # 2. 前缀选择
    for prefix, name in (("WHS-X-", "正式"), ("WHS-Y-", "公开")):
        ep = pick_endpoint(prefix + "abc")
        expect = "auth/verify.php" if prefix == "WHS-X-" else "auth_public/verify.php"
        status = "通过" if expect in ep["url"] else "失败"
        print("[2] {}接口选择 ({}): {}".format(name, prefix, status))
        if expect not in ep["url"]:
            return 1
    try:
        pick_endpoint("INVALID")
        print("[2] 非法前缀应报错: 失败")
        return 1
    except ValueError:
        print("[2] 非法前缀应报错: 通过")
    # 3. 响应验签（自洽性：用同一密钥构造再验证）
    secret = ENDPOINTS["WHS-X-"]["secret"]
    resp = {"sign": "", "code": 200, "msg": "ok"}
    payload = "code=200&msg=ok"
    resp["sign"] = hmac_sha256_hex(payload, secret)
    status = "通过" if verify_response_sign(resp, secret) else "失败"
    print("[3] 响应验签自洽: {}".format(status))
    if not verify_response_sign(resp, secret):
        return 1
    # 4. 请求签名可构造
    sign = build_request_sign("WHS-X-test", "12345", secret)
    print("[4] 请求签名构造: 通过（长度 {}）".format(len(sign)))
    print("== 自检全部通过 ==")
    return 0


def main(argv=None) -> int:
    parser = argparse.ArgumentParser(
        prog="get_user_cloud_data.py",
        description="获取用户云端授权数据（复现挖红薯呀模块的 verify.php 验签请求）",
    )
    parser.add_argument("--key", help="激活码（必须以 WHS-X- 或 WHS-Y- 开头）")
    parser.add_argument("--uid", help="小红书用户 ID / redbook_id")
    parser.add_argument("--timeout", type=int, default=DEFAULT_TIMEOUT,
                        help="请求超时秒数（默认 %d）" % DEFAULT_TIMEOUT)
    parser.add_argument("--json", action="store_true",
                        help="以 JSON 输出完整结果")
    parser.add_argument("--selftest", action="store_true",
                        help="离线自检签名/验签逻辑，不发网络请求")
    args = parser.parse_args(argv)

    if args.selftest:
        return selftest()

    if not args.key or not args.uid:
        parser.error("必须同时提供 --key 与 --uid（或使用 --selftest）")

    try:
        result = fetch_user_cloud_data(args.key, args.uid, args.timeout)
    except ValueError as e:
        parser.error(str(e))

    if args.json:
        print(json.dumps(result, ensure_ascii=False, indent=2))
    else:
        print(human_output(result))

    # 退出码：0 授权成功，1 失败/未授权，2 网络或解析错误
    if result.get("ok") and result.get("authorized"):
        return 0
    if result.get("ok"):
        return 1
    return 2


if __name__ == "__main__":
    sys.exit(main())
