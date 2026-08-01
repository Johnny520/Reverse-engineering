# 原始 main 工具链指纹

- 格式：Android AArch64 ELF64 PIE
- 入口：ELF entry `0x94430`，通过 `__libc_init` 进入程序 `main`（`0x11C4E0`）
- Android API：21
- NDK：r26d，build `11579264`
- 编译器：Android clang `17.0.2`
- 链接器：LLD `17.0.0`
- 语言：原生 C++，libc++ / libc++abi 静态链接
- 混淆：`TUSI-ObscureTool 17.0.2Magic`
- 压缩：UPX `5.2.0`
- 动态依赖：`liblog.so`、`libz.so`、`libdl.so`、`libc.so`、`libm.so`
- Android 解释器：`/system/bin/linker64`

原始 `main` SHA-256：

```text
E4F8A0B4A161E73BFC7A65DD5E0B9709700102EC6F9B962B9B84A366D06EA935
```

脱壳 `main.unpacked` SHA-256：

```text
A7C5C138DD90BDBC1A62E200C8BA1EC711C61CD0297D40A282DC4A5125CD78A5
```
