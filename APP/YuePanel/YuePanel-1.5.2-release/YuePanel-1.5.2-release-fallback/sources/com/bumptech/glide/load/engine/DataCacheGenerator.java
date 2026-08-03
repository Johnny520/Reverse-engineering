package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
class DataCacheGenerator implements com.bumptech.glide.load.engine.DataFetcherGenerator, com.bumptech.glide.load.data.DataFetcher.DataCallback<java.lang.Object> {
    private java.io.File cacheFile;
    private final java.util.List<com.bumptech.glide.load.Key> cacheKeys;
    private final com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback cb;
    private final com.bumptech.glide.load.engine.DecodeHelper<?> helper;
    private volatile com.bumptech.glide.load.model.ModelLoader.LoadData<?> loadData;
    private int modelLoaderIndex;
    private java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> modelLoaders;
    private int sourceIdIndex;
    private com.bumptech.glide.load.Key sourceKey;

    public DataCacheGenerator(com.bumptech.glide.load.engine.DecodeHelper<?> r2, com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback r3) {
            r1 = this;
            java.util.List r0 = r2.getCacheKeys()
            r1.<init>(r0, r2, r3)
            return
    }

    public DataCacheGenerator(java.util.List<com.bumptech.glide.load.Key> r2, com.bumptech.glide.load.engine.DecodeHelper<?> r3, com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.sourceIdIndex = r0
            r1.cacheKeys = r2
            r1.helper = r3
            r1.cb = r4
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
            com.bumptech.glide.load.DataSource r4 = com.bumptech.glide.load.DataSource.DATA_DISK_CACHE
            com.bumptech.glide.load.Key r5 = r6.sourceKey
            r2 = r7
            r0.onDataFetcherReady(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onLoadFailed(@Yue.InterfaceC4410 java.lang.Exception r5) {
            r4 = this;
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r0 = r4.cb
            com.bumptech.glide.load.Key r1 = r4.sourceKey
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r2 = r4.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r2 = r2.fetcher
            com.bumptech.glide.load.DataSource r3 = com.bumptech.glide.load.DataSource.DATA_DISK_CACHE
            r0.onDataFetcherFailed(r1, r5, r2, r3)
            return
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public boolean startNext() {
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            com.bumptech.glide.util.pool.GlideTrace.beginSection(r0)
        L5:
            java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> r0 = r7.modelLoaders     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.hasNextModelLoader()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.loadData = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.hasNextModelLoader()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List<com.bumptech.glide.load.model.ModelLoader<java.io.File, ?>> r0 = r7.modelLoaders     // Catch: java.lang.Throwable -> L68
            int r3 = r7.modelLoaderIndex     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.modelLoaderIndex = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.model.ModelLoader r0 = (com.bumptech.glide.load.model.ModelLoader) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.cacheFile     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r7.helper     // Catch: java.lang.Throwable -> L68
            int r4 = r4.getWidth()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.DecodeHelper<?> r5 = r7.helper     // Catch: java.lang.Throwable -> L68
            int r5 = r5.getHeight()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.DecodeHelper<?> r6 = r7.helper     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.Options r6 = r6.getOptions()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.model.ModelLoader$LoadData r0 = r0.buildLoadData(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.loadData = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r7.loadData     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.DecodeHelper<?> r0 = r7.helper     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r3 = r7.loadData     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.DataFetcher<Data> r3 = r3.fetcher     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.getDataClass()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.hasLoadPath(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r7.loadData     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.DecodeHelper<?> r2 = r7.helper     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.Priority r2 = r2.getPriority()     // Catch: java.lang.Throwable -> L68
            r0.loadData(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return r2
        L6e:
            int r0 = r7.sourceIdIndex     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.sourceIdIndex = r0     // Catch: java.lang.Throwable -> L68
            java.util.List<com.bumptech.glide.load.Key> r1 = r7.cacheKeys     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return r2
        L7f:
            java.util.List<com.bumptech.glide.load.Key> r0 = r7.cacheKeys     // Catch: java.lang.Throwable -> L68
            int r1 = r7.sourceIdIndex     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.Key r0 = (com.bumptech.glide.load.Key) r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.DataCacheKey r1 = new com.bumptech.glide.load.engine.DataCacheKey     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.DecodeHelper<?> r3 = r7.helper     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.Key r3 = r3.getSignature()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.DecodeHelper<?> r3 = r7.helper     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.cache.DiskCache r3 = r3.getDiskCache()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.get(r1)     // Catch: java.lang.Throwable -> L68
            r7.cacheFile = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.sourceKey = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.DecodeHelper<?> r0 = r7.helper     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.getModelLoaders(r1)     // Catch: java.lang.Throwable -> L68
            r7.modelLoaders = r0     // Catch: java.lang.Throwable -> L68
            r7.modelLoaderIndex = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            throw r0
    }
}
