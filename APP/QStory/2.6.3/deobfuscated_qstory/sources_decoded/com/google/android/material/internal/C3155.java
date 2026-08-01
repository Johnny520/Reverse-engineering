package com.google.android.material.internal;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p301.C8605;
import p310.C8654;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3155 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C8654 f10502;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final WeakReference f10503;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f10505;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextPaint f10507 = new TextPaint(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3156 f10506 = new C3156(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f10504 = true;

    public C3155(C8605 c8605) {
        this.f10503 = new WeakReference(null);
        this.f10503 = new WeakReference(c8605);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m7177(String str) {
        if (!this.f10504) {
            return this.f10505;
        }
        TextPaint textPaint = this.f10507;
        this.f10505 = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f10504 = false;
        return this.f10505;
    }
}
