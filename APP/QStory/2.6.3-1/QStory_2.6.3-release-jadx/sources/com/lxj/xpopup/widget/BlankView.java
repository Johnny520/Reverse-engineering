package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BlankView extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public RectF f12194;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f12195;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Paint f12196;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f12197;

    public BlankView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12197 = -1;
        this.f12195 = Color.parseColor("#DDDDDD");
        Paint paint = new Paint();
        this.f12196 = paint;
        this.f12194 = null;
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f12197;
        Paint paint = this.f12196;
        paint.setColor(i);
        canvas.drawRoundRect(this.f12194, 0.0f, 0.0f, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f12195);
        canvas.drawRoundRect(this.f12194, 0.0f, 0.0f, paint);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12194 = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }
}
