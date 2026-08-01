package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ar {
    public static int o = 1000;
    public static boolean p = true;
    public int a;
    public final defpackage.zx b;
    public int c;
    public int d;
    public defpackage.p6[] e;
    public boolean f;
    public boolean[] g;
    public int h;
    public int i;
    public int j;
    public final defpackage.a8 k;
    public defpackage.a40[] l;
    public int m;
    public defpackage.p6 n;

    public ar() {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.a = r0
            r1 = 32
            r5.c = r1
            r5.d = r1
            r2 = 0
            r5.e = r2
            r5.f = r0
            boolean[] r2 = new boolean[r1]
            r5.g = r2
            r2 = 1
            r5.h = r2
            r5.i = r0
            r5.j = r1
            int r2 = defpackage.ar.o
            a40[] r2 = new defpackage.a40[r2]
            r5.l = r2
            r5.m = r0
            p6[] r2 = new defpackage.p6[r1]
            r5.e = r2
            r5.q()
            a8 r2 = new a8
            r2.<init>()
            sx r3 = new sx
            r3.<init>()
            r2.a = r3
            sx r3 = new sx
            r3.<init>()
            r2.b = r3
            sx r3 = new sx
            r3.<init>()
            r2.c = r3
            a40[] r1 = new defpackage.a40[r1]
            r2.d = r1
            r5.k = r2
            zx r1 = new zx
            r1.<init>(r2)
            r3 = 128(0x80, float:1.8E-43)
            a40[] r4 = new defpackage.a40[r3]
            r1.f = r4
            a40[] r3 = new defpackage.a40[r3]
            r1.g = r3
            r1.h = r0
            yx r0 = new yx
            r0.<init>(r1)
            r1.i = r0
            r5.b = r1
            boolean r0 = defpackage.ar.p
            if (r0 == 0) goto L71
            zq r0 = new zq
            r0.<init>(r2)
            r5.n = r0
            return
        L71:
            p6 r0 = new p6
            r0.<init>(r2)
            r5.n = r0
            return
    }

    public static int m(java.lang.Object r1) {
            cc r1 = (defpackage.cc) r1
            a40 r1 = r1.g
            if (r1 == 0) goto Ld
            float r1 = r1.e
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final defpackage.a40 a(int r4) {
            r3 = this;
            a8 r0 = r3.k
            java.lang.Object r0 = r0.c
            sx r0 = (defpackage.sx) r0
            java.lang.Object r0 = r0.a()
            a40 r0 = (defpackage.a40) r0
            if (r0 != 0) goto L16
            a40 r0 = new a40
            r0.<init>(r4)
            r0.l = r4
            goto L1b
        L16:
            r0.c()
            r0.l = r4
        L1b:
            int r4 = r3.m
            int r1 = defpackage.ar.o
            if (r4 < r1) goto L2f
            int r1 = r1 * 2
            defpackage.ar.o = r1
            a40[] r4 = r3.l
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            a40[] r4 = (defpackage.a40[]) r4
            r3.l = r4
        L2f:
            a40[] r4 = r3.l
            int r1 = r3.m
            int r2 = r1 + 1
            r3.m = r2
            r4[r1] = r0
            return r0
    }

    public final void b(defpackage.a40 r7, defpackage.a40 r8, int r9, float r10, defpackage.a40 r11, defpackage.a40 r12, int r13, int r14) {
            r6 = this;
            p6 r0 = r6.k()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r8 != r11) goto L1b
            o6 r9 = r0.d
            r9.i(r7, r1)
            o6 r7 = r0.d
            r7.i(r12, r1)
            o6 r7 = r0.d
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            r7.i(r8, r9)
            goto L8f
        L1b:
            r2 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 != 0) goto L41
            o6 r10 = r0.d
            r10.i(r7, r1)
            o6 r7 = r0.d
            r7.i(r8, r3)
            o6 r7 = r0.d
            r7.i(r11, r3)
            o6 r7 = r0.d
            r7.i(r12, r1)
            if (r9 > 0) goto L3b
            if (r13 <= 0) goto L8f
        L3b:
            int r7 = -r9
            int r7 = r7 + r13
            float r7 = (float) r7
            r0.b = r7
            goto L8f
        L41:
            r2 = 0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 > 0) goto L54
            o6 r10 = r0.d
            r10.i(r7, r3)
            o6 r7 = r0.d
            r7.i(r8, r1)
            float r7 = (float) r9
            r0.b = r7
            goto L8f
        L54:
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 < 0) goto L67
            o6 r7 = r0.d
            r7.i(r12, r3)
            o6 r7 = r0.d
            r7.i(r11, r1)
            int r7 = -r13
            float r7 = (float) r7
            r0.b = r7
            goto L8f
        L67:
            o6 r2 = r0.d
            float r4 = r1 - r10
            float r5 = r4 * r1
            r2.i(r7, r5)
            o6 r7 = r0.d
            float r2 = r4 * r3
            r7.i(r8, r2)
            o6 r7 = r0.d
            float r3 = r3 * r10
            r7.i(r11, r3)
            o6 r7 = r0.d
            float r1 = r1 * r10
            r7.i(r12, r1)
            if (r9 > 0) goto L87
            if (r13 <= 0) goto L8f
        L87:
            int r7 = -r9
            float r7 = (float) r7
            float r7 = r7 * r4
            float r8 = (float) r13
            float r8 = r8 * r10
            float r8 = r8 + r7
            r0.b = r8
        L8f:
            r7 = 8
            if (r14 == r7) goto L96
            r0.a(r6, r14)
        L96:
            r6.c(r0)
            return
    }

    public final void c(defpackage.p6 r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.i
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.j
            if (r2 >= r4) goto L13
            int r2 = r0.h
            int r2 = r2 + r3
            int r4 = r0.d
            if (r2 < r4) goto L16
        L13:
            r0.n()
        L16:
            boolean r2 = r1.e
            if (r2 != 0) goto L198
            java.util.ArrayList r2 = r1.c
            p6[] r5 = r0.e
            int r5 = r5.length
            r6 = -1
            if (r5 != 0) goto L23
            goto L70
        L23:
            r5 = 0
        L24:
            if (r5 != 0) goto L70
            o6 r7 = r1.d
            int r7 = r7.k()
            r8 = 0
        L2d:
            if (r8 >= r7) goto L43
            o6 r9 = r1.d
            a40 r9 = r9.e(r8)
            int r10 = r9.c
            if (r10 != r6) goto L3d
            boolean r10 = r9.f
            if (r10 == 0) goto L40
        L3d:
            r2.add(r9)
        L40:
            int r8 = r8 + 1
            goto L2d
        L43:
            int r7 = r2.size()
            if (r7 <= 0) goto L6e
            int r7 = r2.size()
            r8 = 0
        L4e:
            if (r8 >= r7) goto L6a
            java.lang.Object r9 = r2.get(r8)
            int r8 = r8 + 1
            a40 r9 = (defpackage.a40) r9
            boolean r10 = r9.f
            if (r10 == 0) goto L60
            r1.g(r9, r3)
            goto L4e
        L60:
            p6[] r10 = r0.e
            int r9 = r9.c
            r9 = r10[r9]
            r1.h(r9, r3)
            goto L4e
        L6a:
            r2.clear()
            goto L24
        L6e:
            r5 = r3
            goto L24
        L70:
            a40 r2 = r1.a
            r5 = 0
            if (r2 != 0) goto L85
            float r2 = r1.b
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L85
            o6 r2 = r1.d
            int r2 = r2.k()
            if (r2 != 0) goto L85
            goto L19e
        L85:
            float r2 = r1.b
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L95
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.b = r2
            o6 r2 = r1.d
            r2.j()
        L95:
            o6 r2 = r1.d
            int r2 = r2.k()
            r7 = 0
            r11 = r5
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        La3:
            if (r8 >= r2) goto Lfa
            o6 r15 = r1.d
            float r15 = r15.a(r8)
            o6 r4 = r1.d
            a40 r4 = r4.e(r8)
            r16 = r5
            int r5 = r4.l
            if (r5 != r3) goto Ld3
            if (r9 != 0) goto Lc2
            int r5 = r4.k
            if (r5 > r3) goto Lbe
            goto Ld1
        Lbe:
            r12 = 0
        Lbf:
            r9 = r4
            r11 = r15
            goto Lf5
        Lc2:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto Lcb
            int r5 = r4.k
            if (r5 > r3) goto Lbe
            goto Ld1
        Lcb:
            if (r12 != 0) goto Lf5
            int r5 = r4.k
            if (r5 > r3) goto Lf5
        Ld1:
            r12 = r3
            goto Lbf
        Ld3:
            if (r9 != 0) goto Lf5
            int r5 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r5 >= 0) goto Lf5
            if (r10 != 0) goto Le4
            int r5 = r4.k
            if (r5 > r3) goto Le0
            goto Lf3
        Le0:
            r14 = 0
        Le1:
            r10 = r4
            r13 = r15
            goto Lf5
        Le4:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto Led
            int r5 = r4.k
            if (r5 > r3) goto Le0
            goto Lf3
        Led:
            if (r14 != 0) goto Lf5
            int r5 = r4.k
            if (r5 > r3) goto Lf5
        Lf3:
            r14 = r3
            goto Le1
        Lf5:
            int r8 = r8 + 1
            r5 = r16
            goto La3
        Lfa:
            r16 = r5
            if (r9 == 0) goto Lff
            goto L100
        Lff:
            r9 = r10
        L100:
            if (r9 != 0) goto L104
            r2 = r3
            goto L108
        L104:
            r1.f(r9)
            r2 = 0
        L108:
            o6 r4 = r1.d
            int r4 = r4.k()
            if (r4 != 0) goto L112
            r1.e = r3
        L112:
            if (r2 == 0) goto L188
            int r2 = r0.h
            int r2 = r2 + r3
            int r4 = r0.d
            if (r2 < r4) goto L11e
            r0.n()
        L11e:
            r2 = 3
            a40 r2 = r0.a(r2)
            int r4 = r0.a
            int r4 = r4 + r3
            r0.a = r4
            int r5 = r0.h
            int r5 = r5 + r3
            r0.h = r5
            r2.b = r4
            a8 r5 = r0.k
            java.lang.Object r5 = r5.d
            a40[] r5 = (defpackage.a40[]) r5
            r5[r4] = r2
            r1.a = r2
            r17.h(r18)
            p6 r4 = r0.n
            r4.a = r7
            o6 r5 = r4.d
            r5.clear()
            r5 = 0
        L146:
            o6 r8 = r1.d
            int r8 = r8.k()
            if (r5 >= r8) goto L162
            o6 r8 = r1.d
            a40 r8 = r8.e(r5)
            o6 r9 = r1.d
            float r9 = r9.a(r5)
            o6 r10 = r4.d
            r10.f(r8, r9, r3)
            int r5 = r5 + 1
            goto L146
        L162:
            p6 r4 = r0.n
            r0.p(r4)
            int r4 = r2.c
            if (r4 != r6) goto L186
            a40 r4 = r1.a
            if (r4 != r2) goto L178
            a40 r2 = r1.e(r7, r2)
            if (r2 == 0) goto L178
            r1.f(r2)
        L178:
            boolean r2 = r1.e
            if (r2 != 0) goto L181
            a40 r2 = r1.a
            r2.d(r1)
        L181:
            int r2 = r0.i
            int r2 = r2 - r3
            r0.i = r2
        L186:
            r4 = r3
            goto L189
        L188:
            r4 = 0
        L189:
            a40 r2 = r1.a
            if (r2 == 0) goto L19e
            int r2 = r2.l
            if (r2 == r3) goto L199
            float r2 = r1.b
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 < 0) goto L19e
            goto L199
        L198:
            r4 = 0
        L199:
            if (r4 != 0) goto L19e
            r17.h(r18)
        L19e:
            return
    }

    public final void d(defpackage.a40 r5, int r6) {
            r4 = this;
            int r0 = r5.c
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L1e
            float r6 = (float) r6
            r5.e = r6
            r5.f = r1
            int r6 = r5.j
            r0 = 0
            r1 = r0
        Lf:
            if (r1 >= r6) goto L1b
            p6[] r2 = r5.i
            r2 = r2[r1]
            r2.g(r5, r0)
            int r1 = r1 + 1
            goto Lf
        L1b:
            r5.j = r0
            return
        L1e:
            if (r0 == r2) goto L5a
            p6[] r3 = r4.e
            r0 = r3[r0]
            boolean r3 = r0.e
            if (r3 == 0) goto L2c
            float r5 = (float) r6
            r0.b = r5
            return
        L2c:
            o6 r3 = r0.d
            int r3 = r3.k()
            if (r3 != 0) goto L3a
            r0.e = r1
            float r5 = (float) r6
            r0.b = r5
            return
        L3a:
            p6 r0 = r4.k()
            if (r6 >= 0) goto L4c
            int r6 = r6 * r2
            float r6 = (float) r6
            r0.b = r6
            o6 r6 = r0.d
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.i(r5, r1)
            goto L56
        L4c:
            float r6 = (float) r6
            r0.b = r6
            o6 r6 = r0.d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.i(r5, r1)
        L56:
            r4.c(r0)
            return
        L5a:
            p6 r0 = r4.k()
            r0.a = r5
            float r6 = (float) r6
            r5.e = r6
            r0.b = r6
            r0.e = r1
            r4.c(r0)
            return
    }

    public final void e(defpackage.a40 r6, defpackage.a40 r7, int r8, int r9) {
            r5 = this;
            r0 = 0
            r1 = 1
            r2 = 8
            if (r9 != r2) goto L29
            boolean r3 = r7.f
            if (r3 == 0) goto L29
            int r3 = r6.c
            r4 = -1
            if (r3 != r4) goto L29
            float r7 = r7.e
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.e = r7
            r6.f = r1
            int r7 = r6.j
            r8 = r0
        L1a:
            if (r8 >= r7) goto L26
            p6[] r9 = r6.i
            r9 = r9[r8]
            r9.g(r6, r0)
            int r8 = r8 + 1
            goto L1a
        L26:
            r6.j = r0
            return
        L29:
            p6 r3 = r5.k()
            if (r8 == 0) goto L37
            if (r8 >= 0) goto L34
            int r8 = r8 * (-1)
            r0 = r1
        L34:
            float r8 = (float) r8
            r3.b = r8
        L37:
            r8 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L48
            o6 r0 = r3.d
            r0.i(r6, r1)
            o6 r6 = r3.d
            r6.i(r7, r8)
            goto L52
        L48:
            o6 r0 = r3.d
            r0.i(r6, r8)
            o6 r6 = r3.d
            r6.i(r7, r1)
        L52:
            if (r9 == r2) goto L57
            r3.a(r5, r9)
        L57:
            r5.c(r3)
            return
    }

    public final void f(defpackage.a40 r4, defpackage.a40 r5, int r6, int r7) {
            r3 = this;
            p6 r0 = r3.k()
            a40 r1 = r3.l()
            r2 = 0
            r1.d = r2
            r0.b(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L26
            o6 r4 = r0.d
            float r4 = r4.b(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            a40 r5 = r3.i(r7)
            o6 r6 = r0.d
            float r4 = (float) r4
            r6.i(r5, r4)
        L26:
            r3.c(r0)
            return
    }

    public final void g(defpackage.a40 r4, defpackage.a40 r5, int r6, int r7) {
            r3 = this;
            p6 r0 = r3.k()
            a40 r1 = r3.l()
            r2 = 0
            r1.d = r2
            r0.c(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L26
            o6 r4 = r0.d
            float r4 = r4.b(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            a40 r5 = r3.i(r7)
            o6 r6 = r0.d
            float r4 = (float) r4
            r6.i(r5, r4)
        L26:
            r3.c(r0)
            return
    }

    public final void h(defpackage.p6 r4) {
            r3 = this;
            boolean r0 = defpackage.ar.p
            a8 r1 = r3.k
            if (r0 == 0) goto L16
            p6[] r0 = r3.e
            int r2 = r3.i
            r0 = r0[r2]
            if (r0 == 0) goto L25
            java.lang.Object r1 = r1.a
            sx r1 = (defpackage.sx) r1
            r1.b(r0)
            goto L25
        L16:
            p6[] r0 = r3.e
            int r2 = r3.i
            r0 = r0[r2]
            if (r0 == 0) goto L25
            java.lang.Object r1 = r1.b
            sx r1 = (defpackage.sx) r1
            r1.b(r0)
        L25:
            p6[] r0 = r3.e
            int r1 = r3.i
            r0[r1] = r4
            a40 r0 = r4.a
            r0.c = r1
            int r1 = r1 + 1
            r3.i = r1
            r0.d(r4)
            return
    }

    public final defpackage.a40 i(int r5) {
            r4 = this;
            int r0 = r4.h
            int r0 = r0 + 1
            int r1 = r4.d
            if (r0 < r1) goto Lb
            r4.n()
        Lb:
            r0 = 4
            a40 r0 = r4.a(r0)
            float[] r1 = r0.h
            int r2 = r4.a
            int r2 = r2 + 1
            r4.a = r2
            int r3 = r4.h
            int r3 = r3 + 1
            r4.h = r3
            r0.b = r2
            r0.d = r5
            a8 r5 = r4.k
            java.lang.Object r5 = r5.d
            a40[] r5 = (defpackage.a40[]) r5
            r5[r2] = r0
            zx r5 = r4.b
            yx r2 = r5.i
            r2.a = r0
            r2 = 0
            java.util.Arrays.fill(r1, r2)
            int r2 = r0.d
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r5.i(r0)
            return r0
    }

    public final defpackage.a40 j(java.lang.Object r6) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L4c
        L3:
            int r0 = r5.h
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.d
            if (r0 < r2) goto Le
            r5.n()
        Le:
            boolean r0 = r6 instanceof defpackage.cc
            if (r0 == 0) goto L4c
            cc r6 = (defpackage.cc) r6
            a40 r0 = r6.g
            if (r0 != 0) goto L1d
            r6.i()
            a40 r0 = r6.g
        L1d:
            int r6 = r0.b
            r2 = -1
            a8 r3 = r5.k
            if (r6 == r2) goto L32
            int r4 = r5.a
            if (r6 > r4) goto L32
            java.lang.Object r4 = r3.d
            a40[] r4 = (defpackage.a40[]) r4
            r4 = r4[r6]
            if (r4 != 0) goto L31
            goto L32
        L31:
            return r0
        L32:
            if (r6 == r2) goto L37
            r0.c()
        L37:
            int r6 = r5.a
            int r6 = r6 + r1
            r5.a = r6
            int r2 = r5.h
            int r2 = r2 + r1
            r5.h = r2
            r0.b = r6
            r0.l = r1
            java.lang.Object r1 = r3.d
            a40[] r1 = (defpackage.a40[]) r1
            r1[r6] = r0
            return r0
        L4c:
            r6 = 0
            return r6
    }

    public final defpackage.p6 k() {
            r5 = this;
            boolean r0 = defpackage.ar.p
            r1 = 0
            r2 = 0
            r3 = 0
            a8 r4 = r5.k
            if (r0 == 0) goto L27
            java.lang.Object r0 = r4.a
            sx r0 = (defpackage.sx) r0
            java.lang.Object r0 = r0.a()
            p6 r0 = (defpackage.p6) r0
            if (r0 != 0) goto L1b
            zq r0 = new zq
            r0.<init>(r4)
            goto L44
        L1b:
            r0.a = r3
            o6 r3 = r0.d
            r3.clear()
            r0.b = r2
            r0.e = r1
            goto L44
        L27:
            java.lang.Object r0 = r4.b
            sx r0 = (defpackage.sx) r0
            java.lang.Object r0 = r0.a()
            p6 r0 = (defpackage.p6) r0
            if (r0 != 0) goto L39
            p6 r0 = new p6
            r0.<init>(r4)
            goto L44
        L39:
            r0.a = r3
            o6 r3 = r0.d
            r3.clear()
            r0.b = r2
            r0.e = r1
        L44:
            return r0
    }

    public final defpackage.a40 l() {
            r3 = this;
            int r0 = r3.h
            int r0 = r0 + 1
            int r1 = r3.d
            if (r0 < r1) goto Lb
            r3.n()
        Lb:
            r0 = 3
            a40 r0 = r3.a(r0)
            int r1 = r3.a
            int r1 = r1 + 1
            r3.a = r1
            int r2 = r3.h
            int r2 = r2 + 1
            r3.h = r2
            r0.b = r1
            a8 r2 = r3.k
            java.lang.Object r2 = r2.d
            a40[] r2 = (defpackage.a40[]) r2
            r2[r1] = r0
            return r0
    }

    public final void n() {
            r3 = this;
            int r0 = r3.c
            int r0 = r0 * 2
            r3.c = r0
            p6[] r1 = r3.e
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            p6[] r0 = (defpackage.p6[]) r0
            r3.e = r0
            a8 r0 = r3.k
            java.lang.Object r1 = r0.d
            a40[] r1 = (defpackage.a40[]) r1
            int r2 = r3.c
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            a40[] r1 = (defpackage.a40[]) r1
            r0.d = r1
            int r0 = r3.c
            boolean[] r1 = new boolean[r0]
            r3.g = r1
            r3.d = r0
            r3.j = r0
            return
    }

    public final void o(defpackage.zx r19) {
            r18 = this;
            r0 = r18
            r2 = 0
        L3:
            int r3 = r0.i
            if (r2 >= r3) goto La8
            p6[] r3 = r0.e
            r3 = r3[r2]
            a40 r4 = r3.a
            int r4 = r4.l
            r5 = 1
            if (r4 != r5) goto L14
            goto La4
        L14:
            float r3 = r3.b
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto La4
            r2 = 0
            r3 = 0
        L1d:
            if (r2 != 0) goto La8
            int r3 = r3 + r5
            r6 = -1
            r7 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = r6
            r10 = r9
            r8 = 0
            r11 = 0
        L28:
            int r12 = r0.i
            a8 r13 = r0.k
            if (r8 >= r12) goto L7d
            p6[] r12 = r0.e
            r12 = r12[r8]
            a40 r14 = r12.a
            int r14 = r14.l
            if (r14 != r5) goto L39
            goto L78
        L39:
            boolean r14 = r12.e
            if (r14 == 0) goto L3e
            goto L78
        L3e:
            float r14 = r12.b
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto L78
            r14 = r5
        L45:
            int r15 = r0.h
            if (r14 >= r15) goto L78
            java.lang.Object r15 = r13.d
            a40[] r15 = (defpackage.a40[]) r15
            r15 = r15[r14]
            o6 r1 = r12.d
            float r1 = r1.b(r15)
            int r16 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r16 > 0) goto L5a
            goto L73
        L5a:
            r4 = 0
        L5b:
            r5 = 9
            if (r4 >= r5) goto L73
            float[] r5 = r15.g
            r5 = r5[r4]
            float r5 = r5 / r1
            int r17 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r17 >= 0) goto L6a
            if (r4 == r11) goto L6c
        L6a:
            if (r4 <= r11) goto L70
        L6c:
            r11 = r4
            r7 = r5
            r9 = r8
            r10 = r14
        L70:
            int r4 = r4 + 1
            goto L5b
        L73:
            int r14 = r14 + 1
            r4 = 0
            r5 = 1
            goto L45
        L78:
            int r8 = r8 + 1
            r4 = 0
            r5 = 1
            goto L28
        L7d:
            if (r9 == r6) goto L98
            p6[] r1 = r0.e
            r1 = r1[r9]
            a40 r4 = r1.a
            r4.c = r6
            java.lang.Object r4 = r13.d
            a40[] r4 = (defpackage.a40[]) r4
            r4 = r4[r10]
            r1.f(r4)
            a40 r4 = r1.a
            r4.c = r9
            r4.d(r1)
            goto L99
        L98:
            r2 = 1
        L99:
            int r1 = r0.h
            int r1 = r1 / 2
            if (r3 <= r1) goto La0
            r2 = 1
        La0:
            r4 = 0
            r5 = 1
            goto L1d
        La4:
            int r2 = r2 + 1
            goto L3
        La8:
            r18.p(r19)
            r1 = 0
        Lac:
            int r2 = r0.i
            if (r1 >= r2) goto Lbd
            p6[] r2 = r0.e
            r2 = r2[r1]
            a40 r3 = r2.a
            float r2 = r2.b
            r3.e = r2
            int r1 = r1 + 1
            goto Lac
        Lbd:
            return
    }

    public final void p(defpackage.p6 r13) {
            r12 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r12.h
            if (r1 >= r2) goto Ld
            boolean[] r2 = r12.g
            r2[r1] = r0
            int r1 = r1 + 1
            goto L2
        Ld:
            r1 = r0
            r2 = r1
        Lf:
            if (r1 != 0) goto L8b
            r3 = 1
            int r2 = r2 + r3
            int r4 = r12.h
            int r4 = r4 * 2
            if (r2 < r4) goto L1b
            goto L8b
        L1b:
            a40 r4 = r13.a
            if (r4 == 0) goto L25
            boolean[] r5 = r12.g
            int r4 = r4.b
            r5[r4] = r3
        L25:
            boolean[] r4 = r12.g
            a40 r4 = r13.d(r4)
            if (r4 == 0) goto L38
            boolean[] r5 = r12.g
            int r6 = r4.b
            boolean r7 = r5[r6]
            if (r7 == 0) goto L36
            goto L8b
        L36:
            r5[r6] = r3
        L38:
            if (r4 == 0) goto L89
            r5 = -1
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = r0
            r8 = r5
        L40:
            int r9 = r12.i
            if (r7 >= r9) goto L74
            p6[] r9 = r12.e
            r9 = r9[r7]
            a40 r10 = r9.a
            int r10 = r10.l
            if (r10 != r3) goto L4f
            goto L71
        L4f:
            boolean r10 = r9.e
            if (r10 == 0) goto L54
            goto L71
        L54:
            o6 r10 = r9.d
            boolean r10 = r10.c(r4)
            if (r10 == 0) goto L71
            o6 r10 = r9.d
            float r10 = r10.b(r4)
            r11 = 0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L71
            float r9 = r9.b
            float r9 = -r9
            float r9 = r9 / r10
            int r10 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r10 >= 0) goto L71
            r8 = r7
            r6 = r9
        L71:
            int r7 = r7 + 1
            goto L40
        L74:
            if (r8 <= r5) goto Lf
            p6[] r3 = r12.e
            r3 = r3[r8]
            a40 r6 = r3.a
            r6.c = r5
            r3.f(r4)
            a40 r4 = r3.a
            r4.c = r8
            r4.d(r3)
            goto Lf
        L89:
            r1 = r3
            goto Lf
        L8b:
            return
    }

    public final void q() {
            r5 = this;
            boolean r0 = defpackage.ar.p
            r1 = 0
            a8 r2 = r5.k
            r3 = 0
            if (r0 == 0) goto L1f
        L8:
            p6[] r0 = r5.e
            int r4 = r0.length
            if (r3 >= r4) goto L36
            r0 = r0[r3]
            if (r0 == 0) goto L18
            java.lang.Object r4 = r2.a
            sx r4 = (defpackage.sx) r4
            r4.b(r0)
        L18:
            p6[] r0 = r5.e
            r0[r3] = r1
            int r3 = r3 + 1
            goto L8
        L1f:
            p6[] r0 = r5.e
            int r4 = r0.length
            if (r3 >= r4) goto L36
            r0 = r0[r3]
            if (r0 == 0) goto L2f
            java.lang.Object r4 = r2.b
            sx r4 = (defpackage.sx) r4
            r4.b(r0)
        L2f:
            p6[] r0 = r5.e
            r0[r3] = r1
            int r3 = r3 + 1
            goto L1f
        L36:
            return
    }

    public final void r() {
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            a8 r2 = r10.k
            java.lang.Object r3 = r2.d
            a40[] r3 = (defpackage.a40[]) r3
            int r4 = r3.length
            if (r1 >= r4) goto L15
            r2 = r3[r1]
            if (r2 == 0) goto L12
            r2.c()
        L12:
            int r1 = r1 + 1
            goto L2
        L15:
            java.lang.Object r1 = r2.c
            sx r1 = (defpackage.sx) r1
            a40[] r3 = r10.l
            int r4 = r10.m
            r1.getClass()
            int r5 = r3.length
            if (r4 <= r5) goto L24
            int r4 = r3.length
        L24:
            r5 = r0
        L25:
            if (r5 >= r4) goto L39
            r6 = r3[r5]
            int r7 = r1.c
            java.lang.Object[] r8 = r1.b
            int r9 = r8.length
            if (r7 >= r9) goto L36
            r8[r7] = r6
            int r7 = r7 + 1
            r1.c = r7
        L36:
            int r5 = r5 + 1
            goto L25
        L39:
            r10.m = r0
            java.lang.Object r1 = r2.d
            a40[] r1 = (defpackage.a40[]) r1
            r3 = 0
            java.util.Arrays.fill(r1, r3)
            r10.a = r0
            zx r1 = r10.b
            r1.h = r0
            r3 = 0
            r1.b = r3
            r1 = 1
            r10.h = r1
            r1 = r0
        L50:
            int r3 = r10.i
            if (r1 >= r3) goto L5e
            p6[] r3 = r10.e
            r3 = r3[r1]
            r3.getClass()
            int r1 = r1 + 1
            goto L50
        L5e:
            r10.q()
            r10.i = r0
            boolean r0 = defpackage.ar.p
            if (r0 == 0) goto L6f
            zq r0 = new zq
            r0.<init>(r2)
            r10.n = r0
            return
        L6f:
            p6 r0 = new p6
            r0.<init>(r2)
            r10.n = r0
            return
    }
}
