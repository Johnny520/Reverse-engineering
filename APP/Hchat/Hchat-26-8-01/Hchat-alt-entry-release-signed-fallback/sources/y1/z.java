package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends g3.b implements android.view.View.OnAttachStateChangeListener, android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    public static final f.v T = null;
    public java.lang.Integer A;
    public final f.f B;
    public final sg.c C;
    public boolean D;
    public y1.v E;
    public f.w F;
    public final f.x G;
    public final f.u H;
    public final f.u I;
    public final java.lang.String J;
    public final java.lang.String K;
    public final b5.c L;
    public final f.w M;
    public y1.f2 N;
    public boolean O;
    public final f.u P;
    public final wb.cr Q;
    public final java.util.ArrayList R;
    public final y1.y S;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y1.t f22166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y1.y f22168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityManager f22169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f22170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.util.List f22171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y1.u f22172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h3.g f22175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h3.g f22176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f22177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f.w f22178v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f.w f22179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f.t0 f22180x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f.t0 f22181y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f22182z;

    static {
            r0 = 32
            int[] r1 = new int[r0]
            r1 = {x0034: FILL_ARRAY_DATA , data: [2131099649, 2131099650, 2131099661, 2131099672, 2131099675, 2131099676, 2131099677, 2131099678, 2131099679, 2131099680, 2131099651, 2131099652, 2131099653, 2131099654, 2131099655, 2131099656, 2131099657, 2131099658, 2131099659, 2131099660, 2131099662, 2131099663, 2131099664, 2131099665, 2131099666, 2131099667, 2131099668, 2131099669, 2131099670, 2131099671, 2131099673, 2131099674} // fill-array
            f.v r2 = f.j.f2840a
            f.v r2 = new f.v
            r2.<init>(r0)
            int r3 = r2.f2916b
            if (r3 < 0) goto L2e
            int r4 = r3 + 32
            r2.b(r4)
            int[] r5 = r2.f2915a
            int r6 = r2.f2916b
            if (r3 == r6) goto L20
            tf.l.p0(r5, r5, r4, r3, r6)
        L20:
            r4 = 0
            r6 = 12
            tf.l.s0(r1, r5, r3, r4, r6)
            int r1 = r2.f2916b
            int r1 = r1 + r0
            r2.f2916b = r1
            y1.z.T = r2
            return
        L2e:
            java.lang.String r0 = ""
            okio.a.i(r0)
            return
    }

    public z(y1.t r5) {
            r4 = this;
            r4.<init>()
            r4.f22166j = r5
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.f22167k = r0
            y1.y r1 = new y1.y
            r2 = 0
            r1.<init>(r4, r2)
            r4.f22168l = r1
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            r1.getClass()
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r4.f22169m = r1
            r1 = 100
            r4.f22170n = r1
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            y1.u r1 = new y1.u
            r1.<init>(r4)
            r4.f22172p = r1
            r4.f22173q = r0
            r4.f22174r = r0
            f.w r0 = new f.w
            r0.<init>()
            r4.f22178v = r0
            f.w r0 = new f.w
            r0.<init>()
            r4.f22179w = r0
            f.t0 r0 = new f.t0
            r0.<init>()
            r4.f22180x = r0
            f.t0 r0 = new f.t0
            r0.<init>()
            r4.f22181y = r0
            r0 = -1
            r4.f22182z = r0
            f.f r0 = new f.f
            r0.<init>()
            r4.B = r0
            r0 = 6
            r1 = 1
            r2 = 0
            sg.c r0 = sg.j.a(r1, r0, r2)
            r4.C = r0
            r4.D = r1
            f.w r0 = f.l.f2854a
            r0.getClass()
            r4.F = r0
            f.x r2 = new f.x
            r2.<init>()
            r4.G = r2
            f.u r2 = new f.u
            r2.<init>()
            r4.H = r2
            f.u r2 = new f.u
            r2.<init>()
            r4.I = r2
            java.lang.String r2 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"
            r4.J = r2
            java.lang.String r2 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"
            r4.K = r2
            b5.c r2 = new b5.c
            r3 = 18
            r2.<init>(r3)
            r4.L = r2
            f.w r2 = new f.w
            r2.<init>()
            r4.M = r2
            y1.f2 r2 = new y1.f2
            f2.s r3 = r5.getSemanticsOwner()
            f2.q r3 = r3.a()
            r2.<init>(r3, r0)
            r4.N = r2
            int r0 = f.i.f2835a
            f.u r0 = new f.u
            r0.<init>()
            r4.P = r0
            r5.addOnAttachStateChangeListener(r4)
            wb.cr r5 = new wb.cr
            r0 = 7
            r5.<init>(r4, r0)
            r4.Q = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.R = r5
            y1.y r5 = new y1.y
            r5.<init>(r4, r1)
            r4.S = r5
            return
    }

    public static android.graphics.Rect E(f1.c0 r4, float r5, float r6) {
            boolean r0 = r4 instanceof f1.k0
            if (r0 != 0) goto Lb
            boolean r0 = r4 instanceof f1.l0
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r4 = 0
            return r4
        Lb:
            e1.c r4 = r4.k()
            android.graphics.Rect r0 = new android.graphics.Rect
            float r1 = r4.f2296a
            float r1 = r1 + r5
            int r1 = (int) r1
            float r2 = r4.f2297b
            float r2 = r2 + r6
            int r2 = (int) r2
            float r3 = r4.f2298c
            float r3 = r3 + r5
            int r5 = (int) r3
            float r4 = r4.f2299d
            float r4 = r4 + r6
            int r4 = (int) r4
            r0.<init>(r1, r2, r5, r4)
            return r0
    }

    public static float[] G(f1.c0 r13) {
            boolean r0 = r13 instanceof f1.l0
            if (r0 == 0) goto L68
            f1.l0 r13 = (f1.l0) r13
            e1.d r13 = r13.f3074f
            long r0 = r13.f2307h
            long r2 = r13.f2306g
            long r4 = r13.f2305f
            long r6 = r13.f2304e
            r13 = 32
            long r8 = r6 >> r13
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r9
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r11 = r4 >> r13
            int r7 = (int) r11
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r4 = r4 & r9
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r11 = r2 >> r13
            int r5 = (int) r11
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r2 = r2 & r9
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r11 = r0 >> r13
            int r13 = (int) r11
            float r13 = java.lang.Float.intBitsToFloat(r13)
            long r0 = r0 & r9
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 8
            float[] r1 = new float[r1]
            r3 = 0
            r1[r3] = r8
            r3 = 1
            r1[r3] = r6
            r3 = 2
            r1[r3] = r7
            r3 = 3
            r1[r3] = r4
            r3 = 4
            r1[r3] = r5
            r3 = 5
            r1[r3] = r2
            r2 = 6
            r1[r2] = r13
            r13 = 7
            r1[r13] = r0
            return r1
        L68:
            r13 = 0
            return r13
    }

    public static android.graphics.Region H(f1.c0 r7, float r8, float r9) {
            boolean r0 = r7 instanceof f1.j0
            if (r0 == 0) goto L44
            android.graphics.Region r0 = new android.graphics.Region
            f1.j0 r7 = (f1.j0) r7
            e1.c r1 = r7.k()
            e1.c r1 = r1.h(r8, r9)
            android.graphics.Rect r2 = new android.graphics.Rect
            float r3 = r1.f2296a
            r4 = 0
            float r3 = r3 + r4
            int r3 = (int) r3
            float r5 = r1.f2297b
            float r5 = r5 + r4
            int r5 = (int) r5
            float r6 = r1.f2298c
            float r6 = r6 + r4
            int r6 = (int) r6
            float r1 = r1.f2299d
            float r1 = r1 + r4
            int r1 = (int) r1
            r2.<init>(r3, r5, r6, r1)
            r0.<init>(r2)
            android.graphics.Region r1 = new android.graphics.Region
            r1.<init>()
            f1.j r7 = r7.f3071f
            boolean r2 = r7 instanceof f1.j
            if (r2 == 0) goto L3d
            android.graphics.Path r7 = r7.f3067a
            r7.offset(r8, r9)
            r1.setPath(r7, r0)
            return r1
        L3d:
            java.lang.String r7 = "Unable to obtain android.graphics.Path"
            j8.o.w(r7)
            r7 = 0
            return r7
        L44:
            r7 = 0
            return r7
    }

    public static java.lang.CharSequence I(java.lang.CharSequence r3) {
            int r0 = r3.length()
            if (r0 != 0) goto L7
            goto L10
        L7:
            int r0 = r3.length()
            r1 = 100000(0x186a0, float:1.4013E-40)
            if (r0 > r1) goto L11
        L10:
            return r3
        L11:
            r0 = 99999(0x1869f, float:1.40128E-40)
            char r2 = r3.charAt(r0)
            boolean r2 = java.lang.Character.isHighSurrogate(r2)
            if (r2 == 0) goto L29
            char r2 = r3.charAt(r1)
            boolean r2 = java.lang.Character.isLowSurrogate(r2)
            if (r2 == 0) goto L29
            r1 = r0
        L29:
            r0 = 0
            java.lang.CharSequence r3 = r3.subSequence(r0, r1)
            r3.getClass()
            return r3
    }

    public static java.lang.String m(f2.q r4) {
            r0 = 0
            if (r4 != 0) goto L4
            goto L4d
        L4:
            f2.m r4 = r4.f3213d
            f.k0 r1 = r4.f3204g
            f2.x r2 = f2.u.f3223a
            boolean r3 = r1.c(r2)
            if (r3 == 0) goto L1f
            java.lang.Object r4 = r4.d(r2)
            java.util.List r4 = (java.util.List) r4
            java.lang.String r1 = ","
            r2 = 62
            java.lang.String r4 = w2.a.a(r4, r1, r0, r2)
            return r4
        L1f:
            f2.x r4 = f2.u.F
            boolean r2 = r1.c(r4)
            if (r2 == 0) goto L35
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L2e
            r4 = r0
        L2e:
            i2.g r4 = (i2.g) r4
            if (r4 == 0) goto L4d
            java.lang.String r4 = r4.f6314h
            return r4
        L35:
            f2.x r4 = f2.u.B
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L3e
            r4 = r0
        L3e:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L4d
            java.lang.Object r4 = tf.m.v1(r4)
            i2.g r4 = (i2.g) r4
            if (r4 == 0) goto L4d
            java.lang.String r4 = r4.f6314h
            return r4
        L4d:
            return r0
    }

    public static final boolean q(f2.j r3, float r4) {
            fg.a r0 = r3.f3156a
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto L15
            java.lang.Object r2 = r0.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 > 0) goto L33
        L15:
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L35
            java.lang.Object r4 = r0.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            fg.a r3 = r3.f3157b
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L35
        L33:
            r3 = 1
            return r3
        L35:
            r3 = 0
            return r3
    }

    public static final boolean r(f2.j r3) {
            fg.a r0 = r3.f3156a
            java.lang.Object r1 = r0.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L13
            r3 = 1
            return r3
        L13:
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            r0.floatValue()
            fg.a r3 = r3.f3157b
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            r3.floatValue()
            r3 = 0
            return r3
    }

    public static final boolean s(f2.j r2) {
            fg.a r0 = r2.f3156a
            java.lang.Object r1 = r0.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            fg.a r2 = r2.f3157b
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1e
            r2 = 1
            return r2
        L1e:
            java.lang.Object r2 = r0.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            r2.floatValue()
            r2 = 0
            return r2
    }

    public static /* synthetic */ void x(y1.z r1, int r2, int r3, java.lang.Integer r4, int r5) {
            r5 = r5 & 4
            r0 = 0
            if (r5 == 0) goto L6
            r4 = r0
        L6:
            r1.w(r2, r3, r4, r0)
            return
    }

    public final void A(f.k r57) {
            r56 = this;
            r0 = r56
            r6 = r57
            r1 = 64
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList r9 = r0.R
            r8.<init>(r9)
            r9.clear()
            int[] r10 = r6.f2844b
            long[] r11 = r6.f2843a
            int r1 = r11.length
            r12 = 2
            int r13 = r1 + (-2)
            r14 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            if (r13 < 0) goto L684
            r15 = r14
        L24:
            r3 = r11[r15]
            r16 = r12
            r17 = r13
            long r12 = ~r3
            r18 = 7
            long r12 = r12 << r18
            long r12 = r12 & r3
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r19
            int r1 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r1 == 0) goto L663
            int r1 = r15 - r17
            int r1 = ~r1
            int r1 = r1 >>> 31
            r12 = 8
            int r13 = 8 - r1
            r21 = r3
            r1 = r14
        L47:
            if (r1 >= r13) goto L64d
            r23 = 255(0xff, double:1.26E-321)
            long r3 = r21 & r23
            r25 = 128(0x80, double:6.3E-322)
            int r3 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r3 >= 0) goto L625
            int r3 = r15 << 3
            int r3 = r3 + r1
            r3 = r10[r3]
            f.w r4 = r0.M
            java.lang.Object r4 = r4.b(r3)
            y1.f2 r4 = (y1.f2) r4
            if (r4 != 0) goto L64
            goto L625
        L64:
            f2.m r4 = r4.f21911a
            f.k0 r5 = r4.f3204g
            java.lang.Object r27 = r6.b(r3)
            r14 = r27
            f2.r r14 = (f2.r) r14
            r27 = r12
            if (r14 == 0) goto L77
            f2.q r14 = r14.f3216a
            goto L78
        L77:
            r14 = 0
        L78:
            if (r14 == 0) goto L61e
            x1.f0 r12 = r14.f3212c
            f2.m r6 = r14.f3213d
            r29 = r10
            int r10 = r14.f3215f
            r30 = r11
            f.k0 r11 = r6.f3204g
            r31 = r15
            java.lang.Object[] r15 = r11.f2849b
            r32 = r15
            java.lang.Object[] r15 = r11.f2850c
            r33 = r15
            long[] r15 = r11.f2848a
            r34 = r1
            int r1 = r15.length
            int r1 = r1 + (-2)
            r35 = r15
            if (r1 < 0) goto L5d2
            r40 = r12
            r39 = r13
            r15 = 0
            r38 = 0
        La2:
            r12 = r35[r15]
            r41 = r14
            r42 = r15
            long r14 = ~r12
            long r14 = r14 << r18
            long r14 = r14 & r12
            long r14 = r14 & r19
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 == 0) goto L5ab
            int r15 = r42 - r1
            int r14 = ~r15
            int r14 = r14 >>> 31
            int r14 = 8 - r14
            r15 = 0
        Lba:
            if (r15 >= r14) goto L594
            long r43 = r12 & r23
            int r43 = (r43 > r25 ? 1 : (r43 == r25 ? 0 : -1))
            if (r43 >= 0) goto L566
            int r43 = r42 << 3
            int r43 = r43 + r15
            r44 = r32[r43]
            r45 = r1
            r1 = r33[r43]
            r43 = r4
            r4 = r44
            f2.x r4 = (f2.x) r4
            r46 = r12
            f2.x r12 = f2.u.f3243u
            boolean r13 = gg.l.a(r4, r12)
            if (r13 != 0) goto Le9
            f2.x r13 = f2.u.f3244v
            boolean r13 = gg.l.a(r4, r13)
            if (r13 == 0) goto Le5
            goto Le9
        Le5:
            r44 = r15
            r15 = 0
            goto L11a
        Le9:
            int r13 = r8.size()
            r44 = r15
            r15 = 0
        Lf0:
            if (r15 >= r13) goto L10c
            java.lang.Object r48 = r8.get(r15)
            r49 = r13
            r13 = r48
            y1.e2 r13 = (y1.e2) r13
            int r13 = r13.f21881g
            if (r13 != r3) goto L107
            java.lang.Object r13 = r8.get(r15)
            y1.e2 r13 = (y1.e2) r13
            goto L10d
        L107:
            int r15 = r15 + 1
            r13 = r49
            goto Lf0
        L10c:
            r13 = 0
        L10d:
            if (r13 == 0) goto L111
            r15 = 0
            goto L117
        L111:
            y1.e2 r13 = new y1.e2
            r13.<init>(r3, r9)
            r15 = 1
        L117:
            r9.add(r13)
        L11a:
            if (r15 != 0) goto L13b
            java.lang.Object r13 = r5.g(r4)
            if (r13 != 0) goto L123
            r13 = 0
        L123:
            boolean r13 = gg.l.a(r1, r13)
            if (r13 == 0) goto L13b
        L129:
            r13 = r3
            r53 = r7
            r48 = r8
            r28 = r14
            r15 = r40
            r7 = r45
            r3 = 0
            r37 = 1
            r8 = r2
            r14 = r5
            goto L563
        L13b:
            f2.x r13 = f2.u.f3226d
            boolean r15 = gg.l.a(r4, r13)
            if (r15 == 0) goto L154
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = r5.c(r13)
            r13 = r27
            if (r4 == 0) goto L129
            r0.y(r3, r13, r1)
            goto L129
        L154:
            r13 = r27
            f2.x r15 = f2.u.f3224b
            boolean r15 = gg.l.a(r4, r15)
            if (r15 == 0) goto L16f
            int r1 = r0.t(r3)
            r15 = 2048(0x800, float:2.87E-42)
            x(r0, r1, r15, r7, r13)
            int r1 = r0.t(r3)
            x(r0, r1, r15, r2, r13)
            goto L129
        L16f:
            r15 = 2048(0x800, float:2.87E-42)
            f2.x r13 = f2.u.J
            boolean r13 = gg.l.a(r4, r13)
            if (r13 == 0) goto L190
            int r1 = r0.t(r3)
            r4 = 8192(0x2000, float:1.148E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13 = 8
            x(r0, r1, r15, r4, r13)
            int r1 = r0.t(r3)
            x(r0, r1, r15, r2, r13)
            goto L129
        L190:
            f2.x r13 = f2.u.L
            boolean r13 = gg.l.a(r4, r13)
            if (r13 == 0) goto L1a8
            int r1 = r0.t(r3)
            r4 = 3072(0xc00, float:4.305E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13 = 8
            x(r0, r1, r15, r4, r13)
            goto L129
        L1a8:
            f2.x r13 = f2.u.f3225c
            boolean r13 = gg.l.a(r4, r13)
            if (r13 == 0) goto L1c2
            int r1 = r0.t(r3)
            r13 = 8
            x(r0, r1, r15, r7, r13)
            int r1 = r0.t(r3)
            x(r0, r1, r15, r2, r13)
            goto L129
        L1c2:
            f2.x r13 = f2.u.I
            boolean r15 = gg.l.a(r4, r13)
            r48 = r8
            r8 = 4
            if (r15 == 0) goto L28d
            f2.x r1 = f2.u.f3247y
            java.lang.Object r1 = r11.g(r1)
            if (r1 != 0) goto L1d6
            r1 = 0
        L1d6:
            f2.i r1 = (f2.i) r1
            if (r1 != 0) goto L1dc
        L1da:
            r1 = 0
            goto L1e1
        L1dc:
            int r1 = r1.f3155a
            if (r1 != r8) goto L1da
            r1 = 1
        L1e1:
            if (r1 == 0) goto L26a
            java.lang.Object r1 = r11.g(r13)
            if (r1 != 0) goto L1ea
            r1 = 0
        L1ea:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r1 = gg.l.a(r1, r4)
            if (r1 == 0) goto L259
            int r1 = r0.t(r3)
            android.view.accessibility.AccessibilityEvent r1 = r0.h(r1, r8)
            f2.q r4 = new f2.q
            r13 = r41
            y0.n r8 = r13.f3210a
            r15 = r40
            r12 = 1
            r4.<init>(r8, r12, r15, r6)
            f2.m r8 = r4.k()
            f2.x r12 = f2.u.f3223a
            f.k0 r8 = r8.f3204g
            java.lang.Object r8 = r8.g(r12)
            if (r8 != 0) goto L215
            r8 = 0
        L215:
            java.util.List r8 = (java.util.List) r8
            r12 = 62
            r40 = r4
            java.lang.String r4 = ","
            r41 = r13
            r13 = 0
            if (r8 == 0) goto L227
            java.lang.String r8 = w2.a.a(r8, r4, r13, r12)
            r13 = r8
        L227:
            f2.m r8 = r40.k()
            f2.x r12 = f2.u.B
            f.k0 r8 = r8.f3204g
            java.lang.Object r8 = r8.g(r12)
            if (r8 != 0) goto L236
            r8 = 0
        L236:
            java.util.List r8 = (java.util.List) r8
            r28 = r14
            r12 = 0
            if (r8 == 0) goto L244
            r14 = 62
            java.lang.String r4 = w2.a.a(r8, r4, r12, r14)
            goto L245
        L244:
            r4 = r12
        L245:
            if (r13 == 0) goto L24a
            r1.setContentDescription(r13)
        L24a:
            if (r4 == 0) goto L253
            java.util.List r8 = r1.getText()
            r8.add(r4)
        L253:
            r0.v(r1)
            r13 = 2048(0x800, float:2.87E-42)
            goto L281
        L259:
            r28 = r14
            r15 = r40
            r12 = 0
            int r1 = r0.t(r3)
            r4 = 8
            r13 = 2048(0x800, float:2.87E-42)
            x(r0, r1, r13, r2, r4)
            goto L281
        L26a:
            r28 = r14
            r15 = r40
            r4 = 8
            r12 = 0
            r13 = 2048(0x800, float:2.87E-42)
            int r1 = r0.t(r3)
            x(r0, r1, r13, r7, r4)
            int r1 = r0.t(r3)
            x(r0, r1, r13, r2, r4)
        L281:
            r8 = r2
            r13 = r3
            r14 = r5
            r53 = r7
        L286:
            r7 = r45
        L288:
            r3 = 0
            r37 = 1
            goto L563
        L28d:
            r36 = r8
            r28 = r14
            r15 = r40
            r13 = 2048(0x800, float:2.87E-42)
            r14 = 0
            f2.x r8 = f2.u.f3223a
            boolean r8 = gg.l.a(r4, r8)
            if (r8 == 0) goto L2af
            int r4 = r0.t(r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r36)
            r1.getClass()
            java.util.List r1 = (java.util.List) r1
            r0.w(r4, r13, r8, r1)
            goto L281
        L2af:
            f2.x r8 = f2.u.F
            boolean r13 = gg.l.a(r4, r8)
            r49 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r40 = 32
            java.lang.String r51 = ""
            if (r13 == 0) goto L3d4
            f2.x r1 = f2.l.f3188k
            boolean r1 = r11.c(r1)
            if (r1 == 0) goto L3c0
            java.lang.Object r13 = r5.g(r8)
            if (r13 != 0) goto L2cf
            r13 = r14
        L2cf:
            i2.g r13 = (i2.g) r13
            if (r13 == 0) goto L2d4
            goto L2d6
        L2d4:
            r13 = r51
        L2d6:
            java.lang.Object r1 = r11.g(r8)
            if (r1 != 0) goto L2dd
            r1 = r14
        L2dd:
            i2.g r1 = (i2.g) r1
            if (r1 == 0) goto L2e2
            goto L2e4
        L2e2:
            r1 = r51
        L2e4:
            java.lang.CharSequence r4 = I(r1)
            int r8 = r13.length()
            int r12 = r1.length()
            if (r8 <= r12) goto L2f4
            r14 = r12
            goto L2f5
        L2f4:
            r14 = r8
        L2f5:
            r52 = r2
            r2 = 0
        L2f8:
            r53 = r7
            if (r2 >= r14) goto L310
            char r7 = r13.charAt(r2)
            r51 = r8
            char r8 = r1.charAt(r2)
            if (r7 == r8) goto L309
            goto L312
        L309:
            int r2 = r2 + 1
            r8 = r51
            r7 = r53
            goto L2f8
        L310:
            r51 = r8
        L312:
            r7 = 0
        L313:
            int r8 = r14 - r2
            if (r7 >= r8) goto L32e
            int r8 = r51 + (-1)
            int r8 = r8 - r7
            char r8 = r13.charAt(r8)
            int r54 = r12 + (-1)
            r55 = r7
            int r7 = r54 - r55
            char r7 = r1.charAt(r7)
            if (r8 == r7) goto L32b
            goto L330
        L32b:
            int r7 = r55 + 1
            goto L313
        L32e:
            r55 = r7
        L330:
            int r8 = r51 - r55
            int r8 = r8 - r2
            int r1 = r12 - r55
            int r1 = r1 - r2
            f2.x r7 = f2.u.K
            boolean r14 = r5.c(r7)
            boolean r7 = r11.c(r7)
            r51 = r7
            f2.x r7 = f2.u.F
            boolean r7 = r5.c(r7)
            if (r7 == 0) goto L351
            if (r14 != 0) goto L351
            if (r51 == 0) goto L351
            r54 = 1
            goto L353
        L351:
            r54 = 0
        L353:
            if (r7 == 0) goto L35b
            if (r14 == 0) goto L35b
            if (r51 != 0) goto L35b
            r7 = 1
            goto L35c
        L35b:
            r7 = 0
        L35c:
            if (r54 != 0) goto L383
            if (r7 == 0) goto L361
            goto L383
        L361:
            int r12 = r0.t(r3)
            r14 = 16
            android.view.accessibility.AccessibilityEvent r12 = r0.h(r12, r14)
            r12.setFromIndex(r2)
            r12.setRemovedCount(r8)
            r12.setAddedCount(r1)
            r12.setBeforeText(r13)
            java.util.List r1 = r12.getText()
            r1.add(r4)
            r13 = r3
            r14 = r5
            r2 = r52
            goto L398
        L383:
            int r1 = r0.t(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r8 = r3
            r3 = r52
            r14 = r5
            r13 = r8
            r5 = r4
            r4 = r2
            r2 = r52
            android.view.accessibility.AccessibilityEvent r12 = r0.i(r1, r2, r3, r4, r5)
        L398:
            java.lang.String r1 = "android.widget.EditText"
            r12.setClassName(r1)
            r0.v(r12)
            if (r54 != 0) goto L3a4
            if (r7 == 0) goto L3bd
        L3a4:
            f2.x r1 = f2.u.G
            java.lang.Object r1 = r6.d(r1)
            i2.m0 r1 = (i2.m0) r1
            long r3 = r1.f6360a
            long r7 = r3 >> r40
            int r1 = (int) r7
            r12.setFromIndex(r1)
            long r3 = r3 & r49
            int r1 = (int) r3
            r12.setToIndex(r1)
            r0.v(r12)
        L3bd:
            r8 = r2
            goto L286
        L3c0:
            r13 = r3
            r14 = r5
            r53 = r7
            int r1 = r0.t(r13)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r4 = 2048(0x800, float:2.87E-42)
            r5 = 8
            x(r0, r1, r4, r3, r5)
            goto L3bd
        L3d4:
            r13 = r3
            r14 = r5
            r53 = r7
            r7 = r45
            f2.x r3 = f2.u.G
            boolean r5 = gg.l.a(r4, r3)
            if (r5 == 0) goto L42e
            java.lang.Object r1 = r11.g(r8)
            if (r1 != 0) goto L3e9
            r1 = 0
        L3e9:
            i2.g r1 = (i2.g) r1
            if (r1 == 0) goto L3f4
            java.lang.String r1 = r1.f6314h
            if (r1 != 0) goto L3f2
            goto L3f4
        L3f2:
            r51 = r1
        L3f4:
            java.lang.Object r1 = r6.d(r3)
            i2.m0 r1 = (i2.m0) r1
            long r3 = r1.f6360a
            int r1 = r0.t(r13)
            r5 = r1
            long r0 = r3 >> r40
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            long r3 = r3 & r49
            int r1 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r1 = r51.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.CharSequence r1 = I(r51)
            r8 = r5
            r5 = r1
            r1 = r8
            r8 = r2
            r2 = r0
            r0 = r56
            android.view.accessibility.AccessibilityEvent r1 = r0.i(r1, r2, r3, r4, r5)
            r0.v(r1)
            r0.z(r10)
            goto L288
        L42e:
            r8 = r2
            boolean r2 = gg.l.a(r4, r12)
            if (r2 != 0) goto L43d
            f2.x r2 = f2.u.f3244v
            boolean r2 = gg.l.a(r4, r2)
            if (r2 == 0) goto L442
        L43d:
            r3 = 0
            r37 = 1
            goto L50c
        L442:
            f2.x r2 = f2.u.f3234l
            boolean r2 = gg.l.a(r4, r2)
            if (r2 == 0) goto L470
            r1.getClass()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L463
            int r1 = r0.t(r10)
            r4 = 8
            android.view.accessibility.AccessibilityEvent r1 = r0.h(r1, r4)
            r0.v(r1)
            goto L465
        L463:
            r4 = 8
        L465:
            int r1 = r0.t(r10)
            r2 = 2048(0x800, float:2.87E-42)
            x(r0, r1, r2, r8, r4)
            goto L288
        L470:
            f2.x r2 = f2.l.f3201x
            boolean r3 = gg.l.a(r4, r2)
            if (r3 == 0) goto L4d0
            java.lang.Object r1 = r6.d(r2)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r14.g(r2)
            if (r2 != 0) goto L485
            r2 = 0
        L485:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L4c3
            f.l0 r3 = f.s0.f2899a
            f.l0 r3 = new f.l0
            r3.<init>()
            int r4 = r1.size()
            if (r4 > 0) goto L4b7
            f.l0 r1 = new f.l0
            r1.<init>()
            int r4 = r2.size()
            if (r4 > 0) goto L4ab
            boolean r1 = r3.equals(r1)
            r37 = 1
            r38 = r1 ^ 1
            goto L57a
        L4ab:
            r3 = 0
            java.lang.Object r1 = r2.get(r3)
            r1.getClass()
            ah.a.d()
            return
        L4b7:
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            r1.getClass()
            ah.a.d()
            return
        L4c3:
            r3 = 0
            r37 = 1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L563
        L4cc:
            r38 = r37
            goto L563
        L4d0:
            r3 = 0
            r37 = 1
            boolean r2 = r1 instanceof f2.a
            if (r2 == 0) goto L4cc
            f2.a r1 = (f2.a) r1
            java.lang.Object r2 = r14.g(r4)
            if (r2 != 0) goto L4e0
            r2 = 0
        L4e0:
            if (r1 != r2) goto L4e3
            goto L504
        L4e3:
            boolean r4 = r2 instanceof f2.a
            if (r4 != 0) goto L4e8
            goto L502
        L4e8:
            java.lang.String r4 = r1.f3137a
            f2.a r2 = (f2.a) r2
            sf.b r5 = r2.f3138b
            java.lang.String r2 = r2.f3137a
            boolean r2 = gg.l.a(r4, r2)
            if (r2 != 0) goto L4f7
            goto L502
        L4f7:
            sf.b r1 = r1.f3138b
            if (r1 != 0) goto L4fe
            if (r5 == 0) goto L4fe
            goto L502
        L4fe:
            if (r1 == 0) goto L504
            if (r5 != 0) goto L504
        L502:
            r12 = r3
            goto L506
        L504:
            r12 = r37
        L506:
            if (r12 != 0) goto L509
            goto L4cc
        L509:
            r38 = r3
            goto L563
        L50c:
            r0.p(r15)
            int r1 = r9.size()
            r2 = r3
        L514:
            if (r2 >= r1) goto L52a
            java.lang.Object r4 = r9.get(r2)
            y1.e2 r4 = (y1.e2) r4
            int r4 = r4.f21881g
            if (r4 != r13) goto L527
            java.lang.Object r1 = r9.get(r2)
            y1.e2 r1 = (y1.e2) r1
            goto L52b
        L527:
            int r2 = r2 + 1
            goto L514
        L52a:
            r1 = 0
        L52b:
            r1.getClass()
            java.lang.Object r2 = r11.g(r12)
            if (r2 != 0) goto L535
            r2 = 0
        L535:
            f2.j r2 = (f2.j) r2
            r1.f21885k = r2
            f2.x r2 = f2.u.f3244v
            java.lang.Object r2 = r11.g(r2)
            if (r2 != 0) goto L542
            r2 = 0
        L542:
            f2.j r2 = (f2.j) r2
            r1.f21886l = r2
            java.util.List r2 = r1.f21882h
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L54f
            goto L563
        L54f:
            y1.t r2 = r0.f22166j
            x1.t1 r2 = r2.getSnapshotObserver()
            c1.b r4 = new c1.b
            r5 = 9
            r4.<init>(r1, r5, r0)
            w0.s r2 = r2.f21066a
            y1.y r5 = r0.S
            r2.c(r1, r5, r4)
        L563:
            r4 = 8
            goto L57c
        L566:
            r43 = r4
            r53 = r7
            r48 = r8
            r46 = r12
            r28 = r14
            r44 = r15
            r15 = r40
            r37 = 1
            r7 = r1
            r8 = r2
            r13 = r3
            r14 = r5
        L57a:
            r3 = 0
            goto L563
        L57c:
            long r1 = r46 >> r4
            int r5 = r44 + 1
            r27 = r4
            r3 = r13
            r40 = r15
            r4 = r43
            r12 = r1
            r15 = r5
            r1 = r7
            r2 = r8
            r5 = r14
            r14 = r28
            r8 = r48
            r7 = r53
            goto Lba
        L594:
            r13 = r3
            r43 = r4
            r53 = r7
            r48 = r8
            r12 = r14
            r4 = r27
            r15 = r40
            r3 = 0
            r37 = 1
            r7 = r1
            r8 = r2
            r14 = r5
            if (r12 != r4) goto L5e3
        L5a8:
            r1 = r42
            goto L5bb
        L5ab:
            r13 = r3
            r43 = r4
            r14 = r5
            r53 = r7
            r48 = r8
            r15 = r40
            r3 = 0
            r37 = 1
            r7 = r1
            r8 = r2
            goto L5a8
        L5bb:
            if (r1 == r7) goto L5e3
            int r1 = r1 + 1
            r2 = r8
            r3 = r13
            r5 = r14
            r40 = r15
            r14 = r41
            r4 = r43
            r8 = r48
            r27 = 8
            r15 = r1
            r1 = r7
            r7 = r53
            goto La2
        L5d2:
            r43 = r4
            r53 = r7
            r48 = r8
            r39 = r13
            r41 = r14
            r37 = 1
            r8 = r2
            r13 = r3
            r3 = 0
            r38 = r3
        L5e3:
            if (r38 != 0) goto L60d
            java.util.Iterator r1 = r43.iterator()
        L5e9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L60a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            f2.m r4 = r41.k()
            java.lang.Object r2 = r2.getKey()
            f2.x r2 = (f2.x) r2
            f.k0 r4 = r4.f3204g
            boolean r2 = r4.c(r2)
            if (r2 != 0) goto L5e9
            r15 = r37
            goto L60b
        L60a:
            r15 = r3
        L60b:
            r38 = r15
        L60d:
            if (r38 == 0) goto L61b
            int r1 = r0.t(r13)
            r13 = 8
            r15 = 2048(0x800, float:2.87E-42)
            x(r0, r1, r15, r8, r13)
            goto L636
        L61b:
            r13 = 8
            goto L636
        L61e:
            java.lang.String r1 = "no value for specified key"
            af.d r1 = wb.en.a(r1)
            throw r1
        L625:
            r34 = r1
            r53 = r7
            r48 = r8
            r29 = r10
            r30 = r11
            r39 = r13
            r3 = r14
            r31 = r15
            r8 = r2
            r13 = r12
        L636:
            long r21 = r21 >> r13
            int r1 = r34 + 1
            r6 = r57
            r14 = r3
            r2 = r8
            r12 = r13
            r10 = r29
            r11 = r30
            r15 = r31
            r13 = r39
            r8 = r48
            r7 = r53
            goto L47
        L64d:
            r3 = r13
            r13 = r12
            r12 = r3
            r53 = r7
            r48 = r8
            r29 = r10
            r30 = r11
            r3 = r14
            r31 = r15
            r8 = r2
            if (r12 != r13) goto L684
            r14 = r31
        L660:
            r1 = r17
            goto L66f
        L663:
            r53 = r7
            r48 = r8
            r29 = r10
            r30 = r11
            r3 = r14
            r8 = r2
            r14 = r15
            goto L660
        L66f:
            if (r14 == r1) goto L684
            int r15 = r14 + 1
            r6 = r57
            r13 = r1
            r14 = r3
            r2 = r8
            r12 = r16
            r10 = r29
            r11 = r30
            r8 = r48
            r7 = r53
            goto L24
        L684:
            return
    }

    public final void B(x1.f0 r6, f.x r7) {
            r5 = this;
            boolean r0 = r6.G()
            if (r0 != 0) goto L8
            goto L79
        L8:
            y1.t r0 = r5.f22166j
            y1.r0 r0 = r0.getAndroidViewsHandler$ui()
            java.util.HashMap r0 = r0.getLayoutNodeToHolder()
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L1a
            goto L79
        L1a:
            x1.b1 r0 = r6.L
            r1 = 8
            boolean r0 = r0.d(r1)
            r2 = 0
            if (r0 == 0) goto L26
            goto L3b
        L26:
            x1.f0 r6 = r6.u()
        L2a:
            if (r6 == 0) goto L3a
            x1.b1 r0 = r6.L
            boolean r0 = r0.d(r1)
            if (r0 == 0) goto L35
            goto L3b
        L35:
            x1.f0 r6 = r6.u()
            goto L2a
        L3a:
            r6 = r2
        L3b:
            if (r6 == 0) goto L79
            f2.m r0 = r6.w()
            if (r0 != 0) goto L44
            goto L79
        L44:
            boolean r0 = r0.f3206i
            r3 = 1
            if (r0 != 0) goto L63
            x1.f0 r0 = r6.u()
        L4d:
            if (r0 == 0) goto L60
            f2.m r4 = r0.w()
            if (r4 == 0) goto L5b
            boolean r4 = r4.f3206i
            if (r4 != r3) goto L5b
            r2 = r0
            goto L60
        L5b:
            x1.f0 r0 = r0.u()
            goto L4d
        L60:
            if (r2 == 0) goto L63
            r6 = r2
        L63:
            int r6 = r6.f20890h
            boolean r7 = r7.a(r6)
            if (r7 != 0) goto L6c
            goto L79
        L6c:
            int r6 = r5.t(r6)
            r7 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            x(r5, r6, r7, r0, r1)
        L79:
            return
    }

    public final void C(x1.f0 r4) {
            r3 = this;
            boolean r0 = r4.G()
            if (r0 != 0) goto L7
            goto L2e
        L7:
            y1.t r0 = r3.f22166j
            y1.r0 r0 = r0.getAndroidViewsHandler$ui()
            java.util.HashMap r0 = r0.getLayoutNodeToHolder()
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L18
            goto L2e
        L18:
            int r4 = r4.f20890h
            f.w r0 = r3.f22178v
            java.lang.Object r0 = r0.b(r4)
            f2.j r0 = (f2.j) r0
            f.w r1 = r3.f22179w
            java.lang.Object r1 = r1.b(r4)
            f2.j r1 = (f2.j) r1
            if (r0 != 0) goto L2f
            if (r1 != 0) goto L2f
        L2e:
            return
        L2f:
            r2 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r4 = r3.h(r4, r2)
            if (r0 == 0) goto L57
            fg.a r2 = r0.f3156a
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (int) r2
            r4.setScrollX(r2)
            fg.a r0 = r0.f3157b
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (int) r0
            r4.setMaxScrollX(r0)
        L57:
            if (r1 == 0) goto L79
            fg.a r0 = r1.f3156a
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (int) r0
            r4.setScrollY(r0)
            fg.a r0 = r1.f3157b
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (int) r0
            r4.setMaxScrollY(r0)
        L79:
            r3.v(r4)
            return
    }

    public final boolean D(f2.q r11, int r12, int r13, boolean r14) {
            r10 = this;
            f2.m r0 = r11.f3213d
            int r1 = r11.f3215f
            f2.x r2 = f2.l.f3187j
            f.k0 r0 = r0.f3204g
            boolean r0 = r0.c(r2)
            r3 = 0
            if (r0 == 0) goto L3a
            boolean r0 = y1.g0.b(r11)
            if (r0 == 0) goto L3a
            f2.m r11 = r11.f3213d
            java.lang.Object r11 = r11.d(r2)
            f2.a r11 = (f2.a) r11
            sf.b r11 = r11.f3138b
            fg.q r11 = (fg.q) r11
            if (r11 == 0) goto L47
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            java.lang.Object r11 = r11.b(r12, r13, r14)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L3a:
            if (r12 != r13) goto L41
            int r14 = r10.f22182z
            if (r13 != r14) goto L41
            goto L47
        L41:
            java.lang.String r9 = m(r11)
            if (r9 != 0) goto L48
        L47:
            return r3
        L48:
            if (r12 < 0) goto L53
            if (r12 != r13) goto L53
            int r11 = r9.length()
            if (r13 > r11) goto L53
            goto L54
        L53:
            r12 = -1
        L54:
            r10.f22182z = r12
            int r11 = r9.length()
            r12 = 1
            if (r11 <= 0) goto L5e
            r3 = r12
        L5e:
            int r5 = r10.t(r1)
            r11 = 0
            if (r3 == 0) goto L6d
            int r13 = r10.f22182z
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r6 = r13
            goto L6e
        L6d:
            r6 = r11
        L6e:
            if (r3 == 0) goto L78
            int r13 = r10.f22182z
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r7 = r13
            goto L79
        L78:
            r7 = r11
        L79:
            if (r3 == 0) goto L83
            int r11 = r9.length()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
        L83:
            r4 = r10
            r8 = r11
            android.view.accessibility.AccessibilityEvent r11 = r4.i(r5, r6, r7, r8, r9)
            r10.v(r11)
            r10.z(r1)
            return r12
    }

    public final android.graphics.Rect F(float r9, float r10, float r11, float r12) {
            r8 = this;
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r0 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r10)
            long r9 = (long) r9
            r2 = 32
            long r0 = r0 << r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r3
            long r9 = r9 | r0
            y1.t r0 = r8.f22166j
            long r9 = r0.w(r9)
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r5 = (long) r11
            int r11 = java.lang.Float.floatToRawIntBits(r12)
            long r11 = (long) r11
            long r5 = r5 << r2
            long r11 = r11 & r3
            long r11 = r11 | r5
            long r11 = r0.w(r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            long r5 = r9 >> r2
            int r1 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r1)
            long r6 = r11 >> r2
            int r2 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r2)
            float r5 = java.lang.Math.min(r5, r6)
            double r5 = (double) r5
            double r5 = java.lang.Math.floor(r5)
            float r5 = (float) r5
            int r5 = (int) r5
            long r9 = r9 & r3
            int r9 = (int) r9
            float r10 = java.lang.Float.intBitsToFloat(r9)
            long r11 = r11 & r3
            int r11 = (int) r11
            float r12 = java.lang.Float.intBitsToFloat(r11)
            float r10 = java.lang.Math.min(r10, r12)
            double r3 = (double) r10
            double r3 = java.lang.Math.floor(r3)
            float r10 = (float) r3
            int r10 = (int) r10
            float r12 = java.lang.Float.intBitsToFloat(r1)
            float r1 = java.lang.Float.intBitsToFloat(r2)
            float r12 = java.lang.Math.max(r12, r1)
            double r1 = (double) r12
            double r1 = java.lang.Math.ceil(r1)
            float r12 = (float) r1
            int r12 = (int) r12
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r9 = java.lang.Math.max(r9, r11)
            double r1 = (double) r9
            double r1 = java.lang.Math.ceil(r1)
            float r9 = (float) r1
            int r9 = (int) r9
            r0.<init>(r5, r10, r12, r9)
            return r0
    }

    public final void J() {
            r32 = this;
            r0 = r32
            f.x r1 = new f.x
            r1.<init>()
            f.x r2 = r0.G
            int[] r3 = r2.f2919b
            long[] r4 = r2.f2918a
            int r5 = r4.length
            int r5 = r5 + (-2)
            f.w r6 = r0.M
            r14 = 8
            if (r5 < 0) goto L9d
            r7 = 0
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L1b:
            r9 = r4[r7]
            r8 = 7
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = ~r9
            long r11 = r11 << r8
            long r11 = r11 & r9
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L95
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        L34:
            if (r12 >= r11) goto L90
            long r22 = r9 & r18
            int r13 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r13 >= 0) goto L88
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            r22 = r8
            f.k r8 = r0.l()
            java.lang.Object r8 = r8.b(r13)
            f2.r r8 = (f2.r) r8
            r23 = 0
            if (r8 == 0) goto L54
            f2.q r8 = r8.f3216a
            goto L56
        L54:
            r8 = r23
        L56:
            if (r8 == 0) goto L64
            f2.m r8 = r8.f3213d
            f2.x r15 = f2.u.f3226d
            f.k0 r8 = r8.f3204g
            boolean r8 = r8.c(r15)
            if (r8 != 0) goto L8a
        L64:
            r1.a(r13)
            java.lang.Object r8 = r6.b(r13)
            y1.f2 r8 = (y1.f2) r8
            if (r8 == 0) goto L80
            f2.m r8 = r8.f21911a
            f2.x r15 = f2.u.f3226d
            f.k0 r8 = r8.f3204g
            java.lang.Object r8 = r8.g(r15)
            if (r8 != 0) goto L7c
            goto L7e
        L7c:
            r23 = r8
        L7e:
            java.lang.String r23 = (java.lang.String) r23
        L80:
            r8 = r23
            r15 = 32
            r0.y(r13, r15, r8)
            goto L8a
        L88:
            r22 = r8
        L8a:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            r8 = r22
            goto L34
        L90:
            r22 = r8
            if (r11 != r14) goto La8
            goto L97
        L95:
            r22 = r8
        L97:
            if (r7 == r5) goto La8
            int r7 = r7 + 1
            goto L1b
        L9d:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r22 = 7
        La8:
            int[] r3 = r1.f2919b
            long[] r1 = r1.f2918a
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L183
            r5 = 0
        Lb2:
            r7 = r1[r5]
            long r9 = ~r7
            long r9 = r9 << r22
            long r9 = r9 & r7
            long r9 = r9 & r20
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto L177
            int r9 = r5 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        Lc6:
            if (r10 >= r9) goto L171
            long r11 = r7 & r18
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 >= 0) goto L161
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            int r12 = java.lang.Integer.hashCode(r11)
            r13 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r12 = r12 * r13
            int r13 = r12 << 16
            r12 = r12 ^ r13
            r13 = r12 & 127(0x7f, float:1.78E-43)
            int r15 = r2.f2920c
            int r12 = r12 >>> 7
            r12 = r12 & r15
            r24 = r14
            r23 = 0
        Le9:
            long[] r14 = r2.f2918a
            int r25 = r12 >> 3
            r26 = r12 & 7
            r27 = r1
            int r1 = r26 << 3
            r28 = r14[r25]
            long r28 = r28 >>> r1
            int r25 = r25 + 1
            r25 = r14[r25]
            int r14 = 64 - r1
            long r25 = r25 << r14
            r30 = r7
            long r7 = (long) r1
            long r7 = -r7
            r1 = 63
            long r7 = r7 >> r1
            long r7 = r25 & r7
            long r7 = r28 | r7
            r1 = r15
            long r14 = (long) r13
            r25 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r14 = r14 * r25
            long r14 = r14 ^ r7
            long r25 = r14 - r25
            long r14 = ~r14
            long r14 = r25 & r14
            long r14 = r14 & r20
        L11b:
            r25 = 0
            int r28 = (r14 > r25 ? 1 : (r14 == r25 ? 0 : -1))
            if (r28 == 0) goto L13f
            int r25 = java.lang.Long.numberOfTrailingZeros(r14)
            int r25 = r25 >> 3
            int r25 = r12 + r25
            r25 = r25 & r1
            r28 = r1
            int[] r1 = r2.f2919b
            r1 = r1[r25]
            if (r1 != r11) goto L136
        L133:
            r1 = r25
            goto L14e
        L136:
            r25 = 1
            long r25 = r14 - r25
            long r14 = r14 & r25
            r1 = r28
            goto L11b
        L13f:
            r28 = r1
            long r14 = ~r7
            r1 = 6
            long r14 = r14 << r1
            long r7 = r7 & r14
            long r7 = r7 & r20
            int r1 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r1 == 0) goto L154
            r25 = -1
            goto L133
        L14e:
            if (r1 < 0) goto L167
            r2.f(r1)
            goto L167
        L154:
            int r23 = r23 + 8
            int r12 = r12 + r23
            r12 = r12 & r28
            r1 = r27
            r15 = r28
            r7 = r30
            goto Le9
        L161:
            r27 = r1
            r30 = r7
            r24 = r14
        L167:
            long r7 = r30 >> r24
            int r10 = r10 + 1
            r14 = r24
            r1 = r27
            goto Lc6
        L171:
            r27 = r1
            r1 = r14
            if (r9 != r1) goto L183
            goto L179
        L177:
            r27 = r1
        L179:
            if (r5 == r4) goto L183
            int r5 = r5 + 1
            r1 = r27
            r14 = 8
            goto Lb2
        L183:
            r6.c()
            f.k r1 = r0.l()
            int[] r3 = r1.f2844b
            java.lang.Object[] r4 = r1.f2845c
            long[] r1 = r1.f2843a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L1fc
            r7 = 0
        L196:
            r8 = r1[r7]
            long r10 = ~r8
            long r10 = r10 << r22
            long r10 = r10 & r8
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto L1f5
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r24 = 8
            int r14 = 8 - r10
            r10 = 0
        L1ac:
            if (r10 >= r14) goto L1f0
            long r11 = r8 & r18
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 >= 0) goto L1ea
            int r11 = r7 << 3
            int r11 = r11 + r10
            r12 = r3[r11]
            r11 = r4[r11]
            f2.r r11 = (f2.r) r11
            f2.q r11 = r11.f3216a
            f2.m r13 = r11.f3213d
            f2.x r15 = f2.u.f3226d
            f.k0 r13 = r13.f3204g
            boolean r13 = r13.c(r15)
            if (r13 == 0) goto L1de
            boolean r13 = r2.a(r12)
            if (r13 == 0) goto L1de
            f2.m r13 = r11.f3213d
            java.lang.Object r13 = r13.d(r15)
            java.lang.String r13 = (java.lang.String) r13
            r15 = 16
            r0.y(r12, r15, r13)
        L1de:
            y1.f2 r13 = new y1.f2
            f.k r15 = r0.l()
            r13.<init>(r11, r15)
            r6.h(r12, r13)
        L1ea:
            r11 = 8
            long r8 = r8 >> r11
            int r10 = r10 + 1
            goto L1ac
        L1f0:
            r11 = 8
            if (r14 != r11) goto L1fc
            goto L1f7
        L1f5:
            r11 = 8
        L1f7:
            if (r7 == r5) goto L1fc
            int r7 = r7 + 1
            goto L196
        L1fc:
            y1.f2 r1 = new y1.f2
            y1.t r2 = r0.f22166j
            f2.s r2 = r2.getSemanticsOwner()
            f2.q r2 = r2.a()
            f.k r3 = r0.l()
            r1.<init>(r2, r3)
            r0.N = r1
            return
    }

    @Override // g3.b
    public final androidx.lifecycle.x a(android.view.View r1) {
            r0 = this;
            y1.u r1 = r0.f22172p
            return r1
    }

    public final void c(int r24, h3.g r25, java.lang.String r26, android.os.Bundle r27) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            r3 = r25
            r4 = r27
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.f5066a
            f.k r5 = r0.l()
            java.lang.Object r5 = r5.b(r1)
            f2.r r5 = (f2.r) r5
            if (r5 == 0) goto L313
            f2.q r5 = r5.f3216a
            if (r5 != 0) goto L1e
            goto L313
        L1e:
            x1.f0 r6 = r5.f3212c
            f2.m r7 = r5.f3213d
            f.k0 r8 = r7.f3204g
            java.lang.String r9 = m(r5)
            java.lang.String r10 = r0.J
            boolean r10 = gg.l.a(r2, r10)
            r11 = -1
            if (r10 == 0) goto L41
            f.u r4 = r0.H
            int r1 = r4.d(r1)
            if (r1 == r11) goto L313
            android.os.Bundle r3 = r3.getExtras()
            r3.putInt(r2, r1)
            return
        L41:
            java.lang.String r10 = r0.K
            boolean r10 = gg.l.a(r2, r10)
            if (r10 == 0) goto L59
            f.u r4 = r0.I
            int r1 = r4.d(r1)
            if (r1 == r11) goto L313
            android.os.Bundle r3 = r3.getExtras()
            r3.putInt(r2, r1)
            return
        L59:
            f2.x r1 = f2.l.f3178a
            boolean r1 = r8.c(r1)
            y1.t r10 = r0.f22166j
            r12 = 0
            if (r1 == 0) goto L189
            if (r4 == 0) goto L189
            java.lang.String r1 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"
            boolean r1 = gg.l.a(r2, r1)
            if (r1 == 0) goto L189
            java.lang.String r1 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX"
            int r1 = r4.getInt(r1, r11)
            java.lang.String r6 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH"
            int r4 = r4.getInt(r6, r11)
            if (r4 <= 0) goto L181
            if (r1 < 0) goto L181
            if (r9 == 0) goto L85
            int r6 = r9.length()
            goto L88
        L85:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L88:
            if (r1 < r6) goto L8c
            goto L181
        L8c:
            i2.k0 r6 = y1.g0.o(r7)
            if (r6 != 0) goto L94
            goto L313
        L94:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
        L9a:
            if (r8 >= r4) goto L170
            int r9 = r1 + r8
            i2.j0 r11 = r6.f6346a
            i2.g r11 = r11.f6334a
            java.lang.String r11 = r11.f6314h
            int r11 = r11.length()
            if (r9 < r11) goto Lb0
            r7.add(r12)
            r15 = r10
            goto L16a
        Lb0:
            e1.c r9 = r6.b(r9)
            x1.i1 r11 = r5.d()
            r14 = 0
            if (r11 == 0) goto Lcc
            y0.n r12 = r11.r1()
            boolean r12 = r12.f21832t
            if (r12 == 0) goto Lc5
            goto Lc6
        Lc5:
            r11 = 0
        Lc6:
            if (r11 == 0) goto Lcc
            long r14 = r11.m0(r14)
        Lcc:
            e1.c r9 = r9.i(r14)
            e1.c r11 = r5.g()
            boolean r12 = r9.g(r11)
            if (r12 == 0) goto Ldf
            e1.c r9 = r9.e(r11)
            goto Le0
        Ldf:
            r9 = 0
        Le0:
            if (r9 == 0) goto L165
            float r11 = r9.f2296a
            float r12 = r9.f2297b
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r14 = (long) r11
            int r11 = java.lang.Float.floatToRawIntBits(r12)
            long r11 = (long) r11
            r16 = 32
            long r14 = r14 << r16
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r17
            long r11 = r11 | r14
            long r11 = r10.w(r11)
            float r14 = r9.f2298c
            float r9 = r9.f2299d
            int r14 = java.lang.Float.floatToRawIntBits(r14)
            long r14 = (long) r14
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            r19 = r14
            long r13 = (long) r9
            long r19 = r19 << r16
            long r13 = r13 & r17
            long r13 = r19 | r13
            long r13 = r10.w(r13)
            android.graphics.RectF r9 = new android.graphics.RectF
            r15 = r10
            r19 = r11
            long r10 = r19 >> r16
            int r10 = (int) r10
            float r11 = java.lang.Float.intBitsToFloat(r10)
            r21 = r13
            long r12 = r21 >> r16
            int r12 = (int) r12
            float r13 = java.lang.Float.intBitsToFloat(r12)
            float r11 = java.lang.Math.min(r11, r13)
            long r13 = r19 & r17
            int r13 = (int) r13
            float r14 = java.lang.Float.intBitsToFloat(r13)
            r16 = r12
            r19 = r13
            long r12 = r21 & r17
            int r12 = (int) r12
            float r13 = java.lang.Float.intBitsToFloat(r12)
            float r13 = java.lang.Math.min(r14, r13)
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r14 = java.lang.Float.intBitsToFloat(r16)
            float r10 = java.lang.Math.max(r10, r14)
            float r14 = java.lang.Float.intBitsToFloat(r19)
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r12 = java.lang.Math.max(r14, r12)
            r9.<init>(r11, r13, r10, r12)
            goto L167
        L165:
            r15 = r10
            r9 = 0
        L167:
            r7.add(r9)
        L16a:
            int r8 = r8 + 1
            r10 = r15
            r12 = 0
            goto L9a
        L170:
            android.os.Bundle r1 = r3.getExtras()
            r3 = 0
            android.graphics.RectF[] r3 = new android.graphics.RectF[r3]
            java.lang.Object[] r3 = r7.toArray(r3)
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            r1.putParcelableArray(r2, r3)
            return
        L181:
            java.lang.String r1 = "AccessibilityDelegate"
            java.lang.String r2 = "Invalid arguments for accessibility character locations"
            android.util.Log.e(r1, r2)
            return
        L189:
            r15 = r10
            f2.x r1 = f2.u.f3248z
            boolean r7 = r8.c(r1)
            if (r7 == 0) goto L1b1
            if (r4 == 0) goto L1b1
            java.lang.String r4 = "androidx.compose.ui.semantics.testTag"
            boolean r4 = gg.l.a(r2, r4)
            if (r4 == 0) goto L1b1
            java.lang.Object r1 = r8.g(r1)
            if (r1 != 0) goto L1a4
            r12 = 0
            goto L1a5
        L1a4:
            r12 = r1
        L1a5:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L313
            android.os.Bundle r1 = r3.getExtras()
            r1.putCharSequence(r2, r12)
            return
        L1b1:
            java.lang.String r1 = "androidx.compose.ui.semantics.id"
            boolean r1 = gg.l.a(r2, r1)
            if (r1 == 0) goto L1c3
            android.os.Bundle r1 = r3.getExtras()
            int r3 = r5.f3215f
            r1.putInt(r2, r3)
            return
        L1c3:
            java.lang.String r1 = "androidx.compose.ui.semantics.shapeType"
            boolean r4 = gg.l.a(r2, r1)
            java.lang.String r7 = "androidx.compose.ui.semantics.shapeRegion"
            java.lang.String r9 = "androidx.compose.ui.semantics.shapeCorners"
            java.lang.String r10 = "androidx.compose.ui.semantics.shapeRect"
            if (r4 == 0) goto L255
            f2.x r2 = f2.u.P
            java.lang.Object r2 = r8.g(r2)
            if (r2 != 0) goto L1db
            r12 = 0
            goto L1dc
        L1db:
            r12 = r2
        L1dc:
            f1.r0 r12 = (f1.r0) r12
            if (r12 == 0) goto L313
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3.getBoundsInScreen(r2)
            e1.c r2 = r0.n(r5, r2, r12)
            float r4 = r2.f2297b
            float r5 = r2.f2296a
            long r13 = r2.c()
            u2.m r2 = r6.F
            u2.c r6 = r15.getDensity()
            f1.c0 r2 = r12.a(r13, r2, r6)
            boolean r6 = r2 instanceof f1.k0
            if (r6 == 0) goto L216
            android.os.Bundle r6 = r3.getExtras()
            r7 = 0
            r6.putInt(r1, r7)
            android.os.Bundle r1 = r3.getExtras()
            android.graphics.Rect r2 = E(r2, r5, r4)
            r1.putParcelable(r10, r2)
            return
        L216:
            boolean r6 = r2 instanceof f1.l0
            if (r6 == 0) goto L239
            android.os.Bundle r6 = r3.getExtras()
            r7 = 1
            r6.putInt(r1, r7)
            android.os.Bundle r1 = r3.getExtras()
            android.graphics.Rect r4 = E(r2, r5, r4)
            r1.putParcelable(r10, r4)
            android.os.Bundle r1 = r3.getExtras()
            float[] r2 = G(r2)
            r1.putFloatArray(r9, r2)
            return
        L239:
            boolean r6 = r2 instanceof f1.j0
            if (r6 == 0) goto L251
            android.os.Bundle r6 = r3.getExtras()
            r8 = 2
            r6.putInt(r1, r8)
            android.os.Bundle r1 = r3.getExtras()
            android.graphics.Region r2 = H(r2, r5, r4)
            r1.putParcelable(r7, r2)
            return
        L251:
            okio.a.k()
            return
        L255:
            boolean r1 = gg.l.a(r2, r10)
            if (r1 == 0) goto L296
            f2.x r1 = f2.u.P
            java.lang.Object r1 = r8.g(r1)
            if (r1 != 0) goto L265
            r12 = 0
            goto L266
        L265:
            r12 = r1
        L266:
            f1.r0 r12 = (f1.r0) r12
            if (r12 == 0) goto L313
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.getBoundsInScreen(r1)
            e1.c r1 = r0.n(r5, r1, r12)
            long r4 = r1.c()
            u2.m r2 = r6.F
            u2.c r6 = r15.getDensity()
            f1.c0 r2 = r12.a(r4, r2, r6)
            float r4 = r1.f2296a
            float r1 = r1.f2297b
            android.graphics.Rect r1 = E(r2, r4, r1)
            if (r1 == 0) goto L313
            android.os.Bundle r2 = r3.getExtras()
            r2.putParcelable(r10, r1)
            return
        L296:
            boolean r1 = gg.l.a(r2, r9)
            if (r1 == 0) goto L2d3
            f2.x r1 = f2.u.P
            java.lang.Object r1 = r8.g(r1)
            if (r1 != 0) goto L2a6
            r12 = 0
            goto L2a7
        L2a6:
            r12 = r1
        L2a7:
            f1.r0 r12 = (f1.r0) r12
            if (r12 == 0) goto L313
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.getBoundsInScreen(r1)
            e1.c r1 = r0.n(r5, r1, r12)
            long r1 = r1.c()
            u2.m r4 = r6.F
            u2.c r5 = r15.getDensity()
            f1.c0 r1 = r12.a(r1, r4, r5)
            float[] r1 = G(r1)
            if (r1 == 0) goto L313
            android.os.Bundle r2 = r3.getExtras()
            r2.putFloatArray(r9, r1)
            return
        L2d3:
            boolean r1 = gg.l.a(r2, r7)
            if (r1 == 0) goto L313
            f2.x r1 = f2.u.P
            java.lang.Object r1 = r8.g(r1)
            if (r1 != 0) goto L2e3
            r12 = 0
            goto L2e4
        L2e3:
            r12 = r1
        L2e4:
            f1.r0 r12 = (f1.r0) r12
            if (r12 == 0) goto L313
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.getBoundsInScreen(r1)
            e1.c r1 = r0.n(r5, r1, r12)
            long r4 = r1.c()
            u2.m r2 = r6.F
            u2.c r6 = r15.getDensity()
            f1.c0 r2 = r12.a(r4, r2, r6)
            float r4 = r1.f2296a
            float r1 = r1.f2297b
            android.graphics.Region r1 = H(r2, r4, r1)
            if (r1 == 0) goto L313
            android.os.Bundle r2 = r3.getExtras()
            r2.putParcelable(r7, r1)
        L313:
            return
    }

    public final android.graphics.Rect d(f2.r r4) {
            r3 = this;
            u2.k r4 = r4.f3217b
            int r0 = r4.f13349a
            float r0 = (float) r0
            int r1 = r4.f13350b
            float r1 = (float) r1
            int r2 = r4.f13351c
            float r2 = (float) r2
            int r4 = r4.f13352d
            float r4 = (float) r4
            android.graphics.Rect r4 = r3.F(r0, r1, r2, r4)
            return r4
    }

    public final java.lang.Object e(yf.c r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            boolean r2 = r0 instanceof y1.w
            if (r2 == 0) goto L17
            r2 = r0
            y1.w r2 = (y1.w) r2
            int r3 = r2.f22143k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f22143k = r3
            goto L1c
        L17:
            y1.w r2 = new y1.w
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.f22141i
            int r3 = r2.f22143k
            r4 = 2
            f.f r5 = r1.B
            r6 = 1
            xf.a r7 = xf.a.f21579g
            if (r3 == 0) goto L4a
            if (r3 == r6) goto L42
            if (r3 != r4) goto L3b
            sg.b r3 = r2.f22140h
            f.x r8 = r2.f22139g
            f8.i.I0(r0)     // Catch: java.lang.Throwable -> L37
            r0 = r4
            r9 = r5
            goto Lfa
        L37:
            r0 = move-exception
            r9 = r5
            goto L107
        L3b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            r0 = 0
            return r0
        L42:
            sg.b r3 = r2.f22140h
            f.x r8 = r2.f22139g
            f8.i.I0(r0)     // Catch: java.lang.Throwable -> L37
            goto L6e
        L4a:
            f8.i.I0(r0)
            f.x r0 = new f.x     // Catch: java.lang.Throwable -> L37
            r0.<init>()     // Catch: java.lang.Throwable -> L37
            sg.c r3 = r1.C     // Catch: java.lang.Throwable -> L37
            r3.getClass()     // Catch: java.lang.Throwable -> L37
            sg.b r8 = new sg.b     // Catch: java.lang.Throwable -> L37
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L37
        L5c:
            r2.f22139g = r0     // Catch: java.lang.Throwable -> L37
            r2.f22140h = r8     // Catch: java.lang.Throwable -> L37
            r2.f22143k = r6     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r8.b(r2)     // Catch: java.lang.Throwable -> L37
            if (r3 != r7) goto L6a
            goto Lf9
        L6a:
            r15 = r8
            r8 = r0
            r0 = r3
            r3 = r15
        L6e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L37
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L100
            r3.c()     // Catch: java.lang.Throwable -> L37
            boolean r0 = r1.o()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto Ldc
            int r0 = r5.f2802i     // Catch: java.lang.Throwable -> L37
            r9 = 0
            r10 = r9
        L83:
            if (r10 >= r0) goto L94
            java.lang.Object[] r11 = r5.f2801h     // Catch: java.lang.Throwable -> L37
            r11 = r11[r10]     // Catch: java.lang.Throwable -> L37
            x1.f0 r11 = (x1.f0) r11     // Catch: java.lang.Throwable -> L37
            r1.B(r11, r8)     // Catch: java.lang.Throwable -> L37
            r1.C(r11)     // Catch: java.lang.Throwable -> L37
            int r10 = r10 + 1
            goto L83
        L94:
            r8.f2921d = r9     // Catch: java.lang.Throwable -> L37
            long[] r0 = r8.f2918a     // Catch: java.lang.Throwable -> L37
            long[] r9 = f.r0.f2895a     // Catch: java.lang.Throwable -> L37
            if (r0 == r9) goto Lba
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            tf.l.w0(r9, r0)     // Catch: java.lang.Throwable -> L37
            long[] r0 = r8.f2918a     // Catch: java.lang.Throwable -> L37
            int r9 = r8.f2920c     // Catch: java.lang.Throwable -> L37
            int r10 = r9 >> 3
            r9 = r9 & 7
            int r9 = r9 << 3
            r11 = r0[r10]     // Catch: java.lang.Throwable -> L37
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 << r9
            r9 = r5
            long r4 = ~r13
            long r4 = r4 & r11
            long r4 = r4 | r13
            r0[r10] = r4     // Catch: java.lang.Throwable -> Lda
            goto Lbb
        Lba:
            r9 = r5
        Lbb:
            int r0 = r8.f2920c     // Catch: java.lang.Throwable -> Lda
            int r0 = f.r0.a(r0)     // Catch: java.lang.Throwable -> Lda
            int r4 = r8.f2921d     // Catch: java.lang.Throwable -> Lda
            int r0 = r0 - r4
            r8.f2922e = r0     // Catch: java.lang.Throwable -> Lda
            y1.t r0 = r1.f22166j     // Catch: java.lang.Throwable -> Lda
            android.os.Handler r0 = r0.getHandler()     // Catch: java.lang.Throwable -> Lda
            boolean r4 = r1.O     // Catch: java.lang.Throwable -> Lda
            if (r4 != 0) goto Ldd
            if (r0 == 0) goto Ldd
            r1.O = r6     // Catch: java.lang.Throwable -> Lda
            wb.cr r4 = r1.Q     // Catch: java.lang.Throwable -> Lda
            r0.post(r4)     // Catch: java.lang.Throwable -> Lda
            goto Ldd
        Lda:
            r0 = move-exception
            goto L107
        Ldc:
            r9 = r5
        Ldd:
            r9.clear()     // Catch: java.lang.Throwable -> Lda
            f.w r0 = r1.f22178v     // Catch: java.lang.Throwable -> Lda
            r0.c()     // Catch: java.lang.Throwable -> Lda
            f.w r0 = r1.f22179w     // Catch: java.lang.Throwable -> Lda
            r0.c()     // Catch: java.lang.Throwable -> Lda
            long r4 = r1.f22170n     // Catch: java.lang.Throwable -> Lda
            r2.f22139g = r8     // Catch: java.lang.Throwable -> Lda
            r2.f22140h = r3     // Catch: java.lang.Throwable -> Lda
            r0 = 2
            r2.f22143k = r0     // Catch: java.lang.Throwable -> Lda
            java.lang.Object r4 = qg.v.f(r4, r2)     // Catch: java.lang.Throwable -> Lda
            if (r4 != r7) goto Lfa
        Lf9:
            return r7
        Lfa:
            r4 = r0
            r0 = r8
            r5 = r9
            r8 = r3
            goto L5c
        L100:
            r9 = r5
            r9.clear()
            sf.n r0 = sf.n.f12433a
            return r0
        L107:
            r9.clear()
            throw r0
    }

    public final boolean f(int r23, long r24, boolean r26) {
            r22 = this;
            r0 = r24
            r2 = r26
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Thread r3 = r3.getThread()
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L1a
        L16:
            r16 = 0
            goto L13d
        L1a:
            f.k r3 = r22.l()
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r5 = e1.b.b(r0, r5)
            if (r5 != 0) goto L16
            r5 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r5 = r5 & r0
            r7 = 36028792732385279(0x7fffff007fffff, double:2.848093183464406E-306)
            long r5 = r5 + r7
            r7 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L16
            r5 = 1
            if (r2 != r5) goto L47
            f2.x r2 = f2.u.f3244v
            goto L4b
        L47:
            if (r2 != 0) goto L138
            f2.x r2 = f2.u.f3243u
        L4b:
            java.lang.Object[] r6 = r3.f2845c
            long[] r3 = r3.f2843a
            int r7 = r3.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L16
            r8 = 0
            r9 = 0
        L56:
            r10 = r3[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L12c
            int r12 = r8 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L70:
            if (r14 >= r12) goto L125
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L116
            int r15 = r8 << 3
            int r15 = r15 + r14
            r15 = r6[r15]
            f2.r r15 = (f2.r) r15
            r16 = 0
            u2.k r4 = r15.f3217b
            int r5 = r4.f13349a
            float r5 = (float) r5
            r26 = r13
            int r13 = r4.f13350b
            float r13 = (float) r13
            int r0 = r4.f13351c
            float r0 = (float) r0
            int r1 = r4.f13352d
            float r1 = (float) r1
            r4 = 32
            r18 = r0
            r19 = r1
            long r0 = r24 >> r4
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = r0
            long r0 = r24 & r20
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r1 < 0) goto Lb4
            r1 = 1
            goto Lb6
        Lb4:
            r1 = r16
        Lb6:
            int r4 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r4 >= 0) goto Lbc
            r4 = 1
            goto Lbe
        Lbc:
            r4 = r16
        Lbe:
            r1 = r1 & r4
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 < 0) goto Lc5
            r4 = 1
            goto Lc7
        Lc5:
            r4 = r16
        Lc7:
            r1 = r1 & r4
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 >= 0) goto Lce
            r0 = 1
            goto Ld0
        Lce:
            r0 = r16
        Ld0:
            r0 = r0 & r1
            if (r0 != 0) goto Ld4
            goto L11a
        Ld4:
            f2.q r0 = r15.f3216a
            f2.m r0 = r0.f3213d
            f.k0 r0 = r0.f3204g
            java.lang.Object r0 = r0.g(r2)
            if (r0 != 0) goto Le1
            r0 = 0
        Le1:
            f2.j r0 = (f2.j) r0
            if (r0 != 0) goto Le6
            goto L11a
        Le6:
            fg.a r1 = r0.f3156a
            if (r23 >= 0) goto Lfb
            java.lang.Object r0 = r1.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L11a
        Lf9:
            r9 = 1
            goto L11a
        Lfb:
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            fg.a r0 = r0.f3157b
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L11a
            goto Lf9
        L116:
            r26 = r13
            r16 = 0
        L11a:
            long r10 = r10 >> r26
            int r14 = r14 + 1
            r0 = r24
            r13 = r26
            r5 = 1
            goto L70
        L125:
            r0 = r13
            r16 = 0
            if (r12 != r0) goto L12b
            goto L12e
        L12b:
            return r9
        L12c:
            r16 = 0
        L12e:
            if (r8 == r7) goto L137
            int r8 = r8 + 1
            r0 = r24
            r5 = 1
            goto L56
        L137:
            return r9
        L138:
            okio.a.k()
            r0 = 0
            return r0
        L13d:
            return r16
    }

    public final void g() {
            r2 = this;
            java.lang.String r0 = "sendAccessibilitySemanticsStructureChangeEvents"
            android.os.Trace.beginSection(r0)
            boolean r0 = r2.o()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            y1.t r0 = r2.f22166j     // Catch: java.lang.Throwable -> L1b
            f2.s r0 = r0.getSemanticsOwner()     // Catch: java.lang.Throwable -> L1b
            f2.q r0 = r0.a()     // Catch: java.lang.Throwable -> L1b
            y1.f2 r1 = r2.N     // Catch: java.lang.Throwable -> L1b
            r2.u(r0, r1)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r0 = move-exception
            goto L45
        L1d:
            android.os.Trace.endSection()
            java.lang.String r0 = "sendSemanticsPropertyChangeEvents"
            android.os.Trace.beginSection(r0)
            f.k r0 = r2.l()     // Catch: java.lang.Throwable -> L40
            r2.A(r0)     // Catch: java.lang.Throwable -> L40
            android.os.Trace.endSection()
            java.lang.String r0 = "updateSemanticsNodesCopyAndPanes"
            android.os.Trace.beginSection(r0)
            r2.J()     // Catch: java.lang.Throwable -> L3b
            android.os.Trace.endSection()
            return
        L3b:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L40:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L45:
            android.os.Trace.endSection()
            throw r0
    }

    public final android.view.accessibility.AccessibilityEvent h(int r3, int r4) {
            r2 = this;
            android.view.accessibility.AccessibilityEvent r4 = android.view.accessibility.AccessibilityEvent.obtain(r4)
            r0 = 1
            r4.setEnabled(r0)
            java.lang.String r0 = "android.view.View"
            r4.setClassName(r0)
            y1.t r0 = r2.f22166j
            android.content.Context r1 = r0.getContext()
            java.lang.String r1 = r1.getPackageName()
            r4.setPackageName(r1)
            r4.setSource(r0, r3)
            boolean r0 = r2.o()
            if (r0 == 0) goto L5a
            f.k r0 = r2.l()
            java.lang.Object r3 = r0.b(r3)
            f2.r r3 = (f2.r) r3
            if (r3 == 0) goto L5a
            f2.q r3 = r3.f3216a
            f2.m r0 = r3.f3213d
            f2.x r1 = f2.u.K
            f.k0 r0 = r0.f3204g
            boolean r0 = r0.c(r1)
            r4.setPassword(r0)
            f2.m r3 = r3.f3213d
            f2.x r0 = f2.u.f3236n
            f.k0 r3 = r3.f3204g
            java.lang.Object r3 = r3.g(r0)
            if (r3 != 0) goto L4b
            r3 = 0
        L4b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r3 = gg.l.a(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L5a
            h3.b.f(r4, r3)
        L5a:
            return r4
    }

    public final android.view.accessibility.AccessibilityEvent i(int r2, java.lang.Integer r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.CharSequence r6) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            android.view.accessibility.AccessibilityEvent r2 = r1.h(r2, r0)
            if (r3 == 0) goto Lf
            int r3 = r3.intValue()
            r2.setFromIndex(r3)
        Lf:
            if (r4 == 0) goto L18
            int r3 = r4.intValue()
            r2.setToIndex(r3)
        L18:
            if (r5 == 0) goto L21
            int r3 = r5.intValue()
            r2.setItemCount(r3)
        L21:
            if (r6 == 0) goto L2a
            java.util.List r3 = r2.getText()
            r3.add(r6)
        L2a:
            return r2
    }

    public final int j(f2.q r5) {
            r4 = this;
            f2.m r5 = r5.f3213d
            f2.x r0 = f2.u.f3223a
            f.k0 r1 = r5.f3204g
            boolean r0 = r1.c(r0)
            if (r0 != 0) goto L26
            f2.x r0 = f2.u.G
            f.k0 r1 = r5.f3204g
            boolean r1 = r1.c(r0)
            if (r1 == 0) goto L26
            java.lang.Object r5 = r5.d(r0)
            i2.m0 r5 = (i2.m0) r5
            long r0 = r5.f6360a
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r5 = (int) r0
            return r5
        L26:
            int r5 = r4.f22182z
            return r5
    }

    public final int k(f2.q r3) {
            r2 = this;
            f2.m r3 = r3.f3213d
            f2.x r0 = f2.u.f3223a
            f.k0 r1 = r3.f3204g
            boolean r0 = r1.c(r0)
            if (r0 != 0) goto L23
            f2.x r0 = f2.u.G
            f.k0 r1 = r3.f3204g
            boolean r1 = r1.c(r0)
            if (r1 == 0) goto L23
            java.lang.Object r3 = r3.d(r0)
            i2.m0 r3 = (i2.m0) r3
            long r0 = r3.f6360a
            r3 = 32
            long r0 = r0 >> r3
            int r3 = (int) r0
            return r3
        L23:
            int r3 = r2.f22182z
            return r3
    }

    public final f.k l() {
            r7 = this;
            boolean r0 = r7.D
            if (r0 == 0) goto L7a
            r0 = 0
            r7.D = r0
            y1.t r0 = r7.f22166j
            f2.s r1 = r0.getSemanticsOwner()
            y1.o r2 = y1.o.f22019i
            f.w r1 = f2.t.b(r1, r2)
            r7.F = r1
            boolean r1 = r7.o()
            if (r1 == 0) goto L7a
            f.w r1 = r7.F
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            f.u r2 = r7.H
            r2.a()
            f.u r3 = r7.I
            r3.a()
            r4 = -1
            java.lang.Object r4 = r1.b(r4)
            f2.r r4 = (f2.r) r4
            if (r4 == 0) goto L3b
            f2.q r4 = r4.f3216a
            goto L3c
        L3b:
            r4 = 0
        L3c:
            r4.getClass()
            b1.f r5 = new b1.f
            r6 = 22
            r5.<init>(r1, r6)
            b1.f r1 = new b1.f
            r6 = 23
            r1.<init>(r0, r6)
            java.util.List r0 = a.a.x0(r4)
            java.util.ArrayList r0 = f2.z.b(r4, r5, r1, r0)
            int r1 = r0.size()
            r4 = 1
            int r1 = r1 - r4
            if (r4 > r1) goto L7a
        L5d:
            int r5 = r4 + (-1)
            java.lang.Object r5 = r0.get(r5)
            f2.q r5 = (f2.q) r5
            int r5 = r5.f3215f
            java.lang.Object r6 = r0.get(r4)
            f2.q r6 = (f2.q) r6
            int r6 = r6.f3215f
            r2.f(r5, r6)
            r3.f(r6, r5)
            if (r4 == r1) goto L7a
            int r4 = r4 + 1
            goto L5d
        L7a:
            f.w r0 = r7.F
            return r0
    }

    public final e1.c n(f2.q r10, android.graphics.Rect r11, f1.r0 r12) {
            r9 = this;
            y1.x r0 = new y1.x
            r0.<init>(r12)
            x1.f0 r10 = r10.f3212c
            x1.b1 r12 = r10.L
            y0.n r12 = r12.f20844f
            int r1 = r12.f21822j
            r1 = r1 & 8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L76
        L14:
            if (r12 == 0) goto L76
            int r1 = r12.f21821i
            r1 = r1 & 8
            if (r1 == 0) goto L6d
            r1 = r12
            r5 = r2
        L1e:
            if (r1 == 0) goto L6d
            boolean r6 = r1 instanceof x1.z1
            if (r6 == 0) goto L30
            r6 = r1
            x1.z1 r6 = (x1.z1) r6
            r6.X0(r0)
            boolean r6 = r0.f22149g
            if (r6 == 0) goto L68
            r2 = r1
            goto L76
        L30:
            int r6 = r1.f21821i
            r6 = r6 & 8
            if (r6 == 0) goto L68
            boolean r6 = r1 instanceof x1.j
            if (r6 == 0) goto L68
            r6 = r1
            x1.j r6 = (x1.j) r6
            y0.n r6 = r6.f20950v
            r7 = r4
        L40:
            if (r6 == 0) goto L65
            int r8 = r6.f21821i
            r8 = r8 & 8
            if (r8 == 0) goto L62
            int r7 = r7 + 1
            if (r7 != r3) goto L4e
            r1 = r6
            goto L62
        L4e:
            if (r5 != 0) goto L59
            j0.b r5 = new j0.b
            r8 = 16
            y0.n[] r8 = new y0.n[r8]
            r5.<init>(r8)
        L59:
            if (r1 == 0) goto L5f
            r5.b(r1)
            r1 = r2
        L5f:
            r5.b(r6)
        L62:
            y0.n r6 = r6.f21824l
            goto L40
        L65:
            if (r7 != r3) goto L68
            goto L1e
        L68:
            y0.n r1 = x1.k.e(r5)
            goto L1e
        L6d:
            int r1 = r12.f21822j
            r1 = r1 & 8
            if (r1 == 0) goto L76
            y0.n r12 = r12.f21824l
            goto L14
        L76:
            x1.z1 r2 = (x1.z1) r2
            if (r2 == 0) goto Lb9
            r12 = r2
            y0.n r12 = (y0.n) r12
            y0.n r12 = r12.f21819g
            boolean r12 = r12.f21832t
            if (r12 != r3) goto Lb9
            x1.i1 r10 = x1.k.v(r2)
            v1.t r12 = v1.w.h(r10)
            e1.c r10 = r12.k0(r10, r4)
            float r12 = r10.f2296a
            float r0 = r10.f2297b
            float r1 = r10.f2298c
            float r10 = r10.f2299d
            android.graphics.Rect r10 = r9.F(r12, r0, r1, r10)
            int r12 = r10.left
            int r0 = r11.left
            int r12 = r12 - r0
            float r12 = (float) r12
            int r0 = r10.top
            int r11 = r11.top
            int r0 = r0 - r11
            float r11 = (float) r0
            e1.c r0 = new e1.c
            int r1 = r10.width()
            float r1 = (float) r1
            float r1 = r1 + r12
            int r10 = r10.height()
            float r10 = (float) r10
            float r10 = r10 + r11
            r0.<init>(r12, r11, r1, r10)
            return r0
        Lb9:
            x1.b1 r10 = r10.L
            x1.i1 r10 = r10.f20842d
            e1.c r10 = v1.w.f(r10, r4)
            return r10
    }

    public final boolean o() {
            r2 = this;
            android.view.accessibility.AccessibilityManager r0 = r2.f22169m
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L1b
            java.util.List r1 = r2.f22171o
            if (r1 != 0) goto L13
            r1 = -1
            java.util.List r1 = r0.getEnabledAccessibilityServiceList(r1)
            r2.f22171o = r1
        L13:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L1b
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean r1) {
            r0 = this;
            r1 = 0
            r0.f22171o = r1
            return
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean r1) {
            r0 = this;
            r1 = 0
            r0.f22171o = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityManager r2 = r1.f22169m
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto Lb
            r0 = 0
            r1.f22171o = r0
        Lb:
            r2.addAccessibilityStateChangeListener(r1)
            r2.addTouchExplorationStateChangeListener(r1)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            y1.t r2 = r1.f22166j
            android.os.Handler r2 = r2.getHandler()
            r2.getClass()
            wb.cr r0 = r1.Q
            r2.removeCallbacks(r0)
            android.view.accessibility.AccessibilityManager r2 = r1.f22169m
            r2.removeAccessibilityStateChangeListener(r1)
            r2.removeTouchExplorationStateChangeListener(r1)
            return
    }

    public final void p(x1.f0 r2) {
            r1 = this;
            f.f r0 = r1.B
            boolean r2 = r0.add(r2)
            if (r2 == 0) goto Lf
            sg.c r2 = r1.C
            sf.n r0 = sf.n.f12433a
            r2.p(r0)
        Lf:
            return
    }

    public final int t(int r2) {
            r1 = this;
            y1.t r0 = r1.f22166j
            f2.s r0 = r0.getSemanticsOwner()
            f2.q r0 = r0.a()
            int r0 = r0.f3215f
            if (r2 != r0) goto Lf
            r2 = -1
        Lf:
            return r2
    }

    public final void u(f2.q r20, y1.f2 r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = f.m.f2860a
            f.x r3 = new f.x
            r3.<init>()
            r4 = 4
            java.util.List r5 = f2.q.j(r4, r1)
            x1.f0 r6 = r1.f3212c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            f2.q r10 = (f2.q) r10
            f.k r11 = r0.l()
            int r10 = r10.f3215f
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L3d
            f.x r11 = r2.f21912b
            boolean r11 = r11.b(r10)
            if (r11 != 0) goto L3a
            r0.p(r6)
            return
        L3a:
            r3.a(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            f.x r2 = r2.f21912b
            int[] r5 = r2.f2919b
            long[] r2 = r2.f2918a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.b(r15)
            if (r15 != 0) goto L80
            r0.p(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = f2.q.j(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            f2.q r3 = (f2.q) r3
            f.w r4 = r0.M
            int r5 = r3.f3215f
            java.lang.Object r4 = r4.b(r5)
            y1.f2 r4 = (y1.f2) r4
            if (r4 == 0) goto Lb6
            f.k r5 = r0.l()
            int r6 = r3.f3215f
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lb6
            r0.u(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
    }

    public final boolean v(android.view.accessibility.AccessibilityEvent r4) {
            r3 = this;
            boolean r0 = r3.o()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r4.getEventType()
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 == r2) goto L19
            int r0 = r4.getEventType()
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r0 != r2) goto L1c
        L19:
            r0 = 1
            r3.f22177u = r0
        L1c:
            y1.y r0 = r3.f22168l     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r4 = r0.invoke(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L2b
            r3.f22177u = r1
            return r4
        L2b:
            r4 = move-exception
            r3.f22177u = r1
            throw r4
    }

    public final boolean w(int r2, int r3, java.lang.Integer r4, java.util.List r5) {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L2b
            boolean r0 = r1.o()
            if (r0 != 0) goto Lb
            goto L2b
        Lb:
            android.view.accessibility.AccessibilityEvent r2 = r1.h(r2, r3)
            if (r4 == 0) goto L18
            int r3 = r4.intValue()
            r2.setContentChangeTypes(r3)
        L18:
            if (r5 == 0) goto L26
            r3 = 0
            r4 = 62
            java.lang.String r0 = ","
            java.lang.String r3 = w2.a.a(r5, r0, r3, r4)
            r2.setContentDescription(r3)
        L26:
            boolean r2 = r1.v(r2)
            return r2
        L2b:
            r2 = 0
            return r2
    }

    public final void y(int r2, int r3, java.lang.String r4) {
            r1 = this;
            int r2 = r1.t(r2)
            r0 = 32
            android.view.accessibility.AccessibilityEvent r2 = r1.h(r2, r0)
            r2.setContentChangeTypes(r3)
            if (r4 == 0) goto L16
            java.util.List r3 = r2.getText()
            r3.add(r4)
        L16:
            r1.v(r2)
            return
    }

    public final void z(int r7) {
            r6 = this;
            y1.v r0 = r6.E
            if (r0 == 0) goto L46
            f2.q r1 = r0.f22129a
            int r2 = r1.f3215f
            if (r7 == r2) goto Lb
            return
        Lb:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r4 = r0.f22134f
            long r2 = r2 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L46
            int r7 = r1.f3215f
            int r7 = r6.t(r7)
            r2 = 131072(0x20000, float:1.83671E-40)
            android.view.accessibility.AccessibilityEvent r7 = r6.h(r7, r2)
            int r2 = r0.f22132d
            r7.setFromIndex(r2)
            int r2 = r0.f22133e
            r7.setToIndex(r2)
            int r2 = r0.f22130b
            r7.setAction(r2)
            int r0 = r0.f22131c
            r7.setMovementGranularity(r0)
            java.util.List r0 = r7.getText()
            java.lang.String r1 = m(r1)
            r0.add(r1)
            r6.v(r7)
        L46:
            r7 = 0
            r6.E = r7
            return
    }
}
