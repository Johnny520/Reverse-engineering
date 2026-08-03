package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends qg.y0 implements wf.c, qg.t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wf.g f11031i;

    public a(wf.g r1, boolean r2) {
            r0 = this;
            r0.<init>(r2)
            qg.q r2 = qg.q.f11090h
            wf.e r2 = r1.s(r2)
            qg.r0 r2 = (qg.r0) r2
            r0.L(r2)
            wf.g r1 = r1.e(r0)
            r0.f11031i = r1
            return
    }

    @Override // qg.y0
    public final void K(af.d r2) {
            r1 = this;
            wf.g r0 = r1.f11031i
            qg.v.m(r2, r0)
            return
    }

    @Override // qg.y0
    public final void S(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof qg.n
            if (r0 == 0) goto L17
            qg.n r3 = (qg.n) r3
            java.lang.Throwable r0 = r3.f11082a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = qg.n.f11081b
            int r3 = r1.get(r3)
            if (r3 == 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            r2.a0(r0, r3)
            return
        L17:
            r2.b0(r3)
            return
    }

    public void a0(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            return
    }

    public void b0(java.lang.Object r1) {
            r0 = this;
            return
    }

    public final void c0(qg.u r4, qg.a r5, fg.p r6) {
            r3 = this;
            int r4 = r4.ordinal()
            sf.n r0 = sf.n.f12433a
            if (r4 == 0) goto L57
            r1 = 1
            if (r4 == r1) goto L56
            r1 = 2
            if (r4 == r1) goto L48
            r0 = 3
            if (r4 != r0) goto L44
            wf.g r4 = r3.f11031i     // Catch: java.lang.Throwable -> L35
            r0 = 0
            java.lang.Object r0 = vg.a.l(r4, r0)     // Catch: java.lang.Throwable -> L35
            boolean r2 = r6 instanceof yf.a     // Catch: java.lang.Throwable -> L21
            if (r2 != 0) goto L23
            java.lang.Object r5 = fb.v0.Q(r6, r5, r3)     // Catch: java.lang.Throwable -> L21
            goto L2a
        L21:
            r5 = move-exception
            goto L37
        L23:
            gg.x.c(r1, r6)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r5 = r6.invoke(r5, r3)     // Catch: java.lang.Throwable -> L21
        L2a:
            vg.a.g(r4, r0)     // Catch: java.lang.Throwable -> L35
            xf.a r4 = xf.a.f21579g
            if (r5 == r4) goto L56
            r3.resumeWith(r5)
            return
        L35:
            r4 = move-exception
            goto L3b
        L37:
            vg.a.g(r4, r0)     // Catch: java.lang.Throwable -> L35
            throw r5     // Catch: java.lang.Throwable -> L35
        L3b:
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r3.resumeWith(r5)
            return
        L44:
            okio.a.k()
            return
        L48:
            r6.getClass()
            wf.c r4 = fb.v0.j(r6, r5, r3)
            wf.c r4 = fb.v0.x(r4)
            r4.resumeWith(r0)
        L56:
            return
        L57:
            wf.c r4 = fb.v0.j(r6, r5, r3)     // Catch: java.lang.Throwable -> L63
            wf.c r4 = fb.v0.x(r4)     // Catch: java.lang.Throwable -> L63
            vg.a.h(r0, r4)     // Catch: java.lang.Throwable -> L63
            return
        L63:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r3.resumeWith(r5)
            throw r4
    }

    @Override // wf.c
    public final wf.g getContext() {
            r1 = this;
            wf.g r0 = r1.f11031i
            return r0
    }

    @Override // qg.t
    public final wf.g n() {
            r1 = this;
            wf.g r0 = r1.f11031i
            return r0
    }

    @Override // wf.c
    public final void resumeWith(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r0 = sf.g.b(r3)
            if (r0 != 0) goto L7
            goto Ld
        L7:
            qg.n r3 = new qg.n
            r1 = 0
            r3.<init>(r0, r1)
        Ld:
            java.lang.Object r3 = r2.O(r3)
            l3.q r0 = qg.v.f11106e
            if (r3 != r0) goto L16
            return
        L16:
            r2.u(r3)
            return
    }

    @Override // qg.y0
    public final java.lang.String z() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = " was cancelled"
            java.lang.String r0 = r0.concat(r1)
            return r0
    }
}
