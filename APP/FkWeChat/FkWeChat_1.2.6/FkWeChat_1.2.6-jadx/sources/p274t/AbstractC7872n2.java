package p274t;

import p010a9.InterfaceC0184l;
import p055e.AbstractC1960a;
import p121i3.C3179i;
import p121i3.EnumC3191u;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p179m2.AbstractC4846g2;

/* JADX INFO: renamed from: t.n2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7872n2 {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m30440a(float f10, AbstractC4846g2 abstractC4846g2) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m30441b(float f10, float f11, AbstractC4846g2 abstractC4846g2) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static C4700i0 m30442c(float f10, float f11, float f12, float f13, AbstractC4846g2 abstractC4846g2) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static C4700i0 m30443d(InterfaceC7887q2 interfaceC7887q2, AbstractC4846g2 abstractC4846g2) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC7887q2 m30444e(float f10) {
        return new C7897s2(f10, f10, f10, f10, null);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC7887q2 m30445f(float f10, float f11) {
        return new C7897s2(f10, f11, f10, f11, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC7887q2 m30446g(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3179i.m12003k(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3179i.m12003k(0);
        }
        return m30445f(f10, f11);
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC7887q2 m30447h(float f10, float f11, float f12, float f13) {
        return new C7897s2(f10, f11, f12, f13, null);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ InterfaceC7887q2 m30448i(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3179i.m12003k(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3179i.m12003k(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3179i.m12003k(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3179i.m12003k(0);
        }
        return m30447h(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: j */
    public static final float m30449j(InterfaceC7887q2 interfaceC7887q2, EnumC3191u enumC3191u) {
        return enumC3191u == EnumC3191u.f8484q ? interfaceC7887q2.mo27242d(enumC3191u) : interfaceC7887q2.mo27240b(enumC3191u);
    }

    /* JADX INFO: renamed from: k */
    public static final float m30450k(InterfaceC7887q2 interfaceC7887q2, EnumC3191u enumC3191u) {
        return enumC3191u == EnumC3191u.f8484q ? interfaceC7887q2.mo27240b(enumC3191u) : interfaceC7887q2.mo27242d(enumC3191u);
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC4507m m30451l(InterfaceC4507m interfaceC4507m, final InterfaceC7887q2 interfaceC7887q2) {
        return interfaceC4507m.mo17445i(new C7892r2(interfaceC7887q2, new InterfaceC0184l() { // from class: t.j2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                InterfaceC7887q2 interfaceC7887q22 = interfaceC7887q2;
                AbstractC1960a.m7104a(obj);
                return AbstractC7872n2.m30443d(interfaceC7887q22, null);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC4507m m30452m(InterfaceC4507m interfaceC4507m, final float f10) {
        return interfaceC4507m.mo17445i(new C7847i2(f10, f10, f10, f10, true, new InterfaceC0184l() { // from class: t.m2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                float f11 = f10;
                AbstractC1960a.m7104a(obj);
                return AbstractC7872n2.m30440a(f11, null);
            }
        }, null));
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC4507m m30453n(InterfaceC4507m interfaceC4507m, final float f10, final float f11) {
        return interfaceC4507m.mo17445i(new C7847i2(f10, f11, f10, f11, true, new InterfaceC0184l() { // from class: t.l2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                float f12 = f10;
                float f13 = f11;
                AbstractC1960a.m7104a(obj);
                return AbstractC7872n2.m30441b(f12, f13, null);
            }
        }, null));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ InterfaceC4507m m30454o(InterfaceC4507m interfaceC4507m, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3179i.m12003k(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3179i.m12003k(0);
        }
        return m30453n(interfaceC4507m, f10, f11);
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC4507m m30455p(InterfaceC4507m interfaceC4507m, final float f10, final float f11, final float f12, final float f13) {
        return interfaceC4507m.mo17445i(new C7847i2(f10, f11, f12, f13, true, new InterfaceC0184l() { // from class: t.k2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                float f14 = f10;
                float f15 = f11;
                float f16 = f12;
                float f17 = f13;
                AbstractC1960a.m7104a(obj);
                return AbstractC7872n2.m30442c(f14, f15, f16, f17, null);
            }
        }, null));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ InterfaceC4507m m30456q(InterfaceC4507m interfaceC4507m, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3179i.m12003k(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3179i.m12003k(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3179i.m12003k(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3179i.m12003k(0);
        }
        return m30455p(interfaceC4507m, f10, f11, f12, f13);
    }
}
