package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p081s0.AbstractC1076j;

/* JADX INFO: renamed from: com.google.android.material.timepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0723a extends AbstractC1076j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ChipTextInputComboView f2547a;

    public C0723a(ChipTextInputComboView r1) {
        this.f2547a = r1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r5) {
        boolean r02 = TextUtils.isEmpty(r5);
        ChipTextInputComboView r2 = this.f2547a;
        if (r02 == false) goto L6;
        r2.f2515a.setText(ChipTextInputComboView.m1911a(r2, "00"));
        return;
    L6:
        String r52 = ChipTextInputComboView.m1911a(r2, r5);
        Chip r03 = r2.f2515a;
        if (TextUtils.isEmpty(r52) == false) goto L9;
        r52 = ChipTextInputComboView.m1911a(r2, "00");
    L9:
        r03.setText(r52);
    }
}
