package com.youth.banner.transformer;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class RotateYTransformer extends BasePageTransformer {
    private static final float DEFAULT_MAX_ROTATE = 35.0f;
    private float mMaxRotate;

    public RotateYTransformer() {
        this.mMaxRotate = DEFAULT_MAX_ROTATE;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View r5, float r6) {
        r5.setPivotY(r5.getHeight() / 2);
        if (r6 >= (-1.0f)) goto L7;
        r5.setRotationY(this.mMaxRotate * (-1.0f));
        r5.setPivotX(r5.getWidth());
        return;
    L7:
        if (r6 > 1.0f) goto L14;
        r5.setRotationY(this.mMaxRotate * r6);
        if (r6 >= 0.0f) goto L12;
        r5.setPivotX((((-r6) * 0.5f) + 0.5f) * r5.getWidth());
        r5.setPivotX(r5.getWidth());
        return;
    L12:
        r5.setPivotX((1.0f - r6) * (r5.getWidth() * 0.5f));
        r5.setPivotX(0.0f);
        return;
    L14:
        r5.setRotationY(this.mMaxRotate * 1.0f);
        r5.setPivotX(0.0f);
    }

    public RotateYTransformer(float r1) {
        this.mMaxRotate = r1;
    }
}
