package com.google.android.material.internal;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p317.C9434;
import p326.C9483;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C9483 f10847;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final WeakReference f10848;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f10850;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextPaint f10852 = new TextPaint(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3988 f10851 = new C3988(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f10849 = true;

    public C3987(C9434 c9434) {
        this.f10848 = new WeakReference(null);
        this.f10848 = new WeakReference(c9434);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m7736(String str) {
        if (!this.f10849) {
            return this.f10850;
        }
        TextPaint textPaint = this.f10852;
        this.f10850 = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f10849 = false;
        return this.f10850;
    }
}
