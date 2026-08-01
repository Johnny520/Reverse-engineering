# main 全量本地恢复索引

- 原始脱壳 ELF：`mokuai\月虹一键隐藏v5.4.4-analysis\main.unpacked`
- SHA-256：`A7C5C138DD90BDBC1A62E200C8BA1EC711C61CD0297D40A282DC4A5125CD78A5`
- 函数范围：`4562`
- AArch64 指令：`522580`
- 直接调用：`18337`
- 已回填字符串引用：`1896`
- 已解密字符串：`933`
- 拆出的嵌入源码：`6`

## 文件

- `main.full.aarch64.asm`：整个 `.text` 段的逐指令反汇编
- `main.functions.tsv`：来自 `.eh_frame` 的全部函数范围
- `main.calls.tsv`：直接调用关系与解密调用注释
- `main.data_references.tsv`：已恢复字符串的数据引用
- `main.decrypted_strings.h`：可由 C/C++ 引用的完整字符串地址表
- `embedded_sources/`：解出的完整嵌入脚本
- `source_fragments/`：解出的长 Shell/配置源码片段
- `webroot.decoded.html`：完整解密 WebUI
