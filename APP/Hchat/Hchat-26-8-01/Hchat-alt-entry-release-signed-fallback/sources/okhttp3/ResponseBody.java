package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResponseBody implements java.io.Closeable {
    public static final okhttp3.ResponseBody.Companion Companion = null;
    private java.io.Reader reader;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class BomAwareReader extends java.io.Reader {
        private final java.nio.charset.Charset charset;
        private boolean closed;
        private java.io.Reader delegate;
        private final okio.BufferedSource source;

        public BomAwareReader(okio.BufferedSource r1, java.nio.charset.Charset r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r0.<init>()
                r0.source = r1
                r0.charset = r2
                return
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                r0 = 1
                r1.closed = r0
                java.io.Reader r0 = r1.delegate
                if (r0 == 0) goto Ld
                r0.close()
                sf.n r0 = sf.n.f12433a
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 != 0) goto L15
                okio.BufferedSource r0 = r1.source
                r0.close()
            L15:
                return
        }

        @Override // java.io.Reader
        public int read(char[] r5, int r6, int r7) {
                r4 = this;
                r5.getClass()
                boolean r0 = r4.closed
                if (r0 != 0) goto L25
                java.io.Reader r0 = r4.delegate
                if (r0 != 0) goto L20
                java.io.InputStreamReader r0 = new java.io.InputStreamReader
                okio.BufferedSource r1 = r4.source
                java.io.InputStream r1 = r1.inputStream()
                okio.BufferedSource r2 = r4.source
                java.nio.charset.Charset r3 = r4.charset
                java.nio.charset.Charset r2 = okhttp3.internal.Util.readBomAsCharset(r2, r3)
                r0.<init>(r1, r2)
                r4.delegate = r0
            L20:
                int r5 = r0.read(r5, r6, r7)
                return r5
            L25:
                java.lang.String r5 = "Stream closed"
                j8.o.y(r5)
                r5 = 0
                return r5
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion r0, java.lang.String r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.ResponseBody r0 = r0.create(r1, r2)
                return r0
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion r0, okio.BufferedSource r1, okhttp3.MediaType r2, long r3, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                if (r6 == 0) goto L5
                r2 = 0
            L5:
                r5 = r5 & 2
                if (r5 == 0) goto Lb
                r3 = -1
            Lb:
                okhttp3.ResponseBody r0 = r0.create(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion r0, okio.ByteString r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.ResponseBody r0 = r0.create(r1, r2)
                return r0
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion r0, byte[] r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.ResponseBody r0 = r0.create(r1, r2)
                return r0
        }

        public final okhttp3.ResponseBody create(java.lang.String r4, okhttp3.MediaType r5) {
                r3 = this;
                r4.getClass()
                java.nio.charset.Charset r0 = og.a.f9804a
                if (r5 == 0) goto L28
                r1 = 1
                r2 = 0
                java.nio.charset.Charset r1 = okhttp3.MediaType.charset$default(r5, r2, r1, r2)
                if (r1 != 0) goto L27
                okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r5)
                java.lang.String r5 = "; charset=utf-8"
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                okhttp3.MediaType r5 = r1.parse(r5)
                goto L28
            L27:
                r0 = r1
            L28:
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                okio.Buffer r4 = r1.writeString(r4, r0)
                long r0 = r4.size()
                okhttp3.ResponseBody r4 = r3.create(r4, r5, r0)
                return r4
        }

        @sf.a
        public final okhttp3.ResponseBody create(okhttp3.MediaType r1, long r2, okio.BufferedSource r4) {
                r0 = this;
                r4.getClass()
                okhttp3.ResponseBody r1 = r0.create(r4, r1, r2)
                return r1
        }

        @sf.a
        public final okhttp3.ResponseBody create(okhttp3.MediaType r1, java.lang.String r2) {
                r0 = this;
                r2.getClass()
                okhttp3.ResponseBody r1 = r0.create(r2, r1)
                return r1
        }

        @sf.a
        public final okhttp3.ResponseBody create(okhttp3.MediaType r1, okio.ByteString r2) {
                r0 = this;
                r2.getClass()
                okhttp3.ResponseBody r1 = r0.create(r2, r1)
                return r1
        }

        @sf.a
        public final okhttp3.ResponseBody create(okhttp3.MediaType r1, byte[] r2) {
                r0 = this;
                r2.getClass()
                okhttp3.ResponseBody r1 = r0.create(r2, r1)
                return r1
        }

        public final okhttp3.ResponseBody create(okio.BufferedSource r2, okhttp3.MediaType r3, long r4) {
                r1 = this;
                r2.getClass()
                okhttp3.ResponseBody$Companion$asResponseBody$1 r0 = new okhttp3.ResponseBody$Companion$asResponseBody$1
                r0.<init>(r3, r4, r2)
                return r0
        }

        public final okhttp3.ResponseBody create(okio.ByteString r4, okhttp3.MediaType r5) {
                r3 = this;
                r4.getClass()
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                okio.Buffer r0 = r0.write(r4)
                int r4 = r4.size()
                long r1 = (long) r4
                okhttp3.ResponseBody r4 = r3.create(r0, r5, r1)
                return r4
        }

        public final okhttp3.ResponseBody create(byte[] r4, okhttp3.MediaType r5) {
                r3 = this;
                r4.getClass()
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                okio.Buffer r0 = r0.write(r4)
                int r4 = r4.length
                long r1 = (long) r4
                okhttp3.ResponseBody r4 = r3.create(r0, r5, r1)
                return r4
        }
    }

    static {
            okhttp3.ResponseBody$Companion r0 = new okhttp3.ResponseBody$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.ResponseBody.Companion = r0
            return
    }

    public ResponseBody() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.nio.charset.Charset charset() {
            r2 = this;
            okhttp3.MediaType r0 = r2.contentType()
            if (r0 == 0) goto L10
            java.nio.charset.Charset r1 = og.a.f9804a
            java.nio.charset.Charset r0 = r0.charset(r1)
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            return r0
        L10:
            java.nio.charset.Charset r0 = og.a.f9804a
            return r0
    }

    private final <T> T consumeSource(fg.l r5, fg.l r6) {
            r4 = this;
            long r0 = r4.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L39
            okio.BufferedSource r2 = r4.source()
            java.lang.Object r5 = r5.invoke(r2)     // Catch: java.lang.Throwable -> L32
            r3 = 0
            ig.a.i(r2, r3)
            java.lang.Object r6 = r6.invoke(r5)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L31
            long r2 = (long) r6
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L2d
            goto L31
        L2d:
            j8.o.c(r6, r0)
        L30:
            r5 = 0
        L31:
            return r5
        L32:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L34
        L34:
            r6 = move-exception
            ig.a.i(r2, r5)
            throw r6
        L39:
            java.lang.String r5 = "Cannot buffer entire body for content length: "
            java.lang.String r5 = bc.e.g(r0, r5)
            j8.o.y(r5)
            goto L30
    }

    public static final okhttp3.ResponseBody create(java.lang.String r1, okhttp3.MediaType r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @sf.a
    public static final okhttp3.ResponseBody create(okhttp3.MediaType r1, long r2, okio.BufferedSource r4) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2, r4)
            return r1
    }

    @sf.a
    public static final okhttp3.ResponseBody create(okhttp3.MediaType r1, java.lang.String r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @sf.a
    public static final okhttp3.ResponseBody create(okhttp3.MediaType r1, okio.ByteString r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @sf.a
    public static final okhttp3.ResponseBody create(okhttp3.MediaType r1, byte[] r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    public static final okhttp3.ResponseBody create(okio.BufferedSource r1, okhttp3.MediaType r2, long r3) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2, r3)
            return r1
    }

    public static final okhttp3.ResponseBody create(okio.ByteString r1, okhttp3.MediaType r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    public static final okhttp3.ResponseBody create(byte[] r1, okhttp3.MediaType r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    public final java.io.InputStream byteStream() {
            r1 = this;
            okio.BufferedSource r0 = r1.source()
            java.io.InputStream r0 = r0.inputStream()
            return r0
    }

    public final okio.ByteString byteString() {
            r6 = this;
            long r0 = r6.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L34
            okio.BufferedSource r2 = r6.source()
            okio.ByteString r3 = r2.readByteString()     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            ig.a.i(r2, r4)
            int r2 = r3.size()
            r4 = -1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L2c
            long r4 = (long) r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L27
            goto L2c
        L27:
            j8.o.c(r2, r0)
        L2a:
            r0 = 0
            return r0
        L2c:
            return r3
        L2d:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L2f
        L2f:
            r1 = move-exception
            ig.a.i(r2, r0)
            throw r1
        L34:
            java.lang.String r2 = "Cannot buffer entire body for content length: "
            java.lang.String r0 = bc.e.g(r0, r2)
            j8.o.y(r0)
            goto L2a
    }

    public final byte[] bytes() {
            r6 = this;
            long r0 = r6.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L31
            okio.BufferedSource r2 = r6.source()
            byte[] r3 = r2.readByteArray()     // Catch: java.lang.Throwable -> L2a
            r4 = 0
            ig.a.i(r2, r4)
            int r2 = r3.length
            r4 = -1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L29
            long r4 = (long) r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L24
            goto L29
        L24:
            j8.o.c(r2, r0)
        L27:
            r0 = 0
            return r0
        L29:
            return r3
        L2a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r1 = move-exception
            ig.a.i(r2, r0)
            throw r1
        L31:
            java.lang.String r2 = "Cannot buffer entire body for content length: "
            java.lang.String r0 = bc.e.g(r0, r2)
            j8.o.y(r0)
            goto L27
    }

    public final java.io.Reader charStream() {
            r3 = this;
            java.io.Reader r0 = r3.reader
            if (r0 != 0) goto L13
            okhttp3.ResponseBody$BomAwareReader r0 = new okhttp3.ResponseBody$BomAwareReader
            okio.BufferedSource r1 = r3.source()
            java.nio.charset.Charset r2 = r3.charset()
            r0.<init>(r1, r2)
            r3.reader = r0
        L13:
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okio.BufferedSource r0 = r1.source()
            okhttp3.internal.Util.closeQuietly(r0)
            return
    }

    public abstract long contentLength();

    public abstract okhttp3.MediaType contentType();

    public abstract okio.BufferedSource source();

    public final java.lang.String string() {
            r3 = this;
            okio.BufferedSource r0 = r3.source()
            java.nio.charset.Charset r1 = r3.charset()     // Catch: java.lang.Throwable -> L15
            java.nio.charset.Charset r1 = okhttp3.internal.Util.readBomAsCharset(r0, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r0.readString(r1)     // Catch: java.lang.Throwable -> L15
            r2 = 0
            ig.a.i(r0, r2)
            return r1
        L15:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            ig.a.i(r0, r1)
            throw r2
    }
}
