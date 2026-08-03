package com.google.android.material.internal;

import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    private final Listener listener;
    private final View[] views;

    public interface Listener {
        void onAnimationUpdate(@InterfaceC6391 ValueAnimator valueAnimator, @InterfaceC6391 View view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@InterfaceC6391 Listener listener, @InterfaceC6391 View... viewArr) {
        this.listener = listener;
        this.views = viewArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static MultiViewUpdateListener alphaListener(@InterfaceC6391 View... viewArr) {
        return new MultiViewUpdateListener(new C9004(), viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static MultiViewUpdateListener scaleListener(@InterfaceC6391 View... viewArr) {
        return new MultiViewUpdateListener(new C2126(), viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setAlpha(@InterfaceC6391 ValueAnimator valueAnimator, @InterfaceC6391 View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setScale(@InterfaceC6391 ValueAnimator valueAnimator, @InterfaceC6391 View view) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationX(@InterfaceC6391 ValueAnimator valueAnimator, @InterfaceC6391 View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationY(@InterfaceC6391 ValueAnimator valueAnimator, @InterfaceC6391 View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static MultiViewUpdateListener translationXListener(@InterfaceC6391 View... viewArr) {
        return new MultiViewUpdateListener(new C2125(), viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static MultiViewUpdateListener translationYListener(@InterfaceC6391 View... viewArr) {
        return new MultiViewUpdateListener(new C9003(), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@InterfaceC6391 ValueAnimator valueAnimator) {
        for (View view : this.views) {
            this.listener.onAnimationUpdate(valueAnimator, view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static MultiViewUpdateListener alphaListener(@InterfaceC6391 Collection<View> collection) {
        return new MultiViewUpdateListener(new C9004(), collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static MultiViewUpdateListener scaleListener(@InterfaceC6391 Collection<View> collection) {
        return new MultiViewUpdateListener(new C2126(), collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static MultiViewUpdateListener translationXListener(@InterfaceC6391 Collection<View> collection) {
        return new MultiViewUpdateListener(new C2125(), collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static MultiViewUpdateListener translationYListener(@InterfaceC6391 Collection<View> collection) {
        return new MultiViewUpdateListener(new C9003(), collection);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@InterfaceC6391 Listener listener, @InterfaceC6391 Collection<View> collection) {
        this.listener = listener;
        this.views = (View[]) collection.toArray(new View[0]);
    }
}
