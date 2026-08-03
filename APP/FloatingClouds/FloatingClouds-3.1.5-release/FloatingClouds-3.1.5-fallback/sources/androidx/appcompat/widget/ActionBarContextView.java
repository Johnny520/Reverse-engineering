package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends a.AbstractC0326q {
    public java.lang.CharSequence i;
    public java.lang.CharSequence j;
    public android.view.View k;
    public android.view.View l;
    public android.view.View m;
    public android.widget.LinearLayout n;
    public android.widget.TextView o;
    public android.widget.TextView p;
    public final int q;
    public final int r;
    public boolean s;
    public final int t;

    public class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.P f831a;

        public a(a.P r1) {
                r0 = this;
                r0.<init>()
                r0.f831a = r1
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r1) {
                r0 = this;
                a.P r1 = r0.f831a
                r1.c()
                return
        }
    }

    public ActionBarContextView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            int r0 = androidx.appcompat.R.attr.actionModeStyle
            r3.<init>(r4, r5, r0)
            int[] r1 = androidx.appcompat.R.styleable.ActionMode
            r2 = 0
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            int r0 = androidx.appcompat.R.styleable.ActionMode_background
            boolean r1 = r5.hasValue(r0)
            if (r1 == 0) goto L1f
            int r1 = r5.getResourceId(r0, r2)
            if (r1 == 0) goto L1f
            android.graphics.drawable.Drawable r4 = a.C0435w1.A(r4, r1)
            goto L23
        L1f:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r0)
        L23:
            r3.setBackground(r4)
            int r4 = androidx.appcompat.R.styleable.ActionMode_titleTextStyle
            int r4 = r5.getResourceId(r4, r2)
            r3.q = r4
            int r4 = androidx.appcompat.R.styleable.ActionMode_subtitleTextStyle
            int r4 = r5.getResourceId(r4, r2)
            r3.r = r4
            int r4 = androidx.appcompat.R.styleable.ActionMode_height
            int r4 = r5.getLayoutDimension(r4, r2)
            r3.e = r4
            int r4 = androidx.appcompat.R.styleable.ActionMode_closeItemLayout
            int r0 = androidx.appcompat.R.layout.abc_action_mode_close_item_material
            int r4 = r5.getResourceId(r4, r0)
            r3.t = r4
            r5.recycle()
            return
    }

    public final void f(a.P r6) {
            r5 = this;
            android.view.View r0 = r5.k
            r1 = 0
            if (r0 != 0) goto L19
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.t
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.k = r0
            r5.addView(r0)
            goto L24
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L24
            android.view.View r0 = r5.k
            r5.addView(r0)
        L24:
            android.view.View r0 = r5.k
            int r2 = androidx.appcompat.R.id.action_mode_close_button
            android.view.View r0 = r0.findViewById(r2)
            r5.l = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6)
            r0.setOnClickListener(r2)
            androidx.appcompat.view.menu.f r6 = r6.e()
            androidx.appcompat.widget.a r0 = r5.d
            if (r0 == 0) goto L50
            r0.f()
            androidx.appcompat.widget.a$a r0 = r0.t
            if (r0 == 0) goto L50
            boolean r2 = r0.b()
            if (r2 == 0) goto L50
            a.eb r0 = r0.i
            r0.dismiss()
        L50:
            androidx.appcompat.widget.a r0 = new androidx.appcompat.widget.a
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.d = r0
            r2 = 1
            r0.l = r2
            r0.m = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            androidx.appcompat.widget.a r2 = r5.d
            android.content.Context r3 = r5.b
            r6.b(r2, r3)
            androidx.appcompat.widget.a r6 = r5.d
            androidx.appcompat.view.menu.k r2 = r6.h
            if (r2 != 0) goto L88
            android.view.LayoutInflater r3 = r6.d
            int r4 = r6.f
            android.view.View r1 = r3.inflate(r4, r5, r1)
            androidx.appcompat.view.menu.k r1 = (androidx.appcompat.view.menu.k) r1
            r6.h = r1
            androidx.appcompat.view.menu.f r3 = r6.c
            r1.c(r3)
            r6.g()
        L88:
            androidx.appcompat.view.menu.k r1 = r6.h
            if (r2 == r1) goto L92
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L92:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.c = r1
            r6 = 0
            r1.setBackground(r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.c
            r5.addView(r6, r0)
            return
    }

    public final void g() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.n
            if (r0 != 0) goto L4f
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.appcompat.R.layout.abc_action_bar_title_item
            r0.inflate(r1, r6)
            int r0 = r6.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.n = r0
            int r1 = androidx.appcompat.R.id.action_bar_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.o = r0
            android.widget.LinearLayout r0 = r6.n
            int r1 = androidx.appcompat.R.id.action_bar_subtitle
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.p = r0
            int r0 = r6.q
            if (r0 == 0) goto L42
            android.widget.TextView r1 = r6.o
            android.content.Context r2 = r6.getContext()
            r1.setTextAppearance(r2, r0)
        L42:
            int r0 = r6.r
            if (r0 == 0) goto L4f
            android.widget.TextView r1 = r6.p
            android.content.Context r2 = r6.getContext()
            r1.setTextAppearance(r2, r0)
        L4f:
            android.widget.TextView r0 = r6.o
            java.lang.CharSequence r1 = r6.i
            r0.setText(r1)
            android.widget.TextView r0 = r6.p
            java.lang.CharSequence r1 = r6.j
            r0.setText(r1)
            java.lang.CharSequence r0 = r6.i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.CharSequence r1 = r6.j
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            android.widget.TextView r2 = r6.p
            r3 = 8
            r4 = 0
            if (r1 != 0) goto L72
            r5 = r4
            goto L73
        L72:
            r5 = r3
        L73:
            r2.setVisibility(r5)
            android.widget.LinearLayout r2 = r6.n
            if (r0 == 0) goto L7c
            if (r1 != 0) goto L7d
        L7c:
            r3 = r4
        L7d:
            r2.setVisibility(r3)
            android.widget.LinearLayout r0 = r6.n
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L8d
            android.widget.LinearLayout r0 = r6.n
            r6.addView(r0)
        L8d:
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // a.AbstractC0326q
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
            r1 = this;
            int r0 = super.getAnimatedVisibility()
            return r0
    }

    @Override // a.AbstractC0326q
    public /* bridge */ /* synthetic */ int getContentHeight() {
            r1 = this;
            int r0 = super.getContentHeight()
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.j
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.i
            return r0
    }

    public final void h() {
            r2 = this;
            r2.removeAllViews()
            r0 = 0
            r2.m = r0
            r2.c = r0
            r2.d = r0
            android.view.View r1 = r2.l
            if (r1 == 0) goto L11
            r1.setOnClickListener(r0)
        L11:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.a r0 = r2.d
            if (r0 == 0) goto L1b
            r0.f()
            androidx.appcompat.widget.a r0 = r2.d
            androidx.appcompat.widget.a$a r0 = r0.t
            if (r0 == 0) goto L1b
            boolean r1 = r0.b()
            if (r1 == 0) goto L1b
            a.eb r0 = r0.i
            r0.dismiss()
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
            android.view.View r8 = r5.k
            r3 = 8
            if (r8 == 0) goto L5c
            int r8 = r8.getVisibility()
            if (r8 == r3) goto L5c
            android.view.View r8 = r5.k
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
            android.view.View r4 = r5.k
            int r4 = a.AbstractC0326q.d(r4, r1, r2, r10, r6)
            int r4 = r4 + r1
            if (r6 == 0) goto L5a
            int r4 = r4 - r8
        L58:
            r1 = r4
            goto L5c
        L5a:
            int r4 = r4 + r8
            goto L58
        L5c:
            android.widget.LinearLayout r8 = r5.n
            if (r8 == 0) goto L71
            android.view.View r4 = r5.m
            if (r4 != 0) goto L71
            int r8 = r8.getVisibility()
            if (r8 == r3) goto L71
            android.widget.LinearLayout r8 = r5.n
            int r8 = a.AbstractC0326q.d(r8, r1, r2, r10, r6)
            int r1 = r1 + r8
        L71:
            android.view.View r8 = r5.m
            if (r8 == 0) goto L78
            a.AbstractC0326q.d(r8, r1, r2, r10, r6)
        L78:
            if (r6 == 0) goto L7f
            int r7 = r5.getPaddingLeft()
            goto L86
        L7f:
            int r9 = r9 - r7
            int r7 = r5.getPaddingRight()
            int r7 = r9 - r7
        L86:
            androidx.appcompat.widget.ActionMenuView r8 = r5.c
            if (r8 == 0) goto L8e
            r6 = r6 ^ r0
            a.AbstractC0326q.d(r8, r7, r2, r10, r6)
        L8e:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r11, int r12) {
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto Lf6
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            if (r0 == 0) goto Le2
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            int r0 = r10.e
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
            android.view.View r6 = r10.k
            if (r6 == 0) goto L4d
            int r12 = a.AbstractC0326q.c(r6, r12, r5)
            android.view.View r6 = r10.k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r7 = r6.leftMargin
            int r6 = r6.rightMargin
            int r7 = r7 + r6
            int r12 = r12 - r7
        L4d:
            androidx.appcompat.widget.ActionMenuView r6 = r10.c
            if (r6 == 0) goto L5d
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != r10) goto L5d
            androidx.appcompat.widget.ActionMenuView r6 = r10.c
            int r12 = a.AbstractC0326q.c(r6, r12, r5)
        L5d:
            android.widget.LinearLayout r6 = r10.n
            r7 = 0
            if (r6 == 0) goto L91
            android.view.View r8 = r10.m
            if (r8 != 0) goto L91
            boolean r8 = r10.s
            if (r8 == 0) goto L8d
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            android.widget.LinearLayout r8 = r10.n
            r8.measure(r6, r5)
            android.widget.LinearLayout r5 = r10.n
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
            android.widget.LinearLayout r5 = r10.n
            if (r6 == 0) goto L87
            r6 = r7
            goto L89
        L87:
            r6 = 8
        L89:
            r5.setVisibility(r6)
            goto L91
        L8d:
            int r12 = a.AbstractC0326q.c(r6, r12, r5)
        L91:
            android.view.View r5 = r10.m
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
            android.view.View r4 = r10.m
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r9)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r4.measure(r12, r1)
        Lc0:
            int r12 = r10.e
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
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.Class r12 = r10.getClass()
            java.lang.String r12 = r12.getSimpleName()
            java.lang.String r0 = " can only be used with android:layout_height=\"wrap_content\""
            java.lang.String r12 = r12.concat(r0)
            r11.<init>(r12)
            throw r11
        Lf6:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.Class r12 = r10.getClass()
            java.lang.String r12 = r12.getSimpleName()
            java.lang.String r0 = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"
            java.lang.String r12 = r12.concat(r0)
            r11.<init>(r12)
            throw r11
    }

    @Override // a.AbstractC0326q
    public void setContentHeight(int r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setCustomView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.m
            if (r0 == 0) goto L7
            r1.removeView(r0)
        L7:
            r1.m = r2
            if (r2 == 0) goto L15
            android.widget.LinearLayout r0 = r1.n
            if (r0 == 0) goto L15
            r1.removeView(r0)
            r0 = 0
            r1.n = r0
        L15:
            if (r2 == 0) goto L1a
            r1.addView(r2)
        L1a:
            r1.requestLayout()
            return
    }

    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.j = r1
            r0.g()
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.i = r1
            r0.g()
            a.C0414ug.k(r0, r1)
            return
    }

    public void setTitleOptional(boolean r2) {
            r1 = this;
            boolean r0 = r1.s
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.s = r2
            return
    }

    @Override // a.AbstractC0326q, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
