package com.bumptech.glide.load.resource.bitmap;

import Yue.InterfaceC6391;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.BitmapTransitionFactory;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;
import com.bumptech.glide.request.transition.TransitionFactory;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapTransitionOptions extends TransitionOptions<BitmapTransitionOptions, Bitmap> {
    @InterfaceC6391
    public static BitmapTransitionOptions with(@InterfaceC6391 TransitionFactory<Bitmap> transitionFactory) {
        return new BitmapTransitionOptions().transition(transitionFactory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static BitmapTransitionOptions withCrossFade() {
        return new BitmapTransitionOptions().crossFade();
    }

    @InterfaceC6391
    public static BitmapTransitionOptions withWrapped(@InterfaceC6391 TransitionFactory<Drawable> transitionFactory) {
        return new BitmapTransitionOptions().transitionUsing(transitionFactory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public BitmapTransitionOptions crossFade() {
        return crossFade(new DrawableCrossFadeFactory.Builder());
    }

    @Override // com.bumptech.glide.TransitionOptions
    public boolean equals(Object obj) {
        return (obj instanceof BitmapTransitionOptions) && super.equals(obj);
    }

    @Override // com.bumptech.glide.TransitionOptions
    public int hashCode() {
        return super.hashCode();
    }

    @InterfaceC6391
    public BitmapTransitionOptions transitionUsing(@InterfaceC6391 TransitionFactory<Drawable> transitionFactory) {
        return transition(new BitmapTransitionFactory(transitionFactory));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static BitmapTransitionOptions withCrossFade(int i) {
        return new BitmapTransitionOptions().crossFade(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public BitmapTransitionOptions crossFade(int i) {
        return crossFade(new DrawableCrossFadeFactory.Builder(i));
    }

    @InterfaceC6391
    public static BitmapTransitionOptions withCrossFade(@InterfaceC6391 DrawableCrossFadeFactory drawableCrossFadeFactory) {
        return new BitmapTransitionOptions().crossFade(drawableCrossFadeFactory);
    }

    @InterfaceC6391
    public BitmapTransitionOptions crossFade(@InterfaceC6391 DrawableCrossFadeFactory drawableCrossFadeFactory) {
        return transitionUsing(drawableCrossFadeFactory);
    }

    @InterfaceC6391
    public static BitmapTransitionOptions withCrossFade(@InterfaceC6391 DrawableCrossFadeFactory.Builder builder) {
        return new BitmapTransitionOptions().crossFade(builder);
    }

    @InterfaceC6391
    public BitmapTransitionOptions crossFade(@InterfaceC6391 DrawableCrossFadeFactory.Builder builder) {
        return transitionUsing(builder.build());
    }
}
