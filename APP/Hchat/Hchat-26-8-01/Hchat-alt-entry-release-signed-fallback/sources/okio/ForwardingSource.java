package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingSource implements okio.Source {
    private final okio.Source delegate;

    public ForwardingSource(okio.Source r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.delegate = r1
            return
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final okio.Source m168deprecated_delegate() {
            r1 = this;
            okio.Source r0 = r1.delegate
            return r0
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okio.Source r0 = r1.delegate
            r0.close()
            return
    }

    public final okio.Source delegate() {
            r1 = this;
            okio.Source r0 = r1.delegate
            return r0
    }

    @Override // okio.Source
    public long read(okio.Buffer r2, long r3) {
            r1 = this;
            r2.getClass()
            okio.Source r0 = r1.delegate
            long r2 = r0.read(r2, r3)
            return r2
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.Source r0 = r1.delegate
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
            okio.Source r1 = r2.delegate
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
