package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a7.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a7.a f7803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ThreadPoolExecutor f7804c;

    public k(a7.a r1, java.util.concurrent.ThreadPoolExecutor r2) {
            r0 = this;
            r0.<init>()
            r0.f7803b = r1
            r0.f7804c = r2
            return
    }

    @Override // a7.a
    public final void D(java.lang.Throwable r3) {
            r2 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r2.f7804c
            a7.a r1 = r2.f7803b     // Catch: java.lang.Throwable -> Lb
            r1.D(r3)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r3 = move-exception
            r0.shutdown()
            throw r3
    }

    @Override // a7.a
    public final void E(hb.c r3) {
            r2 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r2.f7804c
            a7.a r1 = r2.f7803b     // Catch: java.lang.Throwable -> Lb
            r1.E(r3)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r3 = move-exception
            r0.shutdown()
            throw r3
    }
}
