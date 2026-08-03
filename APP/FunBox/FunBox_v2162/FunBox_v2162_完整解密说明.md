# FunBox v2162 完整解包与可读代码说明

## 1. 样本与交付

| 项目 | 值 |
|---|---|
| 文件 | `FunBox_v2162.Apk` |
| SHA-256 | `55C84BBDB0424FEE1D394DB0CA98A20B9B2EC7FCD4BCB50F21D76C54AB1FF6D4` |
| 包名 | `have.fun` |
| 版本 | `v2162`（`versionCode=2162`） |
| SDK | minSdk 29；targetSdk/compileSdk 34 |
| DEX | `classes.dex` 1 个 |
| Java | 可读重建 Java 203 个；指令优先 Java 203 个 |
| Smali | 234 个文件 |
| JADX 资源 | 812 个文件 |
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
| `libfun.so` | 3,470,115 | 原生功能实现；存在 req3 AEAD、salt、key 相关字符串 |
| `libfvm.so` | 5,459,216 | 原生 VM/核心逻辑，符号以 x.*、y.* 为主 |
| `libloader.so` | 1,222,616 | FunLoader.load() 对应的原生加载链；含 FunBox-String-v2 |
| `libmaphider.so` | 10,728 | 内存映射隐藏辅助；导出 my_hide |
| `libshooker.so` | 234,800 | ART Hook；提供 SHooker JNI 接口 |


Native 详细字符串和符号结果：`FunBox_v2162_analysis/native_analysis.json` 与 `FunBox_v2162_analysis/native_summary.txt`。`libshooker.so` 可见 JNI 导出包括 `Java_com_shooker_SHooker__1init`、`Java_com_shooker_SHooker__1replace`、`Java_com_shooker_SHooker__1deoptimize`、`Java_com_shooker_SHooker__1setClassLoaderTrusted`、`Java_com_shooker_SHooker__1setDexFileTrusted`。`libfun.so` 中可见 `FunBox req3 aead`、`FunBox req3 salt`、`FunBox req3 key` 字符串；它们位于原生实现中。

## 7. URL 全量扫描

扫描范围：`FunBox_v2162_apktool/` 中的 Manifest、资源、脚本、WebUI、DEX 解包内容和全部 Native ELF；同时复扫两个 JADX 输出目录。完整机器可读列表：`FunBox_v2162_analysis/URL清单.tsv`。

| URL | 分类 | 出现位置 |
|---|---|---|
| `http://java.sun.com/j2se/1.6.0/docs/guide/standards/` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/model/impl/Messages.properties`（共 20 处，完整位置见 TSV） |
| `http://java.sun.com/txw` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://relaxng.org/ns/structure/1.0` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://schemas.android.com/apk/res-auto` | Android XML 命名空间 | `jadx-readable/resources/res/layout/aadialog_base.xml`（共 12 处，完整位置见 TSV） |
| `http://schemas.android.com/apk/res/android` | Android XML 命名空间 | `AndroidManifest.xml`（共 582 处，完整位置见 TSV） |
| `http://www.jenitennison.com/doc` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/2001/XMLSchema` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/2001/XMLSchema-datatypes` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-1-20010502/` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/datatypes.html#element-enumeration` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/datatypes.html#element-fractionDigits` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/datatypes.html#element-length` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/datatypes.html#element-maxExclusive` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/datatypes.html#element-maxInclusive` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/datatypes.html#element-maxLength` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/datatypes.html#element-minExclusive` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/datatypes.html#element-minInclusive` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/datatypes.html#element-minLength` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/datatypes.html#element-pattern` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/datatypes.html#element-totalDigits` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/datatypes.html#element-whiteSpace` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-all` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-annotation` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-any` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-anyAttribute` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-appinfo` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-attribute` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-attributeGroup` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-choice` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-complexContent` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-complexContent::extension` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-complexContent::restriction` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-complexType` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-documentation` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-element` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-field` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-group` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-import` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-include` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-key` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-keyref` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-list` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-notation` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-redefine` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-schema` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-selector` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-sequence` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-simpleContent` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-simpleContent::extension` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-simpleContent::restriction` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-simpleType` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-union` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/TR/xmlschema-1/#element-unique` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/v2/schemagen/xmlschema/xmlschema-for-jaxb.rng`（共 2 处，完整位置见 TSV） |
| `http://www.w3.org/XML/1998/namespace` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/unmarshaller/Messages.properties`（共 20 处，完整位置见 TSV） |
| `https://android.googlesource.com/toolchain/llvm-project` | LLVM/NDK 编译标识 | `jadx-readable/resources/keycheck`（共 8 处，完整位置见 TSV） |
| `https://mozilla.org/MPL/2.0/` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/okhttp3/internal/publicsuffix/NOTICE`（共 2 处，完整位置见 TSV） |
| `https://oss.oracle.com/licenses/CDDL+GPL-1.1` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/com/sun/xml/bind/Messages.properties`（共 248 处，完整位置见 TSV） |
| `https://publicsuffix.org/list/public_suffix_list.dat` | 静态 URL 字符串（需结合调用点判断用途） | `jadx-readable/resources/okhttp3/internal/publicsuffix/NOTICE`（共 2 处，完整位置见 TSV） |

`https://android.googlesource.com/toolchain/llvm-project` 出现在 Native 库的 LLVM 编译标识字符串中，不是已识别的业务 API 端点。Java/脚本/WebUI 的网络关键字扫描结果位于 `FunBox_v2162_analysis/API_network_scan.txt`。

## 8. 阅读顺序

1. 从 `FunBox_v2162_readable/sources/fun/box001/loader/XPEntry.java` 与 `ZygiskEntry.java` 开始。
2. 阅读 `FunLoader.java`、`FileUtils.java`、`Env.java`，确认 Java 到 Native 的装载边界。
3. 检查 `FunBox_v2162_apktool/unknown/customize.sh`、`action.sh`、`webroot/app.js`，确认安装、作用域与配置行为。
4. 查看 `FunBox_v2162_analysis/native_summary.txt` 和 `lib/arm64-v8a/`，跟踪原生加载器与 VM 核心。
5. 对任何 JADX 的 `Code decompiled incorrectly` 提示，使用同路径的 `FunBox_v2162_readable_simple/` 和 `FunBox_v2162_apktool/smali/` 逐段核对。
