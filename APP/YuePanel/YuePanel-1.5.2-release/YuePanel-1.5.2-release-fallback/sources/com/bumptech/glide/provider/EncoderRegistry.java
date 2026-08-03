package com.bumptech.glide.provider;

/* JADX INFO: loaded from: classes.dex */
public class EncoderRegistry {
    private final java.util.List<com.bumptech.glide.provider.EncoderRegistry.Entry<?>> encoders;

    public static final class Entry<T> {
        private final java.lang.Class<T> dataClass;
        final com.bumptech.glide.load.Encoder<T> encoder;

        public Entry(@Yue.InterfaceC4410 java.lang.Class<T> r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Encoder<T> r2) {
                r0 = this;
                r0.<init>()
                r0.dataClass = r1
                r0.encoder = r2
                return
        }

        public boolean handles(@Yue.InterfaceC4410 java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<T> r0 = r1.dataClass
                boolean r2 = r0.isAssignableFrom(r2)
                return r2
        }
    }

    public EncoderRegistry() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.encoders = r0
            return
    }

    public synchronized <T> void append(@Yue.InterfaceC4410 java.lang.Class<T> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Encoder<T> r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.provider.EncoderRegistry$Entry<?>> r0 = r2.encoders     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.provider.EncoderRegistry$Entry r1 = new com.bumptech.glide.provider.EncoderRegistry$Entry     // Catch: java.lang.Throwable -> Ld
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
    public synchronized <T> com.bumptech.glide.load.Encoder<T> getEncoder(@Yue.InterfaceC4410 java.lang.Class<T> r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.List<com.bumptech.glide.provider.EncoderRegistry$Entry<?>> r0 = r3.encoders     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1d
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1d
            com.bumptech.glide.provider.EncoderRegistry$Entry r1 = (com.bumptech.glide.provider.EncoderRegistry.Entry) r1     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r1.handles(r4)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L7
            com.bumptech.glide.load.Encoder<T> r4 = r1.encoder     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
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

    public synchronized <T> void prepend(@Yue.InterfaceC4410 java.lang.Class<T> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Encoder<T> r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.provider.EncoderRegistry$Entry<?>> r0 = r2.encoders     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.provider.EncoderRegistry$Entry r1 = new com.bumptech.glide.provider.EncoderRegistry$Entry     // Catch: java.lang.Throwable -> Le
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
