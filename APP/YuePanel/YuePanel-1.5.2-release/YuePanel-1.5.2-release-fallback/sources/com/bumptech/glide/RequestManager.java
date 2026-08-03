package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public class RequestManager implements android.content.ComponentCallbacks2, com.bumptech.glide.manager.LifecycleListener, com.bumptech.glide.ModelTypes<com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable>> {
    private static final com.bumptech.glide.request.RequestOptions DECODE_TYPE_BITMAP = null;
    private static final com.bumptech.glide.request.RequestOptions DECODE_TYPE_GIF = null;
    private static final com.bumptech.glide.request.RequestOptions DOWNLOAD_ONLY_OPTIONS = null;
    private final java.lang.Runnable addSelfToLifecycle;
    private boolean clearOnStop;
    private final com.bumptech.glide.manager.ConnectivityMonitor connectivityMonitor;
    protected final android.content.Context context;
    private final java.util.concurrent.CopyOnWriteArrayList<com.bumptech.glide.request.RequestListener<java.lang.Object>> defaultRequestListeners;
    protected final com.bumptech.glide.Glide glide;
    final com.bumptech.glide.manager.Lifecycle lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;

    @Yue.InterfaceC2947("this")
    private com.bumptech.glide.request.RequestOptions requestOptions;

    @Yue.InterfaceC2947("this")
    private final com.bumptech.glide.manager.RequestTracker requestTracker;

    @Yue.InterfaceC2947("this")
    private final com.bumptech.glide.manager.TargetTracker targetTracker;

    @Yue.InterfaceC2947("this")
    private final com.bumptech.glide.manager.RequestManagerTreeNode treeNode;


    public static class ClearTarget extends com.bumptech.glide.request.target.CustomViewTarget<android.view.View, java.lang.Object> {
        public ClearTarget(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.CustomViewTarget
        public void onResourceCleared(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4544 com.bumptech.glide.request.transition.Transition<? super java.lang.Object> r2) {
                r0 = this;
                return
        }
    }

    public class RequestManagerConnectivityListener implements com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener {

        @Yue.InterfaceC2947("RequestManager.this")
        private final com.bumptech.glide.manager.RequestTracker requestTracker;
        final /* synthetic */ com.bumptech.glide.RequestManager this$0;

        public RequestManagerConnectivityListener(@Yue.InterfaceC4410 com.bumptech.glide.RequestManager r1, com.bumptech.glide.manager.RequestTracker r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.requestTracker = r2
                return
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public void onConnectivityChanged(boolean r2) {
                r1 = this;
                if (r2 == 0) goto Lf
                com.bumptech.glide.RequestManager r2 = r1.this$0
                monitor-enter(r2)
                com.bumptech.glide.manager.RequestTracker r0 = r1.requestTracker     // Catch: java.lang.Throwable -> Lc
                r0.restartRequests()     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                goto Lf
            Lc:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                throw r0
            Lf:
                return
        }
    }

    static {
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.decodeTypeOf(r0)
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.lock()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.RequestManager.DECODE_TYPE_BITMAP = r0
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r0 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.decodeTypeOf(r0)
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.lock()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.RequestManager.DECODE_TYPE_GIF = r0
            com.bumptech.glide.load.engine.DiskCacheStrategy r0 = com.bumptech.glide.load.engine.DiskCacheStrategy.DATA
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.diskCacheStrategyOf(r0)
            com.bumptech.glide.Priority r1 = com.bumptech.glide.Priority.LOW
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.priority(r1)
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            r1 = 1
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.skipMemoryCache(r1)
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.RequestManager.DOWNLOAD_ONLY_OPTIONS = r0
            return
    }

    public RequestManager(@Yue.InterfaceC4410 com.bumptech.glide.Glide r8, @Yue.InterfaceC4410 com.bumptech.glide.manager.Lifecycle r9, @Yue.InterfaceC4410 com.bumptech.glide.manager.RequestManagerTreeNode r10, @Yue.InterfaceC4410 android.content.Context r11) {
            r7 = this;
            com.bumptech.glide.manager.RequestTracker r4 = new com.bumptech.glide.manager.RequestTracker
            r4.<init>()
            com.bumptech.glide.manager.ConnectivityMonitorFactory r5 = r8.getConnectivityMonitorFactory()
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public RequestManager(com.bumptech.glide.Glide r2, com.bumptech.glide.manager.Lifecycle r3, com.bumptech.glide.manager.RequestManagerTreeNode r4, com.bumptech.glide.manager.RequestTracker r5, com.bumptech.glide.manager.ConnectivityMonitorFactory r6, android.content.Context r7) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.manager.TargetTracker r0 = new com.bumptech.glide.manager.TargetTracker
            r0.<init>()
            r1.targetTracker = r0
            com.bumptech.glide.RequestManager$1 r0 = new com.bumptech.glide.RequestManager$1
            r0.<init>(r1)
            r1.addSelfToLifecycle = r0
            r1.glide = r2
            r1.lifecycle = r3
            r1.treeNode = r4
            r1.requestTracker = r5
            r1.context = r7
            android.content.Context r4 = r7.getApplicationContext()
            com.bumptech.glide.RequestManager$RequestManagerConnectivityListener r7 = new com.bumptech.glide.RequestManager$RequestManagerConnectivityListener
            r7.<init>(r1, r5)
            com.bumptech.glide.manager.ConnectivityMonitor r4 = r6.build(r4, r7)
            r1.connectivityMonitor = r4
            r2.registerRequestManager(r1)
            boolean r5 = com.bumptech.glide.util.Util.isOnBackgroundThread()
            if (r5 == 0) goto L37
            com.bumptech.glide.util.Util.postOnUiThread(r0)
            goto L3a
        L37:
            r3.addListener(r1)
        L3a:
            r3.addListener(r4)
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            com.bumptech.glide.GlideContext r4 = r2.getGlideContext()
            java.util.List r4 = r4.getDefaultRequestListeners()
            r3.<init>(r4)
            r1.defaultRequestListeners = r3
            com.bumptech.glide.GlideContext r2 = r2.getGlideContext()
            com.bumptech.glide.request.RequestOptions r2 = r2.getDefaultRequestOptions()
            r1.setRequestOptions(r2)
            return
    }

    private synchronized void clearRequests() {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.manager.TargetTracker r0 = r2.targetTracker     // Catch: java.lang.Throwable -> L1b
            java.util.List r0 = r0.getAll()     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1b
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1b
            com.bumptech.glide.request.target.Target r1 = (com.bumptech.glide.request.target.Target) r1     // Catch: java.lang.Throwable -> L1b
            r2.clear(r1)     // Catch: java.lang.Throwable -> L1b
            goto Lb
        L1b:
            r0 = move-exception
            goto L24
        L1d:
            com.bumptech.glide.manager.TargetTracker r0 = r2.targetTracker     // Catch: java.lang.Throwable -> L1b
            r0.clear()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)
            return
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0
    }

    private void untrackOrDelegate(@Yue.InterfaceC4410 com.bumptech.glide.request.target.Target<?> r3) {
            r2 = this;
            boolean r0 = r2.untrack(r3)
            com.bumptech.glide.request.Request r1 = r3.getRequest()
            if (r0 != 0) goto L1b
            com.bumptech.glide.Glide r0 = r2.glide
            boolean r0 = r0.removeFromManagers(r3)
            if (r0 != 0) goto L1b
            if (r1 == 0) goto L1b
            r0 = 0
            r3.setRequest(r0)
            r1.clear()
        L1b:
            return
    }

    private synchronized void updateRequestOptions(@Yue.InterfaceC4410 com.bumptech.glide.request.RequestOptions r2) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.request.RequestOptions r0 = r1.requestOptions     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.request.BaseRequestOptions r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.request.RequestOptions r2 = (com.bumptech.glide.request.RequestOptions) r2     // Catch: java.lang.Throwable -> Ld
            r1.requestOptions = r2     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public com.bumptech.glide.RequestManager addDefaultRequestListener(com.bumptech.glide.request.RequestListener<java.lang.Object> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bumptech.glide.request.RequestListener<java.lang.Object>> r0 = r1.defaultRequestListeners
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4410
    public synchronized com.bumptech.glide.RequestManager applyDefaultRequestOptions(@Yue.InterfaceC4410 com.bumptech.glide.request.RequestOptions r1) {
            r0 = this;
            monitor-enter(r0)
            r0.updateRequestOptions(r1)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return r0
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public <ResourceType> com.bumptech.glide.RequestBuilder<ResourceType> as(@Yue.InterfaceC4410 java.lang.Class<ResourceType> r4) {
            r3 = this;
            com.bumptech.glide.RequestBuilder r0 = new com.bumptech.glide.RequestBuilder
            com.bumptech.glide.Glide r1 = r3.glide
            android.content.Context r2 = r3.context
            r0.<init>(r1, r3, r4, r2)
            return r0
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<android.graphics.Bitmap> asBitmap() {
            r2 = this;
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            com.bumptech.glide.RequestBuilder r0 = r2.as(r0)
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.RequestManager.DECODE_TYPE_BITMAP
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r1)
            return r0
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> asDrawable() {
            r1 = this;
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.RequestBuilder r0 = r1.as(r0)
            return r0
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<java.io.File> asFile() {
            r2 = this;
            java.lang.Class<java.io.File> r0 = java.io.File.class
            com.bumptech.glide.RequestBuilder r0 = r2.as(r0)
            r1 = 1
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.request.RequestOptions.skipMemoryCacheOf(r1)
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r1)
            return r0
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<com.bumptech.glide.load.resource.gif.GifDrawable> asGif() {
            r2 = this;
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r0 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            com.bumptech.glide.RequestBuilder r0 = r2.as(r0)
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.RequestManager.DECODE_TYPE_GIF
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r1)
            return r0
    }

    public void clear(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            com.bumptech.glide.RequestManager$ClearTarget r0 = new com.bumptech.glide.RequestManager$ClearTarget
            r0.<init>(r2)
            r1.clear(r0)
            return
    }

    public void clear(@Yue.InterfaceC4544 com.bumptech.glide.request.target.Target<?> r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r0.untrackOrDelegate(r1)
            return
    }

    @Yue.InterfaceC4410
    public synchronized com.bumptech.glide.RequestManager clearOnStop() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.clearOnStop = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return r1
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<java.io.File> download(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.downloadOnly()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<java.io.File> downloadOnly() {
            r2 = this;
            java.lang.Class<java.io.File> r0 = java.io.File.class
            com.bumptech.glide.RequestBuilder r0 = r2.as(r0)
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.RequestManager.DOWNLOAD_ONLY_OPTIONS
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r1)
            return r0
    }

    public java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> getDefaultRequestListeners() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bumptech.glide.request.RequestListener<java.lang.Object>> r0 = r1.defaultRequestListeners
            return r0
    }

    public synchronized com.bumptech.glide.request.RequestOptions getDefaultRequestOptions() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.request.RequestOptions r0 = r1.requestOptions     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Yue.InterfaceC4410
    public <T> com.bumptech.glide.TransitionOptions<?, T> getDefaultTransitionOptions(java.lang.Class<T> r2) {
            r1 = this;
            com.bumptech.glide.Glide r0 = r1.glide
            com.bumptech.glide.GlideContext r0 = r0.getGlideContext()
            com.bumptech.glide.TransitionOptions r2 = r0.getDefaultTransitionOptions(r2)
            return r2
    }

    public synchronized boolean isPaused() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.RequestTracker r0 = r1.requestTracker     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.isPaused()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 android.graphics.Bitmap r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 android.net.Uri r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 java.io.File r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC5198 @Yue.InterfaceC2004 @Yue.InterfaceC4544 java.lang.Integer r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 java.lang.String r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @java.lang.Deprecated
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 java.net.URL r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 byte[] r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.asDrawable()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            return r2
    }

    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 android.graphics.Bitmap r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 android.net.Uri r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 java.io.File r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC5198 @Yue.InterfaceC2004 @Yue.InterfaceC4544 java.lang.Integer r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 java.lang.String r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 java.net.URL r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> load(@Yue.InterfaceC4544 byte[] r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onDestroy() {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.manager.TargetTracker r0 = r2.targetTracker     // Catch: java.lang.Throwable -> L26
            r0.onDestroy()     // Catch: java.lang.Throwable -> L26
            r2.clearRequests()     // Catch: java.lang.Throwable -> L26
            com.bumptech.glide.manager.RequestTracker r0 = r2.requestTracker     // Catch: java.lang.Throwable -> L26
            r0.clearRequests()     // Catch: java.lang.Throwable -> L26
            com.bumptech.glide.manager.Lifecycle r0 = r2.lifecycle     // Catch: java.lang.Throwable -> L26
            r0.removeListener(r2)     // Catch: java.lang.Throwable -> L26
            com.bumptech.glide.manager.Lifecycle r0 = r2.lifecycle     // Catch: java.lang.Throwable -> L26
            com.bumptech.glide.manager.ConnectivityMonitor r1 = r2.connectivityMonitor     // Catch: java.lang.Throwable -> L26
            r0.removeListener(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.Runnable r0 = r2.addSelfToLifecycle     // Catch: java.lang.Throwable -> L26
            com.bumptech.glide.util.Util.removeCallbacksOnUiThread(r0)     // Catch: java.lang.Throwable -> L26
            com.bumptech.glide.Glide r0 = r2.glide     // Catch: java.lang.Throwable -> L26
            r0.unregisterRequestManager(r2)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r2)
            return
        L26:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r0
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStart() {
            r1 = this;
            monitor-enter(r1)
            r1.resumeRequests()     // Catch: java.lang.Throwable -> Lb
            com.bumptech.glide.manager.TargetTracker r0 = r1.targetTracker     // Catch: java.lang.Throwable -> Lb
            r0.onStart()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStop() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.TargetTracker r0 = r1.targetTracker     // Catch: java.lang.Throwable -> Le
            r0.onStop()     // Catch: java.lang.Throwable -> Le
            boolean r0 = r1.clearOnStop     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            r1.clearRequests()     // Catch: java.lang.Throwable -> Le
            goto L13
        Le:
            r0 = move-exception
            goto L15
        L10:
            r1.pauseRequests()     // Catch: java.lang.Throwable -> Le
        L13:
            monitor-exit(r1)
            return
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int r2) {
            r1 = this;
            r0 = 60
            if (r2 != r0) goto Lb
            boolean r2 = r1.pauseAllRequestsOnTrimMemoryModerate
            if (r2 == 0) goto Lb
            r1.pauseAllRequestsRecursive()
        Lb:
            return
    }

    public synchronized void pauseAllRequests() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.RequestTracker r0 = r1.requestTracker     // Catch: java.lang.Throwable -> L8
            r0.pauseAllRequests()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public synchronized void pauseAllRequestsRecursive() {
            r2 = this;
            monitor-enter(r2)
            r2.pauseAllRequests()     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.manager.RequestManagerTreeNode r0 = r2.treeNode     // Catch: java.lang.Throwable -> L1e
            java.util.Set r0 = r0.getDescendants()     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1e
        Le:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.RequestManager r1 = (com.bumptech.glide.RequestManager) r1     // Catch: java.lang.Throwable -> L1e
            r1.pauseAllRequests()     // Catch: java.lang.Throwable -> L1e
            goto Le
        L1e:
            r0 = move-exception
            goto L22
        L20:
            monitor-exit(r2)
            return
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    public synchronized void pauseRequests() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.RequestTracker r0 = r1.requestTracker     // Catch: java.lang.Throwable -> L8
            r0.pauseRequests()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public synchronized void pauseRequestsRecursive() {
            r2 = this;
            monitor-enter(r2)
            r2.pauseRequests()     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.manager.RequestManagerTreeNode r0 = r2.treeNode     // Catch: java.lang.Throwable -> L1e
            java.util.Set r0 = r0.getDescendants()     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1e
        Le:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.RequestManager r1 = (com.bumptech.glide.RequestManager) r1     // Catch: java.lang.Throwable -> L1e
            r1.pauseRequests()     // Catch: java.lang.Throwable -> L1e
            goto Le
        L1e:
            r0 = move-exception
            goto L22
        L20:
            monitor-exit(r2)
            return
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    public synchronized void resumeRequests() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.RequestTracker r0 = r1.requestTracker     // Catch: java.lang.Throwable -> L8
            r0.resumeRequests()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public synchronized void resumeRequestsRecursive() {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.util.Util.assertMainThread()     // Catch: java.lang.Throwable -> L21
            r2.resumeRequests()     // Catch: java.lang.Throwable -> L21
            com.bumptech.glide.manager.RequestManagerTreeNode r0 = r2.treeNode     // Catch: java.lang.Throwable -> L21
            java.util.Set r0 = r0.getDescendants()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L21
        L11:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L21
            com.bumptech.glide.RequestManager r1 = (com.bumptech.glide.RequestManager) r1     // Catch: java.lang.Throwable -> L21
            r1.resumeRequests()     // Catch: java.lang.Throwable -> L21
            goto L11
        L21:
            r0 = move-exception
            goto L25
        L23:
            monitor-exit(r2)
            return
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r0
    }

    @Yue.InterfaceC4410
    public synchronized com.bumptech.glide.RequestManager setDefaultRequestOptions(@Yue.InterfaceC4410 com.bumptech.glide.request.RequestOptions r1) {
            r0 = this;
            monitor-enter(r0)
            r0.setRequestOptions(r1)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return r0
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean r1) {
            r0 = this;
            r0.pauseAllRequestsOnTrimMemoryModerate = r1
            return
    }

    public synchronized void setRequestOptions(@Yue.InterfaceC4410 com.bumptech.glide.request.RequestOptions r1) {
            r0 = this;
            monitor-enter(r0)
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.clone()     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.autoClone()     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1     // Catch: java.lang.Throwable -> L11
            r0.requestOptions = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public synchronized java.lang.String toString() {
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = super.toString()     // Catch: java.lang.Throwable -> L2c
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "{tracker="
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.manager.RequestTracker r1 = r2.requestTracker     // Catch: java.lang.Throwable -> L2c
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = ", treeNode="
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.manager.RequestManagerTreeNode r1 = r2.treeNode     // Catch: java.lang.Throwable -> L2c
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "}"
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            return r0
        L2c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }

    public synchronized void track(@Yue.InterfaceC4410 com.bumptech.glide.request.target.Target<?> r2, @Yue.InterfaceC4410 com.bumptech.glide.request.Request r3) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.TargetTracker r0 = r1.targetTracker     // Catch: java.lang.Throwable -> Ld
            r0.track(r2)     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.manager.RequestTracker r2 = r1.requestTracker     // Catch: java.lang.Throwable -> Ld
            r2.runRequest(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public synchronized boolean untrack(@Yue.InterfaceC4410 com.bumptech.glide.request.target.Target<?> r4) {
            r3 = this;
            monitor-enter(r3)
            com.bumptech.glide.request.Request r0 = r4.getRequest()     // Catch: java.lang.Throwable -> L1d
            r1 = 1
            if (r0 != 0) goto La
            monitor-exit(r3)
            return r1
        La:
            com.bumptech.glide.manager.RequestTracker r2 = r3.requestTracker     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r2.clearAndRemove(r0)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            com.bumptech.glide.manager.TargetTracker r0 = r3.targetTracker     // Catch: java.lang.Throwable -> L1d
            r0.untrack(r4)     // Catch: java.lang.Throwable -> L1d
            r0 = 0
            r4.setRequest(r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r1
        L1d:
            r4 = move-exception
            goto L22
        L1f:
            monitor-exit(r3)
            r4 = 0
            return r4
        L22:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }
}
