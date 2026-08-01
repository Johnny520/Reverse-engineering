package p082fb;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: fb.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2401c extends C2402d {

    /* JADX INFO: renamed from: c */
    public final Runnable f6511c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0184l f6512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401c(Lock lock, Runnable runnable, InterfaceC0184l interfaceC0184l) {
        super(lock);
        lock.getClass();
        runnable.getClass();
        interfaceC0184l.getClass();
        this.f6511c = runnable;
        this.f6512d = interfaceC0184l;
    }

    @Override // p082fb.C2402d, p082fb.InterfaceC2409k
    public void lock() {
        while (!m8652a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f6511c.run();
            } catch (InterruptedException e10) {
                this.f6512d.mo27m(e10);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2401c(Runnable runnable, InterfaceC0184l interfaceC0184l) {
        this(new ReentrantLock(), runnable, interfaceC0184l);
        runnable.getClass();
        interfaceC0184l.getClass();
    }
}
