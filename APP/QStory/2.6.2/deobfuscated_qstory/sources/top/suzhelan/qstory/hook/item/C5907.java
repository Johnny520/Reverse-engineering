package top.suzhelan.qstory.hook.item;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import lin.xposed.hook.util.qq.CreateElement;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQNTTroopTool;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p010.AbstractC6157;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p036.AbstractC6353;
import p041.AbstractC6436;
import p043.C6444;
import p043.C6448;
import p328.C8784;
import p336.AbstractC8805;
import p392.C9117;
import top.suzhelan.qstory.hook.api.InterfaceC5814;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5907 implements InterfaceC5814 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8805 f16092;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16093;

    public /* synthetic */ C5907(AbstractC8805 abstractC8805, int i) {
        this.f16093 = i;
        this.f16092 = abstractC8805;
    }

    @Override // top.suzhelan.qstory.hook.api.InterfaceC5814
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo10807(Object obj) {
        int iIntValue;
        int iIntValue2;
        int i = this.f16093;
        long j = -3937575778825536935L;
        Class cls = Long.TYPE;
        Class cls2 = Integer.TYPE;
        AbstractC8805 abstractC8805 = this.f16092;
        switch (i) {
            case 0:
                C5922 c5922 = (C5922) abstractC8805;
                try {
                    for (Object obj2 : (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", obj)) {
                        if (((Integer) AbstractC6317.m11831(cls2, "elementType", obj2)).intValue() == 9 && (iIntValue = ((Integer) XposedHelpers.callMethod(obj, "getChatType", new Object[0])).intValue()) != 1 && iIntValue != 100) {
                            c5922.m11256(obj, XposedHelpers.callMethod(obj2, "getWalletElement", new Object[0]));
                        }
                    }
                } catch (Exception e) {
                    c5922.getExceptionCollectionToolInstance().m11804(e);
                    return;
                }
                break;
            case 1:
                C5951 c5951 = (C5951) abstractC8805;
                "msgRecord";
                obj.getClass();
                try {
                    Object objM14649 = C9117.m14649(ArrayList.class, "elements", obj);
                    "getField(...)";
                    objM14649.getClass();
                    Iterator it = ((ArrayList) objM14649).iterator();
                    "iterator(...)";
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        "next(...)";
                        next.getClass();
                        Object objM146492 = C9117.m14649(cls2, "elementType", next);
                        "getField(...)";
                        objM146492.getClass();
                        if (((Number) objM146492).intValue() == 9) {
                            Object objCallMethod = XposedHelpers.callMethod(obj, "getChatType", new Object[0]);
                            "null cannot be cast to non-null type kotlin.Int";
                            objCallMethod.getClass();
                            int iIntValue3 = ((Integer) objCallMethod).intValue();
                            if (iIntValue3 != 1 && iIntValue3 != 100) {
                                Object objCallMethod2 = XposedHelpers.callMethod(next, "getWalletElement", new Object[0]);
                                objCallMethod2.getClass();
                                c5951.m11268(obj, objCallMethod2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    c5951.getExceptionCollectionToolInstance().m11804(e2);
                    return;
                }
                break;
            case 2:
                final C6448 c6448 = (C6448) abstractC8805;
                ExecutorService executorService = c6448.f17684;
                try {
                    String uinFromUid = (String) AbstractC6317.m11831(String.class, "peerUid", obj);
                    final long jLongValue = ((Long) AbstractC6317.m11831(cls, "senderUin", obj)).longValue();
                    final long jLongValue2 = ((Long) AbstractC6317.m11831(cls, "msgId", obj)).longValue();
                    final int iIntValue4 = ((Integer) XposedHelpers.callMethod(obj, "getChatType", new Object[0])).intValue();
                    if (iIntValue4 == 100 || iIntValue4 == 1) {
                        uinFromUid = QQEnvTool.getUinFromUid(uinFromUid);
                    }
                    if (c6448.f17683.contains(uinFromUid)) {
                        ArrayList arrayList = (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", obj);
                        final ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            C6316 c6316M11826 = C6316.m11826(obj3.getClass());
                            long j2 = j;
                            c6316M11826.f17409.f3617 = "getPicElement";
                            c6316M11826.f17409.f3616 = AbstractC6318.m11838(AbstractC3056.m6668(j2));
                            Object objM11828 = c6316M11826.m11828(obj3, new Object[0]);
                            if (objM11828 != null) {
                                arrayList2.add("https://gchat.qpic.cn/gchatpic_new/0/0-0-" + ((String) AbstractC6317.m11831(String.class, "md5HexStr", objM11828)).toUpperCase() + "/0");
                            }
                            j = j2;
                        }
                        if (arrayList2.size() != 0) {
                            final int i2 = 0;
                            final String str = uinFromUid;
                            executorService.execute(new Runnable() { // from class: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪世苏哲兰
                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    String strM11900;
                                    String strM119002;
                                    int i3 = i2;
                                    long j3 = jLongValue2;
                                    int i4 = iIntValue4;
                                    long j4 = jLongValue;
                                    String str2 = str;
                                    ArrayList arrayList3 = arrayList2;
                                    C6448 c64482 = c6448;
                                    switch (i3) {
                                        case 0:
                                            String str3 = (String) arrayList3.get(0);
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("url", str3);
                                            JSONArray jSONArray = new JSONArray();
                                            jSONArray.add("\u9f99\u56fe");
                                            jSONArray.add("\u9f99\u7389\u6d9b");
                                            jSONArray.add("\u9f99\u6897");
                                            jSONObject.put("textList", jSONArray);
                                            try {
                                                strM11900 = AbstractC6353.m11900("https://search.linl.top/google/v2/imageContain", jSONObject.toString());
                                            } catch (IOException e3) {
                                                String strM6668 = "\u9f99\u56fe";
                                                String str4 = AbstractC6157.f16779;
                                                AbstractC6157.m11574(strM6668, e3.toString(), e3, true);
                                                strM11900 = null;
                                            }
                                            if (JSONObject.parseObject(strM11900).getBoolean("result").booleanValue()) {
                                                StringBuilder sbM149 = AbstractC0053.m149(str2);
                                                sbM149.append(":");
                                                sbM149.append(j4);
                                                String string = sbM149.toString();
                                                Integer num = (Integer) c64482.f17685.get(string);
                                                if (num == null) {
                                                    num = 0;
                                                }
                                                int iIntValue5 = num.intValue() + 1;
                                                c64482.f17685.put(string, Integer.valueOf(iIntValue5));
                                                c64482.m11940();
                                                if (iIntValue5 < 3) {
                                                    Object contact = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    Object objCreateReplyElement = CreateElement.createReplyElement(j3);
                                                    Object objCreateTextElement = CreateElement.createTextElement("\u6b64\u6d88\u606f\u88ab\u9274\u5b9a\u4e3a\u9f99\u56fe,\u5df2\u8fdb\u884c\u7981\u8a00\n\n\u5982\u679c\u8bef\u5224\u8bf7\u5728\u7fa4\u5185\u53d1\u9001 : \u8bf7\u7ed9\u6211\u89e3\u7981\n\u6211\u53ea\u662f\u673a\u5668\u4eba\u79c1\u804a\u6211\u662f\u6ca1\u6709\u7528\u7684\u54e6\n\n\u5f53\u524d\u8b66\u544a\u6b21\u6570:" + iIntValue5 + " \u8fbe\u52303\u6b21\u5c06\u4f1a\u8e22\u51fa");
                                                    arrayList4.add(objCreateReplyElement);
                                                    arrayList4.add(objCreateTextElement);
                                                    QQNTSendMsgUtils.sendMsg(contact, arrayList4);
                                                    QQNTTroopTool.shutUp(str2, String.valueOf(j4), 3600L);
                                                } else {
                                                    Object contact2 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList5 = new ArrayList();
                                                    Object objCreateReplyElement2 = CreateElement.createReplyElement(j3);
                                                    Object objCreateTextElement2 = CreateElement.createTextElement("\u8b66\u544a\u6b21\u6570\u5230\u8fbe3\u6b21 \u5df2\u79fb\u51fa\u7fa4\u804a");
                                                    arrayList5.add(objCreateReplyElement2);
                                                    arrayList5.add(objCreateTextElement2);
                                                    QQNTSendMsgUtils.sendMsg(contact2, arrayList5);
                                                    try {
                                                        Thread.sleep(1000L);
                                                        break;
                                                    } catch (InterruptedException unused) {
                                                    }
                                                    QQNTTroopTool.kickMember(str2, String.valueOf(j4), false);
                                                }
                                            }
                                            break;
                                        default:
                                            String str5 = (String) arrayList3.get(0);
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("url", str5);
                                            JSONArray jSONArray2 = new JSONArray();
                                            jSONArray2.add("\u78a7\u84dd\u822a\u7ebf");
                                            jSONArray2.add("\u67f4\u90e1");
                                            jSONArray2.add("\u732b\u732b");
                                            jSONArray2.add("\u732b\u7fbd\u96eb");
                                            jSONObject2.put("textList", jSONArray2);
                                            try {
                                                strM119002 = AbstractC6353.m11900("https://search.linl.top/google/v2/imageContain", jSONObject2.toString());
                                            } catch (IOException unused2) {
                                                strM119002 = null;
                                            }
                                            if (JSONObject.parseObject(strM119002).getBoolean("result").booleanValue()) {
                                                StringBuilder sbM1492 = AbstractC0053.m149(str2);
                                                sbM1492.append(":");
                                                sbM1492.append(j4);
                                                String string2 = sbM1492.toString();
                                                Integer num2 = (Integer) c64482.f17685.get(string2);
                                                if (num2 == null) {
                                                    num2 = num;
                                                }
                                                c64482.f17685.put(string2, num2);
                                                if (num2.intValue() > 0) {
                                                    Integer num3 = (Integer) c64482.f17685.get(string2);
                                                    if (num3 == null) {
                                                        num3 = num;
                                                    }
                                                    c64482.f17685.put(string2, Integer.valueOf(num3.intValue() - 1));
                                                    c64482.m11940();
                                                    Object contact3 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList6 = new ArrayList();
                                                    Object objCreateReplyElement3 = CreateElement.createReplyElement(j3);
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("\u4f60\u53d1\u9001\u7684\u662f \u78a7\u84dd\u822a\u7ebf/\u732b\u732b\n\n\u62b5\u6d88\u4e86\u4e00\u6b21\u8b66\u544a\n\n\u5f53\u524d\u8b66\u544a\u6b21\u6570:");
                                                    Integer num4 = (Integer) c64482.f17685.get(string2);
                                                    num = num4 != null ? num4 : 0;
                                                    c64482.f17685.put(string2, num);
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
                            executorService.execute(new Runnable() { // from class: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪世苏哲兰
                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    String strM11900;
                                    String strM119002;
                                    int i32 = i3;
                                    long j3 = jLongValue2;
                                    int i4 = iIntValue4;
                                    long j4 = jLongValue;
                                    String str2 = str;
                                    ArrayList arrayList3 = arrayList2;
                                    C6448 c64482 = c6448;
                                    switch (i32) {
                                        case 0:
                                            String str3 = (String) arrayList3.get(0);
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("url", str3);
                                            JSONArray jSONArray = new JSONArray();
                                            jSONArray.add("\u9f99\u56fe");
                                            jSONArray.add("\u9f99\u7389\u6d9b");
                                            jSONArray.add("\u9f99\u6897");
                                            jSONObject.put("textList", jSONArray);
                                            try {
                                                strM11900 = AbstractC6353.m11900("https://search.linl.top/google/v2/imageContain", jSONObject.toString());
                                            } catch (IOException e3) {
                                                String strM6668 = "\u9f99\u56fe";
                                                String str4 = AbstractC6157.f16779;
                                                AbstractC6157.m11574(strM6668, e3.toString(), e3, true);
                                                strM11900 = null;
                                            }
                                            if (JSONObject.parseObject(strM11900).getBoolean("result").booleanValue()) {
                                                StringBuilder sbM149 = AbstractC0053.m149(str2);
                                                sbM149.append(":");
                                                sbM149.append(j4);
                                                String string = sbM149.toString();
                                                Integer num = (Integer) c64482.f17685.get(string);
                                                if (num == null) {
                                                    num = 0;
                                                }
                                                int iIntValue5 = num.intValue() + 1;
                                                c64482.f17685.put(string, Integer.valueOf(iIntValue5));
                                                c64482.m11940();
                                                if (iIntValue5 < 3) {
                                                    Object contact = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    Object objCreateReplyElement = CreateElement.createReplyElement(j3);
                                                    Object objCreateTextElement = CreateElement.createTextElement("\u6b64\u6d88\u606f\u88ab\u9274\u5b9a\u4e3a\u9f99\u56fe,\u5df2\u8fdb\u884c\u7981\u8a00\n\n\u5982\u679c\u8bef\u5224\u8bf7\u5728\u7fa4\u5185\u53d1\u9001 : \u8bf7\u7ed9\u6211\u89e3\u7981\n\u6211\u53ea\u662f\u673a\u5668\u4eba\u79c1\u804a\u6211\u662f\u6ca1\u6709\u7528\u7684\u54e6\n\n\u5f53\u524d\u8b66\u544a\u6b21\u6570:" + iIntValue5 + " \u8fbe\u52303\u6b21\u5c06\u4f1a\u8e22\u51fa");
                                                    arrayList4.add(objCreateReplyElement);
                                                    arrayList4.add(objCreateTextElement);
                                                    QQNTSendMsgUtils.sendMsg(contact, arrayList4);
                                                    QQNTTroopTool.shutUp(str2, String.valueOf(j4), 3600L);
                                                } else {
                                                    Object contact2 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList5 = new ArrayList();
                                                    Object objCreateReplyElement2 = CreateElement.createReplyElement(j3);
                                                    Object objCreateTextElement2 = CreateElement.createTextElement("\u8b66\u544a\u6b21\u6570\u5230\u8fbe3\u6b21 \u5df2\u79fb\u51fa\u7fa4\u804a");
                                                    arrayList5.add(objCreateReplyElement2);
                                                    arrayList5.add(objCreateTextElement2);
                                                    QQNTSendMsgUtils.sendMsg(contact2, arrayList5);
                                                    try {
                                                        Thread.sleep(1000L);
                                                        break;
                                                    } catch (InterruptedException unused) {
                                                    }
                                                    QQNTTroopTool.kickMember(str2, String.valueOf(j4), false);
                                                }
                                            }
                                            break;
                                        default:
                                            String str5 = (String) arrayList3.get(0);
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("url", str5);
                                            JSONArray jSONArray2 = new JSONArray();
                                            jSONArray2.add("\u78a7\u84dd\u822a\u7ebf");
                                            jSONArray2.add("\u67f4\u90e1");
                                            jSONArray2.add("\u732b\u732b");
                                            jSONArray2.add("\u732b\u7fbd\u96eb");
                                            jSONObject2.put("textList", jSONArray2);
                                            try {
                                                strM119002 = AbstractC6353.m11900("https://search.linl.top/google/v2/imageContain", jSONObject2.toString());
                                            } catch (IOException unused2) {
                                                strM119002 = null;
                                            }
                                            if (JSONObject.parseObject(strM119002).getBoolean("result").booleanValue()) {
                                                StringBuilder sbM1492 = AbstractC0053.m149(str2);
                                                sbM1492.append(":");
                                                sbM1492.append(j4);
                                                String string2 = sbM1492.toString();
                                                Integer num2 = (Integer) c64482.f17685.get(string2);
                                                if (num2 == null) {
                                                    num2 = num;
                                                }
                                                c64482.f17685.put(string2, num2);
                                                if (num2.intValue() > 0) {
                                                    Integer num3 = (Integer) c64482.f17685.get(string2);
                                                    if (num3 == null) {
                                                        num3 = num;
                                                    }
                                                    c64482.f17685.put(string2, Integer.valueOf(num3.intValue() - 1));
                                                    c64482.m11940();
                                                    Object contact3 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList6 = new ArrayList();
                                                    Object objCreateReplyElement3 = CreateElement.createReplyElement(j3);
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("\u4f60\u53d1\u9001\u7684\u662f \u78a7\u84dd\u822a\u7ebf/\u732b\u732b\n\n\u62b5\u6d88\u4e86\u4e00\u6b21\u8b66\u544a\n\n\u5f53\u524d\u8b66\u544a\u6b21\u6570:");
                                                    Integer num4 = (Integer) c64482.f17685.get(string2);
                                                    num = num4 != null ? num4 : 0;
                                                    c64482.f17685.put(string2, num);
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
                    String strM6668 = "\u7981\u6b62\u53d1\u9f99\u56fe";
                    String str2 = AbstractC6157.f16779;
                    AbstractC6157.m11574(strM6668, e3.toString(), e3, true);
                    return;
                }
                break;
            case 3:
                final C6444 c6444 = (C6444) abstractC8805;
                try {
                    String uinFromUid2 = (String) AbstractC6317.m11831(String.class, "peerUid", obj);
                    final long jLongValue3 = ((Long) AbstractC6317.m11831(cls, "senderUin", obj)).longValue();
                    final long jLongValue4 = ((Long) AbstractC6317.m11831(cls, "msgId", obj)).longValue();
                    final int iIntValue5 = ((Integer) XposedHelpers.callMethod(obj, "getChatType", new Object[0])).intValue();
                    if (iIntValue5 == 100 || iIntValue5 == 1) {
                        uinFromUid2 = QQEnvTool.getUinFromUid(uinFromUid2);
                    }
                    if (c6444.f17671.contains(uinFromUid2)) {
                        ArrayList arrayList3 = (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", obj);
                        final ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            C6316 c6316M118262 = C6316.m11826(obj4.getClass());
                            c6316M118262.f17409.f3617 = "getPicElement";
                            c6316M118262.f17409.f3616 = AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.PicElement");
                            Object objM118282 = c6316M118262.m11828(obj4, new Object[0]);
                            if (objM118282 != null) {
                                arrayList4.add("https://gchat.qpic.cn/gchatpic_new/0/0-0-" + ((String) AbstractC6317.m11831(String.class, "md5HexStr", objM118282)).toUpperCase() + "/0");
                            }
                        }
                        if (arrayList4.size() != 0) {
                            final String str3 = uinFromUid2;
                            c6444.f17672.execute(new Runnable(c6444, arrayList4, str3, jLongValue3, iIntValue5, jLongValue4) { // from class: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪世兰苏哲

                                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                                public final /* synthetic */ long f17674;

                                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                                public final /* synthetic */ int f17675;

                                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                                public final /* synthetic */ String f17676;

                                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                                public final /* synthetic */ long f17677;

                                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                                public final /* synthetic */ ArrayList f17678;

                                {
                                    this.f17678 = arrayList4;
                                    this.f17676 = str3;
                                    this.f17677 = jLongValue3;
                                    this.f17675 = iIntValue5;
                                    this.f17674 = jLongValue4;
                                }

                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    String strM11900;
                                    String str4 = (String) this.f17678.get(0);
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("url", str4);
                                    JSONArray jSONArray = new JSONArray();
                                    jSONArray.add("\u9f99\u56fe");
                                    jSONArray.add("\u9f99\u7389\u6d9b");
                                    jSONArray.add("\u9f99\u6897");
                                    jSONObject.put("textList", jSONArray);
                                    try {
                                        strM11900 = AbstractC6353.m11900("https://search.linl.top/google/v2/imageContain", jSONObject.toString());
                                    } catch (IOException e4) {
                                        String strM66682 = "\u9f99\u56fe";
                                        String str5 = AbstractC6157.f16779;
                                        AbstractC6157.m11574(strM66682, e4.toString(), e4, true);
                                        strM11900 = null;
                                    }
                                    if (JSONObject.parseObject(strM11900).getBoolean("result").booleanValue()) {
                                        int i4 = this.f17675;
                                        String str6 = this.f17676;
                                        Object contact = QQSessionUtils.QQNT.getContact(i4, str6);
                                        ArrayList arrayList5 = new ArrayList();
                                        Object objCreateReplyElement = CreateElement.createReplyElement(this.f17674);
                                        Object objCreateTextElement = CreateElement.createTextElement("\u672c\u7fa4\u5f00\u542f\u4e86\u4e25\u683c\u68c0\u6d4b \u53d1\u9001\u9f99\u56fe/\u5f31\u667a\u62bd\u8c61\u8868\u60c5\n\n\u4f1a\u76f4\u63a5\u79fb\u51fa\u672c\u7fa4(\u5982\u679c\u8bef\u5224\u7b97\u4f60\u8fd0\u6c14\u4e0d\u597d)\n\u5f88\u9ad8\u5174\u4f60\u6765\u5230\u672c\u7fa4 \u4f46\u662f\u4f60\u53ef\u80fd\u4e0d\u9002\u5408\u5f85\u5728\u672c\u7fa4\n\n\u62dc\u62dc~");
                                        arrayList5.add(objCreateReplyElement);
                                        arrayList5.add(objCreateTextElement);
                                        QQNTSendMsgUtils.sendMsg(contact, arrayList5);
                                        Object contact2 = QQSessionUtils.QQNT.getContact(1, QQEnvTool.getCurrentUin());
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("\u5df2\u8e22\u51fa:");
                                        long j3 = this.f17677;
                                        sb.append(j3);
                                        QQNTSendMsgUtils.sendText(contact2, sb.toString());
                                        try {
                                            Thread.sleep(2000L);
                                        } catch (InterruptedException unused) {
                                        }
                                        QQNTTroopTool.kickMember(str6, String.valueOf(j3), true);
                                    }
                                }
                            });
                        }
                    }
                } catch (Exception e4) {
                    String strM66682 = "\u7981\u6b62\u53d1\u9f99\u56fe";
                    String str4 = AbstractC6157.f16779;
                    AbstractC6157.m11574(strM66682, e4.toString(), e4, true);
                    return;
                }
                break;
            default:
                C8784 c8784 = (C8784) abstractC8805;
                try {
                    AbstractC6436.m11936(obj);
                    for (Object obj5 : (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", obj)) {
                        if (((Integer) AbstractC6317.m11831(cls2, "elementType", obj5)).intValue() == 9 && (iIntValue2 = ((Integer) XposedHelpers.callMethod(obj, "getChatType", new Object[0])).intValue()) != 1 && iIntValue2 != 100) {
                            c8784.m14443(obj, XposedHelpers.callMethod(obj5, "getWalletElement", new Object[0]));
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
