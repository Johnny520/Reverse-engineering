package com.google.android.material.internal;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class ClippableRoundedCornerLayout extends FrameLayout {
    private float cornerRadius;

    @InterfaceC6490
    private Path path;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClippableRoundedCornerLayout(@InterfaceC6391 Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.path == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public void resetClipBoundsAndCornerRadius() {
        this.path = null;
        this.cornerRadius = 0.0f;
        invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void updateClipBoundsAndCornerRadius(@InterfaceC6391 Rect rect, float f) {
        updateClipBoundsAndCornerRadius(rect.left, rect.top, rect.right, rect.bottom, f);
    }

    public void updateCornerRadius(float f) {
        updateClipBoundsAndCornerRadius(getLeft(), getTop(), getRight(), getBottom(), f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ClippableRoundedCornerLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void updateClipBoundsAndCornerRadius(float f, float f2, float f3, float f4, float f5) {
        updateClipBoundsAndCornerRadius(new RectF(f, f2, f3, f4), f5);
    }

    public ClippableRoundedCornerLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void updateClipBoundsAndCornerRadius(@InterfaceC6391 RectF rectF, float f) {
        if (this.path == null) {
            this.path = new Path();
        }
        this.cornerRadius = f;
        this.path.reset();
        this.path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.path.close();
        invalidate();
    }
}
