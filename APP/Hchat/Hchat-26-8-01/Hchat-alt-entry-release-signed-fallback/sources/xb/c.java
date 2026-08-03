package xb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends yf.i implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xb.i f21464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f21465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ qg.t f21466j;

    public c(xb.i r1, float r2, qg.t r3, wf.c r4) {
            r0 = this;
            r0.f21464h = r1
            r0.f21465i = r2
            r0.f21466j = r3
            r1 = 1
            r0.<init>(r1, r4)
            return
    }

    @Override // yf.a
    public final wf.c create(wf.c r5) {
            r4 = this;
            xb.c r0 = new xb.c
            float r1 = r4.f21465i
            qg.t r2 = r4.f21466j
            xb.i r3 = r4.f21464h
            r0.<init>(r3, r1, r2, r5)
            return r0
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            wf.c r2 = (wf.c) r2
            wf.c r2 = r1.create(r2)
            xb.c r2 = (xb.c) r2
            sf.n r0 = sf.n.f12433a
            r2.invokeSuspend(r0)
            return r0
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            f8.i.I0(r7)
            xb.i r7 = r6.f21464h
            m.a r0 = r7.f21498q
            java.lang.Object r0 = r0.f8069h
            t1.b r0 = (t1.b) r0
            t1.d r1 = r0.f12980a
            t1.a[] r2 = r1.f12989d
            r3 = 0
            tf.l.x0(r3, r2)
            r2 = 0
            r1.f12990e = r2
            t1.d r1 = r0.f12981b
            t1.a[] r4 = r1.f12989d
            tf.l.x0(r3, r4)
            r1.f12990e = r2
            r1 = 0
            r0.f12982c = r1
            qg.t r0 = r7.f21482a
            ci.u r1 = new ci.u
            r2 = 7
            r1.<init>(r7, r3, r2)
            r2 = 3
            qg.v.q(r0, r3, r1, r2)
            java.lang.Float r1 = new java.lang.Float
            float r4 = r6.f21465i
            r1.<init>(r4)
            lg.a r4 = r7.f21483b
            java.lang.Comparable r1 = r9.e0.t(r1, r4)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            xb.a r4 = new xb.a
            r5 = 0
            r4.<init>(r7, r1, r3, r5)
            qg.t r1 = r6.f21466j
            qg.v.q(r1, r3, r4, r2)
            i.c r4 = r7.f21493l
            java.lang.Object r4 = r4.d()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L5f
            goto L68
        L5f:
            xb.b r4 = new xb.b
            r5 = 0
            r4.<init>(r7, r3, r5)
            qg.v.q(r1, r3, r4, r2)
        L68:
            ci.j r1 = new ci.j
            r4 = 24
            r1.<init>(r7, r3, r4)
            qg.v.q(r0, r3, r1, r2)
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
