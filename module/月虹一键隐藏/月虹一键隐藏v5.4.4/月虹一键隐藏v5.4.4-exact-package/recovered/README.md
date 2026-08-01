# main 已恢复源码

这里集中保存从原始 `main` 脱壳、解密和静态恢复得到的全部代码资料。恢复过程只读取原 ELF，不替换、不修补原 `main`。

## 全量代码

- `main.full.aarch64.asm`：整个 `.text` 段的 522,580 条 AArch64 指令，包含函数标签、直接调用目标和解密字符串注释
- `main.functions.tsv`：从 `.eh_frame` 恢复的 4,562 个函数边界
- `main.calls.tsv`：18,337 个直接调用及其目标
- `main.data_references.tsv`：已识别的解密字符串引用位置
- `main.decrypted_strings.h`：C/C++ 可直接读取的解密字符串地址表
- `decrypted_strings.tsv`：642 条混淆字符串的解密结果和原地址
- `unresolved_decrypt_calls.tsv`：仍需动态参数传播的解密调用清单

## 内嵌源码

- `embedded_sources/`：Bootloader、KernelSU 等完整内嵌脚本
- `source_fragments/`：APatch、Magisk、HMA 等解出的 Shell/配置源码
- `webroot.decoded.html`：完整解密 WebUI

## 复现工具

- `recover_main_source.py`：全量反汇编、函数边界、调用图、数据引用和内嵌源码导出器
- `recover_obfuscated_strings.py`：TUSI 混淆字符串恢复器
- `decode_webroot.py`：WebUI 解密器
- `elf_report.txt` / `plt_calls.txt`：ELF 与 PLT 证据
- `strings_ascii.txt` / `strings_utf16le.txt`：原始字符串清单

完整统计和文件入口见 `RECOVERY_INDEX.md`。

