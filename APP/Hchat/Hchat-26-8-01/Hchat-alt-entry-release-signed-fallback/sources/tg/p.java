package tg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements qg.d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tg.r f13226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f13228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qg.g f13229j;

    public p(tg.r r1, long r2, java.lang.Object r4, qg.g r5) {
            r0 = this;
            r0.<init>()
            r0.f13226g = r1
            r0.f13227h = r2
            r0.f13228i = r4
            r0.f13229j = r5
            return
    }

    @Override // qg.d0
    public final void a() {
            r6 = this;
            tg.r r0 = r6.f13226g
            monitor-enter(r0)
            long r1 = r6.f13227h     // Catch: java.lang.Throwable -> L2b
            long r3 = r0.n()     // Catch: java.lang.Throwable -> L2b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto Lf
            monitor-exit(r0)
            return
        Lf:
            java.lang.Object[] r1 = r0.f13240n     // Catch: java.lang.Throwable -> L2b
            r1.getClass()     // Catch: java.lang.Throwable -> L2b
            long r2 = r6.f13227h     // Catch: java.lang.Throwable -> L2b
            int r4 = (int) r2     // Catch: java.lang.Throwable -> L2b
            int r5 = r1.length     // Catch: java.lang.Throwable -> L2b
            int r5 = r5 + (-1)
            r4 = r4 & r5
            r4 = r1[r4]     // Catch: java.lang.Throwable -> L2b
            if (r4 == r6) goto L21
            monitor-exit(r0)
            return
        L21:
            l3.q r4 = tg.s.f13245a     // Catch: java.lang.Throwable -> L2b
            tg.s.c(r1, r2, r4)     // Catch: java.lang.Throwable -> L2b
            r0.i()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            return
        L2b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
