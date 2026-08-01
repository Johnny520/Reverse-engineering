package com.google.android.material.internal;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p301.C8613;
import p310.C8662;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3154 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C8662 f10497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final WeakReference f10498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f10500;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextPaint f10502 = new TextPaint(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3155 f10501 = new C3155(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f10499 = true;

    public C3154(C8613 c8613) {
        this.f10498 = new WeakReference(null);
        this.f10498 = new WeakReference(c8613);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m7190(String str) {
        if (!this.f10499) {
            return this.f10500;
        }
        TextPaint textPaint = this.f10502;
        this.f10500 = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f10499 = false;
        return this.f10500;
    }
}
