# Nuke 1.0.2 模块文件夹说明

生成时间：2026-08-02

本文档说明 `D:\folder\codex\解密` 根目录下每个主要文件夹和关键文件的用途，方便后续继续逆向、测试或整理交付物。

## 根目录关键文件

| 路径 | 内容 |
|---|---|
| `Nuke_1.0.2.apk` | 原始 APK 样本，是所有解包、反编译和 native 分析的来源文件。 |
| `native_manifest_headers.txt` | 访问 native manifest 接口时保存的 HTTP 响应头记录。当前记录为 `503 Service Temporarily Unavailable`。 |
| `native_manifest_body.bin` | 访问 native manifest 接口时保存的响应体。内容是 JSON：`NATIVE_RELEASE_UNAVAILABLE`。 |
| `MODULE_FOLDERS.md` | 当前文档，说明每个模块目录的内容。 |
| `AI_HANDOFF.md` | 面向后续 AI 的总交接文档，包含问题、进度和各目录分析。 |
| `AI_CONTINUATION_GUIDE.md` | 面向后续 AI 的详细协议、实验状态和继续执行清单。 |

## `Nuke_1.0.2-extracted/`

APK 直接 ZIP 解包后的目录，保留 APK 内原始文件结构。

| 子路径 | 内容 |
|---|---|
| `AndroidManifest.xml` | APK 内原始二进制 manifest 解包结果。 |
| `assets/` | APK assets。关键文件在 `assets/nuke/native/bootstrap.nkr`，是内置 native release 容器。 |
| `lib/` | APK 自带 native so。关键文件是 `lib/arm64-v8a/libnuke_bridge.so`。 |

用途：确认 APK 原始打包内容、提取 bridge so 和 bootstrap 容器。

## `Nuke_1.0.2-apktool/`

Apktool 反编译输出，适合看资源、Smali 和重新打包相关结构。

| 子路径 | 内容 |
|---|---|
| `AndroidManifest.xml` | Apktool 解码后的可读 manifest。 |
| `apktool.yml` | Apktool 项目元数据。 |
| `assets/` | 解出的 assets，包含 native bootstrap 相关资源。 |
| `lib/` | 解出的 ABI native 库。 |
| `original/` | APK 原始签名、manifest 等保留数据。 |
| `res/` | Android 资源文件。 |
| `smali/` | Dalvik/Smali 代码，适合验证 JADX 反编译不准的位置。 |
| `unknown/` | Apktool 不识别但保留下来的文件。 |

用途：资源和 Smali 证据目录，不是最终代码目录。

## `Nuke_1.0.2-jadx/`

JADX Java 反编译输出，适合阅读 Java/Kotlin 逻辑和接口调用链。

| 子路径 | 内容 |
|---|---|
| `sources/` | Java 反编译源码。关键位置包括 `me/dartcv/nuke/BuildConfig.java`、`nuke/data/cipher/NativeCrypto.java`、`defpackage/sb.java`、`defpackage/vl1.java`、`defpackage/vr1.java`。 |
| `resources/` | JADX 解出的资源和 native 文件副本。 |

用途：确认后端 URL、版本号、native JNI 方法、update/native manifest 调用、报告 JSON 构造逻辑。

## `Nuke_1.0.2-bootstrap/`

从 `bootstrap.nkr` 解包得到的 native release 内容。

| 子路径 | 内容 |
|---|---|
| `release.nkm` | native release 元数据 envelope，包含 payload、certificate、signature。payload 内含 releaseId、generation、kid、engine 路径、engine SHA-256 和大小。 |
| `lib/arm64-v8a/libnuke_engine_2026071502_da53b572650c.so` | 当前 generation 的 ARM64 native engine。generation 为 `2026071502`，kid 为 `d8e39774`。 |

用途：研究 bridge 加载的真实 engine，以及 native release 签名/完整性校验结构。

## `native_analysis/`

native 分析工作目录，集中放 bridge、engine、DEX、副本和分析脚本。

| 子路径/文件 | 内容 |
|---|---|
| `jadx/` | 针对 native 分析过程中抽出的 DEX/JADX 输出副本。 |
| `analyze_arm64_xrefs.py` | AArch64 字符串/地址交叉引用分析脚本，用于定位 engine 中 endpoint/header 字符串的调用位置。 |
| `bootstrap.nkr` | 从 APK 提取的 native release ZIP/Deflate 容器副本。 |
| `bridge_jni_onload.asm` | bridge JNI_OnLoad 附近的汇编分析输出。 |
| `classes.dex` | APK DEX 副本。 |
| `libnuke_bridge.so` | APK 内 bridge so 副本。 |
| `libnuke_engine_2026071502_da53b572650c.so` | 解出的 engine so 副本。 |
| `release.nkm` | native release 元数据副本。 |

用途：做 native 字符串、函数、调用链和签名逻辑定位的主要工作区。

## `nuke_probe/`

Rust 独立探针工程，用来实验 canonical 和旧 signer packet。

| 子路径/文件 | 内容 |
|---|---|
| `Cargo.toml` | Rust 探针工程配置。 |
| `Cargo.lock` | Rust 依赖锁定文件。 |
| `src/main.rs` | 调用 `WeKit-reference` 中的 `nuke_crypto/sign.rs`，生成 `/api/client/users` canonical 和 signature。 |

## `nuke_unidbg/`

Unidbg/Maven 测试工程，用于尝试在本地模拟 Android native 调用。

| 子路径/文件 | 内容 |
|---|---|
| `pom.xml` | Maven 项目配置。 |
| `README.md` | 本测试工程说明。 |
| `src/` | Java/Unidbg harness 源码。 |

## `unidbg-reference/`

Unidbg 框架参考源码/依赖目录。

| 子路径/文件 | 内容 |
|---|---|
| `.git/` | Unidbg reference 的 Git 元数据。 |
| `unidbg-android/` | Android native emulation 相关模块。 |
| `pom.xml` | Maven 根工程。 |
| `mvnw`, `mvnw.cmd` | Maven wrapper。 |
| `README.md`, `LICENSE` | 上游说明和许可证。 |
| `test.cmd`, `test.sh` | 简单测试入口。 |

用途：给 `nuke_unidbg/` 或后续 native emulation 提供参考，不属于 Nuke APK 本身。

## `WeKit-reference/`

最终整理后的 Nuke 1.0.2 参考工程，已经删除无关 WeKit 功能代码。

| 子路径/文件 | 内容 |
|---|---|
| `nuke_client.py` | 纯 Python 标准库后端客户端。当前可真实调用 `GET /api/client/update?versionCode=234` 并解析 Base64 内层 JSON。 |
| `test_nuke_api.py` | 真实联网测试脚本。当前验证结果为 HTTP 200、`success=true`、`currentVersionCode=234`、`hasUpdate=false`。 |
| `register_random.ps1` | PowerShell 注册入口；进入 Rust crate 并运行随机注册示例，不加载 APK 或 `.so`。 |
| `REGISTRATION.md` | 注册调用说明、请求字段、认证头、实测响应和结果文件位置。 |
| `README.md` | 精简参考工程入口说明。 |
| `MODIFICATIONS.md` | 清理和修改记录。 |
| `NUKE_1.0.2_REVERSE_REPORT.md` | Nuke 1.0.2 后端 URL、native 包装、REST v3 加密、签名和连接流程报告。 |
| `app/src/main/java/dev/ujhhgtg/wekit/features/items/debug/Experiments2.kt` | Android UI/JNI 接入样例，用于完整 WeKit 中触发 Nuke sync。 |
| `app/src/main/rust/wekit-native/Cargo.toml` | 精简后的 Rust crate 配置，只保留 Nuke 相关依赖。 |
| `app/src/main/rust/wekit-native/Cargo.lock` | 精简依赖后的 Rust lockfile。 |
| `app/src/main/rust/wekit-native/src/lib.rs` | 最小 JNI 入口和 Nuke 调用封装。 |
| `app/src/main/rust/wekit-native/src/nuke_client.rs` | 注册体、报告体、headers、canonical、HTTP 顺序和响应解密参考。 |
| `app/src/main/rust/wekit-native/src/nuke_crypto/rest.rs` | REST v3 加密/解密实现。 |
| `app/src/main/rust/wekit-native/src/nuke_crypto/sign.rs` | 离线 signer oracle 参考。当前 1.0.2 云端 users/report 还需要 attestation 绑定的新 signer。 |
| `app/src/main/rust/wekit-native/src/nuke_crypto/prf.rs` | 自定义 PRF。 |
| `app/src/main/rust/wekit-native/src/nuke_crypto/perm.rs` | PRF 底层 permutation。 |
| `app/src/main/rust/wekit-native/src/nuke_crypto/ops.rs` | REST v3 使用的五段可逆变换。 |
| `app/src/main/rust/wekit-native/src/nuke_crypto/mod.rs` | config C3 envelope 和模块导出。 |
| `app/src/main/rust/wekit-native/src/nuke_crypto/tests_perm.rs` | permutation 测试向量。 |
| `app/src/main/rust/wekit-native/examples/register_random.rs` | 可执行 Rust 注册示例；生成随机 `wxid_`、构造 `/api/client/users` 请求、生成签名并真实发送 HTTPS 请求。 |
| `app/src/main/rust/wekit-native/registration_results/` | 注册尝试输出目录；保存随机 ID、签名长度、HTTP 状态和服务端响应，不是源码依赖。 |

用途：当前交付目录。继续写 Python、文档或 Rust 参考实现时优先在这里改。

## 目录关系速览

```text
Nuke_1.0.2.apk
├─ Nuke_1.0.2-extracted/      # 原始 ZIP 解包
├─ Nuke_1.0.2-apktool/        # Apktool/Smali/资源
├─ Nuke_1.0.2-jadx/           # Java 反编译
└─ Nuke_1.0.2-bootstrap/      # bootstrap.nkr 解包出的 engine

native_analysis/              # native 分析工作区
nuke_probe/                   # Rust signer 探针
nuke_unidbg/                  # Unidbg 实验工程
unidbg-reference/             # Unidbg 上游参考
WeKit-reference/              # 最终精简参考工程和 Python 测试
```

## 当前建议使用顺序

1. 查接口和 Java 调用链：看 `Nuke_1.0.2-jadx/`。
2. 查资源和 Smali 证据：看 `Nuke_1.0.2-apktool/`。
3. 查 bridge、engine 和 native 字符串：看 `native_analysis/`。
4. 查 engine release metadata：看 `Nuke_1.0.2-bootstrap/`。
5. 跑真实后端 Python 测试：看 `WeKit-reference/`。
6. 做 signer/native emulation 实验：看 `nuke_probe/`、`nuke_unidbg/` 和 `unidbg-reference/`。
