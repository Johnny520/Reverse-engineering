package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"ViewConstructor"})
public final class a extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.material.textfield.TextInputLayout f1096a;
    public final android.widget.FrameLayout b;
    public final com.google.android.material.internal.CheckableImageButton c;
    public android.content.res.ColorStateList d;
    public android.graphics.PorterDuff.Mode e;
    public android.view.View.OnLongClickListener f;
    public final com.google.android.material.internal.CheckableImageButton g;
    public final com.google.android.material.textfield.a.d h;
    public int i;
    public final java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout.g> j;
    public android.content.res.ColorStateList k;
    public android.graphics.PorterDuff.Mode l;
    public int m;
    public android.widget.ImageView.ScaleType n;
    public android.view.View.OnLongClickListener o;
    public java.lang.CharSequence p;
    public final a.C0345r1 q;
    public boolean r;
    public android.widget.EditText s;
    public final android.view.accessibility.AccessibilityManager t;
    public a.E5 u;
    public final com.google.android.material.textfield.a.C0036a v;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0036a extends a.C0072bf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.textfield.a f1097a;

        public C0036a(com.google.android.material.textfield.a r1) {
                r0 = this;
                r0.<init>()
                r0.f1097a = r1
                return
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(android.text.Editable r1) {
                r0 = this;
                com.google.android.material.textfield.a r1 = r0.f1097a
                a.c6 r1 = r1.b()
                r1.a()
                return
        }

        @Override // a.C0072bf, android.text.TextWatcher
        public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                com.google.android.material.textfield.a r1 = r0.f1097a
                a.c6 r1 = r1.b()
                r1.b()
                return
        }
    }

    public class b implements com.google.android.material.textfield.TextInputLayout.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.textfield.a f1098a;

        public b(com.google.android.material.textfield.a r1) {
                r0 = this;
                r0.<init>()
                r0.f1098a = r1
                return
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(com.google.android.material.textfield.TextInputLayout r5) {
                r4 = this;
                com.google.android.material.textfield.a r0 = r4.f1098a
                android.widget.EditText r1 = r0.s
                android.widget.EditText r2 = r5.getEditText()
                if (r1 != r2) goto Lb
                return
            Lb:
                android.widget.EditText r1 = r0.s
                com.google.android.material.textfield.a$a r2 = r0.v
                if (r1 == 0) goto L2a
                r1.removeTextChangedListener(r2)
                android.widget.EditText r1 = r0.s
                android.view.View$OnFocusChangeListener r1 = r1.getOnFocusChangeListener()
                a.c6 r3 = r0.b()
                android.view.View$OnFocusChangeListener r3 = r3.e()
                if (r1 != r3) goto L2a
                android.widget.EditText r1 = r0.s
                r3 = 0
                r1.setOnFocusChangeListener(r3)
            L2a:
                android.widget.EditText r5 = r5.getEditText()
                r0.s = r5
                if (r5 == 0) goto L35
                r5.addTextChangedListener(r2)
            L35:
                a.c6 r5 = r0.b()
                android.widget.EditText r1 = r0.s
                r5.m(r1)
                a.c6 r5 = r0.b()
                r0.j(r5)
                return
        }
    }

    public class c implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.textfield.a f1099a;

        public c(com.google.android.material.textfield.a r1) {
                r0 = this;
                r0.<init>()
                r0.f1099a = r1
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(android.view.View r3) {
                r2 = this;
                com.google.android.material.textfield.a r3 = r2.f1099a
                a.E5 r0 = r3.u
                if (r0 == 0) goto L1c
                android.view.accessibility.AccessibilityManager r0 = r3.t
                if (r0 == 0) goto L1c
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                boolean r1 = r3.isAttachedToWindow()
                if (r1 == 0) goto L1c
                a.E5 r3 = r3.u
                a.D r1 = new a.D
                r1.<init>(r3)
                r0.addTouchExplorationStateChangeListener(r1)
            L1c:
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(android.view.View r3) {
                r2 = this;
                com.google.android.material.textfield.a r3 = r2.f1099a
                a.E5 r0 = r3.u
                if (r0 == 0) goto L12
                android.view.accessibility.AccessibilityManager r3 = r3.t
                if (r3 == 0) goto L12
                a.D r1 = new a.D
                r1.<init>(r0)
                r3.removeTouchExplorationStateChangeListener(r1)
            L12:
                return
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.util.SparseArray<a.AbstractC0082c6> f1100a;
        public final com.google.android.material.textfield.a b;
        public final int c;
        public final int d;

        public d(com.google.android.material.textfield.a r2, a.C0306of r3) {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.f1100a = r0
                r1.b = r2
                int r2 = com.google.android.material.R.styleable.TextInputLayout_endIconDrawable
                android.content.res.TypedArray r3 = r3.b
                r0 = 0
                int r2 = r3.getResourceId(r2, r0)
                r1.c = r2
                int r2 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleDrawable
                int r2 = r3.getResourceId(r2, r0)
                r1.d = r2
                return
        }
    }

    public a(com.google.android.material.textfield.TextInputLayout r17, a.C0306of r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            android.content.Context r3 = r1.getContext()
            r0.<init>(r3)
            r3 = 0
            r0.i = r3
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r0.j = r4
            com.google.android.material.textfield.a$a r4 = new com.google.android.material.textfield.a$a
            r4.<init>(r0)
            r0.v = r4
            com.google.android.material.textfield.a$b r4 = new com.google.android.material.textfield.a$b
            r4.<init>(r0)
            android.content.Context r5 = r0.getContext()
            java.lang.String r6 = "accessibility"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.view.accessibility.AccessibilityManager r5 = (android.view.accessibility.AccessibilityManager) r5
            r0.t = r5
            r0.f1096a = r1
            r5 = 8
            r0.setVisibility(r5)
            r0.setOrientation(r3)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = -2
            r8 = -1
            r9 = 8388613(0x800005, float:1.175495E-38)
            r6.<init>(r7, r8, r9)
            r0.setLayoutParams(r6)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            android.content.Context r9 = r0.getContext()
            r6.<init>(r9)
            r0.b = r6
            r6.setVisibility(r5)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r7, r8)
            r6.setLayoutParams(r9)
            android.content.Context r9 = r0.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            int r10 = com.google.android.material.R.id.text_input_error_icon
            com.google.android.material.internal.CheckableImageButton r10 = r0.a(r0, r9, r10)
            r0.c = r10
            int r11 = com.google.android.material.R.id.text_input_end_icon
            com.google.android.material.internal.CheckableImageButton r9 = r0.a(r6, r9, r11)
            r0.g = r9
            com.google.android.material.textfield.a$d r11 = new com.google.android.material.textfield.a$d
            r11.<init>(r0, r2)
            r0.h = r11
            a.r1 r11 = new a.r1
            android.content.Context r12 = r0.getContext()
            r13 = 0
            r11.<init>(r12, r13)
            r0.q = r11
            int r12 = com.google.android.material.R.styleable.TextInputLayout_errorIconTint
            android.content.res.TypedArray r14 = r2.b
            boolean r12 = r14.hasValue(r12)
            if (r12 == 0) goto L9f
            android.content.Context r12 = r0.getContext()
            int r15 = com.google.android.material.R.styleable.TextInputLayout_errorIconTint
            android.content.res.ColorStateList r12 = a.Sa.a(r12, r2, r15)
            r0.d = r12
        L9f:
            int r12 = com.google.android.material.R.styleable.TextInputLayout_errorIconTintMode
            boolean r12 = r14.hasValue(r12)
            if (r12 == 0) goto Lb3
            int r12 = com.google.android.material.R.styleable.TextInputLayout_errorIconTintMode
            int r12 = r14.getInt(r12, r8)
            android.graphics.PorterDuff$Mode r12 = a.Rg.b(r12, r13)
            r0.e = r12
        Lb3:
            int r12 = com.google.android.material.R.styleable.TextInputLayout_errorIconDrawable
            boolean r12 = r14.hasValue(r12)
            if (r12 == 0) goto Lc4
            int r12 = com.google.android.material.R.styleable.TextInputLayout_errorIconDrawable
            android.graphics.drawable.Drawable r12 = r2.b(r12)
            r0.i(r12)
        Lc4:
            android.content.res.Resources r12 = r0.getResources()
            int r15 = com.google.android.material.R.string.error_icon_content_description
            java.lang.CharSequence r12 = r12.getText(r15)
            r10.setContentDescription(r12)
            java.util.WeakHashMap<android.view.View, a.Jg> r12 = a.C0414ug.f721a
            r12 = 2
            r10.setImportantForAccessibility(r12)
            r10.setClickable(r3)
            r10.setPressable(r3)
            r10.setFocusable(r3)
            int r12 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled
            boolean r12 = r14.hasValue(r12)
            if (r12 != 0) goto L110
            int r12 = com.google.android.material.R.styleable.TextInputLayout_endIconTint
            boolean r12 = r14.hasValue(r12)
            if (r12 == 0) goto Lfc
            android.content.Context r12 = r0.getContext()
            int r15 = com.google.android.material.R.styleable.TextInputLayout_endIconTint
            android.content.res.ColorStateList r12 = a.Sa.a(r12, r2, r15)
            r0.k = r12
        Lfc:
            int r12 = com.google.android.material.R.styleable.TextInputLayout_endIconTintMode
            boolean r12 = r14.hasValue(r12)
            if (r12 == 0) goto L110
            int r12 = com.google.android.material.R.styleable.TextInputLayout_endIconTintMode
            int r12 = r14.getInt(r12, r8)
            android.graphics.PorterDuff$Mode r12 = a.Rg.b(r12, r13)
            r0.l = r12
        L110:
            int r12 = com.google.android.material.R.styleable.TextInputLayout_endIconMode
            boolean r12 = r14.hasValue(r12)
            r15 = 1
            if (r12 == 0) goto L143
            int r12 = com.google.android.material.R.styleable.TextInputLayout_endIconMode
            int r12 = r14.getInt(r12, r3)
            r0.g(r12)
            int r12 = com.google.android.material.R.styleable.TextInputLayout_endIconContentDescription
            boolean r12 = r14.hasValue(r12)
            if (r12 == 0) goto L139
            int r12 = com.google.android.material.R.styleable.TextInputLayout_endIconContentDescription
            java.lang.CharSequence r12 = r14.getText(r12)
            java.lang.CharSequence r7 = r9.getContentDescription()
            if (r7 == r12) goto L139
            r9.setContentDescription(r12)
        L139:
            int r7 = com.google.android.material.R.styleable.TextInputLayout_endIconCheckable
            boolean r7 = r14.getBoolean(r7, r15)
            r9.setCheckable(r7)
            goto L18b
        L143:
            int r7 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled
            boolean r7 = r14.hasValue(r7)
            if (r7 == 0) goto L18b
            int r7 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleTint
            boolean r7 = r14.hasValue(r7)
            if (r7 == 0) goto L15f
            android.content.Context r7 = r0.getContext()
            int r12 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleTint
            android.content.res.ColorStateList r7 = a.Sa.a(r7, r2, r12)
            r0.k = r7
        L15f:
            int r7 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleTintMode
            boolean r7 = r14.hasValue(r7)
            if (r7 == 0) goto L173
            int r7 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleTintMode
            int r7 = r14.getInt(r7, r8)
            android.graphics.PorterDuff$Mode r7 = a.Rg.b(r7, r13)
            r0.l = r7
        L173:
            int r7 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled
            boolean r7 = r14.getBoolean(r7, r3)
            r0.g(r7)
            int r7 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r7 = r14.getText(r7)
            java.lang.CharSequence r12 = r9.getContentDescription()
            if (r12 == r7) goto L18b
            r9.setContentDescription(r7)
        L18b:
            int r7 = com.google.android.material.R.styleable.TextInputLayout_endIconMinSize
            android.content.res.Resources r12 = r0.getResources()
            int r13 = com.google.android.material.R.dimen.mtrl_min_touch_target_size
            int r12 = r12.getDimensionPixelSize(r13)
            int r7 = r14.getDimensionPixelSize(r7, r12)
            if (r7 < 0) goto L231
            int r12 = r0.m
            if (r7 == r12) goto L1af
            r0.m = r7
            r9.setMinimumWidth(r7)
            r9.setMinimumHeight(r7)
            r10.setMinimumWidth(r7)
            r10.setMinimumHeight(r7)
        L1af:
            int r7 = com.google.android.material.R.styleable.TextInputLayout_endIconScaleType
            boolean r7 = r14.hasValue(r7)
            if (r7 == 0) goto L1c9
            int r7 = com.google.android.material.R.styleable.TextInputLayout_endIconScaleType
            int r7 = r14.getInt(r7, r8)
            android.widget.ImageView$ScaleType r7 = a.M8.b(r7)
            r0.n = r7
            r9.setScaleType(r7)
            r10.setScaleType(r7)
        L1c9:
            r11.setVisibility(r5)
            int r5 = com.google.android.material.R.id.textinput_suffix_text
            r11.setId(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = 1117782016(0x42a00000, float:80.0)
            r8 = -2
            r5.<init>(r8, r8, r7)
            r11.setLayoutParams(r5)
            r11.setAccessibilityLiveRegion(r15)
            int r5 = com.google.android.material.R.styleable.TextInputLayout_suffixTextAppearance
            int r3 = r14.getResourceId(r5, r3)
            r11.setTextAppearance(r3)
            int r3 = com.google.android.material.R.styleable.TextInputLayout_suffixTextColor
            boolean r3 = r14.hasValue(r3)
            if (r3 == 0) goto L1f9
            int r3 = com.google.android.material.R.styleable.TextInputLayout_suffixTextColor
            android.content.res.ColorStateList r2 = r2.a(r3)
            r11.setTextColor(r2)
        L1f9:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_suffixText
            java.lang.CharSequence r2 = r14.getText(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L207
            r13 = 0
            goto L208
        L207:
            r13 = r2
        L208:
            r0.p = r13
            r11.setText(r2)
            r0.n()
            r6.addView(r9)
            r0.addView(r11)
            r0.addView(r6)
            r0.addView(r10)
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$f> r2 = r1.e0
            r2.add(r4)
            android.widget.EditText r2 = r1.d
            if (r2 == 0) goto L228
            r4.a(r1)
        L228:
            com.google.android.material.textfield.a$c r1 = new com.google.android.material.textfield.a$c
            r1.<init>(r0)
            r0.addOnAttachStateChangeListener(r1)
            return
        L231:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "endIconSize cannot be less than 0"
            r1.<init>(r2)
            throw r1
    }

    public final com.google.android.material.internal.CheckableImageButton a(android.view.ViewGroup r3, android.view.LayoutInflater r4, int r5) {
            r2 = this;
            int r0 = com.google.android.material.R.layout.design_text_input_end_icon
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r3.setId(r5)
            android.content.Context r4 = r2.getContext()
            boolean r4 = a.Sa.d(r4)
            if (r4 == 0) goto L1f
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            r4.setMarginStart(r1)
        L1f:
            return r3
    }

    public final a.AbstractC0082c6 b() {
            r5 = this;
            int r0 = r5.i
            com.google.android.material.textfield.a$d r1 = r5.h
            android.util.SparseArray<a.c6> r2 = r1.f1100a
            java.lang.Object r3 = r2.get(r0)
            a.c6 r3 = (a.AbstractC0082c6) r3
            if (r3 != 0) goto L4e
            r3 = -1
            com.google.android.material.textfield.a r4 = r1.b
            if (r0 == r3) goto L45
            if (r0 == 0) goto L3f
            r3 = 1
            if (r0 == r3) goto L36
            r1 = 2
            if (r0 == r1) goto L30
            r1 = 3
            if (r0 != r1) goto L24
            a.F5 r1 = new a.F5
            r1.<init>(r4)
            goto L4a
        L24:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid end icon mode: "
            java.lang.String r0 = a.C0487z.e(r2, r0)
            r1.<init>(r0)
            throw r1
        L30:
            a.l3 r1 = new a.l3
            r1.<init>(r4)
            goto L4a
        L36:
            a.qc r3 = new a.qc
            int r1 = r1.d
            r3.<init>(r4, r1)
            r1 = r3
            goto L4a
        L3f:
            a.Nb r1 = new a.Nb
            r1.<init>(r4)
            goto L4a
        L45:
            a.D4 r1 = new a.D4
            r1.<init>(r4)
        L4a:
            r2.append(r0, r1)
            return r1
        L4e:
            return r3
    }

    public final int c() {
            r3 = this;
            boolean r0 = r3.d()
            if (r0 != 0) goto Lf
            boolean r0 = r3.e()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L20
        Lf:
            com.google.android.material.internal.CheckableImageButton r0 = r3.g
            int r1 = r0.getMeasuredWidth()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.getMarginStart()
            int r0 = r0 + r1
        L20:
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            int r1 = r3.getPaddingEnd()
            a.r1 r2 = r3.q
            int r2 = r2.getPaddingEnd()
            int r2 = r2 + r1
            int r2 = r2 + r0
            return r2
    }

    public final boolean d() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.b
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            com.google.android.material.internal.CheckableImageButton r0 = r1.g
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean e() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.c
            int r0 = r0.getVisibility()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void f(boolean r6) {
            r5 = this;
            a.c6 r0 = r5.b()
            boolean r1 = r0.k()
            com.google.android.material.internal.CheckableImageButton r2 = r5.g
            r3 = 1
            if (r1 == 0) goto L1b
            boolean r1 = r2.d
            boolean r4 = r0.l()
            if (r1 == r4) goto L1b
            r1 = r1 ^ r3
            r2.setChecked(r1)
            r1 = r3
            goto L1c
        L1b:
            r1 = 0
        L1c:
            boolean r4 = r0 instanceof a.F5
            if (r4 == 0) goto L30
            boolean r4 = r2.isActivated()
            boolean r0 = r0.j()
            if (r4 == r0) goto L30
            r0 = r4 ^ 1
            r2.setActivated(r0)
            goto L31
        L30:
            r3 = r1
        L31:
            if (r6 != 0) goto L37
            if (r3 == 0) goto L36
            goto L37
        L36:
            return
        L37:
            android.content.res.ColorStateList r6 = r5.k
            com.google.android.material.textfield.TextInputLayout r0 = r5.f1096a
            a.M8.c(r0, r2, r6)
            return
    }

    public final void g(int r9) {
            r8 = this;
            int r0 = r8.i
            if (r0 != r9) goto L5
            return
        L5:
            a.c6 r0 = r8.b()
            a.E5 r1 = r8.u
            android.view.accessibility.AccessibilityManager r2 = r8.t
            if (r1 == 0) goto L19
            if (r2 == 0) goto L19
            a.D r3 = new a.D
            r3.<init>(r1)
            r2.removeTouchExplorationStateChangeListener(r3)
        L19:
            r1 = 0
            r8.u = r1
            r0.s()
            r8.i = r9
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$g> r0 = r8.j
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r0.next()
            com.google.android.material.textfield.TextInputLayout$g r3 = (com.google.android.material.textfield.TextInputLayout.g) r3
            r3.a()
            goto L27
        L37:
            r0 = 1
            if (r9 == 0) goto L3c
            r3 = r0
            goto L3d
        L3c:
            r3 = 0
        L3d:
            r8.h(r3)
            a.c6 r3 = r8.b()
            com.google.android.material.textfield.a$d r4 = r8.h
            int r4 = r4.c
            if (r4 != 0) goto L4e
            int r4 = r3.d()
        L4e:
            if (r4 == 0) goto L59
            android.content.Context r5 = r8.getContext()
            android.graphics.drawable.Drawable r4 = a.C0435w1.A(r5, r4)
            goto L5a
        L59:
            r4 = r1
        L5a:
            com.google.android.material.internal.CheckableImageButton r5 = r8.g
            r5.setImageDrawable(r4)
            com.google.android.material.textfield.TextInputLayout r6 = r8.f1096a
            if (r4 == 0) goto L6f
            android.content.res.ColorStateList r4 = r8.k
            android.graphics.PorterDuff$Mode r7 = r8.l
            a.M8.a(r6, r5, r4, r7)
            android.content.res.ColorStateList r4 = r8.k
            a.M8.c(r6, r5, r4)
        L6f:
            int r4 = r3.c()
            if (r4 == 0) goto L7d
            android.content.res.Resources r1 = r8.getResources()
            java.lang.CharSequence r1 = r1.getText(r4)
        L7d:
            java.lang.CharSequence r4 = r5.getContentDescription()
            if (r4 == r1) goto L86
            r5.setContentDescription(r1)
        L86:
            boolean r1 = r3.k()
            r5.setCheckable(r1)
            int r1 = r6.getBoxBackgroundMode()
            boolean r1 = r3.i(r1)
            if (r1 == 0) goto Ld7
            r3.r()
            a.E5 r9 = r3.h()
            r8.u = r9
            if (r9 == 0) goto Lb6
            if (r2 == 0) goto Lb6
            java.util.WeakHashMap<android.view.View, a.Jg> r9 = a.C0414ug.f721a
            boolean r9 = r8.isAttachedToWindow()
            if (r9 == 0) goto Lb6
            a.E5 r9 = r8.u
            a.D r1 = new a.D
            r1.<init>(r9)
            r2.addTouchExplorationStateChangeListener(r1)
        Lb6:
            android.view.View$OnClickListener r9 = r3.f()
            android.view.View$OnLongClickListener r1 = r8.o
            r5.setOnClickListener(r9)
            a.M8.d(r5, r1)
            android.widget.EditText r9 = r8.s
            if (r9 == 0) goto Lcc
            r3.m(r9)
            r8.j(r3)
        Lcc:
            android.content.res.ColorStateList r9 = r8.k
            android.graphics.PorterDuff$Mode r1 = r8.l
            a.M8.a(r6, r5, r9, r1)
            r8.f(r0)
            return
        Ld7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The current box background mode "
            r1.<init>(r2)
            int r2 = r6.getBoxBackgroundMode()
            r1.append(r2)
            java.lang.String r2 = " is not supported by the end icon mode "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
    }

    public final void h(boolean r2) {
            r1 = this;
            boolean r0 = r1.d()
            if (r0 == r2) goto L1c
            if (r2 == 0) goto La
            r2 = 0
            goto Lc
        La:
            r2 = 8
        Lc:
            com.google.android.material.internal.CheckableImageButton r0 = r1.g
            r0.setVisibility(r2)
            r1.k()
            r1.m()
            com.google.android.material.textfield.TextInputLayout r2 = r1.f1096a
            r2.q()
        L1c:
            return
    }

    public final void i(android.graphics.drawable.Drawable r4) {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.c
            r0.setImageDrawable(r4)
            r3.l()
            android.content.res.ColorStateList r4 = r3.d
            android.graphics.PorterDuff$Mode r1 = r3.e
            com.google.android.material.textfield.TextInputLayout r2 = r3.f1096a
            a.M8.a(r2, r0, r4, r1)
            return
    }

    public final void j(a.AbstractC0082c6 r3) {
            r2 = this;
            android.widget.EditText r0 = r2.s
            if (r0 != 0) goto L5
            goto L23
        L5:
            android.view.View$OnFocusChangeListener r0 = r3.e()
            if (r0 == 0) goto L14
            android.widget.EditText r0 = r2.s
            android.view.View$OnFocusChangeListener r1 = r3.e()
            r0.setOnFocusChangeListener(r1)
        L14:
            android.view.View$OnFocusChangeListener r0 = r3.g()
            if (r0 == 0) goto L23
            com.google.android.material.internal.CheckableImageButton r0 = r2.g
            android.view.View$OnFocusChangeListener r3 = r3.g()
            r0.setOnFocusChangeListener(r3)
        L23:
            return
    }

    public final void k() {
            r4 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r4.g
            int r0 = r0.getVisibility()
            r1 = 8
            r2 = 0
            if (r0 != 0) goto L13
            boolean r0 = r4.e()
            if (r0 != 0) goto L13
            r0 = r2
            goto L14
        L13:
            r0 = r1
        L14:
            android.widget.FrameLayout r3 = r4.b
            r3.setVisibility(r0)
            java.lang.CharSequence r0 = r4.p
            if (r0 == 0) goto L23
            boolean r0 = r4.r
            if (r0 != 0) goto L23
            r0 = r2
            goto L24
        L23:
            r0 = r1
        L24:
            boolean r3 = r4.d()
            if (r3 != 0) goto L32
            boolean r3 = r4.e()
            if (r3 != 0) goto L32
            if (r0 != 0) goto L33
        L32:
            r1 = r2
        L33:
            r4.setVisibility(r1)
            return
    }

    public final void l() {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.c
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            com.google.android.material.textfield.TextInputLayout r2 = r3.f1096a
            if (r1 == 0) goto L18
            a.T8 r1 = r2.j
            boolean r1 = r1.q
            if (r1 == 0) goto L18
            boolean r1 = r2.m()
            if (r1 == 0) goto L18
            r1 = 0
            goto L1a
        L18:
            r1 = 8
        L1a:
            r0.setVisibility(r1)
            r3.k()
            r3.m()
            int r0 = r3.i
            if (r0 == 0) goto L28
            return
        L28:
            r2.q()
            return
    }

    public final void m() {
            r5 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r5.f1096a
            android.widget.EditText r1 = r0.d
            if (r1 != 0) goto L7
            return
        L7:
            boolean r1 = r5.d()
            if (r1 != 0) goto L1d
            boolean r1 = r5.e()
            if (r1 == 0) goto L14
            goto L1d
        L14:
            android.widget.EditText r1 = r0.d
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            int r1 = r1.getPaddingEnd()
            goto L1e
        L1d:
            r1 = 0
        L1e:
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.google.android.material.R.dimen.material_input_text_to_prefix_suffix_padding
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r0.d
            int r3 = r3.getPaddingTop()
            android.widget.EditText r0 = r0.d
            int r0 = r0.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, a.Jg> r4 = a.C0414ug.f721a
            a.r1 r4 = r5.q
            r4.setPaddingRelative(r2, r3, r1, r0)
            return
    }

    public final void n() {
            r4 = this;
            a.r1 r0 = r4.q
            int r1 = r0.getVisibility()
            java.lang.CharSequence r2 = r4.p
            r3 = 0
            if (r2 == 0) goto L11
            boolean r2 = r4.r
            if (r2 != 0) goto L11
            r2 = r3
            goto L13
        L11:
            r2 = 8
        L13:
            if (r1 == r2) goto L1f
            a.c6 r1 = r4.b()
            if (r2 != 0) goto L1c
            r3 = 1
        L1c:
            r1.p(r3)
        L1f:
            r4.k()
            r0.setVisibility(r2)
            com.google.android.material.textfield.TextInputLayout r0 = r4.f1096a
            r0.q()
            return
    }
}
