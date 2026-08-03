package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c9.j1 f1248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fg.a f1253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1254n;

    public /* synthetic */ l0(c9.j1 r2, java.lang.String r3, java.lang.String r4, int r5, boolean r6, fg.a r7, int r8) {
            r1 = this;
            r0 = 1
            r1.f1247g = r0
            r1.<init>()
            r1.f1248h = r2
            r1.f1249i = r3
            r1.f1250j = r4
            r1.f1251k = r5
            r1.f1252l = r6
            r1.f1253m = r7
            r1.f1254n = r8
            return
    }

    public /* synthetic */ l0(c9.j1 r2, java.lang.String r3, java.lang.String r4, fg.a r5, boolean r6, int r7, int r8) {
            r1 = this;
            r0 = 0
            r1.f1247g = r0
            r1.<init>()
            r1.f1248h = r2
            r1.f1249i = r3
            r1.f1250j = r4
            r1.f1253m = r5
            r1.f1252l = r6
            r1.f1251k = r7
            r1.f1254n = r8
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f1247g
            switch(r0) {
                case 0: goto L27;
                default: goto L5;
            }
        L5:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f1254n
            r10 = r10 | 1
            int r3 = i0.r.C(r10)
            c9.j1 r1 = r9.f1248h
            int r2 = r9.f1251k
            fg.a r4 = r9.f1253m
            java.lang.String r6 = r9.f1249i
            java.lang.String r7 = r9.f1250j
            boolean r8 = r9.f1252l
            r1.i(r2, r3, r4, r5, r6, r7, r8)
        L24:
            sf.n r10 = sf.n.f12433a
            return r10
        L27:
            r4 = r10
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f1251k
            r10 = r10 | 1
            int r1 = i0.r.C(r10)
            c9.j1 r0 = r9.f1248h
            int r2 = r9.f1254n
            fg.a r3 = r9.f1253m
            java.lang.String r5 = r9.f1249i
            java.lang.String r6 = r9.f1250j
            boolean r7 = r9.f1252l
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            goto L24
    }
}
