package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements i0.a2, qg.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wf.g f6028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fg.p f6029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final vg.c f6030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qg.e1 f6031j;

    public r0(wf.g r1, fg.p r2) {
            r0 = this;
            r0.<init>()
            r0.f6028g = r1
            r0.f6029h = r2
            wf.g r1 = r1.e(r0)
            vg.c r1 = qg.v.a(r1)
            r0.f6030i = r1
            return
    }

    @Override // i0.a2
    public final void d() {
            r3 = this;
            qg.e1 r0 = r3.f6031j
            if (r0 == 0) goto Ld
            i0.c0 r1 = new i0.c0
            r2 = 1
            r1.<init>(r2)
            r0.x(r1)
        Ld:
            r0 = 0
            r3.f6031j = r0
            return
    }

    @Override // wf.g
    public final wf.g e(wf.g r1) {
            r0 = this;
            wf.g r1 = f8.i.q0(r0, r1)
            return r1
    }

    @Override // i0.a2
    public final void f() {
            r3 = this;
            qg.e1 r0 = r3.f6031j
            if (r0 == 0) goto Ld
            i0.c0 r1 = new i0.c0
            r2 = 1
            r1.<init>(r2)
            r0.x(r1)
        Ld:
            r0 = 0
            r3.f6031j = r0
            return
    }

    @Override // wf.e
    public final wf.f getKey() {
            r1 = this;
            qg.q r0 = qg.q.f11089g
            return r0
    }

    @Override // i0.a2
    public final void j() {
            r4 = this;
            qg.e1 r0 = r4.f6031j
            r1 = 0
            if (r0 == 0) goto L12
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r3 = "Old job was still running!"
            r2.<init>(r3)
            r2.initCause(r1)
            r0.a(r2)
        L12:
            fg.p r0 = r4.f6029h
            r2 = 3
            vg.c r3 = r4.f6030i
            qg.e1 r0 = qg.v.q(r3, r1, r0, r2)
            r4.f6031j = r0
            return
    }

    @Override // wf.g
    public final java.lang.Object k(fg.p r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = r1.invoke(r2, r0)
            return r1
    }

    @Override // qg.r
    public final void m(java.lang.Throwable r4, wf.g r5) {
            r3 = this;
            uf.d r0 = x0.d.f20825h
            wf.e r0 = r5.s(r0)
            x0.d r0 = (x0.d) r0
            if (r0 == 0) goto L14
            wb.xi r1 = new wb.xi
            r2 = 24
            r1.<init>(r0, r2, r3)
            ig.a.b0(r4, r1)
        L14:
            wf.g r0 = r3.f6028g
            qg.q r1 = qg.q.f11089g
            wf.e r0 = r0.s(r1)
            qg.r r0 = (qg.r) r0
            if (r0 == 0) goto L24
            r0.m(r4, r5)
            return
        L24:
            throw r4
    }

    @Override // wf.g
    public final wf.e s(wf.f r1) {
            r0 = this;
            wf.e r1 = f8.i.w(r0, r1)
            return r1
    }

    @Override // wf.g
    public final wf.g t(wf.f r1) {
            r0 = this;
            wf.g r1 = f8.i.l0(r0, r1)
            return r1
    }
}
