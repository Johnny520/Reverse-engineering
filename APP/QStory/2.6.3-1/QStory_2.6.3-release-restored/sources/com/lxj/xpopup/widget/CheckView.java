package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.lxj.xpopup.util.AbstractC4620;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class CheckView extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f12235;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Path f12236;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Paint f12237;

    public CheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f12235 = 0;
        this.f12236 = new Path();
        Paint paint = new Paint(1);
        this.f12237 = paint;
        paint.setStrokeWidth(AbstractC4620.m8665(context, 2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f12235 == 0) {
            return;
        }
        Path path = this.f12236;
        path.moveTo(getMeasuredWidth() / 4.0f, getMeasuredHeight() / 2.0f);
        path.lineTo(getMeasuredWidth() / 2.0f, (getMeasuredHeight() * 3) / 4.0f);
        path.lineTo(getMeasuredWidth(), getMeasuredHeight() / 4.0f);
        canvas.drawPath(path, this.f12237);
    }

    public void setColor(int i) {
        this.f12235 = i;
        this.f12237.setColor(i);
        postInvalidate();
    }
}
