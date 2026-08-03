package com.youth.banner.transformer;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class RotateUpPageTransformer extends BasePageTransformer {
    private static final float DEFAULT_MAX_ROTATE = 15.0f;
    private float mMaxRotate;

    public RotateUpPageTransformer() {
        this.mMaxRotate = DEFAULT_MAX_ROTATE;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View r5, float r6) {
        if (r6 >= (-1.0f)) goto L7;
        r5.setRotation(this.mMaxRotate);
        r5.setPivotX(r5.getWidth());
        r5.setPivotY(0.0f);
        return;
    L7:
        if (r6 <= 1.0f) goto L9;
        r5.setRotation(-this.mMaxRotate);
        r5.setPivotX(0.0f);
        r5.setPivotY(0.0f);
        return;
    L9:
        if (r6 >= 0.0f) goto L12;
        r5.setPivotX((((-r6) * 0.5f) + 0.5f) * r5.getWidth());
        r5.setPivotY(0.0f);
        r5.setRotation((-this.mMaxRotate) * r6);
        return;
    L12:
        r5.setPivotX((1.0f - r6) * (r5.getWidth() * 0.5f));
        r5.setPivotY(0.0f);
        r5.setRotation((-this.mMaxRotate) * r6);
    }

    public RotateUpPageTransformer(float r1) {
        this.mMaxRotate = r1;
    }
}
