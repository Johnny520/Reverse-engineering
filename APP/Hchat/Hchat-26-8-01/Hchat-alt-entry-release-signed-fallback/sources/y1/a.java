package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends android.view.ViewGroup {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f21837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.os.IBinder f21838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y1.x2 f21839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i0.o f21840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y1.f1 f21841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public fg.a f21842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21845o;

    public a(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            r2.setClipChildren(r1)
            r2.setClipToPadding(r1)
            r3 = 1
            r2.setImportantForAccessibility(r3)
            y1.i2 r3 = new y1.i2
            r0 = 1
            r3.<init>(r2, r0)
            r2.addOnAttachStateChangeListener(r3)
            okio.a r0 = new okio.a
            r1 = 27
            r0.<init>(r1)
            k3.a r1 = a7.a.w(r2)
            java.util.ArrayList r1 = r1.f7140a
            r1.add(r0)
            y1.j2 r1 = new y1.j2
            r1.<init>(r2, r3, r0)
            r2.f21842l = r1
            return
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
            return
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
            return
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
            return
    }

    private final void setParentContext(i0.o r2) {
            r1 = this;
            i0.o r0 = r1.f21840j
            if (r0 == r2) goto L1d
            r1.f21840j = r2
            r0 = 0
            if (r2 == 0) goto Lb
            r1.f21837g = r0
        Lb:
            y1.x2 r2 = r1.f21839i
            if (r2 == 0) goto L1d
            r2.e()
            r1.f21839i = r0
            boolean r2 = r1.isAttachedToWindow()
            if (r2 == 0) goto L1d
            r1.g()
        L1d:
            return
    }

    private final void setPreviousAttachedWindowToken(android.os.IBinder r2) {
            r1 = this;
            android.os.IBinder r0 = r1.f21838h
            if (r0 == r2) goto L9
            r1.f21838h = r2
            r2 = 0
            r1.f21837g = r2
        L9:
            return
    }

    public abstract void a(i0.h0 r1, int r2);

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1) {
            r0 = this;
            r0.d()
            super.addView(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1, int r2) {
            r0 = this;
            r0.d()
            super.addView(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1, int r2, int r3) {
            r0 = this;
            r0.d()
            super.addView(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            r0.d()
            super.addView(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.d()
            super.addView(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            r0.d()
            boolean r1 = super.addViewInLayout(r1, r2, r3)
            return r1
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3, boolean r4) {
            r0 = this;
            r0.d()
            boolean r1 = super.addViewInLayout(r1, r2, r3, r4)
            return r1
    }

    public final void b() {
            r3 = this;
            boolean r0 = r3.isAttachedToWindow()
            if (r0 != 0) goto L7
            goto L40
        L7:
            android.os.IBinder r0 = r3.getWindowToken()
            r3.setPreviousAttachedWindowToken(r0)
            y1.f1 r0 = r3.f21841k
            if (r0 != 0) goto L37
            int r0 = r3.getChildCount()
            r1 = 0
            if (r0 != 0) goto L1a
            goto L26
        L1a:
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r2 = r0 instanceof y1.t
            if (r2 == 0) goto L26
            r1 = r0
            y1.t r1 = (y1.t) r1
        L26:
            if (r1 == 0) goto L37
            y1.f1 r0 = r1.getComposeViewContext()
            android.view.View r2 = y1.g0.i(r3)
            y1.f1 r0 = r3.l(r2, r0)
            r1.setComposeViewContext(r0)
        L37:
            boolean r0 = r3.getShouldCreateCompositionOnAttachedToWindow()
            if (r0 == 0) goto L40
            r3.g()
        L40:
            return
    }

    public final void d() {
            r4 = this;
            boolean r0 = r4.f21844n
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot add views to "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "; only Compose content is supported"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void e() {
            r2 = this;
            i0.o r0 = r2.f21840j
            if (r0 != 0) goto L20
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L20
            y1.f1 r0 = r2.f21841k
            if (r0 == 0) goto L1a
            android.view.View r0 = r0.f21888a
            if (r0 == 0) goto L1a
            boolean r0 = r0.isAttachedToWindow()
            r1 = 1
            if (r0 != r1) goto L1a
            goto L20
        L1a:
            java.lang.String r0 = "createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference."
            j8.o.A(r0)
            return
        L20:
            r2.g()
            return
    }

    public final void f() {
            r4 = this;
            r0 = 0
            android.view.View r1 = r4.getChildAt(r0)
            boolean r2 = r1 instanceof y1.t
            r3 = 0
            if (r2 == 0) goto Ld
            y1.t r1 = (y1.t) r1
            goto Le
        Ld:
            r1 = r3
        Le:
            if (r1 == 0) goto L1d
            boolean r2 = r1.P0
            if (r2 == 0) goto L1d
            y1.f1 r2 = r1.getComposeViewContext()
            r2.b()
            r1.P0 = r0
        L1d:
            y1.x2 r0 = r4.f21839i
            if (r0 == 0) goto L24
            r0.e()
        L24:
            r4.f21839i = r3
            r4.requestLayout()
            return
    }

    public final void g() {
            r6 = this;
            y1.x2 r0 = r6.f21839i
            if (r0 != 0) goto L3b
            r0 = 0
            r1 = 1
            r6.f21844n = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "Compose:initializeView"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L32
            y1.f1 r2 = r6.f21841k     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            y1.f1 r2 = r6.j()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L34
        L18:
            a1.h r3 = new a1.h     // Catch: java.lang.Throwable -> L16
            r4 = 3
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L16
            s0.d r4 = new s0.d     // Catch: java.lang.Throwable -> L16
            r5 = 1003123809(0x3bca7461, float:0.006178424)
            r4.<init>(r5, r3, r1)     // Catch: java.lang.Throwable -> L16
            y1.x2 r1 = y1.z2.a(r6, r2, r4)     // Catch: java.lang.Throwable -> L16
            r6.f21839i = r1     // Catch: java.lang.Throwable -> L16
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L32
            r6.f21844n = r0
            return
        L32:
            r1 = move-exception
            goto L38
        L34:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L32
            throw r1     // Catch: java.lang.Throwable -> L32
        L38:
            r6.f21844n = r0
            throw r1
        L3b:
            return
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m175getAutoClearFocusBehavior4UtRPd4() {
            r2 = this;
            r0 = 2131099694(0x7f06002e, float:1.7811748E38)
            java.lang.Object r0 = r2.getTag(r0)
            boolean r1 = r0 instanceof y1.u0
            if (r1 == 0) goto Le
            y1.u0 r0 = (y1.u0) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L14
            int r0 = r0.f22126a
            return r0
        L14:
            r0 = 1
            return r0
    }

    public final y1.f1 getComposeViewContext$ui() {
            r1 = this;
            y1.f1 r0 = r1.f21841k
            return r0
    }

    public final boolean getHasComposition() {
            r1 = this;
            y1.x2 r0 = r1.f21839i
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final boolean getShowLayoutBounds() {
            r1 = this;
            boolean r0 = r1.f21843m
            return r0
    }

    public void h(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            r3 = 0
            android.view.View r3 = r2.getChildAt(r3)
            if (r3 == 0) goto L1e
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingTop()
            int r6 = r6 - r4
            int r4 = r2.getPaddingRight()
            int r6 = r6 - r4
            int r7 = r7 - r5
            int r4 = r2.getPaddingBottom()
            int r7 = r7 - r4
            r3.layout(r0, r1, r6, r7)
        L1e:
            return
    }

    public void i(int r6, int r7) {
            r5 = this;
            r0 = 0
            android.view.View r1 = r5.getChildAt(r0)
            if (r1 != 0) goto Lb
            super.onMeasure(r6, r7)
            return
        Lb:
            int r2 = android.view.View.MeasureSpec.getSize(r6)
            int r3 = r5.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r5.getPaddingRight()
            int r2 = r2 - r3
            int r2 = java.lang.Math.max(r0, r2)
            int r3 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r0 = java.lang.Math.max(r0, r3)
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r6)
            int r7 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
            r1.measure(r6, r7)
            int r6 = r1.getMeasuredWidth()
            int r7 = r5.getPaddingLeft()
            int r7 = r7 + r6
            int r6 = r5.getPaddingRight()
            int r6 = r6 + r7
            int r7 = r1.getMeasuredHeight()
            int r0 = r5.getPaddingTop()
            int r0 = r0 + r7
            int r7 = r5.getPaddingBottom()
            int r7 = r7 + r0
            r5.setMeasuredDimension(r6, r7)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
            r1 = this;
            boolean r0 = r1.f21845o
            if (r0 == 0) goto Ld
            boolean r0 = super.isTransitionGroup()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public final y1.f1 j() {
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L1c
        L9:
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof y1.t
            if (r2 == 0) goto L15
            y1.t r0 = (y1.t) r0
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L7
            y1.f1 r0 = r0.getComposeViewContext()
        L1c:
            android.view.View r4 = y1.g0.i(r9)
            y1.f1 r2 = y1.g0.j(r4)
            if (r2 != 0) goto L7c
            i0.o r5 = r9.k()
            androidx.lifecycle.q r2 = androidx.lifecycle.d0.a(r4)
            if (r2 != 0) goto L38
            if (r0 == 0) goto L35
            androidx.lifecycle.q r2 = r0.f21890c
            goto L36
        L35:
            r2 = r1
        L36:
            if (r2 == 0) goto L3a
        L38:
            r6 = r2
            goto L40
        L3a:
            java.lang.String r0 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            j8.o.A(r0)
            return r1
        L40:
            u3.c r2 = ac.p.t(r4)
            if (r2 != 0) goto L4e
            if (r0 == 0) goto L4b
            u3.c r2 = r0.f21891d
            goto L4c
        L4b:
            r2 = r1
        L4c:
            if (r2 == 0) goto L50
        L4e:
            r7 = r2
            goto L56
        L50:
            java.lang.String r0 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            j8.o.A(r0)
            return r1
        L56:
            c9.a1 r2 = androidx.lifecycle.d0.b(r4)
            if (r2 != 0) goto L62
            if (r0 == 0) goto L60
            c9.a1 r1 = r0.f21892e
        L60:
            r8 = r1
            goto L63
        L62:
            r8 = r2
        L63:
            y1.f1 r2 = new y1.f1
            android.view.View r0 = y1.g0.i(r4)
            y1.f1 r3 = y1.g0.j(r0)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1 = 2131099690(0x7f06002a, float:1.781174E38)
            r4.setTag(r1, r0)
            return r2
        L7c:
            y1.f1 r0 = r9.l(r4, r2)
            return r0
    }

    public final i0.o k() {
            r11 = this;
            i0.o r0 = r11.f21840j
            if (r0 != 0) goto L1f9
            i0.o r0 = y1.v2.a(r11)
            if (r0 == 0) goto Lb
            goto L20
        Lb:
            android.view.ViewParent r1 = r11.getParent()
        Lf:
            if (r0 != 0) goto L20
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L20
            android.view.View r1 = (android.view.View) r1
            i0.o r0 = y1.v2.a(r1)
            android.view.ViewParent r1 = fb.v0.t(r1)
            goto Lf
        L20:
            r1 = 0
            if (r0 == 0) goto L48
            boolean r2 = r0 instanceof i0.y1
            if (r2 == 0) goto L3d
            r2 = r0
            i0.y1 r2 = (i0.y1) r2
            tg.b0 r2 = r2.f6116u
            java.lang.Object r2 = r2.getValue()
            i0.u1 r2 = (i0.u1) r2
            i0.u1 r3 = i0.u1.f6051h
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L3b
            goto L3d
        L3b:
            r2 = r1
            goto L3e
        L3d:
            r2 = r0
        L3e:
            if (r2 == 0) goto L49
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r11.f21837g = r3
            goto L49
        L48:
            r0 = r1
        L49:
            if (r0 != 0) goto L1f9
            java.lang.ref.WeakReference r0 = r11.f21837g
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.get()
            i0.o r0 = (i0.o) r0
            if (r0 == 0) goto L6f
            boolean r2 = r0 instanceof i0.y1
            if (r2 == 0) goto L70
            r2 = r0
            i0.y1 r2 = (i0.y1) r2
            tg.b0 r2 = r2.f6116u
            java.lang.Object r2 = r2.getValue()
            i0.u1 r2 = (i0.u1) r2
            i0.u1 r3 = i0.u1.f6051h
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L6f
            goto L70
        L6f:
            r0 = r1
        L70:
            if (r0 != 0) goto L1f9
            boolean r0 = r11.isAttachedToWindow()
            if (r0 != 0) goto L8e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot locate windowRecomposer; View "
            r0.<init>(r2)
            r0.append(r11)
            java.lang.String r2 = " is not attached to a window"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            u1.a.b(r0)
        L8e:
            android.view.ViewParent r0 = fb.v0.t(r11)
            r2 = r11
        L93:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto Lab
            android.view.View r0 = (android.view.View) r0
            int r3 = r0.getId()
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            if (r3 != r4) goto La3
            goto Lab
        La3:
            android.view.ViewParent r2 = r0.getParent()
            r10 = r2
            r2 = r0
            r0 = r10
            goto L93
        Lab:
            i0.o r0 = y1.v2.a(r2)
            if (r0 != 0) goto L1d1
            java.util.concurrent.atomic.AtomicReference r0 = y1.r2.f22063a
            java.lang.Object r0 = r0.get()
            y1.q2 r0 = (y1.q2) r0
            r0.getClass()
            wf.h r0 = wf.h.f20786g
            sf.i r3 = y1.n0.f22004s
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            if (r3 != r4) goto Ld3
            sf.i r3 = y1.n0.f22004s
            java.lang.Object r3 = r3.getValue()
            wf.g r3 = (wf.g) r3
            goto Ldd
        Ld3:
            d6.m r3 = y1.n0.f22005t
            java.lang.Object r3 = r3.get()
            wf.g r3 = (wf.g) r3
            if (r3 == 0) goto L1cb
        Ldd:
            wf.g r3 = r3.e(r0)
            i0.e r4 = i0.e.f5866i
            wf.e r4 = r3.s(r4)
            i0.d r4 = (i0.d) r4
            r5 = 0
            if (r4 == 0) goto Lff
            i0.d r6 = new i0.d
            r6.<init>(r4)
            java.lang.Object r4 = r6.f5861i
            j8.f r4 = (j8.f) r4
            java.lang.Object r7 = r4.f6781b
            monitor-enter(r7)
            r4.f6780a = r5     // Catch: java.lang.Throwable -> Lfc
            monitor-exit(r7)
            goto L100
        Lfc:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        Lff:
            r6 = r1
        L100:
            gg.u r4 = new gg.u
            r4.<init>()
            y0.b r7 = y0.b.f21807v
            wf.e r7 = r3.s(r7)
            y0.p r7 = (y0.p) r7
            if (r7 != 0) goto L11e
            y1.z1 r7 = new y1.z1
            android.content.Context r8 = r2.getContext()
            android.content.Context r8 = r8.getApplicationContext()
            r7.<init>(r8)
            r4.f4564g = r7
        L11e:
            if (r6 == 0) goto L121
            r0 = r6
        L121:
            wf.g r0 = r3.e(r0)
            wf.g r0 = r0.e(r7)
            i0.y1 r3 = new i0.y1
            r3.<init>(r0)
            java.lang.Object r7 = r3.f6098c
            monitor-enter(r7)
            r8 = 1
            r3.f6115t = r8     // Catch: java.lang.Throwable -> L1c8
            monitor-exit(r7)
            vg.c r0 = qg.v.a(r0)
            androidx.lifecycle.q r7 = androidx.lifecycle.d0.a(r2)
            if (r7 == 0) goto L144
            androidx.lifecycle.s r7 = r7.f()
            goto L145
        L144:
            r7 = r1
        L145:
            if (r7 == 0) goto L1b3
            y1.s2 r9 = new y1.s2
            r9.<init>(r2, r3)
            r2.addOnAttachStateChangeListener(r9)
            b.d r9 = new b.d
            r9.<init>(r0, r6, r3, r4)
            r7.a(r9)
            r0 = 2131099691(0x7f06002b, float:1.7811742E38)
            r2.setTag(r0, r3)
            android.os.Handler r0 = r2.getHandler()
            java.lang.String r4 = "windowRecomposer cleanup"
            int r6 = rg.g.f11963a
            rg.e r6 = new rg.e
            r6.<init>(r0, r4, r5)
            rg.e r0 = r6.f11960l
            ci.j r4 = new ci.j
            r5 = 28
            r4.<init>(r3, r2, r1, r5)
            qg.u r5 = qg.u.f11099j
            r6 = 2
            r6 = r6 & r8
            if (r6 == 0) goto L17b
            wf.h r0 = wf.h.f20786g
        L17b:
            r6 = 2
            r7 = r6 & r6
            if (r7 == 0) goto L182
            qg.u r5 = qg.u.f11096g
        L182:
            wf.h r7 = wf.h.f20786g
            wf.g r0 = qg.v.h(r7, r0, r8)
            xg.e r7 = qg.c0.f11038a
            if (r0 == r7) goto L198
            wf.d r9 = wf.d.f20785g
            wf.e r9 = r0.s(r9)
            if (r9 != 0) goto L198
            wf.g r0 = r0.e(r7)
        L198:
            qg.u r7 = qg.u.f11097h
            if (r5 != r7) goto L1a2
            qg.z0 r7 = new qg.z0
            r7.<init>(r0, r4)
            goto L1a7
        L1a2:
            qg.e1 r7 = new qg.e1
            r7.<init>(r0, r8)
        L1a7:
            r7.c0(r5, r7, r4)
            f1.e r0 = new f1.e
            r0.<init>(r7, r6)
            r2.addOnAttachStateChangeListener(r0)
            goto L1d8
        L1b3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "ViewTreeLifecycleOwner not found from "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            u1.a.c(r0)
            okio.a.c()
            return r1
        L1c8:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L1cb:
            java.lang.String r0 = "no AndroidUiDispatcher for this thread"
            j8.o.A(r0)
            return r1
        L1d1:
            boolean r2 = r0 instanceof i0.y1
            if (r2 == 0) goto L1f3
            r3 = r0
            i0.y1 r3 = (i0.y1) r3
        L1d8:
            tg.b0 r0 = r3.f6116u
            java.lang.Object r0 = r0.getValue()
            i0.u1 r0 = (i0.u1) r0
            i0.u1 r2 = i0.u1.f6051h
            int r0 = r0.compareTo(r2)
            if (r0 <= 0) goto L1e9
            r1 = r3
        L1e9:
            if (r1 == 0) goto L1f2
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r11.f21837g = r0
        L1f2:
            return r3
        L1f3:
            java.lang.String r0 = "root viewTreeParentCompositionContext is not a Recomposer"
            j8.o.A(r0)
            return r1
        L1f9:
            return r0
    }

    public final y1.f1 l(android.view.View r9, y1.f1 r10) {
            r8 = this;
            i0.o r3 = r8.k()
            androidx.lifecycle.q r0 = androidx.lifecycle.d0.a(r9)
            c9.a1 r6 = androidx.lifecycle.d0.b(r9)
            u3.c r1 = ac.p.t(r9)
            i0.o r2 = r10.f21889b
            u3.c r4 = r10.f21891d
            androidx.lifecycle.q r5 = r10.f21890c
            if (r3 != r2) goto L21
            if (r0 != r5) goto L21
            c9.a1 r2 = r10.f21892e
            if (r6 != r2) goto L21
            if (r1 != r4) goto L21
            return r10
        L21:
            wf.g r2 = r3.j()
            i0.o r7 = r10.f21889b
            wf.g r7 = r7.j()
            if (r2 == r7) goto L30
            r8.f()
        L30:
            if (r0 != 0) goto L33
            r0 = r5
        L33:
            if (r1 != 0) goto L38
            r5 = r4
        L36:
            r4 = r0
            goto L3a
        L38:
            r5 = r1
            goto L36
        L3a:
            y1.f1 r0 = new y1.f1
            r2 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r0)
            r10 = 2131099690(0x7f06002a, float:1.781174E38)
            r2.setTag(r10, r9)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r5 = this;
            super.onAttachedToWindow()
            f.k0 r0 = y1.v2.f22138a
            android.view.ViewParent r0 = fb.v0.t(r5)
            r1 = r5
        La:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L22
            android.view.View r0 = (android.view.View) r0
            int r2 = r0.getId()
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            if (r2 != r3) goto L1a
            goto L22
        L1a:
            android.view.ViewParent r1 = r0.getParent()
            r4 = r1
            r1 = r0
            r0 = r4
            goto La
        L22:
            android.view.ViewParent r0 = r1.getParent()
            if (r0 != 0) goto L36
            android.os.Handler r0 = r5.getHandler()
            wb.cr r1 = new wb.cr
            r2 = 6
            r1.<init>(r5, r2)
            r0.postAtFrontOfQueue(r1)
            return
        L36:
            r5.b()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.h(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r0.g()
            r0.i(r1, r2)
            return
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r2) {
            r1 = this;
            r0 = 0
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto La
            r0.setLayoutDirection(r2)
        La:
            return
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m176setAutoClearFocusBehavior17tfJxM(int r2) {
            r1 = this;
            y1.u0 r0 = new y1.u0
            r0.<init>(r2)
            r2 = 2131099694(0x7f06002e, float:1.7811748E38)
            r1.setTag(r2, r0)
            return
    }

    public final void setComposeViewContext$ui(y1.f1 r4) {
            r3 = this;
            y1.f1 r0 = r3.f21841k
            if (r0 == r4) goto L33
            if (r4 != 0) goto La
            r3.f()
            goto L31
        La:
            int r0 = r3.getChildCount()
            if (r0 == 0) goto L31
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r1 = r0 instanceof y1.t
            if (r1 == 0) goto L1c
            y1.t r0 = (y1.t) r0
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L31
            wf.g r1 = r0.getCoroutineContext()
            i0.o r2 = r4.f21889b
            wf.g r2 = r2.j()
            if (r1 == r2) goto L2e
            r3.f()
        L2e:
            r0.setComposeViewContext(r4)
        L31:
            r3.f21841k = r4
        L33:
            return
    }

    public final void setParentCompositionContext(i0.o r1) {
            r0 = this;
            r0.setParentContext(r1)
            return
    }

    public final void setShowLayoutBounds(boolean r2) {
            r1 = this;
            r1.f21843m = r2
            r0 = 0
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L10
            x1.r1 r0 = (x1.r1) r0
            y1.t r0 = (y1.t) r0
            r0.setShowLayoutBounds(r2)
        L10:
            return
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean r1) {
            r0 = this;
            super.setTransitionGroup(r1)
            r1 = 1
            r0.f21845o = r1
            return
    }

    public final void setViewCompositionStrategy(y1.k2 r2) {
            r1 = this;
            fg.a r0 = r1.f21842l
            if (r0 == 0) goto L7
            r0.invoke()
        L7:
            fg.a r2 = r2.a(r1)
            r1.f21842l = r2
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
