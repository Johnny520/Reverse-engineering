package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f14781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f14782i;

    public /* synthetic */ k(fg.l r1, fg.l r2, int r3) {
            r0 = this;
            r0.f14780g = r3
            r0.f14781h = r1
            r0.f14782i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f14780g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            fg.l r0 = r1.f14781h
            r0.invoke(r2)
            fg.l r0 = r1.f14782i
            r0.invoke(r2)
        Lf:
            sf.n r2 = sf.n.f12433a
            return r2
        L12:
            fg.l r0 = r1.f14781h
            r0.invoke(r2)
            fg.l r0 = r1.f14782i
            r0.invoke(r2)
            goto Lf
    }
}
