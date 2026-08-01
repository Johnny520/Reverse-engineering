package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class BlankView extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public RectF f11844;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11845;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Paint f11846;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f11847;

    public BlankView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11847 = -1;
        this.f11845 = Color.parseColor("#DDDDDD");
        Paint paint = new Paint();
        this.f11846 = paint;
        this.f11844 = null;
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f11847;
        Paint paint = this.f11846;
        paint.setColor(i);
        canvas.drawRoundRect(this.f11844, 0.0f, 0.0f, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f11845);
        canvas.drawRoundRect(this.f11844, 0.0f, 0.0f, paint);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11844 = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }
}
