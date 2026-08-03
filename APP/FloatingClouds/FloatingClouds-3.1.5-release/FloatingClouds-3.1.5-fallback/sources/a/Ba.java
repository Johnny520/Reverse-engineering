package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ba extends a.F0 {
    public final a.F9 e;
    public final android.view.accessibility.AccessibilityManager f;
    public final android.graphics.Rect g;
    public final int h;
    public final float i;
    public android.content.res.ColorStateList j;
    public int k;
    public android.content.res.ColorStateList l;

    public class a<T> extends android.widget.ArrayAdapter<java.lang.String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.content.res.ColorStateList f30a;
        public android.content.res.ColorStateList b;
        public final /* synthetic */ a.Ba c;

        public a(a.Ba r1, android.content.Context r2, int r3, java.lang.String[] r4) {
                r0 = this;
                r0.c = r1
                r0.<init>(r2, r3, r4)
                r0.b()
                return
        }

        public final void b() {
                r7 = this;
                a.Ba r0 = r7.c
                android.content.res.ColorStateList r1 = r0.l
                r2 = 0
                if (r1 == 0) goto L9
                r3 = 1
                goto La
            L9:
                r3 = r2
            La:
                r4 = 0
                if (r3 != 0) goto Lf
                r5 = r4
                goto L29
            Lf:
                r3 = 16842919(0x10100a7, float:2.3694026E-38)
                int[] r3 = new int[]{r3}
                int r1 = r1.getColorForState(r3, r2)
                int[] r1 = new int[]{r1, r2}
                int[] r5 = new int[r2]
                int[][] r3 = new int[][]{r3, r5}
                android.content.res.ColorStateList r5 = new android.content.res.ColorStateList
                r5.<init>(r3, r1)
            L29:
                r7.b = r5
                int r1 = r0.k
                if (r1 == 0) goto L6d
                android.content.res.ColorStateList r1 = r0.l
                if (r1 == 0) goto L6d
                r1 = 16843623(0x1010367, float:2.3696E-38)
                r3 = -16842919(0xfffffffffefeff59, float:-1.6947488E38)
                int[] r1 = new int[]{r1, r3}
                r4 = 16842913(0x10100a1, float:2.369401E-38)
                int[] r3 = new int[]{r4, r3}
                android.content.res.ColorStateList r4 = r0.l
                int r4 = r4.getColorForState(r3, r2)
                android.content.res.ColorStateList r5 = r0.l
                int r5 = r5.getColorForState(r1, r2)
                int r6 = r0.k
                int r4 = a.C0419v3.b(r4, r6)
                int r6 = r0.k
                int r5 = a.C0419v3.b(r5, r6)
                int r0 = r0.k
                int[] r0 = new int[]{r4, r5, r0}
                int[] r2 = new int[r2]
                int[][] r1 = new int[][]{r3, r1, r2}
                android.content.res.ColorStateList r4 = new android.content.res.ColorStateList
                r4.<init>(r1, r0)
            L6d:
                r7.f30a = r4
                return
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
                r3 = this;
                android.view.View r4 = super.getView(r4, r5, r6)
                boolean r5 = r4 instanceof android.widget.TextView
                if (r5 == 0) goto L43
                r5 = r4
                android.widget.TextView r5 = (android.widget.TextView) r5
                a.Ba r6 = r3.c
                android.text.Editable r0 = r6.getText()
                java.lang.String r0 = r0.toString()
                java.lang.CharSequence r1 = r5.getText()
                boolean r0 = r0.contentEquals(r1)
                r1 = 0
                if (r0 == 0) goto L3e
                int r0 = r6.k
                if (r0 == 0) goto L3e
                android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
                int r6 = r6.k
                r0.<init>(r6)
                android.content.res.ColorStateList r6 = r3.b
                if (r6 == 0) goto L3d
                android.content.res.ColorStateList r6 = r3.f30a
                a.C0439w5.a.h(r0, r6)
                android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
                android.content.res.ColorStateList r2 = r3.b
                r6.<init>(r2, r0, r1)
                r1 = r6
                goto L3e
            L3d:
                r1 = r0
            L3e:
                java.util.WeakHashMap<android.view.View, a.Jg> r6 = a.C0414ug.f721a
                r5.setBackground(r1)
            L43:
                return r4
        }
    }

    public Ba(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            int r3 = com.google.android.material.R.attr.autoCompleteTextViewStyle
            r6 = 0
            android.content.Context r8 = a.Wa.a(r8, r9, r3, r6)
            r7.<init>(r8, r9, r3)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.g = r8
            android.content.Context r0 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView
            int r4 = com.google.android.material.R.style.Widget_AppCompat_AutoCompleteTextView
            int[] r5 = new int[r6]
            r1 = r9
            android.content.res.TypedArray r8 = a.C0091cf.d(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType
            boolean r9 = r8.hasValue(r9)
            r1 = 0
            if (r9 == 0) goto L34
            int r9 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType
            int r9 = r8.getInt(r9, r6)
            if (r9 != 0) goto L34
            r7.setKeyListener(r1)
        L34:
            int r9 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemLayout
            int r2 = com.google.android.material.R.layout.mtrl_auto_complete_simple_item
            int r9 = r8.getResourceId(r9, r2)
            r7.h = r9
            int r9 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_popupElevation
            int r2 = com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation
            int r9 = r8.getDimensionPixelOffset(r9, r2)
            float r9 = (float) r9
            r7.i = r9
            int r9 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint
            boolean r9 = r8.hasValue(r9)
            if (r9 == 0) goto L5d
            int r9 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint
            int r9 = r8.getColor(r9, r6)
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)
            r7.j = r9
        L5d:
            int r9 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor
            int r9 = r8.getColor(r9, r6)
            r7.k = r9
            int r9 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor
            android.content.res.ColorStateList r9 = a.Sa.b(r0, r8, r9)
            r7.l = r9
            java.lang.String r9 = "accessibility"
            java.lang.Object r9 = r0.getSystemService(r9)
            android.view.accessibility.AccessibilityManager r9 = (android.view.accessibility.AccessibilityManager) r9
            r7.f = r9
            a.F9 r9 = new a.F9
            int r2 = androidx.appcompat.R.attr.listPopupWindowStyle
            r9.<init>(r0, r1, r2)
            r7.e = r9
            r0 = 1
            r9.y = r0
            a.g1 r1 = r9.z
            r1.setFocusable(r0)
            r9.o = r7
            r0 = 2
            a.g1 r1 = r9.z
            r1.setInputMethodMode(r0)
            android.widget.ListAdapter r0 = r7.getAdapter()
            r9.o(r0)
            a.Aa r0 = new a.Aa
            r0.<init>(r7)
            r9.p = r0
            int r9 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItems
            boolean r9 = r8.hasValue(r9)
            if (r9 == 0) goto Laf
            int r9 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItems
            int r9 = r8.getResourceId(r9, r6)
            r7.setSimpleItems(r9)
        Laf:
            r8.recycle()
            return
    }

    public static void a(a.Ba r1, java.lang.Object r2) {
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

    public final boolean c() {
            r3 = this;
            android.view.accessibility.AccessibilityManager r0 = r3.f
            if (r0 == 0) goto Lb
            boolean r1 = r0.isTouchExplorationEnabled()
            if (r1 == 0) goto Lb
            goto L3e
        Lb:
            if (r0 == 0) goto L40
            boolean r1 = r0.isEnabled()
            if (r1 != 0) goto L14
            goto L40
        L14:
            r1 = 16
            java.util.List r0 = r0.getEnabledAccessibilityServiceList(r1)
            if (r0 == 0) goto L40
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            android.accessibilityservice.AccessibilityServiceInfo r1 = (android.accessibilityservice.AccessibilityServiceInfo) r1
            java.lang.String r2 = r1.getSettingsActivityName()
            if (r2 == 0) goto L20
            java.lang.String r1 = r1.getSettingsActivityName()
            java.lang.String r2 = "SwitchAccess"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L20
        L3e:
            r0 = 1
            return r0
        L40:
            r0 = 0
            return r0
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto Lc
            a.F9 r0 = r1.e
            r0.dismiss()
            return
        Lc:
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
            a.F9 r0 = r1.e
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
            a.F9 r5 = r13.e
            a.g1 r6 = r5.z
            boolean r6 = r6.isShowing()
            if (r6 != 0) goto L3a
            r6 = -1
            goto L40
        L3a:
            a.A5 r6 = r5.c
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
            a.g1 r0 = r5.z
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
            boolean r0 = r1.c()
            if (r0 == 0) goto L7
            return
        L7:
            super.onWindowFocusChanged(r2)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends android.widget.ListAdapter & android.widget.Filterable> void setAdapter(T r2) {
            r1 = this;
            super.setAdapter(r2)
            a.F9 r2 = r1.e
            android.widget.ListAdapter r0 = r1.getAdapter()
            r2.o(r0)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setDropDownBackgroundDrawable(r2)
            a.F9 r0 = r1.e
            if (r0 == 0) goto La
            r0.m(r2)
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
            boolean r0 = r2 instanceof a.Ta
            if (r0 == 0) goto L11
            a.Ta r2 = (a.Ta) r2
            android.content.res.ColorStateList r0 = r1.j
            r2.k(r0)
        L11:
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener r2) {
            r1 = this;
            super.setOnItemSelectedListener(r2)
            a.F9 r2 = r1.e
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
            boolean r1 = r1 instanceof a.Ba.a
            if (r1 == 0) goto L13
            android.widget.ListAdapter r1 = r0.getAdapter()
            a.Ba$a r1 = (a.Ba.a) r1
            r1.b()
        L13:
            return
    }

    public void setSimpleItemSelectedRippleColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.l = r1
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r1 = r1 instanceof a.Ba.a
            if (r1 == 0) goto L13
            android.widget.ListAdapter r1 = r0.getAdapter()
            a.Ba$a r1 = (a.Ba.a) r1
            r1.b()
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
            a.Ba$a r0 = new a.Ba$a
            android.content.Context r1 = r3.getContext()
            int r2 = r3.h
            r0.<init>(r3, r1, r2, r4)
            r3.setAdapter(r0)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto Lc
            a.F9 r0 = r1.e
            r0.f()
            return
        Lc:
            super.showDropDown()
            return
    }
}
