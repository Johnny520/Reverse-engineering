package defpackage;

/* JADX INFO: renamed from: ᛲᛷᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0329 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final /* synthetic */ long f1697 = 0;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ long f1698 = 0;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f1699 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f1700 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final /* synthetic */ long f1701 = 0;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f1702 = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ java.lang.Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReferenceArray f1703;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᛲᛷᲇᛴ> r1 = defpackage.C0329.class
            java.lang.String r2 = "lastScheduledTask$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.C0329.f1701 = r2
            java.lang.String r2 = "producerIndex$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r2)
            defpackage.C0329.f1700 = r3
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.C0329.f1702 = r2
            java.lang.String r2 = "consumerIndex$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.C0329.f1697 = r2
            java.lang.String r2 = "blockingTasksInBuffer$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r2)
            defpackage.C0329.f1699 = r3
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.C0329.f1698 = r0
            return
    }

    public C0329() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.f1703 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractRunnableC1247 m999(int r5, boolean r6) {
            r4 = this;
            r5 = r5 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r4.f1703
            java.lang.Object r1 = r0.get(r5)
            ᛷᛳᲇᛲ r1 = (defpackage.AbstractRunnableC1247) r1
            r2 = 0
            if (r1 == 0) goto L25
            boolean r3 = r1.f5576
            if (r3 != r6) goto L25
        L11:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L1f
            if (r6 == 0) goto L1e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.C0329.f1699
            r5.decrementAndGet(r4)
        L1e:
            return r1
        L1f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L11
        L25:
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m1000() {
            r4 = this;
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C0329.f1702
            int r0 = r0.getIntVolatile(r4, r1)
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C0329.f1697
            int r4 = r1.getIntVolatile(r4, r2)
            int r0 = r0 - r4
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractRunnableC1247 m1001() {
            r8 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C0329.f1697
            int r4 = r0.getIntVolatile(r8, r2)
            long r5 = defpackage.C0329.f1702
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
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r1.f1703
            java.lang.Object r8 = r8.getAndSet(r7, r6)
            ᛷᛳᲇᛲ r8 = (defpackage.AbstractRunnableC1247) r8
            if (r8 != 0) goto L2b
        L29:
            r8 = r1
            goto L0
        L2b:
            boolean r0 = r8.f5576
            if (r0 == 0) goto L34
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.C0329.f1699
            r0.decrementAndGet(r1)
        L34:
            return r8
    }
}
