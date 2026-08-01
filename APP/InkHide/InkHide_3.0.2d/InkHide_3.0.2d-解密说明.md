# InkHide 3.0.2d APK 解密与文件说明

## 1. 产物与校验

- 原始 APK：`InkHide_3.0.2d.apk`
- 原始大小：2,318,105 字节
- SHA-256：`DBCEAFBFD974A41E112CCE40D38CE6718CC0B44803F1B4CD2203FA0492C17699`
- JADX 源码与资源：`InkHide_3.0.2d-decompiled`
- Apktool 完整解包（资源、Manifest、Smali、原始附属文件）：`InkHide_3.0.2d-apktool-full`
- 明文源码副本：`restored-sources`
- JADX 版本：1.5.5；Apktool 版本：3.0.2

JADX 已导出 1,165 个 Java 文件和 512 个资源文件；Apktool 已导出 1,229 个 Smali 文件、450 个解码资源文件。JADX 源码适合阅读和跟踪业务逻辑，Smali 是与 DEX 指令对应的精确参考。APK 使用了 R8/混淆，第三方库和部分内部类会显示为 `p000A`、`p102z0` 等短包名；这是输入 APK 的符号状态，不是解包丢失。

`restored-sources` 是完整 JADX Java 源码副本。该 APK 未发现动态字符串 XOR 解码器；`p102z0/C1120c.java` 中的 RSA 签名校验用于完整性验证，`p094v0/C1028c.java` 中的 Base64 用于数据编码，不是源码解密器。

## 2. 应用身份与总体结构

- 应用显示名：`InkHide`
- 包名：`com.lu.wxmask272`
- Application：`com.lu.wxmask.App`
- Xposed 入口：`com.lu.wxmask.MainHook`
- Xposed 声明文件：`assets/xposed_init`
- 目标宿主：`com.tencent.mm`（微信）
- 主要权限：`INTERNET`、`VIBRATE`
- 主要技术：Android/Kotlin、Xposed API、DexKit、AndroidX、WebView、JSON 配置

这是一个 Xposed 模块，而不是普通独立业务 App。`MainHook` 在 Zygote 阶段记录模块路径，在微信进程创建时初始化插件；自身包名只加载设置页相关 Hook，微信包名才加载目标功能插件。

## 3. 解包目录逐项说明

### 3.1 JADX 输出：`InkHide_3.0.2d-decompiled`

| 目录 | 内容 | 说明 |
|---|---|---|
| `sources/` | 1,165 个 `.java` | JADX 反编译源代码。`com/p055lu/wxmask` 是应用主代码；`androidx`、`kotlin`、`org/luckypray/dexkit` 等是依赖；`p000A` 至 `p102z0` 多为混淆后的内部/库类。 |
| `resources/` | 512 个文件 | JADX 解码的 `AndroidManifest.xml`、`res/` XML/图片/HTML/JSON 等资源。 |

应用主源码文件：

| 文件 | 作用 |
|---|---|
| `sources/com/p055lu/wxmask/MainHook.java` | Xposed 三个入口接口；识别微信进程，安装插件，处理模块完整性检查和崩溃诊断。 |
| `sources/com/p055lu/wxmask/SelfHook.java` | 模块自身设置页相关 Hook。 |
| `sources/com/p055lu/wxmask/App.java` | 应用初始化、全局 Context 和运行状态初始化。 |
| `sources/com/p055lu/wxmask/p057ui/MainActivity.java` | Xposed 模块设置主界面。 |
| `sources/com/p055lu/wxmask/p057ui/DeepLinkActivity.java` | 处理 `maskwechat://com.lu.wxmask/...` 深链接。 |
| `sources/com/p055lu/wxmask/p057ui/WebViewActivity.java` | 加载本地 HTML 的 WebView 页面并在结束时清理 WebView。 |
| `sources/com/p055lu/wxmask/p057ui/JsonMenuManager$*.java` | 解析 `menu_ui.json`，生成反馈/关于菜单。 |
| `sources/com/p055lu/wxmask/config/AppConfigUtil.java` | 从 GitHub 或 jsDelivr 异步获取远程配置和更新说明，并缓存到应用 files 目录。 |
| `sources/com/p055lu/wxmask/config/AppConfig.java` | 远程配置根对象，包含 `MainUi`。 |
| `sources/com/p055lu/wxmask/config/MainUi.java` | 主界面配置，包含捐赠卡片和模块卡片。 |
| `sources/com/p055lu/wxmask/config/DonateCard.java` | 捐赠卡片的标题、描述和显示开关。 |
| `sources/com/p055lu/wxmask/config/ModuleCard.java` | 模块卡片链接。 |
| `sources/com/p055lu/wxmask/bean/OptionData.java` | 选项持久化数据；包含 `readTraceServerUrl` 默认值。 |
| `sources/com/p055lu/wxmask/bean/*.java` | 屏蔽项、坐标、临时项、数据库项等数据模型。 |

### 3.2 Apktool 输出：`InkHide_3.0.2d-apktool-full`

| 目录/文件 | 数量/内容 | 说明 |
|---|---:|---|
| `AndroidManifest.xml` | 1 | 已解码 Manifest，包含组件、权限、Xposed 元数据、深链接。 |
| `smali/` | 1,229 个文件 | DEX 的 Smali 表示，适合核对 JADX 警告、字符串和真实控制流。 |
| `res/` | 450 个文件 | Apktool 解码的 Android 资源，保留原资源目录分类。 |
| `assets/` | 3 个文件 | `xposed_init`、`dexopt/baseline.prof`、`dexopt/baseline.profm`。 |
| `lib/` | 4 个 ABI 目录 | 每个 ABI 都有 `libdexkit.so`：`arm64-v8a`、`armeabi-v7a`、`x86`、`x86_64`。 |
| `original/` | 1 个文件 | `original/AndroidManifest.xml`，保存 Apktool 解码前的 Manifest 副本。 |
| `unknown/` | 44 个文件 | Kotlin builtins、AndroidX/Kotlin 版本元数据、`build_info.json`、`kotlin-tooling-metadata.json` 等不属于标准 res 的 APK 内容。 |

`res/` 中的重点文件：

- `res/raw/menu_ui.json`：两个菜单项，反馈问题和关于项目。
- `res/raw/releases_note.html`：本地更新说明页面，使用 marked.js 渲染 GitHub Release 数据。
- `res/values/strings.xml`：应用名、Xposed 描述、界面文字。
- `res/layout/fragment_main.xml`、`layout_main.xml`、`item_icon_text.xml`：设置页布局。
- `res/xml/network_security_config.xml`、`data_extraction_rules.xml`：网络安全和备份规则。
- `res/mipmap-*`、`res/drawable*`、`res/color*`、`res/values*`：图标、状态选择器、主题、颜色和 AndroidX 配套资源。

## 4. Manifest 组件和行为

- `com.lu.wxmask.ui.MainActivity`：导出设置入口，带 `de.robv.android.xposed.category.MODULE_SETTINGS`。
- `com.lu.wxmask.ui.DeepLinkActivity`：导出 `maskwechat://com.lu.wxmask` URI 入口。
- `com.lu.magic.util.permission.PermissionActivity`：内部权限辅助 Activity。
- `com.lu.wxmask.ui.WebViewActivity`：内部 WebView Activity。
- `androidx.startup.InitializationProvider`：AndroidX 初始化组件。
- `androidx.profileinstaller.ProfileInstallReceiver`：Profile 安装广播接收器。

Xposed 元数据声明了 `xposedmodule=true`、最低版本 82，作用域资源为 `xposed_scope`。原始 `assets/xposed_init` 内容为 `com.lu.wxmask.MainHook`。

## 5. URL 与网络地址清单

下表来自 JADX 源码、Apktool Smali、`res/raw`、Manifest 和 APK 字节扫描。地址按用途分类；“静态样例”表示它出现在嵌入的微信示例 XML 中，不代表 InkHide 的固定服务端。

| URL/地址 | 类型 | 证据位置与用途 |
|---|---|---|
| `https://raw.githubusercontent.com/Mingyueyixi/MaskWechat/main` | 远程配置/更新 | `AppConfigUtil.java`；拼接 `/res/raw/app_config.json` 和 `/res/html/releases_note.html`。 |
| `https://cdn.jsdelivr.net/gh/Mingyueyixi/MaskWechat@main` | 远程配置/更新备用源 | `AppConfigUtil.java`；GitHub 请求失败时使用。 |
| `https://api.github.com/repos/Xposed-Modules-Repo/com.lu.wxmask/releases` | 更新 API | `res/raw/releases_note.html` 第 149 行，页面 `fetch()` 获取 Release。 |
| `https://api.github.com/repos/Mingyueyixi/MaskWechat/releases` | 注释掉的旧更新 API | `res/raw/releases_note.html` 第 148 行，仅注释文本。 |
| `https://cdn.jsdelivr.net/npm/marked@4.2.12/marked.min.js` | 前端依赖 | `res/raw/releases_note.html`，用于 Markdown 渲染。 |
| `https://github.com/Mingyueyixi/MaskWechat/issues` | 菜单链接 | `res/raw/menu_ui.json`，反馈问题。 |
| `https://github.com/Mingyueyixi/MaskWechat` | 菜单链接/深链接目标 | `res/raw/menu_ui.json`，关于项目；Smali 中也有 `maskwechat://...url=` 拼接。 |
| `https://read.spint.kdns.fr` | 选项默认地址 | `OptionData.java` 和 Smali；字段名为 `readTraceServerUrl`，可由远程/本地选项覆盖。 |
| `https://local.inkhide.invalid/` | WebView 本地基地址占位符 | `smali/y0/d.smali` 的 `loadDataWithBaseURL`；用于加载本地 HTML，不是公网服务。 |
| `https://t.me/MaskWechat3` | Xposed 描述中的 Telegram 链接 | `res/values/strings.xml`。 |
| `https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.7.0/styles/default.min.css` | 注释掉的前端依赖 | `releases_note.html`，HTML 注释。 |
| `https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.7.0/highlight.min.js` | 注释掉的前端依赖 | `releases_note.html`，HTML 注释。 |
| `https://android.googlesource.com/toolchain/llvm-project` | 构建/依赖元数据 | APK 字节中的工具链字符串，未发现应用代码调用。 |
| `https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade` | 静态样例 | `smali/r0.1/w1.smali` 的嵌入微信示例 XML。 |
| `https://wx.qlogo.cn/...` | 静态样例 | 同上，示例头像地址。完整内容见对应 Smali 文件。 |
| `https://dldir1v6.qq.com/...` | 静态样例 | 同上，示例资源地址。 |
| `http://wxapp.tc.qq.com/...` | 静态样例 | 同上，示例媒体地址。 |

未发现 Retrofit、OkHttp、HttpURLConnection 等应用主代码中的固定 REST 接口调用。实际网络行为主要是 `AppConfigUtil` 的配置/更新下载、更新页 JavaScript 的 GitHub Release 请求，以及由配置项决定的 `readTraceServerUrl` 使用路径。

## 6. 反编译质量与核对方式

- JADX 输出包含少量 `JADX WARN`/`code restructure failed` 注释，主要集中在混淆的通用库、Xposed 辅助逻辑和泛型/协程代码。
- 需要精确指令或核对缺失控制流时，使用同名 `InkHide_3.0.2d-apktool-full/smali/` 文件；不要把 JADX 的警告片段当作原始 Kotlin 源码。
- 应用主包 `com/p055lu/wxmask` 已导出为可阅读 Java 代码；Kotlin 原始文件名、局部变量名和部分内部类名受 APK 混淆影响，JADX 已按可读形式重建类结构。
- 原 APK 未被修改；所有输出均在新目录中。
