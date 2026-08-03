package a;

/* JADX INFO: loaded from: classes.dex */
public final class V1 extends a.C0138f8 {
    public int g0;
    public boolean h0;
    public int i0;

    public V1() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.g0 = r0
            r1 = 1
            r2.h0 = r1
            r2.i0 = r0
            return
    }

    @Override // a.N3
    public final void a(a.B9 r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            a.M3[] r2 = r0.G
            a.M3 r3 = r0.y
            r4 = 0
            r2[r4] = r3
            a.M3 r5 = r0.z
            r6 = 2
            r2[r6] = r5
            a.M3 r7 = r0.A
            r8 = 1
            r2[r8] = r7
            a.M3 r9 = r0.B
            r10 = 3
            r2[r10] = r9
            r11 = r4
        L1b:
            int r12 = r2.length
            if (r11 >= r12) goto L29
            r12 = r2[r11]
            a.le r13 = r1.j(r12)
            r12.g = r13
            int r11 = r11 + 1
            goto L1b
        L29:
            int r11 = r0.g0
            if (r11 < 0) goto L1af
            r12 = 4
            if (r11 >= r12) goto L1af
            r2 = r2[r11]
            r11 = r4
        L33:
            int r13 = r0.f0
            if (r11 >= r13) goto L7d
            a.N3[] r13 = r0.e0
            r13 = r13[r11]
            boolean r14 = r0.h0
            if (r14 != 0) goto L46
            boolean r14 = r13.b()
            if (r14 != 0) goto L46
            goto L79
        L46:
            int r14 = r0.g0
            a.N3$a r15 = a.N3.a.c
            if (r14 == 0) goto L4e
            if (r14 != r8) goto L62
        L4e:
            a.N3$a[] r12 = r13.J
            r12 = r12[r4]
            if (r12 != r15) goto L62
            a.M3 r12 = r13.y
            a.M3 r12 = r12.d
            if (r12 == 0) goto L62
            a.M3 r12 = r13.A
            a.M3 r12 = r12.d
            if (r12 == 0) goto L62
        L60:
            r11 = r8
            goto L7e
        L62:
            if (r14 == r6) goto L66
            if (r14 != r10) goto L79
        L66:
            a.N3$a[] r12 = r13.J
            r12 = r12[r8]
            if (r12 != r15) goto L79
            a.M3 r12 = r13.z
            a.M3 r12 = r12.d
            if (r12 == 0) goto L79
            a.M3 r12 = r13.B
            a.M3 r12 = r12.d
            if (r12 == 0) goto L79
            goto L60
        L79:
            int r11 = r11 + 1
            r12 = 4
            goto L33
        L7d:
            r11 = r4
        L7e:
            boolean r12 = r3.e()
            if (r12 != 0) goto L8d
            boolean r12 = r7.e()
            if (r12 == 0) goto L8b
            goto L8d
        L8b:
            r12 = r4
            goto L8e
        L8d:
            r12 = r8
        L8e:
            boolean r13 = r5.e()
            if (r13 != 0) goto L9d
            boolean r13 = r9.e()
            if (r13 == 0) goto L9b
            goto L9d
        L9b:
            r13 = r4
            goto L9e
        L9d:
            r13 = r8
        L9e:
            if (r11 != 0) goto Lb4
            int r11 = r0.g0
            if (r11 != 0) goto La6
            if (r12 != 0) goto Lb2
        La6:
            if (r11 != r6) goto Laa
            if (r13 != 0) goto Lb2
        Laa:
            if (r11 != r8) goto Lae
            if (r12 != 0) goto Lb2
        Lae:
            if (r11 != r10) goto Lb4
            if (r13 == 0) goto Lb4
        Lb2:
            r11 = 5
            goto Lb5
        Lb4:
            r11 = 4
        Lb5:
            r12 = r4
        Lb6:
            int r13 = r0.f0
            if (r12 >= r13) goto L125
            a.N3[] r13 = r0.e0
            r13 = r13[r12]
            boolean r14 = r0.h0
            if (r14 != 0) goto Lc9
            boolean r14 = r13.b()
            if (r14 != 0) goto Lc9
            goto L11f
        Lc9:
            a.M3[] r14 = r13.G
            int r15 = r0.g0
            r14 = r14[r15]
            a.le r14 = r1.j(r14)
            int r15 = r0.g0
            a.M3[] r13 = r13.G
            r13 = r13[r15]
            r13.g = r14
            a.M3 r10 = r13.d
            if (r10 == 0) goto Le6
            a.N3 r10 = r10.b
            if (r10 != r0) goto Le6
            int r10 = r13.e
            goto Le7
        Le6:
            r10 = r4
        Le7:
            if (r15 == 0) goto L102
            if (r15 != r6) goto Lec
            goto L102
        Lec:
            a.le r13 = r2.g
            int r15 = r0.i0
            int r15 = r15 + r10
            a.K1 r6 = r1.k()
            a.le r8 = r1.l()
            r8.d = r4
            r6.c(r13, r14, r8, r15)
            r1.c(r6)
            goto L117
        L102:
            a.le r6 = r2.g
            int r8 = r0.i0
            int r8 = r8 - r10
            a.K1 r13 = r1.k()
            a.le r15 = r1.l()
            r15.d = r4
            r13.d(r6, r14, r15, r8)
            r1.c(r13)
        L117:
            a.le r6 = r2.g
            int r8 = r0.i0
            int r8 = r8 + r10
            r1.e(r6, r14, r8, r11)
        L11f:
            int r12 = r12 + 1
            r6 = 2
            r8 = 1
            r10 = 3
            goto Lb6
        L125:
            int r2 = r0.g0
            r6 = 8
            if (r2 != 0) goto L14a
            a.le r2 = r7.g
            a.le r5 = r3.g
            r1.e(r2, r5, r4, r6)
            a.le r2 = r3.g
            a.N3 r5 = r0.K
            a.M3 r5 = r5.A
            a.le r5 = r5.g
            r6 = 4
            r1.e(r2, r5, r4, r6)
            a.le r2 = r3.g
            a.N3 r3 = r0.K
            a.M3 r3 = r3.y
            a.le r3 = r3.g
            r1.e(r2, r3, r4, r4)
            return
        L14a:
            r8 = 1
            if (r2 != r8) goto L16c
            a.le r2 = r3.g
            a.le r5 = r7.g
            r1.e(r2, r5, r4, r6)
            a.le r2 = r3.g
            a.N3 r5 = r0.K
            a.M3 r5 = r5.y
            a.le r5 = r5.g
            r6 = 4
            r1.e(r2, r5, r4, r6)
            a.le r2 = r3.g
            a.N3 r3 = r0.K
            a.M3 r3 = r3.A
            a.le r3 = r3.g
            r1.e(r2, r3, r4, r4)
            return
        L16c:
            r3 = 2
            if (r2 != r3) goto L18e
            a.le r2 = r9.g
            a.le r3 = r5.g
            r1.e(r2, r3, r4, r6)
            a.le r2 = r5.g
            a.N3 r3 = r0.K
            a.M3 r3 = r3.B
            a.le r3 = r3.g
            r6 = 4
            r1.e(r2, r3, r4, r6)
            a.le r2 = r5.g
            a.N3 r3 = r0.K
            a.M3 r3 = r3.z
            a.le r3 = r3.g
            r1.e(r2, r3, r4, r4)
            return
        L18e:
            r3 = 3
            if (r2 != r3) goto L1af
            a.le r2 = r5.g
            a.le r3 = r9.g
            r1.e(r2, r3, r4, r6)
            a.le r2 = r5.g
            a.N3 r3 = r0.K
            a.M3 r3 = r3.z
            a.le r3 = r3.g
            r6 = 4
            r1.e(r2, r3, r4, r6)
            a.le r2 = r5.g
            a.N3 r3 = r0.K
            a.M3 r3 = r3.B
            a.le r3 = r3.g
            r1.e(r2, r3, r4, r4)
        L1af:
            return
    }

    @Override // a.N3
    public final boolean b() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // a.N3
    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Barrier] "
            r0.<init>(r1)
            java.lang.String r1 = r4.Y
            java.lang.String r2 = " {"
            java.lang.String r0 = a.C0487z.h(r0, r1, r2)
            r1 = 0
        L10:
            int r2 = r4.f0
            if (r1 >= r2) goto L34
            a.N3[] r2 = r4.e0
            r2 = r2[r1]
            if (r1 <= 0) goto L20
            java.lang.String r3 = ", "
            java.lang.String r0 = a.C0487z.f(r0, r3)
        L20:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = r2.Y
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r1 = r1 + 1
            goto L10
        L34:
            java.lang.String r1 = "}"
            java.lang.String r0 = a.C0487z.f(r0, r1)
            return r0
    }
}
