package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hh implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f16571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f16572i;

    public /* synthetic */ hh(fg.l r1, java.lang.Integer r2, int r3) {
            r0 = this;
            r0.f16570g = r3
            r0.f16571h = r1
            r0.f16572i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f16570g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.Integer r0 = r2.f16572i
            r0.getClass()
            fg.l r1 = r2.f16571h
            r1.invoke(r0)
        Lf:
            sf.n r0 = sf.n.f12433a
            return r0
        L12:
            fg.l r0 = r2.f16571h
            java.lang.Integer r1 = r2.f16572i
            r0.invoke(r1)
            goto Lf
    }
}
