package Yue;

import Yue.AbstractC4715;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4718 extends AbstractC4714 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ */
    public abstract Thread mo9507();

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ */
    public void mo12588(long j, @InterfaceC6399 AbstractC4715.AbstractRunnableC4716 abstractRunnableC4716) {
        RunnableC4337.f8898.m14097(j, abstractRunnableC4716);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public final void m14107() {
        C8107 c8107;
        Thread threadMo9507 = mo9507();
        if (Thread.currentThread() != threadMo9507) {
            AbstractC3018 abstractC3018M84 = C3019.m84();
            if (abstractC3018M84 != null) {
                abstractC3018M84.m5896(threadMo9507);
                c8107 = C8107.f3222;
            } else {
                c8107 = null;
            }
            if (c8107 == null) {
                LockSupport.unpark(threadMo9507);
            }
        }
    }
}
