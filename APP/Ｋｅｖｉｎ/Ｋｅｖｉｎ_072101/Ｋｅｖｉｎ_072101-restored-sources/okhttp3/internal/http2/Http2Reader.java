package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2Reader.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 #2\u00020\u0001:\u0003#$%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010 \u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010!\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m115d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "source", "Lokio/BufferedSource;", "client", "", "(Lokio/BufferedSource;Z)V", "continuation", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "hpackReader", "Lokhttp3/internal/http2/Hpack$Reader;", "close", "", "nextFrame", "requireSettings", "handler", "Lokhttp3/internal/http2/Http2Reader$Handler;", "readConnectionPreface", "readData", "length", "", "flags", "streamId", "readGoAway", "readHeaderBlock", "", "Lokhttp3/internal/http2/Header;", "padding", "readHeaders", "readPing", "readPriority", "readPushPromise", "readRstStream", "readSettings", "readWindowUpdate", "Companion", "ContinuationSource", "Handler", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class Http2Reader implements java.io.Closeable {
    public static final okhttp3.internal.http2.Http2Reader.Companion Companion = null;
    private static final java.util.logging.Logger logger = null;
    private final boolean client;
    private final okhttp3.internal.http2.Http2Reader.ContinuationSource continuation;
    private final okhttp3.internal.http2.Hpack.Reader hpackReader;
    private final okio.BufferedSource source;

    /* JADX INFO: compiled from: Http2Reader.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m115d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "lengthWithoutPadding", "", "length", "flags", "padding", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.util.logging.Logger getLogger() {
                r1 = this;
                java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Reader.access$getLogger$cp()
                return r0
        }

        public final int lengthWithoutPadding(int r5, int r6, int r7) throws java.io.IOException {
                r4 = this;
                r0 = r5
                r1 = r6 & 8
                if (r1 == 0) goto L7
                int r0 = r0 + (-1)
            L7:
                if (r7 > r0) goto Lb
                int r0 = r0 - r7
                return r0
            Lb:
                java.io.IOException r1 = new java.io.IOException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "PROTOCOL_ERROR padding "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r7)
                java.lang.String r3 = " > remaining length "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }
    }

    /* JADX INFO: compiled from: Http2Reader.kt */
    @kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006!"}, m115d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokio/Source;", "source", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)V", "flags", "", "getFlags", "()I", "setFlags", "(I)V", "left", "getLeft", "setLeft", "length", "getLength", "setLength", "padding", "getPadding", "setPadding", "streamId", "getStreamId", "setStreamId", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "readContinuationHeader", "timeout", "Lokio/Timeout;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class ContinuationSource implements okio.Source {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final okio.BufferedSource source;
        private int streamId;

        public ContinuationSource(okio.BufferedSource r2) {
                r1 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.source = r2
                return
        }

        private final void readContinuationHeader() throws java.io.IOException {
                r9 = this;
                int r0 = r9.streamId
                okio.BufferedSource r1 = r9.source
                int r1 = okhttp3.internal.Util.readMedium(r1)
                r9.left = r1
                int r1 = r9.left
                r9.length = r1
                okio.BufferedSource r1 = r9.source
                byte r1 = r1.readByte()
                r2 = 255(0xff, float:3.57E-43)
                int r1 = okhttp3.internal.Util.and(r1, r2)
                okio.BufferedSource r3 = r9.source
                byte r3 = r3.readByte()
                int r2 = okhttp3.internal.Util.and(r3, r2)
                r9.flags = r2
                okhttp3.internal.http2.Http2Reader$Companion r2 = okhttp3.internal.http2.Http2Reader.Companion
                java.util.logging.Logger r2 = r2.getLogger()
                java.util.logging.Level r3 = java.util.logging.Level.FINE
                boolean r2 = r2.isLoggable(r3)
                if (r2 == 0) goto L4b
                okhttp3.internal.http2.Http2Reader$Companion r2 = okhttp3.internal.http2.Http2Reader.Companion
                java.util.logging.Logger r2 = r2.getLogger()
                okhttp3.internal.http2.Http2 r3 = okhttp3.internal.http2.Http2.INSTANCE
                int r5 = r9.streamId
                int r6 = r9.length
                int r8 = r9.flags
                r4 = 1
                r7 = r1
                java.lang.String r3 = r3.frameLog(r4, r5, r6, r7, r8)
                r2.fine(r3)
            L4b:
                okio.BufferedSource r2 = r9.source
                int r2 = r2.readInt()
                r3 = 2147483647(0x7fffffff, float:NaN)
                r2 = r2 & r3
                r9.streamId = r2
                r2 = 9
                if (r1 != r2) goto L68
                int r2 = r9.streamId
                if (r2 != r0) goto L60
                return
            L60:
                java.io.IOException r2 = new java.io.IOException
                java.lang.String r3 = "TYPE_CONTINUATION streamId changed"
                r2.<init>(r3)
                throw r2
            L68:
                java.io.IOException r2 = new java.io.IOException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r1)
                java.lang.String r4 = " != TYPE_CONTINUATION"
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
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
        public long read(okio.Buffer r6, long r7) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            L5:
                int r0 = r5.left
                r1 = -1
                if (r0 != 0) goto L21
                okio.BufferedSource r0 = r5.source
                int r3 = r5.padding
                long r3 = (long) r3
                r0.skip(r3)
                r0 = 0
                r5.padding = r0
                int r0 = r5.flags
                r0 = r0 & 4
                if (r0 == 0) goto L1d
                return r1
            L1d:
                r5.readContinuationHeader()
                goto L5
            L21:
                okio.BufferedSource r0 = r5.source
                int r3 = r5.left
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r7, r3)
                long r3 = r0.read(r6, r3)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 != 0) goto L33
                return r1
            L33:
                int r0 = r5.left
                int r1 = (int) r3
                int r0 = r0 - r1
                r5.left = r0
                return r3
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

    /* JADX INFO: compiled from: Http2Reader.kt */
    @kotlin.Metadata(m114d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J8\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J(\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H&J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH&J.\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H&J(\u0010#\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0011H&J&\u0010'\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020-H&J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u000eH&¨\u00060"}, m115d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "ackSettings", "", "alternateService", "streamId", "", "origin", "", "protocol", "Lokio/ByteString;", "host", "port", "maxAge", "", "data", "inFinished", "", "source", "Lokio/BufferedSource;", "length", "goAway", "lastGoodStreamId", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "debugData", "headers", "associatedStreamId", "headerBlock", "", "Lokhttp3/internal/http2/Header;", "ping", "ack", "payload1", "payload2", "priority", "streamDependency", "weight", "exclusive", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "settings", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "windowUpdate", "windowSizeIncrement", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public interface Handler {
        void ackSettings();

        void alternateService(int r1, java.lang.String r2, okio.ByteString r3, java.lang.String r4, int r5, long r6);

        void data(boolean r1, int r2, okio.BufferedSource r3, int r4) throws java.io.IOException;

        void goAway(int r1, okhttp3.internal.http2.ErrorCode r2, okio.ByteString r3);

        void headers(boolean r1, int r2, int r3, java.util.List<okhttp3.internal.http2.Header> r4);

        void ping(boolean r1, int r2, int r3);

        void priority(int r1, int r2, int r3, boolean r4);

        void pushPromise(int r1, int r2, java.util.List<okhttp3.internal.http2.Header> r3) throws java.io.IOException;

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
            java.lang.String r1 = "getLogger(Http2::class.java.name)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            okhttp3.internal.http2.Http2Reader.logger = r0
            return
    }

    public Http2Reader(okio.BufferedSource r9, boolean r10) {
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r8.<init>()
            r8.source = r9
            r8.client = r10
            okhttp3.internal.http2.Http2Reader$ContinuationSource r0 = new okhttp3.internal.http2.Http2Reader$ContinuationSource
            okio.BufferedSource r1 = r8.source
            r0.<init>(r1)
            r8.continuation = r0
            okhttp3.internal.http2.Hpack$Reader r0 = new okhttp3.internal.http2.Hpack$Reader
            okhttp3.internal.http2.Http2Reader$ContinuationSource r1 = r8.continuation
            r3 = r1
            okio.Source r3 = (okio.Source) r3
            r6 = 4
            r7 = 0
            r4 = 4096(0x1000, float:5.74E-42)
            r5 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r8.hpackReader = r0
            return
    }

    public static final /* synthetic */ java.util.logging.Logger access$getLogger$cp() {
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Reader.logger
            return r0
    }

    private final void readData(okhttp3.internal.http2.Http2Reader.Handler r8, int r9, int r10, int r11) throws java.io.IOException {
            r7 = this;
            if (r11 == 0) goto L3d
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            r3 = r10 & 32
            if (r3 == 0) goto L10
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 != 0) goto L35
            r3 = r10 & 8
            if (r3 == 0) goto L23
            okio.BufferedSource r1 = r7.source
            byte r1 = r1.readByte()
            r3 = 255(0xff, float:3.57E-43)
            int r1 = okhttp3.internal.Util.and(r1, r3)
        L23:
            okhttp3.internal.http2.Http2Reader$Companion r3 = okhttp3.internal.http2.Http2Reader.Companion
            int r3 = r3.lengthWithoutPadding(r9, r10, r1)
            okio.BufferedSource r4 = r7.source
            r8.data(r0, r11, r4, r3)
            okio.BufferedSource r4 = r7.source
            long r5 = (long) r1
            r4.skip(r5)
            return
        L35:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r3 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r1.<init>(r3)
            throw r1
        L3d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r0.<init>(r1)
            throw r0
    }

    private final void readGoAway(okhttp3.internal.http2.Http2Reader.Handler r9, int r10, int r11, int r12) throws java.io.IOException {
            r8 = this;
            r0 = 8
            if (r10 < r0) goto L4c
            if (r12 != 0) goto L44
            okio.BufferedSource r0 = r8.source
            int r0 = r0.readInt()
            okio.BufferedSource r1 = r8.source
            int r1 = r1.readInt()
            int r2 = r10 + (-8)
            okhttp3.internal.http2.ErrorCode$Companion r3 = okhttp3.internal.http2.ErrorCode.Companion
            okhttp3.internal.http2.ErrorCode r3 = r3.fromHttp2(r1)
            if (r3 == 0) goto L2b
            okio.ByteString r4 = okio.ByteString.EMPTY
            if (r2 <= 0) goto L27
            okio.BufferedSource r5 = r8.source
            long r6 = (long) r2
            okio.ByteString r4 = r5.readByteString(r6)
        L27:
            r9.goAway(r0, r3, r4)
            return
        L2b:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "TYPE_GOAWAY unexpected error code: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L44:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "TYPE_GOAWAY streamId != 0"
            r0.<init>(r1)
            throw r0
        L4c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TYPE_GOAWAY length < 8: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final java.util.List<okhttp3.internal.http2.Header> readHeaderBlock(int r3, int r4, int r5, int r6) throws java.io.IOException {
            r2 = this;
            okhttp3.internal.http2.Http2Reader$ContinuationSource r0 = r2.continuation
            r0.setLeft(r3)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r0 = r2.continuation
            okhttp3.internal.http2.Http2Reader$ContinuationSource r1 = r2.continuation
            int r1 = r1.getLeft()
            r0.setLength(r1)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r0 = r2.continuation
            r0.setPadding(r4)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r0 = r2.continuation
            r0.setFlags(r5)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r0 = r2.continuation
            r0.setStreamId(r6)
            okhttp3.internal.http2.Hpack$Reader r0 = r2.hpackReader
            r0.readHeaders()
            okhttp3.internal.http2.Hpack$Reader r0 = r2.hpackReader
            java.util.List r0 = r0.getAndResetHeaderList()
            return r0
    }

    private final void readHeaders(okhttp3.internal.http2.Http2Reader.Handler r6, int r7, int r8, int r9) throws java.io.IOException {
            r5 = this;
            if (r9 == 0) goto L34
            r0 = r8 & 1
            r1 = 0
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = r1
        La:
            r2 = r8 & 8
            if (r2 == 0) goto L1a
            okio.BufferedSource r1 = r5.source
            byte r1 = r1.readByte()
            r2 = 255(0xff, float:3.57E-43)
            int r1 = okhttp3.internal.Util.and(r1, r2)
        L1a:
            r2 = r7
            r3 = r8 & 32
            if (r3 == 0) goto L25
            r5.readPriority(r6, r9)
            int r2 = r2 + (-5)
        L25:
            okhttp3.internal.http2.Http2Reader$Companion r3 = okhttp3.internal.http2.Http2Reader.Companion
            int r2 = r3.lengthWithoutPadding(r2, r8, r1)
            java.util.List r3 = r5.readHeaderBlock(r2, r1, r8, r9)
            r4 = -1
            r6.headers(r0, r9, r4, r3)
            return
        L34:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r0.<init>(r1)
            throw r0
    }

    private final void readPing(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            r0 = 8
            if (r5 != r0) goto L25
            if (r7 != 0) goto L1d
            okio.BufferedSource r0 = r3.source
            int r0 = r0.readInt()
            okio.BufferedSource r1 = r3.source
            int r1 = r1.readInt()
            r2 = r6 & 1
            if (r2 == 0) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            r4.ping(r2, r0, r1)
            return
        L1d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "TYPE_PING streamId != 0"
            r0.<init>(r1)
            throw r0
        L25:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TYPE_PING length != 8: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final void readPriority(okhttp3.internal.http2.Http2Reader.Handler r7, int r8) throws java.io.IOException {
            r6 = this;
            okio.BufferedSource r0 = r6.source
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
            r3 = r3 & r0
            okio.BufferedSource r4 = r6.source
            byte r4 = r4.readByte()
            r5 = 255(0xff, float:3.57E-43)
            int r4 = okhttp3.internal.Util.and(r4, r5)
            int r4 = r4 + r2
            r7.priority(r8, r3, r4, r1)
            return
    }

    private final void readPriority(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            r0 = 5
            if (r5 != r0) goto L11
            if (r7 == 0) goto L9
            r3.readPriority(r4, r7)
            return
        L9:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "TYPE_PRIORITY streamId == 0"
            r0.<init>(r1)
            throw r0
        L11:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TYPE_PRIORITY length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = " != 5"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final void readPushPromise(okhttp3.internal.http2.Http2Reader.Handler r5, int r6, int r7, int r8) throws java.io.IOException {
            r4 = this;
            if (r8 == 0) goto L2e
            r0 = r7 & 8
            if (r0 == 0) goto L13
            okio.BufferedSource r0 = r4.source
            byte r0 = r0.readByte()
            r1 = 255(0xff, float:3.57E-43)
            int r0 = okhttp3.internal.Util.and(r0, r1)
            goto L14
        L13:
            r0 = 0
        L14:
            okio.BufferedSource r1 = r4.source
            int r1 = r1.readInt()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            okhttp3.internal.http2.Http2Reader$Companion r2 = okhttp3.internal.http2.Http2Reader.Companion
            int r3 = r6 + (-4)
            int r2 = r2.lengthWithoutPadding(r3, r7, r0)
            java.util.List r3 = r4.readHeaderBlock(r2, r0, r7, r8)
            r5.pushPromise(r8, r1, r3)
            return
        L2e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r0.<init>(r1)
            throw r0
    }

    private final void readRstStream(okhttp3.internal.http2.Http2Reader.Handler r5, int r6, int r7, int r8) throws java.io.IOException {
            r4 = this;
            r0 = 4
            if (r6 != r0) goto L38
            if (r8 == 0) goto L30
            okio.BufferedSource r0 = r4.source
            int r0 = r0.readInt()
            okhttp3.internal.http2.ErrorCode$Companion r1 = okhttp3.internal.http2.ErrorCode.Companion
            okhttp3.internal.http2.ErrorCode r1 = r1.fromHttp2(r0)
            if (r1 == 0) goto L17
            r5.rstStream(r8, r1)
            return
        L17:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L30:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "TYPE_RST_STREAM streamId == 0"
            r0.<init>(r1)
            throw r0
        L38:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TYPE_RST_STREAM length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " != 4"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final void readSettings(okhttp3.internal.http2.Http2Reader.Handler r9, int r10, int r11, int r12) throws java.io.IOException {
            r8 = this;
            if (r12 != 0) goto Lb7
            r0 = r11 & 1
            if (r0 == 0) goto L14
            if (r10 != 0) goto Lc
            r9.ackSettings()
            return
        Lc:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r0.<init>(r1)
            throw r0
        L14:
            int r0 = r10 % 6
            if (r0 != 0) goto L9e
            okhttp3.internal.http2.Settings r0 = new okhttp3.internal.http2.Settings
            r0.<init>()
            r1 = 0
            kotlin.ranges.IntRange r2 = kotlin.ranges.RangesKt.until(r1, r10)
            kotlin.ranges.IntProgression r2 = (kotlin.ranges.IntProgression) r2
            r3 = 6
            kotlin.ranges.IntProgression r2 = kotlin.ranges.RangesKt.step(r2, r3)
            int r3 = r2.getFirst()
            int r4 = r2.getLast()
            int r2 = r2.getStep()
            if (r2 <= 0) goto L39
            if (r3 <= r4) goto L3d
        L39:
            if (r2 >= 0) goto L9a
            if (r4 > r3) goto L9a
        L3d:
            okio.BufferedSource r5 = r8.source
            short r5 = r5.readShort()
            r6 = 65535(0xffff, float:9.1834E-41)
            int r5 = okhttp3.internal.Util.and(r5, r6)
            okio.BufferedSource r6 = r8.source
            int r6 = r6.readInt()
            switch(r5) {
                case 1: goto L53;
                case 2: goto L85;
                case 3: goto L83;
                case 4: goto L77;
                case 5: goto L54;
                default: goto L53;
            }
        L53:
            goto L93
        L54:
            r7 = 16384(0x4000, float:2.2959E-41)
            if (r6 < r7) goto L5e
            r7 = 16777215(0xffffff, float:2.3509886E-38)
            if (r6 > r7) goto L5e
            goto L93
        L5e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L77:
            r5 = 7
            if (r6 < 0) goto L7b
            goto L93
        L7b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r1.<init>(r2)
            throw r1
        L83:
            r5 = 4
            goto L93
        L85:
            if (r6 == 0) goto L93
            r7 = 1
            if (r6 != r7) goto L8b
            goto L93
        L8b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r1.<init>(r2)
            throw r1
        L93:
            r0.set(r5, r6)
            if (r3 == r4) goto L9a
            int r3 = r3 + r2
            goto L3d
        L9a:
            r9.settings(r1, r0)
            return
        L9e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lb7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "TYPE_SETTINGS streamId != 0"
            r0.<init>(r1)
            throw r0
    }

    private final void readWindowUpdate(okhttp3.internal.http2.Http2Reader.Handler r5, int r6, int r7, int r8) throws java.io.IOException {
            r4 = this;
            r0 = 4
            if (r6 != r0) goto L22
            okio.BufferedSource r0 = r4.source
            int r0 = r0.readInt()
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = okhttp3.internal.Util.and(r0, r1)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r5.windowUpdate(r8, r0)
            return
        L1a:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "windowSizeIncrement was 0"
            r2.<init>(r3)
            throw r2
        L22:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    public final boolean nextFrame(boolean r12, okhttp3.internal.http2.Http2Reader.Handler r13) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "handler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            okio.BufferedSource r0 = r11.source     // Catch: java.io.EOFException -> Lbf
            r1 = 9
            r0.require(r1)     // Catch: java.io.EOFException -> Lbf
            okio.BufferedSource r0 = r11.source
            int r0 = okhttp3.internal.Util.readMedium(r0)
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 > r1) goto La6
            okio.BufferedSource r1 = r11.source
            byte r1 = r1.readByte()
            r2 = 255(0xff, float:3.57E-43)
            int r7 = okhttp3.internal.Util.and(r1, r2)
            okio.BufferedSource r1 = r11.source
            byte r1 = r1.readByte()
            int r8 = okhttp3.internal.Util.and(r1, r2)
            okio.BufferedSource r1 = r11.source
            int r1 = r1.readInt()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r9 = r1 & r2
            java.util.logging.Logger r1 = okhttp3.internal.http2.Http2Reader.logger
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            boolean r1 = r1.isLoggable(r2)
            if (r1 == 0) goto L52
            java.util.logging.Logger r10 = okhttp3.internal.http2.Http2Reader.logger
            okhttp3.internal.http2.Http2 r1 = okhttp3.internal.http2.Http2.INSTANCE
            r2 = 1
            r3 = r9
            r4 = r0
            r5 = r7
            r6 = r8
            java.lang.String r1 = r1.frameLog(r2, r3, r4, r5, r6)
            r10.fine(r1)
        L52:
            if (r12 == 0) goto L77
            r1 = 4
            if (r7 != r1) goto L58
            goto L77
        L58:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a SETTINGS frame but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            okhttp3.internal.http2.Http2 r3 = okhttp3.internal.http2.Http2.INSTANCE
            java.lang.String r3 = r3.formattedType$okhttp(r7)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L77:
            switch(r7) {
                case 0: goto La1;
                case 1: goto L9d;
                case 2: goto L99;
                case 3: goto L95;
                case 4: goto L91;
                case 5: goto L8d;
                case 6: goto L89;
                case 7: goto L85;
                case 8: goto L81;
                default: goto L7a;
            }
        L7a:
            okio.BufferedSource r1 = r11.source
            long r2 = (long) r0
            r1.skip(r2)
            goto La4
        L81:
            r11.readWindowUpdate(r13, r0, r8, r9)
            goto La4
        L85:
            r11.readGoAway(r13, r0, r8, r9)
            goto La4
        L89:
            r11.readPing(r13, r0, r8, r9)
            goto La4
        L8d:
            r11.readPushPromise(r13, r0, r8, r9)
            goto La4
        L91:
            r11.readSettings(r13, r0, r8, r9)
            goto La4
        L95:
            r11.readRstStream(r13, r0, r8, r9)
            goto La4
        L99:
            r11.readPriority(r13, r0, r8, r9)
            goto La4
        L9d:
            r11.readHeaders(r13, r0, r8, r9)
            goto La4
        La1:
            r11.readData(r13, r0, r8, r9)
        La4:
            r1 = 1
            return r1
        La6:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "FRAME_SIZE_ERROR: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        Lbf:
            r0 = move-exception
            r1 = 0
            return r1
    }

    public final void readConnectionPreface(okhttp3.internal.http2.Http2Reader.Handler r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "handler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.client
            if (r0 == 0) goto L19
            r0 = 1
            boolean r0 = r4.nextFrame(r0, r5)
            if (r0 == 0) goto L11
            goto L5b
        L11:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Required SETTINGS preface not received"
            r0.<init>(r1)
            throw r0
        L19:
            okio.BufferedSource r0 = r4.source
            okio.ByteString r1 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE
            int r1 = r1.size()
            long r1 = (long) r1
            okio.ByteString r0 = r0.readByteString(r1)
            java.util.logging.Logger r1 = okhttp3.internal.http2.Http2Reader.logger
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            boolean r1 = r1.isLoggable(r2)
            if (r1 == 0) goto L53
            java.util.logging.Logger r1 = okhttp3.internal.http2.Http2Reader.logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "<< CONNECTION "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r0.hex()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = okhttp3.internal.Util.format(r2, r3)
            r1.fine(r2)
        L53:
            okio.ByteString r1 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r1 == 0) goto L5c
        L5b:
            return
        L5c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a connection header but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r0.utf8()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
