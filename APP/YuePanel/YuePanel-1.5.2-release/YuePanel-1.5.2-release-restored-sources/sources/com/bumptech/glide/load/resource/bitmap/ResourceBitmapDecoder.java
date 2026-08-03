package com.bumptech.glide.load.resource.bitmap;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;

/* JADX INFO: loaded from: classes.dex */
public class ResourceBitmapDecoder implements ResourceDecoder<Uri, Bitmap> {
    private final BitmapPool bitmapPool;
    private final ResourceDrawableDecoder drawableDecoder;

    public ResourceBitmapDecoder(ResourceDrawableDecoder resourceDrawableDecoder, BitmapPool bitmapPool) {
        this.drawableDecoder = resourceDrawableDecoder;
        this.bitmapPool = bitmapPool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: decode(Ljava/lang/Object;IILcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/engine/Resource; */
    @Override // com.bumptech.glide.load.ResourceDecoder
    @InterfaceC6490
    public Resource<Bitmap> decode(@InterfaceC6391 Uri uri, int i, int i2, @InterfaceC6391 Options options) {
        Resource<Drawable> resourceDecode = this.drawableDecoder.decode(uri, i, i2, options);
        if (resourceDecode == null) {
            return null;
        }
        return DrawableToBitmapConverter.convert(this.bitmapPool, resourceDecode.get(), i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: handles(Ljava/lang/Object;Lcom/bumptech/glide/load/Options;)Z */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@InterfaceC6391 Uri uri, @InterfaceC6391 Options options) {
        return "android.resource".equals(uri.getScheme());
    }
}
