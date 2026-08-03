package com.youth.banner.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class CircleIndicator extends BaseIndicator {
    private int mNormalRadius;
    private int mSelectedRadius;
    private int maxRadius;

    public CircleIndicator(Context r2) {
        this(r2, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas r9) {
        super.onDraw(r9);
        int r0 = this.config.getIndicatorSize();
        if (r0 <= 1) goto L20;
        float r1 = 0.0f;
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L24;
        Paint r3 = this.mPaint;
        if (this.config.getCurrentPosition() != r2) goto L10;
        int r4 = this.config.getSelectedColor();
    L11:
        r3.setColor(r4);
        if (this.config.getCurrentPosition() != r2) goto L14;
        int r32 = this.config.getSelectedWidth();
    L16:
        if (this.config.getCurrentPosition() != r2) goto L18;
        int r42 = this.mSelectedRadius;
    L19:
        float r43 = r42;
        r9.drawCircle(r1 + r43, this.maxRadius, r43, this.mPaint);
        r1 = r1 + (this.config.getIndicatorSpace() + r32);
        r2 = r2 + 1;
        goto L6
    L18:
        r42 = this.mNormalRadius;
        goto L19
    L14:
        r32 = this.config.getNormalWidth();
        goto L16
    L10:
        r4 = this.config.getNormalColor();
        goto L11
    L24:
        return;
    }

    @Override // android.view.View
    public void onMeasure(int r3, int r4) {
        super.onMeasure(r3, r4);
        int r32 = this.config.getIndicatorSize();
        if (r32 > 1) goto L5;
        return;
    L5:
        this.mNormalRadius = this.config.getNormalWidth() / 2;
        int r0 = this.config.getSelectedWidth() / 2;
        this.mSelectedRadius = r0;
        this.maxRadius = Math.max(r0, this.mNormalRadius);
        int r33 = r32 - 1;
        int r42 = this.config.getIndicatorSpace() * r33;
        int r02 = this.config.getSelectedWidth() + r42;
        setMeasuredDimension((this.config.getNormalWidth() * r33) + r02, Math.max(this.config.getNormalWidth(), this.config.getSelectedWidth()));
    }

    public CircleIndicator(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    public CircleIndicator(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        this.mNormalRadius = this.config.getNormalWidth() / 2;
        this.mSelectedRadius = this.config.getSelectedWidth() / 2;
    }
}
