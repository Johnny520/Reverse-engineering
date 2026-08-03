package com.bumptech.glide.load.resource.bitmap;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes.dex */
public class BitmapResource implements Resource<Bitmap>, Initializable {
    private final Bitmap bitmap;
    private final BitmapPool bitmapPool;

    public BitmapResource(@InterfaceC6391 Bitmap bitmap, @InterfaceC6391 BitmapPool bitmapPool) {
        this.bitmap = (Bitmap) Preconditions.checkNotNull(bitmap, "Bitmap must not be null");
        this.bitmapPool = (BitmapPool) Preconditions.checkNotNull(bitmapPool, "BitmapPool must not be null");
    }

    @InterfaceC6490
    public static BitmapResource obtain(@InterfaceC6490 Bitmap bitmap, @InterfaceC6391 BitmapPool bitmapPool) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapResource(bitmap, bitmapPool);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @InterfaceC6391
    public Class<Bitmap> getResourceClass() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return Util.getBitmapByteSize(this.bitmap);
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public void initialize() {
        this.bitmap.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
        this.bitmapPool.put(this.bitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.engine.Resource
    @InterfaceC6391
    public Bitmap get() {
        return this.bitmap;
    }
}
