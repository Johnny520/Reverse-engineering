package com.google.android.material.color;

import Yue.InterfaceC6391;
import Yue.InterfaceC7651;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public class ColorContrastOptions {

    @InterfaceC7651
    private final int highContrastThemeOverlayResourceId;

    @InterfaceC7651
    private final int mediumContrastThemeOverlayResourceId;

    public static class Builder {

        @InterfaceC7651
        private int highContrastThemeOverlayResourceId;

        @InterfaceC7651
        private int mediumContrastThemeOverlayResourceId;

        @InterfaceC6391
        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setHighContrastThemeOverlay(@InterfaceC7651 int i) {
            this.highContrastThemeOverlayResourceId = i;
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setMediumContrastThemeOverlay(@InterfaceC7651 int i) {
            this.mediumContrastThemeOverlayResourceId = i;
            return this;
        }
    }

    @InterfaceC7651
    public int getHighContrastThemeOverlay() {
        return this.highContrastThemeOverlayResourceId;
    }

    @InterfaceC7651
    public int getMediumContrastThemeOverlay() {
        return this.mediumContrastThemeOverlayResourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private ColorContrastOptions(Builder builder) {
        this.mediumContrastThemeOverlayResourceId = builder.mediumContrastThemeOverlayResourceId;
        this.highContrastThemeOverlayResourceId = builder.highContrastThemeOverlayResourceId;
    }
}
