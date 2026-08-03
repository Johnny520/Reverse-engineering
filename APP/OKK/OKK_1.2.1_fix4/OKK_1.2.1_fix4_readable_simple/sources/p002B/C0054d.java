package p002B;

import android.graphics.Typeface;
import android.os.Build;
import android.os.LocaleList;
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

    public C0054d(TextPaint r3, TextDirectionHeuristic r4, int r5, int r6) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        AbstractC0053c.m186q(AbstractC0053c.m177h(AbstractC0053c.m191v(AbstractC0053c.m176g(AbstractC0053c.m178i(r3), r5), r6), r4));
    L5:
        this.f192a = r3;
        this.f193b = r4;
        this.f194c = r5;
        this.f195d = r6;
    }

    public final boolean equals(Object r7) {
        if (r7 != this) goto L6;
        return true;
    L6:
        if ((r7 instanceof C0054d) == true) goto L8;
        return false;
    L8:
        C0054d r72 = (C0054d) r7;
        int r1 = r72.f194c;
        if (this.f194c == r1) goto L12;
    L42:
        return false;
    L12:
        if (this.f195d != r72.f195d) goto L42;
        TextPaint r12 = this.f192a;
        float r3 = r12.getTextSize();
        TextPaint r4 = r72.f192a;
        if (r3 != r4.getTextSize()) goto L42;
        if (r12.getTextScaleX() != r4.getTextScaleX()) goto L42;
        if (r12.getTextSkewX() != r4.getTextSkewX()) goto L42;
        if (r12.getLetterSpacing() != r4.getLetterSpacing()) goto L42;
        if (TextUtils.equals(r12.getFontFeatureSettings(), r4.getFontFeatureSettings()) == false) goto L42;
        if (r12.getFlags() != r4.getFlags()) goto L42;
        if (r12.getTextLocales().equals(r4.getTextLocales()) == false) goto L42;
        if (r12.getTypeface() != null) goto L41;
        if (r4.getTypeface() != null) goto L42;
    L44:
        if (this.f193b != r72.f193b) goto L47;
        return true;
    L47:
        return false;
    L41:
        if (r12.getTypeface().equals(r4.getTypeface()) == true) goto L44;
        goto L42
    }

    public final int hashCode() {
        TextPaint r02 = this.f192a;
        Float r2 = Float.valueOf(r02.getTextSize());
        Float r3 = Float.valueOf(r02.getTextScaleX());
        Float r4 = Float.valueOf(r02.getTextSkewX());
        Float r5 = Float.valueOf(r02.getLetterSpacing());
        Integer r6 = Integer.valueOf(r02.getFlags());
        LocaleList r7 = r02.getTextLocales();
        Typeface r8 = r02.getTypeface();
        Boolean r9 = Boolean.valueOf(r02.isElegantTextHeight());
        Integer r11 = Integer.valueOf(this.f194c);
        Integer r12 = Integer.valueOf(this.f195d);
        return Objects.hash(new Object[]{r2, r3, r4, r5, r6, r7, r8, r9, this.f193b, r11, r12});
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder("{");
        StringBuilder r1 = new StringBuilder("textSize=");
        TextPaint r2 = this.f192a;
        r1.append(r2.getTextSize());
        r02.append(r1.toString());
        r02.append(", textScaleX=" + r2.getTextScaleX());
        r02.append(", textSkewX=" + r2.getTextSkewX());
        r02.append(", letterSpacing=" + r2.getLetterSpacing());
        r02.append(", elegantTextHeight=" + r2.isElegantTextHeight());
        r02.append(", textLocale=" + r2.getTextLocales());
        r02.append(", typeface=" + r2.getTypeface());
        r02.append(", variationSettings=" + r2.getFontVariationSettings());
        r02.append(", textDir=" + this.f193b);
        r02.append(", breakStrategy=" + this.f194c);
        r02.append(", hyphenationFrequency=" + this.f195d);
        r02.append("}");
        return r02.toString();
    }

    public C0054d(PrecomputedText.Params r2) {
        this.f192a = AbstractC0053c.m180k(r2);
        this.f193b = AbstractC0053c.m179j(r2);
        this.f194c = AbstractC0053c.m171b(r2);
        this.f195d = AbstractC0053c.m190u(r2);
    }
}
