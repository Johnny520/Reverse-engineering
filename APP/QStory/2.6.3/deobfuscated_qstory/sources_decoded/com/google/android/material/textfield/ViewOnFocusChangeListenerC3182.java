package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC3182 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3192 f10686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10687;

    public /* synthetic */ ViewOnFocusChangeListenerC3182(AbstractC3192 abstractC3192, int i) {
        this.f10687 = i;
        this.f10686 = abstractC3192;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.f10687;
        AbstractC3192 abstractC3192 = this.f10686;
        switch (i) {
            case 0:
                C3179 c3179 = (C3179) abstractC3192;
                c3179.m7226(c3179.m7225());
                break;
            default:
                C3199 c3199 = (C3199) abstractC3192;
                c3199.f10796 = z;
                c3199.m7255();
                if (!z) {
                    c3199.m7277(false);
                    c3199.f10788 = false;
                }
                break;
        }
    }
}
