package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.fragment.app.C3191;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3996 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f10874;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f10875;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final TextPaint f10876;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public CharSequence f10877;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C3191 f10878;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f10881;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Layout.Alignment f10873 = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10872 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f10880 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f10879 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f10883 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f10884 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public TextUtils.TruncateAt f10882 = null;

    public C3996(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f10877 = charSequence;
        this.f10876 = textPaint;
        this.f10875 = i;
        this.f10874 = charSequence.length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final StaticLayout m7746() {
        if (this.f10877 == null) {
            this.f10877 = "";
        }
        int iMax = Math.max(0, this.f10875);
        CharSequence charSequenceEllipsize = this.f10877;
        int i = this.f10872;
        TextPaint textPaint = this.f10876;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f10882);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f10874);
        this.f10874 = iMin;
        if (this.f10881 && this.f10872 == 1) {
            this.f10873 = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f10873);
        builderObtain.setIncludePad(this.f10884);
        builderObtain.setTextDirection(this.f10881 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f10882;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f10872);
        float f = this.f10880;
        if (f != 0.0f || this.f10879 != 1.0f) {
            builderObtain.setLineSpacing(f, this.f10879);
        }
        if (this.f10872 > 1) {
            builderObtain.setHyphenationFrequency(this.f10883);
        }
        C3191 c3191 = this.f10878;
        if (c3191 != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) c3191.f7331).f10952.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
