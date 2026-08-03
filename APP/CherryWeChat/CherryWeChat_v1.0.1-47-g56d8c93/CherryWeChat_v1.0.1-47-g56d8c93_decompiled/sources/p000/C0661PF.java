package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: PF */
/* JADX INFO: loaded from: classes.dex */
public final class C0661PF {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2111b = AtomicReferenceFieldUpdater.newUpdater(C0661PF.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2112c = AtomicIntegerFieldUpdater.newUpdater(C0661PF.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2113d = AtomicIntegerFieldUpdater.newUpdater(C0661PF.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2114e = AtomicIntegerFieldUpdater.newUpdater(C0661PF.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f2115a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC1532iA m1320a() {
        AbstractRunnableC1532iA abstractRunnableC1532iA;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2113d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f2112c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC1532iA = (AbstractRunnableC1532iA) this.f2115a.getAndSet(i2, null)) != null) {
                if (abstractRunnableC1532iA.f5415b) {
                    f2114e.decrementAndGet(this);
                }
                return abstractRunnableC1532iA;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC1532iA m1321b(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f2115a;
        AbstractRunnableC1532iA abstractRunnableC1532iA = (AbstractRunnableC1532iA) atomicReferenceArray.get(i2);
        if (abstractRunnableC1532iA != null && abstractRunnableC1532iA.f5415b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC1532iA, null)) {
                if (atomicReferenceArray.get(i2) != abstractRunnableC1532iA) {
                }
            }
            if (z) {
                f2114e.decrementAndGet(this);
            }
            return abstractRunnableC1532iA;
        }
        return null;
    }
}
