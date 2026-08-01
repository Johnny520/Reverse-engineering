package p095w;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.emoji2.text.AbstractC0387b;
import java.util.Objects;

/* JADX INFO: renamed from: w.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1030a {

    /* JADX INFO: renamed from: a */
    public final TextPaint f3646a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristic f3647b;

    /* JADX INFO: renamed from: c */
    public final int f3648c;

    /* JADX INFO: renamed from: d */
    public final int f3649d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1030a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0387b.m743g(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
        }
        this.f3646a = textPaint;
        this.f3647b = textDirectionHeuristic;
        this.f3648c = i2;
        this.f3649d = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1030a)) {
            return false;
        }
        C1030a c1030a = (C1030a) obj;
        if (this.f3648c != c1030a.f3648c || this.f3649d != c1030a.f3649d) {
            return false;
        }
        TextPaint textPaint = this.f3646a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c1030a.f3646a;
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
        return this.f3647b == c1030a.f3647b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        TextPaint textPaint = this.f3646a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f3647b, Integer.valueOf(this.f3648c), Integer.valueOf(this.f3649d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f3646a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i2 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i2 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f3647b);
        sb.append(", breakStrategy=" + this.f3648c);
        sb.append(", hyphenationFrequency=" + this.f3649d);
        sb.append("}");
        return sb.toString();
    }

    public C1030a(PrecomputedText.Params params) {
        this.f3646a = params.getTextPaint();
        this.f3647b = params.getTextDirection();
        this.f3648c = params.getBreakStrategy();
        this.f3649d = params.getHyphenationFrequency();
    }
}
