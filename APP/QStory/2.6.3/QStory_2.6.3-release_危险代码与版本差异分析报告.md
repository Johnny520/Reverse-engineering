# QStory_2.6.3-release.apk 危险代码与版本差异分析报告

分析对象：`QStory_2.6.3-release.apk`

样本路径：`QStory_2.6.3-release.apk`

SHA256：`783F2E8B82F6EDFE812936911C1D3916A897D57C0F8D0CE712DEA7A66ADBEF86`

MD5：`ED69CA5BA550AF2E413867A26761E3A6`

反编译目录：

- JADX：`analysis_jadx`
- apktool：`analysis_apktool`
- 解密字符串：`deobfuscated_qstory`

## 结论

2.6.3 仍然保留多类高风险能力，包括：

- 上传用户 UIN、昵称、IP、城市、位置信息；
- 使用 token 访问 `/user-v2/*` 用户接口；
- 通过 Xposed/反射调用 QQ NT 内部接口踢人、禁言、退群；
- 提供批量管理好友、批量管理群功能，可批量删除好友、退出群；
- 保留自动检测特定表情/图片后禁言、累计 3 次踢人、严格模式直接踢人的逻辑；
- 保留硬编码默认检测群号 `2971017318`、`638537273`。

但对比 2.6.2，本地代码中没有复现此前确认的这条链路：

```text
请求服务器黑名单 -> 自动扫描管理群 -> onJoinTroop/onMessage 自动匹配 -> 自动踢人 -> 上报踢人结果
```

在 2.6.3 中，未发现本地明文或解密字符串中的：

- `/user-v2/queryBlacklist`
- `/user-v2/onKickBlacklist`

也未发现 2.6.2 中 `AbstractC8802.f24775/f24774` 那种“远程黑名单列表 + 管理群监控列表”的同等本地实现。2.6.3 的 `blacklistTroop`、`blacklistText` 是红包/检测功能本地配置项，不是服务器黑名单踢人链。

## 1. 字符串加密已解密

字符串解密类：

`analysis_jadx\sources\p287\AbstractC8405.java`

关键逻辑：

```java
public static String m13972(int i) {
    return m13973(f23278[i]);
}

public static String m13973(String str) {
    String[] strArr = new Regex("~").split(str, 0).toArray(new String[0]);
    ...
    bArr3[i4] = (byte) (bArr[i4] ^ bytes[i4 % bytes.length]);
    return new String(bArr3, StandardCharsets.UTF_8);
}
```

解出的密钥为：

```text
suzhelan
```

解密结果文件：

- `deobfuscated_qstory\m13972_strings.tsv`
- `deobfuscated_qstory\m13973_inline_all_sources.tsv`

## 2. 服务端接口

Base URL：

```text
https://qstory.suzhelan.top
```

证据文件：

`analysis_jadx\sources\p345\C8834.java`

```java
c0325.m971(AbstractC8405.m13972(2860));
```

对应解密：

```text
2860 = https://qstory.suzhelan.top
```

### 用户接口

文件：

`analysis_jadx\sources\p348\InterfaceC8841.java`

```java
@InterfaceC9131("/user-v2/doLogin")
InterfaceC5778<QSResult<C8786>> m14507(@InterfaceC9120 JSONObject param);

@InterfaceC9131("/user-v2/info")
InterfaceC5778<QSResult<C8785>> m14508();

@InterfaceC9131("/user-v2/isLogin")
InterfaceC5778<QSResult<Boolean>> m14509();

@InterfaceC9131("/user-v2/refreshUserInfo")
InterfaceC5778<QSResult<C8785>> m14510();

@InterfaceC9131("/user-v2/commitLoginInfo")
InterfaceC5778<QSResult<String>> m14511(@InterfaceC9120 JSONObject param);
```

含义：

- `/user-v2/doLogin`：用当前 QQ 号登录/换取 token；
- `/user-v2/info`：获取当前账号信息；
- `/user-v2/isLogin`：检查登录状态；
- `/user-v2/refreshUserInfo`：刷新用户信息；
- `/user-v2/commitLoginInfo`：提交登录/环境信息。

### 其他接口

文件：

`analysis_jadx\sources\p348`

```java
@InterfaceC9115("/update/valid")
@InterfaceC9115("/update/getUpdateLog")
@InterfaceC9115("/update/hasUpdate")
@InterfaceC9115("/pay-v2/queryOrderResult")
@InterfaceC9115("/pay-v2/getPayItemList")
@InterfaceC9115("/open/groups")
@InterfaceC9115("/notice/all")
@InterfaceC9115("/notice/last")
```

用途分别对应更新、支付项、公开群组、公告。

## 3. 用户数据上传

文件：

`analysis_jadx\sources\p010\RunnableC6186.java`

关键代码：

```java
JSONObject jSONObjectM14376 = C8667.m14376();
jSONObjectM14376.put("Uin", QQEnvTool.getCurrentUin());
jSONObjectM14376.put("Nickname", QQEnvTool.getCurrentAccountNickName());
Pair pairM13706 = AbstractC8190.m13706();
if (pairM13706 != null) {
    jSONObjectM14376.put("Ip", pairM13706.first);
    jSONObjectM14376.put("ClientCity", pairM13706.second);
}
if (str.length() > 0) {
    jSONObjectM14376.put("Location", str);
    jSONObjectM14376.put("Lt", "regularly");
}
C8834.m14488().m14511(jSONObjectM14376).execute();
```

对应接口：

```text
POST /user-v2/commitLoginInfo
```

上传字段：

- `Uin`：当前 QQ 号；
- `Nickname`：当前账号昵称；
- `Ip`：公网/IP 查询结果；
- `ClientCity`：IP 城市；
- `Location`：定位字符串；
- `Lt = regularly`：定位/上报类型。

定位相关证据：

`analysis_jadx\sources\p352\RunnableC8868.java`

```java
AbstractC7653.m12920(context, "android.permission.ACCESS_FINE_LOCATION")
AbstractC7653.m12920(context, "android.permission.ACCESS_COARSE_LOCATION")
locationManager.isProviderEnabled("network")
locationManager.isProviderEnabled("gps")
```

说明：如果权限和定位服务满足条件，会周期性取定位并提交。

## 4. 登录 token 与认证

用户信息模型：

`analysis_jadx\sources\p332\C8785.java`

```java
@InterfaceC8367(name = "uin", ordinal = 1)
public String f24742;

@InterfaceC8367(name = "nickname", ordinal = 2)
public String f24741;

@InterfaceC8367(name = "identity", ordinal = 3)
public Integer f24740;

@InterfaceC8367(name = "identityName", ordinal = 4)
public String f24739;

@InterfaceC8367(name = "label", ordinal = 5)
public String f24738;
```

登录 token 模型：

`analysis_jadx\sources\p332\C8786.java`

```java
@InterfaceC8367(name = "tokenValue")
public String f24747;

@InterfaceC8367(name = "tokenName")
public String f24748;
```

token 使用位置：

`analysis_jadx\sources\kotlin\reflect\jvm\internal\impl\descriptors\C4485.java`

```java
C8786 c8786M6707 = AbstractC3056.m6707();
String str = c8786M6707 != null ? c8786M6707.f24747 : null;
C8786 c8786M67072 = AbstractC3056.m6707();
String str2 = c8786M67072 != null ? c8786M67072.f24748 : null;
...
c1245.m2166(str2, str);
```

含义：服务器返回的 `tokenName/tokenValue` 被加入后续请求头，用于访问需要认证的接口。

## 5. 批量删除好友

入口：

`analysis_jadx\sources\lin\xposed\hook\view\main\itemview\ManageFriends.java`

```java
public String getLeftText() {
    return "批量管理好友";
}

new Thread(new RunnableC8867(c8890, 1)).start();
```

加载好友列表：

`analysis_jadx\sources\p352\RunnableC8867.java`

```java
QQFriendTool.FriendListResult allFriendWithCategories =
    QQFriendTool.getAllFriendWithCategories();
```

执行删除：

`analysis_jadx\sources\p352\RunnableC8868.java`

```java
C8198.m13708("正在删除好友 (" + ... + ")\nQQ号: " + str2, f);
C8808.m14481(str);
```

实际删除好友调用：

`analysis_jadx\sources\p339\C8808.java`

```java
c6335M11854.m11856(objCallMethod, "ProfileCardMoreActivity", str, (byte) 2, 0);
```

同类底层能力：

`analysis_jadx\sources\lin\xposed\hook\util\qq\QQFriendTool.java`

```java
public static void deleteFriend(String str) {
    ...
    c6335M11854.m11856(objCallMethod, "ProfileCardMoreActivity", str, (byte) 2, 0);
}
```

风险：该功能具备批量删除好友能力。当前证据显示它有 UI 入口，不是 2.6.2 那种 `identity < 0` 静默触发。

## 6. 批量退出群

入口：

`analysis_jadx\sources\lin\xposed\hook\view\main\itemview\ManageTroops.java`

```java
public String getLeftText() {
    return "批量管理群";
}

new Thread(new RunnableC8867(c7828, 2)).start();
```

确认界面文案：

```text
批量管理群 (
勾选需要退出的群（我创建的群不可勾选）
```

执行退群：

`analysis_jadx\sources\p352\RunnableC8868.java`

```java
C8198.m13708("正在退出群 (" + ... + ")\n群号: " + str22, f);
QQNTTroopSettingTool.quitGroup(str2);
```

底层退群调用：

`analysis_jadx\sources\lin\xposed\hook\util\qq\QQNTTroopSettingTool.java`

```java
Object qRouteApi = QQEnvTool.getQRouteApi(
    AbstractC6337.m11866("com.tencent.qqnt.troop.ITroopOperationRepoApi")
);
c6335M11854.m11856(qRouteApi, str, Boolean.FALSE, null, "TroopSettingViewModel", null);
```

风险：该功能具备批量退出群能力。当前证据显示它有 UI 入口和确认界面，不是静默破坏链。

## 7. 踢人、禁言能力

底层踢人：

`analysis_jadx\sources\lin\xposed\hook\util\qq\QQNTTroopTool.java`

```java
public static void kickMember(String str, String str2, boolean z) {
    ...
    Object qRouteApi = QQEnvTool.getQRouteApi(
        AbstractC6337.m11866("com.tencent.qqnt.troop.ITroopMemberOperationRepoApi")
    );
    ...
    methodM11855.invoke(qRouteApi, objNewInstance, null, "", Proxy.newProxyInstance(...));
}
```

底层禁言：

```java
public static void shutUp(String str, String str2, long j) {
    ...
    Object qRouteApi = QQEnvTool.getQRouteApi(
        AbstractC6337.m11866("com.tencent.qqnt.troop.ITroopMemberOperationRepoApi")
    );
    ...
    methodM11855.invoke(qRouteApi, str, QQEnvTool.getUidFromUin(str2), Long.valueOf(j), ...);
}
```

插件 API 也暴露踢人能力：

`analysis_jadx\sources\lin\xposed\hook\javaplugin\api\QQNTPluginMethod.java`

```java
QQNTTroopTool.kickMember(str, str2, z);
```

风险：只要上层逻辑或脚本调用这些方法，就能执行群踢人、禁言。

## 8. 自动检测并踢人逻辑

文件：

`analysis_jadx\sources\top\suzhelan\qstory\hook\item\C5913.java`

累计 3 次后踢人：

```java
if (iIntValue5 < 3) {
    QQNTTroopTool.shutUp(str2, String.valueOf(j2), 3600L);
} else {
    QQNTSendMsgUtils.sendMsg(contact2, arrayList5);
    Thread.sleep(1000L);
    QQNTTroopTool.kickMember(str2, String.valueOf(j2), false);
}
```

严格模式直接踢人：

```java
QQNTSendMsgUtils.sendText(contact2, "已踢出:" + j);
Thread.sleep(2000L);
QQNTTroopTool.kickMember(str6, String.valueOf(j), true);
```

对应解密文案：

```text
警告次数到达3次 已移出群聊
此消息被鉴定为龙图,已进行禁言...
达到3次将会踢出
本群开启了严格检测...会直接移出本群...
已踢出:
```

风险：该逻辑会根据内容检测结果执行禁言/踢人。它不是 2.6.2 的远程服务器黑名单逻辑，但仍然属于自动化群管理高风险功能。

## 9. 默认检测群与硬编码数字

2.6.3 字符串解密结果：

```text
需要检测群.json
2971017318
638537273
```

使用位置：

`analysis_jadx\sources\p040\C6438.java`

```java
Set setM1164 = AbstractC0455.m1164("需要检测群.json");
this.f17635 = setM1164;
if (setM1164.size() == 0) {
    this.f17635.add("2971017318");
    this.f17635.add("638537273");
}
```

`analysis_jadx\sources\p040\C6434.java`

```java
Set setM1164 = AbstractC0455.m1164("需要检测群.json");
this.f17623 = setM1164;
if (setM1164.size() == 0) {
    this.f17623.add("2971017318");
    this.f17623.add("638537273");
}
```

结论：

- `2971017318`、`638537273` 是默认检测群配置值；
- 当前本地证据不能证明它们是“开发者豁免 QQ 号”；
- 2.6.3 本地踢人核心中没有发现固定开发者 QQ 豁免逻辑。

## 10. 2.6.2 后门链路在 2.6.3 的复核结果

2.6.2 中曾确认的危险接口：

```text
/user-v2/queryBlacklist
/user-v2/onKickBlacklist
```

2.6.3 复核范围：

- JADX 源码：`analysis_jadx`
- apktool 输出：`analysis_apktool`
- 解密字符串表：`deobfuscated_qstory`

检索结果：

```text
未发现 queryBlacklist
未发现 onKickBlacklist
```

`PluginCallback` 复核：

`analysis_jadx\sources\lin\xposed\hook\javaplugin\PluginCallback.java`

```java
public static void onJoinTroop(String str, String str2, String str3) {
    PluginManager.invokeInAllScriptCallbackMethod(...);
    PluginManager.invokeInAllScriptCallbackMethod(...);
}

public static void onMessage(MessageData messageData) {
    PluginManager.invokeInAllScriptCallbackMethod(..., messageData);
}
```

结论：

- 2.6.3 的 `onJoinTroop/onMessage` 只转发给脚本回调；
- 没有看到直接调用服务器黑名单判断、管理群扫描、踢人上报的本地链路；
- 若仍存在服务器侧控制，只能说当前样本本地静态证据未复现，不能凭空认定。

## 11. 2.6.2 中 `identity < 0` 破坏逻辑在 2.6.3 的变化

2.6.3 中用户身份字段仍存在：

```java
@InterfaceC8367(name = "identity", ordinal = 3)
public Integer f24740 = 0;
```

但 2.6.3 的本地缓存清理方法：

`analysis_jadx\sources\com\bumptech\glide\AbstractC3056.java`

```java
public static void m6680() {
    ...
    sharedPreferencesC8176M13673.remove(strM139732);
}
```

它只删除本地 `user_info` 缓存，没有发现 2.6.2 中同类的：

- 自动删除全部好友；
- 自动退出全部群；
- 删除 `/storage/emulated/0/Pictures/`；
- 删除 `/storage/emulated/0/DCIM/`；
- 删除 `/storage/emulated/0/Download/`；
- 删除 `/data/data/com.tencent.mobileqq/`；
- `finishAndRemoveTask()`。

结论：2.6.2 中最严重的 `identity < 0` 本地破坏逻辑，在 2.6.3 当前样本里未复现。

## 12. 总体风险评级

2.6.3 风险仍然较高，原因是：

- 仍上传用户账号、IP、城市、定位信息；
- 仍有 token 登录和服务器用户身份体系；
- 仍有踢人、禁言、退群、删好友等高权限能力；
- 插件 API 仍可调用群管理能力；
- 自动内容检测会触发禁言/踢人；
- 默认写入两个检测群号。

但与 2.6.2 相比，2.6.3 当前静态样本未发现：

- 远程服务器黑名单接口；
- 自动扫描全部管理群并加入监控；
- 服务器黑名单命中后自动踢人；
- 踢人结果上报接口；
- `identity < 0` 触发的静默毁号/删目录逻辑。

## 13. 建议

如果使用过 2.6.3，建议：

1. 停用或卸载该模块；
2. 检查 QQ 好友、群列表、群管理记录；
3. 检查是否出现异常禁言、踢人、退群、删好友；
4. 不要给不可信脚本开放踢人/禁言/删好友相关能力；
5. 保存 APK、反编译目录、解密字符串表和本报告作为证据。

## 14. 证据文件清单

核心证据：

- `analysis_jadx\sources\p287\AbstractC8405.java`
- `deobfuscated_qstory\m13972_strings.tsv`
- `deobfuscated_qstory\m13973_inline_all_sources.tsv`
- `analysis_jadx\sources\p348\InterfaceC8841.java`
- `analysis_jadx\sources\p345\C8834.java`
- `analysis_jadx\sources\p010\RunnableC6186.java`
- `analysis_jadx\sources\p075\C6961.java`
- `analysis_jadx\sources\p332\C8785.java`
- `analysis_jadx\sources\p332\C8786.java`
- `analysis_jadx\sources\lin\xposed\hook\util\qq\QQFriendTool.java`
- `analysis_jadx\sources\lin\xposed\hook\util\qq\QQNTTroopTool.java`
- `analysis_jadx\sources\lin\xposed\hook\util\qq\QQNTTroopSettingTool.java`
- `analysis_jadx\sources\p352\RunnableC8867.java`
- `analysis_jadx\sources\p352\RunnableC8868.java`
- `analysis_jadx\sources\p339\C8808.java`
- `analysis_jadx\sources\top\suzhelan\qstory\hook\item\C5913.java`
- `analysis_jadx\sources\p040\C6438.java`
- `analysis_jadx\sources\p040\C6434.java`
- `analysis_jadx\sources\lin\xposed\hook\javaplugin\PluginCallback.java`
