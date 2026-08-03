package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
class ChipTextInputComboView extends android.widget.FrameLayout implements android.widget.Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.material.chip.Chip f1101a;
    public final android.widget.EditText b;

    public class a extends a.C0072bf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.timepicker.ChipTextInputComboView f1102a;

        public a(com.google.android.material.timepicker.ChipTextInputComboView r1) {
                r0 = this;
                r0.<init>()
                r0.f1102a = r1
                return
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(android.text.Editable r5) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                java.lang.String r1 = "00"
                com.google.android.material.timepicker.ChipTextInputComboView r2 = r4.f1102a
                if (r0 == 0) goto L14
                com.google.android.material.chip.Chip r5 = r2.f1101a
                java.lang.String r0 = com.google.android.material.timepicker.ChipTextInputComboView.a(r2, r1)
                r5.setText(r0)
                return
            L14:
                java.lang.String r5 = com.google.android.material.timepicker.ChipTextInputComboView.a(r2, r5)
                com.google.android.material.chip.Chip r0 = r2.f1101a
                boolean r3 = android.text.TextUtils.isEmpty(r5)
                if (r3 == 0) goto L24
                java.lang.String r5 = com.google.android.material.timepicker.ChipTextInputComboView.a(r2, r1)
            L24:
                r0.setText(r5)
                return
        }
    }

    public ChipTextInputComboView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r5 = com.google.android.material.R.layout.material_time_chip
            android.view.View r5 = r4.inflate(r5, r3, r0)
            com.google.android.material.chip.Chip r5 = (com.google.android.material.chip.Chip) r5
            r3.f1101a = r5
            java.lang.String r1 = "android.view.View"
            r5.setAccessibilityClassName(r1)
            int r1 = com.google.android.material.R.layout.material_time_input
            android.view.View r4 = r4.inflate(r1, r3, r0)
            com.google.android.material.textfield.TextInputLayout r4 = (com.google.android.material.textfield.TextInputLayout) r4
            android.widget.EditText r1 = r4.getEditText()
            r3.b = r1
            r2 = 4
            r1.setVisibility(r2)
            com.google.android.material.timepicker.ChipTextInputComboView$a r2 = new com.google.android.material.timepicker.ChipTextInputComboView$a
            r2.<init>(r3)
            r1.addTextChangedListener(r2)
            android.content.Context r2 = r3.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            android.os.LocaleList r2 = r2.getLocales()
            r1.setImeHintLocales(r2)
            r3.addView(r5)
            r3.addView(r4)
            int r4 = com.google.android.material.R.id.material_label
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
            int r5 = android.view.View.generateViewId()
            r1.setId(r5)
            int r5 = r1.getId()
            r4.setLabelFor(r5)
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
            com.google.android.material.chip.Chip r0 = r1.f1101a
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
            com.google.android.material.chip.Chip r0 = r4.f1101a
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
            a.t5 r5 = new a.t5
            r0 = 3
            r5.<init>(r3, r0)
            r3.post(r5)
        L29:
            return
    }

    @Override // android.view.View
    public final void setOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.f1101a
            r0.setOnClickListener(r2)
            return
    }

    @Override // android.view.View
    public final void setTag(int r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.f1101a
            r0.setTag(r2, r3)
            return
    }

    @Override // android.widget.Checkable
    public final void toggle() {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.f1101a
            r0.toggle()
            return
    }
}
