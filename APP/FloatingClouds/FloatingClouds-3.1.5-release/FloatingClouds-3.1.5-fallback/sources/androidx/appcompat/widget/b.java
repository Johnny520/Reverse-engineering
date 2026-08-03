package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class b extends android.view.ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f855a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public boolean h;
    public int[] i;
    public int[] j;
    public android.graphics.drawable.Drawable k;
    public int l;
    public int m;
    public int n;
    public int o;

    public static class a extends android.widget.LinearLayout.LayoutParams {
    }

    public b(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public b(android.content.Context r10, android.util.AttributeSet r11, int r12) {
            r9 = this;
            r5 = 0
            r9.<init>(r10, r11, r5)
            r12 = 1
            r9.f855a = r12
            r6 = -1
            r9.b = r6
            r7 = 0
            r9.c = r7
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r9.e = r0
            int[] r0 = androidx.appcompat.R.styleable.LinearLayoutCompat
            a.of r8 = a.C0306of.e(r10, r11, r0, r5)
            int[] r2 = androidx.appcompat.R.styleable.LinearLayoutCompat
            android.content.res.TypedArray r4 = r8.b
            r0 = r9
            r1 = r10
            r3 = r11
            a.C0414ug.i(r0, r1, r2, r3, r4, r5)
            int r10 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_orientation
            android.content.res.TypedArray r11 = r8.b
            int r10 = r11.getInt(r10, r6)
            if (r10 < 0) goto L2f
            r9.setOrientation(r10)
        L2f:
            int r10 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_gravity
            int r10 = r11.getInt(r10, r6)
            if (r10 < 0) goto L3a
            r9.setGravity(r10)
        L3a:
            int r10 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAligned
            boolean r10 = r11.getBoolean(r10, r12)
            if (r10 != 0) goto L45
            r9.setBaselineAligned(r10)
        L45:
            int r10 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_weightSum
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r10 = r11.getFloat(r10, r12)
            r0.g = r10
            int r10 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex
            int r10 = r11.getInt(r10, r6)
            r0.b = r10
            int r10 = androidx.appcompat.R.styleable.LinearLayoutCompat_measureWithLargestChild
            boolean r10 = r11.getBoolean(r10, r7)
            r0.h = r10
            int r10 = androidx.appcompat.R.styleable.LinearLayoutCompat_divider
            android.graphics.drawable.Drawable r10 = r8.b(r10)
            r9.setDividerDrawable(r10)
            int r10 = androidx.appcompat.R.styleable.LinearLayoutCompat_showDividers
            int r10 = r11.getInt(r10, r7)
            r0.n = r10
            int r10 = androidx.appcompat.R.styleable.LinearLayoutCompat_dividerPadding
            int r10 = r11.getDimensionPixelSize(r10, r7)
            r0.o = r10
            r8.f()
            return
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.b.a
            return r1
    }

    public final void f(android.graphics.Canvas r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.k
            int r1 = r4.getPaddingLeft()
            int r2 = r4.o
            int r1 = r1 + r2
            int r2 = r4.getWidth()
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r4.o
            int r2 = r2 - r3
            int r3 = r4.m
            int r3 = r3 + r6
            r0.setBounds(r1, r6, r2, r3)
            android.graphics.drawable.Drawable r6 = r4.k
            r6.draw(r5)
            return
    }

    public final void g(android.graphics.Canvas r6, int r7) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.k
            int r1 = r5.getPaddingTop()
            int r2 = r5.o
            int r1 = r1 + r2
            int r2 = r5.l
            int r2 = r2 + r7
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.o
            int r3 = r3 - r4
            r0.setBounds(r7, r1, r2, r3)
            android.graphics.drawable.Drawable r7 = r5.k
            r7.draw(r6)
            return
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.b$a r0 = r1.h()
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.b$a r1 = r0.i(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.b$a r1 = r0.j(r1)
            return r1
    }

    @Override // android.view.View
    public int getBaseline() {
            r5 = this;
            int r0 = r5.b
            if (r0 >= 0) goto L9
            int r0 = super.getBaseline()
            return r0
        L9:
            int r0 = r5.getChildCount()
            int r1 = r5.b
            if (r0 <= r1) goto L77
            android.view.View r0 = r5.getChildAt(r1)
            int r1 = r0.getBaseline()
            r2 = -1
            if (r1 != r2) goto L29
            int r0 = r5.b
            if (r0 != 0) goto L21
            return r2
        L21:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline."
            r0.<init>(r1)
            throw r0
        L29:
            int r2 = r5.c
            int r3 = r5.d
            r4 = 1
            if (r3 != r4) goto L6c
            int r3 = r5.e
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
            int r3 = r5.f
            int r2 = r2 - r3
            goto L6c
        L53:
            int r3 = r5.getBottom()
            int r4 = r5.getTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.f
            int r3 = r3 - r4
            int r3 = r3 / 2
            int r2 = r2 + r3
        L6c:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.b$a r0 = (androidx.appcompat.widget.b.a) r0
            int r0 = r0.topMargin
            int r2 = r2 + r0
            int r2 = r2 + r1
            return r2
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."
            r0.<init>(r1)
            throw r0
    }

    public int getBaselineAlignedChildIndex() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.k
            return r0
    }

    public int getDividerPadding() {
            r1 = this;
            int r0 = r1.o
            return r0
    }

    public int getDividerWidth() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    public int getGravity() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public int getShowDividers() {
            r1 = this;
            int r0 = r1.n
            return r0
    }

    public int getVirtualChildCount() {
            r1 = this;
            int r0 = r1.getChildCount()
            return r0
    }

    public float getWeightSum() {
            r1 = this;
            float r0 = r1.g
            return r0
    }

    public androidx.appcompat.widget.b.a h() {
            r3 = this;
            int r0 = r3.d
            r1 = -2
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.b$a r0 = new androidx.appcompat.widget.b$a
            r0.<init>(r1, r1)
            return r0
        Lb:
            r2 = 1
            if (r0 != r2) goto L15
            androidx.appcompat.widget.b$a r0 = new androidx.appcompat.widget.b$a
            r2 = -1
            r0.<init>(r2, r1)
            return r0
        L15:
            r0 = 0
            return r0
    }

    public androidx.appcompat.widget.b.a i(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.b$a r0 = new androidx.appcompat.widget.b$a
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public androidx.appcompat.widget.b.a j(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.b.a
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.b$a r0 = new androidx.appcompat.widget.b$a
            androidx.appcompat.widget.b$a r2 = (androidx.appcompat.widget.b.a) r2
            r0.<init>(r2)
            return r0
        Lc:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            androidx.appcompat.widget.b$a r0 = new androidx.appcompat.widget.b$a
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L18:
            androidx.appcompat.widget.b$a r0 = new androidx.appcompat.widget.b$a
            r0.<init>(r2)
            return r0
    }

    public final boolean k(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto Lb
            int r5 = r4.n
            r5 = r5 & r1
            if (r5 == 0) goto La
            return r1
        La:
            return r0
        Lb:
            int r2 = r4.getChildCount()
            if (r5 != r2) goto L19
            int r5 = r4.n
            r5 = r5 & 4
            if (r5 == 0) goto L18
            return r1
        L18:
            return r0
        L19:
            int r2 = r4.n
            r2 = r2 & 2
            if (r2 == 0) goto L32
            int r5 = r5 - r1
        L20:
            if (r5 < 0) goto L32
            android.view.View r2 = r4.getChildAt(r5)
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L2f
            return r1
        L2f:
            int r5 = r5 + (-1)
            goto L20
        L32:
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.k
            if (r0 != 0) goto L6
            goto Le5
        L6:
            int r0 = r7.d
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
            boolean r5 = r7.k(r2)
            if (r5 == 0) goto L39
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.b$a r5 = (androidx.appcompat.widget.b.a) r5
            int r4 = r4.getTop()
            int r5 = r5.topMargin
            int r4 = r4 - r5
            int r5 = r7.m
            int r4 = r4 - r5
            r7.f(r8, r4)
        L39:
            int r2 = r2 + 1
            goto L12
        L3c:
            boolean r1 = r7.k(r0)
            if (r1 == 0) goto Le5
            int r0 = r0 - r3
            android.view.View r0 = r7.getChildAt(r0)
            if (r0 != 0) goto L56
            int r0 = r7.getHeight()
            int r1 = r7.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r7.m
            int r0 = r0 - r1
            goto L63
        L56:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.b$a r1 = (androidx.appcompat.widget.b.a) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
        L63:
            r7.f(r8, r0)
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
            boolean r6 = r7.k(r2)
            if (r6 == 0) goto La5
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.appcompat.widget.b$a r6 = (androidx.appcompat.widget.b.a) r6
            if (r4 == 0) goto L98
            int r5 = r5.getRight()
            int r6 = r6.rightMargin
            int r5 = r5 + r6
            goto La2
        L98:
            int r5 = r5.getLeft()
            int r6 = r6.leftMargin
            int r5 = r5 - r6
            int r6 = r7.l
            int r5 = r5 - r6
        La2:
            r7.g(r8, r5)
        La5:
            int r2 = r2 + 1
            goto L74
        La8:
            boolean r1 = r7.k(r0)
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
            int r1 = r7.l
        Lc7:
            int r0 = r0 - r1
            goto Le2
        Lc9:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.b$a r1 = (androidx.appcompat.widget.b.a) r1
            if (r4 == 0) goto Ldb
            int r0 = r0.getLeft()
            int r1 = r1.leftMargin
            int r0 = r0 - r1
            int r1 = r7.l
            goto Lc7
        Ldb:
            int r0 = r0.getRight()
            int r1 = r1.rightMargin
            int r0 = r0 + r1
        Le2:
            r7.g(r8, r0)
        Le5:
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
            r22 = this;
            r0 = r22
            int r1 = r0.d
            r2 = 5
            r3 = 8
            r5 = 80
            r6 = 2
            r7 = 16
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r9 = 1
            if (r1 != r9) goto Lb5
            int r1 = r0.getPaddingLeft()
            int r10 = r26 - r24
            int r11 = r0.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r0.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r0.getVirtualChildCount()
            int r13 = r0.e
            r14 = r13 & 112(0x70, float:1.57E-43)
            r8 = r8 & r13
            if (r14 == r7) goto L42
            if (r14 == r5) goto L36
            int r5 = r0.getPaddingTop()
            goto L4d
        L36:
            int r5 = r0.getPaddingTop()
            int r5 = r5 + r27
            int r5 = r5 - r25
            int r7 = r0.f
            int r5 = r5 - r7
            goto L4d
        L42:
            int r5 = r0.getPaddingTop()
            int r7 = r27 - r25
            int r13 = r0.f
            int r7 = r7 - r13
            int r7 = r7 / r6
            int r5 = r5 + r7
        L4d:
            r4 = 0
        L4e:
            if (r4 >= r12) goto L1ca
            android.view.View r7 = r0.getChildAt(r4)
            if (r7 != 0) goto L59
        L56:
            r23 = r6
            goto Lae
        L59:
            int r13 = r7.getVisibility()
            if (r13 == r3) goto L56
            int r13 = r7.getMeasuredWidth()
            int r14 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r7.getLayoutParams()
            androidx.appcompat.widget.b$a r15 = (androidx.appcompat.widget.b.a) r15
            r23 = r6
            int r6 = r15.gravity
            if (r6 >= 0) goto L74
            r6 = r8
        L74:
            int r3 = r0.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r6, r3)
            r3 = r3 & 7
            if (r3 == r9) goto L8c
            if (r3 == r2) goto L86
            int r3 = r15.leftMargin
            int r3 = r3 + r1
            goto L97
        L86:
            int r3 = r11 - r13
            int r6 = r15.rightMargin
        L8a:
            int r3 = r3 - r6
            goto L97
        L8c:
            int r3 = r10 - r13
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r6 = r15.leftMargin
            int r3 = r3 + r6
            int r6 = r15.rightMargin
            goto L8a
        L97:
            boolean r6 = r0.k(r4)
            if (r6 == 0) goto La0
            int r6 = r0.m
            int r5 = r5 + r6
        La0:
            int r6 = r15.topMargin
            int r5 = r5 + r6
            int r13 = r13 + r3
            int r6 = r5 + r14
            r7.layout(r3, r5, r13, r6)
            int r3 = r15.bottomMargin
            int r14 = r14 + r3
            int r14 = r14 + r5
            r5 = r14
        Lae:
            int r4 = r4 + 1
            r6 = r23
            r3 = 8
            goto L4e
        Lb5:
            r23 = r6
            int r1 = r0.getLayoutDirection()
            if (r1 != r9) goto Lbf
            r1 = r9
            goto Lc0
        Lbf:
            r1 = 0
        Lc0:
            int r3 = r0.getPaddingTop()
            int r6 = r27 - r25
            int r10 = r0.getPaddingBottom()
            int r10 = r6 - r10
            int r6 = r6 - r3
            int r11 = r0.getPaddingBottom()
            int r6 = r6 - r11
            int r11 = r0.getVirtualChildCount()
            int r12 = r0.e
            r8 = r8 & r12
            r12 = r12 & 112(0x70, float:1.57E-43)
            boolean r13 = r0.f855a
            int[] r14 = r0.i
            int[] r15 = r0.j
            int r4 = r0.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r8, r4)
            if (r4 == r9) goto Lfe
            if (r4 == r2) goto Lf2
            int r2 = r0.getPaddingLeft()
            goto L10a
        Lf2:
            int r2 = r0.getPaddingLeft()
            int r2 = r2 + r26
            int r2 = r2 - r24
            int r4 = r0.f
            int r2 = r2 - r4
            goto L10a
        Lfe:
            int r2 = r0.getPaddingLeft()
            int r4 = r26 - r24
            int r8 = r0.f
            int r4 = r4 - r8
            int r4 = r4 / 2
            int r2 = r2 + r4
        L10a:
            if (r1 == 0) goto L110
            int r1 = r11 + (-1)
            r8 = -1
            goto L112
        L110:
            r8 = r9
            r1 = 0
        L112:
            r17 = r9
            r9 = 0
        L115:
            if (r9 >= r11) goto L1ca
            int r18 = r8 * r9
            int r5 = r18 + r1
            android.view.View r7 = r0.getChildAt(r5)
            if (r7 != 0) goto L127
            r25 = r1
        L123:
            r19 = r3
            goto L1be
        L127:
            int r4 = r7.getVisibility()
            r25 = r1
            r1 = 8
            if (r4 == r1) goto L1ba
            int r4 = r7.getMeasuredWidth()
            int r16 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r19 = r7.getLayoutParams()
            r1 = r19
            androidx.appcompat.widget.b$a r1 = (androidx.appcompat.widget.b.a) r1
            r27 = r2
            if (r13 == 0) goto L151
            int r2 = r1.height
            r19 = r3
            r3 = -1
            if (r2 == r3) goto L153
            int r3 = r7.getBaseline()
            goto L154
        L151:
            r19 = r3
        L153:
            r3 = -1
        L154:
            int r2 = r1.gravity
            if (r2 >= 0) goto L159
            r2 = r12
        L159:
            r2 = r2 & 112(0x70, float:1.57E-43)
            r20 = r4
            r4 = 16
            if (r2 == r4) goto L18f
            r4 = 48
            if (r2 == r4) goto L181
            r4 = 80
            if (r2 == r4) goto L16d
            r2 = r19
            r4 = -1
            goto L19c
        L16d:
            int r2 = r10 - r16
            int r4 = r1.bottomMargin
            int r2 = r2 - r4
            r4 = -1
            if (r3 == r4) goto L19c
            int r21 = r7.getMeasuredHeight()
            int r21 = r21 - r3
            r3 = r15[r23]
            int r3 = r3 - r21
        L17f:
            int r2 = r2 - r3
            goto L19c
        L181:
            r4 = -1
            int r2 = r1.topMargin
            int r2 = r19 + r2
            if (r3 == r4) goto L19c
            r21 = r14[r17]
            int r21 = r21 - r3
            int r2 = r21 + r2
            goto L19c
        L18f:
            r4 = -1
            int r2 = r6 - r16
            int r2 = r2 / 2
            int r2 = r2 + r19
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r3 = r1.bottomMargin
            goto L17f
        L19c:
            boolean r3 = r0.k(r5)
            if (r3 == 0) goto L1a7
            int r3 = r0.l
            int r3 = r27 + r3
            goto L1a9
        L1a7:
            r3 = r27
        L1a9:
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r3 + r20
            int r4 = r2 + r16
            r7.layout(r3, r2, r5, r4)
            int r1 = r1.rightMargin
            int r4 = r20 + r1
            int r4 = r4 + r3
            r2 = r4
            goto L1be
        L1ba:
            r27 = r2
            goto L123
        L1be:
            int r9 = r9 + 1
            r1 = r25
            r3 = r19
            r5 = 80
            r7 = 16
            goto L115
        L1ca:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r39, int r40) {
            r38 = this;
            r0 = r38
            int r1 = r0.d
            r7 = -2
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 8
            r13 = 0
            r14 = 1
            if (r1 != r14) goto L350
            r0.f = r13
            int r15 = r0.getVirtualChildCount()
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r2 = android.view.View.MeasureSpec.getMode(r40)
            int r3 = r0.b
            boolean r4 = r0.h
            r5 = r13
            r6 = r5
            r12 = r6
            r19 = r12
            r22 = r19
            r23 = r22
            r20 = r14
            r24 = r20
            r16 = 0
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r18 = 0
            r14 = r23
        L35:
            if (r5 >= r15) goto L162
            r25 = r1
            android.view.View r1 = r0.getChildAt(r5)
            if (r1 != 0) goto L51
            int r1 = r0.f
            r0.f = r1
        L43:
            r29 = r2
            r7 = r3
            r28 = r4
            r11 = r5
            r10 = r25
            r2 = r39
            r4 = r40
            goto L153
        L51:
            int r10 = r1.getVisibility()
            if (r10 != r9) goto L58
            goto L43
        L58:
            boolean r10 = r0.k(r5)
            if (r10 == 0) goto L65
            int r10 = r0.f
            int r9 = r0.m
            int r10 = r10 + r9
            r0.f = r10
        L65:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.appcompat.widget.b$a r9 = (androidx.appcompat.widget.b.a) r9
            float r10 = r9.weight
            float r16 = r16 + r10
            if (r2 != r8) goto L98
            int r8 = r9.height
            if (r8 != 0) goto L98
            int r8 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r8 <= 0) goto L98
            int r8 = r0.f
            int r10 = r9.topMargin
            int r10 = r10 + r8
            int r11 = r9.bottomMargin
            int r10 = r10 + r11
            int r8 = java.lang.Math.max(r8, r10)
            r0.f = r8
            r30 = r1
            r29 = r2
            r7 = r3
            r28 = r4
            r11 = r5
            r19 = r20
            r10 = r25
            r2 = r39
            r4 = r40
            goto Le6
        L98:
            int r8 = r9.height
            if (r8 != 0) goto La4
            int r8 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r8 <= 0) goto La4
            r9.height = r7
            r8 = 0
            goto La6
        La4:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
        La6:
            int r10 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r10 != 0) goto Lb1
            int r10 = r0.f
            r11 = r10
            r10 = r5
            r5 = r11
        Laf:
            r11 = r3
            goto Lb4
        Lb1:
            r10 = r5
            r5 = 0
            goto Laf
        Lb4:
            r3 = 0
            r29 = r2
            r28 = r4
            r7 = r11
            r2 = r39
            r4 = r40
            r11 = r10
            r10 = r25
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r3) goto Lca
            r9.height = r8
        Lca:
            int r3 = r1.getMeasuredHeight()
            int r5 = r0.f
            int r8 = r5 + r3
            r30 = r1
            int r1 = r9.topMargin
            int r8 = r8 + r1
            int r1 = r9.bottomMargin
            int r8 = r8 + r1
            int r1 = java.lang.Math.max(r5, r8)
            r0.f = r1
            if (r28 == 0) goto Le6
            int r14 = java.lang.Math.max(r3, r14)
        Le6:
            if (r7 < 0) goto Lf0
            int r5 = r11 + 1
            if (r7 != r5) goto Lf0
            int r1 = r0.f
            r0.c = r1
        Lf0:
            if (r11 >= r7) goto Lf8
            float r1 = r9.weight
            int r1 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r1 > 0) goto Lfb
        Lf8:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L103
        Lfb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r1.<init>(r2)
            throw r1
        L103:
            if (r10 == r1) goto L10f
            int r1 = r9.width
            r3 = -1
            if (r1 != r3) goto L10f
            r1 = r20
            r23 = r1
            goto L110
        L10f:
            r1 = 0
        L110:
            int r3 = r9.leftMargin
            int r5 = r9.rightMargin
            int r3 = r3 + r5
            int r5 = r30.getMeasuredWidth()
            int r5 = r5 + r3
            int r8 = java.lang.Math.max(r13, r5)
            int r13 = r30.getMeasuredState()
            r30 = r1
            r1 = r22
            int r1 = android.view.View.combineMeasuredStates(r1, r13)
            if (r24 == 0) goto L136
            int r13 = r9.width
            r22 = r1
            r1 = -1
            if (r13 != r1) goto L138
            r1 = r20
            goto L139
        L136:
            r22 = r1
        L138:
            r1 = 0
        L139:
            float r9 = r9.weight
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 <= 0) goto L148
            if (r30 == 0) goto L142
            goto L143
        L142:
            r3 = r5
        L143:
            int r12 = java.lang.Math.max(r12, r3)
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
            r13 = r8
        L153:
            int r5 = r11 + 1
            r3 = r7
            r1 = r10
            r4 = r28
            r2 = r29
            r7 = -2
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 8
            goto L35
        L162:
            r10 = r1
            r29 = r2
            r28 = r4
            r1 = r22
            r2 = r39
            r4 = r40
            int r3 = r0.f
            if (r3 <= 0) goto L17e
            boolean r3 = r0.k(r15)
            if (r3 == 0) goto L17e
            int r3 = r0.f
            int r5 = r0.m
            int r3 = r3 + r5
            r0.f = r3
        L17e:
            r5 = r29
            if (r28 == 0) goto L1bb
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r3) goto L188
            if (r5 != 0) goto L1bb
        L188:
            r3 = 0
            r0.f = r3
            r3 = 0
        L18c:
            if (r3 >= r15) goto L1bb
            android.view.View r7 = r0.getChildAt(r3)
            if (r7 != 0) goto L199
            int r7 = r0.f
            r0.f = r7
            goto L1b8
        L199:
            int r8 = r7.getVisibility()
            r9 = 8
            if (r8 != r9) goto L1a2
            goto L1b8
        L1a2:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.b$a r7 = (androidx.appcompat.widget.b.a) r7
            int r8 = r0.f
            int r9 = r8 + r14
            int r11 = r7.topMargin
            int r9 = r9 + r11
            int r7 = r7.bottomMargin
            int r9 = r9 + r7
            int r7 = java.lang.Math.max(r8, r9)
            r0.f = r7
        L1b8:
            int r3 = r3 + 1
            goto L18c
        L1bb:
            int r3 = r0.f
            int r7 = r0.getPaddingTop()
            int r8 = r0.getPaddingBottom()
            int r8 = r8 + r7
            int r8 = r8 + r3
            r0.f = r8
            int r3 = r0.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r8, r3)
            r7 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r4, r7)
            r7 = r3 & r17
            int r8 = r0.f
            int r7 = r7 - r8
            if (r19 != 0) goto L220
            if (r7 == 0) goto L1e4
            int r8 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r8 <= 0) goto L1e4
            goto L220
        L1e4:
            int r6 = java.lang.Math.max(r6, r12)
            if (r28 == 0) goto L2f4
            r7 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L2f4
            r5 = 0
        L1ef:
            if (r5 >= r15) goto L2f4
            android.view.View r7 = r0.getChildAt(r5)
            if (r7 == 0) goto L21d
            int r8 = r7.getVisibility()
            r9 = 8
            if (r8 != r9) goto L200
            goto L21d
        L200:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.appcompat.widget.b$a r8 = (androidx.appcompat.widget.b.a) r8
            float r8 = r8.weight
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 <= 0) goto L21d
            int r8 = r7.getMeasuredWidth()
            r9 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            r7.measure(r8, r11)
        L21d:
            int r5 = r5 + 1
            goto L1ef
        L220:
            float r8 = r0.g
            int r9 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r9 <= 0) goto L228
            r16 = r8
        L228:
            r8 = 0
            r0.f = r8
            r8 = r1
            r1 = 0
        L22d:
            if (r1 >= r15) goto L2e5
            android.view.View r9 = r0.getChildAt(r1)
            int r11 = r9.getVisibility()
            r12 = 8
            if (r11 != r12) goto L23f
            r17 = r1
            goto L2e1
        L23f:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            androidx.appcompat.widget.b$a r11 = (androidx.appcompat.widget.b.a) r11
            float r12 = r11.weight
            int r14 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r14 <= 0) goto L29f
            float r14 = (float) r7
            float r14 = r14 * r12
            float r14 = r14 / r16
            int r14 = (int) r14
            float r16 = r16 - r12
            int r7 = r7 - r14
            int r12 = r0.getPaddingLeft()
            int r17 = r0.getPaddingRight()
            int r17 = r17 + r12
            int r12 = r11.leftMargin
            int r17 = r17 + r12
            int r12 = r11.rightMargin
            int r12 = r17 + r12
            r17 = r1
            int r1 = r11.width
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r2, r12, r1)
            int r12 = r11.height
            if (r12 != 0) goto L282
            r12 = 1073741824(0x40000000, float:2.0)
            if (r5 == r12) goto L276
            goto L284
        L276:
            if (r14 <= 0) goto L279
            goto L27a
        L279:
            r14 = 0
        L27a:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r12)
            r9.measure(r1, r14)
            goto L294
        L282:
            r12 = 1073741824(0x40000000, float:2.0)
        L284:
            int r19 = r9.getMeasuredHeight()
            int r14 = r19 + r14
            if (r14 >= 0) goto L28d
            r14 = 0
        L28d:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r12)
            r9.measure(r1, r14)
        L294:
            int r1 = r9.getMeasuredState()
            r1 = r1 & (-256(0xffffffffffffff00, float:NaN))
            int r8 = android.view.View.combineMeasuredStates(r8, r1)
            goto L2a1
        L29f:
            r17 = r1
        L2a1:
            int r1 = r11.leftMargin
            int r12 = r11.rightMargin
            int r1 = r1 + r12
            int r12 = r9.getMeasuredWidth()
            int r12 = r12 + r1
            int r13 = java.lang.Math.max(r13, r12)
            r14 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L2bd
            int r14 = r11.width
            r19 = r1
            r1 = -1
            if (r14 != r1) goto L2be
            r12 = r19
            goto L2be
        L2bd:
            r1 = -1
        L2be:
            int r6 = java.lang.Math.max(r6, r12)
            if (r24 == 0) goto L2cb
            int r12 = r11.width
            if (r12 != r1) goto L2cb
            r1 = r20
            goto L2cc
        L2cb:
            r1 = 0
        L2cc:
            int r12 = r0.f
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r12
            int r14 = r11.topMargin
            int r9 = r9 + r14
            int r11 = r11.bottomMargin
            int r9 = r9 + r11
            int r9 = java.lang.Math.max(r12, r9)
            r0.f = r9
            r24 = r1
        L2e1:
            int r1 = r17 + 1
            goto L22d
        L2e5:
            int r1 = r0.f
            int r5 = r0.getPaddingTop()
            int r7 = r0.getPaddingBottom()
            int r7 = r7 + r5
            int r7 = r7 + r1
            r0.f = r7
            r1 = r8
        L2f4:
            if (r24 != 0) goto L2fb
            r14 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L2fb
            goto L2fc
        L2fb:
            r6 = r13
        L2fc:
            int r5 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r7 = r7 + r5
            int r7 = r7 + r6
            int r5 = r0.getSuggestedMinimumWidth()
            int r5 = java.lang.Math.max(r7, r5)
            int r1 = android.view.View.resolveSizeAndState(r5, r2, r1)
            r0.setMeasuredDimension(r1, r3)
            if (r23 == 0) goto L866
            int r1 = r0.getMeasuredWidth()
            r14 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            r13 = 0
        L322:
            if (r13 >= r15) goto L866
            android.view.View r1 = r0.getChildAt(r13)
            int r3 = r1.getVisibility()
            r9 = 8
            if (r3 == r9) goto L34b
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r6 = r3
            androidx.appcompat.widget.b$a r6 = (androidx.appcompat.widget.b.a) r6
            int r3 = r6.width
            r5 = -1
            if (r3 != r5) goto L34b
            int r7 = r6.height
            int r3 = r1.getMeasuredHeight()
            r6.height = r3
            r3 = 0
            r5 = 0
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r6.height = r7
        L34b:
            int r13 = r13 + 1
            r4 = r40
            goto L322
        L350:
            r2 = r39
            r3 = r13
            r20 = r14
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r18 = 0
            r0.f = r3
            int r6 = r0.getVirtualChildCount()
            int r7 = android.view.View.MeasureSpec.getMode(r2)
            int r8 = android.view.View.MeasureSpec.getMode(r40)
            int[] r1 = r0.i
            r9 = 4
            if (r1 == 0) goto L371
            int[] r1 = r0.j
            if (r1 != 0) goto L379
        L371:
            int[] r1 = new int[r9]
            r0.i = r1
            int[] r1 = new int[r9]
            r0.j = r1
        L379:
            int[] r10 = r0.i
            int[] r11 = r0.j
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
            boolean r14 = r0.f855a
            boolean r15 = r0.h
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
            if (r1 >= r6) goto L568
            r30 = r13
            android.view.View r13 = r0.getChildAt(r1)
            if (r13 != 0) goto L3cf
            int r13 = r0.f
            r0.f = r13
            r33 = r1
            r1 = r4
            r31 = r10
            r32 = r11
            r34 = r14
            r35 = r15
            r4 = r40
            goto L558
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
            goto L558
        L3ec:
            boolean r2 = r0.k(r1)
            if (r2 == 0) goto L3f9
            int r2 = r0.f
            int r3 = r0.l
            int r2 = r2 + r3
            r0.f = r2
        L3f9:
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            androidx.appcompat.widget.b$a r2 = (androidx.appcompat.widget.b.a) r2
            float r3 = r2.weight
            float r28 = r28 + r3
            r32 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L46e
            int r1 = r2.width
            if (r1 != 0) goto L46e
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 <= 0) goto L46e
            if (r16 == 0) goto L421
            int r1 = r0.f
            int r3 = r2.leftMargin
            r33 = r1
            int r1 = r2.rightMargin
            int r3 = r3 + r1
            int r3 = r3 + r33
            r0.f = r3
            goto L432
        L421:
            int r1 = r0.f
            int r3 = r2.leftMargin
            int r3 = r3 + r1
            r33 = r3
            int r3 = r2.rightMargin
            int r3 = r33 + r3
            int r1 = java.lang.Math.max(r1, r3)
            r0.f = r1
        L432:
            if (r14 == 0) goto L453
            r3 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r13.measure(r1, r1)
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
            goto L4d6
        L453:
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
            goto L4d8
        L46e:
            int r1 = r2.width
            if (r1 != 0) goto L47b
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 <= 0) goto L47b
            r1 = -2
            r2.width = r1
            r1 = 0
            goto L47d
        L47b:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L47d:
            int r3 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r3 != 0) goto L486
            int r3 = r0.f
        L483:
            r33 = r5
            goto L488
        L486:
            r3 = 0
            goto L483
        L488:
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
            if (r15 == r3) goto L4aa
            r14.width = r15
        L4aa:
            int r3 = r1.getMeasuredWidth()
            if (r16 == 0) goto L4be
            int r5 = r0.f
            int r15 = r14.leftMargin
            int r15 = r15 + r3
            r36 = r1
            int r1 = r14.rightMargin
            int r15 = r15 + r1
            int r15 = r15 + r5
            r0.f = r15
            goto L4d0
        L4be:
            r36 = r1
            int r1 = r0.f
            int r5 = r1 + r3
            int r15 = r14.leftMargin
            int r5 = r5 + r15
            int r15 = r14.rightMargin
            int r5 = r5 + r15
            int r1 = java.lang.Math.max(r1, r5)
            r0.f = r1
        L4d0:
            if (r35 == 0) goto L4d6
            int r9 = java.lang.Math.max(r3, r9)
        L4d6:
            r1 = 1073741824(0x40000000, float:2.0)
        L4d8:
            if (r8 == r1) goto L4e4
            int r1 = r14.height
            r3 = -1
            if (r1 != r3) goto L4e4
            r1 = r20
            r19 = r1
            goto L4e5
        L4e4:
            r1 = 0
        L4e5:
            int r3 = r14.topMargin
            int r5 = r14.bottomMargin
            int r3 = r3 + r5
            int r5 = r36.getMeasuredHeight()
            int r5 = r5 + r3
            int r15 = r36.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r15)
            if (r34 == 0) goto L527
            int r15 = r36.getBaseline()
            r36 = r1
            r1 = -1
            if (r15 == r1) goto L529
            int r1 = r14.gravity
            if (r1 >= 0) goto L508
            int r1 = r0.e
        L508:
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
            goto L529
        L527:
            r36 = r1
        L529:
            int r1 = java.lang.Math.max(r13, r5)
            if (r29 == 0) goto L537
            int r13 = r14.height
            r15 = -1
            if (r13 != r15) goto L537
            r13 = r20
            goto L538
        L537:
            r13 = 0
        L538:
            float r14 = r14.weight
            int r14 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r14 <= 0) goto L548
            if (r36 == 0) goto L541
            goto L542
        L541:
            r3 = r5
        L542:
            int r5 = java.lang.Math.max(r11, r3)
            r3 = r10
            goto L551
        L548:
            if (r36 == 0) goto L54b
            goto L54c
        L54b:
            r3 = r5
        L54c:
            int r3 = java.lang.Math.max(r10, r3)
            r5 = r11
        L551:
            r29 = r3
            r3 = r1
            r1 = r29
            r29 = r13
        L558:
            int r10 = r33 + 1
            r4 = r1
            r1 = r10
            r13 = r30
            r10 = r31
            r11 = r32
            r14 = r34
            r15 = r35
            goto L3b2
        L568:
            r31 = r10
            r32 = r11
            r30 = r13
            r34 = r14
            r35 = r15
            r13 = r3
            r10 = r4
            r11 = r5
            r4 = r40
            int r1 = r0.f
            if (r1 <= 0) goto L588
            boolean r1 = r0.k(r6)
            if (r1 == 0) goto L588
            int r1 = r0.f
            int r3 = r0.l
            int r1 = r1 + r3
            r0.f = r1
        L588:
            r1 = r31[r20]
            r3 = -1
            if (r1 != r3) goto L59e
            r21 = 0
            r5 = r31[r21]
            if (r5 != r3) goto L59e
            r5 = r31[r30]
            if (r5 != r3) goto L59e
            r5 = r31[r24]
            if (r5 == r3) goto L59c
            goto L59e
        L59c:
            r3 = r13
            goto L5cb
        L59e:
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
        L5cb:
            if (r35 == 0) goto L614
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r1) goto L5d3
            if (r7 != 0) goto L614
        L5d3:
            r1 = 0
            r0.f = r1
            r1 = 0
        L5d7:
            if (r1 >= r6) goto L614
            android.view.View r5 = r0.getChildAt(r1)
            if (r5 != 0) goto L5e4
            int r5 = r0.f
            r0.f = r5
            goto L611
        L5e4:
            int r13 = r5.getVisibility()
            r14 = 8
            if (r13 != r14) goto L5ed
            goto L611
        L5ed:
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.appcompat.widget.b$a r5 = (androidx.appcompat.widget.b.a) r5
            if (r16 == 0) goto L601
            int r13 = r0.f
            int r14 = r5.leftMargin
            int r14 = r14 + r9
            int r5 = r5.rightMargin
            int r14 = r14 + r5
            int r14 = r14 + r13
            r0.f = r14
            goto L611
        L601:
            int r13 = r0.f
            int r14 = r13 + r9
            int r15 = r5.leftMargin
            int r14 = r14 + r15
            int r5 = r5.rightMargin
            int r14 = r14 + r5
            int r5 = java.lang.Math.max(r13, r14)
            r0.f = r5
        L611:
            int r1 = r1 + 1
            goto L5d7
        L614:
            int r1 = r0.f
            int r5 = r0.getPaddingLeft()
            int r13 = r0.getPaddingRight()
            int r13 = r13 + r5
            int r13 = r13 + r1
            r0.f = r13
            int r1 = r0.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r13, r1)
            r5 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r2, r5)
            r5 = r1 & r17
            int r13 = r0.f
            int r5 = r5 - r13
            if (r22 != 0) goto L681
            if (r5 == 0) goto L63d
            int r14 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r14 <= 0) goto L63d
            goto L681
        L63d:
            int r5 = java.lang.Math.max(r10, r11)
            if (r35 == 0) goto L679
            r14 = 1073741824(0x40000000, float:2.0)
            if (r7 == r14) goto L679
            r7 = 0
        L648:
            if (r7 >= r6) goto L679
            android.view.View r10 = r0.getChildAt(r7)
            if (r10 == 0) goto L676
            int r11 = r10.getVisibility()
            r14 = 8
            if (r11 != r14) goto L659
            goto L676
        L659:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.appcompat.widget.b$a r11 = (androidx.appcompat.widget.b.a) r11
            float r11 = r11.weight
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 <= 0) goto L676
            r14 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r14)
            int r15 = r10.getMeasuredHeight()
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            r10.measure(r11, r15)
        L676:
            int r7 = r7 + 1
            goto L648
        L679:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r21 = 0
            goto L800
        L681:
            float r3 = r0.g
            int r9 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r9 <= 0) goto L689
            r28 = r3
        L689:
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
            r0.f = r3
            r3 = -1
            r9 = 0
        L6a0:
            if (r9 >= r6) goto L7a8
            android.view.View r11 = r0.getChildAt(r9)
            if (r11 == 0) goto L6b0
            int r14 = r11.getVisibility()
            r15 = 8
            if (r14 != r15) goto L6b8
        L6b0:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r25 = -2
            goto L7a2
        L6b8:
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            androidx.appcompat.widget.b$a r14 = (androidx.appcompat.widget.b.a) r14
            float r15 = r14.weight
            int r17 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r17 <= 0) goto L71a
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
            if (r15 != 0) goto L6fd
            r15 = 1073741824(0x40000000, float:2.0)
            if (r7 == r15) goto L6f1
            goto L6ff
        L6f1:
            if (r13 <= 0) goto L6f4
            goto L6f5
        L6f4:
            r13 = 0
        L6f5:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r11.measure(r13, r1)
            goto L70f
        L6fd:
            r15 = 1073741824(0x40000000, float:2.0)
        L6ff:
            int r27 = r11.getMeasuredWidth()
            int r13 = r27 + r13
            if (r13 >= 0) goto L708
            r13 = 0
        L708:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r11.measure(r13, r1)
        L70f:
            int r1 = r11.getMeasuredState()
            r1 = r1 & r17
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            goto L71e
        L71a:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L71e:
            if (r16 == 0) goto L732
            int r1 = r0.f
            int r13 = r11.getMeasuredWidth()
            int r15 = r14.leftMargin
            int r13 = r13 + r15
            int r15 = r14.rightMargin
            int r13 = r13 + r15
            int r13 = r13 + r1
            r0.f = r13
        L72f:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L746
        L732:
            int r1 = r0.f
            int r13 = r11.getMeasuredWidth()
            int r13 = r13 + r1
            int r15 = r14.leftMargin
            int r13 = r13 + r15
            int r15 = r14.rightMargin
            int r13 = r13 + r15
            int r1 = java.lang.Math.max(r1, r13)
            r0.f = r1
            goto L72f
        L746:
            if (r8 == r1) goto L750
            int r1 = r14.height
            r15 = -1
            if (r1 != r15) goto L750
            r1 = r20
            goto L751
        L750:
            r1 = 0
        L751:
            int r13 = r14.topMargin
            int r15 = r14.bottomMargin
            int r13 = r13 + r15
            int r15 = r11.getMeasuredHeight()
            int r15 = r15 + r13
            int r3 = java.lang.Math.max(r3, r15)
            if (r1 == 0) goto L762
            goto L763
        L762:
            r13 = r15
        L763:
            int r1 = java.lang.Math.max(r10, r13)
            if (r29 == 0) goto L771
            int r10 = r14.height
            r13 = -1
            if (r10 != r13) goto L772
            r10 = r20
            goto L773
        L771:
            r13 = -1
        L772:
            r10 = 0
        L773:
            if (r34 == 0) goto L79d
            int r11 = r11.getBaseline()
            if (r11 == r13) goto L79d
            int r13 = r14.gravity
            if (r13 >= 0) goto L781
            int r13 = r0.e
        L781:
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
            goto L79f
        L79d:
            r25 = -2
        L79f:
            r29 = r10
            r10 = r1
        L7a2:
            int r9 = r9 + 1
            r1 = r22
            goto L6a0
        L7a8:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r1 = r0.f
            int r5 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r7 = r7 + r5
            int r7 = r7 + r1
            r0.f = r7
            r1 = r31[r20]
            r15 = -1
            if (r1 != r15) goto L7d1
            r21 = 0
            r5 = r31[r21]
            if (r5 != r15) goto L7d1
            r5 = r31[r30]
            if (r5 != r15) goto L7d1
            r5 = r31[r24]
            if (r5 == r15) goto L7ce
            goto L7d1
        L7ce:
            r21 = 0
            goto L7ff
        L7d1:
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
        L7ff:
            r5 = r10
        L800:
            if (r29 != 0) goto L807
            r14 = 1073741824(0x40000000, float:2.0)
            if (r8 == r14) goto L807
            r3 = r5
        L807:
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
            if (r19 == 0) goto L866
            int r1 = r0.getMeasuredHeight()
            r14 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            r13 = r21
        L834:
            if (r13 >= r6) goto L866
            android.view.View r1 = r0.getChildAt(r13)
            int r3 = r1.getVisibility()
            r9 = 8
            if (r3 == r9) goto L85e
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r7 = r3
            androidx.appcompat.widget.b$a r7 = (androidx.appcompat.widget.b.a) r7
            int r3 = r7.height
            r15 = -1
            if (r3 != r15) goto L85f
            int r8 = r7.width
            int r3 = r1.getMeasuredWidth()
            r7.width = r3
            r3 = 0
            r5 = 0
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r7.width = r8
            goto L85f
        L85e:
            r15 = -1
        L85f:
            int r13 = r13 + 1
            r0 = r38
            r2 = r39
            goto L834
        L866:
            return
    }

    public void setBaselineAligned(boolean r1) {
            r0 = this;
            r0.f855a = r1
            return
    }

    public void setBaselineAlignedChildIndex(int r3) {
            r2 = this;
            if (r3 < 0) goto Lb
            int r0 = r2.getChildCount()
            if (r3 >= r0) goto Lb
            r2.b = r3
            return
        Lb:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "base aligned child index out of range (0, "
            r0.<init>(r1)
            int r1 = r2.getChildCount()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.k
            if (r3 != r0) goto L5
            return
        L5:
            r2.k = r3
            r0 = 0
            if (r3 == 0) goto L17
            int r1 = r3.getIntrinsicWidth()
            r2.l = r1
            int r1 = r3.getIntrinsicHeight()
            r2.m = r1
            goto L1b
        L17:
            r2.l = r0
            r2.m = r0
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
            r0.o = r1
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.e
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
            r1.e = r2
            r1.requestLayout()
        L19:
            return
    }

    public void setHorizontalGravity(int r3) {
            r2 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            int r1 = r2.e
            r0 = r0 & r1
            if (r0 == r3) goto L13
            r0 = -8388616(0xffffffffff7ffff8, float:-3.402822E38)
            r0 = r0 & r1
            r3 = r3 | r0
            r2.e = r3
            r2.requestLayout()
        L13:
            return
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            int r0 = r1.d
            if (r0 == r2) goto L9
            r1.d = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setShowDividers(int r2) {
            r1 = this;
            int r0 = r1.n
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.n = r2
            return
    }

    public void setVerticalGravity(int r3) {
            r2 = this;
            r3 = r3 & 112(0x70, float:1.57E-43)
            int r0 = r2.e
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 == r3) goto L10
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r3 = r3 | r0
            r2.e = r3
            r2.requestLayout()
        L10:
            return
    }

    public void setWeightSum(float r2) {
            r1 = this;
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            r1.g = r2
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
