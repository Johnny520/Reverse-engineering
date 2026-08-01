package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ni1 {

    /* JADX INFO: renamed from: α */
    public final android.text.TextPaint f7633;

    /* JADX INFO: renamed from: β */
    public final android.text.TextDirectionHeuristic f7634;

    /* JADX INFO: renamed from: γ */
    public final int f7635;

    /* JADX INFO: renamed from: δ */
    public final int f7636;

    public ni1(android.text.PrecomputedText.Params r2) {
            r1 = this;
            r1.<init>()
            android.text.TextPaint r0 = r2.getTextPaint()
            r1.f7633 = r0
            android.text.TextDirectionHeuristic r0 = r2.getTextDirection()
            r1.f7634 = r0
            int r0 = r2.getBreakStrategy()
            r1.f7635 = r0
            int r2 = r2.getHyphenationFrequency()
            r1.f7636 = r2
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p000.ni1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ni1 r7 = (p000.ni1) r7
            int r1 = r7.f7635
            android.text.TextPaint r3 = r7.f7633
            int r4 = r6.f7635
            if (r4 == r1) goto L16
            goto L99
        L16:
            int r1 = r6.f7636
            int r4 = r7.f7636
            if (r1 == r4) goto L1e
            goto L99
        L1e:
            android.text.TextPaint r1 = r6.f7633
            float r4 = r1.getTextSize()
            float r5 = r3.getTextSize()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L2e
            goto L99
        L2e:
            float r4 = r1.getTextScaleX()
            float r5 = r3.getTextScaleX()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L3b
            goto L99
        L3b:
            float r4 = r1.getTextSkewX()
            float r5 = r3.getTextSkewX()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L48
            goto L99
        L48:
            float r4 = r1.getLetterSpacing()
            float r5 = r3.getLetterSpacing()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L55
            goto L99
        L55:
            java.lang.String r4 = r1.getFontFeatureSettings()
            java.lang.String r5 = r3.getFontFeatureSettings()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L64
            goto L99
        L64:
            int r4 = r1.getFlags()
            int r5 = r3.getFlags()
            if (r4 == r5) goto L6f
            goto L99
        L6f:
            android.os.LocaleList r4 = r1.getTextLocales()
            android.os.LocaleList r5 = r3.getTextLocales()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L7e
            goto L99
        L7e:
            android.graphics.Typeface r4 = r1.getTypeface()
            if (r4 != 0) goto L8b
            android.graphics.Typeface r1 = r3.getTypeface()
            if (r1 == 0) goto L9a
            goto L99
        L8b:
            android.graphics.Typeface r1 = r1.getTypeface()
            android.graphics.Typeface r3 = r3.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L9a
        L99:
            return r2
        L9a:
            android.text.TextDirectionHeuristic r6 = r6.f7634
            android.text.TextDirectionHeuristic r7 = r7.f7634
            if (r6 != r7) goto La1
            return r0
        La1:
            return r2
    }

    public final int hashCode() {
            r13 = this;
            android.text.TextPaint r0 = r13.f7633
            float r1 = r0.getTextSize()
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            float r1 = r0.getTextScaleX()
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            float r1 = r0.getTextSkewX()
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
            float r1 = r0.getLetterSpacing()
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            int r1 = r0.getFlags()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            android.os.LocaleList r7 = r0.getTextLocales()
            android.graphics.Typeface r8 = r0.getTypeface()
            boolean r0 = r0.isElegantTextHeight()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            int r0 = r13.f7635
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            int r0 = r13.f7636
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            android.text.TextDirectionHeuristic r10 = r13.f7634
            java.lang.Object[] r13 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            int r13 = java.util.Objects.hash(r13)
            return r13
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{"
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "textSize="
            r1.<init>(r2)
            android.text.TextPaint r2 = r4.f7633
            float r3 = r2.getTextSize()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", textScaleX="
            r1.<init>(r3)
            float r3 = r2.getTextScaleX()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", textSkewX="
            r1.<init>(r3)
            float r3 = r2.getTextSkewX()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", letterSpacing="
            r1.<init>(r3)
            float r3 = r2.getLetterSpacing()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", elegantTextHeight="
            r1.<init>(r3)
            boolean r3 = r2.isElegantTextHeight()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", textLocale="
            r1.<init>(r3)
            android.os.LocaleList r3 = r2.getTextLocales()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", typeface="
            r1.<init>(r3)
            android.graphics.Typeface r3 = r2.getTypeface()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ", variationSettings="
            r1.<init>(r3)
            java.lang.String r2 = r2.getFontVariationSettings()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", textDir="
            r1.<init>(r2)
            android.text.TextDirectionHeuristic r2 = r4.f7634
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", breakStrategy="
            r1.<init>(r2)
            int r2 = r4.f7635
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", hyphenationFrequency="
            r1.<init>(r2)
            int r4 = r4.f7636
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.append(r4)
            java.lang.String r4 = "}"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
