package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public class VideoDecoder<T> implements com.bumptech.glide.load.ResourceDecoder<T, android.graphics.Bitmap> {
    private static final com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverFactory DEFAULT_FACTORY = null;
    public static final long DEFAULT_FRAME = -1;

    @Yue.InterfaceC6959
    static final int DEFAULT_FRAME_OPTION = 2;
    public static final com.bumptech.glide.load.Option<java.lang.Integer> FRAME_OPTION = null;
    private static final java.util.List<java.lang.String> PIXEL_T_BUILD_ID_PREFIXES_REQUIRING_HDR_180_ROTATION_FIX = null;
    private static final java.lang.String TAG = "VideoDecoder";
    public static final com.bumptech.glide.load.Option<java.lang.Long> TARGET_FRAME = null;
    private static final java.lang.String WEBM_MIME_TYPE = "video/webm";
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverFactory factory;
    private final com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer<T> initializer;



    @Yue.InterfaceC5336(16)
    public static final class AssetFileDescriptorInitializer implements com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer<android.content.res.AssetFileDescriptor> {
        private AssetFileDescriptorInitializer() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ AssetFileDescriptorInitializer(com.bumptech.glide.load.resource.bitmap.VideoDecoder.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: initializeExtractor, reason: avoid collision after fix types in other method */
        public void initializeExtractor2(android.media.MediaExtractor r7, android.content.res.AssetFileDescriptor r8) throws java.io.IOException {
                r6 = this;
                java.io.FileDescriptor r1 = r8.getFileDescriptor()
                long r2 = r8.getStartOffset()
                long r4 = r8.getLength()
                r0 = r7
                r0.setDataSource(r1, r2, r4)
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public /* bridge */ /* synthetic */ void initializeExtractor(android.media.MediaExtractor r1, android.content.res.AssetFileDescriptor r2) throws java.io.IOException {
                r0 = this;
                android.content.res.AssetFileDescriptor r2 = (android.content.res.AssetFileDescriptor) r2
                r0.initializeExtractor2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: initializeRetriever, reason: avoid collision after fix types in other method */
        public void initializeRetriever2(android.media.MediaMetadataRetriever r7, android.content.res.AssetFileDescriptor r8) {
                r6 = this;
                java.io.FileDescriptor r1 = r8.getFileDescriptor()
                long r2 = r8.getStartOffset()
                long r4 = r8.getLength()
                r0 = r7
                r0.setDataSource(r1, r2, r4)
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public /* bridge */ /* synthetic */ void initializeRetriever(android.media.MediaMetadataRetriever r1, android.content.res.AssetFileDescriptor r2) {
                r0 = this;
                android.content.res.AssetFileDescriptor r2 = (android.content.res.AssetFileDescriptor) r2
                r0.initializeRetriever2(r1, r2)
                return
        }
    }

    @Yue.InterfaceC5336(23)
    public static final class ByteBufferInitializer implements com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer<java.nio.ByteBuffer> {


        public ByteBufferInitializer() {
                r0 = this;
                r0.<init>()
                return
        }

        private android.media.MediaDataSource getMediaDataSource(java.nio.ByteBuffer r2) {
                r1 = this;
                com.bumptech.glide.load.resource.bitmap.VideoDecoder$ByteBufferInitializer$1 r0 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$ByteBufferInitializer$1
                r0.<init>(r1, r2)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public /* bridge */ /* synthetic */ void initializeExtractor(android.media.MediaExtractor r1, java.nio.ByteBuffer r2) throws java.io.IOException {
                r0 = this;
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                r0.initializeExtractor2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: initializeExtractor, reason: avoid collision after fix types in other method */
        public void initializeExtractor2(android.media.MediaExtractor r1, java.nio.ByteBuffer r2) throws java.io.IOException {
                r0 = this;
                android.media.MediaDataSource r2 = r0.getMediaDataSource(r2)
                r1.setDataSource(r2)
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public /* bridge */ /* synthetic */ void initializeRetriever(android.media.MediaMetadataRetriever r1, java.nio.ByteBuffer r2) {
                r0 = this;
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                r0.initializeRetriever2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: initializeRetriever, reason: avoid collision after fix types in other method */
        public void initializeRetriever2(android.media.MediaMetadataRetriever r1, java.nio.ByteBuffer r2) {
                r0 = this;
                android.media.MediaDataSource r2 = r0.getMediaDataSource(r2)
                r1.setDataSource(r2)
                return
        }
    }

    @Yue.InterfaceC6959
    public interface MediaInitializer<T> {
        @Yue.InterfaceC5336(16)
        void initializeExtractor(android.media.MediaExtractor r1, T r2) throws java.io.IOException;

        void initializeRetriever(android.media.MediaMetadataRetriever r1, T r2);
    }

    @Yue.InterfaceC6959
    public static class MediaMetadataRetrieverFactory {
        public MediaMetadataRetrieverFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public android.media.MediaMetadataRetriever build() {
                r1 = this;
                android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
                r0.<init>()
                return r0
        }
    }

    public static final class ParcelFileDescriptorInitializer implements com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer<android.os.ParcelFileDescriptor> {
        public ParcelFileDescriptorInitializer() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC5336(16)
        /* JADX INFO: renamed from: initializeExtractor, reason: avoid collision after fix types in other method */
        public void initializeExtractor2(android.media.MediaExtractor r1, android.os.ParcelFileDescriptor r2) throws java.io.IOException {
                r0 = this;
                java.io.FileDescriptor r2 = r2.getFileDescriptor()
                r1.setDataSource(r2)
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        @Yue.InterfaceC5336(16)
        public /* bridge */ /* synthetic */ void initializeExtractor(android.media.MediaExtractor r1, android.os.ParcelFileDescriptor r2) throws java.io.IOException {
                r0 = this;
                android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
                r0.initializeExtractor2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: initializeRetriever, reason: avoid collision after fix types in other method */
        public void initializeRetriever2(android.media.MediaMetadataRetriever r1, android.os.ParcelFileDescriptor r2) {
                r0 = this;
                java.io.FileDescriptor r2 = r2.getFileDescriptor()
                r1.setDataSource(r2)
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public /* bridge */ /* synthetic */ void initializeRetriever(android.media.MediaMetadataRetriever r1, android.os.ParcelFileDescriptor r2) {
                r0 = this;
                android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
                r0.initializeRetriever2(r1, r2)
                return
        }
    }

    public static final class VideoDecoderException extends java.lang.RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public VideoDecoderException() {
                r1 = this;
                java.lang.String r0 = "MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details"
                r1.<init>(r0)
                return
        }
    }

    static {
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$1 r1 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$1
            r1.<init>()
            java.lang.String r2 = "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.disk(r2, r0, r1)
            com.bumptech.glide.load.resource.bitmap.VideoDecoder.TARGET_FRAME = r0
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$2 r1 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$2
            r1.<init>()
            java.lang.String r2 = "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.disk(r2, r0, r1)
            com.bumptech.glide.load.resource.bitmap.VideoDecoder.FRAME_OPTION = r0
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaMetadataRetrieverFactory r0 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaMetadataRetrieverFactory
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.VideoDecoder.DEFAULT_FACTORY = r0
            java.lang.String r0 = "TP1A"
            java.lang.String r1 = "TD1A.220804.031"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            com.bumptech.glide.load.resource.bitmap.VideoDecoder.PIXEL_T_BUILD_ID_PREFIXES_REQUIRING_HDR_180_ROTATION_FIX = r0
            return
    }

    public VideoDecoder(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2, com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer<T> r3) {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaMetadataRetrieverFactory r0 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.DEFAULT_FACTORY
            r1.<init>(r2, r3, r0)
            return
    }

    @Yue.InterfaceC6959
    public VideoDecoder(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1, com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer<T> r2, com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverFactory r3) {
            r0 = this;
            r0.<init>()
            r0.bitmapPool = r1
            r0.initializer = r2
            r0.factory = r3
            return
    }

    @Yue.InterfaceC5336(16)
    public static com.bumptech.glide.load.ResourceDecoder<android.content.res.AssetFileDescriptor, android.graphics.Bitmap> asset(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3) {
            com.bumptech.glide.load.resource.bitmap.VideoDecoder r0 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$AssetFileDescriptorInitializer r1 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$AssetFileDescriptorInitializer
            r2 = 0
            r1.<init>(r2)
            r0.<init>(r3, r1)
            return r0
    }

    @Yue.InterfaceC5336(api = 23)
    public static com.bumptech.glide.load.ResourceDecoder<java.nio.ByteBuffer, android.graphics.Bitmap> byteBuffer(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2) {
            com.bumptech.glide.load.resource.bitmap.VideoDecoder r0 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$ByteBufferInitializer r1 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$ByteBufferInitializer
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    @android.annotation.TargetApi(30)
    private static android.graphics.Bitmap correctHdr180DegVideoFrameOrientation(android.media.MediaMetadataRetriever r8, android.graphics.Bitmap r9) {
            java.lang.String r0 = "VideoDecoder"
            boolean r1 = isHdr180RotationFixRequired()
            if (r1 != 0) goto L9
            return r9
        L9:
            r1 = 3
            boolean r2 = isHDR(r8)     // Catch: java.lang.NumberFormatException -> L56
            if (r2 == 0) goto L61
            r2 = 24
            java.lang.String r8 = r8.extractMetadata(r2)     // Catch: java.lang.NumberFormatException -> L56
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L56
            int r8 = java.lang.Math.abs(r8)     // Catch: java.lang.NumberFormatException -> L56
            r2 = 180(0xb4, float:2.52E-43)
            if (r8 != r2) goto L61
            boolean r8 = android.util.Log.isLoggable(r0, r1)
            if (r8 == 0) goto L2d
            java.lang.String r8 = "Applying HDR 180 deg thumbnail correction"
            android.util.Log.d(r0, r8)
        L2d:
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r8 = r9.getWidth()
            float r8 = (float) r8
            r0 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r0
            int r1 = r9.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r0
            r0 = 1127481344(0x43340000, float:180.0)
            r6.postRotate(r0, r8, r1)
            int r4 = r9.getWidth()
            int r5 = r9.getHeight()
            r7 = 1
            r2 = 0
            r3 = 0
            r1 = r9
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)
            return r8
        L56:
            boolean r8 = android.util.Log.isLoggable(r0, r1)
            if (r8 == 0) goto L61
            java.lang.String r8 = "Exception trying to extract HDR transfer function or rotation"
            android.util.Log.d(r0, r8)
        L61:
            return r9
    }

    @Yue.InterfaceC4544
    private android.graphics.Bitmap decodeFrame(@Yue.InterfaceC4410 T r2, android.media.MediaMetadataRetriever r3, long r4, int r6, int r7, int r8, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r9) {
            r1 = this;
            boolean r2 = r1.isUnsupportedFormat(r2, r3)
            if (r2 != 0) goto L2f
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 27
            if (r2 < r0) goto L1b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r2) goto L1b
            if (r8 == r2) goto L1b
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.NONE
            if (r9 == r2) goto L1b
            android.graphics.Bitmap r2 = decodeScaledFrame(r3, r4, r6, r7, r8, r9)
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 != 0) goto L22
            android.graphics.Bitmap r2 = decodeOriginalFrame(r3, r4, r6)
        L22:
            android.graphics.Bitmap r2 = correctHdr180DegVideoFrameOrientation(r3, r2)
            if (r2 == 0) goto L29
            return r2
        L29:
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$VideoDecoderException r2 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$VideoDecoderException
            r2.<init>()
            throw r2
        L2f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Cannot decode VP8 video on CrOS."
            r2.<init>(r3)
            throw r2
    }

    private static android.graphics.Bitmap decodeOriginalFrame(android.media.MediaMetadataRetriever r0, long r1, int r3) {
            android.graphics.Bitmap r0 = r0.getFrameAtTime(r1, r3)
            return r0
    }

    @Yue.InterfaceC4544
    @android.annotation.TargetApi(27)
    private static android.graphics.Bitmap decodeScaledFrame(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r15) {
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L41
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L41
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch: java.lang.Throwable -> L41
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L41
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch: java.lang.Throwable -> L41
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L41
            r3 = 90
            if (r2 == r3) goto L26
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L29
        L26:
            r8 = r1
            r1 = r0
            r0 = r8
        L29:
            float r13 = r15.getScaleFactor(r0, r1, r13, r14)     // Catch: java.lang.Throwable -> L41
            float r14 = (float) r0     // Catch: java.lang.Throwable -> L41
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch: java.lang.Throwable -> L41
            float r14 = (float) r1     // Catch: java.lang.Throwable -> L41
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch: java.lang.Throwable -> L41
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r9 = Yue.C6708.m25919(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L41
            return r9
        L41:
            r9 = move-exception
            r10 = 3
            java.lang.String r11 = "VideoDecoder"
            boolean r10 = android.util.Log.isLoggable(r11, r10)
            if (r10 == 0) goto L50
            java.lang.String r10 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r11, r10, r9)
        L50:
            r9 = 0
            return r9
    }

    @Yue.InterfaceC5336(30)
    private static boolean isHDR(android.media.MediaMetadataRetriever r3) throws java.lang.NumberFormatException {
            r0 = 36
            java.lang.String r0 = r3.extractMetadata(r0)
            r1 = 35
            java.lang.String r3 = r3.extractMetadata(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            int r3 = java.lang.Integer.parseInt(r3)
            r1 = 7
            r2 = 6
            if (r0 == r1) goto L1a
            if (r0 != r2) goto L1e
        L1a:
            if (r3 != r2) goto L1e
            r3 = 1
            goto L1f
        L1e:
            r3 = 0
        L1f:
            return r3
    }

    @Yue.InterfaceC6959
    public static boolean isHdr180RotationFixRequired() {
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "Pixel"
            boolean r0 = r0.startsWith(r1)
            r1 = 33
            if (r0 == 0) goto L15
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r1) goto L15
            boolean r0 = isTBuildRequiringRotationFix()
            return r0
        L15:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L1f
            if (r0 >= r1) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    private static boolean isTBuildRequiringRotationFix() {
            java.util.List<java.lang.String> r0 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.PIXEL_T_BUILD_ID_PREFIXES_REQUIRING_HDR_180_ROTATION_FIX
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = android.os.Build.ID
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L6
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    private boolean isUnsupportedFormat(@Yue.InterfaceC4410 T r6, android.media.MediaMetadataRetriever r7) {
            r5 = this;
            java.lang.String r0 = "VideoDecoder"
            java.lang.String r1 = android.os.Build.DEVICE
            r2 = 0
            if (r1 == 0) goto L6d
            java.lang.String r3 = ".+_cheets|cheets_.+"
            boolean r1 = r1.matches(r3)
            if (r1 == 0) goto L6d
            r1 = 12
            r3 = 0
            java.lang.String r7 = r7.extractMetadata(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = "video/webm"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> L51
            if (r7 != 0) goto L1f
            return r2
        L1f:
            android.media.MediaExtractor r7 = new android.media.MediaExtractor     // Catch: java.lang.Throwable -> L51
            r7.<init>()     // Catch: java.lang.Throwable -> L51
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaInitializer<T> r1 = r5.initializer     // Catch: java.lang.Throwable -> L4a
            r1.initializeExtractor(r7, r6)     // Catch: java.lang.Throwable -> L4a
            int r6 = r7.getTrackCount()     // Catch: java.lang.Throwable -> L4a
            r1 = r2
        L2e:
            if (r1 >= r6) goto L4d
            android.media.MediaFormat r3 = r7.getTrackFormat(r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "mime"
            java.lang.String r3 = r3.getString(r4)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "video/x-vnd.on2.vp8"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L47
            r7.release()
            r6 = 1
            return r6
        L47:
            int r1 = r1 + 1
            goto L2e
        L4a:
            r6 = move-exception
            r3 = r7
            goto L52
        L4d:
            r7.release()
            goto L66
        L51:
            r6 = move-exception
        L52:
            r7 = 3
            boolean r7 = android.util.Log.isLoggable(r0, r7)     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L61
            java.lang.String r7 = "Exception trying to extract track info for a webm video on CrOS."
            android.util.Log.d(r0, r7, r6)     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            r6 = move-exception
            goto L67
        L61:
            if (r3 == 0) goto L66
            r3.release()
        L66:
            return r2
        L67:
            if (r3 == 0) goto L6c
            r3.release()
        L6c:
            throw r6
        L6d:
            return r2
    }

    public static com.bumptech.glide.load.ResourceDecoder<android.os.ParcelFileDescriptor, android.graphics.Bitmap> parcel(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2) {
            com.bumptech.glide.load.resource.bitmap.VideoDecoder r0 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$ParcelFileDescriptorInitializer r1 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$ParcelFileDescriptorInitializer
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(@Yue.InterfaceC4410 T r12, int r13, int r14, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r15) throws java.io.IOException {
            r11 = this;
            com.bumptech.glide.load.Option<java.lang.Long> r0 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.TARGET_FRAME
            java.lang.Object r0 = r15.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L30
            r0 = -1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L19
            goto L30
        L19:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Requested frame must be non-negative, or DEFAULT_FRAME, given: "
            r13.append(r14)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L30:
            com.bumptech.glide.load.Option<java.lang.Integer> r0 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.FRAME_OPTION
            java.lang.Object r0 = r15.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L3f
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L3f:
            com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION
            java.lang.Object r15 = r15.get(r1)
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r15 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy) r15
            if (r15 != 0) goto L4b
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r15 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.DEFAULT
        L4b:
            r9 = r15
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaMetadataRetrieverFactory r15 = r11.factory
            android.media.MediaMetadataRetriever r15 = r15.build()
            r10 = 29
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaInitializer<T> r1 = r11.initializer     // Catch: java.lang.Throwable -> L78
            r1.initializeRetriever(r15, r12)     // Catch: java.lang.Throwable -> L78
            int r6 = r0.intValue()     // Catch: java.lang.Throwable -> L78
            r1 = r11
            r2 = r12
            r3 = r15
            r7 = r13
            r8 = r14
            android.graphics.Bitmap r12 = r1.decodeFrame(r2, r3, r4, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L78
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r10) goto L6e
            r15.release()
            goto L71
        L6e:
            r15.release()
        L71:
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r13 = r11.bitmapPool
            com.bumptech.glide.load.resource.bitmap.BitmapResource r12 = com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(r12, r13)
            return r12
        L78:
            r12 = move-exception
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r10) goto L81
            r15.release()
            goto L84
        L81:
            r15.release()
        L84:
            throw r12
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@Yue.InterfaceC4410 T r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) {
            r0 = this;
            r1 = 1
            return r1
    }
}
