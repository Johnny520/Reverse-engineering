package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends s1.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0.n f12245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a5.a f12246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.p f12247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x1.i1 f12248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s1.k f12249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12252j;

    public i(y0.n r3) {
            r2 = this;
            r2.<init>()
            r2.f12245c = r3
            a5.a r3 = new a5.a
            r0 = 10
            r1 = 0
            r3.<init>(r1, r0)
            r0 = 2
            long[] r1 = new long[r0]
            r3.f57i = r1
            r2.f12246d = r3
            f.p r3 = new f.p
            r3.<init>(r0)
            r2.f12247e = r3
            r3 = 1
            r2.f12251i = r3
            r2.f12252j = r3
            return
    }

    @Override // s1.j
    public final boolean a(f.p r57, v1.t r58, h0.q0 r59, boolean r60) {
            r56 = this;
            r0 = r56
            r1 = r57
            r2 = r58
            r3 = r59
            boolean r4 = super.a(r57, r58, r59, r60)
            y0.n r5 = r0.f12245c
            boolean r6 = r5.f21832t
            r7 = 1
            if (r6 != 0) goto L14
            goto L63
        L14:
            r8 = 0
        L15:
            if (r5 == 0) goto L5f
            boolean r10 = r5 instanceof x1.w1
            r11 = 16
            if (r10 == 0) goto L26
            x1.w1 r5 = (x1.w1) r5
            x1.i1 r5 = x1.k.t(r5, r11)
            r0.f12248f = r5
            goto L5a
        L26:
            int r10 = r5.f21821i
            r10 = r10 & r11
            if (r10 == 0) goto L5a
            boolean r10 = r5 instanceof x1.j
            if (r10 == 0) goto L5a
            r10 = r5
            x1.j r10 = (x1.j) r10
            y0.n r10 = r10.f20950v
            r9 = 0
        L35:
            if (r10 == 0) goto L57
            int r12 = r10.f21821i
            r12 = r12 & r11
            if (r12 == 0) goto L54
            int r9 = r9 + 1
            if (r9 != r7) goto L42
            r5 = r10
            goto L54
        L42:
            if (r8 != 0) goto L4b
            j0.b r8 = new j0.b
            y0.n[] r12 = new y0.n[r11]
            r8.<init>(r12)
        L4b:
            if (r5 == 0) goto L51
            r8.b(r5)
            r5 = 0
        L51:
            r8.b(r10)
        L54:
            y0.n r10 = r10.f21824l
            goto L35
        L57:
            if (r9 != r7) goto L5a
            goto L15
        L5a:
            y0.n r5 = x1.k.e(r8)
            goto L15
        L5f:
            x1.i1 r5 = r0.f12248f
            if (r5 != 0) goto L64
        L63:
            return r7
        L64:
            int r5 = r1.d()
            r8 = 0
        L69:
            a5.a r10 = r0.f12246d
            f.p r11 = r0.f12247e
            if (r8 >= r5) goto L1af
            long r12 = r1.a(r8)
            java.lang.Object r14 = r1.e(r8)
            s1.t r14 = (s1.t) r14
            boolean r10 = r10.e(r12)
            if (r10 == 0) goto L199
            r15 = r7
            r16 = 0
            long r6 = r14.f12297g
            java.util.ArrayList r10 = r14.f12303m
            r17 = r10
            long r9 = r14.f12293c
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r20 = r6 & r18
            r22 = 36028792732385279(0x7fffff007fffff, double:2.848093183464406E-306)
            long r20 = r20 + r22
            r24 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r20 = r20 & r24
            r26 = 0
            int r20 = (r20 > r26 ? 1 : (r20 == r26 ? 0 : -1))
            if (r20 != 0) goto L190
            long r20 = r9 & r18
            long r20 = r20 + r22
            long r20 = r20 & r24
            int r20 = (r20 > r26 ? 1 : (r20 == r26 ? 0 : -1))
            if (r20 != 0) goto L190
            r20 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            tf.t r21 = tf.t.f13167g
            if (r17 != 0) goto Lbc
            r28 = r21
        Lb9:
            r51 = r4
            goto Lbf
        Lbc:
            r28 = r17
            goto Lb9
        Lbf:
            int r4 = r28.size()
            r15.<init>(r4)
            if (r17 != 0) goto Lcd
            r4 = r21
        Lca:
            r17 = r5
            goto Ld0
        Lcd:
            r4 = r17
            goto Lca
        Ld0:
            int r5 = r4.size()
            r21 = r8
            r8 = 0
        Ld7:
            if (r8 >= r5) goto L12c
            java.lang.Object r28 = r4.get(r8)
            r29 = r4
            r4 = r28
            s1.c r4 = (s1.c) r4
            r52 = r11
            r53 = r12
            long r11 = r4.f12211b
            long r30 = r11 & r18
            long r30 = r30 + r22
            long r30 = r30 & r24
            int r13 = (r30 > r26 ? 1 : (r30 == r26 ? 0 : -1))
            if (r13 != 0) goto L11b
            s1.c r30 = new s1.c
            r55 = r14
            long r13 = r4.f12210a
            r28 = r5
            x1.i1 r5 = r0.f12248f
            r5.getClass()
            long r33 = r5.W(r2, r11)
            float r5 = r4.f12212c
            long r11 = r4.f12213d
            r35 = r5
            long r4 = r4.f12214e
            r38 = r4
            r36 = r11
            r31 = r13
            r30.<init>(r31, r33, r35, r36, r38)
            r4 = r30
            r15.add(r4)
            goto L11f
        L11b:
            r28 = r5
            r55 = r14
        L11f:
            int r8 = r8 + 1
            r5 = r28
            r4 = r29
            r11 = r52
            r12 = r53
            r14 = r55
            goto Ld7
        L12c:
            r52 = r11
            r53 = r12
            r55 = r14
            x1.i1 r4 = r0.f12248f
            r4.getClass()
            long r39 = r4.W(r2, r6)
            x1.i1 r4 = r0.f12248f
            r4.getClass()
            long r33 = r4.W(r2, r9)
            long r4 = r14.f12291a
            long r6 = r14.f12292b
            boolean r8 = r14.f12294d
            long r9 = r14.f12296f
            boolean r11 = r14.f12298h
            int r12 = r14.f12299i
            r29 = r4
            long r4 = r14.f12300j
            float r13 = r14.f12295e
            s1.t r28 = new s1.t
            float r2 = r14.f12301k
            r44 = r4
            long r4 = r14.f12302l
            r47 = r4
            long r4 = r14.f12304n
            r46 = r2
            r49 = r4
            r31 = r6
            r35 = r8
            r37 = r9
            r41 = r11
            r42 = r12
            r36 = r13
            r43 = r15
            r28.<init>(r29, r31, r33, r35, r36, r37, r39, r41, r42, r43, r44, r46, r47, r49)
            r2 = r28
            s1.t r4 = r14.f12307q
            if (r4 != 0) goto L17e
            r4 = r14
        L17e:
            r2.f12307q = r4
            s1.t r4 = r14.f12307q
            if (r4 != 0) goto L185
            goto L186
        L185:
            r14 = r4
        L186:
            r2.f12307q = r14
            r6 = r52
            r4 = r53
            r6.b(r2, r4)
            goto L1a3
        L190:
            r51 = r4
            r17 = r5
            r21 = r8
            r20 = r15
            goto L1a3
        L199:
            r51 = r4
            r17 = r5
            r20 = r7
            r21 = r8
            r16 = 0
        L1a3:
            int r8 = r21 + 1
            r2 = r58
            r5 = r17
            r7 = r20
            r4 = r51
            goto L69
        L1af:
            r51 = r4
            r20 = r7
            r6 = r11
            r16 = 0
            int r2 = r6.d()
            if (r2 != 0) goto L1c5
            r2 = 0
            r10.f56h = r2
            j0.b r1 = r0.f12257a
            r1.g()
            return r20
        L1c5:
            int r2 = r10.f56h
            int r2 = r2 + (-1)
        L1c9:
            r4 = -1
            if (r4 >= r2) goto L222
            java.lang.Object r5 = r10.f57i
            long[] r5 = (long[]) r5
            r7 = r5[r2]
            boolean r5 = r1.f2878g
            if (r5 == 0) goto L1fa
            int r5 = r1.f2881j
            long[] r9 = r1.f2879h
            java.lang.Object[] r11 = r1.f2880i
            r12 = 0
            r13 = 0
        L1de:
            if (r13 >= r5) goto L1f5
            r14 = r11[r13]
            java.lang.Object r15 = f.q.f2884a
            if (r14 == r15) goto L1f2
            if (r13 == r12) goto L1f0
            r17 = r9[r13]
            r9[r12] = r17
            r11[r12] = r14
            r11[r13] = r16
        L1f0:
            int r12 = r12 + 1
        L1f2:
            int r13 = r13 + 1
            goto L1de
        L1f5:
            r13 = 0
            r1.f2878g = r13
            r1.f2881j = r12
        L1fa:
            long[] r5 = r1.f2879h
            int r9 = r1.f2881j
            int r5 = g.a.b(r5, r9, r7)
            if (r5 < 0) goto L205
            goto L21f
        L205:
            int r5 = r10.f56h
            if (r2 >= r5) goto L21f
            int r5 = r5 + (-1)
            r7 = r2
        L20c:
            if (r7 >= r5) goto L21a
            java.lang.Object r8 = r10.f57i
            long[] r8 = (long[]) r8
            int r9 = r7 + 1
            r11 = r8[r9]
            r8[r7] = r11
            r7 = r9
            goto L20c
        L21a:
            int r5 = r10.f56h
            int r5 = r5 + r4
            r10.f56h = r5
        L21f:
            int r2 = r2 + (-1)
            goto L1c9
        L222:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.d()
            r1.<init>(r2)
            int r2 = r6.d()
            r4 = 0
        L230:
            if (r4 >= r2) goto L23c
            java.lang.Object r5 = r6.e(r4)
            r1.add(r5)
            int r4 = r4 + 1
            goto L230
        L23c:
            s1.k r2 = new s1.k
            r2.<init>(r1, r3)
            int r4 = r1.size()
            r5 = 0
        L246:
            if (r5 >= r4) goto L25b
            java.lang.Object r6 = r1.get(r5)
            r7 = r6
            s1.t r7 = (s1.t) r7
            long r7 = r7.f12291a
            boolean r7 = r3.a(r7)
            if (r7 == 0) goto L258
            goto L25d
        L258:
            int r5 = r5 + 1
            goto L246
        L25b:
            r6 = r16
        L25d:
            s1.t r6 = (s1.t) r6
            r1 = 3
            if (r6 == 0) goto L2ef
            boolean r3 = r6.f12294d
            if (r60 != 0) goto L26a
            r13 = 0
            r0.f12251i = r13
            goto L2c1
        L26a:
            r13 = 0
            boolean r4 = r0.f12251i
            if (r4 != 0) goto L2c1
            if (r3 != 0) goto L275
            boolean r4 = r6.f12298h
            if (r4 == 0) goto L2c1
        L275:
            x1.i1 r4 = r0.f12248f
            r4.getClass()
            long r4 = r4.f13902i
            long r6 = r6.f12293c
            r8 = 32
            long r9 = r6 >> r8
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r10
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r4 >> r8
            int r7 = (int) r7
            long r4 = r4 & r10
            int r4 = (int) r4
            r5 = 0
            int r8 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r8 >= 0) goto L29f
            r8 = r20
            goto L2a0
        L29f:
            r8 = r13
        L2a0:
            float r7 = (float) r7
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 <= 0) goto L2a8
            r7 = r20
            goto L2a9
        L2a8:
            r7 = r13
        L2a9:
            r7 = r7 | r8
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 >= 0) goto L2b1
            r5 = r20
            goto L2b2
        L2b1:
            r5 = r13
        L2b2:
            r5 = r5 | r7
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L2bb
            r4 = r20
            goto L2bc
        L2bb:
            r4 = r13
        L2bc:
            r4 = r4 | r5
            r4 = r4 ^ 1
            r0.f12251i = r4
        L2c1:
            boolean r4 = r0.f12251i
            boolean r5 = r0.f12250h
            r6 = 5
            r7 = 4
            if (r4 == r5) goto L2d9
            int r8 = r2.f12267f
            if (r8 != r1) goto L2ce
            goto L2d3
        L2ce:
            if (r8 != r7) goto L2d1
            goto L2d3
        L2d1:
            if (r8 != r6) goto L2d9
        L2d3:
            if (r4 == 0) goto L2d6
            r6 = r7
        L2d6:
            r2.f12267f = r6
            goto L2f0
        L2d9:
            int r8 = r2.f12267f
            if (r8 != r7) goto L2e6
            if (r5 == 0) goto L2e6
            boolean r5 = r0.f12252j
            if (r5 != 0) goto L2e6
            r2.f12267f = r1
            goto L2f0
        L2e6:
            if (r8 != r6) goto L2f0
            if (r4 == 0) goto L2f0
            if (r3 == 0) goto L2f0
            r2.f12267f = r1
            goto L2f0
        L2ef:
            r13 = 0
        L2f0:
            if (r51 != 0) goto L32c
            int r3 = r2.f12267f
            if (r3 != r1) goto L32c
            s1.k r1 = r0.f12249g
            if (r1 == 0) goto L32c
            java.lang.Object r1 = r1.f12262a
            int r3 = r1.size()
            java.lang.Object r4 = r2.f12262a
            int r5 = r4.size()
            if (r3 == r5) goto L309
            goto L32c
        L309:
            int r3 = r4.size()
            r5 = r13
        L30e:
            if (r5 >= r3) goto L32a
            java.lang.Object r6 = r1.get(r5)
            s1.t r6 = (s1.t) r6
            java.lang.Object r7 = r4.get(r5)
            s1.t r7 = (s1.t) r7
            long r8 = r6.f12293c
            long r6 = r7.f12293c
            boolean r6 = e1.b.b(r8, r6)
            if (r6 != 0) goto L327
            goto L32c
        L327:
            int r5 = r5 + 1
            goto L30e
        L32a:
            r7 = r13
            goto L32e
        L32c:
            r7 = r20
        L32e:
            r0.f12249g = r2
            return r7
    }

    @Override // s1.j
    public final void b(h0.q0 r11) {
            r10 = this;
            super.b(r11)
            s1.k r0 = r10.f12249g
            if (r0 != 0) goto L8
            return
        L8:
            boolean r1 = r10.f12251i
            r10.f12250h = r1
            java.lang.Object r1 = r0.f12262a
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L14:
            if (r4 >= r2) goto L36
            java.lang.Object r5 = r1.get(r4)
            s1.t r5 = (s1.t) r5
            boolean r6 = r5.f12294d
            long r7 = r5.f12291a
            boolean r5 = r11.a(r7)
            boolean r9 = r10.f12251i
            if (r6 != 0) goto L2a
            if (r5 == 0) goto L2e
        L2a:
            if (r6 != 0) goto L33
            if (r9 != 0) goto L33
        L2e:
            a5.a r5 = r10.f12246d
            r5.p(r7)
        L33:
            int r4 = r4 + 1
            goto L14
        L36:
            r10.f12251i = r3
            int r11 = r0.f12267f
            r0 = 5
            if (r11 != r0) goto L3e
            r3 = 1
        L3e:
            r10.f12252j = r3
            return
    }

    public final void c() {
            r9 = this;
            j0.b r0 = r9.f12257a
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r0) goto L14
            r4 = r1[r3]
            s1.i r4 = (s1.i) r4
            r4.c()
            int r3 = r3 + 1
            goto L8
        L14:
            r0 = 0
            y0.n r1 = r9.f12245c
            r3 = r0
        L18:
            if (r1 == 0) goto L60
            boolean r4 = r1 instanceof x1.w1
            if (r4 == 0) goto L24
            x1.w1 r1 = (x1.w1) r1
            r1.b0()
            goto L5b
        L24:
            int r4 = r1.f21821i
            r5 = 16
            r4 = r4 & r5
            if (r4 == 0) goto L5b
            boolean r4 = r1 instanceof x1.j
            if (r4 == 0) goto L5b
            r4 = r1
            x1.j r4 = (x1.j) r4
            y0.n r4 = r4.f20950v
            r6 = r2
        L35:
            r7 = 1
            if (r4 == 0) goto L58
            int r8 = r4.f21821i
            r8 = r8 & r5
            if (r8 == 0) goto L55
            int r6 = r6 + 1
            if (r6 != r7) goto L43
            r1 = r4
            goto L55
        L43:
            if (r3 != 0) goto L4c
            j0.b r3 = new j0.b
            y0.n[] r7 = new y0.n[r5]
            r3.<init>(r7)
        L4c:
            if (r1 == 0) goto L52
            r3.b(r1)
            r1 = r0
        L52:
            r3.b(r4)
        L55:
            y0.n r4 = r4.f21824l
            goto L35
        L58:
            if (r6 != r7) goto L5b
            goto L18
        L5b:
            y0.n r1 = x1.k.e(r3)
            goto L18
        L60:
            return
    }

    public final boolean d(h0.q0 r15) {
            r14 = this;
            f.p r0 = r14.f12247e
            int r1 = r0.d()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto Ld
        La:
            r9 = r3
            goto La3
        Ld:
            y0.n r1 = r14.f12245c
            boolean r4 = r1.f21832t
            if (r4 != 0) goto L14
            goto La
        L14:
            x1.i1 r4 = r1.f21826n
            if (r4 == 0) goto L21
            x1.f0 r4 = r4.f20943u
            if (r4 == 0) goto L21
            boolean r4 = r4.H()
            goto L22
        L21:
            r4 = r3
        L22:
            if (r4 != 0) goto L25
            goto La
        L25:
            s1.k r4 = r14.f12249g
            r4.getClass()
            x1.i1 r5 = r14.f12248f
            r5.getClass()
            long r5 = r5.f13902i
            r7 = r1
            r8 = r2
        L33:
            r9 = 1
            if (r7 == 0) goto L8c
            boolean r10 = r7 instanceof x1.w1
            if (r10 == 0) goto L44
            r10 = r7
            x1.w1 r10 = (x1.w1) r10
            s1.l r11 = s1.l.f12276i
            r10.P(r4, r11, r5)
            r10 = r3
            goto L45
        L44:
            r10 = r9
        L45:
            if (r10 == 0) goto L87
            int r10 = r7.f21821i
            r11 = 16
            r10 = r10 & r11
            if (r10 == 0) goto L50
            r10 = r9
            goto L51
        L50:
            r10 = r3
        L51:
            if (r10 == 0) goto L87
            boolean r10 = r7 instanceof x1.j
            if (r10 == 0) goto L87
            r10 = r7
            x1.j r10 = (x1.j) r10
            y0.n r10 = r10.f20950v
            r12 = r3
        L5d:
            if (r10 == 0) goto L84
            int r13 = r10.f21821i
            r13 = r13 & r11
            if (r13 == 0) goto L66
            r13 = r9
            goto L67
        L66:
            r13 = r3
        L67:
            if (r13 == 0) goto L81
            int r12 = r12 + 1
            if (r12 != r9) goto L6f
            r7 = r10
            goto L81
        L6f:
            if (r8 != 0) goto L78
            j0.b r8 = new j0.b
            y0.n[] r13 = new y0.n[r11]
            r8.<init>(r13)
        L78:
            if (r7 == 0) goto L7e
            r8.b(r7)
            r7 = r2
        L7e:
            r8.b(r10)
        L81:
            y0.n r10 = r10.f21824l
            goto L5d
        L84:
            if (r12 != r9) goto L87
            goto L33
        L87:
            y0.n r7 = x1.k.e(r8)
            goto L33
        L8c:
            boolean r1 = r1.f21832t
            if (r1 == 0) goto La3
            j0.b r1 = r14.f12257a
            java.lang.Object[] r4 = r1.f6671g
            int r1 = r1.f6673i
            r5 = r3
        L97:
            if (r5 >= r1) goto La3
            r6 = r4[r5]
            s1.i r6 = (s1.i) r6
            r6.d(r15)
            int r5 = r5 + 1
            goto L97
        La3:
            r14.b(r15)
            int r15 = r0.f2881j
            java.lang.Object[] r1 = r0.f2880i
            r4 = r3
        Lab:
            if (r4 >= r15) goto Lb2
            r1[r4] = r2
            int r4 = r4 + 1
            goto Lab
        Lb2:
            r0.f2881j = r3
            r0.f2878g = r3
            r14.f12248f = r2
            return r9
    }

    public final boolean e(h0.q0 r14, boolean r15) {
            r13 = this;
            f.p r0 = r13.f12247e
            int r0 = r0.d()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            y0.n r0 = r13.f12245c
            boolean r2 = r0.f21832t
            if (r2 != 0) goto L11
            goto L21
        L11:
            x1.i1 r2 = r0.f21826n
            if (r2 == 0) goto L1e
            x1.f0 r2 = r2.f20943u
            if (r2 == 0) goto L1e
            boolean r2 = r2.H()
            goto L1f
        L1e:
            r2 = r1
        L1f:
            if (r2 != 0) goto L22
        L21:
            return r1
        L22:
            s1.k r2 = r13.f12249g
            r2.getClass()
            x1.i1 r3 = r13.f12248f
            r3.getClass()
            long r3 = r3.f13902i
            r5 = 0
            r6 = r0
            r7 = r5
        L31:
            r8 = 16
            r9 = 1
            if (r6 == 0) goto L8a
            boolean r10 = r6 instanceof x1.w1
            if (r10 == 0) goto L44
            r10 = r6
            x1.w1 r10 = (x1.w1) r10
            s1.l r11 = s1.l.f12274g
            r10.P(r2, r11, r3)
            r10 = r1
            goto L45
        L44:
            r10 = r9
        L45:
            if (r10 == 0) goto L85
            int r10 = r6.f21821i
            r10 = r10 & r8
            if (r10 == 0) goto L4e
            r10 = r9
            goto L4f
        L4e:
            r10 = r1
        L4f:
            if (r10 == 0) goto L85
            boolean r10 = r6 instanceof x1.j
            if (r10 == 0) goto L85
            r10 = r6
            x1.j r10 = (x1.j) r10
            y0.n r10 = r10.f20950v
            r11 = r1
        L5b:
            if (r10 == 0) goto L82
            int r12 = r10.f21821i
            r12 = r12 & r8
            if (r12 == 0) goto L64
            r12 = r9
            goto L65
        L64:
            r12 = r1
        L65:
            if (r12 == 0) goto L7f
            int r11 = r11 + 1
            if (r11 != r9) goto L6d
            r6 = r10
            goto L7f
        L6d:
            if (r7 != 0) goto L76
            j0.b r7 = new j0.b
            y0.n[] r12 = new y0.n[r8]
            r7.<init>(r12)
        L76:
            if (r6 == 0) goto L7c
            r7.b(r6)
            r6 = r5
        L7c:
            r7.b(r10)
        L7f:
            y0.n r10 = r10.f21824l
            goto L5b
        L82:
            if (r11 != r9) goto L85
            goto L31
        L85:
            y0.n r6 = x1.k.e(r7)
            goto L31
        L8a:
            boolean r6 = r0.f21832t
            if (r6 == 0) goto La6
            j0.b r6 = r13.f12257a
            java.lang.Object[] r7 = r6.f6671g
            int r6 = r6.f6673i
            r10 = r1
        L95:
            if (r10 >= r6) goto La6
            r11 = r7[r10]
            s1.i r11 = (s1.i) r11
            x1.i1 r12 = r13.f12248f
            r12.getClass()
            r11.e(r14, r15)
            int r10 = r10 + 1
            goto L95
        La6:
            boolean r14 = r0.f21832t
            if (r14 == 0) goto L101
            r14 = r5
        Lab:
            if (r0 == 0) goto L101
            boolean r15 = r0 instanceof x1.w1
            if (r15 == 0) goto Lbb
            r15 = r0
            x1.w1 r15 = (x1.w1) r15
            s1.l r6 = s1.l.f12275h
            r15.P(r2, r6, r3)
            r15 = r1
            goto Lbc
        Lbb:
            r15 = r9
        Lbc:
            if (r15 == 0) goto Lfc
            int r15 = r0.f21821i
            r15 = r15 & r8
            if (r15 == 0) goto Lc5
            r15 = r9
            goto Lc6
        Lc5:
            r15 = r1
        Lc6:
            if (r15 == 0) goto Lfc
            boolean r15 = r0 instanceof x1.j
            if (r15 == 0) goto Lfc
            r15 = r0
            x1.j r15 = (x1.j) r15
            y0.n r15 = r15.f20950v
            r6 = r1
        Ld2:
            if (r15 == 0) goto Lf9
            int r7 = r15.f21821i
            r7 = r7 & r8
            if (r7 == 0) goto Ldb
            r7 = r9
            goto Ldc
        Ldb:
            r7 = r1
        Ldc:
            if (r7 == 0) goto Lf6
            int r6 = r6 + 1
            if (r6 != r9) goto Le4
            r0 = r15
            goto Lf6
        Le4:
            if (r14 != 0) goto Led
            j0.b r14 = new j0.b
            y0.n[] r7 = new y0.n[r8]
            r14.<init>(r7)
        Led:
            if (r0 == 0) goto Lf3
            r14.b(r0)
            r0 = r5
        Lf3:
            r14.b(r15)
        Lf6:
            y0.n r15 = r15.f21824l
            goto Ld2
        Lf9:
            if (r6 != r9) goto Lfc
            goto Lab
        Lfc:
            y0.n r0 = x1.k.e(r14)
            goto Lab
        L101:
            return r9
    }

    public final void f(long r5, f.f0 r7) {
            r4 = this;
            a5.a r0 = r4.f12246d
            boolean r1 = r0.e(r5)
            if (r1 == 0) goto L17
            int r1 = r7.g(r4)
            if (r1 < 0) goto Lf
            goto L17
        Lf:
            r0.p(r5)
            f.p r0 = r4.f12247e
            r0.c(r5)
        L17:
            j0.b r0 = r4.f12257a
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r2 = 0
        L1e:
            if (r2 >= r0) goto L2a
            r3 = r1[r2]
            s1.i r3 = (s1.i) r3
            r3.f(r5, r7)
            int r2 = r2 + 1
            goto L1e
        L2a:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Node(modifierNode="
            r0.<init>(r1)
            y0.n r1 = r2.f12245c
            r0.append(r1)
            java.lang.String r1 = ", children="
            r0.append(r1)
            j0.b r1 = r2.f12257a
            r0.append(r1)
            java.lang.String r1 = ", pointerIds="
            r0.append(r1)
            a5.a r1 = r2.f12246d
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
