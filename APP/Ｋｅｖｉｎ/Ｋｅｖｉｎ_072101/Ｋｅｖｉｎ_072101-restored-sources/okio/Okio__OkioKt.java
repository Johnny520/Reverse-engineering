package okio;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0005*\u00020\u0006\u001aA\u0010\u0007\u001a\u0002H\b\"\u0010\b\u0000\u0010\t*\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\"\u0004\b\u0001\u0010\b*\u0002H\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\b0\rH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, m115d2 = {"blackholeSink", "Lokio/Sink;", "blackhole", "buffer", "Lokio/BufferedSink;", "Lokio/BufferedSource;", "Lokio/Source;", "use", "R", "T", "Ljava/io/Closeable;", "Lokio/Closeable;", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "okio"}, m116k = 5, m117mv = {1, 9, 0}, m119xi = 48, m120xs = "okio/Okio")
final /* synthetic */ class Okio__OkioKt {
    public static final okio.Sink blackhole() {
            okio.BlackholeSink r0 = new okio.BlackholeSink
            r0.<init>()
            okio.Sink r0 = (okio.Sink) r0
            return r0
    }

    public static final okio.BufferedSink buffer(okio.Sink r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.RealBufferedSink r0 = new okio.RealBufferedSink
            r0.<init>(r1)
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    public static final okio.BufferedSource buffer(okio.Source r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.RealBufferedSource r0 = new okio.RealBufferedSource
            r0.<init>(r1)
            okio.BufferedSource r0 = (okio.BufferedSource) r0
            return r0
    }

    public static final <T extends java.io.Closeable, R> R use(T r5, kotlin.jvm.functions.Function1<? super T, ? extends R> r6) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.Object r4 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L20
            r1 = r4
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            if (r5 == 0) goto L1c
            r5.close()     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r4 = move-exception
            r2 = r4
        L1c:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
        L1f:
            goto L35
        L20:
            r4 = move-exception
            r2 = r4
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            if (r5 == 0) goto L31
            r5.close()     // Catch: java.lang.Throwable -> L2c
            goto L31
        L2c:
            r4 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r2, r4)
        L31:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            goto L1f
        L35:
            if (r2 != 0) goto L3b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            return r1
        L3b:
            throw r2
    }
}
