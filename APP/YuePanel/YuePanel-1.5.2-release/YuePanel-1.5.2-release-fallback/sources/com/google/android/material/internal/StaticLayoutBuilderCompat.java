package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
final class StaticLayoutBuilderCompat {
    static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    static final float DEFAULT_LINE_SPACING_ADD = 0.0f;
    static final float DEFAULT_LINE_SPACING_MULTIPLIER = 1.0f;
    private static final java.lang.String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
    private static final java.lang.String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
    private static final java.lang.String TEXT_DIR_CLASS_LTR = "LTR";
    private static final java.lang.String TEXT_DIR_CLASS_RTL = "RTL";

    @Yue.InterfaceC4544
    private static java.lang.reflect.Constructor<android.text.StaticLayout> constructor;
    private static boolean initialized;

    @Yue.InterfaceC4544
    private static java.lang.Object textDirection;
    private android.text.Layout.Alignment alignment;

    @Yue.InterfaceC4544
    private android.text.TextUtils.TruncateAt ellipsize;
    private int end;
    private int hyphenationFrequency;
    private boolean includePad;
    private boolean isRtl;
    private float lineSpacingAdd;
    private float lineSpacingMultiplier;
    private int maxLines;
    private final android.text.TextPaint paint;
    private java.lang.CharSequence source;
    private int start;

    @Yue.InterfaceC4544
    private com.google.android.material.internal.StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private final int width;

    public static class StaticLayoutBuilderCompatException extends java.lang.Exception {
        public StaticLayoutBuilderCompatException(java.lang.Throwable r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Error thrown initializing StaticLayout "
                r0.append(r1)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
        }
    }

    static {
            r0 = 1
            com.google.android.material.internal.StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY = r0
            return
    }

    private StaticLayoutBuilderCompat(java.lang.CharSequence r1, android.text.TextPaint r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.paint = r2
            r0.width = r3
            r2 = 0
            r0.start = r2
            int r1 = r1.length()
            r0.end = r1
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            r0.alignment = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.maxLines = r1
            r1 = 0
            r0.lineSpacingAdd = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.lineSpacingMultiplier = r1
            int r1 = com.google.android.material.internal.StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY
            r0.hyphenationFrequency = r1
            r1 = 1
            r0.includePad = r1
            r1 = 0
            r0.ellipsize = r1
            return
    }

    private void createConstructorWithReflection() throws com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException {
            r15 = this;
            boolean r0 = com.google.android.material.internal.StaticLayoutBuilderCompat.initialized
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r15.isRtl     // Catch: java.lang.Exception -> Lf
            r1 = 1
            java.lang.Class<android.text.TextDirectionHeuristic> r8 = android.text.TextDirectionHeuristic.class
            if (r0 == 0) goto L11
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL     // Catch: java.lang.Exception -> Lf
            goto L13
        Lf:
            r0 = move-exception
            goto L3a
        L11:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR     // Catch: java.lang.Exception -> Lf
        L13:
            com.google.android.material.internal.StaticLayoutBuilderCompat.textDirection = r0     // Catch: java.lang.Exception -> Lf
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lf
            java.lang.Class<android.text.TextPaint> r5 = android.text.TextPaint.class
            java.lang.Class<android.text.Layout$Alignment> r7 = android.text.Layout.Alignment.class
            java.lang.Class r10 = java.lang.Float.TYPE     // Catch: java.lang.Exception -> Lf
            java.lang.Class r11 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> Lf
            java.lang.Class<android.text.TextUtils$TruncateAt> r12 = android.text.TextUtils.TruncateAt.class
            r3 = r14
            r4 = r14
            r6 = r14
            r9 = r10
            r13 = r14
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Exception -> Lf
            java.lang.Class<android.text.StaticLayout> r2 = android.text.StaticLayout.class
            java.lang.reflect.Constructor r0 = r2.getDeclaredConstructor(r0)     // Catch: java.lang.Exception -> Lf
            com.google.android.material.internal.StaticLayoutBuilderCompat.constructor = r0     // Catch: java.lang.Exception -> Lf
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lf
            com.google.android.material.internal.StaticLayoutBuilderCompat.initialized = r1     // Catch: java.lang.Exception -> Lf
            return
        L3a:
            com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException r1 = new com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException
            r1.<init>(r0)
            throw r1
    }

    @Yue.InterfaceC4410
    public static com.google.android.material.internal.StaticLayoutBuilderCompat obtain(@Yue.InterfaceC4410 java.lang.CharSequence r1, @Yue.InterfaceC4410 android.text.TextPaint r2, @Yue.InterfaceC3281(from = 0) int r3) {
            com.google.android.material.internal.StaticLayoutBuilderCompat r0 = new com.google.android.material.internal.StaticLayoutBuilderCompat
            r0.<init>(r1, r2, r3)
            return r0
    }

    public android.text.StaticLayout build() throws com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException {
            r6 = this;
            java.lang.CharSequence r0 = r6.source
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
            r6.source = r0
        L8:
            r0 = 0
            int r1 = r6.width
            int r0 = java.lang.Math.max(r0, r1)
            java.lang.CharSequence r1 = r6.source
            int r2 = r6.maxLines
            r3 = 1
            if (r2 != r3) goto L1f
            android.text.TextPaint r2 = r6.paint
            float r4 = (float) r0
            android.text.TextUtils$TruncateAt r5 = r6.ellipsize
            java.lang.CharSequence r1 = android.text.TextUtils.ellipsize(r1, r2, r4, r5)
        L1f:
            int r2 = r1.length()
            int r4 = r6.end
            int r2 = java.lang.Math.min(r2, r4)
            r6.end = r2
            boolean r4 = r6.isRtl
            if (r4 == 0) goto L37
            int r4 = r6.maxLines
            if (r4 != r3) goto L37
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r6.alignment = r4
        L37:
            int r4 = r6.start
            android.text.TextPaint r5 = r6.paint
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r1, r4, r2, r5, r0)
            android.text.Layout$Alignment r1 = r6.alignment
            r0.setAlignment(r1)
            boolean r1 = r6.includePad
            r0.setIncludePad(r1)
            boolean r1 = r6.isRtl
            if (r1 == 0) goto L50
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.RTL
            goto L52
        L50:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.LTR
        L52:
            r0.setTextDirection(r1)
            android.text.TextUtils$TruncateAt r1 = r6.ellipsize
            if (r1 == 0) goto L5c
            r0.setEllipsize(r1)
        L5c:
            int r1 = r6.maxLines
            r0.setMaxLines(r1)
            float r1 = r6.lineSpacingAdd
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L70
            float r2 = r6.lineSpacingMultiplier
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L75
        L70:
            float r2 = r6.lineSpacingMultiplier
            r0.setLineSpacing(r1, r2)
        L75:
            int r1 = r6.maxLines
            if (r1 <= r3) goto L7e
            int r1 = r6.hyphenationFrequency
            r0.setHyphenationFrequency(r1)
        L7e:
            com.google.android.material.internal.StaticLayoutBuilderConfigurer r1 = r6.staticLayoutBuilderConfigurer
            if (r1 == 0) goto L85
            r1.configure(r0)
        L85:
            android.text.StaticLayout r0 = r0.build()
            return r0
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setAlignment(@Yue.InterfaceC4410 android.text.Layout.Alignment r1) {
            r0 = this;
            r0.alignment = r1
            return r0
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setEllipsize(@Yue.InterfaceC4544 android.text.TextUtils.TruncateAt r1) {
            r0 = this;
            r0.ellipsize = r1
            return r0
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setEnd(@Yue.InterfaceC3281(from = 0) int r1) {
            r0 = this;
            r0.end = r1
            return r0
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setHyphenationFrequency(int r1) {
            r0 = this;
            r0.hyphenationFrequency = r1
            return r0
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setIncludePad(boolean r1) {
            r0 = this;
            r0.includePad = r1
            return r0
    }

    public com.google.android.material.internal.StaticLayoutBuilderCompat setIsRtl(boolean r1) {
            r0 = this;
            r0.isRtl = r1
            return r0
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setLineSpacing(float r1, float r2) {
            r0 = this;
            r0.lineSpacingAdd = r1
            r0.lineSpacingMultiplier = r2
            return r0
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setMaxLines(@Yue.InterfaceC3281(from = 0) int r1) {
            r0 = this;
            r0.maxLines = r1
            return r0
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setStart(@Yue.InterfaceC3281(from = 0) int r1) {
            r0 = this;
            r0.start = r1
            return r0
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(@Yue.InterfaceC4544 com.google.android.material.internal.StaticLayoutBuilderConfigurer r1) {
            r0 = this;
            r0.staticLayoutBuilderConfigurer = r1
            return r0
    }
}
