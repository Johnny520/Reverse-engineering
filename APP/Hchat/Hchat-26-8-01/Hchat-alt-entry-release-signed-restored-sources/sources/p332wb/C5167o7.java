package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import ca.RunnableC0523j;
import gg.C1423s;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.WebSocket;
import org.json.JSONObject;
import p011ab.C0045e;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3199a;
import p251r.C3641z;
import p261rb.C3797m;
import p276sf.C3967n;
import p317vb.InterfaceC4544a;
import p345x8.C5718k;
import p345x8.C5724q;
import p345x8.C5727t;

/* JADX INFO: renamed from: wb.o7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5167o7 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19320g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f19321h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f19322i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f19323j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f19324k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f19325l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f19326m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f19327n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f19328o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f19329p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f19330q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f19331r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5167o7(Context context, List list, String str, InterfaceC1231l interfaceC1231l, C3641z c3641z, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l2, InterfaceC1231l interfaceC1231l3, InterfaceC1235p interfaceC1235p, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, int i9) {
        this.f19321h = context;
        this.f19323j = list;
        this.f19324k = str;
        this.f19325l = interfaceC1231l;
        this.f19328o = c3641z;
        this.f19322i = interfaceC1220a;
        this.f19326m = interfaceC1231l2;
        this.f19327n = interfaceC1231l3;
        this.f19331r = interfaceC1235p;
        this.f19329p = interfaceC1220a2;
        this.f19330q = interfaceC1220a3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9;
        int i10 = this.f19320g;
        C3967n c3967n = C3967n.f12976a;
        Object obj3 = this.f19331r;
        Object obj4 = this.f19330q;
        Object obj5 = this.f19329p;
        Object obj6 = this.f19322i;
        Object obj7 = this.f19328o;
        Object obj8 = this.f19327n;
        Object obj9 = this.f19326m;
        Object obj10 = this.f19325l;
        Object obj11 = this.f19324k;
        Object obj12 = this.f19323j;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9621o0(this.f19321h, (List) obj12, (String) obj11, (InterfaceC1231l) obj10, (C3641z) obj7, (InterfaceC1220a) obj6, (InterfaceC1231l) obj9, (InterfaceC1231l) obj8, (InterfaceC1235p) obj3, (InterfaceC1220a) obj5, (InterfaceC1220a) obj4, (C1836h0) obj, AbstractC1874r.m4617C(818088961));
                break;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) obj12;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj6;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj11;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) obj10;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) obj9;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) obj8;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) obj7;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) obj5;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) obj3;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1836h0.m4519V();
                } else {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                    boolean zM4538h = c1836h0.m4538h(sharedPreferences);
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4538h || objM4514P == c1823e) {
                        objM4514P = new C5242qg(sharedPreferences, interfaceC1809a1, 16);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "自动追加标签", "保留好友现有标签后追加指定标签", false, (InterfaceC1231l) objM4514P, c1836h0, 432, 8);
                    if (((Boolean) interfaceC1809a1.getValue()).booleanValue()) {
                        c1836h0.m4525a0(-1989404301);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        String str = (String) interfaceC1809a12.getValue();
                        boolean zM4538h2 = c1836h0.m4538h(sharedPreferences);
                        Object objM4514P2 = c1836h0.m4514P();
                        if (zM4538h2 || objM4514P2 == c1823e) {
                            objM4514P2 = new C5242qg(sharedPreferences, interfaceC1809a12, 17);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9304C1("标签名称", "检测到好友关系异常时追加", str, 0, (InterfaceC1231l) objM4514P2, c1836h0, 54, 8);
                        i9 = 0;
                        c1836h0.m4553p(false);
                    } else {
                        i9 = 0;
                        c1836h0.m4525a0(-1989112157);
                        c1836h0.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, i9, 1);
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                    boolean zM4538h3 = c1836h0.m4538h(sharedPreferences);
                    Object objM4514P3 = c1836h0.m4514P();
                    if (zM4538h3 || objM4514P3 == c1823e) {
                        objM4514P3 = new C4746bc(sharedPreferences, interfaceC1809a14, interfaceC1809a13, 4);
                        c1836h0.m4545k0(objM4514P3);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue2, "自动删除异常好友", "高风险操作，默认关闭；暂停检测会取消尚未执行的删除", false, (InterfaceC1231l) objM4514P3, c1836h0, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a15.getValue()).booleanValue();
                    boolean zM4538h4 = c1836h0.m4538h(sharedPreferences);
                    Object objM4514P4 = c1836h0.m4514P();
                    if (zM4538h4 || objM4514P4 == c1823e) {
                        objM4514P4 = new C5242qg(sharedPreferences, interfaceC1809a15, 18);
                        c1836h0.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue3, "同时清理聊天记录", "同时用于自动删除和批量删除", false, (InterfaceC1231l) objM4514P4, c1836h0, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    String str2 = (String) interfaceC1809a16.getValue();
                    boolean zM4538h5 = c1836h0.m4538h(sharedPreferences);
                    Object objM4514P5 = c1836h0.m4514P();
                    if (zM4538h5 || objM4514P5 == c1823e) {
                        objM4514P5 = new C5242qg(interfaceC1809a16, sharedPreferences, 19);
                        c1836h0.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9695w2("删除间隔", "自动删除和批量删除的等待秒数，0-300", str2, (InterfaceC1231l) objM4514P5, c1836h0, 54);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    String strM6837j = ((C3797m) interfaceC1809a17.getValue()).f12474i ? AbstractC3199a.m6837j(((C3797m) interfaceC1809a17.getValue()).f12476k, "正在处理 ", "/", ((C3797m) interfaceC1809a17.getValue()).f12475j) : ((C3797m) interfaceC1809a17.getValue()).m7990a() > 0 ? AbstractC0921a.m2250m(((C3797m) interfaceC1809a17.getValue()).m7990a(), "可按标签筛选，默认选中 ", " 位异常好友") : "从好友或微信标签中多选后删除";
                    Context context = this.f19321h;
                    boolean zM4538h6 = c1836h0.m4538h(context) | c1836h0.m4534f(interfaceC1220a);
                    Object objM4514P6 = c1836h0.m4514P();
                    if (zM4538h6 || objM4514P6 == c1823e) {
                        objM4514P6 = new C0045e(context, interfaceC1220a, interfaceC1809a17, 29);
                        c1836h0.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9503b("批量删除好友", strM6837j, (InterfaceC1220a) objM4514P6, c1836h0, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    boolean zBooleanValue4 = ((Boolean) interfaceC1809a18.getValue()).booleanValue();
                    boolean zM4538h7 = c1836h0.m4538h(sharedPreferences);
                    Object objM4514P7 = c1836h0.m4514P();
                    if (zM4538h7 || objM4514P7 == c1823e) {
                        objM4514P7 = new C5242qg(sharedPreferences, interfaceC1809a18, 20);
                        c1836h0.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue4, "检测期间保持 CPU 运行", "使用 WakeLock，长时间检测会增加耗电", false, (InterfaceC1231l) objM4514P7, c1836h0, 432, 8);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9652r4(this.f19321h, (InterfaceC4544a) obj11, (Set) obj10, (Set) obj9, (List) obj12, (InterfaceC1220a) obj6, (InterfaceC1220a) obj5, (InterfaceC1220a) obj4, (InterfaceC1220a) obj8, (InterfaceC1220a) obj7, (InterfaceC1235p) obj3, (C1836h0) obj, AbstractC1874r.m4617C(920125441));
                break;
            default:
                C5718k c5718k = (C5718k) obj12;
                String str3 = (String) obj11;
                String str4 = (String) obj10;
                C5727t c5727t = (C5727t) obj9;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj8;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) obj7;
                AtomicReference atomicReference = (AtomicReference) obj6;
                C1423s c1423s = (C1423s) obj5;
                C1423s c1423s2 = (C1423s) obj4;
                C1423s c1423s3 = (C1423s) obj3;
                WebSocket webSocket = (WebSocket) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                webSocket.getClass();
                if (c5718k != null) {
                    c5718k.m10323i();
                }
                if (jSONObject != null) {
                    int iOptInt = jSONObject.optInt("sample_rate", c1423s.f4736g);
                    if (iOptInt < 8000) {
                        iOptInt = 8000;
                    }
                    c1423s.f4736g = iOptInt;
                    int iOptInt2 = jSONObject.optInt("channels", c1423s2.f4736g);
                    c1423s2.f4736g = iOptInt2 >= 1 ? iOptInt2 : 1;
                    int iOptInt3 = jSONObject.optInt("frame_duration", c1423s3.f4736g);
                    c1423s3.f4736g = iOptInt3 >= 20 ? iOptInt3 : 20;
                }
                ExecutorService executorService = C5724q.f23297a;
                ScheduledFuture scheduledFuture = (ScheduledFuture) atomicReference.getAndSet(null);
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (!atomicBoolean2.get() && !atomicBoolean.get()) {
                    if (str4.length() > 10) {
                        atomicReference.set(C5724q.f23298b.schedule(new RunnableC0523j(atomicBoolean2, atomicBoolean, this.f19321h, str4, webSocket, str3, c5727t), 0L, TimeUnit.MILLISECONDS));
                    } else {
                        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("session_id", str3, "type", "listen");
                        jSONObjectM9268l.put("state", "detect");
                        jSONObjectM9268l.put("mode", "manual");
                        jSONObjectM9268l.put(WeChatSnsPost.TYPE_TEXT, str4);
                        C5724q.m10330B(jSONObjectM9268l, c5727t);
                        String string = jSONObjectM9268l.toString();
                        string.getClass();
                        webSocket.send(string);
                    }
                }
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C5167o7(Context context, InterfaceC4544a interfaceC4544a, Set set, Set set2, List list, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, InterfaceC1220a interfaceC1220a4, InterfaceC1220a interfaceC1220a5, InterfaceC1235p interfaceC1235p, int i9) {
        this.f19321h = context;
        this.f19324k = interfaceC4544a;
        this.f19325l = set;
        this.f19326m = set2;
        this.f19323j = list;
        this.f19322i = interfaceC1220a;
        this.f19329p = interfaceC1220a2;
        this.f19330q = interfaceC1220a3;
        this.f19327n = interfaceC1220a4;
        this.f19328o = interfaceC1220a5;
        this.f19331r = interfaceC1235p;
    }

    public /* synthetic */ C5167o7(SharedPreferences sharedPreferences, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f19323j = sharedPreferences;
        this.f19321h = context;
        this.f19322i = interfaceC1220a;
        this.f19324k = interfaceC1809a1;
        this.f19325l = interfaceC1809a12;
        this.f19326m = interfaceC1809a13;
        this.f19327n = interfaceC1809a14;
        this.f19328o = interfaceC1809a15;
        this.f19329p = interfaceC1809a16;
        this.f19330q = interfaceC1809a17;
        this.f19331r = interfaceC1809a18;
    }

    public /* synthetic */ C5167o7(C5718k c5718k, Context context, String str, String str2, C5727t c5727t, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicReference atomicReference, C1423s c1423s, C1423s c1423s2, C1423s c1423s3) {
        this.f19323j = c5718k;
        this.f19321h = context;
        this.f19324k = str;
        this.f19325l = str2;
        this.f19326m = c5727t;
        this.f19327n = atomicBoolean;
        this.f19328o = atomicBoolean2;
        this.f19322i = atomicReference;
        this.f19329p = c1423s;
        this.f19330q = c1423s2;
        this.f19331r = c1423s3;
    }
}
