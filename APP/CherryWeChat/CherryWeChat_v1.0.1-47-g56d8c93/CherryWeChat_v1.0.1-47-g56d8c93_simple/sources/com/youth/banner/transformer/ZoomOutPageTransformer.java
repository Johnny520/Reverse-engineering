package com.youth.banner.transformer;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ZoomOutPageTransformer extends BasePageTransformer {
    private static final float DEFAULT_MIN_ALPHA = 0.5f;
    private static final float DEFAULT_MIN_SCALE = 0.85f;
    private float mMinAlpha;
    private float mMinScale;

    public ZoomOutPageTransformer() {
        this.mMinScale = DEFAULT_MIN_SCALE;
        this.mMinAlpha = 0.5f;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View r8, float r9) {
        int r0 = r8.getWidth();
        int r1 = r8.getHeight();
        if (r9 >= (-1.0f)) goto L7;
        r8.setAlpha(0.0f);
        return;
    L7:
        if (r9 > 1.0f) goto L14;
        float r4 = Math.max(this.mMinScale, 1.0f - Math.abs(r9));
        float r5 = 1.0f - r4;
        float r12 = (r1 * r5) / 2.0f;
        float r02 = (r0 * r5) / 2.0f;
        if (r9 >= 0.0f) goto L11;
        r8.setTranslationX(r02 - (r12 / 2.0f));
    L12:
        r8.setScaleX(r4);
        r8.setScaleY(r4);
        float r92 = this.mMinAlpha;
        float r03 = this.mMinScale;
        r8.setAlpha(((1.0f - r92) * ((r4 - r03) / (1.0f - r03))) + r92);
        return;
    L11:
        r8.setTranslationX((r12 / 2.0f) + (-r02));
        goto L12
    L14:
        r8.setAlpha(0.0f);
    }

    public ZoomOutPageTransformer(float r1, float r2) {
        this.mMinScale = r1;
        this.mMinAlpha = r2;
    }
}
