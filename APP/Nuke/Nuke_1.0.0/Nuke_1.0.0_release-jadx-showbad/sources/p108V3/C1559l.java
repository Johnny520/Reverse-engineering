package p108V3;

import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p000A.C0002B;
import p000A.C0073m;
import p037G2.AbstractC0489a;
import p044H3.AbstractC0648c;
import p056K2.C0891q;
import p090R3.C1228a;
import p095T.AbstractC1385s;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p179i4.AbstractC2352g;
import p211o0.AbstractC2767z;
import p211o0.C2762u;

/* JADX INFO: renamed from: V3.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1559l implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5421d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f5422e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1601c f5423f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1559l(int i5, InterfaceC1601c interfaceC1601c, List list) {
        this.f5421d = 3;
        this.f5422e = list;
        this.f5423f = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f5421d) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = this.f5422e;
                    int i5 = 0;
                    for (Object obj3 : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            AbstractC2352g.m4187J();
                            throw null;
                        }
                        C1228a c1228a = (C1228a) obj3;
                        String strM4185H = AbstractC2352g.m4185H(c1228a.f4095a, c1383r);
                        String str = c1228a.f4098d;
                        C2762u c2762u = c1228a.f4099e ? new C2762u(AbstractC2767z.m4934d(4292617766L)) : null;
                        InterfaceC1601c interfaceC1601c = this.f5423f;
                        boolean zM2582f = c1383r.m2582f(interfaceC1601c) | c1383r.m2582f(c1228a);
                        Object objM2558L = c1383r.m2558L();
                        if (zM2582f || objM2558L == C1371l.f4833a) {
                            objM2558L = new C0073m(17, interfaceC1601c, c1228a);
                            c1383r.m2585g0(objM2558L);
                        }
                        AbstractC0489a.m761k(strM4185H, (InterfaceC1599a) objM2558L, null, null, AbstractC1848j.m3314c(1318951895, new C0002B(13, c1228a), c1383r), str, c2762u, false, c1383r, 24576, 140);
                        if (i5 < AbstractC2352g.m4208u(list)) {
                            c1383r.m2568W(-1075259743);
                            AbstractC1543P.m2833r(64, c1383r, 6, 0);
                            c1383r.m2597p(false);
                        } else {
                            c1383r.m2568W(-1075197278);
                            c1383r.m2597p(false);
                        }
                        i5 = i6;
                    }
                } else {
                    c1383r.m2563R();
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    List list2 = this.f5422e;
                    int i7 = 0;
                    for (Object obj4 : list2) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            AbstractC2352g.m4187J();
                            throw null;
                        }
                        AbstractC0648c abstractC0648c = (AbstractC0648c) obj4;
                        InterfaceC1601c interfaceC1601c2 = this.f5423f;
                        boolean zM2582f2 = c1383r2.m2582f(interfaceC1601c2) | c1383r2.m2586h(abstractC0648c);
                        Object objM2558L2 = c1383r2.m2558L();
                        if (zM2582f2 || objM2558L2 == C1371l.f4833a) {
                            objM2558L2 = new C0073m(15, interfaceC1601c2, abstractC0648c);
                            c1383r2.m2585g0(objM2558L2);
                        }
                        AbstractC1543P.m2837v(abstractC0648c, (InterfaceC1599a) objM2558L2, c1383r2, 8);
                        if (i7 < AbstractC2352g.m4208u(list2)) {
                            c1383r2.m2568W(1529123949);
                            AbstractC1543P.m2833r(0.0f, c1383r2, 0, 1);
                            c1383r2.m2597p(false);
                        } else {
                            c1383r2.m2568W(1529167194);
                            c1383r2.m2597p(false);
                        }
                        i7 = i8;
                    }
                } else {
                    c1383r2.m2563R();
                }
                return C0891q.f2780a;
            case 2:
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C1383r c1383r3 = (C1383r) interfaceC1373m3;
                if (c1383r3.m2560O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    List list3 = this.f5422e;
                    int i9 = 0;
                    for (Object obj5 : list3) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            AbstractC2352g.m4187J();
                            throw null;
                        }
                        final C1544Q c1544q = (C1544Q) obj5;
                        String str2 = c1544q.f5367b;
                        String str3 = c1544q.f5369d + "\n" + c1544q.f5366a.mo1118c();
                        final int i11 = 0;
                        C1843e c1843eM3314c = AbstractC1848j.m3314c(1828827040, new InterfaceC1603e() { // from class: V3.v
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p112W2.InterfaceC1603e
                            /* JADX INFO: renamed from: g */
                            public final Object mo0g(Object obj6, Object obj7) {
                                int i12 = i11;
                                InterfaceC1373m interfaceC1373m4 = (InterfaceC1373m) obj6;
                                int iIntValue4 = ((Integer) obj7).intValue();
                                switch (i12) {
                                    case 0:
                                        C1383r c1383r4 = (C1383r) interfaceC1373m4;
                                        if (c1383r4.m2560O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            AbstractC1543P.m2828m(c1544q.f5368c, c1383r4, 0);
                                        } else {
                                            c1383r4.m2563R();
                                        }
                                        break;
                                    default:
                                        C1383r c1383r5 = (C1383r) interfaceC1373m4;
                                        if (c1383r5.m2560O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            AbstractC1543P.m2829n(c1544q.f5368c, c1383r5, 0);
                                        } else {
                                            c1383r5.m2563R();
                                        }
                                        break;
                                }
                                return C0891q.f2780a;
                            }
                        }, c1383r3);
                        final int i12 = 1;
                        C1843e c1843eM3314c2 = AbstractC1848j.m3314c(224823167, new InterfaceC1603e() { // from class: V3.v
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p112W2.InterfaceC1603e
                            /* JADX INFO: renamed from: g */
                            public final Object mo0g(Object obj6, Object obj7) {
                                int i122 = i12;
                                InterfaceC1373m interfaceC1373m4 = (InterfaceC1373m) obj6;
                                int iIntValue4 = ((Integer) obj7).intValue();
                                switch (i122) {
                                    case 0:
                                        C1383r c1383r4 = (C1383r) interfaceC1373m4;
                                        if (c1383r4.m2560O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            AbstractC1543P.m2828m(c1544q.f5368c, c1383r4, 0);
                                        } else {
                                            c1383r4.m2563R();
                                        }
                                        break;
                                    default:
                                        C1383r c1383r5 = (C1383r) interfaceC1373m4;
                                        if (c1383r5.m2560O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            AbstractC1543P.m2829n(c1544q.f5368c, c1383r5, 0);
                                        } else {
                                            c1383r5.m2563R();
                                        }
                                        break;
                                }
                                return C0891q.f2780a;
                            }
                        }, c1383r3);
                        InterfaceC1601c interfaceC1601c3 = this.f5423f;
                        boolean zM2582f3 = c1383r3.m2582f(interfaceC1601c3) | c1383r3.m2586h(c1544q);
                        Object objM2558L3 = c1383r3.m2558L();
                        if (zM2582f3 || objM2558L3 == C1371l.f4833a) {
                            objM2558L3 = new C0073m(16, interfaceC1601c3, c1544q);
                            c1383r3.m2585g0(objM2558L3);
                        }
                        AbstractC0489a.m766p(str2, null, str3, c1843eM3314c, c1843eM3314c2, false, (InterfaceC1599a) objM2558L3, c1383r3, 27648, 34);
                        if (i9 < AbstractC2352g.m4208u(list3)) {
                            c1383r3.m2568W(-1918285146);
                            AbstractC1543P.m2833r(64, c1383r3, 6, 0);
                            c1383r3.m2597p(false);
                        } else {
                            c1383r3.m2568W(-1918222681);
                            c1383r3.m2597p(false);
                        }
                        i9 = i10;
                    }
                } else {
                    c1383r3.m2563R();
                }
                return C0891q.f2780a;
            default:
                ((Integer) obj2).getClass();
                AbstractC1543P.m2827l(this.f5422e, this.f5423f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(49));
                return C0891q.f2780a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1559l(List list, InterfaceC1601c interfaceC1601c, int i5, byte b2) {
        this.f5421d = i5;
        this.f5422e = list;
        this.f5423f = interfaceC1601c;
    }
}
