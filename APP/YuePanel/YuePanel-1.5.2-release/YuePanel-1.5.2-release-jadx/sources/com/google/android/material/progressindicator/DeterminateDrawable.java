package com.google.android.material.progressindicator;

import Yue.AbstractC4565;
import Yue.AbstractC4884;
import Yue.C6132;
import Yue.C7560;
import Yue.C7561;
import Yue.InterfaceC3219;
import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    static final float GAP_RAMP_DOWN_THRESHOLD = 0.01f;
    private static final AbstractC4884<DeterminateDrawable<?>> INDICATOR_LENGTH_IN_LEVEL = new AbstractC4884<DeterminateDrawable<?>>("indicatorLevel") { // from class: com.google.android.material.progressindicator.DeterminateDrawable.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        public float getValue(DeterminateDrawable<?> determinateDrawable) {
            return determinateDrawable.getIndicatorFraction() * 10000.0f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        public void setValue(DeterminateDrawable<?> determinateDrawable, float f) {
            determinateDrawable.setIndicatorFraction(f / 10000.0f);
        }
    };
    private static final int MAX_DRAWABLE_LEVEL = 10000;
    private static final float SPRING_FORCE_STIFFNESS = 50.0f;
    private final DrawingDelegate.ActiveIndicator activeIndicator;
    private DrawingDelegate<S> drawingDelegate;
    private boolean skipAnimationOnLevelChange;
    private final C7560 springAnimation;
    private final C7561 springForce;

    public DeterminateDrawable(@InterfaceC6391 Context context, @InterfaceC6391 BaseProgressIndicatorSpec baseProgressIndicatorSpec, @InterfaceC6391 DrawingDelegate<S> drawingDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.skipAnimationOnLevelChange = false;
        setDrawingDelegate(drawingDelegate);
        this.activeIndicator = new DrawingDelegate.ActiveIndicator();
        C7561 c7561 = new C7561();
        this.springForce = c7561;
        c7561.m23669(1.0f);
        c7561.m23671(50.0f);
        C7560 c7560 = new C7560(this, INDICATOR_LENGTH_IN_LEVEL);
        this.springAnimation = c7560;
        c7560.m23663(c7561);
        setGrowFraction(1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static DeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@InterfaceC6391 Context context, @InterfaceC6391 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return createCircularDrawable(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static DeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@InterfaceC6391 Context context, @InterfaceC6391 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return createLinearDrawable(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getIndicatorFraction() {
        return this.activeIndicator.endFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndicatorFraction(float f) {
        this.activeIndicator.endFraction = f;
        invalidateSelf();
    }

    public void addSpringAnimationEndListener(@InterfaceC6391 AbstractC4565.InterfaceC4580 interfaceC4580) {
        this.springAnimation.m1513(interfaceC4580);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, Yue.InterfaceC3219
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC6391 Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction(), isShowing(), isHiding());
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setAntiAlias(true);
            DrawingDelegate.ActiveIndicator activeIndicator = this.activeIndicator;
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
            activeIndicator.color = baseProgressIndicatorSpec.indicatorColors[0];
            int iM18837 = baseProgressIndicatorSpec.indicatorTrackGapSize;
            if (iM18837 > 0) {
                if (!(this.drawingDelegate instanceof LinearDrawingDelegate)) {
                    iM18837 = (int) ((iM18837 * C6132.m18837(getIndicatorFraction(), 0.0f, 0.01f)) / 0.01f);
                }
                this.drawingDelegate.fillTrack(canvas, this.paint, getIndicatorFraction(), 1.0f, this.baseSpec.trackColor, getAlpha(), iM18837);
            } else {
                this.drawingDelegate.fillTrack(canvas, this.paint, 0.0f, 1.0f, baseProgressIndicatorSpec.trackColor, getAlpha(), 0);
            }
            this.drawingDelegate.fillIndicator(canvas, this.paint, this.activeIndicator, getAlpha());
            this.drawingDelegate.drawStopIndicator(canvas, this.paint, this.baseSpec.indicatorColors[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
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

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.springAnimation.m23664();
        setIndicatorFraction(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        if (this.skipAnimationOnLevelChange) {
            this.springAnimation.m23664();
            setIndicatorFraction(i / 10000.0f);
            return true;
        }
        this.springAnimation.m13625(getIndicatorFraction() * 10000.0f);
        this.springAnimation.m23659(i);
        return true;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, Yue.InterfaceC3219
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@InterfaceC6391 InterfaceC3219.AbstractC0084 abstractC0084) {
        super.registerAnimationCallback(abstractC0084);
    }

    public void removeSpringAnimationEndListener(@InterfaceC6391 AbstractC4565.InterfaceC4580 interfaceC4580) {
        this.springAnimation.m13619(interfaceC4580);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(@InterfaceC5459(from = 0, m2228to = 255) int i) {
        super.setAlpha(i);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@InterfaceC6490 ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public void setDrawingDelegate(@InterfaceC6391 DrawingDelegate<S> drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
    }

    public void setLevelByFraction(float f) {
        setLevel((int) (f * 10000.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        float systemAnimatorDurationScale = this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver());
        if (systemAnimatorDurationScale == 0.0f) {
            this.skipAnimationOnLevelChange = true;
        } else {
            this.skipAnimationOnLevelChange = false;
            this.springForce.m23671(50.0f / systemAnimatorDurationScale);
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
    public static DeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@InterfaceC6391 Context context, @InterfaceC6391 CircularProgressIndicatorSpec circularProgressIndicatorSpec, @InterfaceC6391 CircularDrawingDelegate circularDrawingDelegate) {
        return new DeterminateDrawable<>(context, circularProgressIndicatorSpec, circularDrawingDelegate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static DeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@InterfaceC6391 Context context, @InterfaceC6391 LinearProgressIndicatorSpec linearProgressIndicatorSpec, @InterfaceC6391 LinearDrawingDelegate linearDrawingDelegate) {
        return new DeterminateDrawable<>(context, linearProgressIndicatorSpec, linearDrawingDelegate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }
}
