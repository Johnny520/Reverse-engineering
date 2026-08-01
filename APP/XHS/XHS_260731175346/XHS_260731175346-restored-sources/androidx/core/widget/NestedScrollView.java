package androidx.core.widget;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: ᛳᛸᛵᲀ, reason: contains not printable characters */
    public static final float f25 = 0.0f;

    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public static final int[] f26 = null;

    /* JADX INFO: renamed from: ᲁᛴᛴᛸ, reason: contains not printable characters */
    public static final xhss.C0273 f27 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public long f28;

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public final xhss.C0931 f29;

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public final xhss.C1106 f30;

    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public float f31;

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public final int[] f32;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final android.graphics.Rect f33;

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public boolean f34;

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public int f35;

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final int f36;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final android.widget.EdgeEffect f37;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final float f38;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public boolean f39;

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public final int f40;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public boolean f41;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public int f42;

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public final int f43;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public android.view.VelocityTracker f44;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public boolean f45;

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public xhss.C0116 f46;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public xhss.C0811 f47;

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public final int[] f48;

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public int f49;

    /* JADX INFO: renamed from: ᲁᲁᛴᲁ, reason: contains not printable characters */
    public final xhss.C1093 f50;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final android.widget.OverScroller f51;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final android.widget.EdgeEffect f52;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public boolean f53;

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public int f54;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public android.view.View f55;

    static {
            r0 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            double r0 = java.lang.Math.log(r0)
            r2 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r2 = java.lang.Math.log(r2)
            double r0 = r0 / r2
            float r0 = (float) r0
            androidx.core.widget.NestedScrollView.f25 = r0
            xhss.ᛳᛵᛷᛴ r0 = new xhss.ᛳᛵᛷᛴ
            r0.<init>()
            androidx.core.widget.NestedScrollView.f27 = r0
            r0 = 16843130(0x101017a, float:2.3694617E-38)
            int[] r0 = new int[]{r0}
            androidx.core.widget.NestedScrollView.f26 = r0
            return
    }

    public NestedScrollView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NestedScrollView(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = 1677918405(0x640300c5, float:9.666316E21)
            r7.<init>(r8, r9, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r7.f33 = r1
            r1 = 1
            r7.f41 = r1
            r2 = 0
            r7.f45 = r2
            r3 = 0
            r7.f55 = r3
            r7.f39 = r2
            r7.f34 = r1
            r4 = -1
            r7.f35 = r4
            r4 = 2
            int[] r5 = new int[r4]
            r7.f32 = r5
            int[] r4 = new int[r4]
            r7.f48 = r4
            xhss.ᲇᛵᛲᲁ r4 = new xhss.ᲇᛵᛲᲁ
            r5 = 15
            r4.<init>(r5, r7)
            xhss.ᲇᲁᛷᛵ r5 = new xhss.ᲇᲁᛷᛵ
            android.content.Context r6 = r7.getContext()
            r5.<init>(r6, r4)
            r7.f50 = r5
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L43
            android.widget.EdgeEffect r6 = xhss.AbstractC0621.m1083(r8, r9)
            goto L48
        L43:
            android.widget.EdgeEffect r6 = new android.widget.EdgeEffect
            r6.<init>(r8)
        L48:
            r7.f37 = r6
            if (r4 < r5) goto L51
            android.widget.EdgeEffect r4 = xhss.AbstractC0621.m1083(r8, r9)
            goto L56
        L51:
            android.widget.EdgeEffect r4 = new android.widget.EdgeEffect
            r4.<init>(r8)
        L56:
            r7.f52 = r4
            android.content.res.Resources r4 = r8.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1126170624(0x43200000, float:160.0)
            float r4 = r4 * r5
            r5 = 1136724797(0x43c10b3d, float:386.0878)
            float r4 = r4 * r5
            r5 = 1062668861(0x3f570a3d, float:0.84)
            float r4 = r4 * r5
            r7.f38 = r4
            android.widget.OverScroller r4 = new android.widget.OverScroller
            android.content.Context r5 = r7.getContext()
            r4.<init>(r5)
            r7.f51 = r4
            r7.setFocusable(r1)
            r4 = 262144(0x40000, float:3.67342E-40)
            r7.setDescendantFocusability(r4)
            r7.setWillNotDraw(r2)
            android.content.Context r4 = r7.getContext()
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            int r5 = r4.getScaledTouchSlop()
            r7.f36 = r5
            int r5 = r4.getScaledMinimumFlingVelocity()
            r7.f43 = r5
            int r4 = r4.getScaledMaximumFlingVelocity()
            r7.f40 = r4
            int[] r4 = androidx.core.widget.NestedScrollView.f26
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r9, r4, r0, r2)
            boolean r9 = r8.getBoolean(r2, r2)
            r7.setFillViewport(r9)
            r8.recycle()
            xhss.ᲁᛲᲁᲇ r8 = new xhss.ᲁᛲᲁᲇ
            r8.<init>()
            r7.f29 = r8
            xhss.ᲇᲈᛶᛸ r8 = new xhss.ᲇᲈᛶᛸ
            r8.<init>(r7)
            r7.f30 = r8
            r7.setNestedScrollingEnabled(r1)
            int r8 = xhss.AbstractC0624.f2154
            xhss.ᛳᛵᛷᛴ r8 = androidx.core.widget.NestedScrollView.f27
            if (r8 != 0) goto Ld3
            android.view.View$AccessibilityDelegate r9 = xhss.AbstractC0413.m803(r7)
            boolean r9 = r9 instanceof xhss.C0029
            if (r9 == 0) goto Ld3
            xhss.ᛲᛴᲀᲈ r8 = new xhss.ᛲᛴᲀᲈ
            r8.<init>()
        Ld3:
            int r9 = r7.getImportantForAccessibility()
            if (r9 != 0) goto Ldc
            r7.setImportantForAccessibility(r1)
        Ldc:
            if (r8 != 0) goto Ldf
            goto Le1
        Ldf:
            xhss.ᛱᛳᲁᲈ r3 = r8.f636
        Le1:
            r7.setAccessibilityDelegate(r3)
            return
    }

    private xhss.C0811 getScrollFeedbackProvider() {
            r1 = this;
            xhss.ᛸᲁᲀᲁ r0 = r1.f47
            if (r0 != 0) goto Lb
            xhss.ᛸᲁᲀᲁ r0 = new xhss.ᛸᲁᲀᲁ
            r0.<init>(r1)
            r1.f47 = r0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static boolean m2(android.view.View r1, androidx.core.widget.NestedScrollView r2) {
            if (r1 != r2) goto L3
            goto L13
        L3:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L15
            android.view.View r1 = (android.view.View) r1
            boolean r1 = m2(r1, r2)
            if (r1 == 0) goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2)
            return
        La:
            java.lang.String r1 = "ScrollView can host only one direct child"
            xhss.C0532.m950(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.String r1 = "ScrollView can host only one direct child"
            xhss.C0532.m950(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3, r4)
            return
        La:
            java.lang.String r1 = "ScrollView can host only one direct child"
            xhss.C0532.m950(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.String r1 = "ScrollView can host only one direct child"
            xhss.C0532.m950(r1)
            return
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
            r0 = this;
            int r0 = super.computeHorizontalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
            r0 = this;
            int r0 = super.computeHorizontalScrollOffset()
            return r0
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
            r0 = this;
            int r0 = super.computeHorizontalScrollRange()
            return r0
    }

    @Override // android.view.View
    public final void computeScroll() {
            r18 = this;
            r0 = r18
            android.widget.OverScroller r1 = r0.f51
            boolean r2 = r1.isFinished()
            if (r2 == 0) goto Lb
            return
        Lb:
            r1.computeScrollOffset()
            int r2 = r1.getCurrY()
            int r3 = r0.f49
            int r3 = r2 - r3
            int r4 = r0.getHeight()
            android.widget.EdgeEffect r5 = r0.f37
            android.widget.EdgeEffect r6 = r0.f52
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 0
            r9 = 1082130432(0x40800000, float:4.0)
            if (r3 <= 0) goto L46
            float r10 = xhss.AbstractC0955.m1568(r5)
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
            float r7 = xhss.AbstractC0955.m1556(r5, r8, r7)
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
            float r10 = xhss.AbstractC0955.m1568(r6)
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 == 0) goto L44
            float r8 = (float) r3
            float r8 = r8 * r9
            float r4 = (float) r4
            float r8 = r8 / r4
            float r4 = r4 / r9
            float r7 = xhss.AbstractC0955.m1556(r6, r8, r7)
            float r7 = r7 * r4
            int r4 = java.lang.Math.round(r7)
            if (r4 == r3) goto L43
            r6.finish()
            goto L43
        L64:
            r0.f49 = r2
            int[] r11 = r0.f48
            r2 = 1
            r3 = 0
            r11[r2] = r3
            r12 = 0
            xhss.ᲇᲈᛶᛸ r7 = r0.f30
            r8 = 0
            r10 = 1
            r7.m1804(r8, r9, r10, r11, r12)
            r17 = r11
            r4 = r17[r2]
            int r9 = r9 - r4
            int r4 = r0.getScrollRange()
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 35
            if (r7 < r8) goto L8e
            float r7 = r1.getCurrVelocity()
            float r7 = java.lang.Math.abs(r7)
            xhss.AbstractC0389.m766(r0, r7)
        L8e:
            if (r9 == 0) goto Lb4
            int r7 = r0.getScrollY()
            int r8 = r0.getScrollX()
            r0.m9(r9, r8, r7, r4)
            int r8 = r0.getScrollY()
            int r12 = r8 - r7
            int r14 = r9 - r12
            r17[r2] = r3
            r13 = 0
            xhss.ᲇᲈᛶᛸ r10 = r0.f30
            r11 = 0
            int[] r15 = r0.f32
            r16 = 1
            r10.m1802(r11, r12, r13, r14, r15, r16, r17)
            r3 = r17[r2]
            int r9 = r14 - r3
        Lb4:
            if (r9 == 0) goto Le5
            int r3 = r0.getOverScrollMode()
            if (r3 == 0) goto Lc0
            if (r3 != r2) goto Ldf
            if (r4 <= 0) goto Ldf
        Lc0:
            if (r9 >= 0) goto Ld1
            boolean r3 = r5.isFinished()
            if (r3 == 0) goto Ldf
            float r3 = r1.getCurrVelocity()
            int r3 = (int) r3
            r5.onAbsorb(r3)
            goto Ldf
        Ld1:
            boolean r3 = r6.isFinished()
            if (r3 == 0) goto Ldf
            float r3 = r1.getCurrVelocity()
            int r3 = (int) r3
            r6.onAbsorb(r3)
        Ldf:
            r1.abortAnimation()
            r0.m11(r2)
        Le5:
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Lef
            r0.postInvalidateOnAnimation()
            return
        Lef:
            r0.m11(r2)
            return
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
            r0 = this;
            int r0 = super.computeVerticalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
            r1 = this;
            r0 = 0
            int r1 = super.computeVerticalScrollOffset()
            int r1 = java.lang.Math.max(r0, r1)
            return r1
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
            int r4 = r4.getScrollY()
            int r1 = r2 - r1
            int r0 = java.lang.Math.max(r0, r1)
            if (r4 >= 0) goto L35
            int r2 = r2 - r4
            return r2
        L35:
            if (r4 <= r0) goto L3a
            int r4 = r4 - r0
            int r4 = r4 + r2
            return r4
        L3a:
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
            r6 = this;
            boolean r0 = super.dispatchKeyEvent(r7)
            r1 = 1
            if (r0 != 0) goto Lcc
            android.graphics.Rect r0 = r6.f33
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r2 = 0
            r3 = 130(0x82, float:1.82E-43)
            if (r0 <= 0) goto La1
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r0 = r0.getHeight()
            int r5 = r4.topMargin
            int r0 = r0 + r5
            int r4 = r4.bottomMargin
            int r0 = r0 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            if (r0 <= r4) goto La1
            int r0 = r7.getAction()
            if (r0 != 0) goto L65
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L91
            r4 = 20
            if (r0 == r4) goto L81
            r4 = 62
            if (r0 == r4) goto L76
            r7 = 92
            if (r0 == r7) goto L71
            r7 = 93
            if (r0 == r7) goto L6c
            r7 = 122(0x7a, float:1.71E-43)
            if (r0 == r7) goto L68
            r7 = 123(0x7b, float:1.72E-43)
            if (r0 == r7) goto L62
            goto L65
        L62:
            r6.m13(r3)
        L65:
            r6 = r2
            goto Lc8
        L68:
            r6.m13(r5)
            goto L65
        L6c:
            boolean r6 = r6.m15(r3)
            goto Lc8
        L71:
            boolean r6 = r6.m15(r5)
            goto Lc8
        L76:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L7d
            r3 = r5
        L7d:
            r6.m13(r3)
            goto L65
        L81:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L8c
            boolean r6 = r6.m15(r3)
            goto Lc8
        L8c:
            boolean r6 = r6.m7(r3)
            goto Lc8
        L91:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L9c
            boolean r6 = r6.m15(r5)
            goto Lc8
        L9c:
            boolean r6 = r6.m7(r5)
            goto Lc8
        La1:
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L65
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L65
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto Lb5
            r7 = 0
        Lb5:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L65
            if (r7 == r6) goto L65
            boolean r6 = r7.requestFocus(r3)
            if (r6 == 0) goto L65
            r6 = r1
        Lc8:
            if (r6 == 0) goto Lcb
            goto Lcc
        Lcb:
            return r2
        Lcc:
            return r1
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r3, float r4, boolean r5) {
            r2 = this;
            xhss.ᲇᲈᛶᛸ r2 = r2.f30
            boolean r0 = r2.f3578
            r1 = 0
            if (r0 == 0) goto L2d
            android.view.ViewParent r0 = r2.m1803(r1)
            if (r0 == 0) goto L2d
            androidx.core.widget.NestedScrollView r2 = r2.f3575
            boolean r2 = r0.onNestedFling(r2, r3, r4, r5)     // Catch: java.lang.AbstractMethodError -> L14
            return r2
        L14:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ViewParent "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " does not implement interface method onNestedFling"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ViewParentCompat"
            android.util.Log.e(r4, r3, r2)
        L2d:
            return r1
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r3, float r4) {
            r2 = this;
            xhss.ᲇᲈᛶᛸ r2 = r2.f30
            boolean r0 = r2.f3578
            r1 = 0
            if (r0 == 0) goto L2d
            android.view.ViewParent r0 = r2.m1803(r1)
            if (r0 == 0) goto L2d
            androidx.core.widget.NestedScrollView r2 = r2.f3575
            boolean r2 = r0.onNestedPreFling(r2, r3, r4)     // Catch: java.lang.AbstractMethodError -> L14
            return r2
        L14:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ViewParent "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " does not implement interface method onNestedPreFling"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ViewParentCompat"
            android.util.Log.e(r4, r3, r2)
        L2d:
            return r1
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            r3 = 0
            xhss.ᲇᲈᛶᛸ r0 = r6.f30
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            boolean r6 = r0.m1804(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
            r8 = this;
            r6 = 0
            r7 = 0
            xhss.ᲇᲈᛶᛸ r0 = r8.f30
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            boolean r8 = r0.m1802(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r11) {
            r10 = this;
            super.draw(r11)
            int r0 = r10.getScrollY()
            android.widget.EdgeEffect r1 = r10.f37
            boolean r2 = r1.isFinished()
            r3 = 0
            if (r2 != 0) goto L59
            int r2 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = java.lang.Math.min(r3, r0)
            boolean r7 = r10.getClipToPadding()
            if (r7 == 0) goto L44
            int r7 = r10.getPaddingLeft()
            int r8 = r10.getPaddingRight()
            int r8 = r8 + r7
            int r4 = r4 - r8
            int r7 = r10.getPaddingLeft()
            int r8 = r10.getPaddingTop()
            int r9 = r10.getPaddingBottom()
            int r9 = r9 + r8
            int r5 = r5 - r9
            int r8 = r10.getPaddingTop()
            int r6 = r6 + r8
            goto L45
        L44:
            r7 = r3
        L45:
            float r7 = (float) r7
            float r6 = (float) r6
            r11.translate(r7, r6)
            r1.setSize(r4, r5)
            boolean r1 = r1.draw(r11)
            if (r1 == 0) goto L56
            r10.postInvalidateOnAnimation()
        L56:
            r11.restoreToCount(r2)
        L59:
            android.widget.EdgeEffect r1 = r10.f52
            boolean r2 = r1.isFinished()
            if (r2 != 0) goto Lbb
            int r2 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = r10.getScrollRange()
            int r0 = java.lang.Math.max(r6, r0)
            int r0 = r0 + r5
            boolean r6 = r10.getClipToPadding()
            if (r6 == 0) goto L8a
            int r3 = r10.getPaddingLeft()
            int r6 = r10.getPaddingRight()
            int r6 = r6 + r3
            int r4 = r4 - r6
            int r3 = r10.getPaddingLeft()
        L8a:
            boolean r6 = r10.getClipToPadding()
            if (r6 == 0) goto L9f
            int r6 = r10.getPaddingTop()
            int r7 = r10.getPaddingBottom()
            int r7 = r7 + r6
            int r5 = r5 - r7
            int r6 = r10.getPaddingBottom()
            int r0 = r0 - r6
        L9f:
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
            if (r0 == 0) goto Lb8
            r10.postInvalidateOnAnimation()
        Lb8:
            r11.restoreToCount(r2)
        Lbb:
            return
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
            r5 = this;
            int r0 = r5.getChildCount()
            if (r0 != 0) goto L8
            r5 = 0
            return r5
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
            int r5 = r5.getScrollY()
            int r0 = r0 - r5
            int r0 = r0 - r3
            if (r0 >= r2) goto L33
            float r5 = (float) r0
            float r0 = (float) r2
            float r5 = r5 / r0
            return r5
        L33:
            r5 = 1065353216(0x3f800000, float:1.0)
            return r5
    }

    public int getMaxScrollAmount() {
            r1 = this;
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            int r1 = (int) r1
            return r1
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            xhss.ᲁᛲᲁᲇ r1 = r1.f29
            int r0 = r1.f3017
            int r1 = r1.f3016
            r1 = r1 | r0
            return r1
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
            int r4 = r4.getPaddingBottom()
            int r2 = r2 - r4
            int r0 = r0 - r2
            int r4 = java.lang.Math.max(r1, r0)
            return r4
        L2f:
            return r1
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r1.getVerticalFadingEdgeLength()
            int r1 = r1.getScrollY()
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            return r1
        L16:
            r1 = 1065353216(0x3f800000, float:1.0)
            return r1
    }

    public float getVerticalScrollFactorCompat() {
            r6 = this;
            float r0 = r6.f31
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L33
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r2 = r6.getContext()
            android.content.res.Resources$Theme r3 = r2.getTheme()
            r4 = 16842829(0x101004d, float:2.3693774E-38)
            r5 = 1
            boolean r3 = r3.resolveAttribute(r4, r0, r5)
            if (r3 == 0) goto L2d
            android.content.res.Resources r1 = r2.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r0 = r0.getDimension(r1)
            r6.f31 = r0
            return r0
        L2d:
            java.lang.String r6 = "Expected theme to define listPreferredItemHeight."
            xhss.C0532.m950(r6)
            return r1
        L33:
            return r0
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
            r1 = this;
            xhss.ᲇᲈᛶᛸ r1 = r1.f30
            r0 = 0
            android.view.ViewParent r1 = r1.m1803(r0)
            if (r1 == 0) goto Lb
            r1 = 1
            return r1
        Lb:
            return r0
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
            r0 = this;
            xhss.ᲇᲈᛶᛸ r0 = r0.f30
            boolean r0 = r0.f3578
            return r0
    }

    @Override // android.view.ViewGroup
    public final void measureChild(android.view.View r2, int r3, int r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            int r0 = r1.getPaddingLeft()
            int r1 = r1.getPaddingRight()
            int r1 = r1 + r0
            int r4 = r4.width
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r3, r1, r4)
            r3 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r2.measure(r1, r3)
            return
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r5 = r0.getPaddingLeft()
            int r0 = r0.getPaddingRight()
            int r0 = r0 + r5
            int r5 = r4.leftMargin
            int r0 = r0 + r5
            int r5 = r4.rightMargin
            int r0 = r0 + r5
            int r0 = r0 + r3
            int r3 = r4.width
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r0, r3)
            int r2 = r4.topMargin
            int r3 = r4.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            r1.measure(r0, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            r1.f45 = r0
            return
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent r28) {
            r27 = this;
            r0 = r27
            r3 = r28
            int r1 = r3.getAction()
            r2 = 8
            if (r1 != r2) goto L334
            boolean r1 = r0.f39
            if (r1 != 0) goto L334
            int r1 = r3.getSource()
            r8 = 2
            r1 = r1 & r8
            r9 = 4194304(0x400000, float:5.877472E-39)
            r10 = 0
            r11 = 26
            if (r1 != r8) goto L2e
            r1 = 9
            float r2 = r3.getAxisValue(r1)
            float r4 = r3.getX()
            int r4 = (int) r4
            r26 = r2
            r2 = r1
            r1 = r26
            goto L45
        L2e:
            int r1 = r3.getSource()
            r1 = r1 & r9
            if (r1 != r9) goto L42
            float r2 = r3.getAxisValue(r11)
            int r1 = r0.getWidth()
            int r4 = r1 / 2
            r1 = r2
            r2 = r11
            goto L45
        L42:
            r1 = r10
            r2 = 0
            r4 = 0
        L45:
            int r5 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r5 == 0) goto L334
            float r5 = r0.getVerticalScrollFactorCompat()
            float r5 = r5 * r1
            int r1 = (int) r5
            int r5 = r3.getSource()
            r6 = 8194(0x2002, float:1.1482E-41)
            r5 = r5 & r6
            if (r5 != r6) goto L5a
            r6 = 1
            goto L5b
        L5a:
            r6 = 0
        L5b:
            int r1 = -r1
            r5 = 1
            r0.m8(r1, r2, r3, r4, r5, r6)
            if (r2 == 0) goto L30a
            xhss.ᲇᲁᛷᛵ r0 = r0.f50
            xhss.ᲇᛵᛲᲁ r1 = r0.f3519
            java.lang.Object r1 = r1.f3349
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            int[] r4 = r0.f3523
            int r5 = r3.getSource()
            int r6 = r3.getDeviceId()
            int r13 = r0.f3526
            r14 = 34
            if (r13 != r5) goto L8a
            int r13 = r0.f3524
            if (r13 != r6) goto L8a
            int r13 = r0.f3521
            if (r13 == r2) goto L83
            goto L8a
        L83:
            r7 = 0
            r16 = 1
            r19 = 0
            goto L12d
        L8a:
            android.content.Context r13 = r0.f3522
            r16 = 1
            android.view.ViewConfiguration r12 = android.view.ViewConfiguration.get(r13)
            int r8 = r3.getDeviceId()
            int r10 = r3.getSource()
            r19 = 0
            int r7 = android.os.Build.VERSION.SDK_INT
            java.lang.String r15 = "android"
            java.lang.String r11 = "dimen"
            r9 = -1
            if (r7 < r14) goto Laa
            int r8 = xhss.AbstractC0449.m827(r12, r8, r2, r10)
            goto Ldd
        Laa:
            android.view.InputDevice r8 = android.view.InputDevice.getDevice(r8)
            if (r8 == 0) goto Lda
            android.view.InputDevice$MotionRange r8 = r8.getMotionRange(r2, r10)
            if (r8 == 0) goto Lda
            android.content.res.Resources r8 = r13.getResources()
            r14 = 4194304(0x400000, float:5.877472E-39)
            if (r10 != r14) goto Lc9
            r10 = 26
            if (r2 != r10) goto Lc9
            java.lang.String r10 = "config_viewMinRotaryEncoderFlingVelocity"
            int r10 = r8.getIdentifier(r10, r11, r15)
            goto Lca
        Lc9:
            r10 = r9
        Lca:
            if (r10 == r9) goto Ld5
            if (r10 == 0) goto Lda
            int r8 = r8.getDimensionPixelSize(r10)
            if (r8 >= 0) goto Ldd
            goto Lda
        Ld5:
            int r8 = r12.getScaledMinimumFlingVelocity()
            goto Ldd
        Lda:
            r8 = 2147483647(0x7fffffff, float:NaN)
        Ldd:
            r4[r19] = r8
            int r8 = r3.getDeviceId()
            int r10 = r3.getSource()
            r14 = 34
            if (r7 < r14) goto Lf0
            int r7 = xhss.AbstractC0449.m822(r12, r8, r2, r10)
            goto L123
        Lf0:
            android.view.InputDevice r7 = android.view.InputDevice.getDevice(r8)
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L122
            android.view.InputDevice$MotionRange r7 = r7.getMotionRange(r2, r10)
            if (r7 == 0) goto L122
            android.content.res.Resources r7 = r13.getResources()
            r14 = 4194304(0x400000, float:5.877472E-39)
            if (r10 != r14) goto L111
            r10 = 26
            if (r2 != r10) goto L111
            java.lang.String r10 = "config_viewMaxRotaryEncoderFlingVelocity"
            int r10 = r7.getIdentifier(r10, r11, r15)
            goto L112
        L111:
            r10 = r9
        L112:
            if (r10 == r9) goto L11d
            if (r10 == 0) goto L122
            int r7 = r7.getDimensionPixelSize(r10)
            if (r7 >= 0) goto L123
            goto L122
        L11d:
            int r7 = r12.getScaledMaximumFlingVelocity()
            goto L123
        L122:
            r7 = r8
        L123:
            r4[r16] = r7
            r0.f3526 = r5
            r0.f3524 = r6
            r0.f3521 = r2
            r7 = r16
        L12d:
            r5 = r4[r19]
            android.view.VelocityTracker r6 = r0.f3520
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r8) goto L13f
            if (r6 == 0) goto L333
            r6.recycle()
            r1 = 0
            r0.f3520 = r1
            return r16
        L13f:
            if (r6 != 0) goto L147
            android.view.VelocityTracker r6 = android.view.VelocityTracker.obtain()
            r0.f3520 = r6
        L147:
            java.util.Map r5 = xhss.AbstractC0244.f912
            r6.addMovement(r3)
            int r5 = android.os.Build.VERSION.SDK_INT
            r8 = 20
            r14 = 34
            if (r5 < r14) goto L155
            goto L1ac
        L155:
            int r5 = r3.getSource()
            r14 = 4194304(0x400000, float:5.877472E-39)
            if (r5 != r14) goto L1ac
            java.util.Map r5 = xhss.AbstractC0244.f912
            boolean r9 = r5.containsKey(r6)
            if (r9 != 0) goto L16d
            xhss.ᛸᛳ r9 = new xhss.ᛸᛳ
            r9.<init>()
            r5.put(r6, r9)
        L16d:
            java.lang.Object r5 = r5.get(r6)
            xhss.ᛸᛳ r5 = (xhss.C0740) r5
            long[] r9 = r5.f2473
            long r10 = r3.getEventTime()
            int r12 = r5.f2477
            if (r12 == 0) goto L191
            int r13 = r5.f2475
            r13 = r9[r13]
            long r13 = r10 - r13
            r21 = 40
            int r13 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r13 <= 0) goto L191
            r13 = r19
            r5.f2477 = r13
            r12 = 0
            r5.f2474 = r12
            r12 = 0
        L191:
            int r13 = r5.f2475
            int r13 = r13 + 1
            int r13 = r13 % r8
            r5.f2475 = r13
            if (r12 == r8) goto L19e
            int r12 = r12 + 1
            r5.f2477 = r12
        L19e:
            float[] r12 = r5.f2476
            r14 = 26
            float r3 = r3.getAxisValue(r14)
            r12[r13] = r3
            int r3 = r5.f2475
            r9[r3] = r10
        L1ac:
            r3 = 1000(0x3e8, float:1.401E-42)
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r6.computeCurrentVelocity(r3, r5)
            java.util.Map r3 = xhss.AbstractC0244.f912
            java.lang.Object r3 = r3.get(r6)
            xhss.ᛸᛳ r3 = (xhss.C0740) r3
            if (r3 == 0) goto L2ad
            float[] r9 = r3.f2476
            long[] r10 = r3.f2473
            int r11 = r3.f2477
            r12 = 2
            if (r11 >= r12) goto L1ce
            r23 = r4
            r27 = r5
        L1cb:
            r4 = 0
            goto L286
        L1ce:
            int r12 = r3.f2475
            int r13 = r12 + 20
            int r11 = r11 + (-1)
            int r13 = r13 - r11
            int r13 = r13 % r8
            r11 = r10[r12]
        L1d8:
            r14 = r10[r13]
            long r21 = r11 - r14
            r23 = 100
            int r20 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            r27 = r5
            int r5 = r3.f2477
            if (r20 <= 0) goto L1f0
            int r5 = r5 + (-1)
            r3.f2477 = r5
            int r13 = r13 + 1
            int r13 = r13 % r8
            r5 = r27
            goto L1d8
        L1f0:
            r20 = r8
            r8 = 2
            if (r5 >= r8) goto L1f8
        L1f5:
            r23 = r4
            goto L1cb
        L1f8:
            if (r5 != r8) goto L20f
            int r13 = r13 + 1
            int r13 = r13 % 20
            r10 = r10[r13]
            int r5 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r5 != 0) goto L205
            goto L1f5
        L205:
            r5 = r9[r13]
            long r10 = r10 - r14
            float r8 = (float) r10
            float r5 = r5 / r8
            r23 = r4
            r4 = r5
            goto L286
        L20f:
            r5 = 0
            r8 = 0
            r11 = 0
        L212:
            int r12 = r3.f2477
            int r12 = r12 + (-1)
            r14 = 1073741824(0x40000000, float:2.0)
            r15 = 1065353216(0x3f800000, float:1.0)
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 >= r12) goto L26e
            int r12 = r8 + r13
            int r21 = r12 % 20
            r21 = r10[r21]
            int r12 = r12 + 1
            int r12 = r12 % 20
            r23 = r10[r12]
            int r23 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r23 != 0) goto L231
            r23 = r4
            goto L267
        L231:
            int r11 = r11 + 1
            r18 = 0
            int r23 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r23 >= 0) goto L23b
            r15 = r17
        L23b:
            float r17 = java.lang.Math.abs(r5)
            float r14 = r14 * r17
            r23 = r4
            r28 = r5
            double r4 = (double) r14
            double r4 = java.lang.Math.sqrt(r4)
            float r4 = (float) r4
            float r15 = r15 * r4
            r4 = r9[r12]
            r24 = r10[r12]
            r12 = r4
            long r4 = r24 - r21
            float r4 = (float) r4
            float r4 = r12 / r4
            float r5 = r4 - r15
            float r4 = java.lang.Math.abs(r4)
            float r4 = r4 * r5
            float r4 = r4 + r28
            r5 = r16
            if (r11 != r5) goto L266
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r5
        L266:
            r5 = r4
        L267:
            int r8 = r8 + 1
            r4 = r23
            r16 = 1
            goto L212
        L26e:
            r23 = r4
            r28 = r5
            r18 = 0
            int r4 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r4 >= 0) goto L27a
            r15 = r17
        L27a:
            float r4 = java.lang.Math.abs(r28)
            float r4 = r4 * r14
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            float r4 = (float) r4
            float r4 = r4 * r15
        L286:
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 * r5
            r3.f2474 = r4
            float r5 = java.lang.Math.abs(r27)
            float r5 = -r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L29c
            float r4 = java.lang.Math.abs(r27)
            float r4 = -r4
            r3.f2474 = r4
            goto L2af
        L29c:
            float r4 = r3.f2474
            float r5 = java.lang.Math.abs(r27)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L2af
            float r4 = java.lang.Math.abs(r27)
            r3.f2474 = r4
            goto L2af
        L2ad:
            r23 = r4
        L2af:
            int r3 = android.os.Build.VERSION.SDK_INT
            r14 = 34
            if (r3 < r14) goto L2ba
            float r2 = xhss.AbstractC0449.m820(r6, r2)
            goto L2dc
        L2ba:
            if (r2 != 0) goto L2c1
            float r2 = r6.getXVelocity()
            goto L2dc
        L2c1:
            r5 = 1
            if (r2 != r5) goto L2c9
            float r2 = r6.getYVelocity()
            goto L2dc
        L2c9:
            java.util.Map r3 = xhss.AbstractC0244.f912
            java.lang.Object r3 = r3.get(r6)
            xhss.ᛸᛳ r3 = (xhss.C0740) r3
            if (r3 == 0) goto L2db
            r10 = 26
            if (r2 == r10) goto L2d8
            goto L2db
        L2d8:
            float r2 = r3.f2474
            goto L2dc
        L2db:
            r2 = 0
        L2dc:
            float r3 = r1.getVerticalScrollFactorCompat()
            float r3 = -r3
            float r2 = r2 * r3
            float r3 = java.lang.Math.signum(r2)
            if (r7 != 0) goto L2f8
            float r4 = r0.f3525
            float r4 = java.lang.Math.signum(r4)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L2fd
            r18 = 0
            int r3 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r3 == 0) goto L2fd
        L2f8:
            android.widget.OverScroller r3 = r1.f51
            r3.abortAnimation()
        L2fd:
            float r3 = java.lang.Math.abs(r2)
            r19 = 0
            r4 = r23[r19]
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L30d
        L30a:
            r16 = 1
            goto L333
        L30d:
            r16 = 1
            r3 = r23[r16]
            int r4 = -r3
            float r4 = (float) r4
            float r3 = (float) r3
            float r2 = java.lang.Math.min(r2, r3)
            float r2 = java.lang.Math.max(r4, r2)
            r18 = 0
            int r3 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r3 != 0) goto L325
            r10 = r18
            goto L32f
        L325:
            android.widget.OverScroller r3 = r1.f51
            r3.abortAnimation()
            int r3 = (int) r2
            r1.m4(r3)
            r10 = r2
        L32f:
            r0.f3525 = r10
            r16 = 1
        L333:
            return r16
        L334:
            r19 = 0
            return r19
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
            r12 = this;
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto Ld
            boolean r3 = r12.f39
            if (r3 == 0) goto Ld
            return r1
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto Lad
            r5 = -1
            if (r0 == r1) goto L81
            if (r0 == r2) goto L25
            r1 = 3
            if (r0 == r1) goto L81
            r1 = 6
            if (r0 == r1) goto L20
            goto L12c
        L20:
            r12.m10(r13)
            goto L12c
        L25:
            int r0 = r12.f35
            if (r0 != r5) goto L2b
            goto L12c
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
            goto L12c
        L4b:
            float r0 = r13.getY(r3)
            int r0 = (int) r0
            int r3 = r12.f42
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.f36
            if (r3 <= r5) goto L12c
            int r3 = r12.getNestedScrollAxes()
            r2 = r2 & r3
            if (r2 != 0) goto L12c
            r12.f39 = r1
            r12.f42 = r0
            android.view.VelocityTracker r0 = r12.f44
            if (r0 != 0) goto L71
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f44 = r0
        L71:
            r0.addMovement(r13)
            r12.f54 = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L12c
            r13.requestDisallowInterceptTouchEvent(r1)
            goto L12c
        L81:
            r12.f39 = r4
            r12.f35 = r5
            android.view.VelocityTracker r13 = r12.f44
            if (r13 == 0) goto L8e
            r13.recycle()
            r12.f44 = r3
        L8e:
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r10 = 0
            int r11 = r12.getScrollRange()
            android.widget.OverScroller r5 = r12.f51
            r8 = 0
            r9 = 0
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto La8
            r12.postInvalidateOnAnimation()
        La8:
            r12.m11(r4)
            goto L12c
        Lad:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            android.widget.OverScroller r7 = r12.f51
            if (r6 <= 0) goto L113
            int r6 = r12.getScrollY()
            android.view.View r8 = r12.getChildAt(r4)
            int r9 = r8.getTop()
            int r9 = r9 - r6
            if (r0 < r9) goto L113
            int r9 = r8.getBottom()
            int r9 = r9 - r6
            if (r0 >= r9) goto L113
            int r6 = r8.getLeft()
            if (r5 < r6) goto L113
            int r6 = r8.getRight()
            if (r5 >= r6) goto L113
            r12.f42 = r0
            int r0 = r13.getPointerId(r4)
            r12.f35 = r0
            android.view.VelocityTracker r0 = r12.f44
            if (r0 != 0) goto Lf4
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f44 = r0
            goto Lf7
        Lf4:
            r0.clear()
        Lf7:
            android.view.VelocityTracker r0 = r12.f44
            r0.addMovement(r13)
            r7.computeScrollOffset()
            boolean r13 = r12.m6(r13)
            if (r13 != 0) goto L10d
            boolean r13 = r7.isFinished()
            if (r13 != 0) goto L10c
            goto L10d
        L10c:
            r1 = r4
        L10d:
            r12.f39 = r1
            r12.m5(r2, r4)
            goto L12c
        L113:
            boolean r13 = r12.m6(r13)
            if (r13 != 0) goto L121
            boolean r13 = r7.isFinished()
            if (r13 != 0) goto L120
            goto L121
        L120:
            r1 = r4
        L121:
            r12.f39 = r1
            android.view.VelocityTracker r13 = r12.f44
            if (r13 == 0) goto L12c
            r13.recycle()
            r12.f44 = r3
        L12c:
            boolean r12 = r12.f39
            return r12
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = 0
            r1.f41 = r2
            android.view.View r3 = r1.f55
            if (r3 == 0) goto L23
            boolean r3 = m2(r3, r1)
            if (r3 == 0) goto L23
            android.view.View r3 = r1.f55
            android.graphics.Rect r5 = r1.f33
            r3.getDrawingRect(r5)
            r1.offsetDescendantRectToMyCoords(r3, r5)
            int r3 = r1.m3(r5)
            if (r3 == 0) goto L23
            r1.scrollBy(r2, r3)
        L23:
            r3 = 0
            r1.f55 = r3
            boolean r5 = r1.f45
            if (r5 != 0) goto L7c
            xhss.ᛱᲈᛸᛵ r5 = r1.f46
            if (r5 == 0) goto L3b
            int r5 = r1.getScrollX()
            xhss.ᛱᲈᛸᛵ r0 = r1.f46
            int r0 = r0.f500
            r1.scrollTo(r5, r0)
            r1.f46 = r3
        L3b:
            int r3 = r1.getChildCount()
            if (r3 <= 0) goto L56
            android.view.View r3 = r1.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            int r3 = r3.getMeasuredHeight()
            int r0 = r5.topMargin
            int r3 = r3 + r0
            int r5 = r5.bottomMargin
            int r3 = r3 + r5
            goto L57
        L56:
            r3 = r2
        L57:
            int r6 = r6 - r4
            int r4 = r1.getPaddingTop()
            int r6 = r6 - r4
            int r4 = r1.getPaddingBottom()
            int r6 = r6 - r4
            int r4 = r1.getScrollY()
            if (r6 >= r3) goto L73
            if (r4 >= 0) goto L6b
            goto L73
        L6b:
            int r2 = r6 + r4
            if (r2 <= r3) goto L72
            int r2 = r3 - r6
            goto L73
        L72:
            r2 = r4
        L73:
            if (r2 == r4) goto L7c
            int r3 = r1.getScrollX()
            r1.scrollTo(r3, r2)
        L7c:
            int r2 = r1.getScrollX()
            int r3 = r1.getScrollY()
            r1.scrollTo(r2, r3)
            r2 = 1
            r1.f45 = r2
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r0 = r4.f53
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
            int r4 = r4.getPaddingRight()
            int r4 = r4 + r1
            int r1 = r0.leftMargin
            int r4 = r4 + r1
            int r1 = r0.rightMargin
            int r4 = r4 + r1
            int r0 = r0.width
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r5, r4, r0)
            r5 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            r6.measure(r4, r5)
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
            r0.m4(r1)
            return r2
        Lc:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            boolean r0 = r0.dispatchNestedPreFling(r2, r3)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r5 = 0
            xhss.ᲇᲈᛶᛸ r0 = r6.f30
            r3 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            r0.m1804(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r1 = 0
            r2 = 0
            r0.m14(r5, r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            xhss.ᲁᛲᲁᲇ r1 = r0.f29
            r1.f3017 = r3
            r1 = 2
            r2 = 0
            r0.m5(r1, r2)
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
            boolean r3 = r3.m16(r0, r1, r2)
            if (r3 != 0) goto L2e
        L2d:
            return r1
        L2e:
            boolean r3 = r0.requestFocus(r4, r5)
            return r3
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof xhss.C0116
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            xhss.ᛱᲈᛸᛵ r2 = (xhss.C0116) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            r1.f46 = r2
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            xhss.ᛱᲈᛸᛵ r1 = new xhss.ᛱᲈᛸᛵ
            r1.<init>(r0)
            int r2 = r2.getScrollY()
            r1.f500 = r2
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
            if (r1 == 0) goto L2c
            if (r0 != r1) goto Lc
            goto L2c
        Lc:
            r2 = 0
            boolean r3 = r0.m16(r1, r2, r4)
            if (r3 == 0) goto L2c
            android.graphics.Rect r3 = r0.f33
            r1.getDrawingRect(r3)
            r0.offsetDescendantRectToMyCoords(r1, r3)
            int r1 = r0.m3(r3)
            if (r1 == 0) goto L2c
            boolean r3 = r0.f34
            if (r3 == 0) goto L29
            r0.m17(r2, r1, r2)
            return
        L29:
            r0.scrollBy(r2, r1)
        L2c:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            r0 = r3 & 2
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            xhss.ᲁᛲᲁᲇ r2 = r1.f29
            r0 = 0
            r2.f3017 = r0
            r1.m11(r0)
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
            r19 = this;
            r0 = r19
            r3 = r20
            android.view.VelocityTracker r1 = r0.f44
            if (r1 != 0) goto Le
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.f44 = r1
        Le:
            int r1 = r3.getActionMasked()
            r2 = 0
            if (r1 != 0) goto L17
            r0.f54 = r2
        L17:
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r3)
            int r4 = r0.f54
            float r4 = (float) r4
            r5 = 0
            r7.offsetLocation(r5, r4)
            r4 = 2
            r8 = 1
            if (r1 == 0) goto L1e1
            r6 = 0
            r9 = -1
            android.widget.EdgeEffect r10 = r0.f37
            android.widget.EdgeEffect r11 = r0.f52
            if (r1 == r8) goto L158
            if (r1 == r4) goto L9e
            r4 = 3
            if (r1 == r4) goto L60
            r2 = 5
            if (r1 == r2) goto L4d
            r2 = 6
            if (r1 == r2) goto L3b
            goto L213
        L3b:
            r19.m10(r20)
            int r1 = r0.f35
            int r1 = r3.findPointerIndex(r1)
            float r1 = r3.getY(r1)
            int r1 = (int) r1
            r0.f42 = r1
            goto L213
        L4d:
            int r1 = r3.getActionIndex()
            float r2 = r3.getY(r1)
            int r2 = (int) r2
            r0.f42 = r2
            int r1 = r3.getPointerId(r1)
            r0.f35 = r1
            goto L213
        L60:
            boolean r1 = r0.f39
            if (r1 == 0) goto L86
            int r1 = r0.getChildCount()
            if (r1 <= 0) goto L86
            int r13 = r0.getScrollX()
            int r14 = r0.getScrollY()
            r17 = 0
            int r18 = r0.getScrollRange()
            android.widget.OverScroller r12 = r0.f51
            r15 = 0
            r16 = 0
            boolean r1 = r12.springBack(r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L86
            r0.postInvalidateOnAnimation()
        L86:
            r0.f35 = r9
            r0.f39 = r2
            android.view.VelocityTracker r1 = r0.f44
            if (r1 == 0) goto L93
            r1.recycle()
            r0.f44 = r6
        L93:
            r0.m11(r2)
            r10.onRelease()
            r11.onRelease()
            goto L213
        L9e:
            int r1 = r0.f35
            int r1 = r3.findPointerIndex(r1)
            if (r1 != r9) goto Lc2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid pointerId="
            r1.<init>(r2)
            int r2 = r0.f35
            r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NestedScrollView"
            android.util.Log.e(r2, r1)
            goto L213
        Lc2:
            float r2 = r3.getY(r1)
            int r9 = (int) r2
            int r2 = r0.f42
            int r2 = r2 - r9
            float r4 = r3.getX(r1)
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r4 = r4 / r6
            float r6 = (float) r2
            int r12 = r0.getHeight()
            float r12 = (float) r12
            float r6 = r6 / r12
            float r12 = xhss.AbstractC0955.m1568(r10)
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto Lf6
            float r6 = -r6
            float r4 = xhss.AbstractC0955.m1556(r10, r6, r4)
            float r4 = -r4
            float r6 = xhss.AbstractC0955.m1568(r10)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto Lf4
            r10.onRelease()
        Lf4:
            r5 = r4
            goto L111
        Lf6:
            float r10 = xhss.AbstractC0955.m1568(r11)
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 == 0) goto L111
            r10 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 - r4
            float r4 = xhss.AbstractC0955.m1556(r11, r6, r10)
            float r6 = xhss.AbstractC0955.m1568(r11)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto Lf4
            r11.onRelease()
            goto Lf4
        L111:
            int r4 = r0.getHeight()
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            if (r4 == 0) goto L120
            r0.invalidate()
        L120:
            int r2 = r2 - r4
            boolean r4 = r0.f39
            if (r4 != 0) goto L13d
            int r4 = java.lang.Math.abs(r2)
            int r5 = r0.f36
            if (r4 <= r5) goto L13d
            android.view.ViewParent r4 = r0.getParent()
            if (r4 == 0) goto L136
            r4.requestDisallowInterceptTouchEvent(r8)
        L136:
            r0.f39 = r8
            if (r2 <= 0) goto L13c
            int r2 = r2 - r5
            goto L13d
        L13c:
            int r2 = r2 + r5
        L13d:
            boolean r4 = r0.f39
            if (r4 == 0) goto L213
            float r1 = r3.getX(r1)
            int r4 = (int) r1
            r5 = 0
            r6 = 0
            r1 = r2
            r2 = 1
            int r1 = r0.m8(r1, r2, r3, r4, r5, r6)
            int r9 = r9 - r1
            r0.f42 = r9
            int r2 = r0.f54
            int r2 = r2 + r1
            r0.f54 = r2
            goto L213
        L158:
            android.view.VelocityTracker r1 = r0.f44
            int r3 = r0.f40
            float r3 = (float) r3
            r4 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r4, r3)
            int r3 = r0.f35
            float r1 = r1.getYVelocity(r3)
            int r1 = (int) r1
            int r3 = java.lang.Math.abs(r1)
            int r4 = r0.f43
            if (r3 < r4) goto L1ae
            float r3 = xhss.AbstractC0955.m1568(r10)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L188
            boolean r3 = r0.m12(r10, r1)
            if (r3 == 0) goto L183
            r10.onAbsorb(r1)
            goto L1ca
        L183:
            int r1 = -r1
            r0.m4(r1)
            goto L1ca
        L188:
            float r3 = xhss.AbstractC0955.m1568(r11)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L19f
            int r1 = -r1
            boolean r3 = r0.m12(r11, r1)
            if (r3 == 0) goto L19b
            r11.onAbsorb(r1)
            goto L1ca
        L19b:
            r0.m4(r1)
            goto L1ca
        L19f:
            int r1 = -r1
            float r3 = (float) r1
            boolean r4 = r0.dispatchNestedPreFling(r5, r3)
            if (r4 != 0) goto L1ca
            r0.dispatchNestedFling(r5, r3, r8)
            r0.m4(r1)
            goto L1ca
        L1ae:
            int r13 = r0.getScrollX()
            int r14 = r0.getScrollY()
            r17 = 0
            int r18 = r0.getScrollRange()
            android.widget.OverScroller r12 = r0.f51
            r15 = 0
            r16 = 0
            boolean r1 = r12.springBack(r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L1ca
            r0.postInvalidateOnAnimation()
        L1ca:
            r0.f35 = r9
            r0.f39 = r2
            android.view.VelocityTracker r1 = r0.f44
            if (r1 == 0) goto L1d7
            r1.recycle()
            r0.f44 = r6
        L1d7:
            r0.m11(r2)
            r10.onRelease()
            r11.onRelease()
            goto L213
        L1e1:
            int r1 = r0.getChildCount()
            if (r1 != 0) goto L1e8
            return r2
        L1e8:
            boolean r1 = r0.f39
            if (r1 == 0) goto L1f5
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L1f5
            r1.requestDisallowInterceptTouchEvent(r8)
        L1f5:
            android.widget.OverScroller r1 = r0.f51
            boolean r5 = r1.isFinished()
            if (r5 != 0) goto L203
            r1.abortAnimation()
            r0.m11(r8)
        L203:
            float r1 = r3.getY()
            int r1 = (int) r1
            int r3 = r3.getPointerId(r2)
            r0.f42 = r1
            r0.f35 = r3
            r0.m5(r4, r2)
        L213:
            android.view.VelocityTracker r0 = r0.f44
            if (r0 == 0) goto L21a
            r0.addMovement(r7)
        L21a:
            r7.recycle()
            return r8
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View r3, android.view.View r4) {
            r2 = this;
            boolean r0 = r2.f41
            if (r0 != 0) goto L17
            android.graphics.Rect r0 = r2.f33
            r4.getDrawingRect(r0)
            r2.offsetDescendantRectToMyCoords(r4, r0)
            int r0 = r2.m3(r0)
            if (r0 == 0) goto L19
            r1 = 0
            r2.scrollBy(r1, r0)
            goto L19
        L17:
            r2.f55 = r4
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
            int r3 = r2.m3(r4)
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
            r2.m17(r4, r3, r4)
        L2a:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.view.VelocityTracker r0 = r1.f44
            if (r0 == 0) goto Lc
            r0.recycle()
            r0 = 0
            r1.f44 = r0
        Lc:
            super.requestDisallowInterceptTouchEvent(r2)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r1 = this;
            r0 = 1
            r1.f41 = r0
            super.requestLayout()
            return
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
            boolean r0 = r1.f53
            if (r2 == r0) goto L9
            r1.f53 = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r3) {
            r2 = this;
            xhss.ᲇᲈᛶᛸ r2 = r2.f30
            boolean r0 = r2.f3578
            if (r0 == 0) goto Ld
            androidx.core.widget.NestedScrollView r0 = r2.f3575
            int r1 = xhss.AbstractC0624.f2154
            r0.stopNestedScroll()
        Ld:
            r2.f3578 = r3
            return
    }

    public void setOnScrollChangeListener(xhss.InterfaceC0211 r1) {
            r0 = this;
            return
    }

    public void setSmoothScrollingEnabled(boolean r1) {
            r0 = this;
            r0.f34 = r1
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r2) {
            r1 = this;
            r0 = 0
            boolean r1 = r1.m5(r2, r0)
            return r1
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
            r1 = this;
            r0 = 0
            r1.m11(r0)
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int m3(android.graphics.Rect r11) {
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
            int r10 = r11.height()
            if (r10 <= r0) goto L49
            int r10 = r11.top
            int r10 = r10 - r2
            goto L4c
        L49:
            int r10 = r11.bottom
            int r10 = r10 - r4
        L4c:
            int r11 = r5.getBottom()
            int r0 = r6.bottomMargin
            int r11 = r11 + r0
            int r11 = r11 - r3
            int r10 = java.lang.Math.min(r10, r11)
            return r10
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
            int r10 = r10.getScrollY()
            int r10 = -r10
            int r10 = java.lang.Math.max(r1, r10)
            return r10
        L78:
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m4(int r13) {
            r12 = this;
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L3f
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            r10 = 0
            r11 = 0
            android.widget.OverScroller r1 = r12.f51
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r5 = r13
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = 1
            r0 = 2
            r12.m5(r0, r13)
            int r13 = r12.getScrollY()
            r12.f49 = r13
            r12.postInvalidateOnAnimation()
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 35
            if (r13 < r0) goto L3f
            android.widget.OverScroller r13 = r12.f51
            float r13 = r13.getCurrVelocity()
            float r13 = java.lang.Math.abs(r13)
            xhss.AbstractC0389.m766(r12, r13)
        L3f:
            return
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final boolean m5(int r12, int r13) {
            r11 = this;
            xhss.ᲇᲈᛶᛸ r11 = r11.f30
            androidx.core.widget.NestedScrollView r0 = r11.f3575
            android.view.ViewParent r1 = r11.m1803(r13)
            r2 = 1
            if (r1 == 0) goto Lc
            return r2
        Lc:
            boolean r1 = r11.f3578
            r3 = 0
            if (r1 == 0) goto L8c
            android.view.ViewParent r1 = r0.getParent()
            r4 = r0
        L16:
            if (r1 == 0) goto L8c
            boolean r5 = r1 instanceof androidx.core.widget.NestedScrollView
            java.lang.String r6 = "ViewParent "
            java.lang.String r7 = "ViewParentCompat"
            if (r5 == 0) goto L29
            r8 = r1
            androidx.core.widget.NestedScrollView r8 = (androidx.core.widget.NestedScrollView) r8
            r8 = r12 & 2
            if (r8 == 0) goto L45
            r8 = r2
            goto L46
        L29:
            if (r13 != 0) goto L45
            boolean r8 = r1.onStartNestedScroll(r4, r0, r12)     // Catch: java.lang.AbstractMethodError -> L30
            goto L46
        L30:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            r9.append(r1)
            java.lang.String r10 = " does not implement interface method onStartNestedScroll"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r7, r9, r8)
        L45:
            r8 = r3
        L46:
            if (r8 == 0) goto L80
            if (r13 == 0) goto L50
            if (r13 == r2) goto L4d
            goto L52
        L4d:
            r11.f3574 = r1
            goto L52
        L50:
            r11.f3577 = r1
        L52:
            if (r5 == 0) goto L64
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            xhss.ᲁᛲᲁᲇ r11 = r1.f29
            if (r13 != r2) goto L5d
            r11.f3016 = r12
            goto L5f
        L5d:
            r11.f3017 = r12
        L5f:
            r11 = 2
            r1.m5(r11, r13)
            goto L8d
        L64:
            if (r13 != 0) goto L8d
            r1.onNestedScrollAccepted(r4, r0, r12)     // Catch: java.lang.AbstractMethodError -> L6a
            goto L8d
        L6a:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            r12.append(r1)
            java.lang.String r13 = " does not implement interface method onNestedScrollAccepted"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r7, r12, r11)
            goto L8d
        L80:
            boolean r5 = r1 instanceof android.view.View
            if (r5 == 0) goto L87
            r4 = r1
            android.view.View r4 = (android.view.View) r4
        L87:
            android.view.ViewParent r1 = r1.getParent()
            goto L16
        L8c:
            r2 = r3
        L8d:
            return r2
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final boolean m6(android.view.MotionEvent r6) {
            r5 = this;
            android.widget.EdgeEffect r0 = r5.f37
            float r1 = xhss.AbstractC0955.m1568(r0)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            if (r1 == 0) goto L1b
            float r1 = r6.getX()
            int r4 = r5.getWidth()
            float r4 = (float) r4
            float r1 = r1 / r4
            xhss.AbstractC0955.m1556(r0, r2, r1)
            r0 = r3
            goto L1c
        L1b:
            r0 = 0
        L1c:
            android.widget.EdgeEffect r1 = r5.f52
            float r4 = xhss.AbstractC0955.m1568(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L37
            float r6 = r6.getX()
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r6 = r6 / r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r6
            xhss.AbstractC0955.m1556(r1, r2, r5)
            return r3
        L37:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean m7(int r11) {
            r10 = this;
            android.view.View r1 = r10.findFocus()
            if (r1 != r10) goto L7
            r1 = 0
        L7:
            r7 = r1
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r8 = r1.findNextFocus(r10, r7, r11)
            int r1 = r10.getMaxScrollAmount()
            r9 = 0
            if (r8 == 0) goto L3a
            int r2 = r10.getHeight()
            boolean r2 = r10.m16(r8, r1, r2)
            if (r2 == 0) goto L3a
            android.graphics.Rect r1 = r10.f33
            r8.getDrawingRect(r1)
            r10.offsetDescendantRectToMyCoords(r8, r1)
            int r1 = r10.m3(r1)
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 1
            r0 = r10
            r0.m8(r1, r2, r3, r4, r5, r6)
            r8.requestFocus(r11)
            goto L87
        L3a:
            r2 = 33
            r3 = 130(0x82, float:1.82E-43)
            if (r11 != r2) goto L4b
            int r2 = r10.getScrollY()
            if (r2 >= r1) goto L4b
            int r1 = r10.getScrollY()
            goto L77
        L4b:
            if (r11 != r3) goto L77
            int r2 = r10.getChildCount()
            if (r2 <= 0) goto L77
            android.view.View r2 = r10.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r2 = r2.getBottom()
            int r4 = r4.bottomMargin
            int r2 = r2 + r4
            int r4 = r10.getScrollY()
            int r5 = r10.getHeight()
            int r5 = r5 + r4
            int r4 = r10.getPaddingBottom()
            int r5 = r5 - r4
            int r2 = r2 - r5
            int r1 = java.lang.Math.min(r2, r1)
        L77:
            if (r1 != 0) goto L7a
            return r9
        L7a:
            if (r11 != r3) goto L7d
            goto L7e
        L7d:
            int r1 = -r1
        L7e:
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 1
            r0 = r10
            r0.m8(r1, r2, r3, r4, r5, r6)
        L87:
            r1 = 1
            if (r7 == 0) goto La9
            boolean r2 = r7.isFocused()
            if (r2 == 0) goto La9
            int r2 = r10.getHeight()
            boolean r2 = r10.m16(r7, r9, r2)
            if (r2 != 0) goto La9
            int r2 = r10.getDescendantFocusability()
            r3 = 131072(0x20000, float:1.83671E-40)
            r10.setDescendantFocusability(r3)
            r10.requestFocus()
            r10.setDescendantFocusability(r2)
        La9:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final int m8(int r21, int r22, android.view.MotionEvent r23, int r24, int r25, boolean r26) {
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r24
            r9 = r25
            r11 = 1
            if (r9 != r11) goto Lf
            r3 = 2
            r0.m5(r3, r9)
        Lf:
            int[] r8 = r0.f32
            xhss.ᲇᲈᛶᛸ r3 = r0.f30
            r4 = 0
            int[] r7 = r0.f48
            r5 = r21
            r6 = r9
            boolean r3 = r3.m1804(r4, r5, r6, r7, r8)
            int[] r12 = r0.f32
            int[] r10 = r0.f48
            r13 = 0
            if (r3 == 0) goto L2d
            r3 = r10[r11]
            int r3 = r21 - r3
            r4 = r12[r11]
            r14 = r3
            r15 = r4
            goto L30
        L2d:
            r14 = r21
            r15 = r13
        L30:
            int r3 = r0.getScrollY()
            int r4 = r0.getScrollRange()
            int r5 = r0.getOverScrollMode()
            if (r5 == 0) goto L46
            if (r5 != r11) goto L4b
            int r5 = r0.getScrollRange()
            if (r5 <= 0) goto L4b
        L46:
            if (r26 != 0) goto L4b
            r16 = r11
            goto L4d
        L4b:
            r16 = r13
        L4d:
            boolean r5 = r0.m9(r14, r13, r3, r4)
            if (r5 == 0) goto L5f
            xhss.ᲇᲈᛶᛸ r5 = r0.f30
            android.view.ViewParent r5 = r5.m1803(r9)
            if (r5 == 0) goto L5c
            goto L5f
        L5c:
            r17 = r11
            goto L61
        L5f:
            r17 = r13
        L61:
            int r5 = r0.getScrollY()
            int r5 = r5 - r3
            if (r23 == 0) goto L7b
            if (r5 == 0) goto L7b
            xhss.ᛸᲁᲀᲁ r6 = r0.getScrollFeedbackProvider()
            int r7 = r23.getDeviceId()
            int r8 = r23.getSource()
            xhss.ᛲᛳᛶᲁ r6 = r6.f2629
            r6.onScrollProgress(r7, r8, r1, r5)
        L7b:
            int r7 = r14 - r5
            r10[r11] = r13
            r6 = 0
            r8 = r3
            xhss.ᲇᲈᛶᛸ r3 = r0.f30
            r18 = r4
            r4 = 0
            r19 = r8
            int[] r8 = r0.f32
            r13 = r18
            r3.m1802(r4, r5, r6, r7, r8, r9, r10)
            r3 = r12[r11]
            int r15 = r15 + r3
            r3 = r10[r11]
            int r14 = r14 - r3
            int r3 = r19 + r14
            android.widget.EdgeEffect r4 = r0.f52
            android.widget.EdgeEffect r5 = r0.f37
            if (r3 >= 0) goto Lcf
            if (r16 == 0) goto Lcd
            int r3 = -r14
            float r3 = (float) r3
            int r6 = r0.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            float r2 = (float) r2
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r2 = r2 / r6
            xhss.AbstractC0955.m1556(r5, r3, r2)
            if (r23 == 0) goto Lc4
            xhss.ᛸᲁᲀᲁ r2 = r0.getScrollFeedbackProvider()
            int r3 = r23.getDeviceId()
            int r6 = r23.getSource()
            xhss.ᛲᛳᛶᲁ r2 = r2.f2629
            r2.onScrollLimit(r3, r6, r1, r11)
        Lc4:
            boolean r1 = r4.isFinished()
            if (r1 != 0) goto Lcd
            r4.onRelease()
        Lcd:
            r7 = 0
            goto L106
        Lcf:
            if (r3 <= r13) goto Lcd
            if (r16 == 0) goto Lcd
            float r3 = (float) r14
            int r6 = r0.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            float r2 = (float) r2
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r2 = r2 / r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r2
            xhss.AbstractC0955.m1556(r4, r3, r6)
            if (r23 == 0) goto Lfc
            xhss.ᛸᲁᲀᲁ r2 = r0.getScrollFeedbackProvider()
            int r3 = r23.getDeviceId()
            int r6 = r23.getSource()
            xhss.ᛲᛳᛶᲁ r2 = r2.f2629
            r7 = 0
            r2.onScrollLimit(r3, r6, r1, r7)
            goto Lfd
        Lfc:
            r7 = 0
        Lfd:
            boolean r1 = r5.isFinished()
            if (r1 != 0) goto L106
            r5.onRelease()
        L106:
            boolean r1 = r5.isFinished()
            if (r1 == 0) goto L116
            boolean r1 = r4.isFinished()
            if (r1 != 0) goto L113
            goto L116
        L113:
            r13 = r17
            goto L11a
        L116:
            r0.postInvalidateOnAnimation()
            r13 = r7
        L11a:
            if (r13 == 0) goto L125
            if (r9 != 0) goto L125
            android.view.VelocityTracker r1 = r0.f44
            if (r1 == 0) goto L125
            r1.clear()
        L125:
            if (r9 != r11) goto L130
            r0.m11(r9)
            r5.onRelease()
            r4.onRelease()
        L130:
            return r15
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final boolean m9(int r10, int r11, int r12, int r13) {
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
            if (r12 == 0) goto L3f
            xhss.ᲇᲈᛶᛸ r13 = r9.f30
            android.view.ViewParent r13 = r13.m1803(r1)
            if (r13 == 0) goto L33
            goto L3f
        L33:
            r7 = 0
            int r8 = r9.getScrollRange()
            android.widget.OverScroller r2 = r9.f51
            r5 = 0
            r6 = 0
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L3f:
            super.scrollTo(r3, r4)
            if (r11 != 0) goto L48
            if (r12 == 0) goto L47
            goto L48
        L47:
            return r10
        L48:
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final void m10(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.f35
            if (r1 != r2) goto L25
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            float r1 = r4.getY(r0)
            int r1 = (int) r1
            r3.f42 = r1
            int r4 = r4.getPointerId(r0)
            r3.f35 = r4
            android.view.VelocityTracker r3 = r3.f44
            if (r3 == 0) goto L25
            r3.clear()
        L25:
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public final void m11(int r6) {
            r5 = this;
            xhss.ᲇᲈᛶᛸ r5 = r5.f30
            android.view.ViewParent r0 = r5.m1803(r6)
            if (r0 == 0) goto L49
            androidx.core.widget.NestedScrollView r1 = r5.f3575
            boolean r2 = r0 instanceof androidx.core.widget.NestedScrollView
            r3 = 1
            if (r2 == 0) goto L1f
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            xhss.ᲁᛲᲁᲇ r1 = r0.f29
            r2 = 0
            if (r6 != r3) goto L19
            r1.f3016 = r2
            goto L1b
        L19:
            r1.f3017 = r2
        L1b:
            r0.m11(r6)
            goto L3e
        L1f:
            if (r6 != 0) goto L3e
            r0.onStopNestedScroll(r1)     // Catch: java.lang.AbstractMethodError -> L25
            goto L3e
        L25:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "ViewParent "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = " does not implement interface method onStopNestedScroll"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r0, r1)
        L3e:
            r0 = 0
            if (r6 == 0) goto L47
            if (r6 == r3) goto L44
            goto L49
        L44:
            r5.f3574 = r0
            goto L49
        L47:
            r5.f3577 = r0
        L49:
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final boolean m12(android.widget.EdgeEffect r10, int r11) {
            r9 = this;
            r0 = 1
            if (r11 <= 0) goto L4
            return r0
        L4:
            float r10 = xhss.AbstractC0955.m1568(r10)
            int r1 = r9.getHeight()
            float r1 = (float) r1
            float r10 = r10 * r1
            int r11 = -r11
            int r11 = java.lang.Math.abs(r11)
            float r11 = (float) r11
            r1 = 1051931443(0x3eb33333, float:0.35)
            float r11 = r11 * r1
            r1 = 1014350479(0x3c75c28f, float:0.015)
            float r9 = r9.f38
            float r9 = r9 * r1
            float r11 = r11 / r9
            double r1 = (double) r11
            double r1 = java.lang.Math.log(r1)
            float r11 = androidx.core.widget.NestedScrollView.f25
            double r3 = (double) r11
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r3 - r5
            double r7 = (double) r9
            double r3 = r3 / r5
            double r3 = r3 * r1
            double r1 = java.lang.Math.exp(r3)
            double r1 = r1 * r7
            float r9 = (float) r1
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L39
            return r0
        L39:
            r9 = 0
            return r9
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final void m13(int r6) {
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
            android.graphics.Rect r4 = r5.f33
            if (r0 == 0) goto L3e
            int r0 = r5.getScrollY()
            int r0 = r0 + r3
            r4.top = r0
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L49
            int r0 = r0 - r2
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r4.top
            int r0 = r0 + r3
            if (r0 <= r1) goto L49
            int r1 = r1 - r3
            r4.top = r1
            goto L49
        L3e:
            int r0 = r5.getScrollY()
            int r0 = r0 - r3
            r4.top = r0
            if (r0 >= 0) goto L49
            r4.top = r1
        L49:
            int r0 = r4.top
            int r3 = r3 + r0
            r4.bottom = r3
            r5.m18(r6, r0, r3)
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m14(int r11, int r12, int[] r13) {
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
            xhss.ᲇᲈᛶᛸ r2 = r10.f30
            r3 = 0
            r8 = r12
            r9 = r13
            r2.m1802(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final boolean m15(int r6) {
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
            android.graphics.Rect r4 = r5.f33
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
            boolean r5 = r5.m18(r6, r0, r1)
            return r5
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final boolean m16(android.view.View r3, int r4, int r5) {
            r2 = this;
            android.graphics.Rect r0 = r2.f33
            r3.getDrawingRect(r0)
            r2.offsetDescendantRectToMyCoords(r3, r0)
            int r3 = r0.bottom
            int r3 = r3 + r4
            int r1 = r2.getScrollY()
            if (r3 < r1) goto L1d
            int r3 = r0.top
            int r3 = r3 - r4
            int r2 = r2.getScrollY()
            int r2 = r2 + r5
            if (r3 > r2) goto L1d
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final void m17(int r10, int r11, boolean r12) {
            r9 = this;
            int r0 = r9.getChildCount()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r9.f28
            long r0 = r0 - r2
            r2 = 250(0xfa, double:1.235E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L6c
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
            android.widget.OverScroller r3 = r9.f51
            r8 = 250(0xfa, float:3.5E-43)
            r3.startScroll(r4, r5, r6, r7, r8)
            if (r12 == 0) goto L5f
            r10 = 2
            r9.m5(r10, r1)
            goto L62
        L5f:
            r9.m11(r1)
        L62:
            int r10 = r9.getScrollY()
            r9.f49 = r10
            r9.postInvalidateOnAnimation()
            goto L7d
        L6c:
            android.widget.OverScroller r12 = r9.f51
            boolean r0 = r12.isFinished()
            if (r0 != 0) goto L7a
            r12.abortAnimation()
            r9.m11(r1)
        L7a:
            r9.scrollBy(r10, r11)
        L7d:
            long r10 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r9.f28 = r10
            return
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final boolean m18(int r19, int r20, int r21) {
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int r3 = r18.getHeight()
            int r4 = r18.getScrollY()
            int r3 = r3 + r4
            r5 = 33
            if (r0 != r5) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            r8 = 2
            r9 = r18
            java.util.ArrayList r8 = r9.getFocusables(r8)
            int r10 = r8.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r8.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r6 = r14.getBottom()
            if (r1 >= r6) goto L69
            if (r15 >= r2) goto L69
            if (r1 >= r15) goto L3f
            if (r6 >= r2) goto L3f
            r17 = 1
            goto L41
        L3f:
            r17 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r17
            goto L69
        L47:
            if (r5 == 0) goto L4f
            int r7 = r11.getTop()
            if (r15 < r7) goto L57
        L4f:
            if (r5 != 0) goto L59
            int r7 = r11.getBottom()
            if (r6 <= r7) goto L59
        L57:
            r6 = 1
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r17 == 0) goto L69
            if (r6 == 0) goto L69
            goto L68
        L61:
            if (r17 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r6 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L70
            r6 = r9
            goto L71
        L70:
            r6 = r11
        L71:
            if (r1 < r4) goto L78
            if (r2 > r3) goto L78
            r16 = 0
            goto L8a
        L78:
            if (r5 == 0) goto L7d
            int r1 = r1 - r4
        L7b:
            r10 = r1
            goto L80
        L7d:
            int r1 = r2 - r3
            goto L7b
        L80:
            r11 = -1
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 1
            r9.m8(r10, r11, r12, r13, r14, r15)
            r16 = 1
        L8a:
            android.view.View r1 = r18.findFocus()
            if (r6 == r1) goto L93
            r6.requestFocus(r0)
        L93:
            return r16
    }
}
