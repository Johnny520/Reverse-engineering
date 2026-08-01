package gb;

import p215oc.C5725t;
import p229p9.InterfaceC6018l1;

/* JADX INFO: renamed from: gb.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2661f0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC2643a2 m9372b(AbstractC2661f0 abstractC2661f0, InterfaceC6018l1 interfaceC6018l1, AbstractC2665g0 abstractC2665g0, C2731z1 c2731z1, AbstractC2706r0 abstractC2706r0, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: computeProjection");
            return null;
        }
        if ((i10 & 8) != 0) {
            abstractC2706r0 = c2731z1.m9669e(interfaceC6018l1, abstractC2665g0);
        }
        return abstractC2661f0.mo7017a(interfaceC6018l1, abstractC2665g0, c2731z1, abstractC2706r0);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC2643a2 mo7017a(InterfaceC6018l1 interfaceC6018l1, AbstractC2665g0 abstractC2665g0, C2731z1 c2731z1, AbstractC2706r0 abstractC2706r0) {
        interfaceC6018l1.getClass();
        abstractC2665g0.getClass();
        c2731z1.getClass();
        abstractC2706r0.getClass();
        return new C2651c2(EnumC2691m2.f7044w, abstractC2706r0);
    }
}
