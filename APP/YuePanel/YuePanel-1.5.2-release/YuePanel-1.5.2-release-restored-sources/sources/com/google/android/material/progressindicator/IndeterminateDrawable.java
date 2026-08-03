package com.google.android.material.progressindicator;

import Yue.C4520;
import Yue.C8162;
import Yue.InterfaceC3219;
import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC8392;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.C1980R;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    private IndeterminateAnimatorDelegate<ObjectAnimator> animatorDelegate;
    private DrawingDelegate<S> drawingDelegate;
    private Drawable staticDummyDrawable;

    public IndeterminateDrawable(@InterfaceC6391 Context context, @InterfaceC6391 BaseProgressIndicatorSpec baseProgressIndicatorSpec, @InterfaceC6391 DrawingDelegate<S> drawingDelegate, @InterfaceC6391 IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        super(context, baseProgressIndicatorSpec);
        setDrawingDelegate(drawingDelegate);
        setAnimatorDelegate(indeterminateAnimatorDelegate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@InterfaceC6391 Context context, @InterfaceC6391 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return createCircularDrawable(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@InterfaceC6391 Context context, @InterfaceC6391 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return createLinearDrawable(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    private boolean isSystemAnimatorDisabled() {
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
        return animatorDurationScaleProvider != null && animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) == 0.0f;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, Yue.InterfaceC3219
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC6391 Canvas canvas) {
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
                drawable.setBounds(getBounds());
                C4520.m13235(this.staticDummyDrawable, this.baseSpec.indicatorColors[0]);
                this.staticDummyDrawable.draw(canvas);
                return;
            }
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction(), isShowing(), isHiding());
            int i = this.baseSpec.indicatorTrackGapSize;
            int alpha = getAlpha();
            if (i == 0) {
                this.drawingDelegate.fillTrack(canvas, this.paint, 0.0f, 1.0f, this.baseSpec.trackColor, alpha, 0);
            } else {
                DrawingDelegate.ActiveIndicator activeIndicator = this.animatorDelegate.activeIndicators.get(0);
                DrawingDelegate.ActiveIndicator activeIndicator2 = this.animatorDelegate.activeIndicators.get(r3.size() - 1);
                DrawingDelegate<S> drawingDelegate = this.drawingDelegate;
                if (drawingDelegate instanceof LinearDrawingDelegate) {
                    drawingDelegate.fillTrack(canvas, this.paint, 0.0f, activeIndicator.startFraction, this.baseSpec.trackColor, alpha, i);
                    this.drawingDelegate.fillTrack(canvas, this.paint, activeIndicator2.endFraction, 1.0f, this.baseSpec.trackColor, alpha, i);
                } else {
                    alpha = 0;
                    drawingDelegate.fillTrack(canvas, this.paint, activeIndicator2.endFraction, 1.0f + activeIndicator.startFraction, this.baseSpec.trackColor, 0, i);
                }
            }
            for (int i2 = 0; i2 < this.animatorDelegate.activeIndicators.size(); i2++) {
                DrawingDelegate.ActiveIndicator activeIndicator3 = this.animatorDelegate.activeIndicators.get(i2);
                this.drawingDelegate.fillIndicator(canvas, this.paint, activeIndicator3, getAlpha());
                if (i2 > 0 && i > 0) {
                    this.drawingDelegate.fillTrack(canvas, this.paint, this.animatorDelegate.activeIndicators.get(i2 - 1).endFraction, activeIndicator3.startFraction, this.baseSpec.trackColor, alpha, i);
                }
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @InterfaceC6391
    public IndeterminateAnimatorDelegate<ObjectAnimator> getAnimatorDelegate() {
        return this.animatorDelegate;
    }

    @InterfaceC6391
    public DrawingDelegate<S> getDrawingDelegate() {
        return this.drawingDelegate;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC6490
    public Drawable getStaticDummyDrawable() {
        return this.staticDummyDrawable;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, Yue.InterfaceC3219
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@InterfaceC6391 InterfaceC3219.AbstractC0084 abstractC0084) {
        super.registerAnimationCallback(abstractC0084);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(@InterfaceC5459(from = 0, m2228to = 255) int i) {
        super.setAlpha(i);
    }

    public void setAnimatorDelegate(@InterfaceC6391 IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        this.animatorDelegate = indeterminateAnimatorDelegate;
        indeterminateAnimatorDelegate.registerDrawable(this);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@InterfaceC6490 ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public void setDrawingDelegate(@InterfaceC6391 DrawingDelegate<S> drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC8392
    public void setStaticDummyDrawable(@InterfaceC6490 Drawable drawable) {
        this.staticDummyDrawable = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.animatorDelegate.cancelAnimatorImmediately();
        }
        if (z && z3) {
            this.animatorDelegate.startAnimator();
        }
        return visibleInternal;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, Yue.InterfaceC3219
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@InterfaceC6391 InterfaceC3219.AbstractC0084 abstractC0084) {
        return super.unregisterAnimationCallback(abstractC0084);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@InterfaceC6391 Context context, @InterfaceC6391 CircularProgressIndicatorSpec circularProgressIndicatorSpec, @InterfaceC6391 CircularDrawingDelegate circularDrawingDelegate) {
        IndeterminateDrawable<CircularProgressIndicatorSpec> indeterminateDrawable = new IndeterminateDrawable<>(context, circularProgressIndicatorSpec, circularDrawingDelegate, new CircularIndeterminateAnimatorDelegate(circularProgressIndicatorSpec));
        indeterminateDrawable.setStaticDummyDrawable(C8162.m4189(context.getResources(), C1980R.drawable.indeterminate_static, null));
        return indeterminateDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@InterfaceC6391 Context context, @InterfaceC6391 LinearProgressIndicatorSpec linearProgressIndicatorSpec, @InterfaceC6391 LinearDrawingDelegate linearDrawingDelegate) {
        return new IndeterminateDrawable<>(context, linearProgressIndicatorSpec, linearDrawingDelegate, linearProgressIndicatorSpec.indeterminateAnimationType == 0 ? new LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec) : new LinearIndeterminateDisjointAnimatorDelegate(context, linearProgressIndicatorSpec));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }
}
