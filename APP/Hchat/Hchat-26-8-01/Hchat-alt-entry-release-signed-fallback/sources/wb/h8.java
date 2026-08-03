package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h8 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wb.cp f16509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16510i;

    public /* synthetic */ h8(wb.cp r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f16508g = r3
            r0.f16509h = r1
            r0.f16510i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f16508g
            wb.bp r2 = (wb.bp) r2
            switch(r0) {
                case 0: goto L1a;
                default: goto L7;
            }
        L7:
            r2.getClass()
            wb.cp r0 = r1.f16509h
            fg.l r0 = r0.f15529d
            r0.invoke(r2)
            r2 = 0
            i0.a1 r0 = r1.f16510i
            r0.setValue(r2)
        L17:
            sf.n r2 = sf.n.f12433a
            return r2
        L1a:
            r2.getClass()
            wb.cp r0 = r1.f16509h
            fg.l r0 = r0.f15529d
            r0.invoke(r2)
            r2 = 0
            i0.a1 r0 = r1.f16510i
            r0.setValue(r2)
            goto L17
    }
}
