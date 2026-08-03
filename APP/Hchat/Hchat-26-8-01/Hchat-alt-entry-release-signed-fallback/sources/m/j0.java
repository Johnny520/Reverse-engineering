package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8216a = 0.0f;

    static {
            r0 = 4593671619917905920(0x3fc0000000000000, double:0.125)
            float r0 = (float) r0
            r1 = 18
            float r1 = (float) r1
            float r0 = r0 / r1
            m.j0.f8216a = r0
            return
    }

    public static final java.lang.Object a(s1.k0 r12, long r13, yf.c r15) {
            boolean r0 = r15 instanceof m.c0
            if (r0 == 0) goto L13
            r0 = r15
            m.c0 r0 = (m.c0) r0
            int r1 = r0.f8105j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8105j = r1
            goto L18
        L13:
            m.c0 r0 = new m.c0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f8104i
            int r1 = r0.f8105j
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            gg.t r12 = r0.f8103h
            s1.k0 r13 = r0.f8102g
            f8.i.I0(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5e
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r12)
            r12 = 0
            return r12
        L34:
            f8.i.I0(r15)
            s1.l0 r15 = r12.f12273l
            s1.k r15 = r15.f12283z
            boolean r15 = e(r15, r13)
            if (r15 == 0) goto L43
            goto Lc3
        L43:
            gg.t r15 = new gg.t
            r15.<init>()
            r15.f4563g = r13
        L4a:
            r0.f8102g = r12
            r0.f8103h = r15
            r0.f8105j = r2
            s1.l r13 = s1.l.f12275h
            java.lang.Object r13 = r12.e(r13, r0)
            xf.a r14 = xf.a.f21579g
            if (r13 != r14) goto L5b
            return r14
        L5b:
            r11 = r15
            r15 = r13
            r13 = r11
        L5e:
            s1.k r15 = (s1.k) r15
            java.lang.Object r14 = r15.f12262a
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L68:
            if (r5 >= r1) goto L7f
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            s1.t r7 = (s1.t) r7
            long r7 = r7.f12291a
            long r9 = r13.f4563g
            boolean r7 = s1.s.e(r7, r9)
            if (r7 == 0) goto L7c
            goto L80
        L7c:
            int r5 = r5 + 1
            goto L68
        L7f:
            r6 = r3
        L80:
            s1.t r6 = (s1.t) r6
            if (r6 != 0) goto L86
            r6 = r3
            goto Lba
        L86:
            boolean r14 = s1.s.d(r6)
            if (r14 == 0) goto Lae
            java.lang.Object r14 = r15.f12262a
            int r15 = r14.size()
        L92:
            if (r4 >= r15) goto La3
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            s1.t r5 = (s1.t) r5
            boolean r5 = r5.f12294d
            if (r5 == 0) goto La0
            goto La4
        La0:
            int r4 = r4 + 1
            goto L92
        La3:
            r1 = r3
        La4:
            s1.t r1 = (s1.t) r1
            if (r1 != 0) goto La9
            goto Lba
        La9:
            long r14 = r1.f12291a
            r13.f4563g = r14
            goto Lc4
        Lae:
            long r14 = s1.s.h(r6, r2)
            r4 = 0
            boolean r14 = e1.b.b(r14, r4)
            if (r14 != 0) goto Lc4
        Lba:
            if (r6 == 0) goto Lc3
            boolean r12 = r6.b()
            if (r12 != 0) goto Lc3
            return r6
        Lc3:
            return r3
        Lc4:
            r15 = r13
            goto L4a
    }

    public static final java.lang.Object b(s1.k0 r8, long r9, yf.a r11) {
            boolean r0 = r11 instanceof m.d0
            if (r0 == 0) goto L13
            r0 = r11
            m.d0 r0 = (m.d0) r0
            int r1 = r0.f8116k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8116k = r1
            goto L18
        L13:
            m.d0 r0 = new m.d0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f8115j
            int r1 = r0.f8116k
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            gg.q r8 = r0.f8114i
            gg.u r9 = r0.f8113h
            s1.t r10 = r0.f8112g
            f8.i.I0(r11)     // Catch: s1.m -> La6
            goto L99
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r8)
            r8 = 0
            return r8
        L34:
            f8.i.I0(r11)
            s1.l0 r11 = r8.f12273l
            s1.k r11 = r11.f12283z
            boolean r11 = e(r11, r9)
            if (r11 == 0) goto L42
            goto La5
        L42:
            s1.l0 r11 = r8.f12273l
            s1.k r11 = r11.f12283z
            java.lang.Object r11 = r11.f12262a
            int r1 = r11.size()
            r4 = 0
        L4d:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r11.get(r4)
            r6 = r5
            s1.t r6 = (s1.t) r6
            long r6 = r6.f12291a
            boolean r6 = s1.s.e(r6, r9)
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r4 = r4 + 1
            goto L4d
        L62:
            r5 = r3
        L63:
            r10 = r5
            s1.t r10 = (s1.t) r10
            if (r10 != 0) goto L69
            goto La5
        L69:
            gg.u r9 = new gg.u
            r9.<init>()
            gg.u r11 = new gg.u
            r11.<init>()
            r11.f4564g = r10
            y1.l2 r1 = r8.B()
            long r4 = r1.b()
            gg.q r1 = new gg.q     // Catch: s1.m -> La6
            r1.<init>()     // Catch: s1.m -> La6
            m.e0 r6 = new m.e0     // Catch: s1.m -> La6
            r6.<init>(r1, r11, r9, r3)     // Catch: s1.m -> La6
            r0.f8112g = r10     // Catch: s1.m -> La6
            r0.f8113h = r9     // Catch: s1.m -> La6
            r0.f8114i = r1     // Catch: s1.m -> La6
            r0.f8116k = r2     // Catch: s1.m -> La6
            java.lang.Object r8 = r8.C(r4, r6, r0)     // Catch: s1.m -> La6
            xf.a r11 = xf.a.f21579g
            if (r8 != r11) goto L98
            return r11
        L98:
            r8 = r1
        L99:
            boolean r8 = r8.f4560g     // Catch: s1.m -> La6
            if (r8 == 0) goto La5
            java.lang.Object r8 = r9.f4564g     // Catch: s1.m -> La6
            s1.t r8 = (s1.t) r8     // Catch: s1.m -> La6
            if (r8 != 0) goto La4
            return r10
        La4:
            return r8
        La5:
            return r3
        La6:
            java.lang.Object r8 = r9.f4564g
            s1.t r8 = (s1.t) r8
            if (r8 != 0) goto Lad
            goto Lae
        Lad:
            r10 = r8
        Lae:
            return r10
    }

    public static final java.lang.Object c(s1.k0 r18, long r19, b0.t r21, yf.a r22) {
            r0 = r19
            r2 = r22
            boolean r3 = r2 instanceof m.f0
            if (r3 == 0) goto L17
            r3 = r2
            m.f0 r3 = (m.f0) r3
            int r4 = r3.f8147n
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f8147n = r4
            goto L1c
        L17:
            m.f0 r3 = new m.f0
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f8146m
            int r4 = r3.f8147n
            r5 = 0
            r7 = 2
            r8 = 1
            r9 = 0
            xf.a r10 = xf.a.f21579g
            if (r4 == 0) goto L65
            if (r4 == r8) goto L51
            if (r4 != r7) goto L4a
            float r0 = r3.f8145l
            s1.t r1 = r3.f8144k
            m.a3 r4 = r3.f8143j
            gg.t r11 = r3.f8142i
            s1.k0 r12 = r3.f8141h
            fg.p r13 = r3.f8140g
            f8.i.I0(r2)
            r22 = r12
            r12 = r11
            r11 = r22
            r15 = r7
            r2 = r8
            r22 = r9
            r6 = r5
            r5 = r0
            r0 = r13
            goto L166
        L4a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            r0 = 0
            return r0
        L51:
            float r0 = r3.f8145l
            m.a3 r1 = r3.f8143j
            gg.t r4 = r3.f8142i
            s1.k0 r11 = r3.f8141h
            fg.p r12 = r3.f8140g
            f8.i.I0(r2)
            r17 = r4
            r4 = r0
            r0 = r12
        L62:
            r12 = r17
            goto Lac
        L65:
            f8.i.I0(r2)
            r2 = r18
            s1.l0 r4 = r2.f12273l
            s1.k r4 = r4.f12283z
            boolean r4 = e(r4, r0)
            if (r4 == 0) goto L78
            r22 = r9
            goto L16c
        L78:
            y1.l2 r4 = r2.B()
            float r4 = r4.f()
            gg.t r11 = new gg.t
            r11.<init>()
            r11.f4563g = r0
            m.a3 r0 = new m.a3
            r0.<init>(r5, r9)
            r1 = r0
            r0 = r21
        L8f:
            r3.f8140g = r0
            r3.f8141h = r2
            r3.f8142i = r11
            r3.f8143j = r1
            r3.f8144k = r9
            r3.f8145l = r4
            r3.f8147n = r8
            s1.l r12 = s1.l.f12275h
            java.lang.Object r12 = r2.e(r12, r3)
            if (r12 != r10) goto La7
            goto L15f
        La7:
            r17 = r11
            r11 = r2
            r2 = r12
            goto L62
        Lac:
            s1.k r2 = (s1.k) r2
            java.lang.Object r13 = r2.f12262a
            int r14 = r13.size()
            r22 = r9
            r9 = 0
        Lb7:
            if (r9 >= r14) goto Ld3
            java.lang.Object r16 = r13.get(r9)
            r15 = r16
            s1.t r15 = (s1.t) r15
            long r5 = r15.f12291a
            long r7 = r12.f4563g
            boolean r5 = s1.s.e(r5, r7)
            if (r5 == 0) goto Lcc
            goto Ld5
        Lcc:
            int r9 = r9 + 1
            r5 = 0
            r7 = 2
            r8 = 1
            goto Lb7
        Ld3:
            r16 = r22
        Ld5:
            r5 = r16
            s1.t r5 = (s1.t) r5
            if (r5 != 0) goto Ldd
            goto L16c
        Ldd:
            boolean r6 = r5.b()
            if (r6 == 0) goto Le5
            goto L16c
        Le5:
            boolean r6 = s1.s.d(r5)
            if (r6 == 0) goto L112
            java.lang.Object r2 = r2.f12262a
            int r5 = r2.size()
            r6 = 0
        Lf2:
            if (r6 >= r5) goto L103
            java.lang.Object r7 = r2.get(r6)
            r8 = r7
            s1.t r8 = (s1.t) r8
            boolean r8 = r8.f12294d
            if (r8 == 0) goto L100
            goto L105
        L100:
            int r6 = r6 + 1
            goto Lf2
        L103:
            r7 = r22
        L105:
            s1.t r7 = (s1.t) r7
            if (r7 != 0) goto L10a
            goto L16c
        L10a:
            long r5 = r7.f12291a
            r12.f4563g = r5
            r2 = 1
            r6 = 0
            goto L13d
        L112:
            r2 = 1
            long r6 = s1.s.h(r5, r2)
            long r6 = r1.a(r6, r4, r2)
            r8 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r8 = r8 & r6
            r13 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r8 == 0) goto L146
            e1.b r8 = new e1.b
            r8.<init>(r6)
            r0.invoke(r5, r8)
            boolean r6 = r5.b()
            if (r6 == 0) goto L139
            return r5
        L139:
            r6 = 0
            r1.f8078b = r6
        L13d:
            r9 = r22
            r8 = r2
            r5 = r6
            r2 = r11
            r11 = r12
            r7 = 2
            goto L8f
        L146:
            r6 = 0
            r3.f8140g = r0
            r3.f8141h = r11
            r3.f8142i = r12
            r3.f8143j = r1
            r3.f8144k = r5
            r3.f8145l = r4
            r15 = 2
            r3.f8147n = r15
            s1.l r8 = s1.l.f12276i
            java.lang.Object r8 = r11.e(r8, r3)
            if (r8 != r10) goto L160
        L15f:
            return r10
        L160:
            r17 = r4
            r4 = r1
            r1 = r5
            r5 = r17
        L166:
            boolean r1 = r1.b()
            if (r1 == 0) goto L16d
        L16c:
            return r22
        L16d:
            r9 = r22
            r8 = r2
            r1 = r4
            r4 = r5
            r5 = r6
            r2 = r11
            r11 = r12
            r7 = r15
            goto L8f
    }

    public static final java.lang.Object d(s1.k0 r4, long r5, fg.l r7, yf.a r8) {
            boolean r0 = r8 instanceof m.h0
            if (r0 == 0) goto L13
            r0 = r8
            m.h0 r0 = (m.h0) r0
            int r1 = r0.f8181j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8181j = r1
            goto L18
        L13:
            m.h0 r0 = new m.h0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8180i
            int r1 = r0.f8181j
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            fg.l r4 = r0.f8179h
            s1.k0 r5 = r0.f8178g
            f8.i.I0(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r4 = 0
            return r4
        L32:
            f8.i.I0(r8)
        L35:
            r0.f8178g = r4
            r0.f8179h = r7
            r0.f8181j = r2
            java.lang.Object r8 = a(r4, r5, r0)
            xf.a r5 = xf.a.f21579g
            if (r8 != r5) goto L44
            return r5
        L44:
            s1.t r8 = (s1.t) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = s1.s.d(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.f12291a
            goto L35
    }

    public static final boolean e(s1.k r6, long r7) {
            java.lang.Object r6 = r6.f12262a
            int r0 = r6.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1d
            java.lang.Object r3 = r6.get(r2)
            r4 = r3
            s1.t r4 = (s1.t) r4
            long r4 = r4.f12291a
            boolean r4 = s1.s.e(r4, r7)
            if (r4 == 0) goto L1a
            goto L1e
        L1a:
            int r2 = r2 + 1
            goto L8
        L1d:
            r3 = 0
        L1e:
            s1.t r3 = (s1.t) r3
            r6 = 1
            if (r3 == 0) goto L28
            boolean r7 = r3.f12294d
            if (r7 != r6) goto L28
            r1 = r6
        L28:
            r6 = r6 ^ r1
            return r6
    }

    public static final float f(y1.l2 r1, int r2) {
            r0 = 2
            if (r2 != r0) goto Lb
            float r1 = r1.f()
            float r2 = m.j0.f8216a
            float r1 = r1 * r2
            return r1
        Lb:
            float r1 = r1.f()
            return r1
    }

    public static final java.lang.Object g(s1.k0 r28, s1.t r29, k.s1 r30, f0.h r31, b0.t r32, w.t0 r33, b0.d0 r34, yf.a r35) {
            r0 = r28
            r1 = r35
            boolean r2 = r1 instanceof m.i0
            if (r2 == 0) goto L17
            r2 = r1
            m.i0 r2 = (m.i0) r2
            int r3 = r2.f8203v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f8203v = r3
            goto L1c
        L17:
            m.i0 r2 = new m.i0
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f8202u
            int r3 = r2.f8203v
            s1.l r5 = s1.l.f12276i
            s1.l r6 = s1.l.f12275h
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            xf.a r8 = xf.a.f21579g
            switch(r3) {
                case 0: goto L1ea;
                case 1: goto L1be;
                case 2: goto L170;
                case 3: goto L123;
                case 4: goto Lf1;
                case 5: goto La4;
                case 6: goto L59;
                case 7: goto L35;
                default: goto L2e;
            }
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            r0 = 0
            return r0
        L35:
            java.lang.Object r0 = r2.f8193l
            gg.t r0 = (gg.t) r0
            java.lang.Object r3 = r2.f8192k
            s1.k0 r3 = (s1.k0) r3
            java.lang.Object r4 = r2.f8191j
            s1.k0 r4 = (s1.k0) r4
            sf.b r5 = r2.f8190i
            fg.l r5 = (fg.l) r5
            java.lang.Object r9 = r2.f8189h
            fg.a r9 = (fg.a) r9
            java.lang.Object r10 = r2.f8188g
            fg.p r10 = (fg.p) r10
            f8.i.I0(r1)
            r7 = r5
            r15 = 0
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r8
            goto L691
        L59:
            float r0 = r2.f8201t
            s1.t r3 = r2.f8199r
            m.a3 r4 = r2.f8198q
            gg.t r9 = r2.f8197p
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            java.lang.Object r10 = r2.f8196o
            s1.k0 r10 = (s1.k0) r10
            java.lang.Object r11 = r2.f8195n
            gg.t r11 = (gg.t) r11
            java.lang.Object r14 = r2.f8194m
            s1.t r14 = (s1.t) r14
            java.lang.Object r12 = r2.f8193l
            fg.l r12 = (fg.l) r12
            java.lang.Object r13 = r2.f8192k
            fg.a r13 = (fg.a) r13
            java.lang.Object r15 = r2.f8191j
            fg.p r15 = (fg.p) r15
            sf.b r7 = r2.f8190i
            fg.q r7 = (fg.q) r7
            r28 = r0
            java.lang.Object r0 = r2.f8189h
            m.p1 r0 = (m.p1) r0
            r29 = r0
            java.lang.Object r0 = r2.f8188g
            s1.k0 r0 = (s1.k0) r0
            f8.i.I0(r1)
            r1 = r15
            r15 = r10
            r10 = r1
            r1 = r0
            r23 = r6
            r0 = r8
            r8 = r9
            r6 = r11
            r9 = r5
            r11 = r7
            r7 = r12
            r12 = r29
            r5 = r4
            r4 = r28
            goto L5f1
        La4:
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            float r0 = r2.f8201t
            m.a3 r3 = r2.f8198q
            gg.t r4 = r2.f8197p
            java.lang.Object r7 = r2.f8196o
            s1.k0 r7 = (s1.k0) r7
            java.lang.Object r9 = r2.f8195n
            gg.t r9 = (gg.t) r9
            java.lang.Object r10 = r2.f8194m
            s1.t r10 = (s1.t) r10
            java.lang.Object r11 = r2.f8193l
            fg.l r11 = (fg.l) r11
            java.lang.Object r12 = r2.f8192k
            fg.a r12 = (fg.a) r12
            java.lang.Object r13 = r2.f8191j
            fg.p r13 = (fg.p) r13
            sf.b r14 = r2.f8190i
            fg.q r14 = (fg.q) r14
            java.lang.Object r15 = r2.f8189h
            m.p1 r15 = (m.p1) r15
            r28 = r0
            java.lang.Object r0 = r2.f8188g
            s1.k0 r0 = (s1.k0) r0
            f8.i.I0(r1)
            r23 = r4
            r4 = r28
            r28 = r1
            r1 = r3
            r3 = r2
            r2 = r0
            r0 = r8
            r8 = r23
            r23 = r14
            r14 = r7
            r7 = r11
            r11 = r23
            r23 = r6
            r6 = r9
            r9 = r12
            r12 = r15
            goto L4ec
        Lf1:
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            java.lang.Object r0 = r2.f8196o
            gg.t r0 = (gg.t) r0
            java.lang.Object r3 = r2.f8195n
            s1.t r3 = (s1.t) r3
            java.lang.Object r4 = r2.f8194m
            s1.t r4 = (s1.t) r4
            java.lang.Object r7 = r2.f8193l
            fg.l r7 = (fg.l) r7
            java.lang.Object r9 = r2.f8192k
            fg.a r9 = (fg.a) r9
            java.lang.Object r10 = r2.f8191j
            fg.p r10 = (fg.p) r10
            sf.b r11 = r2.f8190i
            fg.q r11 = (fg.q) r11
            java.lang.Object r12 = r2.f8189h
            m.p1 r12 = (m.p1) r12
            java.lang.Object r13 = r2.f8188g
            s1.k0 r13 = (s1.k0) r13
            f8.i.I0(r1)
            r23 = r6
            r6 = r0
            r0 = r8
            goto L42b
        L123:
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            float r0 = r2.f8201t
            s1.t r3 = r2.f8199r
            m.a3 r7 = r2.f8198q
            gg.t r9 = r2.f8197p
            java.lang.Object r10 = r2.f8196o
            s1.k0 r10 = (s1.k0) r10
            java.lang.Object r11 = r2.f8195n
            gg.t r11 = (gg.t) r11
            java.lang.Object r12 = r2.f8194m
            s1.t r12 = (s1.t) r12
            java.lang.Object r13 = r2.f8193l
            fg.l r13 = (fg.l) r13
            java.lang.Object r14 = r2.f8192k
            fg.a r14 = (fg.a) r14
            java.lang.Object r15 = r2.f8191j
            fg.p r15 = (fg.p) r15
            sf.b r4 = r2.f8190i
            fg.q r4 = (fg.q) r4
            r28 = r0
            java.lang.Object r0 = r2.f8189h
            m.p1 r0 = (m.p1) r0
            r29 = r0
            java.lang.Object r0 = r2.f8188g
            s1.k0 r0 = (s1.k0) r0
            f8.i.I0(r1)
            r1 = r13
            r13 = r0
            r0 = r8
            r8 = r10
            r10 = r1
            r1 = r11
            r11 = r5
            r5 = r7
            r7 = r15
            r15 = r1
            r25 = r28
            r23 = r6
            r1 = r12
            r12 = r9
            r9 = r4
            r4 = r29
            goto L3a8
        L170:
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            float r0 = r2.f8201t
            m.a3 r3 = r2.f8198q
            gg.t r4 = r2.f8197p
            java.lang.Object r7 = r2.f8196o
            s1.k0 r7 = (s1.k0) r7
            java.lang.Object r9 = r2.f8195n
            gg.t r9 = (gg.t) r9
            java.lang.Object r10 = r2.f8194m
            s1.t r10 = (s1.t) r10
            java.lang.Object r11 = r2.f8193l
            fg.l r11 = (fg.l) r11
            java.lang.Object r12 = r2.f8192k
            fg.a r12 = (fg.a) r12
            java.lang.Object r13 = r2.f8191j
            fg.p r13 = (fg.p) r13
            sf.b r14 = r2.f8190i
            fg.q r14 = (fg.q) r14
            java.lang.Object r15 = r2.f8189h
            m.p1 r15 = (m.p1) r15
            r28 = r0
            java.lang.Object r0 = r2.f8188g
            s1.k0 r0 = (s1.k0) r0
            f8.i.I0(r1)
            r23 = r0
            r0 = r28
            r28 = r1
            r1 = r3
            r3 = r15
            r15 = r9
            r9 = r14
            r14 = r23
            r23 = r12
            r12 = r4
            r4 = r23
            r23 = r13
            r13 = r7
            r7 = r23
        L1ba:
            r23 = r6
            goto L2a8
        L1be:
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r0 = r2.f8200s
            java.lang.Object r3 = r2.f8194m
            fg.l r3 = (fg.l) r3
            java.lang.Object r4 = r2.f8193l
            fg.a r4 = (fg.a) r4
            java.lang.Object r7 = r2.f8192k
            fg.p r7 = (fg.p) r7
            java.lang.Object r9 = r2.f8191j
            fg.q r9 = (fg.q) r9
            sf.b r10 = r2.f8190i
            m.p1 r10 = (m.p1) r10
            java.lang.Object r11 = r2.f8189h
            s1.t r11 = (s1.t) r11
            java.lang.Object r12 = r2.f8188g
            s1.k0 r12 = (s1.k0) r12
            f8.i.I0(r1)
            r27 = r10
            r10 = r3
            r3 = r27
            goto L231
        L1ea:
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            f8.i.I0(r1)
            r30.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L200
            r29.a()
        L200:
            r2.f8188g = r0
            r3 = r29
            r2.f8189h = r3
            r4 = 0
            r2.f8190i = r4
            r4 = r31
            r2.f8191j = r4
            r7 = r32
            r2.f8192k = r7
            r9 = r33
            r2.f8193l = r9
            r10 = r34
            r2.f8194m = r10
            r2.f8200s = r1
            r11 = 1
            r2.f8203v = r11
            r11 = 2
            java.lang.Object r12 = m.y2.b(r0, r2, r11)
            if (r12 != r8) goto L228
        L225:
            r0 = r8
            goto L687
        L228:
            r11 = r12
            r12 = r0
            r0 = r1
            r1 = r11
            r11 = r9
            r9 = r4
            r4 = r11
            r11 = r3
            r3 = 0
        L231:
            s1.t r1 = (s1.t) r1
            gg.t r13 = new gg.t
            r13.<init>()
            r14 = 0
            r13.f4563g = r14
            if (r0 == 0) goto L3d7
        L23e:
            long r14 = r1.f12291a
            int r0 = r1.f12299i
            s1.l0 r11 = r12.f12273l
            s1.k r11 = r11.f12283z
            boolean r11 = e(r11, r14)
            if (r11 == 0) goto L253
            r11 = r5
            r23 = r6
            r0 = r8
        L250:
            r5 = 0
            goto L3b4
        L253:
            y1.l2 r11 = r12.B()
            float r0 = f(r11, r0)
            gg.t r11 = new gg.t
            r11.<init>()
            r11.f4563g = r14
            m.a3 r14 = new m.a3
            r28 = r0
            r15 = r1
            r0 = 0
            r14.<init>(r0, r3)
            r0 = r28
            r1 = r15
            r15 = r14
            r14 = r13
            r13 = r12
        L272:
            r2.f8188g = r13
            r2.f8189h = r3
            r2.f8190i = r9
            r2.f8191j = r7
            r2.f8192k = r4
            r2.f8193l = r10
            r2.f8194m = r1
            r2.f8195n = r14
            r2.f8196o = r12
            r2.f8197p = r11
            r2.f8198q = r15
            r28 = r1
            r1 = 0
            r2.f8199r = r1
            r2.f8201t = r0
            r1 = 2
            r2.f8203v = r1
            java.lang.Object r1 = r12.e(r6, r2)
            if (r1 != r8) goto L299
            goto L225
        L299:
            r23 = r10
            r10 = r28
            r28 = r1
            r1 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r23
            goto L1ba
        L2a8:
            r6 = r28
            s1.k r6 = (s1.k) r6
            r24 = r8
            java.lang.Object r8 = r6.f12262a
            r25 = r5
            int r5 = r8.size()
            r28 = r13
            r13 = 0
        L2b9:
            if (r13 >= r5) goto L2e1
            java.lang.Object r26 = r8.get(r13)
            r29 = r5
            r5 = r26
            s1.t r5 = (s1.t) r5
            r30 = r10
            r31 = r11
            long r10 = r5.f12291a
            r32 = r4
            long r4 = r12.f4563g
            boolean r4 = s1.s.e(r10, r4)
            if (r4 == 0) goto L2d6
            goto L2e9
        L2d6:
            int r13 = r13 + 1
            r5 = r29
            r10 = r30
            r11 = r31
            r4 = r32
            goto L2b9
        L2e1:
            r32 = r4
            r30 = r10
            r31 = r11
            r26 = 0
        L2e9:
            r4 = r26
            s1.t r4 = (s1.t) r4
            if (r4 != 0) goto L2fd
        L2ef:
            r1 = r30
            r10 = r31
            r4 = r32
            r12 = r14
            r13 = r15
            r0 = r24
            r11 = r25
            goto L250
        L2fd:
            boolean r5 = r4.b()
            if (r5 == 0) goto L304
            goto L2ef
        L304:
            boolean r5 = s1.s.d(r4)
            if (r5 == 0) goto L32d
            java.lang.Object r4 = r6.f12262a
            int r5 = r4.size()
            r6 = 0
        L311:
            if (r6 >= r5) goto L322
            java.lang.Object r8 = r4.get(r6)
            r10 = r8
            s1.t r10 = (s1.t) r10
            boolean r10 = r10.f12294d
            if (r10 == 0) goto L31f
            goto L323
        L31f:
            int r6 = r6 + 1
            goto L311
        L322:
            r8 = 0
        L323:
            s1.t r8 = (s1.t) r8
            if (r8 != 0) goto L328
            goto L2ef
        L328:
            long r4 = r8.f12291a
            r12.f4563g = r4
            goto L35a
        L32d:
            r11 = 1
            long r5 = s1.s.h(r4, r11)
            long r5 = r1.a(r5, r0, r11)
            long r10 = r5 & r18
            int r8 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r8 == 0) goto L36e
            r4.a()
            r15.f4563g = r5
            boolean r5 = r4.b()
            if (r5 == 0) goto L356
            r1 = r30
            r10 = r31
            r5 = r4
            r12 = r14
            r13 = r15
            r0 = r24
            r11 = r25
            r4 = r32
            goto L3b4
        L356:
            r4 = 0
            r1.f8078b = r4
        L35a:
            r10 = r31
            r4 = r32
            r11 = r12
            r13 = r14
            r14 = r15
            r6 = r23
            r8 = r24
            r5 = r25
            r12 = r28
            r15 = r1
            r1 = r30
            goto L272
        L36e:
            r2.f8188g = r14
            r2.f8189h = r3
            r2.f8190i = r9
            r2.f8191j = r7
            r5 = r32
            r2.f8192k = r5
            r10 = r31
            r2.f8193l = r10
            r6 = r30
            r2.f8194m = r6
            r2.f8195n = r15
            r8 = r28
            r2.f8196o = r8
            r2.f8197p = r12
            r2.f8198q = r1
            r2.f8199r = r4
            r2.f8201t = r0
            r11 = 3
            r2.f8203v = r11
            r11 = r25
            java.lang.Object r13 = r8.e(r11, r2)
            r25 = r0
            r0 = r24
            if (r13 != r0) goto L3a1
            goto L687
        L3a1:
            r13 = r4
            r4 = r3
            r3 = r13
            r13 = r14
            r14 = r5
            r5 = r1
            r1 = r6
        L3a8:
            boolean r3 = r3.b()
            if (r3 == 0) goto L3c9
            r3 = r4
            r12 = r13
            r4 = r14
            r13 = r15
            goto L250
        L3b4:
            if (r5 == 0) goto L3c3
            boolean r6 = r5.b()
            if (r6 == 0) goto L3bd
            goto L3c3
        L3bd:
            r8 = r0
            r5 = r11
            r6 = r23
            goto L23e
        L3c3:
            r27 = r11
            r11 = r5
            r5 = r27
            goto L3da
        L3c9:
            r3 = r4
            r4 = r14
            r14 = r15
            r6 = r23
            r15 = r5
            r5 = r11
            r11 = r12
            r12 = r8
            r8 = r0
            r0 = r25
            goto L272
        L3d7:
            r23 = r6
            r0 = r8
        L3da:
            if (r11 != 0) goto L632
            s1.l0 r6 = r12.f12273l
            s1.k r6 = r6.f12283z
            java.lang.Object r6 = r6.f12262a
            int r8 = r6.size()
            r14 = 0
        L3e7:
            if (r14 >= r8) goto L632
            java.lang.Object r15 = r6.get(r14)
            s1.t r15 = (s1.t) r15
            boolean r15 = r15.f12294d
            if (r15 == 0) goto L62a
            r27 = r4
            r4 = r1
            r1 = r12
            r12 = r3
            r3 = r11
            r11 = r9
            r9 = r27
            r27 = r10
            r10 = r7
            r7 = r27
        L401:
            r2.f8188g = r1
            r2.f8189h = r12
            r2.f8190i = r11
            r2.f8191j = r10
            r2.f8192k = r9
            r2.f8193l = r7
            r2.f8194m = r4
            r2.f8195n = r3
            r2.f8196o = r13
            r6 = 0
            r2.f8197p = r6
            r2.f8198q = r6
            r2.f8199r = r6
            r6 = 4
            r2.f8203v = r6
            java.lang.Object r6 = r1.e(r5, r2)
            if (r6 != r0) goto L425
            goto L687
        L425:
            r27 = r13
            r13 = r1
            r1 = r6
            r6 = r27
        L42b:
            s1.k r1 = (s1.k) r1
            java.lang.Object r1 = r1.f12262a
            int r8 = r1.size()
            r14 = 0
        L434:
            if (r14 >= r8) goto L45c
            java.lang.Object r15 = r1.get(r14)
            s1.t r15 = (s1.t) r15
            boolean r15 = r15.b()
            if (r15 == 0) goto L459
            int r8 = r1.size()
            r14 = 0
        L447:
            if (r14 >= r8) goto L45c
            java.lang.Object r15 = r1.get(r14)
            s1.t r15 = (s1.t) r15
            boolean r15 = r15.f12294d
            if (r15 == 0) goto L456
            r1 = r13
            r13 = r6
            goto L401
        L456:
            int r14 = r14 + 1
            goto L447
        L459:
            int r14 = r14 + 1
            goto L434
        L45c:
            int r8 = r1.size()
            r14 = 0
        L461:
            if (r14 >= r8) goto L61a
            java.lang.Object r15 = r1.get(r14)
            s1.t r15 = (s1.t) r15
            boolean r15 = r15.f12294d
            if (r15 == 0) goto L610
            java.lang.Object r1 = tf.m.v1(r1)
            s1.t r1 = (s1.t) r1
            if (r1 == 0) goto L47a
            long r14 = r1.f12293c
        L477:
            r28 = r2
            goto L47d
        L47a:
            r14 = 0
            goto L477
        L47d:
            long r1 = r4.f12293c
            long r1 = e1.b.d(r14, r1)
            long r14 = r4.f12291a
            int r3 = r4.f12299i
            s1.l0 r8 = r13.f12273l
            s1.k r8 = r8.f12283z
            boolean r8 = e(r8, r14)
            if (r8 == 0) goto L49f
            r1 = r10
            r10 = r7
            r7 = r1
            r2 = r28
            r1 = r4
            r4 = r9
            r3 = r12
            r12 = r13
            r9 = r5
            r13 = r6
            r5 = 0
            goto L600
        L49f:
            y1.l2 r8 = r13.B()
            float r3 = f(r8, r3)
            gg.t r8 = new gg.t
            r8.<init>()
            r8.f4563g = r14
            m.a3 r14 = new m.a3
            r14.<init>(r1, r12)
            r2 = r28
            r1 = r13
        L4b6:
            r2.f8188g = r1
            r2.f8189h = r12
            r2.f8190i = r11
            r2.f8191j = r10
            r2.f8192k = r9
            r2.f8193l = r7
            r2.f8194m = r4
            r2.f8195n = r6
            r2.f8196o = r13
            r2.f8197p = r8
            r2.f8198q = r14
            r15 = 0
            r2.f8199r = r15
            r2.f8201t = r3
            r15 = 5
            r2.f8203v = r15
            r22 = r1
            r15 = r23
            java.lang.Object r1 = r13.e(r15, r2)
            if (r1 != r0) goto L4e0
            goto L687
        L4e0:
            r28 = r1
            r1 = r14
            r23 = r15
            r14 = r13
            r13 = r10
            r10 = r4
            r4 = r3
            r3 = r2
            r2 = r22
        L4ec:
            r15 = r28
            s1.k r15 = (s1.k) r15
            r24 = r0
            java.lang.Object r0 = r15.f12262a
            r25 = r5
            int r5 = r0.size()
            r22 = r14
            r14 = 0
        L4fd:
            if (r14 >= r5) goto L525
            java.lang.Object r26 = r0.get(r14)
            r28 = r0
            r0 = r26
            s1.t r0 = (s1.t) r0
            r30 = r9
            r29 = r10
            long r9 = r0.f12291a
            r0 = r13
            r31 = r14
            long r13 = r8.f4563g
            boolean r9 = s1.s.e(r9, r13)
            if (r9 == 0) goto L51b
            goto L52c
        L51b:
            int r14 = r31 + 1
            r10 = r29
            r9 = r30
            r13 = r0
            r0 = r28
            goto L4fd
        L525:
            r30 = r9
            r29 = r10
            r0 = r13
            r26 = 0
        L52c:
            r5 = r26
            s1.t r5 = (s1.t) r5
            if (r5 != 0) goto L544
        L532:
            r1 = r12
            r12 = r2
            r2 = r3
            r3 = r1
            r1 = r29
            r4 = r30
            r13 = r6
            r10 = r7
            r9 = r25
            r5 = 0
        L53f:
            r7 = r0
            r0 = r24
            goto L600
        L544:
            boolean r9 = r5.b()
            if (r9 == 0) goto L54b
            goto L532
        L54b:
            boolean r9 = s1.s.d(r5)
            if (r9 == 0) goto L576
            java.lang.Object r5 = r15.f12262a
            int r9 = r5.size()
            r10 = 0
        L558:
            if (r10 >= r9) goto L569
            java.lang.Object r13 = r5.get(r10)
            r14 = r13
            s1.t r14 = (s1.t) r14
            boolean r14 = r14.f12294d
            if (r14 == 0) goto L566
            goto L56a
        L566:
            int r10 = r10 + 1
            goto L558
        L569:
            r13 = 0
        L56a:
            s1.t r13 = (s1.t) r13
            if (r13 != 0) goto L56f
            goto L532
        L56f:
            long r9 = r13.f12291a
            r8.f4563g = r9
            r9 = 0
            goto L5a6
        L576:
            r9 = 1
            long r13 = s1.s.h(r5, r9)
            long r13 = r1.a(r13, r4, r9)
            long r9 = r13 & r18
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 == 0) goto L5b7
            r5.a()
            r9 = 0
            long r13 = s1.s.h(r5, r9)
            r6.f4563g = r13
            boolean r9 = r5.b()
            if (r9 == 0) goto L5a2
            r1 = r12
            r12 = r2
            r2 = r3
            r3 = r1
            r1 = r29
            r4 = r30
            r13 = r6
            r10 = r7
            r9 = r25
            goto L53f
        L5a2:
            r9 = 0
            r1.f8078b = r9
        L5a6:
            r9 = r30
            r10 = r0
            r14 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r13 = r22
            r0 = r24
            r5 = r25
            r4 = r29
            goto L4b6
        L5b7:
            r9 = 0
            r3.f8188g = r2
            r3.f8189h = r12
            r3.f8190i = r11
            r3.f8191j = r0
            r13 = r30
            r3.f8192k = r13
            r3.f8193l = r7
            r14 = r29
            r3.f8194m = r14
            r3.f8195n = r6
            r15 = r22
            r3.f8196o = r15
            r3.f8197p = r8
            r3.f8198q = r1
            r3.f8199r = r5
            r3.f8201t = r4
            r9 = 6
            r3.f8203v = r9
            r9 = r25
            java.lang.Object r10 = r15.e(r9, r3)
            r22 = r0
            r0 = r24
            if (r10 != r0) goto L5ea
            goto L687
        L5ea:
            r10 = r5
            r5 = r1
            r1 = r2
            r2 = r3
            r3 = r10
            r10 = r22
        L5f1:
            boolean r3 = r3.b()
            if (r3 == 0) goto L608
            r3 = r10
            r10 = r7
            r7 = r3
            r3 = r12
            r4 = r13
            r5 = 0
            r12 = r1
            r13 = r6
            r1 = r14
        L600:
            r27 = r11
            r11 = r5
            r5 = r9
            r9 = r27
            goto L3da
        L608:
            r3 = r4
            r4 = r14
            r14 = r5
            r5 = r9
            r9 = r13
            r13 = r15
            goto L4b6
        L610:
            r28 = r2
            r25 = r5
            r20 = 0
            int r14 = r14 + 1
            goto L461
        L61a:
            r28 = r2
            r20 = 0
            r1 = r10
            r10 = r7
            r7 = r1
            r1 = r4
            r4 = r9
            r9 = r11
            r11 = r3
            r3 = r12
            r12 = r13
            r13 = r6
            goto L3da
        L62a:
            r25 = r5
            r20 = 0
            int r14 = r14 + 1
            goto L3e7
        L632:
            if (r11 == 0) goto L750
            long r5 = r13.f4563g
            e1.b r3 = new e1.b
            r3.<init>(r5)
            r9.b(r1, r11, r3)
            long r5 = r13.f4563g
            e1.b r1 = new e1.b
            r1.<init>(r5)
            r7.invoke(r11, r1)
            long r5 = r11.f12291a
            s1.l0 r1 = r12.f12273l
            s1.k r1 = r1.f12283z
            boolean r1 = e(r1, r5)
            if (r1 == 0) goto L657
            r7 = 0
            goto L72a
        L657:
            gg.t r1 = new gg.t
            r1.<init>()
            r1.f4563g = r5
            r9 = r4
            r5 = r10
            r3 = r12
            r4 = r3
            r10 = r7
        L663:
            r2.f8188g = r10
            r2.f8189h = r9
            r2.f8190i = r5
            r2.f8191j = r4
            r2.f8192k = r3
            r2.f8193l = r1
            r15 = 0
            r2.f8194m = r15
            r2.f8195n = r15
            r2.f8196o = r15
            r2.f8197p = r15
            r2.f8198q = r15
            r2.f8199r = r15
            r6 = 7
            r2.f8203v = r6
            r6 = r23
            java.lang.Object r7 = r3.e(r6, r2)
            if (r7 != r0) goto L688
        L687:
            return r0
        L688:
            r27 = r2
            r2 = r1
            r1 = r7
            r7 = r5
            r5 = r4
            r4 = r3
            r3 = r27
        L691:
            s1.k r1 = (s1.k) r1
            java.lang.Object r8 = r1.f12262a
            int r11 = r8.size()
            r12 = 0
        L69a:
            if (r12 >= r11) goto L6c2
            java.lang.Object r13 = r8.get(r12)
            r14 = r13
            s1.t r14 = (s1.t) r14
            r28 = r3
            r29 = r4
            long r3 = r14.f12291a
            r30 = r5
            r23 = r6
            long r5 = r2.f4563g
            boolean r3 = s1.s.e(r3, r5)
            if (r3 == 0) goto L6b7
            r4 = r13
            goto L6cb
        L6b7:
            int r12 = r12 + 1
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r23
            goto L69a
        L6c2:
            r28 = r3
            r29 = r4
            r30 = r5
            r23 = r6
            r4 = r15
        L6cb:
            s1.t r4 = (s1.t) r4
            if (r4 != 0) goto L6d2
            r4 = r15
        L6d0:
            r11 = 1
            goto L714
        L6d2:
            boolean r3 = s1.s.d(r4)
            if (r3 == 0) goto L6fc
            java.lang.Object r1 = r1.f12262a
            int r3 = r1.size()
            r5 = 0
        L6df:
            if (r5 >= r3) goto L6f0
            java.lang.Object r6 = r1.get(r5)
            r8 = r6
            s1.t r8 = (s1.t) r8
            boolean r8 = r8.f12294d
            if (r8 == 0) goto L6ed
            goto L6f1
        L6ed:
            int r5 = r5 + 1
            goto L6df
        L6f0:
            r6 = r15
        L6f1:
            s1.t r6 = (s1.t) r6
            if (r6 != 0) goto L6f6
            goto L6d0
        L6f6:
            long r3 = r6.f12291a
            r2.f4563g = r3
            r11 = 1
            goto L70a
        L6fc:
            r11 = 1
            long r5 = s1.s.h(r4, r11)
            float r1 = e1.b.c(r5)
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L714
        L70a:
            r3 = r29
            r4 = r30
            r1 = r2
            r5 = r7
            r2 = r28
            goto L663
        L714:
            if (r4 != 0) goto L71a
        L716:
            r10 = r7
            r4 = r9
            r7 = r15
            goto L72a
        L71a:
            boolean r1 = r4.b()
            if (r1 == 0) goto L721
            goto L716
        L721:
            boolean r1 = s1.s.d(r4)
            if (r1 == 0) goto L734
            r10 = r7
            r7 = r4
            r4 = r9
        L72a:
            if (r7 != 0) goto L730
            r4.invoke()
            goto L750
        L730:
            r10.invoke(r7)
            goto L750
        L734:
            r1 = 0
            long r2 = s1.s.h(r4, r1)
            e1.b r5 = new e1.b
            r5.<init>(r2)
            r10.invoke(r4, r5)
            r4.a()
            long r5 = r4.f12291a
            r2 = r10
            r10 = r7
            r7 = r2
            r2 = r28
            r12 = r30
            r4 = r9
            goto L657
        L750:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
