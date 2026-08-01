package ec;

import ec.AbstractC2146j1;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ec.k1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2150k1 extends AbstractC2142i1 {
    /* JADX INFO: renamed from: V0 */
    public abstract Thread mo7755V0();

    /* JADX INFO: renamed from: W0 */
    public void mo7823W0(long j10, AbstractC2146j1.c cVar) {
        RunnableC2185t0.f6009y.m7801k1(j10, cVar);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m7824X0() {
        Thread threadMo7755V0 = mo7755V0();
        if (Thread.currentThread() != threadMo7755V0) {
            AbstractC2115c.m7635a();
            LockSupport.unpark(threadMo7755V0);
        }
    }
}
