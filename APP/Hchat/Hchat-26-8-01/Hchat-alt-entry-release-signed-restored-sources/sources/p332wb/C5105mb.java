package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okio.C3193a;
import org.json.JSONException;
import p000a.AbstractC0000a;
import p010aa.C0033a;
import p010aa.C0034b;
import p025bc.AbstractC0255e;
import p036c9.C0454k;
import p036c9.C0467n0;
import p036c9.C0482r0;
import p036c9.C0500x0;
import p065eb.C0880m;
import p065eb.C0884o;
import p065eb.C0886p;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p249qg.InterfaceC3599t;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3958e;
import p276sf.C3967n;
import p317vb.InterfaceC4544a;
import p345x8.C5709b;
import p345x8.C5725r;
import p356y0.InterfaceC5853o;
import sh.C4029m1;
import sh.C4060x;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.mb */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5105mb implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18883g = 5;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f18884h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18885i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18886j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f18887k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f18888l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f18889m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f18890n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f18891o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f18892p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f18893q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f18894r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f18895s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f18896t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f18897u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f18898v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f18899w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18900x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f18901y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f18902z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5105mb(Context context, SharedPreferences sharedPreferences, InterfaceC4544a interfaceC4544a, C4060x c4060x, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1220a interfaceC1220a, C3641z c3641z) {
        this.f18898v = context;
        this.f18897u = sharedPreferences;
        this.f18899w = interfaceC4544a;
        this.f18900x = c4060x;
        this.f18884h = interfaceC1809a1;
        this.f18885i = interfaceC1809a12;
        this.f18886j = interfaceC1809a13;
        this.f18887k = interfaceC1809a14;
        this.f18888l = interfaceC1809a15;
        this.f18889m = interfaceC1809a16;
        this.f18890n = interfaceC1809a17;
        this.f18891o = interfaceC1809a18;
        this.f18892p = interfaceC1809a19;
        this.f18893q = interfaceC1809a110;
        this.f18894r = interfaceC1809a111;
        this.f18895s = interfaceC1809a112;
        this.f18896t = interfaceC1809a113;
        this.f18901y = interfaceC1220a;
        this.f18902z = c3641z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0acc  */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        InterfaceC1809a1 interfaceC1809a1;
        C1823e c1823e;
        C1836h0 c1836h0;
        InterfaceC1809a1 interfaceC1809a12;
        C1823e c1823e2;
        SharedPreferences sharedPreferences;
        InterfaceC1809a1 interfaceC1809a13;
        Object next;
        InterfaceC1809a1 interfaceC1809a14;
        boolean z9;
        SharedPreferences sharedPreferences2;
        Object c0482r0;
        C1823e c1823e3;
        final InterfaceC1809a1 interfaceC1809a15;
        InterfaceC1809a1 interfaceC1809a16;
        InterfaceC1809a1 interfaceC1809a17;
        SharedPreferences sharedPreferences3;
        Object objM4514P;
        Object objM4514P2;
        Object objM4514P3;
        Object objM4514P4;
        InterfaceC1809a1 interfaceC1809a18;
        boolean z10;
        boolean z11;
        C0034b c0034b;
        InterfaceC1809a1 interfaceC1809a19;
        Object c0454k;
        InterfaceC1809a1 interfaceC1809a110;
        C1823e c1823e4;
        boolean z12;
        InterfaceC5853o interfaceC5853o;
        switch (this.f18883g) {
            case 0:
                final C5725r c5725r = (C5725r) this.f18897u;
                final Context context = (Context) this.f18898v;
                final InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f18890n;
                final InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f18891o;
                final InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f18892p;
                final InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f18893q;
                final InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f18894r;
                final InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f18895s;
                final InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f18896t;
                final InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f18899w;
                final InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f18900x;
                final InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f18901y;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f18902z;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zM4538h = c1836h02.m4538h(c5725r) | c1836h02.m4538h(context);
                    Object objM4514P5 = c1836h02.m4514P();
                    C1823e c1823e5 = C1851l.f6155a;
                    if (zM4538h || objM4514P5 == c1823e5) {
                        final InterfaceC1809a1 interfaceC1809a122 = this.f18884h;
                        final InterfaceC1809a1 interfaceC1809a123 = this.f18885i;
                        final InterfaceC1809a1 interfaceC1809a124 = this.f18886j;
                        final InterfaceC1809a1 interfaceC1809a125 = this.f18887k;
                        final InterfaceC1809a1 interfaceC1809a126 = this.f18888l;
                        final InterfaceC1809a1 interfaceC1809a127 = this.f18889m;
                        interfaceC1809a1 = interfaceC1809a121;
                        c1823e = c1823e5;
                        c1836h0 = c1836h02;
                        InterfaceC1220a interfaceC1220a = new InterfaceC1220a() { // from class: wb.ee
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                c5725r.m10393m(AbstractC4955ho.m9638q(interfaceC1809a122, interfaceC1809a123, interfaceC1809a124, interfaceC1809a125, interfaceC1809a126, interfaceC1809a127, interfaceC1809a111, interfaceC1809a112, interfaceC1809a113, interfaceC1809a114, interfaceC1809a115, interfaceC1809a116, interfaceC1809a117, interfaceC1809a118, interfaceC1809a119, interfaceC1809a120));
                                Toast.makeText(context, "小智AI配置已保存", 0).show();
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(interfaceC1220a);
                        objM4514P5 = interfaceC1220a;
                    } else {
                        interfaceC1809a1 = interfaceC1809a121;
                        c1836h0 = c1836h02;
                        c1823e = c1823e5;
                    }
                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P5;
                    Object objM4514P6 = c1836h0.m4514P();
                    if (objM4514P6 == c1823e) {
                        objM4514P6 = new C5371ud(interfaceC1809a1, 8);
                        c1836h0.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9382M("保存小智", interfaceC1220a2, "返回", (InterfaceC1220a) objM4514P6, null, null, c1836h0, 3462, 48);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f18897u;
                List list = (List) this.f18898v;
                String str = (String) this.f18899w;
                List list2 = (List) this.f18900x;
                Set set = (Set) this.f18901y;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f18902z;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) this.f18890n;
                InterfaceC1809a1 interfaceC1809a129 = (InterfaceC1809a1) this.f18891o;
                InterfaceC1809a1 interfaceC1809a130 = (InterfaceC1809a1) this.f18892p;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) this.f18893q;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f18894r;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f18895s;
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) this.f18896t;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h03.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(711834533, new C5010jf(sharedPreferences4, list, str, list2, set, interfaceC1220a3, this.f18884h, this.f18885i, this.f18886j, this.f18887k, this.f18888l, this.f18889m, interfaceC1809a128, interfaceC1809a129, interfaceC1809a130, interfaceC1809a131, interfaceC1809a132, interfaceC1809a133, interfaceC1809a134), c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                final C5725r c5725r2 = (C5725r) this.f18897u;
                final Context context2 = (Context) this.f18898v;
                C3641z c3641z = (C3641z) this.f18890n;
                C3641z c3641z2 = (C3641z) this.f18891o;
                SharedPreferences sharedPreferences5 = (SharedPreferences) this.f18892p;
                C3641z c3641z3 = (C3641z) this.f18893q;
                C5225q c5225q = (C5225q) this.f18894r;
                C3641z c3641z4 = (C3641z) this.f18895s;
                C3641z c3641z5 = (C3641z) this.f18896t;
                C5225q c5225q2 = (C5225q) this.f18899w;
                C3641z c3641z6 = (C3641z) this.f18900x;
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) this.f18901y;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f18902z;
                String str2 = (String) obj;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                str2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c1836h04.m4534f(str2) ? 4 : 2;
                }
                if (c1836h04.m4516S(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    int iHashCode = str2.hashCode();
                    final InterfaceC1809a1 interfaceC1809a135 = this.f18884h;
                    InterfaceC1809a1 interfaceC1809a136 = this.f18885i;
                    InterfaceC1809a1 interfaceC1809a137 = this.f18886j;
                    InterfaceC1809a1 interfaceC1809a138 = this.f18887k;
                    InterfaceC1809a1 interfaceC1809a139 = this.f18888l;
                    C1823e c1823e6 = C1851l.f6155a;
                    switch (iHashCode) {
                        case -1186957431:
                            interfaceC1809a12 = interfaceC1809a136;
                            c1823e2 = c1823e6;
                            sharedPreferences = sharedPreferences5;
                            interfaceC1809a13 = interfaceC1809a139;
                            if (!str2.equals("ruleEditor")) {
                                c1836h04.m4525a0(-1027751332);
                                List list3 = (List) interfaceC1809a13.getValue();
                                objM4514P = c1836h04.m4514P();
                                if (objM4514P == c1823e2) {
                                    objM4514P = new C5509yk(interfaceC1809a12, 18);
                                    c1836h04.m4545k0(objM4514P);
                                }
                                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P;
                                objM4514P2 = c1836h04.m4514P();
                                if (objM4514P2 == c1823e2) {
                                    objM4514P2 = new C5509yk(interfaceC1809a12, 19);
                                    c1836h04.m4545k0(objM4514P2);
                                }
                                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) objM4514P2;
                                objM4514P3 = c1836h04.m4514P();
                                if (objM4514P3 == c1823e2) {
                                    objM4514P3 = new C5509yk(interfaceC1809a12, 20);
                                    c1836h04.m4545k0(objM4514P3);
                                }
                                InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P3;
                                objM4514P4 = c1836h04.m4514P();
                                if (objM4514P4 == c1823e2) {
                                    objM4514P4 = new C5509yk(interfaceC1809a12, 21);
                                    c1836h04.m4545k0(objM4514P4);
                                }
                                AbstractC4955ho.m9716z(interfaceC4544a, sharedPreferences, list3, interfaceC1220a4, interfaceC1220a5, interfaceC1220a6, interfaceC1220a7, (InterfaceC1220a) objM4514P4, c1836h04, 14376960);
                                c1836h04.m4553p(false);
                            } else {
                                c1836h04.m4525a0(-1798777791);
                                C5709b c5709b = (C5709b) interfaceC1809a138.getValue();
                                if (c5709b == null) {
                                    Iterator it = ((List) interfaceC1809a13.getValue()).iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            if (AbstractC1416l.m3825a(((C5709b) next).f23199a, (String) interfaceC1809a137.getValue())) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    c5709b = (C5709b) next;
                                }
                                C5709b c5709b2 = c5709b;
                                if (c5709b2 == null) {
                                    c1836h04.m4525a0(-1798689720);
                                    c1836h04.m4553p(false);
                                    interfaceC1809a138.setValue(null);
                                    interfaceC1809a12.setValue("rules");
                                    z9 = false;
                                } else {
                                    c1836h04.m4525a0(-1798573408);
                                    Object objM4514P7 = c1836h04.m4514P();
                                    if (objM4514P7 == c1823e2) {
                                        objM4514P7 = new C5213pk(5, interfaceC1809a138, interfaceC1809a12);
                                        c1836h04.m4545k0(objM4514P7);
                                    }
                                    InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) objM4514P7;
                                    boolean zM4538h2 = c1836h04.m4538h(c5725r2) | c1836h04.m4538h(context2);
                                    Object objM4514P8 = c1836h04.m4514P();
                                    if (zM4538h2 || objM4514P8 == c1823e2) {
                                        interfaceC1809a14 = interfaceC1809a138;
                                        C0884o c0884o = new C0884o(context2, interfaceC1809a13, c5725r2, interfaceC1809a14, interfaceC1809a12, 17);
                                        c1836h04.m4545k0(c0884o);
                                        objM4514P8 = c0884o;
                                    } else {
                                        interfaceC1809a14 = interfaceC1809a138;
                                    }
                                    InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P8;
                                    Object objM4514P9 = c1836h04.m4514P();
                                    if (objM4514P9 == c1823e2) {
                                        objM4514P9 = new C4917gj(interfaceC1809a14, 22);
                                        c1836h04.m4545k0(objM4514P9);
                                    }
                                    InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) objM4514P9;
                                    Object objM4514P10 = c1836h04.m4514P();
                                    if (objM4514P10 == c1823e2) {
                                        objM4514P10 = new C4029m1(26, interfaceC1809a14, interfaceC1809a135);
                                        c1836h04.m4545k0(objM4514P10);
                                    }
                                    AbstractC4955ho.m9310D(c5709b2, c3641z2, interfaceC1220a8, interfaceC1231l, interfaceC1231l2, (InterfaceC1231l) objM4514P10, c1836h04, 221568);
                                    z9 = false;
                                    c1836h04.m4553p(false);
                                }
                                c1836h04.m4553p(z9);
                            }
                            break;
                        case -1092993418:
                            interfaceC1809a12 = interfaceC1809a136;
                            c1823e2 = c1823e6;
                            sharedPreferences2 = sharedPreferences5;
                            interfaceC1809a13 = interfaceC1809a139;
                            if (str2.equals("autoAcceptLabels")) {
                                c1836h04.m4525a0(-1027797556);
                                Object objM4514P11 = c1836h04.m4514P();
                                if (objM4514P11 == c1823e2) {
                                    objM4514P11 = new C5509yk(interfaceC1809a12, 13);
                                    c1836h04.m4545k0(objM4514P11);
                                }
                                AbstractC4955ho.m9700x(context2, sharedPreferences2, "auto_accept_label_selected_names", c3641z4, (InterfaceC1220a) objM4514P11, c1836h04, 24960);
                                c1836h04.m4553p(false);
                            }
                            sharedPreferences = sharedPreferences2;
                            c1836h04.m4525a0(-1027751332);
                            List list32 = (List) interfaceC1809a13.getValue();
                            objM4514P = c1836h04.m4514P();
                            if (objM4514P == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a52 = (InterfaceC1220a) objM4514P;
                            objM4514P2 = c1836h04.m4514P();
                            if (objM4514P2 == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a62 = (InterfaceC1220a) objM4514P2;
                            objM4514P3 = c1836h04.m4514P();
                            if (objM4514P3 == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a72 = (InterfaceC1220a) objM4514P3;
                            objM4514P4 = c1836h04.m4514P();
                            if (objM4514P4 == c1823e2) {
                            }
                            AbstractC4955ho.m9716z(interfaceC4544a, sharedPreferences, list32, interfaceC1220a4, interfaceC1220a52, interfaceC1220a62, interfaceC1220a72, (InterfaceC1220a) objM4514P4, c1836h04, 14376960);
                            c1836h04.m4553p(false);
                            break;
                        case -914145385:
                            interfaceC1809a12 = interfaceC1809a136;
                            c1823e2 = c1823e6;
                            sharedPreferences2 = sharedPreferences5;
                            interfaceC1809a13 = interfaceC1809a139;
                            if (str2.equals("autoAccept")) {
                                c1836h04.m4525a0(-1027821226);
                                List listM10383c = c5725r2.m10383c();
                                Object objM4514P12 = c1836h04.m4514P();
                                if (objM4514P12 == c1823e2) {
                                    objM4514P12 = new C5509yk(interfaceC1809a12, 11);
                                    c1836h04.m4545k0(objM4514P12);
                                }
                                InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) objM4514P12;
                                Object objM4514P13 = c1836h04.m4514P();
                                if (objM4514P13 == c1823e2) {
                                    objM4514P13 = new C5509yk(interfaceC1809a12, 12);
                                    c1836h04.m4545k0(objM4514P13);
                                }
                                InterfaceC1220a interfaceC1220a10 = (InterfaceC1220a) objM4514P13;
                                boolean zM4538h3 = c1836h04.m4538h(c5725r2);
                                Object objM4514P14 = c1836h04.m4514P();
                                if (zM4538h3 || objM4514P14 == c1823e2) {
                                    final int i9 = 0;
                                    objM4514P14 = new InterfaceC1220a() { // from class: wb.cl
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1220a
                                        public final Object invoke() {
                                            switch (i9) {
                                                case 0:
                                                    interfaceC1809a135.setValue(new C3958e("好友请求回复", c5725r2.m10383c()));
                                                    break;
                                                default:
                                                    interfaceC1809a135.setValue(new C3958e("通过后欢迎语", c5725r2.m10389i()));
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    };
                                    c1836h04.m4545k0(objM4514P14);
                                }
                                AbstractC4955ho.m9692w(context2, "好友请求处理", sharedPreferences2, "auto_accept_enable", "auto_accept_delay_ms", "auto_accept_tag_enable", "auto_accept_tag_name", listM10383c, c3641z3, interfaceC1220a9, c5225q, interfaceC1220a10, (InterfaceC1220a) objM4514P14, c1836h04, 807103536);
                                c1836h04.m4553p(false);
                            }
                            sharedPreferences = sharedPreferences2;
                            c1836h04.m4525a0(-1027751332);
                            List list322 = (List) interfaceC1809a13.getValue();
                            objM4514P = c1836h04.m4514P();
                            if (objM4514P == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a522 = (InterfaceC1220a) objM4514P;
                            objM4514P2 = c1836h04.m4514P();
                            if (objM4514P2 == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a622 = (InterfaceC1220a) objM4514P2;
                            objM4514P3 = c1836h04.m4514P();
                            if (objM4514P3 == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a722 = (InterfaceC1220a) objM4514P3;
                            objM4514P4 = c1836h04.m4514P();
                            if (objM4514P4 == c1823e2) {
                            }
                            AbstractC4955ho.m9716z(interfaceC4544a, sharedPreferences, list322, interfaceC1220a4, interfaceC1220a522, interfaceC1220a622, interfaceC1220a722, (InterfaceC1220a) objM4514P4, c1836h04, 14376960);
                            c1836h04.m4553p(false);
                            break;
                        case 3112:
                            interfaceC1809a12 = interfaceC1809a136;
                            interfaceC1809a13 = interfaceC1809a139;
                            if (!str2.equals("ai")) {
                                sharedPreferences = sharedPreferences5;
                                c1823e2 = c1823e6;
                                c1836h04.m4525a0(-1027751332);
                                List list3222 = (List) interfaceC1809a13.getValue();
                                objM4514P = c1836h04.m4514P();
                                if (objM4514P == c1823e2) {
                                }
                                InterfaceC1220a interfaceC1220a5222 = (InterfaceC1220a) objM4514P;
                                objM4514P2 = c1836h04.m4514P();
                                if (objM4514P2 == c1823e2) {
                                }
                                InterfaceC1220a interfaceC1220a6222 = (InterfaceC1220a) objM4514P2;
                                objM4514P3 = c1836h04.m4514P();
                                if (objM4514P3 == c1823e2) {
                                }
                                InterfaceC1220a interfaceC1220a7222 = (InterfaceC1220a) objM4514P3;
                                objM4514P4 = c1836h04.m4514P();
                                if (objM4514P4 == c1823e2) {
                                }
                                AbstractC4955ho.m9716z(interfaceC4544a, sharedPreferences, list3222, interfaceC1220a4, interfaceC1220a5222, interfaceC1220a6222, interfaceC1220a7222, (InterfaceC1220a) objM4514P4, c1836h04, 14376960);
                                c1836h04.m4553p(false);
                            } else {
                                c1836h04.m4525a0(-1027753988);
                                Object objM4514P15 = c1836h04.m4514P();
                                if (objM4514P15 == c1823e6) {
                                    objM4514P15 = new C5509yk(interfaceC1809a12, 17);
                                    c1836h04.m4545k0(objM4514P15);
                                }
                                AbstractC4955ho.m9629p(context2, sharedPreferences5, (InterfaceC1220a) objM4514P15, c1836h04, 384);
                                c1836h04.m4553p(false);
                            }
                            break;
                        case 108873975:
                            interfaceC1809a12 = interfaceC1809a136;
                            if (!str2.equals("rules")) {
                                sharedPreferences = sharedPreferences5;
                                c1823e2 = c1823e6;
                                interfaceC1809a13 = interfaceC1809a139;
                                c1836h04.m4525a0(-1027751332);
                                List list32222 = (List) interfaceC1809a13.getValue();
                                objM4514P = c1836h04.m4514P();
                                if (objM4514P == c1823e2) {
                                }
                                InterfaceC1220a interfaceC1220a52222 = (InterfaceC1220a) objM4514P;
                                objM4514P2 = c1836h04.m4514P();
                                if (objM4514P2 == c1823e2) {
                                }
                                InterfaceC1220a interfaceC1220a62222 = (InterfaceC1220a) objM4514P2;
                                objM4514P3 = c1836h04.m4514P();
                                if (objM4514P3 == c1823e2) {
                                }
                                InterfaceC1220a interfaceC1220a72222 = (InterfaceC1220a) objM4514P3;
                                objM4514P4 = c1836h04.m4514P();
                                if (objM4514P4 == c1823e2) {
                                }
                                AbstractC4955ho.m9716z(interfaceC4544a, sharedPreferences, list32222, interfaceC1220a4, interfaceC1220a52222, interfaceC1220a62222, interfaceC1220a72222, (InterfaceC1220a) objM4514P4, c1836h04, 14376960);
                                c1836h04.m4553p(false);
                            } else {
                                c1836h04.m4525a0(-1027899655);
                                List list4 = (List) interfaceC1809a139.getValue();
                                InterfaceC1809a1 interfaceC1809a140 = this.f18889m;
                                String str3 = (String) interfaceC1809a140.getValue();
                                Object objM4514P16 = c1836h04.m4514P();
                                if (objM4514P16 == c1823e6) {
                                    objM4514P16 = new C4917gj(interfaceC1809a140, 23);
                                    c1836h04.m4545k0(objM4514P16);
                                }
                                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) objM4514P16;
                                Object objM4514P17 = c1836h04.m4514P();
                                if (objM4514P17 == c1823e6) {
                                    objM4514P17 = new C5509yk(interfaceC1809a12, 22);
                                    c1836h04.m4545k0(objM4514P17);
                                }
                                InterfaceC1220a interfaceC1220a11 = (InterfaceC1220a) objM4514P17;
                                boolean zM4538h4 = c1836h04.m4538h(c5725r2);
                                Object objM4514P18 = c1836h04.m4514P();
                                if (zM4538h4 || objM4514P18 == c1823e6) {
                                    c1823e3 = c1823e6;
                                    c0482r0 = new C0482r0(interfaceC1809a139, c5725r2, interfaceC1809a137, interfaceC1809a138, interfaceC1809a12, 24);
                                    interfaceC1809a15 = interfaceC1809a139;
                                    c5725r2 = c5725r2;
                                    interfaceC1809a16 = interfaceC1809a138;
                                    interfaceC1809a17 = interfaceC1809a137;
                                    c1836h04.m4545k0(c0482r0);
                                } else {
                                    interfaceC1809a17 = interfaceC1809a137;
                                    c0482r0 = objM4514P18;
                                    c1823e3 = c1823e6;
                                    interfaceC1809a15 = interfaceC1809a139;
                                    interfaceC1809a16 = interfaceC1809a138;
                                }
                                InterfaceC1220a interfaceC1220a12 = (InterfaceC1220a) c0482r0;
                                Object objM4514P19 = c1836h04.m4514P();
                                if (objM4514P19 == c1823e3) {
                                    objM4514P19 = new C4714ad(interfaceC1809a17, interfaceC1809a16, interfaceC1809a12, 5);
                                    c1836h04.m4545k0(objM4514P19);
                                }
                                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) objM4514P19;
                                boolean zM4538h5 = c1836h04.m4538h(c5725r2);
                                Object objM4514P20 = c1836h04.m4514P();
                                if (zM4538h5 || objM4514P20 == c1823e3) {
                                    objM4514P20 = new C5539zi(interfaceC1809a15, 6, c5725r2);
                                    c1836h04.m4545k0(objM4514P20);
                                }
                                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) objM4514P20;
                                boolean zM4538h6 = c1836h04.m4538h(c5725r2) | c1836h04.m4538h(context2);
                                Object objM4514P21 = c1836h04.m4514P();
                                if (zM4538h6 || objM4514P21 == c1823e3) {
                                    final int i10 = 0;
                                    objM4514P21 = new InterfaceC1231l() { // from class: wb.dl
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1231l
                                        public final Object invoke(Object obj4) throws JSONException {
                                            switch (i10) {
                                                case 0:
                                                    C5709b c5709b3 = (C5709b) obj4;
                                                    c5709b3.getClass();
                                                    InterfaceC1809a1 interfaceC1809a141 = interfaceC1809a15;
                                                    List list5 = (List) interfaceC1809a141.getValue();
                                                    ArrayList arrayList = new ArrayList();
                                                    for (Object obj5 : list5) {
                                                        if (!AbstractC1416l.m3825a(((C5709b) obj5).f23199a, c5709b3.f23199a)) {
                                                            arrayList.add(obj5);
                                                        }
                                                    }
                                                    AbstractC4955ho.m9294B(c5725r2, interfaceC1809a141, arrayList);
                                                    Toast.makeText(context2, "规则已删除", 0).show();
                                                    break;
                                                default:
                                                    List list6 = (List) obj4;
                                                    list6.getClass();
                                                    HashSet hashSet = new HashSet();
                                                    Iterator it2 = list6.iterator();
                                                    while (it2.hasNext()) {
                                                        hashSet.add(((C5709b) it2.next()).f23199a);
                                                    }
                                                    InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a15;
                                                    List list7 = (List) interfaceC1809a142.getValue();
                                                    ArrayList arrayList2 = new ArrayList();
                                                    for (Object obj6 : list7) {
                                                        if (!hashSet.contains(((C5709b) obj6).f23199a)) {
                                                            arrayList2.add(obj6);
                                                        }
                                                    }
                                                    AbstractC4955ho.m9294B(c5725r2, interfaceC1809a142, arrayList2);
                                                    AbstractC4855en.m9271o("已删除 ", list6.size(), " 条规则", context2, 0);
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    };
                                    c1836h04.m4545k0(objM4514P21);
                                }
                                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) objM4514P21;
                                boolean zM4538h7 = c1836h04.m4538h(c5725r2) | c1836h04.m4538h(context2);
                                Object objM4514P22 = c1836h04.m4514P();
                                if (zM4538h7 || objM4514P22 == c1823e3) {
                                    final int i11 = 1;
                                    objM4514P22 = new InterfaceC1231l() { // from class: wb.dl
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1231l
                                        public final Object invoke(Object obj4) throws JSONException {
                                            switch (i11) {
                                                case 0:
                                                    C5709b c5709b3 = (C5709b) obj4;
                                                    c5709b3.getClass();
                                                    InterfaceC1809a1 interfaceC1809a141 = interfaceC1809a15;
                                                    List list5 = (List) interfaceC1809a141.getValue();
                                                    ArrayList arrayList = new ArrayList();
                                                    for (Object obj5 : list5) {
                                                        if (!AbstractC1416l.m3825a(((C5709b) obj5).f23199a, c5709b3.f23199a)) {
                                                            arrayList.add(obj5);
                                                        }
                                                    }
                                                    AbstractC4955ho.m9294B(c5725r2, interfaceC1809a141, arrayList);
                                                    Toast.makeText(context2, "规则已删除", 0).show();
                                                    break;
                                                default:
                                                    List list6 = (List) obj4;
                                                    list6.getClass();
                                                    HashSet hashSet = new HashSet();
                                                    Iterator it2 = list6.iterator();
                                                    while (it2.hasNext()) {
                                                        hashSet.add(((C5709b) it2.next()).f23199a);
                                                    }
                                                    InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a15;
                                                    List list7 = (List) interfaceC1809a142.getValue();
                                                    ArrayList arrayList2 = new ArrayList();
                                                    for (Object obj6 : list7) {
                                                        if (!hashSet.contains(((C5709b) obj6).f23199a)) {
                                                            arrayList2.add(obj6);
                                                        }
                                                    }
                                                    AbstractC4955ho.m9294B(c5725r2, interfaceC1809a142, arrayList2);
                                                    AbstractC4855en.m9271o("已删除 ", list6.size(), " 条规则", context2, 0);
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    };
                                    c1836h04.m4545k0(objM4514P22);
                                }
                                AbstractC4955ho.m9318E(1597824, interfaceC1220a11, interfaceC1220a12, interfaceC1231l3, interfaceC1231l4, interfaceC1231l5, (InterfaceC1231l) objM4514P22, interfaceC1235p, c1836h04, str3, list4, c3641z);
                                c1836h04.m4553p(false);
                            }
                            break;
                        case 109761319:
                            sharedPreferences3 = sharedPreferences5;
                            if (str2.equals("steps")) {
                                c1836h04.m4525a0(-1801388363);
                                C3958e c3958e = (C3958e) interfaceC1809a135.getValue();
                                if (c3958e == null) {
                                    c1836h04.m4553p(false);
                                } else {
                                    String str4 = (String) c3958e.f12961g;
                                    List list5 = (List) c3958e.f12962h;
                                    Object objM4514P23 = c1836h04.m4514P();
                                    if (objM4514P23 == c1823e6) {
                                        objM4514P23 = new C5509yk(interfaceC1809a135, 10);
                                        c1836h04.m4545k0(objM4514P23);
                                    }
                                    InterfaceC1220a interfaceC1220a13 = (InterfaceC1220a) objM4514P23;
                                    boolean zM4538h8 = c1836h04.m4538h(c5725r2) | c1836h04.m4538h(context2);
                                    Object objM4514P24 = c1836h04.m4514P();
                                    if (zM4538h8 || objM4514P24 == c1823e6) {
                                        C0880m c0880m = new C0880m(c5725r2, context2, interfaceC1809a136, interfaceC1809a137, interfaceC1809a138, interfaceC1809a139, interfaceC1809a135, 8);
                                        c1836h04.m4545k0(c0880m);
                                        objM4514P24 = c0880m;
                                    }
                                    AbstractC4955ho.m9334G(384, interfaceC1220a13, (InterfaceC1231l) objM4514P24, c1836h04, str4, list5);
                                    c1836h04.m4553p(false);
                                }
                            }
                            interfaceC1809a12 = interfaceC1809a136;
                            sharedPreferences = sharedPreferences3;
                            c1823e2 = c1823e6;
                            interfaceC1809a13 = interfaceC1809a139;
                            c1836h04.m4525a0(-1027751332);
                            List list322222 = (List) interfaceC1809a13.getValue();
                            objM4514P = c1836h04.m4514P();
                            if (objM4514P == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a522222 = (InterfaceC1220a) objM4514P;
                            objM4514P2 = c1836h04.m4514P();
                            if (objM4514P2 == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a622222 = (InterfaceC1220a) objM4514P2;
                            objM4514P3 = c1836h04.m4514P();
                            if (objM4514P3 == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a722222 = (InterfaceC1220a) objM4514P3;
                            objM4514P4 = c1836h04.m4514P();
                            if (objM4514P4 == c1823e2) {
                            }
                            AbstractC4955ho.m9716z(interfaceC4544a, sharedPreferences, list322222, interfaceC1220a4, interfaceC1220a522222, interfaceC1220a622222, interfaceC1220a722222, (InterfaceC1220a) objM4514P4, c1836h04, 14376960);
                            c1836h04.m4553p(false);
                            break;
                        case 905099728:
                            sharedPreferences3 = sharedPreferences5;
                            if (str2.equals("greetAccepted")) {
                                c1836h04.m4525a0(-1027787695);
                                List listM10389i = c5725r2.m10389i();
                                Object objM4514P25 = c1836h04.m4514P();
                                if (objM4514P25 == c1823e6) {
                                    objM4514P25 = new C5509yk(interfaceC1809a136, 14);
                                    c1836h04.m4545k0(objM4514P25);
                                }
                                InterfaceC1220a interfaceC1220a14 = (InterfaceC1220a) objM4514P25;
                                Object objM4514P26 = c1836h04.m4514P();
                                if (objM4514P26 == c1823e6) {
                                    objM4514P26 = new C5509yk(interfaceC1809a136, 15);
                                    c1836h04.m4545k0(objM4514P26);
                                }
                                InterfaceC1220a interfaceC1220a15 = (InterfaceC1220a) objM4514P26;
                                boolean zM4538h9 = c1836h04.m4538h(c5725r2);
                                Object objM4514P27 = c1836h04.m4514P();
                                if (zM4538h9 || objM4514P27 == c1823e6) {
                                    final int i12 = 1;
                                    objM4514P27 = new InterfaceC1220a() { // from class: wb.cl
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1220a
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    interfaceC1809a135.setValue(new C3958e("好友请求回复", c5725r2.m10383c()));
                                                    break;
                                                default:
                                                    interfaceC1809a135.setValue(new C3958e("通过后欢迎语", c5725r2.m10389i()));
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    };
                                    c1836h04.m4545k0(objM4514P27);
                                }
                                AbstractC4955ho.m9692w(context2, "通过后欢迎语", sharedPreferences3, "greet_accepted_enable", "greet_accepted_delay_ms", "greet_accepted_tag_enable", "greet_accepted_tag_name", listM10389i, c3641z5, interfaceC1220a14, c5225q2, interfaceC1220a15, (InterfaceC1220a) objM4514P27, c1836h04, 807103536);
                                c1836h04.m4553p(false);
                            }
                            interfaceC1809a12 = interfaceC1809a136;
                            sharedPreferences = sharedPreferences3;
                            c1823e2 = c1823e6;
                            interfaceC1809a13 = interfaceC1809a139;
                            c1836h04.m4525a0(-1027751332);
                            List list3222222 = (List) interfaceC1809a13.getValue();
                            objM4514P = c1836h04.m4514P();
                            if (objM4514P == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a5222222 = (InterfaceC1220a) objM4514P;
                            objM4514P2 = c1836h04.m4514P();
                            if (objM4514P2 == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a6222222 = (InterfaceC1220a) objM4514P2;
                            objM4514P3 = c1836h04.m4514P();
                            if (objM4514P3 == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a7222222 = (InterfaceC1220a) objM4514P3;
                            objM4514P4 = c1836h04.m4514P();
                            if (objM4514P4 == c1823e2) {
                            }
                            AbstractC4955ho.m9716z(interfaceC4544a, sharedPreferences, list3222222, interfaceC1220a4, interfaceC1220a5222222, interfaceC1220a6222222, interfaceC1220a7222222, (InterfaceC1220a) objM4514P4, c1836h04, 14376960);
                            c1836h04.m4553p(false);
                            break;
                        case 1535732207:
                            if (str2.equals("greetAcceptedLabels")) {
                                c1836h04.m4525a0(-1027763083);
                                Object objM4514P28 = c1836h04.m4514P();
                                if (objM4514P28 == c1823e6) {
                                    objM4514P28 = new C5509yk(interfaceC1809a136, 16);
                                    c1836h04.m4545k0(objM4514P28);
                                }
                                AbstractC4955ho.m9700x(context2, sharedPreferences5, "greet_accepted_label_selected_names", c3641z6, (InterfaceC1220a) objM4514P28, c1836h04, 24960);
                                c1836h04.m4553p(false);
                                break;
                            }
                        default:
                            interfaceC1809a12 = interfaceC1809a136;
                            c1823e2 = c1823e6;
                            sharedPreferences = sharedPreferences5;
                            interfaceC1809a13 = interfaceC1809a139;
                            c1836h04.m4525a0(-1027751332);
                            List list32222222 = (List) interfaceC1809a13.getValue();
                            objM4514P = c1836h04.m4514P();
                            if (objM4514P == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a52222222 = (InterfaceC1220a) objM4514P;
                            objM4514P2 = c1836h04.m4514P();
                            if (objM4514P2 == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a62222222 = (InterfaceC1220a) objM4514P2;
                            objM4514P3 = c1836h04.m4514P();
                            if (objM4514P3 == c1823e2) {
                            }
                            InterfaceC1220a interfaceC1220a72222222 = (InterfaceC1220a) objM4514P3;
                            objM4514P4 = c1836h04.m4514P();
                            if (objM4514P4 == c1823e2) {
                            }
                            AbstractC4955ho.m9716z(interfaceC4544a, sharedPreferences, list32222222, interfaceC1220a4, interfaceC1220a52222222, interfaceC1220a62222222, interfaceC1220a72222222, (InterfaceC1220a) objM4514P4, c1836h04, 14376960);
                            c1836h04.m4553p(false);
                            break;
                    }
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                Context context3 = (Context) this.f18898v;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f18897u;
                InterfaceC1809a1 interfaceC1809a141 = (InterfaceC1809a1) this.f18890n;
                InterfaceC1809a1 interfaceC1809a142 = (InterfaceC1809a1) this.f18891o;
                InterfaceC1809a1 interfaceC1809a143 = (InterfaceC1809a1) this.f18892p;
                InterfaceC1809a1 interfaceC1809a144 = (InterfaceC1809a1) this.f18893q;
                InterfaceC1809a1 interfaceC1809a145 = (InterfaceC1809a1) this.f18894r;
                InterfaceC1809a1 interfaceC1809a146 = (InterfaceC1809a1) this.f18895s;
                InterfaceC1809a1 interfaceC1809a147 = (InterfaceC1809a1) this.f18896t;
                InterfaceC1809a1 interfaceC1809a148 = (InterfaceC1809a1) this.f18899w;
                InterfaceC1809a1 interfaceC1809a149 = (InterfaceC1809a1) this.f18900x;
                InterfaceC1809a1 interfaceC1809a150 = (InterfaceC1809a1) this.f18901y;
                InterfaceC1809a1 interfaceC1809a151 = (InterfaceC1809a1) this.f18902z;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h05.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1318207174, new C5010jf(context3, this.f18884h, this.f18885i, this.f18886j, this.f18887k, this.f18888l, this.f18889m, interfaceC1809a141, interfaceC1809a142, interfaceC1809a143, interfaceC1809a144, interfaceC1809a145, interfaceC1809a146, interfaceC1809a147, interfaceC1809a148, interfaceC1809a149, interfaceC1809a150, interfaceC1809a151, interfaceC3599t), c1836h05), c1836h05, 48, 1);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                SharedPreferences sharedPreferences6 = (SharedPreferences) this.f18897u;
                String str5 = (String) this.f18902z;
                Context context4 = (Context) this.f18898v;
                InterfaceC1809a1 interfaceC1809a152 = (InterfaceC1809a1) this.f18890n;
                InterfaceC1809a1 interfaceC1809a153 = (InterfaceC1809a1) this.f18891o;
                InterfaceC1809a1 interfaceC1809a154 = (InterfaceC1809a1) this.f18892p;
                InterfaceC1809a1 interfaceC1809a155 = (InterfaceC1809a1) this.f18893q;
                InterfaceC1809a1 interfaceC1809a156 = (InterfaceC1809a1) this.f18894r;
                InterfaceC1809a1 interfaceC1809a157 = (InterfaceC1809a1) this.f18895s;
                InterfaceC1809a1 interfaceC1809a158 = (InterfaceC1809a1) this.f18896t;
                InterfaceC1809a1 interfaceC1809a159 = (InterfaceC1809a1) this.f18899w;
                InterfaceC1809a1 interfaceC1809a160 = (InterfaceC1809a1) this.f18900x;
                InterfaceC1809a1 interfaceC1809a161 = (InterfaceC1809a1) this.f18901y;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h06.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-626126538, new C5010jf(this.f18884h, sharedPreferences6, str5, this.f18885i, this.f18886j, context4, this.f18887k, this.f18888l, this.f18889m, interfaceC1809a152, interfaceC1809a153, interfaceC1809a154, interfaceC1809a155, interfaceC1809a156, interfaceC1809a157, interfaceC1809a158, interfaceC1809a159, interfaceC1809a160, interfaceC1809a161), c1836h06), c1836h06, 48, 1);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                Context context5 = (Context) this.f18898v;
                SharedPreferences sharedPreferences7 = (SharedPreferences) this.f18897u;
                InterfaceC4544a interfaceC4544a2 = (InterfaceC4544a) this.f18899w;
                C4060x c4060x = (C4060x) this.f18900x;
                InterfaceC1809a1 interfaceC1809a162 = (InterfaceC1809a1) this.f18890n;
                InterfaceC1809a1 interfaceC1809a163 = (InterfaceC1809a1) this.f18891o;
                InterfaceC1809a1 interfaceC1809a164 = (InterfaceC1809a1) this.f18892p;
                final InterfaceC1809a1 interfaceC1809a165 = (InterfaceC1809a1) this.f18893q;
                final InterfaceC1809a1 interfaceC1809a166 = (InterfaceC1809a1) this.f18894r;
                InterfaceC1809a1 interfaceC1809a167 = (InterfaceC1809a1) this.f18895s;
                InterfaceC1809a1 interfaceC1809a168 = (InterfaceC1809a1) this.f18896t;
                InterfaceC1220a interfaceC1220a16 = (InterfaceC1220a) this.f18901y;
                C3641z c3641z7 = (C3641z) this.f18902z;
                AbstractC4740b6 abstractC4740b6 = (AbstractC4740b6) obj;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                abstractC4740b6.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? c1836h07.m4534f(abstractC4740b6) : c1836h07.m4538h(abstractC4740b6) ? 4 : 2;
                }
                if (c1836h07.m4516S(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    boolean z13 = abstractC4740b6 instanceof C4707a6;
                    InterfaceC1809a1 interfaceC1809a169 = this.f18884h;
                    final InterfaceC1809a1 interfaceC1809a170 = this.f18885i;
                    final InterfaceC1809a1 interfaceC1809a171 = this.f18886j;
                    C1823e c1823e7 = C1851l.f6155a;
                    if (z13) {
                        c1836h07.m4525a0(-1562665300);
                        C4806d6 c4806d6 = ((C4707a6) abstractC4740b6).f15715a;
                        Object objM4514P29 = c1836h07.m4514P();
                        if (objM4514P29 == c1823e7) {
                            objM4514P29 = new C4753bj(interfaceC1809a169, 5);
                            c1836h07.m4545k0(objM4514P29);
                        }
                        InterfaceC1220a interfaceC1220a17 = (InterfaceC1220a) objM4514P29;
                        boolean zM4538h10 = c1836h07.m4538h(c4806d6) | c1836h07.m4538h(sharedPreferences7);
                        Object objM4514P30 = c1836h07.m4514P();
                        if (zM4538h10 || objM4514P30 == c1823e7) {
                            c1823e4 = c1823e7;
                            objM4514P30 = new C0454k(c4806d6, sharedPreferences7, interfaceC1809a170, interfaceC1809a169, 18);
                            c1836h07.m4545k0(objM4514P30);
                        } else {
                            c1823e4 = c1823e7;
                        }
                        InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) objM4514P30;
                        boolean zM4538h11 = c1836h07.m4538h(c4806d6) | c1836h07.m4538h(sharedPreferences7);
                        Object objM4514P31 = c1836h07.m4514P();
                        if (zM4538h11 || objM4514P31 == c1823e4) {
                            z12 = false;
                            C0482r0 c0482r02 = new C0482r0(c4806d6, sharedPreferences7, interfaceC1809a170, interfaceC1809a171, interfaceC1809a169, 21);
                            c1836h07.m4545k0(c0482r02);
                            objM4514P31 = c0482r02;
                        } else {
                            z12 = false;
                        }
                        AbstractC4955ho.m9524d2(context5, c4806d6, interfaceC1220a17, interfaceC1231l6, (InterfaceC1220a) objM4514P31, c1836h07, 448);
                        c1836h07.m4553p(z12);
                    } else {
                        boolean z14 = abstractC4740b6 instanceof C5396v5;
                        final InterfaceC1809a1 interfaceC1809a172 = this.f18887k;
                        if (z14) {
                            c1836h07.m4525a0(-1560748725);
                            C4969i5 c4969i5 = ((C5396v5) abstractC4740b6).f21276a;
                            List list6 = (List) interfaceC1809a170.getValue();
                            Object objM4514P32 = c1836h07.m4514P();
                            if (objM4514P32 == c1823e7) {
                                objM4514P32 = new C4753bj(interfaceC1809a172, 12);
                                c1836h07.m4545k0(objM4514P32);
                            }
                            InterfaceC1220a interfaceC1220a18 = (InterfaceC1220a) objM4514P32;
                            boolean zM4538h12 = c1836h07.m4538h(c4969i5) | c1836h07.m4538h(sharedPreferences7);
                            Object objM4514P33 = c1836h07.m4514P();
                            if (zM4538h12 || objM4514P33 == c1823e7) {
                                interfaceC1809a110 = interfaceC1809a171;
                                c0454k = new C0454k(c4969i5, sharedPreferences7, interfaceC1809a110, interfaceC1809a172, 19);
                                c1836h07.m4545k0(c0454k);
                            } else {
                                c0454k = objM4514P33;
                                interfaceC1809a110 = interfaceC1809a171;
                            }
                            InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) c0454k;
                            boolean zM4538h13 = c1836h07.m4538h(c4969i5) | c1836h07.m4538h(sharedPreferences7);
                            Object objM4514P34 = c1836h07.m4514P();
                            if (zM4538h13 || objM4514P34 == c1823e7) {
                                C0467n0 c0467n0 = new C0467n0(c4969i5, sharedPreferences7, interfaceC1809a110, interfaceC1809a172, 19);
                                c1836h07.m4545k0(c0467n0);
                                objM4514P34 = c0467n0;
                            }
                            AbstractC4955ho.m9424R1(context5, c4969i5, list6, interfaceC1220a18, interfaceC1231l7, (InterfaceC1220a) objM4514P34, c1836h07, 3072);
                            c1836h07.m4553p(false);
                        } else {
                            boolean z15 = abstractC4740b6 instanceof C5363u5;
                            final InterfaceC1809a1 interfaceC1809a173 = this.f18888l;
                            if (z15) {
                                c1836h07.m4525a0(-1559247705);
                                C4936h5 c4936h5 = ((C5363u5) abstractC4740b6).f20992a;
                                List list7 = (List) interfaceC1809a170.getValue();
                                Object objM4514P35 = c1836h07.m4514P();
                                if (objM4514P35 == c1823e7) {
                                    objM4514P35 = new C4753bj(interfaceC1809a173, 13);
                                    c1836h07.m4545k0(objM4514P35);
                                }
                                InterfaceC1220a interfaceC1220a19 = (InterfaceC1220a) objM4514P35;
                                boolean zM4538h14 = c1836h07.m4538h(sharedPreferences7) | c1836h07.m4538h(context5);
                                Object objM4514P36 = c1836h07.m4514P();
                                if (zM4538h14 || objM4514P36 == c1823e7) {
                                    C4883fi c4883fi = new C4883fi(3, context5, sharedPreferences7, interfaceC1809a171, interfaceC1809a173);
                                    c1836h07.m4545k0(c4883fi);
                                    objM4514P36 = c4883fi;
                                }
                                AbstractC4955ho.m9416Q1(context5, c4936h5, list7, interfaceC1220a19, (InterfaceC1231l) objM4514P36, c1836h07, 3072);
                                c1836h07.m4553p(false);
                            } else {
                                boolean z16 = abstractC4740b6 instanceof C5462x5;
                                InterfaceC1809a1 interfaceC1809a174 = this.f18889m;
                                if (z16) {
                                    c1836h07.m4525a0(-1558379612);
                                    int iOrdinal = ((C5462x5) abstractC4740b6).f21850a.ordinal();
                                    if (iOrdinal != 0) {
                                        z11 = true;
                                        if (iOrdinal == 1) {
                                            c0034b = (C0034b) interfaceC1809a162.getValue();
                                        } else {
                                            if (iOrdinal != 2) {
                                                C3193a.m6822k();
                                                return null;
                                            }
                                            c0034b = (C0034b) interfaceC1809a163.getValue();
                                        }
                                    } else {
                                        z11 = true;
                                        c0034b = (C0034b) interfaceC1809a174.getValue();
                                    }
                                    C0034b c0034b2 = c0034b;
                                    List list8 = (List) interfaceC1809a170.getValue();
                                    Object objM4514P37 = c1836h07.m4514P();
                                    if (objM4514P37 == c1823e7) {
                                        interfaceC1809a19 = interfaceC1809a164;
                                        objM4514P37 = new C4753bj(interfaceC1809a19, 14);
                                        c1836h07.m4545k0(objM4514P37);
                                    } else {
                                        interfaceC1809a19 = interfaceC1809a164;
                                    }
                                    InterfaceC1220a interfaceC1220a20 = (InterfaceC1220a) objM4514P37;
                                    if ((iIntValue6 & 14) != 4 && ((iIntValue6 & 8) == 0 || !c1836h07.m4538h(abstractC4740b6))) {
                                        z11 = false;
                                    }
                                    boolean zM4538h15 = c1836h07.m4538h(context5) | z11;
                                    Object objM4514P38 = c1836h07.m4514P();
                                    if (zM4538h15 || objM4514P38 == c1823e7) {
                                        C0886p c0886p = new C0886p(abstractC4740b6, context5, interfaceC1809a174, interfaceC1809a162, interfaceC1809a163, interfaceC1809a19, 8);
                                        c1836h07.m4545k0(c0886p);
                                        objM4514P38 = c0886p;
                                    }
                                    AbstractC4955ho.m9472X1(context5, c0034b2, list8, interfaceC1220a20, (InterfaceC1231l) objM4514P38, c1836h07, 3072);
                                    c1836h07.m4553p(false);
                                } else if (abstractC4740b6 instanceof C5429w5) {
                                    c1836h07.m4525a0(-1556263986);
                                    C5391v0 c5391v0 = ((C5429w5) abstractC4740b6).f21585a;
                                    Object objM4514P39 = c1836h07.m4514P();
                                    if (objM4514P39 == c1823e7) {
                                        objM4514P39 = new C4753bj(interfaceC1809a165, 6);
                                        c1836h07.m4545k0(objM4514P39);
                                    }
                                    InterfaceC1220a interfaceC1220a21 = (InterfaceC1220a) objM4514P39;
                                    Object objM4514P40 = c1836h07.m4514P();
                                    if (objM4514P40 == c1823e7) {
                                        final int i13 = 0;
                                        z10 = false;
                                        InterfaceC1231l interfaceC1231l8 = new InterfaceC1231l() { // from class: wb.hj
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
                                            @Override // p085fg.InterfaceC1231l
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final Object invoke(Object obj4) {
                                                String strM9264h;
                                                String str6;
                                                Set setM9563h5;
                                                String strM9264h2;
                                                String str7;
                                                String str8;
                                                Set setM9563h52;
                                                String str9;
                                                switch (i13) {
                                                    case 0:
                                                        List list9 = (List) obj4;
                                                        list9.getClass();
                                                        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list9));
                                                        Iterator it2 = list9.iterator();
                                                        while (true) {
                                                            boolean zHasNext = it2.hasNext();
                                                            InterfaceC1809a1 interfaceC1809a175 = interfaceC1809a171;
                                                            if (!zHasNext) {
                                                                if (arrayList.size() == 1) {
                                                                    Iterator it3 = ((List) interfaceC1809a175.getValue()).iterator();
                                                                    int i14 = 0;
                                                                    while (true) {
                                                                        if (it3.hasNext()) {
                                                                            C0033a c0033a = (C0033a) it3.next();
                                                                            if (!AbstractC1416l.m3825a(c0033a.f104b, ((C0033a) AbstractC4166m.m8422t1(arrayList)).f104b) || !AbstractC1416l.m3825a(c0033a.f105c, ((C0033a) AbstractC4166m.m8422t1(arrayList)).f105c)) {
                                                                                i14++;
                                                                            }
                                                                        } else {
                                                                            i14 = -1;
                                                                        }
                                                                    }
                                                                    Integer numValueOf = Integer.valueOf(i14);
                                                                    if (i14 < 0) {
                                                                        numValueOf = null;
                                                                    }
                                                                    interfaceC1809a172.setValue(new C4969i5(numValueOf != null ? numValueOf.intValue() : ((List) interfaceC1809a175.getValue()).size(), (C0033a) AbstractC4166m.m8422t1(arrayList), i14 >= 0));
                                                                } else if (!arrayList.isEmpty()) {
                                                                    interfaceC1809a173.setValue(new C4936h5("批量添加名单", arrayList));
                                                                }
                                                                interfaceC1809a165.setValue(null);
                                                            } else {
                                                                C5292s0 c5292s0 = (C5292s0) it2.next();
                                                                List list10 = (List) interfaceC1809a170.getValue();
                                                                C0033a c0033aM9308C5 = AbstractC4955ho.m9308C5("contact", c5292s0.f20550a, (List) interfaceC1809a175.getValue());
                                                                String str10 = c5292s0.f20551b;
                                                                String str11 = c5292s0.f20550a;
                                                                String str12 = AbstractC3149m.m6721t0(str10) ? str11 : str10;
                                                                if (c0033aM9308C5 == null || (strM9264h = c0033aM9308C5.f103a) == null) {
                                                                    strM9264h = AbstractC4855en.m9264h("contact", "|", AbstractC3199a.m6839l(str11, str11));
                                                                }
                                                                String str13 = strM9264h;
                                                                String str14 = c5292s0.f20550a;
                                                                boolean z17 = c0033aM9308C5 != null ? c0033aM9308C5.f107e : true;
                                                                if (c0033aM9308C5 == null || (str6 = c0033aM9308C5.f108f) == null) {
                                                                    str6 = "block";
                                                                }
                                                                String str15 = str6;
                                                                if (c0033aM9308C5 == null || (setM9563h5 = c0033aM9308C5.f109g) == null) {
                                                                    setM9563h5 = AbstractC4955ho.m9563h5(list10);
                                                                }
                                                                arrayList.add(new C0033a(str13, "contact", str14, str12, z17, str15, setM9563h5));
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        List list11 = (List) obj4;
                                                        list11.getClass();
                                                        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list11));
                                                        Iterator it4 = list11.iterator();
                                                        while (true) {
                                                            boolean zHasNext2 = it4.hasNext();
                                                            InterfaceC1809a1 interfaceC1809a176 = interfaceC1809a171;
                                                            if (!zHasNext2) {
                                                                if (arrayList2.size() == 1) {
                                                                    C0033a c0033a2 = (C0033a) AbstractC4166m.m8422t1(arrayList2);
                                                                    Iterator it5 = ((List) interfaceC1809a176.getValue()).iterator();
                                                                    int i15 = 0;
                                                                    while (true) {
                                                                        if (it5.hasNext()) {
                                                                            C0033a c0033a3 = (C0033a) it5.next();
                                                                            if (!AbstractC1416l.m3825a(c0033a3.f104b, c0033a2.f104b) || !AbstractC1416l.m3825a(c0033a3.f105c, c0033a2.f105c)) {
                                                                                i15++;
                                                                            }
                                                                        } else {
                                                                            i15 = -1;
                                                                        }
                                                                    }
                                                                    Integer numValueOf2 = Integer.valueOf(i15);
                                                                    if (i15 < 0) {
                                                                        numValueOf2 = null;
                                                                    }
                                                                    interfaceC1809a172.setValue(new C4969i5(numValueOf2 != null ? numValueOf2.intValue() : ((List) interfaceC1809a176.getValue()).size(), c0033a2, i15 >= 0));
                                                                } else if (!arrayList2.isEmpty()) {
                                                                    interfaceC1809a173.setValue(new C4936h5("批量添加群成员", arrayList2));
                                                                }
                                                                interfaceC1809a165.setValue(null);
                                                            } else {
                                                                String str16 = (String) it4.next();
                                                                List list12 = (List) interfaceC1809a170.getValue();
                                                                C0033a c0033aM9308C52 = AbstractC4955ho.m9308C5("group_member", str16, (List) interfaceC1809a176.getValue());
                                                                String strM9636p6 = AbstractC4955ho.m9636p6(str16);
                                                                if (strM9636p6 == null) {
                                                                    strM9636p6 = AbstractC3149m.m6703R0(str16).toString();
                                                                }
                                                                String str17 = strM9636p6;
                                                                if (c0033aM9308C52 == null || (strM9264h2 = c0033aM9308C52.f103a) == null) {
                                                                    strM9264h2 = AbstractC4855en.m9264h("group_member", "|", AbstractC3199a.m6839l(str17, str17));
                                                                }
                                                                String str18 = strM9264h2;
                                                                if (c0033aM9308C52 == null || (str9 = c0033aM9308C52.f106d) == null) {
                                                                    str7 = str17;
                                                                } else {
                                                                    String str19 = AbstractC3149m.m6721t0(str9) ? null : str9;
                                                                    if (str19 != null) {
                                                                        str7 = str19;
                                                                    }
                                                                }
                                                                boolean z18 = c0033aM9308C52 != null ? c0033aM9308C52.f107e : true;
                                                                if (c0033aM9308C52 == null || (str8 = c0033aM9308C52.f108f) == null) {
                                                                    str8 = "block";
                                                                }
                                                                String str20 = str8;
                                                                if (c0033aM9308C52 == null || (setM9563h52 = c0033aM9308C52.f109g) == null) {
                                                                    setM9563h52 = AbstractC4955ho.m9563h5(list12);
                                                                }
                                                                arrayList2.add(new C0033a(str18, "group_member", str17, str7, z18, str20, setM9563h52));
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        };
                                        c1836h07.m4545k0(interfaceC1231l8);
                                        objM4514P40 = interfaceC1231l8;
                                    } else {
                                        z10 = false;
                                    }
                                    AbstractC4955ho.m9504b0(context5, c5391v0, interfaceC1220a21, (InterfaceC1231l) objM4514P40, c1836h07, 3456);
                                    c1836h07.m4553p(z10);
                                } else if (abstractC4740b6 instanceof C5494y5) {
                                    c1836h07.m4525a0(-1554521104);
                                    C4804d4 c4804d4 = ((C5494y5) abstractC4740b6).f22072a;
                                    Object objM4514P41 = c1836h07.m4514P();
                                    if (objM4514P41 == c1823e7) {
                                        objM4514P41 = new C4753bj(interfaceC1809a166, 7);
                                        c1836h07.m4545k0(objM4514P41);
                                    }
                                    InterfaceC1220a interfaceC1220a22 = (InterfaceC1220a) objM4514P41;
                                    Object objM4514P42 = c1836h07.m4514P();
                                    if (objM4514P42 == c1823e7) {
                                        final int i14 = 1;
                                        InterfaceC1231l interfaceC1231l9 = new InterfaceC1231l() { // from class: wb.hj
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
                                            @Override // p085fg.InterfaceC1231l
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final Object invoke(Object obj4) {
                                                String strM9264h;
                                                String str6;
                                                Set setM9563h5;
                                                String strM9264h2;
                                                String str7;
                                                String str8;
                                                Set setM9563h52;
                                                String str9;
                                                switch (i14) {
                                                    case 0:
                                                        List list9 = (List) obj4;
                                                        list9.getClass();
                                                        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list9));
                                                        Iterator it2 = list9.iterator();
                                                        while (true) {
                                                            boolean zHasNext = it2.hasNext();
                                                            InterfaceC1809a1 interfaceC1809a175 = interfaceC1809a171;
                                                            if (!zHasNext) {
                                                                if (arrayList.size() == 1) {
                                                                    Iterator it3 = ((List) interfaceC1809a175.getValue()).iterator();
                                                                    int i142 = 0;
                                                                    while (true) {
                                                                        if (it3.hasNext()) {
                                                                            C0033a c0033a = (C0033a) it3.next();
                                                                            if (!AbstractC1416l.m3825a(c0033a.f104b, ((C0033a) AbstractC4166m.m8422t1(arrayList)).f104b) || !AbstractC1416l.m3825a(c0033a.f105c, ((C0033a) AbstractC4166m.m8422t1(arrayList)).f105c)) {
                                                                                i142++;
                                                                            }
                                                                        } else {
                                                                            i142 = -1;
                                                                        }
                                                                    }
                                                                    Integer numValueOf = Integer.valueOf(i142);
                                                                    if (i142 < 0) {
                                                                        numValueOf = null;
                                                                    }
                                                                    interfaceC1809a172.setValue(new C4969i5(numValueOf != null ? numValueOf.intValue() : ((List) interfaceC1809a175.getValue()).size(), (C0033a) AbstractC4166m.m8422t1(arrayList), i142 >= 0));
                                                                } else if (!arrayList.isEmpty()) {
                                                                    interfaceC1809a173.setValue(new C4936h5("批量添加名单", arrayList));
                                                                }
                                                                interfaceC1809a166.setValue(null);
                                                            } else {
                                                                C5292s0 c5292s0 = (C5292s0) it2.next();
                                                                List list10 = (List) interfaceC1809a170.getValue();
                                                                C0033a c0033aM9308C5 = AbstractC4955ho.m9308C5("contact", c5292s0.f20550a, (List) interfaceC1809a175.getValue());
                                                                String str10 = c5292s0.f20551b;
                                                                String str11 = c5292s0.f20550a;
                                                                String str12 = AbstractC3149m.m6721t0(str10) ? str11 : str10;
                                                                if (c0033aM9308C5 == null || (strM9264h = c0033aM9308C5.f103a) == null) {
                                                                    strM9264h = AbstractC4855en.m9264h("contact", "|", AbstractC3199a.m6839l(str11, str11));
                                                                }
                                                                String str13 = strM9264h;
                                                                String str14 = c5292s0.f20550a;
                                                                boolean z17 = c0033aM9308C5 != null ? c0033aM9308C5.f107e : true;
                                                                if (c0033aM9308C5 == null || (str6 = c0033aM9308C5.f108f) == null) {
                                                                    str6 = "block";
                                                                }
                                                                String str15 = str6;
                                                                if (c0033aM9308C5 == null || (setM9563h5 = c0033aM9308C5.f109g) == null) {
                                                                    setM9563h5 = AbstractC4955ho.m9563h5(list10);
                                                                }
                                                                arrayList.add(new C0033a(str13, "contact", str14, str12, z17, str15, setM9563h5));
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        List list11 = (List) obj4;
                                                        list11.getClass();
                                                        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list11));
                                                        Iterator it4 = list11.iterator();
                                                        while (true) {
                                                            boolean zHasNext2 = it4.hasNext();
                                                            InterfaceC1809a1 interfaceC1809a176 = interfaceC1809a171;
                                                            if (!zHasNext2) {
                                                                if (arrayList2.size() == 1) {
                                                                    C0033a c0033a2 = (C0033a) AbstractC4166m.m8422t1(arrayList2);
                                                                    Iterator it5 = ((List) interfaceC1809a176.getValue()).iterator();
                                                                    int i15 = 0;
                                                                    while (true) {
                                                                        if (it5.hasNext()) {
                                                                            C0033a c0033a3 = (C0033a) it5.next();
                                                                            if (!AbstractC1416l.m3825a(c0033a3.f104b, c0033a2.f104b) || !AbstractC1416l.m3825a(c0033a3.f105c, c0033a2.f105c)) {
                                                                                i15++;
                                                                            }
                                                                        } else {
                                                                            i15 = -1;
                                                                        }
                                                                    }
                                                                    Integer numValueOf2 = Integer.valueOf(i15);
                                                                    if (i15 < 0) {
                                                                        numValueOf2 = null;
                                                                    }
                                                                    interfaceC1809a172.setValue(new C4969i5(numValueOf2 != null ? numValueOf2.intValue() : ((List) interfaceC1809a176.getValue()).size(), c0033a2, i15 >= 0));
                                                                } else if (!arrayList2.isEmpty()) {
                                                                    interfaceC1809a173.setValue(new C4936h5("批量添加群成员", arrayList2));
                                                                }
                                                                interfaceC1809a166.setValue(null);
                                                            } else {
                                                                String str16 = (String) it4.next();
                                                                List list12 = (List) interfaceC1809a170.getValue();
                                                                C0033a c0033aM9308C52 = AbstractC4955ho.m9308C5("group_member", str16, (List) interfaceC1809a176.getValue());
                                                                String strM9636p6 = AbstractC4955ho.m9636p6(str16);
                                                                if (strM9636p6 == null) {
                                                                    strM9636p6 = AbstractC3149m.m6703R0(str16).toString();
                                                                }
                                                                String str17 = strM9636p6;
                                                                if (c0033aM9308C52 == null || (strM9264h2 = c0033aM9308C52.f103a) == null) {
                                                                    strM9264h2 = AbstractC4855en.m9264h("group_member", "|", AbstractC3199a.m6839l(str17, str17));
                                                                }
                                                                String str18 = strM9264h2;
                                                                if (c0033aM9308C52 == null || (str9 = c0033aM9308C52.f106d) == null) {
                                                                    str7 = str17;
                                                                } else {
                                                                    String str19 = AbstractC3149m.m6721t0(str9) ? null : str9;
                                                                    if (str19 != null) {
                                                                        str7 = str19;
                                                                    }
                                                                }
                                                                boolean z18 = c0033aM9308C52 != null ? c0033aM9308C52.f107e : true;
                                                                if (c0033aM9308C52 == null || (str8 = c0033aM9308C52.f108f) == null) {
                                                                    str8 = "block";
                                                                }
                                                                String str20 = str8;
                                                                if (c0033aM9308C52 == null || (setM9563h52 = c0033aM9308C52.f109g) == null) {
                                                                    setM9563h52 = AbstractC4955ho.m9563h5(list12);
                                                                }
                                                                arrayList2.add(new C0033a(str18, "group_member", str17, str7, z18, str20, setM9563h52));
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        };
                                        c1836h07.m4545k0(interfaceC1231l9);
                                        objM4514P42 = interfaceC1231l9;
                                    }
                                    AbstractC4955ho.m9622o1(context5, c4804d4, interfaceC1220a22, (InterfaceC1231l) objM4514P42, c1836h07, 3456);
                                    c1836h07.m4553p(false);
                                } else if (abstractC4740b6.equals(C5526z5.f22327c)) {
                                    c1836h07.m4525a0(-1552756522);
                                    List list9 = (List) interfaceC1809a170.getValue();
                                    Object objM4514P43 = c1836h07.m4514P();
                                    if (objM4514P43 == c1823e7) {
                                        objM4514P43 = new C4753bj(interfaceC1809a167, 8);
                                        c1836h07.m4545k0(objM4514P43);
                                    }
                                    InterfaceC1220a interfaceC1220a23 = (InterfaceC1220a) objM4514P43;
                                    Object objM4514P44 = c1836h07.m4514P();
                                    if (objM4514P44 == c1823e7) {
                                        interfaceC1809a18 = interfaceC1809a169;
                                        objM4514P44 = new C5144nh(interfaceC1809a18, 6);
                                        c1836h07.m4545k0(objM4514P44);
                                    } else {
                                        interfaceC1809a18 = interfaceC1809a169;
                                    }
                                    InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) objM4514P44;
                                    Object objM4514P45 = c1836h07.m4514P();
                                    if (objM4514P45 == c1823e7) {
                                        objM4514P45 = new C0500x0(26, interfaceC1809a170, interfaceC1809a18);
                                        c1836h07.m4545k0(objM4514P45);
                                    }
                                    AbstractC4955ho.m9515c2(list9, interfaceC1220a23, interfaceC1235p2, (InterfaceC1220a) objM4514P45, c1836h07, 3504);
                                    c1836h07.m4553p(false);
                                } else if (abstractC4740b6.equals(C5526z5.f22325a)) {
                                    c1836h07.m4525a0(-1551973121);
                                    List list10 = (List) interfaceC1809a171.getValue();
                                    List list11 = (List) interfaceC1809a170.getValue();
                                    Object objM4514P46 = c1836h07.m4514P();
                                    if (objM4514P46 == c1823e7) {
                                        objM4514P46 = new C4753bj(interfaceC1809a168, 9);
                                        c1836h07.m4545k0(objM4514P46);
                                    }
                                    InterfaceC1220a interfaceC1220a24 = (InterfaceC1220a) objM4514P46;
                                    Object objM4514P47 = c1836h07.m4514P();
                                    if (objM4514P47 == c1823e7) {
                                        objM4514P47 = new C5144nh(interfaceC1809a172, 7);
                                        c1836h07.m4545k0(objM4514P47);
                                    }
                                    InterfaceC1235p interfaceC1235p3 = (InterfaceC1235p) objM4514P47;
                                    Object objM4514P48 = c1836h07.m4514P();
                                    if (objM4514P48 == c1823e7) {
                                        objM4514P48 = new C4753bj(interfaceC1809a165, 10);
                                        c1836h07.m4545k0(objM4514P48);
                                    }
                                    InterfaceC1220a interfaceC1220a25 = (InterfaceC1220a) objM4514P48;
                                    Object objM4514P49 = c1836h07.m4514P();
                                    if (objM4514P49 == c1823e7) {
                                        objM4514P49 = new C4753bj(interfaceC1809a166, 11);
                                        c1836h07.m4545k0(objM4514P49);
                                    }
                                    InterfaceC1220a interfaceC1220a26 = (InterfaceC1220a) objM4514P49;
                                    boolean zM4538h16 = c1836h07.m4538h(context5) | c1836h07.m4538h(sharedPreferences7);
                                    Object objM4514P50 = c1836h07.m4514P();
                                    if (zM4538h16 || objM4514P50 == c1823e7) {
                                        objM4514P50 = new C5337tc(context5, sharedPreferences7, interfaceC1809a171);
                                        c1836h07.m4545k0(objM4514P50);
                                    }
                                    AbstractC4955ho.m9497a2(list10, list11, interfaceC1220a24, interfaceC1235p3, interfaceC1220a25, interfaceC1220a26, (InterfaceC1231l) objM4514P50, c1836h07, 224640);
                                    c1836h07.m4553p(false);
                                } else {
                                    if (!abstractC4740b6.equals(C5526z5.f22326b)) {
                                        throw AbstractC0255e.m1015d(c1836h07, 88150248, false);
                                    }
                                    c1836h07.m4525a0(88552711);
                                    AbstractC4955ho.m9297B2(interfaceC4544a2.mo4984b(), interfaceC4544a2.mo4984b(), c4060x, null, null, AbstractC3879i.m8071e(1902146955, new C4880ff(interfaceC1220a16, 21), c1836h07), AbstractC3879i.m8071e(-1454214395, new C5464x7(c4060x, c3641z7, sharedPreferences7, interfaceC1809a174, interfaceC1809a170, interfaceC1809a164, interfaceC1809a162, interfaceC1809a163, interfaceC1809a167, interfaceC1809a171, interfaceC1809a168), c1836h07), c1836h07, 1769472, 24);
                                    c1836h07.m4553p(false);
                                }
                            }
                        }
                    }
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            default:
                C4060x c4060x2 = (C4060x) this.f18897u;
                C3641z c3641z8 = (C3641z) this.f18898v;
                SharedPreferences sharedPreferences8 = (SharedPreferences) this.f18891o;
                List list12 = (List) this.f18892p;
                String str6 = (String) this.f18893q;
                InterfaceC1231l interfaceC1231l10 = (InterfaceC1231l) this.f18894r;
                String str7 = (String) this.f18895s;
                List list13 = (List) this.f18896t;
                String str8 = (String) this.f18899w;
                InterfaceC1231l interfaceC1231l11 = (InterfaceC1231l) this.f18900x;
                String str9 = (String) this.f18901y;
                InterfaceC1220a interfaceC1220a27 = (InterfaceC1220a) this.f18902z;
                InterfaceC1809a1 interfaceC1809a175 = (InterfaceC1809a1) this.f18890n;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= c1836h08.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h08.m4516S(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x2.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4538h17 = c1836h08.m4538h(sharedPreferences8) | c1836h08.m4538h(list12) | c1836h08.m4534f(str6) | c1836h08.m4534f(interfaceC1231l10) | c1836h08.m4534f(str7) | c1836h08.m4538h(list13) | c1836h08.m4534f(str8) | c1836h08.m4534f(interfaceC1231l11) | c1836h08.m4534f(str9) | c1836h08.m4534f(interfaceC1220a27);
                    Object objM4514P51 = c1836h08.m4514P();
                    if (zM4538h17 || objM4514P51 == C1851l.f6155a) {
                        interfaceC5853o = interfaceC5853oM7631a;
                        objM4514P51 = new C4809d9(sharedPreferences8, list12, str6, interfaceC1231l10, str7, list13, str8, interfaceC1231l11, str9, interfaceC1220a27, this.f18884h, this.f18885i, this.f18886j, this.f18887k, this.f18888l, this.f18889m, interfaceC1809a175);
                        c1836h08.m4545k0(objM4514P51);
                    } else {
                        interfaceC5853o = interfaceC5853oM7631a;
                    }
                    AbstractC0000a.m53b(interfaceC5853o, c3641z8, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P51, c1836h08, 0, 504);
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C5105mb(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117, InterfaceC3599t interfaceC3599t) {
        this.f18898v = context;
        this.f18897u = interfaceC3599t;
        this.f18884h = interfaceC1809a1;
        this.f18885i = interfaceC1809a12;
        this.f18886j = interfaceC1809a13;
        this.f18887k = interfaceC1809a14;
        this.f18888l = interfaceC1809a15;
        this.f18889m = interfaceC1809a16;
        this.f18890n = interfaceC1809a17;
        this.f18891o = interfaceC1809a18;
        this.f18892p = interfaceC1809a19;
        this.f18893q = interfaceC1809a110;
        this.f18894r = interfaceC1809a111;
        this.f18895s = interfaceC1809a112;
        this.f18896t = interfaceC1809a113;
        this.f18899w = interfaceC1809a114;
        this.f18900x = interfaceC1809a115;
        this.f18901y = interfaceC1809a116;
        this.f18902z = interfaceC1809a117;
    }

    public /* synthetic */ C5105mb(SharedPreferences sharedPreferences, List list, String str, List list2, Set set, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113) {
        this.f18897u = sharedPreferences;
        this.f18898v = list;
        this.f18899w = str;
        this.f18900x = list2;
        this.f18901y = set;
        this.f18902z = interfaceC1220a;
        this.f18884h = interfaceC1809a1;
        this.f18885i = interfaceC1809a12;
        this.f18886j = interfaceC1809a13;
        this.f18887k = interfaceC1809a14;
        this.f18888l = interfaceC1809a15;
        this.f18889m = interfaceC1809a16;
        this.f18890n = interfaceC1809a17;
        this.f18891o = interfaceC1809a18;
        this.f18892p = interfaceC1809a19;
        this.f18893q = interfaceC1809a110;
        this.f18894r = interfaceC1809a111;
        this.f18895s = interfaceC1809a112;
        this.f18896t = interfaceC1809a113;
    }

    public /* synthetic */ C5105mb(InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, String str, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, Context context, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116) {
        this.f18884h = interfaceC1809a1;
        this.f18897u = sharedPreferences;
        this.f18902z = str;
        this.f18885i = interfaceC1809a12;
        this.f18886j = interfaceC1809a13;
        this.f18898v = context;
        this.f18887k = interfaceC1809a14;
        this.f18888l = interfaceC1809a15;
        this.f18889m = interfaceC1809a16;
        this.f18890n = interfaceC1809a17;
        this.f18891o = interfaceC1809a18;
        this.f18892p = interfaceC1809a19;
        this.f18893q = interfaceC1809a110;
        this.f18894r = interfaceC1809a111;
        this.f18895s = interfaceC1809a112;
        this.f18896t = interfaceC1809a113;
        this.f18899w = interfaceC1809a114;
        this.f18900x = interfaceC1809a115;
        this.f18901y = interfaceC1809a116;
    }

    public /* synthetic */ C5105mb(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, List list, String str, InterfaceC1231l interfaceC1231l, String str2, List list2, String str3, InterfaceC1231l interfaceC1231l2, String str4, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17) {
        this.f18897u = c4060x;
        this.f18898v = c3641z;
        this.f18891o = sharedPreferences;
        this.f18892p = list;
        this.f18893q = str;
        this.f18894r = interfaceC1231l;
        this.f18895s = str2;
        this.f18896t = list2;
        this.f18899w = str3;
        this.f18900x = interfaceC1231l2;
        this.f18901y = str4;
        this.f18902z = interfaceC1220a;
        this.f18884h = interfaceC1809a1;
        this.f18885i = interfaceC1809a12;
        this.f18886j = interfaceC1809a13;
        this.f18887k = interfaceC1809a14;
        this.f18888l = interfaceC1809a15;
        this.f18889m = interfaceC1809a16;
        this.f18890n = interfaceC1809a17;
    }

    public /* synthetic */ C5105mb(C5725r c5725r, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117) {
        this.f18897u = c5725r;
        this.f18898v = context;
        this.f18884h = interfaceC1809a1;
        this.f18885i = interfaceC1809a12;
        this.f18886j = interfaceC1809a13;
        this.f18887k = interfaceC1809a14;
        this.f18888l = interfaceC1809a15;
        this.f18889m = interfaceC1809a16;
        this.f18890n = interfaceC1809a17;
        this.f18891o = interfaceC1809a18;
        this.f18892p = interfaceC1809a19;
        this.f18893q = interfaceC1809a110;
        this.f18894r = interfaceC1809a111;
        this.f18895s = interfaceC1809a112;
        this.f18896t = interfaceC1809a113;
        this.f18899w = interfaceC1809a114;
        this.f18900x = interfaceC1809a115;
        this.f18901y = interfaceC1809a116;
        this.f18902z = interfaceC1809a117;
    }

    public /* synthetic */ C5105mb(C5725r c5725r, Context context, C3641z c3641z, C3641z c3641z2, SharedPreferences sharedPreferences, C3641z c3641z3, C5225q c5225q, C3641z c3641z4, C3641z c3641z5, C5225q c5225q2, C3641z c3641z6, InterfaceC4544a interfaceC4544a, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16) {
        this.f18897u = c5725r;
        this.f18898v = context;
        this.f18890n = c3641z;
        this.f18891o = c3641z2;
        this.f18892p = sharedPreferences;
        this.f18893q = c3641z3;
        this.f18894r = c5225q;
        this.f18895s = c3641z4;
        this.f18896t = c3641z5;
        this.f18899w = c5225q2;
        this.f18900x = c3641z6;
        this.f18901y = interfaceC4544a;
        this.f18902z = interfaceC1220a;
        this.f18884h = interfaceC1809a1;
        this.f18885i = interfaceC1809a12;
        this.f18886j = interfaceC1809a13;
        this.f18887k = interfaceC1809a14;
        this.f18888l = interfaceC1809a15;
        this.f18889m = interfaceC1809a16;
    }
}
