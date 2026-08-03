package com.google.android.material.animation;

import Yue.InterfaceC6391;

/* JADX INFO: loaded from: classes.dex */
public interface AnimatableView {

    public interface Listener {
        void onAnimationEnd();
    }

    void startAnimation(@InterfaceC6391 Listener listener);

    void stopAnimation();
}
