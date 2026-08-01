package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qc extends defpackage.pc {
    public java.util.ArrayList d0;
    public final defpackage.r5 e0;
    public final defpackage.ig f0;
    public defpackage.hc g0;
    public boolean h0;
    public final defpackage.ar i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public defpackage.u8[] n0;
    public defpackage.u8[] o0;
    public int p0;
    public boolean q0;
    public boolean r0;

    public qc() {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.d0 = r0
            r5 r0 = new r5
            r0.<init>(r3)
            r3.e0 = r0
            ig r0 = new ig
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
            k7 r2 = new k7
            r2.<init>()
            r0.g = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.h = r2
            r0.a = r3
            r0.d = r3
            r3.f0 = r0
            r3.g0 = r1
            r0 = 0
            r3.h0 = r0
            ar r1 = new ar
            r1.<init>()
            r3.i0 = r1
            r3.l0 = r0
            r3.m0 = r0
            r1 = 4
            u8[] r2 = new defpackage.u8[r1]
            r3.n0 = r2
            u8[] r1 = new defpackage.u8[r1]
            r3.o0 = r1
            r1 = 263(0x107, float:3.69E-43)
            r3.p0 = r1
            r3.q0 = r0
            r3.r0 = r0
            return
    }

    public final void B(defpackage.pc r6, int r7) {
            r5 = this;
            r0 = 1
            if (r7 != 0) goto L28
            int r7 = r5.l0
            int r7 = r7 + r0
            u8[] r1 = r5.o0
            int r2 = r1.length
            if (r7 < r2) goto L16
            int r7 = r1.length
            int r7 = r7 * 2
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r1, r7)
            u8[] r7 = (defpackage.u8[]) r7
            r5.o0 = r7
        L16:
            u8[] r7 = r5.o0
            int r1 = r5.l0
            u8 r2 = new u8
            r3 = 0
            boolean r4 = r5.h0
            r2.<init>(r6, r3, r4)
            r7[r1] = r2
            int r1 = r1 + r0
            r5.l0 = r1
            return
        L28:
            if (r7 != r0) goto L4d
            int r7 = r5.m0
            int r7 = r7 + r0
            u8[] r1 = r5.n0
            int r2 = r1.length
            if (r7 < r2) goto L3d
            int r7 = r1.length
            int r7 = r7 * 2
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r1, r7)
            u8[] r7 = (defpackage.u8[]) r7
            r5.n0 = r7
        L3d:
            u8[] r7 = r5.n0
            int r1 = r5.m0
            u8 r2 = new u8
            boolean r3 = r5.h0
            r2.<init>(r6, r0, r3)
            r7[r1] = r2
            int r1 = r1 + r0
            r5.m0 = r1
        L4d:
            return
    }

    public final void C(defpackage.ar r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            r18.a(r19)
            java.util.ArrayList r2 = r0.d0
            int r2 = r2.size()
            r3 = 0
            r4 = r3
            r5 = r4
        L10:
            r6 = 1
            if (r4 >= r2) goto L29
            java.util.ArrayList r7 = r0.d0
            java.lang.Object r7 = r7.get(r4)
            pc r7 = (defpackage.pc) r7
            boolean[] r8 = r7.H
            r8[r3] = r3
            r8[r6] = r3
            boolean r7 = r7 instanceof defpackage.e7
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
            java.util.ArrayList r7 = r0.d0
            java.lang.Object r7 = r7.get(r5)
            pc r7 = (defpackage.pc) r7
            boolean r8 = r7 instanceof defpackage.e7
            if (r8 == 0) goto L5e
            e7 r7 = (defpackage.e7) r7
            r8 = r3
        L3e:
            int r9 = r7.e0
            if (r8 >= r9) goto L5e
            pc[] r9 = r7.d0
            r9 = r9[r8]
            int r10 = r7.f0
            if (r10 == 0) goto L57
            if (r10 != r6) goto L4d
            goto L57
        L4d:
            if (r10 == r4) goto L52
            r11 = 3
            if (r10 != r11) goto L5b
        L52:
            boolean[] r9 = r9.H
            r9[r6] = r6
            goto L5b
        L57:
            boolean[] r9 = r9.H
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
            java.util.ArrayList r7 = r0.d0
            java.lang.Object r7 = r7.get(r5)
            pc r7 = (defpackage.pc) r7
            r7.getClass()
            boolean r8 = r7 instanceof defpackage.rk
            if (r8 != 0) goto L77
            boolean r8 = r7 instanceof defpackage.go
            if (r8 == 0) goto L7a
        L77:
            r7.a(r1)
        L7a:
            int r5 = r5 + 1
            goto L62
        L7d:
            r5 = r3
        L7e:
            if (r5 >= r2) goto L156
            java.util.ArrayList r7 = r0.d0
            java.lang.Object r7 = r7.get(r5)
            pc r7 = (defpackage.pc) r7
            boolean r8 = r7 instanceof defpackage.qc
            if (r8 == 0) goto Lad
            int[] r8 = r7.c0
            r9 = r8[r3]
            r8 = r8[r6]
            if (r9 != r4) goto L97
            r7.w(r6)
        L97:
            if (r8 != r4) goto L9c
            r7.x(r6)
        L9c:
            r7.a(r1)
            if (r9 != r4) goto La4
            r7.w(r9)
        La4:
            if (r8 != r4) goto La9
            r7.x(r8)
        La9:
            r16 = r6
            goto L14f
        Lad:
            r8 = -1
            r7.h = r8
            cc r9 = r7.B
            int[] r10 = r7.c0
            cc r11 = r7.A
            cc r12 = r7.y
            cc r13 = r7.z
            cc r14 = r7.x
            r7.i = r8
            int[] r8 = r0.c0
            r15 = r8[r3]
            r16 = r6
            r6 = 4
            if (r15 == r4) goto Lf8
            r15 = r10[r3]
            if (r15 != r6) goto Lf8
            int r15 = r14.e
            int r17 = r0.l()
            int r3 = r13.e
            int r3 = r17 - r3
            a40 r6 = r1.j(r14)
            r14.g = r6
            a40 r6 = r1.j(r13)
            r13.g = r6
            a40 r6 = r14.g
            r1.d(r6, r15)
            a40 r6 = r13.g
            r1.d(r6, r3)
            r7.h = r4
            r7.N = r15
            int r3 = r3 - r15
            r7.J = r3
            int r6 = r7.Q
            if (r3 >= r6) goto Lf8
            r7.J = r6
        Lf8:
            r3 = r8[r16]
            if (r3 == r4) goto L143
            r3 = r10[r16]
            r6 = 4
            if (r3 != r6) goto L143
            int r3 = r12.e
            int r6 = r0.i()
            int r8 = r11.e
            int r6 = r6 - r8
            a40 r8 = r1.j(r12)
            r12.g = r8
            a40 r8 = r1.j(r11)
            r11.g = r8
            a40 r8 = r12.g
            r1.d(r8, r3)
            a40 r8 = r11.g
            r1.d(r8, r6)
            int r8 = r7.P
            if (r8 > 0) goto L12a
            int r8 = r7.V
            r10 = 8
            if (r8 != r10) goto L136
        L12a:
            a40 r8 = r1.j(r9)
            r9.g = r8
            int r9 = r7.P
            int r9 = r9 + r3
            r1.d(r8, r9)
        L136:
            r7.i = r4
            r7.O = r3
            int r6 = r6 - r3
            r7.K = r6
            int r3 = r7.R
            if (r6 >= r3) goto L143
            r7.K = r3
        L143:
            boolean r3 = r7 instanceof defpackage.rk
            if (r3 != 0) goto L14f
            boolean r3 = r7 instanceof defpackage.go
            if (r3 == 0) goto L14c
            goto L14f
        L14c:
            r7.a(r1)
        L14f:
            int r5 = r5 + 1
            r6 = r16
            r3 = 0
            goto L7e
        L156:
            r16 = r6
            int r2 = r0.l0
            if (r2 <= 0) goto L160
            r2 = 0
            defpackage.a80.a(r0, r1, r2)
        L160:
            int r2 = r0.m0
            if (r2 <= 0) goto L169
            r2 = r16
            defpackage.a80.a(r0, r1, r2)
        L169:
            return
    }

    public final boolean D(int r20, boolean r21) {
            r19 = this;
            r0 = r20
            r1 = r19
            ig r2 = r1.f0
            java.util.ArrayList r3 = r2.e
            qc r4 = r2.a
            r5 = 0
            int r6 = r4.h(r5)
            int[] r7 = r4.c0
            m90 r8 = r4.e
            po r9 = r4.d
            r10 = 1
            int r11 = r4.h(r10)
            int r12 = r4.m()
            int r13 = r4.n()
            if (r21 == 0) goto L80
            r14 = 2
            if (r6 == r14) goto L29
            if (r11 != r14) goto L80
        L29:
            int r15 = r3.size()
        L2d:
            if (r5 >= r15) goto L48
            java.lang.Object r17 = r3.get(r5)
            int r5 = r5 + 1
            r10 = r17
            qb0 r10 = (defpackage.qb0) r10
            int r14 = r10.f
            if (r14 != r0) goto L45
            boolean r10 = r10.k()
            if (r10 != 0) goto L45
            r5 = 0
            goto L4a
        L45:
            r10 = 1
            r14 = 2
            goto L2d
        L48:
            r5 = r21
        L4a:
            if (r0 != 0) goto L67
            if (r5 == 0) goto L80
            r10 = 2
            if (r6 != r10) goto L80
            r14 = 1
            r4.w(r14)
            r5 = 0
            int r10 = r2.d(r4, r5)
            r4.y(r10)
            sg r5 = r9.e
            int r10 = r4.l()
            r5.d(r10)
            goto L80
        L67:
            r10 = 2
            r14 = 1
            if (r5 == 0) goto L80
            if (r11 != r10) goto L80
            r4.x(r14)
            int r5 = r2.d(r4, r14)
            r4.v(r5)
            sg r5 = r8.e
            int r10 = r4.i()
            r5.d(r10)
        L80:
            r5 = 4
            if (r0 != 0) goto La3
            r16 = 0
            r7 = r7[r16]
            r14 = 1
            if (r7 == r14) goto L8f
            if (r7 != r5) goto L8d
            goto L8f
        L8d:
            r14 = 1
            goto Lad
        L8f:
            int r5 = r4.l()
            int r5 = r5 + r12
            jg r7 = r9.i
            r7.d(r5)
            sg r7 = r9.e
            int r5 = r5 - r12
            r7.d(r5)
            r14 = 1
            r18 = 1
            goto Lc2
        La3:
            r14 = 1
            r16 = 0
            r7 = r7[r14]
            if (r7 == r14) goto Lb0
            if (r7 != r5) goto Lad
            goto Lb0
        Lad:
            r18 = r16
            goto Lc2
        Lb0:
            int r5 = r4.i()
            int r5 = r5 + r13
            jg r7 = r8.i
            r7.d(r5)
            sg r7 = r8.e
            int r5 = r5 - r13
            r7.d(r5)
            r18 = r14
        Lc2:
            r2.g()
            int r2 = r3.size()
            r5 = r16
        Lcb:
            if (r5 >= r2) goto Le7
            java.lang.Object r7 = r3.get(r5)
            int r5 = r5 + 1
            qb0 r7 = (defpackage.qb0) r7
            int r8 = r7.f
            if (r8 == r0) goto Lda
            goto Lcb
        Lda:
            pc r8 = r7.b
            if (r8 != r4) goto Le3
            boolean r8 = r7.g
            if (r8 != 0) goto Le3
            goto Lcb
        Le3:
            r7.e()
            goto Lcb
        Le7:
            int r2 = r3.size()
            r5 = r16
        Led:
            if (r5 >= r2) goto L11e
            java.lang.Object r7 = r3.get(r5)
            int r5 = r5 + 1
            qb0 r7 = (defpackage.qb0) r7
            int r8 = r7.f
            if (r8 == r0) goto Lfc
            goto Led
        Lfc:
            if (r18 != 0) goto L103
            pc r8 = r7.b
            if (r8 != r4) goto L103
            goto Led
        L103:
            jg r8 = r7.h
            boolean r8 = r8.j
            if (r8 != 0) goto L10c
        L109:
            r5 = r16
            goto L11f
        L10c:
            jg r8 = r7.i
            boolean r8 = r8.j
            if (r8 != 0) goto L113
            goto L109
        L113:
            boolean r8 = r7 instanceof defpackage.v8
            if (r8 != 0) goto Led
            sg r7 = r7.e
            boolean r7 = r7.j
            if (r7 != 0) goto Led
            goto L109
        L11e:
            r5 = r14
        L11f:
            r4.w(r6)
            r4.x(r11)
            return r5
    }

    public final void E() {
            r22 = this;
            r1 = r22
            boolean[] r2 = defpackage.a80.h
            r3 = 0
            r1.N = r3
            r1.O = r3
            int r0 = r1.l()
            int r4 = java.lang.Math.max(r3, r0)
            int r0 = r1.i()
            int r5 = java.lang.Math.max(r3, r0)
            r1.q0 = r3
            r1.r0 = r3
            int r0 = r1.p0
            r6 = r0 & 64
            r7 = 1
            r8 = 64
            if (r6 != r8) goto L27
            goto L2c
        L27:
            r6 = 128(0x80, float:1.8E-43)
            r0 = r0 & r6
            if (r0 != r6) goto L2e
        L2c:
            r0 = r7
            goto L2f
        L2e:
            r0 = r3
        L2f:
            ar r6 = r1.i0
            r6.getClass()
            r6.f = r3
            int r8 = r1.p0
            if (r8 == 0) goto L3e
            if (r0 == 0) goto L3e
            r6.f = r7
        L3e:
            int[] r8 = r1.c0
            r9 = r8[r7]
            r10 = r8[r3]
            java.util.ArrayList r11 = r1.d0
            r12 = 2
            if (r10 == r12) goto L4e
            if (r9 != r12) goto L4c
            goto L4e
        L4c:
            r13 = r3
            goto L4f
        L4e:
            r13 = r7
        L4f:
            r1.l0 = r3
            r1.m0 = r3
            int r14 = r11.size()
            r0 = r3
        L58:
            if (r0 >= r14) goto L72
            java.util.ArrayList r15 = r1.d0
            java.lang.Object r15 = r15.get(r0)
            pc r15 = (defpackage.pc) r15
            r16 = r7
            boolean r7 = r15 instanceof defpackage.qc
            if (r7 == 0) goto L6d
            qc r15 = (defpackage.qc) r15
            r15.E()
        L6d:
            int r0 = r0 + 1
            r7 = r16
            goto L58
        L72:
            r16 = r7
            r0 = r3
            r15 = r0
        L76:
            if (r7 == 0) goto L206
            r17 = r12
            int r12 = r0 + 1
            r6.r()     // Catch: java.lang.Exception -> Ldc
            r1.l0 = r3     // Catch: java.lang.Exception -> Ldc
            r1.m0 = r3     // Catch: java.lang.Exception -> Ldc
            r1.f(r6)     // Catch: java.lang.Exception -> Ldc
            r0 = r3
        L87:
            if (r0 >= r14) goto L9d
            r18 = r3
            java.util.ArrayList r3 = r1.d0     // Catch: java.lang.Exception -> L9b
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Exception -> L9b
            pc r3 = (defpackage.pc) r3     // Catch: java.lang.Exception -> L9b
            r3.f(r6)     // Catch: java.lang.Exception -> L9b
            int r0 = r0 + 1
            r3 = r18
            goto L87
        L9b:
            r0 = move-exception
            goto Ldf
        L9d:
            r18 = r3
            r1.C(r6)     // Catch: java.lang.Exception -> L9b
            zx r0 = r6.b     // Catch: java.lang.Exception -> Ld8
            boolean r3 = r6.f     // Catch: java.lang.Exception -> Ld8
            if (r3 == 0) goto Ld0
            r3 = r18
        Laa:
            int r7 = r6.i     // Catch: java.lang.Exception -> Ld8
            if (r3 >= r7) goto Lbd
            p6[] r7 = r6.e     // Catch: java.lang.Exception -> Ld8
            r7 = r7[r3]     // Catch: java.lang.Exception -> Ld8
            boolean r7 = r7.e     // Catch: java.lang.Exception -> Ld8
            if (r7 != 0) goto Lba
            r6.o(r0)     // Catch: java.lang.Exception -> Ld8
            goto Ld3
        Lba:
            int r3 = r3 + 1
            goto Laa
        Lbd:
            r0 = r18
        Lbf:
            int r3 = r6.i     // Catch: java.lang.Exception -> Ld8
            if (r0 >= r3) goto Ld3
            p6[] r3 = r6.e     // Catch: java.lang.Exception -> Ld8
            r3 = r3[r0]     // Catch: java.lang.Exception -> Ld8
            a40 r7 = r3.a     // Catch: java.lang.Exception -> Ld8
            float r3 = r3.b     // Catch: java.lang.Exception -> Ld8
            r7.e = r3     // Catch: java.lang.Exception -> Ld8
            int r0 = r0 + 1
            goto Lbf
        Ld0:
            r6.o(r0)     // Catch: java.lang.Exception -> Ld8
        Ld3:
            r19 = r2
            r20 = r16
            goto Lf9
        Ld8:
            r0 = move-exception
            r7 = r16
            goto Ldf
        Ldc:
            r0 = move-exception
            r18 = r3
        Ldf:
            r0.printStackTrace()
            java.io.PrintStream r3 = java.lang.System.out
            r19 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r20 = r7
            java.lang.String r7 = "EXCEPTION : "
            r2.<init>(r7)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.println(r0)
        Lf9:
            if (r20 == 0) goto L118
            r19[r17] = r18
            r1.A(r6)
            java.util.ArrayList r0 = r1.d0
            int r0 = r0.size()
            r2 = r18
        L108:
            if (r2 >= r0) goto L12d
            java.util.ArrayList r3 = r1.d0
            java.lang.Object r3 = r3.get(r2)
            pc r3 = (defpackage.pc) r3
            r3.A(r6)
            int r2 = r2 + 1
            goto L108
        L118:
            r1.A(r6)
            r0 = r18
        L11d:
            if (r0 >= r14) goto L12d
            java.util.ArrayList r2 = r1.d0
            java.lang.Object r2 = r2.get(r0)
            pc r2 = (defpackage.pc) r2
            r2.A(r6)
            int r0 = r0 + 1
            goto L11d
        L12d:
            if (r13 == 0) goto L193
            r0 = 8
            if (r12 >= r0) goto L193
            boolean r0 = r19[r17]
            if (r0 == 0) goto L193
            r0 = r18
            r2 = r0
            r3 = r2
        L13b:
            if (r0 >= r14) goto L161
            java.util.ArrayList r7 = r1.d0
            java.lang.Object r7 = r7.get(r0)
            pc r7 = (defpackage.pc) r7
            r20 = r0
            int r0 = r7.N
            int r21 = r7.l()
            int r0 = r21 + r0
            int r2 = java.lang.Math.max(r2, r0)
            int r0 = r7.O
            int r7 = r7.i()
            int r7 = r7 + r0
            int r3 = java.lang.Math.max(r3, r7)
            int r0 = r20 + 1
            goto L13b
        L161:
            int r0 = r1.Q
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r1.R
            int r2 = java.lang.Math.max(r2, r3)
            r3 = r17
            if (r10 != r3) goto L180
            int r7 = r1.l()
            if (r7 >= r0) goto L180
            r1.y(r0)
            r8[r18] = r3
            r0 = r16
            r15 = r0
            goto L182
        L180:
            r0 = r18
        L182:
            if (r9 != r3) goto L195
            int r7 = r1.i()
            if (r7 >= r2) goto L195
            r1.v(r2)
            r8[r16] = r3
            r0 = r16
            r15 = r0
            goto L195
        L193:
            r0 = r18
        L195:
            int r2 = r1.Q
            int r3 = r1.l()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.l()
            if (r2 <= r3) goto L1ad
            r1.y(r2)
            r8[r18] = r16
            r0 = r16
            r15 = r0
        L1ad:
            int r2 = r1.R
            int r3 = r1.i()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.i()
            if (r2 <= r3) goto L1c5
            r1.v(r2)
            r8[r16] = r16
            r0 = r16
            r15 = r0
        L1c5:
            if (r15 != 0) goto L1f9
            r2 = r8[r18]
            r3 = 2
            if (r2 != r3) goto L1e0
            if (r4 <= 0) goto L1e0
            int r2 = r1.l()
            if (r2 <= r4) goto L1e0
            r2 = r16
            r1.q0 = r2
            r8[r18] = r2
            r1.y(r4)
            r0 = r2
            r15 = r0
            goto L1e2
        L1e0:
            r2 = r16
        L1e2:
            r3 = r8[r2]
            r7 = 2
            if (r3 != r7) goto L1fa
            if (r5 <= 0) goto L1fa
            int r3 = r1.i()
            if (r3 <= r5) goto L1fa
            r1.r0 = r2
            r8[r2] = r2
            r1.v(r5)
            r0 = 1
            r15 = 1
            goto L1fa
        L1f9:
            r7 = 2
        L1fa:
            r2 = r7
            r7 = r0
            r0 = r12
            r12 = r2
            r3 = r18
            r2 = r19
            r16 = 1
            goto L76
        L206:
            r18 = r3
            r1.d0 = r11
            if (r15 == 0) goto L212
            r8[r18] = r10
            r16 = 1
            r8[r16] = r9
        L212:
            a8 r0 = r6.k
            r1.u(r0)
            return
    }

    @Override // defpackage.pc
    public final void s() {
            r1 = this;
            ar r0 = r1.i0
            r0.r()
            r0 = 0
            r1.j0 = r0
            r1.k0 = r0
            java.util.ArrayList r0 = r1.d0
            r0.clear()
            super.s()
            return
    }

    @Override // defpackage.pc
    public final void u(defpackage.a8 r4) {
            r3 = this;
            super.u(r4)
            java.util.ArrayList r0 = r3.d0
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList r2 = r3.d0
            java.lang.Object r2 = r2.get(r1)
            pc r2 = (defpackage.pc) r2
            r2.u(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // defpackage.pc
    public final void z(boolean r4, boolean r5) {
            r3 = this;
            super.z(r4, r5)
            java.util.ArrayList r0 = r3.d0
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList r2 = r3.d0
            java.lang.Object r2 = r2.get(r1)
            pc r2 = (defpackage.pc) r2
            r2.z(r4, r5)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }
}
