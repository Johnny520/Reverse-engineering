package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends w0.w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o0.c f14820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14822e;

    public t(long r1, o0.c r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f14820c = r3
            return
    }

    @Override // w0.w
    public final void a(w0.w r3) {
            r2 = this;
            java.lang.Object r0 = w0.q.f14796a
            monitor-enter(r0)
            r3.getClass()     // Catch: java.lang.Throwable -> L1c
            r1 = r3
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L1c
            o0.c r1 = r1.f14820c     // Catch: java.lang.Throwable -> L1c
            r2.f14820c = r1     // Catch: java.lang.Throwable -> L1c
            r1 = r3
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L1c
            int r1 = r1.f14821d     // Catch: java.lang.Throwable -> L1c
            r2.f14821d = r1     // Catch: java.lang.Throwable -> L1c
            w0.t r3 = (w0.t) r3     // Catch: java.lang.Throwable -> L1c
            int r3 = r3.f14822e     // Catch: java.lang.Throwable -> L1c
            r2.f14822e = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L1c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    @Override // w0.w
    public final w0.w b(long r3) {
            r2 = this;
            w0.t r0 = new w0.t
            o0.c r1 = r2.f14820c
            r0.<init>(r3, r1)
            return r0
    }
}
