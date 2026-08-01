package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import defpackage.q60;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q60 {
    public final /* synthetic */ ChipTextInputComboView a;

    public a(ChipTextInputComboView r1) {
        this.a = r1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r5) {
        boolean r0 = TextUtils.isEmpty(r5);
        ChipTextInputComboView r2 = this.a;
        if (r0 == false) goto L6;
        r2.a.setText(ChipTextInputComboView.a(r2, "00"));
        return;
    L6:
        String r52 = ChipTextInputComboView.a(r2, r5);
        Chip r02 = r2.a;
        if (TextUtils.isEmpty(r52) == false) goto L9;
        r52 = ChipTextInputComboView.a(r2, "00");
    L9:
        r02.setText(r52);
    }
}
