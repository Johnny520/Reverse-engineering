package com.google.android.material.progressindicator;

import Yue.InterfaceC3219;
import Yue.InterfaceC6391;
import Yue.InterfaceC8392;
import android.animation.Animator;
import com.google.android.material.progressindicator.DrawingDelegate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class IndeterminateAnimatorDelegate<T extends Animator> {
    protected final List<DrawingDelegate.ActiveIndicator> activeIndicators = new ArrayList();
    protected IndeterminateDrawable drawable;

    public IndeterminateAnimatorDelegate(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.activeIndicators.add(new DrawingDelegate.ActiveIndicator());
        }
    }

    public abstract void cancelAnimatorImmediately();

    public float getFractionInRange(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(@InterfaceC6391 InterfaceC3219.AbstractC0084 abstractC0084);

    public void registerDrawable(@InterfaceC6391 IndeterminateDrawable indeterminateDrawable) {
        this.drawable = indeterminateDrawable;
    }

    public abstract void requestCancelAnimatorAfterCurrentCycle();

    @InterfaceC8392
    public abstract void resetPropertiesForNewStart();

    @InterfaceC8392
    public abstract void setAnimationFraction(float f);

    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
