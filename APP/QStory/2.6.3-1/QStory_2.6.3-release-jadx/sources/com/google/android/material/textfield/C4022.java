package com.google.android.material.textfield;

import android.text.Editable;
import com.google.android.material.internal.AbstractC3991;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4022 extends AbstractC3991 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C4027 f11091;

    public C4022(C4027 c4027) {
        this.f11091 = c4027;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f11091.m7822().mo7783();
    }

    @Override // com.google.android.material.internal.AbstractC3991, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f11091.m7822().mo7809();
    }
}
