package p037G2;

import me.dartcv.nuke.BuildConfig;
import p029F0.InterfaceC0377O;
import p041H0.C0551B;
import p041H0.C0587d;
import p041H0.C0589e;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p108V3.AbstractC1543P;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.InterfaceC2207p;
import p179i4.AbstractC2352g;
import p244u.AbstractC3261c;
import p244u.AbstractC3273i;
import p244u.AbstractC3282o;
import p244u.AbstractC3287t;
import p244u.C3289v;
import p244u.C3293z;

/* JADX INFO: renamed from: G2.P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0488P implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1509d = 2;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1510e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1599a f1511f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0488P(int i5, int i6, InterfaceC1599a interfaceC1599a) {
        this.f1510e = i5;
        this.f1511f = interfaceC1599a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f1509d) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC0489a.m770t(this.f1511f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f1510e | 1));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C3293z c3293z = AbstractC3261c.f10088d;
                    C3289v c3289vM5564a = AbstractC3287t.m5564a(AbstractC3273i.f10112c, C2194c.f7171o, c1383r, 0);
                    int iHashCode = Long.hashCode(c1383r.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, c3293z);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b = C0591f.f1902b;
                    c1383r.m2571Z();
                    if (c1383r.f4881S) {
                        c1383r.m2592k(c0551b);
                    } else {
                        c1383r.m2591j0();
                    }
                    C0589e c0589e = C0591f.f1905e;
                    AbstractC1385s.m2635y(c1383r, c0589e, c3289vM5564a);
                    C0589e c0589e2 = C0591f.f1904d;
                    AbstractC1385s.m2635y(c1383r, c0589e2, interfaceC1378o0M2593l);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    C0589e c0589e3 = C0591f.f1906f;
                    AbstractC1385s.m2627q(c1383r, numValueOf, c0589e3);
                    C0587d c0587d = C0591f.f1907g;
                    AbstractC1385s.m2631u(c1383r, c0587d);
                    C0589e c0589e4 = C0591f.f1903c;
                    AbstractC1385s.m2635y(c1383r, c0589e4, interfaceC2207pM4016c);
                    int i5 = this.f1510e;
                    AbstractC0489a.m769s(AbstractC2352g.m4185H(i5, c1383r), null, this.f1511f, null, c1383r, 0, 26);
                    InterfaceC2207p interfaceC2207pM5529p = AbstractC3261c.m5529p(c3293z, 18, 14);
                    InterfaceC0377O interfaceC0377OM5561d = AbstractC3282o.m5561d(C2194c.f7160d, false);
                    int iHashCode2 = Long.hashCode(c1383r.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l2 = c1383r.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c2 = AbstractC2192a.m4016c(c1383r, interfaceC2207pM5529p);
                    c1383r.m2571Z();
                    if (c1383r.f4881S) {
                        c1383r.m2592k(c0551b);
                    } else {
                        c1383r.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r, c0589e, interfaceC0377OM5561d);
                    AbstractC1385s.m2635y(c1383r, c0589e2, interfaceC1378o0M2593l2);
                    AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode2), c0589e3);
                    AbstractC1385s.m2631u(c1383r, c0587d);
                    AbstractC1385s.m2635y(c1383r, c0589e4, interfaceC2207pM4016c2);
                    AbstractC1543P.m2834s(null, AbstractC2352g.m4185H(i5, c1383r), "这个设置页还没有可展示的内容。", c1383r, 384, 1);
                    c1383r.m2597p(true);
                    c1383r.m2597p(true);
                } else {
                    c1383r.m2563R();
                }
                return C0891q.f2780a;
            default:
                ((Integer) obj2).getClass();
                AbstractC1543P.m2820e(this.f1510e, this.f1511f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0488P(int i5, InterfaceC1599a interfaceC1599a) {
        this.f1510e = i5;
        this.f1511f = interfaceC1599a;
    }

    public /* synthetic */ C0488P(InterfaceC1599a interfaceC1599a, int i5) {
        this.f1511f = interfaceC1599a;
        this.f1510e = i5;
    }
}
