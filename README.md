# 解密工作存档（移动端逆向分析）

本仓库是移动端 Android / iOS 应用逆向工程与分析工作的存档，内容以**解密、反编译、还原、行为分析**为主。每个目录对应一个独立分析任务，包含原始安装包、反编译/反混淆源码、解密脚本、native 库分析以及分析报告。

> ⚠️ **声明**
> 本仓库内容仅用于**安全研究与逆向工程学习**目的。仓库中的部分样本（如 QStory、月虹一键隐藏 等）经分析被发现包含恶意或破坏性逻辑，相关分析报告仅用于安全研究参考。
> 请勿将本仓库任何内容用于非法用途、骚扰他人或攻击他人系统。使用者因使用本仓库内容产生的一切法律后果自行承担。

## 目录总览

| 目录 | 位置 | 分析对象 | 内容类型 |
|---|---|---|---|
| [FkWeChat](#fkwechat) | `APP/FkWeChat` | 微信 Xposed 模块 `me.yun.fkwechat` | 解包 + JADX 反编译 + native ELF 分析 |
| [Nuke](#nuke) | `APP/Nuke` | Xposed 模块 `me.dartcv.nuke`（v1.0.0 / v1.0.2） | 反编译 + 后端接口还原 + native 库分析 |
| [QStory](#qstory) | `APP/QStory` | QQ 工具 APK（多版本） | 反混淆 + 恶意行为分析 |
| [WAuxiliary](#wauxiliary) | `APP/WAuxiliary` | 微信辅助 Xposed 模块 `me.hd.wauxv` | 反混淆源码工程 |
| [dyyds](#dyyds) | `APP/dyyds` | 抖音 `com.ss.android.ugc.aweme.yyds` | 反编译 + 解密脚本 |
| [geek](#geek) | `APP/geek` | 微信模块 `com.ljx.wechatmod` | StringFog 字符串解密 |
| [微X](#微x) | `APP/微X` | 微信 Xposed 模块源码（WeChatXRemap） | Android Gradle 工程源码 |
| [月虹一键隐藏](#月虹一键隐藏) | `module/月虹一键隐藏` | Magisk/KernelSU 模块 v5.4.4 | 模块逆向 + ELF/脚本分析 |
| [短信](#短信) | `shell/短信` | 短信轰炸工具 26.07.03 | 多层混淆还原 + 接口清单提取 |
| [DY Helper](#dy-helper) | `APP/DY Helper` | 抖音辅助 Hook 模块 `com.example.dyhelper` | 解包 + 反编译 + 云端分析 |
| [Elaris](#elaris) | `APP/Elaris` | QQ Xposed 模块 `com.mr.elaris` | 反编译 + 功能分析 |
| [InkHide](#inkhide) | `APP/InkHide` | 微信 Xposed 模块 `com.lu.wxmask` | 解包 + 反编译 + 云端分析 |
| [XHS](#xhs) | `APP/XHS` | 小红书 Xposed 模块 | 静态恢复 + 字符串池解码 |
| [挖红薯呀](#挖红薯呀) | `APP/挖红薯呀` | 小红书 Xposed 模块 `top.anjao2024.xp1whs` | 静态解密 + 云端鉴权还原 |
| [Ｋｅｖｉｎ](#ｋｅｖｉｎ) | `APP/Ｋｅｖｉｎ` | 多平台 Xposed 模块 `kevin.fun` | 静态恢复 + 云端分析 |
| [Hchat](#hchat) | `APP/Hchat` | 微信增强 Xposed 模块 `h.Hchat` | 静态恢复 + 插件系统分析 |
| [OKK](#okk) | `APP/OKK` | 微信 Xposed 模块 `com.abc.module`（OKK） | 反混淆 + 语义化源码恢复 |
| [YuePanel](#yuepanel) | `APP/YuePanel` | 多平台 Xposed 模块 `com.yuexin.panel` | 反编译 + NMM 原生保护分析 |
| [FloatingClouds](#floatingclouds) | `APP/FloatingClouds` | 微信 Xposed 模块 `top.mmjz.floatingclouds` | 静态恢复 |
| [红薯猪手](#红薯猪手) | `APP/红薯猪手` | 小红书 Xposed 模块 `com.skyhand.redbookhelper` | 静态恢复 + 配置解密 |
| [FunBox](#funbox) | `APP/FunBox` | Xposed/Zygisk 模块 `have.fun` | 反编译 + native ELF 分析 |
| [CherryWeChat](#cherrywechat) | `APP/CherryWeChat` | 微信 Xposed 模块 `io.github.cherrywechat` | 反编译 + Lua 脚本系统分析 |
| [微信 8.0.75 官替多功能](#微信-8075-官替多功能) | `iPhone/微信_8.0.75官替多功能` | 微信 iOS 8.0.75 官替 IPA + 13 组功能 dylib | IPA 解包 + 18 个 dylib 解密 + ObjC 源码恢复 |
| [WCGlass](#wcglass) | `iPhone/WCGlass` | 微信液态玻璃增强组件 `WCGlass.dylib` | Mach-O 解析 + ObjC 源码 + 精确 ARM64 汇编 + 密码流程还原 |

> 📱 **iOS 部分**（`iPhone/` 目录）为 iOS 平台逆向工作：`iPhone/微信_8.0.75官替多功能/` 为微信 8.0.75 官替版 IPA 的功能提取与 dylib 解密项目，`iPhone/WCGlass/` 为其中的液态玻璃组件 `WCGlass.dylib` 的独立深度逆向项目。

---

## FkWeChat

针对微信 Xposed/LSPosed 模块 **FkWeChat v1.2.6**（包名 `me.yun.fkwechat`）的静态解包与反编译分析。

**分析对象特征**
- 目标应用：`com.tencent.mm`（微信）
- 模块类型：Xposed/LSPosed，同时带 Zygisk 与 KernelSU WebUI
- 加固方式：Apk-Dex2C-Pro 3.1.40，核心逻辑以 Dex2C 形式存在于 native 库 `libfkw.so`

**目录内容**（实际位置：`APP/FkWeChat/FkWeChat_1.2.6/`）

| 路径 | 说明 |
|---|---|
| `FkWeChat_1.2.6.apk` | 原始 APK（保持不变） |
| `FkWeChat_1.2.6-extracted/` | APK 完整 ZIP 解包目录（DEX、原生库、资源、模块文件） |
| `FkWeChat_1.2.6-jadx/` | JADX 反编译的 Java 源码与解码资源 |
| `FkWeChat_1.2.6-FILE-INVENTORY.tsv` | 全量文件逐项清单 |
| `FkWeChat_1.2.6-libfkw-*.tsv/txt/md` | native 库 `libfkw.so` 的 ELF 分析：符号表、字符串、注册表 |
| `FkWeChat_1.2.6-解密说明.md` | 解包与反编译过程说明 |
| `FkWeChat_1.2.6-可读恢复与用户分级.md` | Dex2C 可读恢复证据及用户分级差异 |
| `analyze_fkw_native.py` | native 库分析脚本 |

---

## Nuke

针对 Xposed 模块 **Nuke v1.0.0 / v1.0.2**（包名 `me.dartcv.nuke`）的反编译、后端接口还原与 native 分析。

### Nuke v1.0.0

**分析对象特征**
- 后端：`https://www.guang233.com/`
- 核心同步接口：`POST /api/client/report`（`user_id + platform + environment` 上报）
- 请求安全：`EncryptedPayload(v,kid,iv,payload,tag)` 加密 + `X-Signature` 签名，均由 Android NativeCrypto 完成
- native 库 `libnuke_native.so` 按需从后端下载

**目录内容**（实际位置：`APP/Nuke/Nuke_1.0.0/`）

| 路径 | 说明 |
|---|---|
| `Nuke_1.0.0_release.apk` | 原始 APK |
| `Nuke_1.0.0_release-decompiled/` | JADX 反编译源码与资源 |
| `Nuke_1.0.0_release-jadx-showbad/` | show-bad-code 模式反编译（更完整还原大方法） |
| `libnuke_native.so` | 运行时从后端下载的 native 库 |
| `libnuke_native_*.txt` | native 库锚点与过滤字符串 |
| `database_indicator_search.txt` | 数据库关键词搜索记录 |
| `Nuke_APK_reverse_report.md` | 逆向分析报告 |
| `README_nuke_bulk_register.md` | 批量注册/同步脚本的接口协议说明 |

### Nuke v1.0.2

新增 `APP/Nuke/Nuke_1.0.2/`，包含 APK、Apktool/JADX 反编译结果、native release 解包与协议分析产物。

**版本与 native 信息**
- versionCode：`234`
- native generation：`2026071502`
- APK 内置 `libnuke_bridge.so` 与 `bootstrap.nkr`
- `bootstrap.nkr` 解包后包含 `release.nkm` 和 `libnuke_engine_2026071502_da53b572650c.so`

**目录内容**（实际位置：`APP/Nuke/Nuke_1.0.2/`）

| 路径 | 说明 |
|---|---|
| `Nuke_1.0.2.apk` | 原始 APK |
| `Nuke_1.0.2-extracted/` | APK 原始 ZIP 解包结果 |
| `Nuke_1.0.2-apktool/` | Apktool 输出（Smali、资源与打包元数据） |
| `Nuke_1.0.2-jadx/` | JADX 反编译源码与资源 |
| `Nuke_1.0.2-bootstrap/` | 从 `bootstrap.nkr` 解出的 release 元数据与 ARM64 engine |
| `native_analysis/` | bridge、engine、DEX 及 AArch64 交叉引用分析产物 |
| `nuke_probe/` / `nuke_unidbg/` | Rust signer 探针与 Unidbg 模拟实验工程 |
| `WeKit-reference/` | Nuke 1.0.2 协议、Rust/Python 参考与逆向报告；部分内容来自 [Ujhhgtg](https://github.com/Ujhhgtg) |
| `MODULE_FOLDERS.md` / `AI_HANDOFF.md` | 目录说明与分析交接文档 |

---

## QStory

针对 **QStory** 系列 QQ 工具 APK（版本 2.6.2 / 2.6.3 / 2.6.3-1 / 2.6.4）的多轮逆向分析。

**分析结论（重要）**

分析报告揭示该 APK **存在高危破坏性逻辑**：

- 账号身份 `identity` 由服务端下发（服务端 `https://qstory.suzhelan.top`），非本地固定枚举；
- 当 `identity < 0` 时，会触发**删除好友、退群、删除本地目录、结束 QQ 任务**等毁号/破坏行为；
- 多处功能按 `identity` 值进行权限判断，黑名单命中也会触发危险操作；
- 样本中发现硬编码账号信息。

各版本目录（`APP/QStory/` 下的 `2.6.2/`、`2.6.3/`、`2.6.3-1/`、`2.6.4/`）均包含：

| 路径 | 说明 |
|---|---|
| `QStory_x.x.x-release.apk` | 原始 APK |
| `analysis_apktool/` / `analysis_jadx/` | apktool 与 JADX 反编译产物 |
| `deobfuscated_qstory/` | 反混淆后的源码 |
| `*危险代码与硬编码账号分析报告.md` | 恶意行为分析 |
| `*接口清单与区别说明.md` | 接口梳理与版本差异 |
| `*深度补充分析.md` / `*完整解密深度分析报告.md` | 进一步还原分析 |

---

## WAuxiliary

针对微信辅助 Xposed 模块 **WAuxiliary**（包名 `me.hd.wauxv`）的反混淆源码工程。`APP/WAuxiliary/` 中相关内容来自 [Ujhhgtg](https://github.com/Ujhhgtg)，包含版本：

- `WAuxiliary1.2.6.r1238.198c77c/`
- `WAuxiliary1.2.7.r1418.e65079c/`

**目录内容**（实际位置：`APP/WAuxiliary/`，含 `WAuxiliary1.2.6.r1238.198c77c/` 与 `WAuxiliary1.2.7.r1418.e65079c/` 两个版本）

| 路径 | 说明 |
|---|---|
| `sources/` | 反混淆后的 Java 源码 |
| `resources/` | 解包后的 Android 资源、清单与资产 |
| `wauxv_deobf.iml` | Android Studio 工程文件 |
| `WAuxiliary*.文件夹分析.md` | 逐目录/文件的分析文档 |

**分析发现**

- 清单声明联网权限并允许明文流量；
- 内置 GitHub 最新版本检查：`api.github.com/repos/HdShare/WAuxiliary_Public/releases/latest`；
- 插件资源站：`hdshare.github.io/WAuxiliary_Plugin/`；
- 集成友盟统计（`umeng.com` 等）。

---

## dyyds

针对 **Dyyds** 应用（包名 `com.ss.android.ugc.aweme.yyds`，versionCode 127 / versionName 260629161700，抖音体系应用）的反编译分析。

**目录内容**（实际位置：`APP/dyyds/0629161700/`）

| 路径 | 说明 |
|---|---|
| `0629161700-release.apk` | 原始 APK |
| `0629161700-release-decompiled/` | JADX 反编译源码与资源 |
| `0629161700_文件夹分析.md` | 逐目录/文件的分析文档 |
| `DecodeM515.java` / `.class` | 针对关键类的解密/还原脚本 |
| `f773_strings.json` | 提取的字符串数据 |

**分析结论**

- 未发现硬编码的主机/URL 或自建监听端口；
- 资源中存在 WebDAV 配置界面标识，说明应用可由用户配置远程服务地址。

---

## geek

针对微信模块 **gk.apk**（包名 `com.ljx.wechatmod`）的 **StringFog 字符串解密** 专项分析，分本地版与联网版两个子目录。

### geek本地版（`APP/geek/geek本地版/`）

| 路径 | 说明 |
|---|---|
| `gk本地版.apk` | 原始 APK |
| `gk_apktool/` | 原始 apktool 输出（smali + 资源） |
| `gk_jadx/` | 原始 JADX 输出（未解密） |
| `gk_jadx_decrypted(_clean)/` | 第一/二轮字符串解密产物 |
| `gk_jadx_simple(_decrypted_clean)/` | simple 模式反编译及解密结果（推荐阅读） |
| `gk_jadx_fallback(_decrypted_clean)/` | fallback 模式反编译及解密结果 |
| `gk_complete_source/` | 汇总后的最终交付源码包 |
| `decrypt_stringfog.py` / `decrypt_stringfog_extended.py` | StringFog 静态解密脚本 |
| `DECRYPTION_FOLDER_STATUS.md` | 解密状态与查看顺序说明 |

### geek联网版（`APP/geek/geek联网版/`）

| 路径 | 说明 |
|---|---|
| `geek联网版.apk` | 原始 APK |
| `geek-wechat1.2.75_flow_sign_apktool/` | apktool 反编译产物 |
| `geek-wechat1.2.75_flow_sign_jadx/` | JADX 反编译产物 |
| `geek-wechat1.2.75_flow_sign_jadx_decrypted/` | 解密后源码 |
| `decrypt_stringfog.py` | StringFog 解密脚本 |
| `geek联网版_文件夹分析.md` | 分析文档 |

---

## 微X

微信 Xposed 模块源码工程 **WeChatXRemap**，是一个完整的 Android Gradle 项目。`APP/微X/` 中相关内容来自 [Ujhhgtg](https://github.com/Ujhhgtg)。

**目录内容**（实际位置：`APP/微X/`）

| 路径 | 说明 |
|---|---|
| `settings.gradle.kts` | Gradle 工程配置（依赖 Xposed API、JitPack、Google/Maven 仓库） |
| `gradlew` / `gradlew.bat` / `gradle/` | Gradle Wrapper |
| `app/build.gradle.kts` | app 模块构建配置 |
| `app/src/main/java/` | 模块源码（含混淆后以 Unicode 变体符号命名的包） |
| `微X_文件夹分析.md` | 逐目录/文件的分析文档 |

---

## 月虹一键隐藏

针对 Magisk/KernelSU/APatch 模块 **月虹一键隐藏 v5.4.4**（id `YH_YC`，作者：酷安@月虹yh）的逆向分析。

**目录内容**（实际位置：`module/月虹一键隐藏/月虹一键隐藏v5.4.4/`）

| 路径 | 说明 |
|---|---|
| `月虹一键隐藏v5.4.4/` | 模块原始文件：`module.prop`、`customize.sh`、`service.sh`、`main` 可执行文件、`webroot/` |
| `月虹一键隐藏v5.4.4-analysis/` | 分析产物：ELF 分析、字符串提取、IOC 候选、下载 URL、Ghirda 脚本、内嵌 payload 还原 |
| `月虹一键隐藏v5.4.4-exact-package/` | 精确打包结果 |
| `月虹一键隐藏v5.4.4-source/` | 还原出的源码 |

---

## 短信

> ⚠️ 内容为对某短信轰炸（短信骚扰）程序 `短信轰炸26.07.03`（内部称「短信测压」）的逆向分析产物。

针对该程序的**多层混淆 Python 载荷还原**与**接口提取**分析。

**目录内容**（实际位置：`shell/短信/短信轰炸26.07.03/`）

| 路径 | 说明 |
|---|---|
| `partial_decrypted/` | 多层混淆还原中间产物：`layer1~6` 的 pyc / marshal / dis 反汇编、`layer6_pycdc.py`（pycdc 还原）、`layer4_exec_payload.py`（捕获到的真实执行载荷）、`api_inventory.csv/json`（接口清单）等 |
| `fully_decrypted/` | 最终还原结果：`api_inventory_full.csv/json`（完整接口清单）、`runtime_request_trace_decrypted.json` 及解码摘要、`短信测压_解密源码_静态还原.py` / `短信测压_请求逻辑还原.py`（还原出的源码）、`decrypt_runtime_trace.py`（运行时调用还原脚本）、`run_*.bat` 运行入口 |
| `urls/` | 提取出的相关 URL 列表 |

**分析结论**

- 该程序为多层混淆的 Python 载荷，混淆层数达 5~6 层（pyc → marshal → 执行载荷），已逐层还原；
- 运行时会向大量第三方站点的短信验证码接口发送请求（接口清单见 `api_inventory_full.csv`）；
- `runtime_request_trace_*.json/csv` 记录了实际运行时产生的请求轨迹（含目标 URL、请求参数、请求头）。

---

## DY Helper

针对抖音辅助 Xposed/Hook 模块 **DY Helper v1.4.15**（包名 `com.example.dyhelper`，目标宿主 `com.ss.android.ugc.aweme`）的解包与云端分析。

**分析对象特征**
- 功能：底栏、评论、收藏、面板、下载等 Hook，运行时用 DexKit 定位抖音类；
- 保护：native 库 `libdy_protect.so` / `libblacklist_verify.so`，Beta 功能开关、黑名单校验与会话刷新。

**目录内容**（实际位置：`APP/DY Helper/DY Helper_1.4.15/`）

| 路径 | 说明 |
|---|---|
| `DY Helper_1.4.15.apk` | 原始 APK |
| `DY Helper_1.4.15-decompiled/` | JADX 反编译源码与资源 |
| `DY Helper_1.4.15-apktool-full/` | apktool 全量解包（Smali + 资源） |
| `DY Helper_1.4.15-restored-sources/` | 可读源码副本 |
| `DY Helper_1.4.15-urls.tsv` | 提取的 URL 清单 |
| `DY Helper_1.4.15-解密说明.md` | 解包与云端分析说明 |
| `DY Helper_1.4.15-云端捐赠信息调用逻辑.md` | 云端捐赠/Beta 名单调用逻辑分析 |
| `DY Helper_1.4.15-破解云端.md` | 云端授权机制信任模型与攻击面分析 |
| `DY Helper_1.4.15-云端查询工具使用说明.md` + `query_beta_users.py` | Beta 名单查询工具（作者 GitHub 云端 `beta_users.json`，约 628 用户） |
| `beta_users_cache.json` | 云端 Beta 名单缓存 |

**分析结论**
- 黑名单与更新服务托管于 GitHub Raw（`yyhh73144-max/dyhelperUser` 的 `blacklist_users.json` / `update.json`），Java 与 native 两套黑名单交叉校验；
- 大量业务接口为抖音/头条体系（`aweme.snssdk.com`、`vassets-backend.douyin.com`、`stark-gate.zijieapi.com` 等），对应农场、宠物、社交宠物与任务功能，参数与签名来自被 Hook 的抖音客户端；
- Beta 申请载荷与会话由 native 层生成（AES/CBC/PKCS5Padding、URL-safe Base64），并有运行环境完整性检查 `nativeIsRuntimeTrusted()`；
- 授权体系为「服务端名单 + native 校验」模型：名单托管于 GitHub Raw，`libdy_protect.so` 负责验签/过期检查/名单匹配，通过后下发 `opaque_ticket` 本地缓存。

---

## Elaris

针对 QQ Xposed/LibXposed 模块 **Elaris v2.6.7**（包名 `com.mr.elaris`，目标宿主 `com.tencent.mobileqq`）的反编译分析。

**目录内容**（实际位置：`APP/Elaris/Elaris_2.6.7/`）

| 路径 | 说明 |
|---|---|
| `Elaris_2.6.7.apk` | 原始 APK |
| `Elaris_2.6.7-decompiled/` | JADX 反编译源码与资源 |
| `Elaris_2.6.7-apktool-full/` | apktool 全量解包（Smali + 资源） |
| `restored-sources/` | 明文源码副本 |
| `Elaris_2.6.7-解密说明.md` | 解密与功能说明 |

**分析结论**
- 云表情上传/列表/举报、语音合成（`api-v2.yuafeng.cn/API/kktts.php`）、音频转 Silk（`oiapi.net/API/Mp32Silk`）等功能；
- 云服务托管于腾讯云 SCF（`1327845120-*.ap-guangzhou.tencentscf.com`），上传带 `X-Elaris-Upload-Key` / `X-Elaris-Upload-Sha256` 请求头；
- 未发现传统加解密器；唯一密码学原语是上传文件的 SHA-256 摘要，R8 混淆符号不可误判为加密密钥。

---

## InkHide

针对微信 Xposed 模块 **InkHide v3.0.2d**（包名 `com.lu.wxmask`，目标宿主 `com.tencent.mm`）的反编译分析。

**目录内容**（实际位置：`APP/InkHide/InkHide_3.0.2d/`）

| 路径 | 说明 |
|---|---|
| `InkHide_3.0.2d.apk` | 原始 APK |
| `InkHide_3.0.2d-decompiled/` | JADX 反编译源码与资源 |
| `InkHide_3.0.2d-apktool/` | apktool 解包产物 |
| `InkHide_3.0.2d-apktool-full/` | apktool 全量解包 |
| `restored-sources/` | 明文源码副本 |
| `InkHide_3.0.2d-解密说明.md` | 解密与文件说明 |

**分析结论**
- 远程配置/更新源为 `github.com/Mingyueyixi/MaskWechat`（GitHub Raw + jsDelivr 双源），更新页经 GitHub Release API 拉取；
- 深链接入口 `maskwechat://com.lu.wxmask/...`；配置项含 `readTraceServerUrl` 默认地址 `https://read.spint.kdns.fr`；
- 未发现固定 REST 业务接口；网络行为以配置/更新下载和更新页 GitHub Release 请求为主。

---

## XHS

针对小红书 Xposed 模块 **XHS_260731175346**（目标宿主 `com.xingin.xhs`）的静态恢复分析。

**目录内容**（实际位置：`APP/XHS/XHS_260731175346/`）

| 路径 | 说明 |
|---|---|
| `XHS_260731175346.apk` | 原始 APK |
| `XHS_260731175346-decompiled/` | JADX 反编译源码与资源 |
| `XHS_260731175346-apktool-full/` | apktool 全量解包 |
| `XHS_260731175346-restored-sources/` | 可读源码副本（字符串池已回填） |
| `XHS_260731175346-report.md` | 静态恢复报告 |
| `XHS_260731175346-解密说明.md` / `-云端与长连接分析.md` | 解密与云端分析 |
| `XHS_260731175346-urls.tsv` / `-unresolved-m1313.tsv` | URL 与未解析调用清单 |
| `restore-xhs.ps1` | 恢复脚本 |
| `XHS_260731175346-云端信息调用逻辑.md` | 小红书云端信息调用逻辑分析 |
| `XHS_260731175346-破解云端.md` | 云端限制（撤回/媒体保护）绕过机制分析 |
| `XHS_260731175346-云端查询工具使用说明.md` + `query_xhs_user.py` | 小红书用户云端公开数据查询工具（网页版 `__INITIAL_STATE__`） |

**分析结论**
- 字符串池解码器为 `xhss.AbstractC0775.m1313(long)`（底层 `AbstractC0561.m1006`），恢复副本已回填 1444 处可静态解析调用并移除解码器实现；
- 确认加密原语：PBKDF2WithHmacSHA256、GZIP、AES/CBC/PKCS5Padding；密文还与派生密钥 XOR、字节反转并输出无填充 Base64；
- 云端绕过机制：不信任小红书云端、无自建服务器，而是在长连接进程 Hook `getServerRevokeMsg` 实现防撤回，并篡改 `note.mediaSaveConfig` 解锁保存/去水印，核心逻辑在 `libnative.so`。

---

## 挖红薯呀

针对小红书 Xposed/LibXposed 模块 **挖红薯呀 3.0.1**（包名 `top.anjao2024.xp1whs`，目标宿主 `com.xingin.xhs`）的静态解密分析。

**目录内容**（实际位置：`APP/挖红薯呀/挖红薯呀3.0_3.0.1/`）

| 路径 | 说明 |
|---|---|
| `挖红薯呀3.0_3.0.1.apk` | 原始 APK |
| `挖红薯呀3.0_3.0.1-decompiled/` | JADX 反编译源码与资源 |
| `挖红薯呀3.0_3.0.1-apktool-full/` | apktool 全量解包 |
| `restored-sources/` / `decrypted-sources/` | 明文源码副本（动态字符串已回填） |
| `挖红薯呀3.0_3.0.1-解密说明.md` | 静态解密说明 |
| `云端接口调用逻辑.md` | 云端接口调用逻辑分析 |
| `破解云端-授权验证分析.md` | 激活码授权验证协议（`verify.php`）与 HMAC 签名还原 |
| `云端数据获取工具使用说明.md` + `get_user_cloud_data.py` | 云端授权数据查询工具（复现客户端验签请求） |

**分析结论**
- 动态字符串为四字节循环 XOR（KEY = `[75, 120, 112, 49]`），已还原 254 处；
- 云端鉴权集中在 `anjao2024.top`：`auth_public/verify.php`、`auth/verify.php`（密钥验证）与 `auth_notice/version_check.php`（版本检查），请求/响应均带 HMAC-SHA256 签名，响应签名校验失败返回 `sign_verify_failed`；
- 内置两套固定签名密钥（`WHS-X-` / `WHS-Y-` 前缀）与本地许可证缓存（`xp1_license` SharedPreferences）；
- 授权是否有效由服务器 `code==200` 判定；HMAC 密钥为对称且硬编码于 APK（`n90.java`），签名算法可完整还原，工具脚本可离线构造请求签名并二次验签响应。

---

## Ｋｅｖｉｎ

针对多平台 Xposed 模块 **Ｋｅｖｉｎ_072101**（包名 `kevin.fun`，目标宿主抖音/小红书/快手/TikTok/PixelLab）的静态恢复分析。

**目录内容**（实际位置：`APP/Ｋｅｖｉｎ/Ｋｅｖｉｎ_072101/`）

| 路径 | 说明 |
|---|---|
| `Ｋｅｖｉｎ_072101.apk` | 原始 APK |
| `Ｋｅｖｉｎ_072101-decompiled/` | JADX 反编译源码与资源 |
| `Ｋｅｖｉｎ_072101-apktool-full/` | apktool 全量解包 |
| `Ｋｅｖｉｎ_072101-restored-sources/` | 可读源码副本 |
| `Ｋｅｖｉｎ_072101-urls.tsv` | URL 清单 |
| `Ｋｅｖｉｎ_072101-解密说明.md` / `-云端与加密分析.md` | 解密与云端分析 |
| `kevin-decode-report.tsv` | 解码报告 |
| `Ｋｅｖｉｎ_072101-云端用户信息调用逻辑.md` | 云端用户信息调用逻辑分析 |
| `Ｋｅｖｉｎ_072101-破解云端.md` | 云端验证机制（Cloudflare Workers 激活 + VIP 白名单）解构 |
| `kevin_cloud_query.py` + `kevin_cloud_query_使用说明.md` | VIP 白名单查询工具（`vip_list.json`） |

**分析结论**
- 模块按目标宿主分发 Hook：`DYHook`（抖音）、`XhsHook`（小红书）、`KSHook`（快手）、`PPHook`（PixelLab），并含 TikTok 作用域；
- 内置下载管理器（`DownloadManager`）与 WebDAV 备份/恢复（`WebDAVConfig` / `WebDAVDialog`）功能；
- 源码混淆为控制流平坦化 + 短数组 XOR 字符串池，`hook/audio/C1117.java` 为短数组 XOR 恢复函数；
- 云端验证：激活验证走 Cloudflare Workers（`tg-verify-api.kevin0529422.workers.dev/activate`），VIP 白名单为自建域名静态 `vip_list.json`，激活有效性由服务端判定，客户端仅缓存展示层状态。

---

## Hchat

针对微信增强 Xposed/LSPosed 模块 **Hchat**（包名 `h.Hchat`，`alt-entry` 分支 release，目标宿主 `com.tencent.mm`）的完整静态恢复分析。

**分析对象特征**
- 模块描述：`微信功能增强模块`；Xposed 入口 `h.Hchat.ModuleEntry`
- 大型微信自动化/增强模块：内置 BeanShell 脚本插件系统、微信数据库/联系人/群聊/朋友圈/消息 API、AI 自动回复（智聊 OpenAI 兼容 + 小智 WebSocket/TTS）、QQ 音乐点歌、Silk/AAC 音频转换、插件市场、崩溃收集与微信保活服务
- 字符串与配置全部明文，无字符串/配置解密层；唯一加解密为脚本插件「编译快照」缓存的 AES 加密（`ScriptPluginRuntime.snapshotKeyBytes`）
- Native 库：`libdexkit.so`（运行时定位）、`libhchat_crash.so`（崩溃捕获）、`libsilk_codec.so`（Silk 编解码）

**目录内容**（实际位置：`APP/Hchat/Hchat-26-8-01/`）

| 路径 | 说明 |
|---|---|
| `Hchat-alt-entry-release-signed.apk` | 原始 APK |
| `Hchat-alt-entry-release-signed-restored-sources/` | 主交付目录，6,467 个可读 Java + 资源 |
| `Hchat-alt-entry-release-signed-jadx/` / `-fallback/` / `-apktool/` | JADX 原始输出 / 指令级 fallback / apktool Smali |
| `hchat_cloud_plugin.py` | 云端插件市场查询/下载工具 |
| `cloud_plugin_demo/` | 实测下载的云端插件示例 |
| `hchat_urls.txt` | URL 清单 |
| `Hchat-alt-entry-release-signed-解密说明.md` | 完整静态恢复说明 |

---

## OKK

针对微信 Xposed/LSPosed 模块 **OKK**（包名 `com.abc.module`，应用名 `OKK`，模块描述 `OKK Fuck WeChat`，目标宿主 `com.tencent.mm`）的反混淆与语义化源码恢复。

**分析对象特征**
- 版本：`1.2.1`（versionCode 13）；Xposed 元数据保留旧工程名 `AChat 1.1.7`
- 功能：消息防撤回、撤回提示/媒体保护、消息编辑、滑动引用/复读、复制/转发/重发/删除/保存、时间显示、朋友圈防删除/防评论、移除朋友圈广告等
- 保护：Kotlin + R8/ProGuard 名称压缩，无加固壳；核心包 `b0~f0` 已恢复为 `com.abc.*` 语义化命名
- Native：`libdexkit.so`（DexKit 运行时定位微信类）
- 配置与日志默认目录：`/storage/emulated/0/Android/media/com.tencent.mm/OKK/`

**目录内容**（实际位置：`APP/OKK/OKK_1.2.1_fix4/`）

| 路径 | 说明 |
|---|---|
| `OKK_1.2.1_fix4.apk` | 原始 APK |
| `OKK_1.2.1_fix4_readable/` | 主交付目录，语义化可读 Java（1,411 个） |
| `OKK_1.2.1_fix4_readable_simple/` | 指令顺序 Java 对照 |
| `OKK_1.2.1_fix4_decompiled/` / `-apktool/` / `-analysis/` | 原始反混淆结果 / Smali / 扫描映射 |
| `OKK_1.2.1_fix4_semantic.jobf` / `-jobf` | JADX 语义映射与原始映射 |
| `analyze_okk.py` / `build_semantic_mapping.py` / `generate_okk_report.py` / `scan_binary_strings.py` / `validate_okk_output.py` | 分析与校验脚本 |
| `OKK_1.2.1_fix4_api_scan.txt` | API 扫描结果 |
| `OKK_1.2.1_fix4_完整解密说明.md` | 完整解密与源码说明 |

---

## YuePanel

针对多平台 Xposed/LSPosed 模块 **YuePanel 1.5.2**（包名 `com.yuexin.panel`，作者 YueXin/月信，作用域抖音/QQ/TIM/微信）的静态恢复与 NMM 原生保护分析。

**分析对象特征**
- 模块描述：`给抖音/QQ/Tim/微信添加更多功能`
- 使用 **NMM 原生保护框架**：2,415 处原生字符串加密桩调用（`yue_xin_awa(int)`）、大量原生方法体、1,123 处类初始化挂钩、签名校验（`SignatureGuard`/`libmiao.so`）、文件加解密（`YPNK2:`/`YPNV2:` 前缀）、DES/Base64 工具（`liburl_encode.so`）
- 命名混淆使用不可打印字符（`ۥ۟۟...`），JADX 已重命名为 `Cxxxx`/`fxxxx`
- Native：`libyuexin.so` / `libyuexinya.so` / `libmiao.so` / `liburl_encode.so` / `libdexkit.so`
- 结论：Java 层完整还原；native 字符串/方法体/签名/文件加解密实现需 ELF 逆向（JEB/Ghidra + 提取密钥）

**目录内容**（实际位置：`APP/YuePanel/YuePanel-1.5.2-release-build2/`）

| 路径 | 说明 |
|---|---|
| `YuePanel-1.5.2-release-build2.apk` | 原始 APK |
| `YuePanel-1.5.2-release-build2-restored-sources/` | 主交付目录，6,340 个可读 Java + 资源 |
| `YuePanel-1.5.2-release-build2-jadx/` / `-fallback/` / `-apktool/` | JADX 输出 / 指令级 fallback / apktool Smali |
| `yue_libs/` | 提取的 arm64 native 库（`libyuexin` 等） |
| `yue_urls.txt` | URL 清单 |
| `YuePanel-1.5.2-release-build2-解密说明.md` | 完整静态恢复说明 |

---

## FloatingClouds

针对微信 Xposed/LSPosed 模块 **FloatingClouds 3.1.5**（包名 `top.mmjz.floatingclouds`，目标宿主 `com.tencent.mm`）的完整静态恢复分析。

**分析对象特征**
- 功能：密友伪装（`MaskItemBean`）、隐藏密友消息通知、聊天记录存储隐藏、朋友圈隐藏、远程 kill switch（`kill_switch.json` 轮询）、热更新阻断等
- 无任何字符串/配置加密层，无 `javax.crypto`/AES/DES/RSA/MessageDigest 调用，无控制流平坦化
- Native：`libdexkit.so`（LuckyPray DexKit 运行时，用于定位微信混淆类）

**目录内容**（实际位置：`APP/FloatingClouds/FloatingClouds-3.1.5-release/`）

| 路径 | 说明 |
|---|---|
| `FloatingClouds-3.1.5-release.apk` | 原始 APK |
| `FloatingClouds-3.1.5-restored-sources/` | 主交付目录，1,215 个可读 Java + 资源 |
| `FloatingClouds-3.1.5-jadx/` / `-fallback/` / `-apktool/` | JADX 输出 / 指令级 fallback / apktool Smali |
| `url_hits.txt` | URL 命中清单 |
| `FloatingClouds-3.1.5-解密说明.md` | 完整静态恢复说明 |

---

## 红薯猪手

针对小红书 Xposed/LSPosed 模块 **红薯猪手 1.2.7**（包名 `com.skyhand.redbookhelper`，目标宿主 `com.xingin.xhs`）的静态恢复与配置解密分析。

**分析对象特征**
- 无 `.so`，单 `classes.dex`；模块字符串解码器与远程配置 AES/字符位移解码器已定位
- 交付纯明文源码：移除解码器，配置直接读取明文快照（8 份 JSON）
- `decrypted-config/` 含当前远程配置明文：全局配置、适配索引、屏蔽列表与 5 个小红书版本适配表
- 内置 TalkingData SDK（`com.tendcloud.tenddata`）

**目录内容**（实际位置：`APP/红薯猪手/红薯猪手_1.2.7/`）

| 路径 | 说明 |
|---|---|
| `红薯猪手_1.2.7.apk` | 原始 APK |
| `红薯猪手_1.2.7-纯明文源码/` | 主交付目录，纯明文 Java + 8 份配置 JSON |
| `红薯猪手_1.2.7-restored-sources/` | 行为参考 Java（保留动态远程配置协议） |
| `红薯猪手_1.2.7-decrypted-config/` | 当前远程配置明文 JSON |
| `红薯猪手_1.2.7-jadx/` / `-fallback/` / `-apktool/` | JADX 输出 / 指令级 fallback / apktool Smali |
| `红薯猪手_1.2.7-解密说明.md` | 完整静态恢复说明 |

---

## FunBox

针对 Xposed/LSPosed/LSPatch + Zygisk 模块 **FunBox v2162**（包名 `have.fun`，作者 Hicore）的反编译与 native ELF 分析。

**分析对象特征**
- 版本：`v2162`（versionCode 2162）；仅 `arm64-v8a`
- 支持 Xposed/LSPosed/LSPatch 与 Zygisk（`unknown/module.prop` 模块 ID `funbox`，KernelSU/Magisk 风格 WebUI）
- 动态 Dex 生成：DexMaker（`internal/dexmaker/`）、运行时 Dex 处理（`internal/dexbridge/`）、Dex 格式组件
- Native：5 个 arm64 ELF，含 `libloader.so`（`FunLoader.load()` JNI，实现 Xposed Hook 后端）

**目录内容**（实际位置：`APP/FunBox/FunBox_v2162/`）

| 路径 | 说明 |
|---|---|
| `FunBox_v2162.Apk` | 原始 APK |
| `FunBox_v2162_readable/` | 主阅读目录，可读重建 Java（203 个） |
| `FunBox_v2162_readable_simple/` | 指令优先 Java 对照 |
| `FunBox_v2162_decompiled/` / `-apktool/` / `-analysis/` | 初始反混淆 / 全量解包 / native 与 URL 分析 |
| `FunBox_v2162_semantic.jobf` / `-jobf` | JADX 语义映射与原始映射 |
| `analyze_funbox_native.py` / `build_funbox_semantic_mapping.py` / `cloud_data_exporter` 等 | 分析与导出脚本 |
| `FunBox_v2162_api_scan.txt` | API 扫描结果 |
| `FunBox_v2162_完整解密说明.md` | 完整解包与可读代码说明 |

---

## CherryWeChat

针对微信 Xposed 模块 **CherryWeChat**（包名 `io.github.cherrywechat`，版本 `v1.0.1-47-g56d8c93`，versionCode 10724）的反编译与 Lua 脚本系统分析。

**分析对象特征**
- Xposed 入口 `io.github.cherrywechat.HookEntry`；内置 **Lua 运行时**（`lua/`）与脚本装载/Java 桥接/调度，暴露配置、文件、网络、消息、微信与 Xposed API（`assets/lua/` 含示例脚本）
- 网络层 `NetworkNativeBridge` 提供 `decryptData` / `getHeaders` JNI 接口，解密与请求头生成交由 native 层
- 字符串池恢复：`p000/AbstractC0295Gu.m625r(long)` 用内置 `f996a` 字符池 + 位运算恢复运行时字符串
- Native（arm64-v8a）：Cherry、DexKit、LuaJIT、OpenSSL、Sentry 等

**目录内容**（实际位置：`APP/CherryWeChat/CherryWeChat_v1.0.1-47-g56d8c93/`）

| 路径 | 说明 |
|---|---|
| `CherryWeChat_v1.0.1-47-g56d8c93.apk` | 原始 APK |
| `CherryWeChat_v1.0.1-47-g56d8c93_decompiled/` | 主阅读目录，JADX 反编译 Java（3,077 个） |
| `CherryWeChat_v1.0.1-47-g56d8c93_simple/` | JADX 简化反编译 Java 对照 |
| `CherryWeChat_v1.0.1-47-g56d8c93_apktool/` | Apktool 完整解包 |
| `CherryWeChat_v1.0.1-47-g56d8c93_analysis/` | URL 清单、native 库清单与关键配置导出 |
| `build_cherry_report.py` / `decode_cherry_strings.py` 等 | 分析与字符串解码脚本 |
| `CherryWeChat_v1.0.1-47-g56d8c93_完整解密说明.md` | 完整解包与可读代码说明 |

---

## 微信 8.0.75 官替多功能

针对微信 iOS 版 **8.0.75 官替多功能 IPA** 的功能提取与 dylib 解密项目。

**分析对象特征**
- 原始安装包：`微信_8.0.75官替多功能.ipa`，SHA-256：`84c0fe52f54af29b869fd2efc3741ca9dfc609b727d5a107993a3466b7d852e4`
- 截图功能：13 组；dylib：18 个；ARM64 指令：49,619,827 条
- 13 组功能：Mikoto 体验版、PKC、WCRefine、微信助手（MiYou）、XOS、黄白助手、Lab（ThemeLab）、主题盒子（ThemeBox）、ThemePro 主题、HBB 无后台推送、AFN、微信净化（WCPureExtension）、WCGlass 液态玻璃

**目录内容**（实际位置：`iPhone/微信_8.0.75官替多功能/`）

| 路径 | 说明 |
|---|---|
| `微信_8.0.75官替多功能.ipa` | 原始 IPA |
| `idlefish-msg-*.jpg` | 功能截图 |
| `rebuild_wechat_8075.py` | 重建/提取脚本 |
| `微信_8.0.75功能提取/` | 主提取目录：`00_应用元信息`、`01_Mikoto体验版 ~ 13_WCGlass液态玻璃`、`99_公共运行依赖` |
| `微信_8.0.75功能提取/功能映射与文件说明.md` | 功能与文件映射说明 |
| `微信_8.0.75功能提取/完整提取清单.7z` / `校验报告.txt` | 提取清单与校验 |
| `微信_8.0.75功能提取/全部Dylib解密/` | 全部 18 个 dylib 的解密报告、清单、校验报告、原始已解密与可读源码 |

**分析结论**
- 各 dylib 已从加密状态解密，arm64 明文切片完整提取，Objective-C 接口与全部 ARM64 反汇编可用；
- 各功能组件经 `libsubstrate`/`libellekit` 等公共运行依赖注入微信进程，实现撤回、群聊、步数、标签、主题、推送、净化等增强。

---

## WCGlass

针对微信液态玻璃与主题增强组件 **WCGlass.dylib** 的独立深度逆向与源码恢复项目（来源于「微信 8.0.75 官替多功能」项目）。

**分析对象特征**
- 文件格式：Mach-O Universal/FAT 动态库，架构 arm64 / arm64e，两个切片均为 `cryptid=0` 明文
- 原始大小 11,848,688 字节，SHA-256：`76ba59a63ba3606753cddd7c63c557d9a3765baecb85fe3d1f39384e62227320`
- Objective-C 实现类 78 个、方法 1,923 个；ARM64 函数 5,749 个；保留符号 454 个
- 主题包导入解密、主题商店通信、玻璃背景、首页分组、聊天页胶囊、搜索覆盖层、功能卡片、颜色编辑、主题管理等功能
- 已确认密码参数：AES-256-CBC + PKCS#7、HMAC-SHA256、SHA-256、RSA-OAEP-SHA256、RSA-PSS-SHA256

**目录内容**（实际位置：`iPhone/WCGlass/`）

| 路径 | 说明 |
|---|---|
| `WCGlass.dylib` | 原始 Universal/FAT 动态库 |
| `WCGlass_output/` | 第一阶段 Mach-O 解包、切片、接口、符号、字符串及密码流程分析结果 |
| `WCGlass_restored/` | 主阅读目录：`01_jeb_decompiled_c`（全函数索引）、`02_key_modules_jeb`（关键函数 JEB 伪代码）、`03_objc_source_all`（78 个 ObjC 类源码骨架）、`04_exact_arm64_assembly`（5,749 个函数精确汇编）、`05_clean_reconstruction`（清理后核心代码）、`06_metadata`、`07_tools` |
| `wcglass_unpack.py` / `restore_wcglass_source.py` | 解析与源码恢复脚本 |
| `JebDecompileTargets.py` / `JebExportWCGlass.py` / `JebProbe.py` / `JebScriptRunner.java/.class` | JEB 批量反编译与导出脚本 |

**分析结论**
- 主题容器由 `WCLGGlassPackage` 处理：RSA-PSS 验签 → 密钥派生 → AES-256-CBC 解密；
- 主题商店由 `WCLGGlassStore` 处理：请求加密（Nonce + RSA 包装）、响应验签与解密；
- 全部密码流程已在 `05_clean_reconstruction/` 按真实调用参数恢复为可读 Objective-C。

---

## 免责声明

- 本仓库所有内容均为个人逆向工程学习记录，不提供任何形式的担保。
- 部分分析对象为恶意样本，分析过程仅用于学术与安全研究，**请勿二次传播、复用或用于非法目的**。
- **`短信` 目录为骚扰类工具（短信轰炸）的分析产物，使用后果自负**。
- 涉及的具体平台（微信、QQ、抖音等）均与本人无关；使用本仓库内容造成的一切后果由使用者自行承担。

---

*仓库内容自动整理，仅供学习交流。*
