package com.google.android.material.transition.platform;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
public final class Hold extends Visibility {
    @Override // android.transition.Visibility
    @InterfaceC6391
    public Animator onAppear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6490 TransitionValues transitionValues, @InterfaceC6490 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // android.transition.Visibility
    @InterfaceC6391
    public Animator onDisappear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6490 TransitionValues transitionValues, @InterfaceC6490 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
