package a1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f27g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f28h;

    public /* synthetic */ h(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f27g = r2
            r0.f28h = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    public /* synthetic */ h(y1.a r1, int r2, int r3) {
            r0 = this;
            r0.f27g = r3
            r0.f28h = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.f27g
            switch(r0) {
                case 0: goto Lf6;
                case 1: goto Lda;
                case 2: goto Lb0;
                case 3: goto L89;
                case 4: goto L73;
                case 5: goto L31;
                case 6: goto L1b;
                default: goto L5;
            }
        L5:
            i0.h0 r5 = (i0.h0) r5
            java.lang.Number r6 = (java.lang.Number) r6
            r6.intValue()
            java.lang.Object r6 = r4.f28h
            y2.x r6 = (y2.x) r6
            r0 = 1
            int r0 = i0.r.C(r0)
            r6.a(r5, r0)
            sf.n r5 = sf.n.f12433a
            return r5
        L1b:
            i0.h0 r5 = (i0.h0) r5
            java.lang.Number r6 = (java.lang.Number) r6
            r6.intValue()
            java.lang.Object r6 = r4.f28h
            y2.t r6 = (y2.t) r6
            r0 = 1
            int r0 = i0.r.C(r0)
            r6.a(r5, r0)
            sf.n r5 = sf.n.f12433a
            return r5
        L31:
            i0.h0 r5 = (i0.h0) r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0 = r6 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L42
            r0 = r2
            goto L43
        L42:
            r0 = r3
        L43:
            r6 = r6 & r2
            boolean r6 = r5.S(r6, r0)
            if (r6 == 0) goto L6d
            java.lang.Object r6 = r5.P()
            i0.e r0 = i0.l.f5952a
            if (r6 != r0) goto L57
            y2.c r6 = y2.c.f22194h
            r5.k0(r6)
        L57:
            fg.l r6 = (fg.l) r6
            y0.l r0 = y0.l.f21818a
            y0.o r6 = f2.o.a(r0, r6)
            java.lang.Object r0 = r4.f28h
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r0 = r0.getValue()
            fg.p r0 = (fg.p) r0
            x6.d.f(r6, r0, r5, r3)
            goto L70
        L6d:
            r5.V()
        L70:
            sf.n r5 = sf.n.f12433a
            return r5
        L73:
            i0.h0 r5 = (i0.h0) r5
            java.lang.Number r6 = (java.lang.Number) r6
            r6.intValue()
            java.lang.Object r6 = r4.f28h
            y1.c1 r6 = (y1.c1) r6
            r0 = 1
            int r0 = i0.r.C(r0)
            r6.a(r5, r0)
            sf.n r5 = sf.n.f12433a
            return r5
        L89:
            i0.h0 r5 = (i0.h0) r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0 = r6 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L9a
            r0 = r3
            goto L9b
        L9a:
            r0 = r2
        L9b:
            r6 = r6 & r3
            boolean r6 = r5.S(r6, r0)
            if (r6 == 0) goto Laa
            java.lang.Object r6 = r4.f28h
            y1.a r6 = (y1.a) r6
            r6.a(r5, r2)
            goto Lad
        Laa:
            r5.V()
        Lad:
            sf.n r5 = sf.n.f12433a
            return r5
        Lb0:
            y0.o r5 = (y0.o) r5
            y0.m r6 = (y0.m) r6
            java.lang.Object r0 = r4.f28h
            i0.h0 r0 = (i0.h0) r0
            boolean r1 = r6 instanceof y0.j
            if (r1 == 0) goto Ld5
            y0.j r6 = (y0.j) r6
            fg.q r6 = r6.f21816a
            r1 = 3
            gg.x.c(r1, r6)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            y0.l r2 = y0.l.f21818a
            java.lang.Object r6 = r6.b(r2, r0, r1)
            y0.o r6 = (y0.o) r6
            y0.o r6 = y0.a.b(r0, r6)
        Ld5:
            y0.o r5 = r5.d(r6)
            return r5
        Lda:
            h.f0 r5 = (h.f0) r5
            h.f0 r6 = (h.f0) r6
            h.f0 r0 = h.f0.f4661i
            if (r5 != r0) goto Lf0
            if (r6 != r0) goto Lf0
            java.lang.Object r5 = r4.f28h
            h.s0 r5 = (h.s0) r5
            h.h1 r5 = r5.f4753a
            boolean r5 = r5.f4692c
            if (r5 != 0) goto Lf0
            r5 = 1
            goto Lf1
        Lf0:
            r5 = 0
        Lf1:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        Lf6:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            f2.q r6 = (f2.q) r6
            java.lang.Object r0 = r4.f28h
            a1.i r0 = (a1.i) r0
            r0.m(r5, r6)
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
