package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gl extends p2 {
    public final Thread k;
    public final lg0 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gl(a20 a20Var, Thread thread, lg0 lg0Var) {
        super(a20Var, true);
        this.k = thread;
        this.l = lg0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r21
    public final void x(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.k;
        if (t11.l(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
