package com.p001mr.elaris;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
class InAppSettingsToggleView extends View {
    private static final long TOGGLE_ANIMATION_MS = 170;
    private ValueAnimator checkAnimator;
    private boolean checked;
    private final Paint paint;
    private final InAppSettings settings;
    private final RectF strokeBounds;
    private float thumbFraction;
    private final RectF trackBounds;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InAppSettingsToggleView(InAppSettings inAppSettings, Context context) {
        super(context);
        this.trackBounds = new RectF();
        this.strokeBounds = new RectF();
        this.settings = inAppSettings;
        Paint paint = new Paint(1);
        this.paint = paint;
        setLayerType(1, paint);
        setWillNotDraw(false);
        setVisibility(0);
        setAlpha(1.0f);
        setFocusable(false);
        setClickable(false);
        setMinimumWidth(inAppSettings.m139dp(40.0f));
        setMinimumHeight(inAppSettings.m139dp(22.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int blendColor(int i, int i2, float f) {
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        return Color.argb((int) (((Color.alpha(i2) - Color.alpha(i)) * fMax) + Color.alpha(i)), (int) (((Color.red(i2) - Color.red(i)) * fMax) + Color.red(i)), (int) (((Color.green(i2) - Color.green(i)) * fMax) + Color.green(i)), (int) (((Color.blue(i2) - Color.blue(i)) * fMax) + Color.blue(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void cancelCheckAnimator() {
        ValueAnimator valueAnimator = this.checkAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.checkAnimator = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int offTrackColor() {
        return this.settings.isDarkUi() ? InAppSettings.toggleOffBackgroundColor() : InAppSettingsSecondaryStyle.SWITCH_OFF_COLOR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int onTrackColor() {
        return InAppSettings.BLUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isChecked() {
        return this.checked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void onDetachedFromWindow() {
        cancelCheckAnimator();
        super.onDetachedFromWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = height / 2.0f;
        int iBlendColor = blendColor(offTrackColor(), onTrackColor(), this.thumbFraction);
        Paint paint = this.paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.paint.setColor(iBlendColor);
        this.trackBounds.set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(this.trackBounds, f, f, this.paint);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.settings.m139dp(1.0f));
        this.paint.setColor(iBlendColor);
        float fM139dp = this.settings.m139dp(0.5f);
        this.strokeBounds.set(fM139dp, fM139dp, width - fM139dp, height - fM139dp);
        canvas.drawRoundRect(this.strokeBounds, f, f, this.paint);
        float f2 = (((width - f) - f) * this.thumbFraction) + f;
        this.paint.setStyle(style);
        this.paint.setColor(-1);
        this.paint.setShadowLayer(this.settings.m139dp(1.0f), 0.0f, this.settings.m139dp(0.5f), Color.argb(20, 80, 86, 96));
        canvas.drawCircle(f2, f, this.settings.m139dp(17.0f) / 2.0f, this.paint);
        this.paint.clearShadowLayer();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(Math.max(this.settings.m139dp(40.0f), getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(this.settings.m139dp(22.0f), getSuggestedMinimumHeight()), i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChecked(boolean z) {
        if (this.checked == z) {
            return;
        }
        this.checked = z;
        float f = z ? 1.0f : 0.0f;
        if (getWindowToken() == null) {
            cancelCheckAnimator();
            this.thumbFraction = f;
            invalidate();
            return;
        }
        cancelCheckAnimator();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.thumbFraction, f);
        valueAnimatorOfFloat.setDuration(TOGGLE_ANIMATION_MS);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mr.elaris.InAppSettingsToggleView.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                InAppSettingsToggleView.this.thumbFraction = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                InAppSettingsToggleView.this.invalidate();
            }
        });
        valueAnimatorOfFloat.start();
        this.checkAnimator = valueAnimatorOfFloat;
    }
}
