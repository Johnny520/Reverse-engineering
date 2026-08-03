package okhttp3.internal.cache;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FaultHidingSink extends okio.ForwardingSink {
    private boolean hasErrors;
    private final fg.l onException;

    public FaultHidingSink(okio.Sink r1, fg.l r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>(r1)
            r0.onException = r2
            return
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            boolean r0 = r2.hasErrors
            if (r0 == 0) goto L5
            return
        L5:
            super.close()     // Catch: java.io.IOException -> L9
            return
        L9:
            r0 = move-exception
            r1 = 1
            r2.hasErrors = r1
            fg.l r1 = r2.onException
            r1.invoke(r0)
            return
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() {
            r2 = this;
            boolean r0 = r2.hasErrors
            if (r0 == 0) goto L5
            return
        L5:
            super.flush()     // Catch: java.io.IOException -> L9
            return
        L9:
            r0 = move-exception
            r1 = 1
            r2.hasErrors = r1
            fg.l r1 = r2.onException
            r1.invoke(r0)
            return
    }

    public final fg.l getOnException() {
            r1 = this;
            fg.l r0 = r1.onException
            return r0
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(okio.Buffer r2, long r3) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.hasErrors
            if (r0 == 0) goto Lb
            r2.skip(r3)
            return
        Lb:
            super.write(r2, r3)     // Catch: java.io.IOException -> Lf
            return
        Lf:
            r2 = move-exception
            r3 = 1
            r1.hasErrors = r3
            fg.l r3 = r1.onException
            r3.invoke(r2)
            return
    }
}
