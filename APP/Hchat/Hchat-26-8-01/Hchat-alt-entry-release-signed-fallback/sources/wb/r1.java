package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r1 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f18751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f18752i;

    public /* synthetic */ r1(java.util.List r1, fg.l r2, int r3) {
            r0 = this;
            r0.f18750g = r3
            r0.f18751h = r1
            r0.f18752i = r2
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int r0 = r4.f18750g
            r.d r5 = (r.d) r5
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.getClass()
            r5 = r7 & 17
            switch(r0) {
                case 0: goto L9e;
                case 1: goto L70;
                case 2: goto L42;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r5 == r0) goto L1b
            r5 = r1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            r7 = r7 & r1
            boolean r5 = r6.S(r7, r5)
            if (r5 == 0) goto L3c
            wb.z1 r5 = new wb.z1
            r7 = 5
            r0 = 0
            java.util.List r2 = r4.f18751h
            fg.l r3 = r4.f18752i
            r5.<init>(r2, r3, r7, r0)
            r7 = 778765338(0x2e6b041a, float:5.3436457E-11)
            s0.d r5 = s0.i.e(r7, r5, r6)
            r7 = 48
            r0 = 0
            wb.ho.C3(r0, r5, r6, r7, r1)
            goto L3f
        L3c:
            r6.V()
        L3f:
            sf.n r5 = sf.n.f12433a
            return r5
        L42:
            r0 = 16
            r1 = 1
            if (r5 == r0) goto L49
            r5 = r1
            goto L4a
        L49:
            r5 = 0
        L4a:
            r7 = r7 & r1
            boolean r5 = r6.S(r7, r5)
            if (r5 == 0) goto L6a
            wb.z1 r5 = new wb.z1
            r7 = 2
            r0 = 0
            java.util.List r2 = r4.f18751h
            fg.l r3 = r4.f18752i
            r5.<init>(r2, r3, r7, r0)
            r7 = -243506492(0xfffffffff17c62c4, float:-1.249754E30)
            s0.d r5 = s0.i.e(r7, r5, r6)
            r7 = 48
            r0 = 0
            wb.ho.C3(r0, r5, r6, r7, r1)
            goto L6d
        L6a:
            r6.V()
        L6d:
            sf.n r5 = sf.n.f12433a
            return r5
        L70:
            r0 = 16
            r1 = 1
            if (r5 == r0) goto L77
            r5 = r1
            goto L78
        L77:
            r5 = 0
        L78:
            r7 = r7 & r1
            boolean r5 = r6.S(r7, r5)
            if (r5 == 0) goto L98
            wb.z1 r5 = new wb.z1
            r7 = 1
            r0 = 0
            java.util.List r2 = r4.f18751h
            fg.l r3 = r4.f18752i
            r5.<init>(r2, r3, r7, r0)
            r7 = -446689557(0xffffffffe5600eeb, float:-6.613033E22)
            s0.d r5 = s0.i.e(r7, r5, r6)
            r7 = 48
            r0 = 0
            wb.ho.C3(r0, r5, r6, r7, r1)
            goto L9b
        L98:
            r6.V()
        L9b:
            sf.n r5 = sf.n.f12433a
            return r5
        L9e:
            r0 = 16
            r1 = 1
            if (r5 == r0) goto La5
            r5 = r1
            goto La6
        La5:
            r5 = 0
        La6:
            r7 = r7 & r1
            boolean r5 = r6.S(r7, r5)
            if (r5 == 0) goto Lc6
            wb.z1 r5 = new wb.z1
            r7 = 0
            r0 = 0
            java.util.List r2 = r4.f18751h
            fg.l r3 = r4.f18752i
            r5.<init>(r2, r3, r7, r0)
            r7 = -382259583(0xffffffffe9372e81, float:-1.3840815E25)
            s0.d r5 = s0.i.e(r7, r5, r6)
            r7 = 48
            r0 = 0
            wb.ho.C3(r0, r5, r6, r7, r1)
            goto Lc9
        Lc6:
            r6.V()
        Lc9:
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
