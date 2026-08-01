package com.google.android.material.button;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.google.android.material.button.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3096 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ MaterialButton f10131;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Drawable f10132;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10133;

    public /* synthetic */ RunnableC3096(MaterialButton materialButton, Drawable drawable, int i) {
        this.f10133 = i;
        this.f10131 = materialButton;
        this.f10132 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10133;
        Drawable drawable = this.f10132;
        MaterialButton materialButton = this.f10131;
        switch (i) {
            case 0:
                int[] iArr = MaterialButton.f10086;
                materialButton.setIcon(drawable);
                break;
            default:
                int[] iArr2 = MaterialButton.f10086;
                materialButton.setIcon(drawable);
                break;
        }
    }
}
