#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
kevin_cloud_query.py — 查询 Kevin 云端中某抖音 uid 的云端数据

数据来源（逆向自 APK，见 kevin-decode-report.tsv 与 PPHook.java）：
  VIP 白名单 : GET https://111.kevin42.dpdns.org/vip_list.json
               （作者自建域名上托管的静态 JSON，内容是抖音 uid 名单）

本工具只做只读查询：拉取名单 → 检查目标 uid 是否在名单内 → 报告授权状态。
名单 JSON 的字段结构在反编译时被混淆，工具采用“宽容解析”：
递归遍历整个 JSON，收集所有形似抖音 uid（纯数字串）的值。

用法示例：
  python kevin_cloud_query.py 1234567890
  python kevin_cloud_query.py uidA uidB uidC --dump
  python kevin_cloud_query.py --check uids.txt
  python kevin_cloud_query.py 1234567890 --list-url vip.json --raw
  python kevin_cloud_query.py 1234567890 --list-url https://example.com/vip.json
"""

import argparse
import json
import re
import sys
import urllib.error
import urllib.request

DEFAULT_LIST_URL = "https://111.kevin42.dpdns.org/vip_list.json"
DEFAULT_UA = "Mozilla/5.0 (Android) KevinHook/1.0"
# 抖音 uid 一般是 10 位左右的纯数字串
UID_RE = re.compile(r"^\d{5,}$")


def _stdout_utf8():
    """Windows 控制台默认 GBK，先切到 UTF-8，避免中文输出报错。"""
    if sys.stdout and hasattr(sys.stdout, "reconfigure"):
        try:
            sys.stdout.reconfigure(encoding="utf-8")
        except Exception:
            pass


def fetch(url: str, timeout: int, ua: str):
    req = urllib.request.Request(url, headers={"User-Agent": ua})
    with urllib.request.urlopen(req, timeout=timeout) as resp:
        raw = resp.read()
    return raw, resp.status


def load_source(url: str, timeout: int, ua: str):
    """支持 http(s) 地址或本地文件路径作为名单来源。"""
    if url.startswith(("http://", "https://")):
        return fetch(url, timeout, ua)
    with open(url, "rb") as fh:
        return fh.read(), 0  # status=0 表示本地文件


def _walk_strings(obj, out):
    """递归取出 JSON 里的所有字符串值。"""
    if isinstance(obj, dict):
        for v in obj.values():
            _walk_strings(v, out)
    elif isinstance(obj, list):
        for v in obj:
            _walk_strings(v, out)
    elif isinstance(obj, str):
        out.append(obj)


def extract_uids(data):
    """宽容解析：递归收集所有像抖音 uid 的字符串。"""
    strings = []
    _walk_strings(data, strings)
    uids, seen = [], set()
    for s in strings:
        s = s.strip()
        if UID_RE.match(s) and s not in seen:
            seen.add(s)
            uids.append(s)
    return uids


def _load_json(raw: bytes):
    """先按 JSON 解析；失败则退回“字符串扫描”模式。"""
    try:
        return json.loads(raw.decode("utf-8"))
    except (ValueError, UnicodeDecodeError):
        return None


def run_query(args):
    print(f"[*] 拉取名单: {args.list_url}")
    try:
        raw, status = load_source(args.list_url, args.timeout, DEFAULT_UA)
    except FileNotFoundError:
        print(f"[!] 本地文件不存在: {args.list_url}")
        sys.exit(1)
    except urllib.error.HTTPError as e:
        print(f"[!] HTTP 错误: {e.code} {e.reason}")
        sys.exit(1)
    except urllib.error.URLError as e:
        print(f"[!] 网络错误: {e.reason}")
        print("    域名可能已失效或被网络策略拦截。")
        print("    可把名单保存为本地 JSON，再用 --list-url 指向本地文件。")
        sys.exit(1)
    except Exception as e:  # noqa: BLE001
        print(f"[!] 请求失败: {e}")
        sys.exit(1)

    if status:
        print(f"[*] HTTP {status}, {len(raw)} 字节")
    else:
        print(f"[*] 已从本地文件读取 {len(raw)} 字节")

    data = _load_json(raw)
    if data is None:
        # JSON 解析失败时，从原始文本里直接找数字串
        uids = sorted(set(re.findall(r"(?<!\d)\d{5,}(?!\d)", raw.decode("utf-8", "ignore"))))
    else:
        if args.raw:
            print("[*] 原始 JSON:")
            print(json.dumps(data, ensure_ascii=False, indent=2))
        uids = extract_uids(data)

    total = len(uids)
    print(f"[*] 名单内识别到 {total} 个 uid")

    if args.dump:
        print("[*] 名单 uid 列表:")
        for u in uids:
            print(f"    {u}")

    targets = list(args.uid)
    if args.check:
        try:
            with open(args.check, "r", encoding="utf-8") as fh:
                for line in fh:
                    line = line.strip()
                    if line:
                        targets.append(line)
        except OSError as e:
            print(f"[!] 无法读取文件 {args.check}: {e}")
            sys.exit(1)

    if not targets:
        print("[!] 未提供要查询的 uid（用位置参数，或 --check 指定文件）")
        sys.exit(1)

    uid_set = set(uids)
    print()
    print("=== 云端数据查询结果 ===")
    for t in targets:
        t = t.strip()
        if not t:
            continue
        in_list = t in uid_set
        mark = "✅ 在名单内（VIP）" if in_list else "❌ 不在名单内（普通用户）"
        print(f"uid {t:<20} {mark}")
    print("========================")


def main():
    parser = argparse.ArgumentParser(
        description="查询 Kevin 云端中某抖音 uid 的云端数据（VIP 白名单成员判定）。"
    )
    parser.add_argument("uid", nargs="*", help="要查询的抖音 uid，可多个")
    parser.add_argument(
        "--list-url",
        default=DEFAULT_LIST_URL,
        help=f"VIP 名单地址（默认 {DEFAULT_LIST_URL}）",
    )
    parser.add_argument(
        "--check", metavar="FILE", help="从文件批量检查，每行一个 uid"
    )
    parser.add_argument("--dump", action="store_true", help="打印完整名单 uid 列表")
    parser.add_argument("--raw", action="store_true", help="打印原始 JSON 响应")
    parser.add_argument("--timeout", type=int, default=15, help="网络超时秒数（默认 15）")
    args = parser.parse_args()

    if not args.uid and not args.check:
        parser.error("请提供至少一个 uid，或使用 --check FILE")

    _stdout_utf8()
    run_query(args)


if __name__ == "__main__":
    main()
