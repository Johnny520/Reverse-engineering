package com.google.android.material.carousel;

import Yue.C6132;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC8392;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.ShapeableDelegate;

/* JADX INFO: loaded from: classes.dex */
public class MaskableFrameLayout extends FrameLayout implements Maskable, Shapeable {
    private static final int NOT_SET = -1;
    private final RectF maskRect;
    private float maskXPercentage;

    @InterfaceC6490
    private OnMaskChangedListener onMaskChangedListener;

    @InterfaceC6490
    private Boolean savedForceCompatClippingEnabled;

    @InterfaceC6391
    private ShapeAppearanceModel shapeAppearanceModel;
    private final ShapeableDelegate shapeableDelegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaskableFrameLayout(@InterfaceC6391 Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchDraw$1(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CornerSize lambda$setShapeAppearanceModel$0(CornerSize cornerSize) {
        return cornerSize instanceof AbsoluteCornerSize ? ClampedCornerSize.createFromCornerSize((AbsoluteCornerSize) cornerSize) : cornerSize;
    }

    private void onMaskChanged() {
        this.shapeableDelegate.onMaskChanged(this, this.maskRect);
        OnMaskChangedListener onMaskChangedListener = this.onMaskChangedListener;
        if (onMaskChangedListener != null) {
            onMaskChangedListener.onMaskChanged(this.maskRect);
        }
    }

    private void updateMaskRectForMaskXPercentage() {
        if (this.maskXPercentage != -1.0f) {
            float fLerp = AnimationUtils.lerp(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.maskXPercentage);
            setMaskRectF(new RectF(fLerp, 0.0f, getWidth() - fLerp, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new CanvasCompat.CanvasOperation() { // from class: Yue.ۥ۠ۨۨۧ
            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public final void run(Canvas canvas2) {
                this.f1793.lambda$dispatchDraw$1(canvas2);
            }
        });
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        RectF rectF = this.maskRect;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override // com.google.android.material.carousel.Maskable
    @InterfaceC6391
    public RectF getMaskRectF() {
        return this.maskRect;
    }

    @Override // com.google.android.material.carousel.Maskable
    @Deprecated
    public float getMaskXPercentage() {
        return this.maskXPercentage;
    }

    @Override // com.google.android.material.shape.Shapeable
    @InterfaceC6391
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.savedForceCompatClippingEnabled;
        if (bool != null) {
            this.shapeableDelegate.setForceCompatClippingEnabled(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.savedForceCompatClippingEnabled = Boolean.valueOf(this.shapeableDelegate.isForceCompatClippingEnabled());
        this.shapeableDelegate.setForceCompatClippingEnabled(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.maskXPercentage != -1.0f) {
            updateMaskRectForMaskXPercentage();
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.maskRect.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.maskRect.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC8392
    public void setForceCompatClipping(boolean z) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z);
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setMaskRectF(@InterfaceC6391 RectF rectF) {
        this.maskRect.set(rectF);
        onMaskChanged();
    }

    @Override // com.google.android.material.carousel.Maskable
    @Deprecated
    public void setMaskXPercentage(float f) {
        float fM18837 = C6132.m18837(f, 0.0f, 1.0f);
        if (this.maskXPercentage != fM18837) {
            this.maskXPercentage = fM18837;
            updateMaskRectForMaskXPercentage();
        }
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setOnMaskChangedListener(@InterfaceC6490 OnMaskChangedListener onMaskChangedListener) {
        this.onMaskChangedListener = onMaskChangedListener;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@InterfaceC6391 ShapeAppearanceModel shapeAppearanceModel) {
        ShapeAppearanceModel shapeAppearanceModelWithTransformedCornerSizes = shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: Yue.ۥ۠ۨۨۦ
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
            }
        });
        this.shapeAppearanceModel = shapeAppearanceModelWithTransformedCornerSizes;
        this.shapeableDelegate.onShapeAppearanceChanged(this, shapeAppearanceModelWithTransformedCornerSizes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaskableFrameLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maskXPercentage = -1.0f;
        this.maskRect = new RectF();
        this.shapeableDelegate = ShapeableDelegate.create(this);
        this.savedForceCompatClippingEnabled = null;
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context, attributeSet, i, 0, 0).build());
    }
}
