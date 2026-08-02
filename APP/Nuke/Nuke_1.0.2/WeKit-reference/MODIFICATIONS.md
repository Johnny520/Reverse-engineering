# WeKit-reference 修改记录

## 目标

本目录从一个不完整的 WeKit 工程片段整理为 Nuke 1.0.2 最小参考项目。最终保留三类内容：

1. 可直接运行的纯 Python 后端测试。
2. 已恢复的 Rust REST v3 加解密和离线签名向量。
3. `Experiments2.kt` Android/JNI 接入样例。

Python 路径仅使用标准库，运行时不加载 APK、bridge 或 engine `.so`。

## 最终目录

```text
WeKit-reference/
├─ .editorconfig
├─ .gitignore
├─ nuke_client.py
├─ test_nuke_api.py
├─ README.md
├─ MODIFICATIONS.md
├─ NUKE_1.0.2_REVERSE_REPORT.md
├─ LICENSE
└─ app/
   ├─ .gitignore
   └─ src/main/
       ├─ java/dev/ujhhgtg/wekit/features/items/debug/
       │  └─ Experiments2.kt
       └─ rust/wekit-native/
          ├─ .gitignore
          ├─ Cargo.toml
          ├─ Cargo.lock
          └─ src/
             ├─ lib.rs
             ├─ nuke_client.rs
             └─ nuke_crypto/
                ├─ mod.rs
                ├─ ops.rs
                ├─ perm.rs
                ├─ prf.rs
                ├─ rest.rs
                ├─ sign.rs
                └─ tests_perm.rs
```

上图是交付源码视图，不列出 Git 元数据和已清理的 `target/`、`__pycache__/`
生成目录。

## 新增文件

### `nuke_client.py`

- 纯 Python 标准库实现。
- 默认连接 `https://www.guang233.com/`。
- 按 APK 的真实请求方式调用 `GET /api/client/update?versionCode=234`。
- 发送 `Accept: application/json`、`Cache-Control: no-cache`、`Pragma: no-cache` 和 `User-Agent: Nuke/1.0.2 Android`。
- 校验 HTTP 状态、外层 JSON、`success`、Base64 `data`、内层 JSON、`currentVersionCode` 和 `hasUpdate`。
- 暴露 users、report、native manifest、native package URL 构造方法，便于其他脚本复用。

### `test_nuke_api.py`

- 真实联网验收入口，不使用本地 mock。
- 成功时输出结构化 JSON 并返回退出码 `0`。
- HTTP、JSON、Base64 或字段校验失败时返回退出码 `1`。

### `register_random.ps1`

- 新增 PowerShell 注册入口。
- 自动进入 Rust crate 并运行 `register_random` 示例。
- 不加载 APK、bridge 或 engine `.so`。

### `app/src/main/rust/wekit-native/examples/register_random.rs`

- 新增可执行注册示例。
- 每次生成新的 `wxid_`（前缀后 14 位小写字母或数字）。
- 按当前 canonical payload 生成 `X-Signature`，并真实调用 `/api/client/users`。
- 输出用户 ID、generation、请求体、签名长度、HTTP 状态和服务端响应。

### `REGISTRATION.md`

- 新增注册调用文档，列出命令、请求体、认证头和结果文件位置。
- 明确记录当前服务端返回 `503 NATIVE_RELEASE_UNAVAILABLE`，该状态表示
  native release activation manifest 当前不可用。

### `app/src/main/rust/wekit-native/registration_results/`

- 新增注册尝试结果目录。
- 保存实际随机 ID、签名长度和 HTTP 响应，便于复核真实请求。

### 文档

- `MODIFICATIONS.md`：本次删除、保留、修改和验证记录。
- `NUKE_1.0.2_REVERSE_REPORT.md`：样本、目录、URL、native 容器、加密、签名和连接流程。

`.editorconfig`、根 `.gitignore`、`app/.gitignore` 和 Rust crate 的

## 修改文件

### `app/src/main/rust/wekit-native/src/nuke_client.rs`

- 新增 native generation `2026071502`。
- 请求头新增 `X-Native-Generation`。
- canonical 从 7 行更新为 8 行，generation 位于 nonce 和 body 之间。
- 应用版本更新为 `1.0.2`，version code 更新为 `234`。
- build time 更新为 `1785243782422`。
- Gson 可空字段按 `serializeNulls:false` 省略。
- `dirtySepolicy.markers` 更新为 `{hit, available, method}` 对象。
- `dirtySepolicy.detected` 更新为字符串数组。
- `xposedInjectionMode` 更新为 `unknown`。
- 测试期望同步到 Android 16/API 36 和 1.0.2 字段。
- 本地 HTTP 测试新增 `X-Native-Generation: 2026071502` 断言。

### `app/src/main/rust/wekit-native/src/lib.rs`

- 只保留 Nuke 模块、Nuke JNI 入口和 `JNI_OnLoad`。
- 删除音频、崩溃处理、Markdown 和贴纸相关 JNI。
- Nuke 模块改为公开模块，便于离线测试和引用。
- panic 捕获覆盖完整 Nuke 调用。

### `app/src/main/rust/wekit-native/src/nuke_crypto/sign.rs`

- 模块说明明确标记为旧 engine 的离线 oracle 证据。
- `DEFAULT_SIGNER_ROOT` 和 companion secret 明确标记为 legacy 材料。
- 注明 generation `2026071502` 的当前云端签名还绑定 bridge/module
  attestation，避免把 42 个离线测试写成当前签名验证成功。

### `app/src/main/rust/wekit-native/Cargo.toml`

- crate 类型保留 `cdylib`，增加 `rlib` 供 host test 使用。
- 依赖缩减为 `jni`、`libc`、`reqwest`、`serde` 和 `serde_json`。
- 删除音视频、GIF、Lottie、bindgen、C/C++ 构建依赖。
- `Cargo.lock` 已按精简后的依赖重新生成。

### `README.md`

- `README.md` 改为 Nuke 参考项目入口和运行说明，并显式区分公开 update
  探针与尚未通过的 users/report 认证路径。

### `Cargo.lock`

- 按精简后的 `Cargo.toml` 重新解析依赖；它是构建锁文件，不是逆向输入。

### 明确保留的非业务文件

`LICENSE` 保留上游许可文本；`.editorconfig` 和各级 `.gitignore` 保留格式及
生成物规则。这些文件不是 Nuke 实现，但属于可分发仓库的必要元数据。

## 验证记录

验证日期：`2026-08-02`（网络响应中的 `server_time` 见下）

### Python 语法与真实联网

```powershell
python -m py_compile nuke_client.py test_nuke_api.py
python test_nuke_api.py
```

环境：`Python 3.14.5`

实际结果：

```json
{
  "endpoint": "https://www.guang233.com/api/client/update?versionCode=234",
  "httpStatus": 200,
  "ok": true,
  "outerSuccess": true,
  "server": "nginx/1.22.1",
  "decodedData": {
    "currentVersionCode": 234,
    "hasUpdate": false,
    "forceUpdate": false,
    "latestVersionCode": 0,
    "latestVersionName": "",
    "downloadUrl": "",
    "updateContent": "",
    "server_time": 1785660394
  }
}
```

### Rust 离线向量

```powershell
cargo test --manifest-path app\src\main\rust\wekit-native\Cargo.toml
```

结果：`42 passed; 0 failed`。覆盖 REST envelope、MAC 篡改检测、边界长度、五段变换、PRF/permutation、signer packet 和本地 HTTP 往返。

## 当前边界

公开 update 接口已由纯 Python 实测通过。`POST /api/client/users` 和 `POST /api/client/report` 还要求 1.0.2 当前 engine 的 module-attestation 绑定签名；保留的 `sign.rs` 可通过离线 native oracle，但对当前云端的结果仍是 `INVALID_SIGNATURE`。因此本次 Python 成功记录只对应真实 update API，不把认证上报写成成功。

当前 Rust 代码没有把旧 root/companion 冒充成 1.0.2 当前签名材料；当前
engine 的 root 解码器和运行态 companion 仍需动态 oracle 导出。仓库裁剪和
文档记录不等于 users/report 已取得业务成功响应。
