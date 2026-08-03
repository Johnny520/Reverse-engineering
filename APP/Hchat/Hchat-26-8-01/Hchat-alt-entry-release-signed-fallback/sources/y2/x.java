package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends y1.a {
    public final i0.j1 A;
    public u2.k B;
    public final i0.x C;
    public final android.graphics.Rect D;
    public final w0.s E;
    public b.b F;
    public final i0.j1 G;
    public boolean H;
    public final int[] I;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public fg.a f22274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y2.c0 f22275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.lang.String f22276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final android.view.View f22277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f22278t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final y2.a0 f22279u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final android.view.WindowManager f22280v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final android.view.WindowManager.LayoutParams f22281w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y2.b0 f22282x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public u2.m f22283y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i0.j1 f22284z;

    public x(fg.a r3, y2.c0 r4, java.lang.String r5, android.view.View r6, u2.c r7, y2.b0 r8, java.util.UUID r9, boolean r10) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lc
            y2.z r0 = new y2.z
            r0.<init>()
            goto L1b
        Lc:
            r1 = 29
            if (r0 < r1) goto L16
            y2.y r0 = new y2.y
            r0.<init>()
            goto L1b
        L16:
            y2.a0 r0 = new y2.a0
            r0.<init>()
        L1b:
            android.content.Context r1 = r6.getContext()
            r2.<init>(r1)
            r2.f22274p = r3
            r2.f22275q = r4
            r2.f22276r = r5
            r2.f22277s = r6
            r2.f22278t = r10
            r2.f22279u = r0
            android.content.Context r3 = r6.getContext()
            java.lang.String r4 = "window"
            java.lang.Object r3 = r3.getSystemService(r4)
            r3.getClass()
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            r2.f22280v = r3
            android.view.WindowManager$LayoutParams r3 = new android.view.WindowManager$LayoutParams
            r3.<init>()
            r4 = 8388659(0x800033, float:1.1755015E-38)
            r3.gravity = r4
            y2.c0 r4 = r2.f22275q
            boolean r5 = y2.m.b(r6)
            boolean r10 = r4.f22202b
            int r4 = r4.f22201a
            if (r10 == 0) goto L5a
            if (r5 == 0) goto L5a
            r4 = r4 | 8192(0x2000, float:1.148E-41)
            goto L60
        L5a:
            if (r10 == 0) goto L60
            if (r5 != 0) goto L60
            r4 = r4 & (-8193(0xffffffffffffdfff, float:NaN))
        L60:
            r3.flags = r4
            y2.c0 r4 = r2.f22275q
            int r4 = r4.f22206f
            r3.type = r4
            android.os.IBinder r4 = r6.getApplicationWindowToken()
            r3.token = r4
            r4 = -2
            r3.width = r4
            r3.height = r4
            r4 = -3
            r3.format = r4
            android.content.Context r4 = r6.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131296270(0x7f09000e, float:1.8210452E38)
            java.lang.String r4 = r4.getString(r5)
            r3.setTitle(r4)
            r2.f22281w = r3
            r2.f22282x = r8
            u2.m r3 = u2.m.f13354g
            r2.f22283y = r3
            r3 = 0
            i0.j1 r4 = i0.r.u(r3)
            r2.f22284z = r4
            i0.j1 r3 = i0.r.u(r3)
            r2.A = r3
            d1.c0 r3 = new d1.c0
            r4 = 22
            r3.<init>(r2, r4)
            i0.x r3 = i0.r.p(r3)
            r2.C = r3
            r3 = 8
            float r3 = (float) r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r2.D = r4
            w0.s r4 = new w0.s
            y2.j r5 = new y2.j
            r8 = 2
            r5.<init>(r2, r8)
            r4.<init>(r5)
            r2.E = r4
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            r2.setId(r4)
            androidx.lifecycle.q r4 = androidx.lifecycle.d0.a(r6)
            r5 = 2131099773(0x7f06007d, float:1.7811909E38)
            r2.setTag(r5, r4)
            c9.a1 r4 = androidx.lifecycle.d0.b(r6)
            r5 = 2131099777(0x7f060081, float:1.7811917E38)
            r2.setTag(r5, r4)
            u3.c r4 = ac.p.t(r6)
            r5 = 2131099776(0x7f060080, float:1.7811915E38)
            r2.setTag(r5, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Popup:"
            r4.<init>(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r5 = 2131099699(0x7f060033, float:1.7811759E38)
            r2.setTag(r5, r4)
            r4 = 0
            r2.setClipChildren(r4)
            float r3 = r7.x0(r3)
            r2.setElevation(r3)
            i1.l r3 = new i1.l
            r4 = 3
            r3.<init>(r4)
            r2.setOutlineProvider(r3)
            s0.d r3 = y2.s.f22251a
            i0.j1 r3 = i0.r.u(r3)
            r2.G = r3
            int[] r3 = new int[r8]
            r2.I = r3
            return
    }

    private final fg.p getContent() {
            r1 = this;
            i0.j1 r0 = r1.G
            java.lang.Object r0 = r0.getValue()
            fg.p r0 = (fg.p) r0
            return r0
    }

    private final u2.k getDisplayBounds() {
            r5 = this;
            y2.c0 r0 = r5.f22275q
            int r0 = r0.f22201a
            r0 = r0 & 512(0x200, float:7.17E-43)
            android.view.View r1 = r5.f22277s
            android.graphics.Rect r2 = r5.D
            y2.a0 r3 = r5.f22279u
            if (r0 != 0) goto L15
            r3.getClass()
            r1.getWindowVisibleDisplayFrame(r2)
            goto L18
        L15:
            r3.a(r1, r2)
        L18:
            u2.k r0 = new u2.k
            int r1 = r2.left
            int r3 = r2.top
            int r4 = r2.right
            int r2 = r2.bottom
            r0.<init>(r1, r3, r4, r2)
            return r0
    }

    public static /* synthetic */ void getParams$ui$annotations() {
            return
    }

    private final v1.t getParentLayoutCoordinates() {
            r1 = this;
            i0.j1 r0 = r1.A
            java.lang.Object r0 = r0.getValue()
            v1.t r0 = (v1.t) r0
            return r0
    }

    public static final /* synthetic */ v1.t m(y2.x r0) {
            v1.t r0 = r0.getParentLayoutCoordinates()
            return r0
    }

    private final void setContent(fg.p r2) {
            r1 = this;
            i0.j1 r0 = r1.G
            r0.setValue(r2)
            return
    }

    private final void setParentLayoutCoordinates(v1.t r2) {
            r1 = this;
            i0.j1 r0 = r1.A
            r0.setValue(r2)
            return
    }

    @Override // y1.a
    public final void a(i0.h0 r6, int r7) {
            r5 = this;
            r0 = -857613600(0xffffffffcce1dae0, float:-1.1841306E8)
            r6.b0(r0)
            boolean r0 = r6.h(r5)
            r1 = 2
            if (r0 == 0) goto Lf
            r0 = 4
            goto L10
        Lf:
            r0 = r1
        L10:
            r0 = r0 | r7
            r2 = r0 & 3
            r3 = 0
            r4 = 1
            if (r2 == r1) goto L19
            r1 = r4
            goto L1a
        L19:
            r1 = r3
        L1a:
            r0 = r0 & r4
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L2d
            fg.p r0 = r5.getContent()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.invoke(r6, r1)
            goto L30
        L2d:
            r6.V()
        L30:
            i0.r1 r6 = r6.t()
            if (r6 == 0) goto L3e
            a1.h r0 = new a1.h
            r1 = 7
            r0.<init>(r5, r7, r1)
            r6.f6035d = r0
        L3e:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            y2.c0 r0 = r3.f22275q
            boolean r0 = r0.f22203c
            if (r0 != 0) goto Lb
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
        Lb:
            int r0 = r4.getKeyCode()
            r1 = 4
            if (r0 == r1) goto L1a
            int r0 = r4.getKeyCode()
            r1 = 111(0x6f, float:1.56E-43)
            if (r0 != r1) goto L50
        L1a:
            android.view.KeyEvent$DispatcherState r0 = r3.getKeyDispatcherState()
            if (r0 != 0) goto L25
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
        L25:
            int r1 = r4.getAction()
            r2 = 1
            if (r1 != 0) goto L36
            int r1 = r4.getRepeatCount()
            if (r1 != 0) goto L36
            r0.startTracking(r4, r3)
            return r2
        L36:
            int r1 = r4.getAction()
            if (r1 != r2) goto L50
            boolean r0 = r0.isTracking(r4)
            if (r0 == 0) goto L50
            boolean r0 = r4.isCanceled()
            if (r0 != 0) goto L50
            fg.a r4 = r3.f22274p
            if (r4 == 0) goto L4f
            r4.invoke()
        L4f:
            return r2
        L50:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    public final boolean getCanCalculatePosition() {
            r1 = this;
            i0.x r0 = r1.C
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final android.view.WindowManager.LayoutParams getParams$ui() {
            r1 = this;
            android.view.WindowManager$LayoutParams r0 = r1.f22281w
            return r0
    }

    public final u2.m getParentLayoutDirection() {
            r1 = this;
            u2.m r0 = r1.f22283y
            return r0
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final u2.l m186getPopupContentSizebOM6tXw() {
            r1 = this;
            i0.j1 r0 = r1.f22284z
            java.lang.Object r0 = r0.getValue()
            u2.l r0 = (u2.l) r0
            return r0
    }

    public final y2.b0 getPositionProvider() {
            r1 = this;
            y2.b0 r0 = r1.f22282x
            return r0
    }

    @Override // y1.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
            r1 = this;
            boolean r0 = r1.H
            return r0
    }

    public y1.a getSubCompositionView() {
            r0 = this;
            return r0
    }

    public final java.lang.String getTestTag() {
            r1 = this;
            java.lang.String r0 = r1.f22276r
            return r0
    }

    public /* bridge */ /* synthetic */ android.view.View getViewRoot() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // y1.a
    public final void h(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.h(r1, r2, r3, r4, r5)
            r1 = r0
            y2.c0 r2 = r1.f22275q
            r2.getClass()
            r2 = 0
            android.view.View r2 = r0.getChildAt(r2)
            if (r2 != 0) goto L11
            return
        L11:
            int r3 = r2.getMeasuredWidth()
            android.view.WindowManager$LayoutParams r4 = r1.f22281w
            r4.width = r3
            int r2 = r2.getMeasuredHeight()
            r4.height = r2
            y2.a0 r2 = r1.f22279u
            r2.getClass()
            android.view.WindowManager r2 = r1.f22280v
            r2.updateViewLayout(r0, r4)
            return
    }

    @Override // y1.a
    public final void i(int r2, int r3) {
            r1 = this;
            y2.c0 r2 = r1.f22275q
            r2.getClass()
            u2.k r2 = r1.getDisplayBounds()
            int r3 = r2.f13351c
            int r0 = r2.f13349a
            int r3 = r3 - r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            int r2 = r2.a()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            super.i(r3, r2)
            return
    }

    public final void n(i0.o r1, fg.p r2) {
            r0 = this;
            r0.setParentCompositionContext(r1)
            r0.setContent(r2)
            r1 = 1
            r0.H = r1
            return
    }

    public final void o(fg.a r1, y2.c0 r2, java.lang.String r3, u2.m r4) {
            r0 = this;
            r0.f22274p = r1
            r0.f22276r = r3
            y2.c0 r1 = r0.f22275q
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto Ld
            goto L37
        Ld:
            r2.getClass()
            r0.f22275q = r2
            android.view.View r1 = r0.f22277s
            boolean r1 = y2.m.b(r1)
            boolean r3 = r2.f22202b
            int r2 = r2.f22201a
            if (r3 == 0) goto L23
            if (r1 == 0) goto L23
            r2 = r2 | 8192(0x2000, float:1.148E-41)
            goto L29
        L23:
            if (r3 == 0) goto L29
            if (r1 != 0) goto L29
            r2 = r2 & (-8193(0xffffffffffffdfff, float:NaN))
        L29:
            android.view.WindowManager$LayoutParams r1 = r0.f22281w
            r1.flags = r2
            y2.a0 r2 = r0.f22279u
            r2.getClass()
            android.view.WindowManager r2 = r0.f22280v
            r2.updateViewLayout(r0, r1)
        L37:
            int r1 = r4.ordinal()
            if (r1 == 0) goto L45
            r2 = 1
            if (r1 != r2) goto L41
            goto L46
        L41:
            okio.a.k()
            return
        L45:
            r2 = 0
        L46:
            super.setLayoutDirection(r2)
            return
    }

    @Override // y1.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            w0.s r0 = r3.E
            r0.d()
            y2.c0 r0 = r3.f22275q
            boolean r0 = r0.f22203c
            if (r0 == 0) goto L28
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L15
            goto L28
        L15:
            b.b r0 = r3.F
            if (r0 != 0) goto L23
            fg.a r0 = r3.f22274p
            b.b r1 = new b.b
            r2 = 1
            r1.<init>(r0, r2)
            r3.F = r1
        L23:
            b.b r0 = r3.F
            ai.c.d(r3, r0)
        L28:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            w0.s r0 = r2.E
            q9.a r1 = r0.f14817h
            if (r1 == 0) goto Lc
            r1.e()
        Lc:
            r0.a()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1a
            b.b r0 = r2.F
            ai.c.e(r2, r0)
        L1a:
            r0 = 0
            r2.F = r0
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            y2.c0 r0 = r4.f22275q
            boolean r0 = r0.f22204d
            if (r0 != 0) goto Lb
            boolean r5 = super.onTouchEvent(r5)
            return r5
        Lb:
            r0 = 1
            if (r5 == 0) goto L47
            int r1 = r5.getAction()
            if (r1 != 0) goto L47
            float r1 = r5.getX()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L3f
            float r1 = r5.getX()
            int r3 = r4.getWidth()
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3f
            float r1 = r5.getY()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L3f
            float r1 = r5.getY()
            int r2 = r4.getHeight()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L47
        L3f:
            fg.a r5 = r4.f22274p
            if (r5 == 0) goto L57
            r5.invoke()
            return r0
        L47:
            if (r5 == 0) goto L58
            int r1 = r5.getAction()
            r2 = 4
            if (r1 != r2) goto L58
            fg.a r5 = r4.f22274p
            if (r5 == 0) goto L57
            r5.invoke()
        L57:
            return r0
        L58:
            boolean r5 = super.onTouchEvent(r5)
            return r5
    }

    public final void p() {
            r11 = this;
            v1.t r0 = r11.getParentLayoutCoordinates()
            if (r0 == 0) goto L64
            boolean r1 = r0.C()
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L11
            goto L64
        L11:
            long r1 = r0.F()
            boolean r3 = r11.f22278t
            r4 = 0
            if (r3 == 0) goto L20
            long r3 = r0.P(r4)
            goto L24
        L20:
            long r3 = r0.m(r4)
        L24:
            r0 = 32
            long r5 = r3 >> r0
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r5 = java.lang.Math.round(r5)
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            int r3 = java.lang.Math.round(r3)
            long r4 = (long) r5
            long r4 = r4 << r0
            long r8 = (long) r3
            long r8 = r8 & r6
            long r3 = r4 | r8
            u2.k r5 = new u2.k
            long r8 = r3 >> r0
            int r8 = (int) r8
            long r3 = r3 & r6
            int r3 = (int) r3
            long r9 = r1 >> r0
            int r0 = (int) r9
            int r0 = r0 + r8
            long r1 = r1 & r6
            int r1 = (int) r1
            int r1 = r1 + r3
            r5.<init>(r8, r3, r0, r1)
            u2.k r0 = r11.B
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            r11.B = r5
            r11.r()
        L64:
            return
    }

    public final void q(v1.t r1) {
            r0 = this;
            r0.setParentLayoutCoordinates(r1)
            r0.p()
            return
    }

    public final void r() {
            r13 = this;
            u2.k r3 = r13.B
            if (r3 != 0) goto L6
        L4:
            r2 = r13
            goto L63
        L6:
            u2.l r0 = r13.m186getPopupContentSizebOM6tXw()
            if (r0 == 0) goto L4
            long r6 = r0.f13353a
            u2.k r0 = r13.getDisplayBounds()
            int r1 = r0.f13351c
            int r2 = r0.f13349a
            int r1 = r1 - r2
            int r0 = r0.a()
            long r1 = (long) r1
            r8 = 32
            long r1 = r1 << r8
            long r4 = (long) r0
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r9
            long r4 = r4 | r1
            gg.t r1 = new gg.t
            r1.<init>()
            r11 = 0
            r1.f4563g = r11
            y2.c r11 = y2.c.f22199m
            y2.w r0 = new y2.w
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r6)
            w0.s r3 = r2.E
            r3.c(r13, r11, r0)
            long r0 = r1.f4563g
            long r6 = r0 >> r8
            int r3 = (int) r6
            android.view.WindowManager$LayoutParams r6 = r2.f22281w
            r6.x = r3
            long r0 = r0 & r9
            int r0 = (int) r0
            r6.y = r0
            y2.c0 r0 = r2.f22275q
            boolean r0 = r0.f22205e
            y2.a0 r1 = r2.f22279u
            if (r0 == 0) goto L5b
            long r7 = r4 >> r8
            int r0 = (int) r7
            long r3 = r4 & r9
            int r3 = (int) r3
            r1.b(r13, r0, r3)
        L5b:
            r1.getClass()
            android.view.WindowManager r0 = r2.f22280v
            r0.updateViewLayout(r13, r6)
        L63:
            return
    }

    @Override // android.view.View
    public void setLayoutDirection(int r1) {
            r0 = this;
            return
    }

    public final void setParentLayoutDirection(u2.m r1) {
            r0 = this;
            r0.f22283y = r1
            return
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m187setPopupContentSizefhxjrPA(u2.l r2) {
            r1 = this;
            i0.j1 r0 = r1.f22284z
            r0.setValue(r2)
            return
    }

    public final void setPositionProvider(y2.b0 r1) {
            r0 = this;
            r0.f22282x = r1
            return
    }

    public final void setTestTag(java.lang.String r1) {
            r0 = this;
            r0.f22276r = r1
            return
    }
}
