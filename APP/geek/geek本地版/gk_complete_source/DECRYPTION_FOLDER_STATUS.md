# gk.apk 文件夹解密情况说明

本文档说明 `gk.apk` 解密/反编译相关文件夹的用途、解密程度和建议查看顺序。

## 推荐查看顺序

1. `gk_complete_source/java_simple_decrypted`
   - 最推荐先看。它是 simple 模式反编译后的解密结果，可读性和完整性比较均衡。
2. `gk_complete_source/java_readable_decrypted`
   - 用来看包名、类结构和更接近普通 Java 的代码。
3. `gk_complete_source/java_fallback_full_decrypted`
   - 用来补查 readable/simple 里反编译失败的方法体。
4. `gk_complete_source/apktool_smali_full`
   - 最底层、最完整的 smali 版本，用来核对字节码真实性。

## 根目录文件夹状态

| 文件夹 | 状态 | 解密/反编译情况 | 建议用途 |
|---|---|---|---|
| `gk_complete_source` | 最终交付包 | 汇总了 readable、simple、fallback、smali 四份结果 | 优先使用 |
| `gk_apktool` | 原始 apktool 输出 | 完整资源和 smali，未做 Java 层字符串内联 | 核对原始字节码、资源、Manifest |
| `gk_jadx` | 原始 jadx 默认输出 | 未做 StringFog 内联；有较多控制流混淆失败 | 对照最初反编译状态 |
| `gk_jadx_decrypted` | 第一轮 readable 解密输出 | 静态 `u40.m2419a(...)` 已内联：835 组唯一字符串、846 处调用 | 历史中间产物 |
| `gk_jadx_decrypted_clean` | 第二轮 readable 解密输出 | 在 `gk_jadx_decrypted` 基础上又解了 22 处变量参数调用；`StringFog.decrypt()` 已还原 | readable 最终来源 |
| `gk_jadx_simple` | 原始 jadx simple 输出 | simple 模式未解密原始结果 | 对照 simple 解密前状态 |
| `gk_jadx_simple_decrypted_clean` | simple 解密输出 | 解密 2635 处 `u40.a(...)`；只剩 2 个 `Method not decompiled` | 最推荐源码来源 |
| `gk_jadx_fallback` | 原始 jadx fallback 输出 | fallback/register 风格，未完全内联字符串 | 对照 fallback 解密前状态 |
| `gk_jadx_fallback_decrypted` | fallback 第一轮中间输出 | 第一轮脚本未命中 fallback 命名形式，替换 0 处 | 历史中间产物 |
| `gk_jadx_fallback_decrypted_clean` | fallback 完整解密输出 | 解密 2142 处 fallback/register `u40.a(...)`；`Method not decompiled` 为 0 | 查完整方法体 |

## 最终包内部说明

### `gk_complete_source/java_simple_decrypted`

这是当前最推荐阅读的源码目录。

- 反编译模式：jadx `simple`
- Java 文件数：1493
- 字符串解密情况：
  - `u40.a(...)` 静态调用替换：2635 处
  - 唯一字符串对：2551 组
  - `u40_literal` 剩余：0
  - `b50_literal` 剩余：0
- 反编译失败：
  - `Method not decompiled` 剩余：2
  - 剩余位置：
    - `defpackage.ct.i(android.content.Context, android.content.res.Resources, int, java.lang.String, int)`
    - `defpackage.qs.onPreDraw()`
- 手工还原：
  - `com.ljx.wechatmod.auth.StringFog.decrypt()` 已从 smali 还原为干净 Java。

适合用途：主要阅读、搜索业务逻辑、查 Hook 流程。

### `gk_complete_source/java_readable_decrypted`

这是默认 jadx 输出基础上的可读版。

- 反编译模式：jadx 默认模式
- Java 文件数：1493
- 字符串解密情况：
  - 第一轮静态 `u40.m2419a(...)` 替换：846 处
  - 第二轮变量参数 `u40` 替换：22 处
  - `u40_literal` 剩余：0
  - `b50_literal` 剩余：0
- 反编译失败：
  - `Method not decompiled` 剩余约 413/415 处，主要来自控制流混淆。
- 手工还原：
  - `com.ljx.wechatmod.auth.StringFog.decrypt()` 已从 smali 还原为干净 Java。

适合用途：看正常 Java 结构、类名、包结构。遇到失败方法时切到 `java_simple_decrypted` 或 `java_fallback_full_decrypted`。

### `gk_complete_source/java_fallback_full_decrypted`

这是完整性最高的一份，但代码形态偏寄存器/伪源码。

- 反编译模式：jadx `fallback`
- Java 文件数：1493
- 字符串解密情况：
  - fallback/register `u40.a(...)` 替换：2142 处
  - 唯一字符串对：2068 组
  - `u40_literal` 剩余：0
  - `b50_literal` 剩余：0
- 反编译失败：
  - `Method not decompiled` 剩余：0

适合用途：补全 readable/simple 里失败的方法体。它不是最舒服的 Java，但没有方法体缺失。

### `gk_complete_source/apktool_smali_full`

这是完整 apktool/smali 输出。

- smali 文件数：1566
- 包含完整资源、Manifest、assets、原始 smali。
- 这里不是 Java 源码，但最接近 APK 实际字节码。
- `assets/protected_by_np/ApkControlFlowConfusion_8.0_88a94207145f483bb6d8b553b3b57a25.txt` 显示该 APK 使用了控制流混淆。

适合用途：当 Java 反编译结果不可信或不可读时，用 smali 核对真实逻辑。

## 残留调用说明

部分目录里还能搜到 `u40.a(...)` 或 `u40.m2419a(...)`，通常分为两类：

- 通用辅助函数：例如 `z30` 这类函数的参数由调用方传入，函数体里不能安全替换成固定字符串。
- 控制流混淆分支：同一变量可能经过多条分支赋值，保守脚本不会跨复杂分支强行替换，避免生成错误源码。

静态字面量形式的 `u40/b50` 调用已经清零。

## 结论

`gk.apk` 无法恢复成开发者原始工程源码，因为它经过混淆和控制流扁平化。当前目录提供的是尽可能完整的反编译/解密结果：

- 要读逻辑：看 `gk_complete_source/java_simple_decrypted`
- 要看结构：看 `gk_complete_source/java_readable_decrypted`
- 要查完整方法体：看 `gk_complete_source/java_fallback_full_decrypted`
- 要核对真实字节码：看 `gk_complete_source/apktool_smali_full`
