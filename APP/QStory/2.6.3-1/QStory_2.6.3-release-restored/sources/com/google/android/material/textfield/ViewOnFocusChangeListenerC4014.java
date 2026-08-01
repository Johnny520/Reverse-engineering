package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC4014 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4024 f11031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11032;

    public /* synthetic */ ViewOnFocusChangeListenerC4014(AbstractC4024 abstractC4024, int i) {
        this.f11032 = i;
        this.f11031 = abstractC4024;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.f11032;
        AbstractC4024 abstractC4024 = this.f11031;
        switch (i) {
            case 0:
                C4011 c4011 = (C4011) abstractC4024;
                c4011.m7785(c4011.m7784());
                break;
            default:
                C4031 c4031 = (C4031) abstractC4024;
                c4031.f11141 = z;
                c4031.m7814();
                if (!z) {
                    c4031.m7836(false);
                    c4031.f11133 = false;
                }
                break;
        }
    }
}
