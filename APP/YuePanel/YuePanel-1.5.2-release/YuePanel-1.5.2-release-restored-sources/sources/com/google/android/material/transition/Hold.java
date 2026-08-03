package com.google.android.material.transition;

import Yue.AbstractC8388;
import Yue.C7995;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class Hold extends AbstractC8388 {
    @Override // Yue.AbstractC8388
    @InterfaceC6391
    public Animator onAppear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // Yue.AbstractC8388
    @InterfaceC6391
    public Animator onDisappear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
