package p000A;

import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1926h;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import p037G2.AbstractC0489a;
import p037G2.C0513y;
import p045H4.AbstractC0653e;
import p045H4.C0650b;
import p047I0.AbstractC0757q0;
import p056K2.C0891q;
import p058L.AbstractC0933e0;
import p058L.C0931d0;
import p092S0.C1260M;
import p095T.AbstractC1385s;
import p095T.C1341U0;
import p095T.C1357e;
import p095T.C1366i0;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p108V3.C1556i;
import p110W0.C1587l;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p149d3.AbstractC1976d;
import p153e1.EnumC2017m;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p179i4.AbstractC2352g;
import p193l0.AbstractC2485h;
import p193l0.C2481d;
import p211o0.C2753l;
import p227r.AbstractC3005o0;
import p227r.C3000m;
import p227r.EnumC2983d0;
import p227r.InterfaceC3017u0;
import p244u.AbstractC3261c;
import p244u.C3290w;
import p255w.C3372c;

/* JADX INFO: renamed from: A.K0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0021K0 implements InterfaceC1604f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f112d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f113e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f114f;

    public /* synthetic */ C0021K0(int i5, Object obj, boolean z5) {
        this.f112d = i5;
        this.f114f = obj;
        this.f113e = z5;
    }

    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        switch (this.f112d) {
            case 0:
                C0029O0 c0029o0 = (C0029O0) this.f114f;
                C1366i0 c1366i0 = c0029o0.f147f;
                ((Integer) obj3).getClass();
                C1383r c1383r = (C1383r) ((InterfaceC1373m) obj2);
                c1383r.m2568W(-2137546592);
                boolean z5 = ((EnumC2983d0) c1366i0.getValue()) == EnumC2983d0.f9447d || !(c1383r.m2590j(AbstractC0757q0.f2364n) == EnumC2017m.f6743e);
                boolean zM2582f = c1383r.m2582f(c0029o0);
                Object objM2558L = c1383r.m2558L();
                C1357e c1357e = C1371l.f4833a;
                if (zM2582f || objM2558L == c1357e) {
                    objM2558L = new C0049a(1, c0029o0);
                    c1383r.m2585g0(objM2558L);
                }
                InterfaceC1347Y interfaceC1347YM2633w = AbstractC1385s.m2633w((InterfaceC1601c) objM2558L, c1383r);
                Object objM2558L2 = c1383r.m2558L();
                if (objM2558L2 == c1357e) {
                    C3000m c3000m = new C3000m(new C0013G0(interfaceC1347YM2633w, 16));
                    c1383r.m2585g0(c3000m);
                    objM2558L2 = c3000m;
                }
                InterfaceC3017u0 interfaceC3017u0 = (InterfaceC3017u0) objM2558L2;
                boolean zM2582f2 = c1383r.m2582f(interfaceC3017u0) | c1383r.m2582f(c0029o0);
                Object objM2558L3 = c1383r.m2558L();
                if (zM2582f2 || objM2558L3 == c1357e) {
                    objM2558L3 = new C0025M0(interfaceC3017u0, c0029o0);
                    c1383r.m2585g0(objM2558L3);
                }
                InterfaceC2207p interfaceC2207pM5208b = AbstractC3005o0.m5208b((C0025M0) objM2558L3, (EnumC2983d0) c1366i0.getValue(), this.f113e && c0029o0.f143b.m2507g() != 0.0f, z5);
                c1383r.m2597p(false);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                final InterfaceC1599a interfaceC1599a = (InterfaceC1599a) this.f114f;
                InterfaceC2207p interfaceC2207p = (InterfaceC2207p) obj;
                ((Integer) obj3).getClass();
                C1383r c1383r2 = (C1383r) ((InterfaceC1373m) obj2);
                c1383r2.m2568W(-196777734);
                final long j5 = ((C0931d0) c1383r2.m2590j(AbstractC0933e0.f2926a)).f2922a;
                boolean zM2580e = c1383r2.m2580e(j5) | c1383r2.m2582f(interfaceC1599a);
                final boolean z6 = this.f113e;
                boolean zM2584g = zM2580e | c1383r2.m2584g(z6);
                Object objM2558L4 = c1383r2.m2558L();
                if (zM2584g || objM2558L4 == C1371l.f4833a) {
                    objM2558L4 = new InterfaceC1601c() { // from class: L.g
                        @Override // p112W2.InterfaceC1601c
                        /* JADX INFO: renamed from: h */
                        public final Object mo1h(Object obj4) {
                            C2481d c2481d = (C2481d) obj4;
                            return c2481d.m4426a(new C0513y(interfaceC1599a, z6, AbstractC1923e.m3480r(c2481d, Float.intBitsToFloat((int) (c2481d.f7981d.mo946c() >> 32)) / 2.0f), new C2753l(j5, 5)));
                        }
                    };
                    c1383r2.m2585g0(objM2558L4);
                }
                InterfaceC2207p interfaceC2207pM4430d = AbstractC2485h.m4430d(interfaceC2207p, (InterfaceC1601c) objM2558L4);
                c1383r2.m2597p(false);
                break;
            case 2:
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f114f;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3290w) obj, "$this$NukeDialog");
                C1383r c1383r3 = (C1383r) interfaceC1373m;
                if (c1383r3.m2560O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f2 = 8;
                    C2204m c2204m = C2204m.f7185a;
                    InterfaceC2207p interfaceC2207pM5531r = AbstractC3261c.m5531r(c2204m, 0.0f, 0.0f, 0.0f, f2, 7);
                    String strM4185H = AbstractC2352g.m4185H(R.string.chat_avatar_rotator_duration_label, c1383r3);
                    C1341U0 c1341u0 = AbstractC0653e.f2072a;
                    long j6 = ((C0650b) c1383r3.m2590j(c1341u0)).f2065f;
                    long jM3579v = AbstractC1926h.m3579v(13);
                    long jM3579v2 = AbstractC1926h.m3579v(18);
                    C1587l c1587l = C1587l.f5503g;
                    AbstractC0070k0.m74a(strM4185H, interfaceC2207pM5531r, new C1260M(j6, jM3579v, c1587l, 0L, 0, jM3579v2, null, null, 16646136), 0, false, 0, 0, c1383r3, 48, 1016);
                    String str = (String) interfaceC1347Y.getValue();
                    boolean zM2582f3 = c1383r3.m2582f(interfaceC1347Y);
                    Object objM2558L5 = c1383r3.m2558L();
                    if (zM2582f3 || objM2558L5 == C1371l.f4833a) {
                        objM2558L5 = new C0013G0(interfaceC1347Y, 8);
                        c1383r3.m2585g0(objM2558L5);
                    }
                    AbstractC0489a.m768r(str, (InterfaceC1601c) objM2558L5, null, AbstractC2352g.m4185H(R.string.chat_avatar_rotator_duration_hint, c1383r3), null, null, false, 0, 0, false, null, new C0076n0(3, 123), null, c1383r3, 0, 384, 12276);
                    if (AbstractC1976d.m3637e0((String) interfaceC1347Y.getValue()) || this.f113e) {
                        c1383r3.m2568W(980658337);
                        c1383r3.m2597p(false);
                    } else {
                        c1383r3.m2568W(980262095);
                        AbstractC0070k0.m74a(AbstractC2352g.m4185H(R.string.chat_avatar_rotator_duration_invalid, c1383r3), AbstractC3261c.m5531r(c2204m, 0.0f, f2, 0.0f, 0.0f, 13), new C1260M(((C0650b) c1383r3.m2590j(c1341u0)).f2066g, AbstractC1926h.m3579v(12), c1587l, 0L, 0, AbstractC1926h.m3579v(17), null, null, 16646136), 0, false, 0, 0, c1383r3, 48, 1016);
                        c1383r3.m2597p(false);
                    }
                } else {
                    c1383r3.m2563R();
                }
                break;
            default:
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f114f;
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3372c) obj, "$this$item");
                C1383r c1383r4 = (C1383r) interfaceC1373m2;
                if (c1383r4.m2560O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC0489a.m765o(null, "Safety", AbstractC1848j.m3314c(1225760799, new C1556i(interfaceC1601c, this.f113e), c1383r4), c1383r4, 432, 1);
                } else {
                    c1383r4.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
