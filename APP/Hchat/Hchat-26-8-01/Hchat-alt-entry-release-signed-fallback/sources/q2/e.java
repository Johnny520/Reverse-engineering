package q2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f10618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f10619i;

    public /* synthetic */ e(java.lang.Object r1, long r2, int r4) {
            r0 = this;
            r0.f10617g = r4
            r0.f10619i = r1
            r0.f10618h = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f10617g
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f10619i
            fg.l r0 = (fg.l) r0
            long r1 = r3.f10618h
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.invoke(r1)
            sf.n r0 = sf.n.f12433a
            return r0
        L15:
            java.lang.Object r0 = r3.f10619i
            f1.s r0 = (f1.s) r0
            long r1 = r3.f10618h
            f1.p0 r0 = (f1.p0) r0
            android.graphics.Shader r0 = r0.b(r1)
            return r0
    }
}
