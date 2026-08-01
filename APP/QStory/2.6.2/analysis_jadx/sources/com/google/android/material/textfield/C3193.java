package com.google.android.material.textfield;

import android.widget.EditText;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3193 implements InterfaceC3173 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3194 f10753;

    public C3193(C3194 c3194) {
        this.f10753 = c3194;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7271(TextInputLayout textInputLayout) {
        C3194 c3194 = this.f10753;
        C3189 c3189 = c3194.f10754;
        if (c3194.f10763 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c3194.f10763;
        if (editText != null) {
            editText.removeTextChangedListener(c3189);
            if (c3194.f10763.getOnFocusChangeListener() == c3194.m7276().mo7234()) {
                c3194.f10763.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c3194.f10763 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c3189);
        }
        c3194.m7276().mo7243(c3194.f10763);
        c3194.m7283(c3194.m7276());
    }
}
