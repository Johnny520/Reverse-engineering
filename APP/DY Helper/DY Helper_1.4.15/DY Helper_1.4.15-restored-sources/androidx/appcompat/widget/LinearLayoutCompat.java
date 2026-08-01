package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends android.view.ViewGroup {

    /* JADX INFO: renamed from: ε */
    public boolean f618;

    /* JADX INFO: renamed from: ζ */
    public int f619;

    /* JADX INFO: renamed from: η */
    public int f620;

    /* JADX INFO: renamed from: θ */
    public int f621;

    /* JADX INFO: renamed from: ι */
    public int f622;

    /* JADX INFO: renamed from: κ */
    public int f623;

    /* JADX INFO: renamed from: λ */
    public float f624;

    /* JADX INFO: renamed from: μ */
    public boolean f625;

    /* JADX INFO: renamed from: ν */
    public int[] f626;

    /* JADX INFO: renamed from: ξ */
    public int[] f627;

    /* JADX INFO: renamed from: ο */
    public android.graphics.drawable.Drawable f628;

    /* JADX INFO: renamed from: π */
    public int f629;

    /* JADX INFO: renamed from: ρ */
    public int f630;

    /* JADX INFO: renamed from: σ */
    public int f631;

    /* JADX INFO: renamed from: τ */
    public int f632;

    public LinearLayoutCompat(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
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
            r11.f618 = r0
            r1 = -1
            r11.f619 = r1
            r2 = 0
            r11.f620 = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r11.f622 = r3
            int[] r6 = p000.kk1.f5981
            m6 r3 = p000.C0538m6.m3752(r12, r13, r6, r14)
            java.lang.Object r4 = r3.f6967
            r8 = r4
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            java.util.WeakHashMap r4 = p000.b92.f1572
            r10 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r9 = r14
            p000.y82.m6840(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r11 = r3.f6967
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r12 = r11.getInt(r0, r1)
            if (r12 < 0) goto L33
            r4.setOrientation(r12)
        L33:
            int r12 = r11.getInt(r2, r1)
            if (r12 < 0) goto L3c
            r4.setGravity(r12)
        L3c:
            r12 = 2
            boolean r12 = r11.getBoolean(r12, r0)
            if (r12 != 0) goto L46
            r4.setBaselineAligned(r12)
        L46:
            r12 = 4
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r12 = r11.getFloat(r12, r13)
            r4.f624 = r12
            r12 = 3
            int r12 = r11.getInt(r12, r1)
            r4.f619 = r12
            r12 = 7
            boolean r12 = r11.getBoolean(r12, r2)
            r4.f625 = r12
            r12 = 5
            android.graphics.drawable.Drawable r12 = r3.m3754(r12)
            r4.setDividerDrawable(r12)
            r12 = 8
            int r12 = r11.getInt(r12, r2)
            r4.f631 = r12
            r12 = 6
            int r11 = r11.getDimensionPixelSize(r12, r2)
            r4.f632 = r11
            r3.m3765()
            return
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof p000.zr0
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            zr0 r0 = r0.mo263()
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            zr0 r0 = r0.mo264(r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            zr0 r0 = r0.mo265(r1)
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r5 = this;
            int r0 = r5.f619
            if (r0 >= 0) goto L9
            int r5 = super.getBaseline()
            return r5
        L9:
            int r0 = r5.getChildCount()
            int r1 = r5.f619
            if (r0 <= r1) goto L77
            android.view.View r0 = r5.getChildAt(r1)
            int r1 = r0.getBaseline()
            r2 = -1
            if (r1 != r2) goto L29
            int r5 = r5.f619
            if (r5 != 0) goto L21
            return r2
        L21:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline."
            r5.<init>(r0)
            throw r5
        L29:
            int r2 = r5.f620
            int r3 = r5.f621
            r4 = 1
            if (r3 != r4) goto L6c
            int r3 = r5.f622
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
            int r5 = r5.f623
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
            int r5 = r5.f623
            int r3 = r3 - r5
            int r3 = r3 / 2
            int r2 = r2 + r3
        L6c:
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            zr0 r5 = (p000.zr0) r5
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
            int r0 = r0.f619
            return r0
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f628
            return r0
    }

    public int getDividerPadding() {
            r0 = this;
            int r0 = r0.f632
            return r0
    }

    public int getDividerWidth() {
            r0 = this;
            int r0 = r0.f629
            return r0
    }

    public int getGravity() {
            r0 = this;
            int r0 = r0.f622
            return r0
    }

    public int getOrientation() {
            r0 = this;
            int r0 = r0.f621
            return r0
    }

    public int getShowDividers() {
            r0 = this;
            int r0 = r0.f631
            return r0
    }

    public int getVirtualChildCount() {
            r0 = this;
            int r0 = r0.getChildCount()
            return r0
    }

    public float getWeightSum() {
            r0 = this;
            float r0 = r0.f624
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f628
            if (r0 != 0) goto L6
            goto Le5
        L6:
            int r0 = r7.f621
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
            boolean r5 = r7.m277(r2)
            if (r5 == 0) goto L39
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            zr0 r5 = (p000.zr0) r5
            int r4 = r4.getTop()
            int r5 = r5.topMargin
            int r4 = r4 - r5
            int r5 = r7.f630
            int r4 = r4 - r5
            r7.m275(r8, r4)
        L39:
            int r2 = r2 + 1
            goto L12
        L3c:
            boolean r1 = r7.m277(r0)
            if (r1 == 0) goto Le5
            int r0 = r0 - r3
            android.view.View r0 = r7.getChildAt(r0)
            if (r0 != 0) goto L56
            int r0 = r7.getHeight()
            int r1 = r7.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r7.f630
            int r0 = r0 - r1
            goto L63
        L56:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            zr0 r1 = (p000.zr0) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
        L63:
            r7.m275(r8, r0)
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
            boolean r6 = r7.m277(r2)
            if (r6 == 0) goto La5
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            zr0 r6 = (p000.zr0) r6
            if (r4 == 0) goto L98
            int r5 = r5.getRight()
            int r6 = r6.rightMargin
            int r5 = r5 + r6
            goto La2
        L98:
            int r5 = r5.getLeft()
            int r6 = r6.leftMargin
            int r5 = r5 - r6
            int r6 = r7.f629
            int r5 = r5 - r6
        La2:
            r7.m276(r8, r5)
        La5:
            int r2 = r2 + 1
            goto L74
        La8:
            boolean r1 = r7.m277(r0)
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
            int r1 = r7.f629
        Lc7:
            int r0 = r0 - r1
            goto Le2
        Lc9:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            zr0 r1 = (p000.zr0) r1
            if (r4 == 0) goto Ldb
            int r0 = r0.getLeft()
            int r1 = r1.leftMargin
            int r0 = r0 - r1
            int r1 = r7.f629
            goto Lc7
        Ldb:
            int r0 = r0.getRight()
            int r1 = r1.rightMargin
            int r0 = r0 + r1
        Le2:
            r7.m276(r8, r0)
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

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
            r22 = this;
            r0 = r22
            int r1 = r0.f621
            r2 = 5
            r3 = 8
            r5 = 80
            r6 = 16
            r7 = 8388615(0x800007, float:1.1754953E-38)
            r8 = 2
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
            int r13 = r0.f622
            r14 = r13 & 112(0x70, float:1.57E-43)
            r7 = r7 & r13
            if (r14 == r6) goto L42
            if (r14 == r5) goto L36
            int r5 = r0.getPaddingTop()
            goto L4d
        L36:
            int r5 = r0.getPaddingTop()
            int r5 = r5 + r27
            int r5 = r5 - r25
            int r6 = r0.f623
            int r5 = r5 - r6
            goto L4d
        L42:
            int r5 = r0.getPaddingTop()
            int r6 = r27 - r25
            int r13 = r0.f623
            int r6 = r6 - r13
            int r6 = r6 / r8
            int r5 = r5 + r6
        L4d:
            r4 = 0
        L4e:
            if (r4 >= r12) goto L1ca
            android.view.View r6 = r0.getChildAt(r4)
            if (r6 != 0) goto L59
        L56:
            r23 = r8
            goto Lae
        L59:
            int r13 = r6.getVisibility()
            if (r13 == r3) goto L56
            int r13 = r6.getMeasuredWidth()
            int r14 = r6.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r6.getLayoutParams()
            zr0 r15 = (p000.zr0) r15
            r23 = r8
            int r8 = r15.gravity
            if (r8 >= 0) goto L74
            r8 = r7
        L74:
            int r3 = r0.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r8, r3)
            r3 = r3 & 7
            if (r3 == r9) goto L8c
            if (r3 == r2) goto L86
            int r3 = r15.leftMargin
            int r3 = r3 + r1
            goto L97
        L86:
            int r3 = r11 - r13
            int r8 = r15.rightMargin
        L8a:
            int r3 = r3 - r8
            goto L97
        L8c:
            int r3 = r10 - r13
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r8 = r15.leftMargin
            int r3 = r3 + r8
            int r8 = r15.rightMargin
            goto L8a
        L97:
            boolean r8 = r0.m277(r4)
            if (r8 == 0) goto La0
            int r8 = r0.f630
            int r5 = r5 + r8
        La0:
            int r8 = r15.topMargin
            int r5 = r5 + r8
            int r13 = r13 + r3
            int r8 = r5 + r14
            r6.layout(r3, r5, r13, r8)
            int r3 = r15.bottomMargin
            int r14 = r14 + r3
            int r14 = r14 + r5
            r5 = r14
        Lae:
            int r4 = r4 + 1
            r8 = r23
            r3 = 8
            goto L4e
        Lb5:
            r23 = r8
            int r1 = r0.getLayoutDirection()
            if (r1 != r9) goto Lbf
            r1 = r9
            goto Lc0
        Lbf:
            r1 = 0
        Lc0:
            int r3 = r0.getPaddingTop()
            int r8 = r27 - r25
            int r10 = r0.getPaddingBottom()
            int r10 = r8 - r10
            int r8 = r8 - r3
            int r11 = r0.getPaddingBottom()
            int r8 = r8 - r11
            int r11 = r0.getVirtualChildCount()
            int r12 = r0.f622
            r7 = r7 & r12
            r12 = r12 & 112(0x70, float:1.57E-43)
            boolean r13 = r0.f618
            int[] r14 = r0.f626
            int[] r15 = r0.f627
            int r4 = r0.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r7, r4)
            if (r4 == r9) goto Lfe
            if (r4 == r2) goto Lf2
            int r2 = r0.getPaddingLeft()
            goto L10a
        Lf2:
            int r2 = r0.getPaddingLeft()
            int r2 = r2 + r26
            int r2 = r2 - r24
            int r4 = r0.f623
            int r2 = r2 - r4
            goto L10a
        Lfe:
            int r2 = r0.getPaddingLeft()
            int r4 = r26 - r24
            int r7 = r0.f623
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r2 = r2 + r4
        L10a:
            if (r1 == 0) goto L110
            int r1 = r11 + (-1)
            r7 = -1
            goto L112
        L110:
            r7 = r9
            r1 = 0
        L112:
            r17 = r9
            r9 = 0
        L115:
            if (r9 >= r11) goto L1ca
            int r18 = r7 * r9
            int r5 = r18 + r1
            android.view.View r6 = r0.getChildAt(r5)
            if (r6 != 0) goto L127
            r25 = r1
        L123:
            r19 = r3
            goto L1be
        L127:
            int r4 = r6.getVisibility()
            r25 = r1
            r1 = 8
            if (r4 == r1) goto L1ba
            int r4 = r6.getMeasuredWidth()
            int r16 = r6.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r19 = r6.getLayoutParams()
            r1 = r19
            zr0 r1 = (p000.zr0) r1
            r27 = r2
            if (r13 == 0) goto L151
            int r2 = r1.height
            r19 = r3
            r3 = -1
            if (r2 == r3) goto L153
            int r3 = r6.getBaseline()
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
            int r21 = r6.getMeasuredHeight()
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
            int r2 = r8 - r16
            int r2 = r2 / 2
            int r2 = r2 + r19
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r3 = r1.bottomMargin
            goto L17f
        L19c:
            boolean r3 = r0.m277(r5)
            if (r3 == 0) goto L1a7
            int r3 = r0.f629
            int r3 = r27 + r3
            goto L1a9
        L1a7:
            r3 = r27
        L1a9:
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r3 + r20
            int r4 = r2 + r16
            r6.layout(r3, r2, r5, r4)
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
            r6 = 16
            goto L115
        L1ca:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r39, int r40) {
            r38 = this;
            r0 = r38
            int r1 = r0.f621
            r7 = -2
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 8
            r14 = 1
            if (r1 != r14) goto L34f
            r0.f623 = r9
            int r15 = r0.getVirtualChildCount()
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r2 = android.view.View.MeasureSpec.getMode(r40)
            int r3 = r0.f619
            boolean r4 = r0.f625
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
            int r1 = r0.f623
            r0.f623 = r1
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
            boolean r12 = r0.m277(r5)
            if (r12 == 0) goto L65
            int r12 = r0.f623
            int r11 = r0.f630
            int r12 = r12 + r11
            r0.f623 = r12
        L65:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            zr0 r11 = (p000.zr0) r11
            float r12 = r11.weight
            float r16 = r16 + r12
            if (r2 != r10) goto L98
            int r10 = r11.height
            if (r10 != 0) goto L98
            int r10 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r10 <= 0) goto L98
            int r10 = r0.f623
            int r12 = r11.topMargin
            int r12 = r12 + r10
            int r13 = r11.bottomMargin
            int r12 = r12 + r13
            int r10 = java.lang.Math.max(r10, r12)
            r0.f623 = r10
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
            int r12 = r0.f623
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
            int r5 = r0.f623
            int r10 = r5 + r3
            r30 = r1
            int r1 = r11.topMargin
            int r10 = r10 + r1
            int r1 = r11.bottomMargin
            int r10 = r10 + r1
            int r1 = java.lang.Math.max(r5, r10)
            r0.f623 = r1
            if (r28 == 0) goto Le6
            int r14 = java.lang.Math.max(r3, r14)
        Le6:
            if (r7 < 0) goto Lf0
            int r5 = r13 + 1
            if (r7 != r5) goto Lf0
            int r1 = r0.f623
            r0.f620 = r1
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
            int r3 = r0.f623
            if (r3 <= 0) goto L17d
            boolean r3 = r0.m277(r15)
            if (r3 == 0) goto L17d
            int r3 = r0.f623
            int r5 = r0.f630
            int r3 = r3 + r5
            r0.f623 = r3
        L17d:
            r3 = r29
            if (r28 == 0) goto L1ba
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r5) goto L187
            if (r3 != 0) goto L1ba
        L187:
            r5 = 0
            r0.f623 = r5
            r5 = 0
        L18b:
            if (r5 >= r15) goto L1ba
            android.view.View r7 = r0.getChildAt(r5)
            if (r7 != 0) goto L198
            int r7 = r0.f623
            r0.f623 = r7
            goto L1b7
        L198:
            int r10 = r7.getVisibility()
            r11 = 8
            if (r10 != r11) goto L1a1
            goto L1b7
        L1a1:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            zr0 r7 = (p000.zr0) r7
            int r10 = r0.f623
            int r11 = r10 + r14
            int r13 = r7.topMargin
            int r11 = r11 + r13
            int r7 = r7.bottomMargin
            int r11 = r11 + r7
            int r7 = java.lang.Math.max(r10, r11)
            r0.f623 = r7
        L1b7:
            int r5 = r5 + 1
            goto L18b
        L1ba:
            int r5 = r0.f623
            int r7 = r0.getPaddingTop()
            int r10 = r0.getPaddingBottom()
            int r10 = r10 + r7
            int r10 = r10 + r5
            r0.f623 = r10
            int r5 = r0.getSuggestedMinimumHeight()
            int r5 = java.lang.Math.max(r10, r5)
            r7 = 0
            int r5 = android.view.View.resolveSizeAndState(r5, r4, r7)
            r7 = r5 & r17
            int r10 = r0.f623
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
            zr0 r8 = (p000.zr0) r8
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
            float r8 = r0.f624
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 <= 0) goto L227
            r16 = r8
        L227:
            r8 = 0
            r0.f623 = r8
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
            zr0 r11 = (p000.zr0) r11
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
            int r13 = r0.f623
            int r10 = r10.getMeasuredHeight()
            int r10 = r10 + r13
            int r14 = r11.topMargin
            int r10 = r10 + r14
            int r11 = r11.bottomMargin
            int r10 = r10 + r11
            int r10 = java.lang.Math.max(r13, r10)
            r0.f623 = r10
            r24 = r1
        L2e0:
            int r1 = r17 + 1
            goto L22c
        L2e4:
            int r1 = r0.f623
            int r3 = r0.getPaddingTop()
            int r7 = r0.getPaddingBottom()
            int r7 = r7 + r3
            int r7 = r7 + r1
            r0.f623 = r7
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
            if (r23 == 0) goto L85c
            int r1 = r0.getMeasuredWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r13)
            r9 = 0
        L321:
            if (r9 >= r15) goto L85c
            android.view.View r1 = r0.getChildAt(r9)
            int r3 = r1.getVisibility()
            r11 = 8
            if (r3 == r11) goto L34a
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r6 = r3
            zr0 r6 = (p000.zr0) r6
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
            r0.f623 = r5
            int r6 = r0.getVirtualChildCount()
            int r7 = android.view.View.MeasureSpec.getMode(r2)
            int r8 = android.view.View.MeasureSpec.getMode(r40)
            int[] r1 = r0.f626
            r9 = 4
            if (r1 == 0) goto L370
            int[] r1 = r0.f627
            if (r1 != 0) goto L378
        L370:
            int[] r1 = new int[r9]
            r0.f626 = r1
            int[] r1 = new int[r9]
            r0.f627 = r1
        L378:
            int[] r10 = r0.f626
            int[] r11 = r0.f627
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
            boolean r14 = r0.f618
            boolean r15 = r0.f625
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L39d
            r16 = r20
            goto L39f
        L39d:
            r16 = 0
        L39f:
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
        L3b1:
            if (r1 >= r6) goto L562
            r30 = r13
            android.view.View r13 = r0.getChildAt(r1)
            if (r13 != 0) goto L3ce
            int r13 = r0.f623
            r0.f623 = r13
            r33 = r1
            r1 = r4
            r31 = r10
            r32 = r11
            r34 = r14
            r35 = r15
            r4 = r40
            goto L552
        L3ce:
            int r2 = r13.getVisibility()
            r31 = r3
            r3 = 8
            if (r2 != r3) goto L3eb
            r2 = r39
            r33 = r1
            r1 = r4
            r32 = r11
            r34 = r14
            r35 = r15
            r3 = r31
            r4 = r40
            r31 = r10
            goto L552
        L3eb:
            boolean r2 = r0.m277(r1)
            if (r2 == 0) goto L3f8
            int r2 = r0.f623
            int r3 = r0.f629
            int r2 = r2 + r3
            r0.f623 = r2
        L3f8:
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            zr0 r2 = (p000.zr0) r2
            float r3 = r2.weight
            float r28 = r28 + r3
            r32 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L46c
            int r1 = r2.width
            if (r1 != 0) goto L46c
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 <= 0) goto L46c
            int r1 = r0.f623
            int r3 = r2.leftMargin
            if (r16 == 0) goto L420
            r33 = r3
            int r3 = r2.rightMargin
            int r3 = r33 + r3
            int r3 = r3 + r1
            r0.f623 = r3
            goto L430
        L420:
            r33 = r3
            int r3 = r1 + r33
            r33 = r3
            int r3 = r2.rightMargin
            int r3 = r33 + r3
            int r1 = java.lang.Math.max(r1, r3)
            r0.f623 = r1
        L430:
            if (r14 == 0) goto L451
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
            goto L4d0
        L451:
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
            goto L4d2
        L46c:
            int r1 = r2.width
            if (r1 != 0) goto L479
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 <= 0) goto L479
            r1 = -2
            r2.width = r1
            r1 = 0
            goto L47b
        L479:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L47b:
            int r3 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r3 != 0) goto L484
            int r3 = r0.f623
        L481:
            r33 = r5
            goto L486
        L484:
            r3 = 0
            goto L481
        L486:
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
            if (r15 == r3) goto L4a8
            r14.width = r15
        L4a8:
            int r3 = r1.getMeasuredWidth()
            int r5 = r0.f623
            int r15 = r14.leftMargin
            if (r16 == 0) goto L4bc
            int r15 = r15 + r3
            r36 = r1
            int r1 = r14.rightMargin
            int r15 = r15 + r1
            int r15 = r15 + r5
            r0.f623 = r15
            goto L4ca
        L4bc:
            r36 = r1
            int r1 = r5 + r3
            int r1 = r1 + r15
            int r15 = r14.rightMargin
            int r1 = r1 + r15
            int r1 = java.lang.Math.max(r5, r1)
            r0.f623 = r1
        L4ca:
            if (r35 == 0) goto L4d0
            int r9 = java.lang.Math.max(r3, r9)
        L4d0:
            r1 = 1073741824(0x40000000, float:2.0)
        L4d2:
            if (r8 == r1) goto L4de
            int r1 = r14.height
            r3 = -1
            if (r1 != r3) goto L4de
            r1 = r20
            r19 = r1
            goto L4df
        L4de:
            r1 = 0
        L4df:
            int r3 = r14.topMargin
            int r5 = r14.bottomMargin
            int r3 = r3 + r5
            int r5 = r36.getMeasuredHeight()
            int r5 = r5 + r3
            int r15 = r36.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r15)
            if (r34 == 0) goto L521
            int r15 = r36.getBaseline()
            r36 = r1
            r1 = -1
            if (r15 == r1) goto L523
            int r1 = r14.gravity
            if (r1 >= 0) goto L502
            int r1 = r0.f622
        L502:
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
            goto L523
        L521:
            r36 = r1
        L523:
            int r1 = java.lang.Math.max(r13, r5)
            if (r29 == 0) goto L531
            int r13 = r14.height
            r15 = -1
            if (r13 != r15) goto L531
            r13 = r20
            goto L532
        L531:
            r13 = 0
        L532:
            float r14 = r14.weight
            int r14 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r14 <= 0) goto L542
            if (r36 == 0) goto L53b
            goto L53c
        L53b:
            r3 = r5
        L53c:
            int r5 = java.lang.Math.max(r11, r3)
            r3 = r10
            goto L54b
        L542:
            if (r36 == 0) goto L545
            goto L546
        L545:
            r3 = r5
        L546:
            int r3 = java.lang.Math.max(r10, r3)
            r5 = r11
        L54b:
            r29 = r3
            r3 = r1
            r1 = r29
            r29 = r13
        L552:
            int r10 = r33 + 1
            r4 = r1
            r1 = r10
            r13 = r30
            r10 = r31
            r11 = r32
            r14 = r34
            r15 = r35
            goto L3b1
        L562:
            r31 = r10
            r32 = r11
            r30 = r13
            r34 = r14
            r35 = r15
            r13 = r3
            r10 = r4
            r11 = r5
            r4 = r40
            int r1 = r0.f623
            if (r1 <= 0) goto L582
            boolean r1 = r0.m277(r6)
            if (r1 == 0) goto L582
            int r1 = r0.f623
            int r3 = r0.f629
            int r1 = r1 + r3
            r0.f623 = r1
        L582:
            r1 = r31[r20]
            r3 = -1
            if (r1 != r3) goto L598
            r21 = 0
            r5 = r31[r21]
            if (r5 != r3) goto L598
            r5 = r31[r30]
            if (r5 != r3) goto L598
            r5 = r31[r24]
            if (r5 == r3) goto L596
            goto L598
        L596:
            r3 = r13
            goto L5c5
        L598:
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
        L5c5:
            if (r35 == 0) goto L60c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r5) goto L5cd
            if (r7 != 0) goto L60c
        L5cd:
            r5 = 0
            r0.f623 = r5
            r1 = 0
        L5d1:
            if (r1 >= r6) goto L60c
            android.view.View r5 = r0.getChildAt(r1)
            if (r5 != 0) goto L5de
            int r5 = r0.f623
            r0.f623 = r5
            goto L609
        L5de:
            int r13 = r5.getVisibility()
            r14 = 8
            if (r13 != r14) goto L5e7
            goto L609
        L5e7:
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            zr0 r5 = (p000.zr0) r5
            int r13 = r0.f623
            if (r16 == 0) goto L5fb
            int r14 = r5.leftMargin
            int r14 = r14 + r9
            int r5 = r5.rightMargin
            int r14 = r14 + r5
            int r14 = r14 + r13
            r0.f623 = r14
            goto L609
        L5fb:
            int r14 = r13 + r9
            int r15 = r5.leftMargin
            int r14 = r14 + r15
            int r5 = r5.rightMargin
            int r14 = r14 + r5
            int r5 = java.lang.Math.max(r13, r14)
            r0.f623 = r5
        L609:
            int r1 = r1 + 1
            goto L5d1
        L60c:
            int r1 = r0.f623
            int r5 = r0.getPaddingLeft()
            int r13 = r0.getPaddingRight()
            int r13 = r13 + r5
            int r13 = r13 + r1
            r0.f623 = r13
            int r1 = r0.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r13, r1)
            r5 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r2, r5)
            r5 = r1 & r17
            int r13 = r0.f623
            int r5 = r5 - r13
            if (r22 != 0) goto L679
            if (r5 == 0) goto L635
            int r14 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r14 <= 0) goto L635
            goto L679
        L635:
            int r5 = java.lang.Math.max(r10, r11)
            if (r35 == 0) goto L671
            r14 = 1073741824(0x40000000, float:2.0)
            if (r7 == r14) goto L671
            r7 = 0
        L640:
            if (r7 >= r6) goto L671
            android.view.View r10 = r0.getChildAt(r7)
            if (r10 == 0) goto L66e
            int r11 = r10.getVisibility()
            r14 = 8
            if (r11 != r14) goto L651
            goto L66e
        L651:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            zr0 r11 = (p000.zr0) r11
            float r11 = r11.weight
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 <= 0) goto L66e
            r14 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r14)
            int r15 = r10.getMeasuredHeight()
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            r10.measure(r11, r15)
        L66e:
            int r7 = r7 + 1
            goto L640
        L671:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r21 = 0
            goto L7f6
        L679:
            float r3 = r0.f624
            int r9 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r9 <= 0) goto L681
            r28 = r3
        L681:
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
            r0.f623 = r3
            r3 = -1
            r9 = 0
        L698:
            if (r9 >= r6) goto L79e
            android.view.View r11 = r0.getChildAt(r9)
            if (r11 == 0) goto L6a8
            int r14 = r11.getVisibility()
            r15 = 8
            if (r14 != r15) goto L6b0
        L6a8:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r25 = -2
            goto L798
        L6b0:
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            zr0 r14 = (p000.zr0) r14
            float r15 = r14.weight
            int r17 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r17 <= 0) goto L712
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
            if (r15 != 0) goto L6f5
            r15 = 1073741824(0x40000000, float:2.0)
            if (r7 == r15) goto L6e9
            goto L6f7
        L6e9:
            if (r13 <= 0) goto L6ec
            goto L6ed
        L6ec:
            r13 = 0
        L6ed:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r11.measure(r13, r1)
            goto L707
        L6f5:
            r15 = 1073741824(0x40000000, float:2.0)
        L6f7:
            int r27 = r11.getMeasuredWidth()
            int r13 = r27 + r13
            if (r13 >= 0) goto L700
            r13 = 0
        L700:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r11.measure(r13, r1)
        L707:
            int r1 = r11.getMeasuredState()
            r1 = r1 & r17
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            goto L716
        L712:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L716:
            int r1 = r0.f623
            if (r16 == 0) goto L72a
            int r13 = r11.getMeasuredWidth()
            int r15 = r14.leftMargin
            int r13 = r13 + r15
            int r15 = r14.rightMargin
            int r13 = r13 + r15
            int r13 = r13 + r1
            r0.f623 = r13
        L727:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L73c
        L72a:
            int r13 = r11.getMeasuredWidth()
            int r13 = r13 + r1
            int r15 = r14.leftMargin
            int r13 = r13 + r15
            int r15 = r14.rightMargin
            int r13 = r13 + r15
            int r1 = java.lang.Math.max(r1, r13)
            r0.f623 = r1
            goto L727
        L73c:
            if (r8 == r1) goto L746
            int r1 = r14.height
            r15 = -1
            if (r1 != r15) goto L746
            r1 = r20
            goto L747
        L746:
            r1 = 0
        L747:
            int r13 = r14.topMargin
            int r15 = r14.bottomMargin
            int r13 = r13 + r15
            int r15 = r11.getMeasuredHeight()
            int r15 = r15 + r13
            int r3 = java.lang.Math.max(r3, r15)
            if (r1 == 0) goto L758
            goto L759
        L758:
            r13 = r15
        L759:
            int r1 = java.lang.Math.max(r10, r13)
            if (r29 == 0) goto L767
            int r10 = r14.height
            r13 = -1
            if (r10 != r13) goto L768
            r10 = r20
            goto L769
        L767:
            r13 = -1
        L768:
            r10 = 0
        L769:
            if (r34 == 0) goto L793
            int r11 = r11.getBaseline()
            if (r11 == r13) goto L793
            int r13 = r14.gravity
            if (r13 >= 0) goto L777
            int r13 = r0.f622
        L777:
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
            goto L795
        L793:
            r25 = -2
        L795:
            r29 = r10
            r10 = r1
        L798:
            int r9 = r9 + 1
            r1 = r22
            goto L698
        L79e:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r1 = r0.f623
            int r5 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r7 = r7 + r5
            int r7 = r7 + r1
            r0.f623 = r7
            r1 = r31[r20]
            r15 = -1
            if (r1 != r15) goto L7c7
            r21 = 0
            r5 = r31[r21]
            if (r5 != r15) goto L7c7
            r5 = r31[r30]
            if (r5 != r15) goto L7c7
            r5 = r31[r24]
            if (r5 == r15) goto L7c4
            goto L7c7
        L7c4:
            r21 = 0
            goto L7f5
        L7c7:
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
        L7f5:
            r5 = r10
        L7f6:
            if (r29 != 0) goto L7fd
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == r1) goto L7fd
            r3 = r5
        L7fd:
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
            if (r19 == 0) goto L85c
            int r1 = r0.getMeasuredHeight()
            r13 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r13)
            r9 = r21
        L82a:
            if (r9 >= r6) goto L85c
            android.view.View r1 = r0.getChildAt(r9)
            int r3 = r1.getVisibility()
            r11 = 8
            if (r3 == r11) goto L854
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r7 = r3
            zr0 r7 = (p000.zr0) r7
            int r3 = r7.height
            r15 = -1
            if (r3 != r15) goto L855
            int r8 = r7.width
            int r3 = r1.getMeasuredWidth()
            r7.width = r3
            r3 = 0
            r5 = 0
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r7.width = r8
            goto L855
        L854:
            r15 = -1
        L855:
            int r9 = r9 + 1
            r0 = r38
            r2 = r39
            goto L82a
        L85c:
            return
    }

    public void setBaselineAligned(boolean r1) {
            r0 = this;
            r0.f618 = r1
            return
    }

    public void setBaselineAlignedChildIndex(int r3) {
            r2 = this;
            if (r3 < 0) goto Lb
            int r0 = r2.getChildCount()
            if (r3 >= r0) goto Lb
            r2.f619 = r3
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
            android.graphics.drawable.Drawable r0 = r2.f628
            if (r3 != r0) goto L5
            return
        L5:
            r2.f628 = r3
            r0 = 0
            if (r3 == 0) goto L17
            int r1 = r3.getIntrinsicWidth()
            r2.f629 = r1
            int r1 = r3.getIntrinsicHeight()
            r2.f630 = r1
            goto L1b
        L17:
            r2.f629 = r0
            r2.f630 = r0
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
            r0.f632 = r1
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.f622
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
            r1.f622 = r2
            r1.requestLayout()
        L19:
            return
    }

    public void setHorizontalGravity(int r3) {
            r2 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            int r1 = r2.f622
            r0 = r0 & r1
            if (r0 == r3) goto L13
            r0 = -8388616(0xffffffffff7ffff8, float:-3.402822E38)
            r0 = r0 & r1
            r3 = r3 | r0
            r2.f622 = r3
            r2.requestLayout()
        L13:
            return
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
            r0 = this;
            r0.f625 = r1
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            int r0 = r1.f621
            if (r0 == r2) goto L9
            r1.f621 = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setShowDividers(int r2) {
            r1 = this;
            int r0 = r1.f631
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.f631 = r2
            return
    }

    public void setVerticalGravity(int r3) {
            r2 = this;
            r3 = r3 & 112(0x70, float:1.57E-43)
            int r0 = r2.f622
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 == r3) goto L10
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r3 = r3 | r0
            r2.f622 = r3
            r2.requestLayout()
        L10:
            return
    }

    public void setWeightSum(float r2) {
            r1 = this;
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            r1.f624 = r2
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final void m275(android.graphics.Canvas r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f628
            int r1 = r4.getPaddingLeft()
            int r2 = r4.f632
            int r1 = r1 + r2
            int r2 = r4.getWidth()
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r4.f632
            int r2 = r2 - r3
            int r3 = r4.f630
            int r3 = r3 + r6
            r0.setBounds(r1, r6, r2, r3)
            android.graphics.drawable.Drawable r4 = r4.f628
            r4.draw(r5)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m276(android.graphics.Canvas r6, int r7) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f628
            int r1 = r5.getPaddingTop()
            int r2 = r5.f632
            int r1 = r1 + r2
            int r2 = r5.f629
            int r2 = r2 + r7
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.f632
            int r3 = r3 - r4
            r0.setBounds(r7, r1, r2, r3)
            android.graphics.drawable.Drawable r5 = r5.f628
            r5.draw(r6)
            return
    }

    /* JADX INFO: renamed from: ε */
    public p000.zr0 mo263() {
            r2 = this;
            int r2 = r2.f621
            r0 = -2
            if (r2 != 0) goto Lb
            zr0 r2 = new zr0
            r2.<init>(r0, r0)
            return r2
        Lb:
            r1 = 1
            if (r2 != r1) goto L15
            zr0 r2 = new zr0
            r1 = -1
            r2.<init>(r1, r0)
            return r2
        L15:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ζ */
    public p000.zr0 mo264(android.util.AttributeSet r2) {
            r1 = this;
            zr0 r0 = new zr0
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public p000.zr0 mo265(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof p000.zr0
            if (r0 == 0) goto Lc
            zr0 r0 = new zr0
            zr0 r1 = (p000.zr0) r1
            r0.<init>(r1)
            return r0
        Lc:
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            zr0 r0 = new zr0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        L18:
            zr0 r0 = new zr0
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public final boolean m277(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto Lb
            int r4 = r4.f631
            r4 = r4 & r1
            if (r4 == 0) goto La
            return r1
        La:
            return r0
        Lb:
            int r2 = r4.getChildCount()
            int r3 = r4.f631
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
}
