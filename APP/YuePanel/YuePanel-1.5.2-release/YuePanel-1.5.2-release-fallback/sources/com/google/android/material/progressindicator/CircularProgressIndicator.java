package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes.dex */
public class CircularProgressIndicator extends com.google.android.material.progressindicator.BaseProgressIndicator<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = 0;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_CircularProgressIndicator
            com.google.android.material.progressindicator.CircularProgressIndicator.DEF_STYLE_RES = r0
            return
    }

    public CircularProgressIndicator(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CircularProgressIndicator(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.circularProgressIndicatorStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public CircularProgressIndicator(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3, @Yue.InterfaceC0642 int r4) {
            r1 = this;
            int r0 = com.google.android.material.progressindicator.CircularProgressIndicator.DEF_STYLE_RES
            r1.<init>(r2, r3, r4, r0)
            r1.initializeDrawables()
            return
    }

    private void initializeDrawables() {
            r3 = this;
            com.google.android.material.progressindicator.CircularDrawingDelegate r0 = new com.google.android.material.progressindicator.CircularDrawingDelegate
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r3.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            r0.<init>(r1)
            android.content.Context r1 = r3.getContext()
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r3.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r2 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r2
            com.google.android.material.progressindicator.IndeterminateDrawable r1 = com.google.android.material.progressindicator.IndeterminateDrawable.createCircularDrawable(r1, r2, r0)
            r3.setIndeterminateDrawable(r1)
            android.content.Context r1 = r3.getContext()
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r3.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r2 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r2
            com.google.android.material.progressindicator.DeterminateDrawable r0 = com.google.android.material.progressindicator.DeterminateDrawable.createCircularDrawable(r1, r2, r0)
            r3.setProgressDrawable(r0)
            return
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public /* bridge */ /* synthetic */ com.google.android.material.progressindicator.BaseProgressIndicatorSpec createSpec(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.util.AttributeSet r2) {
            r0 = this;
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = r0.createSpec(r1, r2)
            return r1
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public com.google.android.material.progressindicator.CircularProgressIndicatorSpec createSpec(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = new com.google.android.material.progressindicator.CircularProgressIndicatorSpec
            r0.<init>(r2, r3)
            return r0
    }

    public int getIndicatorDirection() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorDirection
            return r0
    }

    @Yue.InterfaceC4992
    public int getIndicatorInset() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorInset
            return r0
    }

    @Yue.InterfaceC4992
    public int getIndicatorSize() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorSize
            return r0
    }

    public void setIndicatorDirection(int r2) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            r0.indicatorDirection = r2
            r1.invalidate()
            return
    }

    public void setIndicatorInset(@Yue.InterfaceC4992 int r3) {
            r2 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r2.spec
            r1 = r0
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            int r1 = r1.indicatorInset
            if (r1 == r3) goto L10
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            r0.indicatorInset = r3
            r2.invalidate()
        L10:
            return
    }

    public void setIndicatorSize(@Yue.InterfaceC4992 int r3) {
            r2 = this;
            int r0 = r2.getTrackThickness()
            int r0 = r0 * 2
            int r3 = java.lang.Math.max(r3, r0)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r2.spec
            r1 = r0
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            int r1 = r1.indicatorSize
            if (r1 == r3) goto L23
            r1 = r0
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            r1.indicatorSize = r3
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            r0.validateSpec()
            r2.requestLayout()
            r2.invalidate()
        L23:
            return
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int r1) {
            r0 = this;
            super.setTrackThickness(r1)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r0.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            r1.validateSpec()
            return
    }
}
