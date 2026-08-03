package xg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f21630b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f21631c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f21632d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f21633e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceArray f21634a;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ java.lang.Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "lastScheduledTask$volatile"
            java.lang.Class<xg.l> r2 = xg.l.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            xg.l.f21630b = r0
            java.lang.String r0 = "producerIndex$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            xg.l.f21631c = r0
            java.lang.String r0 = "consumerIndex$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            xg.l.f21632d = r0
            java.lang.String r0 = "blockingTasksInBuffer$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            xg.l.f21633e = r0
            return
    }

    public l() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.f21634a = r0
            return
    }

    public final xg.h a(xg.h r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = xg.l.f21631c
            int r1 = r0.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = xg.l.f21632d
            int r2 = r2.get(r4)
            int r1 = r1 - r2
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 != r2) goto L12
            return r5
        L12:
            boolean r1 = r5.f21621h
            if (r1 == 0) goto L1b
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = xg.l.f21633e
            r1.incrementAndGet(r4)
        L1b:
            int r1 = r0.get(r4)
            r1 = r1 & r2
        L20:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r4.f21634a
            java.lang.Object r3 = r2.get(r1)
            if (r3 == 0) goto L2c
            java.lang.Thread.yield()
            goto L20
        L2c:
            r2.lazySet(r1, r5)
            r0.incrementAndGet(r4)
            r5 = 0
            return r5
    }

    public final xg.h b() {
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = xg.l.f21632d
            int r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = xg.l.f21631c
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
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.f21634a
            java.lang.Object r0 = r0.getAndSet(r2, r3)
            xg.h r0 = (xg.h) r0
            if (r0 != 0) goto L27
            goto L0
        L27:
            boolean r1 = r0.f21621h
            if (r1 == 0) goto L30
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = xg.l.f21633e
            r1.decrementAndGet(r5)
        L30:
            return r0
    }

    public final xg.h c(int r5, boolean r6) {
            r4 = this;
            r5 = r5 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r4.f21634a
            java.lang.Object r1 = r0.get(r5)
            xg.h r1 = (xg.h) r1
            r2 = 0
            if (r1 == 0) goto L25
            boolean r3 = r1.f21621h
            if (r3 != r6) goto L25
        L11:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L1f
            if (r6 == 0) goto L1e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = xg.l.f21633e
            r5.decrementAndGet(r4)
        L1e:
            return r1
        L1f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L11
        L25:
            return r2
    }
}
