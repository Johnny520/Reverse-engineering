package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.AbsActionBarView {

    /* JADX INFO: renamed from: ν */
    public java.lang.CharSequence f474;

    /* JADX INFO: renamed from: ξ */
    public java.lang.CharSequence f475;

    /* JADX INFO: renamed from: ο */
    public android.view.View f476;

    /* JADX INFO: renamed from: π */
    public android.view.View f477;

    /* JADX INFO: renamed from: ρ */
    public android.view.View f478;

    /* JADX INFO: renamed from: σ */
    public android.widget.LinearLayout f479;

    /* JADX INFO: renamed from: τ */
    public android.widget.TextView f480;

    /* JADX INFO: renamed from: υ */
    public android.widget.TextView f481;

    /* JADX INFO: renamed from: φ */
    public final int f482;

    /* JADX INFO: renamed from: χ */
    public final int f483;

    /* JADX INFO: renamed from: ψ */
    public boolean f484;

    /* JADX INFO: renamed from: ω */
    public final int f485;

    public ActionBarContextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968604(0x7f04001c, float:1.7545866E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public ActionBarContextView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            int[] r0 = p000.kk1.f5970
            r1 = 0
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0, r5, r1)
            boolean r5 = r4.hasValue(r1)
            if (r5 == 0) goto L1b
            int r5 = r4.getResourceId(r1, r1)
            if (r5 == 0) goto L1b
            android.graphics.drawable.Drawable r3 = p000.ln0.m3603(r3, r5)
            goto L1f
        L1b:
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r1)
        L1f:
            r2.setBackground(r3)
            r3 = 5
            int r3 = r4.getResourceId(r3, r1)
            r2.f482 = r3
            r3 = 4
            int r3 = r4.getResourceId(r3, r1)
            r2.f483 = r3
            r3 = 3
            int r3 = r4.getLayoutDimension(r3, r1)
            r2.f460 = r3
            r3 = 2
            r5 = 2131492869(0x7f0c0005, float:1.8609202E38)
            int r3 = r4.getResourceId(r3, r5)
            r2.f485 = r3
            r4.recycle()
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r0 = -1
            r1 = -2
            r2.<init>(r0, r1)
            return r2
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    public int getAnimatedVisibility() {
            r1 = this;
            x92 r0 = r1.f461
            if (r0 == 0) goto L9
            androidx.appcompat.widget.α r1 = r1.f456
            int r1 = r1.f784
            return r1
        L9:
            int r1 = r1.getVisibility()
            return r1
    }

    public int getContentHeight() {
            r0 = this;
            int r0 = r0.f460
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f475
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f474
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.γ r0 = r1.f459
            if (r0 == 0) goto L1b
            r0.m323()
            androidx.appcompat.widget.γ r1 = r1.f459
            ｑ r1 = r1.f809
            if (r1 == 0) goto L1b
            boolean r0 = r1.m5039()
            if (r0 == 0) goto L1b
            oz0 r1 = r1.f9171
            r1.dismiss()
        L1b:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            int r6 = r5.getLayoutDirection()
            r0 = 1
            if (r6 != r0) goto L9
            r6 = r0
            goto La
        L9:
            r6 = 0
        La:
            if (r6 == 0) goto L14
            int r1 = r9 - r7
            int r2 = r5.getPaddingRight()
            int r1 = r1 - r2
            goto L18
        L14:
            int r1 = r5.getPaddingLeft()
        L18:
            int r2 = r5.getPaddingTop()
            int r10 = r10 - r8
            int r8 = r5.getPaddingTop()
            int r10 = r10 - r8
            int r8 = r5.getPaddingBottom()
            int r10 = r10 - r8
            android.view.View r8 = r5.f476
            r3 = 8
            if (r8 == 0) goto L5a
            int r8 = r8.getVisibility()
            if (r8 == r3) goto L5a
            android.view.View r8 = r5.f476
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            if (r6 == 0) goto L40
            int r4 = r8.rightMargin
            goto L42
        L40:
            int r4 = r8.leftMargin
        L42:
            if (r6 == 0) goto L47
            int r8 = r8.leftMargin
            goto L49
        L47:
            int r8 = r8.rightMargin
        L49:
            if (r6 == 0) goto L4d
            int r1 = r1 - r4
            goto L4e
        L4d:
            int r1 = r1 + r4
        L4e:
            android.view.View r4 = r5.f476
            int r4 = androidx.appcompat.widget.AbsActionBarView.m242(r1, r2, r10, r4, r6)
            int r1 = r1 + r4
            if (r6 == 0) goto L59
            int r1 = r1 - r8
            goto L5a
        L59:
            int r1 = r1 + r8
        L5a:
            android.widget.LinearLayout r8 = r5.f479
            if (r8 == 0) goto L6f
            android.view.View r4 = r5.f478
            if (r4 != 0) goto L6f
            int r8 = r8.getVisibility()
            if (r8 == r3) goto L6f
            android.widget.LinearLayout r8 = r5.f479
            int r8 = androidx.appcompat.widget.AbsActionBarView.m242(r1, r2, r10, r8, r6)
            int r1 = r1 + r8
        L6f:
            android.view.View r8 = r5.f478
            if (r8 == 0) goto L76
            androidx.appcompat.widget.AbsActionBarView.m242(r1, r2, r10, r8, r6)
        L76:
            if (r6 == 0) goto L7d
            int r7 = r5.getPaddingLeft()
            goto L84
        L7d:
            int r9 = r9 - r7
            int r7 = r5.getPaddingRight()
            int r7 = r9 - r7
        L84:
            androidx.appcompat.widget.ActionMenuView r5 = r5.f458
            if (r5 == 0) goto L8c
            r6 = r6 ^ r0
            androidx.appcompat.widget.AbsActionBarView.m242(r7, r2, r10, r5, r6)
        L8c:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r11, int r12) {
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto Lf4
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            if (r0 == 0) goto Le2
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            int r0 = r10.f460
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            int r0 = android.view.View.MeasureSpec.getSize(r12)
        L1b:
            int r12 = r10.getPaddingTop()
            int r2 = r10.getPaddingBottom()
            int r2 = r2 + r12
            int r12 = r10.getPaddingLeft()
            int r12 = r11 - r12
            int r3 = r10.getPaddingRight()
            int r12 = r12 - r3
            int r3 = r0 - r2
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            android.view.View r6 = r10.f476
            if (r6 == 0) goto L4d
            int r12 = androidx.appcompat.widget.AbsActionBarView.m241(r6, r12, r5)
            android.view.View r6 = r10.f476
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r7 = r6.leftMargin
            int r6 = r6.rightMargin
            int r7 = r7 + r6
            int r12 = r12 - r7
        L4d:
            androidx.appcompat.widget.ActionMenuView r6 = r10.f458
            if (r6 == 0) goto L5d
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != r10) goto L5d
            androidx.appcompat.widget.ActionMenuView r6 = r10.f458
            int r12 = androidx.appcompat.widget.AbsActionBarView.m241(r6, r12, r5)
        L5d:
            android.widget.LinearLayout r6 = r10.f479
            r7 = 0
            if (r6 == 0) goto L91
            android.view.View r8 = r10.f478
            if (r8 != 0) goto L91
            boolean r8 = r10.f484
            if (r8 == 0) goto L8d
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            android.widget.LinearLayout r8 = r10.f479
            r8.measure(r6, r5)
            android.widget.LinearLayout r5 = r10.f479
            int r5 = r5.getMeasuredWidth()
            if (r5 > r12) goto L7d
            r6 = 1
            goto L7e
        L7d:
            r6 = r7
        L7e:
            if (r6 == 0) goto L81
            int r12 = r12 - r5
        L81:
            android.widget.LinearLayout r5 = r10.f479
            if (r6 == 0) goto L87
            r6 = r7
            goto L89
        L87:
            r6 = 8
        L89:
            r5.setVisibility(r6)
            goto L91
        L8d:
            int r12 = androidx.appcompat.widget.AbsActionBarView.m241(r6, r12, r5)
        L91:
            android.view.View r5 = r10.f478
            if (r5 == 0) goto Lc0
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            int r6 = r5.width
            r8 = -2
            if (r6 == r8) goto La0
            r9 = r1
            goto La1
        La0:
            r9 = r4
        La1:
            if (r6 < 0) goto La7
            int r12 = java.lang.Math.min(r6, r12)
        La7:
            int r5 = r5.height
            if (r5 == r8) goto Lac
            goto Lad
        Lac:
            r1 = r4
        Lad:
            if (r5 < 0) goto Lb3
            int r3 = java.lang.Math.min(r5, r3)
        Lb3:
            android.view.View r4 = r10.f478
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r9)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r4.measure(r12, r1)
        Lc0:
            int r12 = r10.f460
            if (r12 > 0) goto Lde
            int r12 = r10.getChildCount()
            r0 = r7
        Lc9:
            if (r7 >= r12) goto Lda
            android.view.View r1 = r10.getChildAt(r7)
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r2
            if (r1 <= r0) goto Ld7
            r0 = r1
        Ld7:
            int r7 = r7 + 1
            goto Lc9
        Lda:
            r10.setMeasuredDimension(r11, r0)
            return
        Lde:
            r10.setMeasuredDimension(r11, r0)
            return
        Le2:
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            java.lang.String r11 = " can only be used with android:layout_height=\"wrap_content\""
            java.lang.String r10 = r10.concat(r11)
            p000.C1080.m7279(r10)
            return
        Lf4:
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            java.lang.String r11 = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"
            java.lang.String r10 = r10.concat(r11)
            p000.C1080.m7279(r10)
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int r1) {
            r0 = this;
            r0.f460 = r1
            return
    }

    public void setCustomView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.f478
            if (r0 == 0) goto L7
            r1.removeView(r0)
        L7:
            r1.f478 = r2
            if (r2 == 0) goto L15
            android.widget.LinearLayout r0 = r1.f479
            if (r0 == 0) goto L15
            r1.removeView(r0)
            r0 = 0
            r1.f479 = r0
        L15:
            if (r2 == 0) goto L1a
            r1.addView(r2)
        L1a:
            r1.requestLayout()
            return
    }

    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f475 = r1
            r0.m245()
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f474 = r1
            r0.m245()
            p000.b92.m829(r0, r1)
            return
    }

    public void setTitleOptional(boolean r2) {
            r1 = this;
            boolean r0 = r1.f484
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.f484 = r2
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final void m244(p000.AbstractC1153 r6) {
            r5 = this;
            android.view.View r0 = r5.f476
            r1 = 0
            if (r0 != 0) goto L19
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.f485
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.f476 = r0
            r5.addView(r0)
            goto L24
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L24
            android.view.View r0 = r5.f476
            r5.addView(r0)
        L24:
            android.view.View r0 = r5.f476
            r2 = 2131296310(0x7f090036, float:1.8210533E38)
            android.view.View r0 = r0.findViewById(r2)
            r5.f477 = r0
            ｈ r2 = new ｈ
            r2.<init>(r1, r6)
            r0.setOnClickListener(r2)
            iz0 r6 = r6.mo5434()
            androidx.appcompat.widget.γ r0 = r5.f459
            if (r0 == 0) goto L51
            r0.m323()
            ｑ r0 = r0.f809
            if (r0 == 0) goto L51
            boolean r2 = r0.m5039()
            if (r2 == 0) goto L51
            oz0 r0 = r0.f9171
            r0.dismiss()
        L51:
            androidx.appcompat.widget.γ r0 = new androidx.appcompat.widget.γ
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.f459 = r0
            r2 = 1
            r0.f801 = r2
            r0.f802 = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            androidx.appcompat.widget.γ r2 = r5.f459
            android.content.Context r3 = r5.f457
            r6.m2830(r2, r3)
            androidx.appcompat.widget.γ r6 = r5.f459
            wz0 r2 = r6.f797
            if (r2 != 0) goto L89
            android.view.LayoutInflater r3 = r6.f793
            int r4 = r6.f795
            android.view.View r1 = r3.inflate(r4, r5, r1)
            wz0 r1 = (p000.wz0) r1
            r6.f797 = r1
            iz0 r3 = r6.f792
            r1.mo238(r3)
            r6.mo326()
        L89:
            wz0 r1 = r6.f797
            if (r2 == r1) goto L93
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L93:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.f458 = r1
            r6 = 0
            r1.setBackground(r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.f458
            r5.addView(r6, r0)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m245() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.f479
            if (r0 != 0) goto L51
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131492864(0x7f0c0000, float:1.8609192E38)
            r0.inflate(r1, r6)
            int r0 = r6.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.f479 = r0
            r1 = 2131296301(0x7f09002d, float:1.8210515E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f480 = r0
            android.widget.LinearLayout r0 = r6.f479
            r1 = 2131296300(0x7f09002c, float:1.8210513E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f481 = r0
            int r0 = r6.f482
            if (r0 == 0) goto L44
            android.widget.TextView r1 = r6.f480
            android.content.Context r2 = r6.getContext()
            r1.setTextAppearance(r2, r0)
        L44:
            int r0 = r6.f483
            if (r0 == 0) goto L51
            android.widget.TextView r1 = r6.f481
            android.content.Context r2 = r6.getContext()
            r1.setTextAppearance(r2, r0)
        L51:
            android.widget.TextView r0 = r6.f480
            java.lang.CharSequence r1 = r6.f474
            r0.setText(r1)
            android.widget.TextView r0 = r6.f481
            java.lang.CharSequence r1 = r6.f475
            r0.setText(r1)
            java.lang.CharSequence r0 = r6.f474
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.CharSequence r1 = r6.f475
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            android.widget.TextView r2 = r6.f481
            r3 = 8
            r4 = 0
            if (r1 != 0) goto L74
            r5 = r4
            goto L75
        L74:
            r5 = r3
        L75:
            r2.setVisibility(r5)
            android.widget.LinearLayout r2 = r6.f479
            if (r0 == 0) goto L7e
            if (r1 != 0) goto L7f
        L7e:
            r3 = r4
        L7f:
            r2.setVisibility(r3)
            android.widget.LinearLayout r0 = r6.f479
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L8f
            android.widget.LinearLayout r0 = r6.f479
            r6.addView(r0)
        L8f:
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m246() {
            r1 = this;
            r1.removeAllViews()
            r0 = 0
            r1.f478 = r0
            r1.f458 = r0
            r1.f459 = r0
            android.view.View r1 = r1.f477
            if (r1 == 0) goto L11
            r1.setOnClickListener(r0)
        L11:
            return
    }

    /* JADX INFO: renamed from: θ */
    public final p000.x92 m247(int r4, long r5) {
            r3 = this;
            x92 r0 = r3.f461
            if (r0 == 0) goto L7
            r0.m6541()
        L7:
            androidx.appcompat.widget.α r0 = r3.f456
            r1 = 0
            if (r4 != 0) goto L2b
            int r2 = r3.getVisibility()
            if (r2 == 0) goto L15
            r3.setAlpha(r1)
        L15:
            x92 r3 = p000.b92.m823(r3)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.m6540(r1)
            r3.m6542(r5)
            androidx.appcompat.widget.AbsActionBarView r5 = r0.f785
            r5.f461 = r3
            r0.f784 = r4
            r3.m6543(r0)
            return r3
        L2b:
            x92 r3 = p000.b92.m823(r3)
            r3.m6540(r1)
            r3.m6542(r5)
            androidx.appcompat.widget.AbsActionBarView r5 = r0.f785
            r5.f461 = r3
            r0.f784 = r4
            r3.m6543(r0)
            return r3
    }

    /* JADX INFO: renamed from: ι */
    public final void m248() {
            r0 = this;
            androidx.appcompat.widget.γ r0 = r0.f459
            if (r0 == 0) goto L7
            r0.m331()
        L7:
            return
    }
}
