from __future__ import annotations

import struct
from pathlib import Path


ROOT = Path(__file__).resolve().parent
TARGET = ROOT / "main.unpacked"
OUT = ROOT / "plt_calls.txt"
WATCH = {
    "popen", "fork", "execl", "chmod", "system", "__system_property_get",
    "__system_property_set", "inotify_init1", "inotify_add_watch", "dlopen",
    "dlsym", "syscall", "pthread_create", "access", "remove", "mkdir",
    "nftw", "rename", "readlink", "chdir", "getenv",
}


def sign_extend(value: int, bits: int) -> int:
    sign = 1 << (bits - 1)
    return (value ^ sign) - sign


def c_string(data: bytes, offset: int) -> str:
    if offset < 0 or offset >= len(data):
        return ""
    end = data.find(b"\0", offset)
    if end < 0:
        end = len(data)
    text = data[offset:end].decode("utf-8", "replace")
    if not text or sum(ch.isprintable() or ch in "\t\r\n" for ch in text) / len(text) < 0.8:
        return ""
    return text


def main() -> None:
    data = TARGET.read_bytes()
    eh = struct.unpack_from("<16sHHIQQQIHHHHHH", data, 0)
    shoff, shentsize, shnum, shstrndx = eh[6], eh[11], eh[12], eh[13]
    sh = [struct.unpack_from("<IIQQQQIIQQ", data, shoff + i * shentsize) for i in range(shnum)]
    shstr = data[sh[shstrndx][4]:sh[shstrndx][4] + sh[shstrndx][5]]

    def name(i: int) -> str:
        start = sh[i][0]
        end = shstr.find(b"\0", start)
        return shstr[start:end].decode("ascii")

    names = [name(i) for i in range(shnum)]
    by_name = {value: i for i, value in enumerate(names)}
    dynsym, dynstr, rela, plt, text = (sh[by_name[key]] for key in (".dynsym", ".dynstr", ".rela.plt", ".plt", ".text"))
    dynstr_data = data[dynstr[4]:dynstr[4] + dynstr[5]]

    def symbol(index: int) -> str:
        off = dynsym[4] + index * dynsym[9]
        st_name = struct.unpack_from("<I", data, off)[0]
        end = dynstr_data.find(b"\0", st_name)
        return dynstr_data[st_name:end].decode("ascii")

    plt_targets: dict[int, str] = {}
    for j, off in enumerate(range(rela[4], rela[4] + rela[5], rela[9])):
        _, r_info, _ = struct.unpack_from("<QQq", data, off)
        plt_targets[plt[3] + 0x20 + j * 0x10] = symbol(r_info >> 32)

    text_start, text_end = text[3], text[3] + text[5]
    words = {
        pc: struct.unpack_from("<I", data, pc)[0]
        for pc in range(text_start, text_end, 4)
    }

    def nearest_strings(call_pc: int) -> list[tuple[str, int, str]]:
        registers: dict[int, int] = {}
        results: list[tuple[str, int, str]] = []
        start = max(text_start, call_pc - 0x100)
        for pc in range(start, call_pc, 4):
            insn = words[pc]
            rd = insn & 0x1F
            # ADRP Xd, #imm
            if insn & 0x9F000000 == 0x90000000:
                immhi = (insn >> 5) & 0x7FFFF
                immlo = (insn >> 29) & 0x3
                registers[rd] = (pc & ~0xFFF) + (sign_extend((immhi << 2) | immlo, 21) << 12)
            # ADR Xd, #imm
            elif insn & 0x9F000000 == 0x10000000:
                immhi = (insn >> 5) & 0x7FFFF
                immlo = (insn >> 29) & 0x3
                registers[rd] = pc + sign_extend((immhi << 2) | immlo, 21)
            # ADD Xd, Xn, #imm{, LSL #12}
            elif insn & 0x7F000000 == 0x11000000 and (insn >> 31):
                rn = (insn >> 5) & 0x1F
                shift = (insn >> 22) & 0x1
                imm = (insn >> 10) & 0xFFF
                if rn in registers:
                    registers[rd] = registers[rn] + (imm << (12 if shift else 0))
            # MOVZ Xd, #imm{, LSL #shift}
            elif insn & 0x7F800000 == 0x52800000 and (insn >> 31):
                hw = (insn >> 21) & 0x3
                registers[rd] = ((insn >> 5) & 0xFFFF) << (hw * 16)
            # MOVK Xd, #imm{, LSL #shift}
            elif insn & 0x7F800000 == 0x72800000 and (insn >> 31) and rd in registers:
                hw = (insn >> 21) & 0x3
                mask = 0xFFFF << (hw * 16)
                registers[rd] = (registers[rd] & ~mask) | (((insn >> 5) & 0xFFFF) << (hw * 16))
            # ORR Xd, XZR, Xm (MOV alias)
            elif insn & 0xFFE0FFE0 == 0xAA0003E0:
                rm = (insn >> 16) & 0x1F
                if rm in registers:
                    registers[rd] = registers[rm]
            # Direct call or branch ends argument setup tracking.
            elif insn & 0xFC000000 in (0x94000000, 0x14000000):
                registers.clear()

        for reg in range(8):
            address = registers.get(reg)
            if address is None:
                continue
            value = c_string(data, address)
            if value:
                results.append((f"x{reg}", address, value))
        return results

    lines = ["PLT direct callsites with recovered register strings", ""]
    calls: list[tuple[str, int]] = []
    for pc, insn in words.items():
        if insn & 0xFC000000 != 0x94000000:
            continue
        imm26 = sign_extend(insn & 0x3FFFFFF, 26) << 2
        target = pc + imm26
        function = plt_targets.get(target)
        if function in WATCH:
            calls.append((function, pc))
            args = nearest_strings(pc)
            lines.append(f"{function:24s} call=0x{pc:X} target=0x{target:X}")
            if args:
                for reg, address, value in args:
                    lines.append(f"  {reg}=0x{address:X} {value}")
            else:
                lines.append("  no direct string argument recovered")

    lines.append("")
    lines.append(f"Total watched direct PLT callsites: {len(calls)}")
    OUT.write_text("\n".join(lines) + "\n", encoding="utf-8")
    print(OUT)


if __name__ == "__main__":
    main()
