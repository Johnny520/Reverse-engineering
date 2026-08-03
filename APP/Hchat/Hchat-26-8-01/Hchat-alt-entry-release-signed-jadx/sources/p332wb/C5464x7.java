package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import p000a.AbstractC0000a;
import p051db.C0765c;
import p080fb.C1183v;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1891w1;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p249qg.InterfaceC3599t;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4029m1;
import sh.C4060x;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.x7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5464x7 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21853g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f21854h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f21855i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f21856j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f21857k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f21858l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f21859m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f21860n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f21861o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f21862p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f21863q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f21864r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5464x7(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110) {
        this.f21854h = context;
        this.f21855i = interfaceC1809a1;
        this.f21856j = interfaceC1809a12;
        this.f21857k = interfaceC1809a13;
        this.f21858l = interfaceC1809a14;
        this.f21859m = interfaceC1809a15;
        this.f21860n = interfaceC1809a16;
        this.f21861o = interfaceC1809a17;
        this.f21862p = interfaceC1809a18;
        this.f21863q = interfaceC1809a19;
        this.f21864r = interfaceC1809a110;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        Context context;
        boolean z9;
        boolean z10;
        int i9;
        boolean z11;
        String str;
        String str2;
        String str3;
        boolean z12;
        switch (this.f21853g) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f21860n;
                String str4 = (String) this.f21861o;
                String str5 = (String) this.f21862p;
                C5225q c5225q = (C5225q) this.f21863q;
                Context context2 = (Context) this.f21854h;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f21864r;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f21855i;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f21856j;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f21857k;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f21858l;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f21859m;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zM4538h = c1836h0.m4538h(sharedPreferences) | c1836h0.m4534f(str4) | c1836h0.m4534f(str5) | c1836h0.m4534f(c5225q) | c1836h0.m4538h(context2);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4538h || objM4514P == C1851l.f6155a) {
                        objM4514P = new C5169o9(sharedPreferences, str4, str5, context2, interfaceC1809a1, interfaceC1809a12, c5225q, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9382M("保存", (InterfaceC1220a) objM4514P, "返回", interfaceC1220a, null, null, c1836h0, 390, 48);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                Context context3 = (Context) this.f21854h;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f21855i;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f21856j;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f21857k;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f21858l;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f21859m;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f21860n;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f21861o;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f21862p;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f21863q;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f21864r;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                    Object objM4514P2 = c1836h02.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (objM4514P2 == c1823e) {
                        context = context3;
                        objM4514P2 = new C4944hd(interfaceC1809a16, 20);
                        c1836h02.m4545k0(objM4514P2);
                    } else {
                        context = context3;
                    }
                    InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P2;
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                    Object objM4514P3 = c1836h02.m4514P();
                    if (objM4514P3 == c1823e) {
                        z9 = zBooleanValue2;
                        objM4514P3 = new C4944hd(interfaceC1809a17, 21);
                        c1836h02.m4545k0(objM4514P3);
                    } else {
                        z9 = zBooleanValue2;
                    }
                    InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) objM4514P3;
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a18.getValue()).booleanValue();
                    Object objM4514P4 = c1836h02.m4514P();
                    if (objM4514P4 == c1823e) {
                        z10 = zBooleanValue3;
                        objM4514P4 = new C4944hd(interfaceC1809a18, 22);
                        c1836h02.m4545k0(objM4514P4);
                    } else {
                        z10 = zBooleanValue3;
                    }
                    InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) objM4514P4;
                    int iIntValue3 = ((Number) interfaceC1809a19.getValue()).intValue();
                    Object objM4514P5 = c1836h02.m4514P();
                    if (objM4514P5 == c1823e) {
                        i9 = iIntValue3;
                        objM4514P5 = new C4029m1(6, interfaceC1809a19, interfaceC1809a110);
                        c1836h02.m4545k0(objM4514P5);
                    } else {
                        i9 = iIntValue3;
                    }
                    InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) objM4514P5;
                    boolean zBooleanValue4 = ((Boolean) interfaceC1809a111.getValue()).booleanValue();
                    Object objM4514P6 = c1836h02.m4514P();
                    if (objM4514P6 == c1823e) {
                        z11 = zBooleanValue4;
                        objM4514P6 = new C4944hd(interfaceC1809a111, 23);
                        c1836h02.m4545k0(objM4514P6);
                    } else {
                        z11 = zBooleanValue4;
                    }
                    InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) objM4514P6;
                    String str6 = (String) interfaceC1809a110.getValue();
                    Object objM4514P7 = c1836h02.m4514P();
                    if (objM4514P7 == c1823e) {
                        str = str6;
                        objM4514P7 = new C4944hd(interfaceC1809a110, 24);
                        c1836h02.m4545k0(objM4514P7);
                    } else {
                        str = str6;
                    }
                    InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) objM4514P7;
                    String str7 = (String) interfaceC1809a112.getValue();
                    Object objM4514P8 = c1836h02.m4514P();
                    if (objM4514P8 == c1823e) {
                        str2 = str7;
                        objM4514P8 = new C4944hd(interfaceC1809a112, 25);
                        c1836h02.m4545k0(objM4514P8);
                    } else {
                        str2 = str7;
                    }
                    InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) objM4514P8;
                    String str8 = (String) interfaceC1809a113.getValue();
                    Object objM4514P9 = c1836h02.m4514P();
                    if (objM4514P9 == c1823e) {
                        str3 = str8;
                        objM4514P9 = new C4944hd(interfaceC1809a113, 26);
                        c1836h02.m4545k0(objM4514P9);
                    } else {
                        str3 = str8;
                    }
                    InterfaceC1231l interfaceC1231l8 = (InterfaceC1231l) objM4514P9;
                    boolean zBooleanValue5 = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                    Object objM4514P10 = c1836h02.m4514P();
                    if (objM4514P10 == c1823e) {
                        z12 = zBooleanValue5;
                        objM4514P10 = new C4944hd(interfaceC1809a114, 27);
                        c1836h02.m4545k0(objM4514P10);
                    } else {
                        z12 = zBooleanValue5;
                    }
                    InterfaceC1231l interfaceC1231l9 = (InterfaceC1231l) objM4514P10;
                    String str9 = (String) interfaceC1809a115.getValue();
                    Object objM4514P11 = c1836h02.m4514P();
                    if (objM4514P11 == c1823e) {
                        objM4514P11 = new C4944hd(interfaceC1809a115, 28);
                        c1836h02.m4545k0(objM4514P11);
                    }
                    AbstractC4955ho.m9508b4(context, zBooleanValue, interfaceC1231l, z9, interfaceC1231l2, z10, interfaceC1231l3, i9, interfaceC1231l4, z11, interfaceC1231l5, str, interfaceC1231l6, str2, interfaceC1231l7, str3, interfaceC1231l8, z12, interfaceC1231l9, str9, (InterfaceC1231l) objM4514P11, c1836h02, 102261120, 102261126, 6);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f21860n;
                Context context4 = (Context) this.f21854h;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f21864r;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f21855i;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f21856j;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f21857k;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f21858l;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f21859m;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f21861o;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f21862p;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f21863q;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h03.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-125927169, new C5167o7(sharedPreferences2, context4, interfaceC1220a2, interfaceC1809a116, interfaceC1809a117, interfaceC1809a118, interfaceC1809a119, interfaceC1809a120, interfaceC1809a121, interfaceC1809a122, interfaceC1809a123), c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 3:
                C4060x c4060x = (C4060x) this.f21861o;
                C3641z c3641z = (C3641z) this.f21862p;
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f21860n;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f21855i;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f21856j;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f21857k;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) this.f21858l;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) this.f21859m;
                InterfaceC1809a1 interfaceC1809a129 = (InterfaceC1809a1) this.f21863q;
                InterfaceC1809a1 interfaceC1809a130 = (InterfaceC1809a1) this.f21854h;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) this.f21864r;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c1836h04.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h04.m4516S(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4538h2 = c1836h04.m4538h(sharedPreferences3);
                    Object objM4514P12 = c1836h04.m4514P();
                    if (zM4538h2 || objM4514P12 == C1851l.f6155a) {
                        C1891w1 c1891w1 = new C1891w1(sharedPreferences3, interfaceC1809a124, interfaceC1809a125, interfaceC1809a126, interfaceC1809a127, interfaceC1809a128, interfaceC1809a129, interfaceC1809a130, interfaceC1809a131, 5);
                        c1836h04.m4545k0(c1891w1);
                        objM4514P12 = c1891w1;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P12, c1836h04, 0, 504);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 4:
                C4060x c4060x2 = (C4060x) this.f21860n;
                C3641z c3641z2 = (C3641z) this.f21861o;
                C0765c c0765c = (C0765c) this.f21862p;
                InterfaceC1231l interfaceC1231l10 = (InterfaceC1231l) this.f21863q;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f21864r;
                InterfaceC1231l interfaceC1231l11 = (InterfaceC1231l) this.f21855i;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f21856j;
                InterfaceC1231l interfaceC1231l12 = (InterfaceC1231l) this.f21857k;
                Context context5 = (Context) this.f21854h;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f21858l;
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) this.f21859m;
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= c1836h05.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h05.m4516S(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x2.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    boolean zM4538h3 = c1836h05.m4538h(c0765c) | c1836h05.m4534f(interfaceC1231l10) | c1836h05.m4534f(interfaceC1220a3) | c1836h05.m4534f(interfaceC1231l11) | c1836h05.m4534f(interfaceC1235p) | c1836h05.m4534f(interfaceC1231l12) | c1836h05.m4538h(context5) | c1836h05.m4534f(interfaceC1220a4) | c1836h05.m4534f(interfaceC1220a5);
                    Object objM4514P13 = c1836h05.m4514P();
                    if (zM4538h3 || objM4514P13 == C1851l.f6155a) {
                        C1891w1 c1891w12 = new C1891w1(c0765c, interfaceC1220a4, interfaceC1220a5, interfaceC1231l10, interfaceC1220a3, interfaceC1231l11, interfaceC1235p, interfaceC1231l12, context5, 2);
                        c1836h05.m4545k0(c1891w12);
                        objM4514P13 = c1891w12;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, c3641z2, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P13, c1836h05, 0, 504);
                } else {
                    c1836h05.m4519V();
                }
                break;
            case 5:
                InterfaceC1231l interfaceC1231l13 = (InterfaceC1231l) this.f21860n;
                C4969i5 c4969i5 = (C4969i5) this.f21861o;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f21855i;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f21856j;
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) this.f21857k;
                InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) this.f21858l;
                InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) this.f21859m;
                InterfaceC1809a1 interfaceC1809a137 = (InterfaceC1809a1) this.f21862p;
                InterfaceC1809a1 interfaceC1809a138 = (InterfaceC1809a1) this.f21863q;
                Context context6 = (Context) this.f21854h;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) this.f21864r;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h06.m4516S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    boolean zM4534f = c1836h06.m4534f(interfaceC1231l13) | c1836h06.m4538h(c4969i5) | c1836h06.m4534f(interfaceC1809a132) | c1836h06.m4534f(interfaceC1809a133) | c1836h06.m4534f(interfaceC1809a134) | c1836h06.m4534f(interfaceC1809a135) | c1836h06.m4534f(interfaceC1809a136) | c1836h06.m4534f(interfaceC1809a137) | c1836h06.m4534f(interfaceC1809a138) | c1836h06.m4538h(context6);
                    Object objM4514P14 = c1836h06.m4514P();
                    if (zM4534f || objM4514P14 == C1851l.f6155a) {
                        objM4514P14 = new C5169o9(interfaceC1231l13, c4969i5, context6, interfaceC1809a132, interfaceC1809a133, interfaceC1809a134, interfaceC1809a135, interfaceC1809a136, interfaceC1809a137, interfaceC1809a138);
                        c1836h06.m4545k0(objM4514P14);
                    }
                    AbstractC4955ho.m9382M("保存名单", (InterfaceC1220a) objM4514P14, "返回", interfaceC1220a6, null, null, c1836h06, 390, 48);
                } else {
                    c1836h06.m4519V();
                }
                break;
            case 6:
                C4060x c4060x3 = (C4060x) this.f21860n;
                C3641z c3641z3 = (C3641z) this.f21862p;
                String str10 = (String) this.f21861o;
                List list = (List) this.f21863q;
                ArrayList arrayList = (ArrayList) this.f21854h;
                List list2 = (List) this.f21864r;
                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) this.f21859m;
                InterfaceC1809a1 interfaceC1809a139 = (InterfaceC1809a1) this.f21855i;
                InterfaceC1809a1 interfaceC1809a140 = (InterfaceC1809a1) this.f21856j;
                InterfaceC1809a1 interfaceC1809a141 = (InterfaceC1809a1) this.f21857k;
                InterfaceC1809a1 interfaceC1809a142 = (InterfaceC1809a1) this.f21858l;
                InterfaceC3268x0 interfaceC3268x03 = (InterfaceC3268x0) obj;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                interfaceC3268x03.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= c1836h07.m4534f(interfaceC3268x03) ? 4 : 2;
                }
                if (c1836h07.m4516S(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a3 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x3.f13440e, null);
                    C3272z0 c3272z0M6872b3 = AbstractC3208d.m6872b(interfaceC3268x03.mo6924c() + 8, interfaceC3268x03.mo6922a() + 84, 5);
                    boolean zM4534f2 = c1836h07.m4534f(str10) | c1836h07.m4538h(list) | c1836h07.m4538h(arrayList) | c1836h07.m4538h(list2) | c1836h07.m4534f(interfaceC1235p2);
                    Object objM4514P15 = c1836h07.m4514P();
                    if (zM4534f2 || objM4514P15 == C1851l.f6155a) {
                        C1891w1 c1891w13 = new C1891w1(interfaceC1809a139, interfaceC1809a140, str10, list, arrayList, list2, interfaceC1235p2, interfaceC1809a141, interfaceC1809a142);
                        c1836h07.m4545k0(c1891w13);
                        objM4514P15 = c1891w13;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a3, c3641z3, c3272z0M6872b3, null, null, null, false, null, (InterfaceC1231l) objM4514P15, c1836h07, 0, 504);
                } else {
                    c1836h07.m4519V();
                }
                break;
            default:
                C4060x c4060x4 = (C4060x) this.f21860n;
                C3641z c3641z4 = (C3641z) this.f21862p;
                InterfaceC1809a1 interfaceC1809a143 = (InterfaceC1809a1) this.f21855i;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f21863q;
                C1183v c1183v = (C1183v) this.f21854h;
                InterfaceC1809a1 interfaceC1809a144 = (InterfaceC1809a1) this.f21856j;
                List list3 = (List) this.f21864r;
                String str11 = (String) this.f21861o;
                InterfaceC1809a1 interfaceC1809a145 = (InterfaceC1809a1) this.f21857k;
                InterfaceC1809a1 interfaceC1809a146 = (InterfaceC1809a1) this.f21858l;
                InterfaceC1809a1 interfaceC1809a147 = (InterfaceC1809a1) this.f21859m;
                InterfaceC3268x0 interfaceC3268x04 = (InterfaceC3268x0) obj;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                interfaceC3268x04.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= c1836h08.m4534f(interfaceC3268x04) ? 4 : 2;
                }
                if (c1836h08.m4516S(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a4 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x4.f13440e, null);
                    C3272z0 c3272z0M6872b4 = AbstractC3208d.m6872b(interfaceC3268x04.mo6924c() + 8, interfaceC3268x04.mo6922a() + 84, 5);
                    boolean zM4534f3 = c1836h08.m4534f(interfaceC1809a143) | c1836h08.m4538h(interfaceC3599t) | c1836h08.m4538h(c1183v) | c1836h08.m4534f(interfaceC1809a144) | c1836h08.m4538h(list3) | c1836h08.m4534f(str11);
                    Object objM4514P16 = c1836h08.m4514P();
                    if (zM4534f3 || objM4514P16 == C1851l.f6155a) {
                        C1891w1 c1891w14 = new C1891w1(list3, interfaceC3599t, c1183v, interfaceC1809a143, interfaceC1809a144, interfaceC1809a145, interfaceC1809a146, interfaceC1809a147, str11);
                        c1836h08.m4545k0(c1891w14);
                        objM4514P16 = c1891w14;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a4, c3641z4, c3272z0M6872b4, null, null, null, false, null, (InterfaceC1231l) objM4514P16, c1836h08, 0, 504);
                } else {
                    c1836h08.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5464x7(SharedPreferences sharedPreferences, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f21860n = sharedPreferences;
        this.f21854h = context;
        this.f21864r = interfaceC1220a;
        this.f21855i = interfaceC1809a1;
        this.f21856j = interfaceC1809a12;
        this.f21857k = interfaceC1809a13;
        this.f21858l = interfaceC1809a14;
        this.f21859m = interfaceC1809a15;
        this.f21861o = interfaceC1809a16;
        this.f21862p = interfaceC1809a17;
        this.f21863q = interfaceC1809a18;
    }

    public /* synthetic */ C5464x7(SharedPreferences sharedPreferences, String str, String str2, C5225q c5225q, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f21860n = sharedPreferences;
        this.f21861o = str;
        this.f21862p = str2;
        this.f21863q = c5225q;
        this.f21854h = context;
        this.f21864r = interfaceC1220a;
        this.f21855i = interfaceC1809a1;
        this.f21856j = interfaceC1809a12;
        this.f21857k = interfaceC1809a13;
        this.f21858l = interfaceC1809a14;
        this.f21859m = interfaceC1809a15;
    }

    public /* synthetic */ C5464x7(InterfaceC1231l interfaceC1231l, C4969i5 c4969i5, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, Context context, InterfaceC1220a interfaceC1220a) {
        this.f21860n = interfaceC1231l;
        this.f21861o = c4969i5;
        this.f21855i = interfaceC1809a1;
        this.f21856j = interfaceC1809a12;
        this.f21857k = interfaceC1809a13;
        this.f21858l = interfaceC1809a14;
        this.f21859m = interfaceC1809a15;
        this.f21862p = interfaceC1809a16;
        this.f21863q = interfaceC1809a17;
        this.f21854h = context;
        this.f21864r = interfaceC1220a;
    }

    public /* synthetic */ C5464x7(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f21861o = c4060x;
        this.f21862p = c3641z;
        this.f21860n = sharedPreferences;
        this.f21855i = interfaceC1809a1;
        this.f21856j = interfaceC1809a12;
        this.f21857k = interfaceC1809a13;
        this.f21858l = interfaceC1809a14;
        this.f21859m = interfaceC1809a15;
        this.f21863q = interfaceC1809a16;
        this.f21854h = interfaceC1809a17;
        this.f21864r = interfaceC1809a18;
    }

    public /* synthetic */ C5464x7(C4060x c4060x, C3641z c3641z, C0765c c0765c, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l2, InterfaceC1235p interfaceC1235p, InterfaceC1231l interfaceC1231l3, Context context, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3) {
        this.f21860n = c4060x;
        this.f21861o = c3641z;
        this.f21862p = c0765c;
        this.f21863q = interfaceC1231l;
        this.f21864r = interfaceC1220a;
        this.f21855i = interfaceC1231l2;
        this.f21856j = interfaceC1235p;
        this.f21857k = interfaceC1231l3;
        this.f21854h = context;
        this.f21858l = interfaceC1220a2;
        this.f21859m = interfaceC1220a3;
    }

    public /* synthetic */ C5464x7(C4060x c4060x, C3641z c3641z, InterfaceC1809a1 interfaceC1809a1, InterfaceC3599t interfaceC3599t, C1183v c1183v, InterfaceC1809a1 interfaceC1809a12, List list, String str, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f21860n = c4060x;
        this.f21862p = c3641z;
        this.f21855i = interfaceC1809a1;
        this.f21863q = interfaceC3599t;
        this.f21854h = c1183v;
        this.f21856j = interfaceC1809a12;
        this.f21864r = list;
        this.f21861o = str;
        this.f21857k = interfaceC1809a13;
        this.f21858l = interfaceC1809a14;
        this.f21859m = interfaceC1809a15;
    }

    public /* synthetic */ C5464x7(C4060x c4060x, C3641z c3641z, String str, List list, ArrayList arrayList, List list2, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f21860n = c4060x;
        this.f21862p = c3641z;
        this.f21861o = str;
        this.f21863q = list;
        this.f21854h = arrayList;
        this.f21864r = list2;
        this.f21859m = interfaceC1235p;
        this.f21855i = interfaceC1809a1;
        this.f21856j = interfaceC1809a12;
        this.f21857k = interfaceC1809a13;
        this.f21858l = interfaceC1809a14;
    }
}
