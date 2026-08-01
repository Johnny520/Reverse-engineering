package nc;

import p145jc.AbstractC3807g0;
import p145jc.C3801d0;

/* JADX INFO: renamed from: nc.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5571j {

    /* JADX INFO: renamed from: a */
    public static final int f17444a = AbstractC3807g0.m15167e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b */
    public static final C3801d0 f17445b = new C3801d0("PERMIT");

    /* JADX INFO: renamed from: c */
    public static final C3801d0 f17446c = new C3801d0("TAKEN");

    /* JADX INFO: renamed from: d */
    public static final C3801d0 f17447d = new C3801d0("BROKEN");

    /* JADX INFO: renamed from: e */
    public static final C3801d0 f17448e = new C3801d0("CANCELLED");

    /* JADX INFO: renamed from: f */
    public static final int f17449f = AbstractC3807g0.m15167e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: renamed from: h */
    public static final C5572k m22653h(long j10, C5572k c5572k) {
        return new C5572k(j10, c5572k, 0);
    }
}
