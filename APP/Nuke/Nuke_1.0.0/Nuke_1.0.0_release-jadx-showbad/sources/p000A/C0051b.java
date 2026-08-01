package p000A;

import me.dartcv.nuke.BuildConfig;
import p029F0.InterfaceC0377O;
import p037G2.AbstractC0489a;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1603e;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.InterfaceC2207p;
import p244u.AbstractC3261c;
import p244u.AbstractC3282o;

/* JADX INFO: renamed from: A.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0051b implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f208d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2207p f209e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f210f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0051b(long j5, InterfaceC2207p interfaceC2207p) {
        this.f208d = 0;
        this.f210f = j5;
        this.f209e = interfaceC2207p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        Integer num = (Integer) obj2;
        switch (this.f208d) {
            case 0:
                int iIntValue = num.intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long j5 = this.f210f;
                    InterfaceC2207p interfaceC2207p = this.f209e;
                    if (j5 != 9205357640488583168L) {
                        c1383r.m2568W(-1244013944);
                        InterfaceC2207p interfaceC2207pM5532s = AbstractC3261c.m5532s(interfaceC2207p, Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (4294967295L & j5)), 0.0f, 0.0f, 12);
                        InterfaceC0377O interfaceC0377OM5561d = AbstractC3282o.m5561d(C2194c.f7161e, false);
                        int iHashCode = Long.hashCode(c1383r.f4882T);
                        InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
                        InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207pM5532s);
                        InterfaceC0593g.f1909a.getClass();
                        C0551B c0551b = C0591f.f1902b;
                        c1383r.m2571Z();
                        if (c1383r.f4881S) {
                            c1383r.m2592k(c0551b);
                        } else {
                            c1383r.m2591j0();
                        }
                        AbstractC1385s.m2635y(c1383r, C0591f.f1905e, interfaceC0377OM5561d);
                        AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
                        AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
                        AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
                        AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
                        AbstractC0063h.m62b(null, c1383r, 0, 1);
                        c1383r.m2597p(true);
                        c1383r.m2597p(false);
                    } else {
                        c1383r.m2568W(-1243644858);
                        AbstractC0063h.m62b(interfaceC2207p, c1383r, 0, 0);
                        c1383r.m2597p(false);
                    }
                } else {
                    c1383r.m2563R();
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                num.getClass();
                AbstractC0489a.m762l(this.f209e, this.f210f, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
            case 2:
                num.getClass();
                AbstractC0489a.m763m(this.f209e, this.f210f, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
            default:
                num.getClass();
                AbstractC0489a.m771u(this.f209e, this.f210f, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0051b(InterfaceC2207p interfaceC2207p, long j5, int i5, int i6) {
        this.f208d = i6;
        this.f209e = interfaceC2207p;
        this.f210f = j5;
    }
}
