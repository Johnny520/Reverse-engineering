package com.qmdeve.blurview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import yyds.AbstractC1924;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class BlurView extends AbstractC1924 {
    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // yyds.AbstractC1924, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f9712);
        if (!m3721()) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.f9701;
        rectF.set(0.0f, 0.0f, width, height);
        m3714(rectF);
        canvas.drawPath(this.f9698, paint);
    }
}
