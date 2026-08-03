from pathlib import Path
import hashlib, json, re, shutil

root=Path.cwd(); base='CherryWeChat_v1.0.1-47-g56d8c93'
apk=root/(base+'.apk'); apkt=root/(base+'_apktool'); dec=root/(base+'_decompiled'); simple=root/(base+'_simple'); analysis=root/(base+'_analysis'); analysis.mkdir(exist_ok=True)
url_re=re.compile(rb'(?i)\b(?:https?|wss?|ftp)://[^\s\x00<>"\'`()\[\]{}\\]+')
urls={}
for p in apkt.rglob('*'):
    if not p.is_file(): continue
    try: data=p.read_bytes()
    except OSError: continue
    for m in url_re.finditer(data):
        url=m.group().decode('latin1').rstrip('.,;:')
        urls.setdefault(url,set()).add(p.relative_to(apkt).as_posix())
def category(u):
    low=u.lower()
    if 'schemas.android.com' in low: return 'Android XML 命名空间'
    if 'googlesource.com' in low or 'llvm' in low: return '构建/工具链标识'
    if 'license' in low or 'mozilla.org' in low or 'oracle.com' in low: return '许可证或规范链接'
    return '静态 URL 字符串'
with (analysis/'URL清单.tsv').open('w',encoding='utf-8-sig') as f:
    f.write('URL\t分类\t出现位置\n')
    for u in sorted(urls): f.write(f'{u}\t{category(u)}\t{"; ".join(sorted(urls[u]))}\n')

export=analysis/'关键配置导出'; export.mkdir(exist_ok=True)
for src,name in [
    (apkt/'assets'/'xposed_init','xposed_init.txt'),
    (apkt/'assets'/'lua'/'hello.lua','lua_hello.lua'),
    (apkt/'assets'/'lua'/'hook_demo.lua','lua_hook_demo.lua'),
    (apkt/'assets'/'lua'/'java_demo.lua','lua_java_demo.lua'),
    (apkt/'assets'/'lua'/'ui_demo.lua','lua_ui_demo.lua'),
    (apkt/'AndroidManifest.xml','AndroidManifest.xml'),
]:
    if src.exists(): shutil.copy2(src,export/name)

libs=[]
for p in sorted((apkt/'lib'/'arm64-v8a').glob('*.so')):
    libs.append((p.name,p.stat().st_size))
with (analysis/'Native库清单.tsv').open('w',encoding='utf-8-sig') as f:
    f.write('库\t字节数\t说明\n')
    desc={
      'libcherry.so':'Cherry 原生实现；HookEntry 显式加载的 Native 库之一',
      'libdexkit.so':'DexKit 运行时 Dex/符号检索库',
      'libluajit.so':'LuaJIT 运行时',
      'libcrypto.so':'OpenSSL crypto 库',
      'libssl.so':'OpenSSL TLS 库',
      'libpki.so':'PKI/证书相关库',
      'libsentry.so':'Sentry Native SDK',
      'libsentry-android.so':'Sentry Android 桥接库',
      'libc++_shared.so':'NDK C++ 运行时',
      'libdecrepit.so':'OpenSSL 兼容组件',
    }
    for name,size in libs: f.write(f'{name}\t{size}\t{desc.get(name,"Native ELF")}\n')

sha=hashlib.sha256(apk.read_bytes()).hexdigest().upper()
java=sum(1 for p in (dec/'sources').rglob('*.java'))
simple_java=sum(1 for p in (simple/'sources').rglob('*.java'))
smali=sum(1 for p in apkt.rglob('*.smali'))
resources=sum(1 for p in (dec/'resources').rglob('*') if p.is_file())
urlrows=[]
for u in sorted(urls):
    loc=sorted(urls[u]); urlrows.append(f'| `{u}` | {category(u)} | `{loc[0]}`（共 {len(loc)} 处；完整位置见 TSV） |')
urltable='\n'.join(urlrows) or '| （静态扫描未命中） | — | — |'
librows='\n'.join(f'| `{n}` | {s:,} | |' for n,s in libs)
md=f'''# CherryWeChat v1.0.1-47-g56d8c93 解包与可读代码说明

## 1. 样本信息

| 项目 | 值 |
|---|---|
| APK | `{base}.apk` |
| SHA-256 | `{sha}` |
| 包名 | `io.github.cherrywechat` |
| 版本 | `v1.0.1-47-g56d8c93` (`versionCode=10724`) |
| SDK | minSdk 28；targetSdk 35；compileSdk 36 |
| DEX | `classes.dex` 1 个 |
| 可读 Java | {java} 个 |
| 指令优先 Java | {simple_java} 个 |
| Smali | {smali} 个 |
| JADX 资源 | {resources} 个 |
| Native ABI | `arm64-v8a` |

## 2. 交付目录

| 路径 | 内容 |
|---|---|
| `{base}_decompiled/` | JADX 反编译 Java 与完整解码资源；主阅读目录。 |
| `{base}_simple/` | JADX 简化反编译 Java；用于与 Dex 指令结构交叉核对。 |
| `{base}_apktool/` | Apktool 完整解包：Manifest、资源、Smali、assets、Native 库和未识别文件。 |
| `{base}_analysis/` | URL 清单、Native 库清单及关键配置导出。 |

## 3. 文件夹和重要文件

| 文件夹/文件 | 说明 |
|---|---|
| `sources/io/github/cherrywechat/HookEntry.java` | Xposed 模块入口，实现 `IXposedHookLoadPackage` 和 `IXposedHookZygoteInit`。 |
| `sources/io/github/cherrywechat/application/MainApplication.java` | APK 应用初始化入口。 |
| `sources/io/github/cherrywechat/lua/` | Lua 运行时、脚本装载器、Java 桥接和调度实现。 |
| `sources/io/github/cherrywechat/lua/api/` | Lua 暴露的配置、文件、网络、消息、微信与 Xposed API。 |
| `sources/io/github/cherrywechat/lua/dev/` | 开发期脚本服务、日志拦截与调试相关代码。 |
| `sources/io/github/cherrywechat/network/` | 网络模型与 `NetworkNativeBridge`；提供 `decryptData`、`getHeaders` JNI 接口。 |
| `assets/xposed_init` | 指向模块入口 `io.github.cherrywechat.HookEntry`。 |
| `assets/lua/` | `hello.lua`、`hook_demo.lua`、`java_demo.lua`、`ui_demo.lua` 示例脚本。 |
| `smali/` | Java 重建出现 JADX 提示时的完整字节码对照。 |
| `lib/arm64-v8a/` | Cherry、DexKit、LuaJIT、OpenSSL、Sentry 等 Native ELF。 |

## 4. 加载与功能链

1. `assets/xposed_init` 将框架入口指向 `HookEntry`。
2. `HookEntry` 在构造时加载两个 Native 库，并在目标包加载阶段保存 ClassLoader、注册 Application 初始化 Hook。
3. 应用侧 `MainApplication` 初始化 UI 与生命周期回调。
4. `lua/` 提供脚本装载、Java 反射桥接、Hook API、网络 API 与 UI API；示例脚本位于 `assets/lua/`。
5. `NetworkNativeBridge` 将数据解密和请求头生成交由 Native 层执行。

## 5. 字符串处理与阅读提示

`p000/AbstractC0295Gu.java` 的 `m625r(long)` 使用内置 `f996a` 字符池与位运算恢复运行时字符串。`HookEntry` 和多处功能代码借此获取类名、包名、日志及配置常量。可读 Java、简化 Java 和 Smali 三套文件均已保留，便于逐段追踪该字符串恢复逻辑与调用点。

## 6. Native 库

完整表：`{base}_analysis/Native库清单.tsv`。

| 库 | 大小（字节） | |
|---|---:|---|
{librows}

## 7. URL 全量静态扫描

扫描范围包括 Manifest、资源、assets、Smali 解包内容、未知文件和全部 Native ELF。完整位置清单：`{base}_analysis/URL清单.tsv`。

| URL | 分类 | 首个位置 |
|---|---|---|
{urltable}

网络请求相关代码集中在 `sources/io/github/cherrywechat/network/` 和 `sources/io/github/cherrywechat/lua/api/CherryNetworkAPI.java`。部分运行时字符串通过 `AbstractC0295Gu.m625r(long)` 与 `NetworkNativeBridge.decryptData()` 恢复，因此静态 URL 清单用于记录安装包中直接可见的 URL 字符串。

## 8. 阅读顺序

1. `HookEntry.java` → 确认 Xposed 入口与目标加载条件。
2. `lua/LuaEngine.java`、`lua/loader/ScriptLoader.java`、`lua/api/` → 查看脚本运行与接口表。
3. `network/NetworkNativeBridge.java` 和 `network/model/` → 查看网络边界与数据模型。
4. `assets/lua/*.lua` → 查看随包提供的脚本调用示例。
5. 对 JADX 的重建提示，使用同类路径的 `{base}_simple/` 与 `{base}_apktool/smali/` 对照。
'''
(root/(base+'_完整解密说明.md')).write_text(md,encoding='utf-8')
print(f'java={java} simple={simple_java} smali={smali} resources={resources} urls={len(urls)} libs={len(libs)}')
