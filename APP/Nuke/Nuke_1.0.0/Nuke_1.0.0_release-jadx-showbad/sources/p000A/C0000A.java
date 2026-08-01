package p000A;

import p029F0.InterfaceC0430v;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p056K2.C0891q;
import p058L.C0920W;
import p076P.AbstractC1072S;
import p076P.C1098k;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p136b0.C1843e;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2192a;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p211o0.InterfaceC2738M;
import p244u.C3251U;

/* JADX INFO: renamed from: A.A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0000A implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f0d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f1e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f2f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f3g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f4h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f6j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f7k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f8l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0000A(C0920W c0920w, C0078o0 c0078o0, boolean z5, InterfaceC1601c interfaceC1601c, C1646u c1646u, C0042V0 c0042v0, InterfaceC2007c interfaceC2007c, int i5) {
        this.f3g = c0920w;
        this.f4h = c0078o0;
        this.f1e = z5;
        this.f5i = interfaceC1601c;
        this.f6j = c1646u;
        this.f7k = c0042v0;
        this.f8l = interfaceC2007c;
        this.f2f = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb  */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f0d) {
            case 0:
                C0920W c0920w = (C0920W) this.f3g;
                C0078o0 c0078o0 = (C0078o0) this.f4h;
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f5i;
                C1646u c1646u = (C1646u) this.f6j;
                C0042V0 c0042v0 = (C0042V0) this.f7k;
                InterfaceC2007c interfaceC2007c = (InterfaceC2007c) this.f8l;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z5 = true;
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0026N c0026n = new C0026N(c0078o0, interfaceC1601c, c1646u, c0042v0, interfaceC2007c, this.f2f);
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
                    AbstractC1385s.m2635y(c1383r, C0591f.f1905e, c0026n);
                    AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
                    AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
                    c1383r.m2597p(true);
                    EnumC0052b0 enumC0052b0M120a = c0078o0.m120a();
                    EnumC0052b0 enumC0052b0 = EnumC0052b0.f211d;
                    boolean z6 = this.f1e;
                    if (enumC0052b0M120a == enumC0052b0 || c0078o0.m122c() == null) {
                        z5 = false;
                        AbstractC0070k0.m79f(c0920w, z5, c1383r, 0);
                        if (c0078o0.m120a() == EnumC0052b0.f213f || !z6) {
                            c1383r.m2568W(-747377894);
                        } else {
                            c1383r.m2568W(-714666198);
                            AbstractC0070k0.m80g(c0920w, c1383r, 0);
                        }
                        c1383r.m2597p(false);
                    } else {
                        InterfaceC0430v interfaceC0430vM122c = c0078o0.m122c();
                        AbstractC1665j.m2982b(interfaceC0430vM122c);
                        if (!interfaceC0430vM122c.mo632D() || !z6) {
                        }
                        AbstractC0070k0.m79f(c0920w, z5, c1383r, 0);
                        if (c0078o0.m120a() == EnumC0052b0.f213f) {
                            c1383r.m2568W(-747377894);
                            c1383r.m2597p(false);
                        }
                    }
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1072S.m2132b((InterfaceC1599a) this.f3g, (InterfaceC2207p) this.f4h, this.f1e, (InterfaceC2738M) this.f5i, (C1098k) this.f6j, null, (C3251U) this.f7k, (C1843e) this.f8l, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f2f | 1));
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0000A(InterfaceC1599a interfaceC1599a, InterfaceC2207p interfaceC2207p, boolean z5, InterfaceC2738M interfaceC2738M, C1098k c1098k, AbstractC1072S abstractC1072S, C3251U c3251u, C1843e c1843e, int i5) {
        this.f3g = interfaceC1599a;
        this.f4h = interfaceC2207p;
        this.f1e = z5;
        this.f5i = interfaceC2738M;
        this.f6j = c1098k;
        this.f7k = c3251u;
        this.f8l = c1843e;
        this.f2f = i5;
    }
}
