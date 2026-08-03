package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f12866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ lg.a f12867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f12868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12869k;

    public /* synthetic */ v0(float r2, lg.a r3, int r4, i0.a1 r5) {
            r1 = this;
            r0 = 1
            r1.f12865g = r0
            r1.<init>()
            r1.f12866h = r2
            r1.f12867i = r3
            r1.f12868j = r4
            r1.f12869k = r5
            return
    }

    public /* synthetic */ v0(lg.a r2, int r3, float[] r4, float r5) {
            r1 = this;
            r0 = 0
            r1.f12865g = r0
            r1.<init>()
            r1.f12867i = r2
            r1.f12868j = r3
            r1.f12869k = r4
            r1.f12866h = r5
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f12865g
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r12.f12869k
            int r4 = r12.f12868j
            lg.a r5 = r12.f12867i
            float r6 = r12.f12866h
            switch(r0) {
                case 0: goto L47;
                default: goto Lf;
            }
        Lf:
            i0.a1 r3 = (i0.a1) r3
            f2.y r13 = (f2.y) r13
            r13.getClass()
            f2.h r0 = new f2.h
            float r7 = r5.f8040a
            float r8 = r5.f8041b
            lg.a r9 = new lg.a
            r9.<init>(r7, r8)
            if (r4 <= 0) goto L24
            r2 = r4
        L24:
            r0.<init>(r6, r9, r2)
            mg.d[] r2 = f2.w.f3251a
            f2.x r2 = f2.u.f3225c
            mg.d[] r4 = f2.w.f3251a
            r1 = r4[r1]
            r13.a(r2, r0)
            m.b r0 = new m.b
            r1 = 16
            r0.<init>(r5, r1, r3)
            f2.x r1 = f2.l.f3186i
            f2.a r2 = new f2.a
            r3 = 0
            r2.<init>(r3, r0)
            r13.a(r1, r2)
            sf.n r13 = sf.n.f12433a
            return r13
        L47:
            float[] r3 = (float[]) r3
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            r0 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            float r13 = r9.e0.q(r13, r0, r7)
            float r0 = r5.f8040a
            float r5 = r5.f8041b
            float r7 = fb.v0.C(r0, r5, r13)
            if (r4 <= 0) goto L75
            int r4 = r4 + r1
            double r0 = (double) r0
            double r5 = (double) r5
            float r3 = (float) r4
            float r13 = r13 * r3
            int r13 = ig.a.X(r13)
            int r13 = r9.e0.r(r13, r2, r4)
            double r5 = r5 - r0
            double r2 = (double) r13
            double r5 = r5 * r2
            double r2 = (double) r4
            double r5 = r5 / r2
            double r5 = r5 + r0
            float r7 = (float) r5
            goto L9d
        L75:
            int r4 = r3.length
            if (r4 != 0) goto L79
            goto L9d
        L79:
            r2 = r3[r2]
            float r4 = r2 - r13
            float r4 = java.lang.Math.abs(r4)
            int r8 = r3.length
        L82:
            if (r1 >= r8) goto L95
            r9 = r3[r1]
            float r10 = r9 - r13
            float r10 = java.lang.Math.abs(r10)
            int r11 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r11 >= 0) goto L92
            r2 = r9
            r4 = r10
        L92:
            int r1 = r1 + 1
            goto L82
        L95:
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 >= 0) goto L9d
            float r7 = fb.v0.C(r0, r5, r2)
        L9d:
            java.lang.Float r13 = java.lang.Float.valueOf(r7)
            return r13
    }
}
