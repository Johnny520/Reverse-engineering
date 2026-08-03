package com.bumptech.glide.provider;

/* JADX INFO: loaded from: classes.dex */
public class ResourceEncoderRegistry {
    private final java.util.List<com.bumptech.glide.provider.ResourceEncoderRegistry.Entry<?>> encoders;

    public static final class Entry<T> {
        final com.bumptech.glide.load.ResourceEncoder<T> encoder;
        private final java.lang.Class<T> resourceClass;

        public Entry(@Yue.InterfaceC4410 java.lang.Class<T> r1, @Yue.InterfaceC4410 com.bumptech.glide.load.ResourceEncoder<T> r2) {
                r0 = this;
                r0.<init>()
                r0.resourceClass = r1
                r0.encoder = r2
                return
        }

        public boolean handles(@Yue.InterfaceC4410 java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<T> r0 = r1.resourceClass
                boolean r2 = r0.isAssignableFrom(r2)
                return r2
        }
    }

    public ResourceEncoderRegistry() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.encoders = r0
            return
    }

    public synchronized <Z> void append(@Yue.InterfaceC4410 java.lang.Class<Z> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.ResourceEncoder<Z> r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.provider.ResourceEncoderRegistry$Entry<?>> r0 = r2.encoders     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.provider.ResourceEncoderRegistry$Entry r1 = new com.bumptech.glide.provider.ResourceEncoderRegistry$Entry     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Ld
            r0.add(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    @Yue.InterfaceC4544
    public synchronized <Z> com.bumptech.glide.load.ResourceEncoder<Z> get(@Yue.InterfaceC4410 java.lang.Class<Z> r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.List<com.bumptech.glide.provider.ResourceEncoderRegistry$Entry<?>> r0 = r4.encoders     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1c
            r1 = 0
        L8:
            if (r1 >= r0) goto L21
            java.util.List<com.bumptech.glide.provider.ResourceEncoderRegistry$Entry<?>> r2 = r4.encoders     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.provider.ResourceEncoderRegistry$Entry r2 = (com.bumptech.glide.provider.ResourceEncoderRegistry.Entry) r2     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r2.handles(r5)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            com.bumptech.glide.load.ResourceEncoder<T> r5 = r2.encoder     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r4)
            return r5
        L1c:
            r5 = move-exception
            goto L24
        L1e:
            int r1 = r1 + 1
            goto L8
        L21:
            monitor-exit(r4)
            r5 = 0
            return r5
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            throw r5
    }

    public synchronized <Z> void prepend(@Yue.InterfaceC4410 java.lang.Class<Z> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.ResourceEncoder<Z> r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.provider.ResourceEncoderRegistry$Entry<?>> r0 = r2.encoders     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.provider.ResourceEncoderRegistry$Entry r1 = new com.bumptech.glide.provider.ResourceEncoderRegistry$Entry     // Catch: java.lang.Throwable -> Le
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le
            r3 = 0
            r0.add(r3, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        Le:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }
}
