package top.suzhelan.qstory.hook.item;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
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
import p010.AbstractC6188;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p037.AbstractC6370;
import p040.C6434;
import p040.C6438;
import p042.AbstractC6446;
import p287.AbstractC8405;
import p336.C8802;
import p337.AbstractC8803;
import p389.C9086;
import top.suzhelan.qstory.hook.api.InterfaceC5815;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5913 implements InterfaceC5815 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8803 f16101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16102;

    public /* synthetic */ C5913(AbstractC8803 abstractC8803, int i) {
        this.f16102 = i;
        this.f16101 = abstractC8803;
    }

    @Override // top.suzhelan.qstory.hook.api.InterfaceC5815
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo10864(Object obj) {
        int iIntValue;
        int iIntValue2;
        int i = this.f16102;
        Class cls = Long.TYPE;
        Class cls2 = Integer.TYPE;
        AbstractC8803 abstractC8803 = this.f16101;
        switch (i) {
            case 0:
                C5928 c5928 = (C5928) abstractC8803;
                try {
                    for (Object obj2 : (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj)) {
                        if (((Integer) AbstractC6336.m11859(cls2, AbstractC8405.m13972(338), obj2)).intValue() == 9 && (iIntValue = ((Integer) XposedHelpers.callMethod(obj, AbstractC8405.m13972(511), new Object[0])).intValue()) != 1 && iIntValue != 100) {
                            c5928.m11316(obj, XposedHelpers.callMethod(obj2, AbstractC8405.m13972(1081), new Object[0]));
                        }
                    }
                } catch (Exception e) {
                    c5928.getExceptionCollectionToolInstance().m11832(e);
                    return;
                }
                break;
            case 1:
                C5954 c5954 = (C5954) abstractC8803;
                AbstractC8405.m13972(1909);
                obj.getClass();
                try {
                    Object objM14663 = C9086.m14663(ArrayList.class, AbstractC8405.m13972(152), obj);
                    AbstractC8405.m13972(1588);
                    objM14663.getClass();
                    Iterator it = ((ArrayList) objM14663).iterator();
                    AbstractC8405.m13972(1253);
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC8405.m13972(1254);
                        next.getClass();
                        Object objM146632 = C9086.m14663(cls2, AbstractC8405.m13972(338), next);
                        AbstractC8405.m13972(1588);
                        objM146632.getClass();
                        if (((Number) objM146632).intValue() == 9) {
                            Object objCallMethod = XposedHelpers.callMethod(obj, AbstractC8405.m13972(511), new Object[0]);
                            AbstractC8405.m13972(1866);
                            objCallMethod.getClass();
                            int iIntValue3 = ((Integer) objCallMethod).intValue();
                            if (iIntValue3 != 1 && iIntValue3 != 100) {
                                Object objCallMethod2 = XposedHelpers.callMethod(next, AbstractC8405.m13972(1081), new Object[0]);
                                objCallMethod2.getClass();
                                c5954.m11328(obj, objCallMethod2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    c5954.getExceptionCollectionToolInstance().m11832(e2);
                    return;
                }
                break;
            case 2:
                final C6438 c6438 = (C6438) abstractC8803;
                ExecutorService executorService = c6438.f17636;
                try {
                    String uinFromUid = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), obj);
                    final long jLongValue = ((Long) AbstractC6336.m11859(cls, AbstractC8405.m13972(483), obj)).longValue();
                    final long jLongValue2 = ((Long) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj)).longValue();
                    final int iIntValue4 = ((Integer) XposedHelpers.callMethod(obj, AbstractC8405.m13972(511), new Object[0])).intValue();
                    if (iIntValue4 == 100 || iIntValue4 == 1) {
                        uinFromUid = QQEnvTool.getUinFromUid(uinFromUid);
                    }
                    if (c6438.f17635.contains(uinFromUid)) {
                        ArrayList arrayList = (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj);
                        final ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            C6335 c6335M11854 = C6335.m11854(obj3.getClass());
                            c6335M11854.f17458.f3618 = AbstractC8405.m13972(140);
                            c6335M11854.f17458.f3617 = AbstractC6337.m11866(AbstractC8405.m13972(178));
                            Object objM11856 = c6335M11854.m11856(obj3, new Object[0]);
                            if (objM11856 != null) {
                                arrayList2.add(AbstractC8405.m13972(512) + ((String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(179), objM11856)).toUpperCase() + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵呜喵喵喵呜喵呜"));
                            }
                        }
                        if (arrayList2.size() != 0) {
                            final int i2 = 0;
                            final String str = uinFromUid;
                            executorService.execute(new Runnable() { // from class: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世苏哲兰
                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    String strM11948;
                                    String strM119482;
                                    int i3 = i2;
                                    long j = jLongValue2;
                                    int i4 = iIntValue4;
                                    long j2 = jLongValue;
                                    String str2 = str;
                                    ArrayList arrayList3 = arrayList2;
                                    C6438 c64382 = c6438;
                                    switch (i3) {
                                        case 0:
                                            String str3 = (String) arrayList3.get(0);
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵"), str3);
                                            JSONArray jSONArray = new JSONArray();
                                            jSONArray.add(AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜喵呜~呜呜呜呜呜呜呜喵~呜呜喵呜喵喵呜喵"));
                                            jSONArray.add(AbstractC8405.m13972(505));
                                            jSONArray.add(AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜呜喵~呜呜喵喵喵呜呜呜~呜呜呜呜呜喵呜呜"));
                                            jSONObject.put(AbstractC8405.m13972(502), jSONArray);
                                            try {
                                                strM11948 = AbstractC6370.m11948(AbstractC8405.m13972(503), jSONObject.toString());
                                            } catch (IOException e3) {
                                                String strM13973 = AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜喵呜~呜呜呜呜呜呜呜喵~呜呜喵呜喵喵呜喵");
                                                String str4 = AbstractC6188.f17016;
                                                AbstractC6188.m11605(strM13973, e3.toString(), e3, true);
                                                strM11948 = null;
                                            }
                                            if (JSONObject.parseObject(strM11948).getBoolean(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵")).booleanValue()) {
                                                StringBuilder sbM140 = AbstractC0053.m140(str2);
                                                sbM140.append(AbstractC8405.m13973("喵呜喵喵呜喵喵呜"));
                                                sbM140.append(j2);
                                                String string = sbM140.toString();
                                                Integer num = (Integer) c64382.f17637.get(string);
                                                if (num == null) {
                                                    num = 0;
                                                }
                                                int iIntValue5 = num.intValue() + 1;
                                                c64382.f17637.put(string, Integer.valueOf(iIntValue5));
                                                c64382.m11978();
                                                if (iIntValue5 < 3) {
                                                    Object contact = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    Object objCreateReplyElement = CreateElement.createReplyElement(j);
                                                    Object objCreateTextElement = CreateElement.createTextElement(AbstractC8405.m13972(507) + iIntValue5 + AbstractC8405.m13972(508));
                                                    arrayList4.add(objCreateReplyElement);
                                                    arrayList4.add(objCreateTextElement);
                                                    QQNTSendMsgUtils.sendMsg(contact, arrayList4);
                                                    QQNTTroopTool.shutUp(str2, String.valueOf(j2), 3600L);
                                                } else {
                                                    Object contact2 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList5 = new ArrayList();
                                                    Object objCreateReplyElement2 = CreateElement.createReplyElement(j);
                                                    Object objCreateTextElement2 = CreateElement.createTextElement(AbstractC8405.m13972(506));
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
                                            jSONObject2.put(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵"), str5);
                                            JSONArray jSONArray2 = new JSONArray();
                                            jSONArray2.add(AbstractC8405.m13972(500));
                                            jSONArray2.add(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵呜喵~呜呜喵喵呜呜呜喵~呜喵喵喵喵喵喵呜~呜呜呜喵喵呜呜喵~呜呜喵喵呜呜喵呜"));
                                            jSONArray2.add(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜呜呜呜喵喵呜~呜呜喵呜喵喵喵呜~呜喵喵喵呜呜呜呜~呜呜呜喵呜喵喵呜~呜呜喵喵喵呜呜呜"));
                                            jSONArray2.add(AbstractC8405.m13972(501));
                                            jSONObject2.put(AbstractC8405.m13972(502), jSONArray2);
                                            try {
                                                strM119482 = AbstractC6370.m11948(AbstractC8405.m13972(503), jSONObject2.toString());
                                            } catch (IOException unused2) {
                                                strM119482 = null;
                                            }
                                            if (JSONObject.parseObject(strM119482).getBoolean(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵")).booleanValue()) {
                                                StringBuilder sbM1402 = AbstractC0053.m140(str2);
                                                sbM1402.append(AbstractC8405.m13973("喵呜喵喵呜喵喵呜"));
                                                sbM1402.append(j2);
                                                String string2 = sbM1402.toString();
                                                Integer num2 = (Integer) c64382.f17637.get(string2);
                                                if (num2 == null) {
                                                    num2 = num;
                                                }
                                                c64382.f17637.put(string2, num2);
                                                if (num2.intValue() > 0) {
                                                    Integer num3 = (Integer) c64382.f17637.get(string2);
                                                    if (num3 == null) {
                                                        num3 = num;
                                                    }
                                                    c64382.f17637.put(string2, Integer.valueOf(num3.intValue() - 1));
                                                    c64382.m11978();
                                                    Object contact3 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList6 = new ArrayList();
                                                    Object objCreateReplyElement3 = CreateElement.createReplyElement(j);
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(AbstractC8405.m13972(504));
                                                    Integer num4 = (Integer) c64382.f17637.get(string2);
                                                    num = num4 != null ? num4 : 0;
                                                    c64382.f17637.put(string2, num);
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
                                    String strM11948;
                                    String strM119482;
                                    int i32 = i3;
                                    long j = jLongValue2;
                                    int i4 = iIntValue4;
                                    long j2 = jLongValue;
                                    String str2 = str;
                                    ArrayList arrayList3 = arrayList2;
                                    C6438 c64382 = c6438;
                                    switch (i32) {
                                        case 0:
                                            String str3 = (String) arrayList3.get(0);
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵"), str3);
                                            JSONArray jSONArray = new JSONArray();
                                            jSONArray.add(AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜喵呜~呜呜呜呜呜呜呜喵~呜呜喵呜喵喵呜喵"));
                                            jSONArray.add(AbstractC8405.m13972(505));
                                            jSONArray.add(AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜呜喵~呜呜喵喵喵呜呜呜~呜呜呜呜呜喵呜呜"));
                                            jSONObject.put(AbstractC8405.m13972(502), jSONArray);
                                            try {
                                                strM11948 = AbstractC6370.m11948(AbstractC8405.m13972(503), jSONObject.toString());
                                            } catch (IOException e3) {
                                                String strM13973 = AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜喵呜~呜呜呜呜呜呜呜喵~呜呜喵呜喵喵呜喵");
                                                String str4 = AbstractC6188.f17016;
                                                AbstractC6188.m11605(strM13973, e3.toString(), e3, true);
                                                strM11948 = null;
                                            }
                                            if (JSONObject.parseObject(strM11948).getBoolean(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵")).booleanValue()) {
                                                StringBuilder sbM140 = AbstractC0053.m140(str2);
                                                sbM140.append(AbstractC8405.m13973("喵呜喵喵呜喵喵呜"));
                                                sbM140.append(j2);
                                                String string = sbM140.toString();
                                                Integer num = (Integer) c64382.f17637.get(string);
                                                if (num == null) {
                                                    num = 0;
                                                }
                                                int iIntValue5 = num.intValue() + 1;
                                                c64382.f17637.put(string, Integer.valueOf(iIntValue5));
                                                c64382.m11978();
                                                if (iIntValue5 < 3) {
                                                    Object contact = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    Object objCreateReplyElement = CreateElement.createReplyElement(j);
                                                    Object objCreateTextElement = CreateElement.createTextElement(AbstractC8405.m13972(507) + iIntValue5 + AbstractC8405.m13972(508));
                                                    arrayList4.add(objCreateReplyElement);
                                                    arrayList4.add(objCreateTextElement);
                                                    QQNTSendMsgUtils.sendMsg(contact, arrayList4);
                                                    QQNTTroopTool.shutUp(str2, String.valueOf(j2), 3600L);
                                                } else {
                                                    Object contact2 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList5 = new ArrayList();
                                                    Object objCreateReplyElement2 = CreateElement.createReplyElement(j);
                                                    Object objCreateTextElement2 = CreateElement.createTextElement(AbstractC8405.m13972(506));
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
                                            jSONObject2.put(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵"), str5);
                                            JSONArray jSONArray2 = new JSONArray();
                                            jSONArray2.add(AbstractC8405.m13972(500));
                                            jSONArray2.add(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵呜喵~呜呜喵喵呜呜呜喵~呜喵喵喵喵喵喵呜~呜呜呜喵喵呜呜喵~呜呜喵喵呜呜喵呜"));
                                            jSONArray2.add(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜呜呜呜喵喵呜~呜呜喵呜喵喵喵呜~呜喵喵喵呜呜呜呜~呜呜呜喵呜喵喵呜~呜呜喵喵喵呜呜呜"));
                                            jSONArray2.add(AbstractC8405.m13972(501));
                                            jSONObject2.put(AbstractC8405.m13972(502), jSONArray2);
                                            try {
                                                strM119482 = AbstractC6370.m11948(AbstractC8405.m13972(503), jSONObject2.toString());
                                            } catch (IOException unused2) {
                                                strM119482 = null;
                                            }
                                            if (JSONObject.parseObject(strM119482).getBoolean(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵")).booleanValue()) {
                                                StringBuilder sbM1402 = AbstractC0053.m140(str2);
                                                sbM1402.append(AbstractC8405.m13973("喵呜喵喵呜喵喵呜"));
                                                sbM1402.append(j2);
                                                String string2 = sbM1402.toString();
                                                Integer num2 = (Integer) c64382.f17637.get(string2);
                                                if (num2 == null) {
                                                    num2 = num;
                                                }
                                                c64382.f17637.put(string2, num2);
                                                if (num2.intValue() > 0) {
                                                    Integer num3 = (Integer) c64382.f17637.get(string2);
                                                    if (num3 == null) {
                                                        num3 = num;
                                                    }
                                                    c64382.f17637.put(string2, Integer.valueOf(num3.intValue() - 1));
                                                    c64382.m11978();
                                                    Object contact3 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList6 = new ArrayList();
                                                    Object objCreateReplyElement3 = CreateElement.createReplyElement(j);
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(AbstractC8405.m13972(504));
                                                    Integer num4 = (Integer) c64382.f17637.get(string2);
                                                    num = num4 != null ? num4 : 0;
                                                    c64382.f17637.put(string2, num);
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
                    String strM13972 = AbstractC8405.m13972(513);
                    String str2 = AbstractC6188.f17016;
                    AbstractC6188.m11605(strM13972, e3.toString(), e3, true);
                    return;
                }
                break;
            case 3:
                final C6434 c6434 = (C6434) abstractC8803;
                try {
                    String uinFromUid2 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), obj);
                    final long jLongValue3 = ((Long) AbstractC6336.m11859(cls, AbstractC8405.m13972(483), obj)).longValue();
                    final long jLongValue4 = ((Long) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj)).longValue();
                    final int iIntValue5 = ((Integer) XposedHelpers.callMethod(obj, AbstractC8405.m13972(511), new Object[0])).intValue();
                    if (iIntValue5 == 100 || iIntValue5 == 1) {
                        uinFromUid2 = QQEnvTool.getUinFromUid(uinFromUid2);
                    }
                    if (c6434.f17623.contains(uinFromUid2)) {
                        ArrayList arrayList3 = (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj);
                        final ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            C6335 c6335M118542 = C6335.m11854(obj4.getClass());
                            c6335M118542.f17458.f3618 = AbstractC8405.m13972(140);
                            c6335M118542.f17458.f3617 = AbstractC6337.m11866(AbstractC8405.m13972(178));
                            Object objM118562 = c6335M118542.m11856(obj4, new Object[0]);
                            if (objM118562 != null) {
                                arrayList4.add(AbstractC8405.m13972(512) + ((String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(179), objM118562)).toUpperCase() + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵呜喵喵喵呜喵呜"));
                            }
                        }
                        if (arrayList4.size() != 0) {
                            final String str3 = uinFromUid2;
                            c6434.f17624.execute(new Runnable(c6434, arrayList4, str3, jLongValue3, iIntValue5, jLongValue4) { // from class: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世兰苏哲

                                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                                public final /* synthetic */ long f17626;

                                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                                public final /* synthetic */ int f17627;

                                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                                public final /* synthetic */ String f17628;

                                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                                public final /* synthetic */ long f17629;

                                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                                public final /* synthetic */ ArrayList f17630;

                                {
                                    this.f17630 = arrayList4;
                                    this.f17628 = str3;
                                    this.f17629 = jLongValue3;
                                    this.f17627 = iIntValue5;
                                    this.f17626 = jLongValue4;
                                }

                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    String strM11948;
                                    String str4 = (String) this.f17630.get(0);
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵"), str4);
                                    JSONArray jSONArray = new JSONArray();
                                    jSONArray.add(AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜喵呜~呜呜呜呜呜呜呜喵~呜呜喵呜喵喵呜喵"));
                                    jSONArray.add(AbstractC8405.m13972(505));
                                    jSONArray.add(AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜呜喵~呜呜喵喵喵呜呜呜~呜呜呜呜呜喵呜呜"));
                                    jSONObject.put(AbstractC8405.m13972(502), jSONArray);
                                    try {
                                        strM11948 = AbstractC6370.m11948(AbstractC8405.m13972(503), jSONObject.toString());
                                    } catch (IOException e4) {
                                        String strM13973 = AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜喵喵呜喵呜呜~呜呜呜喵喵喵呜呜~呜喵喵喵呜呜喵呜~呜呜呜呜呜呜呜喵~呜呜喵呜喵喵呜喵");
                                        String str5 = AbstractC6188.f17016;
                                        AbstractC6188.m11605(strM13973, e4.toString(), e4, true);
                                        strM11948 = null;
                                    }
                                    if (JSONObject.parseObject(strM11948).getBoolean(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵")).booleanValue()) {
                                        int i4 = this.f17627;
                                        String str6 = this.f17628;
                                        Object contact = QQSessionUtils.QQNT.getContact(i4, str6);
                                        ArrayList arrayList5 = new ArrayList();
                                        Object objCreateReplyElement = CreateElement.createReplyElement(this.f17626);
                                        Object objCreateTextElement = CreateElement.createTextElement(AbstractC8405.m13972(551));
                                        arrayList5.add(objCreateReplyElement);
                                        arrayList5.add(objCreateTextElement);
                                        QQNTSendMsgUtils.sendMsg(contact, arrayList5);
                                        Object contact2 = QQSessionUtils.QQNT.getContact(1, QQEnvTool.getCurrentUin());
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(AbstractC8405.m13972(552));
                                        long j = this.f17629;
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
                    String strM139722 = AbstractC8405.m13972(513);
                    String str4 = AbstractC6188.f17016;
                    AbstractC6188.m11605(strM139722, e4.toString(), e4, true);
                    return;
                }
                break;
            default:
                C8802 c8802 = (C8802) abstractC8803;
                try {
                    AbstractC6446.m11980(obj);
                    for (Object obj5 : (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj)) {
                        if (((Integer) AbstractC6336.m11859(cls2, AbstractC8405.m13972(338), obj5)).intValue() == 9 && (iIntValue2 = ((Integer) XposedHelpers.callMethod(obj, AbstractC8405.m13972(511), new Object[0])).intValue()) != 1 && iIntValue2 != 100) {
                            c8802.m14475(obj, XposedHelpers.callMethod(obj5, AbstractC8405.m13972(1081), new Object[0]));
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
