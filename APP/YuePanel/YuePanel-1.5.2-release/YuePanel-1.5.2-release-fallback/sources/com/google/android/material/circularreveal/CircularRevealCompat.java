package com.google.android.material.circularreveal;

/* JADX INFO: loaded from: classes.dex */
public final class CircularRevealCompat {


    private CircularRevealCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    public static android.animation.Animator createCircularReveal(@Yue.InterfaceC4410 com.google.android.material.circularreveal.CircularRevealWidget r3, float r4, float r5, float r6) {
            android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo> r0 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL
            android.animation.TypeEvaluator<com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo> r1 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r2 = new com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo
            r2.<init>(r4, r5, r6)
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo[] r2 = new com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo[]{r2}
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r3, r0, r1, r2)
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r1 = r3.getRevealInfo()
            if (r1 == 0) goto L33
            float r1 = r1.radius
            android.view.View r3 = (android.view.View) r3
            int r4 = (int) r4
            int r5 = (int) r5
            android.animation.Animator r3 = android.view.ViewAnimationUtils.createCircularReveal(r3, r4, r5, r1, r6)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r5 = 2
            android.animation.Animator[] r5 = new android.animation.Animator[r5]
            r6 = 0
            r5[r6] = r0
            r6 = 1
            r5[r6] = r3
            r4.playTogether(r5)
            return r4
        L33:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Caller must set a non-null RevealInfo before calling this."
            r3.<init>(r4)
            throw r3
    }

    @Yue.InterfaceC4410
    public static android.animation.Animator createCircularReveal(com.google.android.material.circularreveal.CircularRevealWidget r4, float r5, float r6, float r7, float r8) {
            android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo> r0 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL
            android.animation.TypeEvaluator<com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo> r1 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r2 = new com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo
            r2.<init>(r5, r6, r7)
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r3 = new com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo
            r3.<init>(r5, r6, r8)
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo[] r2 = new com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo[]{r2, r3}
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r4, r0, r1, r2)
            android.view.View r4 = (android.view.View) r4
            int r5 = (int) r5
            int r6 = (int) r6
            android.animation.Animator r4 = android.view.ViewAnimationUtils.createCircularReveal(r4, r5, r6, r7, r8)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r6 = 2
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r7 = 0
            r6[r7] = r0
            r7 = 1
            r6[r7] = r4
            r5.playTogether(r6)
            return r5
    }

    @Yue.InterfaceC4410
    public static android.animation.Animator.AnimatorListener createCircularRevealListener(@Yue.InterfaceC4410 com.google.android.material.circularreveal.CircularRevealWidget r1) {
            com.google.android.material.circularreveal.CircularRevealCompat$1 r0 = new com.google.android.material.circularreveal.CircularRevealCompat$1
            r0.<init>(r1)
            return r0
    }
}
