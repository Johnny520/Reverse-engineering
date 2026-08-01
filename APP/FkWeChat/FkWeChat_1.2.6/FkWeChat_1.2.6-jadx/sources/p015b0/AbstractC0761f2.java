package p015b0;

import android.view.KeyEvent;
import p010a9.InterfaceC0184l;
import p024b9.C1038h0;
import p042d2.AbstractC1856a;
import p042d2.AbstractC1859d;
import p042d2.C1857b;

/* JADX INFO: renamed from: b0.f2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0761f2 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0754e2 f2286a = new c(m2886a(new C1038h0() { // from class: b0.f2.b
        @Override // p024b9.C1038h0, p098g9.InterfaceC2559m
        public Object get(Object obj) {
            return Boolean.valueOf(AbstractC1859d.m6609e(((C1857b) obj).m6596f()));
        }
    }));

    /* JADX INFO: renamed from: b0.f2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0754e2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0184l f2287a;

        public a(InterfaceC0184l interfaceC0184l) {
            this.f2287a = interfaceC0184l;
        }

        @Override // p015b0.InterfaceC0754e2
        /* JADX INFO: renamed from: a */
        public EnumC0740c2 mo2879a(KeyEvent keyEvent) {
            if (((Boolean) this.f2287a.mo27m(C1857b.m6591a(keyEvent))).booleanValue() && AbstractC1859d.m6610f(keyEvent)) {
                if (AbstractC1856a.m6573s(AbstractC1859d.m6605a(keyEvent), C0894y2.f2808a.m3294z())) {
                    return EnumC0740c2.f2217m0;
                }
                return null;
            }
            if (((Boolean) this.f2287a.mo27m(C1857b.m6591a(keyEvent))).booleanValue()) {
                long jM6605a = AbstractC1859d.m6605a(keyEvent);
                C0894y2 c0894y2 = C0894y2.f2808a;
                if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3272d()) || AbstractC1856a.m6573s(jM6605a, c0894y2.m3283o())) {
                    return EnumC0740c2.f2187I;
                }
                if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3291w())) {
                    return EnumC0740c2.f2188J;
                }
                if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3292x())) {
                    return EnumC0740c2.f2189K;
                }
                if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3269a())) {
                    return EnumC0740c2.f2196R;
                }
                if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3293y())) {
                    return EnumC0740c2.f2217m0;
                }
                if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3294z())) {
                    return EnumC0740c2.f2216l0;
                }
                return null;
            }
            if (AbstractC1859d.m6609e(keyEvent)) {
                return null;
            }
            if (AbstractC1859d.m6610f(keyEvent)) {
                long jM6605a2 = AbstractC1859d.m6605a(keyEvent);
                C0894y2 c0894y22 = C0894y2.f2808a;
                if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3278j())) {
                    return EnumC0740c2.f2197S;
                }
                if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3279k())) {
                    return EnumC0740c2.f2198T;
                }
                if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3280l())) {
                    return EnumC0740c2.f2199U;
                }
                if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3277i())) {
                    return EnumC0740c2.f2200V;
                }
                if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3288t())) {
                    return EnumC0740c2.f2201W;
                }
                if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3287s())) {
                    return EnumC0740c2.f2202X;
                }
                if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3285q())) {
                    return EnumC0740c2.f2209e0;
                }
                if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3284p())) {
                    return EnumC0740c2.f2210f0;
                }
                if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3283o())) {
                    return EnumC0740c2.f2188J;
                }
                return null;
            }
            long jM6605a3 = AbstractC1859d.m6605a(keyEvent);
            C0894y2 c0894y23 = C0894y2.f2808a;
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3278j())) {
                return EnumC0740c2.f2221r;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3279k())) {
                return EnumC0740c2.f2222s;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3280l())) {
                return EnumC0740c2.f2180B;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3277i())) {
                return EnumC0740c2.f2181C;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3276h())) {
                return EnumC0740c2.f2182D;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3288t())) {
                return EnumC0740c2.f2183E;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3287s())) {
                return EnumC0740c2.f2184F;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3285q())) {
                return EnumC0740c2.f2227x;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3284p())) {
                return EnumC0740c2.f2228y;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3281m()) || AbstractC1856a.m6573s(jM6605a3, c0894y23.m3286r())) {
                return EnumC0740c2.f2214j0;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3271c())) {
                return EnumC0740c2.f2190L;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3275g())) {
                return EnumC0740c2.f2191M;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3289u())) {
                return EnumC0740c2.f2188J;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3274f())) {
                return EnumC0740c2.f2189K;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3273e())) {
                return EnumC0740c2.f2187I;
            }
            if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3290v())) {
                return EnumC0740c2.f2215k0;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b0.f2$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC0754e2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0754e2 f2289a;

        public c(InterfaceC0754e2 interfaceC0754e2) {
            this.f2289a = interfaceC0754e2;
        }

        @Override // p015b0.InterfaceC0754e2
        /* JADX INFO: renamed from: a */
        public EnumC0740c2 mo2879a(KeyEvent keyEvent) {
            EnumC0740c2 enumC0740c2 = null;
            if (AbstractC1859d.m6610f(keyEvent) && AbstractC1859d.m6609e(keyEvent)) {
                long jM6605a = AbstractC1859d.m6605a(keyEvent);
                C0894y2 c0894y2 = C0894y2.f2808a;
                if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3278j())) {
                    enumC0740c2 = EnumC0740c2.f2205a0;
                } else if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3279k())) {
                    enumC0740c2 = EnumC0740c2.f2206b0;
                } else if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3280l())) {
                    enumC0740c2 = EnumC0740c2.f2208d0;
                } else if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3277i())) {
                    enumC0740c2 = EnumC0740c2.f2207c0;
                }
            } else if (AbstractC1859d.m6609e(keyEvent)) {
                long jM6605a2 = AbstractC1859d.m6605a(keyEvent);
                C0894y2 c0894y22 = C0894y2.f2808a;
                if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3278j())) {
                    enumC0740c2 = EnumC0740c2.f2224u;
                } else if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3279k())) {
                    enumC0740c2 = EnumC0740c2.f2223t;
                } else if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3280l())) {
                    enumC0740c2 = EnumC0740c2.f2226w;
                } else if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3277i())) {
                    enumC0740c2 = EnumC0740c2.f2225v;
                } else if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3282n())) {
                    enumC0740c2 = EnumC0740c2.f2190L;
                } else if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3275g())) {
                    enumC0740c2 = EnumC0740c2.f2193O;
                } else if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3271c())) {
                    enumC0740c2 = EnumC0740c2.f2192N;
                } else if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3270b())) {
                    enumC0740c2 = EnumC0740c2.f2213i0;
                }
            } else if (AbstractC1859d.m6610f(keyEvent)) {
                long jM6605a3 = AbstractC1859d.m6605a(keyEvent);
                C0894y2 c0894y23 = C0894y2.f2808a;
                if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3285q())) {
                    enumC0740c2 = EnumC0740c2.f2209e0;
                } else if (AbstractC1856a.m6573s(jM6605a3, c0894y23.m3284p())) {
                    enumC0740c2 = EnumC0740c2.f2210f0;
                }
            } else if (AbstractC1859d.m6608d(keyEvent)) {
                long jM6605a4 = AbstractC1859d.m6605a(keyEvent);
                C0894y2 c0894y24 = C0894y2.f2808a;
                if (AbstractC1856a.m6573s(jM6605a4, c0894y24.m3271c())) {
                    enumC0740c2 = EnumC0740c2.f2194P;
                } else if (AbstractC1856a.m6573s(jM6605a4, c0894y24.m3275g())) {
                    enumC0740c2 = EnumC0740c2.f2195Q;
                }
            }
            return enumC0740c2 == null ? this.f2289a.mo2879a(keyEvent) : enumC0740c2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0754e2 m2886a(InterfaceC0184l interfaceC0184l) {
        return new a(interfaceC0184l);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0754e2 m2887b() {
        return f2286a;
    }
}
