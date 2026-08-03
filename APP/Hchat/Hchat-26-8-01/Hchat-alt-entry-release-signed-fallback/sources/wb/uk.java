package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uk implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19499h;

    public /* synthetic */ uk(i0.a1 r1, int r2) {
            r0 = this;
            r0.f19498g = r2
            r0.f19499h = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f19498g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            i0.a1 r0 = r3.f19499h
            java.lang.Object r1 = r0.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
        Ld:
            r2 = 1
            p.a.u(r1, r2, r0)
            return
        L12:
            i0.a1 r0 = r3.f19499h
            java.lang.Object r1 = r0.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            goto Ld
    }
}
