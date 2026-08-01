package androidx.core.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements p000.d31 {

    /* JADX INFO: renamed from: Ι */
    public static final float f1031 = 0.0f;

    /* JADX INFO: renamed from: Κ */
    public static final p000.C0409iw f1032 = null;

    /* JADX INFO: renamed from: Λ */
    public static final int[] f1033 = null;

    /* JADX INFO: renamed from: Α */
    public final int[] f1034;

    /* JADX INFO: renamed from: Β */
    public int f1035;

    /* JADX INFO: renamed from: Γ */
    public int f1036;

    /* JADX INFO: renamed from: Δ */
    public p000.a31 f1037;

    /* JADX INFO: renamed from: Ε */
    public final p000.e31 f1038;

    /* JADX INFO: renamed from: Ζ */
    public final p000.b31 f1039;

    /* JADX INFO: renamed from: Η */
    public float f1040;

    /* JADX INFO: renamed from: Θ */
    public final p000.C0223dt f1041;

    /* JADX INFO: renamed from: ε */
    public final float f1042;

    /* JADX INFO: renamed from: ζ */
    public long f1043;

    /* JADX INFO: renamed from: η */
    public final android.graphics.Rect f1044;

    /* JADX INFO: renamed from: θ */
    public final android.widget.OverScroller f1045;

    /* JADX INFO: renamed from: ι */
    public final android.widget.EdgeEffect f1046;

    /* JADX INFO: renamed from: κ */
    public final android.widget.EdgeEffect f1047;

    /* JADX INFO: renamed from: λ */
    public p000.ar1 f1048;

    /* JADX INFO: renamed from: μ */
    public int f1049;

    /* JADX INFO: renamed from: ν */
    public boolean f1050;

    /* JADX INFO: renamed from: ξ */
    public boolean f1051;

    /* JADX INFO: renamed from: ο */
    public android.view.View f1052;

    /* JADX INFO: renamed from: π */
    public boolean f1053;

    /* JADX INFO: renamed from: ρ */
    public android.view.VelocityTracker f1054;

    /* JADX INFO: renamed from: σ */
    public boolean f1055;

    /* JADX INFO: renamed from: τ */
    public boolean f1056;

    /* JADX INFO: renamed from: υ */
    public final int f1057;

    /* JADX INFO: renamed from: φ */
    public final int f1058;

    /* JADX INFO: renamed from: χ */
    public final int f1059;

    /* JADX INFO: renamed from: ψ */
    public int f1060;

    /* JADX INFO: renamed from: ω */
    public final int[] f1061;

    static {
            r0 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            double r0 = java.lang.Math.log(r0)
            r2 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r2 = java.lang.Math.log(r2)
            double r0 = r0 / r2
            float r0 = (float) r0
            androidx.core.widget.NestedScrollView.f1031 = r0
            iw r0 = new iw
            r1 = 1
            r0.<init>(r1)
            androidx.core.widget.NestedScrollView.f1032 = r0
            r0 = 16843130(0x101017a, float:2.3694617E-38)
            int[] r0 = new int[]{r0}
            androidx.core.widget.NestedScrollView.f1033 = r0
            return
    }

    public NestedScrollView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NestedScrollView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968781(0x7f0400cd, float:1.7546225E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public NestedScrollView(android.content.Context r6, android.util.AttributeSet r7, int r8) {
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.f1044 = r0
            r0 = 1
            r5.f1050 = r0
            r1 = 0
            r5.f1051 = r1
            r2 = 0
            r5.f1052 = r2
            r5.f1053 = r1
            r5.f1056 = r0
            r2 = -1
            r5.f1060 = r2
            r2 = 2
            int[] r3 = new int[r2]
            r5.f1061 = r3
            int[] r2 = new int[r2]
            r5.f1034 = r2
            y21 r2 = new y21
            r2.<init>(r5)
            dt r3 = new dt
            android.content.Context r4 = r5.getContext()
            r3.<init>(r4, r2)
            r5.f1041 = r3
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L3e
            android.widget.EdgeEffect r4 = p000.AbstractC0192cy.m1632(r6, r7)
            goto L43
        L3e:
            android.widget.EdgeEffect r4 = new android.widget.EdgeEffect
            r4.<init>(r6)
        L43:
            r5.f1046 = r4
            if (r2 < r3) goto L4c
            android.widget.EdgeEffect r2 = p000.AbstractC0192cy.m1632(r6, r7)
            goto L51
        L4c:
            android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
            r2.<init>(r6)
        L51:
            r5.f1047 = r2
            android.content.res.Resources r2 = r6.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 * r3
            r3 = 1136724797(0x43c10b3d, float:386.0878)
            float r2 = r2 * r3
            r3 = 1062668861(0x3f570a3d, float:0.84)
            float r2 = r2 * r3
            r5.f1042 = r2
            android.widget.OverScroller r2 = new android.widget.OverScroller
            android.content.Context r3 = r5.getContext()
            r2.<init>(r3)
            r5.f1045 = r2
            r5.setFocusable(r0)
            r2 = 262144(0x40000, float:3.67342E-40)
            r5.setDescendantFocusability(r2)
            r5.setWillNotDraw(r1)
            android.content.Context r2 = r5.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r3 = r2.getScaledTouchSlop()
            r5.f1057 = r3
            int r3 = r2.getScaledMinimumFlingVelocity()
            r5.f1058 = r3
            int r2 = r2.getScaledMaximumFlingVelocity()
            r5.f1059 = r2
            int[] r2 = androidx.core.widget.NestedScrollView.f1033
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r2, r8, r1)
            boolean r7 = r6.getBoolean(r1, r1)
            r5.setFillViewport(r7)
            r6.recycle()
            e31 r6 = new e31
            r6.<init>()
            r5.f1038 = r6
            b31 r6 = new b31
            r6.<init>(r5)
            r5.f1039 = r6
            r5.setNestedScrollingEnabled(r0)
            iw r6 = androidx.core.widget.NestedScrollView.f1032
            p000.b92.m828(r5, r6)
            return
    }

    private p000.ar1 getScrollFeedbackProvider() {
            r1 = this;
            ar1 r0 = r1.f1048
            if (r0 != 0) goto Lb
            ar1 r0 = new ar1
            r0.<init>(r1)
            r1.f1048 = r0
        Lb:
            ar1 r1 = r1.f1048
            return r1
    }

    /* JADX INFO: renamed from: ν */
    public static boolean m429(android.view.View r1, androidx.core.widget.NestedScrollView r2) {
            if (r1 != r2) goto L3
            goto L13
        L3:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L15
            android.view.View r1 = (android.view.View) r1
            boolean r1 = m429(r1, r2)
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
            p000.C1080.m7279(r1)
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
            p000.C1080.m7279(r1)
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
            p000.C1080.m7279(r1)
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
            p000.C1080.m7279(r1)
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
            r14 = this;
            android.widget.OverScroller r0 = r14.f1045
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L9
            return
        L9:
            android.widget.OverScroller r0 = r14.f1045
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r14.f1045
            int r0 = r0.getCurrY()
            int r1 = r14.f1036
            int r1 = r0 - r1
            int r2 = r14.getHeight()
            android.widget.EdgeEffect r3 = r14.f1046
            android.widget.EdgeEffect r4 = r14.f1047
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r7 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L47
            float r8 = p000.h62.m2425(r3)
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L47
            int r6 = -r1
            float r6 = (float) r6
            float r6 = r6 * r7
            float r8 = (float) r2
            float r6 = r6 / r8
            int r2 = -r2
            float r2 = (float) r2
            float r2 = r2 / r7
            float r5 = p000.h62.m2436(r3, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L45
            r3.finish()
        L45:
            int r1 = r1 - r2
            goto L65
        L47:
            if (r1 >= 0) goto L65
            float r8 = p000.h62.m2425(r4)
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L65
            float r6 = (float) r1
            float r6 = r6 * r7
            float r2 = (float) r2
            float r6 = r6 / r2
            float r2 = r2 / r7
            float r5 = p000.h62.m2436(r4, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L45
            r4.finish()
            goto L45
        L65:
            r14.f1036 = r0
            int[] r12 = r14.f1034
            r0 = 1
            r2 = 0
            r12[r0] = r2
            r14.m433(r2, r1, r12, r0)
            r5 = r12[r0]
            int r1 = r1 - r5
            int r13 = r14.getScrollRange()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 35
            if (r5 < r6) goto L8a
            android.widget.OverScroller r5 = r14.f1045
            float r5 = r5.getCurrVelocity()
            float r5 = java.lang.Math.abs(r5)
            p000.x21.m6505(r14, r5)
        L8a:
            if (r1 == 0) goto Laf
            int r5 = r14.getScrollY()
            int r6 = r14.getScrollX()
            r14.m440(r1, r6, r5, r13)
            int r6 = r14.getScrollY()
            int r7 = r6 - r5
            int r9 = r1 - r7
            r12[r0] = r2
            r8 = 0
            b31 r5 = r14.f1039
            r6 = 0
            int[] r10 = r14.f1061
            r11 = 1
            r5.m714(r6, r7, r8, r9, r10, r11, r12)
            r1 = r12[r0]
            int r1 = r9 - r1
        Laf:
            if (r1 == 0) goto Le6
            int r2 = r14.getOverScrollMode()
            if (r2 == 0) goto Lbb
            if (r2 != r0) goto Lde
            if (r13 <= 0) goto Lde
        Lbb:
            if (r1 >= 0) goto Lce
            boolean r1 = r3.isFinished()
            if (r1 == 0) goto Lde
            android.widget.OverScroller r1 = r14.f1045
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            r3.onAbsorb(r1)
            goto Lde
        Lce:
            boolean r1 = r4.isFinished()
            if (r1 == 0) goto Lde
            android.widget.OverScroller r1 = r14.f1045
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            r4.onAbsorb(r1)
        Lde:
            android.widget.OverScroller r1 = r14.f1045
            r1.abortAnimation()
            r14.m430(r0)
        Le6:
            android.widget.OverScroller r1 = r14.f1045
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Lf2
            r14.postInvalidateOnAnimation()
            return
        Lf2:
            r14.m430(r0)
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
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            if (r0 != 0) goto Lf
            boolean r1 = r1.m434(r2)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r1, float r2, boolean r3) {
            r0 = this;
            b31 r0 = r0.f1039
            boolean r0 = r0.m711(r1, r2, r3)
            return r0
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r1, float r2) {
            r0 = this;
            b31 r0 = r0.f1039
            boolean r0 = r0.m712(r1, r2)
            return r0
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            r3 = 0
            b31 r0 = r6.f1039
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            boolean r6 = r0.m713(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
            r8 = this;
            r6 = 0
            r7 = 0
            b31 r0 = r8.f1039
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            boolean r8 = r0.m714(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r11) {
            r10 = this;
            super.draw(r11)
            int r0 = r10.getScrollY()
            android.widget.EdgeEffect r1 = r10.f1046
            boolean r2 = r1.isFinished()
            r3 = 0
            if (r2 != 0) goto L5f
            int r2 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = java.lang.Math.min(r3, r0)
            boolean r7 = r10.getClipToPadding()
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
            boolean r8 = r10.getClipToPadding()
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
            if (r1 == 0) goto L5c
            r10.postInvalidateOnAnimation()
        L5c:
            r11.restoreToCount(r2)
        L5f:
            android.widget.EdgeEffect r1 = r10.f1047
            boolean r2 = r1.isFinished()
            if (r2 != 0) goto Lc1
            int r2 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = r10.getScrollRange()
            int r0 = java.lang.Math.max(r6, r0)
            int r0 = r0 + r5
            boolean r6 = r10.getClipToPadding()
            if (r6 == 0) goto L90
            int r3 = r10.getPaddingLeft()
            int r6 = r10.getPaddingRight()
            int r6 = r6 + r3
            int r4 = r4 - r6
            int r3 = r10.getPaddingLeft()
        L90:
            boolean r6 = r10.getClipToPadding()
            if (r6 == 0) goto La5
            int r6 = r10.getPaddingTop()
            int r7 = r10.getPaddingBottom()
            int r7 = r7 + r6
            int r5 = r5 - r7
            int r6 = r10.getPaddingBottom()
            int r0 = r0 - r6
        La5:
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
            if (r0 == 0) goto Lbe
            r10.postInvalidateOnAnimation()
        Lbe:
            r11.restoreToCount(r2)
        Lc1:
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
            e31 r1 = r1.f1038
            int r0 = r1.f3400
            int r1 = r1.f3401
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
            r5 = this;
            float r0 = r5.f1040
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
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
            r5.f1040 = r0
            goto L34
        L2d:
            java.lang.String r5 = "Expected theme to define listPreferredItemHeight."
            p000.C1080.m7279(r5)
            r5 = 0
            return r5
        L34:
            float r5 = r5.f1040
            return r5
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
            r1 = this;
            r0 = 0
            b31 r1 = r1.f1039
            boolean r1 = r1.m716(r0)
            return r1
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
            r0 = this;
            b31 r0 = r0.f1039
            boolean r0 = r0.f1445
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
            r1.f1051 = r0
            return
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent r13) {
            r12 = this;
            int r0 = r13.getAction()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto L5e
            boolean r0 = r12.f1053
            if (r0 != 0) goto L5e
            r0 = 2
            boolean r1 = p000.AbstractC0978xb.m6565(r13, r0)
            r3 = 0
            if (r1 == 0) goto L23
            r0 = 9
            float r1 = r13.getAxisValue(r0)
            float r4 = r13.getX()
            int r4 = (int) r4
            r7 = r0
            r9 = r4
            goto L3e
        L23:
            r1 = 4194304(0x400000, float:5.877472E-39)
            boolean r1 = p000.AbstractC0978xb.m6565(r13, r1)
            if (r1 == 0) goto L3b
            r1 = 26
            float r4 = r13.getAxisValue(r1)
            int r5 = r12.getWidth()
            int r0 = r5 / 2
            r9 = r0
            r7 = r1
            r1 = r4
            goto L3e
        L3b:
            r7 = r2
            r9 = r7
            r1 = r3
        L3e:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L5e
            float r0 = r12.getVerticalScrollFactorCompat()
            float r0 = r0 * r1
            int r0 = (int) r0
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r11 = p000.AbstractC0978xb.m6565(r13, r1)
            int r6 = -r0
            r10 = 1
            r5 = r12
            r8 = r13
            r5.m443(r6, r7, r8, r9, r10, r11)
            if (r7 == 0) goto L5c
            dt r12 = r5.f1041
            r12.m1799(r8, r7)
        L5c:
            r12 = 1
            return r12
        L5e:
            return r2
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
            r12 = this;
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto Ld
            boolean r3 = r12.f1053
            if (r3 == 0) goto Ld
            return r1
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto Laf
            r5 = -1
            if (r0 == r1) goto L83
            if (r0 == r2) goto L25
            r1 = 3
            if (r0 == r1) goto L83
            r1 = 6
            if (r0 == r1) goto L20
            goto L132
        L20:
            r12.m439(r13)
            goto L132
        L25:
            int r0 = r12.f1060
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
            int r3 = r12.f1049
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.f1057
            if (r3 <= r5) goto L132
            int r3 = r12.getNestedScrollAxes()
            r2 = r2 & r3
            if (r2 != 0) goto L132
            r12.f1053 = r1
            r12.f1049 = r0
            android.view.VelocityTracker r0 = r12.f1054
            if (r0 != 0) goto L71
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f1054 = r0
        L71:
            android.view.VelocityTracker r0 = r12.f1054
            r0.addMovement(r13)
            r12.f1035 = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L132
            r13.requestDisallowInterceptTouchEvent(r1)
            goto L132
        L83:
            r12.f1053 = r4
            r12.f1060 = r5
            android.view.VelocityTracker r13 = r12.f1054
            if (r13 == 0) goto L90
            r13.recycle()
            r12.f1054 = r3
        L90:
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r10 = 0
            int r11 = r12.getScrollRange()
            android.widget.OverScroller r5 = r12.f1045
            r8 = 0
            r9 = 0
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto Laa
            r12.postInvalidateOnAnimation()
        Laa:
            r12.m430(r4)
            goto L132
        Laf:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r2 = r13.getX()
            int r2 = (int) r2
            int r5 = r12.getChildCount()
            if (r5 <= 0) goto L117
            int r5 = r12.getScrollY()
            android.view.View r6 = r12.getChildAt(r4)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L117
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L117
            int r5 = r6.getLeft()
            if (r2 < r5) goto L117
            int r5 = r6.getRight()
            if (r2 >= r5) goto L117
            r12.f1049 = r0
            int r0 = r13.getPointerId(r4)
            r12.f1060 = r0
            android.view.VelocityTracker r0 = r12.f1054
            if (r0 != 0) goto Lf4
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f1054 = r0
            goto Lf7
        Lf4:
            r0.clear()
        Lf7:
            android.view.VelocityTracker r0 = r12.f1054
            r0.addMovement(r13)
            android.widget.OverScroller r0 = r12.f1045
            r0.computeScrollOffset()
            boolean r13 = r12.m447(r13)
            if (r13 != 0) goto L111
            android.widget.OverScroller r13 = r12.f1045
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L110
            goto L111
        L110:
            r1 = r4
        L111:
            r12.f1053 = r1
            r12.m446(r4)
            goto L132
        L117:
            boolean r13 = r12.m447(r13)
            if (r13 != 0) goto L127
            android.widget.OverScroller r13 = r12.f1045
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L126
            goto L127
        L126:
            r1 = r4
        L127:
            r12.f1053 = r1
            android.view.VelocityTracker r13 = r12.f1054
            if (r13 == 0) goto L132
            r13.recycle()
            r12.f1054 = r3
        L132:
            boolean r12 = r12.f1053
            return r12
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = 0
            r1.f1050 = r2
            android.view.View r3 = r1.f1052
            if (r3 == 0) goto L23
            boolean r3 = m429(r3, r1)
            if (r3 == 0) goto L23
            android.view.View r3 = r1.f1052
            android.graphics.Rect r5 = r1.f1044
            r3.getDrawingRect(r5)
            r1.offsetDescendantRectToMyCoords(r3, r5)
            int r3 = r1.m432(r5)
            if (r3 == 0) goto L23
            r1.scrollBy(r2, r3)
        L23:
            r3 = 0
            r1.f1052 = r3
            boolean r5 = r1.f1051
            if (r5 != 0) goto L7c
            a31 r5 = r1.f1037
            if (r5 == 0) goto L3b
            int r5 = r1.getScrollX()
            a31 r0 = r1.f1037
            int r0 = r0.f56
            r1.scrollTo(r5, r0)
            r1.f1037 = r3
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
            r1.f1051 = r2
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r0 = r4.f1055
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
            r0.m435(r1)
            return r2
        Lc:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            b31 r0 = r0.f1039
            boolean r0 = r0.m712(r2, r3)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4) {
            r0 = this;
            r1 = 0
            r0.m433(r2, r3, r4, r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r1 = 0
            r2 = 0
            r0.m438(r5, r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.mo250(r2, r3, r4, r0)
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
            boolean r3 = r3.m437(r0, r1, r2)
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
            boolean r0 = r2 instanceof p000.a31
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            a31 r2 = (p000.a31) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            r1.f1037 = r2
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            a31 r1 = new a31
            r1.<init>(r0)
            int r2 = r2.getScrollY()
            r1.f56 = r2
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
            boolean r3 = r0.m437(r1, r2, r4)
            if (r3 == 0) goto L2c
            android.graphics.Rect r3 = r0.f1044
            r1.getDrawingRect(r3)
            r0.offsetDescendantRectToMyCoords(r1, r3)
            int r1 = r0.m432(r3)
            if (r1 == 0) goto L2c
            boolean r3 = r0.f1056
            if (r3 == 0) goto L29
            r0.m445(r2, r1, r2)
            return
        L29:
            r0.scrollBy(r2, r1)
        L2c:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r1 = r1.mo257(r2, r3, r4, r0)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.mo252(r2, r0)
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
            r19 = this;
            r0 = r19
            r3 = r20
            android.view.VelocityTracker r1 = r0.f1054
            if (r1 != 0) goto Le
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.f1054 = r1
        Le:
            int r1 = r3.getActionMasked()
            r2 = 0
            if (r1 != 0) goto L17
            r0.f1035 = r2
        L17:
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r3)
            int r4 = r0.f1035
            float r4 = (float) r4
            r5 = 0
            r7.offsetLocation(r5, r4)
            r8 = 1
            if (r1 == 0) goto L1e4
            r4 = 0
            r6 = -1
            android.widget.EdgeEffect r9 = r0.f1046
            android.widget.EdgeEffect r10 = r0.f1047
            if (r1 == r8) goto L159
            r11 = 2
            if (r1 == r11) goto L9d
            r5 = 3
            if (r1 == r5) goto L60
            r2 = 5
            if (r1 == r2) goto L4d
            r2 = 6
            if (r1 == r2) goto L3b
            goto L218
        L3b:
            r19.m439(r20)
            int r1 = r0.f1060
            int r1 = r3.findPointerIndex(r1)
            float r1 = r3.getY(r1)
            int r1 = (int) r1
            r0.f1049 = r1
            goto L218
        L4d:
            int r1 = r3.getActionIndex()
            float r2 = r3.getY(r1)
            int r2 = (int) r2
            r0.f1049 = r2
            int r1 = r3.getPointerId(r1)
            r0.f1060 = r1
            goto L218
        L60:
            boolean r1 = r0.f1053
            if (r1 == 0) goto L85
            int r1 = r0.getChildCount()
            if (r1 <= 0) goto L85
            int r12 = r0.getScrollX()
            int r13 = r0.getScrollY()
            r16 = 0
            int r17 = r0.getScrollRange()
            android.widget.OverScroller r11 = r0.f1045
            r14 = 0
            r15 = 0
            boolean r1 = r11.springBack(r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L85
            r0.postInvalidateOnAnimation()
        L85:
            r0.f1060 = r6
            r0.f1053 = r2
            android.view.VelocityTracker r1 = r0.f1054
            if (r1 == 0) goto L92
            r1.recycle()
            r0.f1054 = r4
        L92:
            r0.m430(r2)
            r9.onRelease()
            r10.onRelease()
            goto L218
        L9d:
            int r1 = r0.f1060
            int r1 = r3.findPointerIndex(r1)
            if (r1 != r6) goto Lc1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid pointerId="
            r1.<init>(r2)
            int r2 = r0.f1060
            r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NestedScrollView"
            android.util.Log.e(r2, r1)
            goto L218
        Lc1:
            float r2 = r3.getY(r1)
            int r11 = (int) r2
            int r2 = r0.f1049
            int r2 = r2 - r11
            float r4 = r3.getX(r1)
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r4 = r4 / r6
            float r6 = (float) r2
            int r12 = r0.getHeight()
            float r12 = (float) r12
            float r6 = r6 / r12
            float r12 = p000.h62.m2425(r9)
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto Lf5
            float r6 = -r6
            float r4 = p000.h62.m2436(r9, r6, r4)
            float r4 = -r4
            float r6 = p000.h62.m2425(r9)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto Lf3
            r9.onRelease()
        Lf3:
            r5 = r4
            goto L110
        Lf5:
            float r9 = p000.h62.m2425(r10)
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 == 0) goto L110
            r9 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 - r4
            float r4 = p000.h62.m2436(r10, r6, r9)
            float r6 = p000.h62.m2425(r10)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto Lf3
            r10.onRelease()
            goto Lf3
        L110:
            int r4 = r0.getHeight()
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            if (r4 == 0) goto L11f
            r0.invalidate()
        L11f:
            int r2 = r2 - r4
            boolean r4 = r0.f1053
            if (r4 != 0) goto L13e
            int r4 = java.lang.Math.abs(r2)
            int r5 = r0.f1057
            if (r4 <= r5) goto L13e
            android.view.ViewParent r4 = r0.getParent()
            if (r4 == 0) goto L135
            r4.requestDisallowInterceptTouchEvent(r8)
        L135:
            r0.f1053 = r8
            int r4 = r0.f1057
            if (r2 <= 0) goto L13d
            int r2 = r2 - r4
            goto L13e
        L13d:
            int r2 = r2 + r4
        L13e:
            boolean r4 = r0.f1053
            if (r4 == 0) goto L218
            float r1 = r3.getX(r1)
            int r4 = (int) r1
            r5 = 0
            r6 = 0
            r1 = r2
            r2 = 1
            int r1 = r0.m443(r1, r2, r3, r4, r5, r6)
            int r11 = r11 - r1
            r0.f1049 = r11
            int r2 = r0.f1035
            int r2 = r2 + r1
            r0.f1035 = r2
            goto L218
        L159:
            android.view.VelocityTracker r1 = r0.f1054
            int r3 = r0.f1059
            float r3 = (float) r3
            r11 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r11, r3)
            int r3 = r0.f1060
            float r1 = r1.getYVelocity(r3)
            int r1 = (int) r1
            int r3 = java.lang.Math.abs(r1)
            int r11 = r0.f1058
            if (r3 < r11) goto L1b1
            float r3 = p000.h62.m2425(r9)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L189
            boolean r3 = r0.m444(r9, r1)
            if (r3 == 0) goto L184
            r9.onAbsorb(r1)
            goto L1cd
        L184:
            int r1 = -r1
            r0.m435(r1)
            goto L1cd
        L189:
            float r3 = p000.h62.m2425(r10)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L1a0
            int r1 = -r1
            boolean r3 = r0.m444(r10, r1)
            if (r3 == 0) goto L19c
            r10.onAbsorb(r1)
            goto L1cd
        L19c:
            r0.m435(r1)
            goto L1cd
        L1a0:
            int r1 = -r1
            float r3 = (float) r1
            b31 r11 = r0.f1039
            boolean r11 = r11.m712(r5, r3)
            if (r11 != 0) goto L1cd
            r0.dispatchNestedFling(r5, r3, r8)
            r0.m435(r1)
            goto L1cd
        L1b1:
            int r13 = r0.getScrollX()
            int r14 = r0.getScrollY()
            r17 = 0
            int r18 = r0.getScrollRange()
            android.widget.OverScroller r12 = r0.f1045
            r15 = 0
            r16 = 0
            boolean r1 = r12.springBack(r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L1cd
            r0.postInvalidateOnAnimation()
        L1cd:
            r0.f1060 = r6
            r0.f1053 = r2
            android.view.VelocityTracker r1 = r0.f1054
            if (r1 == 0) goto L1da
            r1.recycle()
            r0.f1054 = r4
        L1da:
            r0.m430(r2)
            r9.onRelease()
            r10.onRelease()
            goto L218
        L1e4:
            int r1 = r0.getChildCount()
            if (r1 != 0) goto L1eb
            return r2
        L1eb:
            boolean r1 = r0.f1053
            if (r1 == 0) goto L1f8
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L1f8
            r1.requestDisallowInterceptTouchEvent(r8)
        L1f8:
            android.widget.OverScroller r1 = r0.f1045
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L208
            android.widget.OverScroller r1 = r0.f1045
            r1.abortAnimation()
            r0.m430(r8)
        L208:
            float r1 = r3.getY()
            int r1 = (int) r1
            int r3 = r3.getPointerId(r2)
            r0.f1049 = r1
            r0.f1060 = r3
            r0.m446(r2)
        L218:
            android.view.VelocityTracker r0 = r0.f1054
            if (r0 == 0) goto L21f
            r0.addMovement(r7)
        L21f:
            r7.recycle()
            return r8
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View r3, android.view.View r4) {
            r2 = this;
            boolean r0 = r2.f1050
            if (r0 != 0) goto L17
            android.graphics.Rect r0 = r2.f1044
            r4.getDrawingRect(r0)
            r2.offsetDescendantRectToMyCoords(r4, r0)
            int r0 = r2.m432(r0)
            if (r0 == 0) goto L19
            r1 = 0
            r2.scrollBy(r1, r0)
            goto L19
        L17:
            r2.f1052 = r4
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
            int r3 = r2.m432(r4)
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
            r2.m445(r4, r3, r4)
        L2a:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.view.VelocityTracker r0 = r1.f1054
            if (r0 == 0) goto Lc
            r0.recycle()
            r0 = 0
            r1.f1054 = r0
        Lc:
            super.requestDisallowInterceptTouchEvent(r2)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r1 = this;
            r0 = 1
            r1.f1050 = r0
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
            boolean r0 = r1.f1055
            if (r2 == r0) goto L9
            r1.f1055 = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r3) {
            r2 = this;
            b31 r2 = r2.f1039
            boolean r0 = r2.f1445
            if (r0 == 0) goto Ld
            android.view.ViewGroup r0 = r2.f1444
            java.util.WeakHashMap r1 = p000.b92.f1572
            p000.u82.m5828(r0)
        Ld:
            r2.f1445 = r3
            return
    }

    public void setOnScrollChangeListener(p000.z21 r1) {
            r0 = this;
            return
    }

    public void setSmoothScrollingEnabled(boolean r1) {
            r0 = this;
            r0.f1056 = r1
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
            b31 r1 = r1.f1039
            boolean r1 = r1.m717(r2, r0)
            return r1
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
            r1 = this;
            r0 = 0
            r1.m430(r0)
            return
    }

    /* JADX INFO: renamed from: Α */
    public final void m430(int r1) {
            r0 = this;
            b31 r0 = r0.f1039
            r0.m718(r1)
            return
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: α */
    public final void mo250(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r1 = 1
            e31 r2 = r0.f1038
            if (r4 != r1) goto L8
            r2.f3401 = r3
            goto La
        L8:
            r2.f3400 = r3
        La:
            r0.m446(r4)
            return
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: β */
    public final void mo251(android.view.ViewGroup r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r1 = 0
            r0.m438(r5, r6, r1)
            return
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: γ */
    public final void mo252(android.view.View r3, int r4) {
            r2 = this;
            r3 = 1
            e31 r0 = r2.f1038
            r1 = 0
            if (r4 != r3) goto L9
            r0.f3401 = r1
            goto Lb
        L9:
            r0.f3400 = r1
        Lb:
            r2.m430(r4)
            return
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: δ */
    public final void mo253(int r1, int r2, int[] r3, int r4) {
            r0 = this;
            r0.m433(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m431(int r11) {
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
            boolean r2 = r10.m437(r8, r1, r2)
            if (r2 == 0) goto L3a
            android.graphics.Rect r1 = r10.f1044
            r8.getDrawingRect(r1)
            r10.offsetDescendantRectToMyCoords(r8, r1)
            int r1 = r10.m432(r1)
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 1
            r0 = r10
            r0.m443(r1, r2, r3, r4, r5, r6)
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
            r0.m443(r1, r2, r3, r4, r5, r6)
        L87:
            r1 = 1
            if (r7 == 0) goto La9
            boolean r2 = r7.isFocused()
            if (r2 == 0) goto La9
            int r2 = r10.getHeight()
            boolean r2 = r10.m437(r7, r9, r2)
            if (r2 != 0) goto La9
            int r2 = r10.getDescendantFocusability()
            r3 = 131072(0x20000, float:1.83671E-40)
            r10.setDescendantFocusability(r3)
            r10.requestFocus()
            r10.setDescendantFocusability(r2)
        La9:
            return r1
    }

    @Override // p000.d31
    /* JADX INFO: renamed from: ζ */
    public final void mo254(android.view.ViewGroup r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.m438(r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: η */
    public final int m432(android.graphics.Rect r11) {
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

    /* JADX INFO: renamed from: θ */
    public final void m433(int r7, int r8, int[] r9, int r10) {
            r6 = this;
            r5 = 0
            b31 r0 = r6.f1039
            r1 = r7
            r2 = r8
            r4 = r9
            r3 = r10
            r0.m713(r1, r2, r3, r4, r5)
            return
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: ι */
    public final boolean mo257(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r0 = r3 & 2
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final boolean m434(android.view.KeyEvent r6) {
            r5 = this;
            android.graphics.Rect r0 = r5.f1044
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 130(0x82, float:1.82E-43)
            r2 = 0
            if (r0 <= 0) goto L98
            android.view.View r0 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L98
            int r0 = r6.getAction()
            if (r0 != 0) goto Lc0
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 33
            if (r0 == r3) goto L88
            r3 = 20
            if (r0 == r3) goto L78
            r3 = 62
            if (r0 == r3) goto L6d
            r6 = 92
            if (r0 == r6) goto L68
            r6 = 93
            if (r0 == r6) goto L63
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L5f
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L5b
            goto Lc0
        L5b:
            r5.m441(r1)
            return r2
        L5f:
            r5.m441(r4)
            return r2
        L63:
            boolean r5 = r5.m436(r1)
            return r5
        L68:
            boolean r5 = r5.m436(r4)
            return r5
        L6d:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L74
            r1 = r4
        L74:
            r5.m441(r1)
            return r2
        L78:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L83
            boolean r5 = r5.m436(r1)
            return r5
        L83:
            boolean r5 = r5.m431(r1)
            return r5
        L88:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L93
            boolean r5 = r5.m436(r4)
            return r5
        L93:
            boolean r5 = r5.m431(r4)
            return r5
        L98:
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto Lc0
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto Lc0
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto Lac
            r6 = 0
        Lac:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r1)
            if (r6 == 0) goto Lc0
            if (r6 == r5) goto Lc0
            boolean r5 = r6.requestFocus(r1)
            if (r5 == 0) goto Lc0
            r5 = 1
            return r5
        Lc0:
            return r2
    }

    /* JADX INFO: renamed from: λ */
    public final void m435(int r13) {
            r12 = this;
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L3e
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            r10 = 0
            r11 = 0
            android.widget.OverScroller r1 = r12.f1045
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r5 = r13
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = 1
            r12.m446(r13)
            int r13 = r12.getScrollY()
            r12.f1036 = r13
            r12.postInvalidateOnAnimation()
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 35
            if (r13 < r0) goto L3e
            android.widget.OverScroller r13 = r12.f1045
            float r13 = r13.getCurrVelocity()
            float r13 = java.lang.Math.abs(r13)
            p000.x21.m6505(r12, r13)
        L3e:
            return
    }

    /* JADX INFO: renamed from: μ */
    public final boolean m436(int r6) {
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
            android.graphics.Rect r4 = r5.f1044
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
            boolean r5 = r5.m442(r6, r0, r1)
            return r5
    }

    /* JADX INFO: renamed from: ξ */
    public final boolean m437(android.view.View r3, int r4, int r5) {
            r2 = this;
            android.graphics.Rect r0 = r2.f1044
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

    /* JADX INFO: renamed from: ο */
    public final void m438(int r11, int r12, int[] r13) {
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
            b31 r2 = r10.f1039
            r3 = 0
            r8 = r12
            r9 = r13
            r2.m714(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* JADX INFO: renamed from: π */
    public final void m439(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.f1060
            if (r1 != r2) goto L25
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            float r1 = r4.getY(r0)
            int r1 = (int) r1
            r3.f1049 = r1
            int r4 = r4.getPointerId(r0)
            r3.f1060 = r4
            android.view.VelocityTracker r3 = r3.f1054
            if (r3 == 0) goto L25
            r3.clear()
        L25:
            return
    }

    /* JADX INFO: renamed from: ρ */
    public final boolean m440(int r10, int r11, int r12, int r13) {
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
            b31 r13 = r9.f1039
            boolean r13 = r13.m716(r1)
            if (r13 != 0) goto L3e
            r7 = 0
            int r8 = r9.getScrollRange()
            android.widget.OverScroller r2 = r9.f1045
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

    /* JADX INFO: renamed from: σ */
    public final void m441(int r6) {
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
            android.graphics.Rect r4 = r5.f1044
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
            r5.m442(r6, r0, r3)
            return
    }

    /* JADX INFO: renamed from: τ */
    public final boolean m442(int r19, int r20, int r21) {
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
            r9.m443(r10, r11, r12, r13, r14, r15)
            r16 = 1
        L8a:
            android.view.View r1 = r18.findFocus()
            if (r6 == r1) goto L93
            r6.requestFocus(r0)
        L93:
            return r16
    }

    /* JADX INFO: renamed from: υ */
    public final int m443(int r21, int r22, android.view.MotionEvent r23, int r24, int r25, boolean r26) {
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r24
            r9 = r25
            r11 = 1
            if (r9 != r11) goto Le
            r0.m446(r9)
        Le:
            int[] r8 = r0.f1061
            b31 r3 = r0.f1039
            r4 = 0
            int[] r7 = r0.f1034
            r5 = r21
            r6 = r9
            boolean r3 = r3.m713(r4, r5, r6, r7, r8)
            int[] r12 = r0.f1061
            int[] r10 = r0.f1034
            r13 = 0
            if (r3 == 0) goto L2c
            r3 = r10[r11]
            int r3 = r21 - r3
            r4 = r12[r11]
            r14 = r3
            r15 = r4
            goto L2f
        L2c:
            r14 = r21
            r15 = r13
        L2f:
            int r3 = r0.getScrollY()
            int r4 = r0.getScrollRange()
            int r5 = r0.getOverScrollMode()
            if (r5 == 0) goto L45
            if (r5 != r11) goto L4a
            int r5 = r0.getScrollRange()
            if (r5 <= 0) goto L4a
        L45:
            if (r26 != 0) goto L4a
            r16 = r11
            goto L4c
        L4a:
            r16 = r13
        L4c:
            boolean r5 = r0.m440(r14, r13, r3, r4)
            if (r5 == 0) goto L5d
            b31 r5 = r0.f1039
            boolean r5 = r5.m716(r9)
            if (r5 != 0) goto L5d
            r17 = r11
            goto L5f
        L5d:
            r17 = r13
        L5f:
            int r5 = r0.getScrollY()
            int r5 = r5 - r3
            if (r23 == 0) goto L79
            if (r5 == 0) goto L79
            ar1 r6 = r0.getScrollFeedbackProvider()
            int r7 = r23.getDeviceId()
            int r8 = r23.getSource()
            zq1 r6 = r6.f1288
            r6.onScrollProgress(r7, r8, r1, r5)
        L79:
            int r7 = r14 - r5
            r10[r11] = r13
            r6 = 0
            r8 = r3
            b31 r3 = r0.f1039
            r18 = r4
            r4 = 0
            r19 = r8
            int[] r8 = r0.f1061
            r13 = r18
            r3.m714(r4, r5, r6, r7, r8, r9, r10)
            r3 = r12[r11]
            int r15 = r15 + r3
            r3 = r10[r11]
            int r14 = r14 - r3
            int r3 = r19 + r14
            android.widget.EdgeEffect r4 = r0.f1047
            android.widget.EdgeEffect r5 = r0.f1046
            if (r3 >= 0) goto Lcd
            if (r16 == 0) goto Lcb
            int r3 = -r14
            float r3 = (float) r3
            int r6 = r0.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            float r2 = (float) r2
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r2 = r2 / r6
            p000.h62.m2436(r5, r3, r2)
            if (r23 == 0) goto Lc2
            ar1 r2 = r0.getScrollFeedbackProvider()
            int r3 = r23.getDeviceId()
            int r6 = r23.getSource()
            zq1 r2 = r2.f1288
            r2.onScrollLimit(r3, r6, r1, r11)
        Lc2:
            boolean r1 = r4.isFinished()
            if (r1 != 0) goto Lcb
            r4.onRelease()
        Lcb:
            r7 = 0
            goto L104
        Lcd:
            if (r3 <= r13) goto Lcb
            if (r16 == 0) goto Lcb
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
            p000.h62.m2436(r4, r3, r6)
            if (r23 == 0) goto Lfa
            ar1 r2 = r0.getScrollFeedbackProvider()
            int r3 = r23.getDeviceId()
            int r6 = r23.getSource()
            zq1 r2 = r2.f1288
            r7 = 0
            r2.onScrollLimit(r3, r6, r1, r7)
            goto Lfb
        Lfa:
            r7 = 0
        Lfb:
            boolean r1 = r5.isFinished()
            if (r1 != 0) goto L104
            r5.onRelease()
        L104:
            boolean r1 = r5.isFinished()
            if (r1 == 0) goto L114
            boolean r1 = r4.isFinished()
            if (r1 != 0) goto L111
            goto L114
        L111:
            r13 = r17
            goto L118
        L114:
            r0.postInvalidateOnAnimation()
            r13 = r7
        L118:
            if (r13 == 0) goto L123
            if (r9 != 0) goto L123
            android.view.VelocityTracker r1 = r0.f1054
            if (r1 == 0) goto L123
            r1.clear()
        L123:
            if (r9 != r11) goto L12e
            r0.m430(r9)
            r5.onRelease()
            r4.onRelease()
        L12e:
            return r15
    }

    /* JADX INFO: renamed from: φ */
    public final boolean m444(android.widget.EdgeEffect r10, int r11) {
            r9 = this;
            r0 = 1
            if (r11 <= 0) goto L4
            return r0
        L4:
            float r10 = p000.h62.m2425(r10)
            int r1 = r9.getHeight()
            float r1 = (float) r1
            float r10 = r10 * r1
            int r11 = -r11
            int r11 = java.lang.Math.abs(r11)
            float r11 = (float) r11
            r1 = 1051931443(0x3eb33333, float:0.35)
            float r11 = r11 * r1
            r1 = 1014350479(0x3c75c28f, float:0.015)
            float r9 = r9.f1042
            float r9 = r9 * r1
            float r11 = r11 / r9
            double r1 = (double) r11
            double r1 = java.lang.Math.log(r1)
            float r11 = androidx.core.widget.NestedScrollView.f1031
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

    /* JADX INFO: renamed from: χ */
    public final void m445(int r10, int r11, boolean r12) {
            r9 = this;
            int r0 = r9.getChildCount()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r9.f1043
            long r0 = r0 - r2
            r2 = 250(0xfa, double:1.235E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L6b
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
            android.widget.OverScroller r3 = r9.f1045
            r8 = 250(0xfa, float:3.5E-43)
            r3.startScroll(r4, r5, r6, r7, r8)
            if (r12 == 0) goto L5e
            r9.m446(r1)
            goto L61
        L5e:
            r9.m430(r1)
        L61:
            int r10 = r9.getScrollY()
            r9.f1036 = r10
            r9.postInvalidateOnAnimation()
            goto L7e
        L6b:
            android.widget.OverScroller r12 = r9.f1045
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto L7b
            android.widget.OverScroller r12 = r9.f1045
            r12.abortAnimation()
            r9.m430(r1)
        L7b:
            r9.scrollBy(r10, r11)
        L7e:
            long r10 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r9.f1043 = r10
            return
    }

    /* JADX INFO: renamed from: ψ */
    public final void m446(int r2) {
            r1 = this;
            r0 = 2
            b31 r1 = r1.f1039
            r1.m717(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ω */
    public final boolean m447(android.view.MotionEvent r6) {
            r5 = this;
            android.widget.EdgeEffect r0 = r5.f1046
            float r1 = p000.h62.m2425(r0)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            if (r1 == 0) goto L1b
            float r1 = r6.getX()
            int r4 = r5.getWidth()
            float r4 = (float) r4
            float r1 = r1 / r4
            p000.h62.m2436(r0, r2, r1)
            r0 = r3
            goto L1c
        L1b:
            r0 = 0
        L1c:
            android.widget.EdgeEffect r1 = r5.f1047
            float r4 = p000.h62.m2425(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L37
            float r6 = r6.getX()
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r6 = r6 / r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r6
            p000.h62.m2436(r1, r2, r5)
            return r3
        L37:
            return r0
    }
}
