package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m90 extends defpackage.qb0 {
    public defpackage.jg k;
    public defpackage.j7 l;

    @Override // defpackage.hg
    public final void a(defpackage.hg r11) {
            r10 = this;
            int r11 = r10.j
            int r11 = defpackage.z30.t(r11)
            r0 = 3
            r1 = 1
            if (r11 == r0) goto L140
            sg r11 = r10.e
            boolean r2 = r11.c
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            if (r2 == 0) goto L69
            boolean r2 = r11.j
            if (r2 != 0) goto L69
            int r2 = r10.d
            if (r2 != r0) goto L69
            pc r2 = r10.b
            int r5 = r2.k
            r6 = 2
            if (r5 == r6) goto L52
            if (r5 == r0) goto L25
            goto L69
        L25:
            po r5 = r2.d
            sg r5 = r5.e
            boolean r6 = r5.j
            if (r6 == 0) goto L69
            int r6 = r2.M
            r7 = -1
            if (r6 == r7) goto L48
            if (r6 == 0) goto L41
            if (r6 == r1) goto L38
            r2 = r4
            goto L4e
        L38:
            int r5 = r5.g
            float r5 = (float) r5
            float r2 = r2.L
        L3d:
            float r5 = r5 / r2
        L3e:
            float r5 = r5 + r3
            int r2 = (int) r5
            goto L4e
        L41:
            int r5 = r5.g
            float r5 = (float) r5
            float r2 = r2.L
            float r5 = r5 * r2
            goto L3e
        L48:
            int r5 = r5.g
            float r5 = (float) r5
            float r2 = r2.L
            goto L3d
        L4e:
            r11.d(r2)
            goto L69
        L52:
            pc r5 = r2.I
            if (r5 == 0) goto L69
            m90 r5 = r5.e
            sg r5 = r5.e
            boolean r6 = r5.j
            if (r6 == 0) goto L69
            float r2 = r2.r
            int r5 = r5.g
            float r5 = (float) r5
            float r5 = r5 * r2
            float r5 = r5 + r3
            int r2 = (int) r5
            r11.d(r2)
        L69:
            jg r2 = r10.h
            boolean r5 = r2.c
            java.util.ArrayList r6 = r2.l
            if (r5 == 0) goto L13f
            jg r5 = r10.i
            boolean r7 = r5.c
            java.util.ArrayList r8 = r5.l
            if (r7 != 0) goto L7b
            goto L13f
        L7b:
            boolean r7 = r2.j
            if (r7 == 0) goto L89
            boolean r7 = r5.j
            if (r7 == 0) goto L89
            boolean r7 = r11.j
            if (r7 == 0) goto L89
            goto L13f
        L89:
            boolean r7 = r11.j
            if (r7 != 0) goto Lbf
            int r7 = r10.d
            if (r7 != r0) goto Lbf
            pc r7 = r10.b
            int r9 = r7.j
            if (r9 != 0) goto Lbf
            boolean r7 = r7.r()
            if (r7 != 0) goto Lbf
            java.lang.Object r0 = r6.get(r4)
            jg r0 = (defpackage.jg) r0
            java.lang.Object r1 = r8.get(r4)
            jg r1 = (defpackage.jg) r1
            int r0 = r0.g
            int r3 = r2.f
            int r0 = r0 + r3
            int r1 = r1.g
            int r3 = r5.f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.d(r0)
            r5.d(r1)
            r11.d(r3)
            return
        Lbf:
            boolean r7 = r11.j
            if (r7 != 0) goto Lf9
            int r7 = r10.d
            if (r7 != r0) goto Lf9
            int r0 = r10.a
            if (r0 != r1) goto Lf9
            int r0 = r6.size()
            if (r0 <= 0) goto Lf9
            int r0 = r8.size()
            if (r0 <= 0) goto Lf9
            java.lang.Object r0 = r6.get(r4)
            jg r0 = (defpackage.jg) r0
            java.lang.Object r1 = r8.get(r4)
            jg r1 = (defpackage.jg) r1
            int r0 = r0.g
            int r7 = r2.f
            int r0 = r0 + r7
            int r1 = r1.g
            int r7 = r5.f
            int r1 = r1 + r7
            int r1 = r1 - r0
            int r0 = r11.m
            if (r1 >= r0) goto Lf6
            r11.d(r1)
            goto Lf9
        Lf6:
            r11.d(r0)
        Lf9:
            boolean r0 = r11.j
            if (r0 != 0) goto Lfe
            goto L13f
        Lfe:
            int r0 = r6.size()
            if (r0 <= 0) goto L13f
            int r0 = r8.size()
            if (r0 <= 0) goto L13f
            java.lang.Object r0 = r6.get(r4)
            jg r0 = (defpackage.jg) r0
            java.lang.Object r1 = r8.get(r4)
            jg r1 = (defpackage.jg) r1
            int r4 = r0.g
            int r6 = r2.f
            int r6 = r6 + r4
            int r7 = r1.g
            int r8 = r5.f
            int r8 = r8 + r7
            pc r9 = r10.b
            float r9 = r9.T
            if (r0 != r1) goto L128
            r9 = r3
            goto L12a
        L128:
            r4 = r6
            r7 = r8
        L12a:
            int r7 = r7 - r4
            int r0 = r11.g
            int r7 = r7 - r0
            float r0 = (float) r4
            float r0 = r0 + r3
            float r1 = (float) r7
            float r1 = r1 * r9
            float r1 = r1 + r0
            int r0 = (int) r1
            r2.d(r0)
            int r0 = r2.g
            int r11 = r11.g
            int r0 = r0 + r11
            r5.d(r0)
        L13f:
            return
        L140:
            pc r11 = r10.b
            cc r0 = r11.y
            cc r11 = r11.A
            r10.l(r0, r11, r1)
            return
    }

    @Override // defpackage.qb0
    public final void d() {
            r15 = this;
            jg r0 = r15.k
            pc r1 = r15.b
            boolean r2 = r1.a
            sg r3 = r15.e
            if (r2 == 0) goto L11
            int r1 = r1.i()
            r3.d(r1)
        L11:
            boolean r1 = r3.j
            java.util.ArrayList r2 = r3.k
            java.util.ArrayList r4 = r3.l
            r5 = 4
            r6 = 1
            r7 = 3
            jg r8 = r15.i
            jg r9 = r15.h
            if (r1 != 0) goto L88
            pc r1 = r15.b
            int[] r10 = r1.c0
            r10 = r10[r6]
            r15.d = r10
            boolean r1 = r1.w
            if (r1 == 0) goto L33
            j7 r1 = new j7
            r1.<init>(r15)
            r15.l = r1
        L33:
            int r1 = r15.d
            if (r1 == r7) goto Lb4
            if (r1 != r5) goto L7c
            pc r10 = r15.b
            pc r10 = r10.I
            if (r10 == 0) goto L7c
            m90 r11 = r10.e
            int[] r12 = r10.c0
            r12 = r12[r6]
            if (r12 != r6) goto L7c
            int r0 = r10.i()
            pc r1 = r15.b
            cc r1 = r1.y
            int r1 = r1.c()
            int r0 = r0 - r1
            pc r1 = r15.b
            cc r1 = r1.A
            int r1 = r1.c()
            int r0 = r0 - r1
            jg r1 = r11.h
            pc r2 = r15.b
            cc r2 = r2.y
            int r2 = r2.c()
            defpackage.qb0.b(r9, r1, r2)
            jg r1 = r11.i
            pc r2 = r15.b
            cc r2 = r2.A
            int r2 = r2.c()
            int r2 = -r2
            defpackage.qb0.b(r8, r1, r2)
            r3.d(r0)
            return
        L7c:
            if (r1 != r6) goto Lb4
            pc r1 = r15.b
            int r1 = r1.i()
            r3.d(r1)
            goto Lb4
        L88:
            int r1 = r15.d
            if (r1 != r5) goto Lb4
            pc r1 = r15.b
            pc r10 = r1.I
            if (r10 == 0) goto Lb4
            m90 r11 = r10.e
            int[] r10 = r10.c0
            r10 = r10[r6]
            if (r10 != r6) goto Lb4
            jg r0 = r11.h
            cc r1 = r1.y
            int r1 = r1.c()
            defpackage.qb0.b(r9, r0, r1)
            jg r0 = r11.i
            pc r1 = r15.b
            cc r1 = r1.A
            int r1 = r1.c()
            int r1 = -r1
            defpackage.qb0.b(r8, r0, r1)
            return
        Lb4:
            boolean r1 = r3.j
            r10 = 0
            r11 = 2
            if (r1 == 0) goto L1d1
            pc r12 = r15.b
            boolean r13 = r12.a
            if (r13 == 0) goto L1d1
            cc[] r1 = r12.F
            r2 = r1[r11]
            cc r4 = r2.d
            if (r4 == 0) goto L131
            r13 = r1[r7]
            cc r13 = r13.d
            if (r13 == 0) goto L131
            boolean r1 = r12.r()
            if (r1 == 0) goto Lee
            pc r1 = r15.b
            cc[] r1 = r1.F
            r1 = r1[r11]
            int r1 = r1.c()
            r9.f = r1
            pc r1 = r15.b
            cc[] r1 = r1.F
            r1 = r1[r7]
            int r1 = r1.c()
            int r1 = -r1
            r8.f = r1
            goto L125
        Lee:
            pc r1 = r15.b
            cc[] r1 = r1.F
            r1 = r1[r11]
            jg r1 = defpackage.qb0.h(r1)
            if (r1 == 0) goto L107
            pc r2 = r15.b
            cc[] r2 = r2.F
            r2 = r2[r11]
            int r2 = r2.c()
            defpackage.qb0.b(r9, r1, r2)
        L107:
            pc r1 = r15.b
            cc[] r1 = r1.F
            r1 = r1[r7]
            jg r1 = defpackage.qb0.h(r1)
            if (r1 == 0) goto L121
            pc r2 = r15.b
            cc[] r2 = r2.F
            r2 = r2[r7]
            int r2 = r2.c()
            int r2 = -r2
            defpackage.qb0.b(r8, r1, r2)
        L121:
            r9.b = r6
            r8.b = r6
        L125:
            pc r1 = r15.b
            boolean r2 = r1.w
            if (r2 == 0) goto L351
            int r1 = r1.P
            defpackage.qb0.b(r0, r9, r1)
            return
        L131:
            if (r4 == 0) goto L157
            jg r1 = defpackage.qb0.h(r2)
            if (r1 == 0) goto L351
            pc r2 = r15.b
            cc[] r2 = r2.F
            r2 = r2[r11]
            int r2 = r2.c()
            defpackage.qb0.b(r9, r1, r2)
            int r1 = r3.g
            defpackage.qb0.b(r8, r9, r1)
            pc r1 = r15.b
            boolean r2 = r1.w
            if (r2 == 0) goto L351
            int r1 = r1.P
            defpackage.qb0.b(r0, r9, r1)
            return
        L157:
            r2 = r1[r7]
            cc r4 = r2.d
            if (r4 == 0) goto L183
            jg r1 = defpackage.qb0.h(r2)
            if (r1 == 0) goto L177
            pc r2 = r15.b
            cc[] r2 = r2.F
            r2 = r2[r7]
            int r2 = r2.c()
            int r2 = -r2
            defpackage.qb0.b(r8, r1, r2)
            int r1 = r3.g
            int r1 = -r1
            defpackage.qb0.b(r9, r8, r1)
        L177:
            pc r1 = r15.b
            boolean r2 = r1.w
            if (r2 == 0) goto L351
            int r1 = r1.P
            defpackage.qb0.b(r0, r9, r1)
            return
        L183:
            r1 = r1[r5]
            cc r2 = r1.d
            if (r2 == 0) goto L1a0
            jg r1 = defpackage.qb0.h(r1)
            if (r1 == 0) goto L351
            defpackage.qb0.b(r0, r1, r10)
            pc r1 = r15.b
            int r1 = r1.P
            int r1 = -r1
            defpackage.qb0.b(r9, r0, r1)
            int r0 = r3.g
            defpackage.qb0.b(r8, r9, r0)
            return
        L1a0:
            boolean r1 = r12 instanceof defpackage.oo
            if (r1 != 0) goto L351
            pc r1 = r12.I
            if (r1 == 0) goto L351
            r1 = 7
            cc r1 = r12.g(r1)
            cc r1 = r1.d
            if (r1 != 0) goto L351
            pc r1 = r15.b
            pc r2 = r1.I
            m90 r2 = r2.e
            jg r2 = r2.h
            int r1 = r1.n()
            defpackage.qb0.b(r9, r2, r1)
            int r1 = r3.g
            defpackage.qb0.b(r8, r9, r1)
            pc r1 = r15.b
            boolean r2 = r1.w
            if (r2 == 0) goto L351
            int r1 = r1.P
            defpackage.qb0.b(r0, r9, r1)
            return
        L1d1:
            if (r1 != 0) goto L21c
            int r1 = r15.d
            if (r1 != r7) goto L21c
            pc r1 = r15.b
            int r12 = r1.k
            if (r12 == r11) goto L202
            if (r12 == r7) goto L1e0
            goto L21f
        L1e0:
            boolean r1 = r1.r()
            if (r1 != 0) goto L21f
            pc r1 = r15.b
            int r12 = r1.j
            if (r12 != r7) goto L1ed
            goto L21f
        L1ed:
            po r1 = r1.d
            sg r1 = r1.e
            r4.add(r1)
            java.util.ArrayList r1 = r1.k
            r1.add(r3)
            r3.b = r6
            r2.add(r9)
            r2.add(r8)
            goto L21f
        L202:
            pc r1 = r1.I
            if (r1 != 0) goto L207
            goto L21f
        L207:
            m90 r1 = r1.e
            sg r1 = r1.e
            r4.add(r1)
            java.util.ArrayList r1 = r1.k
            r1.add(r3)
            r3.b = r6
            r2.add(r9)
            r2.add(r8)
            goto L21f
        L21c:
            r3.b(r15)
        L21f:
            pc r1 = r15.b
            cc[] r2 = r1.F
            r12 = r2[r11]
            cc r13 = r12.d
            if (r13 == 0) goto L278
            r14 = r2[r7]
            cc r14 = r14.d
            if (r14 == 0) goto L278
            boolean r1 = r1.r()
            if (r1 == 0) goto L24f
            pc r1 = r15.b
            cc[] r1 = r1.F
            r1 = r1[r11]
            int r1 = r1.c()
            r9.f = r1
            pc r1 = r15.b
            cc[] r1 = r1.F
            r1 = r1[r7]
            int r1 = r1.c()
            int r1 = -r1
            r8.f = r1
            goto L26b
        L24f:
            pc r1 = r15.b
            cc[] r1 = r1.F
            r1 = r1[r11]
            jg r1 = defpackage.qb0.h(r1)
            pc r2 = r15.b
            cc[] r2 = r2.F
            r2 = r2[r7]
            jg r2 = defpackage.qb0.h(r2)
            r1.b(r15)
            r2.b(r15)
            r15.j = r5
        L26b:
            pc r1 = r15.b
            boolean r1 = r1.w
            if (r1 == 0) goto L349
            j7 r1 = r15.l
            r15.c(r0, r9, r6, r1)
            goto L349
        L278:
            r14 = 0
            if (r13 == 0) goto L2c2
            jg r1 = defpackage.qb0.h(r12)
            if (r1 == 0) goto L349
            pc r2 = r15.b
            cc[] r2 = r2.F
            r2 = r2[r11]
            int r2 = r2.c()
            defpackage.qb0.b(r9, r1, r2)
            r15.c(r8, r9, r6, r3)
            pc r1 = r15.b
            boolean r1 = r1.w
            if (r1 == 0) goto L29c
            j7 r1 = r15.l
            r15.c(r0, r9, r6, r1)
        L29c:
            int r0 = r15.d
            if (r0 != r7) goto L349
            pc r0 = r15.b
            float r1 = r0.L
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 <= 0) goto L349
            po r0 = r0.d
            int r1 = r0.d
            if (r1 != r7) goto L349
            sg r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r3)
            pc r0 = r15.b
            po r0 = r0.d
            sg r0 = r0.e
            r4.add(r0)
            r3.a = r15
            goto L349
        L2c2:
            r11 = r2[r7]
            cc r12 = r11.d
            r13 = -1
            if (r12 == 0) goto L2ec
            jg r1 = defpackage.qb0.h(r11)
            if (r1 == 0) goto L349
            pc r2 = r15.b
            cc[] r2 = r2.F
            r2 = r2[r7]
            int r2 = r2.c()
            int r2 = -r2
            defpackage.qb0.b(r8, r1, r2)
            r15.c(r9, r8, r13, r3)
            pc r1 = r15.b
            boolean r1 = r1.w
            if (r1 == 0) goto L349
            j7 r1 = r15.l
            r15.c(r0, r9, r6, r1)
            goto L349
        L2ec:
            r2 = r2[r5]
            cc r5 = r2.d
            if (r5 == 0) goto L304
            jg r1 = defpackage.qb0.h(r2)
            if (r1 == 0) goto L349
            defpackage.qb0.b(r0, r1, r10)
            j7 r1 = r15.l
            r15.c(r9, r0, r13, r1)
            r15.c(r8, r9, r6, r3)
            goto L349
        L304:
            boolean r2 = r1 instanceof defpackage.oo
            if (r2 != 0) goto L349
            pc r2 = r1.I
            if (r2 == 0) goto L349
            m90 r2 = r2.e
            jg r2 = r2.h
            int r1 = r1.n()
            defpackage.qb0.b(r9, r2, r1)
            r15.c(r8, r9, r6, r3)
            pc r1 = r15.b
            boolean r1 = r1.w
            if (r1 == 0) goto L325
            j7 r1 = r15.l
            r15.c(r0, r9, r6, r1)
        L325:
            int r0 = r15.d
            if (r0 != r7) goto L349
            pc r0 = r15.b
            float r1 = r0.L
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 <= 0) goto L349
            po r0 = r0.d
            int r1 = r0.d
            if (r1 != r7) goto L349
            sg r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r3)
            pc r0 = r15.b
            po r0 = r0.d
            sg r0 = r0.e
            r4.add(r0)
            r3.a = r15
        L349:
            int r0 = r4.size()
            if (r0 != 0) goto L351
            r3.c = r6
        L351:
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
            r1.O = r0
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
            jg r0 = r1.k
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
            int r0 = r0.k
            if (r0 != 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            return r0
        Le:
            r0 = 1
            return r0
    }

    public final void m() {
            r2 = this;
            r0 = 0
            r2.g = r0
            jg r1 = r2.h
            r1.c()
            r1.j = r0
            jg r1 = r2.i
            r1.c()
            r1.j = r0
            jg r1 = r2.k
            r1.c()
            r1.j = r0
            sg r1 = r2.e
            r1.j = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VerticalRun "
            r0.<init>(r1)
            pc r1 = r2.b
            java.lang.String r1 = r1.W
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
