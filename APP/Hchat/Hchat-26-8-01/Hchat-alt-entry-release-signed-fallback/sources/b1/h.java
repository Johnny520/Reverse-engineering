package b1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends y0.n implements x1.e2, x1.u {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b1.h f441u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b1.h f442v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f443w;

    @Override // x1.e2
    public final java.lang.Object F() {
            r1 = this;
            b1.d r0 = b1.d.f432a
            return r0
    }

    @Override // y0.n
    public final void d1() {
            r1 = this;
            r0 = 0
            r1.f442v = r0
            r1.f441u = r0
            return
    }

    @Override // x1.u, x1.w0
    public final void e(long r1) {
            r0 = this;
            r0.f443w = r1
            return
    }

    public final boolean k1() {
            r1 = this;
            b1.h r0 = r1.f441u
            if (r0 != 0) goto Lf
            b1.h r0 = r1.f442v
            if (r0 == 0) goto Ld
            boolean r0 = r0.k1()
            return r0
        Ld:
            r0 = 0
            return r0
        Lf:
            boolean r0 = r0.k1()
            return r0
    }

    public final void l1() {
            r1 = this;
            b1.h r0 = r1.f442v
            if (r0 != 0) goto Lc
            b1.h r0 = r1.f441u
            if (r0 == 0) goto Lb
            r0.l1()
        Lb:
            return
        Lc:
            r0.l1()
            return
    }

    public final void m1() {
            r1 = this;
            b1.h r0 = r1.f442v
            if (r0 == 0) goto L7
            r0.m1()
        L7:
            b1.h r0 = r1.f441u
            if (r0 == 0) goto Le
            r0.m1()
        Le:
            r0 = 0
            r1.f441u = r0
            return
    }

    public final void n1(androidx.lifecycle.x r5) {
            r4 = this;
            b1.h r0 = r4.f441u
            if (r0 == 0) goto L11
            long r1 = x6.d.C(r5)
            boolean r1 = r9.e0.h(r0, r1)
            r2 = 1
            if (r1 != r2) goto L11
            r1 = r0
            goto L2d
        L11:
            y0.n r1 = r4.f21819g
            boolean r1 = r1.f21832t
            if (r1 != 0) goto L19
            r1 = 0
            goto L2b
        L19:
            gg.u r1 = new gg.u
            r1.<init>()
            b1.g r2 = new b1.g
            r3 = 0
            r2.<init>(r1, r4, r5, r3)
            x1.k.B(r4, r2)
            java.lang.Object r1 = r1.f4564g
            x1.e2 r1 = (x1.e2) r1
        L2b:
            b1.h r1 = (b1.h) r1
        L2d:
            if (r1 == 0) goto L3f
            if (r0 != 0) goto L3f
            r1.l1()
            r1.n1(r5)
            b1.h r5 = r4.f442v
            if (r5 == 0) goto L72
            r5.m1()
            goto L72
        L3f:
            if (r1 != 0) goto L51
            if (r0 == 0) goto L51
            b1.h r2 = r4.f442v
            if (r2 == 0) goto L4d
            r2.l1()
            r2.n1(r5)
        L4d:
            r0.m1()
            goto L72
        L51:
            boolean r2 = gg.l.a(r1, r0)
            if (r2 != 0) goto L65
            if (r1 == 0) goto L5f
            r1.l1()
            r1.n1(r5)
        L5f:
            if (r0 == 0) goto L72
            r0.m1()
            goto L72
        L65:
            if (r1 == 0) goto L6b
            r1.n1(r5)
            goto L72
        L6b:
            b1.h r0 = r4.f442v
            if (r0 == 0) goto L72
            r0.n1(r5)
        L72:
            r4.f441u = r1
            return
    }

    public final void o1() {
            r1 = this;
            b1.h r0 = r1.f442v
            if (r0 != 0) goto Lc
            b1.h r0 = r1.f441u
            if (r0 == 0) goto Lb
            r0.o1()
        Lb:
            return
        Lc:
            r0.o1()
            return
    }
}
