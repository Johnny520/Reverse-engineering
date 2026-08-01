package p176i1;

import p029F0.AbstractC0435z;
import p029F0.InterfaceC0377O;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p056K2.C0891q;
import p077P0.AbstractC1126m;
import p095T.AbstractC1385s;
import p095T.C1305C;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p136b0.AbstractC1848j;
import p169h0.AbstractC2192a;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p211o0.AbstractC2767z;

/* JADX INFO: renamed from: i1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2297m extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7487e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2310z f7488f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC1347Y f7489g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2297m(C2310z c2310z, InterfaceC1347Y interfaceC1347Y, int i5) {
        super(2);
        this.f7487e = i5;
        this.f7488f = c2310z;
        this.f7489g = interfaceC1347Y;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f7487e;
        C0891q c0891q = C0891q.f2780a;
        InterfaceC1347Y interfaceC1347Y = this.f7489g;
        C2310z c2310z = this.f7488f;
        int i6 = 0;
        switch (i5) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Number) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (!c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1383r.m2563R();
                } else {
                    Object objM2558L = c1383r.m2558L();
                    C1357e c1357e = C1371l.f4833a;
                    if (objM2558L == c1357e) {
                        objM2558L = C2287c.f7452i;
                        c1383r.m2585g0(objM2558L);
                    }
                    InterfaceC2207p interfaceC2207pM2162a = AbstractC1126m.m2162a(C2204m.f7185a, false, (InterfaceC1601c) objM2558L);
                    boolean zM2586h = c1383r.m2586h(c2310z);
                    Object objM2558L2 = c1383r.m2558L();
                    if (zM2586h || objM2558L2 == c1357e) {
                        objM2558L2 = new C2294j(c2310z, 1);
                        c1383r.m2585g0(objM2558L2);
                    }
                    InterfaceC2207p interfaceC2207pM697j = AbstractC0435z.m697j(interfaceC2207pM2162a, (InterfaceC1601c) objM2558L2);
                    float f2 = c2310z.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f2 != 1.0f) {
                        interfaceC2207pM697j = AbstractC2767z.m4943n(interfaceC2207pM697j, f2, null, 520187);
                    }
                    C1305C c1305c = AbstractC2298n.f7490a;
                    InterfaceC1603e interfaceC1603e = (InterfaceC1603e) interfaceC1347Y.getValue();
                    Object objM2558L3 = c1383r.m2558L();
                    if (objM2558L3 == c1357e) {
                        objM2558L3 = C2289e.f7462c;
                        c1383r.m2585g0(objM2558L3);
                    }
                    InterfaceC0377O interfaceC0377O = (InterfaceC0377O) objM2558L3;
                    int iHashCode = Long.hashCode(c1383r.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207pM697j);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b = C0591f.f1902b;
                    c1383r.m2571Z();
                    if (c1383r.f4881S) {
                        c1383r.m2592k(c0551b);
                    } else {
                        c1383r.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r, C0591f.f1905e, interfaceC0377O);
                    AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
                    AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
                    interfaceC1603e.mo0g(c1383r, 0);
                    c1383r.m2597p(true);
                }
                break;
            default:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (!c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c1383r2.m2563R();
                } else {
                    AbstractC1385s.m2611a(AbstractC2298n.f7491b.mo2399a(Boolean.TRUE), AbstractC1848j.m3314c(1022273628, new C2297m(c2310z, interfaceC1347Y, i6), c1383r2), c1383r2, 56);
                }
                break;
        }
        return c0891q;
    }
}
