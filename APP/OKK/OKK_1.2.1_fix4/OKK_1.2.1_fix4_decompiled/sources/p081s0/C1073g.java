package p081s0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: s0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1073g {

    /* JADX INFO: renamed from: a */
    public CharSequence f4160a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f4161b;

    /* JADX INFO: renamed from: c */
    public final int f4162c;

    /* JADX INFO: renamed from: d */
    public int f4163d;

    /* JADX INFO: renamed from: k */
    public boolean f4170k;

    /* JADX INFO: renamed from: e */
    public Layout.Alignment f4164e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f */
    public int f4165f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public float f4166g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f4167h = 1.0f;

    /* JADX INFO: renamed from: i */
    public int f4168i = 1;

    /* JADX INFO: renamed from: j */
    public boolean f4169j = true;

    /* JADX INFO: renamed from: l */
    public TextUtils.TruncateAt f4171l = null;

    public C1073g(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f4160a = charSequence;
        this.f4161b = textPaint;
        this.f4162c = i2;
        this.f4163d = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m2551a() {
        if (this.f4160a == null) {
            this.f4160a = "";
        }
        int iMax = Math.max(0, this.f4162c);
        CharSequence charSequenceEllipsize = this.f4160a;
        int i2 = this.f4165f;
        TextPaint textPaint = this.f4161b;
        if (i2 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f4171l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f4163d);
        this.f4163d = iMin;
        if (this.f4170k && this.f4165f == 1) {
            this.f4164e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f4164e);
        builderObtain.setIncludePad(this.f4169j);
        builderObtain.setTextDirection(this.f4170k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f4171l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f4165f);
        float f2 = this.f4166g;
        if (f2 != 0.0f || this.f4167h != 1.0f) {
            builderObtain.setLineSpacing(f2, this.f4167h);
        }
        if (this.f4165f > 1) {
            builderObtain.setHyphenationFrequency(this.f4168i);
        }
        return builderObtain.build();
    }
}
