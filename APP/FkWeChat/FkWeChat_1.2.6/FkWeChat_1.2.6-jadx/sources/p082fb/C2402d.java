package p082fb;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: fb.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2402d implements InterfaceC2409k {

    /* JADX INFO: renamed from: b */
    public final Lock f6513b;

    public /* synthetic */ C2402d(Lock lock, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }

    /* JADX INFO: renamed from: a */
    public final Lock m8652a() {
        return this.f6513b;
    }

    @Override // p082fb.InterfaceC2409k
    public void lock() {
        this.f6513b.lock();
    }

    @Override // p082fb.InterfaceC2409k
    public void unlock() {
        this.f6513b.unlock();
    }

    public C2402d(Lock lock) {
        lock.getClass();
        this.f6513b = lock;
    }
}
