package p332wb;

import android.content.Context;
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
import p249qg.InterfaceC3599t;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4060x;

/* JADX INFO: renamed from: wb.ob */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5171ob implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19349g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4060x f19350h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3641z f19351i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f19352j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f19353k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f19354l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f19355m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f19356n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f19357o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f19358p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f19359q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f19360r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f19361s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f19362t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f19363u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f19364v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC1809a1 f19365w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f19366x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f19367y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5171ob(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115) {
        this.f19350h = c4060x;
        this.f19351i = c3641z;
        this.f19352j = sharedPreferences;
        this.f19353k = interfaceC1809a1;
        this.f19354l = interfaceC1809a12;
        this.f19355m = interfaceC1809a13;
        this.f19356n = interfaceC1809a14;
        this.f19357o = interfaceC1809a15;
        this.f19358p = interfaceC1809a16;
        this.f19359q = interfaceC1809a17;
        this.f19360r = interfaceC1809a18;
        this.f19361s = interfaceC1809a19;
        this.f19362t = interfaceC1809a110;
        this.f19363u = interfaceC1809a111;
        this.f19364v = interfaceC1809a112;
        this.f19365w = interfaceC1809a113;
        this.f19366x = interfaceC1809a114;
        this.f19367y = interfaceC1809a115;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        C1836h0 c1836h0;
        C3272z0 c3272z0;
        C1836h0 c1836h02;
        C3272z0 c3272z02;
        C1836h0 c1836h03;
        switch (this.f19349g) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f19352j;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f19366x;
                Context context = (Context) this.f19367y;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h04.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h04.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f19350h.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    InterfaceC1809a1 interfaceC1809a1 = this.f19353k;
                    boolean zM4534f = c1836h04.m4534f(interfaceC1809a1);
                    InterfaceC1809a1 interfaceC1809a12 = this.f19354l;
                    boolean zM4534f2 = zM4534f | c1836h04.m4534f(interfaceC1809a12);
                    InterfaceC1809a1 interfaceC1809a13 = this.f19355m;
                    boolean zM4534f3 = zM4534f2 | c1836h04.m4534f(interfaceC1809a13);
                    InterfaceC1809a1 interfaceC1809a14 = this.f19356n;
                    boolean zM4534f4 = zM4534f3 | c1836h04.m4534f(interfaceC1809a14);
                    InterfaceC1809a1 interfaceC1809a15 = this.f19357o;
                    boolean zM4534f5 = zM4534f4 | c1836h04.m4534f(interfaceC1809a15);
                    InterfaceC1809a1 interfaceC1809a16 = this.f19358p;
                    boolean zM4534f6 = zM4534f5 | c1836h04.m4534f(interfaceC1809a16);
                    InterfaceC1809a1 interfaceC1809a17 = this.f19359q;
                    boolean zM4534f7 = zM4534f6 | c1836h04.m4534f(interfaceC1809a17) | c1836h04.m4538h(sharedPreferences) | c1836h04.m4538h(interfaceC3599t) | c1836h04.m4538h(context);
                    Object objM4514P = c1836h04.m4514P();
                    if (zM4534f7 || objM4514P == C1851l.f6155a) {
                        c1836h0 = c1836h04;
                        C5404vd c5404vd = new C5404vd(interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, interfaceC1809a17, sharedPreferences, this.f19360r, this.f19361s, this.f19362t, this.f19363u, interfaceC3599t, context, this.f19364v, this.f19365w);
                        c1836h0.m4545k0(c5404vd);
                        objM4514P = c5404vd;
                    } else {
                        c1836h0 = c1836h04;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, this.f19351i, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h0, 0, 504);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 1:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f19352j;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f19366x;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f19367y;
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h05.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h05.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f19350h.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    boolean zM4538h = c1836h05.m4538h(sharedPreferences2);
                    Object objM4514P2 = c1836h05.m4514P();
                    if (zM4538h || objM4514P2 == C1851l.f6155a) {
                        c3272z0 = c3272z0M6872b2;
                        c1836h02 = c1836h05;
                        C5404vd c5404vd2 = new C5404vd(sharedPreferences2, this.f19353k, this.f19354l, this.f19355m, this.f19356n, this.f19357o, this.f19358p, this.f19359q, this.f19360r, this.f19361s, this.f19362t, this.f19363u, this.f19364v, this.f19365w, interfaceC1809a18, interfaceC1809a19);
                        c1836h02.m4545k0(c5404vd2);
                        objM4514P2 = c5404vd2;
                    } else {
                        c3272z0 = c3272z0M6872b2;
                        c1836h02 = c1836h05;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, this.f19351i, c3272z0, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h02, 0, 504);
                } else {
                    c1836h05.m4519V();
                }
                break;
            default:
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f19352j;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f19366x;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f19367y;
                InterfaceC3268x0 interfaceC3268x03 = (InterfaceC3268x0) obj;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                interfaceC3268x03.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c1836h06.m4534f(interfaceC3268x03) ? 4 : 2;
                }
                if (c1836h06.m4516S(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a3 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f19350h.f13440e, null);
                    C3272z0 c3272z0M6872b3 = AbstractC3208d.m6872b(interfaceC3268x03.mo6924c() + 8, interfaceC3268x03.mo6922a() + 84, 5);
                    Object objM4514P3 = c1836h06.m4514P();
                    if (objM4514P3 == C1851l.f6155a) {
                        c3272z02 = c3272z0M6872b3;
                        c1836h03 = c1836h06;
                        C5404vd c5404vd3 = new C5404vd(this.f19353k, this.f19354l, this.f19355m, this.f19356n, this.f19357o, this.f19358p, this.f19359q, this.f19360r, this.f19361s, this.f19362t, this.f19363u, this.f19364v, this.f19365w, interfaceC1809a110, interfaceC1809a111, interfaceC1809a112);
                        c1836h03.m4545k0(c5404vd3);
                        objM4514P3 = c5404vd3;
                    } else {
                        c3272z02 = c3272z0M6872b3;
                        c1836h03 = c1836h06;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a3, this.f19351i, c3272z02, null, null, null, false, null, (InterfaceC1231l) objM4514P3, c1836h03, 805306368, 504);
                } else {
                    c1836h06.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5171ob(C4060x c4060x, C3641z c3641z, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, SharedPreferences sharedPreferences, InterfaceC3599t interfaceC3599t, Context context, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113) {
        this.f19350h = c4060x;
        this.f19351i = c3641z;
        this.f19353k = interfaceC1809a1;
        this.f19354l = interfaceC1809a12;
        this.f19355m = interfaceC1809a13;
        this.f19356n = interfaceC1809a14;
        this.f19357o = interfaceC1809a15;
        this.f19358p = interfaceC1809a16;
        this.f19359q = interfaceC1809a17;
        this.f19352j = sharedPreferences;
        this.f19366x = interfaceC3599t;
        this.f19367y = context;
        this.f19360r = interfaceC1809a18;
        this.f19361s = interfaceC1809a19;
        this.f19362t = interfaceC1809a110;
        this.f19363u = interfaceC1809a111;
        this.f19364v = interfaceC1809a112;
        this.f19365w = interfaceC1809a113;
    }

    public /* synthetic */ C5171ob(C4060x c4060x, C3641z c3641z, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116) {
        this.f19350h = c4060x;
        this.f19351i = c3641z;
        this.f19353k = interfaceC1809a1;
        this.f19354l = interfaceC1809a12;
        this.f19355m = interfaceC1809a13;
        this.f19356n = interfaceC1809a14;
        this.f19357o = interfaceC1809a15;
        this.f19358p = interfaceC1809a16;
        this.f19359q = interfaceC1809a17;
        this.f19360r = interfaceC1809a18;
        this.f19361s = interfaceC1809a19;
        this.f19362t = interfaceC1809a110;
        this.f19363u = interfaceC1809a111;
        this.f19364v = interfaceC1809a112;
        this.f19365w = interfaceC1809a113;
        this.f19352j = interfaceC1809a114;
        this.f19366x = interfaceC1809a115;
        this.f19367y = interfaceC1809a116;
    }
}
