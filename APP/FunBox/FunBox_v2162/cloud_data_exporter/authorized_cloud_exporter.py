#!/usr/bin/env python3
"""Authorized cloud-data exporter.

Uses a user-provided OAuth/API access token and provider-specific list/download
endpoints. Tokens are read only from environment variables and are never saved
in the output manifest.
"""
from __future__ import annotations

import argparse
import json
import os
import re
import sys
from pathlib import Path
from typing import Any
from urllib.error import HTTPError, URLError
from urllib.parse import quote, urljoin, urlparse
from urllib.request import Request, urlopen

SAFE_NAME = re.compile(r"[^A-Za-z0-9._ -]+")


def request_bytes(url: str, token: str | None, timeout: int, send_auth: bool) -> tuple[bytes, str]:
    headers = {"Accept": "application/json, application/octet-stream;q=0.9, */*;q=0.8", "User-Agent": "authorized-cloud-exporter/1.0"}
    if token and send_auth:
        headers["Authorization"] = f"Bearer {token}"
    req = Request(url, headers=headers, method="GET")
    with urlopen(req, timeout=timeout) as response:
        return response.read(), response.headers.get_content_type()


def normalize_items(payload: Any) -> list[dict[str, Any]]:
    if isinstance(payload, list):
        return [x for x in payload if isinstance(x, dict)]
    if isinstance(payload, dict):
        for key in ("items", "files", "data", "value", "results"):
            value = payload.get(key)
            if isinstance(value, list):
                return [x for x in value if isinstance(x, dict)]
    raise ValueError("列表接口应返回 JSON 数组，或包含 items/files/data/value/results 数组的 JSON 对象")


def record_id(item: dict[str, Any]) -> str | None:
    for key in ("id", "file_id", "uuid", "key"):
        if item.get(key) is not None:
            return str(item[key])
    return None


def record_name(item: dict[str, Any], fallback: str) -> str:
    raw = str(item.get("name") or item.get("filename") or item.get("title") or fallback)
    raw = SAFE_NAME.sub("_", raw).strip(". ")
    return raw or fallback


def absolute_url(base_url: str, value: str) -> str:
    return value if urlparse(value).scheme else urljoin(base_url.rstrip("/") + "/", value.lstrip("/"))


def parse_args() -> argparse.Namespace:
    p = argparse.ArgumentParser(description="使用 OAuth/API Token 导出已授权用户的云端文件清单和文件内容")
    p.add_argument("--base-url", required=True, help="云服务 API 根地址，例如 https://cloud.example.com")
    p.add_argument("--list-path", required=True, help="文件列表 API 路径，例如 /api/v1/files")
    p.add_argument("--download-template", help="按文件 ID 下载的路径模板，例如 /api/v1/files/{id}/content")
    p.add_argument("--token-env", default="CLOUD_ACCESS_TOKEN", help="保存访问令牌的环境变量名，默认 CLOUD_ACCESS_TOKEN")
    p.add_argument("--output", default="exported_cloud_data", help="导出目录")
    p.add_argument("--download", action="store_true", help="下载列表中的文件；未给出时只导出清单")
    p.add_argument("--limit", type=int, default=0, help="最多下载的文件数量；0 代表全部")
    p.add_argument("--timeout", type=int, default=30, help="HTTP 超时秒数")
    p.add_argument("--send-auth-to-download", action="store_true", help="向下载 URL 发送 Bearer Token；预签名外链通常无需开启")
    p.add_argument("--dry-run", action="store_true", help="只验证列表请求并显示计划，不写入文件")
    p.add_argument("--confirm-user-authorized", default="", help="必须填 YES，确认数据主体已完成授权")
    return p.parse_args()


def main() -> int:
    args = parse_args()
    if args.confirm_user_authorized != "YES":
        print("请在命令中加入 --confirm-user-authorized YES 后执行。", file=sys.stderr)
        return 2

    token = os.environ.get(args.token_env)
    if not token:
        print(f"环境变量 {args.token_env} 未设置。请使用用户 OAuth/API 流程取得短期访问令牌后再执行。", file=sys.stderr)
        return 2

    list_url = absolute_url(args.base_url, args.list_path)
    try:
        raw, _ = request_bytes(list_url, token, args.timeout, send_auth=True)
        items = normalize_items(json.loads(raw.decode("utf-8")))
    except (HTTPError, URLError, OSError, ValueError, json.JSONDecodeError) as exc:
        print(f"读取列表失败：{exc}", file=sys.stderr)
        return 1

    print(f"已读取 {len(items)} 条云端对象记录。")
    if args.dry_run:
        for item in items[:10]:
            print(f"- id={record_id(item)!r} name={record_name(item, 'unnamed')!r}")
        return 0

    out = Path(args.output)
    out.mkdir(parents=True, exist_ok=True)
    manifest = {"list_url": list_url, "item_count": len(items), "downloaded": [], "items": items}
    (out / "cloud_inventory.json").write_text(json.dumps(manifest, ensure_ascii=False, indent=2), encoding="utf-8")

    if not args.download:
        print(f"已写入文件清单：{out / 'cloud_inventory.json'}")
        return 0

    if not args.download_template and not any(item.get("download_url") or item.get("downloadUrl") for item in items):
        print("下载需要 --download-template，或列表对象内包含 download_url/downloadUrl。", file=sys.stderr)
        return 2

    files_dir = out / "files"
    files_dir.mkdir(exist_ok=True)
    selected = items if args.limit <= 0 else items[:args.limit]
    base_host = urlparse(args.base_url).netloc
    for index, item in enumerate(selected, 1):
        object_id = record_id(item)
        value = item.get("download_url") or item.get("downloadUrl")
        if not value:
            if not object_id:
                print(f"跳过第 {index} 条：缺少 id。")
                continue
            value = args.download_template.format(id=quote(object_id, safe=""))
        download_url = absolute_url(args.base_url, str(value))
        use_auth = args.send_auth_to_download and urlparse(download_url).netloc == base_host
        try:
            body, content_type = request_bytes(download_url, token, args.timeout, send_auth=use_auth)
        except (HTTPError, URLError, OSError) as exc:
            print(f"下载失败 [{object_id or index}]：{exc}", file=sys.stderr)
            continue
        filename = f"{index:04d}_{record_name(item, object_id or 'file')}"
        target = files_dir / filename
        target.write_bytes(body)
        manifest["downloaded"].append({"id": object_id, "name": filename, "url": download_url, "bytes": len(body), "content_type": content_type})
        print(f"已保存：{target} ({len(body)} bytes)")

    (out / "cloud_inventory.json").write_text(json.dumps(manifest, ensure_ascii=False, indent=2), encoding="utf-8")
    print(f"导出完成：{out}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
