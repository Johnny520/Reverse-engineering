package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ed0 {

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater f1578b = AtomicReferenceFieldUpdater.newUpdater(ed0.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c */
    public static final AtomicIntegerFieldUpdater f1579c = AtomicIntegerFieldUpdater.newUpdater(ed0.class, "producerIndex");

    /* JADX INFO: renamed from: d */
    public static final AtomicIntegerFieldUpdater f1580d = AtomicIntegerFieldUpdater.newUpdater(ed0.class, "consumerIndex");

    /* JADX INFO: renamed from: e */
    public static final AtomicIntegerFieldUpdater f1581e = AtomicIntegerFieldUpdater.newUpdater(ed0.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f1582a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    /* JADX INFO: renamed from: a */
    public final a60 m986a() {
        a60 a60Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1580d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f1579c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (a60Var = (a60) this.f1582a.getAndSet(i2, null)) != null) {
                if (a60Var.f45b.f686a == 1) {
                    f1581e.decrementAndGet(this);
                }
                return a60Var;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final a60 m987b(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f1582a;
        a60 a60Var = (a60) atomicReferenceArray.get(i2);
        if (a60Var != null) {
            if ((a60Var.f45b.f686a == 1) == z) {
                while (!atomicReferenceArray.compareAndSet(i2, a60Var, null)) {
                    if (atomicReferenceArray.get(i2) != a60Var) {
                    }
                }
                if (z) {
                    f1581e.decrementAndGet(this);
                }
                return a60Var;
            }
        }
        return null;
    }
}
