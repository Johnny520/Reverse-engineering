# DY Helper 云端捐赠信息(Beta 用户名单)调用逻辑

> 版本：DY Helper_1.4.15.apk
> 说明：DY Helper 的"内测功能"由云端 `beta_users.json` 名单控制，名单中记录的用户即通过捐赠/赞助获得 Beta 资格的用户。本文梳理从云端拉取该名单并完成校验的完整调用链。

---

## 一、云端数据源

| 项 | 内容 |
| --- | --- |
| 数据文件 | `beta_users.json`（约 104 KB） |
| 实际地址 | `https://raw.githubusercontent.com/yyhh73144-max/dyhelperUser/main/beta_users.json` |
| 获取方式 | 由 native 层 `nativeGetBetaListUrls()` 在运行时生成/解码 URL 数组，**Java 层无明文地址** |
| 数据结构 | `update_time`（名单更新时间）、`notice`（公告）、`beta_users[]`（名单数组） |

`beta_users[]` 中每个元素的字段：

```json
{
  "uid": "70008778893",
  "expire": "2029-12-31",
  "dynamic_code_sign": "Lf9HAU23/4d51bQ5RM...=="
}
```

- `uid`：获得 Beta 资格的抖音 UID。
- `expire`：资格到期时间。
- `dynamic_code_sign`：动态签名（base64），由服务端对名单内容签名，native 校验其合法性。

---

## 二、完整调用链

### 0. 入口总览

```
初始化/UI 触发
   │
   ▼
AbstractC0976x9.m6537(context)      ← 初始化（保存 context、绑定账号）
   │
   ▼
AbstractC0976x9.m6534(uid, cb)      ← 设置页触发刷新
   │  启动 "DY-Beta-Refresh" 线程
   ▼
AbstractC0976x9.m6535(uid)          ← 核心：拉取名单 + native 校验
   │
   ├── BetaNativeBridge.m1296()     nativeGetBetaListUrls()  取 URL 数组
   ├── m6536(url)                   OkHttp 下载名单 JSON
   ├── C0753r9.m5070(json)          保存 update_time / notice 公告
   ├── BetaNativeBridge.m1301()     nativeRefreshSession()    native 校验签名
   └── 校验通过 → opaque_ticket 写入 SharedPreferences
```

---

### 1. 初始化：`AbstractC0976x9.m6537(Context)`

调用方：`au1`、`ii0`、`RunnableC0748r4`、`C0834tg`(设置页)、`xe0` 等。

步骤：

1. 保存 `applicationContext` 到静态字段 `f12075`。
2. 初始化 `ui1`（PrefsManager）与 `C0753r9`（公告通知，`getSharedPreferences("dyhelper_beta_notice")`）。
3. 调用 `BetaNativeBridge.m1299()`（`nativeIsRuntimeTrusted()`，native 运行环境完整性检查）。
4. 读取当前抖音账号 UID（`ui1.m5890()`）；若 UID 有效且非 "0"，调用 `m6533(uid, "init")` 绑定账号；否则调用 `BetaNativeBridge.m1302()`（`nativeReset()`）清空 native 状态。

### 2. 账号绑定与会话恢复：`AbstractC0976x9.m6533(uid, source)`

1. 若 UID 与当前已绑定 UID 不同，先 `BetaNativeBridge.m1302()` 重置 native。
2. 用 UID 生成偏好文件：`dyhelper_beta_uid_{sanitized_uid}`（只保留字母数字 `_` `-`，非法则用 "unknown"）。
3. 写 `__beta_schema_version = 3`、`__beta_account_uid = uid`（版本 < 3 时清空重建）。
4. 读取旧 `opaque_ticket`；若存在，调用 `BetaNativeBridge.m1303(uid, ticket)`（`nativeRestoreSession()`）尝试恢复 native 会话；恢复成功则保留，失败则删除该字段。

### 3. 手动刷新入口：`AbstractC0976x9.m6534(uid, callback)`

调用方：设置页（内测功能校验/申请界面）。

1. UID 非法（空或 "0"）→ 回调 `v9(ok=false, "UID invalid")`。
2. 用 `Set f12072` 去重（同一 UID 同时只能有一次刷新）。
3. 启动后台线程 `RunnableC0931w1`（线程名 `DY-Beta-Refresh`）执行刷新，完成后回调。

### 4. 核心：`AbstractC0976x9.m6535(uid)` —— 云端拉取 + native 校验

流程分解：

**a. 获取名单 URL**

```
BetaNativeBridge.m1296()   →  String[]  (nativeGetBetaListUrls 封装)
```

- native 不可用（`m1299()` 为 false）→ 返回 `v9(ok=false, "native URL unavailable")`。
- 数组长度 < 2 → `v9(ok=false, "native URL unavailable")`（主 + 备用共 2 个 URL）。

**b. 下载名单 JSON：`AbstractC0976x9.m6536(url)`**

- 使用 `C0963wx.m6407(url, headers)`（OkHttp GET，Header 固定 `Cache-Control: no-cache`，返回体按 `application/json` 解码为字符串）。
- 去掉响应中的 UTF-8 BOM `﻿`。
- 抓取失败 → 返回空串并记日志 `"fetch beta list failed: ..."`。

**c. 主/备 URL 选择**

- 先抓 `urls[0]`，解析为 JSONObject 并检查是否存在 `beta_users` 数组：
  - 存在 → 使用该内容。
  - 不存在 / 非 JSON → 抓 `urls[1]` 作为备用。
- 两个都抓不到 → `v9(ok=false, "cannot connect server, please retry later")`。

**d. 保存公告**

```
C0753r9.m5070(json)
```

- 解析 `update_time`、`notice` 字段，写入 `dyhelper_beta_notice` SharedPreferences 并展示。

**e. 交给 native 校验：`BetaNativeBridge.m1301(uid, json)` → `nativeRefreshSession(uid, json)`**

- native 对名单内容（含 `dynamic_code_sign` 签名）与当前 UID 做校验（校验签名合法性、`expire` 是否过期、UID 是否在名单中）。
- 返回字符串按 `\n` 分割：
  - 首元素 `"1"` → 校验通过；第 2、3 个元素为 `opaque_ticket` 及说明。
  - 首元素 `"0"` → 拒绝（返回拒绝理由，如 "denied"）。

**f. 结果处理**

- 通过且账号未切换 → 写 `opaque_ticket` 到 `dyhelper_beta_uid_{uid}` 偏好文件 → `v9(ok=true, "native verification passed")`。
- 账号已切换 → `nativeReset()` → `v9(ok=false, "current account changed, please retry")`。
- 拒绝 / 失败 → 移除缓存 ticket、`nativeReset()`，返回拒绝理由。

### 5. 功能开关：`m6523` ~ `m6532`

内测功能开关（章节跳过、清爽模式、评论书签、删除会话、时长提醒、群申请、隐藏联系人、本地功能、宠物营地、宠物任务、火花、Tab 过滤、UI 表面、语音替换等）均为统一模式：

```
m6538() && BetaNativeBridge.nativeAllowXXX()
```

- `m6538()`：当前账号 UID 有效（非空、非 "0"）且已绑定（`f12078 == uid`）；若 UID 变了会先 `m6533` 重新绑定。
- `nativeAllowXXX()`：由 native 层结合当前会话/名单状态决定是否放行。

### 6. UI 状态查询：`m6539()`

```
BetaNativeBridge.m1300()  →  nativeQueryUiState()
```

返回形如 `1\nmessage` 的字符串，首元素 `"1"` 表示 UI 处于已授权状态，用于设置页顶部状态展示。

---

## 三、关键类 / 方法映射表

| 混淆类 | 角色 | 关键方法 |
| --- | --- | --- |
| `AbstractC0976x9`（x9） | 云端名单拉取 + Beta 状态机 | `m6537` 初始化 / `m6533` 绑定 / `m6534` 刷新入口 / `m6535` 核心 / `m6536` 下载 / `m6523-32` 开关 / `m6539` UI 状态 |
| `BetaNativeBridge` | native 保护桥 | `m1296`=nativeGetBetaListUrls / `m1301`=nativeRefreshSession / `m1303`=nativeRestoreSession / `m1302`=nativeReset / `m1300`=nativeQueryUiState / `m1299`=nativeIsRuntimeTrusted / `m1297`=AES 加密申请载荷 / `m1298`=生成申请码 |
| `C0963wx`（wx） | OkHttp 网络封装 | `m6407` GET 文本 / `m6406` GET 字节流 |
| `C0753r9`（r9） | 公告（notice）解析与展示 | `m5070` 保存 notice / `m5069` 初始化 |
| `RunnableC0931w1`（w1） | 刷新线程体 | 内部调用 `m6535` |
| `C0834tg`（tg） | 设置页 UI | 调用 `m6537` 初始化、`m6534` 触发刷新 |

---

## 四、本地缓存位置

| 文件 | 字段 |
| --- | --- |
| `dyhelper_beta_uid_{uid}` | `__beta_schema_version`=3、`__beta_account_uid`、`opaque_ticket` |
| `dyhelper_beta` | 全局 Beta 偏好（`m6537` 创建） |
| `dyhelper_beta_notice` | `update_time`、`notice` 公告缓存 |

---

## 五、Native 保护要点

1. **名单 URL 隐藏**：`beta_users.json` 的地址不在 Java 明文，由 `nativeGetBetaListUrls()` 在 `libdy_protect.so` 内生成/解码。
2. **签名校验**：`nativeRefreshSession()` 校验 `dynamic_code_sign`（服务端签名），防止本地篡改名单。
3. **运行时完整性**：`nativeIsRuntimeTrusted()` 在每次关键操作前检查环境（root / hook / 调试等）。
4. **申请载荷加密**：`nativeCreateApplyPayload` + `m1297` 使用 `AES/CBC/PKCS5Padding`（key 32B + IV 16B，URL-safe Base64），用于向作者提交申请码。
5. **会话 opaque_ticket**：native 校验通过后签发，本地持久化，供下次免校验恢复会话。
