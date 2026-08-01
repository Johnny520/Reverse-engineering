package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC3181 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3191 f10681;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10682;

    public /* synthetic */ ViewOnFocusChangeListenerC3181(AbstractC3191 abstractC3191, int i) {
        this.f10682 = i;
        this.f10681 = abstractC3191;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.f10682;
        AbstractC3191 abstractC3191 = this.f10681;
        switch (i) {
            case 0:
                C3178 c3178 = (C3178) abstractC3191;
                c3178.m7239(c3178.m7238());
                break;
            default:
                C3198 c3198 = (C3198) abstractC3191;
                c3198.f10791 = z;
                c3198.m7268();
                if (!z) {
                    c3198.m7290(false);
                    c3198.f10783 = false;
                }
                break;
        }
    }
}
