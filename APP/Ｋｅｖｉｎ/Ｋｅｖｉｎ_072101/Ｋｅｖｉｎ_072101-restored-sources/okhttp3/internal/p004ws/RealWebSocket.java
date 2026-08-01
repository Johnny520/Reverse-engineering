package okhttp3.internal.p004ws;

/* JADX INFO: compiled from: RealWebSocket.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0005_`abcB?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\f2\u0006\u00105\u001a\u000206J\b\u00107\u001a\u000203H\u0016J\u001f\u00108\u001a\u0002032\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0002\b=J\u001a\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010\u0018H\u0016J \u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010\u00182\u0006\u0010A\u001a\u00020\fJ\u000e\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020DJ\u001c\u0010E\u001a\u0002032\n\u0010F\u001a\u00060Gj\u0002`H2\b\u00109\u001a\u0004\u0018\u00010:J\u0016\u0010I\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+J\u0006\u0010J\u001a\u000203J\u0018\u0010K\u001a\u0002032\u0006\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010N\u001a\u00020 H\u0016J\u0010\u0010O\u001a\u0002032\u0006\u0010P\u001a\u00020 H\u0016J\u0010\u0010Q\u001a\u0002032\u0006\u0010P\u001a\u00020 H\u0016J\u000e\u0010R\u001a\u00020\u00122\u0006\u0010P\u001a\u00020 J\u0006\u0010S\u001a\u00020\u0012J\b\u0010!\u001a\u00020\fH\u0016J\u0006\u0010'\u001a\u00020%J\u0006\u0010(\u001a\u00020%J\b\u0010T\u001a\u00020\u0006H\u0016J\b\u0010U\u001a\u000203H\u0002J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u0018H\u0016J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010N\u001a\u00020 H\u0016J\u0018\u0010V\u001a\u00020\u00122\u0006\u0010W\u001a\u00020 2\u0006\u0010X\u001a\u00020%H\u0002J\u0006\u0010)\u001a\u00020%J\u0006\u0010Y\u001a\u000203J\r\u0010Z\u001a\u00020\u0012H\u0000¢\u0006\u0002\b[J\r\u0010\\\u001a\u000203H\u0000¢\u0006\u0002\b]J\f\u0010^\u001a\u00020\u0012*\u00020\u000eH\u0002R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006d"}, m115d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "originalRequest", "Lokhttp3/Request;", "listener", "Lokhttp3/WebSocketListener;", "random", "Ljava/util/Random;", "pingIntervalMillis", "", "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", "minimumDeflateSize", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "awaitingPong", "", "call", "Lokhttp3/Call;", "enqueuedClose", "failed", "key", "", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "messageAndCloseQueue", "Ljava/util/ArrayDeque;", "", "name", "pongQueue", "Lokio/ByteString;", "queueSize", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "receivedCloseCode", "", "receivedCloseReason", "receivedPingCount", "receivedPongCount", "sentPingCount", "streams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "awaitTermination", "", "timeout", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "cancel", "checkUpgradeSuccess", "response", "Lokhttp3/Response;", "exchange", "Lokhttp3/internal/connection/Exchange;", "checkUpgradeSuccess$okhttp", "close", "code", "reason", "cancelAfterCloseMillis", "connect", "client", "Lokhttp3/OkHttpClient;", "failWebSocket", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initReaderAndWriter", "loopReader", "onReadClose", "onReadMessage", "text", "bytes", "onReadPing", "payload", "onReadPong", "pong", "processNextFrame", "request", "runWriter", "send", "data", "formatOpcode", "tearDown", "writeOneFrame", "writeOneFrame$okhttp", "writePingFrame", "writePingFrame$okhttp", "isValid", "Close", "Companion", "Message", "Streams", "WriterTask", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class RealWebSocket implements okhttp3.WebSocket, okhttp3.internal.ws.WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final okhttp3.internal.ws.RealWebSocket.Companion Companion = null;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final java.util.List<okhttp3.Protocol> ONLY_HTTP1 = null;
    private boolean awaitingPong;
    private okhttp3.Call call;
    private boolean enqueuedClose;
    private okhttp3.internal.p004ws.WebSocketExtensions extensions;
    private boolean failed;
    private final java.lang.String key;
    private final okhttp3.WebSocketListener listener;
    private final java.util.ArrayDeque<java.lang.Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private java.lang.String name;
    private final okhttp3.Request originalRequest;
    private final long pingIntervalMillis;
    private final java.util.ArrayDeque<okio.ByteString> pongQueue;
    private long queueSize;
    private final java.util.Random random;
    private okhttp3.internal.p004ws.WebSocketReader reader;
    private int receivedCloseCode;
    private java.lang.String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private okhttp3.internal.ws.RealWebSocket.Streams streams;
    private okhttp3.internal.concurrent.TaskQueue taskQueue;
    private okhttp3.internal.p004ws.WebSocketWriter writer;
    private okhttp3.internal.concurrent.Task writerTask;

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m115d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "code", "", "reason", "Lokio/ByteString;", "cancelAfterCloseMillis", "", "(ILokio/ByteString;J)V", "getCancelAfterCloseMillis", "()J", "getCode", "()I", "getReason", "()Lokio/ByteString;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final okio.ByteString reason;

        public Close(int r1, okio.ByteString r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.code = r1
                r0.reason = r2
                r0.cancelAfterCloseMillis = r3
                return
        }

        public final long getCancelAfterCloseMillis() {
                r2 = this;
                long r0 = r2.cancelAfterCloseMillis
                return r0
        }

        public final int getCode() {
                r1 = this;
                int r0 = r1.code
                return r0
        }

        public final okio.ByteString getReason() {
                r1 = this;
                okio.ByteString r0 = r1.reason
                return r0
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m115d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "()V", "CANCEL_AFTER_CLOSE_MILLIS", "", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m115d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "formatOpcode", "", "data", "Lokio/ByteString;", "(ILokio/ByteString;)V", "getData", "()Lokio/ByteString;", "getFormatOpcode", "()I", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Message {
        private final okio.ByteString data;
        private final int formatOpcode;

        public Message(int r2, okio.ByteString r3) {
                r1 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.formatOpcode = r2
                r1.data = r3
                return
        }

        public final okio.ByteString getData() {
                r1 = this;
                okio.ByteString r0 = r1.data
                return r0
        }

        public final int getFormatOpcode() {
                r1 = this;
                int r0 = r1.formatOpcode
                return r0
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m115d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "client", "", "source", "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "getClient", "()Z", "getSink", "()Lokio/BufferedSink;", "getSource", "()Lokio/BufferedSource;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static abstract class Streams implements java.io.Closeable {
        private final boolean client;
        private final okio.BufferedSink sink;
        private final okio.BufferedSource source;

        public Streams(boolean r2, okio.BufferedSource r3, okio.BufferedSink r4) {
                r1 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r1.<init>()
                r1.client = r2
                r1.source = r3
                r1.sink = r4
                return
        }

        public final boolean getClient() {
                r1 = this;
                boolean r0 = r1.client
                return r0
        }

        public final okio.BufferedSink getSink() {
                r1 = this;
                okio.BufferedSink r0 = r1.sink
                return r0
        }

        public final okio.BufferedSource getSource() {
                r1 = this;
                okio.BufferedSource r0 = r1.source
                return r0
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m115d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    private final class WriterTask extends okhttp3.internal.concurrent.Task {
        final /* synthetic */ okhttp3.internal.p004ws.RealWebSocket this$0;

        public WriterTask(okhttp3.internal.p004ws.RealWebSocket r5) {
                r4 = this;
                r4.this$0 = r5
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = okhttp3.internal.p004ws.RealWebSocket.access$getName$p(r5)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " writer"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2
                r2 = 0
                r3 = 0
                r4.<init>(r0, r3, r1, r2)
                return
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r4 = this;
                okhttp3.internal.ws.RealWebSocket r0 = r4.this$0     // Catch: java.io.IOException -> Lc
                boolean r0 = r0.writeOneFrame$okhttp()     // Catch: java.io.IOException -> Lc
                if (r0 == 0) goto L16
                r0 = 0
                return r0
            Lc:
                r0 = move-exception
                okhttp3.internal.ws.RealWebSocket r1 = r4.this$0
                r2 = r0
                java.lang.Exception r2 = (java.lang.Exception) r2
                r3 = 0
                r1.failWebSocket(r2, r3)
            L16:
                r0 = -1
                return r0
        }
    }


    static {
            okhttp3.internal.ws.RealWebSocket$Companion r0 = new okhttp3.internal.ws.RealWebSocket$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.p004ws.RealWebSocket.Companion = r0
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            okhttp3.internal.p004ws.RealWebSocket.ONLY_HTTP1 = r0
            return
    }

    public RealWebSocket(okhttp3.internal.concurrent.TaskRunner r18, okhttp3.Request r19, okhttp3.WebSocketListener r20, java.util.Random r21, long r22, okhttp3.internal.p004ws.WebSocketExtensions r24, long r25) {
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "taskRunner"
            r5 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            java.lang.String r4 = "originalRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            r17.<init>()
            r0.originalRequest = r1
            r0.listener = r2
            r0.random = r3
            r6 = r22
            r0.pingIntervalMillis = r6
            r4 = r24
            r0.extensions = r4
            r8 = r25
            r0.minimumDeflateSize = r8
            okhttp3.internal.concurrent.TaskQueue r10 = r18.newQueue()
            r0.taskQueue = r10
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>()
            r0.pongQueue = r10
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>()
            r0.messageAndCloseQueue = r10
            r10 = -1
            r0.receivedCloseCode = r10
            okhttp3.Request r10 = r0.originalRequest
            java.lang.String r10 = r10.method()
            java.lang.String r11 = "GET"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r10)
            if (r10 == 0) goto L79
            okio.ByteString$Companion r11 = okio.ByteString.Companion
            r10 = 16
            byte[] r12 = new byte[r10]
            r10 = r12
            r13 = 0
            java.util.Random r14 = r0.random
            r14.nextBytes(r10)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            r15 = 3
            r16 = 0
            r13 = 0
            r14 = 0
            okio.ByteString r10 = okio.ByteString.Companion.of$default(r11, r12, r13, r14, r15, r16)
            java.lang.String r10 = r10.base64()
            r0.key = r10
            return
        L79:
            r10 = 0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Request must be GET: "
            java.lang.StringBuilder r11 = r11.append(r12)
            okhttp3.Request r12 = r0.originalRequest
            java.lang.String r12 = r12.method()
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r10 = r11.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
    }

    public static final /* synthetic */ java.util.ArrayDeque access$getMessageAndCloseQueue$p(okhttp3.internal.p004ws.RealWebSocket r1) {
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue
            return r0
    }

    public static final /* synthetic */ java.lang.String access$getName$p(okhttp3.internal.p004ws.RealWebSocket r1) {
            java.lang.String r0 = r1.name
            return r0
    }

    public static final /* synthetic */ boolean access$isValid(okhttp3.internal.p004ws.RealWebSocket r1, okhttp3.internal.p004ws.WebSocketExtensions r2) {
            boolean r0 = r1.isValid(r2)
            return r0
    }

    public static final /* synthetic */ void access$setExtensions$p(okhttp3.internal.p004ws.RealWebSocket r0, okhttp3.internal.p004ws.WebSocketExtensions r1) {
            r0.extensions = r1
            return
    }

    private final boolean isValid(okhttp3.internal.p004ws.WebSocketExtensions r5) {
            r4 = this;
            boolean r0 = r5.unknownValues
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Integer r0 = r5.clientMaxWindowBits
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.Integer r0 = r5.serverMaxWindowBits
            if (r0 == 0) goto L25
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r2 = 8
            r3 = 15
            r0.<init>(r2, r3)
            java.lang.Integer r2 = r5.serverMaxWindowBits
            int r2 = r2.intValue()
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L25
            return r1
        L25:
            r0 = 1
            return r0
    }

    private final void runWriter() {
            r10 = this;
            r0 = r10
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L38
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 == 0) goto Ld
            goto L38
        Ld:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " MUST hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L38:
            okhttp3.internal.concurrent.Task r0 = r10.writerTask
            if (r0 == 0) goto L47
            okhttp3.internal.concurrent.TaskQueue r4 = r10.taskQueue
            r8 = 2
            r9 = 0
            r6 = 0
            r5 = r0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r4, r5, r6, r8, r9)
        L47:
            return
    }

    private final synchronized boolean send(okio.ByteString r7, int r8) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            if (r0 != 0) goto L3c
            boolean r0 = r6.enqueuedClose     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto Lb
            goto L3c
        Lb:
            long r2 = r6.queueSize     // Catch: java.lang.Throwable -> L3e
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L3e
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L3e
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L22
            r0 = 1001(0x3e9, float:1.403E-42)
            r2 = 0
            r6.close(r0, r2)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r6)
            return r1
        L22:
            long r0 = r6.queueSize     // Catch: java.lang.Throwable -> L3e
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L3e
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3e
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch: java.lang.Throwable -> L3e
            okhttp3.internal.ws.RealWebSocket$Message r1 = new okhttp3.internal.ws.RealWebSocket$Message     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L3e
            r0.add(r1)     // Catch: java.lang.Throwable -> L3e
            r6.runWriter()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r6)
            r0 = 1
            return r0
        L3c:
            monitor-exit(r6)
            return r1
        L3e:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3e
            throw r7
    }

    public final void awaitTermination(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r1.taskQueue
            java.util.concurrent.CountDownLatch r0 = r0.idleLatch()
            r0.await(r2, r4)
            return
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
            r1 = this;
            okhttp3.Call r0 = r1.call
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.cancel()
            return
    }

    public final void checkUpgradeSuccess$okhttp(okhttp3.Response r9, okhttp3.internal.connection.Exchange r10) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r0 = r9.code()
            r1 = 101(0x65, float:1.42E-43)
            r2 = 39
            if (r0 != r1) goto Lc7
            java.lang.String r0 = "Connection"
            r1 = 0
            r3 = 2
            java.lang.String r0 = okhttp3.Response.header$default(r9, r0, r1, r3, r1)
            java.lang.String r4 = "Upgrade"
            r5 = 1
            boolean r6 = kotlin.text.StringsKt.equals(r4, r0, r5)
            if (r6 == 0) goto Laa
            java.lang.String r4 = okhttp3.Response.header$default(r9, r4, r1, r3, r1)
            java.lang.String r6 = "websocket"
            boolean r5 = kotlin.text.StringsKt.equals(r6, r4, r5)
            if (r5 == 0) goto L8d
            java.lang.String r5 = "Sec-WebSocket-Accept"
            java.lang.String r1 = okhttp3.Response.header$default(r9, r5, r1, r3, r1)
            okio.ByteString$Companion r3 = okio.ByteString.Companion
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r8.key
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            okio.ByteString r3 = r3.encodeUtf8(r5)
            okio.ByteString r3 = r3.sha1()
            java.lang.String r3 = r3.base64()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r5 == 0) goto L66
            if (r10 == 0) goto L5e
            return
        L5e:
            java.net.ProtocolException r2 = new java.net.ProtocolException
            java.lang.String r5 = "Web Socket exchange missing: bad interceptor?"
            r2.<init>(r5)
            throw r2
        L66:
            java.net.ProtocolException r5 = new java.net.ProtocolException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Expected 'Sec-WebSocket-Accept' header value '"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r7 = "' but was '"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r2 = r6.append(r2)
            java.lang.String r2 = r2.toString()
            r5.<init>(r2)
            throw r5
        L8d:
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Expected 'Upgrade' header value 'websocket' but was '"
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        Laa:
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected 'Connection' header value 'Upgrade' but was '"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        Lc7:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected HTTP 101 response but was '"
            java.lang.StringBuilder r1 = r1.append(r3)
            int r3 = r9.code()
            java.lang.StringBuilder r1 = r1.append(r3)
            r3 = 32
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = r9.message()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.WebSocket
    public boolean close(int r3, java.lang.String r4) {
            r2 = this;
            r0 = 60000(0xea60, double:2.9644E-319)
            boolean r0 = r2.close(r3, r4, r0)
            return r0
    }

    public final synchronized boolean close(int r8, java.lang.String r9, long r10) {
            r7 = this;
            monitor-enter(r7)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.p004ws.WebSocketProtocol.INSTANCE     // Catch: java.lang.Throwable -> L5d
            r0.validateCloseCode(r8)     // Catch: java.lang.Throwable -> L5d
            r0 = 0
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L41
            okio.ByteString$Companion r3 = okio.ByteString.Companion     // Catch: java.lang.Throwable -> L5d
            okio.ByteString r3 = r3.encodeUtf8(r9)     // Catch: java.lang.Throwable -> L5d
            r0 = r3
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L5d
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L5d
            r5 = 123(0x7b, double:6.1E-322)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L1f
            r3 = r2
            goto L20
        L1f:
            r3 = r1
        L20:
            if (r3 == 0) goto L23
            goto L41
        L23:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "reason.size() > 123: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r2 = r2.append(r9)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5d
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5d
            throw r1     // Catch: java.lang.Throwable -> L5d
        L41:
            boolean r3 = r7.failed     // Catch: java.lang.Throwable -> L5d
            if (r3 != 0) goto L5b
            boolean r3 = r7.enqueuedClose     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L4a
            goto L5b
        L4a:
            r7.enqueuedClose = r2     // Catch: java.lang.Throwable -> L5d
            java.util.ArrayDeque<java.lang.Object> r1 = r7.messageAndCloseQueue     // Catch: java.lang.Throwable -> L5d
            okhttp3.internal.ws.RealWebSocket$Close r3 = new okhttp3.internal.ws.RealWebSocket$Close     // Catch: java.lang.Throwable -> L5d
            r3.<init>(r8, r0, r10)     // Catch: java.lang.Throwable -> L5d
            r1.add(r3)     // Catch: java.lang.Throwable -> L5d
            r7.runWriter()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r7)
            return r2
        L5b:
            monitor-exit(r7)
            return r1
        L5d:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5d
            throw r8
    }

    public final void connect(okhttp3.OkHttpClient r6) {
            r5 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okhttp3.Request r0 = r5.originalRequest
            java.lang.String r1 = "Sec-WebSocket-Extensions"
            java.lang.String r0 = r0.header(r1)
            if (r0 == 0) goto L1f
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Request header not permitted: 'Sec-WebSocket-Extensions'"
            r0.<init>(r1)
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1 = 0
            r5.failWebSocket(r0, r1)
            return
        L1f:
            okhttp3.OkHttpClient$Builder r0 = r6.newBuilder()
            okhttp3.EventListener r2 = okhttp3.EventListener.NONE
            okhttp3.OkHttpClient$Builder r0 = r0.eventListener(r2)
            java.util.List<okhttp3.Protocol> r2 = okhttp3.internal.p004ws.RealWebSocket.ONLY_HTTP1
            okhttp3.OkHttpClient$Builder r0 = r0.protocols(r2)
            okhttp3.OkHttpClient r0 = r0.build()
            okhttp3.Request r2 = r5.originalRequest
            okhttp3.Request$Builder r2 = r2.newBuilder()
            java.lang.String r3 = "websocket"
            java.lang.String r4 = "Upgrade"
            okhttp3.Request$Builder r2 = r2.header(r4, r3)
            java.lang.String r3 = "Connection"
            okhttp3.Request$Builder r2 = r2.header(r3, r4)
            java.lang.String r3 = "Sec-WebSocket-Key"
            java.lang.String r4 = r5.key
            okhttp3.Request$Builder r2 = r2.header(r3, r4)
            java.lang.String r3 = "Sec-WebSocket-Version"
            java.lang.String r4 = "13"
            okhttp3.Request$Builder r2 = r2.header(r3, r4)
            java.lang.String r3 = "permessage-deflate"
            okhttp3.Request$Builder r1 = r2.header(r1, r3)
            okhttp3.Request r1 = r1.build()
            okhttp3.internal.connection.RealCall r2 = new okhttp3.internal.connection.RealCall
            r3 = 1
            r2.<init>(r0, r1, r3)
            okhttp3.Call r2 = (okhttp3.Call) r2
            r5.call = r2
            okhttp3.Call r2 = r5.call
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okhttp3.internal.ws.RealWebSocket$connect$1 r3 = new okhttp3.internal.ws.RealWebSocket$connect$1
            r3.<init>(r5, r1)
            okhttp3.Callback r3 = (okhttp3.Callback) r3
            r2.enqueue(r3)
            return
    }

    public final void failWebSocket(java.lang.Exception r7, okhttp3.Response r8) {
            r6 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = 0
            r2 = 0
            monitor-enter(r6)
            r3 = 0
            boolean r4 = r6.failed     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L10
            monitor-exit(r6)
            return
        L10:
            r4 = 1
            r6.failed = r4     // Catch: java.lang.Throwable -> L72
            okhttp3.internal.ws.RealWebSocket$Streams r4 = r6.streams     // Catch: java.lang.Throwable -> L72
            r0 = r4
            r4 = 0
            r6.streams = r4     // Catch: java.lang.Throwable -> L72
            okhttp3.internal.ws.WebSocketReader r5 = r6.reader     // Catch: java.lang.Throwable -> L72
            r1 = r5
            r6.reader = r4     // Catch: java.lang.Throwable -> L72
            okhttp3.internal.ws.WebSocketWriter r5 = r6.writer     // Catch: java.lang.Throwable -> L72
            r2 = r5
            r6.writer = r4     // Catch: java.lang.Throwable -> L72
            okhttp3.internal.concurrent.TaskQueue r4 = r6.taskQueue     // Catch: java.lang.Throwable -> L72
            r4.shutdown()     // Catch: java.lang.Throwable -> L72
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L72
            monitor-exit(r6)
            okhttp3.WebSocketListener r3 = r6.listener     // Catch: java.lang.Throwable -> L52
            r4 = r6
            okhttp3.WebSocket r4 = (okhttp3.WebSocket) r4     // Catch: java.lang.Throwable -> L52
            r5 = r7
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch: java.lang.Throwable -> L52
            r3.onFailure(r4, r5, r8)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L40
            r3 = r0
            java.io.Closeable r3 = (java.io.Closeable) r3
            okhttp3.internal.Util.closeQuietly(r3)
        L40:
            if (r1 == 0) goto L48
            r3 = r1
            java.io.Closeable r3 = (java.io.Closeable) r3
            okhttp3.internal.Util.closeQuietly(r3)
        L48:
            if (r2 == 0) goto L50
            r3 = r2
            java.io.Closeable r3 = (java.io.Closeable) r3
            okhttp3.internal.Util.closeQuietly(r3)
        L50:
            return
        L52:
            r3 = move-exception
            r4 = r0
            okhttp3.internal.ws.RealWebSocket$Streams r4 = (okhttp3.internal.ws.RealWebSocket.Streams) r4
            if (r4 == 0) goto L5d
            java.io.Closeable r4 = (java.io.Closeable) r4
            okhttp3.internal.Util.closeQuietly(r4)
        L5d:
            r4 = r1
            okhttp3.internal.ws.WebSocketReader r4 = (okhttp3.internal.p004ws.WebSocketReader) r4
            if (r4 == 0) goto L67
            java.io.Closeable r4 = (java.io.Closeable) r4
            okhttp3.internal.Util.closeQuietly(r4)
        L67:
            r4 = r2
            okhttp3.internal.ws.WebSocketWriter r4 = (okhttp3.internal.p004ws.WebSocketWriter) r4
            if (r4 == 0) goto L71
            java.io.Closeable r4 = (java.io.Closeable) r4
            okhttp3.internal.Util.closeQuietly(r4)
        L71:
            throw r3
        L72:
            r3 = move-exception
            monitor-exit(r6)
            throw r3
    }

    public final okhttp3.WebSocketListener getListener$okhttp() {
            r1 = this;
            okhttp3.WebSocketListener r0 = r1.listener
            return r0
    }

    public final void initReaderAndWriter(java.lang.String r12, okhttp3.internal.ws.RealWebSocket.Streams r13) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "streams"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            okhttp3.internal.ws.WebSocketExtensions r0 = r11.extensions
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            monitor-enter(r11)
            r1 = 0
            r11.name = r12     // Catch: java.lang.Throwable -> L9f
            r11.streams = r13     // Catch: java.lang.Throwable -> L9f
            okhttp3.internal.ws.WebSocketWriter r10 = new okhttp3.internal.ws.WebSocketWriter     // Catch: java.lang.Throwable -> L9f
            boolean r3 = r13.getClient()     // Catch: java.lang.Throwable -> L9f
            okio.BufferedSink r4 = r13.getSink()     // Catch: java.lang.Throwable -> L9f
            java.util.Random r5 = r11.random     // Catch: java.lang.Throwable -> L9f
            boolean r6 = r0.perMessageDeflate     // Catch: java.lang.Throwable -> L9f
            boolean r2 = r13.getClient()     // Catch: java.lang.Throwable -> L9f
            boolean r7 = r0.noContextTakeover(r2)     // Catch: java.lang.Throwable -> L9f
            long r8 = r11.minimumDeflateSize     // Catch: java.lang.Throwable -> L9f
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9f
            r11.writer = r10     // Catch: java.lang.Throwable -> L9f
            okhttp3.internal.ws.RealWebSocket$WriterTask r2 = new okhttp3.internal.ws.RealWebSocket$WriterTask     // Catch: java.lang.Throwable -> L9f
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L9f
            okhttp3.internal.concurrent.Task r2 = (okhttp3.internal.concurrent.Task) r2     // Catch: java.lang.Throwable -> L9f
            r11.writerTask = r2     // Catch: java.lang.Throwable -> L9f
            long r2 = r11.pingIntervalMillis     // Catch: java.lang.Throwable -> L9f
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L6e
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L9f
            long r3 = r11.pingIntervalMillis     // Catch: java.lang.Throwable -> L9f
            long r2 = r2.toNanos(r3)     // Catch: java.lang.Throwable -> L9f
            okhttp3.internal.concurrent.TaskQueue r4 = r11.taskQueue     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r5.<init>()     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r5 = r5.append(r12)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r6 = " ping"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L9f
            r6 = 0
            okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1 r7 = new okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1     // Catch: java.lang.Throwable -> L9f
            r7.<init>(r5, r11, r2)     // Catch: java.lang.Throwable -> L9f
            okhttp3.internal.concurrent.Task r7 = (okhttp3.internal.concurrent.Task) r7     // Catch: java.lang.Throwable -> L9f
            r4.schedule(r7, r2)     // Catch: java.lang.Throwable -> L9f
        L6e:
            java.util.ArrayDeque<java.lang.Object> r2 = r11.messageAndCloseQueue     // Catch: java.lang.Throwable -> L9f
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L9f
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L9f
            if (r2 != 0) goto L7b
            r11.runWriter()     // Catch: java.lang.Throwable -> L9f
        L7b:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r11)
            okhttp3.internal.ws.WebSocketReader r1 = new okhttp3.internal.ws.WebSocketReader
            boolean r3 = r13.getClient()
            okio.BufferedSource r4 = r13.getSource()
            r5 = r11
            okhttp3.internal.ws.WebSocketReader$FrameCallback r5 = (okhttp3.internal.ws.WebSocketReader.FrameCallback) r5
            boolean r6 = r0.perMessageDeflate
            boolean r2 = r13.getClient()
            r2 = r2 ^ 1
            boolean r7 = r0.noContextTakeover(r2)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r11.reader = r1
            return
        L9f:
            r1 = move-exception
            monitor-exit(r11)
            throw r1
    }

    public final void loopReader() throws java.io.IOException {
            r2 = this;
        L1:
            int r0 = r2.receivedCloseCode
            r1 = -1
            if (r0 != r1) goto Lf
            okhttp3.internal.ws.WebSocketReader r0 = r2.reader
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.processNextFrame()
            goto L1
        Lf:
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int r9, java.lang.String r10) {
            r8 = this;
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 1
            r1 = 0
            r2 = -1
            if (r9 == r2) goto Lc
            r3 = r0
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r3 == 0) goto La2
            r3 = 0
            r4 = 0
            r5 = 0
            monitor-enter(r8)
            r6 = 0
            int r7 = r8.receivedCloseCode     // Catch: java.lang.Throwable -> L9f
            if (r7 != r2) goto L19
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L92
            r8.receivedCloseCode = r9     // Catch: java.lang.Throwable -> L9f
            r8.receivedCloseReason = r10     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r8.enqueuedClose     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L41
            java.util.ArrayDeque<java.lang.Object> r0 = r8.messageAndCloseQueue     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L41
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r8.streams     // Catch: java.lang.Throwable -> L9f
            r3 = r0
            r0 = 0
            r8.streams = r0     // Catch: java.lang.Throwable -> L9f
            okhttp3.internal.ws.WebSocketReader r1 = r8.reader     // Catch: java.lang.Throwable -> L9f
            r4 = r1
            r8.reader = r0     // Catch: java.lang.Throwable -> L9f
            okhttp3.internal.ws.WebSocketWriter r1 = r8.writer     // Catch: java.lang.Throwable -> L9f
            r5 = r1
            r8.writer = r0     // Catch: java.lang.Throwable -> L9f
            okhttp3.internal.concurrent.TaskQueue r0 = r8.taskQueue     // Catch: java.lang.Throwable -> L9f
            r0.shutdown()     // Catch: java.lang.Throwable -> L9f
        L41:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r8)
            okhttp3.WebSocketListener r0 = r8.listener     // Catch: java.lang.Throwable -> L72
            r1 = r8
            okhttp3.WebSocket r1 = (okhttp3.WebSocket) r1     // Catch: java.lang.Throwable -> L72
            r0.onClosing(r1, r9, r10)     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L58
            okhttp3.WebSocketListener r0 = r8.listener     // Catch: java.lang.Throwable -> L72
            r1 = r8
            okhttp3.WebSocket r1 = (okhttp3.WebSocket) r1     // Catch: java.lang.Throwable -> L72
            r0.onClosed(r1, r9, r10)     // Catch: java.lang.Throwable -> L72
        L58:
            if (r3 == 0) goto L60
            r0 = r3
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly(r0)
        L60:
            if (r4 == 0) goto L68
            r0 = r4
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly(r0)
        L68:
            if (r5 == 0) goto L70
            r0 = r5
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly(r0)
        L70:
            return
        L72:
            r0 = move-exception
            r1 = r3
            okhttp3.internal.ws.RealWebSocket$Streams r1 = (okhttp3.internal.ws.RealWebSocket.Streams) r1
            if (r1 == 0) goto L7d
            java.io.Closeable r1 = (java.io.Closeable) r1
            okhttp3.internal.Util.closeQuietly(r1)
        L7d:
            r1 = r4
            okhttp3.internal.ws.WebSocketReader r1 = (okhttp3.internal.p004ws.WebSocketReader) r1
            if (r1 == 0) goto L87
            java.io.Closeable r1 = (java.io.Closeable) r1
            okhttp3.internal.Util.closeQuietly(r1)
        L87:
            r1 = r5
            okhttp3.internal.ws.WebSocketWriter r1 = (okhttp3.internal.p004ws.WebSocketWriter) r1
            if (r1 == 0) goto L91
            java.io.Closeable r1 = (java.io.Closeable) r1
            okhttp3.internal.Util.closeQuietly(r1)
        L91:
            throw r0
        L92:
            r0 = 0
            java.lang.String r1 = "already closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9f
            throw r0     // Catch: java.lang.Throwable -> L9f
        L9f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        La2:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.WebSocketListener r0 = r2.listener
            r1 = r2
            okhttp3.WebSocket r1 = (okhttp3.WebSocket) r1
            r0.onMessage(r1, r3)
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(okio.ByteString r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.WebSocketListener r0 = r2.listener
            r1 = r2
            okhttp3.WebSocket r1 = (okhttp3.WebSocket) r1
            r0.onMessage(r1, r3)
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L29
            boolean r0 = r1.failed     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L27
            boolean r0 = r1.enqueuedClose     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L17
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L17
            goto L27
        L17:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch: java.lang.Throwable -> L29
            r0.add(r2)     // Catch: java.lang.Throwable -> L29
            r1.runWriter()     // Catch: java.lang.Throwable -> L29
            int r0 = r1.receivedPingCount     // Catch: java.lang.Throwable -> L29
            int r0 = r0 + 1
            r1.receivedPingCount = r0     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)
            return
        L27:
            monitor-exit(r1)
            return
        L29:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            throw r2
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L11
            int r0 = r1.receivedPongCount     // Catch: java.lang.Throwable -> L11
            int r0 = r0 + 1
            r1.receivedPongCount = r0     // Catch: java.lang.Throwable -> L11
            r0 = 0
            r1.awaitingPong = r0     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public final synchronized boolean pong(okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L25
            boolean r0 = r1.failed     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L22
            boolean r0 = r1.enqueuedClose     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L17
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L25
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L17
            goto L22
        L17:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch: java.lang.Throwable -> L25
            r0.add(r2)     // Catch: java.lang.Throwable -> L25
            r1.runWriter()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            r0 = 1
            return r0
        L22:
            monitor-exit(r1)
            r0 = 0
            return r0
        L25:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            throw r2
    }

    public final boolean processNextFrame() throws java.io.IOException {
            r3 = this;
            r0 = 0
            okhttp3.internal.ws.WebSocketReader r1 = r3.reader     // Catch: java.lang.Exception -> L11
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Exception -> L11
            r1.processNextFrame()     // Catch: java.lang.Exception -> L11
            int r1 = r3.receivedCloseCode     // Catch: java.lang.Exception -> L11
            r2 = -1
            if (r1 != r2) goto L17
            r0 = 1
            goto L17
        L11:
            r1 = move-exception
            r2 = 0
            r3.failWebSocket(r1, r2)
        L17:
            return r0
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.queueSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int receivedPingCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.receivedPingCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int receivedPongCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.receivedPongCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // okhttp3.WebSocket
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            return r0
    }

    @Override // okhttp3.WebSocket
    public boolean send(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r0 = r0.encodeUtf8(r3)
            r1 = 1
            boolean r0 = r2.send(r0, r1)
            return r0
    }

    @Override // okhttp3.WebSocket
    public boolean send(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 2
            boolean r0 = r1.send(r2, r0)
            return r0
    }

    public final synchronized int sentPingCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.sentPingCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final void tearDown() throws java.lang.InterruptedException {
            r4 = this;
            okhttp3.internal.concurrent.TaskQueue r0 = r4.taskQueue
            r0.shutdown()
            okhttp3.internal.concurrent.TaskQueue r0 = r4.taskQueue
            java.util.concurrent.CountDownLatch r0 = r0.idleLatch()
            r1 = 10
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r0.await(r1, r3)
            return
    }

    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
            r19 = this;
            r1 = r19
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = 0
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            monitor-enter(r19)
            r0 = 0
            boolean r10 = r1.failed     // Catch: java.lang.Throwable -> L13d
            r11 = 0
            if (r10 == 0) goto L15
        L13:
            monitor-exit(r19)
            return r11
        L15:
            okhttp3.internal.ws.WebSocketWriter r10 = r1.writer     // Catch: java.lang.Throwable -> L13d
            r2 = r10
            java.util.ArrayDeque<okio.ByteString> r10 = r1.pongQueue     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r10 = r10.poll()     // Catch: java.lang.Throwable -> L13d
            r3 = r10
            if (r3 != 0) goto L99
            java.util.ArrayDeque<java.lang.Object> r10 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r10 = r10.poll()     // Catch: java.lang.Throwable -> L13d
            r4 = r10
            boolean r10 = r4 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> L13d
            if (r10 == 0) goto L92
            int r10 = r1.receivedCloseCode     // Catch: java.lang.Throwable -> L13d
            r5 = r10
            java.lang.String r10 = r1.receivedCloseReason     // Catch: java.lang.Throwable -> L8d
            r6 = r10
            r10 = -1
            if (r5 == r10) goto L4e
            okhttp3.internal.ws.RealWebSocket$Streams r10 = r1.streams     // Catch: java.lang.Throwable -> L13d
            r7 = r10
            r10 = 0
            r1.streams = r10     // Catch: java.lang.Throwable -> L13d
            okhttp3.internal.ws.WebSocketReader r11 = r1.reader     // Catch: java.lang.Throwable -> L13d
            r8 = r11
            r1.reader = r10     // Catch: java.lang.Throwable -> L13d
            okhttp3.internal.ws.WebSocketWriter r11 = r1.writer     // Catch: java.lang.Throwable -> L13d
            r9 = r11
            r1.writer = r10     // Catch: java.lang.Throwable -> L13d
            okhttp3.internal.concurrent.TaskQueue r10 = r1.taskQueue     // Catch: java.lang.Throwable -> L13d
            r10.shutdown()     // Catch: java.lang.Throwable -> L13d
            r16 = r0
            goto L9b
        L4e:
            r10 = r4
            okhttp3.internal.ws.RealWebSocket$Close r10 = (okhttp3.internal.ws.RealWebSocket.Close) r10     // Catch: java.lang.Throwable -> L8d
            long r10 = r10.getCancelAfterCloseMillis()     // Catch: java.lang.Throwable -> L8d
            okhttp3.internal.concurrent.TaskQueue r12 = r1.taskQueue     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r13.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r14 = r1.name     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r13 = r13.append(r14)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r14 = " cancel"
            java.lang.StringBuilder r13 = r13.append(r14)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L8d
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L8d
            long r14 = r14.toNanos(r10)     // Catch: java.lang.Throwable -> L8d
            r16 = r0
            r0 = 1
            r17 = 0
            r18 = r5
            okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1 r5 = new okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1     // Catch: java.lang.Throwable -> L88
            r5.<init>(r13, r0, r1)     // Catch: java.lang.Throwable -> L88
            okhttp3.internal.concurrent.Task r5 = (okhttp3.internal.concurrent.Task) r5     // Catch: java.lang.Throwable -> L88
            r12.schedule(r5, r14)     // Catch: java.lang.Throwable -> L88
            r5 = r18
            goto L9b
        L88:
            r0 = move-exception
            r5 = r18
            goto L13e
        L8d:
            r0 = move-exception
            r18 = r5
            goto L13e
        L92:
            r16 = r0
            if (r4 != 0) goto L9b
        L97:
            monitor-exit(r19)
            return r11
        L99:
            r16 = r0
        L9b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L13d
            monitor-exit(r19)
            if (r3 == 0) goto Lac
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L11d
            r0 = r3
            okio.ByteString r0 = (okio.ByteString) r0     // Catch: java.lang.Throwable -> L11d
            r2.writePong(r0)     // Catch: java.lang.Throwable -> L11d
            goto Lfc
        Lac:
            boolean r0 = r4 instanceof okhttp3.internal.ws.RealWebSocket.Message     // Catch: java.lang.Throwable -> L11d
            if (r0 == 0) goto Lda
            r0 = r4
            okhttp3.internal.ws.RealWebSocket$Message r0 = (okhttp3.internal.ws.RealWebSocket.Message) r0     // Catch: java.lang.Throwable -> L11d
            r10 = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L11d
            int r0 = r10.getFormatOpcode()     // Catch: java.lang.Throwable -> L11d
            okio.ByteString r11 = r10.getData()     // Catch: java.lang.Throwable -> L11d
            r2.writeMessageFrame(r0, r11)     // Catch: java.lang.Throwable -> L11d
            monitor-enter(r19)     // Catch: java.lang.Throwable -> L11d
            r0 = 0
            long r11 = r1.queueSize     // Catch: java.lang.Throwable -> Ld7
            okio.ByteString r13 = r10.getData()     // Catch: java.lang.Throwable -> Ld7
            int r13 = r13.size()     // Catch: java.lang.Throwable -> Ld7
            long r13 = (long) r13     // Catch: java.lang.Throwable -> Ld7
            long r11 = r11 - r13
            r1.queueSize = r11     // Catch: java.lang.Throwable -> Ld7
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld7
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L11d
            goto Lfc
        Ld7:
            r0 = move-exception
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L11d
            throw r0     // Catch: java.lang.Throwable -> L11d
        Lda:
            boolean r0 = r4 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> L11d
            if (r0 == 0) goto L117
            r0 = r4
            okhttp3.internal.ws.RealWebSocket$Close r0 = (okhttp3.internal.ws.RealWebSocket.Close) r0     // Catch: java.lang.Throwable -> L11d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L11d
            int r10 = r0.getCode()     // Catch: java.lang.Throwable -> L11d
            okio.ByteString r11 = r0.getReason()     // Catch: java.lang.Throwable -> L11d
            r2.writeClose(r10, r11)     // Catch: java.lang.Throwable -> L11d
            if (r7 == 0) goto Lfc
            okhttp3.WebSocketListener r10 = r1.listener     // Catch: java.lang.Throwable -> L11d
            r11 = r1
            okhttp3.WebSocket r11 = (okhttp3.WebSocket) r11     // Catch: java.lang.Throwable -> L11d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L11d
            r10.onClosed(r11, r5, r6)     // Catch: java.lang.Throwable -> L11d
        Lfc:
            if (r7 == 0) goto L105
            r0 = r7
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly(r0)
        L105:
            if (r8 == 0) goto L10d
            r0 = r8
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly(r0)
        L10d:
            if (r9 == 0) goto L115
            r0 = r9
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly(r0)
        L115:
            r0 = 1
            return r0
        L117:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L11d
            r0.<init>()     // Catch: java.lang.Throwable -> L11d
            throw r0     // Catch: java.lang.Throwable -> L11d
        L11d:
            r0 = move-exception
            r10 = r7
            okhttp3.internal.ws.RealWebSocket$Streams r10 = (okhttp3.internal.ws.RealWebSocket.Streams) r10
            if (r10 == 0) goto L128
            java.io.Closeable r10 = (java.io.Closeable) r10
            okhttp3.internal.Util.closeQuietly(r10)
        L128:
            r10 = r8
            okhttp3.internal.ws.WebSocketReader r10 = (okhttp3.internal.p004ws.WebSocketReader) r10
            if (r10 == 0) goto L132
            java.io.Closeable r10 = (java.io.Closeable) r10
            okhttp3.internal.Util.closeQuietly(r10)
        L132:
            r10 = r9
            okhttp3.internal.ws.WebSocketWriter r10 = (okhttp3.internal.p004ws.WebSocketWriter) r10
            if (r10 == 0) goto L13c
            java.io.Closeable r10 = (java.io.Closeable) r10
            okhttp3.internal.Util.closeQuietly(r10)
        L13c:
            throw r0
        L13d:
            r0 = move-exception
        L13e:
            monitor-exit(r19)
            throw r0
    }

    public final void writePingFrame$okhttp() {
            r7 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r7)
            r2 = 0
            boolean r3 = r7.failed     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto La
            monitor-exit(r7)
            return
        La:
            okhttp3.internal.ws.WebSocketWriter r3 = r7.writer     // Catch: java.lang.Throwable -> L6c
            if (r3 != 0) goto L10
            monitor-exit(r7)
            return
        L10:
            r0 = r3
            boolean r3 = r7.awaitingPong     // Catch: java.lang.Throwable -> L6c
            r4 = -1
            if (r3 == 0) goto L19
            int r3 = r7.sentPingCount     // Catch: java.lang.Throwable -> L6c
            goto L1a
        L19:
            r3 = r4
        L1a:
            r1 = r3
            int r3 = r7.sentPingCount     // Catch: java.lang.Throwable -> L6c
            r5 = 1
            int r3 = r3 + r5
            r7.sentPingCount = r3     // Catch: java.lang.Throwable -> L6c
            r7.awaitingPong = r5     // Catch: java.lang.Throwable -> L6c
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r7)
            r2 = 0
            if (r1 == r4) goto L5d
            java.net.SocketTimeoutException r3 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            java.lang.StringBuilder r4 = r4.append(r5)
            long r5 = r7.pingIntervalMillis
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "ms (after "
            java.lang.StringBuilder r4 = r4.append(r5)
            int r5 = r1 + (-1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " successful ping/pongs)"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.lang.Exception r3 = (java.lang.Exception) r3
            r7.failWebSocket(r3, r2)
            return
        L5d:
            okio.ByteString r3 = okio.ByteString.EMPTY     // Catch: java.io.IOException -> L64
            r0.writePing(r3)     // Catch: java.io.IOException -> L64
            goto L6b
        L64:
            r3 = move-exception
            r4 = r3
            java.lang.Exception r4 = (java.lang.Exception) r4
            r7.failWebSocket(r4, r2)
        L6b:
            return
        L6c:
            r2 = move-exception
            monitor-exit(r7)
            throw r2
    }
}
