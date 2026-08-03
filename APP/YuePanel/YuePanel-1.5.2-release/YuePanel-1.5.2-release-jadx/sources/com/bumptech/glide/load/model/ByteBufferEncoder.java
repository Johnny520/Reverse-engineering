package com.bumptech.glide.load.model;

import Yue.InterfaceC6391;
import android.util.Log;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufferEncoder implements Encoder<ByteBuffer> {
    private static final String TAG = "ByteBufferEncoder";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/io/File;Lcom/bumptech/glide/load/Options;)Z */
    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(@InterfaceC6391 ByteBuffer byteBuffer, @InterfaceC6391 File file, @InterfaceC6391 Options options) throws Throwable {
        try {
            ByteBufferUtil.toFile(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Failed to write data", e);
            }
            return false;
        }
    }
}
