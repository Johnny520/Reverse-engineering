package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.lxj.xpopup.util.AbstractC3787;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class CheckView extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f11885;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Path f11886;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Paint f11887;

    public CheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11885 = 0;
        this.f11886 = new Path();
        Paint paint = new Paint(1);
        this.f11887 = paint;
        paint.setStrokeWidth(AbstractC3787.m8119(context, 2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11885 == 0) {
            return;
        }
        Path path = this.f11886;
        path.moveTo(getMeasuredWidth() / 4.0f, getMeasuredHeight() / 2.0f);
        path.lineTo(getMeasuredWidth() / 2.0f, (getMeasuredHeight() * 3) / 4.0f);
        path.lineTo(getMeasuredWidth(), getMeasuredHeight() / 4.0f);
        canvas.drawPath(path, this.f11887);
    }

    public void setColor(int i) {
        this.f11885 = i;
        this.f11887.setColor(i);
        postInvalidate();
    }
}
