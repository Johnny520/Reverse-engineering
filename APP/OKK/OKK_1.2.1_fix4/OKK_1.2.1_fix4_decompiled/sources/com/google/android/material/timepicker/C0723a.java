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

    public C0723a(ChipTextInputComboView chipTextInputComboView) {
        this.f2547a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f2547a;
        if (zIsEmpty) {
            chipTextInputComboView.f2515a.setText(ChipTextInputComboView.m1911a(chipTextInputComboView, "00"));
            return;
        }
        String strM1911a = ChipTextInputComboView.m1911a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f2515a;
        if (TextUtils.isEmpty(strM1911a)) {
            strM1911a = ChipTextInputComboView.m1911a(chipTextInputComboView, "00");
        }
        chip.setText(strM1911a);
    }
}
