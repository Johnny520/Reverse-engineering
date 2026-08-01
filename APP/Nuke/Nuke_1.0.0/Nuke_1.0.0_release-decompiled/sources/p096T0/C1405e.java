package p096T0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: T0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1405e {

    /* JADX INFO: renamed from: a */
    public final CharSequence f5028a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f5029b;

    /* JADX INFO: renamed from: c */
    public final int f5030c;

    /* JADX INFO: renamed from: d */
    public float f5031d = Float.NaN;

    /* JADX INFO: renamed from: e */
    public float f5032e = Float.NaN;

    /* JADX INFO: renamed from: f */
    public BoringLayout.Metrics f5033f;

    /* JADX INFO: renamed from: g */
    public boolean f5034g;

    /* JADX INFO: renamed from: h */
    public CharSequence f5035h;

    public C1405e(CharSequence charSequence, TextPaint textPaint, int i5) {
        this.f5028a = charSequence;
        this.f5029b = textPaint;
        this.f5030c = i5;
    }

    /* JADX INFO: renamed from: a */
    public final BoringLayout.Metrics m2691a() {
        if (!this.f5034g) {
            TextDirectionHeuristic textDirectionHeuristicM2716b = AbstractC1411k.m2716b(this.f5030c);
            int i5 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f5028a;
            TextPaint textPaint = this.f5029b;
            this.f5033f = i5 >= 33 ? BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicM2716b, true, null) : !textDirectionHeuristicM2716b.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f5034g = true;
        }
        return this.f5033f;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m2692b() {
        CharSequence charSequence = this.f5035h;
        if (charSequence != null) {
            AbstractC1665j.m2982b(charSequence);
            return charSequence;
        }
        CharSequence charSequence2 = this.f5028a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (AbstractC1407g.m2703f(spanned, CharacterStyle.class)) {
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
        this.f5035h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m2693c() {
        /*
            r6 = this;
            float r0 = r6.f5031d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r6.f5031d
            return r0
        Lb:
            android.text.BoringLayout$Metrics r0 = r6.m2691a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r6.f5029b
            if (r2 >= 0) goto L34
            java.lang.CharSequence r0 = r6.m2692b()
            int r0 = r0.length()
            java.lang.CharSequence r2 = r6.m2692b()
            r4 = 0
            float r0 = android.text.Layout.getDesiredWidth(r2, r4, r0, r3)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
        L34:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L5d
        L39:
            java.lang.CharSequence r2 = r6.f5028a
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L51
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<V0.f> r4 = p106V0.C1492f.class
            boolean r4 = p096T0.AbstractC1407g.m2703f(r2, r4)
            if (r4 != 0) goto L5a
            java.lang.Class<V0.e> r4 = p106V0.C1491e.class
            boolean r2 = p096T0.AbstractC1407g.m2703f(r2, r4)
            if (r2 != 0) goto L5a
        L51:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L5a
            goto L5d
        L5a:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L5d:
            r6.f5031d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p096T0.C1405e.m2693c():float");
    }
}
