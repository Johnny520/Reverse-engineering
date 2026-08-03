package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rr implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wb.y2 f18942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m1.f f18943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.a f18945k;

    public /* synthetic */ rr(wb.y2 r1, m1.f r2, java.lang.String r3, fg.a r4, int r5, int r6) {
            r0 = this;
            r0.f18941g = r6
            r0.f18942h = r1
            r0.f18943i = r2
            r0.f18944j = r3
            r0.f18945k = r4
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f18941g
            switch(r0) {
                case 0: goto L21;
                default: goto L5;
            }
        L5:
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            r8 = 3127(0xc37, float:4.382E-42)
            int r6 = i0.r.C(r8)
            wb.y2 r1 = r7.f18942h
            m1.f r2 = r7.f18943i
            java.lang.String r3 = r7.f18944j
            fg.a r4 = r7.f18945k
            r1.h0(r2, r3, r4, r5, r6)
        L1e:
            sf.n r8 = sf.n.f12433a
            return r8
        L21:
            r4 = r8
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            r8 = 3127(0xc37, float:4.382E-42)
            int r5 = i0.r.C(r8)
            wb.y2 r0 = r7.f18942h
            m1.f r1 = r7.f18943i
            java.lang.String r2 = r7.f18944j
            fg.a r3 = r7.f18945k
            r0.a0(r1, r2, r3, r4, r5)
            goto L1e
    }
}
