package com.google.android.material.textfield;

import android.widget.EditText;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4026 implements InterfaceC4006 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C4027 f11103;

    public C4026(C4027 c4027) {
        this.f11103 = c4027;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7817(TextInputLayout textInputLayout) {
        C4027 c4027 = this.f11103;
        C4022 c4022 = c4027.f11104;
        if (c4027.f11113 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c4027.f11113;
        if (editText != null) {
            editText.removeTextChangedListener(c4022);
            if (c4027.f11113.getOnFocusChangeListener() == c4027.m7822().mo7780()) {
                c4027.f11113.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c4027.f11113 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c4022);
        }
        c4027.m7822().mo7789(c4027.f11113);
        c4027.m7829(c4027.m7822());
    }
}
