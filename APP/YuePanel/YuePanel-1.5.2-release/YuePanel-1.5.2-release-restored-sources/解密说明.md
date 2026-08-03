# YuePanel 1.5.2 (build2) APK 完整静态恢复说明

## 1. 结论

- APK 包名：`com.yuexin.panel`（应用名 `YuePanel`，作者 YueXin/月信）
- 版本：`1.5.2`，`versionCode=152`，release，GIT revision `791752aed9a51a00b002b682519e019ea83c5212`
- 类型：Xposed/LSPosed 模块（`xposedminversion=83`）
- Xposed 入口：`com.yuexin.panel.hook.MainHook`（`assets/xposed_init`）
- 模块描述：`给抖音/QQ/Tim/微信添加更多功能`
- 作用域：抖音、QQ、TIM、微信（`xposedscope` 数组，见资源）
- 权限：`INTERNET`、`WRITE_EXTERNAL_STORAGE(maxSdk=28)`；`usesCleartextTraffic=true`
- SDK：`minSdk=26`，`targetSdk=34`，`compileSdk=36`
- DEX：`classes.dex` + `classes2.dex`
- Native 库（每 ABI）：`libyuexin.so`、`libyuexinya.so`、`libmiao.so`、`liburl_encode.so`、`libdexkit.so`（arm64-v8a / armeabi-v7a / x86 / x86_64）
- APK 大小：10,744,382 字节
- SHA-256：`4F5A4F8A724D062826A2FC3EF6076ACEF394463A42B8E034CA32B64DDFCA34E8`
- MD5：`1DC76088C9356A2C868CEE0CAD5F6AF6`

原 APK 保持不变。

## 2. 保护机制与“完整解密”边界（务必先读）

本 APK 使用了 **NMM 原生保护框架（`com.nmmedit.protect.NativeUtil`）**，不是普通的 R8 重命名：

| 保护手段 | 证据/数量 |
|---|---|
| 原生字符串加密 | 2,415 处 `yue_xin_awa(int)` native 桩调用；字符串密文与密钥在 `libyuexin.so`/`libyuexinya.so` 内，Java 侧只有 `yue_xin_awa(0)` 形式的下标调用 |
| 原生方法保护 | 大量 `public static native mXXXX(...)` 方法（如 `C3270.m342/m343/m6701`、`MainActivity.m31033-m31036`），方法体整体移入 native 库 |
| 类初始化挂钩 | 1,123 处 `NativeUtil.classesInit0(n)` / `classes2Init0(n)` |
| 签名校验 | `com.yuexin.panel.security.SignatureGuard`（`assertValid`/`nativeCheckSignature`/`failFast`），native 实现于 `libmiao.so`（含 `java.security.Signature`、`getPublicKey` 字符串） |
| 文件加解密 | `com.yuexin.panel.cpp.FileCryptoManager`：`YPNK2:`/`YPNV2:` 前缀，native `Encrypt/Decrypt`、崩溃处理安装 |
| DES/Base64 工具 | `liburl_encode.so`（glib DES/3DES + base64），JNI `com.shoujiduoduo.util.NativeDES.Decrypt/Encrypt/EncryptByteArray` |
| 命名混淆 | 类/字段名使用不可打印字符（`ۥ۟۟...`），JADX 已重命名为可读的 `Cxxxx`/`fxxxx` |

**诚实结论**：Java 侧（控制流、布局、逻辑骨架）已完整还原为可读源码；但上述 2,415 个 native 字符串、原生方法体、`SignatureGuard`/`FileCryptoManager` 的 native 实现位于 `.so` 内，**在没有 native 密钥与运行环境的情况下，无法在静态反编译中还原为明文**。本交付不会伪造“已解密”的字符串；这些桩调用在 Java/Smali/fallback 中按原样保留，作为精确证据。若要继续恢复 native 层，需要对其中的 `libyuexin.so`/`libyuexinya.so` 做 ELF 逆向（JEB/Ghidra 反汇编 + 提取密钥）。

## 3. 交付目录概览

| 路径 | 内容 | 用途 |
|---|---|---|
| `YuePanel-1.5.2-release-build2-restored-sources/` | 6,340 个可读 Java + 1,273 个资源文件 | **主交付目录**，Java 层完整还原源码 |
| `YuePanel-1.5.2-release-build2-jadx/` | JADX 1.5.5 原始输出 | 反编译原始证据 |
| `YuePanel-1.5.2-release-build2-fallback/` | 指令级 fallback Java（6,349 个） | 逐指令对照 |
| `YuePanel-1.5.2-release-build2-apktool/` | 14,840 个 Smali + 1,182 个解码资源 | 精确静态证据（字节码/资源/清单） |
| `yue_libs/lib/arm64-v8a/` | 提取的 arm64 `.so`（libyuexin/libyuexinya/libmiao/liburl_encode/libdexkit） | native 层证据 |
| `YuePanel-1.5.2-release-build2-解密说明.md` | 本文档 | 中文目录、重要文件、功能和 URL 清单 |

## 4. `restored-sources` 每个文件夹说明

### `sources/com/yuexin/panel/`（模块自有包，31 个 Java）

| 文件 | 说明 |
|---|---|
| `hook/MainHook.java` | Xposed 入口：加载 `miao`/`yuexinya`/`yuexin`/`dexkit`/`url_encode`，`SignatureGuard.assertValid` 校验，初始化 `C3270`/`C5433`/`C5311` 各功能模块 |
| `activity/MainActivity.java` | 模块设置主界面（部分方法/字符串为 native） |
| `security/SignatureGuard.java` | 原生签名校验（防篡改/激活校验） |
| `cpp/FileCryptoManager.java` | 原生文件加解密（`YPNK2:`/`YPNV2:`）与原生崩溃处理 |
| `panel/VoicePanel.java` | 语音面板（悬浮语音功能入口） |
| `panel/voice/audiobuild/AudioData.java`、`AudioRecord.java`、`AudioResponse.java` | 语音录制/响应数据构建 |
| `panel/voice/items/base/MainItems.java`、`SettingItems.java` | 语音面板主条目与设置条目 |
| `myClass/itemInfo.java` | 通用条目信息模型 |
| `myClass/LinDuo/` | “领多”功能数据模型：`LinMainItems`、`PackSheet`、`Page`、`Response`、`Ring`、`Sheet`、`Video` |
| `hook/p005dy/utils/VideoReplace.java` | 抖音（dy）视频替换工具 |
| `utils/CrashMonitor.java` | 崩溃监控 |
| `utils/entity/` | 数据模型：`GridGestureConfig`（九宫格手势配置）、`GroupBean`、`UserBean`、`RegionEntity`/`RegionInfo`（行政区划）、`CommentBean`、`bookmark/VideoMarkData`/`VideoMarkList`（视频书签） |
| `BuildConfig.java` | 构建常量（APPLICATION_ID/VERSION） |
| `C2597R.java`、`C2604.java` | 资源常量与辅助类 |

### `sources/Yue/`（R8 混淆主代码，3,687 个 Java）

模块业务逻辑与打包依赖混合所在（无子包，全部平铺）。重要类：

| 类 | 说明 |
|---|---|
| `C3270` | 全局初始化：应用上下文/ClassLoader/Activity 缓存，native 入口较多 |
| `C5433` | 按进程包名分发功能（微信/QQ/Tim/抖音） |
| `C5311` | 功能初始化（传入 classLoader 与全局上下文） |
| `C6352` | native 库加载器与进程判断（`m2815`/`m19853`） |
| `C5701`、`C4118` | 领多/本地数据功能；持有 `NativeDES` 实例（`f8239`/`f14040`），运行时会调用 DES 加解密 |
| `C3600`、`C3630`、`C5253`、`C5254`、`C6542`、`C6543`、`C7279`、`C6589` | MD5/SHA/HMAC/SecretKey 工具族（网络签名/摘要） |
| `C3818`、`C3819`、`C4858` | javax.crypto.Cipher 封装（DES/AES 相关实现） |
| `C4515` | SHA1 签名工具（含固定盐 `C8417.f3481`） |
| `C3020` | Java-WebSocket 封装 |
| `C5375`、`C8564`、`C4750`、`C4095`、`C5901`、`C5867`、`C5897` | 打包的 jsoup/XML/slf4j/HTTP 解析等库类 |
| `C6645` | 域名/URL 正则工具（含完整公共后缀表） |
| 其余 `Cxxxx` | 微信/抖音/QQ/Tim Hook 逻辑、UI 面板、网络请求等；字符串多为 `yue_xin_awa(n)` native 桩 |

### 其余顶层包

| 包 | 说明 |
|---|---|
| `sources/com/google/` | gson、Android Material 组件等（574 个） |
| `sources/com/bumptech/` | Glide 图片加载（332 个） |
| `sources/com/kongzue/` | DialogX 对话框库（104 个） |
| `sources/com/android/` | AndroidX/Android 兼容类（406 个） |
| `sources/com/shoujiduoduo/util/NativeDES.java` | 原生 DES 桥（对应 `liburl_encode.so`） |
| `sources/com/nmmedit/protect/NativeUtil.java` | NMM 保护框架入口（加载 `libyuexin.so`） |
| `sources/org/` | jsoup 等（584 个） |
| `sources/net/` | Java-WebSocket、ByteBuddy 等（380 个） |
| `sources/androidx/`、`android/`、`kotlin/`、`okhttp3/` | AndroidX/系统/Kotlin/OkHttp 依赖 |

## 5. Apktool 目录说明

| 目录 | 内容 |
|---|---|
| `AndroidManifest.xml` | 解码后清单：Xposed 元数据、MainActivity、权限 |
| `smali/` | 14,840 个 Smali（classes.dex + classes2.dex），含全部 `yue_xin_awa`/native 桩调用 |
| `res/` | 1,182 个解码资源（布局、drawable、values；资源名已被 R8 重命名） |
| `assets/` | `xposed_init`、`address.json`（全国行政区划数据，用于地区/定位功能）、`dexopt/baseline.prof*` |
| `lib/` | 4 个 ABI × 5 个 so |
| `original/`、`unknown/` | 原始资源与未归类文件 |

## 6. 主要功能清单（依据可读代码/清单）

- 多应用 Hook：抖音、QQ、TIM、微信（`xposeddescription`）。
- 语音面板：`VoicePanel` + 录制/响应构建（`AudioRecord`/`AudioResponse`），面板主条目与设置条目。
- “领多”功能：`LinDuo` 数据模型（主条目、包/页/环/视频/响应），配合 `NativeDES` 进行数据加解密。
- 抖音视频替换：`hook/p005dy/utils/VideoReplace`。
- 九宫格手势配置、群组/用户/评论数据、视频书签。
- 行政区划选择：`assets/address.json`（省/市/区代码与名称）+ `RegionEntity`/`RegionInfo`。
- 崩溃监控：`CrashMonitor` + `libmiao.so` 原生崩溃报告（`native.log`、`YuePanel host crash report`）。
- 原生文件加解密：`FileCryptoManager`（`YPNK2:`/`YPNV2:` 前缀文件）。
- 签名校验：`SignatureGuard` 防篡改。

## 7. URL 清单

### 7.1 可读 Java 中的 URL（均为库/文档性质）

| URL | 证据 | 说明 |
|---|---|---|
| `https://github.com/kongzue/DialogX`、`https://github.com/kongzue/DialogX/wiki` | `com/kongzue/dialogx/*` | DialogX 对话框库项目页 |
| `https://jsoup.org/cookbook/...`、`http://undefined/` | `Yue/C5375.java`（jsoup） | jsoup 库文档/测试数据 |
| `https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection` | `Yue/AbstractC3020.java` | Java-WebSocket 文档 |
| `https://github.com/google/gson/blob/main/Troubleshooting.md#` | `com/google/gson/*` | gson 文档 |
| `http://www.slf4j.org/codes.html#*`、`http://xmlpull.org/v1/doc/features.html#*`、`http://ns.adobe.com/xap/1.0/`、`http://java.sun.com/xml/stream/properties/report-cdata-event` | `Yue/C5867`、`C5897`、`C5901`、`C4750`、`C4095` | slf4j/xmlpull/XMP/StAX 库命名空间或文档 |
| `http://schemas.android.com/apk/res/android`、`http://schemas.android.com/apk/res-auto` | 资源 XML | Android XML 命名空间，非网络请求 |

### 7.2 模块业务 URL

模块自身的服务器/接口 URL（更新、激活、数据接口等）**位于 NMM 原生字符串表中**，Java 侧只有 `yue_xin_awa(n)` 桩调用，无法在静态反编译中取得明文。本报告不猜测、不伪造这些地址；如需取得，需继续逆向 `libyuexin.so`/`libyuexinya.so`。

## 8. 恢复精度与核验

- JADX 普通模式：6,340 个 Java、1,273 个资源；fallback：6,349 个 Java；Apktool：14,840 个 Smali、1,182 个资源。
- JADX 错误 44 处，分布于少量 `Yue/Cxxxx` 与库类（如 `com/kongzue/dialogx/PopTip`），相关方法均保留指令转储或可在 fallback 中核对。
- 可读 Java 中业务 URL 检索结果：0 条模块级 URL（其余全部为库文档 URL），与 NMM 原生字符串加密结论一致。
- 保护统计：`yue_xin_awa(` 2,415 处、`NativeUtil.classesInit0(` 1,123 处、native 方法数百处、`NativeDES`/`FileCryptoManager`/`SignatureGuard` 原生接口存在。
- 原 APK 未修改、未执行；可读 Java 是 DEX 重建源码，`yue_xin_awa` 等 native 桩按原样保留，未做伪造性还原。
