package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛶᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0287 extends android.view.ViewGroup {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f1100;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f1101;

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public int f1102;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f1103;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public boolean f1104;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public int f1105;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public int[] f1106;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public boolean f1107;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public int f1108;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public int[] f1109;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public float f1110;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f1111;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f1112;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public int f1113;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f1114;

    public AbstractC0287(android.content.Context r11, android.util.AttributeSet r12) {
            r10 = this;
            r5 = 0
            r10.<init>(r11, r12, r5)
            r7 = 1
            r10.f1104 = r7
            r8 = -1
            r10.f1100 = r8
            r9 = 0
            r10.f1101 = r9
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r10.f1103 = r0
            int[] r2 = xhss.AbstractC0293.f1127
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r12, r2, r5, r9)
            int r0 = xhss.AbstractC0624.f2154
            r6 = 0
            r0 = r10
            r1 = r11
            r3 = r12
            xhss.AbstractC0413.m802(r0, r1, r2, r3, r4, r5, r6)
            int r10 = r4.getInt(r7, r8)
            if (r10 < 0) goto L2a
            r0.setOrientation(r10)
        L2a:
            int r10 = r4.getInt(r9, r8)
            if (r10 < 0) goto L33
            r0.setGravity(r10)
        L33:
            r10 = 2
            boolean r10 = r4.getBoolean(r10, r7)
            if (r10 != 0) goto L3d
            r0.setBaselineAligned(r10)
        L3d:
            r10 = 4
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r10 = r4.getFloat(r10, r11)
            r0.f1110 = r10
            r10 = 3
            int r10 = r4.getInt(r10, r8)
            r0.f1100 = r10
            r10 = 7
            boolean r10 = r4.getBoolean(r10, r9)
            r0.f1107 = r10
            r10 = 5
            boolean r11 = r4.hasValue(r10)
            if (r11 == 0) goto L66
            int r11 = r4.getResourceId(r10, r9)
            if (r11 == 0) goto L66
            android.graphics.drawable.Drawable r10 = xhss.C0915.m1498(r1, r11)
            goto L6a
        L66:
            android.graphics.drawable.Drawable r10 = r4.getDrawable(r10)
        L6a:
            r0.setDividerDrawable(r10)
            r10 = 8
            int r10 = r4.getInt(r10, r9)
            r0.f1113 = r10
            r10 = 6
            int r10 = r4.getDimensionPixelSize(r10, r9)
            r0.f1102 = r10
            r4.recycle()
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof xhss.C0295
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            int r2 = r2.f1111
            r0 = -2
            if (r2 != 0) goto Lb
            xhss.ᛳᛸᛱᛴ r2 = new xhss.ᛳᛸᛱᛴ
            r2.<init>(r0, r0)
            return r2
        Lb:
            r1 = 1
            if (r2 != r1) goto L15
            xhss.ᛳᛸᛱᛴ r2 = new xhss.ᛳᛸᛱᛴ
            r1 = -1
            r2.<init>(r1, r0)
            return r2
        L15:
            r2 = 0
            return r2
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            xhss.ᛳᛸᛱᛴ r0 = new xhss.ᛳᛸᛱᛴ
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof xhss.C0295
            if (r0 == 0) goto Lc
            xhss.ᛳᛸᛱᛴ r0 = new xhss.ᛳᛸᛱᛴ
            xhss.ᛳᛸᛱᛴ r1 = (xhss.C0295) r1
            r0.<init>(r1)
            return r0
        Lc:
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            xhss.ᛳᛸᛱᛴ r0 = new xhss.ᛳᛸᛱᛴ
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        L18:
            xhss.ᛳᛸᛱᛴ r0 = new xhss.ᛳᛸᛱᛴ
            r0.<init>(r1)
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r5 = this;
            int r0 = r5.f1100
            if (r0 >= 0) goto L9
            int r5 = super.getBaseline()
            return r5
        L9:
            int r0 = r5.getChildCount()
            int r1 = r5.f1100
            if (r0 <= r1) goto L77
            android.view.View r0 = r5.getChildAt(r1)
            int r1 = r0.getBaseline()
            r2 = -1
            if (r1 != r2) goto L29
            int r5 = r5.f1100
            if (r5 != 0) goto L21
            return r2
        L21:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline."
            r5.<init>(r0)
            throw r5
        L29:
            int r2 = r5.f1101
            int r3 = r5.f1111
            r4 = 1
            if (r3 != r4) goto L6c
            int r3 = r5.f1103
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 48
            if (r3 == r4) goto L6c
            r4 = 16
            if (r3 == r4) goto L53
            r4 = 80
            if (r3 == r4) goto L41
            goto L6c
        L41:
            int r2 = r5.getBottom()
            int r3 = r5.getTop()
            int r2 = r2 - r3
            int r3 = r5.getPaddingBottom()
            int r2 = r2 - r3
            int r5 = r5.f1112
            int r2 = r2 - r5
            goto L6c
        L53:
            int r3 = r5.getBottom()
            int r4 = r5.getTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r5 = r5.f1112
            int r3 = r3 - r5
            int r3 = r3 / 2
            int r2 = r2 + r3
        L6c:
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            xhss.ᛳᛸᛱᛴ r5 = (xhss.C0295) r5
            int r5 = r5.topMargin
            int r2 = r2 + r5
            int r2 = r2 + r1
            return r2
        L77:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."
            r5.<init>(r0)
            throw r5
    }

    public int getBaselineAlignedChildIndex() {
            r0 = this;
            int r0 = r0.f1100
            return r0
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1114
            return r0
    }

    public int getDividerPadding() {
            r0 = this;
            int r0 = r0.f1102
            return r0
    }

    public int getDividerWidth() {
            r0 = this;
            int r0 = r0.f1105
            return r0
    }

    public int getGravity() {
            r0 = this;
            int r0 = r0.f1103
            return r0
    }

    public int getOrientation() {
            r0 = this;
            int r0 = r0.f1111
            return r0
    }

    public int getShowDividers() {
            r0 = this;
            int r0 = r0.f1113
            return r0
    }

    public int getVirtualChildCount() {
            r0 = this;
            int r0 = r0.getChildCount()
            return r0
    }

    public float getWeightSum() {
            r0 = this;
            float r0 = r0.f1110
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f1114
            if (r0 != 0) goto L6
            goto Le5
        L6:
            int r0 = r7.f1111
            r1 = 8
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L67
            int r0 = r7.getVirtualChildCount()
        L12:
            if (r2 >= r0) goto L3c
            android.view.View r4 = r7.getChildAt(r2)
            if (r4 == 0) goto L39
            int r5 = r4.getVisibility()
            if (r5 == r1) goto L39
            boolean r5 = r7.m606(r2)
            if (r5 == 0) goto L39
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            xhss.ᛳᛸᛱᛴ r5 = (xhss.C0295) r5
            int r4 = r4.getTop()
            int r5 = r5.topMargin
            int r4 = r4 - r5
            int r5 = r7.f1108
            int r4 = r4 - r5
            r7.m607(r4, r8)
        L39:
            int r2 = r2 + 1
            goto L12
        L3c:
            boolean r1 = r7.m606(r0)
            if (r1 == 0) goto Le5
            int r0 = r0 - r3
            android.view.View r0 = r7.getChildAt(r0)
            if (r0 != 0) goto L56
            int r0 = r7.getHeight()
            int r1 = r7.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r7.f1108
            int r0 = r0 - r1
            goto L63
        L56:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            xhss.ᛳᛸᛱᛴ r1 = (xhss.C0295) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
        L63:
            r7.m607(r0, r8)
            return
        L67:
            int r0 = r7.getVirtualChildCount()
            int r4 = r7.getLayoutDirection()
            if (r4 != r3) goto L73
            r4 = r3
            goto L74
        L73:
            r4 = r2
        L74:
            if (r2 >= r0) goto La8
            android.view.View r5 = r7.getChildAt(r2)
            if (r5 == 0) goto La5
            int r6 = r5.getVisibility()
            if (r6 == r1) goto La5
            boolean r6 = r7.m606(r2)
            if (r6 == 0) goto La5
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            xhss.ᛳᛸᛱᛴ r6 = (xhss.C0295) r6
            if (r4 == 0) goto L98
            int r5 = r5.getRight()
            int r6 = r6.rightMargin
            int r5 = r5 + r6
            goto La2
        L98:
            int r5 = r5.getLeft()
            int r6 = r6.leftMargin
            int r5 = r5 - r6
            int r6 = r7.f1105
            int r5 = r5 - r6
        La2:
            r7.m605(r5, r8)
        La5:
            int r2 = r2 + 1
            goto L74
        La8:
            boolean r1 = r7.m606(r0)
            if (r1 == 0) goto Le5
            int r0 = r0 - r3
            android.view.View r0 = r7.getChildAt(r0)
            if (r0 != 0) goto Lc9
            if (r4 == 0) goto Lbc
            int r0 = r7.getPaddingLeft()
            goto Le2
        Lbc:
            int r0 = r7.getWidth()
            int r1 = r7.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r7.f1105
        Lc7:
            int r0 = r0 - r1
            goto Le2
        Lc9:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            xhss.ᛳᛸᛱᛴ r1 = (xhss.C0295) r1
            if (r4 == 0) goto Ldb
            int r0 = r0.getLeft()
            int r1 = r1.leftMargin
            int r0 = r0 - r1
            int r1 = r7.f1105
            goto Lc7
        Ldb:
            int r0 = r0.getRight()
            int r1 = r1.rightMargin
            int r0 = r0 + r1
        Le2:
            r7.m605(r0, r8)
        Le5:
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            super.onInitializeAccessibilityEvent(r1)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r1.setClassName(r0)
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r1.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onMeasure(int r39, int r40) {
            r38 = this;
            r0 = r38
            int r1 = r0.f1111
            r7 = -2
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 8
            r14 = 1
            if (r1 != r14) goto L34f
            r0.f1112 = r9
            int r15 = r0.getVirtualChildCount()
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r2 = android.view.View.MeasureSpec.getMode(r40)
            int r3 = r0.f1100
            boolean r4 = r0.f1107
            r5 = r9
            r6 = r5
            r8 = r6
            r19 = r8
            r22 = r19
            r23 = r22
            r20 = r14
            r24 = r20
            r16 = 0
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r18 = 0
            r14 = r23
        L35:
            if (r5 >= r15) goto L161
            r25 = r1
            android.view.View r1 = r0.getChildAt(r5)
            if (r1 != 0) goto L51
            int r1 = r0.f1112
            r0.f1112 = r1
        L43:
            r29 = r2
            r7 = r3
            r28 = r4
            r13 = r5
            r12 = r25
            r2 = r39
            r4 = r40
            goto L152
        L51:
            int r12 = r1.getVisibility()
            if (r12 != r11) goto L58
            goto L43
        L58:
            boolean r12 = r0.m606(r5)
            if (r12 == 0) goto L65
            int r12 = r0.f1112
            int r11 = r0.f1108
            int r12 = r12 + r11
            r0.f1112 = r12
        L65:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            xhss.ᛳᛸᛱᛴ r11 = (xhss.C0295) r11
            float r12 = r11.weight
            float r16 = r16 + r12
            if (r2 != r10) goto L98
            int r10 = r11.height
            if (r10 != 0) goto L98
            int r10 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r10 <= 0) goto L98
            int r10 = r0.f1112
            int r12 = r11.topMargin
            int r12 = r12 + r10
            int r13 = r11.bottomMargin
            int r12 = r12 + r13
            int r10 = java.lang.Math.max(r10, r12)
            r0.f1112 = r10
            r30 = r1
            r29 = r2
            r7 = r3
            r28 = r4
            r13 = r5
            r19 = r20
            r12 = r25
            r2 = r39
            r4 = r40
            goto Le6
        L98:
            int r10 = r11.height
            if (r10 != 0) goto La4
            int r10 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r10 <= 0) goto La4
            r11.height = r7
            r10 = 0
            goto La6
        La4:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        La6:
            int r12 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r12 != 0) goto Lb1
            int r12 = r0.f1112
            r13 = r12
            r12 = r5
            r5 = r13
        Laf:
            r13 = r3
            goto Lb4
        Lb1:
            r12 = r5
            r5 = 0
            goto Laf
        Lb4:
            r3 = 0
            r29 = r2
            r28 = r4
            r7 = r13
            r2 = r39
            r4 = r40
            r13 = r12
            r12 = r25
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto Lca
            r11.height = r10
        Lca:
            int r3 = r1.getMeasuredHeight()
            int r5 = r0.f1112
            int r10 = r5 + r3
            r30 = r1
            int r1 = r11.topMargin
            int r10 = r10 + r1
            int r1 = r11.bottomMargin
            int r10 = r10 + r1
            int r1 = java.lang.Math.max(r5, r10)
            r0.f1112 = r1
            if (r28 == 0) goto Le6
            int r14 = java.lang.Math.max(r3, r14)
        Le6:
            if (r7 < 0) goto Lf0
            int r5 = r13 + 1
            if (r7 != r5) goto Lf0
            int r1 = r0.f1112
            r0.f1101 = r1
        Lf0:
            if (r13 >= r7) goto Lf8
            float r1 = r11.weight
            int r1 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r1 > 0) goto Lfb
        Lf8:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L103
        Lfb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L103:
            if (r12 == r1) goto L10f
            int r1 = r11.width
            r3 = -1
            if (r1 != r3) goto L10f
            r1 = r20
            r23 = r1
            goto L110
        L10f:
            r1 = 0
        L110:
            int r3 = r11.leftMargin
            int r5 = r11.rightMargin
            int r3 = r3 + r5
            int r5 = r30.getMeasuredWidth()
            int r5 = r5 + r3
            int r9 = java.lang.Math.max(r9, r5)
            int r10 = r30.getMeasuredState()
            r30 = r1
            r1 = r22
            int r1 = android.view.View.combineMeasuredStates(r1, r10)
            if (r24 == 0) goto L136
            int r10 = r11.width
            r22 = r1
            r1 = -1
            if (r10 != r1) goto L138
            r1 = r20
            goto L139
        L136:
            r22 = r1
        L138:
            r1 = 0
        L139:
            float r10 = r11.weight
            int r10 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r10 <= 0) goto L148
            if (r30 == 0) goto L142
            goto L143
        L142:
            r3 = r5
        L143:
            int r8 = java.lang.Math.max(r8, r3)
            goto L150
        L148:
            if (r30 == 0) goto L14b
            goto L14c
        L14b:
            r3 = r5
        L14c:
            int r6 = java.lang.Math.max(r6, r3)
        L150:
            r24 = r1
        L152:
            int r5 = r13 + 1
            r3 = r7
            r1 = r12
            r4 = r28
            r2 = r29
            r7 = -2
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 8
            goto L35
        L161:
            r12 = r1
            r29 = r2
            r28 = r4
            r1 = r22
            r2 = r39
            r4 = r40
            int r3 = r0.f1112
            if (r3 <= 0) goto L17d
            boolean r3 = r0.m606(r15)
            if (r3 == 0) goto L17d
            int r3 = r0.f1112
            int r5 = r0.f1108
            int r3 = r3 + r5
            r0.f1112 = r3
        L17d:
            r3 = r29
            if (r28 == 0) goto L1ba
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r5) goto L187
            if (r3 != 0) goto L1ba
        L187:
            r5 = 0
            r0.f1112 = r5
            r5 = 0
        L18b:
            if (r5 >= r15) goto L1ba
            android.view.View r7 = r0.getChildAt(r5)
            if (r7 != 0) goto L198
            int r7 = r0.f1112
            r0.f1112 = r7
            goto L1b7
        L198:
            int r10 = r7.getVisibility()
            r11 = 8
            if (r10 != r11) goto L1a1
            goto L1b7
        L1a1:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            xhss.ᛳᛸᛱᛴ r7 = (xhss.C0295) r7
            int r10 = r0.f1112
            int r11 = r10 + r14
            int r13 = r7.topMargin
            int r11 = r11 + r13
            int r7 = r7.bottomMargin
            int r11 = r11 + r7
            int r7 = java.lang.Math.max(r10, r11)
            r0.f1112 = r7
        L1b7:
            int r5 = r5 + 1
            goto L18b
        L1ba:
            int r5 = r0.f1112
            int r7 = r0.getPaddingTop()
            int r10 = r0.getPaddingBottom()
            int r10 = r10 + r7
            int r10 = r10 + r5
            r0.f1112 = r10
            int r5 = r0.getSuggestedMinimumHeight()
            int r5 = java.lang.Math.max(r10, r5)
            r7 = 0
            int r5 = android.view.View.resolveSizeAndState(r5, r4, r7)
            r7 = r5 & r17
            int r10 = r0.f1112
            int r7 = r7 - r10
            if (r19 != 0) goto L21f
            if (r7 == 0) goto L1e3
            int r10 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r10 <= 0) goto L1e3
            goto L21f
        L1e3:
            int r6 = java.lang.Math.max(r6, r8)
            if (r28 == 0) goto L2f3
            r7 = 1073741824(0x40000000, float:2.0)
            if (r3 == r7) goto L2f3
            r3 = 0
        L1ee:
            if (r3 >= r15) goto L2f3
            android.view.View r7 = r0.getChildAt(r3)
            if (r7 == 0) goto L21c
            int r8 = r7.getVisibility()
            r11 = 8
            if (r8 != r11) goto L1ff
            goto L21c
        L1ff:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            xhss.ᛳᛸᛱᛴ r8 = (xhss.C0295) r8
            float r8 = r8.weight
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 <= 0) goto L21c
            int r8 = r7.getMeasuredWidth()
            r10 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r10)
            r7.measure(r8, r11)
        L21c:
            int r3 = r3 + 1
            goto L1ee
        L21f:
            float r8 = r0.f1110
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 <= 0) goto L227
            r16 = r8
        L227:
            r8 = 0
            r0.f1112 = r8
            r8 = r1
            r1 = 0
        L22c:
            if (r1 >= r15) goto L2e4
            android.view.View r10 = r0.getChildAt(r1)
            int r11 = r10.getVisibility()
            r13 = 8
            if (r11 != r13) goto L23e
            r17 = r1
            goto L2e0
        L23e:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            xhss.ᛳᛸᛱᛴ r11 = (xhss.C0295) r11
            float r13 = r11.weight
            int r14 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r14 <= 0) goto L29e
            float r14 = (float) r7
            float r14 = r14 * r13
            float r14 = r14 / r16
            int r14 = (int) r14
            float r16 = r16 - r13
            int r7 = r7 - r14
            int r13 = r0.getPaddingLeft()
            int r17 = r0.getPaddingRight()
            int r17 = r17 + r13
            int r13 = r11.leftMargin
            int r17 = r17 + r13
            int r13 = r11.rightMargin
            int r13 = r17 + r13
            r17 = r1
            int r1 = r11.width
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r2, r13, r1)
            int r13 = r11.height
            if (r13 != 0) goto L281
            r13 = 1073741824(0x40000000, float:2.0)
            if (r3 == r13) goto L275
            goto L283
        L275:
            if (r14 <= 0) goto L278
            goto L279
        L278:
            r14 = 0
        L279:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r10.measure(r1, r14)
            goto L293
        L281:
            r13 = 1073741824(0x40000000, float:2.0)
        L283:
            int r19 = r10.getMeasuredHeight()
            int r14 = r19 + r14
            if (r14 >= 0) goto L28c
            r14 = 0
        L28c:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r10.measure(r1, r14)
        L293:
            int r1 = r10.getMeasuredState()
            r1 = r1 & (-256(0xffffffffffffff00, float:NaN))
            int r8 = android.view.View.combineMeasuredStates(r8, r1)
            goto L2a0
        L29e:
            r17 = r1
        L2a0:
            int r1 = r11.leftMargin
            int r13 = r11.rightMargin
            int r1 = r1 + r13
            int r13 = r10.getMeasuredWidth()
            int r13 = r13 + r1
            int r9 = java.lang.Math.max(r9, r13)
            r14 = 1073741824(0x40000000, float:2.0)
            if (r12 == r14) goto L2bc
            int r14 = r11.width
            r19 = r1
            r1 = -1
            if (r14 != r1) goto L2bd
            r13 = r19
            goto L2bd
        L2bc:
            r1 = -1
        L2bd:
            int r6 = java.lang.Math.max(r6, r13)
            if (r24 == 0) goto L2ca
            int r13 = r11.width
            if (r13 != r1) goto L2ca
            r1 = r20
            goto L2cb
        L2ca:
            r1 = 0
        L2cb:
            int r13 = r0.f1112
            int r10 = r10.getMeasuredHeight()
            int r10 = r10 + r13
            int r14 = r11.topMargin
            int r10 = r10 + r14
            int r11 = r11.bottomMargin
            int r10 = r10 + r11
            int r10 = java.lang.Math.max(r13, r10)
            r0.f1112 = r10
            r24 = r1
        L2e0:
            int r1 = r17 + 1
            goto L22c
        L2e4:
            int r1 = r0.f1112
            int r3 = r0.getPaddingTop()
            int r7 = r0.getPaddingBottom()
            int r7 = r7 + r3
            int r7 = r7 + r1
            r0.f1112 = r7
            r1 = r8
        L2f3:
            if (r24 != 0) goto L2fa
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 == r13) goto L2fa
            goto L2fb
        L2fa:
            r6 = r9
        L2fb:
            int r3 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r7 = r7 + r3
            int r7 = r7 + r6
            int r3 = r0.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r7, r3)
            int r1 = android.view.View.resolveSizeAndState(r3, r2, r1)
            r0.setMeasuredDimension(r1, r5)
            if (r23 == 0) goto L85d
            int r1 = r0.getMeasuredWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r13)
            r9 = 0
        L321:
            if (r9 >= r15) goto L85d
            android.view.View r1 = r0.getChildAt(r9)
            int r3 = r1.getVisibility()
            r11 = 8
            if (r3 == r11) goto L34a
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r6 = r3
            xhss.ᛳᛸᛱᛴ r6 = (xhss.C0295) r6
            int r3 = r6.width
            r5 = -1
            if (r3 != r5) goto L34a
            int r7 = r6.height
            int r3 = r1.getMeasuredHeight()
            r6.height = r3
            r3 = 0
            r5 = 0
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r6.height = r7
        L34a:
            int r9 = r9 + 1
            r4 = r40
            goto L321
        L34f:
            r2 = r39
            r5 = r9
            r20 = r14
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r18 = 0
            r0.f1112 = r5
            int r6 = r0.getVirtualChildCount()
            int r7 = android.view.View.MeasureSpec.getMode(r2)
            int r8 = android.view.View.MeasureSpec.getMode(r40)
            int[] r1 = r0.f1106
            r9 = 4
            if (r1 == 0) goto L374
            int[] r3 = r0.f1109
            if (r3 != 0) goto L371
            goto L374
        L371:
            r10 = r1
            r11 = r3
            goto L37d
        L374:
            int[] r1 = new int[r9]
            r0.f1106 = r1
            int[] r3 = new int[r9]
            r0.f1109 = r3
            goto L371
        L37d:
            r12 = 3
            r26 = -1
            r10[r12] = r26
            r13 = 2
            r10[r13] = r26
            r10[r20] = r26
            r21 = 0
            r10[r21] = r26
            r11[r12] = r26
            r11[r13] = r26
            r11[r20] = r26
            r11[r21] = r26
            boolean r14 = r0.f1104
            boolean r15 = r0.f1107
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L39e
            r16 = r20
            goto L3a0
        L39e:
            r16 = 0
        L3a0:
            r23 = r9
            r24 = r12
            r28 = r18
            r29 = r20
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r9 = 0
            r12 = 0
            r19 = 0
            r22 = 0
        L3b2:
            if (r1 >= r6) goto L563
            r30 = r13
            android.view.View r13 = r0.getChildAt(r1)
            if (r13 != 0) goto L3cf
            int r13 = r0.f1112
            r0.f1112 = r13
            r33 = r1
            r1 = r4
            r31 = r10
            r32 = r11
            r34 = r14
            r35 = r15
            r4 = r40
            goto L553
        L3cf:
            int r2 = r13.getVisibility()
            r31 = r3
            r3 = 8
            if (r2 != r3) goto L3ec
            r2 = r39
            r33 = r1
            r1 = r4
            r32 = r11
            r34 = r14
            r35 = r15
            r3 = r31
            r4 = r40
            r31 = r10
            goto L553
        L3ec:
            boolean r2 = r0.m606(r1)
            if (r2 == 0) goto L3f9
            int r2 = r0.f1112
            int r3 = r0.f1105
            int r2 = r2 + r3
            r0.f1112 = r2
        L3f9:
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            xhss.ᛳᛸᛱᛴ r2 = (xhss.C0295) r2
            float r3 = r2.weight
            float r28 = r28 + r3
            r32 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L46d
            int r1 = r2.width
            if (r1 != 0) goto L46d
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 <= 0) goto L46d
            int r1 = r0.f1112
            int r3 = r2.leftMargin
            if (r16 == 0) goto L421
            r33 = r3
            int r3 = r2.rightMargin
            int r3 = r33 + r3
            int r3 = r3 + r1
            r0.f1112 = r3
            goto L431
        L421:
            r33 = r3
            int r3 = r1 + r33
            r33 = r3
            int r3 = r2.rightMargin
            int r3 = r33 + r3
            int r1 = java.lang.Math.max(r1, r3)
            r0.f1112 = r1
        L431:
            if (r14 == 0) goto L452
            r1 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            r13.measure(r3, r3)
            r36 = r13
            r34 = r14
            r35 = r15
            r13 = r31
            r33 = r32
            r14 = r2
            r31 = r10
            r32 = r11
            r2 = r39
            r10 = r4
            r11 = r5
            r4 = r40
            goto L4d1
        L452:
            r36 = r13
            r34 = r14
            r35 = r15
            r22 = r20
            r13 = r31
            r33 = r32
            r1 = 1073741824(0x40000000, float:2.0)
            r14 = r2
            r31 = r10
            r32 = r11
            r2 = r39
            r10 = r4
            r11 = r5
            r4 = r40
            goto L4d3
        L46d:
            int r1 = r2.width
            if (r1 != 0) goto L47a
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 <= 0) goto L47a
            r1 = -2
            r2.width = r1
            r1 = 0
            goto L47c
        L47a:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L47c:
            int r3 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r3 != 0) goto L485
            int r3 = r0.f1112
        L482:
            r33 = r5
            goto L487
        L485:
            r3 = 0
            goto L482
        L487:
            r5 = 0
            r34 = r32
            r32 = r11
            r11 = r33
            r33 = r34
            r34 = r14
            r35 = r15
            r15 = r1
            r14 = r2
            r1 = r13
            r13 = r31
            r2 = r39
            r31 = r10
            r10 = r4
            r4 = r40
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == r3) goto L4a9
            r14.width = r15
        L4a9:
            int r3 = r1.getMeasuredWidth()
            int r5 = r0.f1112
            int r15 = r14.leftMargin
            if (r16 == 0) goto L4bd
            int r15 = r15 + r3
            r36 = r1
            int r1 = r14.rightMargin
            int r15 = r15 + r1
            int r15 = r15 + r5
            r0.f1112 = r15
            goto L4cb
        L4bd:
            r36 = r1
            int r1 = r5 + r3
            int r1 = r1 + r15
            int r15 = r14.rightMargin
            int r1 = r1 + r15
            int r1 = java.lang.Math.max(r5, r1)
            r0.f1112 = r1
        L4cb:
            if (r35 == 0) goto L4d1
            int r9 = java.lang.Math.max(r3, r9)
        L4d1:
            r1 = 1073741824(0x40000000, float:2.0)
        L4d3:
            if (r8 == r1) goto L4df
            int r1 = r14.height
            r3 = -1
            if (r1 != r3) goto L4df
            r1 = r20
            r19 = r1
            goto L4e0
        L4df:
            r1 = 0
        L4e0:
            int r3 = r14.topMargin
            int r5 = r14.bottomMargin
            int r3 = r3 + r5
            int r5 = r36.getMeasuredHeight()
            int r5 = r5 + r3
            int r15 = r36.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r15)
            if (r34 == 0) goto L522
            int r15 = r36.getBaseline()
            r36 = r1
            r1 = -1
            if (r15 == r1) goto L524
            int r1 = r14.gravity
            if (r1 >= 0) goto L503
            int r1 = r0.f1103
        L503:
            r1 = r1 & 112(0x70, float:1.57E-43)
            int r1 = r1 >> 4
            r25 = -2
            r1 = r1 & (-2)
            int r1 = r1 >> 1
            r37 = r1
            r1 = r31[r37]
            int r1 = java.lang.Math.max(r1, r15)
            r31[r37] = r1
            r1 = r32[r37]
            int r15 = r5 - r15
            int r1 = java.lang.Math.max(r1, r15)
            r32[r37] = r1
            goto L524
        L522:
            r36 = r1
        L524:
            int r1 = java.lang.Math.max(r13, r5)
            if (r29 == 0) goto L532
            int r13 = r14.height
            r15 = -1
            if (r13 != r15) goto L532
            r13 = r20
            goto L533
        L532:
            r13 = 0
        L533:
            float r14 = r14.weight
            int r14 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r14 <= 0) goto L543
            if (r36 == 0) goto L53c
            goto L53d
        L53c:
            r3 = r5
        L53d:
            int r5 = java.lang.Math.max(r11, r3)
            r3 = r10
            goto L54c
        L543:
            if (r36 == 0) goto L546
            goto L547
        L546:
            r3 = r5
        L547:
            int r3 = java.lang.Math.max(r10, r3)
            r5 = r11
        L54c:
            r29 = r3
            r3 = r1
            r1 = r29
            r29 = r13
        L553:
            int r10 = r33 + 1
            r4 = r1
            r1 = r10
            r13 = r30
            r10 = r31
            r11 = r32
            r14 = r34
            r15 = r35
            goto L3b2
        L563:
            r31 = r10
            r32 = r11
            r30 = r13
            r34 = r14
            r35 = r15
            r13 = r3
            r10 = r4
            r11 = r5
            r4 = r40
            int r1 = r0.f1112
            if (r1 <= 0) goto L583
            boolean r1 = r0.m606(r6)
            if (r1 == 0) goto L583
            int r1 = r0.f1112
            int r3 = r0.f1105
            int r1 = r1 + r3
            r0.f1112 = r1
        L583:
            r1 = r31[r20]
            r3 = -1
            if (r1 != r3) goto L599
            r21 = 0
            r5 = r31[r21]
            if (r5 != r3) goto L599
            r5 = r31[r30]
            if (r5 != r3) goto L599
            r5 = r31[r24]
            if (r5 == r3) goto L597
            goto L599
        L597:
            r3 = r13
            goto L5c6
        L599:
            r3 = r31[r24]
            r21 = 0
            r5 = r31[r21]
            r14 = r31[r30]
            int r1 = java.lang.Math.max(r1, r14)
            int r1 = java.lang.Math.max(r5, r1)
            int r1 = java.lang.Math.max(r3, r1)
            r3 = r32[r24]
            r5 = r32[r21]
            r14 = r32[r20]
            r15 = r32[r30]
            int r14 = java.lang.Math.max(r14, r15)
            int r5 = java.lang.Math.max(r5, r14)
            int r3 = java.lang.Math.max(r3, r5)
            int r3 = r3 + r1
            int r3 = java.lang.Math.max(r13, r3)
        L5c6:
            if (r35 == 0) goto L60d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r5) goto L5ce
            if (r7 != 0) goto L60d
        L5ce:
            r5 = 0
            r0.f1112 = r5
            r1 = 0
        L5d2:
            if (r1 >= r6) goto L60d
            android.view.View r5 = r0.getChildAt(r1)
            if (r5 != 0) goto L5df
            int r5 = r0.f1112
            r0.f1112 = r5
            goto L60a
        L5df:
            int r13 = r5.getVisibility()
            r14 = 8
            if (r13 != r14) goto L5e8
            goto L60a
        L5e8:
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            xhss.ᛳᛸᛱᛴ r5 = (xhss.C0295) r5
            int r13 = r0.f1112
            if (r16 == 0) goto L5fc
            int r14 = r5.leftMargin
            int r14 = r14 + r9
            int r5 = r5.rightMargin
            int r14 = r14 + r5
            int r14 = r14 + r13
            r0.f1112 = r14
            goto L60a
        L5fc:
            int r14 = r13 + r9
            int r15 = r5.leftMargin
            int r14 = r14 + r15
            int r5 = r5.rightMargin
            int r14 = r14 + r5
            int r5 = java.lang.Math.max(r13, r14)
            r0.f1112 = r5
        L60a:
            int r1 = r1 + 1
            goto L5d2
        L60d:
            int r1 = r0.f1112
            int r5 = r0.getPaddingLeft()
            int r13 = r0.getPaddingRight()
            int r13 = r13 + r5
            int r13 = r13 + r1
            r0.f1112 = r13
            int r1 = r0.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r13, r1)
            r5 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r2, r5)
            r5 = r1 & r17
            int r13 = r0.f1112
            int r5 = r5 - r13
            if (r22 != 0) goto L67a
            if (r5 == 0) goto L636
            int r14 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r14 <= 0) goto L636
            goto L67a
        L636:
            int r5 = java.lang.Math.max(r10, r11)
            if (r35 == 0) goto L672
            r14 = 1073741824(0x40000000, float:2.0)
            if (r7 == r14) goto L672
            r7 = 0
        L641:
            if (r7 >= r6) goto L672
            android.view.View r10 = r0.getChildAt(r7)
            if (r10 == 0) goto L66f
            int r11 = r10.getVisibility()
            r14 = 8
            if (r11 != r14) goto L652
            goto L66f
        L652:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            xhss.ᛳᛸᛱᛴ r11 = (xhss.C0295) r11
            float r11 = r11.weight
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 <= 0) goto L66f
            r14 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r14)
            int r15 = r10.getMeasuredHeight()
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            r10.measure(r11, r15)
        L66f:
            int r7 = r7 + 1
            goto L641
        L672:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r21 = 0
            goto L7f7
        L67a:
            float r3 = r0.f1110
            int r9 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r9 <= 0) goto L682
            r28 = r3
        L682:
            r26 = -1
            r31[r24] = r26
            r31[r30] = r26
            r31[r20] = r26
            r3 = 0
            r31[r3] = r26
            r32[r24] = r26
            r32[r30] = r26
            r32[r20] = r26
            r32[r3] = r26
            r0.f1112 = r3
            r3 = -1
            r9 = 0
        L699:
            if (r9 >= r6) goto L79f
            android.view.View r11 = r0.getChildAt(r9)
            if (r11 == 0) goto L6a9
            int r14 = r11.getVisibility()
            r15 = 8
            if (r14 != r15) goto L6b1
        L6a9:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r25 = -2
            goto L799
        L6b1:
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            xhss.ᛳᛸᛱᛴ r14 = (xhss.C0295) r14
            float r15 = r14.weight
            int r17 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r17 <= 0) goto L713
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            float r13 = (float) r5
            float r13 = r13 * r15
            float r13 = r13 / r28
            int r13 = (int) r13
            float r28 = r28 - r15
            int r5 = r5 - r13
            int r15 = r0.getPaddingTop()
            int r22 = r0.getPaddingBottom()
            int r22 = r22 + r15
            int r15 = r14.topMargin
            int r22 = r22 + r15
            int r15 = r14.bottomMargin
            int r15 = r22 + r15
            r22 = r1
            int r1 = r14.height
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r4, r15, r1)
            int r15 = r14.width
            if (r15 != 0) goto L6f6
            r15 = 1073741824(0x40000000, float:2.0)
            if (r7 == r15) goto L6ea
            goto L6f8
        L6ea:
            if (r13 <= 0) goto L6ed
            goto L6ee
        L6ed:
            r13 = 0
        L6ee:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r11.measure(r13, r1)
            goto L708
        L6f6:
            r15 = 1073741824(0x40000000, float:2.0)
        L6f8:
            int r27 = r11.getMeasuredWidth()
            int r13 = r27 + r13
            if (r13 >= 0) goto L701
            r13 = 0
        L701:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r11.measure(r13, r1)
        L708:
            int r1 = r11.getMeasuredState()
            r1 = r1 & r17
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            goto L717
        L713:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L717:
            int r1 = r0.f1112
            if (r16 == 0) goto L72b
            int r13 = r11.getMeasuredWidth()
            int r15 = r14.leftMargin
            int r13 = r13 + r15
            int r15 = r14.rightMargin
            int r13 = r13 + r15
            int r13 = r13 + r1
            r0.f1112 = r13
        L728:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L73d
        L72b:
            int r13 = r11.getMeasuredWidth()
            int r13 = r13 + r1
            int r15 = r14.leftMargin
            int r13 = r13 + r15
            int r15 = r14.rightMargin
            int r13 = r13 + r15
            int r1 = java.lang.Math.max(r1, r13)
            r0.f1112 = r1
            goto L728
        L73d:
            if (r8 == r1) goto L747
            int r1 = r14.height
            r15 = -1
            if (r1 != r15) goto L747
            r1 = r20
            goto L748
        L747:
            r1 = 0
        L748:
            int r13 = r14.topMargin
            int r15 = r14.bottomMargin
            int r13 = r13 + r15
            int r15 = r11.getMeasuredHeight()
            int r15 = r15 + r13
            int r3 = java.lang.Math.max(r3, r15)
            if (r1 == 0) goto L759
            goto L75a
        L759:
            r13 = r15
        L75a:
            int r1 = java.lang.Math.max(r10, r13)
            if (r29 == 0) goto L768
            int r10 = r14.height
            r13 = -1
            if (r10 != r13) goto L769
            r10 = r20
            goto L76a
        L768:
            r13 = -1
        L769:
            r10 = 0
        L76a:
            if (r34 == 0) goto L794
            int r11 = r11.getBaseline()
            if (r11 == r13) goto L794
            int r13 = r14.gravity
            if (r13 >= 0) goto L778
            int r13 = r0.f1103
        L778:
            r13 = r13 & 112(0x70, float:1.57E-43)
            int r13 = r13 >> 4
            r25 = -2
            r13 = r13 & (-2)
            int r13 = r13 >> 1
            r14 = r31[r13]
            int r14 = java.lang.Math.max(r14, r11)
            r31[r13] = r14
            r14 = r32[r13]
            int r15 = r15 - r11
            int r11 = java.lang.Math.max(r14, r15)
            r32[r13] = r11
            goto L796
        L794:
            r25 = -2
        L796:
            r29 = r10
            r10 = r1
        L799:
            int r9 = r9 + 1
            r1 = r22
            goto L699
        L79f:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r1 = r0.f1112
            int r5 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r7 = r7 + r5
            int r7 = r7 + r1
            r0.f1112 = r7
            r1 = r31[r20]
            r15 = -1
            if (r1 != r15) goto L7c8
            r21 = 0
            r5 = r31[r21]
            if (r5 != r15) goto L7c8
            r5 = r31[r30]
            if (r5 != r15) goto L7c8
            r5 = r31[r24]
            if (r5 == r15) goto L7c5
            goto L7c8
        L7c5:
            r21 = 0
            goto L7f6
        L7c8:
            r5 = r31[r24]
            r21 = 0
            r7 = r31[r21]
            r9 = r31[r30]
            int r1 = java.lang.Math.max(r1, r9)
            int r1 = java.lang.Math.max(r7, r1)
            int r1 = java.lang.Math.max(r5, r1)
            r5 = r32[r24]
            r7 = r32[r21]
            r9 = r32[r20]
            r11 = r32[r30]
            int r9 = java.lang.Math.max(r9, r11)
            int r7 = java.lang.Math.max(r7, r9)
            int r5 = java.lang.Math.max(r5, r7)
            int r5 = r5 + r1
            int r1 = java.lang.Math.max(r3, r5)
            r3 = r1
        L7f6:
            r5 = r10
        L7f7:
            if (r29 != 0) goto L7fe
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == r1) goto L7fe
            r3 = r5
        L7fe:
            int r1 = r0.getPaddingTop()
            int r5 = r0.getPaddingBottom()
            int r5 = r5 + r1
            int r5 = r5 + r3
            int r1 = r0.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r5, r1)
            r3 = r12 & r17
            r3 = r22 | r3
            int r5 = r12 << 16
            int r1 = android.view.View.resolveSizeAndState(r1, r4, r5)
            r0.setMeasuredDimension(r3, r1)
            if (r19 == 0) goto L85d
            int r1 = r0.getMeasuredHeight()
            r13 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r13)
            r9 = r21
        L82b:
            if (r9 >= r6) goto L85d
            android.view.View r1 = r0.getChildAt(r9)
            int r3 = r1.getVisibility()
            r11 = 8
            if (r3 == r11) goto L855
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r7 = r3
            xhss.ᛳᛸᛱᛴ r7 = (xhss.C0295) r7
            int r3 = r7.height
            r15 = -1
            if (r3 != r15) goto L856
            int r8 = r7.width
            int r3 = r1.getMeasuredWidth()
            r7.width = r3
            r3 = 0
            r5 = 0
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r7.width = r8
            goto L856
        L855:
            r15 = -1
        L856:
            int r9 = r9 + 1
            r0 = r38
            r2 = r39
            goto L82b
        L85d:
            return
    }

    public void setBaselineAligned(boolean r1) {
            r0 = this;
            r0.f1104 = r1
            return
    }

    public void setBaselineAlignedChildIndex(int r3) {
            r2 = this;
            if (r3 < 0) goto Lb
            int r0 = r2.getChildCount()
            if (r3 >= r0) goto Lb
            r2.f1100 = r3
            return
        Lb:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            int r2 = r2.getChildCount()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "base aligned child index out of range (0, "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1114
            if (r3 != r0) goto L5
            return
        L5:
            r2.f1114 = r3
            r0 = 0
            if (r3 == 0) goto L17
            int r1 = r3.getIntrinsicWidth()
            r2.f1105 = r1
            int r1 = r3.getIntrinsicHeight()
            r2.f1108 = r1
            goto L1b
        L17:
            r2.f1105 = r0
            r2.f1108 = r0
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
            r0.f1102 = r1
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.f1103
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
            r1.f1103 = r2
            r1.requestLayout()
        L19:
            return
    }

    public void setHorizontalGravity(int r3) {
            r2 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            int r1 = r2.f1103
            r0 = r0 & r1
            if (r0 == r3) goto L13
            r0 = -8388616(0xffffffffff7ffff8, float:-3.402822E38)
            r0 = r0 & r1
            r3 = r3 | r0
            r2.f1103 = r3
            r2.requestLayout()
        L13:
            return
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
            r0 = this;
            r0.f1107 = r1
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            int r0 = r1.f1111
            if (r0 == r2) goto L9
            r1.f1111 = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setShowDividers(int r2) {
            r1 = this;
            int r0 = r1.f1113
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.f1113 = r2
            return
    }

    public void setVerticalGravity(int r3) {
            r2 = this;
            r3 = r3 & 112(0x70, float:1.57E-43)
            int r0 = r2.f1103
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 == r3) goto L10
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r3 = r3 | r0
            r2.f1103 = r3
            r2.requestLayout()
        L10:
            return
    }

    public void setWeightSum(float r2) {
            r1 = this;
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            r1.f1110 = r2
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m605(int r6, android.graphics.Canvas r7) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f1114
            int r1 = r5.getPaddingTop()
            int r2 = r5.f1102
            int r1 = r1 + r2
            int r2 = r5.f1105
            int r2 = r2 + r6
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.f1102
            int r3 = r3 - r4
            r0.setBounds(r6, r1, r2, r3)
            android.graphics.drawable.Drawable r5 = r5.f1114
            r5.draw(r7)
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final boolean m606(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto Lb
            int r4 = r4.f1113
            r4 = r4 & r1
            if (r4 == 0) goto La
            return r1
        La:
            return r0
        Lb:
            int r2 = r4.getChildCount()
            int r3 = r4.f1113
            if (r5 != r2) goto L19
            r4 = r3 & 4
            if (r4 == 0) goto L18
            return r1
        L18:
            return r0
        L19:
            r2 = r3 & 2
            if (r2 == 0) goto L30
            int r5 = r5 - r1
        L1e:
            if (r5 < 0) goto L30
            android.view.View r2 = r4.getChildAt(r5)
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L2d
            return r1
        L2d:
            int r5 = r5 + (-1)
            goto L1e
        L30:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m607(int r5, android.graphics.Canvas r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f1114
            int r1 = r4.getPaddingLeft()
            int r2 = r4.f1102
            int r1 = r1 + r2
            int r2 = r4.getWidth()
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r4.f1102
            int r2 = r2 - r3
            int r3 = r4.f1108
            int r3 = r3 + r5
            r0.setBounds(r1, r5, r2, r3)
            android.graphics.drawable.Drawable r4 = r4.f1114
            r4.draw(r6)
            return
    }
}
