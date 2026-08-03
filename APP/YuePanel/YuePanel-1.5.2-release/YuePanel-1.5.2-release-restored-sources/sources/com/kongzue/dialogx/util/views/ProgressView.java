package com.kongzue.dialogx.util.views;

import Yue.InterfaceC6490;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.ProgressViewInterface;
import com.kongzue.dialogx.util.DialogXValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public class ProgressView extends View implements ProgressViewInterface {
    public static long PROGRESSING_ANIMATOR_DURATION = 1000;
    public static final int STATUS_ERROR = 3;
    public static final int STATUS_LOADING = 0;
    public static final int STATUS_PROGRESSING = 4;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_WARNING = 2;
    public static long TIP_ANIMATOR_DURATION = 300;
    private float changeStatusAngle;
    private int color;
    private float currentRotateDegrees;
    private DialogXValueAnimator followAnimator;
    private float followRotateDegrees;
    private float halfSweepA;
    private float halfSweepAMaxValue;
    private float halfSweepAMinValue;
    private Interpolator interpolator;
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
    private float nowLoadingProgressEndAngle;
    private float nowLoadingProgressValue;
    private RectF oval;
    private DialogXValueAnimator rotateAnimator;
    private int status;
    private int successStep;
    private ValueAnimator tickAnimator;
    private float tickAnimatorValue;
    private Runnable tickShowRunnable;
    Runnable waitArticulationAnimationRunnable;
    private int width;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ProgressView(Context context) {
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
        init(null);
    }

    private long calculateMillisPerFrame(Context context) {
        float refreshRate = getRefreshRate(context);
        if (refreshRate > 0.0f) {
            return (long) (1000.0d / ((double) refreshRate));
        }
        return 16L;
    }

    private int dip2px(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    private void drawDoneMark(int i, Canvas canvas) {
        Interpolator interpolator = this.rotateAnimator.getInterpolator();
        Interpolator interpolator2 = this.interpolator;
        if (interpolator != interpolator2) {
            this.rotateAnimator.setInterpolator(interpolator2);
        }
        Runnable runnable = this.tickShowRunnable;
        if (runnable != null) {
            runnable.run();
            this.tickShowRunnable = null;
            if (DialogX.useHaptic) {
                if (i == 1) {
                    performHapticFeedback(3);
                } else if (i == 2) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.kongzue.dialogx.util.views.ProgressView.3
                        @Override // java.lang.Runnable
                        public void run() {
                            ProgressView.this.performHapticFeedback(0);
                        }
                    }, (long) (TIP_ANIMATOR_DURATION * 0.8f));
                } else if (i == 3) {
                    performHapticFeedback(3);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.kongzue.dialogx.util.views.ProgressView.4
                        @Override // java.lang.Runnable
                        public void run() {
                            ProgressView.this.performHapticFeedback(3);
                        }
                    }, (long) (TIP_ANIMATOR_DURATION * 0.5f));
                }
            }
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

    private float getRefreshRate(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay().getMode().getRefreshRate() : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
    }

    private void init(AttributeSet attributeSet) {
        synchronized (ProgressView.class) {
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
                    int iCalculateMillisPerFrame = (int) calculateMillisPerFrame(getContext());
                    this.halfSweepA = (this.halfSweepAMaxValue - this.halfSweepAMinValue) / 2.0f;
                    DialogXValueAnimator dialogXValueAnimatorOfFloat = DialogXValueAnimator.ofFloat(0.0f, 365.0f);
                    this.rotateAnimator = dialogXValueAnimatorOfFloat;
                    dialogXValueAnimatorOfFloat.setDuration(1000L);
                    this.rotateAnimator.setInterpolator(new LinearInterpolator());
                    this.rotateAnimator.setRepeatCount(-1);
                    this.rotateAnimator.setRefreshInterval(iCalculateMillisPerFrame);
                    this.rotateAnimator.addUpdateListener(new DialogXValueAnimator.ValueUpdateListener() { // from class: com.kongzue.dialogx.util.views.ProgressView.1
                        @Override // com.kongzue.dialogx.util.DialogXValueAnimator.ValueUpdateListener
                        public void onValueUpdate(float f) {
                            if (ProgressView.this.isAttachedToWindow()) {
                                ProgressView.this.currentRotateDegrees = f;
                                ProgressView.this.invalidate();
                            }
                        }
                    });
                    DialogXValueAnimator dialogXValueAnimatorOfFloat2 = DialogXValueAnimator.ofFloat(0.0f, 365.0f);
                    this.followAnimator = dialogXValueAnimatorOfFloat2;
                    dialogXValueAnimatorOfFloat2.setDuration(1500L);
                    this.followAnimator.setRefreshInterval(iCalculateMillisPerFrame);
                    this.followAnimator.setInterpolator(new LinearInterpolator());
                    this.followAnimator.setRepeatCount(-1);
                    this.followAnimator.addUpdateListener(new DialogXValueAnimator.ValueUpdateListener() { // from class: com.kongzue.dialogx.util.views.ProgressView.2
                        @Override // com.kongzue.dialogx.util.DialogXValueAnimator.ValueUpdateListener
                        public void onValueUpdate(float f) {
                            ProgressView.this.followRotateDegrees = f;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void initTipAnimator(int i, Interpolator interpolator) {
        this.interpolator = interpolator;
        this.status = i;
        if (this.successStep == 0) {
            this.waitArticulationAnimationRunnable = new Runnable() { // from class: com.kongzue.dialogx.util.views.ProgressView.8
                @Override // java.lang.Runnable
                public void run() {
                    ProgressView progressView = ProgressView.this;
                    progressView.initTipAnimator(progressView.status, ProgressView.this.interpolator);
                }
            };
            return;
        }
        ValueAnimator valueAnimator = this.tickAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.tickAnimator = null;
        }
        this.tickAnimatorValue = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.tickAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(TIP_ANIMATOR_DURATION);
        this.tickAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.util.views.ProgressView.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProgressView.this.tickAnimatorValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ProgressView.this.invalidate();
            }
        });
        this.tickAnimator.start();
    }

    private void showErrorTick(Canvas canvas) {
        float f = this.mCenterY;
        float f2 = this.mRadius;
        int i = (int) (f - ((f2 * 4.0f) / 10.0f));
        int i2 = (int) (this.mCenterX + ((f2 * 4.0f) / 10.0f));
        float f3 = this.tickAnimatorValue;
        if (f3 < 0.5f) {
            float f4 = i;
            float f5 = i2 - i;
            int i3 = (int) ((f3 * 2.0f * f5) + f4);
            this.line1X = i3;
            int i4 = (int) ((f3 * 2.0f * f5) + f4);
            this.line1Y = i4;
            canvas.drawLine(f4, f4, i3, i4, this.mPaint);
            return;
        }
        float f6 = i;
        float f7 = i2 - i;
        this.line1X = (int) ((f3 * 2.0f * f7) + f6);
        this.line1Y = (int) ((f3 * 2.0f * f7) + f6);
        float f8 = i2;
        canvas.drawLine(f6, f6, f8, f8, this.mPaint);
        float f9 = this.tickAnimatorValue;
        int i5 = (int) (f8 - (((f9 - 0.5f) * 2.0f) * f7));
        this.line2X = i5;
        int i6 = (int) (((f9 - 0.5f) * 2.0f * f7) + f6);
        this.line2Y = i6;
        canvas.drawLine(f8, f6, i5, i6, this.mPaint);
    }

    private void showSuccessTick(Canvas canvas) {
        float f = this.mRadius;
        float f2 = this.mCenterX;
        float f3 = (int) (f / 20.0f);
        int i = (int) ((f2 - (f / 10.0f)) - f3);
        int i2 = (int) (f2 - (f / 2.0f));
        int i3 = (int) (this.mCenterY + f3);
        int i4 = (int) (f2 + (f / 2.0f));
        float f4 = i2;
        int i5 = (int) (((i4 - i2) * this.tickAnimatorValue) + f4);
        Path path = new Path();
        path.moveTo(f4, i3);
        if (i5 < i) {
            this.line1X = i5;
            int i6 = i3 + (i5 - i2);
            this.line1Y = i6;
            path.lineTo(i5, i6);
        } else {
            this.line1X = i;
            int i7 = i3 + (i - i2);
            this.line1Y = i7;
            path.lineTo(i, i7);
            this.line2X = i5;
            int i8 = this.line1Y - (i5 - this.line1X);
            this.line2Y = i8;
            path.lineTo(i5, i8);
        }
        canvas.drawPath(path, this.mPaint);
    }

    private void showWarningTick(Canvas canvas) {
        int i = (int) this.mCenterX;
        float f = this.mCenterY;
        float f2 = this.mRadius;
        int i2 = (int) (f - ((f2 * 1.0f) / 2.0f));
        int i3 = (int) (((1.0f * f2) / 8.0f) + f);
        int i4 = (int) (f + ((f2 * 3.0f) / 7.0f));
        float f3 = this.tickAnimatorValue;
        if (f3 < 0.9f) {
            float f4 = i;
            float f5 = i2;
            canvas.drawLine(f4, f5, f4, f5 + ((i3 - i2) * f3), this.mPaint);
        } else {
            float f6 = i;
            canvas.drawLine(f6, i2, f6, i3, this.mPaint);
            canvas.drawLine(f6, i4, f6, i4 + 1, this.mPaint);
        }
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void error() {
        int i = this.status;
        if (i == 3) {
            return;
        }
        if (i != 4) {
            initTipAnimator(3, new DecelerateInterpolator(2.0f));
        } else {
            progress(1.0f);
            this.waitArticulationAnimationRunnable = new Runnable() { // from class: com.kongzue.dialogx.util.views.ProgressView.7
                @Override // java.lang.Runnable
                public void run() {
                    ProgressView.this.initTipAnimator(3, new DecelerateInterpolator(2.0f));
                }
            };
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
        if (this.status == 0) {
            return;
        }
        this.noShowLoading = false;
        this.successStep = 0;
        this.line1X = 0;
        this.line1Y = 0;
        this.line2X = 0;
        this.line2Y = 0;
        this.status = 0;
        DialogXValueAnimator dialogXValueAnimator = this.rotateAnimator;
        if (dialogXValueAnimator != null) {
            dialogXValueAnimator.cancel();
        }
        DialogXValueAnimator dialogXValueAnimator2 = this.followAnimator;
        if (dialogXValueAnimator2 != null) {
            dialogXValueAnimator2.cancel();
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
        DialogXValueAnimator dialogXValueAnimator = this.rotateAnimator;
        if (dialogXValueAnimator != null) {
            dialogXValueAnimator.cancel();
        }
        DialogXValueAnimator dialogXValueAnimator2 = this.followAnimator;
        if (dialogXValueAnimator2 != null) {
            dialogXValueAnimator2.cancel();
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
        int i = this.status;
        if (i == 0) {
            float fSin = ((float) (((double) this.halfSweepA) * Math.sin(Math.toRadians(this.followRotateDegrees)))) + this.halfSweepA + (this.halfSweepAMinValue / 2.0f);
            float f = this.currentRotateDegrees;
            float f2 = f - fSin;
            this.nowLoadingProgressValue = f2;
            if (f2 < 0.0f) {
                this.nowLoadingProgressValue = f2 + 360.0f;
            }
            this.nowLoadingProgressEndAngle = fSin;
            this.changeStatusAngle = fSin < 0.0f ? 360.0f - fSin : fSin;
            canvas.drawArc(this.oval, f, -fSin, false, this.mPaint);
            return;
        }
        if (i == 1 || i == 2 || i == 3) {
            int i2 = this.successStep;
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                canvas.drawArc(this.oval, 0.0f, 360.0f, false, this.mPaint);
                drawDoneMark(this.status, canvas);
                return;
            }
            float f3 = this.nowLoadingProgressEndAngle + 5.0f;
            this.nowLoadingProgressEndAngle = f3;
            canvas.drawArc(this.oval, this.nowLoadingProgressValue, f3, false, this.mPaint);
            if (this.nowLoadingProgressEndAngle - (360.0f - this.changeStatusAngle) >= this.nowLoadingProgressValue) {
                this.successStep = 1;
                Runnable runnable = this.waitArticulationAnimationRunnable;
                if (runnable != null) {
                    runnable.run();
                    this.waitArticulationAnimationRunnable = null;
                    return;
                }
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        int i3 = this.successStep;
        if (i3 != 0) {
            if (i3 != 1) {
                return;
            }
            canvas.drawArc(this.oval, 0.0f, 360.0f, false, this.mPaint);
            drawDoneMark(this.status, canvas);
            return;
        }
        canvas.drawArc(this.oval, -90.0f, this.currentRotateDegrees, false, this.mPaint);
        if (this.currentRotateDegrees == 365.0f) {
            this.successStep = 1;
            Runnable runnable2 = this.waitArticulationAnimationRunnable;
            if (runnable2 != null) {
                runnable2.run();
                this.waitArticulationAnimationRunnable = null;
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
        DialogXValueAnimator dialogXValueAnimator = this.rotateAnimator;
        if (dialogXValueAnimator != null) {
            dialogXValueAnimator.cancel();
        }
        DialogXValueAnimator dialogXValueAnimator2 = this.followAnimator;
        if (dialogXValueAnimator2 != null) {
            dialogXValueAnimator2.cancel();
        }
        if (this.status != 4) {
            this.currentRotateDegrees = 0.0f;
        }
        this.noShowLoading = false;
        this.status = 4;
        DialogXValueAnimator dialogXValueAnimatorOfFloat = DialogXValueAnimator.ofFloat(this.currentRotateDegrees, f * 365.0f);
        this.rotateAnimator = dialogXValueAnimatorOfFloat;
        dialogXValueAnimatorOfFloat.setDuration(PROGRESSING_ANIMATOR_DURATION);
        this.rotateAnimator.setInterpolator(new DecelerateInterpolator(2.0f));
        this.rotateAnimator.setRepeatCount(0);
        this.rotateAnimator.addUpdateListener(new DialogXValueAnimator.ValueUpdateListener() { // from class: com.kongzue.dialogx.util.views.ProgressView.10
            @Override // com.kongzue.dialogx.util.DialogXValueAnimator.ValueUpdateListener
            public void onValueUpdate(float f2) {
                ProgressView.this.currentRotateDegrees = f2;
                ProgressView.this.invalidate();
            }
        });
        this.rotateAnimator.start();
    }

    public ProgressView setStrokeWidth(int i) {
        this.width = i;
        Paint paint = this.mPaint;
        if (paint != null) {
            paint.setStrokeWidth(i);
        }
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void success() {
        int i = this.status;
        if (i == 1) {
            return;
        }
        if (i != 4) {
            initTipAnimator(1, new AccelerateDecelerateInterpolator());
        } else {
            progress(1.0f);
            this.waitArticulationAnimationRunnable = new Runnable() { // from class: com.kongzue.dialogx.util.views.ProgressView.5
                @Override // java.lang.Runnable
                public void run() {
                    ProgressView.this.initTipAnimator(1, new AccelerateDecelerateInterpolator());
                }
            };
        }
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void warning() {
        int i = this.status;
        if (i == 2) {
            return;
        }
        if (i != 4) {
            initTipAnimator(2, new AccelerateInterpolator(2.0f));
        } else {
            progress(1.0f);
            this.waitArticulationAnimationRunnable = new Runnable() { // from class: com.kongzue.dialogx.util.views.ProgressView.6
                @Override // java.lang.Runnable
                public void run() {
                    ProgressView.this.initTipAnimator(2, new AccelerateInterpolator(2.0f));
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setColor(I)Lcom/kongzue/dialogx/interfaces/ProgressViewInterface; */
    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public ProgressView setColor(int i) {
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
    public ProgressView whenShowTick(Runnable runnable) {
        this.tickShowRunnable = runnable;
        return this;
    }

    public ProgressView(Context context, @InterfaceC6490 AttributeSet attributeSet) {
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
        init(attributeSet);
    }

    public ProgressView(Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
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
        init(attributeSet);
    }
}
