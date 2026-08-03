package p332wb;

import android.content.Context;
import bi.AbstractC0316d;
import bi.C0314b;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import gg.C1414j;
import gg.C1425u;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.WebSocket;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p036c9.RunnableC0496w;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.InterfaceC1809a1;
import p136j8.AbstractC2091b;
import p144k.AbstractC2192n;
import p177m2.C2767k;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3253s;
import p222p.C3213e1;
import p222p.C3216f1;
import p222p.C3248q0;
import p222p.C3256t;
import p234q.AbstractC3418a;
import p249qg.InterfaceC3599t;
import p258r8.RunnableC3737b;
import p266s0.C3878h;
import p276sf.C3967n;
import p299u9.C4287f;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p345x8.C5718k;
import p345x8.C5720m;
import p345x8.C5721n;
import p345x8.C5724q;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC3994c;
import sh.AbstractC4045s;
import sh.C4029m1;
import sh.C4041q1;

/* JADX INFO: renamed from: wb.qp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5251qp implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20267g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f20268h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ArrayList f20269i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f20270j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f20271k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f20272l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f20273m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f20274n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f20275o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f20276p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f20277q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f20278r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f20279s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f20280t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f20281u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f20282v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f20283w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f20284x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5251qp(InterfaceC1809a1 interfaceC1809a1, ArrayList arrayList, Context context, InterfaceC1809a1 interfaceC1809a12, boolean z9, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1231l interfaceC1231l, InterfaceC3599t interfaceC3599t, InterfaceC1809a1 interfaceC1809a112) {
        this.f20270j = interfaceC1809a1;
        this.f20269i = arrayList;
        this.f20282v = context;
        this.f20271k = interfaceC1809a12;
        this.f20268h = z9;
        this.f20272l = interfaceC1809a13;
        this.f20273m = interfaceC1809a14;
        this.f20274n = interfaceC1809a15;
        this.f20275o = interfaceC1809a16;
        this.f20276p = interfaceC1809a17;
        this.f20277q = interfaceC1809a18;
        this.f20278r = interfaceC1809a19;
        this.f20279s = interfaceC1809a110;
        this.f20280t = interfaceC1809a111;
        this.f20283w = interfaceC1231l;
        this.f20284x = interfaceC3599t;
        this.f20281u = interfaceC1809a112;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v50, resolved type: gg.j */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0642  */
    @Override // p085fg.InterfaceC1235p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) throws JSONException {
        Context context;
        long jM1238h;
        C5850l c5850l;
        InterfaceC1809a1 interfaceC1809a1;
        C5597e c5597e;
        C5593d c5593d;
        C5597e c5597e2;
        C5597e c5597e3;
        C5597e c5597e4;
        C5850l c5850l2;
        float f3;
        InterfaceC3599t interfaceC3599t;
        InterfaceC1809a1 interfaceC1809a12;
        InterfaceC1809a1 interfaceC1809a13;
        InterfaceC1809a1 interfaceC1809a14;
        InterfaceC1809a1 interfaceC1809a15;
        InterfaceC1809a1 interfaceC1809a16;
        C5660y c5660y;
        C1823e c1823e;
        float f10;
        boolean z9;
        InterfaceC1809a1 interfaceC1809a17;
        C1823e c1823e2;
        InterfaceC1809a1 interfaceC1809a18;
        InterfaceC3599t interfaceC3599t2;
        boolean zM4538h;
        Object objM4514P;
        String strOptString;
        switch (this.f20267g) {
            case 0:
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f20270j;
                ArrayList arrayList = this.f20269i;
                Context context2 = (Context) this.f20282v;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f20271k;
                boolean z10 = this.f20268h;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f20272l;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f20273m;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f20274n;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f20275o;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f20276p;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f20277q;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f20278r;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f20279s;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f20280t;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f20283w;
                InterfaceC3599t interfaceC3599t3 = (InterfaceC3599t) this.f20284x;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f20281u;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1823e c1823e3 = C1851l.f6155a;
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C5850l c5850l3 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(c5850l3, 1.0f), 0.0f, 620, 1);
                    C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h0, 0);
                    int iHashCode = Long.hashCode(c1836h0.f6095T);
                    C3878h c3878hM4546l = c1836h0.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6904g);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y2 = C5601f.f22758b;
                    c1836h0.m4531d0();
                    if (c1836h0.f6094S) {
                        c1836h0.m4544k(c5660y2);
                    } else {
                        c1836h0.m4551n0();
                    }
                    C5597e c5597e5 = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e5, c1836h0, c3256tM6935a);
                    C5597e c5597e6 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e6, c1836h0, c3878hM4546l);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    C5597e c5597e7 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e7, c1836h0, numValueOf);
                    C5593d c5593d2 = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d2, c1836h0);
                    C5597e c5597e8 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e8, c1836h0, interfaceC5853oM10543c);
                    String str = (String) interfaceC1809a19.getValue();
                    boolean zM4534f = c1836h0.m4534f(interfaceC1809a19);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4534f || objM4514P2 == c1823e3) {
                        context = context2;
                        objM4514P2 = new C4029m1(29, interfaceC1809a110, interfaceC1809a19);
                        c1836h0.m4545k0(objM4514P2);
                    } else {
                        context = context2;
                    }
                    AbstractC4955ho.m9678u3(str, "搜索本地插件", null, false, null, null, (InterfaceC1231l) objM4514P2, c1836h0, 48, 60);
                    float f11 = 10;
                    InterfaceC5853o interfaceC5853oM6883m = AbstractC3208d.m6883m(AbstractC3222h1.m6901d(c5850l3, 1.0f), 4, f11);
                    C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.f10298a, C5840b.f23771q, c1836h0, 48);
                    int iHashCode2 = Long.hashCode(c1836h0.f6095T);
                    C3878h c3878hM4546l2 = c1836h0.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6883m);
                    c1836h0.m4531d0();
                    if (c1836h0.f6094S) {
                        c1836h0.m4544k(c5660y2);
                    } else {
                        c1836h0.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e5, c1836h0, c3213e1M6892a);
                    AbstractC1874r.m4615A(c5597e6, c1836h0, c3878hM4546l2);
                    AbstractC2091b.m5169p(iHashCode2, c1836h0, c5597e7, c1836h0, c5593d2);
                    AbstractC1874r.m4615A(c5597e8, c1836h0, interfaceC5853oM10543c2);
                    C3216f1 c3216f1 = C3216f1.f10272a;
                    String strM6837j = AbstractC3199a.m6837j(((Set) interfaceC1809a111.getValue()).size(), "已选 ", " / ", ((List) interfaceC1809a112.getValue()).size());
                    C1858m2 c1858m2 = AbstractC0316d.f944a;
                    AbstractC4045s.m8250n(strM6837j, c3216f1.m6897a(c5850l3, true), ((C0314b) c1836h0.m4542j(c1858m2)).m1238h(), AbstractC5700d.m10248D(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, 24576, 0, 262120);
                    String str2 = z10 ? "取消当前筛选" : "全选当前筛选";
                    if (arrayList.isEmpty() || C5491y2.m9778H(interfaceC1809a110)) {
                        c1836h0.m4525a0(542017978);
                        jM1238h = ((C0314b) c1836h0.m4542j(c1858m2)).m1238h();
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(542124618);
                        jM1238h = ((C0314b) c1836h0.m4542j(c1858m2)).m1240j();
                        c1836h0.m4553p(false);
                    }
                    long j3 = jM1238h;
                    long jM10248D = AbstractC5700d.m10248D(13);
                    C2767k c2767k = C2767k.f9000j;
                    boolean z11 = (arrayList.isEmpty() || C5491y2.m9778H(interfaceC1809a110)) ? false : true;
                    boolean zM4538h2 = c1836h0.m4538h(arrayList) | c1836h0.m4536g(z10);
                    Object objM4514P3 = c1836h0.m4514P();
                    if (zM4538h2 || objM4514P3 == c1823e3) {
                        c5850l = c5850l3;
                        interfaceC1809a1 = interfaceC1809a111;
                        objM4514P3 = new C4287f(interfaceC1809a1, arrayList, z10);
                        c1836h0.m4545k0(objM4514P3);
                    } else {
                        c5850l = c5850l3;
                        interfaceC1809a1 = interfaceC1809a111;
                    }
                    InterfaceC5853o interfaceC5853oM5433j = AbstractC2192n.m5433j(c5850l, z11, null, null, (InterfaceC1220a) objM4514P3, 14);
                    C5850l c5850l4 = c5850l;
                    InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a1;
                    AbstractC4045s.m8250n(str2, AbstractC3208d.m6883m(interfaceC5853oM5433j, 8, 6), j3, jM10248D, c2767k, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, 1597440, 0, 262056);
                    c1836h0.m4553p(true);
                    InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l4, 1.0f);
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    InterfaceC5853o interfaceC5853oMo10549d = interfaceC5853oM6901d.mo10549d(new C3248q0(1.0f, false));
                    Context context3 = context;
                    boolean zM4538h3 = c1836h0.m4538h(arrayList) | c1836h0.m4538h(context3);
                    Object objM4514P4 = c1836h0.m4514P();
                    if (zM4538h3 || objM4514P4 == c1823e3) {
                        c5597e = c5597e6;
                        c5593d = c5593d2;
                        c5597e2 = c5597e5;
                        c5597e3 = c5597e7;
                        c5597e4 = c5597e8;
                        c5850l2 = c5850l4;
                        f3 = f11;
                        interfaceC3599t = interfaceC3599t3;
                        interfaceC1809a12 = interfaceC1809a120;
                        interfaceC1809a13 = interfaceC1809a117;
                        interfaceC1809a14 = interfaceC1809a118;
                        interfaceC1809a15 = interfaceC1809a119;
                        interfaceC1809a16 = interfaceC1809a110;
                        c5660y = c5660y2;
                        c1823e = c1823e3;
                        f10 = 1.0f;
                        z9 = false;
                        C5237qb c5237qb = new C5237qb(arrayList, interfaceC1809a113, interfaceC1809a114, interfaceC1809a115, interfaceC1809a112, context3, interfaceC1809a121, interfaceC1809a116, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16);
                        context3 = context3;
                        interfaceC1809a17 = interfaceC1809a121;
                        c1836h0.m4545k0(c5237qb);
                        objM4514P4 = c5237qb;
                    } else {
                        z9 = false;
                        c5597e = c5597e6;
                        c5593d = c5593d2;
                        c5597e2 = c5597e5;
                        c5597e3 = c5597e7;
                        c5597e4 = c5597e8;
                        c5850l2 = c5850l4;
                        f3 = f11;
                        interfaceC3599t = interfaceC3599t3;
                        interfaceC1809a12 = interfaceC1809a120;
                        interfaceC1809a13 = interfaceC1809a117;
                        interfaceC1809a14 = interfaceC1809a118;
                        interfaceC1809a15 = interfaceC1809a119;
                        interfaceC1809a16 = interfaceC1809a110;
                        interfaceC1809a17 = interfaceC1809a121;
                        c5660y = c5660y2;
                        c1823e = c1823e3;
                        f10 = 1.0f;
                    }
                    AbstractC0000a.m53b(interfaceC5853oMo10549d, null, null, null, null, null, false, null, (InterfaceC1231l) objM4514P4, c1836h0, 0, 510);
                    InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l2, f10), 0.0f, 12, 0.0f, 0.0f, 13);
                    C3213e1 c3213e1M6892a2 = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(f3), C5840b.f23770p, c1836h0, 6);
                    int iHashCode3 = Long.hashCode(c1836h0.f6095T);
                    C3878h c3878hM4546l3 = c1836h0.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c3 = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6886p);
                    c1836h0.m4531d0();
                    if (c1836h0.f6094S) {
                        c1836h0.m4544k(c5660y);
                    } else {
                        c1836h0.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e2, c1836h0, c3213e1M6892a2);
                    AbstractC1874r.m4615A(c5597e, c1836h0, c3878hM4546l3);
                    AbstractC2091b.m5169p(iHashCode3, c1836h0, c5597e3, c1836h0, c5593d);
                    AbstractC1874r.m4615A(c5597e4, c1836h0, interfaceC5853oM10543c3);
                    boolean z12 = !C5491y2.m9778H(interfaceC1809a16);
                    InterfaceC5853o interfaceC5853oM6897a = c3216f1.m6897a(c5850l2, true);
                    C4041q1 c4041q1M8227a = AbstractC3994c.m8227a(c1836h0);
                    boolean zM4534f2 = c1836h0.m4534f(interfaceC1231l);
                    Object objM4514P5 = c1836h0.m4514P();
                    if (zM4534f2) {
                        c1823e2 = c1823e;
                    } else {
                        c1823e2 = c1823e;
                        if (objM4514P5 != c1823e2) {
                            interfaceC1809a18 = interfaceC1809a12;
                        }
                        AbstractC4045s.m8251o("关闭", (InterfaceC1220a) objM4514P5, interfaceC5853oM6897a, z12, 0.0f, 0.0f, 0.0f, c4041q1M8227a, null, c1836h0, 6, 1904);
                        String str3 = !((Boolean) interfaceC1809a16.getValue()).booleanValue() ? "正在上传" : "上传已选";
                        boolean z13 = (!((Boolean) interfaceC1809a16.getValue()).booleanValue() || ((Set) interfaceC1809a17.getValue()).isEmpty()) ? z9 : true;
                        InterfaceC5853o interfaceC5853oM6897a2 = c3216f1.m6897a(c5850l2, true);
                        C4041q1 c4041q1M8227a2 = AbstractC3994c.m8227a(c1836h0);
                        interfaceC3599t2 = interfaceC3599t;
                        zM4538h = c1836h0.m4538h(context3) | c1836h0.m4538h(interfaceC3599t2);
                        objM4514P = c1836h0.m4514P();
                        if (!zM4538h || objM4514P == c1823e2) {
                            C5284rp c5284rp = new C5284rp(context3, interfaceC1809a16, interfaceC1809a17, interfaceC1809a112, interfaceC1809a116, interfaceC1809a15, interfaceC1809a13, interfaceC1809a14, interfaceC1809a18, interfaceC3599t2);
                            c1836h0.m4545k0(c5284rp);
                            objM4514P = c5284rp;
                        }
                        AbstractC4045s.m8251o(str3, (InterfaceC1220a) ((C1414j) objM4514P), interfaceC5853oM6897a2, z13, 0.0f, 0.0f, 0.0f, c4041q1M8227a2, null, c1836h0, 0, 1904);
                        c1836h0.m4553p(true);
                        c1836h0.m4553p(true);
                    }
                    interfaceC1809a18 = interfaceC1809a12;
                    objM4514P5 = new C5161o1(interfaceC1231l, interfaceC1809a18, 13);
                    c1836h0.m4545k0(objM4514P5);
                    AbstractC4045s.m8251o("关闭", (InterfaceC1220a) objM4514P5, interfaceC5853oM6897a, z12, 0.0f, 0.0f, 0.0f, c4041q1M8227a, null, c1836h0, 6, 1904);
                    String str32 = !((Boolean) interfaceC1809a16.getValue()).booleanValue() ? "正在上传" : "上传已选";
                    if (((Boolean) interfaceC1809a16.getValue()).booleanValue()) {
                        InterfaceC5853o interfaceC5853oM6897a22 = c3216f1.m6897a(c5850l2, true);
                        C4041q1 c4041q1M8227a22 = AbstractC3994c.m8227a(c1836h0);
                        interfaceC3599t2 = interfaceC3599t;
                        zM4538h = c1836h0.m4538h(context3) | c1836h0.m4538h(interfaceC3599t2);
                        objM4514P = c1836h0.m4514P();
                        if (!zM4538h) {
                            C5284rp c5284rp2 = new C5284rp(context3, interfaceC1809a16, interfaceC1809a17, interfaceC1809a112, interfaceC1809a116, interfaceC1809a15, interfaceC1809a13, interfaceC1809a14, interfaceC1809a18, interfaceC3599t2);
                            c1836h0.m4545k0(c5284rp2);
                            objM4514P = c5284rp2;
                            AbstractC4045s.m8251o(str32, (InterfaceC1220a) ((C1414j) objM4514P), interfaceC5853oM6897a22, z13, 0.0f, 0.0f, 0.0f, c4041q1M8227a22, null, c1836h0, 0, 1904);
                            c1836h0.m4553p(true);
                            c1836h0.m4553p(true);
                        }
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            default:
                C5718k c5718k = (C5718k) this.f20270j;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f20271k;
                AtomicReference atomicReference = (AtomicReference) this.f20272l;
                AtomicReference atomicReference2 = (AtomicReference) this.f20273m;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f20274n;
                boolean z14 = this.f20268h;
                AtomicBoolean atomicBoolean3 = (AtomicBoolean) this.f20275o;
                AtomicBoolean atomicBoolean4 = (AtomicBoolean) this.f20276p;
                AtomicReference atomicReference3 = (AtomicReference) this.f20277q;
                C1425u c1425u = (C1425u) this.f20278r;
                CountDownLatch countDownLatch = (CountDownLatch) this.f20279s;
                AtomicReference atomicReference4 = (AtomicReference) this.f20280t;
                String str4 = (String) this.f20281u;
                ArrayList arrayList2 = this.f20269i;
                ArrayList arrayList3 = (ArrayList) this.f20282v;
                StringBuilder sb2 = (StringBuilder) this.f20283w;
                AtomicReference atomicReference5 = (AtomicReference) this.f20284x;
                WebSocket webSocket = (WebSocket) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                webSocket.getClass();
                jSONObject.getClass();
                if (c5718k != null) {
                    c5718k.m10323i();
                }
                if (!AbstractC1416l.m3825a(jSONObject.optString("type"), "alert")) {
                    String strOptString2 = jSONObject.optString("type");
                    if (AbstractC1416l.m3825a(strOptString2, "mcp")) {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payload");
                        C5718k c5718k2 = (C5718k) C5724q.f23305i.get();
                        JSONObject jSONObjectM10319d = c5718k2 != null ? c5718k2.m10319d("main-ws", jSONObjectOptJSONObject) : null;
                        if (jSONObjectM10319d != null) {
                            String strOptString3 = jSONObject.optString("session_id");
                            JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("session_id", AbstractC3149m.m6721t0(strOptString3) ? str4 : strOptString3, "type", "mcp");
                            jSONObjectM9268l.put("payload", jSONObjectM10319d);
                            String string = jSONObjectM9268l.toString();
                            string.getClass();
                            webSocket.send(string);
                        }
                    } else if (AbstractC1416l.m3825a(strOptString2, "tts") && (strOptString = jSONObject.optString("state")) != null) {
                        switch (strOptString.hashCode()) {
                            case -1089952513:
                                if (strOptString.equals("sentence_end")) {
                                    C5724q.m10335G(z14, arrayList2, arrayList3);
                                }
                                break;
                            case 3540994:
                                if (strOptString.equals("stop")) {
                                    atomicBoolean2.set(false);
                                    C5724q.m10335G(z14, arrayList2, arrayList3);
                                    if (z14) {
                                        ScheduledFuture scheduledFuture = (ScheduledFuture) atomicReference2.getAndSet(null);
                                        if (scheduledFuture != null) {
                                            scheduledFuture.cancel(false);
                                        }
                                        atomicReference2.set(C5724q.f23298b.schedule(new RunnableC0496w(atomicBoolean4, atomicReference, atomicReference2, countDownLatch, atomicReference4, atomicReference3), 800L, TimeUnit.MILLISECONDS));
                                    } else if (atomicBoolean3.get() && atomicBoolean4.get()) {
                                        C5721n c5721n = (C5721n) atomicReference3.get();
                                        if (c5721n != null) {
                                            Object obj3 = c1425u.f4738g;
                                            if (obj3 == null) {
                                                AbstractC1416l.m3831g("socketRequest");
                                                throw null;
                                            }
                                            c5721n.m10325b((C5720m) obj3);
                                        }
                                    } else {
                                        C5724q.m10334F(atomicBoolean4, atomicReference, atomicReference2, countDownLatch, atomicReference4, atomicReference3, Opcodes.CHECKCAST);
                                    }
                                }
                                break;
                            case 109757538:
                                if (strOptString.equals("start")) {
                                    atomicBoolean.set(true);
                                    ScheduledFuture scheduledFuture2 = (ScheduledFuture) atomicReference.getAndSet(null);
                                    if (scheduledFuture2 != null) {
                                        scheduledFuture2.cancel(false);
                                    }
                                    ScheduledFuture scheduledFuture3 = (ScheduledFuture) atomicReference2.getAndSet(null);
                                    if (scheduledFuture3 != null) {
                                        scheduledFuture3.cancel(false);
                                    }
                                    atomicBoolean2.set(true);
                                }
                                break;
                            case 540764038:
                                if (strOptString.equals("sentence_start")) {
                                    atomicBoolean.set(true);
                                    ScheduledFuture scheduledFuture4 = (ScheduledFuture) atomicReference.getAndSet(null);
                                    if (scheduledFuture4 != null) {
                                        scheduledFuture4.cancel(false);
                                    }
                                    ScheduledFuture scheduledFuture5 = (ScheduledFuture) atomicReference2.getAndSet(null);
                                    if (scheduledFuture5 != null) {
                                        scheduledFuture5.cancel(false);
                                    }
                                    C5724q.m10335G(z14, arrayList2, arrayList3);
                                    ExecutorService executorService = C5724q.f23297a;
                                    String strOptString4 = jSONObject.optString(WeChatSnsPost.TYPE_TEXT);
                                    strOptString4.getClass();
                                    String strM10362h = C5724q.m10362h(strOptString4);
                                    String str5 = AbstractC3149m.m6721t0(strM10362h) ? null : strM10362h;
                                    if (str5 != null) {
                                        synchronized (sb2) {
                                            try {
                                                if (sb2.length() > 0) {
                                                    sb2.append('\n');
                                                }
                                                sb2.append(str5);
                                                atomicReference5.set(sb2.toString());
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        if (!z14) {
                                            atomicBoolean3.set(true);
                                            C5724q.m10334F(atomicBoolean4, atomicReference, atomicReference2, countDownLatch, atomicReference4, atomicReference3, 64);
                                            C5724q.f23298b.schedule(new RunnableC3737b(atomicBoolean3, atomicReference3, c1425u, 10), 10L, TimeUnit.SECONDS);
                                        }
                                    }
                                }
                                break;
                        }
                    }
                } else {
                    C5724q.m10334F(atomicBoolean4, atomicReference, atomicReference2, countDownLatch, atomicReference4, atomicReference3, 128);
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C5251qp(C5718k c5718k, AtomicBoolean atomicBoolean, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicBoolean atomicBoolean2, boolean z9, AtomicBoolean atomicBoolean3, AtomicBoolean atomicBoolean4, AtomicReference atomicReference3, C1425u c1425u, CountDownLatch countDownLatch, AtomicReference atomicReference4, String str, ArrayList arrayList, ArrayList arrayList2, StringBuilder sb2, AtomicReference atomicReference5) {
        this.f20270j = c5718k;
        this.f20271k = atomicBoolean;
        this.f20272l = atomicReference;
        this.f20273m = atomicReference2;
        this.f20274n = atomicBoolean2;
        this.f20268h = z9;
        this.f20275o = atomicBoolean3;
        this.f20276p = atomicBoolean4;
        this.f20277q = atomicReference3;
        this.f20278r = c1425u;
        this.f20279s = countDownLatch;
        this.f20280t = atomicReference4;
        this.f20281u = str;
        this.f20269i = arrayList;
        this.f20282v = arrayList2;
        this.f20283w = sb2;
        this.f20284x = atomicReference5;
    }
}
