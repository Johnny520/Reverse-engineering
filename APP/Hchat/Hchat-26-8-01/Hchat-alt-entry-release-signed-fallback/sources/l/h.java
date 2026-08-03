package l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f7645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f7646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0.o f7647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.a f7648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7651n;

    public /* synthetic */ h(int r2, fg.a r3, java.lang.String r4, java.lang.String r5, wb.y2 r6, y0.o r7, boolean r8) {
            r1 = this;
            r0 = 1
            r1.f7644g = r0
            r1.<init>()
            r1.f7650m = r6
            r1.f7645h = r4
            r1.f7651n = r5
            r1.f7646i = r8
            r1.f7647j = r7
            r1.f7648k = r3
            r1.f7649l = r2
            return
    }

    public /* synthetic */ h(java.lang.String r2, boolean r3, l.d r4, y0.o r5, fg.q r6, fg.a r7, int r8) {
            r1 = this;
            r0 = 0
            r1.f7644g = r0
            r1.<init>()
            r1.f7645h = r2
            r1.f7646i = r3
            r1.f7650m = r4
            r1.f7647j = r5
            r1.f7651n = r6
            r1.f7648k = r7
            r1.f7649l = r8
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f7644g
            switch(r0) {
                case 0: goto L2d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f7650m
            r1 = r0
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r0 = r9.f7651n
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            r4 = r10
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f7649l
            r10 = r10 | 1
            int r2 = i0.r.C(r10)
            fg.a r3 = r9.f7648k
            java.lang.String r5 = r9.f7645h
            y0.o r7 = r9.f7647j
            boolean r8 = r9.f7646i
            r1.j0(r2, r3, r4, r5, r6, r7, r8)
        L2a:
            sf.n r10 = sf.n.f12433a
            return r10
        L2d:
            java.lang.Object r0 = r9.f7650m
            r3 = r0
            l.d r3 = (l.d) r3
            java.lang.Object r0 = r9.f7651n
            r5 = r0
            fg.q r5 = (fg.q) r5
            r7 = r10
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f7649l
            r10 = r10 | 1
            int r8 = i0.r.C(r10)
            java.lang.String r1 = r9.f7645h
            boolean r2 = r9.f7646i
            y0.o r4 = r9.f7647j
            fg.a r6 = r9.f7648k
            l.i.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L2a
    }
}
