package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC3591 extends Yue.AbstractC2277 implements Yue.InterfaceC6113, java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f11412 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int inFlightTasks;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C2301 f11413;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f11414;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.String f11415;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int f11416;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> f11417;

    static {
            java.lang.Class<Yue.ۥ۠ۧ۠ۡ> r0 = Yue.ExecutorC3591.class
            java.lang.String r1 = "inFlightTasks"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            Yue.ExecutorC3591.f11412 = r0
            return
    }

    public ExecutorC3591(@Yue.InterfaceC4418 Yue.C2301 r1, int r2, @Yue.InterfaceC4543 java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f11413 = r1
            r0.f11414 = r2
            r0.f11415 = r3
            r0.f11416 = r4
            java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue
            r1.<init>()
            r0.f11417 = r1
            r1 = 0
            r0.inFlightTasks = r1
            return
    }

    @Override // Yue.AbstractC2277, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Close cannot be invoked on LimitingBlockingDispatcher"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.AbstractC1643
    public void dispatch(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 java.lang.Runnable r2) {
            r0 = this;
            r1 = 0
            r0.m14528(r2, r1)
            return
    }

    @Override // Yue.AbstractC1643
    public void dispatchYield(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 java.lang.Runnable r2) {
            r0 = this;
            r1 = 1
            r0.m14528(r2, r1)
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(@Yue.InterfaceC4418 java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            r1.m14528(r2, r0)
            return
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.f11415
            if (r0 != 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[dispatcher = "
            r0.append(r1)
            Yue.ۥ۠ۡۤۡ r1 = r2.f11413
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L23:
            return r0
    }

    @Override // Yue.InterfaceC6113
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void mo14526() {
            r3 = this;
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r3.f11417
            java.lang.Object r0 = r0.poll()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1 = 1
            if (r0 == 0) goto L11
            Yue.ۥ۠ۡۤۡ r2 = r3.f11413
            r2.m10659(r0, r3, r1)
            return
        L11:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.ExecutorC3591.f11412
            r0.decrementAndGet(r3)
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r3.f11417
            java.lang.Object r0 = r0.poll()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L21
            return
        L21:
            r3.m14528(r0, r1)
            return
    }

    @Override // Yue.InterfaceC6113
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public int mo14527() {
            r1 = this;
            int r0 = r1.f11416
            return r0
    }

    @Override // Yue.AbstractC2277
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟ */
    public java.util.concurrent.Executor mo8460() {
            r0 = this;
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final void m14528(java.lang.Runnable r4, boolean r5) {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.ExecutorC3591.f11412
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.f11414
            if (r1 > r2) goto L10
            Yue.ۥ۠ۡۤۡ r0 = r3.f11413
            r0.m10659(r4, r3, r5)
            return
        L10:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.f11417
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.f11414
            if (r4 < r0) goto L1e
            return
        L1e:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.f11417
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L0
            return
    }
}
