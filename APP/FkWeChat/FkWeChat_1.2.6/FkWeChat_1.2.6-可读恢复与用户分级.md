# FkWeChat 1.2.6 可读恢复与用户分级

## 可读恢复结果

| 层 | 可读产物 | 位置 |
|---|---|---|
| Java/Kotlin 接口与未保护实现 | 7,118 个 JADX Java 文件 | `FkWeChat_1.2.6-jadx\sources\` |
| Android 资源与清单 | 205 个解码资源文件 | `FkWeChat_1.2.6-jadx\resources\` |
| Dex2C 原生实现文本证据 | UTF-8 字符串、符号表、类索引至原生注册表 | `FkWeChat_1.2.6-libfkw-*.tsv` |
| 原生 ELF 结构 | ARM64 ELF 节区、779 个动态符号和 `JNI_OnLoad` | `FkWeChat_1.2.6-libfkw-elf-report.md` |
| 原始原生代码 | 未修改的 ARM64 ELF | `FkWeChat_1.2.6-extracted\lib\arm64-v8a\libfkw.so` |

重点业务类的 Java 声明位于 `FkWeChat_1.2.6-jadx\sources\me\yun\fkwechat\core\config\`。这些类的方法体被 Dex2C 转入 `libfkw.so`，而原生库中保留了对应的类名、方法名、请求路径、字段名、中文提示、JNI 注册表和 ARM64 指令。`FkWeChat_1.2.6-libfkw-utf8-strings.tsv` 提供了带 ELF 文件偏移的可读原文。

## 授权数据模型

`LicData` 是用户状态的唯一明确数据模型：

```kotlin
data class LicData(
    val verified: Boolean,
    val role: Int,
)
```

来源：`me\yun\fkwechat\core\config\LicData.java` 的 Kotlin 元数据与字段声明。

`AppMetadata` 负责保存和读取该状态，静态字符串表明其使用下列机制：

- 文件名：`.mm_sys_lic_data`
- 加密：`AES/CBC/PKCS5Padding`
- 完整性：`SHA-256` 和盐值 `FkWeChatAntiTamperSalt_2026_#`
- 时间字段：`timestamp`
- 缓存时限：`MAX_CACHE_AGE_MS = 43,200,000`，即 12 小时
- 发现时钟篡改、签名不匹配、活动镜像缺失或三镜像回滚时，授权缓存进入失效路径。

## 用户分级结论

### 黑名单用户

静态证据位于 `ControlManager.syncLicenseStatus` 的原生字符串区和对应的协程类：

```text
PUT https://cdn.yunpro.club/api/users/{wxid}/login-status
封禁提示
抱歉，您的账号已被加入黑名单，限制使用。
抱歉，您的微信账号已被加入黑名单，限制使用。
```

流程如下：

```text
微信 Activity 创建
  -> ControlManager.syncLicenseStatus(activity, uin, wxid)
  -> PUT /api/users/{wxid}/login-status
  -> 读取服务端角色状态
  -> 命中封禁状态时由 syncLicenseStatus$1$2 显示“封禁提示”
  -> 本地授权路径通过 applyLocalBlock / handleNetworkFallback 限制使用
```

黑名单状态的实际可见效果是弹出封禁提示并进入限制使用路径。包内不存在“黑名单后仍可用哪些插件功能”的白名单表；业务功能加载发生在 `LoaderCore` 的原生逻辑中。

### 普通用户

普通用户对应自助注册的普通通道，原生字符串给出以下直接证据：

```text
GET https://cdn.yunpro.club/api/settings
openRegistration
openNormalRegistration
normal
POST https://cdn.yunpro.club/api/register
```

普通通道的控制逻辑为：

1. 首次使用需要联网进行自助注册和授权激活。
2. 获取 `/api/settings` 后检查 `openRegistration` 与 `openNormalRegistration`。
3. 正常注册请求使用 `registerType` 值 `normal`。
4. 成功后写入 `LicData(verified, role)`，并在后续进入微信时通过 `login-status` 重新校验。

当普通注册通道关闭时，原生代码显示的提示为：

```text
正常注册通道未开启，暂无权限使用。
```

### 赞助用户/订单用户

该 APK 中没有 `sponsor`、`donation` 或 `vip` 作为用户角色文本；与“赞助用户”相对应的实现是订单注册通道。直接证据如下：

```text
openOrderRegistration
order
tradeNo
POST https://cdn.yunpro.club/api/register
```

订单用户与普通用户共用注册接口，但注册请求额外携带订单号字段 `tradeNo`，注册通道由 `/api/settings` 的 `openOrderRegistration` 决定。请求字段静态可见为：

```json
{
  "wxid": "...",
  "uin": "...",
  "name": "...",
  "registerType": "normal 或 order",
  "tradeNo": "..."
}
```

服务器完成注册后，同样以 `verified` 和整数 `role` 写入本地授权数据，并在 `login-status` 中进行后续刷新。

## 三类差异表

| 类别 | 触发条件 | 注册/状态接口 | 本地状态 | 用户可见结果 |
|---|---|---|---|---|
| 黑名单 | `login-status` 返回的服务端状态命中封禁路径 | `PUT /api/users/{wxid}/login-status` | 进入 `applyLocalBlock` 与封禁处理 | “账号已被加入黑名单，限制使用”提示，随后走限制使用路径。 |
| 普通用户 | `openRegistration` 与 `openNormalRegistration` 开启 | `POST /api/register`，`registerType=normal` | 保存 `verified`、`role` | 注册/激活成功后可通过状态校验；通道关闭时提示暂无权限。 |
| 赞助用户/订单用户 | `openOrderRegistration` 开启且具有 `tradeNo` | `POST /api/register`，订单注册类型 `order` | 保存 `verified`、`role` | 与普通注册共享授权保存和状态刷新，订单号是额外的请求输入。 |

## 已验证的边界

`role` 的数值到用户名称的映射表没有以枚举、常量或可读 JSON 形式出现在 APK 内。静态文件明确公开了：

- 角色载体是 `Int role`；
- 状态载体是 `Boolean verified`；
- 服务端负责 `login-status` 状态同步；
- 黑名单存在独立的封禁分支；
- 普通注册和订单注册具有独立的开关和请求类型。

静态扫描没有发现“赞助用户专属功能列表”或“普通用户功能禁用列表”。当前证据表明，权限判定首先是授权状态门控；具体 `role` 数值和服务端返回 JSON 的完整枚举由服务端决定，并未打包为本地可读常量。

## 证据文件

| 文件 | 用途 |
|---|---|
| `FkWeChat_1.2.6-libfkw-utf8-strings.tsv` | 黑名单提示、注册开关、接口、字段和离线授权提示的原始 UTF-8 字符串及文件偏移。 |
| `FkWeChat_1.2.6-libfkw-registration-table.tsv` | 43 个 Dex2C 类索引和 ARM64 原生注册入口；`ControlManager` 是索引 15。 |
| `FkWeChat_1.2.6-libfkw-symbols.tsv` | 779 个动态符号，包含 `JNI_OnLoad`。 |
| `FkWeChat_1.2.6-libfkw-elf-report.md` | `libfkw.so` 的 ELF64/AArch64 节区、符号和字符串报告。 |
| `FkWeChat_1.2.6-jadx\sources\me\yun\fkwechat\core\config\ControlManager.java` | 用户状态处理方法签名、协程类名和字段声明。 |
| `FkWeChat_1.2.6-jadx\sources\me\yun\fkwechat\core\config\AppMetadata.java` | 加密授权缓存的字段、12 小时时限和校验常量。 |
