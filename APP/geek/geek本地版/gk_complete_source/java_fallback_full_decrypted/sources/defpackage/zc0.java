package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zc0 {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b = null;
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater c = null;
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater d = null;
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater e = null;
    public final java.util.concurrent.atomic.AtomicReferenceArray a;
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile java.lang.Object lastScheduledTask;
    private volatile int producerIndex;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "lastScheduledTask"
            java.lang.Class<zc0> r2 = defpackage.zc0.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            defpackage.zc0.b = r0
            java.lang.String r0 = "producerIndex"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            defpackage.zc0.c = r0
            java.lang.String r0 = "consumerIndex"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            defpackage.zc0.d = r0
            java.lang.String r0 = "blockingTasksInBuffer"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            defpackage.zc0.e = r0
            return
    }

    public zc0() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.a = r0
            return
    }

    public final defpackage.u50 a() {
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.zc0.d
            int r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.zc0.c
            int r2 = r2.get(r5)
            int r2 = r1 - r2
            r3 = 0
            if (r2 != 0) goto L12
            return r3
        L12:
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r1 + 1
            boolean r0 = r0.compareAndSet(r5, r1, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.a
            java.lang.Object r0 = r0.getAndSet(r2, r3)
            u50 r0 = (defpackage.u50) r0
            if (r0 != 0) goto L27
            goto L0
        L27:
            v50 r1 = r0.b
            int r1 = r1.a
            r2 = 1
            if (r1 != r2) goto L33
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.zc0.e
            r1.decrementAndGet(r5)
        L33:
            return r0
    }

    public final defpackage.u50 b(int r6, boolean r7) {
            r5 = this;
            r6 = r6 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.a
            java.lang.Object r1 = r0.get(r6)
            u50 r1 = (defpackage.u50) r1
            r2 = 0
            if (r1 == 0) goto L2c
            v50 r3 = r1.b
            int r3 = r3.a
            r4 = 1
            if (r3 != r4) goto L15
            goto L16
        L15:
            r4 = 0
        L16:
            if (r4 != r7) goto L2c
        L18:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L26
            if (r7 == 0) goto L25
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = defpackage.zc0.e
            r6.decrementAndGet(r5)
        L25:
            return r1
        L26:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L18
        L2c:
            return r2
    }
}
