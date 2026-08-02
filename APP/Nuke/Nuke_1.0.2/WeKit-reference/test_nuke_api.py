#!/usr/bin/env python3
"""Live acceptance test for the Nuke backend update endpoint."""

from __future__ import annotations

import argparse
import json
import sys

from nuke_client import (
    DEFAULT_BASE_URL,
    DEFAULT_VERSION_CODE,
    NukeApiError,
    NukeClient,
    run_update_probe,
)


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(description="Run the live Nuke API check")
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
