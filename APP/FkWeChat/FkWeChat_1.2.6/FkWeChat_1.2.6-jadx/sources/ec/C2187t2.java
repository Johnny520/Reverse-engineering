package ec;

import p145jc.AbstractC3817l0;
import p145jc.C3801d0;

/* JADX INFO: renamed from: ec.t2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2187t2 {

    /* JADX INFO: renamed from: a */
    public static final C2187t2 f6012a = new C2187t2();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f6013b = AbstractC3817l0.m15201a(new C3801d0("ThreadLocalEventLoop"));

    /* JADX INFO: renamed from: a */
    public final AbstractC2142i1 m7907a() {
        return (AbstractC2142i1) f6013b.get();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2142i1 m7908b() {
        ThreadLocal threadLocal = f6013b;
        AbstractC2142i1 abstractC2142i1 = (AbstractC2142i1) threadLocal.get();
        if (abstractC2142i1 != null) {
            return abstractC2142i1;
        }
        AbstractC2142i1 abstractC2142i1M7829a = AbstractC2154l1.m7829a();
        threadLocal.set(abstractC2142i1M7829a);
        return abstractC2142i1M7829a;
    }

    /* JADX INFO: renamed from: c */
    public final void m7909c() {
        f6013b.set(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m7910d(AbstractC2142i1 abstractC2142i1) {
        f6013b.set(abstractC2142i1);
    }
}
