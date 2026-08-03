package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b2 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f15144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wb.g2 f15145i;

    public /* synthetic */ b2(fg.l r1, wb.g2 r2, int r3) {
            r0 = this;
            r0.f15143g = r3
            r0.f15144h = r1
            r0.f15145i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f15143g
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            wb.g2 r0 = r2.f15145i
            c9.a r0 = r0.f16297a
            java.lang.String r0 = r0.f1081a
            fg.l r1 = r2.f15144h
            r1.invoke(r0)
        L10:
            sf.n r0 = sf.n.f12433a
            return r0
        L13:
            wb.g2 r0 = r2.f15145i
            c9.a r0 = r0.f16297a
            fg.l r1 = r2.f15144h
            r1.invoke(r0)
            goto L10
    }
}
