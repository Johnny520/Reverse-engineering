package com.google.android.material.textfield;

import android.text.Editable;
import com.google.android.material.internal.AbstractC3158;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3189 extends AbstractC3158 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C3194 f10741;

    public C3189(C3194 c3194) {
        this.f10741 = c3194;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f10741.m7276().mo7237();
    }

    @Override // com.google.android.material.internal.AbstractC3158, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f10741.m7276().mo7263();
    }
}
