package a;

/* JADX INFO: renamed from: a.me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0269me implements a.K1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f579a;
    public final int[] b;
    public int[] c;
    public int[] d;
    public float[] e;
    public int[] f;
    public int[] g;
    public int h;
    public int i;
    public final a.B9.b j;
    public final a.A2 k;

    public C0269me(a.B9.b r3, a.A2 r4) {
            r2 = this;
            r2.<init>()
            r0 = 16
            r2.f579a = r0
            int[] r1 = new int[r0]
            r2.b = r1
            int[] r1 = new int[r0]
            r2.c = r1
            int[] r1 = new int[r0]
            r2.d = r1
            float[] r1 = new float[r0]
            r2.e = r1
            int[] r1 = new int[r0]
            r2.f = r1
            int[] r0 = new int[r0]
            r2.g = r0
            r0 = 0
            r2.h = r0
            r0 = -1
            r2.i = r0
            r2.j = r3
            r2.k = r4
            r2.clear()
            return
    }

    @Override // a.K1.a
    public final float a(int r5) {
            r4 = this;
            int r0 = r4.h
            int r1 = r4.i
            r2 = 0
        L5:
            if (r2 >= r0) goto L19
            if (r2 != r5) goto Le
            float[] r5 = r4.e
            r5 = r5[r1]
            return r5
        Le:
            int[] r3 = r4.g
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L16
            goto L19
        L16:
            int r2 = r2 + 1
            goto L5
        L19:
            r5 = 0
            return r5
    }

    @Override // a.K1.a
    public final float b(a.K1 r8, boolean r9) {
            r7 = this;
            a.le r0 = r8.f147a
            float r0 = r7.i(r0)
            a.le r1 = r8.f147a
            r7.h(r1, r9)
            a.K1$a r8 = r8.d
            a.me r8 = (a.C0269me) r8
            int r1 = r8.h
            r2 = 0
            r3 = r2
        L13:
            if (r2 >= r1) goto L31
            int[] r4 = r8.d
            r4 = r4[r3]
            r5 = -1
            if (r4 == r5) goto L2e
            float[] r5 = r8.e
            r5 = r5[r3]
            a.A2 r6 = r7.k
            java.lang.Object r6 = r6.d
            a.le[] r6 = (a.C0251le[]) r6
            r4 = r6[r4]
            float r5 = r5 * r0
            r7.e(r4, r5, r9)
            int r2 = r2 + 1
        L2e:
            int r3 = r3 + 1
            goto L13
        L31:
            return r0
    }

    @Override // a.K1.a
    public final void c(a.C0251le r9, float r10) {
            r8 = this;
            r0 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L13
            r0 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L13
            r8.h(r9, r1)
            return
        L13:
            int r0 = r8.h
            r2 = 0
            if (r0 != 0) goto L21
            r8.m(r2, r9, r10)
            r8.l(r9, r2)
            r8.i = r2
            return
        L21:
            int r0 = r8.n(r9)
            r3 = -1
            if (r0 == r3) goto L2d
            float[] r9 = r8.e
            r9[r0] = r10
            return
        L2d:
            int r0 = r8.h
            int r0 = r0 + r1
            int r1 = r8.f579a
            if (r0 < r1) goto L6f
            int r1 = r1 * 2
            int[] r0 = r8.d
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r8.d = r0
            float[] r0 = r8.e
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            r8.e = r0
            int[] r0 = r8.f
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r8.f = r0
            int[] r0 = r8.g
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r8.g = r0
            int[] r0 = r8.c
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r8.c = r0
            int r0 = r8.f579a
        L60:
            if (r0 >= r1) goto L6d
            int[] r4 = r8.d
            r4[r0] = r3
            int[] r4 = r8.c
            r4[r0] = r3
            int r0 = r0 + 1
            goto L60
        L6d:
            r8.f579a = r1
        L6f:
            int r0 = r8.h
            int r1 = r8.i
            r4 = r2
            r5 = r3
        L75:
            if (r4 >= r0) goto L91
            int[] r6 = r8.d
            r6 = r6[r1]
            int r7 = r9.b
            if (r6 != r7) goto L84
            float[] r9 = r8.e
            r9[r1] = r10
            return
        L84:
            if (r6 >= r7) goto L87
            r5 = r1
        L87:
            int[] r6 = r8.g
            r1 = r6[r1]
            if (r1 != r3) goto L8e
            goto L91
        L8e:
            int r4 = r4 + 1
            goto L75
        L91:
            int r0 = r8.f579a
            if (r2 >= r0) goto L9f
            int[] r0 = r8.d
            r0 = r0[r2]
            if (r0 != r3) goto L9c
            goto La0
        L9c:
            int r2 = r2 + 1
            goto L91
        L9f:
            r2 = r3
        La0:
            r8.m(r2, r9, r10)
            if (r5 == r3) goto Lb2
            int[] r10 = r8.f
            r10[r2] = r5
            int[] r10 = r8.g
            r0 = r10[r5]
            r10[r2] = r0
            r10[r5] = r2
            goto Lc7
        Lb2:
            int[] r10 = r8.f
            r10[r2] = r3
            int r10 = r8.h
            if (r10 <= 0) goto Lc3
            int[] r10 = r8.g
            int r0 = r8.i
            r10[r2] = r0
            r8.i = r2
            goto Lc7
        Lc3:
            int[] r10 = r8.g
            r10[r2] = r3
        Lc7:
            int[] r10 = r8.g
            r10 = r10[r2]
            if (r10 == r3) goto Ld1
            int[] r0 = r8.f
            r0[r10] = r2
        Ld1:
            r8.l(r9, r2)
            return
    }

    @Override // a.K1.a
    public final void clear() {
            r5 = this;
            int r0 = r5.h
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r0) goto L14
            a.le r3 = r5.f(r2)
            if (r3 == 0) goto L11
            a.B9$b r4 = r5.j
            r3.b(r4)
        L11:
            int r2 = r2 + 1
            goto L4
        L14:
            r0 = r1
        L15:
            int r2 = r5.f579a
            r3 = -1
            if (r0 >= r2) goto L25
            int[] r2 = r5.d
            r2[r0] = r3
            int[] r2 = r5.c
            r2[r0] = r3
            int r0 = r0 + 1
            goto L15
        L25:
            r0 = r1
        L26:
            r2 = 16
            if (r0 >= r2) goto L31
            int[] r2 = r5.b
            r2[r0] = r3
            int r0 = r0 + 1
            goto L26
        L31:
            r5.h = r1
            r5.i = r3
            return
    }

    @Override // a.K1.a
    public final boolean d(a.C0251le r2) {
            r1 = this;
            int r2 = r1.n(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // a.K1.a
    public final void e(a.C0251le r6, float r7, boolean r8) {
            r5 = this;
            r0 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r2 = 981668463(0x3a83126f, float:0.001)
            if (r1 <= 0) goto Lf
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto Lf
            goto L2f
        Lf:
            int r1 = r5.n(r6)
            r3 = -1
            if (r1 != r3) goto L1a
            r5.c(r6, r7)
            return
        L1a:
            float[] r3 = r5.e
            r4 = r3[r1]
            float r4 = r4 + r7
            r3[r1] = r4
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L2f
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 >= 0) goto L2f
            r7 = 0
            r3[r1] = r7
            r5.h(r6, r8)
        L2f:
            return
    }

    @Override // a.K1.a
    public final a.C0251le f(int r7) {
            r6 = this;
            int r0 = r6.h
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r6.i
            r3 = 0
        L9:
            if (r3 >= r0) goto L27
            r4 = -1
            if (r3 != r7) goto L1d
            if (r2 == r4) goto L1d
            a.A2 r7 = r6.k
            java.lang.Object r7 = r7.d
            a.le[] r7 = (a.C0251le[]) r7
            int[] r0 = r6.d
            r0 = r0[r2]
            r7 = r7[r0]
            return r7
        L1d:
            int[] r5 = r6.g
            r2 = r5[r2]
            if (r2 != r4) goto L24
            goto L27
        L24:
            int r3 = r3 + 1
            goto L9
        L27:
            return r1
    }

    @Override // a.K1.a
    public final void g(float r6) {
            r5 = this;
            int r0 = r5.h
            int r1 = r5.i
            r2 = 0
        L5:
            if (r2 >= r0) goto L19
            float[] r3 = r5.e
            r4 = r3[r1]
            float r4 = r4 / r6
            r3[r1] = r4
            int[] r3 = r5.g
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L16
            goto L19
        L16:
            int r2 = r2 + 1
            goto L5
        L19:
            return
    }

    @Override // a.K1.a
    public final float h(a.C0251le r8, boolean r9) {
            r7 = this;
            int r0 = r7.n(r8)
            r1 = -1
            if (r0 != r1) goto L9
            r8 = 0
            return r8
        L9:
            int r2 = r8.b
            int r3 = r2 % 16
            int[] r4 = r7.b
            r5 = r4[r3]
            if (r5 != r1) goto L14
            goto L3f
        L14:
            int[] r6 = r7.d
            r6 = r6[r5]
            if (r6 != r2) goto L23
            int[] r2 = r7.c
            r6 = r2[r5]
            r4[r3] = r6
            r2[r5] = r1
            goto L3f
        L23:
            int[] r3 = r7.c
            r4 = r3[r5]
            if (r4 == r1) goto L31
            int[] r6 = r7.d
            r6 = r6[r4]
            if (r6 == r2) goto L31
            r5 = r4
            goto L23
        L31:
            if (r4 == r1) goto L3f
            int[] r6 = r7.d
            r6 = r6[r4]
            if (r6 != r2) goto L3f
            r2 = r3[r4]
            r3[r5] = r2
            r3[r4] = r1
        L3f:
            float[] r2 = r7.e
            r2 = r2[r0]
            int r3 = r7.i
            if (r3 != r0) goto L4d
            int[] r3 = r7.g
            r3 = r3[r0]
            r7.i = r3
        L4d:
            int[] r3 = r7.d
            r3[r0] = r1
            int[] r3 = r7.f
            r4 = r3[r0]
            if (r4 == r1) goto L5d
            int[] r5 = r7.g
            r6 = r5[r0]
            r5[r4] = r6
        L5d:
            int[] r4 = r7.g
            r4 = r4[r0]
            if (r4 == r1) goto L67
            r0 = r3[r0]
            r3[r4] = r0
        L67:
            int r0 = r7.h
            int r0 = r0 + (-1)
            r7.h = r0
            int r0 = r8.l
            int r0 = r0 + (-1)
            r8.l = r0
            if (r9 == 0) goto L7a
            a.B9$b r9 = r7.j
            r8.b(r9)
        L7a:
            return r2
    }

    @Override // a.K1.a
    public final float i(a.C0251le r2) {
            r1 = this;
            int r2 = r1.n(r2)
            r0 = -1
            if (r2 == r0) goto Lc
            float[] r0 = r1.e
            r2 = r0[r2]
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // a.K1.a
    public final void j() {
            r6 = this;
            int r0 = r6.h
            int r1 = r6.i
            r2 = 0
        L5:
            if (r2 >= r0) goto L1b
            float[] r3 = r6.e
            r4 = r3[r1]
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            r3[r1] = r4
            int[] r3 = r6.g
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L18
            goto L1b
        L18:
            int r2 = r2 + 1
            goto L5
        L1b:
            return
    }

    @Override // a.K1.a
    public final int k() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    public final void l(a.C0251le r4, int r5) {
            r3 = this;
            int r4 = r4.b
            int r4 = r4 % 16
            int[] r0 = r3.b
            r1 = r0[r4]
            r2 = -1
            if (r1 != r2) goto Le
            r0[r4] = r5
            goto L18
        Le:
            int[] r4 = r3.c
            r0 = r4[r1]
            if (r0 == r2) goto L16
            r1 = r0
            goto Le
        L16:
            r4[r1] = r5
        L18:
            int[] r4 = r3.c
            r4[r5] = r2
            return
    }

    public final void m(int r3, a.C0251le r4, float r5) {
            r2 = this;
            int[] r0 = r2.d
            int r1 = r4.b
            r0[r3] = r1
            float[] r0 = r2.e
            r0[r3] = r5
            int[] r5 = r2.f
            r0 = -1
            r5[r3] = r0
            int[] r5 = r2.g
            r5[r3] = r0
            a.B9$b r3 = r2.j
            r4.a(r3)
            int r3 = r4.l
            int r3 = r3 + 1
            r4.l = r3
            int r3 = r2.h
            int r3 = r3 + 1
            r2.h = r3
            return
    }

    public final int n(a.C0251le r4) {
            r3 = this;
            int r0 = r3.h
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            int r4 = r4.b
            int r0 = r4 % 16
            int[] r2 = r3.b
            r0 = r2[r0]
            if (r0 != r1) goto L11
            return r1
        L11:
            int[] r2 = r3.d
            r2 = r2[r0]
            if (r2 != r4) goto L18
            return r0
        L18:
            int[] r2 = r3.c
            r0 = r2[r0]
            if (r0 == r1) goto L25
            int[] r2 = r3.d
            r2 = r2[r0]
            if (r2 == r4) goto L25
            goto L18
        L25:
            if (r0 != r1) goto L28
            return r1
        L28:
            int[] r2 = r3.d
            r2 = r2[r0]
            if (r2 != r4) goto L2f
            return r0
        L2f:
            return r1
    }

    public final java.lang.String toString() {
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r10.hashCode()
            r0.append(r1)
            java.lang.String r1 = " { "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = r10.h
            r2 = 0
        L18:
            if (r2 >= r1) goto Lb1
            a.le r3 = r10.f(r2)
            if (r3 != 0) goto L22
            goto Lad
        L22:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = " = "
            r4.append(r0)
            float r0 = r10.a(r2)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            int r3 = r10.n(r3)
            java.lang.String r4 = "[p: "
            java.lang.String r0 = a.C0487z.f(r0, r4)
            int[] r4 = r10.f
            r4 = r4[r3]
            java.lang.String r5 = "none"
            a.A2 r6 = r10.k
            r7 = -1
            if (r4 == r7) goto L75
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.Object r0 = r6.d
            a.le[] r0 = (a.C0251le[]) r0
            int[] r8 = r10.d
            int[] r9 = r10.f
            r9 = r9[r3]
            r8 = r8[r9]
            r0 = r0[r8]
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto L79
        L75:
            java.lang.String r0 = a.C0487z.f(r0, r5)
        L79:
            java.lang.String r4 = ", n: "
            java.lang.String r0 = a.C0487z.f(r0, r4)
            int[] r4 = r10.g
            r4 = r4[r3]
            if (r4 == r7) goto La3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.Object r0 = r6.d
            a.le[] r0 = (a.C0251le[]) r0
            int[] r5 = r10.d
            int[] r6 = r10.g
            r3 = r6[r3]
            r3 = r5[r3]
            r0 = r0[r3]
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto La7
        La3:
            java.lang.String r0 = a.C0487z.f(r0, r5)
        La7:
            java.lang.String r3 = "]"
            java.lang.String r0 = a.C0487z.f(r0, r3)
        Lad:
            int r2 = r2 + 1
            goto L18
        Lb1:
            java.lang.String r1 = " }"
            java.lang.String r0 = a.C0487z.f(r0, r1)
            return r0
    }
}
