package com.google.android.material.button;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.google.android.material.button.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3929 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ MaterialButton f10481;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Drawable f10482;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10483;

    public /* synthetic */ RunnableC3929(MaterialButton materialButton, Drawable drawable, int i) {
        this.f10483 = i;
        this.f10481 = materialButton;
        this.f10482 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10483;
        Drawable drawable = this.f10482;
        MaterialButton materialButton = this.f10481;
        switch (i) {
            case 0:
                int[] iArr = MaterialButton.f10436;
                materialButton.setIcon(drawable);
                break;
            default:
                int[] iArr2 = MaterialButton.f10436;
                materialButton.setIcon(drawable);
                break;
        }
    }
}
