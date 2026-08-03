package xa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xa.m f21423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xa.i f21424i;

    public /* synthetic */ d(xa.m r1, xa.i r2, int r3) {
            r0 = this;
            r0.f21422g = r3
            r0.f21423h = r1
            r0.f21424i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f21422g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            xa.m r0 = r2.f21423h
            xa.i r1 = r2.f21424i
            r0.i(r1)
            return
        Ld:
            xa.m r0 = r2.f21423h
            xa.i r1 = r2.f21424i
            r0.i(r1)
            return
    }
}
