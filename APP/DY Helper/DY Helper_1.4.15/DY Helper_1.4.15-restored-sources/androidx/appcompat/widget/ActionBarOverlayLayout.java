package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements p000.InterfaceC0993xq, p000.c31, p000.d31 {

    /* JADX INFO: renamed from: Ι */
    public static final int[] f486 = null;

    /* JADX INFO: renamed from: Κ */
    public static final p000.oc2 f487 = null;

    /* JADX INFO: renamed from: Λ */
    public static final android.graphics.Rect f488 = null;

    /* JADX INFO: renamed from: Α */
    public p000.InterfaceC1141 f489;

    /* JADX INFO: renamed from: Β */
    public android.widget.OverScroller f490;

    /* JADX INFO: renamed from: Γ */
    public android.view.ViewPropertyAnimator f491;

    /* JADX INFO: renamed from: Δ */
    public final p000.C1139 f492;

    /* JADX INFO: renamed from: Ε */
    public final p000.RunnableC1140 f493;

    /* JADX INFO: renamed from: Ζ */
    public final p000.RunnableC1140 f494;

    /* JADX INFO: renamed from: Η */
    public final p000.e31 f495;

    /* JADX INFO: renamed from: Θ */
    public final androidx.appcompat.widget.ActionBarOverlayLayout.NoSystemUiLayoutFlagView f496;

    /* JADX INFO: renamed from: ε */
    public int f497;

    /* JADX INFO: renamed from: ζ */
    public int f498;

    /* JADX INFO: renamed from: η */
    public androidx.appcompat.widget.ContentFrameLayout f499;

    /* JADX INFO: renamed from: θ */
    public androidx.appcompat.widget.ActionBarContainer f500;

    /* JADX INFO: renamed from: ι */
    public p000.InterfaceC1030yq f501;

    /* JADX INFO: renamed from: κ */
    public android.graphics.drawable.Drawable f502;

    /* JADX INFO: renamed from: λ */
    public boolean f503;

    /* JADX INFO: renamed from: μ */
    public boolean f504;

    /* JADX INFO: renamed from: ν */
    public boolean f505;

    /* JADX INFO: renamed from: ξ */
    public boolean f506;

    /* JADX INFO: renamed from: ο */
    public int f507;

    /* JADX INFO: renamed from: π */
    public int f508;

    /* JADX INFO: renamed from: ρ */
    public final android.graphics.Rect f509;

    /* JADX INFO: renamed from: σ */
    public final android.graphics.Rect f510;

    /* JADX INFO: renamed from: τ */
    public final android.graphics.Rect f511;

    /* JADX INFO: renamed from: υ */
    public final android.graphics.Rect f512;

    /* JADX INFO: renamed from: φ */
    public p000.oc2 f513;

    /* JADX INFO: renamed from: χ */
    public p000.oc2 f514;

    /* JADX INFO: renamed from: ψ */
    public p000.oc2 f515;

    /* JADX INFO: renamed from: ω */
    public p000.oc2 f516;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class NoSystemUiLayoutFlagView extends android.view.View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
                r0 = this;
                r0 = 0
                return r0
        }
    }

    static {
            r0 = 2130968579(0x7f040003, float:1.7545816E38)
            r1 = 16842841(0x1010059, float:2.3693807E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.widget.ActionBarOverlayLayout.f486 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L18
            cc2 r0 = new cc2
            r0.<init>()
            goto L27
        L18:
            r1 = 31
            if (r0 < r1) goto L22
            bc2 r0 = new bc2
            r0.<init>()
            goto L27
        L22:
            ac2 r0 = new ac2
            r0.<init>()
        L27:
            r1 = 0
            r2 = 1
            nm0 r1 = p000.nm0.m4080(r1, r2, r1, r2)
            r0.mo1700(r1)
            oc2 r0 = r0.mo1698()
            androidx.appcompat.widget.ActionBarOverlayLayout.f487 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.appcompat.widget.ActionBarOverlayLayout.f488 = r0
            return
    }

    public ActionBarOverlayLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarOverlayLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r3 = 0
            r1.f498 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.f509 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.f510 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.f511 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.f512 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            oc2 r3 = p000.oc2.f8032
            r1.f513 = r3
            r1.f514 = r3
            r1.f515 = r3
            r1.f516 = r3
            ｉ r3 = new ｉ
            r3.<init>(r1)
            r1.f492 = r3
            ｊ r3 = new ｊ
            r0 = 0
            r3.<init>(r1, r0)
            r1.f493 = r3
            ｊ r3 = new ｊ
            r0 = 1
            r3.<init>(r1, r0)
            r1.f494 = r3
            r1.m256(r2)
            e31 r3 = new e31
            r3.<init>()
            r1.f495 = r3
            androidx.appcompat.widget.ActionBarOverlayLayout$NoSystemUiLayoutFlagView r3 = new androidx.appcompat.widget.ActionBarOverlayLayout$NoSystemUiLayoutFlagView
            r3.<init>(r2)
            r2 = 1
            r3.setWillNotDraw(r2)
            r1.f496 = r3
            r1.addView(r3)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m249(android.view.View r4, android.graphics.Rect r5, boolean r6) {
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            ｌ r4 = (p000.C1142) r4
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

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof p000.C1142
            return r0
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r6) {
            r5 = this;
            super.draw(r6)
            android.graphics.drawable.Drawable r0 = r5.f502
            if (r0 == 0) goto L39
            androidx.appcompat.widget.ActionBarContainer r0 = r5.f500
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L23
            androidx.appcompat.widget.ActionBarContainer r0 = r5.f500
            int r0 = r0.getBottom()
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r2 = r5.f500
            float r2 = r2.getTranslationY()
            float r2 = r2 + r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r0 = (int) r2
            goto L24
        L23:
            r0 = r1
        L24:
            android.graphics.drawable.Drawable r2 = r5.f502
            int r3 = r5.getWidth()
            android.graphics.drawable.Drawable r4 = r5.f502
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 + r0
            r2.setBounds(r1, r0, r3, r4)
            android.graphics.drawable.Drawable r5 = r5.f502
            r5.draw(r6)
        L39:
            return
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(android.graphics.Rect r1) {
            r0 = this;
            boolean r0 = super.fitSystemWindows(r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            ｌ r1 = new ｌ
            r0 = -1
            r1.<init>(r0, r0)
            return r1
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            ｌ r0 = new ｌ
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            ｌ r0 = new ｌ
            r0.<init>(r1)
            return r0
    }

    public int getActionBarHideOffset() {
            r0 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r0.f500
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
            r1 = this;
            e31 r1 = r1.f495
            int r0 = r1.f3400
            int r1 = r1.f3401
            r1 = r1 | r0
            return r1
    }

    public java.lang.CharSequence getTitle() {
            r0 = this;
            r0.m259()
            yq r0 = r0.f501
            b52 r0 = (p000.b52) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f1484
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
            r6 = this;
            r6.m259()
            oc2 r7 = p000.oc2.m4220(r6, r7)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r7.m4222()
            int r2 = r7.m4224()
            int r3 = r7.m4223()
            int r4 = r7.m4221()
            r0.<init>(r1, r2, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r6.f500
            r2 = 0
            boolean r0 = m249(r1, r0, r2)
            java.util.WeakHashMap r1 = p000.b92.f1572
            android.graphics.Rect r1 = r6.f509
            p000.u82.m5820(r6, r7, r1)
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r5 = r1.bottom
            lc2 r7 = r7.f8033
            oc2 r2 = r7.mo1909(r2, r3, r4, r5)
            r6.f513 = r2
            oc2 r3 = r6.f514
            boolean r2 = r3.equals(r2)
            r3 = 1
            if (r2 != 0) goto L48
            oc2 r0 = r6.f513
            r6.f514 = r0
            r0 = r3
        L48:
            android.graphics.Rect r2 = r6.f510
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
            oc2 r6 = r7.mo2296()
            lc2 r6 = r6.f8033
            oc2 r6 = r6.mo2096()
            lc2 r6 = r6.f8033
            oc2 r6 = r6.mo2095()
            android.view.WindowInsets r6 = r6.m4226()
            return r6
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            android.content.Context r1 = r0.getContext()
            r0.m256(r1)
            java.util.WeakHashMap r1 = p000.b92.f1572
            p000.s82.m5376(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.m255()
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
            ｌ r0 = (p000.C1142) r0
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
            r12.m259()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f500
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r12 = r0.f500
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            ｌ r12 = (p000.C1142) r12
            androidx.appcompat.widget.ActionBarContainer r13 = r0.f500
            int r13 = r13.getMeasuredWidth()
            int r14 = r12.leftMargin
            int r13 = r13 + r14
            int r14 = r12.rightMargin
            int r13 = r13 + r14
            r14 = 0
            int r13 = java.lang.Math.max(r14, r13)
            androidx.appcompat.widget.ActionBarContainer r1 = r0.f500
            int r1 = r1.getMeasuredHeight()
            int r3 = r12.topMargin
            int r1 = r1 + r3
            int r12 = r12.bottomMargin
            int r1 = r1 + r12
            int r12 = java.lang.Math.max(r14, r1)
            androidx.appcompat.widget.ActionBarContainer r1 = r0.f500
            int r1 = r1.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r14, r1)
            java.util.WeakHashMap r3 = p000.b92.f1572
            int r3 = r0.getWindowSystemUiVisibility()
            r3 = r3 & 256(0x100, float:3.59E-43)
            r5 = 1
            if (r3 == 0) goto L4d
            r3 = r5
            goto L4e
        L4d:
            r3 = r14
        L4e:
            if (r3 == 0) goto L62
            int r6 = r0.f497
            boolean r7 = r0.f504
            if (r7 == 0) goto L74
            androidx.appcompat.widget.ActionBarContainer r7 = r0.f500
            android.view.View r7 = r7.getTabContainer()
            if (r7 == 0) goto L74
            int r7 = r0.f497
            int r6 = r6 + r7
            goto L74
        L62:
            androidx.appcompat.widget.ActionBarContainer r6 = r0.f500
            int r6 = r6.getVisibility()
            r7 = 8
            if (r6 == r7) goto L73
            androidx.appcompat.widget.ActionBarContainer r6 = r0.f500
            int r6 = r6.getMeasuredHeight()
            goto L74
        L73:
            r6 = r14
        L74:
            android.graphics.Rect r7 = r0.f509
            android.graphics.Rect r8 = r0.f511
            r8.set(r7)
            oc2 r7 = r0.f513
            r0.f515 = r7
            boolean r7 = r0.f503
            if (r7 != 0) goto Laa
            if (r3 != 0) goto Laa
            androidx.appcompat.widget.ActionBarOverlayLayout$NoSystemUiLayoutFlagView r3 = r0.f496
            oc2 r7 = androidx.appcompat.widget.ActionBarOverlayLayout.f487
            android.graphics.Rect r9 = r0.f512
            p000.u82.m5820(r3, r7, r9)
            android.graphics.Rect r3 = androidx.appcompat.widget.ActionBarOverlayLayout.f488
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto Laa
            int r3 = r8.top
            int r3 = r3 + r6
            r8.top = r3
            int r3 = r8.bottom
            r8.bottom = r3
            oc2 r3 = r0.f515
            lc2 r3 = r3.f8033
            oc2 r14 = r3.mo1909(r14, r6, r14, r14)
            r0.f515 = r14
            goto Led
        Laa:
            oc2 r14 = r0.f515
            int r14 = r14.m4222()
            oc2 r3 = r0.f515
            int r3 = r3.m4224()
            int r3 = r3 + r6
            oc2 r6 = r0.f515
            int r6 = r6.m4223()
            oc2 r7 = r0.f515
            int r7 = r7.m4221()
            nm0 r14 = p000.nm0.m4080(r14, r3, r6, r7)
            oc2 r3 = r0.f515
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 34
            if (r6 < r7) goto Ld5
            cc2 r6 = new cc2
            r6.<init>(r3)
            goto Le4
        Ld5:
            r7 = 31
            if (r6 < r7) goto Ldf
            bc2 r6 = new bc2
            r6.<init>(r3)
            goto Le4
        Ldf:
            ac2 r6 = new ac2
            r6.<init>(r3)
        Le4:
            r6.mo1700(r14)
            oc2 r14 = r6.mo1698()
            r0.f515 = r14
        Led:
            androidx.appcompat.widget.ContentFrameLayout r14 = r0.f499
            m249(r14, r8, r5)
            oc2 r14 = r0.f516
            oc2 r3 = r0.f515
            boolean r14 = r14.equals(r3)
            if (r14 != 0) goto L105
            oc2 r14 = r0.f515
            r0.f516 = r14
            androidx.appcompat.widget.ContentFrameLayout r3 = r0.f499
            p000.b92.m824(r3, r14)
        L105:
            androidx.appcompat.widget.ContentFrameLayout r7 = r0.f499
            r9 = 0
            r11 = 0
            r6 = r0
            r8 = r2
            r10 = r4
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            androidx.appcompat.widget.ContentFrameLayout r14 = r0.f499
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            ｌ r14 = (p000.C1142) r14
            androidx.appcompat.widget.ContentFrameLayout r3 = r0.f499
            int r3 = r3.getMeasuredWidth()
            int r5 = r14.leftMargin
            int r3 = r3 + r5
            int r5 = r14.rightMargin
            int r3 = r3 + r5
            int r13 = java.lang.Math.max(r13, r3)
            androidx.appcompat.widget.ContentFrameLayout r3 = r0.f499
            int r3 = r3.getMeasuredHeight()
            int r5 = r14.topMargin
            int r3 = r3 + r5
            int r14 = r14.bottomMargin
            int r3 = r3 + r14
            int r12 = java.lang.Math.max(r12, r3)
            androidx.appcompat.widget.ContentFrameLayout r14 = r0.f499
            int r14 = r14.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r1, r14)
            int r1 = r0.getPaddingLeft()
            int r3 = r0.getPaddingRight()
            int r3 = r3 + r1
            int r3 = r3 + r13
            int r13 = r0.getPaddingTop()
            int r1 = r0.getPaddingBottom()
            int r1 = r1 + r13
            int r1 = r1 + r12
            int r12 = r0.getSuggestedMinimumHeight()
            int r12 = java.lang.Math.max(r1, r12)
            int r13 = r0.getSuggestedMinimumWidth()
            int r13 = java.lang.Math.max(r3, r13)
            int r13 = android.view.View.resolveSizeAndState(r13, r2, r14)
            int r14 = r14 << 16
            int r12 = android.view.View.resolveSizeAndState(r12, r4, r14)
            r0.setMeasuredDimension(r13, r12)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View r10, float r11, float r12, boolean r13) {
            r9 = this;
            boolean r10 = r9.f505
            if (r10 == 0) goto L3a
            if (r13 != 0) goto L7
            goto L3a
        L7:
            android.widget.OverScroller r0 = r9.f490
            int r4 = (int) r12
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8)
            android.widget.OverScroller r10 = r9.f490
            int r10 = r10.getFinalY()
            androidx.appcompat.widget.ActionBarContainer r11 = r9.f500
            int r11 = r11.getHeight()
            if (r10 <= r11) goto L2e
            r9.m255()
            ｊ r10 = r9.f494
            r10.run()
            goto L36
        L2e:
            r9.m255()
            ｊ r10 = r9.f493
            r10.run()
        L36:
            r10 = 1
            r9.f506 = r10
            return r10
        L3a:
            r9 = 0
            return r9
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.f507
            int r1 = r1 + r3
            r0.f507 = r1
            r0.setActionBarHideOffset(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            e31 r1 = r0.f495
            r1.f3400 = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f507 = r1
            r0.m255()
            ｋ r0 = r0.f489
            if (r0 == 0) goto L1d
            tb2 r0 = (p000.tb2) r0
            y92 r1 = r0.f10297
            if (r1 == 0) goto L1d
            r1.m6841()
            r1 = 0
            r0.f10297 = r1
        L1d:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L10
            androidx.appcompat.widget.ActionBarContainer r1 = r0.f500
            int r1 = r1.getVisibility()
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            boolean r0 = r0.f505
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View r4) {
            r3 = this;
            boolean r4 = r3.f505
            if (r4 == 0) goto L25
            boolean r4 = r3.f506
            if (r4 != 0) goto L25
            int r4 = r3.f507
            androidx.appcompat.widget.ActionBarContainer r0 = r3.f500
            int r0 = r0.getHeight()
            r1 = 600(0x258, double:2.964E-321)
            if (r4 > r0) goto L1d
            r3.m255()
            ｊ r4 = r3.f493
            r3.postDelayed(r4, r1)
            goto L25
        L1d:
            r3.m255()
            ｊ r4 = r3.f494
            r3.postDelayed(r4, r1)
        L25:
            return
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int r7) {
            r6 = this;
            super.onWindowSystemUiVisibilityChanged(r7)
            r6.m259()
            int r0 = r6.f508
            r0 = r0 ^ r7
            r6.f508 = r7
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
            ｋ r4 = r6.f489
            if (r4 == 0) goto L3d
            r5 = r7 ^ 1
            tb2 r4 = (p000.tb2) r4
            r4.f10293 = r5
            if (r1 != 0) goto L34
            if (r7 != 0) goto L2a
            goto L34
        L2a:
            boolean r7 = r4.f10294
            if (r7 != 0) goto L3d
            r4.f10294 = r3
            r4.m5628(r3)
            goto L3d
        L34:
            boolean r7 = r4.f10294
            if (r7 == 0) goto L3d
            r4.f10294 = r2
            r4.m5628(r3)
        L3d:
            r7 = r0 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L4a
            ｋ r7 = r6.f489
            if (r7 == 0) goto L4a
            java.util.WeakHashMap r7 = p000.b92.f1572
            p000.s82.m5376(r6)
        L4a:
            return
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            r0.f498 = r1
            ｋ r0 = r0.f489
            if (r0 == 0) goto Ld
            tb2 r0 = (p000.tb2) r0
            r0.f10292 = r1
        Ld:
            return
    }

    public void setActionBarHideOffset(int r3) {
            r2 = this;
            r2.m255()
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f500
            int r0 = r0.getHeight()
            r1 = 0
            int r3 = java.lang.Math.min(r3, r0)
            int r3 = java.lang.Math.max(r1, r3)
            androidx.appcompat.widget.ActionBarContainer r2 = r2.f500
            int r3 = -r3
            float r3 = (float) r3
            r2.setTranslationY(r3)
            return
    }

    public void setActionBarVisibilityCallback(p000.InterfaceC1141 r2) {
            r1 = this;
            r1.f489 = r2
            android.os.IBinder r2 = r1.getWindowToken()
            if (r2 == 0) goto L1c
            ｋ r2 = r1.f489
            int r0 = r1.f498
            tb2 r2 = (p000.tb2) r2
            r2.f10292 = r0
            int r2 = r1.f508
            if (r2 == 0) goto L1c
            r1.onWindowSystemUiVisibilityChanged(r2)
            java.util.WeakHashMap r2 = p000.b92.f1572
            p000.s82.m5376(r1)
        L1c:
            return
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
            r0 = this;
            r0.f504 = r1
            return
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.f505
            if (r2 == r0) goto Lf
            r1.f505 = r2
            if (r2 != 0) goto Lf
            r1.m255()
            r2 = 0
            r1.setActionBarHideOffset(r2)
        Lf:
            return
    }

    public void setIcon(int r2) {
            r1 = this;
            r1.m259()
            yq r1 = r1.f501
            b52 r1 = (p000.b52) r1
            if (r2 == 0) goto L14
            androidx.appcompat.widget.Toolbar r0 = r1.f1484
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = p000.ln0.m3603(r0, r2)
            goto L15
        L14:
            r2 = 0
        L15:
            r1.f1487 = r2
            r1.m746()
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.m259()
            yq r0 = r0.f501
            b52 r0 = (p000.b52) r0
            r0.f1487 = r1
            r0.m746()
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            r1.m259()
            yq r1 = r1.f501
            b52 r1 = (p000.b52) r1
            if (r2 == 0) goto L14
            androidx.appcompat.widget.Toolbar r0 = r1.f1484
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = p000.ln0.m3603(r0, r2)
            goto L15
        L14:
            r2 = 0
        L15:
            r1.f1488 = r2
            r1.m746()
            return
    }

    public void setOverlayMode(boolean r1) {
            r0 = this;
            r0.f503 = r1
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

    @Override // p000.InterfaceC0993xq
    public void setWindowCallback(android.view.Window.Callback r1) {
            r0 = this;
            r0.m259()
            yq r0 = r0.f501
            b52 r0 = (p000.b52) r0
            r0.f1494 = r1
            return
    }

    @Override // p000.InterfaceC0993xq
    public void setWindowTitle(java.lang.CharSequence r3) {
            r2 = this;
            r2.m259()
            yq r2 = r2.f501
            b52 r2 = (p000.b52) r2
            boolean r0 = r2.f1490
            if (r0 != 0) goto L23
            androidx.appcompat.widget.Toolbar r0 = r2.f1484
            r2.f1491 = r3
            int r1 = r2.f1485
            r1 = r1 & 8
            if (r1 == 0) goto L23
            r0.setTitle(r3)
            boolean r2 = r2.f1490
            if (r2 == 0) goto L23
            android.view.View r2 = r0.getRootView()
            p000.b92.m829(r2, r3)
        L23:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: α */
    public final void mo250(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L5
            r0.onNestedScrollAccepted(r1, r2, r3)
        L5:
            return
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: β */
    public final void mo251(android.view.ViewGroup r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            if (r6 != 0) goto L5
            r0.onNestedScroll(r1, r2, r3, r4, r5)
        L5:
            return
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: γ */
    public final void mo252(android.view.View r1, int r2) {
            r0 = this;
            if (r2 != 0) goto L5
            r0.onStopNestedScroll(r1)
        L5:
            return
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: δ */
    public final void mo253(int r1, int r2, int[] r3, int r4) {
            r0 = this;
            return
    }

    @Override // p000.d31
    /* JADX INFO: renamed from: ζ */
    public final void mo254(android.view.ViewGroup r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.mo251(r1, r2, r3, r4, r5, r6)
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m255() {
            r1 = this;
            ｊ r0 = r1.f493
            r1.removeCallbacks(r0)
            ｊ r0 = r1.f494
            r1.removeCallbacks(r0)
            android.view.ViewPropertyAnimator r1 = r1.f491
            if (r1 == 0) goto L11
            r1.cancel()
        L11:
            return
    }

    /* JADX INFO: renamed from: θ */
    public final void m256(android.content.Context r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = androidx.appcompat.widget.ActionBarOverlayLayout.f486
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            int r2 = r0.getDimensionPixelSize(r1, r1)
            r4.f497 = r2
            r2 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r2)
            r4.f502 = r3
            if (r3 != 0) goto L1f
            r1 = r2
        L1f:
            r4.setWillNotDraw(r1)
            r0.recycle()
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r5)
            r4.f490 = r0
            return
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: ι */
    public final boolean mo257(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto La
            boolean r0 = r0.onStartNestedScroll(r1, r2, r3)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final void m258(int r4) {
            r3 = this;
            r3.m259()
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
            yq r3 = r3.f501
            b52 r3 = (p000.b52) r3
            r3.getClass()
            android.util.Log.i(r2, r1)
            return
        L22:
            yq r3 = r3.f501
            b52 r3 = (p000.b52) r3
            r3.getClass()
            android.util.Log.i(r2, r1)
            return
    }

    /* JADX INFO: renamed from: λ */
    public final void m259() {
            r2 = this;
            androidx.appcompat.widget.ContentFrameLayout r0 = r2.f499
            if (r0 != 0) goto L46
            r0 = 2131296296(0x7f090028, float:1.8210505E38)
            android.view.View r0 = r2.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            r2.f499 = r0
            r0 = 2131296297(0x7f090029, float:1.8210507E38)
            android.view.View r0 = r2.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r0 = (androidx.appcompat.widget.ActionBarContainer) r0
            r2.f500 = r0
            r0 = 2131296295(0x7f090027, float:1.8210503E38)
            android.view.View r0 = r2.findViewById(r0)
            boolean r1 = r0 instanceof p000.InterfaceC1030yq
            if (r1 == 0) goto L28
            yq r0 = (p000.InterfaceC1030yq) r0
            goto L32
        L28:
            boolean r1 = r0 instanceof androidx.appcompat.widget.Toolbar
            if (r1 == 0) goto L35
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            yq r0 = r0.getWrapper()
        L32:
            r2.f501 = r0
            return
        L35:
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r0 = "Can't make a decor toolbar out of "
            java.lang.String r2 = r0.concat(r2)
            p000.C1080.m7279(r2)
        L46:
            return
    }

    /* JADX INFO: renamed from: μ */
    public final void m260(android.view.Menu r4, p000.tz0 r5) {
            r3 = this;
            r3.m259()
            yq r3 = r3.f501
            b52 r3 = (p000.b52) r3
            androidx.appcompat.widget.Toolbar r0 = r3.f1484
            androidx.appcompat.widget.γ r1 = r3.f1496
            if (r1 != 0) goto L18
            androidx.appcompat.widget.γ r1 = new androidx.appcompat.widget.γ
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            r3.f1496 = r1
        L18:
            androidx.appcompat.widget.γ r3 = r3.f1496
            r3.f794 = r5
            iz0 r4 = (p000.iz0) r4
            if (r4 != 0) goto L25
            androidx.appcompat.widget.ActionMenuView r5 = r0.f759
            if (r5 != 0) goto L25
            goto L2e
        L25:
            r0.m305()
            androidx.appcompat.widget.ActionMenuView r5 = r0.f759
            iz0 r5 = r5.f524
            if (r5 != r4) goto L2f
        L2e:
            return
        L2f:
            if (r5 == 0) goto L3b
            androidx.appcompat.widget.γ r1 = r0.f752
            r5.m2838(r1)
            v42 r1 = r0.f753
            r5.m2838(r1)
        L3b:
            v42 r5 = r0.f753
            if (r5 != 0) goto L46
            v42 r5 = new v42
            r5.<init>(r0)
            r0.f753 = r5
        L46:
            r5 = 1
            r3.f806 = r5
            android.content.Context r5 = r0.f768
            if (r4 == 0) goto L58
            r4.m2830(r3, r5)
            v42 r5 = r0.f753
            android.content.Context r1 = r0.f768
            r4.m2830(r5, r1)
            goto L6b
        L58:
            r4 = 0
            r3.mo328(r5, r4)
            v42 r5 = r0.f753
            android.content.Context r1 = r0.f768
            r5.mo328(r1, r4)
            r3.mo326()
            v42 r4 = r0.f753
            r4.mo326()
        L6b:
            androidx.appcompat.widget.ActionMenuView r4 = r0.f759
            int r5 = r0.f769
            r4.setPopupTheme(r5)
            androidx.appcompat.widget.ActionMenuView r4 = r0.f759
            r4.setPresenter(r3)
            r0.f752 = r3
            r0.m315()
            return
    }
}
