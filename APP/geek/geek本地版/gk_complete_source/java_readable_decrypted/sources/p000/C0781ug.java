package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: ug */
/* JADX INFO: loaded from: classes.dex */
public final class C0781ug extends w10 {

    /* JADX INFO: renamed from: e */
    public static final AtomicIntegerFieldUpdater f4729e = AtomicIntegerFieldUpdater.newUpdater(C0781ug.class, "_decision");
    private volatile int _decision;

    @Override // p000.w10, p000.C0864wp
    /* JADX INFO: renamed from: k */
    public final void mo2454k(Object obj) {
        mo2003l(obj);
    }

    @Override // p000.w10, p000.C0864wp
    /* JADX INFO: renamed from: l */
    public final void mo2003l(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f4729e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                a80.m30B(AbstractC0346ip.m1512z(this.f4903d), a80.m29A(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
