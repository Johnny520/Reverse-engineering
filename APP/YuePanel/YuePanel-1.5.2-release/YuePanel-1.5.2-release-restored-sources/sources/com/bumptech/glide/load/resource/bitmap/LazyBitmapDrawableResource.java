package com.bumptech.glide.load.resource.bitmap;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class LazyBitmapDrawableResource implements Resource<BitmapDrawable>, Initializable {
    private final Resource<Bitmap> bitmapResource;
    private final Resources resources;

    private LazyBitmapDrawableResource(@InterfaceC6391 Resources resources, @InterfaceC6391 Resource<Bitmap> resource) {
        this.resources = (Resources) Preconditions.checkNotNull(resources);
        this.bitmapResource = (Resource) Preconditions.checkNotNull(resource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static LazyBitmapDrawableResource obtain(Context context, Bitmap bitmap) {
        return (LazyBitmapDrawableResource) obtain(context.getResources(), BitmapResource.obtain(bitmap, Glide.get(context).getBitmapPool()));
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @InterfaceC6391
    public Class<BitmapDrawable> getResourceClass() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return this.bitmapResource.getSize();
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public void initialize() {
        Resource<Bitmap> resource = this.bitmapResource;
        if (resource instanceof Initializable) {
            ((Initializable) resource).initialize();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
        this.bitmapResource.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.engine.Resource
    @InterfaceC6391
    public BitmapDrawable get() {
        return new BitmapDrawable(this.resources, this.bitmapResource.get());
    }

    @Deprecated
    public static LazyBitmapDrawableResource obtain(Resources resources, BitmapPool bitmapPool, Bitmap bitmap) {
        return (LazyBitmapDrawableResource) obtain(resources, BitmapResource.obtain(bitmap, bitmapPool));
    }

    @InterfaceC6490
    public static Resource<BitmapDrawable> obtain(@InterfaceC6391 Resources resources, @InterfaceC6490 Resource<Bitmap> resource) {
        if (resource == null) {
            return null;
        }
        return new LazyBitmapDrawableResource(resources, resource);
    }
}
