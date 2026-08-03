package com.bumptech.glide;

import Yue.InterfaceC6391;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.request.transition.ViewPropertyTransition;

/* JADX INFO: loaded from: classes.dex */
public final class GenericTransitionOptions<TranscodeType> extends TransitionOptions<GenericTransitionOptions<TranscodeType>, TranscodeType> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static <TranscodeType> GenericTransitionOptions<TranscodeType> with(int i) {
        return new GenericTransitionOptions().transition(i);
    }

    @InterfaceC6391
    public static <TranscodeType> GenericTransitionOptions<TranscodeType> withNoTransition() {
        return new GenericTransitionOptions().dontTransition();
    }

    @Override // com.bumptech.glide.TransitionOptions
    public boolean equals(Object obj) {
        return (obj instanceof GenericTransitionOptions) && super.equals(obj);
    }

    @Override // com.bumptech.glide.TransitionOptions
    public int hashCode() {
        return super.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static <TranscodeType> GenericTransitionOptions<TranscodeType> with(@InterfaceC6391 ViewPropertyTransition.Animator animator) {
        return new GenericTransitionOptions().transition(animator);
    }

    @InterfaceC6391
    public static <TranscodeType> GenericTransitionOptions<TranscodeType> with(@InterfaceC6391 TransitionFactory<? super TranscodeType> transitionFactory) {
        return new GenericTransitionOptions().transition(transitionFactory);
    }
}
