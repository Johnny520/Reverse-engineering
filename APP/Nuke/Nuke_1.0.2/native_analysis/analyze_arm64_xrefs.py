#!/usr/bin/env python3
"""Find AArch64 ADR/ADRP+ADD references to selected ELF virtual addresses."""

from __future__ import annotations

import argparse
from bisect import bisect_right
from pathlib import Path

from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM
from capstone.arm64 import ARM64_OP_IMM, ARM64_OP_REG
from elftools.elf.elffile import ELFFile


def parse_int(value: str) -> int:
    return int(value, 0)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("elf", type=Path)
    parser.add_argument("targets", nargs="+", type=parse_int)
    parser.add_argument("--window", type=parse_int, default=0)
    args = parser.parse_args()

    with args.elf.open("rb") as stream:
        elf = ELFFile(stream)
        text = elf.get_section_by_name(".text")
        if text is None:
            raise SystemExit("ELF has no .text section")

        function_ranges: list[tuple[int, int]] = []
        if elf.get_section_by_name(".eh_frame") is not None:
            dwarf = elf.get_dwarf_info()
            for entry in dwarf.EH_CFI_entries():
                if hasattr(entry, "header") and "initial_location" in entry.header:
                    start = int(entry.header["initial_location"])
                    size = int(entry.header["address_range"])
                    function_ranges.append((start, start + size))
        function_ranges.sort()
        function_starts = [start for start, _ in function_ranges]

        def enclosing(address: int) -> tuple[int, int] | None:
            index = bisect_right(function_starts, address) - 1
            if index >= 0:
                candidate = function_ranges[index]
                if address < candidate[1]:
                    return candidate
            return None

        targets = args.targets
        decoder = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
        decoder.detail = True
        instructions = list(decoder.disasm(text.data(), int(text["sh_addr"])))

        def report(insn, resolved: int, kind: str) -> None:
            if not any(abs(resolved - target) <= args.window for target in targets):
                return
            owner = enclosing(insn.address)
            owner_text = (
                f"0x{owner[0]:x}-0x{owner[1]:x}" if owner is not None else "unknown"
            )
            print(
                f"xref=0x{insn.address:x} target=0x{resolved:x} "
                f"kind={kind} function={owner_text}"
            )

        for index, insn in enumerate(instructions):
            if insn.mnemonic == "adr" and len(insn.operands) == 2:
                operand = insn.operands[1]
                if operand.type == ARM64_OP_IMM:
                    report(insn, int(operand.imm), "adr")

            if insn.mnemonic != "adrp" or len(insn.operands) != 2:
                continue
            destination, page = insn.operands
            if destination.type != ARM64_OP_REG or page.type != ARM64_OP_IMM:
                continue
            page_address = int(page.imm)
            for following in instructions[index + 1 : index + 6]:
                if following.mnemonic == "add" and len(following.operands) >= 3:
                    out_reg, base_reg, immediate = following.operands[:3]
                    if (
                        out_reg.type == ARM64_OP_REG
                        and base_reg.type == ARM64_OP_REG
                        and immediate.type == ARM64_OP_IMM
                        and base_reg.reg == destination.reg
                    ):
                        report(following, page_address + int(immediate.imm), "adrp+add")
                if any(
                    operand.type == ARM64_OP_REG
                    and operand.reg == destination.reg
                    and position == 0
                    for position, operand in enumerate(following.operands)
                ):
                    break


if __name__ == "__main__":
    main()
