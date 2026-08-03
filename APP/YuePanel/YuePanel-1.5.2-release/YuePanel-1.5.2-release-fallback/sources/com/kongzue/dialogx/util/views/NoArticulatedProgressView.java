package com.kongzue.dialogx.util.views;

/* JADX INFO: loaded from: classes2.dex */
public class NoArticulatedProgressView extends android.view.View implements com.kongzue.dialogx.interfaces.ProgressViewInterface {
    public static final int STATUS_ERROR = 3;
    public static final int STATUS_LOADING = 0;
    public static final int STATUS_PROGRESSING = 4;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_WARNING = 2;
    private int color;
    private float currentRotateDegrees;
    private android.animation.ValueAnimator followAnimator;
    private float followRotateDegrees;
    private float halfSweepA;
    private float halfSweepAMaxValue;
    private float halfSweepAMinValue;
    private android.animation.TimeInterpolator interpolator;
    private boolean isInited;
    private int line1X;
    private int line1Y;
    private int line2X;
    private int line2Y;
    private float mCenterX;
    private float mCenterY;
    android.graphics.Paint mPaint;
    private float mRadius;
    private boolean noShowLoading;
    protected float oldAnimAngle;
    private android.graphics.RectF oval;
    private android.animation.ValueAnimator rotateAnimator;
    private int status;
    private int successStep;
    private java.lang.Runnable tickShowRunnable;
    private int tickStep;
    private java.lang.Runnable waitProgressingRunnable;
    private int width;







    public NoArticulatedProgressView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.status = r2
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = r1.dip2px(r0)
            r1.width = r0
            r0 = -1
            r1.color = r0
            r0 = 1127481344(0x43340000, float:180.0)
            r1.halfSweepAMaxValue = r0
            r0 = 1117782016(0x42a00000, float:80.0)
            r1.halfSweepAMinValue = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.mPaint = r0
            r1.isInited = r2
            r0 = 1120403456(0x42c80000, float:100.0)
            r1.mRadius = r0
            r1.successStep = r2
            r1.line1X = r2
            r1.line1Y = r2
            r1.line2X = r2
            r1.line2Y = r2
            r1.tickStep = r2
            r2 = 0
            r1.init(r2)
            return
    }

    public NoArticulatedProgressView(android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 0
            r1.status = r2
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = r1.dip2px(r0)
            r1.width = r0
            r0 = -1
            r1.color = r0
            r0 = 1127481344(0x43340000, float:180.0)
            r1.halfSweepAMaxValue = r0
            r0 = 1117782016(0x42a00000, float:80.0)
            r1.halfSweepAMinValue = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.mPaint = r0
            r1.isInited = r2
            r0 = 1120403456(0x42c80000, float:100.0)
            r1.mRadius = r0
            r1.successStep = r2
            r1.line1X = r2
            r1.line1Y = r2
            r1.line2X = r2
            r1.line2Y = r2
            r1.tickStep = r2
            r1.init(r3)
            return
    }

    public NoArticulatedProgressView(android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.status = r1
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = r0.dip2px(r3)
            r0.width = r3
            r3 = -1
            r0.color = r3
            r3 = 1127481344(0x43340000, float:180.0)
            r0.halfSweepAMaxValue = r3
            r3 = 1117782016(0x42a00000, float:80.0)
            r0.halfSweepAMinValue = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r0.mPaint = r3
            r0.isInited = r1
            r3 = 1120403456(0x42c80000, float:100.0)
            r0.mRadius = r3
            r0.successStep = r1
            r0.line1X = r1
            r0.line1Y = r1
            r0.line2X = r1
            r0.line2Y = r1
            r0.tickStep = r1
            r0.init(r2)
            return
    }

    public NoArticulatedProgressView(android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = 0
            r0.status = r1
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = r0.dip2px(r3)
            r0.width = r3
            r3 = -1
            r0.color = r3
            r3 = 1127481344(0x43340000, float:180.0)
            r0.halfSweepAMaxValue = r3
            r3 = 1117782016(0x42a00000, float:80.0)
            r0.halfSweepAMinValue = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r0.mPaint = r3
            r0.isInited = r1
            r3 = 1120403456(0x42c80000, float:100.0)
            r0.mRadius = r3
            r0.successStep = r1
            r0.line1X = r1
            r0.line1Y = r1
            r0.line2X = r1
            r0.line2Y = r1
            r0.tickStep = r1
            r0.init(r2)
            return
    }

    public static /* synthetic */ float access$002(com.kongzue.dialogx.util.views.NoArticulatedProgressView r0, float r1) {
            r0.currentRotateDegrees = r1
            return r1
    }

    public static /* synthetic */ float access$102(com.kongzue.dialogx.util.views.NoArticulatedProgressView r0, float r1) {
            r0.followRotateDegrees = r1
            return r1
    }

    public static /* synthetic */ int access$202(com.kongzue.dialogx.util.views.NoArticulatedProgressView r0, int r1) {
            r0.tickStep = r1
            return r1
    }

    public static /* synthetic */ int access$302(com.kongzue.dialogx.util.views.NoArticulatedProgressView r0, int r1) {
            r0.successStep = r1
            return r1
    }

    public static /* synthetic */ android.animation.TimeInterpolator access$402(com.kongzue.dialogx.util.views.NoArticulatedProgressView r0, android.animation.TimeInterpolator r1) {
            r0.interpolator = r1
            return r1
    }

    public static /* synthetic */ int access$502(com.kongzue.dialogx.util.views.NoArticulatedProgressView r0, int r1) {
            r0.status = r1
            return r1
    }

    private int dip2px(float r2) {
            r1 = this;
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    private void drawDoneMark(int r3, android.graphics.Canvas r4) {
            r2 = this;
            android.animation.ValueAnimator r0 = r2.rotateAnimator
            android.animation.TimeInterpolator r0 = r0.getInterpolator()
            android.animation.TimeInterpolator r1 = r2.interpolator
            if (r0 == r1) goto Lf
            android.animation.ValueAnimator r0 = r2.rotateAnimator
            r0.setInterpolator(r1)
        Lf:
            java.lang.Runnable r0 = r2.tickShowRunnable
            if (r0 == 0) goto L21
            r0.run()
            boolean r0 = com.kongzue.dialogx.DialogX.useHaptic
            if (r0 == 0) goto L1e
            r0 = 0
            r2.performHapticFeedback(r0)
        L1e:
            r0 = 0
            r2.tickShowRunnable = r0
        L21:
            r0 = 1
            if (r3 == r0) goto L33
            r0 = 2
            if (r3 == r0) goto L2f
            r0 = 3
            if (r3 == r0) goto L2b
            goto L36
        L2b:
            r2.showErrorTick(r4)
            goto L36
        L2f:
            r2.showWarningTick(r4)
            goto L36
        L33:
            r2.showSuccessTick(r4)
        L36:
            return
    }

    private void init(android.util.AttributeSet r7) {
            r6 = this;
            r0 = 2
            java.lang.Class<com.kongzue.dialogx.util.views.NoArticulatedProgressView> r1 = com.kongzue.dialogx.util.views.NoArticulatedProgressView.class
            monitor-enter(r1)
            boolean r2 = r6.isInited     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return
        La:
            r7 = move-exception
            goto Lc6
        Ld:
            r2 = 1
            r6.isInited = r2     // Catch: java.lang.Throwable -> La
            r3 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L37
            android.content.Context r4 = r6.getContext()     // Catch: java.lang.Throwable -> La
            int[] r5 = com.kongzue.dialogx.R.styleable.ProgressView     // Catch: java.lang.Throwable -> La
            android.content.res.TypedArray r7 = r4.obtainStyledAttributes(r7, r5)     // Catch: java.lang.Throwable -> La
            int r4 = com.kongzue.dialogx.R.styleable.ProgressView_progressStrokeWidth     // Catch: java.lang.Throwable -> La
            int r5 = r6.dip2px(r3)     // Catch: java.lang.Throwable -> La
            int r4 = r7.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Throwable -> La
            r6.width = r4     // Catch: java.lang.Throwable -> La
            int r4 = com.kongzue.dialogx.R.styleable.ProgressView_progressStrokeColor     // Catch: java.lang.Throwable -> La
            int r5 = r6.color     // Catch: java.lang.Throwable -> La
            int r4 = r7.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Throwable -> La
            r6.color = r4     // Catch: java.lang.Throwable -> La
            r7.recycle()     // Catch: java.lang.Throwable -> La
        L37:
            android.graphics.Paint r7 = r6.mPaint     // Catch: java.lang.Throwable -> La
            r7.setAntiAlias(r2)     // Catch: java.lang.Throwable -> La
            android.graphics.Paint r7 = r6.mPaint     // Catch: java.lang.Throwable -> La
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE     // Catch: java.lang.Throwable -> La
            r7.setStyle(r2)     // Catch: java.lang.Throwable -> La
            android.graphics.Paint r7 = r6.mPaint     // Catch: java.lang.Throwable -> La
            int r2 = r6.width     // Catch: java.lang.Throwable -> La
            float r2 = (float) r2     // Catch: java.lang.Throwable -> La
            r7.setStrokeWidth(r2)     // Catch: java.lang.Throwable -> La
            android.graphics.Paint r7 = r6.mPaint     // Catch: java.lang.Throwable -> La
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.ROUND     // Catch: java.lang.Throwable -> La
            r7.setStrokeCap(r2)     // Catch: java.lang.Throwable -> La
            android.graphics.Paint r7 = r6.mPaint     // Catch: java.lang.Throwable -> La
            int r2 = r6.color     // Catch: java.lang.Throwable -> La
            r7.setColor(r2)     // Catch: java.lang.Throwable -> La
            boolean r7 = r6.isInEditMode()     // Catch: java.lang.Throwable -> La
            if (r7 != 0) goto Lc4
            float r7 = r6.halfSweepAMaxValue     // Catch: java.lang.Throwable -> La
            float r2 = r6.halfSweepAMinValue     // Catch: java.lang.Throwable -> La
            float r7 = r7 - r2
            float r7 = r7 / r3
            r6.halfSweepA = r7     // Catch: java.lang.Throwable -> La
            float[] r7 = new float[r0]     // Catch: java.lang.Throwable -> La
            r7 = {x00c8: FILL_ARRAY_DATA , data: [0, 1136033792} // fill-array     // Catch: java.lang.Throwable -> La
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r7)     // Catch: java.lang.Throwable -> La
            r6.rotateAnimator = r7     // Catch: java.lang.Throwable -> La
            r2 = 1000(0x3e8, double:4.94E-321)
            r7.setDuration(r2)     // Catch: java.lang.Throwable -> La
            android.animation.ValueAnimator r7 = r6.rotateAnimator     // Catch: java.lang.Throwable -> La
            android.view.animation.LinearInterpolator r2 = new android.view.animation.LinearInterpolator     // Catch: java.lang.Throwable -> La
            r2.<init>()     // Catch: java.lang.Throwable -> La
            r7.setInterpolator(r2)     // Catch: java.lang.Throwable -> La
            android.animation.ValueAnimator r7 = r6.rotateAnimator     // Catch: java.lang.Throwable -> La
            r2 = -1
            r7.setRepeatCount(r2)     // Catch: java.lang.Throwable -> La
            android.animation.ValueAnimator r7 = r6.rotateAnimator     // Catch: java.lang.Throwable -> La
            com.kongzue.dialogx.util.views.NoArticulatedProgressView$1 r3 = new com.kongzue.dialogx.util.views.NoArticulatedProgressView$1     // Catch: java.lang.Throwable -> La
            r3.<init>(r6)     // Catch: java.lang.Throwable -> La
            r7.addUpdateListener(r3)     // Catch: java.lang.Throwable -> La
            float[] r7 = new float[r0]     // Catch: java.lang.Throwable -> La
            r7 = {x00d0: FILL_ARRAY_DATA , data: [0, 1136033792} // fill-array     // Catch: java.lang.Throwable -> La
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r7)     // Catch: java.lang.Throwable -> La
            r6.followAnimator = r7     // Catch: java.lang.Throwable -> La
            r3 = 1500(0x5dc, double:7.41E-321)
            r7.setDuration(r3)     // Catch: java.lang.Throwable -> La
            android.animation.ValueAnimator r7 = r6.followAnimator     // Catch: java.lang.Throwable -> La
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator     // Catch: java.lang.Throwable -> La
            r0.<init>()     // Catch: java.lang.Throwable -> La
            r7.setInterpolator(r0)     // Catch: java.lang.Throwable -> La
            android.animation.ValueAnimator r7 = r6.followAnimator     // Catch: java.lang.Throwable -> La
            r7.setRepeatCount(r2)     // Catch: java.lang.Throwable -> La
            android.animation.ValueAnimator r7 = r6.followAnimator     // Catch: java.lang.Throwable -> La
            com.kongzue.dialogx.util.views.NoArticulatedProgressView$2 r0 = new com.kongzue.dialogx.util.views.NoArticulatedProgressView$2     // Catch: java.lang.Throwable -> La
            r0.<init>(r6)     // Catch: java.lang.Throwable -> La
            r7.addUpdateListener(r0)     // Catch: java.lang.Throwable -> La
            android.animation.ValueAnimator r7 = r6.followAnimator     // Catch: java.lang.Throwable -> La
            r7.start()     // Catch: java.lang.Throwable -> La
            android.animation.ValueAnimator r7 = r6.rotateAnimator     // Catch: java.lang.Throwable -> La
            r7.start()     // Catch: java.lang.Throwable -> La
        Lc4:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return
        Lc6:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r7
    }

    private void showErrorTick(android.graphics.Canvas r11) {
            r10 = this;
            float r0 = r10.mCenterX
            float r1 = r10.mRadius
            r2 = 1082130432(0x40800000, float:4.0)
            float r3 = r1 * r2
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 / r4
            float r3 = r0 - r3
            int r3 = (int) r3
            float r5 = r1 * r2
            float r5 = r5 / r4
            float r0 = r0 + r5
            int r0 = (int) r0
            float r5 = r10.mCenterY
            float r1 = r1 * r2
            float r1 = r1 / r4
            float r5 = r5 - r1
            int r1 = (int) r5
            int r2 = r10.tickStep
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L21
            goto L52
        L21:
            int r2 = r10.line2X
            int r4 = r3 + r2
            if (r4 >= r0) goto L31
            int r2 = r2 + 4
            r10.line2X = r2
            int r2 = r10.line2Y
            int r2 = r2 + 4
            r10.line2Y = r2
        L31:
            float r5 = (float) r3
            float r6 = (float) r1
            int r2 = r10.line2X
            int r3 = r3 + r2
            float r7 = (float) r3
            int r2 = r10.line2Y
            int r2 = r2 + r1
            float r8 = (float) r2
            android.graphics.Paint r9 = r10.mPaint
            r4 = r11
            r4.drawLine(r5, r6, r7, r8, r9)
            goto L52
        L42:
            int r2 = r10.line1X
            int r5 = r0 - r2
            if (r5 <= r3) goto L68
            int r2 = r2 + 4
            r10.line1X = r2
            int r2 = r10.line1Y
            int r2 = r2 + 4
            r10.line1Y = r2
        L52:
            float r4 = (float) r0
            float r5 = (float) r1
            int r2 = r10.line1X
            int r0 = r0 - r2
            float r6 = (float) r0
            int r0 = r10.line1Y
            int r1 = r1 + r0
            float r7 = (float) r1
            android.graphics.Paint r8 = r10.mPaint
            r3 = r11
            r3.drawLine(r4, r5, r6, r7, r8)
            r0 = 1
            r10.postInvalidateDelayed(r0)
            return
        L68:
            r10.tickStep = r4
            float r3 = (float) r0
            float r4 = (float) r1
            int r0 = r0 - r2
            float r5 = (float) r0
            int r0 = r10.line1Y
            int r1 = r1 + r0
            float r6 = (float) r1
            android.graphics.Paint r7 = r10.mPaint
            r2 = r11
            r2.drawLine(r3, r4, r5, r6, r7)
            r0 = 150(0x96, double:7.4E-322)
            r10.postInvalidateDelayed(r0)
            return
    }

    private void showSuccessTick(android.graphics.Canvas r12) {
            r11 = this;
            float r0 = r11.mCenterX
            float r1 = r11.mRadius
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r1
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r2 = r0 - r2
            int r2 = (int) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r3 = r1 / r3
            float r0 = r0 - r3
            int r0 = (int) r0
            r3 = 1065185444(0x3f7d70a4, float:0.99)
            float r1 = r1 * r3
            int r1 = (int) r1
            int r3 = r11.tickStep
            r4 = 1
            if (r3 == 0) goto L2f
            if (r3 == r4) goto L20
            goto L48
        L20:
            int r0 = r11.line2X
            if (r0 >= r1) goto L48
            int r0 = r0 + 4
            r11.line2X = r0
            int r0 = r11.line2Y
            int r0 = r0 + (-5)
            r11.line2Y = r0
            goto L48
        L2f:
            int r1 = r11.line1X
            int r3 = r2 + r1
            if (r3 >= r0) goto L40
            int r1 = r1 + 2
            r11.line1X = r1
            int r0 = r11.line1Y
            int r0 = r0 + 2
            r11.line1Y = r0
            goto L48
        L40:
            r11.line2X = r1
            int r0 = r11.line1Y
            r11.line2Y = r0
            r11.tickStep = r4
        L48:
            float r6 = (float) r2
            float r7 = r11.mCenterY
            int r0 = r11.line1X
            int r0 = r0 + r2
            float r8 = (float) r0
            int r0 = r11.line1Y
            float r0 = (float) r0
            float r9 = r7 + r0
            android.graphics.Paint r10 = r11.mPaint
            r5 = r12
            r5.drawLine(r6, r7, r8, r9, r10)
            int r0 = r11.line1X
            int r0 = r0 + r2
            float r4 = (float) r0
            float r0 = r11.mCenterY
            int r1 = r11.line1Y
            float r1 = (float) r1
            float r5 = r0 + r1
            int r1 = r11.line2X
            int r2 = r2 + r1
            float r6 = (float) r2
            int r1 = r11.line2Y
            float r1 = (float) r1
            float r7 = r0 + r1
            android.graphics.Paint r8 = r11.mPaint
            r3 = r12
            r3.drawLine(r4, r5, r6, r7, r8)
            r0 = 1
            r11.postInvalidateDelayed(r0)
            return
    }

    private void showWarningTick(android.graphics.Canvas r13) {
            r12 = this;
            float r0 = r12.mCenterX
            int r0 = (int) r0
            float r1 = r12.mCenterY
            float r2 = r12.mRadius
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r2 * r3
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r4 = r1 - r4
            int r4 = (int) r4
            float r3 = r3 * r2
            r5 = 1090519040(0x41000000, float:8.0)
            float r3 = r3 / r5
            float r3 = r3 + r1
            int r3 = (int) r3
            r5 = 1077936128(0x40400000, float:3.0)
            float r2 = r2 * r5
            r5 = 1088421888(0x40e00000, float:7.0)
            float r2 = r2 / r5
            float r1 = r1 + r2
            int r1 = (int) r1
            int r2 = r12.tickStep
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L27
            goto L45
        L27:
            int r2 = r12.line2Y
            if (r2 == r1) goto L45
            float r9 = (float) r0
            float r8 = (float) r1
            int r1 = r1 + r5
            float r10 = (float) r1
            android.graphics.Paint r11 = r12.mPaint
            r6 = r13
            r7 = r9
            r6.drawLine(r7, r8, r9, r10, r11)
            goto L45
        L37:
            int r1 = r12.line1Y
            int r3 = r3 - r4
            if (r1 >= r3) goto L41
            int r1 = r1 + 4
            r12.line1Y = r1
            goto L45
        L41:
            r12.line1Y = r3
            r12.tickStep = r5
        L45:
            float r9 = (float) r0
            float r8 = (float) r4
            int r0 = r12.line1Y
            int r4 = r4 + r0
            float r10 = (float) r4
            android.graphics.Paint r11 = r12.mPaint
            r6 = r13
            r7 = r9
            r6.drawLine(r7, r8, r9, r10, r11)
            int r13 = r12.tickStep
            if (r13 != r5) goto L59
            r0 = 100
            goto L5b
        L59:
            r0 = 1
        L5b:
            r12.postInvalidateDelayed(r0)
            return
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void error() {
            r2 = this;
            int r0 = r2.status
            r1 = 4
            if (r0 != r1) goto L12
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.progress(r0)
            com.kongzue.dialogx.util.views.NoArticulatedProgressView$5 r0 = new com.kongzue.dialogx.util.views.NoArticulatedProgressView$5
            r0.<init>(r2)
            r2.waitProgressingRunnable = r0
            return
        L12:
            r0 = 0
            r2.tickStep = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r1 = 1073741824(0x40000000, float:2.0)
            r0.<init>(r1)
            r2.interpolator = r0
            r0 = 3
            r2.status = r0
            r2.invalidate()
            return
    }

    public int getColor() {
            r1 = this;
            int r0 = r1.color
            return r0
    }

    public int getStatus() {
            r1 = this;
            int r0 = r1.status
            return r0
    }

    public int getStrokeWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void loading() {
            r2 = this;
            r0 = 0
            r2.noShowLoading = r0
            r1 = 0
            r2.oldAnimAngle = r1
            r2.successStep = r0
            r2.line1X = r0
            r2.line1Y = r0
            r2.line2X = r0
            r2.line2Y = r0
            r2.status = r0
            android.animation.ValueAnimator r1 = r2.rotateAnimator
            if (r1 == 0) goto L19
            r1.cancel()
        L19:
            android.animation.ValueAnimator r1 = r2.followAnimator
            if (r1 == 0) goto L20
            r1.cancel()
        L20:
            r2.isInited = r0
            r0 = 0
            r2.init(r0)
            return
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void noLoading() {
            r1 = this;
            r0 = 1
            r1.noShowLoading = r0
            return
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.rotateAnimator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            android.animation.ValueAnimator r0 = r1.followAnimator
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            boolean r0 = r9.isInEditMode()
            if (r0 == 0) goto L14
            android.graphics.RectF r2 = r9.oval
            r5 = 0
            android.graphics.Paint r6 = r9.mPaint
            r3 = 0
            r4 = 1136033792(0x43b68000, float:365.0)
            r1 = r10
            r1.drawArc(r2, r3, r4, r5, r6)
            return
        L14:
            boolean r0 = r9.noShowLoading
            r1 = 2
            if (r0 == 0) goto L2e
            android.graphics.RectF r3 = r9.oval
            r6 = 0
            android.graphics.Paint r7 = r9.mPaint
            r4 = 0
            r5 = 1136033792(0x43b68000, float:365.0)
            r2 = r10
            r2.drawArc(r3, r4, r5, r6, r7)
            r9.successStep = r1
            int r0 = r9.status
            r9.drawDoneMark(r0, r10)
            return
        L2e:
            float r0 = r9.halfSweepA
            double r2 = (double) r0
            float r0 = r9.followRotateDegrees
            double r4 = (double) r0
            double r4 = java.lang.Math.toRadians(r4)
            double r4 = java.lang.Math.sin(r4)
            double r2 = r2 * r4
            float r0 = (float) r2
            float r2 = r9.halfSweepA
            float r0 = r0 + r2
            float r2 = r9.halfSweepAMinValue
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r0 = r0 + r2
            int r2 = r9.status
            if (r2 == 0) goto L81
            r0 = 1
            if (r2 == r0) goto L6f
            if (r2 == r1) goto L6f
            r0 = 3
            if (r2 == r0) goto L6f
            r0 = 4
            if (r2 == r0) goto L57
            goto L8d
        L57:
            android.graphics.RectF r4 = r9.oval
            float r6 = r9.currentRotateDegrees
            r7 = 0
            android.graphics.Paint r8 = r9.mPaint
            r5 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r3 = r10
            r3.drawArc(r4, r5, r6, r7, r8)
            java.lang.Runnable r10 = r9.waitProgressingRunnable
            if (r10 == 0) goto L8d
            r10.run()
            r10 = 0
            r9.waitProgressingRunnable = r10
            goto L8d
        L6f:
            android.graphics.RectF r1 = r9.oval
            r4 = 0
            android.graphics.Paint r5 = r9.mPaint
            r2 = 0
            r3 = 1135869952(0x43b40000, float:360.0)
            r0 = r10
            r0.drawArc(r1, r2, r3, r4, r5)
            int r0 = r9.status
            r9.drawDoneMark(r0, r10)
            goto L8d
        L81:
            android.graphics.RectF r2 = r9.oval
            float r3 = r9.currentRotateDegrees
            float r4 = -r0
            r5 = 0
            android.graphics.Paint r6 = r9.mPaint
            r1 = r10
            r1.drawArc(r2, r3, r4, r5, r6)
        L8d:
            return
    }

    @Override // android.view.View
    public void onSizeChanged(int r3, int r4, int r5, int r6) {
            r2 = this;
            super.onSizeChanged(r3, r4, r5, r6)
            float r3 = (float) r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r5
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r6
            r2.mCenterX = r3
            float r3 = (float) r4
            float r3 = r3 * r5
            float r3 = r3 / r6
            r2.mCenterY = r3
            int r3 = r2.getWidth()
            int r4 = r2.getHeight()
            int r3 = java.lang.Math.min(r3, r4)
            int r3 = r3 / 2
            int r4 = r2.width
            int r4 = r4 / 2
            int r3 = r3 - r4
            float r3 = (float) r3
            r2.mRadius = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            float r4 = r2.mCenterX
            float r5 = r2.mRadius
            float r6 = r4 - r5
            float r0 = r2.mCenterY
            float r1 = r0 - r5
            float r4 = r4 + r5
            float r0 = r0 + r5
            r3.<init>(r6, r1, r4, r0)
            r2.oval = r3
            return
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void progress(float r6) {
            r5 = this;
            r0 = 0
            android.animation.ValueAnimator r1 = r5.rotateAnimator
            if (r1 == 0) goto L8
            r1.cancel()
        L8:
            android.animation.ValueAnimator r1 = r5.followAnimator
            if (r1 == 0) goto Lf
            r1.cancel()
        Lf:
            int r1 = r5.status
            r2 = 4
            if (r1 == r2) goto L17
            r1 = 0
            r5.currentRotateDegrees = r1
        L17:
            float r1 = r5.currentRotateDegrees
            r3 = 1136033792(0x43b68000, float:365.0)
            float r6 = r6 * r3
            r3 = 2
            float[] r3 = new float[r3]
            r3[r0] = r1
            r1 = 1
            r3[r1] = r6
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r3)
            r5.rotateAnimator = r6
            r3 = 1000(0x3e8, double:4.94E-321)
            r6.setDuration(r3)
            android.animation.ValueAnimator r6 = r5.rotateAnimator
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r3 = 1073741824(0x40000000, float:2.0)
            r1.<init>(r3)
            r6.setInterpolator(r1)
            android.animation.ValueAnimator r6 = r5.rotateAnimator
            r6.setRepeatCount(r0)
            android.animation.ValueAnimator r6 = r5.rotateAnimator
            com.kongzue.dialogx.util.views.NoArticulatedProgressView$6 r0 = new com.kongzue.dialogx.util.views.NoArticulatedProgressView$6
            r0.<init>(r5)
            r6.addUpdateListener(r0)
            android.animation.ValueAnimator r6 = r5.rotateAnimator
            r6.start()
            r5.status = r2
            return
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.ProgressViewInterface setColor(int r1) {
            r0 = this;
            com.kongzue.dialogx.util.views.NoArticulatedProgressView r1 = r0.setColor(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public com.kongzue.dialogx.util.views.NoArticulatedProgressView setColor(int r2) {
            r1 = this;
            r1.color = r2
            android.graphics.Paint r0 = r1.mPaint
            if (r0 == 0) goto L9
            r0.setColor(r2)
        L9:
            return r1
    }

    public com.kongzue.dialogx.util.views.NoArticulatedProgressView setStrokeWidth(int r2) {
            r1 = this;
            r1.width = r2
            android.graphics.Paint r0 = r1.mPaint
            if (r0 == 0) goto La
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
        La:
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void success() {
            r2 = this;
            int r0 = r2.status
            r1 = 4
            if (r0 != r1) goto L12
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.progress(r0)
            com.kongzue.dialogx.util.views.NoArticulatedProgressView$3 r0 = new com.kongzue.dialogx.util.views.NoArticulatedProgressView$3
            r0.<init>(r2)
            r2.waitProgressingRunnable = r0
            return
        L12:
            r0 = 0
            r2.tickStep = r0
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r2.interpolator = r0
            r0 = 1
            r2.status = r0
            r2.invalidate()
            return
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void warning() {
            r2 = this;
            int r0 = r2.status
            r1 = 4
            if (r0 != r1) goto L12
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.progress(r0)
            com.kongzue.dialogx.util.views.NoArticulatedProgressView$4 r0 = new com.kongzue.dialogx.util.views.NoArticulatedProgressView$4
            r0.<init>(r2)
            r2.waitProgressingRunnable = r0
            return
        L12:
            r0 = 0
            r2.tickStep = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r1 = 1073741824(0x40000000, float:2.0)
            r0.<init>(r1)
            r2.interpolator = r0
            r0 = 2
            r2.status = r0
            r2.invalidate()
            return
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.ProgressViewInterface whenShowTick(java.lang.Runnable r1) {
            r0 = this;
            com.kongzue.dialogx.util.views.NoArticulatedProgressView r1 = r0.whenShowTick(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public com.kongzue.dialogx.util.views.NoArticulatedProgressView whenShowTick(java.lang.Runnable r1) {
            r0 = this;
            r0.tickShowRunnable = r1
            return r0
    }
}
