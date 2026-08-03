package com.youth.banner.transformer;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ScaleInTransformer extends BasePageTransformer {
    private static final float DEFAULT_MIN_SCALE = 0.85f;
    private float mMinScale;

    public ScaleInTransformer() {
        this.mMinScale = DEFAULT_MIN_SCALE;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View r6, float r7) {
        int r0 = r6.getWidth();
        r6.setPivotY(r6.getHeight() / 2);
        r6.setPivotX(r0 / 2);
        if (r7 >= (-1.0f)) goto L7;
        r6.setScaleX(this.mMinScale);
        r6.setScaleY(this.mMinScale);
        r6.setPivotX(r0);
        return;
    L7:
        if (r7 <= 1.0f) goto L9;
        r6.setPivotX(0.0f);
        r6.setScaleX(this.mMinScale);
        r6.setScaleY(this.mMinScale);
        return;
    L9:
        if (r7 >= 0.0f) goto L12;
        float r4 = this.mMinScale;
        float r1 = ((1.0f - r4) * (r7 + 1.0f)) + r4;
        r6.setScaleX(r1);
        r6.setScaleY(r1);
        r6.setPivotX((((-r7) * 0.5f) + 0.5f) * r0);
        return;
    L12:
        float r72 = 1.0f - r7;
        float r2 = this.mMinScale;
        float r12 = ((1.0f - r2) * r72) + r2;
        r6.setScaleX(r12);
        r6.setScaleY(r12);
        r6.setPivotX((r72 * 0.5f) * r0);
    }

    public ScaleInTransformer(float r1) {
        this.mMinScale = r1;
    }
}
