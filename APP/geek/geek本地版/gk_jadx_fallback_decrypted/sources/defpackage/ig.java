package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ig {
    public defpackage.qc a;
    public boolean b;
    public boolean c;
    public defpackage.qc d;
    public java.util.ArrayList e;
    public defpackage.hc f;
    public defpackage.k7 g;
    public java.util.ArrayList h;

    public final void a(defpackage.jg r10, int r11, java.util.ArrayList r12, defpackage.j10 r13) {
            r9 = this;
            qb0 r10 = r10.d
            j10 r0 = r10.c
            jg r1 = r10.i
            jg r2 = r10.h
            if (r0 != 0) goto Ld9
            qc r0 = r9.a
            po r3 = r0.d
            if (r10 == r3) goto Ld9
            m90 r0 = r0.e
            if (r10 != r0) goto L16
            goto Ld9
        L16:
            if (r13 != 0) goto L2c
            j10 r13 = new j10
            r13.<init>()
            r0 = 0
            r13.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.b = r0
            r13.a = r10
            r12.add(r13)
        L2c:
            r10.c = r13
            java.util.ArrayList r0 = r13.b
            r0.add(r10)
            java.util.ArrayList r0 = r2.k
            int r3 = r0.size()
            r4 = 0
            r5 = r4
        L3b:
            if (r5 >= r3) goto L4f
            java.lang.Object r6 = r0.get(r5)
            int r5 = r5 + 1
            hg r6 = (defpackage.hg) r6
            boolean r7 = r6 instanceof defpackage.jg
            if (r7 == 0) goto L3b
            jg r6 = (defpackage.jg) r6
            r9.a(r6, r11, r12, r13)
            goto L3b
        L4f:
            java.util.ArrayList r0 = r1.k
            int r3 = r0.size()
            r5 = r4
        L56:
            if (r5 >= r3) goto L6a
            java.lang.Object r6 = r0.get(r5)
            int r5 = r5 + 1
            hg r6 = (defpackage.hg) r6
            boolean r7 = r6 instanceof defpackage.jg
            if (r7 == 0) goto L56
            jg r6 = (defpackage.jg) r6
            r9.a(r6, r11, r12, r13)
            goto L56
        L6a:
            r0 = 1
            if (r11 != r0) goto L91
            boolean r3 = r10 instanceof defpackage.m90
            if (r3 == 0) goto L91
            r3 = r10
            m90 r3 = (defpackage.m90) r3
            jg r3 = r3.k
            java.util.ArrayList r3 = r3.k
            int r5 = r3.size()
            r6 = r4
        L7d:
            if (r6 >= r5) goto L91
            java.lang.Object r7 = r3.get(r6)
            int r6 = r6 + 1
            hg r7 = (defpackage.hg) r7
            boolean r8 = r7 instanceof defpackage.jg
            if (r8 == 0) goto L7d
            jg r7 = (defpackage.jg) r7
            r9.a(r7, r11, r12, r13)
            goto L7d
        L91:
            java.util.ArrayList r2 = r2.l
            int r3 = r2.size()
            r5 = r4
        L98:
            if (r5 >= r3) goto La6
            java.lang.Object r6 = r2.get(r5)
            int r5 = r5 + 1
            jg r6 = (defpackage.jg) r6
            r9.a(r6, r11, r12, r13)
            goto L98
        La6:
            java.util.ArrayList r1 = r1.l
            int r2 = r1.size()
            r3 = r4
        Lad:
            if (r3 >= r2) goto Lbb
            java.lang.Object r5 = r1.get(r3)
            int r3 = r3 + 1
            jg r5 = (defpackage.jg) r5
            r9.a(r5, r11, r12, r13)
            goto Lad
        Lbb:
            if (r11 != r0) goto Ld9
            boolean r0 = r10 instanceof defpackage.m90
            if (r0 == 0) goto Ld9
            m90 r10 = (defpackage.m90) r10
            jg r10 = r10.k
            java.util.ArrayList r10 = r10.l
            int r0 = r10.size()
        Lcb:
            if (r4 >= r0) goto Ld9
            java.lang.Object r1 = r10.get(r4)
            int r4 = r4 + 1
            jg r1 = (defpackage.jg) r1
            r9.a(r1, r11, r12, r13)
            goto Lcb
        Ld9:
            return
    }

    public final void b(defpackage.qc r27) {
            r26 = this;
            r0 = r27
            java.util.ArrayList r1 = r0.d0
            int[] r2 = r0.c0
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        Lc:
            if (r5 >= r3) goto L310
            java.lang.Object r6 = r1.get(r5)
            int r5 = r5 + 1
            r12 = r6
            pc r12 = (defpackage.pc) r12
            int[] r6 = r12.c0
            cc[] r7 = r12.F
            cc r8 = r12.A
            cc r9 = r12.y
            cc r10 = r12.z
            cc r11 = r12.x
            m90 r13 = r12.e
            po r14 = r12.d
            r15 = r6[r4]
            r16 = r4
            r4 = 1
            r6 = r6[r4]
            int r4 = r12.V
            r0 = 8
            if (r4 != r0) goto L3c
            r0 = 1
            r12.a = r0
            r0 = r27
            r4 = r16
            goto Lc
        L3c:
            float r0 = r12.o
            r4 = 1065353216(0x3f800000, float:1.0)
            int r18 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r19 = r4
            r4 = 3
            r20 = r0
            r0 = 2
            if (r18 >= 0) goto L4e
            if (r15 != r4) goto L4e
            r12.j = r0
        L4e:
            float r0 = r12.r
            int r21 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r21 >= 0) goto L59
            if (r6 != r4) goto L59
            r4 = 2
            r12.k = r4
        L59:
            float r4 = r12.L
            r22 = 0
            int r4 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            r22 = r0
            r0 = 1
            if (r4 <= 0) goto L90
            r4 = 3
            if (r15 != r4) goto L73
            r4 = 2
            if (r6 == r4) goto L6c
            if (r6 != r0) goto L6e
        L6c:
            r0 = 3
            goto L70
        L6e:
            r0 = 3
            goto L75
        L70:
            r12.j = r0
            goto L91
        L73:
            r0 = r4
            r4 = 2
        L75:
            if (r6 != r0) goto L7f
            if (r15 == r4) goto L7c
            r4 = 1
            if (r15 != r4) goto L7f
        L7c:
            r12.k = r0
            goto L91
        L7f:
            if (r15 != r0) goto L91
            if (r6 != r0) goto L91
            int r4 = r12.j
            if (r4 != 0) goto L89
            r12.j = r0
        L89:
            int r4 = r12.k
            if (r4 != 0) goto L91
            r12.k = r0
            goto L91
        L90:
            r0 = 3
        L91:
            if (r15 != r0) goto La1
            int r0 = r12.j
            r4 = 1
            if (r0 != r4) goto La1
            cc r0 = r11.d
            if (r0 == 0) goto La0
            cc r0 = r10.d
            if (r0 != 0) goto La1
        La0:
            r15 = 2
        La1:
            r0 = 3
            if (r6 != r0) goto Lb2
            int r0 = r12.k
            r4 = 1
            if (r0 != r4) goto Lb2
            cc r0 = r9.d
            if (r0 == 0) goto Lb1
            cc r0 = r8.d
            if (r0 != 0) goto Lb2
        Lb1:
            r6 = 2
        Lb2:
            r14.d = r15
            sg r0 = r14.e
            int r4 = r12.j
            r14.a = r4
            r13.d = r6
            sg r14 = r13.e
            r25 = r1
            int r1 = r12.k
            r13.a = r1
            r13 = 4
            if (r15 == r13) goto Lcd
            r13 = 1
            if (r15 == r13) goto Lcd
            r13 = 2
            if (r15 != r13) goto Ldb
        Lcd:
            r13 = 4
            if (r6 == r13) goto Ld6
            r13 = 1
            if (r6 == r13) goto L2c6
            r13 = 2
            if (r6 != r13) goto Ldb
        Ld6:
            r7 = r6
            r24 = 1
            goto L2c9
        Ldb:
            r23 = 1056964608(0x3f000000, float:0.5)
            r8 = 3
            if (r15 != r8) goto L19f
            if (r6 == r13) goto Led
            r10 = 1
            if (r6 != r10) goto Le6
            goto Led
        Le6:
            r9 = r10
            r10 = r6
            r6 = r9
            r9 = r8
            r8 = r13
            goto L1a3
        Led:
            if (r4 != r8) goto L129
            if (r6 != r13) goto Lfa
            r9 = 0
            r11 = 0
            r10 = r13
            r7 = r26
            r8 = r13
            r7.f(r8, r9, r10, r11, r12)
        Lfa:
            int r11 = r12.i()
            float r1 = (float) r11
            float r4 = r12.L
            float r1 = r1 * r4
            float r1 = r1 + r23
            int r9 = (int) r1
            r24 = 1
            r10 = r24
            r7 = r26
            r8 = r24
            r7.f(r8, r9, r10, r11, r12)
            int r1 = r12.l()
            r0.d(r1)
            int r0 = r12.i()
            r14.d(r0)
            r8 = 1
            r12.a = r8
        L121:
            r0 = r27
            r4 = r16
            r1 = r25
            goto Lc
        L129:
            r8 = 1
            r10 = 1
            if (r4 != r8) goto L13d
            r9 = 0
            r11 = 0
            r7 = r26
            r10 = r6
            r8 = r13
            r7.f(r8, r9, r10, r11, r12)
            int r1 = r12.l()
            r0.m = r1
            goto L121
        L13d:
            r8 = 2
            if (r4 != r8) goto L175
            r8 = r2[r16]
            if (r8 == r10) goto L14e
            r9 = 4
            if (r8 != r9) goto L148
            goto L14e
        L148:
            r8 = r10
            r10 = r6
            r6 = r8
        L14b:
            r8 = r13
        L14c:
            r9 = 3
            goto L1a3
        L14e:
            int r1 = r27.l()
            float r1 = (float) r1
            float r1 = r1 * r20
            float r1 = r1 + r23
            int r9 = (int) r1
            int r11 = r12.i()
            r7 = r26
            r8 = r10
            r10 = r6
            r7.f(r8, r9, r10, r11, r12)
            int r1 = r12.l()
            r0.d(r1)
            int r0 = r12.i()
            r14.d(r0)
            r8 = 1
            r12.a = r8
            goto L121
        L175:
            r8 = r10
            r10 = r6
            r6 = r8
            r8 = 1
            r9 = r7[r16]
            cc r9 = r9.d
            if (r9 == 0) goto L185
            r9 = r7[r8]
            cc r8 = r9.d
            if (r8 != 0) goto L14b
        L185:
            r9 = 0
            r11 = 0
            r7 = r26
            r8 = r13
            r7.f(r8, r9, r10, r11, r12)
            int r1 = r12.l()
            r0.d(r1)
            int r0 = r12.i()
            r14.d(r0)
            r4 = 1
            r12.a = r4
            goto L121
        L19f:
            r10 = r6
            r8 = r13
            r6 = 1
            goto L14c
        L1a3:
            if (r10 != r9) goto L1aa
            if (r15 == r8) goto L1b0
            if (r15 != r6) goto L1aa
            goto L1b0
        L1aa:
            r13 = r8
            r7 = r10
        L1ac:
            r8 = r6
            r6 = 1
            goto L268
        L1b0:
            if (r1 != r9) goto L1e8
            if (r15 != r8) goto L1bc
            r9 = 0
            r11 = 0
            r10 = r8
            r7 = r26
            r7.f(r8, r9, r10, r11, r12)
        L1bc:
            int r9 = r12.l()
            float r1 = r12.L
            int r4 = r12.M
            r7 = -1
            if (r4 != r7) goto L1c9
            float r1 = r19 / r1
        L1c9:
            float r4 = (float) r9
            float r4 = r4 * r1
            float r4 = r4 + r23
            int r11 = (int) r4
            r10 = r6
            r7 = r26
            r8 = r6
            r7.f(r8, r9, r10, r11, r12)
            int r1 = r12.l()
            r0.d(r1)
            int r0 = r12.i()
            r14.d(r0)
            r8 = 1
            r12.a = r8
            goto L121
        L1e8:
            r13 = r8
            r8 = 1
            if (r1 != r8) goto L1fd
            r9 = 0
            r11 = 0
            r7 = r26
            r10 = r13
            r8 = r15
            r7.f(r8, r9, r10, r11, r12)
            int r0 = r12.i()
            r14.m = r0
            goto L121
        L1fd:
            r17 = r8
            r8 = r15
            r9 = 2
            if (r1 != r9) goto L236
            r7 = r2[r17]
            if (r7 == r6) goto L20f
            r9 = 4
            if (r7 != r9) goto L20b
            goto L20f
        L20b:
            r15 = r8
            r7 = r10
            r9 = 3
            goto L1ac
        L20f:
            int r9 = r12.l()
            int r1 = r27.i()
            float r1 = (float) r1
            float r1 = r1 * r22
            float r1 = r1 + r23
            int r11 = (int) r1
            r7 = r26
            r10 = r6
            r7.f(r8, r9, r10, r11, r12)
            int r1 = r12.l()
            r0.d(r1)
            int r0 = r12.i()
            r14.d(r0)
            r4 = 1
            r12.a = r4
            goto L121
        L236:
            r15 = r8
            r18 = r9
            r8 = r6
            r6 = r7[r18]
            cc r6 = r6.d
            if (r6 == 0) goto L24d
            r21 = 3
            r6 = r7[r21]
            cc r6 = r6.d
            if (r6 != 0) goto L249
            goto L24d
        L249:
            r7 = r10
            r6 = 1
            r9 = 3
            goto L268
        L24d:
            r9 = 0
            r11 = 0
            r7 = r26
            r8 = r13
            r7.f(r8, r9, r10, r11, r12)
            int r1 = r12.l()
            r0.d(r1)
            int r0 = r12.i()
            r14.d(r0)
            r6 = 1
            r12.a = r6
            goto L121
        L268:
            if (r15 != r9) goto L121
            if (r7 != r9) goto L121
            if (r4 == r6) goto L2af
            if (r1 != r6) goto L271
            goto L2af
        L271:
            r9 = 2
            if (r1 != r9) goto L121
            if (r4 != r9) goto L121
            r1 = r2[r16]
            if (r1 == r8) goto L27c
            if (r1 != r8) goto L121
        L27c:
            r1 = r2[r6]
            if (r1 == r8) goto L282
            if (r1 != r8) goto L121
        L282:
            int r1 = r27.l()
            float r1 = (float) r1
            float r1 = r1 * r20
            float r1 = r1 + r23
            int r9 = (int) r1
            int r1 = r27.i()
            float r1 = (float) r1
            float r1 = r1 * r22
            float r1 = r1 + r23
            int r11 = (int) r1
            r10 = r8
            r7 = r26
            r7.f(r8, r9, r10, r11, r12)
            int r1 = r12.l()
            r0.d(r1)
            int r0 = r12.i()
            r14.d(r0)
            r4 = 1
            r12.a = r4
            goto L121
        L2af:
            r9 = 0
            r11 = 0
            r10 = r13
            r7 = r26
            r8 = r13
            r7.f(r8, r9, r10, r11, r12)
            int r1 = r12.l()
            r0.m = r1
            int r0 = r12.i()
            r14.m = r0
            goto L121
        L2c6:
            r7 = r6
            r24 = r13
        L2c9:
            int r1 = r12.l()
            r13 = 4
            if (r15 != r13) goto L2dc
            int r1 = r27.l()
            int r4 = r11.e
            int r1 = r1 - r4
            int r4 = r10.e
            int r1 = r1 - r4
            r15 = r24
        L2dc:
            int r4 = r12.i()
            if (r7 != r13) goto L2f4
            int r4 = r27.i()
            int r6 = r9.e
            int r4 = r4 - r6
            int r6 = r8.e
            int r4 = r4 - r6
            r10 = r24
            r7 = r26
            r9 = r1
            r11 = r4
            r8 = r15
            goto L2fa
        L2f4:
            r10 = r7
            r9 = r1
            r11 = r4
            r8 = r15
            r7 = r26
        L2fa:
            r7.f(r8, r9, r10, r11, r12)
            int r1 = r12.l()
            r0.d(r1)
            int r0 = r12.i()
            r14.d(r0)
            r4 = 1
            r12.a = r4
            goto L121
        L310:
            return
    }

    public final void c() {
            r12 = this;
            qc r0 = r12.a
            java.util.ArrayList r1 = r12.h
            java.util.ArrayList r2 = r12.e
            r2.clear()
            qc r3 = r12.d
            po r4 = r3.d
            r4.f()
            m90 r4 = r3.e
            r4.f()
            po r5 = r3.d
            r2.add(r5)
            r2.add(r4)
            java.util.ArrayList r4 = r3.d0
            int r5 = r4.size()
            r6 = 0
            r7 = 0
            r8 = r7
        L26:
            r9 = 1
            if (r8 >= r5) goto La1
            java.lang.Object r10 = r4.get(r8)
            int r8 = r8 + 1
            pc r10 = (defpackage.pc) r10
            boolean r11 = r10 instanceof defpackage.go
            if (r11 == 0) goto L4e
            ho r9 = new ho
            r9.<init>(r10)
            po r11 = r10.d
            r11.f()
            m90 r11 = r10.e
            r11.f()
            go r10 = (defpackage.go) r10
            int r10 = r10.h0
            r9.f = r10
            r2.add(r9)
            goto L26
        L4e:
            boolean r11 = r10.q()
            if (r11 == 0) goto L6c
            v8 r11 = r10.b
            if (r11 != 0) goto L5f
            v8 r11 = new v8
            r11.<init>(r10, r7)
            r10.b = r11
        L5f:
            if (r6 != 0) goto L66
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
        L66:
            v8 r11 = r10.b
            r6.add(r11)
            goto L71
        L6c:
            po r11 = r10.d
            r2.add(r11)
        L71:
            boolean r11 = r10.r()
            if (r11 == 0) goto L8f
            v8 r11 = r10.c
            if (r11 != 0) goto L82
            v8 r11 = new v8
            r11.<init>(r10, r9)
            r10.c = r11
        L82:
            if (r6 != 0) goto L89
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
        L89:
            v8 r9 = r10.c
            r6.add(r9)
            goto L94
        L8f:
            m90 r9 = r10.e
            r2.add(r9)
        L94:
            boolean r9 = r10 instanceof defpackage.oo
            if (r9 == 0) goto L26
            no r9 = new no
            r9.<init>(r10)
            r2.add(r9)
            goto L26
        La1:
            if (r6 == 0) goto La6
            r2.addAll(r6)
        La6:
            int r4 = r2.size()
            r5 = r7
        Lab:
            if (r5 >= r4) goto Lb9
            java.lang.Object r6 = r2.get(r5)
            int r5 = r5 + 1
            qb0 r6 = (defpackage.qb0) r6
            r6.f()
            goto Lab
        Lb9:
            int r4 = r2.size()
            r5 = r7
        Lbe:
            if (r5 >= r4) goto Ld1
            java.lang.Object r6 = r2.get(r5)
            int r5 = r5 + 1
            qb0 r6 = (defpackage.qb0) r6
            pc r8 = r6.b
            if (r8 != r3) goto Lcd
            goto Lbe
        Lcd:
            r6.d()
            goto Lbe
        Ld1:
            r1.clear()
            po r2 = r0.d
            r12.e(r2, r7, r1)
            m90 r0 = r0.e
            r12.e(r0, r9, r1)
            r12.b = r7
            return
    }

    public final int d(defpackage.qc r20, int r21) {
            r19 = this;
            r0 = r20
            r1 = r19
            r2 = r21
            java.util.ArrayList r3 = r1.h
            int r4 = r3.size()
            r5 = 0
            r7 = 0
            r8 = r5
        L10:
            if (r7 >= r4) goto L109
            java.lang.Object r10 = r3.get(r7)
            j10 r10 = (defpackage.j10) r10
            qb0 r10 = r10.a
            boolean r11 = r10 instanceof defpackage.v8
            if (r11 == 0) goto L2c
            r11 = r10
            v8 r11 = (defpackage.v8) r11
            int r11 = r11.f
            if (r11 == r2) goto L38
        L25:
            r17 = r3
            r18 = r4
            r0 = r5
            goto Lf7
        L2c:
            if (r2 != 0) goto L33
            boolean r11 = r10 instanceof defpackage.po
            if (r11 != 0) goto L38
            goto L25
        L33:
            boolean r11 = r10 instanceof defpackage.m90
            if (r11 != 0) goto L38
            goto L25
        L38:
            if (r2 != 0) goto L3f
            po r11 = r0.d
        L3c:
            jg r11 = r11.h
            goto L42
        L3f:
            m90 r11 = r0.e
            goto L3c
        L42:
            if (r2 != 0) goto L49
            po r12 = r0.d
        L46:
            jg r12 = r12.i
            goto L4c
        L49:
            m90 r12 = r0.e
            goto L46
        L4c:
            jg r13 = r10.h
            jg r14 = r10.i
            java.util.ArrayList r15 = r13.l
            boolean r11 = r15.contains(r11)
            java.util.ArrayList r15 = r14.l
            boolean r12 = r15.contains(r12)
            long r15 = r10.j()
            if (r11 == 0) goto Lc0
            if (r12 == 0) goto Lc0
            long r11 = defpackage.j10.b(r13, r5)
            long r0 = defpackage.j10.a(r14, r5)
            long r11 = r11 - r15
            int r5 = r14.f
            int r6 = -r5
            r17 = r3
            r18 = r4
            long r3 = (long) r6
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 < 0) goto L7b
            long r3 = (long) r5
            long r11 = r11 + r3
        L7b:
            long r0 = -r0
            long r0 = r0 - r15
            int r3 = r13.f
            long r3 = (long) r3
            long r0 = r0 - r3
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L86
            long r0 = r0 - r3
        L86:
            pc r3 = r10.b
            if (r2 != 0) goto L8d
            float r3 = r3.S
            goto L98
        L8d:
            r4 = 1
            if (r2 != r4) goto L93
            float r3 = r3.T
            goto L98
        L93:
            r3.getClass()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L98:
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 <= 0) goto La8
            float r0 = (float) r0
            float r0 = r0 / r3
            float r1 = (float) r11
            float r4 = r5 - r3
            float r1 = r1 / r4
            float r1 = r1 + r0
            long r0 = (long) r1
            goto Laa
        La8:
            r0 = 0
        Laa:
            float r0 = (float) r0
            float r1 = r0 * r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r4
            long r10 = (long) r1
            float r5 = r5 - r3
            float r5 = r5 * r0
            float r5 = r5 + r4
            long r0 = (long) r5
            long r10 = r10 + r15
            long r10 = r10 + r0
            int r0 = r13.f
            long r0 = (long) r0
            long r0 = r0 + r10
            int r3 = r14.f
            long r3 = (long) r3
            long r0 = r0 - r3
            goto Lf7
        Lc0:
            r17 = r3
            r18 = r4
            if (r11 == 0) goto Ld6
            int r0 = r13.f
            long r0 = (long) r0
            long r0 = defpackage.j10.b(r13, r0)
            int r3 = r13.f
            long r3 = (long) r3
            long r3 = r3 + r15
            long r0 = java.lang.Math.max(r0, r3)
            goto Lf7
        Ld6:
            if (r12 == 0) goto Lea
            int r0 = r14.f
            long r0 = (long) r0
            long r0 = defpackage.j10.a(r14, r0)
            int r3 = r14.f
            int r3 = -r3
            long r3 = (long) r3
            long r3 = r3 + r15
            long r0 = -r0
            long r0 = java.lang.Math.max(r0, r3)
            goto Lf7
        Lea:
            int r0 = r13.f
            long r0 = (long) r0
            long r3 = r10.j()
            long r3 = r3 + r0
            int r0 = r14.f
            long r0 = (long) r0
            long r0 = r3 - r0
        Lf7:
            long r8 = java.lang.Math.max(r8, r0)
            int r7 = r7 + 1
            r1 = r19
            r0 = r20
            r3 = r17
            r4 = r18
            r5 = 0
            goto L10
        L109:
            int r0 = (int) r8
            return r0
    }

    public final void e(defpackage.qb0 r9, int r10, java.util.ArrayList r11) {
            r8 = this;
            jg r0 = r9.h
            jg r1 = r9.i
            java.util.ArrayList r0 = r0.k
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        Lc:
            r5 = 0
            if (r4 >= r2) goto L2d
            java.lang.Object r6 = r0.get(r4)
            int r4 = r4 + 1
            hg r6 = (defpackage.hg) r6
            boolean r7 = r6 instanceof defpackage.jg
            if (r7 == 0) goto L21
            jg r6 = (defpackage.jg) r6
            r8.a(r6, r10, r11, r5)
            goto Lc
        L21:
            boolean r7 = r6 instanceof defpackage.qb0
            if (r7 == 0) goto Lc
            qb0 r6 = (defpackage.qb0) r6
            jg r6 = r6.h
            r8.a(r6, r10, r11, r5)
            goto Lc
        L2d:
            java.util.ArrayList r0 = r1.k
            int r1 = r0.size()
            r2 = r3
        L34:
            if (r2 >= r1) goto L54
            java.lang.Object r4 = r0.get(r2)
            int r2 = r2 + 1
            hg r4 = (defpackage.hg) r4
            boolean r6 = r4 instanceof defpackage.jg
            if (r6 == 0) goto L48
            jg r4 = (defpackage.jg) r4
            r8.a(r4, r10, r11, r5)
            goto L34
        L48:
            boolean r6 = r4 instanceof defpackage.qb0
            if (r6 == 0) goto L34
            qb0 r4 = (defpackage.qb0) r4
            jg r4 = r4.i
            r8.a(r4, r10, r11, r5)
            goto L34
        L54:
            r0 = 1
            if (r10 != r0) goto L75
            m90 r9 = (defpackage.m90) r9
            jg r9 = r9.k
            java.util.ArrayList r9 = r9.k
            int r0 = r9.size()
        L61:
            if (r3 >= r0) goto L75
            java.lang.Object r1 = r9.get(r3)
            int r3 = r3 + 1
            hg r1 = (defpackage.hg) r1
            boolean r2 = r1 instanceof defpackage.jg
            if (r2 == 0) goto L61
            jg r1 = (defpackage.jg) r1
            r8.a(r1, r10, r11, r5)
            goto L61
        L75:
            return
    }

    public final void f(int r2, int r3, int r4, int r5, defpackage.pc r6) {
            r1 = this;
            k7 r0 = r1.g
            r0.a = r2
            r0.b = r4
            r0.c = r3
            r0.d = r5
            hc r2 = r1.f
            r2.a(r6, r0)
            int r2 = r0.e
            r6.y(r2)
            int r2 = r0.f
            r6.v(r2)
            boolean r2 = r0.h
            r6.w = r2
            int r2 = r0.g
            r6.P = r2
            if (r2 <= 0) goto L25
            r2 = 1
            goto L26
        L25:
            r2 = 0
        L26:
            r6.w = r2
            return
    }

    public final void g() {
            r18 = this;
            r0 = r18
            qc r1 = r0.a
            java.util.ArrayList r6 = r1.d0
            int r7 = r6.size()
            r8 = 0
            r1 = r8
        Lc:
            if (r1 >= r7) goto Lbe
            java.lang.Object r2 = r6.get(r1)
            int r9 = r1 + 1
            r5 = r2
            pc r5 = (defpackage.pc) r5
            boolean r1 = r5.a
            po r2 = r5.d
            m90 r10 = r5.e
            if (r1 == 0) goto L21
        L1f:
            r1 = r9
            goto Lc
        L21:
            int[] r1 = r5.c0
            r11 = r1[r8]
            r12 = 1
            r13 = r1[r12]
            int r1 = r5.j
            int r3 = r5.k
            r14 = 3
            r4 = 2
            if (r11 == r4) goto L37
            if (r11 != r14) goto L35
            if (r1 != r12) goto L35
            goto L37
        L35:
            r1 = r8
            goto L38
        L37:
            r1 = r12
        L38:
            if (r13 == r4) goto L41
            if (r13 != r14) goto L3f
            if (r3 != r12) goto L3f
            goto L41
        L3f:
            r3 = r8
            goto L42
        L41:
            r3 = r12
        L42:
            sg r15 = r2.e
            sg r2 = r2.e
            boolean r4 = r15.j
            sg r8 = r10.e
            sg r14 = r10.e
            boolean r12 = r8.j
            r17 = r1
            r1 = 1
            if (r4 == 0) goto L61
            if (r12 == 0) goto L61
            int r2 = r15.g
            int r4 = r8.g
            r3 = r1
            r0.f(r1, r2, r3, r4, r5)
            r0 = 1
            r5.a = r0
            goto Lac
        L61:
            if (r4 == 0) goto L84
            if (r3 == 0) goto L84
            int r2 = r15.g
            int r4 = r8.g
            r3 = 2
            r0 = r18
            r0.f(r1, r2, r3, r4, r5)
            r0 = 3
            if (r13 != r0) goto L79
            int r0 = r5.i()
            r14.m = r0
            goto Lac
        L79:
            int r0 = r5.i()
            r14.d(r0)
            r0 = 1
            r5.a = r0
            goto Lac
        L84:
            r16 = 2
            if (r12 == 0) goto Lac
            if (r17 == 0) goto Lac
            int r0 = r15.g
            int r4 = r8.g
            r3 = r1
            r8 = r2
            r1 = r16
            r2 = r0
            r0 = r18
            r0.f(r1, r2, r3, r4, r5)
            r0 = 3
            if (r11 != r0) goto La2
            int r0 = r5.l()
            r8.m = r0
            goto Lac
        La2:
            int r0 = r5.l()
            r8.d(r0)
            r0 = 1
            r5.a = r0
        Lac:
            boolean r0 = r5.a
            if (r0 == 0) goto Lb9
            j7 r0 = r10.l
            if (r0 == 0) goto Lb9
            int r1 = r5.P
            r0.d(r1)
        Lb9:
            r8 = 0
            r0 = r18
            goto L1f
        Lbe:
            return
    }
}
