package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingSink implements okio.Sink {
    private final okio.Sink delegate;

    public ForwardingSink(okio.Sink r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.delegate = r1
            return
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final okio.Sink m167deprecated_delegate() {
            r1 = this;
            okio.Sink r0 = r1.delegate
            return r0
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okio.Sink r0 = r1.delegate
            r0.close()
            return
    }

    public final okio.Sink delegate() {
            r1 = this;
            okio.Sink r0 = r1.delegate
            return r0
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
            r1 = this;
            okio.Sink r0 = r1.delegate
            r0.flush()
            return
    }

    @Override // okio.Sink
    public okio.Timeout timeout() {
            r1 = this;
            okio.Sink r0 = r1.delegate
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            okio.Sink r1 = r2.delegate
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // okio.Sink
    public void write(okio.Buffer r2, long r3) {
            r1 = this;
            r2.getClass()
            okio.Sink r0 = r1.delegate
            r0.write(r2, r3)
            return
    }
}
