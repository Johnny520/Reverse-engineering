package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ej extends android.widget.LinearLayout {
    public final com.google.android.material.textfield.TextInputLayout a;
    public final android.widget.FrameLayout b;
    public final com.google.android.material.internal.CheckableImageButton c;
    public android.content.res.ColorStateList d;
    public android.graphics.PorterDuff.Mode e;
    public android.view.View.OnLongClickListener f;
    public final com.google.android.material.internal.CheckableImageButton g;
    public final defpackage.dj h;
    public int i;
    public final java.util.LinkedHashSet j;
    public android.content.res.ColorStateList k;
    public android.graphics.PorterDuff.Mode l;
    public int m;
    public android.widget.ImageView.ScaleType n;
    public android.view.View.OnLongClickListener o;
    public java.lang.CharSequence p;
    public final defpackage.g5 q;
    public boolean r;
    public android.widget.EditText s;
    public final android.view.accessibility.AccessibilityManager t;
    public defpackage.a0 u;
    public final defpackage.bj v;

    public ej(com.google.android.material.textfield.TextInputLayout r18, defpackage.r5 r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            android.content.Context r3 = r1.getContext()
            r0.<init>(r3)
            r3 = 0
            r0.i = r3
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r0.j = r4
            bj r4 = new bj
            r4.<init>(r0)
            r0.v = r4
            cj r4 = new cj
            r4.<init>(r0)
            android.content.Context r5 = r0.getContext()
            java.lang.String r6 = "accessibility"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.view.accessibility.AccessibilityManager r5 = (android.view.accessibility.AccessibilityManager) r5
            r0.t = r5
            r0.a = r1
            r5 = 8
            r0.setVisibility(r5)
            r0.setOrientation(r3)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = 8388613(0x800005, float:1.175495E-38)
            r8 = -2
            r9 = -1
            r6.<init>(r8, r9, r7)
            r0.setLayoutParams(r6)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            android.content.Context r7 = r0.getContext()
            r6.<init>(r7)
            r0.b = r6
            r6.setVisibility(r5)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r8, r9)
            r6.setLayoutParams(r7)
            android.content.Context r7 = r0.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r10 = 2131296662(0x7f090196, float:1.8211247E38)
            com.google.android.material.internal.CheckableImageButton r10 = r0.a(r0, r7, r10)
            r0.c = r10
            r11 = 2131296661(0x7f090195, float:1.8211245E38)
            com.google.android.material.internal.CheckableImageButton r7 = r0.a(r6, r7, r11)
            r0.g = r7
            dj r11 = new dj
            r11.<init>(r0, r2)
            r0.h = r11
            g5 r11 = new g5
            android.content.Context r12 = r0.getContext()
            r13 = 0
            r11.<init>(r12, r13)
            r0.q = r11
            java.lang.Object r12 = r2.b
            android.content.res.TypedArray r12 = (android.content.res.TypedArray) r12
            r14 = 38
            boolean r15 = r12.hasValue(r14)
            if (r15 == 0) goto La1
            android.content.Context r15 = r0.getContext()
            android.content.res.ColorStateList r14 = defpackage.ct.m(r15, r2, r14)
            r0.d = r14
        La1:
            r14 = 39
            boolean r15 = r12.hasValue(r14)
            if (r15 == 0) goto Lb3
            int r14 = r12.getInt(r14, r9)
            android.graphics.PorterDuff$Mode r14 = defpackage.gt.v(r14, r13)
            r0.e = r14
        Lb3:
            r14 = 37
            boolean r15 = r12.hasValue(r14)
            if (r15 == 0) goto Lc2
            android.graphics.drawable.Drawable r14 = r2.m(r14)
            r0.i(r14)
        Lc2:
            android.content.res.Resources r14 = r0.getResources()
            r15 = 2131755049(0x7f100029, float:1.9140966E38)
            java.lang.CharSequence r14 = r14.getText(r15)
            r10.setContentDescription(r14)
            java.util.WeakHashMap r14 = defpackage.ja0.a
            r14 = 2
            defpackage.s90.s(r10, r14)
            r10.setClickable(r3)
            r10.setPressable(r3)
            r10.setFocusable(r3)
            r14 = 53
            boolean r15 = r12.hasValue(r14)
            if (r15 != 0) goto L10b
            r15 = 32
            boolean r16 = r12.hasValue(r15)
            if (r16 == 0) goto Lf9
            android.content.Context r8 = r0.getContext()
            android.content.res.ColorStateList r8 = defpackage.ct.m(r8, r2, r15)
            r0.k = r8
        Lf9:
            r8 = 33
            boolean r15 = r12.hasValue(r8)
            if (r15 == 0) goto L10b
            int r8 = r12.getInt(r8, r9)
            android.graphics.PorterDuff$Mode r8 = defpackage.gt.v(r8, r13)
            r0.l = r8
        L10b:
            r8 = 30
            boolean r15 = r12.hasValue(r8)
            r5 = 1
            if (r15 == 0) goto L13a
            int r8 = r12.getInt(r8, r3)
            r0.g(r8)
            r8 = 27
            boolean r14 = r12.hasValue(r8)
            if (r14 == 0) goto L130
            java.lang.CharSequence r8 = r12.getText(r8)
            java.lang.CharSequence r14 = r7.getContentDescription()
            if (r14 == r8) goto L130
            r7.setContentDescription(r8)
        L130:
            r8 = 26
            boolean r8 = r12.getBoolean(r8, r5)
            r7.setCheckable(r8)
            goto L17a
        L13a:
            boolean r8 = r12.hasValue(r14)
            if (r8 == 0) goto L17a
            r8 = 54
            boolean r15 = r12.hasValue(r8)
            if (r15 == 0) goto L152
            android.content.Context r15 = r0.getContext()
            android.content.res.ColorStateList r8 = defpackage.ct.m(r15, r2, r8)
            r0.k = r8
        L152:
            r8 = 55
            boolean r15 = r12.hasValue(r8)
            if (r15 == 0) goto L164
            int r8 = r12.getInt(r8, r9)
            android.graphics.PorterDuff$Mode r8 = defpackage.gt.v(r8, r13)
            r0.l = r8
        L164:
            boolean r8 = r12.getBoolean(r14, r3)
            r0.g(r8)
            r8 = 51
            java.lang.CharSequence r8 = r12.getText(r8)
            java.lang.CharSequence r14 = r7.getContentDescription()
            if (r14 == r8) goto L17a
            r7.setContentDescription(r8)
        L17a:
            android.content.res.Resources r8 = r0.getResources()
            r14 = 2131165884(0x7f0702bc, float:1.7945998E38)
            int r8 = r8.getDimensionPixelSize(r14)
            r14 = 29
            int r8 = r12.getDimensionPixelSize(r14, r8)
            if (r8 < 0) goto L21f
            int r14 = r0.m
            if (r8 == r14) goto L19f
            r0.m = r8
            r7.setMinimumWidth(r8)
            r7.setMinimumHeight(r8)
            r10.setMinimumWidth(r8)
            r10.setMinimumHeight(r8)
        L19f:
            r8 = 31
            boolean r14 = r12.hasValue(r8)
            if (r14 == 0) goto L1b7
            int r8 = r12.getInt(r8, r9)
            android.widget.ImageView$ScaleType r8 = defpackage.ff.l(r8)
            r0.n = r8
            r7.setScaleType(r8)
            r10.setScaleType(r8)
        L1b7:
            r8 = 8
            r11.setVisibility(r8)
            r8 = 2131296669(0x7f09019d, float:1.8211261E38)
            r11.setId(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = 1117782016(0x42a00000, float:80.0)
            r14 = -2
            r8.<init>(r14, r14, r9)
            r11.setLayoutParams(r8)
            defpackage.v90.f(r11, r5)
            r8 = 72
            int r3 = r12.getResourceId(r8, r3)
            r11.setTextAppearance(r3)
            r3 = 73
            boolean r8 = r12.hasValue(r3)
            if (r8 == 0) goto L1e8
            android.content.res.ColorStateList r2 = r2.l(r3)
            r11.setTextColor(r2)
        L1e8:
            r2 = 71
            java.lang.CharSequence r2 = r12.getText(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L1f5
            goto L1f6
        L1f5:
            r13 = r2
        L1f6:
            r0.p = r13
            r11.setText(r2)
            r0.n()
            r6.addView(r7)
            r0.addView(r11)
            r0.addView(r6)
            r0.addView(r10)
            java.util.LinkedHashSet r2 = r1.e0
            r2.add(r4)
            android.widget.EditText r2 = r1.d
            if (r2 == 0) goto L216
            r4.a(r1)
        L216:
            q8 r1 = new q8
            r1.<init>(r5, r0)
            r0.addOnAttachStateChangeListener(r1)
            return
        L21f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "endIconSize cannot be less than 0"
            r1.<init>(r2)
            throw r1
    }

    public final com.google.android.material.internal.CheckableImageButton a(android.view.ViewGroup r3, android.view.LayoutInflater r4, int r5) {
            r2 = this;
            r0 = 2131492907(0x7f0c002b, float:1.860928E38)
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r3.setId(r5)
            android.content.Context r4 = r2.getContext()
            boolean r4 = defpackage.ct.s(r4)
            if (r4 == 0) goto L20
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            defpackage.et.h(r4, r1)
        L20:
            return r3
    }

    public final defpackage.fj b() {
            r5 = this;
            int r0 = r5.i
            dj r1 = r5.h
            android.util.SparseArray r2 = r1.a
            java.lang.Object r3 = r2.get(r0)
            fj r3 = (defpackage.fj) r3
            if (r3 != 0) goto L58
            ej r3 = r1.b
            r4 = -1
            if (r0 == r4) goto L4e
            if (r0 == 0) goto L47
            r4 = 1
            if (r0 == r4) goto L3e
            r1 = 2
            if (r0 == r1) goto L38
            r1 = 3
            if (r0 != r1) goto L24
            ph r1 = new ph
            r1.<init>(r3)
            goto L54
        L24:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid end icon mode: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L38:
            ua r1 = new ua
            r1.<init>(r3)
            goto L54
        L3e:
            mx r4 = new mx
            int r1 = r1.d
            r4.<init>(r3, r1)
            r1 = r4
            goto L54
        L47:
            ye r1 = new ye
            r4 = 1
            r1.<init>(r3, r4)
            goto L54
        L4e:
            ye r1 = new ye
            r4 = 0
            r1.<init>(r3, r4)
        L54:
            r2.append(r0, r1)
            return r1
        L58:
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
            int r0 = defpackage.et.c(r0)
            int r0 = r0 + r1
        L20:
            java.util.WeakHashMap r1 = defpackage.ja0.a
            int r1 = defpackage.t90.e(r3)
            g5 r2 = r3.q
            int r2 = defpackage.t90.e(r2)
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
            fj r0 = r5.b()
            boolean r1 = r0.j()
            com.google.android.material.internal.CheckableImageButton r2 = r5.g
            r3 = 1
            if (r1 == 0) goto L1b
            boolean r1 = r2.d
            boolean r4 = r0.k()
            if (r1 == r4) goto L1b
            r1 = r1 ^ r3
            r2.setChecked(r1)
            r1 = r3
            goto L1c
        L1b:
            r1 = 0
        L1c:
            boolean r4 = r0 instanceof defpackage.ph
            if (r4 == 0) goto L30
            boolean r4 = r2.isActivated()
            ph r0 = (defpackage.ph) r0
            boolean r0 = r0.l
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
            com.google.android.material.textfield.TextInputLayout r6 = r5.a
            android.content.res.ColorStateList r0 = r5.k
            defpackage.ff.K(r6, r2, r0)
            return
    }

    public final void g(int r9) {
            r8 = this;
            int r0 = r8.i
            if (r0 != r9) goto L5
            return
        L5:
            fj r0 = r8.b()
            a0 r1 = r8.u
            android.view.accessibility.AccessibilityManager r2 = r8.t
            if (r1 == 0) goto L14
            if (r2 == 0) goto L14
            defpackage.z.b(r2, r1)
        L14:
            r1 = 0
            r8.u = r1
            r0.r()
            r8.i = r9
            java.util.LinkedHashSet r0 = r8.j
            java.util.Iterator r0 = r0.iterator()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto Le3
            r0 = 1
            if (r9 == 0) goto L2d
            r3 = r0
            goto L2e
        L2d:
            r3 = 0
        L2e:
            r8.h(r3)
            fj r3 = r8.b()
            dj r4 = r8.h
            int r4 = r4.c
            if (r4 != 0) goto L3f
            int r4 = r3.d()
        L3f:
            if (r4 == 0) goto L4a
            android.content.Context r5 = r8.getContext()
            android.graphics.drawable.Drawable r4 = defpackage.ff.r(r5, r4)
            goto L4b
        L4a:
            r4 = r1
        L4b:
            com.google.android.material.internal.CheckableImageButton r5 = r8.g
            r5.setImageDrawable(r4)
            com.google.android.material.textfield.TextInputLayout r6 = r8.a
            if (r4 == 0) goto L60
            android.content.res.ColorStateList r4 = r8.k
            android.graphics.PorterDuff$Mode r7 = r8.l
            defpackage.ff.a(r6, r5, r4, r7)
            android.content.res.ColorStateList r4 = r8.k
            defpackage.ff.K(r6, r5, r4)
        L60:
            int r4 = r3.c()
            if (r4 == 0) goto L6e
            android.content.res.Resources r1 = r8.getResources()
            java.lang.CharSequence r1 = r1.getText(r4)
        L6e:
            java.lang.CharSequence r4 = r5.getContentDescription()
            if (r4 == r1) goto L77
            r5.setContentDescription(r1)
        L77:
            boolean r1 = r3.j()
            r5.setCheckable(r1)
            int r1 = r6.getBoxBackgroundMode()
            boolean r1 = r3.i(r1)
            if (r1 == 0) goto Lc3
            r3.q()
            a0 r9 = r3.h()
            r8.u = r9
            if (r9 == 0) goto La2
            if (r2 == 0) goto La2
            java.util.WeakHashMap r9 = defpackage.ja0.a
            boolean r9 = defpackage.v90.b(r8)
            if (r9 == 0) goto La2
            a0 r9 = r8.u
            defpackage.z.a(r2, r9)
        La2:
            android.view.View$OnClickListener r9 = r3.f()
            android.view.View$OnLongClickListener r1 = r8.o
            r5.setOnClickListener(r9)
            defpackage.ff.M(r5, r1)
            android.widget.EditText r9 = r8.s
            if (r9 == 0) goto Lb8
            r3.l(r9)
            r8.j(r3)
        Lb8:
            android.content.res.ColorStateList r9 = r8.k
            android.graphics.PorterDuff$Mode r1 = r8.l
            defpackage.ff.a(r6, r5, r9, r1)
            r8.f(r0)
            return
        Lc3:
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
        Le3:
            java.lang.ClassCastException r9 = defpackage.z30.h(r0)
            throw r9
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
            com.google.android.material.textfield.TextInputLayout r2 = r1.a
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
            com.google.android.material.textfield.TextInputLayout r2 = r3.a
            defpackage.ff.a(r2, r0, r4, r1)
            return
    }

    public final void j(defpackage.fj r3) {
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
            com.google.android.material.textfield.TextInputLayout r2 = r3.a
            if (r1 == 0) goto L18
            zo r1 = r2.j
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
            com.google.android.material.textfield.TextInputLayout r0 = r5.a
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
            java.util.WeakHashMap r2 = defpackage.ja0.a
            int r1 = defpackage.t90.e(r1)
            goto L1e
        L1d:
            r1 = 0
        L1e:
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131165754(0x7f07023a, float:1.7945734E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r0.d
            int r3 = r3.getPaddingTop()
            android.widget.EditText r0 = r0.d
            int r0 = r0.getPaddingBottom()
            java.util.WeakHashMap r4 = defpackage.ja0.a
            g5 r4 = r5.q
            defpackage.t90.k(r4, r2, r3, r1, r0)
            return
    }

    public final void n() {
            r4 = this;
            g5 r0 = r4.q
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
            fj r1 = r4.b()
            if (r2 != 0) goto L1c
            r3 = 1
        L1c:
            r1.o(r3)
        L1f:
            r4.k()
            r0.setVisibility(r2)
            com.google.android.material.textfield.TextInputLayout r0 = r4.a
            r0.q()
            return
    }
}
