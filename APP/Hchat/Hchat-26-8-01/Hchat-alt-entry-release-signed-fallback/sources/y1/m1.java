package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f21998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m.a f21999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22000i;

    public m1(boolean r1, m.a r2, java.lang.String r3) {
            r0 = this;
            r0.f21998g = r1
            r0.f21999h = r2
            r0.f22000i = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            boolean r0 = r3.f21998g
            if (r0 == 0) goto L20
            m.a r0 = r3.f21999h
            java.lang.String r1 = r3.f22000i
            java.lang.Object r0 = r0.f8069h
            pa.c r0 = (pa.c) r0
            java.lang.Object r2 = r0.f10456e
            uf.d r2 = (uf.d) r2
            monitor-enter(r2)
            java.lang.Object r0 = r0.f10457f     // Catch: java.lang.Throwable -> L1d
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L1d
            y1.l1 r0 = (y1.l1) r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            goto L20
        L1d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L20:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
