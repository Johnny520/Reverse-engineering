package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.fragment.app.C2358;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3163 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f10524;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f10525;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final TextPaint f10526;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public CharSequence f10527;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C2358 f10528;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f10531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Layout.Alignment f10523 = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10522 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f10530 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f10529 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f10533 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f10534 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public TextUtils.TruncateAt f10532 = null;

    public C3163(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f10527 = charSequence;
        this.f10526 = textPaint;
        this.f10525 = i;
        this.f10524 = charSequence.length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final StaticLayout m7200() {
        if (this.f10527 == null) {
            this.f10527 = "";
        }
        int iMax = Math.max(0, this.f10525);
        CharSequence charSequenceEllipsize = this.f10527;
        int i = this.f10522;
        TextPaint textPaint = this.f10526;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f10532);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f10524);
        this.f10524 = iMin;
        if (this.f10531 && this.f10522 == 1) {
            this.f10523 = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f10523);
        builderObtain.setIncludePad(this.f10534);
        builderObtain.setTextDirection(this.f10531 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f10532;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f10522);
        float f = this.f10530;
        if (f != 0.0f || this.f10529 != 1.0f) {
            builderObtain.setLineSpacing(f, this.f10529);
        }
        if (this.f10522 > 1) {
            builderObtain.setHyphenationFrequency(this.f10533);
        }
        C2358 c2358 = this.f10528;
        if (c2358 != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) c2358.f6985).f10602.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
