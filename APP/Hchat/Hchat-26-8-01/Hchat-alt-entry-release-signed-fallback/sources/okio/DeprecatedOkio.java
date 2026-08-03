package okio;

/* JADX INFO: renamed from: okio.-DeprecatedOkio, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
@sf.a
public final class DeprecatedOkio {
    public static final okio.DeprecatedOkio INSTANCE = null;

    static {
            okio.-DeprecatedOkio r0 = new okio.-DeprecatedOkio
            r0.<init>()
            okio.DeprecatedOkio.INSTANCE = r0
            return
    }

    private DeprecatedOkio() {
            r0 = this;
            r0.<init>()
            return
    }

    @sf.a
    public final okio.Sink appendingSink(java.io.File r1) {
            r0 = this;
            r1.getClass()
            okio.Sink r1 = okio.Okio.appendingSink(r1)
            return r1
    }

    @sf.a
    public final okio.Sink blackhole() {
            r1 = this;
            okio.Sink r0 = okio.Okio.blackhole()
            return r0
    }

    @sf.a
    public final okio.BufferedSink buffer(okio.Sink r1) {
            r0 = this;
            r1.getClass()
            okio.BufferedSink r1 = okio.Okio.buffer(r1)
            return r1
    }

    @sf.a
    public final okio.BufferedSource buffer(okio.Source r1) {
            r0 = this;
            r1.getClass()
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            return r1
    }

    @sf.a
    public final okio.Sink sink(java.io.File r4) {
            r3 = this;
            r4.getClass()
            r0 = 1
            r1 = 0
            r2 = 0
            okio.Sink r4 = okio.Okio.sink$default(r4, r2, r0, r1)
            return r4
    }

    @sf.a
    public final okio.Sink sink(java.io.OutputStream r1) {
            r0 = this;
            r1.getClass()
            okio.Sink r1 = okio.Okio.sink(r1)
            return r1
    }

    @sf.a
    public final okio.Sink sink(java.net.Socket r1) {
            r0 = this;
            r1.getClass()
            okio.Sink r1 = okio.Okio.sink(r1)
            return r1
    }

    @sf.a
    public final okio.Sink sink(java.nio.file.Path r2, java.nio.file.OpenOption... r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.OpenOption[] r3 = (java.nio.file.OpenOption[]) r3
            okio.Sink r2 = okio.Okio.sink(r2, r3)
            return r2
    }

    @sf.a
    public final okio.Source source(java.io.File r1) {
            r0 = this;
            r1.getClass()
            okio.Source r1 = okio.Okio.source(r1)
            return r1
    }

    @sf.a
    public final okio.Source source(java.io.InputStream r1) {
            r0 = this;
            r1.getClass()
            okio.Source r1 = okio.Okio.source(r1)
            return r1
    }

    @sf.a
    public final okio.Source source(java.net.Socket r1) {
            r0 = this;
            r1.getClass()
            okio.Source r1 = okio.Okio.source(r1)
            return r1
    }

    @sf.a
    public final okio.Source source(java.nio.file.Path r2, java.nio.file.OpenOption... r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.OpenOption[] r3 = (java.nio.file.OpenOption[]) r3
            okio.Source r2 = okio.Okio.source(r2, r3)
            return r2
    }
}
