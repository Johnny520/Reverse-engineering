package com.bumptech.glide.load.resource.bitmap;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.BufferedOutputStream;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.GlideTrace;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class BitmapEncoder implements ResourceEncoder<Bitmap> {
    private static final String TAG = "BitmapEncoder";

    @InterfaceC6490
    private final ArrayPool arrayPool;
    public static final Option<Integer> COMPRESSION_QUALITY = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final Option<Bitmap.CompressFormat> COMPRESSION_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BitmapEncoder(@InterfaceC6391 ArrayPool arrayPool) {
        this.arrayPool = arrayPool;
    }

    private Bitmap.CompressFormat getFormat(Bitmap bitmap, Options options) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) options.get(COMPRESSION_FORMAT);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    @InterfaceC6391
    public EncodeStrategy getEncodeStrategy(@InterfaceC6391 Options options) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/io/File;Lcom/bumptech/glide/load/Options;)Z */
    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(@InterfaceC6391 Resource<Bitmap> resource, @InterfaceC6391 File file, @InterfaceC6391 Options options) {
        boolean z;
        FileOutputStream fileOutputStream;
        Bitmap bitmap = resource.get();
        Bitmap.CompressFormat format = getFormat(bitmap, options);
        GlideTrace.beginSectionFormat("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), format);
        try {
            long logTime = LogTime.getLogTime();
            int iIntValue = ((Integer) options.get(COMPRESSION_QUALITY)).intValue();
            OutputStream bufferedOutputStream = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            }
            try {
                bufferedOutputStream = this.arrayPool != null ? new BufferedOutputStream(fileOutputStream, this.arrayPool) : fileOutputStream;
                bitmap.compress(format, iIntValue, bufferedOutputStream);
                bufferedOutputStream.close();
                try {
                    bufferedOutputStream.close();
                } catch (IOException unused) {
                }
                z = true;
            } catch (IOException e2) {
                e = e2;
                bufferedOutputStream = fileOutputStream;
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Failed to encode Bitmap", e);
                }
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                z = false;
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = fileOutputStream;
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Compressed with type: " + format + " of size " + Util.getBitmapByteSize(bitmap) + " in " + LogTime.getElapsedMillis(logTime) + ", options format: " + options.get(COMPRESSION_FORMAT) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } finally {
            GlideTrace.endSection();
        }
    }

    @Deprecated
    public BitmapEncoder() {
        this.arrayPool = null;
    }
}
