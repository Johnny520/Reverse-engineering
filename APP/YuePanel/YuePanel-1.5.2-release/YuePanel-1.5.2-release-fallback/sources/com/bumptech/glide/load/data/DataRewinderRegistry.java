package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes.dex */
public class DataRewinderRegistry {
    private static final com.bumptech.glide.load.data.DataRewinder.Factory<?> DEFAULT_FACTORY = null;
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.DataRewinder.Factory<?>> rewinders;


    public static final class DefaultRewinder implements com.bumptech.glide.load.data.DataRewinder<java.lang.Object> {
        private final java.lang.Object data;

        public DefaultRewinder(@Yue.InterfaceC4410 java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.data = r1
                return
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        public void cleanup() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        @Yue.InterfaceC4410
        public java.lang.Object rewindAndGet() {
                r1 = this;
                java.lang.Object r0 = r1.data
                return r0
        }
    }

    static {
            com.bumptech.glide.load.data.DataRewinderRegistry$1 r0 = new com.bumptech.glide.load.data.DataRewinderRegistry$1
            r0.<init>()
            com.bumptech.glide.load.data.DataRewinderRegistry.DEFAULT_FACTORY = r0
            return
    }

    public DataRewinderRegistry() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.rewinders = r0
            return
    }

    @Yue.InterfaceC4410
    public synchronized <T> com.bumptech.glide.load.data.DataRewinder<T> build(@Yue.InterfaceC4410 T r6) {
            r5 = this;
            monitor-enter(r5)
            com.bumptech.glide.util.Preconditions.checkNotNull(r6)     // Catch: java.lang.Throwable -> L38
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.DataRewinder$Factory<?>> r0 = r5.rewinders     // Catch: java.lang.Throwable -> L38
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.load.data.DataRewinder$Factory r0 = (com.bumptech.glide.load.data.DataRewinder.Factory) r0     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L3a
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.DataRewinder$Factory<?>> r1 = r5.rewinders     // Catch: java.lang.Throwable -> L38
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L38
        L1c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.load.data.DataRewinder$Factory r2 = (com.bumptech.glide.load.data.DataRewinder.Factory) r2     // Catch: java.lang.Throwable -> L38
            java.lang.Class r3 = r2.getDataClass()     // Catch: java.lang.Throwable -> L38
            java.lang.Class r4 = r6.getClass()     // Catch: java.lang.Throwable -> L38
            boolean r3 = r3.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L1c
            r0 = r2
            goto L3a
        L38:
            r6 = move-exception
            goto L44
        L3a:
            if (r0 != 0) goto L3e
            com.bumptech.glide.load.data.DataRewinder$Factory<?> r0 = com.bumptech.glide.load.data.DataRewinderRegistry.DEFAULT_FACTORY     // Catch: java.lang.Throwable -> L38
        L3e:
            com.bumptech.glide.load.data.DataRewinder r6 = r0.build(r6)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r5)
            return r6
        L44:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L38
            throw r6
    }

    public synchronized void register(@Yue.InterfaceC4410 com.bumptech.glide.load.data.DataRewinder.Factory<?> r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.DataRewinder$Factory<?>> r0 = r2.rewinders     // Catch: java.lang.Throwable -> Lc
            java.lang.Class r1 = r3.getDataClass()     // Catch: java.lang.Throwable -> Lc
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }
}
