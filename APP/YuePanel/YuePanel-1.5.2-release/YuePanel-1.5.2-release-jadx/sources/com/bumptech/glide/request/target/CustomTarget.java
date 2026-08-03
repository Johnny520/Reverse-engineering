package com.bumptech.glide.request.target;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTarget<T> implements Target<T> {
    private final int height;

    @InterfaceC6490
    private Request request;
    private final int width;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CustomTarget() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.Target
    @InterfaceC6490
    public final Request getRequest() {
        return this.request;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(@InterfaceC6391 SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.onSizeReady(this.width, this.height);
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
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
    public final void removeCallback(@InterfaceC6391 SizeReadyCallback sizeReadyCallback) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void setRequest(@InterfaceC6490 Request request) {
        this.request = request;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CustomTarget(int i, int i2) {
        if (Util.isValidDimensions(i, i2)) {
            this.width = i;
            this.height = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
