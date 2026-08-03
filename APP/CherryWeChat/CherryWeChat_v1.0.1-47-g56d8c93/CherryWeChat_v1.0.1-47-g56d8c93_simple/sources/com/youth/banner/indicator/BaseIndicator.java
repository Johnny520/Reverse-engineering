package com.youth.banner.indicator;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.youth.banner.config.IndicatorConfig;

/* JADX INFO: loaded from: classes.dex */
public class BaseIndicator extends View implements Indicator {
    protected IndicatorConfig config;
    protected Paint mPaint;
    protected float offset;

    public BaseIndicator(Context r2) {
        this(r2, null);
    }

    @Override // com.youth.banner.indicator.Indicator
    public IndicatorConfig getIndicatorConfig() {
        return this.config;
    }

    @Override // com.youth.banner.indicator.Indicator
    public View getIndicatorView() {
        if (this.config.isAttachToBanner() == false) goto L15;
        FrameLayout.LayoutParams r0 = new FrameLayout.LayoutParams(-2, -2);
        int r1 = this.config.getGravity();
        if (r1 != 0) goto L7;
        r0.gravity = 8388691;
    L14:
        r0.leftMargin = this.config.getMargins().leftMargin;
        r0.rightMargin = this.config.getMargins().rightMargin;
        r0.topMargin = this.config.getMargins().topMargin;
        r0.bottomMargin = this.config.getMargins().bottomMargin;
        setLayoutParams(r0);
        goto L15
    L7:
        if (r1 != 1) goto L9;
        r0.gravity = 81;
        goto L14
    L9:
        if (r1 != 2) goto L14;
        r0.gravity = 8388693;
    L15:
        return this;
    }

    @Override // com.youth.banner.indicator.Indicator
    public void onPageChanged(int r2, int r3) {
        this.config.setIndicatorSize(r2);
        this.config.setCurrentPosition(r3);
        requestLayout();
    }

    @Override // com.youth.banner.listener.OnPageChangeListener
    public void onPageScrollStateChanged(int r1) {
    }

    @Override // com.youth.banner.listener.OnPageChangeListener
    public void onPageScrolled(int r1, float r2, int r3) {
        this.offset = r2;
        invalidate();
    }

    @Override // com.youth.banner.listener.OnPageChangeListener
    public void onPageSelected(int r2) {
        this.config.setCurrentPosition(r2);
        invalidate();
    }

    public BaseIndicator(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    public BaseIndicator(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        this.config = new IndicatorConfig();
        Paint r12 = new Paint();
        this.mPaint = r12;
        r12.setAntiAlias(true);
        this.mPaint.setColor(0);
        this.mPaint.setColor(this.config.getNormalColor());
    }
}
