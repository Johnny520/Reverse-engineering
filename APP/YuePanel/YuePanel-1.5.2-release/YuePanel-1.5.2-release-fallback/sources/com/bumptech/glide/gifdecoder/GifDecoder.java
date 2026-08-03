package com.bumptech.glide.gifdecoder;

/* JADX INFO: loaded from: classes.dex */
public interface GifDecoder {
    public static final int STATUS_FORMAT_ERROR = 1;
    public static final int STATUS_OK = 0;
    public static final int STATUS_OPEN_ERROR = 2;
    public static final int STATUS_PARTIAL_DECODE = 3;
    public static final int TOTAL_ITERATION_COUNT_FOREVER = 0;

    public interface BitmapProvider {
        @Yue.InterfaceC4410
        android.graphics.Bitmap obtain(int r1, int r2, @Yue.InterfaceC4410 android.graphics.Bitmap.Config r3);

        @Yue.InterfaceC4410
        byte[] obtainByteArray(int r1);

        @Yue.InterfaceC4410
        int[] obtainIntArray(int r1);

        void release(@Yue.InterfaceC4410 android.graphics.Bitmap r1);

        void release(@Yue.InterfaceC4410 byte[] r1);

        void release(@Yue.InterfaceC4410 int[] r1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GifDecodeStatus {
    }

    void advance();

    void clear();

    int getByteSize();

    int getCurrentFrameIndex();

    @Yue.InterfaceC4410
    java.nio.ByteBuffer getData();

    int getDelay(int r1);

    int getFrameCount();

    int getHeight();

    @java.lang.Deprecated
    int getLoopCount();

    int getNetscapeLoopCount();

    int getNextDelay();

    @Yue.InterfaceC4544
    android.graphics.Bitmap getNextFrame();

    int getStatus();

    int getTotalIterationCount();

    int getWidth();

    int read(@Yue.InterfaceC4544 java.io.InputStream r1, int r2);

    int read(@Yue.InterfaceC4544 byte[] r1);

    void resetFrameIndex();

    void setData(@Yue.InterfaceC4410 com.bumptech.glide.gifdecoder.GifHeader r1, @Yue.InterfaceC4410 java.nio.ByteBuffer r2);

    void setData(@Yue.InterfaceC4410 com.bumptech.glide.gifdecoder.GifHeader r1, @Yue.InterfaceC4410 java.nio.ByteBuffer r2, int r3);

    void setData(@Yue.InterfaceC4410 com.bumptech.glide.gifdecoder.GifHeader r1, @Yue.InterfaceC4410 byte[] r2);

    void setDefaultBitmapConfig(@Yue.InterfaceC4410 android.graphics.Bitmap.Config r1);
}
