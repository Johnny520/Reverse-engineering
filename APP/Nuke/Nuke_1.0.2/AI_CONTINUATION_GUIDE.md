# Nuke 1.0.2 注册与查询逆向工程 AI 交接文档

更新时间：2026-08-02

## 1. 文档用途

本文档专门提供给接手任务的后续 AI。目标是让接手者不必重新做完整目录扫描，就能直接从当前进度继续解决以下最终问题：

1. 随机生成合法的 `wxid_`。
2. 真实调用 Nuke 后端注册接口。
3. 获得可验证的注册成功响应，而不是模拟响应。
4. 注册成功后调用报告或状态接口。
5. 解密服务器响应并取得 `status`、`identityGroup`、`title`、`server_time`。
6. 判断注册身份是否为普通用户，即 `status == ACTIVE` 且 `identityGroup == NORMAL`。

本文档同时记录当前问题、完成进度、失败实验、证据等级和下一步顺序。接手者应先阅读第 4、10、11、12 节。

## 2. 最终验收标准

只有同时满足下列条件，才能认为任务完成：

- 使用运行时新生成的随机 ID，格式为 `wxid_` 加 14 位小写字母或数字。
- 真实请求 `POST https://www.guang233.com/api/client/users`。
- HTTP 返回 `201`，或者对同一已成功注册身份返回 APK 明确认可的幂等结果。
- 请求使用真实时间戳、新 nonce、正确 generation 和与完整 canonical payload 对应的签名。
- 后续真实请求 `/api/client/report` 或已确认的状态接口。
- 成功解密业务响应。
- 输出并保存完整请求、HTTP 状态、原始响应和解密 JSON。
- 结果不能来自本地 mock、硬编码业务响应或伪造服务器数据。

当前尚未满足最关键的 `HTTP 201` 条件。

## 3. 样本

主要样本及 SHA-256：

| 文件 | SHA-256 | 说明 |
|---|---|---|
| `Nuke_1.0.2.apk` | `9BC090EF451C661E41096264897103C0BAC7E45EB3A8A7E4699D7D8171B43894` | 原始 APK |
| `Nuke_1.0.2-extracted/lib/arm64-v8a/libnuke_bridge.so` | `239CFE93ACF7C7D7888F58BEA155C6364E6FE75407BF84DF2AA134AD06921AFC` | JNI bridge |
| `Nuke_1.0.2-bootstrap/release.nkm` | `6B4FF5DA4EB4673EA8993B356262A3504EEDA2151EE8D95338DDA6BEC0804329` | bootstrap release 元数据 |
| `Nuke_1.0.2-bootstrap/lib/arm64-v8a/libnuke_engine_2026071502_da53b572650c.so` | `DA53B572650C4EA6D793592A12CA8C44C983E9D028CEE9AED3D013A07A29D54F` | 当前 ARM64 engine |

固定版本信息：

```text
applicationId = me.dartcv.nuke
versionName = 1.0.2
versionCode = 234
buildTime = 1785243782422
generation = 2026071502
kid = d8e39774
platform = WECHAT
```

证书摘要：

```text
APK 签名证书 SHA-256:
72b63dc62e5da6697bd82454537e997b2741be47788a0a944dcad6a58db5b32a

release.nkm module certificate SHA-256:
341e386452ad60d52c0ff2c53e06e2c385ac6f03ccfe954043193a0acde8dbe4
```

这两个摘要不是同一个值，不应互换。

## 4. 当前进度总览

| 项目 | 状态 | 当前结论 |
|---|---|---|
| APK 解包 | 完成 | 原始 ZIP、Apktool、JADX 输出均已存在 |
| bootstrap release 解包 | 完成 | 已取得 `release.nkm` 和 ARM64 engine |
| 后端基址 | 完成 | `https://www.guang233.com/` |
| update 接口 | 完成并实测 | HTTP 200，可解码 Base64 内层 JSON |
| users 路由 | 完成并实测 | 路由存在，缺认证时返回 401 |
| report 路由 | 完成并实测 | 路由存在，缺认证时返回 401 |
| status 路由 | 已确认存在 | 未认证返回 401；业务语义仍需成功认证后确认 |
| 注册请求体 | 完成 | `{"userId":"RANDOM_WXID","platform":"WECHAT"}` |
| 八行 canonical | 完成 | 方法、路径、用户、平台、时间戳、nonce、generation、body |
| REST v3 加解密 | 完成 | Rust 离线向量已验证 |
| 旧 signer packet | 完成 | Rust 离线 native oracle 向量已验证 |
| 当前 generation 云端 signer | 未确认 | 当前实现仍标记为 legacy，不能宣称已通过云端认证 |
| 随机注册程序 | 完成 | 可生成随机 ID、签名并真实发出 HTTPS 请求 |
| 注册成功 | 未完成 | 当前服务端返回 503，而不是 201 |
| report 成功 | 未完成 | 依赖注册和当前 signer |
| 用户状态解密 | 未完成 | 尚未取得成功的加密业务响应 |
| Unidbg bridge 加载 | 部分完成 | JNI_OnLoad 可到达，但随后 Windows native backend 崩溃 |
| Unidbg engine 激活 | 未完成 | harness 在 attest 前后阶段崩溃，且 activation proof 当前传 `null` |
| Rust 测试 | 完成 | `42 passed; 0 failed` |

## 5. 主要目录和关键文件

### 5.1 逆向证据

| 路径 | 内容 |
|---|---|
| `Nuke_1.0.2-extracted/` | APK 原始 ZIP 解包结构 |
| `Nuke_1.0.2-apktool/` | 资源、Smali、可读 manifest |
| `Nuke_1.0.2-jadx/` | Java 反编译源码和资源 |
| `Nuke_1.0.2-bootstrap/` | bootstrap release、元数据和 engine |
| `native_analysis/` | bridge、engine、DEX、副本、汇编和 xref 分析 |
| `nuke_probe/` | Rust signer 探针 |
| `nuke_unidbg/` | Unidbg Java harness |
| `unidbg-reference/` | Unidbg 参考源码 |

### 5.2 当前交付工程

| 路径 | 内容 |
|---|---|
| `WeKit-reference/nuke_client.py` | 纯 Python update API 客户端；当前不实现 authenticated registration signer |
| `WeKit-reference/test_nuke_api.py` | 真实 update API 验收入口 |
| `WeKit-reference/register_random.ps1` | 随机注册入口，调用 Rust example |
| `WeKit-reference/REGISTRATION.md` | 简版注册说明 |
| `AI_CONTINUATION_GUIDE.md` | 根目录下的协议与执行交接文档 |
| `WeKit-reference/app/src/main/rust/wekit-native/examples/register_random.rs` | 随机 ID、签名、真实 users 请求 |
| `WeKit-reference/app/src/main/rust/wekit-native/registration_results/` | 真实注册尝试日志 |
| `WeKit-reference/app/src/main/rust/wekit-native/src/nuke_client.rs` | HTTP、canonical、注册、报告、响应处理 |
| `WeKit-reference/app/src/main/rust/wekit-native/src/nuke_crypto/rest.rs` | REST v3 envelope 加解密 |
| `WeKit-reference/app/src/main/rust/wekit-native/src/nuke_crypto/sign.rs` | legacy signer packet 复刻和测试向量 |
| `WeKit-reference/app/src/main/rust/wekit-native/src/nuke_crypto/prf.rs` | 自定义 PRF |
| `WeKit-reference/app/src/main/rust/wekit-native/src/nuke_crypto/perm.rs` | ARX permutation |
| `WeKit-reference/app/src/main/rust/wekit-native/src/nuke_crypto/ops.rs` | 五段可逆变换 |

## 6. 已确认后端接口

后端基址：

```text
https://www.guang233.com
```

| 方法 | 路径 | 当前结果 | 说明 |
|---|---|---|---|
| `GET` | `/api/client/update?versionCode=234` | HTTP 200 | 公开更新检查 |
| `GET` | `/api/client/native/manifest` | HTTP 503 | 当前返回 `NATIVE_RELEASE_UNAVAILABLE` |
| `GET` | `/api/client/native/releases/{releaseId}/package` | 内置 releaseId 实测 404 | releaseId 正常应来自在线 manifest |
| `POST` | `/api/client/users` | 无认证 401；当前本地 signer 请求 503 | 注册或绑定 identity |
| `POST` | `/api/client/report` | 无认证 401 | 上传加密环境报告并取得业务状态 |
| `GET` | `/api/client/status` | 无认证 401 | 路由存在；成功认证后的响应结构待确认 |

APK 中没有发现公开的：

```text
GET /api/client/users/{wxid}
```

该猜测路径返回 404，不应继续把它当作查询接口。

## 7. 注册协议

### 7.1 随机 ID 格式

合法格式：

```text
wxid_ + 14 位 [a-z0-9]
```

Rust 校验函数：

```text
WeKit-reference/app/src/main/rust/wekit-native/src/nuke_client.rs
is_valid_wechat_user_id()
```

### 7.2 注册请求体

字段顺序按当前 native 构造保持为 `userId`、`platform`：

```json
{"userId":"RANDOM_WXID","platform":"WECHAT"}
```

请求体不是 REST v3 encrypted envelope。注册 body 是明文 JSON，但完整 body 会参与签名。

### 7.3 请求头

```http
Content-Type: application/json
X-Client-Id: RANDOM_WXID
X-Platform: WECHAT
X-Timestamp: UNIX_SECONDS
X-Nonce: UNIQUE_NONCE
X-Native-Generation: 2026071502
X-Signature: LOWERCASE_HEX_PACKET
```

### 7.4 canonical payload

精确为八行，以 `\n` 连接，结尾不额外添加换行：

```text
POST
/api/client/users
RANDOM_WXID
WECHAT
UNIX_SECONDS
UNIQUE_NONCE
2026071502
{"userId":"RANDOM_WXID","platform":"WECHAT"}
```

实现位置：

```text
nuke_client.rs::canonical_payload_for_path()
nuke_client.rs::prepare_registration()
```

### 7.5 注册成功判定

当前 Rust 客户端认可：

- HTTP `201`。
- HTTP `409` 且响应体精确等于 `CLIENT_USER_ALREADY_EXISTS`。

实现位置：

```text
nuke_client.rs::send_prepared_registration_with_client()
```

接手者应重新核对真实服务器的 409 响应是否包含换行或 JSON。如果格式改变，当前“精确字符串相等”判定可能过严。

## 8. 报告协议与用户状态

APK 的同步顺序是：

```text
POST /api/client/users
POST /api/client/report
```

`/api/client/report` body 使用 REST v3 encrypted envelope，而不是明文报告 JSON。

envelope 结构：

```json
{
  "v": 3,
  "iv": "BASE64_24_BYTES",
  "kid": "d8e39774",
  "payload": "BASE64_CIPHERTEXT",
  "tag": "BASE64_TAG"
}
```

REST 常量：

```text
REST_STREAM = nuke-client-stream-v3
REST_KID = d8e39774
```

实现位置：

```text
nuke_crypto/rest.rs::encrypt_json_bytes()
nuke_crypto/rest.rs::decrypt_json_bytes()
nuke_client.rs::prepare_one_report()
nuke_client.rs::send_prepared_report_with_client()
```

JADX 响应模型证据：

```text
Nuke_1.0.2-jadx/sources/defpackage/pt.java
```

目标字段：

```text
userId
platform
status
identityGroup
title
server_time
```

已发现枚举值：

```text
status: ACTIVE, BANNED, DISABLED
identityGroup: NORMAL, SPECIAL, VIP
```

普通用户判断：

```text
status == ACTIVE && identityGroup == NORMAL
```

## 9. Native release 与 activation

### 9.1 bootstrap release 元数据

`release.nkm` 外层字段：

```text
v
payload
certificate
signature
```

Base64 解码后的 payload 关键值：

```json
{
  "v": 1,
  "releaseId": "fcf8fce6-4f45-448d-85ba-22d934052e4b",
  "generation": 2026071502,
  "engineAbi": 1,
  "minBridgeAbi": 1,
  "minAppVersionCode": 1,
  "kid": "d8e39774",
  "engine": {
    "path": "lib/arm64-v8a/libnuke_engine_2026071502_da53b572650c.so",
    "sha256": "da53b572650c4ea6d793592a12ca8c44c983e9d028cee9aed3d013a07a29d54f",
    "size": 10092280
  },
  "createdAt": "2026-07-15T21:00:25.7977836+08:00",
  "buildId": "generation-2026071502"
}
```

### 9.2 在线 activation manifest

在线 manifest 与 bootstrap `release.nkm` 不是同一种 payload。JADX 的 `vl1.d()` 要求在线 envelope：

```json
{
  "v": 1,
  "payload": "BASE64_JSON",
  "signature": "BASE64_64_BYTES"
}
```

在线 payload 必须包含：

```text
v
sequence
releaseId
packageUrl
packageSha256
packageLength
engineSha256
engineLength
generation
kid
engineAbi
minBridgeAbi
minAppVersionCode
publishedAt
```

验证流程：

```text
Base64 decode payload
Base64 decode 64-byte signature
nativePrepareActivation(payload, signature)
验证 JSON shape 与数值范围
下载 packageUrl
验证 package SHA-256 与长度
stage release
nativeActivateEngine(fd, path, generation, kid, activationProof)
检查 nativeEngineGeneration() == generation
```

证据文件：

```text
Nuke_1.0.2-jadx/sources/defpackage/vl1.java
Nuke_1.0.2-jadx/sources/defpackage/am1.java
Nuke_1.0.2-jadx/sources/nuke/data/cipher/NativeCrypto.java
```

## 10. 当前问题

### 问题 1：服务器 activation manifest 当前不可用

真实请求：

```text
GET https://www.guang233.com/api/client/native/manifest
```

当前响应：

```text
HTTP 503 Service Temporarily Unavailable
```

```json
{
  "code": "NATIVE_RELEASE_UNAVAILABLE",
  "message": "Native release activation is unavailable",
  "success": false
}
```

这会阻止 APK 按正式流程获取在线 activation proof 和 release package。

### 问题 2：当前云端签名是否正确仍未被严格证明

存在两组结果：

1. 明显错误签名 `X-Signature: x` 返回 HTTP 401 `INVALID_SIGNATURE`。
2. 当前 Rust signer 生成的签名在服务器 release 不可用时返回 HTTP 503 `NATIVE_RELEASE_UNAVAILABLE`。

第二组结果说明请求进入了不同的服务器分支，但不能严格证明签名已验证成功。服务器可能先检查 release availability，再验证完整签名。

此外，`nuke_crypto/sign.rs` 文件头已明确标记：当前代码是 legacy native signer oracle，generation `2026071502` 的云端签名还绑定 bridge/module attestation。因此接手者不得把当前 503 写成“签名已通过”。

历史实测中，同一类 legacy signer 请求在 release 服务可用时曾返回：

```text
HTTP 401
INVALID_SIGNATURE
```

### 问题 3：Unidbg/Unicorn 在 Windows native backend 崩溃

已用 Java 17.0.12 和 Java 26 测试。Java 17 能执行 bridge 初始化和 JNI 调用模拟，但仍发生：

```text
EXCEPTION_ACCESS_VIOLATION
Problematic frame: unicorn_java.dll
```

Java 17 运行中已观察到：

```text
APK certificate SHA-256 正确
MessageDigest SHA-256 JNI 模拟执行
bridge.cert_helper.return=1
bridge.jni_onload.return=JNI_VERSION_1_6
bridge.loaded=libnuke_bridge.so
```

之后 native backend 崩溃，尚未稳定执行到完整的：

```text
nativeAttestModule
nativePrepareActivation
nativeActivateEngine
nativeIsConfigured
nativeSignClientPayload
```

### 问题 4：当前 harness 的 activation proof 是错误的 `null`

文件：

```text
nuke_unidbg/src/main/java/nuke/harness/NukeHarness.java
```

当前 `activate(fd)` 调用：

```text
nativeActivateEngine(fd, path, generation, kid, null)
```

这与 APK 正常流程不一致。正确流程必须先执行：

```text
proof = nativePrepareActivation(payloadBytes, signatureBytes)
nativeActivateEngine(fd, path, generation, kid, proof)
```

这是接手者需要优先修复的问题。

### 问题 5：harness 虽读取 module certificate，但没有完整使用 activation 数据

`NukeHarness.java` 当前会：

- 从 APK v2 signing block 提取 APK certificate。
- 从 `release.nkm` 读取 module certificate。
- 计算 module certificate SHA-256。
- 把固定 module certificate digest 传给 `nativeAttestModule()`。

但是：

- `moduleCertificate` 字段本身没有用于 `nativePrepareActivation()`。
- 没有从在线 activation envelope 取得 payload/signature。
- 没有从本地可验证 envelope 构建与正式流程等价的 proof。
- `activate()` 仍传 `null` proof。

### 问题 6：当前 Hook/Breakpoint 会改变真实控制流

为了诊断，harness 当前包含：

- 两个 bridge helper 返回点断点，强制 `W0 = 1`。
- JNI_OnLoad 返回点断点，强制 `JNI_VERSION_1_6`。
- libc `memcmp` HookZz wrapper，在匹配 module certificate digest 时强制相等。

这些修改适合定位，但最终生成云端签名时必须逐项移除或证明它们只替代了已知 Android 环境检查。否则得到的签名不能视作干净 native 输出。

### 问题 7：尚未取得成功的 report 响应

注册未成功，因此还没有取得真实的 encrypted report response，也没有输出：

```text
status
identityGroup
title
server_time
```

## 11. 已完成的真实实验

### 11.1 update API

命令：

```powershell
cd WeKit-reference
python .\test_nuke_api.py
```

已确认：

```text
HTTP 200
success = true
currentVersionCode = 234
hasUpdate = false
```

### 11.2 随机注册程序

命令：

```powershell
cd WeKit-reference
.\register_random.ps1
```

程序行为：

1. 生成新的 `wxid_`。
2. 生成当前 UNIX 秒时间戳。
3. 生成 nonce。
4. 构造注册 JSON。
5. 构造八行 canonical。
6. 调用 Rust legacy signer。
7. 发送真实 HTTPS POST。
8. 输出真实服务器响应。

当前一次保存的结果位于：

```text
app/src/main/rust/wekit-native/registration_results/registration_20260802_214425.txt
```

该次结果：

```text
signatureLength = 1344
HTTP 503
NATIVE_RELEASE_UNAVAILABLE
```

签名长度不是固定值。native packet length selector 可能生成不同长度，运行中也观察过 `1984` 字符的 lowercase hex signature。

### 11.3 错误签名对照实验

使用完整头但令：

```text
X-Signature: x
```

服务器返回：

```text
HTTP 401
X-Native-Kid: d8e39774
X-Native-Sequence: 1
INVALID_SIGNATURE
```

该实验只证明服务器存在签名校验分支。

### 11.4 Rust 离线测试

命令：

```powershell
cd WeKit-reference\app\src\main\rust\wekit-native
cargo test --lib
```

结果：

```text
42 passed
0 failed
```

覆盖内容包括：

- 注册 JSON 与 header 构造。
- users -> report 同步顺序。
- REST v3 envelope。
- custom PRF。
- ARX permutation。
- 五段可逆变换。
- legacy signer packet。
- 多组 direct native oracle 向量。

这些测试是离线正确性证据，不等于当前云端认证成功。

## 12. 推荐接手顺序

### 阶段 A：先重复检查服务端状态

每次开始工作先请求：

```powershell
curl.exe -sS -D - --max-time 20 https://www.guang233.com/api/client/native/manifest
```

如果从 503 变为 200：

1. 原样保存 response headers 和 body。
2. 不要格式化或重新序列化 Base64 payload。
3. 解码外层 `payload` 和 `signature`。
4. 验证 signature 解码后长度为 64。
5. 按 `vl1.d()` 的字段约束解析 payload。
6. 下载 `packageUrl`。
7. 验证 package 和 engine 的 SHA-256 与长度。
8. 把在线 payload/signature 输入 Unidbg `nativePrepareActivation()`。

### 阶段 B：最小化 Unidbg harness

建议按以下顺序排除崩溃：

1. 保留 APK certificate JNI 模拟，移除 HookZz `memcmp` wrapper。
2. 移除 bridge helper 强制返回断点，观察最早真实失败点。
3. 移除 JNI_OnLoad 返回断点，让 `callJNI_OnLoad()` 获取真实返回值。
4. 关闭 verbose VM 和大块 Inspector dump，减少 native callback 压力。
5. 临时关闭 thread dispatcher，比较崩溃是否与调度有关。
6. 显式选择 `Unicorn2Factory(true/false)` 各跑一次。
7. 添加并尝试 `DynarmicFactory(true)` 后端，比较是否避开 `unicorn_java.dll`。
8. 每次只恢复一个 hook，记录首次改变行为的位置。

不要同时保留全部强制 hook 后直接把输出认作真实 signer oracle。

### 阶段 C：补齐 activation proof

给 harness 添加：

```text
prepareActivation(byte[] payload, byte[] signature)
```

伪代码：

```java
private byte[] prepareActivation(byte[] payload, byte[] signature) {
    DvmObject<?> result = nativeCrypto.callStaticJniMethodObject(
        emulator,
        "nativePrepareActivation([B[B)[B",
        new ByteArray(vm, payload),
        new ByteArray(vm, signature)
    );
    return result == null ? null : (byte[]) result.getValue();
}
```

然后修改激活调用：

```text
nativeActivateEngine(fd, path, generation, kid, proof)
```

成功标准：

```text
nativeAttestModule(...) == true
proof != null
nativeActivateEngine(...) == true
nativeEngineGeneration() == 2026071502
nativeIsConfigured() == true
nativeKid() == d8e39774
nativeSelfTest() == true
```

### 阶段 D：获取干净 native signature

`nativeSignClientPayload()` 的输入不是仅注册 JSON，而是完整八行 canonical payload。

必须为同一个请求生成：

```text
timestamp
nonce
body
canonical
signature
```

生成签名后立即发送，避免时间戳过期。

必须保存：

```text
userId
timestamp
nonce
generation
body bytes
canonical bytes
signature
HTTP response headers
HTTP response body
```

### 阶段 E：注册成功后立刻报告

注册返回 201 后：

1. 使用同一 `userId` 和 `platform`。
2. 为 report 生成新的 timestamp 和 nonce。
3. 使用 `fixed_native_wechat_report()` 或从 APK 构造完整环境 JSON。
4. REST v3 加密报告 body。
5. 对 report 的完整八行 canonical 重新签名。
6. POST `/api/client/report`。
7. 解析外层 JSON。
8. 取得 `data` encrypted envelope。
9. 调用 `decrypt_json_bytes()`。
10. 输出业务字段。

## 13. 不要重复的错误方向

- 不要继续尝试 `GET /api/client/users/{wxid}`，该路径没有 APK 证据且实测 404。
- 不要把 update API 200 当作注册成功。
- 不要把 503 自动解释为签名通过。
- 不要把 42 个离线测试当作云端 signer 验证。
- 不要把 APK certificate digest 当作 module certificate digest。
- 不要把 `release.nkm` payload 直接当作在线 activation manifest payload，两者字段不同。
- 不要向 `nativeActivateEngine()` 继续传 `null` proof。
- 不要只签名 JSON body；必须签名完整八行 canonical。
- 不要复用旧 timestamp 或 nonce。
- 不要在源码和文档中写入先前指定的固定目标 ID；统一使用运行时随机 ID 或 `RANDOM_WXID`。
- 不要把 Smali、汇编或 JADX 反编译结果描述为原始源码。

## 14. 当前代码入口速查

### 注册

```text
nuke_client.rs::prepare_registration
nuke_client.rs::sign_prepared_registration_with_signer_observations
nuke_client.rs::send_prepared_registration
examples/register_random.rs::main
```

### 报告

```text
nuke_client.rs::fixed_native_wechat_report
nuke_client.rs::prepare_one_report
nuke_client.rs::sign_prepared_report_with_signer_observations
nuke_client.rs::send_prepared_report
```

### 签名

```text
nuke_client.rs::canonical_payload_for_path
nuke_client.rs::native_sign_client_payload_with_signer_observations
nuke_crypto/sign.rs::sign_native_canonical
nuke_crypto/sign.rs::build_native_signer_packet
```

### REST 加解密

```text
nuke_crypto/rest.rs::encrypt_json_bytes
nuke_crypto/rest.rs::decrypt_json_bytes
```

### Unidbg

```text
nuke_unidbg/src/main/java/nuke/harness/NukeHarness.java
nuke_unidbg/src/main/java/nuke/harness/EngineProbe.java
```

## 15. 完成后应生成的结果文件

建议创建新的时间戳目录：

```text
WeKit-reference/app/src/main/rust/wekit-native/registration_results/YYYYMMDD_HHMMSS/
```

保存：

```text
registration_request.json
registration_canonical.txt
registration_headers.json
registration_response_headers.txt
registration_response_body.json
report_plaintext.json
report_request_envelope.json
report_canonical.txt
report_headers.json
report_response_headers.txt
report_response_body.json
report_decrypted.json
summary.json
```

`summary.json` 最少包含：

```json
{
  "registrationSucceeded": true,
  "registrationHttpStatus": 201,
  "userId": "RANDOM_WXID",
  "platform": "WECHAT",
  "status": "ACTIVE",
  "identityGroup": "NORMAL",
  "title": "SERVER_VALUE",
  "server_time": 0,
  "isNormalUser": true
}
```

其中所有值必须来自本次真实请求；示例中的占位内容不能作为最终结果。

## 16. 当前结论

客户端的接口、请求体、canonical、REST v3 加解密和 legacy signer 结构已经恢复到可运行状态，随机注册程序也会真实发出请求。当前阻塞注册成功的两个核心点是：

1. 云端 `/api/client/native/manifest` 当前返回 `503 NATIVE_RELEASE_UNAVAILABLE`。
2. 当前 generation 的 attestation-bound native signer 尚未通过干净 native 执行或真实 201 响应验证。

后续最有效的推进路线是：监测在线 manifest、修复 Unidbg activation proof、减少强制 hook、获得干净的 `nativeSignClientPayload()` 输出，然后用同一 canonical 立即请求 users 和 report。
