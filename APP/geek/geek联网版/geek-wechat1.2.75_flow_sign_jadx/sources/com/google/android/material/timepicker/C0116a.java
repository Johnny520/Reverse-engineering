package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p000.w60;

/* JADX INFO: renamed from: com.google.android.material.timepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0116a extends w60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ChipTextInputComboView f1207a;

    public C0116a(ChipTextInputComboView chipTextInputComboView) {
        this.f1207a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f1207a;
        if (zIsEmpty) {
            chipTextInputComboView.f1175a.setText(ChipTextInputComboView.m755a(chipTextInputComboView, "00"));
            return;
        }
        String strM755a = ChipTextInputComboView.m755a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f1175a;
        if (TextUtils.isEmpty(strM755a)) {
            strM755a = ChipTextInputComboView.m755a(chipTextInputComboView, "00");
        }
        chip.setText(strM755a);
    }
}
