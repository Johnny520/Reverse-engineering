package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
class SourceGenerator implements com.bumptech.glide.load.engine.DataFetcherGenerator, com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback {
    private static final java.lang.String TAG = "SourceGenerator";
    private final com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback cb;
    private volatile java.lang.Object dataToCache;
    private final com.bumptech.glide.load.engine.DecodeHelper<?> helper;
    private volatile com.bumptech.glide.load.model.ModelLoader.LoadData<?> loadData;
    private volatile int loadDataListIndex;
    private volatile com.bumptech.glide.load.engine.DataCacheKey originalKey;
    private volatile com.bumptech.glide.load.engine.DataCacheGenerator sourceCacheGenerator;


    public SourceGenerator(com.bumptech.glide.load.engine.DecodeHelper<?> r1, com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback r2) {
            r0 = this;
            r0.<init>()
            r0.helper = r1
            r0.cb = r2
            return
    }

    private boolean cacheData(java.lang.Object r12) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "SourceGenerator"
            long r1 = com.bumptech.glide.util.LogTime.getLogTime()
            r3 = 0
            com.bumptech.glide.load.engine.DecodeHelper<?> r4 = r11.helper     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.data.DataRewinder r4 = r4.getRewinder(r12)     // Catch: java.lang.Throwable -> L72
            java.lang.Object r5 = r4.rewindAndGet()     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.engine.DecodeHelper<?> r6 = r11.helper     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.Encoder r6 = r6.getSourceEncoder(r5)     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.engine.DataCacheWriter r7 = new com.bumptech.glide.load.engine.DataCacheWriter     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.engine.DecodeHelper<?> r8 = r11.helper     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.Options r8 = r8.getOptions()     // Catch: java.lang.Throwable -> L72
            r7.<init>(r6, r5, r8)     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.engine.DataCacheKey r5 = new com.bumptech.glide.load.engine.DataCacheKey     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r8 = r11.loadData     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.Key r8 = r8.sourceKey     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.engine.DecodeHelper<?> r9 = r11.helper     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.Key r9 = r9.getSignature()     // Catch: java.lang.Throwable -> L72
            r5.<init>(r8, r9)     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.engine.DecodeHelper<?> r8 = r11.helper     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.engine.cache.DiskCache r8 = r8.getDiskCache()     // Catch: java.lang.Throwable -> L72
            r8.put(r5, r7)     // Catch: java.lang.Throwable -> L72
            r7 = 2
            boolean r7 = android.util.Log.isLoggable(r0, r7)     // Catch: java.lang.Throwable -> L72
            java.lang.String r9 = ", data: "
            if (r7 == 0) goto L74
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r7.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.String r10 = "Finished encoding source to cache, key: "
            r7.append(r10)     // Catch: java.lang.Throwable -> L72
            r7.append(r5)     // Catch: java.lang.Throwable -> L72
            r7.append(r9)     // Catch: java.lang.Throwable -> L72
            r7.append(r12)     // Catch: java.lang.Throwable -> L72
            java.lang.String r10 = ", encoder: "
            r7.append(r10)     // Catch: java.lang.Throwable -> L72
            r7.append(r6)     // Catch: java.lang.Throwable -> L72
            java.lang.String r6 = ", duration: "
            r7.append(r6)     // Catch: java.lang.Throwable -> L72
            double r1 = com.bumptech.glide.util.LogTime.getElapsedMillis(r1)     // Catch: java.lang.Throwable -> L72
            r7.append(r1)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L72
            android.util.Log.v(r0, r1)     // Catch: java.lang.Throwable -> L72
            goto L74
        L72:
            r12 = move-exception
            goto Ldf
        L74:
            java.io.File r1 = r8.get(r5)     // Catch: java.lang.Throwable -> L72
            r2 = 1
            if (r1 == 0) goto L96
            r11.originalKey = r5     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.engine.DataCacheGenerator r12 = new com.bumptech.glide.load.engine.DataCacheGenerator     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r11.loadData     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.Key r0 = r0.sourceKey     // Catch: java.lang.Throwable -> L72
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r11.helper     // Catch: java.lang.Throwable -> L72
            r12.<init>(r0, r1, r11)     // Catch: java.lang.Throwable -> L72
            r11.sourceCacheGenerator = r12     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r12 = r11.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r12 = r12.fetcher
            r12.cleanup()
            return r2
        L96:
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto Lbe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r1.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "Attempt to write: "
            r1.append(r5)     // Catch: java.lang.Throwable -> L72
            com.bumptech.glide.load.engine.DataCacheKey r5 = r11.originalKey     // Catch: java.lang.Throwable -> L72
            r1.append(r5)     // Catch: java.lang.Throwable -> L72
            r1.append(r9)     // Catch: java.lang.Throwable -> L72
            r1.append(r12)     // Catch: java.lang.Throwable -> L72
            java.lang.String r12 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r1.append(r12)     // Catch: java.lang.Throwable -> L72
            java.lang.String r12 = r1.toString()     // Catch: java.lang.Throwable -> L72
            android.util.Log.d(r0, r12)     // Catch: java.lang.Throwable -> L72
        Lbe:
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r12 = r11.cb     // Catch: java.lang.Throwable -> Ldd
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r11.loadData     // Catch: java.lang.Throwable -> Ldd
            com.bumptech.glide.load.Key r5 = r0.sourceKey     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r6 = r4.rewindAndGet()     // Catch: java.lang.Throwable -> Ldd
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r11.loadData     // Catch: java.lang.Throwable -> Ldd
            com.bumptech.glide.load.data.DataFetcher<Data> r7 = r0.fetcher     // Catch: java.lang.Throwable -> Ldd
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r11.loadData     // Catch: java.lang.Throwable -> Ldd
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher     // Catch: java.lang.Throwable -> Ldd
            com.bumptech.glide.load.DataSource r8 = r0.getDataSource()     // Catch: java.lang.Throwable -> Ldd
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r11.loadData     // Catch: java.lang.Throwable -> Ldd
            com.bumptech.glide.load.Key r9 = r0.sourceKey     // Catch: java.lang.Throwable -> Ldd
            r4 = r12
            r4.onDataFetcherReady(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Ldd
            return r3
        Ldd:
            r12 = move-exception
            r3 = r2
        Ldf:
            if (r3 != 0) goto Le8
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r11.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher
            r0.cleanup()
        Le8:
            throw r12
    }

    private boolean hasNextModelLoader() {
            r2 = this;
            int r0 = r2.loadDataListIndex
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r2.helper
            java.util.List r1 = r1.getLoadData()
            int r1 = r1.size()
            if (r0 >= r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private void startNextLoad(com.bumptech.glide.load.model.ModelLoader.LoadData<?> r4) {
            r3 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r3.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r3.helper
            com.bumptech.glide.Priority r1 = r1.getPriority()
            com.bumptech.glide.load.engine.SourceGenerator$1 r2 = new com.bumptech.glide.load.engine.SourceGenerator$1
            r2.<init>(r3, r4)
            r0.loadData(r1, r2)
            return
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

    public boolean isCurrentRequest(com.bumptech.glide.load.model.ModelLoader.LoadData<?> r2) {
            r1 = this;
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r1.loadData
            if (r0 == 0) goto L8
            if (r0 != r2) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherFailed(com.bumptech.glide.load.Key r2, java.lang.Exception r3, com.bumptech.glide.load.data.DataFetcher<?> r4, com.bumptech.glide.load.DataSource r5) {
            r1 = this;
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r5 = r1.cb
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r1.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher
            com.bumptech.glide.load.DataSource r0 = r0.getDataSource()
            r5.onDataFetcherFailed(r2, r3, r4, r0)
            return
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherReady(com.bumptech.glide.load.Key r7, java.lang.Object r8, com.bumptech.glide.load.data.DataFetcher<?> r9, com.bumptech.glide.load.DataSource r10, com.bumptech.glide.load.Key r11) {
            r6 = this;
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r0 = r6.cb
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r10 = r6.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r10 = r10.fetcher
            com.bumptech.glide.load.DataSource r4 = r10.getDataSource()
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r7
            r0.onDataFetcherReady(r1, r2, r3, r4, r5)
            return
    }

    public void onDataReadyInternal(com.bumptech.glide.load.model.ModelLoader.LoadData<?> r7, java.lang.Object r8) {
            r6 = this;
            com.bumptech.glide.load.engine.DecodeHelper<?> r0 = r6.helper
            com.bumptech.glide.load.engine.DiskCacheStrategy r0 = r0.getDiskCacheStrategy()
            if (r8 == 0) goto L1c
            com.bumptech.glide.load.data.DataFetcher<Data> r1 = r7.fetcher
            com.bumptech.glide.load.DataSource r1 = r1.getDataSource()
            boolean r0 = r0.isDataCacheable(r1)
            if (r0 == 0) goto L1c
            r6.dataToCache = r8
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r7 = r6.cb
            r7.reschedule()
            goto L2c
        L1c:
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r0 = r6.cb
            com.bumptech.glide.load.Key r1 = r7.sourceKey
            com.bumptech.glide.load.data.DataFetcher<Data> r3 = r7.fetcher
            com.bumptech.glide.load.DataSource r4 = r3.getDataSource()
            com.bumptech.glide.load.engine.DataCacheKey r5 = r6.originalKey
            r2 = r8
            r0.onDataFetcherReady(r1, r2, r3, r4, r5)
        L2c:
            return
    }

    public void onLoadFailedInternal(com.bumptech.glide.load.model.ModelLoader.LoadData<?> r4, @Yue.InterfaceC4410 java.lang.Exception r5) {
            r3 = this;
            com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback r0 = r3.cb
            com.bumptech.glide.load.engine.DataCacheKey r1 = r3.originalKey
            com.bumptech.glide.load.data.DataFetcher<Data> r4 = r4.fetcher
            com.bumptech.glide.load.DataSource r2 = r4.getDataSource()
            r0.onDataFetcherFailed(r1, r5, r4, r2)
            return
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void reschedule() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public boolean startNext() {
            r5 = this;
            java.lang.Object r0 = r5.dataToCache
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r5.dataToCache
            r5.dataToCache = r1
            boolean r0 = r5.cacheData(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L20
            return r2
        L11:
            r0 = move-exception
            r3 = 3
            java.lang.String r4 = "SourceGenerator"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L20
            java.lang.String r3 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r4, r3, r0)
        L20:
            com.bumptech.glide.load.engine.DataCacheGenerator r0 = r5.sourceCacheGenerator
            if (r0 == 0) goto L2d
            com.bumptech.glide.load.engine.DataCacheGenerator r0 = r5.sourceCacheGenerator
            boolean r0 = r0.startNext()
            if (r0 == 0) goto L2d
            return r2
        L2d:
            r5.sourceCacheGenerator = r1
            r5.loadData = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L7d
            boolean r1 = r5.hasNextModelLoader()
            if (r1 == 0) goto L7d
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r5.helper
            java.util.List r1 = r1.getLoadData()
            int r3 = r5.loadDataListIndex
            int r4 = r3 + 1
            r5.loadDataListIndex = r4
            java.lang.Object r1 = r1.get(r3)
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = (com.bumptech.glide.load.model.ModelLoader.LoadData) r1
            r5.loadData = r1
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r1 = r5.loadData
            if (r1 == 0) goto L32
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r5.helper
            com.bumptech.glide.load.engine.DiskCacheStrategy r1 = r1.getDiskCacheStrategy()
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r3 = r5.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r3 = r3.fetcher
            com.bumptech.glide.load.DataSource r3 = r3.getDataSource()
            boolean r1 = r1.isDataCacheable(r3)
            if (r1 != 0) goto L76
            com.bumptech.glide.load.engine.DecodeHelper<?> r1 = r5.helper
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r3 = r5.loadData
            com.bumptech.glide.load.data.DataFetcher<Data> r3 = r3.fetcher
            java.lang.Class r3 = r3.getDataClass()
            boolean r1 = r1.hasLoadPath(r3)
            if (r1 == 0) goto L32
        L76:
            com.bumptech.glide.load.model.ModelLoader$LoadData<?> r0 = r5.loadData
            r5.startNextLoad(r0)
            r0 = r2
            goto L32
        L7d:
            return r0
    }
}
