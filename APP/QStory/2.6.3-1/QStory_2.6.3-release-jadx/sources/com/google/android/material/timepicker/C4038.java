package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.internal.AbstractC3991;

/* JADX INFO: renamed from: com.google.android.material.timepicker.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4038 extends AbstractC3991 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ ChipTextInputComboView f11188;

    public C4038(ChipTextInputComboView chipTextInputComboView) {
        this.f11188 = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f11188;
        if (zIsEmpty) {
            chipTextInputComboView.f11146 = ChipTextInputComboView.m7838(chipTextInputComboView, "00");
            return;
        }
        String strM7838 = ChipTextInputComboView.m7838(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(strM7838)) {
            strM7838 = ChipTextInputComboView.m7838(chipTextInputComboView, "00");
        }
        chipTextInputComboView.f11146 = strM7838;
    }
}
