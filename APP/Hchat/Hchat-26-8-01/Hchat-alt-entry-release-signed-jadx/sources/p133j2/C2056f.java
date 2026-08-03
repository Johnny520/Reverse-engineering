package p133j2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import p161l2.C2440e;
import p161l2.C2441f;

/* JADX INFO: renamed from: j2.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2056f {

    /* JADX INFO: renamed from: a */
    public final CharSequence f6903a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f6904b;

    /* JADX INFO: renamed from: c */
    public final int f6905c;

    /* JADX INFO: renamed from: d */
    public float f6906d = Float.NaN;

    /* JADX INFO: renamed from: e */
    public float f6907e = Float.NaN;

    /* JADX INFO: renamed from: f */
    public BoringLayout.Metrics f6908f;

    /* JADX INFO: renamed from: g */
    public boolean f6909g;

    /* JADX INFO: renamed from: h */
    public CharSequence f6910h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2056f(CharSequence charSequence, TextPaint textPaint, int i9) {
        this.f6903a = charSequence;
        this.f6904b = textPaint;
        this.f6905c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final BoringLayout.Metrics m5098a() {
        if (!this.f6909g) {
            TextDirectionHeuristic textDirectionHeuristicM5120b = AbstractC2062l.m5120b(this.f6905c);
            int i9 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f6903a;
            TextPaint textPaint = this.f6904b;
            this.f6908f = i9 >= 33 ? BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicM5120b, true, null) : !textDirectionHeuristicM5120b.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f6909g = true;
        }
        return this.f6908f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final CharSequence m5099b() {
        CharSequence charSequence = this.f6910h;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        CharSequence charSequence2 = this.f6903a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (AbstractC2057g.m5106f(spanned, CharacterStyle.class)) {
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
        this.f6910h = charSequence2;
        return charSequence2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m5100c() {
        if (!Float.isNaN(this.f6906d)) {
            return this.f6906d;
        }
        BoringLayout.Metrics metricsM5098a = m5098a();
        float fCeil = metricsM5098a != null ? metricsM5098a.width : -1;
        TextPaint textPaint = this.f6904b;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(m5099b(), 0, m5099b().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.f6903a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (AbstractC2057g.m5106f(spanned, C2441f.class) || AbstractC2057g.m5106f(spanned, C2440e.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                }
            }
        }
        this.f6906d = fCeil;
        return fCeil;
    }
}
