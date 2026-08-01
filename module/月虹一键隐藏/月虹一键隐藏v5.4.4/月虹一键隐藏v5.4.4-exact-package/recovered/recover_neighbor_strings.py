#!/usr/bin/env python3
"""Recover unresolved TUSI strings by constrained searches between known blobs."""

from __future__ import annotations

import csv
import json
import unicodedata
from dataclasses import dataclass
from pathlib import Path


HERE = Path(__file__).resolve().parent
WORKSPACE = HERE.parents[1]
ELF_PATH = WORKSPACE / "月虹一键隐藏v5.4.4-analysis" / "main.unpacked"
DECRYPTED_PATH = HERE / "decrypted_strings.tsv"
UNRESOLVED_PATH = HERE / "unresolved_decrypt_calls.tsv"
OUTPUT_PATH = HERE / "decrypted_strings_neighbor_candidates.tsv"
COMPLETE_PATH = HERE / "decrypted_strings.complete.tsv"
SUMMARY_PATH = HERE / "neighbor_recovery_summary.json"
RODATA_START = 0x2A520
RODATA_END = 0x5EE4C


@dataclass(frozen=True)
class Spec:
    function: int
    callsite: int
    destination: int
    key_len: int
    output_len: int

    @property
    def blob_len(self) -> int:
        return self.key_len + self.output_len


@dataclass(frozen=True)
class Candidate:
    source: int
    text: str
    score: float


def decrypt(image: bytes, source: int, key_len: int, output_len: int) -> bytes:
    encoded = image[source : source + key_len + output_len]
    if len(encoded) != key_len + output_len:
        return b""
    key = encoded[:key_len]
    ciphertext = encoded[key_len:]
    output = bytearray()
    previous = 0
    for index, value in enumerate(ciphertext):
        output.append(value ^ key[index % key_len] ^ previous)
        previous = value
    return bytes(output)


def text_score(text: str) -> float:
    if not text:
        return 1.0
    score = 100.0 + min(len(text), 200) * 0.1
    common = set(" /._-=,:;[]{}()<>!?+*'\"\\\n\r\t")
    for character in text:
        category = unicodedata.category(character)
        if category.startswith(("L", "N")) or character in common:
            score += 1.0
        elif category.startswith(("P", "S", "Z")):
            score += 0.3
        else:
            score -= 5.0
    for token in ("/data/", "http", "--", "=", ".", "Root", "SUS", "BL", "模块", "配置"):
        if token in text:
            score += 2.0
    return score


def candidates_for(image: bytes, spec: Spec, low: int, high: int) -> list[Candidate]:
    candidates: list[Candidate] = []
    last_source = min(high, RODATA_END) - spec.blob_len
    for source in range(max(low, RODATA_START), last_source + 1):
        raw = decrypt(image, source, spec.key_len, spec.output_len)
        if not raw or raw[-1] != 0:
            continue
        try:
            text = raw[:-1].decode("utf-8")
        except UnicodeDecodeError:
            continue
        if any(not (character.isprintable() or character in "\t\r\n") for character in text):
            continue
        candidates.append(Candidate(source, text, text_score(text)))
    return candidates


def load_inputs():
    with DECRYPTED_PATH.open("r", encoding="utf-8", newline="") as stream:
        decrypted = list(csv.DictReader(stream, delimiter="\t"))
    with UNRESOLVED_PATH.open("r", encoding="utf-8", newline="") as stream:
        unresolved = list(csv.DictReader(stream, delimiter="\t"))

    known_pairs = {(row["function"], row["destination"]) for row in decrypted}
    unique: dict[tuple[int, int], Spec] = {}
    for row in unresolved:
        if not row["destination"] or (row["function"], row["destination"]) in known_pairs:
            continue
        key = (int(row["function"], 16), int(row["destination"], 16))
        unique.setdefault(
            key,
            Spec(
                function=key[0],
                callsite=int(row["callsite"], 16),
                destination=key[1],
                key_len=int(row["key_len"]),
                output_len=int(row["output_len"]),
            ),
        )

    known_by_destination: dict[int, tuple[int, int]] = {}
    for row in decrypted:
        destination = int(row["destination"], 16)
        known_by_destination.setdefault(
            destination,
            (
                int(row["source"], 16),
                int(row["key_len"]) + int(row["output_len"]),
            ),
        )
    return decrypted, sorted(unique.values(), key=lambda item: item.destination), known_by_destination


def build_groups(specs: list[Spec], known: dict[int, tuple[int, int]]):
    destinations = sorted(set(known) | {spec.destination for spec in specs})
    specs_by_destination = {spec.destination: spec for spec in specs}
    groups: list[tuple[int, int, list[Spec]]] = []
    pending: list[Spec] = []
    low = RODATA_START

    for destination in destinations:
        if destination in known:
            source, blob_len = known[destination]
            if pending:
                groups.append((low, source, pending))
                pending = []
            low = source + blob_len
        elif destination in specs_by_destination:
            pending.append(specs_by_destination[destination])
    if pending:
        groups.append((low, RODATA_END, pending))
    return groups


def solve_group(image: bytes, low: int, high: int, specs: list[Spec]):
    candidate_lists = [candidates_for(image, spec, low, high) for spec in specs]
    states: list[tuple[float, int, list[Candidate]]] = [(0.0, low, [])]
    for spec, candidates in zip(specs, candidate_lists):
        next_states: list[tuple[float, int, list[Candidate]]] = []
        for total, minimum_source, chosen in states:
            for candidate in candidates:
                if candidate.source < minimum_source:
                    continue
                next_states.append(
                    (
                        total + candidate.score,
                        candidate.source + spec.blob_len,
                        chosen + [candidate],
                    )
                )
        next_states.sort(key=lambda item: item[0], reverse=True)
        states = next_states[:2000]
        if not states:
            break
    if not states:
        return None, candidate_lists, 0.0
    margin = states[0][0] - states[1][0] if len(states) > 1 else states[0][0]
    return states[0][2], candidate_lists, margin


def main() -> None:
    image = ELF_PATH.read_bytes()
    _decrypted, specs, known = load_inputs()
    groups = build_groups(specs, known)
    recovered: list[tuple[Spec, Candidate, int, str]] = []
    unsolved = 0

    for low, high, group_specs in groups:
        chosen, candidate_lists, margin = solve_group(image, low, high, group_specs)
        if chosen is None:
            unsolved += len(group_specs)
            continue
        for index, (spec, candidate) in enumerate(zip(group_specs, chosen)):
            compatible_count = len(candidate_lists[index])
            confidence = "high" if compatible_count == 1 or margin >= 5.0 else "medium"
            if (
                spec.function == 0x1E9FFC
                and spec.destination == 0x2B2C2C
                and candidate.text == "): "
            ):
                confidence = "high-context-verified"
            recovered.append((spec, candidate, compatible_count, confidence))

    with OUTPUT_PATH.open("w", encoding="utf-8", newline="") as stream:
        writer = csv.writer(stream, delimiter="\t", lineterminator="\n")
        writer.writerow(
            [
                "function",
                "callsite",
                "destination",
                "source",
                "key_len",
                "output_len",
                "candidate_count",
                "confidence",
                "text",
            ]
        )
        for spec, candidate, candidate_count, confidence in recovered:
            writer.writerow(
                [
                    f"0x{spec.function:X}",
                    f"0x{spec.callsite:X}",
                    f"0x{spec.destination:X}",
                    f"0x{candidate.source:X}",
                    spec.key_len,
                    spec.output_len,
                    candidate_count,
                    confidence,
                    candidate.text,
                ]
            )

    with DECRYPTED_PATH.open("r", encoding="utf-8", newline="") as stream:
        static_rows = list(csv.DictReader(stream, delimiter="\t"))
    complete_rows: list[dict[str, object]] = []
    for row in static_rows:
        complete_rows.append(
            {
                **row,
                "recovery_method": "constant-propagation",
                "confidence": "high",
            }
        )
    for spec, candidate, _candidate_count, confidence in recovered:
        complete_rows.append(
            {
                "function": f"0x{spec.function:X}",
                "callsite": f"0x{spec.callsite:X}",
                "destination": f"0x{spec.destination:X}",
                "source": f"0x{candidate.source:X}",
                "key_len": spec.key_len,
                "output_len": spec.output_len,
                "printable_score": "1.000",
                "text": candidate.text,
                "recovery_method": "neighbor-constrained-search",
                "confidence": confidence,
            }
        )
    complete_rows.sort(
        key=lambda row: (
            int(str(row["destination"]), 16),
            int(str(row["function"]), 16),
            int(str(row["source"]), 16),
        )
    )
    complete_fields = [
        "function",
        "callsite",
        "destination",
        "source",
        "key_len",
        "output_len",
        "printable_score",
        "text",
        "recovery_method",
        "confidence",
    ]
    with COMPLETE_PATH.open("w", encoding="utf-8", newline="") as stream:
        writer = csv.DictWriter(
            stream,
            fieldnames=complete_fields,
            delimiter="\t",
            lineterminator="\n",
        )
        writer.writeheader()
        writer.writerows(complete_rows)

    unresolved_pairs = {
        (int(row["function"], 16), int(row["destination"], 16))
        for row in csv.DictReader(
            UNRESOLVED_PATH.open("r", encoding="utf-8", newline=""), delimiter="\t"
        )
        if row["destination"]
    }
    complete_pairs = {
        (int(str(row["function"]), 16), int(str(row["destination"]), 16))
        for row in complete_rows
    }
    summary = {
        "missing_unique_pairs": len(specs),
        "groups": len(groups),
        "candidate_recoveries": len(recovered),
        "high_confidence": sum(row[3].startswith("high") for row in recovered),
        "medium_confidence": sum(row[3] == "medium" for row in recovered),
        "unsolved": unsolved,
        "complete_rows": len(complete_rows),
        "unresolved_unique_pairs_after_merge": len(unresolved_pairs - complete_pairs),
        "output": str(OUTPUT_PATH),
        "complete_output": str(COMPLETE_PATH),
    }
    SUMMARY_PATH.write_text(
        json.dumps(summary, ensure_ascii=False, indent=2) + "\n",
        encoding="utf-8",
        newline="\n",
    )
    print(json.dumps(summary, ensure_ascii=False, indent=2))


if __name__ == "__main__":
    main()
