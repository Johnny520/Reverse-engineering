package c0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends x1.j implements x1.h, d0.d {
    public qg.e1 A;
    public final i0.x B;
    public e1.c C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b.e f965w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h0.v0 f966x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h0.w0 f967y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h0.t0 f968z;

    public n(b.e r1, h0.v0 r2, h0.w0 r3, h0.t0 r4) {
            r0 = this;
            r0.<init>()
            r0.f965w = r1
            r0.f966x = r2
            r0.f967y = r3
            r0.f968z = r4
            ab.a r1 = new ab.a
            r2 = 8
            r1.<init>(r0, r2)
            i0.x r1 = i0.r.p(r1)
            r0.B = r1
            e1.c r1 = e1.c.f2295e
            r0.C = r1
            return
    }

    @Override // d0.d
    public final long E0(v1.t r3) {
            r2 = this;
            e1.c r3 = r2.w0(r3)
            long r0 = r3.d()
            return r0
    }

    @Override // y0.n
    public final void c1() {
            r2 = this;
            b.e r0 = r2.f965w
            c0.o r1 = c0.o.f971i
            r0.f333i = r1
            r0.f332h = r2
            return
    }

    @Override // y0.n
    public final void d1() {
            r2 = this;
            b.e r0 = r2.f965w
            c0.o r1 = c0.o.f970h
            r0.f333i = r1
            r1 = 0
            r0.f332h = r1
            return
    }

    @Override // d0.d
    public final z.c j0() {
            r1 = this;
            i0.x r0 = r1.B
            java.lang.Object r0 = r0.getValue()
            z.c r0 = (z.c) r0
            return r0
    }

    @Override // d0.d
    public final e1.c w0(v1.t r2) {
            r1 = this;
            boolean r0 = r1.f21832t
            if (r0 != 0) goto L7
            e1.c r2 = r1.C
            return r2
        L7:
            h0.t0 r0 = r1.f968z
            java.lang.Object r2 = r0.invoke(r2)
            e1.c r2 = (e1.c) r2
            if (r2 != 0) goto L14
            e1.c r2 = r1.C
            return r2
        L14:
            r1.C = r2
            return r2
    }
}
