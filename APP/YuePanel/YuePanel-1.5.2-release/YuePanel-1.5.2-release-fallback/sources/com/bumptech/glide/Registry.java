package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public class Registry {
    public static final java.lang.String BUCKET_ANIMATION = "Animation";
    private static final java.lang.String BUCKET_APPEND_ALL = "legacy_append";
    public static final java.lang.String BUCKET_BITMAP = "Bitmap";
    public static final java.lang.String BUCKET_BITMAP_DRAWABLE = "BitmapDrawable";

    @java.lang.Deprecated
    public static final java.lang.String BUCKET_GIF = "Animation";
    private static final java.lang.String BUCKET_PREPEND_ALL = "legacy_prepend_all";
    private final com.bumptech.glide.load.data.DataRewinderRegistry dataRewinderRegistry;
    private final com.bumptech.glide.provider.ResourceDecoderRegistry decoderRegistry;
    private final com.bumptech.glide.provider.EncoderRegistry encoderRegistry;
    private final com.bumptech.glide.provider.ImageHeaderParserRegistry imageHeaderParserRegistry;
    private final com.bumptech.glide.provider.LoadPathCache loadPathCache;
    private final com.bumptech.glide.load.model.ModelLoaderRegistry modelLoaderRegistry;
    private final com.bumptech.glide.provider.ModelToResourceClassCache modelToResourceClassCache;
    private final com.bumptech.glide.provider.ResourceEncoderRegistry resourceEncoderRegistry;
    private final Yue.C4820.InterfaceC4821<java.util.List<java.lang.Throwable>> throwableListPool;
    private final com.bumptech.glide.load.resource.transcode.TranscoderRegistry transcoderRegistry;

    public static class MissingComponentException extends java.lang.RuntimeException {
        public MissingComponentException(@Yue.InterfaceC4410 java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public static final class NoImageHeaderParserException extends com.bumptech.glide.Registry.MissingComponentException {
        public NoImageHeaderParserException() {
                r1 = this;
                java.lang.String r0 = "Failed to find image header parser."
                r1.<init>(r0)
                return
        }
    }

    public static class NoModelLoaderAvailableException extends com.bumptech.glide.Registry.MissingComponentException {
        public NoModelLoaderAvailableException(@Yue.InterfaceC4410 java.lang.Class<?> r3, @Yue.InterfaceC4410 java.lang.Class<?> r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find any ModelLoaders for model: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " and data: "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }

        public NoModelLoaderAvailableException(@Yue.InterfaceC4410 java.lang.Object r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find any ModelLoaders registered for model class: "
                r0.append(r1)
                java.lang.Class r3 = r3.getClass()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }

        public <M> NoModelLoaderAvailableException(@Yue.InterfaceC4410 M r3, @Yue.InterfaceC4410 java.util.List<com.bumptech.glide.load.model.ModelLoader<M, ?>> r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Found ModelLoaders for model class: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", but none that handle this specific model instance: "
                r0.append(r4)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    public static class NoResultEncoderAvailableException extends com.bumptech.glide.Registry.MissingComponentException {
        public NoResultEncoderAvailableException(@Yue.InterfaceC4410 java.lang.Class<?> r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find result encoder for resource class: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    public static class NoSourceEncoderAvailableException extends com.bumptech.glide.Registry.MissingComponentException {
        public NoSourceEncoderAvailableException(@Yue.InterfaceC4410 java.lang.Class<?> r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find source encoder for data class: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    public Registry() {
            r3 = this;
            r3.<init>()
            com.bumptech.glide.provider.ModelToResourceClassCache r0 = new com.bumptech.glide.provider.ModelToResourceClassCache
            r0.<init>()
            r3.modelToResourceClassCache = r0
            com.bumptech.glide.provider.LoadPathCache r0 = new com.bumptech.glide.provider.LoadPathCache
            r0.<init>()
            r3.loadPathCache = r0
            Yue.ۥۡۤۤ۠$ۥ r0 = com.bumptech.glide.util.pool.FactoryPools.threadSafeList()
            r3.throwableListPool = r0
            com.bumptech.glide.load.model.ModelLoaderRegistry r1 = new com.bumptech.glide.load.model.ModelLoaderRegistry
            r1.<init>(r0)
            r3.modelLoaderRegistry = r1
            com.bumptech.glide.provider.EncoderRegistry r0 = new com.bumptech.glide.provider.EncoderRegistry
            r0.<init>()
            r3.encoderRegistry = r0
            com.bumptech.glide.provider.ResourceDecoderRegistry r0 = new com.bumptech.glide.provider.ResourceDecoderRegistry
            r0.<init>()
            r3.decoderRegistry = r0
            com.bumptech.glide.provider.ResourceEncoderRegistry r0 = new com.bumptech.glide.provider.ResourceEncoderRegistry
            r0.<init>()
            r3.resourceEncoderRegistry = r0
            com.bumptech.glide.load.data.DataRewinderRegistry r0 = new com.bumptech.glide.load.data.DataRewinderRegistry
            r0.<init>()
            r3.dataRewinderRegistry = r0
            com.bumptech.glide.load.resource.transcode.TranscoderRegistry r0 = new com.bumptech.glide.load.resource.transcode.TranscoderRegistry
            r0.<init>()
            r3.transcoderRegistry = r0
            com.bumptech.glide.provider.ImageHeaderParserRegistry r0 = new com.bumptech.glide.provider.ImageHeaderParserRegistry
            r0.<init>()
            r3.imageHeaderParserRegistry = r0
            java.lang.String r0 = "Bitmap"
            java.lang.String r1 = "BitmapDrawable"
            java.lang.String r2 = "Animation"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r3.setResourceDecoderBucketPriorityList(r0)
            return
    }

    @Yue.InterfaceC4410
    private <Data, TResource, Transcode> java.util.List<com.bumptech.glide.load.engine.DecodePath<Data, TResource, Transcode>> getDecodePaths(@Yue.InterfaceC4410 java.lang.Class<Data> r12, @Yue.InterfaceC4410 java.lang.Class<TResource> r13, @Yue.InterfaceC4410 java.lang.Class<Transcode> r14) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bumptech.glide.provider.ResourceDecoderRegistry r1 = r11.decoderRegistry
            java.util.List r13 = r1.getResourceClasses(r12, r13)
            java.util.Iterator r13 = r13.iterator()
        Lf:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r13.next()
            java.lang.Class r1 = (java.lang.Class) r1
            com.bumptech.glide.load.resource.transcode.TranscoderRegistry r2 = r11.transcoderRegistry
            java.util.List r2 = r2.getTranscodeClasses(r1, r14)
            java.util.Iterator r9 = r2.iterator()
        L25:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r9.next()
            r5 = r2
            java.lang.Class r5 = (java.lang.Class) r5
            com.bumptech.glide.provider.ResourceDecoderRegistry r2 = r11.decoderRegistry
            java.util.List r6 = r2.getDecoders(r12, r1)
            com.bumptech.glide.load.resource.transcode.TranscoderRegistry r2 = r11.transcoderRegistry
            com.bumptech.glide.load.resource.transcode.ResourceTranscoder r7 = r2.get(r1, r5)
            com.bumptech.glide.load.engine.DecodePath r10 = new com.bumptech.glide.load.engine.DecodePath
            Yue.ۥۡۤۤ۠$ۥ<java.util.List<java.lang.Throwable>> r8 = r11.throwableListPool
            r2 = r10
            r3 = r12
            r4 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.add(r10)
            goto L25
        L4c:
            return r0
    }

    @Yue.InterfaceC4410
    public <Data> com.bumptech.glide.Registry append(@Yue.InterfaceC4410 java.lang.Class<Data> r2, @Yue.InterfaceC4410 com.bumptech.glide.load.Encoder<Data> r3) {
            r1 = this;
            com.bumptech.glide.provider.EncoderRegistry r0 = r1.encoderRegistry
            r0.append(r2, r3)
            return r1
    }

    @Yue.InterfaceC4410
    public <TResource> com.bumptech.glide.Registry append(@Yue.InterfaceC4410 java.lang.Class<TResource> r2, @Yue.InterfaceC4410 com.bumptech.glide.load.ResourceEncoder<TResource> r3) {
            r1 = this;
            com.bumptech.glide.provider.ResourceEncoderRegistry r0 = r1.resourceEncoderRegistry
            r0.append(r2, r3)
            return r1
    }

    @Yue.InterfaceC4410
    public <Data, TResource> com.bumptech.glide.Registry append(@Yue.InterfaceC4410 java.lang.Class<Data> r2, @Yue.InterfaceC4410 java.lang.Class<TResource> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.ResourceDecoder<Data, TResource> r4) {
            r1 = this;
            java.lang.String r0 = "legacy_append"
            r1.append(r0, r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC4410
    public <Model, Data> com.bumptech.glide.Registry append(@Yue.InterfaceC4410 java.lang.Class<Model> r2, @Yue.InterfaceC4410 java.lang.Class<Data> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.model.ModelLoaderFactory<Model, Data> r4) {
            r1 = this;
            com.bumptech.glide.load.model.ModelLoaderRegistry r0 = r1.modelLoaderRegistry
            r0.append(r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC4410
    public <Data, TResource> com.bumptech.glide.Registry append(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.lang.Class<Data> r3, @Yue.InterfaceC4410 java.lang.Class<TResource> r4, @Yue.InterfaceC4410 com.bumptech.glide.load.ResourceDecoder<Data, TResource> r5) {
            r1 = this;
            com.bumptech.glide.provider.ResourceDecoderRegistry r0 = r1.decoderRegistry
            r0.append(r2, r5, r3, r4)
            return r1
    }

    @Yue.InterfaceC4410
    public java.util.List<com.bumptech.glide.load.ImageHeaderParser> getImageHeaderParsers() {
            r2 = this;
            com.bumptech.glide.provider.ImageHeaderParserRegistry r0 = r2.imageHeaderParserRegistry
            java.util.List r0 = r0.getParsers()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Ld
            return r0
        Ld:
            com.bumptech.glide.Registry$NoImageHeaderParserException r0 = new com.bumptech.glide.Registry$NoImageHeaderParserException
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4544
    public <Data, TResource, Transcode> com.bumptech.glide.load.engine.LoadPath<Data, TResource, Transcode> getLoadPath(@Yue.InterfaceC4410 java.lang.Class<Data> r10, @Yue.InterfaceC4410 java.lang.Class<TResource> r11, @Yue.InterfaceC4410 java.lang.Class<Transcode> r12) {
            r9 = this;
            com.bumptech.glide.provider.LoadPathCache r0 = r9.loadPathCache
            com.bumptech.glide.load.engine.LoadPath r0 = r0.get(r10, r11, r12)
            com.bumptech.glide.provider.LoadPathCache r1 = r9.loadPathCache
            boolean r1 = r1.isEmptyLoadPath(r0)
            r2 = 0
            if (r1 == 0) goto L10
            return r2
        L10:
            if (r0 != 0) goto L2e
            java.util.List r7 = r9.getDecodePaths(r10, r11, r12)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L1e
            r0 = r2
            goto L29
        L1e:
            com.bumptech.glide.load.engine.LoadPath r0 = new com.bumptech.glide.load.engine.LoadPath
            Yue.ۥۡۤۤ۠$ۥ<java.util.List<java.lang.Throwable>> r8 = r9.throwableListPool
            r3 = r0
            r4 = r10
            r5 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
        L29:
            com.bumptech.glide.provider.LoadPathCache r1 = r9.loadPathCache
            r1.put(r10, r11, r12, r0)
        L2e:
            return r0
    }

    @Yue.InterfaceC4410
    public <Model> java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, ?>> getModelLoaders(@Yue.InterfaceC4410 Model r2) {
            r1 = this;
            com.bumptech.glide.load.model.ModelLoaderRegistry r0 = r1.modelLoaderRegistry
            java.util.List r2 = r0.getModelLoaders(r2)
            return r2
    }

    @Yue.InterfaceC4410
    public <Model, TResource, Transcode> java.util.List<java.lang.Class<?>> getRegisteredResourceClasses(@Yue.InterfaceC4410 java.lang.Class<Model> r6, @Yue.InterfaceC4410 java.lang.Class<TResource> r7, @Yue.InterfaceC4410 java.lang.Class<Transcode> r8) {
            r5 = this;
            com.bumptech.glide.provider.ModelToResourceClassCache r0 = r5.modelToResourceClassCache
            java.util.List r0 = r0.get(r6, r7, r8)
            if (r0 != 0) goto L58
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bumptech.glide.load.model.ModelLoaderRegistry r1 = r5.modelLoaderRegistry
            java.util.List r1 = r1.getDataClasses(r6)
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            com.bumptech.glide.provider.ResourceDecoderRegistry r3 = r5.decoderRegistry
            java.util.List r2 = r3.getResourceClasses(r2, r7)
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L17
            java.lang.Object r3 = r2.next()
            java.lang.Class r3 = (java.lang.Class) r3
            com.bumptech.glide.load.resource.transcode.TranscoderRegistry r4 = r5.transcoderRegistry
            java.util.List r4 = r4.getTranscodeClasses(r3, r8)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L2d
            boolean r4 = r0.contains(r3)
            if (r4 != 0) goto L2d
            r0.add(r3)
            goto L2d
        L4f:
            com.bumptech.glide.provider.ModelToResourceClassCache r1 = r5.modelToResourceClassCache
            java.util.List r2 = java.util.Collections.unmodifiableList(r0)
            r1.put(r6, r7, r8, r2)
        L58:
            return r0
    }

    @Yue.InterfaceC4410
    public <X> com.bumptech.glide.load.ResourceEncoder<X> getResultEncoder(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.Resource<X> r3) throws com.bumptech.glide.Registry.NoResultEncoderAvailableException {
            r2 = this;
            com.bumptech.glide.provider.ResourceEncoderRegistry r0 = r2.resourceEncoderRegistry
            java.lang.Class r1 = r3.getResourceClass()
            com.bumptech.glide.load.ResourceEncoder r0 = r0.get(r1)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Class r3 = r3.getResourceClass()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC4410
    public <X> com.bumptech.glide.load.data.DataRewinder<X> getRewinder(@Yue.InterfaceC4410 X r2) {
            r1 = this;
            com.bumptech.glide.load.data.DataRewinderRegistry r0 = r1.dataRewinderRegistry
            com.bumptech.glide.load.data.DataRewinder r2 = r0.build(r2)
            return r2
    }

    @Yue.InterfaceC4410
    public <X> com.bumptech.glide.load.Encoder<X> getSourceEncoder(@Yue.InterfaceC4410 X r3) throws com.bumptech.glide.Registry.NoSourceEncoderAvailableException {
            r2 = this;
            com.bumptech.glide.provider.EncoderRegistry r0 = r2.encoderRegistry
            java.lang.Class r1 = r3.getClass()
            com.bumptech.glide.load.Encoder r0 = r0.getEncoder(r1)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            com.bumptech.glide.Registry$NoSourceEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            java.lang.Class r3 = r3.getClass()
            r0.<init>(r3)
            throw r0
    }

    public boolean isResourceEncoderAvailable(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.Resource<?> r2) {
            r1 = this;
            com.bumptech.glide.provider.ResourceEncoderRegistry r0 = r1.resourceEncoderRegistry
            java.lang.Class r2 = r2.getResourceClass()
            com.bumptech.glide.load.ResourceEncoder r2 = r0.get(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Yue.InterfaceC4410
    public <Data> com.bumptech.glide.Registry prepend(@Yue.InterfaceC4410 java.lang.Class<Data> r2, @Yue.InterfaceC4410 com.bumptech.glide.load.Encoder<Data> r3) {
            r1 = this;
            com.bumptech.glide.provider.EncoderRegistry r0 = r1.encoderRegistry
            r0.prepend(r2, r3)
            return r1
    }

    @Yue.InterfaceC4410
    public <TResource> com.bumptech.glide.Registry prepend(@Yue.InterfaceC4410 java.lang.Class<TResource> r2, @Yue.InterfaceC4410 com.bumptech.glide.load.ResourceEncoder<TResource> r3) {
            r1 = this;
            com.bumptech.glide.provider.ResourceEncoderRegistry r0 = r1.resourceEncoderRegistry
            r0.prepend(r2, r3)
            return r1
    }

    @Yue.InterfaceC4410
    public <Data, TResource> com.bumptech.glide.Registry prepend(@Yue.InterfaceC4410 java.lang.Class<Data> r2, @Yue.InterfaceC4410 java.lang.Class<TResource> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.ResourceDecoder<Data, TResource> r4) {
            r1 = this;
            java.lang.String r0 = "legacy_prepend_all"
            r1.prepend(r0, r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC4410
    public <Model, Data> com.bumptech.glide.Registry prepend(@Yue.InterfaceC4410 java.lang.Class<Model> r2, @Yue.InterfaceC4410 java.lang.Class<Data> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.model.ModelLoaderFactory<Model, Data> r4) {
            r1 = this;
            com.bumptech.glide.load.model.ModelLoaderRegistry r0 = r1.modelLoaderRegistry
            r0.prepend(r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC4410
    public <Data, TResource> com.bumptech.glide.Registry prepend(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.lang.Class<Data> r3, @Yue.InterfaceC4410 java.lang.Class<TResource> r4, @Yue.InterfaceC4410 com.bumptech.glide.load.ResourceDecoder<Data, TResource> r5) {
            r1 = this;
            com.bumptech.glide.provider.ResourceDecoderRegistry r0 = r1.decoderRegistry
            r0.prepend(r2, r5, r3, r4)
            return r1
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.Registry register(@Yue.InterfaceC4410 com.bumptech.glide.load.ImageHeaderParser r2) {
            r1 = this;
            com.bumptech.glide.provider.ImageHeaderParserRegistry r0 = r1.imageHeaderParserRegistry
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.Registry register(@Yue.InterfaceC4410 com.bumptech.glide.load.data.DataRewinder.Factory<?> r2) {
            r1 = this;
            com.bumptech.glide.load.data.DataRewinderRegistry r0 = r1.dataRewinderRegistry
            r0.register(r2)
            return r1
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    public <Data> com.bumptech.glide.Registry register(@Yue.InterfaceC4410 java.lang.Class<Data> r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Encoder<Data> r2) {
            r0 = this;
            com.bumptech.glide.Registry r1 = r0.append(r1, r2)
            return r1
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    public <TResource> com.bumptech.glide.Registry register(@Yue.InterfaceC4410 java.lang.Class<TResource> r1, @Yue.InterfaceC4410 com.bumptech.glide.load.ResourceEncoder<TResource> r2) {
            r0 = this;
            com.bumptech.glide.Registry r1 = r0.append(r1, r2)
            return r1
    }

    @Yue.InterfaceC4410
    public <TResource, Transcode> com.bumptech.glide.Registry register(@Yue.InterfaceC4410 java.lang.Class<TResource> r2, @Yue.InterfaceC4410 java.lang.Class<Transcode> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.resource.transcode.ResourceTranscoder<TResource, Transcode> r4) {
            r1 = this;
            com.bumptech.glide.load.resource.transcode.TranscoderRegistry r0 = r1.transcoderRegistry
            r0.register(r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC4410
    public <Model, Data> com.bumptech.glide.Registry replace(@Yue.InterfaceC4410 java.lang.Class<Model> r2, @Yue.InterfaceC4410 java.lang.Class<Data> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r4) {
            r1 = this;
            com.bumptech.glide.load.model.ModelLoaderRegistry r0 = r1.modelLoaderRegistry
            r0.replace(r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC4410
    public final com.bumptech.glide.Registry setResourceDecoderBucketPriorityList(@Yue.InterfaceC4410 java.util.List<java.lang.String> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.lang.String r1 = "legacy_prepend_all"
            r0.add(r1)
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L12
        L22:
            java.lang.String r3 = "legacy_append"
            r0.add(r3)
            com.bumptech.glide.provider.ResourceDecoderRegistry r3 = r2.decoderRegistry
            r3.setBucketPriorityList(r0)
            return r2
    }
}
