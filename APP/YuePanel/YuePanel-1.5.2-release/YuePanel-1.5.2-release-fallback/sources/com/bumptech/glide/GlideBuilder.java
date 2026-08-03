package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public final class GlideBuilder {
    private com.bumptech.glide.load.engine.executor.GlideExecutor animationExecutor;
    private com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool;
    private com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private com.bumptech.glide.manager.ConnectivityMonitorFactory connectivityMonitorFactory;

    @Yue.InterfaceC4544
    private java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> defaultRequestListeners;
    private com.bumptech.glide.Glide.RequestOptionsFactory defaultRequestOptionsFactory;
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.TransitionOptions<?, ?>> defaultTransitionOptions;
    private com.bumptech.glide.load.engine.executor.GlideExecutor diskCacheExecutor;
    private com.bumptech.glide.load.engine.cache.DiskCache.Factory diskCacheFactory;
    private com.bumptech.glide.load.engine.Engine engine;
    private final com.bumptech.glide.GlideExperiments.Builder glideExperimentsBuilder;
    private boolean isActiveResourceRetentionAllowed;
    private int logLevel;
    private com.bumptech.glide.load.engine.cache.MemoryCache memoryCache;
    private com.bumptech.glide.load.engine.cache.MemorySizeCalculator memorySizeCalculator;

    @Yue.InterfaceC4544
    private com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory requestManagerFactory;
    private com.bumptech.glide.load.engine.executor.GlideExecutor sourceExecutor;



    public static final class EnableImageDecoderForBitmaps implements com.bumptech.glide.GlideExperiments.Experiment {
        public EnableImageDecoderForBitmaps() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class LogRequestOrigins implements com.bumptech.glide.GlideExperiments.Experiment {
        public LogRequestOrigins() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class ManualOverrideHardwareBitmapMaxFdCount implements com.bumptech.glide.GlideExperiments.Experiment {
        final int fdCount;

        public ManualOverrideHardwareBitmapMaxFdCount(int r1) {
                r0 = this;
                r0.<init>()
                r0.fdCount = r1
                return
        }
    }

    public GlideBuilder() {
            r1 = this;
            r1.<init>()
            Yue.ۥ۟ۡۨۡ r0 = new Yue.ۥ۟ۡۨۡ
            r0.<init>()
            r1.defaultTransitionOptions = r0
            com.bumptech.glide.GlideExperiments$Builder r0 = new com.bumptech.glide.GlideExperiments$Builder
            r0.<init>()
            r1.glideExperimentsBuilder = r0
            r0 = 4
            r1.logLevel = r0
            com.bumptech.glide.GlideBuilder$1 r0 = new com.bumptech.glide.GlideBuilder$1
            r0.<init>(r1)
            r1.defaultRequestOptionsFactory = r0
            return
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder addGlobalRequestListener(@Yue.InterfaceC4410 com.bumptech.glide.request.RequestListener<java.lang.Object> r2) {
            r1 = this;
            java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> r0 = r1.defaultRequestListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.defaultRequestListeners = r0
        Lb:
            java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> r0 = r1.defaultRequestListeners
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.Glide build(@Yue.InterfaceC4410 android.content.Context r18, java.util.List<com.bumptech.glide.module.GlideModule> r19, com.bumptech.glide.module.AppGlideModule r20) {
            r17 = this;
            r0 = r17
            r2 = r18
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r0.sourceExecutor
            if (r1 != 0) goto Le
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = com.bumptech.glide.load.engine.executor.GlideExecutor.newSourceExecutor()
            r0.sourceExecutor = r1
        Le:
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r0.diskCacheExecutor
            if (r1 != 0) goto L18
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = com.bumptech.glide.load.engine.executor.GlideExecutor.newDiskCacheExecutor()
            r0.diskCacheExecutor = r1
        L18:
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r0.animationExecutor
            if (r1 != 0) goto L22
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = com.bumptech.glide.load.engine.executor.GlideExecutor.newAnimationExecutor()
            r0.animationExecutor = r1
        L22:
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator r1 = r0.memorySizeCalculator
            if (r1 != 0) goto L31
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder r1 = new com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder
            r1.<init>(r2)
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator r1 = r1.build()
            r0.memorySizeCalculator = r1
        L31:
            com.bumptech.glide.manager.ConnectivityMonitorFactory r1 = r0.connectivityMonitorFactory
            if (r1 != 0) goto L3c
            com.bumptech.glide.manager.DefaultConnectivityMonitorFactory r1 = new com.bumptech.glide.manager.DefaultConnectivityMonitorFactory
            r1.<init>()
            r0.connectivityMonitorFactory = r1
        L3c:
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r0.bitmapPool
            if (r1 != 0) goto L58
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator r1 = r0.memorySizeCalculator
            int r1 = r1.getBitmapPoolSize()
            if (r1 <= 0) goto L51
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool r3 = new com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool
            long r4 = (long) r1
            r3.<init>(r4)
            r0.bitmapPool = r3
            goto L58
        L51:
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter r1 = new com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter
            r1.<init>()
            r0.bitmapPool = r1
        L58:
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1 = r0.arrayPool
            if (r1 != 0) goto L69
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool r1 = new com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator r3 = r0.memorySizeCalculator
            int r3 = r3.getArrayPoolSizeInBytes()
            r1.<init>(r3)
            r0.arrayPool = r1
        L69:
            com.bumptech.glide.load.engine.cache.MemoryCache r1 = r0.memoryCache
            if (r1 != 0) goto L7b
            com.bumptech.glide.load.engine.cache.LruResourceCache r1 = new com.bumptech.glide.load.engine.cache.LruResourceCache
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator r3 = r0.memorySizeCalculator
            int r3 = r3.getMemoryCacheSize()
            long r3 = (long) r3
            r1.<init>(r3)
            r0.memoryCache = r1
        L7b:
            com.bumptech.glide.load.engine.cache.DiskCache$Factory r1 = r0.diskCacheFactory
            if (r1 != 0) goto L86
            com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory r1 = new com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory
            r1.<init>(r2)
            r0.diskCacheFactory = r1
        L86:
            com.bumptech.glide.load.engine.Engine r1 = r0.engine
            if (r1 != 0) goto La2
            com.bumptech.glide.load.engine.Engine r1 = new com.bumptech.glide.load.engine.Engine
            com.bumptech.glide.load.engine.cache.MemoryCache r4 = r0.memoryCache
            com.bumptech.glide.load.engine.cache.DiskCache$Factory r5 = r0.diskCacheFactory
            com.bumptech.glide.load.engine.executor.GlideExecutor r6 = r0.diskCacheExecutor
            com.bumptech.glide.load.engine.executor.GlideExecutor r7 = r0.sourceExecutor
            com.bumptech.glide.load.engine.executor.GlideExecutor r8 = com.bumptech.glide.load.engine.executor.GlideExecutor.newUnlimitedSourceExecutor()
            com.bumptech.glide.load.engine.executor.GlideExecutor r9 = r0.animationExecutor
            boolean r10 = r0.isActiveResourceRetentionAllowed
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.engine = r1
        La2:
            java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> r1 = r0.defaultRequestListeners
            if (r1 != 0) goto Lad
            java.util.List r1 = java.util.Collections.emptyList()
            r0.defaultRequestListeners = r1
            goto Lb3
        Lad:
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.defaultRequestListeners = r1
        Lb3:
            com.bumptech.glide.GlideExperiments$Builder r1 = r0.glideExperimentsBuilder
            com.bumptech.glide.GlideExperiments r15 = r1.build()
            com.bumptech.glide.manager.RequestManagerRetriever r7 = new com.bumptech.glide.manager.RequestManagerRetriever
            com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory r1 = r0.requestManagerFactory
            r7.<init>(r1)
            com.bumptech.glide.Glide r16 = new com.bumptech.glide.Glide
            com.bumptech.glide.load.engine.Engine r3 = r0.engine
            com.bumptech.glide.load.engine.cache.MemoryCache r4 = r0.memoryCache
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r5 = r0.bitmapPool
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r6 = r0.arrayPool
            com.bumptech.glide.manager.ConnectivityMonitorFactory r8 = r0.connectivityMonitorFactory
            int r9 = r0.logLevel
            com.bumptech.glide.Glide$RequestOptionsFactory r10 = r0.defaultRequestOptionsFactory
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.TransitionOptions<?, ?>> r11 = r0.defaultTransitionOptions
            java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> r12 = r0.defaultRequestListeners
            r1 = r16
            r2 = r18
            r13 = r19
            r14 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setAnimationExecutor(@Yue.InterfaceC4544 com.bumptech.glide.load.engine.executor.GlideExecutor r1) {
            r0 = this;
            r0.animationExecutor = r1
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setArrayPool(@Yue.InterfaceC4544 com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1) {
            r0 = this;
            r0.arrayPool = r1
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setBitmapPool(@Yue.InterfaceC4544 com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1) {
            r0 = this;
            r0.bitmapPool = r1
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setConnectivityMonitorFactory(@Yue.InterfaceC4544 com.bumptech.glide.manager.ConnectivityMonitorFactory r1) {
            r0 = this;
            r0.connectivityMonitorFactory = r1
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setDefaultRequestOptions(@Yue.InterfaceC4410 com.bumptech.glide.Glide.RequestOptionsFactory r1) {
            r0 = this;
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            com.bumptech.glide.Glide$RequestOptionsFactory r1 = (com.bumptech.glide.Glide.RequestOptionsFactory) r1
            r0.defaultRequestOptionsFactory = r1
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setDefaultRequestOptions(@Yue.InterfaceC4544 com.bumptech.glide.request.RequestOptions r2) {
            r1 = this;
            com.bumptech.glide.GlideBuilder$2 r0 = new com.bumptech.glide.GlideBuilder$2
            r0.<init>(r1, r2)
            com.bumptech.glide.GlideBuilder r2 = r1.setDefaultRequestOptions(r0)
            return r2
    }

    @Yue.InterfaceC4410
    public <T> com.bumptech.glide.GlideBuilder setDefaultTransitionOptions(@Yue.InterfaceC4410 java.lang.Class<T> r2, @Yue.InterfaceC4544 com.bumptech.glide.TransitionOptions<?, T> r3) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.TransitionOptions<?, ?>> r0 = r1.defaultTransitionOptions
            r0.put(r2, r3)
            return r1
    }

    @java.lang.Deprecated
    public com.bumptech.glide.GlideBuilder setDisableHardwareBitmapsOnO(boolean r1) {
            r0 = this;
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setDiskCache(@Yue.InterfaceC4544 com.bumptech.glide.load.engine.cache.DiskCache.Factory r1) {
            r0 = this;
            r0.diskCacheFactory = r1
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setDiskCacheExecutor(@Yue.InterfaceC4544 com.bumptech.glide.load.engine.executor.GlideExecutor r1) {
            r0 = this;
            r0.diskCacheExecutor = r1
            return r0
    }

    public com.bumptech.glide.GlideBuilder setEngine(com.bumptech.glide.load.engine.Engine r1) {
            r0 = this;
            r0.engine = r1
            return r0
    }

    public com.bumptech.glide.GlideBuilder setImageDecoderEnabledForBitmaps(boolean r4) {
            r3 = this;
            com.bumptech.glide.GlideExperiments$Builder r0 = r3.glideExperimentsBuilder
            com.bumptech.glide.GlideBuilder$EnableImageDecoderForBitmaps r1 = new com.bumptech.glide.GlideBuilder$EnableImageDecoderForBitmaps
            r1.<init>()
            if (r4 == 0) goto L11
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L11
            r4 = 1
            goto L12
        L11:
            r4 = 0
        L12:
            r0.update(r1, r4)
            return r3
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setIsActiveResourceRetentionAllowed(boolean r1) {
            r0 = this;
            r0.isActiveResourceRetentionAllowed = r1
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setLogLevel(int r2) {
            r1 = this;
            r0 = 2
            if (r2 < r0) goto L9
            r0 = 6
            if (r2 > r0) goto L9
            r1.logLevel = r2
            return r1
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR"
            r2.<init>(r0)
            throw r2
    }

    public com.bumptech.glide.GlideBuilder setLogRequestOrigins(boolean r3) {
            r2 = this;
            com.bumptech.glide.GlideExperiments$Builder r0 = r2.glideExperimentsBuilder
            com.bumptech.glide.GlideBuilder$LogRequestOrigins r1 = new com.bumptech.glide.GlideBuilder$LogRequestOrigins
            r1.<init>()
            r0.update(r1, r3)
            return r2
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setMemoryCache(@Yue.InterfaceC4544 com.bumptech.glide.load.engine.cache.MemoryCache r1) {
            r0 = this;
            r0.memoryCache = r1
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setMemorySizeCalculator(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder r1) {
            r0 = this;
            com.bumptech.glide.load.engine.cache.MemorySizeCalculator r1 = r1.build()
            com.bumptech.glide.GlideBuilder r1 = r0.setMemorySizeCalculator(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setMemorySizeCalculator(@Yue.InterfaceC4544 com.bumptech.glide.load.engine.cache.MemorySizeCalculator r1) {
            r0 = this;
            r0.memorySizeCalculator = r1
            return r0
    }

    public void setRequestManagerFactory(@Yue.InterfaceC4544 com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory r1) {
            r0 = this;
            r0.requestManagerFactory = r1
            return
    }

    @java.lang.Deprecated
    public com.bumptech.glide.GlideBuilder setResizeExecutor(@Yue.InterfaceC4544 com.bumptech.glide.load.engine.executor.GlideExecutor r1) {
            r0 = this;
            com.bumptech.glide.GlideBuilder r1 = r0.setSourceExecutor(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideBuilder setSourceExecutor(@Yue.InterfaceC4544 com.bumptech.glide.load.engine.executor.GlideExecutor r1) {
            r0 = this;
            r0.sourceExecutor = r1
            return r0
    }
}
