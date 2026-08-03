package com.google.android.material.motion;

import Yue.C3505;
import Yue.C6620;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public abstract class MaterialBackAnimationHelper<V extends View> {
    private static final int CANCEL_DURATION_DEFAULT = 100;
    private static final int HIDE_DURATION_MAX_DEFAULT = 300;
    private static final int HIDE_DURATION_MIN_DEFAULT = 150;
    private static final String TAG = "MaterialBackHelper";

    @InterfaceC6490
    private C3505 backEvent;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;

    @InterfaceC6391
    private final TimeInterpolator progressInterpolator;

    @InterfaceC6391
    protected final V view;

    public MaterialBackAnimationHelper(@InterfaceC6391 V v) {
        this.view = v;
        Context context = v.getContext();
        this.progressInterpolator = MotionUtils.resolveThemeInterpolator(context, C1980R.attr.motionEasingStandardDecelerateInterpolator, C6620.m3092(0.0f, 0.0f, 0.0f, 1.0f));
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, C1980R.attr.motionDurationMedium2, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, C1980R.attr.motionDurationShort3, 150);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, C1980R.attr.motionDurationShort2, 100);
    }

    public float interpolateProgress(float f) {
        return this.progressInterpolator.getInterpolation(f);
    }

    @InterfaceC6490
    public C3505 onCancelBackProgress() {
        if (this.backEvent == null) {
            Log.w(TAG, "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C3505 c3505 = this.backEvent;
        this.backEvent = null;
        return c3505;
    }

    @InterfaceC6490
    public C3505 onHandleBackInvoked() {
        C3505 c3505 = this.backEvent;
        this.backEvent = null;
        return c3505;
    }

    public void onStartBackProgress(@InterfaceC6391 C3505 c3505) {
        this.backEvent = c3505;
    }

    @InterfaceC6490
    public C3505 onUpdateBackProgress(@InterfaceC6391 C3505 c3505) {
        if (this.backEvent == null) {
            Log.w(TAG, "Must call startBackProgress() before updateBackProgress()");
        }
        C3505 c35052 = this.backEvent;
        this.backEvent = c3505;
        return c35052;
    }
}
