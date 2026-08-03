package t7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements java.lang.Iterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l7.f f13086h;

    public b(l7.f r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f13085g = r2
            r0.f13086h = r1
            return
    }

    public final java.lang.String a(l7.f r3, v7.k0 r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r4 == 0) goto L16
            v7.k0 r1 = v7.k0.f14166i
            if (r4 != r1) goto L11
            r4 = 64
            r0.append(r4)
            goto L16
        L11:
            r4 = 63
            r0.append(r4)
        L16:
            l7.f r4 = r2.f13086h
            if (r3 == r4) goto L2e
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L2e
            java.lang.String r3 = r4.V()
            if (r3 == 0) goto L2e
            r0.append(r3)
            r3 = 58
            r0.append(r3)
        L2e:
            java.lang.String r3 = r2.c()
            r0.append(r3)
            r3 = 47
            r0.append(r3)
            java.lang.String r3 = r2.b()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public final java.lang.String b() {
            r5 = this;
            r0 = 0
            java.util.Iterator r0 = r5.d(r0)
        L5:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            v7.d r1 = (v7.d) r1
            v7.g0 r3 = r1.f14150k
            if (r3 == 0) goto L1d
            v7.i0 r3 = r3.f14153k
            int r3 = r3.N()
            goto L1e
        L1d:
            r3 = -1
        L1e:
            if (r3 >= 0) goto L21
            goto L2b
        L21:
            java.lang.Class<l7.f> r4 = l7.f.class
            k7.a r1 = r1.u(r4)
            l7.f r1 = (l7.f) r1
            if (r1 != 0) goto L2d
        L2b:
            r1 = r2
            goto L35
        L2d:
            u7.b r1 = r1.f7877p
            r7.s r1 = r1.V(r3)
            r7.q r1 = (r7.q) r1
        L35:
            if (r1 == 0) goto L39
            java.lang.String r2 = r1.f11578m
        L39:
            if (r2 == 0) goto L5
        L3b:
            return r2
    }

    public final java.lang.String c() {
            r2 = this;
            int r0 = r2.f13085g
            int r0 = r0 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            l7.f r1 = r2.f13086h
            u7.d r1 = r1.f7876o
            r7.y r0 = r1.c0(r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.f11578m
            return r0
        L13:
            r0 = 0
            return r0
    }

    public final java.util.Iterator d(boolean r5) {
            r4 = this;
            int r0 = r4.f13085g
            int r1 = r0 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            l7.f r2 = r4.f13086h
            int r3 = r2.U()
            if (r1 == r3) goto Lf
            goto L35
        Lf:
            int r1 = r0 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r3
            o7.f r2 = r2.f7878q
            j7.d r2 = r2.f9571m
            byte r1 = (byte) r1
            o7.j r1 = r2.k0(r1)
            if (r1 == 0) goto L35
            z7.g r2 = new z7.g
            j7.e r1 = r1.f9586m
            z7.c r1 = r1.f9563k
            java.util.Iterator r1 = r1.iterator()
            o7.h r3 = new o7.h
            r3.<init>(r0, r5)
            r2.<init>(r1, r3)
            return r2
        L35:
            z7.h r5 = z7.h.f22606g
            return r5
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof t7.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t7.b r4 = (t7.b) r4
            int r1 = r3.f13085g
            int r4 = r4.f13085g
            if (r1 != r4) goto L13
            return r0
        L13:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f13085g
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            r0 = 1
            java.util.Iterator r0 = r1.d(r0)
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            l7.f r0 = r6.f13086h
            java.lang.String r0 = r0.V()
            r1 = 8
            java.lang.String r2 = "/"
            java.lang.String r3 = " @"
            int r4 = r6.f13085g
            if (r0 != 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = y7.a.k(r4, r1)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r6.c()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r6.b()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L35:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = y7.a.k(r4, r1)
            r5.append(r1)
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = ":"
            r5.append(r0)
            java.lang.String r0 = r6.c()
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r6.b()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
    }
}
