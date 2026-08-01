package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e7 extends defpackage.oo {
    public int f0;
    public boolean g0;
    public int h0;

    @Override // defpackage.pc
    public final void a(defpackage.ar r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            cc[] r2 = r0.F
            r3 = 0
            cc r4 = r0.x
            r2[r3] = r4
            r5 = 2
            cc r6 = r0.y
            r2[r5] = r6
            r7 = 1
            cc r8 = r0.z
            r2[r7] = r8
            r9 = 3
            cc r10 = r0.A
            r2[r9] = r10
            r11 = r3
        L1b:
            int r12 = r2.length
            if (r11 >= r12) goto L29
            r12 = r2[r11]
            a40 r13 = r1.j(r12)
            r12.g = r13
            int r11 = r11 + 1
            goto L1b
        L29:
            int r11 = r0.f0
            if (r11 < 0) goto L1b2
            r12 = 4
            if (r11 >= r12) goto L1b2
            r2 = r2[r11]
            r11 = r3
        L33:
            int r13 = r0.e0
            if (r11 >= r13) goto L7a
            pc[] r13 = r0.d0
            r13 = r13[r11]
            boolean r14 = r0.g0
            if (r14 != 0) goto L46
            boolean r14 = r13.b()
            if (r14 != 0) goto L46
            goto L77
        L46:
            int r14 = r0.f0
            if (r14 == 0) goto L4c
            if (r14 != r7) goto L60
        L4c:
            int[] r15 = r13.c0
            r15 = r15[r3]
            if (r15 != r9) goto L60
            cc r15 = r13.x
            cc r15 = r15.d
            if (r15 == 0) goto L60
            cc r15 = r13.z
            cc r15 = r15.d
            if (r15 == 0) goto L60
        L5e:
            r11 = r7
            goto L7b
        L60:
            if (r14 == r5) goto L64
            if (r14 != r9) goto L77
        L64:
            int[] r14 = r13.c0
            r14 = r14[r7]
            if (r14 != r9) goto L77
            cc r14 = r13.y
            cc r14 = r14.d
            if (r14 == 0) goto L77
            cc r13 = r13.A
            cc r13 = r13.d
            if (r13 == 0) goto L77
            goto L5e
        L77:
            int r11 = r11 + 1
            goto L33
        L7a:
            r11 = r3
        L7b:
            boolean r13 = r4.e()
            if (r13 != 0) goto L8a
            boolean r13 = r8.e()
            if (r13 == 0) goto L88
            goto L8a
        L88:
            r13 = r3
            goto L8b
        L8a:
            r13 = r7
        L8b:
            boolean r14 = r6.e()
            if (r14 != 0) goto L9a
            boolean r14 = r10.e()
            if (r14 == 0) goto L98
            goto L9a
        L98:
            r14 = r3
            goto L9b
        L9a:
            r14 = r7
        L9b:
            if (r11 != 0) goto Lb1
            int r11 = r0.f0
            if (r11 != 0) goto La3
            if (r13 != 0) goto Laf
        La3:
            if (r11 != r5) goto La7
            if (r14 != 0) goto Laf
        La7:
            if (r11 != r7) goto Lab
            if (r13 != 0) goto Laf
        Lab:
            if (r11 != r9) goto Lb1
            if (r14 == 0) goto Lb1
        Laf:
            r11 = r7
            goto Lb2
        Lb1:
            r11 = r3
        Lb2:
            if (r11 != 0) goto Lb6
            r11 = r12
            goto Lb7
        Lb6:
            r11 = 5
        Lb7:
            r13 = r3
        Lb8:
            int r14 = r0.e0
            if (r13 >= r14) goto L128
            pc[] r14 = r0.d0
            r14 = r14[r13]
            boolean r15 = r0.g0
            if (r15 != 0) goto Lcb
            boolean r15 = r14.b()
            if (r15 != 0) goto Lcb
            goto L121
        Lcb:
            cc[] r15 = r14.F
            int r9 = r0.f0
            r9 = r15[r9]
            a40 r9 = r1.j(r9)
            cc[] r14 = r14.F
            int r15 = r0.f0
            r14 = r14[r15]
            r14.g = r9
            cc r7 = r14.d
            if (r7 == 0) goto Le8
            pc r7 = r7.b
            if (r7 != r0) goto Le8
            int r7 = r14.e
            goto Le9
        Le8:
            r7 = r3
        Le9:
            if (r15 == 0) goto L104
            if (r15 != r5) goto Lee
            goto L104
        Lee:
            a40 r14 = r2.g
            int r15 = r0.h0
            int r15 = r15 + r7
            p6 r5 = r1.k()
            a40 r12 = r1.l()
            r12.d = r3
            r5.b(r14, r9, r12, r15)
            r1.c(r5)
            goto L119
        L104:
            a40 r5 = r2.g
            int r12 = r0.h0
            int r12 = r12 - r7
            p6 r14 = r1.k()
            a40 r15 = r1.l()
            r15.d = r3
            r14.c(r5, r9, r15, r12)
            r1.c(r14)
        L119:
            a40 r5 = r2.g
            int r12 = r0.h0
            int r12 = r12 + r7
            r1.e(r5, r9, r12, r11)
        L121:
            int r13 = r13 + 1
            r5 = 2
            r7 = 1
            r9 = 3
            r12 = 4
            goto Lb8
        L128:
            int r2 = r0.f0
            r5 = 8
            if (r2 != 0) goto L14d
            a40 r2 = r8.g
            a40 r6 = r4.g
            r1.e(r2, r6, r3, r5)
            a40 r2 = r4.g
            pc r5 = r0.I
            cc r5 = r5.z
            a40 r5 = r5.g
            r6 = 4
            r1.e(r2, r5, r3, r6)
            a40 r2 = r4.g
            pc r4 = r0.I
            cc r4 = r4.x
            a40 r4 = r4.g
            r1.e(r2, r4, r3, r3)
            return
        L14d:
            r7 = 1
            if (r2 != r7) goto L16f
            a40 r2 = r4.g
            a40 r6 = r8.g
            r1.e(r2, r6, r3, r5)
            a40 r2 = r4.g
            pc r5 = r0.I
            cc r5 = r5.x
            a40 r5 = r5.g
            r6 = 4
            r1.e(r2, r5, r3, r6)
            a40 r2 = r4.g
            pc r4 = r0.I
            cc r4 = r4.z
            a40 r4 = r4.g
            r1.e(r2, r4, r3, r3)
            return
        L16f:
            r4 = 2
            if (r2 != r4) goto L191
            a40 r2 = r10.g
            a40 r4 = r6.g
            r1.e(r2, r4, r3, r5)
            a40 r2 = r6.g
            pc r4 = r0.I
            cc r4 = r4.A
            a40 r4 = r4.g
            r5 = 4
            r1.e(r2, r4, r3, r5)
            a40 r2 = r6.g
            pc r4 = r0.I
            cc r4 = r4.y
            a40 r4 = r4.g
            r1.e(r2, r4, r3, r3)
            return
        L191:
            r4 = 3
            if (r2 != r4) goto L1b2
            a40 r2 = r6.g
            a40 r4 = r10.g
            r1.e(r2, r4, r3, r5)
            a40 r2 = r6.g
            pc r4 = r0.I
            cc r4 = r4.y
            a40 r4 = r4.g
            r5 = 4
            r1.e(r2, r4, r3, r5)
            a40 r2 = r6.g
            pc r4 = r0.I
            cc r4 = r4.A
            a40 r4 = r4.g
            r1.e(r2, r4, r3, r3)
        L1b2:
            return
    }

    @Override // defpackage.pc
    public final boolean b() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.pc
    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Barrier] "
            r0.<init>(r1)
            java.lang.String r1 = r4.W
            java.lang.String r2 = " {"
            java.lang.String r0 = defpackage.z30.l(r0, r1, r2)
            r1 = 0
        L10:
            int r2 = r4.e0
            if (r1 >= r2) goto L34
            pc[] r2 = r4.d0
            r2 = r2[r1]
            if (r1 <= 0) goto L20
            java.lang.String r3 = ", "
            java.lang.String r0 = defpackage.z30.i(r0, r3)
        L20:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = r2.W
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r1 = r1 + 1
            goto L10
        L34:
            java.lang.String r1 = "}"
            java.lang.String r0 = defpackage.z30.i(r0, r1)
            return r0
    }
}
