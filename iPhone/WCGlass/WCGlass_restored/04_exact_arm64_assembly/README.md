# ARM64 精确代码

- `AllFunctions_arm64.s`：覆盖 LC_FUNCTION_STARTS 中的 5749 个函数。
- `Classes/`：按 Objective-C 类和选择器分组的精确 ARM64 指令。
- 导入调用已尽量标注为 `_objc_msgSend`、`_CCCrypt`、`_CCHmac` 等真实符号。
