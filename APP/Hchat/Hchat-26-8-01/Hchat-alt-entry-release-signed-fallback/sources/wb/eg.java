package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eg implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15948h;

    public /* synthetic */ eg(android.content.Context r1, int r2) {
            r0 = this;
            r0.f15947g = r2
            r0.f15948h = r1
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r0 = r3.f15947g
            r.d r4 = (r.d) r4
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            switch(r0) {
                case 0: goto L77;
                case 1: goto L4c;
                case 2: goto L30;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 0
            r2 = 1
            if (r4 == r0) goto L1c
            r4 = r2
            goto L1d
        L1c:
            r4 = r1
        L1d:
            r6 = r6 & r2
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L2a
            android.content.Context r4 = r3.f15948h
            wb.ho.U3(r4, r5, r1)
            goto L2d
        L2a:
            r5.V()
        L2d:
            sf.n r4 = sf.n.f12433a
            return r4
        L30:
            r0 = 16
            r1 = 0
            r2 = 1
            if (r4 == r0) goto L38
            r4 = r2
            goto L39
        L38:
            r4 = r1
        L39:
            r6 = r6 & r2
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L46
            android.content.Context r4 = r3.f15948h
            wb.ho.k1(r4, r5, r1)
            goto L49
        L46:
            r5.V()
        L49:
            sf.n r4 = sf.n.f12433a
            return r4
        L4c:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto L53
            r4 = r1
            goto L54
        L53:
            r4 = 0
        L54:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L71
            wb.ha r4 = new wb.ha
            r6 = 5
            android.content.Context r0 = r3.f15948h
            r4.<init>(r0, r6)
            r6 = -717054069(0xffffffffd5429f8b, float:-1.3374405E13)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto L74
        L71:
            r5.V()
        L74:
            sf.n r4 = sf.n.f12433a
            return r4
        L77:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto L7e
            r4 = r1
            goto L7f
        L7e:
            r4 = 0
        L7f:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L9c
            wb.ha r4 = new wb.ha
            r6 = 4
            android.content.Context r0 = r3.f15948h
            r4.<init>(r0, r6)
            r6 = -1957811097(0xffffffff8b4e2c67, float:-3.970756E-32)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto L9f
        L9c:
            r5.V()
        L9f:
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
