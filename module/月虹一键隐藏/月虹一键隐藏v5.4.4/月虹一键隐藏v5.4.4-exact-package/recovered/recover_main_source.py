#!/usr/bin/env python3
"""Export all locally recoverable source material from the unpacked main ELF."""

from __future__ import annotations

import base64
import csv
import hashlib
import json
import re
from bisect import bisect_right
from pathlib import Path

from capstone import CS_ARCH_ARM64, CS_MODE_ARM, Cs
from capstone.arm64 import ARM64_OP_IMM, ARM64_OP_REG
from elftools.dwarf.callframe import FDE
from elftools.elf.elffile import ELFFile


HERE = Path(__file__).resolve().parent
WORKSPACE = HERE.parents[1]
ANALYSIS = WORKSPACE / "月虹一键隐藏v5.4.4-analysis"
ELF_PATH = ANALYSIS / "main.unpacked"
STRINGS_PATH = (
    HERE / "decrypted_strings.complete.tsv"
    if (HERE / "decrypted_strings.complete.tsv").exists()
    else HERE / "decrypted_strings.tsv"
)


def sha256(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for block in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(block)
    return digest.hexdigest().upper()


def c_string(value: str) -> str:
    return json.dumps(value, ensure_ascii=False)


def unescape_text(value: str) -> str:
    if len(value) >= 2 and value[0] == value[-1] == '"':
        value = value[1:-1]
    return (
        value.replace("\\r\\n", "\n")
        .replace("\\n", "\n")
        .replace("\\r", "\n")
        .replace("\\t", "\t")
        .replace('\\"', '"')
    )


def load_decrypted_strings() -> list[dict[str, object]]:
    rows: list[dict[str, object]] = []
    with STRINGS_PATH.open("r", encoding="utf-8", newline="") as stream:
        for row in csv.DictReader(stream, delimiter="\t"):
            rows.append(
                {
                    "decrypt_function": int(row["function"], 16),
                    "decrypt_callsite": int(row["callsite"], 16),
                    "destination": int(row["destination"], 16),
                    "source": int(row["source"], 16),
                    "key_len": int(row["key_len"]),
                    "output_len": int(row["output_len"]),
                    "text": row["text"],
                }
            )
    return rows


def load_elf_metadata():
    stream = ELF_PATH.open("rb")
    elf = ELFFile(stream)
    text_section = elf.get_section_by_name(".text")
    if text_section is None:
        raise RuntimeError("ELF has no .text section")

    function_ranges: set[tuple[int, int]] = set()
    dwarf = elf.get_dwarf_info()
    for entry in dwarf.EH_CFI_entries():
        if not isinstance(entry, FDE):
            continue
        start = int(entry["initial_location"])
        size = int(entry["address_range"])
        if size > 0:
            function_ranges.add((start, start + size))

    relocations = elf.get_section_by_name(".rela.plt")
    dynsym = elf.get_section_by_name(".dynsym")
    plt = elf.get_section_by_name(".plt")
    plt_names: dict[int, str] = {}
    if relocations is not None and dynsym is not None and plt is not None:
        plt_base = int(plt["sh_addr"])
        for index, relocation in enumerate(relocations.iter_relocations()):
            symbol_index = int(relocation["r_info_sym"])
            symbol = dynsym.get_symbol(symbol_index)
            plt_names[plt_base + 0x20 + index * 0x10] = symbol.name

    return stream, elf, text_section, sorted(function_ranges), plt_names


def containing_function(address: int, starts: list[int], ends: dict[int, int]) -> int | None:
    index = bisect_right(starts, address) - 1
    while index >= 0:
        start = starts[index]
        if address < ends[start]:
            return start
        if start + 0x10000 < address:
            break
        index -= 1
    return None


def export_strings(rows: list[dict[str, object]]) -> None:
    header = HERE / "main.decrypted_strings.h"
    with header.open("w", encoding="utf-8", newline="\n") as output:
        output.write("#pragma once\n#include <stddef.h>\n#include <stdint.h>\n\n")
        output.write("typedef struct { uintptr_t address; const char *text; } yh_decrypted_string;\n\n")
        output.write("static const yh_decrypted_string YH_DECRYPTED_STRINGS[] = {\n")
        for row in rows:
            output.write(
                f"    {{ UINT64_C(0x{row['destination']:X}), {c_string(str(row['text']))} }},\n"
            )
        output.write("};\n")
        output.write(
            "static const size_t YH_DECRYPTED_STRING_COUNT = "
            "sizeof(YH_DECRYPTED_STRINGS) / sizeof(YH_DECRYPTED_STRINGS[0]);\n"
        )


def extract_embedded_sources(rows: list[dict[str, object]]) -> list[Path]:
    source_dir = HERE / "embedded_sources"
    fragment_dir = HERE / "source_fragments"
    source_dir.mkdir(exist_ok=True)
    fragment_dir.mkdir(exist_ok=True)
    written: list[Path] = []

    for row in rows:
        destination = int(row["destination"])
        raw = str(row["text"])
        decoded_text = unescape_text(raw)

        if len(decoded_text) >= 80 and (
            "#!/system/bin/sh" in decoded_text
            or "CONFIG_FILE=" in decoded_text
            or "NEW_CONFIG=" in decoded_text
            or "awk " in decoded_text
        ):
            suffix = ".sh" if "#!/system/bin/sh" in decoded_text else ".txt"
            path = fragment_dir / f"decrypted_0x{destination:X}{suffix}"
            path.write_text(decoded_text, encoding="utf-8", newline="\n")
            written.append(path)

        compact = raw.strip().strip('"')
        if len(compact) < 128 or len(compact) % 4 != 0:
            continue
        if re.fullmatch(r"[A-Za-z0-9+/]+={0,2}", compact) is None:
            continue
        try:
            decoded = base64.b64decode(compact, validate=True)
        except (ValueError, base64.binascii.Error):
            continue
        printable = sum(byte in b"\t\n\r" or 0x20 <= byte <= 0x7E or byte >= 0x80 for byte in decoded)
        if not decoded or printable / len(decoded) < 0.90:
            continue
        suffix = ".sh" if decoded.startswith((b"#!/bin/sh", b"#!/system/bin/sh")) else ".txt"
        path = source_dir / f"base64_0x{destination:X}{suffix}"
        path.write_bytes(decoded)
        written.append(path)

    bootloader = ANALYSIS / "embedded_payload_2B817.sh"
    if bootloader.exists():
        destination = source_dir / "bootloader_probe.sh"
        destination.write_bytes(bootloader.read_bytes())
        written.append(destination)
    return written


def export_disassembly(
    text_section,
    function_ranges: list[tuple[int, int]],
    plt_names: dict[int, str],
    rows: list[dict[str, object]],
) -> tuple[int, int, int]:
    text_address = int(text_section["sh_addr"])
    text_data = text_section.data()
    starts = [start for start, _ in function_ranges]
    ends = {start: end for start, end in function_ranges}
    labels = {start: f"FUN_{start:016X}" for start in starts}
    labels.update({address: f"PLT_{name}" for address, name in plt_names.items()})
    string_by_destination = {int(row["destination"]): str(row["text"]) for row in rows}
    decrypt_by_function: dict[int, list[dict[str, object]]] = {}
    for row in rows:
        decrypt_by_function.setdefault(int(row["decrypt_function"]), []).append(row)

    disassembler = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    disassembler.detail = True
    asm_path = HERE / "main.full.aarch64.asm"
    call_path = HERE / "main.calls.tsv"
    reference_path = HERE / "main.data_references.tsv"
    call_count = 0
    reference_count = 0
    instruction_count = 0
    known_registers: dict[int, int] = {}

    with (
        asm_path.open("w", encoding="utf-8", newline="\n") as assembly,
        call_path.open("w", encoding="utf-8", newline="\n") as calls,
        reference_path.open("w", encoding="utf-8", newline="\n") as references,
    ):
        call_writer = csv.writer(calls, delimiter="\t", lineterminator="\n")
        reference_writer = csv.writer(references, delimiter="\t", lineterminator="\n")
        assembly.write("; Full AArch64 disassembly of main.unpacked\n")
        assembly.write(f"; ELF SHA-256: {sha256(ELF_PATH)}\n")
        assembly.write(f"; .text address: 0x{text_address:X}, size: 0x{len(text_data):X}\n\n")
        call_writer.writerow(["caller", "callsite", "target", "target_name", "note"])
        reference_writer.writerow(["function", "instruction", "address", "text"])

        for instruction in disassembler.disasm(text_data, text_address):
            instruction_count += 1
            address = instruction.address
            if address in labels:
                assembly.write(f"\n{labels[address]}:\n")
                if address in ends:
                    assembly.write(f"; range 0x{address:X}-0x{ends[address]:X}\n")
                    known_registers.clear()

            comments: list[str] = []
            operands = instruction.operands
            mnemonic = instruction.mnemonic
            caller = containing_function(address, starts, ends)

            if mnemonic in {"bl", "b"} and operands and operands[0].type == ARM64_OP_IMM:
                target = int(operands[0].imm)
                target_name = labels.get(target, f"0x{target:X}")
                comments.append(target_name)
                if mnemonic == "bl":
                    notes: list[str] = []
                    if target in decrypt_by_function:
                        for row in decrypt_by_function[target]:
                            notes.append(
                                f"decrypt 0x{int(row['destination']):X}={str(row['text'])!r}"
                            )
                    call_writer.writerow(
                        [
                            "" if caller is None else f"0x{caller:X}",
                            f"0x{address:X}",
                            f"0x{target:X}",
                            target_name,
                            " | ".join(notes),
                        ]
                    )
                    call_count += 1
                    known_registers.clear()

            computed_reference: int | None = None
            if mnemonic in {"adr", "adrp"} and len(operands) >= 2:
                if operands[0].type == ARM64_OP_REG and operands[1].type == ARM64_OP_IMM:
                    known_registers[int(operands[0].reg)] = int(operands[1].imm)
            elif mnemonic == "add" and len(operands) >= 3:
                if (
                    operands[0].type == ARM64_OP_REG
                    and operands[1].type == ARM64_OP_REG
                    and operands[2].type == ARM64_OP_IMM
                ):
                    source_register = int(operands[1].reg)
                    if source_register in known_registers:
                        computed_reference = known_registers[source_register] + int(operands[2].imm)
                        known_registers[int(operands[0].reg)] = computed_reference
            else:
                try:
                    _, written_registers = instruction.regs_access()
                except Exception:
                    written_registers = []
                for register in written_registers:
                    known_registers.pop(int(register), None)

            if computed_reference in string_by_destination:
                text = string_by_destination[computed_reference]
                comments.append(f"string 0x{computed_reference:X}={text!r}")
                reference_writer.writerow(
                    [
                        "" if caller is None else f"0x{caller:X}",
                        f"0x{address:X}",
                        f"0x{computed_reference:X}",
                        text,
                    ]
                )
                reference_count += 1

            raw_bytes = instruction.bytes.hex(" ")
            rendered = f"{address:016X}:  {raw_bytes:<11}  {mnemonic:<9} {instruction.op_str}"
            if comments:
                rendered += "  ; " + " | ".join(comments)
            assembly.write(rendered.rstrip() + "\n")

    function_path = HERE / "main.functions.tsv"
    with function_path.open("w", encoding="utf-8", newline="\n") as output:
        output.write("start\tend\tsize\tname\n")
        for start, end in function_ranges:
            output.write(f"0x{start:X}\t0x{end:X}\t0x{end - start:X}\t{labels[start]}\n")

    return instruction_count, call_count, reference_count


def main() -> None:
    rows = load_decrypted_strings()
    export_strings(rows)
    extracted = extract_embedded_sources(rows)
    stream, _elf, text_section, function_ranges, plt_names = load_elf_metadata()
    try:
        instruction_count, call_count, reference_count = export_disassembly(
            text_section, function_ranges, plt_names, rows
        )
    finally:
        stream.close()

    index = HERE / "RECOVERY_INDEX.md"
    index.write_text(
        "\n".join(
            [
                "# main 全量本地恢复索引",
                "",
                f"- 原始脱壳 ELF：`{ELF_PATH}`",
                f"- SHA-256：`{sha256(ELF_PATH)}`",
                f"- 函数范围：`{len(function_ranges)}`",
                f"- AArch64 指令：`{instruction_count}`",
                f"- 直接调用：`{call_count}`",
                f"- 已回填字符串引用：`{reference_count}`",
                f"- 已解密字符串：`{len(rows)}`",
                f"- 拆出的嵌入源码：`{len(extracted)}`",
                "",
                "## 文件",
                "",
                "- `main.full.aarch64.asm`：整个 `.text` 段的逐指令反汇编",
                "- `main.functions.tsv`：来自 `.eh_frame` 的全部函数范围",
                "- `main.calls.tsv`：直接调用关系与解密调用注释",
                "- `main.data_references.tsv`：已恢复字符串的数据引用",
                "- `main.decrypted_strings.h`：可由 C/C++ 引用的完整字符串地址表",
                "- `embedded_sources/`：解出的完整嵌入脚本",
                "- `source_fragments/`：解出的长 Shell/配置源码片段",
                "- `webroot.decoded.html`：完整解密 WebUI",
                "",
            ]
        ),
        encoding="utf-8",
        newline="\n",
    )
    print(index)
    print(f"functions={len(function_ranges)} instructions={instruction_count} calls={call_count}")
    print(f"strings={len(rows)} references={reference_count} embedded={len(extracted)}")


if __name__ == "__main__":
    main()
