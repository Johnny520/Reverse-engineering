# QStory_2.6.3-release.apk 完整解密深度分析报告

分析对象：`QStory_2.6.3-release.apk`

SHA256：`783F2E8B82F6EDFE812936911C1D3916A897D57C0F8D0CE712DEA7A66ADBEF86`

MD5：`ED69CA5BA550AF2E413867A26761E3A6`

反编译与解密产物：

- JADX：`analysis_jadx`
- apktool/smali：`analysis_apktool`
- 解密字符串表：`deobfuscated_qstory\m13972_strings.tsv`
- 行内加密字符串表：`deobfuscated_qstory\m13973_inline_all_sources.tsv`
- 重点证据解密摘录：`deobfuscated_qstory\selected_evidence_annotated.md`

## 0. 总结结论

2.6.3 仍然存在高风险能力：上传账号与环境信息、Token 登录/身份校验、批量删好友、批量退群、Xposed 反射踢人/禁言、脚本插件执行、自动图片检测后禁言/踢人、MCP 本地服务配置。

但本次静态逆向没有发现 2.6.2 报告里的远程黑名单踢人链路复现：

`服务端 queryBlacklist -> 自动扫描管理群 -> onJoinTroop/onMessage 匹配 -> 自动踢人 -> onKickBlacklist 上报`

2.6.3 中未发现：

- `/user-v2/queryBlacklist`
- `/user-v2/onKickBlacklist`
- `AbstractC8802.f24775/f24774` 同类远程黑名单列表与管理群监控列表
- 硬编码“开发者 QQ 豁免号”形式的本地判断链

2.6.3 的主要新风险更偏向“功能危险性”和“隐私上传”：它保留了能操作 QQ 内部接口的能力，并且自动检测功能会调用外部图像接口，命中后自动禁言或踢人。

## 1. 字符串加密已解密

加密类：`p287/AbstractC8405.java`

发现两个核心方法：

- `m13972(int)`：按索引解密 `f23278[index]`
- `m13973(String)`：解密行内喵/呜编码字符串

解密密钥已恢复：`suzhelan`

本次生成：

- `m13972_strings.tsv`：3288 条索引字符串
- `m13973_inline_all_sources.tsv`：行内加密字符串与源码行号映射
- `selected_evidence_annotated.md`：关键危险代码的解密注释版摘录

## 2. 用户信息上传链路

文件：`p010/RunnableC6186.java:143-156`

代码把以下字段写入 JSON 后调用 `C8834.m14488().m14511(...).execute()`：

- `Uin`：当前 QQ 号
- `Nickname`：当前账号昵称
- `Ip`：IP
- `ClientCity`：客户端城市
- `Location`：定位字符串
- `Lt=regularly`：上传类型/标记

对应接口：`p348/InterfaceC8841.java:33-35`

`POST /user-v2/commitLoginInfo`

基础域名：`p345/C8834.java:41`

`https://qstory.suzhelan.top`

危险含义：应用会把账号与网络/位置类信息提交到开发者服务器。即使这是“登录信息同步”，从隐私角度仍应明确提示用户并提供关闭方式。

## 3. 所有主要接口差异

基础域名：`https://qstory.suzhelan.top`

### 用户接口

文件：`p348/InterfaceC8841.java`

- `/user-v2/doLogin`：登录，返回 Token 信息 `C8786`
- `/user-v2/info`：获取用户信息 `C8785`
- `/user-v2/isLogin`：检查登录状态
- `/user-v2/refreshUserInfo`：刷新用户信息
- `/user-v2/commitLoginInfo`：上传 UIN、昵称、IP、城市、位置等信息

### 更新接口

文件：`p348/InterfaceC8842.java`

- `/update/valid?version=...`
- `/update/getUpdateLog?version=...`
- `/update/hasUpdate?version=...`

### 支付接口

文件：`p348/InterfaceC8843.java`

- `/pay-v2/queryOrderResult?uin=...`
- `/pay-v2/getPayItemList?uin=...`

### 开放群与公告接口

文件：`p348/InterfaceC8844.java`、`p348/InterfaceC8845.java`

- `/open/groups`
- `/notice/all`
- `/notice/last`

### 插件上传接口

解密字符串中发现：

- `https://plugin.sacz.top/plugin-upload/readyToUpload`
- `https://plugin.sacz.top/plugin-upload/uploadFile`
- `https://plugin.sacz.top/plugin-upload/uploadInfo`
- `https://plugin.sacz.top/plugin-upload/confirmUploadStatus`

### 其它外部接口

- `https://search.linl.top/google/v2/imageContain`：自动图片检测使用
- `https://myip.ipip.net/json`：查询 IP/城市
- 多个 QQ/QZone/红包相关接口：用于红包、空间、图片下载等功能
- `http://localhost:9000/mcp`：MCP 本地服务配置

## 4. 自动图片检测后禁言/踢人

文件：`top/suzhelan/qstory/hook/item/C5913.java`

### 普通检测链

关键位置：`C5913.java:104-195`、`C5913.java:280-315`

逻辑：

1. 从消息对象读取 `peerUid`、`senderUin`、`msgId`、`getChatType`。
2. 判断发送者是否在检测名单 `c6438.f17635`。
3. 提取图片元素 `PicElement.md5HexStr`。
4. 拼接图片 URL：`https://gchat.qpic.cn/gchatpic_new/0/0-0-{MD5}/0`。
5. 调用 `https://search.linl.top/google/v2/imageContain` 检测图片。
6. 如果接口返回命中：前 2 次发送警告并 `QQNTTroopTool.shutUp(..., 3600L)` 禁言 1 小时；第 3 次发送提示后 `QQNTTroopTool.kickMember(..., false)` 踢人。

危险含义：这是自动化群管理执行链。只要本地配置包含对应群/用户，外部检测接口返回命中，就能触发禁言或踢人。

### 严格模式链

关键位置：`C5913.java:380-469`

逻辑类似，但使用 `c6434.f17623` 作为检测名单。命中后：

1. 给群内发送提示。
2. 给当前用户私聊发送被处理者信息。
3. 等待 2 秒。
4. 调用 `QQNTTroopTool.kickMember(str6, String.valueOf(j), true)` 踢人并拉黑/拒绝再次加群。

危险含义：严格模式命中即踢，且第三个参数为 `true`，通常表示踢出并阻止再次加入或加入黑名单类操作。

## 5. 默认检测群号与疑似账号数字

解密字符串中发现的主要 QQ/群号型数字：

- `2971017318`
- `638537273`
- `979938489`
- `2376738596`
- `114514`

逐项判断：

- `2971017318`、`638537273`：出现在 `需要检测群.json` 附近，是自动检测功能默认群号/检测配置，不是开发者豁免 QQ 号。
- `979938489`：出现在“脚本交流群(QQ)”上传须知文本中，是交流群号。
- `2376738596`：作为独立数字字符串出现，需要结合引用点继续确认用途；本次未发现它参与“踢人豁免”判断。
- `114514`：出现在 `C5918.java`、`CallableC5911.java` 的行内解密字符串中，更像占位值/哨兵值或 UI/At 消息默认值；未发现它构成 QQ 豁免判断。

本次没有找到形如：`if (userId.equals(某硬编码QQ)) return false;`，也没有找到“某硬编码 QQ 永不踢”的明确证据。

## 6. QQ 内部危险操作能力

这些能力不等于一定自动恶意执行，但它们给 APK 提供了高危操作面。

### 踢人与禁言

文件：`lin/xposed/hook/util/qq/QQNTTroopTool.java`

- `kickMember(String troopUin, String userUin, boolean reject)`
- `shutUp(...)`

调用点包括：

- `top/suzhelan/qstory/hook/item/C5913.java:194`
- `top/suzhelan/qstory/hook/item/C5913.java:315`
- `top/suzhelan/qstory/hook/item/C5913.java:468`
- `lin/xposed/hook/javaplugin/api/QQNTPluginMethod.java:618`

### 删除好友

文件：`lin/xposed/hook/util/qq/QQFriendTool.java`

- `deleteFriend(String uin)`

相关 UI/执行链：

- `lin/xposed/hook/view/main/itemview/ManageFriends.java`
- `p352/RunnableC8867.java`
- `p352/RunnableC8868.java`

### 退群

文件：`lin/xposed/hook/util/qq/QQNTTroopSettingTool.java`

- `quitGroup(String troopUin)`

相关调用：`p352/RunnableC8868.java:276`

危险含义：这些是直接改变 QQ 账号社交关系/群状态的能力，尤其在 Xposed 环境下通过反射调用 QQ NT 内部接口，普通用户很难直观看到真实执行路径。

## 7. 脚本插件执行风险

2.6.3 保留 BeanShell/脚本插件体系，相关类包括：

- `lin/xposed/hook/javaplugin/controller/PluginManager.java`
- `lin/xposed/hook/javaplugin/controller/AutoLoadPlugin.java`
- `lin/xposed/hook/javaplugin/api/QQNTPluginMethod.java`

`QQNTPluginMethod` 对脚本暴露多种 QQ 操作能力，包括发消息、获取群/好友信息、踢人等。即使官方上传须知中写了“请勿上传恶意脚本”，本地自动加载脚本仍然是高风险面。

## 8. MCP 本地服务配置

解密字符串：`m13972(2297)`

内容：`http://localhost:9000/mcp`

配置名：`QStoryMcp`

文件相关：`top/suzhelan/qstory/hook/item/mcp/config/C5871.java`、`C5872.java`

风险说明：本地 MCP 能力本身不等同后门，但如果外部脚本或插件可以调用本地 MCP，就可能形成“插件/脚本 -> 本地服务 -> QQ 操作”的扩展风险面。静态分析中未发现它连接远程服务器控制本机 MCP。

## 9. JADX 跳过方法复核

JADX 中存在较多 `Method dump skipped`，其中大量属于 Kotlin/Compose/第三方库。和 QStory/lin.xposed 业务相关的重点文件包括：

- `lin/xposed/hook/javaplugin/view/ViewOnClickListenerC5544.java`
- `lin/xposed/hook/util/qq/QQNTSendMsgUtils.java`
- `p012/C6220.java`：网络拦截/OkHttp 相关
- `p346/C8836.java`：网络/工具类
- `top/suzhelan/qstory/hook/item/C5918.java`
- `top/suzhelan/qstory/hook/item/C5927.java`
- `top/suzhelan/qstory/hook/item/C5954.java`
- `top/suzhelan/qstory/hook/item/NewAutoGrabHb$pares$1.java`
- `top/suzhelan/qstory/hook/item/mcp/config/C5871.java`

smali 层关键词复核结果：

- 在 QStory hook/item smali 中未命中 `queryBlacklist`、`onKickBlacklist`。
- 未发现硬编码 QQ 豁免链的直接关键词证据。
- 自动踢人/禁言的明确证据主要仍集中在 `C5913.java`，JADX 可读代码已经足够还原执行链。
- `C5918.afterHookedMethod` 被 JADX 跳过，smali 中确认存在该 hook 方法，但关键词扫描未把它归入远程黑名单/踢人上报链；可见部分更接近分享/跳转拦截。

## 10. 与 2.6.2 的核心差异

2.6.2 已确认链路：`请求开发者服务器黑名单 -> 自动扫描管理群 -> 监听进群/消息事件 -> 匹配踢人 -> 上报踢人结果`

2.6.3 本次分析结论：

- 没有发现 `queryBlacklist` 和 `onKickBlacklist` 接口。
- 没有发现服务器返回黑名单直接赋给本地踢人列表的链路。
- 没有发现自动扫描全部管理群并加入远程黑名单监控列表的同等实现。
- 仍有自动检测后踢人的链路，但来源是本地检测配置 + 外部图片检测接口，不是 2.6.2 的远程 QQ 黑名单。
- 仍有隐私上传、Token 登录、脚本插件、批量删友/退群/踢人能力。

## 11. 风险评级

高风险：

- 上传 UIN、昵称、IP、城市、位置到开发者服务器。
- Xposed 反射调用 QQ 内部接口踢人、禁言、删好友、退群。
- 自动检测命中后禁言/踢人。
- 脚本插件系统可暴露 QQ 操作能力。

中风险：

- 插件上传/在线脚本体系。
- MCP 本地服务配置。
- 更新/公告/支付接口依赖开发者服务器。

未确认风险：

- 2.6.2 远程黑名单后门链在 2.6.3 中未复现。
- 开发者硬编码 QQ 豁免号未找到明确证据。
- 服务器端实际保存了哪些个人数据，仅靠本地 APK 静态分析无法证明；本地只能证明客户端会提交哪些字段。

## 12. 建议

1. 不建议在主 QQ 账号或重要群管理账号上运行该 APK。
2. 如果必须测试，应使用隔离账号、测试群、无敏感通讯录的环境。
3. 阻断或监控以下域名：`qstory.suzhelan.top`、`plugin.sacz.top`、`search.linl.top`、`myip.ipip.net`。
4. 重点审计本地配置文件：`需要检测群.json`、插件自动加载配置、在线脚本缓存。
5. 后续若要证明服务器是否保存了你的数据，只能通过你自己的账号授权请求、抓包、服务端数据导出请求或法律/平台投诉渠道验证；不应尝试绕过认证获取后台数据。
