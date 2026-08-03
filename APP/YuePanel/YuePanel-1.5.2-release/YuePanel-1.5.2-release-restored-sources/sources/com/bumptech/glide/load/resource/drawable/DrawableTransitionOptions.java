package com.bumptech.glide.load.resource.drawable;

import Yue.InterfaceC6391;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;
import com.bumptech.glide.request.transition.TransitionFactory;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableTransitionOptions extends TransitionOptions<DrawableTransitionOptions, Drawable> {
    @InterfaceC6391
    public static DrawableTransitionOptions with(@InterfaceC6391 TransitionFactory<Drawable> transitionFactory) {
        return new DrawableTransitionOptions().transition(transitionFactory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static DrawableTransitionOptions withCrossFade() {
        return new DrawableTransitionOptions().crossFade();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public DrawableTransitionOptions crossFade() {
        return crossFade(new DrawableCrossFadeFactory.Builder());
    }

    @Override // com.bumptech.glide.TransitionOptions
    public boolean equals(Object obj) {
        return (obj instanceof DrawableTransitionOptions) && super.equals(obj);
    }

    @Override // com.bumptech.glide.TransitionOptions
    public int hashCode() {
        return super.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static DrawableTransitionOptions withCrossFade(int i) {
        return new DrawableTransitionOptions().crossFade(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public DrawableTransitionOptions crossFade(int i) {
        return crossFade(new DrawableCrossFadeFactory.Builder(i));
    }

    @InterfaceC6391
    public static DrawableTransitionOptions withCrossFade(@InterfaceC6391 DrawableCrossFadeFactory drawableCrossFadeFactory) {
        return new DrawableTransitionOptions().crossFade(drawableCrossFadeFactory);
    }

    @InterfaceC6391
    public DrawableTransitionOptions crossFade(@InterfaceC6391 DrawableCrossFadeFactory drawableCrossFadeFactory) {
        return transition(drawableCrossFadeFactory);
    }

    @InterfaceC6391
    public static DrawableTransitionOptions withCrossFade(@InterfaceC6391 DrawableCrossFadeFactory.Builder builder) {
        return new DrawableTransitionOptions().crossFade(builder);
    }

    @InterfaceC6391
    public DrawableTransitionOptions crossFade(@InterfaceC6391 DrawableCrossFadeFactory.Builder builder) {
        return crossFade(builder.build());
    }
}
