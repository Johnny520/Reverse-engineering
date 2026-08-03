package com.bumptech.glide.load.resource.gif;

import Yue.InterfaceC6391;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class GifDrawableEncoder implements ResourceEncoder<GifDrawable> {
    private static final String TAG = "GifEncoder";

    @Override // com.bumptech.glide.load.ResourceEncoder
    @InterfaceC6391
    public EncodeStrategy getEncodeStrategy(@InterfaceC6391 Options options) {
        return EncodeStrategy.SOURCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/io/File;Lcom/bumptech/glide/load/Options;)Z */
    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(@InterfaceC6391 Resource<GifDrawable> resource, @InterfaceC6391 File file, @InterfaceC6391 Options options) throws Throwable {
        try {
            ByteBufferUtil.toFile(resource.get().getBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
