package a;

/* JADX INFO: loaded from: classes.dex */
public final class O3 extends a.hh {
    public final a.C0114e2 f0;
    public final a.U4 g0;
    public a.C0114e2.b h0;
    public boolean i0;
    public final a.B9 j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public a.T2[] o0;
    public a.T2[] p0;
    public int q0;
    public boolean r0;
    public boolean s0;

    public O3() {
            r3 = this;
            r3.<init>()
            a.e2 r0 = new a.e2
            r0.<init>(r3)
            r3.f0 = r0
            a.U4 r0 = new a.U4
            r0.<init>()
            r1 = 1
            r0.b = r1
            r0.c = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.e = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1 = 0
            r0.f = r1
            a.e2$a r2 = new a.e2$a
            r2.<init>()
            r0.g = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.h = r2
            r0.f286a = r3
            r0.d = r3
            r3.g0 = r0
            r3.h0 = r1
            r0 = 0
            r3.i0 = r0
            a.B9 r1 = new a.B9
            r1.<init>()
            r3.j0 = r1
            r3.m0 = r0
            r3.n0 = r0
            r1 = 4
            a.T2[] r2 = new a.T2[r1]
            r3.o0 = r2
            a.T2[] r1 = new a.T2[r1]
            r3.p0 = r1
            r1 = 263(0x107, float:3.69E-43)
            r3.q0 = r1
            r3.r0 = r0
            r3.s0 = r0
            return
    }

    @Override // a.hh
    public final void B() {
            r21 = this;
            r1 = r21
            r2 = 0
            r1.P = r2
            r1.Q = r2
            int r0 = r1.l()
            int r3 = java.lang.Math.max(r2, r0)
            int r0 = r1.i()
            int r4 = java.lang.Math.max(r2, r0)
            r1.r0 = r2
            r1.s0 = r2
            int r0 = r1.q0
            r5 = r0 & 64
            r6 = 1
            r7 = 64
            if (r5 != r7) goto L26
            r5 = r6
            goto L27
        L26:
            r5 = r2
        L27:
            if (r5 != 0) goto L31
            r5 = 128(0x80, float:1.8E-43)
            r0 = r0 & r5
            if (r0 != r5) goto L2f
            goto L31
        L2f:
            r0 = r2
            goto L32
        L31:
            r0 = r6
        L32:
            a.B9 r5 = r1.j0
            r5.getClass()
            r5.f = r2
            int r7 = r1.q0
            if (r7 == 0) goto L41
            if (r0 == 0) goto L41
            r5.f = r6
        L41:
            a.N3$a[] r7 = r1.J
            r8 = r7[r6]
            r9 = r7[r2]
            java.util.ArrayList<a.N3> r10 = r1.e0
            a.N3$a r11 = a.N3.a.b
            if (r9 == r11) goto L52
            if (r8 != r11) goto L50
            goto L52
        L50:
            r12 = r2
            goto L53
        L52:
            r12 = r6
        L53:
            r1.m0 = r2
            r1.n0 = r2
            int r13 = r10.size()
            r0 = r2
        L5c:
            if (r0 >= r13) goto L72
            java.util.ArrayList<a.N3> r14 = r1.e0
            java.lang.Object r14 = r14.get(r0)
            a.N3 r14 = (a.N3) r14
            boolean r15 = r14 instanceof a.hh
            if (r15 == 0) goto L6f
            a.hh r14 = (a.hh) r14
            r14.B()
        L6f:
            int r0 = r0 + 1
            goto L5c
        L72:
            r0 = r2
            r15 = r0
            r14 = r6
        L75:
            if (r14 == 0) goto L204
            r16 = r6
            int r6 = r0 + 1
            r5.r()     // Catch: java.lang.Exception -> Ldd
            r1.m0 = r2     // Catch: java.lang.Exception -> Ldd
            r1.n0 = r2     // Catch: java.lang.Exception -> Ldd
            r1.f(r5)     // Catch: java.lang.Exception -> Ldd
            r0 = r2
        L86:
            if (r0 >= r13) goto L9c
            r17 = r2
            java.util.ArrayList<a.N3> r2 = r1.e0     // Catch: java.lang.Exception -> L9a
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> L9a
            a.N3 r2 = (a.N3) r2     // Catch: java.lang.Exception -> L9a
            r2.f(r5)     // Catch: java.lang.Exception -> L9a
            int r0 = r0 + 1
            r2 = r17
            goto L86
        L9a:
            r0 = move-exception
            goto Le0
        L9c:
            r17 = r2
            r1.D(r5)     // Catch: java.lang.Exception -> L9a
            a.Hc r0 = r5.b     // Catch: java.lang.Exception -> Ld9
            boolean r2 = r5.f     // Catch: java.lang.Exception -> Ld9
            if (r2 == 0) goto Lcf
            r2 = r17
        La9:
            int r14 = r5.i     // Catch: java.lang.Exception -> Ld9
            if (r2 >= r14) goto Lbc
            a.K1[] r14 = r5.e     // Catch: java.lang.Exception -> Ld9
            r14 = r14[r2]     // Catch: java.lang.Exception -> Ld9
            boolean r14 = r14.e     // Catch: java.lang.Exception -> Ld9
            if (r14 != 0) goto Lb9
            r5.o(r0)     // Catch: java.lang.Exception -> Ld9
            goto Ld2
        Lb9:
            int r2 = r2 + 1
            goto La9
        Lbc:
            r0 = r17
        Lbe:
            int r2 = r5.i     // Catch: java.lang.Exception -> Ld9
            if (r0 >= r2) goto Ld2
            a.K1[] r2 = r5.e     // Catch: java.lang.Exception -> Ld9
            r2 = r2[r0]     // Catch: java.lang.Exception -> Ld9
            a.le r14 = r2.f147a     // Catch: java.lang.Exception -> Ld9
            float r2 = r2.b     // Catch: java.lang.Exception -> Ld9
            r14.e = r2     // Catch: java.lang.Exception -> Ld9
            int r0 = r0 + 1
            goto Lbe
        Lcf:
            r5.o(r0)     // Catch: java.lang.Exception -> Ld9
        Ld2:
            r18 = r7
            r19 = r12
            r14 = r16
            goto Lfa
        Ld9:
            r0 = move-exception
            r14 = r16
            goto Le0
        Ldd:
            r0 = move-exception
            r17 = r2
        Le0:
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            r18 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r19 = r12
            java.lang.String r12 = "EXCEPTION : "
            r7.<init>(r12)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r2.println(r0)
        Lfa:
            boolean[] r0 = a.C0196ic.f510a
            r2 = 2
            if (r14 == 0) goto L11c
            r0[r2] = r17
            r1.A(r5)
            java.util.ArrayList<a.N3> r7 = r1.e0
            int r7 = r7.size()
            r12 = r17
        L10c:
            if (r12 >= r7) goto L131
            java.util.ArrayList<a.N3> r14 = r1.e0
            java.lang.Object r14 = r14.get(r12)
            a.N3 r14 = (a.N3) r14
            r14.A(r5)
            int r12 = r12 + 1
            goto L10c
        L11c:
            r1.A(r5)
            r7 = r17
        L121:
            if (r7 >= r13) goto L131
            java.util.ArrayList<a.N3> r12 = r1.e0
            java.lang.Object r12 = r12.get(r7)
            a.N3 r12 = (a.N3) r12
            r12.A(r5)
            int r7 = r7 + 1
            goto L121
        L131:
            if (r19 == 0) goto L193
            r7 = 8
            if (r6 >= r7) goto L193
            boolean r0 = r0[r2]
            if (r0 == 0) goto L193
            r0 = r17
            r2 = r0
            r7 = r2
        L13f:
            if (r0 >= r13) goto L163
            java.util.ArrayList<a.N3> r12 = r1.e0
            java.lang.Object r12 = r12.get(r0)
            a.N3 r12 = (a.N3) r12
            int r14 = r12.P
            int r20 = r12.l()
            int r14 = r20 + r14
            int r2 = java.lang.Math.max(r2, r14)
            int r14 = r12.Q
            int r12 = r12.i()
            int r12 = r12 + r14
            int r7 = java.lang.Math.max(r7, r12)
            int r0 = r0 + 1
            goto L13f
        L163:
            int r0 = r1.S
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r1.T
            int r2 = java.lang.Math.max(r2, r7)
            if (r9 != r11) goto L180
            int r7 = r1.l()
            if (r7 >= r0) goto L180
            r1.y(r0)
            r18[r17] = r11
            r0 = r16
            r15 = r0
            goto L182
        L180:
            r0 = r17
        L182:
            if (r8 != r11) goto L195
            int r7 = r1.i()
            if (r7 >= r2) goto L195
            r1.v(r2)
            r18[r16] = r11
            r0 = r16
            r15 = r0
            goto L195
        L193:
            r0 = r17
        L195:
            int r2 = r1.S
            int r7 = r1.l()
            int r2 = java.lang.Math.max(r2, r7)
            int r7 = r1.l()
            a.N3$a r12 = a.N3.a.f181a
            if (r2 <= r7) goto L1af
            r1.y(r2)
            r18[r17] = r12
            r0 = r16
            r15 = r0
        L1af:
            int r2 = r1.T
            int r7 = r1.i()
            int r2 = java.lang.Math.max(r2, r7)
            int r7 = r1.i()
            if (r2 <= r7) goto L1c7
            r1.v(r2)
            r18[r16] = r12
            r0 = r16
            r15 = r0
        L1c7:
            if (r15 != 0) goto L1f9
            r2 = r18[r17]
            if (r2 != r11) goto L1e1
            if (r3 <= 0) goto L1e1
            int r2 = r1.l()
            if (r2 <= r3) goto L1e1
            r2 = r16
            r1.r0 = r2
            r18[r17] = r12
            r1.y(r3)
            r0 = r2
            r15 = r0
            goto L1e3
        L1e1:
            r2 = r16
        L1e3:
            r7 = r18[r2]
            if (r7 != r11) goto L1f9
            if (r4 <= 0) goto L1f9
            int r7 = r1.i()
            if (r7 <= r4) goto L1f9
            r1.s0 = r2
            r18[r2] = r12
            r1.v(r4)
            r14 = 1
            r15 = 1
            goto L1fa
        L1f9:
            r14 = r0
        L1fa:
            r0 = r6
            r2 = r17
            r7 = r18
            r12 = r19
            r6 = 1
            goto L75
        L204:
            r17 = r2
            r18 = r7
            r1.e0 = r10
            if (r15 == 0) goto L212
            r18[r17] = r9
            r16 = 1
            r18[r16] = r8
        L212:
            a.A2 r0 = r5.k
            r1.u(r0)
            return
    }

    public final void C(a.N3 r6, int r7) {
            r5 = this;
            r0 = 1
            if (r7 != 0) goto L28
            int r7 = r5.m0
            int r7 = r7 + r0
            a.T2[] r1 = r5.p0
            int r2 = r1.length
            if (r7 < r2) goto L16
            int r7 = r1.length
            int r7 = r7 * 2
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r1, r7)
            a.T2[] r7 = (a.T2[]) r7
            r5.p0 = r7
        L16:
            a.T2[] r7 = r5.p0
            int r1 = r5.m0
            a.T2 r2 = new a.T2
            boolean r3 = r5.i0
            r4 = 0
            r2.<init>(r6, r4, r3)
            r7[r1] = r2
            int r1 = r1 + r0
            r5.m0 = r1
            return
        L28:
            if (r7 != r0) goto L4d
            int r7 = r5.n0
            int r7 = r7 + r0
            a.T2[] r1 = r5.o0
            int r2 = r1.length
            if (r7 < r2) goto L3d
            int r7 = r1.length
            int r7 = r7 * 2
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r1, r7)
            a.T2[] r7 = (a.T2[]) r7
            r5.o0 = r7
        L3d:
            a.T2[] r7 = r5.o0
            int r1 = r5.n0
            a.T2 r2 = new a.T2
            boolean r3 = r5.i0
            r2.<init>(r6, r0, r3)
            r7[r1] = r2
            int r1 = r1 + r0
            r5.n0 = r1
        L4d:
            return
    }

    public final void D(a.B9 r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r17.a(r18)
            java.util.ArrayList<a.N3> r2 = r0.e0
            int r2 = r2.size()
            r3 = 0
            r4 = r3
            r5 = r4
        L10:
            r6 = 1
            if (r4 >= r2) goto L29
            java.util.ArrayList<a.N3> r7 = r0.e0
            java.lang.Object r7 = r7.get(r4)
            a.N3 r7 = (a.N3) r7
            boolean[] r8 = r7.I
            r8[r3] = r3
            r8[r6] = r3
            boolean r7 = r7 instanceof a.V1
            if (r7 == 0) goto L26
            r5 = r6
        L26:
            int r4 = r4 + 1
            goto L10
        L29:
            r4 = 2
            if (r5 == 0) goto L61
            r5 = r3
        L2d:
            if (r5 >= r2) goto L61
            java.util.ArrayList<a.N3> r7 = r0.e0
            java.lang.Object r7 = r7.get(r5)
            a.N3 r7 = (a.N3) r7
            boolean r8 = r7 instanceof a.V1
            if (r8 == 0) goto L5e
            a.V1 r7 = (a.V1) r7
            r8 = r3
        L3e:
            int r9 = r7.f0
            if (r8 >= r9) goto L5e
            a.N3[] r9 = r7.e0
            r9 = r9[r8]
            int r10 = r7.g0
            if (r10 == 0) goto L57
            if (r10 != r6) goto L4d
            goto L57
        L4d:
            if (r10 == r4) goto L52
            r11 = 3
            if (r10 != r11) goto L5b
        L52:
            boolean[] r9 = r9.I
            r9[r6] = r6
            goto L5b
        L57:
            boolean[] r9 = r9.I
            r9[r3] = r6
        L5b:
            int r8 = r8 + 1
            goto L3e
        L5e:
            int r5 = r5 + 1
            goto L2d
        L61:
            r5 = r3
        L62:
            if (r5 >= r2) goto L7d
            java.util.ArrayList<a.N3> r7 = r0.e0
            java.lang.Object r7 = r7.get(r5)
            a.N3 r7 = (a.N3) r7
            r7.getClass()
            boolean r8 = r7 instanceof a.Yg
            if (r8 != 0) goto L77
            boolean r8 = r7 instanceof a.C0046a8
            if (r8 == 0) goto L7a
        L77:
            r7.a(r1)
        L7a:
            int r5 = r5 + 1
            goto L62
        L7d:
            r5 = r3
        L7e:
            if (r5 >= r2) goto L15b
            java.util.ArrayList<a.N3> r7 = r0.e0
            java.lang.Object r7 = r7.get(r5)
            a.N3 r7 = (a.N3) r7
            boolean r8 = r7 instanceof a.O3
            a.N3$a r9 = a.N3.a.b
            if (r8 == 0) goto Lb1
            a.N3$a[] r8 = r7.J
            r10 = r8[r3]
            r8 = r8[r6]
            a.N3$a r11 = a.N3.a.f181a
            if (r10 != r9) goto L9b
            r7.w(r11)
        L9b:
            if (r8 != r9) goto La0
            r7.x(r11)
        La0:
            r7.a(r1)
            if (r10 != r9) goto La8
            r7.w(r10)
        La8:
            if (r8 != r9) goto Lad
            r7.x(r8)
        Lad:
            r16 = r6
            goto L155
        Lb1:
            r8 = -1
            r7.h = r8
            r7.i = r8
            a.N3$a[] r8 = r0.J
            r10 = r8[r3]
            a.N3$a r11 = a.N3.a.d
            a.N3$a[] r12 = r7.J
            if (r10 == r9) goto Lf7
            r10 = r12[r3]
            if (r10 != r11) goto Lf7
            a.M3 r10 = r7.y
            int r13 = r10.e
            int r14 = r0.l()
            a.M3 r15 = r7.A
            r16 = r6
            int r6 = r15.e
            int r14 = r14 - r6
            a.le r6 = r1.j(r10)
            r10.g = r6
            a.le r6 = r1.j(r15)
            r15.g = r6
            a.le r6 = r10.g
            r1.d(r6, r13)
            a.le r6 = r15.g
            r1.d(r6, r14)
            r7.h = r4
            r7.P = r13
            int r14 = r14 - r13
            r7.L = r14
            int r6 = r7.S
            if (r14 >= r6) goto Lf9
            r7.L = r6
            goto Lf9
        Lf7:
            r16 = r6
        Lf9:
            r6 = r8[r16]
            if (r6 == r9) goto L149
            r6 = r12[r16]
            if (r6 != r11) goto L149
            a.M3 r6 = r7.z
            int r8 = r6.e
            int r9 = r0.i()
            a.M3 r10 = r7.B
            int r11 = r10.e
            int r9 = r9 - r11
            a.le r11 = r1.j(r6)
            r6.g = r11
            a.le r11 = r1.j(r10)
            r10.g = r11
            a.le r6 = r6.g
            r1.d(r6, r8)
            a.le r6 = r10.g
            r1.d(r6, r9)
            int r6 = r7.R
            if (r6 > 0) goto L12e
            int r6 = r7.X
            r10 = 8
            if (r6 != r10) goto L13c
        L12e:
            a.M3 r6 = r7.C
            a.le r10 = r1.j(r6)
            r6.g = r10
            int r6 = r7.R
            int r6 = r6 + r8
            r1.d(r10, r6)
        L13c:
            r7.i = r4
            r7.Q = r8
            int r9 = r9 - r8
            r7.M = r9
            int r6 = r7.T
            if (r9 >= r6) goto L149
            r7.M = r6
        L149:
            boolean r6 = r7 instanceof a.Yg
            if (r6 != 0) goto L155
            boolean r6 = r7 instanceof a.C0046a8
            if (r6 == 0) goto L152
            goto L155
        L152:
            r7.a(r1)
        L155:
            int r5 = r5 + 1
            r6 = r16
            goto L7e
        L15b:
            r16 = r6
            int r2 = r0.m0
            if (r2 <= 0) goto L164
            a.S2.a(r0, r1, r3)
        L164:
            int r2 = r0.n0
            if (r2 <= 0) goto L16d
            r2 = r16
            a.S2.a(r0, r1, r2)
        L16d:
            return
    }

    public final boolean E(int r19, boolean r20) {
            r18 = this;
            r0 = r19
            r1 = r18
            a.U4 r2 = r1.g0
            a.O3 r3 = r2.f286a
            r4 = 0
            a.N3$a r5 = r3.h(r4)
            r6 = 1
            a.N3$a r7 = r3.h(r6)
            int r8 = r3.m()
            int r9 = r3.n()
            java.util.ArrayList<a.ih> r10 = r2.e
            a.N3$a r11 = a.N3.a.f181a
            a.og r12 = r3.e
            a.K8 r13 = r3.d
            if (r20 == 0) goto L80
            a.N3$a r14 = a.N3.a.b
            if (r5 == r14) goto L2a
            if (r7 != r14) goto L80
        L2a:
            java.util.Iterator r15 = r10.iterator()
        L2e:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L4b
            java.lang.Object r16 = r15.next()
            r6 = r16
            a.ih r6 = (a.ih) r6
            int r4 = r6.f
            if (r4 != r0) goto L48
            boolean r4 = r6.k()
            if (r4 != 0) goto L48
            r4 = 0
            goto L4d
        L48:
            r4 = 0
            r6 = 1
            goto L2e
        L4b:
            r4 = r20
        L4d:
            if (r0 != 0) goto L68
            if (r4 == 0) goto L80
            if (r5 != r14) goto L80
            r3.w(r11)
            r4 = 0
            int r6 = r2.d(r3, r4)
            r3.y(r6)
            a.l5 r4 = r13.e
            int r6 = r3.l()
            r4.d(r6)
            goto L80
        L68:
            if (r4 == 0) goto L80
            if (r7 != r14) goto L80
            r3.x(r11)
            r4 = 1
            int r6 = r2.d(r3, r4)
            r3.v(r6)
            a.l5 r4 = r12.e
            int r6 = r3.i()
            r4.d(r6)
        L80:
            a.N3$a r4 = a.N3.a.d
            a.N3$a[] r6 = r3.J
            if (r0 != 0) goto La6
            r16 = 0
            r6 = r6[r16]
            if (r6 == r11) goto L92
            if (r6 != r4) goto L8f
            goto L92
        L8f:
            r17 = 1
            goto Lb1
        L92:
            int r4 = r3.l()
            int r4 = r4 + r8
            a.V4 r6 = r13.i
            r6.d(r4)
            a.l5 r6 = r13.e
            int r4 = r4 - r8
            r6.d(r4)
            r4 = 1
            r17 = 1
            goto Lc6
        La6:
            r16 = 0
            r17 = 1
            r6 = r6[r17]
            if (r6 == r11) goto Lb4
            if (r6 != r4) goto Lb1
            goto Lb4
        Lb1:
            r4 = r16
            goto Lc6
        Lb4:
            int r4 = r3.i()
            int r4 = r4 + r9
            a.V4 r6 = r12.i
            r6.d(r4)
            a.l5 r6 = r12.e
            int r4 = r4 - r9
            r6.d(r4)
            r4 = r17
        Lc6:
            r2.g()
            java.util.Iterator r2 = r10.iterator()
        Lcd:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto Leb
            java.lang.Object r6 = r2.next()
            a.ih r6 = (a.ih) r6
            int r8 = r6.f
            if (r8 == r0) goto Lde
            goto Lcd
        Lde:
            a.N3 r8 = r6.b
            if (r8 != r3) goto Le7
            boolean r8 = r6.g
            if (r8 != 0) goto Le7
            goto Lcd
        Le7:
            r6.e()
            goto Lcd
        Leb:
            java.util.Iterator r2 = r10.iterator()
        Lef:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L122
            java.lang.Object r6 = r2.next()
            a.ih r6 = (a.ih) r6
            int r8 = r6.f
            if (r8 == r0) goto L100
            goto Lef
        L100:
            if (r4 != 0) goto L107
            a.N3 r8 = r6.b
            if (r8 != r3) goto L107
            goto Lef
        L107:
            a.V4 r8 = r6.h
            boolean r8 = r8.j
            if (r8 != 0) goto L110
        L10d:
            r4 = r16
            goto L124
        L110:
            a.V4 r8 = r6.i
            boolean r8 = r8.j
            if (r8 != 0) goto L117
            goto L10d
        L117:
            boolean r8 = r6 instanceof a.U2
            if (r8 != 0) goto Lef
            a.l5 r6 = r6.e
            boolean r6 = r6.j
            if (r6 != 0) goto Lef
            goto L10d
        L122:
            r4 = r17
        L124:
            r3.w(r5)
            r3.x(r7)
            return r4
    }

    @Override // a.hh, a.N3
    public final void s() {
            r1 = this;
            a.B9 r0 = r1.j0
            r0.r()
            r0 = 0
            r1.k0 = r0
            r1.l0 = r0
            super.s()
            return
    }

    @Override // a.N3
    public final void z(boolean r4, boolean r5) {
            r3 = this;
            super.z(r4, r5)
            java.util.ArrayList<a.N3> r0 = r3.e0
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<a.N3> r2 = r3.e0
            java.lang.Object r2 = r2.get(r1)
            a.N3 r2 = (a.N3) r2
            r2.z(r4, r5)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }
}
