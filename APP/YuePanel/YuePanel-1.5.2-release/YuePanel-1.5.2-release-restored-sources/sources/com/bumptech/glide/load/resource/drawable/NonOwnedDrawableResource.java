package com.bumptech.glide.load.resource.drawable;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes.dex */
final class NonOwnedDrawableResource extends DrawableResource<Drawable> {
    private NonOwnedDrawableResource(Drawable drawable) {
        super(drawable);
    }

    @InterfaceC6490
    public static Resource<Drawable> newInstance(@InterfaceC6490 Drawable drawable) {
        if (drawable != null) {
            return new NonOwnedDrawableResource(drawable);
        }
        return null;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<android.graphics.drawable.Drawable> */
    @Override // com.bumptech.glide.load.engine.Resource
    @InterfaceC6391
    public Class<Drawable> getResourceClass() {
        return this.drawable.getClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return Math.max(1, this.drawable.getIntrinsicWidth() * this.drawable.getIntrinsicHeight() * 4);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
    }
}
