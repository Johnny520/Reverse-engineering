"""Run constructor emulation, dump ALL memory regions, then search for the UIDs."""
import struct
import sys
import collections
from unicorn import *
from unicorn.arm64_const import *
from capstone import *

SO = r'/reverse/apk_extract/lib/arm64-v8a/libnative.so'
BASE = 0
STACK_TOP = 0x20000000
STACK_SIZE = 0x200000
HEAP_BASE = 0x30000000
HEAP_SIZE = 0x4000000
CODE_HOOKS_ADDR = 0x50000000

data = open(SO, 'rb').read()
e_phoff = struct.unpack('<Q', data[32:40])[0]
e_phentsize = struct.unpack('<H', data[54:56])[0]
e_phnum = struct.unpack('<H', data[56:58])[0]
e_shoff = struct.unpack('<Q', data[40:48])[0]
e_shentsize = struct.unpack('<H', data[58:60])[0]
e_shnum = struct.unpack('<H', data[60:62])[0]
e_shstrndx = struct.unpack('<H', data[62:64])[0]

def section(name):
    shstr_off = struct.unpack('<Q', data[e_shoff + e_shstrndx*e_shentsize + 24: e_shoff + e_shstrndx*e_shentsize + 32])[0]
    shstr = data[shstr_off:shstr_off+1000]
    for i in range(e_shnum):
        off = e_shoff + i*e_shentsize
        name_off = struct.unpack('<I', data[off:off+4])[0]
        nm = shstr[name_off:shstr.find(b'\x00', name_off)].decode('ascii', 'replace')
        if nm == name:
            return dict(addr=struct.unpack('<Q', data[off+16:off+24])[0],
                        off=struct.unpack('<Q', data[off+24:off+32])[0],
                        size=struct.unpack('<Q', data[off+32:off+40])[0],
                        link=struct.unpack('<I', data[off+40:off+44])[0])
    return None

mu = Uc(UC_ARCH_ARM64, UC_MODE_ARM)
def map_round(start, size):
    s = start & ~0xFFF
    e = (start + size + 0xFFF) & ~0xFFF
    mu.mem_map(s, e - s, UC_PROT_ALL)

for i in range(e_phnum):
    e = data[e_phoff + i*e_phentsize: e_phoff + (i+1)*e_phentsize]
    p_type = struct.unpack('<I', e[0:4])[0]
    if p_type != 1: continue
    p_offset = struct.unpack('<Q', e[8:16])[0]
    p_vaddr = struct.unpack('<Q', e[16:24])[0]
    p_filesz = struct.unpack('<Q', e[32:40])[0]
    p_memsz = struct.unpack('<Q', e[40:48])[0]
    map_round(p_vaddr, p_memsz)
    mu.mem_write(p_vaddr, data[p_offset:p_offset+p_filesz])
    if p_memsz > p_filesz:
        mu.mem_write(p_vaddr + p_filesz, bytes(p_memsz - p_filesz))
map_round(STACK_TOP - STACK_SIZE, STACK_SIZE)
map_round(HEAP_BASE, HEAP_SIZE)
map_round(CODE_HOOKS_ADDR, 0x10000)

dynsym = section('.dynsym')
dynstr = section('.dynstr')
strdata = data[dynstr['off']:dynstr['off']+dynstr['size']]
syms = []
for k in range(dynsym['size'] // 24):
    e = data[dynsym['off'] + k*24: dynsym['off'] + (k+1)*24]
    name_off = struct.unpack('<I', e[0:4])[0]
    info = e[4]
    shndx = struct.unpack('<H', e[6:8])[0]
    val = struct.unpack('<Q', e[8:16])[0]
    end = strdata.find(b'\x00', name_off)
    syms.append((strdata[name_off:end].decode('ascii', 'replace'), val, shndx, info))

rela = section('.rela.dyn')
for k in range(rela['size'] // 24):
    e = data[rela['off'] + k*24: rela['off'] + (k+1)*24]
    r_offset = struct.unpack('<Q', e[0:8])[0]
    r_info = struct.unpack('<Q', e[8:16])[0]
    r_addend = struct.unpack('<Q', e[16:24])[0]
    rtype = r_info & 0xffffffff
    sym = r_info >> 32
    if rtype == 1027:
        mu.mem_write(r_offset, struct.pack('<Q', (BASE + r_addend) & 0xFFFFFFFFFFFFFFFF))
    elif rtype == 1025:
        nm, val, shndx, info = syms[sym]
        mu.mem_write(r_offset, struct.pack('<Q', BASE + val if shndx != 0 else 0))

rela_plt = section('.rela.plt')
stub_addr = CODE_HOOKS_ADDR
import_names = {}
ret0 = bytes.fromhex('000080D2C0035FD6')
for k in range(rela_plt['size'] // 24):
    e = data[rela_plt['off'] + k*24: rela_plt['off'] + (k+1)*24]
    r_offset = struct.unpack('<Q', e[0:8])[0]
    r_info = struct.unpack('<Q', e[8:16])[0]
    nm = syms[r_info >> 32][0]
    mu.mem_write(r_offset, struct.pack('<Q', stub_addr))
    import_names[stub_addr] = nm
    mu.mem_write(stub_addr, ret0)
    stub_addr += 8

# patch exclusive insns
md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
md.detail = True
text_va = 0x5e9e90
text_off = 0x5e5e90
text_size = 1459096
code = data[text_off:text_off+text_size]

def enc_ldr(rt, rn): return struct.pack('<I', 0xF9400000 | (rn << 5) | rt)
def enc_ldrb(rt, rn): return struct.pack('<I', 0x39400000 | (rn << 5) | rt)
def enc_str(rt, rn): return struct.pack('<I', 0xF9000000 | (rn << 5) | rt)
def enc_strb(rt, rn): return struct.pack('<I', 0x39000000 | (rn << 5) | rt)

patched = 0
for insn in md.disasm(code, text_va):
    m = insn.mnemonic
    ops = insn.operands
    if m in ('ldxr','ldaxr','ldxrb','ldaxrb','ldxrh','ldaxrh'):
        rt, rn = ops[0].reg, ops[1].mem.base
        mu.mem_write(insn.address, enc_ldrb(rt, rn) if m.endswith('b') else enc_ldr(rt, rn))
        patched += 1
    elif m in ('stxr','stlxr','stxrb','stlxrb','stxrh','stlxrh'):
        rt, rn = ops[1].reg, ops[2].mem.base
        mu.mem_write(insn.address, enc_strb(rt, rn) if m.endswith('b') else enc_str(rt, rn))
        patched += 1

heap_cur = [HEAP_BASE]
def hook_import(uc, address, size, user_data):
    pc = uc.reg_read(UC_ARM64_REG_PC)
    name = import_names.get(pc, 'unknown@%x' % pc)
    x30 = uc.reg_read(UC_ARM64_REG_X30)
    if name == 'memcpy':
        dst, src, n = uc.reg_read(UC_ARM64_REG_X0), uc.reg_read(UC_ARM64_REG_X1), uc.reg_read(UC_ARM64_REG_X2)
        uc.mem_write(dst, bytes(uc.mem_read(src, n)))
        uc.reg_write(UC_ARM64_REG_X0, dst)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'memmove':
        dst, src, n = uc.reg_read(UC_ARM64_REG_X0), uc.reg_read(UC_ARM64_REG_X1), uc.reg_read(UC_ARM64_REG_X2)
        buf = bytes(uc.mem_read(src, n))
        uc.mem_write(dst, buf)
        uc.reg_write(UC_ARM64_REG_X0, dst)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'memset':
        dst, c, n = uc.reg_read(UC_ARM64_REG_X0), uc.reg_read(UC_ARM64_REG_X1) & 0xFF, uc.reg_read(UC_ARM64_REG_X2)
        uc.mem_write(dst, bytes([c]) * n)
        uc.reg_write(UC_ARM64_REG_X0, dst)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('mprotect',):
        uc.reg_write(UC_ARM64_REG_X0, 0)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'sysconf':
        uc.reg_write(UC_ARM64_REG_X0, 4096)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'malloc':
        n = uc.reg_read(UC_ARM64_REG_X0)
        addr = heap_cur[0]
        heap_cur[0] = (addr + n + 15) & ~15
        uc.reg_write(UC_ARM64_REG_X0, addr)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'calloc':
        nmem, sz = uc.reg_read(UC_ARM64_REG_X0), uc.reg_read(UC_ARM64_REG_X1)
        n = nmem * sz
        addr = heap_cur[0]
        heap_cur[0] = (addr + n + 15) & ~15
        uc.mem_write(addr, bytes(n))
        uc.reg_write(UC_ARM64_REG_X0, addr)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'realloc':
        n = uc.reg_read(UC_ARM64_REG_X1)
        addr = heap_cur[0]
        heap_cur[0] = (addr + n + 15) & ~15
        uc.reg_write(UC_ARM64_REG_X0, addr)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('free',):
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'memcmp':
        a, b, n = uc.reg_read(UC_ARM64_REG_X0), uc.reg_read(UC_ARM64_REG_X1), uc.reg_read(UC_ARM64_REG_X2)
        ba, bb = bytes(uc.mem_read(a, n)), bytes(uc.mem_read(b, n))
        uc.reg_write(UC_ARM64_REG_X0, (ba > bb) - (ba < bb))
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'strlen':
        a = uc.reg_read(UC_ARM64_REG_X0)
        n = 0
        while uc.mem_read(a + n, 1) != b'\x00':
            n += 1
        uc.reg_write(UC_ARM64_REG_X0, n)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('write', 'writev', 'fprintf', 'fflush', 'fwrite'):
        n = uc.reg_read(UC_ARM64_REG_X2) if name == 'write' else 0
        uc.reg_write(UC_ARM64_REG_X0, n)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('pthread_mutex_lock', 'pthread_mutex_unlock', 'pthread_key_create',
                'pthread_key_delete', 'pthread_rwlock_wrlock', 'pthread_rwlock_rdlock',
                'pthread_rwlock_unlock', 'pthread_getspecific', 'pthread_setspecific',
                'pthread_once'):
        uc.reg_write(UC_ARM64_REG_X0, 0)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('__cxa_atexit', '__cxa_finalize', '__register_atfork'):
        uc.reg_write(UC_ARM64_REG_X0, 0)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('__android_log_write', '__android_log_buf_write'):
        uc.reg_write(UC_ARM64_REG_X0, 0)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    uc.reg_write(UC_ARM64_REG_X0, 0)
    uc.reg_write(UC_ARM64_REG_PC, x30)

mu.hook_add(UC_HOOK_CODE, hook_import, begin=CODE_HOOKS_ADDR, end=CODE_HOOKS_ADDR + 0x10000)

mu.reg_write(UC_ARM64_REG_SP, STACK_TOP)
mu.reg_write(UC_ARM64_REG_X29, STACK_TOP)
mu.reg_write(UC_ARM64_REG_X30, 0)
mu.reg_write(UC_ARM64_REG_PC, 0x61b140)

insn_count = [0]
def trace(uc, address, size, user_data):
    insn_count[0] += 1
    if address == 0:
        uc.emu_stop()
mu.hook_add(UC_HOOK_CODE, trace, begin=0, end=0xffffffff)

try:
    mu.emu_start(0x61b140, 0, count=500_000_000, timeout=0)
    print('emulation done, insn=%d pc=%s' % (insn_count[0], hex(mu.reg_read(UC_ARM64_REG_PC))))
except UcError as e:
    print('UcError: %s at pc=0x%x' % (e, mu.reg_read(UC_ARM64_REG_PC)))

# ---- dump everything ----
enc = bytes(mu.mem_read(0x74e228, 0x58868))
open(r'reverse/enc_text_emulated.bin', 'wb').write(enc)
print('dumped enc_text (%d bytes)' % len(enc))

regions = {
    '.rodata': (0xb3be0, 0x5345496),
    '.data.rel.ro': (0x7aaec0, 0x2850),
    '.data': (0x7b1710, 0x3b270),
    '.bss': (0x7ec980, 0x4f5896),
    'heap': (HEAP_BASE, 0x4000000),
    'stack': (STACK_TOP - STACK_SIZE, STACK_SIZE),
}
mems = {}
for name, (va, sz) in regions.items():
    try:
        b = bytes(mu.mem_read(va, sz))
        mems[name] = b
        open(r'reverse/region_%s.bin' % name.strip('.'), 'wb').write(b)
        print('dumped %-14s %d bytes' % (name, len(b)))
    except UcError as e:
        print('dump failed %s: %s' % (name, e))

# ---- search UIDs ----
uids = ['101678685855','352278274647499','54958628116','2278652361052360','73661777070',
        '7065301951034','1421038059526764','92798131634584','4090639104360094','441355315194459',
        '460031372308109','2656032444144568','3725580158374477','2695624344480411','4110435720126523',
        '2783599609516180','4072238005355902','163161907137991','844869527668060','94376774936',
        '1388050638715280','1729947825644140']

def find_in(bufs, needle):
    for name, b in bufs.items():
        i = b.find(needle)
        if i >= 0:
            return name, i
    return None, None

print('\n=== UID search across ALL regions ===')
found_any = False
for u in uids:
    # ascii
    r = find_in(mems, u.encode())
    if r[0]:
        print('UID %-18s ASCII   -> %s+0x%x' % (u, r[0], r[1]))
        found_any = True
        continue
    # u64 LE
    for endian, label in [('<', 'LE'), ('>', 'BE')]:
        b = struct.pack(endian + 'Q', int(u))
        r = find_in(mems, b)
        if r[0]:
            print('UID %-18s u64%s -> %s+0x%x' % (u, label, r[0], r[1]))
            found_any = True
            break
        # also u32 if fits
        if int(u) < 0x100000000:
            b32 = struct.pack(endian + 'I', int(u))
            r = find_in(mems, b32)
            if r[0]:
                print('UID %-18s u32%s -> %s+0x%x' % (u, label, r[0], r[1]))
                found_any = True
                break
if not found_any:
    print('NONE of the 22 UIDs found in any dumped region.')
    print('Heuristic: search for shorter suffixes (last 9-11 digits) near string tables...')
    # Try last-10-digits as an alternate (some store as string with leading zeros / trimmed)
    for u in uids:
        tail10 = u[-10:]
        r = find_in(mems, tail10.encode())
        if r[0]:
            print('UID tail %-10s ASCII -> %s+0x%x' % (tail10, r[0], r[1]))
