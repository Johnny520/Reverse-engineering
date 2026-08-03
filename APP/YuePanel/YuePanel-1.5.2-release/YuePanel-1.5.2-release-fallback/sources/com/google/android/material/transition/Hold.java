package com.google.android.material.transition;

/* JADX INFO: loaded from: classes.dex */
public final class Hold extends Yue.AbstractC6953 {
    public Hold() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.AbstractC6953
    @Yue.InterfaceC4410
    public android.animation.Animator onAppear(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4544 Yue.C6447 r3, @Yue.InterfaceC4544 Yue.C6447 r4) {
            r0 = this;
            r1 = 1
            float[] r1 = new float[r1]
            r2 = 0
            r3 = 0
            r1[r3] = r2
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            return r1
    }

    @Override // Yue.AbstractC6953
    @Yue.InterfaceC4410
    public android.animation.Animator onDisappear(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4544 Yue.C6447 r3, @Yue.InterfaceC4544 Yue.C6447 r4) {
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
