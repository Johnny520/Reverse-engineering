package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class Downsampler {
    public static final com.bumptech.glide.load.Option<java.lang.Boolean> ALLOW_HARDWARE_CONFIG = null;
    public static final com.bumptech.glide.load.Option<com.bumptech.glide.load.DecodeFormat> DECODE_FORMAT = null;

    @java.lang.Deprecated
    public static final com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> DOWNSAMPLE_STRATEGY = null;
    private static final com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks EMPTY_CALLBACKS = null;
    public static final com.bumptech.glide.load.Option<java.lang.Boolean> FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = null;
    private static final java.lang.String ICO_MIME_TYPE = "image/x-ico";
    private static final java.util.Set<java.lang.String> NO_DOWNSAMPLE_PRE_N_MIME_TYPES = null;
    private static final java.util.Queue<android.graphics.BitmapFactory.Options> OPTIONS_QUEUE = null;
    public static final com.bumptech.glide.load.Option<com.bumptech.glide.load.PreferredColorSpace> PREFERRED_COLOR_SPACE = null;
    static final java.lang.String TAG = "Downsampler";
    private static final java.util.Set<com.bumptech.glide.load.ImageHeaderParser.ImageType> TYPES_THAT_USE_POOL_PRE_KITKAT = null;
    private static final java.lang.String WBMP_MIME_TYPE = "image/vnd.wap.wbmp";
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
    private final android.util.DisplayMetrics displayMetrics;
    private final com.bumptech.glide.load.resource.bitmap.HardwareConfigState hardwareConfigState;
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;


    public interface DecodeCallbacks {
        void onDecodeComplete(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1, android.graphics.Bitmap r2) throws java.io.IOException;

        void onObtainBounds();
    }

    static {
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat"
            com.bumptech.glide.load.DecodeFormat r1 = com.bumptech.glide.load.DecodeFormat.DEFAULT
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.memory(r0, r1)
            com.bumptech.glide.load.resource.bitmap.Downsampler.DECODE_FORMAT = r0
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.memory(r0)
            com.bumptech.glide.load.resource.bitmap.Downsampler.PREFERRED_COLOR_SPACE = r0
            com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION
            com.bumptech.glide.load.resource.bitmap.Downsampler.DOWNSAMPLE_STRATEGY = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize"
            com.bumptech.glide.load.Option r1 = com.bumptech.glide.load.Option.memory(r1, r0)
            com.bumptech.glide.load.resource.bitmap.Downsampler.FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = r1
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.memory(r1, r0)
            com.bumptech.glide.load.resource.bitmap.Downsampler.ALLOW_HARDWARE_CONFIG = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "image/vnd.wap.wbmp"
            java.lang.String r2 = "image/x-ico"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            com.bumptech.glide.load.resource.bitmap.Downsampler.NO_DOWNSAMPLE_PRE_N_MIME_TYPES = r0
            com.bumptech.glide.load.resource.bitmap.Downsampler$1 r0 = new com.bumptech.glide.load.resource.bitmap.Downsampler$1
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.Downsampler.EMPTY_CALLBACKS = r0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            java.util.EnumSet r0 = java.util.EnumSet.of(r0, r1, r2)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            com.bumptech.glide.load.resource.bitmap.Downsampler.TYPES_THAT_USE_POOL_PRE_KITKAT = r0
            r0 = 0
            java.util.Queue r0 = com.bumptech.glide.util.Util.createQueue(r0)
            com.bumptech.glide.load.resource.bitmap.Downsampler.OPTIONS_QUEUE = r0
            return
    }

    public Downsampler(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, android.util.DisplayMetrics r3, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r4, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r5) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.getInstance()
            r1.hardwareConfigState = r0
            r1.parsers = r2
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            android.util.DisplayMetrics r2 = (android.util.DisplayMetrics) r2
            r1.displayMetrics = r2
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2 = (com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool) r2
            r1.bitmapPool = r2
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r5)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = (com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool) r2
            r1.byteArrayPool = r2
            return
    }

    private static int adjustTargetDensityForError(double r4) {
            int r0 = getDensityMultiplier(r4)
            double r1 = (double) r0
            double r1 = r1 * r4
            int r1 = round(r1)
            float r2 = (float) r1
            float r0 = (float) r0
            float r2 = r2 / r0
            double r2 = (double) r2
            double r4 = r4 / r2
            double r0 = (double) r1
            double r4 = r4 * r0
            int r4 = round(r4)
            return r4
    }

    private void calculateConfig(com.bumptech.glide.load.resource.bitmap.ImageReader r7, com.bumptech.glide.load.DecodeFormat r8, boolean r9, boolean r10, android.graphics.BitmapFactory.Options r11, int r12, int r13) {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r0 = r6.hardwareConfigState
            r1 = r12
            r2 = r13
            r3 = r11
            r4 = r9
            r5 = r10
            boolean r9 = r0.setHardwareConfigIfAllowed(r1, r2, r3, r4, r5)
            if (r9 == 0) goto Le
            return
        Le:
            com.bumptech.glide.load.DecodeFormat r9 = com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888
            if (r8 == r9) goto L4b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = r7.getImageType()     // Catch: java.io.IOException -> L1b
            boolean r7 = r7.hasAlpha()     // Catch: java.io.IOException -> L1b
            goto L3a
        L1b:
            r7 = move-exception
            r9 = 3
            java.lang.String r10 = "Downsampler"
            boolean r9 = android.util.Log.isLoggable(r10, r9)
            if (r9 == 0) goto L39
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "Cannot determine whether the image has alpha or not from header, format "
            r9.append(r12)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.d(r10, r8, r7)
        L39:
            r7 = 0
        L3a:
            if (r7 == 0) goto L3f
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            goto L41
        L3f:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565
        L41:
            r11.inPreferredConfig = r7
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.RGB_565
            if (r7 != r8) goto L4a
            r7 = 1
            r11.inDither = r7
        L4a:
            return
        L4b:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            r11.inPreferredConfig = r7
            return
    }

    private static void calculateScaling(com.bumptech.glide.load.ImageHeaderParser.ImageType r16, com.bumptech.glide.load.resource.bitmap.ImageReader r17, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r18, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r19, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r20, int r21, int r22, int r23, int r24, int r25, android.graphics.BitmapFactory.Options r26) throws java.io.IOException {
            r0 = r16
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            java.lang.String r7 = "]"
            java.lang.String r8 = "Downsampler"
            java.lang.String r9 = "x"
            if (r2 <= 0) goto L1b2
            if (r3 > 0) goto L1a
            goto L1b2
        L1a:
            boolean r10 = isRotationRequired(r21)
            if (r10 == 0) goto L23
            r11 = r2
            r10 = r3
            goto L25
        L23:
            r10 = r2
            r11 = r3
        L25:
            float r12 = r1.getScaleFactor(r10, r11, r4, r5)
            r13 = 0
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 <= 0) goto L172
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r7 = r1.getSampleSizeRounding(r10, r11, r4, r5)
            if (r7 == 0) goto L16a
            float r13 = (float) r10
            float r14 = r12 * r13
            double r14 = (double) r14
            int r14 = round(r14)
            float r15 = (float) r11
            float r3 = r12 * r15
            double r2 = (double) r3
            int r2 = round(r2)
            int r3 = r10 / r14
            int r2 = r11 / r2
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r14 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY
            if (r7 != r14) goto L51
            int r2 = java.lang.Math.max(r3, r2)
            goto L55
        L51:
            int r2 = java.lang.Math.min(r3, r2)
        L55:
            int r2 = java.lang.Integer.highestOneBit(r2)
            r3 = 1
            int r2 = java.lang.Math.max(r3, r2)
            if (r7 != r14) goto L6a
            float r7 = (float) r2
            r14 = 1065353216(0x3f800000, float:1.0)
            float r14 = r14 / r12
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 >= 0) goto L6a
            int r2 = r2 << 1
        L6a:
            r6.inSampleSize = r2
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            r14 = 0
            if (r0 != r7) goto L8d
            r0 = 8
            int r0 = java.lang.Math.min(r2, r0)
            float r0 = (float) r0
            float r13 = r13 / r0
            double r10 = (double) r13
            double r10 = java.lang.Math.ceil(r10)
            int r7 = (int) r10
            float r15 = r15 / r0
            double r10 = (double) r15
            double r10 = java.lang.Math.ceil(r10)
            int r0 = (int) r10
            int r10 = r2 / 8
            if (r10 <= 0) goto Ld4
            int r7 = r7 / r10
            int r0 = r0 / r10
            goto Ld4
        L8d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r0 == r7) goto Lc5
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r0 != r7) goto L96
            goto Lc5
        L96:
            boolean r0 = r16.isWebp()
            if (r0 == 0) goto La8
            float r0 = (float) r2
            float r13 = r13 / r0
            int r7 = java.lang.Math.round(r13)
            float r15 = r15 / r0
            int r0 = java.lang.Math.round(r15)
            goto Ld4
        La8:
            int r0 = r10 % r2
            if (r0 != 0) goto Lb0
            int r0 = r11 % r2
            if (r0 == 0) goto Lb7
        Lb0:
            r0 = r17
            r7 = r18
            r10 = r19
            goto Lbc
        Lb7:
            int r7 = r10 / r2
            int r0 = r11 / r2
            goto Ld4
        Lbc:
            int[] r0 = getDimensions(r0, r6, r7, r10)
            r7 = r0[r14]
            r0 = r0[r3]
            goto Ld4
        Lc5:
            float r0 = (float) r2
            float r13 = r13 / r0
            double r10 = (double) r13
            double r10 = java.lang.Math.floor(r10)
            int r7 = (int) r10
            float r15 = r15 / r0
            double r10 = (double) r15
            double r10 = java.lang.Math.floor(r10)
            int r0 = (int) r10
        Ld4:
            float r1 = r1.getScaleFactor(r7, r0, r4, r5)
            double r10 = (double) r1
            int r1 = adjustTargetDensityForError(r10)
            r6.inTargetDensity = r1
            int r1 = getDensityMultiplier(r10)
            r6.inDensity = r1
            boolean r1 = isScaling(r26)
            if (r1 == 0) goto Lee
            r6.inScaled = r3
            goto Lf2
        Lee:
            r6.inTargetDensity = r14
            r6.inDensity = r14
        Lf2:
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r8, r1)
            if (r1 == 0) goto L169
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Calculate scaling, source: ["
            r1.append(r3)
            r3 = r22
            r1.append(r3)
            r1.append(r9)
            r13 = r23
            r1.append(r13)
            java.lang.String r3 = "], degreesToRotate: "
            r1.append(r3)
            r3 = r21
            r1.append(r3)
            java.lang.String r3 = ", target: ["
            r1.append(r3)
            r1.append(r4)
            r1.append(r9)
            r1.append(r5)
            java.lang.String r3 = "], power of two scaled: ["
            r1.append(r3)
            r1.append(r7)
            r1.append(r9)
            r1.append(r0)
            java.lang.String r0 = "], exact scale factor: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ", power of 2 sample size: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", adjusted scale factor: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", target density: "
            r1.append(r0)
            int r0 = r6.inTargetDensity
            r1.append(r0)
            java.lang.String r0 = ", density: "
            r1.append(r0)
            int r0 = r6.inDensity
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r8, r0)
        L169:
            return
        L16a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L172:
            r13 = r3
            r3 = r2
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Cannot scale with factor: "
            r2.append(r6)
            r2.append(r12)
            java.lang.String r6 = " from: "
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = ", source: ["
            r2.append(r1)
            r2.append(r3)
            r2.append(r9)
            r2.append(r13)
            java.lang.String r1 = "], target: ["
            r2.append(r1)
            r2.append(r4)
            r2.append(r9)
            r2.append(r5)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L1b2:
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r8, r1)
            if (r1 == 0) goto L1de
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to determine dimensions for: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " with target ["
            r1.append(r0)
            r1.append(r4)
            r1.append(r9)
            r1.append(r5)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r8, r0)
        L1de:
            return
    }

    private com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(com.bumptech.glide.load.resource.bitmap.ImageReader r16, int r17, int r18, com.bumptech.glide.load.Options r19, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r20) throws java.io.IOException {
            r15 = this;
            r12 = r15
            r0 = r19
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1 = r12.byteArrayPool
            r2 = 65536(0x10000, float:9.1835E-41)
            java.lang.Class<byte[]> r3 = byte[].class
            java.lang.Object r1 = r1.get(r2, r3)
            r13 = r1
            byte[] r13 = (byte[]) r13
            android.graphics.BitmapFactory$Options r14 = getDefaultOptions()
            r14.inTempStorage = r13
            com.bumptech.glide.load.Option<com.bumptech.glide.load.DecodeFormat> r1 = com.bumptech.glide.load.resource.bitmap.Downsampler.DECODE_FORMAT
            java.lang.Object r1 = r0.get(r1)
            r5 = r1
            com.bumptech.glide.load.DecodeFormat r5 = (com.bumptech.glide.load.DecodeFormat) r5
            com.bumptech.glide.load.Option<com.bumptech.glide.load.PreferredColorSpace> r1 = com.bumptech.glide.load.resource.bitmap.Downsampler.PREFERRED_COLOR_SPACE
            java.lang.Object r1 = r0.get(r1)
            r6 = r1
            com.bumptech.glide.load.PreferredColorSpace r6 = (com.bumptech.glide.load.PreferredColorSpace) r6
            com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION
            java.lang.Object r1 = r0.get(r1)
            r4 = r1
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r4 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy) r4
            com.bumptech.glide.load.Option<java.lang.Boolean> r1 = com.bumptech.glide.load.resource.bitmap.Downsampler.FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS
            java.lang.Object r1 = r0.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r10 = r1.booleanValue()
            com.bumptech.glide.load.Option<java.lang.Boolean> r1 = com.bumptech.glide.load.resource.bitmap.Downsampler.ALLOW_HARDWARE_CONFIG
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L54
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L54
            r0 = 1
        L52:
            r7 = r0
            goto L56
        L54:
            r0 = 0
            goto L52
        L56:
            r1 = r15
            r2 = r16
            r3 = r14
            r8 = r17
            r9 = r18
            r11 = r20
            android.graphics.Bitmap r0 = r1.decodeFromWrappedStreams(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L73
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r12.bitmapPool     // Catch: java.lang.Throwable -> L73
            com.bumptech.glide.load.resource.bitmap.BitmapResource r0 = com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(r0, r1)     // Catch: java.lang.Throwable -> L73
            releaseOptions(r14)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1 = r12.byteArrayPool
            r1.put(r13)
            return r0
        L73:
            r0 = move-exception
            releaseOptions(r14)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1 = r12.byteArrayPool
            r1.put(r13)
            throw r0
    }

    private android.graphics.Bitmap decodeFromWrappedStreams(com.bumptech.glide.load.resource.bitmap.ImageReader r28, android.graphics.BitmapFactory.Options r29, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r30, com.bumptech.glide.load.DecodeFormat r31, com.bumptech.glide.load.PreferredColorSpace r32, boolean r33, int r34, int r35, boolean r36, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r37) throws java.io.IOException {
            r27 = this;
            r8 = r27
            r7 = r28
            r6 = r29
            r5 = r32
            r4 = r37
            long r20 = com.bumptech.glide.util.LogTime.getLogTime()
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r8.bitmapPool
            int[] r0 = getDimensions(r7, r6, r4, r0)
            r1 = 0
            r3 = r0[r1]
            r2 = 1
            r2 = r0[r2]
            java.lang.String r0 = r6.outMimeType
            r9 = -1
            if (r3 == r9) goto L25
            if (r2 != r9) goto L22
            goto L25
        L22:
            r22 = r33
            goto L27
        L25:
            r22 = r1
        L27:
            int r1 = r28.getImageOrientation()
            int r14 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getExifOrientationDegrees(r1)
            boolean r23 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.isExifOrientationRequired(r1)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = r34
            if (r15 != r9) goto L47
            boolean r10 = isRotationRequired(r14)
            r13 = r35
            if (r10 == 0) goto L44
            r24 = r2
            goto L4b
        L44:
            r24 = r3
            goto L4b
        L47:
            r13 = r35
            r24 = r15
        L4b:
            if (r13 != r9) goto L59
            boolean r9 = isRotationRequired(r14)
            if (r9 == 0) goto L56
            r25 = r3
            goto L5b
        L56:
            r25 = r2
            goto L5b
        L59:
            r25 = r13
        L5b:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r12 = r28.getImageType()
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r11 = r8.bitmapPool
            r9 = r12
            r10 = r28
            r16 = r11
            r11 = r37
            r26 = r12
            r12 = r16
            r13 = r30
            r15 = r3
            r16 = r2
            r17 = r24
            r18 = r25
            r19 = r29
            calculateScaling(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r11 = r0
            r0 = r27
            r15 = r1
            r1 = r28
            r10 = r2
            r2 = r31
            r9 = r3
            r3 = r22
            r12 = r4
            r4 = r23
            r13 = r5
            r5 = r29
            r14 = r6
            r6 = r24
            r30 = r15
            r15 = r7
            r7 = r25
            r0.calculateConfig(r1, r2, r3, r4, r5, r6, r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = r26
            boolean r1 = r8.shouldUsePool(r1)
            java.lang.String r3 = "Downsampler"
            if (r1 == 0) goto L149
            if (r9 < 0) goto Lb0
            if (r10 < 0) goto Lb0
            if (r36 == 0) goto Lb0
            r6 = r3
            r1 = r24
            r3 = r25
            goto L13f
        Lb0:
            boolean r1 = isScaling(r29)
            if (r1 == 0) goto Lbe
            int r1 = r14.inTargetDensity
            float r1 = (float) r1
            int r4 = r14.inDensity
            float r4 = (float) r4
            float r1 = r1 / r4
            goto Lc0
        Lbe:
            r1 = 1065353216(0x3f800000, float:1.0)
        Lc0:
            int r4 = r14.inSampleSize
            float r5 = (float) r9
            float r6 = (float) r4
            float r5 = r5 / r6
            r33 = r3
            double r2 = (double) r5
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            float r3 = (float) r10
            float r3 = r3 / r6
            double r5 = (double) r3
            double r5 = java.lang.Math.ceil(r5)
            int r3 = (int) r5
            float r2 = (float) r2
            float r2 = r2 * r1
            int r2 = java.lang.Math.round(r2)
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = java.lang.Math.round(r3)
            r6 = r33
            r5 = 2
            boolean r7 = android.util.Log.isLoggable(r6, r5)
            if (r7 == 0) goto L13b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Calculated target ["
            r5.append(r7)
            r5.append(r2)
            java.lang.String r7 = "x"
            r5.append(r7)
            r5.append(r3)
            r33 = r2
            java.lang.String r2 = "] for source ["
            r5.append(r2)
            r5.append(r9)
            r5.append(r7)
            r5.append(r10)
            java.lang.String r2 = "], sampleSize: "
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = ", targetDensity: "
            r5.append(r2)
            int r2 = r14.inTargetDensity
            r5.append(r2)
            java.lang.String r2 = ", density: "
            r5.append(r2)
            int r2 = r14.inDensity
            r5.append(r2)
            java.lang.String r2 = ", density multiplier: "
            r5.append(r2)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            android.util.Log.v(r6, r1)
            goto L13d
        L13b:
            r33 = r2
        L13d:
            r1 = r33
        L13f:
            if (r1 <= 0) goto L14a
            if (r3 <= 0) goto L14a
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2 = r8.bitmapPool
            setInBitmap(r14, r2, r1, r3)
            goto L14a
        L149:
            r6 = r3
        L14a:
            if (r13 == 0) goto L172
            r1 = 28
            if (r0 < r1) goto L16a
            com.bumptech.glide.load.PreferredColorSpace r0 = com.bumptech.glide.load.PreferredColorSpace.DISPLAY_P3
            if (r13 != r0) goto L161
            android.graphics.ColorSpace r0 = r14.outColorSpace
            if (r0 == 0) goto L161
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L161
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L163
        L161:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L163:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r14.inPreferredColorSpace = r0
            goto L172
        L16a:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r14.inPreferredColorSpace = r0
        L172:
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r8.bitmapPool
            android.graphics.Bitmap r0 = decodeStream(r15, r14, r12, r0)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r8.bitmapPool
            r12.onDecodeComplete(r1, r0)
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r6, r1)
            if (r1 == 0) goto L193
            r12 = r29
            r13 = r0
            r14 = r34
            r1 = r30
            r15 = r35
            r16 = r20
            logDecode(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L195
        L193:
            r1 = r30
        L195:
            if (r0 == 0) goto L1b0
            android.util.DisplayMetrics r2 = r8.displayMetrics
            int r2 = r2.densityDpi
            r0.setDensity(r2)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2 = r8.bitmapPool
            android.graphics.Bitmap r1 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.rotateImageExif(r2, r0, r1)
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L1b1
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2 = r8.bitmapPool
            r2.put(r0)
            goto L1b1
        L1b0:
            r1 = 0
        L1b1:
            return r1
    }

    private static android.graphics.Bitmap decodeStream(com.bumptech.glide.load.resource.bitmap.ImageReader r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r7, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r8) throws java.io.IOException {
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.onObtainBounds()
            r5.stopGrowingBuffers()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r4.lock()
            android.graphics.Bitmap r5 = r5.decodeBitmap(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = newIoExceptionForInBitmapAssertion(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.put(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = decodeStream(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r6.unlock()
            throw r5
    }

    @Yue.InterfaceC4544
    @android.annotation.TargetApi(19)
    private static java.lang.String getBitmapString(android.graphics.Bitmap r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " ("
            r0.append(r1)
            int r1 = r3.getAllocationByteCount()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            int r2 = r3.getWidth()
            r1.append(r2)
            java.lang.String r2 = "x"
            r1.append(r2)
            int r2 = r3.getHeight()
            r1.append(r2)
            java.lang.String r2 = "] "
            r1.append(r2)
            android.graphics.Bitmap$Config r3 = r3.getConfig()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            return r3
    }

    private static synchronized android.graphics.BitmapFactory.Options getDefaultOptions() {
            java.lang.Class<com.bumptech.glide.load.resource.bitmap.Downsampler> r0 = com.bumptech.glide.load.resource.bitmap.Downsampler.class
            monitor-enter(r0)
            java.util.Queue<android.graphics.BitmapFactory$Options> r1 = com.bumptech.glide.load.resource.bitmap.Downsampler.OPTIONS_QUEUE     // Catch: java.lang.Throwable -> L18
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r1.poll()     // Catch: java.lang.Throwable -> L1c
            android.graphics.BitmapFactory$Options r2 = (android.graphics.BitmapFactory.Options) r2     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L1a
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L18
            r2.<init>()     // Catch: java.lang.Throwable -> L18
            resetOptions(r2)     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r1 = move-exception
            goto L1f
        L1a:
            monitor-exit(r0)
            return r2
        L1c:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r2     // Catch: java.lang.Throwable -> L18
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    private static int getDensityMultiplier(double r3) {
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            goto L9
        L7:
            double r3 = r0 / r3
        L9:
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r3 = r3 * r0
            long r3 = java.lang.Math.round(r3)
            int r3 = (int) r3
            return r3
    }

    private static int[] getDimensions(com.bumptech.glide.load.resource.bitmap.ImageReader r1, android.graphics.BitmapFactory.Options r2, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r3, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r4) throws java.io.IOException {
            r0 = 1
            r2.inJustDecodeBounds = r0
            decodeStream(r1, r2, r3, r4)
            r1 = 0
            r2.inJustDecodeBounds = r1
            int r1 = r2.outWidth
            int r2 = r2.outHeight
            int[] r1 = new int[]{r1, r2}
            return r1
    }

    private static java.lang.String getInBitmapString(android.graphics.BitmapFactory.Options r0) {
            android.graphics.Bitmap r0 = r0.inBitmap
            java.lang.String r0 = getBitmapString(r0)
            return r0
    }

    private static boolean isRotationRequired(int r1) {
            r0 = 90
            if (r1 == r0) goto Lb
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    private static boolean isScaling(android.graphics.BitmapFactory.Options r1) {
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto Lc
            int r1 = r1.inDensity
            if (r1 <= 0) goto Lc
            if (r0 == r1) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    private static void logDecode(int r2, int r3, java.lang.String r4, android.graphics.BitmapFactory.Options r5, android.graphics.Bitmap r6, int r7, int r8, long r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoded "
            r0.append(r1)
            java.lang.String r6 = getBitmapString(r6)
            r0.append(r6)
            java.lang.String r6 = " from ["
            r0.append(r6)
            r0.append(r2)
            java.lang.String r2 = "x"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r3 = "] "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " with inBitmap "
            r0.append(r3)
            java.lang.String r3 = getInBitmapString(r5)
            r0.append(r3)
            java.lang.String r3 = " for ["
            r0.append(r3)
            r0.append(r7)
            r0.append(r2)
            r0.append(r8)
            java.lang.String r2 = "], sample size: "
            r0.append(r2)
            int r2 = r5.inSampleSize
            r0.append(r2)
            java.lang.String r2 = ", density: "
            r0.append(r2)
            int r2 = r5.inDensity
            r0.append(r2)
            java.lang.String r2 = ", target density: "
            r0.append(r2)
            int r2 = r5.inTargetDensity
            r0.append(r2)
            java.lang.String r2 = ", thread: "
            r0.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = ", duration: "
            r0.append(r2)
            double r2 = com.bumptech.glide.util.LogTime.getElapsedMillis(r9)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "Downsampler"
            android.util.Log.v(r3, r2)
            return
    }

    private static java.io.IOException newIoExceptionForInBitmapAssertion(java.lang.IllegalArgumentException r3, int r4, int r5, java.lang.String r6, android.graphics.BitmapFactory.Options r7) {
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception decoding bitmap, outWidth: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", outHeight: "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = ", outMimeType: "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = ", inBitmap: "
            r1.append(r4)
            java.lang.String r4 = getInBitmapString(r7)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r3)
            return r0
    }

    private static void releaseOptions(android.graphics.BitmapFactory.Options r1) {
            resetOptions(r1)
            java.util.Queue<android.graphics.BitmapFactory$Options> r0 = com.bumptech.glide.load.resource.bitmap.Downsampler.OPTIONS_QUEUE
            monitor-enter(r0)
            r0.offer(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    private static void resetOptions(android.graphics.BitmapFactory.Options r3) {
            r0 = 0
            r3.inTempStorage = r0
            r1 = 0
            r3.inDither = r1
            r3.inScaled = r1
            r2 = 1
            r3.inSampleSize = r2
            r3.inPreferredConfig = r0
            r3.inJustDecodeBounds = r1
            r3.inDensity = r1
            r3.inTargetDensity = r1
            r3.inPreferredColorSpace = r0
            r3.outColorSpace = r0
            r3.outConfig = r0
            r3.outWidth = r1
            r3.outHeight = r1
            r3.outMimeType = r0
            r3.inBitmap = r0
            r3.inMutable = r2
            return
    }

    private static int round(double r2) {
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    @android.annotation.TargetApi(26)
    private static void setInBitmap(android.graphics.BitmapFactory.Options r2, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3, int r4, int r5) {
            android.graphics.Bitmap$Config r0 = r2.inPreferredConfig
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            if (r0 != r1) goto L7
            return
        L7:
            android.graphics.Bitmap$Config r1 = r2.outConfig
            if (r1 != 0) goto Lc
            goto Ld
        Lc:
            r0 = r1
        Ld:
            android.graphics.Bitmap r3 = r3.getDirty(r4, r5, r0)
            r2.inBitmap = r3
            return
    }

    private boolean shouldUsePool(com.bumptech.glide.load.ImageHeaderParser.ImageType r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Yue.InterfaceC5336(21)
    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(android.os.ParcelFileDescriptor r7, int r8, int r9, com.bumptech.glide.load.Options r10) throws java.io.IOException {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.ImageReader$ParcelFileDescriptorImageReader r1 = new com.bumptech.glide.load.resource.bitmap.ImageReader$ParcelFileDescriptorImageReader
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r6.parsers
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r6.byteArrayPool
            r1.<init>(r7, r0, r2)
            com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks r5 = com.bumptech.glide.load.resource.bitmap.Downsampler.EMPTY_CALLBACKS
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            com.bumptech.glide.load.engine.Resource r7 = r0.decode(r1, r2, r3, r4, r5)
            return r7
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(java.io.InputStream r7, int r8, int r9, com.bumptech.glide.load.Options r10) throws java.io.IOException {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks r5 = com.bumptech.glide.load.resource.bitmap.Downsampler.EMPTY_CALLBACKS
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            com.bumptech.glide.load.engine.Resource r7 = r0.decode(r1, r2, r3, r4, r5)
            return r7
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(java.io.InputStream r7, int r8, int r9, com.bumptech.glide.load.Options r10, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r11) throws java.io.IOException {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.ImageReader$InputStreamImageReader r1 = new com.bumptech.glide.load.resource.bitmap.ImageReader$InputStreamImageReader
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r6.parsers
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r6.byteArrayPool
            r1.<init>(r7, r0, r2)
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.bumptech.glide.load.engine.Resource r7 = r0.decode(r1, r2, r3, r4, r5)
            return r7
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(java.nio.ByteBuffer r7, int r8, int r9, com.bumptech.glide.load.Options r10) throws java.io.IOException {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.ImageReader$ByteBufferReader r1 = new com.bumptech.glide.load.resource.bitmap.ImageReader$ByteBufferReader
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r6.parsers
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r6.byteArrayPool
            r1.<init>(r7, r0, r2)
            com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks r5 = com.bumptech.glide.load.resource.bitmap.Downsampler.EMPTY_CALLBACKS
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            com.bumptech.glide.load.engine.Resource r7 = r0.decode(r1, r2, r3, r4, r5)
            return r7
    }

    @Yue.InterfaceC6959
    public void decode(java.io.File r7, int r8, int r9, com.bumptech.glide.load.Options r10) throws java.io.IOException {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.ImageReader$FileReader r1 = new com.bumptech.glide.load.resource.bitmap.ImageReader$FileReader
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r6.parsers
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r6.byteArrayPool
            r1.<init>(r7, r0, r2)
            com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks r5 = com.bumptech.glide.load.resource.bitmap.Downsampler.EMPTY_CALLBACKS
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r0.decode(r1, r2, r3, r4, r5)
            return
    }

    @Yue.InterfaceC6959
    public void decode(byte[] r7, int r8, int r9, com.bumptech.glide.load.Options r10) throws java.io.IOException {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.ImageReader$ByteArrayReader r1 = new com.bumptech.glide.load.resource.bitmap.ImageReader$ByteArrayReader
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r6.parsers
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r6.byteArrayPool
            r1.<init>(r7, r0, r2)
            com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks r5 = com.bumptech.glide.load.resource.bitmap.Downsampler.EMPTY_CALLBACKS
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r0.decode(r1, r2, r3, r4, r5)
            return
    }

    public boolean handles(android.os.ParcelFileDescriptor r1) {
            r0 = this;
            boolean r1 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.isSupported()
            return r1
    }

    public boolean handles(java.io.InputStream r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public boolean handles(java.nio.ByteBuffer r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
