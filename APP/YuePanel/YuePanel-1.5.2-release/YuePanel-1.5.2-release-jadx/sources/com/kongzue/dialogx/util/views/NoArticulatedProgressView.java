package com.kongzue.dialogx.util.views;

import Yue.InterfaceC6490;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.ProgressViewInterface;

/* JADX INFO: loaded from: classes2.dex */
public class NoArticulatedProgressView extends View implements ProgressViewInterface {
    public static final int STATUS_ERROR = 3;
    public static final int STATUS_LOADING = 0;
    public static final int STATUS_PROGRESSING = 4;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_WARNING = 2;
    private int color;
    private float currentRotateDegrees;
    private ValueAnimator followAnimator;
    private float followRotateDegrees;
    private float halfSweepA;
    private float halfSweepAMaxValue;
    private float halfSweepAMinValue;
    private TimeInterpolator interpolator;
    private boolean isInited;
    private int line1X;
    private int line1Y;
    private int line2X;
    private int line2Y;
    private float mCenterX;
    private float mCenterY;
    Paint mPaint;
    private float mRadius;
    private boolean noShowLoading;
    protected float oldAnimAngle;
    private RectF oval;
    private ValueAnimator rotateAnimator;
    private int status;
    private int successStep;
    private Runnable tickShowRunnable;
    private int tickStep;
    private Runnable waitProgressingRunnable;
    private int width;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NoArticulatedProgressView(Context context) {
        super(context);
        this.status = 0;
        this.width = dip2px(2.0f);
        this.color = -1;
        this.halfSweepAMaxValue = 180.0f;
        this.halfSweepAMinValue = 80.0f;
        this.mPaint = new Paint();
        this.isInited = false;
        this.mRadius = 100.0f;
        this.successStep = 0;
        this.line1X = 0;
        this.line1Y = 0;
        this.line2X = 0;
        this.line2Y = 0;
        this.tickStep = 0;
        init(null);
    }

    private int dip2px(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    private void drawDoneMark(int i, Canvas canvas) {
        TimeInterpolator interpolator = this.rotateAnimator.getInterpolator();
        TimeInterpolator timeInterpolator = this.interpolator;
        if (interpolator != timeInterpolator) {
            this.rotateAnimator.setInterpolator(timeInterpolator);
        }
        Runnable runnable = this.tickShowRunnable;
        if (runnable != null) {
            runnable.run();
            if (DialogX.useHaptic) {
                performHapticFeedback(0);
            }
            this.tickShowRunnable = null;
        }
        if (i == 1) {
            showSuccessTick(canvas);
        } else if (i == 2) {
            showWarningTick(canvas);
        } else {
            if (i != 3) {
                return;
            }
            showErrorTick(canvas);
        }
    }

    private void init(AttributeSet attributeSet) {
        synchronized (NoArticulatedProgressView.class) {
            try {
                if (this.isInited) {
                    return;
                }
                this.isInited = true;
                if (attributeSet != null) {
                    TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2413R.styleable.ProgressView);
                    this.width = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2413R.styleable.ProgressView_progressStrokeWidth, dip2px(2.0f));
                    this.color = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2413R.styleable.ProgressView_progressStrokeColor, this.color);
                    typedArrayObtainStyledAttributes.recycle();
                }
                this.mPaint.setAntiAlias(true);
                this.mPaint.setStyle(Paint.Style.STROKE);
                this.mPaint.setStrokeWidth(this.width);
                this.mPaint.setStrokeCap(Paint.Cap.ROUND);
                this.mPaint.setColor(this.color);
                if (!isInEditMode()) {
                    this.halfSweepA = (this.halfSweepAMaxValue - this.halfSweepAMinValue) / 2.0f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 365.0f);
                    this.rotateAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.setDuration(1000L);
                    this.rotateAnimator.setInterpolator(new LinearInterpolator());
                    this.rotateAnimator.setRepeatCount(-1);
                    this.rotateAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.util.views.NoArticulatedProgressView.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            NoArticulatedProgressView.this.currentRotateDegrees = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            NoArticulatedProgressView.this.invalidate();
                        }
                    });
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 365.0f);
                    this.followAnimator = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.setDuration(1500L);
                    this.followAnimator.setInterpolator(new LinearInterpolator());
                    this.followAnimator.setRepeatCount(-1);
                    this.followAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.util.views.NoArticulatedProgressView.2
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            NoArticulatedProgressView.this.followRotateDegrees = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        }
                    });
                    this.followAnimator.start();
                    this.rotateAnimator.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void showErrorTick(Canvas canvas) {
        float f = this.mCenterX;
        float f2 = this.mRadius;
        int i = (int) (f - ((f2 * 4.0f) / 10.0f));
        int i2 = (int) (f + ((f2 * 4.0f) / 10.0f));
        int i3 = (int) (this.mCenterY - ((f2 * 4.0f) / 10.0f));
        int i4 = this.tickStep;
        if (i4 == 0) {
            int i5 = this.line1X;
            if (i2 - i5 <= i) {
                this.tickStep = 1;
                canvas.drawLine(i2, i3, i2 - i5, i3 + this.line1Y, this.mPaint);
                postInvalidateDelayed(150L);
                return;
            }
            this.line1X = i5 + 4;
            this.line1Y += 4;
        } else if (i4 == 1) {
            int i6 = this.line2X;
            if (i + i6 < i2) {
                this.line2X = i6 + 4;
                this.line2Y += 4;
            }
            canvas.drawLine(i, i3, i + this.line2X, this.line2Y + i3, this.mPaint);
        }
        canvas.drawLine(i2, i3, i2 - this.line1X, i3 + this.line1Y, this.mPaint);
        postInvalidateDelayed(1L);
    }

    private void showSuccessTick(Canvas canvas) {
        int i;
        float f = this.mCenterX;
        float f2 = this.mRadius;
        int i2 = (int) (f - ((1.0f * f2) / 2.0f));
        int i3 = (int) (f - (f2 / 10.0f));
        int i4 = (int) (f2 * 0.99f);
        int i5 = this.tickStep;
        if (i5 == 0) {
            int i6 = this.line1X;
            if (i2 + i6 < i3) {
                this.line1X = i6 + 2;
                this.line1Y += 2;
            } else {
                this.line2X = i6;
                this.line2Y = this.line1Y;
                this.tickStep = 1;
            }
        } else if (i5 == 1 && (i = this.line2X) < i4) {
            this.line2X = i + 4;
            this.line2Y -= 5;
        }
        float f3 = this.mCenterY;
        canvas.drawLine(i2, f3, this.line1X + i2, f3 + this.line1Y, this.mPaint);
        float f4 = this.line1X + i2;
        float f5 = this.mCenterY;
        canvas.drawLine(f4, f5 + this.line1Y, i2 + this.line2X, f5 + this.line2Y, this.mPaint);
        postInvalidateDelayed(1L);
    }

    private void showWarningTick(Canvas canvas) {
        int i = (int) this.mCenterX;
        float f = this.mCenterY;
        float f2 = this.mRadius;
        int i2 = (int) (f - ((f2 * 1.0f) / 2.0f));
        int i3 = (int) (((1.0f * f2) / 8.0f) + f);
        int i4 = (int) (f + ((f2 * 3.0f) / 7.0f));
        int i5 = this.tickStep;
        if (i5 == 0) {
            int i6 = this.line1Y;
            int i7 = i3 - i2;
            if (i6 < i7) {
                this.line1Y = i6 + 4;
            } else {
                this.line1Y = i7;
                this.tickStep = 1;
            }
        } else if (i5 == 1 && this.line2Y != i4) {
            float f3 = i;
            canvas.drawLine(f3, i4, f3, i4 + 1, this.mPaint);
        }
        float f4 = i;
        canvas.drawLine(f4, i2, f4, i2 + this.line1Y, this.mPaint);
        postInvalidateDelayed(this.tickStep == 1 ? 100L : 1L);
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void error() {
        if (this.status == 4) {
            progress(1.0f);
            this.waitProgressingRunnable = new Runnable() { // from class: com.kongzue.dialogx.util.views.NoArticulatedProgressView.5
                @Override // java.lang.Runnable
                public void run() {
                    NoArticulatedProgressView.this.tickStep = 0;
                    NoArticulatedProgressView.this.successStep = 2;
                    NoArticulatedProgressView.this.interpolator = new DecelerateInterpolator(2.0f);
                    NoArticulatedProgressView.this.status = 3;
                }
            };
        } else {
            this.tickStep = 0;
            this.interpolator = new DecelerateInterpolator(2.0f);
            this.status = 3;
            invalidate();
        }
    }

    public int getColor() {
        return this.color;
    }

    public int getStatus() {
        return this.status;
    }

    public int getStrokeWidth() {
        return this.width;
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void loading() {
        this.noShowLoading = false;
        this.oldAnimAngle = 0.0f;
        this.successStep = 0;
        this.line1X = 0;
        this.line1Y = 0;
        this.line2X = 0;
        this.line2Y = 0;
        this.status = 0;
        ValueAnimator valueAnimator = this.rotateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.followAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.isInited = false;
        init(null);
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void noLoading() {
        this.noShowLoading = true;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.rotateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.followAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawArc(this.oval, 0.0f, 365.0f, false, this.mPaint);
            return;
        }
        if (this.noShowLoading) {
            canvas.drawArc(this.oval, 0.0f, 365.0f, false, this.mPaint);
            this.successStep = 2;
            drawDoneMark(this.status, canvas);
            return;
        }
        float fSin = ((float) (((double) this.halfSweepA) * Math.sin(Math.toRadians(this.followRotateDegrees)))) + this.halfSweepA + (this.halfSweepAMinValue / 2.0f);
        int i = this.status;
        if (i == 0) {
            canvas.drawArc(this.oval, this.currentRotateDegrees, -fSin, false, this.mPaint);
            return;
        }
        if (i == 1 || i == 2 || i == 3) {
            canvas.drawArc(this.oval, 0.0f, 360.0f, false, this.mPaint);
            drawDoneMark(this.status, canvas);
        } else {
            if (i != 4) {
                return;
            }
            canvas.drawArc(this.oval, -90.0f, this.currentRotateDegrees, false, this.mPaint);
            Runnable runnable = this.waitProgressingRunnable;
            if (runnable != null) {
                runnable.run();
                this.waitProgressingRunnable = null;
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mCenterX = (i * 1.0f) / 2.0f;
        this.mCenterY = (i2 * 1.0f) / 2.0f;
        this.mRadius = (Math.min(getWidth(), getHeight()) / 2) - (this.width / 2);
        float f = this.mCenterX;
        float f2 = this.mRadius;
        float f3 = this.mCenterY;
        this.oval = new RectF(f - f2, f3 - f2, f + f2, f3 + f2);
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void progress(float f) {
        ValueAnimator valueAnimator = this.rotateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.followAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        if (this.status != 4) {
            this.currentRotateDegrees = 0.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.currentRotateDegrees, f * 365.0f);
        this.rotateAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1000L);
        this.rotateAnimator.setInterpolator(new DecelerateInterpolator(2.0f));
        this.rotateAnimator.setRepeatCount(0);
        this.rotateAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.util.views.NoArticulatedProgressView.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                NoArticulatedProgressView.this.currentRotateDegrees = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                NoArticulatedProgressView.this.invalidate();
            }
        });
        this.rotateAnimator.start();
        this.status = 4;
    }

    public NoArticulatedProgressView setStrokeWidth(int i) {
        this.width = i;
        Paint paint = this.mPaint;
        if (paint != null) {
            paint.setStrokeWidth(i);
        }
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void success() {
        if (this.status == 4) {
            progress(1.0f);
            this.waitProgressingRunnable = new Runnable() { // from class: com.kongzue.dialogx.util.views.NoArticulatedProgressView.3
                @Override // java.lang.Runnable
                public void run() {
                    NoArticulatedProgressView.this.tickStep = 0;
                    NoArticulatedProgressView.this.successStep = 2;
                    NoArticulatedProgressView.this.interpolator = new AccelerateDecelerateInterpolator();
                    NoArticulatedProgressView.this.status = 1;
                }
            };
        } else {
            this.tickStep = 0;
            this.interpolator = new AccelerateDecelerateInterpolator();
            this.status = 1;
            invalidate();
        }
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void warning() {
        if (this.status == 4) {
            progress(1.0f);
            this.waitProgressingRunnable = new Runnable() { // from class: com.kongzue.dialogx.util.views.NoArticulatedProgressView.4
                @Override // java.lang.Runnable
                public void run() {
                    NoArticulatedProgressView.this.tickStep = 0;
                    NoArticulatedProgressView.this.successStep = 2;
                    NoArticulatedProgressView.this.interpolator = new DecelerateInterpolator(2.0f);
                    NoArticulatedProgressView.this.status = 2;
                }
            };
        } else {
            this.tickStep = 0;
            this.interpolator = new DecelerateInterpolator(2.0f);
            this.status = 2;
            invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setColor(I)Lcom/kongzue/dialogx/interfaces/ProgressViewInterface; */
    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public NoArticulatedProgressView setColor(int i) {
        this.color = i;
        Paint paint = this.mPaint;
        if (paint != null) {
            paint.setColor(i);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: whenShowTick(Ljava/lang/Runnable;)Lcom/kongzue/dialogx/interfaces/ProgressViewInterface; */
    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public NoArticulatedProgressView whenShowTick(Runnable runnable) {
        this.tickShowRunnable = runnable;
        return this;
    }

    public NoArticulatedProgressView(Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.status = 0;
        this.width = dip2px(2.0f);
        this.color = -1;
        this.halfSweepAMaxValue = 180.0f;
        this.halfSweepAMinValue = 80.0f;
        this.mPaint = new Paint();
        this.isInited = false;
        this.mRadius = 100.0f;
        this.successStep = 0;
        this.line1X = 0;
        this.line1Y = 0;
        this.line2X = 0;
        this.line2Y = 0;
        this.tickStep = 0;
        init(attributeSet);
    }

    public NoArticulatedProgressView(Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.status = 0;
        this.width = dip2px(2.0f);
        this.color = -1;
        this.halfSweepAMaxValue = 180.0f;
        this.halfSweepAMinValue = 80.0f;
        this.mPaint = new Paint();
        this.isInited = false;
        this.mRadius = 100.0f;
        this.successStep = 0;
        this.line1X = 0;
        this.line1Y = 0;
        this.line2X = 0;
        this.line2Y = 0;
        this.tickStep = 0;
        init(attributeSet);
    }

    public NoArticulatedProgressView(Context context, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.status = 0;
        this.width = dip2px(2.0f);
        this.color = -1;
        this.halfSweepAMaxValue = 180.0f;
        this.halfSweepAMinValue = 80.0f;
        this.mPaint = new Paint();
        this.isInited = false;
        this.mRadius = 100.0f;
        this.successStep = 0;
        this.line1X = 0;
        this.line1Y = 0;
        this.line2X = 0;
        this.line2Y = 0;
        this.tickStep = 0;
        init(attributeSet);
    }
}
