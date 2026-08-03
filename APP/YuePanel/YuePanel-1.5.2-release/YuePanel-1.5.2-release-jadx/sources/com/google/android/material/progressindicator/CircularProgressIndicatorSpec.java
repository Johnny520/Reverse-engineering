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
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes.dex */
public final class CircularProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public int indicatorDirection;

    @InterfaceC6844
    public int indicatorInset;

    @InterfaceC6844
    public int indicatorSize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CircularProgressIndicatorSpec(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.circularProgressIndicatorStyle);
    }

    public int getIndicatorTrackGapSizeDegree() {
        int i = this.indicatorTrackGapSize;
        if (i == 0) {
            return 0;
        }
        return (int) Math.round(360.0d / ((((double) ((this.indicatorSize - (this.indicatorInset * 2)) - this.trackThickness)) * 3.141592653589793d) / ((double) (i + this.trackCornerRadius))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CircularProgressIndicatorSpec(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i) {
        this(context, attributeSet, i, CircularProgressIndicator.DEF_STYLE_RES);
    }

    public CircularProgressIndicatorSpec(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C1980R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C1980R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C1980R.styleable.CircularProgressIndicator, i, i2, new int[0]);
        this.indicatorSize = Math.max(MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C1980R.styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.trackThickness * 2);
        this.indicatorInset = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C1980R.styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.indicatorDirection = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArrayObtainStyledAttributes.recycle();
        validateSpec();
    }
}
