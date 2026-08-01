package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l6 implements defpackage.o6 {
    public int a;
    public final defpackage.p6 b;
    public final defpackage.a8 c;
    public int d;
    public int[] e;
    public int[] f;
    public float[] g;
    public int h;
    public int i;
    public boolean j;

    public l6(defpackage.p6 r4, defpackage.a8 r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r1 = 8
            r3.d = r1
            int[] r2 = new int[r1]
            r3.e = r2
            int[] r2 = new int[r1]
            r3.f = r2
            float[] r1 = new float[r1]
            r3.g = r1
            r1 = -1
            r3.h = r1
            r3.i = r1
            r3.j = r0
            r3.b = r4
            r3.c = r5
            return
    }

    @Override // defpackage.o6
    public final float a(int r4) {
            r3 = this;
            int r0 = r3.h
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L18
            int r2 = r3.a
            if (r1 >= r2) goto L18
            if (r1 != r4) goto L11
            float[] r4 = r3.g
            r4 = r4[r0]
            return r4
        L11:
            int[] r2 = r3.f
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L18:
            r4 = 0
            return r4
    }

    @Override // defpackage.o6
    public final float b(defpackage.a40 r5) {
            r4 = this;
            int r0 = r4.h
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1e
            int r2 = r4.a
            if (r1 >= r2) goto L1e
            int[] r2 = r4.e
            r2 = r2[r0]
            int r3 = r5.b
            if (r2 != r3) goto L17
            float[] r5 = r4.g
            r5 = r5[r0]
            return r5
        L17:
            int[] r2 = r4.f
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1e:
            r5 = 0
            return r5
    }

    @Override // defpackage.o6
    public final boolean c(defpackage.a40 r7) {
            r6 = this;
            int r0 = r6.h
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L7
            goto L1f
        L7:
            r3 = r1
        L8:
            if (r0 == r2) goto L1f
            int r4 = r6.a
            if (r3 >= r4) goto L1f
            int[] r4 = r6.e
            r4 = r4[r0]
            int r5 = r7.b
            if (r4 != r5) goto L18
            r7 = 1
            return r7
        L18:
            int[] r4 = r6.f
            r0 = r4[r0]
            int r3 = r3 + 1
            goto L8
        L1f:
            return r1
    }

    @Override // defpackage.o6
    public final void clear() {
            r5 = this;
            int r0 = r5.h
            r1 = 0
            r2 = r1
        L4:
            r3 = -1
            if (r0 == r3) goto L25
            int r4 = r5.a
            if (r2 >= r4) goto L25
            a8 r3 = r5.c
            java.lang.Object r3 = r3.d
            a40[] r3 = (defpackage.a40[]) r3
            int[] r4 = r5.e
            r4 = r4[r0]
            r3 = r3[r4]
            if (r3 == 0) goto L1e
            p6 r4 = r5.b
            r3.b(r4)
        L1e:
            int[] r3 = r5.f
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L4
        L25:
            r5.h = r3
            r5.i = r3
            r5.j = r1
            r5.a = r1
            return
    }

    @Override // defpackage.o6
    public final float d(defpackage.a40 r8, boolean r9) {
            r7 = this;
            int r0 = r7.h
            r1 = -1
            if (r0 != r1) goto L6
            goto L53
        L6:
            r2 = 0
            r3 = r1
        L8:
            if (r0 == r1) goto L53
            int r4 = r7.a
            if (r2 >= r4) goto L53
            int[] r4 = r7.e
            r4 = r4[r0]
            int r5 = r8.b
            if (r4 != r5) goto L49
            int r2 = r7.h
            if (r0 != r2) goto L21
            int[] r2 = r7.f
            r2 = r2[r0]
            r7.h = r2
            goto L27
        L21:
            int[] r2 = r7.f
            r4 = r2[r0]
            r2[r3] = r4
        L27:
            if (r9 == 0) goto L2e
            p6 r9 = r7.b
            r8.b(r9)
        L2e:
            int r9 = r8.k
            int r9 = r9 + (-1)
            r8.k = r9
            int r8 = r7.a
            int r8 = r8 + (-1)
            r7.a = r8
            int[] r8 = r7.e
            r8[r0] = r1
            boolean r8 = r7.j
            if (r8 == 0) goto L44
            r7.i = r0
        L44:
            float[] r8 = r7.g
            r8 = r8[r0]
            return r8
        L49:
            int[] r3 = r7.f
            r3 = r3[r0]
            int r2 = r2 + 1
            r6 = r3
            r3 = r0
            r0 = r6
            goto L8
        L53:
            r8 = 0
            return r8
    }

    @Override // defpackage.o6
    public final defpackage.a40 e(int r4) {
            r3 = this;
            int r0 = r3.h
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L20
            int r2 = r3.a
            if (r1 >= r2) goto L20
            if (r1 != r4) goto L19
            a8 r4 = r3.c
            java.lang.Object r4 = r4.d
            a40[] r4 = (defpackage.a40[]) r4
            int[] r1 = r3.e
            r0 = r1[r0]
            r4 = r4[r0]
            return r4
        L19:
            int[] r2 = r3.f
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L20:
            r4 = 0
            return r4
    }

    @Override // defpackage.o6
    public final void f(defpackage.a40 r12, float r13, boolean r14) {
            r11 = this;
            r0 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r1 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r2 = 981668463(0x3a83126f, float:0.001)
            if (r1 <= 0) goto L10
            int r1 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r1 >= 0) goto L10
            goto L13a
        L10:
            int r1 = r11.h
            p6 r3 = r11.b
            r4 = 0
            r5 = -1
            r6 = 1
            if (r1 != r5) goto L4b
            r11.h = r4
            float[] r14 = r11.g
            r14[r4] = r13
            int[] r13 = r11.e
            int r14 = r12.b
            r13[r4] = r14
            int[] r13 = r11.f
            r13[r4] = r5
            int r13 = r12.k
            int r13 = r13 + r6
            r12.k = r13
            r12.a(r3)
            int r12 = r11.a
            int r12 = r12 + r6
            r11.a = r12
            boolean r12 = r11.j
            if (r12 != 0) goto L13a
            int r12 = r11.i
            int r12 = r12 + r6
            r11.i = r12
            int[] r13 = r11.e
            int r14 = r13.length
            if (r12 < r14) goto L13a
            r11.j = r6
            int r12 = r13.length
            int r12 = r12 - r6
            r11.i = r12
            return
        L4b:
            r7 = r4
            r8 = r5
        L4d:
            if (r1 == r5) goto La1
            int r9 = r11.a
            if (r7 >= r9) goto La1
            int[] r9 = r11.e
            r9 = r9[r1]
            int r10 = r12.b
            if (r9 != r10) goto L97
            float[] r4 = r11.g
            r5 = r4[r1]
            float r5 = r5 + r13
            int r13 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r0 = 0
            if (r13 <= 0) goto L6a
            int r13 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r13 >= 0) goto L6a
            r5 = r0
        L6a:
            r4[r1] = r5
            int r13 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r13 != 0) goto L13a
            int r13 = r11.h
            if (r1 != r13) goto L7b
            int[] r13 = r11.f
            r13 = r13[r1]
            r11.h = r13
            goto L81
        L7b:
            int[] r13 = r11.f
            r0 = r13[r1]
            r13[r8] = r0
        L81:
            if (r14 == 0) goto L86
            r12.b(r3)
        L86:
            boolean r13 = r11.j
            if (r13 == 0) goto L8c
            r11.i = r1
        L8c:
            int r13 = r12.k
            int r13 = r13 - r6
            r12.k = r13
            int r12 = r11.a
            int r12 = r12 - r6
            r11.a = r12
            return
        L97:
            if (r9 >= r10) goto L9a
            r8 = r1
        L9a:
            int[] r9 = r11.f
            r1 = r9[r1]
            int r7 = r7 + 1
            goto L4d
        La1:
            int r14 = r11.i
            int r0 = r14 + 1
            boolean r1 = r11.j
            if (r1 == 0) goto Lb2
            int[] r0 = r11.e
            r1 = r0[r14]
            if (r1 != r5) goto Lb0
            goto Lb3
        Lb0:
            int r14 = r0.length
            goto Lb3
        Lb2:
            r14 = r0
        Lb3:
            int[] r0 = r11.e
            int r1 = r0.length
            if (r14 < r1) goto Lcc
            int r1 = r11.a
            int r0 = r0.length
            if (r1 >= r0) goto Lcc
            r0 = r4
        Lbe:
            int[] r1 = r11.e
            int r2 = r1.length
            if (r0 >= r2) goto Lcc
            r1 = r1[r0]
            if (r1 != r5) goto Lc9
            r14 = r0
            goto Lcc
        Lc9:
            int r0 = r0 + 1
            goto Lbe
        Lcc:
            int[] r0 = r11.e
            int r1 = r0.length
            if (r14 < r1) goto Lfa
            int r14 = r0.length
            int r0 = r11.d
            int r0 = r0 * 2
            r11.d = r0
            r11.j = r4
            int r1 = r14 + (-1)
            r11.i = r1
            float[] r1 = r11.g
            float[] r0 = java.util.Arrays.copyOf(r1, r0)
            r11.g = r0
            int[] r0 = r11.e
            int r1 = r11.d
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r11.e = r0
            int[] r0 = r11.f
            int r1 = r11.d
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r11.f = r0
        Lfa:
            int[] r0 = r11.e
            int r1 = r12.b
            r0[r14] = r1
            float[] r0 = r11.g
            r0[r14] = r13
            if (r8 == r5) goto L10f
            int[] r13 = r11.f
            r0 = r13[r8]
            r13[r14] = r0
            r13[r8] = r14
            goto L117
        L10f:
            int[] r13 = r11.f
            int r0 = r11.h
            r13[r14] = r0
            r11.h = r14
        L117:
            int r13 = r12.k
            int r13 = r13 + r6
            r12.k = r13
            r12.a(r3)
            int r12 = r11.a
            int r12 = r12 + r6
            r11.a = r12
            boolean r12 = r11.j
            if (r12 != 0) goto L12d
            int r12 = r11.i
            int r12 = r12 + r6
            r11.i = r12
        L12d:
            int r12 = r11.i
            int[] r13 = r11.e
            int r14 = r13.length
            if (r12 < r14) goto L13a
            r11.j = r6
            int r12 = r13.length
            int r12 = r12 - r6
            r11.i = r12
        L13a:
            return
    }

    @Override // defpackage.o6
    public final float g(defpackage.p6 r6, boolean r7) {
            r5 = this;
            a40 r0 = r6.a
            float r0 = r5.b(r0)
            a40 r1 = r6.a
            r5.d(r1, r7)
            o6 r6 = r6.d
            int r1 = r6.k()
            r2 = 0
        L12:
            if (r2 >= r1) goto L23
            a40 r3 = r6.e(r2)
            float r4 = r6.b(r3)
            float r4 = r4 * r0
            r5.f(r3, r4, r7)
            int r2 = r2 + 1
            goto L12
        L23:
            return r0
    }

    @Override // defpackage.o6
    public final void h(float r5) {
            r4 = this;
            int r0 = r4.h
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L18
            int r2 = r4.a
            if (r1 >= r2) goto L18
            float[] r2 = r4.g
            r3 = r2[r0]
            float r3 = r3 / r5
            r2[r0] = r3
            int[] r2 = r4.f
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L18:
            return
    }

    @Override // defpackage.o6
    public final void i(defpackage.a40 r10, float r11) {
            r9 = this;
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto La
            r9.d(r10, r1)
            return
        La:
            int r0 = r9.h
            p6 r2 = r9.b
            r3 = 0
            r4 = -1
            if (r0 != r4) goto L44
            r9.h = r3
            float[] r0 = r9.g
            r0[r3] = r11
            int[] r11 = r9.e
            int r0 = r10.b
            r11[r3] = r0
            int[] r11 = r9.f
            r11[r3] = r4
            int r11 = r10.k
            int r11 = r11 + r1
            r10.k = r11
            r10.a(r2)
            int r10 = r9.a
            int r10 = r10 + r1
            r9.a = r10
            boolean r10 = r9.j
            if (r10 != 0) goto L101
            int r10 = r9.i
            int r10 = r10 + r1
            r9.i = r10
            int[] r11 = r9.e
            int r0 = r11.length
            if (r10 < r0) goto L101
            r9.j = r1
            int r10 = r11.length
            int r10 = r10 - r1
            r9.i = r10
            return
        L44:
            r5 = r3
            r6 = r4
        L46:
            if (r0 == r4) goto L63
            int r7 = r9.a
            if (r5 >= r7) goto L63
            int[] r7 = r9.e
            r7 = r7[r0]
            int r8 = r10.b
            if (r7 != r8) goto L59
            float[] r10 = r9.g
            r10[r0] = r11
            return
        L59:
            if (r7 >= r8) goto L5c
            r6 = r0
        L5c:
            int[] r7 = r9.f
            r0 = r7[r0]
            int r5 = r5 + 1
            goto L46
        L63:
            int r0 = r9.i
            int r5 = r0 + 1
            boolean r7 = r9.j
            if (r7 == 0) goto L74
            int[] r5 = r9.e
            r7 = r5[r0]
            if (r7 != r4) goto L72
            goto L75
        L72:
            int r0 = r5.length
            goto L75
        L74:
            r0 = r5
        L75:
            int[] r5 = r9.e
            int r7 = r5.length
            if (r0 < r7) goto L8e
            int r7 = r9.a
            int r5 = r5.length
            if (r7 >= r5) goto L8e
            r5 = r3
        L80:
            int[] r7 = r9.e
            int r8 = r7.length
            if (r5 >= r8) goto L8e
            r7 = r7[r5]
            if (r7 != r4) goto L8b
            r0 = r5
            goto L8e
        L8b:
            int r5 = r5 + 1
            goto L80
        L8e:
            int[] r5 = r9.e
            int r7 = r5.length
            if (r0 < r7) goto Lbc
            int r0 = r5.length
            int r5 = r9.d
            int r5 = r5 * 2
            r9.d = r5
            r9.j = r3
            int r3 = r0 + (-1)
            r9.i = r3
            float[] r3 = r9.g
            float[] r3 = java.util.Arrays.copyOf(r3, r5)
            r9.g = r3
            int[] r3 = r9.e
            int r5 = r9.d
            int[] r3 = java.util.Arrays.copyOf(r3, r5)
            r9.e = r3
            int[] r3 = r9.f
            int r5 = r9.d
            int[] r3 = java.util.Arrays.copyOf(r3, r5)
            r9.f = r3
        Lbc:
            int[] r3 = r9.e
            int r5 = r10.b
            r3[r0] = r5
            float[] r3 = r9.g
            r3[r0] = r11
            if (r6 == r4) goto Ld1
            int[] r11 = r9.f
            r3 = r11[r6]
            r11[r0] = r3
            r11[r6] = r0
            goto Ld9
        Ld1:
            int[] r11 = r9.f
            int r3 = r9.h
            r11[r0] = r3
            r9.h = r0
        Ld9:
            int r11 = r10.k
            int r11 = r11 + r1
            r10.k = r11
            r10.a(r2)
            int r10 = r9.a
            int r10 = r10 + r1
            r9.a = r10
            boolean r11 = r9.j
            if (r11 != 0) goto Lef
            int r11 = r9.i
            int r11 = r11 + r1
            r9.i = r11
        Lef:
            int[] r11 = r9.e
            int r0 = r11.length
            if (r10 < r0) goto Lf6
            r9.j = r1
        Lf6:
            int r10 = r9.i
            int r0 = r11.length
            if (r10 < r0) goto L101
            r9.j = r1
            int r10 = r11.length
            int r10 = r10 - r1
            r9.i = r10
        L101:
            return
    }

    @Override // defpackage.o6
    public final void j() {
            r5 = this;
            int r0 = r5.h
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1a
            int r2 = r5.a
            if (r1 >= r2) goto L1a
            float[] r2 = r5.g
            r3 = r2[r0]
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r4
            r2[r0] = r3
            int[] r2 = r5.f
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1a:
            return
    }

    @Override // defpackage.o6
    public final int k() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.h
            java.lang.String r1 = ""
            r2 = 0
        L5:
            r3 = -1
            if (r0 == r3) goto L4c
            int r3 = r5.a
            if (r2 >= r3) goto L4c
            java.lang.String r3 = " -> "
            java.lang.String r1 = defpackage.z30.i(r1, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            float[] r1 = r5.g
            r1 = r1[r0]
            r3.append(r1)
            java.lang.String r1 = " : "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            a8 r1 = r5.c
            java.lang.Object r1 = r1.d
            a40[] r1 = (defpackage.a40[]) r1
            int[] r4 = r5.e
            r4 = r4[r0]
            r1 = r1[r4]
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int[] r3 = r5.f
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L5
        L4c:
            return r1
    }
}
