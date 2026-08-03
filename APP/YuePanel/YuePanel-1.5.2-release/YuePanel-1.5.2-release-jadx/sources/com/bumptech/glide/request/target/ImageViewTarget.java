package com.bumptech.glide.request.target;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageViewTarget<Z> extends ViewTarget<ImageView, Z> implements Transition.ViewAdapter {

    @InterfaceC6490
    private Animatable animatable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    private void maybeUpdateAnimatable(@InterfaceC6490 Z z) {
        if (!(z instanceof Animatable)) {
            this.animatable = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.animatable = animatable;
        animatable.start();
    }

    private void setResourceInternal(@InterfaceC6490 Z z) {
        setResource(z);
        maybeUpdateAnimatable(z);
    }

    @Override // com.bumptech.glide.request.transition.Transition.ViewAdapter
    @InterfaceC6490
    public Drawable getCurrentDrawable() {
        return ((ImageView) this.view).getDrawable();
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadCleared(@InterfaceC6490 Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadFailed(@InterfaceC6490 Drawable drawable) {
        super.onLoadFailed(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadStarted(@InterfaceC6490 Drawable drawable) {
        super.onLoadStarted(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onResourceReady(@InterfaceC6391 Z z, @InterfaceC6490 Transition<? super Z> transition) {
        if (transition == null || !transition.transition(z, this)) {
            setResourceInternal(z);
        } else {
            maybeUpdateAnimatable(z);
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bumptech.glide.request.transition.Transition.ViewAdapter
    public void setDrawable(Drawable drawable) {
        ((ImageView) this.view).setImageDrawable(drawable);
    }

    public abstract void setResource(@InterfaceC6490 Z z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public ImageViewTarget(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
