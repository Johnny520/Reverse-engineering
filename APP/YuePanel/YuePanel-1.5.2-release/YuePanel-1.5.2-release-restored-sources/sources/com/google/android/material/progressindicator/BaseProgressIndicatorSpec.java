package com.google.android.material.progressindicator;

import Yue.InterfaceC3451;
import Yue.InterfaceC3647;
import Yue.InterfaceC3897;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7651;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.C1980R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;

    @InterfaceC6391
    public int[] indicatorColors = new int[0];

    @InterfaceC6844
    public int indicatorTrackGapSize;
    public int showAnimationBehavior;

    @InterfaceC3897
    public int trackColor;

    @InterfaceC6844
    public int trackCornerRadius;

    @InterfaceC6844
    public int trackThickness;

    public BaseProgressIndicatorSpec(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C1980R.dimen.mtrl_progress_track_thickness);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C1980R.styleable.BaseProgressIndicator, i, i2, new int[0]);
        this.trackThickness = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C1980R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.trackCornerRadius = Math.min(MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C1980R.styleable.BaseProgressIndicator_trackCornerRadius, 0), this.trackThickness / 2);
        this.showAnimationBehavior = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.hideAnimationBehavior = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.indicatorTrackGapSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.BaseProgressIndicator_indicatorTrackGapSize, 0);
        loadIndicatorColors(context, typedArrayObtainStyledAttributes);
        loadTrackColor(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void loadIndicatorColors(@InterfaceC6391 Context context, @InterfaceC6391 TypedArray typedArray) {
        if (!typedArray.hasValue(C1980R.styleable.BaseProgressIndicator_indicatorColor)) {
            this.indicatorColors = new int[]{MaterialColors.getColor(context, C1980R.attr.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(C1980R.styleable.BaseProgressIndicator_indicatorColor).type != 1) {
            this.indicatorColors = new int[]{typedArray.getColor(C1980R.styleable.BaseProgressIndicator_indicatorColor, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(C1980R.styleable.BaseProgressIndicator_indicatorColor, -1));
        this.indicatorColors = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void loadTrackColor(@InterfaceC6391 Context context, @InterfaceC6391 TypedArray typedArray) {
        if (typedArray.hasValue(C1980R.styleable.BaseProgressIndicator_trackColor)) {
            this.trackColor = typedArray.getColor(C1980R.styleable.BaseProgressIndicator_trackColor, -1);
            return;
        }
        this.trackColor = this.indicatorColors[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.trackColor = MaterialColors.compositeARGBWithAlpha(this.trackColor, (int) (f * 255.0f));
    }

    public boolean isHideAnimationEnabled() {
        return this.hideAnimationBehavior != 0;
    }

    public boolean isShowAnimationEnabled() {
        return this.showAnimationBehavior != 0;
    }

    @InterfaceC3647
    public void validateSpec() {
        if (this.indicatorTrackGapSize < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
