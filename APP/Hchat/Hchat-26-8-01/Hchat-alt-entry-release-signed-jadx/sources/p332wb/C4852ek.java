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
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4060x;

/* JADX INFO: renamed from: wb.ek */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4852ek implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16921g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4060x f16922h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3641z f16923i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Context f16924j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ SharedPreferences f16925k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f16926l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f16927m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f16928n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f16929o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f16930p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f16931q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f16932r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f16933s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4852ek(C4060x c4060x, C3641z c3641z, Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f16922h = c4060x;
        this.f16923i = c3641z;
        this.f16924j = context;
        this.f16925k = sharedPreferences;
        this.f16926l = interfaceC1809a1;
        this.f16927m = interfaceC1809a12;
        this.f16928n = interfaceC1809a13;
        this.f16929o = interfaceC1809a14;
        this.f16930p = interfaceC1809a15;
        this.f16931q = interfaceC1809a16;
        this.f16932r = interfaceC1809a17;
        this.f16933s = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f16921g) {
            case 0:
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f16922h.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    SharedPreferences sharedPreferences = this.f16925k;
                    boolean zM4538h = c1836h0.m4538h(sharedPreferences);
                    Context context = this.f16924j;
                    boolean zM4538h2 = zM4538h | c1836h0.m4538h(context);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4538h2 || objM4514P == C1851l.f6155a) {
                        C4755bl c4755bl = new C4755bl(sharedPreferences, context, this.f16926l, this.f16927m, this.f16928n, this.f16929o, this.f16930p, this.f16931q, this.f16932r, this.f16933s);
                        c1836h0.m4545k0(c4755bl);
                        objM4514P = c4755bl;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, this.f16923i, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h0, 0, 504);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h02.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f16922h.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    Context context2 = this.f16924j;
                    boolean zM4538h3 = c1836h02.m4538h(context2);
                    SharedPreferences sharedPreferences2 = this.f16925k;
                    boolean zM4538h4 = zM4538h3 | c1836h02.m4538h(sharedPreferences2);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4538h4 || objM4514P2 == C1851l.f6155a) {
                        C4755bl c4755bl2 = new C4755bl(context2, this.f16926l, sharedPreferences2, this.f16927m, this.f16928n, this.f16929o, this.f16930p, this.f16931q, this.f16932r, this.f16933s);
                        c1836h02.m4545k0(c4755bl2);
                        objM4514P2 = c4755bl2;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, this.f16923i, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h02, 0, 504);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4852ek(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f16922h = c4060x;
        this.f16923i = c3641z;
        this.f16925k = sharedPreferences;
        this.f16924j = context;
        this.f16926l = interfaceC1809a1;
        this.f16927m = interfaceC1809a12;
        this.f16928n = interfaceC1809a13;
        this.f16929o = interfaceC1809a14;
        this.f16930p = interfaceC1809a15;
        this.f16931q = interfaceC1809a16;
        this.f16932r = interfaceC1809a17;
        this.f16933s = interfaceC1809a18;
    }
}
