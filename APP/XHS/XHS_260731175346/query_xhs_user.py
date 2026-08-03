#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""XHS(小红书)用户云端公开数据查询工具。

输入小红书用户主页链接(推荐, 含 xsec_token)或纯用户 ID, 解析网页版
__INITIAL_STATE__, 输出用户资料与笔记列表, 并可保存为 JSON。
仅依赖 Python 标准库 (urllib / json / re / argparse), 无需第三方包。
"""

import argparse
import datetime
import json
import os
import re
import sys
import urllib.error
import urllib.request

# Windows 终端默认 GBK, 强制 UTF-8 输出避免中文乱码
for _stream in (sys.stdout, sys.stderr):
    if getattr(_stream, "reconfigure", None):
        try:
            _stream.reconfigure(encoding="utf-8", errors="replace")
        except (ValueError, OSError):
            pass

USER_AGENT = (
    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 "
    "(KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"
)
PROFILE_URL = "https://www.xiaohongshu.com/user/profile/{uid}"


# ---------------------------------------------------------------------------
# 工具函数
# ---------------------------------------------------------------------------

def eprint(*args, **kwargs):
    kwargs.setdefault("file", sys.stderr)
    kwargs.setdefault("flush", True)
    print(*args, **kwargs)


def resolve_uid(argument):
    """从用户输入解析出用户 ID。支持纯 ID 或带 xsec_token 的完整主页链接。"""
    argument = (argument or "").strip()
    if not argument:
        return None
    m = re.search(r"/user/profile/([0-9a-zA-Z]{10,})", argument)
    if m:
        return m.group(1)
    m = re.search(r"([0-9a-zA-Z]{10,})", argument)
    if m:
        return m.group(1)
    return None


def build_profile_url(argument):
    """构造主页请求 URL。若输入是完整链接则原样保留其 query(含 xsec_token)。"""
    if re.search(r"^https?://", argument):
        return argument
    uid = resolve_uid(argument)
    if not uid:
        return None
    return PROFILE_URL.format(uid=uid)


def fmt_time(raw):
    """把小红书毫秒时间戳或文本格式化为 YYYY-MM-DD。"""
    if raw is None:
        return None
    if isinstance(raw, (int, float)) and raw > 0:
        try:
            return datetime.datetime.fromtimestamp(raw / 1000).strftime("%Y-%m-%d")
        except (ValueError, OSError):
            return None
    s = str(raw)
    if s.isdigit() and len(s) >= 10:
        ms = int(s)
        if ms > 10 ** 12:
            ms = ms // 1000
        try:
            return datetime.datetime.fromtimestamp(ms).strftime("%Y-%m-%d")
        except (ValueError, OSError):
            return None
    return s


def fmt_count(raw):
    """把点赞/收藏等数字格式化为可读文本(1.2万 等)。"""
    if raw is None:
        return "0"
    try:
        n = int(raw)
    except (TypeError, ValueError):
        return str(raw)
    if n >= 10000:
        return "%.1f万" % (n / 10000.0)
    return str(n)


# ---------------------------------------------------------------------------
# 抓取与解析
# ---------------------------------------------------------------------------

def fetch_profile(url, cookie):
    headers = {
        "User-Agent": USER_AGENT,
        "Cookie": cookie,
        "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Accept-Language": "zh-CN,zh;q=0.9",
    }
    req = urllib.request.Request(url, headers=headers)
    with urllib.request.urlopen(req, timeout=30) as resp:
        return resp.read().decode("utf-8", errors="replace")


def extract_initial_state(html):
    m = re.search(
        r"window\.__INITIAL_STATE__\s*=\s*(.*?)(?=</script>)", html, re.S
    )
    if not m:
        return None
    return json.loads(m.group(1).strip())


def user_page_data(state):
    if not state:
        return None
    return (
        state.get("user", {}).get("userPageData")
        or state.get("user", {}).get("userPage")
    )


def summarize_user(u):
    if not u:
        return {}
    return {
        "nickname": u.get("nickname"),
        "xiaohongshuId": u.get("xiaohongshuId"),
        "desc": u.get("desc"),
        "gender": u.get("gender"),
        "avatar": u.get("avatar"),
        "verify": u.get("redOfficialVerifyName") or u.get("redOfficialVerifyType"),
        "industry": u.get("industry"),
        "location": u.get("location"),
        "ipLocation": u.get("ipLocation"),
        "followingCount": u.get("followingCount"),
        "fansCount": u.get("fansCount"),
        "interactionCount": u.get("interactionCount"),
        "notesCount": u.get("notesCount"),
        "tags": u.get("tags"),
    }


def summarize_notes(notes):
    out = []
    for n in notes or []:
        inter = n.get("interactInfo") or {}
        cover = n.get("cover") or {}
        out.append({
            "id": n.get("id"),
            "type": n.get("type"),
            "title": n.get("title"),
            "cover": cover.get("urlDefault") or cover.get("urlPre"),
            "likedCount": inter.get("likedCount"),
            "collectedCount": inter.get("collectedCount"),
            "commentCount": inter.get("commentCount"),
            "shareCount": inter.get("shareCount"),
            "time": fmt_time(n.get("time")),
            "xsecToken": n.get("xsecToken"),
        })
    return out


# ---------------------------------------------------------------------------
# 输出
# ---------------------------------------------------------------------------

def print_user(u):
    print("=" * 60)
    print("用户: %s  (%s)" % (u.get("nickname"), u.get("xiaohongshuId")))
    print("=" * 60)
    if u.get("verify"):
        print("认证: %s" % u["verify"])
    print("简介: %s" % (u.get("desc") or "-"))
    print("性别: %s    领域: %s" % (u.get("gender") or "-", u.get("industry") or "-"))
    print("所在地: %s    IP属地: %s" % (u.get("location") or "-", u.get("ipLocation") or "-"))
    print("关注: %s  粉丝: %s  获赞与收藏: %s  笔记数: %s" % (
        fmt_count(u.get("followingCount")),
        fmt_count(u.get("fansCount")),
        fmt_count(u.get("interactionCount")),
        fmt_count(u.get("notesCount")),
    ))
    if u.get("tags"):
        print("标签: %s" % "、".join(str(t) for t in u["tags"]))


def print_notes(notes):
    print("-" * 60)
    print("笔记列表(共 %d 条):" % len(notes))
    print("-" * 60)
    for i, n in enumerate(notes, 1):
        t = "视频" if n.get("type") == "video" else "图文"
        title = (n.get("title") or "").strip() or "(无标题)"
        if len(title) > 40:
            title = title[:40] + "..."
        print("[%2d] %s | %s | 赞 %s 藏 %s 评 %s | %s" % (
            i, t, title,
            fmt_count(n.get("likedCount")),
            fmt_count(n.get("collectedCount")),
            fmt_count(n.get("commentCount")),
            n.get("time") or "-",
        ))


# ---------------------------------------------------------------------------
# 主流程
# ---------------------------------------------------------------------------

def main(argv=None):
    parser = argparse.ArgumentParser(
        prog="query_xhs_user.py",
        description="获取小红书用户云端公开数据(资料 + 笔记列表)。"
    )
    parser.add_argument(
        "target",
        help="小红书用户主页链接(推荐, 含 xsec_token)或纯用户 ID",
    )
    parser.add_argument(
        "--cookie",
        default=os.environ.get("XHS_COOKIE", ""),
        help="小红书登录 Cookie(默认读取环境变量 XHS_COOKIE)",
    )
    parser.add_argument(
        "--json",
        metavar="FILE",
        help="把完整数据保存为 JSON 文件",
    )
    parser.add_argument(
        "--notes-only",
        action="store_true",
        help="只输出笔记列表, 不输出用户资料",
    )
    args = parser.parse_args(argv)

    url = build_profile_url(args.target)
    if not url:
        eprint("[错误] 无法从输入解析出用户 ID: %s" % args.target)
        return 2
    uid = resolve_uid(args.target)
    if not re.search(r"^https?://", args.target):
        eprint("[提示] 已按纯 ID 访问。若被风控, 建议改用带 xsec_token 的主页链接。")

    try:
        html = fetch_profile(url, args.cookie)
    except urllib.error.HTTPError as e:
        eprint("[错误] HTTP %s: %s" % (e.code, e.reason))
        eprint("提示: 需要浏览器登录后复制 Cookie 传入 --cookie 或环境变量 XHS_COOKIE。")
        return 3
    except Exception as e:
        eprint("[错误] 网络请求失败: %s" % e)
        return 3

    state = extract_initial_state(html)
    data = user_page_data(state)
    if data is None:
        eprint("[错误] 未解析到用户数据(可能未登录或链接缺少 xsec_token)。")
        eprint("提示: 请用浏览器打开该用户主页并复制完整链接(含 xsec_token)后重试。")
        return 4

    user = summarize_user(data.get("user"))
    notes = summarize_notes(data.get("notes"))

    if not args.notes_only:
        print_user(user)
    print_notes(notes)

    result = {
        "uid": uid,
        "user": user,
        "notes": notes,
        "cursor": data.get("cursor"),
        "source_url": url,
    }
    if args.json:
        with open(args.json, "w", encoding="utf-8") as f:
            json.dump(result, f, ensure_ascii=False, indent=2)
        eprint("已保存完整数据到: %s" % args.json)
    return 0


if __name__ == "__main__":
    try:
        sys.exit(main())
    except KeyboardInterrupt:
        eprint("\n已取消")
        sys.exit(130)
