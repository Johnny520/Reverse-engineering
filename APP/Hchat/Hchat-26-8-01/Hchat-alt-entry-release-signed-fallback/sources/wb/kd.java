package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kd implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f17245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17246k;

    public /* synthetic */ kd(java.lang.String r1, java.lang.String r2, fg.a r3, int r4, int r5) {
            r0 = this;
            r0.f17242g = r5
            r0.f17243h = r1
            r0.f17244i = r2
            r0.f17245j = r3
            r0.f17246k = r4
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f17242g
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.intValue()
            switch(r0) {
                case 0: goto L20;
                default: goto Lc;
            }
        Lc:
            int r5 = r3.f17246k
            r5 = r5 | 1
            int r5 = i0.r.C(r5)
            java.lang.String r0 = r3.f17243h
            java.lang.String r1 = r3.f17244i
            fg.a r2 = r3.f17245j
            wb.ho.x3(r0, r1, r2, r4, r5)
        L1d:
            sf.n r4 = sf.n.f12433a
            return r4
        L20:
            int r5 = r3.f17246k
            r5 = r5 | 1
            int r5 = i0.r.C(r5)
            java.lang.String r0 = r3.f17243h
            java.lang.String r1 = r3.f17244i
            fg.a r2 = r3.f17245j
            wb.ho.b(r0, r1, r2, r4, r5)
            goto L1d
    }
}
