package com.google.android.material.color.utilities;

import Yue.InterfaceC7144;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class SchemeContent extends DynamicScheme {
    public SchemeContent(Hct hct, boolean z, double d) {
        super(hct, Variant.CONTENT, z, d, TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma()), TonalPalette.fromHueAndChroma(hct.getHue(), Math.max(hct.getChroma() - 32.0d, hct.getChroma() * 0.5d)), TonalPalette.fromHct(DislikeAnalyzer.fixIfDisliked(new TemperatureCache(hct).getAnalogousColors(3, 6).get(2))), TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma() / 8.0d), TonalPalette.fromHueAndChroma(hct.getHue(), (hct.getChroma() / 8.0d) + 4.0d));
    }
}
