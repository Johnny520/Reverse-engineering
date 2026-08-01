package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class zc0 {

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater f5534b = AtomicReferenceFieldUpdater.newUpdater(zc0.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c */
    public static final AtomicIntegerFieldUpdater f5535c = AtomicIntegerFieldUpdater.newUpdater(zc0.class, "producerIndex");

    /* JADX INFO: renamed from: d */
    public static final AtomicIntegerFieldUpdater f5536d = AtomicIntegerFieldUpdater.newUpdater(zc0.class, "consumerIndex");

    /* JADX INFO: renamed from: e */
    public static final AtomicIntegerFieldUpdater f5537e = AtomicIntegerFieldUpdater.newUpdater(zc0.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f5538a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    /* JADX INFO: renamed from: a */
    public final u50 m2800a() {
        u50 u50Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5536d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f5535c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (u50Var = (u50) this.f5538a.getAndSet(i2, null)) != null) {
                if (u50Var.f4669b.f4807a == 1) {
                    f5537e.decrementAndGet(this);
                }
                return u50Var;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final u50 m2801b(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f5538a;
        u50 u50Var = (u50) atomicReferenceArray.get(i2);
        if (u50Var != null) {
            if ((u50Var.f4669b.f4807a == 1) == z) {
                while (!atomicReferenceArray.compareAndSet(i2, u50Var, null)) {
                    if (atomicReferenceArray.get(i2) != u50Var) {
                    }
                }
                if (z) {
                    f5537e.decrementAndGet(this);
                }
                return u50Var;
            }
        }
        return null;
    }
}
