package com.google.android.material.progressindicator;

import Yue.InterfaceC3451;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7144;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.C1980R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = C1980R.style.Widget_MaterialComponents_CircularProgressIndicator;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CircularProgressIndicator(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private void initializeDrawables() {
        CircularDrawingDelegate circularDrawingDelegate = new CircularDrawingDelegate((CircularProgressIndicatorSpec) this.spec);
        setIndeterminateDrawable(IndeterminateDrawable.createCircularDrawable(getContext(), (CircularProgressIndicatorSpec) this.spec, circularDrawingDelegate));
        setProgressDrawable(DeterminateDrawable.createCircularDrawable(getContext(), (CircularProgressIndicatorSpec) this.spec, circularDrawingDelegate));
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorDirection;
    }

    @InterfaceC6844
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorInset;
    }

    @InterfaceC6844
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorSize;
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.spec).indicatorDirection = i;
        invalidate();
    }

    public void setIndicatorInset(@InterfaceC6844 int i) {
        S s = this.spec;
        if (((CircularProgressIndicatorSpec) s).indicatorInset != i) {
            ((CircularProgressIndicatorSpec) s).indicatorInset = i;
            invalidate();
        }
    }

    public void setIndicatorSize(@InterfaceC6844 int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        S s = this.spec;
        if (((CircularProgressIndicatorSpec) s).indicatorSize != iMax) {
            ((CircularProgressIndicatorSpec) s).indicatorSize = iMax;
            ((CircularProgressIndicatorSpec) s).validateSpec();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.spec).validateSpec();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CircularProgressIndicator(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.circularProgressIndicatorStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: createSpec(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec; */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public CircularProgressIndicatorSpec createSpec(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public CircularProgressIndicator(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i) {
        super(context, attributeSet, i, DEF_STYLE_RES);
        initializeDrawables();
    }
}
