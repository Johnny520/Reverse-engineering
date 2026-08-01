package p270y3;

import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import p004A3.C0157b;
import p029F0.InterfaceC0377O;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p056K2.C0891q;
import p076P.AbstractC1056B;
import p076P.AbstractC1089e0;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p110W0.C1587l;
import p112W2.InterfaceC1603e;
import p118X3.C1706p;
import p128a.AbstractC1785a;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p179i4.AbstractC2352g;
import p211o0.C2740O;
import p211o0.C2762u;
import p244u.AbstractC3261c;
import p244u.AbstractC3282o;
import p244u.C3293z;
import p245u0.AbstractC3300G;
import p245u0.C3308e;
import p245u0.C3309f;
import p245u0.C3315l;

/* JADX INFO: renamed from: y3.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3496d implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10898d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0157b f10899e;

    public /* synthetic */ C3496d(C0157b c0157b, int i5) {
        this.f10898d = i5;
        this.f10899e = c0157b;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f10898d;
        C0891q c0891q = C0891q.f2780a;
        C2204m c2204m = C2204m.f7185a;
        C0157b c0157b = this.f10899e;
        switch (i5) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (!c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1383r.m2563R();
                } else {
                    AbstractC1089e0.m2146b("作用域", AbstractC3261c.m5529p(c2204m, 10, 5), c0157b.f580q, AbstractC1926h.m3579v(12), C1587l.f5503g, null, AbstractC1926h.m3579v(0), null, 0L, 0, false, 0, 0, null, c1383r, 102260790, 0, 261800);
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (!c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c1383r2.m2563R();
                } else {
                    C3293z c3293z = AbstractC3261c.f10088d;
                    InterfaceC0377O interfaceC0377OM5561d = AbstractC3282o.m5561d(C2194c.f7164h, false);
                    int iHashCode = Long.hashCode(c1383r2.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l = c1383r2.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r2, c3293z);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b = C0591f.f1902b;
                    c1383r2.m2571Z();
                    if (c1383r2.f4881S) {
                        c1383r2.m2592k(c0551b);
                    } else {
                        c1383r2.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1905e, interfaceC0377OM5561d);
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1904d, interfaceC1378o0M2593l);
                    AbstractC1385s.m2627q(c1383r2, Integer.valueOf(iHashCode), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r2, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1903c, interfaceC2207pM4016c);
                    AbstractC1056B.m2124a(AbstractC1926h.m3583z(R.drawable.ic_github_mark_24, c1383r2), AbstractC2352g.m4185H(R.string.open_source_projects, c1383r2), AbstractC3261c.m5533t(c2204m, 20), c0157b.f570g, c1383r2, 392);
                    c1383r2.m2597p(true);
                }
                break;
            default:
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C1383r c1383r3 = (C1383r) interfaceC1373m3;
                if (!c1383r3.m2560O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c1383r3.m2563R();
                } else {
                    C3293z c3293z2 = AbstractC3261c.f10088d;
                    InterfaceC0377O interfaceC0377OM5561d2 = AbstractC3282o.m5561d(C2194c.f7164h, false);
                    int iHashCode2 = Long.hashCode(c1383r3.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l2 = c1383r3.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c2 = AbstractC2192a.m4016c(c1383r3, c3293z2);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b2 = C0591f.f1902b;
                    c1383r3.m2571Z();
                    if (c1383r3.f4881S) {
                        c1383r3.m2592k(c0551b2);
                    } else {
                        c1383r3.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r3, C0591f.f1905e, interfaceC0377OM5561d2);
                    AbstractC1385s.m2635y(c1383r3, C0591f.f1904d, interfaceC1378o0M2593l2);
                    AbstractC1385s.m2627q(c1383r3, Integer.valueOf(iHashCode2), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r3, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r3, C0591f.f1903c, interfaceC2207pM4016c2);
                    C3309f c3309fM5579b = AbstractC1785a.f6100f;
                    if (c3309fM5579b == null) {
                        C3308e c3308e = new C3308e("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i6 = AbstractC3300G.f10208a;
                        C2740O c2740o = new C2740O(C2762u.f8757b);
                        C1706p c1706p = new C1706p(5);
                        c1706p.m3033l(20.0f, 11.0f);
                        C3315l c3315l = new C3315l(7.83f);
                        ArrayList arrayList = c1706p.f5857a;
                        arrayList.add(c3315l);
                        c1706p.m3032k(5.59f, -5.59f);
                        c1706p.m3031j(12.0f, 4.0f);
                        c1706p.m3032k(-8.0f, 8.0f);
                        c1706p.m3032k(8.0f, 8.0f);
                        c1706p.m3032k(1.41f, -1.41f);
                        c1706p.m3031j(7.83f, 13.0f);
                        arrayList.add(new C3315l(20.0f));
                        c1706p.m3037p(-2.0f);
                        c1706p.m3025d();
                        C3308e.m5578a(c3308e, arrayList, c2740o);
                        c3309fM5579b = c3308e.m5579b();
                        AbstractC1785a.f6100f = c3309fM5579b;
                    }
                    AbstractC1056B.m2125b(c3309fM5579b, AbstractC2352g.m4185H(R.string.back, c1383r3), AbstractC3261c.m5533t(c2204m, 20), c0157b.f570g, c1383r3, 384);
                    c1383r3.m2597p(true);
                }
                break;
        }
        return c0891q;
    }
}
