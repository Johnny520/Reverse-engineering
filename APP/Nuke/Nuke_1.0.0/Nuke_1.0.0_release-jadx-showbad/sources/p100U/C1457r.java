package p100U;

import me.dartcv.nuke.BuildConfig;
import p058L.C0946r;
import p095T.C1308D0;
import p095T.C1324L0;
import p095T.C1349a;
import p095T.C1388t0;
import p095T.InterfaceC1353c;
import p112W2.InterfaceC1599a;
import p136b0.C1849k;

/* JADX INFO: renamed from: U.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1457r extends AbstractC1437J {

    /* JADX INFO: renamed from: d */
    public static final C1457r f5131d;

    /* JADX INFO: renamed from: e */
    public static final C1457r f5132e;

    /* JADX INFO: renamed from: f */
    public static final C1457r f5133f;

    /* JADX INFO: renamed from: g */
    public static final C1457r f5134g;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f5135c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 1;
        f5131d = new C1457r(i5, 2, 0);
        int i6 = 1;
        f5132e = new C1457r(i6, i6, 1);
        f5133f = new C1457r(i5, 2, 2);
        int i7 = 1;
        f5134g = new C1457r(i7, i7, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1457r(int i5, int i6, int i7) {
        super(i5, i6);
        this.f5135c = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p100U.AbstractC1437J
    /* JADX INFO: renamed from: a */
    public final void mo2722a(C0946r c0946r, InterfaceC1353c interfaceC1353c, C1324L0 c1324l0, C1849k c1849k, InterfaceC1438K interfaceC1438K) {
        switch (this.f5135c) {
            case 0:
                Object objMo6a = ((InterfaceC1599a) c0946r.m1953d(0)).mo6a();
                C1349a c1349a = (C1349a) c0946r.m1953d(1);
                int iM1952c = c0946r.m1952c(0);
                c1349a.getClass();
                c1324l0.m2470U(c1324l0.m2473c(c1349a), objMo6a);
                interfaceC1353c.mo783f(iM1952c, objMo6a);
                interfaceC1353c.mo781d(objMo6a);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C1349a c1349a2 = (C1349a) c0946r.m1953d(0);
                int iM1952c2 = c0946r.m1952c(0);
                interfaceC1353c.mo788n();
                c1349a2.getClass();
                interfaceC1353c.mo780c(iM1952c2, c1324l0.m2453D(c1324l0.m2473c(c1349a2)));
                break;
            case 2:
                Object objM1953d = c0946r.m1953d(0);
                C1349a c1349a3 = (C1349a) c0946r.m1953d(1);
                int iM1952c3 = c0946r.m1952c(0);
                if (objM1953d instanceof C1308D0) {
                    C1308D0 c1308d0 = (C1308D0) objM1953d;
                    c1849k.f6262e.m2753b(c1308d0);
                    c1849k.f6261d.m4279a(c1308d0);
                }
                Object objM2460K = c1324l0.m2460K(c1324l0.m2473c(c1349a3), iM1952c3, objM1953d);
                if (objM2460K instanceof C1308D0) {
                    c1849k.m3321e((C1308D0) objM2460K);
                } else if (objM2460K instanceof C1388t0) {
                    ((C1388t0) objM2460K).m2643d();
                }
                break;
            default:
                Object objM1953d2 = c0946r.m1953d(0);
                int iM1952c4 = c0946r.m1952c(0);
                if (objM1953d2 instanceof C1308D0) {
                    C1308D0 c1308d02 = (C1308D0) objM1953d2;
                    c1849k.f6262e.m2753b(c1308d02);
                    c1849k.f6261d.m4279a(c1308d02);
                }
                Object objM2460K2 = c1324l0.m2460K(c1324l0.f4742t, iM1952c4, objM1953d2);
                if (objM2460K2 instanceof C1308D0) {
                    c1849k.m3321e((C1308D0) objM2460K2);
                } else if (objM2460K2 instanceof C1388t0) {
                    ((C1388t0) objM2460K2).m2643d();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p100U.AbstractC1437J
    /* JADX INFO: renamed from: b */
    public C1349a mo2723b(C0946r c0946r) {
        switch (this.f5135c) {
            case 0:
                return (C1349a) c0946r.m1953d(1);
            case BuildConfig.VERSION_CODE /* 1 */:
                return (C1349a) c0946r.m1953d(0);
            default:
                return super.mo2723b(c0946r);
        }
    }
}
