package com.bumptech.glide.gifdecoder;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.Bitmap;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface GifDecoder {
    public static final int STATUS_FORMAT_ERROR = 1;
    public static final int STATUS_OK = 0;
    public static final int STATUS_OPEN_ERROR = 2;
    public static final int STATUS_PARTIAL_DECODE = 3;
    public static final int TOTAL_ITERATION_COUNT_FOREVER = 0;

    public interface BitmapProvider {
        @InterfaceC6391
        Bitmap obtain(int i, int i2, @InterfaceC6391 Bitmap.Config config);

        @InterfaceC6391
        byte[] obtainByteArray(int i);

        @InterfaceC6391
        int[] obtainIntArray(int i);

        void release(@InterfaceC6391 Bitmap bitmap);

        void release(@InterfaceC6391 byte[] bArr);

        void release(@InterfaceC6391 int[] iArr);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GifDecodeStatus {
    }

    void advance();

    void clear();

    int getByteSize();

    int getCurrentFrameIndex();

    @InterfaceC6391
    ByteBuffer getData();

    int getDelay(int i);

    int getFrameCount();

    int getHeight();

    @Deprecated
    int getLoopCount();

    int getNetscapeLoopCount();

    int getNextDelay();

    @InterfaceC6490
    Bitmap getNextFrame();

    int getStatus();

    int getTotalIterationCount();

    int getWidth();

    int read(@InterfaceC6490 InputStream inputStream, int i);

    int read(@InterfaceC6490 byte[] bArr);

    void resetFrameIndex();

    void setData(@InterfaceC6391 GifHeader gifHeader, @InterfaceC6391 ByteBuffer byteBuffer);

    void setData(@InterfaceC6391 GifHeader gifHeader, @InterfaceC6391 ByteBuffer byteBuffer, int i);

    void setData(@InterfaceC6391 GifHeader gifHeader, @InterfaceC6391 byte[] bArr);

    void setDefaultBitmapConfig(@InterfaceC6391 Bitmap.Config config);
}
