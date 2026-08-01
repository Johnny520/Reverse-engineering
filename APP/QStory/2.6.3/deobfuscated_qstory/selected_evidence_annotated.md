## p010/RunnableC6186.java:135-160

```java
135:                        return;
136:                    }
137:                    break;
138:                } catch (Exception unused6) {
139:                    return;
140:                }
141:                return;
142:            case 1:
143:                try {
144:                    JSONObject jSONObjectM14376 = C8667.m14376();
145:                    jSONObjectM14376.put(AbstractC8405.m13973("喵喵呜喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), QQEnvTool.getCurrentUin()); // decoded: inline=Uin
146:                    jSONObjectM14376.put(AbstractC8405.m13972(2862), QQEnvTool.getCurrentAccountNickName()); // decoded: m13972(2862)=Nickname
147:                    Pair pairM13706 = AbstractC8190.m13706();
148:                    if (pairM13706 != null) {
149:                        jSONObjectM14376.put(AbstractC8405.m13973("喵喵呜呜呜喵呜喵~喵喵喵喵喵呜喵呜"), pairM13706.first); // decoded: inline=Ip
150:                        jSONObjectM14376.put(AbstractC8405.m13972(2863), pairM13706.second); // decoded: m13972(2863)=ClientCity
151:                    }
152:                    if (str.length() > 0) {
153:                        jSONObjectM14376.put(AbstractC8405.m13972(2864), str); // decoded: m13972(2864)=Location
154:                        jSONObjectM14376.put(AbstractC8405.m13973("喵喵呜呜呜呜呜呜~喵喵喵喵喵喵喵呜"), AbstractC8405.m13972(2865)); // decoded: m13972(2865)=regularly ; inline=Lt
155:                    }
156:                    C8834.m14488().m14511(jSONObjectM14376).execute();
157:                    return;
158:                } catch (Exception e) {
159:                    AbstractC6188.m11605(AbstractC8405.m13972(2866), e.toString(), e, true); // decoded: m13972(2866)=commitInfo
160:                    return;
```

## p348/InterfaceC8841.java:1-45

```java
1:package p348;
2:
3:import com.alibaba.fastjson2.JSONObject;
4:import kotlin.Metadata;
5:import p332.C8785;
6:import p332.C8786;
7:import p397.InterfaceC9120;
8:import p397.InterfaceC9131;
9:import retrofit2.InterfaceC5778;
10:import top.suzhelan.qstory.entity.QSResult;
11:
12:/* JADX INFO: renamed from: 飘花落叶言苏哲子兰楪世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
13:/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
14:/* JADX INFO: loaded from: classes2.dex */
15:@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u0004H'¢\u0006\u0004\b\f\u0010\u000bJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\bJ\u001b\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u0004H'¢\u0006\u0004\b\u0010\u0010\u000b¨\u0006\u0011À\u0006\u0003"}, d2 = {"L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世兰苏哲;", "", "Lcom/alibaba/fastjson2/JSONObject;", "param", "Lretrofit2/飘花落叶言子楪世兰苏哲;", "Ltop/suzhelan/qstory/entity/QSResult;", "L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏哲兰;", "飘花落叶言子楪世兰苏哲", "(Lcom/alibaba/fastjson2/JSONObject;)Lretrofit2/飘花落叶言子楪世兰苏哲;", "L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;", "飘花落叶言子楪世哲兰苏", "()Lretrofit2/飘花落叶言子楪世兰苏哲;", "飘花落叶言子楪世苏兰哲", "", "飘花落叶言子楪世苏哲兰", "", "飘花落叶言子楪世哲苏兰", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
16:public interface InterfaceC8841 {
17:    @InterfaceC9131("/user-v2/doLogin")
18:    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
19:    InterfaceC5778<QSResult<C8786>> m14507(@InterfaceC9120 JSONObject param);
20:
21:    @InterfaceC9131("/user-v2/info")
22:    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
23:    InterfaceC5778<QSResult<C8785>> m14508();
24:
25:    @InterfaceC9131("/user-v2/isLogin")
26:    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
27:    InterfaceC5778<QSResult<Boolean>> m14509();
28:
29:    @InterfaceC9131("/user-v2/refreshUserInfo")
30:    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
31:    InterfaceC5778<QSResult<C8785>> m14510();
32:
33:    @InterfaceC9131("/user-v2/commitLoginInfo")
34:    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
35:    InterfaceC5778<QSResult<String>> m14511(@InterfaceC9120 JSONObject param);
36:}
37:
```

## p345/C8834.java:1-70

```java
1:package p345;
2:
3:import androidx.compose.animation.core.C0325;
4:import java.util.ArrayList;
5:import java.util.Locale;
6:import p007.C6127;
7:import p007.C6143;
8:import p007.InterfaceC6155;
9:import p012.C6220;
10:import p016.C6237;
11:import p034.AbstractC6344;
12:import p034.AbstractC6347;
13:import p036.AbstractC6358;
14:import p175.AbstractC7739;
15:import p287.AbstractC8405;
16:import p347.C8839;
17:import p347.C8840;
18:import p348.InterfaceC8841;
19:import p348.InterfaceC8842;
20:import p348.InterfaceC8845;
21:
22:/* JADX INFO: renamed from: 飘花落叶言苏哲子世兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
23:/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
24:/* JADX INFO: loaded from: classes2.dex */
25:public final class C8834 {
26:
27:    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
28:    public static String f24935;
29:
30:    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
31:    public static final C8834 f24936;
32:
33:    static {
34:        AbstractC8405.m13972(2860); // decoded: m13972(2860)=https://qstory.suzhelan.top
35:        f24936 = new C8834();
36:    }
37:
38:    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
39:    public static final InterfaceC8841 m14488() {
40:        C0325 c0325 = new C0325(19);
41:        c0325.m971(AbstractC8405.m13972(2860)); // decoded: m13972(2860)=https://qstory.suzhelan.top
42:        f24936.getClass();
43:        c0325.f1095 = m14491(true);
44:        ((ArrayList) c0325.f1094).add(new C8839());
45:        Object objM548 = c0325.m970().m548(InterfaceC8841.class);
46:        AbstractC8405.m13972(2861); // decoded: m13972(2861)=create(...)
47:        objM548.getClass();
48:        return (InterfaceC8841) objM548;
49:    }
50:
51:    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
52:    public static final InterfaceC8842 m14489() {
53:        C0325 c0325 = new C0325(19);
54:        c0325.m971(AbstractC8405.m13972(2860)); // decoded: m13972(2860)=https://qstory.suzhelan.top
55:        f24936.getClass();
56:        c0325.f1095 = m14491(false);
57:        ((ArrayList) c0325.f1094).add(new C8839());
58:        Object objM548 = c0325.m970().m548(InterfaceC8842.class);
59:        AbstractC8405.m13972(2861); // decoded: m13972(2861)=create(...)
60:        objM548.getClass();
61:        return (InterfaceC8842) objM548;
62:    }
63:
64:    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
65:    public static final InterfaceC8845 m14490() {
66:        C0325 c0325 = new C0325(19);
67:        c0325.m971(AbstractC8405.m13972(2860)); // decoded: m13972(2860)=https://qstory.suzhelan.top
68:        f24936.getClass();
69:        c0325.f1095 = m14491(false);
70:        ((ArrayList) c0325.f1094).add(new C8839());
```

## top/suzhelan/qstory/hook/item/C5913.java:104-195

```java
104:            case 2:
105:                final C6438 c6438 = (C6438) abstractC8803;
106:                ExecutorService executorService = c6438.f17636;
107:                try {
108:                    String uinFromUid = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), obj); // decoded: inline=peerUid
109:                    final long jLongValue = ((Long) AbstractC6336.m11859(cls, AbstractC8405.m13972(483), obj)).longValue(); // decoded: m13972(483)=senderUin
110:                    final long jLongValue2 = ((Long) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj)).longValue(); // decoded: inline=msgId
111:                    final int iIntValue4 = ((Integer) XposedHelpers.callMethod(obj, AbstractC8405.m13972(511), new Object[0])).intValue(); // decoded: m13972(511)=getChatType
112:                    if (iIntValue4 == 100 || iIntValue4 == 1) {
113:                        uinFromUid = QQEnvTool.getUinFromUid(uinFromUid);
114:                    }
115:                    if (c6438.f17635.contains(uinFromUid)) {
116:                        ArrayList arrayList = (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj); // decoded: m13972(152)=elements
117:                        final ArrayList arrayList2 = new ArrayList();
118:                        for (Object obj3 : arrayList) {
119:                            C6335 c6335M11854 = C6335.m11854(obj3.getClass());
120:                            c6335M11854.f17458.f3618 = AbstractC8405.m13972(140); // decoded: m13972(140)=getPicElement
121:                            c6335M11854.f17458.f3617 = AbstractC6337.m11866(AbstractC8405.m13972(178)); // decoded: m13972(178)=com.tencent.qqnt.kernel.nativeinterface.PicElement
122:                            Object objM11856 = c6335M11854.m11856(obj3, new Object[0]);
123:                            if (objM11856 != null) {
124:                                arrayList2.add(AbstractC8405.m13972(512) + ((String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(179), objM11856)).toUpperCase() + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵呜喵喵喵呜喵呜")); // decoded: m13972(512)=https://gchat.qpic.cn/gchatpic_new/0/0-0- ; m13972(179)=md5HexStr ; inline=/0
125:                            }
126:                        }
127:                        if (arrayList2.size() != 0) {
128:                            final int i2 = 0;
129:                            final String str = uinFromUid;
130:                            executorService.execute(new Runnable() { // from class: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世苏哲兰
131:                                @Override // java.lang.Runnable
132:                                public final void run() throws Throwable {
133:                                    String strM11948;
134:                                    String strM119482;
135:                                    int i3 = i2;
136:                                    long j = jLongValue2;
137:                                    int i4 = iIntValue4;
138:                                    long j2 = jLongValue;
139:                                    String str2 = str;
140:                                    ArrayList arrayList3 = arrayList2;
141:                                    C6438 c64382 = c6438;
142:                                    switch (i3) {
143:                                        case 0:
144:                                            String str3 = (String) arrayList3.get(0);
145:                                            JSONObject jSONObject = new JSONObject();
146:                                            jSONObject.put(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵"), str3); // decoded: inline=url
147:                                            JSONArray jSONArray = new JSONArray();
148:                                            jSONArray.add(AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜喵呜~呜呜呜呜呜呜呜喵~呜呜喵呜喵喵呜喵")); // decoded: inline=龙图
149:                                            jSONArray.add(AbstractC8405.m13972(505)); // decoded: m13972(505)=龙玉涛
150:                                            jSONArray.add(AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜呜喵~呜呜喵喵喵呜呜呜~呜呜呜呜呜喵呜呜")); // decoded: inline=龙梗
151:                                            jSONObject.put(AbstractC8405.m13972(502), jSONArray); // decoded: m13972(502)=textList
152:                                            try {
153:                                                strM11948 = AbstractC6370.m11948(AbstractC8405.m13972(503), jSONObject.toString()); // decoded: m13972(503)=https://search.linl.top/google/v2/imageContain
154:                                            } catch (IOException e3) {
155:                                                String strM13973 = AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜喵呜~呜呜呜呜呜呜呜喵~呜呜喵呜喵喵呜喵"); // decoded: inline=龙图
156:                                                String str4 = AbstractC6188.f17016;
157:                                                AbstractC6188.m11605(strM13973, e3.toString(), e3, true);
158:                                                strM11948 = null;
159:                                            }
160:                                            if (JSONObject.parseObject(strM11948).getBoolean(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵")).booleanValue()) { // decoded: inline=result
161:                                                StringBuilder sbM140 = AbstractC0053.m140(str2);
162:                                                sbM140.append(AbstractC8405.m13973("喵呜喵喵呜喵喵呜")); // decoded: inline=:
163:                                                sbM140.append(j2);
164:                                                String string = sbM140.toString();
165:                                                Integer num = (Integer) c64382.f17637.get(string);
166:                                                if (num == null) {
167:                                                    num = 0;
168:                                                }
169:                                                int iIntValue5 = num.intValue() + 1;
170:                                                c64382.f17637.put(string, Integer.valueOf(iIntValue5));
171:                                                c64382.m11978();
172:                                                if (iIntValue5 < 3) {
173:                                                    Object contact = QQSessionUtils.QQNT.getContact(i4, str2);
174:                                                    ArrayList arrayList4 = new ArrayList();
175:                                                    Object objCreateReplyElement = CreateElement.createReplyElement(j);
176:                                                    Object objCreateTextElement = CreateElement.createTextElement(AbstractC8405.m13972(507) + iIntValue5 + AbstractC8405.m13972(508)); // decoded: m13972(507)=此消息被鉴定为龙图,已进行禁言\n\n如果误判请在群内发送 : 请给我解禁\n我只是机器人私聊我是没有用的哦\n\n当前警告次数: ; m13972(508)= 达到3次将会踢出
177:                                                    arrayList4.add(objCreateReplyElement);
178:                                                    arrayList4.add(objCreateTextElement);
179:                                                    QQNTSendMsgUtils.sendMsg(contact, arrayList4);
180:                                                    QQNTTroopTool.shutUp(str2, String.valueOf(j2), 3600L);
181:                                                } else {
182:                                                    Object contact2 = QQSessionUtils.QQNT.getContact(i4, str2);
183:                                                    ArrayList arrayList5 = new ArrayList();
184:                                                    Object objCreateReplyElement2 = CreateElement.createReplyElement(j);
185:                                                    Object objCreateTextElement2 = CreateElement.createTextElement(AbstractC8405.m13972(506)); // decoded: m13972(506)=警告次数到达3次 已移出群聊
186:                                                    arrayList5.add(objCreateReplyElement2);
187:                                                    arrayList5.add(objCreateTextElement2);
188:                                                    QQNTSendMsgUtils.sendMsg(contact2, arrayList5);
189:                                                    try {
190:                                                        Thread.sleep(1000L);
191:                                                        break;
192:                                                    } catch (InterruptedException unused) {
193:                                                    }
194:                                                    QQNTTroopTool.kickMember(str2, String.valueOf(j2), false);
195:                                                }
```

## top/suzhelan/qstory/hook/item/C5913.java:380-469

```java
380:            case 3:
381:                final C6434 c6434 = (C6434) abstractC8803;
382:                try {
383:                    String uinFromUid2 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), obj); // decoded: inline=peerUid
384:                    final long jLongValue3 = ((Long) AbstractC6336.m11859(cls, AbstractC8405.m13972(483), obj)).longValue(); // decoded: m13972(483)=senderUin
385:                    final long jLongValue4 = ((Long) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj)).longValue(); // decoded: inline=msgId
386:                    final int iIntValue5 = ((Integer) XposedHelpers.callMethod(obj, AbstractC8405.m13972(511), new Object[0])).intValue(); // decoded: m13972(511)=getChatType
387:                    if (iIntValue5 == 100 || iIntValue5 == 1) {
388:                        uinFromUid2 = QQEnvTool.getUinFromUid(uinFromUid2);
389:                    }
390:                    if (c6434.f17623.contains(uinFromUid2)) {
391:                        ArrayList arrayList3 = (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj); // decoded: m13972(152)=elements
392:                        final ArrayList arrayList4 = new ArrayList();
393:                        for (Object obj4 : arrayList3) {
394:                            C6335 c6335M118542 = C6335.m11854(obj4.getClass());
395:                            c6335M118542.f17458.f3618 = AbstractC8405.m13972(140); // decoded: m13972(140)=getPicElement
396:                            c6335M118542.f17458.f3617 = AbstractC6337.m11866(AbstractC8405.m13972(178)); // decoded: m13972(178)=com.tencent.qqnt.kernel.nativeinterface.PicElement
397:                            Object objM118562 = c6335M118542.m11856(obj4, new Object[0]);
398:                            if (objM118562 != null) {
399:                                arrayList4.add(AbstractC8405.m13972(512) + ((String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(179), objM118562)).toUpperCase() + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵呜喵喵喵呜喵呜")); // decoded: m13972(512)=https://gchat.qpic.cn/gchatpic_new/0/0-0- ; m13972(179)=md5HexStr ; inline=/0
400:                            }
401:                        }
402:                        if (arrayList4.size() != 0) {
403:                            final String str3 = uinFromUid2;
404:                            c6434.f17624.execute(new Runnable(c6434, arrayList4, str3, jLongValue3, iIntValue5, jLongValue4) { // from class: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世兰苏哲
405:
406:                                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
407:                                public final /* synthetic */ long f17626;
408:
409:                                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
410:                                public final /* synthetic */ int f17627;
411:
412:                                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
413:                                public final /* synthetic */ String f17628;
414:
415:                                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
416:                                public final /* synthetic */ long f17629;
417:
418:                                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
419:                                public final /* synthetic */ ArrayList f17630;
420:
421:                                {
422:                                    this.f17630 = arrayList4;
423:                                    this.f17628 = str3;
424:                                    this.f17629 = jLongValue3;
425:                                    this.f17627 = iIntValue5;
426:                                    this.f17626 = jLongValue4;
427:                                }
428:
429:                                @Override // java.lang.Runnable
430:                                public final void run() throws Throwable {
431:                                    String strM11948;
432:                                    String str4 = (String) this.f17630.get(0);
433:                                    JSONObject jSONObject = new JSONObject();
434:                                    jSONObject.put(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵"), str4); // decoded: inline=url
435:                                    JSONArray jSONArray = new JSONArray();
436:                                    jSONArray.add(AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜喵呜~呜呜呜呜呜呜呜喵~呜呜喵呜喵喵呜喵")); // decoded: inline=龙图
437:                                    jSONArray.add(AbstractC8405.m13972(505)); // decoded: m13972(505)=龙玉涛
438:                                    jSONArray.add(AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜呜喵~呜呜喵喵喵呜呜呜~呜呜呜呜呜喵呜呜")); // decoded: inline=龙梗
439:                                    jSONObject.put(AbstractC8405.m13972(502), jSONArray); // decoded: m13972(502)=textList
440:                                    try {
441:                                        strM11948 = AbstractC6370.m11948(AbstractC8405.m13972(503), jSONObject.toString()); // decoded: m13972(503)=https://search.linl.top/google/v2/imageContain
442:                                    } catch (IOException e4) {
443:                                        String strM13973 = AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜喵呜~呜呜呜呜呜呜呜喵~呜呜喵呜喵喵呜喵"); // decoded: inline=龙图
444:                                        String str5 = AbstractC6188.f17016;
445:                                        AbstractC6188.m11605(strM13973, e4.toString(), e4, true);
446:                                        strM11948 = null;
447:                                    }
448:                                    if (JSONObject.parseObject(strM11948).getBoolean(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵")).booleanValue()) { // decoded: inline=result
449:                                        int i4 = this.f17627;
450:                                        String str6 = this.f17628;
451:                                        Object contact = QQSessionUtils.QQNT.getContact(i4, str6);
452:                                        ArrayList arrayList5 = new ArrayList();
453:                                        Object objCreateReplyElement = CreateElement.createReplyElement(this.f17626);
454:                                        Object objCreateTextElement = CreateElement.createTextElement(AbstractC8405.m13972(551)); // decoded: m13972(551)=本群开启了严格检测 发送龙图/弱智抽象表情\n\n会直接移出本群(如果误判算你运气不好)\n很高兴你来到本群 但是你可能不适合待在本群\n\n拜拜~
455:                                        arrayList5.add(objCreateReplyElement);
456:                                        arrayList5.add(objCreateTextElement);
457:                                        QQNTSendMsgUtils.sendMsg(contact, arrayList5);
458:                                        Object contact2 = QQSessionUtils.QQNT.getContact(1, QQEnvTool.getCurrentUin());
459:                                        StringBuilder sb = new StringBuilder();
460:                                        sb.append(AbstractC8405.m13972(552)); // decoded: m13972(552)=已踢出:
461:                                        long j = this.f17629;
462:                                        sb.append(j);
463:                                        QQNTSendMsgUtils.sendText(contact2, sb.toString());
464:                                        try {
465:                                            Thread.sleep(2000L);
466:                                        } catch (InterruptedException unused) {
467:                                        }
468:                                        QQNTTroopTool.kickMember(str6, String.valueOf(j), true);
469:                                    }
```

## p040/C6438.java:1-80

```java
1:package p040;
2:
3:import android.view.View;
4:import androidx.compose.foundation.draganddrop.AbstractC0455;
5:import java.util.HashMap;
6:import java.util.HashSet;
7:import java.util.Set;
8:import java.util.concurrent.ExecutorService;
9:import java.util.concurrent.Executors;
10:import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5533;
11:import p287.AbstractC8405;
12:import p332.C8785;
13:import p337.AbstractC8803;
14:import top.suzhelan.qstory.hook.api.C5816;
15:import top.suzhelan.qstory.hook.api.C5817;
16:import top.suzhelan.qstory.hook.api.C5821;
17:import top.suzhelan.qstory.hook.item.C5913;
18:
19:/* JADX INFO: renamed from: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
20:/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
21:/* JADX INFO: loaded from: classes2.dex */
22:public class C6438 extends AbstractC8803 {
23:
24:    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
25:    public Set f17635;
26:
27:    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
28:    public final ExecutorService f17636 = Executors.newSingleThreadExecutor();
29:
30:    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
31:    public HashMap f17637;
32:
33:    public C6438() {
34:        AbstractC8405.m13972(496); // decoded: m13972(496)=需要检测群.json
35:        AbstractC8405.m13972(497); // decoded: m13972(497)=警告组.json
36:        this.f17637 = new HashMap();
37:        this.f17635 = new HashSet();
38:    }
39:
40:    @Override // p026.AbstractC6314
41:    public final void loadHook(ClassLoader classLoader) {
42:        Set setM1164 = AbstractC0455.m1164(AbstractC8405.m13972(496)); // decoded: m13972(496)=需要检测群.json
43:        this.f17635 = setM1164;
44:        if (setM1164.size() == 0) {
45:            this.f17635.add(AbstractC8405.m13972(509)); // decoded: m13972(509)=2971017318
46:            this.f17635.add(AbstractC8405.m13972(510)); // decoded: m13972(510)=638537273
47:        }
48:        this.f17637 = AbstractC0455.m1162(AbstractC8405.m13972(497)); // decoded: m13972(497)=警告组.json
49:        m11978();
50:        C5913 c5913 = new C5913(this, 2);
51:        C5821 c5821 = C5817.f15946;
52:        AbstractC8405.m13972(1562); // decoded: m13972(1562)=hookItem
53:        AbstractC8405.m13972(1566); // decoded: m13972(1566)=onMsgListener
54:        C5817.f15943.add(new C5816(this, c5913));
55:    }
56:
57:    @Override // p026.AbstractC6311
58:    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
59:    public final String mo11235() {
60:        return AbstractC8405.m13972(498) + AbstractC0455.m1166() + AbstractC8405.m13972(496) + AbstractC8405.m13972(499); // decoded: m13972(498)=功能已关闭 请勿使用 \n仅供娱乐 使用方法 \n在 ; m13972(496)=需要检测群.json ; m13972(499)=里编辑要开启此功能的群组(按照留下的json格式添加群)\n单击可复制路径 修改完重启QQ生效\n龙图警告次数+1\n猫图警告次数-1\n警告次数3次会执行踢出
61:    }
62:
63:    @Override // p026.AbstractC6311
64:    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
65:    public final View.OnClickListener mo11247() {
66:        return new ViewOnClickListenerC5533(this);
67:    }
68:
69:    @Override // p337.AbstractC8803
70:    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
71:    public final boolean mo11251(C8785 c8785) {
72:        return true;
73:    }
74:
75:    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
76:    public final void m11978() {
77:        AbstractC0455.m1151(AbstractC8405.m13972(497), this.f17637); // decoded: m13972(497)=警告组.json
78:        AbstractC0455.m1143(AbstractC8405.m13972(496), this.f17635); // decoded: m13972(496)=需要检测群.json
79:    }
80:
```

## p040/C6434.java:1-80

```java
1:package p040;
2:
3:import androidx.compose.foundation.draganddrop.AbstractC0455;
4:import java.util.HashMap;
5:import java.util.HashSet;
6:import java.util.Set;
7:import java.util.concurrent.ExecutorService;
8:import java.util.concurrent.Executors;
9:import p287.AbstractC8405;
10:import p332.C8785;
11:import p337.AbstractC8803;
12:import top.suzhelan.qstory.hook.api.C5816;
13:import top.suzhelan.qstory.hook.api.C5817;
14:import top.suzhelan.qstory.hook.api.C5821;
15:import top.suzhelan.qstory.hook.item.C5913;
16:
17:/* JADX INFO: renamed from: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
18:/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
19:/* JADX INFO: loaded from: classes2.dex */
20:public class C6434 extends AbstractC8803 {
21:
22:    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
23:    public Set f17623;
24:
25:    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
26:    public final ExecutorService f17624 = Executors.newSingleThreadExecutor();
27:
28:    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
29:    public HashMap f17625;
30:
31:    public C6434() {
32:        AbstractC8405.m13972(496); // decoded: m13972(496)=需要检测群.json
33:        AbstractC8405.m13972(497); // decoded: m13972(497)=警告组.json
34:        this.f17625 = new HashMap();
35:        this.f17623 = new HashSet();
36:    }
37:
38:    @Override // p026.AbstractC6314
39:    public final void loadHook(ClassLoader classLoader) {
40:        Set setM1164 = AbstractC0455.m1164(AbstractC8405.m13972(496)); // decoded: m13972(496)=需要检测群.json
41:        this.f17623 = setM1164;
42:        if (setM1164.size() == 0) {
43:            this.f17623.add(AbstractC8405.m13972(509)); // decoded: m13972(509)=2971017318
44:            this.f17623.add(AbstractC8405.m13972(510)); // decoded: m13972(510)=638537273
45:        }
46:        this.f17625 = AbstractC0455.m1162(AbstractC8405.m13972(497)); // decoded: m13972(497)=警告组.json
47:        AbstractC0455.m1151(AbstractC8405.m13972(497), this.f17625); // decoded: m13972(497)=警告组.json
48:        AbstractC0455.m1143(AbstractC8405.m13972(496), this.f17623); // decoded: m13972(496)=需要检测群.json
49:        C5913 c5913 = new C5913(this, 3);
50:        C5821 c5821 = C5817.f15946;
51:        AbstractC8405.m13972(1562); // decoded: m13972(1562)=hookItem
52:        AbstractC8405.m13972(1566); // decoded: m13972(1566)=onMsgListener
53:        C5817.f15943.add(new C5816(this, c5913));
54:    }
55:
56:    @Override // p337.AbstractC8803
57:    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
58:    public final boolean mo11251(C8785 c8785) {
59:        return c8785.f24740.intValue() >= 2;
60:    }
61:
62:    @Override // p337.AbstractC8803
63:    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
64:    public final boolean mo11252(C8785 c8785) {
65:        return c8785.f24740.intValue() >= 2;
66:    }
67:}
68:
```

## lin/xposed/hook/util/qq/QQNTTroopTool.java:200-230

```java
200:        try {
201:            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1003)); // decoded: m13972(1003)=com.tencent.mobileqq.troop.clockin.handler.TroopClockInHandler
202:            AbstractC6333.m11847(AbstractC2905.m6285(new Object[]{Hook_cookie.getRuntime()}, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(1002))}, clsM11866), null, Void.TYPE, new Class[]{String.class, String.class}, str, str2); // decoded: m13972(1002)=com.tencent.common.app.AppInterface
203:        } catch (Exception e) {
204:            String strM13972 = AbstractC8405.m13972(733); // decoded: m13972(733)=plugin api
205:            String str3 = AbstractC6188.f17016;
206:            AbstractC6188.m11605(strM13972, e.toString(), e, true);
207:        }
208:    }
209:
210:    public static boolean isShutUp(String str) {
211:        Object groupInfo = getGroupInfo(str);
212:        return ((Long) AbstractC6336.m11864(groupInfo, AbstractC8405.m13972(996))).longValue() == 0 && ((Long) AbstractC6336.m11860(groupInfo.getClass(), AbstractC8405.m13972(997)).get(groupInfo)).longValue() == 0; // decoded: m13972(996)=dwGagTimeStamp ; m13972(997)=dwGagTimeStamp_me
213:    }
214:
215:    public static void kickMember(String str, String str2, boolean z) {
216:        try {
217:            int i = AbstractC6358.f17508;
218:            Class cls = Boolean.TYPE;
219:            if (i < 6722) {
220:                Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(DescriptorProtos$Edition.EDITION_2024_VALUE));
221:                Object objM6285 = AbstractC2905.m6285(new Object[]{Hook_cookie.getRuntime()}, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(1002))}, clsM11866); // decoded: m13972(1002)=com.tencent.common.app.AppInterface
222:                ArrayList arrayList = new ArrayList();
223:                arrayList.add(Long.valueOf(Long.parseLong(str2)));
224:                AbstractC6333.m11847(objM6285, null, Void.TYPE, new Class[]{Long.TYPE, List.class, cls, cls}, Long.valueOf(Long.parseLong(str)), arrayList, Boolean.valueOf(z), Boolean.FALSE);
225:                return;
226:            }
227:            final Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(994))); // decoded: m13972(994)=com.tencent.qqnt.troop.ITroopMemberOperationRepoApi
228:            C6335 c6335M11854 = C6335.m11854(qRouteApi.getClass());
229:            String strM13972 = AbstractC8405.m13972(DescriptorProtos$Edition.EDITION_2023_VALUE);
230:            C1245 c1245 = c6335M11854.f17458;
```

## lin/xposed/hook/util/qq/QQFriendTool.java:1-60

```java
1:package lin.xposed.hook.util.qq;
2:
3:import androidx.activity.AbstractC0053;
4:import androidx.compose.runtime.internal.C1245;
5:import com.alibaba.fastjson2.InterfaceC2916;
6:import com.alibaba.fastjson2.JSONReader$Feature;
7:import de.robv.android.xposed.XposedHelpers;
8:import java.util.ArrayList;
9:import java.util.HashMap;
10:import java.util.Map;
11:import lin.xposed.hook.javaplugin.bean.FriendInfo;
12:import p009.AbstractC6183;
13:import p010.AbstractC6188;
14:import p033.AbstractC6336;
15:import p033.AbstractC6337;
16:import p033.C6335;
17:import p037.AbstractC6370;
18:import p287.AbstractC8405;
19:import top.suzhelan.qstory.entity.QZoneFriend;
20:import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;
21:
22:/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
23:/* JADX INFO: loaded from: classes2.dex */
24:public class QQFriendTool {
25:
26:    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
27:    public static class FriendListResult {
28:        public ArrayList<NewFriendInfo> friends = new ArrayList<>();
29:        public Map<Integer, String> categories = new HashMap();
30:    }
31:
32:    public static void deleteFriend(String str) {
33:        try {
34:            Object objCallMethod = XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC8405.m13972(602), new Class[]{String.class}, new Object[]{(String) AbstractC6336.m11857(AbstractC6337.m11866(AbstractC8405.m13972(600)), String.class, AbstractC8405.m13972(952))}); // decoded: m13972(602)=getBusinessHandler ; m13972(600)=com.tencent.mobileqq.app.BusinessHandlerFactory ; m13972(952)=FRIENDLIST_HANDLER
35:            C6335 c6335M11854 = C6335.m11854(objCallMethod.getClass());
36:            c6335M11854.f17458.f3619 = new Class[]{String.class, String.class, Byte.TYPE, Integer.TYPE};
37:            String strM13972 = AbstractC8405.m13972(953); // decoded: m13972(953)=delFriend
38:            C1245 c1245 = c6335M11854.f17458;
39:            c1245.f3618 = strM13972;
40:            c1245.f3617 = Void.TYPE;
41:            c6335M11854.m11856(objCallMethod, AbstractC8405.m13972(954), str, (byte) 2, 0); // decoded: m13972(954)=ProfileCardMoreActivity
42:        } catch (Exception e) {
43:            String strM139722 = AbstractC8405.m13972(955); // decoded: m13972(955)=deleteFriend
44:            String str2 = AbstractC6188.f17016;
45:            AbstractC6188.m11605(strM139722, e.toString(), e, true);
46:        }
47:    }
48:
49:    public static ArrayList<FriendInfo> getAllFriend() {
50:        ArrayList<FriendInfo> arrayList = new ArrayList<>();
51:        long gtk = QQEnvTool.getGTK(Hook_cookie.getPskey(AbstractC8405.m13972(946))); // decoded: m13972(946)=qzone.qq.com
52:        StringBuilder sbM140 = AbstractC0053.m140(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵") + QQEnvTool.getCurrentUin()); // decoded: inline=uin=o
53:        sbM140.append(AbstractC8405.m13972(947)); // decoded: m13972(947)=; p_uin=o=
54:        sbM140.append(QQEnvTool.getCurrentUin());
55:        StringBuilder sbM1402 = AbstractC0053.m140(sbM140.toString());
56:        sbM1402.append(AbstractC8405.m13973("喵呜喵喵呜喵喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜~喵呜喵呜呜呜喵喵")); // decoded: inline=; skey=
57:        sbM1402.append(Hook_cookie.getSkey());
58:        StringBuilder sbM1403 = AbstractC0053.m140(sbM1402.toString());
59:        sbM1403.append(AbstractC8405.m13972(948)); // decoded: m13972(948)=; p_skey=
60:        sbM1403.append(Hook_cookie.getPskey(AbstractC8405.m13972(946))); // decoded: m13972(946)=qzone.qq.com
```

## lin/xposed/hook/util/qq/QQNTTroopSettingTool.java:1-45

```java
1:package lin.xposed.hook.util.qq;
2:
3:import androidx.compose.runtime.internal.C1245;
4:import p010.AbstractC6188;
5:import p033.AbstractC6337;
6:import p033.C6335;
7:import p287.AbstractC8405;
8:
9:/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
10:/* JADX INFO: loaded from: classes2.dex */
11:public class QQNTTroopSettingTool {
12:    public static void quitGroup(String str) {
13:        try {
14:            Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(975))); // decoded: m13972(975)=com.tencent.qqnt.troop.ITroopOperationRepoApi
15:            C6335 c6335M11854 = C6335.m11854(qRouteApi.getClass());
16:            String strM13972 = AbstractC8405.m13972(976); // decoded: m13972(976)=quitGroup
17:            C1245 c1245 = c6335M11854.f17458;
18:            c1245.f3618 = strM13972;
19:            c1245.f3619 = new Class[]{String.class, Boolean.TYPE, Object.class, String.class, Object.class};
20:            c1245.f3617 = Void.TYPE;
21:            c6335M11854.m11856(qRouteApi, str, Boolean.FALSE, null, AbstractC8405.m13972(977), null); // decoded: m13972(977)=TroopSettingViewModel
22:        } catch (Exception e) {
23:            String strM139722 = AbstractC8405.m13972(976); // decoded: m13972(976)=quitGroup
24:            String str2 = AbstractC6188.f17016;
25:            AbstractC6188.m11605(strM139722, e.toString(), e, true);
26:        }
27:    }
28:}
29:
```

## top/suzhelan/qstory/hook/item/CallableC5911.java:55-88

```java
55:            case 1:
56:                XC_MethodHook.MethodHookParam methodHookParam = (XC_MethodHook.MethodHookParam) obj2;
57:                C5936.f16128 = obj;
58:                Object objectField = XposedHelpers.getObjectField(obj, AbstractC8405.m13972(593)); // decoded: m13972(593)=filePath
59:                String str = objectField instanceof String ? (String) objectField : null;
60:                if (str == null) {
61:                    str = "";
62:                }
63:                Object objCallMethod = XposedHelpers.callMethod(methodHookParam.thisObject, AbstractC8405.m13972(2013), new Object[0]); // decoded: m13972(2013)=getMContext
64:                AbstractC8405.m13972(2014); // decoded: m13972(2014)=null cannot be cast to non-null type android.content.Context
65:                objCallMethod.getClass();
66:                Context context = (Context) objCallMethod;
67:                try {
68:                    Intent intent = new Intent(context, (Class<?>) AbstractC6337.m11866(AbstractC8405.m13972(548))); // decoded: m13972(548)=com.tencent.mobileqq.activity.ForwardRecentActivity
69:                    intent.putExtra(AbstractC8405.m13972(526), 2); // decoded: m13972(526)=selection_mode
70:                    intent.putExtra(AbstractC8405.m13972(1993), false); // decoded: m13972(1993)=direct_send_if_dataline_forward
71:                    intent.putExtra(AbstractC8405.m13972(1994), str); // decoded: m13972(1994)=forward_text
72:                    intent.putExtra(AbstractC8405.m13972(1995), -1); // decoded: m13972(1995)=forward_type
73:                    intent.putExtra(AbstractC8405.m13972(1996), true); // decoded: m13972(1996)=forward_from_jump
74:                    intent.putExtra(AbstractC8405.m13972(1990), AbstractC8405.m13973("喵呜喵喵喵喵呜喵~喵呜喵喵喵呜喵喵~喵呜喵喵呜呜呜喵~喵呜喵呜呜呜喵呜~喵呜喵呜喵呜喵喵~喵呜喵呜呜喵喵喵")); // decoded: m13972(1990)=ptt_forward ; inline=114514
75:                    intent.putExtra(AbstractC8405.m13972(1997), AbstractC8405.m13972(1998)); // decoded: m13972(1997)=caller_name ; m13972(1998)=ChatActivity
76:                    intent.putExtra(AbstractC8405.m13972(1999), false); // decoded: m13972(1999)=k_smartdevice
77:                    intent.putExtra(AbstractC8405.m13972(2000), false); // decoded: m13972(2000)=k_dataline
78:                    intent.putExtra(AbstractC8405.m13972(2001), true); // decoded: m13972(2001)=is_need_show_toast
79:                    intent.putExtra(AbstractC8405.m13972(2002), AbstractC8405.m13972(2003)); // decoded: m13972(2002)=k_forward_title ; m13972(2003)=语音转发
80:                    if (!(context instanceof Activity)) {
81:                        intent.addFlags(268435456);
82:                    }
83:                    context.startActivity(intent);
84:                    XposedBridge.log(AbstractC8405.m13972(2004)); // decoded: m13972(2004)=PttForward: 启动转发界面成功
85:                } catch (Exception e) {
86:                    XposedBridge.log(AbstractC8405.m13972(2005) + e.getMessage()); // decoded: m13972(2005)=PttForward: 启动转发界面失败: 
87:                }
88:                break;
```

## lin/xposed/hook/javaplugin/util/PluginSendMsgTool.java:78-86

```java
78:                if (findResult.key.equals(AbstractC8405.m13973("喵喵呜喵喵喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵喵呜~喵喵呜呜呜呜喵呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵喵喵喵"))) { // decoded: inline=PicUrl
79:                    arrayList.add(CreateElement.createPicElement(findResult.content));
80:                } else if (findResult.key.equals(AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜喵呜喵呜呜~喵喵呜呜呜喵喵呜"))) { // decoded: inline=AtQQ
81:                    String uidFromUin = findResult.content;
82:                    if (!uidFromUin.equals(AbstractC8405.m13973("喵呜喵喵喵喵呜呜"))) { // decoded: inline=0
83:                        uidFromUin = QQEnvTool.getUidFromUin(uidFromUin);
84:                    }
85:                    if (uidFromUin.isEmpty()) {
86:                        arrayList.add(CreateElement.createTextElement(AbstractC8405.m13972(734))); // decoded: m13972(734)=@艾特失败
```