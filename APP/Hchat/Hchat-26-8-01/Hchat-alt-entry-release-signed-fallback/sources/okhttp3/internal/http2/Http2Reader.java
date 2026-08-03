package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Http2Reader implements java.io.Closeable {
    public static final okhttp3.internal.http2.Http2Reader.Companion Companion = null;
    private static final java.util.logging.Logger logger = null;
    private final boolean client;
    private final okhttp3.internal.http2.Http2Reader.ContinuationSource continuation;
    private final okhttp3.internal.http2.Hpack.Reader hpackReader;
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

        public final java.util.logging.Logger getLogger() {
                r1 = this;
                java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Reader.access$getLogger$cp()
                return r0
        }

        public final int lengthWithoutPadding(int r2, int r3, int r4) {
                r1 = this;
                r3 = r3 & 8
                if (r3 == 0) goto L6
                int r2 = r2 + (-1)
            L6:
                if (r4 > r2) goto La
                int r2 = r2 - r4
                return r2
            La:
                java.lang.String r3 = "PROTOCOL_ERROR padding "
                java.lang.String r0 = " > remaining length "
                java.lang.String r2 = p.a.j(r4, r3, r0, r2)
                j8.o.y(r2)
                r2 = 0
                return r2
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class ContinuationSource implements okio.Source {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final okio.BufferedSource source;
        private int streamId;

        public ContinuationSource(okio.BufferedSource r1) {
                r0 = this;
                r1.getClass()
                r0.<init>()
                r0.source = r1
                return
        }

        private final void readContinuationHeader() {
                r9 = this;
                int r0 = r9.streamId
                okio.BufferedSource r1 = r9.source
                int r1 = okhttp3.internal.Util.readMedium(r1)
                r9.left = r1
                r9.length = r1
                okio.BufferedSource r1 = r9.source
                byte r1 = r1.readByte()
                r2 = 255(0xff, float:3.57E-43)
                int r7 = okhttp3.internal.Util.and(r1, r2)
                okio.BufferedSource r1 = r9.source
                byte r1 = r1.readByte()
                int r1 = okhttp3.internal.Util.and(r1, r2)
                r9.flags = r1
                okhttp3.internal.http2.Http2Reader$Companion r1 = okhttp3.internal.http2.Http2Reader.Companion
                java.util.logging.Logger r2 = r1.getLogger()
                java.util.logging.Level r3 = java.util.logging.Level.FINE
                boolean r2 = r2.isLoggable(r3)
                if (r2 == 0) goto L46
                java.util.logging.Logger r1 = r1.getLogger()
                okhttp3.internal.http2.Http2 r3 = okhttp3.internal.http2.Http2.INSTANCE
                int r5 = r9.streamId
                int r6 = r9.length
                int r8 = r9.flags
                r4 = 1
                java.lang.String r2 = r3.frameLog(r4, r5, r6, r7, r8)
                r1.fine(r2)
            L46:
                okio.BufferedSource r1 = r9.source
                int r1 = r1.readInt()
                r2 = 2147483647(0x7fffffff, float:NaN)
                r1 = r1 & r2
                r9.streamId = r1
                r2 = 9
                if (r7 != r2) goto L5f
                if (r1 != r0) goto L59
                return
            L59:
                java.lang.String r0 = "TYPE_CONTINUATION streamId changed"
                j8.o.y(r0)
                return
            L5f:
                java.lang.String r0 = " != TYPE_CONTINUATION"
                java.lang.String r0 = p.a.i(r7, r0)
                j8.o.y(r0)
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }

        public final int getFlags() {
                r1 = this;
                int r0 = r1.flags
                return r0
        }

        public final int getLeft() {
                r1 = this;
                int r0 = r1.left
                return r0
        }

        public final int getLength() {
                r1 = this;
                int r0 = r1.length
                return r0
        }

        public final int getPadding() {
                r1 = this;
                int r0 = r1.padding
                return r0
        }

        public final int getStreamId() {
                r1 = this;
                int r0 = r1.streamId
                return r0
        }

        @Override // okio.Source
        public long read(okio.Buffer r7, long r8) {
                r6 = this;
                r7.getClass()
            L3:
                int r0 = r6.left
                okio.BufferedSource r1 = r6.source
                r2 = -1
                if (r0 != 0) goto L1f
                int r0 = r6.padding
                long r4 = (long) r0
                r1.skip(r4)
                r0 = 0
                r6.padding = r0
                int r0 = r6.flags
                r0 = r0 & 4
                if (r0 == 0) goto L1b
                return r2
            L1b:
                r6.readContinuationHeader()
                goto L3
            L1f:
                long r4 = (long) r0
                long r8 = java.lang.Math.min(r8, r4)
                long r7 = r1.read(r7, r8)
                int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r9 != 0) goto L2d
                return r2
            L2d:
                int r9 = r6.left
                int r0 = (int) r7
                int r9 = r9 - r0
                r6.left = r9
                return r7
        }

        public final void setFlags(int r1) {
                r0 = this;
                r0.flags = r1
                return
        }

        public final void setLeft(int r1) {
                r0 = this;
                r0.left = r1
                return
        }

        public final void setLength(int r1) {
                r0 = this;
                r0.length = r1
                return
        }

        public final void setPadding(int r1) {
                r0 = this;
                r0.padding = r1
                return
        }

        public final void setStreamId(int r1) {
                r0 = this;
                r0.streamId = r1
                return
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okio.BufferedSource r0 = r1.source
                okio.Timeout r0 = r0.timeout()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Handler {
        void ackSettings();

        void alternateService(int r1, java.lang.String r2, okio.ByteString r3, java.lang.String r4, int r5, long r6);

        void data(boolean r1, int r2, okio.BufferedSource r3, int r4);

        void goAway(int r1, okhttp3.internal.http2.ErrorCode r2, okio.ByteString r3);

        void headers(boolean r1, int r2, int r3, java.util.List<okhttp3.internal.http2.Header> r4);

        void ping(boolean r1, int r2, int r3);

        void priority(int r1, int r2, int r3, boolean r4);

        void pushPromise(int r1, int r2, java.util.List<okhttp3.internal.http2.Header> r3);

        void rstStream(int r1, okhttp3.internal.http2.ErrorCode r2);

        void settings(boolean r1, okhttp3.internal.http2.Settings r2);

        void windowUpdate(int r1, long r2);
    }

    static {
            okhttp3.internal.http2.Http2Reader$Companion r0 = new okhttp3.internal.http2.Http2Reader$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2Reader.Companion = r0
            java.lang.Class<okhttp3.internal.http2.Http2> r0 = okhttp3.internal.http2.Http2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            r0.getClass()
            okhttp3.internal.http2.Http2Reader.logger = r0
            return
    }

    public Http2Reader(okio.BufferedSource r7, boolean r8) {
            r6 = this;
            r7.getClass()
            r6.<init>()
            r6.source = r7
            r6.client = r8
            okhttp3.internal.http2.Http2Reader$ContinuationSource r1 = new okhttp3.internal.http2.Http2Reader$ContinuationSource
            r1.<init>(r7)
            r6.continuation = r1
            okhttp3.internal.http2.Hpack$Reader r0 = new okhttp3.internal.http2.Hpack$Reader
            r4 = 4
            r5 = 0
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r6.hpackReader = r0
            return
    }

    public static final /* synthetic */ java.util.logging.Logger access$getLogger$cp() {
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Reader.logger
            return r0
    }

    private final void readData(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) {
            r3 = this;
            if (r7 == 0) goto L36
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = r1
        La:
            r2 = r6 & 32
            if (r2 != 0) goto L30
            r2 = r6 & 8
            if (r2 == 0) goto L1e
            okio.BufferedSource r1 = r3.source
            byte r1 = r1.readByte()
            r2 = 255(0xff, float:3.57E-43)
            int r1 = okhttp3.internal.Util.and(r1, r2)
        L1e:
            okhttp3.internal.http2.Http2Reader$Companion r2 = okhttp3.internal.http2.Http2Reader.Companion
            int r5 = r2.lengthWithoutPadding(r5, r6, r1)
            okio.BufferedSource r6 = r3.source
            r4.data(r0, r7, r6, r5)
            okio.BufferedSource r4 = r3.source
            long r5 = (long) r1
            r4.skip(r5)
            return
        L30:
            java.lang.String r4 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            j8.o.y(r4)
            return
        L36:
            java.lang.String r4 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            j8.o.y(r4)
            return
    }

    private final void readGoAway(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) {
            r3 = this;
            r6 = 8
            if (r5 < r6) goto L3a
            if (r7 != 0) goto L34
            okio.BufferedSource r7 = r3.source
            int r7 = r7.readInt()
            okio.BufferedSource r0 = r3.source
            int r0 = r0.readInt()
            int r5 = r5 - r6
            okhttp3.internal.http2.ErrorCode$Companion r6 = okhttp3.internal.http2.ErrorCode.Companion
            okhttp3.internal.http2.ErrorCode r6 = r6.fromHttp2(r0)
            if (r6 == 0) goto L2a
            okio.ByteString r0 = okio.ByteString.EMPTY
            if (r5 <= 0) goto L26
            okio.BufferedSource r0 = r3.source
            long r1 = (long) r5
            okio.ByteString r0 = r0.readByteString(r1)
        L26:
            r4.goAway(r7, r6, r0)
            return
        L2a:
            java.lang.String r4 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r4 = eh.a.l(r0, r4)
            j8.o.y(r4)
            return
        L34:
            java.lang.String r4 = "TYPE_GOAWAY streamId != 0"
            j8.o.y(r4)
            return
        L3a:
            java.lang.String r4 = "TYPE_GOAWAY length < 8: "
            java.lang.String r4 = eh.a.l(r5, r4)
            j8.o.y(r4)
            return
    }

    private final java.util.List<okhttp3.internal.http2.Header> readHeaderBlock(int r2, int r3, int r4, int r5) {
            r1 = this;
            okhttp3.internal.http2.Http2Reader$ContinuationSource r0 = r1.continuation
            r0.setLeft(r2)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            int r0 = r2.getLeft()
            r2.setLength(r0)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            r2.setPadding(r3)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            r2.setFlags(r4)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            r2.setStreamId(r5)
            okhttp3.internal.http2.Hpack$Reader r2 = r1.hpackReader
            r2.readHeaders()
            okhttp3.internal.http2.Hpack$Reader r2 = r1.hpackReader
            java.util.List r2 = r2.getAndResetHeaderList()
            return r2
    }

    private final void readHeaders(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) {
            r3 = this;
            if (r7 == 0) goto L32
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = r1
        La:
            r2 = r6 & 8
            if (r2 == 0) goto L1a
            okio.BufferedSource r1 = r3.source
            byte r1 = r1.readByte()
            r2 = 255(0xff, float:3.57E-43)
            int r1 = okhttp3.internal.Util.and(r1, r2)
        L1a:
            r2 = r6 & 32
            if (r2 == 0) goto L23
            r3.readPriority(r4, r7)
            int r5 = r5 + (-5)
        L23:
            okhttp3.internal.http2.Http2Reader$Companion r2 = okhttp3.internal.http2.Http2Reader.Companion
            int r5 = r2.lengthWithoutPadding(r5, r6, r1)
            java.util.List r5 = r3.readHeaderBlock(r5, r1, r6, r7)
            r6 = -1
            r4.headers(r0, r7, r6, r5)
            return
        L32:
            java.lang.String r4 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            j8.o.y(r4)
            return
    }

    private final void readPing(okhttp3.internal.http2.Http2Reader.Handler r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = 8
            if (r3 != r0) goto L22
            if (r5 != 0) goto L1c
            okio.BufferedSource r3 = r1.source
            int r3 = r3.readInt()
            okio.BufferedSource r5 = r1.source
            int r5 = r5.readInt()
            r0 = 1
            r4 = r4 & r0
            if (r4 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            r2.ping(r0, r3, r5)
            return
        L1c:
            java.lang.String r2 = "TYPE_PING streamId != 0"
            j8.o.y(r2)
            return
        L22:
            java.lang.String r2 = "TYPE_PING length != 8: "
            java.lang.String r2 = eh.a.l(r3, r2)
            j8.o.y(r2)
            return
    }

    private final void readPriority(okhttp3.internal.http2.Http2Reader.Handler r6, int r7) {
            r5 = this;
            okio.BufferedSource r0 = r5.source
            int r0 = r0.readInt()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            r2 = 1
            if (r1 == 0) goto Le
            r1 = r2
            goto Lf
        Le:
            r1 = 0
        Lf:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r3
            okio.BufferedSource r3 = r5.source
            byte r3 = r3.readByte()
            r4 = 255(0xff, float:3.57E-43)
            int r3 = okhttp3.internal.Util.and(r3, r4)
            int r3 = r3 + r2
            r6.priority(r7, r0, r3, r1)
            return
    }

    private final void readPriority(okhttp3.internal.http2.Http2Reader.Handler r1, int r2, int r3, int r4) {
            r0 = this;
            r3 = 5
            if (r2 != r3) goto Lf
            if (r4 == 0) goto L9
            r0.readPriority(r1, r4)
            return
        L9:
            java.lang.String r1 = "TYPE_PRIORITY streamId == 0"
            j8.o.y(r1)
            return
        Lf:
            java.lang.String r1 = "TYPE_PRIORITY length: "
            java.lang.String r3 = " != 5"
            java.lang.String r1 = eh.a.m(r2, r1, r3)
            j8.o.y(r1)
            return
    }

    private final void readPushPromise(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) {
            r3 = this;
            if (r7 == 0) goto L2e
            r0 = r6 & 8
            if (r0 == 0) goto L13
            okio.BufferedSource r0 = r3.source
            byte r0 = r0.readByte()
            r1 = 255(0xff, float:3.57E-43)
            int r0 = okhttp3.internal.Util.and(r0, r1)
            goto L14
        L13:
            r0 = 0
        L14:
            okio.BufferedSource r1 = r3.source
            int r1 = r1.readInt()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            okhttp3.internal.http2.Http2Reader$Companion r2 = okhttp3.internal.http2.Http2Reader.Companion
            int r5 = r5 + (-4)
            int r5 = r2.lengthWithoutPadding(r5, r6, r0)
            java.util.List r5 = r3.readHeaderBlock(r5, r0, r6, r7)
            r4.pushPromise(r7, r1, r5)
            return
        L2e:
            java.lang.String r4 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            j8.o.y(r4)
            return
    }

    private final void readRstStream(okhttp3.internal.http2.Http2Reader.Handler r1, int r2, int r3, int r4) {
            r0 = this;
            r3 = 4
            if (r2 != r3) goto L27
            if (r4 == 0) goto L21
            okio.BufferedSource r2 = r0.source
            int r2 = r2.readInt()
            okhttp3.internal.http2.ErrorCode$Companion r3 = okhttp3.internal.http2.ErrorCode.Companion
            okhttp3.internal.http2.ErrorCode r3 = r3.fromHttp2(r2)
            if (r3 == 0) goto L17
            r1.rstStream(r4, r3)
            return
        L17:
            java.lang.String r1 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r1 = eh.a.l(r2, r1)
            j8.o.y(r1)
            return
        L21:
            java.lang.String r1 = "TYPE_RST_STREAM streamId == 0"
            j8.o.y(r1)
            return
        L27:
            java.lang.String r1 = "TYPE_RST_STREAM length: "
            java.lang.String r3 = " != 4"
            java.lang.String r1 = eh.a.m(r2, r1, r3)
            j8.o.y(r1)
            return
    }

    private final void readSettings(okhttp3.internal.http2.Http2Reader.Handler r8, int r9, int r10, int r11) {
            r7 = this;
            if (r11 != 0) goto L93
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L12
            if (r9 != 0) goto Lc
            r8.ackSettings()
            return
        Lc:
            java.lang.String r8 = "FRAME_SIZE_ERROR ack frame should be empty!"
            j8.o.y(r8)
            return
        L12:
            int r10 = r9 % 6
            if (r10 != 0) goto L89
            okhttp3.internal.http2.Settings r10 = new okhttp3.internal.http2.Settings
            r10.<init>()
            r0 = 0
            lg.d r9 = r9.e0.r0(r0, r9)
            r1 = 6
            lg.b r9 = r9.e0.n0(r9, r1)
            int r1 = r9.f8042g
            int r2 = r9.f8043h
            int r9 = r9.f8044i
            if (r9 <= 0) goto L2f
            if (r1 <= r2) goto L33
        L2f:
            if (r9 >= 0) goto L85
            if (r2 > r1) goto L85
        L33:
            okio.BufferedSource r3 = r7.source
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = okhttp3.internal.Util.and(r3, r4)
            okio.BufferedSource r4 = r7.source
            int r4 = r4.readInt()
            r5 = 2
            if (r3 == r5) goto L73
            r5 = 3
            r6 = 4
            if (r3 == r5) goto L71
            if (r3 == r6) goto L67
            r5 = 5
            if (r3 == r5) goto L53
            goto L7e
        L53:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L5d
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L5d
            goto L7e
        L5d:
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r8 = eh.a.l(r4, r8)
            j8.o.y(r8)
            return
        L67:
            if (r4 < 0) goto L6b
            r3 = 7
            goto L7e
        L6b:
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            j8.o.y(r8)
            return
        L71:
            r3 = r6
            goto L7e
        L73:
            if (r4 == 0) goto L7e
            if (r4 != r11) goto L78
            goto L7e
        L78:
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            j8.o.y(r8)
            return
        L7e:
            r10.set(r3, r4)
            if (r1 == r2) goto L85
            int r1 = r1 + r9
            goto L33
        L85:
            r8.settings(r0, r10)
            return
        L89:
            java.lang.String r8 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r8 = eh.a.l(r9, r8)
            j8.o.y(r8)
            return
        L93:
            java.lang.String r8 = "TYPE_SETTINGS streamId != 0"
            j8.o.y(r8)
            return
    }

    private final void readWindowUpdate(okhttp3.internal.http2.Http2Reader.Handler r3, int r4, int r5, int r6) {
            r2 = this;
            r5 = 4
            if (r4 != r5) goto L20
            okio.BufferedSource r4 = r2.source
            int r4 = r4.readInt()
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = okhttp3.internal.Util.and(r4, r0)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L1a
            r3.windowUpdate(r6, r4)
            return
        L1a:
            java.lang.String r3 = "windowSizeIncrement was 0"
            j8.o.y(r3)
            return
        L20:
            java.lang.String r3 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.String r3 = eh.a.l(r4, r3)
            j8.o.y(r3)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    public final boolean nextFrame(boolean r8, okhttp3.internal.http2.Http2Reader.Handler r9) {
            r7 = this;
            r9.getClass()
            okio.BufferedSource r0 = r7.source     // Catch: java.io.EOFException -> L95
            r1 = 9
            r0.require(r1)     // Catch: java.io.EOFException -> L95
            okio.BufferedSource r0 = r7.source
            int r4 = okhttp3.internal.Util.readMedium(r0)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r4 > r0) goto L8b
            okio.BufferedSource r0 = r7.source
            byte r0 = r0.readByte()
            r1 = 255(0xff, float:3.57E-43)
            int r5 = okhttp3.internal.Util.and(r0, r1)
            okio.BufferedSource r0 = r7.source
            byte r0 = r0.readByte()
            int r6 = okhttp3.internal.Util.and(r0, r1)
            okio.BufferedSource r0 = r7.source
            int r0 = r0.readInt()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3 = r0 & r1
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Reader.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L49
            okhttp3.internal.http2.Http2 r1 = okhttp3.internal.http2.Http2.INSTANCE
            r2 = 1
            java.lang.String r1 = r1.frameLog(r2, r3, r4, r5, r6)
            r0.fine(r1)
        L49:
            if (r8 == 0) goto L5c
            r8 = 4
            if (r5 != r8) goto L4f
            goto L5c
        L4f:
            okhttp3.internal.http2.Http2 r8 = okhttp3.internal.http2.Http2.INSTANCE
            java.lang.String r8 = r8.formattedType$okhttp(r5)
            java.lang.String r9 = "Expected a SETTINGS frame but was "
            okio.a.g(r8, r9)
        L5a:
            r8 = 0
            return r8
        L5c:
            switch(r5) {
                case 0: goto L86;
                case 1: goto L82;
                case 2: goto L7e;
                case 3: goto L7a;
                case 4: goto L76;
                case 5: goto L72;
                case 6: goto L6e;
                case 7: goto L6a;
                case 8: goto L66;
                default: goto L5f;
            }
        L5f:
            okio.BufferedSource r8 = r7.source
            long r0 = (long) r4
            r8.skip(r0)
            goto L89
        L66:
            r7.readWindowUpdate(r9, r4, r6, r3)
            goto L89
        L6a:
            r7.readGoAway(r9, r4, r6, r3)
            goto L89
        L6e:
            r7.readPing(r9, r4, r6, r3)
            goto L89
        L72:
            r7.readPushPromise(r9, r4, r6, r3)
            goto L89
        L76:
            r7.readSettings(r9, r4, r6, r3)
            goto L89
        L7a:
            r7.readRstStream(r9, r4, r6, r3)
            goto L89
        L7e:
            r7.readPriority(r9, r4, r6, r3)
            goto L89
        L82:
            r7.readHeaders(r9, r4, r6, r3)
            goto L89
        L86:
            r7.readData(r9, r4, r6, r3)
        L89:
            r8 = 1
            return r8
        L8b:
            java.lang.String r8 = "FRAME_SIZE_ERROR: "
            java.lang.String r8 = eh.a.l(r4, r8)
            j8.o.y(r8)
            goto L5a
        L95:
            r8 = 0
            return r8
    }

    public final void readConnectionPreface(okhttp3.internal.http2.Http2Reader.Handler r5) {
            r4 = this;
            r5.getClass()
            boolean r0 = r4.client
            if (r0 == 0) goto L15
            r0 = 1
            boolean r5 = r4.nextFrame(r0, r5)
            if (r5 == 0) goto Lf
            goto L4e
        Lf:
            java.lang.String r5 = "Required SETTINGS preface not received"
            j8.o.y(r5)
            return
        L15:
            okio.BufferedSource r5 = r4.source
            okio.ByteString r0 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE
            int r1 = r0.size()
            long r1 = (long) r1
            okio.ByteString r5 = r5.readByteString(r1)
            java.util.logging.Logger r1 = okhttp3.internal.http2.Http2Reader.logger
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            boolean r2 = r1.isLoggable(r2)
            if (r2 == 0) goto L48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "<< CONNECTION "
            r2.<init>(r3)
            java.lang.String r3 = r5.hex()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = okhttp3.internal.Util.format(r2, r3)
            r1.fine(r2)
        L48:
            boolean r0 = gg.l.a(r0, r5)
            if (r0 == 0) goto L4f
        L4e:
            return
        L4f:
            java.lang.String r0 = "Expected a connection header but was "
            java.lang.String r5 = r5.utf8()
            okio.a.g(r5, r0)
            return
    }
}
