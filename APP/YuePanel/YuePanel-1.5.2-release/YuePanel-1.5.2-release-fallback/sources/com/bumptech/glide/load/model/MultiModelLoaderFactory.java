package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public class MultiModelLoaderFactory {
    private static final com.bumptech.glide.load.model.MultiModelLoaderFactory.Factory DEFAULT_FACTORY = null;
    private static final com.bumptech.glide.load.model.ModelLoader<java.lang.Object, java.lang.Object> EMPTY_MODEL_LOADER = null;
    private final java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry<?, ?>> alreadyUsedEntries;
    private final java.util.List<com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry<?, ?>> entries;
    private final com.bumptech.glide.load.model.MultiModelLoaderFactory.Factory factory;
    private final Yue.C4820.InterfaceC4821<java.util.List<java.lang.Throwable>> throwableListPool;

    public static class EmptyModelLoader implements com.bumptech.glide.load.model.ModelLoader<java.lang.Object, java.lang.Object> {
        public EmptyModelLoader() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoader
        @Yue.InterfaceC4544
        public com.bumptech.glide.load.model.ModelLoader.LoadData<java.lang.Object> buildLoadData(@Yue.InterfaceC4410 java.lang.Object r1, int r2, int r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.bumptech.glide.load.model.ModelLoader
        public boolean handles(@Yue.InterfaceC4410 java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public static class Entry<Model, Data> {
        final java.lang.Class<Data> dataClass;
        final com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> factory;
        private final java.lang.Class<Model> modelClass;

        public Entry(@Yue.InterfaceC4410 java.lang.Class<Model> r1, @Yue.InterfaceC4410 java.lang.Class<Data> r2, @Yue.InterfaceC4410 com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r3) {
                r0 = this;
                r0.<init>()
                r0.modelClass = r1
                r0.dataClass = r2
                r0.factory = r3
                return
        }

        public boolean handles(@Yue.InterfaceC4410 java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<Model> r0 = r1.modelClass
                boolean r2 = r0.isAssignableFrom(r2)
                return r2
        }

        public boolean handles(@Yue.InterfaceC4410 java.lang.Class<?> r1, @Yue.InterfaceC4410 java.lang.Class<?> r2) {
                r0 = this;
                boolean r1 = r0.handles(r1)
                if (r1 == 0) goto L10
                java.lang.Class<Data> r1 = r0.dataClass
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L10
                r1 = 1
                goto L11
            L10:
                r1 = 0
            L11:
                return r1
        }
    }

    public static class Factory {
        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        public <Model, Data> com.bumptech.glide.load.model.MultiModelLoader<Model, Data> build(@Yue.InterfaceC4410 java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, Data>> r2, @Yue.InterfaceC4410 Yue.C4820.InterfaceC4821<java.util.List<java.lang.Throwable>> r3) {
                r1 = this;
                com.bumptech.glide.load.model.MultiModelLoader r0 = new com.bumptech.glide.load.model.MultiModelLoader
                r0.<init>(r2, r3)
                return r0
        }
    }

    static {
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Factory r0 = new com.bumptech.glide.load.model.MultiModelLoaderFactory$Factory
            r0.<init>()
            com.bumptech.glide.load.model.MultiModelLoaderFactory.DEFAULT_FACTORY = r0
            com.bumptech.glide.load.model.MultiModelLoaderFactory$EmptyModelLoader r0 = new com.bumptech.glide.load.model.MultiModelLoaderFactory$EmptyModelLoader
            r0.<init>()
            com.bumptech.glide.load.model.MultiModelLoaderFactory.EMPTY_MODEL_LOADER = r0
            return
    }

    public MultiModelLoaderFactory(@Yue.InterfaceC4410 Yue.C4820.InterfaceC4821<java.util.List<java.lang.Throwable>> r2) {
            r1 = this;
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Factory r0 = com.bumptech.glide.load.model.MultiModelLoaderFactory.DEFAULT_FACTORY
            r1.<init>(r2, r0)
            return
    }

    @Yue.InterfaceC6959
    public MultiModelLoaderFactory(@Yue.InterfaceC4410 Yue.C4820.InterfaceC4821<java.util.List<java.lang.Throwable>> r2, @Yue.InterfaceC4410 com.bumptech.glide.load.model.MultiModelLoaderFactory.Factory r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.entries = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.alreadyUsedEntries = r0
            r1.throwableListPool = r2
            r1.factory = r3
            return
    }

    private <Model, Data> void add(@Yue.InterfaceC4410 java.lang.Class<Model> r2, @Yue.InterfaceC4410 java.lang.Class<Data> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r4, boolean r5) {
            r1 = this;
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry r0 = new com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry
            r0.<init>(r2, r3, r4)
            java.util.List<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r2 = r1.entries
            if (r5 == 0) goto Le
            int r3 = r2.size()
            goto Lf
        Le:
            r3 = 0
        Lf:
            r2.add(r3, r0)
            return
    }

    @Yue.InterfaceC4410
    private <Model, Data> com.bumptech.glide.load.model.ModelLoader<Model, Data> build(@Yue.InterfaceC4410 com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry<?, ?> r1) {
            r0 = this;
            com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r1 = r1.factory
            com.bumptech.glide.load.model.ModelLoader r1 = r1.build(r0)
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            com.bumptech.glide.load.model.ModelLoader r1 = (com.bumptech.glide.load.model.ModelLoader) r1
            return r1
    }

    @Yue.InterfaceC4410
    private static <Model, Data> com.bumptech.glide.load.model.ModelLoader<Model, Data> emptyModelLoader() {
            com.bumptech.glide.load.model.ModelLoader<java.lang.Object, java.lang.Object> r0 = com.bumptech.glide.load.model.MultiModelLoaderFactory.EMPTY_MODEL_LOADER
            return r0
    }

    @Yue.InterfaceC4410
    private <Model, Data> com.bumptech.glide.load.model.ModelLoaderFactory<Model, Data> getFactory(@Yue.InterfaceC4410 com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry<?, ?> r1) {
            r0 = this;
            com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r1 = r1.factory
            return r1
    }

    public synchronized <Model, Data> void append(@Yue.InterfaceC4410 java.lang.Class<Model> r2, @Yue.InterfaceC4410 java.lang.Class<Data> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.add(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Yue.InterfaceC4410
    public synchronized <Model, Data> com.bumptech.glide.load.model.ModelLoader<Model, Data> build(@Yue.InterfaceC4410 java.lang.Class<Model> r8, @Yue.InterfaceC4410 java.lang.Class<Data> r9) {
            r7 = this;
            monitor-enter(r7)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            java.util.List<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r1 = r7.entries     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3d
            r2 = 0
            r3 = r2
        Le:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L3d
            r5 = 1
            if (r4 == 0) goto L3f
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L3d
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry r4 = (com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry) r4     // Catch: java.lang.Throwable -> L3d
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r6 = r7.alreadyUsedEntries     // Catch: java.lang.Throwable -> L3d
            boolean r6 = r6.contains(r4)     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L25
            r3 = r5
            goto Le
        L25:
            boolean r5 = r4.handles(r8, r9)     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto Le
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r5 = r7.alreadyUsedEntries     // Catch: java.lang.Throwable -> L3d
            r5.add(r4)     // Catch: java.lang.Throwable -> L3d
            com.bumptech.glide.load.model.ModelLoader r5 = r7.build(r4)     // Catch: java.lang.Throwable -> L3d
            r0.add(r5)     // Catch: java.lang.Throwable -> L3d
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r5 = r7.alreadyUsedEntries     // Catch: java.lang.Throwable -> L3d
            r5.remove(r4)     // Catch: java.lang.Throwable -> L3d
            goto Le
        L3d:
            r8 = move-exception
            goto L6b
        L3f:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L3d
            if (r1 <= r5) goto L4f
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Factory r8 = r7.factory     // Catch: java.lang.Throwable -> L3d
            Yue.ۥۡۤۤ۠$ۥ<java.util.List<java.lang.Throwable>> r9 = r7.throwableListPool     // Catch: java.lang.Throwable -> L3d
            com.bumptech.glide.load.model.MultiModelLoader r8 = r8.build(r0, r9)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r7)
            return r8
        L4f:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L3d
            if (r1 != r5) goto L5d
            java.lang.Object r8 = r0.get(r2)     // Catch: java.lang.Throwable -> L3d
            com.bumptech.glide.load.model.ModelLoader r8 = (com.bumptech.glide.load.model.ModelLoader) r8     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r7)
            return r8
        L5d:
            if (r3 == 0) goto L65
            com.bumptech.glide.load.model.ModelLoader r8 = emptyModelLoader()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r7)
            return r8
        L65:
            com.bumptech.glide.Registry$NoModelLoaderAvailableException r0 = new com.bumptech.glide.Registry$NoModelLoaderAvailableException     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        L6b:
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r9 = r7.alreadyUsedEntries     // Catch: java.lang.Throwable -> L71
            r9.clear()     // Catch: java.lang.Throwable -> L71
            throw r8     // Catch: java.lang.Throwable -> L71
        L71:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L71
            throw r8
    }

    @Yue.InterfaceC4410
    public synchronized <Model> java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, ?>> build(@Yue.InterfaceC4410 java.lang.Class<Model> r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39
            r0.<init>()     // Catch: java.lang.Throwable -> L39
            java.util.List<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r1 = r4.entries     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L39
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L39
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry r2 = (com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry) r2     // Catch: java.lang.Throwable -> L39
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r3 = r4.alreadyUsedEntries     // Catch: java.lang.Throwable -> L39
            boolean r3 = r3.contains(r2)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L21
            goto Lc
        L21:
            boolean r3 = r2.handles(r5)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto Lc
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r3 = r4.alreadyUsedEntries     // Catch: java.lang.Throwable -> L39
            r3.add(r2)     // Catch: java.lang.Throwable -> L39
            com.bumptech.glide.load.model.ModelLoader r3 = r4.build(r2)     // Catch: java.lang.Throwable -> L39
            r0.add(r3)     // Catch: java.lang.Throwable -> L39
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r3 = r4.alreadyUsedEntries     // Catch: java.lang.Throwable -> L39
            r3.remove(r2)     // Catch: java.lang.Throwable -> L39
            goto Lc
        L39:
            r5 = move-exception
            goto L3d
        L3b:
            monitor-exit(r4)
            return r0
        L3d:
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r0 = r4.alreadyUsedEntries     // Catch: java.lang.Throwable -> L43
            r0.clear()     // Catch: java.lang.Throwable -> L43
            throw r5     // Catch: java.lang.Throwable -> L43
        L43:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
            throw r5
    }

    @Yue.InterfaceC4410
    public synchronized java.util.List<java.lang.Class<?>> getDataClasses(@Yue.InterfaceC4410 java.lang.Class<?> r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            java.util.List<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r1 = r4.entries     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2c
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry r2 = (com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry) r2     // Catch: java.lang.Throwable -> L2c
            java.lang.Class<Data> r3 = r2.dataClass     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto Lc
            boolean r3 = r2.handles(r5)     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto Lc
            java.lang.Class<Data> r2 = r2.dataClass     // Catch: java.lang.Throwable -> L2c
            r0.add(r2)     // Catch: java.lang.Throwable -> L2c
            goto Lc
        L2c:
            r5 = move-exception
            goto L30
        L2e:
            monitor-exit(r4)
            return r0
        L30:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2c
            throw r5
    }

    public synchronized <Model, Data> void prepend(@Yue.InterfaceC4410 java.lang.Class<Model> r2, @Yue.InterfaceC4410 java.lang.Class<Data> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.add(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Yue.InterfaceC4410
    public synchronized <Model, Data> java.util.List<com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data>> remove(@Yue.InterfaceC4410 java.lang.Class<Model> r5, @Yue.InterfaceC4410 java.lang.Class<Data> r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            java.util.List<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r1 = r4.entries     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L29
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry r2 = (com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry) r2     // Catch: java.lang.Throwable -> L29
            boolean r3 = r2.handles(r5, r6)     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto Lc
            r1.remove()     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.load.model.ModelLoaderFactory r2 = r4.getFactory(r2)     // Catch: java.lang.Throwable -> L29
            r0.add(r2)     // Catch: java.lang.Throwable -> L29
            goto Lc
        L29:
            r5 = move-exception
            goto L2d
        L2b:
            monitor-exit(r4)
            return r0
        L2d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            throw r5
    }

    @Yue.InterfaceC4410
    public synchronized <Model, Data> java.util.List<com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data>> replace(@Yue.InterfaceC4410 java.lang.Class<Model> r2, @Yue.InterfaceC4410 java.lang.Class<Data> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            java.util.List r0 = r1.remove(r2, r3)     // Catch: java.lang.Throwable -> La
            r1.append(r2, r3, r4)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return r0
        La:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }
}
