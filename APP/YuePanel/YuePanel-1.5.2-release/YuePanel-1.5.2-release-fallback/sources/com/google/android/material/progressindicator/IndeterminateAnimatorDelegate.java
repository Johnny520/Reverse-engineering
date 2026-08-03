package com.google.android.material.progressindicator;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
abstract class IndeterminateAnimatorDelegate<T extends android.animation.Animator> {
    protected final java.util.List<com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator> activeIndicators;
    protected com.google.android.material.progressindicator.IndeterminateDrawable drawable;

    public IndeterminateAnimatorDelegate(int r4) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.activeIndicators = r0
            r0 = 0
        Lb:
            if (r0 >= r4) goto L1a
            java.util.List<com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator> r1 = r3.activeIndicators
            com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator r2 = new com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator
            r2.<init>()
            r1.add(r2)
            int r0 = r0 + 1
            goto Lb
        L1a:
            return
    }

    public abstract void cancelAnimatorImmediately();

    public float getFractionInRange(int r1, int r2, int r3) {
            r0 = this;
            int r1 = r1 - r2
            float r1 = (float) r1
            float r2 = (float) r3
            float r1 = r1 / r2
            return r1
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(@Yue.InterfaceC4410 Yue.InterfaceC0354.AbstractC0355 r1);

    public void registerDrawable(@Yue.InterfaceC4410 com.google.android.material.progressindicator.IndeterminateDrawable r1) {
            r0 = this;
            r0.drawable = r1
            return
    }

    public abstract void requestCancelAnimatorAfterCurrentCycle();

    @Yue.InterfaceC6959
    public abstract void resetPropertiesForNewStart();

    @Yue.InterfaceC6959
    public abstract void setAnimationFraction(float r1);

    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
