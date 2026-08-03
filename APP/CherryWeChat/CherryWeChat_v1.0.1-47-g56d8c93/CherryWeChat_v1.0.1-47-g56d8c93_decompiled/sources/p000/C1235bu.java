package p000;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: bu */
/* JADX INFO: loaded from: classes.dex */
public final class C1235bu {

    /* JADX INFO: renamed from: a */
    public final TextPaint f4199a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristic f4200b;

    /* JADX INFO: renamed from: c */
    public final int f4201c;

    /* JADX INFO: renamed from: d */
    public final int f4202d;

    public C1235bu(PrecomputedText.Params params) {
        this.f4199a = params.getTextPaint();
        this.f4200b = params.getTextDirection();
        this.f4201c = params.getBreakStrategy();
        this.f4202d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1235bu)) {
            return false;
        }
        C1235bu c1235bu = (C1235bu) obj;
        if (this.f4201c != c1235bu.f4201c || this.f4202d != c1235bu.f4202d) {
            return false;
        }
        TextPaint textPaint = this.f4199a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c1235bu.f4199a;
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
        return this.f4200b == c1235bu.f4200b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f4199a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f4200b, Integer.valueOf(this.f4201c), Integer.valueOf(this.f4202d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f4199a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f4200b);
        sb.append(", breakStrategy=" + this.f4201c);
        sb.append(", hyphenationFrequency=" + this.f4202d);
        sb.append("}");
        return sb.toString();
    }
}
