package p000;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: fy */
/* JADX INFO: loaded from: classes.dex */
public final class C0241fy {

    /* JADX INFO: renamed from: a */
    public final TextPaint f1845a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristic f1846b;

    /* JADX INFO: renamed from: c */
    public final int f1847c;

    /* JADX INFO: renamed from: d */
    public final int f1848d;

    public C0241fy(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0087c0.m563i(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f1845a = textPaint;
        this.f1846b = textDirectionHeuristic;
        this.f1847c = i;
        this.f1848d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0241fy)) {
            return false;
        }
        C0241fy c0241fy = (C0241fy) obj;
        if (this.f1847c != c0241fy.f1847c || this.f1848d != c0241fy.f1848d) {
            return false;
        }
        TextPaint textPaint = this.f1845a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c0241fy.f1845a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f1846b == c0241fy.f1846b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f1845a;
        return AbstractC0908xw.m2710b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f1846b, Integer.valueOf(this.f1847c), Integer.valueOf(this.f1848d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f1845a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f1846b);
        sb.append(", breakStrategy=" + this.f1847c);
        sb.append(", hyphenationFrequency=" + this.f1848d);
        sb.append("}");
        return sb.toString();
    }

    public C0241fy(PrecomputedText.Params params) {
        this.f1845a = params.getTextPaint();
        this.f1846b = params.getTextDirection();
        this.f1847c = params.getBreakStrategy();
        this.f1848d = params.getHyphenationFrequency();
    }
}
