package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0.o f14536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f14537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.l f14538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f14541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14542n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14544p;

    public /* synthetic */ m(java.lang.String r2, java.lang.String r3, y0.o r4, boolean r5, d1.v r6, fg.a r7, fg.l r8, int r9, int r10) {
            r1 = this;
            r0 = 1
            r1.f14535g = r0
            r1.<init>()
            r1.f14541m = r2
            r1.f14542n = r3
            r1.f14536h = r4
            r1.f14537i = r5
            r1.f14543o = r6
            r1.f14544p = r7
            r1.f14538j = r8
            r1.f14539k = r9
            r1.f14540l = r10
            return
    }

    public /* synthetic */ m(y0.o r2, i2.g r3, fg.l r4, boolean r5, i2.n0 r6, m2.d r7, fg.l r8, int r9, int r10) {
            r1 = this;
            r0 = 0
            r1.f14535g = r0
            r1.<init>()
            r1.f14536h = r2
            r1.f14541m = r3
            r1.f14538j = r4
            r1.f14537i = r5
            r1.f14543o = r6
            r1.f14544p = r7
            r1.f14542n = r8
            r1.f14539k = r9
            r1.f14540l = r10
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            int r0 = r11.f14535g
            switch(r0) {
                case 0: goto L37;
                default: goto L5;
            }
        L5:
            java.lang.CharSequence r0 = r11.f14541m
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r11.f14542n
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r11.f14543o
            r5 = r0
            d1.v r5 = (d1.v) r5
            java.lang.Object r0 = r11.f14544p
            r6 = r0
            fg.a r6 = (fg.a) r6
            r8 = r12
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r13 = (java.lang.Integer) r13
            r13.getClass()
            int r12 = r11.f14539k
            r12 = r12 | 1
            int r9 = i0.r.C(r12)
            y0.o r3 = r11.f14536h
            boolean r4 = r11.f14537i
            fg.l r7 = r11.f14538j
            int r10 = r11.f14540l
            wb.ho.u3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L34:
            sf.n r12 = sf.n.f12433a
            return r12
        L37:
            java.lang.CharSequence r0 = r11.f14541m
            r2 = r0
            i2.g r2 = (i2.g) r2
            java.lang.Object r0 = r11.f14543o
            r5 = r0
            i2.n0 r5 = (i2.n0) r5
            java.lang.Object r0 = r11.f14544p
            r6 = r0
            m2.d r6 = (m2.d) r6
            java.lang.Object r0 = r11.f14542n
            r7 = r0
            fg.l r7 = (fg.l) r7
            r8 = r12
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r13 = (java.lang.Integer) r13
            r13.getClass()
            int r12 = r11.f14539k
            r12 = r12 | 1
            int r9 = i0.r.C(r12)
            int r12 = r11.f14540l
            int r10 = i0.r.C(r12)
            y0.o r1 = r11.f14536h
            fg.l r3 = r11.f14538j
            boolean r4 = r11.f14537i
            w.s.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L34
    }
}
