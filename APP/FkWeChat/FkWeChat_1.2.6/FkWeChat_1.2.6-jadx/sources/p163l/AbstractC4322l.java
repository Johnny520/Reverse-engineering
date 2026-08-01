package p163l;

import p010a9.InterfaceC0184l;
import p163l.C4383x0;

/* JADX INFO: renamed from: l.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4322l {
    /* JADX INFO: renamed from: b */
    public static final AbstractC4357s m16966b(InterfaceC4365t2 interfaceC4365t2, Object obj) {
        if (obj == null) {
            return null;
        }
        return (AbstractC4357s) interfaceC4365t2.mo17122a().mo27m(obj);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4317k m16967c(InterfaceC4317k interfaceC4317k, long j10) {
        return new C4329m1(interfaceC4317k, j10);
    }

    /* JADX INFO: renamed from: d */
    public static final C4338o0 m16968d(InterfaceC4283d0 interfaceC4283d0, EnumC4299g1 enumC4299g1, long j10) {
        return new C4338o0(interfaceC4283d0, enumC4299g1, j10, null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C4338o0 m16969e(InterfaceC4283d0 interfaceC4283d0, EnumC4299g1 enumC4299g1, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC4299g1 = EnumC4299g1.f12621q;
        }
        if ((i10 & 4) != 0) {
            j10 = AbstractC4339o1.m17041c(0, 0, 2, null);
        }
        return m16968d(interfaceC4283d0, enumC4299g1, j10);
    }

    /* JADX INFO: renamed from: f */
    public static final C4383x0 m16970f(InterfaceC0184l interfaceC0184l) {
        C4383x0.b bVar = new C4383x0.b();
        interfaceC0184l.mo27m(bVar);
        return new C4383x0(bVar);
    }

    /* JADX INFO: renamed from: g */
    public static final C4309i1 m16971g(int i10) {
        return new C4309i1(i10);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C4309i1 m16972h(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return m16971g(i10);
    }

    /* JADX INFO: renamed from: i */
    public static final C4324l1 m16973i(float f10, float f11, Object obj) {
        return new C4324l1(f10, f11, obj);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C4324l1 m16974j(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return m16973i(f10, f11, obj);
    }

    /* JADX INFO: renamed from: k */
    public static final C4360s2 m16975k(int i10, int i11, InterfaceC4288e0 interfaceC4288e0) {
        return new C4360s2(i10, i11, interfaceC4288e0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C4360s2 m16976l(int i10, int i11, InterfaceC4288e0 interfaceC4288e0, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            interfaceC4288e0 = AbstractC4298g0.m16928c();
        }
        return m16975k(i10, i11, interfaceC4288e0);
    }
}
