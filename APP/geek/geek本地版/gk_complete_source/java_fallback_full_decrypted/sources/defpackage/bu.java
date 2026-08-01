package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bu<S> extends defpackage.rg {
    public java.lang.CharSequence A0;
    public java.lang.CharSequence B0;
    public final java.util.LinkedHashSet e0;
    public final java.util.LinkedHashSet f0;
    public int g0;
    public defpackage.px h0;
    public defpackage.c8 i0;
    public defpackage.ut j0;
    public int k0;
    public java.lang.CharSequence l0;
    public boolean m0;
    public int n0;
    public int o0;
    public java.lang.CharSequence p0;
    public int q0;
    public java.lang.CharSequence r0;
    public int s0;
    public java.lang.CharSequence t0;
    public int u0;
    public java.lang.CharSequence v0;
    public android.widget.TextView w0;
    public com.google.android.material.internal.CheckableImageButton x0;
    public defpackage.eu y0;
    public boolean z0;

    public bu() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.e0 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f0 = r0
            return
    }

    public static int F(android.content.Context r6) {
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131165807(0x7f07026f, float:1.7945842E38)
            int r0 = r6.getDimensionPixelOffset(r0)
            java.util.Calendar r1 = defpackage.u80.b()
            r2 = 5
            r3 = 1
            r1.set(r2, r3)
            java.util.Calendar r1 = defpackage.u80.a(r1)
            r4 = 2
            r1.get(r4)
            r1.get(r3)
            r5 = 7
            int r5 = r1.getMaximum(r5)
            r1.getActualMaximum(r2)
            r1.getTimeInMillis()
            r1 = 2131165813(0x7f070275, float:1.7945854E38)
            int r1 = r6.getDimensionPixelSize(r1)
            r2 = 2131165827(0x7f070283, float:1.7945882E38)
            int r6 = r6.getDimensionPixelOffset(r2)
            int r0 = r0 * r4
            int r1 = r1 * r5
            int r1 = r1 + r0
            int r5 = r5 - r3
            int r5 = r5 * r6
            int r5 = r5 + r1
            return r5
    }

    public static boolean G(android.content.Context r2, int r3) {
            java.lang.Class<ut> r0 = defpackage.ut.class
            java.lang.String r0 = r0.getCanonicalName()
            r1 = 2130969278(0x7f0402be, float:1.7547233E38)
            android.util.TypedValue r0 = defpackage.gt.A(r2, r1, r0)
            int r0 = r0.data
            int[] r3 = new int[]{r3}
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r0, r3)
            r3 = 0
            boolean r3 = r2.getBoolean(r3, r3)
            r2.recycle()
            return r3
    }

    @Override // defpackage.rg
    public final android.app.Dialog D() {
            r6 = this;
            android.app.Dialog r0 = new android.app.Dialog
            android.content.Context r1 = r6.z()
            r6.z()
            int r2 = r6.g0
            r3 = 0
            if (r2 == 0) goto L5c
            r0.<init>(r1, r2)
            android.content.Context r1 = r0.getContext()
            r2 = 16843277(0x101020d, float:2.369503E-38)
            boolean r2 = G(r1, r2)
            r6.m0 = r2
            eu r2 = new eu
            r4 = 2130969278(0x7f0402be, float:1.7547233E38)
            r5 = 2131821587(0x7f110413, float:1.9275921E38)
            r2.<init>(r1, r3, r4, r5)
            r6.y0 = r2
            int[] r2 = defpackage.wy.l
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r3, r2, r4, r5)
            r3 = 1
            r4 = 0
            int r3 = r2.getColor(r3, r4)
            r2.recycle()
            eu r2 = r6.y0
            r2.h(r1)
            eu r1 = r6.y0
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r3)
            r1.j(r2)
            eu r1 = r6.y0
            android.view.Window r2 = r0.getWindow()
            android.view.View r2 = r2.getDecorView()
            java.util.WeakHashMap r3 = defpackage.ja0.a
            float r2 = defpackage.y90.i(r2)
            r1.i(r2)
            return r0
        L5c:
            r6.E()
            throw r3
    }

    public final void E() {
            r2 = this;
            android.os.Bundle r0 = r2.f
            java.lang.String r1 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // defpackage.rg, defpackage.ml
    public final void m(android.os.Bundle r4) {
            r3 = this;
            super.m(r4)
            if (r4 != 0) goto L7
            android.os.Bundle r4 = r3.f
        L7:
            java.lang.String r0 = "OVERRIDE_THEME_RES_ID"
            int r0 = r4.getInt(r0)
            r3.g0 = r0
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            if (r0 != 0) goto Lb4
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            c8 r0 = (defpackage.c8) r0
            r3.i0 = r0
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            if (r0 != 0) goto Lae
            java.lang.String r0 = "TITLE_TEXT_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.k0 = r0
            java.lang.String r0 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.l0 = r0
            java.lang.String r0 = "INPUT_MODE_KEY"
            int r0 = r4.getInt(r0)
            r3.n0 = r0
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.o0 = r0
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.p0 = r0
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.q0 = r0
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.r0 = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.s0 = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.t0 = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.u0 = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r4 = r4.getCharSequence(r0)
            r3.v0 = r4
            java.lang.CharSequence r4 = r3.l0
            if (r4 == 0) goto L86
            goto L94
        L86:
            android.content.Context r4 = r3.z()
            android.content.res.Resources r4 = r4.getResources()
            int r0 = r3.k0
            java.lang.CharSequence r4 = r4.getText(r0)
        L94:
            r3.A0 = r4
            if (r4 == 0) goto Laa
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "\n"
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r1)
            int r1 = r0.length
            r2 = 1
            if (r1 <= r2) goto Lab
            r4 = 0
            r4 = r0[r4]
            goto Lab
        Laa:
            r4 = 0
        Lab:
            r3.B0 = r4
            return
        Lae:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        Lb4:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
    }

    @Override // defpackage.ml
    public final android.view.View n(android.view.LayoutInflater r7, android.view.ViewGroup r8) {
            r6 = this;
            boolean r0 = r6.m0
            if (r0 == 0) goto L8
            r0 = 2131492950(0x7f0c0056, float:1.8609366E38)
            goto Lb
        L8:
            r0 = 2131492949(0x7f0c0055, float:1.8609364E38)
        Lb:
            android.view.View r7 = r7.inflate(r0, r8)
            android.content.Context r8 = r7.getContext()
            boolean r0 = r6.m0
            if (r0 == 0) goto L2c
            r0 = 2131296504(0x7f0900f8, float:1.8210927E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            int r2 = F(r8)
            r3 = -2
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            goto L40
        L2c:
            r0 = 2131296505(0x7f0900f9, float:1.8210929E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            int r2 = F(r8)
            r3 = -1
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
        L40:
            r0 = 2131296516(0x7f090104, float:1.821095E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.WeakHashMap r1 = defpackage.ja0.a
            r1 = 1
            defpackage.v90.f(r0, r1)
            r0 = 2131296518(0x7f090106, float:1.8210955E38)
            android.view.View r0 = r7.findViewById(r0)
            com.google.android.material.internal.CheckableImageButton r0 = (com.google.android.material.internal.CheckableImageButton) r0
            r6.x0 = r0
            r0 = 2131296522(0x7f09010a, float:1.8210963E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.w0 = r0
            com.google.android.material.internal.CheckableImageButton r0 = r6.x0
            java.lang.String r2 = "TOGGLE_BUTTON_TAG"
            r0.setTag(r2)
            com.google.android.material.internal.CheckableImageButton r0 = r6.x0
            android.graphics.drawable.StateListDrawable r2 = new android.graphics.drawable.StateListDrawable
            r2.<init>()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r3 = new int[]{r3}
            r4 = 2131230882(0x7f0800a2, float:1.807783E38)
            android.graphics.drawable.Drawable r4 = defpackage.ff.r(r8, r4)
            r2.addState(r3, r4)
            r3 = 0
            int[] r4 = new int[r3]
            r5 = 2131230884(0x7f0800a4, float:1.8077833E38)
            android.graphics.drawable.Drawable r8 = defpackage.ff.r(r8, r5)
            r2.addState(r4, r8)
            r0.setImageDrawable(r2)
            com.google.android.material.internal.CheckableImageButton r8 = r6.x0
            int r0 = r6.n0
            if (r0 == 0) goto L9b
            r3 = r1
        L9b:
            r8.setChecked(r3)
            com.google.android.material.internal.CheckableImageButton r8 = r6.x0
            r0 = 0
            defpackage.ja0.l(r8, r0)
            com.google.android.material.internal.CheckableImageButton r8 = r6.x0
            int r2 = r6.n0
            if (r2 != r1) goto Lb6
            android.content.Context r8 = r8.getContext()
            r1 = 2131755142(0x7f100086, float:1.9141155E38)
            java.lang.String r8 = r8.getString(r1)
            goto Lc1
        Lb6:
            android.content.Context r8 = r8.getContext()
            r1 = 2131755144(0x7f100088, float:1.9141159E38)
            java.lang.String r8 = r8.getString(r1)
        Lc1:
            com.google.android.material.internal.CheckableImageButton r1 = r6.x0
            r1.setContentDescription(r8)
            com.google.android.material.internal.CheckableImageButton r8 = r6.x0
            qa r1 = new qa
            r2 = 5
            r1.<init>(r2, r6)
            r8.setOnClickListener(r1)
            r8 = 2131296363(0x7f09006b, float:1.821064E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.Button r7 = (android.widget.Button) r7
            r6.E()
            throw r0
    }

    @Override // defpackage.rg, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r3) {
            r2 = this;
            java.util.LinkedHashSet r0 = r2.e0
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnCancelListener r1 = (android.content.DialogInterface.OnCancelListener) r1
            r1.onCancel(r3)
            goto L6
        L16:
            return
    }

    @Override // defpackage.rg, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            java.util.LinkedHashSet r0 = r2.f0
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            r1.onDismiss(r3)
            goto L6
        L16:
            android.view.View r0 = r2.E
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L1f
            r0.removeAllViews()
        L1f:
            super.onDismiss(r3)
            return
    }

    @Override // defpackage.rg, defpackage.ml
    public final void r(android.os.Bundle r15) {
            r14 = this;
            super.r(r15)
            java.lang.String r0 = "OVERRIDE_THEME_RES_ID"
            int r1 = r14.g0
            r15.putInt(r0, r1)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r1 = 0
            r15.putParcelable(r0, r1)
            b8 r0 = new b8
            c8 r2 = r14.i0
            r0.<init>()
            int r3 = defpackage.b8.b
            int r3 = defpackage.b8.b
            zv r3 = r2.a
            long r3 = r3.f
            zv r5 = r2.b
            long r5 = r5.f
            zv r7 = r2.d
            long r7 = r7.f
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0.a = r7
            int r13 = r2.e
            cf r2 = r2.c
            ut r7 = r14.j0
            if (r7 != 0) goto L37
            r7 = r1
            goto L39
        L37:
            zv r7 = r7.U
        L39:
            if (r7 == 0) goto L43
            long r7 = r7.f
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0.a = r7
        L43:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r8 = "DEEP_COPY_VALIDATOR_KEY"
            r7.putParcelable(r8, r2)
            r2 = r8
            c8 r8 = new c8
            zv r9 = defpackage.zv.b(r3)
            zv r10 = defpackage.zv.b(r5)
            android.os.Parcelable r2 = r7.getParcelable(r2)
            r11 = r2
            cf r11 = (defpackage.cf) r11
            java.lang.Long r0 = r0.a
            if (r0 != 0) goto L65
            r12 = r1
            goto L6e
        L65:
            long r2 = r0.longValue()
            zv r0 = defpackage.zv.b(r2)
            r12 = r0
        L6e:
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            r15.putParcelable(r0, r8)
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            r15.putParcelable(r0, r1)
            java.lang.String r0 = "TITLE_TEXT_RES_ID_KEY"
            int r1 = r14.k0
            r15.putInt(r0, r1)
            java.lang.String r0 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r1 = r14.l0
            r15.putCharSequence(r0, r1)
            java.lang.String r0 = "INPUT_MODE_KEY"
            int r1 = r14.n0
            r15.putInt(r0, r1)
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
            int r1 = r14.o0
            r15.putInt(r0, r1)
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r1 = r14.p0
            r15.putCharSequence(r0, r1)
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r1 = r14.q0
            r15.putInt(r0, r1)
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r1 = r14.r0
            r15.putCharSequence(r0, r1)
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
            int r1 = r14.s0
            r15.putInt(r0, r1)
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r1 = r14.t0
            r15.putCharSequence(r0, r1)
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r1 = r14.u0
            r15.putInt(r0, r1)
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r1 = r14.v0
            r15.putCharSequence(r0, r1)
            return
    }

    @Override // defpackage.rg, defpackage.ml
    public final void s() {
            r13 = this;
            super.s()
            android.app.Dialog r0 = r13.a0
            java.lang.String r1 = " does not have a Dialog."
            java.lang.String r2 = "DialogFragment "
            if (r0 == 0) goto L1cc
            android.view.Window r0 = r0.getWindow()
            boolean r3 = r13.m0
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L102
            r1 = -1
            r0.setLayout(r1, r1)
            eu r1 = r13.y0
            r0.setBackgroundDrawable(r1)
            boolean r1 = r13.z0
            if (r1 != 0) goto L137
            android.view.View r1 = r13.A()
            r2 = 2131296429(0x7f0900ad, float:1.8210774E38)
            android.view.View r1 = r1.findViewById(r2)
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            android.content.res.ColorStateList r2 = defpackage.ff.o(r2)
            if (r2 == 0) goto L40
            int r2 = r2.getDefaultColor()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L41
        L40:
            r2 = r5
        L41:
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 0
            if (r2 == 0) goto L4f
            int r7 = r2.intValue()
            if (r7 != 0) goto L4d
            goto L4f
        L4d:
            r7 = r6
            goto L50
        L4f:
            r7 = r4
        L50:
            android.content.Context r8 = r0.getContext()
            r9 = 16842801(0x1010031, float:2.3693695E-38)
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r8 = defpackage.zt.j(r8, r9, r10)
            if (r7 == 0) goto L63
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
        L63:
            r7 = 30
            if (r3 < r7) goto L6b
            defpackage.vb0.a(r0, r6)
            goto L6e
        L6b:
            defpackage.ub0.a(r0, r6)
        L6e:
            r0.getContext()
            android.content.Context r9 = r0.getContext()
            r11 = 27
            if (r3 >= r11) goto L87
            r3 = 16843858(0x1010452, float:2.3696658E-38)
            int r3 = defpackage.zt.j(r9, r3, r10)
            r9 = 128(0x80, float:1.8E-43)
            int r3 = defpackage.ib.d(r3, r9)
            goto L88
        L87:
            r3 = r6
        L88:
            r0.setStatusBarColor(r6)
            r0.setNavigationBarColor(r3)
            int r2 = r2.intValue()
            boolean r2 = defpackage.zt.z(r2)
            boolean r9 = defpackage.zt.z(r6)
            if (r9 != 0) goto La1
            if (r2 == 0) goto L9f
            goto La1
        L9f:
            r2 = r6
            goto La2
        La1:
            r2 = r4
        La2:
            android.view.View r9 = r0.getDecorView()
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r7) goto Lb6
            yc0 r9 = new yc0
            android.view.WindowInsetsController r10 = defpackage.uc0.b(r0)
            r9.<init>(r10)
            r9.b = r0
            goto Lbc
        Lb6:
            xc0 r10 = new xc0
            r10.<init>(r0, r9)
            r9 = r10
        Lbc:
            r9.C(r2)
            boolean r2 = defpackage.zt.z(r8)
            boolean r8 = defpackage.zt.z(r3)
            if (r8 != 0) goto Lcd
            if (r3 != 0) goto Lce
            if (r2 == 0) goto Lce
        Lcd:
            r6 = r4
        Lce:
            android.view.View r2 = r0.getDecorView()
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r7) goto Le2
            yc0 r2 = new yc0
            android.view.WindowInsetsController r3 = defpackage.uc0.b(r0)
            r2.<init>(r3)
            r2.b = r0
            goto Le8
        Le2:
            xc0 r3 = new xc0
            r3.<init>(r0, r2)
            r2 = r3
        Le8:
            r2.B(r6)
            int r0 = r1.getPaddingTop()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r2 = r2.height
            au r3 = new au
            r3.<init>(r1, r2, r0)
            java.util.WeakHashMap r0 = defpackage.ja0.a
            defpackage.y90.u(r1, r3)
            r13.z0 = r4
            goto L137
        L102:
            r3 = -2
            r0.setLayout(r3, r3)
            android.content.Context r3 = r13.z()
            android.content.res.Resources r3 = r3.getResources()
            r6 = 2131165815(0x7f070277, float:1.7945858E38)
            int r9 = r3.getDimensionPixelOffset(r6)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r9, r9, r9, r9)
            android.graphics.drawable.InsetDrawable r7 = new android.graphics.drawable.InsetDrawable
            eu r8 = r13.y0
            r10 = r9
            r11 = r9
            r12 = r9
            r7.<init>(r8, r9, r10, r11, r12)
            r0.setBackgroundDrawable(r7)
            android.view.View r0 = r0.getDecorView()
            cp r6 = new cp
            android.app.Dialog r7 = r13.a0
            if (r7 == 0) goto L1b7
            r6.<init>(r7, r3)
            r0.setOnTouchListener(r6)
        L137:
            r13.z()
            int r0 = r13.g0
            if (r0 == 0) goto L1b3
            r13.E()
            c8 r1 = r13.i0
            ut r2 = new ut
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r6 = "THEME_RES_ID_KEY"
            r3.putInt(r6, r0)
            java.lang.String r7 = "GRID_SELECTOR_KEY"
            r3.putParcelable(r7, r5)
            java.lang.String r7 = "CALENDAR_CONSTRAINTS_KEY"
            r3.putParcelable(r7, r1)
            java.lang.String r8 = "DAY_VIEW_DECORATOR_KEY"
            r3.putParcelable(r8, r5)
            java.lang.String r8 = "CURRENT_MONTH_KEY"
            zv r1 = r1.d
            r3.putParcelable(r8, r1)
            r2.C(r3)
            r13.j0 = r2
            int r1 = r13.n0
            if (r1 != r4) goto L18e
            r13.E()
            c8 r1 = r13.i0
            fu r2 = new fu
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r3.putInt(r6, r0)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r3.putParcelable(r0, r5)
            r3.putParcelable(r7, r1)
            r2.C(r3)
        L18e:
            r13.h0 = r2
            android.widget.TextView r0 = r13.w0
            int r1 = r13.n0
            if (r1 != r4) goto L1aa
            android.content.Context r1 = r13.z()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r2 = 2
            if (r1 != r2) goto L1aa
            java.lang.CharSequence r1 = r13.B0
            goto L1ac
        L1aa:
            java.lang.CharSequence r1 = r13.A0
        L1ac:
            r0.setText(r1)
            r13.E()
            throw r5
        L1b3:
            r13.E()
            throw r5
        L1b7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r13)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L1cc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r13)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.rg, defpackage.ml
    public final void t() {
            r1 = this;
            px r0 = r1.h0
            java.util.LinkedHashSet r0 = r0.R
            r0.clear()
            super.t()
            return
    }
}
