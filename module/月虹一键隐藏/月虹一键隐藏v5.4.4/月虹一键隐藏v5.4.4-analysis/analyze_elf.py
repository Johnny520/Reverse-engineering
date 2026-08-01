from __future__ import annotations

import hashlib
import ipaddress
import re
import struct
import base64
import binascii
import gzip
from pathlib import Path


ROOT = Path(__file__).resolve().parent
TARGET = ROOT / "main.unpacked"

PT_NAMES = {
    0: "NULL",
    1: "LOAD",
    2: "DYNAMIC",
    3: "INTERP",
    4: "NOTE",
    6: "PHDR",
    7: "TLS",
    0x6474E550: "GNU_EH_FRAME",
    0x6474E551: "GNU_STACK",
    0x6474E552: "GNU_RELRO",
}

SHT_NAMES = {
    0: "NULL",
    1: "PROGBITS",
    2: "SYMTAB",
    3: "STRTAB",
    4: "RELA",
    6: "DYNAMIC",
    7: "NOTE",
    8: "NOBITS",
    9: "REL",
    11: "DYNSYM",
    14: "INIT_ARRAY",
    15: "FINI_ARRAY",
    0x6FFFFFF6: "GNU_HASH",
    0x6FFFFFFF: "VERSYM",
    0x6FFFFFFE: "VERNEED",
}

DT_NAMES = {
    0: "NULL",
    1: "NEEDED",
    2: "PLTRELSZ",
    3: "PLTGOT",
    4: "HASH",
    5: "STRTAB",
    6: "SYMTAB",
    7: "RELA",
    8: "RELASZ",
    9: "RELAENT",
    10: "STRSZ",
    11: "SYMENT",
    12: "INIT",
    13: "FINI",
    14: "SONAME",
    15: "RPATH",
    16: "SYMBOLIC",
    17: "REL",
    18: "RELSZ",
    19: "RELENT",
    20: "PLTREL",
    21: "DEBUG",
    22: "TEXTREL",
    23: "JMPREL",
    24: "BIND_NOW",
    25: "INIT_ARRAY",
    26: "FINI_ARRAY",
    27: "INIT_ARRAYSZ",
    28: "FINI_ARRAYSZ",
    29: "RUNPATH",
    30: "FLAGS",
    0x6FFFFEF5: "GNU_HASH",
    0x6FFFFFF0: "VERSYM",
    0x6FFFFFFB: "FLAGS_1",
    0x6FFFFFFE: "VERNEED",
    0x6FFFFFFF: "VERNEEDNUM",
}

IOC_KEYWORDS = (
    "http",
    "socket",
    "connect",
    "listen",
    "accept",
    "send",
    "recv",
    "download",
    "upload",
    "exec",
    "system",
    "popen",
    "fork",
    "ptrace",
    "dlopen",
    "dlsym",
    "chmod",
    "chown",
    "mount",
    "umount",
    "iptables",
    "netlink",
    "magisk",
    "kernelsu",
    "apatch",
    "zygisk",
    "su",
    "root",
    "token",
    "password",
    "imei",
    "android_id",
    "serial",
    "clipboard",
    "sms",
    "contacts",
    "/data/",
    "/proc/",
    "/sys/",
    "/dev/",
    "/system/",
    "/vendor/",
    "/sdcard/",
    "service.sh",
    "boot-completed",
    "--yhyc",
)


def c_string(blob: bytes, offset: int) -> str:
    if offset < 0 or offset >= len(blob):
        return f"<bad-offset:{offset:#x}>"
    end = blob.find(b"\0", offset)
    if end < 0:
        end = len(blob)
    return blob[offset:end].decode("utf-8", "replace")


def flags_text(flags: int) -> str:
    return "".join(("R" if flags & 4 else "-", "W" if flags & 2 else "-", "X" if flags & 1 else "-"))


def extract_ascii(data: bytes, minimum: int = 4) -> list[tuple[int, str]]:
    pattern = re.compile(rb"[\x20-\x7e]{%d,}" % minimum)
    return [(m.start(), m.group().decode("ascii")) for m in pattern.finditer(data)]


def extract_utf16le(data: bytes, minimum: int = 4) -> list[tuple[int, str]]:
    pattern = re.compile(rb"(?:[\x20-\x7e]\x00){%d,}" % minimum)
    return [(m.start(), m.group().decode("utf-16le")) for m in pattern.finditer(data)]


def decode_base64_payloads(strings: list[tuple[int, str]]) -> list[tuple[int, str, bytes]]:
    payloads: list[tuple[int, str, bytes]] = []
    for offset, value in strings:
        compact = value.strip()
        if len(compact) < 80 or len(compact) % 4:
            continue
        if not re.fullmatch(r"[A-Za-z0-9+/]+={0,2}", compact):
            continue
        try:
            decoded = base64.b64decode(compact, validate=True)
        except (binascii.Error, ValueError):
            continue
        if decoded.startswith(b"\x1f\x8b\x08"):
            try:
                decoded = gzip.decompress(decoded)
            except OSError:
                continue
        try:
            decoded.decode("utf-8")
        except UnicodeDecodeError:
            continue
        control = sum(byte < 32 and byte not in (9, 10, 13) for byte in decoded)
        if decoded and control / len(decoded) <= 0.02:
            payloads.append((offset, "base64", decoded))
    return payloads


def main() -> None:
    data = TARGET.read_bytes()
    if data[:6] != b"\x7fELF\x02\x01":
        raise SystemExit("Expected a little-endian ELF64 file")

    eh = struct.unpack_from("<16sHHIQQQIHHHHHH", data, 0)
    (_, e_type, e_machine, e_version, e_entry, e_phoff, e_shoff, e_flags,
     e_ehsize, e_phentsize, e_phnum, e_shentsize, e_shnum, e_shstrndx) = eh

    program_headers = [
        struct.unpack_from("<IIQQQQQQ", data, e_phoff + i * e_phentsize)
        for i in range(e_phnum)
    ]

    section_headers = [
        struct.unpack_from("<IIQQQQIIQQ", data, e_shoff + i * e_shentsize)
        for i in range(e_shnum)
    ]
    shstr_hdr = section_headers[e_shstrndx]
    shstr = data[shstr_hdr[4]:shstr_hdr[4] + shstr_hdr[5]]
    section_names = [c_string(shstr, sh[0]) for sh in section_headers]

    lines = [
        f"Target: {TARGET}",
        f"Size: {len(data)} bytes",
        f"SHA-256: {hashlib.sha256(data).hexdigest().upper()}",
        f"ELF: type={e_type} machine={e_machine:#x} version={e_version}",
        f"Entry: {e_entry:#x}",
        f"Flags: {e_flags:#x}",
        f"Program headers: {e_phnum}",
        f"Section headers: {e_shnum}",
        "",
        "[Program Headers]",
    ]
    for i, ph in enumerate(program_headers):
        p_type, p_flags, p_offset, p_vaddr, p_paddr, p_filesz, p_memsz, p_align = ph
        lines.append(
            f"{i:02d} {PT_NAMES.get(p_type, hex(p_type)):14s} {flags_text(p_flags)} "
            f"off={p_offset:#x} vaddr={p_vaddr:#x} filesz={p_filesz:#x} "
            f"memsz={p_memsz:#x} align={p_align:#x}"
        )

    lines.extend(("", "[Sections]"))
    for i, (name, sh) in enumerate(zip(section_names, section_headers)):
        _, sh_type, sh_flags, sh_addr, sh_offset, sh_size, sh_link, sh_info, sh_align, sh_entsize = sh
        lines.append(
            f"{i:02d} {name:20s} {SHT_NAMES.get(sh_type, hex(sh_type)):12s} "
            f"flags={sh_flags:#x} addr={sh_addr:#x} off={sh_offset:#x} size={sh_size:#x} "
            f"link={sh_link} info={sh_info} align={sh_align:#x} entsize={sh_entsize:#x}"
        )

    dynamic_entries: list[tuple[int, int]] = []
    dynamic_sections = [i for i, sh in enumerate(section_headers) if sh[1] == 6]
    for sec_index in dynamic_sections:
        sh = section_headers[sec_index]
        entsize = sh[9] or 16
        for off in range(sh[4], sh[4] + sh[5], entsize):
            tag, value = struct.unpack_from("<QQ", data, off)
            dynamic_entries.append((tag, value))
            if tag == 0:
                break

    dynstr = b""
    dynstr_index = None
    for i, (name, sh) in enumerate(zip(section_names, section_headers)):
        if name == ".dynstr":
            dynstr_index = i
            dynstr = data[sh[4]:sh[4] + sh[5]]
            break

    lines.extend(("", "[Dynamic]"))
    string_tags = {1, 14, 15, 29}
    for tag, value in dynamic_entries:
        rendered = c_string(dynstr, value) if tag in string_tags and dynstr else hex(value)
        lines.append(f"{DT_NAMES.get(tag, hex(tag)):14s} {rendered}")

    lines.extend(("", "[Dynamic Symbols]"))
    symbols: list[str] = []
    for sec_index, sh in enumerate(section_headers):
        if sh[1] not in (2, 11):
            continue
        strtab_index = sh[6]
        if strtab_index >= len(section_headers):
            continue
        strtab_hdr = section_headers[strtab_index]
        strtab = data[strtab_hdr[4]:strtab_hdr[4] + strtab_hdr[5]]
        entsize = sh[9] or 24
        for j, off in enumerate(range(sh[4], sh[4] + sh[5], entsize)):
            st_name, st_info, st_other, st_shndx, st_value, st_size = struct.unpack_from("<IBBHQQ", data, off)
            name = c_string(strtab, st_name)
            if not name:
                continue
            binding = st_info >> 4
            sym_type = st_info & 0xF
            status = "IMPORT" if st_shndx == 0 else "DEFINED"
            line = (
                f"{section_names[sec_index]}[{j}] {status:7s} bind={binding} type={sym_type} "
                f"value={st_value:#x} size={st_size:#x} {name}"
            )
            lines.append(line)
            symbols.append(name)

    ascii_strings = extract_ascii(data)
    utf16_strings = extract_utf16le(data)
    (ROOT / "strings_ascii.txt").write_text(
        "\n".join(f"{off:08X} {value}" for off, value in ascii_strings),
        encoding="utf-8",
    )
    (ROOT / "strings_utf16le.txt").write_text(
        "\n".join(f"{off:08X} {value}" for off, value in utf16_strings),
        encoding="utf-8",
    )

    ioc_rows: list[tuple[int, str, str]] = []
    seen: set[tuple[int, str]] = set()
    for encoding, strings in (("ASCII", ascii_strings), ("UTF16LE", utf16_strings)):
        for off, value in strings:
            lowered = value.lower()
            reasons = [word for word in IOC_KEYWORDS if word in lowered]
            if re.search(r"(?:https?|wss?|ftp)://", value, re.I):
                reasons.append("URL")
            for candidate in re.findall(r"(?<![0-9])(?:[0-9]{1,3}\.){3}[0-9]{1,3}(?![0-9])", value):
                try:
                    ipaddress.ip_address(candidate)
                except ValueError:
                    continue
                reasons.append("IPv4")
            if reasons and (off, value) not in seen:
                seen.add((off, value))
                ioc_rows.append((off, encoding + ":" + ",".join(sorted(set(reasons))), value))

    (ROOT / "ioc_candidates.txt").write_text(
        "\n".join(f"{off:08X} [{reason}] {value}" for off, reason, value in ioc_rows),
        encoding="utf-8",
    )

    decoded_payloads = decode_base64_payloads(ascii_strings)
    decoded_lines: list[str] = []
    for off, kind, payload in decoded_payloads:
        decoded_lines.append(f"===== offset=0x{off:X} kind={kind} size={len(payload)} =====")
        decoded_lines.append(payload.decode("utf-8", "replace"))
        decoded_lines.append("")
        suffix = ".sh" if payload.startswith((b"#!/bin/sh", b"#!/system/bin/sh")) else ".txt"
        (ROOT / f"embedded_payload_{off:X}{suffix}").write_bytes(payload)
    (ROOT / "decoded_embedded_payloads.txt").write_text(
        "\n".join(decoded_lines),
        encoding="utf-8",
    )

    lines.extend(("", "[Summary]"))
    lines.append(f"Dynamic symbol names: {len(symbols)}")
    lines.append(f"ASCII strings: {len(ascii_strings)}")
    lines.append(f"UTF-16LE strings: {len(utf16_strings)}")
    lines.append(f"IOC candidate rows: {len(ioc_rows)}")
    lines.append(f"Decoded embedded text payloads: {len(decoded_payloads)}")
    (ROOT / "elf_report.txt").write_text("\n".join(lines) + "\n", encoding="utf-8")

    print("Generated:")
    for name in ("elf_report.txt", "strings_ascii.txt", "strings_utf16le.txt", "ioc_candidates.txt", "decoded_embedded_payloads.txt"):
        print(ROOT / name)


if __name__ == "__main__":
    main()
