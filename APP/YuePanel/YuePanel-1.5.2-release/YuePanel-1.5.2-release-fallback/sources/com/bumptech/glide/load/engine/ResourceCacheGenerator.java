package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
class ResourceCacheGenerator implements com.bumptech.glide.load.engine.DataFetcherGenerator, com.bumptech.glide.load.data.DataFetcher.DataCallback<java.lang.Object> {
    private java.io.File cacheFile;
    private final com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback cb;
    private com.bumptech.glide.load.engine.ResourceCacheKey currentKey;
    private final com.bumptech.glide.load.engine.DecodeHelper<?> helper;
    private volatile com.bumptech.glide.load.model.ModelLoader.LoadData<?> loadData;
    private int modelLoaderIndex;
    private java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> modelLoaders;
    private int resourceClassIndex;
    private int sourceIdIndex;
    private com.bumptech.glide.load.Key sourceKey;

    public ResourceCacheGenerator(com.bumptech.glide.load.engine.DecodeHelper<?> r2, com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.resourceClassIndex = r0
            r1.helper = r2
            r1.cb = r3
            return
    }

    private boolean hasNextModelLoader() {
            r2 = this;
            int r0 = r2.modelLoaderIndex
            java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> r1 = r2.modelLoaders
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public void cancel() {
            r1 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r1.loadData
            if (r0 == 0) goto L9
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher
            r0.cancel()
        L9:
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onDataReady(java.lang.Object r7) {
            r6 = this;
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r0 = r6.cb
            com.bumptech.glide.load.Key r1 = r6.sourceKey
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r2 = r6.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r3 = r2.fetcher
            com.bumptech.glide.load.DataSource r4 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            com.bumptech.glide.load.engine.ResourceCacheKey r5 = r6.currentKey
            r2 = r7
            r0.onDataFetcherReady(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onLoadFailed(@Yue.InterfaceC4410 java.lang.Exception r5) {
            r4 = this;
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r0 = r4.cb
            com.bumptech.glide.load.engine.ResourceCacheKey r1 = r4.currentKey
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r2 = r4.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r2 = r2.fetcher
            com.bumptech.glide.load.DataSource r3 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r0.onDataFetcherFailed(r1, r5, r2, r3)
            return
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public boolean startNext() {
            r14 = this;
            java.lang.String r0 = "ResourceCacheGenerator.startNext"
            com.bumptech.glide.util.pool.GlideTrace.beginSection(r0)
            com.bumptech.glide.load.engine.DecodeHelper<?> r0 = r14.helper     // Catch: java.lang.Throwable -> L5f
            java.util.List r0 = r0.getCacheKeys()     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            if (r1 == 0) goto L16
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return r2
        L16:
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r14.helper     // Catch: java.lang.Throwable -> L5f
            java.util.List r1 = r1.getRegisteredResourceClasses()     // Catch: java.lang.Throwable -> L5f
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L62
            java.lang.Class<java.io.File> r0 = java.io.File.class
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r14.helper     // Catch: java.lang.Throwable -> L5f
            java.lang.Class r1 = r1.getTranscodeClass()     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L34
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return r2
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = "Failed to find any load path from "
            r1.append(r2)     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r2 = r14.helper     // Catch: java.lang.Throwable -> L5f
            java.lang.Class r2 = r2.getModelClass()     // Catch: java.lang.Throwable -> L5f
            r1.append(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = " to "
            r1.append(r2)     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r2 = r14.helper     // Catch: java.lang.Throwable -> L5f
            java.lang.Class r2 = r2.getTranscodeClass()     // Catch: java.lang.Throwable -> L5f
            r1.append(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5f
            throw r0     // Catch: java.lang.Throwable -> L5f
        L5f:
            r0 = move-exception
            goto L140
        L62:
            java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> r3 = r14.modelLoaders     // Catch: java.lang.Throwable -> L5f
            r4 = 1
            if (r3 == 0) goto Lc8
            boolean r3 = r14.hasNextModelLoader()     // Catch: java.lang.Throwable -> L5f
            if (r3 != 0) goto L6e
            goto Lc8
        L6e:
            r0 = 0
            r14.loadData = r0     // Catch: java.lang.Throwable -> L5f
        L71:
            if (r2 != 0) goto Lc4
            boolean r0 = r14.hasNextModelLoader()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto Lc4
            java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> r0 = r14.modelLoaders     // Catch: java.lang.Throwable -> L5f
            int r1 = r14.modelLoaderIndex     // Catch: java.lang.Throwable -> L5f
            int r3 = r1 + 1
            r14.modelLoaderIndex = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.model.ModelLoader r0 = (com.bumptech.glide.load.model.ModelLoader) r0     // Catch: java.lang.Throwable -> L5f
            java.io.File r1 = r14.cacheFile     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r3 = r14.helper     // Catch: java.lang.Throwable -> L5f
            int r3 = r3.getWidth()     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r5 = r14.helper     // Catch: java.lang.Throwable -> L5f
            int r5 = r5.getHeight()     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r6 = r14.helper     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.Options r6 = r6.getOptions()     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.model.ModelLoader$LoadData r0 = r0.buildLoadData(r1, r3, r5, r6)     // Catch: java.lang.Throwable -> L5f
            r14.loadData = r0     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r14.loadData     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L71
            com.bumptech.glide.load.engine.DecodeHelper<?> r0 = r14.helper     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r1 = r14.loadData     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.data.DataFetcher<Data> r1 = r1.fetcher     // Catch: java.lang.Throwable -> L5f
            java.lang.Class r1 = r1.getDataClass()     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r0.hasLoadPath(r1)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L71
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r14.loadData     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r14.helper     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.Priority r1 = r1.getPriority()     // Catch: java.lang.Throwable -> L5f
            r0.loadData(r1, r14)     // Catch: java.lang.Throwable -> L5f
            r2 = r4
            goto L71
        Lc4:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return r2
        Lc8:
            int r3 = r14.resourceClassIndex     // Catch: java.lang.Throwable -> L5f
            int r3 = r3 + r4
            r14.resourceClassIndex = r3     // Catch: java.lang.Throwable -> L5f
            int r5 = r1.size()     // Catch: java.lang.Throwable -> L5f
            if (r3 < r5) goto Le4
            int r3 = r14.sourceIdIndex     // Catch: java.lang.Throwable -> L5f
            int r3 = r3 + r4
            r14.sourceIdIndex = r3     // Catch: java.lang.Throwable -> L5f
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L5f
            if (r3 < r4) goto Le2
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return r2
        Le2:
            r14.resourceClassIndex = r2     // Catch: java.lang.Throwable -> L5f
        Le4:
            int r3 = r14.sourceIdIndex     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.Key r3 = (com.bumptech.glide.load.Key) r3     // Catch: java.lang.Throwable -> L5f
            int r4 = r14.resourceClassIndex     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L5f
            r11 = r4
            java.lang.Class r11 = (java.lang.Class) r11     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.Transformation r10 = r4.getTransformation(r11)     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.ResourceCacheKey r13 = new com.bumptech.glide.load.engine.ResourceCacheKey     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r5 = r4.getArrayPool()     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.Key r7 = r4.getSignature()     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper     // Catch: java.lang.Throwable -> L5f
            int r8 = r4.getWidth()     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper     // Catch: java.lang.Throwable -> L5f
            int r9 = r4.getHeight()     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.Options r12 = r4.getOptions()     // Catch: java.lang.Throwable -> L5f
            r4 = r13
            r6 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L5f
            r14.currentKey = r13     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r14.helper     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.cache.DiskCache r4 = r4.getDiskCache()     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.ResourceCacheKey r5 = r14.currentKey     // Catch: java.lang.Throwable -> L5f
            java.io.File r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L5f
            r14.cacheFile = r4     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L62
            r14.sourceKey = r3     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.DecodeHelper<?> r3 = r14.helper     // Catch: java.lang.Throwable -> L5f
            java.util.List r3 = r3.getModelLoaders(r4)     // Catch: java.lang.Throwable -> L5f
            r14.modelLoaders = r3     // Catch: java.lang.Throwable -> L5f
            r14.modelLoaderIndex = r2     // Catch: java.lang.Throwable -> L5f
            goto L62
        L140:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            throw r0
    }
}
