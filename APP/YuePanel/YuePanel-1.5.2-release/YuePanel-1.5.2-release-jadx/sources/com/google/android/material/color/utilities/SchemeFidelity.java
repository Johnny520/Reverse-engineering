package com.google.android.material.color.utilities;

import Yue.InterfaceC7144;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class SchemeFidelity extends DynamicScheme {
    public SchemeFidelity(Hct hct, boolean z, double d) {
        super(hct, Variant.FIDELITY, z, d, TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma()), TonalPalette.fromHueAndChroma(hct.getHue(), Math.max(hct.getChroma() - 32.0d, hct.getChroma() * 0.5d)), TonalPalette.fromHct(DislikeAnalyzer.fixIfDisliked(new TemperatureCache(hct).getComplement())), TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma() / 8.0d), TonalPalette.fromHueAndChroma(hct.getHue(), (hct.getChroma() / 8.0d) + 4.0d));
    }
}
