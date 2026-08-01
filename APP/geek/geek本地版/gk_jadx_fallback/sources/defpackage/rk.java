package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rk extends defpackage.oo {
    public float A0;
    public float B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public java.util.ArrayList J0;
    public defpackage.pc[] K0;
    public defpackage.pc[] L0;
    public int[] M0;
    public defpackage.pc[] N0;
    public int O0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public int m0;
    public int n0;
    public defpackage.k7 o0;
    public defpackage.hc p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public float w0;
    public float x0;
    public float y0;
    public float z0;

    @Override // defpackage.oo
    public final void B() {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.e0
            if (r0 >= r1) goto Lc
            pc[] r1 = r2.d0
            r1 = r1[r0]
            int r0 = r0 + 1
            goto L1
        Lc:
            return
    }

    public final int C(defpackage.pc r10, int r11) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            goto L10
        L4:
            int[] r1 = r10.c0
            r2 = 1
            r3 = r1[r2]
            r4 = 3
            if (r3 != r4) goto L43
            int r3 = r10.k
            if (r3 != 0) goto L11
        L10:
            return r0
        L11:
            r5 = 2
            if (r3 != r5) goto L2c
            float r2 = r10.r
            float r11 = (float) r11
            float r2 = r2 * r11
            int r7 = (int) r2
            int r11 = r10.i()
            if (r7 == r11) goto L2b
            r4 = r1[r0]
            int r5 = r10.l()
            r6 = 1
            r3 = r9
            r8 = r10
            r3.E(r4, r5, r6, r7, r8)
        L2b:
            return r7
        L2c:
            r8 = r10
            if (r3 != r2) goto L34
            int r10 = r8.i()
            return r10
        L34:
            if (r3 != r4) goto L44
            int r10 = r8.l()
            float r10 = (float) r10
            float r11 = r8.L
            float r10 = r10 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 + r11
            int r10 = (int) r10
            return r10
        L43:
            r8 = r10
        L44:
            int r10 = r8.i()
            return r10
    }

    public final int D(defpackage.pc r12, int r13) {
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L4
            goto Lf
        L4:
            int[] r1 = r12.c0
            r2 = r1[r0]
            r3 = 3
            if (r2 != r3) goto L43
            int r2 = r12.j
            if (r2 != 0) goto L10
        Lf:
            return r0
        L10:
            r0 = 2
            r4 = 1
            if (r2 != r0) goto L2c
            float r0 = r12.o
            float r13 = (float) r13
            float r0 = r0 * r13
            int r7 = (int) r0
            int r13 = r12.l()
            if (r7 == r13) goto L2b
            r8 = r1[r4]
            int r9 = r12.i()
            r6 = 1
            r5 = r11
            r10 = r12
            r5.E(r6, r7, r8, r9, r10)
        L2b:
            return r7
        L2c:
            r10 = r12
            if (r2 != r4) goto L34
            int r12 = r10.l()
            return r12
        L34:
            if (r2 != r3) goto L44
            int r12 = r10.i()
            float r12 = (float) r12
            float r13 = r10.L
            float r12 = r12 * r13
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            return r12
        L43:
            r10 = r12
        L44:
            int r12 = r10.l()
            return r12
    }

    public final void E(int r4, int r5, int r6, int r7, defpackage.pc r8) {
            r3 = this;
            k7 r0 = r3.o0
        L2:
            hc r1 = r3.p0
            if (r1 != 0) goto L11
            pc r2 = r3.I
            if (r2 == 0) goto L11
            qc r2 = (defpackage.qc) r2
            hc r1 = r2.g0
            r3.p0 = r1
            goto L2
        L11:
            r0.a = r4
            r0.b = r6
            r0.c = r5
            r0.d = r7
            r1.a(r8, r0)
            int r4 = r0.e
            r8.y(r4)
            int r4 = r0.f
            r8.v(r4)
            boolean r4 = r0.h
            r8.w = r4
            int r4 = r0.g
            r8.P = r4
            if (r4 <= 0) goto L32
            r4 = 1
            goto L33
        L32:
            r4 = 0
        L33:
            r8.w = r4
            return
    }

    @Override // defpackage.pc
    public final void a(defpackage.ar r12) {
            r11 = this;
            java.util.ArrayList r0 = r11.J0
            super.a(r12)
            pc r12 = r11.I
            r1 = 0
            if (r12 == 0) goto Lf
            qc r12 = (defpackage.qc) r12
            boolean r12 = r12.h0
            goto L10
        Lf:
            r12 = r1
        L10:
            int r2 = r11.G0
            r3 = 1
            if (r2 == 0) goto L130
            if (r2 == r3) goto L116
            r0 = 2
            if (r2 == r0) goto L1c
            goto L13f
        L1c:
            int[] r0 = r11.M0
            if (r0 == 0) goto L13f
            pc[] r0 = r11.L0
            if (r0 == 0) goto L13f
            pc[] r0 = r11.K0
            if (r0 != 0) goto L2a
            goto L13f
        L2a:
            r0 = r1
        L2b:
            int r2 = r11.O0
            if (r0 >= r2) goto L39
            pc[] r2 = r11.N0
            r2 = r2[r0]
            r2.t()
            int r0 = r0 + 1
            goto L2b
        L39:
            int[] r0 = r11.M0
            r2 = r0[r1]
            r0 = r0[r3]
            r4 = 0
            r5 = r1
        L41:
            r6 = 8
            if (r5 >= r2) goto L89
            if (r12 == 0) goto L4b
            int r7 = r2 - r5
            int r7 = r7 - r3
            goto L4c
        L4b:
            r7 = r5
        L4c:
            pc[] r8 = r11.L0
            r7 = r8[r7]
            if (r7 == 0) goto L86
            cc r8 = r7.x
            int r9 = r7.V
            if (r9 != r6) goto L59
            goto L86
        L59:
            if (r5 != 0) goto L6a
            cc r6 = r11.x
            int r9 = r11.j0
            r7.e(r8, r6, r9)
            int r6 = r11.q0
            r7.X = r6
            float r6 = r11.w0
            r7.S = r6
        L6a:
            int r6 = r2 + (-1)
            if (r5 != r6) goto L77
            cc r6 = r7.z
            cc r9 = r11.z
            int r10 = r11.k0
            r7.e(r6, r9, r10)
        L77:
            if (r5 <= 0) goto L85
            cc r6 = r4.z
            int r9 = r11.C0
            r7.e(r8, r6, r9)
            cc r6 = r4.z
            r4.e(r6, r8, r1)
        L85:
            r4 = r7
        L86:
            int r5 = r5 + 1
            goto L41
        L89:
            r12 = r1
        L8a:
            if (r12 >= r0) goto Lc9
            pc[] r5 = r11.K0
            r5 = r5[r12]
            if (r5 == 0) goto Lc6
            cc r7 = r5.y
            int r8 = r5.V
            if (r8 != r6) goto L99
            goto Lc6
        L99:
            if (r12 != 0) goto Laa
            cc r8 = r11.y
            int r9 = r11.f0
            r5.e(r7, r8, r9)
            int r8 = r11.r0
            r5.Y = r8
            float r8 = r11.x0
            r5.T = r8
        Laa:
            int r8 = r0 + (-1)
            if (r12 != r8) goto Lb7
            cc r8 = r5.A
            cc r9 = r11.A
            int r10 = r11.g0
            r5.e(r8, r9, r10)
        Lb7:
            if (r12 <= 0) goto Lc5
            cc r8 = r4.A
            int r9 = r11.D0
            r5.e(r7, r8, r9)
            cc r8 = r4.A
            r4.e(r8, r7, r1)
        Lc5:
            r4 = r5
        Lc6:
            int r12 = r12 + 1
            goto L8a
        Lc9:
            r12 = r1
        Lca:
            if (r12 >= r2) goto L13f
            r4 = r1
        Lcd:
            if (r4 >= r0) goto L113
            int r5 = r4 * r2
            int r5 = r5 + r12
            int r7 = r11.I0
            if (r7 != r3) goto Ld9
            int r5 = r12 * r0
            int r5 = r5 + r4
        Ld9:
            pc[] r7 = r11.N0
            int r8 = r7.length
            if (r5 < r8) goto Ldf
            goto L110
        Ldf:
            r5 = r7[r5]
            if (r5 == 0) goto L110
            int r7 = r5.V
            if (r7 != r6) goto Le8
            goto L110
        Le8:
            pc[] r7 = r11.L0
            r7 = r7[r12]
            pc[] r8 = r11.K0
            r8 = r8[r4]
            if (r5 == r7) goto L100
            cc r9 = r5.x
            cc r10 = r7.x
            r5.e(r9, r10, r1)
            cc r9 = r5.z
            cc r7 = r7.z
            r5.e(r9, r7, r1)
        L100:
            if (r5 == r8) goto L110
            cc r7 = r5.y
            cc r9 = r8.y
            r5.e(r7, r9, r1)
            cc r7 = r5.A
            cc r8 = r8.A
            r5.e(r7, r8, r1)
        L110:
            int r4 = r4 + 1
            goto Lcd
        L113:
            int r12 = r12 + 1
            goto Lca
        L116:
            int r2 = r0.size()
            r4 = r1
        L11b:
            if (r4 >= r2) goto L13f
            java.lang.Object r5 = r0.get(r4)
            qk r5 = (defpackage.qk) r5
            int r6 = r2 + (-1)
            if (r4 != r6) goto L129
            r6 = r3
            goto L12a
        L129:
            r6 = r1
        L12a:
            r5.b(r4, r12, r6)
            int r4 = r4 + 1
            goto L11b
        L130:
            int r2 = r0.size()
            if (r2 <= 0) goto L13f
            java.lang.Object r0 = r0.get(r1)
            qk r0 = (defpackage.qk) r0
            r0.b(r1, r12, r3)
        L13f:
            r11.l0 = r1
            return
    }
}
