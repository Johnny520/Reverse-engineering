package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uu implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wb.y2 f19578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ sf.b f19581k;

    public /* synthetic */ uu(wb.y2 r1, java.lang.Object r2, java.lang.Object r3, sf.b r4, int r5, int r6) {
            r0 = this;
            r0.f19577g = r6
            r0.f19578h = r1
            r0.f19579i = r2
            r0.f19580j = r3
            r0.f19581k = r4
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f19577g
            switch(r0) {
                case 0: goto L2a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f19579i
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r7.f19580j
            r3 = r0
            wb.iv r3 = (wb.iv) r3
            sf.b r0 = r7.f19581k
            r4 = r0
            fg.l r4 = (fg.l) r4
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            r8 = 3073(0xc01, float:4.306E-42)
            int r6 = i0.r.C(r8)
            wb.y2 r1 = r7.f19578h
            r1.g(r2, r3, r4, r5, r6)
        L27:
            sf.n r8 = sf.n.f12433a
            return r8
        L2a:
            java.lang.Object r0 = r7.f19579i
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r7.f19580j
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            sf.b r0 = r7.f19581k
            r4 = r0
            fg.a r4 = (fg.a) r4
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            r8 = 3073(0xc01, float:4.306E-42)
            int r6 = i0.r.C(r8)
            wb.y2 r1 = r7.f19578h
            r1.z(r2, r3, r4, r5, r6)
            goto L27
    }
}
