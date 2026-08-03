package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i1 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f16696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f16697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f16698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.l f16699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ fg.a f16700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fg.l f16701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16702n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16703o;

    public /* synthetic */ i1(vb.a r1, boolean r2, java.util.List r3, r.z r4, fg.a r5, fg.l r6, fg.a r7, fg.l r8, int r9) {
            r0 = this;
            r9 = 1
            r0.f16695g = r9
            r0.<init>()
            r0.f16702n = r1
            r0.f16696h = r2
            r0.f16697i = r3
            r0.f16703o = r4
            r0.f16698j = r5
            r0.f16699k = r6
            r0.f16700l = r7
            r0.f16701m = r8
            return
    }

    public /* synthetic */ i1(wb.h2 r1, java.lang.String r2, boolean r3, java.util.List r4, fg.l r5, fg.a r6, fg.a r7, fg.l r8, int r9) {
            r0 = this;
            r9 = 0
            r0.f16695g = r9
            r0.<init>()
            r0.f16702n = r1
            r0.f16703o = r2
            r0.f16696h = r3
            r0.f16697i = r4
            r0.f16699k = r5
            r0.f16698j = r6
            r0.f16700l = r7
            r0.f16701m = r8
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            int r0 = r11.f16695g
            switch(r0) {
                case 0: goto L30;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f16702n
            r1 = r0
            vb.a r1 = (vb.a) r1
            java.lang.Object r0 = r11.f16703o
            r4 = r0
            r.z r4 = (r.z) r4
            r9 = r12
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r13 = (java.lang.Integer) r13
            r13.getClass()
            r12 = 14155777(0xd80001, float:1.9836469E-38)
            int r10 = i0.r.C(r12)
            boolean r2 = r11.f16696h
            java.util.List r3 = r11.f16697i
            fg.a r5 = r11.f16698j
            fg.l r6 = r11.f16699k
            fg.a r7 = r11.f16700l
            fg.l r8 = r11.f16701m
            wb.ho.l3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L2d:
            sf.n r12 = sf.n.f12433a
            return r12
        L30:
            java.lang.Object r0 = r11.f16702n
            r1 = r0
            wb.h2 r1 = (wb.h2) r1
            java.lang.Object r0 = r11.f16703o
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            r9 = r12
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r13 = (java.lang.Integer) r13
            r13.getClass()
            r12 = 14352385(0xdb0001, float:2.0111975E-38)
            int r10 = i0.r.C(r12)
            boolean r3 = r11.f16696h
            java.util.List r4 = r11.f16697i
            fg.l r5 = r11.f16699k
            fg.a r6 = r11.f16698j
            fg.a r7 = r11.f16700l
            fg.l r8 = r11.f16701m
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L2d
    }
}
