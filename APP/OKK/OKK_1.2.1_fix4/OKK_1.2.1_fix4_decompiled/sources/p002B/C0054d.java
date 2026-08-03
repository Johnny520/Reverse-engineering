package p002B;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: B.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0054d {

    /* JADX INFO: renamed from: a */
    public final TextPaint f192a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristic f193b;

    /* JADX INFO: renamed from: c */
    public final int f194c;

    /* JADX INFO: renamed from: d */
    public final int f195d;

    public C0054d(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0053c.m178i(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
        }
        this.f192a = textPaint;
        this.f193b = textDirectionHeuristic;
        this.f194c = i2;
        this.f195d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0054d)) {
            return false;
        }
        C0054d c0054d = (C0054d) obj;
        if (this.f194c == c0054d.f194c && this.f195d == c0054d.f195d) {
            TextPaint textPaint = this.f192a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = c0054d.f192a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f193b == c0054d.f193b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f192a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f193b, Integer.valueOf(this.f194c), Integer.valueOf(this.f195d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f192a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f193b);
        sb.append(", breakStrategy=" + this.f194c);
        sb.append(", hyphenationFrequency=" + this.f195d);
        sb.append("}");
        return sb.toString();
    }

    public C0054d(PrecomputedText.Params params) {
        this.f192a = params.getTextPaint();
        this.f193b = params.getTextDirection();
        this.f194c = params.getBreakStrategy();
        this.f195d = params.getHyphenationFrequency();
    }
}
