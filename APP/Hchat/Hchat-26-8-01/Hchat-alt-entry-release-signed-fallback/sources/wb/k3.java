package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k3 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f17188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17191l;

    public /* synthetic */ k3(int r2, fg.l r3, boolean r4, db.c r5, fg.a r6) {
            r1 = this;
            r0 = 1
            r1.f17186g = r0
            r1.<init>()
            r1.f17187h = r2
            r1.f17189j = r3
            r1.f17188i = r4
            r1.f17190k = r5
            r1.f17191l = r6
            return
    }

    public /* synthetic */ k3(boolean r2, int r3, qg.t r4, i0.f1 r5, i.c r6) {
            r1 = this;
            r0 = 0
            r1.f17186g = r0
            r1.<init>()
            r1.f17188i = r2
            r1.f17187h = r3
            r1.f17189j = r4
            r1.f17190k = r5
            r1.f17191l = r6
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r8 = this;
            int r0 = r8.f17186g
            switch(r0) {
                case 0: goto L4f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f17189j
            r3 = r0
            fg.l r3 = (fg.l) r3
            java.lang.Object r0 = r8.f17190k
            r5 = r0
            db.c r5 = (db.c) r5
            java.lang.Object r0 = r8.f17191l
            r6 = r0
            fg.a r6 = (fg.a) r6
            r.d r9 = (r.d) r9
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r9.getClass()
            r9 = r11 & 17
            r0 = 16
            r7 = 1
            if (r9 == r0) goto L2a
            r9 = r7
            goto L2b
        L2a:
            r9 = 0
        L2b:
            r11 = r11 & r7
            boolean r9 = r10.S(r11, r9)
            if (r9 == 0) goto L49
            bi.j r1 = new bi.j
            int r2 = r8.f17187h
            boolean r4 = r8.f17188i
            r1.<init>(r2, r3, r4, r5, r6)
            r9 = -723003324(0xffffffffd4e7d844, float:-7.966126E12)
            s0.d r9 = s0.i.e(r9, r1, r10)
            r11 = 48
            r0 = 0
            wb.ho.C3(r0, r9, r10, r11, r7)
            goto L4c
        L49:
            r10.V()
        L4c:
            sf.n r9 = sf.n.f12433a
            return r9
        L4f:
            java.lang.Object r0 = r8.f17189j
            qg.t r0 = (qg.t) r0
            java.lang.Object r1 = r8.f17190k
            i0.f1 r1 = (i0.f1) r1
            java.lang.Object r2 = r8.f17191l
            i.c r2 = (i.c) r2
            xb.i r9 = (xb.i) r9
            u2.l r10 = (u2.l) r10
            e1.b r11 = (e1.b) r11
            r9.getClass()
            float r10 = r1.g()
            r3 = 0
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 <= 0) goto Lc2
            float r10 = r9.b()
            long r4 = r11.f2294a
            r6 = 32
            long r4 = r4 >> r6
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r1 = r1.g()
            float r4 = r4 / r1
            boolean r1 = r8.f17188i
            if (r1 == 0) goto L87
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L89
        L87:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L89:
            float r4 = r4 * r1
            float r4 = r4 + r10
            int r10 = r8.f17187h
            int r10 = r10 + (-1)
            float r10 = (float) r10
            int r1 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r1 >= 0) goto L95
            goto L96
        L95:
            r3 = r4
        L96:
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 <= 0) goto L9b
            goto L9c
        L9b:
            r10 = r3
        L9c:
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            lg.a r1 = r9.f21483b
            java.lang.Comparable r10 = r9.e0.t(r10, r1)
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            qg.t r1 = r9.f21482a
            xb.h r3 = new xb.h
            r4 = 0
            r3.<init>(r9, r10, r4)
            r9 = 3
            qg.v.q(r1, r4, r3, r9)
            ci.j r10 = new ci.j
            r1 = 20
            r10.<init>(r2, r11, r4, r1)
            qg.v.q(r0, r4, r10, r9)
        Lc2:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
