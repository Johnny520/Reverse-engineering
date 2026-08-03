package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class im implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16873k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16875m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sf.b f16876n;

    public /* synthetic */ im(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, fg.l r6, int r7, int r8) {
            r1 = this;
            r0 = 0
            r1.f16869g = r0
            r1.<init>()
            r1.f16873k = r2
            r1.f16874l = r3
            r1.f16875m = r4
            r1.f16870h = r5
            r1.f16876n = r6
            r1.f16871i = r7
            r1.f16872j = r8
            return
    }

    public /* synthetic */ im(wb.y2 r2, fb.a1 r3, int r4, y0.o r5, fg.a r6, int r7, int r8) {
            r1 = this;
            r0 = 1
            r1.f16869g = r0
            r1.<init>()
            r1.f16873k = r2
            r1.f16874l = r3
            r1.f16870h = r4
            r1.f16875m = r5
            r1.f16876n = r6
            r1.f16871i = r7
            r1.f16872j = r8
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f16869g
            switch(r0) {
                case 0: goto L33;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f16873k
            r1 = r0
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r0 = r9.f16874l
            r2 = r0
            fb.a1 r2 = (fb.a1) r2
            java.lang.Object r0 = r9.f16875m
            r4 = r0
            y0.o r4 = (y0.o) r4
            sf.b r0 = r9.f16876n
            r5 = r0
            fg.a r5 = (fg.a) r5
            r6 = r10
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f16871i
            r10 = r10 | 1
            int r7 = i0.r.C(r10)
            int r3 = r9.f16870h
            int r8 = r9.f16872j
            r1.m0(r2, r3, r4, r5, r6, r7, r8)
        L30:
            sf.n r10 = sf.n.f12433a
            return r10
        L33:
            java.lang.Object r0 = r9.f16873k
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r9.f16874l
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r9.f16875m
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            sf.b r0 = r9.f16876n
            r5 = r0
            fg.l r5 = (fg.l) r5
            r6 = r10
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f16871i
            r10 = r10 | 1
            int r7 = i0.r.C(r10)
            int r4 = r9.f16870h
            int r8 = r9.f16872j
            wb.ho.C1(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L30
    }
}
