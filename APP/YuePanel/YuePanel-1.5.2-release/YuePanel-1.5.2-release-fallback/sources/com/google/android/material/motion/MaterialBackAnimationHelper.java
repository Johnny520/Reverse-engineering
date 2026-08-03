package com.google.android.material.motion;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public abstract class MaterialBackAnimationHelper<V extends android.view.View> {
    private static final int CANCEL_DURATION_DEFAULT = 100;
    private static final int HIDE_DURATION_MAX_DEFAULT = 300;
    private static final int HIDE_DURATION_MIN_DEFAULT = 150;
    private static final java.lang.String TAG = "MaterialBackHelper";

    @Yue.InterfaceC4544
    private Yue.C0717 backEvent;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;

    @Yue.InterfaceC4410
    private final android.animation.TimeInterpolator progressInterpolator;

    @Yue.InterfaceC4410
    protected final V view;

    public MaterialBackAnimationHelper(@Yue.InterfaceC4410 V r4) {
            r3 = this;
            r3.<init>()
            r3.view = r4
            android.content.Context r4 = r4.getContext()
            int r0 = com.google.android.material.R.attr.motionEasingStandardDecelerateInterpolator
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r1 = Yue.C4704.m18683(r1, r1, r1, r2)
            android.animation.TimeInterpolator r0 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r4, r0, r1)
            r3.progressInterpolator = r0
            int r0 = com.google.android.material.R.attr.motionDurationMedium2
            r1 = 300(0x12c, float:4.2E-43)
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r4, r0, r1)
            r3.hideDurationMax = r0
            int r0 = com.google.android.material.R.attr.motionDurationShort3
            r1 = 150(0x96, float:2.1E-43)
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r4, r0, r1)
            r3.hideDurationMin = r0
            int r0 = com.google.android.material.R.attr.motionDurationShort2
            r1 = 100
            int r4 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r4, r0, r1)
            r3.cancelDuration = r4
            return
    }

    public float interpolateProgress(float r2) {
            r1 = this;
            android.animation.TimeInterpolator r0 = r1.progressInterpolator
            float r2 = r0.getInterpolation(r2)
            return r2
    }

    @Yue.InterfaceC4544
    public Yue.C0717 onCancelBackProgress() {
            r2 = this;
            Yue.ۥ۟ۢۤۥ r0 = r2.backEvent
            if (r0 != 0) goto Lb
            java.lang.String r0 = "MaterialBackHelper"
            java.lang.String r1 = "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()"
            android.util.Log.w(r0, r1)
        Lb:
            Yue.ۥ۟ۢۤۥ r0 = r2.backEvent
            r1 = 0
            r2.backEvent = r1
            return r0
    }

    @Yue.InterfaceC4544
    public Yue.C0717 onHandleBackInvoked() {
            r2 = this;
            Yue.ۥ۟ۢۤۥ r0 = r2.backEvent
            r1 = 0
            r2.backEvent = r1
            return r0
    }

    public void onStartBackProgress(@Yue.InterfaceC4410 Yue.C0717 r1) {
            r0 = this;
            r0.backEvent = r1
            return
    }

    @Yue.InterfaceC4544
    public Yue.C0717 onUpdateBackProgress(@Yue.InterfaceC4410 Yue.C0717 r3) {
            r2 = this;
            Yue.ۥ۟ۢۤۥ r0 = r2.backEvent
            if (r0 != 0) goto Lb
            java.lang.String r0 = "MaterialBackHelper"
            java.lang.String r1 = "Must call startBackProgress() before updateBackProgress()"
            android.util.Log.w(r0, r1)
        Lb:
            Yue.ۥ۟ۢۤۥ r0 = r2.backEvent
            r2.backEvent = r3
            return r0
    }
}
