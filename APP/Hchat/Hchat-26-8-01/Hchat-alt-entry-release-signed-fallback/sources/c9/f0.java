package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1188m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1189n;

    public /* synthetic */ f0(c9.j1 r2, fg.a r3, java.lang.String r4, fg.a r5, boolean r6, int r7, int r8) {
            r1 = this;
            r0 = 0
            r1.f1182g = r0
            r1.<init>()
            r1.f1183h = r2
            r1.f1185j = r3
            r1.f1184i = r4
            r1.f1189n = r5
            r1.f1186k = r6
            r1.f1187l = r7
            r1.f1188m = r8
            return
    }

    public /* synthetic */ f0(java.lang.Object r1, java.lang.String r2, fg.a r3, y0.o r4, boolean r5, int r6, int r7, int r8) {
            r0 = this;
            r0.f1182g = r8
            r0.f1183h = r1
            r0.f1184i = r2
            r0.f1185j = r3
            r0.f1189n = r4
            r0.f1186k = r5
            r0.f1187l = r6
            r0.f1188m = r7
            r0.<init>()
            return
    }

    public /* synthetic */ f0(java.lang.String r2, java.lang.String r3, java.util.List r4, int r5, fg.l r6, boolean r7, int r8) {
            r1 = this;
            r0 = 3
            r1.f1182g = r0
            r1.<init>()
            r1.f1184i = r2
            r1.f1183h = r3
            r1.f1185j = r4
            r1.f1187l = r5
            r1.f1189n = r6
            r1.f1186k = r7
            r1.f1188m = r8
            return
    }

    public /* synthetic */ f0(wb.y2 r2, java.lang.String r3, java.lang.String r4, boolean r5, int r6, fg.l r7, int r8) {
            r1 = this;
            r0 = 2
            r1.f1182g = r0
            r1.<init>()
            r1.f1183h = r2
            r1.f1184i = r3
            r1.f1185j = r4
            r1.f1186k = r5
            r1.f1187l = r6
            r1.f1189n = r7
            r1.f1188m = r8
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f1182g
            switch(r0) {
                case 0: goto Lab;
                case 1: goto L82;
                case 2: goto L59;
                case 3: goto L30;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f1183h
            r1 = r0
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r0 = r9.f1185j
            r3 = r0
            fg.a r3 = (fg.a) r3
            java.lang.Object r0 = r9.f1189n
            r4 = r0
            y0.o r4 = (y0.o) r4
            r6 = r10
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f1187l
            r10 = r10 | 1
            int r7 = i0.r.C(r10)
            java.lang.String r2 = r9.f1184i
            boolean r5 = r9.f1186k
            int r8 = r9.f1188m
            r1.k(r2, r3, r4, r5, r6, r7, r8)
        L2d:
            sf.n r10 = sf.n.f12433a
            return r10
        L30:
            java.lang.Object r0 = r9.f1183h
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r9.f1185j
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r9.f1189n
            r5 = r0
            fg.l r5 = (fg.l) r5
            r7 = r10
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f1188m
            r10 = r10 | 1
            int r8 = i0.r.C(r10)
            java.lang.String r1 = r9.f1184i
            int r4 = r9.f1187l
            boolean r6 = r9.f1186k
            wb.ho.J2(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L2d
        L59:
            java.lang.Object r0 = r9.f1183h
            r1 = r0
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r0 = r9.f1185j
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r9.f1189n
            r4 = r0
            fg.l r4 = (fg.l) r4
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f1188m
            r10 = r10 | 1
            int r3 = i0.r.C(r10)
            int r2 = r9.f1187l
            java.lang.String r6 = r9.f1184i
            boolean r8 = r9.f1186k
            r1.p(r2, r3, r4, r5, r6, r7, r8)
            goto L2d
        L82:
            java.lang.Object r0 = r9.f1183h
            r1 = r0
            c9.j1 r1 = (c9.j1) r1
            java.lang.Object r0 = r9.f1185j
            r3 = r0
            fg.a r3 = (fg.a) r3
            java.lang.Object r0 = r9.f1189n
            r4 = r0
            y0.o r4 = (y0.o) r4
            r6 = r10
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f1187l
            r10 = r10 | 1
            int r7 = i0.r.C(r10)
            java.lang.String r2 = r9.f1184i
            boolean r5 = r9.f1186k
            int r8 = r9.f1188m
            r1.e(r2, r3, r4, r5, r6, r7, r8)
            goto L2d
        Lab:
            java.lang.Object r0 = r9.f1183h
            r1 = r0
            c9.j1 r1 = (c9.j1) r1
            java.lang.Object r0 = r9.f1185j
            r2 = r0
            fg.a r2 = (fg.a) r2
            java.lang.Object r0 = r9.f1189n
            r4 = r0
            fg.a r4 = (fg.a) r4
            r6 = r10
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f1187l
            r10 = r10 | 1
            int r7 = i0.r.C(r10)
            java.lang.String r3 = r9.f1184i
            boolean r5 = r9.f1186k
            int r8 = r9.f1188m
            r1.f(r2, r3, r4, r5, r6, r7, r8)
            goto L2d
    }
}
