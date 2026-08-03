package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4853 implements android.text.Spannable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final char f15342 = '\n';

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final java.lang.Object f15343 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    @Yue.InterfaceC2947("sLock")
    public static java.util.concurrent.Executor f15344;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.text.Spannable f15345;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final Yue.C4853.C4855 f15346;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final int[] f15347;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final android.text.PrecomputedText f15348;

    /* JADX INFO: renamed from: Yue.ۥۡۤۦ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C4854 {
        public C4854() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.text.Spannable m19150(android.text.PrecomputedText r0) {
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۦ۟$ۥ۟, reason: contains not printable characters */
    public static final class C4855 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.text.TextPaint f15349;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public final android.text.TextDirectionHeuristic f15350;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f15351;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int f15352;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final android.text.PrecomputedText.Params f15353;

        /* JADX INFO: renamed from: Yue.ۥۡۤۦ۟$ۥ۟$ۥ, reason: contains not printable characters */
        public static class C4856 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            @Yue.InterfaceC4410
            public final android.text.TextPaint f15354;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public android.text.TextDirectionHeuristic f15355;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public int f15356;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int f15357;

            public C4856(@Yue.InterfaceC4410 android.text.TextPaint r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f15354 = r1
                    r1 = 1
                    r0.f15356 = r1
                    r0.f15357 = r1
                    android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                    r0.f15355 = r1
                    return
            }

            @Yue.InterfaceC4410
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public Yue.C4853.C4855 m19156() {
                    r5 = this;
                    Yue.ۥۡۤۦ۟$ۥ۟ r0 = new Yue.ۥۡۤۦ۟$ۥ۟
                    android.text.TextPaint r1 = r5.f15354
                    android.text.TextDirectionHeuristic r2 = r5.f15355
                    int r3 = r5.f15356
                    int r4 = r5.f15357
                    r0.<init>(r1, r2, r3, r4)
                    return r0
            }

            @Yue.InterfaceC5336(23)
            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public Yue.C4853.C4855.C4856 m19157(int r1) {
                    r0 = this;
                    r0.f15356 = r1
                    return r0
            }

            @Yue.InterfaceC5336(23)
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public Yue.C4853.C4855.C4856 m19158(int r1) {
                    r0 = this;
                    r0.f15357 = r1
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public Yue.C4853.C4855.C4856 m19159(@Yue.InterfaceC4410 android.text.TextDirectionHeuristic r1) {
                    r0 = this;
                    r0.f15355 = r1
                    return r0
            }
        }

        @Yue.InterfaceC5336(28)
        public C4855(@Yue.InterfaceC4410 android.text.PrecomputedText.Params r3) {
                r2 = this;
                r2.<init>()
                android.text.TextPaint r0 = Yue.C4859.m19161(r3)
                r2.f15349 = r0
                android.text.TextDirectionHeuristic r0 = Yue.C4860.m19162(r3)
                r2.f15350 = r0
                int r0 = Yue.C4861.m19163(r3)
                r2.f15351 = r0
                int r0 = Yue.C4862.m19164(r3)
                r2.f15352 = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L22
                goto L23
            L22:
                r3 = 0
            L23:
                r2.f15353 = r3
                return
        }

        public C4855(@Yue.InterfaceC4410 android.text.TextPaint r3, @Yue.InterfaceC4410 android.text.TextDirectionHeuristic r4, int r5, int r6) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L20
                android.text.PrecomputedText$Params$Builder r0 = Yue.C4867.m19169(r3)
                android.text.PrecomputedText$Params$Builder r0 = Yue.C4863.m19165(r0, r5)
                android.text.PrecomputedText$Params$Builder r0 = Yue.C4864.m19166(r0, r6)
                android.text.PrecomputedText$Params$Builder r0 = Yue.C4865.m19167(r0, r4)
                android.text.PrecomputedText$Params r0 = Yue.C4866.m19168(r0)
                r2.f15353 = r0
                goto L23
            L20:
                r0 = 0
                r2.f15353 = r0
            L23:
                r2.f15349 = r3
                r2.f15350 = r4
                r2.f15351 = r5
                r2.f15352 = r6
                return
        }

        public boolean equals(@Yue.InterfaceC4544 java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r4 != r3) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof Yue.C4853.C4855
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                Yue.ۥۡۤۦ۟$ۥ۟ r4 = (Yue.C4853.C4855) r4
                boolean r1 = r3.m19151(r4)
                if (r1 != 0) goto L13
                return r2
            L13:
                android.text.TextDirectionHeuristic r1 = r3.f15350
                android.text.TextDirectionHeuristic r4 = r4.m19154()
                if (r1 != r4) goto L1c
                goto L1d
            L1c:
                r0 = r2
            L1d:
                return r0
        }

        public int hashCode() {
                r12 = this;
                android.text.TextPaint r0 = r12.f15349
                float r0 = r0.getTextSize()
                java.lang.Float r1 = java.lang.Float.valueOf(r0)
                android.text.TextPaint r0 = r12.f15349
                float r0 = r0.getTextScaleX()
                java.lang.Float r2 = java.lang.Float.valueOf(r0)
                android.text.TextPaint r0 = r12.f15349
                float r0 = r0.getTextSkewX()
                java.lang.Float r3 = java.lang.Float.valueOf(r0)
                android.text.TextPaint r0 = r12.f15349
                float r0 = r0.getLetterSpacing()
                java.lang.Float r4 = java.lang.Float.valueOf(r0)
                android.text.TextPaint r0 = r12.f15349
                int r0 = r0.getFlags()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                android.text.TextPaint r0 = r12.f15349
                android.os.LocaleList r6 = r0.getTextLocales()
                android.text.TextPaint r0 = r12.f15349
                android.graphics.Typeface r7 = r0.getTypeface()
                android.text.TextPaint r0 = r12.f15349
                boolean r0 = r0.isElegantTextHeight()
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
                android.text.TextDirectionHeuristic r9 = r12.f15350
                int r0 = r12.f15351
                java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
                int r0 = r12.f15352
                java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
                int r0 = Yue.C4554.m18125(r0)
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "textSize="
                r1.append(r2)
                android.text.TextPaint r2 = r3.f15349
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r3.f15349
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r3.f15349
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", letterSpacing="
                r1.append(r2)
                android.text.TextPaint r2 = r3.f15349
                float r2 = r2.getLetterSpacing()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", elegantTextHeight="
                r1.append(r2)
                android.text.TextPaint r2 = r3.f15349
                boolean r2 = r2.isElegantTextHeight()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textLocale="
                r1.append(r2)
                android.text.TextPaint r2 = r3.f15349
                android.os.LocaleList r2 = r2.getTextLocales()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", typeface="
                r1.append(r2)
                android.text.TextPaint r2 = r3.f15349
                android.graphics.Typeface r2 = r2.getTypeface()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", variationSettings="
                r1.append(r2)
                android.text.TextPaint r2 = r3.f15349
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textDir="
                r1.append(r2)
                android.text.TextDirectionHeuristic r2 = r3.f15350
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r3.f15351
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r2 = r3.f15352
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean m19151(@Yue.InterfaceC4410 Yue.C4853.C4855 r4) {
                r3 = this;
                int r0 = r3.f15351
                int r1 = r4.m19152()
                r2 = 0
                if (r0 == r1) goto La
                return r2
            La:
                int r0 = r3.f15352
                int r1 = r4.m19153()
                if (r0 == r1) goto L13
                return r2
            L13:
                android.text.TextPaint r0 = r3.f15349
                float r0 = r0.getTextSize()
                android.text.TextPaint r1 = r4.m19155()
                float r1 = r1.getTextSize()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L26
                return r2
            L26:
                android.text.TextPaint r0 = r3.f15349
                float r0 = r0.getTextScaleX()
                android.text.TextPaint r1 = r4.m19155()
                float r1 = r1.getTextScaleX()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L39
                return r2
            L39:
                android.text.TextPaint r0 = r3.f15349
                float r0 = r0.getTextSkewX()
                android.text.TextPaint r1 = r4.m19155()
                float r1 = r1.getTextSkewX()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L4c
                return r2
            L4c:
                android.text.TextPaint r0 = r3.f15349
                float r0 = r0.getLetterSpacing()
                android.text.TextPaint r1 = r4.m19155()
                float r1 = r1.getLetterSpacing()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L5f
                return r2
            L5f:
                android.text.TextPaint r0 = r3.f15349
                java.lang.String r0 = r0.getFontFeatureSettings()
                android.text.TextPaint r1 = r4.m19155()
                java.lang.String r1 = r1.getFontFeatureSettings()
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 != 0) goto L74
                return r2
            L74:
                android.text.TextPaint r0 = r3.f15349
                int r0 = r0.getFlags()
                android.text.TextPaint r1 = r4.m19155()
                int r1 = r1.getFlags()
                if (r0 == r1) goto L85
                return r2
            L85:
                android.text.TextPaint r0 = r3.f15349
                android.os.LocaleList r0 = r0.getTextLocales()
                android.text.TextPaint r1 = r4.m19155()
                android.os.LocaleList r1 = r1.getTextLocales()
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L9a
                return r2
            L9a:
                android.text.TextPaint r0 = r3.f15349
                android.graphics.Typeface r0 = r0.getTypeface()
                if (r0 != 0) goto Lad
                android.text.TextPaint r4 = r4.m19155()
                android.graphics.Typeface r4 = r4.getTypeface()
                if (r4 == 0) goto Lc2
                return r2
            Lad:
                android.text.TextPaint r0 = r3.f15349
                android.graphics.Typeface r0 = r0.getTypeface()
                android.text.TextPaint r4 = r4.m19155()
                android.graphics.Typeface r4 = r4.getTypeface()
                boolean r4 = r0.equals(r4)
                if (r4 != 0) goto Lc2
                return r2
            Lc2:
                r4 = 1
                return r4
        }

        @Yue.InterfaceC5336(23)
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int m19152() {
                r1 = this;
                int r0 = r1.f15351
                return r0
        }

        @Yue.InterfaceC5336(23)
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m19153() {
                r1 = this;
                int r0 = r1.f15352
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public android.text.TextDirectionHeuristic m19154() {
                r1 = this;
                android.text.TextDirectionHeuristic r0 = r1.f15350
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public android.text.TextPaint m19155() {
                r1 = this;
                android.text.TextPaint r0 = r1.f15349
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۦ۟$ۥ۟۟, reason: contains not printable characters */
    public static class C4857 extends java.util.concurrent.FutureTask<Yue.C4853> {

        /* JADX INFO: renamed from: Yue.ۥۡۤۦ۟$ۥ۟۟$ۥ, reason: contains not printable characters */
        public static class CallableC4858 implements java.util.concurrent.Callable<Yue.C4853> {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public Yue.C4853.C4855 f15358;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public java.lang.CharSequence f15359;

            public CallableC4858(@Yue.InterfaceC4410 Yue.C4853.C4855 r1, @Yue.InterfaceC4410 java.lang.CharSequence r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f15358 = r1
                    r0.f15359 = r2
                    return
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Yue.C4853 call() throws java.lang.Exception {
                    r1 = this;
                    Yue.ۥۡۤۦ۟ r0 = r1.m19160()
                    return r0
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public Yue.C4853 m19160() throws java.lang.Exception {
                    r2 = this;
                    java.lang.CharSequence r0 = r2.f15359
                    Yue.ۥۡۤۦ۟$ۥ۟ r1 = r2.f15358
                    Yue.ۥۡۤۦ۟ r0 = Yue.C4853.m19143(r0, r1)
                    return r0
            }
        }

        public C4857(@Yue.InterfaceC4410 Yue.C4853.C4855 r2, @Yue.InterfaceC4410 java.lang.CharSequence r3) {
                r1 = this;
                Yue.ۥۡۤۦ۟$ۥ۟۟$ۥ r0 = new Yue.ۥۡۤۦ۟$ۥ۟۟$ۥ
                r0.<init>(r2, r3)
                r1.<init>(r0)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C4853.f15343 = r0
            return
    }

    @Yue.InterfaceC5336(28)
    public C4853(@Yue.InterfaceC4410 android.text.PrecomputedText r3, @Yue.InterfaceC4410 Yue.C4853.C4855 r4) {
            r2 = this;
            r2.<init>()
            android.text.Spannable r0 = Yue.C4853.C4854.m19150(r3)
            r2.f15345 = r0
            r2.f15346 = r4
            r4 = 0
            r2.f15347 = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L15
            goto L16
        L15:
            r3 = r4
        L16:
            r2.f15348 = r3
            return
    }

    public C4853(@Yue.InterfaceC4410 java.lang.CharSequence r2, @Yue.InterfaceC4410 Yue.C4853.C4855 r3, @Yue.InterfaceC4410 int[] r4) {
            r1 = this;
            r1.<init>()
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            r1.f15345 = r0
            r1.f15346 = r3
            r1.f15347 = r4
            r2 = 0
            r1.f15348 = r2
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C4853 m19143(@Yue.InterfaceC4410 java.lang.CharSequence r5, @Yue.InterfaceC4410 Yue.C4853.C4855 r6) {
            Yue.C4868.m19181(r5)
            Yue.C4868.m19181(r6)
            java.lang.String r0 = "PrecomputedText"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L22
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L22
            r1 = 29
            if (r0 < r1) goto L25
            android.text.PrecomputedText$Params r0 = r6.f15353     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L25
            Yue.ۥۡۤۦ۟ r1 = new Yue.ۥۡۤۦ۟     // Catch: java.lang.Throwable -> L22
            android.text.PrecomputedText r5 = Yue.C4844.m19134(r5, r0)     // Catch: java.lang.Throwable -> L22
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L22
            android.os.Trace.endSection()
            return r1
        L22:
            r5 = move-exception
            goto L95
        L25:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22
            r0.<init>()     // Catch: java.lang.Throwable -> L22
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L22
            r2 = 0
            r3 = r2
        L30:
            if (r3 >= r1) goto L46
            r4 = 10
            int r3 = android.text.TextUtils.indexOf(r5, r4, r3, r1)     // Catch: java.lang.Throwable -> L22
            if (r3 >= 0) goto L3c
            r3 = r1
            goto L3e
        L3c:
            int r3 = r3 + 1
        L3e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L22
            r0.add(r4)     // Catch: java.lang.Throwable -> L22
            goto L30
        L46:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L22
            int[] r1 = new int[r1]     // Catch: java.lang.Throwable -> L22
            r3 = r2
        L4d:
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L22
            if (r3 >= r4) goto L62
            java.lang.Object r4 = r0.get(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L22
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L22
            r1[r3] = r4     // Catch: java.lang.Throwable -> L22
            int r3 = r3 + 1
            goto L4d
        L62:
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L22
            android.text.TextPaint r3 = r6.m19155()     // Catch: java.lang.Throwable -> L22
            r4 = 2147483647(0x7fffffff, float:NaN)
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r5, r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L22
            int r2 = r6.m19152()     // Catch: java.lang.Throwable -> L22
            android.text.StaticLayout$Builder r0 = r0.setBreakStrategy(r2)     // Catch: java.lang.Throwable -> L22
            int r2 = r6.m19153()     // Catch: java.lang.Throwable -> L22
            android.text.StaticLayout$Builder r0 = r0.setHyphenationFrequency(r2)     // Catch: java.lang.Throwable -> L22
            android.text.TextDirectionHeuristic r2 = r6.m19154()     // Catch: java.lang.Throwable -> L22
            android.text.StaticLayout$Builder r0 = r0.setTextDirection(r2)     // Catch: java.lang.Throwable -> L22
            r0.build()     // Catch: java.lang.Throwable -> L22
            Yue.ۥۡۤۦ۟ r0 = new Yue.ۥۡۤۦ۟     // Catch: java.lang.Throwable -> L22
            r0.<init>(r5, r6, r1)     // Catch: java.lang.Throwable -> L22
            android.os.Trace.endSection()
            return r0
        L95:
            android.os.Trace.endSection()
            throw r5
    }

    @Yue.InterfaceC6567
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.util.concurrent.Future<Yue.C4853> m19144(@Yue.InterfaceC4410 java.lang.CharSequence r1, @Yue.InterfaceC4410 Yue.C4853.C4855 r2, @Yue.InterfaceC4544 java.util.concurrent.Executor r3) {
            Yue.ۥۡۤۦ۟$ۥ۟۟ r0 = new Yue.ۥۡۤۦ۟$ۥ۟۟
            r0.<init>(r2, r1)
            if (r3 != 0) goto L1e
            java.lang.Object r1 = Yue.C4853.f15343
            monitor-enter(r1)
            java.util.concurrent.Executor r2 = Yue.C4853.f15344     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            r2 = 1
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newFixedThreadPool(r2)     // Catch: java.lang.Throwable -> L16
            Yue.C4853.f15344 = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1c
        L18:
            java.util.concurrent.Executor r3 = Yue.C4853.f15344     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            goto L1e
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
        L1e:
            r3.execute(r0)
            return r0
    }

    @Override // java.lang.CharSequence
    public char charAt(int r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f15345
            char r2 = r0.charAt(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f15345
            int r2 = r0.getSpanEnd(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f15345
            int r2 = r0.getSpanFlags(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f15345
            int r2 = r0.getSpanStart(r2)
            return r2
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int r3, int r4, java.lang.Class<T> r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            android.text.PrecomputedText r0 = r2.f15348
            java.lang.Object[] r3 = Yue.C4847.m19137(r0, r3, r4, r5)
            return r3
        Ld:
            android.text.Spannable r0 = r2.f15345
            java.lang.Object[] r3 = r0.getSpans(r3, r4, r5)
            return r3
    }

    @Override // java.lang.CharSequence
    public int length() {
            r1 = this;
            android.text.Spannable r0 = r1.f15345
            int r0 = r0.length()
            return r0
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            android.text.Spannable r0 = r1.f15345
            int r2 = r0.nextSpanTransition(r2, r3, r4)
            return r2
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L10
            android.text.PrecomputedText r0 = r2.f15348
            Yue.C4849.m19139(r0, r3)
            goto L15
        L10:
            android.text.Spannable r0 = r2.f15345
            r0.removeSpan(r3)
        L15:
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "MetricAffectingSpan can not be removed from PrecomputedText."
            r3.<init>(r0)
            throw r3
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object r3, int r4, int r5, int r6) {
            r2 = this;
            boolean r0 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L10
            android.text.PrecomputedText r0 = r2.f15348
            Yue.C4850.m19140(r0, r3, r4, r5, r6)
            goto L15
        L10:
            android.text.Spannable r0 = r2.f15345
            r0.setSpan(r3, r4, r5, r6)
        L15:
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "MetricAffectingSpan can not be set to PrecomputedText."
            r3.<init>(r4)
            throw r3
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            android.text.Spannable r0 = r1.f15345
            java.lang.CharSequence r2 = r0.subSequence(r2, r3)
            return r2
    }

    @Override // java.lang.CharSequence
    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r1 = this;
            android.text.Spannable r0 = r1.f15345
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC3281(from = 0)
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int m19145() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            android.text.PrecomputedText r0 = r2.f15348
            int r0 = Yue.C4848.m19138(r0)
            return r0
        Ld:
            int[] r0 = r2.f15347
            int r0 = r0.length
            return r0
    }

    @Yue.InterfaceC3281(from = 0)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m19146(@Yue.InterfaceC3281(from = 0) int r4) {
            r3 = this;
            int r0 = r3.m19145()
            java.lang.String r1 = "paraIndex"
            r2 = 0
            Yue.C4868.m19176(r4, r2, r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L17
            android.text.PrecomputedText r0 = r3.f15348
            int r4 = Yue.C4851.m19141(r0, r4)
            return r4
        L17:
            int[] r0 = r3.f15347
            r4 = r0[r4]
            return r4
    }

    @Yue.InterfaceC3281(from = 0)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m19147(@Yue.InterfaceC3281(from = 0) int r4) {
            r3 = this;
            int r0 = r3.m19145()
            java.lang.String r1 = "paraIndex"
            r2 = 0
            Yue.C4868.m19176(r4, r2, r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L17
            android.text.PrecomputedText r0 = r3.f15348
            int r4 = Yue.C4852.m19142(r0, r4)
            return r4
        L17:
            if (r4 != 0) goto L1a
            goto L20
        L1a:
            int[] r0 = r3.f15347
            int r4 = r4 + (-1)
            r2 = r0[r4]
        L20:
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C4853.C4855 m19148() {
            r1 = this;
            Yue.ۥۡۤۦ۟$ۥ۟ r0 = r1.f15346
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    @Yue.InterfaceC5336(28)
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.text.PrecomputedText m19149() {
            r1 = this;
            android.text.Spannable r0 = r1.f15345
            boolean r0 = Yue.C4845.m19135(r0)
            if (r0 == 0) goto Lf
            android.text.Spannable r0 = r1.f15345
            android.text.PrecomputedText r0 = Yue.C4846.m19136(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }
}
