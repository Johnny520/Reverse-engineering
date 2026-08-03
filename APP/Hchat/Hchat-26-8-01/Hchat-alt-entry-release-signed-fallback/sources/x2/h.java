package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends android.view.ViewGroup implements i0.h, x1.s1, g3.e {
    public final int[] A;
    public int B;
    public int C;
    public final a2.a D;
    public boolean E;
    public final x1.f0 F;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r1.d f21123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.view.View f21124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x1.r1 f21125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fg.a f21126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public fg.a f21128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fg.a f21129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y0.o f21130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public fg.l f21131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u2.c f21132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public fg.l f21133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.lifecycle.q f21134r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u3.c f21135s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f21136t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f21137u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g3.r0 f21138v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public fg.l f21139w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x2.g f21140x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x2.g f21141y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public fg.l f21142z;

    public h(android.content.Context r5, i0.f0 r6, int r7, r1.d r8, android.view.View r9, x1.r1 r10) {
            r4 = this;
            r4.<init>(r5)
            r4.f21123g = r8
            r4.f21124h = r9
            r4.f21125i = r10
            f.k0 r5 = y1.v2.f22138a
            r5 = 2131099691(0x7f06002b, float:1.7811742E38)
            r4.setTag(r5, r6)
            r5 = 0
            r4.setSaveFromParentEnabled(r5)
            r4.addView(r9)
            x2.a r6 = new x2.a
            r7 = r4
            x2.v r7 = (x2.v) r7
            r6.<init>(r7, r5)
            g3.q.b(r4, r6)
            g3.m.b(r4, r4)
            x2.f r6 = x2.f.f21119j
            r4.f21126j = r6
            x2.f r6 = x2.f.f21118i
            r4.f21128l = r6
            x2.f r6 = x2.f.f21117h
            r4.f21129m = r6
            y0.l r6 = y0.l.f21818a
            r4.f21130n = r6
            u2.d r9 = fb.v0.a()
            r4.f21132p = r9
            r9 = 2
            int[] r10 = new int[r9]
            r4.f21136t = r10
            r0 = 0
            r4.f21137u = r0
            x2.g r10 = new x2.g
            r0 = 1
            r10.<init>(r7, r0)
            r4.f21140x = r10
            x2.g r10 = new x2.g
            r10.<init>(r7, r5)
            r4.f21141y = r10
            int[] r10 = new int[r9]
            r4.A = r10
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.B = r10
            r4.C = r10
            a2.a r10 = new a2.a
            r1 = 13
            r10.<init>(r1)
            r4.D = r10
            x1.f0 r10 = new x1.f0
            r1 = 3
            r10.<init>(r1)
            r10.f20903u = r7
            uf.d r1 = x2.i.f21143a
            y0.o r6 = r1.f.a(r6, r1, r8)
            x2.b r8 = x2.b.f21105j
            f2.b r1 = new f2.b
            r1.<init>(r0, r8)
            y0.o r6 = r6.d(r1)
            s1.a0 r8 = new s1.a0
            r8.<init>()
            s1.b0 r1 = new s1.b0
            r1.<init>(r7, r5)
            r8.f12203a = r1
            i0.c r1 = new i0.c
            r1.<init>()
            i0.c r2 = r8.f12204b
            if (r2 == 0) goto L98
            r3 = 0
            r2.f5853h = r3
        L98:
            r8.f12204b = r1
            r1.f5853h = r8
            r4.setOnRequestDisallowInterceptTouchEvent$ui(r1)
            y0.o r6 = r6.d(r8)
            b1.g r8 = new b1.g
            r1 = 6
            r8.<init>(r7, r10, r7, r1)
            y0.o r6 = c1.h.d(r6, r8)
            x2.c r8 = new x2.c
            r8.<init>(r7, r10, r9)
            y0.o r6 = v1.w.m(r6, r8)
            x2.m r8 = new x2.m
            s1.b0 r1 = new s1.b0
            r1.<init>(r7, r9)
            r8.<init>(r1)
            y0.o r6 = r6.d(r8)
            y0.o r8 = r4.f21130n
            y0.o r8 = r8.d(r6)
            r10.d0(r8)
            f1.p r8 = new f1.p
            r9 = 5
            r8.<init>(r10, r9, r6)
            r4.f21131o = r8
            u2.c r6 = r4.f21132p
            r10.Z(r6)
            b1.f r6 = new b1.f
            r8 = 18
            r6.<init>(r10, r8)
            r4.f21133q = r6
            x2.c r6 = new x2.c
            r6.<init>(r7, r10, r5)
            r10.S = r6
            s1.b0 r5 = new s1.b0
            r5.<init>(r7, r0)
            r10.T = r5
            x2.d r5 = new x2.d
            r5.<init>(r7, r10)
            r10.c0(r5)
            r4.F = r10
            return
    }

    public static final /* synthetic */ x1.t1 d(x2.v r0) {
            x1.t1 r0 = r0.getSnapshotObserver()
            return r0
    }

    public static final int e(x2.v r1, int r2, int r3, int r4) {
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 >= 0) goto L26
            if (r2 != r3) goto L7
            goto L26
        L7:
            r2 = -2
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r2) goto L16
            if (r3 == r0) goto L16
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            return r1
        L16:
            r2 = -1
            if (r4 != r2) goto L20
            if (r3 == r0) goto L20
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            return r1
        L20:
            r1 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            return r1
        L26:
            int r2 = r9.e0.r(r4, r2, r3)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            return r1
    }

    public static b3.a f(b3.a r2, int r3, int r4, int r5, int r6) {
            int r0 = r2.f445a
            int r0 = r0 - r3
            r3 = 0
            if (r0 >= 0) goto L7
            r0 = r3
        L7:
            int r1 = r2.f446b
            int r1 = r1 - r4
            if (r1 >= 0) goto Ld
            r1 = r3
        Ld:
            int r4 = r2.f447c
            int r4 = r4 - r5
            if (r4 >= 0) goto L13
            r4 = r3
        L13:
            int r2 = r2.f448d
            int r2 = r2 - r6
            if (r2 >= 0) goto L19
            goto L1a
        L19:
            r3 = r2
        L1a:
            b3.a r2 = b3.a.b(r0, r1, r4, r3)
            return r2
    }

    private final x1.t1 getSnapshotObserver() {
            r1 = this;
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "Expected AndroidViewHolder to be attached when observing reads."
            u1.a.b(r0)
        Lb:
            x1.r1 r0 = r1.f21125i
            y1.t r0 = (y1.t) r0
            x1.t1 r0 = r0.getSnapshotObserver()
            return r0
    }

    @Override // x1.s1
    public final boolean L() {
            r1 = this;
            boolean r0 = r1.isAttachedToWindow()
            return r0
    }

    @Override // i0.h
    public final void a() {
            r1 = this;
            fg.a r0 = r1.f21129m
            r0.invoke()
            return
    }

    @Override // i0.h
    public final void b() {
            r1 = this;
            fg.a r0 = r1.f21128l
            r0.invoke()
            r1.removeAllViewsInLayout()
            return
    }

    @Override // g3.e
    public final g3.r0 c(android.view.View r1, g3.r0 r2) {
            r0 = this;
            g3.r0 r1 = new g3.r0
            r1.<init>(r2)
            r0.f21138v = r1
            g3.r0 r1 = r0.g(r2)
            return r1
    }

    public final g3.r0 g(g3.r0 r15) {
            r14 = this;
            g3.n0 r0 = r15.f4230a
            r1 = -1
            b3.a r1 = r0.g(r1)
            b3.a r2 = b3.a.f444e
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L21
            r1 = -9
            b3.a r1 = r0.h(r1)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L21
            g3.d r0 = r0.f()
            if (r0 == 0) goto L8e
        L21:
            x1.f0 r0 = r14.F
            x1.b1 r0 = r0.L
            x1.r r0 = r0.f20841c
            x1.b2 r1 = r0.Y
            boolean r1 = r1.f21832t
            if (r1 != 0) goto L2e
            goto L8e
        L2e:
            r1 = 0
            long r1 = r0.m0(r1)
            long r1 = ig.a.W(r1)
            r3 = 32
            long r4 = r1 >> r3
            int r4 = (int) r4
            r5 = 0
            if (r4 >= 0) goto L41
            r4 = r5
        L41:
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r6
            int r1 = (int) r1
            if (r1 >= 0) goto L4b
            r1 = r5
        L4b:
            v1.t r2 = v1.w.h(r0)
            long r8 = r2.F()
            long r10 = r8 >> r3
            int r2 = (int) r10
            long r8 = r8 & r6
            int r8 = (int) r8
            long r9 = r0.f13902i
            long r11 = r9 >> r3
            int r11 = (int) r11
            long r9 = r9 & r6
            int r9 = (int) r9
            float r10 = (float) r11
            float r9 = (float) r9
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r10 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r12 = (long) r9
            long r9 = r10 << r3
            long r11 = r12 & r6
            long r9 = r9 | r11
            long r9 = r0.m0(r9)
            long r9 = ig.a.W(r9)
            long r11 = r9 >> r3
            int r0 = (int) r11
            int r2 = r2 - r0
            if (r2 >= 0) goto L7f
            r2 = r5
        L7f:
            long r6 = r6 & r9
            int r0 = (int) r6
            int r8 = r8 - r0
            if (r8 >= 0) goto L85
            goto L86
        L85:
            r5 = r8
        L86:
            if (r4 != 0) goto L8f
            if (r1 != 0) goto L8f
            if (r2 != 0) goto L8f
            if (r5 != 0) goto L8f
        L8e:
            return r15
        L8f:
            g3.n0 r15 = r15.f4230a
            g3.r0 r15 = r15.n(r4, r1, r2, r5)
            return r15
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(android.graphics.Region r10) {
            r9 = this;
            r0 = 1
            if (r10 != 0) goto L4
            return r0
        L4:
            int[] r1 = r9.A
            r9.getLocationInWindow(r1)
            r2 = 0
            r4 = r1[r2]
            r5 = r1[r0]
            int r2 = r9.getWidth()
            int r6 = r2 + r4
            r1 = r1[r0]
            int r2 = r9.getHeight()
            int r7 = r2 + r1
            android.graphics.Region$Op r8 = android.graphics.Region.Op.DIFFERENCE
            r3 = r10
            r3.op(r4, r5, r6, r7, r8)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            return r0
    }

    public final u2.c getDensity() {
            r1 = this;
            u2.c r0 = r1.f21132p
            return r0
    }

    public final android.view.View getInteropView() {
            r1 = this;
            android.view.View r0 = r1.f21124h
            return r0
    }

    public final x1.f0 getLayoutNode() {
            r1 = this;
            x1.f0 r0 = r1.F
            return r0
    }

    @Override // android.view.View
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
            r2 = this;
            android.view.View r0 = r2.f21124h
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto Le
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
        Le:
            return r0
    }

    public final androidx.lifecycle.q getLifecycleOwner() {
            r1 = this;
            androidx.lifecycle.q r0 = r1.f21134r
            return r0
    }

    public final y0.o getModifier() {
            r1 = this;
            y0.o r0 = r1.f21130n
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            a2.a r0 = r1.D
            r0.getClass()
            r0 = 0
            return r0
    }

    public final fg.l getOnDensityChanged$ui() {
            r1 = this;
            fg.l r0 = r1.f21133q
            return r0
    }

    public final fg.l getOnModifierChanged$ui() {
            r1 = this;
            fg.l r0 = r1.f21131o
            return r0
    }

    public final fg.l getOnRequestDisallowInterceptTouchEvent$ui() {
            r1 = this;
            fg.l r0 = r1.f21142z
            return r0
    }

    public final fg.a getRelease() {
            r1 = this;
            fg.a r0 = r1.f21129m
            return r0
    }

    public final fg.a getReset() {
            r1 = this;
            fg.a r0 = r1.f21128l
            return r0
    }

    public final u3.c getSavedStateRegistryOwner() {
            r1 = this;
            u3.c r0 = r1.f21135s
            return r0
    }

    public final fg.a getUpdate() {
            r1 = this;
            fg.a r0 = r1.f21126j
            return r0
    }

    public final android.view.View getView() {
            r1 = this;
            android.view.View r0 = r1.f21124h
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ViewParent invalidateChildInParent(int[] r2, android.graphics.Rect r3) {
            r1 = this;
            super.invalidateChildInParent(r2, r3)
            boolean r2 = r1.E
            if (r2 == 0) goto L15
            b0.c r2 = new b0.c
            r3 = 4
            x2.g r0 = r1.f21141y
            r2.<init>(r0, r3)
            android.view.View r3 = r1.f21124h
            r3.postOnAnimation(r2)
            goto L1a
        L15:
            x1.f0 r2 = r1.F
            r2.B()
        L1a:
            r2 = 0
            return r2
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
            r1 = this;
            android.view.View r0 = r1.f21124h
            boolean r0 = r0.isNestedScrollingEnabled()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            x2.g r0 = r1.f21140x
            r0.invoke()
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(android.view.View r2, android.view.View r3) {
            r1 = this;
            super.onDescendantInvalidated(r2, r3)
            boolean r2 = r1.E
            if (r2 == 0) goto L15
            b0.c r2 = new b0.c
            r3 = 4
            x2.g r0 = r1.f21141y
            r2.<init>(r0, r3)
            android.view.View r3 = r1.f21124h
            r3.postOnAnimation(r2)
            return
        L15:
            x1.f0 r2 = r1.F
            r2.B()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r22 = this;
            r1 = r22
            super.onDetachedFromWindow()
            x1.t1 r0 = r1.getSnapshotObserver()
            w0.s r0 = r0.f21066a
            java.lang.Object r2 = r0.f14816g
            monitor-enter(r2)
            j0.b r0 = r0.f14815f     // Catch: java.lang.Throwable -> L96
            int r3 = r0.f6673i     // Catch: java.lang.Throwable -> L96
            r5 = 0
            r6 = 0
        L14:
            java.lang.Object[] r7 = r0.f6671g
            if (r5 >= r3) goto L9c
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L96
            w0.r r7 = (w0.r) r7     // Catch: java.lang.Throwable -> L96
            f.k0 r8 = r7.f14802f     // Catch: java.lang.Throwable -> L96
            java.lang.Object r8 = r8.k(r1)     // Catch: java.lang.Throwable -> L96
            f.b0 r8 = (f.b0) r8     // Catch: java.lang.Throwable -> L96
            if (r8 != 0) goto L29
        L26:
            r16 = r5
            goto L80
        L29:
            java.lang.Object[] r9 = r8.f2775b     // Catch: java.lang.Throwable -> L96
            int[] r10 = r8.f2776c     // Catch: java.lang.Throwable -> L96
            long[] r8 = r8.f2774a     // Catch: java.lang.Throwable -> L96
            int r11 = r8.length     // Catch: java.lang.Throwable -> L96
            int r11 = r11 + (-2)
            if (r11 < 0) goto L26
            r12 = 0
        L35:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> L96
            r16 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> L96
            r17 = 7
            long r4 = r4 << r17
            long r4 = r4 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r17
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L79
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> L96
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r15 = 0
        L54:
            if (r15 >= r4) goto L77
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r13 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L6e
            int r18 = r12 << 3
            int r18 = r18 + r15
            r19 = r5
            r5 = r9[r18]     // Catch: java.lang.Throwable -> L96
            r18 = r10[r18]     // Catch: java.lang.Throwable -> L96
            r7.c(r1, r5)     // Catch: java.lang.Throwable -> L96
            goto L70
        L6e:
            r19 = r5
        L70:
            long r13 = r13 >> r19
            int r15 = r15 + 1
            r5 = r19
            goto L54
        L77:
            if (r4 != r5) goto L80
        L79:
            if (r12 == r11) goto L80
            int r12 = r12 + 1
            r5 = r16
            goto L35
        L80:
            f.k0 r4 = r7.f14802f     // Catch: java.lang.Throwable -> L96
            boolean r4 = r4.j()     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto L8b
            int r6 = r6 + 1
            goto L98
        L8b:
            if (r6 <= 0) goto L98
            java.lang.Object[] r4 = r0.f6671g     // Catch: java.lang.Throwable -> L96
            int r5 = r16 - r6
            r7 = r4[r16]     // Catch: java.lang.Throwable -> L96
            r4[r5] = r7     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r0 = move-exception
            goto La6
        L98:
            int r5 = r16 + 1
            goto L14
        L9c:
            int r4 = r3 - r6
            r5 = 0
            java.util.Arrays.fill(r7, r4, r3, r5)     // Catch: java.lang.Throwable -> L96
            r0.f6673i = r4     // Catch: java.lang.Throwable -> L96
            monitor-exit(r2)
            return
        La6:
            monitor-exit(r2)
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r4 = r4 - r2
            int r5 = r5 - r3
            android.view.View r1 = r0.f21124h
            r2 = 0
            r1.layout(r2, r2, r4, r5)
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            android.view.View r0 = r3.f21124h
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == r3) goto L14
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            r3.setMeasuredDimension(r4, r5)
            return
        L14:
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 != r2) goto L21
            r4 = 0
            r3.setMeasuredDimension(r4, r4)
            return
        L21:
            r0.measure(r4, r5)
            int r1 = r0.getMeasuredWidth()
            int r0 = r0.getMeasuredHeight()
            r3.setMeasuredDimension(r1, r0)
            r3.B = r4
            r3.C = r5
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View r8, float r9, float r10, boolean r11) {
            r7 = this;
            android.view.View r8 = r7.f21124h
            boolean r8 = r8.isNestedScrollingEnabled()
            r0 = 0
            if (r8 != 0) goto La
            return r0
        La:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r9 = r9 * r8
            float r10 = r10 * r8
            long r4 = a.a.d(r9, r10)
            r1.d r8 = r7.f21123g
            qg.t r8 = r8.e()
            x2.e r1 = new x2.e
            r6 = 0
            r3 = r7
            r2 = r11
            r1.<init>(r2, r3, r4, r6)
            r9 = 3
            r10 = 0
            qg.v.q(r8, r10, r1, r9)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r8, float r9, float r10) {
            r7 = this;
            android.view.View r8 = r7.f21124h
            boolean r8 = r8.isNestedScrollingEnabled()
            r0 = 0
            if (r8 != 0) goto La
            return r0
        La:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r9 = r9 * r8
            float r10 = r10 * r8
            long r3 = a.a.d(r9, r10)
            r1.d r8 = r7.f21123g
            qg.t r8 = r8.e()
            h0.k0 r1 = new h0.k0
            r6 = 3
            r5 = 0
            r2 = r7
            r1.<init>(r2, r3, r5, r6)
            r9 = 3
            qg.v.q(r8, r5, r1, r9)
            return r0
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View r4, android.graphics.Rect r5, boolean r6) {
            r3 = this;
            fg.l r4 = r3.f21139w
            if (r4 == 0) goto L1c
            if (r5 == 0) goto L18
            e1.c r6 = new e1.c
            int r0 = r5.left
            float r0 = (float) r0
            int r1 = r5.top
            float r1 = (float) r1
            int r2 = r5.right
            float r2 = (float) r2
            int r5 = r5.bottom
            float r5 = (float) r5
            r6.<init>(r0, r1, r2, r5)
            goto L19
        L18:
            r6 = 0
        L19:
            r4.invoke(r6)
        L1c:
            r4 = 1
            return r4
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r3) {
            r2 = this;
            fg.l r0 = r2.f21142z
            if (r0 == 0) goto Lb
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.invoke(r1)
        Lb:
            super.requestDisallowInterceptTouchEvent(r3)
            return
    }

    public final void setDensity(u2.c r2) {
            r1 = this;
            u2.c r0 = r1.f21132p
            if (r2 == r0) goto Ld
            r1.f21132p = r2
            fg.l r0 = r1.f21133q
            if (r0 == 0) goto Ld
            r0.invoke(r2)
        Ld:
            return
    }

    public final void setLifecycleOwner(androidx.lifecycle.q r2) {
            r1 = this;
            androidx.lifecycle.q r0 = r1.f21134r
            if (r2 == r0) goto Lc
            r1.f21134r = r2
            r0 = 2131099773(0x7f06007d, float:1.7811909E38)
            r1.setTag(r0, r2)
        Lc:
            return
    }

    public final void setModifier(y0.o r2) {
            r1 = this;
            y0.o r0 = r1.f21130n
            if (r2 == r0) goto Ld
            r1.f21130n = r2
            fg.l r0 = r1.f21131o
            if (r0 == 0) goto Ld
            r0.invoke(r2)
        Ld:
            return
    }

    public final void setOnDensityChanged$ui(fg.l r1) {
            r0 = this;
            r0.f21133q = r1
            return
    }

    public final void setOnModifierChanged$ui(fg.l r1) {
            r0 = this;
            r0.f21131o = r1
            return
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(fg.l r1) {
            r0 = this;
            r0.f21142z = r1
            return
    }

    public final void setRelease(fg.a r1) {
            r0 = this;
            r0.f21129m = r1
            return
    }

    public final void setReset(fg.a r1) {
            r0 = this;
            r0.f21128l = r1
            return
    }

    public final void setSavedStateRegistryOwner(u3.c r2) {
            r1 = this;
            u3.c r0 = r1.f21135s
            if (r2 == r0) goto Lc
            r1.f21135s = r2
            r0 = 2131099776(0x7f060080, float:1.7811915E38)
            r1.setTag(r0, r2)
        Lc:
            return
    }

    public final void setUpdate(fg.a r1) {
            r0 = this;
            r0.f21126j = r1
            r1 = 1
            r0.f21127k = r1
            x2.g r1 = r0.f21140x
            r1.invoke()
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 1
            return r0
    }
}
