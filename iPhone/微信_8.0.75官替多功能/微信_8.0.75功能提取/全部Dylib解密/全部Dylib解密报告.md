# IPA 内全部 `.dylib` 解密与源码恢复报告

- 原始 IPA：`微信_8.0.75官替多功能.ipa`
- 输出目录：`微信_8.0.75官替多功能\微信_8.0.75功能提取\全部Dylib解密`
- dylib 数量：18
- 所有文件均已提取，并生成 Objective-C 接口、符号表、字符串和完整 ARM64 反汇编。

## 总表

| IPA 内路径 | 输出名 | cryptid | 类 | 方法 | 符号 | 指令 |
|---|---|---:|---:|---:|---:|---:|
| `Payload/WeChat.app/000ThemeLab.dylib` | `000ThemeLab.dylib` | 0（明文） | 136 | 4653 | 1000 | 524639 |
| `Payload/WeChat.app/AFN.dylib` | `AFN_根目录.dylib` | 0（明文） | 295 | 6957 | 979 | 778768 |
| `Payload/WeChat.app/Frameworks/AFN.dylib` | `AFN_Frameworks.dylib` | 0（明文） | 269 | 6546 | 959 | 741975 |
| `Payload/WeChat.app/Frameworks/HBB9.1.2.dylib` | `HBB9.1.2.dylib` | 0（明文） | 0 | 456 | 754 | 3726681 |
| `Payload/WeChat.app/Frameworks/HBWechatHelper.dylib` | `HBWechatHelper.dylib` | 0（明文） | 109 | 5101 | 6914 | 6424126 |
| `Payload/WeChat.app/Frameworks/MiYou.dylib` | `MiYou.dylib` | 0（明文） | 77 | 3492 | 994 | 2870977 |
| `Payload/WeChat.app/Frameworks/MikotoHelper.dylib` | `MikotoHelper.dylib` | 0（明文） | 235 | 5560 | 801 | 15701402 |
| `Payload/WeChat.app/Frameworks/PKCWeChatTools.dylib` | `PKCWeChatTools.dylib` | 0（明文） | 139 | 7057 | 16501 | 683082 |
| `Payload/WeChat.app/Frameworks/ThemeBox.dylib` | `ThemeBox.dylib` | 0（明文） | 104 | 3985 | 452 | 3146591 |
| `Payload/WeChat.app/Frameworks/WCPureExtension.dylib` | `WCPureExtension.dylib` | 0（明文） | 46 | 1958 | 8194 | 3538193 |
| `Payload/WeChat.app/Frameworks/libJailedShim.dylib` | `libJailedShim.dylib` | 0（明文） | 0 | 0 | 44 | 8192 |
| `Payload/WeChat.app/Frameworks/libPineappleDylib.dylib` | `libPineappleDylib.dylib` | 0（明文） | 379 | 7101 | 44706 | 4822449 |
| `Payload/WeChat.app/Frameworks/libellekit.dylib` | `libellekit.dylib` | 0（明文） | 0 | 12 | 3195 | 27001 |
| `Payload/WeChat.app/Frameworks/wcplugins.dylib` | `wcplugins.dylib` | 0（明文） | 3 | 114 | 333 | 2858 |
| `Payload/WeChat.app/WCGlass.dylib` | `WCGlass.dylib` | 0（明文） | 115 | 3795 | 454 | 1144087 |
| `Payload/WeChat.app/WCRefine.dylib` | `WCRefine.dylib` | 0（明文） | 333 | 14785 | 1626 | 4939568 |
| `Payload/WeChat.app/XOS.dylib` | `XOS.dylib` | 0（明文） | 115 | 3135 | 494 | 522299 |
| `Payload/WeChat.app/libsubstrate.dylib` | `libsubstrate.dylib` | 无加密命令 | 0 | 0 | 127 | 16939 |

## 输出说明

- `原始已解密/`：全部 dylib 原始字节。
- `可读源码/<dylib>/ObjC接口恢复.h`：类与方法声明骨架。
- `可读源码/<dylib>/伪代码索引.c`：函数地址索引。
- `可读源码/<dylib>/反汇编_ARM64_完整.asm.gz`：完整反汇编。
- `可读源码/<dylib>/字符串_完整.txt.gz`：完整字符串。
