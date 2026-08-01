package p076P;

import android.content.Context;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import p007B0.C0173F;
import p029F0.InterfaceC0377O;
import p041H0.C0551B;
import p041H0.C0589e;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p047I0.AbstractC0691Q;
import p056K2.C0891q;
import p077P0.AbstractC1126m;
import p095T.AbstractC1385s;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.C1843e;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p244u.AbstractC3261c;
import p244u.AbstractC3282o;
import p244u.C3234C;
import p244u.C3244M;
import p250v.AbstractC3349a;

/* JADX INFO: renamed from: P.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1086d implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3407d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3408e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1086d(int i5, Object obj) {
        this.f3407d = i5;
        this.f3408e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f3407d) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Number) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC2207p interfaceC2207pMo4021c = AbstractC3261c.m5527n(C2204m.f7185a, AbstractC1096i.f3522f).mo4021c(new C3234C(C2194c.f7171o));
                    InterfaceC1603e interfaceC1603e = (InterfaceC1603e) this.f3408e;
                    InterfaceC0377O interfaceC0377OM5561d = AbstractC3282o.m5561d(C2194c.f7160d, false);
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
                    interfaceC1603e.mo0g(c1383r, 0);
                    c1383r.m2597p(true);
                } else {
                    c1383r.m2563R();
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        AbstractC3349a.m5598a("invalid weight; must be greater than zero");
                    }
                    InterfaceC2207p interfaceC2207pMo4021c2 = AbstractC3261c.m5527n(new C3244M(1.0f, false), AbstractC1096i.f3523g).mo4021c(new C3234C(C2194c.f7171o));
                    InterfaceC1603e interfaceC1603e2 = (InterfaceC1603e) this.f3408e;
                    InterfaceC0377O interfaceC0377OM5561d2 = AbstractC3282o.m5561d(C2194c.f7160d, false);
                    int iHashCode2 = Long.hashCode(c1383r2.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l2 = c1383r2.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c2 = AbstractC2192a.m4016c(c1383r2, interfaceC2207pMo4021c2);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b2 = C0591f.f1902b;
                    c1383r2.m2571Z();
                    if (c1383r2.f4881S) {
                        c1383r2.m2592k(c0551b2);
                    } else {
                        c1383r2.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1905e, interfaceC0377OM5561d2);
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1904d, interfaceC1378o0M2593l2);
                    C0589e c0589e2 = C0591f.f1906f;
                    if (c1383r2.f4881S || !AbstractC1665j.m2981a(c1383r2.m2558L(), Integer.valueOf(iHashCode2))) {
                        c1383r2.m2585g0(Integer.valueOf(iHashCode2));
                        c1383r2.m2574b(c0589e2, Integer.valueOf(iHashCode2));
                    }
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1903c, interfaceC2207pM4016c2);
                    interfaceC1603e2.mo0g(c1383r2, 0);
                    c1383r2.m2597p(true);
                } else {
                    c1383r2.m2563R();
                }
                break;
            default:
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C0173F c0173f = (C0173F) this.f3408e;
                C1383r c1383r3 = (C1383r) interfaceC1373m3;
                if (c1383r3.m2560O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c1383r3.m2590j(AbstractC0691Q.f2210a);
                    String string = ((Context) c1383r3.m2590j(AbstractC0691Q.f2211b)).getResources().getString(R.string.m3c_dialog);
                    InterfaceC2207p interfaceC2207pM5535v = AbstractC3261c.m5535v((InterfaceC2207p) c0173f.f613f, AbstractC1096i.f3517a, Float.NaN, AbstractC1096i.f3518b, Float.NaN);
                    boolean zM2582f = c1383r3.m2582f(string);
                    Object objM2558L = c1383r3.m2558L();
                    if (zM2582f || objM2558L == C1371l.f4833a) {
                        objM2558L = new C1108u(string, 0);
                        c1383r3.m2585g0(objM2558L);
                    }
                    InterfaceC2207p interfaceC2207pMo4021c3 = interfaceC2207pM5535v.mo4021c(AbstractC1126m.m2162a(C2204m.f7185a, false, (InterfaceC1601c) objM2558L));
                    InterfaceC0377O interfaceC0377OM5561d3 = AbstractC3282o.m5561d(C2194c.f7160d, true);
                    int iHashCode3 = Long.hashCode(c1383r3.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l3 = c1383r3.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c3 = AbstractC2192a.m4016c(c1383r3, interfaceC2207pMo4021c3);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b3 = C0591f.f1902b;
                    c1383r3.m2571Z();
                    if (c1383r3.f4881S) {
                        c1383r3.m2592k(c0551b3);
                    } else {
                        c1383r3.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r3, C0591f.f1905e, interfaceC0377OM5561d3);
                    AbstractC1385s.m2635y(c1383r3, C0591f.f1904d, interfaceC1378o0M2593l3);
                    C0589e c0589e3 = C0591f.f1906f;
                    if (c1383r3.f4881S || !AbstractC1665j.m2981a(c1383r3.m2558L(), Integer.valueOf(iHashCode3))) {
                        c1383r3.m2585g0(Integer.valueOf(iHashCode3));
                        c1383r3.m2574b(c0589e3, Integer.valueOf(iHashCode3));
                    }
                    AbstractC1385s.m2635y(c1383r3, C0591f.f1903c, interfaceC2207pM4016c3);
                    ((C1843e) c0173f.f615h).mo0g(c1383r3, 0);
                    c1383r3.m2597p(true);
                } else {
                    c1383r3.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
