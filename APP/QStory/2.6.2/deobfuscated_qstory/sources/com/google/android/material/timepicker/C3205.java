package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.internal.AbstractC3158;

/* JADX INFO: renamed from: com.google.android.material.timepicker.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3205 extends AbstractC3158 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ ChipTextInputComboView f10838;

    public C3205(ChipTextInputComboView chipTextInputComboView) {
        this.f10838 = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f10838;
        if (zIsEmpty) {
            chipTextInputComboView.f10796 = ChipTextInputComboView.m7292(chipTextInputComboView, "00");
            return;
        }
        String strM7292 = ChipTextInputComboView.m7292(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(strM7292)) {
            strM7292 = ChipTextInputComboView.m7292(chipTextInputComboView, "00");
        }
        chipTextInputComboView.f10796 = strM7292;
    }
}
