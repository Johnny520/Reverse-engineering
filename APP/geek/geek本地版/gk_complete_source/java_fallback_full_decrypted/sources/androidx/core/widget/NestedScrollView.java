package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements defpackage.kw {
    public static final float A = 0.0f;
    public static final defpackage.qt B = null;
    public static final int[] C = null;
    public final float a;
    public long b;
    public final android.graphics.Rect c;
    public final android.widget.OverScroller d;
    public final android.widget.EdgeEffect e;
    public final android.widget.EdgeEffect f;
    public int g;
    public boolean h;
    public boolean i;
    public android.view.View j;
    public boolean k;
    public android.view.VelocityTracker l;
    public boolean m;
    public boolean n;
    public final int o;
    public final int p;
    public final int q;
    public int r;
    public final int[] s;
    public final int[] t;
    public int u;
    public int v;
    public defpackage.hw w;
    public final defpackage.lw x;
    public final defpackage.iw y;
    public float z;

    static {
            r0 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            double r0 = java.lang.Math.log(r0)
            r2 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r2 = java.lang.Math.log(r2)
            double r0 = r0 / r2
            float r0 = (float) r0
            androidx.core.widget.NestedScrollView.A = r0
            qt r0 = new qt
            r1 = 3
            r0.<init>(r1)
            androidx.core.widget.NestedScrollView.B = r0
            r0 = 16843130(0x101017a, float:2.3694617E-38)
            int[] r0 = new int[]{r0}
            androidx.core.widget.NestedScrollView.C = r0
            return
    }

    public NestedScrollView(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r0 = 2130969375(0x7f04031f, float:1.754743E38)
            r6.<init>(r7, r8, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r6.c = r1
            r1 = 1
            r6.h = r1
            r2 = 0
            r6.i = r2
            r3 = 0
            r6.j = r3
            r6.k = r2
            r6.n = r1
            r3 = -1
            r6.r = r3
            r3 = 2
            int[] r4 = new int[r3]
            r6.s = r4
            int[] r3 = new int[r3]
            r6.t = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L31
            android.widget.EdgeEffect r5 = defpackage.uh.a(r7, r8)
            goto L36
        L31:
            android.widget.EdgeEffect r5 = new android.widget.EdgeEffect
            r5.<init>(r7)
        L36:
            r6.e = r5
            if (r3 < r4) goto L3f
            android.widget.EdgeEffect r3 = defpackage.uh.a(r7, r8)
            goto L44
        L3f:
            android.widget.EdgeEffect r3 = new android.widget.EdgeEffect
            r3.<init>(r7)
        L44:
            r6.f = r3
            android.content.res.Resources r3 = r7.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r4 = 1126170624(0x43200000, float:160.0)
            float r3 = r3 * r4
            r4 = 1136724797(0x43c10b3d, float:386.0878)
            float r3 = r3 * r4
            r4 = 1062668861(0x3f570a3d, float:0.84)
            float r3 = r3 * r4
            r6.a = r3
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r4 = r6.getContext()
            r3.<init>(r4)
            r6.d = r3
            r6.setFocusable(r1)
            r3 = 262144(0x40000, float:3.67342E-40)
            r6.setDescendantFocusability(r3)
            r6.setWillNotDraw(r2)
            android.content.Context r3 = r6.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r4 = r3.getScaledTouchSlop()
            r6.o = r4
            int r4 = r3.getScaledMinimumFlingVelocity()
            r6.p = r4
            int r3 = r3.getScaledMaximumFlingVelocity()
            r6.q = r3
            int[] r3 = androidx.core.widget.NestedScrollView.C
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r3, r0, r2)
            boolean r8 = r7.getBoolean(r2, r2)
            r6.setFillViewport(r8)
            r7.recycle()
            lw r7 = new lw
            r7.<init>()
            r6.x = r7
            iw r7 = new iw
            r7.<init>(r6)
            r6.y = r7
            r6.setNestedScrollingEnabled(r1)
            qt r7 = androidx.core.widget.NestedScrollView.B
            defpackage.ja0.l(r6, r7)
            return
    }

    private float getVerticalScrollFactorCompat() {
            r5 = this;
            float r0 = r5.z
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L35
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources$Theme r2 = r1.getTheme()
            r3 = 16842829(0x101004d, float:2.3693774E-38)
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r4)
            if (r2 == 0) goto L2d
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r0 = r0.getDimension(r1)
            r5.z = r0
            goto L35
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected theme to define listPreferredItemHeight."
            r0.<init>(r1)
            throw r0
        L35:
            float r0 = r5.z
            return r0
    }

    public static boolean m(android.view.View r1, androidx.core.widget.NestedScrollView r2) {
            if (r1 != r2) goto L3
            goto L13
        L3:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L15
            android.view.View r1 = (android.view.View) r1
            boolean r1 = m(r1, r2)
            if (r1 == 0) goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    @Override // defpackage.jw
    public final void a(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r1 = 1
            lw r2 = r0.x
            if (r4 != r1) goto L8
            r2.b = r3
            goto La
        L8:
            r2.a = r3
        La:
            r1 = 2
            iw r2 = r0.y
            r2.g(r1, r4)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "ScrollView can host only one direct child"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3, r4)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    @Override // defpackage.jw
    public final void b(android.view.View r3, int r4) {
            r2 = this;
            r3 = 1
            lw r0 = r2.x
            r1 = 0
            if (r4 != r3) goto L9
            r0.b = r1
            goto Lb
        L9:
            r0.a = r1
        Lb:
            r2.v(r4)
            return
    }

    @Override // defpackage.jw
    public final void c(android.view.View r7, int r8, int r9, int[] r10, int r11) {
            r6 = this;
            r4 = 0
            iw r0 = r6.y
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
            r1 = this;
            int r0 = super.computeHorizontalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
            r1 = this;
            int r0 = super.computeHorizontalScrollOffset()
            return r0
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
            r1 = this;
            int r0 = super.computeHorizontalScrollRange()
            return r0
    }

    @Override // android.view.View
    public final void computeScroll() {
            r18 = this;
            r0 = r18
            android.widget.OverScroller r1 = r0.d
            boolean r2 = r1.isFinished()
            if (r2 == 0) goto Lb
            return
        Lb:
            r1.computeScrollOffset()
            int r2 = r1.getCurrY()
            int r3 = r0.v
            int r3 = r2 - r3
            int r4 = r0.getHeight()
            android.widget.EdgeEffect r5 = r0.e
            android.widget.EdgeEffect r6 = r0.f
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 0
            r9 = 1082130432(0x40800000, float:4.0)
            if (r3 <= 0) goto L46
            float r10 = defpackage.a80.k(r5)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 == 0) goto L46
            int r8 = -r3
            float r8 = (float) r8
            float r8 = r8 * r9
            float r10 = (float) r4
            float r8 = r8 / r10
            int r4 = -r4
            float r4 = (float) r4
            float r4 = r4 / r9
            float r7 = defpackage.a80.w(r5, r8, r7)
            float r7 = r7 * r4
            int r4 = java.lang.Math.round(r7)
            if (r4 == r3) goto L43
            r5.finish()
        L43:
            int r3 = r3 - r4
        L44:
            r9 = r3
            goto L64
        L46:
            if (r3 >= 0) goto L44
            float r10 = defpackage.a80.k(r6)
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 == 0) goto L44
            float r8 = (float) r3
            float r8 = r8 * r9
            float r4 = (float) r4
            float r8 = r8 / r4
            float r4 = r4 / r9
            float r7 = defpackage.a80.w(r6, r8, r7)
            float r7 = r7 * r4
            int r4 = java.lang.Math.round(r7)
            if (r4 == r3) goto L43
            r6.finish()
            goto L43
        L64:
            r0.v = r2
            int[] r10 = r0.t
            r2 = 1
            r3 = 0
            r10[r2] = r3
            r11 = 0
            iw r7 = r0.y
            r8 = 0
            r12 = 1
            r7.c(r8, r9, r10, r11, r12)
            r17 = r10
            r4 = r17[r2]
            int r9 = r9 - r4
            int r4 = r0.getScrollRange()
            if (r9 == 0) goto La3
            int r7 = r0.getScrollY()
            int r8 = r0.getScrollX()
            r0.q(r9, r8, r7, r4)
            int r8 = r0.getScrollY()
            int r12 = r8 - r7
            int r14 = r9 - r12
            r17[r2] = r3
            r13 = 0
            iw r10 = r0.y
            r11 = 0
            int[] r15 = r0.s
            r16 = 1
            r10.d(r11, r12, r13, r14, r15, r16, r17)
            r3 = r17[r2]
            int r9 = r14 - r3
        La3:
            if (r9 == 0) goto Ld4
            int r3 = r0.getOverScrollMode()
            if (r3 == 0) goto Laf
            if (r3 != r2) goto Lce
            if (r4 <= 0) goto Lce
        Laf:
            if (r9 >= 0) goto Lc0
            boolean r3 = r5.isFinished()
            if (r3 == 0) goto Lce
            float r3 = r1.getCurrVelocity()
            int r3 = (int) r3
            r5.onAbsorb(r3)
            goto Lce
        Lc0:
            boolean r3 = r6.isFinished()
            if (r3 == 0) goto Lce
            float r3 = r1.getCurrVelocity()
            int r3 = (int) r3
            r6.onAbsorb(r3)
        Lce:
            r1.abortAnimation()
            r0.v(r2)
        Ld4:
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Le0
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.s90.k(r0)
            return
        Le0:
            r0.v(r2)
            return
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
            r1 = this;
            int r0 = super.computeVerticalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
            r2 = this;
            r0 = 0
            int r1 = super.computeVerticalScrollOffset()
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            int r1 = r4.getHeight()
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            if (r0 != 0) goto L15
            return r1
        L15:
            r0 = 0
            android.view.View r2 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r2.getBottom()
            int r3 = r3.bottomMargin
            int r2 = r2 + r3
            int r3 = r4.getScrollY()
            int r1 = r2 - r1
            int r0 = java.lang.Math.max(r0, r1)
            if (r3 >= 0) goto L35
            int r2 = r2 - r3
            return r2
        L35:
            if (r3 <= r0) goto L3a
            int r3 = r3 - r0
            int r3 = r3 + r2
            return r3
        L3a:
            return r2
    }

    @Override // defpackage.kw
    public final void d(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.o(r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            if (r0 != 0) goto Lf
            boolean r2 = r1.j(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            iw r0 = r1.y
            boolean r2 = r0.a(r2, r3, r4)
            return r2
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            iw r0 = r1.y
            boolean r2 = r0.b(r2, r3)
            return r2
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            r5 = 0
            iw r0 = r6.y
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r7 = r0.c(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
            r8 = this;
            r6 = 0
            r7 = 0
            iw r0 = r8.y
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            boolean r9 = r0.d(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r11) {
            r10 = this;
            super.draw(r11)
            int r0 = r10.getScrollY()
            android.widget.EdgeEffect r1 = r10.e
            boolean r2 = r1.isFinished()
            r3 = 0
            if (r2 != 0) goto L61
            int r2 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = java.lang.Math.min(r3, r0)
            boolean r7 = defpackage.fw.a(r10)
            if (r7 == 0) goto L35
            int r7 = r10.getPaddingLeft()
            int r8 = r10.getPaddingRight()
            int r8 = r8 + r7
            int r4 = r4 - r8
            int r7 = r10.getPaddingLeft()
            goto L36
        L35:
            r7 = r3
        L36:
            boolean r8 = defpackage.fw.a(r10)
            if (r8 == 0) goto L4b
            int r8 = r10.getPaddingTop()
            int r9 = r10.getPaddingBottom()
            int r9 = r9 + r8
            int r5 = r5 - r9
            int r8 = r10.getPaddingTop()
            int r6 = r6 + r8
        L4b:
            float r7 = (float) r7
            float r6 = (float) r6
            r11.translate(r7, r6)
            r1.setSize(r4, r5)
            boolean r1 = r1.draw(r11)
            if (r1 == 0) goto L5e
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.s90.k(r10)
        L5e:
            r11.restoreToCount(r2)
        L61:
            android.widget.EdgeEffect r1 = r10.f
            boolean r2 = r1.isFinished()
            if (r2 != 0) goto Lc5
            int r2 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = r10.getScrollRange()
            int r0 = java.lang.Math.max(r6, r0)
            int r0 = r0 + r5
            boolean r6 = defpackage.fw.a(r10)
            if (r6 == 0) goto L92
            int r3 = r10.getPaddingLeft()
            int r6 = r10.getPaddingRight()
            int r6 = r6 + r3
            int r4 = r4 - r6
            int r3 = r10.getPaddingLeft()
        L92:
            boolean r6 = defpackage.fw.a(r10)
            if (r6 == 0) goto La7
            int r6 = r10.getPaddingTop()
            int r7 = r10.getPaddingBottom()
            int r7 = r7 + r6
            int r5 = r5 - r7
            int r6 = r10.getPaddingBottom()
            int r0 = r0 - r6
        La7:
            int r3 = r3 - r4
            float r3 = (float) r3
            float r0 = (float) r0
            r11.translate(r3, r0)
            float r0 = (float) r4
            r3 = 0
            r6 = 1127481344(0x43340000, float:180.0)
            r11.rotate(r6, r0, r3)
            r1.setSize(r4, r5)
            boolean r0 = r1.draw(r11)
            if (r0 == 0) goto Lc2
            java.util.WeakHashMap r0 = defpackage.ja0.a
            defpackage.s90.k(r10)
        Lc2:
            r11.restoreToCount(r2)
        Lc5:
            return
    }

    @Override // defpackage.jw
    public final void e(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r1 = 0
            r0.o(r5, r6, r1)
            return
    }

    @Override // defpackage.jw
    public final boolean f(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public final boolean g(int r8) {
            r7 = this;
            android.view.View r0 = r7.findFocus()
            if (r0 != r7) goto L7
            r0 = 0
        L7:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            int r2 = r7.getMaxScrollAmount()
            r3 = 0
            if (r1 == 0) goto L33
            int r4 = r7.getHeight()
            boolean r4 = r7.n(r1, r2, r4)
            if (r4 == 0) goto L33
            android.graphics.Rect r2 = r7.c
            r1.getDrawingRect(r2)
            r7.offsetDescendantRectToMyCoords(r1, r2)
            int r2 = r7.h(r2)
            r7.i(r2)
            r1.requestFocus(r8)
            goto L7a
        L33:
            r1 = 33
            r4 = 130(0x82, float:1.82E-43)
            if (r8 != r1) goto L44
            int r1 = r7.getScrollY()
            if (r1 >= r2) goto L44
            int r2 = r7.getScrollY()
            goto L70
        L44:
            if (r8 != r4) goto L70
            int r1 = r7.getChildCount()
            if (r1 <= 0) goto L70
            android.view.View r1 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            int r1 = r1.getBottom()
            int r5 = r5.bottomMargin
            int r1 = r1 + r5
            int r5 = r7.getScrollY()
            int r6 = r7.getHeight()
            int r6 = r6 + r5
            int r5 = r7.getPaddingBottom()
            int r6 = r6 - r5
            int r1 = r1 - r6
            int r2 = java.lang.Math.min(r1, r2)
        L70:
            if (r2 != 0) goto L73
            return r3
        L73:
            if (r8 != r4) goto L76
            goto L77
        L76:
            int r2 = -r2
        L77:
            r7.i(r2)
        L7a:
            if (r0 == 0) goto L9b
            boolean r8 = r0.isFocused()
            if (r8 == 0) goto L9b
            int r8 = r7.getHeight()
            boolean r8 = r7.n(r0, r3, r8)
            if (r8 != 0) goto L9b
            int r8 = r7.getDescendantFocusability()
            r0 = 131072(0x20000, float:1.83671E-40)
            r7.setDescendantFocusability(r0)
            r7.requestFocus()
            r7.setDescendantFocusability(r8)
        L9b:
            r8 = 1
            return r8
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
            r5 = this;
            int r0 = r5.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 0
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r5.getVerticalFadingEdgeLength()
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getScrollY()
            int r0 = r0 - r1
            int r0 = r0 - r3
            if (r0 >= r2) goto L33
            float r0 = (float) r0
            float r1 = (float) r2
            float r0 = r0 / r1
            return r0
        L33:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    public int getMaxScrollAmount() {
            r2 = this;
            int r0 = r2.getHeight()
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r2 = this;
            lw r0 = r2.x
            int r1 = r0.a
            int r0 = r0.b
            r0 = r0 | r1
            return r0
    }

    public int getScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2f
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r4.getHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L2f:
            return r1
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r2.getVerticalFadingEdgeLength()
            int r1 = r2.getScrollY()
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            return r1
        L16:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    public final int h(android.graphics.Rect r11) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r10.getHeight()
            int r2 = r10.getScrollY()
            int r3 = r2 + r0
            int r4 = r10.getVerticalFadingEdgeLength()
            int r5 = r11.top
            if (r5 <= 0) goto L1b
            int r2 = r2 + r4
        L1b:
            android.view.View r5 = r10.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r7 = r11.bottom
            int r8 = r5.getHeight()
            int r9 = r6.topMargin
            int r8 = r8 + r9
            int r9 = r6.bottomMargin
            int r8 = r8 + r9
            if (r7 >= r8) goto L36
            int r4 = r3 - r4
            goto L37
        L36:
            r4 = r3
        L37:
            int r7 = r11.bottom
            if (r7 <= r4) goto L59
            int r8 = r11.top
            if (r8 <= r2) goto L59
            int r1 = r11.height()
            if (r1 <= r0) goto L49
            int r11 = r11.top
            int r11 = r11 - r2
            goto L4c
        L49:
            int r11 = r11.bottom
            int r11 = r11 - r4
        L4c:
            int r0 = r5.getBottom()
            int r1 = r6.bottomMargin
            int r0 = r0 + r1
            int r0 = r0 - r3
            int r11 = java.lang.Math.min(r11, r0)
            return r11
        L59:
            int r3 = r11.top
            if (r3 >= r2) goto L78
            if (r7 >= r4) goto L78
            int r3 = r11.height()
            if (r3 <= r0) goto L6a
            int r11 = r11.bottom
            int r4 = r4 - r11
            int r1 = r1 - r4
            goto L6e
        L6a:
            int r11 = r11.top
            int r2 = r2 - r11
            int r1 = r1 - r2
        L6e:
            int r11 = r10.getScrollY()
            int r11 = -r11
            int r11 = java.lang.Math.max(r1, r11)
            return r11
        L78:
            return r1
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
            r2 = this;
            r0 = 0
            iw r1 = r2.y
            boolean r0 = r1.f(r0)
            return r0
    }

    public final void i(int r3) {
            r2 = this;
            if (r3 == 0) goto Le
            boolean r0 = r2.n
            r1 = 0
            if (r0 == 0) goto Lb
            r2.t(r1, r3, r1)
            return
        Lb:
            r2.scrollBy(r1, r3)
        Le:
            return
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
            r1 = this;
            iw r0 = r1.y
            boolean r0 = r0.d
            return r0
    }

    public final boolean j(android.view.KeyEvent r8) {
            r7 = this;
            android.graphics.Rect r0 = r7.c
            r0.setEmpty()
            int r1 = r7.getChildCount()
            r2 = 1
            r3 = 130(0x82, float:1.82E-43)
            r4 = 0
            if (r1 <= 0) goto Lc2
            android.view.View r1 = r7.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            int r1 = r1.getHeight()
            int r6 = r5.topMargin
            int r1 = r1 + r6
            int r5 = r5.bottomMargin
            int r1 = r1 + r5
            int r5 = r7.getHeight()
            int r6 = r7.getPaddingTop()
            int r5 = r5 - r6
            int r6 = r7.getPaddingBottom()
            int r5 = r5 - r6
            if (r1 <= r5) goto Lc2
            int r1 = r8.getAction()
            if (r1 != 0) goto Lc1
            int r1 = r8.getKeyCode()
            r5 = 19
            r6 = 33
            if (r1 == r5) goto Lb1
            r5 = 20
            if (r1 == r5) goto La1
            r5 = 62
            if (r1 == r5) goto L4d
            goto Lc1
        L4d:
            boolean r8 = r8.isShiftPressed()
            if (r8 == 0) goto L54
            goto L55
        L54:
            r6 = r3
        L55:
            if (r6 != r3) goto L59
            r8 = r2
            goto L5a
        L59:
            r8 = r4
        L5a:
            int r1 = r7.getHeight()
            if (r8 == 0) goto L8d
            int r8 = r7.getScrollY()
            int r8 = r8 + r1
            r0.top = r8
            int r8 = r7.getChildCount()
            if (r8 <= 0) goto L98
            int r8 = r8 - r2
            android.view.View r8 = r7.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r8 = r8.getBottom()
            int r2 = r2.bottomMargin
            int r8 = r8 + r2
            int r2 = r7.getPaddingBottom()
            int r2 = r2 + r8
            int r8 = r0.top
            int r8 = r8 + r1
            if (r8 <= r2) goto L98
            int r2 = r2 - r1
            r0.top = r2
            goto L98
        L8d:
            int r8 = r7.getScrollY()
            int r8 = r8 - r1
            r0.top = r8
            if (r8 >= 0) goto L98
            r0.top = r4
        L98:
            int r8 = r0.top
            int r1 = r1 + r8
            r0.bottom = r1
            r7.r(r6, r8, r1)
            return r4
        La1:
            boolean r8 = r8.isAltPressed()
            if (r8 != 0) goto Lac
            boolean r8 = r7.g(r3)
            return r8
        Lac:
            boolean r8 = r7.l(r3)
            return r8
        Lb1:
            boolean r8 = r8.isAltPressed()
            if (r8 != 0) goto Lbc
            boolean r8 = r7.g(r6)
            return r8
        Lbc:
            boolean r8 = r7.l(r6)
            return r8
        Lc1:
            return r4
        Lc2:
            boolean r0 = r7.isFocused()
            if (r0 == 0) goto Le9
            int r8 = r8.getKeyCode()
            r0 = 4
            if (r8 == r0) goto Le9
            android.view.View r8 = r7.findFocus()
            if (r8 != r7) goto Ld6
            r8 = 0
        Ld6:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r8 = r0.findNextFocus(r7, r8, r3)
            if (r8 == 0) goto Le9
            if (r8 == r7) goto Le9
            boolean r8 = r8.requestFocus(r3)
            if (r8 == 0) goto Le9
            return r2
        Le9:
            return r4
    }

    public final void k(int r13) {
            r12 = this;
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L30
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            r10 = 0
            r11 = 0
            android.widget.OverScroller r1 = r12.d
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r5 = r13
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = 2
            iw r0 = r12.y
            r1 = 1
            r0.g(r13, r1)
            int r13 = r12.getScrollY()
            r12.v = r13
            java.util.WeakHashMap r13 = defpackage.ja0.a
            defpackage.s90.k(r12)
        L30:
            return
    }

    public final boolean l(int r6) {
            r5 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            int r3 = r5.getHeight()
            android.graphics.Rect r4 = r5.c
            r4.top = r1
            r4.bottom = r3
            if (r0 == 0) goto L37
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L37
            int r0 = r0 - r2
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r1 = r1 + r0
            r4.bottom = r1
            int r1 = r1 - r3
            r4.top = r1
        L37:
            int r0 = r4.top
            int r1 = r4.bottom
            boolean r6 = r5.r(r6, r0, r1)
            return r6
    }

    @Override // android.view.ViewGroup
    public final void measureChild(android.view.View r3, int r4, int r5) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r1 = r1 + r0
            int r5 = r5.width
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r4, r1, r5)
            r5 = 0
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r3.measure(r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r0 = r0 + r6
            int r6 = r5.leftMargin
            int r0 = r0 + r6
            int r6 = r5.rightMargin
            int r0 = r0 + r6
            int r0 = r0 + r4
            int r4 = r5.width
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r3, r0, r4)
            int r4 = r5.topMargin
            int r5 = r5.bottomMargin
            int r4 = r4 + r5
            r5 = 0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            r2.measure(r3, r4)
            return
    }

    public final boolean n(android.view.View r3, int r4, int r5) {
            r2 = this;
            android.graphics.Rect r0 = r2.c
            r3.getDrawingRect(r0)
            r2.offsetDescendantRectToMyCoords(r3, r0)
            int r3 = r0.bottom
            int r3 = r3 + r4
            int r1 = r2.getScrollY()
            if (r3 < r1) goto L1d
            int r3 = r0.top
            int r3 = r3 - r4
            int r4 = r2.getScrollY()
            int r4 = r4 + r5
            if (r3 > r4) goto L1d
            r3 = 1
            return r3
        L1d:
            r3 = 0
            return r3
    }

    public final void o(int r11, int r12, int[] r13) {
            r10 = this;
            int r0 = r10.getScrollY()
            r1 = 0
            r10.scrollBy(r1, r11)
            int r1 = r10.getScrollY()
            int r4 = r1 - r0
            if (r13 == 0) goto L16
            r0 = 1
            r1 = r13[r0]
            int r1 = r1 + r4
            r13[r0] = r1
        L16:
            int r6 = r11 - r4
            r5 = 0
            r7 = 0
            iw r2 = r10.y
            r3 = 0
            r8 = r12
            r9 = r13
            r2.d(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            r1.i = r0
            return
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent r9) {
            r8 = this;
            int r0 = r9.getAction()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto Lac
            boolean r0 = r8.k
            if (r0 != 0) goto Lac
            r0 = 2
            boolean r0 = defpackage.zt.B(r9, r0)
            r1 = 0
            if (r0 == 0) goto L1c
            r0 = 9
            float r0 = r9.getAxisValue(r0)
            goto L2c
        L1c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = defpackage.zt.B(r9, r0)
            if (r0 == 0) goto L2b
            r0 = 26
            float r0 = r9.getAxisValue(r0)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto Lac
            float r1 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r1
            int r0 = (int) r0
            int r1 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L72
            int r1 = r8.getOverScrollMode()
            if (r1 == 0) goto L55
            if (r1 != r6) goto L70
            int r1 = r8.getScrollRange()
            if (r1 <= 0) goto L70
        L55:
            boolean r9 = defpackage.zt.B(r9, r5)
            if (r9 != 0) goto L70
            float r9 = (float) r0
            float r9 = -r9
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            android.widget.EdgeEffect r0 = r8.e
            defpackage.a80.w(r0, r9, r4)
            r0.onRelease()
            r8.invalidate()
            r9 = r6
            goto La1
        L70:
            r9 = r2
            goto La1
        L72:
            if (r0 <= r1) goto L9f
            int r7 = r8.getOverScrollMode()
            if (r7 == 0) goto L82
            if (r7 != r6) goto L9c
            int r7 = r8.getScrollRange()
            if (r7 <= 0) goto L9c
        L82:
            boolean r9 = defpackage.zt.B(r9, r5)
            if (r9 != 0) goto L9c
            int r0 = r0 - r1
            float r9 = (float) r0
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            android.widget.EdgeEffect r0 = r8.f
            defpackage.a80.w(r0, r9, r4)
            r0.onRelease()
            r8.invalidate()
            r2 = r6
        L9c:
            r9 = r2
            r2 = r1
            goto La1
        L9f:
            r9 = r2
            r2 = r0
        La1:
            if (r2 == r3) goto Lab
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r2)
            return r6
        Lab:
            return r9
        Lac:
            return r2
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
            r12 = this;
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto Ld
            boolean r3 = r12.k
            if (r3 == 0) goto Ld
            return r1
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto Lb1
            r5 = -1
            if (r0 == r1) goto L83
            if (r0 == r2) goto L25
            r1 = 3
            if (r0 == r1) goto L83
            r1 = 6
            if (r0 == r1) goto L20
            goto L132
        L20:
            r12.p(r13)
            goto L132
        L25:
            int r0 = r12.r
            if (r0 != r5) goto L2b
            goto L132
        L2b:
            int r3 = r13.findPointerIndex(r0)
            if (r3 != r5) goto L4b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid pointerId="
            r13.<init>(r1)
            r13.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r13)
            goto L132
        L4b:
            float r0 = r13.getY(r3)
            int r0 = (int) r0
            int r3 = r12.g
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.o
            if (r3 <= r5) goto L132
            int r3 = r12.getNestedScrollAxes()
            r2 = r2 & r3
            if (r2 != 0) goto L132
            r12.k = r1
            r12.g = r0
            android.view.VelocityTracker r0 = r12.l
            if (r0 != 0) goto L71
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.l = r0
        L71:
            android.view.VelocityTracker r0 = r12.l
            r0.addMovement(r13)
            r12.u = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L132
            r13.requestDisallowInterceptTouchEvent(r1)
            goto L132
        L83:
            r12.k = r4
            r12.r = r5
            android.view.VelocityTracker r13 = r12.l
            if (r13 == 0) goto L90
            r13.recycle()
            r12.l = r3
        L90:
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r10 = 0
            int r11 = r12.getScrollRange()
            android.widget.OverScroller r5 = r12.d
            r8 = 0
            r9 = 0
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto Lac
            java.util.WeakHashMap r13 = defpackage.ja0.a
            defpackage.s90.k(r12)
        Lac:
            r12.v(r4)
            goto L132
        Lb1:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            android.widget.OverScroller r7 = r12.d
            if (r6 <= 0) goto L119
            int r6 = r12.getScrollY()
            android.view.View r8 = r12.getChildAt(r4)
            int r9 = r8.getTop()
            int r9 = r9 - r6
            if (r0 < r9) goto L119
            int r9 = r8.getBottom()
            int r9 = r9 - r6
            if (r0 >= r9) goto L119
            int r6 = r8.getLeft()
            if (r5 < r6) goto L119
            int r6 = r8.getRight()
            if (r5 >= r6) goto L119
            r12.g = r0
            int r0 = r13.getPointerId(r4)
            r12.r = r0
            android.view.VelocityTracker r0 = r12.l
            if (r0 != 0) goto Lf8
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.l = r0
            goto Lfb
        Lf8:
            r0.clear()
        Lfb:
            android.view.VelocityTracker r0 = r12.l
            r0.addMovement(r13)
            r7.computeScrollOffset()
            boolean r13 = r12.u(r13)
            if (r13 != 0) goto L111
            boolean r13 = r7.isFinished()
            if (r13 != 0) goto L110
            goto L111
        L110:
            r1 = r4
        L111:
            r12.k = r1
            iw r13 = r12.y
            r13.g(r2, r4)
            goto L132
        L119:
            boolean r13 = r12.u(r13)
            if (r13 != 0) goto L127
            boolean r13 = r7.isFinished()
            if (r13 != 0) goto L126
            goto L127
        L126:
            r1 = r4
        L127:
            r12.k = r1
            android.view.VelocityTracker r13 = r12.l
            if (r13 == 0) goto L132
            r13.recycle()
            r12.l = r3
        L132:
            boolean r13 = r12.k
            return r13
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            r3 = r2
            r4 = 0
            r3.h = r4
            android.view.View r6 = r3.j
            if (r6 == 0) goto L24
            boolean r6 = m(r6, r2)
            if (r6 == 0) goto L24
            android.view.View r6 = r3.j
            android.graphics.Rect r0 = r3.c
            r6.getDrawingRect(r0)
            r2.offsetDescendantRectToMyCoords(r6, r0)
            int r6 = r2.h(r0)
            if (r6 == 0) goto L24
            r2.scrollBy(r4, r6)
        L24:
            r6 = 0
            r3.j = r6
            boolean r0 = r3.i
            if (r0 != 0) goto L7d
            hw r0 = r3.w
            if (r0 == 0) goto L3c
            int r0 = r2.getScrollX()
            hw r1 = r3.w
            int r1 = r1.a
            r2.scrollTo(r0, r1)
            r3.w = r6
        L3c:
            int r6 = r2.getChildCount()
            if (r6 <= 0) goto L57
            android.view.View r6 = r2.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r6 = r6.getMeasuredHeight()
            int r1 = r0.topMargin
            int r6 = r6 + r1
            int r0 = r0.bottomMargin
            int r6 = r6 + r0
            goto L58
        L57:
            r6 = r4
        L58:
            int r7 = r7 - r5
            int r5 = r2.getPaddingTop()
            int r7 = r7 - r5
            int r5 = r2.getPaddingBottom()
            int r7 = r7 - r5
            int r5 = r2.getScrollY()
            if (r7 >= r6) goto L74
            if (r5 >= 0) goto L6c
            goto L74
        L6c:
            int r4 = r7 + r5
            if (r4 <= r6) goto L73
            int r4 = r6 - r7
            goto L74
        L73:
            r4 = r5
        L74:
            if (r4 == r5) goto L7d
            int r5 = r2.getScrollX()
            r2.scrollTo(r5, r4)
        L7d:
            int r4 = r2.getScrollX()
            int r5 = r2.getScrollY()
            r2.scrollTo(r4, r5)
            r4 = 1
            r3.i = r4
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r0 = r4.m
            if (r0 != 0) goto L8
            goto L58
        L8:
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            if (r6 != 0) goto Lf
            goto L58
        Lf:
            int r6 = r4.getChildCount()
            if (r6 <= 0) goto L58
            r6 = 0
            android.view.View r6 = r4.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r6.getMeasuredHeight()
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r0.topMargin
            int r2 = r2 - r3
            int r3 = r0.bottomMargin
            int r2 = r2 - r3
            if (r1 >= r2) goto L58
            int r1 = r4.getPaddingLeft()
            int r3 = r4.getPaddingRight()
            int r3 = r3 + r1
            int r1 = r0.leftMargin
            int r3 = r3 + r1
            int r1 = r0.rightMargin
            int r3 = r3 + r1
            int r0 = r0.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r3, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r6.measure(r5, r0)
        L58:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            if (r4 != 0) goto Lc
            r1 = 0
            r2 = 1
            r0.dispatchNestedFling(r1, r3, r2)
            int r1 = (int) r3
            r0.k(r1)
            return r2
        Lc:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            iw r1 = r0.y
            boolean r1 = r1.b(r2, r3)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r4 = 0
            iw r0 = r6.y
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r1 = 0
            r2 = 0
            r0.o(r5, r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.a(r2, r3, r4, r0)
            return
    }

    @Override // android.view.View
    public final void onOverScrolled(int r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            super.scrollTo(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r4, android.graphics.Rect r5) {
            r3 = this;
            r0 = 2
            if (r4 != r0) goto L6
            r4 = 130(0x82, float:1.82E-43)
            goto Lb
        L6:
            r0 = 1
            if (r4 != r0) goto Lb
            r4 = 33
        Lb:
            if (r5 != 0) goto L17
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            r1 = 0
            android.view.View r0 = r0.findNextFocus(r3, r1, r4)
            goto L1f
        L17:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r0.findNextFocusFromRect(r3, r5, r4)
        L1f:
            r1 = 0
            if (r0 != 0) goto L23
            goto L2d
        L23:
            int r2 = r3.getHeight()
            boolean r2 = r3.n(r0, r1, r2)
            if (r2 != 0) goto L2e
        L2d:
            return r1
        L2e:
            boolean r4 = r0.requestFocus(r4, r5)
            return r4
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.hw
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            hw r2 = (defpackage.hw) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            r1.w = r2
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            hw r1 = new hw
            r1.<init>(r0)
            int r0 = r2.getScrollY()
            r1.a = r0
            return r1
    }

    @Override // android.view.View
    public final void onScrollChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onScrollChanged(r1, r2, r3, r4)
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L22
            if (r0 != r1) goto Lc
            goto L22
        Lc:
            r2 = 0
            boolean r2 = r0.n(r1, r2, r4)
            if (r2 == 0) goto L22
            android.graphics.Rect r2 = r0.c
            r1.getDrawingRect(r2)
            r0.offsetDescendantRectToMyCoords(r1, r2)
            int r1 = r0.h(r2)
            r0.i(r1)
        L22:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.f(r2, r3, r4, r0)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.b(r2, r0)
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
            r27 = this;
            r0 = r27
            r1 = r28
            android.view.VelocityTracker r2 = r0.l
            if (r2 != 0) goto Le
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.l = r2
        Le:
            int r2 = r1.getActionMasked()
            r3 = 0
            if (r2 != 0) goto L17
            r0.u = r3
        L17:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r1)
            int r5 = r0.u
            float r5 = (float) r5
            r6 = 0
            r4.offsetLocation(r6, r5)
            iw r5 = r0.y
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L2c3
            r9 = 0
            r10 = -1
            android.widget.EdgeEffect r11 = r0.e
            android.widget.EdgeEffect r12 = r0.f
            if (r2 == r8) goto L230
            if (r2 == r7) goto La3
            r5 = 3
            if (r2 == r5) goto L62
            r3 = 5
            if (r2 == r3) goto L4f
            r3 = 6
            if (r2 == r3) goto L3d
            goto L2f7
        L3d:
            r27.p(r28)
            int r2 = r0.r
            int r2 = r1.findPointerIndex(r2)
            float r1 = r1.getY(r2)
            int r1 = (int) r1
            r0.g = r1
            goto L2f7
        L4f:
            int r2 = r1.getActionIndex()
            float r3 = r1.getY(r2)
            int r3 = (int) r3
            r0.g = r3
            int r1 = r1.getPointerId(r2)
            r0.r = r1
            goto L2f7
        L62:
            boolean r1 = r0.k
            if (r1 == 0) goto L8b
            int r1 = r0.getChildCount()
            if (r1 <= 0) goto L8b
            int r14 = r0.getScrollX()
            int r15 = r0.getScrollY()
            r18 = 0
            int r19 = r0.getScrollRange()
            android.widget.OverScroller r13 = r0.d
            r16 = 0
            r17 = 0
            boolean r1 = r13.springBack(r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L8b
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.s90.k(r0)
        L8b:
            r0.r = r10
            r0.k = r3
            android.view.VelocityTracker r1 = r0.l
            if (r1 == 0) goto L98
            r1.recycle()
            r0.l = r9
        L98:
            r0.v(r3)
            r11.onRelease()
            r12.onRelease()
            goto L2f7
        La3:
            int r2 = r0.r
            int r2 = r1.findPointerIndex(r2)
            if (r2 != r10) goto Lc7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid pointerId="
            r1.<init>(r2)
            int r2 = r0.r
            r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NestedScrollView"
            android.util.Log.e(r2, r1)
            goto L2f7
        Lc7:
            float r7 = r1.getY(r2)
            int r7 = (int) r7
            int r9 = r0.g
            int r9 = r9 - r7
            float r10 = r1.getX(r2)
            int r13 = r0.getWidth()
            float r13 = (float) r13
            float r10 = r10 / r13
            float r13 = (float) r9
            int r14 = r0.getHeight()
            float r14 = (float) r14
            float r13 = r13 / r14
            float r14 = defpackage.a80.k(r11)
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r14 == 0) goto Lfd
            float r13 = -r13
            float r10 = defpackage.a80.w(r11, r13, r10)
            float r10 = -r10
            float r13 = defpackage.a80.k(r11)
            int r6 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r6 != 0) goto Lfb
            r11.onRelease()
        Lfb:
            r6 = r10
            goto L117
        Lfd:
            float r14 = defpackage.a80.k(r12)
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 == 0) goto L117
            float r10 = r15 - r10
            float r10 = defpackage.a80.w(r12, r13, r10)
            float r13 = defpackage.a80.k(r12)
            int r6 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r6 != 0) goto Lfb
            r12.onRelease()
            goto Lfb
        L117:
            int r10 = r0.getHeight()
            float r10 = (float) r10
            float r6 = r6 * r10
            int r6 = java.lang.Math.round(r6)
            if (r6 == 0) goto L126
            r0.invalidate()
        L126:
            int r9 = r9 - r6
            boolean r6 = r0.k
            if (r6 != 0) goto L141
            int r6 = java.lang.Math.abs(r9)
            int r10 = r0.o
            if (r6 <= r10) goto L141
            android.view.ViewParent r6 = r0.getParent()
            if (r6 == 0) goto L13c
            r6.requestDisallowInterceptTouchEvent(r8)
        L13c:
            r0.k = r8
            if (r9 <= 0) goto L144
            int r9 = r9 - r10
        L141:
            r18 = r9
            goto L146
        L144:
            int r9 = r9 + r10
            goto L141
        L146:
            boolean r6 = r0.k
            if (r6 == 0) goto L2f7
            r21 = 0
            iw r6 = r0.y
            r17 = 0
            int[] r9 = r0.t
            int[] r10 = r0.s
            r16 = r6
            r19 = r9
            r20 = r10
            boolean r6 = r16.c(r17, r18, r19, r20, r21)
            int[] r9 = r0.t
            int[] r10 = r0.s
            if (r6 == 0) goto L16f
            r6 = r9[r8]
            int r18 = r18 - r6
            int r6 = r0.u
            r13 = r10[r8]
            int r6 = r6 + r13
            r0.u = r6
        L16f:
            r6 = r18
            r13 = r10[r8]
            int r7 = r7 - r13
            r0.g = r7
            int r7 = r0.getScrollY()
            int r13 = r0.getScrollRange()
            int r14 = r0.getOverScrollMode()
            if (r14 == 0) goto L18d
            if (r14 != r8) goto L189
            if (r13 <= 0) goto L189
            goto L18d
        L189:
            r14 = r3
        L18a:
            r16 = r15
            goto L18f
        L18d:
            r14 = r8
            goto L18a
        L18f:
            int r15 = r0.getScrollY()
            boolean r15 = r0.q(r6, r3, r15, r13)
            if (r15 == 0) goto L1a1
            boolean r5 = r5.f(r3)
            if (r5 != 0) goto L1a1
            r5 = r8
            goto L1a2
        L1a1:
            r5 = r3
        L1a2:
            int r15 = r0.getScrollY()
            int r21 = r15 - r7
            int r23 = r6 - r21
            r9[r8] = r3
            r22 = 0
            iw r15 = r0.y
            r20 = 0
            int[] r3 = r0.s
            r25 = 0
            r24 = r3
            r26 = r9
            r19 = r15
            r19.d(r20, r21, r22, r23, r24, r25, r26)
            int r3 = r0.g
            r9 = r10[r8]
            int r3 = r3 - r9
            r0.g = r3
            int r3 = r0.u
            int r3 = r3 + r9
            r0.u = r3
            if (r14 == 0) goto L226
            r3 = r26[r8]
            int r6 = r6 - r3
            int r7 = r7 + r6
            if (r7 >= 0) goto L1f2
            int r3 = -r6
            float r3 = (float) r3
            int r6 = r0.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            float r1 = r1.getX(r2)
            int r2 = r0.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            defpackage.a80.w(r11, r3, r1)
            boolean r1 = r12.isFinished()
            if (r1 != 0) goto L213
            r12.onRelease()
            goto L213
        L1f2:
            if (r7 <= r13) goto L213
            float r3 = (float) r6
            int r6 = r0.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            float r1 = r1.getX(r2)
            int r2 = r0.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r15 = r16 - r1
            defpackage.a80.w(r12, r3, r15)
            boolean r1 = r11.isFinished()
            if (r1 != 0) goto L213
            r11.onRelease()
        L213:
            boolean r1 = r11.isFinished()
            if (r1 == 0) goto L21f
            boolean r1 = r12.isFinished()
            if (r1 != 0) goto L226
        L21f:
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.s90.k(r0)
            r3 = 0
            goto L227
        L226:
            r3 = r5
        L227:
            if (r3 == 0) goto L2f7
            android.view.VelocityTracker r1 = r0.l
            r1.clear()
            goto L2f7
        L230:
            android.view.VelocityTracker r1 = r0.l
            int r2 = r0.q
            float r2 = (float) r2
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3, r2)
            int r2 = r0.r
            float r1 = r1.getYVelocity(r2)
            int r1 = (int) r1
            int r2 = java.lang.Math.abs(r1)
            int r3 = r0.p
            if (r2 < r3) goto L28a
            float r2 = defpackage.a80.k(r11)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L261
            boolean r2 = r0.s(r11, r1)
            if (r2 == 0) goto L25c
            r11.onAbsorb(r1)
        L25a:
            r2 = r8
            goto L279
        L25c:
            int r2 = -r1
            r0.k(r2)
            goto L25a
        L261:
            float r2 = defpackage.a80.k(r12)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L278
            int r2 = -r1
            boolean r3 = r0.s(r12, r2)
            if (r3 == 0) goto L274
            r12.onAbsorb(r2)
            goto L25a
        L274:
            r0.k(r2)
            goto L25a
        L278:
            r2 = 0
        L279:
            if (r2 != 0) goto L2ab
            int r1 = -r1
            float r2 = (float) r1
            boolean r3 = r5.b(r6, r2)
            if (r3 != 0) goto L2ab
            r0.dispatchNestedFling(r6, r2, r8)
            r0.k(r1)
            goto L2ab
        L28a:
            int r19 = r0.getScrollX()
            int r20 = r0.getScrollY()
            r23 = 0
            int r24 = r0.getScrollRange()
            android.widget.OverScroller r1 = r0.d
            r21 = 0
            r22 = 0
            r18 = r1
            boolean r1 = r18.springBack(r19, r20, r21, r22, r23, r24)
            if (r1 == 0) goto L2ab
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.s90.k(r0)
        L2ab:
            r0.r = r10
            r2 = 0
            r0.k = r2
            android.view.VelocityTracker r1 = r0.l
            if (r1 == 0) goto L2b9
            r1.recycle()
            r0.l = r9
        L2b9:
            r0.v(r2)
            r11.onRelease()
            r12.onRelease()
            goto L2f7
        L2c3:
            r2 = r3
            int r3 = r0.getChildCount()
            if (r3 != 0) goto L2cb
            return r2
        L2cb:
            boolean r2 = r0.k
            if (r2 == 0) goto L2d8
            android.view.ViewParent r2 = r0.getParent()
            if (r2 == 0) goto L2d8
            r2.requestDisallowInterceptTouchEvent(r8)
        L2d8:
            android.widget.OverScroller r2 = r0.d
            boolean r3 = r2.isFinished()
            if (r3 != 0) goto L2e6
            r2.abortAnimation()
            r0.v(r8)
        L2e6:
            float r2 = r1.getY()
            int r2 = (int) r2
            r0.g = r2
            r2 = 0
            int r1 = r1.getPointerId(r2)
            r0.r = r1
            r5.g(r7, r2)
        L2f7:
            android.view.VelocityTracker r1 = r0.l
            if (r1 == 0) goto L2fe
            r1.addMovement(r4)
        L2fe:
            r4.recycle()
            return r8
    }

    public final void p(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.r
            if (r1 != r2) goto L25
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            float r1 = r4.getY(r0)
            int r1 = (int) r1
            r3.g = r1
            int r4 = r4.getPointerId(r0)
            r3.r = r4
            android.view.VelocityTracker r4 = r3.l
            if (r4 == 0) goto L25
            r4.clear()
        L25:
            return
    }

    public final boolean q(int r10, int r11, int r12, int r13) {
            r9 = this;
            int r0 = r9.getOverScrollMode()
            super.computeHorizontalScrollRange()
            super.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            super.computeVerticalScrollExtent()
            r1 = 1
            int r12 = r12 + r10
            r10 = 0
            if (r11 <= 0) goto L18
        L15:
            r3 = r10
            r11 = r1
            goto L1d
        L18:
            if (r11 >= 0) goto L1b
            goto L15
        L1b:
            r3 = r11
            r11 = r10
        L1d:
            if (r12 <= r13) goto L22
            r4 = r13
        L20:
            r12 = r1
            goto L28
        L22:
            if (r12 >= 0) goto L26
            r4 = r10
            goto L20
        L26:
            r4 = r12
            r12 = r10
        L28:
            if (r12 == 0) goto L3e
            iw r13 = r9.y
            boolean r13 = r13.f(r1)
            if (r13 != 0) goto L3e
            r7 = 0
            int r8 = r9.getScrollRange()
            android.widget.OverScroller r2 = r9.d
            r5 = 0
            r6 = 0
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L3e:
            super.scrollTo(r3, r4)
            if (r11 != 0) goto L47
            if (r12 == 0) goto L46
            goto L47
        L46:
            return r10
        L47:
            return r1
    }

    public final boolean r(int r18, int r19, int r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r0.getHeight()
            int r5 = r0.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L7f
        L75:
            if (r6 == 0) goto L79
            int r2 = r2 - r5
            goto L7b
        L79:
            int r2 = r3 - r4
        L7b:
            r0.i(r2)
            r7 = 1
        L7f:
            android.view.View r2 = r0.findFocus()
            if (r11 == r2) goto L88
            r11.requestFocus(r1)
        L88:
            return r7
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View r3, android.view.View r4) {
            r2 = this;
            boolean r0 = r2.h
            if (r0 != 0) goto L17
            android.graphics.Rect r0 = r2.c
            r4.getDrawingRect(r0)
            r2.offsetDescendantRectToMyCoords(r4, r0)
            int r0 = r2.h(r0)
            if (r0 == 0) goto L19
            r1 = 0
            r2.scrollBy(r1, r0)
            goto L19
        L17:
            r2.j = r4
        L19:
            super.requestChildFocus(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View r3, android.graphics.Rect r4, boolean r5) {
            r2 = this;
            int r0 = r3.getLeft()
            int r1 = r3.getScrollX()
            int r0 = r0 - r1
            int r1 = r3.getTop()
            int r3 = r3.getScrollY()
            int r1 = r1 - r3
            r4.offset(r0, r1)
            int r3 = r2.h(r4)
            r4 = 0
            if (r3 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = r4
        L1f:
            if (r0 == 0) goto L2a
            if (r5 == 0) goto L27
            r2.scrollBy(r4, r3)
            return r0
        L27:
            r2.t(r4, r3, r4)
        L2a:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.view.VelocityTracker r0 = r1.l
            if (r0 == 0) goto Lc
            r0.recycle()
            r0 = 0
            r1.l = r0
        Lc:
            super.requestDisallowInterceptTouchEvent(r2)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r1 = this;
            r0 = 1
            r1.h = r0
            super.requestLayout()
            return
    }

    public final boolean s(android.widget.EdgeEffect r10, int r11) {
            r9 = this;
            r0 = 1
            if (r11 <= 0) goto L4
            return r0
        L4:
            float r10 = defpackage.a80.k(r10)
            int r1 = r9.getHeight()
            float r1 = (float) r1
            float r10 = r10 * r1
            int r11 = -r11
            int r11 = java.lang.Math.abs(r11)
            float r11 = (float) r11
            r1 = 1051931443(0x3eb33333, float:0.35)
            float r11 = r11 * r1
            r1 = 1014350479(0x3c75c28f, float:0.015)
            float r2 = r9.a
            float r2 = r2 * r1
            float r11 = r11 / r2
            double r3 = (double) r11
            double r3 = java.lang.Math.log(r3)
            float r11 = androidx.core.widget.NestedScrollView.A
            double r5 = (double) r11
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r5 - r7
            double r1 = (double) r2
            double r5 = r5 / r7
            double r5 = r5 * r3
            double r3 = java.lang.Math.exp(r5)
            double r3 = r3 * r1
            float r11 = (float) r3
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 >= 0) goto L39
            return r0
        L39:
            r10 = 0
            return r10
    }

    @Override // android.view.View
    public final void scrollTo(int r8, int r9) {
            r7 = this;
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L6a
            r0 = 0
            android.view.View r1 = r7.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r7.getWidth()
            int r4 = r7.getPaddingLeft()
            int r3 = r3 - r4
            int r4 = r7.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r1.getWidth()
            int r5 = r2.leftMargin
            int r4 = r4 + r5
            int r5 = r2.rightMargin
            int r4 = r4 + r5
            int r5 = r7.getHeight()
            int r6 = r7.getPaddingTop()
            int r5 = r5 - r6
            int r6 = r7.getPaddingBottom()
            int r5 = r5 - r6
            int r1 = r1.getHeight()
            int r6 = r2.topMargin
            int r1 = r1 + r6
            int r2 = r2.bottomMargin
            int r1 = r1 + r2
            if (r3 >= r4) goto L4d
            if (r8 >= 0) goto L46
            goto L4d
        L46:
            int r2 = r3 + r8
            if (r2 <= r4) goto L4e
            int r8 = r4 - r3
            goto L4e
        L4d:
            r8 = r0
        L4e:
            if (r5 >= r1) goto L5a
            if (r9 >= 0) goto L53
            goto L5a
        L53:
            int r0 = r5 + r9
            if (r0 <= r1) goto L5b
            int r9 = r1 - r5
            goto L5b
        L5a:
            r9 = r0
        L5b:
            int r0 = r7.getScrollX()
            if (r8 != r0) goto L67
            int r0 = r7.getScrollY()
            if (r9 == r0) goto L6a
        L67:
            super.scrollTo(r8, r9)
        L6a:
            return
    }

    public void setFillViewport(boolean r2) {
            r1 = this;
            boolean r0 = r1.m
            if (r2 == r0) goto L9
            r1.m = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r4) {
            r3 = this;
            iw r0 = r3.y
            boolean r1 = r0.d
            if (r1 == 0) goto Ld
            android.view.ViewGroup r1 = r0.c
            java.util.WeakHashMap r2 = defpackage.ja0.a
            defpackage.y90.z(r1)
        Ld:
            r0.d = r4
            return
    }

    public void setOnScrollChangeListener(defpackage.gw r1) {
            r0 = this;
            return
    }

    public void setSmoothScrollingEnabled(boolean r1) {
            r0 = this;
            r0.n = r1
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
            r2 = this;
            r0 = 0
            iw r1 = r2.y
            boolean r3 = r1.g(r3, r0)
            return r3
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
            r1 = this;
            r0 = 0
            r1.v(r0)
            return
    }

    public final void t(int r10, int r11, boolean r12) {
            r9 = this;
            int r0 = r9.getChildCount()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r9.b
            long r0 = r0 - r2
            r2 = 250(0xfa, double:1.235E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L70
            r10 = 0
            android.view.View r0 = r9.getChildAt(r10)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r9.getHeight()
            int r3 = r9.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r9.getPaddingBottom()
            int r2 = r2 - r3
            int r5 = r9.getScrollY()
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r10, r0)
            int r11 = r11 + r5
            int r11 = java.lang.Math.min(r11, r0)
            int r10 = java.lang.Math.max(r10, r11)
            int r7 = r10 - r5
            int r4 = r9.getScrollX()
            r6 = 0
            android.widget.OverScroller r3 = r9.d
            r8 = 250(0xfa, float:3.5E-43)
            r3.startScroll(r4, r5, r6, r7, r8)
            if (r12 == 0) goto L61
            r10 = 2
            iw r11 = r9.y
            r11.g(r10, r1)
            goto L64
        L61:
            r9.v(r1)
        L64:
            int r10 = r9.getScrollY()
            r9.v = r10
            java.util.WeakHashMap r10 = defpackage.ja0.a
            defpackage.s90.k(r9)
            goto L81
        L70:
            android.widget.OverScroller r12 = r9.d
            boolean r0 = r12.isFinished()
            if (r0 != 0) goto L7e
            r12.abortAnimation()
            r9.v(r1)
        L7e:
            r9.scrollBy(r10, r11)
        L81:
            long r10 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r9.b = r10
            return
    }

    public final boolean u(android.view.MotionEvent r6) {
            r5 = this;
            android.widget.EdgeEffect r0 = r5.e
            float r1 = defpackage.a80.k(r0)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            if (r1 == 0) goto L1b
            float r1 = r6.getX()
            int r4 = r5.getWidth()
            float r4 = (float) r4
            float r1 = r1 / r4
            defpackage.a80.w(r0, r2, r1)
            r0 = r3
            goto L1c
        L1b:
            r0 = 0
        L1c:
            android.widget.EdgeEffect r1 = r5.f
            float r4 = defpackage.a80.k(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L37
            float r6 = r6.getX()
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r6 = r6 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r6
            defpackage.a80.w(r1, r2, r0)
            return r3
        L37:
            return r0
    }

    public final void v(int r2) {
            r1 = this;
            iw r0 = r1.y
            r0.h(r2)
            return
    }
}
