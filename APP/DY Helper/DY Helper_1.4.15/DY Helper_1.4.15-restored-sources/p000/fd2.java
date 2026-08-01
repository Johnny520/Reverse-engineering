package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fd2 {

    /* JADX INFO: renamed from: β */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f3901 = null;

    /* JADX INFO: renamed from: γ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f3902 = null;

    /* JADX INFO: renamed from: δ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f3903 = null;

    /* JADX INFO: renamed from: ε */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f3904 = null;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ java.lang.Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: α */
    public final java.util.concurrent.atomic.AtomicReferenceArray f3905;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "lastScheduledTask$volatile"
            java.lang.Class<fd2> r2 = p000.fd2.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            p000.fd2.f3901 = r0
            java.lang.String r0 = "producerIndex$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            p000.fd2.f3902 = r0
            java.lang.String r0 = "consumerIndex$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            p000.fd2.f3903 = r0
            java.lang.String r0 = "blockingTasksInBuffer$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            p000.fd2.f3904 = r0
            return
    }

    public fd2() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.f3905 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final p000.u22 m2099(p000.u22 r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.fd2.f3902
            int r1 = r0.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = p000.fd2.f3903
            int r2 = r2.get(r4)
            int r1 = r1 - r2
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 != r2) goto L12
            return r5
        L12:
            boolean r1 = r5.f10575
            if (r1 == 0) goto L1b
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.fd2.f3904
            r1.incrementAndGet(r4)
        L1b:
            int r1 = r0.get(r4)
            r1 = r1 & r2
        L20:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r4.f3905
            java.lang.Object r3 = r2.get(r1)
            if (r3 == 0) goto L2c
            java.lang.Thread.yield()
            goto L20
        L2c:
            r2.lazySet(r1, r5)
            r0.incrementAndGet(r4)
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: β */
    public final p000.u22 m2100() {
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.fd2.f3903
            int r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = p000.fd2.f3902
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
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.f3905
            java.lang.Object r0 = r0.getAndSet(r2, r3)
            u22 r0 = (p000.u22) r0
            if (r0 != 0) goto L27
            goto L0
        L27:
            boolean r1 = r0.f10575
            if (r1 == 0) goto L30
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.fd2.f3904
            r1.decrementAndGet(r5)
        L30:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final p000.u22 m2101(int r5, boolean r6) {
            r4 = this;
            r5 = r5 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r4.f3905
            java.lang.Object r1 = r0.get(r5)
            u22 r1 = (p000.u22) r1
            r2 = 0
            if (r1 == 0) goto L25
            boolean r3 = r1.f10575
            if (r3 != r6) goto L25
        L11:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L1f
            if (r6 == 0) goto L1e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = p000.fd2.f3904
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
