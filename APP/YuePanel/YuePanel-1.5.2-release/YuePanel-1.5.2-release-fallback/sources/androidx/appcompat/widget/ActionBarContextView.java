package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class ActionBarContextView extends Yue.AbstractC0022 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public java.lang.CharSequence f25531;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public java.lang.CharSequence f25532;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public android.view.View f25533;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public android.view.View f25534;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public android.view.View f25535;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public android.widget.LinearLayout f25536;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public android.widget.TextView f25537;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public android.widget.TextView f25538;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public int f25539;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public int f25540;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public boolean f25541;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int f25542;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContextView$ۥ, reason: contains not printable characters */
    public class ViewOnClickListenerC7361 implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0181 f25543;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.ActionBarContextView f25544;

        public ViewOnClickListenerC7361(androidx.appcompat.widget.ActionBarContextView r1, Yue.AbstractC0181 r2) {
                r0 = this;
                r0.f25544 = r1
                r0.f25543 = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                Yue.ۥ۟۟ۧ۟ r1 = r0.f25543
                r1.mo1001()
                return
        }
    }

    public ActionBarContextView(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContextView(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5058.C5060.f16580
            r1.<init>(r2, r3, r0)
            return
    }

    public ActionBarContextView(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4544 android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            int[] r0 = Yue.C5058.C5071.f17624
            r1 = 0
            Yue.ۥۢۡۥۦ r3 = Yue.C6264.m23339(r3, r4, r0, r5, r1)
            int r4 = Yue.C5058.C5071.f17625
            android.graphics.drawable.Drawable r4 = r3.m23347(r4)
            r2.setBackground(r4)
            int r4 = Yue.C5058.C5071.f17630
            int r4 = r3.m23360(r4, r1)
            r2.f25539 = r4
            int r4 = Yue.C5058.C5071.f17629
            int r4 = r3.m23360(r4, r1)
            r2.f25540 = r4
            int r4 = Yue.C5058.C5071.f17628
            int r4 = r3.m23356(r4, r1)
            r2.f65 = r4
            int r4 = Yue.C5058.C5071.f17627
            int r5 = Yue.C5058.C5068.f17191
            int r4 = r3.m23360(r4, r5)
            r2.f25542 = r4
            r3.m23371()
            return
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // Yue.AbstractC0022
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
            r1 = this;
            int r0 = super.getAnimatedVisibility()
            return r0
    }

    @Override // Yue.AbstractC0022
    public /* bridge */ /* synthetic */ int getContentHeight() {
            r1 = this;
            int r0 = super.getContentHeight()
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f25532
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f25531
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.ۥ r0 = r1.f64
            if (r0 == 0) goto Lf
            r0.m28421()
            androidx.appcompat.widget.ۥ r0 = r1.f64
            r0.m28422()
        Lf:
            return
    }

    @Override // Yue.AbstractC0022, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onHoverEvent(r1)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            boolean r10 = Yue.C6928.m26811(r9)
            if (r10 == 0) goto Le
            int r0 = r13 - r11
            int r1 = r9.getPaddingRight()
            int r0 = r0 - r1
            goto L12
        Le:
            int r0 = r9.getPaddingLeft()
        L12:
            int r6 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r12 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r12 = r9.getPaddingBottom()
            int r12 = r14 - r12
            android.view.View r14 = r9.f25533
            r7 = 8
            if (r14 == 0) goto L58
            int r14 = r14.getVisibility()
            if (r14 == r7) goto L58
            android.view.View r14 = r9.f25533
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            if (r10 == 0) goto L3b
            int r1 = r14.rightMargin
            goto L3d
        L3b:
            int r1 = r14.leftMargin
        L3d:
            if (r10 == 0) goto L42
            int r14 = r14.leftMargin
            goto L44
        L42:
            int r14 = r14.rightMargin
        L44:
            int r8 = Yue.AbstractC0022.m286(r0, r1, r10)
            android.view.View r1 = r9.f25533
            r0 = r9
            r2 = r8
            r3 = r6
            r4 = r12
            r5 = r10
            int r0 = r0.m295(r1, r2, r3, r4, r5)
            int r8 = r8 + r0
            int r0 = Yue.AbstractC0022.m286(r8, r14, r10)
        L58:
            r14 = r0
            android.widget.LinearLayout r0 = r9.f25536
            if (r0 == 0) goto L73
            android.view.View r1 = r9.f25535
            if (r1 != 0) goto L73
            int r0 = r0.getVisibility()
            if (r0 == r7) goto L73
            android.widget.LinearLayout r1 = r9.f25536
            r0 = r9
            r2 = r14
            r3 = r6
            r4 = r12
            r5 = r10
            int r0 = r0.m295(r1, r2, r3, r4, r5)
            int r14 = r14 + r0
        L73:
            r2 = r14
            android.view.View r1 = r9.f25535
            if (r1 == 0) goto L7f
            r0 = r9
            r3 = r6
            r4 = r12
            r5 = r10
            r0.m295(r1, r2, r3, r4, r5)
        L7f:
            if (r10 == 0) goto L87
            int r11 = r9.getPaddingLeft()
            r3 = r11
            goto L8e
        L87:
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r13 = r13 - r11
            r3 = r13
        L8e:
            androidx.appcompat.widget.ActionMenuView r2 = r9.f63
            if (r2 == 0) goto L9b
            r10 = r10 ^ 1
            r1 = r9
            r4 = r6
            r5 = r12
            r6 = r10
            r1.m295(r2, r3, r4, r5, r6)
        L9b:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r11, int r12) {
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L101
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            if (r0 == 0) goto Le2
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            int r0 = r10.f65
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            int r0 = android.view.View.MeasureSpec.getSize(r12)
        L1b:
            int r12 = r10.getPaddingTop()
            int r2 = r10.getPaddingBottom()
            int r12 = r12 + r2
            int r2 = r10.getPaddingLeft()
            int r2 = r11 - r2
            int r3 = r10.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r0 - r12
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            android.view.View r6 = r10.f25533
            r7 = 0
            if (r6 == 0) goto L4e
            int r2 = r10.m294(r6, r2, r5, r7)
            android.view.View r6 = r10.f25533
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r8 = r6.leftMargin
            int r6 = r6.rightMargin
            int r8 = r8 + r6
            int r2 = r2 - r8
        L4e:
            androidx.appcompat.widget.ActionMenuView r6 = r10.f63
            if (r6 == 0) goto L5e
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != r10) goto L5e
            androidx.appcompat.widget.ActionMenuView r6 = r10.f63
            int r2 = r10.m294(r6, r2, r5, r7)
        L5e:
            android.widget.LinearLayout r6 = r10.f25536
            if (r6 == 0) goto L91
            android.view.View r8 = r10.f25535
            if (r8 != 0) goto L91
            boolean r8 = r10.f25541
            if (r8 == 0) goto L8d
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            android.widget.LinearLayout r8 = r10.f25536
            r8.measure(r6, r5)
            android.widget.LinearLayout r5 = r10.f25536
            int r5 = r5.getMeasuredWidth()
            if (r5 > r2) goto L7d
            r6 = 1
            goto L7e
        L7d:
            r6 = r7
        L7e:
            if (r6 == 0) goto L81
            int r2 = r2 - r5
        L81:
            android.widget.LinearLayout r5 = r10.f25536
            if (r6 == 0) goto L87
            r6 = r7
            goto L89
        L87:
            r6 = 8
        L89:
            r5.setVisibility(r6)
            goto L91
        L8d:
            int r2 = r10.m294(r6, r2, r5, r7)
        L91:
            android.view.View r5 = r10.f25535
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
            int r2 = java.lang.Math.min(r6, r2)
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
            android.view.View r4 = r10.f25535
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r9)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r4.measure(r2, r1)
        Lc0:
            int r1 = r10.f65
            if (r1 > 0) goto Lde
            int r0 = r10.getChildCount()
            r1 = r7
        Lc9:
            if (r7 >= r0) goto Lda
            android.view.View r2 = r10.getChildAt(r7)
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r12
            if (r2 <= r1) goto Ld7
            r1 = r2
        Ld7:
            int r7 = r7 + 1
            goto Lc9
        Lda:
            r10.setMeasuredDimension(r11, r1)
            goto Le1
        Lde:
            r10.setMeasuredDimension(r11, r0)
        Le1:
            return
        Le2:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r12.append(r0)
            java.lang.String r0 = " can only be used with android:layout_height=\"wrap_content\""
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L101:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r12.append(r0)
            java.lang.String r0 = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    @Override // Yue.AbstractC0022, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onTouchEvent(r1)
            return r1
    }

    @Override // Yue.AbstractC0022
    public void setContentHeight(int r1) {
            r0 = this;
            r0.f65 = r1
            return
    }

    public void setCustomView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.f25535
            if (r0 == 0) goto L7
            r1.removeView(r0)
        L7:
            r1.f25535 = r2
            if (r2 == 0) goto L15
            android.widget.LinearLayout r0 = r1.f25536
            if (r0 == 0) goto L15
            r1.removeView(r0)
            r0 = 0
            r1.f25536 = r0
        L15:
            if (r2 == 0) goto L1a
            r1.addView(r2)
        L1a:
            r1.requestLayout()
            return
    }

    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f25532 = r1
            r0.m28264()
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f25531 = r1
            r0.m28264()
            Yue.C6794.m26226(r0, r1)
            return
    }

    public void setTitleOptional(boolean r2) {
            r1 = this;
            boolean r0 = r1.f25541
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.f25541 = r2
            return
    }

    @Override // Yue.AbstractC0022, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0022
    /* JADX INFO: renamed from: ۥ۟۟ */
    public /* bridge */ /* synthetic */ void mo287(int r1) {
            r0 = this;
            super.mo287(r1)
            return
    }

    @Override // Yue.AbstractC0022
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public /* bridge */ /* synthetic */ boolean mo288() {
            r1 = this;
            boolean r0 = super.mo288()
            return r0
    }

    @Override // Yue.AbstractC0022
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public /* bridge */ /* synthetic */ void mo289() {
            r0 = this;
            super.mo289()
            return
    }

    @Override // Yue.AbstractC0022
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo290() {
            r1 = this;
            androidx.appcompat.widget.ۥ r0 = r1.f64
            if (r0 == 0) goto L9
            boolean r0 = r0.m28421()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0022
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public /* bridge */ /* synthetic */ boolean mo291() {
            r1 = this;
            boolean r0 = super.mo291()
            return r0
    }

    @Override // Yue.AbstractC0022
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo292() {
            r1 = this;
            androidx.appcompat.widget.ۥ r0 = r1.f64
            if (r0 == 0) goto L9
            boolean r0 = r0.m28424()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0022
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public /* bridge */ /* synthetic */ boolean mo293() {
            r1 = this;
            boolean r0 = super.mo293()
            return r0
    }

    @Override // Yue.AbstractC0022
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public /* bridge */ /* synthetic */ void mo296() {
            r0 = this;
            super.mo296()
            return
    }

    @Override // Yue.AbstractC0022
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public /* bridge */ /* synthetic */ Yue.C6904 mo297(int r1, long r2) {
            r0 = this;
            Yue.ۥۢۤۦۦ r1 = super.mo297(r1, r2)
            return r1
    }

    @Override // Yue.AbstractC0022
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo298() {
            r1 = this;
            androidx.appcompat.widget.ۥ r0 = r1.f64
            if (r0 == 0) goto L9
            boolean r0 = r0.m28433()
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m28262() {
            r1 = this;
            android.view.View r0 = r1.f25533
            if (r0 != 0) goto L7
            r1.m28266()
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m28263(Yue.AbstractC0181 r4) {
            r3 = this;
            android.view.View r0 = r3.f25533
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f25542
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f25533 = r0
            r3.addView(r0)
            goto L24
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L24
            android.view.View r0 = r3.f25533
            r3.addView(r0)
        L24:
            android.view.View r0 = r3.f25533
            int r1 = Yue.C5058.C5065.f17109
            android.view.View r0 = r0.findViewById(r1)
            r3.f25534 = r0
            androidx.appcompat.widget.ActionBarContextView$ۥ r1 = new androidx.appcompat.widget.ActionBarContextView$ۥ
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo1003()
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r4 = (androidx.appcompat.view.menu.C7343) r4
            androidx.appcompat.widget.ۥ r0 = r3.f64
            if (r0 == 0) goto L43
            r0.m28418()
        L43:
            androidx.appcompat.widget.ۥ r0 = new androidx.appcompat.widget.ۥ
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f64 = r0
            r1 = 1
            r0.m28431(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.ۥ r1 = r3.f64
            android.content.Context r2 = r3.f62
            r4.addMenuPresenter(r1, r2)
            androidx.appcompat.widget.ۥ r4 = r3.f64
            androidx.appcompat.view.menu.ۥ۟۟۟ۥ r4 = r4.getMenuView(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f63 = r4
            r1 = 0
            r4.setBackground(r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f63
            r3.addView(r4, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m28264() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.f25536
            if (r0 != 0) goto L53
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = Yue.C5058.C5068.f17186
            r0.inflate(r1, r6)
            int r0 = r6.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.f25536 = r0
            int r1 = Yue.C5058.C5065.f17103
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f25537 = r0
            android.widget.LinearLayout r0 = r6.f25536
            int r1 = Yue.C5058.C5065.f17102
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f25538 = r0
            int r0 = r6.f25539
            if (r0 == 0) goto L44
            android.widget.TextView r0 = r6.f25537
            android.content.Context r1 = r6.getContext()
            int r2 = r6.f25539
            r0.setTextAppearance(r1, r2)
        L44:
            int r0 = r6.f25540
            if (r0 == 0) goto L53
            android.widget.TextView r0 = r6.f25538
            android.content.Context r1 = r6.getContext()
            int r2 = r6.f25540
            r0.setTextAppearance(r1, r2)
        L53:
            android.widget.TextView r0 = r6.f25537
            java.lang.CharSequence r1 = r6.f25531
            r0.setText(r1)
            android.widget.TextView r0 = r6.f25538
            java.lang.CharSequence r1 = r6.f25532
            r0.setText(r1)
            java.lang.CharSequence r0 = r6.f25531
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.CharSequence r1 = r6.f25532
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r1 = r1 ^ 1
            android.widget.TextView r2 = r6.f25538
            r3 = 8
            r4 = 0
            if (r1 == 0) goto L7a
            r5 = r4
            goto L7b
        L7a:
            r5 = r3
        L7b:
            r2.setVisibility(r5)
            android.widget.LinearLayout r2 = r6.f25536
            if (r0 != 0) goto L84
            if (r1 == 0) goto L85
        L84:
            r3 = r4
        L85:
            r2.setVisibility(r3)
            android.widget.LinearLayout r0 = r6.f25536
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L95
            android.widget.LinearLayout r0 = r6.f25536
            r6.addView(r0)
        L95:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m28265() {
            r1 = this;
            boolean r0 = r1.f25541
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m28266() {
            r2 = this;
            r2.removeAllViews()
            r0 = 0
            r2.f25535 = r0
            r2.f63 = r0
            r2.f64 = r0
            android.view.View r1 = r2.f25534
            if (r1 == 0) goto L11
            r1.setOnClickListener(r0)
        L11:
            return
    }
}
