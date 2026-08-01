package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends androidx.appcompat.widget.Toolbar {
    public static final android.widget.ImageView.ScaleType[] W = null;
    public java.lang.Integer R;
    public boolean S;
    public boolean T;
    public android.widget.ImageView.ScaleType U;
    public java.lang.Boolean V;

    static {
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_START
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_END
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            android.widget.ImageView$ScaleType[] r0 = new android.widget.ImageView.ScaleType[]{r0, r1, r2, r3, r4, r5, r6, r7}
            com.google.android.material.appbar.MaterialToolbar.W = r0
            return
    }

    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = 2131821654(0x7f110456, float:1.9276057E38)
            r4 = 2130969671(0x7f040447, float:1.754803E38)
            android.content.Context r8 = defpackage.ff.W(r8, r9, r4, r0)
            r0 = 0
            r7.<init>(r8, r9, r0)
            android.content.Context r1 = r7.getContext()
            r5 = 2131821654(0x7f110456, float:1.9276057E38)
            int[] r6 = new int[r0]
            int[] r3 = defpackage.wy.s
            r2 = r9
            android.content.res.TypedArray r8 = defpackage.a80.u(r1, r2, r3, r4, r5, r6)
            r9 = 2
            boolean r2 = r8.hasValue(r9)
            r3 = -1
            if (r2 == 0) goto L2d
            int r9 = r8.getColor(r9, r3)
            r7.setNavigationIconTint(r9)
        L2d:
            r9 = 4
            boolean r9 = r8.getBoolean(r9, r0)
            r7.S = r9
            r9 = 3
            boolean r9 = r8.getBoolean(r9, r0)
            r7.T = r9
            r9 = 1
            int r9 = r8.getInt(r9, r3)
            if (r9 < 0) goto L4b
            android.widget.ImageView$ScaleType[] r2 = com.google.android.material.appbar.MaterialToolbar.W
            int r3 = r2.length
            if (r9 >= r3) goto L4b
            r9 = r2[r9]
            r7.U = r9
        L4b:
            boolean r9 = r8.hasValue(r0)
            if (r9 == 0) goto L5b
            boolean r9 = r8.getBoolean(r0, r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r7.V = r9
        L5b:
            r8.recycle()
            android.graphics.drawable.Drawable r8 = r7.getBackground()
            if (r8 != 0) goto L69
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r0)
            goto L6d
        L69:
            android.content.res.ColorStateList r8 = defpackage.ff.o(r8)
        L6d:
            if (r8 == 0) goto L86
            eu r9 = new eu
            r9.<init>()
            r9.j(r8)
            r9.h(r1)
            java.util.WeakHashMap r8 = defpackage.ja0.a
            float r8 = defpackage.y90.i(r7)
            r9.i(r8)
            defpackage.s90.q(r7, r9)
        L86:
            return
    }

    public android.widget.ImageView.ScaleType getLogoScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.U
            return r0
    }

    public java.lang.Integer getNavigationIconTint() {
            r1 = this;
            java.lang.Integer r0 = r1.R
            return r0
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int r4) {
            r3 = this;
            android.view.Menu r0 = r3.getMenu()
            boolean r1 = r0 instanceof defpackage.ku
            if (r1 == 0) goto Le
            r2 = r0
            ku r2 = (defpackage.ku) r2
            r2.w()
        Le:
            super.m(r4)
            if (r1 == 0) goto L18
            ku r0 = (defpackage.ku) r0
            r0.v()
        L18:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r0 instanceof defpackage.eu
            if (r1 == 0) goto L10
            eu r0 = (defpackage.eu) r0
            defpackage.gt.D(r2, r0)
        L10:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            super.onLayout(r8, r9, r10, r11, r12)
            r8 = r7
            ce r9 = defpackage.ip.t
            boolean r10 = r8.S
            r11 = 0
            r12 = 0
            if (r10 != 0) goto L12
            boolean r10 = r8.T
            if (r10 != 0) goto L12
            goto Lab
        L12:
            java.lang.CharSequence r10 = r7.getTitle()
            java.util.ArrayList r10 = defpackage.ip.x(r7, r10)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L22
            r10 = r12
            goto L28
        L22:
            java.lang.Object r10 = java.util.Collections.min(r10, r9)
            android.widget.TextView r10 = (android.widget.TextView) r10
        L28:
            java.lang.CharSequence r0 = r7.getSubtitle()
            java.util.ArrayList r0 = defpackage.ip.x(r7, r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L38
            r9 = r12
            goto L3e
        L38:
            java.lang.Object r9 = java.util.Collections.max(r0, r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
        L3e:
            if (r10 != 0) goto L43
            if (r9 != 0) goto L43
            goto Lab
        L43:
            int r0 = r7.getMeasuredWidth()
            int r1 = r0 / 2
            int r2 = r7.getPaddingLeft()
            int r3 = r7.getPaddingRight()
            int r0 = r0 - r3
            r3 = r11
        L53:
            int r4 = r7.getChildCount()
            if (r3 >= r4) goto L8c
            android.view.View r4 = r7.getChildAt(r3)
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto L89
            if (r4 == r10) goto L89
            if (r4 == r9) goto L89
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
            boolean r0 = r8.S
            if (r0 == 0) goto La2
            if (r10 == 0) goto La2
            r7.v(r10, r1)
        La2:
            boolean r10 = r8.T
            if (r10 == 0) goto Lab
            if (r9 == 0) goto Lab
            r7.v(r9, r1)
        Lab:
            android.graphics.drawable.Drawable r9 = r7.getLogo()
            if (r9 != 0) goto Lb2
            goto Le1
        Lb2:
            int r10 = r7.getChildCount()
            if (r11 >= r10) goto Le1
            android.view.View r10 = r7.getChildAt(r11)
            boolean r0 = r10 instanceof android.widget.ImageView
            if (r0 == 0) goto Lde
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            android.graphics.drawable.Drawable r0 = r10.getDrawable()
            if (r0 == 0) goto Lde
            android.graphics.drawable.Drawable$ConstantState r1 = r0.getConstantState()
            if (r1 == 0) goto Lde
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            android.graphics.drawable.Drawable$ConstantState r1 = r9.getConstantState()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lde
            r12 = r10
            goto Le1
        Lde:
            int r11 = r11 + 1
            goto Lb2
        Le1:
            if (r12 == 0) goto Lf5
            java.lang.Boolean r9 = r8.V
            if (r9 == 0) goto Lee
            boolean r9 = r9.booleanValue()
            r12.setAdjustViewBounds(r9)
        Lee:
            android.widget.ImageView$ScaleType r9 = r8.U
            if (r9 == 0) goto Lf5
            r12.setScaleType(r9)
        Lf5:
            return
    }

    @Override // android.view.View
    public void setElevation(float r3) {
            r2 = this;
            super.setElevation(r3)
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r0 instanceof defpackage.eu
            if (r1 == 0) goto L10
            eu r0 = (defpackage.eu) r0
            r0.i(r3)
        L10:
            return
    }

    public void setLogoAdjustViewBounds(boolean r2) {
            r1 = this;
            java.lang.Boolean r0 = r1.V
            if (r0 == 0) goto Lc
            boolean r0 = r0.booleanValue()
            if (r0 == r2) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.V = r2
            r1.requestLayout()
            return
    }

    public void setLogoScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.U
            if (r0 == r2) goto L9
            r1.U = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L13
            java.lang.Integer r0 = r1.R
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r2 = r2.mutate()
            java.lang.Integer r0 = r1.R
            int r0 = r0.intValue()
            defpackage.ch.g(r2, r0)
        L13:
            super.setNavigationIcon(r2)
            return
    }

    public void setNavigationIconTint(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.R = r1
            android.graphics.drawable.Drawable r1 = r0.getNavigationIcon()
            if (r1 == 0) goto Lf
            r0.setNavigationIcon(r1)
        Lf:
            return
    }

    public void setSubtitleCentered(boolean r2) {
            r1 = this;
            boolean r0 = r1.T
            if (r0 == r2) goto L9
            r1.T = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setTitleCentered(boolean r2) {
            r1 = this;
            boolean r0 = r1.S
            if (r0 == r2) goto L9
            r1.S = r2
            r1.requestLayout()
        L9:
            return
    }

    public final void v(android.widget.TextView r5, android.util.Pair r6) {
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
