package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛸᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0400 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f1413 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f1414 = null;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final /* synthetic */ long f1415 = 0;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f1416 = 0;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final /* synthetic */ long f1417 = 0;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final /* synthetic */ long f1418 = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ java.lang.Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReferenceArray f1419;

    static {
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Class<xhss.ᛴᛸᲈᛸ> r1 = xhss.C0400.class
            java.lang.String r2 = "lastScheduledTask$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            xhss.C0400.f1418 = r2
            java.lang.String r2 = "producerIndex$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r2)
            xhss.C0400.f1413 = r3
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            xhss.C0400.f1416 = r2
            java.lang.String r2 = "consumerIndex$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            xhss.C0400.f1415 = r2
            java.lang.String r2 = "blockingTasksInBuffer$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r2)
            xhss.C0400.f1414 = r3
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            xhss.C0400.f1417 = r0
            return
    }

    public C0400() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.f1419 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.AbstractRunnableC0130 m793() {
            r8 = this;
        L0:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.C0400.f1415
            int r4 = r0.getIntVolatile(r8, r2)
            long r5 = xhss.C0400.f1416
            int r1 = r0.getIntVolatile(r8, r5)
            int r1 = r4 - r1
            r6 = 0
            if (r1 != 0) goto L14
            return r6
        L14:
            r7 = r4 & 127(0x7f, float:1.78E-43)
            int r5 = r4 + 1
            r1 = r8
            boolean r8 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r8 == 0) goto L29
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r1.f1419
            java.lang.Object r8 = r8.getAndSet(r7, r6)
            xhss.ᛲᛲᛲᛲ r8 = (xhss.AbstractRunnableC0130) r8
            if (r8 != 0) goto L2b
        L29:
            r8 = r1
            goto L0
        L2b:
            boolean r0 = r8.f589
            if (r0 == 0) goto L34
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = xhss.C0400.f1414
            r0.decrementAndGet(r1)
        L34:
            return r8
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.AbstractRunnableC0130 m794(int r5, boolean r6) {
            r4 = this;
            r5 = r5 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r4.f1419
            java.lang.Object r1 = r0.get(r5)
            xhss.ᛲᛲᛲᛲ r1 = (xhss.AbstractRunnableC0130) r1
            r2 = 0
            if (r1 == 0) goto L25
            boolean r3 = r1.f589
            if (r3 != r6) goto L25
        L11:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L1f
            if (r6 == 0) goto L1e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = xhss.C0400.f1414
            r5.decrementAndGet(r4)
        L1e:
            return r1
        L1f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L11
        L25:
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int m795() {
            r4 = this;
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C0400.f1416
            int r0 = r0.getIntVolatile(r4, r1)
            sun.misc.Unsafe r1 = xhss.AbstractC1067.f3442
            long r2 = xhss.C0400.f1415
            int r4 = r1.getIntVolatile(r4, r2)
            int r0 = r0 - r4
            return r0
    }
}
