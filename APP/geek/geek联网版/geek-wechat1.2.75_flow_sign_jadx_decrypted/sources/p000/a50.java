package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class a50 {

    /* JADX INFO: renamed from: a */
    public CharSequence f27a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f28b;

    /* JADX INFO: renamed from: c */
    public final int f29c;

    /* JADX INFO: renamed from: d */
    public int f30d;

    /* JADX INFO: renamed from: j */
    public boolean f36j;

    /* JADX INFO: renamed from: e */
    public Layout.Alignment f31e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f */
    public int f32f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public float f33g = 1.0f;

    /* JADX INFO: renamed from: h */
    public int f34h = 1;

    /* JADX INFO: renamed from: i */
    public boolean f35i = true;

    /* JADX INFO: renamed from: k */
    public TextUtils.TruncateAt f37k = null;

    public a50(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f27a = charSequence;
        this.f28b = textPaint;
        this.f29c = i;
        this.f30d = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m29a() {
        if (this.f27a == null) {
            this.f27a = "";
        }
        int iMax = Math.max(0, this.f29c);
        CharSequence charSequenceEllipsize = this.f27a;
        int i = this.f32f;
        TextPaint textPaint = this.f28b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f37k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f30d);
        this.f30d = iMin;
        if (this.f36j && this.f32f == 1) {
            this.f31e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f31e);
        builderObtain.setIncludePad(this.f35i);
        builderObtain.setTextDirection(this.f36j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f37k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f32f);
        float f = this.f33g;
        if (f != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f);
        }
        if (this.f32f > 1) {
            builderObtain.setHyphenationFrequency(this.f34h);
        }
        return builderObtain.build();
    }
}
