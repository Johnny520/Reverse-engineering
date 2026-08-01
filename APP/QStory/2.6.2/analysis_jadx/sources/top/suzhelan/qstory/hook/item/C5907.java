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
                    for (Object obj2 : (ArrayList) AbstractC6317.m11831(ArrayList.class, AbstractC3056.m6668(-3937563413614691751L), obj)) {
                        if (((Integer) AbstractC6317.m11831(cls2, AbstractC3056.m6668(-3937563452269397415L), obj2)).intValue() == 9 && (iIntValue = ((Integer) XposedHelpers.callMethod(obj, AbstractC3056.m6668(-3937609185081165223L), new Object[0])).intValue()) != 1 && iIntValue != 100) {
                            c5922.m11256(obj, XposedHelpers.callMethod(obj2, AbstractC3056.m6668(-3937661038221329831L), new Object[0]));
                        }
                    }
                } catch (Exception e) {
                    c5922.getExceptionCollectionToolInstance().m11804(e);
                    return;
                }
                break;
            case 1:
                C5951 c5951 = (C5951) abstractC8805;
                AbstractC3056.m6668(-3937747568927442343L);
                obj.getClass();
                try {
                    Object objM14649 = C9117.m14649(ArrayList.class, AbstractC3056.m6668(-3937563413614691751L), obj);
                    AbstractC3056.m6668(-3937727850732586407L);
                    objM14649.getClass();
                    Iterator it = ((ArrayList) objM14649).iterator();
                    AbstractC3056.m6668(-3937693916195980711L);
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC3056.m6668(-3937693873246307751L);
                        next.getClass();
                        Object objM146492 = C9117.m14649(cls2, AbstractC3056.m6668(-3937563452269397415L), next);
                        AbstractC3056.m6668(-3937727850732586407L);
                        objM146492.getClass();
                        if (((Number) objM146492).intValue() == 9) {
                            Object objCallMethod = XposedHelpers.callMethod(obj, AbstractC3056.m6668(-3937609185081165223L), new Object[0]);
                            AbstractC3056.m6668(-3937753135205057959L);
                            objCallMethod.getClass();
                            int iIntValue3 = ((Integer) objCallMethod).intValue();
                            if (iIntValue3 != 1 && iIntValue3 != 100) {
                                Object objCallMethod2 = XposedHelpers.callMethod(next, AbstractC3056.m6668(-3937661038221329831L), new Object[0]);
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
                    String uinFromUid = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937592177010673063L), obj);
                    final long jLongValue = ((Long) AbstractC6317.m11831(cls, AbstractC3056.m6668(-3937611379809453479L), obj)).longValue();
                    final long jLongValue2 = ((Long) AbstractC6317.m11831(cls, AbstractC3056.m6668(-3937565221795923367L), obj)).longValue();
                    final int iIntValue4 = ((Integer) XposedHelpers.callMethod(obj, AbstractC3056.m6668(-3937609185081165223L), new Object[0])).intValue();
                    if (iIntValue4 == 100 || iIntValue4 == 1) {
                        uinFromUid = QQEnvTool.getUinFromUid(uinFromUid);
                    }
                    if (c6448.f17683.contains(uinFromUid)) {
                        ArrayList arrayList = (ArrayList) AbstractC6317.m11831(ArrayList.class, AbstractC3056.m6668(-3937563413614691751L), obj);
                        final ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            C6316 c6316M11826 = C6316.m11826(obj3.getClass());
                            long j2 = j;
                            c6316M11826.f17409.f3617 = AbstractC3056.m6668(-3937579635706168743L);
                            c6316M11826.f17409.f3616 = AbstractC6318.m11838(AbstractC3056.m6668(j2));
                            Object objM11828 = c6316M11826.m11828(obj3, new Object[0]);
                            if (objM11828 != null) {
                                arrayList2.add(AbstractC3056.m6668(-3937609133541557671L) + ((String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937575551192270247L), objM11828)).toUpperCase() + AbstractC3056.m6668(-3937609039052277159L));
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
                                            jSONObject.put(AbstractC3056.m6668(-3937610245938087335L), str3);
                                            JSONArray jSONArray = new JSONArray();
                                            jSONArray.add(AbstractC3056.m6668(-3937609679002404263L));
                                            jSONArray.add(AbstractC3056.m6668(-3937609691887306151L));
                                            jSONArray.add(AbstractC3056.m6668(-3937609674707436967L));
                                            jSONObject.put(AbstractC3056.m6668(-3937610190103512487L), jSONArray);
                                            try {
                                                strM11900 = AbstractC6353.m11900(AbstractC3056.m6668(-3937610125679003047L), jSONObject.toString());
                                            } catch (IOException e3) {
                                                String strM6668 = AbstractC3056.m6668(-3937609679002404263L);
                                                String str4 = AbstractC6157.f16779;
                                                AbstractC6157.m11574(strM6668, e3.toString(), e3, true);
                                                strM11900 = null;
                                            }
                                            if (JSONObject.parseObject(strM11900).getBoolean(AbstractC3056.m6668(-3937609880865867175L)).booleanValue()) {
                                                StringBuilder sbM149 = AbstractC0053.m149(str2);
                                                sbM149.append(AbstractC3056.m6668(-3937609910930638247L));
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
                                                    Object objCreateTextElement = CreateElement.createTextElement(AbstractC3056.m6668(-3937609648937633191L) + iIntValue5 + AbstractC3056.m6668(-3937609326815085991L));
                                                    arrayList4.add(objCreateReplyElement);
                                                    arrayList4.add(objCreateTextElement);
                                                    QQNTSendMsgUtils.sendMsg(contact, arrayList4);
                                                    QQNTTroopTool.shutUp(str2, String.valueOf(j4), 3600L);
                                                } else {
                                                    Object contact2 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList5 = new ArrayList();
                                                    Object objCreateReplyElement2 = CreateElement.createReplyElement(j3);
                                                    Object objCreateTextElement2 = CreateElement.createTextElement(AbstractC3056.m6668(-3937609721952077223L));
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
                                            jSONObject2.put(AbstractC3056.m6668(-3937610245938087335L), str5);
                                            JSONArray jSONArray2 = new JSONArray();
                                            jSONArray2.add(AbstractC3056.m6668(-3937610160038741415L));
                                            jSONArray2.add(AbstractC3056.m6668(-3937610147153839527L));
                                            jSONArray2.add(AbstractC3056.m6668(-3937610194398479783L));
                                            jSONArray2.add(AbstractC3056.m6668(-3937610207283381671L));
                                            jSONObject2.put(AbstractC3056.m6668(-3937610190103512487L), jSONArray2);
                                            try {
                                                strM119002 = AbstractC6353.m11900(AbstractC3056.m6668(-3937610125679003047L), jSONObject2.toString());
                                            } catch (IOException unused2) {
                                                strM119002 = null;
                                            }
                                            if (JSONObject.parseObject(strM119002).getBoolean(AbstractC3056.m6668(-3937609880865867175L)).booleanValue()) {
                                                StringBuilder sbM1492 = AbstractC0053.m149(str2);
                                                sbM1492.append(AbstractC3056.m6668(-3937609910930638247L));
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
                                                    sb.append(AbstractC3056.m6668(-3937609816441357735L));
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
                                            jSONObject.put(AbstractC3056.m6668(-3937610245938087335L), str3);
                                            JSONArray jSONArray = new JSONArray();
                                            jSONArray.add(AbstractC3056.m6668(-3937609679002404263L));
                                            jSONArray.add(AbstractC3056.m6668(-3937609691887306151L));
                                            jSONArray.add(AbstractC3056.m6668(-3937609674707436967L));
                                            jSONObject.put(AbstractC3056.m6668(-3937610190103512487L), jSONArray);
                                            try {
                                                strM11900 = AbstractC6353.m11900(AbstractC3056.m6668(-3937610125679003047L), jSONObject.toString());
                                            } catch (IOException e3) {
                                                String strM6668 = AbstractC3056.m6668(-3937609679002404263L);
                                                String str4 = AbstractC6157.f16779;
                                                AbstractC6157.m11574(strM6668, e3.toString(), e3, true);
                                                strM11900 = null;
                                            }
                                            if (JSONObject.parseObject(strM11900).getBoolean(AbstractC3056.m6668(-3937609880865867175L)).booleanValue()) {
                                                StringBuilder sbM149 = AbstractC0053.m149(str2);
                                                sbM149.append(AbstractC3056.m6668(-3937609910930638247L));
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
                                                    Object objCreateTextElement = CreateElement.createTextElement(AbstractC3056.m6668(-3937609648937633191L) + iIntValue5 + AbstractC3056.m6668(-3937609326815085991L));
                                                    arrayList4.add(objCreateReplyElement);
                                                    arrayList4.add(objCreateTextElement);
                                                    QQNTSendMsgUtils.sendMsg(contact, arrayList4);
                                                    QQNTTroopTool.shutUp(str2, String.valueOf(j4), 3600L);
                                                } else {
                                                    Object contact2 = QQSessionUtils.QQNT.getContact(i4, str2);
                                                    ArrayList arrayList5 = new ArrayList();
                                                    Object objCreateReplyElement2 = CreateElement.createReplyElement(j3);
                                                    Object objCreateTextElement2 = CreateElement.createTextElement(AbstractC3056.m6668(-3937609721952077223L));
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
                                            jSONObject2.put(AbstractC3056.m6668(-3937610245938087335L), str5);
                                            JSONArray jSONArray2 = new JSONArray();
                                            jSONArray2.add(AbstractC3056.m6668(-3937610160038741415L));
                                            jSONArray2.add(AbstractC3056.m6668(-3937610147153839527L));
                                            jSONArray2.add(AbstractC3056.m6668(-3937610194398479783L));
                                            jSONArray2.add(AbstractC3056.m6668(-3937610207283381671L));
                                            jSONObject2.put(AbstractC3056.m6668(-3937610190103512487L), jSONArray2);
                                            try {
                                                strM119002 = AbstractC6353.m11900(AbstractC3056.m6668(-3937610125679003047L), jSONObject2.toString());
                                            } catch (IOException unused2) {
                                                strM119002 = null;
                                            }
                                            if (JSONObject.parseObject(strM119002).getBoolean(AbstractC3056.m6668(-3937609880865867175L)).booleanValue()) {
                                                StringBuilder sbM1492 = AbstractC0053.m149(str2);
                                                sbM1492.append(AbstractC3056.m6668(-3937609910930638247L));
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
                                                    sb.append(AbstractC3056.m6668(-3937609816441357735L));
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
                    String strM6668 = AbstractC3056.m6668(-3937609017577440679L);
                    String str2 = AbstractC6157.f16779;
                    AbstractC6157.m11574(strM6668, e3.toString(), e3, true);
                    return;
                }
                break;
            case 3:
                final C6444 c6444 = (C6444) abstractC8805;
                try {
                    String uinFromUid2 = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937592177010673063L), obj);
                    final long jLongValue3 = ((Long) AbstractC6317.m11831(cls, AbstractC3056.m6668(-3937611379809453479L), obj)).longValue();
                    final long jLongValue4 = ((Long) AbstractC6317.m11831(cls, AbstractC3056.m6668(-3937565221795923367L), obj)).longValue();
                    final int iIntValue5 = ((Integer) XposedHelpers.callMethod(obj, AbstractC3056.m6668(-3937609185081165223L), new Object[0])).intValue();
                    if (iIntValue5 == 100 || iIntValue5 == 1) {
                        uinFromUid2 = QQEnvTool.getUinFromUid(uinFromUid2);
                    }
                    if (c6444.f17671.contains(uinFromUid2)) {
                        ArrayList arrayList3 = (ArrayList) AbstractC6317.m11831(ArrayList.class, AbstractC3056.m6668(-3937563413614691751L), obj);
                        final ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            C6316 c6316M118262 = C6316.m11826(obj4.getClass());
                            c6316M118262.f17409.f3617 = AbstractC3056.m6668(-3937579635706168743L);
                            c6316M118262.f17409.f3616 = AbstractC6318.m11838(AbstractC3056.m6668(-3937575778825536935L));
                            Object objM118282 = c6316M118262.m11828(obj4, new Object[0]);
                            if (objM118282 != null) {
                                arrayList4.add(AbstractC3056.m6668(-3937609133541557671L) + ((String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937575551192270247L), objM118282)).toUpperCase() + AbstractC3056.m6668(-3937609039052277159L));
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
                                    jSONObject.put(AbstractC3056.m6668(-3937610245938087335L), str4);
                                    JSONArray jSONArray = new JSONArray();
                                    jSONArray.add(AbstractC3056.m6668(-3937609679002404263L));
                                    jSONArray.add(AbstractC3056.m6668(-3937609691887306151L));
                                    jSONArray.add(AbstractC3056.m6668(-3937609674707436967L));
                                    jSONObject.put(AbstractC3056.m6668(-3937610190103512487L), jSONArray);
                                    try {
                                        strM11900 = AbstractC6353.m11900(AbstractC3056.m6668(-3937610125679003047L), jSONObject.toString());
                                    } catch (IOException e4) {
                                        String strM66682 = AbstractC3056.m6668(-3937609679002404263L);
                                        String str5 = AbstractC6157.f16779;
                                        AbstractC6157.m11574(strM66682, e4.toString(), e4, true);
                                        strM11900 = null;
                                    }
                                    if (JSONObject.parseObject(strM11900).getBoolean(AbstractC3056.m6668(-3937609880865867175L)).booleanValue()) {
                                        int i4 = this.f17675;
                                        String str6 = this.f17676;
                                        Object contact = QQSessionUtils.QQNT.getContact(i4, str6);
                                        ArrayList arrayList5 = new ArrayList();
                                        Object objCreateReplyElement = CreateElement.createReplyElement(this.f17674);
                                        Object objCreateTextElement = CreateElement.createTextElement(AbstractC3056.m6668(-3937622190242137511L));
                                        arrayList5.add(objCreateReplyElement);
                                        arrayList5.add(objCreateTextElement);
                                        QQNTSendMsgUtils.sendMsg(contact, arrayList5);
                                        Object contact2 = QQSessionUtils.QQNT.getContact(1, QQEnvTool.getCurrentUin());
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(AbstractC3056.m6668(-3937621906774295975L));
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
                    String strM66682 = AbstractC3056.m6668(-3937609017577440679L);
                    String str4 = AbstractC6157.f16779;
                    AbstractC6157.m11574(strM66682, e4.toString(), e4, true);
                    return;
                }
                break;
            default:
                C8784 c8784 = (C8784) abstractC8805;
                try {
                    AbstractC6436.m11936(obj);
                    for (Object obj5 : (ArrayList) AbstractC6317.m11831(ArrayList.class, AbstractC3056.m6668(-3937563413614691751L), obj)) {
                        if (((Integer) AbstractC6317.m11831(cls2, AbstractC3056.m6668(-3937563452269397415L), obj5)).intValue() == 9 && (iIntValue2 = ((Integer) XposedHelpers.callMethod(obj, AbstractC3056.m6668(-3937609185081165223L), new Object[0])).intValue()) != 1 && iIntValue2 != 100) {
                            c8784.m14443(obj, XposedHelpers.callMethod(obj5, AbstractC3056.m6668(-3937661038221329831L), new Object[0]));
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
