package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends p4.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p4.f f10097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z4.g f10098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p4.f[] f10099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10100i;

    public a0(u4.t r7, p4.f r8, z4.g r9, p4.f[] r10) {
            r6 = this;
            u4.p r0 = u4.p.f13403i
            r6.<init>(r7, r0)
            if (r8 == 0) goto L5c
            if (r9 == 0) goto L55
            if (r10 == 0) goto L4e
            int r7 = r9.f22552i
            int r0 = r10.length
            if (r7 != r0) goto L47
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r7 > r0) goto L40
            r6.f10097f = r8
            r6.f10098g = r9
            r6.f10099h = r10
            r8 = 2
            r10 = 1
            if (r7 >= r8) goto L20
            goto L3d
        L20:
            long r7 = m(r9)
            int r9 = r9.f22552i
            long r0 = (long) r9
            r2 = 4
            long r0 = r0 * r2
            r4 = 2
            long r0 = r0 + r4
            r4 = 0
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 < 0) goto L3c
            r4 = 5
            long r0 = r0 * r4
            long r0 = r0 / r2
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 > 0) goto L3c
            goto L3d
        L3c:
            r10 = 0
        L3d:
            r6.f10100i = r10
            return
        L40:
            java.lang.String r7 = "too many cases"
            j8.o.t(r7)
            r7 = 0
            throw r7
        L47:
            java.lang.String r7 = "cases / targets mismatch"
            j8.o.t(r7)
            r7 = 0
            throw r7
        L4e:
            java.lang.String r7 = "targets == null"
            bsh.j.c(r7)
            r7 = 0
            throw r7
        L55:
            java.lang.String r7 = "cases == null"
            bsh.j.c(r7)
            r7 = 0
            throw r7
        L5c:
            java.lang.String r7 = "user == null"
            bsh.j.c(r7)
            r7 = 0
            throw r7
    }

    public static long m(z4.g r5) {
            int r0 = r5.f22552i
            r1 = 0
            int r1 = r5.n(r1)
            long r1 = (long) r1
            int r0 = r0 + (-1)
            int r5 = r5.n(r0)
            long r3 = (long) r5
            long r3 = r3 - r1
            r0 = 1
            long r3 = r3 + r0
            r0 = 2
            long r3 = r3 * r0
            r0 = 4
            long r3 = r3 + r0
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L21
            return r3
        L21:
            r0 = -1
            return r0
    }

    @Override // p4.h
    public final java.lang.String a() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            p4.f[] r1 = r5.f10099h
            int r2 = r1.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L28
            java.lang.String r4 = "\n    "
            r0.append(r4)
            z4.g r4 = r5.f10098g
            int r4 = r4.n(r3)
            r0.append(r4)
            java.lang.String r4 = ": "
            r0.append(r4)
            r4 = r1[r3]
            r0.append(r4)
            int r3 = r3 + 1
            goto Lb
        L28:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p4.l, p4.h
    public final int b() {
            r4 = this;
            boolean r0 = r4.f10100i
            z4.g r1 = r4.f10098g
            if (r0 == 0) goto Lc
            long r0 = m(r1)
        La:
            int r0 = (int) r0
            return r0
        Lc:
            int r0 = r1.f22552i
            long r0 = (long) r0
            r2 = 4
            long r0 = r0 * r2
            r2 = 2
            long r0 = r0 + r2
            goto La
    }

    @Override // p4.l, p4.h
    public final java.lang.String g() {
            r8 = this;
            p4.f r0 = r8.f10097f
            int r0 = r0.e()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            p4.f[] r2 = r8.f10099h
            int r3 = r2.length
            boolean r4 = r8.f10100i
            if (r4 == 0) goto L17
            java.lang.String r4 = "packed"
            goto L19
        L17:
            java.lang.String r4 = "sparse"
        L19:
            r1.append(r4)
            java.lang.String r4 = "-switch-payload // for switch @ "
            r1.append(r4)
            java.lang.String r4 = a.a.X0(r0)
            r1.append(r4)
            r4 = 0
        L29:
            if (r4 >= r3) goto L5c
            r5 = r2[r4]
            int r5 = r5.e()
            int r6 = r5 - r0
            java.lang.String r7 = "\n  "
            r1.append(r7)
            z4.g r7 = r8.f10098g
            int r7 = r7.n(r4)
            r1.append(r7)
            java.lang.String r7 = ": "
            r1.append(r7)
            java.lang.String r5 = a.a.Y0(r5)
            r1.append(r5)
            java.lang.String r5 = " // "
            r1.append(r5)
            java.lang.String r5 = a.a.L0(r6)
            r1.append(r5)
            int r4 = r4 + 1
            goto L29
        L5c:
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // p4.h
    public final p4.h k(u4.p r5) {
            r4 = this;
            p4.a0 r5 = new p4.a0
            z4.g r0 = r4.f10098g
            p4.f[] r1 = r4.f10099h
            u4.t r2 = r4.f10115c
            p4.f r3 = r4.f10097f
            r5.<init>(r2, r3, r0, r1)
            return r5
    }

    @Override // p4.l, p4.h
    public final void l(z4.d r11) {
            r10 = this;
            p4.f r0 = r10.f10097f
            int r0 = r0.e()
            p4.j r1 = p4.k.J
            f8.i r1 = r1.f10121d
            int r1 = r1.j()
            p4.f[] r2 = r10.f10099h
            int r3 = r2.length
            boolean r4 = r10.f10100i
            z4.g r5 = r10.f10098g
            r6 = 0
            if (r4 == 0) goto L54
            if (r3 != 0) goto L1c
            r4 = r6
            goto L20
        L1c:
            int r4 = r5.n(r6)
        L20:
            if (r3 != 0) goto L24
            r3 = r6
            goto L2a
        L24:
            int r3 = r3 + (-1)
            int r3 = r5.n(r3)
        L2a:
            int r3 = r3 - r4
            int r3 = r3 + 1
            r7 = 256(0x100, float:3.59E-43)
            r11.l(r7)
            r11.l(r3)
            r11.k(r4)
            r7 = r6
        L39:
            if (r6 >= r3) goto L78
            int r8 = r4 + r6
            int r9 = r5.n(r7)
            if (r9 <= r8) goto L45
            r8 = r1
            goto L4e
        L45:
            r8 = r2[r7]
            int r8 = r8.e()
            int r8 = r8 - r0
            int r7 = r7 + 1
        L4e:
            r11.k(r8)
            int r6 = r6 + 1
            goto L39
        L54:
            r1 = 512(0x200, float:7.17E-43)
            r11.l(r1)
            r11.l(r3)
            r1 = r6
        L5d:
            if (r1 >= r3) goto L69
            int r4 = r5.n(r1)
            r11.k(r4)
            int r1 = r1 + 1
            goto L5d
        L69:
            if (r6 >= r3) goto L78
            r1 = r2[r6]
            int r1 = r1.e()
            int r1 = r1 - r0
            r11.k(r1)
            int r6 = r6 + 1
            goto L69
        L78:
            return
    }
}
