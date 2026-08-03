package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: hz */
/* JADX INFO: loaded from: classes.dex */
public final class C1520hz {

    /* JADX INFO: renamed from: a */
    public CharSequence f5377a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f5378b;

    /* JADX INFO: renamed from: c */
    public final int f5379c;

    /* JADX INFO: renamed from: d */
    public int f5380d;

    /* JADX INFO: renamed from: k */
    public boolean f5387k;

    /* JADX INFO: renamed from: m */
    public C2464rl f5389m;

    /* JADX INFO: renamed from: e */
    public Layout.Alignment f5381e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f */
    public int f5382f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public float f5383g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f5384h = 1.0f;

    /* JADX INFO: renamed from: i */
    public int f5385i = 1;

    /* JADX INFO: renamed from: j */
    public boolean f5386j = true;

    /* JADX INFO: renamed from: l */
    public TextUtils.TruncateAt f5388l = null;

    public C1520hz(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f5377a = charSequence;
        this.f5378b = textPaint;
        this.f5379c = i;
        this.f5380d = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m2900a() {
        if (this.f5377a == null) {
            this.f5377a = "";
        }
        int iMax = Math.max(0, this.f5379c);
        CharSequence charSequenceEllipsize = this.f5377a;
        int i = this.f5382f;
        TextPaint textPaint = this.f5378b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f5388l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f5380d);
        this.f5380d = iMin;
        if (this.f5387k && this.f5382f == 1) {
            this.f5381e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f5381e);
        builderObtain.setIncludePad(this.f5386j);
        builderObtain.setTextDirection(this.f5387k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f5388l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f5382f);
        float f = this.f5383g;
        if (f != 0.0f || this.f5384h != 1.0f) {
            builderObtain.setLineSpacing(f, this.f5384h);
        }
        if (this.f5382f > 1) {
            builderObtain.setHyphenationFrequency(this.f5385i);
        }
        C2464rl c2464rl = this.f5389m;
        if (c2464rl != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) c2464rl.f8687b).f4657u.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
