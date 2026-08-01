package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.internal.AbstractC3159;

/* JADX INFO: renamed from: com.google.android.material.timepicker.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3206 extends AbstractC3159 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ ChipTextInputComboView f10843;

    public C3206(ChipTextInputComboView chipTextInputComboView) {
        this.f10843 = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f10843;
        if (zIsEmpty) {
            chipTextInputComboView.f10801 = ChipTextInputComboView.m7279(chipTextInputComboView, "00");
            return;
        }
        String strM7279 = ChipTextInputComboView.m7279(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(strM7279)) {
            strM7279 = ChipTextInputComboView.m7279(chipTextInputComboView, "00");
        }
        chipTextInputComboView.f10801 = strM7279;
    }
}
