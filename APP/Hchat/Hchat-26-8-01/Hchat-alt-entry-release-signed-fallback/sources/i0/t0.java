package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f6046h;

    public /* synthetic */ t0(fg.l r1, int r2) {
            r0 = this;
            r0.f6045g = r2
            r0.f6046h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f6045g
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            w0.j r6 = (w0.j) r6
            java.lang.Object r0 = w0.m.f14786c
            monitor-enter(r0)
            long r1 = w0.m.f14788e     // Catch: java.lang.Throwable -> L1a
            r3 = 1
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L1a
            long r3 = r3 + r1
            w0.m.f14788e = r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            fg.l r0 = r5.f6046h
            w0.e r3 = new w0.e
            r3.<init>(r1, r6, r0)
            return r3
        L1a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L1d:
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            fg.l r6 = r5.f6046h
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r6 = r6.invoke(r0)
            return r6
    }
}
