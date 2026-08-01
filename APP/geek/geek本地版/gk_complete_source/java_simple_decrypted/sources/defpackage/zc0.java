package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class zc0 {
    public static final AtomicReferenceFieldUpdater b = null;
    public static final AtomicIntegerFieldUpdater c = null;
    public static final AtomicIntegerFieldUpdater d = null;
    public static final AtomicIntegerFieldUpdater e = null;
    public final AtomicReferenceArray a;
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    static {
        b = AtomicReferenceFieldUpdater.newUpdater(zc0.class, Object.class, "lastScheduledTask");
        c = AtomicIntegerFieldUpdater.newUpdater(zc0.class, "producerIndex");
        d = AtomicIntegerFieldUpdater.newUpdater(zc0.class, "consumerIndex");
        e = AtomicIntegerFieldUpdater.newUpdater(zc0.class, "blockingTasksInBuffer");
    }

    public zc0() {
        this.a = new AtomicReferenceArray(128);
    }

    public final u50 a() {
    L2:
        AtomicIntegerFieldUpdater r0 = d;
        int r1 = r0.get(this);
        if ((r1 - c.get(this)) == 0) goto L4;
        int r2 = r1 & 127;
        if (r0.compareAndSet(this, r1, r1 + 1) == false) goto L2;
        u50 r02 = (u50) this.a.getAndSet(r2, null);
        if (r02 == null) goto L2;
        if (r02.b.a != 1) goto L13;
        e.decrementAndGet(this);
    L13:
        return r02;
    L4:
        return null;
    }

    public final u50 b(int r6, boolean r7) {
        int r62 = r6 & 127;
        AtomicReferenceArray r0 = this.a;
        u50 r1 = (u50) r0.get(r62);
        if (r1 == null) goto L16;
        boolean r4 = true;
        if (r1.b.a == 1) goto L8;
        r4 = false;
    L8:
        if (r4 != r7) goto L16;
    L10:
        if (r0.compareAndSet(r62, r1, null) == true) goto L11;
        if (r0.get(r62) == r1) goto L10;
    L11:
        if (r7 == false) goto L13;
        e.decrementAndGet(this);
    L13:
        return r1;
    L16:
        return null;
    }
}
