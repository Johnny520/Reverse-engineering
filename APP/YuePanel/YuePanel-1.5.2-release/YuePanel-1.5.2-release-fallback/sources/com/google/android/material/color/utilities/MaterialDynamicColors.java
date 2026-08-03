package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public final class MaterialDynamicColors {
    public MaterialDynamicColors() {
            r0 = this;
            r0.<init>()
            return
    }

    public static double findDesiredChromaByTone(double r11, double r13, double r15, boolean r17) {
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.from(r11, r13, r15)
            double r1 = r0.getChroma()
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 >= 0) goto L6a
            double r1 = r0.getChroma()
            r6 = r0
            r7 = r1
            r0 = r15
        L13:
            double r2 = r6.getChroma()
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 >= 0) goto L68
            if (r17 == 0) goto L20
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L22
        L20:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L22:
            double r9 = r0 + r2
            r0 = r11
            r2 = r13
            r4 = r9
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.from(r0, r2, r4)
            double r1 = r0.getChroma()
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L34
            goto L6b
        L34:
            double r1 = r0.getChroma()
            double r1 = r1 - r13
            double r1 = java.lang.Math.abs(r1)
            r3 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L47
            goto L6b
        L47:
            double r1 = r0.getChroma()
            double r1 = r1 - r13
            double r1 = java.lang.Math.abs(r1)
            double r3 = r6.getChroma()
            double r3 = r3 - r13
            double r3 = java.lang.Math.abs(r3)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L5e
            r6 = r0
        L5e:
            double r0 = r0.getChroma()
            double r7 = java.lang.Math.max(r7, r0)
            r0 = r9
            goto L13
        L68:
            r9 = r0
            goto L6b
        L6a:
            r9 = r15
        L6b:
            return r9
    }

    private static boolean isFidelity(com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.Variant r1 = r1.variant
            com.google.android.material.color.utilities.Variant r0 = com.google.android.material.color.utilities.Variant.FIDELITY
            if (r1 == r0) goto Ld
            com.google.android.material.color.utilities.Variant r0 = com.google.android.material.color.utilities.Variant.CONTENT
            if (r1 != r0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            return r1
    }

    private static boolean isMonochrome(com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.Variant r1 = r1.variant
            com.google.android.material.color.utilities.Variant r0 = com.google.android.material.color.utilities.Variant.MONOCHROME
            if (r1 != r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$background$10(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$background$11(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4618441417868443648(0x4018000000000000, double:6.0)
            goto Lc
        L7:
            r0 = 4636596553866280960(0x4058800000000000, double:98.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$controlActivated$145(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$controlActivated$146(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$controlHighlight$149(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$controlHighlight$150(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto L9
        L7:
            r0 = 0
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ java.lang.Double lambda$controlHighlight$151(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            goto Lf
        La:
            r0 = 4593311331947716280(0x3fbeb851eb851eb8, double:0.12)
        Lf:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$controlNormal$147(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$controlNormal$148(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$error$91(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.errorPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$error$92(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$error$93(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.errorContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.error()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$errorContainer$97(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.errorPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$errorContainer$98(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$errorContainer$99(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.errorContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.error()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$inverseOnSurface$39(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$inverseOnSurface$40(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            goto Lc
        L7:
            r0 = 4636385447633747968(0x4057c00000000000, double:95.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$inverseOnSurface$41(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.inverseSurface()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$inversePrimary$64(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$inversePrimary$65(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
            goto L9
        L7:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$inversePrimary$66(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.inverseSurface()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$inverseSurface$37(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$inverseSurface$38(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Lc
        La:
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$neutralPaletteKeyColor$6(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$neutralPaletteKeyColor$7(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.neutralPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$neutralVariantPaletteKeyColor$8(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$neutralVariantPaletteKeyColor$9(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.neutralVariantPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onBackground$12(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onBackground$13(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Lc
        La:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onBackground$14(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.background()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onError$94(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.errorPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onError$95(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            goto L9
        L7:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onError$96(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.error()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onErrorContainer$100(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.errorPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onErrorContainer$101(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Lc
        La:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onErrorContainer$102(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.errorContainer()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onPrimary$55(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onPrimary$56(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L17
            boolean r2 = r2.isDark
            if (r2 == 0) goto Ld
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto L12
        Ld:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        L12:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L17:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L1e
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            goto L20
        L1e:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L20:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onPrimary$57(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.primary()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onPrimaryContainer$61(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    private /* synthetic */ java.lang.Double lambda$onPrimaryContainer$62(com.google.android.material.color.utilities.DynamicScheme r5) {
            r4 = this;
            boolean r0 = isFidelity(r5)
            if (r0 == 0) goto L21
            com.google.android.material.color.utilities.DynamicColor r0 = r4.primaryContainer()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r0 = r0.tone
            java.lang.Object r5 = r0.apply(r5)
            java.lang.Double r5 = (java.lang.Double) r5
            double r0 = r5.doubleValue()
            r2 = 4616752568008179712(0x4012000000000000, double:4.5)
            double r0 = com.google.android.material.color.utilities.DynamicColor.foregroundTone(r0, r2)
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L21:
            boolean r0 = isMonochrome(r5)
            if (r0 == 0) goto L35
            boolean r5 = r5.isDark
            if (r5 == 0) goto L2e
            r0 = 0
            goto L30
        L2e:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L30:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L35:
            boolean r5 = r5.isDark
            if (r5 == 0) goto L3f
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L41
        L3f:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        L41:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onPrimaryContainer$63(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.primaryContainer()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onPrimaryFixed$109(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onPrimaryFixed$110(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto Lb
        L9:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lb:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onPrimaryFixed$111(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.primaryFixedDim()
            return r1
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onPrimaryFixed$112(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.primaryFixed()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onPrimaryFixedVariant$113(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onPrimaryFixedVariant$114(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto Lc
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Le
        Lc:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onPrimaryFixedVariant$115(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.primaryFixedDim()
            return r1
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onPrimaryFixedVariant$116(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.primaryFixed()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onSecondary$70(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onSecondary$71(com.google.android.material.color.utilities.DynamicScheme r3) {
            boolean r0 = isMonochrome(r3)
            r1 = 4636737291354636288(0x4059000000000000, double:100.0)
            if (r0 == 0) goto L13
            boolean r3 = r3.isDark
            if (r3 == 0) goto Le
            r1 = 4621819117588971520(0x4024000000000000, double:10.0)
        Le:
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            return r3
        L13:
            boolean r3 = r3.isDark
            if (r3 == 0) goto L19
            r1 = 4626322717216342016(0x4034000000000000, double:20.0)
        L19:
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            return r3
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onSecondary$72(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.secondary()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onSecondaryContainer$76(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    private /* synthetic */ java.lang.Double lambda$onSecondaryContainer$77(com.google.android.material.color.utilities.DynamicScheme r5) {
            r4 = this;
            boolean r0 = isFidelity(r5)
            if (r0 != 0) goto L17
            boolean r5 = r5.isDark
            if (r5 == 0) goto L10
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L12
        L10:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        L12:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L17:
            com.google.android.material.color.utilities.DynamicColor r0 = r4.secondaryContainer()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r0 = r0.tone
            java.lang.Object r5 = r0.apply(r5)
            java.lang.Double r5 = (java.lang.Double) r5
            double r0 = r5.doubleValue()
            r2 = 4616752568008179712(0x4012000000000000, double:4.5)
            double r0 = com.google.android.material.color.utilities.DynamicColor.foregroundTone(r0, r2)
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onSecondaryContainer$78(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.secondaryContainer()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onSecondaryFixed$123(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onSecondaryFixed$124(com.google.android.material.color.utilities.DynamicScheme r2) {
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onSecondaryFixed$125(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.secondaryFixedDim()
            return r1
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onSecondaryFixed$126(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.secondaryFixed()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onSecondaryFixedVariant$127(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onSecondaryFixedVariant$128(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4627730092099895296(0x4039000000000000, double:25.0)
            goto Lb
        L9:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        Lb:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onSecondaryFixedVariant$129(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.secondaryFixedDim()
            return r1
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onSecondaryFixedVariant$130(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.secondaryFixed()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onSurface$31(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onSurface$32(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Lc
        La:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onSurfaceVariant$35(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onSurfaceVariant$36(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onTertiary$82(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onTertiary$83(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L17
            boolean r2 = r2.isDark
            if (r2 == 0) goto Ld
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto L12
        Ld:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        L12:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L17:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L1e
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            goto L20
        L1e:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L20:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onTertiary$84(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.tertiary()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onTertiaryContainer$88(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    private /* synthetic */ java.lang.Double lambda$onTertiaryContainer$89(com.google.android.material.color.utilities.DynamicScheme r5) {
            r4 = this;
            boolean r0 = isMonochrome(r5)
            if (r0 == 0) goto L14
            boolean r5 = r5.isDark
            if (r5 == 0) goto Ld
            r0 = 0
            goto Lf
        Ld:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        Lf:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L14:
            boolean r0 = isFidelity(r5)
            if (r0 != 0) goto L2b
            boolean r5 = r5.isDark
            if (r5 == 0) goto L24
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L26
        L24:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        L26:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L2b:
            com.google.android.material.color.utilities.DynamicColor r0 = r4.tertiaryContainer()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r0 = r0.tone
            java.lang.Object r5 = r0.apply(r5)
            java.lang.Double r5 = (java.lang.Double) r5
            double r0 = r5.doubleValue()
            r2 = 4616752568008179712(0x4012000000000000, double:4.5)
            double r0 = com.google.android.material.color.utilities.DynamicColor.foregroundTone(r0, r2)
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onTertiaryContainer$90(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.tertiaryContainer()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onTertiaryFixed$137(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onTertiaryFixed$138(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto Lb
        L9:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lb:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onTertiaryFixed$139(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.tertiaryFixedDim()
            return r1
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onTertiaryFixed$140(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.tertiaryFixed()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$onTertiaryFixedVariant$141(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$onTertiaryFixedVariant$142(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto Lc
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Le
        Lc:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onTertiaryFixedVariant$143(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.tertiaryFixedDim()
            return r1
    }

    private /* synthetic */ com.google.android.material.color.utilities.DynamicColor lambda$onTertiaryFixedVariant$144(com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            com.google.android.material.color.utilities.DynamicColor r1 = r0.tertiaryFixed()
            return r1
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$outline$42(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$outline$43(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L9
        L7:
            r0 = 4632233691727265792(0x4049000000000000, double:50.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$outlineVariant$44(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$outlineVariant$45(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L9
        L7:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$primary$52(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$primary$53(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L14
            boolean r2 = r2.isDark
            if (r2 == 0) goto Ld
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto Lf
        Ld:
            r0 = 0
        Lf:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L14:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L1b
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L1d
        L1b:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L1d:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$primary$54(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.primaryContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.primary()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$primaryContainer$58(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$primaryContainer$59(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isFidelity(r2)
            if (r0 == 0) goto L11
            com.google.android.material.color.utilities.Hct r0 = r2.sourceColorHct
            double r0 = performAlbers(r0, r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L11:
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L28
            boolean r2 = r2.isDark
            if (r2 == 0) goto L21
            r0 = 4635681760191971328(0x4055400000000000, double:85.0)
            goto L23
        L21:
            r0 = 4627730092099895296(0x4039000000000000, double:25.0)
        L23:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L28:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L2f
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L34
        L2f:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        L34:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$primaryContainer$60(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.primaryContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.primary()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$primaryFixed$103(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$primaryFixed$104(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
            goto Le
        L9:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$primaryFixed$105(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.primaryFixed()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.primaryFixedDim()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
            r6 = 1
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$primaryFixedDim$106(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$primaryFixedDim$107(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lb
        L9:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        Lb:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$primaryFixedDim$108(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.primaryFixed()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.primaryFixedDim()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
            r6 = 1
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$primaryPaletteKeyColor$0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$primaryPaletteKeyColor$1(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.primaryPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$scrim$48(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$scrim$49(com.google.android.material.color.utilities.DynamicScheme r2) {
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$secondary$67(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$secondary$68(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$secondary$69(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.secondaryContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.secondary()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$secondaryContainer$73(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$secondaryContainer$74(com.google.android.material.color.utilities.DynamicScheme r12) {
            boolean r0 = r12.isDark
            r1 = 4629137466983448576(0x403e000000000000, double:30.0)
            if (r0 == 0) goto L8
            r9 = r1
            goto Le
        L8:
            r3 = 4636033603912859648(0x4056800000000000, double:90.0)
            r9 = r3
        Le:
            boolean r0 = isMonochrome(r12)
            if (r0 == 0) goto L23
            boolean r12 = r12.isDark
            if (r12 == 0) goto L19
            goto L1e
        L19:
            r1 = 4635681760191971328(0x4055400000000000, double:85.0)
        L1e:
            java.lang.Double r12 = java.lang.Double.valueOf(r1)
            return r12
        L23:
            boolean r0 = isFidelity(r12)
            if (r0 != 0) goto L2e
            java.lang.Double r12 = java.lang.Double.valueOf(r9)
            return r12
        L2e:
            com.google.android.material.color.utilities.TonalPalette r0 = r12.secondaryPalette
            double r5 = r0.getHue()
            com.google.android.material.color.utilities.TonalPalette r0 = r12.secondaryPalette
            double r7 = r0.getChroma()
            boolean r0 = r12.isDark
            r11 = r0 ^ 1
            double r0 = findDesiredChromaByTone(r5, r7, r9, r11)
            com.google.android.material.color.utilities.TonalPalette r2 = r12.secondaryPalette
            com.google.android.material.color.utilities.Hct r0 = r2.getHct(r0)
            double r0 = performAlbers(r0, r12)
            java.lang.Double r12 = java.lang.Double.valueOf(r0)
            return r12
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$secondaryContainer$75(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.secondaryContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.secondary()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$secondaryFixed$117(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$secondaryFixed$118(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto Le
        L9:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$secondaryFixed$119(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.secondaryFixed()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.secondaryFixedDim()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
            r6 = 1
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$secondaryFixedDim$120(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$secondaryFixedDim$121(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto Lc
            r0 = 4634626229029306368(0x4051800000000000, double:70.0)
            goto Le
        Lc:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$secondaryFixedDim$122(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.secondaryFixed()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.secondaryFixedDim()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
            r6 = 1
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$secondaryPaletteKeyColor$2(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$secondaryPaletteKeyColor$3(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.secondaryPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$shadow$46(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$shadow$47(com.google.android.material.color.utilities.DynamicScheme r2) {
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surface$15(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$surface$16(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4618441417868443648(0x4018000000000000, double:6.0)
            goto Lc
        L7:
            r0 = 4636596553866280960(0x4058800000000000, double:98.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceBright$19(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$surfaceBright$20(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4627448617123184640(0x4038000000000000, double:24.0)
            goto Lc
        L7:
            r0 = 4636596553866280960(0x4058800000000000, double:98.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceContainer$25(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$surfaceContainer$26(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4622945017495814144(0x4028000000000000, double:12.0)
            goto Lc
        L7:
            r0 = 4636315078889570304(0x4057800000000000, double:94.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceContainerHigh$27(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$surfaceContainerHigh$28(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4625478292286210048(0x4031000000000000, double:17.0)
            goto L9
        L7:
            r0 = 4636174341401214976(0x4057000000000000, double:92.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceContainerHighest$29(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$surfaceContainerHighest$30(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4626885667169763328(0x4036000000000000, double:22.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceContainerLow$23(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$surfaceContainerLow$24(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto L9
        L7:
            r0 = 4636455816377925632(0x4058000000000000, double:96.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceContainerLowest$21(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$surfaceContainerLowest$22(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            goto L9
        L7:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceDim$17(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$surfaceDim$18(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4618441417868443648(0x4018000000000000, double:6.0)
            goto Lc
        L7:
            r0 = 4635822497680326656(0x4055c00000000000, double:87.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceTint$50(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$surfaceTint$51(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$surfaceVariant$33(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$surfaceVariant$34(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$tertiary$79(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$tertiary$80(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L17
            boolean r2 = r2.isDark
            if (r2 == 0) goto L10
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L12
        L10:
            r0 = 4627730092099895296(0x4039000000000000, double:25.0)
        L12:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L17:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L1e
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L20
        L1e:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L20:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$tertiary$81(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.tertiaryContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.tertiary()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$tertiaryContainer$85(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$tertiaryContainer$86(com.google.android.material.color.utilities.DynamicScheme r3) {
            boolean r0 = isMonochrome(r3)
            if (r0 == 0) goto L17
            boolean r3 = r3.isDark
            if (r3 == 0) goto Ld
            r0 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L12
        Ld:
            r0 = 4632092954238910464(0x4048800000000000, double:49.0)
        L12:
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L17:
            boolean r0 = isFidelity(r3)
            if (r0 != 0) goto L2e
            boolean r3 = r3.isDark
            if (r3 == 0) goto L24
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L29
        L24:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        L29:
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L2e:
            com.google.android.material.color.utilities.TonalPalette r0 = r3.tertiaryPalette
            com.google.android.material.color.utilities.Hct r1 = r3.sourceColorHct
            double r1 = r1.getTone()
            com.google.android.material.color.utilities.Hct r0 = r0.getHct(r1)
            double r0 = performAlbers(r0, r3)
            com.google.android.material.color.utilities.TonalPalette r3 = r3.tertiaryPalette
            com.google.android.material.color.utilities.Hct r3 = r3.getHct(r0)
            com.google.android.material.color.utilities.Hct r3 = com.google.android.material.color.utilities.DislikeAnalyzer.fixIfDisliked(r3)
            double r0 = r3.getTone()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$tertiaryContainer$87(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.tertiaryContainer()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.tertiary()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.NEARER
            r6 = 0
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$tertiaryFixed$131(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$tertiaryFixed$132(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
            goto Le
        L9:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$tertiaryFixed$133(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.tertiaryFixed()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.tertiaryFixedDim()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
            r6 = 1
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$tertiaryFixedDim$134(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$tertiaryFixedDim$135(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lb
        L9:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        Lb:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair lambda$tertiaryFixedDim$136(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            com.google.android.material.color.utilities.ToneDeltaPair r8 = new com.google.android.material.color.utilities.ToneDeltaPair
            com.google.android.material.color.utilities.DynamicColor r1 = r7.tertiaryFixed()
            com.google.android.material.color.utilities.DynamicColor r2 = r7.tertiaryFixedDim()
            com.google.android.material.color.utilities.TonePolarity r5 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
            r6 = 1
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r8
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$tertiaryPaletteKeyColor$4(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$tertiaryPaletteKeyColor$5(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.tertiaryPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$textHintInverse$160(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$textHintInverse$161(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$textPrimaryInverse$152(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$textPrimaryInverse$153(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$textPrimaryInverseDisableOnly$156(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$textPrimaryInverseDisableOnly$157(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$textSecondaryAndTertiaryInverse$154(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$textSecondaryAndTertiaryInverse$155(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L9
        L7:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.material.color.utilities.TonalPalette lambda$textSecondaryAndTertiaryInverseDisabled$158(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    private static /* synthetic */ java.lang.Double lambda$textSecondaryAndTertiaryInverseDisabled$159(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static double performAlbers(com.google.android.material.color.utilities.Hct r2, com.google.android.material.color.utilities.DynamicScheme r3) {
            com.google.android.material.color.utilities.ViewingConditions r3 = viewingConditionsForAlbers(r3)
            com.google.android.material.color.utilities.Hct r3 = r2.inViewingConditions(r3)
            double r0 = r2.getTone()
            boolean r0 = com.google.android.material.color.utilities.DynamicColor.tonePrefersLightForeground(r0)
            if (r0 == 0) goto L25
            double r0 = r3.getTone()
            boolean r0 = com.google.android.material.color.utilities.DynamicColor.toneAllowsLightForeground(r0)
            if (r0 != 0) goto L25
            double r2 = r2.getTone()
            double r2 = com.google.android.material.color.utilities.DynamicColor.enableLightForeground(r2)
            return r2
        L25:
            double r2 = r3.getTone()
            double r2 = com.google.android.material.color.utilities.DynamicColor.enableLightForeground(r2)
            return r2
    }

    private static com.google.android.material.color.utilities.ViewingConditions viewingConditionsForAlbers(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L9
        L7:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        L9:
            com.google.android.material.color.utilities.ViewingConditions r2 = com.google.android.material.color.utilities.ViewingConditions.defaultWithBackgroundLstar(r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30413(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$primaryFixed$105(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30414(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onError$95(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30415(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onPrimaryFixedVariant$113(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30416(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$surfaceContainerHighest$29(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30417(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$outline$42(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30418(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$primaryFixedDim$108(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30419(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$outlineVariant$45(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30420(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onTertiary$84(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30421(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onSecondaryFixed$123(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30422(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onTertiaryFixed$138(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30423(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$secondaryContainer$74(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30424(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$secondary$67(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30425(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            java.lang.Double r0 = r0.lambda$onSecondaryContainer$77(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30426(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$secondary$68(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30427(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onTertiaryFixedVariant$144(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30428(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onPrimaryFixed$109(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30429(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onErrorContainer$101(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30430(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$tertiary$79(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30431(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$surfaceContainerLowest$22(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30432(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$background$11(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30433(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$primaryContainer$60(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30434(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$controlHighlight$149(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30435(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onSurfaceVariant$35(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30436(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$inversePrimary$66(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30437(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onSecondaryFixedVariant$130(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30438(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$textSecondaryAndTertiaryInverse$154(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30439(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$primary$52(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30440(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onErrorContainer$102(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30441(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$secondary$69(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30442(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$error$93(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30443(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$secondaryPaletteKeyColor$3(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30444(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onPrimaryContainer$61(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30445(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$outline$43(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30446(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$surfaceContainer$26(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30447(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$surfaceContainer$25(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30448(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onPrimaryFixedVariant$115(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30449(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onSurface$32(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30450(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$textHintInverse$161(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30451(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$surfaceBright$20(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30452(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onSecondary$71(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30453(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$primaryPaletteKeyColor$1(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30454(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$shadow$47(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30455(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onTertiaryFixed$140(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30456(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$neutralVariantPaletteKeyColor$8(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30457(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onTertiaryFixedVariant$143(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30458(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onSecondaryFixedVariant$127(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30459(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$inversePrimary$65(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30460(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onTertiaryContainer$88(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30461(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$controlNormal$148(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30462(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$surfaceVariant$33(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30463(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$textPrimaryInverse$152(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30464(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$controlHighlight$150(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30465(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$surfaceContainerHigh$28(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30466(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$neutralPaletteKeyColor$6(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30467(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onPrimary$55(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30468(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$controlActivated$145(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30469(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$surfaceTint$50(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30470(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onPrimary$57(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30471(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$surfaceDim$17(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30472(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$primaryFixedDim$106(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30473(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onTertiaryContainer$90(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30474(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$tertiaryFixedDim$134(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30475(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$controlActivated$146(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30476(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$textPrimaryInverseDisableOnly$156(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30477(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$controlHighlight$151(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30478(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$surfaceContainerLowest$21(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30479(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$errorContainer$99(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30480(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$primaryFixed$104(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30481(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onTertiaryFixedVariant$141(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30482(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onSecondaryContainer$76(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30483(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$secondaryFixedDim$122(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30484(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$neutralVariantPaletteKeyColor$9(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30485(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$primaryPaletteKeyColor$0(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30486(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$textHintInverse$160(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30487(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onTertiary$82(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30488(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$surface$16(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30489(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$tertiaryContainer$87(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30490(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$error$92(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30491(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            java.lang.Double r0 = r0.lambda$onPrimaryContainer$62(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30492(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onPrimaryFixed$111(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30493(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$inverseOnSurface$40(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30494(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$surfaceDim$18(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30495(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onSecondaryFixed$124(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30496(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$surfaceTint$51(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30497(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onTertiaryFixed$137(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30498(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onSecondaryFixedVariant$129(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30499(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$primary$53(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30500(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$secondaryPaletteKeyColor$2(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30501(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onPrimary$56(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30502(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$inversePrimary$64(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30503(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$tertiaryFixed$131(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30504(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$scrim$48(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30505(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onPrimaryFixedVariant$114(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30506(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onSurface$31(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30507(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$primaryContainer$59(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30508(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$inverseSurface$38(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30509(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$surfaceContainerHighest$30(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30510(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$secondaryFixedDim$120(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30511(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$scrim$49(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30512(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onPrimaryFixed$112(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30513(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$textPrimaryInverse$153(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30514(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$primaryFixed$103(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30515(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$textPrimaryInverseDisableOnly$157(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30516(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$secondaryContainer$75(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30517(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onTertiary$83(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30518(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onTertiaryFixedVariant$142(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30519(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$textSecondaryAndTertiaryInverseDisabled$158(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30520(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onBackground$13(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30521(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$secondaryFixed$119(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30522(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onPrimaryContainer$63(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30523(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            java.lang.Double r0 = r0.lambda$onTertiaryContainer$89(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30524(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$tertiaryContainer$86(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30525(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onErrorContainer$100(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30526(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$tertiaryFixed$132(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30527(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$controlNormal$147(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30528(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$errorContainer$98(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30529(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$primary$54(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30530(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$surface$15(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30531(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$errorContainer$97(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30532(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$secondaryFixed$118(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30533(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onPrimaryFixedVariant$116(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30534(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$primaryContainer$58(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30535(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$tertiaryPaletteKeyColor$4(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30536(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onPrimaryFixed$110(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30537(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$surfaceBright$19(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30538(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$tertiaryFixedDim$136(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30539(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$secondaryFixedDim$121(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30540(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$surfaceContainerLow$23(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30541(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$inverseSurface$37(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30542(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$tertiary$81(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30543(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onSecondaryFixed$125(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30544(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$surfaceContainerHigh$27(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30545(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$surfaceVariant$34(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30546(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$tertiary$80(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30547(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onTertiaryFixed$139(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30548(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$outlineVariant$44(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30549(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$textSecondaryAndTertiaryInverseDisabled$159(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30550(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$tertiaryFixedDim$135(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30551(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onSurfaceVariant$36(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30552(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onError$96(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30553(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onSecondaryContainer$78(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30554(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$inverseOnSurface$41(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30555(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$textSecondaryAndTertiaryInverse$155(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30556(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$secondaryFixed$117(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30557(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$secondaryContainer$73(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30558(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$tertiaryContainer$85(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30559(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onSecondaryFixed$126(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30560(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onError$94(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30561(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onBackground$14(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30562(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$error$91(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30563(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$onSecondaryFixedVariant$128(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30564(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$background$10(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30565(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$primaryFixedDim$107(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaPair m30566(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.ToneDeltaPair r0 = r0.lambda$tertiaryFixed$133(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30567(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$shadow$46(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m30568(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.lambda$onSecondary$72(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30569(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$neutralPaletteKeyColor$7(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30570(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onSecondary$70(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30571(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$tertiaryPaletteKeyColor$5(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30572(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$onBackground$12(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m30573(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = lambda$inverseOnSurface$39(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Double m30574(com.google.android.material.color.utilities.DynamicScheme r0) {
            java.lang.Double r0 = lambda$surfaceContainerLow$24(r0)
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor background() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۨۥ r2 = new Yue.ۥۡ۟ۨۥ
            r2.<init>()
            Yue.ۥۡ۟ۨۦ r3 = new Yue.ۥۡ۟ۨۦ
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "background"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor controlActivated() {
            r3 = this;
            Yue.ۥۡ۟ۥۨ r0 = new Yue.ۥۡ۟ۥۨ
            r0.<init>()
            Yue.ۥۡ۟ۦ r1 = new Yue.ۥۡ۟ۦ
            r1.<init>()
            java.lang.String r2 = "control_activated"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor controlHighlight() {
            r11 = this;
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۨ r2 = new Yue.ۥۡ۟ۨ
            r2.<init>()
            Yue.ۥۡ۟ۨ۟ r3 = new Yue.ۥۡ۟ۨ۟
            r3.<init>()
            Yue.ۥۡ۟ۨ۠ r9 = new Yue.ۥۡ۟ۨ۠
            r9.<init>()
            java.lang.String r1 = "control_highlight"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor controlNormal() {
            r3 = this;
            Yue.ۥۡ۟ۤۤ r0 = new Yue.ۥۡ۟ۤۤ
            r0.<init>()
            Yue.ۥۡ۟ۥۤ r1 = new Yue.ۥۡ۟ۥۤ
            r1.<init>()
            java.lang.String r2 = "control_normal"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor error() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۣۡ۟ۢ r3 = new Yue.ۥۣۡ۟ۢ
            r3.<init>()
            Yue.ۥۡ۟ۢۥ r4 = new Yue.ۥۡ۟ۢۥ
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۡ۟ۢۦ r9 = new Yue.ۥۡ۟ۢۦ
            r9.<init>(r0)
            java.lang.String r2 = "error"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor errorContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۤ۟ r3 = new Yue.ۥۡ۟ۤ۟
            r3.<init>()
            Yue.ۥۡ۟ۤ۠ r4 = new Yue.ۥۡ۟ۤ۠
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۡ۟ۤۡ r9 = new Yue.ۥۡ۟ۤۡ
            r9.<init>(r0)
            java.lang.String r2 = "error_container"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor highestSurface(@Yue.InterfaceC4410 com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            boolean r1 = r1.isDark
            if (r1 == 0) goto L9
            com.google.android.material.color.utilities.DynamicColor r1 = r0.surfaceBright()
            goto Ld
        L9:
            com.google.android.material.color.utilities.DynamicColor r1 = r0.surfaceDim()
        Ld:
            return r1
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor inverseOnSurface() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۡ۠ r2 = new Yue.ۥۡ۟ۡ۠
            r2.<init>()
            Yue.ۥۡ۟ۡۡ r3 = new Yue.ۥۡ۟ۡۡ
            r3.<init>()
            Yue.ۥۡ۟ۡۢ r5 = new Yue.ۥۡ۟ۡۢ
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "inverse_on_surface"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor inversePrimary() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠۟ۨ r2 = new Yue.ۥۡ۠۟ۨ
            r2.<init>()
            Yue.ۥۡ۠۠ r3 = new Yue.ۥۡ۠۠
            r3.<init>()
            Yue.ۥۡ۠۠۟ r5 = new Yue.ۥۡ۠۠۟
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "inverse_primary"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor inverseSurface() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۣۡ۟ۢ r2 = new Yue.ۥۣۡ۟ۢ
            r2.<init>()
            Yue.ۥۣۣۡ۟ r3 = new Yue.ۥۣۣۡ۟
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "inverse_surface"
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor neutralPaletteKeyColor() {
            r3 = this;
            Yue.ۥۡ۟۠ۤ r0 = new Yue.ۥۡ۟۠ۤ
            r0.<init>()
            Yue.ۥۡ۟ۡۤ r1 = new Yue.ۥۡ۟ۡۤ
            r1.<init>()
            java.lang.String r2 = "neutral_palette_key_color"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor neutralVariantPaletteKeyColor() {
            r3 = this;
            Yue.ۥۡ۠ۢۤ r0 = new Yue.ۥۡ۠ۢۤ
            r0.<init>()
            Yue.ۥۡ۠ۢۥ r1 = new Yue.ۥۡ۠ۢۥ
            r1.<init>()
            java.lang.String r2 = "neutral_variant_palette_key_color"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onBackground() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠ r2 = new Yue.ۥۡ۠
            r2.<init>()
            Yue.ۥۡ۠۟ r3 = new Yue.ۥۡ۠۟
            r3.<init>()
            Yue.ۥۡ۠۟۟ r5 = new Yue.ۥۡ۠۟۟
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4616752568008179712(0x4012000000000000, double:4.5)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4613937818241073152(0x4008000000000000, double:3.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_background"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onError() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠ۡۡ r2 = new Yue.ۥۡ۠ۡۡ
            r2.<init>()
            Yue.ۥۡ۠ۡۢ r3 = new Yue.ۥۡ۠ۡۢ
            r3.<init>()
            Yue.ۥۣۡ۠ۡ r5 = new Yue.ۥۣۡ۠ۡ
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_error"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onErrorContainer() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۣۡ۟ۥ r2 = new Yue.ۥۣۡ۟ۥ
            r2.<init>()
            Yue.ۥۣۡ۟ۦ r3 = new Yue.ۥۣۡ۟ۦ
            r3.<init>()
            Yue.ۥۣۡ۟ۧ r5 = new Yue.ۥۣۡ۟ۧ
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_error_container"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onPrimary() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠۟ۥ r2 = new Yue.ۥۡ۠۟ۥ
            r2.<init>()
            Yue.ۥۡ۠۟ۦ r3 = new Yue.ۥۡ۠۟ۦ
            r3.<init>()
            Yue.ۥۡ۠۟ۧ r5 = new Yue.ۥۡ۠۟ۧ
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_primary"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onPrimaryContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠ۡۦ r3 = new Yue.ۥۡ۠ۡۦ
            r3.<init>()
            Yue.ۥۡ۠ۡۧ r4 = new Yue.ۥۡ۠ۡۧ
            r4.<init>(r0)
            Yue.ۥۡ۠ۡۨ r6 = new Yue.ۥۡ۠ۡۨ
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_primary_container"
            r5 = 0
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onPrimaryFixed() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۢ۟ r3 = new Yue.ۥۡ۟ۢ۟
            r3.<init>()
            Yue.ۥۡ۟ۢ۠ r4 = new Yue.ۥۡ۟ۢ۠
            r4.<init>()
            Yue.ۥۡ۟ۢۡ r6 = new Yue.ۥۡ۟ۢۡ
            r6.<init>(r0)
            Yue.ۥۡ۟ۢۢ r7 = new Yue.ۥۡ۟ۢۢ
            r7.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_primary_fixed"
            r5 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onPrimaryFixedVariant() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠۠ۤ r3 = new Yue.ۥۡ۠۠ۤ
            r3.<init>()
            Yue.ۥۡ۠۠ۥ r4 = new Yue.ۥۡ۠۠ۥ
            r4.<init>()
            Yue.ۥۡ۠۠ۦ r6 = new Yue.ۥۡ۠۠ۦ
            r6.<init>(r0)
            Yue.ۥۡ۠۠ۧ r7 = new Yue.ۥۡ۠۠ۧ
            r7.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_primary_fixed_variant"
            r5 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onSecondary() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟۟ۥ r2 = new Yue.ۥۡ۟۟ۥ
            r2.<init>()
            Yue.ۥۡ۟۟ۦ r3 = new Yue.ۥۡ۟۟ۦ
            r3.<init>()
            Yue.ۥۡ۟۟ۧ r5 = new Yue.ۥۡ۟۟ۧ
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_secondary"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onSecondaryContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۡۧ r3 = new Yue.ۥۡ۟ۡۧ
            r3.<init>()
            Yue.ۥۡ۟ۡۨ r4 = new Yue.ۥۡ۟ۡۨ
            r4.<init>(r0)
            Yue.ۥۡ۟ۢ r6 = new Yue.ۥۡ۟ۢ
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_secondary_container"
            r5 = 0
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onSecondaryFixed() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟۠ۧ r3 = new Yue.ۥۡ۟۠ۧ
            r3.<init>()
            Yue.ۥۡ۟۠ۨ r4 = new Yue.ۥۡ۟۠ۨ
            r4.<init>()
            Yue.ۥۡ۟ۡ r6 = new Yue.ۥۡ۟ۡ
            r6.<init>(r0)
            Yue.ۥۡ۟ۡ۟ r7 = new Yue.ۥۡ۟ۡ۟
            r7.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_secondary_fixed"
            r5 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onSecondaryFixedVariant() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۥ۠ r3 = new Yue.ۥۡ۟ۥ۠
            r3.<init>()
            Yue.ۥۡ۟ۥۡ r4 = new Yue.ۥۡ۟ۥۡ
            r4.<init>()
            Yue.ۥۡ۟ۥۢ r6 = new Yue.ۥۡ۟ۥۢ
            r6.<init>(r0)
            Yue.ۥۡ۟ۥۣ r7 = new Yue.ۥۡ۟ۥۣ
            r7.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_secondary_fixed_variant"
            r5 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onSurface() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠ۢ۠ r2 = new Yue.ۥۡ۠ۢ۠
            r2.<init>()
            Yue.ۥۣۡ۠۠ r3 = new Yue.ۥۣۡ۠۠
            r3.<init>()
            Yue.ۥۡ۠ۤ۠ r5 = new Yue.ۥۡ۠ۤ۠
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_surface"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onSurfaceVariant() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۣۡ۟۠ r2 = new Yue.ۥۣۡ۟۠
            r2.<init>()
            Yue.ۥۣۡ۟ۡ r3 = new Yue.ۥۣۡ۟ۡ
            r3.<init>()
            Yue.ۥۡ۠ۤ۠ r5 = new Yue.ۥۡ۠ۤ۠
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_surface_variant"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onTertiary() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠۟۠ r2 = new Yue.ۥۡ۠۟۠
            r2.<init>()
            Yue.ۥۡ۠۠۠ r3 = new Yue.ۥۡ۠۠۠
            r3.<init>()
            Yue.ۥۡ۠ۡ۠ r5 = new Yue.ۥۡ۠ۡ۠
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "on_tertiary"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onTertiaryContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۣۡ۟ۡ r3 = new Yue.ۥۣۡ۟ۡ
            r3.<init>()
            Yue.ۥۡ۟ۡۥ r4 = new Yue.ۥۡ۟ۡۥ
            r4.<init>(r0)
            Yue.ۥۡ۟ۡۦ r6 = new Yue.ۥۡ۟ۡۦ
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_tertiary_container"
            r5 = 0
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onTertiaryFixed() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۣۡ۟ۧ r3 = new Yue.ۥۣۡ۟ۧ
            r3.<init>()
            Yue.ۥۡ۟ۧۤ r4 = new Yue.ۥۡ۟ۧۤ
            r4.<init>()
            Yue.ۥۡ۟ۧۥ r6 = new Yue.ۥۡ۟ۧۥ
            r6.<init>(r0)
            Yue.ۥۡ۟ۧۦ r7 = new Yue.ۥۡ۟ۧۦ
            r7.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            r18 = 4626604192193052672(0x4035000000000000, double:21.0)
            r12 = 4616752568008179712(0x4012000000000000, double:4.5)
            r14 = 4619567317775286272(0x401c000000000000, double:7.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_tertiary_fixed"
            r5 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor onTertiaryFixedVariant() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۦۢ r3 = new Yue.ۥۡ۟ۦۢ
            r3.<init>()
            Yue.ۥۡ۟ۦۣ r4 = new Yue.ۥۡ۟ۦۣ
            r4.<init>()
            Yue.ۥۡ۟ۦۤ r6 = new Yue.ۥۡ۟ۦۤ
            r6.<init>(r0)
            Yue.ۥۡ۟ۦۥ r7 = new Yue.ۥۡ۟ۦۥ
            r7.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            r9 = 0
            java.lang.String r2 = "on_tertiary_fixed_variant"
            r5 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor outline() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟۠ۢ r2 = new Yue.ۥۡ۟۠ۢ
            r2.<init>()
            Yue.ۥۣۡ۟۠ r3 = new Yue.ۥۣۡ۟۠
            r3.<init>()
            Yue.ۥۡ۠ۤ۠ r5 = new Yue.ۥۡ۠ۤ۠
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4616752568008179712(0x4012000000000000, double:4.5)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            r14 = 4613937818241073152(0x4008000000000000, double:3.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "outline"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor outlineVariant() {
            r20 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠۟ۡ r2 = new Yue.ۥۡ۠۟ۡ
            r2.<init>()
            Yue.ۥۡ۠۟ۢ r3 = new Yue.ۥۡ۠۟ۢ
            r3.<init>()
            Yue.ۥۡ۠ۤ۠ r5 = new Yue.ۥۡ۠ۤ۠
            r10 = r20
            r5.<init>(r10)
            com.google.android.material.color.utilities.ContrastCurve r7 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r7
            r11.<init>(r12, r14, r16, r18)
            r8 = 0
            java.lang.String r1 = "outline_variant"
            r4 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor primary() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۤۦ r3 = new Yue.ۥۡ۟ۤۦ
            r3.<init>()
            Yue.ۥۡ۟ۤۧ r4 = new Yue.ۥۡ۟ۤۧ
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۡ۟ۤۨ r9 = new Yue.ۥۡ۟ۤۨ
            r9.<init>(r0)
            java.lang.String r2 = "primary"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor primaryContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۨۢ r3 = new Yue.ۥۡ۟ۨۢ
            r3.<init>()
            Yue.ۥۣۡ۟ۨ r4 = new Yue.ۥۣۡ۟ۨ
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۡ۟ۨۤ r9 = new Yue.ۥۡ۟ۨۤ
            r9.<init>(r0)
            java.lang.String r2 = "primary_container"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor primaryFixed() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۣۡ۠ۢ r3 = new Yue.ۥۣۡ۠ۢ
            r3.<init>()
            Yue.ۥۣۣۡ۠ r4 = new Yue.ۥۣۣۡ۠
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۣۡ۠ۤ r9 = new Yue.ۥۣۡ۠ۤ
            r9.<init>(r0)
            java.lang.String r2 = "primary_fixed"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor primaryFixedDim() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۣۡ۠ۥ r3 = new Yue.ۥۣۡ۠ۥ
            r3.<init>()
            Yue.ۥۣۡ۠ۦ r4 = new Yue.ۥۣۡ۠ۦ
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۣۡ۠ۧ r9 = new Yue.ۥۣۡ۠ۧ
            r9.<init>(r0)
            java.lang.String r2 = "primary_fixed_dim"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor primaryPaletteKeyColor() {
            r3 = this;
            Yue.ۥۡ۟ۦ۟ r0 = new Yue.ۥۡ۟ۦ۟
            r0.<init>()
            Yue.ۥۡ۟ۦ۠ r1 = new Yue.ۥۡ۟ۦ۠
            r1.<init>()
            java.lang.String r2 = "primary_palette_key_color"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor scrim() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۥ r2 = new Yue.ۥۡ۟ۥ
            r2.<init>()
            Yue.ۥۡ۟ۥ۟ r3 = new Yue.ۥۡ۟ۥ۟
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "scrim"
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor secondary() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟۟ۨ r3 = new Yue.ۥۡ۟۟ۨ
            r3.<init>()
            Yue.ۥۡ۟۠ r4 = new Yue.ۥۡ۟۠
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۡ۟۠۟ r9 = new Yue.ۥۡ۟۠۟
            r9.<init>(r0)
            java.lang.String r2 = "secondary"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor secondaryContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۧ۟ r3 = new Yue.ۥۡ۟ۧ۟
            r3.<init>()
            Yue.ۥۡ۟ۧ۠ r4 = new Yue.ۥۡ۟ۧ۠
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۡ۟ۧۢ r9 = new Yue.ۥۡ۟ۧۢ
            r9.<init>(r0)
            java.lang.String r2 = "secondary_container"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor secondaryFixed() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠۠ۡ r3 = new Yue.ۥۡ۠۠ۡ
            r3.<init>()
            Yue.ۥۡ۠۠ۢ r4 = new Yue.ۥۡ۠۠ۢ
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۣۡ۠۠ r9 = new Yue.ۥۣۡ۠۠
            r9.<init>(r0)
            java.lang.String r2 = "secondary_fixed"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor secondaryFixedDim() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠ۢ r3 = new Yue.ۥۡ۠ۢ
            r3.<init>()
            Yue.ۥۡ۠ۢ۟ r4 = new Yue.ۥۡ۠ۢ۟
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۡ۠ۢۡ r9 = new Yue.ۥۡ۠ۢۡ
            r9.<init>(r0)
            java.lang.String r2 = "secondary_fixed_dim"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor secondaryPaletteKeyColor() {
            r3 = this;
            Yue.ۥۡ۟ۦۦ r0 = new Yue.ۥۡ۟ۦۦ
            r0.<init>()
            Yue.ۥۡ۟ۦۧ r1 = new Yue.ۥۡ۟ۦۧ
            r1.<init>()
            java.lang.String r2 = "secondary_palette_key_color"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor shadow() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠ۢۨ r2 = new Yue.ۥۡ۠ۢۨ
            r2.<init>()
            Yue.ۥۣۡ۠ r3 = new Yue.ۥۣۡ۠
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "shadow"
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor surface() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟۟ۤ r2 = new Yue.ۥۡ۟۟ۤ
            r2.<init>()
            Yue.ۥۡ۟ۦۡ r3 = new Yue.ۥۡ۟ۦۡ
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor surfaceBright() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۣۡ۠۟ r2 = new Yue.ۥۣۡ۠۟
            r2.<init>()
            Yue.ۥۡ۠۟ۤ r3 = new Yue.ۥۡ۠۟ۤ
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_bright"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor surfaceContainer() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۣۡ۟ r2 = new Yue.ۥۣۡ۟
            r2.<init>()
            Yue.ۥۣۡ۟۟ r3 = new Yue.ۥۣۡ۟۟
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_container"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor surfaceContainerHigh() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۨۧ r2 = new Yue.ۥۡ۟ۨۧ
            r2.<init>()
            Yue.ۥۡ۟ۨۨ r3 = new Yue.ۥۡ۟ۨۨ
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_container_high"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor surfaceContainerHighest() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۣۡ۠۟ r2 = new Yue.ۥۣۡ۠۟
            r2.<init>()
            Yue.ۥۣۡ۠ۡ r3 = new Yue.ۥۣۡ۠ۡ
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_container_highest"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor surfaceContainerLow() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۦۨ r2 = new Yue.ۥۡ۟ۦۨ
            r2.<init>()
            Yue.ۥۡ۟ۧ r3 = new Yue.ۥۡ۟ۧ
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_container_low"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor surfaceContainerLowest() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟۠۠ r2 = new Yue.ۥۡ۟۠۠
            r2.<init>()
            Yue.ۥۡ۟۠ۡ r3 = new Yue.ۥۡ۟۠ۡ
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_container_lowest"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor surfaceDim() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۢۤ r2 = new Yue.ۥۡ۟ۢۤ
            r2.<init>()
            Yue.ۥۣۡ۟ۤ r3 = new Yue.ۥۣۡ۟ۤ
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_dim"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor surfaceTint() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟۠ۥ r2 = new Yue.ۥۡ۟۠ۥ
            r2.<init>()
            Yue.ۥۡ۟۠ۦ r3 = new Yue.ۥۡ۟۠ۦ
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_tint"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor surfaceVariant() {
            r10 = this;
            com.google.android.material.color.utilities.DynamicColor r9 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠ۢۢ r2 = new Yue.ۥۡ۠ۢۢ
            r2.<init>()
            Yue.ۥۣۡ۠ۢ r3 = new Yue.ۥۣۡ۠ۢ
            r3.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r1 = "surface_variant"
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor tertiary() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۥۥ r3 = new Yue.ۥۡ۟ۥۥ
            r3.<init>()
            Yue.ۥۡ۟ۥۦ r4 = new Yue.ۥۡ۟ۥۦ
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4619567317775286272(0x401c000000000000, double:7.0)
            r18 = 4622382067542392832(0x4026000000000000, double:11.0)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            r14 = 4616752568008179712(0x4012000000000000, double:4.5)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۡ۟ۥۧ r9 = new Yue.ۥۡ۟ۥۧ
            r9.<init>(r0)
            java.lang.String r2 = "tertiary"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor tertiaryContainer() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۣۡ۠ۨ r3 = new Yue.ۥۣۡ۠ۨ
            r3.<init>()
            Yue.ۥۡ۠ۤ r4 = new Yue.ۥۡ۠ۤ
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۡ۠ۤ۟ r9 = new Yue.ۥۡ۠ۤ۟
            r9.<init>(r0)
            java.lang.String r2 = "tertiary_container"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor tertiaryFixed() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۟ۤۢ r3 = new Yue.ۥۡ۟ۤۢ
            r3.<init>()
            Yue.ۥۣۡ۟ۤ r4 = new Yue.ۥۣۡ۟ۤ
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۡ۟ۤۥ r9 = new Yue.ۥۡ۟ۤۥ
            r9.<init>(r0)
            java.lang.String r2 = "tertiary_fixed"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor tertiaryFixedDim() {
            r20 = this;
            r0 = r20
            com.google.android.material.color.utilities.DynamicColor r10 = new com.google.android.material.color.utilities.DynamicColor
            Yue.ۥۡ۠۠ۨ r3 = new Yue.ۥۡ۠۠ۨ
            r3.<init>()
            Yue.ۥۡ۠ۡ r4 = new Yue.ۥۡ۠ۡ
            r4.<init>()
            Yue.ۥۡ۠ۤ۠ r6 = new Yue.ۥۡ۠ۤ۠
            r6.<init>(r0)
            com.google.android.material.color.utilities.ContrastCurve r8 = new com.google.android.material.color.utilities.ContrastCurve
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            r18 = 4619567317775286272(0x401c000000000000, double:7.0)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = r8
            r11.<init>(r12, r14, r16, r18)
            Yue.ۥۡ۠ۡ۟ r9 = new Yue.ۥۡ۠ۡ۟
            r9.<init>(r0)
            java.lang.String r2 = "tertiary_fixed_dim"
            r5 = 1
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor tertiaryPaletteKeyColor() {
            r3 = this;
            Yue.ۥۡ۟ۧۧ r0 = new Yue.ۥۡ۟ۧۧ
            r0.<init>()
            Yue.ۥۡ۟ۧۨ r1 = new Yue.ۥۡ۟ۧۨ
            r1.<init>()
            java.lang.String r2 = "tertiary_palette_key_color"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor textHintInverse() {
            r3 = this;
            Yue.ۥۡ۠ۢۦ r0 = new Yue.ۥۡ۠ۢۦ
            r0.<init>()
            Yue.ۥۡ۠ۢۧ r1 = new Yue.ۥۡ۠ۢۧ
            r1.<init>()
            java.lang.String r2 = "text_hint_inverse"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor textPrimaryInverse() {
            r3 = this;
            Yue.ۥۡ۟ۢۧ r0 = new Yue.ۥۡ۟ۢۧ
            r0.<init>()
            Yue.ۥۡ۟ۢۨ r1 = new Yue.ۥۡ۟ۢۨ
            r1.<init>()
            java.lang.String r2 = "text_primary_inverse"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor textPrimaryInverseDisableOnly() {
            r3 = this;
            Yue.ۥۡ۠ۡۤ r0 = new Yue.ۥۡ۠ۡۤ
            r0.<init>()
            Yue.ۥۡ۠ۡۥ r1 = new Yue.ۥۡ۠ۡۥ
            r1.<init>()
            java.lang.String r2 = "text_primary_inverse_disable_only"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor textSecondaryAndTertiaryInverse() {
            r3 = this;
            Yue.ۥۣۡ۟ۨ r0 = new Yue.ۥۣۡ۟ۨ
            r0.<init>()
            Yue.ۥۡ۟ۤ r1 = new Yue.ۥۡ۟ۤ
            r1.<init>()
            java.lang.String r2 = "text_secondary_and_tertiary_inverse"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.color.utilities.DynamicColor textSecondaryAndTertiaryInverseDisabled() {
            r3 = this;
            Yue.ۥۡ۟ۧۡ r0 = new Yue.ۥۡ۟ۧۡ
            r0.<init>()
            Yue.ۥۡ۟ۨۡ r1 = new Yue.ۥۡ۟ۨۡ
            r1.<init>()
            java.lang.String r2 = "text_secondary_and_tertiary_inverse_disabled"
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r2, r0, r1)
            return r0
    }
}
