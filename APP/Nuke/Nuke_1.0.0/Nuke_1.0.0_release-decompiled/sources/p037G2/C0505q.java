package p037G2;

import com.bumptech.glide.AbstractC1926h;
import p000A.AbstractC0070k0;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p045H4.AbstractC0653e;
import p045H4.C0650b;
import p056K2.C0891q;
import p092S0.C1260M;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p108V3.AbstractC1543P;
import p110W0.C1587l;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p211o0.C2762u;
import p244u.AbstractC3255Y;
import p244u.AbstractC3261c;
import p244u.AbstractC3273i;
import p244u.C3256Z;

/* JADX INFO: renamed from: G2.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0505q implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1591d = 1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f1592e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f1593f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f1594g;

    public /* synthetic */ C0505q(String str, InterfaceC1601c interfaceC1601c, boolean z5, int i5) {
        this.f1592e = str;
        this.f1594g = interfaceC1601c;
        this.f1593f = z5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        long j5;
        switch (this.f1591d) {
            case 0:
                C2762u c2762u = (C2762u) this.f1594g;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C3256Z c3256zM5504a = AbstractC3255Y.m5504a(AbstractC3273i.f10110a, C2194c.f7170n, c1383r, 48);
                    int iHashCode = Long.hashCode(c1383r.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, C2204m.f7185a);
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
                    AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
                    String str = this.f1592e;
                    if (str != null) {
                        c1383r.m2568W(386559014);
                        if (c2762u == null) {
                            c1383r.m2568W(-1650092775);
                            j5 = ((C0650b) c1383r.m2590j(AbstractC0653e.f2072a)).f2065f;
                            c1383r.m2597p(false);
                        } else {
                            c1383r.m2568W(-1650093767);
                            c1383r.m2597p(false);
                            j5 = c2762u.f8764a;
                        }
                        AbstractC0070k0.m74a(str, null, new C1260M(j5, AbstractC1926h.m3579v(14), C1587l.f5502f, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, c1383r, 0, 1018);
                        AbstractC3261c.m5516c(c1383r, AbstractC3261c.m5539z(8));
                        c1383r.m2597p(false);
                    } else {
                        c1383r.m2568W(386974166);
                        c1383r.m2597p(false);
                    }
                    AbstractC0489a.m760j(null, C2762u.m4920b(this.f1593f ? 0.62f : 0.36f, ((C0650b) c1383r.m2590j(AbstractC0653e.f2072a)).f2065f), null, c1383r, 0);
                    c1383r.m2597p(true);
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1543P.m2835t(this.f1592e, (InterfaceC1601c) this.f1594g, this.f1593f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0505q(String str, C2762u c2762u, boolean z5) {
        this.f1592e = str;
        this.f1594g = c2762u;
        this.f1593f = z5;
    }
}
