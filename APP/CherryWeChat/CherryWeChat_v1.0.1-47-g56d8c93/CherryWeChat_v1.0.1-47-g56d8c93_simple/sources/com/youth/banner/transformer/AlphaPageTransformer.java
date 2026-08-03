package com.youth.banner.transformer;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class AlphaPageTransformer extends BasePageTransformer {
    private static final float DEFAULT_MIN_ALPHA = 0.5f;
    private float mMinAlpha;

    public AlphaPageTransformer() {
        this.mMinAlpha = 0.5f;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View r4, float r5) {
        r4.setScaleX(0.999f);
        if (r5 >= (-1.0f)) goto L7;
        r4.setAlpha(this.mMinAlpha);
        return;
    L7:
        if (r5 <= 1.0f) goto L9;
        r4.setAlpha(this.mMinAlpha);
        return;
    L9:
        if (r5 >= 0.0f) goto L12;
        float r1 = this.mMinAlpha;
        float r52 = r5 + 1.0f;
        r4.setAlpha((r52 * (1.0f - r1)) + r1);
        return;
    L12:
        float r12 = this.mMinAlpha;
        float r0 = 1.0f - r5;
        r4.setAlpha((r0 * (1.0f - r12)) + r12);
    }

    public AlphaPageTransformer(float r1) {
        this.mMinAlpha = r1;
    }
}
