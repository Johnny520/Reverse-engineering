#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
DY Helper 云端 Beta 名单查询工具
================================
从 DY Helper 作者的 GitHub 云端名单 (beta_users.json) 查询指定抖音 UID
的云端授权数据（即"捐赠/Beta 内测资格"记录）。

用法示例:
    python query_beta_users.py 70008778893          # 查询单个 UID
    python query_beta_users.py 70008778893 --full   # 显示完整签名
    python query_beta_users.py --list               # 列出全部用户
    python query_beta_users.py 70008778893 --refresh  # 强制刷新缓存

仅依赖 Python 标准库（urllib/json），无需安装第三方包。
"""

import argparse
import json
import os
import sys
import time
import urllib.request

# Windows 控制台默认按 GBK 输出，强制 UTF-8 避免中文乱码（终端需支持 UTF-8）
if hasattr(sys.stdout, "reconfigure"):
    sys.stdout.reconfigure(encoding="utf-8", errors="replace")
if hasattr(sys.stderr, "reconfigure"):
    sys.stderr.reconfigure(encoding="utf-8", errors="replace")

DEFAULT_URL = "https://raw.githubusercontent.com/yyhh73144-max/dyhelperUser/main/beta_users.json"
CACHE_FILE = os.path.join(os.path.dirname(os.path.abspath(__file__)), "beta_users_cache.json")
CACHE_TTL = 3600  # 缓存有效期：1 小时


def fetch_beta_users(url: str, refresh: bool = False) -> dict:
    """下载并解析云端名单 JSON，带本地缓存。"""
    if not refresh and os.path.exists(CACHE_FILE):
        age = time.time() - os.path.getmtime(CACHE_FILE)
        if age < CACHE_TTL:
            with open(CACHE_FILE, encoding="utf-8") as f:
                return json.load(f)

    req = urllib.request.Request(
        url,
        headers={"Cache-Control": "no-cache", "User-Agent": "DYHelper-Query/1.0"},
    )
    with urllib.request.urlopen(req, timeout=30) as resp:
        raw = resp.read().decode("utf-8-sig")  # utf-8-sig 自动去掉 BOM

    data = json.loads(raw)
    with open(CACHE_FILE, "w", encoding="utf-8") as f:
        json.dump(data, f, ensure_ascii=False, indent=2)
    return data


def is_expired(expire: str) -> tuple:
    """判断资格是否已过期，返回 (是否过期, 剩余天数)。"""
    try:
        exp = time.strptime(expire, "%Y-%m-%d")
        now = time.localtime()
        days = (time.mktime(exp) - time.mktime(now)) / 86400
        return days < 0, int(days)
    except (ValueError, TypeError):
        return None, None


def print_user(uid: str, full: bool = False) -> bool:
    """查询单个 UID，命中返回 True。"""
    data = fetch_beta_users(ARGS.url, ARGS.refresh)
    users = data.get("beta_users") or []

    target = None
    for u in users:
        if str(u.get("uid")) == str(uid):
            target = u
            break

    print(f"名单更新时间: {data.get('update_time', '未知')}")
    print(f"名单用户总数: {len(users)}")
    notice = (data.get("notice") or "").strip()
    if notice:
        print(f"公告: {notice}")
    print("-" * 60)

    if target is None:
        print(f"[未命中] UID {uid} 不在云端 Beta 名单中。")
        return False

    print(f"[命中] UID: {target.get('uid')}")
    print(f"      到期: {target.get('expire')}")
    expired, days = is_expired(target.get("expire"))
    if expired is True:
        print(f"      状态: 已过期（{abs(days)} 天前）")
    elif expired is False:
        print(f"      状态: 有效，剩余 {days} 天")
    else:
        print(f"      状态: 未知（到期时间格式异常）")
    sign = target.get("dynamic_code_sign", "")
    if full:
        print(f"      签名: {sign}")
    else:
        print(f"      签名: {sign[:48]}...（共 {len(sign)} 字符，--full 查看完整）")
    return True


def list_all(full: bool = False) -> None:
    """列出全部名单用户。"""
    data = fetch_beta_users(ARGS.url, ARGS.refresh)
    users = data.get("beta_users") or []

    print(f"名单更新时间: {data.get('update_time', '未知')}")
    print(f"名单用户总数: {len(users)}")
    notice = (data.get("notice") or "").strip()
    if notice:
        print(f"公告: {notice}")
    print("-" * 60)

    if not users:
        print("名单为空。")
        return

    for u in users:
        sign = u.get("dynamic_code_sign", "")
        expired, days = is_expired(u.get("expire"))
        state = "已过期" if expired is True else f"剩{days}天" if expired is False else "未知"
        line = f"UID: {u.get('uid'):<18} 到期: {u.get('expire'):<12} 状态: {state:<8}"
        if full:
            line += f" 签名: {sign}"
        else:
            line += f" 签名: {sign[:32]}..."
        print(line)


if __name__ == "__main__":
    parser = argparse.ArgumentParser(
        description="DY Helper 云端 Beta 名单查询工具",
        epilog=f"默认名单地址: {DEFAULT_URL}",
    )
    parser.add_argument("uid", nargs="?", help="要查询的抖音 UID")
    parser.add_argument("--list", action="store_true", help="列出名单中全部用户")
    parser.add_argument("--full", action="store_true", help="显示完整的 dynamic_code_sign")
    parser.add_argument("--refresh", action="store_true", help="强制重新下载，忽略本地缓存")
    parser.add_argument("--url", default=DEFAULT_URL, help="名单 JSON 地址（默认使用作者 GitHub 仓库）")
    ARGS = parser.parse_args()

    try:
        if ARGS.list:
            list_all(ARGS.full)
        elif ARGS.uid:
            print_user(ARGS.uid, ARGS.full)
        else:
            parser.print_help()
            sys.exit(1)
    except urllib.error.URLError as e:
        print(f"网络错误，无法下载名单: {e}", file=sys.stderr)
        sys.exit(2)
    except json.JSONDecodeError as e:
        print(f"名单 JSON 解析失败: {e}", file=sys.stderr)
        sys.exit(3)
    except KeyboardInterrupt:
        sys.exit(130)
