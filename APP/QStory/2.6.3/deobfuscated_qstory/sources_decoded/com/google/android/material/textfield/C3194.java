package com.google.android.material.textfield;

import android.widget.EditText;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3194 implements InterfaceC3174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3195 f10758;

    public C3194(C3195 c3195) {
        this.f10758 = c3195;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7258(TextInputLayout textInputLayout) {
        C3195 c3195 = this.f10758;
        C3190 c3190 = c3195.f10759;
        if (c3195.f10768 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c3195.f10768;
        if (editText != null) {
            editText.removeTextChangedListener(c3190);
            if (c3195.f10768.getOnFocusChangeListener() == c3195.m7263().mo7221()) {
                c3195.f10768.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c3195.f10768 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c3190);
        }
        c3195.m7263().mo7230(c3195.f10768);
        c3195.m7270(c3195.m7263());
    }
}
