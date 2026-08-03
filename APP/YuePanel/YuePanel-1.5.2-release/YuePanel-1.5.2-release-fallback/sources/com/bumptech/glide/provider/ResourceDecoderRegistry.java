package com.bumptech.glide.provider;

/* JADX INFO: loaded from: classes.dex */
public class ResourceDecoderRegistry {
    private final java.util.List<java.lang.String> bucketPriorityList;
    private final java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.provider.ResourceDecoderRegistry.Entry<?, ?>>> decoders;

    public static class Entry<T, R> {
        private final java.lang.Class<T> dataClass;
        final com.bumptech.glide.load.ResourceDecoder<T, R> decoder;
        final java.lang.Class<R> resourceClass;

        public Entry(@Yue.InterfaceC4410 java.lang.Class<T> r1, @Yue.InterfaceC4410 java.lang.Class<R> r2, com.bumptech.glide.load.ResourceDecoder<T, R> r3) {
                r0 = this;
                r0.<init>()
                r0.dataClass = r1
                r0.resourceClass = r2
                r0.decoder = r3
                return
        }

        public boolean handles(@Yue.InterfaceC4410 java.lang.Class<?> r2, @Yue.InterfaceC4410 java.lang.Class<?> r3) {
                r1 = this;
                java.lang.Class<T> r0 = r1.dataClass
                boolean r2 = r0.isAssignableFrom(r2)
                if (r2 == 0) goto L12
                java.lang.Class<R> r2 = r1.resourceClass
                boolean r2 = r3.isAssignableFrom(r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }
    }

    public ResourceDecoderRegistry() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.bucketPriorityList = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.decoders = r0
            return
    }

    @Yue.InterfaceC4410
    private synchronized java.util.List<com.bumptech.glide.provider.ResourceDecoderRegistry.Entry<?, ?>> getOrAddEntryList(@Yue.InterfaceC4410 java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<java.lang.String> r0 = r2.bucketPriorityList     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r0.contains(r3)     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            java.util.List<java.lang.String> r0 = r2.bucketPriorityList     // Catch: java.lang.Throwable -> Lf
            r0.add(r3)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r3 = move-exception
            goto L27
        L11:
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.provider.ResourceDecoderRegistry$Entry<?, ?>>> r0 = r2.decoders     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> Lf
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L25
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.provider.ResourceDecoderRegistry$Entry<?, ?>>> r1 = r2.decoders     // Catch: java.lang.Throwable -> Lf
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> Lf
        L25:
            monitor-exit(r2)
            return r0
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    public synchronized <T, R> void append(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 com.bumptech.glide.load.ResourceDecoder<T, R> r3, @Yue.InterfaceC4410 java.lang.Class<T> r4, @Yue.InterfaceC4410 java.lang.Class<R> r5) {
            r1 = this;
            monitor-enter(r1)
            java.util.List r2 = r1.getOrAddEntryList(r2)     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.provider.ResourceDecoderRegistry$Entry r0 = new com.bumptech.glide.provider.ResourceDecoderRegistry$Entry     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r4, r5, r3)     // Catch: java.lang.Throwable -> Lf
            r2.add(r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    @Yue.InterfaceC4410
    public synchronized <T, R> java.util.List<com.bumptech.glide.load.ResourceDecoder<T, R>> getDecoders(@Yue.InterfaceC4410 java.lang.Class<T> r6, @Yue.InterfaceC4410 java.lang.Class<R> r7) {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3f
            r0.<init>()     // Catch: java.lang.Throwable -> L3f
            java.util.List<java.lang.String> r1 = r5.bucketPriorityList     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3f
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L3f
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.provider.ResourceDecoderRegistry$Entry<?, ?>>> r3 = r5.decoders     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L3f
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L3f
            if (r2 != 0) goto L23
            goto Lc
        L23:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3f
        L27:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto Lc
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3f
            com.bumptech.glide.provider.ResourceDecoderRegistry$Entry r3 = (com.bumptech.glide.provider.ResourceDecoderRegistry.Entry) r3     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r3.handles(r6, r7)     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L27
            com.bumptech.glide.load.ResourceDecoder<T, R> r3 = r3.decoder     // Catch: java.lang.Throwable -> L3f
            r0.add(r3)     // Catch: java.lang.Throwable -> L3f
            goto L27
        L3f:
            r6 = move-exception
            goto L43
        L41:
            monitor-exit(r5)
            return r0
        L43:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            throw r6
    }

    @Yue.InterfaceC4410
    public synchronized <T, R> java.util.List<java.lang.Class<R>> getResourceClasses(@Yue.InterfaceC4410 java.lang.Class<T> r6, @Yue.InterfaceC4410 java.lang.Class<R> r7) {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L47
            r0.<init>()     // Catch: java.lang.Throwable -> L47
            java.util.List<java.lang.String> r1 = r5.bucketPriorityList     // Catch: java.lang.Throwable -> L47
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L47
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L47
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.provider.ResourceDecoderRegistry$Entry<?, ?>>> r3 = r5.decoders     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L47
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L23
            goto Lc
        L23:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L47
        L27:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto Lc
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L47
            com.bumptech.glide.provider.ResourceDecoderRegistry$Entry r3 = (com.bumptech.glide.provider.ResourceDecoderRegistry.Entry) r3     // Catch: java.lang.Throwable -> L47
            boolean r4 = r3.handles(r6, r7)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L27
            java.lang.Class<R> r4 = r3.resourceClass     // Catch: java.lang.Throwable -> L47
            boolean r4 = r0.contains(r4)     // Catch: java.lang.Throwable -> L47
            if (r4 != 0) goto L27
            java.lang.Class<R> r3 = r3.resourceClass     // Catch: java.lang.Throwable -> L47
            r0.add(r3)     // Catch: java.lang.Throwable -> L47
            goto L27
        L47:
            r6 = move-exception
            goto L4b
        L49:
            monitor-exit(r5)
            return r0
        L4b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L47
            throw r6
    }

    public synchronized <T, R> void prepend(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 com.bumptech.glide.load.ResourceDecoder<T, R> r3, @Yue.InterfaceC4410 java.lang.Class<T> r4, @Yue.InterfaceC4410 java.lang.Class<R> r5) {
            r1 = this;
            monitor-enter(r1)
            java.util.List r2 = r1.getOrAddEntryList(r2)     // Catch: java.lang.Throwable -> L10
            com.bumptech.glide.provider.ResourceDecoderRegistry$Entry r0 = new com.bumptech.glide.provider.ResourceDecoderRegistry$Entry     // Catch: java.lang.Throwable -> L10
            r0.<init>(r4, r5, r3)     // Catch: java.lang.Throwable -> L10
            r3 = 0
            r2.add(r3, r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public synchronized void setBucketPriorityList(@Yue.InterfaceC4410 java.util.List<java.lang.String> r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L23
            java.util.List<java.lang.String> r1 = r4.bucketPriorityList     // Catch: java.lang.Throwable -> L23
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L23
            java.util.List<java.lang.String> r1 = r4.bucketPriorityList     // Catch: java.lang.Throwable -> L23
            r1.clear()     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r1 = r5.iterator()     // Catch: java.lang.Throwable -> L23
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L23
            java.util.List<java.lang.String> r3 = r4.bucketPriorityList     // Catch: java.lang.Throwable -> L23
            r3.add(r2)     // Catch: java.lang.Throwable -> L23
            goto L11
        L23:
            r5 = move-exception
            goto L43
        L25:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L23
        L29:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L23
            boolean r2 = r5.contains(r1)     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L29
            java.util.List<java.lang.String> r2 = r4.bucketPriorityList     // Catch: java.lang.Throwable -> L23
            r2.add(r1)     // Catch: java.lang.Throwable -> L23
            goto L29
        L41:
            monitor-exit(r4)
            return
        L43:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            throw r5
    }
}
