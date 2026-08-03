package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t6 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19175i;

    public /* synthetic */ t6(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.f19173g = r3
            r0.f19174h = r1
            r0.f19175i = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f19173g
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            switch(r0) {
                case 0: goto L1c;
                default: goto L9;
            }
        L9:
            r3.getClass()
            int r3 = r1.f19175i
            r3 = r3 | 1
            int r3 = i0.r.C(r3)
            java.lang.String r0 = r1.f19174h
            wb.ho.E2(r0, r2, r3)
        L19:
            sf.n r2 = sf.n.f12433a
            return r2
        L1c:
            r3.intValue()
            int r3 = r1.f19175i
            r3 = r3 | 1
            int r3 = i0.r.C(r3)
            java.lang.String r0 = r1.f19174h
            wb.ho.s0(r0, r2, r3)
            goto L19
    }
}
