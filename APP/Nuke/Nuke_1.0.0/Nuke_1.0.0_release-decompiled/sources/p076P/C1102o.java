package p076P;

import p041H0.C0551B;
import p041H0.C0589e;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.C1843e;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.InterfaceC2207p;
import p244u.AbstractC3255Y;
import p244u.AbstractC3261c;
import p244u.AbstractC3273i;
import p244u.C3251U;
import p244u.C3256Z;
import p244u.C3258a0;

/* JADX INFO: renamed from: P.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1102o implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3557d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1843e f3558e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f3559f;

    public /* synthetic */ C1102o(int i5, C1843e c1843e, Object obj) {
        this.f3557d = i5;
        this.f3559f = obj;
        this.f3558e = c1843e;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f3557d) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Number) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC2207p interfaceC2207pM5527n = AbstractC3261c.m5527n(AbstractC3261c.m5518e(AbstractC1099l.f3543b, AbstractC1099l.f3544c), (C3251U) this.f3559f);
                    C3256Z c3256zM5504a = AbstractC3255Y.m5504a(AbstractC3273i.f10113d, C2194c.f7170n, c1383r, 54);
                    int iHashCode = Long.hashCode(c1383r.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207pM5527n);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b = C0591f.f1902b;
                    c1383r.m2571Z();
                    if (c1383r.f4881S) {
                        c1383r.m2592k(c0551b);
                    } else {
                        c1383r.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r, C0591f.f1905e, c3256zM5504a);
                    AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
                    C0589e c0589e = C0591f.f1906f;
                    if (c1383r.f4881S || !AbstractC1665j.m2981a(c1383r.m2558L(), Integer.valueOf(iHashCode))) {
                        c1383r.m2585g0(Integer.valueOf(iHashCode));
                        c1383r.m2574b(c0589e, Integer.valueOf(iHashCode));
                    }
                    AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
                    this.f3558e.mo5f(C3258a0.f10078a, c1383r, 6);
                    c1383r.m2597p(true);
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC1089e0.m2145a(((C1093g0) this.f3559f).f3490j, this.f3558e, c1383r2, 0);
                } else {
                    c1383r2.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
