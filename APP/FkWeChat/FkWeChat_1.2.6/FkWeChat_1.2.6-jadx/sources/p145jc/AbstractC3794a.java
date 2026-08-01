package p145jc;

import p010a9.InterfaceC0188p;

/* JADX INFO: renamed from: jc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3794a {

    /* JADX INFO: renamed from: a */
    public static final C3801d0 f10967a = new C3801d0("CLOSED");

    /* JADX INFO: renamed from: b */
    public static final AbstractC3796b m15124b(AbstractC3796b abstractC3796b) {
        while (true) {
            Object objM15138g = abstractC3796b.m15138g();
            if (objM15138g == f10967a) {
                return abstractC3796b;
            }
            AbstractC3796b abstractC3796b2 = (AbstractC3796b) objM15138g;
            if (abstractC3796b2 != null) {
                abstractC3796b = abstractC3796b2;
            } else if (abstractC3796b.m15141m()) {
                return abstractC3796b;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Object m15125c(AbstractC3795a0 abstractC3795a0, long j10, InterfaceC0188p interfaceC0188p) {
        while (true) {
            if (abstractC3795a0.f10969c >= j10 && !abstractC3795a0.mo15127k()) {
                return AbstractC3797b0.m15144a(abstractC3795a0);
            }
            Object objM15138g = abstractC3795a0.m15138g();
            if (objM15138g == f10967a) {
                return AbstractC3797b0.m15144a(f10967a);
            }
            AbstractC3795a0 abstractC3795a02 = (AbstractC3795a0) ((AbstractC3796b) objM15138g);
            if (abstractC3795a02 == null) {
                abstractC3795a02 = (AbstractC3795a0) interfaceC0188p.invoke(Long.valueOf(abstractC3795a0.f10969c + 1), abstractC3795a0);
                if (abstractC3795a0.m15143o(abstractC3795a02)) {
                    if (abstractC3795a0.mo15127k()) {
                        abstractC3795a0.m15142n();
                    }
                }
            }
            abstractC3795a0 = abstractC3795a02;
        }
    }
}
