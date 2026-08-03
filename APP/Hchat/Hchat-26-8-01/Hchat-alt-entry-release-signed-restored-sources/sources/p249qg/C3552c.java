package p249qg;

import gg.AbstractC1416l;
import java.util.concurrent.locks.LockSupport;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: qg.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3552c extends AbstractC3546a {

    /* JADX INFO: renamed from: j */
    public final Thread f11553j;

    /* JADX INFO: renamed from: k */
    public final AbstractC3565g0 f11554k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3552c(InterfaceC5561g interfaceC5561g, Thread thread, AbstractC3565g0 abstractC3565g0) {
        super(interfaceC5561g, true);
        this.f11553j = thread;
        this.f11554k = abstractC3565g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3610y0
    /* JADX INFO: renamed from: r */
    public final void mo7474r(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f11553j;
        if (AbstractC1416l.m3825a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
