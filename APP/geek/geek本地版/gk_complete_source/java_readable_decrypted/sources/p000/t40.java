package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class t40 {

    /* JADX INFO: renamed from: a */
    public CharSequence f4496a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f4497b;

    /* JADX INFO: renamed from: c */
    public final int f4498c;

    /* JADX INFO: renamed from: d */
    public int f4499d;

    /* JADX INFO: renamed from: j */
    public boolean f4505j;

    /* JADX INFO: renamed from: e */
    public Layout.Alignment f4500e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f */
    public int f4501f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public float f4502g = 1.0f;

    /* JADX INFO: renamed from: h */
    public int f4503h = 1;

    /* JADX INFO: renamed from: i */
    public boolean f4504i = true;

    /* JADX INFO: renamed from: k */
    public TextUtils.TruncateAt f4506k = null;

    public t40(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f4496a = charSequence;
        this.f4497b = textPaint;
        this.f4498c = i;
        this.f4499d = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m2358a() {
        if (this.f4496a == null) {
            this.f4496a = "";
        }
        int iMax = Math.max(0, this.f4498c);
        CharSequence charSequenceEllipsize = this.f4496a;
        int i = this.f4501f;
        TextPaint textPaint = this.f4497b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f4506k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f4499d);
        this.f4499d = iMin;
        if (this.f4505j && this.f4501f == 1) {
            this.f4500e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f4500e);
        builderObtain.setIncludePad(this.f4504i);
        builderObtain.setTextDirection(this.f4505j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f4506k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f4501f);
        float f = this.f4502g;
        if (f != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f);
        }
        if (this.f4501f > 1) {
            builderObtain.setHyphenationFrequency(this.f4503h);
        }
        return builderObtain.build();
    }
}
