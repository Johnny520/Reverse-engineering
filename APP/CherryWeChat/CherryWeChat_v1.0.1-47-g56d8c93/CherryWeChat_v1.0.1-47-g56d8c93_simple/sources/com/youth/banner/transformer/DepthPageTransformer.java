package com.youth.banner.transformer;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class DepthPageTransformer extends BasePageTransformer {
    private static final float DEFAULT_MIN_SCALE = 0.75f;
    private float mMinScale;

    public DepthPageTransformer() {
        this.mMinScale = DEFAULT_MIN_SCALE;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View r5, float r6) {
        int r0 = r5.getWidth();
        if (r6 >= (-1.0f)) goto L7;
        r5.setAlpha(0.0f);
        return;
    L7:
        if (r6 > 0.0f) goto L11;
        r5.setAlpha(1.0f);
        r5.setTranslationX(0.0f);
        r5.setScaleX(1.0f);
        r5.setScaleY(1.0f);
        return;
    L11:
        if (r6 > 1.0f) goto L16;
        r5.setVisibility(0);
        r5.setAlpha(1.0f - r6);
        r5.setTranslationX(r0 * (-r6));
        float r02 = this.mMinScale;
        float r2 = ((1.0f - Math.abs(r6)) * (1.0f - r02)) + r02;
        r5.setScaleX(r2);
        r5.setScaleY(r2);
        if (r6 != 1.0f) goto L18;
        r5.setVisibility(4);
        return;
    L18:
        return;
    L16:
        r5.setAlpha(0.0f);
    }

    public DepthPageTransformer(float r1) {
        this.mMinScale = r1;
    }
}
