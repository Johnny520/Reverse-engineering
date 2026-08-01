package ec;

import p145jc.AbstractC3803e0;
import p145jc.AbstractC3829t;

/* JADX INFO: renamed from: ec.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2189u0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f6015a = AbstractC3803e0.m15157f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2201x0 f6016b = m7912b();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2201x0 m7911a() {
        return f6016b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC2201x0 m7912b() {
        if (!f6015a) {
            return RunnableC2185t0.f6009y;
        }
        AbstractC2135g2 abstractC2135g2M7728c = C2122d1.m7728c();
        return (AbstractC3829t.m15260c(abstractC2135g2M7728c) || !(abstractC2135g2M7728c instanceof InterfaceC2201x0)) ? RunnableC2185t0.f6009y : (InterfaceC2201x0) abstractC2135g2M7728c;
    }
}
