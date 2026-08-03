package com.kongzue.dialogx.util.views;

/* JADX INFO: loaded from: classes2.dex */
public class ProgressView extends android.view.View implements com.kongzue.dialogx.interfaces.ProgressViewInterface {
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
    private com.kongzue.dialogx.util.DialogXValueAnimator followAnimator;
    private float followRotateDegrees;
    private float halfSweepA;
    private float halfSweepAMaxValue;
    private float halfSweepAMinValue;
    private android.view.animation.Interpolator interpolator;
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
    private float nowLoadingProgressEndAngle;
    private float nowLoadingProgressValue;
    private android.graphics.RectF oval;
    private com.kongzue.dialogx.util.DialogXValueAnimator rotateAnimator;
    private int status;
    private int successStep;
    private android.animation.ValueAnimator tickAnimator;
    private float tickAnimatorValue;
    private java.lang.Runnable tickShowRunnable;
    java.lang.Runnable waitArticulationAnimationRunnable;
    private int width;











    static {
            return
    }

    public ProgressView(android.content.Context r2) {
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
            r2 = 0
            r1.init(r2)
            return
    }

    public ProgressView(android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
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
            r1.init(r3)
            return
    }

    public ProgressView(android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
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
            r0.init(r2)
            return
    }

    public static /* synthetic */ float access$002(com.kongzue.dialogx.util.views.ProgressView r0, float r1) {
            r0.currentRotateDegrees = r1
            return r1
    }

    public static /* synthetic */ float access$102(com.kongzue.dialogx.util.views.ProgressView r0, float r1) {
            r0.followRotateDegrees = r1
            return r1
    }

    public static /* synthetic */ void access$200(com.kongzue.dialogx.util.views.ProgressView r0, int r1, android.view.animation.Interpolator r2) {
            r0.initTipAnimator(r1, r2)
            return
    }

    public static /* synthetic */ int access$300(com.kongzue.dialogx.util.views.ProgressView r0) {
            int r0 = r0.status
            return r0
    }

    public static /* synthetic */ android.view.animation.Interpolator access$400(com.kongzue.dialogx.util.views.ProgressView r0) {
            android.view.animation.Interpolator r0 = r0.interpolator
            return r0
    }

    public static /* synthetic */ float access$502(com.kongzue.dialogx.util.views.ProgressView r0, float r1) {
            r0.tickAnimatorValue = r1
            return r1
    }

    private long calculateMillisPerFrame(android.content.Context r5) {
            r4 = this;
            float r5 = r4.getRefreshRate(r5)
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L12
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = (double) r5
            double r0 = r0 / r2
            long r0 = (long) r0
            return r0
        L12:
            r0 = 16
            return r0
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

    private void drawDoneMark(int r8, android.graphics.Canvas r9) {
            r7 = this;
            com.kongzue.dialogx.util.DialogXValueAnimator r0 = r7.rotateAnimator
            android.view.animation.Interpolator r0 = r0.getInterpolator()
            android.view.animation.Interpolator r1 = r7.interpolator
            if (r0 == r1) goto Lf
            com.kongzue.dialogx.util.DialogXValueAnimator r0 = r7.rotateAnimator
            r0.setInterpolator(r1)
        Lf:
            java.lang.Runnable r0 = r7.tickShowRunnable
            r1 = 2
            r2 = 1
            r3 = 3
            if (r0 == 0) goto L60
            r0.run()
            r0 = 0
            r7.tickShowRunnable = r0
            boolean r0 = com.kongzue.dialogx.DialogX.useHaptic
            if (r0 == 0) goto L60
            if (r8 == r2) goto L5d
            if (r8 == r1) goto L43
            if (r8 == r3) goto L27
            goto L60
        L27:
            r7.performHapticFeedback(r3)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r4)
            com.kongzue.dialogx.util.views.ProgressView$4 r4 = new com.kongzue.dialogx.util.views.ProgressView$4
            r4.<init>(r7)
            long r5 = com.kongzue.dialogx.util.views.ProgressView.TIP_ANIMATOR_DURATION
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            long r5 = (long) r5
            r0.postDelayed(r4, r5)
            goto L60
        L43:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r4)
            com.kongzue.dialogx.util.views.ProgressView$3 r4 = new com.kongzue.dialogx.util.views.ProgressView$3
            r4.<init>(r7)
            long r5 = com.kongzue.dialogx.util.views.ProgressView.TIP_ANIMATOR_DURATION
            float r5 = (float) r5
            r6 = 1061997773(0x3f4ccccd, float:0.8)
            float r5 = r5 * r6
            long r5 = (long) r5
            r0.postDelayed(r4, r5)
            goto L60
        L5d:
            r7.performHapticFeedback(r3)
        L60:
            if (r8 == r2) goto L6f
            if (r8 == r1) goto L6b
            if (r8 == r3) goto L67
            goto L72
        L67:
            r7.showErrorTick(r9)
            goto L72
        L6b:
            r7.showWarningTick(r9)
            goto L72
        L6f:
            r7.showSuccessTick(r9)
        L72:
            return
    }

    private float getRefreshRate(android.content.Context r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1b
            java.lang.Class<android.view.WindowManager> r0 = android.view.WindowManager.class
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r3 = r3.getDefaultDisplay()
            android.view.Display$Mode r3 = r3.getMode()
            float r3 = r3.getRefreshRate()
            goto L2b
        L1b:
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
        L2b:
            return r3
    }

    private void init(android.util.AttributeSet r7) {
            r6 = this;
            java.lang.Class<com.kongzue.dialogx.util.views.ProgressView> r0 = com.kongzue.dialogx.util.views.ProgressView.class
            monitor-enter(r0)
            boolean r1 = r6.isInited     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r7 = move-exception
            goto Ld2
        Lc:
            r1 = 1
            r6.isInited = r1     // Catch: java.lang.Throwable -> L9
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L36
            android.content.Context r3 = r6.getContext()     // Catch: java.lang.Throwable -> L9
            int[] r4 = com.kongzue.dialogx.R.styleable.ProgressView     // Catch: java.lang.Throwable -> L9
            android.content.res.TypedArray r7 = r3.obtainStyledAttributes(r7, r4)     // Catch: java.lang.Throwable -> L9
            int r3 = com.kongzue.dialogx.R.styleable.ProgressView_progressStrokeWidth     // Catch: java.lang.Throwable -> L9
            int r4 = r6.dip2px(r2)     // Catch: java.lang.Throwable -> L9
            int r3 = r7.getDimensionPixelSize(r3, r4)     // Catch: java.lang.Throwable -> L9
            r6.width = r3     // Catch: java.lang.Throwable -> L9
            int r3 = com.kongzue.dialogx.R.styleable.ProgressView_progressStrokeColor     // Catch: java.lang.Throwable -> L9
            int r4 = r6.color     // Catch: java.lang.Throwable -> L9
            int r3 = r7.getDimensionPixelSize(r3, r4)     // Catch: java.lang.Throwable -> L9
            r6.color = r3     // Catch: java.lang.Throwable -> L9
            r7.recycle()     // Catch: java.lang.Throwable -> L9
        L36:
            android.graphics.Paint r7 = r6.mPaint     // Catch: java.lang.Throwable -> L9
            r7.setAntiAlias(r1)     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r7 = r6.mPaint     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE     // Catch: java.lang.Throwable -> L9
            r7.setStyle(r1)     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r7 = r6.mPaint     // Catch: java.lang.Throwable -> L9
            int r1 = r6.width     // Catch: java.lang.Throwable -> L9
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L9
            r7.setStrokeWidth(r1)     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r7 = r6.mPaint     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND     // Catch: java.lang.Throwable -> L9
            r7.setStrokeCap(r1)     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r7 = r6.mPaint     // Catch: java.lang.Throwable -> L9
            int r1 = r6.color     // Catch: java.lang.Throwable -> L9
            r7.setColor(r1)     // Catch: java.lang.Throwable -> L9
            boolean r7 = r6.isInEditMode()     // Catch: java.lang.Throwable -> L9
            if (r7 != 0) goto Ld0
            android.content.Context r7 = r6.getContext()     // Catch: java.lang.Throwable -> L9
            long r3 = r6.calculateMillisPerFrame(r7)     // Catch: java.lang.Throwable -> L9
            int r7 = (int) r3     // Catch: java.lang.Throwable -> L9
            float r1 = r6.halfSweepAMaxValue     // Catch: java.lang.Throwable -> L9
            float r3 = r6.halfSweepAMinValue     // Catch: java.lang.Throwable -> L9
            float r1 = r1 - r3
            float r1 = r1 / r2
            r6.halfSweepA = r1     // Catch: java.lang.Throwable -> L9
            r1 = 1136033792(0x43b68000, float:365.0)
            r2 = 0
            com.kongzue.dialogx.util.DialogXValueAnimator r3 = com.kongzue.dialogx.util.DialogXValueAnimator.ofFloat(r2, r1)     // Catch: java.lang.Throwable -> L9
            r6.rotateAnimator = r3     // Catch: java.lang.Throwable -> L9
            r4 = 1000(0x3e8, double:4.94E-321)
            r3.setDuration(r4)     // Catch: java.lang.Throwable -> L9
            com.kongzue.dialogx.util.DialogXValueAnimator r3 = r6.rotateAnimator     // Catch: java.lang.Throwable -> L9
            android.view.animation.LinearInterpolator r4 = new android.view.animation.LinearInterpolator     // Catch: java.lang.Throwable -> L9
            r4.<init>()     // Catch: java.lang.Throwable -> L9
            r3.setInterpolator(r4)     // Catch: java.lang.Throwable -> L9
            com.kongzue.dialogx.util.DialogXValueAnimator r3 = r6.rotateAnimator     // Catch: java.lang.Throwable -> L9
            r4 = -1
            r3.setRepeatCount(r4)     // Catch: java.lang.Throwable -> L9
            com.kongzue.dialogx.util.DialogXValueAnimator r3 = r6.rotateAnimator     // Catch: java.lang.Throwable -> L9
            r3.setRefreshInterval(r7)     // Catch: java.lang.Throwable -> L9
            com.kongzue.dialogx.util.DialogXValueAnimator r3 = r6.rotateAnimator     // Catch: java.lang.Throwable -> L9
            com.kongzue.dialogx.util.views.ProgressView$1 r5 = new com.kongzue.dialogx.util.views.ProgressView$1     // Catch: java.lang.Throwable -> L9
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L9
            r3.addUpdateListener(r5)     // Catch: java.lang.Throwable -> L9
            com.kongzue.dialogx.util.DialogXValueAnimator r1 = com.kongzue.dialogx.util.DialogXValueAnimator.ofFloat(r2, r1)     // Catch: java.lang.Throwable -> L9
            r6.followAnimator = r1     // Catch: java.lang.Throwable -> L9
            r2 = 1500(0x5dc, double:7.41E-321)
            r1.setDuration(r2)     // Catch: java.lang.Throwable -> L9
            com.kongzue.dialogx.util.DialogXValueAnimator r1 = r6.followAnimator     // Catch: java.lang.Throwable -> L9
            r1.setRefreshInterval(r7)     // Catch: java.lang.Throwable -> L9
            com.kongzue.dialogx.util.DialogXValueAnimator r7 = r6.followAnimator     // Catch: java.lang.Throwable -> L9
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator     // Catch: java.lang.Throwable -> L9
            r1.<init>()     // Catch: java.lang.Throwable -> L9
            r7.setInterpolator(r1)     // Catch: java.lang.Throwable -> L9
            com.kongzue.dialogx.util.DialogXValueAnimator r7 = r6.followAnimator     // Catch: java.lang.Throwable -> L9
            r7.setRepeatCount(r4)     // Catch: java.lang.Throwable -> L9
            com.kongzue.dialogx.util.DialogXValueAnimator r7 = r6.followAnimator     // Catch: java.lang.Throwable -> L9
            com.kongzue.dialogx.util.views.ProgressView$2 r1 = new com.kongzue.dialogx.util.views.ProgressView$2     // Catch: java.lang.Throwable -> L9
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L9
            r7.addUpdateListener(r1)     // Catch: java.lang.Throwable -> L9
            com.kongzue.dialogx.util.DialogXValueAnimator r7 = r6.followAnimator     // Catch: java.lang.Throwable -> L9
            r7.start()     // Catch: java.lang.Throwable -> L9
            com.kongzue.dialogx.util.DialogXValueAnimator r7 = r6.rotateAnimator     // Catch: java.lang.Throwable -> L9
            r7.start()     // Catch: java.lang.Throwable -> L9
        Ld0:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        Ld2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r7
    }

    private void initTipAnimator(int r3, android.view.animation.Interpolator r4) {
            r2 = this;
            r2.interpolator = r4
            r2.status = r3
            int r3 = r2.successStep
            if (r3 != 0) goto L10
            com.kongzue.dialogx.util.views.ProgressView$8 r3 = new com.kongzue.dialogx.util.views.ProgressView$8
            r3.<init>(r2)
            r2.waitArticulationAnimationRunnable = r3
            return
        L10:
            android.animation.ValueAnimator r3 = r2.tickAnimator
            if (r3 == 0) goto L1a
            r3.cancel()
            r3 = 0
            r2.tickAnimator = r3
        L1a:
            r3 = 0
            r2.tickAnimatorValue = r3
            r3 = 2
            float[] r3 = new float[r3]
            r3 = {x003e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
            r2.tickAnimator = r3
            long r0 = com.kongzue.dialogx.util.views.ProgressView.TIP_ANIMATOR_DURATION
            r3.setDuration(r0)
            android.animation.ValueAnimator r3 = r2.tickAnimator
            com.kongzue.dialogx.util.views.ProgressView$9 r4 = new com.kongzue.dialogx.util.views.ProgressView$9
            r4.<init>(r2)
            r3.addUpdateListener(r4)
            android.animation.ValueAnimator r3 = r2.tickAnimator
            r3.start()
            return
    }

    private void showErrorTick(android.graphics.Canvas r20) {
            r19 = this;
            r0 = r19
            float r1 = r0.mCenterY
            float r2 = r0.mRadius
            r3 = 1082130432(0x40800000, float:4.0)
            float r4 = r2 * r3
            r5 = 1092616192(0x41200000, float:10.0)
            float r4 = r4 / r5
            float r1 = r1 - r4
            int r1 = (int) r1
            float r4 = r0.mCenterX
            float r2 = r2 * r3
            float r2 = r2 / r5
            float r4 = r4 + r2
            int r2 = (int) r4
            float r3 = r0.tickAnimatorValue
            r4 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r6 = 1073741824(0x40000000, float:2.0)
            if (r5 >= 0) goto L3a
            float r9 = (float) r1
            float r4 = r3 * r6
            int r2 = r2 - r1
            float r1 = (float) r2
            float r4 = r4 * r1
            float r4 = r4 + r9
            int r2 = (int) r4
            r0.line1X = r2
            float r3 = r3 * r6
            float r3 = r3 * r1
            float r3 = r3 + r9
            int r1 = (int) r3
            r0.line1Y = r1
            float r10 = (float) r2
            float r11 = (float) r1
            android.graphics.Paint r12 = r0.mPaint
            r7 = r20
            r8 = r9
            r7.drawLine(r8, r9, r10, r11, r12)
            goto L79
        L3a:
            float r5 = (float) r1
            float r7 = r3 * r6
            int r1 = r2 - r1
            float r1 = (float) r1
            float r7 = r7 * r1
            float r7 = r7 + r5
            int r7 = (int) r7
            r0.line1X = r7
            float r3 = r3 * r6
            float r3 = r3 * r1
            float r3 = r3 + r5
            int r3 = (int) r3
            r0.line1Y = r3
            float r2 = (float) r2
            android.graphics.Paint r3 = r0.mPaint
            r13 = r20
            r14 = r5
            r15 = r5
            r16 = r2
            r17 = r2
            r18 = r3
            r13.drawLine(r14, r15, r16, r17, r18)
            float r3 = r0.tickAnimatorValue
            float r7 = r3 - r4
            float r7 = r7 * r6
            float r7 = r7 * r1
            float r7 = r2 - r7
            int r7 = (int) r7
            r0.line2X = r7
            float r3 = r3 - r4
            float r3 = r3 * r6
            float r3 = r3 * r1
            float r3 = r3 + r5
            int r1 = (int) r3
            r0.line2Y = r1
            float r4 = (float) r7
            float r6 = (float) r1
            android.graphics.Paint r7 = r0.mPaint
            r1 = r20
            r3 = r5
            r5 = r6
            r6 = r7
            r1.drawLine(r2, r3, r4, r5, r6)
        L79:
            return
    }

    private void showSuccessTick(android.graphics.Canvas r8) {
            r7 = this;
            float r0 = r7.mRadius
            r1 = 1101004800(0x41a00000, float:20.0)
            float r1 = r0 / r1
            int r1 = (int) r1
            float r2 = r7.mCenterX
            r3 = 1092616192(0x41200000, float:10.0)
            float r3 = r0 / r3
            float r3 = r2 - r3
            float r1 = (float) r1
            float r3 = r3 - r1
            int r3 = (int) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r0 / r4
            float r5 = r2 - r5
            int r5 = (int) r5
            float r6 = r7.mCenterY
            float r6 = r6 + r1
            int r1 = (int) r6
            float r0 = r0 / r4
            float r2 = r2 + r0
            int r0 = (int) r2
            float r2 = (float) r5
            int r0 = r0 - r5
            float r0 = (float) r0
            float r4 = r7.tickAnimatorValue
            float r0 = r0 * r4
            float r0 = r0 + r2
            int r0 = (int) r0
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            float r6 = (float) r1
            r4.moveTo(r2, r6)
            if (r0 >= r3) goto L40
            r7.line1X = r0
            int r2 = r0 - r5
            int r1 = r1 + r2
            r7.line1Y = r1
            float r0 = (float) r0
            float r1 = (float) r1
            r4.lineTo(r0, r1)
            goto L5c
        L40:
            r7.line1X = r3
            int r2 = r3 - r5
            int r1 = r1 + r2
            r7.line1Y = r1
            float r2 = (float) r3
            float r1 = (float) r1
            r4.lineTo(r2, r1)
            r7.line2X = r0
            int r1 = r7.line1Y
            int r2 = r7.line1X
            int r2 = r0 - r2
            int r1 = r1 - r2
            r7.line2Y = r1
            float r0 = (float) r0
            float r1 = (float) r1
            r4.lineTo(r0, r1)
        L5c:
            android.graphics.Paint r0 = r7.mPaint
            r8.drawPath(r4, r0)
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
            float r2 = r12.tickAnimatorValue
            r5 = 1063675494(0x3f666666, float:0.9)
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L37
            float r9 = (float) r0
            float r8 = (float) r4
            int r3 = r3 - r4
            float r0 = (float) r3
            float r0 = r0 * r2
            float r10 = r8 + r0
            android.graphics.Paint r11 = r12.mPaint
            r6 = r13
            r7 = r9
            r6.drawLine(r7, r8, r9, r10, r11)
            goto L4d
        L37:
            float r8 = (float) r0
            float r4 = (float) r4
            float r6 = (float) r3
            android.graphics.Paint r7 = r12.mPaint
            r2 = r13
            r3 = r8
            r5 = r8
            r2.drawLine(r3, r4, r5, r6, r7)
            float r2 = (float) r1
            int r1 = r1 + 1
            float r4 = (float) r1
            android.graphics.Paint r5 = r12.mPaint
            r0 = r13
            r1 = r8
            r0.drawLine(r1, r2, r3, r4, r5)
        L4d:
            return
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void error() {
            r3 = this;
            int r0 = r3.status
            r1 = 3
            if (r0 != r1) goto L6
            return
        L6:
            r2 = 4
            if (r0 != r2) goto L16
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.progress(r0)
            com.kongzue.dialogx.util.views.ProgressView$7 r0 = new com.kongzue.dialogx.util.views.ProgressView$7
            r0.<init>(r3)
            r3.waitArticulationAnimationRunnable = r0
            return
        L16:
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r0.<init>(r2)
            r3.initTipAnimator(r1, r0)
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
            int r0 = r2.status
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.noShowLoading = r0
            r2.successStep = r0
            r2.line1X = r0
            r2.line1Y = r0
            r2.line2X = r0
            r2.line2Y = r0
            r2.status = r0
            com.kongzue.dialogx.util.DialogXValueAnimator r1 = r2.rotateAnimator
            if (r1 == 0) goto L1b
            r1.cancel()
        L1b:
            com.kongzue.dialogx.util.DialogXValueAnimator r1 = r2.followAnimator
            if (r1 == 0) goto L22
            r1.cancel()
        L22:
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
            com.kongzue.dialogx.util.DialogXValueAnimator r0 = r1.rotateAnimator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            com.kongzue.dialogx.util.DialogXValueAnimator r0 = r1.followAnimator
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r12) {
            r11 = this;
            boolean r0 = r11.isInEditMode()
            if (r0 == 0) goto L14
            android.graphics.RectF r2 = r11.oval
            r5 = 0
            android.graphics.Paint r6 = r11.mPaint
            r3 = 0
            r4 = 1136033792(0x43b68000, float:365.0)
            r1 = r12
            r1.drawArc(r2, r3, r4, r5, r6)
            return
        L14:
            boolean r0 = r11.noShowLoading
            r1 = 2
            if (r0 == 0) goto L2e
            android.graphics.RectF r3 = r11.oval
            r6 = 0
            android.graphics.Paint r7 = r11.mPaint
            r4 = 0
            r5 = 1136033792(0x43b68000, float:365.0)
            r2 = r12
            r2.drawArc(r3, r4, r5, r6, r7)
            r11.successStep = r1
            int r0 = r11.status
            r11.drawDoneMark(r0, r12)
            return
        L2e:
            int r0 = r11.status
            r2 = 1135869952(0x43b40000, float:360.0)
            if (r0 == 0) goto Lc5
            r3 = 0
            r4 = 1
            if (r0 == r4) goto L80
            if (r0 == r1) goto L80
            r1 = 3
            if (r0 == r1) goto L80
            r1 = 4
            if (r0 == r1) goto L42
            goto L101
        L42:
            int r0 = r11.successStep
            if (r0 == 0) goto L5d
            if (r0 == r4) goto L4a
            goto L101
        L4a:
            android.graphics.RectF r6 = r11.oval
            r9 = 0
            android.graphics.Paint r10 = r11.mPaint
            r7 = 0
            r8 = 1135869952(0x43b40000, float:360.0)
            r5 = r12
            r5.drawArc(r6, r7, r8, r9, r10)
            int r0 = r11.status
            r11.drawDoneMark(r0, r12)
            goto L101
        L5d:
            android.graphics.RectF r6 = r11.oval
            float r8 = r11.currentRotateDegrees
            r9 = 0
            android.graphics.Paint r10 = r11.mPaint
            r7 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5 = r12
            r5.drawArc(r6, r7, r8, r9, r10)
            float r12 = r11.currentRotateDegrees
            r0 = 1136033792(0x43b68000, float:365.0)
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 != 0) goto L101
            r11.successStep = r4
            java.lang.Runnable r12 = r11.waitArticulationAnimationRunnable
            if (r12 == 0) goto L101
            r12.run()
            r11.waitArticulationAnimationRunnable = r3
            goto L101
        L80:
            int r0 = r11.successStep
            if (r0 == 0) goto L9a
            if (r0 == r4) goto L88
            goto L101
        L88:
            android.graphics.RectF r6 = r11.oval
            r9 = 0
            android.graphics.Paint r10 = r11.mPaint
            r7 = 0
            r8 = 1135869952(0x43b40000, float:360.0)
            r5 = r12
            r5.drawArc(r6, r7, r8, r9, r10)
            int r0 = r11.status
            r11.drawDoneMark(r0, r12)
            goto L101
        L9a:
            float r0 = r11.nowLoadingProgressEndAngle
            r1 = 1084227584(0x40a00000, float:5.0)
            float r8 = r0 + r1
            r11.nowLoadingProgressEndAngle = r8
            android.graphics.RectF r6 = r11.oval
            float r7 = r11.nowLoadingProgressValue
            r9 = 0
            android.graphics.Paint r10 = r11.mPaint
            r5 = r12
            r5.drawArc(r6, r7, r8, r9, r10)
            float r12 = r11.nowLoadingProgressEndAngle
            float r0 = r11.changeStatusAngle
            float r2 = r2 - r0
            float r12 = r12 - r2
            float r0 = r11.nowLoadingProgressValue
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 < 0) goto L101
            r11.successStep = r4
            java.lang.Runnable r12 = r11.waitArticulationAnimationRunnable
            if (r12 == 0) goto L101
            r12.run()
            r11.waitArticulationAnimationRunnable = r3
            goto L101
        Lc5:
            float r0 = r11.halfSweepA
            double r0 = (double) r0
            float r3 = r11.followRotateDegrees
            double r3 = (double) r3
            double r3 = java.lang.Math.toRadians(r3)
            double r3 = java.lang.Math.sin(r3)
            double r0 = r0 * r3
            float r0 = (float) r0
            float r1 = r11.halfSweepA
            float r0 = r0 + r1
            float r1 = r11.halfSweepAMinValue
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            float r0 = r0 + r1
            float r5 = r11.currentRotateDegrees
            float r1 = r5 - r0
            r11.nowLoadingProgressValue = r1
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 >= 0) goto Lec
            float r1 = r1 + r2
            r11.nowLoadingProgressValue = r1
        Lec:
            r11.nowLoadingProgressEndAngle = r0
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 >= 0) goto Lf4
            float r2 = r2 - r0
            goto Lf5
        Lf4:
            r2 = r0
        Lf5:
            r11.changeStatusAngle = r2
            android.graphics.RectF r4 = r11.oval
            float r6 = -r0
            r7 = 0
            android.graphics.Paint r8 = r11.mPaint
            r3 = r12
            r3.drawArc(r4, r5, r6, r7, r8)
        L101:
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
    public void progress(float r4) {
            r3 = this;
            com.kongzue.dialogx.util.DialogXValueAnimator r0 = r3.rotateAnimator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            com.kongzue.dialogx.util.DialogXValueAnimator r0 = r3.followAnimator
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            int r0 = r3.status
            r1 = 4
            if (r0 == r1) goto L16
            r0 = 0
            r3.currentRotateDegrees = r0
        L16:
            r0 = 0
            r3.noShowLoading = r0
            r3.status = r1
            float r1 = r3.currentRotateDegrees
            r2 = 1136033792(0x43b68000, float:365.0)
            float r4 = r4 * r2
            com.kongzue.dialogx.util.DialogXValueAnimator r4 = com.kongzue.dialogx.util.DialogXValueAnimator.ofFloat(r1, r4)
            r3.rotateAnimator = r4
            long r1 = com.kongzue.dialogx.util.views.ProgressView.PROGRESSING_ANIMATOR_DURATION
            r4.setDuration(r1)
            com.kongzue.dialogx.util.DialogXValueAnimator r4 = r3.rotateAnimator
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r1.<init>(r2)
            r4.setInterpolator(r1)
            com.kongzue.dialogx.util.DialogXValueAnimator r4 = r3.rotateAnimator
            r4.setRepeatCount(r0)
            com.kongzue.dialogx.util.DialogXValueAnimator r4 = r3.rotateAnimator
            com.kongzue.dialogx.util.views.ProgressView$10 r0 = new com.kongzue.dialogx.util.views.ProgressView$10
            r0.<init>(r3)
            r4.addUpdateListener(r0)
            com.kongzue.dialogx.util.DialogXValueAnimator r4 = r3.rotateAnimator
            r4.start()
            return
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.ProgressViewInterface setColor(int r1) {
            r0 = this;
            com.kongzue.dialogx.util.views.ProgressView r1 = r0.setColor(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public com.kongzue.dialogx.util.views.ProgressView setColor(int r2) {
            r1 = this;
            r1.color = r2
            android.graphics.Paint r0 = r1.mPaint
            if (r0 == 0) goto L9
            r0.setColor(r2)
        L9:
            return r1
    }

    public com.kongzue.dialogx.util.views.ProgressView setStrokeWidth(int r2) {
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
            r3 = this;
            int r0 = r3.status
            r1 = 1
            if (r0 != r1) goto L6
            return
        L6:
            r2 = 4
            if (r0 != r2) goto L16
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.progress(r0)
            com.kongzue.dialogx.util.views.ProgressView$5 r0 = new com.kongzue.dialogx.util.views.ProgressView$5
            r0.<init>(r3)
            r3.waitArticulationAnimationRunnable = r0
            return
        L16:
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r3.initTipAnimator(r1, r0)
            return
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public void warning() {
            r3 = this;
            int r0 = r3.status
            r1 = 2
            if (r0 != r1) goto L6
            return
        L6:
            r2 = 4
            if (r0 != r2) goto L16
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.progress(r0)
            com.kongzue.dialogx.util.views.ProgressView$6 r0 = new com.kongzue.dialogx.util.views.ProgressView$6
            r0.<init>(r3)
            r3.waitArticulationAnimationRunnable = r0
            return
        L16:
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r0.<init>(r2)
            r3.initTipAnimator(r1, r0)
            return
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.ProgressViewInterface whenShowTick(java.lang.Runnable r1) {
            r0 = this;
            com.kongzue.dialogx.util.views.ProgressView r1 = r0.whenShowTick(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.ProgressViewInterface
    public com.kongzue.dialogx.util.views.ProgressView whenShowTick(java.lang.Runnable r1) {
            r0 = this;
            r0.tickShowRunnable = r1
            return r0
    }
}
