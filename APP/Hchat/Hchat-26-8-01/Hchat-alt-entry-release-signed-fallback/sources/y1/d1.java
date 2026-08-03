package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y1.f1 f21874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y1.t f21875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.p f21876j;

    public d1(y1.f1 r1, y1.t r2, fg.p r3, int r4) {
            r0 = this;
            r4 = 1
            r0.f21873g = r4
            r0.f21874h = r1
            r0.f21875i = r2
            r0.f21876j = r3
            r1 = 2
            r0.<init>(r1)
            return
    }

    public d1(y1.t r2, y1.f1 r3, fg.p r4) {
            r1 = this;
            r0 = 0
            r1.f21873g = r0
            r1.f21875i = r2
            r1.f21874h = r3
            r1.f21876j = r4
            r2 = 2
            r1.<init>(r2)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.f21873g
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            i0.h0 r5 = (i0.h0) r5
            java.lang.Number r6 = (java.lang.Number) r6
            r6.intValue()
            r6 = 1
            int r6 = i0.r.C(r6)
            y1.f1 r0 = r4.f21874h
            y1.t r1 = r4.f21875i
            fg.p r2 = r4.f21876j
            r0.a(r1, r2, r5, r6)
            sf.n r5 = sf.n.f12433a
            return r5
        L1d:
            i0.h0 r5 = (i0.h0) r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0 = r6 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L2e
            r0 = r2
            goto L2f
        L2e:
            r0 = r3
        L2f:
            r6 = r6 & r2
            boolean r6 = r5.S(r6, r0)
            if (r6 == 0) goto L4b
            r6 = 866651995(0x33a80f5b, float:7.825903E-8)
            r5.a0(r6)
            y1.f1 r6 = r4.f21874h
            y1.p0 r6 = r6.f21898k
            fg.p r0 = r4.f21876j
            y1.t r1 = r4.f21875i
            y1.h1.a(r1, r6, r0, r5, r3)
            r5.p(r3)
            goto L4e
        L4b:
            r5.V()
        L4e:
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
