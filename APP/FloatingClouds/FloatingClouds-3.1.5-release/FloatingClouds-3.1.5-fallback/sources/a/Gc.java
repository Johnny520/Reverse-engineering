package a;

/* JADX INFO: loaded from: classes.dex */
public final class Gc implements android.text.Spannable {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.text.TextPaint f100a;
        public final android.text.TextDirectionHeuristic b;
        public final int c;
        public final int d;

        public a(android.text.PrecomputedText.Params r2) {
                r1 = this;
                r1.<init>()
                android.text.TextPaint r0 = r2.getTextPaint()
                r1.f100a = r0
                android.text.TextDirectionHeuristic r0 = r2.getTextDirection()
                r1.b = r0
                int r0 = r2.getBreakStrategy()
                r1.c = r0
                int r2 = r2.getHyphenationFrequency()
                r1.d = r2
                return
        }

        public final boolean a(a.Gc.a r5) {
                r4 = this;
                int r0 = r5.c
                r1 = 0
                int r2 = r4.c
                if (r2 == r0) goto L8
                return r1
            L8:
                int r0 = r4.d
                int r2 = r5.d
                if (r0 == r2) goto Lf
                return r1
            Lf:
                android.text.TextPaint r0 = r4.f100a
                float r2 = r0.getTextSize()
                android.text.TextPaint r3 = r5.f100a
                float r3 = r3.getTextSize()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L20
                return r1
            L20:
                float r2 = r0.getTextScaleX()
                android.text.TextPaint r5 = r5.f100a
                float r3 = r5.getTextScaleX()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L2f
                return r1
            L2f:
                float r2 = r0.getTextSkewX()
                float r3 = r5.getTextSkewX()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L3c
                return r1
            L3c:
                float r2 = r0.getLetterSpacing()
                float r3 = r5.getLetterSpacing()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L49
                return r1
            L49:
                java.lang.String r2 = r0.getFontFeatureSettings()
                java.lang.String r3 = r5.getFontFeatureSettings()
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 != 0) goto L58
                return r1
            L58:
                int r2 = r0.getFlags()
                int r3 = r5.getFlags()
                if (r2 == r3) goto L63
                return r1
            L63:
                android.os.LocaleList r2 = r0.getTextLocales()
                android.os.LocaleList r3 = r5.getTextLocales()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L72
                return r1
            L72:
                android.graphics.Typeface r2 = r0.getTypeface()
                if (r2 != 0) goto L7f
                android.graphics.Typeface r5 = r5.getTypeface()
                if (r5 == 0) goto L8e
                return r1
            L7f:
                android.graphics.Typeface r0 = r0.getTypeface()
                android.graphics.Typeface r5 = r5.getTypeface()
                boolean r5 = r0.equals(r5)
                if (r5 != 0) goto L8e
                return r1
            L8e:
                r5 = 1
                return r5
        }

        public final boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r4 != r3) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof a.Gc.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.Gc$a r4 = (a.Gc.a) r4
                boolean r1 = r3.a(r4)
                if (r1 != 0) goto L13
                return r2
            L13:
                android.text.TextDirectionHeuristic r1 = r3.b
                android.text.TextDirectionHeuristic r4 = r4.b
                if (r1 != r4) goto L1a
                return r0
            L1a:
                return r2
        }

        public final int hashCode() {
                r13 = this;
                android.text.TextPaint r0 = r13.f100a
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
                int r0 = java.util.Objects.hash(r0)
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
                android.text.TextPaint r2 = r4.f100a
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

    @Override // java.lang.CharSequence
    public final char charAt(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // android.text.Spanned
    public final int getSpanStart(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int r1, int r2, java.lang.Class<T> r3) {
            r0 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 0
            if (r1 < r2) goto L8
            throw r3
        L8:
            throw r3
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int r1, int r2, java.lang.Class r3) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // android.text.Spannable
    public final void removeSpan(java.lang.Object r3) {
            r2 = this;
            boolean r3 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r3 != 0) goto Ld
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r1 = 0
            if (r3 < r0) goto Lc
            throw r1
        Lc:
            throw r1
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "MetricAffectingSpan can not be removed from PrecomputedText."
            r3.<init>(r0)
            throw r3
    }

    @Override // android.text.Spannable
    public final void setSpan(java.lang.Object r1, int r2, int r3, int r4) {
            r0 = this;
            boolean r1 = r1 instanceof android.text.style.MetricAffectingSpan
            if (r1 != 0) goto Ld
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 0
            if (r1 < r2) goto Lc
            throw r3
        Lc:
            throw r3
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "MetricAffectingSpan can not be set to PrecomputedText."
            r1.<init>(r2)
            throw r1
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r1, int r2) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r1 = this;
            r0 = 0
            throw r0
    }
}
