package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends d7.g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d7.h f2052t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d7.d f2053u;

    @Override // d7.g
    public final long X() {
            r3 = this;
            d7.h r0 = r3.f2052t
            r1 = 8
            if (r0 == 0) goto Lb
            long r0 = r0.N(r1)
            return r0
        Lb:
            boolean r0 = r3.g0()
            if (r0 == 0) goto L20
            int r0 = r3.f2039o
            int r2 = r3.b0()
            int r2 = r2 + r0
            int r2 = r2 + r1
            byte[] r0 = r3.f11553k
            long r0 = k7.a.t(r0, r2)
            return r0
        L20:
            int r0 = r3.d0()
            long r0 = r3.N(r0)
            return r0
    }

    @Override // d7.g
    public final long Y() {
            r2 = this;
            d7.h r0 = r2.f2052t
            if (r0 == 0) goto La
            r1 = 4
            long r0 = r0.N(r1)
            return r0
        La:
            long r0 = super.Y()
            return r0
    }

    @Override // d7.g
    public final long e0() {
            r2 = this;
            d7.h r0 = r2.f2052t
            if (r0 == 0) goto Lb
            r1 = 12
            long r0 = r0.N(r1)
            return r0
        Lb:
            boolean r0 = r2.g0()
            if (r0 == 0) goto L21
            int r0 = r2.f2039o
            int r1 = r2.b0()
            int r1 = r1 + r0
            int r1 = r1 + 4
            byte[] r0 = r2.f11553k
            long r0 = k7.a.t(r0, r1)
            return r0
        L21:
            int r0 = r2.f2040p
            int r0 = r0 + 16
            long r0 = r2.N(r0)
            return r0
    }

    @Override // d7.g
    public final void l0(long r3) {
            r2 = this;
            d7.h r0 = r2.f2052t
            if (r0 == 0) goto Le
            r1 = 4
            r0.Q(r1, r3)
            r3 = 0
            super.l0(r3)
            return
        Le:
            super.l0(r3)
            return
    }

    public final void n0(d7.d r8) {
            r7 = this;
            r7.f2053u = r8
            a5.a r0 = r7.f2041q
            int r1 = r0.f56h
            java.lang.Object r2 = r0.f57i
            d7.g r2 = (d7.g) r2
            long r3 = r7.f2043s
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L16
            long r3 = r8.f2043s
            r7.f2043s = r3
        L16:
            long r3 = r7.Y()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L25
            long r3 = r8.Y()
            r7.l0(r3)
        L25:
            long r3 = r7.e0()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L34
            long r3 = r8.e0()
            r7.q0(r3)
        L34:
            long r3 = r7.X()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L43
            long r3 = r8.X()
            r7.o0(r3)
        L43:
            int r3 = r2.O(r1)
            if (r3 != 0) goto L6c
            a5.a r8 = r8.f2041q
            java.lang.Object r3 = r8.f57i
            d7.g r3 = (d7.g) r3
            int r8 = r8.f56h
            int r8 = r3.O(r8)
            int r3 = r2.O(r1)
            if (r8 != r3) goto L5c
            goto L6c
        L5c:
            boolean r3 = r0.g()
            r2.R(r1, r8)
            boolean r8 = r0.g()
            if (r3 == r8) goto L6c
            r2.j0()
        L6c:
            return
    }

    public final void o0(long r3) {
            r2 = this;
            d7.h r0 = r2.f2052t
            if (r0 == 0) goto Lf
            r1 = 8
            r0.Q(r1, r3)
            r3 = 0
            r2.p0(r3)
            return
        Lf:
            r2.p0(r3)
            return
    }

    public final void p0(long r6) {
            r5 = this;
            boolean r0 = r5.h0()
            if (r0 != 0) goto L15
            boolean r0 = d7.g.i0(r6)
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            int r0 = r5.d0()
            r5.Q(r0, r6)
            return
        L15:
            int r0 = r5.Z()
            int r1 = r5.f2039o
            r2 = 20
            if (r0 < r2) goto L20
            goto L31
        L20:
            int r0 = r5.b0()
            int r0 = r0 + r1
            int r0 = r0 + r2
            r3 = 0
            r5.M(r0, r3)
            int r0 = r5.f2040p
            int r0 = r0 + 22
            r5.R(r0, r2)
        L31:
            int r0 = r5.d0()
            r2 = -1
            byte[] r3 = r5.f11553k
            k7.a.D(r3, r0, r2)
            int r0 = r5.b0()
            int r0 = r0 + r1
            int r1 = r0 + 8
            byte[] r2 = r5.f11553k
            int r0 = r0 + 16
            int r3 = r2.length
            if (r0 <= r3) goto L4a
            goto L59
        L4a:
            if (r1 >= r0) goto L59
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r6
            int r3 = (int) r3
            byte r3 = (byte) r3
            r2[r1] = r3
            r3 = 8
            long r6 = r6 >>> r3
            int r1 = r1 + 1
            goto L4a
        L59:
            return
    }

    public final void q0(long r3) {
            r2 = this;
            d7.h r0 = r2.f2052t
            if (r0 == 0) goto Lf
            r1 = 12
            r0.Q(r1, r3)
            r3 = 0
            r2.r0(r3)
            return
        Lf:
            r2.r0(r3)
            return
    }

    public final void r0(long r6) {
            r5 = this;
            boolean r0 = r5.h0()
            int r1 = r5.f2040p
            if (r0 != 0) goto L15
            boolean r0 = d7.g.i0(r6)
            if (r0 == 0) goto Lf
            goto L15
        Lf:
            int r1 = r1 + 16
            r5.Q(r1, r6)
            return
        L15:
            int r0 = r5.Z()
            int r2 = r5.f2039o
            r3 = 20
            if (r0 < r3) goto L20
            goto L2f
        L20:
            int r0 = r5.b0()
            int r0 = r0 + r2
            int r0 = r0 + r3
            r4 = 0
            r5.M(r0, r4)
            int r0 = r1 + 22
            r5.R(r0, r3)
        L2f:
            int r1 = r1 + 16
            r0 = -1
            byte[] r3 = r5.f11553k
            k7.a.D(r3, r1, r0)
            int r0 = r5.b0()
            int r0 = r0 + r2
            int r1 = r0 + 8
            byte[] r2 = r5.f11553k
            int r0 = r0 + 16
            int r3 = r2.length
            if (r0 <= r3) goto L46
            goto L55
        L46:
            if (r1 >= r0) goto L55
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r6
            int r3 = (int) r3
            byte r3 = (byte) r3
            r2[r1] = r3
            r3 = 8
            long r6 = r6 >>> r3
            int r1 = r1 + 1
            goto L46
        L55:
            return
    }

    public final void s0() {
            r7 = this;
            d7.h r0 = r7.f2052t
            a5.a r1 = r7.f2041q
            java.lang.Object r2 = r1.f57i
            d7.g r2 = (d7.g) r2
            int r1 = r1.f56h
            r3 = 3
            byte[] r2 = r2.f11553k
            boolean r1 = k7.a.q(r2, r1, r3)
            r2 = 8
            r3 = 12
            r4 = 4
            if (r1 == 0) goto L57
            if (r0 != 0) goto L71
            d7.h r0 = new d7.h
            c7.g r1 = c7.g.f1045j
            r5 = 0
            r6 = 16
            r0.<init>(r6, r1, r5)
            int r1 = r0.p()
            if (r1 >= r4) goto L2b
            goto L34
        L2b:
            r1 = 0
            byte[] r5 = r0.f11553k
            r6 = 134695760(0x8074b50, float:4.0713614E-34)
            k7.a.D(r5, r1, r6)
        L34:
            long r5 = r7.e0()
            r0.Q(r3, r5)
            long r5 = r7.X()
            r0.Q(r2, r5)
            long r1 = r7.Y()
            r0.Q(r4, r1)
            r7.f2052t = r0
            r0 = 0
            super.l0(r0)
            r7.p0(r0)
            r7.r0(r0)
            return
        L57:
            r1 = 0
            r7.f2052t = r1
            if (r0 == 0) goto L71
            long r4 = r0.N(r4)
            super.l0(r4)
            long r3 = r0.N(r3)
            r7.r0(r3)
            long r0 = r0.N(r2)
            r7.p0(r0)
        L71:
            return
    }
}
