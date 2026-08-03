package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m.r0 f8429a = null;

    static {
            m.r0 r0 = new m.r0
            r1 = 3
            r2 = 2
            r3 = 0
            r0.<init>(r1, r3, r2)
            m.y2.f8429a = r0
            return
    }

    public static final java.lang.Object a(s1.k0 r5, boolean r6, s1.l r7, wf.c r8) {
            boolean r0 = r8 instanceof m.p2
            if (r0 == 0) goto L13
            r0 = r8
            m.p2 r0 = (m.p2) r0
            int r1 = r0.f8331k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8331k = r1
            goto L18
        L13:
            m.p2 r0 = new m.p2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8330j
            int r1 = r0.f8331k
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.f8329i
            s1.l r6 = r0.f8328h
            s1.k0 r7 = r0.f8327g
            f8.i.I0(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L36:
            f8.i.I0(r8)
        L39:
            r0.f8327g = r5
            r0.f8328h = r7
            r0.f8329i = r6
            r0.f8331k = r2
            java.lang.Object r8 = r5.e(r7, r0)
            xf.a r1 = xf.a.f21579g
            if (r8 != r1) goto L4a
            return r1
        L4a:
            s1.k r8 = (s1.k) r8
            boolean r1 = e(r8, r6)
            if (r1 == 0) goto L39
            java.lang.Object r5 = r8.f12262a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
    }

    public static /* synthetic */ java.lang.Object b(s1.k0 r1, wf.c r2, int r3) {
            r0 = 1
            r3 = r3 & r0
            if (r3 == 0) goto L5
            goto L6
        L5:
            r0 = 0
        L6:
            s1.l r3 = s1.l.f12275h
            java.lang.Object r1 = a(r1, r0, r3, r2)
            return r1
    }

    public static final java.lang.Object c(s1.k0 r7, yf.c r8) {
            boolean r0 = r8 instanceof m.q2
            if (r0 == 0) goto L13
            r0 = r8
            m.q2 r0 = (m.q2) r0
            int r1 = r0.f8339i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8339i = r1
            goto L18
        L13:
            m.q2 r0 = new m.q2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8338h
            int r1 = r0.f8339i
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            s1.k0 r7 = r0.f8337g
            f8.i.I0(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            return r7
        L2e:
            f8.i.I0(r8)
        L31:
            r0.f8337g = r7
            r0.f8339i = r2
            s1.l r8 = s1.l.f12275h
            java.lang.Object r8 = r7.e(r8, r0)
            xf.a r1 = xf.a.f21579g
            if (r8 != r1) goto L40
            return r1
        L40:
            s1.k r8 = (s1.k) r8
            java.lang.Object r1 = r8.f12262a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4a:
            if (r5 >= r3) goto L58
            java.lang.Object r6 = r1.get(r5)
            s1.t r6 = (s1.t) r6
            r6.a()
            int r5 = r5 + 1
            goto L4a
        L58:
            java.lang.Object r8 = r8.f12262a
            int r1 = r8.size()
        L5e:
            if (r4 >= r1) goto L6e
            java.lang.Object r3 = r8.get(r4)
            s1.t r3 = (s1.t) r3
            boolean r3 = r3.f12294d
            if (r3 == 0) goto L6b
            goto L31
        L6b:
            int r4 = r4 + 1
            goto L5e
        L6e:
            sf.n r7 = sf.n.f12433a
            return r7
    }

    public static java.lang.Object d(s1.x r7, wb.l7 r8, fg.l r9, wf.c r10, int r11) {
            r11 = r11 & 2
            if (r11 == 0) goto L5
            r8 = 0
        L5:
            r3 = r8
            i.e r0 = new i.e
            r6 = 0
            r2 = 0
            m.r0 r4 = m.y2.f8429a
            r1 = r7
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.Object r7 = qg.v.e(r0, r10)
            xf.a r8 = xf.a.f21579g
            if (r7 != r8) goto L1a
            return r7
        L1a:
            sf.n r7 = sf.n.f12433a
            return r7
    }

    public static boolean e(s1.k r4, boolean r5) {
            java.lang.Object r4 = r4.f12262a
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L21
            java.lang.Object r3 = r4.get(r2)
            s1.t r3 = (s1.t) r3
            if (r5 == 0) goto L17
            boolean r3 = s1.s.a(r3)
            goto L1b
        L17:
            boolean r3 = s1.s.b(r3)
        L1b:
            if (r3 != 0) goto L1e
            return r1
        L1e:
            int r2 = r2 + 1
            goto L8
        L21:
            r4 = 1
            return r4
    }

    public static qg.e1 f(qg.t r3, qg.r0 r4, fg.p r5) {
            ci.h r0 = new ci.h
            r1 = 1
            r2 = 0
            r0.<init>(r4, r5, r2, r1)
            r4 = 1
            qg.e1 r3 = qg.v.q(r3, r2, r0, r4)
            return r3
    }

    public static final java.lang.Object g(s1.k0 r19, qg.t r20, m.t1 r21, fg.l r22, fg.l r23, fg.q r24, fg.l r25, yf.a r26) {
            r0 = r19
            r1 = r26
            boolean r2 = r1 instanceof m.u2
            if (r2 == 0) goto L17
            r2 = r1
            m.u2 r2 = (m.u2) r2
            int r3 = r2.f8394q
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f8394q = r3
            goto L1c
        L17:
            m.u2 r2 = new m.u2
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f8393p
            int r3 = r2.f8394q
            r4 = 3
            s1.l r5 = s1.l.f12275h
            m.e1 r6 = m.e1.f8131a
            m.r0 r7 = m.y2.f8429a
            sf.n r8 = sf.n.f12433a
            xf.a r11 = xf.a.f21579g
            switch(r3) {
                case 0: goto L152;
                case 1: goto L12d;
                case 2: goto L107;
                case 3: goto Lda;
                case 4: goto Lc6;
                case 5: goto L97;
                case 6: goto L79;
                case 7: goto L49;
                case 8: goto L35;
                default: goto L2e;
            }
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
        L33:
            r0 = 0
            return r0
        L35:
            java.lang.Object r0 = r2.f8386i
            qg.r0 r0 = (qg.r0) r0
            java.lang.Object r3 = r2.f8385h
            m.t1 r3 = (m.t1) r3
            java.lang.Object r2 = r2.f8384g
            qg.t r2 = (qg.t) r2
            f8.i.I0(r1)
            r17 = r8
            r15 = 0
            goto L37e
        L49:
            java.lang.Object r0 = r2.f8392o
            s1.t r0 = (s1.t) r0
            java.lang.Object r3 = r2.f8391n
            s1.t r3 = (s1.t) r3
            java.lang.Object r4 = r2.f8390m
            qg.r0 r4 = (qg.r0) r4
            java.lang.Object r5 = r2.f8389l
            fg.l r5 = (fg.l) r5
            java.lang.Object r7 = r2.f8388k
            fg.l r7 = (fg.l) r7
            fg.l r9 = r2.f8387j
            java.lang.Object r12 = r2.f8386i
            m.t1 r12 = (m.t1) r12
            java.lang.Object r13 = r2.f8385h
            qg.t r13 = (qg.t) r13
            java.lang.Object r14 = r2.f8384g
            s1.k0 r14 = (s1.k0) r14
            f8.i.I0(r1)
            r26 = r6
            r17 = r8
            r10 = r13
            r15 = 0
            r6 = r5
            r5 = r3
            r3 = r12
            goto L34b
        L79:
            java.lang.Object r0 = r2.f8389l
            s1.t r0 = (s1.t) r0
            java.lang.Object r3 = r2.f8388k
            qg.r0 r3 = (qg.r0) r3
            fg.l r4 = r2.f8387j
            java.lang.Object r5 = r2.f8386i
            fg.l r5 = (fg.l) r5
            java.lang.Object r6 = r2.f8385h
            m.t1 r6 = (m.t1) r6
            java.lang.Object r2 = r2.f8384g
            qg.t r2 = (qg.t) r2
            f8.i.I0(r1)
            r17 = r8
            r15 = 0
            goto L321
        L97:
            java.lang.Object r0 = r2.f8392o
            qg.r0 r0 = (qg.r0) r0
            java.lang.Object r3 = r2.f8391n
            s1.t r3 = (s1.t) r3
            java.lang.Object r4 = r2.f8390m
            fg.l r4 = (fg.l) r4
            java.lang.Object r12 = r2.f8389l
            fg.q r12 = (fg.q) r12
            java.lang.Object r13 = r2.f8388k
            fg.l r13 = (fg.l) r13
            fg.l r14 = r2.f8387j
            java.lang.Object r15 = r2.f8386i
            m.t1 r15 = (m.t1) r15
            java.lang.Object r10 = r2.f8385h
            qg.t r10 = (qg.t) r10
            java.lang.Object r9 = r2.f8384g
            s1.k0 r9 = (s1.k0) r9
            f8.i.I0(r1)
            r26 = r6
            r17 = r8
            r6 = r9
            r9 = r13
            r8 = r15
            r15 = 0
            goto L2c1
        Lc6:
            java.lang.Object r0 = r2.f8386i
            qg.r0 r0 = (qg.r0) r0
            java.lang.Object r3 = r2.f8385h
            m.t1 r3 = (m.t1) r3
            java.lang.Object r2 = r2.f8384g
            qg.t r2 = (qg.t) r2
            f8.i.I0(r1)
            r17 = r8
            r15 = 0
            goto L241
        Lda:
            java.lang.Object r0 = r2.f8392o
            qg.r0 r0 = (qg.r0) r0
            java.lang.Object r3 = r2.f8391n
            s1.t r3 = (s1.t) r3
            java.lang.Object r4 = r2.f8390m
            fg.l r4 = (fg.l) r4
            java.lang.Object r9 = r2.f8389l
            fg.q r9 = (fg.q) r9
            java.lang.Object r10 = r2.f8388k
            fg.l r10 = (fg.l) r10
            fg.l r12 = r2.f8387j
            java.lang.Object r13 = r2.f8386i
            m.t1 r13 = (m.t1) r13
            java.lang.Object r14 = r2.f8385h
            qg.t r14 = (qg.t) r14
            java.lang.Object r15 = r2.f8384g
            s1.k0 r15 = (s1.k0) r15
            f8.i.I0(r1)
            r17 = r8
            r8 = r13
            r13 = r14
            r14 = r15
            r15 = 0
            goto L210
        L107:
            java.lang.Object r0 = r2.f8391n
            qg.r0 r0 = (qg.r0) r0
            java.lang.Object r3 = r2.f8390m
            fg.l r3 = (fg.l) r3
            java.lang.Object r4 = r2.f8389l
            fg.q r4 = (fg.q) r4
            java.lang.Object r9 = r2.f8388k
            fg.l r9 = (fg.l) r9
            fg.l r10 = r2.f8387j
            java.lang.Object r12 = r2.f8386i
            m.t1 r12 = (m.t1) r12
            java.lang.Object r13 = r2.f8385h
            qg.t r13 = (qg.t) r13
            java.lang.Object r14 = r2.f8384g
            s1.k0 r14 = (s1.k0) r14
            f8.i.I0(r1)
            r17 = r8
            r15 = 0
            goto L1e1
        L12d:
            java.lang.Object r0 = r2.f8390m
            fg.l r0 = (fg.l) r0
            java.lang.Object r3 = r2.f8389l
            fg.q r3 = (fg.q) r3
            java.lang.Object r9 = r2.f8388k
            fg.l r9 = (fg.l) r9
            fg.l r10 = r2.f8387j
            java.lang.Object r12 = r2.f8386i
            m.t1 r12 = (m.t1) r12
            java.lang.Object r13 = r2.f8385h
            qg.t r13 = (qg.t) r13
            java.lang.Object r14 = r2.f8384g
            s1.k0 r14 = (s1.k0) r14
            f8.i.I0(r1)
            r15 = r10
            r10 = r9
            r9 = r15
            r15 = r1
            r1 = r0
            r0 = r14
            r14 = 1
            goto L184
        L152:
            f8.i.I0(r1)
            r2.f8384g = r0
            r1 = r20
            r2.f8385h = r1
            r3 = r21
            r2.f8386i = r3
            r9 = r22
            r2.f8387j = r9
            r10 = r23
            r2.f8388k = r10
            r12 = r24
            r2.f8389l = r12
            r13 = r25
            r2.f8390m = r13
            r14 = 1
            r2.f8394q = r14
            java.lang.Object r15 = b(r0, r2, r4)
            if (r15 != r11) goto L17a
            goto L37b
        L17a:
            r18 = r13
            r13 = r1
            r1 = r18
            r18 = r12
            r12 = r3
            r3 = r18
        L184:
            s1.t r15 = (s1.t) r15
            r15.a()
            m.s2 r4 = new m.s2
            r17 = r8
            r8 = 1
            r22 = r15
            r15 = 0
            r4.<init>(r12, r15, r8)
            qg.e1 r4 = qg.v.q(r13, r15, r4, r14)
            if (r3 == r7) goto L1b6
            m.v2 r8 = new m.v2
            r14 = 0
            r20 = r3
            r19 = r8
            r21 = r12
            r24 = r14
            r23 = r15
            r19.<init>(r20, r21, r22, r23, r24)
            r14 = r19
            r12 = r20
            r8 = r21
            r3 = r22
            f(r13, r4, r14)
            goto L1ba
        L1b6:
            r8 = r12
            r12 = r3
            r3 = r22
        L1ba:
            if (r10 != 0) goto L1e7
            r2.f8384g = r0
            r2.f8385h = r13
            r2.f8386i = r8
            r2.f8387j = r9
            r2.f8388k = r10
            r2.f8389l = r12
            r2.f8390m = r1
            r2.f8391n = r4
            r3 = 2
            r2.f8394q = r3
            java.lang.Object r3 = i(r0, r5, r2)
            if (r3 != r11) goto L1d7
            goto L37b
        L1d7:
            r14 = r3
            r3 = r1
            r1 = r14
            r14 = r10
            r10 = r9
            r9 = r14
            r14 = r0
            r0 = r4
            r4 = r12
            r12 = r8
        L1e1:
            s1.t r1 = (s1.t) r1
            r8 = r12
            r12 = r4
            goto L25e
        L1e7:
            r2.f8384g = r0
            r2.f8385h = r13
            r2.f8386i = r8
            r2.f8387j = r9
            r2.f8388k = r10
            r2.f8389l = r12
            r2.f8390m = r1
            r2.f8391n = r3
            r2.f8392o = r4
            r14 = 3
            r2.f8394q = r14
            java.lang.Object r14 = h(r0, r5, r2)
            if (r14 != r11) goto L204
            goto L37b
        L204:
            r18 = r14
            r14 = r0
            r0 = r4
            r4 = r1
            r1 = r18
            r18 = r12
            r12 = r9
            r9 = r18
        L210:
            m.f1 r1 = (m.f1) r1
            boolean r16 = gg.l.a(r1, r6)
            if (r16 == 0) goto L24b
            long r3 = r3.f12293c
            e1.b r1 = new e1.b
            r1.<init>(r3)
            r10.invoke(r1)
            r2.f8384g = r13
            r2.f8385h = r8
            r2.f8386i = r0
            r2.f8387j = r15
            r2.f8388k = r15
            r2.f8389l = r15
            r2.f8390m = r15
            r2.f8391n = r15
            r2.f8392o = r15
            r1 = 4
            r2.f8394q = r1
            java.lang.Object r1 = c(r14, r2)
            if (r1 != r11) goto L23f
            goto L37b
        L23f:
            r3 = r8
            r2 = r13
        L241:
            m.r2 r1 = new m.r2
            r4 = 2
            r1.<init>(r3, r15, r4)
            f(r2, r0, r1)
            return r17
        L24b:
            boolean r3 = r1 instanceof m.d1
            if (r3 == 0) goto L254
            m.d1 r1 = (m.d1) r1
            s1.t r1 = r1.f8117a
            goto L259
        L254:
            boolean r1 = r1 instanceof m.c1
            if (r1 == 0) goto L3da
            r1 = r15
        L259:
            r3 = r12
            r12 = r9
            r9 = r10
            r10 = r3
            r3 = r4
        L25e:
            if (r1 != 0) goto L26d
            m.r2 r4 = new m.r2
            r26 = r6
            r6 = 3
            r4.<init>(r8, r15, r6)
            qg.e1 r0 = f(r13, r0, r4)
            goto L27c
        L26d:
            r26 = r6
            r1.a()
            m.r2 r4 = new m.r2
            r6 = 4
            r4.<init>(r8, r15, r6)
            qg.e1 r0 = f(r13, r0, r4)
        L27c:
            if (r1 == 0) goto L3d9
            if (r10 != 0) goto L28d
            if (r3 == 0) goto L3d9
            long r0 = r1.f12293c
            e1.b r2 = new e1.b
            r2.<init>(r0)
            r3.invoke(r2)
            return r17
        L28d:
            r2.f8384g = r14
            r2.f8385h = r13
            r2.f8386i = r8
            r2.f8387j = r10
            r2.f8388k = r9
            r2.f8389l = r12
            r2.f8390m = r3
            r2.f8391n = r1
            r2.f8392o = r0
            r4 = 5
            r2.f8394q = r4
            y1.l2 r4 = r14.B()
            r19 = r3
            long r3 = r4.a()
            h0.d0 r6 = new h0.d0
            r6.<init>(r1, r15)
            java.lang.Object r3 = r14.E(r3, r6, r2)
            if (r3 != r11) goto L2b9
            goto L37b
        L2b9:
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r19
            r6 = r14
            r14 = r10
            r10 = r13
        L2c1:
            s1.t r1 = (s1.t) r1
            if (r1 != 0) goto L2d2
            if (r4 == 0) goto L3d9
            long r0 = r3.f12293c
            e1.b r2 = new e1.b
            r2.<init>(r0)
            r4.invoke(r2)
            return r17
        L2d2:
            ci.j r13 = new ci.j
            r22 = r1
            r1 = 13
            r13.<init>(r0, r8, r15, r1)
            r0 = 1
            qg.e1 r0 = qg.v.q(r10, r15, r13, r0)
            if (r12 == r7) goto L2fa
            m.v2 r1 = new m.v2
            r7 = 1
            r19 = r1
            r24 = r7
            r21 = r8
            r20 = r12
            r23 = r15
            r19.<init>(r20, r21, r22, r23, r24)
            r7 = r19
            r1 = r22
            f(r10, r0, r7)
            goto L2fc
        L2fa:
            r1 = r22
        L2fc:
            if (r9 != 0) goto L326
            r2.f8384g = r10
            r2.f8385h = r8
            r2.f8386i = r14
            r2.f8387j = r4
            r2.f8388k = r0
            r2.f8389l = r3
            r2.f8390m = r15
            r2.f8391n = r15
            r2.f8392o = r15
            r1 = 6
            r2.f8394q = r1
            java.lang.Object r1 = i(r6, r5, r2)
            if (r1 != r11) goto L31b
            goto L37b
        L31b:
            r2 = r3
            r3 = r0
            r0 = r2
            r6 = r8
            r2 = r10
            r5 = r14
        L321:
            r10 = r1
            s1.t r10 = (s1.t) r10
            goto L3a5
        L326:
            r2.f8384g = r6
            r2.f8385h = r10
            r2.f8386i = r8
            r2.f8387j = r14
            r2.f8388k = r9
            r2.f8389l = r4
            r2.f8390m = r0
            r2.f8391n = r3
            r2.f8392o = r1
            r7 = 7
            r2.f8394q = r7
            java.lang.Object r5 = h(r6, r5, r2)
            if (r5 != r11) goto L342
            goto L37b
        L342:
            r7 = r9
            r9 = r14
            r14 = r6
            r6 = r4
            r4 = r0
            r0 = r1
            r1 = r5
            r5 = r3
            r3 = r8
        L34b:
            m.f1 r1 = (m.f1) r1
            r8 = r26
            boolean r8 = gg.l.a(r1, r8)
            if (r8 == 0) goto L388
            long r0 = r0.f12293c
            e1.b r5 = new e1.b
            r5.<init>(r0)
            r7.invoke(r5)
            r2.f8384g = r10
            r2.f8385h = r3
            r2.f8386i = r4
            r2.f8387j = r15
            r2.f8388k = r15
            r2.f8389l = r15
            r2.f8390m = r15
            r2.f8391n = r15
            r2.f8392o = r15
            r0 = 8
            r2.f8394q = r0
            java.lang.Object r0 = c(r14, r2)
            if (r0 != r11) goto L37c
        L37b:
            return r11
        L37c:
            r0 = r4
            r2 = r10
        L37e:
            m.r2 r1 = new m.r2
            r4 = 7
            r1.<init>(r3, r15, r4)
            f(r2, r0, r1)
            return r17
        L388:
            boolean r0 = r1 instanceof m.d1
            if (r0 == 0) goto L399
            m.d1 r1 = (m.d1) r1
            s1.t r0 = r1.f8117a
            r2 = r6
            r6 = r3
            r3 = r4
            r4 = r2
            r2 = r10
            r10 = r0
            r0 = r5
            r5 = r9
            goto L3a5
        L399:
            boolean r0 = r1 instanceof m.c1
            if (r0 == 0) goto L3d4
            r0 = r6
            r6 = r3
            r3 = r4
            r4 = r0
            r0 = r5
            r5 = r9
            r2 = r10
            r10 = r15
        L3a5:
            if (r10 == 0) goto L3be
            r10.a()
            m.r2 r0 = new m.r2
            r1 = 5
            r0.<init>(r6, r15, r1)
            f(r2, r3, r0)
            long r0 = r10.f12293c
            e1.b r2 = new e1.b
            r2.<init>(r0)
            r5.invoke(r2)
            return r17
        L3be:
            m.r2 r1 = new m.r2
            r5 = 6
            r1.<init>(r6, r15, r5)
            f(r2, r3, r1)
            if (r4 == 0) goto L3d9
            long r0 = r0.f12293c
            e1.b r2 = new e1.b
            r2.<init>(r0)
            r4.invoke(r2)
            return r17
        L3d4:
            okio.a.k()
            goto L33
        L3d9:
            return r17
        L3da:
            okio.a.k()
            goto L33
    }

    public static final java.lang.Object h(s1.k0 r7, s1.l r8, yf.c r9) {
            boolean r0 = r9 instanceof m.w2
            if (r0 == 0) goto L13
            r0 = r9
            m.w2 r0 = (m.w2) r0
            int r1 = r0.f8416i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8416i = r1
            goto L18
        L13:
            m.w2 r0 = new m.w2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8415h
            int r1 = r0.f8416i
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            gg.u r7 = r0.f8414g
            f8.i.I0(r9)     // Catch: s1.m -> L5a
            goto L57
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            return r7
        L2e:
            f8.i.I0(r9)
            gg.u r9 = new gg.u
            r9.<init>()
            m.c1 r1 = m.c1.f8106a
            r9.f4564g = r1
            y1.l2 r1 = r7.B()     // Catch: s1.m -> L5a
            long r3 = r1.b()     // Catch: s1.m -> L5a
            d9.k r1 = new d9.k     // Catch: s1.m -> L5a
            r5 = 0
            r6 = 3
            r1.<init>(r8, r9, r5, r6)     // Catch: s1.m -> L5a
            r0.f8414g = r9     // Catch: s1.m -> L5a
            r0.f8416i = r2     // Catch: s1.m -> L5a
            java.lang.Object r7 = r7.C(r3, r1, r0)     // Catch: s1.m -> L5a
            xf.a r8 = xf.a.f21579g
            if (r7 != r8) goto L56
            return r8
        L56:
            r7 = r9
        L57:
            java.lang.Object r7 = r7.f4564g
            return r7
        L5a:
            m.e1 r7 = m.e1.f8131a
            return r7
    }

    public static final java.lang.Object i(s1.k0 r13, s1.l r14, yf.a r15) {
            boolean r0 = r15 instanceof m.x2
            if (r0 == 0) goto L13
            r0 = r15
            m.x2 r0 = (m.x2) r0
            int r1 = r0.f8423j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8423j = r1
            goto L18
        L13:
            m.x2 r0 = new m.x2
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f8422i
            int r1 = r0.f8423j
            r2 = 2
            r3 = 0
            r4 = 1
            xf.a r5 = xf.a.f21579g
            if (r1 == 0) goto L42
            if (r1 == r4) goto L3a
            if (r1 != r2) goto L33
            s1.l r13 = r0.f8421h
            s1.k0 r14 = r0.f8420g
            f8.i.I0(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La0
        L33:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r13)
            r13 = 0
            return r13
        L3a:
            s1.l r13 = r0.f8421h
            s1.k0 r14 = r0.f8420g
            f8.i.I0(r15)
            goto L55
        L42:
            f8.i.I0(r15)
        L45:
            r0.f8420g = r13
            r0.f8421h = r14
            r0.f8423j = r4
            java.lang.Object r15 = r13.e(r14, r0)
            if (r15 != r5) goto L52
            goto L9f
        L52:
            r12 = r14
            r14 = r13
            r13 = r12
        L55:
            s1.k r15 = (s1.k) r15
            java.lang.Object r15 = r15.f12262a
            int r1 = r15.size()
            r6 = r3
        L5e:
            if (r6 >= r1) goto Lbf
            java.lang.Object r7 = r15.get(r6)
            s1.t r7 = (s1.t) r7
            boolean r7 = s1.s.c(r7)
            if (r7 != 0) goto Lbc
            int r1 = r15.size()
            r6 = r3
        L71:
            if (r6 >= r1) goto L91
            java.lang.Object r7 = r15.get(r6)
            s1.t r7 = (s1.t) r7
            boolean r8 = r7.b()
            if (r8 != 0) goto Lb7
            s1.l0 r8 = r14.f12273l
            long r8 = r8.E
            long r10 = r14.m()
            boolean r7 = s1.s.f(r7, r8, r10)
            if (r7 == 0) goto L8e
            goto Lb7
        L8e:
            int r6 = r6 + 1
            goto L71
        L91:
            r0.f8420g = r14
            r0.f8421h = r13
            r0.f8423j = r2
            s1.l r15 = s1.l.f12276i
            java.lang.Object r15 = r14.e(r15, r0)
            if (r15 != r5) goto L2e
        L9f:
            return r5
        La0:
            s1.k r15 = (s1.k) r15
            java.lang.Object r15 = r15.f12262a
            int r1 = r15.size()
            r6 = r3
        La9:
            if (r6 >= r1) goto L45
            java.lang.Object r7 = r15.get(r6)
            s1.t r7 = (s1.t) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lb9
        Lb7:
            r13 = 0
            return r13
        Lb9:
            int r6 = r6 + 1
            goto La9
        Lbc:
            int r6 = r6 + 1
            goto L5e
        Lbf:
            java.lang.Object r13 = r15.get(r3)
            return r13
    }
}
