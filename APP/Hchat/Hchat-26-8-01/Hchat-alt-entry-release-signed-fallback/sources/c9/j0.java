package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0.o f1221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f1222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1226m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1227n;

    public /* synthetic */ j0(c9.j1 r2, java.lang.String r3, java.lang.String r4, fg.l r5, y0.o r6, int r7, int r8) {
            r1 = this;
            r0 = 0
            r1.f1220g = r0
            r1.<init>()
            r1.f1225l = r2
            r1.f1226m = r3
            r1.f1227n = r4
            r1.f1222i = r5
            r1.f1221h = r6
            r1.f1223j = r7
            r1.f1224k = r8
            return
    }

    public /* synthetic */ j0(i2.g r2, y0.o r3, i2.n0 r4, fg.l r5, int r6, java.util.Map r7, int r8) {
            r1 = this;
            r0 = 1
            r1.f1220g = r0
            r1.<init>()
            r1.f1225l = r2
            r1.f1221h = r3
            r1.f1226m = r4
            r1.f1222i = r5
            r1.f1223j = r6
            r1.f1227n = r7
            r1.f1224k = r8
            return
    }

    public /* synthetic */ j0(wb.y2 r1, java.lang.String r2, java.lang.String r3, int r4, int r5, y0.o r6, fg.l r7, int r8) {
            r0 = this;
            r8 = 2
            r0.f1220g = r8
            r0.<init>()
            r0.f1225l = r1
            r0.f1226m = r2
            r0.f1227n = r3
            r0.f1223j = r4
            r0.f1224k = r5
            r0.f1221h = r6
            r0.f1222i = r7
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f1220g
            switch(r0) {
                case 0: goto L5a;
                case 1: goto L31;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r10.f1225l
            r1 = r0
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r0 = r10.f1226m
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r10.f1227n
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            r8 = r11
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            r11 = 1576327(0x180d87, float:2.208905E-39)
            int r9 = i0.r.C(r11)
            int r4 = r10.f1223j
            int r5 = r10.f1224k
            y0.o r6 = r10.f1221h
            fg.l r7 = r10.f1222i
            r1.j(r2, r3, r4, r5, r6, r7, r8, r9)
        L2e:
            sf.n r11 = sf.n.f12433a
            return r11
        L31:
            java.lang.Object r0 = r10.f1225l
            r1 = r0
            i2.g r1 = (i2.g) r1
            java.lang.Object r0 = r10.f1226m
            r3 = r0
            i2.n0 r3 = (i2.n0) r3
            java.lang.Object r0 = r10.f1227n
            r6 = r0
            java.util.Map r6 = (java.util.Map) r6
            r7 = r11
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            int r11 = r10.f1224k
            r11 = r11 | 1
            int r8 = i0.r.C(r11)
            y0.o r2 = r10.f1221h
            fg.l r4 = r10.f1222i
            int r5 = r10.f1223j
            w.s.a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L2e
        L5a:
            java.lang.Object r0 = r10.f1225l
            r1 = r0
            c9.j1 r1 = (c9.j1) r1
            java.lang.Object r0 = r10.f1226m
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r10.f1227n
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            r5 = r11
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            int r11 = r10.f1223j
            r11 = r11 | 1
            int r2 = i0.r.C(r11)
            int r3 = r10.f1224k
            fg.l r4 = r10.f1222i
            y0.o r8 = r10.f1221h
            r1.g(r2, r3, r4, r5, r6, r7, r8)
            goto L2e
    }
}
