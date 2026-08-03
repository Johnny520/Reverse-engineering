package com.youth.banner.transformer;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class RotateDownPageTransformer extends BasePageTransformer {
    private static final float DEFAULT_MAX_ROTATE = 15.0f;
    private float mMaxRotate;

    public RotateDownPageTransformer() {
        this.mMaxRotate = DEFAULT_MAX_ROTATE;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View r4, float r5) {
        if (r5 >= (-1.0f)) goto L7;
        r4.setRotation(this.mMaxRotate * (-1.0f));
        r4.setPivotX(r4.getWidth());
        r4.setPivotY(r4.getHeight());
        return;
    L7:
        if (r5 <= 1.0f) goto L9;
        r4.setRotation(this.mMaxRotate);
        r4.getWidth();
        r4.setPivotX(0);
        r4.setPivotY(r4.getHeight());
        return;
    L9:
        if (r5 >= 0.0f) goto L12;
        r4.setPivotX((((-r5) * 0.5f) + 0.5f) * r4.getWidth());
        r4.setPivotY(r4.getHeight());
        r4.setRotation(this.mMaxRotate * r5);
        return;
    L12:
        r4.setPivotX((1.0f - r5) * (r4.getWidth() * 0.5f));
        r4.setPivotY(r4.getHeight());
        r4.setRotation(this.mMaxRotate * r5);
    }

    public RotateDownPageTransformer(float r1) {
        this.mMaxRotate = r1;
    }
}
