package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class po extends defpackage.qb0 {
    public static final int[] k = null;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            defpackage.po.k = r0
            return
    }

    public static void m(int[] r2, int r3, int r4, int r5, int r6, float r7, int r8) {
            int r4 = r4 - r3
            int r6 = r6 - r5
            r3 = -1
            r5 = 0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1
            if (r8 == r3) goto L20
            if (r8 == 0) goto L17
            if (r8 == r1) goto Le
            goto L35
        Le:
            float r3 = (float) r4
            float r3 = r3 * r7
            float r3 = r3 + r0
            int r3 = (int) r3
            r2[r5] = r4
            r2[r1] = r3
            return
        L17:
            float r3 = (float) r6
            float r3 = r3 * r7
            float r3 = r3 + r0
            int r3 = (int) r3
            r2[r5] = r3
            r2[r1] = r6
            return
        L20:
            float r3 = (float) r6
            float r3 = r3 * r7
            float r3 = r3 + r0
            int r3 = (int) r3
            float r8 = (float) r4
            float r8 = r8 / r7
            float r8 = r8 + r0
            int r7 = (int) r8
            if (r3 > r4) goto L2f
            r2[r5] = r3
            r2[r1] = r6
            return
        L2f:
            if (r7 > r6) goto L35
            r2[r5] = r4
            r2[r1] = r7
        L35:
            return
    }

    @Override // defpackage.hg
    public final void a(defpackage.hg r24) {
            r23 = this;
            r0 = r23
            int r1 = r0.j
            int r1 = defpackage.z30.t(r1)
            r2 = 3
            r3 = 0
            if (r1 == r2) goto L375
            sg r1 = r0.e
            boolean r4 = r1.j
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1
            jg r7 = r0.h
            jg r8 = r0.i
            if (r4 != 0) goto L28
            int r4 = r0.d
            if (r4 != r2) goto L28
            pc r4 = r0.b
            int r9 = r4.j
            m90 r10 = r4.e
            r11 = 2
            if (r9 == r11) goto L284
            if (r9 == r2) goto L2c
        L28:
            r24 = r5
            goto L29e
        L2c:
            int r9 = r4.k
            r11 = -1
            if (r9 == 0) goto L5e
            if (r9 != r2) goto L34
            goto L5e
        L34:
            int r9 = r4.M
            if (r9 == r11) goto L52
            if (r9 == 0) goto L49
            if (r9 == r6) goto L3e
            r4 = r3
            goto L5a
        L3e:
            sg r9 = r10.e
            int r9 = r9.g
            float r9 = (float) r9
            float r4 = r4.L
        L45:
            float r9 = r9 * r4
        L46:
            float r9 = r9 + r5
            int r4 = (int) r9
            goto L5a
        L49:
            sg r9 = r10.e
            int r9 = r9.g
            float r9 = (float) r9
            float r4 = r4.L
            float r9 = r9 / r4
            goto L46
        L52:
            sg r9 = r10.e
            int r9 = r9.g
            float r9 = (float) r9
            float r4 = r4.L
            goto L45
        L5a:
            r1.d(r4)
            goto L28
        L5e:
            jg r9 = r10.h
            jg r10 = r10.i
            cc r12 = r4.x
            cc r12 = r12.d
            if (r12 == 0) goto L6a
            r12 = r6
            goto L6b
        L6a:
            r12 = r3
        L6b:
            cc r13 = r4.y
            cc r13 = r13.d
            if (r13 == 0) goto L73
            r13 = r6
            goto L74
        L73:
            r13 = r3
        L74:
            cc r14 = r4.z
            cc r14 = r14.d
            if (r14 == 0) goto L7c
            r14 = r6
            goto L7d
        L7c:
            r14 = r3
        L7d:
            cc r15 = r4.A
            cc r15 = r15.d
            if (r15 == 0) goto L87
            r15 = r6
        L84:
            r24 = r5
            goto L89
        L87:
            r15 = r3
            goto L84
        L89:
            int r5 = r4.M
            if (r12 == 0) goto L197
            if (r13 == 0) goto L197
            if (r14 == 0) goto L197
            if (r15 == 0) goto L197
            float r4 = r4.L
            boolean r11 = r9.j
            java.util.ArrayList r12 = r9.l
            int[] r16 = defpackage.po.k
            if (r11 == 0) goto Leb
            boolean r11 = r10.j
            if (r11 == 0) goto Leb
            boolean r2 = r7.c
            if (r2 == 0) goto L374
            boolean r2 = r8.c
            if (r2 != 0) goto Lab
            goto L374
        Lab:
            java.util.ArrayList r2 = r7.l
            java.lang.Object r2 = r2.get(r3)
            jg r2 = (defpackage.jg) r2
            int r2 = r2.g
            int r7 = r7.f
            int r17 = r2 + r7
            java.util.ArrayList r2 = r8.l
            java.lang.Object r2 = r2.get(r3)
            jg r2 = (defpackage.jg) r2
            int r2 = r2.g
            int r7 = r8.f
            int r18 = r2 - r7
            int r2 = r9.g
            int r7 = r9.f
            int r19 = r2 + r7
            int r2 = r10.g
            int r7 = r10.f
            int r20 = r2 - r7
            r21 = r4
            r22 = r5
            m(r16, r17, r18, r19, r20, r21, r22)
            r2 = r16[r3]
            r1.d(r2)
            pc r1 = r0.b
            m90 r1 = r1.e
            sg r1 = r1.e
            r2 = r16[r6]
            r1.d(r2)
            return
        Leb:
            r21 = r4
            r22 = r5
            boolean r4 = r7.j
            if (r4 == 0) goto L13a
            boolean r4 = r8.j
            if (r4 == 0) goto L13a
            boolean r4 = r9.c
            if (r4 == 0) goto L374
            boolean r4 = r10.c
            if (r4 != 0) goto L101
            goto L374
        L101:
            int r4 = r7.g
            int r5 = r7.f
            int r17 = r4 + r5
            int r4 = r8.g
            int r5 = r8.f
            int r18 = r4 - r5
            java.lang.Object r4 = r12.get(r3)
            jg r4 = (defpackage.jg) r4
            int r4 = r4.g
            int r5 = r9.f
            int r19 = r4 + r5
            java.util.ArrayList r4 = r10.l
            java.lang.Object r4 = r4.get(r3)
            jg r4 = (defpackage.jg) r4
            int r4 = r4.g
            int r5 = r10.f
            int r20 = r4 - r5
            m(r16, r17, r18, r19, r20, r21, r22)
            r4 = r16[r3]
            r1.d(r4)
            pc r4 = r0.b
            m90 r4 = r4.e
            sg r4 = r4.e
            r5 = r16[r6]
            r4.d(r5)
        L13a:
            boolean r4 = r7.c
            if (r4 == 0) goto L374
            boolean r4 = r8.c
            if (r4 == 0) goto L374
            boolean r4 = r9.c
            if (r4 == 0) goto L374
            boolean r4 = r10.c
            if (r4 != 0) goto L14c
            goto L374
        L14c:
            java.util.ArrayList r4 = r7.l
            java.lang.Object r4 = r4.get(r3)
            jg r4 = (defpackage.jg) r4
            int r4 = r4.g
            int r5 = r7.f
            int r17 = r4 + r5
            java.util.ArrayList r4 = r8.l
            java.lang.Object r4 = r4.get(r3)
            jg r4 = (defpackage.jg) r4
            int r4 = r4.g
            int r5 = r8.f
            int r18 = r4 - r5
            java.lang.Object r4 = r12.get(r3)
            jg r4 = (defpackage.jg) r4
            int r4 = r4.g
            int r5 = r9.f
            int r19 = r4 + r5
            java.util.ArrayList r4 = r10.l
            java.lang.Object r4 = r4.get(r3)
            jg r4 = (defpackage.jg) r4
            int r4 = r4.g
            int r5 = r10.f
            int r20 = r4 - r5
            m(r16, r17, r18, r19, r20, r21, r22)
            r4 = r16[r3]
            r1.d(r4)
            pc r4 = r0.b
            m90 r4 = r4.e
            sg r4 = r4.e
            r5 = r16[r6]
            r4.d(r5)
            goto L29e
        L197:
            if (r12 == 0) goto L20f
            if (r14 == 0) goto L20f
            boolean r9 = r7.c
            if (r9 == 0) goto L374
            boolean r9 = r8.c
            if (r9 != 0) goto L1a5
            goto L374
        L1a5:
            float r4 = r4.L
            java.util.ArrayList r9 = r7.l
            java.lang.Object r9 = r9.get(r3)
            jg r9 = (defpackage.jg) r9
            int r9 = r9.g
            int r10 = r7.f
            int r9 = r9 + r10
            java.util.ArrayList r10 = r8.l
            java.lang.Object r10 = r10.get(r3)
            jg r10 = (defpackage.jg) r10
            int r10 = r10.g
            int r12 = r8.f
            int r10 = r10 - r12
            if (r5 == r11) goto L1ec
            if (r5 == 0) goto L1ec
            if (r5 == r6) goto L1c9
            goto L29e
        L1c9:
            int r10 = r10 - r9
            int r5 = r0.g(r10, r3)
            float r9 = (float) r5
            float r9 = r9 / r4
            float r9 = r9 + r24
            int r9 = (int) r9
            int r10 = r0.g(r9, r6)
            if (r9 == r10) goto L1de
            float r5 = (float) r10
            float r5 = r5 * r4
            float r5 = r5 + r24
            int r5 = (int) r5
        L1de:
            r1.d(r5)
            pc r4 = r0.b
            m90 r4 = r4.e
            sg r4 = r4.e
            r4.d(r10)
            goto L29e
        L1ec:
            int r10 = r10 - r9
            int r5 = r0.g(r10, r3)
            float r9 = (float) r5
            float r9 = r9 * r4
            float r9 = r9 + r24
            int r9 = (int) r9
            int r10 = r0.g(r9, r6)
            if (r9 == r10) goto L201
            float r5 = (float) r10
            float r5 = r5 / r4
            float r5 = r5 + r24
            int r5 = (int) r5
        L201:
            r1.d(r5)
            pc r4 = r0.b
            m90 r4 = r4.e
            sg r4 = r4.e
            r4.d(r10)
            goto L29e
        L20f:
            if (r13 == 0) goto L29e
            if (r15 == 0) goto L29e
            boolean r12 = r9.c
            if (r12 == 0) goto L374
            boolean r12 = r10.c
            if (r12 != 0) goto L21d
            goto L374
        L21d:
            float r4 = r4.L
            java.util.ArrayList r12 = r9.l
            java.lang.Object r12 = r12.get(r3)
            jg r12 = (defpackage.jg) r12
            int r12 = r12.g
            int r9 = r9.f
            int r12 = r12 + r9
            java.util.ArrayList r9 = r10.l
            java.lang.Object r9 = r9.get(r3)
            jg r9 = (defpackage.jg) r9
            int r9 = r9.g
            int r10 = r10.f
            int r9 = r9 - r10
            if (r5 == r11) goto L262
            if (r5 == 0) goto L240
            if (r5 == r6) goto L262
            goto L29e
        L240:
            int r9 = r9 - r12
            int r5 = r0.g(r9, r6)
            float r9 = (float) r5
            float r9 = r9 * r4
            float r9 = r9 + r24
            int r9 = (int) r9
            int r10 = r0.g(r9, r3)
            if (r9 == r10) goto L255
            float r5 = (float) r10
            float r5 = r5 / r4
            float r5 = r5 + r24
            int r5 = (int) r5
        L255:
            r1.d(r10)
            pc r4 = r0.b
            m90 r4 = r4.e
            sg r4 = r4.e
            r4.d(r5)
            goto L29e
        L262:
            int r9 = r9 - r12
            int r5 = r0.g(r9, r6)
            float r9 = (float) r5
            float r9 = r9 / r4
            float r9 = r9 + r24
            int r9 = (int) r9
            int r10 = r0.g(r9, r3)
            if (r9 == r10) goto L277
            float r5 = (float) r10
            float r5 = r5 * r4
            float r5 = r5 + r24
            int r5 = (int) r5
        L277:
            r1.d(r10)
            pc r4 = r0.b
            m90 r4 = r4.e
            sg r4 = r4.e
            r4.d(r5)
            goto L29e
        L284:
            r24 = r5
            pc r5 = r4.I
            if (r5 == 0) goto L29e
            po r5 = r5.d
            sg r5 = r5.e
            boolean r9 = r5.j
            if (r9 == 0) goto L29e
            float r4 = r4.o
            int r5 = r5.g
            float r5 = (float) r5
            float r5 = r5 * r4
            float r5 = r5 + r24
            int r4 = (int) r5
            r1.d(r4)
        L29e:
            boolean r4 = r7.c
            java.util.ArrayList r5 = r7.l
            if (r4 == 0) goto L374
            boolean r4 = r8.c
            java.util.ArrayList r9 = r8.l
            if (r4 != 0) goto L2ac
            goto L374
        L2ac:
            boolean r4 = r7.j
            if (r4 == 0) goto L2ba
            boolean r4 = r8.j
            if (r4 == 0) goto L2ba
            boolean r4 = r1.j
            if (r4 == 0) goto L2ba
            goto L374
        L2ba:
            boolean r4 = r1.j
            if (r4 != 0) goto L2f0
            int r4 = r0.d
            if (r4 != r2) goto L2f0
            pc r4 = r0.b
            int r10 = r4.j
            if (r10 != 0) goto L2f0
            boolean r4 = r4.q()
            if (r4 != 0) goto L2f0
            java.lang.Object r2 = r5.get(r3)
            jg r2 = (defpackage.jg) r2
            java.lang.Object r3 = r9.get(r3)
            jg r3 = (defpackage.jg) r3
            int r2 = r2.g
            int r4 = r7.f
            int r2 = r2 + r4
            int r3 = r3.g
            int r4 = r8.f
            int r3 = r3 + r4
            int r4 = r3 - r2
            r7.d(r2)
            r8.d(r3)
            r1.d(r4)
            return
        L2f0:
            boolean r4 = r1.j
            if (r4 != 0) goto L338
            int r4 = r0.d
            if (r4 != r2) goto L338
            int r2 = r0.a
            if (r2 != r6) goto L338
            int r2 = r5.size()
            if (r2 <= 0) goto L338
            int r2 = r9.size()
            if (r2 <= 0) goto L338
            java.lang.Object r2 = r5.get(r3)
            jg r2 = (defpackage.jg) r2
            java.lang.Object r4 = r9.get(r3)
            jg r4 = (defpackage.jg) r4
            int r2 = r2.g
            int r6 = r7.f
            int r2 = r2 + r6
            int r4 = r4.g
            int r6 = r8.f
            int r4 = r4 + r6
            int r4 = r4 - r2
            int r2 = r1.m
            int r2 = java.lang.Math.min(r4, r2)
            pc r4 = r0.b
            int r6 = r4.n
            int r4 = r4.m
            int r2 = java.lang.Math.max(r4, r2)
            if (r6 <= 0) goto L335
            int r2 = java.lang.Math.min(r6, r2)
        L335:
            r1.d(r2)
        L338:
            boolean r2 = r1.j
            if (r2 != 0) goto L33d
            goto L374
        L33d:
            java.lang.Object r2 = r5.get(r3)
            jg r2 = (defpackage.jg) r2
            java.lang.Object r3 = r9.get(r3)
            jg r3 = (defpackage.jg) r3
            int r4 = r2.g
            int r5 = r7.f
            int r5 = r5 + r4
            int r6 = r3.g
            int r9 = r8.f
            int r9 = r9 + r6
            pc r10 = r0.b
            float r10 = r10.S
            if (r2 != r3) goto L35c
            r10 = r24
            goto L35e
        L35c:
            r4 = r5
            r6 = r9
        L35e:
            int r6 = r6 - r4
            int r2 = r1.g
            int r6 = r6 - r2
            float r2 = (float) r4
            float r2 = r2 + r24
            float r3 = (float) r6
            float r3 = r3 * r10
            float r3 = r3 + r2
            int r2 = (int) r3
            r7.d(r2)
            int r2 = r7.g
            int r1 = r1.g
            int r2 = r2 + r1
            r8.d(r2)
        L374:
            return
        L375:
            pc r1 = r0.b
            cc r2 = r1.x
            cc r1 = r1.z
            r0.l(r2, r1, r3)
            return
    }

    @Override // defpackage.qb0
    public final void d() {
            r13 = this;
            pc r0 = r13.b
            boolean r1 = r0.a
            sg r2 = r13.e
            if (r1 == 0) goto Lf
            int r0 = r0.l()
            r2.d(r0)
        Lf:
            boolean r0 = r2.j
            java.util.ArrayList r1 = r2.k
            java.util.ArrayList r3 = r2.l
            r4 = 3
            r5 = 4
            r6 = 1
            r7 = 0
            jg r8 = r13.i
            jg r9 = r13.h
            if (r0 != 0) goto L7c
            pc r0 = r13.b
            int[] r10 = r0.c0
            r10 = r10[r7]
            r13.d = r10
            if (r10 == r4) goto Lb0
            if (r10 != r5) goto L72
            pc r11 = r0.I
            if (r11 == 0) goto L35
            int[] r12 = r11.c0
            r12 = r12[r7]
            if (r12 == r6) goto L3b
        L35:
            int[] r12 = r11.c0
            r12 = r12[r7]
            if (r12 != r5) goto L72
        L3b:
            int r0 = r11.l()
            po r1 = r11.d
            pc r3 = r13.b
            cc r3 = r3.x
            int r3 = r3.c()
            int r0 = r0 - r3
            pc r3 = r13.b
            cc r3 = r3.z
            int r3 = r3.c()
            int r0 = r0 - r3
            jg r3 = r1.h
            pc r4 = r13.b
            cc r4 = r4.x
            int r4 = r4.c()
            defpackage.qb0.b(r9, r3, r4)
            jg r1 = r1.i
            pc r3 = r13.b
            cc r3 = r3.z
            int r3 = r3.c()
            int r3 = -r3
            defpackage.qb0.b(r8, r1, r3)
            r2.d(r0)
            return
        L72:
            if (r10 != r6) goto Lb0
            int r0 = r0.l()
            r2.d(r0)
            goto Lb0
        L7c:
            int r0 = r13.d
            if (r0 != r5) goto Lb0
            pc r0 = r13.b
            pc r10 = r0.I
            if (r10 == 0) goto L8c
            int[] r11 = r10.c0
            r11 = r11[r7]
            if (r11 == r6) goto L92
        L8c:
            int[] r11 = r10.c0
            r11 = r11[r7]
            if (r11 != r5) goto Lb0
        L92:
            po r1 = r10.d
            jg r1 = r1.h
            cc r0 = r0.x
            int r0 = r0.c()
            defpackage.qb0.b(r9, r1, r0)
            po r0 = r10.d
            jg r0 = r0.i
            pc r1 = r13.b
            cc r1 = r1.z
            int r1 = r1.c()
            int r1 = -r1
            defpackage.qb0.b(r8, r0, r1)
            return
        Lb0:
            boolean r0 = r2.j
            if (r0 == 0) goto L182
            pc r0 = r13.b
            boolean r10 = r0.a
            if (r10 == 0) goto L182
            cc[] r1 = r0.F
            r3 = r1[r7]
            cc r4 = r3.d
            if (r4 == 0) goto L120
            r5 = r1[r6]
            cc r5 = r5.d
            if (r5 == 0) goto L120
            boolean r0 = r0.q()
            if (r0 == 0) goto Le8
            pc r0 = r13.b
            cc[] r0 = r0.F
            r0 = r0[r7]
            int r0 = r0.c()
            r9.f = r0
            pc r0 = r13.b
            cc[] r0 = r0.F
            r0 = r0[r6]
            int r0 = r0.c()
            int r0 = -r0
            r8.f = r0
            return
        Le8:
            pc r0 = r13.b
            cc[] r0 = r0.F
            r0 = r0[r7]
            jg r0 = defpackage.qb0.h(r0)
            if (r0 == 0) goto L101
            pc r1 = r13.b
            cc[] r1 = r1.F
            r1 = r1[r7]
            int r1 = r1.c()
            defpackage.qb0.b(r9, r0, r1)
        L101:
            pc r0 = r13.b
            cc[] r0 = r0.F
            r0 = r0[r6]
            jg r0 = defpackage.qb0.h(r0)
            if (r0 == 0) goto L11b
            pc r1 = r13.b
            cc[] r1 = r1.F
            r1 = r1[r6]
            int r1 = r1.c()
            int r1 = -r1
            defpackage.qb0.b(r8, r0, r1)
        L11b:
            r9.b = r6
            r8.b = r6
            return
        L120:
            if (r4 == 0) goto L13b
            jg r0 = defpackage.qb0.h(r3)
            if (r0 == 0) goto L2fd
            pc r1 = r13.b
            cc[] r1 = r1.F
            r1 = r1[r7]
            int r1 = r1.c()
            defpackage.qb0.b(r9, r0, r1)
            int r0 = r2.g
            defpackage.qb0.b(r8, r9, r0)
            return
        L13b:
            r1 = r1[r6]
            cc r3 = r1.d
            if (r3 == 0) goto L15c
            jg r0 = defpackage.qb0.h(r1)
            if (r0 == 0) goto L2fd
            pc r1 = r13.b
            cc[] r1 = r1.F
            r1 = r1[r6]
            int r1 = r1.c()
            int r1 = -r1
            defpackage.qb0.b(r8, r0, r1)
            int r0 = r2.g
            int r0 = -r0
            defpackage.qb0.b(r9, r8, r0)
            return
        L15c:
            boolean r1 = r0 instanceof defpackage.oo
            if (r1 != 0) goto L2fd
            pc r1 = r0.I
            if (r1 == 0) goto L2fd
            r1 = 7
            cc r0 = r0.g(r1)
            cc r0 = r0.d
            if (r0 != 0) goto L2fd
            pc r0 = r13.b
            pc r1 = r0.I
            po r1 = r1.d
            jg r1 = r1.h
            int r0 = r0.m()
            defpackage.qb0.b(r9, r1, r0)
            int r0 = r2.g
            defpackage.qb0.b(r8, r9, r0)
            return
        L182:
            int r0 = r13.d
            if (r0 != r4) goto L262
            pc r0 = r13.b
            int r10 = r0.j
            m90 r11 = r0.e
            r12 = 2
            if (r10 == r12) goto L249
            if (r10 == r4) goto L193
            goto L262
        L193:
            int r10 = r0.k
            if (r10 != r4) goto L216
            r9.a = r13
            r8.a = r13
            jg r4 = r11.h
            r4.a = r13
            jg r4 = r11.i
            r4.a = r13
            r2.a = r13
            boolean r0 = r0.r()
            if (r0 == 0) goto L1ed
            pc r0 = r13.b
            m90 r0 = r0.e
            sg r0 = r0.e
            r3.add(r0)
            pc r0 = r13.b
            m90 r0 = r0.e
            sg r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            pc r0 = r13.b
            m90 r0 = r0.e
            sg r1 = r0.e
            r1.a = r13
            jg r0 = r0.h
            r3.add(r0)
            pc r0 = r13.b
            m90 r0 = r0.e
            jg r0 = r0.i
            r3.add(r0)
            pc r0 = r13.b
            m90 r0 = r0.e
            jg r0 = r0.h
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            pc r0 = r13.b
            m90 r0 = r0.e
            jg r0 = r0.i
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            goto L262
        L1ed:
            pc r0 = r13.b
            boolean r0 = r0.q()
            if (r0 == 0) goto L20a
            pc r0 = r13.b
            m90 r0 = r0.e
            sg r0 = r0.e
            java.util.ArrayList r0 = r0.l
            r0.add(r2)
            pc r0 = r13.b
            m90 r0 = r0.e
            sg r0 = r0.e
            r1.add(r0)
            goto L262
        L20a:
            pc r0 = r13.b
            m90 r0 = r0.e
            sg r0 = r0.e
            java.util.ArrayList r0 = r0.l
            r0.add(r2)
            goto L262
        L216:
            sg r0 = r11.e
            r3.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            pc r0 = r13.b
            m90 r0 = r0.e
            jg r0 = r0.h
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            pc r0 = r13.b
            m90 r0 = r0.e
            jg r0 = r0.i
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r6
            r1.add(r9)
            r1.add(r8)
            java.util.ArrayList r0 = r9.l
            r0.add(r2)
            java.util.ArrayList r0 = r8.l
            r0.add(r2)
            goto L262
        L249:
            pc r0 = r0.I
            if (r0 != 0) goto L24e
            goto L262
        L24e:
            m90 r0 = r0.e
            sg r0 = r0.e
            r3.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r6
            r1.add(r9)
            r1.add(r8)
        L262:
            pc r0 = r13.b
            cc[] r1 = r0.F
            r3 = r1[r7]
            cc r4 = r3.d
            if (r4 == 0) goto L2af
            r10 = r1[r6]
            cc r10 = r10.d
            if (r10 == 0) goto L2af
            boolean r0 = r0.q()
            if (r0 == 0) goto L292
            pc r0 = r13.b
            cc[] r0 = r0.F
            r0 = r0[r7]
            int r0 = r0.c()
            r9.f = r0
            pc r0 = r13.b
            cc[] r0 = r0.F
            r0 = r0[r6]
            int r0 = r0.c()
            int r0 = -r0
            r8.f = r0
            return
        L292:
            pc r0 = r13.b
            cc[] r0 = r0.F
            r0 = r0[r7]
            jg r0 = defpackage.qb0.h(r0)
            pc r1 = r13.b
            cc[] r1 = r1.F
            r1 = r1[r6]
            jg r1 = defpackage.qb0.h(r1)
            r0.b(r13)
            r1.b(r13)
            r13.j = r5
            return
        L2af:
            if (r4 == 0) goto L2c8
            jg r0 = defpackage.qb0.h(r3)
            if (r0 == 0) goto L2fd
            pc r1 = r13.b
            cc[] r1 = r1.F
            r1 = r1[r7]
            int r1 = r1.c()
            defpackage.qb0.b(r9, r0, r1)
            r13.c(r8, r9, r6, r2)
            return
        L2c8:
            r1 = r1[r6]
            cc r3 = r1.d
            if (r3 == 0) goto L2e7
            jg r0 = defpackage.qb0.h(r1)
            if (r0 == 0) goto L2fd
            pc r1 = r13.b
            cc[] r1 = r1.F
            r1 = r1[r6]
            int r1 = r1.c()
            int r1 = -r1
            defpackage.qb0.b(r8, r0, r1)
            r0 = -1
            r13.c(r9, r8, r0, r2)
            return
        L2e7:
            boolean r1 = r0 instanceof defpackage.oo
            if (r1 != 0) goto L2fd
            pc r1 = r0.I
            if (r1 == 0) goto L2fd
            po r1 = r1.d
            jg r1 = r1.h
            int r0 = r0.m()
            defpackage.qb0.b(r9, r1, r0)
            r13.c(r8, r9, r6, r2)
        L2fd:
            return
    }

    @Override // defpackage.qb0
    public final void e() {
            r2 = this;
            jg r0 = r2.h
            boolean r1 = r0.j
            if (r1 == 0) goto Lc
            pc r1 = r2.b
            int r0 = r0.g
            r1.N = r0
        Lc:
            return
    }

    @Override // defpackage.qb0
    public final void f() {
            r1 = this;
            r0 = 0
            r1.c = r0
            jg r0 = r1.h
            r0.c()
            jg r0 = r1.i
            r0.c()
            sg r0 = r1.e
            r0.c()
            r0 = 0
            r1.g = r0
            return
    }

    @Override // defpackage.qb0
    public final boolean k() {
            r2 = this;
            int r0 = r2.d
            r1 = 3
            if (r0 != r1) goto Le
            pc r0 = r2.b
            int r0 = r0.j
            if (r0 != 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            return r0
        Le:
            r0 = 1
            return r0
    }

    public final void n() {
            r2 = this;
            r0 = 0
            r2.g = r0
            jg r1 = r2.h
            r1.c()
            r1.j = r0
            jg r1 = r2.i
            r1.c()
            r1.j = r0
            sg r1 = r2.e
            r1.j = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HorizontalRun "
            r0.<init>(r1)
            pc r1 = r2.b
            java.lang.String r1 = r1.W
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
