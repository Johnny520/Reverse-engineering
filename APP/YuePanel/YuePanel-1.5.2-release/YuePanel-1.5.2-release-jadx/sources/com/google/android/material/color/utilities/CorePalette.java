package com.google.android.material.color.utilities;

import Yue.InterfaceC7144;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public final class CorePalette {

    /* JADX INFO: renamed from: a1 */
    public TonalPalette f4099a1;

    /* JADX INFO: renamed from: a2 */
    public TonalPalette f4100a2;

    /* JADX INFO: renamed from: a3 */
    public TonalPalette f4101a3;
    public TonalPalette error;

    /* JADX INFO: renamed from: n1 */
    public TonalPalette f4102n1;

    /* JADX INFO: renamed from: n2 */
    public TonalPalette f4103n2;

    private CorePalette(int i, boolean z) {
        Hct hctFromInt = Hct.fromInt(i);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z) {
            this.f4099a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f4100a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f4101a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f4102n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f4103n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f4099a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f4100a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f4101a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f4102n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f4103n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i) {
        return new CorePalette(i, true);
    }

    /* JADX INFO: renamed from: of */
    public static CorePalette m5047of(int i) {
        return new CorePalette(i, false);
    }
}
