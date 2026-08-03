package com.bumptech.glide.request.target;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public interface Target<R> extends LifecycleListener {
    public static final int SIZE_ORIGINAL = Integer.MIN_VALUE;

    @InterfaceC6490
    Request getRequest();

    void getSize(@InterfaceC6391 SizeReadyCallback sizeReadyCallback);

    void onLoadCleared(@InterfaceC6490 Drawable drawable);

    void onLoadFailed(@InterfaceC6490 Drawable drawable);

    void onLoadStarted(@InterfaceC6490 Drawable drawable);

    void onResourceReady(@InterfaceC6391 R r, @InterfaceC6490 Transition<? super R> transition);

    void removeCallback(@InterfaceC6391 SizeReadyCallback sizeReadyCallback);

    void setRequest(@InterfaceC6490 Request request);
}
