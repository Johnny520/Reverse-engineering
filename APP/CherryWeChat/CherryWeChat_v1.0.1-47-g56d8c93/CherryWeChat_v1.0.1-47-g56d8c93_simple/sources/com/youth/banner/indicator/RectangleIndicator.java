package com.youth.banner.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class RectangleIndicator extends BaseIndicator {
    RectF rectF;

    public RectangleIndicator(Context r2) {
        this(r2, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas r9) {
        super.onDraw(r9);
        int r0 = this.config.getIndicatorSize();
        if (r0 <= 1) goto L16;
        int r2 = 0;
        float r3 = 0.0f;
    L6:
        if (r2 >= r0) goto L20;
        Paint r4 = this.mPaint;
        if (this.config.getCurrentPosition() != r2) goto L10;
        int r5 = this.config.getSelectedColor();
    L11:
        r4.setColor(r5);
        if (this.config.getCurrentPosition() != r2) goto L14;
        int r42 = this.config.getSelectedWidth();
    L15:
        this.rectF.set(r3, 0.0f, r42 + r3, this.config.getHeight());
        r3 = r3 + (this.config.getIndicatorSpace() + r42);
        r9.drawRoundRect(this.rectF, this.config.getRadius(), this.config.getRadius(), this.mPaint);
        r2 = r2 + 1;
        goto L6
    L14:
        r42 = this.config.getNormalWidth();
        goto L15
    L10:
        r5 = this.config.getNormalColor();
        goto L11
    L20:
        return;
    }

    @Override // android.view.View
    public void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        int r22 = this.config.getIndicatorSize();
        if (r22 > 1) goto L5;
        return;
    L5:
        int r23 = r22 - 1;
        int r0 = this.config.getIndicatorSpace() * r23;
        int r32 = (this.config.getNormalWidth() * r23) + r0;
        setMeasuredDimension(this.config.getSelectedWidth() + r32, this.config.getHeight());
    }

    public RectangleIndicator(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    public RectangleIndicator(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        this.rectF = new RectF();
    }
}
