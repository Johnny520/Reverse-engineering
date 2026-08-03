package sg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends qg.a implements sg.g, sg.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sg.c f12481j;

    public o(wf.g r2, sg.c r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            r1.f12481j = r3
            return
    }

    @Override // qg.y0, qg.r0
    public final void a(java.util.concurrent.CancellationException r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11124g
            java.lang.Object r0 = r0.get(r2)
            boolean r1 = r0 instanceof qg.n
            if (r1 != 0) goto L26
            boolean r1 = r0 instanceof qg.x0
            if (r1 == 0) goto L17
            qg.x0 r0 = (qg.x0) r0
            boolean r0 = r0.e()
            if (r0 == 0) goto L17
            goto L26
        L17:
            if (r3 != 0) goto L23
            qg.s0 r3 = new qg.s0
            java.lang.String r0 = r2.z()
            r1 = 0
            r3.<init>(r0, r1, r2)
        L23:
            r2.x(r3)
        L26:
            return
    }

    @Override // qg.a
    public final void a0(java.lang.Throwable r3, boolean r4) {
            r2 = this;
            sg.c r0 = r2.f12481j
            r1 = 0
            boolean r0 = r0.h(r3, r1)
            if (r0 != 0) goto L10
            if (r4 != 0) goto L10
            wf.g r4 = r2.f11031i
            qg.v.m(r3, r4)
        L10:
            return
    }

    @Override // qg.a
    public final void b0(java.lang.Object r3) {
            r2 = this;
            sf.n r3 = (sf.n) r3
            sg.c r3 = r2.f12481j
            r0 = 0
            r1 = 0
            r3.h(r1, r0)
            return
    }

    @Override // sg.g
    public final java.lang.Object d() {
            r1 = this;
            sg.c r0 = r1.f12481j
            java.lang.Object r0 = r0.d()
            return r0
    }

    @Override // sg.g
    public final java.lang.Object f(wf.c r2) {
            r1 = this;
            sg.c r0 = r1.f12481j
            java.lang.Object r2 = r0.f(r2)
            return r2
    }

    @Override // sg.g
    public final sg.b iterator() {
            r2 = this;
            sg.c r0 = r2.f12481j
            r0.getClass()
            sg.b r1 = new sg.b
            r1.<init>(r0)
            return r1
    }

    @Override // sg.p
    public final java.lang.Object p(java.lang.Object r2) {
            r1 = this;
            sg.c r0 = r1.f12481j
            java.lang.Object r2 = r0.p(r2)
            return r2
    }

    @Override // sg.p
    public final java.lang.Object q(java.lang.Object r2, wf.c r3) {
            r1 = this;
            sg.c r0 = r1.f12481j
            java.lang.Object r2 = r0.q(r2, r3)
            return r2
    }

    @Override // qg.y0
    public final void x(java.util.concurrent.CancellationException r3) {
            r2 = this;
            sg.c r0 = r2.f12481j
            r1 = 1
            r0.h(r3, r1)
            r2.v(r3)
            return
    }
}
