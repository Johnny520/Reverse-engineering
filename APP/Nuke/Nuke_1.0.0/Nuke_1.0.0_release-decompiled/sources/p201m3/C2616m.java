package p201m3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: m3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2616m {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8318b = AtomicReferenceFieldUpdater.newUpdater(C2616m.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8319c = AtomicIntegerFieldUpdater.newUpdater(C2616m.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8320d = AtomicIntegerFieldUpdater.newUpdater(C2616m.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8321e = AtomicIntegerFieldUpdater.newUpdater(C2616m.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f8322a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC2612i m4564a(AbstractRunnableC2612i abstractRunnableC2612i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8319c;
        if (atomicIntegerFieldUpdater.get(this) - f8320d.get(this) == 127) {
            return abstractRunnableC2612i;
        }
        if (abstractRunnableC2612i.f8309e) {
            f8321e.incrementAndGet(this);
        }
        int i5 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f8322a;
            if (atomicReferenceArray.get(i5) == null) {
                atomicReferenceArray.lazySet(i5, abstractRunnableC2612i);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC2612i m4565b() {
        AbstractRunnableC2612i abstractRunnableC2612i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8320d;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 - f8319c.get(this) == 0) {
                return null;
            }
            int i6 = i5 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i5, i5 + 1) && (abstractRunnableC2612i = (AbstractRunnableC2612i) this.f8322a.getAndSet(i6, null)) != null) {
                if (abstractRunnableC2612i.f8309e) {
                    f8321e.decrementAndGet(this);
                }
                return abstractRunnableC2612i;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractRunnableC2612i m4566c(int i5, boolean z5) {
        int i6 = i5 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f8322a;
        AbstractRunnableC2612i abstractRunnableC2612i = (AbstractRunnableC2612i) atomicReferenceArray.get(i6);
        if (abstractRunnableC2612i != null && abstractRunnableC2612i.f8309e == z5) {
            while (!atomicReferenceArray.compareAndSet(i6, abstractRunnableC2612i, null)) {
                if (atomicReferenceArray.get(i6) != abstractRunnableC2612i) {
                }
            }
            if (z5) {
                f8321e.decrementAndGet(this);
            }
            return abstractRunnableC2612i;
        }
        return null;
    }
}
