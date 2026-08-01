# 解密工作存档（APK 逆向分析）

本仓库是移动端 Android 应用逆向工程与分析工作的存档，内容以**解密、反编译、还原、行为分析**为主。每个目录对应一个独立分析任务，包含原始 APK、反编译/反混淆源码、解密脚本、native 库分析以及分析报告。

> ⚠️ **声明**
> 本仓库内容仅用于**安全研究与逆向工程学习**目的。仓库中的部分样本（如 QStory、月虹一键隐藏 等）经分析被发现包含恶意或破坏性逻辑，相关分析报告仅用于安全研究参考。
> 请勿将本仓库任何内容用于非法用途、骚扰他人或攻击他人系统。使用者因使用本仓库内容产生的一切法律后果自行承担。

## 目录总览

| 目录 | 位置 | 分析对象 | 内容类型 |
|---|---|---|---|
| [FkWeChat](#fkwechat) | `APP/FkWeChat` | 微信 Xposed 模块 `me.yun.fkwechat` | 解包 + JADX 反编译 + native ELF 分析 |
| [Nuke](#nuke) | `APP/Nuke` | Xposed 模块 `me.dartcv.nuke` | 反编译 + 后端接口还原 + native 库分析 |
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

针对 Xposed 模块 **Nuke v1.0.0**（包名 `me.dartcv.nuke`）的反编译与后端接口还原分析。

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

针对微信辅助 Xposed 模块 **WAuxiliary**（包名 `me.hd.wauxv`）的反混淆源码工程，包含版本：

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

微信 Xposed 模块源码工程 **WeChatXRemap**，是一个完整的 Android Gradle 项目。

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

**分析结论**
- 黑名单与更新服务托管于 GitHub Raw（`yyhh73144-max/dyhelperUser` 的 `blacklist_users.json` / `update.json`），Java 与 native 两套黑名单交叉校验；
- 大量业务接口为抖音/头条体系（`aweme.snssdk.com`、`vassets-backend.douyin.com`、`stark-gate.zijieapi.com` 等），对应农场、宠物、社交宠物与任务功能，参数与签名来自被 Hook 的抖音客户端；
- Beta 申请载荷与会话由 native 层生成（AES/CBC/PKCS5Padding、URL-safe Base64），并有运行环境完整性检查 `nativeIsRuntimeTrusted()`。

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

**分析结论**
- 字符串池解码器为 `xhss.AbstractC0775.m1313(long)`（底层 `AbstractC0561.m1006`），恢复副本已回填 1444 处可静态解析调用并移除解码器实现；
- 确认加密原语：PBKDF2WithHmacSHA256、GZIP、AES/CBC/PKCS5Padding；密文还与派生密钥 XOR、字节反转并输出无填充 Base64。

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

**分析结论**
- 动态字符串为四字节循环 XOR（KEY = `[75, 120, 112, 49]`），已还原 254 处；
- 云端鉴权集中在 `anjao2024.top`：`auth_public/verify.php`、`auth/verify.php`（密钥验证）与 `auth_notice/version_check.php`（版本检查），请求/响应均带 HMAC-SHA256 签名，响应签名校验失败返回 `sign_verify_failed`；
- 内置两套固定签名密钥（`WHS-X-` / `WHS-Y-` 前缀）与本地许可证缓存（`xp1_license` SharedPreferences）。

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

**分析结论**
- 模块按目标宿主分发 Hook：`DYHook`（抖音）、`XhsHook`（小红书）、`KSHook`（快手）、`PPHook`（PixelLab），并含 TikTok 作用域；
- 内置下载管理器（`DownloadManager`）与 WebDAV 备份/恢复（`WebDAVConfig` / `WebDAVDialog`）功能；
- 源码混淆为控制流平坦化 + 短数组 XOR 字符串池，`hook/audio/C1117.java` 为短数组 XOR 恢复函数。

---

## 免责声明

- 本仓库所有内容均为个人逆向工程学习记录，不提供任何形式的担保。
- 部分分析对象为恶意样本，分析过程仅用于学术与安全研究，**请勿二次传播、复用或用于非法目的**。
- **`短信` 目录为骚扰类工具（短信轰炸）的分析产物，使用后果自负**。
- 涉及的具体平台（微信、QQ、抖音等）均与本人无关；使用本仓库内容造成的一切后果由使用者自行承担。

---

*仓库内容自动整理，仅供学习交流。*
