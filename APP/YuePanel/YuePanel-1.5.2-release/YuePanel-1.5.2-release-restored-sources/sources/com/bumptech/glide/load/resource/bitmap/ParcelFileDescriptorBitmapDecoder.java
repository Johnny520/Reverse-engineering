package com.bumptech.glide.load.resource.bitmap;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
public final class ParcelFileDescriptorBitmapDecoder implements ResourceDecoder<ParcelFileDescriptor, Bitmap> {
    private static final int MAXIMUM_FILE_BYTE_SIZE_FOR_FILE_DESCRIPTOR_DECODER = 536870912;
    private final Downsampler downsampler;

    public ParcelFileDescriptorBitmapDecoder(Downsampler downsampler) {
        this.downsampler = downsampler;
    }

    private boolean isSafeToTryDecoding(@InterfaceC6391 ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: decode(Ljava/lang/Object;IILcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/engine/Resource; */
    @Override // com.bumptech.glide.load.ResourceDecoder
    @InterfaceC6490
    public Resource<Bitmap> decode(@InterfaceC6391 ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @InterfaceC6391 Options options) throws IOException {
        return this.downsampler.decode(parcelFileDescriptor, i, i2, options);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: handles(Ljava/lang/Object;Lcom/bumptech/glide/load/Options;)Z */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@InterfaceC6391 ParcelFileDescriptor parcelFileDescriptor, @InterfaceC6391 Options options) {
        return isSafeToTryDecoding(parcelFileDescriptor) && this.downsampler.handles(parcelFileDescriptor);
    }
}
