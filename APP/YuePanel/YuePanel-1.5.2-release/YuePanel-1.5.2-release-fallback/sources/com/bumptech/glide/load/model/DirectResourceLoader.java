package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public final class DirectResourceLoader<DataT> implements com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, DataT> {
    private final android.content.Context context;
    private final com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener<DataT> resourceOpener;

    public static final class AssetFileDescriptorFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, android.content.res.AssetFileDescriptor>, com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener<android.content.res.AssetFileDescriptor> {
        private final android.content.Context context;

        public AssetFileDescriptorFactory(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @Yue.InterfaceC4410
        public com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, android.content.res.AssetFileDescriptor> build(@Yue.InterfaceC4410 com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
                r1 = this;
                com.bumptech.glide.load.model.DirectResourceLoader r2 = new com.bumptech.glide.load.model.DirectResourceLoader
                android.content.Context r0 = r1.context
                r2.<init>(r0, r1)
                return r2
        }

        /* JADX INFO: renamed from: close, reason: avoid collision after fix types in other method */
        public void close2(android.content.res.AssetFileDescriptor r1) throws java.io.IOException {
                r0 = this;
                r1.close()
                return
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public /* bridge */ /* synthetic */ void close(android.content.res.AssetFileDescriptor r1) throws java.io.IOException {
                r0 = this;
                android.content.res.AssetFileDescriptor r1 = (android.content.res.AssetFileDescriptor) r1
                r0.close2(r1)
                return
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public java.lang.Class<android.content.res.AssetFileDescriptor> getDataClass() {
                r1 = this;
                java.lang.Class<android.content.res.AssetFileDescriptor> r0 = android.content.res.AssetFileDescriptor.class
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public android.content.res.AssetFileDescriptor open(@Yue.InterfaceC4544 android.content.res.Resources.Theme r1, android.content.res.Resources r2, int r3) {
                r0 = this;
                android.content.res.AssetFileDescriptor r1 = r2.openRawResourceFd(r3)
                return r1
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public /* bridge */ /* synthetic */ android.content.res.AssetFileDescriptor open(@Yue.InterfaceC4544 android.content.res.Resources.Theme r1, android.content.res.Resources r2, int r3) {
                r0 = this;
                android.content.res.AssetFileDescriptor r1 = r0.open(r1, r2, r3)
                return r1
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public static final class DrawableFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, android.graphics.drawable.Drawable>, com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener<android.graphics.drawable.Drawable> {
        private final android.content.Context context;

        public DrawableFactory(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @Yue.InterfaceC4410
        public com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, android.graphics.drawable.Drawable> build(@Yue.InterfaceC4410 com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
                r1 = this;
                com.bumptech.glide.load.model.DirectResourceLoader r2 = new com.bumptech.glide.load.model.DirectResourceLoader
                android.content.Context r0 = r1.context
                r2.<init>(r0, r1)
                return r2
        }

        /* JADX INFO: renamed from: close, reason: avoid collision after fix types in other method */
        public void close2(android.graphics.drawable.Drawable r1) throws java.io.IOException {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public /* bridge */ /* synthetic */ void close(android.graphics.drawable.Drawable r1) throws java.io.IOException {
                r0 = this;
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                r0.close2(r1)
                return
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public java.lang.Class<android.graphics.drawable.Drawable> getDataClass() {
                r1 = this;
                java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public android.graphics.drawable.Drawable open(@Yue.InterfaceC4544 android.content.res.Resources.Theme r1, android.content.res.Resources r2, int r3) {
                r0 = this;
                android.content.Context r2 = r0.context
                android.graphics.drawable.Drawable r1 = com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat.getDrawable(r2, r3, r1)
                return r1
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable open(@Yue.InterfaceC4544 android.content.res.Resources.Theme r1, android.content.res.Resources r2, int r3) {
                r0 = this;
                android.graphics.drawable.Drawable r1 = r0.open(r1, r2, r3)
                return r1
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public static final class InputStreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, java.io.InputStream>, com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener<java.io.InputStream> {
        private final android.content.Context context;

        public InputStreamFactory(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @Yue.InterfaceC4410
        public com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, java.io.InputStream> build(@Yue.InterfaceC4410 com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
                r1 = this;
                com.bumptech.glide.load.model.DirectResourceLoader r2 = new com.bumptech.glide.load.model.DirectResourceLoader
                android.content.Context r0 = r1.context
                r2.<init>(r0, r1)
                return r2
        }

        /* JADX INFO: renamed from: close, reason: avoid collision after fix types in other method */
        public void close2(java.io.InputStream r1) throws java.io.IOException {
                r0 = this;
                r1.close()
                return
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public /* bridge */ /* synthetic */ void close(java.io.InputStream r1) throws java.io.IOException {
                r0 = this;
                java.io.InputStream r1 = (java.io.InputStream) r1
                r0.close2(r1)
                return
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public java.lang.Class<java.io.InputStream> getDataClass() {
                r1 = this;
                java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public java.io.InputStream open(@Yue.InterfaceC4544 android.content.res.Resources.Theme r1, android.content.res.Resources r2, int r3) {
                r0 = this;
                java.io.InputStream r1 = r2.openRawResource(r3)
                return r1
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public /* bridge */ /* synthetic */ java.io.InputStream open(@Yue.InterfaceC4544 android.content.res.Resources.Theme r1, android.content.res.Resources r2, int r3) {
                r0 = this;
                java.io.InputStream r1 = r0.open(r1, r2, r3)
                return r1
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public static final class ResourceDataFetcher<DataT> implements com.bumptech.glide.load.data.DataFetcher<DataT> {

        @Yue.InterfaceC4544
        private DataT data;
        private final int resourceId;
        private final com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener<DataT> resourceOpener;
        private final android.content.res.Resources resources;

        @Yue.InterfaceC4544
        private final android.content.res.Resources.Theme theme;

        public ResourceDataFetcher(@Yue.InterfaceC4544 android.content.res.Resources.Theme r1, android.content.res.Resources r2, com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener<DataT> r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.theme = r1
                r0.resources = r2
                r0.resourceOpener = r3
                r0.resourceId = r4
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
                r2 = this;
                DataT r0 = r2.data
                if (r0 == 0) goto L9
                com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener<DataT> r1 = r2.resourceOpener     // Catch: java.io.IOException -> L9
                r1.close(r0)     // Catch: java.io.IOException -> L9
            L9:
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @Yue.InterfaceC4410
        public java.lang.Class<DataT> getDataClass() {
                r1 = this;
                com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener<DataT> r0 = r1.resourceOpener
                java.lang.Class r0 = r0.getDataClass()
                return r0
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @Yue.InterfaceC4410
        public com.bumptech.glide.load.DataSource getDataSource() {
                r1 = this;
                com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.LOCAL
                return r0
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(@Yue.InterfaceC4410 com.bumptech.glide.Priority r4, @Yue.InterfaceC4410 com.bumptech.glide.load.data.DataFetcher.DataCallback<? super DataT> r5) {
                r3 = this;
                com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener<DataT> r4 = r3.resourceOpener     // Catch: android.content.res.Resources.NotFoundException -> L12
                android.content.res.Resources$Theme r0 = r3.theme     // Catch: android.content.res.Resources.NotFoundException -> L12
                android.content.res.Resources r1 = r3.resources     // Catch: android.content.res.Resources.NotFoundException -> L12
                int r2 = r3.resourceId     // Catch: android.content.res.Resources.NotFoundException -> L12
                java.lang.Object r4 = r4.open(r0, r1, r2)     // Catch: android.content.res.Resources.NotFoundException -> L12
                r3.data = r4     // Catch: android.content.res.Resources.NotFoundException -> L12
                r5.onDataReady(r4)     // Catch: android.content.res.Resources.NotFoundException -> L12
                goto L16
            L12:
                r4 = move-exception
                r5.onLoadFailed(r4)
            L16:
                return
        }
    }

    public interface ResourceOpener<DataT> {
        void close(DataT r1) throws java.io.IOException;

        java.lang.Class<DataT> getDataClass();

        DataT open(@Yue.InterfaceC4544 android.content.res.Resources.Theme r1, android.content.res.Resources r2, int r3);
    }

    public DirectResourceLoader(android.content.Context r1, com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener<DataT> r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            r0.resourceOpener = r2
            return
    }

    public static com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, android.content.res.AssetFileDescriptor> assetFileDescriptorFactory(android.content.Context r1) {
            com.bumptech.glide.load.model.DirectResourceLoader$AssetFileDescriptorFactory r0 = new com.bumptech.glide.load.model.DirectResourceLoader$AssetFileDescriptorFactory
            r0.<init>(r1)
            return r0
    }

    public static com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, android.graphics.drawable.Drawable> drawableFactory(android.content.Context r1) {
            com.bumptech.glide.load.model.DirectResourceLoader$DrawableFactory r0 = new com.bumptech.glide.load.model.DirectResourceLoader$DrawableFactory
            r0.<init>(r1)
            return r0
    }

    public static com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, java.io.InputStream> inputStreamFactory(android.content.Context r1) {
            com.bumptech.glide.load.model.DirectResourceLoader$InputStreamFactory r0 = new com.bumptech.glide.load.model.DirectResourceLoader$InputStreamFactory
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<DataT> buildLoadData2(@Yue.InterfaceC4410 java.lang.Integer r4, int r5, int r6, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r7) {
            r3 = this;
            com.bumptech.glide.load.Option<android.content.res.Resources$Theme> r5 = com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder.THEME
            java.lang.Object r5 = r7.get(r5)
            android.content.res.Resources$Theme r5 = (android.content.res.Resources.Theme) r5
            if (r5 == 0) goto Lf
            android.content.res.Resources r6 = r5.getResources()
            goto L15
        Lf:
            android.content.Context r6 = r3.context
            android.content.res.Resources r6 = r6.getResources()
        L15:
            com.bumptech.glide.load.model.ModelLoader$LoadData r7 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.signature.ObjectKey r0 = new com.bumptech.glide.signature.ObjectKey
            r0.<init>(r4)
            com.bumptech.glide.load.model.DirectResourceLoader$ResourceDataFetcher r1 = new com.bumptech.glide.load.model.DirectResourceLoader$ResourceDataFetcher
            com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener<DataT> r2 = r3.resourceOpener
            int r4 = r4.intValue()
            r1.<init>(r5, r6, r2, r4)
            r7.<init>(r0, r1)
            return r7
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(@Yue.InterfaceC4410 java.lang.Integer r1, int r2, int r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r4) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r0.buildLoadData2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@Yue.InterfaceC4410 java.lang.Integer r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ boolean handles(@Yue.InterfaceC4410 java.lang.Integer r1) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            boolean r1 = r0.handles2(r1)
            return r1
    }
}
