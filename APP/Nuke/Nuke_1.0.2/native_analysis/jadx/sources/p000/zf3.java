package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zf3 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13880b = AtomicReferenceFieldUpdater.newUpdater(zf3.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13881c = AtomicIntegerFieldUpdater.newUpdater(zf3.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13882d = AtomicIntegerFieldUpdater.newUpdater(zf3.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13883e = AtomicIntegerFieldUpdater.newUpdater(zf3.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f13884a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: a */
    public final fy2 m6412a(fy2 fy2Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13881c;
        if (atomicIntegerFieldUpdater.get(this) - f13882d.get(this) == 127) {
            return fy2Var;
        }
        if (fy2Var.f3198i) {
            f13883e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f13884a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, fy2Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: b */
    public final fy2 m6413b() {
        fy2 fy2Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13882d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f13881c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (fy2Var = (fy2) this.f13884a.getAndSet(i2, null)) != null) {
                if (fy2Var.f3198i) {
                    f13883e.decrementAndGet(this);
                }
                return fy2Var;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final fy2 m6414c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f13884a;
        fy2 fy2Var = (fy2) atomicReferenceArray.get(i2);
        if (fy2Var != null && fy2Var.f3198i == z) {
            while (!atomicReferenceArray.compareAndSet(i2, fy2Var, null)) {
                if (atomicReferenceArray.get(i2) != fy2Var) {
                }
            }
            if (z) {
                f13883e.decrementAndGet(this);
            }
            return fy2Var;
        }
        return null;
    }
}
