# Nuke 1.0.2 注册工程 AI 总交接文档

更新时间：2026-08-02


## 1. 交接目标

后续 AI 的最终任务不是继续做静态目录整理，而是完成一条真实可验证的业务链路：

1. 运行时随机生成合法 `wxid_`。
2. 调用真实后端注册接口。
3. 获得 HTTP `201` 或服务器认可的幂等注册结果。
4. 使用同一身份提交真实 report。
5. 解密服务器业务响应。
6. 输出 `userId`、`platform`、`status`、`identityGroup`、`title`、`server_time`。
7. 判断用户是否为普通用户：`status == ACTIVE && identityGroup == NORMAL`。

当前已经完成 APK 静态分析、接口定位、REST v3 加解密、legacy signer 复刻、随机注册程序和真实联网请求，但还没有取得注册成功的 HTTP `201`。

更细的协议与下一步执行清单见根目录 [AI_CONTINUATION_GUIDE.md](AI_CONTINUATION_GUIDE.md)。本文重点说明当前问题、工作进度和各目录的实际职责。

## 2. 当前核心结论

### 2.1 已确认常量

```text
applicationId = me.dartcv.nuke
versionName = 1.0.2
versionCode = 234
buildTime = 1785243782422
backend = https://www.guang233.com/
nativeGeneration = 2026071502
nativeKid = d8e39774
platform = WECHAT
```

### 2.2 主要样本 SHA-256

| 文件 | SHA-256 |
|---|---|
| `Nuke_1.0.2.apk` | `9BC090EF451C661E41096264897103C0BAC7E45EB3A8A7E4699D7D8171B43894` |
| `libnuke_bridge.so` | `239CFE93ACF7C7D7888F58BEA155C6364E6FE75407BF84DF2AA134AD06921AFC` |
| `bootstrap.nkr` | `31F925ED5B5136D14E6BA447DD7B77D5DFE1393123FF5CCD6DC3320C8D82D0FB` |
| `release.nkm` | `6B4FF5DA4EB4673EA8993B356262A3504EEDA2151EE8D95338DDA6BEC0804329` |
| `libnuke_engine_2026071502_da53b572650c.so` | `DA53B572650C4EA6D793592A12CA8C44C983E9D028CEE9AED3D013A07A29D54F` |

### 2.3 两个不同的证书摘要

```text
APK signing certificate SHA-256:
72b63dc62e5da6697bd82454537e997b2741be47788a0a944dcad6a58db5b32a

release module certificate SHA-256:
341e386452ad60d52c0ff2c53e06e2c385ac6f03ccfe954043193a0acde8dbe4
```

两个摘要不可互换。APK certificate 用于模拟 PackageManager/Signature；module certificate digest 用于 native module attestation。

## 3. 当前后端接口

| 方法 | 路径 | 当前实测 | 用途 |
|---|---|---|---|
| `GET` | `/api/client/update?versionCode=234` | HTTP 200 | 更新检查，外层 `data` 为 Base64 JSON |
| `GET` | `/api/client/native/manifest` | HTTP 503 `NATIVE_RELEASE_UNAVAILABLE` | 在线 native activation manifest |
| `GET` | `/api/client/native/releases/{releaseId}/package` | 内置 releaseId 实测 404 | 在线 release package 下载 |
| `POST` | `/api/client/users` | 无认证 401；当前本地 signer 请求 503 | 注册或绑定 client identity |
| `POST` | `/api/client/report` | 无认证 401 | 上传加密报告，成功响应包含用户状态 |
| `GET` | `/api/client/status` | 无认证 401 | 路由存在，成功响应结构仍待确认 |

没有 APK 证据支持 `GET /api/client/users/{wxid}`。该猜测路径实测 404。

## 4. 注册协议摘要

合法 ID：

```text
wxid_ + 14 位小写字母或数字
```

注册 body：

```json
{"userId":"RANDOM_WXID","platform":"WECHAT"}
```

认证头：

```http
X-Client-Id: RANDOM_WXID
X-Platform: WECHAT
X-Timestamp: UNIX_SECONDS
X-Nonce: UNIQUE_NONCE
X-Native-Generation: 2026071502
X-Signature: LOWERCASE_HEX_SIGNATURE
```

八行 canonical：

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

注册成功后 APK 的下一步是 `POST /api/client/report`，不是公开 GET 用户资料接口。

## 5. 工作进度

| 工作项 | 状态 | 证据或说明 |
|---|---|---|
| APK 解包 | 完成 | extracted、Apktool、JADX 输出齐全 |
| native bootstrap 解包 | 完成 | `release.nkm` 和 engine 已提取 |
| 后端 URL | 完成 | `BuildConfig.NUKE_API_BASE_URL` |
| Java/JNI 激活链 | 完成静态定位 | `NativeCrypto.java`、`vl1.java`、`am1.java` |
| 注册请求体 | 完成 | users body 为明文 JSON |
| 注册 canonical | 完成 | generation 位于 nonce 与 body 之间 |
| report schema | 完成 | `nt` 环境模型和 `pt` 响应模型已定位 |
| REST v3 加解密 | 完成 | Rust native oracle 测试通过 |
| legacy signer | 完成 | Rust direct native oracle 测试通过 |
| Rust 离线测试 | 完成 | 42 passed，0 failed |
| 随机注册程序 | 完成 | 真实生成 ID、签名并发出 HTTPS POST |
| 错误签名对照 | 完成 | 明显错误签名返回 401 `INVALID_SIGNATURE` |
| 当前 signer 请求 | 已真实发送 | 当前服务器返回 503 `NATIVE_RELEASE_UNAVAILABLE` |
| 注册成功 | 未完成 | 尚未出现 HTTP 201 |
| report 成功 | 未完成 | 依赖注册与当前 generation signer |
| 用户状态解析 | 模型已知，真实数据未取得 | 目标字段在 `pt.java` |
| Unidbg bridge 初始化 | 部分完成 | JNI_OnLoad 可到达，之后 native backend 崩溃 |
| activation proof | 未完成 | 当前 harness 错误地向 activate 传 `null` |
| 当前 generation 干净 native 签名 | 未完成 | 尚未稳定执行 `nativeSignClientPayload()` |

## 6. 当前问题

### 6.1 服务器在线 native release 不可用

当前真实响应：

```text
GET https://www.guang233.com/api/client/native/manifest
HTTP 503
```

```json
{
  "code": "NATIVE_RELEASE_UNAVAILABLE",
  "message": "Native release activation is unavailable",
  "success": false
}
```

这会阻止 APK 正式完成在线 manifest 验证、package 下载和 activation proof 生成。

### 6.2 503 不能被当成签名已经通过

目前有两类响应：

- `X-Signature: x` 返回 HTTP 401 `INVALID_SIGNATURE`。
- Rust legacy signer 生成的请求在当前服务器状态下返回 HTTP 503 `NATIVE_RELEASE_UNAVAILABLE`。

这证明请求进入了不同分支，但服务器可能在完整签名验证之前检查 release availability。因此当前没有严格证据证明 legacy signer 已适配 generation `2026071502`。

### 6.3 Unidbg Windows backend 崩溃

Java 17 和 Java 26 都出现过：

```text
EXCEPTION_ACCESS_VIOLATION
Problematic frame: unicorn_java.dll
```

Java 17 已执行到：

```text
APK certificate SHA-256 JNI 流程
bridge certificate helper
JNI_OnLoad return
bridge loaded
```

但尚未稳定执行完整 attest、prepare activation、activate、self-test 和 sign。

### 6.4 `NukeHarness.activate()` 传入空 proof

当前代码调用：

```text
nativeActivateEngine(fd, path, generation, kid, null)
```

真实 APK 流程是：

```text
proof = nativePrepareActivation(payload, signature)
nativeActivateEngine(fd, path, generation, kid, proof)
```

这是当前 harness 最明确的逻辑缺口之一。

### 6.5 诊断 hook 改变了控制流

`NukeHarness.java` 当前存在：

- 强制 bridge certificate helper 返回成功的断点。
- 强制 JNI_OnLoad 返回 `JNI_VERSION_1_6` 的断点。
- 对 `memcmp` 的 HookZz wrapper，在 module digest 比较时强制相等。

这些代码可用于定位问题，最终 native signer 验证时需要逐项移除或证明其只补齐 Android 环境。

## 7. `WeKit-reference/` 详细分析

### 7.1 目录定位

这是当前整理后的协议参考和可运行验证工程。业务代码主要分为：

1. Python 公开 update API 客户端。
2. Rust 注册、报告、REST crypto 和 legacy signer。
3. Android/JNI 接入样例。
4. 注册脚本、结果记录和技术文档。

当前目录体积较大的原因主要是 Rust `target/` 构建产物，不代表源码本身很大。

### 7.2 根文件

| 文件 | 说明 |
|---|---|
| `nuke_client.py` | 标准库 HTTP 客户端，已实现 update、manifest、package URL 构造；真实成功验证仅覆盖 update |
| `test_nuke_api.py` | update API 联网验收脚本 |
| `register_random.ps1` | 随机注册入口，进入 Rust crate 运行 example |
| `REGISTRATION.md` | 简版注册说明和当前 503 状态 |
| `README.md` | 工程入口和文档索引 |
| `MODIFICATIONS.md` | 清理、修改和验证记录 |
| `NUKE_1.0.2_REVERSE_REPORT.md` | URL、native release、crypto、签名和连接报告 |

### 7.3 Rust crate

位置：

```text
WeKit-reference/app/src/main/rust/wekit-native
```

`Cargo.toml` 依赖：

```text
jni
libc
reqwest blocking + rustls
serde
serde_json
```

crate 同时输出 `cdylib` 和 `rlib`，便于 Android JNI 和 host 测试复用。

### 7.4 `src/nuke_client.rs`

这是业务流程核心，包含：

- `ClientAuth`：用户、平台、时间戳、nonce、signature。
- `ReportEnvironment`：Android、设备、宿主、Xposed、SELinux 等环境字段。
- `PreparedRegistration`、`PreparedReport`：请求 body 和 canonical。
- `RegistrationResult`、`OneShotResult`：HTTP 与解密结果。
- `prepare_registration()`：生成明文注册 JSON。
- `canonical_payload_for_path()`：生成八行 canonical。
- `sign_prepared_registration*()`：调用 legacy signer。
- `send_prepared_registration*()`：发送真实 users 请求。
- `prepare_one_report()`：REST v3 加密 report。
- `send_prepared_report*()`：发送并解密成功响应。
- users -> report 的同步调用封装。

注册成功判定目前只接受：

```text
HTTP 201
HTTP 409 且 body 精确等于 CLIENT_USER_ALREADY_EXISTS
```

后续应检查真实 409 是否为 JSON 或带换行，避免判定过严。

### 7.5 `src/nuke_crypto/rest.rs`

实现 REST v3 envelope：

```text
REST_STREAM = nuke-client-stream-v3
REST_KID = d8e39774
```

主要入口：

```text
encrypt_json_bytes_with_iv()
encrypt_json_bytes()
decrypt_json_bytes()
```

其离线 native oracle 和 tamper/boundary 测试已经通过。

### 7.6 `src/nuke_crypto/sign.rs`

该文件恢复了 legacy signer 的：

- root 和 companion secret。
- signer nonce。
- inner header、inner record 和 header digest。
- packet filler。
- 18 步 scheduler。
- XOR、center-out、stride transforms。
- N0T3 MAC。
- lowercase hex 编码。

文件顶部已标注它是 legacy evidence。当前 generation 还绑定 bridge/module attestation，所以它不能单独作为云端 signer 已完成的证明。

### 7.7 `examples/register_random.rs`

每次运行会：

1. 生成 `wxid_` 加 14 位 `[a-z0-9]`。
2. 获取当前 UNIX 秒。
3. 生成 nonce。
4. 调用 `prepare_registration()`。
5. 采样 signer observations。
6. 生成 legacy signature。
7. 真实 POST `/api/client/users`。
8. 输出 body、generation、signature length 和服务器响应。

当前结果目录：

```text
WeKit-reference/app/src/main/rust/wekit-native/registration_results/
```

### 7.8 验证命令

```powershell
cd WeKit-reference
python .\test_nuke_api.py
.\register_random.ps1
```

```powershell
cd WeKit-reference\app\src\main\rust\wekit-native
cargo check --example register_random
cargo test --lib
```

## 8. `unidbg-reference/` 详细分析

### 8.1 目录现状

该目录不是完整可直接构建的 Unidbg 源码仓库。根 `pom.xml` 声明了：

```text
unidbg-api
unidbg-android
unidbg-ios
backend/dynarmic
backend/hypervisor
backend/kvm
backend/unicorn2
```

但当前实际仅保留 `unidbg-android/` 的 POM 和一组 test Java 示例，其他声明模块目录缺失。因此不应直接把根工程当成完整源码构建依赖。

### 8.2 版本关系

根 POM 标记：

```text
0.9.10-SNAPSHOT
```

而 `nuke_unidbg/pom.xml` 当前使用 Maven artifact：

```text
com.github.zhkl0228:unidbg-android:0.9.9
```

二者版本不同。当前 harness 实际运行的是解析到的 0.9.9 dependency，不是该目录中的 0.9.10-SNAPSHOT 源码。

### 8.3 可复用示例

`unidbg-android/src/test/java` 中值得参考的文件：

| 文件 | 用途 |
|---|---|
| `Android64Test.java` | ARM64 emulator 和 backend factory 对比 |
| `Signal64Test.java` | ARM64 signal 行为 |
| `ThreadTest.java` | Unicorn2 和线程调度示例 |
| `QDReaderJni.java` | Dynarmic JNI 模拟样例 |
| `JniDispatch64.java` | 64 位 JNI dispatch 和 backend 示例 |
| `TTEncrypt.java` | 常见 Android native 签名调用结构 |
| `MemoryTrackerTest.java` | 多 backend factory 配置 |

### 8.4 对当前问题的价值

后续 AI 应从这些示例复制明确的 backend factory 配置，分别尝试：

```text
Unicorn2Factory(true)
Unicorn2Factory(false)
DynarmicFactory(true)
```

当前目录缺少完整 backend module 源码，若要使用 Dynarmic，应通过正确 Maven dependency 或补齐完整上游源码，不要假设现有根 POM 可以直接构建。

## 9. `nuke_unidbg/` 详细分析

### 9.1 工程配置

`pom.xml`：

```text
Java release = 17
unidbg-android = 0.9.9
slf4j-reload4j = 2.0.16
mainClass = nuke.harness.NukeHarness
```

Java 17 已确认可运行编译和启动。Java 版本不是当前 native crash 的唯一原因。

### 9.2 `NukeHarness.java`

主要职责：

- 从 APK v2 signing block 提取 APK certificate bytes。
- 读取 `release.nkm` 的 module certificate。
- 模拟 ActivityThread、Application、PackageManager、PackageInfo、Signature、MessageDigest JNI。
- 映射 engine 虚拟路径到本地 engine 文件。
- 加载 `libnuke_bridge.so`。
- 调用 `nativeAttestModule()`。
- 打开 engine fd。
- 调用 `nativeActivateEngine()`。
- 查询 generation、configured、kid、selfTest。
- 调用 `nativeSignClientPayload()`。

当前关键问题：

- `activate()` 的 proof 参数为 `null`。
- `moduleCertificate` 被读取，但没有用于构造 activation proof。
- 当前默认 `main()` 传给 `sync()` 的只是 JSON 示例，不是完整八行 canonical；若真正执行 signer，必须改成完整 canonical。
- HookZz 和断点会改变真实控制流。

### 9.3 当前诊断 hook

```text
bridge offsets 0x2a60c、0x2aa00：强制 W0=1
bridge offset 0x24c58：强制 JNI_VERSION_1_6
libc memcmp：module digest 比较时强制返回相等
```

后续排查应先做最小 harness，不要一次启用全部 hook。

### 9.4 `EngineProbe.java`

直接加载 engine，查找导出符号：

```text
nuke_engine_get_api_v1
```

然后读取 0x88 字节 API function table，每 8 字节打印一个函数指针。它用于确认 engine 导出和 API 表布局，不处理 bridge attestation 和 activation。

### 9.5 崩溃证据

`hs_err_pid20812.log` 保存 Java 17 崩溃信息。问题帧位于：

```text
unicorn_java.dll
```

根目录还存在其他 Java 26/早期实验的 `hs_err_pid*.log`。分析时应以 Java 17 的 `nuke_unidbg/hs_err_pid20812.log` 为当前基准。

### 9.6 下一步修改重点

1. 新增 `nativePrepareActivation([B[B)[B` 调用。
2. 从在线 activation manifest 原样取得 payload/signature。
3. 将 proof 传给 `nativeActivateEngine()`。
4. 把 sync 输入改为完整 canonical。
5. 移除 HookZz memcmp，验证是否是 HookZz 触发 backend 崩溃。
6. 显式切换 Unicorn2/Dynarmic backend。
7. 每次只保留一个诊断 hook。

## 10. `nuke_probe/` 详细分析

### 10.1 作用

这是非常小的 Rust CLI，用于在不启动 Android/Unidbg 的情况下生成 users canonical 和 legacy signature。

它通过路径直接引用：

```text
WeKit-reference/app/src/main/rust/wekit-native/src/nuke_crypto/mod.rs
```

因此它不是独立复制的 crypto 实现，修改 WeKit-reference 的 crypto 会直接影响 probe。

### 10.2 参数

按顺序读取：

```text
user_id
platform，默认 WECHAT
timestamp
nonce
monotonic_millis
runtime_flags，默认 20800ea080215080
generation，默认 2026071502
```

输出：

```text
body
canonical_hex
signature
```

### 10.3 限制

- 使用 legacy root 和 companion secret。
- runtime flags 和 monotonic observations 由调用者提供。
- 不执行 bridge/module attestation。
- 不发 HTTP 请求。
- 适合生成可复现向量，不等于当前云端 signer。

### 10.4 构建产物

目录体积主要来自 `target/`。源码只有 `Cargo.toml` 和 `src/main.rs` 等少量文件。

## 11. `Nuke_1.0.2-jadx/` 详细分析

### 11.1 目录定位

该目录约 4376 个文件，分为：

```text
sources/
resources/
```

JADX 输出是反编译结果，不是原始 Kotlin/Java 源码。混淆类主要位于 `defpackage`。

### 11.2 `BuildConfig.java`

确认：

```text
backend URL
versionCode/versionName
build timestamp
module certificate digest
local bootstrap only = false
```

### 11.3 `NativeCrypto.java`

native 方法：

```text
nativeActivateEngine
nativeAttestModule
nativeConfDecrypt
nativeConfEncrypt
nativeConfKeyName
nativeEngineGeneration
nativeIsConfigured
nativeKid
nativePrepareActivation
nativeSelfTest
nativeSignClientPayload
```

`syncClient()` 会确保 native 配置可用，并在遇到 `NATIVE_UPDATE_REQUIRED:` 时尝试更新后重新签名。

### 11.4 `vl1.java`

在线 activation manifest 客户端与验证器。主要流程：

- GET `/api/client/native/manifest`。
- 支持 ETag/304。
- 限制 manifest 为 64 KiB。
- 验证 envelope `v/payload/signature`。
- 要求 signature 解码后为 64 字节。
- 调用 `nativePrepareActivation(payload, signature)`。
- 验证 sequence、releaseId、hash、length、generation、kid、ABI、版本和 publishedAt。
- 下载 `/api/client/native/releases/{releaseId}/package`。
- 校验 package 和 engine。

### 11.5 `am1.java`

负责 native release 生命周期：

- 检查和刷新在线 release。
- stage/commit release。
- 检查 activation proof 文件。
- 调用 `prepareModuleAttestationForActivation$app()`。
- 打开 engine ParcelFileDescriptor。
- 调用 `nativeActivateEngine(fd,path,generation,kid,proof)`。
- 确认 engine generation。

### 11.6 `vr1.java`

负责 client sync/report 数据构造。已确认它构造：

```text
userId
platform
report
```

并调用 `NativeCrypto.syncClient()`。响应解密失败时会记录 `Decrypt report response failed`。

当前 Rust `nuke_client.rs` 对 HTTP 层的 users -> report 顺序来自 engine 静态分析和现有实验，不要仅凭 JADX 中的单个方法片段重写整个流程。

### 11.7 `pt.java`

业务响应模型：

```text
userId
platform
status
identityGroup
title
server_time
```

普通用户条件：

```text
status = ACTIVE
identityGroup = NORMAL
```

### 11.8 使用建议

- 先读 JADX 理解逻辑。
- 对可疑控制流回到 Apktool Smali 验证。
- 不要把 JADX 调整后的行号当作原始源码行号。
- 对 native 行为以 JNI 声明、ELF 导出、汇编和运行观察交叉验证。

## 12. `native_analysis/` 详细分析

### 12.1 顶层文件

| 文件 | 大小 | 用途 |
|---|---:|---|
| `analyze_arm64_xrefs.py` | 3916 | 用 Capstone/pyelftools 查 AArch64 ADR、ADRP+ADD 对目标地址的引用 |
| `bootstrap.nkr` | 9339910 | APK 内 bootstrap container 副本 |
| `bridge_jni_onload.asm` | 28780 | bridge JNI_OnLoad 附近汇编证据 |
| `classes.dex` | 3789540 | APK DEX 副本 |
| `libnuke_bridge.so` | 1339568 | bridge 副本 |
| `libnuke_engine_2026071502_da53b572650c.so` | 10092280 | engine 副本 |
| `release.nkm` | 2468 | release metadata 副本 |
| `jadx/` | 反编译副本 | native 分析时使用的 JADX 输出 |

### 12.2 `analyze_arm64_xrefs.py`

功能：

- 读取 ELF `.text`。
- 从 `.eh_frame` 收集函数范围。
- 反汇编 AArch64 指令。
- 解析 `adr`。
- 解析五条指令窗口内的 `adrp + add`。
- 将命中地址归属到可能的函数范围。

使用形式：

```powershell
python .\native_analysis\analyze_arm64_xrefs.py ELF TARGET [TARGET ...] --window OFFSET
```

目标通常来自 engine/bridge 中 endpoint、header、generation、kid 或错误字符串的虚拟地址。

### 12.3 `bridge_jni_onload.asm`

用于核对 JNI_OnLoad、证书检查和 bridge 初始化控制流。它是汇编分析输出，不是恢复的 C/C++ 原始源码。

### 12.4 `jadx/`

这是针对同一 DEX 的分析副本，混淆包名可能显示为 `p000`，而主 JADX 目录显示为 `defpackage`。两份输出可交叉比较，但不要把它们当作两个不同 APK 版本。

### 12.5 后续 native 分析重点

- `nativePrepareActivation` 的 bridge JNI wrapper 和 proof 数据结构。
- `nativeActivateEngine` 对 proof、generation、kid 和 fd/path 的校验顺序。
- engine API table 中 signer 函数指针位置。
- `nativeSignClientPayload` 如何把 attestation/runtime state 注入 signer。
- 云端签名与 legacy packet 的差异字节区。

## 13. `Nuke_1.0.2-apktool/` 简单分析

Apktool 输出约 4546 个文件，主要包含：

```text
AndroidManifest.xml
apktool.yml
assets/
lib/
original/
res/
smali/
unknown/
```

用途：

- 用可读 manifest 核对组件和权限。
- 用 `smali/` 验证 JADX 反编译不可靠的控制流。
- 从 `assets/` 和 `lib/` 核对 APK 打包内容。
- `original/` 保留二进制 manifest 和签名相关元数据。

关键 Smali：

```text
smali/nuke/data/cipher/NativeCrypto.smali
smali/am1.smali
smali/vl1.smali
smali/vr1.smali
smali/pt.smali
```

## 14. `Nuke_1.0.2-bootstrap/` 简单分析

仅包含：

```text
release.nkm
lib/arm64-v8a/libnuke_engine_2026071502_da53b572650c.so
```

`release.nkm` 是带 certificate/signature 的 bootstrap release metadata。engine 是普通 ARM64 ELF，没有额外整文件加密层。保护重点是 release 签名、certificate attestation、hash/length 校验和运行时激活。

bootstrap payload 的 releaseId：

```text
fcf8fce6-4f45-448d-85ba-22d934052e4b
```

这个内置 releaseId 请求在线 package 当前返回 404，正常在线 releaseId 应从当前 manifest 获取。

## 15. `Nuke_1.0.2-extracted/` 简单分析

这是 APK 直接 ZIP 解包的最小原始结构，当前主要文件：

```text
AndroidManifest.xml
assets/nuke/native/bootstrap.nkr
lib/arm64-v8a/libnuke_bridge.so
```

用途：

- 保留 APK 内原始文件字节。
- 提取 bootstrap container。
- 提取 bridge ELF。
- 与 Apktool/JADX 输出核对，避免使用被工具转换过的文件进行 hash 验证。

## 16. 后续 AI 推荐执行顺序

1. 请求 `/api/client/native/manifest`，判断是否从 503 恢复为 200。
2. 若恢复，原样保存 payload/signature，不重新序列化。
3. 在 `NukeHarness` 增加 `nativePrepareActivation()` 调用。
4. 将真实 proof 传入 `nativeActivateEngine()`。
5. 把 `sync()` 输入改成完整八行 canonical。
6. 移除 HookZz memcmp，运行最小 bridge harness。
7. 显式尝试不同 backend factory。
8. 确认 `nativeIsConfigured/selfTest/kid/generation` 全部正确。
9. 获取 `nativeSignClientPayload()` 干净输出。
10. 立即用同一 timestamp、nonce、body、canonical 发送 users 请求。
11. 注册成功后为 report 使用新 timestamp/nonce 并重新签名。
12. 解密 report response，保存用户业务字段。

## 17. 不应重复的方向

- 不要再次使用固定目标 ID，源码和文档使用 `RANDOM_WXID` 或运行时随机值。
- 不要把 update 200 说成注册成功。
- 不要把当前 503 说成签名通过。
- 不要向 activate 传 `null` proof。
- 不要只签名 JSON body。
- 不要尝试不存在的公开 users/{id} 查询路径。
- 不要把 Rust legacy oracle 测试等同于 generation `2026071502` 云端认证。
- 不要混淆 APK certificate 和 module certificate。
- 不要把汇编、Smali 或 JADX 输出称为原始源码。

## 18. 完成任务时应保存的证据

建议为一次成功流程创建独立时间戳目录，保存：

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

最终 `summary.json` 应由真实响应生成，并包含：

```text
registrationSucceeded
registrationHttpStatus
userId
platform
status
identityGroup
title
server_time
isNormalUser
```

只有取得真实注册成功和解密后的业务响应，才能结束本任务。
