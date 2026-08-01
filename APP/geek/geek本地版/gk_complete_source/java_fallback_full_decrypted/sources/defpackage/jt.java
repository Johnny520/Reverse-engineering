package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jt extends defpackage.u2 {
    public final defpackage.kr e;
    public final android.view.accessibility.AccessibilityManager f;
    public final android.graphics.Rect g;
    public final int h;
    public final float i;
    public android.content.res.ColorStateList j;
    public int k;
    public android.content.res.ColorStateList l;

    public jt(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r3 = 2130968634(0x7f04003a, float:1.7545927E38)
            r6 = 0
            android.content.Context r8 = defpackage.ff.W(r8, r9, r3, r6)
            r7.<init>(r8, r9)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.g = r8
            android.content.Context r0 = r7.getContext()
            r4 = 2131821293(0x7f1102ed, float:1.9275325E38)
            int[] r5 = new int[r6]
            int[] r2 = defpackage.wy.i
            r1 = r9
            android.content.res.TypedArray r8 = defpackage.a80.u(r0, r1, r2, r3, r4, r5)
            boolean r9 = r8.hasValue(r6)
            r1 = 0
            if (r9 == 0) goto L32
            int r9 = r8.getInt(r6, r6)
            if (r9 != 0) goto L32
            r7.setKeyListener(r1)
        L32:
            r9 = 3
            r2 = 2131492934(0x7f0c0046, float:1.8609334E38)
            int r9 = r8.getResourceId(r9, r2)
            r7.h = r9
            r9 = 2131165853(0x7f07029d, float:1.7945935E38)
            r2 = 1
            int r9 = r8.getDimensionPixelOffset(r2, r9)
            float r9 = (float) r9
            r7.i = r9
            r9 = 2
            boolean r3 = r8.hasValue(r9)
            if (r3 == 0) goto L58
            int r3 = r8.getColor(r9, r6)
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r7.j = r3
        L58:
            r3 = 4
            int r3 = r8.getColor(r3, r6)
            r7.k = r3
            r3 = 5
            android.content.res.ColorStateList r3 = defpackage.ct.n(r0, r8, r3)
            r7.l = r3
            java.lang.String r3 = "accessibility"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r7.f = r3
            kr r3 = new kr
            r4 = 2130969241(0x7f040299, float:1.7547158E38)
            r3.<init>(r0, r1, r4, r6)
            r7.e = r3
            r3.y = r2
            c4 r0 = r3.z
            r0.setFocusable(r2)
            r3.o = r7
            c4 r0 = r3.z
            r0.setInputMethodMode(r9)
            android.widget.ListAdapter r9 = r7.getAdapter()
            r3.n(r9)
            q4 r9 = new q4
            r0 = 1
            r9.<init>(r0, r7)
            r3.p = r9
            r9 = 6
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto La5
            int r9 = r8.getResourceId(r9, r6)
            r7.setSimpleItems(r9)
        La5:
            r8.recycle()
            return
    }

    public static void a(defpackage.jt r1, java.lang.Object r2) {
            java.lang.CharSequence r2 = r1.convertSelectionToString(r2)
            r0 = 0
            r1.setText(r2, r0)
            return
    }

    public final com.google.android.material.textfield.TextInputLayout b() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
        L4:
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof com.google.android.material.textfield.TextInputLayout
            if (r1 == 0) goto Ld
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            return r0
        Ld:
            android.view.ViewParent r0 = r0.getParent()
            goto L4
        L12:
            r0 = 0
            return r0
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.f
            if (r0 == 0) goto L10
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L10
            kr r0 = r1.e
            r0.dismiss()
            return
        L10:
            super.dismissDropDown()
            return
    }

    public android.content.res.ColorStateList getDropDownBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.j
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.b()
            if (r0 == 0) goto Lf
            boolean r1 = r0.E
            if (r1 == 0) goto Lf
            java.lang.CharSequence r0 = r0.getHint()
            return r0
        Lf:
            java.lang.CharSequence r0 = super.getHint()
            return r0
    }

    public float getPopupElevation() {
            r1 = this;
            float r0 = r1.i
            return r0
    }

    public int getSimpleItemSelectedColor() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public android.content.res.ColorStateList getSimpleItemSelectedRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.l
            return r0
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            com.google.android.material.textfield.TextInputLayout r0 = r3.b()
            if (r0 == 0) goto L2c
            boolean r0 = r0.E
            if (r0 == 0) goto L2c
            java.lang.CharSequence r0 = super.getHint()
            if (r0 != 0) goto L2c
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = ""
            if (r0 == 0) goto L20
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r2)
            goto L21
        L20:
            r0 = r1
        L21:
            java.lang.String r2 = "meizu"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2c
            r3.setHint(r1)
        L2c:
            return
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            kr r0 = r1.e
            r0.dismiss()
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r14, int r15) {
            r13 = this;
            super.onMeasure(r14, r15)
            int r15 = android.view.View.MeasureSpec.getMode(r14)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 != r0) goto Lb3
            int r15 = r13.getMeasuredWidth()
            android.widget.ListAdapter r0 = r13.getAdapter()
            com.google.android.material.textfield.TextInputLayout r1 = r13.b()
            r2 = 0
            if (r0 == 0) goto La0
            if (r1 != 0) goto L1e
            goto La0
        L1e:
            int r3 = r13.getMeasuredWidth()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            int r4 = r13.getMeasuredHeight()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            kr r5 = r13.e
            c4 r6 = r5.z
            boolean r6 = r6.isShowing()
            if (r6 != 0) goto L3a
            r6 = -1
            goto L40
        L3a:
            kh r6 = r5.c
            int r6 = r6.getSelectedItemPosition()
        L40:
            int r6 = java.lang.Math.max(r2, r6)
            int r7 = r0.getCount()
            int r6 = r6 + 15
            int r6 = java.lang.Math.min(r7, r6)
            int r7 = r6 + (-15)
            int r7 = java.lang.Math.max(r2, r7)
            r8 = 0
            r9 = r7
            r10 = r8
            r7 = r2
        L58:
            if (r9 >= r6) goto L83
            int r11 = r0.getItemViewType(r9)
            if (r11 == r2) goto L62
            r10 = r8
            r2 = r11
        L62:
            android.view.View r10 = r0.getView(r9, r10, r1)
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            if (r11 != 0) goto L75
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r12 = -2
            r11.<init>(r12, r12)
            r10.setLayoutParams(r11)
        L75:
            r10.measure(r3, r4)
            int r11 = r10.getMeasuredWidth()
            int r7 = java.lang.Math.max(r7, r11)
            int r9 = r9 + 1
            goto L58
        L83:
            c4 r0 = r5.z
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L96
            android.graphics.Rect r2 = r13.g
            r0.getPadding(r2)
            int r0 = r2.left
            int r2 = r2.right
            int r0 = r0 + r2
            int r7 = r7 + r0
        L96:
            com.google.android.material.internal.CheckableImageButton r0 = r1.getEndIconView()
            int r0 = r0.getMeasuredWidth()
            int r2 = r0 + r7
        La0:
            int r15 = java.lang.Math.max(r15, r2)
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            int r14 = java.lang.Math.min(r15, r14)
            int r15 = r13.getMeasuredHeight()
            r13.setMeasuredDimension(r14, r15)
        Lb3:
            return
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.f
            if (r0 == 0) goto Lb
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto Lb
            return
        Lb:
            super.onWindowFocusChanged(r2)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends android.widget.ListAdapter & android.widget.Filterable> void setAdapter(T r2) {
            r1 = this;
            super.setAdapter(r2)
            kr r2 = r1.e
            android.widget.ListAdapter r0 = r1.getAdapter()
            r2.n(r0)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setDropDownBackgroundDrawable(r2)
            kr r0 = r1.e
            if (r0 == 0) goto La
            r0.l(r2)
        La:
            return
    }

    public void setDropDownBackgroundTint(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setDropDownBackgroundTintList(r1)
            return
    }

    public void setDropDownBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.j = r2
            android.graphics.drawable.Drawable r2 = r1.getDropDownBackground()
            boolean r0 = r2 instanceof defpackage.eu
            if (r0 == 0) goto L11
            eu r2 = (defpackage.eu) r2
            android.content.res.ColorStateList r0 = r1.j
            r2.j(r0)
        L11:
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener r2) {
            r1 = this;
            super.setOnItemSelectedListener(r2)
            kr r2 = r1.e
            android.widget.AdapterView$OnItemSelectedListener r0 = r1.getOnItemSelectedListener()
            r2.q = r0
            return
    }

    @Override // android.widget.TextView
    public void setRawInputType(int r1) {
            r0 = this;
            super.setRawInputType(r1)
            com.google.android.material.textfield.TextInputLayout r1 = r0.b()
            if (r1 == 0) goto Lc
            r1.s()
        Lc:
            return
    }

    public void setSimpleItemSelectedColor(int r1) {
            r0 = this;
            r0.k = r1
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r1 = r1 instanceof defpackage.ht
            if (r1 == 0) goto L13
            android.widget.ListAdapter r1 = r0.getAdapter()
            ht r1 = (defpackage.ht) r1
            r1.a()
        L13:
            return
    }

    public void setSimpleItemSelectedRippleColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.l = r1
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r1 = r1 instanceof defpackage.ht
            if (r1 == 0) goto L13
            android.widget.ListAdapter r1 = r0.getAdapter()
            ht r1 = (defpackage.ht) r1
            r1.a()
        L13:
            return
    }

    public void setSimpleItems(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String[] r2 = r0.getStringArray(r2)
            r1.setSimpleItems(r2)
            return
    }

    public void setSimpleItems(java.lang.String[] r4) {
            r3 = this;
            ht r0 = new ht
            android.content.Context r1 = r3.getContext()
            int r2 = r3.h
            r0.<init>(r3, r1, r2, r4)
            r3.setAdapter(r0)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.f
            if (r0 == 0) goto L10
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L10
            kr r0 = r1.e
            r0.f()
            return
        L10:
            super.showDropDown()
            return
    }
}
