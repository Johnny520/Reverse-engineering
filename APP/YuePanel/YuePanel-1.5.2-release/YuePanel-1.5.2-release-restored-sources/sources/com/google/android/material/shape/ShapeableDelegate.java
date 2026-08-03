package com.google.android.material.shape;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import com.google.android.material.canvas.CanvasCompat;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public abstract class ShapeableDelegate {

    @InterfaceC6490
    ShapeAppearanceModel shapeAppearanceModel;
    boolean forceCompatClippingEnabled = false;
    boolean offsetZeroCornerEdgeBoundsEnabled = false;
    RectF maskBounds = new RectF();
    final Path shapePath = new Path();

    @InterfaceC6391
    public static ShapeableDelegate create(@InterfaceC6391 View view) {
        return Build.VERSION.SDK_INT >= 33 ? new ShapeableDelegateV33(view) : new ShapeableDelegateV22(view);
    }

    private boolean isMaskBoundsValid() {
        RectF rectF = this.maskBounds;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    private void updateShapePath() {
        if (!isMaskBoundsValid() || this.shapeAppearanceModel == null) {
            return;
        }
        ShapeAppearancePathProvider.getInstance().calculatePath(this.shapeAppearanceModel, 1.0f, this.maskBounds, this.shapePath);
    }

    public abstract void invalidateClippingMethod(@InterfaceC6391 View view);

    public boolean isForceCompatClippingEnabled() {
        return this.forceCompatClippingEnabled;
    }

    public void maybeClip(@InterfaceC6391 Canvas canvas, @InterfaceC6391 CanvasCompat.CanvasOperation canvasOperation) {
        if (!shouldUseCompatClipping() || this.shapePath.isEmpty()) {
            canvasOperation.run(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.shapePath);
        canvasOperation.run(canvas);
        canvas.restore();
    }

    public void onMaskChanged(@InterfaceC6391 View view, @InterfaceC6391 RectF rectF) {
        this.maskBounds = rectF;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    public void onShapeAppearanceChanged(@InterfaceC6391 View view, @InterfaceC6391 ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    public void setForceCompatClippingEnabled(@InterfaceC6391 View view, boolean z) {
        if (z != this.forceCompatClippingEnabled) {
            this.forceCompatClippingEnabled = z;
            invalidateClippingMethod(view);
        }
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(@InterfaceC6391 View view, boolean z) {
        this.offsetZeroCornerEdgeBoundsEnabled = z;
        invalidateClippingMethod(view);
    }

    public abstract boolean shouldUseCompatClipping();
}
