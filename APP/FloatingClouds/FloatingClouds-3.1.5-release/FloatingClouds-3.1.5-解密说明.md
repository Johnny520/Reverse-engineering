# FloatingClouds 3.1.5 APK 完整静态恢复说明

## 1. 结论

- APK 包名：`top.mmjz.floatingclouds`
- 版本：`3.1.5`（APK 文件名为 `FloatingClouds-3.1.5-release.apk`）
- 类型：Xposed/LSPosed 模块（libxposed API，`minApiVersion=102`，支持热重载）
- Xposed 入口：`top.mmjz.floatingclouds.XposedEntry`（`assets/xposed_init`）
- 作用域/目标：微信 `com.tencent.mm`（也放行模块自身进程）
- 权限：`android.permission.KILL_BACKGROUND_PROCESSES`
- DEX：单个 `classes.dex`
- Native 库：`libdexkit.so`（arm64-v8a、armeabi-v7a、x86、x86_64 共 4 份）
- APK 条目数：598
- APK 大小：4,916,796 字节
- SHA-256：`FDE45CBBF34240B4E78C55B74FA07FD3F49087180C9841459269FB2311CAC0D8`
- MD5：`93D73C1A5A03B3FE4BB24B1381F6E6AE`

原 APK 保持不变。本模块**没有任何字符串/配置加密层**：模块代码中不存在 `javax.crypto`、AES/DES/RSA、`MessageDigest`、Base64 加解密调用，也不存在字符偏移解码和控制流平坦化。`libdexkit.so` 是 LuckyPray 的 DexKit 运行时库（`org.luckypray.dexkit`），用于在运行时定位微信混淆后的类/方法/字段，不是壳或保护层。因此“解密”在本包中即完整反编译与源码还原，交付的就是可直接阅读的 Java 源码。

## 2. 交付目录概览

| 路径 | 内容 | 用途 |
|---|---|---|
| `FloatingClouds-3.1.5-restored-sources/` | 1,215 个可读 Java + 725 个资源文件 | **主交付目录**，完整还原源码 |
| `FloatingClouds-3.1.5-jadx/` | JADX 1.5.5 原始输出 | 反编译原始证据 |
| `FloatingClouds-3.1.5-fallback/` | 指令级 fallback Java（1,215 个） | 与普通模式对照，逐指令核对 |
| `FloatingClouds-3.1.5-apktool/` | 2,295 个 Smali + 639 个解码资源 | 精确静态证据（字节码/资源） |
| `FloatingClouds-3.1.5-解密说明.md` | 本文档 | 中文目录、重要文件、功能和 URL 清单 |

## 3. `restored-sources` 每个文件夹说明

### `sources/top/mmjz/floatingclouds/`（模块自有代码，11 个 Java）

| 文件 | 说明 |
|---|---|
| `XposedEntry.java` | libxposed 模块入口：`onModuleLoaded`/`onPackageReady`/热重载；在微信进程初始化 Hook，注册 `initWeChatHooks` 与 `initPlugins`，并执行旧版数据迁移 |
| `App.java` | 模块自身 `Application` |
| `p001ui/MainActivity.java` | 设置界面 Activity，挂载主 Fragment，注册 Activity 生命周期监听 |
| `bean/MaskItemBean.java` | “密友伪装”条目模型（`maskId`/`tagName`/`tipMode`/`tipData`/`mapId`），JSON 导入导出 |
| `plugin/IPlugin.java` | 插件接口：`handleHook`/`onConfigChange`/`onCreate` |
| `databinding/` | ViewBinding 生成类（主界面、开关项、按钮项） |
| `C1329R.java` | 资源常量 |

### `sources/p000a/`（混淆后的模块业务代码，911 个 Java）

R8 重命名后的模块主代码包。类名中的 `C0xxx` 对应混淆名 `a.XX`；JADX 已保留 Kotlin 元数据并展开大量局部名。最重要的类：

| 类 | 角色 |
|---|---|
| `C0582fh` | `WXMaskPlugin` 主插件聚合器：按阶段并发初始化 22 个子部件，管理伪装列表缓存与启动快照 |
| `C0425X9` | 设置页 `MainFragment`（RecyclerView 开关/按钮列表：“隐藏密友消息通知”“立即扫描适配”“当前微信版本”） |
| `C0525ch` | `WXDbPlugin`：拦截 `com.tencent.wcdb.database.SQLiteDatabase.openDatabase` |
| `C0910x3` | 插件：拦截 `com.tencent.wcdb.database.SQLiteDatabase` 的全部方法 |
| `C0446Yc` | 远程 kill switch：`HttpURLConnection` 拉取 `kill_switch.json`，解析 `disabled`/`message`/`versions.3.1.5` |
| `RunnableC0679l0` | 后台任务：kill switch 轮询（每 30 分钟）、进程重启、诊断、热更新定位 |
| `C0186K3` | 配置存储：SharedPreferences 键 `options`、`maskList`、`hiddenOwnSnsIds`、`blockHotUpdate_reminder_acked`、`config_mode_flag` |
| `C0653jc` | 配置数据类：`master`、`hideConv`、`blockChat`、`hideContact`、`hideSns` 等开关字段 |
| `C0021B1` | 读取微信 `versionName`/`versionCode` |
| `C0619hg` + `C0638ig` | 微信版本快照采集 `VersionSnapshot`（类结构解析结果） |
| `C0637if` | 热更新阻断 `BlockHotUpdate`：定位补丁路径并阻止加载 |
| `C0656jf`/`C0657jg` | 热更新定位辅助状态 |
| `C0088Ed` | `RuntimeClassResolver`：微信关键类解析，SP 缓存 |
| `C0319Rb` | `ObfResolv`：基于 DexKit 的混淆符号解析缓存 |
| `C0122Gb` | 会话/消息存储结构解析（`F010` 会话存储对、消息插入） |
| `C0475a5` | `DexKitCache`：`dexkit_scan_cache` 扫描结果缓存与健康检查 |
| `C0804rb` | 功能开关注册表（`F004`…`F025` 分阶段特性开关） |
| `C0723n6` | 模块诊断/健康状态收集（`[DIAG-HEALTH]`） |
| `C0908x1` | 日志封装（走 `XposedEntry.log`，标签 `Floatingclouds`） |
| `C0803ra` | 伪装列表管理弹窗（显示 “@mmjz” 与 Telegram 链接） |
| `C0009A8` | `HideStorageChatRecord`：聊天记录存储隐藏（DexKit 定位字段） |
| `C0068Db` | `MuteNotifPart`：免打扰/通知相关 Hook |
| `C0873v4` | `ConvMuteRuleRegistrar`：微信原生会话免打扰规则注册 |
| `C0879va` | `maskedMsgVibratePluginPart`：被隐藏消息的震动反馈 |
| `C0816s4` | `hideMainUIListPluginPart`：主界面列表隐藏 |
| `C0918xb` | `msgInsertDispatcher`：消息插入分发 |
| `C0376Ue` | `tempUnhideTriggerPart`：临时解除隐藏 |
| `C0841ta` | `maskUIManagerPluginPart`：伪装 UI 管理器 |
| `C0550e4` | `convAddMaskPluginPart`：会话添加伪装 |
| `C0329S3` | `contactAddMaskPluginPart`：联系人添加伪装 |
| `C0353T9` | `longClickTracePluginPart`：长按追踪 |
| `C0706m8` | `hideOwnSnsPluginPart`：隐藏自己的朋友圈 |
| `C0611h8` | `hideContactListPluginPart`：隐藏联系人列表项 |
| `C0605h2` | `blockContactInfoPluginPart`：阻止查看联系人资料 |
| `C0533d6` | `enterChattingUIPluginPart`：进入聊天界面处理 |
| `C0065D8` | `hideTextStatusPluginPart`：隐藏文本状态 |
| `C0820s8` | `hideSnsEntryPluginPart`：隐藏朋友圈入口 |
| `C0896w8` | `hideSnsInteractionPluginPart`：隐藏朋友圈互动 |
| `C0858u8` | `hideSnsGroupIconPluginPart`：隐藏群头像入口 |
| `C0592g8` | `hideContactLabelPluginPart`：隐藏联系人标签 |
| `C0627i5` | `diagSnsLabelPluginPart`：朋友圈标签诊断 |
| `C0624i2` | `blockHotUpdatePluginPart`：热更新阻断插件 |
| `C0268Od` | `searchCommandPluginPart`：搜索命令 |
| `C0173J8` | 会话封装：libxposed Hook 工具（`hook`/`intercept`） |
| `C0938yc` | 插件注册表（`className → IPlugin`） |
| `C0889w1` | 全局微信 `Context`/`ClassLoader` 缓存 |
| `C0739o3` | 列表/集合工具 |
| `C0631i9` | Kotlin 内建检查与字符串工具 |
| `C0944z` | 字符串拼接辅助 |
| `C0901wd`/`C0920xd`/`C0413Wf` | 异常、Result 与 Unit 辅助 |
| `C0505bg` | UTF-8 字符集解码器（标准编码实现，非加解密） |

其余 `p000a` 类为 Kotlin 协程、AndroidX 打包类、Material 组件等依赖代码，以及上述部件的回调/适配器内部类。

### `sources/org/luckypray/dexkit/`（3 个 Java）

DexKit 的 Java 接口（`DexKitBridge`、`NativeReflect`、`R`），通过 JNI 调用 `libdexkit.so`，用于在运行时按名称/签名/注解定位微信 DEX 中的类、方法、字段。

### 其余依赖源码

- `sources/androidx/`：AndroidX（activity、fragment、recyclerview、lifecycle 等）
- `sources/com/google/android/material/`：Material Design 组件
- `sources/kotlin/`、`sources/dev/`：Kotlin 标准库元数据与协程调试类

## 4. Apktool 目录说明

| 目录 | 内容 |
|---|---|
| `AndroidManifest.xml` | 解码后的清单：模块声明、设置 Activity（`io.github.libxposed.category.MODULE_SETTINGS`）、FileProvider、权限 |
| `smali/` | 2,295 个 Smali 文件，逐指令证据 |
| `res/` | 639 个解码资源（布局、drawable、values 等） |
| `lib/` | 4 个 ABI 的 `libdexkit.so` |
| `assets/` | `xposed_init`（入口声明）、`dexopt/baseline.prof`、`baseline.profm` |
| `original/`、`unknown/` | 原始资源与未归类文件 |

## 5. 主要功能清单

- 密友伪装/隐藏：对指定联系人（`maskId`）在会话、联系人列表、朋友圈、通知等场景隐藏，支持临时解除与提示文案。
- 隐藏消息通知：被隐藏后自动设置微信原生免打扰，临时解除后恢复提醒。
- 隐藏微信界面元素：主界面列表、联系人列表、联系人标签、文本状态、朋友圈入口/互动/群头像、自己的朋友圈。
- 阻止查看联系人资料、长按追踪、搜索命令、消息插入分发。
- 数据库层拦截：`WXDbPlugin` 与 `SQLiteDatabase` 全方法拦截（WCDB 打开/读写路径）。
- 聊天记录存储隐藏：`HideStorageChatRecord` 使用 DexKit 定位字段实现。
- 阻止微信热更新：`BlockHotUpdate` 定位补丁路径并阻止加载，热重载时可重新解析。
- 微信版本快照与类解析缓存：`VersionSnapshot`、`RuntimeClassResolver`、`DexKitCache`，加速下次启动。
- 旧版数据迁移：从 `com.lu.wxmask`、`com.lu.wxmask272`、`com.lu.floatingclouds` 迁移配置与伪装列表。
- 远程停用开关：后台线程拉取 kill switch，可全局或按版本停用并显示消息。
- 模块设置页：LSPosed 设置入口，展示当前微信版本、隐藏密友消息通知开关、立即扫描适配按钮。

## 6. URL 清单

### 6.1 模块业务 URL

| URL | 证据 | 用途 |
|---|---|---|
| `https://raw.githubusercontent.com/mmjzmmww/FloatingClouds/main/kill_switch.json` | `p000a/C0446Yc.java`（`f1658a[0]`） | 远程 kill switch；`HttpURLConnection` 8 秒超时请求，解析 `disabled`、`message`、`versions.3.1.5.disabled` |
| `https://t.me/tkwx123` | `p000a/C0803ra.java`、`ViewOnClickListenerC0594ga.java` | 伪装列表弹窗中的 Telegram 联系链接，点击以 `ACTION_VIEW` 打开 |

### 6.2 非业务 URL

- `http://schemas.android.com/apk/res/android` 与 `http://schemas.android.com/apk/res-auto` 是 Android XML 命名空间，出现在资源 XML 与 Material 组件中，不代表运行时 HTTP 请求。
- 未发现 OkHttp、WebView、Socket、`ws://`、`weixin://`、`content://` 等模块业务网络端点。

## 7. 恢复精度与核验

- JADX 普通模式：1,215 个 Java、725 个资源；JADX 指令级 fallback：1,215 个 Java；Apktool：2,295 个 Smali、639 个资源。
- 模块代码（`p000a` + `top`）中 `javax.crypto`、`Cipher`、`SecretKey`、AES/DES/RSA、`MessageDigest`、Base64、`decrypt`/`encrypt` 检索结果：0 命中（仅 `R.java` 资源名包含 `design`/`ContentDescription` 等子串误匹配）。
- 字符偏移/XOR 字符串解码检索：0 命中；控制流平坦化（`hashCode + switch` 循环）检索：0 命中。混淆仅为 R8 类/方法重命名。
- JADX 报告 2 处错误，均位于 `androidx.activity.result.AbstractC0981a.java`（AndroidX 库代码，类型推断失败），该方法已保留 JADX 指令转储，模块代码无结构化缺口。
- `libdexkit.so` 字符串确认属于 `org.luckypray.dexkit`（DexKit 运行时），非加壳/保护库。
- 原 APK 未被修改或执行；可读 Java 是从 DEX 重建的还原源码，不等同于开发者原始 Gradle/Kotlin 工程。
