from pathlib import Path
import re, json

ROOT = Path.cwd()
BASE = 'CherryWeChat_v1.0.1-47-g56d8c93'
SRC = ROOT / f'{BASE}_decompiled' / 'sources'
OUT = ROOT / f'{BASE}_analysis'
OUT.mkdir(exist_ok=True)
TARGET = SRC / 'p000' / 'AbstractC0295Gu.java'
MASK16 = 0xffff
MASK32 = 0xffffffff
MASK64 = 0xffffffffffffffff

def s16(x):
    x &= MASK16
    return x - 0x10000 if x & 0x8000 else x

def s64(x):
    x &= MASK64
    return x - (1 << 64) if x & (1 << 63) else x

def u32(x): return x & MASK32

def ur32(x, n): return (x & MASK32) >> n

def java_string(s, i):
    assert s[i] == '"'
    i += 1; out=[]
    simple={'b':'\b','t':'\t','n':'\n','f':'\f','r':'\r','"':'"',"'":"'",'\\':'\\'}
    while i < len(s):
        c=s[i]; i += 1
        if c == '"': return ''.join(out), i
        if c != '\\': out.append(c); continue
        c=s[i]; i += 1
        if c == 'u':
            while i < len(s) and s[i]=='u': i += 1
            code=s[i:i+4]; i += 4
            out.append(chr(int(code,16)))
        else: out.append(simple.get(c,c))
    raise ValueError('unterminated java string')

def extract_pool(text):
    start=text.index('f996a = {') + len('f996a = {')
    i=start; values=[]
    while i < len(text):
        while i < len(text) and text[i] in ' \t\r\n,': i += 1
        if text.startswith('};',i): break
        if text[i] != '"':
            i += 1; continue
        value,i=java_string(text,i); values.append(value)
    return values

def m631x(j):
    j &= MASK64
    s=s16(j)
    s2=s16(j >> 16)
    s3=s16(s+s2)
    s4=s16(s2 ^ s)
    a=s16(ur32(s4,22) | (s4 << 10))
    b=s16(s16(ur32(s3,23) | (s3 << 9)) + s)
    c=s16(s16(s16((s << 13) | ur32(s,19)) ^ s4) ^ (s4 << 5))
    high=(s64(a) | (s64(b) << 16))
    return ((high << 16) | s64(c)) & MASK64

def decrypt(value, pool):
    j=value & MASK64
    j2=j & MASK32
    j3=((j2 ^ (j2 >> 33)) * 7109453100751455733) & MASK64
    state=m631x((((j3 ^ (j3 >> 28)) * (-3808689974395783757 & MASK64)) & MASK64) >> 32)
    j4=(state >> 32) & MASK16
    state2=m631x(state)
    index=((j >> 32) ^ j4 ^ ((state2 >> 16) & MASK32)) & MASK32
    # This decoder uses index as a signed Java int; valid calls resolve to pool range.
    state3=m631x(state2)
    if index // 8191 >= len(pool):
        raise IndexError(index)
    state=(state3 ^ (ord(pool[index // 8191][index % 8191]) << 32)) & MASK64
    length=(state >> 32) & MASK16
    chars=[]
    for pos in range(length):
        n=index+pos+1
        state=(m631x(state) ^ (ord(pool[n // 8191][n % 8191]) << 32)) & MASK64
        chars.append(chr((state >> 32) & MASK16))
    return ''.join(chars)

text=TARGET.read_text(encoding='utf-8')
pool=extract_pool(text)
all_calls={}
for p in [SRC / 'io' / 'github' / 'cherrywechat' / 'HookEntry.java']:
    body=p.read_text(encoding='utf-8', errors='ignore')
    vals=re.findall(r'm625r\((-?\d+)L\)',body)
    for v in vals:
        all_calls.setdefault(int(v),[]).append(p.relative_to(SRC).as_posix())
rows=[]; failures=[]
for value, paths in sorted(all_calls.items()):
    try:
        decoded=decrypt(value,pool)
        decoded = decoded.encode('utf-8', 'backslashreplace').decode('utf-8')
        rows.append({'constant':value,'decoded':decoded,'occurrences':len(paths),'first_path':paths[0]})
    except Exception as e:
        failures.append({'constant':value,'error':repr(e),'first_path':paths[0]})
(OUT/'string_decoder_results.json').write_text(json.dumps({'pool_segments':len(pool),'pool_chars':sum(map(len,pool)),'decoded':rows,'failures':failures},ensure_ascii=False,indent=2),encoding='utf-8')
with (OUT/'解密字符串.tsv').open('w',encoding='utf-8-sig') as f:
    f.write('加密常量\t解密结果\t调用次数\t首个调用文件\n')
    for r in rows:
        safe=r['decoded'].replace('\t','\\t').replace('\r','\\r').replace('\n','\\n')
        f.write(f"{r['constant']}\t{safe}\t{r['occurrences']}\t{r['first_path']}\n")
print(f'pool_segments={len(pool)} pool_chars={sum(map(len,pool))} calls={len(all_calls)} decoded={len(rows)} failures={len(failures)}')
for r in rows[:20]: print(r['constant'],repr(r['decoded']))
