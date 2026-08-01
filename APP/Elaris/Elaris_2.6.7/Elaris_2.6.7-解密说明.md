# Elaris 2.6.7 APK 解密说明

## 1. 产物

- 原始 APK：`Elaris_2.6.7.apk`
- JADX 输出：`Elaris_2.6.7-decompiled`
- Apktool 输出：`Elaris_2.6.7-apktool-full`
- 明文源码副本：`restored-sources`
- APK 大小：1,660,914 字节
- APK SHA-256：`78C732052FFD6995B27F943B801D903B103F84B4558DACFFD18F27EDDE851D4F`
- JADX 版本：1.5.5；Apktool 版本：3.0.2

导出结果：JADX 757 个源文件、26 个资源文件；Apktool 1,065 个 Smali 文件。原 APK 保持不变。

`restored-sources` 是完整 JADX Java 源码副本。该 APK 未发现 Cipher/AES/DES/RSA 解密器，也没有动态字符串 XOR 解码器；`AbstractC0260i5.java` 中的 SHA-256 只用于上传文件摘要，UUID 只用于生成上传标识。

## 2. 应用身份

- 显示名：`Elaris`
- 包名：`com.mr.elaris`
- Application：`com.mr.elaris.ElarisApplication`
- Xposed API：LibXposed API 102
- 目标宿主：`com.tencent.mobileqq`（QQ）
- 原生库：`lib/arm64-v8a/libdexkit.so`
- 版本号：`VERSION_CODE=1220`，`VERSION_NAME=2.6.7`
- Xposed 入口：`com.mr.elaris.ModernHookEntry`
- 作用域：`com.tencent.mobileqq`

这是一个 QQ Xposed/LibXposed 模块。`ModernHookEntry` 只在 QQ 包及其进程回调时分发到 `HookEntry.handleHostPackage`，设置界面由 `ElarisStatusActivity` 和 `InAppSettings` 构建。

## 3. 目录说明

### 3.1 JADX：`Elaris_2.6.7-decompiled`

| 目录 | 内容 | 说明 |
|---|---|---|
| `sources/com/p001mr/elaris/` | Elaris 主代码 | 原包 `com.mr.elaris` 经 JADX 编号化重命名；保留了 `HookEntry`、`ModernHookEntry`、`Prefs`、`InAppSettings` 等可读类名。 |
| `sources/p000/` | QQ Hook/业务辅助类 | 混淆后的内部类，包含表情云服务、语音、图片、下载、反射和 QQ 版本兼容逻辑。重点是 `AbstractC0260i5.java`、`AbstractC0309l3.java`。 |
| `sources/io/github/libxposed/` | LibXposed Service 接口 | Xposed Provider、远程偏好设置和 Binder 接口。 |
| `sources/org/luckypray/dexkit/` | DexKit Java 接口 | DEX 类、方法、字段检索接口，native 实现位于 `libdexkit.so`。 |
| `resources/` | Manifest 与资源 | XML、字符串、图标和资源索引。 |

重点源文件：

| 文件 | 作用 |
|---|---|
| `com/p001mr/elaris/ModernHookEntry.java` | LibXposed 新 API 入口，识别 QQ 包/进程，处理热重载并调用 HookEntry。 |
| `com/p001mr/elaris/HookEntry.java` | Hook 调度中心，根据配置安装 QQ 主进程、MSF、tool、qqfav 等进程功能。 |
| `com/p001mr/elaris/HookConfig.java` | 从 `SharedPreferences(settings)` 读取开关和字符串配置，提供运行时读写。 |
| `com/p001mr/elaris/Prefs.java` | 所有配置键、默认值和持久化名称。 |
| `com/p001mr/elaris/ElarisStatusActivity.java` | 模块状态页，动态创建卡片、状态行和外部链接。 |
| `com/p001mr/elaris/InAppSettings*.java` | 图片、表情、资料卡、消息复读、群管理、语音、主题等设置页。 |
| `p000/AbstractC0260i5.java` | 云表情列表、预览、上传、举报，以及 SHA-256 逻辑。 |
| `p000/AbstractC0309l3.java` | launch/active 统计，构造 JSON 后 POST 到 analytics 接口。 |
| `p000/RunnableC0446s1.java` | 云表情举报请求。 |

### 3.2 Apktool：`Elaris_2.6.7-apktool-full`

| 目录/文件 | 内容 | 说明 |
|---|---|---|
| `AndroidManifest.xml` | 已解码 Manifest | Activity、alias、Xposed Provider 和 QQ 包查询声明。 |
| `smali/` | 1,065 个文件 | DEX 指令级表示，用于核对 JADX 输出和恢复混淆控制流。 |
| `res/` | XML、图片、音频 | `res/Sl.mp3` 是唯一音频资源，其余为图标和主题 XML。 |
| `lib/arm64-v8a/libdexkit.so` | native DexKit 库 | 负责 DEX 检索，不是业务加密库。 |
| `unknown/META-INF/xposed/` | LibXposed 元数据 | `java_init.list`、`module.prop`、`scope.list`。 |
| `unknown/kotlin/` | Kotlin builtins | Kotlin 编译元数据。 |
| `original/` | 原始 Manifest 副本 | Apktool 备份内容。 |

元数据内容：`minApiVersion=102`、`targetApiVersion=102`、`staticScope=true`、`autoHotReload=true`；入口为 `com.mr.elaris.ModernHookEntry`，作用域为 `com.tencent.mobileqq`。

## 4. “加密代码”结论

### 4.1 没有传统加密算法实现

对 JADX 源码和 Smali 扫描了 `Cipher`、`SecretKeySpec`、`AES`、`DES`、`RSA`、`GCMParameterSpec`、`Mac`、`KeyStore`、Base64 加解密等调用。唯一命中的密码学原语是：

```java
MessageDigest.getInstance("SHA-256").digest(imageBytes)
```

位置：`p000/AbstractC0260i5.java:2720`。它只用于计算上传文件摘要，并写入 `X-Elaris-Upload-Sha256` 请求头；SHA-256 是单向摘要，不是密文解密流程。

### 4.2 上传 Key 的生成

位置：`p000/AbstractC0260i5.java:2809-2817`，方法 `m593a2(Context)`：

1. 打开 `SharedPreferences("elaris_cloud_stickers")`。
2. 读取 `upload_token`。
3. 已有值长度至少 32 时复用。
4. 否则生成 `UUID.randomUUID().toString() + UUID.randomUUID()` 并保存。
5. 上传时作为 `X-Elaris-Upload-Key` 请求头发送。

这不是加密密钥，而是每个安装实例持久化的随机标识。

### 4.3 R8 混淆

`p000` 下的编号类名、`m593a2` 这类方法名和局部变量名属于 R8 混淆结果。JADX 已恢复 Java 控制流；Smali 保留真实类描述符和指令。分析时应按功能重命名，避免将混淆符号误判为加密密钥。

## 5. URL 与网络接口

| URL | 方法/用途 | 证据文件 |
|---|---|---|
| `https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/list?limit=60&q=...` | GET 云表情列表，可追加 `folder` | `p000/AbstractC0260i5.java:1520` |
| `https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/` | 云表情资源相对路径补全 | `p000/AbstractC0260i5.java:1537` |
| `https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/upload` | POST 上传表情二进制 | `p000/AbstractC0260i5.java:2729` |
| `https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/report` | POST 举报云表情 JSON | `p000/RunnableC0446s1.java:44` |
| `https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/analytics/launch` | POST 首次版本统计 JSON | `p000/AbstractC0309l3.java:147` |
| `https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/analytics/active` | POST 每日活跃统计 JSON | `p000/AbstractC0309l3.java:143` |
| `https://api-v2.yuafeng.cn/API/kktts.php?action=list` | GET 语音目录 | `p000/AbstractC0260i5.java:3920` |
| `https://api-v2.yuafeng.cn/API/kktts.php?action=voice&content=...&voice_id=...` | 语音合成请求 | `p000/AbstractC0260i5.java:4585` |
| `https://oiapi.net/API/Mp32Silk?url=...` | 音频转 Silk 请求 | `p000/AbstractC0260i5.java:4714` |
| `https://t.me/Elaris_mod` | 设置页 Telegram 反馈入口 | `InAppSettings.java`、`InAppSettingsFeedbackPage.java` |

上传请求头：

```text
Content-Type: image/jpeg | image/png | image/gif | image/webp
X-Elaris-Upload-Key: 两个 UUID 拼接并持久化的 token
X-Elaris-Upload-Title: UTF-8 URL 编码的标题
X-Elaris-Upload-Category: UTF-8 URL 编码的分类，空值使用 other
X-Elaris-Upload-Sha256: 上传字节的小写 SHA-256
```

## 6. Analytics JSON

`AbstractC0309l3.m746b(...)` 生成以下字段：

```json
{
  "schema": 2,
  "event": "launch|active",
  "installId": "本地随机 UUID",
  "reportedAt": 0,
  "module": {"versionName":"2.6.7","versionCode":1220,"revision":"1220:2.6.7"},
  "qq": {"packageName":"com.tencent.mobileqq","processName":"..."},
  "android": {"sdk":0,"release":"..."},
  "framework": {},
  "xposed": "...",
  "launch": {"total":0,"day":"yyyy-MM-dd","dayCount":0}
}
```

统计请求使用 `Content-Type: application/json; charset=utf-8`，连接和读取超时均为 1500 ms；上传/列表请求使用 5000 ms 连接超时和 12000 ms 读取超时。

## 7. 功能分层

1. **模块入口层**：`ModernHookEntry`、`ElarisApplication`、`FrameworkActivationStatus`。
2. **配置层**：`Prefs`、`HookConfig`、`InAppSettings`；先恢复所有配置键和默认值。
3. **Hook 调度层**：`HookEntry.handleHostPackage` 根据进程和开关安装 Hook。
4. **功能层**：`p000` 下各 Hook 类处理气泡/字体、图片外显、表情面板、收藏表情、资料卡、消息撤回、输入栏、语音、下载和群功能。
5. **云服务层**：`AbstractC0260i5`、`AbstractC0309l3`、`RunnableC0446s1`。
6. **兼容层**：`xposedcompat` 与 LibXposed Service；QQ 内部类名随版本变化，需要使用 DexKit/反射候选名恢复。

## 8. 核对说明

- JADX Java 用于阅读和分析；Smali 用于确认混淆类的真实控制流。
- `libdexkit.so` 是 DexKit native 依赖，不包含 SHA-256/上传逻辑。
- 本 APK 的核心密码学行为是上传文件 SHA-256 摘要和随机上传标识；影响运行行为的核心是 QQ 版本适配和 Hook 目标定位。
