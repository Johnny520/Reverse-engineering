package a;

/* JADX INFO: renamed from: a.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"ViewConstructor"})
public final class C0376se extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.material.textfield.TextInputLayout f689a;
    public final a.C0345r1 b;
    public java.lang.CharSequence c;
    public final com.google.android.material.internal.CheckableImageButton d;
    public android.content.res.ColorStateList e;
    public android.graphics.PorterDuff.Mode f;
    public int g;
    public android.widget.ImageView.ScaleType h;
    public android.view.View.OnLongClickListener i;
    public boolean j;

    public C0376se(com.google.android.material.textfield.TextInputLayout r12, a.C0306of r13) {
            r11 = this;
            android.content.Context r0 = r12.getContext()
            r11.<init>(r0)
            r11.f689a = r12
            r12 = 8
            r11.setVisibility(r12)
            r0 = 0
            r11.setOrientation(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -2
            r3 = -1
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r1.<init>(r2, r3, r4)
            r11.setLayoutParams(r1)
            android.content.Context r1 = r11.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r4 = com.google.android.material.R.layout.design_text_input_start_icon
            android.view.View r1 = r1.inflate(r4, r11, r0)
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            r11.d = r1
            a.r1 r4 = new a.r1
            android.content.Context r5 = r11.getContext()
            r6 = 0
            r4.<init>(r5, r6)
            r11.b = r4
            android.content.Context r5 = r11.getContext()
            boolean r5 = a.Sa.d(r5)
            if (r5 == 0) goto L50
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            r5.setMarginEnd(r0)
        L50:
            android.view.View$OnLongClickListener r5 = r11.i
            r1.setOnClickListener(r6)
            a.M8.d(r1, r5)
            r11.i = r6
            r1.setOnLongClickListener(r6)
            a.M8.d(r1, r6)
            int r5 = com.google.android.material.R.styleable.TextInputLayout_startIconTint
            android.content.res.TypedArray r7 = r13.b
            boolean r5 = r7.hasValue(r5)
            if (r5 == 0) goto L76
            android.content.Context r5 = r11.getContext()
            int r8 = com.google.android.material.R.styleable.TextInputLayout_startIconTint
            android.content.res.ColorStateList r5 = a.Sa.a(r5, r13, r8)
            r11.e = r5
        L76:
            int r5 = com.google.android.material.R.styleable.TextInputLayout_startIconTintMode
            boolean r5 = r7.hasValue(r5)
            if (r5 == 0) goto L8a
            int r5 = com.google.android.material.R.styleable.TextInputLayout_startIconTintMode
            int r5 = r7.getInt(r5, r3)
            android.graphics.PorterDuff$Mode r5 = a.Rg.b(r5, r6)
            r11.f = r5
        L8a:
            int r5 = com.google.android.material.R.styleable.TextInputLayout_startIconDrawable
            boolean r5 = r7.hasValue(r5)
            r8 = 1
            if (r5 == 0) goto Lbc
            int r5 = com.google.android.material.R.styleable.TextInputLayout_startIconDrawable
            android.graphics.drawable.Drawable r5 = r13.b(r5)
            r11.b(r5)
            int r5 = com.google.android.material.R.styleable.TextInputLayout_startIconContentDescription
            boolean r5 = r7.hasValue(r5)
            if (r5 == 0) goto Lb3
            int r5 = com.google.android.material.R.styleable.TextInputLayout_startIconContentDescription
            java.lang.CharSequence r5 = r7.getText(r5)
            java.lang.CharSequence r9 = r1.getContentDescription()
            if (r9 == r5) goto Lb3
            r1.setContentDescription(r5)
        Lb3:
            int r5 = com.google.android.material.R.styleable.TextInputLayout_startIconCheckable
            boolean r5 = r7.getBoolean(r5, r8)
            r1.setCheckable(r5)
        Lbc:
            int r5 = com.google.android.material.R.styleable.TextInputLayout_startIconMinSize
            android.content.res.Resources r9 = r11.getResources()
            int r10 = com.google.android.material.R.dimen.mtrl_min_touch_target_size
            int r9 = r9.getDimensionPixelSize(r10)
            int r5 = r7.getDimensionPixelSize(r5, r9)
            if (r5 < 0) goto L13d
            int r9 = r11.g
            if (r5 == r9) goto Lda
            r11.g = r5
            r1.setMinimumWidth(r5)
            r1.setMinimumHeight(r5)
        Lda:
            int r5 = com.google.android.material.R.styleable.TextInputLayout_startIconScaleType
            boolean r5 = r7.hasValue(r5)
            if (r5 == 0) goto Lf1
            int r5 = com.google.android.material.R.styleable.TextInputLayout_startIconScaleType
            int r3 = r7.getInt(r5, r3)
            android.widget.ImageView$ScaleType r3 = a.M8.b(r3)
            r11.h = r3
            r1.setScaleType(r3)
        Lf1:
            r4.setVisibility(r12)
            int r12 = com.google.android.material.R.id.textinput_prefix_text
            r4.setId(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r2, r2)
            r4.setLayoutParams(r12)
            java.util.WeakHashMap<android.view.View, a.Jg> r12 = a.C0414ug.f721a
            r4.setAccessibilityLiveRegion(r8)
            int r12 = com.google.android.material.R.styleable.TextInputLayout_prefixTextAppearance
            int r12 = r7.getResourceId(r12, r0)
            r4.setTextAppearance(r12)
            int r12 = com.google.android.material.R.styleable.TextInputLayout_prefixTextColor
            boolean r12 = r7.hasValue(r12)
            if (r12 == 0) goto L120
            int r12 = com.google.android.material.R.styleable.TextInputLayout_prefixTextColor
            android.content.res.ColorStateList r12 = r13.a(r12)
            r4.setTextColor(r12)
        L120:
            int r12 = com.google.android.material.R.styleable.TextInputLayout_prefixText
            java.lang.CharSequence r12 = r7.getText(r12)
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 == 0) goto L12d
            goto L12e
        L12d:
            r6 = r12
        L12e:
            r11.c = r6
            r4.setText(r12)
            r11.e()
            r11.addView(r1)
            r11.addView(r4)
            return
        L13d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "startIconSize cannot be less than 0"
            r12.<init>(r13)
            throw r12
    }

    public final int a() {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.d
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L18
            int r1 = r0.getMeasuredWidth()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.getMarginEnd()
            int r0 = r0 + r1
            goto L19
        L18:
            r0 = 0
        L19:
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            int r1 = r3.getPaddingStart()
            a.r1 r2 = r3.b
            int r2 = r2.getPaddingStart()
            int r2 = r2 + r1
            int r2 = r2 + r0
            return r2
    }

    public final void b(android.graphics.drawable.Drawable r4) {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.d
            r0.setImageDrawable(r4)
            if (r4 == 0) goto L1a
            android.content.res.ColorStateList r4 = r3.e
            android.graphics.PorterDuff$Mode r1 = r3.f
            com.google.android.material.textfield.TextInputLayout r2 = r3.f689a
            a.M8.a(r2, r0, r4, r1)
            r4 = 1
            r3.c(r4)
            android.content.res.ColorStateList r4 = r3.e
            a.M8.c(r2, r0, r4)
            return
        L1a:
            r4 = 0
            r3.c(r4)
            android.view.View$OnLongClickListener r4 = r3.i
            r1 = 0
            r0.setOnClickListener(r1)
            a.M8.d(r0, r4)
            r3.i = r1
            r0.setOnLongClickListener(r1)
            a.M8.d(r0, r1)
            java.lang.CharSequence r4 = r0.getContentDescription()
            if (r4 == 0) goto L38
            r0.setContentDescription(r1)
        L38:
            return
    }

    public final void c(boolean r4) {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.d
            int r1 = r0.getVisibility()
            r2 = 0
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = r2
        Lc:
            if (r1 == r4) goto L1c
            if (r4 == 0) goto L11
            goto L13
        L11:
            r2 = 8
        L13:
            r0.setVisibility(r2)
            r3.d()
            r3.e()
        L1c:
            return
    }

    public final void d() {
            r5 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r5.f689a
            android.widget.EditText r0 = r0.d
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.material.internal.CheckableImageButton r1 = r5.d
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L11
            r1 = 0
            goto L17
        L11:
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            int r1 = r0.getPaddingStart()
        L17:
            int r2 = r0.getCompoundPaddingTop()
            android.content.Context r3 = r5.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = com.google.android.material.R.dimen.material_input_text_to_prefix_suffix_padding
            int r3 = r3.getDimensionPixelSize(r4)
            int r0 = r0.getCompoundPaddingBottom()
            java.util.WeakHashMap<android.view.View, a.Jg> r4 = a.C0414ug.f721a
            a.r1 r4 = r5.b
            r4.setPaddingRelative(r1, r2, r3, r0)
            return
    }

    public final void e() {
            r4 = this;
            java.lang.CharSequence r0 = r4.c
            r1 = 8
            r2 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r4.j
            if (r0 != 0) goto Ld
            r0 = r2
            goto Le
        Ld:
            r0 = r1
        Le:
            com.google.android.material.internal.CheckableImageButton r3 = r4.d
            int r3 = r3.getVisibility()
            if (r3 == 0) goto L18
            if (r0 != 0) goto L19
        L18:
            r1 = r2
        L19:
            r4.setVisibility(r1)
            a.r1 r1 = r4.b
            r1.setVisibility(r0)
            com.google.android.material.textfield.TextInputLayout r0 = r4.f689a
            r0.q()
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            r0.d()
            return
    }
}
