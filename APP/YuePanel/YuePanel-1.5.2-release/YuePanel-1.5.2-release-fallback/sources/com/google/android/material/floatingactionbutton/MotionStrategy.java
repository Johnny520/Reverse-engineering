package com.google.android.material.floatingactionbutton;

/* JADX INFO: loaded from: classes.dex */
interface MotionStrategy {
    void addAnimationListener(@Yue.InterfaceC4410 android.animation.Animator.AnimatorListener r1);

    android.animation.AnimatorSet createAnimator();

    com.google.android.material.animation.MotionSpec getCurrentMotionSpec();

    @Yue.InterfaceC0408
    int getDefaultMotionSpecResource();

    java.util.List<android.animation.Animator.AnimatorListener> getListeners();

    @Yue.InterfaceC4544
    com.google.android.material.animation.MotionSpec getMotionSpec();

    void onAnimationCancel();

    void onAnimationEnd();

    void onAnimationStart(android.animation.Animator r1);

    void onChange(@Yue.InterfaceC4544 com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r1);

    void performNow();

    void removeAnimationListener(@Yue.InterfaceC4410 android.animation.Animator.AnimatorListener r1);

    void setMotionSpec(@Yue.InterfaceC4544 com.google.android.material.animation.MotionSpec r1);

    boolean shouldCancel();
}
