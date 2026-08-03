from pathlib import Path
import hashlib, re, shutil

ROOT = Path.cwd()
APK = ROOT / 'FunBox_v2162.Apk'
APKT = ROOT / 'FunBox_v2162_apktool'
READ = ROOT / 'FunBox_v2162_readable'
SIMPLE = ROOT / 'FunBox_v2162_readable_simple'
ANALYSIS = ROOT / 'FunBox_v2162_analysis'
ANALYSIS.mkdir(exist_ok=True)

# Whole extracted payload scan. URLs are collected from manifest, WebUI, resources, code, and native ELF files.
url_re = re.compile(r'(?i)\b(?:https?|wss?|ftp)://[^\s\x00<>"\'`()\[\]{}\\]+')
urls = {}
for p in APKT.rglob('*'):
    if not p.is_file():
        continue
    try:
        data = p.read_bytes()
    except OSError:
        continue
    text = data.decode('latin-1', errors='ignore')
    for m in url_re.finditer(text):
        url = m.group(0).rstrip('.,;:')
        rel = p.relative_to(APKT).as_posix()
        urls.setdefault(url, set()).add(rel)

# Include JADx output in case the decompiler reconstructed an escaped string.
for tree, label in [(READ, 'jadx-readable'), (SIMPLE, 'jadx-simple')]:
    for p in tree.rglob('*'):
        if not p.is_file():
            continue
        try:
            text = p.read_text(encoding='utf-8', errors='ignore')
        except OSError:
            continue
        for m in url_re.finditer(text):
            url = m.group(0).rstrip('.,;:')
            urls.setdefault(url, set()).add(f'{label}/{p.relative_to(tree).as_posix()}')

def kind(url):
    if 'schemas.android.com' in url:
        return 'Android XML 命名空间'
    if 'android.googlesource.com' in url:
        return 'LLVM/NDK 编译标识'
    return '静态 URL 字符串（需结合调用点判断用途）'

url_tsv = ANALYSIS / 'URL清单.tsv'
with url_tsv.open('w', encoding='utf-8-sig', newline='') as f:
    f.write('URL\t分类\t出现位置\n')
    for url in sorted(urls):
        f.write(f'{url}\t{kind(url)}\t{"; ".join(sorted(urls[url]))}\n')

mappings = [
    ('fun.box001.loader.XPEntry', 'Xposed/LSPosed/LSPatch 入口', 'assets/xposed_init 指向；识别运行环境、准备模块路径、进入 FunLoader'),
    ('fun.box001.loader.ZygiskEntry', 'Zygisk Java 入口', '加载 libshooker.so，Hook LoadedApk.createAppFactory 后进入核心加载链'),
    ('fun.box001.loader.ZygiskAppFactoryCallback', 'Zygisk AppFactory 回调', '由 SHooker Hook 后接收 ApplicationInfo 与 ClassLoader'),
    ('fun.box001.loader.FunLoader', '原生核心加载器 JNI 声明', 'load() 由 libloader.so 实现；Java 层只保留 JNI 声明'),
    ('fun.box001.loader.utils.FileUtils', '文件/ZIP 工具', '复制、递归删除、MD5、写入临时库、读取 ZIP Entry'),
    ('fun.box001.shared.Env', '运行时全局环境', '保存包名、进程名、数据目录、模块路径、ClassLoader 与加载类型'),
    ('fun.box001.shared.hook.XHooker', 'Hook 后端抽象入口', '按 Xposed 或 SHooker 后端选择实现'),
    ('com.shooker.SHooker', 'ART Hook JNI 封装', '初始化、替换方法、反优化、受信任 ClassLoader/DexFile 等接口'),
    ('fun.box001.internal.dexbridge.RuntimeDexGenerator', 'DexBridge/运行时 Dex 工具', '模块路径和动态加载准备逻辑；来自原 a.b'),
    ('fun.box001.internal.dexmaker', 'DexMaker 组件', '动态生成 Dex 的辅助类；原 c 包'),
    ('fun.box001.internal.dexformat', 'Dex 格式组件', 'Dex 编码、常量、指令、类型项等辅助代码；原 e-n 包'),
    ('fun.box001.internal.hookbackend.xposed.XposedHookBackend', 'Xposed Hook 后端', 'XPEntry 中设置为当前 Hook 实现'),
    ('fun.box001.internal.hookbackend.xposed.SHookerHookBackend', 'SHooker Hook 后端', 'ZygiskEntry 中设置为当前 Hook 实现'),
    ('libloader.so', '原生装载链', '包含 FunBox-String-v2 字符串并承接 FunLoader.load()'),
    ('libfun.so', '原生功能逻辑', '含 FunBox req3 AEAD/salt/key 字符串与 DexKit/ART 类加载器相关符号'),
    ('libfvm.so', '原生 VM/核心逻辑', '约 5.4 MiB；导出大量 x.*、y.* 符号'),
    ('libshooker.so', 'ART Hook 实现', '导出 Java_com_shooker_SHooker__1init、_replace、_deoptimize 等 JNI 接口'),
    ('libmaphider.so', '内存映射隐藏辅助', '导出 my_hide'),
]
map_tsv = ANALYSIS / '重要类语义映射.tsv'
with map_tsv.open('w', encoding='utf-8-sig', newline='') as f:
    f.write('对象\t语义名称\t职责\n')
    for row in mappings:
        f.write('\t'.join(row) + '\n')

# Export small textual operational configuration for convenient review.
export = ANALYSIS / '关键配置导出'
export.mkdir(exist_ok=True)
for src, name in [
    (APKT / 'assets' / 'xposed_init', 'xposed_init.txt'),
    (APKT / 'unknown' / 'module.prop', 'module.prop'),
    (APKT / 'unknown' / 'action.sh', 'action.sh'),
    (APKT / 'unknown' / 'customize.sh', 'customize.sh'),
    (APKT / 'unknown' / 'webroot' / 'index.html', 'webroot_index.html'),
    (APKT / 'unknown' / 'webroot' / 'app.js', 'webroot_app.js'),
    (APKT / 'unknown' / 'webroot' / 'kernelsu.js', 'webroot_kernelsu.js'),
    (APKT / 'unknown' / 'webroot' / 'styles.css', 'webroot_styles.css'),
]:
    if src.exists():
        shutil.copy2(src, export / name)

sha = hashlib.sha256(APK.read_bytes()).hexdigest().upper()
def count(root, pattern=None):
    return sum(1 for p in root.rglob(pattern or '*') if p.is_file())
java_count = count(READ / 'sources', '*.java')
simple_count = count(SIMPLE / 'sources', '*.java')
smali_count = count(APKT, '*.smali')
res_count = count(READ / 'resources')
libs = [
    ('libfun.so', 3470115, '原生功能实现；存在 req3 AEAD、salt、key 相关字符串'),
    ('libfvm.so', 5459216, '原生 VM/核心逻辑，符号以 x.*、y.* 为主'),
    ('libloader.so', 1222616, 'FunLoader.load() 对应的原生加载链；含 FunBox-String-v2'),
    ('libmaphider.so', 10728, '内存映射隐藏辅助；导出 my_hide'),
    ('libshooker.so', 234800, 'ART Hook；提供 SHooker JNI 接口'),
]
url_rows = []
for url in sorted(urls):
    url_rows.append(f'| `{url}` | {kind(url)} | `{", ".join(sorted(urls[url]))}` |')
url_md = '\n'.join(url_rows) if url_rows else '| （扫描未命中） | — | — |'

md = f'''# FunBox v2162 完整解包与可读代码说明

## 1. 样本与交付

| 项目 | 值 |
|---|---|
| 文件 | `FunBox_v2162.Apk` |
| SHA-256 | `{sha}` |
| 包名 | `have.fun` |
| 版本 | `v2162`（`versionCode=2162`） |
| SDK | minSdk 29；targetSdk/compileSdk 34 |
| DEX | `classes.dex` 1 个 |
| Java | 可读重建 Java {java_count} 个；指令优先 Java {simple_count} 个 |
| Smali | {smali_count} 个文件 |
| JADX 资源 | {res_count} 个文件 |
| ABI | 仅 `arm64-v8a` |

已输出可阅读的 Java、完整资源/Smali、Native ELF、语义映射以及 URL 清单。APK 只携带构建产物；原始工程中的注释、原符号和原生 VM 的 C/C++ 项目文件没有位于安装包内。`FunBox_v2162_readable` 是经过 JADX 与语义映射重建后的主阅读目录，`FunBox_v2162_readable_simple` 保留更贴近 Dex 指令结构的对照版本。

## 2. 交付目录

| 路径 | 内容 |
|---|---|
| `FunBox_v2162_readable/` | 主可读 Java 输出（203 文件）与已解码资源；对主要包、入口和 Hook 后端做了语义化命名。 |
| `FunBox_v2162_readable_simple/` | 简化反编译 Java（203 文件）；用于在主反编译出现控制流重建提示时核对。 |
| `FunBox_v2162_decompiled/` | 初始 JADX 自动反混淆输出与资源。 |
| `FunBox_v2162_apktool/` | Apktool 完整解包：`AndroidManifest.xml`、`smali/`、`res/`、`assets/`、`lib/`、模块脚本、WebUI。 |
| `FunBox_v2162_analysis/` | Native 字符串/符号报告、URL 清单、重点语义映射与关键配置导出。 |
| `FunBox_v2162_semantic.jobf` | JADX 语义化映射配置；再次运行 JADX 时可复现包和关键类名。 |
| `FunBox_v2162.jobf` | JADX 自动生成的原始反混淆映射。 |

## 3. 文件夹说明

| 文件夹/文件 | 介绍 |
|---|---|
| `FunBox_v2162_readable/sources/` | Java 重建源码。入口位于 `fun/box001/loader/`。 |
| `fun/box001/loader/` | 装载入口：Xposed、Zygisk 与 JNI 加载器。 |
| `fun/box001/shared/` | 跨加载方式共享的环境变量、Hook 抽象。 |
| `fun/box001/internal/dexbridge/` | 运行时 Dex 处理工具，包含 `RuntimeDexGenerator`。 |
| `fun/box001/internal/dexmaker/` | DexMaker 动态 Dex 生成组件。 |
| `fun/box001/internal/dexformat/` | Dex 文件格式、类型、常量和指令相关组件。 |
| `FunBox_v2162_apktool/smali/` | `classes.dex` 的完整 Smali 反汇编；Java 重建存在提示时以这里为准。 |
| `FunBox_v2162_apktool/res/` | APK Android 资源（XML、drawable、values 等）。 |
| `FunBox_v2162_apktool/assets/` | `xposed_init` 与 `loading`、`testpng`、`voice` 等资产。 |
| `FunBox_v2162_apktool/lib/arm64-v8a/` | 五个 arm64 Native ELF 库。 |
| `FunBox_v2162_apktool/unknown/` | APK 中未作为常规 Android 资源处理的模块文件：安装脚本、WebUI、Zygisk 库与元数据。 |
| `FunBox_v2162_apktool/unknown/webroot/` | KernelSU/Magisk 风格 WebUI：`index.html`、`app.js`、`kernelsu.js`、`styles.css`。 |
| `FunBox_v2162_analysis/关键配置导出/` | 将 Xposed 入口、模块描述、安装/Action 脚本和 WebUI 文件集中复制，便于审阅。 |

## 4. 重要文件与加载链

### Xposed / LSPosed / LSPatch

- `assets/xposed_init` 指向 `fun.box001.loader.XPEntry`。
- `XPEntry.handleLoadPackage()` 在首个 Application 进程中识别 LSPatch、LSPosed 或 FPA 环境，记录进程/包/数据目录/ClassLoader，准备模块副本与 `app.bin`，选择 `XposedHookBackend`，随后调用 `FunLoader.load()`。
- `FunLoader.java` 的 `load()` 是 JNI 声明；实际实现位于 `libloader.so`。

### Zygisk

- `unknown/module.prop`：模块 ID `funbox`，名称 `FunBox For Zygisk`，作者 `Hicore`。
- `unknown/customize.sh`：安装流程将主 APK 放入 `/data/adb/funbox/main.apk`，并部署 `zygisk/funloader.so`。
- `unknown/action.sh`：通过音量键切换 QQ、微信、TIM、抖音作用域标记。
- `ZygiskEntry.init()` 从模块 APK 提取 `libshooker.so` 到应用数据目录，加载后调用 `SHooker._init()`；再 Hook `LoadedApk.createAppFactory()`，由 `ZygiskAppFactoryCallback` 在 App ClassLoader 可用时接入 `FunLoader.load()`。

### WebUI 作用域

`unknown/webroot/app.js` 管理 `/data/adb/funbox/` 下的标记文件：

| 作用域 | 标记文件 | 目标包名 |
|---|---|---|
| QQ | `enableqq` | `com.tencent.mobileqq` |
| 微信 | `enablewx` | `com.tencent.mm` |
| TIM | `enabletim` | `com.tencent.tim` |
| 抖音 | `enabledy` | `com.ss.android.ugc.aweme`、`com.ss.android.ugc.aweme.mobile` |

## 5. 重要类语义映射

完整表：`FunBox_v2162_analysis/重要类语义映射.tsv`。

| 类/库 | 职责 |
|---|---|
| `XPEntry` | Xposed 系列模块入口。 |
| `ZygiskEntry` | Zygisk Java 加载与 AppFactory Hook 入口。 |
| `FunLoader` | JNI 形式的核心原生加载器入口。 |
| `FileUtils` | 文件复制/清理、MD5、ZIP Entry 读取与临时库落地。 |
| `Env` | 保存包、进程、路径、ClassLoader、Hook API 和加载方式。 |
| `SHooker` | ART 方法 Hook JNI 封装。 |
| `RuntimeDexGenerator` | 运行时 Dex/模块路径准备组件。 |
| `XposedHookBackend` / `SHookerHookBackend` | 两种 Hook 运行时的后端实现。 |

## 6. Native 库

| 库 | 大小（字节） | 观察结果 |
|---|---:|---|
'''
for name, size, desc in libs:
    md += f'| `{name}` | {size:,} | {desc} |\n'
md += '''

Native 详细字符串和符号结果：`FunBox_v2162_analysis/native_analysis.json` 与 `FunBox_v2162_analysis/native_summary.txt`。`libshooker.so` 可见 JNI 导出包括 `Java_com_shooker_SHooker__1init`、`Java_com_shooker_SHooker__1replace`、`Java_com_shooker_SHooker__1deoptimize`、`Java_com_shooker_SHooker__1setClassLoaderTrusted`、`Java_com_shooker_SHooker__1setDexFileTrusted`。`libfun.so` 中可见 `FunBox req3 aead`、`FunBox req3 salt`、`FunBox req3 key` 字符串；它们位于原生实现中。

## 7. URL 全量扫描

扫描范围：`FunBox_v2162_apktool/` 中的 Manifest、资源、脚本、WebUI、DEX 解包内容和全部 Native ELF；同时复扫两个 JADX 输出目录。完整机器可读列表：`FunBox_v2162_analysis/URL清单.tsv`。

| URL | 分类 | 出现位置 |
|---|---|---|
{url_md}

`https://android.googlesource.com/toolchain/llvm-project` 出现在 Native 库的 LLVM 编译标识字符串中，不是已识别的业务 API 端点。Java/脚本/WebUI 静态扫描未出现 Retrofit/OkHttp 请求构造或业务 HTTP Base URL。

## 8. 阅读顺序

1. 从 `FunBox_v2162_readable/sources/fun/box001/loader/XPEntry.java` 与 `ZygiskEntry.java` 开始。
2. 阅读 `FunLoader.java`、`FileUtils.java`、`Env.java`，确认 Java 到 Native 的装载边界。
3. 检查 `FunBox_v2162_apktool/unknown/customize.sh`、`action.sh`、`webroot/app.js`，确认安装、作用域与配置行为。
4. 查看 `FunBox_v2162_analysis/native_summary.txt` 和 `lib/arm64-v8a/`，跟踪原生加载器与 VM 核心。
5. 对任何 JADX 的 `Code decompiled incorrectly` 提示，使用同路径的 `FunBox_v2162_readable_simple/` 和 `FunBox_v2162_apktool/smali/` 逐段核对。
'''

(ROOT / 'FunBox_v2162_完整解密说明.md').write_text(md, encoding='utf-8')
print(f'Wrote report; urls={len(urls)}, java={java_count}, simple={simple_count}, smali={smali_count}, resources={res_count}')
for url in sorted(urls):
    print(url, '=>', '; '.join(sorted(urls[url])))
