package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends y0.n implements x1.n, x1.m, x1.z1, x1.m1 {
    public final i0.j1 A;
    public i0.x B;
    public long C;
    public u2.l D;
    public sg.c E;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h0.g1 f6914u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h0.h1 f6915v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k.o1 f6916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public android.view.View f6917x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public u2.c f6918y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k.n1 f6919z;

    public b1(h0.g1 r1, h0.h1 r2, k.o1 r3) {
            r0 = this;
            r0.<init>()
            r0.f6914u = r1
            r0.f6915v = r2
            r0.f6916w = r3
            i0.e r1 = i0.e.f5867j
            i0.j1 r2 = new i0.j1
            r3 = 0
            r2.<init>(r3, r1)
            r0.A = r2
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r0.C = r1
            return
    }

    @Override // x1.m
    public final void B(x1.h0 r2) {
            r1 = this;
            r2.e()
            sg.c r2 = r1.E
            if (r2 == 0) goto Lc
            sf.n r0 = sf.n.f12433a
            r2.p(r0)
        Lc:
            return
    }

    @Override // x1.m1
    public final void C0() {
            r2 = this;
            k.a1 r0 = new k.a1
            r1 = 0
            r0.<init>(r2, r1)
            x1.k.r(r2, r0)
            return
    }

    @Override // x1.z1
    public final void X0(f2.y r4) {
            r3 = this;
            f2.x r0 = k.c1.f6929a
            k.a1 r1 = new k.a1
            r2 = 1
            r1.<init>(r3, r2)
            r4.a(r0, r1)
            return
    }

    @Override // y0.n
    public final void c1() {
            r4 = this;
            r4.C0()
            r0 = 7
            r1 = 0
            r2 = 0
            sg.c r0 = sg.j.a(r1, r0, r2)
            r4.E = r0
            qg.t r0 = r4.Y0()
            ci.c r1 = new ci.c
            r3 = 6
            r1.<init>(r4, r2, r3)
            r3 = 1
            qg.v.q(r0, r2, r1, r3)
            return
    }

    @Override // y0.n
    public final void d1() {
            r1 = this;
            k.n1 r0 = r1.f6919z
            if (r0 == 0) goto L9
            k.p1 r0 = (k.p1) r0
            r0.b()
        L9:
            r0 = 0
            r1.f6919z = r0
            return
    }

    public final long k1() {
            r2 = this;
            i0.x r0 = r2.B
            if (r0 != 0) goto L10
            k.a1 r0 = new k.a1
            r1 = 2
            r0.<init>(r2, r1)
            i0.x r0 = i0.r.p(r0)
            r2.B = r0
        L10:
            i0.x r0 = r2.B
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r0.getValue()
            e1.b r0 = (e1.b) r0
            long r0 = r0.f2294a
            return r0
        L1d:
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            return r0
    }

    public final void l1() {
            r3 = this;
            k.n1 r0 = r3.f6919z
            if (r0 == 0) goto L9
            k.p1 r0 = (k.p1) r0
            r0.b()
        L9:
            android.view.View r0 = r3.f6917x
            if (r0 != 0) goto L11
            android.view.View r0 = x1.k.y(r3)
        L11:
            r3.f6917x = r0
            u2.c r1 = r3.f6918y
            if (r1 != 0) goto L1d
            x1.f0 r1 = x1.k.w(r3)
            u2.c r1 = r1.E
        L1d:
            r3.f6918y = r1
            k.o1 r2 = r3.f6916w
            k.n1 r0 = r2.b(r0, r1)
            r3.f6919z = r0
            r3.n1()
            return
    }

    public final void m1() {
            r8 = this;
            u2.c r0 = r8.f6918y
            if (r0 != 0) goto Lc
            x1.f0 r0 = x1.k.w(r8)
            u2.c r0 = r0.E
            r8.f6918y = r0
        Lc:
            h0.g1 r1 = r8.f6914u
            java.lang.Object r0 = r1.invoke(r0)
            e1.b r0 = (e1.b) r0
            long r0 = r0.f2294a
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r4 = r0 & r2
            r6 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L4d
            long r4 = r8.k1()
            long r2 = r2 & r4
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L4d
            long r2 = r8.k1()
            long r0 = e1.b.e(r2, r0)
            r8.C = r0
            k.n1 r0 = r8.f6919z
            if (r0 != 0) goto L40
            r8.l1()
        L40:
            k.n1 r0 = r8.f6919z
            if (r0 == 0) goto L49
            long r1 = r8.C
            r0.a(r1, r6)
        L49:
            r8.n1()
            return
        L4d:
            r8.C = r6
            k.n1 r0 = r8.f6919z
            if (r0 == 0) goto L58
            k.p1 r0 = (k.p1) r0
            r0.b()
        L58:
            return
    }

    public final void n1() {
            r6 = this;
            k.n1 r0 = r6.f6919z
            if (r0 != 0) goto L5
            goto L9
        L5:
            u2.c r1 = r6.f6918y
            if (r1 != 0) goto La
        L9:
            return
        La:
            k.p1 r0 = (k.p1) r0
            long r2 = r0.c()
            u2.l r4 = r6.D
            if (r4 != 0) goto L15
            goto L1b
        L15:
            long r4 = r4.f13353a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L3c
        L1b:
            h0.h1 r2 = r6.f6915v
            long r3 = r0.c()
            long r3 = r9.e0.q0(r3)
            long r3 = r1.K(r3)
            u2.h r1 = new u2.h
            r1.<init>(r3)
            r2.invoke(r1)
            long r0 = r0.c()
            u2.l r2 = new u2.l
            r2.<init>(r0)
            r6.D = r2
        L3c:
            return
    }

    @Override // x1.n
    public final void w(x1.i1 r2) {
            r1 = this;
            i0.j1 r0 = r1.A
            r0.setValue(r2)
            return
    }
}
