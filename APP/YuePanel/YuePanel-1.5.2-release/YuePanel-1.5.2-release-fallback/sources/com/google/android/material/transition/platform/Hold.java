package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(21)
public final class Hold extends android.transition.Visibility {
    public Hold() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.transition.Visibility
    @Yue.InterfaceC4410
    public android.animation.Animator onAppear(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4544 android.transition.TransitionValues r3, @Yue.InterfaceC4544 android.transition.TransitionValues r4) {
            r0 = this;
            r1 = 1
            float[] r1 = new float[r1]
            r2 = 0
            r3 = 0
            r1[r3] = r2
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            return r1
    }

    @Override // android.transition.Visibility
    @Yue.InterfaceC4410
    public android.animation.Animator onDisappear(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4544 android.transition.TransitionValues r3, @Yue.InterfaceC4544 android.transition.TransitionValues r4) {
            r0 = this;
            r1 = 1
            float[] r1 = new float[r1]
            r2 = 0
            r3 = 0
            r1[r3] = r2
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            return r1
    }
}
