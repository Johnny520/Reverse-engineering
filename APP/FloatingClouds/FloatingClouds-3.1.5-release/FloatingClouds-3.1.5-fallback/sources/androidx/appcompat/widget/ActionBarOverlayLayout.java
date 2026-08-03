package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends android.view.ViewGroup implements a.M4, a.Kb, a.Lb {
    public static final int[] C = null;
    public static final a.nh D = null;
    public static final android.graphics.Rect E = null;
    public final a.Mb A;
    public final androidx.appcompat.widget.ActionBarOverlayLayout.f B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f832a;
    public int b;
    public androidx.appcompat.widget.ContentFrameLayout c;
    public androidx.appcompat.widget.ActionBarContainer d;
    public a.N4 e;
    public android.graphics.drawable.Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public final android.graphics.Rect m;
    public final android.graphics.Rect n;
    public final android.graphics.Rect o;
    public final android.graphics.Rect p;
    public a.nh q;
    public a.nh r;
    public a.nh s;
    public a.nh t;
    public androidx.appcompat.widget.ActionBarOverlayLayout.d u;
    public android.widget.OverScroller v;
    public android.view.ViewPropertyAnimator w;
    public final androidx.appcompat.widget.ActionBarOverlayLayout.a x;
    public final androidx.appcompat.widget.ActionBarOverlayLayout.b y;
    public final androidx.appcompat.widget.ActionBarOverlayLayout.c z;

    public class a extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f833a;

        public a(androidx.appcompat.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.f833a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                r2 = 0
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r1.f833a
                r0.w = r2
                r2 = 0
                r0.j = r2
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                r2 = 0
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r1.f833a
                r0.w = r2
                r2 = 0
                r0.j = r2
                return
        }
    }

    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f834a;

        public b(androidx.appcompat.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.<init>()
                r0.f834a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f834a
                r0.q()
                androidx.appcompat.widget.ActionBarContainer r1 = r0.d
                android.view.ViewPropertyAnimator r1 = r1.animate()
                r2 = 0
                android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
                androidx.appcompat.widget.ActionBarOverlayLayout$a r2 = r0.x
                android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
                r0.w = r1
                return
        }
    }

    public class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f835a;

        public c(androidx.appcompat.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.<init>()
                r0.f835a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f835a
                r0.q()
                androidx.appcompat.widget.ActionBarContainer r1 = r0.d
                android.view.ViewPropertyAnimator r1 = r1.animate()
                androidx.appcompat.widget.ActionBarContainer r2 = r0.d
                int r2 = r2.getHeight()
                int r2 = -r2
                float r2 = (float) r2
                android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
                androidx.appcompat.widget.ActionBarOverlayLayout$a r2 = r0.x
                android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
                r0.w = r1
                return
        }
    }

    public interface d {
    }

    public static class e extends android.view.ViewGroup.MarginLayoutParams {
    }

    public static final class f extends android.view.View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    static {
            int r0 = androidx.appcompat.R.attr.actionBarSize
            r1 = 16842841(0x1010059, float:2.3693807E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.widget.ActionBarOverlayLayout.C = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L17
            a.nh$d r0 = new a.nh$d
            r0.<init>()
            goto L26
        L17:
            r1 = 29
            if (r0 < r1) goto L21
            a.nh$c r0 = new a.nh$c
            r0.<init>()
            goto L26
        L21:
            a.nh$b r0 = new a.nh$b
            r0.<init>()
        L26:
            r1 = 0
            r2 = 1
            a.a9 r1 = a.C0047a9.b(r1, r2, r1, r2)
            r0.g(r1)
            a.nh r0 = r0.b()
            androidx.appcompat.widget.ActionBarOverlayLayout.D = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.appcompat.widget.ActionBarOverlayLayout.E = r0
            return
    }

    public ActionBarOverlayLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.b = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.m = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.n = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.o = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.p = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            a.nh r2 = a.nh.b
            r0.q = r2
            r0.r = r2
            r0.s = r2
            r0.t = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$a r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$a
            r2.<init>(r0)
            r0.x = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$b r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$b
            r2.<init>(r0)
            r0.y = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$c r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$c
            r2.<init>(r0)
            r0.z = r2
            r0.r(r1)
            a.Mb r2 = new a.Mb
            r2.<init>()
            r0.A = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$f r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$f
            r2.<init>(r1)
            r1 = 1
            r2.setWillNotDraw(r1)
            r0.B = r2
            r0.addView(r2)
            return
    }

    public static boolean p(android.view.View r4, android.graphics.Rect r5, boolean r6) {
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r4 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r4
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

    @Override // a.M4
    public final boolean a() {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            boolean r0 = r0.a()
            return r0
    }

    @Override // a.M4
    public final boolean b() {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            boolean r0 = r0.b()
            return r0
    }

    @Override // a.Kb
    public final void c(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L5
            r0.onNestedScrollAccepted(r1, r2, r3)
        L5:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.ActionBarOverlayLayout.e
            return r1
    }

    @Override // a.M4
    public final boolean d() {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            boolean r0 = r0.d()
            return r0
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r6) {
            r5 = this;
            super.draw(r6)
            android.graphics.drawable.Drawable r0 = r5.f
            if (r0 == 0) goto L39
            androidx.appcompat.widget.ActionBarContainer r0 = r5.d
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L23
            androidx.appcompat.widget.ActionBarContainer r0 = r5.d
            int r0 = r0.getBottom()
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r2 = r5.d
            float r2 = r2.getTranslationY()
            float r2 = r2 + r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r0 = (int) r2
            goto L24
        L23:
            r0 = r1
        L24:
            android.graphics.drawable.Drawable r2 = r5.f
            int r3 = r5.getWidth()
            android.graphics.drawable.Drawable r4 = r5.f
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 + r0
            r2.setBounds(r1, r0, r3, r4)
            android.graphics.drawable.Drawable r0 = r5.f
            r0.draw(r6)
        L39:
            return
    }

    @Override // a.M4
    public final void e(androidx.appcompat.view.menu.f r2, androidx.appcompat.view.menu.j.a r3) {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            r0.e(r2, r3)
            return
    }

    @Override // a.M4
    public final boolean f() {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            boolean r0 = r0.f()
            return r0
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(android.graphics.Rect r1) {
            r0 = this;
            boolean r1 = super.fitSystemWindows(r1)
            return r1
    }

    @Override // a.M4
    public final void g() {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            r0.g()
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$e
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$e
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$e
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
            a.Mb r0 = r2.A
            int r1 = r0.f175a
            int r0 = r0.b
            r0 = r0 | r1
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // a.M4
    public final boolean h() {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            boolean r0 = r0.h()
            return r0
    }

    @Override // a.Kb
    public final void i(android.view.View r1, int r2) {
            r0 = this;
            if (r2 != 0) goto L5
            r0.onStopNestedScroll(r1)
        L5:
            return
    }

    @Override // a.Kb
    public final void j(android.view.View r1, int r2, int r3, int[] r4, int r5) {
            r0 = this;
            return
    }

    @Override // a.M4
    public final void k(int r2) {
            r1 = this;
            r1.s()
            r0 = 2
            if (r2 == r0) goto L19
            r0 = 5
            if (r2 == r0) goto L13
            r0 = 109(0x6d, float:1.53E-43)
            if (r2 == r0) goto Le
            return
        Le:
            r2 = 1
            r1.setOverlayMode(r2)
            return
        L13:
            a.N4 r2 = r1.e
            r2.q()
            return
        L19:
            a.N4 r2 = r1.e
            r2.o()
            return
    }

    @Override // a.M4
    public final void l() {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            r0.i()
            return
    }

    @Override // a.Lb
    public final void m(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.n(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // a.Kb
    public final void n(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            if (r6 != 0) goto L5
            r0.onNestedScroll(r1, r2, r3, r4, r5)
        L5:
            return
    }

    @Override // a.Kb
    public final boolean o(android.view.View r1, android.view.View r2, int r3, int r4) {
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
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
            r6 = this;
            r6.s()
            a.nh r7 = a.nh.g(r6, r7)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r7.b()
            int r2 = r7.d()
            int r3 = r7.c()
            int r4 = r7.a()
            r0.<init>(r1, r2, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r6.d
            r2 = 0
            boolean r0 = p(r1, r0, r2)
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            android.graphics.Rect r1 = r6.m
            a.C0414ug.d.b(r6, r7, r1)
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r5 = r1.bottom
            a.nh$k r7 = r7.f603a
            a.nh r2 = r7.l(r2, r3, r4, r5)
            r6.q = r2
            a.nh r3 = r6.r
            boolean r2 = r3.equals(r2)
            r3 = 1
            if (r2 != 0) goto L48
            a.nh r0 = r6.q
            r6.r = r0
            r0 = r3
        L48:
            android.graphics.Rect r2 = r6.n
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
            a.nh r7 = r7.a()
            a.nh$k r7 = r7.f603a
            a.nh r7 = r7.c()
            a.nh$k r7 = r7.f603a
            a.nh r7 = r7.b()
            android.view.WindowInsets r7 = r7.f()
            return r7
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            android.content.Context r1 = r0.getContext()
            r0.r(r1)
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            a.C0414ug.c.c(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.q()
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
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r0
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
            r12.s()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.d
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r13 = r0.d
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r13 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r13
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
            java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
            int r5 = r12.getWindowSystemUiVisibility()
            r5 = r5 & 256(0x100, float:3.59E-43)
            r6 = 1
            if (r5 == 0) goto L4d
            r5 = r6
            goto L4e
        L4d:
            r5 = r1
        L4e:
            if (r5 == 0) goto L62
            int r7 = r0.f832a
            boolean r8 = r0.h
            if (r8 == 0) goto L74
            androidx.appcompat.widget.ActionBarContainer r8 = r0.d
            android.view.View r8 = r8.getTabContainer()
            if (r8 == 0) goto L74
            int r8 = r0.f832a
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
            android.graphics.Rect r8 = r0.m
            android.graphics.Rect r9 = r0.o
            r9.set(r8)
            a.nh r8 = r0.q
            r0.s = r8
            boolean r8 = r0.g
            if (r8 != 0) goto Laa
            if (r5 != 0) goto Laa
            androidx.appcompat.widget.ActionBarOverlayLayout$f r5 = r0.B
            a.nh r8 = androidx.appcompat.widget.ActionBarOverlayLayout.D
            android.graphics.Rect r10 = r0.p
            a.C0414ug.d.b(r5, r8, r10)
            android.graphics.Rect r5 = androidx.appcompat.widget.ActionBarOverlayLayout.E
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto Laa
            int r5 = r9.top
            int r5 = r5 + r7
            r9.top = r5
            int r5 = r9.bottom
            r9.bottom = r5
            a.nh r5 = r0.s
            a.nh$k r5 = r5.f603a
            a.nh r1 = r5.l(r1, r7, r1, r1)
            r0.s = r1
            goto Led
        Laa:
            a.nh r1 = r0.s
            int r1 = r1.b()
            a.nh r5 = r0.s
            int r5 = r5.d()
            int r5 = r5 + r7
            a.nh r7 = r0.s
            int r7 = r7.c()
            a.nh r8 = r0.s
            int r8 = r8.a()
            a.a9 r1 = a.C0047a9.b(r1, r5, r7, r8)
            a.nh r5 = r0.s
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 30
            if (r7 < r8) goto Ld5
            a.nh$d r7 = new a.nh$d
            r7.<init>(r5)
            goto Le4
        Ld5:
            r8 = 29
            if (r7 < r8) goto Ldf
            a.nh$c r7 = new a.nh$c
            r7.<init>(r5)
            goto Le4
        Ldf:
            a.nh$b r7 = new a.nh$b
            r7.<init>(r5)
        Le4:
            r7.g(r1)
            a.nh r1 = r7.b()
            r0.s = r1
        Led:
            androidx.appcompat.widget.ContentFrameLayout r1 = r0.c
            p(r1, r9, r6)
            a.nh r1 = r0.t
            a.nh r5 = r0.s
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L115
            a.nh r1 = r0.s
            r0.t = r1
            androidx.appcompat.widget.ContentFrameLayout r5 = r0.c
            android.view.WindowInsets r1 = r1.f()
            if (r1 == 0) goto L115
            android.view.WindowInsets r6 = a.C0414ug.c.a(r5, r1)
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L115
            a.nh.g(r5, r6)
        L115:
            androidx.appcompat.widget.ContentFrameLayout r7 = r0.c
            r9 = 0
            r11 = 0
            r6 = r0
            r8 = r2
            r10 = r4
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            androidx.appcompat.widget.ContentFrameLayout r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r1 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r1
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
            boolean r10 = r9.i
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
            r9.q()
            androidx.appcompat.widget.ActionBarOverlayLayout$c r10 = r9.z
            r10.run()
            goto L36
        L2e:
            r9.q()
            androidx.appcompat.widget.ActionBarOverlayLayout$b r10 = r9.y
            r10.run()
        L36:
            r10 = 1
            r9.j = r10
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
            int r1 = r0.k
            int r1 = r1 + r3
            r0.k = r1
            r0.setActionBarHideOffset(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            a.Mb r1 = r0.A
            r1.f175a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.k = r1
            r0.q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.u
            if (r1 == 0) goto L1d
            a.lh r1 = (a.lh) r1
            a.Kg r2 = r1.s
            if (r2 == 0) goto L1d
            r2.a()
            r2 = 0
            r1.s = r2
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
            boolean r1 = r0.i
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View r4) {
            r3 = this;
            boolean r4 = r3.i
            if (r4 == 0) goto L25
            boolean r4 = r3.j
            if (r4 != 0) goto L25
            int r4 = r3.k
            androidx.appcompat.widget.ActionBarContainer r0 = r3.d
            int r0 = r0.getHeight()
            r1 = 600(0x258, double:2.964E-321)
            if (r4 > r0) goto L1d
            r3.q()
            androidx.appcompat.widget.ActionBarOverlayLayout$b r4 = r3.y
            r3.postDelayed(r4, r1)
            goto L25
        L1d:
            r3.q()
            androidx.appcompat.widget.ActionBarOverlayLayout$c r4 = r3.z
            r3.postDelayed(r4, r1)
        L25:
            return
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public final void onWindowSystemUiVisibilityChanged(int r7) {
            r6 = this;
            super.onWindowSystemUiVisibilityChanged(r7)
            r6.s()
            int r0 = r6.l
            r0 = r0 ^ r7
            r6.l = r7
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
            androidx.appcompat.widget.ActionBarOverlayLayout$d r4 = r6.u
            if (r4 == 0) goto L3d
            r5 = r7 ^ 1
            a.lh r4 = (a.lh) r4
            r4.o = r5
            if (r1 != 0) goto L34
            if (r7 != 0) goto L2a
            goto L34
        L2a:
            boolean r7 = r4.p
            if (r7 != 0) goto L3d
            r4.p = r3
            r4.s(r3)
            goto L3d
        L34:
            boolean r7 = r4.p
            if (r7 == 0) goto L3d
            r4.p = r2
            r4.s(r3)
        L3d:
            r7 = r0 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L4a
            androidx.appcompat.widget.ActionBarOverlayLayout$d r7 = r6.u
            if (r7 == 0) goto L4a
            java.util.WeakHashMap<android.view.View, a.Jg> r7 = a.C0414ug.f721a
            a.C0414ug.c.c(r6)
        L4a:
            return
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int r2) {
            r1 = this;
            super.onWindowVisibilityChanged(r2)
            r1.b = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$d r0 = r1.u
            if (r0 == 0) goto Ld
            a.lh r0 = (a.lh) r0
            r0.n = r2
        Ld:
            return
    }

    public final void q() {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$b r0 = r1.y
            r1.removeCallbacks(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout$c r0 = r1.z
            r1.removeCallbacks(r0)
            android.view.ViewPropertyAnimator r0 = r1.w
            if (r0 == 0) goto L11
            r0.cancel()
        L11:
            return
    }

    public final void r(android.content.Context r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = androidx.appcompat.widget.ActionBarOverlayLayout.C
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            int r2 = r0.getDimensionPixelSize(r1, r1)
            r4.f832a = r2
            r2 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r2)
            r4.f = r3
            if (r3 != 0) goto L1f
            r1 = r2
        L1f:
            r4.setWillNotDraw(r1)
            r0.recycle()
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r5)
            r4.v = r0
            return
    }

    public final void s() {
            r3 = this;
            androidx.appcompat.widget.ContentFrameLayout r0 = r3.c
            if (r0 != 0) goto L46
            int r0 = androidx.appcompat.R.id.action_bar_activity_content
            android.view.View r0 = r3.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            r3.c = r0
            int r0 = androidx.appcompat.R.id.action_bar_container
            android.view.View r0 = r3.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r0 = (androidx.appcompat.widget.ActionBarContainer) r0
            r3.d = r0
            int r0 = androidx.appcompat.R.id.action_bar
            android.view.View r0 = r3.findViewById(r0)
            boolean r1 = r0 instanceof a.N4
            if (r1 == 0) goto L25
            a.N4 r0 = (a.N4) r0
            goto L2f
        L25:
            boolean r1 = r0 instanceof androidx.appcompat.widget.Toolbar
            if (r1 == 0) goto L32
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            a.N4 r0 = r0.getWrapper()
        L2f:
            r3.e = r0
            return
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r2 = "Can't make a decor toolbar out of "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L46:
            return
    }

    public void setActionBarHideOffset(int r3) {
            r2 = this;
            r2.q()
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

    public void setActionBarVisibilityCallback(androidx.appcompat.widget.ActionBarOverlayLayout.d r2) {
            r1 = this;
            r1.u = r2
            android.os.IBinder r2 = r1.getWindowToken()
            if (r2 == 0) goto L1c
            androidx.appcompat.widget.ActionBarOverlayLayout$d r2 = r1.u
            int r0 = r1.b
            a.lh r2 = (a.lh) r2
            r2.n = r0
            int r2 = r1.l
            if (r2 == 0) goto L1c
            r1.onWindowSystemUiVisibilityChanged(r2)
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            a.C0414ug.c.c(r1)
        L1c:
            return
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.i
            if (r2 == r0) goto Lf
            r1.i = r2
            if (r2 != 0) goto Lf
            r1.q()
            r2 = 0
            r1.setActionBarHideOffset(r2)
        Lf:
            return
    }

    public void setIcon(int r2) {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            r0.setIcon(r2)
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            r0.setIcon(r2)
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            r0.n(r2)
            return
    }

    public void setOverlayMode(boolean r1) {
            r0 = this;
            r0.g = r1
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

    @Override // a.M4
    public void setWindowCallback(android.view.Window.Callback r2) {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            r0.setWindowCallback(r2)
            return
    }

    @Override // a.M4
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.s()
            a.N4 r0 = r1.e
            r0.setWindowTitle(r2)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
