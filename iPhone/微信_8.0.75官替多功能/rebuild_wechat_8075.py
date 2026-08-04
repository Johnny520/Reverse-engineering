#!/usr/bin/env python3
"""重新提取微信 8.0.75 官替多功能组件，并分析 IPA 内全部 dylib。"""

from __future__ import annotations

import concurrent.futures
import gzip
import hashlib
import json
import os
import plistlib
import re
import shutil
import struct
import zipfile
from pathlib import Path

from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM


ROOT = Path(__file__).resolve().parent
IPA = next(ROOT.glob("*.ipa"))
SCREENSHOT = ROOT / "idlefish-msg-1785768681778.png.jpg"
PROJECT = ROOT / "微信_8.0.75官替多功能"
FEATURE_OUT = PROJECT / "微信_8.0.75功能提取"
ALL_OUT = FEATURE_OUT / "全部Dylib解密"
RAW_DYLIB = ALL_OUT / "原始已解密"
READABLE = ALL_OUT / "可读源码"


COMPONENTS = [
    ("01_Mikoto体验版", "Mikoto 体验版", ["Payload/WeChat.app/Frameworks/MikotoHelper.dylib"]),
    ("02_PKC", "PKC", ["Payload/WeChat.app/Frameworks/PKCWeChatTools.dylib"]),
    ("03_WCRefine", "WCRefine", ["Payload/WeChat.app/WCRefine.dylib"]),
    ("04_微信助手", "微信助手", [
        "Payload/WeChat.app/Frameworks/MiYou.dylib",
        "Payload/WeChat.app/Frameworks/wcplugins.dylib",
    ]),
    ("05_XOS", "XOS", ["Payload/WeChat.app/XOS.dylib"]),
    ("06_黄白助手", "黄白助手", ["Payload/WeChat.app/Frameworks/HBWechatHelper.dylib"]),
    ("07_Lab", "Lab", ["Payload/WeChat.app/000ThemeLab.dylib"]),
    ("08_主题盒子", "主题盒子", ["Payload/WeChat.app/Frameworks/ThemeBox.dylib"]),
    ("09_ThemePro主题", "ThemePro 主题", ["Payload/WeChat.app/Frameworks/libPineappleDylib.dylib"]),
    ("10_HBB无后台推送", "HBB 无后台推送", ["Payload/WeChat.app/Frameworks/HBB9.1.2.dylib"]),
    ("11_AFN", "AFN", ["Payload/WeChat.app/AFN.dylib", "Payload/WeChat.app/Frameworks/AFN.dylib"]),
    ("12_微信净化", "微信净化", ["Payload/WeChat.app/Frameworks/WCPureExtension.dylib"]),
    ("13_WCGlass液态玻璃", "WCGlass 液态玻璃", ["Payload/WeChat.app/WCGlass.dylib"]),
]

DESCRIPTIONS = {
    "Mikoto 体验版": "Mikoto 主体、插件管理及 MiYou 联动功能",
    "PKC": "撤回、群聊、步数、标签及其他微信增强功能",
    "WCRefine": "聊天与界面精修、插件管理和主题联动",
    "微信助手": "MiYou 助手主体与 wcplugins 插件注册入口",
    "XOS": "时间标签、Dock、卡片与主题联动界面增强",
    "黄白助手": "黄白助手主体、插件设置、备份和多媒体功能",
    "Lab": "ThemeLab/Lab 主题、DIY 与 Liquid Glass 适配",
    "主题盒子": "ThemeBox 主题盒子主体",
    "ThemePro 主题": "ThemePro/Pineapple 主题引擎",
    "HBB 无后台推送": "HBB 推送相关组件",
    "AFN": "AFN 工具集合，包含根目录版与 Frameworks 版",
    "微信净化": "WCPureExtension 微信净化组件",
    "WCGlass 液态玻璃": "WCGlass/WCLG 液态玻璃和主题组件",
}

SUPPORT = {
    "Payload/WeChat.app/Frameworks/libellekit.dylib": "ElleKit Hook 运行库",
    "Payload/WeChat.app/Frameworks/libJailedShim.dylib": "官替环境兼容层",
    "Payload/WeChat.app/libsubstrate.dylib": "Substrate Hook 兼容库",
}


def sha256(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest()


def zstr(data: bytes, off: int, end_limit: int | None = None) -> str:
    if off < 0 or off >= len(data):
        return ""
    end = data.find(b"\0", off, end_limit or len(data))
    if end < 0:
        end = end_limit or len(data)
    return data[off:end].decode("utf-8", "replace")


def select_slice(data: bytes) -> tuple[bytes, dict | None]:
    magic = data[:4]
    if magic not in {b"\xca\xfe\xba\xbe", b"\xbe\xba\xfe\xca"}:
        return data, None
    endian = ">" if magic == b"\xca\xfe\xba\xbe" else "<"
    nfat = struct.unpack_from(endian + "I", data, 4)[0]
    slices = []
    p = 8
    for _ in range(nfat):
        cputype, cpusubtype, off, size, align = struct.unpack_from(endian + "IIIII", data, p)
        slices.append({"cputype": cputype, "cpusubtype": cpusubtype, "offset": off, "size": size, "align": align})
        p += 20
    chosen = next((x for x in slices if x["cputype"] == 0x0100000C and x["cpusubtype"] == 0), slices[0])
    return data[chosen["offset"]:chosen["offset"] + chosen["size"]], {
        "format": "Fat Mach-O", "slices": slices, "selected": chosen,
    }


def parse_macho(data: bytes) -> dict:
    magic = data[:4]
    if magic == b"\xcf\xfa\xed\xfe":
        endian = "<"
    elif magic == b"\xfe\xed\xfa\xcf":
        endian = ">"
    else:
        raise ValueError("not a supported 64-bit Mach-O")
    vals = struct.unpack_from(endian + "IiiIIIII", data, 0)
    _, cputype, cpusubtype, filetype, ncmds, sizeofcmds, flags, _ = vals
    off = 32
    sections, deps, symbols = [], [], []
    symtab = None
    dylib_id = None
    cryptid = None
    cryptoff = None
    cryptsize = None
    uuid = None
    for _ in range(ncmds):
        if off + 8 > len(data):
            break
        cmd, cmdsize = struct.unpack_from(endian + "II", data, off)
        if cmdsize < 8 or off + cmdsize > len(data):
            break
        bare = cmd & 0x7FFFFFFF
        if bare == 0x19:
            segname = data[off + 8:off + 24].split(b"\0", 1)[0].decode("ascii", "replace")
            nsects = struct.unpack_from(endian + "I", data, off + 64)[0]
            sp = off + 72
            for _si in range(nsects):
                sectname = data[sp:sp + 16].split(b"\0", 1)[0].decode("ascii", "replace")
                secseg = data[sp + 16:sp + 32].split(b"\0", 1)[0].decode("ascii", "replace")
                addr, size = struct.unpack_from(endian + "QQ", data, sp + 32)
                offset, align, _, _, secflags, _, _, _ = struct.unpack_from(endian + "IIIIIIII", data, sp + 48)
                sections.append({"segment": secseg or segname, "section": sectname, "addr": addr,
                                 "size": size, "offset": offset, "align": align, "flags": hex(secflags)})
                sp += 80
        elif bare in {0xC, 0xD, 0x18, 0x1F, 0x23} and cmdsize >= 24:
            nameoff = struct.unpack_from(endian + "I", data, off + 8)[0]
            name = zstr(data, off + nameoff, off + cmdsize)
            if bare == 0xD:
                dylib_id = name
            elif name:
                deps.append(name)
        elif bare == 0x2 and cmdsize >= 24:
            symoff, nsyms, stroff, strsize = struct.unpack_from(endian + "IIII", data, off + 8)
            symtab = {"symoff": symoff, "nsyms": nsyms, "stroff": stroff, "strsize": strsize}
        elif bare in {0x21, 0x2C} and cmdsize >= 20:
            cryptoff, cryptsize, cryptid = struct.unpack_from(endian + "III", data, off + 8)
        elif bare == 0x1B and cmdsize >= 24:
            raw = data[off + 8:off + 24].hex().upper()
            uuid = f"{raw[:8]}-{raw[8:12]}-{raw[12:16]}-{raw[16:20]}-{raw[20:]}"
        off += cmdsize
    if symtab:
        str_end = min(len(data), symtab["stroff"] + symtab["strsize"])
        for i in range(symtab["nsyms"]):
            p = symtab["symoff"] + i * 16
            if p + 16 > len(data):
                break
            strx, n_type, n_sect, n_desc, n_value = struct.unpack_from(endian + "IBBHQ", data, p)
            name = zstr(data, symtab["stroff"] + strx, str_end) if strx else ""
            if name:
                symbols.append({"address": n_value, "type": n_type, "section": n_sect,
                                "desc": n_desc, "name": name})
    return {
        "format": "Mach-O 64-bit", "arch": "arm64" if (cputype & 0xFFFFFFFF) == 0x0100000C else hex(cputype),
        "cpu_subtype": cpusubtype & 0xFFFFFFFF, "filetype": filetype, "ncmds": ncmds,
        "sizeofcmds": sizeofcmds, "flags": hex(flags), "uuid": uuid, "dylib_id": dylib_id,
        "cryptoff": cryptoff, "cryptsize": cryptsize, "cryptid": cryptid,
        "dependencies": deps, "sections": sections, "symbols": symbols,
    }


def section_data(data: bytes, info: dict, name: str) -> tuple[dict | None, bytes]:
    for sec in info["sections"]:
        if sec["section"] == name:
            a, b = sec["offset"], sec["offset"] + sec["size"]
            return sec, data[a:min(b, len(data))]
    return None, b""


def executable_text(data: bytes, info: dict) -> tuple[dict | None, bytes]:
    sec, blob = section_data(data, info, "__text")
    if sec:
        return sec, blob
    candidates = []
    for s in info["sections"]:
        flags = int(s["flags"], 16)
        if s["segment"] == "__TEXT" and (flags & 0x80000000 or flags & 0x400):
            candidates.append(s)
    if not candidates:
        return None, b""
    sec = max(candidates, key=lambda x: x["size"])
    a, b = sec["offset"], sec["offset"] + sec["size"]
    return sec, data[a:min(b, len(data))]


def null_strings(blob: bytes, minlen: int = 2) -> list[str]:
    out = []
    for raw in blob.split(b"\0"):
        if len(raw) >= minlen:
            s = raw.decode("utf-8", "ignore").strip()
            if s and s not in out:
                out.append(s)
    return out


def ascii_strings(data: bytes) -> list[str]:
    return [m.group().decode("utf-8", "ignore") for m in re.finditer(rb"[\x20-\x7e]{4,}", data)]


def utf16_strings(data: bytes) -> list[str]:
    pat = re.compile(rb"(?:(?:[\x20-\x7e]\x00)|(?:[\x00-\xff][\x30-\x9f])){4,}")
    out = []
    for m in pat.finditer(data):
        s = m.group().decode("utf-16le", "ignore").strip("\x00 \r\n\t")
        if s:
            out.append(s)
    return out


def objc_header(classes: list[str], methods: list[str], strings: list[str]) -> str:
    grouped: dict[str, set[tuple[str, str]]] = {}
    pat = re.compile(r"([+-])\[([^\]\s]+)\s+([^\]]+)\]")
    for s in strings:
        for m in pat.finditer(s):
            grouped.setdefault(m.group(2), set()).add((m.group(1), m.group(3)))
    lines = ["// 自动恢复的 Objective-C 接口骨架", "#import <Foundation/Foundation.h>", ""]
    for cls in sorted(set(classes) | set(grouped)):
        if not re.fullmatch(r"[A-Za-z_$][A-Za-z0-9_$]*", cls):
            continue
        lines.append(f"@interface {cls} : NSObject")
        for sign, selector in sorted(grouped.get(cls, set())):
            if ":" in selector:
                parts = selector.split(":")[:-1]
                decl = sign + " (id)" + parts[0] + ":(id)arg0"
                for i, part in enumerate(parts[1:], 1):
                    decl += f" {part}:(id)arg{i}"
                lines.append(decl + ";")
            else:
                lines.append(f"{sign} (id){selector};")
        lines += ["@end", ""]
    lines.append("// 未可靠归属到具体类的 selector：")
    lines.extend(f"// {x}" for x in sorted(set(methods)))
    return "\n".join(lines) + "\n"


def pseudo_index(info: dict, text_sec: dict | None) -> str:
    lines = ["/* 自动恢复的函数源码索引。完整行为见 ARM64 反汇编。 */", "#include <stdint.h>", ""]
    if not text_sec:
        return "\n".join(lines)
    start, end = text_sec["addr"], text_sec["addr"] + text_sec["size"]
    funcs = sorted(set((s["address"], s["name"]) for s in info["symbols"] if start <= s["address"] < end))
    for i, (addr, name) in enumerate(funcs):
        nxt = funcs[i + 1][0] if i + 1 < len(funcs) else end
        safe = re.sub(r"[^A-Za-z0-9_]", "_", name).strip("_") or f"sub_{addr:x}"
        lines.append(f"// VA 0x{addr:016X}, size≈0x{max(0, nxt-addr):X}, original: {name}")
        lines.append(f"void {safe}(void) {{ /* 见反汇编地址 0x{addr:X} */ }}\n")
    return "\n".join(lines)


def output_name(zip_path: str, duplicate: bool) -> str:
    base = os.path.basename(zip_path)
    if not duplicate:
        return base
    stem, ext = os.path.splitext(base)
    where = "Frameworks" if "/Frameworks/" in zip_path else "根目录"
    return f"{stem}_{where}{ext}"


def analyze_dylib(job: tuple[str, str, bytes]) -> dict:
    zip_path, name, original = job
    raw_path = RAW_DYLIB / name
    unit = READABLE / name
    unit.mkdir(parents=True, exist_ok=True)
    RAW_DYLIB.mkdir(parents=True, exist_ok=True)
    raw_path.write_bytes(original)
    thin, fat = select_slice(original)
    info = parse_macho(thin)
    if fat:
        info["fat_container"] = fat
    text_sec, text = executable_text(thin, info)
    _, cls_blob = section_data(thin, info, "__objc_classname")
    _, meth_blob = section_data(thin, info, "__objc_methname")
    _, type_blob = section_data(thin, info, "__objc_methtype")
    classes = null_strings(cls_blob)
    methods = null_strings(meth_blob)
    types = null_strings(type_blob)
    astr = ascii_strings(thin)
    ustr = utf16_strings(thin)

    full_info = dict(info)
    full_info.update({"source_in_ipa": zip_path, "output_binary": str(raw_path),
                      "size": len(original), "sha256": sha256(original)})
    (unit / "MachO完整信息.json").write_text(json.dumps(full_info, ensure_ascii=False, indent=2), encoding="utf-8")
    (unit / "依赖库.txt").write_text("\n".join(info["dependencies"]) + "\n", encoding="utf-8")
    with (unit / "符号表.txt").open("w", encoding="utf-8", newline="\n") as f:
        for s in info["symbols"]:
            f.write(f"0x{s['address']:016X}\ttype=0x{s['type']:02X}\tsect={s['section']}\t{s['name']}\n")
    (unit / "ObjC接口恢复.h").write_text(objc_header(classes, methods, astr), encoding="utf-8")
    (unit / "ObjC类名.txt").write_text("\n".join(classes) + "\n", encoding="utf-8")
    (unit / "ObjC方法.txt").write_text("\n".join(methods) + "\n", encoding="utf-8")
    (unit / "ObjC类型编码.txt").write_text("\n".join(types) + "\n", encoding="utf-8")
    (unit / "伪代码索引.c").write_text(pseudo_index(info, text_sec), encoding="utf-8")
    with gzip.open(unit / "字符串_完整.txt.gz", "wt", encoding="utf-8", newline="\n", compresslevel=6) as f:
        f.write("[ASCII]\n")
        for s in astr:
            f.write(s + "\n")
        f.write("\n[UTF-16LE]\n")
        for s in ustr:
            f.write(s + "\n")

    labels = {}
    if text_sec:
        for s in info["symbols"]:
            if text_sec["addr"] <= s["address"] < text_sec["addr"] + text_sec["size"]:
                labels.setdefault(s["address"], []).append(s["name"])
    ins_count = 0
    with gzip.open(unit / "反汇编_ARM64_完整.asm.gz", "wt", encoding="utf-8", newline="\n", compresslevel=5) as f:
        f.write(f"; source: {zip_path}\n; code VA: 0x{(text_sec or {}).get('addr', 0):X}\n\n")
        if text_sec and text:
            md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
            md.skipdata = True
            for addr, _, mnemonic, op_str in md.disasm_lite(text, text_sec["addr"]):
                for label in labels.get(addr, []):
                    f.write(f"\n{label}:\n")
                f.write(f"0x{addr:016X}:\t{mnemonic:<9}\t{op_str}\n")
                ins_count += 1
    status = "cryptid=0，明文 Mach-O" if info["cryptid"] == 0 else (
        "未设置 LC_ENCRYPTION_INFO，按明文 Mach-O 处理" if info["cryptid"] is None else f"cryptid={info['cryptid']}"
    )
    readme = [
        f"# {name}", "", f"- IPA 路径：`{zip_path}`", f"- 大小：{len(original)} 字节",
        f"- SHA-256：`{sha256(original)}`", f"- 架构：{info['arch']}", f"- 解密状态：{status}",
        f"- Objective-C 类：{len(classes)}", f"- Objective-C selector：{len(methods)}",
        f"- 符号：{len(info['symbols'])}", f"- 反汇编指令：{ins_count}", "",
        "## 文件说明", "", "- `ObjC接口恢复.h`：类和方法接口骨架。",
        "- `伪代码索引.c`：符号地址和函数骨架。", "- `反汇编_ARM64_完整.asm.gz`：完整指令文本。",
        "- `字符串_完整.txt.gz`：ASCII 与 UTF-16LE 字符串。", "- `MachO完整信息.json`：节区、符号、依赖和加密状态。",
    ]
    (unit / "README.md").write_text("\n".join(readme) + "\n", encoding="utf-8")
    return {"ipa_path": zip_path, "name": name, "binary": str(raw_path), "source_dir": str(unit),
            "size": len(original), "sha256": sha256(original), "arch": info["arch"],
            "cryptid": info["cryptid"], "classes": len(classes), "methods": len(methods),
            "symbols": len(info["symbols"]), "instructions": ins_count, "dependencies": info["dependencies"]}


def custom_dependency(dep: str, names: set[str]) -> str | None:
    base = os.path.basename(dep)
    for p in [f"Payload/WeChat.app/{base}", f"Payload/WeChat.app/Frameworks/{base}"]:
        if p in names:
            return p
    return None


def feature_strings(data: bytes, display: str) -> list[str]:
    keys = {
        "Mikoto 体验版": ["mikoto", "pjplugin", "miyou"], "PKC": ["pkc", "revoke", "step"],
        "WCRefine": ["wcrefine", "voiceglow", "themebox"], "微信助手": ["miyou", "wcplugin"],
        "XOS": ["xzy", "cadis", "dock"], "黄白助手": ["hbwechat", "pluginconfig", "thehbversion"],
        "Lab": ["themelab", "liquid glass", "thememix"], "主题盒子": ["themebox", "themeversion"],
        "ThemePro 主题": ["pineapple", "onepiece", "theme"], "HBB 无后台推送": ["hbb", "push", "notification"],
        "AFN": ["afn", "screenshot", "calculator"], "微信净化": ["wcpure", "pure", "clean"],
        "WCGlass 液态玻璃": ["wclg", "wcglass", "glass"],
    }[display]
    out = []
    for m in re.finditer(rb"[ -~]{5,220}", data):
        s = " ".join(m.group().decode("utf-8", "ignore").split())
        if s and any(k in s.lower() for k in keys) and s not in out:
            out.append(s)
        if len(out) >= 220:
            break
    return out


def extract_features(zf: zipfile.ZipFile, names: set[str]) -> dict:
    manifest = {"source_ipa": str(IPA), "ipa_sha256": sha256(IPA.read_bytes()), "components": []}
    meta = FEATURE_OUT / "00_应用元信息"
    meta.mkdir(parents=True, exist_ok=True)
    for src in ["Payload/WeChat.app/Info.plist", "Payload/WeChat.app/embedded.mobileprovision"]:
        if src in names:
            (meta / os.path.basename(src)).write_bytes(zf.read(src))
    for folder, display, paths in COMPONENTS:
        comp = FEATURE_OUT / folder
        main_dir, dep_dir, ana_dir = comp / "主文件", comp / "依赖", comp / "分析"
        main_dir.mkdir(parents=True, exist_ok=True)
        ana_dir.mkdir(parents=True, exist_ok=True)
        counts = {}
        for src in paths:
            counts[os.path.basename(src)] = counts.get(os.path.basename(src), 0) + 1
        record = {"name": display, "folder": folder, "files": [], "dependencies": []}
        deps = set()
        hints = []
        for src in paths:
            data = zf.read(src)
            name = output_name(src, counts[os.path.basename(src)] > 1)
            dst = main_dir / name
            dst.write_bytes(data)
            thin, fat = select_slice(data)
            info = parse_macho(thin)
            if fat:
                info["fat_container"] = fat
            record["files"].append({"source": src, "output": str(dst), "size": len(data),
                                    "sha256": sha256(data), "macho": info})
            hints += [f"### {name}"] + feature_strings(thin, display) + [""]
            for dep in info["dependencies"]:
                zp = custom_dependency(dep, names)
                if zp and zp not in paths:
                    deps.add(zp)
        for src in sorted(deps):
            dep_dir.mkdir(parents=True, exist_ok=True)
            data = zf.read(src)
            dst = dep_dir / os.path.basename(src)
            dst.write_bytes(data)
            record["dependencies"].append({"source": src, "output": str(dst), "size": len(data), "sha256": sha256(data)})
        (ana_dir / "字符串与功能线索.txt").write_text("\n".join(hints), encoding="utf-8")
        (ana_dir / "组件清单.json").write_text(json.dumps(record, ensure_ascii=False, indent=2), encoding="utf-8")
        manifest["components"].append(record)
    shared = FEATURE_OUT / "99_公共运行依赖"
    shared.mkdir(parents=True, exist_ok=True)
    for src, note in SUPPORT.items():
        if src in names:
            (shared / os.path.basename(src)).write_bytes(zf.read(src))
    (shared / "说明.txt").write_text("包含 ElleKit、JailedShim 和 Substrate 等插件公共运行依赖。\n", encoding="utf-8")
    try:
        p = plistlib.loads(zf.read("Payload/WeChat.app/Info.plist"))
        manifest["app_info"] = {k: p.get(k) for k in ["CFBundleIdentifier", "CFBundleShortVersionString", "CFBundleVersion", "CFBundleExecutable"]}
    except Exception as e:
        manifest["app_info_error"] = repr(e)
    if "Payload/WeChat.app/WeChat" in names:
        main_data = zf.read("Payload/WeChat.app/WeChat")
        thin, fat = select_slice(main_data)
        info = parse_macho(thin)
        if fat:
            info["fat_container"] = fat
        manifest["wechat_executable"] = {"sha256": sha256(main_data), "size": len(main_data), "macho": info}
    (FEATURE_OUT / "完整提取清单.json").write_text(json.dumps(manifest, ensure_ascii=False, indent=2), encoding="utf-8")
    return manifest


def make_feature_doc(manifest: dict) -> None:
    app = manifest.get("app_info", {})
    lines = ["# 微信 8.0.75 多功能 IPA：功能提取与文件说明", "",
             f"- 原始 IPA：`{IPA}`", f"- 输出目录：`{FEATURE_OUT}`",
             f"- IPA SHA-256：`{manifest['ipa_sha256']}`",
             f"- Bundle ID：`{app.get('CFBundleIdentifier', '')}`",
             f"- 版本：`{app.get('CFBundleShortVersionString', '')}`（Build `{app.get('CFBundleVersion', '')}`）", "",
             "## 功能映射", "", "| 文件夹 | 功能 | 主文件 | 介绍 |", "|---|---|---|---|"]
    for c in manifest["components"]:
        mains = "、".join(os.path.basename(x["output"]) for x in c["files"])
        lines.append(f"| `{c['folder']}` | {c['name']} | `{mains}` | {DESCRIPTIONS[c['name']]} |")
    lines += ["", "## 文件夹说明", "", "- `主文件/`：从 IPA 原样提取的功能二进制。",
              "- `依赖/`：根据 LC_LOAD_DYLIB 自动复制的自定义依赖。",
              "- `分析/组件清单.json`：架构、UUID、加密状态、符号和依赖。",
              "- `分析/字符串与功能线索.txt`：功能关键词、类名和方法线索。", "",
              "## 全部 dylib", "", f"全部 dylib 结果位于：`{ALL_OUT}`。", ""]
    (FEATURE_OUT / "功能映射与文件说明.md").write_text("\n".join(lines), encoding="utf-8")


def validate_features(manifest: dict) -> None:
    errors, checked = [], 0
    with zipfile.ZipFile(IPA) as zf:
        for c in manifest["components"]:
            for f in c["files"]:
                disk, arc = Path(f["output"]).read_bytes(), zf.read(f["source"])
                checked += 1
                if disk != arc or sha256(disk) != f["sha256"]:
                    errors.append(f["source"])
            for d in c["dependencies"]:
                disk, arc = Path(d["output"]).read_bytes(), zf.read(d["source"])
                checked += 1
                if disk != arc or sha256(disk) != d["sha256"]:
                    errors.append(d["source"])
    text = f"checked={checked}\nerrors={len(errors)}\nresult={'PASS' if not errors else 'FAIL'}\n" + "\n".join(errors)
    (FEATURE_OUT / "校验报告.txt").write_text(text, encoding="utf-8")


def make_dylib_doc(results: list[dict]) -> None:
    lines = ["# IPA 内全部 `.dylib` 解密与源码恢复报告", "", f"- 原始 IPA：`{IPA}`",
             f"- 输出目录：`{ALL_OUT}`", f"- dylib 数量：{len(results)}",
             "- 所有文件均已提取，并生成 Objective-C 接口、符号表、字符串和完整 ARM64 反汇编。", "",
             "## 总表", "", "| IPA 内路径 | 输出名 | cryptid | 类 | 方法 | 符号 | 指令 |",
             "|---|---|---:|---:|---:|---:|---:|"]
    for r in results:
        crypt = "0（明文）" if r["cryptid"] == 0 else ("无加密命令" if r["cryptid"] is None else str(r["cryptid"]))
        lines.append(f"| `{r['ipa_path']}` | `{r['name']}` | {crypt} | {r['classes']} | {r['methods']} | {r['symbols']} | {r['instructions']} |")
    lines += ["", "## 输出说明", "", "- `原始已解密/`：全部 dylib 原始字节。",
              "- `可读源码/<dylib>/ObjC接口恢复.h`：类与方法声明骨架。",
              "- `可读源码/<dylib>/伪代码索引.c`：函数地址索引。",
              "- `可读源码/<dylib>/反汇编_ARM64_完整.asm.gz`：完整反汇编。",
              "- `可读源码/<dylib>/字符串_完整.txt.gz`：完整字符串。", ""]
    (ALL_OUT / "全部Dylib解密报告.md").write_text("\n".join(lines), encoding="utf-8")


def validate_dylibs(results: list[dict]) -> None:
    errors, gz_ok = [], 0
    with zipfile.ZipFile(IPA) as zf:
        for r in results:
            disk, arc = Path(r["binary"]).read_bytes(), zf.read(r["ipa_path"])
            if disk != arc or sha256(disk) != r["sha256"]:
                errors.append("HASH " + r["ipa_path"])
            for fn in ["反汇编_ARM64_完整.asm.gz", "字符串_完整.txt.gz"]:
                p = Path(r["source_dir"]) / fn
                try:
                    with gzip.open(p, "rb") as f:
                        while f.read(1024 * 1024):
                            pass
                    gz_ok += 1
                except Exception as e:
                    errors.append("GZIP " + str(p) + " " + repr(e))
    lines = [f"dylib_count={len(results)}", f"binary_hash_checks={len(results)}",
             f"gzip_integrity_checks={gz_ok}", f"instruction_total={sum(r['instructions'] for r in results)}",
             f"errors={len(errors)}", f"result={'PASS' if not errors else 'FAIL'}"] + errors
    (ALL_OUT / "全部Dylib校验报告.txt").write_text("\n".join(lines) + "\n", encoding="utf-8")


def project_readme(manifest: dict, results: list[dict]) -> None:
    total_instructions = sum(r["instructions"] for r in results)
    lines = ["# 微信 8.0.75 官替多功能提取与 dylib 解密项目", "",
             "> 本目录包含原始 IPA、截图中的 13 组功能组件、全部 18 个 dylib、Objective-C 接口恢复、符号、字符串及完整 ARM64 反汇编。", "",
             "## 快速查看", "",
             "1. [功能映射与文件说明](./微信_8.0.75功能提取/功能映射与文件说明.md)",
             "2. [全部 dylib 解密报告](./微信_8.0.75功能提取/全部Dylib解密/全部Dylib解密报告.md)",
             "3. [全部 dylib 校验报告](./微信_8.0.75功能提取/全部Dylib解密/全部Dylib校验报告.txt)", "",
             "## 处理结果", "", f"- 截图功能：{len(COMPONENTS)} 组",
             f"- dylib：{len(results)} 个", f"- ARM64 指令：{total_instructions:,} 条",
             f"- IPA SHA-256：`{manifest['ipa_sha256']}`", "",
             "## 截图功能", ""]
    lines.extend(f"- {display}：{DESCRIPTIONS[display]}" for _, display, _ in COMPONENTS)
    lines += ["", "## 目录", "", "```text", "微信_8.0.75官替多功能/",
              "├─ 微信_8.0.75官替多功能.ipa", "├─ idlefish-msg-1785768681778.png.jpg",
              "├─ rebuild_wechat_8075.py", "└─ 微信_8.0.75功能提取/",
              "   ├─ 01_Mikoto体验版 ... 13_WCGlass液态玻璃", "   ├─ 99_公共运行依赖",
              "   └─ 全部Dylib解密/", "      ├─ 原始已解密", "      └─ 可读源码", "```", ""]
    (PROJECT / "README.md").write_text("\n".join(lines), encoding="utf-8")


def main() -> None:
    PROJECT.mkdir(parents=True, exist_ok=True)
    FEATURE_OUT.mkdir(parents=True, exist_ok=True)
    for src in [IPA, SCREENSHOT]:
        if src.exists():
            dst = PROJECT / src.name
            if not dst.exists() or dst.stat().st_size != src.stat().st_size:
                shutil.copy2(src, dst)
    shutil.copy2(Path(__file__), PROJECT / Path(__file__).name)

    with zipfile.ZipFile(IPA) as zf:
        names = set(zf.namelist())
        manifest = extract_features(zf, names)
        dylibs = [i for i in zf.infolist() if i.filename.lower().endswith(".dylib")]
        counts = {}
        for i in dylibs:
            counts[os.path.basename(i.filename)] = counts.get(os.path.basename(i.filename), 0) + 1
        jobs = [(i.filename, output_name(i.filename, counts[os.path.basename(i.filename)] > 1), zf.read(i)) for i in dylibs]
    make_feature_doc(manifest)
    validate_features(manifest)

    results = []
    with concurrent.futures.ProcessPoolExecutor(max_workers=min(3, os.cpu_count() or 2)) as ex:
        for r in ex.map(analyze_dylib, jobs):
            results.append(r)
            print(f"[{len(results)}/{len(jobs)}] {r['name']} instructions={r['instructions']}", flush=True)
    results.sort(key=lambda x: x["ipa_path"])
    (ALL_OUT / "全部Dylib清单.json").write_text(json.dumps(results, ensure_ascii=False, indent=2), encoding="utf-8")
    make_dylib_doc(results)
    validate_dylibs(results)
    project_readme(manifest, results)
    print(f"DONE: {PROJECT}")


if __name__ == "__main__":
    main()
