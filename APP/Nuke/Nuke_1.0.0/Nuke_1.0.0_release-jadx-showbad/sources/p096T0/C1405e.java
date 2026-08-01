package p096T0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import p106V0.C1491e;
import p106V0.C1492f;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: T0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1405e {

    /* JADX INFO: renamed from: a */
    public final CharSequence f5028a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f5029b;

    /* JADX INFO: renamed from: c */
    public final int f5030c;

    /* JADX INFO: renamed from: d */
    public float f5031d = Float.NaN;

    /* JADX INFO: renamed from: e */
    public float f5032e = Float.NaN;

    /* JADX INFO: renamed from: f */
    public BoringLayout.Metrics f5033f;

    /* JADX INFO: renamed from: g */
    public boolean f5034g;

    /* JADX INFO: renamed from: h */
    public CharSequence f5035h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1405e(CharSequence charSequence, TextPaint textPaint, int i5) {
        this.f5028a = charSequence;
        this.f5029b = textPaint;
        this.f5030c = i5;
    }

    /* JADX DEBUG: Class process forced to load method for inline: F1.m.d(java.lang.CharSequence, android.text.TextPaint, android.text.TextDirectionHeuristic):android.text.BoringLayout$Metrics */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final BoringLayout.Metrics m2691a() {
        if (!this.f5034g) {
            TextDirectionHeuristic textDirectionHeuristicM2716b = AbstractC1411k.m2716b(this.f5030c);
            int i5 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f5028a;
            TextPaint textPaint = this.f5029b;
            this.f5033f = i5 >= 33 ? BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicM2716b, true, null) : !textDirectionHeuristicM2716b.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f5034g = true;
        }
        return this.f5033f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final CharSequence m2692b() {
        CharSequence charSequence = this.f5035h;
        if (charSequence != null) {
            AbstractC1665j.m2982b(charSequence);
            return charSequence;
        }
        CharSequence charSequence2 = this.f5028a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (AbstractC1407g.m2703f(spanned, CharacterStyle.class)) {
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
        this.f5035h = charSequence2;
        return charSequence2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m2693c() {
        if (!Float.isNaN(this.f5031d)) {
            return this.f5031d;
        }
        BoringLayout.Metrics metricsM2691a = m2691a();
        float fCeil = metricsM2691a != null ? metricsM2691a.width : -1;
        TextPaint textPaint = this.f5029b;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(m2692b(), 0, m2692b().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.f5028a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (AbstractC1407g.m2703f(spanned, C1492f.class) || AbstractC1407g.m2703f(spanned, C1491e.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                }
            }
        }
        this.f5031d = fCeil;
        return fCeil;
    }
}
