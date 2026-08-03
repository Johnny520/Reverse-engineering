package com.google.android.material.progressindicator;

import Yue.InterfaceC3451;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7651;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.C1980R;
import com.google.android.material.internal.ThemeEnforcement;

/* JADX INFO: loaded from: classes.dex */
public final class LinearProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    boolean drawHorizontallyInverse;
    public int indeterminateAnimationType;
    public int indicatorDirection;

    @InterfaceC6844
    public int trackStopIndicatorSize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LinearProgressIndicatorSpec(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.linearProgressIndicatorStyle);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public void validateSpec() {
        super.validateSpec();
        if (this.trackStopIndicatorSize < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.indeterminateAnimationType == 0) {
            if (this.trackCornerRadius > 0 && this.indicatorTrackGapSize == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.indicatorColors.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public LinearProgressIndicatorSpec(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i) {
        this(context, attributeSet, i, LinearProgressIndicator.DEF_STYLE_RES);
    }

    public LinearProgressIndicatorSpec(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C1980R.styleable.LinearProgressIndicator, C1980R.attr.linearProgressIndicatorStyle, LinearProgressIndicator.DEF_STYLE_RES, new int[0]);
        this.indeterminateAnimationType = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.indicatorDirection = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        this.trackStopIndicatorSize = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.LinearProgressIndicator_trackStopIndicatorSize, 0), this.trackThickness);
        typedArrayObtainStyledAttributes.recycle();
        validateSpec();
        this.drawHorizontallyInverse = this.indicatorDirection == 1;
    }
}
