package com.kongzue.dialogx.impl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AnimatorListenerEndCallBack implements android.animation.Animator.AnimatorListener {
    public AnimatorListenerEndCallBack() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public abstract void onAnimationEnd(android.animation.Animator r1);

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            return
    }
}
