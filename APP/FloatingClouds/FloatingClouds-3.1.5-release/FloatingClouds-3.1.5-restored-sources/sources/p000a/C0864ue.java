package p000a;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: a.ue */
/* JADX INFO: loaded from: classes.dex */
public final class C0864ue {

    /* JADX INFO: renamed from: a */
    public CharSequence f3370a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f3371b;

    /* JADX INFO: renamed from: c */
    public final int f3372c;

    /* JADX INFO: renamed from: d */
    public int f3373d;

    /* JADX INFO: renamed from: j */
    public boolean f3379j;

    /* JADX INFO: renamed from: e */
    public Layout.Alignment f3374e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f */
    public int f3375f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public float f3376g = 1.0f;

    /* JADX INFO: renamed from: h */
    public int f3377h = 1;

    /* JADX INFO: renamed from: i */
    public boolean f3378i = true;

    /* JADX INFO: renamed from: k */
    public TextUtils.TruncateAt f3380k = null;

    /* JADX INFO: renamed from: a.ue$a */
    public static class a extends Exception {
    }

    public C0864ue(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f3370a = charSequence;
        this.f3371b = textPaint;
        this.f3372c = i;
        this.f3373d = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m1992a() {
        if (this.f3370a == null) {
            this.f3370a = "";
        }
        int iMax = Math.max(0, this.f3372c);
        CharSequence charSequenceEllipsize = this.f3370a;
        int i = this.f3375f;
        TextPaint textPaint = this.f3371b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f3380k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f3373d);
        this.f3373d = iMin;
        if (this.f3379j && this.f3375f == 1) {
            this.f3374e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f3374e);
        builderObtain.setIncludePad(this.f3378i);
        builderObtain.setTextDirection(this.f3379j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f3380k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f3375f);
        float f = this.f3376g;
        if (f != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f);
        }
        if (this.f3375f > 1) {
            builderObtain.setHyphenationFrequency(this.f3377h);
        }
        return builderObtain.build();
    }
}
