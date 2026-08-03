package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11169i;

    public /* synthetic */ i(int r1, int r2, fg.l r3) {
            r0 = this;
            r2 = 1
            r0.f11167g = r2
            r0.<init>()
            r0.f11168h = r1
            r0.f11169i = r3
            return
    }

    public /* synthetic */ i(r.k r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f11167g = r0
            r1.<init>()
            r1.f11169i = r2
            r1.f11168h = r3
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.f11167g
            switch(r0) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.f11169i
            fg.l r0 = (fg.l) r0
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            r7.getClass()
            r7 = 391(0x187, float:5.48E-43)
            int r7 = i0.r.C(r7)
            int r1 = r5.f11168h
            wb.ho.Y0(r1, r0, r6, r7)
            sf.n r6 = sf.n.f12433a
            return r6
        L1e:
            java.lang.Object r0 = r5.f11169i
            r.k r0 = (r.k) r0
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1 = r7 & 3
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L33
            r1 = r4
            goto L34
        L33:
            r1 = r3
        L34:
            r7 = r7 & r4
            boolean r7 = r6.S(r7, r1)
            if (r7 == 0) goto L5c
            r.h r7 = r0.f11175b
            ac.k r7 = r7.f11166a
            int r1 = r5.f11168h
            s.i r7 = r7.l(r1)
            int r2 = r7.f12025a
            int r1 = r1 - r2
            b5.c r7 = r7.f12027c
            java.lang.Object r7 = r7.f471c
            s0.d r7 = (s0.d) r7
            r.d r0 = r0.f11176c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r7.c(r0, r1, r6, r2)
            goto L5f
        L5c:
            r6.V()
        L5f:
            sf.n r6 = sf.n.f12433a
            return r6
    }
}
