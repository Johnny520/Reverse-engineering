package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dc implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.a f15683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15684i;

    public /* synthetic */ dc(android.content.Context r2, fg.a r3) {
            r1 = this;
            r0 = 4
            r1.f15682g = r0
            r1.<init>()
            r1.f15684i = r2
            r1.f15683h = r3
            return
    }

    public /* synthetic */ dc(fg.a r1, android.content.Context r2, int r3) {
            r0 = this;
            r0.f15682g = r3
            r0.f15683h = r1
            r0.f15684i = r2
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r0 = r3.f15682g
            r.d r4 = (r.d) r4
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            switch(r0) {
                case 0: goto Lb9;
                case 1: goto L8c;
                case 2: goto L5f;
                case 3: goto L32;
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
            if (r4 == 0) goto L2c
            android.content.Context r4 = r3.f15684i
            fg.a r6 = r3.f15683h
            wb.ho.V(r4, r6, r5, r1)
            goto L2f
        L2c:
            r5.V()
        L2f:
            sf.n r4 = sf.n.f12433a
            return r4
        L32:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto L39
            r4 = r1
            goto L3a
        L39:
            r4 = 0
        L3a:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L59
            wb.ta r4 = new wb.ta
            r6 = 2
            fg.a r0 = r3.f15683h
            android.content.Context r2 = r3.f15684i
            r4.<init>(r0, r2, r6)
            r6 = -1022257140(0xffffffffc311980c, float:-145.59393)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto L5c
        L59:
            r5.V()
        L5c:
            sf.n r4 = sf.n.f12433a
            return r4
        L5f:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto L66
            r4 = r1
            goto L67
        L66:
            r4 = 0
        L67:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L86
            wb.ta r4 = new wb.ta
            r6 = 1
            fg.a r0 = r3.f15683h
            android.content.Context r2 = r3.f15684i
            r4.<init>(r0, r2, r6)
            r6 = -271484842(0xffffffffefd17856, float:-1.2965569E29)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto L89
        L86:
            r5.V()
        L89:
            sf.n r4 = sf.n.f12433a
            return r4
        L8c:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto L93
            r4 = r1
            goto L94
        L93:
            r4 = 0
        L94:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto Lb3
            wb.ta r4 = new wb.ta
            r6 = 3
            fg.a r0 = r3.f15683h
            android.content.Context r2 = r3.f15684i
            r4.<init>(r0, r2, r6)
            r6 = 32994320(0x1f77410, float:9.090001E-38)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto Lb6
        Lb3:
            r5.V()
        Lb6:
            sf.n r4 = sf.n.f12433a
            return r4
        Lb9:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto Lc0
            r4 = r1
            goto Lc1
        Lc0:
            r4 = 0
        Lc1:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto Le0
            wb.ta r4 = new wb.ta
            r6 = 4
            fg.a r0 = r3.f15683h
            android.content.Context r2 = r3.f15684i
            r4.<init>(r0, r2, r6)
            r6 = 1817953246(0x6c5bc3de, float:1.06271884E27)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto Le3
        Le0:
            r5.V()
        Le3:
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
