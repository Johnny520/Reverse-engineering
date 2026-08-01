package p000;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ma */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0467ma extends AbstractC0708s {

    /* JADX INFO: renamed from: i */
    public final Thread f3892i;

    /* JADX INFO: renamed from: j */
    public final AbstractC0030at f3893j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0467ma(InterfaceC0618pk interfaceC0618pk, Thread thread, AbstractC0030at abstractC0030at) {
        super(interfaceC0618pk, true);
        this.f3892i = thread;
        this.f3893j = abstractC0030at;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j40
    /* JADX INFO: renamed from: y */
    public final void mo1172y(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f3892i;
        if (p30.m3002l(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
