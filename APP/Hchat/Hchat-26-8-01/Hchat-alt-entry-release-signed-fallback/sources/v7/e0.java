package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends v7.c implements java.lang.Comparable {
    @Override // v7.j0
    public final l7.g P() {
            r2 = this;
            java.lang.Class<v7.d> r0 = v7.d.class
            k7.a r0 = r2.u(r0)
            v7.d r0 = (v7.d) r0
            if (r0 == 0) goto L13
            java.lang.Class<l7.f> r1 = l7.f.class
            k7.a r0 = r0.u(r1)
            l7.f r0 = (l7.f) r0
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // v7.c
    public final java.lang.String Y() {
            r11 = this;
            v7.b r0 = r11.a0()
            v7.b r1 = v7.b.f14145h
            r2 = 0
            if (r0 == r1) goto Lb
            goto L90
        Lb:
            int r0 = r11.O()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != 0) goto L16
            java.lang.String r0 = ""
            return r0
        L16:
            v7.a[] r1 = v7.a.f14141m
            int r3 = r1.length
            v7.a[] r3 = new v7.a[r3]
            int r4 = r1.length
            r5 = 0
            r6 = r5
            r7 = r6
        L1f:
            if (r6 >= r4) goto L3c
            r8 = r1[r6]
            int r9 = r8.f14143g
            if (r9 != r0) goto L2c
            v7.a[] r0 = new v7.a[]{r8}
            goto L45
        L2c:
            v7.a r10 = v7.a.f14138j
            if (r8 != r10) goto L31
            goto L39
        L31:
            r10 = r0 & r9
            if (r10 != r9) goto L39
            r3[r7] = r8
            int r7 = r7 + 1
        L39:
            int r6 = r6 + 1
            goto L1f
        L3c:
            if (r7 != 0) goto L40
            r0 = r2
            goto L45
        L40:
            v7.a[] r0 = new v7.a[r7]
            java.lang.System.arraycopy(r3, r5, r0, r5, r7)
        L45:
            if (r0 == 0) goto L90
            int r1 = r0.length
            if (r1 != 0) goto L4b
            goto L90
        L4b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0.length
            r3 = r5
            r4 = r3
        L53:
            if (r5 >= r2) goto L8b
            r6 = r0[r5]
            v7.a r7 = v7.a.f14139k
            if (r6 == r7) goto L88
            v7.a r7 = v7.a.f14140l
            if (r6 != r7) goto L60
            goto L88
        L60:
            v7.a r7 = v7.a.f14138j
            if (r6 != r7) goto L6d
            java.lang.String r0 = r7.name()
            java.lang.String r0 = r0.toLowerCase()
            return r0
        L6d:
            int r7 = r6.f14143g
            r8 = r3 & r7
            if (r8 != r7) goto L74
            goto L88
        L74:
            if (r4 == 0) goto L7b
            r4 = 124(0x7c, float:1.74E-43)
            r1.append(r4)
        L7b:
            java.lang.String r4 = r6.name()
            java.lang.String r4 = r4.toLowerCase()
            r1.append(r4)
            r3 = r3 | r7
            r4 = 1
        L88:
            int r5 = r5 + 1
            goto L53
        L8b:
            java.lang.String r0 = r1.toString()
            return r0
        L90:
            return r2
    }

    @Override // v7.c
    public final int Z() {
            r2 = this;
            byte[] r0 = r2.f11553k
            r1 = 0
            int r0 = k7.a.s(r0, r1)
            return r0
    }

    public final v7.b a0() {
            r7 = this;
            int r0 = r7.Z()
            r1 = 0
            if (r0 != 0) goto La
            v7.b r0 = v7.b.f14145h
            return r1
        La:
            v7.b[] r2 = v7.b.f14146i
            int r3 = r2.length
            r4 = 0
        Le:
            if (r4 >= r3) goto L1a
            r5 = r2[r4]
            int r6 = r5.f14148g
            if (r6 != r0) goto L17
            return r5
        L17:
            int r4 = r4 + 1
            goto Le
        L1a:
            return r1
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            v7.e0 r2 = (v7.e0) r2
            if (r2 != 0) goto L5
            goto L1a
        L5:
            if (r2 != r1) goto L8
            goto L12
        L8:
            int r0 = r1.Z()
            int r2 = r2.Z()
            if (r0 != r2) goto L14
        L12:
            r2 = 0
            return r2
        L14:
            if (r0 != 0) goto L18
            r2 = 1
            return r2
        L18:
            if (r2 != 0) goto L1c
        L1a:
            r2 = -1
            return r2
        L1c:
            int r2 = java.lang.Integer.compare(r0, r2)
            return r2
    }

    @Override // v7.j0
    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.Z()
            r1 = 0
            java.lang.String r2 = "r0x"
            if (r0 != 0) goto La
            goto L4e
        La:
            r3 = 16711680(0xff0000, float:2.3418052E-38)
            r3 = r3 & r0
            if (r3 == 0) goto L4e
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 & r0
            if (r3 == 0) goto L4e
            l7.f r3 = r5.i()
            if (r3 != 0) goto L1b
            goto L26
        L1b:
            l7.l r4 = r3.Y()
            if (r4 != 0) goto L22
            goto L26
        L22:
            t7.b r1 = r4.X(r3, r0)
        L26:
            if (r1 == 0) goto L47
            l7.f r3 = r1.f13086h
            java.lang.String r4 = r1.b()
            if (r4 == 0) goto L47
            java.lang.String r1 = r1.b()
            l7.f r0 = r5.i()
            if (r3 == r0) goto L5c
            java.lang.String r0 = r3.V()
            if (r0 == 0) goto L5c
            java.lang.String r2 = ":"
            java.lang.String r1 = wb.en.h(r0, r2, r1)
            goto L5c
        L47:
            java.util.HashMap r1 = n7.g.f9048a
            java.lang.String r1 = y7.a.p(r0, r2)
            goto L5c
        L4e:
            if (r0 == 0) goto L5c
            v7.b r3 = r5.a0()
            if (r3 != 0) goto L5c
            java.util.HashMap r1 = n7.g.f9048a
            java.lang.String r1 = y7.a.p(r0, r2)
        L5c:
            java.lang.String r0 = r5.N()
            if (r1 == 0) goto L6d
            if (r0 == 0) goto L6d
            java.lang.String r2 = "=\""
            java.lang.String r3 = "\""
            java.lang.String r0 = wb.en.i(r1, r2, r0, r3)
            return r0
        L6d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "name="
            r0.<init>(r1)
            int r1 = r5.Z()
            r2 = 8
            java.lang.String r1 = y7.a.k(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
