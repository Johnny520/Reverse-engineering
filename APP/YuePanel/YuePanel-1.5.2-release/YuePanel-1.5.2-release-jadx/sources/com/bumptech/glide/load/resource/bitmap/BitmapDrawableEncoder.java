package com.bumptech.glide.load.resource.bitmap;

import Yue.InterfaceC6391;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class BitmapDrawableEncoder implements ResourceEncoder<BitmapDrawable> {
    private final BitmapPool bitmapPool;
    private final ResourceEncoder<Bitmap> encoder;

    public BitmapDrawableEncoder(BitmapPool bitmapPool, ResourceEncoder<Bitmap> resourceEncoder) {
        this.bitmapPool = bitmapPool;
        this.encoder = resourceEncoder;
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    @InterfaceC6391
    public EncodeStrategy getEncodeStrategy(@InterfaceC6391 Options options) {
        return this.encoder.getEncodeStrategy(options);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/io/File;Lcom/bumptech/glide/load/Options;)Z */
    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(@InterfaceC6391 Resource<BitmapDrawable> resource, @InterfaceC6391 File file, @InterfaceC6391 Options options) {
        return this.encoder.encode((Bitmap) new BitmapResource(resource.get().getBitmap(), this.bitmapPool), file, options);
    }
}
