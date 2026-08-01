# libfkw.so ELF 静态清单

本报告仅解析 ELF 文件结构、动态符号和字符串，不会装载或执行目标库。

## ELF 信息

- 文件：`libfkw.so`
- 大小：`1,557,976` bytes
- 类型：`ET_DYN`
- 机器：`EM_AARCH64`
- 入口：`0x2AB7C`
- 节区数量：`27`
- 动态符号数量：`779`
- 角色/授权相关 ASCII 字符串数量：`63`
- 可解码 UTF-8 字符串数量：`3795`

## 节区

| 名称 | 地址 | 文件偏移 | 大小 | 类型 |
|---|---:|---:|---:|---|
| `<unnamed>` | `0x0` | `0x0` | `0` | `SHT_NULL` |
| `.note.android.ident` | `0x238` | `0x238` | `152` | `SHT_NOTE` |
| `.note.gnu.build-id` | `0x2D0` | `0x2D0` | `36` | `SHT_NOTE` |
| `.dynsym` | `0x2F8` | `0x2F8` | `18720` | `SHT_DYNSYM` |
| `.gnu.version` | `0x4C18` | `0x4C18` | `1560` | `SHT_GNU_versym` |
| `.gnu.version_r` | `0x5230` | `0x5230` | `64` | `SHT_GNU_verneed` |
| `.gnu.hash` | `0x5270` | `0x5270` | `5548` | `SHT_GNU_HASH` |
| `.hash` | `0x681C` | `0x681C` | `6248` | `SHT_HASH` |
| `.dynstr` | `0x8084` | `0x8084` | `26045` | `SHT_STRTAB` |
| `.rela.dyn` | `0xE648` | `0xE648` | `39672` | `SHT_RELA` |
| `.rela.plt` | `0x18140` | `0x18140` | `4296` | `SHT_RELA` |
| `.rodata` | `0x19210` | `0x19210` | `14937` | `SHT_PROGBITS` |
| `.gcc_except_table` | `0x1CC6C` | `0x1CC6C` | `4384` | `SHT_PROGBITS` |
| `.eh_frame_hdr` | `0x1DD8C` | `0x1DD8C` | `9532` | `SHT_PROGBITS` |
| `.eh_frame` | `0x202C8` | `0x202C8` | `43188` | `SHT_PROGBITS` |
| `.text` | `0x2AB7C` | `0x2AB7C` | `1333588` | `SHT_PROGBITS` |
| `.plt` | `0x1704D0` | `0x1704D0` | `2896` | `SHT_PROGBITS` |
| `.data.rel.ro` | `0x175020` | `0x171020` | `13312` | `SHT_PROGBITS` |
| `.fini_array` | `0x178420` | `0x174420` | `16` | `SHT_FINI_ARRAY` |
| `.init_array` | `0x178430` | `0x174430` | `344` | `SHT_INIT_ARRAY` |
| `.dynamic` | `0x178588` | `0x174588` | `448` | `SHT_DYNAMIC` |
| `.got` | `0x178748` | `0x174748` | `720` | `SHT_PROGBITS` |
| `.got.plt` | `0x178A18` | `0x174A18` | `1456` | `SHT_PROGBITS` |
| `.data` | `0x17CFC8` | `0x174FC8` | `27912` | `SHT_PROGBITS` |
| `.bss` | `0x183CD0` | `0x17BCD0` | `39504` | `SHT_NOBITS` |
| `.comment` | `0x0` | `0x17BCD0` | `317` | `SHT_PROGBITS` |
| `.shstrtab` | `0x0` | `0x17BE0D` | `260` | `SHT_STRTAB` |

## 导出索引

- [动态符号 TSV](FkWeChat_1.2.6-libfkw-symbols.tsv)
- [角色、授权、注册与 API 相关字符串 TSV](FkWeChat_1.2.6-libfkw-strings.tsv)
- [全部 UTF-8 字符串 TSV](FkWeChat_1.2.6-libfkw-utf8-strings.tsv)
- [Dex2C 类索引到原生注册表 TSV](FkWeChat_1.2.6-libfkw-registration-table.tsv)
