package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends m7.i {
    @Override // m7.i, m7.q
    public final void M() {
            r1 = this;
            k7.c r0 = r1.f8760k
            m7.k r0 = (m7.k) r0
            m7.t r0 = r0.f8752n
            r0.Y()
            super.M()
            return
    }

    @Override // m7.i, m7.q
    public final void N() {
            r2 = this;
            d7.b r0 = r2.R()
            r0.N()
            k7.c r0 = r2.f8760k
            m7.k r0 = (m7.k) r0
            m7.v r1 = r0.f8751m
            r1.N()
            d7.b r1 = r0.f8755q
            r1.N()
            m7.t r0 = r0.f8752n
            r0.Z()
            return
    }

    @Override // m7.i
    public final d7.b R() {
            r1 = this;
            k7.c r0 = r1.f8760k
            m7.k r0 = (m7.k) r0
            d7.b r0 = r0.f8753o
            return r0
    }

    public final m7.u U(int r9) {
            r8 = this;
            k7.c r0 = r8.f8760k
            m7.k r0 = (m7.k) r0
            m7.v r0 = r0.f8751m
            r1 = 0
            r2 = -1
            if (r9 == r2) goto L5e
            java.lang.Class<m7.j> r3 = m7.j.class
            k7.a r0 = r0.v(r3)
            m7.j r0 = (m7.j) r0
            r0.getClass()
            m7.p r4 = new m7.p
            r4.<init>(r0)
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L23
            z7.h r0 = z7.h.f22606g
            goto L28
        L23:
            z7.f r0 = new z7.f
            r0.<init>(r4, r3, r1)
        L28:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r0.next()
            m7.j r3 = (m7.j) r3
            k7.c r3 = r3.f8760k
            m7.k r3 = (m7.k) r3
            m7.v r3 = r3.f8751m
            if (r9 != r2) goto L41
            r3.getClass()
        L3f:
            r6 = r1
            goto L5a
        L41:
            z7.c r4 = r3.f9563k
            int r4 = r4.size()
            r5 = 0
        L48:
            if (r5 >= r4) goto L3f
            k7.a r6 = r3.Q(r5)
            m7.u r6 = (m7.u) r6
            r7.f r7 = r6.f8735p
            int r7 = r7.f11560n
            if (r9 != r7) goto L57
            goto L5a
        L57:
            int r5 = r5 + 1
            goto L48
        L5a:
            if (r6 == 0) goto L28
            return r6
        L5d:
            return r1
        L5e:
            r0.getClass()
            return r1
    }

    public final m7.t V() {
            r1 = this;
            k7.c r0 = r1.f8760k
            m7.k r0 = (m7.k) r0
            m7.t r0 = r0.f8752n
            return r0
    }

    public final m7.c W(java.lang.String r11) {
            r10 = this;
            m7.t r0 = r10.V()
            m7.d r0 = r0.f8769w
            z7.c r1 = r0.f9563k
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
        L10:
            if (r4 >= r1) goto L8e
            k7.a r6 = r0.Q(r4)
            m7.c r6 = (m7.c) r6
            r6.getClass()
            int r7 = b8.l.f522a
            r7 = 58
            int r7 = r11.indexOf(r7)
            if (r7 <= 0) goto L2a
            java.lang.String r7 = r11.substring(r2, r7)
            goto L2b
        L2a:
            r7 = r3
        L2b:
            if (r7 == 0) goto L49
            m7.u r8 = r6.a0()
            if (r8 == 0) goto L40
            r7.f r9 = r8.f8734o
            int r9 = r9.f11560n
            r7.o r8 = r8.V(r9)
            if (r8 == 0) goto L40
            java.lang.String r8 = r8.f11578m
            goto L41
        L40:
            r8 = r3
        L41:
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L49
            r7 = r2
            goto L80
        L49:
            java.lang.String r7 = b8.l.a(r11)
            byte[] r8 = r6.f11553k
            r9 = 4
            int r8 = k7.a.s(r8, r9)
            u7.a r9 = r6.b0()
            if (r9 != 0) goto L5b
            goto L71
        L5b:
            if (r8 >= 0) goto L5f
        L5d:
            r8 = r3
            goto L6a
        L5f:
            u7.a r9 = r6.b0()
            if (r9 != 0) goto L66
            goto L5d
        L66:
            r7.s r8 = r9.V(r8)
        L6a:
            if (r8 != 0) goto L6d
            goto L71
        L6d:
            java.lang.String r9 = r8.f11578m
            if (r9 != 0) goto L73
        L71:
            r9 = r3
            goto L7c
        L73:
            r7.u r8 = r8.f11583q
            if (r8 != 0) goto L78
            goto L7c
        L78:
            java.lang.String r9 = r8.Q(r9, r2)
        L7c:
            boolean r7 = r7.equals(r9)
        L80:
            if (r7 == 0) goto L8b
            int r5 = r6.Z()
            if (r5 == 0) goto L8a
            r5 = r6
            goto L8b
        L8a:
            return r6
        L8b:
            int r4 = r4 + 1
            goto L10
        L8e:
            return r5
    }

    public final m7.c X(int r7) {
            r6 = this;
            m7.t r0 = r6.V()
            m7.d r0 = r0.f8769w
            r1 = 0
            if (r7 != 0) goto Ld
            r0.getClass()
            return r1
        Ld:
            z7.c r2 = r0.f9563k
            int r2 = r2.size()
            r3 = 0
        L14:
            if (r3 >= r2) goto L26
            k7.a r4 = r0.Q(r3)
            m7.c r4 = (m7.c) r4
            int r5 = r4.Z()
            if (r7 != r5) goto L23
            return r4
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            return r1
    }

    @Override // m7.i, m7.q
    public final java.lang.String toString() {
            r4 = this;
            r4.S()
            m7.r r0 = r4.f8750l
            if (r0 != 0) goto Le
            m7.r r0 = new m7.r
            r0.<init>(r4)
            r4.f8750l = r0
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<"
            r0.<init>(r1)
            r1 = 1
            m7.t r2 = r4.V()
            java.lang.String r1 = r2.c0(r1)
            r0.append(r1)
            k7.c r1 = r4.f8760k
            m7.k r1 = (m7.k) r1
            m7.v r1 = r1.f8751m
            z7.c r1 = r1.f9563k
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            r3 = 32
            if (r2 == 0) goto L3f
            r0.append(r3)
            java.lang.String r1 = y7.a.h(r1)
            r0.append(r1)
        L3f:
            m7.t r1 = r4.V()
            m7.d r1 = r1.f8769w
            z7.c r1 = r1.f9563k
            java.util.Iterator r1 = r1.b()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5b
            r0.append(r3)
            java.lang.String r1 = y7.a.h(r1)
            r0.append(r1)
        L5b:
            r1 = 62
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
