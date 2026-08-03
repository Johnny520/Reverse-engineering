package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
public class RoundView extends RelativeLayout {
    private Path mBoundPath;
    private float mRadius;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RoundView(Context context) {
        this(context, null);
    }

    private Path caculateRoundRectPath(Rect rect) {
        Path path = new Path();
        float radius = getRadius();
        path.addRoundRect(new RectF(rect.left + 0.0f, rect.top + 0.0f, rect.right - 0.0f, rect.bottom - 0.0f), radius, radius, Path.Direction.CW);
        return path;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        getLocalVisibleRect(rect);
        Path pathCaculateRoundRectPath = caculateRoundRectPath(rect);
        this.mBoundPath = pathCaculateRoundRectPath;
        canvas.clipPath(pathCaculateRoundRectPath);
        super.draw(canvas);
    }

    public float getRadius() {
        return this.mRadius;
    }

    public void setRadius(float f) {
        if (this.mRadius == f) {
            return;
        }
        this.mRadius = f;
        postInvalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RoundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRadius = 0.0f;
        this.mBoundPath = null;
        setWillNotDraw(false);
        this.mRadius = 50.0f;
    }
}
