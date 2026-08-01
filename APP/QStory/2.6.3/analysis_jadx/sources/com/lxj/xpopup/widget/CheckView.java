package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.lxj.xpopup.util.AbstractC3788;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class CheckView extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f11890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Path f11891;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Paint f11892;

    public CheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11890 = 0;
        this.f11891 = new Path();
        Paint paint = new Paint(1);
        this.f11892 = paint;
        paint.setStrokeWidth(AbstractC3788.m8106(context, 2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11890 == 0) {
            return;
        }
        Path path = this.f11891;
        path.moveTo(getMeasuredWidth() / 4.0f, getMeasuredHeight() / 2.0f);
        path.lineTo(getMeasuredWidth() / 2.0f, (getMeasuredHeight() * 3) / 4.0f);
        path.lineTo(getMeasuredWidth(), getMeasuredHeight() / 4.0f);
        canvas.drawPath(path, this.f11892);
    }

    public void setColor(int i) {
        this.f11890 = i;
        this.f11892.setColor(i);
        postInvalidate();
    }
}
