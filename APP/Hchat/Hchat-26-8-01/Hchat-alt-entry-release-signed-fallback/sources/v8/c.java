package v8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v8.h f14219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.io.File f14220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v8.q f14221j;

    public /* synthetic */ c(v8.h r2, java.io.File r3, v8.q r4) {
            r1 = this;
            r0 = 1
            r1.f14218g = r0
            r1.<init>()
            r1.f14219h = r2
            r1.f14220i = r3
            r1.f14221j = r4
            return
    }

    public /* synthetic */ c(v8.q r2, v8.h r3, java.io.File r4) {
            r1 = this;
            r0 = 0
            r1.f14218g = r0
            r1.<init>()
            r1.f14221j = r2
            r1.f14219h = r3
            r1.f14220i = r4
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f14218g
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            r0 = 0
            v8.h r1 = r4.f14219h
            r1.f14260q = r0
            java.io.File r0 = r4.f14220i
            java.lang.String r0 = r0.getAbsolutePath()
            r0.getClass()
            r1.f14258o = r0
            v8.q r0 = r4.f14221j
            r0.k(r1)
            sf.n r0 = sf.n.f12433a
            return r0
        L1d:
            java.io.File r0 = new java.io.File
            v8.h r1 = r4.f14219h
            java.lang.String r1 = r1.f14257n
            r0.<init>(r1)
            v8.q r1 = r4.f14221j
            java.lang.String r0 = r1.g(r0)
            if (r0 == 0) goto L3d
            java.io.File r2 = r4.f14220i
            java.lang.String r3 = r1.g(r2)
            boolean r0 = gg.l.a(r3, r0)
            if (r0 == 0) goto L3d
            r1.a(r2)
        L3d:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
