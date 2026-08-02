package p000;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g61 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f3321a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f3322b;

    /* JADX INFO: renamed from: c */
    public final int f3323c;

    /* JADX INFO: renamed from: d */
    public float f3324d = Float.NaN;

    /* JADX INFO: renamed from: e */
    public float f3325e = Float.NaN;

    /* JADX INFO: renamed from: f */
    public BoringLayout.Metrics f3326f;

    /* JADX INFO: renamed from: g */
    public boolean f3327g;

    /* JADX INFO: renamed from: h */
    public CharSequence f3328h;

    public g61(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f3321a = charSequence;
        this.f3322b = textPaint;
        this.f3323c = i;
    }

    /* JADX INFO: renamed from: a */
    public final BoringLayout.Metrics m1807a() {
        if (!this.f3327g) {
            TextDirectionHeuristic textDirectionHeuristicM11b = a13.m11b(this.f3323c);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f3321a;
            TextPaint textPaint = this.f3322b;
            this.f3326f = i >= 33 ? BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicM11b, true, null) : !textDirectionHeuristicM11b.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f3327g = true;
        }
        return this.f3326f;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m1808b() {
        CharSequence charSequence = this.f3328h;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        CharSequence charSequence2 = this.f3321a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (sp0.m4909E(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f3328h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m1809c() {
        if (!Float.isNaN(this.f3324d)) {
            return this.f3324d;
        }
        BoringLayout.Metrics metricsM1807a = m1807a();
        float fCeil = metricsM1807a != null ? metricsM1807a.width : -1;
        TextPaint textPaint = this.f3322b;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(m1808b(), 0, m1808b().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.f3321a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (sp0.m4909E(spanned, w91.class) || sp0.m4909E(spanned, v91.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                }
            }
        }
        this.f3324d = fCeil;
        return fCeil;
    }
}
