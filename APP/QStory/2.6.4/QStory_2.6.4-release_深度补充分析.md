# QStory 2.6.4-release 深度补充分析

分析对象：`QStory_2.6.4-release.apk`

APK SHA256：

```text
DBC9BC7A815359EB4187CB64A3FB5DDD9C51B96B201BA7ECBA44885D38996502
```

分析方式：本地静态逆向、apktool smali 审计、已解密字符串交叉检索。未访问对方后台，未尝试绕过认证获取服务器数据。

## 结论

1. 2.6.4 静态解密结果中没有发现 2.6.2 报告里的 `/user-v2/queryBlacklist` 和 `/user-v2/onKickBlacklist`。
2. 2.6.4 仍然确认存在 `/user-v2/commitLoginInfo`，并且不只是一次性登录上报，已找到 `scheduleWithFixedDelay` 周期调度路径。
3. `commitLoginInfo` 上报内容包含当前 QQ 号、昵称、城市、定位字段，并存在 `commitInfo=regularly` 标记。
4. 2.6.4 内置存在远端图片/文本判定接口 `https://search.linl.top/google/v2/imageContain`，可触发禁言、累计警告、达到 3 次后踢人。
5. 2.6.4 仍暴露插件 API 高危能力，包括踢人、禁言、读取 pskey/pt4Token、HTTP 请求、读文件、动态加载 dex/jar。
6. `blacklistTroop`、`blacklistText` 本轮复核后对应红包配置页面输入框，不等同于 2.6.2 的服务器黑名单踢人接口。

## 1. user-v2 接口复核

文件：

```text
QStory_2.6.4-release_apktool\smali_classes2\飘花落叶言苏哲世子楪兰\飘花落叶言子楪世哲兰苏.smali
```

确认存在的接口：

| 行号 | 接口 |
|---:|---|
| 60 | `/user-v2/doLogin` |
| 76 | `/user-v2/info` |
| 92 | `/user-v2/isLogin` |
| 108 | `/user-v2/refreshUserInfo` |
| 130 | `/user-v2/commitLoginInfo` |

复核结果：

```text
未发现 /user-v2/queryBlacklist
未发现 /user-v2/onKickBlacklist
```

风险含义：2.6.4 目前不能直接沿用 2.6.2 的“服务器黑名单 -> 自动踢人 -> 上报结果”结论，但保留了登录信息上报接口。

## 2. commitLoginInfo 周期上报链

### 2.1 上报字段

文件：

```text
QStory_2.6.4-release_apktool\smali_classes2\飘花落叶言世兰楪子哲苏\飘花落叶言子楪世哲兰苏.smali
```

关键代码含义：

```smali
79:  invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;
104: invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentAccountNickName()Ljava/lang/String;
100-108: invoke-interface {...}->commitLoginInfo(JSONObject)
```

已解密字段：

| 字符串表位置 | 解密值 | 含义 |
|---|---|---|
| `decoded_index_strings.tsv:2969` | `Nickname` | 当前账号昵称 |
| `decoded_index_strings.tsv:2970` | `ClientCity` | 客户端城市 |
| `decoded_index_strings.tsv:2971` | `Location` | 定位字段 |
| `decoded_index_strings.tsv:2972` | `commitInfo` | 上报类型字段 |
| `decoded_index_strings.tsv:2973` | `regularly` | 周期性上报标记 |

危险源代码片段：

```smali
invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;
invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentAccountNickName()Ljava/lang/String;
invoke-interface {p0, v0}, ...->椋樿姳钀藉彾瑷€瀛愭オ涓栬嫃鍝插叞(Lcom/alibaba/fastjson2/JSONObject;)Lretrofit2/...
invoke-interface {p0}, Lretrofit2/...;->execute()Lretrofit2/...
```

危险含义：模块会收集当前 QQ 账号标识和昵称，并同步执行网络请求提交。

### 2.2 周期调度

文件：

```text
QStory_2.6.4-release_apktool\smali_classes2\飘花落叶言苏哲楪世兰子\飘花落叶言子楪世苏哲兰.smali
```

关键代码：

```smali
const-wide/16 v4, 0x5
const-wide/16 v6, 0x1e
sget-object v8, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;
invoke-interface/range {v2 .. v8}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
```

含义：

```text
初始延迟：5 分钟
固定延迟：30 分钟
时间单位：MINUTES
```

危险含义：`commitLoginInfo` 存在周期性执行路径，不只是用户主动登录时的一次性请求。

### 2.3 定位相关字符串

已解密字符串：

| 位置 | 解密值 |
|---|---|
| `decoded_index_strings.tsv:1201` | `https://myip.ipip.net/json` |
| `decoded_index_strings.tsv:2129` | `com.tencent.map.geolocation.TencentLocationListener` |
| `decoded_index_strings.tsv:2140` | `com.tencent.map.geolocation.TencentLocationManager` |
| `decoded_index_strings.tsv:2141` | `onLocationChanged` |
| `decoded_index_strings.tsv:2142` | `com.tencent.map.geolocation.TencentLocation` |

危险含义：结合 `ClientCity`、`Location`、`regularly`，2.6.4 具备周期性提交账号与位置相关信息的静态证据。

## 3. 远端图片判定、禁言与踢人链

已解密关键字符串：

| 位置 | 解密值 |
|---|---|
| `decoded_index_strings.tsv:478` | `textList` |
| `decoded_index_strings.tsv:479` | `https://search.linl.top/google/v2/imageContain` |
| `decoded_index_strings.tsv:481` | `龙玉涛` |
| `decoded_index_strings.tsv:482` | `警告次数到达3次 已移出群聊` |
| `decoded_index_strings.tsv:483` | `此消息被鉴定为龙图,已进行禁言...当前警告次数:` |
| `decoded_index_strings.tsv:528` | `已踢出:` |
| `decoded_index_strings.tsv:2631` | `get_forbidden_list` |
| `decoded_index_strings.tsv:2643` | `is_black` |

相关代码文件：

```text
QStory_2.6.4-release_apktool\smali_classes2\飘花落叶言世哲兰楪子苏\飘花落叶言子楪世兰苏哲.smali
QStory_2.6.4-release_apktool\smali_classes2\飘花落叶言世哲兰楪子苏\飘花落叶言子楪世苏哲兰.smali
```

直接踢人调用：

```text
飘花落叶言子楪世兰苏哲.smali:449 -> QQNTTroopTool.kickMember(...)
飘花落叶言子楪世苏哲兰.smali:1006 -> QQNTTroopTool.kickMember(...)
```

危险源代码片段：

```smali
invoke-static {v0, v1}, ...;->椋樿姳钀藉彾瑷€瀛愭オ涓栧叞鑻忓摬(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
invoke-static {v5}, Lcom/alibaba/fastjson2/JSONObject;->parseObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;
invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONObject;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;
invoke-static {v15, v0, v9}, Llin/xposed/hook/util/qq/QQNTTroopTool;->kickMember(Ljava/lang/String;Ljava/lang/String;Z)V
```

执行链含义：

```text
提取消息/图片文本 -> 请求远端 imageContain -> 解析远端返回 JSON -> 判断 boolean 结果
-> 命中后禁言或累计警告 -> 警告次数达到 3 次 -> 发送提示 -> 调用 kickMember 踢出
```

风险判断：

该链条不是 2.6.2 的 `/queryBlacklist` 黑名单链，但它仍是“远端判定影响群管理动作”的链条。风险点在于远端返回结果可影响本地禁言/踢人行为。

## 4. PluginCallback 事件分发复核

文件：

```text
QStory_2.6.4-release_apktool\smali_classes2\lin\xposed\hook\javaplugin\PluginCallback.smali
```

`onJoinTroop`：

```smali
invoke-static {v1, v3}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeInAllScriptCallbackMethod(Ljava/lang/String;[Ljava/lang/Object;)V
```

`onMessage`：

```smali
invoke-static {v0, p0}, Llin/xposed/hook/javaplugin/controller/PluginManager;->invokeInAllScriptCallbackMethod(Ljava/lang/String;[Ljava/lang/Object;)V
```

判断：

这两个方法本身主要是事件分发，没有在本方法体内看到直接黑名单匹配或踢人逻辑。风险来自插件回调体系可以把入群、消息事件交给可执行插件。

## 5. blacklistTroop / blacklistText 复核

搜索结果：

```text
QStory_2.6.4-release_apktool\res\layout\set_redpacket_params.xml:17
QStory_2.6.4-release_apktool\res\layout\set_redpacket_params.xml:19
```

布局代码：

```xml
<EditText android:id="@id/redpack_blacklistTroop" android:hint="例如:948759593|954720846|255413638" />
<EditText android:id="@id/redpack_blacklistText" android:hint="例如:测|挂|谁领谁是|傻|儿" />
```

判断：

这两个字段属于红包配置页面，不是 2.6.2 报告中的服务器黑名单踢人接口证据。

## 6. 高危插件 API 仍存在

文件：

```text
QStory_2.6.4-release_apktool\smali_classes2\lin\xposed\hook\javaplugin\api\QQNTPluginMethod.smali
```

确认能力：

| 行号 | 能力 | 风险 |
|---:|---|---|
| 426 | `eval(String)` | 动态执行脚本 |
| 461 | `forbidden(...)` | 禁言 |
| 1100 | `getGTK(String)` | 获取 GTK |
| 3199 | `getPT4Token(String)` | 获取 PT4Token |
| 3214 | `getPskey(String)` | 获取 pskey |
| 3831 / 3842 | `httpGet(...)` | 任意 HTTP GET |
| 4020 / 4456 | `httpPost(...)` | 任意 HTTP POST |
| 4741 / 4745 | `kick(...)` / `kickMember(...)` | 踢群成员 |
| 4888 | `loadDex(String)` | 动态加载 dex |
| 4980 | `loadJar(String)` | 动态加载 jar |
| 5426 | `readFileText(String)` | 读本地文件 |
| 5855 | `scanImageText(String)` | OCR 识图 |

风险判断：

这些 API 使插件拥有高权限账号与群管理能力。如果在线插件可被远程下载并执行，则整体风险取决于插件来源、签名校验、权限隔离和用户确认机制。

## 7. 与 2.6.2 的差异

| 项目 | 2.6.2 报告结论 | 2.6.4 本轮复核 |
|---|---|---|
| `/user-v2/queryBlacklist` | 存在 | 未发现 |
| `/user-v2/onKickBlacklist` | 存在 | 未发现 |
| 服务器黑名单自动踢人链 | 已确认 | 未确认 |
| 登录/账号信息上报 | 存在相关接口 | 确认，且存在周期调度 |
| 定位/城市字段 | 需看版本 | 确认存在 `ClientCity`、`Location`、腾讯定位字符串 |
| 远端判定触发群管理 | 服务器黑名单 | 远端图片识别/黑名单判定，可导致禁言/踢人 |
| 插件高危 API | 存在 | 仍存在 |

## 8. 最终风险评级

风险等级：高。

理由：

1. 存在周期性账号与定位相关信息上报。
2. 存在远端判定结果影响本地禁言/踢人行为。
3. 插件 API 暴露 token/cookie、HTTP、文件读取、动态加载、群管理操作等高危能力。
4. 字符串混淆和 native 防篡改增加审计难度。

限制：

本报告没有访问后台接口，也没有证明服务器实际返回了什么数据。因此关于“服务器当前是否下发恶意名单/规则”的部分不能静态确认，只能确认 APK 具备相关能力和调用路径。

