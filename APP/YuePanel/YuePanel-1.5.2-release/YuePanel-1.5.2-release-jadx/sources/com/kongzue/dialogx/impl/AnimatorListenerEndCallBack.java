package com.kongzue.dialogx.impl;

import android.animation.Animator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AnimatorListenerEndCallBack implements Animator.AnimatorListener {
    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public abstract void onAnimationEnd(Animator animator);

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
