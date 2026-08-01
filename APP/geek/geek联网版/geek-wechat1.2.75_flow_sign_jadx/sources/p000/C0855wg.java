package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: wg */
/* JADX INFO: loaded from: classes.dex */
public final class C0855wg extends d20 {

    /* JADX INFO: renamed from: e */
    public static final AtomicIntegerFieldUpdater f5098e = AtomicIntegerFieldUpdater.newUpdater(C0855wg.class, "_decision");
    private volatile int _decision;

    @Override // p000.d20, p000.C0040aq
    /* JADX INFO: renamed from: k */
    public final void mo452k(Object obj) {
        mo453l(obj);
    }

    @Override // p000.d20, p000.C0040aq
    /* JADX INFO: renamed from: l */
    public final void mo453l(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f5098e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                g80.m1177H(AbstractC0493mp.m1870u(this.f1292d), g80.m1176G(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
