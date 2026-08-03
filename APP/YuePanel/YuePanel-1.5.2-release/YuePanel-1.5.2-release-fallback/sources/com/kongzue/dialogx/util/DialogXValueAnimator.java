package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class DialogXValueAnimator {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    private int currentRepeatCount;
    private long duration;
    private float endValue;
    android.os.Handler handler;
    private android.view.animation.Interpolator interpolator;
    private boolean isRunning;
    private com.kongzue.dialogx.util.DialogXValueAnimator.ValueUpdateListener listener;
    private int refreshInterval;
    private int repeatCount;
    private long startTime;
    private float startValue;


    public interface ValueUpdateListener {
        void onValueUpdate(float r1);
    }

    public DialogXValueAnimator(float r3, float r4) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.handler = r0
            r0 = 0
            r2.isRunning = r0
            r2.repeatCount = r0
            r2.currentRepeatCount = r0
            r0 = 16
            r2.refreshInterval = r0
            r2.startValue = r3
            r2.endValue = r4
            return
    }

    public static /* synthetic */ boolean access$000(com.kongzue.dialogx.util.DialogXValueAnimator r0) {
            boolean r0 = r0.isRunning
            return r0
    }

    public static /* synthetic */ boolean access$002(com.kongzue.dialogx.util.DialogXValueAnimator r0, boolean r1) {
            r0.isRunning = r1
            return r1
    }

    public static /* synthetic */ long access$100(com.kongzue.dialogx.util.DialogXValueAnimator r2) {
            long r0 = r2.startTime
            return r0
    }

    public static /* synthetic */ int access$1000(com.kongzue.dialogx.util.DialogXValueAnimator r0) {
            int r0 = r0.currentRepeatCount
            return r0
    }

    public static /* synthetic */ int access$1008(com.kongzue.dialogx.util.DialogXValueAnimator r2) {
            int r0 = r2.currentRepeatCount
            int r1 = r0 + 1
            r2.currentRepeatCount = r1
            return r0
    }

    public static /* synthetic */ long access$102(com.kongzue.dialogx.util.DialogXValueAnimator r0, long r1) {
            r0.startTime = r1
            return r1
    }

    public static /* synthetic */ int access$1100(com.kongzue.dialogx.util.DialogXValueAnimator r0) {
            int r0 = r0.refreshInterval
            return r0
    }

    public static /* synthetic */ long access$200(com.kongzue.dialogx.util.DialogXValueAnimator r2) {
            long r0 = r2.duration
            return r0
    }

    public static /* synthetic */ android.view.animation.Interpolator access$300(com.kongzue.dialogx.util.DialogXValueAnimator r0) {
            android.view.animation.Interpolator r0 = r0.interpolator
            return r0
    }

    public static /* synthetic */ float access$400(com.kongzue.dialogx.util.DialogXValueAnimator r0) {
            float r0 = r0.startValue
            return r0
    }

    public static /* synthetic */ float access$500(com.kongzue.dialogx.util.DialogXValueAnimator r0) {
            float r0 = r0.endValue
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.util.DialogXValueAnimator.ValueUpdateListener access$600(com.kongzue.dialogx.util.DialogXValueAnimator r0) {
            com.kongzue.dialogx.util.DialogXValueAnimator$ValueUpdateListener r0 = r0.listener
            return r0
    }

    public static /* synthetic */ android.os.Handler access$700(com.kongzue.dialogx.util.DialogXValueAnimator r0) {
            android.os.Handler r0 = r0.getHandler()
            return r0
    }

    public static /* synthetic */ void access$800(com.kongzue.dialogx.util.DialogXValueAnimator r0) {
            r0.onAnimationEnd()
            return
    }

    public static /* synthetic */ int access$900(com.kongzue.dialogx.util.DialogXValueAnimator r0) {
            int r0 = r0.repeatCount
            return r0
    }

    private android.os.Handler getHandler() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            if (r0 != 0) goto Lf
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.handler = r0
        Lf:
            android.os.Handler r0 = r2.handler
            return r0
    }

    public static com.kongzue.dialogx.util.DialogXValueAnimator ofFloat(float r1, float r2) {
            com.kongzue.dialogx.util.DialogXValueAnimator r0 = new com.kongzue.dialogx.util.DialogXValueAnimator
            r0.<init>(r1, r2)
            return r0
    }

    private void onAnimationEnd() {
            r0 = this;
            return
    }

    public void addUpdateListener(com.kongzue.dialogx.util.DialogXValueAnimator.ValueUpdateListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }

    public void cancel() {
            r1 = this;
            r0 = 0
            r1.isRunning = r0
            return
    }

    public int getCurrentRepeatCount() {
            r1 = this;
            int r0 = r1.currentRepeatCount
            return r0
    }

    public long getDuration() {
            r2 = this;
            long r0 = r2.duration
            return r0
    }

    public float getEndValue() {
            r1 = this;
            float r0 = r1.endValue
            return r0
    }

    public android.view.animation.Interpolator getInterpolator() {
            r1 = this;
            android.view.animation.Interpolator r0 = r1.interpolator
            return r0
    }

    public com.kongzue.dialogx.util.DialogXValueAnimator.ValueUpdateListener getListener() {
            r1 = this;
            com.kongzue.dialogx.util.DialogXValueAnimator$ValueUpdateListener r0 = r1.listener
            return r0
    }

    public int getRefreshInterval() {
            r1 = this;
            int r0 = r1.refreshInterval
            return r0
    }

    public int getRepeatCount() {
            r1 = this;
            int r0 = r1.repeatCount
            return r0
    }

    public long getStartTime() {
            r2 = this;
            long r0 = r2.startTime
            return r0
    }

    public float getStartValue() {
            r1 = this;
            float r0 = r1.startValue
            return r0
    }

    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.isRunning
            return r0
    }

    public com.kongzue.dialogx.util.DialogXValueAnimator setDuration(long r1) {
            r0 = this;
            r0.duration = r1
            return r0
    }

    public com.kongzue.dialogx.util.DialogXValueAnimator setEndValue(float r1) {
            r0 = this;
            r0.endValue = r1
            return r0
    }

    public void setFloatValues(float r1, float r2) {
            r0 = this;
            r0.startValue = r1
            r0.endValue = r2
            return
    }

    public void setInterpolator(android.view.animation.Interpolator r1) {
            r0 = this;
            r0.interpolator = r1
            return
    }

    public com.kongzue.dialogx.util.DialogXValueAnimator setListener(com.kongzue.dialogx.util.DialogXValueAnimator.ValueUpdateListener r1) {
            r0 = this;
            r0.listener = r1
            return r0
    }

    public com.kongzue.dialogx.util.DialogXValueAnimator setRefreshInterval(int r1) {
            r0 = this;
            r0.refreshInterval = r1
            return r0
    }

    public void setRepeatCount(int r1) {
            r0 = this;
            r0.repeatCount = r1
            return
    }

    public com.kongzue.dialogx.util.DialogXValueAnimator setStartTime(long r1) {
            r0 = this;
            r0.startTime = r1
            return r0
    }

    public com.kongzue.dialogx.util.DialogXValueAnimator setStartValue(float r1) {
            r0 = this;
            r0.startValue = r1
            return r0
    }

    public void start() {
            r2 = this;
            boolean r0 = r2.isRunning
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.isRunning = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.startTime = r0
            java.lang.Thread r0 = new java.lang.Thread
            com.kongzue.dialogx.util.DialogXValueAnimator$1 r1 = new com.kongzue.dialogx.util.DialogXValueAnimator$1
            r1.<init>(r2)
            r0.<init>(r1)
            r0.start()
            return
    }
}
