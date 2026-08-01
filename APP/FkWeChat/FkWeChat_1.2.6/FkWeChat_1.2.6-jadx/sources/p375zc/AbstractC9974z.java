package p375zc;

import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: zc.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9974z {
    /* JADX INFO: renamed from: a */
    public static final AbstractC9939c m38607a(AbstractC9939c abstractC9939c, InterfaceC0184l interfaceC0184l) {
        abstractC9939c.getClass();
        interfaceC0184l.getClass();
        C9947g c9947g = new C9947g(abstractC9939c);
        interfaceC0184l.mo27m(c9947g);
        return new C9973y(c9947g.m38528a(), c9947g.m38529b());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AbstractC9939c m38608b(AbstractC9939c abstractC9939c, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC9939c = AbstractC9939c.f33487d;
        }
        return m38607a(abstractC9939c, interfaceC0184l);
    }
}
