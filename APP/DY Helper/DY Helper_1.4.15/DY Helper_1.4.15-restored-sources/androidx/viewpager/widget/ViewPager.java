package androidx.viewpager.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends android.view.ViewGroup {

    /* JADX INFO: renamed from: Ν */
    public static final int[] f1232 = null;

    /* JADX INFO: renamed from: Ξ */
    public static final p000.rl1 f1233 = null;

    /* JADX INFO: renamed from: Α */
    public android.view.VelocityTracker f1234;

    /* JADX INFO: renamed from: Β */
    public int f1235;

    /* JADX INFO: renamed from: Γ */
    public android.widget.EdgeEffect f1236;

    /* JADX INFO: renamed from: Δ */
    public android.widget.EdgeEffect f1237;

    /* JADX INFO: renamed from: Ε */
    public boolean f1238;

    /* JADX INFO: renamed from: Ζ */
    public boolean f1239;

    /* JADX INFO: renamed from: Η */
    public int f1240;

    /* JADX INFO: renamed from: Θ */
    public p000.v92 f1241;

    /* JADX INFO: renamed from: Ι */
    public p000.v92 f1242;

    /* JADX INFO: renamed from: Κ */
    public java.util.ArrayList f1243;

    /* JADX INFO: renamed from: Λ */
    public final p000.RunnableC0196d1 f1244;

    /* JADX INFO: renamed from: Μ */
    public int f1245;

    /* JADX INFO: renamed from: ε */
    public final java.util.ArrayList f1246;

    /* JADX INFO: renamed from: ζ */
    public final p000.t92 f1247;

    /* JADX INFO: renamed from: η */
    public final android.graphics.Rect f1248;

    /* JADX INFO: renamed from: θ */
    public android.widget.Scroller f1249;

    /* JADX INFO: renamed from: ι */
    public int f1250;

    /* JADX INFO: renamed from: κ */
    public android.graphics.drawable.Drawable f1251;

    /* JADX INFO: renamed from: λ */
    public final float f1252;

    /* JADX INFO: renamed from: μ */
    public final float f1253;

    /* JADX INFO: renamed from: ν */
    public int f1254;

    /* JADX INFO: renamed from: ξ */
    public boolean f1255;

    /* JADX INFO: renamed from: ο */
    public int f1256;

    /* JADX INFO: renamed from: π */
    public boolean f1257;

    /* JADX INFO: renamed from: ρ */
    public boolean f1258;

    /* JADX INFO: renamed from: σ */
    public int f1259;

    /* JADX INFO: renamed from: τ */
    public int f1260;

    /* JADX INFO: renamed from: υ */
    public int f1261;

    /* JADX INFO: renamed from: φ */
    public float f1262;

    /* JADX INFO: renamed from: χ */
    public float f1263;

    /* JADX INFO: renamed from: ψ */
    public float f1264;

    /* JADX INFO: renamed from: ω */
    public int f1265;

    static {
            r0 = 16842931(0x10100b3, float:2.369406E-38)
            int[] r0 = new int[]{r0}
            androidx.viewpager.widget.ViewPager.f1232 = r0
            rl1 r0 = new rl1
            r1 = 2
            r0.<init>(r1)
            androidx.viewpager.widget.ViewPager.f1233 = r0
            return
    }

    public ViewPager(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f1246 = r2
            t92 r2 = new t92
            r2.<init>()
            r1.f1247 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.f1248 = r2
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r1.f1252 = r2
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1.f1253 = r2
            r2 = 1
            r1.f1256 = r2
            r0 = -1
            r1.f1265 = r0
            r1.f1238 = r2
            d1 r2 = new d1
            r0 = 13
            r2.<init>(r0, r1)
            r1.f1244 = r2
            r2 = 0
            r1.f1245 = r2
            r1.m561()
            return
    }

    public ViewPager(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f1246 = r1
            t92 r1 = new t92
            r1.<init>()
            r0.f1247 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f1248 = r1
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r0.f1252 = r1
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r0.f1253 = r1
            r1 = 1
            r0.f1256 = r1
            r2 = -1
            r0.f1265 = r2
            r0.f1238 = r1
            d1 r1 = new d1
            r2 = 13
            r1.<init>(r2, r0)
            r0.f1244 = r1
            r1 = 0
            r0.f1245 = r1
            r0.m561()
            return
    }

    private int getClientWidth() {
            r2 = this;
            int r0 = r2.getMeasuredWidth()
            int r1 = r2.getPaddingLeft()
            int r0 = r0 - r1
            int r2 = r2.getPaddingRight()
            int r0 = r0 - r2
            return r0
    }

    private void setScrollingCacheEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1255
            if (r0 == r2) goto L6
            r1.f1255 = r2
        L6:
            return
    }

    /* JADX INFO: renamed from: β */
    public static boolean m556(int r9, int r10, int r11, android.view.View r12, boolean r13) {
            boolean r0 = r12 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L4b
            r0 = r12
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            int r4 = r0.getChildCount()
            int r4 = r4 - r1
        L15:
            if (r4 < 0) goto L4b
            android.view.View r5 = r0.getChildAt(r4)
            int r6 = r10 + r2
            int r7 = r5.getLeft()
            if (r6 < r7) goto L48
            int r7 = r5.getRight()
            if (r6 >= r7) goto L48
            int r7 = r11 + r3
            int r8 = r5.getTop()
            if (r7 < r8) goto L48
            int r8 = r5.getBottom()
            if (r7 >= r8) goto L48
            int r8 = r5.getLeft()
            int r6 = r6 - r8
            int r8 = r5.getTop()
            int r7 = r7 - r8
            boolean r5 = m556(r9, r6, r7, r5, r1)
            if (r5 == 0) goto L48
            goto L54
        L48:
            int r4 = r4 + (-1)
            goto L15
        L4b:
            if (r13 == 0) goto L55
            int r9 = -r9
            boolean r9 = r12.canScrollHorizontally(r9)
            if (r9 == 0) goto L55
        L54:
            return r1
        L55:
            r9 = 0
            return r9
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList r4, int r5, int r6) {
            r3 = this;
            int r5 = r4.size()
            int r0 = r3.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L23
            r1 = 0
        Ld:
            int r2 = r3.getChildCount()
            if (r1 >= r2) goto L23
            android.view.View r2 = r3.getChildAt(r1)
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L20
            r3.m560()
        L20:
            int r1 = r1 + 1
            goto Ld
        L23:
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 != r1) goto L2d
            int r0 = r4.size()
            if (r5 != r0) goto L44
        L2d:
            boolean r5 = r3.isFocusable()
            if (r5 != 0) goto L34
            goto L44
        L34:
            r5 = 1
            r6 = r6 & r5
            if (r6 != r5) goto L45
            boolean r5 = r3.isInTouchMode()
            if (r5 == 0) goto L45
            boolean r5 = r3.isFocusableInTouchMode()
            if (r5 != 0) goto L45
        L44:
            return
        L45:
            r4.add(r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(java.util.ArrayList r2) {
            r1 = this;
            r2 = 0
        L1:
            int r0 = r1.getChildCount()
            if (r2 >= r0) goto L17
            android.view.View r0 = r1.getChildAt(r2)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L14
            r1.m560()
        L14:
            int r2 = r2 + 1
            goto L1
        L17:
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r5, int r6, android.view.ViewGroup.LayoutParams r7) {
            r4 = this;
            boolean r0 = r4.checkLayoutParams(r7)
            if (r0 != 0) goto La
            android.view.ViewGroup$LayoutParams r7 = r4.generateDefaultLayoutParams()
        La:
            r0 = r7
            u92 r0 = (p000.u92) r0
            boolean r1 = r0.f10658
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<s92> r3 = p000.s92.class
            java.lang.annotation.Annotation r2 = r2.getAnnotation(r3)
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            r1 = r1 | r2
            r0.f10658 = r1
            super.addView(r5, r6, r7)
            return
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.u92
            if (r0 == 0) goto Lc
            boolean r1 = super.checkLayoutParams(r2)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public final void computeScroll() {
            r4 = this;
            android.widget.Scroller r0 = r4.f1249
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L40
            android.widget.Scroller r0 = r4.f1249
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L40
            int r0 = r4.getScrollX()
            int r1 = r4.getScrollY()
            android.widget.Scroller r2 = r4.f1249
            int r2 = r2.getCurrX()
            android.widget.Scroller r3 = r4.f1249
            int r3 = r3.getCurrY()
            if (r0 != r2) goto L28
            if (r1 == r3) goto L3a
        L28:
            r4.scrollTo(r2, r3)
            boolean r0 = r4.m563(r2)
            if (r0 != 0) goto L3a
            android.widget.Scroller r0 = r4.f1249
            r0.abortAnimation()
            r0 = 0
            r4.scrollTo(r0, r3)
        L3a:
            java.util.WeakHashMap r0 = p000.b92.f1572
            r4.postInvalidateOnAnimation()
            return
        L40:
            r0 = 1
            r4.m558(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L56
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L3c
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L45
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L3c
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r5 = r5.m557(r4)
            goto L52
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L3c
            boolean r5 = r5.m557(r1)
            goto L52
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L3e
        L3c:
            r5 = r2
            goto L52
        L3e:
            r6 = 66
            boolean r5 = r5.m557(r6)
            goto L52
        L45:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L4c
            goto L3c
        L4c:
            r6 = 17
            boolean r5 = r5.m557(r6)
        L52:
            if (r5 == 0) goto L55
            goto L56
        L55:
            return r2
        L56:
            return r1
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r4) {
            r3 = this;
            int r0 = r4.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto Ld
            boolean r3 = super.dispatchPopulateAccessibilityEvent(r4)
            return r3
        Ld:
            int r4 = r3.getChildCount()
            r0 = 0
            r1 = r0
        L13:
            if (r1 >= r4) goto L25
            android.view.View r2 = r3.getChildAt(r1)
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L22
            r3.m560()
        L22:
            int r1 = r1 + 1
            goto L13
        L25:
            return r0
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r8) {
            r7 = this;
            super.draw(r8)
            int r0 = r7.getOverScrollMode()
            android.widget.EdgeEffect r1 = r7.f1236
            r2 = 0
            if (r0 == 0) goto L16
            r1.finish()
            android.widget.EdgeEffect r8 = r7.f1237
            r8.finish()
            goto L96
        L16:
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L53
            int r0 = r8.save()
            int r1 = r7.getHeight()
            int r2 = r7.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r7.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r7.getWidth()
            r3 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r3)
            int r3 = -r1
            int r4 = r7.getPaddingTop()
            int r4 = r4 + r3
            float r3 = (float) r4
            float r4 = r7.f1252
            float r5 = (float) r2
            float r4 = r4 * r5
            r8.translate(r3, r4)
            android.widget.EdgeEffect r3 = r7.f1236
            r3.setSize(r1, r2)
            android.widget.EdgeEffect r1 = r7.f1236
            boolean r2 = r1.draw(r8)
            r8.restoreToCount(r0)
        L53:
            android.widget.EdgeEffect r0 = r7.f1237
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L96
            int r0 = r8.save()
            int r1 = r7.getWidth()
            int r3 = r7.getHeight()
            int r4 = r7.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r7.getPaddingBottom()
            int r3 = r3 - r4
            r4 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r4)
            int r4 = r7.getPaddingTop()
            int r4 = -r4
            float r4 = (float) r4
            float r5 = r7.f1253
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r5 = -r5
            float r6 = (float) r1
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.f1237
            r4.setSize(r3, r1)
            android.widget.EdgeEffect r1 = r7.f1237
            boolean r1 = r1.draw(r8)
            r2 = r2 | r1
            r8.restoreToCount(r0)
        L96:
            if (r2 == 0) goto L9d
            java.util.WeakHashMap r8 = p000.b92.f1572
            r7.postInvalidateOnAnimation()
        L9d:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.f1251
            if (r0 == 0) goto L14
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L14
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L14:
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            u92 r1 = new u92
            r0 = -1
            r1.<init>(r0, r0)
            return r1
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            u92 r0 = new u92
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2, r3)
            int[] r1 = androidx.viewpager.widget.ViewPager.f1232
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r1)
            r3 = 0
            r1 = 48
            int r3 = r2.getInteger(r3, r1)
            r0.f10659 = r3
            r2.recycle()
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r0 = r0.generateDefaultLayoutParams()
            return r0
    }

    public p000.d91 getAdapter() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r1, int r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public int getCurrentItem() {
            r0 = this;
            r0 = 0
            return r0
    }

    public int getOffscreenPageLimit() {
            r0 = this;
            int r0 = r0.f1256
            return r0
    }

    public int getPageMargin() {
            r0 = this;
            int r0 = r0.f1250
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 1
            r1.f1238 = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            d1 r0 = r1.f1244
            r1.removeCallbacks(r0)
            android.widget.Scroller r0 = r1.f1249
            if (r0 == 0) goto L14
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L14
            android.widget.Scroller r0 = r1.f1249
            r0.abortAnimation()
        L14:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            int r1 = r0.f1250
            if (r1 <= 0) goto L10
            android.graphics.drawable.Drawable r1 = r0.f1251
            if (r1 == 0) goto L10
            java.util.ArrayList r0 = r0.f1246
            r0.size()
        L10:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r14) {
            r13 = this;
            int r0 = r14.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 3
            r2 = 0
            r3 = -1
            r4 = 0
            if (r0 == r1) goto L153
            r1 = 1
            if (r0 != r1) goto L11
            goto L153
        L11:
            if (r0 == 0) goto L1e
            boolean r5 = r13.f1257
            if (r5 == 0) goto L18
            return r1
        L18:
            boolean r5 = r13.f1258
            if (r5 == 0) goto L1e
            goto L179
        L1e:
            r5 = 2
            if (r0 == 0) goto Lf4
            if (r0 == r5) goto L4c
            r2 = 6
            if (r0 == r2) goto L28
            goto L141
        L28:
            int r0 = r14.getActionIndex()
            int r2 = r14.getPointerId(r0)
            int r3 = r13.f1265
            if (r2 != r3) goto L141
            if (r0 != 0) goto L37
            r4 = r1
        L37:
            float r0 = r14.getX(r4)
            r13.f1262 = r0
            int r0 = r14.getPointerId(r4)
            r13.f1265 = r0
            android.view.VelocityTracker r0 = r13.f1234
            if (r0 == 0) goto L141
            r0.clear()
            goto L141
        L4c:
            int r0 = r13.f1265
            if (r0 != r3) goto L52
            goto L141
        L52:
            int r0 = r14.findPointerIndex(r0)
            float r3 = r14.getX(r0)
            float r5 = r13.f1262
            float r5 = r3 - r5
            float r6 = java.lang.Math.abs(r5)
            float r0 = r14.getY(r0)
            float r7 = r13.f1264
            float r7 = r0 - r7
            float r7 = java.lang.Math.abs(r7)
            r8 = 0
            int r9 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r9 == 0) goto L9d
            float r10 = r13.f1262
            int r11 = r13.f1260
            float r11 = (float) r11
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L7e
            if (r9 > 0) goto L9d
        L7e:
            int r11 = r13.getWidth()
            int r12 = r13.f1260
            int r11 = r11 - r12
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L8f
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 >= 0) goto L8f
            goto L9d
        L8f:
            int r5 = (int) r5
            int r8 = (int) r3
            int r0 = (int) r0
            boolean r0 = m556(r5, r8, r0, r13, r4)
            if (r0 == 0) goto L9d
            r13.f1262 = r3
            r13.f1258 = r1
            return r4
        L9d:
            int r0 = r13.f1261
            float r0 = (float) r0
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 <= 0) goto Lc9
            r5 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r5
            int r5 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r5 <= 0) goto Lc9
            r13.f1257 = r1
            android.view.ViewParent r0 = r13.getParent()
            if (r0 == 0) goto Lb6
            r0.requestDisallowInterceptTouchEvent(r1)
        Lb6:
            r13.setScrollState(r1)
            float r0 = r13.f1263
            int r5 = r13.f1261
            float r5 = (float) r5
            if (r9 <= 0) goto Lc2
            float r0 = r0 + r5
            goto Lc3
        Lc2:
            float r0 = r0 - r5
        Lc3:
            r13.f1262 = r0
            r13.setScrollingCacheEnabled(r1)
            goto Lcf
        Lc9:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lcf
            r13.f1258 = r1
        Lcf:
            boolean r0 = r13.f1257
            if (r0 != 0) goto Ld4
            goto L141
        Ld4:
            r13.f1262 = r3
            r13.getScrollX()
            r13.getClientWidth()
            java.util.ArrayList r13 = r13.f1246
            java.lang.Object r14 = r13.get(r4)
            t92 r14 = (p000.t92) r14
            int r0 = r13.size()
            int r0 = r0 - r1
            java.lang.Object r13 = r13.get(r0)
            t92 r13 = (p000.t92) r13
            int r14 = r14.f10256
            int r13 = r13.f10256
            throw r2
        Lf4:
            float r0 = r14.getX()
            r13.f1263 = r0
            r13.f1262 = r0
            float r0 = r14.getY()
            r13.f1264 = r0
            int r0 = r14.getPointerId(r4)
            r13.f1265 = r0
            r13.f1258 = r4
            android.widget.Scroller r0 = r13.f1249
            r0.computeScrollOffset()
            int r0 = r13.f1245
            if (r0 != r5) goto L13c
            android.widget.Scroller r0 = r13.f1249
            int r0 = r0.getFinalX()
            android.widget.Scroller r2 = r13.f1249
            int r2 = r2.getCurrX()
            int r0 = r0 - r2
            int r0 = java.lang.Math.abs(r0)
            int r2 = r13.f1235
            if (r0 <= r2) goto L13c
            android.widget.Scroller r0 = r13.f1249
            r0.abortAnimation()
            r13.f1257 = r1
            android.view.ViewParent r0 = r13.getParent()
            if (r0 == 0) goto L138
            r0.requestDisallowInterceptTouchEvent(r1)
        L138:
            r13.setScrollState(r1)
            goto L141
        L13c:
            r13.m558(r4)
            r13.f1257 = r4
        L141:
            android.view.VelocityTracker r0 = r13.f1234
            if (r0 != 0) goto L14b
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.f1234 = r0
        L14b:
            android.view.VelocityTracker r0 = r13.f1234
            r0.addMovement(r14)
            boolean r13 = r13.f1257
            return r13
        L153:
            r13.f1265 = r3
            r13.f1257 = r4
            r13.f1258 = r4
            android.view.VelocityTracker r14 = r13.f1234
            if (r14 == 0) goto L162
            r14.recycle()
            r13.f1234 = r2
        L162:
            android.widget.EdgeEffect r14 = r13.f1236
            r14.onRelease()
            android.widget.EdgeEffect r14 = r13.f1237
            r14.onRelease()
            android.widget.EdgeEffect r14 = r13.f1236
            boolean r14 = r14.isFinished()
            if (r14 != 0) goto L179
            android.widget.EdgeEffect r13 = r13.f1237
            r13.isFinished()
        L179:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
            r18 = this;
            r0 = r18
            int r1 = r0.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r0.getPaddingLeft()
            int r5 = r0.getPaddingTop()
            int r6 = r0.getPaddingRight()
            int r7 = r0.getPaddingBottom()
            int r8 = r0.getScrollX()
            r10 = 0
            r11 = 0
        L20:
            r12 = 8
            if (r10 >= r1) goto Lb8
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto Lb4
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            u92 r12 = (p000.u92) r12
            boolean r14 = r12.f10658
            if (r14 == 0) goto Lb4
            int r12 = r12.f10659
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L61
            r15 = 3
            if (r14 == r15) goto L5b
            r15 = 5
            if (r14 == r15) goto L49
            r14 = r4
            goto L6e
        L49:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
        L55:
            r17 = r14
            r14 = r4
            r4 = r17
            goto L6e
        L5b:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L6e
        L61:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
            goto L55
        L6e:
            r15 = 16
            if (r12 == r15) goto L94
            r15 = 48
            if (r12 == r15) goto L8e
            r15 = 80
            if (r12 == r15) goto L7c
            r12 = r5
            goto La1
        L7c:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
        L88:
            r17 = r12
            r12 = r5
            r5 = r17
            goto La1
        L8e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto La1
        L94:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
            goto L88
        La1:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r16 + r5
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        Lb4:
            int r10 = r10 + 1
            goto L20
        Lb8:
            r2 = 0
        Lb9:
            if (r2 >= r1) goto Ld5
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getVisibility()
            if (r4 == r12) goto Ld2
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            u92 r3 = (p000.u92) r3
            boolean r3 = r3.f10658
            if (r3 != 0) goto Ld2
            r0.m560()
        Ld2:
            int r2 = r2 + 1
            goto Lb9
        Ld5:
            r0.f1240 = r11
            boolean r1 = r0.f1238
            if (r1 == 0) goto L118
            r1 = 0
        Ldc:
            java.util.ArrayList r2 = r0.f1246
            int r3 = r2.size()
            if (r1 >= r3) goto Lf2
            java.lang.Object r2 = r2.get(r1)
            t92 r2 = (p000.t92) r2
            int r3 = r2.f10256
            if (r3 != 0) goto Lef
            goto Lf3
        Lef:
            int r1 = r1 + 1
            goto Ldc
        Lf2:
            r2 = 0
        Lf3:
            if (r2 == 0) goto L10c
            int r1 = r0.getClientWidth()
            float r1 = (float) r1
            float r2 = r2.f10257
            float r3 = r0.f1253
            float r2 = java.lang.Math.min(r2, r3)
            float r3 = r0.f1252
            float r2 = java.lang.Math.max(r3, r2)
            float r2 = r2 * r1
            int r1 = (int) r2
        L10a:
            r2 = 0
            goto L10e
        L10c:
            r1 = 0
            goto L10a
        L10e:
            r0.m558(r2)
            r0.scrollTo(r1, r2)
            r0.m563(r1)
            goto L119
        L118:
            r2 = 0
        L119:
            r0.f1238 = r2
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r14, int r15) {
            r13 = this;
            r0 = 0
            int r14 = android.view.View.getDefaultSize(r0, r14)
            int r15 = android.view.View.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.f1259
            int r15 = java.lang.Math.min(r15, r1)
            r13.f1260 = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = r0
        L37:
            r3 = 8
            r4 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto Laf
            android.view.View r5 = r13.getChildAt(r2)
            int r6 = r5.getVisibility()
            if (r6 == r3) goto Lac
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            u92 r3 = (p000.u92) r3
            if (r3 == 0) goto Lac
            boolean r6 = r3.f10658
            if (r6 == 0) goto Lac
            int r6 = r3.f10659
            r7 = r6 & 7
            r6 = r6 & 112(0x70, float:1.57E-43)
            r8 = 48
            r9 = 1
            if (r6 == r8) goto L65
            r8 = 80
            if (r6 != r8) goto L63
            goto L65
        L63:
            r6 = r0
            goto L66
        L65:
            r6 = r9
        L66:
            r8 = 3
            if (r7 == r8) goto L6e
            r8 = 5
            if (r7 != r8) goto L6d
            goto L6e
        L6d:
            r9 = r0
        L6e:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L75
            r8 = r7
            r7 = r4
            goto L7a
        L75:
            if (r9 == 0) goto L79
            r8 = r4
            goto L7a
        L79:
            r8 = r7
        L7a:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L86
            if (r10 == r11) goto L84
        L82:
            r7 = r4
            goto L87
        L84:
            r10 = r14
            goto L82
        L86:
            r10 = r14
        L87:
            int r3 = r3.height
            if (r3 == r12) goto L90
            if (r3 == r11) goto L8e
            goto L92
        L8e:
            r3 = r15
            goto L92
        L90:
            r3 = r15
            r4 = r8
        L92:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r7)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            r5.measure(r7, r3)
            if (r6 == 0) goto La5
            int r3 = r5.getMeasuredHeight()
            int r15 = r15 - r3
            goto Lac
        La5:
            if (r9 == 0) goto Lac
            int r3 = r5.getMeasuredWidth()
            int r14 = r14 - r3
        Lac:
            int r2 = r2 + 1
            goto L37
        Laf:
            android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r4)
            r13.f1254 = r15
            int r15 = r13.getChildCount()
        Lbc:
            if (r0 >= r15) goto Le7
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto Le4
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            u92 r2 = (p000.u92) r2
            if (r2 == 0) goto Ld4
            boolean r5 = r2.f10658
            if (r5 != 0) goto Le4
        Ld4:
            float r5 = (float) r14
            r2.getClass()
            r2 = 0
            float r5 = r5 * r2
            int r2 = (int) r5
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
            int r5 = r13.f1254
            r1.measure(r2, r5)
        Le4:
            int r0 = r0 + 1
            goto Lbc
        Le7:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r4, android.graphics.Rect r5) {
            r3 = this;
            int r5 = r3.getChildCount()
            r4 = r4 & 2
            r0 = 0
            if (r4 == 0) goto Ld
            r4 = 1
            r1 = r5
            r5 = r0
            goto L11
        Ld:
            int r5 = r5 + (-1)
            r4 = -1
            r1 = r4
        L11:
            if (r5 == r1) goto L22
            android.view.View r2 = r3.getChildAt(r5)
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L20
            r3.m560()
        L20:
            int r5 = r5 + r4
            goto L11
        L22:
            return r0
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.w92
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            w92 r2 = (p000.w92) r2
            android.os.Parcelable r2 = r2.f1063
            super.onRestoreInstanceState(r2)
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r1 = this;
            android.os.Parcelable r1 = super.onSaveInstanceState()
            w92 r0 = new w92
            r0.<init>(r1)
            r1 = 0
            r0.f11615 = r1
            return r0
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 == r3) goto La
            int r2 = r0.f1250
            r0.m564(r1, r3, r2, r2)
        La:
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            int r1 = r2.getAction()
            r0 = 0
            if (r1 != 0) goto La
            r2.getEdgeFlags()
        La:
            return r0
    }

    public void setAdapter(p000.d91 r3) {
            r2 = this;
            java.util.ArrayList r3 = r2.f1243
            if (r3 == 0) goto L23
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L23
            java.util.ArrayList r3 = r2.f1243
            int r3 = r3.size()
            r0 = 0
        L11:
            if (r0 >= r3) goto L23
            java.util.ArrayList r1 = r2.f1243
            java.lang.Object r1 = r1.get(r0)
            f91 r1 = (p000.f91) r1
            androidx.viewpager.widget.PagerTitleStrip r1 = r1.f3832
            r1.m554()
            int r0 = r0 + 1
            goto L11
        L23:
            return
    }

    public void setCurrentItem(int r1) {
            r0 = this;
            r1 = 0
            r0.setScrollingCacheEnabled(r1)
            return
    }

    public void setOffscreenPageLimit(int r4) {
            r3 = this;
            r0 = 1
            if (r4 >= r0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested offscreen page limit "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " too small; defaulting to 1"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "ViewPager"
            android.util.Log.w(r1, r4)
            r4 = r0
        L1c:
            int r0 = r3.f1256
            if (r4 == r0) goto L22
            r3.f1256 = r4
        L22:
            return
    }

    @java.lang.Deprecated
    public void setOnPageChangeListener(p000.v92 r1) {
            r0 = this;
            r0.f1241 = r1
            return
    }

    public void setPageMargin(int r3) {
            r2 = this;
            int r0 = r2.f1250
            r2.f1250 = r3
            int r1 = r2.getWidth()
            r2.m564(r1, r1, r3, r0)
            r2.requestLayout()
            return
    }

    public void setPageMarginDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.setPageMarginDrawable(r2)
            return
    }

    public void setPageMarginDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f1251 = r1
            if (r1 == 0) goto L7
            r0.refreshDrawableState()
        L7:
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.setWillNotDraw(r1)
            r0.invalidate()
            return
    }

    public void setScrollState(int r2) {
            r1 = this;
            int r0 = r1.f1245
            if (r0 != r2) goto L5
            return
        L5:
            r1.f1245 = r2
            return
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r1 = r1.f1251
            if (r2 != r1) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: α */
    public final boolean m557(int r6) {
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 0
            if (r0 != r5) goto L9
        L7:
            r0 = r1
            goto L58
        L9:
            if (r0 == 0) goto L58
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r5) goto L16
            goto L58
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.String r0 = r2.concat(r0)
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L58:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r5, r0, r6)
            r2 = 17
            r3 = 0
            if (r1 == 0) goto L9b
            if (r1 == r0) goto L9b
            android.graphics.Rect r4 = r5.f1248
            if (r6 != r2) goto L81
            android.graphics.Rect r2 = r5.m559(r4, r1)
            int r2 = r2.left
            android.graphics.Rect r4 = r5.m559(r4, r0)
            int r4 = r4.left
            if (r0 == 0) goto L7c
            if (r2 < r4) goto L7c
            goto L9e
        L7c:
            boolean r3 = r1.requestFocus()
            goto L9e
        L81:
            r2 = 66
            if (r6 != r2) goto L9e
            android.graphics.Rect r2 = r5.m559(r4, r1)
            int r2 = r2.left
            android.graphics.Rect r4 = r5.m559(r4, r0)
            int r4 = r4.left
            if (r0 == 0) goto L96
            if (r2 > r4) goto L96
            goto L9e
        L96:
            boolean r3 = r1.requestFocus()
            goto L9e
        L9b:
            if (r6 == r2) goto L9e
            r0 = 1
        L9e:
            if (r3 == 0) goto La7
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        La7:
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public final void m558(boolean r7) {
            r6 = this;
            int r0 = r6.f1245
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = r2
        L9:
            if (r0 == 0) goto L3b
            r6.setScrollingCacheEnabled(r2)
            android.widget.Scroller r1 = r6.f1249
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L3b
            android.widget.Scroller r1 = r6.f1249
            r1.abortAnimation()
            int r1 = r6.getScrollX()
            int r3 = r6.getScrollY()
            android.widget.Scroller r4 = r6.f1249
            int r4 = r4.getCurrX()
            android.widget.Scroller r5 = r6.f1249
            int r5 = r5.getCurrY()
            if (r1 != r4) goto L33
            if (r3 == r5) goto L3b
        L33:
            r6.scrollTo(r4, r5)
            if (r4 == r1) goto L3b
            r6.m563(r4)
        L3b:
            java.util.ArrayList r1 = r6.f1246
            int r3 = r1.size()
            if (r2 >= r3) goto L4f
            java.lang.Object r1 = r1.get(r2)
            t92 r1 = (p000.t92) r1
            r1.getClass()
            int r2 = r2 + 1
            goto L3b
        L4f:
            if (r0 == 0) goto L5e
            d1 r0 = r6.f1244
            if (r7 == 0) goto L5b
            java.util.WeakHashMap r7 = p000.b92.f1572
            r6.postOnAnimation(r0)
            return
        L5b:
            r0.run()
        L5e:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final android.graphics.Rect m559(android.graphics.Rect r3, android.view.View r4) {
            r2 = this;
            if (r3 != 0) goto L7
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
        L7:
            if (r4 != 0) goto Le
            r2 = 0
            r3.set(r2, r2, r2, r2)
            return r3
        Le:
            int r0 = r4.getLeft()
            r3.left = r0
            int r0 = r4.getRight()
            r3.right = r0
            int r0 = r4.getTop()
            r3.top = r0
            int r0 = r4.getBottom()
            r3.bottom = r0
            android.view.ViewParent r4 = r4.getParent()
        L2a:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L5b
            if (r4 == r2) goto L5b
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r3.left
            int r1 = r4.getLeft()
            int r1 = r1 + r0
            r3.left = r1
            int r0 = r3.right
            int r1 = r4.getRight()
            int r1 = r1 + r0
            r3.right = r1
            int r0 = r3.top
            int r1 = r4.getTop()
            int r1 = r1 + r0
            r3.top = r1
            int r0 = r3.bottom
            int r1 = r4.getBottom()
            int r1 = r1 + r0
            r3.bottom = r1
            android.view.ViewParent r4 = r4.getParent()
            goto L2a
        L5b:
            return r3
    }

    /* JADX INFO: renamed from: ε */
    public final void m560() {
            r1 = this;
            java.util.ArrayList r1 = r1.f1246
            int r0 = r1.size()
            if (r0 > 0) goto L9
            return
        L9:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            t92 r1 = (p000.t92) r1
            r1.getClass()
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: ζ */
    public final void m561() {
            r5 = this;
            r0 = 0
            r5.setWillNotDraw(r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            r5.setDescendantFocusability(r0)
            r0 = 1
            r5.setFocusable(r0)
            android.content.Context r1 = r5.getContext()
            android.widget.Scroller r2 = new android.widget.Scroller
            rl1 r3 = androidx.viewpager.widget.ViewPager.f1233
            r2.<init>(r1, r3)
            r5.f1249 = r2
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r1)
            android.content.res.Resources r3 = r1.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r4 = r2.getScaledPagingTouchSlop()
            r5.f1261 = r4
            r2.getScaledMaximumFlingVelocity()
            android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
            r2.<init>(r1)
            r5.f1236 = r2
            android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
            r2.<init>(r1)
            r5.f1237 = r2
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            r5.f1235 = r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r3 = r3 * r1
            int r1 = (int) r3
            r5.f1259 = r1
            iw r1 = new iw
            r1.<init>(r5)
            p000.b92.m828(r5, r1)
            int r1 = r5.getImportantForAccessibility()
            if (r1 != 0) goto L5c
            r5.setImportantForAccessibility(r0)
        L5c:
            cw1 r0 = new cw1
            r0.<init>(r5)
            p000.u82.m5827(r5, r0)
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m562(float r12, int r13, int r14) {
            r11 = this;
            int r14 = r11.f1240
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L6c
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L1b:
            if (r6 >= r5) goto L6c
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            u92 r8 = (p000.u92) r8
            boolean r9 = r8.f10658
            if (r9 != 0) goto L2c
            goto L69
        L2c:
            int r8 = r8.f10659
            r8 = r8 & 7
            if (r8 == r1) goto L50
            r9 = 3
            if (r8 == r9) goto L4a
            r9 = 5
            if (r8 == r9) goto L3a
            r8 = r2
            goto L5d
        L3a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L46:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5d
        L4a:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5d
        L50:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L46
        L5d:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L68
            r7.offsetLeftAndRight(r2)
        L68:
            r2 = r8
        L69:
            int r6 = r6 + 1
            goto L1b
        L6c:
            v92 r14 = r11.f1241
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r14 == 0) goto L81
            f91 r14 = (p000.f91) r14
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 <= 0) goto L7b
            int r3 = r13 + 1
            goto L7c
        L7b:
            r3 = r13
        L7c:
            androidx.viewpager.widget.PagerTitleStrip r14 = r14.f3832
            r14.mo553(r3, r12, r0)
        L81:
            v92 r14 = r11.f1242
            if (r14 == 0) goto L92
            f91 r14 = (p000.f91) r14
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 <= 0) goto L8d
            int r13 = r13 + 1
        L8d:
            androidx.viewpager.widget.PagerTitleStrip r14 = r14.f3832
            r14.mo553(r13, r12, r0)
        L92:
            r11.f1239 = r1
            return
    }

    /* JADX INFO: renamed from: θ */
    public final boolean m563(int r17) {
            r16 = this;
            r0 = r16
            java.util.ArrayList r1 = r0.f1246
            int r2 = r1.size()
            java.lang.String r3 = "onPageScrolled did not call superclass implementation"
            r4 = 0
            r5 = 0
            if (r2 != 0) goto L22
            boolean r1 = r0.f1238
            if (r1 == 0) goto L13
            goto L1c
        L13:
            r0.f1239 = r5
            r0.m562(r4, r5, r5)
            boolean r0 = r0.f1239
            if (r0 == 0) goto L1d
        L1c:
            return r5
        L1d:
            p000.C1080.m7279(r3)
        L20:
            r0 = 0
            return r0
        L22:
            int r2 = r0.getClientWidth()
            if (r2 <= 0) goto L30
            int r6 = r0.getScrollX()
            float r6 = (float) r6
            float r7 = (float) r2
            float r6 = r6 / r7
            goto L31
        L30:
            r6 = r4
        L31:
            if (r2 <= 0) goto L39
            int r7 = r0.f1250
            float r7 = (float) r7
            float r2 = (float) r2
            float r7 = r7 / r2
            goto L3a
        L39:
            r7 = r4
        L3a:
            r2 = 1
            r8 = 0
            r9 = -1
            r12 = r2
            r13 = r4
            r10 = r5
            r11 = r8
        L41:
            int r14 = r1.size()
            if (r10 >= r14) goto L7d
            java.lang.Object r14 = r1.get(r10)
            t92 r14 = (p000.t92) r14
            if (r12 != 0) goto L5e
            int r15 = r14.f10256
            int r9 = r9 + r2
            if (r15 != r9) goto L55
            goto L5e
        L55:
            float r13 = r13 + r4
            float r13 = r13 + r7
            t92 r0 = r0.f1247
            r0.f10257 = r13
            r0.f10256 = r9
            throw r8
        L5e:
            float r13 = r14.f10257
            float r9 = r13 + r4
            float r9 = r9 + r7
            if (r12 != 0) goto L69
            int r12 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r12 < 0) goto L7d
        L69:
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L7c
            int r9 = r1.size()
            int r9 = r9 - r2
            if (r10 != r9) goto L75
            goto L7c
        L75:
            int r9 = r14.f10256
            int r10 = r10 + 1
            r12 = r5
            r11 = r14
            goto L41
        L7c:
            r11 = r14
        L7d:
            int r1 = r0.getClientWidth()
            int r6 = r0.f1250
            int r7 = r1 + r6
            float r6 = (float) r6
            float r1 = (float) r1
            float r6 = r6 / r1
            int r8 = r11.f10256
            r9 = r17
            float r9 = (float) r9
            float r9 = r9 / r1
            float r1 = r11.f10257
            float r9 = r9 - r1
            float r4 = r4 + r6
            float r9 = r9 / r4
            float r1 = (float) r7
            float r1 = r1 * r9
            int r1 = (int) r1
            r0.f1239 = r5
            r0.m562(r9, r8, r1)
            boolean r0 = r0.f1239
            if (r0 == 0) goto La0
            return r2
        La0:
            p000.C1080.m7279(r3)
            goto L20
    }

    /* JADX INFO: renamed from: ι */
    public final void m564(int r3, int r4, int r5, int r6) {
            r2 = this;
            java.util.ArrayList r0 = r2.f1246
            if (r4 <= 0) goto L49
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L49
            android.widget.Scroller r0 = r2.f1249
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L21
            android.widget.Scroller r3 = r2.f1249
            int r4 = r2.getCurrentItem()
            int r2 = r2.getClientWidth()
            int r4 = r4 * r2
            r3.setFinalX(r4)
            return
        L21:
            int r0 = r2.getPaddingLeft()
            int r3 = r3 - r0
            int r0 = r2.getPaddingRight()
            int r3 = r3 - r0
            int r3 = r3 + r5
            int r5 = r2.getPaddingLeft()
            int r4 = r4 - r5
            int r5 = r2.getPaddingRight()
            int r4 = r4 - r5
            int r4 = r4 + r6
            int r5 = r2.getScrollX()
            float r5 = (float) r5
            float r4 = (float) r4
            float r5 = r5 / r4
            float r3 = (float) r3
            float r5 = r5 * r3
            int r3 = (int) r5
            int r4 = r2.getScrollY()
            r2.scrollTo(r3, r4)
            return
        L49:
            r4 = 0
            r5 = r4
        L4b:
            int r6 = r0.size()
            if (r5 >= r6) goto L5f
            java.lang.Object r6 = r0.get(r5)
            t92 r6 = (p000.t92) r6
            int r1 = r6.f10256
            if (r1 != 0) goto L5c
            goto L60
        L5c:
            int r5 = r5 + 1
            goto L4b
        L5f:
            r6 = 0
        L60:
            if (r6 == 0) goto L6b
            float r5 = r6.f10257
            float r6 = r2.f1253
            float r5 = java.lang.Math.min(r5, r6)
            goto L6c
        L6b:
            r5 = 0
        L6c:
            int r6 = r2.getPaddingLeft()
            int r3 = r3 - r6
            int r6 = r2.getPaddingRight()
            int r3 = r3 - r6
            float r3 = (float) r3
            float r5 = r5 * r3
            int r3 = (int) r5
            int r5 = r2.getScrollX()
            if (r3 == r5) goto L89
            r2.m558(r4)
            int r4 = r2.getScrollY()
            r2.scrollTo(r3, r4)
        L89:
            return
    }
}
