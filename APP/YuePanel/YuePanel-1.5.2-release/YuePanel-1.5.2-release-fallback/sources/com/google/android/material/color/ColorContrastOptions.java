package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
public class ColorContrastOptions {

    @Yue.InterfaceC6018
    private final int highContrastThemeOverlayResourceId;

    @Yue.InterfaceC6018
    private final int mediumContrastThemeOverlayResourceId;

    /* JADX INFO: renamed from: com.google.android.material.color.ColorContrastOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {

        @Yue.InterfaceC6018
        private int highContrastThemeOverlayResourceId;

        @Yue.InterfaceC6018
        private int mediumContrastThemeOverlayResourceId;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ int access$000(com.google.android.material.color.ColorContrastOptions.Builder r0) {
                int r0 = r0.mediumContrastThemeOverlayResourceId
                return r0
        }

        public static /* synthetic */ int access$100(com.google.android.material.color.ColorContrastOptions.Builder r0) {
                int r0 = r0.highContrastThemeOverlayResourceId
                return r0
        }

        @Yue.InterfaceC4410
        public com.google.android.material.color.ColorContrastOptions build() {
                r2 = this;
                com.google.android.material.color.ColorContrastOptions r0 = new com.google.android.material.color.ColorContrastOptions
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Yue.InterfaceC4410
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.color.ColorContrastOptions.Builder setHighContrastThemeOverlay(@Yue.InterfaceC6018 int r1) {
                r0 = this;
                r0.highContrastThemeOverlayResourceId = r1
                return r0
        }

        @Yue.InterfaceC4410
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.color.ColorContrastOptions.Builder setMediumContrastThemeOverlay(@Yue.InterfaceC6018 int r1) {
                r0 = this;
                r0.mediumContrastThemeOverlayResourceId = r1
                return r0
        }
    }

    private ColorContrastOptions(com.google.android.material.color.ColorContrastOptions.Builder r2) {
            r1 = this;
            r1.<init>()
            int r0 = com.google.android.material.color.ColorContrastOptions.Builder.access$000(r2)
            r1.mediumContrastThemeOverlayResourceId = r0
            int r2 = com.google.android.material.color.ColorContrastOptions.Builder.access$100(r2)
            r1.highContrastThemeOverlayResourceId = r2
            return
    }

    public /* synthetic */ ColorContrastOptions(com.google.android.material.color.ColorContrastOptions.Builder r1, com.google.android.material.color.ColorContrastOptions.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Yue.InterfaceC6018
    public int getHighContrastThemeOverlay() {
            r1 = this;
            int r0 = r1.highContrastThemeOverlayResourceId
            return r0
    }

    @Yue.InterfaceC6018
    public int getMediumContrastThemeOverlay() {
            r1 = this;
            int r0 = r1.mediumContrastThemeOverlayResourceId
            return r0
    }
}
