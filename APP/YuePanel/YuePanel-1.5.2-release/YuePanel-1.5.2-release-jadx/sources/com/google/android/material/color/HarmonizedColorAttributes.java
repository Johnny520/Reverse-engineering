package com.google.android.material.color;

import Yue.InterfaceC3451;
import Yue.InterfaceC6391;
import Yue.InterfaceC7651;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
public final class HarmonizedColorAttributes {
    private static final int[] HARMONIZED_MATERIAL_ATTRIBUTES = {C1980R.attr.colorError, C1980R.attr.colorOnError, C1980R.attr.colorErrorContainer, C1980R.attr.colorOnErrorContainer};
    private final int[] attributes;

    @InterfaceC7651
    private final int themeOverlay;

    private HarmonizedColorAttributes(@InterfaceC6391 @InterfaceC3451 int[] iArr, @InterfaceC7651 int i) {
        if (i != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.attributes = iArr;
        this.themeOverlay = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static HarmonizedColorAttributes create(@InterfaceC6391 @InterfaceC3451 int[] iArr) {
        return new HarmonizedColorAttributes(iArr, 0);
    }

    @InterfaceC6391
    public static HarmonizedColorAttributes createMaterialDefaults() {
        return create(HARMONIZED_MATERIAL_ATTRIBUTES, C1980R.style.ThemeOverlay_Material3_HarmonizedColors);
    }

    @InterfaceC6391
    public int[] getAttributes() {
        return this.attributes;
    }

    @InterfaceC7651
    public int getThemeOverlay() {
        return this.themeOverlay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static HarmonizedColorAttributes create(@InterfaceC6391 @InterfaceC3451 int[] iArr, @InterfaceC7651 int i) {
        return new HarmonizedColorAttributes(iArr, i);
    }
}
