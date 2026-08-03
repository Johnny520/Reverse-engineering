package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class Okio__OkioKt {
    public static final okio.Sink blackhole() {
            okio.BlackholeSink r0 = new okio.BlackholeSink
            r0.<init>()
            return r0
    }

    public static final okio.BufferedSink buffer(okio.Sink r1) {
            r1.getClass()
            okio.RealBufferedSink r0 = new okio.RealBufferedSink
            r0.<init>(r1)
            return r0
    }

    public static final okio.BufferedSource buffer(okio.Source r1) {
            r1.getClass()
            okio.RealBufferedSource r0 = new okio.RealBufferedSource
            r0.<init>(r1)
            return r0
    }

    public static final <T extends java.io.Closeable, R> R use(T r2, fg.l r3) {
            r3.getClass()
            r0 = 0
            java.lang.Object r3 = r3.invoke(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L1e
            r2.close()     // Catch: java.lang.Throwable -> Le
            goto L1e
        Le:
            r0 = move-exception
            goto L1e
        L10:
            r3 = move-exception
            if (r2 == 0) goto L1b
            r2.close()     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r2 = move-exception
            ac.p.e(r3, r2)
        L1b:
            r1 = r0
            r0 = r3
            r3 = r1
        L1e:
            if (r0 != 0) goto L24
            r3.getClass()
            return r3
        L24:
            throw r0
    }
}
