package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.fragment.app.C2358;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3164 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f10529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f10530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final TextPaint f10531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public CharSequence f10532;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C2358 f10533;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f10536;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Layout.Alignment f10528 = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10527 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f10535 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f10534 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f10538 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f10539 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public TextUtils.TruncateAt f10537 = null;

    public C3164(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f10532 = charSequence;
        this.f10531 = textPaint;
        this.f10530 = i;
        this.f10529 = charSequence.length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final StaticLayout m7187() {
        if (this.f10532 == null) {
            this.f10532 = "";
        }
        int iMax = Math.max(0, this.f10530);
        CharSequence charSequenceEllipsize = this.f10532;
        int i = this.f10527;
        TextPaint textPaint = this.f10531;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f10537);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f10529);
        this.f10529 = iMin;
        if (this.f10536 && this.f10527 == 1) {
            this.f10528 = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f10528);
        builderObtain.setIncludePad(this.f10539);
        builderObtain.setTextDirection(this.f10536 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f10537;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f10527);
        float f = this.f10535;
        if (f != 0.0f || this.f10534 != 1.0f) {
            builderObtain.setLineSpacing(f, this.f10534);
        }
        if (this.f10527 > 1) {
            builderObtain.setHyphenationFrequency(this.f10538);
        }
        C2358 c2358 = this.f10533;
        if (c2358 != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) c2358.f6986).f10607.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
