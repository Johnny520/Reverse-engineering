package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class BlackholeSink implements okio.Sink {
    public BlackholeSink() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
            r0 = this;
            return
    }

    @Override // okio.Sink
    public okio.Timeout timeout() {
            r1 = this;
            okio.Timeout r0 = okio.Timeout.NONE
            return r0
    }

    @Override // okio.Sink
    public void write(okio.Buffer r1, long r2) {
            r0 = this;
            r1.getClass()
            r1.skip(r2)
            return
    }
}
