package com.google.android.material.floatingactionbutton;

import Yue.InterfaceC3258;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
interface MotionStrategy {
    void addAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener);

    AnimatorSet createAnimator();

    MotionSpec getCurrentMotionSpec();

    @InterfaceC3258
    int getDefaultMotionSpecResource();

    List<Animator.AnimatorListener> getListeners();

    @InterfaceC6490
    MotionSpec getMotionSpec();

    void onAnimationCancel();

    void onAnimationEnd();

    void onAnimationStart(Animator animator);

    void onChange(@InterfaceC6490 ExtendedFloatingActionButton.OnChangedCallback onChangedCallback);

    void performNow();

    void removeAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener);

    void setMotionSpec(@InterfaceC6490 MotionSpec motionSpec);

    boolean shouldCancel();
}
