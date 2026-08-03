package com.bumptech.glide.integration.gifencoder;

/* JADX INFO: loaded from: classes.dex */
public class ReEncodingGifResourceEncoder implements com.bumptech.glide.load.ResourceEncoder<com.bumptech.glide.load.resource.gif.GifDrawable> {
    public static final com.bumptech.glide.load.Option<java.lang.Boolean> ENCODE_TRANSFORMATION = null;
    private static final com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder.Factory FACTORY = null;
    private static final java.lang.String KEY_ENCODE_TRANSFORMATION = "com.bumptech.glide.load.resource.gif.GifResourceEncoder.EncodeTransformation";
    private static final java.lang.String TAG = "GifEncoder";
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final android.content.Context context;
    private final com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder.Factory factory;
    private final com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider provider;


    @Yue.InterfaceC6959
    public static class Factory {
        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.bumptech.glide.gifdecoder.GifDecoder buildDecoder(com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider r2) {
                r1 = this;
                com.bumptech.glide.gifdecoder.StandardGifDecoder r0 = new com.bumptech.glide.gifdecoder.StandardGifDecoder
                r0.<init>(r2)
                return r0
        }

        public com.bumptech.glide.gifencoder.AnimatedGifEncoder buildEncoder() {
                r1 = this;
                com.bumptech.glide.gifencoder.AnimatedGifEncoder r0 = new com.bumptech.glide.gifencoder.AnimatedGifEncoder
                r0.<init>()
                return r0
        }

        @Yue.InterfaceC4410
        public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> buildFrameResource(@Yue.InterfaceC4410 android.graphics.Bitmap r2, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3) {
                r1 = this;
                com.bumptech.glide.load.resource.bitmap.BitmapResource r0 = new com.bumptech.glide.load.resource.bitmap.BitmapResource
                r0.<init>(r2, r3)
                return r0
        }

        public com.bumptech.glide.gifdecoder.GifHeaderParser buildParser() {
                r1 = this;
                com.bumptech.glide.gifdecoder.GifHeaderParser r0 = new com.bumptech.glide.gifdecoder.GifHeaderParser
                r0.<init>()
                return r0
        }
    }

    static {
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder$1 r1 = new com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder$1
            r1.<init>()
            java.lang.String r2 = "com.bumptech.glide.load.resource.gif.GifResourceEncoder.EncodeTransformation"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.disk(r2, r0, r1)
            com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder.ENCODE_TRANSFORMATION = r0
            com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder$Factory r0 = new com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder$Factory
            r0.<init>()
            com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder.FACTORY = r0
            return
    }

    public ReEncodingGifResourceEncoder(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3) {
            r1 = this;
            com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder$Factory r0 = com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder.FACTORY
            r1.<init>(r2, r3, r0)
            return
    }

    @Yue.InterfaceC6959
    public ReEncodingGifResourceEncoder(android.content.Context r1, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2, com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder.Factory r3) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.bitmapPool = r2
            com.bumptech.glide.load.resource.gif.GifBitmapProvider r1 = new com.bumptech.glide.load.resource.gif.GifBitmapProvider
            r1.<init>(r2)
            r0.provider = r1
            r0.factory = r3
            return
    }

    private com.bumptech.glide.gifdecoder.GifDecoder decodeHeaders(java.nio.ByteBuffer r4) {
            r3 = this;
            com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder$Factory r0 = r3.factory
            com.bumptech.glide.gifdecoder.GifHeaderParser r0 = r0.buildParser()
            r0.setData(r4)
            com.bumptech.glide.gifdecoder.GifHeader r0 = r0.parseHeader()
            com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder$Factory r1 = r3.factory
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r2 = r3.provider
            com.bumptech.glide.gifdecoder.GifDecoder r1 = r1.buildDecoder(r2)
            r1.setData(r0, r4)
            r1.advance()
            return r1
    }

    private boolean encodeTransformedToFile(com.bumptech.glide.load.resource.gif.GifDrawable r8, java.io.File r9) {
            r7 = this;
            java.lang.String r0 = "GifEncoder"
            long r1 = com.bumptech.glide.util.LogTime.getLogTime()
            r3 = 0
            r4 = 0
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            boolean r4 = r7.encodeTransformedToStream(r8, r5)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L20
            r5.close()     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L20
            r5.close()     // Catch: java.io.IOException -> L37
            goto L37
        L1d:
            r8 = move-exception
            r3 = r5
            goto L78
        L20:
            r9 = move-exception
            r3 = r5
            goto L26
        L23:
            r8 = move-exception
            goto L78
        L25:
            r9 = move-exception
        L26:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L32
            java.lang.String r5 = "Failed to encode GIF"
            android.util.Log.d(r0, r5, r9)     // Catch: java.lang.Throwable -> L23
        L32:
            if (r3 == 0) goto L37
            r3.close()     // Catch: java.io.IOException -> L37
        L37:
            r9 = 2
            boolean r9 = android.util.Log.isLoggable(r0, r9)
            if (r9 == 0) goto L77
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = "Re-encoded GIF with "
            r9.append(r3)
            int r3 = r8.getFrameCount()
            r9.append(r3)
            java.lang.String r3 = " frames and "
            r9.append(r3)
            java.nio.ByteBuffer r8 = r8.getBuffer()
            int r8 = r8.limit()
            r9.append(r8)
            java.lang.String r8 = " bytes in "
            r9.append(r8)
            double r1 = com.bumptech.glide.util.LogTime.getElapsedMillis(r1)
            r9.append(r1)
            java.lang.String r8 = " ms"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.v(r0, r8)
        L77:
            return r4
        L78:
            if (r3 == 0) goto L7d
            r3.close()     // Catch: java.io.IOException -> L7d
        L7d:
            throw r8
    }

    private boolean encodeTransformedToStream(com.bumptech.glide.load.resource.gif.GifDrawable r7, java.io.OutputStream r8) {
            r6 = this;
            com.bumptech.glide.load.Transformation r0 = r7.getFrameTransformation()
            java.nio.ByteBuffer r1 = r7.getBuffer()
            com.bumptech.glide.gifdecoder.GifDecoder r1 = r6.decodeHeaders(r1)
            com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder$Factory r2 = r6.factory
            com.bumptech.glide.gifencoder.AnimatedGifEncoder r2 = r2.buildEncoder()
            boolean r8 = r2.start(r8)
            r3 = 0
            if (r8 != 0) goto L1a
            return r3
        L1a:
            r8 = r3
        L1b:
            int r4 = r1.getFrameCount()
            if (r8 >= r4) goto L52
            android.graphics.Bitmap r4 = r1.getNextFrame()
            com.bumptech.glide.load.engine.Resource r4 = r6.getTransformedFrame(r4, r0, r7)
            java.lang.Object r5 = r4.get()     // Catch: java.lang.Throwable -> L4d
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5     // Catch: java.lang.Throwable -> L4d
            boolean r5 = r2.addFrame(r5)     // Catch: java.lang.Throwable -> L4d
            if (r5 != 0) goto L39
            r4.recycle()
            return r3
        L39:
            int r5 = r1.getCurrentFrameIndex()     // Catch: java.lang.Throwable -> L4d
            int r5 = r1.getDelay(r5)     // Catch: java.lang.Throwable -> L4d
            r2.setDelay(r5)     // Catch: java.lang.Throwable -> L4d
            r1.advance()     // Catch: java.lang.Throwable -> L4d
            r4.recycle()
            int r8 = r8 + 1
            goto L1b
        L4d:
            r7 = move-exception
            r4.recycle()
            throw r7
        L52:
            boolean r7 = r2.finish()
            return r7
    }

    private com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> getTransformedFrame(android.graphics.Bitmap r3, com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r4, com.bumptech.glide.load.resource.gif.GifDrawable r5) {
            r2 = this;
            com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder$Factory r0 = r2.factory
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r2.bitmapPool
            com.bumptech.glide.load.engine.Resource r3 = r0.buildFrameResource(r3, r1)
            android.content.Context r0 = r2.context
            int r1 = r5.getIntrinsicWidth()
            int r5 = r5.getIntrinsicHeight()
            com.bumptech.glide.load.engine.Resource r4 = r4.transform(r0, r3, r1, r5)
            boolean r5 = r3.equals(r4)
            if (r5 != 0) goto L1f
            r3.recycle()
        L1f:
            return r4
    }

    private boolean writeDataDirect(java.nio.ByteBuffer r2, java.io.File r3) {
            r1 = this;
            com.bumptech.glide.util.ByteBufferUtil.toFile(r2, r3)     // Catch: java.io.IOException -> L5
            r2 = 1
            return r2
        L5:
            r2 = move-exception
            r3 = 5
            java.lang.String r0 = "GifEncoder"
            boolean r3 = android.util.Log.isLoggable(r0, r3)
            if (r3 == 0) goto L14
            java.lang.String r3 = "Failed to write GIF data"
            android.util.Log.w(r0, r3, r2)
        L14:
            r2 = 0
            return r2
    }

    public boolean encode(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> r2, @Yue.InterfaceC4410 java.io.File r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r4) {
            r1 = this;
            java.lang.Object r2 = r2.get()
            com.bumptech.glide.load.resource.gif.GifDrawable r2 = (com.bumptech.glide.load.resource.gif.GifDrawable) r2
            com.bumptech.glide.load.Transformation r0 = r2.getFrameTransformation()
            boolean r0 = r0 instanceof com.bumptech.glide.load.resource.UnitTransformation
            r0 = r0 ^ 1
            if (r0 == 0) goto L23
            com.bumptech.glide.load.Option<java.lang.Boolean> r0 = com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder.ENCODE_TRANSFORMATION
            java.lang.Object r4 = r4.get(r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L23
            boolean r2 = r1.encodeTransformedToFile(r2, r3)
            return r2
        L23:
            java.nio.ByteBuffer r2 = r2.getBuffer()
            boolean r2 = r1.writeDataDirect(r2, r3)
            return r2
    }

    @Override // com.bumptech.glide.load.Encoder
    public /* bridge */ /* synthetic */ boolean encode(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 java.io.File r2, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r3) {
            r0 = this;
            com.bumptech.glide.load.engine.Resource r1 = (com.bumptech.glide.load.engine.Resource) r1
            boolean r1 = r0.encode(r1, r2, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    @Yue.InterfaceC4410
    public com.bumptech.glide.load.EncodeStrategy getEncodeStrategy(@Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) {
            r1 = this;
            com.bumptech.glide.load.Option<java.lang.Boolean> r0 = com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder.ENCODE_TRANSFORMATION
            java.lang.Object r2 = r2.get(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L13
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L13
            com.bumptech.glide.load.EncodeStrategy r2 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED
            goto L15
        L13:
            com.bumptech.glide.load.EncodeStrategy r2 = com.bumptech.glide.load.EncodeStrategy.SOURCE
        L15:
            return r2
    }
}
