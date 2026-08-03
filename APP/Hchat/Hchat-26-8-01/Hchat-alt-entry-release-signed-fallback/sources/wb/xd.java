package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xd implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.a f20139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f20140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sf.b f20144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20145o;

    public /* synthetic */ xd(int r2, int r3, android.content.Context r4, fg.a r5, fg.l r6, java.lang.String r7, java.util.List r8, java.util.List r9) {
            r1 = this;
            r0 = 1
            r1.f20137g = r0
            r1.<init>()
            r1.f20142l = r4
            r1.f20138h = r7
            r1.f20143m = r8
            r1.f20139i = r5
            r1.f20144n = r6
            r1.f20145o = r9
            r1.f20140j = r2
            r1.f20141k = r3
            return
    }

    public /* synthetic */ xd(java.lang.String r2, fg.a r3, java.lang.String r4, fg.a r5, java.lang.String r6, fg.a r7, int r8, int r9) {
            r1 = this;
            r0 = 0
            r1.f20137g = r0
            r1.<init>()
            r1.f20138h = r2
            r1.f20139i = r3
            r1.f20142l = r4
            r1.f20144n = r5
            r1.f20143m = r6
            r1.f20145o = r7
            r1.f20140j = r8
            r1.f20141k = r9
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f20137g
            switch(r0) {
                case 0: goto L35;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r10.f20142l
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r10.f20143m
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            sf.b r0 = r10.f20144n
            r5 = r0
            fg.l r5 = (fg.l) r5
            java.lang.Object r0 = r10.f20145o
            r6 = r0
            java.util.List r6 = (java.util.List) r6
            r7 = r11
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            int r11 = r10.f20140j
            r11 = r11 | 1
            int r8 = i0.r.C(r11)
            java.lang.String r2 = r10.f20138h
            fg.a r4 = r10.f20139i
            int r9 = r10.f20141k
            wb.ho.d3(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L32:
            sf.n r11 = sf.n.f12433a
            return r11
        L35:
            java.lang.Object r0 = r10.f20142l
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            sf.b r0 = r10.f20144n
            r4 = r0
            fg.a r4 = (fg.a) r4
            java.lang.Object r0 = r10.f20143m
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r10.f20145o
            r6 = r0
            fg.a r6 = (fg.a) r6
            r7 = r11
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            int r11 = r10.f20140j
            r11 = r11 | 1
            int r8 = i0.r.C(r11)
            java.lang.String r1 = r10.f20138h
            fg.a r2 = r10.f20139i
            int r9 = r10.f20141k
            wb.ho.M(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L32
    }
}
