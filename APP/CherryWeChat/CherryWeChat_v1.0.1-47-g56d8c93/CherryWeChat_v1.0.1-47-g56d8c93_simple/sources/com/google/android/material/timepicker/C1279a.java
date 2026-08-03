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

    public C1279a(ChipTextInputComboView r1) {
        this.f4702a = r1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r5) {
        boolean r0 = TextUtils.isEmpty(r5);
        ChipTextInputComboView r2 = this.f4702a;
        if (r0 == false) goto L6;
        r2.f4669a.setText(ChipTextInputComboView.m2504a(r2, "00"));
        return;
    L6:
        String r52 = ChipTextInputComboView.m2504a(r2, r5);
        Chip r02 = r2.f4669a;
        if (TextUtils.isEmpty(r52) == false) goto L9;
        r52 = ChipTextInputComboView.m2504a(r2, "00");
    L9:
        r02.setText(r52);
    }
}
