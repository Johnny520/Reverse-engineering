package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class LinearLayoutCompat extends android.view.ViewGroup {
    private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private android.graphics.drawable.Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(int r1, int r2, float r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public LinearLayoutCompat(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public LinearLayoutCompat(android.content.Context r12, android.util.AttributeSet r13, int r14) {
            r11 = this;
            r11.<init>(r12, r13, r14)
            r0 = 1
            r11.mBaselineAligned = r0
            r1 = -1
            r11.mBaselineAlignedChildIndex = r1
            r2 = 0
            r11.mBaselineChildTop = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r11.mGravity = r3
            int[] r3 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat
            androidx.appcompat.widget.TintTypedArray r3 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r12, r13, r3, r14, r2)
            int[] r6 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat
            android.content.res.TypedArray r8 = r3.getWrappedTypeArray()
            r10 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r9 = r14
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r4, r5, r6, r7, r8, r9, r10)
            int r4 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_android_orientation
            int r4 = r3.getInt(r4, r1)
            if (r4 < 0) goto L30
            r11.setOrientation(r4)
        L30:
            int r5 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_android_gravity
            int r4 = r3.getInt(r5, r1)
            if (r4 < 0) goto L3b
            r11.setGravity(r4)
        L3b:
            int r5 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_android_baselineAligned
            boolean r0 = r3.getBoolean(r5, r0)
            if (r0 != 0) goto L46
            r11.setBaselineAligned(r0)
        L46:
            int r5 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_android_weightSum
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r3.getFloat(r5, r6)
            r11.mWeightSum = r5
            int r5 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex
            int r1 = r3.getInt(r5, r1)
            r11.mBaselineAlignedChildIndex = r1
            int r1 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_measureWithLargestChild
            boolean r1 = r3.getBoolean(r1, r2)
            r11.mUseLargestChild = r1
            int r1 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_divider
            android.graphics.drawable.Drawable r1 = r3.getDrawable(r1)
            r11.setDividerDrawable(r1)
            int r1 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_showDividers
            int r1 = r3.getInt(r1, r2)
            r11.mShowDividers = r1
            int r1 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_dividerPadding
            int r1 = r3.getDimensionPixelSize(r1, r2)
            r11.mDividerPadding = r1
            r3.recycle()
            return
    }

    private void forceUniformHeight(int r12, int r13) {
            r11 = this;
            int r0 = r11.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 0
        Lb:
            if (r1 >= r12) goto L3b
            android.view.View r8 = r11.getVirtualChildAt(r1)
            int r2 = r8.getVisibility()
            r3 = 8
            if (r2 == r3) goto L38
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            r9 = r2
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r9 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r9
            int r2 = r9.height
            r3 = -1
            if (r2 != r3) goto L38
            int r10 = r9.width
            int r2 = r8.getMeasuredWidth()
            r9.width = r2
            r5 = 0
            r7 = 0
            r2 = r11
            r3 = r8
            r4 = r13
            r6 = r0
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r9.width = r10
        L38:
            int r1 = r1 + 1
            goto Lb
        L3b:
            return
    }

    private void forceUniformWidth(int r12, int r13) {
            r11 = this;
            int r0 = r11.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 0
        Lb:
            if (r1 >= r12) goto L3b
            android.view.View r8 = r11.getVirtualChildAt(r1)
            int r2 = r8.getVisibility()
            r3 = 8
            if (r2 == r3) goto L38
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            r9 = r2
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r9 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r9
            int r2 = r9.width
            r3 = -1
            if (r2 != r3) goto L38
            int r10 = r9.height
            int r2 = r8.getMeasuredHeight()
            r9.height = r2
            r5 = 0
            r7 = 0
            r2 = r11
            r3 = r8
            r4 = r0
            r6 = r13
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r9.height = r10
        L38:
            int r1 = r1 + 1
            goto Lb
        L3b:
            return
    }

    private void setChildFrame(android.view.View r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r0 = r4 + r6
            int r1 = r5 + r7
            r3.layout(r4, r5, r0, r1)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.LinearLayoutCompat.LayoutParams
            return r0
    }

    void drawDividersHorizontal(android.graphics.Canvas r8) {
            r7 = this;
            int r0 = r7.getVirtualChildCount()
            boolean r1 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r7)
            r2 = 0
        L9:
            if (r2 >= r0) goto L3f
            android.view.View r3 = r7.getVirtualChildAt(r2)
            if (r3 == 0) goto L3c
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L3c
            boolean r4 = r7.hasDividerBeforeChildAt(r2)
            if (r4 == 0) goto L3c
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            if (r1 == 0) goto L2f
            int r5 = r3.getRight()
            int r6 = r4.rightMargin
            int r5 = r5 + r6
            goto L39
        L2f:
            int r5 = r3.getLeft()
            int r6 = r4.leftMargin
            int r5 = r5 - r6
            int r6 = r7.mDividerWidth
            int r5 = r5 - r6
        L39:
            r7.drawVerticalDivider(r8, r5)
        L3c:
            int r2 = r2 + 1
            goto L9
        L3f:
            boolean r2 = r7.hasDividerBeforeChildAt(r0)
            if (r2 == 0) goto L80
            int r2 = r0 + (-1)
            android.view.View r2 = r7.getVirtualChildAt(r2)
            if (r2 != 0) goto L61
            if (r1 == 0) goto L54
            int r3 = r7.getPaddingLeft()
            goto L7d
        L54:
            int r3 = r7.getWidth()
            int r4 = r7.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r7.mDividerWidth
            int r3 = r3 - r4
            goto L7d
        L61:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            if (r1 == 0) goto L75
            int r4 = r2.getLeft()
            int r5 = r3.leftMargin
            int r4 = r4 - r5
            int r5 = r7.mDividerWidth
            int r4 = r4 - r5
            r3 = r4
            goto L7d
        L75:
            int r4 = r2.getRight()
            int r5 = r3.rightMargin
            int r4 = r4 + r5
            r3 = r4
        L7d:
            r7.drawVerticalDivider(r8, r3)
        L80:
            return
    }

    void drawDividersVertical(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r6.getVirtualChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L31
            android.view.View r2 = r6.getVirtualChildAt(r1)
            if (r2 == 0) goto L2e
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L2e
            boolean r3 = r6.hasDividerBeforeChildAt(r1)
            if (r3 == 0) goto L2e
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            int r4 = r2.getTop()
            int r5 = r3.topMargin
            int r4 = r4 - r5
            int r5 = r6.mDividerHeight
            int r4 = r4 - r5
            r6.drawHorizontalDivider(r7, r4)
        L2e:
            int r1 = r1 + 1
            goto L5
        L31:
            boolean r1 = r6.hasDividerBeforeChildAt(r0)
            if (r1 == 0) goto L5f
            int r1 = r0 + (-1)
            android.view.View r1 = r6.getVirtualChildAt(r1)
            r2 = 0
            if (r1 != 0) goto L4d
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r6.mDividerHeight
            int r3 = r3 - r4
            goto L5c
        L4d:
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            int r4 = r1.getBottom()
            int r5 = r3.bottomMargin
            int r2 = r4 + r5
            r3 = r2
        L5c:
            r6.drawHorizontalDivider(r7, r3)
        L5f:
            return
    }

    void drawHorizontalDivider(android.graphics.Canvas r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.mDivider
            int r1 = r4.getPaddingLeft()
            int r2 = r4.mDividerPadding
            int r1 = r1 + r2
            int r2 = r4.getWidth()
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r4.mDividerPadding
            int r2 = r2 - r3
            int r3 = r4.mDividerHeight
            int r3 = r3 + r6
            r0.setBounds(r1, r6, r2, r3)
            android.graphics.drawable.Drawable r0 = r4.mDivider
            r0.draw(r5)
            return
    }

    void drawVerticalDivider(android.graphics.Canvas r6, int r7) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.mDivider
            int r1 = r5.getPaddingTop()
            int r2 = r5.mDividerPadding
            int r1 = r1 + r2
            int r2 = r5.mDividerWidth
            int r2 = r2 + r7
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.mDividerPadding
            int r3 = r3 - r4
            r0.setBounds(r7, r1, r2, r3)
            android.graphics.drawable.Drawable r0 = r5.mDivider
            r0.draw(r6)
            return
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = -2
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r0.<init>(r1, r1)
            return r0
        Lb:
            int r0 = r3.mOrientation
            r2 = 1
            if (r0 != r2) goto L17
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r2 = -1
            r0.<init>(r2, r1)
            return r0
        L17:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r6 = this;
            int r0 = r6.mBaselineAlignedChildIndex
            if (r0 >= 0) goto L9
            int r0 = super.getBaseline()
            return r0
        L9:
            int r0 = r6.getChildCount()
            int r1 = r6.mBaselineAlignedChildIndex
            if (r0 <= r1) goto L75
            int r0 = r6.mBaselineAlignedChildIndex
            android.view.View r0 = r6.getChildAt(r0)
            int r1 = r0.getBaseline()
            r2 = -1
            if (r1 != r2) goto L2b
            int r3 = r6.mBaselineAlignedChildIndex
            if (r3 != 0) goto L23
            return r2
        L23:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline."
            r2.<init>(r3)
            throw r2
        L2b:
            int r2 = r6.mBaselineChildTop
            int r3 = r6.mOrientation
            r4 = 1
            if (r3 != r4) goto L6a
            int r3 = r6.mGravity
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 48
            if (r3 == r4) goto L6a
            switch(r3) {
                case 16: goto L51;
                case 80: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L6a
        L3e:
            int r4 = r6.getBottom()
            int r5 = r6.getTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r6.mTotalLength
            int r2 = r4 - r5
            goto L6a
        L51:
            int r4 = r6.getBottom()
            int r5 = r6.getTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r6.mTotalLength
            int r4 = r4 - r5
            int r4 = r4 / 2
            int r2 = r2 + r4
        L6a:
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            int r4 = r3.topMargin
            int r4 = r4 + r2
            int r4 = r4 + r1
            return r4
        L75:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."
            r0.<init>(r1)
            throw r0
    }

    public int getBaselineAlignedChildIndex() {
            r1 = this;
            int r0 = r1.mBaselineAlignedChildIndex
            return r0
    }

    int getChildrenSkipCount(android.view.View r2, int r3) {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDivider
            return r0
    }

    public int getDividerPadding() {
            r1 = this;
            int r0 = r1.mDividerPadding
            return r0
    }

    public int getDividerWidth() {
            r1 = this;
            int r0 = r1.mDividerWidth
            return r0
    }

    public int getGravity() {
            r1 = this;
            int r0 = r1.mGravity
            return r0
    }

    int getLocationOffset(android.view.View r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    int getNextLocationOffset(android.view.View r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public int getShowDividers() {
            r1 = this;
            int r0 = r1.mShowDividers
            return r0
    }

    android.view.View getVirtualChildAt(int r2) {
            r1 = this;
            android.view.View r0 = r1.getChildAt(r2)
            return r0
    }

    int getVirtualChildCount() {
            r1 = this;
            int r0 = r1.getChildCount()
            return r0
    }

    public float getWeightSum() {
            r1 = this;
            float r0 = r1.mWeightSum
            return r0
    }

    protected boolean hasDividerBeforeChildAt(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto Lb
            int r2 = r4.mShowDividers
            r2 = r2 & r1
            if (r2 == 0) goto La
            r0 = r1
        La:
            return r0
        Lb:
            int r2 = r4.getChildCount()
            if (r5 != r2) goto L19
            int r2 = r4.mShowDividers
            r2 = r2 & 4
            if (r2 == 0) goto L18
            r0 = r1
        L18:
            return r0
        L19:
            int r1 = r4.mShowDividers
            r1 = r1 & 2
            if (r1 == 0) goto L36
            r0 = 0
            int r1 = r5 + (-1)
        L22:
            if (r1 < 0) goto L35
            android.view.View r2 = r4.getChildAt(r1)
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L32
            r0 = 1
            goto L35
        L32:
            int r1 = r1 + (-1)
            goto L22
        L35:
            return r0
        L36:
            return r0
    }

    public boolean isBaselineAligned() {
            r1 = this;
            boolean r0 = r1.mBaselineAligned
            return r0
    }

    public boolean isMeasureWithLargestChildEnabled() {
            r1 = this;
            boolean r0 = r1.mUseLargestChild
            return r0
    }

    void layoutHorizontal(int r34, int r35, int r36, int r37) {
            r33 = this;
            r6 = r33
            boolean r7 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r33)
            int r8 = r33.getPaddingTop()
            int r9 = r37 - r35
            int r0 = r33.getPaddingBottom()
            int r10 = r9 - r0
            int r0 = r9 - r8
            int r1 = r33.getPaddingBottom()
            int r11 = r0 - r1
            int r12 = r33.getVirtualChildCount()
            int r0 = r6.mGravity
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r13 = r0 & r1
            int r0 = r6.mGravity
            r14 = r0 & 112(0x70, float:1.57E-43)
            boolean r15 = r6.mBaselineAligned
            int[] r5 = r6.mMaxAscent
            int[] r4 = r6.mMaxDescent
            int r3 = androidx.core.view.ViewCompat.getLayoutDirection(r33)
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r13, r3)
            r16 = 2
            switch(r0) {
                case 1: goto L4d;
                case 5: goto L41;
                default: goto L3c;
            }
        L3c:
            int r0 = r33.getPaddingLeft()
            goto L5a
        L41:
            int r0 = r33.getPaddingLeft()
            int r0 = r0 + r36
            int r0 = r0 - r34
            int r1 = r6.mTotalLength
            int r0 = r0 - r1
            goto L5a
        L4d:
            int r0 = r33.getPaddingLeft()
            int r1 = r36 - r34
            int r2 = r6.mTotalLength
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L5a:
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L66
            int r1 = r12 + (-1)
            r2 = -1
            r17 = r1
            r18 = r2
            goto L6a
        L66:
            r17 = r1
            r18 = r2
        L6a:
            r1 = 0
            r2 = r1
        L6c:
            if (r2 >= r12) goto L166
            int r1 = r18 * r2
            int r1 = r17 + r1
            r19 = r7
            android.view.View r7 = r6.getVirtualChildAt(r1)
            r20 = 1
            if (r7 != 0) goto L90
            int r21 = r6.measureNullChild(r1)
            int r0 = r0 + r21
            r22 = r3
            r31 = r4
            r32 = r5
            r29 = r8
            r26 = r9
            r28 = r10
            goto L154
        L90:
            r21 = r2
            int r2 = r7.getVisibility()
            r22 = r3
            r3 = 8
            if (r2 == r3) goto L147
            int r23 = r7.getMeasuredWidth()
            int r24 = r7.getMeasuredHeight()
            r2 = -1
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            r25 = r2
            r2 = -1
            if (r15 == 0) goto Lbc
            r26 = r9
            int r9 = r3.height
            if (r9 == r2) goto Lbe
            int r9 = r7.getBaseline()
            goto Lc0
        Lbc:
            r26 = r9
        Lbe:
            r9 = r25
        Lc0:
            int r2 = r3.gravity
            if (r2 >= 0) goto Lc8
            r2 = r14
            r27 = r2
            goto Lca
        Lc8:
            r27 = r2
        Lca:
            r2 = r27 & 112(0x70, float:1.57E-43)
            switch(r2) {
                case 16: goto Lfd;
                case 48: goto Led;
                case 80: goto Ld4;
                default: goto Lcf;
            }
        Lcf:
            r28 = r10
            r2 = r8
            r10 = r2
            goto L10b
        Ld4:
            int r2 = r10 - r24
            r28 = r10
            int r10 = r3.bottomMargin
            int r2 = r2 - r10
            r10 = -1
            if (r9 == r10) goto Leb
            int r10 = r7.getMeasuredHeight()
            int r10 = r10 - r9
            r25 = r4[r16]
            int r25 = r25 - r10
            int r2 = r2 - r25
            r10 = r2
            goto L10b
        Leb:
            r10 = r2
            goto L10b
        Led:
            r28 = r10
            int r2 = r3.topMargin
            int r2 = r2 + r8
            r10 = -1
            if (r9 == r10) goto Lfb
            r10 = r5[r20]
            int r10 = r10 - r9
            int r2 = r2 + r10
            r10 = r2
            goto L10b
        Lfb:
            r10 = r2
            goto L10b
        Lfd:
            r28 = r10
            int r2 = r11 - r24
            int r2 = r2 / 2
            int r2 = r2 + r8
            int r10 = r3.topMargin
            int r2 = r2 + r10
            int r10 = r3.bottomMargin
            int r2 = r2 - r10
            r10 = r2
        L10b:
            boolean r2 = r6.hasDividerBeforeChildAt(r1)
            if (r2 == 0) goto L114
            int r2 = r6.mDividerWidth
            int r0 = r0 + r2
        L114:
            int r2 = r3.leftMargin
            int r25 = r0 + r2
            int r0 = r6.getLocationOffset(r7)
            int r2 = r25 + r0
            r0 = r33
            r29 = r8
            r8 = r1
            r1 = r7
            r30 = r9
            r9 = r3
            r3 = r10
            r31 = r4
            r4 = r23
            r32 = r5
            r5 = r24
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r9.rightMargin
            int r0 = r23 + r0
            int r1 = r6.getNextLocationOffset(r7)
            int r0 = r0 + r1
            int r25 = r25 + r0
            int r0 = r6.getChildrenSkipCount(r7, r8)
            int r2 = r21 + r0
            r0 = r25
            goto L154
        L147:
            r31 = r4
            r32 = r5
            r29 = r8
            r26 = r9
            r28 = r10
            r8 = r1
            r2 = r21
        L154:
            int r2 = r2 + 1
            r7 = r19
            r3 = r22
            r9 = r26
            r10 = r28
            r8 = r29
            r4 = r31
            r5 = r32
            goto L6c
        L166:
            return
    }

    void layoutVertical(int r25, int r26, int r27, int r28) {
            r24 = this;
            r6 = r24
            int r7 = r24.getPaddingLeft()
            int r8 = r27 - r25
            int r0 = r24.getPaddingRight()
            int r9 = r8 - r0
            int r0 = r8 - r7
            int r1 = r24.getPaddingRight()
            int r10 = r0 - r1
            int r11 = r24.getVirtualChildCount()
            int r0 = r6.mGravity
            r12 = r0 & 112(0x70, float:1.57E-43)
            int r0 = r6.mGravity
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r13 = r0 & r1
            switch(r12) {
                case 16: goto L39;
                case 80: goto L2d;
                default: goto L28;
            }
        L28:
            int r0 = r24.getPaddingTop()
            goto L46
        L2d:
            int r0 = r24.getPaddingTop()
            int r0 = r0 + r28
            int r0 = r0 - r26
            int r1 = r6.mTotalLength
            int r0 = r0 - r1
            goto L46
        L39:
            int r0 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r6.mTotalLength
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L46:
            r1 = 0
            r14 = r1
        L48:
            if (r14 >= r11) goto Le4
            android.view.View r15 = r6.getVirtualChildAt(r14)
            if (r15 != 0) goto L59
            int r1 = r6.measureNullChild(r14)
            int r0 = r0 + r1
            r23 = r7
            goto Lde
        L59:
            int r1 = r15.getVisibility()
            r2 = 8
            if (r1 == r2) goto Ldc
            int r16 = r15.getMeasuredWidth()
            int r17 = r15.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r15.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L78
            r1 = r13
            r4 = r1
            goto L79
        L78:
            r4 = r1
        L79:
            int r3 = androidx.core.view.ViewCompat.getLayoutDirection(r24)
            int r18 = androidx.core.view.GravityCompat.getAbsoluteGravity(r4, r3)
            r1 = r18 & 7
            switch(r1) {
                case 1: goto L94;
                case 5: goto L8c;
                default: goto L86;
            }
        L86:
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            r19 = r1
            goto La1
        L8c:
            int r1 = r9 - r16
            int r2 = r5.rightMargin
            int r1 = r1 - r2
            r19 = r1
            goto La1
        L94:
            int r1 = r10 - r16
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
            int r1 = r1 - r2
            r19 = r1
        La1:
            boolean r1 = r6.hasDividerBeforeChildAt(r14)
            if (r1 == 0) goto Laa
            int r1 = r6.mDividerHeight
            int r0 = r0 + r1
        Laa:
            int r1 = r5.topMargin
            int r20 = r0 + r1
            int r0 = r6.getLocationOffset(r15)
            int r21 = r20 + r0
            r0 = r24
            r1 = r15
            r2 = r19
            r22 = r3
            r3 = r21
            r21 = r4
            r4 = r16
            r23 = r7
            r7 = r5
            r5 = r17
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r7.bottomMargin
            int r0 = r17 + r0
            int r1 = r6.getNextLocationOffset(r15)
            int r0 = r0 + r1
            int r20 = r20 + r0
            int r0 = r6.getChildrenSkipCount(r15, r14)
            int r14 = r14 + r0
            r0 = r20
            goto Lde
        Ldc:
            r23 = r7
        Lde:
            int r14 = r14 + 1
            r7 = r23
            goto L48
        Le4:
            return
    }

    void measureChildBeforeLayout(android.view.View r7, int r8, int r9, int r10, int r11, int r12) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            return
    }

    void measureHorizontal(int r49, int r50) {
            r48 = this;
            r7 = r48
            r8 = r49
            r9 = r50
            r10 = 0
            r7.mTotalLength = r10
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            int r11 = r48.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r49)
            int r13 = android.view.View.MeasureSpec.getMode(r50)
            r6 = 0
            r14 = 0
            int[] r15 = r7.mMaxAscent
            if (r15 == 0) goto L25
            int[] r15 = r7.mMaxDescent
            if (r15 != 0) goto L2e
        L25:
            r15 = 4
            int[] r10 = new int[r15]
            r7.mMaxAscent = r10
            int[] r10 = new int[r15]
            r7.mMaxDescent = r10
        L2e:
            int[] r10 = r7.mMaxAscent
            int[] r15 = r7.mMaxDescent
            r17 = 3
            r18 = r6
            r6 = -1
            r10[r17] = r6
            r19 = 2
            r10[r19] = r6
            r20 = 1
            r10[r20] = r6
            r16 = 0
            r10[r16] = r6
            r15[r17] = r6
            r15[r19] = r6
            r15[r20] = r6
            r15[r16] = r6
            boolean r6 = r7.mBaselineAligned
            r22 = r14
            boolean r14 = r7.mUseLargestChild
            r9 = 1073741824(0x40000000, float:2.0)
            if (r12 != r9) goto L5a
            r23 = r20
            goto L5c
        L5a:
            r23 = 0
        L5c:
            r24 = 0
            r25 = 0
            r9 = r25
            r45 = r5
            r5 = r0
            r0 = r45
            r46 = r4
            r4 = r1
            r1 = r24
            r24 = r22
            r22 = r18
            r18 = r46
            r47 = r3
            r3 = r2
            r2 = r47
        L77:
            r28 = 0
            if (r9 >= r11) goto L261
            android.view.View r8 = r7.getVirtualChildAt(r9)
            if (r8 != 0) goto L97
            r30 = r1
            int r1 = r7.mTotalLength
            int r26 = r7.measureNullChild(r9)
            int r1 = r1 + r26
            r7.mTotalLength = r1
            r21 = r6
            r31 = r11
            r1 = r30
            r30 = r12
            goto L255
        L97:
            r30 = r1
            int r1 = r8.getVisibility()
            r31 = r2
            r2 = 8
            if (r1 != r2) goto Lb4
            int r1 = r7.getChildrenSkipCount(r8, r9)
            int r9 = r9 + r1
            r21 = r6
            r1 = r30
            r2 = r31
            r31 = r11
            r30 = r12
            goto L255
        Lb4:
            boolean r1 = r7.hasDividerBeforeChildAt(r9)
            if (r1 == 0) goto Lc1
            int r1 = r7.mTotalLength
            int r2 = r7.mDividerWidth
            int r1 = r1 + r2
            r7.mTotalLength = r1
        Lc1:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            r2 = r1
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r2
            float r1 = r2.weight
            float r29 = r0 + r1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 != r0) goto L12c
            int r0 = r2.width
            if (r0 != 0) goto L12c
            float r0 = r2.weight
            int r0 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r0 <= 0) goto L12c
            if (r23 == 0) goto Lea
            int r0 = r7.mTotalLength
            int r1 = r2.leftMargin
            r32 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = r0 + r1
            r7.mTotalLength = r0
            goto Lfa
        Lea:
            r32 = r3
            int r0 = r7.mTotalLength
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r0, r1)
            r7.mTotalLength = r1
        Lfa:
            if (r6 == 0) goto L117
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r8.measure(r1, r1)
            r1 = r2
            r40 = r4
            r21 = r6
            r3 = r30
            r36 = r31
            r38 = r32
            r31 = r11
            r30 = r12
            r11 = -1
            r12 = r5
            goto L1b6
        L117:
            r24 = 1
            r1 = r2
            r40 = r4
            r21 = r6
            r3 = r30
            r36 = r31
            r38 = r32
            r31 = r11
            r30 = r12
            r11 = -1
            r12 = r5
            goto L1b6
        L12c:
            r32 = r3
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r2.width
            if (r1 != 0) goto L140
            float r1 = r2.weight
            int r1 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r1 <= 0) goto L140
            r0 = 0
            r1 = -2
            r2.width = r1
            r3 = r0
            goto L141
        L140:
            r3 = r0
        L141:
            int r0 = (r29 > r28 ? 1 : (r29 == r28 ? 0 : -1))
            if (r0 != 0) goto L14b
            int r0 = r7.mTotalLength
            r33 = r0
            goto L14d
        L14b:
            r33 = 0
        L14d:
            r34 = 0
            r0 = r48
            r35 = r30
            r1 = r8
            r37 = r2
            r36 = r31
            r2 = r9
            r39 = r3
            r38 = r32
            r3 = r49
            r40 = r4
            r4 = r33
            r30 = r12
            r12 = r5
            r5 = r50
            r21 = r6
            r31 = r11
            r11 = -1
            r6 = r34
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r0 = r39
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L17d
            r1 = r37
            r1.width = r0
            goto L17f
        L17d:
            r1 = r37
        L17f:
            int r2 = r8.getMeasuredWidth()
            if (r23 == 0) goto L196
            int r3 = r7.mTotalLength
            int r4 = r1.leftMargin
            int r4 = r4 + r2
            int r5 = r1.rightMargin
            int r4 = r4 + r5
            int r5 = r7.getNextLocationOffset(r8)
            int r4 = r4 + r5
            int r3 = r3 + r4
            r7.mTotalLength = r3
            goto L1ab
        L196:
            int r3 = r7.mTotalLength
            int r4 = r3 + r2
            int r5 = r1.leftMargin
            int r4 = r4 + r5
            int r5 = r1.rightMargin
            int r4 = r4 + r5
            int r5 = r7.getNextLocationOffset(r8)
            int r4 = r4 + r5
            int r4 = java.lang.Math.max(r3, r4)
            r7.mTotalLength = r4
        L1ab:
            if (r14 == 0) goto L1b4
            r3 = r35
            int r3 = java.lang.Math.max(r2, r3)
            goto L1b6
        L1b4:
            r3 = r35
        L1b6:
            r0 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L1c2
            int r2 = r1.height
            if (r2 != r11) goto L1c2
            r22 = 1
            r0 = 1
        L1c2:
            int r2 = r1.topMargin
            int r4 = r1.bottomMargin
            int r2 = r2 + r4
            int r4 = r8.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r8.getMeasuredState()
            r6 = r40
            int r5 = android.view.View.combineMeasuredStates(r6, r5)
            if (r21 == 0) goto L20d
            int r6 = r8.getBaseline()
            if (r6 == r11) goto L208
            int r11 = r1.gravity
            if (r11 >= 0) goto L1e5
            int r11 = r7.mGravity
            goto L1e7
        L1e5:
            int r11 = r1.gravity
        L1e7:
            r11 = r11 & 112(0x70, float:1.57E-43)
            int r26 = r11 >> 4
            r27 = -2
            r26 = r26 & (-2)
            int r26 = r26 >> 1
            r27 = r2
            r2 = r10[r26]
            int r2 = java.lang.Math.max(r2, r6)
            r10[r26] = r2
            r2 = r15[r26]
            r33 = r3
            int r3 = r4 - r6
            int r2 = java.lang.Math.max(r2, r3)
            r15[r26] = r2
            goto L211
        L208:
            r27 = r2
            r33 = r3
            goto L211
        L20d:
            r27 = r2
            r33 = r3
        L211:
            int r2 = java.lang.Math.max(r12, r4)
            if (r18 == 0) goto L21f
            int r3 = r1.height
            r6 = -1
            if (r3 != r6) goto L21f
            r3 = r20
            goto L220
        L21f:
            r3 = 0
        L220:
            float r6 = r1.weight
            int r6 = (r6 > r28 ? 1 : (r6 == r28 ? 0 : -1))
            if (r6 <= 0) goto L234
        L227:
            if (r0 == 0) goto L22c
            r6 = r27
            goto L22d
        L22c:
            r6 = r4
        L22d:
            r11 = r36
            int r6 = java.lang.Math.max(r11, r6)
            goto L245
        L234:
            r11 = r36
            if (r0 == 0) goto L23b
            r6 = r27
            goto L23c
        L23b:
            r6 = r4
        L23c:
            r12 = r38
            int r6 = java.lang.Math.max(r12, r6)
            r38 = r6
            r6 = r11
        L245:
            int r11 = r7.getChildrenSkipCount(r8, r9)
            int r9 = r9 + r11
            r18 = r3
            r4 = r5
            r0 = r29
            r1 = r33
            r3 = r38
            r5 = r2
            r2 = r6
        L255:
            int r9 = r9 + 1
            r8 = r49
            r6 = r21
            r12 = r30
            r11 = r31
            goto L77
        L261:
            r21 = r6
            r31 = r11
            r30 = r12
            r11 = r2
            r2 = r3
            r6 = r4
            r12 = r5
            r3 = r1
            int r1 = r7.mTotalLength
            if (r1 <= 0) goto L280
            r1 = r31
            boolean r4 = r7.hasDividerBeforeChildAt(r1)
            if (r4 == 0) goto L282
            int r4 = r7.mTotalLength
            int r5 = r7.mDividerWidth
            int r4 = r4 + r5
            r7.mTotalLength = r4
            goto L282
        L280:
            r1 = r31
        L282:
            r4 = r10[r20]
            r5 = -1
            if (r4 != r5) goto L299
            r4 = 0
            r8 = r10[r4]
            if (r8 != r5) goto L299
            r4 = r10[r19]
            if (r4 != r5) goto L299
            r4 = r10[r17]
            if (r4 == r5) goto L295
            goto L299
        L295:
            r40 = r6
            r5 = r12
            goto L2cc
        L299:
            r4 = r10[r17]
            r5 = 0
            r8 = r10[r5]
            r9 = r10[r20]
            r5 = r10[r19]
            int r5 = java.lang.Math.max(r9, r5)
            int r5 = java.lang.Math.max(r8, r5)
            int r4 = java.lang.Math.max(r4, r5)
            r5 = r15[r17]
            r8 = 0
            r9 = r15[r8]
            r8 = r15[r20]
            r40 = r6
            r6 = r15[r19]
            int r6 = java.lang.Math.max(r8, r6)
            int r6 = java.lang.Math.max(r9, r6)
            int r5 = java.lang.Math.max(r5, r6)
            int r6 = r4 + r5
            int r6 = java.lang.Math.max(r12, r6)
            r5 = r6
        L2cc:
            if (r14 == 0) goto L348
            r4 = r30
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r6) goto L2db
            if (r4 != 0) goto L2d7
            goto L2db
        L2d7:
            r26 = r5
            goto L34c
        L2db:
            r6 = 0
            r7.mTotalLength = r6
            r6 = 0
        L2df:
            if (r6 >= r1) goto L343
            android.view.View r8 = r7.getVirtualChildAt(r6)
            if (r8 != 0) goto L2f5
            int r9 = r7.mTotalLength
            int r12 = r7.measureNullChild(r6)
            int r9 = r9 + r12
            r7.mTotalLength = r9
            r26 = r5
            r30 = r6
            goto L33c
        L2f5:
            int r9 = r8.getVisibility()
            r12 = 8
            if (r9 != r12) goto L305
            int r9 = r7.getChildrenSkipCount(r8, r6)
            int r6 = r6 + r9
            r26 = r5
            goto L33e
        L305:
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r9 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r9
            if (r23 == 0) goto L323
            int r12 = r7.mTotalLength
            r26 = r5
            int r5 = r9.leftMargin
            int r5 = r5 + r3
            r30 = r6
            int r6 = r9.rightMargin
            int r5 = r5 + r6
            int r6 = r7.getNextLocationOffset(r8)
            int r5 = r5 + r6
            int r12 = r12 + r5
            r7.mTotalLength = r12
            goto L33c
        L323:
            r26 = r5
            r30 = r6
            int r5 = r7.mTotalLength
            int r6 = r5 + r3
            int r12 = r9.leftMargin
            int r6 = r6 + r12
            int r12 = r9.rightMargin
            int r6 = r6 + r12
            int r12 = r7.getNextLocationOffset(r8)
            int r6 = r6 + r12
            int r6 = java.lang.Math.max(r5, r6)
            r7.mTotalLength = r6
        L33c:
            r6 = r30
        L33e:
            int r6 = r6 + 1
            r5 = r26
            goto L2df
        L343:
            r26 = r5
            r30 = r6
            goto L34c
        L348:
            r26 = r5
            r4 = r30
        L34c:
            int r5 = r7.mTotalLength
            int r6 = r48.getPaddingLeft()
            int r8 = r48.getPaddingRight()
            int r6 = r6 + r8
            int r5 = r5 + r6
            r7.mTotalLength = r5
            int r5 = r7.mTotalLength
            int r6 = r48.getSuggestedMinimumWidth()
            int r5 = java.lang.Math.max(r5, r6)
            r6 = r49
            r8 = 0
            int r9 = android.view.View.resolveSizeAndState(r5, r6, r8)
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r9 & r8
            int r8 = r7.mTotalLength
            int r8 = r5 - r8
            if (r24 != 0) goto L424
            if (r8 == 0) goto L387
            int r30 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r30 <= 0) goto L387
            r31 = r0
            r35 = r3
            r33 = r5
            r3 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            goto L42d
        L387:
            int r2 = java.lang.Math.max(r2, r11)
            if (r14 == 0) goto L404
            r12 = 1073741824(0x40000000, float:2.0)
            if (r4 == r12) goto L3fa
            r12 = 0
        L392:
            if (r12 >= r1) goto L3ef
            r31 = r0
            android.view.View r0 = r7.getVirtualChildAt(r12)
            if (r0 == 0) goto L3dc
            r16 = r2
            int r2 = r0.getVisibility()
            r33 = r5
            r5 = 8
            if (r2 != r5) goto L3ad
            r35 = r3
            r2 = 1073741824(0x40000000, float:2.0)
            goto L3e4
        L3ad:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r2
            float r5 = r2.weight
            int r17 = (r5 > r28 ? 1 : (r5 == r28 ? 0 : -1))
            if (r17 <= 0) goto L3d3
        L3bb:
            r17 = r2
            r19 = r5
            r2 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r35 = r3
            int r3 = r0.getMeasuredHeight()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r0.measure(r5, r3)
            goto L3e4
        L3d3:
            r17 = r2
            r35 = r3
            r19 = r5
            r2 = 1073741824(0x40000000, float:2.0)
            goto L3e4
        L3dc:
            r16 = r2
            r35 = r3
            r33 = r5
            r2 = 1073741824(0x40000000, float:2.0)
        L3e4:
            int r12 = r12 + 1
            r2 = r16
            r0 = r31
            r5 = r33
            r3 = r35
            goto L392
        L3ef:
            r31 = r0
            r16 = r2
            r35 = r3
            r33 = r5
            r2 = 1073741824(0x40000000, float:2.0)
            goto L40e
        L3fa:
            r31 = r0
            r16 = r2
            r35 = r3
            r33 = r5
            r2 = r12
            goto L40e
        L404:
            r31 = r0
            r16 = r2
            r35 = r3
            r33 = r5
            r2 = 1073741824(0x40000000, float:2.0)
        L40e:
            r12 = r50
            r34 = r1
            r25 = r9
            r36 = r11
            r2 = r16
            r5 = r26
            r26 = r14
            r45 = r40
            r40 = r4
            r4 = r45
            goto L61f
        L424:
            r31 = r0
            r35 = r3
            r33 = r5
            r3 = r2
            r2 = 1073741824(0x40000000, float:2.0)
        L42d:
            float r0 = r7.mWeightSum
            int r0 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r0 <= 0) goto L436
            float r0 = r7.mWeightSum
            goto L438
        L436:
            r0 = r31
        L438:
            r5 = -1
            r10[r17] = r5
            r10[r19] = r5
            r10[r20] = r5
            r12 = 0
            r10[r12] = r5
            r15[r17] = r5
            r15[r19] = r5
            r15[r20] = r5
            r15[r12] = r5
            r5 = -1
            r7.mTotalLength = r12
            r12 = 0
            r2 = r12
            r12 = r8
            r8 = r5
            r5 = r40
        L453:
            if (r2 >= r1) goto L5bc
            r36 = r11
            android.view.View r11 = r7.getVirtualChildAt(r2)
            if (r11 == 0) goto L59e
            r26 = r14
            int r14 = r11.getVisibility()
            r34 = r1
            r1 = 8
            if (r14 != r1) goto L474
            r40 = r4
            r25 = r9
            r1 = r12
            r27 = -2
            r12 = r50
            goto L5ab
        L474:
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r14 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r14
            float r1 = r14.weight
            int r37 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r37 <= 0) goto L4e7
            float r6 = (float) r12
            float r6 = r6 * r1
            float r6 = r6 / r0
            int r6 = (int) r6
            float r0 = r0 - r1
            int r12 = r12 - r6
            int r37 = r48.getPaddingTop()
            int r38 = r48.getPaddingBottom()
            int r37 = r37 + r38
            r38 = r0
            int r0 = r14.topMargin
            int r37 = r37 + r0
            int r0 = r14.bottomMargin
            int r0 = r37 + r0
            r37 = r1
            int r1 = r14.height
            r25 = r9
            r39 = r12
            r9 = 1073741824(0x40000000, float:2.0)
            r12 = r50
            int r0 = getChildMeasureSpec(r12, r0, r1)
            int r1 = r14.width
            if (r1 != 0) goto L4c3
            if (r4 == r9) goto L4b3
            goto L4c3
        L4b3:
            if (r6 <= 0) goto L4b8
            r1 = r6
            goto L4b9
        L4b8:
            r1 = 0
        L4b9:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            r11.measure(r1, r0)
            r40 = r4
            goto L4d6
        L4c3:
            int r1 = r11.getMeasuredWidth()
            int r1 = r1 + r6
            if (r1 >= 0) goto L4cb
            r1 = 0
        L4cb:
            r40 = r4
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            r11.measure(r4, r0)
        L4d6:
            int r1 = r11.getMeasuredState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r4
            int r5 = android.view.View.combineMeasuredStates(r5, r1)
            r0 = r38
            r1 = r39
            goto L4f2
        L4e7:
            r37 = r1
            r40 = r4
            r25 = r9
            r1 = r12
            r9 = 1073741824(0x40000000, float:2.0)
            r12 = r50
        L4f2:
            if (r23 == 0) goto L509
            int r4 = r7.mTotalLength
            int r6 = r11.getMeasuredWidth()
            int r9 = r14.leftMargin
            int r6 = r6 + r9
            int r9 = r14.rightMargin
            int r6 = r6 + r9
            int r9 = r7.getNextLocationOffset(r11)
            int r6 = r6 + r9
            int r4 = r4 + r6
            r7.mTotalLength = r4
            goto L521
        L509:
            int r4 = r7.mTotalLength
            int r6 = r11.getMeasuredWidth()
            int r6 = r6 + r4
            int r9 = r14.leftMargin
            int r6 = r6 + r9
            int r9 = r14.rightMargin
            int r6 = r6 + r9
            int r9 = r7.getNextLocationOffset(r11)
            int r6 = r6 + r9
            int r6 = java.lang.Math.max(r4, r6)
            r7.mTotalLength = r6
        L521:
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L52d
            int r4 = r14.height
            r6 = -1
            if (r4 != r6) goto L52d
            r4 = r20
            goto L52e
        L52d:
            r4 = 0
        L52e:
            int r6 = r14.topMargin
            int r9 = r14.bottomMargin
            int r6 = r6 + r9
            int r9 = r11.getMeasuredHeight()
            int r9 = r9 + r6
            int r8 = java.lang.Math.max(r8, r9)
            r39 = r0
            if (r4 == 0) goto L543
            r0 = r6
            goto L544
        L543:
            r0 = r9
        L544:
            int r0 = java.lang.Math.max(r3, r0)
            if (r18 == 0) goto L554
            int r3 = r14.height
            r41 = r0
            r0 = -1
            if (r3 != r0) goto L556
            r0 = r20
            goto L557
        L554:
            r41 = r0
        L556:
            r0 = 0
        L557:
            if (r21 == 0) goto L591
            int r3 = r11.getBaseline()
            r18 = r0
            r0 = -1
            if (r3 == r0) goto L58c
            int r0 = r14.gravity
            if (r0 >= 0) goto L569
            int r0 = r7.mGravity
            goto L56b
        L569:
            int r0 = r14.gravity
        L56b:
            r0 = r0 & 112(0x70, float:1.57E-43)
            int r42 = r0 >> 4
            r27 = -2
            r42 = r42 & (-2)
            int r42 = r42 >> 1
            r43 = r0
            r0 = r10[r42]
            int r0 = java.lang.Math.max(r0, r3)
            r10[r42] = r0
            r0 = r15[r42]
            r44 = r1
            int r1 = r9 - r3
            int r0 = java.lang.Math.max(r0, r1)
            r15[r42] = r0
            goto L597
        L58c:
            r44 = r1
            r27 = -2
            goto L597
        L591:
            r18 = r0
            r44 = r1
            r27 = -2
        L597:
            r0 = r39
            r3 = r41
            r1 = r44
            goto L5ab
        L59e:
            r34 = r1
            r40 = r4
            r25 = r9
            r1 = r12
            r26 = r14
            r27 = -2
            r12 = r50
        L5ab:
            int r2 = r2 + 1
            r6 = r49
            r12 = r1
            r9 = r25
            r14 = r26
            r1 = r34
            r11 = r36
            r4 = r40
            goto L453
        L5bc:
            r34 = r1
            r40 = r4
            r25 = r9
            r36 = r11
            r1 = r12
            r26 = r14
            r12 = r50
            int r2 = r7.mTotalLength
            int r4 = r48.getPaddingLeft()
            int r6 = r48.getPaddingRight()
            int r4 = r4 + r6
            int r2 = r2 + r4
            r7.mTotalLength = r2
            r2 = r10[r20]
            r4 = -1
            if (r2 != r4) goto L5ec
            r2 = 0
            r6 = r10[r2]
            if (r6 != r4) goto L5ec
            r2 = r10[r19]
            if (r2 != r4) goto L5ec
            r2 = r10[r17]
            if (r2 == r4) goto L5ea
            goto L5ec
        L5ea:
            r6 = r8
            goto L61b
        L5ec:
            r2 = r10[r17]
            r4 = 0
            r6 = r10[r4]
            r9 = r10[r20]
            r11 = r10[r19]
            int r9 = java.lang.Math.max(r9, r11)
            int r6 = java.lang.Math.max(r6, r9)
            int r2 = java.lang.Math.max(r2, r6)
            r6 = r15[r17]
            r4 = r15[r4]
            r9 = r15[r20]
            r11 = r15[r19]
            int r9 = java.lang.Math.max(r9, r11)
            int r4 = java.lang.Math.max(r4, r9)
            int r4 = java.lang.Math.max(r6, r4)
            int r6 = r2 + r4
            int r6 = java.lang.Math.max(r8, r6)
        L61b:
            r8 = r1
            r2 = r3
            r4 = r5
            r5 = r6
        L61f:
            if (r18 != 0) goto L626
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L626
            r5 = r2
        L626:
            int r0 = r48.getPaddingTop()
            int r1 = r48.getPaddingBottom()
            int r0 = r0 + r1
            int r5 = r5 + r0
            int r0 = r48.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r5, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r4
            r1 = r25 | r1
            int r3 = r4 << 16
            int r3 = android.view.View.resolveSizeAndState(r0, r12, r3)
            r7.setMeasuredDimension(r1, r3)
            if (r22 == 0) goto L650
            r1 = r49
            r3 = r34
            r7.forceUniformHeight(r3, r1)
            goto L654
        L650:
            r1 = r49
            r3 = r34
        L654:
            return
    }

    int measureNullChild(int r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    void measureVertical(int r39, int r40) {
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.mTotalLength = r10
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            r6 = 0
            r14 = 0
            int r15 = r7.mBaselineAlignedChildIndex
            boolean r10 = r7.mUseLargestChild
            r17 = 0
            r18 = 0
            r19 = r14
            r14 = r0
            r0 = r5
            r5 = r2
            r2 = r18
            r18 = r6
            r6 = r1
            r37 = r4
            r4 = r3
            r3 = r17
            r17 = r37
        L36:
            r20 = r4
            r1 = 8
            r22 = 1
            r23 = 0
            if (r2 >= r11) goto L1c1
            android.view.View r4 = r7.getVirtualChildAt(r2)
            if (r4 != 0) goto L54
            int r1 = r7.mTotalLength
            int r21 = r7.measureNullChild(r2)
            int r1 = r1 + r21
            r7.mTotalLength = r1
            r4 = r20
            goto L1bb
        L54:
            r26 = r3
            int r3 = r4.getVisibility()
            if (r3 != r1) goto L67
            int r1 = r7.getChildrenSkipCount(r4, r2)
            int r2 = r2 + r1
            r4 = r20
            r3 = r26
            goto L1bb
        L67:
            boolean r1 = r7.hasDividerBeforeChildAt(r2)
            if (r1 == 0) goto L74
            int r1 = r7.mTotalLength
            int r3 = r7.mDividerHeight
            int r1 = r1 + r3
            r7.mTotalLength = r1
        L74:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r3 = r1
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            float r1 = r3.weight
            float r27 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto Lad
            int r0 = r3.height
            if (r0 != 0) goto Lad
            float r0 = r3.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto Lad
            int r0 = r7.mTotalLength
            int r1 = r3.topMargin
            int r1 = r1 + r0
            r28 = r2
            int r2 = r3.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r0, r1)
            r7.mTotalLength = r1
            r19 = 1
            r1 = r3
            r35 = r5
            r36 = r6
            r34 = r20
            r3 = r26
            r25 = r28
            r5 = r4
            goto L127
        Lad:
            r28 = r2
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r3.height
            if (r1 != 0) goto Lc1
            float r1 = r3.weight
            int r1 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r1 <= 0) goto Lc1
            r0 = 0
            r1 = -2
            r3.height = r1
            r2 = r0
            goto Lc2
        Lc1:
            r2 = r0
        Lc2:
            int r0 = (r27 > r23 ? 1 : (r27 == r23 ? 0 : -1))
            if (r0 != 0) goto Lcc
            int r0 = r7.mTotalLength
            r29 = r0
            goto Lce
        Lcc:
            r29 = 0
        Lce:
            r30 = 0
            r0 = r38
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r31 = r2
            r25 = r28
            r2 = r25
            r33 = r3
            r32 = r26
            r3 = r39
            r34 = r20
            r20 = r4
            r4 = r30
            r35 = r5
            r5 = r40
            r36 = r6
            r6 = r29
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r0 = r31
            if (r0 == r8) goto Lfd
            r1 = r33
            r1.height = r0
            goto Lff
        Lfd:
            r1 = r33
        Lff:
            int r2 = r20.getMeasuredHeight()
            int r3 = r7.mTotalLength
            int r4 = r3 + r2
            int r5 = r1.topMargin
            int r4 = r4 + r5
            int r5 = r1.bottomMargin
            int r4 = r4 + r5
            r5 = r20
            int r6 = r7.getNextLocationOffset(r5)
            int r4 = r4 + r6
            int r4 = java.lang.Math.max(r3, r4)
            r7.mTotalLength = r4
            if (r10 == 0) goto L124
            r4 = r32
            int r4 = java.lang.Math.max(r2, r4)
            r3 = r4
            goto L127
        L124:
            r4 = r32
            r3 = r4
        L127:
            if (r15 < 0) goto L134
            r2 = r25
            int r0 = r2 + 1
            if (r15 != r0) goto L136
            int r0 = r7.mTotalLength
            r7.mBaselineChildTop = r0
            goto L136
        L134:
            r2 = r25
        L136:
            if (r2 >= r15) goto L147
            float r0 = r1.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 > 0) goto L13f
            goto L147
        L13f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r4 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r4)
            throw r0
        L147:
            r0 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            if (r12 == r6) goto L155
            int r4 = r1.width
            r6 = -1
            if (r4 != r6) goto L156
            r18 = 1
            r0 = 1
            goto L156
        L155:
            r6 = -1
        L156:
            int r4 = r1.leftMargin
            int r8 = r1.rightMargin
            int r4 = r4 + r8
            int r8 = r5.getMeasuredWidth()
            int r8 = r8 + r4
            int r14 = java.lang.Math.max(r14, r8)
            int r6 = r5.getMeasuredState()
            r20 = r8
            r8 = r36
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r17 == 0) goto L17d
            int r8 = r1.width
            r21 = r3
            r3 = -1
            if (r8 != r3) goto L17f
            r3 = r22
            goto L180
        L17d:
            r21 = r3
        L17f:
            r3 = 0
        L180:
            float r8 = r1.weight
            int r8 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r8 <= 0) goto L19a
        L187:
            if (r0 == 0) goto L18b
            r8 = r4
            goto L18d
        L18b:
            r8 = r20
        L18d:
            r24 = r6
            r6 = r34
            int r6 = java.lang.Math.max(r6, r8)
            r33 = r1
            r1 = r35
            goto L1ac
        L19a:
            r24 = r6
            r6 = r34
            if (r0 == 0) goto L1a2
            r8 = r4
            goto L1a4
        L1a2:
            r8 = r20
        L1a4:
            r33 = r1
            r1 = r35
            int r1 = java.lang.Math.max(r1, r8)
        L1ac:
            int r8 = r7.getChildrenSkipCount(r5, r2)
            int r2 = r2 + r8
            r5 = r1
            r17 = r3
            r4 = r6
            r3 = r21
            r6 = r24
            r0 = r27
        L1bb:
            int r2 = r2 + 1
            r8 = r39
            goto L36
        L1c1:
            r4 = r3
            r8 = r6
            r6 = r20
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r37 = r5
            r5 = r1
            r1 = r37
            int r2 = r7.mTotalLength
            if (r2 <= 0) goto L1dd
            boolean r2 = r7.hasDividerBeforeChildAt(r11)
            if (r2 == 0) goto L1dd
            int r2 = r7.mTotalLength
            int r5 = r7.mDividerHeight
            int r2 = r2 + r5
            r7.mTotalLength = r2
        L1dd:
            if (r10 == 0) goto L23f
            if (r13 == r3) goto L1e7
            if (r13 != 0) goto L1e4
            goto L1e7
        L1e4:
            r36 = r8
            goto L241
        L1e7:
            r2 = 0
            r7.mTotalLength = r2
            r2 = 0
        L1eb:
            if (r2 >= r11) goto L23a
            android.view.View r3 = r7.getVirtualChildAt(r2)
            if (r3 != 0) goto L202
            int r5 = r7.mTotalLength
            int r21 = r7.measureNullChild(r2)
            int r5 = r5 + r21
            r7.mTotalLength = r5
            r24 = r2
            r36 = r8
            goto L233
        L202:
            int r5 = r3.getVisibility()
            r36 = r8
            r8 = 8
            if (r5 != r8) goto L212
            int r5 = r7.getChildrenSkipCount(r3, r2)
            int r2 = r2 + r5
            goto L235
        L212:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            int r8 = r7.mTotalLength
            int r21 = r8 + r4
            r24 = r2
            int r2 = r5.topMargin
            int r21 = r21 + r2
            int r2 = r5.bottomMargin
            int r21 = r21 + r2
            int r2 = r7.getNextLocationOffset(r3)
            int r2 = r21 + r2
            int r2 = java.lang.Math.max(r8, r2)
            r7.mTotalLength = r2
        L233:
            r2 = r24
        L235:
            int r2 = r2 + 1
            r8 = r36
            goto L1eb
        L23a:
            r24 = r2
            r36 = r8
            goto L241
        L23f:
            r36 = r8
        L241:
            int r2 = r7.mTotalLength
            int r3 = r38.getPaddingTop()
            int r5 = r38.getPaddingBottom()
            int r3 = r3 + r5
            int r2 = r2 + r3
            r7.mTotalLength = r2
            int r2 = r7.mTotalLength
            int r3 = r38.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r2, r3)
            r3 = 0
            int r5 = android.view.View.resolveSizeAndState(r2, r9, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r5 & r3
            int r3 = r7.mTotalLength
            int r3 = r2 - r3
            if (r19 != 0) goto L301
            if (r3 == 0) goto L277
            int r8 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r8 <= 0) goto L277
            r21 = r0
            r24 = r2
            r26 = r3
            goto L307
        L277:
            int r1 = java.lang.Math.max(r1, r6)
            if (r10 == 0) goto L2e5
            r8 = 1073741824(0x40000000, float:2.0)
            if (r13 == r8) goto L2e5
            r16 = 0
            r8 = r16
        L285:
            if (r8 >= r11) goto L2dc
            r21 = r0
            android.view.View r0 = r7.getVirtualChildAt(r8)
            if (r0 == 0) goto L2cb
            r16 = r1
            int r1 = r0.getVisibility()
            r24 = r2
            r2 = 8
            if (r1 != r2) goto L29e
            r26 = r3
            goto L2d1
        L29e:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            float r2 = r1.weight
            int r22 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r22 <= 0) goto L2c4
        L2ac:
            r22 = r1
            int r1 = r0.getMeasuredWidth()
            r25 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            r26 = r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            r0.measure(r1, r3)
            goto L2d1
        L2c4:
            r22 = r1
            r25 = r2
            r26 = r3
            goto L2d1
        L2cb:
            r16 = r1
            r24 = r2
            r26 = r3
        L2d1:
            int r8 = r8 + 1
            r1 = r16
            r0 = r21
            r2 = r24
            r3 = r26
            goto L285
        L2dc:
            r21 = r0
            r16 = r1
            r24 = r2
            r26 = r3
            goto L2ed
        L2e5:
            r21 = r0
            r16 = r1
            r24 = r2
            r26 = r3
        L2ed:
            r32 = r4
            r34 = r6
            r25 = r10
            r30 = r13
            r1 = r16
            r3 = r26
            r6 = r36
            r10 = r39
            r26 = r15
            goto L446
        L301:
            r21 = r0
            r24 = r2
            r26 = r3
        L307:
            float r0 = r7.mWeightSum
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L310
            float r0 = r7.mWeightSum
            goto L312
        L310:
            r0 = r21
        L312:
            r2 = 0
            r7.mTotalLength = r2
            r3 = 0
            r8 = r1
            r2 = r14
            r1 = r26
            r14 = r36
        L31c:
            if (r3 >= r11) goto L428
            r32 = r4
            android.view.View r4 = r7.getVirtualChildAt(r3)
            r34 = r6
            int r6 = r4.getVisibility()
            r25 = r10
            r10 = 8
            if (r6 != r10) goto L338
            r10 = r39
            r30 = r13
            r26 = r15
            goto L41a
        L338:
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r6 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r6
            float r10 = r6.weight
            int r26 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r26 <= 0) goto L3b1
            r26 = r15
            float r15 = (float) r1
            float r15 = r15 * r10
            float r15 = r15 / r0
            int r15 = (int) r15
            float r0 = r0 - r10
            int r1 = r1 - r15
            int r27 = r38.getPaddingLeft()
            int r28 = r38.getPaddingRight()
            int r27 = r27 + r28
            r28 = r0
            int r0 = r6.leftMargin
            int r27 = r27 + r0
            int r0 = r6.rightMargin
            int r0 = r27 + r0
            r27 = r1
            int r1 = r6.width
            r29 = r10
            r10 = r39
            int r0 = getChildMeasureSpec(r10, r0, r1)
            int r1 = r6.height
            if (r1 != 0) goto L38a
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 == r1) goto L378
            r30 = r13
            goto L38c
        L378:
            r30 = r13
            if (r15 <= 0) goto L37f
            r13 = r15
            goto L380
        L37f:
            r13 = 0
        L380:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r1)
            r4.measure(r0, r13)
            r31 = r15
            goto L3a1
        L38a:
            r30 = r13
        L38c:
            int r1 = r4.getMeasuredHeight()
            int r1 = r1 + r15
            if (r1 >= 0) goto L394
            r1 = 0
        L394:
            r31 = r15
            r13 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r13)
            r4.measure(r0, r15)
        L3a1:
            int r1 = r4.getMeasuredState()
            r1 = r1 & (-256(0xffffffffffffff00, float:NaN))
            int r14 = android.view.View.combineMeasuredStates(r14, r1)
            r1 = r27
            r0 = r28
            goto L3b9
        L3b1:
            r29 = r10
            r30 = r13
            r26 = r15
            r10 = r39
        L3b9:
            int r13 = r6.leftMargin
            int r15 = r6.rightMargin
            int r13 = r13 + r15
            int r15 = r4.getMeasuredWidth()
            int r15 = r15 + r13
            int r2 = java.lang.Math.max(r2, r15)
            r27 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L3d7
            int r0 = r6.width
            r28 = r1
            r1 = -1
            if (r0 != r1) goto L3d9
            r0 = r22
            goto L3da
        L3d7:
            r28 = r1
        L3d9:
            r0 = 0
        L3da:
            if (r0 == 0) goto L3df
            r1 = r13
            goto L3e0
        L3df:
            r1 = r15
        L3e0:
            int r1 = java.lang.Math.max(r8, r1)
            if (r17 == 0) goto L3f0
            int r8 = r6.width
            r31 = r0
            r0 = -1
            if (r8 != r0) goto L3f3
            r8 = r22
            goto L3f4
        L3f0:
            r31 = r0
            r0 = -1
        L3f3:
            r8 = 0
        L3f4:
            int r0 = r7.mTotalLength
            int r17 = r4.getMeasuredHeight()
            int r17 = r0 + r17
            r33 = r1
            int r1 = r6.topMargin
            int r17 = r17 + r1
            int r1 = r6.bottomMargin
            int r17 = r17 + r1
            int r1 = r7.getNextLocationOffset(r4)
            int r1 = r17 + r1
            int r1 = java.lang.Math.max(r0, r1)
            r7.mTotalLength = r1
            r17 = r8
            r0 = r27
            r1 = r28
            r8 = r33
        L41a:
            int r3 = r3 + 1
            r10 = r25
            r15 = r26
            r13 = r30
            r4 = r32
            r6 = r34
            goto L31c
        L428:
            r32 = r4
            r34 = r6
            r25 = r10
            r30 = r13
            r26 = r15
            r10 = r39
            int r3 = r7.mTotalLength
            int r4 = r38.getPaddingTop()
            int r6 = r38.getPaddingBottom()
            int r4 = r4 + r6
            int r3 = r3 + r4
            r7.mTotalLength = r3
            r3 = r1
            r1 = r8
            r6 = r14
            r14 = r2
        L446:
            if (r17 != 0) goto L44d
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L44d
            r14 = r1
        L44d:
            int r0 = r38.getPaddingLeft()
            int r2 = r38.getPaddingRight()
            int r0 = r0 + r2
            int r14 = r14 + r0
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r14, r0)
            int r2 = android.view.View.resolveSizeAndState(r0, r10, r6)
            r7.setMeasuredDimension(r2, r5)
            if (r18 == 0) goto L46b
            r7.forceUniformWidth(r11, r9)
        L46b:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDivider
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto Le
            r2.drawDividersVertical(r3)
            goto L11
        Le:
            r2.drawDividersHorizontal(r3)
        L11:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L9
            r2.layoutVertical(r4, r5, r6, r7)
            goto Lc
        L9:
            r2.layoutHorizontal(r4, r5, r6, r7)
        Lc:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L9
            r2.measureVertical(r3, r4)
            goto Lc
        L9:
            r2.measureHorizontal(r3, r4)
        Lc:
            return
    }

    public void setBaselineAligned(boolean r1) {
            r0 = this;
            r0.mBaselineAligned = r1
            return
    }

    public void setBaselineAlignedChildIndex(int r4) {
            r3 = this;
            if (r4 < 0) goto Lb
            int r0 = r3.getChildCount()
            if (r4 >= r0) goto Lb
            r3.mBaselineAlignedChildIndex = r4
            return
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "base aligned child index out of range (0, "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.getChildCount()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ")"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDivider
            if (r3 != r0) goto L5
            return
        L5:
            r2.mDivider = r3
            r0 = 0
            if (r3 == 0) goto L17
            int r1 = r3.getIntrinsicWidth()
            r2.mDividerWidth = r1
            int r1 = r3.getIntrinsicHeight()
            r2.mDividerHeight = r1
            goto L1b
        L17:
            r2.mDividerWidth = r0
            r2.mDividerHeight = r0
        L1b:
            if (r3 != 0) goto L1e
            r0 = 1
        L1e:
            r2.setWillNotDraw(r0)
            r2.requestLayout()
            return
    }

    public void setDividerPadding(int r1) {
            r0 = this;
            r0.mDividerPadding = r1
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.mGravity
            if (r0 == r2) goto L19
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            if (r0 != 0) goto Le
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r0
        Le:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L14
            r2 = r2 | 48
        L14:
            r1.mGravity = r2
            r1.requestLayout()
        L19:
            return
    }

    public void setHorizontalGravity(int r4) {
            r3 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r4 & r0
            int r2 = r3.mGravity
            r0 = r0 & r2
            if (r0 == r1) goto L16
            int r0 = r3.mGravity
            r2 = -8388616(0xffffffffff7ffff8, float:-3.402822E38)
            r0 = r0 & r2
            r0 = r0 | r1
            r3.mGravity = r0
            r3.requestLayout()
        L16:
            return
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
            r0 = this;
            r0.mUseLargestChild = r1
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 == r2) goto L9
            r1.mOrientation = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setShowDividers(int r2) {
            r1 = this;
            int r0 = r1.mShowDividers
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.mShowDividers = r2
            return
    }

    public void setVerticalGravity(int r3) {
            r2 = this;
            r0 = r3 & 112(0x70, float:1.57E-43)
            int r1 = r2.mGravity
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 == r0) goto L12
            int r1 = r2.mGravity
            r1 = r1 & (-113(0xffffffffffffff8f, float:NaN))
            r1 = r1 | r0
            r2.mGravity = r1
            r2.requestLayout()
        L12:
            return
    }

    public void setWeightSum(float r2) {
            r1 = this;
            r0 = 0
            float r0 = java.lang.Math.max(r0, r2)
            r1.mWeightSum = r0
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
