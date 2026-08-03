package com.youth.banner.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class RoundLinesIndicator extends BaseIndicator {
    public RoundLinesIndicator(Context r2) {
        this(r2, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas r6) {
        super.onDraw(r6);
        if (this.config.getIndicatorSize() > 1) goto L5;
        return;
    L5:
        this.mPaint.setColor(this.config.getNormalColor());
        r6.drawRoundRect(new RectF(0.0f, 0.0f, r6.getWidth(), this.config.getHeight()), this.config.getRadius(), this.config.getRadius(), this.mPaint);
        this.mPaint.setColor(this.config.getSelectedColor());
        r6.drawRoundRect(new RectF(this.config.getSelectedWidth() * this.config.getCurrentPosition(), 0.0f, this.config.getSelectedWidth() + r1, this.config.getHeight()), this.config.getRadius(), this.config.getRadius(), this.mPaint);
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        int r12 = this.config.getIndicatorSize();
        if (r12 > 1) goto L5;
        return;
    L5:
        setMeasuredDimension(this.config.getSelectedWidth() * r12, this.config.getHeight());
    }

    public RoundLinesIndicator(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    public RoundLinesIndicator(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        this.mPaint.setStyle(Paint.Style.FILL);
    }
}
