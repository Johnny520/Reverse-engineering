package za;

import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p082fb.C2404f;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;

/* JADX INFO: renamed from: za.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9911i extends AbstractC9903a {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2407i f33431b;

    public C9911i(InterfaceC2412n interfaceC2412n, InterfaceC0173a interfaceC0173a) {
        interfaceC2412n.getClass();
        interfaceC0173a.getClass();
        this.f33431b = interfaceC2412n.mo8663f(new C9910h(interfaceC0173a));
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC9913k m38456k(InterfaceC0173a interfaceC0173a) {
        InterfaceC9913k interfaceC9913k = (InterfaceC9913k) interfaceC0173a.invoke();
        return interfaceC9913k instanceof AbstractC9903a ? ((AbstractC9903a) interfaceC9913k).m38417h() : interfaceC9913k;
    }

    @Override // za.AbstractC9903a
    /* JADX INFO: renamed from: i */
    public InterfaceC9913k mo38418i() {
        return (InterfaceC9913k) this.f33431b.invoke();
    }

    public /* synthetic */ C9911i(InterfaceC2412n interfaceC2412n, InterfaceC0173a interfaceC0173a, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? C2404f.f6516e : interfaceC2412n, interfaceC0173a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9911i(InterfaceC0173a interfaceC0173a) {
        this(null, interfaceC0173a, 1, 0 == true ? 1 : 0);
        interfaceC0173a.getClass();
    }
}
