package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p000.AbstractC0011AA;

/* JADX INFO: renamed from: com.google.android.material.timepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1279a extends AbstractC0011AA {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ChipTextInputComboView f4702a;

    public C1279a(ChipTextInputComboView chipTextInputComboView) {
        this.f4702a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f4702a;
        if (zIsEmpty) {
            chipTextInputComboView.f4669a.setText(ChipTextInputComboView.m2504a(chipTextInputComboView, "00"));
            return;
        }
        String strM2504a = ChipTextInputComboView.m2504a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f4669a;
        if (TextUtils.isEmpty(strM2504a)) {
            strM2504a = ChipTextInputComboView.m2504a(chipTextInputComboView, "00");
        }
        chip.setText(strM2504a);
    }
}
