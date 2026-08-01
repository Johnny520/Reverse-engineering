package p021D3;

import com.bumptech.glide.AbstractC1926h;
import me.dartcv.nuke.BuildConfig;
import p000A.C0038T0;
import p000A.C0099z;
import p004A3.AbstractC0159d;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p056K2.C0891q;
import p076P.AbstractC1070P;
import p076P.AbstractC1089e0;
import p076P.AbstractC1105r;
import p076P.C1104q;
import p095T.AbstractC1385s;
import p095T.C1341U0;
import p095T.C1366i0;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p110W0.C1587l;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p136b0.AbstractC1848j;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p179i4.AbstractC2352g;
import p244u.AbstractC3261c;
import p244u.AbstractC3273i;
import p244u.AbstractC3287t;
import p244u.C3289v;

/* JADX INFO: renamed from: D3.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0265b implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f858d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0038T0 f859e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0265b(C0038T0 c0038t0, int i5) {
        this.f858d = i5;
        this.f859e = c0038t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f858d) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0159d.m228a(false, false, AbstractC1848j.m3314c(1811069272, new C0265b(this.f859e, 1), c1383r), c1383r, 384, 3);
                } else {
                    c1383r.m2563R();
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC2352g.m4188a(this.f859e, null, null, c1383r2, 0);
                } else {
                    c1383r2.m2563R();
                }
                break;
            default:
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C1383r c1383r3 = (C1383r) interfaceC1373m3;
                if (c1383r3.m2560O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    InterfaceC2207p interfaceC2207pM5529p = AbstractC3261c.m5529p(C2204m.f7185a, 24, 22);
                    C3289v c3289vM5564a = AbstractC3287t.m5564a(AbstractC3273i.m5549g(16), C2194c.f7171o, c1383r3, 6);
                    int iHashCode = Long.hashCode(c1383r3.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l = c1383r3.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r3, interfaceC2207pM5529p);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b = C0591f.f1902b;
                    c1383r3.m2571Z();
                    if (c1383r3.f4881S) {
                        c1383r3.m2592k(c0551b);
                    } else {
                        c1383r3.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r3, C0591f.f1905e, c3289vM5564a);
                    AbstractC1385s.m2635y(c1383r3, C0591f.f1904d, interfaceC1378o0M2593l);
                    AbstractC1385s.m2627q(c1383r3, Integer.valueOf(iHashCode), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r3, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r3, C0591f.f1903c, interfaceC2207pM4016c);
                    C1341U0 c1341u0 = AbstractC1105r.f3612a;
                    AbstractC1089e0.m2146b("正在分析 Dex", null, ((C1104q) c1383r3.m2590j(c1341u0)).f3602q, AbstractC1926h.m3579v(20), C1587l.f5504h, null, AbstractC1926h.m3579v(0), null, 0L, 0, false, 0, 0, null, c1383r3, 102260736, 0, 261802);
                    C0038T0 c0038t0 = this.f859e;
                    AbstractC1089e0.m2146b((String) ((C1366i0) c0038t0.f169e).getValue(), null, ((C1104q) c1383r3.m2590j(c1341u0)).f3604s, AbstractC1926h.m3579v(14), null, null, AbstractC1926h.m3579v(0), null, AbstractC1926h.m3579v(22), 0, false, 0, 0, null, c1383r3, 100687872, 48, 259818);
                    boolean zM2582f = c1383r3.m2582f(c0038t0);
                    Object objM2558L = c1383r3.m2558L();
                    if (zM2582f || objM2558L == C1371l.f4833a) {
                        objM2558L = new C0099z(12, c0038t0);
                        c1383r3.m2585g0(objM2558L);
                    }
                    AbstractC1070P.m2129a((InterfaceC1599a) objM2558L, AbstractC3261c.m5521h(AbstractC3261c.f10087c, 6), 0L, 0L, 0, 0.0f, null, c1383r3, 48);
                    c1383r3.m2597p(true);
                } else {
                    c1383r3.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
