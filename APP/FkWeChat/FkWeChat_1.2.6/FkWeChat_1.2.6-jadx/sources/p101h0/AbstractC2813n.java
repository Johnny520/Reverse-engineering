package p101h0;

import p010a9.InterfaceC0184l;
import p135j2.AbstractC3581x;
import p135j2.InterfaceC3578w;
import p165l1.InterfaceC4507m;
import p250r1.AbstractC6458h;
import p250r1.C6457g;

/* JADX INFO: renamed from: h0.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2813n {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC4507m m10014a(InterfaceC4507m interfaceC4507m, AbstractC2816q abstractC2816q, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0184l interfaceC0184l3) {
        return interfaceC4507m.mo17445i(new C2812m(abstractC2816q, interfaceC0184l, interfaceC0184l2, interfaceC0184l3));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC4507m m10015b(InterfaceC4507m interfaceC4507m, AbstractC2816q abstractC2816q, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0184l interfaceC0184l3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC0184l = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC0184l2 = null;
        }
        return m10014a(interfaceC4507m, abstractC2816q, interfaceC0184l, interfaceC0184l2, interfaceC0184l3);
    }

    /* JADX INFO: renamed from: c */
    public static final C6457g m10016c(C6457g c6457g, InterfaceC3578w interfaceC3578w, InterfaceC3578w interfaceC3578w2) {
        if (!interfaceC3578w.mo13245d() || !interfaceC3578w2.mo13245d()) {
            return C6457g.f20319e.m25594a();
        }
        return AbstractC6458h.m25597c(interfaceC3578w2.mo13253v(AbstractC3581x.m13415f(interfaceC3578w), c6457g.m25587p()), c6457g.m25585n());
    }
}
