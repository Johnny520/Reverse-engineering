package p270y3;

import java.util.List;
import p000A.C0045X;
import p000A.C0072l0;
import p004A3.C0157b;
import p056K2.C0891q;
import p092S0.C1287y;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p128a.AbstractC1785a;
import p136b0.C1843e;
import p244u.AbstractC3261c;
import p244u.C3251U;
import p244u.C3293z;
import p255w.C3375f;
import p276z3.C3521d;

/* JADX INFO: renamed from: y3.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3494b implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10892d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f10893e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0157b f10894f;

    public /* synthetic */ C3494b(List list, C0157b c0157b, int i5) {
        this.f10892d = i5;
        this.f10893e = list;
        this.f10894f = c0157b;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f10892d) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C3293z c3293z = AbstractC3261c.f10087c;
                    final List list = this.f10893e;
                    boolean zM2586h = c1383r.m2586h(list);
                    final C0157b c0157b = this.f10894f;
                    boolean zM2582f = zM2586h | c1383r.m2582f(c0157b);
                    Object objM2558L = c1383r.m2558L();
                    if (zM2582f || objM2558L == C1371l.f4833a) {
                        final int i5 = 0;
                        objM2558L = new InterfaceC1601c() { // from class: y3.c
                            @Override // p112W2.InterfaceC1601c
                            /* JADX INFO: renamed from: h */
                            public final Object mo1h(Object obj3) {
                                C3375f c3375f = (C3375f) obj3;
                                switch (i5) {
                                    case 0:
                                        AbstractC1665j.m2985e(c3375f, "$this$LazyColumn");
                                        C1287y c1287y = new C1287y((byte) 0, 29);
                                        List list2 = list;
                                        c3375f.f10490a.m1339b(list2.size(), new C0072l0(new C0045X(6, c1287y, list2), new C3497e(0, list2), new C1843e(2039820996, true, new C3498f(list2, list2, c0157b, 0)), 22));
                                        break;
                                    default:
                                        AbstractC1665j.m2985e(c3375f, "$this$LazyColumn");
                                        C3521d c3521d = new C3521d();
                                        List list3 = list;
                                        c3375f.f10490a.m1339b(list3.size(), new C0072l0(new C0045X(7, c3521d, list3), new C3497e(1, list3), new C1843e(2039820996, true, new C3498f(list3, list3, c0157b, 1)), 22));
                                        break;
                                }
                                return C0891q.f2780a;
                            }
                        };
                        c1383r.m2585g0(objM2558L);
                    }
                    AbstractC1785a.m3242b(6, 510, c1383r, (InterfaceC1601c) objM2558L, null, c3293z, null, null, null, null, null, false);
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C3293z c3293z2 = AbstractC3261c.f10088d;
                    C3251U c3251uM5514a = AbstractC3261c.m5514a(4, 1);
                    final List list2 = this.f10893e;
                    boolean zM2586h2 = c1383r2.m2586h(list2);
                    final C0157b c0157b2 = this.f10894f;
                    boolean zM2582f2 = zM2586h2 | c1383r2.m2582f(c0157b2);
                    Object objM2558L2 = c1383r2.m2558L();
                    if (zM2582f2 || objM2558L2 == C1371l.f4833a) {
                        final int i6 = 1;
                        objM2558L2 = new InterfaceC1601c() { // from class: y3.c
                            @Override // p112W2.InterfaceC1601c
                            /* JADX INFO: renamed from: h */
                            public final Object mo1h(Object obj3) {
                                C3375f c3375f = (C3375f) obj3;
                                switch (i6) {
                                    case 0:
                                        AbstractC1665j.m2985e(c3375f, "$this$LazyColumn");
                                        C1287y c1287y = new C1287y((byte) 0, 29);
                                        List list22 = list2;
                                        c3375f.f10490a.m1339b(list22.size(), new C0072l0(new C0045X(6, c1287y, list22), new C3497e(0, list22), new C1843e(2039820996, true, new C3498f(list22, list22, c0157b2, 0)), 22));
                                        break;
                                    default:
                                        AbstractC1665j.m2985e(c3375f, "$this$LazyColumn");
                                        C3521d c3521d = new C3521d();
                                        List list3 = list2;
                                        c3375f.f10490a.m1339b(list3.size(), new C0072l0(new C0045X(7, c3521d, list3), new C3497e(1, list3), new C1843e(2039820996, true, new C3498f(list3, list3, c0157b2, 1)), 22));
                                        break;
                                }
                                return C0891q.f2780a;
                            }
                        };
                        c1383r2.m2585g0(objM2558L2);
                    }
                    AbstractC1785a.m3242b(390, 506, c1383r2, (InterfaceC1601c) objM2558L2, null, c3293z2, null, null, null, c3251uM5514a, null, false);
                } else {
                    c1383r2.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
