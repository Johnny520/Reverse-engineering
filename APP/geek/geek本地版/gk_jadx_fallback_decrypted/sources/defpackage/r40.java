package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r40 extends android.widget.LinearLayout {
    public final com.google.android.material.textfield.TextInputLayout a;
    public final defpackage.g5 b;
    public java.lang.CharSequence c;
    public final com.google.android.material.internal.CheckableImageButton d;
    public android.content.res.ColorStateList e;
    public android.graphics.PorterDuff.Mode f;
    public int g;
    public android.widget.ImageView.ScaleType h;
    public android.view.View.OnLongClickListener i;
    public boolean j;

    public r40(com.google.android.material.textfield.TextInputLayout r11, defpackage.r5 r12) {
            r10 = this;
            android.content.Context r0 = r11.getContext()
            r10.<init>(r0)
            r10.a = r11
            r11 = 8
            r10.setVisibility(r11)
            r0 = 0
            r10.setOrientation(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r3 = -2
            r4 = -1
            r1.<init>(r3, r4, r2)
            r10.setLayoutParams(r1)
            android.content.Context r1 = r10.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131492908(0x7f0c002c, float:1.8609281E38)
            android.view.View r1 = r1.inflate(r2, r10, r0)
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            r10.d = r1
            g5 r2 = new g5
            android.content.Context r5 = r10.getContext()
            r6 = 0
            r2.<init>(r5, r6)
            r10.b = r2
            android.content.Context r5 = r10.getContext()
            boolean r5 = defpackage.ct.s(r5)
            if (r5 == 0) goto L51
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            defpackage.et.g(r5, r0)
        L51:
            android.view.View$OnLongClickListener r5 = r10.i
            r1.setOnClickListener(r6)
            defpackage.ff.M(r1, r5)
            r10.i = r6
            r1.setOnLongClickListener(r6)
            defpackage.ff.M(r1, r6)
            java.lang.Object r5 = r12.b
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r7 = 69
            boolean r8 = r5.hasValue(r7)
            if (r8 == 0) goto L77
            android.content.Context r8 = r10.getContext()
            android.content.res.ColorStateList r7 = defpackage.ct.m(r8, r12, r7)
            r10.e = r7
        L77:
            r7 = 70
            boolean r8 = r5.hasValue(r7)
            if (r8 == 0) goto L89
            int r7 = r5.getInt(r7, r4)
            android.graphics.PorterDuff$Mode r7 = defpackage.gt.v(r7, r6)
            r10.f = r7
        L89:
            r7 = 66
            boolean r8 = r5.hasValue(r7)
            r9 = 1
            if (r8 == 0) goto Lb7
            android.graphics.drawable.Drawable r7 = r12.m(r7)
            r10.b(r7)
            r7 = 65
            boolean r8 = r5.hasValue(r7)
            if (r8 == 0) goto Lae
            java.lang.CharSequence r7 = r5.getText(r7)
            java.lang.CharSequence r8 = r1.getContentDescription()
            if (r8 == r7) goto Lae
            r1.setContentDescription(r7)
        Lae:
            r7 = 64
            boolean r7 = r5.getBoolean(r7, r9)
            r1.setCheckable(r7)
        Lb7:
            android.content.res.Resources r7 = r10.getResources()
            r8 = 2131165884(0x7f0702bc, float:1.7945998E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r8 = 67
            int r7 = r5.getDimensionPixelSize(r8, r7)
            if (r7 < 0) goto L136
            int r8 = r10.g
            if (r7 == r8) goto Ld6
            r10.g = r7
            r1.setMinimumWidth(r7)
            r1.setMinimumHeight(r7)
        Ld6:
            r7 = 68
            boolean r8 = r5.hasValue(r7)
            if (r8 == 0) goto Leb
            int r4 = r5.getInt(r7, r4)
            android.widget.ImageView$ScaleType r4 = defpackage.ff.l(r4)
            r10.h = r4
            r1.setScaleType(r4)
        Leb:
            r2.setVisibility(r11)
            r11 = 2131296668(0x7f09019c, float:1.821126E38)
            r2.setId(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r3, r3)
            r2.setLayoutParams(r11)
            java.util.WeakHashMap r11 = defpackage.ja0.a
            defpackage.v90.f(r2, r9)
            r11 = 60
            int r11 = r5.getResourceId(r11, r0)
            r2.setTextAppearance(r11)
            r11 = 61
            boolean r0 = r5.hasValue(r11)
            if (r0 == 0) goto L119
            android.content.res.ColorStateList r11 = r12.l(r11)
            r2.setTextColor(r11)
        L119:
            r11 = 59
            java.lang.CharSequence r11 = r5.getText(r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L126
            goto L127
        L126:
            r6 = r11
        L127:
            r10.c = r6
            r2.setText(r11)
            r10.e()
            r10.addView(r1)
            r10.addView(r2)
            return
        L136:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "startIconSize cannot be less than 0"
            r11.<init>(r12)
            throw r11
    }

    public final int a() {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.d
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L18
            int r1 = r0.getMeasuredWidth()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = defpackage.et.b(r0)
            int r0 = r0 + r1
            goto L19
        L18:
            r0 = 0
        L19:
            java.util.WeakHashMap r1 = defpackage.ja0.a
            int r1 = defpackage.t90.f(r3)
            g5 r2 = r3.b
            int r2 = defpackage.t90.f(r2)
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
            com.google.android.material.textfield.TextInputLayout r2 = r3.a
            defpackage.ff.a(r2, r0, r4, r1)
            r4 = 1
            r3.c(r4)
            android.content.res.ColorStateList r4 = r3.e
            defpackage.ff.K(r2, r0, r4)
            return
        L1a:
            r4 = 0
            r3.c(r4)
            android.view.View$OnLongClickListener r4 = r3.i
            r1 = 0
            r0.setOnClickListener(r1)
            defpackage.ff.M(r0, r4)
            r3.i = r1
            r0.setOnLongClickListener(r1)
            defpackage.ff.M(r0, r1)
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
            com.google.android.material.textfield.TextInputLayout r0 = r5.a
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
            java.util.WeakHashMap r1 = defpackage.ja0.a
            int r1 = defpackage.t90.f(r0)
        L17:
            int r2 = r0.getCompoundPaddingTop()
            android.content.Context r3 = r5.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165754(0x7f07023a, float:1.7945734E38)
            int r3 = r3.getDimensionPixelSize(r4)
            int r0 = r0.getCompoundPaddingBottom()
            java.util.WeakHashMap r4 = defpackage.ja0.a
            g5 r4 = r5.b
            defpackage.t90.k(r4, r1, r2, r3, r0)
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
            g5 r1 = r4.b
            r1.setVisibility(r0)
            com.google.android.material.textfield.TextInputLayout r0 = r4.a
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
