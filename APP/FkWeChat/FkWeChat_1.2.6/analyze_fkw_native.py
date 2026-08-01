"""Static ELF inventory for libfkw.so. It never loads or executes the target."""

from __future__ import annotations

import csv
import sys
from pathlib import Path

from elftools.elf.elffile import ELFFile


def ascii_strings(blob: bytes, min_length: int = 4):
    start = None
    for index, value in enumerate(blob):
        if 0x20 <= value <= 0x7E:
            if start is None:
                start = index
        else:
            if start is not None and index - start >= min_length:
                yield start, blob[start:index].decode("ascii", errors="replace")
            start = None
    if start is not None and len(blob) - start >= min_length:
        yield start, blob[start:].decode("ascii", errors="replace")


def utf8_null_strings(blob: bytes, min_length: int = 2):
    """Decode NUL-delimited UTF-8 literals while retaining their file offsets."""
    offset = 0
    for piece in blob.split(b"\0"):
        try:
            value = piece.decode("utf-8")
        except UnicodeDecodeError:
            offset += len(piece) + 1
            continue
        printable = sum(char.isprintable() for char in value)
        if len(value) >= min_length and printable == len(value):
            yield offset, value
        offset += len(piece) + 1


def main() -> int:
    if len(sys.argv) != 3:
        print("usage: analyze_fkw_native.py <libfkw.so> <output-prefix>")
        return 2

    input_path = Path(sys.argv[1])
    output_prefix = Path(sys.argv[2])
    blob = input_path.read_bytes()
    selected = ("role", "verified", "register", "normal", "order", "license", "block", "login-status", "api/")

    with input_path.open("rb") as stream:
        elf = ELFFile(stream)
        report_path = output_prefix.with_name(output_prefix.name + "-elf-report.md")
        symbols_path = output_prefix.with_name(output_prefix.name + "-symbols.tsv")
        strings_path = output_prefix.with_name(output_prefix.name + "-strings.tsv")
        utf8_path = output_prefix.with_name(output_prefix.name + "-utf8-strings.tsv")
        relocations_path = output_prefix.with_name(output_prefix.name + "-registration-table.tsv")

        dynsym = elf.get_section_by_name(".dynsym")
        symbols = []
        if dynsym is not None:
            for symbol in dynsym.iter_symbols():
                if symbol.name:
                    symbols.append((symbol.name, symbol["st_value"], symbol["st_size"], symbol["st_info"]["type"], symbol["st_shndx"]))

        with symbols_path.open("w", newline="", encoding="utf-8") as output:
            writer = csv.writer(output, delimiter="\t")
            writer.writerow(("name", "virtual_address", "size", "type", "section"))
            for symbol in sorted(symbols, key=lambda item: (item[1], item[0])):
                writer.writerow((symbol[0], f"0x{symbol[1]:X}", symbol[2], symbol[3], symbol[4]))

        matches = [(offset, value) for offset, value in ascii_strings(blob) if any(term in value.lower() for term in selected)]
        with strings_path.open("w", newline="", encoding="utf-8") as output:
            writer = csv.writer(output, delimiter="\t")
            writer.writerow(("file_offset", "string"))
            for offset, value in matches:
                writer.writerow((f"0x{offset:X}", value))

        utf8_matches = list(utf8_null_strings(blob))
        with utf8_path.open("w", newline="", encoding="utf-8") as output:
            writer = csv.writer(output, delimiter="\t")
            writer.writerow(("file_offset", "string"))
            for offset, value in utf8_matches:
                writer.writerow((f"0x{offset:X}", value))

        relocations = elf.get_section_by_name(".rela.dyn")
        with relocations_path.open("w", newline="", encoding="utf-8") as output:
            writer = csv.writer(output, delimiter="\t")
            writer.writerow(("class_index", "got_address", "relocation_type", "target_address", "symbol"))
            if relocations is not None:
                relocation_map = {item["r_offset"]: item for item in relocations.iter_relocations()}
                for index in range(43):
                    got_address = 0x178748 + (index * 8)
                    relocation = relocation_map.get(got_address)
                    if relocation is None:
                        writer.writerow((index, f"0x{got_address:X}", "", "", ""))
                        continue
                    symbol_index = relocation.entry["r_info_sym"]
                    symbol = relocations.get_symbol(symbol_index).name if symbol_index else ""
                    addend = relocation.entry.get("r_addend", 0)
                    writer.writerow((index, f"0x{got_address:X}", relocation.entry["r_info_type"], f"0x{addend:X}", symbol))

        lines = [
            "# libfkw.so ELF 静态清单",
            "",
            "本报告仅解析 ELF 文件结构、动态符号和字符串，不会装载或执行目标库。",
            "",
            "## ELF 信息",
            "",
            f"- 文件：`{input_path.name}`",
            f"- 大小：`{len(blob):,}` bytes",
            f"- 类型：`{elf.header['e_type']}`",
            f"- 机器：`{elf.header['e_machine']}`",
            f"- 入口：`0x{elf.header['e_entry']:X}`",
            f"- 节区数量：`{elf.num_sections()}`",
            f"- 动态符号数量：`{len(symbols)}`",
            f"- 角色/授权相关 ASCII 字符串数量：`{len(matches)}`",
            f"- 可解码 UTF-8 字符串数量：`{len(utf8_matches)}`",
            "",
            "## 节区",
            "",
            "| 名称 | 地址 | 文件偏移 | 大小 | 类型 |",
            "|---|---:|---:|---:|---|",
        ]
        for section in elf.iter_sections():
            lines.append(
                f"| `{section.name or '<unnamed>'}` | `0x{section['sh_addr']:X}` | `0x{section['sh_offset']:X}` | `{section['sh_size']}` | `{section['sh_type']}` |"
            )
        lines.extend(
            [
                "",
                "## 导出索引",
                "",
                f"- [动态符号 TSV]({symbols_path.name})",
                f"- [角色、授权、注册与 API 相关字符串 TSV]({strings_path.name})",
                f"- [全部 UTF-8 字符串 TSV]({utf8_path.name})",
                f"- [Dex2C 类索引到原生注册表 TSV]({relocations_path.name})",
            ]
        )
        report_path.write_text("\n".join(lines) + "\n", encoding="utf-8")

    print(f"wrote {report_path}")
    print(f"wrote {symbols_path}")
    print(f"wrote {strings_path}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
