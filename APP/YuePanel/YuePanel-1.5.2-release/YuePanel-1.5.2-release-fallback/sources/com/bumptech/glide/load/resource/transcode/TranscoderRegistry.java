package com.bumptech.glide.load.resource.transcode;

/* JADX INFO: loaded from: classes.dex */
public class TranscoderRegistry {
    private final java.util.List<com.bumptech.glide.load.resource.transcode.TranscoderRegistry.Entry<?, ?>> transcoders;

    public static final class Entry<Z, R> {
        final java.lang.Class<Z> fromClass;
        final java.lang.Class<R> toClass;
        final com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> transcoder;

        public Entry(@Yue.InterfaceC4410 java.lang.Class<Z> r1, @Yue.InterfaceC4410 java.lang.Class<R> r2, @Yue.InterfaceC4410 com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> r3) {
                r0 = this;
                r0.<init>()
                r0.fromClass = r1
                r0.toClass = r2
                r0.transcoder = r3
                return
        }

        public boolean handles(@Yue.InterfaceC4410 java.lang.Class<?> r2, @Yue.InterfaceC4410 java.lang.Class<?> r3) {
                r1 = this;
                java.lang.Class<Z> r0 = r1.fromClass
                boolean r2 = r0.isAssignableFrom(r2)
                if (r2 == 0) goto L12
                java.lang.Class<R> r2 = r1.toClass
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

    public TranscoderRegistry() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.transcoders = r0
            return
    }

    @Yue.InterfaceC4410
    public synchronized <Z, R> com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> get(@Yue.InterfaceC4410 java.lang.Class<Z> r4, @Yue.InterfaceC4410 java.lang.Class<R> r5) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r5.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.resource.transcode.ResourceTranscoder r4 = com.bumptech.glide.load.resource.transcode.UnitTranscoder.get()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return r4
        Ld:
            r4 = move-exception
            goto L4a
        Lf:
            java.util.List<com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry<?, ?>> r0 = r3.transcoders     // Catch: java.lang.Throwable -> Ld
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Ld
        L15:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry r1 = (com.bumptech.glide.load.resource.transcode.TranscoderRegistry.Entry) r1     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r1.handles(r4, r5)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto L15
            com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> r4 = r1.transcoder     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return r4
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Ld
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r1.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "No transcoder registered to transcode from "
            r1.append(r2)     // Catch: java.lang.Throwable -> Ld
            r1.append(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = " to "
            r1.append(r4)     // Catch: java.lang.Throwable -> Ld
            r1.append(r5)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Ld
            throw r0     // Catch: java.lang.Throwable -> Ld
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }

    @Yue.InterfaceC4410
    public synchronized <Z, R> java.util.List<java.lang.Class<R>> getTranscodeClasses(@Yue.InterfaceC4410 java.lang.Class<Z> r5, @Yue.InterfaceC4410 java.lang.Class<R> r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            r0.<init>()     // Catch: java.lang.Throwable -> L11
            boolean r1 = r6.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            r0.add(r6)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)
            return r0
        L11:
            r5 = move-exception
            goto L3b
        L13:
            java.util.List<com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry<?, ?>> r1 = r4.transcoders     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L11
        L19:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry r2 = (com.bumptech.glide.load.resource.transcode.TranscoderRegistry.Entry) r2     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2.handles(r5, r6)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L19
            java.lang.Class<R> r3 = r2.toClass     // Catch: java.lang.Throwable -> L11
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L19
            java.lang.Class<R> r2 = r2.toClass     // Catch: java.lang.Throwable -> L11
            r0.add(r2)     // Catch: java.lang.Throwable -> L11
            goto L19
        L39:
            monitor-exit(r4)
            return r0
        L3b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r5
    }

    public synchronized <Z, R> void register(@Yue.InterfaceC4410 java.lang.Class<Z> r3, @Yue.InterfaceC4410 java.lang.Class<R> r4, @Yue.InterfaceC4410 com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> r5) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry<?, ?>> r0 = r2.transcoders     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry r1 = new com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> Ld
            r0.add(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }
}
