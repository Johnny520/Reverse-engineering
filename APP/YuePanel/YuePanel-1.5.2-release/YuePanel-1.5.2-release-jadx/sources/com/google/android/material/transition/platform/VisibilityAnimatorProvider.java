package com.google.android.material.transition.platform;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
public interface VisibilityAnimatorProvider {
    @InterfaceC6490
    Animator createAppear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view);

    @InterfaceC6490
    Animator createDisappear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view);
}
