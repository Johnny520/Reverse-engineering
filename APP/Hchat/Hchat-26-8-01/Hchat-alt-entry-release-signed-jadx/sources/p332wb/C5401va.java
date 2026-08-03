package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p211o9.C3104q;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.va */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5401va implements InterfaceC1236q {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ InterfaceC1809a1 f21316A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ InterfaceC1809a1 f21317B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ InterfaceC1809a1 f21318C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ InterfaceC1809a1 f21319D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC1809a1 f21320E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC1809a1 f21321F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC1809a1 f21322G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC1809a1 f21323H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC1809a1 f21324I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC1809a1 f21325J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC1809a1 f21326K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC1809a1 f21327L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC1809a1 f21328M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC1809a1 f21329N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ InterfaceC1809a1 f21330O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Object f21331P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ Object f21332Q;

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ Object f21333R;

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ Object f21334S;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21335g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1220a f21336h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21337i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21338j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21339k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21340l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21341m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f21342n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f21343o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f21344p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f21345q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f21346r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f21347s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f21348t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f21349u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f21350v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC1809a1 f21351w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC1809a1 f21352x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC1809a1 f21353y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC1809a1 f21354z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5401va(InterfaceC1231l interfaceC1231l, C4771c4 c4771c4, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117, InterfaceC1809a1 interfaceC1809a118, InterfaceC1809a1 interfaceC1809a119, InterfaceC1809a1 interfaceC1809a120, InterfaceC1809a1 interfaceC1809a121, InterfaceC1809a1 interfaceC1809a122, InterfaceC1809a1 interfaceC1809a123, InterfaceC1809a1 interfaceC1809a124, InterfaceC1809a1 interfaceC1809a125, InterfaceC1809a1 interfaceC1809a126, InterfaceC1809a1 interfaceC1809a127, InterfaceC1809a1 interfaceC1809a128, InterfaceC1809a1 interfaceC1809a129, InterfaceC1809a1 interfaceC1809a130, InterfaceC1809a1 interfaceC1809a131, InterfaceC1809a1 interfaceC1809a132, InterfaceC1809a1 interfaceC1809a133, InterfaceC1809a1 interfaceC1809a134, InterfaceC1809a1 interfaceC1809a135, InterfaceC1220a interfaceC1220a) {
        this.f21331P = interfaceC1231l;
        this.f21332Q = c4771c4;
        this.f21337i = interfaceC1809a1;
        this.f21338j = interfaceC1809a12;
        this.f21339k = interfaceC1809a13;
        this.f21340l = interfaceC1809a14;
        this.f21341m = interfaceC1809a15;
        this.f21342n = interfaceC1809a16;
        this.f21343o = interfaceC1809a17;
        this.f21344p = interfaceC1809a18;
        this.f21345q = interfaceC1809a19;
        this.f21346r = interfaceC1809a110;
        this.f21347s = interfaceC1809a111;
        this.f21348t = interfaceC1809a112;
        this.f21349u = interfaceC1809a113;
        this.f21350v = interfaceC1809a114;
        this.f21351w = interfaceC1809a115;
        this.f21352x = interfaceC1809a116;
        this.f21353y = interfaceC1809a117;
        this.f21354z = interfaceC1809a118;
        this.f21316A = interfaceC1809a119;
        this.f21317B = interfaceC1809a120;
        this.f21318C = interfaceC1809a121;
        this.f21319D = interfaceC1809a122;
        this.f21320E = interfaceC1809a123;
        this.f21321F = interfaceC1809a124;
        this.f21322G = interfaceC1809a125;
        this.f21323H = interfaceC1809a126;
        this.f21324I = interfaceC1809a127;
        this.f21325J = interfaceC1809a128;
        this.f21326K = interfaceC1809a129;
        this.f21327L = interfaceC1809a130;
        this.f21328M = interfaceC1809a131;
        this.f21329N = interfaceC1809a132;
        this.f21330O = interfaceC1809a133;
        this.f21333R = interfaceC1809a134;
        this.f21334S = interfaceC1809a135;
        this.f21336h = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        InterfaceC1809a1 interfaceC1809a1;
        Object obj4;
        C1836h0 c1836h0;
        switch (this.f21335g) {
            case 0:
                final InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f21331P;
                final C4771c4 c4771c4 = (C4771c4) this.f21332Q;
                final InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f21333R;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f21334S;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zM4534f = c1836h02.m4534f(interfaceC1231l) | c1836h02.m4538h(c4771c4);
                    final InterfaceC1809a1 interfaceC1809a14 = this.f21337i;
                    boolean zM4534f2 = zM4534f | c1836h02.m4534f(interfaceC1809a14);
                    final InterfaceC1809a1 interfaceC1809a15 = this.f21338j;
                    boolean zM4534f3 = zM4534f2 | c1836h02.m4534f(interfaceC1809a15);
                    final InterfaceC1809a1 interfaceC1809a16 = this.f21339k;
                    boolean zM4534f4 = zM4534f3 | c1836h02.m4534f(interfaceC1809a16);
                    final InterfaceC1809a1 interfaceC1809a17 = this.f21340l;
                    boolean zM4534f5 = zM4534f4 | c1836h02.m4534f(interfaceC1809a17);
                    final InterfaceC1809a1 interfaceC1809a18 = this.f21341m;
                    boolean zM4534f6 = zM4534f5 | c1836h02.m4534f(interfaceC1809a18);
                    final InterfaceC1809a1 interfaceC1809a19 = this.f21342n;
                    boolean zM4534f7 = zM4534f6 | c1836h02.m4534f(interfaceC1809a19);
                    final InterfaceC1809a1 interfaceC1809a110 = this.f21343o;
                    boolean zM4534f8 = zM4534f7 | c1836h02.m4534f(interfaceC1809a110);
                    final InterfaceC1809a1 interfaceC1809a111 = this.f21344p;
                    boolean zM4534f9 = zM4534f8 | c1836h02.m4534f(interfaceC1809a111);
                    final InterfaceC1809a1 interfaceC1809a112 = this.f21345q;
                    boolean zM4534f10 = zM4534f9 | c1836h02.m4534f(interfaceC1809a112);
                    final InterfaceC1809a1 interfaceC1809a113 = this.f21346r;
                    boolean zM4534f11 = zM4534f10 | c1836h02.m4534f(interfaceC1809a113);
                    final InterfaceC1809a1 interfaceC1809a114 = this.f21347s;
                    boolean zM4534f12 = zM4534f11 | c1836h02.m4534f(interfaceC1809a114);
                    final InterfaceC1809a1 interfaceC1809a115 = this.f21348t;
                    boolean zM4534f13 = zM4534f12 | c1836h02.m4534f(interfaceC1809a115);
                    final InterfaceC1809a1 interfaceC1809a116 = this.f21349u;
                    boolean zM4534f14 = zM4534f13 | c1836h02.m4534f(interfaceC1809a116);
                    final InterfaceC1809a1 interfaceC1809a117 = this.f21350v;
                    boolean zM4534f15 = zM4534f14 | c1836h02.m4534f(interfaceC1809a117);
                    final InterfaceC1809a1 interfaceC1809a118 = this.f21351w;
                    boolean zM4534f16 = zM4534f15 | c1836h02.m4534f(interfaceC1809a118);
                    final InterfaceC1809a1 interfaceC1809a119 = this.f21352x;
                    boolean zM4534f17 = zM4534f16 | c1836h02.m4534f(interfaceC1809a119);
                    final InterfaceC1809a1 interfaceC1809a120 = this.f21353y;
                    boolean zM4534f18 = zM4534f17 | c1836h02.m4534f(interfaceC1809a120);
                    final InterfaceC1809a1 interfaceC1809a121 = this.f21354z;
                    boolean zM4534f19 = zM4534f18 | c1836h02.m4534f(interfaceC1809a121);
                    final InterfaceC1809a1 interfaceC1809a122 = this.f21316A;
                    boolean zM4534f20 = zM4534f19 | c1836h02.m4534f(interfaceC1809a122);
                    final InterfaceC1809a1 interfaceC1809a123 = this.f21317B;
                    boolean zM4534f21 = zM4534f20 | c1836h02.m4534f(interfaceC1809a123);
                    final InterfaceC1809a1 interfaceC1809a124 = this.f21318C;
                    boolean zM4534f22 = zM4534f21 | c1836h02.m4534f(interfaceC1809a124);
                    final InterfaceC1809a1 interfaceC1809a125 = this.f21319D;
                    boolean zM4534f23 = zM4534f22 | c1836h02.m4534f(interfaceC1809a125);
                    final InterfaceC1809a1 interfaceC1809a126 = this.f21320E;
                    boolean zM4534f24 = zM4534f23 | c1836h02.m4534f(interfaceC1809a126);
                    final InterfaceC1809a1 interfaceC1809a127 = this.f21321F;
                    boolean zM4534f25 = zM4534f24 | c1836h02.m4534f(interfaceC1809a127);
                    final InterfaceC1809a1 interfaceC1809a128 = this.f21322G;
                    boolean zM4534f26 = zM4534f25 | c1836h02.m4534f(interfaceC1809a128);
                    final InterfaceC1809a1 interfaceC1809a129 = this.f21323H;
                    boolean zM4534f27 = zM4534f26 | c1836h02.m4534f(interfaceC1809a129);
                    final InterfaceC1809a1 interfaceC1809a130 = this.f21324I;
                    boolean zM4534f28 = zM4534f27 | c1836h02.m4534f(interfaceC1809a130);
                    final InterfaceC1809a1 interfaceC1809a131 = this.f21325J;
                    boolean zM4534f29 = zM4534f28 | c1836h02.m4534f(interfaceC1809a131);
                    final InterfaceC1809a1 interfaceC1809a132 = this.f21326K;
                    boolean zM4534f30 = zM4534f29 | c1836h02.m4534f(interfaceC1809a132);
                    final InterfaceC1809a1 interfaceC1809a133 = this.f21327L;
                    boolean zM4534f31 = zM4534f30 | c1836h02.m4534f(interfaceC1809a133);
                    final InterfaceC1809a1 interfaceC1809a134 = this.f21328M;
                    boolean zM4534f32 = zM4534f31 | c1836h02.m4534f(interfaceC1809a134);
                    final InterfaceC1809a1 interfaceC1809a135 = this.f21329N;
                    boolean zM4534f33 = zM4534f32 | c1836h02.m4534f(interfaceC1809a135);
                    final InterfaceC1809a1 interfaceC1809a136 = this.f21330O;
                    boolean zM4534f34 = zM4534f33 | c1836h02.m4534f(interfaceC1809a136) | c1836h02.m4534f(interfaceC1809a12) | c1836h02.m4534f(interfaceC1809a13);
                    Object objM4514P = c1836h02.m4514P();
                    if (zM4534f34) {
                        interfaceC1809a1 = interfaceC1809a13;
                    } else {
                        interfaceC1809a1 = interfaceC1809a13;
                        if (objM4514P != C1851l.f6155a) {
                            obj4 = objM4514P;
                            c1836h0 = c1836h02;
                        }
                        AbstractC4955ho.m9382M("保存模板", (InterfaceC1220a) obj4, "返回", this.f21336h, null, null, c1836h0, 390, 48);
                    }
                    c1836h0 = c1836h02;
                    final InterfaceC1809a1 interfaceC1809a137 = interfaceC1809a1;
                    obj4 = new InterfaceC1220a() { // from class: wb.qd
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1220a
                        public final Object invoke() {
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            C4771c4 c4771c42 = c4771c4;
                            String str = c4771c42.f16188b.f10045a;
                            String string = AbstractC3149m.m6703R0((String) interfaceC1809a14.getValue()).toString();
                            if (AbstractC3149m.m6721t0(string)) {
                                string = AbstractC0921a.m2249l(c4771c42.f16187a + 1, "模板 ");
                            }
                            String str2 = string;
                            boolean zBooleanValue = ((Boolean) interfaceC1809a15.getValue()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                            boolean zBooleanValue3 = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                            String strM7873P = AbstractC3754e0.m7873P((String) interfaceC1809a18.getValue());
                            String str3 = (String) interfaceC1809a19.getValue();
                            str3.getClass();
                            String str4 = str3.equals("card_first") ? "card_first" : "text_first";
                            String str5 = (String) interfaceC1809a110.getValue();
                            String str6 = (String) interfaceC1809a111.getValue();
                            String str7 = (String) interfaceC1809a112.getValue();
                            String str8 = (String) interfaceC1809a113.getValue();
                            String str9 = (String) interfaceC1809a114.getValue();
                            String str10 = (String) interfaceC1809a115.getValue();
                            String strM7871N = AbstractC3754e0.m7871N((String) interfaceC1809a116.getValue());
                            String strM7872O = AbstractC3754e0.m7872O((String) interfaceC1809a117.getValue());
                            String str11 = (String) interfaceC1809a118.getValue();
                            String str12 = (String) interfaceC1809a119.getValue();
                            String str13 = (String) interfaceC1809a120.getValue();
                            String str14 = (String) interfaceC1809a121.getValue();
                            String str15 = (String) interfaceC1809a122.getValue();
                            String str16 = (String) interfaceC1809a123.getValue();
                            String str17 = (String) interfaceC1809a124.getValue();
                            String str18 = (String) interfaceC1809a125.getValue();
                            String str19 = (String) interfaceC1809a126.getValue();
                            String str20 = (String) interfaceC1809a127.getValue();
                            String str21 = (String) interfaceC1809a128.getValue();
                            String str22 = (String) interfaceC1809a129.getValue();
                            String str23 = (String) interfaceC1809a130.getValue();
                            String str24 = (String) interfaceC1809a131.getValue();
                            str24.getClass();
                            String str25 = str24.equals("custom") ? "custom" : "global";
                            Integer numM6742f0 = AbstractC3156t.m6742f0((String) interfaceC1809a132.getValue());
                            if (numM6742f0 != null) {
                                int iIntValue2 = numM6742f0.intValue();
                                if (iIntValue2 < 0) {
                                    iIntValue2 = 0;
                                }
                                i9 = iIntValue2;
                            } else {
                                i9 = 0;
                            }
                            Integer numM6742f02 = AbstractC3156t.m6742f0((String) interfaceC1809a133.getValue());
                            if (numM6742f02 != null) {
                                int iIntValue3 = numM6742f02.intValue();
                                if (iIntValue3 < 0) {
                                    iIntValue3 = 0;
                                }
                                i10 = iIntValue3;
                            } else {
                                i10 = 100;
                            }
                            Integer numM6742f03 = AbstractC3156t.m6742f0((String) interfaceC1809a134.getValue());
                            if (numM6742f03 != null) {
                                int iIntValue4 = numM6742f03.intValue();
                                if (iIntValue4 < 0) {
                                    iIntValue4 = 0;
                                }
                                i11 = iIntValue4;
                            } else {
                                i11 = 100;
                            }
                            Integer numM6742f04 = AbstractC3156t.m6742f0((String) interfaceC1809a135.getValue());
                            if (numM6742f04 != null) {
                                int iIntValue5 = numM6742f04.intValue();
                                if (iIntValue5 < 0) {
                                    iIntValue5 = 0;
                                }
                                i12 = iIntValue5;
                            } else {
                                i12 = 100;
                            }
                            Integer numM6742f05 = AbstractC3156t.m6742f0((String) interfaceC1809a136.getValue());
                            if (numM6742f05 != null) {
                                int iIntValue6 = numM6742f05.intValue();
                                if (iIntValue6 < 0) {
                                    iIntValue6 = 0;
                                }
                                i13 = iIntValue6;
                            } else {
                                i13 = 100;
                            }
                            Integer numM6742f06 = AbstractC3156t.m6742f0((String) interfaceC1809a12.getValue());
                            if (numM6742f06 != null) {
                                int iIntValue7 = numM6742f06.intValue();
                                if (iIntValue7 < 0) {
                                    iIntValue7 = 0;
                                }
                                i14 = iIntValue7;
                            } else {
                                i14 = 100;
                            }
                            Integer numM6742f07 = AbstractC3156t.m6742f0((String) interfaceC1809a137.getValue());
                            if (numM6742f07 != null) {
                                int iIntValue8 = numM6742f07.intValue();
                                i15 = iIntValue8 >= 0 ? iIntValue8 : 0;
                            } else {
                                i15 = 100;
                            }
                            interfaceC1231l.invoke(new C3104q(str, str2, zBooleanValue, zBooleanValue2, zBooleanValue3, strM7873P, str4, str5, str6, str7, str8, str9, str10, strM7871N, strM7872O, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str25, i9, i10, i11, i12, i13, i14, i15));
                            return C3967n.f12976a;
                        }
                    };
                    c1836h0.m4545k0(obj4);
                    AbstractC4955ho.m9382M("保存模板", (InterfaceC1220a) obj4, "返回", this.f21336h, null, null, c1836h0, 390, 48);
                } else {
                    c1836h02.m4519V();
                }
                break;
            default:
                C3104q c3104q = (C3104q) this.f21331P;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f21332Q;
                String str = (String) this.f21333R;
                Context context = (Context) this.f21334S;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h03.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    InterfaceC1220a interfaceC1220a = this.f21336h;
                    if (c3104q != null) {
                        c1836h03.m4525a0(1140930434);
                        AbstractC4955ho.m9382M("返回", interfaceC1220a, null, null, null, null, c1836h03, 6, 60);
                        c1836h03.m4553p(false);
                    } else {
                        c1836h03.m4525a0(1141171242);
                        boolean zM4538h = c1836h03.m4538h(sharedPreferences) | c1836h03.m4534f(str);
                        InterfaceC1809a1 interfaceC1809a138 = this.f21337i;
                        boolean zM4534f35 = zM4538h | c1836h03.m4534f(interfaceC1809a138);
                        InterfaceC1809a1 interfaceC1809a139 = this.f21338j;
                        boolean zM4534f36 = zM4534f35 | c1836h03.m4534f(interfaceC1809a139);
                        InterfaceC1809a1 interfaceC1809a140 = this.f21339k;
                        boolean zM4534f37 = zM4534f36 | c1836h03.m4534f(interfaceC1809a140);
                        InterfaceC1809a1 interfaceC1809a141 = this.f21340l;
                        boolean zM4534f38 = zM4534f37 | c1836h03.m4534f(interfaceC1809a141);
                        InterfaceC1809a1 interfaceC1809a142 = this.f21341m;
                        boolean zM4534f39 = zM4534f38 | c1836h03.m4534f(interfaceC1809a142);
                        InterfaceC1809a1 interfaceC1809a143 = this.f21342n;
                        boolean zM4534f40 = zM4534f39 | c1836h03.m4534f(interfaceC1809a143);
                        InterfaceC1809a1 interfaceC1809a144 = this.f21343o;
                        boolean zM4534f41 = zM4534f40 | c1836h03.m4534f(interfaceC1809a144);
                        InterfaceC1809a1 interfaceC1809a145 = this.f21344p;
                        boolean zM4534f42 = zM4534f41 | c1836h03.m4534f(interfaceC1809a145);
                        InterfaceC1809a1 interfaceC1809a146 = this.f21345q;
                        boolean zM4534f43 = zM4534f42 | c1836h03.m4534f(interfaceC1809a146);
                        InterfaceC1809a1 interfaceC1809a147 = this.f21346r;
                        boolean zM4534f44 = zM4534f43 | c1836h03.m4534f(interfaceC1809a147);
                        InterfaceC1809a1 interfaceC1809a148 = this.f21347s;
                        boolean zM4534f45 = zM4534f44 | c1836h03.m4534f(interfaceC1809a148);
                        InterfaceC1809a1 interfaceC1809a149 = this.f21348t;
                        boolean zM4534f46 = zM4534f45 | c1836h03.m4534f(interfaceC1809a149);
                        InterfaceC1809a1 interfaceC1809a150 = this.f21349u;
                        boolean zM4534f47 = zM4534f46 | c1836h03.m4534f(interfaceC1809a150);
                        InterfaceC1809a1 interfaceC1809a151 = this.f21350v;
                        boolean zM4534f48 = zM4534f47 | c1836h03.m4534f(interfaceC1809a151);
                        InterfaceC1809a1 interfaceC1809a152 = this.f21351w;
                        boolean zM4534f49 = zM4534f48 | c1836h03.m4534f(interfaceC1809a152);
                        InterfaceC1809a1 interfaceC1809a153 = this.f21352x;
                        boolean zM4534f50 = zM4534f49 | c1836h03.m4534f(interfaceC1809a153);
                        InterfaceC1809a1 interfaceC1809a154 = this.f21353y;
                        boolean zM4534f51 = zM4534f50 | c1836h03.m4534f(interfaceC1809a154);
                        InterfaceC1809a1 interfaceC1809a155 = this.f21354z;
                        boolean zM4534f52 = zM4534f51 | c1836h03.m4534f(interfaceC1809a155);
                        InterfaceC1809a1 interfaceC1809a156 = this.f21316A;
                        boolean zM4534f53 = zM4534f52 | c1836h03.m4534f(interfaceC1809a156);
                        InterfaceC1809a1 interfaceC1809a157 = this.f21317B;
                        boolean zM4534f54 = zM4534f53 | c1836h03.m4534f(interfaceC1809a157);
                        InterfaceC1809a1 interfaceC1809a158 = this.f21318C;
                        boolean zM4534f55 = zM4534f54 | c1836h03.m4534f(interfaceC1809a158);
                        InterfaceC1809a1 interfaceC1809a159 = this.f21319D;
                        boolean zM4534f56 = zM4534f55 | c1836h03.m4534f(interfaceC1809a159);
                        InterfaceC1809a1 interfaceC1809a160 = this.f21320E;
                        boolean zM4534f57 = zM4534f56 | c1836h03.m4534f(interfaceC1809a160);
                        InterfaceC1809a1 interfaceC1809a161 = this.f21321F;
                        boolean zM4534f58 = zM4534f57 | c1836h03.m4534f(interfaceC1809a161);
                        InterfaceC1809a1 interfaceC1809a162 = this.f21322G;
                        boolean zM4534f59 = zM4534f58 | c1836h03.m4534f(interfaceC1809a162);
                        InterfaceC1809a1 interfaceC1809a163 = this.f21323H;
                        boolean zM4534f60 = zM4534f59 | c1836h03.m4534f(interfaceC1809a163);
                        InterfaceC1809a1 interfaceC1809a164 = this.f21324I;
                        boolean zM4534f61 = zM4534f60 | c1836h03.m4534f(interfaceC1809a164);
                        InterfaceC1809a1 interfaceC1809a165 = this.f21325J;
                        boolean zM4534f62 = zM4534f61 | c1836h03.m4534f(interfaceC1809a165);
                        InterfaceC1809a1 interfaceC1809a166 = this.f21326K;
                        boolean zM4534f63 = zM4534f62 | c1836h03.m4534f(interfaceC1809a166);
                        InterfaceC1809a1 interfaceC1809a167 = this.f21327L;
                        boolean zM4534f64 = zM4534f63 | c1836h03.m4534f(interfaceC1809a167);
                        InterfaceC1809a1 interfaceC1809a168 = this.f21328M;
                        boolean zM4534f65 = zM4534f64 | c1836h03.m4534f(interfaceC1809a168);
                        InterfaceC1809a1 interfaceC1809a169 = this.f21329N;
                        boolean zM4534f66 = zM4534f65 | c1836h03.m4534f(interfaceC1809a169);
                        InterfaceC1809a1 interfaceC1809a170 = this.f21330O;
                        boolean zM4534f67 = zM4534f66 | c1836h03.m4534f(interfaceC1809a170) | c1836h03.m4538h(context);
                        Object objM4514P2 = c1836h03.m4514P();
                        if (zM4534f67 || objM4514P2 == C1851l.f6155a) {
                            C5073lc c5073lc = new C5073lc(sharedPreferences, str, context, interfaceC1809a138, interfaceC1809a139, interfaceC1809a140, interfaceC1809a141, interfaceC1809a142, interfaceC1809a143, interfaceC1809a144, interfaceC1809a145, interfaceC1809a146, interfaceC1809a147, interfaceC1809a148, interfaceC1809a149, interfaceC1809a150, interfaceC1809a151, interfaceC1809a152, interfaceC1809a153, interfaceC1809a154, interfaceC1809a155, interfaceC1809a156, interfaceC1809a157, interfaceC1809a158, interfaceC1809a159, interfaceC1809a160, interfaceC1809a161, interfaceC1809a162, interfaceC1809a163, interfaceC1809a164, interfaceC1809a165, interfaceC1809a166, interfaceC1809a167, interfaceC1809a168, interfaceC1809a169, interfaceC1809a170);
                            c1836h03.m4545k0(c5073lc);
                            objM4514P2 = c5073lc;
                        }
                        AbstractC4955ho.m9382M("保存设置", (InterfaceC1220a) objM4514P2, "返回", interfaceC1220a, null, null, c1836h03, 390, 48);
                        c1836h03.m4553p(false);
                    }
                } else {
                    c1836h03.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5401va(C3104q c3104q, InterfaceC1220a interfaceC1220a, SharedPreferences sharedPreferences, String str, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117, InterfaceC1809a1 interfaceC1809a118, InterfaceC1809a1 interfaceC1809a119, InterfaceC1809a1 interfaceC1809a120, InterfaceC1809a1 interfaceC1809a121, InterfaceC1809a1 interfaceC1809a122, InterfaceC1809a1 interfaceC1809a123, InterfaceC1809a1 interfaceC1809a124, InterfaceC1809a1 interfaceC1809a125, InterfaceC1809a1 interfaceC1809a126, InterfaceC1809a1 interfaceC1809a127, InterfaceC1809a1 interfaceC1809a128, InterfaceC1809a1 interfaceC1809a129, InterfaceC1809a1 interfaceC1809a130, InterfaceC1809a1 interfaceC1809a131, InterfaceC1809a1 interfaceC1809a132, InterfaceC1809a1 interfaceC1809a133, Context context) {
        this.f21331P = c3104q;
        this.f21336h = interfaceC1220a;
        this.f21332Q = sharedPreferences;
        this.f21333R = str;
        this.f21337i = interfaceC1809a1;
        this.f21338j = interfaceC1809a12;
        this.f21339k = interfaceC1809a13;
        this.f21340l = interfaceC1809a14;
        this.f21341m = interfaceC1809a15;
        this.f21342n = interfaceC1809a16;
        this.f21343o = interfaceC1809a17;
        this.f21344p = interfaceC1809a18;
        this.f21345q = interfaceC1809a19;
        this.f21346r = interfaceC1809a110;
        this.f21347s = interfaceC1809a111;
        this.f21348t = interfaceC1809a112;
        this.f21349u = interfaceC1809a113;
        this.f21350v = interfaceC1809a114;
        this.f21351w = interfaceC1809a115;
        this.f21352x = interfaceC1809a116;
        this.f21353y = interfaceC1809a117;
        this.f21354z = interfaceC1809a118;
        this.f21316A = interfaceC1809a119;
        this.f21317B = interfaceC1809a120;
        this.f21318C = interfaceC1809a121;
        this.f21319D = interfaceC1809a122;
        this.f21320E = interfaceC1809a123;
        this.f21321F = interfaceC1809a124;
        this.f21322G = interfaceC1809a125;
        this.f21323H = interfaceC1809a126;
        this.f21324I = interfaceC1809a127;
        this.f21325J = interfaceC1809a128;
        this.f21326K = interfaceC1809a129;
        this.f21327L = interfaceC1809a130;
        this.f21328M = interfaceC1809a131;
        this.f21329N = interfaceC1809a132;
        this.f21330O = interfaceC1809a133;
        this.f21334S = context;
    }
}
