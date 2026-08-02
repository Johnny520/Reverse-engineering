package p000;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: gl */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0244gl extends AbstractC0565p2 {

    /* JADX INFO: renamed from: k */
    public final Thread f3567k;

    /* JADX INFO: renamed from: l */
    public final lg0 f3568l;

    public C0244gl(a20 a20Var, Thread thread, lg0 lg0Var) {
        super(a20Var, true);
        this.f3567k = thread;
        this.f3568l = lg0Var;
    }

    @Override // p000.r21
    /* JADX INFO: renamed from: x */
    public final void mo1937x(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f3567k;
        if (t11.m5086l(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
