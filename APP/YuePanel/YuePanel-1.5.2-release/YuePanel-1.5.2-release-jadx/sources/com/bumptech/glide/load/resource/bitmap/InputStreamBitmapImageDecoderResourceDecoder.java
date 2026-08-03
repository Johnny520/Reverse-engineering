package com.bumptech.glide.load.resource.bitmap;

import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(api = 28)
public final class InputStreamBitmapImageDecoderResourceDecoder implements ResourceDecoder<InputStream, Bitmap> {
    private final BitmapImageDecoderResourceDecoder wrapped = new BitmapImageDecoderResourceDecoder();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: handles(Ljava/lang/Object;Lcom/bumptech/glide/load/Options;)Z */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@InterfaceC6391 InputStream inputStream, @InterfaceC6391 Options options) throws IOException {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: decode(Ljava/lang/Object;IILcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/engine/Resource; */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<Bitmap> decode(@InterfaceC6391 InputStream inputStream, int i, int i2, @InterfaceC6391 Options options) throws IOException {
        return this.wrapped.decode2(ImageDecoder.createSource(ByteBufferUtil.fromStream(inputStream)), i, i2, options);
    }
}
