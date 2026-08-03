package com.google.android.material.internal;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class FadeThroughUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    private final float[] alphas = new float[2];

    @InterfaceC6490
    private final View fadeInView;

    @InterfaceC6490
    private final View fadeOutView;

    public FadeThroughUpdateListener(@InterfaceC6490 View view, @InterfaceC6490 View view2) {
        this.fadeOutView = view;
        this.fadeInView = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@InterfaceC6391 ValueAnimator valueAnimator) {
        FadeThroughUtils.calculateFadeOutAndInAlphas(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.alphas);
        View view = this.fadeOutView;
        if (view != null) {
            view.setAlpha(this.alphas[0]);
        }
        View view2 = this.fadeInView;
        if (view2 != null) {
            view2.setAlpha(this.alphas[1]);
        }
    }
}
