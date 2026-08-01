package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class wx {
    public final TextPaint a;
    public final TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public wx(TextPaint r3, TextDirectionHeuristic r4, int r5, int r6) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        c0.m(c0.h(c0.v(c0.g(c0.i(r3), r5), r6), r4));
    L5:
        this.a = r3;
        this.b = r4;
        this.c = r5;
        this.d = r6;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L5;
        return true;
    L5:
        if ((r5 instanceof wx) == false) goto L48;
        wx r52 = (wx) r5;
        if (this.c == r52.c) goto L11;
        return false;
    L11:
        if (this.d != r52.d) goto L50;
        TextPaint r0 = this.a;
        float r1 = r0.getTextSize();
        TextPaint r2 = r52.a;
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
        if (this.b == r52.b) goto L46;
        return false;
    L46:
        return true;
    L40:
        if (r0.getTypeface().equals(r2.getTypeface()) == true) goto L43;
        return false;
    L50:
        return false;
    L48:
        return false;
    }

    public final int hashCode() {
        TextPaint r0 = this.a;
        Float r2 = Float.valueOf(r0.getTextSize());
        Float r3 = Float.valueOf(r0.getTextScaleX());
        Float r4 = Float.valueOf(r0.getTextSkewX());
        Float r5 = Float.valueOf(r0.getLetterSpacing());
        Integer r6 = Integer.valueOf(r0.getFlags());
        LocaleList r7 = r0.getTextLocales();
        Typeface r8 = r0.getTypeface();
        Boolean r9 = Boolean.valueOf(r0.isElegantTextHeight());
        Integer r11 = Integer.valueOf(this.c);
        Integer r12 = Integer.valueOf(this.d);
        return pw.b(new Object[]{r2, r3, r4, r5, r6, r7, r8, r9, this.b, r11, r12});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("{");
        StringBuilder r1 = new StringBuilder("textSize=");
        TextPaint r2 = this.a;
        r1.append(r2.getTextSize());
        r0.append(r1.toString());
        r0.append(", textScaleX=" + r2.getTextScaleX());
        r0.append(", textSkewX=" + r2.getTextSkewX());
        r0.append(", letterSpacing=" + r2.getLetterSpacing());
        r0.append(", elegantTextHeight=" + r2.isElegantTextHeight());
        r0.append(", textLocale=" + r2.getTextLocales());
        r0.append(", typeface=" + r2.getTypeface());
        r0.append(", variationSettings=" + r2.getFontVariationSettings());
        r0.append(", textDir=" + this.b);
        r0.append(", breakStrategy=" + this.c);
        r0.append(", hyphenationFrequency=" + this.d);
        r0.append("}");
        return r0.toString();
    }

    public wx(PrecomputedText.Params r2) {
        this.a = c0.k(r2);
        this.b = c0.j(r2);
        this.c = c0.b(r2);
        this.d = c0.u(r2);
    }
}
