package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class au {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fb.k2 f15125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f15126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f15127c;

    public au(fb.k2 r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f15125a = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r0 = 0
            r2.<init>(r0)
            r1.f15126b = r2
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r0 = 1
            r2.<init>(r0)
            r1.f15127c = r2
            return
    }

    public final void a(fb.u2 r3) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference r0 = r2.f15126b
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r3)
            if (r1 == 0) goto Lf
            java.util.concurrent.CountDownLatch r3 = r2.f15127c
            r3.countDown()
            return
        Lf:
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L0
            return
    }
}
