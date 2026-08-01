package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qk {
    public int a;
    public defpackage.pc b;
    public int c;
    public defpackage.cc d;
    public defpackage.cc e;
    public defpackage.cc f;
    public defpackage.cc g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final /* synthetic */ defpackage.rk r;

    public qk(defpackage.rk r2, int r3, defpackage.cc r4, defpackage.cc r5, defpackage.cc r6, defpackage.cc r7, int r8) {
            r1 = this;
            r1.<init>()
            r1.r = r2
            r0 = 0
            r1.b = r0
            r0 = 0
            r1.c = r0
            r1.h = r0
            r1.i = r0
            r1.j = r0
            r1.k = r0
            r1.l = r0
            r1.m = r0
            r1.n = r0
            r1.o = r0
            r1.p = r0
            r1.q = r0
            r1.a = r3
            r1.d = r4
            r1.e = r5
            r1.f = r6
            r1.g = r7
            int r3 = r2.j0
            r1.h = r3
            int r3 = r2.f0
            r1.i = r3
            int r3 = r2.k0
            r1.j = r3
            int r2 = r2.g0
            r1.k = r2
            r1.q = r8
            return
    }

    public final void a(defpackage.pc r9) {
            r8 = this;
            int r0 = r8.a
            r1 = 8
            r2 = 3
            r3 = 1
            r4 = 0
            rk r5 = r8.r
            if (r0 != 0) goto L40
            int r0 = r8.q
            int r0 = r5.D(r9, r0)
            int[] r6 = r9.c0
            r6 = r6[r4]
            if (r6 != r2) goto L1d
            int r0 = r8.p
            int r0 = r0 + r3
            r8.p = r0
            r0 = r4
        L1d:
            int r2 = r5.C0
            int r6 = r9.V
            if (r6 != r1) goto L24
            goto L25
        L24:
            r4 = r2
        L25:
            int r1 = r8.l
            int r0 = r0 + r4
            int r0 = r0 + r1
            r8.l = r0
            int r0 = r8.q
            int r0 = r5.C(r9, r0)
            pc r1 = r8.b
            if (r1 == 0) goto L39
            int r1 = r8.c
            if (r1 >= r0) goto L74
        L39:
            r8.b = r9
            r8.c = r0
            r8.m = r0
            goto L74
        L40:
            int r0 = r8.q
            int r0 = r5.D(r9, r0)
            int r6 = r8.q
            int r6 = r5.C(r9, r6)
            int[] r7 = r9.c0
            r7 = r7[r3]
            if (r7 != r2) goto L58
            int r2 = r8.p
            int r2 = r2 + r3
            r8.p = r2
            r6 = r4
        L58:
            int r2 = r5.D0
            int r5 = r9.V
            if (r5 != r1) goto L5f
            goto L60
        L5f:
            r4 = r2
        L60:
            int r1 = r8.m
            int r6 = r6 + r4
            int r6 = r6 + r1
            r8.m = r6
            pc r1 = r8.b
            if (r1 == 0) goto L6e
            int r1 = r8.c
            if (r1 >= r0) goto L74
        L6e:
            r8.b = r9
            r8.c = r0
            r8.l = r0
        L74:
            int r9 = r8.o
            int r9 = r9 + r3
            r8.o = r9
            return
    }

    public final void b(int r19, boolean r20, boolean r21) {
            r18 = this;
            r0 = r18
            int r1 = r0.o
            r2 = 0
            r3 = r2
        L6:
            rk r4 = r0.r
            if (r3 >= r1) goto L1e
            int r5 = r0.n
            int r5 = r5 + r3
            int r6 = r4.O0
            if (r5 < r6) goto L12
            goto L1e
        L12:
            pc[] r4 = r4.N0
            r4 = r4[r5]
            if (r4 == 0) goto L1b
            r4.t()
        L1b:
            int r3 = r3 + 1
            goto L6
        L1e:
            if (r1 == 0) goto L2ab
            pc r3 = r0.b
            if (r3 != 0) goto L26
            goto L2ab
        L26:
            if (r21 == 0) goto L2c
            if (r19 != 0) goto L2c
            r5 = 1
            goto L2d
        L2c:
            r5 = r2
        L2d:
            r6 = -1
            r7 = r2
            r8 = r6
            r9 = r8
        L31:
            if (r7 >= r1) goto L51
            if (r20 == 0) goto L39
            int r10 = r1 + (-1)
            int r10 = r10 - r7
            goto L3a
        L39:
            r10 = r7
        L3a:
            int r11 = r0.n
            int r11 = r11 + r10
            int r10 = r4.O0
            if (r11 < r10) goto L42
            goto L51
        L42:
            pc[] r10 = r4.N0
            r10 = r10[r11]
            int r10 = r10.V
            if (r10 != 0) goto L4e
            if (r8 != r6) goto L4d
            r8 = r7
        L4d:
            r9 = r7
        L4e:
            int r7 = r7 + 1
            goto L31
        L51:
            int r7 = r0.a
            if (r7 != 0) goto L185
            pc r7 = r0.b
            int r11 = r4.r0
            r7.Y = r11
            cc r11 = r7.A
            cc r12 = r7.y
            int r13 = r0.i
            if (r19 <= 0) goto L66
            int r14 = r4.D0
            int r13 = r13 + r14
        L66:
            cc r14 = r0.e
            r12.a(r14, r13)
            if (r21 == 0) goto L74
            cc r13 = r0.g
            int r14 = r0.k
            r11.a(r13, r14)
        L74:
            if (r19 <= 0) goto L7f
            cc r13 = r0.e
            pc r13 = r13.b
            cc r13 = r13.A
            r13.a(r12, r2)
        L7f:
            int r13 = r4.F0
            r14 = 3
            if (r13 != r14) goto La6
            boolean r13 = r7.w
            if (r13 != 0) goto La6
            r13 = r2
        L89:
            if (r13 >= r1) goto La6
            if (r20 == 0) goto L91
            int r15 = r1 + (-1)
            int r15 = r15 - r13
            goto L92
        L91:
            r15 = r13
        L92:
            int r10 = r0.n
            int r10 = r10 + r15
            int r15 = r4.O0
            if (r10 < r15) goto L9a
            goto La6
        L9a:
            pc[] r15 = r4.N0
            r10 = r15[r10]
            boolean r15 = r10.w
            if (r15 == 0) goto La3
            goto La7
        La3:
            int r13 = r13 + 1
            goto L89
        La6:
            r10 = r7
        La7:
            r15 = r2
            r13 = 0
        La9:
            if (r15 >= r1) goto L2ab
            if (r20 == 0) goto Lb4
            int r16 = r1 + (-1)
            int r16 = r16 - r15
        Lb1:
            r17 = 1
            goto Lb7
        Lb4:
            r16 = r15
            goto Lb1
        Lb7:
            int r3 = r0.n
            int r3 = r3 + r16
            int r14 = r4.O0
            if (r3 < r14) goto Lc1
            goto L2ab
        Lc1:
            pc[] r14 = r4.N0
            r3 = r14[r3]
            if (r15 != 0) goto Ld0
            cc r14 = r3.x
            cc r2 = r0.d
            int r6 = r0.h
            r3.e(r14, r2, r6)
        Ld0:
            if (r16 != 0) goto Lf7
            int r2 = r4.q0
            float r6 = r4.w0
            int r14 = r0.n
            if (r14 != 0) goto Le5
            int r14 = r4.s0
            r16 = r2
            r2 = -1
            if (r14 == r2) goto Le8
            float r6 = r4.y0
        Le3:
            r2 = r14
            goto Lf3
        Le5:
            r16 = r2
            r2 = -1
        Le8:
            if (r21 == 0) goto Lf1
            int r14 = r4.u0
            if (r14 == r2) goto Lf1
            float r6 = r4.A0
            goto Le3
        Lf1:
            r2 = r16
        Lf3:
            r3.X = r2
            r3.S = r6
        Lf7:
            int r2 = r1 + (-1)
            if (r15 != r2) goto L104
            cc r2 = r3.z
            cc r6 = r0.f
            int r14 = r0.j
            r3.e(r2, r6, r14)
        L104:
            if (r13 == 0) goto L12d
            cc r2 = r13.z
            cc r6 = r3.x
            int r13 = r4.C0
            r6.a(r2, r13)
            if (r15 != r8) goto L11b
            int r13 = r0.h
            boolean r14 = r6.f()
            if (r14 == 0) goto L11b
            r6.f = r13
        L11b:
            r13 = 0
            r2.a(r6, r13)
            int r6 = r9 + 1
            if (r15 != r6) goto L12d
            int r6 = r0.j
            boolean r13 = r2.f()
            if (r13 == 0) goto L12d
            r2.f = r6
        L12d:
            if (r3 == r7) goto L17c
            int r2 = r4.F0
            r6 = 3
            if (r2 != r6) goto L147
            boolean r13 = r10.w
            if (r13 == 0) goto L147
            if (r3 == r10) goto L147
            boolean r13 = r3.w
            if (r13 == 0) goto L147
            cc r2 = r3.B
            cc r13 = r10.B
            r14 = 0
            r2.a(r13, r14)
            goto L17d
        L147:
            if (r2 == 0) goto L175
            r13 = r17
            if (r2 == r13) goto L16e
            if (r5 == 0) goto L162
            cc r2 = r3.y
            cc r13 = r0.e
            int r14 = r0.i
            r2.a(r13, r14)
            cc r2 = r3.A
            cc r13 = r0.g
            int r14 = r0.k
            r2.a(r13, r14)
            goto L17d
        L162:
            cc r2 = r3.y
            r13 = 0
            r2.a(r12, r13)
            cc r2 = r3.A
            r2.a(r11, r13)
            goto L17d
        L16e:
            r13 = 0
            cc r2 = r3.A
            r2.a(r11, r13)
            goto L17d
        L175:
            r13 = 0
            cc r2 = r3.y
            r2.a(r12, r13)
            goto L17d
        L17c:
            r6 = 3
        L17d:
            int r15 = r15 + 1
            r13 = r3
            r14 = r6
            r2 = 0
            r6 = -1
            goto La9
        L185:
            pc r2 = r0.b
            int r3 = r4.q0
            r2.X = r3
            cc r3 = r2.x
            cc r6 = r2.z
            int r7 = r0.h
            if (r19 <= 0) goto L196
            int r10 = r4.C0
            int r7 = r7 + r10
        L196:
            if (r20 == 0) goto L1b3
            cc r10 = r0.f
            r6.a(r10, r7)
            if (r21 == 0) goto L1a6
            cc r7 = r0.d
            int r10 = r0.j
            r3.a(r7, r10)
        L1a6:
            if (r19 <= 0) goto L1cd
            cc r7 = r0.f
            pc r7 = r7.b
            cc r7 = r7.x
            r13 = 0
            r7.a(r6, r13)
            goto L1cd
        L1b3:
            cc r10 = r0.d
            r3.a(r10, r7)
            if (r21 == 0) goto L1c1
            cc r7 = r0.f
            int r10 = r0.j
            r6.a(r7, r10)
        L1c1:
            if (r19 <= 0) goto L1cd
            cc r7 = r0.d
            pc r7 = r7.b
            cc r7 = r7.z
            r13 = 0
            r7.a(r3, r13)
        L1cd:
            r10 = 0
            r13 = 0
        L1cf:
            if (r13 >= r1) goto L2ab
            int r7 = r0.n
            int r7 = r7 + r13
            int r11 = r4.O0
            if (r7 < r11) goto L1da
            goto L2ab
        L1da:
            pc[] r11 = r4.N0
            r7 = r11[r7]
            if (r13 != 0) goto L209
            cc r11 = r7.y
            cc r12 = r0.e
            int r14 = r0.i
            r7.e(r11, r12, r14)
            int r11 = r4.r0
            float r12 = r4.x0
            int r14 = r0.n
            if (r14 != 0) goto L1fa
            int r14 = r4.t0
            r15 = -1
            if (r14 == r15) goto L1fb
            float r12 = r4.z0
        L1f8:
            r11 = r14
            goto L204
        L1fa:
            r15 = -1
        L1fb:
            if (r21 == 0) goto L204
            int r14 = r4.v0
            if (r14 == r15) goto L204
            float r12 = r4.B0
            goto L1f8
        L204:
            r7.Y = r11
            r7.T = r12
            goto L20a
        L209:
            r15 = -1
        L20a:
            int r11 = r1 + (-1)
            if (r13 != r11) goto L217
            cc r11 = r7.A
            cc r12 = r0.g
            int r14 = r0.k
            r7.e(r11, r12, r14)
        L217:
            if (r10 == 0) goto L242
            cc r10 = r10.A
            cc r11 = r7.y
            int r12 = r4.D0
            r11.a(r10, r12)
            if (r13 != r8) goto L22e
            int r12 = r0.i
            boolean r14 = r11.f()
            if (r14 == 0) goto L22e
            r11.f = r12
        L22e:
            r14 = 0
            r10.a(r11, r14)
            r17 = 1
            int r11 = r9 + 1
            if (r13 != r11) goto L242
            int r11 = r0.k
            boolean r12 = r10.f()
            if (r12 == 0) goto L242
            r10.f = r11
        L242:
            if (r7 == r2) goto L26a
            r10 = 2
            if (r20 == 0) goto L26d
            int r11 = r4.E0
            if (r11 == 0) goto L264
            r12 = 1
            if (r11 == r12) goto L25d
            if (r11 == r10) goto L251
            goto L26a
        L251:
            cc r10 = r7.x
            r14 = 0
            r10.a(r3, r14)
            cc r10 = r7.z
            r10.a(r6, r14)
            goto L26a
        L25d:
            r14 = 0
            cc r10 = r7.x
            r10.a(r3, r14)
            goto L26a
        L264:
            r14 = 0
            cc r10 = r7.z
            r10.a(r6, r14)
        L26a:
            r12 = 1
        L26b:
            r14 = 0
            goto L2a6
        L26d:
            int r11 = r4.E0
            if (r11 == 0) goto L29f
            r12 = 1
            if (r11 == r12) goto L298
            if (r11 == r10) goto L277
            goto L26b
        L277:
            if (r5 == 0) goto L28c
            cc r10 = r7.x
            cc r11 = r0.d
            int r14 = r0.h
            r10.a(r11, r14)
            cc r10 = r7.z
            cc r11 = r0.f
            int r14 = r0.j
            r10.a(r11, r14)
            goto L26b
        L28c:
            cc r10 = r7.x
            r14 = 0
            r10.a(r3, r14)
            cc r10 = r7.z
            r10.a(r6, r14)
            goto L2a6
        L298:
            r14 = 0
            cc r10 = r7.z
            r10.a(r6, r14)
            goto L2a6
        L29f:
            r12 = 1
            r14 = 0
            cc r10 = r7.x
            r10.a(r3, r14)
        L2a6:
            int r13 = r13 + 1
            r10 = r7
            goto L1cf
        L2ab:
            return
    }

    public final int c() {
            r2 = this;
            int r0 = r2.a
            r1 = 1
            if (r0 != r1) goto Ld
            int r0 = r2.m
            rk r1 = r2.r
            int r1 = r1.D0
            int r0 = r0 - r1
            return r0
        Ld:
            int r0 = r2.m
            return r0
    }

    public final int d() {
            r2 = this;
            int r0 = r2.a
            if (r0 != 0) goto Lc
            int r0 = r2.l
            rk r1 = r2.r
            int r1 = r1.C0
            int r0 = r0 - r1
            return r0
        Lc:
            int r0 = r2.l
            return r0
    }

    public final void e(int r12) {
            r11 = this;
            int r0 = r11.p
            if (r0 != 0) goto L6
            goto Lca
        L6:
            int r1 = r11.o
            int r4 = r12 / r0
            r12 = 0
            r0 = r12
        Lc:
            rk r2 = r11.r
            if (r0 >= r1) goto L5a
            int r3 = r11.n
            int r3 = r3 + r0
            int r5 = r2.O0
            if (r3 < r5) goto L18
            goto L5a
        L18:
            pc[] r5 = r2.N0
            r7 = r5[r3]
            int r3 = r11.a
            r5 = 1
            r6 = 3
            r8 = 1
            if (r3 != 0) goto L3c
            if (r7 == 0) goto L57
            int[] r3 = r7.c0
            r9 = r3[r12]
            if (r9 != r6) goto L57
            int r6 = r7.j
            if (r6 != 0) goto L57
            r3 = r3[r8]
            int r6 = r7.i()
            r10 = r5
            r5 = r3
            r3 = r10
            r2.E(r3, r4, r5, r6, r7)
            goto L57
        L3c:
            r3 = r5
            if (r7 == 0) goto L57
            int[] r5 = r7.c0
            r8 = r5[r8]
            if (r8 != r6) goto L57
            int r6 = r7.k
            if (r6 != 0) goto L57
            r5 = r5[r12]
            r6 = r4
            int r4 = r7.l()
            r10 = r5
            r5 = r3
            r3 = r10
            r2.E(r3, r4, r5, r6, r7)
            r4 = r6
        L57:
            int r0 = r0 + 1
            goto Lc
        L5a:
            r11.l = r12
            r11.m = r12
            r0 = 0
            r11.b = r0
            r11.c = r12
            int r0 = r11.o
            r1 = r12
        L66:
            if (r1 >= r0) goto Lca
            int r3 = r11.n
            int r3 = r3 + r1
            int r4 = r2.O0
            if (r3 < r4) goto L70
            goto Lca
        L70:
            pc[] r4 = r2.N0
            r3 = r4[r3]
            int r4 = r11.a
            r5 = 8
            if (r4 != 0) goto La0
            int r4 = r3.l()
            int r6 = r2.C0
            int r7 = r3.V
            if (r7 != r5) goto L85
            r6 = r12
        L85:
            int r5 = r11.l
            int r4 = r4 + r6
            int r4 = r4 + r5
            r11.l = r4
            int r4 = r11.q
            int r4 = r2.C(r3, r4)
            pc r5 = r11.b
            if (r5 == 0) goto L99
            int r5 = r11.c
            if (r5 >= r4) goto Lc7
        L99:
            r11.b = r3
            r11.c = r4
            r11.m = r4
            goto Lc7
        La0:
            int r4 = r11.q
            int r4 = r2.D(r3, r4)
            int r6 = r11.q
            int r6 = r2.C(r3, r6)
            int r7 = r2.D0
            int r8 = r3.V
            if (r8 != r5) goto Lb3
            r7 = r12
        Lb3:
            int r5 = r11.m
            int r6 = r6 + r7
            int r6 = r6 + r5
            r11.m = r6
            pc r5 = r11.b
            if (r5 == 0) goto Lc1
            int r5 = r11.c
            if (r5 >= r4) goto Lc7
        Lc1:
            r11.b = r3
            r11.c = r4
            r11.l = r4
        Lc7:
            int r1 = r1 + 1
            goto L66
        Lca:
            return
    }

    public final void f(int r1, defpackage.cc r2, defpackage.cc r3, defpackage.cc r4, defpackage.cc r5, int r6, int r7, int r8, int r9, int r10) {
            r0 = this;
            r0.a = r1
            r0.d = r2
            r0.e = r3
            r0.f = r4
            r0.g = r5
            r0.h = r6
            r0.i = r7
            r0.j = r8
            r0.k = r9
            r0.q = r10
            return
    }
}
