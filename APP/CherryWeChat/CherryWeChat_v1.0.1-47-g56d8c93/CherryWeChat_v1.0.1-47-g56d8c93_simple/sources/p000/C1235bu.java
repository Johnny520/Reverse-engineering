package p000;

import android.graphics.Typeface;
import android.os.LocaleList;
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

    public C1235bu(PrecomputedText.Params r2) {
        this.f4199a = r2.getTextPaint();
        this.f4200b = r2.getTextDirection();
        this.f4201c = r2.getBreakStrategy();
        this.f4202d = r2.getHyphenationFrequency();
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L5;
        return true;
    L5:
        if ((r5 instanceof C1235bu) == false) goto L49;
        C1235bu r52 = (C1235bu) r5;
        if (this.f4201c == r52.f4201c) goto L11;
        return false;
    L11:
        if (this.f4202d != r52.f4202d) goto L51;
        TextPaint r0 = this.f4199a;
        float r1 = r0.getTextSize();
        TextPaint r2 = r52.f4199a;
        if (r1 == r2.getTextSize()) goto L17;
        return false;
    L17:
        if (r0.getTextScaleX() == r2.getTextScaleX()) goto L20;
        return false;
    L20:
        if (r0.getTextSkewX() == r2.getTextSkewX()) goto L23;
        return false;
    L23:
        if (r0.getLetterSpacing() == r2.getLetterSpacing()) goto L26;
        return false;
    L26:
        if (TextUtils.equals(r0.getFontFeatureSettings(), r2.getFontFeatureSettings()) == true) goto L29;
        return false;
    L29:
        if (r0.getFlags() == r2.getFlags()) goto L32;
        return false;
    L32:
        if (r0.getTextLocales().equals(r2.getTextLocales()) == true) goto L35;
        return false;
    L35:
        if (r0.getTypeface() != null) goto L40;
        if (r2.getTypeface() == null) goto L43;
        return false;
    L43:
        if (this.f4200b != r52.f4200b) goto L46;
        return true;
    L46:
        return false;
    L40:
        if (r0.getTypeface().equals(r2.getTypeface()) == true) goto L43;
        return false;
    L51:
        return false;
    L49:
        return false;
    }

    public final int hashCode() {
        TextPaint r0 = this.f4199a;
        Float r2 = Float.valueOf(r0.getTextSize());
        Float r3 = Float.valueOf(r0.getTextScaleX());
        Float r4 = Float.valueOf(r0.getTextSkewX());
        Float r5 = Float.valueOf(r0.getLetterSpacing());
        Integer r6 = Integer.valueOf(r0.getFlags());
        LocaleList r7 = r0.getTextLocales();
        Typeface r8 = r0.getTypeface();
        Boolean r9 = Boolean.valueOf(r0.isElegantTextHeight());
        Integer r11 = Integer.valueOf(this.f4201c);
        Integer r12 = Integer.valueOf(this.f4202d);
        return Objects.hash(new Object[]{r2, r3, r4, r5, r6, r7, r8, r9, this.f4200b, r11, r12});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("{");
        StringBuilder r1 = new StringBuilder("textSize=");
        TextPaint r2 = this.f4199a;
        r1.append(r2.getTextSize());
        r0.append(r1.toString());
        r0.append(", textScaleX=" + r2.getTextScaleX());
        r0.append(", textSkewX=" + r2.getTextSkewX());
        r0.append(", letterSpacing=" + r2.getLetterSpacing());
        r0.append(", elegantTextHeight=" + r2.isElegantTextHeight());
        r0.append(", textLocale=" + r2.getTextLocales());
        r0.append(", typeface=" + r2.getTypeface());
        r0.append(", variationSettings=" + r2.getFontVariationSettings());
        r0.append(", textDir=" + this.f4200b);
        r0.append(", breakStrategy=" + this.f4201c);
        r0.append(", hyphenationFrequency=" + this.f4202d);
        r0.append("}");
        return r0.toString();
    }
}
