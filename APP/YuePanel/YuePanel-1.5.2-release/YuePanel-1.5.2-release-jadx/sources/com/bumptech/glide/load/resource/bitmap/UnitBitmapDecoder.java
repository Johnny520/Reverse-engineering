package com.bumptech.glide.load.resource.bitmap;

import Yue.InterfaceC6391;
import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final class UnitBitmapDecoder implements ResourceDecoder<Bitmap, Bitmap> {

    public static final class NonOwnedBitmapResource implements Resource<Bitmap> {
        private final Bitmap bitmap;

        public NonOwnedBitmapResource(@InterfaceC6391 Bitmap bitmap) {
            this.bitmap = bitmap;
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

        @Override // com.bumptech.glide.load.engine.Resource
        public void recycle() {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: handles(Ljava/lang/Object;Lcom/bumptech/glide/load/Options;)Z */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@InterfaceC6391 Bitmap bitmap, @InterfaceC6391 Options options) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: decode(Ljava/lang/Object;IILcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/engine/Resource; */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<Bitmap> decode(@InterfaceC6391 Bitmap bitmap, int i, int i2, @InterfaceC6391 Options options) {
        return new NonOwnedBitmapResource(bitmap);
    }
}
