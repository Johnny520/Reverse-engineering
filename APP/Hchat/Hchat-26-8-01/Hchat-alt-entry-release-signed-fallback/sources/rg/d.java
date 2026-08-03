package rg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f11955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qg.p f11956i;

    public d(qg.g r2, rg.e r3) {
            r1 = this;
            r0 = 0
            r1.f11954g = r0
            r1.<init>()
            r1.f11955h = r2
            r1.f11956i = r3
            return
    }

    public d(vg.g r2, java.lang.Runnable r3) {
            r1 = this;
            r0 = 1
            r1.f11954g = r0
            r1.<init>()
            r1.f11956i = r2
            r1.f11955h = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f11954g
            switch(r0) {
                case 0: goto L31;
                default: goto L5;
            }
        L5:
            qg.p r0 = r5.f11956i
            vg.g r0 = (vg.g) r0
            qg.p r1 = r0.f14336j
            r2 = 0
        Lc:
            java.lang.Runnable r3 = r5.f11955h     // Catch: java.lang.Throwable -> L12
            r3.run()     // Catch: java.lang.Throwable -> L12
            goto L18
        L12:
            r3 = move-exception
            wf.h r4 = wf.h.f20786g
            qg.v.m(r3, r4)
        L18:
            java.lang.Runnable r3 = r0.z()
            if (r3 != 0) goto L1f
            goto L30
        L1f:
            r5.f11955h = r3
            int r2 = r2 + 1
            r3 = 16
            if (r2 < r3) goto Lc
            boolean r3 = r1.x(r0)
            if (r3 == 0) goto Lc
            r1.w(r0, r5)
        L30:
            return
        L31:
            java.lang.Runnable r0 = r5.f11955h
            qg.g r0 = (qg.g) r0
            qg.p r1 = r5.f11956i
            rg.e r1 = (rg.e) r1
            sf.n r2 = sf.n.f12433a
            r0.B(r1, r2)
            return
    }
}
