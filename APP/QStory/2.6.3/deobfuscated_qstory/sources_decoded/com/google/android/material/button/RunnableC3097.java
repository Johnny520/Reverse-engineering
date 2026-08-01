package com.google.android.material.button;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.google.android.material.button.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3097 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ MaterialButton f10136;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Drawable f10137;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10138;

    public /* synthetic */ RunnableC3097(MaterialButton materialButton, Drawable drawable, int i) {
        this.f10138 = i;
        this.f10136 = materialButton;
        this.f10137 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10138;
        Drawable drawable = this.f10137;
        MaterialButton materialButton = this.f10136;
        switch (i) {
            case 0:
                int[] iArr = MaterialButton.f10091;
                materialButton.setIcon(drawable);
                break;
            default:
                int[] iArr2 = MaterialButton.f10091;
                materialButton.setIcon(drawable);
                break;
        }
    }
}
