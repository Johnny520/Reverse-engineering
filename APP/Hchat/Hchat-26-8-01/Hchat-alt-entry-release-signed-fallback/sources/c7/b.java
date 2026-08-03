package c7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7.m f1034a;

    public b(d7.m r1) {
            r0 = this;
            r0.<init>()
            r0.f1034a = r1
            return
    }

    public final d7.d a() {
            r11 = this;
            d7.m r0 = r11.f1034a
            d7.d r1 = r0.f2053u
            if (r1 != 0) goto Lec
            d7.d r1 = new d7.d
            r1.<init>()
            c7.g r2 = c7.g.f1043h
            int r2 = r1.p()
            r3 = 0
            r4 = 4
            if (r2 >= r4) goto L16
            goto L1e
        L16:
            byte[] r2 = r1.f11553k
            r5 = 33639248(0x2014b50, float:9.499037E-38)
            k7.a.D(r2, r3, r5)
        L1e:
            int r2 = r0.O(r4)
            r1.R(r4, r2)
            long r5 = r0.f2043s
            int r2 = r0.p()
            long r7 = (long) r2
            long r5 = r5 - r7
            boolean r2 = r1.h0()
            r7 = 42
            if (r2 != 0) goto L40
            boolean r2 = d7.g.i0(r5)
            if (r2 == 0) goto L3c
            goto L40
        L3c:
            r1.Q(r7, r5)
            goto L7f
        L40:
            int r2 = r1.Z()
            r8 = 8
            r9 = 12
            if (r2 < r9) goto L4b
            goto L5e
        L4b:
            int r2 = r1.b0()
            int r2 = r2 + 58
            int r10 = r1.W()
            int r10 = r10 + r2
            r1.M(r10, r3)
            int r2 = r8 + 22
            r1.R(r2, r9)
        L5e:
            r2 = -1
            byte[] r3 = r1.f11553k
            k7.a.D(r3, r7, r2)
            int r2 = r1.b0()
            int r3 = r2 + 50
            byte[] r7 = r1.f11553k
            int r2 = r2 + 58
            int r9 = r7.length
            if (r2 <= r9) goto L72
            goto L7f
        L72:
            if (r3 >= r2) goto L7f
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r5
            int r9 = (int) r9
            byte r9 = (byte) r9
            r7[r3] = r9
            long r5 = r5 >>> r8
            int r3 = r3 + 1
            goto L72
        L7f:
            a5.a r2 = r0.f2041q
            java.lang.Object r3 = r2.f57i
            d7.g r3 = (d7.g) r3
            int r2 = r2.f56h
            int r2 = r3.O(r2)
            a5.a r3 = r1.f2041q
            java.lang.Object r5 = r3.f57i
            d7.g r5 = (d7.g) r5
            int r6 = r3.f56h
            int r7 = r5.O(r6)
            if (r2 != r7) goto L9a
            goto Laa
        L9a:
            boolean r7 = r3.g()
            r5.R(r6, r2)
            boolean r2 = r3.g()
            if (r7 == r2) goto Laa
            r5.j0()
        Laa:
            int r2 = r0.c0()
            int r3 = r1.f2040p
            int r5 = r3 + 2
            r1.R(r5, r2)
            int r2 = r0.f2040p
            int r2 = r2 + r4
            long r4 = r0.N(r2)
            r6 = -1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto Lc7
            int r2 = r3 + 4
            r1.Q(r2, r4)
        Lc7:
            long r4 = r0.Y()
            r1.l0(r4)
            long r4 = r0.X()
            int r2 = r1.d0()
            r1.Q(r2, r4)
            long r4 = r0.e0()
            int r3 = r3 + 16
            r1.Q(r3, r4)
            java.lang.String r2 = r0.a0()
            r1.m0(r2)
            r0.n0(r1)
        Lec:
            return r1
    }

    public final long b() {
            r3 = this;
            d7.m r0 = r3.f1034a
            int r1 = r0.c0()
            r2 = 8
            if (r1 == r2) goto Lf
            long r0 = r0.e0()
            return r0
        Lf:
            long r0 = r0.X()
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            d7.m r1 = r5.f1034a
            long r2 = r1.f2043s
            r0.append(r2)
            java.lang.String r2 = "] "
            r0.append(r2)
            java.lang.String r2 = r1.a0()
            r0.append(r2)
            d7.d r2 = r5.a()
            java.lang.String r2 = r2.n0()
            r0.append(r2)
            long r1 = r1.Y()
            r3 = 8
            java.lang.String r4 = " 0x"
            java.lang.String r1 = y7.a.m(r3, r4, r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
