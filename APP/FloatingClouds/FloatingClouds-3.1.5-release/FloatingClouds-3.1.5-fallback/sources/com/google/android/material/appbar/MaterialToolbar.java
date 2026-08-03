package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends androidx.appcompat.widget.Toolbar {
    public static final int c0 = 0;
    public static final android.widget.ImageView.ScaleType[] d0 = null;
    public java.lang.Integer U;
    public boolean V;
    public boolean W;
    public android.widget.ImageView.ScaleType a0;
    public java.lang.Boolean b0;

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_Toolbar
            com.google.android.material.appbar.MaterialToolbar.c0 = r0
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_XY
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_START
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_CENTER
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_END
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
            android.widget.ImageView$ScaleType r8 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            android.widget.ImageView$ScaleType[] r0 = new android.widget.ImageView.ScaleType[]{r1, r2, r3, r4, r5, r6, r7, r8}
            com.google.android.material.appbar.MaterialToolbar.d0 = r0
            return
    }

    public MaterialToolbar(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            int r3 = com.google.android.material.R.attr.toolbarStyle
            int r4 = com.google.android.material.appbar.MaterialToolbar.c0
            android.content.Context r7 = a.Wa.a(r7, r8, r3, r4)
            r6.<init>(r7, r8, r3)
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialToolbar
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            android.content.res.TypedArray r8 = a.C0091cf.d(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.R.styleable.MaterialToolbar_navigationIconTint
            boolean r1 = r8.hasValue(r1)
            r2 = -1
            if (r1 == 0) goto L2b
            int r1 = com.google.android.material.R.styleable.MaterialToolbar_navigationIconTint
            int r1 = r8.getColor(r1, r2)
            r6.setNavigationIconTint(r1)
        L2b:
            int r1 = com.google.android.material.R.styleable.MaterialToolbar_titleCentered
            boolean r1 = r8.getBoolean(r1, r7)
            r6.V = r1
            int r1 = com.google.android.material.R.styleable.MaterialToolbar_subtitleCentered
            boolean r1 = r8.getBoolean(r1, r7)
            r6.W = r1
            int r1 = com.google.android.material.R.styleable.MaterialToolbar_logoScaleType
            int r1 = r8.getInt(r1, r2)
            if (r1 < 0) goto L4c
            android.widget.ImageView$ScaleType[] r2 = com.google.android.material.appbar.MaterialToolbar.d0
            int r3 = r2.length
            if (r1 >= r3) goto L4c
            r1 = r2[r1]
            r6.a0 = r1
        L4c:
            int r1 = com.google.android.material.R.styleable.MaterialToolbar_logoAdjustViewBounds
            boolean r1 = r8.hasValue(r1)
            if (r1 == 0) goto L60
            int r1 = com.google.android.material.R.styleable.MaterialToolbar_logoAdjustViewBounds
            boolean r1 = r8.getBoolean(r1, r7)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r6.b0 = r1
        L60:
            r8.recycle()
            android.graphics.drawable.Drawable r8 = r6.getBackground()
            if (r8 != 0) goto L6e
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            goto L72
        L6e:
            android.content.res.ColorStateList r7 = a.C0475y5.a(r8)
        L72:
            if (r7 == 0) goto L8b
            a.Ta r8 = new a.Ta
            r8.<init>()
            r8.k(r7)
            r8.i(r0)
            java.util.WeakHashMap<android.view.View, a.Jg> r7 = a.C0414ug.f721a
            float r7 = a.C0414ug.d.i(r6)
            r8.j(r7)
            r6.setBackground(r8)
        L8b:
            return
    }

    public android.widget.ImageView.ScaleType getLogoScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.a0
            return r0
    }

    public java.lang.Integer getNavigationIconTint() {
            r1 = this;
            java.lang.Integer r0 = r1.U
            return r0
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int r4) {
            r3 = this;
            android.view.Menu r0 = r3.getMenu()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.f
            if (r1 == 0) goto Le
            r2 = r0
            androidx.appcompat.view.menu.f r2 = (androidx.appcompat.view.menu.f) r2
            r2.w()
        Le:
            super.m(r4)
            if (r1 == 0) goto L18
            androidx.appcompat.view.menu.f r0 = (androidx.appcompat.view.menu.f) r0
            r0.v()
        L18:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r0 instanceof a.Ta
            if (r1 == 0) goto L10
            a.Ta r0 = (a.Ta) r0
            a.C0282n9.A(r2, r0)
        L10:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            super.onLayout(r8, r9, r10, r11, r12)
            r8 = r7
            boolean r9 = r8.V
            r10 = 0
            r11 = 0
            if (r9 != 0) goto L10
            boolean r9 = r8.W
            if (r9 != 0) goto L10
            goto Lab
        L10:
            java.lang.CharSequence r9 = r7.getTitle()
            java.util.ArrayList r9 = a.C0431vf.b(r7, r9)
            boolean r12 = r9.isEmpty()
            a.vf$a r0 = a.C0431vf.f741a
            if (r12 == 0) goto L22
            r9 = r11
            goto L28
        L22:
            java.lang.Object r9 = java.util.Collections.min(r9, r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
        L28:
            java.lang.CharSequence r12 = r7.getSubtitle()
            java.util.ArrayList r12 = a.C0431vf.b(r7, r12)
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L38
            r12 = r11
            goto L3e
        L38:
            java.lang.Object r12 = java.util.Collections.max(r12, r0)
            android.widget.TextView r12 = (android.widget.TextView) r12
        L3e:
            if (r9 != 0) goto L43
            if (r12 != 0) goto L43
            goto Lab
        L43:
            int r0 = r7.getMeasuredWidth()
            int r1 = r0 / 2
            int r2 = r7.getPaddingLeft()
            int r3 = r7.getPaddingRight()
            int r0 = r0 - r3
            r3 = r10
        L53:
            int r4 = r7.getChildCount()
            if (r3 >= r4) goto L8c
            android.view.View r4 = r7.getChildAt(r3)
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto L89
            if (r4 == r9) goto L89
            if (r4 == r12) goto L89
            int r5 = r4.getRight()
            if (r5 >= r1) goto L79
            int r5 = r4.getRight()
            if (r5 <= r2) goto L79
            int r2 = r4.getRight()
        L79:
            int r5 = r4.getLeft()
            if (r5 <= r1) goto L89
            int r5 = r4.getLeft()
            if (r5 >= r0) goto L89
            int r0 = r4.getLeft()
        L89:
            int r3 = r3 + 1
            goto L53
        L8c:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r2, r0)
            boolean r0 = r8.V
            if (r0 == 0) goto La2
            if (r9 == 0) goto La2
            r7.w(r9, r1)
        La2:
            boolean r9 = r8.W
            if (r9 == 0) goto Lab
            if (r12 == 0) goto Lab
            r7.w(r12, r1)
        Lab:
            android.graphics.drawable.Drawable r9 = r7.getLogo()
            if (r9 != 0) goto Lb2
            goto Le1
        Lb2:
            int r12 = r7.getChildCount()
            if (r10 >= r12) goto Le1
            android.view.View r12 = r7.getChildAt(r10)
            boolean r0 = r12 instanceof android.widget.ImageView
            if (r0 == 0) goto Lde
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            android.graphics.drawable.Drawable r0 = r12.getDrawable()
            if (r0 == 0) goto Lde
            android.graphics.drawable.Drawable$ConstantState r1 = r0.getConstantState()
            if (r1 == 0) goto Lde
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            android.graphics.drawable.Drawable$ConstantState r1 = r9.getConstantState()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lde
            r11 = r12
            goto Le1
        Lde:
            int r10 = r10 + 1
            goto Lb2
        Le1:
            if (r11 == 0) goto Lf5
            java.lang.Boolean r9 = r8.b0
            if (r9 == 0) goto Lee
            boolean r9 = r9.booleanValue()
            r11.setAdjustViewBounds(r9)
        Lee:
            android.widget.ImageView$ScaleType r9 = r8.a0
            if (r9 == 0) goto Lf5
            r11.setScaleType(r9)
        Lf5:
            return
    }

    @Override // android.view.View
    public void setElevation(float r3) {
            r2 = this;
            super.setElevation(r3)
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r0 instanceof a.Ta
            if (r1 == 0) goto L10
            a.Ta r0 = (a.Ta) r0
            r0.j(r3)
        L10:
            return
    }

    public void setLogoAdjustViewBounds(boolean r2) {
            r1 = this;
            java.lang.Boolean r0 = r1.b0
            if (r0 == 0) goto Lc
            boolean r0 = r0.booleanValue()
            if (r0 == r2) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.b0 = r2
            r1.requestLayout()
            return
    }

    public void setLogoScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.a0
            if (r0 == r2) goto L9
            r1.a0 = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L13
            java.lang.Integer r0 = r1.U
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r2 = r2.mutate()
            java.lang.Integer r0 = r1.U
            int r0 = r0.intValue()
            a.C0439w5.a.g(r2, r0)
        L13:
            super.setNavigationIcon(r2)
            return
    }

    public void setNavigationIconTint(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.U = r1
            android.graphics.drawable.Drawable r1 = r0.getNavigationIcon()
            if (r1 == 0) goto Lf
            r0.setNavigationIcon(r1)
        Lf:
            return
    }

    public void setSubtitleCentered(boolean r2) {
            r1 = this;
            boolean r0 = r1.W
            if (r0 == r2) goto L9
            r1.W = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setTitleCentered(boolean r2) {
            r1 = this;
            boolean r0 = r1.V
            if (r0 == r2) goto L9
            r1.V = r2
            r1.requestLayout()
        L9:
            return
    }

    public final void w(android.widget.TextView r5, android.util.Pair r6) {
            r4 = this;
            int r0 = r4.getMeasuredWidth()
            int r1 = r5.getMeasuredWidth()
            int r0 = r0 / 2
            int r2 = r1 / 2
            int r0 = r0 - r2
            int r1 = r1 + r0
            java.lang.Object r2 = r6.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = r2 - r0
            r3 = 0
            int r2 = java.lang.Math.max(r2, r3)
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r1 - r6
            int r6 = java.lang.Math.max(r6, r3)
            int r6 = java.lang.Math.max(r2, r6)
            if (r6 <= 0) goto L41
            int r0 = r0 + r6
            int r1 = r1 - r6
            int r6 = r1 - r0
            r2 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r2)
            int r2 = r5.getMeasuredHeightAndState()
            r5.measure(r6, r2)
        L41:
            int r6 = r5.getTop()
            int r2 = r5.getBottom()
            r5.layout(r0, r6, r1, r2)
            return
    }
}
