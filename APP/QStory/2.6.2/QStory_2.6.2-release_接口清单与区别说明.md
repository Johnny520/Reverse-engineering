# QStory_2.6.2-release.apk 接口清单与区别说明

分析来源：

- 反混淆源码：`deobfuscated_qstory\sources`
- 主要 Retrofit 接口目录：`p348`
- 在线插件接口：`top\suzhelan\plugin\sdk\online\net\ApiService.java`
- 在线贴纸接口：`top\suzhelan\sticker\sdk\net\StickerApiService.java`

说明：

- `InterfaceC9062` 对应 GET。
- `InterfaceC9078` 对应 POST。
- `InterfaceC9063` 通常表示表单 POST。
- `InterfaceC9067` 表示 JSON Body。
- `InterfaceC9065` 表示表单字段。
- `InterfaceC9068` 表示 Query 参数。
- `InterfaceC9069` 表示 Path 参数。
- 以下测试只做普通 GET/POST/OPTIONS，不包含绕认证、爆破或后台数据库读取。

## 1. 三类域名区别

### qstory.suzhelan.top

Base URL：

```text
https://qstory.suzhelan.top
```

用途：

- QStory 主模块服务。
- 用户登录与身份信息。
- 更新检测。
- 支付/赞助查询。
- 公告。
- 开放群列表。
- 黑名单获取与踢人上报。

安全关注：

- 该域名包含高危黑名单踢人接口。
- 该域名包含用户信息上传接口。
- `queryBlacklist` 已实测可直接 GET 出服务器黑名单列表。

### plugin.suzhelan.top

Base URL：

```text
https://plugin.suzhelan.top/api/plugin/
```

用途：

- 在线插件市场。
- 插件列表、下载、评论、消息通知、插件上传。

注意：

- 这个域名不是 APK 中黑名单踢人接口的 Base URL。
- `https://plugin.suzhelan.top/api/plugin/user-v2/queryBlacklist` 实测 404。
- `https://plugin.suzhelan.top/api/plugin/user-v2/onKickBlacklist` 实测 404。

### sticker.suzhelan.top

Base URL：

```text
https://sticker.suzhelan.top/api/v1/
```

用途：

- 在线贴纸/表情包 SDK。
- 贴纸列表、详情、下载、搜索、标签、上传。

## 2. qstory 主模块接口

源码：

`deobfuscated_qstory\sources\p348`

### 2.1 用户登录与身份接口

源码：

`deobfuscated_qstory\sources\p348\InterfaceC8859.java`

| 方法 | 路径 | 参数 | 返回 | 作用 | 测试结果 |
|---|---|---|---|---|---|
| POST | `/user-v2/doLogin` | JSON Body：`uin` | `QSResult<C8800>` | 使用当前 QQ 号登录，返回 token | 空 JSON 实测 500，缺参数 |
| POST | `/user-v2/info` | 通常依赖 token/认证头 | `QSResult<C8799>` | 获取当前账号身份信息 | 无认证实测 401 |
| POST | `/user-v2/isLogin` | 通常依赖 token/认证头 | `QSResult<Boolean>` | 检查登录状态 | 空 POST 返回疑似加密/混淆文本 |
| POST | `/user-v2/refreshUserInfo` | 通常依赖 token/认证头 | `QSResult<C8799>` | 刷新用户身份资料 | 无认证实测 401 |
| POST | `/user-v2/commitLoginInfo` | JSON Body | `QSResult<String>` | 上传登录/设备/定位信息 | 无认证实测 401 |

`commitLoginInfo` 上传字段来自：

`deobfuscated_qstory\sources\p010\RunnableC6155.java`

```java
jSONObjectM10039.put("Uin", QQEnvTool.getCurrentUin());
jSONObjectM10039.put("Nickname", QQEnvTool.getCurrentAccountNickName());
jSONObjectM10039.put("Ip", pairM8323.first);
jSONObjectM10039.put("ClientCity", pairM8323.second);
jSONObjectM10039.put("Location", str);
jSONObjectM10039.put("Lt", "regularly");
C8865.m14507().m14496(jSONObjectM10039).execute();
```

字段区别：

- `Uin`：当前 QQ 号。
- `Nickname`：当前 QQ 昵称。
- `Ip`：客户端公网 IP 或网络检测结果。
- `ClientCity`：IP 解析城市。
- `Location`：位置字符串，存在时上传。
- `Lt`：位置类型，代码里写死 `regularly`。

### 2.2 更新接口

源码：

`deobfuscated_qstory\sources\p348\InterfaceC8860.java`

| 方法 | 路径 | 参数 | 返回 | 作用 |
|---|---|---|---|---|
| GET | `/update/valid` | Query：`version` | `QSResult<Boolean>` | 判断当前版本是否有效 |
| GET | `/update/getUpdateLog` | Query：`version` | `QSResult<List<UpdateInfo>>` | 获取更新日志 |
| GET | `/update/hasUpdate` | Query：`version` | `QSResult<HasUpdate>` | 检查是否有新版本 |

区别：

- `valid` 是版本有效性检查。
- `getUpdateLog` 是更新记录列表。
- `hasUpdate` 是是否需要更新。

### 2.3 支付/赞助接口

源码：

`deobfuscated_qstory\sources\p348\InterfaceC8861.java`

| 方法 | 路径 | 参数 | 返回 | 作用 |
|---|---|---|---|---|
| GET | `/pay-v2/queryOrderResult` | Query：`uin` | `QSResult<Boolean>` | 查询指定 QQ 号订单/赞助结果 |
| GET | `/pay-v2/getPayItemList` | Query：`uin` | `QSResult<List<PayItem>>` | 获取该 QQ 号可用支付/赞助项目 |

区别：

- `queryOrderResult` 只返回布尔结果。
- `getPayItemList` 返回支付项目列表。

### 2.4 开放群接口

源码：

`deobfuscated_qstory\sources\p348\InterfaceC8862.java`

| 方法 | 路径 | 参数 | 返回 | 作用 |
|---|---|---|---|---|
| GET | `/open/groups` | 无 | `QSResult<Map<String,String>>` | 获取公开群列表或群信息映射 |

### 2.5 公告接口

源码：

`deobfuscated_qstory\sources\p348\InterfaceC8863.java`

| 方法 | 路径 | 参数 | 返回 | 作用 |
|---|---|---|---|---|
| GET | `/notice/all` | 无 | `QSResult<List<Notice>>` | 获取全部公告 |
| GET | `/notice/last` | 无 | `QSResult<Notice>` | 获取最新公告 |

区别：

- `all` 返回列表。
- `last` 只返回最新一条。

### 2.6 黑名单与踢人上报接口

源码：

`deobfuscated_qstory\sources\p348\InterfaceC8864.java`

| 方法 | 路径 | 参数 | 返回 | 作用 | 测试结果 |
|---|---|---|---|---|---|
| GET | `/user-v2/queryBlacklist` | 无 | `QSResult<List<String>>` | 获取服务器黑名单 QQ 列表 | 实测 200，返回黑名单数组 |
| POST | `/user-v2/onKickBlacklist` | 表单字段 | `QSResult<Integer>` | 踢人后向服务器上报结果 | GET 实测 405，仅允许 POST；OPTIONS 未登录返回 401 |

`onKickBlacklist` 表单字段：

- `troop`：群号。
- `troopName`：群名。
- `operator`：执行踢人的当前 QQ 号。
- `operatorName`：执行者昵称。
- `uin`：被踢 QQ 号。
- `uinName`：被踢人昵称。
- `reason`：触发原因，例如 `onJoin` 或 `onMsg`。

已实测黑名单接口返回：

```text
GET https://qstory.suzhelan.top/user-v2/queryBlacklist
HTTP 200 OK
Content-Type: application/json
```

返回结构：

```json
{
  "code": 200,
  "msg": "success",
  "action": 0,
  "data": ["...QQ号列表..."],
  "expire": 12471,
  "queryTime": "1ms",
  "executionTime": "2ms"
}
```

安全区别：

- `queryBlacklist` 是拉取黑名单，是自动踢人的来源。
- `onKickBlacklist` 是执行踢人后的回传记录。

## 3. plugin 在线插件接口

源码：

`deobfuscated_qstory\sources\top\suzhelan\plugin\sdk\online\net\ApiService.java`

Base URL：

```text
https://plugin.suzhelan.top/api/plugin/
```

| 方法 | 路径 | 参数 | 返回 | 作用 |
|---|---|---|---|---|
| POST | `comment/add` | 表单：`pluginId`,`replyId`,`nickname`,`uin`,`content`,`ts`,`sign` | `QSResult<String>` | 添加插件评论 |
| GET | `plugins/files/{cloudId}` | Path：`cloudId` | 文件流 | 下载插件文件 |
| GET | `comment/get` | Query：`pluginId` | `QSResult<List<C9105>>` | 获取插件评论 |
| GET | `messages/list` | Query：`uin`,`page`,`pageSize` | `QSResult<C9102>` | 获取某 QQ 号插件消息列表 |
| GET | `plugins` | Query：`uin`,`sort`,`tag` | `QSResult<List<C9099>>` | 获取在线插件列表 |
| GET | `tags` | 无 | `QSResult<List<String>>` | 获取插件标签 |
| GET | `messages/unread-count` | Query：`uin` | `QSResult<Integer>` | 获取未读消息数量 |
| POST | `messages/read-all` | 表单：`uin` | `QSResult<Map<String,Boolean>>` | 标记全部消息已读 |
| POST | `messages/read/{id}` | Path：`id`；表单：`uin` | `QSResult<Map<String,Boolean>>` | 标记某条消息已读 |
| POST | `upload` | multipart：插件文件、`uin`、`nickname` | `QSResult<String>` | 上传插件 |

区别：

- 这组接口服务“在线插件市场”，不是黑名单踢人模块。
- 涉及插件上传、下载、评论、站内消息。
- `messages/list`、`messages/unread-count` 会使用 QQ 号查询消息。
- `upload` 会上传插件文件，同时携带上传者 QQ 号和昵称。

## 4. sticker 在线贴纸接口

源码：

`deobfuscated_qstory\sources\top\suzhelan\sticker\sdk\net\StickerApiService.java`

Base URL：

```text
https://sticker.suzhelan.top/api/v1/
```

| 方法 | 路径 | 参数 | 返回 | 作用 |
|---|---|---|---|---|
| GET | `stickers/{id}/download` | Path：`id` | 文件流 | 下载贴纸包 |
| GET | `stickers/{id}` | Path：`id` | `StickerResult<OnlineStickerInfo>` | 获取贴纸详情 |
| GET | `stickers/` | Query：`page`,`pageSize`,`tag`,`sort` | `StickerResult<StickerListResponse>` | 获取贴纸列表 |
| GET | `tags/` | Query：`limit` | `StickerResult<List<TagInfo>>` | 获取贴纸标签 |
| GET | `stickers/search` | Query：`q`,`page`,`pageSize` | `StickerResult<StickerListResponse>` | 搜索贴纸 |
| POST | `stickers/upload` | multipart + Header：`X-Signature`,`X-Timestamp`,`X-Nonce` | `StickerResult<OnlineStickerInfo>` | 上传贴纸 |

上传字段：

- `archive`：贴纸归档文件。
- `cover`：封面。
- `title`：标题。
- `tags`：标签。
- `uin`：上传者 QQ 号。
- `nickname`：上传者昵称。
- `description`：描述。
- `author`：作者。

区别：

- 这组接口服务贴纸/表情库。
- 上传接口有签名头：`X-Signature`、`X-Timestamp`、`X-Nonce`。
- 与黑名单踢人链路无直接关系。

## 5. 已实测接口状态码区别

### plugin 错误地址

```text
OPTIONS https://plugin.suzhelan.top/api/plugin/user-v2/queryBlacklist
HTTP 404 NOT_FOUND

OPTIONS https://plugin.suzhelan.top/api/plugin/user-v2/onKickBlacklist
HTTP 404 NOT_FOUND
```

说明：`plugin.suzhelan.top/api/plugin` 不是黑名单接口 Base URL。

### qstory 黑名单地址

```text
GET https://qstory.suzhelan.top/user-v2/queryBlacklist
HTTP 200 OK
```

说明：可直接返回服务器黑名单数组。

### qstory 踢人上报地址

```text
GET https://qstory.suzhelan.top/user-v2/onKickBlacklist
HTTP 405 Method Not Allowed
allow: POST
```

说明：只能 POST。

### qstory 用户信息接口

```text
POST https://qstory.suzhelan.top/user-v2/info
HTTP 401 Unauthorized
{"code":401,"msg":"请先登录","action":0}
```

说明：需要登录 token 或认证头。

### qstory 刷新用户信息接口

```text
POST https://qstory.suzhelan.top/user-v2/refreshUserInfo
HTTP 401 Unauthorized
{"code":401,"msg":"请先登录","action":0}
```

说明：需要登录 token 或认证头。

### qstory 上传登录信息接口

```text
POST https://qstory.suzhelan.top/user-v2/commitLoginInfo
HTTP 401 Unauthorized
{"code":401,"msg":"请先登录","action":0}
```

说明：存在上传入口，但无认证不能提交/查询。

### qstory 登录接口

```text
POST https://qstory.suzhelan.top/user-v2/doLogin
Body: {}
HTTP 500 Internal Server Error
```

说明：空 JSON 缺少必要字段，源码显示至少会提交 `uin`。

## 6. 风险优先级

最高风险：

1. `GET /user-v2/queryBlacklist`
   - 直接提供服务器黑名单。
   - 本地回调会赋值给 `AbstractC8802.f24775`。

2. `POST /user-v2/onKickBlacklist`
   - 踢人后上报。
   - 上传群号、群名、执行者 QQ、执行者昵称、被踢 QQ、被踢昵称、原因。

3. `POST /user-v2/commitLoginInfo`
   - 上传当前 QQ 号、昵称、IP、城市、位置等信息。

4. `POST /user-v2/info` / `refreshUserInfo`
   - 返回身份字段 `identity`。
   - `identity < 0` 会触发本地毁号逻辑。

中等风险：

- 在线插件接口可上传插件和携带 QQ 号昵称。
- 插件消息接口可以按 QQ 号查询消息，但具体是否鉴权需进一步在合法 token 下确认。

普通功能：

- 更新接口、公告接口、开放群接口、贴纸列表/搜索/下载接口。

## 7. 总结

接口按功能可分为：

- `qstory.suzhelan.top`：主模块、账号、身份、更新、黑名单、踢人上报，是本次安全风险核心。
- `plugin.suzhelan.top/api/plugin`：在线插件市场，不是黑名单接口。
- `sticker.suzhelan.top/api/v1`：贴纸/表情服务。

本次最关键的区别是：别人给出的 `plugin.suzhelan.top/api/plugin/user-v2/...` 路径不是 APK 中黑名单接口实际地址，实测 404；APK 实际使用的是 `qstory.suzhelan.top/user-v2/...`。
