package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uh implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f19475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f19476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f19477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ sf.b f19479l;

    public /* synthetic */ uh(java.lang.Object r1, boolean r2, boolean r3, sf.b r4, int r5, int r6) {
            r0 = this;
            r0.f19474g = r6
            r0.f19478k = r1
            r0.f19475h = r2
            r0.f19476i = r3
            r0.f19479l = r4
            r0.f19477j = r5
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f19474g
            switch(r0) {
                case 0: goto L29;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f19478k
            r1 = r0
            wb.t0 r1 = (wb.t0) r1
            sf.b r0 = r7.f19479l
            r4 = r0
            fg.l r4 = (fg.l) r4
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            int r8 = r7.f19477j
            r8 = r8 | 1
            int r6 = i0.r.C(r8)
            boolean r2 = r7.f19475h
            boolean r3 = r7.f19476i
            wb.ho.Y(r1, r2, r3, r4, r5, r6)
        L26:
            sf.n r8 = sf.n.f12433a
            return r8
        L29:
            java.lang.Object r0 = r7.f19478k
            r1 = r0
            wb.s0 r1 = (wb.s0) r1
            sf.b r0 = r7.f19479l
            r4 = r0
            fg.a r4 = (fg.a) r4
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            int r8 = r7.f19477j
            r8 = r8 | 1
            int r6 = i0.r.C(r8)
            boolean r2 = r7.f19475h
            boolean r3 = r7.f19476i
            wb.ho.a0(r1, r2, r3, r4, r5, r6)
            goto L26
    }
}
