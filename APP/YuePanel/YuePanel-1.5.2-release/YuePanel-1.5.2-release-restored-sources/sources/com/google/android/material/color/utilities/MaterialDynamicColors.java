package com.google.android.material.color.utilities;

import Yue.C6126;
import Yue.C6411;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public final class MaterialDynamicColors {
    public static double findDesiredChromaByTone(double d, double d2, double d3, boolean z) {
        Hct hctFrom = Hct.from(d, d2, d3);
        if (hctFrom.getChroma() >= d2) {
            return d3;
        }
        Hct hct = hctFrom;
        double chroma = hctFrom.getChroma();
        double d4 = d3;
        while (hct.getChroma() < d2) {
            double d5 = d4 + (z ? -1.0d : 1.0d);
            Hct hctFrom2 = Hct.from(d, d2, d5);
            if (chroma > hctFrom2.getChroma() || Math.abs(hctFrom2.getChroma() - d2) < 0.4d) {
                return d5;
            }
            if (Math.abs(hctFrom2.getChroma() - d2) < Math.abs(hct.getChroma() - d2)) {
                hct = hctFrom2;
            }
            chroma = Math.max(chroma, hctFrom2.getChroma());
            d4 = d5;
        }
        return d4;
    }

    private static boolean isFidelity(DynamicScheme dynamicScheme) {
        Variant variant = dynamicScheme.variant;
        return variant == Variant.FIDELITY || variant == Variant.CONTENT;
    }

    private static boolean isMonochrome(DynamicScheme dynamicScheme) {
        return dynamicScheme.variant == Variant.MONOCHROME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$background$11(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlActivated$146(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$150(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$151(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 0.2d : 0.12d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlNormal$148(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$error$92(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$error$93(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(errorContainer(), error(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$errorContainer$98(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$errorContainer$99(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(errorContainer(), error(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inverseOnSurface$40(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 95.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inverseOnSurface$41(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inversePrimary$65(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 40.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inversePrimary$66(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inverseSurface$38(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 20.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$neutralPaletteKeyColor$7(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$neutralVariantPaletteKeyColor$9(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralVariantPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onBackground$13(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onBackground$14(DynamicScheme dynamicScheme) {
        return background();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onError$95(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onError$96(DynamicScheme dynamicScheme) {
        return error();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onErrorContainer$101(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onErrorContainer$102(DynamicScheme dynamicScheme) {
        return errorContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimary$56(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimary$57(DynamicScheme dynamicScheme) {
        return primary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onPrimaryContainer$62(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.foregroundTone(primaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryContainer$63(DynamicScheme dynamicScheme) {
        return primaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimaryFixed$110(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 100.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixed$111(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixed$112(DynamicScheme dynamicScheme) {
        return primaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimaryFixedVariant$114(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 90.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$115(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$116(DynamicScheme dynamicScheme) {
        return primaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondary$71(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 100.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondary$72(DynamicScheme dynamicScheme) {
        return secondary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onSecondaryContainer$77(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.foregroundTone(secondaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryContainer$78(DynamicScheme dynamicScheme) {
        return secondaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondaryFixed$124(DynamicScheme dynamicScheme) {
        return Double.valueOf(10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixed$125(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixed$126(DynamicScheme dynamicScheme) {
        return secondaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondaryFixedVariant$128(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 25.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$129(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$130(DynamicScheme dynamicScheme) {
        return secondaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSurface$32(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSurfaceVariant$36(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiary$83(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiary$84(DynamicScheme dynamicScheme) {
        return tertiary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onTertiaryContainer$89(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.foregroundTone(tertiaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryContainer$90(DynamicScheme dynamicScheme) {
        return tertiaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiaryFixed$138(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 100.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixed$139(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixed$140(DynamicScheme dynamicScheme) {
        return tertiaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiaryFixedVariant$142(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 90.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$143(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$144(DynamicScheme dynamicScheme) {
        return tertiaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$outline$43(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 60.0d : 50.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$outlineVariant$45(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primary$53(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primary$54(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryContainer(), primary(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryContainer$59(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.sourceColorHct, dynamicScheme));
        }
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 85.0d : 25.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryContainer$60(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryContainer(), primary(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryFixed$104(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 40.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryFixed$105(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryFixedDim$107(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryFixedDim$108(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryPaletteKeyColor$1(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.primaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$scrim$49(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondary$68(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondary$69(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryContainer(), secondary(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryContainer$74(DynamicScheme dynamicScheme) {
        double d = dynamicScheme.isDark ? 30.0d : 90.0d;
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 30.0d : 85.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.secondaryPalette.getHct(findDesiredChromaByTone(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d, !dynamicScheme.isDark)), dynamicScheme));
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryContainer$75(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryContainer(), secondary(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryFixed$118(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 80.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryFixed$119(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryFixedDim$121(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 70.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryFixedDim$122(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryPaletteKeyColor$3(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.secondaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$shadow$47(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surface$16(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceBright$20(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 24.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainer$26(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 12.0d : 94.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerHigh$28(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 17.0d : 92.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerHighest$30(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 22.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerLow$24(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 96.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerLowest$22(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 4.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceDim$18(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 87.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceTint$51(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceVariant$34(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiary$80(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 90.0d : 25.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiary$81(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryContainer(), tertiary(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryContainer$86(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 60.0d : 49.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(performAlbers(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone()), dynamicScheme))).getTone());
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryContainer$87(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryContainer(), tertiary(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryFixed$132(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 40.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryFixed$133(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryFixedDim$135(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryFixedDim$136(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryPaletteKeyColor$5(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.tertiaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textHintInverse$161(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textPrimaryInverse$153(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textPrimaryInverseDisableOnly$157(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverse$155(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverseDisabled$159(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    public static double performAlbers(Hct hct, DynamicScheme dynamicScheme) {
        Hct hctInViewingConditions = hct.inViewingConditions(viewingConditionsForAlbers(dynamicScheme));
        return (!DynamicColor.tonePrefersLightForeground(hct.getTone()) || DynamicColor.toneAllowsLightForeground(hctInViewingConditions.getTone())) ? DynamicColor.enableLightForeground(hctInViewingConditions.getTone()) : DynamicColor.enableLightForeground(hct.getTone());
    }

    private static ViewingConditions viewingConditionsForAlbers(DynamicScheme dynamicScheme) {
        return ViewingConditions.defaultWithBackgroundLstar(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    @InterfaceC6391
    public DynamicColor background() {
        return new DynamicColor(C6411.C6456.f16501, new Function() { // from class: Yue.ۥۡ۟ۨۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۨۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$background$11((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor controlActivated() {
        return DynamicColor.fromPalette("control_activated", new Function() { // from class: Yue.ۥۡ۟ۥۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlActivated$146((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor controlHighlight() {
        return new DynamicColor("control_highlight", new Function() { // from class: Yue.ۥۡ۟ۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۨ۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$150((DynamicScheme) obj);
            }
        }, false, null, null, null, null, new Function() { // from class: Yue.ۥۡ۟ۨ۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$151((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor controlNormal() {
        return DynamicColor.fromPalette("control_normal", new Function() { // from class: Yue.ۥۡ۟ۤۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۥۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlNormal$148((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor error() {
        return new DynamicColor("error", new Function() { // from class: Yue.ۥۣۡ۟ۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۢۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$error$92((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: Yue.ۥۡ۟ۢۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1811.lambda$error$93((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor errorContainer() {
        return new DynamicColor("error_container", new Function() { // from class: Yue.ۥۡ۟ۤ۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۤ۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$errorContainer$98((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: Yue.ۥۡ۟ۤۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1813.lambda$errorContainer$99((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor highestSurface(@InterfaceC6391 DynamicScheme dynamicScheme) {
        return dynamicScheme.isDark ? surfaceBright() : surfaceDim();
    }

    @InterfaceC6391
    public DynamicColor inverseOnSurface() {
        return new DynamicColor("inverse_on_surface", new Function() { // from class: Yue.ۥۡ۟ۡ۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۡۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inverseOnSurface$40((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۟ۡۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1804.lambda$inverseOnSurface$41((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @InterfaceC6391
    public DynamicColor inversePrimary() {
        return new DynamicColor("inverse_primary", new Function() { // from class: Yue.ۥۡ۠۟ۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inversePrimary$65((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۠۠۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1827.lambda$inversePrimary$66((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @InterfaceC6391
    public DynamicColor inverseSurface() {
        return new DynamicColor("inverse_surface", new Function() { // from class: Yue.ۥۣۡ۟ۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۣۡ۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inverseSurface$38((DynamicScheme) obj);
            }
        }, false, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor neutralPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_palette_key_color", new Function() { // from class: Yue.ۥۡ۟۠ۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۡۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$neutralPaletteKeyColor$7((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor neutralVariantPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_variant_palette_key_color", new Function() { // from class: Yue.ۥۡ۠ۢۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠ۢۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor onBackground() {
        return new DynamicColor("on_background", new Function() { // from class: Yue.ۥۡ۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onBackground$13((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۠۟۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1825.lambda$onBackground$14((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(3.0d, 3.0d, 4.5d, 7.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onError() {
        return new DynamicColor("on_error", new Function() { // from class: Yue.ۥۡ۠ۡۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠ۡۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onError$95((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۣۡ۠ۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1833.lambda$onError$96((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onErrorContainer() {
        return new DynamicColor("on_error_container", new Function() { // from class: Yue.ۥۣۡ۟ۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۡ۟ۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onErrorContainer$101((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۣۡ۟ۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1812.lambda$onErrorContainer$102((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onPrimary() {
        return new DynamicColor("on_primary", new Function() { // from class: Yue.ۥۡ۠۟ۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠۟ۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimary$56((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۠۟ۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1826.lambda$onPrimary$57((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onPrimaryContainer() {
        return new DynamicColor("on_primary_container", new Function() { // from class: Yue.ۥۡ۠ۡۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠ۡۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1834.lambda$onPrimaryContainer$62((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۠ۡۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1835.lambda$onPrimaryContainer$63((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onPrimaryFixed() {
        return new DynamicColor("on_primary_fixed", new Function() { // from class: Yue.ۥۡ۟ۢ۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۢ۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimaryFixed$110((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۟ۢۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1809.lambda$onPrimaryFixed$111((DynamicScheme) obj);
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۢۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1810.lambda$onPrimaryFixed$112((DynamicScheme) obj);
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onPrimaryFixedVariant() {
        return new DynamicColor("on_primary_fixed_variant", new Function() { // from class: Yue.ۥۡ۠۠ۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠۠ۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimaryFixedVariant$114((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۠۠ۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1829.lambda$onPrimaryFixedVariant$115((DynamicScheme) obj);
            }
        }, new Function() { // from class: Yue.ۥۡ۠۠ۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1830.lambda$onPrimaryFixedVariant$116((DynamicScheme) obj);
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onSecondary() {
        return new DynamicColor("on_secondary", new Function() { // from class: Yue.ۥۡ۟۟ۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟۟ۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondary$71((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۟۟ۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1800.lambda$onSecondary$72((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onSecondaryContainer() {
        return new DynamicColor("on_secondary_container", new Function() { // from class: Yue.ۥۡ۟ۡۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۡۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1807.lambda$onSecondaryContainer$77((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۟ۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1808.lambda$onSecondaryContainer$78((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onSecondaryFixed() {
        return new DynamicColor("on_secondary_fixed", new Function() { // from class: Yue.ۥۡ۟۠ۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟۠ۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondaryFixed$124((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۟ۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1802.lambda$onSecondaryFixed$125((DynamicScheme) obj);
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۡ۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1803.lambda$onSecondaryFixed$126((DynamicScheme) obj);
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onSecondaryFixedVariant() {
        return new DynamicColor("on_secondary_fixed_variant", new Function() { // from class: Yue.ۥۡ۟ۥ۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۥۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondaryFixedVariant$128((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۟ۥۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1816.lambda$onSecondaryFixedVariant$129((DynamicScheme) obj);
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۥۣ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1817.lambda$onSecondaryFixedVariant$130((DynamicScheme) obj);
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onSurface() {
        return new DynamicColor("on_surface", new Function() { // from class: Yue.ۥۡ۠ۢ۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۡ۠۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSurface$32((DynamicScheme) obj);
            }
        }, false, new C6126(this), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onSurfaceVariant() {
        return new DynamicColor("on_surface_variant", new Function() { // from class: Yue.ۥۣۡ۟۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۡ۟ۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSurfaceVariant$36((DynamicScheme) obj);
            }
        }, false, new C6126(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onTertiary() {
        return new DynamicColor("on_tertiary", new Function() { // from class: Yue.ۥۡ۠۟۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠۠۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiary$83((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۠ۡ۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1832.lambda$onTertiary$84((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onTertiaryContainer() {
        return new DynamicColor("on_tertiary_container", new Function() { // from class: Yue.ۥۣۡ۟ۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۡۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1805.lambda$onTertiaryContainer$89((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۟ۡۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1806.lambda$onTertiaryContainer$90((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onTertiaryFixed() {
        return new DynamicColor("on_tertiary_fixed", new Function() { // from class: Yue.ۥۣۡ۟ۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۧۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiaryFixed$138((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۟ۧۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1822.lambda$onTertiaryFixed$139((DynamicScheme) obj);
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۧۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1823.lambda$onTertiaryFixed$140((DynamicScheme) obj);
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @InterfaceC6391
    public DynamicColor onTertiaryFixedVariant() {
        return new DynamicColor("on_tertiary_fixed_variant", new Function() { // from class: Yue.ۥۡ۟ۦۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۦۣ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiaryFixedVariant$142((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: Yue.ۥۡ۟ۦۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1819.lambda$onTertiaryFixedVariant$143((DynamicScheme) obj);
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۦۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1820.lambda$onTertiaryFixedVariant$144((DynamicScheme) obj);
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @InterfaceC6391
    public DynamicColor outline() {
        return new DynamicColor("outline", new Function() { // from class: Yue.ۥۡ۟۠ۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۡ۟۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$outline$43((DynamicScheme) obj);
            }
        }, false, new C6126(this), null, new ContrastCurve(1.5d, 3.0d, 4.5d, 7.0d), null);
    }

    @InterfaceC6391
    public DynamicColor outlineVariant() {
        return new DynamicColor("outline_variant", new Function() { // from class: Yue.ۥۡ۠۟ۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠۟ۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$outlineVariant$45((DynamicScheme) obj);
            }
        }, false, new C6126(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), null);
    }

    @InterfaceC6391
    public DynamicColor primary() {
        return new DynamicColor("primary", new Function() { // from class: Yue.ۥۡ۟ۤۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۤۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primary$53((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: Yue.ۥۡ۟ۤۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1815.lambda$primary$54((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor primaryContainer() {
        return new DynamicColor("primary_container", new Function() { // from class: Yue.ۥۡ۟ۨۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۡ۟ۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryContainer$59((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: Yue.ۥۡ۟ۨۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1824.lambda$primaryContainer$60((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor primaryFixed() {
        return new DynamicColor("primary_fixed", new Function() { // from class: Yue.ۥۣۡ۠ۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۣۡ۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryFixed$104((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: Yue.ۥۣۡ۠ۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1837.lambda$primaryFixed$105((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor primaryFixedDim() {
        return new DynamicColor("primary_fixed_dim", new Function() { // from class: Yue.ۥۣۡ۠ۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۡ۠ۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryFixedDim$107((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: Yue.ۥۣۡ۠ۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1838.lambda$primaryFixedDim$108((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor primaryPaletteKeyColor() {
        return DynamicColor.fromPalette("primary_palette_key_color", new Function() { // from class: Yue.ۥۡ۟ۦ۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۦ۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryPaletteKeyColor$1((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor scrim() {
        return new DynamicColor("scrim", new Function() { // from class: Yue.ۥۡ۟ۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۥ۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$scrim$49((DynamicScheme) obj);
            }
        }, false, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor secondary() {
        return new DynamicColor("secondary", new Function() { // from class: Yue.ۥۡ۟۟ۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondary$68((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: Yue.ۥۡ۟۠۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1801.lambda$secondary$69((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor secondaryContainer() {
        return new DynamicColor("secondary_container", new Function() { // from class: Yue.ۥۡ۟ۧ۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۧ۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryContainer$74((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: Yue.ۥۡ۟ۧۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1821.lambda$secondaryContainer$75((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor secondaryFixed() {
        return new DynamicColor("secondary_fixed", new Function() { // from class: Yue.ۥۡ۠۠ۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠۠ۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryFixed$118((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: Yue.ۥۣۡ۠۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1828.lambda$secondaryFixed$119((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor secondaryFixedDim() {
        return new DynamicColor("secondary_fixed_dim", new Function() { // from class: Yue.ۥۡ۠ۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠ۢ۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryFixedDim$121((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: Yue.ۥۡ۠ۢۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1836.lambda$secondaryFixedDim$122((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor secondaryPaletteKeyColor() {
        return DynamicColor.fromPalette("secondary_palette_key_color", new Function() { // from class: Yue.ۥۡ۟ۦۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۦۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryPaletteKeyColor$3((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor shadow() {
        return new DynamicColor("shadow", new Function() { // from class: Yue.ۥۡ۠ۢۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۡ۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$shadow$47((DynamicScheme) obj);
            }
        }, false, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor surface() {
        return new DynamicColor("surface", new Function() { // from class: Yue.ۥۡ۟۟ۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۦۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surface$16((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor surfaceBright() {
        return new DynamicColor("surface_bright", new Function() { // from class: Yue.ۥۣۡ۠۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠۟ۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceBright$20((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor surfaceContainer() {
        return new DynamicColor("surface_container", new Function() { // from class: Yue.ۥۣۡ۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۡ۟۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainer$26((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor surfaceContainerHigh() {
        return new DynamicColor("surface_container_high", new Function() { // from class: Yue.ۥۡ۟ۨۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۨۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerHigh$28((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor surfaceContainerHighest() {
        return new DynamicColor("surface_container_highest", new Function() { // from class: Yue.ۥۣۡ۠۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۡ۠ۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerHighest$30((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor surfaceContainerLow() {
        return new DynamicColor("surface_container_low", new Function() { // from class: Yue.ۥۡ۟ۦۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerLow$24((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor surfaceContainerLowest() {
        return new DynamicColor("surface_container_lowest", new Function() { // from class: Yue.ۥۡ۟۠۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟۠ۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerLowest$22((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor surfaceDim() {
        return new DynamicColor("surface_dim", new Function() { // from class: Yue.ۥۡ۟ۢۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۡ۟ۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceDim$18((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor surfaceTint() {
        return new DynamicColor("surface_tint", new Function() { // from class: Yue.ۥۡ۟۠ۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟۠ۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceTint$51((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor surfaceVariant() {
        return new DynamicColor("surface_variant", new Function() { // from class: Yue.ۥۡ۠ۢۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۡ۠ۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceVariant$34((DynamicScheme) obj);
            }
        }, true, null, null, null, null);
    }

    @InterfaceC6391
    public DynamicColor tertiary() {
        return new DynamicColor("tertiary", new Function() { // from class: Yue.ۥۡ۟ۥۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۥۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiary$80((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: Yue.ۥۡ۟ۥۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1818.lambda$tertiary$81((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor tertiaryContainer() {
        return new DynamicColor("tertiary_container", new Function() { // from class: Yue.ۥۣۡ۠ۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠ۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryContainer$86((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: Yue.ۥۡ۠ۤ۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1839.lambda$tertiaryContainer$87((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor tertiaryFixed() {
        return new DynamicColor("tertiary_fixed", new Function() { // from class: Yue.ۥۡ۟ۤۢ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۣۡ۟ۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryFixed$132((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: Yue.ۥۡ۟ۤۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1814.lambda$tertiaryFixed$133((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor tertiaryFixedDim() {
        return new DynamicColor("tertiary_fixed_dim", new Function() { // from class: Yue.ۥۡ۠۠ۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠ۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryFixedDim$135((DynamicScheme) obj);
            }
        }, true, new C6126(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: Yue.ۥۡ۠ۡ۟
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f1831.lambda$tertiaryFixedDim$136((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor tertiaryPaletteKeyColor() {
        return DynamicColor.fromPalette("tertiary_palette_key_color", new Function() { // from class: Yue.ۥۡ۟ۧۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۧۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor textHintInverse() {
        return DynamicColor.fromPalette("text_hint_inverse", new Function() { // from class: Yue.ۥۡ۠ۢۦ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠ۢۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textHintInverse$161((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor textPrimaryInverse() {
        return DynamicColor.fromPalette("text_primary_inverse", new Function() { // from class: Yue.ۥۡ۟ۢۧ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۢۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textPrimaryInverse$153((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor textPrimaryInverseDisableOnly() {
        return DynamicColor.fromPalette("text_primary_inverse_disable_only", new Function() { // from class: Yue.ۥۡ۠ۡۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۠ۡۥ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor textSecondaryAndTertiaryInverse() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse", new Function() { // from class: Yue.ۥۣۡ۟ۨ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۤ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$155((DynamicScheme) obj);
            }
        });
    }

    @InterfaceC6391
    public DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse_disabled", new Function() { // from class: Yue.ۥۡ۟ۧۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: Yue.ۥۡ۟ۨۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$159((DynamicScheme) obj);
            }
        });
    }
}
