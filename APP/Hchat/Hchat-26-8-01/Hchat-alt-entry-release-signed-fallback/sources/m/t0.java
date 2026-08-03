package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends m.p0 {
    public m.n P;
    public m.p1 Q;
    public fg.q R;
    public fg.q S;

    @Override // m.p0
    public final boolean C1() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // m.p0
    public final java.lang.Object r1(m.o0 r5, m.o0 r6) {
            r4 = this;
            m.n r0 = r4.P
            c0.m r1 = new c0.m
            r2 = 11
            r3 = 0
            r1.<init>(r5, r4, r3, r2)
            r0.getClass()
            ci.j r5 = new ci.j
            r2 = 8
            r5.<init>(r0, r1, r3, r2)
            java.lang.Object r5 = qg.v.e(r5, r6)
            sf.n r6 = sf.n.f12433a
            xf.a r0 = xf.a.f21579g
            if (r5 != r0) goto L1f
            goto L20
        L1f:
            r5 = r6
        L20:
            if (r5 != r0) goto L23
            return r5
        L23:
            return r6
    }

    @Override // m.p0
    public final void w1(long r4) {
            r3 = this;
            boolean r0 = r3.f21832t
            if (r0 == 0) goto L1d
            fg.q r0 = r3.R
            m.r0 r1 = m.s0.f8356a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto Lf
            goto L1d
        Lf:
            qg.t r0 = r3.Y0()
            h.b1 r1 = new h.b1
            r2 = 0
            r1.<init>(r3, r4, r2)
            r4 = 1
            qg.v.q(r0, r2, r1, r4)
        L1d:
            return
    }

    @Override // m.p0
    public final void x1(m.a0 r5) {
            r4 = this;
            boolean r0 = r4.f21832t
            if (r0 == 0) goto L1f
            fg.q r0 = r4.S
            m.r0 r1 = m.s0.f8357b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto Lf
            goto L1f
        Lf:
            qg.t r0 = r4.Y0()
            c0.m r1 = new c0.m
            r2 = 12
            r3 = 0
            r1.<init>(r4, r5, r3, r2)
            r5 = 1
            qg.v.q(r0, r3, r1, r5)
        L1f:
            return
    }
}
