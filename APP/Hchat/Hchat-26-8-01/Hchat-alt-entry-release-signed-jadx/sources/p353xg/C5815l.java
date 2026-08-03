package p353xg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: xg.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5815l {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23598b = AtomicReferenceFieldUpdater.newUpdater(C5815l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23599c = AtomicIntegerFieldUpdater.newUpdater(C5815l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23600d = AtomicIntegerFieldUpdater.newUpdater(C5815l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23601e = AtomicIntegerFieldUpdater.newUpdater(C5815l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f23602a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC5811h m10536a(AbstractRunnableC5811h abstractRunnableC5811h) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f23599c;
        if (atomicIntegerFieldUpdater.get(this) - f23600d.get(this) == 127) {
            return abstractRunnableC5811h;
        }
        if (abstractRunnableC5811h.f23589h) {
            f23601e.incrementAndGet(this);
        }
        int i9 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f23602a;
            if (atomicReferenceArray.get(i9) == null) {
                atomicReferenceArray.lazySet(i9, abstractRunnableC5811h);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC5811h m10537b() {
        AbstractRunnableC5811h abstractRunnableC5811h;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f23600d;
            int i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 - f23599c.get(this) == 0) {
                return null;
            }
            int i10 = i9 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i9, i9 + 1) && (abstractRunnableC5811h = (AbstractRunnableC5811h) this.f23602a.getAndSet(i10, null)) != null) {
                if (abstractRunnableC5811h.f23589h) {
                    f23601e.decrementAndGet(this);
                }
                return abstractRunnableC5811h;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final AbstractRunnableC5811h m10538c(int i9, boolean z9) {
        int i10 = i9 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f23602a;
        AbstractRunnableC5811h abstractRunnableC5811h = (AbstractRunnableC5811h) atomicReferenceArray.get(i10);
        if (abstractRunnableC5811h != null && abstractRunnableC5811h.f23589h == z9) {
            while (!atomicReferenceArray.compareAndSet(i10, abstractRunnableC5811h, null)) {
                if (atomicReferenceArray.get(i10) != abstractRunnableC5811h) {
                }
            }
            if (z9) {
                f23601e.decrementAndGet(this);
            }
            return abstractRunnableC5811h;
        }
        return null;
    }
}
