package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends android.view.ViewGroup implements defpackage.gf, defpackage.jw, defpackage.kw {
    public static final int[] B = null;
    public final defpackage.lw A;
    public int a;
    public int b;
    public androidx.appcompat.widget.ContentFrameLayout c;
    public androidx.appcompat.widget.ActionBarContainer d;
    public defpackage.hf e;
    public android.graphics.drawable.Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public final android.graphics.Rect n;
    public final android.graphics.Rect o;
    public final android.graphics.Rect p;
    public defpackage.wc0 q;
    public defpackage.wc0 r;
    public defpackage.wc0 s;
    public defpackage.wc0 t;
    public defpackage.a1 u;
    public android.widget.OverScroller v;
    public android.view.ViewPropertyAnimator w;
    public final defpackage.y0 x;
    public final defpackage.z0 y;
    public final defpackage.z0 z;

    static {
            r0 = 2130968579(0x7f040003, float:1.7545816E38)
            r1 = 16842841(0x1010059, float:2.3693807E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.widget.ActionBarOverlayLayout.B = r0
            return
    }

    public ActionBarOverlayLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r3 = 0
            r1.b = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.n = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.o = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.p = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            wc0 r3 = defpackage.wc0.b
            r1.q = r3
            r1.r = r3
            r1.s = r3
            r1.t = r3
            y0 r3 = new y0
            r0 = 0
            r3.<init>(r0, r1)
            r1.x = r3
            z0 r3 = new z0
            r3.<init>(r1, r0)
            r1.y = r3
            z0 r3 = new z0
            r0 = 1
            r3.<init>(r1, r0)
            r1.z = r3
            r1.i(r2)
            lw r2 = new lw
            r2.<init>()
            r1.A = r2
            return
    }

    public static boolean g(android.view.View r4, android.graphics.Rect r5, boolean r6) {
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            b1 r4 = (defpackage.b1) r4
            int r0 = r4.leftMargin
            int r1 = r5.left
            r2 = 1
            if (r0 == r1) goto L11
            r4.leftMargin = r1
            r0 = r2
            goto L12
        L11:
            r0 = 0
        L12:
            int r1 = r4.topMargin
            int r3 = r5.top
            if (r1 == r3) goto L1b
            r4.topMargin = r3
            r0 = r2
        L1b:
            int r1 = r4.rightMargin
            int r3 = r5.right
            if (r1 == r3) goto L24
            r4.rightMargin = r3
            r0 = r2
        L24:
            if (r6 == 0) goto L2f
            int r6 = r4.bottomMargin
            int r5 = r5.bottom
            if (r6 == r5) goto L2f
            r4.bottomMargin = r5
            return r2
        L2f:
            return r0
    }

    @Override // defpackage.jw
    public final void a(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L5
            r0.onNestedScrollAccepted(r1, r2, r3)
        L5:
            return
    }

    @Override // defpackage.jw
    public final void b(android.view.View r1, int r2) {
            r0 = this;
            if (r2 != 0) goto L5
            r0.onStopNestedScroll(r1)
        L5:
            return
    }

    @Override // defpackage.jw
    public final void c(android.view.View r1, int r2, int r3, int[] r4, int r5) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof defpackage.b1
            return r1
    }

    @Override // defpackage.kw
    public final void d(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.e(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r6) {
            r5 = this;
            super.draw(r6)
            android.graphics.drawable.Drawable r0 = r5.f
            if (r0 == 0) goto L3d
            boolean r0 = r5.g
            if (r0 != 0) goto L3d
            androidx.appcompat.widget.ActionBarContainer r0 = r5.d
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L27
            androidx.appcompat.widget.ActionBarContainer r0 = r5.d
            int r0 = r0.getBottom()
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r2 = r5.d
            float r2 = r2.getTranslationY()
            float r2 = r2 + r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r0 = (int) r2
            goto L28
        L27:
            r0 = r1
        L28:
            android.graphics.drawable.Drawable r2 = r5.f
            int r3 = r5.getWidth()
            android.graphics.drawable.Drawable r4 = r5.f
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 + r0
            r2.setBounds(r1, r0, r3, r4)
            android.graphics.drawable.Drawable r0 = r5.f
            r0.draw(r6)
        L3d:
            return
    }

    @Override // defpackage.jw
    public final void e(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            if (r6 != 0) goto L5
            r0.onNestedScroll(r1, r2, r3, r4, r5)
        L5:
            return
    }

    @Override // defpackage.jw
    public final boolean f(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto La
            boolean r1 = r0.onStartNestedScroll(r1, r2, r3)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(android.graphics.Rect r1) {
            r0 = this;
            boolean r1 = super.fitSystemWindows(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            b1 r0 = new b1
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            b1 r0 = new b1
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            b1 r0 = new b1
            r0.<init>(r2)
            return r0
    }

    public int getActionBarHideOffset() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.d
            if (r0 == 0) goto Lb
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r0 = -r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r2 = this;
            lw r0 = r2.A
            int r1 = r0.a
            int r0 = r0.b
            r0 = r0 | r1
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            r1.k()
            hf r0 = r1.e
            k70 r0 = (defpackage.k70) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    public final void h() {
            r1 = this;
            z0 r0 = r1.y
            r1.removeCallbacks(r0)
            z0 r0 = r1.z
            r1.removeCallbacks(r0)
            android.view.ViewPropertyAnimator r0 = r1.w
            if (r0 == 0) goto L11
            r0.cancel()
        L11:
            return
    }

    public final void i(android.content.Context r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = androidx.appcompat.widget.ActionBarOverlayLayout.B
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            int r2 = r0.getDimensionPixelSize(r1, r1)
            r4.a = r2
            r2 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r2)
            r4.f = r3
            if (r3 != 0) goto L20
            r3 = r2
            goto L21
        L20:
            r3 = r1
        L21:
            r4.setWillNotDraw(r3)
            r0.recycle()
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r3 = 19
            if (r0 >= r3) goto L32
            r1 = r2
        L32:
            r4.g = r1
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r5)
            r4.v = r0
            return
    }

    public final void j(int r4) {
            r3 = this;
            r3.k()
            r0 = 2
            java.lang.String r1 = "Progress display unsupported"
            java.lang.String r2 = "ToolbarWidgetWrapper"
            if (r4 == r0) goto L22
            r0 = 5
            if (r4 == r0) goto L17
            r0 = 109(0x6d, float:1.53E-43)
            if (r4 == r0) goto L12
            return
        L12:
            r4 = 1
            r3.setOverlayMode(r4)
            return
        L17:
            hf r4 = r3.e
            k70 r4 = (defpackage.k70) r4
            r4.getClass()
            android.util.Log.i(r2, r1)
            return
        L22:
            hf r4 = r3.e
            k70 r4 = (defpackage.k70) r4
            r4.getClass()
            android.util.Log.i(r2, r1)
            return
    }

    public final void k() {
            r3 = this;
            androidx.appcompat.widget.ContentFrameLayout r0 = r3.c
            if (r0 != 0) goto L49
            r0 = 2131296305(0x7f090031, float:1.8210523E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            r3.c = r0
            r0 = 2131296306(0x7f090032, float:1.8210525E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r0 = (androidx.appcompat.widget.ActionBarContainer) r0
            r3.d = r0
            r0 = 2131296304(0x7f090030, float:1.821052E38)
            android.view.View r0 = r3.findViewById(r0)
            boolean r1 = r0 instanceof defpackage.hf
            if (r1 == 0) goto L28
            hf r0 = (defpackage.hf) r0
            goto L32
        L28:
            boolean r1 = r0 instanceof androidx.appcompat.widget.Toolbar
            if (r1 == 0) goto L35
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            hf r0 = r0.getWrapper()
        L32:
            r3.e = r0
            return
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r2 = "Can't make a decor toolbar out of "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L49:
            return
    }

    public final void l(android.view.Menu r5, defpackage.cv r6) {
            r4 = this;
            r4.k()
            hf r0 = r4.e
            k70 r0 = (defpackage.k70) r0
            androidx.appcompat.widget.Toolbar r1 = r0.a
            j1 r2 = r0.m
            if (r2 != 0) goto L18
            j1 r2 = new j1
            android.content.Context r3 = r1.getContext()
            r2.<init>(r3)
            r0.m = r2
        L18:
            j1 r0 = r0.m
            r0.e = r6
            ku r5 = (defpackage.ku) r5
            if (r5 != 0) goto L25
            androidx.appcompat.widget.ActionMenuView r6 = r1.a
            if (r6 != 0) goto L25
            goto L2e
        L25:
            r1.f()
            androidx.appcompat.widget.ActionMenuView r6 = r1.a
            ku r6 = r6.p
            if (r6 != r5) goto L2f
        L2e:
            return
        L2f:
            if (r6 == 0) goto L3b
            j1 r2 = r1.K
            r6.r(r2)
            f70 r2 = r1.L
            r6.r(r2)
        L3b:
            f70 r6 = r1.L
            if (r6 != 0) goto L46
            f70 r6 = new f70
            r6.<init>(r1)
            r1.L = r6
        L46:
            r6 = 1
            r0.q = r6
            if (r5 == 0) goto L58
            android.content.Context r6 = r1.j
            r5.b(r0, r6)
            f70 r6 = r1.L
            android.content.Context r2 = r1.j
            r5.b(r6, r2)
            goto L6d
        L58:
            android.content.Context r5 = r1.j
            r6 = 0
            r0.i(r5, r6)
            f70 r5 = r1.L
            android.content.Context r2 = r1.j
            r5.i(r2, r6)
            r0.h()
            f70 r5 = r1.L
            r5.h()
        L6d:
            androidx.appcompat.widget.ActionMenuView r5 = r1.a
            int r6 = r1.k
            r5.setPopupTheme(r6)
            androidx.appcompat.widget.ActionMenuView r5 = r1.a
            r5.setPresenter(r0)
            r1.K = r0
            r1.u()
            return
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
            r6 = this;
            r6.k()
            wc0 r7 = defpackage.wc0.g(r6, r7)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r7.b()
            int r2 = r7.d()
            int r3 = r7.c()
            int r4 = r7.a()
            r0.<init>(r1, r2, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r6.d
            r2 = 0
            boolean r0 = g(r1, r0, r2)
            java.util.WeakHashMap r1 = defpackage.ja0.a
            android.graphics.Rect r1 = r6.n
            defpackage.y90.b(r6, r7, r1)
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r5 = r1.bottom
            tc0 r7 = r7.a
            wc0 r2 = r7.l(r2, r3, r4, r5)
            r6.q = r2
            wc0 r3 = r6.r
            boolean r2 = r3.equals(r2)
            r3 = 1
            if (r2 != 0) goto L48
            wc0 r0 = r6.q
            r6.r = r0
            r0 = r3
        L48:
            android.graphics.Rect r2 = r6.o
            boolean r4 = r2.equals(r1)
            if (r4 != 0) goto L54
            r2.set(r1)
            goto L55
        L54:
            r3 = r0
        L55:
            if (r3 == 0) goto L5a
            r6.requestLayout()
        L5a:
            wc0 r7 = r7.a()
            tc0 r7 = r7.a
            wc0 r7 = r7.c()
            tc0 r7 = r7.a
            wc0 r7 = r7.b()
            android.view.WindowInsets r7 = r7.f()
            return r7
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            android.content.Context r1 = r0.getContext()
            r0.i(r1)
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.w90.c(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.h()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            int r6 = r4.getPaddingLeft()
            int r7 = r4.getPaddingTop()
            r8 = 0
        Ld:
            if (r8 >= r5) goto L37
            android.view.View r9 = r4.getChildAt(r8)
            int r0 = r9.getVisibility()
            r1 = 8
            if (r0 == r1) goto L34
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            b1 r0 = (defpackage.b1) r0
            int r1 = r9.getMeasuredWidth()
            int r2 = r9.getMeasuredHeight()
            int r3 = r0.leftMargin
            int r3 = r3 + r6
            int r0 = r0.topMargin
            int r0 = r0 + r7
            int r1 = r1 + r3
            int r2 = r2 + r0
            r9.layout(r3, r0, r1, r2)
        L34:
            int r8 = r8 + 1
            goto Ld
        L37:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r13, int r14) {
            r12 = this;
            r12.k()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.d
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r13 = r0.d
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            b1 r13 = (defpackage.b1) r13
            androidx.appcompat.widget.ActionBarContainer r14 = r0.d
            int r14 = r14.getMeasuredWidth()
            int r1 = r13.leftMargin
            int r14 = r14 + r1
            int r1 = r13.rightMargin
            int r14 = r14 + r1
            r1 = 0
            int r14 = java.lang.Math.max(r1, r14)
            androidx.appcompat.widget.ActionBarContainer r3 = r0.d
            int r3 = r3.getMeasuredHeight()
            int r5 = r13.topMargin
            int r3 = r3 + r5
            int r13 = r13.bottomMargin
            int r3 = r3 + r13
            int r13 = java.lang.Math.max(r1, r3)
            androidx.appcompat.widget.ActionBarContainer r3 = r0.d
            int r3 = r3.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r1, r3)
            java.util.WeakHashMap r5 = defpackage.ja0.a
            int r5 = defpackage.s90.g(r12)
            r5 = r5 & 256(0x100, float:3.59E-43)
            r6 = 1
            if (r5 == 0) goto L4d
            r5 = r6
            goto L4e
        L4d:
            r5 = r1
        L4e:
            if (r5 == 0) goto L62
            int r7 = r0.a
            boolean r8 = r0.i
            if (r8 == 0) goto L74
            androidx.appcompat.widget.ActionBarContainer r8 = r0.d
            android.view.View r8 = r8.getTabContainer()
            if (r8 == 0) goto L74
            int r8 = r0.a
            int r7 = r7 + r8
            goto L74
        L62:
            androidx.appcompat.widget.ActionBarContainer r7 = r0.d
            int r7 = r7.getVisibility()
            r8 = 8
            if (r7 == r8) goto L73
            androidx.appcompat.widget.ActionBarContainer r7 = r0.d
            int r7 = r7.getMeasuredHeight()
            goto L74
        L73:
            r7 = r1
        L74:
            android.graphics.Rect r8 = r0.n
            android.graphics.Rect r9 = r0.p
            r9.set(r8)
            wc0 r8 = r0.q
            r0.s = r8
            boolean r10 = r0.h
            if (r10 != 0) goto L97
            if (r5 != 0) goto L97
            int r5 = r9.top
            int r5 = r5 + r7
            r9.top = r5
            int r5 = r9.bottom
            r9.bottom = r5
            tc0 r5 = r8.a
            wc0 r1 = r5.l(r1, r7, r1, r1)
            r0.s = r1
            goto Ld8
        L97:
            int r1 = r8.b()
            wc0 r5 = r0.s
            int r5 = r5.d()
            int r5 = r5 + r7
            wc0 r7 = r0.s
            int r7 = r7.c()
            wc0 r8 = r0.s
            int r8 = r8.a()
            ep r1 = defpackage.ep.b(r1, r5, r7, r8)
            wc0 r5 = r0.s
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 30
            if (r7 < r8) goto Lc0
            lc0 r7 = new lc0
            r7.<init>(r5)
            goto Lcf
        Lc0:
            r8 = 29
            if (r7 < r8) goto Lca
            kc0 r7 = new kc0
            r7.<init>(r5)
            goto Lcf
        Lca:
            ic0 r7 = new ic0
            r7.<init>(r5)
        Lcf:
            r7.g(r1)
            wc0 r1 = r7.b()
            r0.s = r1
        Ld8:
            androidx.appcompat.widget.ContentFrameLayout r1 = r0.c
            g(r1, r9, r6)
            wc0 r1 = r0.t
            wc0 r5 = r0.s
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L100
            wc0 r1 = r0.s
            r0.t = r1
            androidx.appcompat.widget.ContentFrameLayout r5 = r0.c
            android.view.WindowInsets r1 = r1.f()
            if (r1 == 0) goto L100
            android.view.WindowInsets r6 = defpackage.w90.a(r5, r1)
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L100
            defpackage.wc0.g(r5, r6)
        L100:
            androidx.appcompat.widget.ContentFrameLayout r7 = r0.c
            r9 = 0
            r11 = 0
            r6 = r0
            r8 = r2
            r10 = r4
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            androidx.appcompat.widget.ContentFrameLayout r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            b1 r1 = (defpackage.b1) r1
            androidx.appcompat.widget.ContentFrameLayout r5 = r0.c
            int r5 = r5.getMeasuredWidth()
            int r6 = r1.leftMargin
            int r5 = r5 + r6
            int r6 = r1.rightMargin
            int r5 = r5 + r6
            int r14 = java.lang.Math.max(r14, r5)
            androidx.appcompat.widget.ContentFrameLayout r5 = r0.c
            int r5 = r5.getMeasuredHeight()
            int r6 = r1.topMargin
            int r5 = r5 + r6
            int r1 = r1.bottomMargin
            int r5 = r5 + r1
            int r13 = java.lang.Math.max(r13, r5)
            androidx.appcompat.widget.ContentFrameLayout r1 = r0.c
            int r1 = r1.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r3, r1)
            int r3 = r12.getPaddingLeft()
            int r5 = r12.getPaddingRight()
            int r5 = r5 + r3
            int r5 = r5 + r14
            int r14 = r12.getPaddingTop()
            int r3 = r12.getPaddingBottom()
            int r3 = r3 + r14
            int r3 = r3 + r13
            int r13 = r12.getSuggestedMinimumHeight()
            int r13 = java.lang.Math.max(r3, r13)
            int r14 = r12.getSuggestedMinimumWidth()
            int r14 = java.lang.Math.max(r5, r14)
            int r14 = android.view.View.resolveSizeAndState(r14, r2, r1)
            int r1 = r1 << 16
            int r13 = android.view.View.resolveSizeAndState(r13, r4, r1)
            r12.setMeasuredDimension(r14, r13)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View r10, float r11, float r12, boolean r13) {
            r9 = this;
            boolean r10 = r9.j
            if (r10 == 0) goto L3a
            if (r13 != 0) goto L7
            goto L3a
        L7:
            android.widget.OverScroller r0 = r9.v
            int r4 = (int) r12
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8)
            android.widget.OverScroller r10 = r9.v
            int r10 = r10.getFinalY()
            androidx.appcompat.widget.ActionBarContainer r11 = r9.d
            int r11 = r11.getHeight()
            if (r10 <= r11) goto L2e
            r9.h()
            z0 r10 = r9.z
            r10.run()
            goto L36
        L2e:
            r9.h()
            z0 r10 = r9.y
            r10.run()
        L36:
            r10 = 1
            r9.k = r10
            return r10
        L3a:
            r10 = 0
            return r10
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.l
            int r1 = r1 + r3
            r0.l = r1
            r0.setActionBarHideOffset(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            lw r1 = r0.A
            r1.a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.l = r1
            r0.h()
            a1 r1 = r0.u
            if (r1 == 0) goto L1d
            yb0 r1 = (defpackage.yb0) r1
            xa0 r2 = r1.O
            if (r2 == 0) goto L1d
            r2.a()
            r2 = 0
            r1.O = r2
        L1d:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L10
            androidx.appcompat.widget.ActionBarContainer r1 = r0.d
            int r1 = r1.getVisibility()
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            boolean r1 = r0.j
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View r4) {
            r3 = this;
            boolean r4 = r3.j
            if (r4 == 0) goto L25
            boolean r4 = r3.k
            if (r4 != 0) goto L25
            int r4 = r3.l
            androidx.appcompat.widget.ActionBarContainer r0 = r3.d
            int r0 = r0.getHeight()
            r1 = 600(0x258, double:2.964E-321)
            if (r4 > r0) goto L1d
            r3.h()
            z0 r4 = r3.y
            r3.postDelayed(r4, r1)
            goto L25
        L1d:
            r3.h()
            z0 r4 = r3.z
            r3.postDelayed(r4, r1)
        L25:
            return
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int r7) {
            r6 = this;
            super.onWindowSystemUiVisibilityChanged(r7)
            r6.k()
            int r0 = r6.m
            r0 = r0 ^ r7
            r6.m = r7
            r1 = r7 & 4
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L13
            r1 = r3
            goto L14
        L13:
            r1 = r2
        L14:
            r7 = r7 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L1a
            r7 = r3
            goto L1b
        L1a:
            r7 = r2
        L1b:
            a1 r4 = r6.u
            if (r4 == 0) goto L3d
            r5 = r7 ^ 1
            yb0 r4 = (defpackage.yb0) r4
            r4.K = r5
            if (r1 != 0) goto L34
            if (r7 != 0) goto L2a
            goto L34
        L2a:
            boolean r7 = r4.L
            if (r7 != 0) goto L3d
            r4.L = r3
            r4.P(r3)
            goto L3d
        L34:
            boolean r7 = r4.L
            if (r7 == 0) goto L3d
            r4.L = r2
            r4.P(r3)
        L3d:
            r7 = r0 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L4a
            a1 r7 = r6.u
            if (r7 == 0) goto L4a
            java.util.WeakHashMap r7 = defpackage.ja0.a
            defpackage.w90.c(r6)
        L4a:
            return
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int r2) {
            r1 = this;
            super.onWindowVisibilityChanged(r2)
            r1.b = r2
            a1 r0 = r1.u
            if (r0 == 0) goto Ld
            yb0 r0 = (defpackage.yb0) r0
            r0.J = r2
        Ld:
            return
    }

    public void setActionBarHideOffset(int r3) {
            r2 = this;
            r2.h()
            androidx.appcompat.widget.ActionBarContainer r0 = r2.d
            int r0 = r0.getHeight()
            r1 = 0
            int r3 = java.lang.Math.min(r3, r0)
            int r3 = java.lang.Math.max(r1, r3)
            androidx.appcompat.widget.ActionBarContainer r0 = r2.d
            int r3 = -r3
            float r3 = (float) r3
            r0.setTranslationY(r3)
            return
    }

    public void setActionBarVisibilityCallback(defpackage.a1 r2) {
            r1 = this;
            r1.u = r2
            android.os.IBinder r2 = r1.getWindowToken()
            if (r2 == 0) goto L1c
            a1 r2 = r1.u
            int r0 = r1.b
            yb0 r2 = (defpackage.yb0) r2
            r2.J = r0
            int r2 = r1.m
            if (r2 == 0) goto L1c
            r1.onWindowSystemUiVisibilityChanged(r2)
            java.util.WeakHashMap r2 = defpackage.ja0.a
            defpackage.w90.c(r1)
        L1c:
            return
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.j
            if (r2 == r0) goto Lf
            r1.j = r2
            if (r2 != 0) goto Lf
            r1.h()
            r2 = 0
            r1.setActionBarHideOffset(r2)
        Lf:
            return
    }

    public void setIcon(int r3) {
            r2 = this;
            r2.k()
            hf r0 = r2.e
            k70 r0 = (defpackage.k70) r0
            if (r3 == 0) goto L14
            androidx.appcompat.widget.Toolbar r1 = r0.a
            android.content.Context r1 = r1.getContext()
            android.graphics.drawable.Drawable r3 = defpackage.ff.r(r1, r3)
            goto L15
        L14:
            r3 = 0
        L15:
            r0.d = r3
            r0.c()
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.k()
            hf r0 = r1.e
            k70 r0 = (defpackage.k70) r0
            r0.d = r2
            r0.c()
            return
    }

    public void setLogo(int r3) {
            r2 = this;
            r2.k()
            hf r0 = r2.e
            k70 r0 = (defpackage.k70) r0
            if (r3 == 0) goto L14
            androidx.appcompat.widget.Toolbar r1 = r0.a
            android.content.Context r1 = r1.getContext()
            android.graphics.drawable.Drawable r3 = defpackage.ff.r(r1, r3)
            goto L15
        L14:
            r3 = 0
        L15:
            r0.e = r3
            r0.c()
            return
    }

    public void setOverlayMode(boolean r2) {
            r1 = this;
            r1.h = r2
            if (r2 == 0) goto L14
            android.content.Context r2 = r1.getContext()
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            r0 = 19
            if (r2 >= r0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            r1.g = r2
            return
    }

    public void setShowingForActionMode(boolean r1) {
            r0 = this;
            return
    }

    public void setUiOptions(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.gf
    public void setWindowCallback(android.view.Window.Callback r2) {
            r1 = this;
            r1.k()
            hf r0 = r1.e
            k70 r0 = (defpackage.k70) r0
            r0.k = r2
            return
    }

    @Override // defpackage.gf
    public void setWindowTitle(java.lang.CharSequence r4) {
            r3 = this;
            r3.k()
            hf r0 = r3.e
            k70 r0 = (defpackage.k70) r0
            boolean r1 = r0.g
            if (r1 != 0) goto L23
            androidx.appcompat.widget.Toolbar r1 = r0.a
            r0.h = r4
            int r2 = r0.b
            r2 = r2 & 8
            if (r2 == 0) goto L23
            r1.setTitle(r4)
            boolean r0 = r0.g
            if (r0 == 0) goto L23
            android.view.View r0 = r1.getRootView()
            defpackage.ja0.m(r0, r4)
        L23:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
