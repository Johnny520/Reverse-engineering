# WCGlass.dylib 完整解密与源代码还原说明

## 结果概览

本次只处理 `WCGlass.dylib`。

| 项目 | 结果 |
|---|---|
| 格式 | Mach-O Universal/FAT 动态库 |
| 架构 | arm64、arm64e |
| 文件层加密 | 两个切片均为 `cryptid=0`，已经是明文 |
| SHA-256 | `76BA59A63BA3606753CDDD7C63C557D9A3765BAECB85FE3D1F39384E62227320` |
| Objective-C 实现类 | 78 个 |
| Objective-C 方法 | 1923 个 |
| ARM64 函数 | 5749 个 |
| 符号 | 454 个 |
| 导入函数桩 | 206 个 |

编译后的机器码不会保存原项目的局部变量名、注释、宏和工程配置。本结果通过以下三层共同还原：

1. Objective-C 类名、选择器、方法类型和原始 IMP 地址。
2. JEB 输出的关键函数高层 C 伪代码。
3. 覆盖全部 5749 个函数的精确 ARM64 指令源码。

## 目录结构

```text
WCGlass_restored/
├─ 01_jeb_decompiled_c/        全函数声明与地址索引
├─ 02_key_modules_jeb/         JEB 关键函数 C 伪代码
├─ 03_objc_source_all/         全部 Objective-C 类和方法源码骨架
├─ 04_exact_arm64_assembly/    全部函数的精确 ARM64 源码
├─ 05_clean_reconstruction/    人工去混淆后的核心实现
├─ 06_metadata/                字符串、符号、接口及分析证据
├─ 07_tools/                   可复现的解析与生成脚本
└─ WCGlass完整解密说明.md       本文档
```

## 文件夹和重要文件介绍

### `01_jeb_decompiled_c`

用于确认代码覆盖范围：

- `FunctionIndex.csv`：5749 个函数的起止地址、大小和统一名称。
- `AllFunctions.h`：全部函数的 C 声明。
- `README.md`：说明函数索引与精确汇编的对应关系。

### `02_key_modules_jeb`

JEB 原生反编译器生成的高层 C 伪代码：

- `01_0x2E4DD8_WCLGGlassPackage_decryptContainer.c`：主题容器解析、SHA-256 和 RSA-PSS 验签主流程。
- `03_0x2E5ECC_WCLGGlassPackage_importGlassData.c`：主题数据导入、落盘和索引更新。
- `04_0x2E727C_WCLGGlassPackage_decryptedPayloadForTheme.c`：读取并解密已安装主题。
- `06_0x2F198C_WCLGGlassStore_buildRequest.c`：请求密钥、Nonce 和 RSA 包装流程。
- `07_0x2F2C2C_AES256CBC_generic_helper.c`：AES-256-CBC 通用辅助函数。
- `08_0x2F3020_HMAC_SHA256_helper_store.c`：HMAC-SHA256 辅助函数。

其中 `sub_461C6C` 等名称属于导入桩，可在 `06_metadata/WCGlass_symbols.txt` 中查询真实符号。

### `03_objc_source_all`

面向阅读的 Objective-C 源代码树：

- `Classes/*.h`：恢复的类接口、类方法和实例方法。
- `Classes/*.m`：方法骨架、原始 IMP 地址和 Objective-C type encoding。
- `WCGlassRecovered.h`：聚合导入全部恢复类。
- `ClassIndex.md`：逐类列出方法数量和类地址。

重要类包括：

- `WCLGGlassPackage`：主题包格式、导入、解密和缓存。
- `WCLGGlassStore`：主题商店、网络请求、密钥及响应解密。
- `WCLGGlassTheme`：主题数据模型。
- `WCLGConfig`：功能开关与配置读取。
- `WCLGSettingsViewController`：设置界面。
- `WCLGHomeGroups`、`WCLGHomeGroupBar`：首页分组及胶囊界面。
- `WCLGSearchTabBarOverlay`：搜索与标签栏玻璃效果。

### `04_exact_arm64_assembly`

行为最精确的一层：

- `AllFunctions_arm64.s`：覆盖 5749 个函数的完整 ARM64 指令。
- `Classes/*.s`：按照 Objective-C 类与选择器分组的精确指令。
- `_objc_msgSend`、`_CCCrypt`、`_CCHmac`、`_SecKeyVerifySignature` 等导入调用已经标注。

当高层伪代码缺少类型时，以本目录中的寄存器参数、分支和调用为准。

### `05_clean_reconstruction`

人工清除匿名函数名、字符串初始化噪声和密码算法包装后的可读 Objective-C：

- `WCLGCryptoRecovered.h/.m`：
  - AES-256-CBC
  - PKCS#7 Padding
  - HMAC-SHA256
  - SHA-256
  - RSA-OAEP-SHA256 加密
  - RSA-PSS-SHA256 验签
- `WCLGGlassPackage_Recovered.m`：主题容器读取、元数据解析、验签、密钥派生和 AES 解密。
- `WCLGGlassStore_Recovered.m`：请求加密、响应验签和解密。

真实 `CCCrypt` 参数已经确认：

```text
algorithm = kCCAlgorithmAES
options   = kCCOptionPKCS7Padding
key       = 32 bytes
IV        = 16 bytes
```

`CCHmac` 使用 `kCCHmacAlgSHA256`，输出 32 字节。

### `06_metadata`

静态分析证据和原始数据：

- `WCGlass_report.txt`：Mach-O 头、架构、段、节、依赖和加密状态。
- `WCGlass_symbols.txt`：导入、导出及保留符号。
- `WCGlass_objc_interfaces.h`：直接从 runtime 元数据恢复的方法表。
- `WCGlass_objc_strings.txt`：类名、方法名、类型和 C 字符串。
- `WCGlass_sensitive_hits.txt`：加密、鉴权、密钥、主题和网络相关字符串。
- `WCGlass_crypto_disassembly_arm64.txt`：关键解密流程的带注释反汇编。
- `WCGlass_crypto_helpers_arm64.txt`：AES/HMAC 调用参数证据。

### `07_tools`

- `wcglass_unpack.py`：解析 FAT/Mach-O、符号、Objective-C 元数据和加密标志。
- `restore_wcglass_source.py`：生成类源码、完整汇编和人工清理代码。
- `JebDecompileTargets.py`：批量反编译关键函数。
- `JebExportWCGlass.py`：JEB 全量导出脚本。
- `JebScriptRunner.java`：Windows 下启动 JEB script-runner v2。

## 关键入口地址

| 地址 | 恢复名称 |
|---|---|
| `0x2E4DD8` | `WCLGGlassPackage +decryptContainer:themeId:wxid:signKey:glassMaster:error:` |
| `0x2E5CE8` | AES-256-CBC 解密辅助函数 |
| `0x2E5ECC` | `WCLGGlassPackage +importGlassData:wxid:signKey:glassMaster:iconURL:error:` |
| `0x2E727C` | `WCLGGlassPackage +decryptedPayloadForTheme:error:` |
| `0x2ED1F4` | HMAC-SHA256 主题辅助函数 |
| `0x2F198C` | `WCLGGlassStore -buildRequest:requestKey:nonce:` |
| `0x2F2C2C` | AES-256-CBC 通用辅助函数 |
| `0x2F3020` | HMAC-SHA256 商店辅助函数 |
| `0x2F3140` | `WCLGGlassStore -decryptResponse:requestKey:nonce:` |

## 推荐阅读顺序

1. `05_clean_reconstruction/README.md`
2. `05_clean_reconstruction/WCLGCryptoRecovered.m`
3. `05_clean_reconstruction/WCLGGlassPackage_Recovered.m`
4. `05_clean_reconstruction/WCLGGlassStore_Recovered.m`
5. `03_objc_source_all/ClassIndex.md`
6. 对照 `04_exact_arm64_assembly/Classes/` 核实精确实现
7. 使用 `06_metadata/` 核对字符串、符号与地址

## 完整性说明

- 两个架构切片均已确认是明文。
- 78 个 Objective-C 实现类和 1923 个方法均已恢复名称及地址。
- 5749 个 ARM64 函数均具有地址索引和精确指令正文。
- 核心密码算法、主题容器和主题商店流程已经生成为高层可读代码。
- 高层骨架、JEB 伪代码和精确汇编可以互相对照，避免仅依赖单一反编译结果。
