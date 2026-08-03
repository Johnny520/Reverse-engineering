package d;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f1885b;

    public b(int r2) {
            r1 = this;
            r1.f1884a = r2
            switch(r2) {
                case 1: goto L11;
                default: goto L5;
            }
        L5:
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r2.<init>(r0)
            r1.f1885b = r2
            return
        L11:
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r2.<init>(r0)
            r1.f1885b = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r4) {
            r3 = this;
            int r0 = r3.f1884a
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.Thread r0 = new java.lang.Thread
            java.util.concurrent.atomic.AtomicInteger r1 = r3.f1885b
            int r1 = r1.incrementAndGet()
            java.lang.String r2 = "jadx-events-thread-"
            java.lang.String r1 = eh.a.l(r1, r2)
            r0.<init>(r4, r1)
            return r0
        L17:
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "arch_disk_io_"
            r4.<init>(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r3.f1885b
            int r1 = r1.getAndIncrement()
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.setName(r4)
            return r0
    }
}
