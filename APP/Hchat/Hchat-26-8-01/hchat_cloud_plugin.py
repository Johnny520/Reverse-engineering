#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Hchat 云端插件获取工具（基于 Hchat alt-entry 插件市场协议）。

协议来源：Hchat-alt-entry-release-signed.apk 静态恢复源码
  - gb/AbstractC1378b.java（HTTP 客户端与端点）
  - gb/AbstractC1393q.java（插件 JSON 解析、installId 生成）
  - gb/AbstractC1387k.java（文件落盘、大小与 sha256 校验）
  - gb/C1383g.java（插件文件模型：utf8/base64）

默认服务地址：https://hchat.208.75.133.91.sslip.io
响应信封：{"ok": true, "data": {...}}；错误：{"ok": false, "error": {"message": ...}}
"""

import argparse
import base64
import hashlib
import json
import os
import sys
import urllib.error
import urllib.parse
import urllib.request
import uuid

DEFAULT_SERVICE = "https://hchat.208.75.133.91.sslip.io"
DEFAULT_PLUGIN_ROOT = os.path.join("Hchat", "脚本插件")
INSTALL_ID_FILE = ".hchat_install_id"
SUPPORTED_ENCODINGS = ("utf8", "base64")


def get_install_id(cache_path=INSTALL_ID_FILE):
    """读取或生成 X-Hchat-Install-Id（与应用端 SharedPreferences 同构）。"""
    try:
        if os.path.exists(cache_path):
            with open(cache_path, "r", encoding="utf-8") as fh:
                value = fh.read().strip()
            if value:
                return value
    except OSError:
        pass
    value = str(uuid.uuid4())
    try:
        with open(cache_path, "w", encoding="utf-8") as fh:
            fh.write(value + "\n")
    except OSError:
        pass
    return value


def request(service, path, method="GET", query=None, body=None,
            token=None, install_id=None, timeout=30):
    """发送请求并返回 data 字段（与应用端 m3751c 一致）。"""
    segments = []
    for segment in path:
        if not segment or segment in (".", ".."):
            raise ValueError("无效的路径段: %r" % segment)
        segments.append(urllib.parse.quote(str(segment), safe=""))
    url = service.rstrip("/") + "/" + "/".join(segments)
    if query:
        pairs = [(k, str(v)) for k, v in query.items() if v is not None and str(v) != ""]
        if pairs:
            url += "?" + urllib.parse.urlencode(pairs)

    headers = {
        "Accept": "application/json",
        "User-Agent": "Hchat-cloud-plugin-fetcher",
    }
    if install_id:
        headers["X-Hchat-Install-Id"] = install_id
    if token:
        headers["Authorization"] = "Bearer " + token

    data_bytes = None
    if method in ("POST", "DELETE") or body is not None:
        if body is None:
            body = {}
        data_bytes = json.dumps(body, ensure_ascii=False).encode("utf-8")
        headers["Content-Type"] = "application/json; charset=utf-8"

    req = urllib.request.Request(url, data=data_bytes, headers=headers, method=method)
    try:
        with urllib.request.urlopen(req, timeout=timeout) as resp:
            raw = resp.read().decode("utf-8")
            code = resp.getcode()
    except urllib.error.HTTPError as exc:
        raw = exc.read().decode("utf-8", "replace")
        code = exc.code
    except urllib.error.URLError as exc:
        raise RuntimeError("网络请求失败: %s" % exc.reason) from exc

    try:
        payload = json.loads(raw) if raw else {}
    except ValueError as exc:
        raise RuntimeError("插件仓库返回了无效 JSON (HTTP %s)" % code) from exc

    if not payload.get("ok") or code >= 400:
        error = payload.get("error") or {}
        if isinstance(error, dict):
            message = error.get("message") or json.dumps(error, ensure_ascii=False)
            err_code = error.get("code")
        else:
            message = str(error)
            err_code = None
        detail = " (code=%s)" % err_code if err_code else ""
        raise RuntimeError("插件仓库请求失败: HTTP %s%s: %s" % (code, detail, message))

    data = payload.get("data")
    return data if isinstance(data, dict) else {}


def parse_plugin(data):
    """解析插件详情，兼容 latestVersion/snapshot 两种版本结构。"""
    version_obj = data.get("latestVersion") or data.get("snapshot") or {}
    if not isinstance(version_obj, dict):
        version_obj = {}
    plugin_id = data.get("remotePluginId") or data.get("pluginId") or data.get("id") or ""
    name = data.get("displayName") or data.get("name") or ""
    author = data.get("author") or ""
    description = data.get("description") or data.get("summary") or ""
    version = version_obj.get("versionName") or data.get("version") or ""
    version_id = version_obj.get("versionId") or data.get("versionId") or ""
    created_at = version_obj.get("createdAt") or data.get("updatedAt") or data.get("updateTime") or ""
    files = data.get("files") or []
    if not isinstance(files, list):
        files = []
    return {
        "pluginId": plugin_id,
        "name": name,
        "author": author,
        "version": version,
        "versionId": version_id,
        "createdAt": created_at,
        "description": description,
        "downloadCount": data.get("downloadCount", 0),
        "likeCount": data.get("likeCount", 0),
        "commentCount": data.get("commentCount", 0),
        "files": files,
    }


def safe_file_name(name):
    """限制插件文件名为单一 basename，防止路径穿越。"""
    if not name:
        raise ValueError("插件文件名不能为空")
    base = os.path.basename(name.replace("\\", "/"))
    if base in ("", ".", ".."):
        raise ValueError("非法插件文件名: %r" % name)
    return base


def decode_file(file_obj):
    name = safe_file_name(file_obj.get("name", ""))
    content = file_obj.get("content") or file_obj.get("text") or ""
    encoding = str(file_obj.get("encoding") or "utf8").lower()
    if encoding not in SUPPORTED_ENCODINGS:
        raise ValueError("不支持的插件文件编码 %r: %s" % (encoding, name))
    if encoding == "base64":
        data = base64.b64decode(content, validate=False)
    else:
        data = content.encode("utf-8")
    return name, data


def verify_file(name, data, expected_size=None, expected_sha256=None, strict=True):
    if expected_size is not None and expected_size >= 0 and len(data) != expected_size:
        raise ValueError("%s 文件大小校验失败 (期望 %s, 实际 %s)"
                         % (name, expected_size, len(data)))
    if strict and expected_sha256:
        actual = hashlib.sha256(data).hexdigest().lower()
        if actual != expected_sha256.lower():
            raise ValueError("%s sha256 校验失败 (期望 %s, 实际 %s)"
                             % (name, expected_sha256.lower(), actual))


def write_plugin(plugin, target_dir, require_main=True, strict=True):
    """把插件 files 写入 target_dir，并返回落盘清单。"""
    files = plugin.get("files") or []
    seen = set()
    written = []
    for file_obj in files:
        name, data = decode_file(file_obj)
        if name in seen:
            raise ValueError("插件包含重复文件: %s" % name)
        seen.add(name)
        if name == "main.java":
            if not data.strip():
                raise ValueError("main.java 内容为空")
        elif name != "main.java" and require_main and name not in ("info.prop", "README.md", "main.java.bshs"):
            continue
        verify_file(name, data,
                    expected_size=file_obj.get("size"),
                    expected_sha256=file_obj.get("sha256"),
                    strict=strict)
        target = os.path.join(target_dir, name)
        os.makedirs(os.path.dirname(target), exist_ok=True)
        with open(target, "wb") as fh:
            fh.write(data)
        written.append(name)
    if require_main and "main.java" not in seen:
        raise ValueError("插件缺少 main.java")
    manifest = dict(plugin)
    manifest["files"] = [{"name": name, "sha256": hashlib.sha256(
        open(os.path.join(target_dir, name), "rb").read()).hexdigest()} for name in written]
    with open(os.path.join(target_dir, "plugin.json"), "w", encoding="utf-8") as fh:
        json.dump(manifest, fh, ensure_ascii=False, indent=2)
    return written


def fetch_plugin(service, plugin_id, version_id=None, token=None, install_id=None, timeout=30):
    path = ["v1", "plugins", plugin_id]
    if version_id:
        path += ["snapshots", version_id]
    data = request(service, path, method="GET",
                   token=token, install_id=install_id, timeout=timeout)
    return parse_plugin(data)


def main():
    parser = argparse.ArgumentParser(
        description="Hchat 云端插件获取工具（脚本插件市场客户端）")
    parser.add_argument("--service", default=DEFAULT_SERVICE,
                        help="插件市场服务地址，默认 %s" % DEFAULT_SERVICE)
    parser.add_argument("--token", default=None, help="作者 ownerToken（Bearer 认证，可选）")
    parser.add_argument("--install-id", default=None,
                        help="X-Hchat-Install-Id；缺省时读取/生成 .hchat_install_id")
    parser.add_argument("--timeout", type=float, default=30.0, help="请求超时秒数")
    sub = parser.add_subparsers(dest="command", required=True)

    p_list = sub.add_parser("list", help="列出云端插件（市场列表）")
    p_list.add_argument("--limit", type=int, default=20, help="每页数量，默认 20")
    p_list.add_argument("--offset", type=int, default=0, help="偏移量，默认 0")
    p_list.add_argument("--keyword", default=None, help="关键字筛选（可选）")
    p_list.add_argument("--sort", default=None, help="排序字段（可选）")
    p_list.add_argument("--timeout", type=float, default=None, help="请求超时秒数")

    p_info = sub.add_parser("info", help="查询插件详情（不下发文件）")
    p_info.add_argument("plugin_id", help="远程插件 ID")
    p_info.add_argument("--version-id", default=None, help="历史版本 ID（snapshot）")
    p_info.add_argument("--timeout", type=float, default=None, help="请求超时秒数")

    p_dl = sub.add_parser("download", help="下载云端插件到本地目录")
    p_dl.add_argument("plugin_id", help="远程插件 ID")
    p_dl.add_argument("--version-id", default=None, help="历史版本 ID（snapshot）")
    p_dl.add_argument("--out", default=None, help="输出根目录，默认 ./Hchat/脚本插件")
    p_dl.add_argument("--no-verify", action="store_true", help="跳过 sha256 严格校验")
    p_dl.add_argument("--timeout", type=float, default=None, help="请求超时秒数")

    p_cm = sub.add_parser("comments", help="读取插件评论列表")
    p_cm.add_argument("plugin_id")
    p_cm.add_argument("--limit", type=int, default=100)
    p_cm.add_argument("--user-wxid", default=None)
    p_cm.add_argument("--timeout", type=float, default=None, help="请求超时秒数")

    p_lk = sub.add_parser("likes", help="读取插件点赞状态")
    p_lk.add_argument("plugin_id")
    p_lk.add_argument("--user-wxid", default=None)
    p_lk.add_argument("--timeout", type=float, default=None, help="请求超时秒数")

    p_ev = sub.add_parser("download-event", help="上报下载事件并返回下载量")
    p_ev.add_argument("plugin_id")
    p_ev.add_argument("--version-id", required=True, help="插件版本 ID")
    p_ev.add_argument("--event-id", default=None, help="下载事件 ID，缺省自动生成")
    p_ev.add_argument("--timeout", type=float, default=None, help="请求超时秒数")

    args = parser.parse_args()
    timeout = args.timeout if getattr(args, "timeout", None) else 30.0
    install_id = args.install_id or get_install_id()
    common = dict(token=args.token, install_id=install_id, timeout=timeout)

    if args.command == "info":
        plugin = fetch_plugin(args.service, args.plugin_id, args.version_id,
                              token=args.token, install_id=install_id, timeout=timeout)
        print(json.dumps(plugin, ensure_ascii=False, indent=2))
        return

    if args.command == "list":
        data = request(args.service, ["v1", "plugins"],
                       query={"limit": args.limit, "offset": args.offset,
                              "keyword": args.keyword, "sort": args.sort}, **common)
        items = []
        for item in data.get("items") or []:
            latest = item.get("latestVersion") or {}
            items.append({
                "pluginId": item.get("pluginId"),
                "name": item.get("displayName") or item.get("name"),
                "author": item.get("author"),
                "version": latest.get("versionName"),
                "versionId": latest.get("versionId"),
                "reviewStatus": latest.get("reviewStatus"),
                "downloadCount": item.get("downloadCount"),
                "likeCount": item.get("likeCount"),
                "commentCount": item.get("commentCount"),
                "updatedAt": item.get("updatedAt"),
            })
        print(json.dumps({"total": data.get("total", len(items)), "items": items},
                         ensure_ascii=False, indent=2))
        return

    if args.command == "download":
        plugin = fetch_plugin(args.service, args.plugin_id, args.version_id,
                              token=args.token, install_id=install_id, timeout=timeout)
        root = args.out or DEFAULT_PLUGIN_ROOT
        base = plugin["name"] or plugin["pluginId"]
        target = os.path.join(root, base)
        written = write_plugin(plugin, target, strict=not args.no_verify)
        print("插件: %s v%s (ID=%s, 作者=%s)"
              % (plugin["name"], plugin["version"], plugin["pluginId"], plugin["author"]))
        print("目录: %s" % os.path.abspath(target))
        print("文件: %s" % ", ".join(written))
        print("说明: 把该目录放进 Hchat/脚本插件/ 后，在模块设置中开启即可使用")
        return

    if args.command == "comments":
        data = request(args.service, ["v1", "plugins", args.plugin_id, "comments"],
                       query={"limit": args.limit, "userWxId": args.user_wxid}, **common)
        print(json.dumps({"total": data.get("total", 0), "items": data.get("items", [])},
                         ensure_ascii=False, indent=2))
        return

    if args.command == "likes":
        data = request(args.service, ["v1", "plugins", args.plugin_id, "likes"],
                       query={"userWxId": args.user_wxid}, **common)
        print(json.dumps(data, ensure_ascii=False, indent=2))
        return

    if args.command == "download-event":
        event_id = args.event_id or str(uuid.uuid4())
        data = request(args.service, ["v1", "plugins", args.plugin_id, "downloads"],
                       method="POST", body={"versionId": args.version_id, "eventId": event_id}, **common)
        print(json.dumps(data, ensure_ascii=False, indent=2))
        return


if __name__ == "__main__":
    try:
        main()
    except Exception as exc:  # noqa: BLE001 - CLI 需要统一错误出口
        print("错误: %s" % exc, file=sys.stderr)
        sys.exit(1)
