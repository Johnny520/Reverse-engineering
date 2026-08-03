# CherryWeChat v1.0.1-47-g56d8c93 解包与可读代码说明

## 1. 样本信息

| 项目 | 值 |
|---|---|
| APK | `CherryWeChat_v1.0.1-47-g56d8c93.apk` |
| SHA-256 | `8E58756C4207B4A1BDB1D4DCB9895F9DCDC01378217F9A46998C31B7D08A0BDD` |
| 包名 | `io.github.cherrywechat` |
| 版本 | `v1.0.1-47-g56d8c93` (`versionCode=10724`) |
| SDK | minSdk 28；targetSdk 35；compileSdk 36 |
| DEX | `classes.dex` 1 个 |
| 可读 Java | 3077 个 |
| 指令优先 Java | 3077 个 |
| Smali | 3329 个 |
| JADX 资源 | 971 个 |
| Native ABI | `arm64-v8a` |

## 2. 交付目录

| 路径 | 内容 |
|---|---|
| `CherryWeChat_v1.0.1-47-g56d8c93_decompiled/` | JADX 反编译 Java 与完整解码资源；主阅读目录。 |
| `CherryWeChat_v1.0.1-47-g56d8c93_simple/` | JADX 简化反编译 Java；用于与 Dex 指令结构交叉核对。 |
| `CherryWeChat_v1.0.1-47-g56d8c93_apktool/` | Apktool 完整解包：Manifest、资源、Smali、assets、Native 库和未识别文件。 |
| `CherryWeChat_v1.0.1-47-g56d8c93_analysis/` | URL 清单、Native 库清单及关键配置导出。 |

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

完整表：`CherryWeChat_v1.0.1-47-g56d8c93_analysis/Native库清单.tsv`。

| 库 | 大小（字节） | |
|---|---:|---|
| `libc++_shared.so` | 1,292,904 | NDK C++ 运行时 |
| `libcherry.so` | 103,480 | Cherry 原生实现；HookEntry 显式加载 |
| `libcrypto.so` | 2,132,912 | OpenSSL crypto 库 |
| `libdecrepit.so` | 84,984 | OpenSSL 兼容组件 |
| `libdexkit.so` | 290,408 | DexKit 运行时 Dex/符号检索库 |
| `libluajit.so` | 752,496 | LuaJIT 运行时 |
| `libpki.so` | 1,176,880 | PKI/证书相关库 |
| `libsentry-android.so` | 16,832 | Sentry Android 桥接库 |
| `libsentry.so` | 704,344 | Sentry Native SDK |
| `libssl.so` | 829,680 | OpenSSL TLS 库 |

## 7. URL 全量静态扫描

扫描范围包括 Manifest、资源、assets、Smali 解包内容、未知文件和全部 Native ELF。完整位置清单：`CherryWeChat_v1.0.1-47-g56d8c93_analysis/URL清单.tsv`。

| URL | 分类 | 首个位置 |
|---|---|---|
| `http://10.0.2.2:8969/stream` | 静态 URL 字符串 | `smali/n3.1.smali`（共 1 处；完整位置见 TSV） |
| `http://localhost:8969/stream` | 静态 URL 字符串 | `smali/n3.1.smali`（共 1 处；完整位置见 TSV） |
| `http://ns.adobe.com/xap/1.0/` | 静态 URL 字符串 | `smali/Fg.smali`（共 1 处；完整位置见 TSV） |
| `http://schemas.android.com/aapt` | Android XML 命名空间 | `res/drawable/$avd_hide_password__0.xml`（共 58 处；完整位置见 TSV） |
| `http://schemas.android.com/apk/res-auto` | Android XML 命名空间 | `res/animator/design_appbar_state_list_animator.xml`（共 37 处；完整位置见 TSV） |
| `http://schemas.android.com/apk/res/android` | Android XML 命名空间 | `AndroidManifest.xml`（共 567 处；完整位置见 TSV） |
| `http://www.apache.org/licenses/` | 许可证或规范链接 | `unknown/META-INF/androidx/constraintlayout/constraintlayout-core/LICENSE.txt`（共 1 处；完整位置见 TSV） |
| `http://www.apache.org/licenses/LICENSE-2.0` | 许可证或规范链接 | `unknown/META-INF/LICENSE-luajava`（共 1 处；完整位置见 TSV） |
| `https://android.googlesource.com/toolchain/llvm-project` | 构建/工具链标识 | `lib/arm64-v8a/libc++_shared.so`（共 10 处；完整位置见 TSV） |
| `https://creativecommons.org/licenses/publicdomain` | 许可证或规范链接 | `unknown/META-INF/LICENSE-luajava`（共 1 处；完整位置见 TSV） |
| `https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions` | 静态 URL 字符串 | `smali/io/sentry/config/a.smali`（共 1 处；完整位置见 TSV） |
| `https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions` | 静态 URL 字符串 | `smali/io/sentry/config/a.smali`（共 1 处；完整位置见 TSV） |
| `https://luajit.org/` | 静态 URL 字符串 | `unknown/META-INF/LICENSE-luajava`（共 1 处；完整位置见 TSV） |
| `https://mozilla.org/MPL/2.0/` | 许可证或规范链接 | `unknown/okhttp3/internal/publicsuffix/NOTICE`（共 1 处；完整位置见 TSV） |
| `https://publicsuffix.org/list/public_suffix_list.dat` | 静态 URL 字符串 | `unknown/okhttp3/internal/publicsuffix/NOTICE`（共 1 处；完整位置见 TSV） |
| `https://www.apache.org/licenses/LICENSE-2.0` | 许可证或规范链接 | `unknown/META-INF/LICENSE-luajava`（共 1 处；完整位置见 TSV） |
| `https://www.opensource.org/licenses/mit-license.php` | 许可证或规范链接 | `unknown/META-INF/LICENSE-luajava`（共 1 处；完整位置见 TSV） |
| `https://youtrack.jetbrains.com/issue/KT-46465` | 静态 URL 字符串 | `unknown/kotlin/kotlin.kotlin_builtins`（共 1 处；完整位置见 TSV） |
| `https://youtrack.jetbrains.com/issue/KT-55980` | 静态 URL 字符串 | `smali/ys.1.smali`（共 1 处；完整位置见 TSV） |

网络请求相关代码集中在 `sources/io/github/cherrywechat/network/` 和 `sources/io/github/cherrywechat/lua/api/CherryNetworkAPI.java`。部分运行时字符串通过 `AbstractC0295Gu.m625r(long)` 与 `NetworkNativeBridge.decryptData()` 恢复，因此静态 URL 清单用于记录安装包中直接可见的 URL 字符串。

## 8. 阅读顺序

1. `HookEntry.java` → 确认 Xposed 入口与目标加载条件。
2. `lua/LuaEngine.java`、`lua/loader/ScriptLoader.java`、`lua/api/` → 查看脚本运行与接口表。
3. `network/NetworkNativeBridge.java` 和 `network/model/` → 查看网络边界与数据模型。
4. `assets/lua/*.lua` → 查看随包提供的脚本调用示例。
5. 对 JADX 的重建提示，使用同类路径的 `CherryWeChat_v1.0.1-47-g56d8c93_simple/` 与 `CherryWeChat_v1.0.1-47-g56d8c93_apktool/smali/` 对照。
