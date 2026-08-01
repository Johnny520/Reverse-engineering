## 后端服务器

| 服务器 | 作用 |
|---|---|
| `https://qstory.suzhelan.top` | QStory 主后端：更新、公告、用户 v2、支付、开放配置等 Retrofit 接口。 |
| `https://qstory.linl.top` | 旧版/兼容用户与等级后端：登录、用户信息、等级升级。 |
| `https://plugin.suzhelan.top/api/plugin/` | 新版在线插件市场后端。 |
| `https://plugin.sacz.top` | 旧版/兼容在线插件市场与插件上传后端。 |
| `https://sticker.suzhelan.top/api/v1/` | 在线表情/贴纸后端。 |
| `https://search.linl.top` | 图片内容识别/检测后端。 |
| `https://suzhelan.top` | 作者资源/网盘直链资源后端。 |

## `qstory.suzhelan.top` 主后端接口

Base URL: `https://qstory.suzhelan.top`

| 方法 | 接口 | 参数 | 作用 | 证据 |
|---|---|---|---|---|
| `POST` | `/user-v2/doLogin` | JSON body | 用户登录，返回登录态对象 `C9615`，包含 `loginId`、`isLogin`、`tokenValue`、`tokenHeader` 等字段。 | `sources/p364/InterfaceC9670.java` |
| `POST` | `/user-v2/info` | 登录态 Header/签名拦截器 | 获取当前用户信息，返回 `C9614`。 | `sources/p364/InterfaceC9670.java` |
| `POST` | `/user-v2/isLogin` | 登录态 Header/签名拦截器 | 检查当前登录状态，返回 Boolean。 | `sources/p364/InterfaceC9670.java` |
| `POST` | `/user-v2/refreshUserInfo` | 登录态 Header/签名拦截器 | 刷新用户资料/赞助身份信息，返回 `C9614`。 | `sources/p364/InterfaceC9670.java` |
| `POST` | `/user-v2/commitLoginInfo` | JSON body | 提交登录信息/设备信息，返回字符串结果。 | `sources/p364/InterfaceC9670.java` |
| `GET` | `/update/valid` | query: `version` | 判断当前版本是否仍可用/合法，返回 Boolean。 | `sources/p364/InterfaceC9671.java` |
| `GET` | `/update/hasUpdate` | query: `version` | 检查是否有新版本，返回 `HasUpdate`，包含是否强制更新、最新版本等。 | `sources/p364/InterfaceC9671.java; sources/lin/xposed/hook/view/main/itemview/Update.java` |
| `GET` | `/update/getUpdateLog` | query: `version` | 获取更新日志列表，返回 `List<UpdateInfo>`。 | `sources/p364/InterfaceC9671.java; sources/lin/xposed/hook/view/main/itemview/Update.java` |
| `GET` | `/update/download?version=` | query: `version` | APK/模块更新下载地址，应用检测到更新后打开该地址下载。 | `sources/lin/xposed/hook/view/main/itemview/Update.java` |
| `GET` | `/pay-v2/getPayItemList` | query: `uin` | 获取赞助/付费项目列表，返回 `List<PayItem>`。 | `sources/p364/InterfaceC9672.java` |
| `GET` | `/pay-v2/queryOrderResult` | query: `uin` | 查询某个用户订单/支付结果，返回 Boolean。 | `sources/p364/InterfaceC9672.java` |
| `GET` | `/open/groups` | 无 | 获取公开群组/开放群配置，返回 `Map<String,String>`。 | `sources/p364/InterfaceC9673.java` |
| `GET` | `/notice/all` | 无 | 获取全部公告，返回 `List<Notice>`。 | `sources/p364/InterfaceC9674.java` |
| `GET` | `/notice/last` | 无 | 获取最新公告，返回单个 `Notice`。 | `sources/p364/InterfaceC9674.java` |
| `POST` | `/user/info` | body 为空；Header 名和值来自本地 token 字段 | 身份校验接口；返回 JSON，校验 `code=200`、`data.identity`、`data.uin`，失败会提示身份校验不通过并退出。 | `sources/kotlin/reflect/jvm/internal/impl/descriptors/C5317.java` |

## `qstory.linl.top` 接口

| 方法 | 接口 | 参数 | 作用 |
|---|---|---|---|
| `POST/GET?` | `https://qstory.linl.top/user/login` | `android_id`, `device_id` | 旧版登录接口，和设备 ID 绑定，返回用户登录/令牌信息。 |
| `POST/GET?` | `https://qstory.linl.top/user/info` | token/用户信息 | 旧版获取用户信息接口；失败文本包含 `token error`、`用户信息获取失败`。 |
| `GET` | `https://qstory.linl.top/level/upgrade?uid={uid}&orderId={orderId}&orderTime={orderTime}` | `uid`, `orderId`, `orderTime` | 提交订单号与订单时间，用于等级/赞助身份升级。 |

## `plugin.suzhelan.top/api/plugin` 接口

| 方法 | 接口 | 参数 | 作用 |
|---|---|---|---|
| `GET` | `plugins` | `uin`, `sort`, `tag` | 获取在线插件列表，可按排序和标签过滤。 |
| `GET` | `plugins/files/{cloudId}` | `cloudId` | 下载插件文件。 |
| `GET` | `tags` | 无 | 获取插件标签列表。 |
| `GET` | `comment/get` | `pluginId` | 获取某插件评论列表。 |
| `POST` | `comment/add` | `pluginId`, `replyId`, `nickname`, `uin`, `content`, `ts`, `sign` | 新增插件评论/回复。 |
| `GET` | `messages/list` | `uin`, `page`, `pageSize` | 获取用户插件市场消息列表。 |
| `GET` | `messages/unread-count` | `uin` | 获取未读消息数量。 |
| `POST` | `messages/read-all` | `uin` | 将该用户全部消息标记为已读。 |
| `POST` | `messages/read/{id}` | `id`, `uin` | 将指定消息标记为已读。 |
| `POST multipart` | `upload` | `file`, `uin`, `nickname` | 上传插件文件。 |
| `GET` | `images/{cloudId}/{filename}` | `cloudId`, `filename` | 插件图片/封面访问地址模板。 |

## `plugin.sacz.top` 接口

| 方法 | 接口 | 参数 | 作用 |
|---|---|---|---|
| `GET` | `/plugin/get-online-plugin-list/{tagOrType}` | path | 旧版在线插件列表。 |
| `GET` | `/plugin/downloadPlugin?id={id}` | `id` | 下载旧版在线插件脚本/插件文件。 |
| `POST` | `/plugin-upload/readyToUpload` | 加密 JSON | 申请插件上传 token/准备上传。 |
| `POST` | `/plugin-upload/uploadFile` | Header: `token`; multipart | 上传插件文件内容。 |
| `POST` | `/plugin-upload/uploadInfo` | 加密 JSON | 上传插件信息/描述/作者等元数据。 |
| `POST` | `/plugin-upload/confirmUploadStatus` | Header: `token` | 查询/确认上传状态。 |

## `sticker.suzhelan.top/api/v1` 接口

| 方法 | 接口 | 参数 | 作用 |
|---|---|---|---|
| `GET` | `stickers/` | `page`, `pageSize`, `tag`, `sort` | 获取贴纸列表。 |
| `GET` | `stickers/search` | `q`, `page`, `pageSize` | 搜索贴纸。 |
| `GET` | `stickers/{id}` | `id` | 获取贴纸详情。 |
| `GET` | `stickers/{id}/download` | `id` | 下载贴纸资源包。 |
| `GET` | `tags/` | `limit` | 获取贴纸标签。 |
| `POST multipart` | `stickers/upload` | `X-Signature`, `X-Timestamp`, `X-Nonce`, `archive`, `cover`, `title`, `tags`, `uin`, `nickname`, `description`, `author` | 上传贴纸包。 |

## 其他自有/疑似自有后端

| 方法 | 接口 | 作用 |
|---|---|---|
| 未知 | `https://search.linl.top/google/v2/imageContain` | 图片内容识别/检测；与“龙图/猫图”识别逻辑相关。 |
| `GET` | `https://suzhelan.top/api/pan/direct/private/如果有人能懂我的忧郁.txt` | 下载作者私有资源文本；上下文为自定义文案/资源文件。 |