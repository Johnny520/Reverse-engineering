package top.suzhelan.qstory.hook.item;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import de.robv.android.xposed.XposedHelpers;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import lin.xposed.hook.util.p011qq.CreateElement;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.util.p011qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.p011qq.QQNTTroopTool;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import p026.AbstractC7017;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p053.AbstractC7199;
import p056.C7263;
import p056.C7267;
import p058.AbstractC7275;
import p352.C9631;
import p353.AbstractC9632;
import p405.C9915;
import top.suzhelan.qstory.hook.api.InterfaceC6645;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6743 implements InterfaceC6645 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9632 f16446;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16447;

    public /* synthetic */ C6743(AbstractC9632 abstractC9632, int i) {
        this.f16447 = i;
        this.f16446 = abstractC9632;
    }

    @Override // top.suzhelan.qstory.hook.api.InterfaceC6645
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11423(Object obj) {
        int iIntValue;
        int iIntValue2;
        int i = this.f16447;
        Class cls = Long.TYPE;
        Class cls2 = Integer.TYPE;
        AbstractC9632 abstractC9632 = this.f16446;
        switch (i) {
            case 0:
                C6758 c6758 = (C6758) abstractC9632;
                try {
                    for (Object obj2 : (ArrayList) AbstractC7165.m12418(ArrayList.class, "elements", obj)) {
                        if (((Integer) AbstractC7165.m12418(cls2, "elementType", obj2)).intValue() == 9 && (iIntValue = ((Integer) XposedHelpers.callMethod(obj, "getChatType", new Object[0])).intValue()) != 1 && iIntValue != 100) {
                            c6758.m11875(obj, XposedHelpers.callMethod(obj2, "getWalletElement", new Object[0]));
                        }
                    }
                } catch (Exception e) {
                    c6758.getExceptionCollectionToolInstance().m12391(e);
                    return;
                }
                break;
            case 1:
                C6784 c6784 = (C6784) abstractC9632;
                "msgRecord";
                obj.getClass();
                try {
                    Object objM15222 = C9915.m15222(ArrayList.class, "elements", obj);
                    "getField(...)";
                    objM15222.getClass();
                    Iterator it = ((ArrayList) objM15222).iterator();
                    "iterator(...)";
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        "next(...)";
                        next.getClass();
                        Object objM152222 = C9915.m15222(cls2, "elementType", next);
                        "getField(...)";
                        objM152222.getClass();
                        if (((Number) objM152222).intValue() == 9) {
                            Object objCallMethod = XposedHelpers.callMethod(obj, "getChatType", new Object[0]);
                            "null cannot be cast to non-null type kotlin.Int";
                            objCallMethod.getClass();
                            int iIntValue3 = ((Integer) objCallMethod).intValue();
                            if (iIntValue3 != 1 && iIntValue3 != 100) {
                                Object objCallMethod2 = XposedHelpers.callMethod(next, "getWalletElement", new Object[0]);
                                objCallMethod2.getClass();
                                c6784.m11887(obj, objCallMethod2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    c6784.getExceptionCollectionToolInstance().m12391(e2);
                    return;
                }
                break;
            case 2:
                final C7267 c7267 = (C7267) abstractC9632;
                ExecutorService executorService = c7267.f17981;
                try {
                    String uinFromUid = (String) AbstractC7165.m12418(String.class, "peerUid", obj);
                    final long jLongValue = ((Long) AbstractC7165.m12418(cls, "senderUin", obj)).longValue();
                    final long jLongValue2 = ((Long) AbstractC7165.m12418(cls, "msgId", obj)).longValue();
                    final int iIntValue4 = ((Integer) XposedHelpers.callMethod(obj, "getChatType", new Object[0])).intValue();
                    if (iIntValue4 == 100 || iIntValue4 == 1) {
                        uinFromUid = QQEnvTool.getUinFromUid(uinFromUid);
                    }
                    if (c7267.f17980.contains(uinFromUid)) {
                        ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, "elements", obj);
                        final ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            C7164 c7164M12413 = C7164.m12413(obj3.getClass());
                            c7164M12413.f17803.f3963 = "getPicElement";
                            c7164M12413.f17803.f3962 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.PicElement");
                            Object objM12415 = c7164M12413.m12415(obj3, new Object[0]);
                            if (objM12415 != null) {
                                arrayList2.add("https://gchat.qpic.cn/gchatpic_new/0/0-0-" + ((String) AbstractC7165.m12418(String.class, "md5HexStr", objM12415)).toUpperCase() + "/0");
                            }
                        }
                        if (arrayList2.size() != 0) {
                            final int i2 = 0;
                            final String str = uinFromUid;
                            executorService.execute(new Runnable() { // from class: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世苏哲兰
                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    String strM12507;
                                    String strM125072;
                                    int i3 = i2;
                                    long j = jLongValue2;
                                    int i4 = iIntValue4;
                                    long j2 = jLongValue;
                                    String str2 = str;
                                    ArrayList arrayList3 = arrayList2;
                                    C7267 c72672 = c7267;
                                    switch (i3) {
                                        case 0:
                                            String str3 = (String) arrayList3.get(0);
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("url", str3);
                                            JSONArray jSONArray = new JSONArray();
                                            jSONArray.add("龙图");
                                            jSONArray.add("龙玉涛");
                                            jSONArray.add("龙梗");
                                            jSONObject.put("textList", jSONArray);
                                            try {
                                                strM12507 = AbstractC7199.m12507("https://search.linl.top/google/v2/imageContain", jSONObject.toString());
                                            } catch (IOException e3) {
                                                String strM14532 = "龙图";
                                                String str4 = AbstractC7017.f17361;
                                                AbstractC7017.m12164(strM14532, e3.toString(), e3, true);
                                                strM12507 = null;
                                            }
                                            if (JSONObject.parseObject(strM12507).getBoolean("result").booleanValue()) {
                                                StringBuilder sbM700 = AbstractC0900.m700(str2);
                                                sbM700.append(":");
                                                sbM700.append(j2);
                                                String string = sbM700.toString();
                                                Integer num = (Integer) c72672.f17982.get(string);
                                                if (num == null) {
                                                    num = 0;
                                                }
                                                int iIntValue5 = num.intValue() + 1;
                                                c72672.f17982.put(string, Integer.valueOf(iIntValue5));
                                                c72672.m12537();
                                                if (iIntValue5 < 3) {
                                                    Object contact = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    Object objCreateReplyElement = CreateElement.createReplyElement(j);
                                                    Object objCreateTextElement = CreateElement.createTextElement("此消息被鉴定为龙图,已进行禁言\n\n如果误判请在群内发送 : 请给我解禁\n我只是机器人私聊我是没有用的哦\n\n当前警告次数:" + iIntValue5 + " 达到3次将会踢出");
                                                    arrayList4.add(objCreateReplyElement);
                                                    arrayList4.add(objCreateTextElement);
                                                    QQNTSendMsgUtils.sendMsg(contact, arrayList4);
                                                    QQNTTroopTool.shutUp(str2, String.valueOf(j2), 3600L);
                                                } else {
                                                    Object contact2 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList5 = new ArrayList();
                                                    Object objCreateReplyElement2 = CreateElement.createReplyElement(j);
                                                    Object objCreateTextElement2 = CreateElement.createTextElement("警告次数到达3次 已移出群聊");
                                                    arrayList5.add(objCreateReplyElement2);
                                                    arrayList5.add(objCreateTextElement2);
                                                    QQNTSendMsgUtils.sendMsg(contact2, arrayList5);
                                                    try {
                                                        Thread.sleep(1000L);
                                                        break;
                                                    } catch (InterruptedException unused) {
                                                    }
                                                    QQNTTroopTool.kickMember(str2, String.valueOf(j2), false);
                                                }
                                            }
                                            break;
                                        default:
                                            String str5 = (String) arrayList3.get(0);
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("url", str5);
                                            JSONArray jSONArray2 = new JSONArray();
                                            jSONArray2.add("碧蓝航线");
                                            jSONArray2.add("柴郡");
                                            jSONArray2.add("猫猫");
                                            jSONArray2.add("猫羽雫");
                                            jSONObject2.put("textList", jSONArray2);
                                            try {
                                                strM125072 = AbstractC7199.m12507("https://search.linl.top/google/v2/imageContain", jSONObject2.toString());
                                            } catch (IOException unused2) {
                                                strM125072 = null;
                                            }
                                            if (JSONObject.parseObject(strM125072).getBoolean("result").booleanValue()) {
                                                StringBuilder sbM7002 = AbstractC0900.m700(str2);
                                                sbM7002.append(":");
                                                sbM7002.append(j2);
                                                String string2 = sbM7002.toString();
                                                Integer num2 = (Integer) c72672.f17982.get(string2);
                                                if (num2 == null) {
                                                    num2 = num;
                                                }
                                                c72672.f17982.put(string2, num2);
                                                if (num2.intValue() > 0) {
                                                    Integer num3 = (Integer) c72672.f17982.get(string2);
                                                    if (num3 == null) {
                                                        num3 = num;
                                                    }
                                                    c72672.f17982.put(string2, Integer.valueOf(num3.intValue() - 1));
                                                    c72672.m12537();
                                                    Object contact3 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList6 = new ArrayList();
                                                    Object objCreateReplyElement3 = CreateElement.createReplyElement(j);
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("你发送的是 碧蓝航线/猫猫\n\n抵消了一次警告\n\n当前警告次数:");
                                                    Integer num4 = (Integer) c72672.f17982.get(string2);
                                                    num = num4 != null ? num4 : 0;
                                                    c72672.f17982.put(string2, num);
                                                    sb.append(num.intValue());
                                                    Object objCreateTextElement3 = CreateElement.createTextElement(sb.toString());
                                                    arrayList6.add(objCreateReplyElement3);
                                                    arrayList6.add(objCreateTextElement3);
                                                    QQNTSendMsgUtils.sendMsg(contact3, arrayList6);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            final int i3 = 1;
                            executorService.execute(new Runnable() { // from class: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世苏哲兰
                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    String strM12507;
                                    String strM125072;
                                    int i32 = i3;
                                    long j = jLongValue2;
                                    int i4 = iIntValue4;
                                    long j2 = jLongValue;
                                    String str2 = str;
                                    ArrayList arrayList3 = arrayList2;
                                    C7267 c72672 = c7267;
                                    switch (i32) {
                                        case 0:
                                            String str3 = (String) arrayList3.get(0);
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("url", str3);
                                            JSONArray jSONArray = new JSONArray();
                                            jSONArray.add("龙图");
                                            jSONArray.add("龙玉涛");
                                            jSONArray.add("龙梗");
                                            jSONObject.put("textList", jSONArray);
                                            try {
                                                strM12507 = AbstractC7199.m12507("https://search.linl.top/google/v2/imageContain", jSONObject.toString());
                                            } catch (IOException e3) {
                                                String strM14532 = "龙图";
                                                String str4 = AbstractC7017.f17361;
                                                AbstractC7017.m12164(strM14532, e3.toString(), e3, true);
                                                strM12507 = null;
                                            }
                                            if (JSONObject.parseObject(strM12507).getBoolean("result").booleanValue()) {
                                                StringBuilder sbM700 = AbstractC0900.m700(str2);
                                                sbM700.append(":");
                                                sbM700.append(j2);
                                                String string = sbM700.toString();
                                                Integer num = (Integer) c72672.f17982.get(string);
                                                if (num == null) {
                                                    num = 0;
                                                }
                                                int iIntValue5 = num.intValue() + 1;
                                                c72672.f17982.put(string, Integer.valueOf(iIntValue5));
                                                c72672.m12537();
                                                if (iIntValue5 < 3) {
                                                    Object contact = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    Object objCreateReplyElement = CreateElement.createReplyElement(j);
                                                    Object objCreateTextElement = CreateElement.createTextElement("此消息被鉴定为龙图,已进行禁言\n\n如果误判请在群内发送 : 请给我解禁\n我只是机器人私聊我是没有用的哦\n\n当前警告次数:" + iIntValue5 + " 达到3次将会踢出");
                                                    arrayList4.add(objCreateReplyElement);
                                                    arrayList4.add(objCreateTextElement);
                                                    QQNTSendMsgUtils.sendMsg(contact, arrayList4);
                                                    QQNTTroopTool.shutUp(str2, String.valueOf(j2), 3600L);
                                                } else {
                                                    Object contact2 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList5 = new ArrayList();
                                                    Object objCreateReplyElement2 = CreateElement.createReplyElement(j);
                                                    Object objCreateTextElement2 = CreateElement.createTextElement("警告次数到达3次 已移出群聊");
                                                    arrayList5.add(objCreateReplyElement2);
                                                    arrayList5.add(objCreateTextElement2);
                                                    QQNTSendMsgUtils.sendMsg(contact2, arrayList5);
                                                    try {
                                                        Thread.sleep(1000L);
                                                        break;
                                                    } catch (InterruptedException unused) {
                                                    }
                                                    QQNTTroopTool.kickMember(str2, String.valueOf(j2), false);
                                                }
                                            }
                                            break;
                                        default:
                                            String str5 = (String) arrayList3.get(0);
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("url", str5);
                                            JSONArray jSONArray2 = new JSONArray();
                                            jSONArray2.add("碧蓝航线");
                                            jSONArray2.add("柴郡");
                                            jSONArray2.add("猫猫");
                                            jSONArray2.add("猫羽雫");
                                            jSONObject2.put("textList", jSONArray2);
                                            try {
                                                strM125072 = AbstractC7199.m12507("https://search.linl.top/google/v2/imageContain", jSONObject2.toString());
                                            } catch (IOException unused2) {
                                                strM125072 = null;
                                            }
                                            if (JSONObject.parseObject(strM125072).getBoolean("result").booleanValue()) {
                                                StringBuilder sbM7002 = AbstractC0900.m700(str2);
                                                sbM7002.append(":");
                                                sbM7002.append(j2);
                                                String string2 = sbM7002.toString();
                                                Integer num2 = (Integer) c72672.f17982.get(string2);
                                                if (num2 == null) {
                                                    num2 = num;
                                                }
                                                c72672.f17982.put(string2, num2);
                                                if (num2.intValue() > 0) {
                                                    Integer num3 = (Integer) c72672.f17982.get(string2);
                                                    if (num3 == null) {
                                                        num3 = num;
                                                    }
                                                    c72672.f17982.put(string2, Integer.valueOf(num3.intValue() - 1));
                                                    c72672.m12537();
                                                    Object contact3 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList6 = new ArrayList();
                                                    Object objCreateReplyElement3 = CreateElement.createReplyElement(j);
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("你发送的是 碧蓝航线/猫猫\n\n抵消了一次警告\n\n当前警告次数:");
                                                    Integer num4 = (Integer) c72672.f17982.get(string2);
                                                    num = num4 != null ? num4 : 0;
                                                    c72672.f17982.put(string2, num);
                                                    sb.append(num.intValue());
                                                    Object objCreateTextElement3 = CreateElement.createTextElement(sb.toString());
                                                    arrayList6.add(objCreateReplyElement3);
                                                    arrayList6.add(objCreateTextElement3);
                                                    QQNTSendMsgUtils.sendMsg(contact3, arrayList6);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                    }
                } catch (Exception e3) {
                    String strM14531 = "禁止发龙图";
                    String str2 = AbstractC7017.f17361;
                    AbstractC7017.m12164(strM14531, e3.toString(), e3, true);
                    return;
                }
                break;
            case 3:
                final C7263 c7263 = (C7263) abstractC9632;
                try {
                    String uinFromUid2 = (String) AbstractC7165.m12418(String.class, "peerUid", obj);
                    final long jLongValue3 = ((Long) AbstractC7165.m12418(cls, "senderUin", obj)).longValue();
                    final long jLongValue4 = ((Long) AbstractC7165.m12418(cls, "msgId", obj)).longValue();
                    final int iIntValue5 = ((Integer) XposedHelpers.callMethod(obj, "getChatType", new Object[0])).intValue();
                    if (iIntValue5 == 100 || iIntValue5 == 1) {
                        uinFromUid2 = QQEnvTool.getUinFromUid(uinFromUid2);
                    }
                    if (c7263.f17968.contains(uinFromUid2)) {
                        ArrayList arrayList3 = (ArrayList) AbstractC7165.m12418(ArrayList.class, "elements", obj);
                        final ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            C7164 c7164M124132 = C7164.m12413(obj4.getClass());
                            c7164M124132.f17803.f3963 = "getPicElement";
                            c7164M124132.f17803.f3962 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.PicElement");
                            Object objM124152 = c7164M124132.m12415(obj4, new Object[0]);
                            if (objM124152 != null) {
                                arrayList4.add("https://gchat.qpic.cn/gchatpic_new/0/0-0-" + ((String) AbstractC7165.m12418(String.class, "md5HexStr", objM124152)).toUpperCase() + "/0");
                            }
                        }
                        if (arrayList4.size() != 0) {
                            final String str3 = uinFromUid2;
                            c7263.f17969.execute(new Runnable(c7263, arrayList4, str3, jLongValue3, iIntValue5, jLongValue4) { // from class: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世兰苏哲

                                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                                public final /* synthetic */ long f17971;

                                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                                public final /* synthetic */ int f17972;

                                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                                public final /* synthetic */ String f17973;

                                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                                public final /* synthetic */ long f17974;

                                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                                public final /* synthetic */ ArrayList f17975;

                                {
                                    this.f17975 = arrayList4;
                                    this.f17973 = str3;
                                    this.f17974 = jLongValue3;
                                    this.f17972 = iIntValue5;
                                    this.f17971 = jLongValue4;
                                }

                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    String strM12507;
                                    String str4 = (String) this.f17975.get(0);
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("url", str4);
                                    JSONArray jSONArray = new JSONArray();
                                    jSONArray.add("龙图");
                                    jSONArray.add("龙玉涛");
                                    jSONArray.add("龙梗");
                                    jSONObject.put("textList", jSONArray);
                                    try {
                                        strM12507 = AbstractC7199.m12507("https://search.linl.top/google/v2/imageContain", jSONObject.toString());
                                    } catch (IOException e4) {
                                        String strM14532 = "龙图";
                                        String str5 = AbstractC7017.f17361;
                                        AbstractC7017.m12164(strM14532, e4.toString(), e4, true);
                                        strM12507 = null;
                                    }
                                    if (JSONObject.parseObject(strM12507).getBoolean("result").booleanValue()) {
                                        int i4 = this.f17972;
                                        String str6 = this.f17973;
                                        Object contact = QQSessionUtils.QQNT.getContact(i4, str6);
                                        ArrayList arrayList5 = new ArrayList();
                                        Object objCreateReplyElement = CreateElement.createReplyElement(this.f17971);
                                        Object objCreateTextElement = CreateElement.createTextElement("本群开启了严格检测 发送龙图/弱智抽象表情\n\n会直接移出本群(如果误判算你运气不好)\n很高兴你来到本群 但是你可能不适合待在本群\n\n拜拜~");
                                        arrayList5.add(objCreateReplyElement);
                                        arrayList5.add(objCreateTextElement);
                                        QQNTSendMsgUtils.sendMsg(contact, arrayList5);
                                        Object contact2 = QQSessionUtils.QQNT.getContact(1, QQEnvTool.getCurrentUin());
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("已踢出:");
                                        long j = this.f17974;
                                        sb.append(j);
                                        QQNTSendMsgUtils.sendText(contact2, sb.toString());
                                        try {
                                            Thread.sleep(2000L);
                                        } catch (InterruptedException unused) {
                                        }
                                        QQNTTroopTool.kickMember(str6, String.valueOf(j), true);
                                    }
                                }
                            });
                        }
                    }
                } catch (Exception e4) {
                    String strM145312 = "禁止发龙图";
                    String str4 = AbstractC7017.f17361;
                    AbstractC7017.m12164(strM145312, e4.toString(), e4, true);
                    return;
                }
                break;
            default:
                C9631 c9631 = (C9631) abstractC9632;
                try {
                    AbstractC7275.m12539(obj);
                    for (Object obj5 : (ArrayList) AbstractC7165.m12418(ArrayList.class, "elements", obj)) {
                        if (((Integer) AbstractC7165.m12418(cls2, "elementType", obj5)).intValue() == 9 && (iIntValue2 = ((Integer) XposedHelpers.callMethod(obj, "getChatType", new Object[0])).intValue()) != 1 && iIntValue2 != 100) {
                            c9631.m15034(obj, XposedHelpers.callMethod(obj5, "getWalletElement", new Object[0]));
                        }
                        break;
                    }
                    break;
                } catch (Exception unused) {
                }
                break;
        }
    }
}
