package com.google.android.material.textfield;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: loaded from: classes.dex */
class CutoutDrawable extends MaterialShapeDrawable {

    @InterfaceC6391
    CutoutDrawableState drawableState;

    public static class ImplApi14 extends CutoutDrawable {
        private Paint cutoutPaint;
        private int savedLayer;

        public ImplApi14(@InterfaceC6391 CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
        }

        private Paint getCutoutPaint() {
            if (this.cutoutPaint == null) {
                Paint paint = new Paint(1);
                this.cutoutPaint = paint;
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.cutoutPaint.setColor(-1);
                this.cutoutPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            return this.cutoutPaint;
        }

        private void postDraw(@InterfaceC6391 Canvas canvas) {
            if (useHardwareLayer(getCallback())) {
                return;
            }
            canvas.restoreToCount(this.savedLayer);
        }

        private void preDraw(@InterfaceC6391 Canvas canvas) {
            Drawable.Callback callback = getCallback();
            if (!useHardwareLayer(callback)) {
                saveCanvasLayer(canvas);
                return;
            }
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        }

        private void saveCanvasLayer(@InterfaceC6391 Canvas canvas) {
            this.savedLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }

        private boolean useHardwareLayer(Drawable.Callback callback) {
            return callback instanceof View;
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public void draw(@InterfaceC6391 Canvas canvas) {
            preDraw(canvas);
            super.draw(canvas);
            postDraw(canvas);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public void drawStrokeShape(@InterfaceC6391 Canvas canvas) {
            super.drawStrokeShape(canvas);
            canvas.drawRect(((CutoutDrawable) this).drawableState.cutoutBounds, getCutoutPaint());
        }
    }

    @TargetApi(18)
    public static class ImplApi18 extends CutoutDrawable {
        public ImplApi18(@InterfaceC6391 CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public void drawStrokeShape(@InterfaceC6391 Canvas canvas) {
            if (((CutoutDrawable) this).drawableState.cutoutBounds.isEmpty()) {
                super.drawStrokeShape(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(((CutoutDrawable) this).drawableState.cutoutBounds);
            super.drawStrokeShape(canvas);
            canvas.restore();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static CutoutDrawable create(@InterfaceC6490 ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel == null) {
            shapeAppearanceModel = new ShapeAppearanceModel();
        }
        return create(new CutoutDrawableState(shapeAppearanceModel, new RectF()));
    }

    public boolean hasCutout() {
        return !this.drawableState.cutoutBounds.isEmpty();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @InterfaceC6391
    public Drawable mutate() {
        this.drawableState = new CutoutDrawableState(this.drawableState);
        return this;
    }

    public void removeCutout() {
        setCutout(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCutout(float f, float f2, float f3, float f4) {
        if (f == this.drawableState.cutoutBounds.left && f2 == this.drawableState.cutoutBounds.top && f3 == this.drawableState.cutoutBounds.right && f4 == this.drawableState.cutoutBounds.bottom) {
            return;
        }
        this.drawableState.cutoutBounds.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public static final class CutoutDrawableState extends MaterialShapeDrawable.MaterialShapeDrawableState {

        @InterfaceC6391
        private final RectF cutoutBounds;

        @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
        @InterfaceC6391
        public Drawable newDrawable() {
            CutoutDrawable cutoutDrawableCreate = CutoutDrawable.create(this);
            cutoutDrawableCreate.invalidateSelf();
            return cutoutDrawableCreate;
        }

        private CutoutDrawableState(@InterfaceC6391 ShapeAppearanceModel shapeAppearanceModel, @InterfaceC6391 RectF rectF) {
            super(shapeAppearanceModel, null);
            this.cutoutBounds = rectF;
        }

        private CutoutDrawableState(@InterfaceC6391 CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
            this.cutoutBounds = cutoutDrawableState.cutoutBounds;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private CutoutDrawable(@InterfaceC6391 CutoutDrawableState cutoutDrawableState) {
        super(cutoutDrawableState);
        this.drawableState = cutoutDrawableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CutoutDrawable create(@InterfaceC6391 CutoutDrawableState cutoutDrawableState) {
        return new ImplApi18(cutoutDrawableState);
    }

    public void setCutout(@InterfaceC6391 RectF rectF) {
        setCutout(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
