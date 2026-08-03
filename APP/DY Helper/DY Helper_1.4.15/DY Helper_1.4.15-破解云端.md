# DY Helper 云端授权机制破解分析

> 版本：DY Helper_1.4.15.apk
> 目的：分析 DY Helper 云端授权（Beta/捐赠资格）系统的信任模型与攻击面，供安全研究与逆向学习使用。本文只做机制分析，不包含可用于商业规避的完整破解工具。
> 前置阅读：[DY Helper_1.4.15-云端捐赠信息调用逻辑.md](DY Helper_1.4.15-云端捐赠信息调用逻辑.md)

---

## 一、信任模型

DY Helper 的授权系统是一个「服务端名单 + 客户端 native 校验」模型：

```
作者服务端
   │  生成 beta_users.json（uid / expire / dynamic_code_sign 签名）
   ▼
GitHub Raw（beta_users.json）
   │  nativeGetBetaListUrls() 提供地址，Java 层 OkHttp 下载
   ▼
native（libdy_protect.so）
   │  nativeRefreshSession(uid, json) 验签 + 过期检查 + 名单匹配
   ▼
通过 → opaque_ticket（本地缓存）→ 后续 nativeAllowXXX() 放行内测功能
```

信任的关键假设：

1. 名单来自 GitHub，且 `dynamic_code_sign` 无法伪造（服务端私钥签名）。
2. native 校验逻辑无法被分析/篡改（`libdy_protect.so` 混淆 + 运行时完整性检查）。
3. 通过后的 `opaque_ticket` 是 native 会话凭据，本地无法凭空构造。

**破解本质**：打破上述任一假设，让 native 层认为当前 UID 已获授权。

---

## 二、攻击面枚举

| # | 攻击面 | 位置 | 描述 |
| --- | --- | --- | --- |
| 1 | 名单 URL | `nativeGetBetaListUrls()` 返回值 | 可替换为自建服务器，诱导模块下载伪造名单 |
| 2 | 名单 JSON 校验 | `nativeRefreshSession(uid, json)` | native 对名单内容验签；若验签不严可注入自己的 UID |
| 3 | 名单下载层 | `AbstractC0976x9.m6536` → `C0963wx.m6407` | Java 层 OkHttp GET，可被 hook / 流量代理篡改 |
| 4 | native 返回值 | `nativeRefreshSession` / `nativeAllowXXX` / `nativeQueryUiState` / `nativeIsRuntimeTrusted` | Hook 返回固定"已授权"值 |
| 5 | 本地缓存 | `dyhelper_beta_uid_{uid}` 的 `opaque_ticket` | 若 native 不校验 ticket 内容而只看存在性，可伪造 |
| 6 | 运行时完整性 | `nativeIsRuntimeTrusted()` | 反 hook / 反调试 / 反 root 检测，可绕过以支持上面各 hook |
| 7 | 申请码通道 | `nativeCreateApplyPayload` / `nativeGetApplyKeyMaterial` | 生成提交给作者的申请载荷，分析加密可理解协议 |

---

## 三、破解路径分析（研究思路）

### 路径 A：替换云端名单（服务端伪造）

1. 自建 HTTP 服务器，托管一份自制的 `beta_users.json`。
2. 通过 Frida hook `nativeGetBetaListUrls()` 的返回值，把两个 URL 全部替换成自建地址。
3. 自制名单里加入目标 UID，`expire` 设为远期。
4. 难点：`dynamic_code_sign` 需要服务端私钥签名。若 native 用 **非对称公钥验签**，此路走不通（除非拿到私钥或找到验签绕过）；若 native 仅做 **哈希/对称 MAC** 且密钥能从 `libdy_protect.so` 中还原，则可本地伪造签名。

### 路径 B：Hook native 授权判定（客户端放行）

这是最直接、成功率最高的路径，因为 Java 层大量依赖 native 返回值：

- Hook `BetaNativeBridge.nativeAllowXXX()`（或封装方法 `m1282`~`m1295`）全部返回 `true`。
- Hook `nativeRefreshSession()` 返回 `"1\n<伪造ticket>\npassed"`，让 `m6535` 走"校验通过"分支并写缓存。
- Hook `nativeIsRuntimeTrusted()` 返回 `true`，保证上层 `m1299()` 不拦。
- Hook `nativeQueryUiState()` 返回 `"1\n..."`，让设置页显示已授权状态。

> 说明：native 内部若有独立的二次判定（如 `DYH_NATIVE_BETA_V2` 状态机）且不经过 Java 层，则需进一步分析 native 内部状态，见路径 C。

### 路径 C：本地会话缓存伪造（冷启动免 hook）

在路径 B 中把合法 `opaque_ticket` 写入 `dyhelper_beta_uid_{uid}` 偏好文件后：

- 下次启动走 `m6533 → nativeRestoreSession(uid, ticket)`，若 native 信任本地 ticket 则免网络校验。
- 需要验证 `nativeRestoreSession` 是否校验 ticket 的签名/时效。若 ticket 只是 native 会话的非对称 token，可长期复用；若绑定设备/时间，则需定期刷新。

### 路径 D：native 逆向还原验签逻辑

若需要真正"破解"而非 hook 层面放行：

1. 用 Ghidra / IDA 打开 `libdy_protect.so`（arm64-v8a），定位导出 `Java_com_example_dyhelper_beta_BetaNativeBridge_*`。
2. 还原 `nativeRefreshSession` 的验签分支：
   - 定位 `dynamic_code_sign` 解码（base64 → 字节）。
   - 判断验签算法：RSA/ECDSA（查公钥常量 00 02 / 30 81... 等 DER 结构）还是 HMAC/AES（查固定 key 表）。
   - 若为 HMAC 且 key 硬编码，即可本地签名任意名单（路径 A 打通）。
3. 还原 `nativeAllowXXX` 的状态判断，确认是否仅依赖 `beta_users` 名单，还是依赖服务端会话。

---

## 四、结论

- 最脆弱点是 **Java→native 的返回值边界**（路径 B）：模块内测功能开关几乎全部直接信任 `nativeAllowXXX()` 返回值，hook 该边界即可在客户端层面解锁。
- 真正"云端破解"（伪造合法名单、让所有客户端无需 hook 即授权）依赖还原 `libdy_protect.so` 中的验签算法；若为硬编码对称密钥，则可本地伪造名单（路径 A/D）。
- `opaque_ticket` 缓存为离线放行提供了可复制的载体（路径 C），是二次校验重点应覆盖的地方。
