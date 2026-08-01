# Nuke_1.0.0_release.apk 逆向分析报告

## 产物路径

- 原始 APK：`Nuke_1.0.0_release.apk`
- JADX 反编译源码：`Nuke_1.0.0_release-decompiled\sources`
- JADX 反编译资源：`Nuke_1.0.0_release-decompiled\resources`
- show-bad-code 版本源码（更完整地还原了部分大方法）：`Nuke_1.0.0_release-jadx-showbad\sources`
- 运行时 Native SO（按 APK 内逻辑从后端下载）：`libnuke_native.so`
- Native SO 过滤字符串：`libnuke_native_strings_filtered.txt`
- 数据库关键词搜索结果：`database_indicator_search.txt`

## APK 基本信息

- 包名：`me.dartcv.nuke`
- 版本：`1.0.0` / `versionCode=1`
- 主 Activity：`me.dartcv.nuke.MainActivity`
- Xposed 入口：`assets/xposed_init`，Manifest 中 `xposedmodule=true`
- 网络权限：`android.permission.INTERNET`
- 网络安全配置允许 `guang233.com` 与 `qlogo.cn` 明文流量（虽然核心接口实际使用 HTTPS）。

## 已解出的 BuildConfig 常量

`Nuke_1.0.0_release-decompiled\sources\me\dartcv\nuke\BuildConfig.java` 中常量被 short[] XOR 混淆，解码结果：

| 常量 | 值 |
|---|---|
| `APPLICATION_ID` | `me.dartcv.nuke` |
| `BUILD_TYPE` | `release` |
| `VERSION_NAME` | `1.0.0` |
| `NUKE_API_BASE_URL` | `https://www.guang233.com/` |
| `NUKE_NATIVE_SO_CERT_SHA256` | `341e386452ad60d52c0ff2c53e06e2c385ac6f03ccfe954043193a0acde8dbe4` |

## 后端/数据库地址结论

APK 中没有发现直接数据库连接地址/DSN（未发现 JDBC、MySQL、Postgres、MongoDB、Redis、Firebase、Supabase 等数据库连接串）。客户端暴露的是后端 API 域名：

- 主后端 API：`https://www.guang233.com/`
- 实际同步接口：`POST https://www.guang233.com/api/client/report`
- Native SO 下载接口：`GET/HEAD https://www.guang233.com/api/client/native/libnuke_native.so`
- GitHub 头像查询：`GET https://api.github.com/users/{username}`

因此，如果你说的“后端数据库地址”是数据库服务器地址：APK 和运行时 SO 中没有泄露；数据库应在 `www.guang233.com` 后端服务内部，不直接暴露给客户端。

## 上传/同步机制

### 1. Retrofit/OkHttp 初始化

证据：`Nuke_1.0.0_release-decompiled\sources\p057K3\AbstractC0898f.java`

- 以 `https://www.guang233.com/` 为 baseUrl。
- 创建 Gson converter。
- 添加自定义 OkHttp interceptor：`C0893a`。
- 懒加载 Retrofit 接口：`InterfaceC0897e`。

### 2. 上传接口定义

证据：`Nuke_1.0.0_release-decompiled\sources\p057K3\InterfaceC0897e.java`

```java
@InterfaceC0532o("api/client/report")
InterfaceC0318e<C0845f<C0856q>> m1905a(@InterfaceC0518a C0856q c0856q);
```

含义：`POST /api/client/report`，请求体是 `EncryptedPayload`，响应是 `ApiResponse<EncryptedPayload>`。

### 3. 请求体结构

证据：`Nuke_1.0.0_release-decompiled\sources\p053J3\C0856q.java`

请求 JSON 字段：

```json
{
  "v": 3,
  "kid": "...",
  "iv": "...",
  "payload": "...",
  "tag": "..."
}
```

`iv/payload/tag/kid` 来自 native 加密返回值。

### 4. 明文报告内容如何生成

证据：`Nuke_1.0.0_release-decompiled\sources\p021D3\C0274k.java`

触发流程：`m470m()` 收集用户/设备/宿主信息，线程调用 `m478u(userId, platform)` 上传。

明文对象：

```java
new C0849j("Nuke 1.0.0 initialized", m458a())
```

其中 `m458a()` 收集：Android 版本、SDK、品牌、厂商、机型、设备名、App 版本、包名、CPU 架构、ABI、Xposed 框架信息、Locale、Timezone、宿主包名/宿主类型、SELinux/Root/Magisk/KernelSU/LSPosed/Xposed 等检测信息。

### 5. 加密方式入口

证据：`Nuke_1.0.0_release-decompiled\sources\p050I3\C0801a.java`

流程：

1. Gson 序列化 `ClientReportRequest`。
2. UTF-8 编码。
3. 调用：

```java
NativeCrypto.INSTANCE.encryptJsonBytes(bytes, "nuke-client-stream-v3")
```

4. 得到 `NativeEnvelope(iv, payload, tag, kid)`。
5. 包成 `EncryptedPayload(v=3,kid,iv,payload,tag)` 上传。

### 6. 签名 Header

证据：`Nuke_1.0.0_release-jadx-showbad\sources\p057K3\C0893a.java`

对 `/api/client/` 路径的请求会加签。签名明文拼接为：

```text
METHOD
PATH
userId
platform
timestamp
nonce
body
```

然后调用：

```java
NativeCrypto.INSTANCE.signClientPayload(signingPayload)
```

请求头：

- `X-Client-Id: <userId>`
- `X-Platform: <QQ|WECHAT|TIKTOK>`
- `X-Timestamp: <unix seconds>`
- `X-Nonce: <UUID>`
- `X-Signature: <native signature>`

### 7. 响应解密

证据：`Nuke_1.0.0_release-decompiled\sources\com\bumptech\glide\AbstractC1922d.java`

响应中的 `data` 仍是 `EncryptedPayload`，客户端调用：

```java
NativeCrypto.INSTANCE.decryptJsonBytes(iv, payload, tag, kid, "nuke-client-stream-v3")
```

解密后按 `C0850k` 解析，字段包括：`userId/platform/status/identityGroup/title/serverTime`。

## Native SO 下载机制

证据：`Nuke_1.0.0_release-jadx-showbad\sources\p113W3\AbstractC1609b.java`

- URL：`https://www.guang233.com/api/client/native/libnuke_native.so`
- 本地落点：`<host app filesDir>/nuke/libnuke_native.so`
- 如果本地已存在：先用 `HEAD` + `If-None-Match: "<local sha256>"` 检查。
- 如果不存在或校验失败：`GET` 下载。
- 校验：`X-Checksum-SHA256` 或 `ETag` 必须匹配本体 SHA256。
- 再校验 `.note.nksig` 签名，证书 SHA256 必须为 `341e386452ad60d52c0ff2c53e06e2c385ac6f03ccfe954043193a0acde8dbe4`，证书主体包含 `CN=Admilk` 和 `OU=design by Admilk`，描述必须为 `design by Admilk`。

我已按这个 URL 下载当前 SO：

- 文件：`libnuke_native.so`
- SHA256：`6b031314b432e7a0ad44b66682784020f44f5f86d2b3e246178e30bc4bc77e82`
- HTTP Header 中 `X-Checksum-Sha256` 与 `ETag` 同为该值。

## 接口清单

| Host | Method | Path | Auth/Sign | 用途 | 源码 |
|---|---:|---|---|---|---|
| `www.guang233.com` | POST | `/api/client/report` | `X-Client-Id`/`X-Platform`/`X-Timestamp`/`X-Nonce`/`X-Signature` | 上传客户端初始化/环境报告，同步用户状态 | `Nuke_1.0.0_release-decompiled\sources\p057K3\InterfaceC0897e.java` |
| `www.guang233.com` | GET | `/api/client/native/libnuke_native.so` | 无客户端签名；下载后本地校验 SHA 与 NKSIG | 下载运行时 crypto native 库 | `Nuke_1.0.0_release-jadx-showbad\sources\p113W3\AbstractC1609b.java` |
| `www.guang233.com` | HEAD | `/api/client/native/libnuke_native.so` | `If-None-Match` | 检查 native SO 是否需要更新 | `Nuke_1.0.0_release-jadx-showbad\sources\p113W3\AbstractC1609b.java` |
| `api.github.com` | GET | `/users/{username}` | 无 | 拉取 GitHub 用户头像 | `Nuke_1.0.0_release-decompiled\sources\p057K3\InterfaceC0895c.java` |

## 关键源码定位

- Base URL / Retrofit：`Nuke_1.0.0_release-decompiled\sources\p057K3\AbstractC0898f.java`
- 上传接口：`Nuke_1.0.0_release-decompiled\sources\p057K3\InterfaceC0897e.java`
- 请求加签：`Nuke_1.0.0_release-jadx-showbad\sources\p057K3\C0893a.java`
- 请求加密：`Nuke_1.0.0_release-decompiled\sources\p050I3\C0801a.java`
- 上传调用链：`Nuke_1.0.0_release-decompiled\sources\p021D3\C0274k.java`
- 响应解密：`Nuke_1.0.0_release-decompiled\sources\com\bumptech\glide\AbstractC1922d.java`
- Native SO 下载：`Nuke_1.0.0_release-jadx-showbad\sources\p113W3\AbstractC1609b.java`
- Native SO 签名校验：`Nuke_1.0.0_release-decompiled\sources\p113W3\AbstractC1611d.java`
