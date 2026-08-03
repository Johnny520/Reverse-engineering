package p332wb;

import android.content.SharedPreferences;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3623h;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.C3874d;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4060x;

/* JADX INFO: renamed from: wb.g8 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4906g8 implements InterfaceC1236q {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ InterfaceC1809a1 f17356A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ InterfaceC1809a1 f17357B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ InterfaceC1809a1 f17358C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ InterfaceC1809a1 f17359D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC1809a1 f17360E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f17361F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f17362G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f17363H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f17364I;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17365g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4060x f17366h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f17367i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f17368j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17369k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17370l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f17371m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f17372n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f17373o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f17374p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f17375q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f17376r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f17377s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f17378t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f17379u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f17380v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC1809a1 f17381w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC1809a1 f17382x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC1809a1 f17383y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC1809a1 f17384z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4906g8(C4060x c4060x, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117, InterfaceC1809a1 interfaceC1809a118, InterfaceC1809a1 interfaceC1809a119, InterfaceC1809a1 interfaceC1809a120, InterfaceC1809a1 interfaceC1809a121, InterfaceC1809a1 interfaceC1809a122, InterfaceC1809a1 interfaceC1809a123, InterfaceC1809a1 interfaceC1809a124, InterfaceC1809a1 interfaceC1809a125, InterfaceC1809a1 interfaceC1809a126, InterfaceC1809a1 interfaceC1809a127) {
        this.f17366h = c4060x;
        this.f17367i = interfaceC1809a1;
        this.f17368j = interfaceC1809a12;
        this.f17369k = interfaceC1809a13;
        this.f17370l = interfaceC1809a14;
        this.f17371m = interfaceC1809a15;
        this.f17372n = interfaceC1809a16;
        this.f17373o = interfaceC1809a17;
        this.f17374p = interfaceC1809a18;
        this.f17375q = interfaceC1809a19;
        this.f17376r = interfaceC1809a110;
        this.f17377s = interfaceC1809a111;
        this.f17378t = interfaceC1809a112;
        this.f17379u = interfaceC1809a113;
        this.f17380v = interfaceC1809a114;
        this.f17381w = interfaceC1809a115;
        this.f17382x = interfaceC1809a116;
        this.f17383y = interfaceC1809a117;
        this.f17384z = interfaceC1809a118;
        this.f17356A = interfaceC1809a119;
        this.f17357B = interfaceC1809a120;
        this.f17358C = interfaceC1809a121;
        this.f17359D = interfaceC1809a122;
        this.f17360E = interfaceC1809a123;
        this.f17361F = interfaceC1809a124;
        this.f17362G = interfaceC1809a125;
        this.f17363H = interfaceC1809a126;
        this.f17364I = interfaceC1809a127;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        C3272z0 c3272z0;
        C3272z0 c3272z02;
        C1836h0 c1836h0;
        switch (this.f17365g) {
            case 0:
                C3641z c3641z = (C3641z) this.f17361F;
                final SharedPreferences sharedPreferences = (SharedPreferences) this.f17362G;
                final String str = (String) this.f17363H;
                final InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f17364I;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h02.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f17366h.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4538h = c1836h02.m4538h(sharedPreferences) | c1836h02.m4534f(str) | c1836h02.m4534f(interfaceC1231l);
                    Object objM4514P = c1836h02.m4514P();
                    if (zM4538h || objM4514P == C1851l.f6155a) {
                        final InterfaceC1809a1 interfaceC1809a1 = this.f17367i;
                        final InterfaceC1809a1 interfaceC1809a12 = this.f17368j;
                        final InterfaceC1809a1 interfaceC1809a13 = this.f17369k;
                        final InterfaceC1809a1 interfaceC1809a14 = this.f17370l;
                        final InterfaceC1809a1 interfaceC1809a15 = this.f17371m;
                        final InterfaceC1809a1 interfaceC1809a16 = this.f17372n;
                        final InterfaceC1809a1 interfaceC1809a17 = this.f17373o;
                        final InterfaceC1809a1 interfaceC1809a18 = this.f17374p;
                        c3272z0 = c3272z0M6872b;
                        final InterfaceC1809a1 interfaceC1809a19 = this.f17375q;
                        final InterfaceC1809a1 interfaceC1809a110 = this.f17376r;
                        final InterfaceC1809a1 interfaceC1809a111 = this.f17377s;
                        final InterfaceC1809a1 interfaceC1809a112 = this.f17378t;
                        final InterfaceC1809a1 interfaceC1809a113 = this.f17379u;
                        final InterfaceC1809a1 interfaceC1809a114 = this.f17380v;
                        final InterfaceC1809a1 interfaceC1809a115 = this.f17381w;
                        final InterfaceC1809a1 interfaceC1809a116 = this.f17382x;
                        final InterfaceC1809a1 interfaceC1809a117 = this.f17383y;
                        final InterfaceC1809a1 interfaceC1809a118 = this.f17384z;
                        final InterfaceC1809a1 interfaceC1809a119 = this.f17356A;
                        final InterfaceC1809a1 interfaceC1809a120 = this.f17357B;
                        final InterfaceC1809a1 interfaceC1809a121 = this.f17358C;
                        final InterfaceC1809a1 interfaceC1809a122 = this.f17359D;
                        final InterfaceC1809a1 interfaceC1809a123 = this.f17360E;
                        InterfaceC1231l interfaceC1231l2 = new InterfaceC1231l() { // from class: wb.ia
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj4) {
                                C3623h c3623h = (C3623h) obj4;
                                c3623h.getClass();
                                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19593I, 3);
                                SharedPreferences sharedPreferences2 = sharedPreferences;
                                InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a1;
                                C3623h.m7604a(c3623h, null, new C3874d(-615453932, new C5332t7(sharedPreferences2, interfaceC1809a124, interfaceC1809a12, 3), true), 3);
                                if (((Boolean) interfaceC1809a124.getValue()).booleanValue()) {
                                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19600J, 3);
                                    C3623h.m7604a(c3623h, null, new C3874d(697532313, new C5206pd(sharedPreferences2, str, interfaceC1231l, interfaceC1809a13, interfaceC1809a14, 0), true), 3);
                                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19607K, 3);
                                    C3623h.m7604a(c3623h, null, new C3874d(-1401211689, new C5268r9(sharedPreferences2, interfaceC1809a15, interfaceC1809a16, interfaceC1809a17, interfaceC1809a18, interfaceC1809a19, interfaceC1809a110, interfaceC1809a111, interfaceC1809a112, 1), true), 3);
                                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19614L, 3);
                                    C3623h.m7604a(c3623h, null, new C3874d(795011605, new C5301s9(sharedPreferences2, interfaceC1809a113, interfaceC1809a114, interfaceC1809a115, interfaceC1809a116, interfaceC1809a117, interfaceC1809a118, interfaceC1809a119, interfaceC1809a120, interfaceC1809a121, 1), true), 3);
                                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19621M, 3);
                                    C3623h.m7604a(c3623h, null, new C3874d(-1303732397, new C5332t7(sharedPreferences2, interfaceC1809a122, interfaceC1809a123, 4), true), 3);
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h02.m4545k0(interfaceC1231l2);
                        objM4514P = interfaceC1231l2;
                    } else {
                        c3272z0 = c3272z0M6872b;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h02, 0, 504);
                } else {
                    c1836h02.m4519V();
                }
                break;
            default:
                final InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f17361F;
                final InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f17362G;
                final InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f17363H;
                final InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) this.f17364I;
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h03.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h03.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f17366h.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    Object objM4514P2 = c1836h03.m4514P();
                    if (objM4514P2 == C1851l.f6155a) {
                        final InterfaceC1809a1 interfaceC1809a128 = this.f17367i;
                        final InterfaceC1809a1 interfaceC1809a129 = this.f17368j;
                        final InterfaceC1809a1 interfaceC1809a130 = this.f17369k;
                        final InterfaceC1809a1 interfaceC1809a131 = this.f17370l;
                        final InterfaceC1809a1 interfaceC1809a132 = this.f17371m;
                        final InterfaceC1809a1 interfaceC1809a133 = this.f17372n;
                        final InterfaceC1809a1 interfaceC1809a134 = this.f17373o;
                        final InterfaceC1809a1 interfaceC1809a135 = this.f17374p;
                        final InterfaceC1809a1 interfaceC1809a136 = this.f17375q;
                        final InterfaceC1809a1 interfaceC1809a137 = this.f17376r;
                        final InterfaceC1809a1 interfaceC1809a138 = this.f17377s;
                        final InterfaceC1809a1 interfaceC1809a139 = this.f17378t;
                        final InterfaceC1809a1 interfaceC1809a140 = this.f17379u;
                        c3272z02 = c3272z0M6872b2;
                        final InterfaceC1809a1 interfaceC1809a141 = this.f17380v;
                        final InterfaceC1809a1 interfaceC1809a142 = this.f17381w;
                        final InterfaceC1809a1 interfaceC1809a143 = this.f17382x;
                        final InterfaceC1809a1 interfaceC1809a144 = this.f17383y;
                        final InterfaceC1809a1 interfaceC1809a145 = this.f17384z;
                        final InterfaceC1809a1 interfaceC1809a146 = this.f17356A;
                        final InterfaceC1809a1 interfaceC1809a147 = this.f17357B;
                        final InterfaceC1809a1 interfaceC1809a148 = this.f17358C;
                        final InterfaceC1809a1 interfaceC1809a149 = this.f17359D;
                        final InterfaceC1809a1 interfaceC1809a150 = this.f17360E;
                        c1836h0 = c1836h03;
                        InterfaceC1231l interfaceC1231l3 = new InterfaceC1231l() { // from class: wb.x9
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj4) {
                                C3623h c3623h = (C3623h) obj4;
                                c3623h.getClass();
                                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19539A1, 3);
                                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19553C1, 3);
                                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19560D1, 3);
                                C3623h.m7604a(c3623h, null, new C3874d(-1026823331, new C5007jc(interfaceC1809a128, interfaceC1809a129, interfaceC1809a130, interfaceC1809a131, interfaceC1809a132, interfaceC1809a133, 0), true), 3);
                                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19567E1, 3);
                                C3623h.m7604a(c3623h, null, new C3874d(-46072549, new C4840e8(interfaceC1809a134, interfaceC1809a135, interfaceC1809a136, interfaceC1809a137, interfaceC1809a138, interfaceC1809a139, interfaceC1809a140, interfaceC1809a141, interfaceC1809a142, interfaceC1809a143, interfaceC1809a144, interfaceC1809a145, interfaceC1809a146, interfaceC1809a147), true), 3);
                                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19574F1, 3);
                                C3623h.m7604a(c3623h, null, new C3874d(934678233, new C5367u9(interfaceC1809a148, interfaceC1809a149, interfaceC1809a150, interfaceC1809a124, interfaceC1809a125, interfaceC1809a126, interfaceC1809a127, 3), true), 3);
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(interfaceC1231l3);
                        objM4514P2 = interfaceC1231l3;
                    } else {
                        c3272z02 = c3272z0M6872b2;
                        c1836h0 = c1836h03;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, null, c3272z02, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h0, 805306368, 506);
                } else {
                    c1836h03.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4906g8(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, String str, InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117, InterfaceC1809a1 interfaceC1809a118, InterfaceC1809a1 interfaceC1809a119, InterfaceC1809a1 interfaceC1809a120, InterfaceC1809a1 interfaceC1809a121, InterfaceC1809a1 interfaceC1809a122, InterfaceC1809a1 interfaceC1809a123) {
        this.f17366h = c4060x;
        this.f17361F = c3641z;
        this.f17362G = sharedPreferences;
        this.f17363H = str;
        this.f17364I = interfaceC1231l;
        this.f17367i = interfaceC1809a1;
        this.f17368j = interfaceC1809a12;
        this.f17369k = interfaceC1809a13;
        this.f17370l = interfaceC1809a14;
        this.f17371m = interfaceC1809a15;
        this.f17372n = interfaceC1809a16;
        this.f17373o = interfaceC1809a17;
        this.f17374p = interfaceC1809a18;
        this.f17375q = interfaceC1809a19;
        this.f17376r = interfaceC1809a110;
        this.f17377s = interfaceC1809a111;
        this.f17378t = interfaceC1809a112;
        this.f17379u = interfaceC1809a113;
        this.f17380v = interfaceC1809a114;
        this.f17381w = interfaceC1809a115;
        this.f17382x = interfaceC1809a116;
        this.f17383y = interfaceC1809a117;
        this.f17384z = interfaceC1809a118;
        this.f17356A = interfaceC1809a119;
        this.f17357B = interfaceC1809a120;
        this.f17358C = interfaceC1809a121;
        this.f17359D = interfaceC1809a122;
        this.f17360E = interfaceC1809a123;
    }
}
