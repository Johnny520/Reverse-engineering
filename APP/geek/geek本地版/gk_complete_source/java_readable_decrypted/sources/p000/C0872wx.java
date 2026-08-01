package p000;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: wx */
/* JADX INFO: loaded from: classes.dex */
public final class C0872wx {

    /* JADX INFO: renamed from: a */
    public final TextPaint f5036a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristic f5037b;

    /* JADX INFO: renamed from: c */
    public final int f5038c;

    /* JADX INFO: renamed from: d */
    public final int f5039d;

    public C0872wx(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0087c0.m597i(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f5036a = textPaint;
        this.f5037b = textDirectionHeuristic;
        this.f5038c = i;
        this.f5039d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0872wx)) {
            return false;
        }
        C0872wx c0872wx = (C0872wx) obj;
        if (this.f5038c != c0872wx.f5038c || this.f5039d != c0872wx.f5039d) {
            return false;
        }
        TextPaint textPaint = this.f5036a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c0872wx.f5036a;
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
        return this.f5037b == c0872wx.f5037b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f5036a;
        return AbstractC0612pw.m2132b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f5037b, Integer.valueOf(this.f5038c), Integer.valueOf(this.f5039d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f5036a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f5037b);
        sb.append(", breakStrategy=" + this.f5038c);
        sb.append(", hyphenationFrequency=" + this.f5039d);
        sb.append("}");
        return sb.toString();
    }

    public C0872wx(PrecomputedText.Params params) {
        this.f5036a = params.getTextPaint();
        this.f5037b = params.getTextDirection();
        this.f5038c = params.getBreakStrategy();
        this.f5039d = params.getHyphenationFrequency();
    }
}
