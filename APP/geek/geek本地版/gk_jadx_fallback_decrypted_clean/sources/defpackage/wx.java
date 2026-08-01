package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wx {
    public final android.text.TextPaint a;
    public final android.text.TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public wx(android.text.PrecomputedText.Params r2) {
            r1 = this;
            r1.<init>()
            android.text.TextPaint r0 = defpackage.c0.k(r2)
            r1.a = r0
            android.text.TextDirectionHeuristic r0 = defpackage.c0.j(r2)
            r1.b = r0
            int r0 = defpackage.c0.b(r2)
            r1.c = r0
            int r2 = defpackage.c0.u(r2)
            r1.d = r2
            return
    }

    public wx(android.text.TextPaint r3, android.text.TextDirectionHeuristic r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1c
            android.text.PrecomputedText$Params$Builder r0 = defpackage.c0.i(r3)
            android.text.PrecomputedText$Params$Builder r0 = defpackage.c0.g(r0, r5)
            android.text.PrecomputedText$Params$Builder r0 = defpackage.c0.v(r0, r6)
            android.text.PrecomputedText$Params$Builder r0 = defpackage.c0.h(r0, r4)
            defpackage.c0.m(r0)
        L1c:
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2.d = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r5 != r4) goto L4
            goto La2
        L4:
            boolean r0 = r5 instanceof defpackage.wx
            if (r0 != 0) goto La
            goto La0
        La:
            wx r5 = (defpackage.wx) r5
            int r0 = r4.c
            int r1 = r5.c
            if (r0 == r1) goto L14
            goto La0
        L14:
            int r0 = r4.d
            int r1 = r5.d
            if (r0 == r1) goto L1c
            goto La0
        L1c:
            android.text.TextPaint r0 = r4.a
            float r1 = r0.getTextSize()
            android.text.TextPaint r2 = r5.a
            float r3 = r2.getTextSize()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L2e
            goto La0
        L2e:
            float r1 = r0.getTextScaleX()
            float r3 = r2.getTextScaleX()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L3b
            goto La0
        L3b:
            float r1 = r0.getTextSkewX()
            float r3 = r2.getTextSkewX()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L48
            goto La0
        L48:
            float r1 = r0.getLetterSpacing()
            float r3 = r2.getLetterSpacing()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L55
            goto La0
        L55:
            java.lang.String r1 = r0.getFontFeatureSettings()
            java.lang.String r3 = r2.getFontFeatureSettings()
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 != 0) goto L64
            goto La0
        L64:
            int r1 = r0.getFlags()
            int r3 = r2.getFlags()
            if (r1 == r3) goto L6f
            goto La0
        L6f:
            android.os.LocaleList r1 = r0.getTextLocales()
            android.os.LocaleList r3 = r2.getTextLocales()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L7e
            goto La0
        L7e:
            android.graphics.Typeface r1 = r0.getTypeface()
            if (r1 != 0) goto L8b
            android.graphics.Typeface r0 = r2.getTypeface()
            if (r0 == 0) goto L9a
            goto La0
        L8b:
            android.graphics.Typeface r0 = r0.getTypeface()
            android.graphics.Typeface r1 = r2.getTypeface()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9a
            goto La0
        L9a:
            android.text.TextDirectionHeuristic r0 = r4.b
            android.text.TextDirectionHeuristic r5 = r5.b
            if (r0 == r5) goto La2
        La0:
            r5 = 0
            return r5
        La2:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r13 = this;
            android.text.TextPaint r0 = r13.a
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
            int r0 = r13.c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            int r0 = r13.d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            android.text.TextDirectionHeuristic r10 = r13.b
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            int r0 = defpackage.pw.b(r0)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{"
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "textSize="
            r1.<init>(r2)
            android.text.TextPaint r2 = r4.a
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
            android.text.TextDirectionHeuristic r2 = r4.b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", breakStrategy="
            r1.<init>(r2)
            int r2 = r4.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", hyphenationFrequency="
            r1.<init>(r2)
            int r2 = r4.d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
