package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
public final class a extends defpackage.q60 {
    public final /* synthetic */ com.google.android.material.timepicker.ChipTextInputComboView a;

    public a(com.google.android.material.timepicker.ChipTextInputComboView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = "00"
            com.google.android.material.timepicker.ChipTextInputComboView r2 = r4.a
            if (r0 == 0) goto L14
            com.google.android.material.chip.Chip r5 = r2.a
            java.lang.String r0 = com.google.android.material.timepicker.ChipTextInputComboView.a(r2, r1)
            r5.setText(r0)
            return
        L14:
            java.lang.String r5 = com.google.android.material.timepicker.ChipTextInputComboView.a(r2, r5)
            com.google.android.material.chip.Chip r0 = r2.a
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L24
            java.lang.String r5 = com.google.android.material.timepicker.ChipTextInputComboView.a(r2, r1)
        L24:
            r0.setText(r5)
            return
    }
}
