# FkWeChat 1.2.6 静态解包与反编译说明

## 产物范围

| 路径 | 内容 | 文件数 |
|---|---|---:|
| `FkWeChat_1.2.6.apk` | 原始 APK，保持不变 | 1 |
| `FkWeChat_1.2.6-extracted\` | APK 的完整 ZIP 文件树，含 DEX、原生库、资源和模块文件 | 124 |
| `FkWeChat_1.2.6-jadx\` | JADX 输出的可读 Java 源码和解码资源 | 7,323 |
| `FkWeChat_1.2.6-FILE-INVENTORY.tsv` | 上述两个导出目录中每一个文件的逐文件清单 | 7,447 条 |
| `FkWeChat_1.2.6-解密说明.md` | 本说明文档 | 1 |
| `FkWeChat_1.2.6-可读恢复与用户分级.md` | Dex2C 可读恢复证据，以及黑名单、普通与订单用户的差异 | 1 |

原始 APK 的 SHA-256：

```text
480C72C0B004AA912F1FA436BC7C1724CFD1E0CCCC03B0572FDA2115259E59D5
```

`FkWeChat_1.2.6-FILE-INVENTORY.tsv` 使用制表符分列：`Root`、`RelativePath`、`Bytes`、`Extension`。它是所有已导出文件的完整逐项索引；本文件对各目录和关键文件的内容进行说明。

## APK 身份与入口

| 项目 | 值 |
|---|---|
| 包名 | `me.yun.fkwechat` |
| 版本 | `1.2.6`，`versionCode=31` |
| SDK | `minSdk=26`，`targetSdk=36`，`compileSdk=37` |
| 主 Activity | `me.yun.fkwechat.ui.activity.MainActivity` |
| 查询目标 | `com.tencent.mm`（微信） |
| 主要权限 | `android.permission.INTERNET` |
| 模块类型 | Xposed/LSPosed 模块，同时带 Zygisk 与 KernelSU WebUI 文件 |

清单文件的可读版本位于 `FkWeChat_1.2.6-jadx\resources\AndroidManifest.xml`。其中声明了两个 Xposed 入口和微信作用域：

- `me.yun.fkwechat.loader.entry.Xp82Entry`
- `me.yun.fkwechat.loader.entry.Xp102Entry`
- 目标包：`com.tencent.mm`

## 完整解包目录

### `FkWeChat_1.2.6-extracted\`

这是 APK 原始条目的完全展开目录。

| 路径 | 数量/大小 | 内容 |
|---|---:|---|
| `AndroidManifest.xml` | 7,416 B | APK 原始二进制 Android 清单；可读解码版在 JADX resources 目录。 |
| `classes.dex` | 13,374,992 B | 主 DEX。 |
| `classes2.dex` | 7,473,808 B | 第二个 DEX。 |
| `classes3.dex` | 39,024 B | Dex2C 引导 DEX，含 native 方法声明和装载器。 |
| `resources.arsc` | 264,464 B | Android 资源表。 |
| `module.prop` | 152 B | 模块元数据。 |
| `customize.sh` | 1,342 B | Magisk/KernelSU 安装脚本。 |
| `DebugProbesKt.bin` | 1,733 B | Kotlin 协程调试探针元数据。 |
| `assets\` | 11 个文件（含展开后的内嵌资源） | 应用资产、DEX 优化配置、Xposed 初始化清单、Dex2C 标记。 |
| `kotlin\` | 8 个文件 | Kotlin 标准库 builtins 元数据。 |
| `lib\arm64-v8a\` | 4 个 `.so` | Android 仅 arm64-v8a 的原生库。 |
| `META-INF\` | 78 个文件 | AndroidX/Kotlin/OkHttp 版本标记、服务注册与 Xposed 元数据。 |
| `res\` | 1 个文件 | `yn.png` PNG 资源。 |
| `schema\` | 2 个 JSON | `draft-04.json` 与 `2020-12.json` JSON Schema。 |
| `webroot\` | 11 个文件 | KernelSU WebUI 的 HTML、Vue、MDUI、CSS、图标和辅助脚本。 |
| `zygisk\` | 1 个文件 | Zygisk 原生注入模块。 |

### `assets\`

| 文件/目录 | 内容 |
|---|---|
| `assets.zip` | 内嵌 WebUI 图标压缩包。 |
| `assets\` | 已从 `assets.zip` 展开的 5 个 PNG：`+1.png`、`about.png`、`ai.png`、`analy.png`、`icon.png`。 |
| `PublicSuffixDatabase.list` | OkHttp 使用的公共后缀列表数据。 |
| `xposed_init` | Xposed 初始化类：`me.yun.fkwechat.loader.entry.Xp82Entry`。 |
| `dexopt\baseline.prof` / `baseline.profm` | Android Baseline Profile / 元数据，供安装时 DEX 优化。 |
| `protected_by_np\ApkDex2CPro_c35bd4c930a0407088b93d251f6cadd9.txt` | 加固标记：`Apk-Dex2C-Pro 3.1.40`，保护时间为 `2026-06-25 12:18:22`。 |

### `lib\arm64-v8a\` 与 `zygisk\`

| 文件 | 大小 | 内容/角色 |
|---|---:|---|
| `libfkw.so` | 1,557,976 B | FkWeChat 的主要 Dex2C 原生实现；由 `FkwLoader` 通过 `System.loadLibrary("fkw")` 装载。 |
| `libdexkit.so` | 381,024 B | DexKit 原生库，用于 DEX 类/成员检索。 |
| `libsilk_codec.so` | 347,328 B | Silk 音频编解码库。 |
| `libandroidx.graphics.path.so` | 10,096 B | AndroidX 图形路径库。 |
| `zygisk\arm64-v8a.so` | 440,032 B | Zygisk 注入入口；安装脚本按设备 ABI 复制到模块目录。 |

### `META-INF\`

该目录是依赖和运行时元数据，不是业务源码。重点文件如下：

| 文件 | 内容 |
|---|---|
| `META-INF\xposed\module.prop` | Xposed 模块信息，模块 id 为 `fkwechat`。 |
| `META-INF\xposed\java_init.list` | Xposed API 82/102 入口：`Xp82Entry`、`Xp102Entry`。 |
| `META-INF\xposed\scope.list` | 作用域目标：`com.tencent.mm`。 |
| `META-INF\services\*` | Java `ServiceLoader` 服务注册。 |
| `META-INF\androidx.*.version` | AndroidX 各依赖版本标记。 |
| `META-INF\native-image\*` | OkHttp/Fastjson2 Graal Native Image 配置。 |

`module.prop` 的实际字段：

```properties
id=fkwechat
name=FkWeChat
author=雲上升
description=基于Zygisk的微信功能增强模块
version=v1.2.6
versionCode=31
minApiVersion=82
targetApiVersion=102
autoHotReload=true
staticScope=true
```

### `customize.sh`

安装脚本会根据设备 ABI 选择 `zygisk/<ABI>.so`，复制模块属性、WebUI 文件和原始 APK；其工作目录为 `/data/adb/fkwechat`，并把 APK 保存为 `/data/adb/fkwechat/apk/base.apk`。脚本还统计 DEX 与原生库数量后输出安装信息。

### `webroot\`

这是一个 Vue + MDUI 的 KernelSU 管理界面：

| 路径 | 内容 |
|---|---|
| `index.html` | WebUI 页面结构，包含“主页”和“设置”两个标签页。 |
| `js\app.js` | Vue 状态、深浅主题、微信进程/版本检测、配置读取保存、停止微信和重建沙箱操作。 |
| `utils\helper.js` | KernelSU `exec` 包装；配置路径为 `/data/user/0/com.tencent.mm/FkWeChat/config.json`，并包含 shell 命令构造。 |
| `css\style.css` | 页面样式。 |
| `libs\kernelsu-index.js` | KernelSU WebUI API。 |
| `libs\mdui.css`、`libs\mdui.global.js` | MDUI UI 库。 |
| `libs\vue.esm-browser.js` | Vue 浏览器 ESM 构建。 |
| `libs\material-icons.css`、`MaterialIcons-Regular.ttf` | Material Icons 字体与样式。 |
| `icon.png` | 模块图标。 |

## 可读反编译目录

### `FkWeChat_1.2.6-jadx\`

JADX 在这里输出 7,118 个 Java 文件及 205 个解码资源文件。

| 子目录 | 内容 |
|---|---|
| `sources\` | 三个 DEX 恢复得到的 Java 反编译文本。AndroidX、Kotlin、OkHttp、Fastjson2 等第三方库与应用代码混在其中。 |
| `resources\` | 解码后的 `AndroidManifest.xml`、`res`、assets、META-INF、webroot 和其它 APK 资源副本。 |

### 应用业务源码包

所有具有可识别业务名的 FkWeChat 类都在以下路径；文件内容为 JADX 的反编译结果，不是原始 Kotlin 源码。

| 源码路径 | 主要内容 |
|---|---|
| `me\yun\fkwechat\R.java` | Android 资源 ID 常量。 |
| `me\yun\fkwechat\p188ui\activity\MainActivity.java` | 模块主页面；方法体经 Dex2C 转为 native 声明。 |
| `me\yun\fkwechat\p188ui\activity\ManagerActivity.java` | 管理 Activity；生命周期与 UI 实现转为 native 声明。 |
| `me\yun\fkwechat\core\config\AppConfig.java` | 应用配置数据结构。 |
| `me\yun\fkwechat\core\config\AppMetadata.java` | 应用/模块元信息数据结构。 |
| `me\yun\fkwechat\core\config\ConfigRepo.java` | 配置仓库接口/实现入口。 |
| `me\yun\fkwechat\core\config\ControlManager.java` | 控制配置管理类。 |
| `me\yun\fkwechat\core\config\LicData.java` | 授权数据模型。 |
| `me\yun\fkwechat\core\config\Constants.java` | 域名与路径常量；具体见下方。 |
| `me\yun\fkwechat\core\config\C5179a.java` | 经混淆保留的配置辅助类。 |
| `me\yun\fkwechat\loader\LoaderCore.java` | 初始化/功能加载协调器，调用原生 `bootstrap`、`initialize`、`initFeature`。 |
| `me\yun\fkwechat\loader\api\HookEngine.java` | Hook API 表面：before、after、replace、unhook、构造函数/方法批量 Hook 等 native 接口。 |
| `me\yun\fkwechat\loader\driver\HookProviderZygisk.java` | Zygisk Hook Provider 适配层。 |
| `me\yun\fkwechat\loader\driver\C5180a.java` 至 `C5186g.java` | Hook Provider 的混淆辅助类。 |
| `me\yun\fkwechat\loader\entry\Xp82Entry.java` | Xposed API 82 入口。 |
| `me\yun\fkwechat\loader\entry\Xp102Entry.java` | Xposed API 102 入口。 |
| `me\yun\fkwechat\loader\entry\ZygiskEntry.java` | Zygisk 加载入口。 |
| `fkw0\p087me\yun\fkwechat\FkwLoader.java` | `libfkw.so` 装载器和 `registerNativesForClass` 原生注册方法。 |
| `fkw0\hidden\Hidden0.java` | Dex2C 初始化辅助类。 |

`Constants.java` 中直接可见的服务地址：

```text
https://api.yunpro.club
https://cdn.yunpro.club
https://app.yunpro.club/api/control.json
https://docs.yunpro.club
https://down.yunpro.club/api/plugins.json
https://app.yunpro.club/api/update.json
```

## Dex2C 边界

该 APK 使用 `Apk-Dex2C-Pro 3.1.40` 将重点 Java/Kotlin 方法编译为原生实现。JADX 恢复了：

- 包名、类名、字段、方法签名和 Kotlin 元数据；
- 组件入口、Xposed/Zygisk 适配关系；
- 未被转移的字符串、资源和 URL；
- `libfkw.so` 的装载和 native 方法注册关系。

但下列实现不在 Java 反编译结果中，而在 `FkWeChat_1.2.6-extracted\lib\arm64-v8a\libfkw.so` 内：

- `LoaderCore` 的初始化和功能装载方法；
- `MainActivity`、`ManagerActivity` 的关键方法体；
- `HookEngine` 的 Hook 具体实现；
- 多数配置和控制类的核心逻辑。

因此，`FkWeChat_1.2.6-jadx\sources` 是已成功恢复的 Java 层文本；它不等同于这些 native 方法的原始可编译源码。原始 DEX 与所有原生库都已保留在 `FkWeChat_1.2.6-extracted\`，便于后续继续进行原生静态分析。