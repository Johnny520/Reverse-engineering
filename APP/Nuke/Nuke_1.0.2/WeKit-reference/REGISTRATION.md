# Nuke 注册调用

## 直接运行

在 PowerShell 中执行：

```powershell
cd WeKit-reference
.\register_random.ps1
```

脚本使用 `app/src/main/rust/wekit-native/examples/register_random.rs`，每次运行都会生成新的 `wxid_`（前缀后 14 位小写字母或数字），按 Nuke 1.0.2 的 canonical payload 生成 `X-Signature`，然后真实调用：

```text
POST https://www.guang233.com/api/client/users
```

请求体：

```json
{"userId":"RANDOM_WXID","platform":"WECHAT"}
```

认证头由 Rust 客户端自动填写：`X-Client-Id`、`X-Platform`、`X-Timestamp`、`X-Nonce`、`X-Native-Generation: 2026071502`、`X-Signature`。

## 当前实测结果

已实际生成并发送随机用户：

```text
wxid_hbigw8cwz1iak5
```

服务端响应：

```text
HTTP 503
code=NATIVE_RELEASE_UNAVAILABLE
message=Native release activation is unavailable
```

完整输出保存在：

```text
app/src/main/rust/wekit-native/registration_results/registration_20260802_214425.txt
```

这不是 `401 INVALID_SIGNATURE`。请求已经进入服务端的 native release 检查阶段；服务器当前没有可用的 activation manifest，因此注册结果暂时不会返回 `201`。待服务端恢复 native release 后，重复运行同一脚本即可重新注册。

## 编译检查

```powershell
cd WeKit-reference\app\src\main\rust\wekit-native
cargo check --example register_random
```

编译已通过。该注册入口不加载 APK、bridge 或 engine `.so`。
