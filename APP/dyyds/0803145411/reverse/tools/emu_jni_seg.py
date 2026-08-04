"""Check lock state after constructor, then run JNI_OnLoad in segments."""
import struct
import sys
from unicorn import *
from unicorn.arm64_const import *

# Build the emulator by executing emu_jni.py's setup up to the constructor run.
# Simpler: exec the whole file but replace the JNI_OnLoad emu_start with segmented run.
src = open(r'reverse/tools/emu_jni.py', encoding='utf-8').read()

# Replace the JNI_OnLoad run with a segmented version
old_run = """try:
    mu.emu_start(0x74e228, 0, count=800_000_000, timeout=0)
    print('JNI_OnLoad done pc=%s' % hex(mu.reg_read(UC_ARM64_REG_PC)))
except UcError as e:
    print('JNI_OnLoad UcError:', e, 'pc=', hex(mu.reg_read(UC_ARM64_REG_PC)))"""

new_run = """# segmented JNI_OnLoad run
print('lock 0x7ec958 before JNI_OnLoad =', struct.unpack('<I', bytes(mu.mem_read(0x7ec958, 4)))[0])
start = 0x74e228
seg = 20_000_000
total = 0
pc = start
while total < 800_000_000:
    try:
        mu.emu_start(pc, 0, count=seg, timeout=0)
    except UcError as e:
        print('JNI seg UcError:', e, 'at', hex(mu.reg_read(UC_ARM64_REG_PC)))
        break
    pc = mu.reg_read(UC_ARM64_REG_PC)
    total += seg
    if total % 60_000_000 == 0:
        print('  seg total=%d pc=%s lock=%d' % (total, hex(pc), struct.unpack('<I', bytes(mu.mem_read(0x7ec958, 4)))[0]))
    if pc == start:
        break
    # if pc is in the RwLock function or stuck, break early
    if 0x72ce6c <= pc <= 0x72cfd0:
        print('  STUCK in RwLock func pc=%s lock=%d' % (hex(pc), struct.unpack('<I', bytes(mu.mem_read(0x7ec958, 4)))[0]))
        break
print('JNI_OnLoad segmented done, total=%d pc=%s' % (total, hex(pc)))
mu.reg_write(UC_ARM64_REG_PC, 0x0)"""

src = src.replace(old_run, new_run)
exec(compile(src, 'emu_jni_seg', 'exec'))
