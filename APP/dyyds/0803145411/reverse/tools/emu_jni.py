"""Emulate constructor then JNI_OnLoad with a fake JNIEnv, dumping results."""
import struct
import sys
import collections
from unicorn import *
from unicorn.arm64_const import *
from capstone import *

SO = r'reverse/apk_extract/lib/arm64-v8a/libnative.so'
BASE = 0
STACK_TOP = 0x20000000
STACK_SIZE = 0x400000
HEAP_BASE = 0x30000000
HEAP_SIZE = 0x8000000
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
map_round(0x53000000, 0x40000)

dynsym = section('.dynsym'); dynstr = section('.dynstr')
strdata = data[dynstr['off']:dynstr['off']+dynstr['size']]
syms = []
for k in range(dynsym['size'] // 24):
    e = data[dynsym['off'] + k*24: dynsym['off'] + (k+1)*24]
    name_off = struct.unpack('<I', e[0:4])[0]
    info = e[4]; shndx = struct.unpack('<H', e[6:8])[0]
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

# NOTE: exclusive-access instructions (ldaxr/stxr etc.) are left UNPATCHED.
# Earlier emulation failed on them only because of a mem_protect+icache bug
# in unicorn on Windows; under PROT_ALL they execute correctly, and patching
# them breaks Rust's RwLock CAS logic (which caused JNI_OnLoad to spin forever).

# ---- import handlers ----
heap_cur = [HEAP_BASE]
STOP_SENTINEL = CODE_HOOKS_ADDR + 0xf000
import_call_log = []

def hook_import(uc, address, size, user_data):
    pc = uc.reg_read(UC_ARM64_REG_PC)
    if pc == STOP_SENTINEL:
        print('STOP at sentinel, prev_ret=0x%x' % uc.reg_read(UC_ARM64_REG_X30))
        uc.emu_stop()
        return
    name = import_names.get(pc, 'unknown@%x' % pc)
    if name != 'unknown@%x' % pc:
        if not import_call_log or import_call_log[-1] != name:
            import_call_log.append(name)
    x30 = uc.reg_read(UC_ARM64_REG_X30)
    if name == 'memcpy':
        dst, src, n = uc.reg_read(UC_ARM64_REG_X0), uc.reg_read(UC_ARM64_REG_X1), uc.reg_read(UC_ARM64_REG_X2)
        uc.mem_write(dst, bytes(uc.mem_read(src, n)))
        uc.reg_write(UC_ARM64_REG_X0, dst); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'memmove':
        dst, src, n = uc.reg_read(UC_ARM64_REG_X0), uc.reg_read(UC_ARM64_REG_X1), uc.reg_read(UC_ARM64_REG_X2)
        buf = bytes(uc.mem_read(src, n)); uc.mem_write(dst, buf)
        uc.reg_write(UC_ARM64_REG_X0, dst); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'memset':
        dst, c, n = uc.reg_read(UC_ARM64_REG_X0), uc.reg_read(UC_ARM64_REG_X1) & 0xFF, uc.reg_read(UC_ARM64_REG_X2)
        uc.mem_write(dst, bytes([c]) * n)
        uc.reg_write(UC_ARM64_REG_X0, dst); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'mprotect':
        uc.reg_write(UC_ARM64_REG_X0, 0); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'sysconf':
        uc.reg_write(UC_ARM64_REG_X0, 4096); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'malloc':
        n = uc.reg_read(UC_ARM64_REG_X0); addr = heap_cur[0]; heap_cur[0] = (addr + n + 15) & ~15
        uc.reg_write(UC_ARM64_REG_X0, addr); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'calloc':
        nmem, sz = uc.reg_read(UC_ARM64_REG_X0), uc.reg_read(UC_ARM64_REG_X1)
        n = nmem * sz; addr = heap_cur[0]; heap_cur[0] = (addr + n + 15) & ~15
        uc.mem_write(addr, bytes(n)); uc.reg_write(UC_ARM64_REG_X0, addr); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'realloc':
        n = uc.reg_read(UC_ARM64_REG_X1); addr = heap_cur[0]; heap_cur[0] = (addr + n + 15) & ~15
        uc.reg_write(UC_ARM64_REG_X0, addr); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'free':
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'memcmp':
        a, b, n = uc.reg_read(UC_ARM64_REG_X0), uc.reg_read(UC_ARM64_REG_X1), uc.reg_read(UC_ARM64_REG_X2)
        ba, bb = bytes(uc.mem_read(a, n)), bytes(uc.mem_read(b, n))
        uc.reg_write(UC_ARM64_REG_X0, (ba > bb) - (ba < bb)); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'strlen':
        a = uc.reg_read(UC_ARM64_REG_X0); n = 0
        while uc.mem_read(a + n, 1) != b'\x00': n += 1
        uc.reg_write(UC_ARM64_REG_X0, n); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('write', 'writev', 'fprintf', 'fflush', 'fwrite'):
        n = uc.reg_read(UC_ARM64_REG_X2) if name == 'write' else 0
        uc.reg_write(UC_ARM64_REG_X0, n); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('pthread_mutex_lock', 'pthread_mutex_unlock', 'pthread_key_create',
                'pthread_key_delete', 'pthread_rwlock_wrlock', 'pthread_rwlock_rdlock',
                'pthread_rwlock_unlock', 'pthread_getspecific', 'pthread_setspecific', 'pthread_once'):
        uc.reg_write(UC_ARM64_REG_X0, 0); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('__cxa_atexit', '__cxa_finalize', '__register_atfork'):
        uc.reg_write(UC_ARM64_REG_X0, 0); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('__android_log_write', '__android_log_buf_write'):
        uc.reg_write(UC_ARM64_REG_X0, 0); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('dlsym','dladdr','dl_iterate_phdr','getenv','getauxval','clock_gettime',
                'read','open','close','lseek64','fstat','stat','fstatat','readdir','opendir',
                'dirfd','chmod','mkdir','realpath','readlink','getcwd','unlink','abort',
                'getpid','gettid','syscall','poll','getrandom','posix_memalign','strerror_r',
                '__errno','closedir','writev'):
        uc.reg_write(UC_ARM64_REG_X0, 0); uc.reg_write(UC_ARM64_REG_PC, x30); return
    uc.reg_write(UC_ARM64_REG_X0, 0); uc.reg_write(UC_ARM64_REG_PC, x30)

mu.hook_add(UC_HOOK_CODE, hook_import, begin=CODE_HOOKS_ADDR, end=CODE_HOOKS_ADDR + 0x10000)

# ---- JNI fake env setup ----
JNI_ENV_VAR = 0x53000000       # memory holding function-table pointer
JNI_FUNCS = 0x53010000         # function table (0x200 pointers)
JNI_STUB_BASE = 0x53020000     # per-index stubs (4 bytes each)
mu.mem_write(JNI_ENV_VAR, struct.pack('<Q', JNI_FUNCS))
ret = bytes.fromhex('C0035FD6')  # ret
for i in range(0x200):
    mu.mem_write(JNI_FUNCS + i*8, struct.pack('<Q', JNI_STUB_BASE + i*4))
    mu.mem_write(JNI_STUB_BASE + i*4, ret)

# JNI function index -> name
JNI_NAMES = {4:'GetVersion',5:'DefineClass',6:'FindClass',7:'FromReflectedMethod',
             8:'FromReflectedField',9:'ToReflectedMethod',10:'GetSuperclass',
             11:'IsAssignableFrom',12:'ToReflectedField',13:'Throw',14:'ThrowNew',
             15:'ExceptionOccurred',16:'ExceptionDescribe',17:'ExceptionClear',
             18:'FatalError',19:'PushLocalFrame',20:'PopLocalFrame',21:'NewGlobalRef',
             22:'DeleteGlobalRef',23:'DeleteLocalRef',24:'IsSameObject',25:'NewLocalRef',
             26:'EnsureLocalCapacity',27:'AllocObject',28:'NewObject',29:'NewObjectV',
             30:'NewObjectA',31:'GetObjectClass',32:'IsInstanceOf',33:'GetMethodID',
             34:'CallObjectMethod',35:'CallObjectMethodV',36:'CallObjectMethodA',
             37:'CallBooleanMethod',38:'CallBooleanMethodV',39:'CallBooleanMethodA',
             40:'CallByteMethod',41:'CallByteMethodV',42:'CallByteMethodA',
             43:'CallCharMethod',44:'CallCharMethodV',45:'CallCharMethodA',
             46:'CallShortMethod',47:'CallShortMethodV',48:'CallShortMethodA',
             49:'CallIntMethod',50:'CallIntMethodV',51:'CallIntMethodA',
             52:'CallLongMethod',53:'CallLongMethodV',54:'CallLongMethodA',
             55:'CallFloatMethod',56:'CallFloatMethodV',57:'CallFloatMethodA',
             58:'CallDoubleMethod',59:'CallDoubleMethodV',60:'CallDoubleMethodA',
             61:'CallVoidMethod',62:'CallVoidMethodV',63:'CallVoidMethodA',
             64:'CallNonvirtualObjectMethod',65:'CallNonvirtualObjectMethodV',
             66:'CallNonvirtualObjectMethodA',67:'CallNonvirtualBooleanMethod',
             68:'CallNonvirtualBooleanMethodV',69:'CallNonvirtualBooleanMethodA',
             70:'CallNonvirtualByteMethod',71:'CallNonvirtualByteMethodV',
             72:'CallNonvirtualByteMethodA',73:'CallNonvirtualCharMethod',
             74:'CallNonvirtualCharMethodV',75:'CallNonvirtualCharMethodA',
             76:'CallNonvirtualShortMethod',77:'CallNonvirtualShortMethodV',
             78:'CallNonvirtualShortMethodA',79:'CallNonvirtualIntMethod',
             80:'CallNonvirtualIntMethodV',81:'CallNonvirtualIntMethodA',
             82:'CallNonvirtualLongMethod',83:'CallNonvirtualLongMethodV',
             84:'CallNonvirtualLongMethodA',85:'CallNonvirtualFloatMethod',
             86:'CallNonvirtualFloatMethodV',87:'CallNonvirtualFloatMethodA',
             88:'CallNonvirtualDoubleMethod',89:'CallNonvirtualDoubleMethodV',
             90:'CallNonvirtualDoubleMethodA',91:'CallNonvirtualVoidMethod',
             92:'CallNonvirtualVoidMethodV',93:'CallNonvirtualVoidMethodA',
             94:'GetFieldID',95:'GetObjectField',96:'GetBooleanField',97:'GetByteField',
             98:'GetCharField',99:'GetShortField',100:'GetIntField',101:'GetLongField',
             102:'GetFloatField',103:'GetDoubleField',104:'SetObjectField',
             105:'SetBooleanField',106:'SetByteField',107:'SetCharField',
             108:'SetShortField',109:'SetIntField',110:'SetLongField',
             111:'SetFloatField',112:'SetDoubleField',113:'GetStaticMethodID',
             114:'CallStaticObjectMethod',115:'CallStaticObjectMethodV',
             116:'CallStaticObjectMethodA',117:'CallStaticBooleanMethod',
             118:'CallStaticBooleanMethodV',119:'CallStaticBooleanMethodA',
             120:'CallStaticByteMethod',121:'CallStaticByteMethodV',
             122:'CallStaticByteMethodA',123:'CallStaticCharMethod',
             124:'CallStaticCharMethodV',125:'CallStaticCharMethodA',
             126:'CallStaticShortMethod',127:'CallStaticShortMethodV',
             128:'CallStaticShortMethodA',129:'CallStaticIntMethod',
             130:'CallStaticIntMethodV',131:'CallStaticIntMethodA',
             132:'CallStaticLongMethod',133:'CallStaticLongMethodV',
             134:'CallStaticLongMethodA',135:'CallStaticFloatMethod',
             136:'CallStaticFloatMethodV',137:'CallStaticFloatMethodA',
             138:'CallStaticDoubleMethod',139:'CallStaticDoubleMethodV',
             140:'CallStaticDoubleMethodA',141:'CallStaticVoidMethod',
             142:'CallStaticVoidMethodV',143:'CallStaticVoidMethodA',
             144:'GetStaticFieldID',145:'GetStaticObjectField',
             146:'GetStaticBooleanField',147:'GetStaticByteField',
             148:'GetStaticCharField',149:'GetStaticShortField',
             150:'GetStaticIntField',151:'GetStaticLongField',
             152:'GetStaticFloatField',153:'GetStaticDoubleField',
             154:'SetStaticObjectField',155:'SetStaticBooleanField',
             156:'SetStaticByteField',157:'SetStaticCharField',
             158:'SetStaticShortField',159:'SetStaticIntField',
             160:'SetStaticLongField',161:'SetStaticFloatField',
             162:'SetStaticDoubleField',163:'NewString',164:'GetStringLength',
             165:'GetStringChars',166:'ReleaseStringChars',167:'NewStringUTF',
             168:'GetStringUTFLength',169:'GetStringUTFChars',170:'ReleaseStringUTFChars',
             171:'GetArrayLength',172:'NewObjectArray',173:'GetObjectArrayElement',
             174:'SetObjectArrayElement',175:'NewBooleanArray',176:'NewByteArray',
             177:'NewCharArray',178:'NewShortArray',179:'NewIntArray',180:'NewLongArray',
             181:'NewFloatArray',182:'NewDoubleArray',183:'GetBooleanArrayElements',
             184:'GetByteArrayElements',185:'GetCharArrayElements',
             186:'GetShortArrayElements',187:'GetIntArrayElements',
             188:'GetLongArrayElements',189:'GetFloatArrayElements',
             190:'GetDoubleArrayElements',191:'ReleaseBooleanArrayElements',
             192:'ReleaseByteArrayElements',193:'ReleaseCharArrayElements',
             194:'ReleaseShortArrayElements',195:'ReleaseIntArrayElements',
             196:'ReleaseLongArrayElements',197:'ReleaseFloatArrayElements',
             198:'ReleaseDoubleArrayElements',199:'GetBooleanArrayRegion',
             200:'GetByteArrayRegion',201:'GetCharArrayRegion',202:'GetShortArrayRegion',
             203:'GetIntArrayRegion',204:'GetLongArrayRegion',205:'GetFloatArrayRegion',
             206:'GetDoubleArrayRegion',207:'SetBooleanArrayRegion',
             208:'SetByteArrayRegion',209:'SetCharArrayRegion',210:'SetShortArrayRegion',
             211:'SetIntArrayRegion',212:'SetLongArrayRegion',213:'SetFloatArrayRegion',
             214:'SetDoubleArrayRegion',215:'RegisterNatives',216:'UnregisterNatives',
             217:'MonitorEnter',218:'MonitorExit',219:'GetJavaVM',220:'GetStringRegion',
             221:'GetStringUTFRegion',222:'GetPrimitiveArrayCritical',
             223:'ReleasePrimitiveArrayCritical',224:'GetStringCritical',
             225:'ReleaseStringCritical',226:'NewWeakGlobalRef',227:'DeleteWeakGlobalRef',
             228:'ExceptionCheck',229:'NewDirectByteBuffer',230:'GetDirectBufferAddress',
             231:'GetDirectBufferCapacity',232:'GetObjectRefType'}
JNI_INDEX = {v:k for k,v in JNI_NAMES.items()}
# Actually 219 is GetJavaVM but some sources put it at 4. Android's is at 4.
JNI_NAMES[4] = 'GetVersion'
JNI_NAMES[219] = 'GetJavaVM'

registered = []  # (name, signature, fnPtr)
jni_calls = []

def read_cstr(addr):
    out = b''
    try:
        while True:
            b = mu.mem_read(addr, 1)
            if b == b'\x00' or len(b)==0: break
            out += b
            addr += 1
            if len(out) > 200: break
    except UcError:
        pass
    return out.decode('utf-8', 'replace')

def hook_jni(uc, address, size, user_data):
    idx = (address - JNI_STUB_BASE) // 4
    if not (0 <= idx < 0x200):
        return
    name = JNI_NAMES.get(idx, 'jni_%d' % idx)
    x30 = uc.reg_read(UC_ARM64_REG_X30)
    x0, x1, x2, x3 = (uc.reg_read(r) for r in (UC_ARM64_REG_X0, UC_ARM64_REG_X1, UC_ARM64_REG_X2, UC_ARM64_REG_X3))
    jni_calls.append((name, x1, x2, x3))
    if name == 'RegisterNatives':
        # x1=class, x2=methods, x3=count
        for m in range(x3):
            off = x2 + m*24
            try:
                nm_addr, sg_addr, fn = struct.unpack('<QQQ', bytes(mu.mem_read(off, 24)))
                nm = read_cstr(nm_addr)
                sg = read_cstr(sg_addr)
                registered.append((nm, sg, fn))
            except UcError:
                pass
        uc.reg_write(UC_ARM64_REG_X0, 0)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'FindClass':
        # x1 = class name string. Allocate a fake class object in heap.
        cls_addr = heap_cur[0]; heap_cur[0] = (cls_addr + 0x100 + 15) & ~15
        uc.reg_write(UC_ARM64_REG_X0, cls_addr)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'GetObjectClass':
        uc.reg_write(UC_ARM64_REG_X0, 0x60001000)  # fake class ptr
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'NewStringUTF':
        # x1 = utf8 string. Return pointer to heap.
        saddr = heap_cur[0]
        uc.reg_write(UC_ARM64_REG_X0, saddr)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'NewString':
        uc.reg_write(UC_ARM64_REG_X0, 0x60002000)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('GetStringUTFChars',):
        # x1 = jstring. Return pointer to the string contents.
        uc.reg_write(UC_ARM64_REG_X0, 0x60003000)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('ReleaseStringUTFChars', 'ReleaseStringChars'):
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('GetStringUTFLength','GetStringLength'):
        uc.reg_write(UC_ARM64_REG_X0, 0); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('GetArrayLength',):
        uc.reg_write(UC_ARM64_REG_X0, 0); uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('NewByteArray','NewObjectArray','NewIntArray','NewLongArray'):
        # x1 = length
        arr = heap_cur[0]
        n = uc.reg_read(UC_ARM64_REG_X1)
        heap_cur[0] = (arr + n * 8 + 15) & ~15
        uc.reg_write(UC_ARM64_REG_X0, arr)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('GetByteArrayElements','GetIntArrayElements','GetLongArrayElements'):
        uc.reg_write(UC_ARM64_REG_X0, 0x60004000)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('ReleaseByteArrayElements','ReleaseIntArrayElements','ReleaseLongArrayElements'):
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('GetObjectClass',):
        uc.reg_write(UC_ARM64_REG_X0, 0x60001000)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('CallStaticObjectMethod','CallObjectMethod','CallStaticIntMethod','CallIntMethod',
                'CallStaticBooleanMethod','CallBooleanMethod','CallStaticLongMethod','CallLongMethod',
                'CallStaticVoidMethod','CallVoidMethod'):
        uc.reg_write(UC_ARM64_REG_X0, 0)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('GetStaticFieldID','GetFieldID','GetMethodID','GetStaticMethodID'):
        # return fake method/field id = 1
        uc.reg_write(UC_ARM64_REG_X0, 1)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('GetStaticObjectField','GetObjectField'):
        uc.reg_write(UC_ARM64_REG_X0, 0x60005000)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('GetStaticIntField','GetIntField','GetStaticBooleanField','GetBooleanField',
                'GetStaticLongField','GetLongField'):
        uc.reg_write(UC_ARM64_REG_X0, 0)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name in ('ExceptionOccurred','ExceptionCheck'):
        uc.reg_write(UC_ARM64_REG_X0, 0)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    if name == 'EnsureLocalCapacity':
        uc.reg_write(UC_ARM64_REG_X0, 0)
        uc.reg_write(UC_ARM64_REG_PC, x30); return
    # default: return 0
    uc.reg_write(UC_ARM64_REG_X0, 0)
    uc.reg_write(UC_ARM64_REG_PC, x30)

mu.hook_add(UC_HOOK_CODE, hook_jni, begin=JNI_STUB_BASE, end=JNI_STUB_BASE + 0x800)

# Monitor writes to .bss to capture decrypted strings
bss_writes = []
def on_write(uc, access, address, size, value, user_data):
    if 0x7b0000 <= address < 0xce4000:
        bss_writes.append((address, size, value))
mu.hook_add(UC_HOOK_MEM_WRITE, on_write, begin=0x7b0000, end=0xce4000)
byte_writes = {}
def on_byte_write(uc, access, address, size, value, user_data):
    if 0x7b0000 <= address < 0xce4000:
        if size == 1:
            byte_writes[address] = value & 0xff
        elif size in (2,4,8):
            v = value
            for k in range(size):
                byte_writes[address + k] = (v >> (8*k)) & 0xff
mu.hook_add(UC_HOOK_MEM_WRITE, on_byte_write, begin=0x7b0000, end=0xce4000)

# ---- run constructor ----
mu.reg_write(UC_ARM64_REG_SP, STACK_TOP)
mu.reg_write(UC_ARM64_REG_X29, STACK_TOP)
mu.reg_write(UC_ARM64_REG_X30, 0)
try:
    mu.emu_start(0x61b140, 0, count=500_000_000, timeout=0)
    print('constructor done pc=%s' % hex(mu.reg_read(UC_ARM64_REG_PC)))
except UcError as e:
    print('ctor UcError:', e, 'pc=', hex(mu.reg_read(UC_ARM64_REG_PC)))

# ---- run JNI_OnLoad ----
mu.reg_write(UC_ARM64_REG_SP, STACK_TOP - 0x1000)
mu.reg_write(UC_ARM64_REG_X29, STACK_TOP - 0x1000)
mu.reg_write(UC_ARM64_REG_X30, STOP_SENTINEL)
mu.reg_write(UC_ARM64_REG_X0, JNI_ENV_VAR)  # env
mu.reg_write(UC_ARM64_REG_X1, 0)            # reserved
insn_limit = [0]
def limit_hook(uc, address, size, user_data):
    insn_limit[0] += 1
    if insn_limit[0] > 80_000_000:
        print('instruction cap reached at pc=%s' % hex(address))
        uc.emu_stop()
mu.hook_add(UC_HOOK_CODE, limit_hook, begin=0x74e228, end=0x74e228+0x3684)
try:
    mu.emu_start(0x74e228, 0, count=80_000_000, timeout=0)
    print('JNI_OnLoad done pc=%s' % hex(mu.reg_read(UC_ARM64_REG_PC)))
except UcError as e:
    print('JNI_OnLoad UcError:', e, 'pc=', hex(mu.reg_read(UC_ARM64_REG_PC)))

print('\n=== JNI_OnLoad stop state ===')
print('pc=%s x0=%s x19=%s x20=%s sp=%s' % (
    hex(mu.reg_read(UC_ARM64_REG_PC)),
    hex(mu.reg_read(UC_ARM64_REG_X0)),
    hex(mu.reg_read(UC_ARM64_REG_X19)),
    hex(mu.reg_read(UC_ARM64_REG_X20)),
    hex(mu.reg_read(UC_ARM64_REG_SP))))
try:
    region = bytes(mu.mem_read(0xcdbb00, 0x2000))
    open(r'reverse/bss_cdbb58.bin', 'wb').write(region)
    printable = ''.join(chr(c) if 32 <= c < 127 else '.' for c in region)
    print('0xcdbb00 region printable:')
    for i in range(0, len(printable), 64):
        line = printable[i:i+64]
        if line.strip('.'):
            print('  +0x%04x: %s' % (i, line))
except UcError as e:
    print('dump 0xcdbb00 failed:', e)

print('\n=== import calls during JNI_OnLoad (%d) ===' % len(import_call_log))
print(import_call_log)

print('\n=== bss writes captured: %d ===' % len(bss_writes))
buf = bytearray(0x2000)
touched = set()
for addr, size, val in bss_writes:
    rel = addr - 0xcdbb58
    if 0 <= rel < 0x2000:
        vb = val.to_bytes(8, 'little')[:size]
        buf[rel:rel+size] = vb
        touched.update(range(rel, rel+size))
pr = ''.join(chr(c) if 32 <= c < 127 else '.' for c in buf)
print('0xcdbb58 decrypted buffer (0x2000):')
for i in range(0, len(pr), 64):
    line = pr[i:i+64]
    if line.strip('.'):
        print('  +0x%04x: %s' % (i, line))

print('\n=== Registered natives ===')
for nm, sg, fn in registered:
    print('  %-40s %-30s @0x%x' % (nm, sg, fn))
print('\n=== JNI calls (up to 60) ===')
for c in jni_calls[:60]:
    print('  ', c)

# ---- dump regions and search UIDs ----
print('\n=== dumps ===')
uids = ['101678685855','352278274647499','54958628116','2278652361052360','73661777070',
        '7065301951034','1421038059526764','92798131634584','4090639104360094','441355315194459',
        '460031372308109','2656032444144568','3725580158374477','2695624344480411','4110435720126523',
        '2783599609516180','4072238005355902','163161907137991','844869527668060','94376774936',
        '1388050638715280','1729947825644140']
regions = {
    '.data': (0x7b1710, 0x3b270),
    '.bss': (0x7ec980, 0x4f5896),
    'heap': (HEAP_BASE, 0x8000000),
    '.data.rel.ro': (0x7aaec0, 0x2850),
}
allbuf = b''
for name, (va, sz) in regions.items():
    try:
        b = bytes(mu.mem_read(va, sz))
        open(r'reverse/region_%s2.bin' % name.strip('.'), 'wb').write(b)
        allbuf += b
        print('dumped %-14s %d' % (name, len(b)))
    except UcError as e:
        print('dump fail %s: %s' % (name, e))

# also enc_text after JNI run
enc = bytes(mu.mem_read(0x74e228, 0x58868))
open(r'reverse/enc_text_emulated2.bin', 'wb').write(enc)

print('\n=== UID search in post-JNI memory ===')
for u in uids:
    b = u.encode()
    if b in allbuf:
        print('UID %-18s FOUND ascii' % u)
    else:
        n = int(u)
        le = struct.pack('<Q', n)
        if le in allbuf:
            print('UID %-18s FOUND u64' % u)
        else:
            print('UID %-18s NOT found' % u)
