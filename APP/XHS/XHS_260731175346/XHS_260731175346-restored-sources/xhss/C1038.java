package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛵᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1038 extends xhss.AbstractC0180 implements xhss.InterfaceC0654 {

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final /* synthetic */ long f3350 = 0;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f3351 = null;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.InterfaceC0654 f3352;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final int f3353;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.lang.Object f3354;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.AbstractC0180 f3355;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0848 f3356;

    static {
            java.lang.Class<xhss.ᲇᛵᛳᛸ> r0 = xhss.C1038.class
            java.lang.String r1 = "runningWorkers$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            xhss.C1038.f3351 = r2
            sun.misc.Unsafe r2 = xhss.AbstractC1067.f3442
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            long r0 = r2.objectFieldOffset(r0)
            xhss.C1038.f3350 = r0
            return
    }

    public C1038(xhss.AbstractC0180 r2, int r3) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2 instanceof xhss.InterfaceC0654
            if (r0 == 0) goto Lb
            r0 = r2
            xhss.ᛷᛴᲁᲀ r0 = (xhss.InterfaceC0654) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            xhss.ᛷᛴᲁᲀ r0 = xhss.AbstractC0918.f2958
        L10:
            r1.f3352 = r0
            r1.f3355 = r2
            r1.f3353 = r3
            xhss.ᲀᛳᛲᲈ r2 = new xhss.ᲀᛳᛲᲈ
            r2.<init>()
            r1.f3356 = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f3354 = r2
            return
    }

    @Override // xhss.AbstractC0180
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xhss.ᛲᛶᲇᲇ r1 = r2.f3355
            r0.append(r1)
            java.lang.String r1 = ".limitedParallelism("
            r0.append(r1)
            int r2 = r2.f3353
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // xhss.InterfaceC0654
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final void mo903(long r1, xhss.C0172 r3) {
            r0 = this;
            xhss.ᛷᛴᲁᲀ r0 = r0.f3352
            r0.mo903(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final java.lang.Runnable m1698() {
            r3 = this;
        L0:
            xhss.ᲀᛳᛲᲈ r0 = r3.f3356
            java.lang.Object r0 = r0.m1435()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L25
            java.lang.Object r0 = r3.f3354
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = xhss.C1038.f3351     // Catch: java.lang.Throwable -> L22
            r1.decrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            xhss.ᲀᛳᛲᲈ r2 = r3.f3356     // Catch: java.lang.Throwable -> L22
            int r2 = r2.m1433()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L1d
            monitor-exit(r0)
            r3 = 0
            return r3
        L1d:
            r1.incrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            goto L0
        L22:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L25:
            return r0
    }

    @Override // xhss.AbstractC0180
    /* JADX INFO: renamed from: ᛷᲁᲁ */
    public final void mo359(xhss.InterfaceC0362 r5, java.lang.Runnable r6) {
            r4 = this;
            xhss.ᲀᛳᛲᲈ r5 = r4.f3356
            r5.m1434(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = xhss.C1038.f3351
            sun.misc.Unsafe r6 = xhss.AbstractC1067.f3442
            long r0 = xhss.C1038.f3350
            int r2 = r6.getIntVolatile(r4, r0)
            int r3 = r4.f3353
            if (r2 >= r3) goto L39
            java.lang.Object r2 = r4.f3354
            monitor-enter(r2)
            int r6 = r6.getIntVolatile(r4, r0)     // Catch: java.lang.Throwable -> L36
            int r0 = r4.f3353     // Catch: java.lang.Throwable -> L36
            if (r6 < r0) goto L20
            monitor-exit(r2)
            return
        L20:
            r5.incrementAndGet(r4)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r2)
            java.lang.Runnable r5 = r4.m1698()
            if (r5 != 0) goto L2b
            goto L39
        L2b:
            xhss.ᛳᛵᛲᲇ r6 = new xhss.ᛳᛵᛲᲇ
            r6.<init>(r4, r5)
            xhss.ᛲᛶᲇᲇ r5 = r4.f3355
            r5.mo359(r4, r6)
            return
        L36:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L39:
            return
    }
}
