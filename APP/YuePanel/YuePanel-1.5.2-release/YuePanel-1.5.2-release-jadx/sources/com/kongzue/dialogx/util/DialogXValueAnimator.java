package com.kongzue.dialogx.util;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
public class DialogXValueAnimator {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    private long duration;
    private float endValue;
    private Interpolator interpolator;
    private ValueUpdateListener listener;
    private long startTime;
    private float startValue;
    Handler handler = new Handler(Looper.getMainLooper());
    private boolean isRunning = false;
    private int repeatCount = 0;
    private int currentRepeatCount = 0;
    private int refreshInterval = 16;

    public interface ValueUpdateListener {
        void onValueUpdate(float f);
    }

    public DialogXValueAnimator(float f, float f2) {
        this.startValue = f;
        this.endValue = f2;
    }

    public static /* synthetic */ int access$1008(DialogXValueAnimator dialogXValueAnimator) {
        int i = dialogXValueAnimator.currentRepeatCount;
        dialogXValueAnimator.currentRepeatCount = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Handler getHandler() {
        if (this.handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        }
        return this.handler;
    }

    public static DialogXValueAnimator ofFloat(float f, float f2) {
        return new DialogXValueAnimator(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAnimationEnd() {
    }

    public void addUpdateListener(ValueUpdateListener valueUpdateListener) {
        this.listener = valueUpdateListener;
    }

    public void cancel() {
        this.isRunning = false;
    }

    public int getCurrentRepeatCount() {
        return this.currentRepeatCount;
    }

    public long getDuration() {
        return this.duration;
    }

    public float getEndValue() {
        return this.endValue;
    }

    public Interpolator getInterpolator() {
        return this.interpolator;
    }

    public ValueUpdateListener getListener() {
        return this.listener;
    }

    public int getRefreshInterval() {
        return this.refreshInterval;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public float getStartValue() {
        return this.startValue;
    }

    public boolean isRunning() {
        return this.isRunning;
    }

    public DialogXValueAnimator setDuration(long j) {
        this.duration = j;
        return this;
    }

    public DialogXValueAnimator setEndValue(float f) {
        this.endValue = f;
        return this;
    }

    public void setFloatValues(float f, float f2) {
        this.startValue = f;
        this.endValue = f2;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.interpolator = interpolator;
    }

    public DialogXValueAnimator setListener(ValueUpdateListener valueUpdateListener) {
        this.listener = valueUpdateListener;
        return this;
    }

    public DialogXValueAnimator setRefreshInterval(int i) {
        this.refreshInterval = i;
        return this;
    }

    public void setRepeatCount(int i) {
        this.repeatCount = i;
    }

    public DialogXValueAnimator setStartTime(long j) {
        this.startTime = j;
        return this;
    }

    public DialogXValueAnimator setStartValue(float f) {
        this.startValue = f;
        return this;
    }

    public void start() {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        this.startTime = System.currentTimeMillis();
        new Thread(new Runnable() { // from class: com.kongzue.dialogx.util.DialogXValueAnimator.1
            @Override // java.lang.Runnable
            public void run() {
                while (DialogXValueAnimator.this.isRunning) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - DialogXValueAnimator.this.startTime;
                    if (jCurrentTimeMillis < DialogXValueAnimator.this.duration) {
                        float interpolation = jCurrentTimeMillis / DialogXValueAnimator.this.duration;
                        if (DialogXValueAnimator.this.interpolator != null) {
                            interpolation = DialogXValueAnimator.this.interpolator.getInterpolation(interpolation);
                        }
                        final float f = DialogXValueAnimator.this.startValue + (interpolation * (DialogXValueAnimator.this.endValue - DialogXValueAnimator.this.startValue));
                        if (DialogXValueAnimator.this.listener != null) {
                            DialogXValueAnimator.this.getHandler().post(new Runnable() { // from class: com.kongzue.dialogx.util.DialogXValueAnimator.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    DialogXValueAnimator.this.listener.onValueUpdate(f);
                                }
                            });
                        }
                    } else {
                        DialogXValueAnimator.this.isRunning = false;
                        DialogXValueAnimator.this.onAnimationEnd();
                        if (DialogXValueAnimator.this.repeatCount == -1 || DialogXValueAnimator.this.currentRepeatCount < DialogXValueAnimator.this.repeatCount) {
                            DialogXValueAnimator.access$1008(DialogXValueAnimator.this);
                            DialogXValueAnimator.this.startTime = System.currentTimeMillis();
                            DialogXValueAnimator.this.isRunning = true;
                        }
                    }
                    try {
                        Thread.sleep(DialogXValueAnimator.this.refreshInterval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
