# 月虹一键隐藏 v5.4.4 精确打包工程

这个工程只负责把原模块重新打包，并保证原 `main` 不发生任何字节变化。

## 构建

在 PowerShell 中运行：

```powershell
.\build_module.ps1
```

也可以双击或在命令行运行：

```cmd
build.cmd
```

输出：

- `dist/YH_YC-v5.4.4-exact.zip`
- `dist/build-manifest.json`

## 完整性保证

构建脚本在写 ZIP 前校验原始 `main`：

```text
E4F8A0B4A161E73BFC7A65DD5E0B9709700102EC6F9B962B9B84A366D06EA935
```

ZIP 生成后，脚本逐个读取 ZIP 内文件并与原模块逐文件核对 SHA-256。任何文件内容不同都会中止构建。

## 目录说明

- 原模块目录：`..\月虹一键隐藏v5.4.4`
- `recovered/`：脱壳、解密和审阅资料，不会写入模块 ZIP
- `dist/`：最终可刷入 ZIP 与构建清单

`main` 是已编译、UPX 压缩且经过控制流/字符串混淆的 AArch64 ELF。精确打包工程始终使用原始 ELF；可读源码恢复工作与精确打包分开保存，避免恢复过程改变原程序行为。

