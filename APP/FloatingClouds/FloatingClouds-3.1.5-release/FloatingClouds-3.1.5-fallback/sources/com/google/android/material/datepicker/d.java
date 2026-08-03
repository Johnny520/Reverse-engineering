package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public final class d<S> extends a.DialogInterfaceOnCancelListenerC0206j5 {
    public int A0;
    public java.lang.CharSequence B0;
    public int C0;
    public java.lang.CharSequence D0;
    public int E0;
    public java.lang.CharSequence F0;
    public android.widget.TextView G0;
    public android.widget.TextView H0;
    public com.google.android.material.internal.CheckableImageButton I0;
    public a.Ta J0;
    public android.widget.Button K0;
    public boolean L0;
    public java.lang.CharSequence M0;
    public java.lang.CharSequence N0;
    public final java.util.LinkedHashSet<a.Qa<? super S>> k0;
    public final java.util.LinkedHashSet<android.view.View.OnClickListener> l0;
    public final java.util.LinkedHashSet<android.content.DialogInterface.OnCancelListener> m0;
    public final java.util.LinkedHashSet<android.content.DialogInterface.OnDismissListener> n0;
    public int o0;
    public a.I4<S> p0;
    public a.AbstractC0392tc<S> q0;
    public com.google.android.material.datepicker.a r0;
    public a.J4 s0;
    public com.google.android.material.datepicker.c<S> t0;
    public int u0;
    public java.lang.CharSequence v0;
    public boolean w0;
    public int x0;
    public int y0;
    public java.lang.CharSequence z0;

    public class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.datepicker.d f1072a;

        public a(com.google.android.material.datepicker.d r1) {
                r0 = this;
                r0.<init>()
                r0.f1072a = r1
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r4) {
                r3 = this;
                com.google.android.material.datepicker.d r4 = r3.f1072a
                java.util.LinkedHashSet<a.Qa<? super S>> r0 = r4.k0
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()
                a.Qa r1 = (a.Qa) r1
                a.I4 r2 = r4.H()
                r2.a()
                r1.a()
                goto L8
            L1f:
                r0 = 0
                r4.F(r0, r0)
                return
        }
    }

    public class b implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.datepicker.d f1073a;

        public b(com.google.android.material.datepicker.d r1) {
                r0 = this;
                r0.<init>()
                r0.f1073a = r1
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r4) {
                r3 = this;
                com.google.android.material.datepicker.d r0 = r3.f1073a
                java.util.LinkedHashSet<android.view.View$OnClickListener> r1 = r0.l0
                java.util.Iterator r1 = r1.iterator()
            L8:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L18
                java.lang.Object r2 = r1.next()
                android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
                r2.onClick(r4)
                goto L8
            L18:
                r4 = 0
                r0.F(r4, r4)
                return
        }
    }

    public class c extends a.AbstractC0142fc<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.datepicker.d f1074a;

        public c(com.google.android.material.datepicker.d r1) {
                r0 = this;
                r0.f1074a = r1
                r0.<init>()
                return
        }

        @Override // a.AbstractC0142fc
        public final void a(S r4) {
                r3 = this;
                com.google.android.material.datepicker.d r4 = r3.f1074a
                a.I4 r0 = r4.H()
                java.lang.String r0 = r0.c()
                android.widget.TextView r1 = r4.H0
                a.I4 r2 = r4.H()
                r4.A()
                java.lang.String r2 = r2.i()
                r1.setContentDescription(r2)
                android.widget.TextView r1 = r4.H0
                r1.setText(r0)
                android.widget.Button r0 = r4.K0
                a.I4 r4 = r4.H()
                boolean r4 = r4.h()
                r0.setEnabled(r4)
                return
        }
    }

    public d() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.k0 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.l0 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.m0 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.n0 = r0
            return
    }

    public static int I(android.content.Context r6) {
            android.content.res.Resources r6 = r6.getResources()
            int r0 = com.google.android.material.R.dimen.mtrl_calendar_content_padding
            int r0 = r6.getDimensionPixelOffset(r0)
            java.util.Calendar r1 = a.Zf.d()
            r2 = 5
            r3 = 1
            r1.set(r2, r3)
            java.util.Calendar r1 = a.Zf.c(r1)
            r4 = 2
            r1.get(r4)
            r1.get(r3)
            r5 = 7
            int r5 = r1.getMaximum(r5)
            r1.getActualMaximum(r2)
            r1.getTimeInMillis()
            int r1 = com.google.android.material.R.dimen.mtrl_calendar_day_width
            int r1 = r6.getDimensionPixelSize(r1)
            int r2 = com.google.android.material.R.dimen.mtrl_calendar_month_horizontal_padding
            int r6 = r6.getDimensionPixelOffset(r2)
            int r0 = r0 * r4
            int r1 = r1 * r5
            int r1 = r1 + r0
            int r5 = r5 - r3
            int r5 = r5 * r6
            int r5 = r5 + r1
            return r5
    }

    public static boolean J(android.content.Context r2, int r3) {
            int r0 = com.google.android.material.R.attr.materialCalendarStyle
            java.lang.Class<com.google.android.material.datepicker.c> r1 = com.google.android.material.datepicker.c.class
            java.lang.String r1 = r1.getCanonicalName()
            android.util.TypedValue r0 = a.C0498za.c(r2, r0, r1)
            int r0 = r0.data
            int[] r3 = new int[]{r3}
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r0, r3)
            r3 = 0
            boolean r3 = r2.getBoolean(r3, r3)
            r2.recycle()
            return r3
    }

    @Override // a.DialogInterfaceOnCancelListenerC0206j5
    public final android.app.Dialog G() {
            r6 = this;
            android.app.Dialog r0 = new android.app.Dialog
            android.content.Context r1 = r6.A()
            r6.A()
            int r2 = r6.o0
            if (r2 == 0) goto Le
            goto L16
        Le:
            a.I4 r2 = r6.H()
            int r2 = r2.d()
        L16:
            r0.<init>(r1, r2)
            android.content.Context r1 = r0.getContext()
            r2 = 16843277(0x101020d, float:2.369503E-38)
            boolean r2 = J(r1, r2)
            r6.w0 = r2
            a.Ta r2 = new a.Ta
            int r3 = com.google.android.material.R.attr.materialCalendarStyle
            int r4 = com.google.android.material.R.style.Widget_MaterialComponents_MaterialCalendar
            r5 = 0
            r2.<init>(r1, r5, r3, r4)
            r6.J0 = r2
            int[] r2 = com.google.android.material.R.styleable.MaterialCalendar
            int r3 = com.google.android.material.R.attr.materialCalendarStyle
            int r4 = com.google.android.material.R.style.Widget_MaterialComponents_MaterialCalendar
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r5, r2, r3, r4)
            int r3 = com.google.android.material.R.styleable.MaterialCalendar_backgroundTint
            r4 = 0
            int r3 = r2.getColor(r3, r4)
            r2.recycle()
            a.Ta r2 = r6.J0
            r2.i(r1)
            a.Ta r1 = r6.J0
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r3)
            r1.k(r2)
            a.Ta r1 = r6.J0
            android.view.Window r2 = r0.getWindow()
            android.view.View r2 = r2.getDecorView()
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            float r2 = a.C0414ug.d.i(r2)
            r1.j(r2)
            return r0
    }

    public final a.I4<S> H() {
            r2 = this;
            a.I4<S> r0 = r2.p0
            if (r0 != 0) goto L10
            android.os.Bundle r0 = r2.f
            java.lang.String r1 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            a.I4 r0 = (a.I4) r0
            r2.p0 = r0
        L10:
            a.I4<S> r0 = r2.p0
            return r0
    }

    public final void K() {
            r8 = this;
            r8.A()
            int r0 = r8.o0
            if (r0 == 0) goto L8
            goto L10
        L8:
            a.I4 r0 = r8.H()
            int r0 = r0.d()
        L10:
            a.I4 r1 = r8.H()
            com.google.android.material.datepicker.a r2 = r8.r0
            a.J4 r3 = r8.s0
            com.google.android.material.datepicker.c r4 = new com.google.android.material.datepicker.c
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "THEME_RES_ID_KEY"
            r5.putInt(r6, r0)
            java.lang.String r7 = "GRID_SELECTOR_KEY"
            r5.putParcelable(r7, r1)
            java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
            r5.putParcelable(r1, r2)
            java.lang.String r7 = "DAY_VIEW_DECORATOR_KEY"
            r5.putParcelable(r7, r3)
            a.tb r2 = r2.d
            java.lang.String r3 = "CURRENT_MONTH_KEY"
            r5.putParcelable(r3, r2)
            r4.E(r5)
            r8.t0 = r4
            int r2 = r8.x0
            r3 = 1
            if (r2 != r3) goto L66
            a.I4 r2 = r8.H()
            com.google.android.material.datepicker.a r4 = r8.r0
            a.Ua r5 = new a.Ua
            r5.<init>()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r7.putInt(r6, r0)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r7.putParcelable(r0, r2)
            r7.putParcelable(r1, r4)
            r5.E(r7)
            r4 = r5
        L66:
            r8.q0 = r4
            android.widget.TextView r0 = r8.G0
            int r1 = r8.x0
            r2 = 2
            if (r1 != r3) goto L82
            android.content.Context r1 = r8.A()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            if (r1 != r2) goto L82
            java.lang.CharSequence r1 = r8.N0
            goto L84
        L82:
            java.lang.CharSequence r1 = r8.M0
        L84:
            r0.setText(r1)
            a.I4 r0 = r8.H()
            java.lang.String r0 = r0.c()
            android.widget.TextView r1 = r8.H0
            a.I4 r3 = r8.H()
            r8.A()
            java.lang.String r3 = r3.i()
            r1.setContentDescription(r3)
            android.widget.TextView r1 = r8.H0
            r1.setText(r0)
            a.e7 r0 = r8.c()
            r0.getClass()
            a.S1 r1 = new a.S1
            r1.<init>(r0)
            int r0 = com.google.android.material.R.id.mtrl_calendar_frame
            a.tc<S> r3 = r8.q0
            if (r0 == 0) goto Ld7
            r4 = 0
            r1.e(r0, r3, r4, r2)
            boolean r0 = r1.g
            if (r0 != 0) goto Lcf
            a.e7 r0 = r1.q
            r2 = 0
            r0.A(r1, r2)
            a.tc<S> r0 = r8.q0
            com.google.android.material.datepicker.d$c r1 = new com.google.android.material.datepicker.d$c
            r1.<init>(r8)
            r0.F(r1)
            return
        Lcf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This transaction is already being added to the back stack"
            r0.<init>(r1)
            throw r0
        Ld7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must use non-zero containerViewId"
            r0.<init>(r1)
            throw r0
    }

    public final void L(com.google.android.material.internal.CheckableImageButton r3) {
            r2 = this;
            int r0 = r2.x0
            r1 = 1
            if (r0 != r1) goto L10
            android.content.Context r3 = r3.getContext()
            int r0 = com.google.android.material.R.string.mtrl_picker_toggle_to_calendar_input_mode
            java.lang.String r3 = r3.getString(r0)
            goto L1a
        L10:
            android.content.Context r3 = r3.getContext()
            int r0 = com.google.android.material.R.string.mtrl_picker_toggle_to_text_input_mode
            java.lang.String r3 = r3.getString(r0)
        L1a:
            com.google.android.material.internal.CheckableImageButton r0 = r2.I0
            r0.setContentDescription(r3)
            return
    }

    @Override // a.DialogInterfaceOnCancelListenerC0206j5, androidx.fragment.app.b
    public final void o(android.os.Bundle r4) {
            r3 = this;
            super.o(r4)
            if (r4 != 0) goto L7
            android.os.Bundle r4 = r3.f
        L7:
            java.lang.String r0 = "OVERRIDE_THEME_RES_ID"
            int r0 = r4.getInt(r0)
            r3.o0 = r0
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            a.I4 r0 = (a.I4) r0
            r3.p0 = r0
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            com.google.android.material.datepicker.a r0 = (com.google.android.material.datepicker.a) r0
            r3.r0 = r0
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            a.J4 r0 = (a.J4) r0
            r3.s0 = r0
            java.lang.String r0 = "TITLE_TEXT_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.u0 = r0
            java.lang.String r0 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.v0 = r0
            java.lang.String r0 = "INPUT_MODE_KEY"
            int r0 = r4.getInt(r0)
            r3.x0 = r0
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.y0 = r0
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.z0 = r0
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.A0 = r0
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.B0 = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.C0 = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.D0 = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.E0 = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r4 = r4.getCharSequence(r0)
            r3.F0 = r4
            java.lang.CharSequence r4 = r3.v0
            if (r4 == 0) goto L8a
            goto L98
        L8a:
            android.content.Context r4 = r3.A()
            android.content.res.Resources r4 = r4.getResources()
            int r0 = r3.u0
            java.lang.CharSequence r4 = r4.getText(r0)
        L98:
            r3.M0 = r4
            if (r4 == 0) goto Lae
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "\n"
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r1)
            int r1 = r0.length
            r2 = 1
            if (r1 <= r2) goto Laf
            r4 = 0
            r4 = r0[r4]
            goto Laf
        Lae:
            r4 = 0
        Laf:
            r3.N0 = r4
            return
    }

    @Override // a.DialogInterfaceOnCancelListenerC0206j5, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r3) {
            r2 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnCancelListener> r0 = r2.m0
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

    @Override // a.DialogInterfaceOnCancelListenerC0206j5, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnDismissListener> r0 = r2.n0
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            r1.onDismiss(r3)
            goto L6
        L16:
            android.view.View r0 = r2.G
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L1f
            r0.removeAllViews()
        L1f:
            super.onDismiss(r3)
            return
    }

    @Override // androidx.fragment.app.b
    public final android.view.View p(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
            r5 = this;
            boolean r8 = r5.w0
            if (r8 == 0) goto L7
            int r8 = com.google.android.material.R.layout.mtrl_picker_fullscreen
            goto L9
        L7:
            int r8 = com.google.android.material.R.layout.mtrl_picker_dialog
        L9:
            android.view.View r6 = r6.inflate(r8, r7)
            android.content.Context r7 = r6.getContext()
            boolean r8 = r5.w0
            if (r8 == 0) goto L29
            int r8 = com.google.android.material.R.id.mtrl_calendar_frame
            android.view.View r8 = r6.findViewById(r8)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r1 = I(r7)
            r2 = -2
            r0.<init>(r1, r2)
            r8.setLayoutParams(r0)
            goto L3c
        L29:
            int r8 = com.google.android.material.R.id.mtrl_calendar_main_pane
            android.view.View r8 = r6.findViewById(r8)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r1 = I(r7)
            r2 = -1
            r0.<init>(r1, r2)
            r8.setLayoutParams(r0)
        L3c:
            int r8 = com.google.android.material.R.id.mtrl_picker_header_selection_text
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r5.H0 = r8
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            r0 = 1
            r8.setAccessibilityLiveRegion(r0)
            int r8 = com.google.android.material.R.id.mtrl_picker_header_toggle
            android.view.View r8 = r6.findViewById(r8)
            com.google.android.material.internal.CheckableImageButton r8 = (com.google.android.material.internal.CheckableImageButton) r8
            r5.I0 = r8
            int r8 = com.google.android.material.R.id.mtrl_picker_title_text
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r5.G0 = r8
            com.google.android.material.internal.CheckableImageButton r8 = r5.I0
            java.lang.String r1 = "TOGGLE_BUTTON_TAG"
            r8.setTag(r1)
            com.google.android.material.internal.CheckableImageButton r8 = r5.I0
            android.graphics.drawable.StateListDrawable r1 = new android.graphics.drawable.StateListDrawable
            r1.<init>()
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r2 = new int[]{r2}
            int r3 = com.google.android.material.R.drawable.material_ic_calendar_black_24dp
            android.graphics.drawable.Drawable r3 = a.C0435w1.A(r7, r3)
            r1.addState(r2, r3)
            r2 = 0
            int[] r3 = new int[r2]
            int r4 = com.google.android.material.R.drawable.material_ic_edit_black_24dp
            android.graphics.drawable.Drawable r7 = a.C0435w1.A(r7, r4)
            r1.addState(r3, r7)
            r8.setImageDrawable(r1)
            com.google.android.material.internal.CheckableImageButton r7 = r5.I0
            int r8 = r5.x0
            if (r8 == 0) goto L95
            r8 = r0
            goto L96
        L95:
            r8 = r2
        L96:
            r7.setChecked(r8)
            com.google.android.material.internal.CheckableImageButton r7 = r5.I0
            r8 = 0
            a.C0414ug.j(r7, r8)
            com.google.android.material.internal.CheckableImageButton r7 = r5.I0
            r5.L(r7)
            com.google.android.material.internal.CheckableImageButton r7 = r5.I0
            a.h3 r8 = new a.h3
            r1 = 6
            r8.<init>(r1, r5)
            r7.setOnClickListener(r8)
            int r7 = com.google.android.material.R.id.confirm_button
            android.view.View r7 = r6.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r5.K0 = r7
            a.I4 r7 = r5.H()
            boolean r7 = r7.h()
            if (r7 == 0) goto Lc9
            android.widget.Button r7 = r5.K0
            r7.setEnabled(r0)
            goto Lce
        Lc9:
            android.widget.Button r7 = r5.K0
            r7.setEnabled(r2)
        Lce:
            android.widget.Button r7 = r5.K0
            java.lang.String r8 = "CONFIRM_BUTTON_TAG"
            r7.setTag(r8)
            java.lang.CharSequence r7 = r5.z0
            if (r7 == 0) goto Ldf
            android.widget.Button r8 = r5.K0
            r8.setText(r7)
            goto Le8
        Ldf:
            int r7 = r5.y0
            if (r7 == 0) goto Le8
            android.widget.Button r8 = r5.K0
            r8.setText(r7)
        Le8:
            java.lang.CharSequence r7 = r5.B0
            if (r7 == 0) goto Lf2
            android.widget.Button r8 = r5.K0
            r8.setContentDescription(r7)
            goto L109
        Lf2:
            int r7 = r5.A0
            if (r7 == 0) goto L109
            android.widget.Button r7 = r5.K0
            android.content.Context r8 = r5.d()
            android.content.res.Resources r8 = r8.getResources()
            int r0 = r5.A0
            java.lang.CharSequence r8 = r8.getText(r0)
            r7.setContentDescription(r8)
        L109:
            android.widget.Button r7 = r5.K0
            com.google.android.material.datepicker.d$a r8 = new com.google.android.material.datepicker.d$a
            r8.<init>(r5)
            r7.setOnClickListener(r8)
            int r7 = com.google.android.material.R.id.cancel_button
            android.view.View r7 = r6.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            java.lang.String r8 = "CANCEL_BUTTON_TAG"
            r7.setTag(r8)
            java.lang.CharSequence r8 = r5.D0
            if (r8 == 0) goto L128
            r7.setText(r8)
            goto L12f
        L128:
            int r8 = r5.C0
            if (r8 == 0) goto L12f
            r7.setText(r8)
        L12f:
            java.lang.CharSequence r8 = r5.F0
            if (r8 == 0) goto L137
            r7.setContentDescription(r8)
            goto L14c
        L137:
            int r8 = r5.E0
            if (r8 == 0) goto L14c
            android.content.Context r8 = r5.d()
            android.content.res.Resources r8 = r8.getResources()
            int r0 = r5.E0
            java.lang.CharSequence r8 = r8.getText(r0)
            r7.setContentDescription(r8)
        L14c:
            com.google.android.material.datepicker.d$b r8 = new com.google.android.material.datepicker.d$b
            r8.<init>(r5)
            r7.setOnClickListener(r8)
            return r6
    }

    @Override // a.DialogInterfaceOnCancelListenerC0206j5, androidx.fragment.app.b
    public final void t(android.os.Bundle r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            super.t(r19)
            java.lang.String r2 = "OVERRIDE_THEME_RES_ID"
            int r3 = r0.o0
            r1.putInt(r2, r3)
            java.lang.String r2 = "DATE_SELECTOR_KEY"
            a.I4<S> r3 = r0.p0
            r1.putParcelable(r2, r3)
            com.google.android.material.datepicker.a$b r2 = new com.google.android.material.datepicker.a$b
            com.google.android.material.datepicker.a r3 = r0.r0
            r2.<init>()
            int r4 = com.google.android.material.datepicker.a.b.c
            int r4 = com.google.android.material.datepicker.a.b.c
            com.google.android.material.datepicker.b r4 = new com.google.android.material.datepicker.b
            r5 = -9223372036854775808
            r4.<init>(r5)
            r2.b = r4
            a.tb r4 = r3.f1067a
            long r4 = r4.f
            a.tb r6 = r3.b
            long r6 = r6.f
            a.tb r8 = r3.d
            long r8 = r8.f
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r2.f1068a = r8
            com.google.android.material.datepicker.a$c r8 = r3.c
            r2.b = r8
            com.google.android.material.datepicker.c<S> r9 = r0.t0
            r10 = 0
            if (r9 != 0) goto L46
            r9 = r10
            goto L48
        L46:
            a.tb r9 = r9.a0
        L48:
            if (r9 == 0) goto L52
            long r11 = r9.f
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r2.f1068a = r9
        L52:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r11 = "DEEP_COPY_VALIDATOR_KEY"
            r9.putParcelable(r11, r8)
            com.google.android.material.datepicker.a r12 = new com.google.android.material.datepicker.a
            a.tb r13 = a.C0391tb.l(r4)
            a.tb r14 = a.C0391tb.l(r6)
            android.os.Parcelable r4 = r9.getParcelable(r11)
            r15 = r4
            com.google.android.material.datepicker.a$c r15 = (com.google.android.material.datepicker.a.c) r15
            java.lang.Long r2 = r2.f1068a
            if (r2 != 0) goto L74
        L71:
            r16 = r10
            goto L7d
        L74:
            long r4 = r2.longValue()
            a.tb r10 = a.C0391tb.l(r4)
            goto L71
        L7d:
            int r2 = r3.e
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.String r2 = "CALENDAR_CONSTRAINTS_KEY"
            r1.putParcelable(r2, r12)
            java.lang.String r2 = "DAY_VIEW_DECORATOR_KEY"
            a.J4 r3 = r0.s0
            r1.putParcelable(r2, r3)
            java.lang.String r2 = "TITLE_TEXT_RES_ID_KEY"
            int r3 = r0.u0
            r1.putInt(r2, r3)
            java.lang.String r2 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r3 = r0.v0
            r1.putCharSequence(r2, r3)
            java.lang.String r2 = "INPUT_MODE_KEY"
            int r3 = r0.x0
            r1.putInt(r2, r3)
            java.lang.String r2 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
            int r3 = r0.y0
            r1.putInt(r2, r3)
            java.lang.String r2 = "POSITIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r3 = r0.z0
            r1.putCharSequence(r2, r3)
            java.lang.String r2 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r3 = r0.A0
            r1.putInt(r2, r3)
            java.lang.String r2 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r3 = r0.B0
            r1.putCharSequence(r2, r3)
            java.lang.String r2 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
            int r3 = r0.C0
            r1.putInt(r2, r3)
            java.lang.String r2 = "NEGATIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r3 = r0.D0
            r1.putCharSequence(r2, r3)
            java.lang.String r2 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r3 = r0.E0
            r1.putInt(r2, r3)
            java.lang.String r2 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r3 = r0.F0
            r1.putCharSequence(r2, r3)
            return
    }

    @Override // a.DialogInterfaceOnCancelListenerC0206j5, androidx.fragment.app.b
    public final void u() {
            r11 = this;
            super.u()
            android.app.Dialog r0 = r11.g0
            java.lang.String r1 = " does not have a Dialog."
            java.lang.String r2 = "DialogFragment "
            if (r0 == 0) goto L14b
            android.view.Window r0 = r0.getWindow()
            boolean r3 = r11.w0
            if (r3 == 0) goto Lfe
            r1 = -1
            r0.setLayout(r1, r1)
            a.Ta r1 = r11.J0
            r0.setBackgroundDrawable(r1)
            boolean r1 = r11.L0
            if (r1 == 0) goto L22
            goto L132
        L22:
            android.view.View r1 = r11.B()
            int r2 = com.google.android.material.R.id.fullscreen_header
            android.view.View r1 = r1.findViewById(r2)
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            android.content.res.ColorStateList r2 = a.C0475y5.a(r2)
            if (r2 == 0) goto L3f
            int r2 = r2.getDefaultColor()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L40
        L3f:
            r2 = 0
        L40:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L4f
            int r6 = r2.intValue()
            if (r6 != 0) goto L4d
            goto L4f
        L4d:
            r6 = r4
            goto L50
        L4f:
            r6 = r5
        L50:
            android.content.Context r7 = r0.getContext()
            r8 = 16842801(0x1010031, float:2.3693695E-38)
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r7 = a.Na.a(r7, r8, r9)
            if (r6 == 0) goto L63
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
        L63:
            r6 = 30
            if (r3 < r6) goto L6b
            a.kh.a(r0, r4)
            goto L78
        L6b:
            android.view.View r3 = r0.getDecorView()
            int r8 = r3.getSystemUiVisibility()
            r8 = r8 | 1792(0x700, float:2.511E-42)
            r3.setSystemUiVisibility(r8)
        L78:
            r0.getContext()
            r0.getContext()
            r0.setStatusBarColor(r4)
            r0.setNavigationBarColor(r4)
            int r2 = r2.intValue()
            boolean r2 = a.Na.c(r2)
            boolean r3 = a.Na.c(r4)
            if (r3 != 0) goto L97
            if (r2 == 0) goto L95
            goto L97
        L95:
            r2 = r4
            goto L98
        L97:
            r2 = r5
        L98:
            android.view.View r3 = r0.getDecorView()
            a.ke r8 = new a.ke
            r8.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r6) goto Lb1
            a.th r3 = new a.th
            android.view.WindowInsetsController r9 = a.F.k(r0)
            r3.<init>(r9, r8)
            r3.c = r0
            goto Lb6
        Lb1:
            a.rh r3 = new a.rh
            r3.<init>(r0, r8)
        Lb6:
            r3.y(r2)
            boolean r2 = a.Na.c(r7)
            boolean r3 = a.Na.c(r4)
            if (r3 != 0) goto Lc5
            if (r2 == 0) goto Lc6
        Lc5:
            r4 = r5
        Lc6:
            android.view.View r2 = r0.getDecorView()
            a.ke r3 = new a.ke
            r3.<init>(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r6) goto Ldf
            a.th r2 = new a.th
            android.view.WindowInsetsController r6 = a.F.k(r0)
            r2.<init>(r6, r3)
            r2.c = r0
            goto Le4
        Ldf:
            a.rh r2 = new a.rh
            r2.<init>(r0, r3)
        Le4:
            r2.x(r4)
            int r0 = r1.getPaddingTop()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r2 = r2.height
            a.Oa r3 = new a.Oa
            r3.<init>(r1, r2, r0)
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            a.C0414ug.d.u(r1, r3)
            r11.L0 = r5
            goto L132
        Lfe:
            r3 = -2
            r0.setLayout(r3, r3)
            android.content.Context r3 = r11.A()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = com.google.android.material.R.dimen.mtrl_calendar_dialog_background_inset
            int r7 = r3.getDimensionPixelOffset(r4)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r7, r7, r7, r7)
            android.graphics.drawable.InsetDrawable r5 = new android.graphics.drawable.InsetDrawable
            a.Ta r6 = r11.J0
            r8 = r7
            r9 = r7
            r10 = r7
            r5.<init>(r6, r7, r8, r9, r10)
            r0.setBackgroundDrawable(r5)
            android.view.View r0 = r0.getDecorView()
            a.Z8 r4 = new a.Z8
            android.app.Dialog r5 = r11.g0
            if (r5 == 0) goto L136
            r4.<init>(r5, r3)
            r0.setOnTouchListener(r4)
        L132:
            r11.K()
            return
        L136:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r11)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L14b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r11)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // a.DialogInterfaceOnCancelListenerC0206j5, androidx.fragment.app.b
    public final void v() {
            r1 = this;
            a.tc<S> r0 = r1.q0
            java.util.LinkedHashSet<a.fc<S>> r0 = r0.V
            r0.clear()
            super.v()
            return
    }
}
