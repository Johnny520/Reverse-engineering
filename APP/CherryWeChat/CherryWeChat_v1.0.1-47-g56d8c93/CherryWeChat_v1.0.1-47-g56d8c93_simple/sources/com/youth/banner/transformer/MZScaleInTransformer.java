package com.youth.banner.transformer;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public class MZScaleInTransformer extends BasePageTransformer {
    private static final float DEFAULT_MIN_SCALE = 0.85f;
    private float mMinScale;

    public MZScaleInTransformer() {
        this.mMinScale = DEFAULT_MIN_SCALE;
    }

    private ViewPager2 requireViewPager(View r2) {
        ViewParent r22 = r2.getParent();
        ViewParent r0 = r22.getParent();
        if ((r22 instanceof RecyclerView) == false) goto L9;
        if ((r0 instanceof ViewPager2) == false) goto L9;
        return (ViewPager2) r0;
    L9:
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View r9, float r10) {
        ViewPager2 r0 = requireViewPager(r9);
        float r1 = r0.getPaddingLeft();
        float r102 = r10 - (r1 / ((r0.getMeasuredWidth() - r1) - r0.getPaddingRight()));
        float r02 = r9.getWidth();
        float r12 = this.mMinScale;
        float r3 = ((1.0f - r12) * r02) / 2.0f;
        if (r102 > (-1.0f)) goto L6;
        r9.setTranslationX(r3);
        r9.setScaleX(this.mMinScale);
        r9.setScaleY(this.mMinScale);
        return;
    L6:
        double r4 = r102;
        if (r4 > 1.0d) goto L20;
        float r13 = Math.abs(1.0f - Math.abs(r102)) * (1.0f - r12);
        float r03 = (-r3) * r102;
        if (r4 > (-0.5d)) goto L12;
        r9.setTranslationX((Math.abs(Math.abs(r102) - 0.5f) / 0.5f) + r03);
    L18:
        r9.setScaleX(this.mMinScale + r13);
        r9.setScaleY(r13 + this.mMinScale);
        return;
    L12:
        if (r102 > 0.0f) goto L15;
        r9.setTranslationX(r03);
        goto L18
    L15:
        if (r4 < 0.5d) goto L17;
        r9.setTranslationX(r03 - (Math.abs(Math.abs(r102) - 0.5f) / 0.5f));
        goto L18
    L17:
        r9.setTranslationX(r03);
        goto L18
    L20:
        r9.setScaleX(r12);
        r9.setScaleY(this.mMinScale);
        r9.setTranslationX(-r3);
    }

    public MZScaleInTransformer(float r1) {
        this.mMinScale = r1;
    }
}
