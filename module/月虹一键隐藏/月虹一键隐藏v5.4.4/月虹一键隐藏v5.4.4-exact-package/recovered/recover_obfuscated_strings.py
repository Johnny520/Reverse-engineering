from __future__ import annotations

import csv
import ipaddress
import re
import struct
from collections import Counter, defaultdict
from dataclasses import dataclass
from pathlib import Path

from capstone import CS_ARCH_ARM64, CS_MODE_ARM, Cs
from capstone.arm64 import ARM64_OP_IMM, ARM64_OP_MEM, ARM64_OP_REG
from elftools.elf.elffile import ELFFile


ROOT = Path(__file__).resolve().parent
WORKSPACE = ROOT.parents[1]
TARGET = WORKSPACE / "月虹一键隐藏v5.4.4-analysis" / "main.unpacked"
OUT_TSV = ROOT / "decrypted_strings.tsv"
OUT_IOC = ROOT / "decrypted_ioc.txt"
OUT_UNRESOLVED = ROOT / "unresolved_decrypt_calls.tsv"
MAX_LOOKBACK_INSTRUCTIONS = 20000

IOC_TERMS = (
    "http://", "https://", "ws://", "wss://", "ftp://",
    "curl ", "wget ", "nc ", "busybox", "socket", "connect",
    "download", "upload", "webhook", "telegram", "token", "password",
    "android_id", "imei", "serial", "clipboard", "contacts", "sms",
    "popen", "system", "exec", "chmod", "chown", "mount", "umount",
    "iptables", "magisk", "kernelsu", "apatch", "zygisk", "resetprop",
    "/data/", "/proc/", "/sys/", "/dev/", "/system/", "/vendor/",
    "/sdcard/", "/storage/", "service.sh", "boot-completed", "--yhyc",
)


@dataclass(frozen=True)
class FunctionInfo:
    start: int
    end: int
    key_len: int
    output_len: int


@dataclass(frozen=True)
class RecoveredString:
    function: int
    callsite: int
    destination: int
    source: int
    key_len: int
    output_len: int
    score: float
    raw: bytes
    text: str


def normalize_reg(name: str) -> str:
    if name == "fp":
        return "x29"
    if name == "lr":
        return "x30"
    if name in {"wzr", "xzr"}:
        return "xzr"
    if name == "wsp":
        return "sp"
    match = re.fullmatch(r"[wx](\d+)", name)
    return f"x{match.group(1)}" if match else name


def sign_extend(value: int, bits: int) -> int:
    sign = 1 << (bits - 1)
    return (value ^ sign) - sign


def decode_text(raw: bytes) -> tuple[str, float]:
    raw = raw.rstrip(b"\0")
    try:
        text = raw.decode("utf-8")
    except UnicodeDecodeError:
        text = raw.decode("utf-8", "backslashreplace")

    if not raw:
        return text, 0.0

    printable = 0
    for character in text:
        if character.isprintable() or character in "\t\r\n":
            printable += 1
    return text, printable / max(1, len(text))


class ElfImage:
    def __init__(self, path: Path) -> None:
        self.path = path
        self.data = path.read_bytes()
        with path.open("rb") as stream:
            elf = ELFFile(stream)
            text = elf.get_section_by_name(".text")
            if text is None:
                raise ValueError("ELF has no .text section")
            self.text_address = int(text["sh_addr"])
            self.text_offset = int(text["sh_offset"])
            self.text_size = int(text["sh_size"])
            self.segments = [
                (
                    int(segment["p_vaddr"]),
                    int(segment["p_offset"]),
                    int(segment["p_filesz"]),
                    int(segment["p_memsz"]),
                )
                for segment in elf.iter_segments()
                if segment["p_type"] == "PT_LOAD"
            ]

    def address_to_offset(self, address: int, size: int = 1) -> int | None:
        for virtual, offset, file_size, _memory_size in self.segments:
            relative = address - virtual
            if 0 <= relative and relative + size <= file_size:
                return offset + relative
        return None

    def read(self, address: int, size: int) -> bytes | None:
        offset = self.address_to_offset(address, size)
        if offset is None:
            return None
        return self.data[offset:offset + size]

    def code(self, start: int, end: int) -> bytes:
        offset = self.address_to_offset(start, end - start)
        if offset is None:
            return b""
        return self.data[offset:offset + end - start]


def extract_direct_calls(image: ElfImage, decoder: Cs):
    code = image.code(image.text_address, image.text_address + image.text_size)
    instructions = list(decoder.disasm(code, image.text_address))
    callsites: dict[int, list[int]] = defaultdict(list)
    for instruction in instructions:
        if instruction.mnemonic != "bl" or not instruction.operands:
            continue
        operand = instruction.operands[0]
        if operand.type == ARM64_OP_IMM:
            callsites[int(operand.imm)].append(instruction.address)
    return instructions, callsites


def immediate_before_cset(instructions, index: int) -> int | None:
    for previous in reversed(instructions[max(0, index - 3):index]):
        if previous.mnemonic not in {"subs", "adds", "cmp", "cmn"}:
            continue
        for operand in reversed(previous.operands):
            if operand.type == ARM64_OP_IMM and 0 < operand.imm <= 0x10000:
                return int(operand.imm)
    return None


def classify_decryptor(start: int, end: int, instructions) -> FunctionInfo | None:
    mnemonics = Counter(instruction.mnemonic for instruction in instructions)
    if mnemonics["strb"] == 0 or mnemonics["ldrb"] < 2 or mnemonics["udiv"] == 0:
        return None

    key_lengths: list[int] = []
    for instruction in instructions[:24]:
        if instruction.mnemonic != "add" or len(instruction.operands) < 3:
            continue
        destination, source, immediate = instruction.operands[:3]
        if source.type != ARM64_OP_REG or immediate.type != ARM64_OP_IMM:
            continue
        if normalize_reg(instruction.reg_name(source.reg)) != "x1":
            continue
        if 2 <= immediate.imm <= 64:
            key_lengths.append(int(immediate.imm))

    if not key_lengths:
        return None
    key_len = Counter(key_lengths).most_common(1)[0][0]

    output_lengths: list[int] = []
    for index, instruction in enumerate(instructions):
        if instruction.mnemonic != "cset" or not instruction.operands:
            continue
        if instruction.op_str.rsplit(",", 1)[-1].strip() != "ne":
            continue
        value = immediate_before_cset(instructions, index)
        if value is not None:
            output_lengths.append(value)

    if not output_lengths:
        return None
    output_len = Counter(output_lengths).most_common(1)[0][0]
    if output_len > 0x4000:
        return None
    return FunctionInfo(start, end, key_len, output_len)


class ConstantResolver:
    def __init__(self, image: ElfImage, decoder: Cs, instructions) -> None:
        self.image = image
        self.decoder = decoder
        self.instructions = instructions
        self.address_to_index = {
            instruction.address: index for index, instruction in enumerate(instructions)
        }

    def _stack_location(
        self, register: str, before_index: int, depth: int
    ) -> tuple[str, int] | None:
        register = normalize_reg(register)
        if register in {"sp", "x29"}:
            return register, 0
        if depth > 20:
            return None

        floor = max(0, before_index - MAX_LOOKBACK_INSTRUCTIONS)
        for index in range(before_index - 1, floor - 1, -1):
            instruction = self.instructions[index]
            operands = instruction.operands
            if not operands or operands[0].type != ARM64_OP_REG:
                continue
            destination = normalize_reg(instruction.reg_name(operands[0].reg))
            if destination != register:
                continue

            if instruction.mnemonic in {"add", "sub"} and len(operands) >= 3:
                source, amount = operands[1], operands[2]
                if source.type != ARM64_OP_REG or amount.type != ARM64_OP_IMM:
                    return None
                parent = self._stack_location(
                    normalize_reg(instruction.reg_name(source.reg)), index, depth + 1
                )
                if parent is None:
                    return None
                sign = 1 if instruction.mnemonic == "add" else -1
                return parent[0], parent[1] + sign * int(amount.imm)

            if instruction.mnemonic == "mov" and len(operands) >= 2:
                source = operands[1]
                if source.type == ARM64_OP_REG:
                    return self._stack_location(
                        normalize_reg(instruction.reg_name(source.reg)), index, depth + 1
                    )
            return None
        return None

    def _memory_store(
        self, before_index: int, base: str, displacement: int, depth: int
    ) -> int | None:
        target_stack = self._stack_location(base, before_index, depth + 1)
        if target_stack is not None:
            target_stack = (target_stack[0], target_stack[1] + displacement)

        floor = max(0, before_index - MAX_LOOKBACK_INSTRUCTIONS)
        for index in range(before_index - 1, floor - 1, -1):
            instruction = self.instructions[index]
            if instruction.mnemonic == "bl":
                continue
            if instruction.mnemonic in {"str", "stur"} and len(instruction.operands) >= 2:
                source, location = instruction.operands[:2]
                if source.type != ARM64_OP_REG or location.type != ARM64_OP_MEM:
                    continue
                location_base = normalize_reg(instruction.reg_name(location.mem.base))
                location_displacement = int(location.mem.disp)
                same_location = location_base == base and location_displacement == displacement
                if not same_location and target_stack is not None:
                    stored_stack = self._stack_location(location_base, index, depth + 1)
                    if stored_stack is not None:
                        stored_stack = (
                            stored_stack[0], stored_stack[1] + location_displacement
                        )
                        same_location = stored_stack == target_stack
                if same_location:
                    return self.resolve(
                        normalize_reg(instruction.reg_name(source.reg)), index, depth + 1
                    )
            if instruction.mnemonic == "stp" and len(instruction.operands) >= 3:
                first, second, location = instruction.operands[:3]
                if location.type != ARM64_OP_MEM:
                    continue
                location_base = normalize_reg(instruction.reg_name(location.mem.base))
                base_displacement = int(location.mem.disp)
                for slot, operand in ((base_displacement, first), (base_displacement + 8, second)):
                    same_location = location_base == base and slot == displacement
                    if not same_location and target_stack is not None:
                        stored_stack = self._stack_location(location_base, index, depth + 1)
                        if stored_stack is not None:
                            stored_stack = (stored_stack[0], stored_stack[1] + slot)
                            same_location = stored_stack == target_stack
                    if same_location and operand.type == ARM64_OP_REG:
                        return self.resolve(
                            normalize_reg(instruction.reg_name(operand.reg)), index, depth + 1
                        )
        return None

    def resolve(self, register: str, before_index: int, depth: int = 0) -> int | None:
        register = normalize_reg(register)
        if register == "xzr":
            return 0
        if depth > 20:
            return None

        floor = max(0, before_index - MAX_LOOKBACK_INSTRUCTIONS)
        for index in range(before_index - 1, floor - 1, -1):
            instruction = self.instructions[index]
            mnemonic = instruction.mnemonic
            operands = instruction.operands
            if not operands:
                continue

            destinations: list[str] = []
            if mnemonic == "ldp" and len(operands) >= 2:
                for operand in operands[:2]:
                    if operand.type == ARM64_OP_REG:
                        destinations.append(normalize_reg(instruction.reg_name(operand.reg)))
            elif mnemonic in {
                "adr", "adrp", "add", "sub", "mov", "movz", "movn", "movk",
                "orr", "ldr", "ldur",
            } and operands[0].type == ARM64_OP_REG:
                destinations.append(normalize_reg(instruction.reg_name(operands[0].reg)))

            if register not in destinations:
                continue

            if mnemonic in {"adr", "adrp"} and len(operands) >= 2:
                return int(operands[1].imm) if operands[1].type == ARM64_OP_IMM else None

            if mnemonic in {"add", "sub"} and len(operands) >= 3:
                source, amount = operands[1], operands[2]
                if source.type != ARM64_OP_REG or amount.type != ARM64_OP_IMM:
                    return None
                base = self.resolve(normalize_reg(instruction.reg_name(source.reg)), index, depth + 1)
                if base is None:
                    return None
                return base + int(amount.imm) * (1 if mnemonic == "add" else -1)

            if mnemonic in {"mov", "movz"} and len(operands) >= 2:
                source = operands[1]
                if source.type == ARM64_OP_IMM:
                    return int(source.imm)
                if source.type == ARM64_OP_REG:
                    return self.resolve(
                        normalize_reg(instruction.reg_name(source.reg)), index, depth + 1
                    )
                return None

            if mnemonic == "movn" and len(operands) >= 2 and operands[1].type == ARM64_OP_IMM:
                width = 32 if instruction.reg_name(operands[0].reg).startswith("w") else 64
                return (~int(operands[1].imm)) & ((1 << width) - 1)

            if mnemonic == "movk" and len(operands) >= 2 and operands[1].type == ARM64_OP_IMM:
                previous = self.resolve(register, index, depth + 1)
                if previous is None:
                    return None
                shift = int(operands[1].shift.value) if operands[1].shift else 0
                mask = 0xFFFF << shift
                return (previous & ~mask) | (int(operands[1].imm) << shift)

            if mnemonic == "orr" and len(operands) >= 3:
                left, right = operands[1], operands[2]
                if left.type == ARM64_OP_REG and normalize_reg(instruction.reg_name(left.reg)) == "xzr":
                    if right.type == ARM64_OP_REG:
                        return self.resolve(
                            normalize_reg(instruction.reg_name(right.reg)), index, depth + 1
                        )
                return None

            if mnemonic in {"ldr", "ldur"} and len(operands) >= 2:
                location = operands[1]
                if location.type == ARM64_OP_IMM:
                    raw = self.image.read(int(location.imm), 8)
                    return struct.unpack("<Q", raw)[0] if raw else None
                if location.type != ARM64_OP_MEM:
                    return None
                base = normalize_reg(instruction.reg_name(location.mem.base))
                displacement = int(location.mem.disp)
                forwarded = self._memory_store(index, base, displacement, depth + 1)
                if forwarded is not None:
                    return forwarded
                if self._stack_location(base, index, depth + 1) is not None:
                    return None
                address = self.resolve(base, index, depth + 1)
                if address is None:
                    return None
                raw = self.image.read(address + displacement, 8)
                return struct.unpack("<Q", raw)[0] if raw else None

            return None
        return None

    def call_arguments(self, callsite: int) -> tuple[int | None, int | None]:
        index = self.address_to_index[callsite]
        return self.resolve("x0", index), self.resolve("x1", index)


def decrypt(source: bytes, key_len: int, output_len: int) -> bytes:
    key = source[:key_len]
    encrypted = source[key_len:key_len + output_len]
    if len(key) != key_len or len(encrypted) != output_len:
        return b""
    output = bytearray()
    previous = 0
    for index, value in enumerate(encrypted):
        output.append(value ^ key[index % key_len] ^ previous)
        previous = value
    return bytes(output)


def has_ioc(text: str) -> list[str]:
    lowered = text.lower()
    reasons = [term for term in IOC_TERMS if term in lowered]
    if re.search(r"(?:https?|wss?|ftp)://", text, re.IGNORECASE):
        reasons.append("URL")
    for candidate in re.findall(r"(?<![0-9])(?:[0-9]{1,3}\.){3}[0-9]{1,3}(?![0-9])", text):
        try:
            ipaddress.ip_address(candidate)
        except ValueError:
            continue
        reasons.append("IPv4")
    return sorted(set(reasons))


def escaped_field(text: str) -> str:
    return text.replace("\\", "\\\\").replace("\t", "\\t").replace("\r", "\\r").replace("\n", "\\n")


def main() -> None:
    image = ElfImage(TARGET)
    decoder = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    decoder.detail = True
    instructions, callsites = extract_direct_calls(image, decoder)

    targets = sorted(
        target for target in callsites
        if image.text_address <= target < image.text_address + image.text_size
    )
    bounds = targets + [image.text_address + image.text_size]

    decryptors: dict[int, FunctionInfo] = {}
    for position, start in enumerate(targets):
        end = min(bounds[position + 1], start + 0x1000)
        function_instructions = list(decoder.disasm(image.code(start, end), start))
        info = classify_decryptor(start, end, function_instructions)
        if info is not None:
            decryptors[start] = info

    resolver = ConstantResolver(image, decoder, instructions)
    recovered: list[RecoveredString] = []
    unresolved_rows: list[tuple[int, int, int | None, int | None, int, int, str]] = []
    unresolved_arguments = 0
    unreadable = 0

    seen: set[tuple[int, int, int]] = set()
    for function, info in sorted(decryptors.items()):
        for callsite in callsites[function]:
            destination, source = resolver.call_arguments(callsite)
            if destination is None or source is None:
                unresolved_arguments += 1
                unresolved_rows.append((
                    function, callsite, destination, source, info.key_len, info.output_len,
                    "argument-resolution",
                ))
                continue
            identity = (function, destination, source)
            if identity in seen:
                continue
            seen.add(identity)
            encoded = image.read(source, info.key_len + info.output_len)
            if encoded is None:
                unresolved_arguments += 1
                unresolved_rows.append((
                    function, callsite, destination, source, info.key_len, info.output_len,
                    "source-not-file-backed",
                ))
                continue
            raw = decrypt(encoded, info.key_len, info.output_len)
            text, score = decode_text(raw)
            if score < 0.75:
                unreadable += 1
            recovered.append(
                RecoveredString(
                    function=function,
                    callsite=callsite,
                    destination=destination,
                    source=source,
                    key_len=info.key_len,
                    output_len=info.output_len,
                    score=score,
                    raw=raw,
                    text=text,
                )
            )

    with OUT_TSV.open("w", encoding="utf-8", newline="") as stream:
        writer = csv.writer(stream, delimiter="\t", lineterminator="\n")
        writer.writerow((
            "function", "callsite", "destination", "source", "key_len", "output_len",
            "printable_score", "text",
        ))
        for row in recovered:
            writer.writerow((
                f"0x{row.function:X}", f"0x{row.callsite:X}", f"0x{row.destination:X}",
                f"0x{row.source:X}", row.key_len, row.output_len, f"{row.score:.3f}",
                escaped_field(row.text),
            ))

    with OUT_UNRESOLVED.open("w", encoding="utf-8", newline="") as stream:
        writer = csv.writer(stream, delimiter="\t", lineterminator="\n")
        writer.writerow((
            "function", "callsite", "destination", "source", "key_len", "output_len", "reason",
        ))
        for function, callsite, destination, source, key_len, output_len, reason in unresolved_rows:
            writer.writerow((
                f"0x{function:X}", f"0x{callsite:X}",
                "" if destination is None else f"0x{destination:X}",
                "" if source is None else f"0x{source:X}",
                key_len, output_len, reason,
            ))

    ioc_lines = [
        "Recovered obfuscated-string IOC candidates",
        "",
    ]
    ioc_count = 0
    for row in recovered:
        reasons = has_ioc(row.text)
        if not reasons:
            continue
        ioc_count += 1
        ioc_lines.append(
            f"function=0x{row.function:X} call=0x{row.callsite:X} "
            f"source=0x{row.source:X} reasons={','.join(reasons)}"
        )
        ioc_lines.append(escaped_field(row.text))
        ioc_lines.append("")
    OUT_IOC.write_text("\n".join(ioc_lines), encoding="utf-8")

    print(f"Direct call targets: {len(targets)}")
    print(f"Candidate decryptors: {len(decryptors)}")
    print(f"Recovered strings: {len(recovered)}")
    print(f"Unresolved call arguments: {unresolved_arguments}")
    print(f"Low-printability outputs: {unreadable}")
    print(f"IOC rows: {ioc_count}")
    print(OUT_TSV)
    print(OUT_IOC)
    print(OUT_UNRESOLVED)


if __name__ == "__main__":
    main()
