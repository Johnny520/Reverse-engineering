package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: PF */
/* JADX INFO: loaded from: classes.dex */
public final class C0661PF {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2111b = null;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2112c = null;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2113d = null;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2114e = null;

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f2115a;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        f2111b = AtomicReferenceFieldUpdater.newUpdater(C0661PF.class, Object.class, "lastScheduledTask$volatile");
        f2112c = AtomicIntegerFieldUpdater.newUpdater(C0661PF.class, "producerIndex$volatile");
        f2113d = AtomicIntegerFieldUpdater.newUpdater(C0661PF.class, "consumerIndex$volatile");
        f2114e = AtomicIntegerFieldUpdater.newUpdater(C0661PF.class, "blockingTasksInBuffer$volatile");
    }

    public C0661PF() {
        this.f2115a = new AtomicReferenceArray(128);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC1532iA m1320a() {
    L2:
        AtomicIntegerFieldUpdater r0 = f2113d;
        int r1 = r0.get(this);
        if ((r1 - f2112c.get(this)) == 0) goto L4;
        int r2 = r1 & 127;
        if (r0.compareAndSet(this, r1, r1 + 1) == false) goto L2;
        AbstractRunnableC1532iA r02 = (AbstractRunnableC1532iA) this.f2115a.getAndSet(r2, null);
        if (r02 == null) goto L2;
        if (r02.f5415b == false) goto L13;
        f2114e.decrementAndGet(this);
    L13:
        return r02;
    L4:
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC1532iA m1321b(int r5, boolean r6) {
        int r52 = r5 & 127;
        AtomicReferenceArray r0 = this.f2115a;
        AbstractRunnableC1532iA r1 = (AbstractRunnableC1532iA) r0.get(r52);
        if (r1 != null) goto L5;
    L13:
        return null;
    L5:
        if (r1.f5415b != r6) goto L13;
    L7:
        if (r0.compareAndSet(r52, r1, null) == true) goto L8;
        if (r0.get(r52) == r1) goto L7;
    L8:
        if (r6 == false) goto L10;
        f2114e.decrementAndGet(this);
    L10:
        return r1;
    }
}
