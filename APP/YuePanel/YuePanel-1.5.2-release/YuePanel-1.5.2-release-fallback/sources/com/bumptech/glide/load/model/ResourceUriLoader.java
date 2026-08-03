package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceUriLoader<DataT> implements com.bumptech.glide.load.model.ModelLoader<android.net.Uri, DataT> {
    private static final int INVALID_RESOURCE_ID = 0;
    private static final java.lang.String TAG = "ResourceUriLoader";
    private final android.content.Context context;
    private final com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, DataT> delegate;

    public static final class AssetFileDescriptorFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, android.content.res.AssetFileDescriptor> {
        private final android.content.Context context;

        public AssetFileDescriptorFactory(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @Yue.InterfaceC4410
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, android.content.res.AssetFileDescriptor> build(@Yue.InterfaceC4410 com.bumptech.glide.load.model.MultiModelLoaderFactory r5) {
                r4 = this;
                com.bumptech.glide.load.model.ResourceUriLoader r0 = new com.bumptech.glide.load.model.ResourceUriLoader
                android.content.Context r1 = r4.context
                java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
                java.lang.Class<android.content.res.AssetFileDescriptor> r3 = android.content.res.AssetFileDescriptor.class
                com.bumptech.glide.load.model.ModelLoader r5 = r5.build(r2, r3)
                r0.<init>(r1, r5)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public static final class InputStreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, java.io.InputStream> {
        private final android.content.Context context;

        public InputStreamFactory(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @Yue.InterfaceC4410
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, java.io.InputStream> build(@Yue.InterfaceC4410 com.bumptech.glide.load.model.MultiModelLoaderFactory r5) {
                r4 = this;
                com.bumptech.glide.load.model.ResourceUriLoader r0 = new com.bumptech.glide.load.model.ResourceUriLoader
                android.content.Context r1 = r4.context
                java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
                java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
                com.bumptech.glide.load.model.ModelLoader r5 = r5.build(r2, r3)
                r0.<init>(r1, r5)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public ResourceUriLoader(android.content.Context r1, com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, DataT> r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            r0.delegate = r2
            return
    }

    public static com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, android.content.res.AssetFileDescriptor> newAssetFileDescriptorFactory(android.content.Context r1) {
            com.bumptech.glide.load.model.ResourceUriLoader$AssetFileDescriptorFactory r0 = new com.bumptech.glide.load.model.ResourceUriLoader$AssetFileDescriptorFactory
            r0.<init>(r1)
            return r0
    }

    public static com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, java.io.InputStream> newStreamFactory(android.content.Context r1) {
            com.bumptech.glide.load.model.ResourceUriLoader$InputStreamFactory r0 = new com.bumptech.glide.load.model.ResourceUriLoader$InputStreamFactory
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4544
    private com.bumptech.glide.load.model.ModelLoader.LoadData<DataT> parseResourceIdUri(@Yue.InterfaceC4410 android.net.Uri r6, int r7, int r8, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r9) {
            r5 = this;
            java.lang.String r0 = "ResourceUriLoader"
            r1 = 0
            r2 = 5
            java.util.List r3 = r6.getPathSegments()     // Catch: java.lang.NumberFormatException -> L30
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.NumberFormatException -> L30
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L30
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L30
            if (r3 != 0) goto L33
            boolean r7 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.NumberFormatException -> L30
            if (r7 == 0) goto L32
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L30
            r7.<init>()     // Catch: java.lang.NumberFormatException -> L30
            java.lang.String r8 = "Failed to parse a valid non-0 resource id from: "
            r7.append(r8)     // Catch: java.lang.NumberFormatException -> L30
            r7.append(r6)     // Catch: java.lang.NumberFormatException -> L30
            java.lang.String r7 = r7.toString()     // Catch: java.lang.NumberFormatException -> L30
            android.util.Log.w(r0, r7)     // Catch: java.lang.NumberFormatException -> L30
            goto L32
        L30:
            r7 = move-exception
            goto L3e
        L32:
            return r1
        L33:
            com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, DataT> r4 = r5.delegate     // Catch: java.lang.NumberFormatException -> L30
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L30
            com.bumptech.glide.load.model.ModelLoader$LoadData r6 = r4.buildLoadData(r3, r7, r8, r9)     // Catch: java.lang.NumberFormatException -> L30
            return r6
        L3e:
            boolean r8 = android.util.Log.isLoggable(r0, r2)
            if (r8 == 0) goto L58
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Failed to parse resource id from: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.util.Log.w(r0, r6, r7)
        L58:
            return r1
    }

    @Yue.InterfaceC4544
    private com.bumptech.glide.load.model.ModelLoader.LoadData<DataT> parseResourceNameUri(@Yue.InterfaceC4410 android.net.Uri r5, int r6, int r7, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r8) {
            r4 = this;
            java.util.List r0 = r5.getPathSegments()
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            android.content.Context r2 = r4.context
            android.content.res.Resources r2 = r2.getResources()
            android.content.Context r3 = r4.context
            java.lang.String r3 = r3.getPackageName()
            int r0 = r2.getIdentifier(r0, r1, r3)
            if (r0 != 0) goto L43
            r6 = 5
            java.lang.String r7 = "ResourceUriLoader"
            boolean r6 = android.util.Log.isLoggable(r7, r6)
            if (r6 == 0) goto L41
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Failed to find resource id for: "
            r6.append(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.w(r7, r5)
        L41:
            r5 = 0
            return r5
        L43:
            com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, DataT> r5 = r4.delegate
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.bumptech.glide.load.model.ModelLoader$LoadData r5 = r5.buildLoadData(r0, r6, r7, r8)
            return r5
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<DataT> buildLoadData2(@Yue.InterfaceC4410 android.net.Uri r4, int r5, int r6, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r7) {
            r3 = this;
            java.util.List r0 = r4.getPathSegments()
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto L10
            com.bumptech.glide.load.model.ModelLoader$LoadData r4 = r3.parseResourceIdUri(r4, r5, r6, r7)
            return r4
        L10:
            int r0 = r0.size()
            r1 = 2
            if (r0 != r1) goto L1c
            com.bumptech.glide.load.model.ModelLoader$LoadData r4 = r3.parseResourceNameUri(r4, r5, r6, r7)
            return r4
        L1c:
            r5 = 5
            java.lang.String r6 = "ResourceUriLoader"
            boolean r5 = android.util.Log.isLoggable(r6, r5)
            if (r5 == 0) goto L39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Failed to parse resource uri: "
            r5.append(r7)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.w(r6, r4)
        L39:
            r4 = 0
            return r4
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    @Yue.InterfaceC4544
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(@Yue.InterfaceC4410 android.net.Uri r1, int r2, int r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r4) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r0.buildLoadData2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@Yue.InterfaceC4410 android.net.Uri r3) {
            r2 = this;
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "android.resource"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
            android.content.Context r0 = r2.context
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r3 = r3.getAuthority()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L1e
            r3 = 1
            goto L1f
        L1e:
            r3 = 0
        L1f:
            return r3
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ boolean handles(@Yue.InterfaceC4410 android.net.Uri r1) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r1 = r0.handles2(r1)
            return r1
    }
}
