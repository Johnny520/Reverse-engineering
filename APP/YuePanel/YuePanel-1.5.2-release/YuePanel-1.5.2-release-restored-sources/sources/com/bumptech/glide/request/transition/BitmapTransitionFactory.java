package com.bumptech.glide.request.transition;

import Yue.InterfaceC6391;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class BitmapTransitionFactory extends BitmapContainerTransitionFactory<Bitmap> {
    public BitmapTransitionFactory(@InterfaceC6391 TransitionFactory<Drawable> transitionFactory) {
        super(transitionFactory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: getBitmap(Ljava/lang/Object;)Landroid/graphics/Bitmap; */
    @Override // com.bumptech.glide.request.transition.BitmapContainerTransitionFactory
    @InterfaceC6391
    public Bitmap getBitmap(@InterfaceC6391 Bitmap bitmap) {
        return bitmap;
    }
}
