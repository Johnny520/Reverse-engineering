# DY Helper_1.4.15.apk 解密与云端分析

## 交付物

- 原 APK：`DY Helper_1.4.15.apk`，未修改。
- JADX 源码：`DY Helper_1.4.15-decompiled/`。
- Apktool 全量解包与 Smali：`DY Helper_1.4.15-apktool-full/`。
- 可读源码副本：`DY Helper_1.4.15-restored-sources/`。
- URL 清单：`DY Helper_1.4.15-urls.tsv`。

## 校验

- SHA-256：`D22E49FB70CE434E9B3C3A5E008D9D66C058C3E6B6A7A5C143DE42C604EDED8F`
- Java 文件：`3582`
- Smali 文件：`4018`
- ABI：`arm64-v8a`、`armeabi-v7a`

## 目录说明

- `com/example/dyhelper/`：DY Helper 自身的 UI、Hook、DexKit、评论收藏、Beta 保护与更新逻辑。
- `com/example/dyhelper/hook/`：注入抖音目标进程的功能模块，包括底栏、评论、收藏、面板和下载。
- `com/example/dyhelper/dexkit/`：运行时定位抖音类、方法和字段的解析器。
- `com/example/dyhelper/beta/`：Beta 功能开关、黑名单校验、会话刷新、申请码载荷与 native 保护桥。
- `p000/`：大量通用/第三方/抖音接口辅助类；其中包含实际 URL 和数据下载实现。
- `lib/arm64-v8a/`、`lib/armeabi-v7a/`：原生库，包含 `libdy_protect.so`、`libblacklist_verify.so`、`libdexkit.so` 等。

## 已确认的云端服务器

### 1. 黑名单与更新服务

- `https://raw.githubusercontent.com/yyhh73144-max/dyhelperUser/refs/heads/main/blacklist_users.json`
  - 来源：`com/example/dyhelper/beta/BlacklistVerifier.java`
  - 读取 JSON 的 `blacklist_users` 数组，字段包含 `uid`、`enabled`、`reason`。
  - Java 与 native 两套黑名单结果会交叉校验；不一致时状态为 `verification_pending`。
- `https://raw.githubusercontent.com/yyhh73144-max/dyhelperUser/refs/heads/main/update.json`
  - 来源：`p000/u72.java`
  - 用于版本更新检查，默认检查间隔为 6 小时。
- `geonames_regions.zip.001` 到 `.008`
  - GitHub Raw 与两个代理地址用于分卷下载地区数据。

### 2. 抖音/头条业务接口

- `https://aweme.snssdk.com`
  - 来源：`CommentBookmarkNetCompat.java`
  - 评论/回复列表兼容调用，具体路径和参数由目标抖音方法签名动态拼接。
- `https://vassets-backend.douyin.com/gameplay/farm/get_farm_info`
- `https://vassets-backend.douyin.com/gameplay/farm/plant_crops`
- `https://vassets-backend.douyin.com/room/user/pet/relation_list`
- `https://stark-game.zijieapi.com/config/v2/load`
- `https://stark-gate.zijieapi.com/ttgame/social_pet/feed`
- `https://stark-gate.zijieapi.com/ttgame/social_pet/feed/get`
- `https://stark-gate.zijieapi.com/ttgame/social_pet/closeness/claim`
- `https://api.amemv.com/aweme/im/growth/pet/task/reward`

这些接口对应农场、宠物、社交宠物和任务功能。请求参数、签名与登录态部分来自被 Hook 的抖音客户端，不是 DY Helper 自己生成的完整账号体系。

### 3. 其他功能服务

- `https://api.seekin.ai/ikool/media/download`：媒体下载接口。
- `https://www.seekin.ai`：媒体服务站点。
- `https://v1.hitokoto.cn/?encode=json&charset=utf-8`、`https://v2.jinrishici.com/one.json`：句子/诗词内容服务。
- `https://t.me/MFDYHelper`：群组/项目联系地址。
- `https://www.douyin.com/`、`https://www.douyin.com/video/`：抖音页面与分享链接拼接。

## Native 加密与保护

### `BetaNativeBridge.java`

Java 层公开以下 native 能力：

- `nativeGetBetaListUrls()`：返回 Beta/功能列表 URL，实际内容在 `libdy_protect.so` 中生成或解码。
- `nativeGetApplyKeyMaterial()`：返回 48 字节材料，其中前 32 字节为 AES key，后 16 字节为 IV。
- `nativeCreateApplyPayload()`：生成申请载荷。
- `nativeRefreshSession()`、`nativeRestoreSession()`：刷新/恢复 Beta 会话。
- `nativeQueryUiState()`：查询功能状态。
- `nativeIsRuntimeTrusted()`：运行环境完整性检查。

Java 层 `m1297` 已确认使用 `AES/CBC/PKCS5Padding`、URL-safe Base64，并在使用后清零 key/IV；native 层仍包含 `DYH_NATIVE_BETA_V2`、`beta_users`、`session`、`nativeEvaluate` 等保护逻辑。无法把这些 native 方法声明冒充为原始 C/C++ 源码，原始 ELF 保留在解包目录中。

### `BlacklistVerifier.java`

`libblacklist_verify.so` 提供 `nativeCheckUidInBlacklist`、`nativeGetReason`、`nativeIsBlocked`、`nativeSetBlocked`、`nativeStartBlockEnforcer`。黑名单 JSON 先由 Java 下载，再交给 Java/native 两套解析器比对，并写入 `dyhelper_blacklist.xml` 与 SharedPreferences 缓存。

## 证据等级

- `*-decompiled/sources`：JADX 反编译结果，可读但不等于作者原始工程。
- `*-restored-sources`：当前 APK 的 Java 源码副本；该版本未发现类似 XHS 的 Java 字符串池解码器，主要保护逻辑位于 native。
- `*-apktool-full/smali*`：Smali 级证据。
- `libdy_protect.so`、`libblacklist_verify.so`：native ELF，需用 Ghidra/IDA/反汇编器进一步还原 C/C++ 伪代码。
