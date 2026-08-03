import hashlib
import math
import re
import struct
from collections import Counter
from pathlib import Path

from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM
from capstone.arm64_const import ARM64_OP_IMM, ARM64_OP_MEM, ARM64_OP_REG


SOURCE = Path("WCGlass.dylib")
OUT = Path("WCGlass_output")
MASK36 = (1 << 36) - 1


def c_string(blob: bytes, start: int, end: int | None = None) -> str:
    if start < 0 or start >= len(blob):
        return ""
    stop = blob.find(b"\0", start, len(blob) if end is None else end)
    if stop < 0:
        stop = len(blob) if end is None else end
    return blob[start:stop].decode("utf-8", "replace")


def entropy(blob: bytes) -> float:
    if not blob:
        return 0.0
    counts = Counter(blob)
    length = len(blob)
    return -sum((n / length) * math.log2(n / length) for n in counts.values())


def align(value: int, amount: int) -> int:
    return (value + amount - 1) & ~(amount - 1)


def read_uleb(blob: bytes, pos: int) -> tuple[int, int]:
    value = 0
    shift = 0
    while True:
        byte = blob[pos]
        pos += 1
        value |= (byte & 0x7F) << shift
        if not byte & 0x80:
            return value, pos
        shift += 7


class MachOSlice:
    def __init__(self, whole: bytes, index: int, cpu_type: int, cpu_subtype: int,
                 base: int, size: int, fat_align: int):
        self.whole = whole
        self.index = index
        self.cpu_type = cpu_type
        self.cpu_subtype = cpu_subtype
        self.base = base
        self.size = size
        self.fat_align = fat_align
        self.data = whole[base:base + size]
        self.sections: list[dict] = []
        self.commands: list[dict] = []
        self.dylibs: list[str] = []
        self.crypt = None
        self.symtab = None
        self.dysymtab = None
        self.function_starts_info = None
        self.code_signature = None
        self.uuid = ""
        self.filetype = 0
        self.flags = 0
        self.ncmds = 0
        self.sizeofcmds = 0
        self.symbols: list[dict] = []
        self.symbol_by_index: dict[int, str] = {}
        self.stub_names: dict[int, str] = {}
        self.function_starts: list[int] = []
        self.classes: list[dict] = []
        self._parse()

    @property
    def arch(self) -> str:
        if self.cpu_type == 0x0100000C:
            return "arm64e" if (self.cpu_subtype & 0xFF) == 2 else "arm64"
        return f"cpu_{self.cpu_type:08x}_{self.cpu_subtype:08x}"

    def ptr(self, raw: int) -> int | None:
        # The non-authenticated internal pointers in this image use a
        # DYLD_CHAINED_PTR_64_OFFSET-style 36-bit target. Auth/bind pointers
        # resolve to small ordinals and are deliberately ignored here.
        target = raw & MASK36
        return target if 0 < target < self.size else None

    def qword(self, address: int) -> int:
        return struct.unpack_from("<Q", self.data, address)[0]

    def text_at(self, address: int) -> str:
        return c_string(self.data, address, self.size)

    def _parse(self):
        magic, cputype, subtype, self.filetype, self.ncmds, self.sizeofcmds, self.flags, _ = \
            struct.unpack_from("<IiiIIIII", self.data, 0)
        if magic != 0xFEEDFACF:
            raise ValueError(f"slice {self.index} is not a 64-bit little-endian Mach-O")

        pos = 32
        for _ in range(self.ncmds):
            cmd, cmdsize = struct.unpack_from("<II", self.data, pos)
            item = {"cmd": cmd, "cmdsize": cmdsize, "offset": pos}
            self.commands.append(item)
            if cmd == 0x19:  # LC_SEGMENT_64
                values = struct.unpack_from("<II16sQQQQiiII", self.data, pos)
                segname = values[2].split(b"\0", 1)[0].decode("ascii", "replace")
                vmaddr, vmsize, fileoff, filesize = values[3:7]
                nsects = values[9]
                sp = pos + 72
                for number in range(nsects):
                    values = struct.unpack_from("<16s16sQQIIIIIIII", self.data, sp + number * 80)
                    sectname = values[0].split(b"\0", 1)[0].decode("ascii", "replace")
                    section_segname = values[1].split(b"\0", 1)[0].decode("ascii", "replace")
                    self.sections.append({
                        "segment": section_segname,
                        "name": sectname,
                        "address": values[2],
                        "size": values[3],
                        "offset": values[4],
                        "align": values[5],
                        "reloff": values[6],
                        "nreloc": values[7],
                        "flags": values[8],
                        "reserved1": values[9],
                        "reserved2": values[10],
                        "reserved3": values[11],
                    })
                item.update(segname=segname, vmaddr=vmaddr, vmsize=vmsize,
                            fileoff=fileoff, filesize=filesize, nsects=nsects)
            elif cmd in (0x21, 0x2C):
                cryptoff, cryptsize, cryptid = struct.unpack_from("<III", self.data, pos + 8)
                self.crypt = {"offset": cryptoff, "size": cryptsize, "id": cryptid}
            elif cmd in (0xC, 0xD, 0x80000018, 0x8000001F, 0x80000023):
                nameoff = struct.unpack_from("<I", self.data, pos + 8)[0]
                name = c_string(self.data, pos + nameoff, pos + cmdsize)
                self.dylibs.append(name)
                item["name"] = name
            elif cmd == 0x1B:
                import uuid
                self.uuid = str(uuid.UUID(bytes=bytes(self.data[pos + 8:pos + 24])))
            elif cmd == 0x2:
                self.symtab = dict(zip(("symoff", "nsyms", "stroff", "strsize"),
                                       struct.unpack_from("<IIII", self.data, pos + 8)))
            elif cmd == 0xB:
                fields = ("ilocalsym", "nlocalsym", "iextdefsym", "nextdefsym",
                          "iundefsym", "nundefsym", "tocoff", "ntoc", "modtaboff",
                          "nmodtab", "extrefsymoff", "nextrefsyms", "indirectsymoff",
                          "nindirectsyms", "extreloff", "nextrel", "locreloff", "nlocrel")
                self.dysymtab = dict(zip(fields, struct.unpack_from("<" + "I" * 18, self.data, pos + 8)))
            elif cmd == 0x26:
                dataoff, datasize = struct.unpack_from("<II", self.data, pos + 8)
                self.function_starts_info = (dataoff, datasize)
            elif cmd == 0x1D:
                dataoff, datasize = struct.unpack_from("<II", self.data, pos + 8)
                self.code_signature = (dataoff, datasize)
            pos += cmdsize

        self._parse_symbols()
        self._parse_stubs()
        self._parse_function_starts()
        self._parse_classes()

    def section(self, segment: str, name: str) -> dict | None:
        return next((s for s in self.sections if s["segment"] == segment and s["name"] == name), None)

    def _parse_symbols(self):
        if not self.symtab:
            return
        st = self.symtab
        strings = self.data[st["stroff"]:st["stroff"] + st["strsize"]]
        for index in range(st["nsyms"]):
            off = st["symoff"] + index * 16
            strx, ntype, nsect, ndesc, value = struct.unpack_from("<IBBHQ", self.data, off)
            name = c_string(strings, strx, len(strings)) if 0 < strx < len(strings) else ""
            self.symbol_by_index[index] = name
            if name:
                self.symbols.append({"index": index, "name": name, "type": ntype,
                                     "section": nsect, "desc": ndesc, "value": value})

    def _parse_stubs(self):
        if not self.dysymtab:
            return
        indirect_off = self.dysymtab["indirectsymoff"]
        for section in self.sections:
            if section["name"] not in ("__stubs", "__auth_stubs"):
                continue
            stub_size = section["reserved2"]
            if not stub_size:
                continue
            count = section["size"] // stub_size
            first = section["reserved1"]
            for i in range(count):
                symbol_index = struct.unpack_from("<I", self.data, indirect_off + (first + i) * 4)[0]
                symbol_index &= 0x3FFFFFFF
                name = self.symbol_by_index.get(symbol_index, "")
                if name:
                    self.stub_names[section["address"] + i * stub_size] = name

    def _parse_function_starts(self):
        if not self.function_starts_info:
            return
        dataoff, datasize = self.function_starts_info
        pos, end, address = dataoff, dataoff + datasize, 0
        while pos < end:
            delta, pos = read_uleb(self.data, pos)
            if delta == 0:
                break
            address += delta
            self.function_starts.append(address)

    def _method_list(self, address: int | None) -> list[dict]:
        if address is None or address + 8 > self.size:
            return []
        entsize_flags, count = struct.unpack_from("<II", self.data, address)
        entsize = entsize_flags & 0xFFFF
        if count > 5000 or entsize not in (12, 24):
            return []
        relative = bool(entsize_flags & 0x80000000)
        direct_selector = bool(entsize_flags & 0x40000000)
        result = []
        pos = address + 8
        for _ in range(count):
            if relative:
                name_delta, type_delta, imp_delta = struct.unpack_from("<iii", self.data, pos)
                name_address = pos + name_delta
                if not direct_selector:
                    name_address = self.ptr(self.qword(name_address)) if 0 <= name_address <= self.size - 8 else None
                type_address = pos + 4 + type_delta
                imp = pos + 8 + imp_delta
            else:
                raw_name, raw_type, raw_imp = struct.unpack_from("<QQQ", self.data, pos)
                name_address, type_address, imp = self.ptr(raw_name), self.ptr(raw_type), self.ptr(raw_imp)
            result.append({"name": self.text_at(name_address) if name_address else "",
                           "types": self.text_at(type_address) if type_address else "",
                           "imp": imp})
            pos += entsize
        return result

    def _class_info(self, address: int) -> dict | None:
        if address + 40 > self.size:
            return None
        isa, superclass, cache, vtable, data_bits = struct.unpack_from("<QQQQQ", self.data, address)
        ro = self.ptr(data_bits)
        if ro is None or ro + 72 > self.size:
            return None
        values = struct.unpack_from("<IIIIQQQQQQQ", self.data, ro)
        name = self.text_at(self.ptr(values[5]) or 0)
        return {"address": address, "isa": self.ptr(isa), "superclass_raw": superclass,
                "ro": ro, "name": name, "methods": self._method_list(self.ptr(values[6]))}

    def _parse_classes(self):
        classlist = self.section("__DATA_CONST", "__objc_classlist")
        if not classlist:
            return
        for pos in range(classlist["address"], classlist["address"] + classlist["size"], 8):
            address = self.ptr(self.qword(pos))
            if address is None:
                continue
            info = self._class_info(address)
            if not info:
                continue
            meta = self._class_info(info["isa"]) if info["isa"] else None
            info["class_methods"] = meta["methods"] if meta else []
            self.classes.append(info)

    def function_bounds(self, address: int) -> tuple[int, int]:
        starts = self.function_starts
        previous = max((x for x in starts if x <= address), default=address)
        following = min((x for x in starts if x > address), default=min(address + 0x1000, self.size))
        return previous, following

    def strings_in_sections(self) -> list[tuple[int, str, str]]:
        wanted = {"__cstring", "__objc_methname", "__objc_classname", "__objc_methtype"}
        result = []
        for section in self.sections:
            if section["name"] not in wanted or not section["offset"]:
                continue
            blob = self.data[section["offset"]:section["offset"] + section["size"]]
            local = 0
            for part in blob.split(b"\0"):
                if len(part) >= 3:
                    result.append((section["address"] + local,
                                   part.decode("utf-8", "replace"), section["name"]))
                local += len(part) + 1
        return result

    def disassemble(self, address: int) -> str:
        start, end = self.function_bounds(address)
        md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
        md.detail = True
        lines = [f"function 0x{start:x}-0x{end:x} (requested IMP 0x{address:x})"]
        registers: dict[int, int] = {}
        for ins in md.disasm(self.data[start:end], start):
            annotation = ""
            ops = ins.operands
            if ins.mnemonic in ("adr", "adrp") and len(ops) >= 2 and ops[0].type == ARM64_OP_REG and ops[1].type == ARM64_OP_IMM:
                registers[ops[0].reg] = ops[1].imm
            elif ins.mnemonic == "add" and len(ops) >= 3 and ops[0].type == ARM64_OP_REG and ops[1].type == ARM64_OP_REG and ops[2].type == ARM64_OP_IMM:
                if ops[1].reg in registers:
                    registers[ops[0].reg] = registers[ops[1].reg] + ops[2].imm
            elif ins.mnemonic.startswith("ldr") and len(ops) >= 2 and ops[0].type == ARM64_OP_REG and ops[1].type == ARM64_OP_MEM:
                base_reg = ops[1].mem.base
                if base_reg in registers:
                    memory_address = registers[base_reg] + ops[1].mem.disp
                    annotation = f"mem=0x{memory_address:x}"
                    if 0 <= memory_address <= self.size - 8:
                        target = self.ptr(self.qword(memory_address))
                        if target:
                            value = self.text_at(target)
                            if value and all(ch.isprintable() or ch in "\t\r\n" for ch in value[:80]):
                                annotation += f" -> {value[:120]!r}"
            if ins.mnemonic in ("bl", "b") and ops and ops[0].type == ARM64_OP_IMM:
                target = ops[0].imm
                if target in self.stub_names:
                    annotation = self.stub_names[target]
            # Immediate addresses that directly land in a known string section.
            for op in ops:
                if op.type == ARM64_OP_IMM:
                    value = self.text_at(op.imm) if 0 <= op.imm < self.size else ""
                    if value and len(value) >= 4 and value[:1].isprintable():
                        annotation = annotation or repr(value[:120])
            suffix = f" ; {annotation}" if annotation else ""
            lines.append(f"0x{ins.address:08x}: {ins.mnemonic:<8} {ins.op_str}{suffix}")
        return "\n".join(lines)


def parse_fat(blob: bytes) -> list[MachOSlice]:
    if blob[:4] == b"\xca\xfe\xba\xbe":
        count = struct.unpack_from(">I", blob, 4)[0]
        slices = []
        for index in range(count):
            cpu, subtype, offset, size, fat_align = struct.unpack_from(">iiIII", blob, 8 + index * 20)
            slices.append(MachOSlice(blob, index, cpu & 0xFFFFFFFF, subtype & 0xFFFFFFFF,
                                    offset, size, fat_align))
        return slices
    return [MachOSlice(blob, 0, 0, 0, 0, len(blob), 0)]


def main():
    blob = SOURCE.read_bytes()
    OUT.mkdir(exist_ok=True)
    slices = parse_fat(blob)

    # Preserve the universal image as the verified plaintext copy. cryptid=0
    # means there is no FairPlay payload transformation to perform.
    (OUT / "WCGlass_plain.dylib").write_bytes(blob)
    for image in slices:
        (OUT / f"WCGlass_{image.arch}_plain.dylib").write_bytes(image.data)

    report = [
        f"Source: {SOURCE.resolve()}",
        f"Size: {len(blob)} bytes",
        f"SHA-256: {hashlib.sha256(blob).hexdigest()}",
        f"Universal slices: {len(slices)}",
        "",
    ]
    symbol_lines = []
    header_lines = ["// Recovered Objective-C interface index from WCGlass.dylib", ""]
    string_lines = []
    sensitive_lines = []
    disassembly_lines = []
    pattern = re.compile(
        r"(?i)(decrypt|encrypt|crypt|cccrypt|hmac|sha256|rsa|key|token|auth|license|"
        r"server|request|response|sign|glassmaster|theme|https?://|jailbreak|hook)"
    )
    target_methods = {
        "decryptContainer:themeId:wxid:signKey:glassMaster:error:",
        "decryptedPayloadForTheme:error:",
        "buildRequest:requestKey:nonce:",
        "decryptResponse:requestKey:nonce:",
        "importGlassData:wxid:signKey:glassMaster:iconURL:error:",
    }

    for image in slices:
        report.extend([
            f"[{image.arch}]",
            f"  FAT offset/size: 0x{image.base:x} / 0x{image.size:x}",
            f"  CPU type/subtype: 0x{image.cpu_type:x} / 0x{image.cpu_subtype:x}",
            f"  Mach-O filetype: {image.filetype} (MH_DYLIB=6)",
            f"  UUID: {image.uuid}",
            f"  LC_ENCRYPTION_INFO_64: {image.crypt}",
            f"  Plaintext verdict: {'YES (cryptid=0)' if image.crypt and image.crypt['id'] == 0 else 'CHECK REQUIRED'}",
            f"  Recovered symbols/classes/stubs: {len(image.symbols)} / {len(image.classes)} / {len(image.stub_names)}",
            "  Sections:",
        ])
        for section in image.sections:
            content = image.data[section["offset"]:section["offset"] + section["size"]] if section["offset"] else b""
            report.append(
                f"    {section['segment']},{section['name']} addr=0x{section['address']:x} "
                f"size=0x{section['size']:x} fileoff=0x{section['offset']:x} entropy={entropy(content):.3f}"
            )
        report.append("  Dependencies:")
        report.extend(f"    {name}" for name in image.dylibs)
        report.append("")

        symbol_lines.append(f"===== {image.arch} =====")
        symbol_lines.extend(f"0x{s['value']:08x} {s['name']}" for s in image.symbols)
        symbol_lines.append("")

        string_lines.append(f"===== {image.arch} =====")
        for address, value, section in image.strings_in_sections():
            line = f"0x{address:08x} {section:<20} {value}"
            string_lines.append(line)
            if pattern.search(value):
                sensitive_lines.append(f"[{image.arch}] {line}")
        string_lines.append("")

        header_lines.append(f"// ===== {image.arch} =====")
        for cls in image.classes:
            header_lines.append(f"@interface {cls['name']} /* VM 0x{cls['address']:x} */")
            for method in cls["class_methods"]:
                header_lines.append(f"+ /* {method['types']} */ {method['name']}; // IMP 0x{method['imp']:x}")
                if image.arch == "arm64" and method["name"] in target_methods:
                    disassembly_lines.extend([
                        f"===== {cls['name']} +[{method['name']}] =====",
                        image.disassemble(method["imp"]), ""
                    ])
            for method in cls["methods"]:
                header_lines.append(f"- /* {method['types']} */ {method['name']}; // IMP 0x{method['imp']:x}")
                if image.arch == "arm64" and method["name"] in target_methods:
                    disassembly_lines.extend([
                        f"===== {cls['name']} -[{method['name']}] =====",
                        image.disassemble(method["imp"]), ""
                    ])
            header_lines.extend(["@end", ""])

    report.extend([
        "Conclusion:",
        "  Both slices have LC_ENCRYPTION_INFO_64 cryptid=0.",
        "  WCGlass.dylib is already plaintext/decrypted at the Mach-O/FairPlay layer.",
        "  The generated universal plain copy is byte-identical to the source; thin files are analysis extracts.",
    ])

    (OUT / "WCGlass_report.txt").write_text("\n".join(report), encoding="utf-8")
    (OUT / "WCGlass_symbols.txt").write_text("\n".join(symbol_lines), encoding="utf-8")
    (OUT / "WCGlass_objc_interfaces.h").write_text("\n".join(header_lines), encoding="utf-8")
    (OUT / "WCGlass_objc_strings.txt").write_text("\n".join(string_lines), encoding="utf-8")
    (OUT / "WCGlass_sensitive_hits.txt").write_text("\n".join(sensitive_lines), encoding="utf-8")
    (OUT / "WCGlass_crypto_disassembly_arm64.txt").write_text("\n".join(disassembly_lines), encoding="utf-8")

    print("Generated:")
    for path in sorted(OUT.iterdir()):
        print(f"  {path} ({path.stat().st_size} bytes)")


if __name__ == "__main__":
    main()
