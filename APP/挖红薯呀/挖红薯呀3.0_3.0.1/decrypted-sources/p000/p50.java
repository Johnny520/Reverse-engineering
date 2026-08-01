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

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class p50 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f4753a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f4754b;

    /* JADX INFO: renamed from: c */
    public final int f4755c;

    /* JADX INFO: renamed from: d */
    public float f4756d = Float.NaN;

    /* JADX INFO: renamed from: e */
    public float f4757e = Float.NaN;

    /* JADX INFO: renamed from: f */
    public BoringLayout.Metrics f4758f;

    /* JADX INFO: renamed from: g */
    public boolean f4759g;

    /* JADX INFO: renamed from: h */
    public CharSequence f4760h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p50(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f4753a = charSequence;
        this.f4754b = textPaint;
        this.f4755c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final BoringLayout.Metrics m3017a() {
        if (!this.f4759g) {
            TextDirectionHeuristic textDirectionHeuristicM1283b = h71.m1283b(this.f4755c);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f4753a;
            TextPaint textPaint = this.f4754b;
            this.f4758f = i >= 33 ? BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicM1283b, true, null) : !textDirectionHeuristicM1283b.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f4759g = true;
        }
        return this.f4758f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final CharSequence m3018b() {
        CharSequence charSequence = this.f4760h;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        CharSequence charSequence2 = this.f4753a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (g60.m1214m(spanned, CharacterStyle.class)) {
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
        this.f4760h = charSequence2;
        return charSequence2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m3019c() {
        if (!Float.isNaN(this.f4756d)) {
            return this.f4756d;
        }
        BoringLayout.Metrics metricsM3017a = m3017a();
        float fCeil = metricsM3017a != null ? metricsM3017a.width : -1;
        TextPaint textPaint = this.f4754b;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(m3018b(), 0, m3018b().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.f4753a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (g60.m1214m(spanned, l90.class) || g60.m1214m(spanned, k90.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                }
            }
        }
        this.f4756d = fCeil;
        return fCeil;
    }
}
