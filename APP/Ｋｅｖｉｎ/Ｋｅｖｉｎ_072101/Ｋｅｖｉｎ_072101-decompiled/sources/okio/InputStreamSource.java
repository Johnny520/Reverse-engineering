package okio;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m115d2 = {"Lokio/InputStreamSource;", "Lokio/Source;", "input", "Ljava/io/InputStream;", "timeout", "Lokio/Timeout;", "(Ljava/io/InputStream;Lokio/Timeout;)V", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "toString", "", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
class InputStreamSource implements okio.Source {
    private final java.io.InputStream input;
    private final okio.Timeout timeout;

    public InputStreamSource(java.io.InputStream r2, okio.Timeout r3) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "timeout"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.input = r2
            r1.timeout = r3
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.InputStream r0 = r1.input
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(okio.Buffer r8, long r9) {
            r7 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            return r0
        Lc:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r1 = 1
            if (r0 < 0) goto L13
            r0 = r1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L6b
        L17:
            okio.Timeout r0 = r7.timeout     // Catch: java.lang.AssertionError -> L5a
            r0.throwIfReached()     // Catch: java.lang.AssertionError -> L5a
            okio.Segment r0 = r8.writableSegment$okio(r1)     // Catch: java.lang.AssertionError -> L5a
            int r1 = r0.limit     // Catch: java.lang.AssertionError -> L5a
            int r1 = 8192 - r1
            r2 = 0
            long r3 = (long) r1     // Catch: java.lang.AssertionError -> L5a
            long r3 = java.lang.Math.min(r9, r3)     // Catch: java.lang.AssertionError -> L5a
            int r1 = (int) r3     // Catch: java.lang.AssertionError -> L5a
            java.io.InputStream r2 = r7.input     // Catch: java.lang.AssertionError -> L5a
            byte[] r3 = r0.data     // Catch: java.lang.AssertionError -> L5a
            int r4 = r0.limit     // Catch: java.lang.AssertionError -> L5a
            int r2 = r2.read(r3, r4, r1)     // Catch: java.lang.AssertionError -> L5a
            r3 = -1
            if (r2 != r3) goto L4a
            int r3 = r0.pos     // Catch: java.lang.AssertionError -> L5a
            int r4 = r0.limit     // Catch: java.lang.AssertionError -> L5a
            if (r3 != r4) goto L47
            okio.Segment r3 = r0.pop()     // Catch: java.lang.AssertionError -> L5a
            r8.head = r3     // Catch: java.lang.AssertionError -> L5a
            okio.SegmentPool.recycle(r0)     // Catch: java.lang.AssertionError -> L5a
        L47:
            r3 = -1
            return r3
        L4a:
            int r3 = r0.limit     // Catch: java.lang.AssertionError -> L5a
            int r3 = r3 + r2
            r0.limit = r3     // Catch: java.lang.AssertionError -> L5a
            long r3 = r8.size()     // Catch: java.lang.AssertionError -> L5a
            long r5 = (long) r2     // Catch: java.lang.AssertionError -> L5a
            long r3 = r3 + r5
            r8.setSize$okio(r3)     // Catch: java.lang.AssertionError -> L5a
            long r3 = (long) r2
            return r3
        L5a:
            r0 = move-exception
            boolean r1 = okio.Okio.isAndroidGetsocknameError(r0)
            if (r1 == 0) goto L6a
            java.io.IOException r1 = new java.io.IOException
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.<init>(r2)
            throw r1
        L6a:
            throw r0
        L6b:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "byteCount < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.Timeout r0 = r1.timeout
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "source("
            java.lang.StringBuilder r0 = r0.append(r1)
            java.io.InputStream r1 = r2.input
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
