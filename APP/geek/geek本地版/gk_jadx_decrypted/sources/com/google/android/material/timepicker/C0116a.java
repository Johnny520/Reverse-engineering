package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p000.q60;

/* JADX INFO: renamed from: com.google.android.material.timepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0116a extends q60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ChipTextInputComboView f1282a;

    public C0116a(ChipTextInputComboView chipTextInputComboView) {
        this.f1282a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f1282a;
        if (zIsEmpty) {
            chipTextInputComboView.f1250a.setText(ChipTextInputComboView.m796a(chipTextInputComboView, "00"));
            return;
        }
        String strM796a = ChipTextInputComboView.m796a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f1250a;
        if (TextUtils.isEmpty(strM796a)) {
            strM796a = ChipTextInputComboView.m796a(chipTextInputComboView, "00");
        }
        chip.setText(strM796a);
    }
}
