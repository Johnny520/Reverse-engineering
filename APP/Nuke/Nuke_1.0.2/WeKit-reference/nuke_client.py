#!/usr/bin/env python3
"""Small, real Nuke backend client implemented with the Python standard library."""

from __future__ import annotations

import argparse
import base64
import json
import sys
from dataclasses import dataclass
from typing import Any, Mapping
from urllib.error import HTTPError, URLError
from urllib.parse import urlencode, urljoin
from urllib.request import Request, urlopen


DEFAULT_BASE_URL = "https://www.guang233.com/"
DEFAULT_VERSION_CODE = 234
APP_VERSION = "1.0.2"
NATIVE_GENERATION = "2026071502"
NATIVE_KID = "d8e39774"


class NukeApiError(RuntimeError):
    """Raised when transport, JSON, or response validation fails."""


@dataclass(frozen=True)
class JsonResponse:
    url: str
    status: int
    headers: Mapping[str, str]
    body: Mapping[str, Any]


class NukeClient:
    def __init__(self, base_url: str = DEFAULT_BASE_URL, timeout: float = 20.0) -> None:
        self.base_url = base_url.rstrip("/") + "/"
        self.timeout = timeout

    @property
    def users_url(self) -> str:
        return urljoin(self.base_url, "api/client/users")

    @property
    def report_url(self) -> str:
        return urljoin(self.base_url, "api/client/report")

    def update_url(self, version_code: int = DEFAULT_VERSION_CODE) -> str:
        query = urlencode({"versionCode": int(version_code)})
        return urljoin(self.base_url, "api/client/update") + "?" + query

    def native_manifest_url(self) -> str:
        return urljoin(self.base_url, "api/client/native/manifest")

    def native_package_url(self, release_id: str) -> str:
        return urljoin(
            self.base_url,
            "api/client/native/releases/" + release_id + "/package",
        )

    def check_update(self, version_code: int = DEFAULT_VERSION_CODE) -> JsonResponse:
        return self._get_json(self.update_url(version_code))

    def native_manifest(self, etag: str | None = None) -> JsonResponse:
        headers = {"If-None-Match": etag} if etag else None
        return self._get_json(self.native_manifest_url(), headers)

    def decode_update_data(self, response: JsonResponse) -> Mapping[str, Any]:
        if response.status != 200:
            raise NukeApiError(f"update endpoint returned HTTP {response.status}")
        if response.body.get("success") is not True:
            raise NukeApiError(f"update endpoint rejected request: {response.body!r}")
        encoded = response.body.get("data")
        if not isinstance(encoded, str) or not encoded:
            raise NukeApiError("update response has no Base64 data string")
        try:
            raw = base64.b64decode(encoded, validate=True)
            decoded = json.loads(raw.decode("utf-8"))
        except (ValueError, UnicodeDecodeError, json.JSONDecodeError) as error:
            raise NukeApiError(f"invalid update data: {error}") from error
        if not isinstance(decoded, dict):
            raise NukeApiError("decoded update data is not a JSON object")
        return decoded

    def _get_json(
        self,
        url: str,
        extra_headers: Mapping[str, str] | None = None,
    ) -> JsonResponse:
        headers = {
            "Accept": "application/json",
            "Cache-Control": "no-cache",
            "Pragma": "no-cache",
            "User-Agent": f"Nuke/{APP_VERSION} Android",
        }
        if extra_headers:
            headers.update(extra_headers)
        request = Request(url, headers=headers, method="GET")
        try:
            with urlopen(request, timeout=self.timeout) as response:
                status = response.status
                raw = response.read()
                response_headers = dict(response.headers.items())
        except HTTPError as error:
            status = error.code
            raw = error.read()
            response_headers = dict(error.headers.items())
        except (URLError, TimeoutError, OSError) as error:
            raise NukeApiError(f"request failed for {url}: {error}") from error
        try:
            body = json.loads(raw.decode("utf-8"))
        except (UnicodeDecodeError, json.JSONDecodeError) as error:
            preview = raw[:160].decode("utf-8", errors="replace")
            raise NukeApiError(
                f"backend returned invalid JSON at {url}: {preview!r}"
            ) from error
        if not isinstance(body, dict):
            raise NukeApiError(f"backend returned a non-object JSON value at {url}")
        return JsonResponse(url, status, response_headers, body)


def run_update_probe(client: NukeClient, version_code: int) -> dict[str, Any]:
    response = client.check_update(version_code)
    decoded = client.decode_update_data(response)
    current = decoded.get("currentVersionCode")
    if not isinstance(current, int):
        raise NukeApiError("decoded data has no integer currentVersionCode")
    if "hasUpdate" not in decoded or not isinstance(decoded["hasUpdate"], bool):
        raise NukeApiError("decoded data has no boolean hasUpdate")
    return {
        "ok": True,
        "endpoint": response.url,
        "httpStatus": response.status,
        "server": response.headers.get("Server", ""),
        "outerSuccess": response.body["success"],
        "decodedData": decoded,
    }


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(description="Call the real Nuke update API")
    parser.add_argument("--base-url", default=DEFAULT_BASE_URL)
    parser.add_argument("--version-code", type=int, default=DEFAULT_VERSION_CODE)
    parser.add_argument("--timeout", type=float, default=20.0)
    return parser.parse_args()


def main() -> int:
    args = parse_args()
    try:
        result = run_update_probe(
            NukeClient(base_url=args.base_url, timeout=args.timeout),
            args.version_code,
        )
    except NukeApiError as error:
        print(json.dumps({"ok": False, "error": str(error)}, ensure_ascii=False, indent=2))
        return 1
    print(json.dumps(result, ensure_ascii=False, indent=2, sort_keys=True))
    return 0


if __name__ == "__main__":
    sys.exit(main())
