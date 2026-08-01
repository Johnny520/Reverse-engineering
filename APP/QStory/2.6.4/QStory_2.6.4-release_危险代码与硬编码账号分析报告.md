# QStory 2.6.4-release 危险代码与硬编码账号分析报告

分析对象：`QStory_2.6.4-release.apk`

分析方式：apktool 静态反编译、smali 关键字搜索、喵/呜字符串表解密、native/so 字符串扫描。未运行 APK，未做服务器动态抓包。

## 结论摘要

1. 2.6.4 静态明文与已解密字符串中，未发现 2.6.2 报告里的 `/user-v2/queryBlacklist`、`/user-v2/onKickBlacklist` 两个接口。
2. 2.6.4 仍保留 `/user-v2/commitLoginInfo`，并确认会提交当前 QQ 号、昵称、城市/定位字段，以及 `commitInfo=regularly` 定期标记。
3. 2.6.4 仍存在高风险脚本/插件能力：获取 `pskey`、`pt4Token`、`GTK`，HTTP 请求，读取文件，动态加载 dex/jar/aar，群踢人、禁言、退群、删好友等。
4. 2.6.4 增强了字符串混淆与 native 反分析：`StringTamperGuard.decryptGuarded`、`isTampered`、`NativeCipherBridge.xorCipher` 均为 native 方法。
5. 暂未静态确认 2.6.2 那条“服务器黑名单 -> 自动扫描管理群 -> 自动踢人 -> 上报结果”的完整链条在 2.6.4 中仍存在。
6. 暂未静态确认 2.6.4 存在“硬编码豁免 QQ 号”。搜索明文、解密字符串、常见 QQ 号长度数字后，没有找到能和 2.6.2 豁免逻辑等价的证据。

## 字符串解密结果

2.6.4 使用了“喵/呜”字符串编码：

- `喵` = bit `0`
- `呜` = bit `1`
- `~` 分隔字节
- 字节再用循环 key `suzhelan` XOR 解密

证据：

- `QStory_2.6.4-analysis/decoded_miao_strings.tsv`
- `QStory_2.6.4-analysis/decoded_index_strings.tsv`

关键解密结果：

| 位置 | 解密值 | 含义 |
|---|---|---|
| `decoded_index_strings.tsv:2969` | `Nickname` | 登录信息上报字段 |
| `decoded_index_strings.tsv:2970` | `ClientCity` | 登录信息上报字段 |
| `decoded_index_strings.tsv:2971` | `Location` | 登录信息上报字段 |
| `decoded_index_strings.tsv:2972` | `commitInfo` | 登录信息上报字段 |
| `decoded_index_strings.tsv:2973` | `regularly` | 定期上报标记 |
| `decoded_index_strings.tsv:1020` | `blacklistTroop` | 红包配置黑名单字段 |
| `decoded_index_strings.tsv:1021` | `blacklistText` | 红包配置黑名单字段 |

## 登录信息上报

接口定义：

文件：`QStory_2.6.4-release_apktool/smali_classes2/飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲兰苏.smali`

- `:60` `/user-v2/doLogin`
- `:76` `/user-v2/info`
- `:92` `/user-v2/isLogin`
- `:108` `/user-v2/refreshUserInfo`
- `:130` `/user-v2/commitLoginInfo`

调用点：

文件：`QStory_2.6.4-release_apktool/smali_classes2/飘花落叶言世兰楪子哲苏/飘花落叶言子楪世哲兰苏.smali`

关键代码含义：

```smali
79:  invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;
87:  invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

92:  const/16 v2, 0xba0          # Nickname
104: invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentAccountNickName()Ljava/lang/String;
112: invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

150: const/16 v3, 0xba1          # ClientCity
166: invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

195: const/16 v2, 0xba2          # Location
207: invoke-virtual {v0, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

224: const/16 v2, 0xba4          # regularly
236: invoke-virtual {v0, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

250: invoke-interface {p0, v0}, ...->commitLoginInfo(JSONObject)
```

风险判断：该接口会把当前 QQ 号、昵称、城市/定位信息提交到远端登录体系。`commitInfo=regularly` 表明它不是单次手动提交，而是存在定期提交语义。

## 在线插件接口

基础地址：

- `top/suzhelan/plugin/sdk/online/net/PluginSdkConfig.smali:51`
- `https://plugin.suzhelan.top/api/plugin/`

Header 里会附带身份字段：

- `HeaderInterceptor.smali:125` 添加 `Uin`
- `HeaderInterceptor.smali:147` 添加 `Nickname`

接口定义：

文件：`top/suzhelan/plugin/sdk/online/net/ApiService.smali`

| 行号 | 接口 | 参数/用途 |
|---|---|---|
| `:393` | `tags` | 获取插件标签 |
| `:376` | `plugins` | `uin/sort/tag` 获取插件列表 |
| `:280` | `plugins/files/{cloudId}` | 下载插件文件 |
| `:307` | `comment/get` | 获取评论 |
| `:258` | `comment/add` | `pluginId/replyId/nickname/uin/content/ts/sign` 添加评论 |
| `:511` | `upload` | 上传插件文件，带 `uin/nickname` |
| `:340` | `messages/list` | `uin/page/pageSize` 拉取消息 |
| `:416` | `messages/unread-count` | 未读数 |
| `:477` | `messages/read/{id}` | 标记消息已读 |
| `:444` | `messages/read-all` | 全部已读 |

风险判断：在线插件体系本身不是后门的直接证据，但它具备远程下载、上传、身份绑定、消息接口能力。如果在线插件可被加载执行，风险取决于插件来源和权限隔离。

## 高风险脚本/插件能力

文件：`lin/xposed/hook/javaplugin/api/QQNTPluginMethod.smali`

确认存在的能力：

| 行号 | 方法 | 风险 |
|---|---|---|
| `:426` | `eval(String)` | 动态执行脚本 |
| `:461` | `forbidden(...)` | 群禁言/管理操作 |
| `:1100` | `getGTK(String)` | 获取 GTK |
| `:3199` | `getPT4Token(String)` | 获取 PT4Token |
| `:3214` | `getPskey(String)` | 获取 pskey |
| `:3831` / `:3842` | `httpGet(...)` | 任意 HTTP GET |
| `:4020` / `:4456` | `httpPost(...)` | 任意 HTTP POST |
| `:4741` | `kick(...)` | 踢群成员 |
| `:4888` | `loadDex(String)` | 动态加载 dex |
| `:4980` | `loadJar(String)` | 动态加载 jar |
| `:5426` | `readFileText(String)` | 读取本地文件 |
| `:5855` | `scanImageText(String)` | OCR 识图 |

底层 QQ 操作能力：

| 文件 | 行号 | 能力 |
|---|---:|---|
| `QQNTTroopTool.smali` | `2321` | `kickMember` 踢人 |
| `QQNTTroopTool.smali` | `3221` | `shutUp` 禁言 |
| `QQNTTroopTool.smali` | `3558` / `3773` | 全体禁言 |
| `QQNTTroopSettingTool.smali` | `19` | `quitGroup` 退群 |
| `QQFriendTool.smali` | `27` | `deleteFriend` 删除好友 |
| `Hook_cookie.smali` | `668` | `getPskey` |
| `Hook_cookie.smali` | `934` | `getPt4Token` |

风险判断：这些能力对 Xposed 模块来说非常高危。只要有不可信脚本/插件能调用这些 API，就可能造成账号凭据泄露、群管理动作、文件读取和远程通信。

## 踢人能力与 2.6.2 后门链差异

2.6.4 仍有 `kickMember` 调用：

- `飘花落叶言世哲兰楪子苏/飘花落叶言子楪世兰苏哲.smali:449`
- `飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏哲兰.smali:1006`
- `QQNTPluginMethod.smali:4745`

但静态搜索未发现 2.6.2 中的关键接口：

- `/user-v2/queryBlacklist`
- `/user-v2/onKickBlacklist`

也未发现等价的明确链条：

```text
请求服务器黑名单 -> 自动扫描管理群 -> 匹配黑名单 -> 自动踢人 -> 上报结果
```

当前能确认的是：

- 2.6.4 具备踢人能力；
- 2.6.4 具备插件回调分发能力；
- `PluginCallback.onJoinTroop` 会把入群事件分发给脚本插件，见 `PluginCallback.smali:333-389`；
- 但没有静态证据证明 2.6.4 内置了和 2.6.2 相同的服务器黑名单自动踢人逻辑。

## native 加密与反分析

确认存在：

- `top/suzhelan/qstory/util/StringTamperGuard.smali:83` native `decryptGuarded([B[B ClassLoader)[B`
- `top/suzhelan/qstory/util/StringTamperGuard.smali:110` native `isTampered(ClassLoader)`
- `top/suzhelan/qstory/nativelib/NativeCipherBridge.smali:74` native `xorCipher([B[B)[B`
- `System.loadLibrary("mqstory")` 相关加载存在
- 解密字符串确认 `qstory` native 库名存在

native/so 静态字符串扫描未发现：

- `queryBlacklist`
- `onKickBlacklist`
- `commitLoginInfo`

风险判断：native 解密和篡改检测会增加审计难度。当前静态 smali 能解出大量字符串，但仍不能排除 native 层运行时生成少量字符串或网络参数的可能。

## 硬编码账号/豁免 QQ 号

已执行搜索：

- 明文 smali 搜索常见 QQ 号长度数字；
- 搜索 `EXEMPT/exempt/豁免/白名单/whitelist/whiteList`；
- 搜索已解密字符串表；
- 搜索 2.6.2 中曾提到的常见占位/疑似账号关键词。

结果：

未找到可以确认是“开发者硬编码豁免 QQ 号”的证据。2.6.4 里不能沿用 2.6.2 的豁免结论，除非后续动态抓包或 native 深入分析发现新的证据。

## 风险等级

综合静态证据，2.6.4 风险等级：高。

原因：

1. 存在账号身份与定位相关信息上报。
2. 存在在线插件上传/下载/消息接口。
3. 插件 API 暴露账号 cookie/token、HTTP、文件读取、动态加载、踢人/禁言等高危能力。
4. native 加密与反篡改增加透明度风险。

但和 2.6.2 相比，本次静态分析没有确认“服务器黑名单自动踢人后门链”仍然存在。

## 建议

1. 不建议在主 QQ 账号或有管理权限的群环境中加载 2.6.4。
2. 如必须测试，建议使用隔离设备、测试 QQ、无管理权限测试群，并抓包观察：
   - `https://qstory.suzhelan.top`
   - `https://plugin.suzhelan.top`
   - `https://plugin.sacz.top`
   - `https://qstory.linl.top`
3. 动态验证重点：
   - 启动后是否自动调用 `/user-v2/commitLoginInfo`
   - 是否周期性提交 `Nickname/ClientCity/Location`
   - 是否远程下载插件并加载执行
   - 入群事件是否触发第三方插件自动调用 `kick`
4. 如果要公开 GitHub 报告，建议明确区分“已确认证据”和“未确认猜测”，避免把 2.6.2 结论直接套到 2.6.4。
