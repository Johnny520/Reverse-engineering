package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
class ChipTextInputComboView extends android.widget.FrameLayout implements android.widget.Checkable {
    public final com.google.android.material.chip.Chip a;
    public final android.widget.EditText b;

    public ChipTextInputComboView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131492923(0x7f0c003b, float:1.8609312E38)
            android.view.View r5 = r4.inflate(r5, r3, r0)
            com.google.android.material.chip.Chip r5 = (com.google.android.material.chip.Chip) r5
            r3.a = r5
            java.lang.String r1 = "android.view.View"
            r5.setAccessibilityClassName(r1)
            r1 = 2131492924(0x7f0c003c, float:1.8609314E38)
            android.view.View r4 = r4.inflate(r1, r3, r0)
            com.google.android.material.textfield.TextInputLayout r4 = (com.google.android.material.textfield.TextInputLayout) r4
            android.widget.EditText r1 = r4.getEditText()
            r3.b = r1
            r2 = 4
            r1.setVisibility(r2)
            com.google.android.material.timepicker.a r2 = new com.google.android.material.timepicker.a
            r2.<init>(r3)
            r1.addTextChangedListener(r2)
            android.content.Context r2 = r3.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            android.os.LocaleList r2 = r2.getLocales()
            r1.setImeHintLocales(r2)
            r3.addView(r5)
            r3.addView(r4)
            r4 = 2131296480(0x7f0900e0, float:1.8210878E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.util.WeakHashMap r5 = defpackage.ja0.a
            int r5 = defpackage.t90.a()
            r1.setId(r5)
            int r5 = r1.getId()
            defpackage.t90.h(r4, r5)
            r1.setSaveEnabled(r0)
            r1.setLongClickable(r0)
            return
    }

    public static java.lang.String a(com.google.android.material.timepicker.ChipTextInputComboView r1, java.lang.CharSequence r2) {
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r0 = "%02d"
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.NumberFormatException -> L21
            java.util.Locale r1 = r1.locale     // Catch: java.lang.NumberFormatException -> L21
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L21
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L21
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.NumberFormatException -> L21
            java.lang.String r1 = java.lang.String.format(r1, r0, r2)     // Catch: java.lang.NumberFormatException -> L21
            return r1
        L21:
            r1 = 0
            return r1
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.a
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            android.content.Context r2 = r1.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            android.os.LocaleList r2 = r2.getLocales()
            android.widget.EditText r0 = r1.b
            r0.setImeHintLocales(r2)
            return
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean r5) {
            r4 = this;
            com.google.android.material.chip.Chip r0 = r4.a
            r0.setChecked(r5)
            r1 = 0
            if (r5 == 0) goto La
            r2 = r1
            goto Lb
        La:
            r2 = 4
        Lb:
            android.widget.EditText r3 = r4.b
            r3.setVisibility(r2)
            if (r5 == 0) goto L14
            r1 = 8
        L14:
            r0.setVisibility(r1)
            boolean r5 = r0.isChecked()
            if (r5 == 0) goto L29
            r3.requestFocus()
            gs r5 = new gs
            r0 = 6
            r5.<init>(r3, r0)
            r3.post(r5)
        L29:
            return
    }

    @Override // android.view.View
    public final void setOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.a
            r0.setOnClickListener(r2)
            return
    }

    @Override // android.view.View
    public final void setTag(int r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.a
            r0.setTag(r2, r3)
            return
    }

    @Override // android.widget.Checkable
    public final void toggle() {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.a
            r0.toggle()
            return
    }
}
