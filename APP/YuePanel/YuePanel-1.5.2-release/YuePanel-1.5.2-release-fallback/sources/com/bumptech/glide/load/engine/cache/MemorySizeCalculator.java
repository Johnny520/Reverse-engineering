package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes.dex */
public final class MemorySizeCalculator {

    @Yue.InterfaceC6959
    static final int BYTES_PER_ARGB_8888_PIXEL = 4;
    private static final int LOW_MEMORY_BYTE_ARRAY_POOL_DIVISOR = 2;
    private static final java.lang.String TAG = "MemorySizeCalculator";
    private final int arrayPoolSize;
    private final int bitmapPoolSize;
    private final android.content.Context context;
    private final int memoryCacheSize;

    public static final class Builder {
        static final int ARRAY_POOL_SIZE_BYTES = 4194304;
        static final int BITMAP_POOL_TARGET_SCREENS = 0;
        static final float LOW_MEMORY_MAX_SIZE_MULTIPLIER = 0.33f;
        static final float MAX_SIZE_MULTIPLIER = 0.4f;

        @Yue.InterfaceC6959
        static final int MEMORY_CACHE_TARGET_SCREENS = 2;
        android.app.ActivityManager activityManager;
        int arrayPoolSizeBytes;
        float bitmapPoolScreens;
        final android.content.Context context;
        float lowMemoryMaxSizeMultiplier;
        float maxSizeMultiplier;
        float memoryCacheScreens;
        com.bumptech.glide.load.engine.cache.MemorySizeCalculator.ScreenDimensions screenDimensions;

        static {
                r0 = 1
                com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder.BITMAP_POOL_TARGET_SCREENS = r0
                return
        }

        public Builder(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = 1073741824(0x40000000, float:2.0)
                r1.memoryCacheScreens = r0
                int r0 = com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder.BITMAP_POOL_TARGET_SCREENS
                float r0 = (float) r0
                r1.bitmapPoolScreens = r0
                r0 = 1053609165(0x3ecccccd, float:0.4)
                r1.maxSizeMultiplier = r0
                r0 = 1051260355(0x3ea8f5c3, float:0.33)
                r1.lowMemoryMaxSizeMultiplier = r0
                r0 = 4194304(0x400000, float:5.877472E-39)
                r1.arrayPoolSizeBytes = r0
                r1.context = r2
                java.lang.String r0 = "activity"
                java.lang.Object r0 = r2.getSystemService(r0)
                android.app.ActivityManager r0 = (android.app.ActivityManager) r0
                r1.activityManager = r0
                com.bumptech.glide.load.engine.cache.MemorySizeCalculator$DisplayMetricsScreenDimensions r0 = new com.bumptech.glide.load.engine.cache.MemorySizeCalculator$DisplayMetricsScreenDimensions
                android.content.res.Resources r2 = r2.getResources()
                android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
                r0.<init>(r2)
                r1.screenDimensions = r0
                android.app.ActivityManager r2 = r1.activityManager
                boolean r2 = com.bumptech.glide.load.engine.cache.MemorySizeCalculator.isLowMemoryDevice(r2)
                if (r2 == 0) goto L40
                r2 = 0
                r1.bitmapPoolScreens = r2
            L40:
                return
        }

        public com.bumptech.glide.load.engine.cache.MemorySizeCalculator build() {
                r1 = this;
                com.bumptech.glide.load.engine.cache.MemorySizeCalculator r0 = new com.bumptech.glide.load.engine.cache.MemorySizeCalculator
                r0.<init>(r1)
                return r0
        }

        @Yue.InterfaceC6959
        public com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder setActivityManager(android.app.ActivityManager r1) {
                r0 = this;
                r0.activityManager = r1
                return r0
        }

        public com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder setArrayPoolSize(int r1) {
                r0 = this;
                r0.arrayPoolSizeBytes = r1
                return r0
        }

        public com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder setBitmapPoolScreens(float r3) {
                r2 = this;
                r0 = 0
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "Bitmap pool screens must be greater than or equal to 0"
                com.bumptech.glide.util.Preconditions.checkArgument(r0, r1)
                r2.bitmapPoolScreens = r3
                return r2
        }

        public com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder setLowMemoryMaxSizeMultiplier(float r3) {
                r2 = this;
                r0 = 0
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto Ld
                r0 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 > 0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                java.lang.String r1 = "Low memory max size multiplier must be between 0 and 1"
                com.bumptech.glide.util.Preconditions.checkArgument(r0, r1)
                r2.lowMemoryMaxSizeMultiplier = r3
                return r2
        }

        public com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder setMaxSizeMultiplier(float r3) {
                r2 = this;
                r0 = 0
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto Ld
                r0 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 > 0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                java.lang.String r1 = "Size multiplier must be between 0 and 1"
                com.bumptech.glide.util.Preconditions.checkArgument(r0, r1)
                r2.maxSizeMultiplier = r3
                return r2
        }

        public com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder setMemoryCacheScreens(float r3) {
                r2 = this;
                r0 = 0
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "Memory cache screens must be greater than or equal to 0"
                com.bumptech.glide.util.Preconditions.checkArgument(r0, r1)
                r2.memoryCacheScreens = r3
                return r2
        }

        @Yue.InterfaceC6959
        public com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder setScreenDimensions(com.bumptech.glide.load.engine.cache.MemorySizeCalculator.ScreenDimensions r1) {
                r0 = this;
                r0.screenDimensions = r1
                return r0
        }
    }

    public static final class DisplayMetricsScreenDimensions implements com.bumptech.glide.load.engine.cache.MemorySizeCalculator.ScreenDimensions {
        private final android.util.DisplayMetrics displayMetrics;

        public DisplayMetricsScreenDimensions(android.util.DisplayMetrics r1) {
                r0 = this;
                r0.<init>()
                r0.displayMetrics = r1
                return
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.ScreenDimensions
        public int getHeightPixels() {
                r1 = this;
                android.util.DisplayMetrics r0 = r1.displayMetrics
                int r0 = r0.heightPixels
                return r0
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.ScreenDimensions
        public int getWidthPixels() {
                r1 = this;
                android.util.DisplayMetrics r0 = r1.displayMetrics
                int r0 = r0.widthPixels
                return r0
        }
    }

    public interface ScreenDimensions {
        int getHeightPixels();

        int getWidthPixels();
    }

    public MemorySizeCalculator(com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder r7) {
            r6 = this;
            r6.<init>()
            android.content.Context r0 = r7.context
            r6.context = r0
            android.app.ActivityManager r0 = r7.activityManager
            boolean r0 = isLowMemoryDevice(r0)
            if (r0 == 0) goto L14
            int r0 = r7.arrayPoolSizeBytes
            int r0 = r0 / 2
            goto L16
        L14:
            int r0 = r7.arrayPoolSizeBytes
        L16:
            r6.arrayPoolSize = r0
            android.app.ActivityManager r1 = r7.activityManager
            float r2 = r7.maxSizeMultiplier
            float r3 = r7.lowMemoryMaxSizeMultiplier
            int r1 = getMaxSize(r1, r2, r3)
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator$ScreenDimensions r2 = r7.screenDimensions
            int r2 = r2.getWidthPixels()
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator$ScreenDimensions r3 = r7.screenDimensions
            int r3 = r3.getHeightPixels()
            int r2 = r2 * r3
            int r2 = r2 * 4
            float r2 = (float) r2
            float r3 = r7.bitmapPoolScreens
            float r3 = r3 * r2
            int r3 = java.lang.Math.round(r3)
            float r4 = r7.memoryCacheScreens
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r1 - r0
            int r5 = r2 + r3
            if (r5 > r4) goto L4b
            r6.memoryCacheSize = r2
            r6.bitmapPoolSize = r3
            goto L62
        L4b:
            float r2 = (float) r4
            float r3 = r7.bitmapPoolScreens
            float r4 = r7.memoryCacheScreens
            float r3 = r3 + r4
            float r2 = r2 / r3
            float r4 = r4 * r2
            int r3 = java.lang.Math.round(r4)
            r6.memoryCacheSize = r3
            float r3 = r7.bitmapPoolScreens
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            r6.bitmapPoolSize = r2
        L62:
            r2 = 3
            java.lang.String r3 = "MemorySizeCalculator"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto Ld4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Calculation complete, Calculated memory cache size: "
            r2.append(r4)
            int r4 = r6.memoryCacheSize
            java.lang.String r4 = r6.toMb(r4)
            r2.append(r4)
            java.lang.String r4 = ", pool size: "
            r2.append(r4)
            int r4 = r6.bitmapPoolSize
            java.lang.String r4 = r6.toMb(r4)
            r2.append(r4)
            java.lang.String r4 = ", byte array size: "
            r2.append(r4)
            java.lang.String r0 = r6.toMb(r0)
            r2.append(r0)
            java.lang.String r0 = ", memory class limited? "
            r2.append(r0)
            if (r5 <= r1) goto La1
            r0 = 1
            goto La2
        La1:
            r0 = 0
        La2:
            r2.append(r0)
            java.lang.String r0 = ", max size: "
            r2.append(r0)
            java.lang.String r0 = r6.toMb(r1)
            r2.append(r0)
            java.lang.String r0 = ", memoryClass: "
            r2.append(r0)
            android.app.ActivityManager r0 = r7.activityManager
            int r0 = r0.getMemoryClass()
            r2.append(r0)
            java.lang.String r0 = ", isLowMemoryDevice: "
            r2.append(r0)
            android.app.ActivityManager r7 = r7.activityManager
            boolean r7 = isLowMemoryDevice(r7)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.d(r3, r7)
        Ld4:
            return
    }

    private static int getMaxSize(android.app.ActivityManager r2, float r3, float r4) {
            int r0 = r2.getMemoryClass()
            r1 = 1048576(0x100000, float:1.469368E-39)
            int r0 = r0 * r1
            boolean r2 = isLowMemoryDevice(r2)
            float r0 = (float) r0
            if (r2 == 0) goto Lf
            r3 = r4
        Lf:
            float r0 = r0 * r3
            int r2 = java.lang.Math.round(r0)
            return r2
    }

    @android.annotation.TargetApi(19)
    public static boolean isLowMemoryDevice(android.app.ActivityManager r0) {
            boolean r0 = r0.isLowRamDevice()
            return r0
    }

    private java.lang.String toMb(int r4) {
            r3 = this;
            android.content.Context r0 = r3.context
            long r1 = (long) r4
            java.lang.String r4 = android.text.format.Formatter.formatFileSize(r0, r1)
            return r4
    }

    public int getArrayPoolSizeInBytes() {
            r1 = this;
            int r0 = r1.arrayPoolSize
            return r0
    }

    public int getBitmapPoolSize() {
            r1 = this;
            int r0 = r1.bitmapPoolSize
            return r0
    }

    public int getMemoryCacheSize() {
            r1 = this;
            int r0 = r1.memoryCacheSize
            return r0
    }
}
