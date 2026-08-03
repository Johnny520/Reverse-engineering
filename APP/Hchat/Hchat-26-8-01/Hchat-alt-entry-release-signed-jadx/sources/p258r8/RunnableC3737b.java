package p258r8;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;
import gg.AbstractC1416l;
import gg.C1425u;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;
import p002a1.RunnableC0006d;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1179u;
import p080fb.AbstractC1184v0;
import p080fb.C1113d1;
import p080fb.C1125g1;
import p080fb.C1151n;
import p080fb.C1183v;
import p085fg.InterfaceC1220a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p117i0.InterfaceC1809a1;
import p153k8.C2351o;
import p218og.AbstractC3149m;
import p259r9.C3752d0;
import p259r9.C3775y;
import p260ra.C3779c;
import p261rb.RunnableC3791g;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p332wb.AbstractC4955ho;
import p332wb.C4731au;
import p332wb.C4834e2;
import p332wb.C5000j5;
import p332wb.C5051kn;
import p332wb.C5071la;
import p332wb.C5330t5;
import p332wb.C5491y2;
import p332wb.EnumC5066l5;
import p332wb.RunnableC5378uk;
import p345x8.C5720m;
import p345x8.C5721n;
import p345x8.C5724q;
import p345x8.C5725r;
import p347xa.C5747h;
import p347xa.C5748i;
import p347xa.C5752m;
import sa.C3948b;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: r8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3737b implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12121g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f12122h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f12123i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f12124j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC3737b(C3752d0 c3752d0, TextView textView, String str) {
        this.f12121g = 1;
        this.f12123i = c3752d0;
        this.f12124j = textView;
        this.f12122h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        boolean z10;
        long jMin;
        Boolean bool;
        C3775y c3775y;
        Object c3959f;
        C5330t5 c5330t5;
        Iterator it;
        Object c3959f2;
        Object c3959f3;
        String strM3161w;
        Object c3959f4;
        C5721n c5721n;
        Object c3959f5;
        switch (this.f12121g) {
            case 0:
                C3739d c3739d = (C3739d) this.f12123i;
                String str = (String) this.f12122h;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f12124j;
                try {
                    synchronized (C3740e.f12141d) {
                        bool = (Boolean) interfaceC1220a.invoke();
                        bool.getClass();
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    if (zBooleanValue) {
                        c3739d.f12134e.set(true);
                    }
                    z9 = false;
                    c3739d.f12135f.set(false);
                    z10 = zBooleanValue;
                } catch (Throwable th2) {
                    try {
                        AbstractC1184v0.m3204n("[Hchat:DexInstall] " + c3739d.f12130a + " 安装异常: " + th2.getMessage(), th2);
                        z9 = false;
                        c3739d.f12135f.set(false);
                        z10 = false;
                    } catch (Throwable th3) {
                        c3739d.f12135f.set(false);
                        throw th3;
                    }
                }
                if (z10 || c3739d.f12134e.get() || !c3739d.f12136g.compareAndSet(z9, true)) {
                    return;
                }
                int andIncrement = c3739d.f12137h.getAndIncrement();
                if (andIncrement >= 6) {
                    c3739d.f12136g.set(z9);
                    AbstractC1184v0.m3203m("[Hchat:DexInstall] " + c3739d.f12130a + " 多次安装失败，停止本轮重试");
                    return;
                }
                Handler handler = C3740e.f12138a;
                RunnableC0006d runnableC0006d = new RunnableC0006d(c3739d, 28, str);
                if (andIncrement <= 0) {
                    jMin = 1000;
                } else {
                    jMin = 3000;
                    if (andIncrement != 1) {
                        jMin = Math.min(60000L, (1 << (andIncrement - 1)) * 3000);
                    }
                }
                handler.postDelayed(runnableC0006d, jMin);
                return;
            case 1:
                C3752d0 c3752d0 = (C3752d0) this.f12123i;
                TextView textView = (TextView) this.f12124j;
                String str2 = (String) this.f12122h;
                if (c3752d0.f12192c.getBoolean("red_packet_details_enable", false)) {
                    textView.setText(str2);
                    return;
                }
                return;
            case 2:
                C3752d0 c3752d02 = (C3752d0) this.f12123i;
                C3775y c3775y2 = (C3775y) this.f12122h;
                TextView textView2 = (TextView) this.f12124j;
                synchronized (c3752d02.f12211v) {
                    c3775y = (C3775y) c3752d02.f12211v.get(textView2);
                }
                if (c3775y == c3775y2 && textView2.getParent() != null && AbstractC1416l.m3825a(textView2.getTag(), "hchat_message_details_view")) {
                    c3752d02.m7821E(c3775y2.f12347a, c3775y2.f12348b, textView2, c3775y2.f12349c, c3775y2.f12350d, c3752d02.m7833X(c3775y2.f12350d, null, false));
                    return;
                }
                return;
            case 3:
                C3779c c3779c = (C3779c) this.f12123i;
                String str3 = (String) this.f12122h;
                String str4 = (String) this.f12124j;
                C3948b c3948b = new C3948b(0, str3, str4);
                if (TextUtils.isEmpty(str4)) {
                    c3779c.m7941o(c3948b);
                    return;
                }
                if (!c3779c.f12371a || ((TextToSpeech) c3779c.f12380j) == null) {
                    ((ArrayDeque) c3779c.f12377g).offer(c3948b);
                    c3779c.m7933f();
                    return;
                } else {
                    if (c3779c.m7947v(c3948b)) {
                        return;
                    }
                    c3779c.m7945s(c3948b);
                    return;
                }
            case 4:
                EnumC5066l5 enumC5066l5 = EnumC5066l5.f18554i;
                EnumC5066l5 enumC5066l52 = EnumC5066l5.f18553h;
                EnumC5066l5 enumC5066l53 = EnumC5066l5.f18552g;
                C1368i c1368i = (C1368i) this.f12123i;
                Handler handler2 = (Handler) this.f12122h;
                C5071la c5071la = (C5071la) this.f12124j;
                C4173t c4173t = C4173t.f13710g;
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    try {
                        c3959f = c1368i.m3727p();
                        break;
                    } catch (Throwable th4) {
                        c3959f = new C3959f(th4);
                    }
                    if (c3959f instanceof C3959f) {
                        c3959f = c4173t;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (ContactLabelBean contactLabelBean : (Iterable) c3959f) {
                        String string = AbstractC3149m.m6703R0(contactLabelBean.labelId).toString();
                        String string2 = AbstractC3149m.m6703R0(contactLabelBean.labelName).toString();
                        if (AbstractC3149m.m6721t0(string2)) {
                            string2 = string;
                        }
                        if (AbstractC3149m.m6721t0(string) && AbstractC3149m.m6721t0(string2)) {
                            c5330t5 = null;
                        } else {
                            List<String> list = contactLabelBean.userNameList;
                            if (list.isEmpty()) {
                                if (AbstractC3149m.m6721t0(string)) {
                                    list = c4173t;
                                } else {
                                    try {
                                        c3959f2 = c1368i.m3726o(string);
                                    } catch (Throwable th5) {
                                        c3959f2 = new C3959f(th5);
                                    }
                                    if (c3959f2 instanceof C3959f) {
                                        c3959f2 = c4173t;
                                    }
                                    list = (List) c3959f2;
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list));
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(AbstractC3149m.m6703R0((String) it2.next()).toString());
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : arrayList2) {
                                if (((String) obj).length() > 0) {
                                    arrayList3.add(obj);
                                }
                            }
                            List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList3));
                            Iterator it3 = listM8407P1.iterator();
                            while (it3.hasNext()) {
                                String str5 = (String) it3.next();
                                Object obj2 = linkedHashMap.get(str5);
                                if (obj2 == null) {
                                    it = it3;
                                    ArrayList arrayList4 = new ArrayList();
                                    linkedHashMap.put(str5, arrayList4);
                                    obj2 = arrayList4;
                                } else {
                                    it = it3;
                                }
                                ((List) obj2).add(string2);
                                it3 = it;
                            }
                            if (AbstractC3149m.m6721t0(string)) {
                                string = string2;
                            }
                            c5330t5 = new C5330t5(string, string2, listM8407P1);
                        }
                        if (c5330t5 != null) {
                            arrayList.add(c5330t5);
                        }
                        break;
                    }
                    int i9 = 8;
                    List listM8402K1 = AbstractC4166m.m8402K1(arrayList, new C4834e2(8));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator it4 = c1368i.m3736y().iterator();
                    while (it4.hasNext()) {
                        AbstractC4955ho.m9546f6(linkedHashMap2, linkedHashMap, (WeChatContact) it4.next(), enumC5066l53, false);
                    }
                    Iterator it5 = c1368i.m3735x().iterator();
                    while (it5.hasNext()) {
                        AbstractC4955ho.m9546f6(linkedHashMap2, linkedHashMap, (WeChatContact) it5.next(), enumC5066l52, true);
                    }
                    Iterator it6 = c1368i.m3713U("SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE 'gh\\_%' ESCAPE '\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)", null).iterator();
                    while (it6.hasNext()) {
                        AbstractC4955ho.m9546f6(linkedHashMap2, linkedHashMap, (WeChatContact) it6.next(), enumC5066l5, false);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it7 = listM8402K1.iterator();
                    while (it7.hasNext()) {
                        AbstractC4171r.m8432h1(arrayList5, ((C5330t5) it7.next()).f20753c);
                    }
                    List listM8407P12 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList5));
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj3 : listM8407P12) {
                        if (!linkedHashMap2.containsKey((String) obj3)) {
                            arrayList6.add(obj3);
                        }
                    }
                    if (!arrayList6.isEmpty()) {
                        for (WeChatContact weChatContact : c1368i.m3728q(arrayList6)) {
                            AbstractC4955ho.m9546f6(linkedHashMap2, linkedHashMap, weChatContact, weChatContact.isGroup() ? enumC5066l52 : weChatContact.isOfficialAccount() ? enumC5066l5 : enumC5066l53, weChatContact.isGroup());
                        }
                    }
                    Collection collectionValues = linkedHashMap2.values();
                    collectionValues.getClass();
                    handler2.post(new RunnableC3737b(c5071la, AbstractC4166m.m8402K1(collectionValues, new C5051kn(new C4834e2(7), i9)), listM8402K1, 5));
                    return;
                } catch (Throwable th6) {
                    handler2.post(new RunnableC3791g(c5071la, 10, th6));
                    return;
                }
            case 5:
                ((C5071la) this.f12123i).invoke(new C5000j5((List) this.f12122h, (List) this.f12124j), null);
                return;
            case 6:
                C4731au c4731au = (C4731au) this.f12123i;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f12122h;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f12124j;
                if (((C4731au) interfaceC1809a1.getValue()) == c4731au) {
                    interfaceC1809a1.setValue(null);
                    C5491y2.m9802S0(interfaceC1809a12, false);
                    return;
                }
                return;
            case 7:
                C1183v c1183v = (C1183v) this.f12123i;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f12122h;
                Context context = (Context) this.f12124j;
                Set set = AbstractC1179u.f3963a;
                String str6 = c1183v.f3979d;
                try {
                    if (AbstractC3149m.m6721t0(c1183v.f3976a)) {
                        throw new IllegalArgumentException("请填写 API 地址");
                    }
                    if (AbstractC3149m.m6721t0(str6)) {
                        throw new IllegalArgumentException("请填写模型");
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("model", AbstractC3149m.m6703R0(str6).toString());
                    jSONObject.put("stream", false);
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("role", "user");
                    jSONObject2.put("content", "只回复 OK");
                    jSONArray.put(jSONObject2);
                    jSONObject.put("messages", jSONArray);
                    String strM3134i0 = AbstractC1179u.m3134i0(c1183v);
                    ConcurrentHashMap.KeySetView keySetView = AbstractC1179u.f3964b;
                    try {
                        strM3161w = AbstractC1179u.m3161w(c1183v, jSONObject, null, true ^ keySetView.contains(strM3134i0));
                    } catch (C1151n unused) {
                        strM3161w = AbstractC1179u.m3161w(c1183v, jSONObject, null, false);
                        keySetView.add(strM3134i0);
                    }
                    String strM3163x = AbstractC1179u.m3163x(c1183v, strM3161w);
                    boolean zM6721t0 = AbstractC3149m.m6721t0(strM3163x);
                    c3959f3 = strM3163x;
                    if (zM6721t0) {
                        c3959f3 = "连接成功";
                    }
                    break;
                } catch (Throwable th7) {
                    c3959f3 = new C3959f(th7);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f3);
                if (thM8182b != null) {
                    AbstractC0921a.m2261x("[Hchat:ScriptAgent] 测试连接失败: ", thM8182b.getMessage(), thM8182b);
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC3737b(c3959f3, interfaceC1809a13, context, 9));
                return;
            case 8:
                ArrayList<C1113d1> arrayList7 = (ArrayList) this.f12123i;
                Context context2 = (Context) this.f12122h;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f12124j;
                try {
                    for (C1113d1 c1113d1 : arrayList7) {
                        C1125g1 c1125g1 = C1125g1.f3676a;
                        C1125g1.m2870n(context2, c1113d1);
                    }
                    c3959f4 = C3967n.f12976a;
                    break;
                } catch (Throwable th8) {
                    c3959f4 = new C3959f(th8);
                }
                if (!(c3959f4 instanceof C3959f)) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC5378uk(interfaceC1809a14, 1));
                }
                Throwable thM8182b2 = C3960g.m8182b(c3959f4);
                if (thM8182b2 != null) {
                    AbstractC1184v0.m3204n("[Hchat:ScriptAgent] 保存历史会话排序失败", thM8182b2);
                    return;
                }
                return;
            case 9:
                Serializable serializable = (Serializable) this.f12123i;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f12122h;
                Context context3 = (Context) this.f12124j;
                interfaceC1809a15.setValue(Boolean.FALSE);
                if (!(serializable instanceof C3959f)) {
                    Toast.makeText(context3, "连接成功", 0).show();
                }
                Throwable thM8182b3 = C3960g.m8182b(serializable);
                if (thM8182b3 != null) {
                    String message = thM8182b3.getMessage();
                    if (message == null) {
                        message = "连接失败";
                    }
                    Toast.makeText(context3, message, 1).show();
                    return;
                }
                return;
            case 10:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f12123i;
                AtomicReference atomicReference = (AtomicReference) this.f12122h;
                C1425u c1425u = (C1425u) this.f12124j;
                if (!atomicBoolean.get() || (c5721n = (C5721n) atomicReference.get()) == null) {
                    return;
                }
                Object obj4 = c1425u.f4738g;
                if (obj4 != null) {
                    c5721n.m10325b((C5720m) obj4);
                    return;
                } else {
                    AbstractC1416l.m3831g("socketRequest");
                    throw null;
                }
            case 11:
                Context context4 = (Context) this.f12123i;
                C5725r c5725r = (C5725r) this.f12122h;
                C2351o c2351o = (C2351o) this.f12124j;
                ExecutorService executorService = C5724q.f23297a;
                try {
                    C5724q.m10370p(context4, c5725r, c2351o);
                    C5724q.m10369o(context4, c5725r, c2351o);
                    c3959f5 = C3967n.f12976a;
                    break;
                } catch (Throwable th9) {
                    c3959f5 = new C3959f(th9);
                }
                Throwable thM8182b4 = C3960g.m8182b(c3959f5);
                if (thM8182b4 != null) {
                    AbstractC0921a.m2261x("[Hchat:AutoReply] 处理消息失败: ", thM8182b4.getMessage(), thM8182b4);
                    return;
                }
                return;
            default:
                ((C5752m) this.f12123i).m10449i(new C5748i((Activity) this.f12122h, ((C5747h) this.f12124j).f23403b, true));
                return;
        }
    }

    public /* synthetic */ RunnableC3737b(Object obj, Object obj2, Object obj3, int i9) {
        this.f12121g = i9;
        this.f12123i = obj;
        this.f12122h = obj2;
        this.f12124j = obj3;
    }
}
