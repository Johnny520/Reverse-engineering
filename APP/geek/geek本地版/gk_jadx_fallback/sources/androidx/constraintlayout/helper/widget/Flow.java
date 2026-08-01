package androidx.constraintlayout.helper.widget;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends defpackage.hb0 {
    public final defpackage.rk i;

    public Flow(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r8.<init>(r9, r10)
            r0 = 32
            int[] r1 = new int[r0]
            r8.a = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r8.f = r1
            r8.c = r9
            super.e(r10)
            rk r9 = new rk
            r9.<init>()
            r1 = 0
            r9.f0 = r1
            r9.g0 = r1
            r9.h0 = r1
            r9.i0 = r1
            r9.j0 = r1
            r9.k0 = r1
            r9.l0 = r1
            r9.m0 = r1
            r9.n0 = r1
            k7 r2 = new k7
            r2.<init>()
            r9.o0 = r2
            r2 = 0
            r9.p0 = r2
            r3 = -1
            r9.q0 = r3
            r9.r0 = r3
            r9.s0 = r3
            r9.t0 = r3
            r9.u0 = r3
            r9.v0 = r3
            r4 = 1056964608(0x3f000000, float:0.5)
            r9.w0 = r4
            r9.x0 = r4
            r9.y0 = r4
            r9.z0 = r4
            r9.A0 = r4
            r9.B0 = r4
            r9.C0 = r1
            r9.D0 = r1
            r5 = 2
            r9.E0 = r5
            r9.F0 = r5
            r9.G0 = r1
            r9.H0 = r3
            r9.I0 = r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r9.J0 = r6
            r9.K0 = r2
            r9.L0 = r2
            r9.M0 = r2
            r9.O0 = r1
            r8.i = r9
            if (r10 == 0) goto L1ef
            android.content.Context r9 = r8.getContext()
            int[] r2 = defpackage.ry.b
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r2)
            int r10 = r9.getIndexCount()
            r2 = r1
        L83:
            if (r2 >= r10) goto L1ef
            int r6 = r9.getIndex(r2)
            if (r6 != 0) goto L95
            rk r7 = r8.i
            int r6 = r9.getInt(r6, r1)
            r7.I0 = r6
            goto L1eb
        L95:
            r7 = 1
            if (r6 != r7) goto La8
            rk r7 = r8.i
            int r6 = r9.getDimensionPixelSize(r6, r1)
            r7.f0 = r6
            r7.g0 = r6
            r7.h0 = r6
            r7.i0 = r6
            goto L1eb
        La8:
            r7 = 11
            if (r6 != r7) goto Lba
            rk r7 = r8.i
            int r6 = r9.getDimensionPixelSize(r6, r1)
            r7.h0 = r6
            r7.j0 = r6
            r7.k0 = r6
            goto L1eb
        Lba:
            r7 = 12
            if (r6 != r7) goto Lc8
            rk r7 = r8.i
            int r6 = r9.getDimensionPixelSize(r6, r1)
            r7.i0 = r6
            goto L1eb
        Lc8:
            if (r6 != r5) goto Ld4
            rk r7 = r8.i
            int r6 = r9.getDimensionPixelSize(r6, r1)
            r7.j0 = r6
            goto L1eb
        Ld4:
            r7 = 3
            if (r6 != r7) goto Le1
            rk r7 = r8.i
            int r6 = r9.getDimensionPixelSize(r6, r1)
            r7.f0 = r6
            goto L1eb
        Le1:
            r7 = 4
            if (r6 != r7) goto Lee
            rk r7 = r8.i
            int r6 = r9.getDimensionPixelSize(r6, r1)
            r7.k0 = r6
            goto L1eb
        Lee:
            r7 = 5
            if (r6 != r7) goto Lfb
            rk r7 = r8.i
            int r6 = r9.getDimensionPixelSize(r6, r1)
            r7.g0 = r6
            goto L1eb
        Lfb:
            r7 = 37
            if (r6 != r7) goto L109
            rk r7 = r8.i
            int r6 = r9.getInt(r6, r1)
            r7.G0 = r6
            goto L1eb
        L109:
            r7 = 27
            if (r6 != r7) goto L117
            rk r7 = r8.i
            int r6 = r9.getInt(r6, r1)
            r7.q0 = r6
            goto L1eb
        L117:
            r7 = 36
            if (r6 != r7) goto L125
            rk r7 = r8.i
            int r6 = r9.getInt(r6, r1)
            r7.r0 = r6
            goto L1eb
        L125:
            r7 = 21
            if (r6 != r7) goto L133
            rk r7 = r8.i
            int r6 = r9.getInt(r6, r1)
            r7.s0 = r6
            goto L1eb
        L133:
            r7 = 29
            if (r6 != r7) goto L141
            rk r7 = r8.i
            int r6 = r9.getInt(r6, r1)
            r7.u0 = r6
            goto L1eb
        L141:
            r7 = 23
            if (r6 != r7) goto L14f
            rk r7 = r8.i
            int r6 = r9.getInt(r6, r1)
            r7.t0 = r6
            goto L1eb
        L14f:
            r7 = 31
            if (r6 != r7) goto L15d
            rk r7 = r8.i
            int r6 = r9.getInt(r6, r1)
            r7.v0 = r6
            goto L1eb
        L15d:
            r7 = 25
            if (r6 != r7) goto L16b
            rk r7 = r8.i
            float r6 = r9.getFloat(r6, r4)
            r7.w0 = r6
            goto L1eb
        L16b:
            r7 = 20
            if (r6 != r7) goto L179
            rk r7 = r8.i
            float r6 = r9.getFloat(r6, r4)
            r7.y0 = r6
            goto L1eb
        L179:
            r7 = 28
            if (r6 != r7) goto L186
            rk r7 = r8.i
            float r6 = r9.getFloat(r6, r4)
            r7.A0 = r6
            goto L1eb
        L186:
            r7 = 22
            if (r6 != r7) goto L193
            rk r7 = r8.i
            float r6 = r9.getFloat(r6, r4)
            r7.z0 = r6
            goto L1eb
        L193:
            r7 = 30
            if (r6 != r7) goto L1a0
            rk r7 = r8.i
            float r6 = r9.getFloat(r6, r4)
            r7.B0 = r6
            goto L1eb
        L1a0:
            r7 = 34
            if (r6 != r7) goto L1ad
            rk r7 = r8.i
            float r6 = r9.getFloat(r6, r4)
            r7.x0 = r6
            goto L1eb
        L1ad:
            r7 = 24
            if (r6 != r7) goto L1ba
            rk r7 = r8.i
            int r6 = r9.getInt(r6, r5)
            r7.E0 = r6
            goto L1eb
        L1ba:
            r7 = 33
            if (r6 != r7) goto L1c7
            rk r7 = r8.i
            int r6 = r9.getInt(r6, r5)
            r7.F0 = r6
            goto L1eb
        L1c7:
            r7 = 26
            if (r6 != r7) goto L1d4
            rk r7 = r8.i
            int r6 = r9.getDimensionPixelSize(r6, r1)
            r7.C0 = r6
            goto L1eb
        L1d4:
            r7 = 35
            if (r6 != r7) goto L1e1
            rk r7 = r8.i
            int r6 = r9.getDimensionPixelSize(r6, r1)
            r7.D0 = r6
            goto L1eb
        L1e1:
            if (r6 != r0) goto L1eb
            rk r7 = r8.i
            int r6 = r9.getInt(r6, r3)
            r7.H0 = r6
        L1eb:
            int r2 = r2 + 1
            goto L83
        L1ef:
            rk r9 = r8.i
            r8.d = r9
            r8.g()
            return
    }

    @Override // defpackage.ec
    public final void f(defpackage.pc r3, boolean r4) {
            r2 = this;
            rk r3 = r2.i
            int r0 = r3.h0
            if (r0 > 0) goto Lc
            int r1 = r3.i0
            if (r1 <= 0) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            if (r4 == 0) goto L15
            int r4 = r3.i0
            r3.j0 = r4
            r3.k0 = r0
            return
        L15:
            r3.j0 = r0
            int r4 = r3.i0
            r3.k0 = r4
            return
    }

    @Override // defpackage.hb0
    public final void h(defpackage.rk r37, int r38, int r39) {
            r36 = this;
            r2 = r37
            int r9 = android.view.View.MeasureSpec.getMode(r38)
            int r10 = android.view.View.MeasureSpec.getSize(r38)
            int r11 = android.view.View.MeasureSpec.getMode(r39)
            int r12 = android.view.View.MeasureSpec.getSize(r39)
            r13 = 0
            if (r2 == 0) goto L579
            java.util.ArrayList r14 = r2.J0
            int r1 = r2.e0
            r15 = 1
            r4 = 3
            if (r1 <= 0) goto L8b
            k7 r1 = r2.o0
            pc r6 = r2.I
            if (r6 == 0) goto L28
            qc r6 = (defpackage.qc) r6
            hc r6 = r6.g0
            goto L29
        L28:
            r6 = 0
        L29:
            if (r6 != 0) goto L33
            r2.m0 = r13
            r2.n0 = r13
            r2.l0 = r13
            goto L56f
        L33:
            r7 = r13
        L34:
            int r8 = r2.e0
            if (r7 >= r8) goto L8b
            pc[] r8 = r2.d0
            r8 = r8[r7]
            if (r8 != 0) goto L3f
            goto L87
        L3f:
            boolean r5 = r8 instanceof defpackage.go
            if (r5 == 0) goto L44
            goto L87
        L44:
            int r5 = r8.h(r13)
            int r13 = r8.h(r15)
            if (r5 != r4) goto L59
            int r3 = r8.j
            if (r3 == r15) goto L59
            if (r13 != r4) goto L59
            int r3 = r8.k
            if (r3 == r15) goto L59
            goto L87
        L59:
            if (r5 != r4) goto L5c
            r5 = 2
        L5c:
            if (r13 != r4) goto L5f
            r13 = 2
        L5f:
            r1.a = r5
            r1.b = r13
            int r3 = r8.l()
            r1.c = r3
            int r3 = r8.i()
            r1.d = r3
            r6.a(r8, r1)
            int r3 = r1.e
            r8.y(r3)
            int r3 = r1.f
            r8.v(r3)
            int r3 = r1.g
            r8.P = r3
            if (r3 <= 0) goto L84
            r3 = r15
            goto L85
        L84:
            r3 = 0
        L85:
            r8.w = r3
        L87:
            int r7 = r7 + 1
            r13 = 0
            goto L34
        L8b:
            int r13 = r2.j0
            int r1 = r2.k0
            int r3 = r2.f0
            int r5 = r2.g0
            r6 = 2
            int[] r7 = new int[r6]
            int r6 = r10 - r13
            int r6 = r6 - r1
            int r8 = r2.I0
            if (r8 != r15) goto La0
            int r6 = r12 - r3
            int r6 = r6 - r5
        La0:
            r4 = -1
            if (r8 != 0) goto Lb3
            int r8 = r2.q0
            if (r8 != r4) goto Lab
            r8 = 0
            r2.q0 = r8
            goto Lac
        Lab:
            r8 = 0
        Lac:
            int r15 = r2.r0
            if (r15 != r4) goto Lc0
            r2.r0 = r8
            goto Lc0
        Lb3:
            r8 = 0
            int r15 = r2.q0
            if (r15 != r4) goto Lba
            r2.q0 = r8
        Lba:
            int r15 = r2.r0
            if (r15 != r4) goto Lc0
            r2.r0 = r8
        Lc0:
            pc[] r4 = r2.d0
            r18 = r1
            r8 = 0
            r15 = 0
        Lc6:
            int r1 = r2.e0
            r19 = r3
            r3 = 8
            if (r8 >= r1) goto Ldd
            pc[] r1 = r2.d0
            r1 = r1[r8]
            int r1 = r1.V
            if (r1 != r3) goto Ld8
            int r15 = r15 + 1
        Ld8:
            int r8 = r8 + 1
            r3 = r19
            goto Lc6
        Ldd:
            if (r15 <= 0) goto Lfc
            int r1 = r1 - r15
            pc[] r4 = new defpackage.pc[r1]
            r1 = 0
            r8 = 0
        Le4:
            int r15 = r2.e0
            if (r1 >= r15) goto Lf9
            pc[] r15 = r2.d0
            r15 = r15[r1]
            r20 = r1
            int r1 = r15.V
            if (r1 == r3) goto Lf6
            r4[r8] = r15
            int r8 = r8 + 1
        Lf6:
            int r1 = r20 + 1
            goto Le4
        Lf9:
            r15 = r8
        Lfa:
            r1 = r4
            goto Lfe
        Lfc:
            r15 = r1
            goto Lfa
        Lfe:
            r2.N0 = r1
            r2.O0 = r15
            int r3 = r2.G0
            if (r3 == 0) goto L4a7
            r4 = 1
            if (r3 == r4) goto L296
            r4 = 2
            if (r3 == r4) goto L11c
            r32 = r5
            r33 = r7
            r35 = r13
            r30 = r18
            r31 = r19
        L116:
            r20 = 0
            r28 = 1
            goto L52d
        L11c:
            int r3 = r2.I0
            if (r3 != 0) goto L146
            int r4 = r2.H0
            if (r4 > 0) goto L144
            r4 = 0
            r8 = 0
            r14 = 0
        L127:
            if (r4 >= r15) goto L143
            r17 = r4
            if (r4 <= 0) goto L130
            int r4 = r2.C0
            int r8 = r8 + r4
        L130:
            r4 = r1[r17]
            if (r4 != 0) goto L135
            goto L140
        L135:
            int r4 = r2.D(r4, r6)
            int r4 = r4 + r8
            if (r4 <= r6) goto L13d
            goto L143
        L13d:
            int r14 = r14 + 1
            r8 = r4
        L140:
            int r4 = r17 + 1
            goto L127
        L143:
            r4 = r14
        L144:
            r14 = 0
            goto L16d
        L146:
            int r4 = r2.H0
            if (r4 > 0) goto L16b
            r4 = 0
            r8 = 0
            r14 = 0
        L14d:
            if (r4 >= r15) goto L169
            r17 = r4
            if (r4 <= 0) goto L156
            int r4 = r2.D0
            int r8 = r8 + r4
        L156:
            r4 = r1[r17]
            if (r4 != 0) goto L15b
            goto L166
        L15b:
            int r4 = r2.C(r4, r6)
            int r4 = r4 + r8
            if (r4 <= r6) goto L163
            goto L169
        L163:
            int r14 = r14 + 1
            r8 = r4
        L166:
            int r4 = r17 + 1
            goto L14d
        L169:
            r4 = 0
            goto L16d
        L16b:
            r14 = r4
            goto L169
        L16d:
            int[] r8 = r2.M0
            if (r8 != 0) goto L176
            r8 = 2
            int[] r8 = new int[r8]
            r2.M0 = r8
        L176:
            if (r14 != 0) goto L17b
            r8 = 1
            if (r3 == r8) goto L17f
        L17b:
            if (r4 != 0) goto L182
            if (r3 != 0) goto L182
        L17f:
            r8 = r4
            r4 = 1
            goto L184
        L182:
            r8 = r4
            r4 = 0
        L184:
            if (r4 != 0) goto L27c
            if (r3 != 0) goto L196
            float r14 = (float) r15
            r16 = r4
            float r4 = (float) r8
            float r14 = r14 / r4
            r20 = r5
            double r4 = (double) r14
            double r4 = java.lang.Math.ceil(r4)
            int r14 = (int) r4
            goto L1a3
        L196:
            r16 = r4
            r20 = r5
            float r4 = (float) r15
            float r5 = (float) r14
            float r4 = r4 / r5
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r8 = (int) r4
        L1a3:
            pc[] r4 = r2.L0
            if (r4 == 0) goto L1aa
            int r5 = r4.length
            if (r5 >= r8) goto L1ac
        L1aa:
            r5 = 0
            goto L1b1
        L1ac:
            r5 = 0
            java.util.Arrays.fill(r4, r5)
            goto L1b5
        L1b1:
            pc[] r4 = new defpackage.pc[r8]
            r2.L0 = r4
        L1b5:
            pc[] r4 = r2.K0
            if (r4 == 0) goto L1c2
            int r5 = r4.length
            if (r5 >= r14) goto L1bd
            goto L1c2
        L1bd:
            r5 = 0
            java.util.Arrays.fill(r4, r5)
            goto L1c6
        L1c2:
            pc[] r4 = new defpackage.pc[r14]
            r2.K0 = r4
        L1c6:
            r4 = 0
        L1c7:
            if (r4 >= r8) goto L224
            r5 = 0
        L1ca:
            if (r5 >= r14) goto L21b
            int r17 = r5 * r8
            int r17 = r17 + r4
            r21 = r4
            r4 = 1
            if (r3 != r4) goto L1d9
            int r4 = r21 * r14
            int r17 = r4 + r5
        L1d9:
            r4 = r17
            r17 = r3
            int r3 = r1.length
            if (r4 < r3) goto L1e3
        L1e0:
            r22 = r1
            goto L212
        L1e3:
            r3 = r1[r4]
            if (r3 != 0) goto L1e8
            goto L1e0
        L1e8:
            int r4 = r2.D(r3, r6)
            r22 = r1
            pc[] r1 = r2.L0
            r1 = r1[r21]
            if (r1 == 0) goto L1fa
            int r1 = r1.l()
            if (r1 >= r4) goto L1fe
        L1fa:
            pc[] r1 = r2.L0
            r1[r21] = r3
        L1fe:
            int r1 = r2.C(r3, r6)
            pc[] r4 = r2.K0
            r4 = r4[r5]
            if (r4 == 0) goto L20e
            int r4 = r4.i()
            if (r4 >= r1) goto L212
        L20e:
            pc[] r1 = r2.K0
            r1[r5] = r3
        L212:
            int r5 = r5 + 1
            r3 = r17
            r4 = r21
            r1 = r22
            goto L1ca
        L21b:
            r22 = r1
            r17 = r3
            r21 = r4
            int r4 = r21 + 1
            goto L1c7
        L224:
            r22 = r1
            r17 = r3
            r1 = 0
            r3 = 0
        L22a:
            if (r1 >= r8) goto L240
            pc[] r4 = r2.L0
            r4 = r4[r1]
            if (r4 == 0) goto L23d
            if (r1 <= 0) goto L237
            int r5 = r2.C0
            int r3 = r3 + r5
        L237:
            int r4 = r2.D(r4, r6)
            int r4 = r4 + r3
            r3 = r4
        L23d:
            int r1 = r1 + 1
            goto L22a
        L240:
            r1 = 0
            r4 = 0
        L242:
            if (r1 >= r14) goto L25a
            pc[] r5 = r2.K0
            r5 = r5[r1]
            r21 = r1
            if (r5 == 0) goto L257
            if (r1 <= 0) goto L251
            int r1 = r2.D0
            int r4 = r4 + r1
        L251:
            int r1 = r2.C(r5, r6)
            int r1 = r1 + r4
            r4 = r1
        L257:
            int r1 = r21 + 1
            goto L242
        L25a:
            r1 = 0
            r7[r1] = r3
            r1 = 1
            r7[r1] = r4
            if (r17 != 0) goto L26d
            if (r3 <= r6) goto L26b
            if (r8 <= r1) goto L26b
            int r8 = r8 + (-1)
        L268:
            r4 = r16
            goto L274
        L26b:
            r4 = r1
            goto L274
        L26d:
            if (r4 <= r6) goto L26b
            if (r14 <= r1) goto L26b
            int r14 = r14 + (-1)
            goto L268
        L274:
            r3 = r17
            r5 = r20
            r1 = r22
            goto L184
        L27c:
            r20 = r5
            r1 = 1
            int[] r3 = r2.M0
            r4 = 0
            r3[r4] = r8
            r3[r1] = r14
            r28 = r1
            r33 = r7
            r35 = r13
            r30 = r18
            r31 = r19
            r32 = r20
            r20 = 0
            goto L52d
        L296:
            r22 = r1
            r20 = r5
            r8 = 2
            int r3 = r2.I0
            cc r1 = r2.A
            cc r4 = r2.z
            if (r15 != 0) goto L2af
            r33 = r7
            r35 = r13
            r30 = r18
            r31 = r19
            r32 = r20
            goto L116
        L2af:
            r14.clear()
            r5 = r1
            qk r1 = new qk
            r16 = r4
            cc r4 = r2.x
            r21 = r5
            cc r5 = r2.y
            r27 = r6
            cc r6 = r2.z
            r23 = r7
            cc r7 = r2.A
            r35 = r13
            r29 = r16
            r30 = r18
            r31 = r19
            r32 = r20
            r16 = r21
            r34 = r22
            r33 = r23
            r8 = r27
            r13 = 3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r14.add(r1)
            if (r3 != 0) goto L349
            r6 = r1
            r1 = 0
            r4 = 0
            r5 = 0
        L2e4:
            if (r1 >= r15) goto L3ac
            r7 = r34[r1]
            int r18 = r2.D(r7, r8)
            r19 = r1
            int[] r1 = r7.c0
            r20 = 0
            r1 = r1[r20]
            if (r1 != r13) goto L2f8
            int r4 = r4 + 1
        L2f8:
            r20 = r4
            if (r5 == r8) goto L303
            int r1 = r2.C0
            int r1 = r1 + r5
            int r1 = r1 + r18
            if (r1 <= r8) goto L309
        L303:
            pc r1 = r6.b
            if (r1 == 0) goto L309
            r1 = 1
            goto L30a
        L309:
            r1 = 0
        L30a:
            if (r1 != 0) goto L317
            if (r19 <= 0) goto L317
            int r4 = r2.H0
            if (r4 <= 0) goto L317
            int r4 = r19 % r4
            if (r4 != 0) goto L317
            r1 = 1
        L317:
            if (r1 == 0) goto L335
            qk r1 = new qk
            cc r4 = r2.x
            cc r5 = r2.y
            cc r6 = r2.z
            r21 = r7
            cc r7 = r2.A
            r13 = r19
            r0 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r1.n = r13
            r14.add(r1)
            r6 = r1
        L332:
            r5 = r18
            goto L340
        L335:
            r0 = r7
            r13 = r19
            if (r13 <= 0) goto L332
            int r1 = r2.C0
            int r1 = r1 + r18
            int r1 = r1 + r5
            r5 = r1
        L340:
            r6.a(r0)
            int r1 = r13 + 1
            r4 = r20
            r13 = 3
            goto L2e4
        L349:
            r5 = r1
            r0 = 0
            r1 = 0
            r4 = 0
        L34d:
            if (r0 >= r15) goto L3ab
            r13 = r34[r0]
            int r18 = r2.C(r13, r8)
            int[] r6 = r13.c0
            r28 = 1
            r6 = r6[r28]
            r7 = 3
            if (r6 != r7) goto L360
            int r1 = r1 + 1
        L360:
            r19 = r1
            if (r4 == r8) goto L36b
            int r1 = r2.D0
            int r1 = r1 + r4
            int r1 = r1 + r18
            if (r1 <= r8) goto L371
        L36b:
            pc r1 = r5.b
            if (r1 == 0) goto L371
            r1 = 1
            goto L372
        L371:
            r1 = 0
        L372:
            if (r1 != 0) goto L37f
            if (r0 <= 0) goto L37f
            int r6 = r2.H0
            if (r6 <= 0) goto L37f
            int r6 = r0 % r6
            if (r6 != 0) goto L37f
            r1 = 1
        L37f:
            if (r1 == 0) goto L399
            qk r1 = new qk
            cc r4 = r2.x
            cc r5 = r2.y
            cc r6 = r2.z
            r22 = r7
            cc r7 = r2.A
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r1.n = r0
            r14.add(r1)
            r5 = r1
        L396:
            r4 = r18
            goto L3a3
        L399:
            r22 = r7
            if (r0 <= 0) goto L396
            int r1 = r2.D0
            int r1 = r1 + r18
            int r1 = r1 + r4
            r4 = r1
        L3a3:
            r5.a(r13)
            int r0 = r0 + 1
            r1 = r19
            goto L34d
        L3ab:
            r4 = r1
        L3ac:
            int r0 = r14.size()
            cc r1 = r2.x
            cc r5 = r2.y
            int r6 = r2.j0
            int r7 = r2.f0
            int r13 = r2.k0
            int r15 = r2.g0
            r18 = r1
            int[] r1 = r2.c0
            r19 = r1
            r20 = 0
            r1 = r19[r20]
            r38 = r3
            r3 = 2
            if (r1 == r3) goto L3d4
            r28 = 1
            r1 = r19[r28]
            if (r1 != r3) goto L3d2
            goto L3d4
        L3d2:
            r1 = 0
            goto L3d5
        L3d4:
            r1 = 1
        L3d5:
            if (r4 <= 0) goto L3fa
            if (r1 == 0) goto L3fa
            r1 = 0
        L3da:
            if (r1 >= r0) goto L3fa
            java.lang.Object r3 = r14.get(r1)
            qk r3 = (defpackage.qk) r3
            if (r38 != 0) goto L3ee
            int r4 = r3.d()
            int r4 = r8 - r4
            r3.e(r4)
            goto L3f7
        L3ee:
            int r4 = r3.c()
            int r4 = r8 - r4
            r3.e(r4)
        L3f7:
            int r1 = r1 + 1
            goto L3da
        L3fa:
            r20 = r5
            r23 = r6
            r24 = r7
            r25 = r13
            r26 = r15
            r22 = r16
            r19 = r18
            r21 = r29
            r1 = 0
            r3 = 0
            r4 = 0
        L40d:
            if (r1 >= r0) goto L49d
            java.lang.Object r5 = r14.get(r1)
            qk r5 = (defpackage.qk) r5
            if (r38 != 0) goto L457
            int r6 = r0 + (-1)
            if (r1 >= r6) goto L42c
            int r6 = r1 + 1
            java.lang.Object r6 = r14.get(r6)
            qk r6 = (defpackage.qk) r6
            pc r6 = r6.b
            cc r6 = r6.y
            r22 = r6
            r26 = 0
            goto L432
        L42c:
            int r6 = r2.g0
            r26 = r6
            r22 = r16
        L432:
            pc r6 = r5.b
            cc r6 = r6.A
            r18 = r38
            r17 = r5
            r27 = r8
            r17.f(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r7 = r5.d()
            int r3 = java.lang.Math.max(r3, r7)
            int r5 = r5.c()
            int r5 = r5 + r4
            if (r1 <= 0) goto L451
            int r4 = r2.D0
            int r5 = r5 + r4
        L451:
            r4 = r5
            r20 = r6
            r24 = 0
            goto L497
        L457:
            r18 = r38
            int r6 = r0 + (-1)
            if (r1 >= r6) goto L46e
            int r6 = r1 + 1
            java.lang.Object r6 = r14.get(r6)
            qk r6 = (defpackage.qk) r6
            pc r6 = r6.b
            cc r6 = r6.x
            r21 = r6
            r25 = 0
            goto L474
        L46e:
            int r6 = r2.k0
            r25 = r6
            r21 = r29
        L474:
            pc r6 = r5.b
            cc r6 = r6.z
            r17 = r5
            r27 = r8
            r17.f(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r5 = r17.d()
            int r5 = r5 + r3
            int r3 = r17.c()
            int r3 = java.lang.Math.max(r4, r3)
            if (r1 <= 0) goto L491
            int r4 = r2.C0
            int r5 = r5 + r4
        L491:
            r4 = r3
            r3 = r5
            r19 = r6
            r23 = 0
        L497:
            int r1 = r1 + 1
            r38 = r18
            goto L40d
        L49d:
            r20 = 0
            r33[r20] = r3
            r28 = 1
            r33[r28] = r4
            goto L116
        L4a7:
            r34 = r1
            r32 = r5
            r8 = r6
            r33 = r7
            r35 = r13
            r30 = r18
            r31 = r19
            int r3 = r2.I0
            if (r15 != 0) goto L4ba
            goto L116
        L4ba:
            int r0 = r14.size()
            if (r0 != 0) goto L4d1
            qk r1 = new qk
            cc r4 = r2.x
            cc r5 = r2.y
            cc r6 = r2.z
            cc r7 = r2.A
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r14.add(r1)
            goto L512
        L4d1:
            r18 = r3
            r1 = 0
            java.lang.Object r0 = r14.get(r1)
            qk r0 = (defpackage.qk) r0
            r0.c = r1
            r5 = 0
            r0.b = r5
            r0.l = r1
            r0.m = r1
            r0.n = r1
            r0.o = r1
            r0.p = r1
            cc r1 = r2.x
            cc r3 = r2.y
            cc r4 = r2.z
            cc r5 = r2.A
            int r6 = r2.j0
            int r7 = r2.f0
            int r13 = r2.k0
            int r14 = r2.g0
            r17 = r0
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r27 = r8
            r25 = r13
            r26 = r14
            r17.f(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1 = r17
        L512:
            r0 = 0
        L513:
            if (r0 >= r15) goto L51d
            r3 = r34[r0]
            r1.a(r3)
            int r0 = r0 + 1
            goto L513
        L51d:
            int r0 = r1.d()
            r20 = 0
            r33[r20] = r0
            int r0 = r1.c()
            r28 = 1
            r33[r28] = r0
        L52d:
            r0 = r33[r20]
            int r0 = r0 + r35
            int r0 = r0 + r30
            r1 = r33[r28]
            int r1 = r1 + r31
            int r1 = r1 + r32
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r9 != r4) goto L540
            goto L54c
        L540:
            if (r9 != r3) goto L547
            int r10 = java.lang.Math.min(r0, r10)
            goto L54c
        L547:
            if (r9 != 0) goto L54b
            r10 = r0
            goto L54c
        L54b:
            r10 = 0
        L54c:
            if (r11 != r4) goto L54f
            goto L55b
        L54f:
            if (r11 != r3) goto L556
            int r12 = java.lang.Math.min(r1, r12)
            goto L55b
        L556:
            if (r11 != 0) goto L55a
            r12 = r1
            goto L55b
        L55a:
            r12 = 0
        L55b:
            r2.m0 = r10
            r2.n0 = r12
            r2.y(r10)
            r2.v(r12)
            int r0 = r2.e0
            if (r0 <= 0) goto L56c
            r13 = r28
            goto L56d
        L56c:
            r13 = 0
        L56d:
            r2.l0 = r13
        L56f:
            int r0 = r2.m0
            int r1 = r2.n0
            r2 = r36
            r2.setMeasuredDimension(r0, r1)
            return
        L579:
            r2 = r36
            r1 = r13
            r2.setMeasuredDimension(r1, r1)
            return
    }

    @Override // defpackage.ec, android.view.View
    public final void onMeasure(int r2, int r3) {
            r1 = this;
            rk r0 = r1.i
            r1.h(r0, r2, r3)
            return
    }

    public void setFirstHorizontalBias(float r2) {
            r1 = this;
            rk r0 = r1.i
            r0.y0 = r2
            r1.requestLayout()
            return
    }

    public void setFirstHorizontalStyle(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.s0 = r2
            r1.requestLayout()
            return
    }

    public void setFirstVerticalBias(float r2) {
            r1 = this;
            rk r0 = r1.i
            r0.z0 = r2
            r1.requestLayout()
            return
    }

    public void setFirstVerticalStyle(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.t0 = r2
            r1.requestLayout()
            return
    }

    public void setHorizontalAlign(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.E0 = r2
            r1.requestLayout()
            return
    }

    public void setHorizontalBias(float r2) {
            r1 = this;
            rk r0 = r1.i
            r0.w0 = r2
            r1.requestLayout()
            return
    }

    public void setHorizontalGap(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.C0 = r2
            r1.requestLayout()
            return
    }

    public void setHorizontalStyle(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.q0 = r2
            r1.requestLayout()
            return
    }

    public void setMaxElementsWrap(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.H0 = r2
            r1.requestLayout()
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.I0 = r2
            r1.requestLayout()
            return
    }

    public void setPadding(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.f0 = r2
            r0.g0 = r2
            r0.h0 = r2
            r0.i0 = r2
            r1.requestLayout()
            return
    }

    public void setPaddingBottom(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.g0 = r2
            r1.requestLayout()
            return
    }

    public void setPaddingLeft(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.j0 = r2
            r1.requestLayout()
            return
    }

    public void setPaddingRight(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.k0 = r2
            r1.requestLayout()
            return
    }

    public void setPaddingTop(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.f0 = r2
            r1.requestLayout()
            return
    }

    public void setVerticalAlign(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.F0 = r2
            r1.requestLayout()
            return
    }

    public void setVerticalBias(float r2) {
            r1 = this;
            rk r0 = r1.i
            r0.x0 = r2
            r1.requestLayout()
            return
    }

    public void setVerticalGap(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.D0 = r2
            r1.requestLayout()
            return
    }

    public void setVerticalStyle(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.r0 = r2
            r1.requestLayout()
            return
    }

    public void setWrapMode(int r2) {
            r1 = this;
            rk r0 = r1.i
            r0.G0 = r2
            r1.requestLayout()
            return
    }
}
