package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r.k f11171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11173j;

    public /* synthetic */ j(int r2, java.lang.Object r3, r.k r4) {
            r1 = this;
            r0 = 1
            r1.f11170g = r0
            r1.<init>()
            r1.f11171h = r4
            r1.f11172i = r2
            r1.f11173j = r3
            return
    }

    public /* synthetic */ j(r.k r1, int r2, java.lang.Object r3, int r4) {
            r0 = this;
            r4 = 0
            r0.f11170g = r4
            r0.<init>()
            r0.f11171h = r1
            r0.f11172i = r2
            r0.f11173j = r3
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.f11170g
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            switch(r0) {
                case 0: goto L2e;
                default: goto L9;
            }
        L9:
            int r6 = r6.intValue()
            r0 = r6 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L16
            r0 = r3
            goto L17
        L16:
            r0 = r2
        L17:
            r6 = r6 & r3
            boolean r6 = r5.S(r6, r0)
            if (r6 == 0) goto L28
            r.k r6 = r4.f11171h
            int r0 = r4.f11172i
            java.lang.Object r1 = r4.f11173j
            r6.a(r0, r1, r5, r2)
            goto L2b
        L28:
            r5.V()
        L2b:
            sf.n r5 = sf.n.f12433a
            return r5
        L2e:
            r6.getClass()
            r6 = 1
            int r6 = i0.r.C(r6)
            r.k r0 = r4.f11171h
            int r1 = r4.f11172i
            java.lang.Object r2 = r4.f11173j
            r0.a(r1, r2, r5, r6)
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
