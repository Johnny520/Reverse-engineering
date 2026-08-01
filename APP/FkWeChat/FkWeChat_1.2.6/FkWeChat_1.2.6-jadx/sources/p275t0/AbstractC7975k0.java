package p275t0;

import p010a9.InterfaceC0184l;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p277t2.InterfaceC8074h0;

/* JADX INFO: renamed from: t0.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7975k0 {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m30743a(InterfaceC8074h0 interfaceC8074h0) {
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4507m m30744b(InterfaceC4507m interfaceC4507m, InterfaceC0184l interfaceC0184l) {
        return interfaceC4507m.mo17445i(new C7988o0(interfaceC0184l));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC4507m m30745c(InterfaceC4507m interfaceC4507m, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0184l = new InterfaceC0184l() { // from class: t0.j0
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj2) {
                    return AbstractC7975k0.m30743a((InterfaceC8074h0) obj2);
                }
            };
        }
        return m30744b(interfaceC4507m, interfaceC0184l);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC4507m m30746d(InterfaceC4507m interfaceC4507m, InterfaceC0184l interfaceC0184l) {
        return interfaceC4507m.mo17445i(new C7960g1(interfaceC0184l));
    }
}
