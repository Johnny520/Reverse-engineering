# Hchat alt-entry APK 完整静态恢复说明

## 1. 结论

- APK 包名：`h.Hchat`
- 构建标识：`alt-entry` 分支 release，AGP 9.0.1，GIT revision `c5317fe181bedffa6a261e24d75e9311a5898cf5`
- 类型：Xposed/LSPosed 模块（经典 Xposed API，`xposedminversion=93`）
- Xposed 入口：`h.Hchat.ModuleEntry`（`assets/xposed_init`）
- 模块描述：`微信功能增强模块`
- 作用域/目标：微信 `com.tencent.mm`
- 权限：`INTERNET`、`WAKE_LOCK`、`FOREGROUND_SERVICE`、`FOREGROUND_SERVICE_DATA_SYNC`
- 前台服务：`h.Hchat.hooks.items.keepalive.WeChatKeepAliveService`（微信保活）
- DEX：单个 `classes.dex`
- Native 库：`libdexkit.so`（DexKit 运行时）、`libhchat_crash.so`（原生崩溃捕获）、`libsilk_codec.so`（Silk 音频编解码）、`libandroidx.graphics.path.so`，各 4 个 ABI
- APK 条目数：28
- APK 大小：5,341,637 字节
- SHA-256：`88BB4BAFA8B4C2D2D49721003E50EB12DA9C269A7F1E2EEC3C31E3253646B7CB`
- MD5：`52D5701EFCF84571173718BD49035009`

原 APK 保持不变。这是一个大型微信自动化/增强模块：内置 BeanShell 脚本插件系统（`Hchat/脚本插件/`，附 `assets/script_plugin_agent_guide.md` 开发指南）、微信数据库/联系人/群聊/朋友圈/消息 API、AI 自动回复（智聊 OpenAI 兼容 + 小智 WebSocket/TTS）、QQ 音乐点歌、Silk/AAC 音频转换、插件市场、崩溃收集与保活服务。

**加密情况说明**：本模块的字符串与配置全部是明文，没有字符串/配置解密层。模块自有代码中唯一的加解密实现是脚本插件“编译快照”缓存加密：`ScriptPluginRuntime.snapshotKeyBytes()`（固定 16 字节数组与 90 异或生成 AES 密钥）配合 `bsh/snapshot/BshSnapshotHelper` 的 AES 读写，用于加密/解密 BeanShell 插件编译后的 `.snap` 快照缓存。这是功能性的文件加密，不属于代码混淆或配置保护，报告第 7 节给出精确位置。

## 2. 交付目录概览

| 路径 | 内容 | 用途 |
|---|---|---|
| `Hchat-alt-entry-release-signed-restored-sources/` | 6,467 个可读 Java + 116 个资源文件 | **主交付目录**，完整还原源码 |
| `Hchat-alt-entry-release-signed-jadx/` | JADX 1.5.5 原始输出 | 反编译原始证据 |
| `Hchat-alt-entry-release-signed-fallback/` | 指令级 fallback Java（6,470 个） | 与普通模式对照，逐指令核对 |
| `Hchat-alt-entry-release-signed-apktool/` | 7,283 个 Smali + 94 个解码资源 | 精确静态证据（字节码/资源） |
| `hchat_cloud_plugin.py` | Python 3 云端插件获取工具 | 列出/查询/下载 Hchat 插件市场的云端插件 |
| `cloud_plugin_demo/批量退群工具/` | 实测下载的云端插件示例 | 演示工具输出布局（main.java/info.prop/README.md/plugin.json） |
| `Hchat-alt-entry-release-signed-解密说明.md` | 本文档 | 中文目录、重要文件、功能和 URL 清单 |

## 3. `restored-sources` 每个文件夹说明

### `sources/p099h/Hchat/`（模块自有代码）

| 文件 | 说明 |
|---|---|
| `ModuleEntry.java` | Xposed 入口：`handleLoadPackage` 初始化流程；管理 DexKitBridge（按进程缓存）、事件总线、UI 注册表、特性开关，向微信进程注入全部 Hook |
| `R.java` | 模块资源常量 |
| `crash/` | 崩溃收集：`NativeCrashBridge`（对接 `libhchat_crash.so`）、`CrashExitInfoApi30`、崩溃后 UI/上报任务 |
| `dexkit/DexBridgeHolder.java` | DexKitBridge 单例持有与生命周期管理 |
| `dexkit/DexFinder.java` | 核心混淆定位器：按字符串/签名/注解解析微信类、方法、字段（会话删除、会话免打扰、消息存储、VoIP 管理等），带 SP 缓存 |
| `hooks/api/core/WeChatApis.java` | 微信 API 门面：会话、会话变更、消息、联系人、群聊、数据库等静态入口 |
| `hooks/api/model/` | 微信数据模型：`WeChatContact`、`WeChatChatroom`、`WeChatMessage`、`WeChatImageMsg`、`WeChatVideoMsg`、`WeChatFileMsg`、`WeChatQuoteMsg`、`WeChatPatMsg`、`WeChatTransferMsg`、`WeChatSnsPost`、`WeChatSnsMedia`、`WeChatSnsLivePhoto`、`WeChatSnsPrepareResult`、`ContactLabelBean` |
| `hooks/api/runtime/WeChatDatabaseApi.java` | 微信数据库 API：`rawQuery`/`query`/`insert`/`update`/`delete`、消息表枚举、存储对象 |
| `hooks/items/keepalive/WeChatKeepAliveService.java` | 前台保活服务（通知频道 `hchat_wechat_keep_alive`，文案“Hchat 微信强保活”） |
| `hooks/items/script/ScriptPluginRuntime.java` | 脚本插件运行时：插件加载/卸载/热重载、BeanShell 解释器环境注入、回调分发、protobuf 发送、朋友圈发布、媒体下载、快照 AES 加密（`snapshotKeyBytes`） |
| `hooks/items/script/ScriptPluginBridge.java` | 插件桥：配置读写、弹窗、Hook、反射、dex/so 加载 |
| `hooks/items/script/ScriptWaBridge.java` | 微信 API 桥：联系人/群聊/消息/朋友圈/收藏/位置/数据库/HTTP 下载 |
| `hooks/items/script/ScriptAudioBridge.java` | 音频桥：Silk/AAC/M4A/MP3/WAV/FLAC/OGG/MP4 互转 |
| `hooks/items/script/ScriptDexKitBridge.java` | DexKit 桥：`findClassList`/`findMemberList` 等脚本接口 |
| `hooks/items/script/ScriptFloatingGlassBarHandle.java` | 模块悬浮玻璃底栏句柄 |
| `hooks/items/script/ScriptMessageBean.java`、`ScriptQuoteMsgBean.java` | 脚本侧消息/引用消息模型 |
| `utils/KavaReflector.java` | 反射工具封装 |

### `sources/me/hd/wauxv/`（原 `me.hd.wauxv` 包）

- `data/bean/MsgInfoBean.java`：消息信息 Bean（消息 ID、类型、时间、talker、内容、图片/视频/引用/拍一拍/文件/转账等子对象），脚本 `onHandleMsg` 的标准参数类型
- `data/bean/info/`：消息子信息 Bean
- `plugin/api/`、`plugin/api/callback/PluginCallBack.java`：插件回调接口（Http/Download 回调等）

### `sources/me/yun/silk/`

- `SilkCodec.java`、`AacCodec.java`、`utils/Conversion.java`：Silk/AAC 音频编解码封装（对接 `libsilk_codec.so`）

### `sources/bsh/`

BeanShell-Android 解释器完整代码（`Interpreter`、`Parser`、`NameSpace`、`snapshot/BshSnapshotHelper` 等 161 个 Java），脚本插件的执行引擎；`BshSnapshotHelper` 实现快照文件的 AES 加解密。

### `sources/pXXX/`（R8 混淆后的模块业务与依赖，约 5,000 个 Java）

| 包/类 | 角色 |
|---|---|
| `gb/AbstractC1378b.java` | **脚本插件市场客户端**：默认服务地址 `https://hchat.208.75.133.91.sslip.io`（SP `Hchat_script_plugin_market` 的 `service_url` 可改），插件仓库列表、下载量、版本信息 |
| `p332wb/` | **自动回复/AI 回复**：`AbstractC4955ho` 配置 UI（“发送文字/图片/语音/随机语音/表情/视频/名片/文件/收藏/邀请进群/发送 XML/智聊 AI 回复/小智 AI 回复/小智语音回复”）；`C5185op` 内置 OpenAI 兼容 provider 地址 |
| `p345x8/` | **小智 AI（Xiaozhi）客户端**：`Hchat_auto_reply_config` 配置、WebSocket/TTS、MCP 端点列表；`C5725r` 配置类 |
| `p155ka/C2380f.java` | **QQ 音乐点歌/分享**：搜索（smartbox）、歌词、封面、试听流地址解析，供 `shareMusic`/`shareMusicVideo` 使用 |
| `p080fb/C1130h2.java` | 联网工具类：GitHub API/raw 下载、DuckDuckGo HTML 搜索、Base64 工具 |
| `p064ea/C0850b.java` | 拦截微信更新页：把 `support.weixin.qq.com/update` 与 `szsupport.weixin.qq.com/update` URL 置空 |
| `p136j8/C2105p.java` | 小程序分享链接构建（`servicewechat.com/{userName}/0/page-frame.html`） |
| `p213ob/C3121n.java` | 内置 Bilibili Studio（bilistudio）montage SDK 任务同步调用 |
| `p107h9/C1628c.java` | 关于/致谢页：KavaRef、DexKit、FastKV、wxtablet、LSPosed、Miuix、BeanShell-Android、Silk-Codec-Android、Telegram 链接 |
| `p332wb/C5107md.java` | 智聊 AI 配置：API Key、模型（如 `deepseek-ai/DeepSeek-V3`）、provider 选择 |
| `p332wb/AbstractC5193p0.java` 等大文件 | 微信 UI/业务 Hook 与自动回复执行逻辑（R8 混淆类，含大量中文界面文案，均为明文） |

其余 `pXXX` 为 R8 拆分出的模块业务类与打包依赖类，无法逐一对应原始 Kotlin 包名；它们与 `androidx/`、`com/alibaba/fastjson2/`、`okhttp3/`、`okio/`、`kotlin/`、`org/luckypray/dexkit/`、`sh/`（shell 相关）等目录共同构成完整源码。

### 顶层其他目录

- `sources/okhttp3/`、`okio/`：OkHttp/Okio 网络栈（`publicsuffixes.gz` 为其内置公共后缀数据）
- `sources/com/alibaba/fastjson2/`：fastjson2 JSON 库
- `sources/org/luckypray/dexkit/`：DexKit Java 接口
- `sources/androidx/`、`kotlin/`：AndroidX 与 Kotlin 依赖
- `sources/gg/`、`mh/`、`p151k6/`、`p165l6/`、`p100h0/`、`p117i0/`：Gson、SLF4J、Compose 等第三方库的混淆包

## 4. Apktool 目录说明

| 目录 | 内容 |
|---|---|
| `AndroidManifest.xml` | 解码后的清单：模块声明、保活 Service、权限、xposed 元数据（`xposedminversion=93`、`xposeddescription=微信功能增强模块`、`xposedscope`） |
| `smali/` | 7,283 个 Smali 文件，逐指令证据 |
| `res/` | 94 个解码资源（图标、布局、values、`xposed_scope` 数组等） |
| `lib/` | 4 个 ABI × 4 个 so（dexkit、hchat_crash、silk_codec、androidx.graphics.path） |
| `assets/` | `xposed_init`（入口 `h.Hchat.ModuleEntry`）、`script_plugin_agent_guide.md`（脚本插件开发指南 v2）、`dexopt/baseline.prof*` |
| `original/`、`unknown/` | 原始资源与未归类文件 |

另外 `META-INF/services/` 中的 `ff.c`、`qg.r`、`rg.a` 是打包进 DEX 的库服务注册类（混淆后的 `ff`/`qg`/`rg` 包），在 fallback 源码中完整保留。

## 5. 主要功能清单

- 消息收发与增强：文本/图片/语音/视频/表情/文件/收藏/名片/位置/XML/引用消息/拍一拍/小程序/音乐卡片发送，消息撤回、系统消息插入、历史消息查询、未读数与已读清理。
- 会话管理：原生会话删除（本地首页项）、会话免打扰、全部未读统计、会话列表操作。
- 联系人/群聊：好友与群列表、群成员增删/邀请、标签增删改查、好友资料/地区/头像查询、新好友验证（`verifyUser`）。
- 朋友圈：列表读取、媒体准备、发布（文字/图片/LivePhoto/视频）、时间线刷新。
- 数据库 API：微信 WCDB 的查询/写入封装（`WeChatDatabaseApi`）。
- 脚本插件系统：`Hchat/脚本插件/` 目录加载 BeanShell 插件（`main.java`/`info.prop`/`config.prop`），支持 `onLoad`/`onUnload`/`onClickSendBtn`/`onHandleMsg`/`onImageDownload`/`onProtobufPacket`/`onMemberChange`/`onNewFriend` 回调，支持 `loadDex`/`loadSo`、快照编译（AES 加密缓存）与热重载。
- AI 自动回复：智聊（OpenAI 兼容：OpenAI/DeepSeek/Anthropic/Gemini/OpenRouter/SiliconFlow）文字回复；小智（Xiaozhi）WebSocket 文字回复与 TTS 语音回复。
- 媒体下载：图片/视频（支持微信 CDN fileid 与 aesKey）、批量图片下载到 `Hchat/Image`、`Hchat/Video`、`Hchat/Cache`。
- 音频转换：MP3/WAV/FLAC/OGG/PCM/AAC/M4A/MP4 与 Silk 双向互转（`libsilk_codec.so`）。
- QQ 音乐：搜索、歌词、封面与试听流解析，用于发送音乐/音乐视频卡片。
- 插件市场：从 `https://hchat.208.75.133.91.sslip.io` 拉取插件仓库、下载量与版本信息。
- 保活：前台服务 `WeChatKeepAliveService` 保持微信息屏运行。
- 崩溃收集：`libhchat_crash.so` 原生崩溃捕获与崩溃后处理。
- 微信增强：拦截微信更新页、小程序分享链接构建、设备步数上报、浮窗玻璃底栏样式等。

## 6. URL 清单

### 6.1 模块自有服务

| URL | 证据 | 用途 |
|---|---|---|
| `https://hchat.208.75.133.91.sslip.io` | `gb/AbstractC1378b.java` | 脚本插件市场默认服务地址（SP `Hchat_script_plugin_market.service_url` 可配置），插件仓库列表/下载量接口 |

### 6.2 AI 服务

| URL | 证据 | 用途 |
|---|---|---|
| `https://api.openai.com/v1/chat/completions` | `p332wb/C5185op.java` | 智聊 OpenAI provider |
| `https://api.deepseek.com/chat/completions` | 同上 | 智聊 DeepSeek provider |
| `https://api.anthropic.com/v1/messages` | 同上 | 智聊 Anthropic provider |
| `https://generativelanguage.googleapis.com/v1beta` | 同上 | 智聊 Gemini provider |
| `https://openrouter.ai/api/v1/chat/completions` | 同上 | 智聊 OpenRouter provider |
| `https://api.siliconflow.cn/v1`、`.../v1/chat/completions` | `p345x8/C5728u.java`、`C5725r.java`、`p332wb/C5185op.java`、`p036c9/C0482r0.java` | 智聊 SiliconFlow provider / 小智语音 TTS |
| `https://api.xiaozhi.me/mcp/endpoints/list?endpoint_ids=` | `p345x8/AbstractC5731x.java` | 小智 MCP 端点列表 |
| `https://xiaozhi.me`、`https://xiaozhi.me/login`、`https://xiaozhi.me/console/agents` | `p345x8/` | 小智 AI 控制台/登录 |
| `https://api.tenclass.net/xiaozhi/ota/` | `p345x8/C5725r.java` | 小智 OTA 接口 |

### 6.3 QQ 音乐

| URL | 证据 | 用途 |
|---|---|---|
| `https://y.qq.com/`、`https://u.y.qq.com/cgi-bin/musicu.fcg?data=` | `p155ka/C2380f.java` | 音乐详情页/搜索接口 |
| `https://c.y.qq.com/splcloud/fcgi-bin/smartbox_new.fcg?format=json&inCharset=utf8&outCharset=utf-8&key=` | 同上 | 智能搜索 |
| `https://c.y.qq.com/lyric/fcgi-bin/fcg_query_lyric_new.fcg?format=json&nobase64=1&songmid=` | 同上 | 歌词查询 |
| `https://y.gtimg.cn/music/photo_new/T002R500x500M000` | 同上 | 专辑封面 |
| `https://sjy.stream.qqmusic.qq.com/` | 同上 | 试听流地址 |

### 6.4 微信/腾讯官方页面

| URL | 证据 | 用途 |
|---|---|---|
| `https://support.weixin.qq.com/update`、`https://support.weixin.qq.com/update/` | `p064ea/C0850b.java` | 微信更新页（模块将其置空以拦截更新） |
| `https://szsupport.weixin.qq.com/update`、`.../update/` | 同上 | 微信更新页（深圳入口，同样被拦截） |
| `https://servicewechat.com/{userName}/0/page-frame.html` | `p136j8/C2105p.java` | 小程序分享链接构建 |
| `https://weixin.qq.com/` | 同上 | 默认回退链接 |

### 6.5 第三方/其他

| URL | 证据 | 用途 |
|---|---|---|
| `https://member.bilibili.com/x/material/rubick-interface/sync-task?...` | `p213ob/C3121n.java` | 内置 Bilibili Studio montage SDK 任务同步 |
| `https://api.github.com`、`https://raw.githubusercontent.com`、`https://github.com/` | `p080fb/C1130h2.java` | GitHub API/raw 下载工具 |
| `https://html.duckduckgo.com/html/` | 同上 | DuckDuckGo HTML 搜索 |
| `https://connectivitycheck.gstatic.com/generate_204` | `p099h/Hchat/crash/RunnableC1436e.java` | 网络连通性检查 |
| `https://t.me/Hchat_ci`、`https://t.me/Hchat_Group` | `p107h9/C1628c.java` | 模块频道/群 Telegram 链接 |
| `https://github.com/HighCapable/KavaRef`、`.../LuckyPray/DexKit`、`.../BillyWei01/FastKV`、`.../Xposed-Modules-Repo/top.hookvip.wxtablet`、`.../LSPosed/LSPosed`、`.../compose-miuix-ui/miuix`、`.../CopyLibs/BeanShell-Android`、`.../YunJavaPro/Silk-Codec-Android` | `p107h9/C1628c.java` | 关于页开源项目链接 |
| `https://example.com/mcp` | `p015b0/C0152r.java` | MCP 配置示例占位符 |

### 6.6 库内非业务 URL

- `https://youtrack.jetbrains.com/issue/KT-55980`、`https://www.slf4j.org/codes.html#*`、`https://github.com/google/gson/blob/main/Troubleshooting.md#*`、`https://goo.gle/compose-feedback` 分别来自 Kotlin/SLF4J/Gson/Compose 库文档字符串。
- `http://schemas.android.com/apk/res/android`、`http://apache.org/xml/features/*`、`http://xml.org/sax/features/*`、`http://www.w3.org/XML/1998/namespace`、`http://www.w3.org/2000/xmlns/` 是 XML 命名空间，非网络请求。

## 7. 恢复精度与核验

- JADX 普通模式：6,467 个 Java、116 个资源；JADX 指令级 fallback：6,470 个 Java（多出的 3 个是 `ff.c`/`qg.r`/`rg.a` 等服务注册类）；Apktool：7,283 个 Smali、94 个资源。
- JADX 报告 148 处错误：约 70 处位于 `com/alibaba/fastjson2`（JSONReaderUTF8/UTF16/ASCII），约 4 处位于 `bsh/Parser`，其余分布在少量模块类与库类中；这些方法均已保留 JADX 指令转储或可在 fallback 中核对，模块主体源码完整可读。
- 字符串与配置均为明文：未发现常量数组 XOR 解码、字符偏移解码、控制流平坦化等保护。
- 唯一的加解密实现为脚本快照 AES：`ScriptPluginRuntime.java` 的 `snapshotKeyBytes()`（`{106,107,104,32,110,111,108,36,98,99,59,0,57,62,63,60}` 与 `90` 逐字节异或）→ `snapshotKey()` → `bsh/Interpreter.compileSnapshot/evalSnapshot` → `bsh/snapshot/BshSnapshotHelper`（AES 读写 `.snap` 快照缓存）。属功能性文件加密，非代码/配置保护。
- `libdexkit.so`（org.luckypray.dexkit）、`libsilk_codec.so`（me.yun.silk）、`libhchat_crash.so`（原生崩溃桥）、`libandroidx.graphics.path.so` 均通过 JNI/`System.loadLibrary` 使用，属于运行时库而非壳。
- 原 APK 未被修改或执行；可读 Java 是从 DEX 重建的还原源码，不等同于开发者原始 Gradle/Kotlin 工程。

## 8. 云端插件获取工具使用说明

### 8.1 工具与协议来源

工具文件：`hchat_cloud_plugin.py`（仅用 Python 3 标准库，无第三方依赖，已在本机 Python 3.14 实测通过）。

接口协议直接取自本次恢复的源码：

| 源码 | 作用 |
|---|---|
| `gb/AbstractC1378b.java` | 插件市场 HTTP 客户端：请求头、GET/POST/DELETE、响应信封 `{"ok":true,"data":{...}}` |
| `gb/EnumC1377a.java` | 方法枚举：GET/POST/DELETE |
| `gb/AbstractC1393q.java` | 插件 JSON 解析与 `installId`（UUID）生成 |
| `gb/AbstractC1387k.java` | 文件落盘、大小与 sha256 校验、目录名生成 |
| `gb/C1383g.java` | 插件文件模型：`name`/`content`/`sha256`/`size`/`encoding`（`utf8` 或 `base64`） |

默认服务地址：`https://hchat.208.75.133.91.sslip.io`（与模块内 SP 默认值一致，可用 `--service` 覆盖）。

### 8.2 支持的命令

| 命令 | 功能 |
|---|---|
| `list` | 列出云端插件市场（`GET /v1/plugins`） |
| `info` | 查询插件详情（`GET /v1/plugins/{pluginId}`，不下发文件） |
| `download` | 下载插件到本地（同上接口，写文件并校验） |
| `comments` | 读取插件评论（`GET /v1/plugins/{pluginId}/comments`） |
| `likes` | 读取插件点赞状态（`GET /v1/plugins/{pluginId}/likes`） |
| `download-event` | 上报下载事件并返回下载量（`POST /v1/plugins/{pluginId}/downloads`） |

`info` 和 `download` 支持 `--version-id` 读取历史版本（`GET /v1/plugins/{pluginId}/snapshots/{versionId}`）。

### 8.3 使用示例

```powershell
# 1. 列出市场插件（每页 20 条）
python hchat_cloud_plugin.py list

# 2. 按关键字搜索
python hchat_cloud_plugin.py list --keyword 天气 --limit 10

# 3. 查看插件详情（不下载文件）
python hchat_cloud_plugin.py info p_25a015db1b0643edacc651943af5b50f

# 4. 下载插件到默认目录 ./Hchat/脚本插件/<插件名>
python hchat_cloud_plugin.py download p_25a015db1b0643edacc651943af5b50f

# 5. 下载到指定目录并严格校验 sha256
python hchat_cloud_plugin.py download p_25a015db1b0643edacc651943af5b50f --out D:\HchatPlugins

# 6. 下载历史版本
python hchat_cloud_plugin.py download p_xxx --version-id v_xxx

# 7. 读取评论/点赞
python hchat_cloud_plugin.py comments p_25a015db1b0643edacc651943af5b50f --limit 100
python hchat_cloud_plugin.py likes p_25a015db1b0643edacc651943af5b50f --user-wxid wxid_xxx

# 8. 更换服务地址/带作者令牌
python hchat_cloud_plugin.py download p_xxx --service https://你的服务地址 --token 作者ownerToken
```

### 8.4 输出布局与校验

下载目录结构：

```text
Hchat/脚本插件/<插件名>/
├── main.java        # 插件主脚本（必需）
├── info.prop        # 插件信息（name/author/version/updateTime）
├── README.md        # 插件说明（可选）
├── main.java.bshs   # 编译快照（可选）
└── plugin.json      # 工具生成的下载清单（含各文件 sha256）
```

工具按应用端相同规则处理：

- 只允许 `utf8`/`base64` 两种文件编码；文件名强制为单一 basename，防路径穿越。
- 文件存在时校验 `size`；默认严格校验 `sha256`（`--no-verify` 可关闭）。
- `main.java` 缺失时拒绝落盘。
- `installId` 自动生成并保存在 `.hchat_install_id`（等同应用端 SharedPreferences 的 `install_id`），`--install-id` 可覆盖。

### 8.5 实测记录

- 2026-08-03 实测服务地址可访问，`list` 返回真实市场数据（如“天气查询配置版”“天气Pro”“批量退群工具”“进退群监控”等）。
- `download p_25a015db1b0643edacc651943af5b50f` 已成功下载“批量退群工具 v1.1.1”到 `cloud_plugin_demo/批量退群工具/`，含 `main.java`、`info.prop`、`README.md`、`plugin.json`，全部通过大小与 sha256 校验。
- 注意事项：
  - 工具需要联网访问插件市场；服务地址可在模块内（`Hchat_script_plugin_market` 的 `service_url`）或工具 `--service` 中修改。
  - 云端插件内容来自第三方作者，下载后请自行审阅 `main.java` 再启用。
  - 个别插件（如“批量退群工具”）的 `main.java` 只是加载器，运行时会再去本地寻找/解密自己的 `core.dex`/`core.dat` 核心代码，这属于插件作者自身的运行时保护，不属于市场协议层，工具无法也不负责解析该层内容。
  - `download-event` 会真实向市场上报一次下载事件，请仅在正式使用时调用。
