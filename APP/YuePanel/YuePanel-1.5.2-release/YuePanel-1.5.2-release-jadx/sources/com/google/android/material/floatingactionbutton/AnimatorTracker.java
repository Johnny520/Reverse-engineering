package com.google.android.material.floatingactionbutton;

import Yue.InterfaceC6490;
import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
class AnimatorTracker {

    @InterfaceC6490
    private Animator currentAnimator;

    public void cancelCurrent() {
        Animator animator = this.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void clear() {
        this.currentAnimator = null;
    }

    public void onNextAnimationStart(Animator animator) {
        cancelCurrent();
        this.currentAnimator = animator;
    }
}
