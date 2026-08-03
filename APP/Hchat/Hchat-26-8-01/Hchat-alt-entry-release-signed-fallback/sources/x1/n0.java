package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends v1.b1 implements v1.p0, x1.y0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x1.k0 f20994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fg.l f20995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x1.v1 f20996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v1.k0 f21000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m8.c f21001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f.k0 f21002t;

    public n0() {
            r2 = this;
            r2.<init>()
            v1.k0 r0 = new v1.k0
            r1 = 0
            r0.<init>(r2, r1)
            r2.f21000r = r0
            return
    }

    public static void d1(x1.i1 r1) {
            x1.i1 r0 = r1.f20944v
            x1.f0 r1 = r1.f20943u
            if (r0 == 0) goto L9
            x1.f0 r0 = r0.f20943u
            goto La
        L9:
            r0 = 0
        La:
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L1a
            x1.j0 r1 = r1.M
            x1.v0 r1 = r1.f20966p
            x1.g0 r1 = r1.D
            r1.f()
            return
        L1a:
            x1.j0 r1 = r1.M
            x1.v0 r1 = r1.f20966p
            x1.a r1 = r1.B()
            if (r1 == 0) goto L2d
            x1.v0 r1 = (x1.v0) r1
            x1.g0 r1 = r1.D
            if (r1 == 0) goto L2d
            r1.f()
        L2d:
            return
    }

    @Override // v1.p0
    public final v1.o0 D0(int r9, int r10, java.util.Map r11, fg.l r12, fg.l r13) {
            r8 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r9 & r0
            if (r1 != 0) goto La
            r0 = r0 & r10
            if (r0 != 0) goto La
            goto L28
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Size("
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = " x "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ") is out of range. Each dimension must be between 0 and 16777215."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            u1.a.b(r0)
        L28:
            x1.m0 r1 = new x1.m0
            r7 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    public final void J0(x1.f0 r32, v1.l r33) {
            r31 = this;
            r0 = r31
            r1 = r33
            f.k0 r2 = r0.f21002t
            r7 = 7
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r10 = 8
            if (r2 == 0) goto L108
            java.lang.Object[] r12 = r2.f2850c
            long[] r2 = r2.f2848a
            int r13 = r2.length
            int r13 = r13 + (-2)
            if (r13 < 0) goto L108
            r14 = 0
            r15 = 128(0x80, double:6.3E-322)
        L1c:
            r3 = r2[r14]
            r17 = 255(0xff, double:1.26E-321)
            long r5 = ~r3
            long r5 = r5 << r7
            long r5 = r5 & r3
            long r5 = r5 & r8
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 == 0) goto Lf0
            int r5 = r14 - r13
            int r5 = ~r5
            int r5 = r5 >>> 31
            int r5 = 8 - r5
            r6 = 0
        L30:
            if (r6 >= r5) goto Le4
            long r19 = r3 & r17
            int r19 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r19 >= 0) goto Lc6
            int r19 = r14 << 3
            int r19 = r19 + r6
            r19 = r12[r19]
            r20 = r7
            r7 = r19
            f.l0 r7 = (f.l0) r7
            r21 = r8
            java.lang.Object[] r8 = r7.f2856b
            long[] r9 = r7.f2855a
            int r11 = r9.length
            int r11 = r11 + (-2)
            if (r11 < 0) goto Lbb
            r23 = r15
            r15 = 0
            r16 = r10
        L54:
            r25 = r11
            r10 = r9[r15]
            r26 = r2
            r27 = r3
            long r2 = ~r10
            long r2 = r2 << r20
            long r2 = r2 & r10
            long r2 = r2 & r21
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto Lab
            int r2 = r15 - r25
            int r2 = ~r2
            int r2 = r2 >>> 31
            int r2 = 8 - r2
            r3 = 0
        L6e:
            if (r3 >= r2) goto La2
            long r29 = r10 & r17
            int r4 = (r29 > r23 ? 1 : (r29 == r23 ? 0 : -1))
            if (r4 >= 0) goto L97
            int r4 = r15 << 3
            int r4 = r4 + r3
            r29 = r8[r4]
            x1.g2 r29 = (x1.g2) r29
            java.lang.Object r29 = r29.get()
            x1.f0 r29 = (x1.f0) r29
            r30 = r3
            if (r29 == 0) goto L91
            boolean r3 = r29.G()
            r29 = r6
            r6 = 1
            if (r3 != r6) goto L93
            goto L9b
        L91:
            r29 = r6
        L93:
            r7.m(r4)
            goto L9b
        L97:
            r30 = r3
            r29 = r6
        L9b:
            long r10 = r10 >> r16
            int r3 = r30 + 1
            r6 = r29
            goto L6e
        La2:
            r29 = r6
            r3 = r16
            if (r2 != r3) goto Lc3
        La8:
            r11 = r25
            goto Lae
        Lab:
            r29 = r6
            goto La8
        Lae:
            if (r15 == r11) goto Lc3
            int r15 = r15 + 1
            r2 = r26
            r3 = r27
            r6 = r29
            r16 = 8
            goto L54
        Lbb:
            r26 = r2
            r27 = r3
            r29 = r6
            r23 = r15
        Lc3:
            r3 = 8
            goto Ld3
        Lc6:
            r26 = r2
            r27 = r3
            r29 = r6
            r20 = r7
            r21 = r8
            r23 = r15
            r3 = r10
        Ld3:
            long r6 = r27 >> r3
            int r2 = r29 + 1
            r10 = r3
            r3 = r6
            r7 = r20
            r8 = r21
            r15 = r23
            r6 = r2
            r2 = r26
            goto L30
        Le4:
            r26 = r2
            r20 = r7
            r21 = r8
            r3 = r10
            r23 = r15
            if (r5 != r3) goto L110
            goto Lf8
        Lf0:
            r26 = r2
            r20 = r7
            r21 = r8
            r23 = r15
        Lf8:
            if (r14 == r13) goto L110
            int r14 = r14 + 1
            r7 = r20
            r8 = r21
            r15 = r23
            r2 = r26
            r10 = 8
            goto L1c
        L108:
            r20 = r7
            r21 = r8
            r17 = 255(0xff, double:1.26E-321)
            r23 = 128(0x80, double:6.3E-322)
        L110:
            f.k0 r2 = r0.f21002t
            if (r2 == 0) goto L164
            long[] r3 = r2.f2848a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L164
            r5 = 0
        L11c:
            r6 = r3[r5]
            long r8 = ~r6
            long r8 = r8 << r20
            long r8 = r8 & r6
            long r8 = r8 & r21
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto L15d
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r16 = 8
            int r10 = 8 - r8
            r8 = 0
        L132:
            if (r8 >= r10) goto L158
            long r11 = r6 & r17
            int r9 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r9 >= 0) goto L152
            int r9 = r5 << 3
            int r9 = r9 + r8
            java.lang.Object[] r11 = r2.f2849b
            r11 = r11[r9]
            java.lang.Object[] r12 = r2.f2850c
            r12 = r12[r9]
            f.l0 r12 = (f.l0) r12
            v1.l r11 = (v1.l) r11
            boolean r11 = r12.g()
            if (r11 == 0) goto L152
            r2.l(r9)
        L152:
            r9 = 8
            long r6 = r6 >> r9
            int r8 = r8 + 1
            goto L132
        L158:
            r9 = 8
            if (r10 != r9) goto L164
            goto L15f
        L15d:
            r9 = 8
        L15f:
            if (r5 == r4) goto L164
            int r5 = r5 + 1
            goto L11c
        L164:
            f.k0 r2 = r0.f21002t
            if (r2 != 0) goto L16f
            f.k0 r2 = new f.k0
            r2.<init>()
            r0.f21002t = r2
        L16f:
            java.lang.Object r3 = r2.g(r1)
            if (r3 != 0) goto L17d
            f.l0 r3 = new f.l0
            r3.<init>()
            r2.m(r1, r3)
        L17d:
            f.l0 r3 = (f.l0) r3
            x1.g2 r1 = new x1.g2
            r2 = r32
            r1.<init>(r2)
            r3.k(r1)
            return
    }

    public abstract int K0(v1.j r1);

    public final void M0(x1.v1 r24, long r25, long r27) {
            r23 = this;
            r1 = r23
            f.k0 r7 = r1.f21002t
            m8.c r0 = r1.f21001s
            if (r0 != 0) goto Lf
            m8.c r0 = new m8.c
            r0.<init>()
            r1.f21001s = r0
        Lf:
            r8 = r0
            x1.f0 r0 = r1.Y0()
            x1.r1 r0 = r0.f20902t
            if (r0 == 0) goto L32
            y1.t r0 = (y1.t) r0
            x1.t1 r9 = r0.getSnapshotObserver()
            if (r9 == 0) goto L32
            x1.d r10 = x1.d.f20856i
            x1.l0 r0 = new x1.l0
            r6 = r24
            r2 = r25
            r4 = r27
            r0.<init>(r1, r2, r4, r6)
            w0.s r1 = r9.f21066a
            r1.c(r6, r10, r0)
        L32:
            boolean r0 = r23.u0()
            java.lang.Object r1 = r8.f8782e
            f.l0 r1 = (f.l0) r1
            java.lang.Object r2 = r8.f8783f
            f.l0 r2 = (f.l0) r2
            int r3 = r8.f8778a
            r5 = 0
        L41:
            if (r5 >= r3) goto L74
            java.lang.Object r6 = r8.f8781d
            byte[] r6 = (byte[]) r6
            r6 = r6[r5]
            r9 = 3
            if (r6 != r9) goto L59
            java.lang.Object r6 = r8.f8779b
            v1.l[] r6 = (v1.l[]) r6
            r6 = r6[r5]
            r6.getClass()
            r2.k(r6)
            goto L71
        L59:
            if (r6 == 0) goto L71
            if (r7 == 0) goto L71
            java.lang.Object r6 = r8.f8779b
            v1.l[] r6 = (v1.l[]) r6
            r6 = r6[r5]
            r6.getClass()
            java.lang.Object r6 = r7.k(r6)
            f.l0 r6 = (f.l0) r6
            if (r6 == 0) goto L71
            r1.j(r6)
        L71:
            int r5 = r5 + 1
            goto L41
        L74:
            int r3 = r8.f8778a
            r5 = 0
            r6 = 0
        L78:
            r7 = 2
            if (r5 >= r3) goto L97
            java.lang.Object r9 = r8.f8781d
            byte[] r9 = (byte[]) r9
            r10 = r9[r5]
            if (r10 != r7) goto L86
            int r6 = r6 + 1
            goto L92
        L86:
            if (r6 <= 0) goto L92
            int r10 = r5 - r6
            java.lang.Object r11 = r8.f8779b
            v1.l[] r11 = (v1.l[]) r11
            r12 = r11[r5]
            r11[r10] = r12
        L92:
            r9[r5] = r7
            int r5 = r5 + 1
            goto L78
        L97:
            int r3 = r8.f8778a
            int r5 = r3 - r6
        L9b:
            r9 = 0
            if (r5 >= r3) goto La7
            java.lang.Object r10 = r8.f8779b
            v1.l[] r10 = (v1.l[]) r10
            r10[r5] = r9
            int r5 = r5 + 1
            goto L9b
        La7:
            int r3 = r8.f8778a
            int r3 = r3 - r6
            r8.f8778a = r3
            x1.n0 r3 = r23.a1()
            java.lang.Object[] r5 = r2.f2856b
            long[] r6 = r2.f2855a
            int r8 = r6.length
            int r8 = r8 - r7
            r14 = 7
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r24 = r7
            r7 = 8
            if (r8 < 0) goto L15b
            r26 = 128(0x80, double:6.3E-322)
            r9 = 0
        Lc5:
            r10 = r6[r9]
            r17 = 255(0xff, double:1.26E-321)
            long r12 = ~r10
            long r12 = r12 << r14
            long r12 = r12 & r10
            long r12 = r12 & r15
            int r12 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r12 == 0) goto L147
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = 0
        Ld9:
            if (r13 >= r12) goto L13d
            long r19 = r10 & r17
            int r19 = (r19 > r26 ? 1 : (r19 == r26 ? 0 : -1))
            if (r19 >= 0) goto L128
            int r19 = r9 << 3
            int r19 = r19 + r13
            r19 = r5[r19]
            r28 = r14
            r14 = r19
            v1.l r14 = (v1.l) r14
            r19 = r15
            if (r3 != 0) goto Lf4
            r15 = r23
            goto Lf5
        Lf4:
            r15 = r3
        Lf5:
            r21 = r7
            r4 = r15
        Lf8:
            m8.c r7 = r4.f21001s
            if (r7 == 0) goto L10a
            java.lang.Object r7 = r7.f8779b
            v1.l[] r7 = (v1.l[]) r7
            boolean r7 = tf.l.m0(r7, r14)
            r22 = r0
            r0 = 1
            if (r7 != r0) goto L10c
            goto L112
        L10a:
            r22 = r0
        L10c:
            x1.n0 r0 = r4.a1()
            if (r0 != 0) goto L124
        L112:
            f.k0 r0 = r4.f21002t
            if (r0 == 0) goto L11d
            java.lang.Object r0 = r0.k(r14)
            f.l0 r0 = (f.l0) r0
            goto L11e
        L11d:
            r0 = 0
        L11e:
            if (r0 == 0) goto L130
            r15.e1(r0)
            goto L130
        L124:
            r4 = r0
            r0 = r22
            goto Lf8
        L128:
            r22 = r0
            r21 = r7
            r28 = r14
            r19 = r15
        L130:
            long r10 = r10 >> r21
            int r13 = r13 + 1
            r14 = r28
            r15 = r19
            r7 = r21
            r0 = r22
            goto Ld9
        L13d:
            r22 = r0
            r0 = r7
            r28 = r14
            r19 = r15
            if (r12 != r0) goto L165
            goto L14d
        L147:
            r22 = r0
            r28 = r14
            r19 = r15
        L14d:
            if (r9 == r8) goto L165
            int r9 = r9 + 1
            r14 = r28
            r15 = r19
            r0 = r22
            r7 = 8
            goto Lc5
        L15b:
            r22 = r0
            r28 = r14
            r19 = r15
            r26 = 128(0x80, double:6.3E-322)
            r17 = 255(0xff, double:1.26E-321)
        L165:
            r2.b()
            java.lang.Object[] r0 = r1.f2856b
            long[] r2 = r1.f2855a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L1c1
            r4 = 0
        L172:
            r5 = r2[r4]
            long r7 = ~r5
            long r7 = r7 << r28
            long r7 = r7 & r5
            long r7 = r7 & r19
            int r7 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r7 == 0) goto L1b9
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r21 = 8
            int r7 = 8 - r7
            r8 = 0
        L188:
            if (r8 >= r7) goto L1b3
            long r9 = r5 & r17
            int r9 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r9 >= 0) goto L1ad
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            x1.g2 r9 = (x1.g2) r9
            java.lang.Object r9 = r9.get()
            x1.f0 r9 = (x1.f0) r9
            if (r9 == 0) goto L1ad
            if (r22 == 0) goto L1a6
            r10 = 0
            r9.S(r10)
            goto L1aa
        L1a6:
            r10 = 0
            r9.U(r10)
        L1aa:
            r9 = 8
            goto L1af
        L1ad:
            r10 = 0
            goto L1aa
        L1af:
            long r5 = r5 >> r9
            int r8 = r8 + 1
            goto L188
        L1b3:
            r9 = 8
            r10 = 0
            if (r7 != r9) goto L1c1
            goto L1bc
        L1b9:
            r9 = 8
            r10 = 0
        L1bc:
            if (r4 == r3) goto L1c1
            int r4 = r4 + 1
            goto L172
        L1c1:
            r1.b()
            return
    }

    public final void N0(v1.o0 r15) {
            r14 = this;
            f.k0 r0 = r14.f21002t
            boolean r1 = r14.f20999q
            if (r1 == 0) goto L9
        L6:
            r1 = r14
            goto Lbe
        L9:
            fg.l r1 = r15.i()
            r2 = 0
            if (r1 != 0) goto L5a
            if (r0 == 0) goto L6
            java.lang.Object[] r15 = r0.f2850c
            long[] r1 = r0.f2848a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L56
            r4 = r2
        L1c:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L36:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            f.l0 r10 = (f.l0) r10
            r14.e1(r10)
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r3) goto L56
            int r4 = r4 + 1
            goto L1c
        L56:
            r0.a()
            return
        L5a:
            fg.l r0 = r14.f20995m
            r3 = 1
            if (r0 == r1) goto L61
            r0 = r3
            goto L62
        L61:
            r0 = r2
        L62:
            r4 = 0
            if (r0 != 0) goto L9b
            x1.k0 r1 = r14.c1()
            boolean r1 = r1.f20970g
            if (r1 == 0) goto L9b
            v1.t r0 = r14.T0()
            long r4 = r0.P(r4)
            long r4 = ig.a.W(r4)
            long r0 = r0.F()
            x1.k0 r6 = r14.c1()
            long r6 = r6.f20971h
            boolean r6 = u2.j.b(r4, r6)
            if (r6 == 0) goto L96
            x1.k0 r6 = r14.c1()
            long r6 = r6.f20972i
            boolean r6 = u2.l.a(r0, r6)
            if (r6 != 0) goto L97
        L96:
            r2 = r3
        L97:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La2
        L9b:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La2:
            if (r0 == 0) goto L6
            x1.v1 r0 = r14.f20996n
            if (r0 == 0) goto Lad
            r0.f21091g = r15
        Laa:
            r1 = r14
            r2 = r0
            goto Lb5
        Lad:
            x1.v1 r0 = new x1.v1
            r0.<init>(r15, r14)
            r14.f20996n = r0
            goto Laa
        Lb5:
            r1.M0(r2, r3, r5)
            fg.l r15 = r15.i()
            r1.f20995m = r15
        Lbe:
            return
    }

    public final int R0(v1.j r5) {
            r4 = this;
            boolean r0 = r4.X0()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L9
            goto Lf
        L9:
            int r5 = r4.K0(r5)
            if (r5 != r1) goto L10
        Lf:
            return r1
        L10:
            long r0 = r4.f13904k
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            int r5 = r5 + r0
            return r5
    }

    public abstract x1.n0 S0();

    public abstract v1.t T0();

    public abstract boolean X0();

    public abstract x1.f0 Y0();

    public abstract v1.o0 Z0();

    public abstract x1.n0 a1();

    public abstract long b1();

    public final x1.k0 c1() {
            r1 = this;
            x1.k0 r0 = r1.f20994l
            if (r0 != 0) goto Lb
            x1.k0 r0 = new x1.k0
            r0.<init>(r1)
            r1.f20994l = r0
        Lb:
            return r0
    }

    public final void e1(f.l0 r14) {
            r13 = this;
            java.lang.Object[] r0 = r14.f2856b
            long[] r14 = r14.f2855a
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L57
            r2 = 0
            r3 = r2
        Lb:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L52
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L50
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L4c
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            x1.g2 r9 = (x1.g2) r9
            java.lang.Object r9 = r9.get()
            x1.f0 r9 = (x1.f0) r9
            if (r9 == 0) goto L4c
            boolean r10 = r13.u0()
            if (r10 == 0) goto L49
            r9.S(r2)
            goto L4c
        L49:
            r9.U(r2)
        L4c:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L50:
            if (r6 != r7) goto L57
        L52:
            if (r3 == r1) goto L57
            int r3 = r3 + 1
            goto Lb
        L57:
            return
    }

    @Override // x1.y0
    public final void f0(boolean r5) {
            r4 = this;
            x1.n0 r0 = r4.a1()
            r1 = 0
            if (r0 == 0) goto Lc
            x1.f0 r0 = r0.Y0()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            x1.f0 r2 = r4.Y0()
            boolean r2 = gg.l.a(r0, r2)
            if (r2 == 0) goto L1a
            r4.f20997o = r5
            return
        L1a:
            if (r0 == 0) goto L21
            x1.j0 r2 = r0.M
            x1.b0 r2 = r2.f20954d
            goto L22
        L21:
            r2 = r1
        L22:
            x1.b0 r3 = x1.b0.f20835i
            if (r2 == r3) goto L32
            if (r0 == 0) goto L2c
            x1.j0 r0 = r0.M
            x1.b0 r1 = r0.f20954d
        L2c:
            x1.b0 r0 = x1.b0.f20836j
            if (r1 != r0) goto L31
            goto L32
        L31:
            return
        L32:
            r4.f20997o = r5
            return
    }

    public abstract void f1();

    @Override // v1.o
    public boolean u0() {
            r1 = this;
            r0 = 0
            return r0
    }
}
