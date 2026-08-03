from pathlib import Path
p=next(Path.cwd().glob('CherryWeChat_v1.0.1-47-g56d8c93_*说明.md'))
s=p.read_text(encoding='utf-8')
replacements={
'| `libc++_shared.so` | 1,292,904 | |':'| `libc++_shared.so` | 1,292,904 | NDK C++ 运行时 |',
'| `libcherry.so` | 103,480 | |':'| `libcherry.so` | 103,480 | Cherry 原生实现；HookEntry 显式加载 |',
'| `libcrypto.so` | 2,132,912 | |':'| `libcrypto.so` | 2,132,912 | OpenSSL crypto 库 |',
'| `libdecrepit.so` | 84,984 | |':'| `libdecrepit.so` | 84,984 | OpenSSL 兼容组件 |',
'| `libdexkit.so` | 290,408 | |':'| `libdexkit.so` | 290,408 | DexKit 运行时 Dex/符号检索库 |',
'| `libluajit.so` | 752,496 | |':'| `libluajit.so` | 752,496 | LuaJIT 运行时 |',
'| `libpki.so` | 1,176,880 | |':'| `libpki.so` | 1,176,880 | PKI/证书相关库 |',
'| `libsentry-android.so` | 16,832 | |':'| `libsentry-android.so` | 16,832 | Sentry Android 桥接库 |',
'| `libsentry.so` | 704,344 | |':'| `libsentry.so` | 704,344 | Sentry Native SDK |',
'| `libssl.so` | 829,680 | |':'| `libssl.so` | 829,680 | OpenSSL TLS 库 |',
}
for a,b in replacements.items(): s=s.replace(a,b)
p.write_text(s,encoding='utf-8')
print('updated',p.name)
