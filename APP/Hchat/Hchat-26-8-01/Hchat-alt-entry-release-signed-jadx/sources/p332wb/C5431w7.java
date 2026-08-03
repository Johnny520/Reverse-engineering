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
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4060x;

/* JADX INFO: renamed from: wb.w7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5431w7 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21590g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4060x f21591h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3641z f21592i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ SharedPreferences f21593j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21594k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21595l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21596m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f21597n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5431w7(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, int i9) {
        this.f21590g = i9;
        this.f21591h = c4060x;
        this.f21592i = c3641z;
        this.f21593j = sharedPreferences;
        this.f21594k = interfaceC1809a1;
        this.f21595l = interfaceC1809a12;
        this.f21596m = interfaceC1809a13;
        this.f21597n = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f21590g) {
            case 0:
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f21591h.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    SharedPreferences sharedPreferences = this.f21593j;
                    boolean zM4538h = c1836h0.m4538h(sharedPreferences);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4538h || objM4514P == C1851l.f6155a) {
                        C4849eh c4849eh = new C4849eh(sharedPreferences, this.f21594k, this.f21595l, this.f21596m, this.f21597n, 1);
                        c1836h0.m4545k0(c4849eh);
                        objM4514P = c4849eh;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, this.f21592i, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h0, 0, 504);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h02.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f21591h.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    SharedPreferences sharedPreferences2 = this.f21593j;
                    boolean zM4538h2 = c1836h02.m4538h(sharedPreferences2);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4538h2 || objM4514P2 == C1851l.f6155a) {
                        C4849eh c4849eh2 = new C4849eh(sharedPreferences2, this.f21594k, this.f21595l, this.f21596m, this.f21597n, 3);
                        c1836h02.m4545k0(c4849eh2);
                        objM4514P2 = c4849eh2;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, this.f21592i, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h02, 0, 504);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                InterfaceC3268x0 interfaceC3268x03 = (InterfaceC3268x0) obj;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                interfaceC3268x03.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c1836h03.m4534f(interfaceC3268x03) ? 4 : 2;
                }
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a3 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f21591h.f13440e, null);
                    C3272z0 c3272z0M6872b3 = AbstractC3208d.m6872b(interfaceC3268x03.mo6924c() + 8, interfaceC3268x03.mo6922a() + 84, 5);
                    SharedPreferences sharedPreferences3 = this.f21593j;
                    boolean zM4538h3 = c1836h03.m4538h(sharedPreferences3);
                    Object objM4514P3 = c1836h03.m4514P();
                    if (zM4538h3 || objM4514P3 == C1851l.f6155a) {
                        C4849eh c4849eh3 = new C4849eh(sharedPreferences3, this.f21594k, this.f21595l, this.f21596m, this.f21597n, 2);
                        c1836h03.m4545k0(c4849eh3);
                        objM4514P3 = c4849eh3;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a3, this.f21592i, c3272z0M6872b3, null, null, null, false, null, (InterfaceC1231l) objM4514P3, c1836h03, 0, 504);
                } else {
                    c1836h03.m4519V();
                }
                break;
            default:
                InterfaceC3268x0 interfaceC3268x04 = (InterfaceC3268x0) obj;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                interfaceC3268x04.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c1836h04.m4534f(interfaceC3268x04) ? 4 : 2;
                }
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a4 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f21591h.f13440e, null);
                    C3272z0 c3272z0M6872b4 = AbstractC3208d.m6872b(interfaceC3268x04.mo6924c() + 8, interfaceC3268x04.mo6922a() + 84, 5);
                    SharedPreferences sharedPreferences4 = this.f21593j;
                    boolean zM4538h4 = c1836h04.m4538h(sharedPreferences4);
                    Object objM4514P4 = c1836h04.m4514P();
                    if (zM4538h4 || objM4514P4 == C1851l.f6155a) {
                        C4849eh c4849eh4 = new C4849eh(sharedPreferences4, this.f21594k, this.f21595l, this.f21596m, this.f21597n, 4);
                        c1836h04.m4545k0(c4849eh4);
                        objM4514P4 = c4849eh4;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a4, this.f21592i, c3272z0M6872b4, null, null, null, false, null, (InterfaceC1231l) objM4514P4, c1836h04, 0, 504);
                } else {
                    c1836h04.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
