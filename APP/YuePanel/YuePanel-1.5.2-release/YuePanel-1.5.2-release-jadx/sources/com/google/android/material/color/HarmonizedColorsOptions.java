package com.google.android.material.color;

import Yue.InterfaceC3451;
import Yue.InterfaceC3906;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7651;
import com.google.android.material.C1980R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public class HarmonizedColorsOptions {

    @InterfaceC3451
    private final int colorAttributeToHarmonizeWith;

    @InterfaceC6490
    private final HarmonizedColorAttributes colorAttributes;

    @InterfaceC6391
    @InterfaceC3906
    private final int[] colorResourceIds;

    public static class Builder {

        @InterfaceC6490
        private HarmonizedColorAttributes colorAttributes;

        @InterfaceC6391
        @InterfaceC3906
        private int[] colorResourceIds = new int[0];

        @InterfaceC3451
        private int colorAttributeToHarmonizeWith = C1980R.attr.colorPrimary;

        @InterfaceC6391
        public HarmonizedColorsOptions build() {
            return new HarmonizedColorsOptions(this);
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setColorAttributeToHarmonizeWith(@InterfaceC3451 int i) {
            this.colorAttributeToHarmonizeWith = i;
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setColorAttributes(@InterfaceC6490 HarmonizedColorAttributes harmonizedColorAttributes) {
            this.colorAttributes = harmonizedColorAttributes;
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setColorResourceIds(@InterfaceC6391 @InterfaceC3906 int[] iArr) {
            this.colorResourceIds = iArr;
            return this;
        }
    }

    @InterfaceC6391
    public static HarmonizedColorsOptions createMaterialDefaults() {
        return new Builder().setColorAttributes(HarmonizedColorAttributes.createMaterialDefaults()).build();
    }

    @InterfaceC3451
    public int getColorAttributeToHarmonizeWith() {
        return this.colorAttributeToHarmonizeWith;
    }

    @InterfaceC6490
    public HarmonizedColorAttributes getColorAttributes() {
        return this.colorAttributes;
    }

    @InterfaceC6391
    @InterfaceC3906
    public int[] getColorResourceIds() {
        return this.colorResourceIds;
    }

    @InterfaceC7651
    public int getThemeOverlayResourceId(@InterfaceC7651 int i) {
        HarmonizedColorAttributes harmonizedColorAttributes = this.colorAttributes;
        return (harmonizedColorAttributes == null || harmonizedColorAttributes.getThemeOverlay() == 0) ? i : this.colorAttributes.getThemeOverlay();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private HarmonizedColorsOptions(Builder builder) {
        this.colorResourceIds = builder.colorResourceIds;
        this.colorAttributes = builder.colorAttributes;
        this.colorAttributeToHarmonizeWith = builder.colorAttributeToHarmonizeWith;
    }
}
