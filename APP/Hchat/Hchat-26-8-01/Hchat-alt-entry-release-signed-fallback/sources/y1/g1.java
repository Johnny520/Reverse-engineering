package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.p f21915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f21916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f21917j;

    public /* synthetic */ g1(java.lang.Object r1, java.lang.Object r2, fg.p r3, int r4, int r5) {
            r0 = this;
            r0.f21914g = r5
            r0.f21916i = r1
            r0.f21917j = r2
            r0.f21915h = r3
            r1 = 2
            r0.<init>(r1)
            return
    }

    public g1(y1.x2 r2, y1.f1 r3, fg.p r4) {
            r1 = this;
            r0 = 1
            r1.f21914g = r0
            r1.f21916i = r2
            r1.f21917j = r3
            r1.f21915h = r4
            r2 = 2
            r1.<init>(r2)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.f21914g
            switch(r0) {
                case 0: goto L8a;
                case 1: goto L24;
                default: goto L5;
            }
        L5:
            i0.h0 r7 = (i0.h0) r7
            java.lang.Number r8 = (java.lang.Number) r8
            r8.intValue()
            java.lang.Object r8 = r6.f21916i
            fg.a r8 = (fg.a) r8
            java.lang.Object r0 = r6.f21917j
            y2.u r0 = (y2.u) r0
            fg.p r1 = r6.f21915h
            s0.d r1 = (s0.d) r1
            r2 = 385(0x181, float:5.4E-43)
            int r2 = i0.r.C(r2)
            x6.d.a(r8, r0, r1, r7, r2)
            sf.n r7 = sf.n.f12433a
            return r7
        L24:
            i0.h0 r7 = (i0.h0) r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r0 = r6.f21916i
            y1.x2 r0 = (y1.x2) r0
            r1 = r8 & 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L39
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            r8 = r8 & r3
            boolean r8 = r7.S(r8, r1)
            if (r8 == 0) goto L84
            y1.t r8 = r0.f22156g
            boolean r1 = r7.h(r0)
            java.lang.Object r2 = r7.P()
            r3 = 0
            i0.e r5 = i0.l.f5952a
            if (r1 != 0) goto L52
            if (r2 != r5) goto L5b
        L52:
            y1.w2 r2 = new y1.w2
            r1 = 0
            r2.<init>(r0, r3, r1)
            r7.k0(r2)
        L5b:
            fg.p r2 = (fg.p) r2
            i0.r.f(r2, r7, r8)
            boolean r1 = r7.h(r0)
            java.lang.Object r2 = r7.P()
            if (r1 != 0) goto L6c
            if (r2 != r5) goto L75
        L6c:
            y1.w2 r2 = new y1.w2
            r1 = 1
            r2.<init>(r0, r3, r1)
            r7.k0(r2)
        L75:
            fg.p r2 = (fg.p) r2
            i0.r.f(r2, r7, r8)
            java.lang.Object r0 = r6.f21917j
            y1.f1 r0 = (y1.f1) r0
            fg.p r1 = r6.f21915h
            r0.a(r8, r1, r7, r4)
            goto L87
        L84:
            r7.V()
        L87:
            sf.n r7 = sf.n.f12433a
            return r7
        L8a:
            i0.h0 r7 = (i0.h0) r7
            java.lang.Number r8 = (java.lang.Number) r8
            r8.intValue()
            java.lang.Object r8 = r6.f21916i
            x1.r1 r8 = (x1.r1) r8
            java.lang.Object r0 = r6.f21917j
            y1.p0 r0 = (y1.p0) r0
            r1 = 1
            int r1 = i0.r.C(r1)
            fg.p r2 = r6.f21915h
            y1.h1.a(r8, r0, r2, r7, r1)
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
