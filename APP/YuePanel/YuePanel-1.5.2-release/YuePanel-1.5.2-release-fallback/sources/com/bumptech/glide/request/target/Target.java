package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes.dex */
public interface Target<R> extends com.bumptech.glide.manager.LifecycleListener {
    public static final int SIZE_ORIGINAL = Integer.MIN_VALUE;

    @Yue.InterfaceC4544
    com.bumptech.glide.request.Request getRequest();

    void getSize(@Yue.InterfaceC4410 com.bumptech.glide.request.target.SizeReadyCallback r1);

    void onLoadCleared(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1);

    void onLoadFailed(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1);

    void onLoadStarted(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1);

    void onResourceReady(@Yue.InterfaceC4410 R r1, @Yue.InterfaceC4544 com.bumptech.glide.request.transition.Transition<? super R> r2);

    void removeCallback(@Yue.InterfaceC4410 com.bumptech.glide.request.target.SizeReadyCallback r1);

    void setRequest(@Yue.InterfaceC4544 com.bumptech.glide.request.Request r1);
}
