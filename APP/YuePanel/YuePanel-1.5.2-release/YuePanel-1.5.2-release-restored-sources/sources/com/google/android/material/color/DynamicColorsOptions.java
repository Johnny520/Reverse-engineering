package com.google.android.material.color;

import Yue.InterfaceC3897;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7651;
import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.material.color.DynamicColors;
import com.google.android.material.color.utilities.QuantizerCelebi;
import com.google.android.material.color.utilities.Score;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public class DynamicColorsOptions {
    private static final DynamicColors.Precondition ALWAYS_ALLOW = new DynamicColors.Precondition() { // from class: com.google.android.material.color.DynamicColorsOptions.1
        @Override // com.google.android.material.color.DynamicColors.Precondition
        public boolean shouldApplyDynamicColors(@InterfaceC6391 Activity activity, int i) {
            return true;
        }
    };
    private static final DynamicColors.OnAppliedCallback NO_OP_CALLBACK = new DynamicColors.OnAppliedCallback() { // from class: com.google.android.material.color.DynamicColorsOptions.2
        @Override // com.google.android.material.color.DynamicColors.OnAppliedCallback
        public void onApplied(@InterfaceC6391 Activity activity) {
        }
    };

    @InterfaceC6490
    private Integer contentBasedSeedColor;

    @InterfaceC6391
    private final DynamicColors.OnAppliedCallback onAppliedCallback;

    @InterfaceC6391
    private final DynamicColors.Precondition precondition;

    @InterfaceC7651
    private final int themeOverlay;

    private static int extractSeedColorFromImage(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return Score.score(QuantizerCelebi.quantize(iArr, 128)).get(0).intValue();
    }

    @InterfaceC6490
    public Integer getContentBasedSeedColor() {
        return this.contentBasedSeedColor;
    }

    @InterfaceC6391
    public DynamicColors.OnAppliedCallback getOnAppliedCallback() {
        return this.onAppliedCallback;
    }

    @InterfaceC6391
    public DynamicColors.Precondition getPrecondition() {
        return this.precondition;
    }

    @InterfaceC7651
    public int getThemeOverlay() {
        return this.themeOverlay;
    }

    public static class Builder {

        @InterfaceC6490
        private Bitmap contentBasedSourceBitmap;

        @InterfaceC6490
        private Integer contentBasedSourceColor;

        @InterfaceC7651
        private int themeOverlay;

        @InterfaceC6391
        private DynamicColors.Precondition precondition = DynamicColorsOptions.ALWAYS_ALLOW;

        @InterfaceC6391
        private DynamicColors.OnAppliedCallback onAppliedCallback = DynamicColorsOptions.NO_OP_CALLBACK;

        @InterfaceC6391
        public DynamicColorsOptions build() {
            return new DynamicColorsOptions(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setContentBasedSource(@InterfaceC6391 Bitmap bitmap) {
            this.contentBasedSourceBitmap = bitmap;
            this.contentBasedSourceColor = null;
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setOnAppliedCallback(@InterfaceC6391 DynamicColors.OnAppliedCallback onAppliedCallback) {
            this.onAppliedCallback = onAppliedCallback;
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setPrecondition(@InterfaceC6391 DynamicColors.Precondition precondition) {
            this.precondition = precondition;
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setThemeOverlay(@InterfaceC7651 int i) {
            this.themeOverlay = i;
            return this;
        }

        @InterfaceC6391
        @CanIgnoreReturnValue
        public Builder setContentBasedSource(@InterfaceC3897 int i) {
            this.contentBasedSourceBitmap = null;
            this.contentBasedSourceColor = Integer.valueOf(i);
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private DynamicColorsOptions(Builder builder) {
        this.themeOverlay = builder.themeOverlay;
        this.precondition = builder.precondition;
        this.onAppliedCallback = builder.onAppliedCallback;
        if (builder.contentBasedSourceColor != null) {
            this.contentBasedSeedColor = builder.contentBasedSourceColor;
        } else if (builder.contentBasedSourceBitmap != null) {
            this.contentBasedSeedColor = Integer.valueOf(extractSeedColorFromImage(builder.contentBasedSourceBitmap));
        }
    }
}
