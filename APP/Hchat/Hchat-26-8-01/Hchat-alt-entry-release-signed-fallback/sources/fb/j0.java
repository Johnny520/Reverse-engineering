package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements java.lang.AutoCloseable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final android.content.Context f3575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final org.luckypray.dexkit.DexKitBridge f3576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f3577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f3578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f3579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f3580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f3581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fb.l1 f3582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fb.d0 f3583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.Object f3584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.Object f3585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.Object f3586r;

    public j0(android.content.Context r1, org.luckypray.dexkit.DexKitBridge r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.f3575g = r1
            r0.f3576h = r2
            r0.f3577i = r3
            r0.f3578j = r4
            r0.f3579k = r5
            r0.f3580l = r6
            r0.f3581m = r7
            fb.l1 r2 = new fb.l1
            java.io.File r4 = new java.io.File
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r5 = "Hchat_agent_reverse"
            r4.<init>(r1, r5)
            r2.<init>(r4, r3)
            r0.f3582n = r2
            fb.d0 r1 = new fb.d0
            r1.<init>(r2, r3)
            r0.f3583o = r1
            fb.i0 r1 = new fb.i0
            r2 = 0
            r1.<init>(r0, r2)
            sf.d r2 = sf.d.f12415g
            sf.c r1 = be.h.G(r2, r1)
            r0.f3584p = r1
            fb.i0 r1 = new fb.i0
            r3 = 1
            r1.<init>(r0, r3)
            sf.c r1 = be.h.G(r2, r1)
            r0.f3585q = r1
            fb.i0 r1 = new fb.i0
            r3 = 2
            r1.<init>(r0, r3)
            sf.c r1 = be.h.G(r2, r1)
            r0.f3586r = r1
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.lang.Object r0 = r2.f3584p
            boolean r1 = r0.a()
            if (r1 == 0) goto L11
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L11
            a7.c r0 = (a7.c) r0     // Catch: java.lang.Throwable -> L11
            r0.close()     // Catch: java.lang.Throwable -> L11
        L11:
            boolean r0 = r2.f3581m
            if (r0 == 0) goto L1a
            org.luckypray.dexkit.DexKitBridge r0 = r2.f3576h     // Catch: java.lang.Throwable -> L1a
            r0.close()     // Catch: java.lang.Throwable -> L1a
        L1a:
            return
    }
}
