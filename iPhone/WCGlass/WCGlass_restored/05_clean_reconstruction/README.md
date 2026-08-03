# 人工清理后的核心源代码

本目录把反汇编中确认的算法和关键业务入口重写成可直接阅读的 Objective-C：

- `WCLGCryptoRecovered.*`：AES-256-CBC、HMAC-SHA256、SHA-256、RSA OAEP/PSS。
- `WCLGGlassPackage_Recovered.m`：主题容器解析、验签、密钥派生和解密。
- `WCLGGlassStore_Recovered.m`：请求加密、响应验签与解密。

其中密码算法参数来自真实调用参数；容器字段命名是依据选择器、字符串和调用顺序恢复的语义名称。
