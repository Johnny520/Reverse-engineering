package com.bumptech.glide.request.target;

import Yue.InterfaceC6490;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.Request;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class BaseTarget<Z> implements Target<Z> {
    private Request request;

    @Override // com.bumptech.glide.request.target.Target
    @InterfaceC6490
    public Request getRequest() {
        return this.request;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@InterfaceC6490 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadFailed(@InterfaceC6490 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadStarted(@InterfaceC6490 Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void setRequest(@InterfaceC6490 Request request) {
        this.request = request;
    }
}
