package p197m;

import p000A.C0010F;
import p011B4.AbstractC0231b;
import p029F0.AbstractC0435z;
import p034G.C0466k;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1366i0;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p136b0.C1843e;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2086r;
import p169h0.AbstractC2192a;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p203n.AbstractC2648c0;
import p203n.AbstractC2649d;
import p203n.C2620C;
import p203n.C2636T;
import p203n.C2642Z;
import p203n.C2644a0;
import p203n.C2652e0;
import p211o0.AbstractC2767z;
import p217p0.C2873d;

/* JADX INFO: renamed from: m.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2563w {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m4478a(C2642Z c2642z, InterfaceC1601c interfaceC1601c, InterfaceC2207p interfaceC2207p, C2528M c2528m, C2529N c2529n, InterfaceC1603e interfaceC1603e, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        C1843e c1843e2;
        int i6;
        int i7;
        C2642Z c2642z2;
        C2528M c2528m2;
        C1357e c1357e;
        boolean z5;
        boolean z6;
        C2636T c2636t;
        boolean z7;
        C2636T c2636t2;
        C2636T c2636t3;
        C2636T c2636t4;
        C2636T c2636t5;
        C2636T c2636tM4607a;
        C2529N c2529n2;
        C1843e c1843e3;
        C1843e c1843e4 = c1843e;
        C1366i0 c1366i0 = c2642z.f8404d;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1912839215);
        int i8 = (c1383r.m2582f(c2642z) ? 4 : 2) | i5;
        if ((i5 & 48) == 0) {
            i8 |= c1383r.m2586h(interfaceC1601c) ? 32 : 16;
        }
        int i9 = i8 | (c1383r.m2582f(interfaceC2207p) ? 256 : 128);
        if ((i5 & 3072) == 0) {
            i9 |= c1383r.m2582f(c2528m) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i9 |= c1383r.m2582f(c2529n) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i9 |= c1383r.m2586h(interfaceC1603e) ? 131072 : 65536;
        }
        int i10 = i9 | 1572864;
        if ((12582912 & i5) == 0) {
            i10 |= c1383r.m2586h(c1843e4) ? 8388608 : 4194304;
        }
        int i11 = i10;
        if (!c1383r.m2560O(i11 & 1, (4793491 & i11) != 4793490)) {
            c1383r.m2563R();
            c1843e2 = c1843e4;
        } else if (((Boolean) interfaceC1601c.mo1h(c1366i0.getValue())).booleanValue() || ((Boolean) interfaceC1601c.mo1h(c2642z.m4593c())).booleanValue() || c2642z.m4597g() || c2642z.m4594d()) {
            c1383r.m2568W(-232413539);
            int i12 = i11 & 14;
            int i13 = i12 | 48;
            int i14 = i13 & 14;
            boolean z8 = ((i14 ^ 6) > 4 && c1383r.m2582f(c2642z)) || (i13 & 6) == 4;
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e2 = C1371l.f4833a;
            if (z8 || objM2558L == c1357e2) {
                objM2558L = c2642z.m4593c();
                c1383r.m2585g0(objM2558L);
            }
            if (c2642z.m4597g()) {
                objM2558L = c2642z.m4593c();
            }
            c1383r.m2568W(1844425648);
            EnumC2517B enumC2517BM4481d = m4481d(c2642z, interfaceC1601c, objM2558L, c1383r);
            c1383r.m2597p(false);
            Object value = c1366i0.getValue();
            c1383r.m2568W(1844425648);
            EnumC2517B enumC2517BM4481d2 = m4481d(c2642z, interfaceC1601c, value, c1383r);
            c1383r.m2597p(false);
            int i15 = i14 | 3072;
            int i16 = AbstractC2648c0.f8436a;
            int i17 = (i15 & 14) ^ 6;
            boolean z9 = (i17 > 4 && c1383r.m2582f(c2642z)) || (i15 & 6) == 4;
            Object objM2558L2 = c1383r.m2558L();
            if (z9 || objM2558L2 == c1357e2) {
                i6 = i15;
                i7 = i11;
                objM2558L2 = new C2642Z(new C2620C(enumC2517BM4481d), c2642z, AbstractC0231b.m403n(new StringBuilder(), c2642z.f8403c, " > EnterExitTransition"));
                c1383r.m2585g0(objM2558L2);
            } else {
                i6 = i15;
                i7 = i11;
            }
            C2642Z c2642z3 = (C2642Z) objM2558L2;
            boolean zM2582f = c1383r.m2582f(c2642z3) | ((i17 > 4 && c1383r.m2582f(c2642z)) || (i6 & 6) == 4);
            Object objM2558L3 = c1383r.m2558L();
            if (zM2582f || objM2558L3 == c1357e2) {
                objM2558L3 = new C0010F(12, c2642z, c2642z3);
                c1383r.m2585g0(objM2558L3);
            }
            AbstractC1385s.m2613c(c2642z3, (InterfaceC1601c) objM2558L3, c1383r);
            if (c2642z.m4597g()) {
                c2642z3.m4600j(enumC2517BM4481d, enumC2517BM4481d2);
            } else {
                c2642z3.m4601k(enumC2517BM4481d2);
                c2642z3.f8411k.setValue(Boolean.FALSE);
            }
            InterfaceC1347Y interfaceC1347YM2633w = AbstractC1385s.m2633w(interfaceC1603e, c1383r);
            Object objM4593c = c2642z3.m4593c();
            C1366i0 c1366i02 = c2642z3.f8404d;
            Object objMo0g = interfaceC1603e.mo0g(objM4593c, c1366i02.getValue());
            boolean zM2582f2 = c1383r.m2582f(c2642z3) | c1383r.m2582f(interfaceC1347YM2633w);
            Object objM2558L4 = c1383r.m2558L();
            InterfaceC1046d interfaceC1046d = null;
            if (zM2582f2 || objM2558L4 == c1357e2) {
                objM2558L4 = new C0466k(c2642z3, interfaceC1347YM2633w, interfaceC1046d, 7);
                c1383r.m2585g0(objM2558L4);
            }
            InterfaceC1603e interfaceC1603e2 = (InterfaceC1603e) objM2558L4;
            Object objM2558L5 = c1383r.m2558L();
            if (objM2558L5 == c1357e2) {
                objM2558L5 = AbstractC1385s.m2629s(objMo0g);
                c1383r.m2585g0(objM2558L5);
            }
            InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) objM2558L5;
            boolean zM2586h = c1383r.m2586h(interfaceC1603e2);
            Object objM2558L6 = c1383r.m2558L();
            if (zM2586h || objM2558L6 == c1357e2) {
                objM2558L6 = new C0466k(interfaceC1603e2, interfaceC1347Y, interfaceC1046d, 4);
                c1383r.m2585g0(objM2558L6);
            }
            AbstractC1385s.m2615e(c1383r, (InterfaceC1603e) objM2558L6, C0891q.f2780a);
            Object objM4593c2 = c2642z3.m4593c();
            EnumC2517B enumC2517B = EnumC2517B.f8041f;
            if (objM4593c2 == enumC2517B && c1366i02.getValue() == enumC2517B && ((Boolean) interfaceC1347Y.getValue()).booleanValue()) {
                c1383r.m2568W(-272333293);
                c1383r.m2597p(false);
                c1843e3 = c1843e;
                z6 = false;
            } else {
                c1383r.m2568W(-231383533);
                boolean z10 = i12 == 4;
                Object objM2558L7 = c1383r.m2558L();
                if (z10 || objM2558L7 == c1357e2) {
                    objM2558L7 = new C2565y();
                    c1383r.m2585g0(objM2558L7);
                }
                C2565y c2565y = (C2565y) objM2558L7;
                C2652e0 c2652e0 = AbstractC2523H.f8063a;
                C2652e0 c2652e02 = AbstractC2649d.f8452p;
                Object objM2558L8 = c1383r.m2558L();
                if (objM2558L8 == c1357e2) {
                    objM2558L8 = C2521F.f8060e;
                    c1383r.m2585g0(objM2558L8);
                }
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) objM2558L8;
                boolean zM2582f3 = c1383r.m2582f(c2642z3);
                Object objM2558L9 = c1383r.m2558L();
                if (zM2582f3 || objM2558L9 == c1357e2) {
                    objM2558L9 = AbstractC1385s.m2629s(c2528m);
                    c1383r.m2585g0(objM2558L9);
                }
                InterfaceC1347Y interfaceC1347Y2 = (InterfaceC1347Y) objM2558L9;
                Object objM4593c3 = c2642z3.m4593c();
                Object value2 = c1366i02.getValue();
                EnumC2517B enumC2517B2 = EnumC2517B.f8040e;
                if (objM4593c3 == value2 && c2642z3.m4593c() == enumC2517B2) {
                    if (c2642z3.m4597g()) {
                        interfaceC1347Y2.setValue(c2528m);
                    } else {
                        interfaceC1347Y2.setValue(C2528M.f8088b);
                    }
                } else if (c1366i02.getValue() == enumC2517B2) {
                    interfaceC1347Y2.setValue(((C2528M) interfaceC1347Y2.getValue()).m4468a(c2528m));
                }
                C2528M c2528m3 = (C2528M) interfaceC1347Y2.getValue();
                boolean zM2582f4 = c1383r.m2582f(c2642z3);
                Object objM2558L10 = c1383r.m2558L();
                if (zM2582f4 || objM2558L10 == c1357e2) {
                    objM2558L10 = AbstractC1385s.m2629s(c2529n);
                    c1383r.m2585g0(objM2558L10);
                }
                InterfaceC1347Y interfaceC1347Y3 = (InterfaceC1347Y) objM2558L10;
                if (c2642z3.m4593c() == c1366i02.getValue() && c2642z3.m4593c() == enumC2517B2) {
                    if (c2642z3.m4597g()) {
                        interfaceC1347Y3.setValue(c2529n);
                    } else {
                        interfaceC1347Y3.setValue(C2529N.f8090b);
                    }
                } else if (c1366i02.getValue() != enumC2517B2) {
                    interfaceC1347Y3.setValue(((C2529N) interfaceC1347Y3.getValue()).m4469a(c2529n));
                }
                C2529N c2529n3 = (C2529N) interfaceC1347Y3.getValue();
                C2540Z c2540z = c2528m3.f8089a;
                C2540Z c2540z2 = c2529n3.f8092a;
                if ((c2540z.f8108b == null && c2540z2.f8108b == null) ? false : true) {
                    c1383r.m2568W(133792645);
                    Object objM2558L11 = c1383r.m2558L();
                    if (objM2558L11 == c1357e2) {
                        objM2558L11 = "Built-in slide";
                        c1383r.m2585g0("Built-in slide");
                    }
                    c2642z2 = c2642z3;
                    c2528m2 = c2528m3;
                    c1357e = c1357e2;
                    z5 = true;
                    z6 = false;
                    C2636T c2636tM4607a2 = AbstractC2648c0.m4607a(c2642z2, c2652e02, (String) objM2558L11, c1383r, 384, 0);
                    c1383r.m2597p(false);
                    c2636t = c2636tM4607a2;
                } else {
                    c2642z2 = c2642z3;
                    c2528m2 = c2528m3;
                    c1357e = c1357e2;
                    z5 = true;
                    z6 = false;
                    c1383r.m2568W(133898448);
                    c1383r.m2597p(false);
                    c2636t = null;
                }
                c1383r.m2568W(134101063);
                c1383r.m2597p(z6);
                c1383r.m2568W(134345095);
                c1383r.m2597p(z6);
                boolean z11 = !false;
                float[] fArr = C2873d.f9071a;
                c1383r.m2568W(135150476);
                c1383r.m2597p(z6);
                C2652e0 c2652e03 = AbstractC2649d.f8446j;
                boolean z12 = (c2540z.f8107a == null && c2540z2.f8107a == null) ? z6 : z5;
                boolean z13 = (c2540z.f8109c == null && c2540z2.f8109c == null) ? z6 : z5;
                if (z12) {
                    c1383r.m2568W(-703879421);
                    Object objM2558L12 = c1383r.m2558L();
                    if (objM2558L12 == c1357e) {
                        objM2558L12 = "Built-in alpha";
                        c1383r.m2585g0("Built-in alpha");
                    }
                    z7 = z11;
                    C2636T c2636tM4607a3 = AbstractC2648c0.m4607a(c2642z2, c2652e03, (String) objM2558L12, c1383r, 384, 0);
                    c1383r.m2597p(z6);
                    c2636t2 = c2636tM4607a3;
                } else {
                    z7 = z11;
                    c1383r.m2568W(-703709976);
                    c1383r.m2597p(z6);
                    c2636t2 = null;
                }
                if (z13) {
                    c1383r.m2568W(-703642333);
                    Object objM2558L13 = c1383r.m2558L();
                    if (objM2558L13 == c1357e) {
                        objM2558L13 = "Built-in scale";
                        c1383r.m2585g0("Built-in scale");
                    }
                    c2636t3 = c2636t2;
                    C2636T c2636tM4607a4 = AbstractC2648c0.m4607a(c2642z2, c2652e03, (String) objM2558L13, c1383r, 384, 0);
                    c1383r.m2597p(z6);
                    c2636t4 = c2636tM4607a4;
                } else {
                    c2636t3 = c2636t2;
                    c1383r.m2568W(-703472888);
                    c1383r.m2597p(z6);
                    c2636t4 = null;
                }
                if (z13) {
                    c1383r.m2568W(-703395232);
                    c2636t5 = c2636t4;
                    c2636tM4607a = AbstractC2648c0.m4607a(c2642z2, AbstractC2523H.f8063a, "TransformOriginInterruptionHandling", c1383r, 384, 0);
                    c1383r.m2597p(z6);
                } else {
                    c2636t5 = c2636t4;
                    c1383r.m2568W(-703222904);
                    c1383r.m2597p(z6);
                    c2636tM4607a = null;
                }
                boolean zM2586h2 = c1383r.m2586h(c2636t3) | c1383r.m2582f(c2528m2) | c1383r.m2582f(c2529n3) | c1383r.m2586h(c2636t5) | c1383r.m2582f(c2642z2) | c1383r.m2586h(c2636tM4607a);
                Object objM2558L14 = c1383r.m2558L();
                if (zM2586h2 || objM2558L14 == c1357e) {
                    c2529n2 = c2529n3;
                    objM2558L14 = new C2519D(c2636t3, c2636t5, c2642z2, c2528m2, c2529n2, c2636tM4607a);
                    c1383r.m2585g0(objM2558L14);
                } else {
                    c2529n2 = c2529n3;
                }
                C2519D c2519d = (C2519D) objM2558L14;
                boolean zM2584g = c1383r.m2584g(z7) | c1383r.m2582f(interfaceC1599a);
                Object objM2558L15 = c1383r.m2558L();
                if (zM2584g || objM2558L15 == c1357e) {
                    objM2558L15 = new C2522G(z7, interfaceC1599a);
                    c1383r.m2585g0(objM2558L15);
                }
                C2204m c2204m = C2204m.f7185a;
                InterfaceC2207p interfaceC2207pMo4021c = AbstractC2767z.m4941l(c2204m, (InterfaceC1601c) objM2558L15).mo4021c(new C2518C(c2642z2, null, null, c2636t, c2528m2, c2529n2, interfaceC1599a, c2519d)).mo4021c(c2204m);
                c1383r.m2568W(-7432681);
                c1383r.m2597p(z6);
                InterfaceC2207p interfaceC2207pMo4021c2 = interfaceC2207p.mo4021c(interfaceC2207pMo4021c.mo4021c(c2204m));
                Object objM2558L16 = c1383r.m2558L();
                if (objM2558L16 == c1357e) {
                    objM2558L16 = new C2560t(c2565y);
                    c1383r.m2585g0(objM2558L16);
                }
                C2560t c2560t = (C2560t) objM2558L16;
                int iHashCode = Long.hashCode(c1383r.f4882T);
                InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
                InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207pMo4021c2);
                InterfaceC0593g.f1909a.getClass();
                C0551B c0551b = C0591f.f1902b;
                c1383r.m2571Z();
                if (c1383r.f4881S) {
                    c1383r.m2592k(c0551b);
                } else {
                    c1383r.m2591j0();
                }
                AbstractC1385s.m2635y(c1383r, C0591f.f1905e, c2560t);
                AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
                AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
                AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
                AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
                C1843e c1843e5 = c1843e;
                c1843e5.mo5f(c2565y, c1383r, Integer.valueOf((i7 >> 18) & 112));
                c1383r.m2597p(z5);
                c1383r.m2597p(z6);
                c1843e3 = c1843e5;
            }
            c1383r.m2597p(z6);
            c1843e2 = c1843e3;
        } else {
            c1383r.m2568W(-272333293);
            c1383r.m2597p(false);
            c1843e2 = c1843e4;
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C2561u(c2642z, interfaceC1601c, interfaceC2207p, c2528m, c2529n, interfaceC1603e, c1843e2, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m4479b(C2620C c2620c, InterfaceC2207p interfaceC2207p, C2528M c2528m, C2529N c2529n, String str, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        InterfaceC2207p interfaceC2207p2;
        String str2;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(657024243);
        int i6 = i5 | (c1383r.m2582f(c2620c) ? 4 : 2) | 48 | (c1383r.m2582f(c2529n) ? 2048 : 1024) | 24576;
        boolean z5 = true;
        if (c1383r.m2560O(i6 & 1, (74899 & i6) != 74898)) {
            int i7 = (i6 & 14) | 48;
            int i8 = AbstractC2648c0.f8436a;
            if ((((i7 & 14) ^ 6) <= 4 || !c1383r.m2582f(c2620c)) && (i7 & 6) != 4) {
                z5 = false;
            }
            Object objM2558L = c1383r.m2558L();
            Object obj = C1371l.f4833a;
            if (z5 || objM2558L == obj) {
                AbstractC2074f abstractC2074fM3853e = AbstractC2086r.m3853e();
                InterfaceC1601c interfaceC1601cMo3789e = abstractC2074fM3853e != null ? abstractC2074fM3853e.mo3789e() : null;
                AbstractC2074f abstractC2074fM3856h = AbstractC2086r.m3856h(abstractC2074fM3853e);
                try {
                    Object c2642z = new C2642Z(c2620c, null, "AnimatedVisibility");
                    AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
                    c1383r.m2585g0(c2642z);
                    objM2558L = c2642z;
                } catch (Throwable th) {
                    AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
                    throw th;
                }
            }
            C2642Z c2642z2 = (C2642Z) objM2558L;
            c1383r.m2568W(-1357145920);
            c2642z2.m4591a(c2620c.f8330c.getValue(), c1383r, 0);
            c1383r.m2597p(false);
            boolean zM2582f = c1383r.m2582f(c2642z2);
            Object objM2558L2 = c1383r.m2558L();
            if (zM2582f || objM2558L2 == obj) {
                objM2558L2 = new C2644a0(c2642z2, 0);
                c1383r.m2585g0(objM2558L2);
            }
            AbstractC1385s.m2613c(c2642z2, (InterfaceC1601c) objM2558L2, c1383r);
            Object objM2558L3 = c1383r.m2558L();
            if (objM2558L3 == obj) {
                objM2558L3 = C2543c.f8116g;
                c1383r.m2585g0(objM2558L3);
            }
            m4480c(c2642z2, (InterfaceC1601c) objM2558L3, c2528m, c2529n, c1843e, c1383r, ((i6 << 3) & 57344) | 200112);
            interfaceC2207p2 = C2204m.f7185a;
            str2 = "AnimatedVisibility";
        } else {
            c1383r.m2563R();
            interfaceC2207p2 = interfaceC2207p;
            str2 = str;
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C2547g(c2620c, interfaceC2207p2, c2528m, c2529n, str2, c1843e, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m4480c(C2642Z c2642z, InterfaceC1601c interfaceC1601c, C2528M c2528m, C2529N c2529n, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        C1843e c1843e2;
        C2529N c2529n2;
        C2528M c2528m2;
        InterfaceC1601c interfaceC1601c2;
        C2642Z c2642z2;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1706321816);
        int i6 = (c1383r.m2582f(c2642z) ? 4 : 2) | i5;
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2582f(C2204m.f7185a) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= c1383r.m2582f(c2528m) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= c1383r.m2582f(c2529n) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 131072 : 65536;
        }
        if (c1383r.m2560O(i6 & 1, (74899 & i6) != 74898)) {
            int i7 = i6 & 14;
            boolean z5 = i7 == 4;
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (z5 || objM2558L == c1357e) {
                objM2558L = new C2562v(interfaceC1601c, c2642z);
                c1383r.m2585g0(objM2558L);
            }
            InterfaceC2207p interfaceC2207pM695h = AbstractC0435z.m695h((InterfaceC1604f) objM2558L);
            Object objM2558L2 = c1383r.m2558L();
            if (objM2558L2 == c1357e) {
                objM2558L2 = C2549i.f8150g;
                c1383r.m2585g0(objM2558L2);
            }
            m4478a(c2642z, interfaceC1601c, interfaceC2207pM695h, c2528m, c2529n, (InterfaceC1603e) objM2558L2, c1843e, c1383r, i7 | 196656 | (i6 & 7168) | (57344 & i6) | ((i6 << 6) & 29360128));
            c2642z2 = c2642z;
            interfaceC1601c2 = interfaceC1601c;
            c2528m2 = c2528m;
            c2529n2 = c2529n;
            c1843e2 = c1843e;
        } else {
            c1843e2 = c1843e;
            c2529n2 = c2529n;
            c2528m2 = c2528m;
            interfaceC1601c2 = interfaceC1601c;
            c2642z2 = c2642z;
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C2548h(c2642z2, interfaceC1601c2, c2528m2, c2529n2, c1843e2, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final EnumC2517B m4481d(C2642Z c2642z, InterfaceC1601c interfaceC1601c, Object obj, InterfaceC1373m interfaceC1373m) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2564S(-422486745, 0, c2642z, null);
        boolean zM4597g = c2642z.m4597g();
        EnumC2517B enumC2517B = EnumC2517B.f8039d;
        EnumC2517B enumC2517B2 = EnumC2517B.f8041f;
        EnumC2517B enumC2517B3 = EnumC2517B.f8040e;
        if (zM4597g) {
            c1383r.m2568W(-212166497);
            c1383r.m2597p(false);
            if (((Boolean) interfaceC1601c.mo1h(obj)).booleanValue()) {
                enumC2517B = enumC2517B3;
            } else if (((Boolean) interfaceC1601c.mo1h(c2642z.m4593c())).booleanValue()) {
                enumC2517B = enumC2517B2;
            }
        } else {
            c1383r.m2568W(-211892364);
            Object objM2558L = c1383r.m2558L();
            if (objM2558L == C1371l.f4833a) {
                objM2558L = AbstractC1385s.m2629s(Boolean.FALSE);
                c1383r.m2585g0(objM2558L);
            }
            InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) objM2558L;
            if (((Boolean) interfaceC1601c.mo1h(c2642z.m4593c())).booleanValue()) {
                interfaceC1347Y.setValue(Boolean.TRUE);
            }
            if (((Boolean) interfaceC1601c.mo1h(obj)).booleanValue()) {
                enumC2517B = enumC2517B3;
            } else if (((Boolean) interfaceC1347Y.getValue()).booleanValue()) {
                enumC2517B = enumC2517B2;
            }
            c1383r.m2597p(false);
        }
        c1383r.m2597p(false);
        return enumC2517B;
    }
}
