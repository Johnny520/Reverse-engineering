package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1219h;

    public /* synthetic */ j(android.app.Activity r1, int r2) {
            r0 = this;
            r0.f1218g = r2
            r0.f1219h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f1218g
            sf.n r1 = sf.n.f12433a
            android.app.Activity r2 = r3.f1219h
            c9.y r4 = (c9.y) r4
            switch(r0) {
                case 0: goto L14;
                default: goto Lb;
            }
        Lb:
            r4.getClass()
            android.os.Handler r0 = c9.b0.f1104a
            c9.b0.i(r2, r4)
            return r1
        L14:
            r4.getClass()
            android.os.Handler r0 = c9.b0.f1104a
            c9.b0.i(r2, r4)
            return r1
    }
}
