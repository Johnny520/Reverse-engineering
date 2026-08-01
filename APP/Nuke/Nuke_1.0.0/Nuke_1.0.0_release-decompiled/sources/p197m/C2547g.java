package p197m;

import p007B0.C0172E;
import p029F0.AbstractC0435z;
import p047I0.C0710a;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1366i0;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p158f0.C2085q;
import p169h0.InterfaceC2207p;
import p203n.C2620C;
import p203n.C2642Z;
import p203n.InterfaceC2637U;

/* JADX INFO: renamed from: m.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2547g extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8135e = 1;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1843e f8136f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f8137g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f8138h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f8139i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f8140j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f8141k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2547g(C2620C c2620c, InterfaceC2207p interfaceC2207p, C2528M c2528m, C2529N c2529n, String str, C1843e c1843e, int i5) {
        super(2);
        this.f8137g = c2620c;
        this.f8138h = interfaceC2207p;
        this.f8139i = c2528m;
        this.f8140j = c2529n;
        this.f8141k = str;
        this.f8136f = c1843e;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f8135e) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f8139i;
                C2559s c2559s = (C2559s) this.f8140j;
                C2642Z c2642z = (C2642Z) this.f8137g;
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM2558L = c1383r.m2558L();
                    C1357e c1357e = C1371l.f4833a;
                    if (objM2558L == c1357e) {
                        objM2558L = (C2516A) interfaceC1601c.mo1h(c2559s);
                        c1383r.m2585g0(objM2558L);
                    }
                    C2516A c2516a = (C2516A) objM2558L;
                    InterfaceC2637U interfaceC2637UM4596f = c2642z.m4596f();
                    C1366i0 c1366i0 = c2642z.f8404d;
                    Object objMo4477c = interfaceC2637UM4596f.mo4477c();
                    Object obj3 = this.f8138h;
                    boolean zM2584g = c1383r.m2584g(AbstractC1665j.m2981a(objMo4477c, obj3));
                    Object objM2558L2 = c1383r.m2558L();
                    if (zM2584g || objM2558L2 == c1357e) {
                        objM2558L2 = AbstractC1665j.m2981a(c2642z.m4596f().mo4477c(), obj3) ? C2529N.f8090b : ((C2516A) interfaceC1601c.mo1h(c2559s)).f8036b;
                        c1383r.m2585g0(objM2558L2);
                    }
                    C2529N c2529n = (C2529N) objM2558L2;
                    Object objM2558L3 = c1383r.m2558L();
                    if (objM2558L3 == c1357e) {
                        objM2558L3 = new C2554n(AbstractC1665j.m2981a(obj3, c1366i0.getValue()));
                        c1383r.m2585g0(objM2558L3);
                    }
                    C2554n c2554n = (C2554n) objM2558L3;
                    C2528M c2528m = c2516a.f8035a;
                    boolean zM2586h = c1383r.m2586h(c2516a);
                    Object objM2558L4 = c1383r.m2558L();
                    if (zM2586h || objM2558L4 == c1357e) {
                        objM2558L4 = new C2545e(c2516a);
                        c1383r.m2585g0(objM2558L4);
                    }
                    InterfaceC2207p interfaceC2207pM695h = AbstractC0435z.m695h((InterfaceC1604f) objM2558L4);
                    c2554n.f8158a.setValue(Boolean.valueOf(AbstractC1665j.m2981a(obj3, c1366i0.getValue())));
                    InterfaceC2207p interfaceC2207pMo4021c = interfaceC2207pM695h.mo4021c(c2554n);
                    boolean zM2586h2 = c1383r.m2586h(obj3);
                    Object objM2558L5 = c1383r.m2558L();
                    if (zM2586h2 || objM2558L5 == c1357e) {
                        objM2558L5 = new C0172E(20, obj3);
                        c1383r.m2585g0(objM2558L5);
                    }
                    InterfaceC1601c interfaceC1601c2 = (InterfaceC1601c) objM2558L5;
                    boolean zM2582f = c1383r.m2582f(c2529n);
                    Object objM2558L6 = c1383r.m2558L();
                    if (zM2582f || objM2558L6 == c1357e) {
                        objM2558L6 = new C0710a(6, c2529n);
                        c1383r.m2585g0(objM2558L6);
                    }
                    AbstractC2563w.m4478a(c2642z, interfaceC1601c2, interfaceC2207pMo4021c, c2528m, c2529n, (InterfaceC1603e) objM2558L6, AbstractC1848j.m3314c(-143346359, new C2546f((C2085q) this.f8141k, obj3, c2559s, this.f8136f), c1383r), c1383r, 12582912);
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC2563w.m4479b((C2620C) this.f8137g, (InterfaceC2207p) this.f8138h, (C2528M) this.f8139i, (C2529N) this.f8140j, (String) this.f8141k, this.f8136f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(196993));
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2547g(C2642Z c2642z, Object obj, InterfaceC1601c interfaceC1601c, C2559s c2559s, C2085q c2085q, C1843e c1843e) {
        super(2);
        this.f8137g = c2642z;
        this.f8138h = obj;
        this.f8139i = interfaceC1601c;
        this.f8140j = c2559s;
        this.f8141k = c2085q;
        this.f8136f = c1843e;
    }
}
