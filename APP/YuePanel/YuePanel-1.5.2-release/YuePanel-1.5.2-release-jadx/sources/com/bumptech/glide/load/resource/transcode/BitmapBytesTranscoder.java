package com.bumptech.glide.load.resource.transcode;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class BitmapBytesTranscoder implements ResourceTranscoder<Bitmap, byte[]> {
    private final Bitmap.CompressFormat compressFormat;
    private final int quality;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BitmapBytesTranscoder() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @InterfaceC6490
    public Resource<byte[]> transcode(@InterfaceC6391 Resource<Bitmap> resource, @InterfaceC6391 Options options) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        resource.get().compress(this.compressFormat, this.quality, byteArrayOutputStream);
        resource.recycle();
        return new BytesResource(byteArrayOutputStream.toByteArray());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public BitmapBytesTranscoder(@InterfaceC6391 Bitmap.CompressFormat compressFormat, int i) {
        this.compressFormat = compressFormat;
        this.quality = i;
    }
}
