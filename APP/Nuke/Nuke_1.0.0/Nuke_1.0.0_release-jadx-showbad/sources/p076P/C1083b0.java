package p076P;

import p029F0.C0410l;
import p029F0.InterfaceC0377O;
import p041H0.C0551B;
import p041H0.C0589e;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p047I0.AbstractC0757q0;
import p056K2.C0891q;
import p081Q.C1160c;
import p081Q.C1162e;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.C1843e;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.InterfaceC2207p;
import p211o0.InterfaceC2738M;
import p216p.AbstractC2856m;
import p232s.C3162i;
import p244u.AbstractC3282o;

/* JADX INFO: renamed from: P.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1083b0 implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC2207p f3386d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2738M f3387e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f3388f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f3389g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3162i f3390h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f3391i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1599a f3392j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ float f3393k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1843e f3394l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1083b0(InterfaceC2207p interfaceC2207p, InterfaceC2738M interfaceC2738M, long j5, float f2, C3162i c3162i, boolean z5, InterfaceC1599a interfaceC1599a, float f5, C1843e c1843e) {
        this.f3386d = interfaceC2207p;
        this.f3387e = interfaceC2738M;
        this.f3388f = j5;
        this.f3389g = f2;
        this.f3390h = c3162i;
        this.f3391i = z5;
        this.f3392j = interfaceC1599a;
        this.f3393k = f5;
        this.f3394l = c1843e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        int iIntValue = ((Number) obj2).intValue();
        C1383r c1383r = (C1383r) interfaceC1373m;
        if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
            C0410l c0410l = AbstractC1059E.f3301a;
            InterfaceC2207p interfaceC2207pMo4021c = AbstractC2856m.m5052f(AbstractC1085c0.m2143b(this.f3386d.mo4021c(C1062H.f3311a), this.f3387e, AbstractC1085c0.m2144c(this.f3388f, this.f3389g, c1383r), ((InterfaceC2007c) c1383r.m2590j(AbstractC0757q0.f2358h)).mo268G(this.f3393k)), this.f3390h, AbstractC1074U.m2138a(), this.f3391i, this.f3392j).mo4021c(new C1162e(new C1160c(0)));
            InterfaceC0377O interfaceC0377OM5561d = AbstractC3282o.m5561d(C2194c.f7160d, true);
            int iHashCode = Long.hashCode(c1383r.f4882T);
            InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
            InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207pMo4021c);
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
            C0589e c0589e = C0591f.f1906f;
            if (c1383r.f4881S || !AbstractC1665j.m2981a(c1383r.m2558L(), Integer.valueOf(iHashCode))) {
                c1383r.m2585g0(Integer.valueOf(iHashCode));
                c1383r.m2574b(c0589e, Integer.valueOf(iHashCode));
            }
            AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
            this.f3394l.mo0g(c1383r, 0);
            c1383r.m2597p(true);
        } else {
            c1383r.m2563R();
        }
        return C0891q.f2780a;
    }
}
