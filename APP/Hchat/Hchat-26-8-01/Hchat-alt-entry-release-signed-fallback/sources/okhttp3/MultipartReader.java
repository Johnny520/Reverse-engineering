package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MultipartReader implements java.io.Closeable {
    public static final okhttp3.MultipartReader.Companion Companion = null;
    private static final okio.Options afterBoundaryOptions = null;
    private final java.lang.String boundary;
    private boolean closed;
    private final okio.ByteString crlfDashDashBoundary;
    private okhttp3.MultipartReader.PartSource currentPart;
    private final okio.ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final okio.BufferedSource source;

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

        public final okio.Options getAfterBoundaryOptions() {
                r1 = this;
                okio.Options r0 = okhttp3.MultipartReader.access$getAfterBoundaryOptions$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Part implements java.io.Closeable {
        private final okio.BufferedSource body;
        private final okhttp3.Headers headers;

        public Part(okhttp3.Headers r1, okio.BufferedSource r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r0.<init>()
                r0.headers = r1
                r0.body = r2
                return
        }

        public final okio.BufferedSource body() {
                r1 = this;
                okio.BufferedSource r0 = r1.body
                return r0
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                okio.BufferedSource r0 = r1.body
                r0.close()
                return
        }

        public final okhttp3.Headers headers() {
                r1 = this;
                okhttp3.Headers r0 = r1.headers
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class PartSource implements okio.Source {
        final /* synthetic */ okhttp3.MultipartReader this$0;
        private final okio.Timeout timeout;

        public PartSource(okhttp3.MultipartReader r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                okio.Timeout r1 = new okio.Timeout
                r1.<init>()
                r0.timeout = r1
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r2 = this;
                okhttp3.MultipartReader r0 = r2.this$0
                okhttp3.MultipartReader$PartSource r0 = okhttp3.MultipartReader.access$getCurrentPart$p(r0)
                boolean r0 = gg.l.a(r0, r2)
                if (r0 == 0) goto L12
                okhttp3.MultipartReader r0 = r2.this$0
                r1 = 0
                okhttp3.MultipartReader.access$setCurrentPart$p(r0, r1)
            L12:
                return
        }

        @Override // okio.Source
        public long read(okio.Buffer r19, long r20) {
                r18 = this;
                r1 = r18
                r0 = r19
                r2 = r20
                r0.getClass()
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto Ld7
                okhttp3.MultipartReader r6 = r1.this$0
                okhttp3.MultipartReader$PartSource r6 = okhttp3.MultipartReader.access$getCurrentPart$p(r6)
                boolean r6 = gg.l.a(r6, r1)
                if (r6 == 0) goto Lcf
                okhttp3.MultipartReader r6 = r1.this$0
                okio.BufferedSource r6 = okhttp3.MultipartReader.access$getSource$p(r6)
                okio.Timeout r6 = r6.timeout()
                okio.Timeout r7 = r1.timeout
                okhttp3.MultipartReader r8 = r1.this$0
                long r9 = r6.timeoutNanos()
                okio.Timeout$Companion r11 = okio.Timeout.Companion
                long r12 = r7.timeoutNanos()
                long r14 = r6.timeoutNanos()
                long r11 = r11.minTimeout(r12, r14)
                java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS
                r6.timeout(r11, r13)
                boolean r11 = r6.hasDeadline()
                if (r11 == 0) goto L92
                long r11 = r6.deadlineNanoTime()
                boolean r16 = r7.hasDeadline()
                if (r16 == 0) goto L62
                r16 = r4
                long r4 = r6.deadlineNanoTime()
                long r14 = r7.deadlineNanoTime()
                long r4 = java.lang.Math.min(r4, r14)
                r6.deadlineNanoTime(r4)
                goto L64
            L62:
                r16 = r4
            L64:
                long r2 = okhttp3.MultipartReader.access$currentPartBytesRemaining(r8, r2)     // Catch: java.lang.Throwable -> L84
                int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r4 != 0) goto L6f
                r14 = -1
                goto L77
            L6f:
                okio.BufferedSource r4 = okhttp3.MultipartReader.access$getSource$p(r8)     // Catch: java.lang.Throwable -> L84
                long r14 = r4.read(r0, r2)     // Catch: java.lang.Throwable -> L84
            L77:
                r6.timeout(r9, r13)
                boolean r0 = r7.hasDeadline()
                if (r0 == 0) goto L83
                r6.deadlineNanoTime(r11)
            L83:
                return r14
            L84:
                r0 = move-exception
                r6.timeout(r9, r13)
                boolean r2 = r7.hasDeadline()
                if (r2 == 0) goto L91
                r6.deadlineNanoTime(r11)
            L91:
                throw r0
            L92:
                r16 = r4
                boolean r4 = r7.hasDeadline()
                if (r4 == 0) goto La1
                long r4 = r7.deadlineNanoTime()
                r6.deadlineNanoTime(r4)
            La1:
                long r2 = okhttp3.MultipartReader.access$currentPartBytesRemaining(r8, r2)     // Catch: java.lang.Throwable -> Lc1
                int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r4 != 0) goto Lac
                r14 = -1
                goto Lb4
            Lac:
                okio.BufferedSource r4 = okhttp3.MultipartReader.access$getSource$p(r8)     // Catch: java.lang.Throwable -> Lc1
                long r14 = r4.read(r0, r2)     // Catch: java.lang.Throwable -> Lc1
            Lb4:
                r6.timeout(r9, r13)
                boolean r0 = r7.hasDeadline()
                if (r0 == 0) goto Lc0
                r6.clearDeadline()
            Lc0:
                return r14
            Lc1:
                r0 = move-exception
                r6.timeout(r9, r13)
                boolean r2 = r7.hasDeadline()
                if (r2 == 0) goto Lce
                r6.clearDeadline()
            Lce:
                throw r0
            Lcf:
                java.lang.String r0 = "closed"
                j8.o.A(r0)
            Ld4:
                r2 = 0
                return r2
            Ld7:
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r0 = bc.e.g(r2, r0)
                j8.o.q(r0)
                goto Ld4
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = r1.timeout
                return r0
        }
    }

    static {
            okhttp3.MultipartReader$Companion r0 = new okhttp3.MultipartReader$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.MultipartReader.Companion = r0
            okio.Options$Companion r0 = okio.Options.Companion
            okio.ByteString$Companion r1 = okio.ByteString.Companion
            java.lang.String r2 = "\r\n"
            okio.ByteString r2 = r1.encodeUtf8(r2)
            java.lang.String r3 = "--"
            okio.ByteString r3 = r1.encodeUtf8(r3)
            java.lang.String r4 = " "
            okio.ByteString r4 = r1.encodeUtf8(r4)
            java.lang.String r5 = "\t"
            okio.ByteString r1 = r1.encodeUtf8(r5)
            okio.ByteString[] r1 = new okio.ByteString[]{r2, r3, r4, r1}
            okio.Options r0 = r0.of(r1)
            okhttp3.MultipartReader.afterBoundaryOptions = r0
            return
    }

    public MultipartReader(okhttp3.ResponseBody r3) {
            r2 = this;
            r3.getClass()
            okio.BufferedSource r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L19
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L19
            r2.<init>(r0, r3)
            return
        L19:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
    }

    public MultipartReader(okio.BufferedSource r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r1.<init>()
            r1.source = r2
            r1.boundary = r3
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            java.lang.String r0 = "--"
            okio.Buffer r2 = r2.writeUtf8(r0)
            okio.Buffer r2 = r2.writeUtf8(r3)
            okio.ByteString r2 = r2.readByteString()
            r1.dashDashBoundary = r2
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            java.lang.String r0 = "\r\n--"
            okio.Buffer r2 = r2.writeUtf8(r0)
            okio.Buffer r2 = r2.writeUtf8(r3)
            okio.ByteString r2 = r2.readByteString()
            r1.crlfDashDashBoundary = r2
            return
    }

    public static final /* synthetic */ long access$currentPartBytesRemaining(okhttp3.MultipartReader r0, long r1) {
            long r0 = r0.currentPartBytesRemaining(r1)
            return r0
    }

    public static final /* synthetic */ okio.Options access$getAfterBoundaryOptions$cp() {
            okio.Options r0 = okhttp3.MultipartReader.afterBoundaryOptions
            return r0
    }

    public static final /* synthetic */ okhttp3.MultipartReader.PartSource access$getCurrentPart$p(okhttp3.MultipartReader r0) {
            okhttp3.MultipartReader$PartSource r0 = r0.currentPart
            return r0
    }

    public static final /* synthetic */ okio.BufferedSource access$getSource$p(okhttp3.MultipartReader r0) {
            okio.BufferedSource r0 = r0.source
            return r0
    }

    public static final /* synthetic */ void access$setCurrentPart$p(okhttp3.MultipartReader r0, okhttp3.MultipartReader.PartSource r1) {
            r0.currentPart = r1
            return
    }

    private final long currentPartBytesRemaining(long r5) {
            r4 = this;
            okio.BufferedSource r0 = r4.source
            okio.ByteString r1 = r4.crlfDashDashBoundary
            int r1 = r1.size()
            long r1 = (long) r1
            r0.require(r1)
            okio.BufferedSource r0 = r4.source
            okio.Buffer r0 = r0.getBuffer()
            okio.ByteString r1 = r4.crlfDashDashBoundary
            long r0 = r0.indexOf(r1)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L38
            okio.BufferedSource r0 = r4.source
            okio.Buffer r0 = r0.getBuffer()
            long r0 = r0.size()
            okio.ByteString r2 = r4.crlfDashDashBoundary
            int r2 = r2.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            long r5 = java.lang.Math.min(r5, r0)
            return r5
        L38:
            long r5 = java.lang.Math.min(r5, r0)
            return r5
    }

    public final java.lang.String boundary() {
            r1 = this;
            java.lang.String r0 = r1.boundary
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.closed = r0
            r0 = 0
            r1.currentPart = r0
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    public final okhttp3.MultipartReader.Part nextPart() {
            r7 = this;
            boolean r0 = r7.closed
            if (r0 != 0) goto L9b
            boolean r0 = r7.noMoreParts
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            int r0 = r7.partCount
            r2 = 0
            if (r0 != 0) goto L27
            okio.BufferedSource r0 = r7.source
            okio.ByteString r4 = r7.dashDashBoundary
            boolean r0 = r0.rangeEquals(r2, r4)
            if (r0 == 0) goto L27
            okio.BufferedSource r0 = r7.source
            okio.ByteString r2 = r7.dashDashBoundary
            int r2 = r2.size()
            long r2 = (long) r2
            r0.skip(r2)
            goto L41
        L27:
            r4 = 8192(0x2000, double:4.0474E-320)
            long r4 = r7.currentPartBytesRemaining(r4)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            okio.BufferedSource r6 = r7.source
            if (r0 == 0) goto L37
            r6.skip(r4)
            goto L27
        L37:
            okio.ByteString r0 = r7.crlfDashDashBoundary
            int r0 = r0.size()
            long r2 = (long) r0
            r6.skip(r2)
        L41:
            r0 = 0
        L42:
            okio.BufferedSource r2 = r7.source
            okio.Options r3 = okhttp3.MultipartReader.afterBoundaryOptions
            int r2 = r2.select(r3)
            r3 = -1
            java.lang.String r4 = "unexpected characters after boundary"
            if (r2 == r3) goto L95
            r3 = 1
            if (r2 == 0) goto L74
            if (r2 == r3) goto L5d
            r4 = 2
            if (r2 == r4) goto L5b
            r4 = 3
            if (r2 == r4) goto L5b
            goto L42
        L5b:
            r0 = r3
            goto L42
        L5d:
            if (r0 != 0) goto L6e
            int r0 = r7.partCount
            if (r0 == 0) goto L66
            r7.noMoreParts = r3
            return r1
        L66:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "expected at least 1 part"
            r0.<init>(r1)
            throw r0
        L6e:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r4)
            throw r0
        L74:
            int r0 = r7.partCount
            int r0 = r0 + r3
            r7.partCount = r0
            okhttp3.internal.http1.HeadersReader r0 = new okhttp3.internal.http1.HeadersReader
            okio.BufferedSource r1 = r7.source
            r0.<init>(r1)
            okhttp3.Headers r0 = r0.readHeaders()
            okhttp3.MultipartReader$PartSource r1 = new okhttp3.MultipartReader$PartSource
            r1.<init>(r7)
            r7.currentPart = r1
            okhttp3.MultipartReader$Part r2 = new okhttp3.MultipartReader$Part
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            r2.<init>(r0, r1)
            return r2
        L95:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r4)
            throw r0
        L9b:
            java.lang.String r0 = "closed"
            j8.o.A(r0)
            r0 = 0
            return r0
    }
}
