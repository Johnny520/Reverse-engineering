package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2Connection.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u0099\u00012\u00020\u0001:\b\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010P\u001a\u00020QJ\b\u0010R\u001a\u00020QH\u0016J'\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010WH\u0000¢\u0006\u0002\bXJ\u0012\u0010Y\u001a\u00020Q2\b\u0010Z\u001a\u0004\u0018\u00010WH\u0002J\u0006\u0010[\u001a\u00020QJ\u0010\u0010\\\u001a\u0004\u0018\u00010B2\u0006\u0010]\u001a\u00020\u0012J\u000e\u0010^\u001a\u00020\t2\u0006\u0010_\u001a\u00020\u0006J&\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tH\u0002J\u001c\u0010`\u001a\u00020B2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tJ\u0006\u0010f\u001a\u00020\u0012J-\u0010g\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\u00122\u0006\u0010l\u001a\u00020\tH\u0000¢\u0006\u0002\bmJ+\u0010n\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010l\u001a\u00020\tH\u0000¢\u0006\u0002\boJ#\u0010p\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0cH\u0000¢\u0006\u0002\bqJ\u001d\u0010r\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010s\u001a\u00020TH\u0000¢\u0006\u0002\btJ$\u0010u\u001a\u00020B2\u0006\u0010a\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tJ\u0015\u0010v\u001a\u00020\t2\u0006\u0010h\u001a\u00020\u0012H\u0000¢\u0006\u0002\bwJ\u0017\u0010x\u001a\u0004\u0018\u00010B2\u0006\u0010h\u001a\u00020\u0012H\u0000¢\u0006\u0002\byJ\r\u0010z\u001a\u00020QH\u0000¢\u0006\u0002\b{J\u000e\u0010|\u001a\u00020Q2\u0006\u0010}\u001a\u00020&J\u000e\u0010~\u001a\u00020Q2\u0006\u0010\u007f\u001a\u00020TJ\u001e\u0010\u0080\u0001\u001a\u00020Q2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\t2\b\b\u0002\u0010E\u001a\u00020FH\u0007J\u0018\u0010\u0082\u0001\u001a\u00020Q2\u0007\u0010\u0083\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0003\b\u0084\u0001J,\u0010\u0085\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0086\u0001\u001a\u00020\t2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u0006\u0010k\u001a\u00020\u0006J/\u0010\u0089\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0086\u0001\u001a\u00020\t2\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020d0cH\u0000¢\u0006\u0003\b\u008b\u0001J\u0007\u0010\u008c\u0001\u001a\u00020QJ\"\u0010\u008c\u0001\u001a\u00020Q2\u0007\u0010\u008d\u0001\u001a\u00020\t2\u0007\u0010\u008e\u0001\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020\u0012J\u0007\u0010\u0090\u0001\u001a\u00020QJ\u001f\u0010\u0091\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010\u007f\u001a\u00020TH\u0000¢\u0006\u0003\b\u0092\u0001J\u001f\u0010\u0093\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010s\u001a\u00020TH\u0000¢\u0006\u0003\b\u0094\u0001J \u0010\u0095\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0096\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0003\b\u0097\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001dR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010(\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001e\u00105\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0015\u00107\u001a\u000608R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u000e\u0010;\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020=X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020B0AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010G\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u001e\u0010I\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u00104R\u0011\u0010K\u001a\u00020L¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u000e\u0010O\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u009c\u0001"}, m115d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "builder", "Lokhttp3/internal/http2/Http2Connection$Builder;", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "awaitPingsSent", "", "awaitPongsReceived", "client", "", "getClient$okhttp", "()Z", "connectionName", "", "getConnectionName$okhttp", "()Ljava/lang/String;", "currentPushRequests", "", "", "degradedPingsSent", "degradedPongDeadlineNs", "degradedPongsReceived", "intervalPingsSent", "intervalPongsReceived", "isShutdown", "lastGoodStreamId", "getLastGoodStreamId$okhttp", "()I", "setLastGoodStreamId$okhttp", "(I)V", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "(Lokhttp3/internal/http2/Settings;)V", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "pushQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "<set-?>", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "readBytesTotal", "getReadBytesTotal", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "settingsListenerQueue", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "streams", "", "Lokhttp3/internal/http2/Http2Stream;", "getStreams$okhttp", "()Ljava/util/Map;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "writeBytesMaximum", "getWriteBytesMaximum", "writeBytesTotal", "getWriteBytesTotal", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "writerQueue", "awaitPong", "", "close", "connectionCode", "Lokhttp3/internal/http2/ErrorCode;", "streamCode", "cause", "Ljava/io/IOException;", "close$okhttp", "failConnection", "e", "flush", "getStream", "id", "isHealthy", "nowNs", "newStream", "associatedStreamId", "requestHeaders", "", "Lokhttp3/internal/http2/Header;", "out", "openStreamCount", "pushDataLater", "streamId", "source", "Lokio/BufferedSource;", "byteCount", "inFinished", "pushDataLater$okhttp", "pushHeadersLater", "pushHeadersLater$okhttp", "pushRequestLater", "pushRequestLater$okhttp", "pushResetLater", "errorCode", "pushResetLater$okhttp", "pushStream", "pushedStream", "pushedStream$okhttp", "removeStream", "removeStream$okhttp", "sendDegradedPingLater", "sendDegradedPingLater$okhttp", "setSettings", "settings", "shutdown", "statusCode", "start", "sendConnectionPreface", "updateConnectionFlowControl", "read", "updateConnectionFlowControl$okhttp", "writeData", "outFinished", "buffer", "Lokio/Buffer;", "writeHeaders", "alternating", "writeHeaders$okhttp", "writePing", "reply", "payload1", "payload2", "writePingAndAwaitPong", "writeSynReset", "writeSynReset$okhttp", "writeSynResetLater", "writeSynResetLater$okhttp", "writeWindowUpdateLater", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "Builder", "Companion", "Listener", "ReaderRunnable", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class Http2Connection implements java.io.Closeable {
    public static final int AWAIT_PING = 3;
    public static final okhttp3.internal.http2.Http2Connection.Companion Companion = null;
    private static final okhttp3.internal.http2.Settings DEFAULT_SETTINGS = null;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final java.lang.String connectionName;
    private final java.util.Set<java.lang.Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final okhttp3.internal.http2.Http2Connection.Listener listener;
    private int nextStreamId;
    private final okhttp3.internal.http2.Settings okHttpSettings;
    private okhttp3.internal.http2.Settings peerSettings;
    private final okhttp3.internal.http2.PushObserver pushObserver;
    private final okhttp3.internal.concurrent.TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final okhttp3.internal.http2.Http2Connection.ReaderRunnable readerRunnable;
    private final okhttp3.internal.concurrent.TaskQueue settingsListenerQueue;
    private final java.net.Socket socket;
    private final java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> streams;
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final okhttp3.internal.http2.Http2Writer writer;
    private final okhttp3.internal.concurrent.TaskQueue writerQueue;

    /* JADX INFO: compiled from: Http2Connection.kt */
    @kotlin.Metadata(m114d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u00107\u001a\u000208J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eJ.\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\b\b\u0002\u00109\u001a\u00020\f2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010#\u001a\u00020$H\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020*X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006:"}, m115d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "client", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "connectionName", "", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "pingIntervalMillis", "", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "sink", "Lokio/BufferedSink;", "getSink$okhttp", "()Lokio/BufferedSink;", "setSink$okhttp", "(Lokio/BufferedSink;)V", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "source", "Lokio/BufferedSource;", "getSource$okhttp", "()Lokio/BufferedSource;", "setSource$okhttp", "(Lokio/BufferedSource;)V", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "build", "Lokhttp3/internal/http2/Http2Connection;", "peerName", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Builder {
        private boolean client;
        public java.lang.String connectionName;
        private okhttp3.internal.http2.Http2Connection.Listener listener;
        private int pingIntervalMillis;
        private okhttp3.internal.http2.PushObserver pushObserver;
        public okio.BufferedSink sink;
        public java.net.Socket socket;
        public okio.BufferedSource source;
        private final okhttp3.internal.concurrent.TaskRunner taskRunner;

        public Builder(boolean r2, okhttp3.internal.concurrent.TaskRunner r3) {
                r1 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.client = r2
                r1.taskRunner = r3
                okhttp3.internal.http2.Http2Connection$Listener r0 = okhttp3.internal.http2.Http2Connection.Listener.REFUSE_INCOMING_STREAMS
                r1.listener = r0
                okhttp3.internal.http2.PushObserver r0 = okhttp3.internal.http2.PushObserver.CANCEL
                r1.pushObserver = r0
                return
        }

        public static /* synthetic */ okhttp3.internal.http2.Http2Connection.Builder socket$default(okhttp3.internal.http2.Http2Connection.Builder r0, java.net.Socket r1, java.lang.String r2, okio.BufferedSource r3, okio.BufferedSink r4, int r5, java.lang.Object r6) throws java.io.IOException {
                r6 = r5 & 2
                if (r6 == 0) goto L8
                java.lang.String r2 = okhttp3.internal.Util.peerName(r1)
            L8:
                r6 = r5 & 4
                if (r6 == 0) goto L14
                okio.Source r3 = okio.Okio.source(r1)
                okio.BufferedSource r3 = okio.Okio.buffer(r3)
            L14:
                r5 = r5 & 8
                if (r5 == 0) goto L20
                okio.Sink r4 = okio.Okio.sink(r1)
                okio.BufferedSink r4 = okio.Okio.buffer(r4)
            L20:
                okhttp3.internal.http2.Http2Connection$Builder r0 = r0.socket(r1, r2, r3, r4)
                return r0
        }

        public final okhttp3.internal.http2.Http2Connection build() {
                r1 = this;
                okhttp3.internal.http2.Http2Connection r0 = new okhttp3.internal.http2.Http2Connection
                r0.<init>(r1)
                return r0
        }

        public final boolean getClient$okhttp() {
                r1 = this;
                boolean r0 = r1.client
                return r0
        }

        public final java.lang.String getConnectionName$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.connectionName
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "connectionName"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                return r0
        }

        public final okhttp3.internal.http2.Http2Connection.Listener getListener$okhttp() {
                r1 = this;
                okhttp3.internal.http2.Http2Connection$Listener r0 = r1.listener
                return r0
        }

        public final int getPingIntervalMillis$okhttp() {
                r1 = this;
                int r0 = r1.pingIntervalMillis
                return r0
        }

        public final okhttp3.internal.http2.PushObserver getPushObserver$okhttp() {
                r1 = this;
                okhttp3.internal.http2.PushObserver r0 = r1.pushObserver
                return r0
        }

        public final okio.BufferedSink getSink$okhttp() {
                r1 = this;
                okio.BufferedSink r0 = r1.sink
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                return r0
        }

        public final java.net.Socket getSocket$okhttp() {
                r1 = this;
                java.net.Socket r0 = r1.socket
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "socket"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                return r0
        }

        public final okio.BufferedSource getSource$okhttp() {
                r1 = this;
                okio.BufferedSource r0 = r1.source
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                return r0
        }

        public final okhttp3.internal.concurrent.TaskRunner getTaskRunner$okhttp() {
                r1 = this;
                okhttp3.internal.concurrent.TaskRunner r0 = r1.taskRunner
                return r0
        }

        public final okhttp3.internal.http2.Http2Connection.Builder listener(okhttp3.internal.http2.Http2Connection.Listener r3) {
                r2 = this;
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = r2
                okhttp3.internal.http2.Http2Connection$Builder r0 = (okhttp3.internal.http2.Http2Connection.Builder) r0
                r1 = 0
                r0.listener = r3
                r0 = r2
                okhttp3.internal.http2.Http2Connection$Builder r0 = (okhttp3.internal.http2.Http2Connection.Builder) r0
                return r0
        }

        public final okhttp3.internal.http2.Http2Connection.Builder pingIntervalMillis(int r3) {
                r2 = this;
                r0 = r2
                okhttp3.internal.http2.Http2Connection$Builder r0 = (okhttp3.internal.http2.Http2Connection.Builder) r0
                r1 = 0
                r0.pingIntervalMillis = r3
                r0 = r2
                okhttp3.internal.http2.Http2Connection$Builder r0 = (okhttp3.internal.http2.Http2Connection.Builder) r0
                return r0
        }

        public final okhttp3.internal.http2.Http2Connection.Builder pushObserver(okhttp3.internal.http2.PushObserver r3) {
                r2 = this;
                java.lang.String r0 = "pushObserver"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = r2
                okhttp3.internal.http2.Http2Connection$Builder r0 = (okhttp3.internal.http2.Http2Connection.Builder) r0
                r1 = 0
                r0.pushObserver = r3
                r0 = r2
                okhttp3.internal.http2.Http2Connection$Builder r0 = (okhttp3.internal.http2.Http2Connection.Builder) r0
                return r0
        }

        public final void setClient$okhttp(boolean r1) {
                r0 = this;
                r0.client = r1
                return
        }

        public final void setConnectionName$okhttp(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.connectionName = r2
                return
        }

        public final void setListener$okhttp(okhttp3.internal.http2.Http2Connection.Listener r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.listener = r2
                return
        }

        public final void setPingIntervalMillis$okhttp(int r1) {
                r0 = this;
                r0.pingIntervalMillis = r1
                return
        }

        public final void setPushObserver$okhttp(okhttp3.internal.http2.PushObserver r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.pushObserver = r2
                return
        }

        public final void setSink$okhttp(okio.BufferedSink r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.sink = r2
                return
        }

        public final void setSocket$okhttp(java.net.Socket r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.socket = r2
                return
        }

        public final void setSource$okhttp(okio.BufferedSource r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.source = r2
                return
        }

        public final okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket r9) throws java.io.IOException {
                r8 = this;
                java.lang.String r0 = "socket"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r6 = 14
                r7 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r1 = r8
                r2 = r9
                okhttp3.internal.http2.Http2Connection$Builder r0 = socket$default(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }

        public final okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket r9, java.lang.String r10) throws java.io.IOException {
                r8 = this;
                java.lang.String r0 = "socket"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                java.lang.String r0 = "peerName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                r6 = 12
                r7 = 0
                r4 = 0
                r5 = 0
                r1 = r8
                r2 = r9
                r3 = r10
                okhttp3.internal.http2.Http2Connection$Builder r0 = socket$default(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }

        public final okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket r9, java.lang.String r10, okio.BufferedSource r11) throws java.io.IOException {
                r8 = this;
                java.lang.String r0 = "socket"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                java.lang.String r0 = "peerName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                r6 = 8
                r7 = 0
                r5 = 0
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                okhttp3.internal.http2.Http2Connection$Builder r0 = socket$default(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }

        public final okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket r5, java.lang.String r6, okio.BufferedSource r7, okio.BufferedSink r8) throws java.io.IOException {
                r4 = this;
                java.lang.String r0 = "socket"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "peerName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r0 = r4
                okhttp3.internal.http2.Http2Connection$Builder r0 = (okhttp3.internal.http2.Http2Connection.Builder) r0
                r1 = 0
                r0.setSocket$okhttp(r5)
                boolean r2 = r0.client
                if (r2 == 0) goto L3a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = okhttp3.internal.Util.okHttpName
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = 32
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r6)
                java.lang.String r2 = r2.toString()
                goto L4d
            L3a:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "MockWebServer "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r6)
                java.lang.String r2 = r2.toString()
            L4d:
                r0.setConnectionName$okhttp(r2)
                r0.setSource$okhttp(r7)
                r0.setSink$okhttp(r8)
                r0 = r4
                okhttp3.internal.http2.Http2Connection$Builder r0 = (okhttp3.internal.http2.Http2Connection.Builder) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m115d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "()V", "AWAIT_PING", "", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        public final okhttp3.internal.http2.Settings getDEFAULT_SETTINGS() {
                r1 = this;
                okhttp3.internal.http2.Settings r0 = okhttp3.internal.http2.Http2Connection.access$getDEFAULT_SETTINGS$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @kotlin.Metadata(m114d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, m115d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "()V", "onSettings", "", "connection", "Lokhttp3/internal/http2/Http2Connection;", "settings", "Lokhttp3/internal/http2/Settings;", "onStream", "stream", "Lokhttp3/internal/http2/Http2Stream;", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static abstract class Listener {
        public static final okhttp3.internal.http2.Http2Connection.Listener.Companion Companion = null;
        public static final okhttp3.internal.http2.Http2Connection.Listener REFUSE_INCOMING_STREAMS = null;

        /* JADX INFO: compiled from: Http2Connection.kt */
        @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m115d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "", "()V", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        static {
                okhttp3.internal.http2.Http2Connection$Listener$Companion r0 = new okhttp3.internal.http2.Http2Connection$Listener$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.internal.http2.Http2Connection.Listener.Companion = r0
                okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 r0 = new okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
                r0.<init>()
                okhttp3.internal.http2.Http2Connection$Listener r0 = (okhttp3.internal.http2.Http2Connection.Listener) r0
                okhttp3.internal.http2.Http2Connection.Listener.REFUSE_INCOMING_STREAMS = r0
                return
        }

        public Listener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onSettings(okhttp3.internal.http2.Http2Connection r2, okhttp3.internal.http2.Settings r3) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "settings"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                return
        }

        public abstract void onStream(okhttp3.internal.http2.Http2Stream r1) throws java.io.IOException;
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @kotlin.Metadata(m114d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0003H\u0016J8\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0016J \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0010H\u0016J.\u0010$\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J\t\u0010)\u001a\u00020\u0003H\u0096\u0002J \u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fH\u0016J(\u0010.\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0017H\u0016J&\u00102\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\f\u00104\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J\u0018\u00105\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u00106\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u00068"}, m115d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "reader", "Lokhttp3/internal/http2/Http2Reader;", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "ackSettings", "alternateService", "streamId", "", "origin", "", "protocol", "Lokio/ByteString;", "host", "port", "maxAge", "", "applyAndAckSettings", "clearPrevious", "", "settings", "Lokhttp3/internal/http2/Settings;", "data", "inFinished", "source", "Lokio/BufferedSource;", "length", "goAway", "lastGoodStreamId", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "debugData", "headers", "associatedStreamId", "headerBlock", "", "Lokhttp3/internal/http2/Header;", "invoke", "ping", "ack", "payload1", "payload2", "priority", "streamDependency", "weight", "exclusive", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "windowUpdate", "windowSizeIncrement", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public final class ReaderRunnable implements okhttp3.internal.http2.Http2Reader.Handler, kotlin.jvm.functions.Function0<kotlin.Unit> {
        private final okhttp3.internal.http2.Http2Reader reader;
        final /* synthetic */ okhttp3.internal.http2.Http2Connection this$0;

        public ReaderRunnable(okhttp3.internal.http2.Http2Connection r2, okhttp3.internal.http2.Http2Reader r3) {
                r1 = this;
                java.lang.String r0 = "reader"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.reader = r3
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
                r0 = this;
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int r2, java.lang.String r3, okio.ByteString r4, java.lang.String r5, int r6, long r7) {
                r1 = this;
                java.lang.String r0 = "origin"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "protocol"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "host"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                return
        }

        public final void applyAndAckSettings(boolean r19, okhttp3.internal.http2.Settings r20) {
                r18 = this;
                r1 = r18
                r2 = r20
                java.lang.String r0 = "settings"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r3 = 0
                r5 = 0
                kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
                r0.<init>()
                r6 = r0
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                okhttp3.internal.http2.Http2Writer r7 = r0.getWriter()
                okhttp3.internal.http2.Http2Connection r8 = r1.this$0
                monitor-enter(r7)
                r9 = 0
                monitor-enter(r8)     // Catch: java.lang.Throwable -> Le1
                r0 = 0
                okhttp3.internal.http2.Settings r10 = r8.getPeerSettings()     // Catch: java.lang.Throwable -> Lde
                if (r19 == 0) goto L26
                r11 = r2
                goto L35
            L26:
                okhttp3.internal.http2.Settings r11 = new okhttp3.internal.http2.Settings     // Catch: java.lang.Throwable -> Lde
                r11.<init>()     // Catch: java.lang.Throwable -> Lde
                r12 = r11
                r13 = 0
                r12.merge(r10)     // Catch: java.lang.Throwable -> Lde
                r12.merge(r2)     // Catch: java.lang.Throwable -> Lde
            L35:
                r6.element = r11     // Catch: java.lang.Throwable -> Lde
                T r11 = r6.element     // Catch: java.lang.Throwable -> Lde
                okhttp3.internal.http2.Settings r11 = (okhttp3.internal.http2.Settings) r11     // Catch: java.lang.Throwable -> Lde
                int r11 = r11.getInitialWindowSize()     // Catch: java.lang.Throwable -> Lde
                long r11 = (long) r11     // Catch: java.lang.Throwable -> Lde
                int r13 = r10.getInitialWindowSize()     // Catch: java.lang.Throwable -> Lde
                long r13 = (long) r13     // Catch: java.lang.Throwable -> Lde
                long r3 = r11 - r13
                r13 = 0
                int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
                r14 = 0
                if (r13 == 0) goto L74
                java.util.Map r13 = r8.getStreams$okhttp()     // Catch: java.lang.Throwable -> Lde
                boolean r13 = r13.isEmpty()     // Catch: java.lang.Throwable -> Lde
                if (r13 == 0) goto L5c
                r17 = r0
                goto L76
            L5c:
                java.util.Map r13 = r8.getStreams$okhttp()     // Catch: java.lang.Throwable -> Lde
                java.util.Collection r13 = r13.values()     // Catch: java.lang.Throwable -> Lde
                r15 = 0
                r16 = r13
                r17 = r0
                okhttp3.internal.http2.Http2Stream[] r0 = new okhttp3.internal.http2.Http2Stream[r14]     // Catch: java.lang.Throwable -> Lde
                r14 = r16
                java.lang.Object[] r0 = r14.toArray(r0)     // Catch: java.lang.Throwable -> Lde
                okhttp3.internal.http2.Http2Stream[] r0 = (okhttp3.internal.http2.Http2Stream[]) r0     // Catch: java.lang.Throwable -> Lde
                goto L77
            L74:
                r17 = r0
            L76:
                r0 = 0
            L77:
                r5 = r0
                T r0 = r6.element     // Catch: java.lang.Throwable -> Lde
                okhttp3.internal.http2.Settings r0 = (okhttp3.internal.http2.Settings) r0     // Catch: java.lang.Throwable -> Lde
                r8.setPeerSettings(r0)     // Catch: java.lang.Throwable -> Lde
                okhttp3.internal.concurrent.TaskQueue r0 = okhttp3.internal.http2.Http2Connection.access$getSettingsListenerQueue$p(r8)     // Catch: java.lang.Throwable -> Lde
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lde
                r13.<init>()     // Catch: java.lang.Throwable -> Lde
                java.lang.String r14 = r8.getConnectionName$okhttp()     // Catch: java.lang.Throwable -> Lde
                java.lang.StringBuilder r13 = r13.append(r14)     // Catch: java.lang.Throwable -> Lde
                java.lang.String r14 = " onSettings"
                java.lang.StringBuilder r13 = r13.append(r14)     // Catch: java.lang.Throwable -> Lde
                java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Lde
                r14 = 0
                r1 = 1
                r16 = 0
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1 r2 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1     // Catch: java.lang.Throwable -> Lde
                r2.<init>(r13, r1, r8, r6)     // Catch: java.lang.Throwable -> Lde
                okhttp3.internal.concurrent.Task r2 = (okhttp3.internal.concurrent.Task) r2     // Catch: java.lang.Throwable -> Lde
                r0.schedule(r2, r14)     // Catch: java.lang.Throwable -> Lde
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lde
                monitor-exit(r8)     // Catch: java.lang.Throwable -> Le1
                okhttp3.internal.http2.Http2Writer r0 = r8.getWriter()     // Catch: java.io.IOException -> Lbe java.lang.Throwable -> Le1
                T r1 = r6.element     // Catch: java.io.IOException -> Lbe java.lang.Throwable -> Le1
                okhttp3.internal.http2.Settings r1 = (okhttp3.internal.http2.Settings) r1     // Catch: java.io.IOException -> Lbe java.lang.Throwable -> Le1
                r0.applyAndAckSettings(r1)     // Catch: java.io.IOException -> Lbe java.lang.Throwable -> Le1
                goto Lc2
            Lbe:
                r0 = move-exception
                okhttp3.internal.http2.Http2Connection.access$failConnection(r8, r0)     // Catch: java.lang.Throwable -> Le1
            Lc2:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Le1
                monitor-exit(r7)
                if (r5 == 0) goto Ldd
                int r0 = r5.length
                r14 = 0
            Lca:
                if (r14 >= r0) goto Ldd
                r1 = r5[r14]
                monitor-enter(r1)
                r2 = 0
                r1.addBytesToWriteWindow(r3)     // Catch: java.lang.Throwable -> Lda
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lda
                monitor-exit(r1)
                int r14 = r14 + 1
                goto Lca
            Lda:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            Ldd:
                return
            Lde:
                r0 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> Le1
                throw r0     // Catch: java.lang.Throwable -> Le1
            Le1:
                r0 = move-exception
                monitor-exit(r7)
                throw r0
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean r5, int r6, okio.BufferedSource r7, int r8) throws java.io.IOException {
                r4 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                okhttp3.internal.http2.Http2Connection r0 = r4.this$0
                boolean r0 = r0.pushedStream$okhttp(r6)
                if (r0 == 0) goto L13
                okhttp3.internal.http2.Http2Connection r0 = r4.this$0
                r0.pushDataLater$okhttp(r6, r7, r8, r5)
                return
            L13:
                okhttp3.internal.http2.Http2Connection r0 = r4.this$0
                okhttp3.internal.http2.Http2Stream r0 = r0.getStream(r6)
                if (r0 != 0) goto L2d
                okhttp3.internal.http2.Http2Connection r1 = r4.this$0
                okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
                r1.writeSynResetLater$okhttp(r6, r2)
                okhttp3.internal.http2.Http2Connection r1 = r4.this$0
                long r2 = (long) r8
                r1.updateConnectionFlowControl$okhttp(r2)
                long r1 = (long) r8
                r7.skip(r1)
                return
            L2d:
                r0.receiveData(r7, r8)
                if (r5 == 0) goto L38
                okhttp3.Headers r1 = okhttp3.internal.Util.EMPTY_HEADERS
                r2 = 1
                r0.receiveHeaders(r1, r2)
            L38:
                return
        }

        public final okhttp3.internal.http2.Http2Reader getReader$okhttp() {
                r1 = this;
                okhttp3.internal.http2.Http2Reader r0 = r1.reader
                return r0
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int r10, okhttp3.internal.http2.ErrorCode r11, okio.ByteString r12) {
                r9 = this;
                java.lang.String r0 = "errorCode"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "debugData"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                r12.size()
                r0 = 0
                okhttp3.internal.http2.Http2Connection r1 = r9.this$0
                okhttp3.internal.http2.Http2Connection r2 = r9.this$0
                monitor-enter(r1)
                r3 = 0
                java.util.Map r4 = r2.getStreams$okhttp()     // Catch: java.lang.Throwable -> L54
                java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L54
                r5 = 0
                r6 = r4
                r7 = 0
                okhttp3.internal.http2.Http2Stream[] r8 = new okhttp3.internal.http2.Http2Stream[r7]     // Catch: java.lang.Throwable -> L54
                java.lang.Object[] r8 = r6.toArray(r8)     // Catch: java.lang.Throwable -> L54
                r0 = r8
                r4 = 1
                okhttp3.internal.http2.Http2Connection.access$setShutdown$p(r2, r4)     // Catch: java.lang.Throwable -> L54
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L54
                monitor-exit(r1)
                r1 = r0
                okhttp3.internal.http2.Http2Stream[] r1 = (okhttp3.internal.http2.Http2Stream[]) r1
                int r2 = r1.length
            L32:
                if (r7 >= r2) goto L53
                r3 = r1[r7]
                int r4 = r3.getId()
                if (r4 <= r10) goto L50
                boolean r4 = r3.isLocallyInitiated()
                if (r4 == 0) goto L50
                okhttp3.internal.http2.ErrorCode r4 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
                r3.receiveRstStream(r4)
                okhttp3.internal.http2.Http2Connection r4 = r9.this$0
                int r5 = r3.getId()
                r4.removeStream$okhttp(r5)
            L50:
                int r7 = r7 + 1
                goto L32
            L53:
                return
            L54:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean r17, int r18, int r19, java.util.List<okhttp3.internal.http2.Header> r20) {
                r16 = this;
                r1 = r16
                r8 = r17
                r9 = r18
                r10 = r20
                java.lang.String r0 = "headerBlock"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                boolean r0 = r0.pushedStream$okhttp(r9)
                if (r0 == 0) goto L1b
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                r0.pushHeadersLater$okhttp(r9, r10, r8)
                return
            L1b:
                r2 = 0
                okhttp3.internal.http2.Http2Connection r11 = r1.this$0
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                monitor-enter(r11)
                r12 = 0
                okhttp3.internal.http2.Http2Stream r3 = r0.getStream(r9)     // Catch: java.lang.Throwable -> Lb1
                r13 = r3
                if (r13 != 0) goto La2
                boolean r2 = okhttp3.internal.http2.Http2Connection.access$isShutdown$p(r0)     // Catch: java.lang.Throwable -> Lae
                if (r2 == 0) goto L31
                monitor-exit(r11)
                return
            L31:
                int r2 = r0.getLastGoodStreamId$okhttp()     // Catch: java.lang.Throwable -> Lae
                if (r9 > r2) goto L39
                monitor-exit(r11)
                return
            L39:
                int r2 = r9 % 2
                int r3 = r0.getNextStreamId$okhttp()     // Catch: java.lang.Throwable -> Lae
                int r3 = r3 % 2
                if (r2 != r3) goto L45
                monitor-exit(r11)
                return
            L45:
                okhttp3.Headers r7 = okhttp3.internal.Util.toHeaders(r20)     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.http2.Http2Stream r14 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> Lae
                r5 = 0
                r2 = r14
                r3 = r18
                r4 = r0
                r6 = r17
                r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lae
                r2 = r14
                r0.setLastGoodStreamId$okhttp(r9)     // Catch: java.lang.Throwable -> Lae
                java.lang.Integer r3 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> Lae
                java.util.Map r4 = r0.getStreams$okhttp()     // Catch: java.lang.Throwable -> Lae
                r4.put(r3, r2)     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.concurrent.TaskRunner r3 = okhttp3.internal.http2.Http2Connection.access$getTaskRunner$p(r0)     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.concurrent.TaskQueue r3 = r3.newQueue()     // Catch: java.lang.Throwable -> Lae
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lae
                r4.<init>()     // Catch: java.lang.Throwable -> Lae
                java.lang.String r5 = r0.getConnectionName$okhttp()     // Catch: java.lang.Throwable -> Lae
                java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> Lae
                r5 = 91
                java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> Lae
                java.lang.StringBuilder r4 = r4.append(r9)     // Catch: java.lang.Throwable -> Lae
                java.lang.String r5 = "] onStream"
                java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> Lae
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lae
                r5 = 0
                r14 = 1
                r15 = 0
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1 r1 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1     // Catch: java.lang.Throwable -> Lae
                r1.<init>(r4, r14, r0, r2)     // Catch: java.lang.Throwable -> Lae
                okhttp3.internal.concurrent.Task r1 = (okhttp3.internal.concurrent.Task) r1     // Catch: java.lang.Throwable -> Lae
                r3.schedule(r1, r5)     // Catch: java.lang.Throwable -> Lae
                monitor-exit(r11)
                return
            La2:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lae
                monitor-exit(r11)
                okhttp3.Headers r0 = okhttp3.internal.Util.toHeaders(r20)
                r13.receiveHeaders(r0, r8)
                return
            Lae:
                r0 = move-exception
                r2 = r13
                goto Lb2
            Lb1:
                r0 = move-exception
            Lb2:
                monitor-exit(r11)
                throw r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                r1 = this;
                r1.invoke2()
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2() {
                r6 = this;
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                r2 = 0
                okhttp3.internal.http2.Http2Reader r3 = r6.reader     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
                r4 = r6
                okhttp3.internal.http2.Http2Reader$Handler r4 = (okhttp3.internal.http2.Http2Reader.Handler) r4     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
                r3.readConnectionPreface(r4)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
            Le:
                okhttp3.internal.http2.Http2Reader r3 = r6.reader     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
                r4 = r6
                okhttp3.internal.http2.Http2Reader$Handler r4 = (okhttp3.internal.http2.Http2Reader.Handler) r4     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
                r5 = 0
                boolean r3 = r3.nextFrame(r5, r4)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
                if (r3 != 0) goto Le
                okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.NO_ERROR     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
                r0 = r3
                okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
                r1 = r3
                goto L2b
            L21:
                r3 = move-exception
                goto L39
            L23:
                r3 = move-exception
                r2 = r3
                okhttp3.internal.http2.ErrorCode r4 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L21
                r0 = r4
                okhttp3.internal.http2.ErrorCode r4 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L21
                r1 = r4
            L2b:
                okhttp3.internal.http2.Http2Connection r3 = r6.this$0
                r3.close$okhttp(r0, r1, r2)
                okhttp3.internal.http2.Http2Reader r3 = r6.reader
                java.io.Closeable r3 = (java.io.Closeable) r3
                okhttp3.internal.Util.closeQuietly(r3)
                return
            L39:
                okhttp3.internal.http2.Http2Connection r4 = r6.this$0
                r4.close$okhttp(r0, r1, r2)
                okhttp3.internal.http2.Http2Reader r4 = r6.reader
                java.io.Closeable r4 = (java.io.Closeable) r4
                okhttp3.internal.Util.closeQuietly(r4)
                throw r3
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean r15, int r16, int r17) {
                r14 = this;
                r1 = r14
                if (r15 == 0) goto L48
                okhttp3.internal.http2.Http2Connection r2 = r1.this$0
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                monitor-enter(r2)
                r3 = 0
                r4 = 1
                switch(r16) {
                    case 1: goto L35;
                    case 2: goto L29;
                    case 3: goto L11;
                    default: goto Le;
                }
            Le:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L41
                goto L43
            L11:
                long r6 = okhttp3.internal.http2.Http2Connection.access$getAwaitPongsReceived$p(r0)     // Catch: java.lang.Throwable -> L41
                long r6 = r6 + r4
                okhttp3.internal.http2.Http2Connection.access$setAwaitPongsReceived$p(r0, r6)     // Catch: java.lang.Throwable -> L41
                r4 = 0
                java.lang.String r5 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r5)     // Catch: java.lang.Throwable -> L41
                r5 = r0
                java.lang.Object r5 = (java.lang.Object) r5     // Catch: java.lang.Throwable -> L41
                r5.notifyAll()     // Catch: java.lang.Throwable -> L41
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L41
                goto L43
            L29:
                long r6 = okhttp3.internal.http2.Http2Connection.access$getDegradedPongsReceived$p(r0)     // Catch: java.lang.Throwable -> L41
                long r4 = r4 + r6
                okhttp3.internal.http2.Http2Connection.access$setDegradedPongsReceived$p(r0, r4)     // Catch: java.lang.Throwable -> L41
                java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L41
                goto L43
            L35:
                long r6 = okhttp3.internal.http2.Http2Connection.access$getIntervalPongsReceived$p(r0)     // Catch: java.lang.Throwable -> L41
                long r4 = r4 + r6
                okhttp3.internal.http2.Http2Connection.access$setIntervalPongsReceived$p(r0, r4)     // Catch: java.lang.Throwable -> L41
                java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L41
                goto L43
            L41:
                r0 = move-exception
                goto L46
            L43:
                monitor-exit(r2)
                goto L82
            L46:
                monitor-exit(r2)
                throw r0
            L48:
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                okhttp3.internal.concurrent.TaskQueue r0 = okhttp3.internal.http2.Http2Connection.access$getWriterQueue$p(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                okhttp3.internal.http2.Http2Connection r3 = r1.this$0
                java.lang.String r3 = r3.getConnectionName$okhttp()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " ping"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                okhttp3.internal.http2.Http2Connection r9 = r1.this$0
                r3 = 0
                r5 = 1
                r12 = 0
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1 r13 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                r6 = r13
                r7 = r2
                r8 = r5
                r10 = r16
                r11 = r17
                r6.<init>(r7, r8, r9, r10, r11)
                okhttp3.internal.concurrent.Task r13 = (okhttp3.internal.concurrent.Task) r13
                r0.schedule(r13, r3)
            L82:
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int r1, int r2, int r3, boolean r4) {
                r0 = this;
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int r2, int r3, java.util.List<okhttp3.internal.http2.Header> r4) {
                r1 = this;
                java.lang.String r0 = "requestHeaders"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                r0.pushRequestLater$okhttp(r3, r4)
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int r2, okhttp3.internal.http2.ErrorCode r3) {
                r1 = this;
                java.lang.String r0 = "errorCode"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                boolean r0 = r0.pushedStream$okhttp(r2)
                if (r0 == 0) goto L13
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                r0.pushResetLater$okhttp(r2, r3)
                return
            L13:
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream r0 = r0.removeStream$okhttp(r2)
                if (r0 == 0) goto L1e
                r0.receiveRstStream(r3)
            L1e:
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean r14, okhttp3.internal.http2.Settings r15) {
                r13 = this;
                java.lang.String r0 = "settings"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                okhttp3.internal.http2.Http2Connection r0 = r13.this$0
                okhttp3.internal.concurrent.TaskQueue r0 = okhttp3.internal.http2.Http2Connection.access$getWriterQueue$p(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                okhttp3.internal.http2.Http2Connection r2 = r13.this$0
                java.lang.String r2 = r2.getConnectionName$okhttp()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " applyAndAckSettings"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r8 = 0
                r10 = 1
                r11 = 0
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1 r12 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                r2 = r12
                r3 = r1
                r4 = r10
                r5 = r13
                r6 = r14
                r7 = r15
                r2.<init>(r3, r4, r5, r6, r7)
                okhttp3.internal.concurrent.Task r12 = (okhttp3.internal.concurrent.Task) r12
                r0.schedule(r12, r8)
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int r6, long r7) {
                r5 = this;
                if (r6 != 0) goto L25
                okhttp3.internal.http2.Http2Connection r0 = r5.this$0
                okhttp3.internal.http2.Http2Connection r1 = r5.this$0
                monitor-enter(r0)
                r2 = 0
                long r3 = r1.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L22
                long r3 = r3 + r7
                okhttp3.internal.http2.Http2Connection.access$setWriteBytesMaximum$p(r1, r3)     // Catch: java.lang.Throwable -> L22
                r3 = 0
                java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)     // Catch: java.lang.Throwable -> L22
                r4 = r1
                java.lang.Object r4 = (java.lang.Object) r4     // Catch: java.lang.Throwable -> L22
                r4.notifyAll()     // Catch: java.lang.Throwable -> L22
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L22
                monitor-exit(r0)
                goto L3a
            L22:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L25:
                okhttp3.internal.http2.Http2Connection r0 = r5.this$0
                okhttp3.internal.http2.Http2Stream r0 = r0.getStream(r6)
                if (r0 == 0) goto L3a
                monitor-enter(r0)
                r1 = 0
                r0.addBytesToWriteWindow(r7)     // Catch: java.lang.Throwable -> L37
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L37
                monitor-exit(r0)
                goto L3a
            L37:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L3a:
                return
        }
    }

    static {
            okhttp3.internal.http2.Http2Connection$Companion r0 = new okhttp3.internal.http2.Http2Connection$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2Connection.Companion = r0
            okhttp3.internal.http2.Settings r0 = new okhttp3.internal.http2.Settings
            r0.<init>()
            r1 = r0
            r2 = 0
            r3 = 7
            r4 = 65535(0xffff, float:9.1834E-41)
            r1.set(r3, r4)
            r3 = 5
            r4 = 16384(0x4000, float:2.2959E-41)
            r1.set(r3, r4)
            okhttp3.internal.http2.Http2Connection.DEFAULT_SETTINGS = r0
            return
    }

    public Http2Connection(okhttp3.internal.http2.Http2Connection.Builder r7) {
            r6 = this;
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r6.<init>()
            boolean r0 = r7.getClient$okhttp()
            r6.client = r0
            okhttp3.internal.http2.Http2Connection$Listener r0 = r7.getListener$okhttp()
            r6.listener = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r6.streams = r0
            java.lang.String r0 = r7.getConnectionName$okhttp()
            r6.connectionName = r0
            boolean r0 = r7.getClient$okhttp()
            if (r0 == 0) goto L2b
            r0 = 3
            goto L2c
        L2b:
            r0 = 2
        L2c:
            r6.nextStreamId = r0
            okhttp3.internal.concurrent.TaskRunner r0 = r7.getTaskRunner$okhttp()
            r6.taskRunner = r0
            okhttp3.internal.concurrent.TaskRunner r0 = r6.taskRunner
            okhttp3.internal.concurrent.TaskQueue r0 = r0.newQueue()
            r6.writerQueue = r0
            okhttp3.internal.concurrent.TaskRunner r0 = r6.taskRunner
            okhttp3.internal.concurrent.TaskQueue r0 = r0.newQueue()
            r6.pushQueue = r0
            okhttp3.internal.concurrent.TaskRunner r0 = r6.taskRunner
            okhttp3.internal.concurrent.TaskQueue r0 = r0.newQueue()
            r6.settingsListenerQueue = r0
            okhttp3.internal.http2.PushObserver r0 = r7.getPushObserver$okhttp()
            r6.pushObserver = r0
            okhttp3.internal.http2.Settings r0 = new okhttp3.internal.http2.Settings
            r0.<init>()
            r1 = r0
            r2 = 0
            boolean r3 = r7.getClient$okhttp()
            if (r3 == 0) goto L65
            r3 = 7
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r1.set(r3, r4)
        L65:
            r6.okHttpSettings = r0
            okhttp3.internal.http2.Settings r0 = okhttp3.internal.http2.Http2Connection.DEFAULT_SETTINGS
            r6.peerSettings = r0
            okhttp3.internal.http2.Settings r0 = r6.peerSettings
            int r0 = r0.getInitialWindowSize()
            long r0 = (long) r0
            r6.writeBytesMaximum = r0
            java.net.Socket r0 = r7.getSocket$okhttp()
            r6.socket = r0
            okhttp3.internal.http2.Http2Writer r0 = new okhttp3.internal.http2.Http2Writer
            okio.BufferedSink r1 = r7.getSink$okhttp()
            boolean r2 = r6.client
            r0.<init>(r1, r2)
            r6.writer = r0
            okhttp3.internal.http2.Http2Connection$ReaderRunnable r0 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable
            okhttp3.internal.http2.Http2Reader r1 = new okhttp3.internal.http2.Http2Reader
            okio.BufferedSource r2 = r7.getSource$okhttp()
            boolean r3 = r6.client
            r1.<init>(r2, r3)
            r0.<init>(r6, r1)
            r6.readerRunnable = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = (java.util.Set) r0
            r6.currentPushRequests = r0
            int r0 = r7.getPingIntervalMillis$okhttp()
            if (r0 == 0) goto Ld9
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r1 = r7.getPingIntervalMillis$okhttp()
            long r1 = (long) r1
            long r0 = r0.toNanos(r1)
            okhttp3.internal.concurrent.TaskQueue r2 = r6.writerQueue
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r6.connectionName
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " ping"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1 r5 = new okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
            r5.<init>(r3, r6, r0)
            okhttp3.internal.concurrent.Task r5 = (okhttp3.internal.concurrent.Task) r5
            r2.schedule(r5, r0)
        Ld9:
            return
    }

    public static final /* synthetic */ void access$failConnection(okhttp3.internal.http2.Http2Connection r0, java.io.IOException r1) {
            r0.failConnection(r1)
            return
    }

    public static final /* synthetic */ long access$getAwaitPongsReceived$p(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.awaitPongsReceived
            return r0
    }

    public static final /* synthetic */ java.util.Set access$getCurrentPushRequests$p(okhttp3.internal.http2.Http2Connection r1) {
            java.util.Set<java.lang.Integer> r0 = r1.currentPushRequests
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.http2.Settings access$getDEFAULT_SETTINGS$cp() {
            okhttp3.internal.http2.Settings r0 = okhttp3.internal.http2.Http2Connection.DEFAULT_SETTINGS
            return r0
    }

    public static final /* synthetic */ long access$getDegradedPongsReceived$p(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.degradedPongsReceived
            return r0
    }

    public static final /* synthetic */ long access$getIntervalPingsSent$p(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.intervalPingsSent
            return r0
    }

    public static final /* synthetic */ long access$getIntervalPongsReceived$p(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.intervalPongsReceived
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.http2.PushObserver access$getPushObserver$p(okhttp3.internal.http2.Http2Connection r1) {
            okhttp3.internal.http2.PushObserver r0 = r1.pushObserver
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.concurrent.TaskQueue access$getSettingsListenerQueue$p(okhttp3.internal.http2.Http2Connection r1) {
            okhttp3.internal.concurrent.TaskQueue r0 = r1.settingsListenerQueue
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.concurrent.TaskRunner access$getTaskRunner$p(okhttp3.internal.http2.Http2Connection r1) {
            okhttp3.internal.concurrent.TaskRunner r0 = r1.taskRunner
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.concurrent.TaskQueue access$getWriterQueue$p(okhttp3.internal.http2.Http2Connection r1) {
            okhttp3.internal.concurrent.TaskQueue r0 = r1.writerQueue
            return r0
    }

    public static final /* synthetic */ boolean access$isShutdown$p(okhttp3.internal.http2.Http2Connection r1) {
            boolean r0 = r1.isShutdown
            return r0
    }

    public static final /* synthetic */ void access$setAwaitPongsReceived$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.awaitPongsReceived = r1
            return
    }

    public static final /* synthetic */ void access$setDegradedPongsReceived$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.degradedPongsReceived = r1
            return
    }

    public static final /* synthetic */ void access$setIntervalPingsSent$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.intervalPingsSent = r1
            return
    }

    public static final /* synthetic */ void access$setIntervalPongsReceived$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.intervalPongsReceived = r1
            return
    }

    public static final /* synthetic */ void access$setShutdown$p(okhttp3.internal.http2.Http2Connection r0, boolean r1) {
            r0.isShutdown = r1
            return
    }

    public static final /* synthetic */ void access$setWriteBytesMaximum$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.writeBytesMaximum = r1
            return
    }

    private final void failConnection(java.io.IOException r3) {
            r2 = this;
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
            r2.close$okhttp(r0, r1, r3)
            return
    }

    private final okhttp3.internal.http2.Http2Stream newStream(int r20, java.util.List<okhttp3.internal.http2.Header> r21, boolean r22) throws java.io.IOException {
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r0 = r22 ^ 1
            r10 = r0
            r11 = 0
            r12 = 0
            r13 = 0
            r1 = 0
            okhttp3.internal.http2.Http2Writer r14 = r7.writer
            monitor-enter(r14)
            r15 = 0
            monitor-enter(r19)     // Catch: java.lang.Throwable -> Lb4
            r0 = 0
            int r2 = r7.nextStreamId     // Catch: java.lang.Throwable -> Lb1
            r3 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 <= r3) goto L1f
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> Lb1
            r7.shutdown(r2)     // Catch: java.lang.Throwable -> Lb1
        L1f:
            boolean r2 = r7.isShutdown     // Catch: java.lang.Throwable -> Lb1
            if (r2 != 0) goto Lab
            int r2 = r7.nextStreamId     // Catch: java.lang.Throwable -> Lb1
            r6 = r2
            int r1 = r7.nextStreamId     // Catch: java.lang.Throwable -> La8
            int r1 = r1 + 2
            r7.nextStreamId = r1     // Catch: java.lang.Throwable -> La8
            okhttp3.internal.http2.Http2Stream r16 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> La8
            r17 = 0
            r1 = r16
            r2 = r6
            r3 = r19
            r4 = r10
            r5 = r11
            r18 = r6
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La4
            r13 = r16
            if (r22 == 0) goto L5d
            long r1 = r7.writeBytesTotal     // Catch: java.lang.Throwable -> L59
            long r3 = r7.writeBytesMaximum     // Catch: java.lang.Throwable -> L59
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L5d
            long r1 = r13.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L59
            long r3 = r13.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L59
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L57
            goto L5d
        L57:
            r1 = 0
            goto L5e
        L59:
            r0 = move-exception
            r1 = r18
            goto Lb2
        L5d:
            r1 = 1
        L5e:
            r12 = r1
            boolean r1 = r13.isOpen()     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto L6e
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r1 = r7.streams     // Catch: java.lang.Throwable -> L59
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> L59
            r1.put(r2, r13)     // Catch: java.lang.Throwable -> L59
        L6e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La4
            monitor-exit(r19)     // Catch: java.lang.Throwable -> La0
            if (r8 != 0) goto L7c
            okhttp3.internal.http2.Http2Writer r0 = r7.writer     // Catch: java.lang.Throwable -> La0
            r1 = r18
            r0.headers(r10, r1, r9)     // Catch: java.lang.Throwable -> Lb4
            goto L87
        L7c:
            r1 = r18
            boolean r0 = r7.client     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L93
            okhttp3.internal.http2.Http2Writer r0 = r7.writer     // Catch: java.lang.Throwable -> Lb4
            r0.pushPromise(r8, r1, r9)     // Catch: java.lang.Throwable -> Lb4
        L87:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r14)
            if (r12 == 0) goto L92
            okhttp3.internal.http2.Http2Writer r0 = r7.writer
            r0.flush()
        L92:
            return r13
        L93:
            r0 = 0
            java.lang.String r2 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lb4
            throw r0     // Catch: java.lang.Throwable -> Lb4
        La0:
            r0 = move-exception
            r1 = r18
            goto Lb5
        La4:
            r0 = move-exception
            r1 = r18
            goto Lb2
        La8:
            r0 = move-exception
            r1 = r6
            goto Lb2
        Lab:
            okhttp3.internal.http2.ConnectionShutdownException r2 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> Lb1
            r2.<init>()     // Catch: java.lang.Throwable -> Lb1
            throw r2     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r0 = move-exception
        Lb2:
            monitor-exit(r19)     // Catch: java.lang.Throwable -> Lb4
            throw r0     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r0 = move-exception
        Lb5:
            monitor-exit(r14)
            throw r0
    }

    public static /* synthetic */ void start$default(okhttp3.internal.http2.Http2Connection r0, boolean r1, okhttp3.internal.concurrent.TaskRunner r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 1
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            okhttp3.internal.concurrent.TaskRunner r2 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
        Lb:
            r0.start(r1, r2)
            return
    }

    public final synchronized void awaitPong() throws java.lang.InterruptedException {
            r4 = this;
            monitor-enter(r4)
        L2:
            long r0 = r4.awaitPongsReceived     // Catch: java.lang.Throwable -> L1a
            long r2 = r4.awaitPingsSent     // Catch: java.lang.Throwable -> L1a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L18
            r0 = r4
            r1 = 0
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)     // Catch: java.lang.Throwable -> L1a
            r2 = r0
            java.lang.Object r2 = (java.lang.Object) r2     // Catch: java.lang.Throwable -> L1a
            r2.wait()     // Catch: java.lang.Throwable -> L1a
            goto L2
        L18:
            monitor-exit(r4)
            return
        L1a:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.NO_ERROR
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL
            r2 = 0
            r3.close$okhttp(r0, r1, r2)
            return
    }

    public final void close$okhttp(okhttp3.internal.http2.ErrorCode r11, okhttp3.internal.http2.ErrorCode r12, java.io.IOException r13) {
            r10 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r10
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L42
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 != 0) goto L17
            goto L42
        L17:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " MUST NOT hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L42:
            r0 = 0
            r1 = 0
            r10.shutdown(r11)     // Catch: java.io.IOException -> L4b
            goto L4c
        L4b:
            r1 = move-exception
        L4c:
            r0 = 0
            monitor-enter(r10)
            r1 = 0
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r2 = r10.streams     // Catch: java.lang.Throwable -> Lb6
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lb6
            r3 = 0
            if (r2 != 0) goto L6d
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r2 = r10.streams     // Catch: java.lang.Throwable -> Lb6
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> Lb6
            r4 = 0
            r5 = r2
            okhttp3.internal.http2.Http2Stream[] r6 = new okhttp3.internal.http2.Http2Stream[r3]     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object[] r6 = r5.toArray(r6)     // Catch: java.lang.Throwable -> Lb6
            r0 = r6
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r2 = r10.streams     // Catch: java.lang.Throwable -> Lb6
            r2.clear()     // Catch: java.lang.Throwable -> Lb6
        L6d:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r10)
            r1 = r0
            okhttp3.internal.http2.Http2Stream[] r1 = (okhttp3.internal.http2.Http2Stream[]) r1
            if (r1 == 0) goto L8e
            r2 = 0
            int r4 = r1.length
        L78:
            if (r3 >= r4) goto L8d
            r5 = r1[r3]
            r6 = r5
            r7 = 0
            r8 = 0
            r9 = 0
            r6.close(r12, r13)     // Catch: java.io.IOException -> L86
            goto L87
        L86:
            r9 = move-exception
        L87:
            int r3 = r3 + 1
            goto L78
        L8d:
        L8e:
            r1 = 0
            r2 = 0
            okhttp3.internal.http2.Http2Writer r3 = r10.writer     // Catch: java.io.IOException -> L98
            r3.close()     // Catch: java.io.IOException -> L98
            goto L99
        L98:
            r2 = move-exception
        L99:
            r1 = 0
            r2 = 0
            java.net.Socket r3 = r10.socket     // Catch: java.io.IOException -> La4
            r3.close()     // Catch: java.io.IOException -> La4
            goto La5
        La4:
            r2 = move-exception
        La5:
            okhttp3.internal.concurrent.TaskQueue r1 = r10.writerQueue
            r1.shutdown()
            okhttp3.internal.concurrent.TaskQueue r1 = r10.pushQueue
            r1.shutdown()
            okhttp3.internal.concurrent.TaskQueue r1 = r10.settingsListenerQueue
            r1.shutdown()
            return
        Lb6:
            r1 = move-exception
            monitor-exit(r10)
            throw r1
    }

    public final void flush() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.flush()
            return
    }

    public final boolean getClient$okhttp() {
            r1 = this;
            boolean r0 = r1.client
            return r0
    }

    public final java.lang.String getConnectionName$okhttp() {
            r1 = this;
            java.lang.String r0 = r1.connectionName
            return r0
    }

    public final int getLastGoodStreamId$okhttp() {
            r1 = this;
            int r0 = r1.lastGoodStreamId
            return r0
    }

    public final okhttp3.internal.http2.Http2Connection.Listener getListener$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection$Listener r0 = r1.listener
            return r0
    }

    public final int getNextStreamId$okhttp() {
            r1 = this;
            int r0 = r1.nextStreamId
            return r0
    }

    public final okhttp3.internal.http2.Settings getOkHttpSettings() {
            r1 = this;
            okhttp3.internal.http2.Settings r0 = r1.okHttpSettings
            return r0
    }

    public final okhttp3.internal.http2.Settings getPeerSettings() {
            r1 = this;
            okhttp3.internal.http2.Settings r0 = r1.peerSettings
            return r0
    }

    public final long getReadBytesAcknowledged() {
            r2 = this;
            long r0 = r2.readBytesAcknowledged
            return r0
    }

    public final long getReadBytesTotal() {
            r2 = this;
            long r0 = r2.readBytesTotal
            return r0
    }

    public final okhttp3.internal.http2.Http2Connection.ReaderRunnable getReaderRunnable() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection$ReaderRunnable r0 = r1.readerRunnable
            return r0
    }

    public final java.net.Socket getSocket$okhttp() {
            r1 = this;
            java.net.Socket r0 = r1.socket
            return r0
    }

    public final synchronized okhttp3.internal.http2.Http2Stream getStream(int r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r2.streams     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lf
            okhttp3.internal.http2.Http2Stream r0 = (okhttp3.internal.http2.Http2Stream) r0     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    public final java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> getStreams$okhttp() {
            r1 = this;
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams
            return r0
    }

    public final long getWriteBytesMaximum() {
            r2 = this;
            long r0 = r2.writeBytesMaximum
            return r0
    }

    public final long getWriteBytesTotal() {
            r2 = this;
            long r0 = r2.writeBytesTotal
            return r0
    }

    public final okhttp3.internal.http2.Http2Writer getWriter() {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            return r0
    }

    public final synchronized boolean isHealthy(long r7) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.isShutdown     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r6)
            return r1
        L8:
            long r2 = r6.degradedPongsReceived     // Catch: java.lang.Throwable -> L1b
            long r4 = r6.degradedPingsSent     // Catch: java.lang.Throwable -> L1b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L18
            long r2 = r6.degradedPongDeadlineNs     // Catch: java.lang.Throwable -> L1b
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L18
            monitor-exit(r6)
            return r1
        L18:
            monitor-exit(r6)
            r0 = 1
            return r0
        L1b:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1b
            throw r7
    }

    public final okhttp3.internal.http2.Http2Stream newStream(java.util.List<okhttp3.internal.http2.Header> r2, boolean r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okhttp3.internal.http2.Http2Stream r0 = r1.newStream(r0, r2, r3)
            return r0
    }

    public final synchronized int openStreamCount() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public final void pushDataLater$okhttp(int r20, okio.BufferedSource r21, int r22, boolean r23) throws java.io.IOException {
            r19 = this;
            r8 = r19
            r9 = r21
            r10 = r22
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r11 = r0
            long r0 = (long) r10
            r9.require(r0)
            long r0 = (long) r10
            r9.read(r11, r0)
            okhttp3.internal.concurrent.TaskQueue r12 = r8.pushQueue
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.connectionName
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            r13 = r20
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r1 = "] onData"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            r14 = 0
            r16 = 1
            r17 = 0
            okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1 r18 = new okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            r0 = r18
            r2 = r16
            r3 = r19
            r4 = r20
            r5 = r11
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r18
            okhttp3.internal.concurrent.Task r0 = (okhttp3.internal.concurrent.Task) r0
            r12.schedule(r0, r14)
            return
    }

    public final void pushHeadersLater$okhttp(int r17, java.util.List<okhttp3.internal.http2.Header> r18, boolean r19) {
            r16 = this;
            r7 = r16
            java.lang.String r0 = "requestHeaders"
            r8 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            okhttp3.internal.concurrent.TaskQueue r9 = r7.pushQueue
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.connectionName
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            r10 = r17
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r1 = "] onHeaders"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            r11 = 0
            r13 = 1
            r14 = 0
            okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1 r15 = new okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            r0 = r15
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            okhttp3.internal.concurrent.Task r15 = (okhttp3.internal.concurrent.Task) r15
            r9.schedule(r15, r11)
            return
    }

    public final void pushRequestLater$okhttp(int r14, java.util.List<okhttp3.internal.http2.Header> r15) {
            r13 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            monitor-enter(r13)
            r0 = 0
            java.util.Set<java.lang.Integer> r1 = r13.currentPushRequests     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L1b
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L5f
            r13.writeSynResetLater$okhttp(r14, r1)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r13)
            return
        L1b:
            java.util.Set<java.lang.Integer> r1 = r13.currentPushRequests     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L5f
            r1.add(r2)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r13)
            okhttp3.internal.concurrent.TaskQueue r0 = r13.pushQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r13.connectionName
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 91
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.String r2 = "] onRequest"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r8 = 0
            r10 = 1
            r11 = 0
            okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1 r12 = new okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
            r2 = r12
            r3 = r1
            r4 = r10
            r5 = r13
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            okhttp3.internal.concurrent.Task r12 = (okhttp3.internal.concurrent.Task) r12
            r0.schedule(r12, r8)
            return
        L5f:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
    }

    public final void pushResetLater$okhttp(int r14, okhttp3.internal.http2.ErrorCode r15) {
            r13 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r13.pushQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r13.connectionName
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 91
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.String r2 = "] onReset"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r8 = 0
            r10 = 1
            r11 = 0
            okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1 r12 = new okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            r2 = r12
            r3 = r1
            r4 = r10
            r5 = r13
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            okhttp3.internal.concurrent.Task r12 = (okhttp3.internal.concurrent.Task) r12
            r0.schedule(r12, r8)
            return
    }

    public final okhttp3.internal.http2.Http2Stream pushStream(int r3, java.util.List<okhttp3.internal.http2.Header> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r2.client
            if (r0 != 0) goto Le
            okhttp3.internal.http2.Http2Stream r0 = r2.newStream(r3, r4, r5)
            return r0
        Le:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Client cannot push requests."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean pushedStream$okhttp(int r2) {
            r1 = this;
            if (r2 == 0) goto L8
            r0 = r2 & 1
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final synchronized okhttp3.internal.http2.Http2Stream removeStream$okhttp(int r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r4.streams     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L1c
            okhttp3.internal.http2.Http2Stream r0 = (okhttp3.internal.http2.Http2Stream) r0     // Catch: java.lang.Throwable -> L1c
            r1 = r4
            r2 = 0
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)     // Catch: java.lang.Throwable -> L1c
            r3 = r1
            java.lang.Object r3 = (java.lang.Object) r3     // Catch: java.lang.Throwable -> L1c
            r3.notifyAll()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r4)
            return r0
        L1c:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            throw r5
    }

    public final void sendDegradedPingLater$okhttp() {
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            long r1 = r7.degradedPongsReceived     // Catch: java.lang.Throwable -> L4c
            long r3 = r7.degradedPingsSent     // Catch: java.lang.Throwable -> L4c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto Lc
            monitor-exit(r7)
            return
        Lc:
            long r1 = r7.degradedPingsSent     // Catch: java.lang.Throwable -> L4c
            r3 = 1
            long r1 = r1 + r3
            r7.degradedPingsSent = r1     // Catch: java.lang.Throwable -> L4c
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L4c
            r3 = 1000000000(0x3b9aca00, float:0.0047237873)
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L4c
            long r1 = r1 + r3
            r7.degradedPongDeadlineNs = r1     // Catch: java.lang.Throwable -> L4c
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r7)
            okhttp3.internal.concurrent.TaskQueue r0 = r7.writerQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.connectionName
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " ping"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r4 = 1
            r5 = 0
            okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1 r6 = new okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
            r6.<init>(r1, r4, r7)
            okhttp3.internal.concurrent.Task r6 = (okhttp3.internal.concurrent.Task) r6
            r0.schedule(r6, r2)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }

    public final void setLastGoodStreamId$okhttp(int r1) {
            r0 = this;
            r0.lastGoodStreamId = r1
            return
    }

    public final void setNextStreamId$okhttp(int r1) {
            r0 = this;
            r0.nextStreamId = r1
            return
    }

    public final void setPeerSettings(okhttp3.internal.http2.Settings r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.peerSettings = r2
            return
    }

    public final void setSettings(okhttp3.internal.http2.Settings r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "settings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okhttp3.internal.http2.Http2Writer r0 = r4.writer
            monitor-enter(r0)
            r1 = 0
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            boolean r3 = r4.isShutdown     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L22
            okhttp3.internal.http2.Settings r3 = r4.okHttpSettings     // Catch: java.lang.Throwable -> L28
            r3.merge(r5)     // Catch: java.lang.Throwable -> L28
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            okhttp3.internal.http2.Http2Writer r2 = r4.writer     // Catch: java.lang.Throwable -> L2b
            r2.settings(r5)     // Catch: java.lang.Throwable -> L2b
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            return
        L22:
            okhttp3.internal.http2.ConnectionShutdownException r3 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L28
            r3.<init>()     // Catch: java.lang.Throwable -> L28
            throw r3     // Catch: java.lang.Throwable -> L28
        L28:
            r2 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r2     // Catch: java.lang.Throwable -> L2b
        L2b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void shutdown(okhttp3.internal.http2.ErrorCode r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "statusCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okhttp3.internal.http2.Http2Writer r0 = r6.writer
            monitor-enter(r0)
            r1 = 0
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef     // Catch: java.lang.Throwable -> L34
            r2.<init>()     // Catch: java.lang.Throwable -> L34
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L34
            r3 = 0
            boolean r4 = r6.isShutdown     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L18
        L15:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)
            return
        L18:
            r4 = 1
            r6.isShutdown = r4     // Catch: java.lang.Throwable -> L31
            int r4 = r6.lastGoodStreamId     // Catch: java.lang.Throwable -> L31
            r2.element = r4     // Catch: java.lang.Throwable -> L31
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L31
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L34
            okhttp3.internal.http2.Http2Writer r3 = r6.writer     // Catch: java.lang.Throwable -> L34
            int r4 = r2.element     // Catch: java.lang.Throwable -> L34
            byte[] r5 = okhttp3.internal.Util.EMPTY_BYTE_ARRAY     // Catch: java.lang.Throwable -> L34
            r3.goAway(r4, r7, r5)     // Catch: java.lang.Throwable -> L34
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)
            return
        L31:
            r3 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L34
            throw r3     // Catch: java.lang.Throwable -> L34
        L34:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void start() throws java.io.IOException {
            r3 = this;
            r0 = 0
            r1 = 3
            r2 = 0
            start$default(r3, r2, r0, r1, r0)
            return
    }

    public final void start(boolean r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            r1 = 2
            start$default(r2, r3, r0, r1, r0)
            return
    }

    public final void start(boolean r9, okhttp3.internal.concurrent.TaskRunner r10) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            if (r9 == 0) goto L27
            okhttp3.internal.http2.Http2Writer r0 = r8.writer
            r0.connectionPreface()
            okhttp3.internal.http2.Http2Writer r0 = r8.writer
            okhttp3.internal.http2.Settings r1 = r8.okHttpSettings
            r0.settings(r1)
            okhttp3.internal.http2.Settings r0 = r8.okHttpSettings
            int r0 = r0.getInitialWindowSize()
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 == r1) goto L27
            okhttp3.internal.http2.Http2Writer r2 = r8.writer
            int r1 = r0 - r1
            long r3 = (long) r1
            r1 = 0
            r2.windowUpdate(r1, r3)
        L27:
            okhttp3.internal.concurrent.TaskQueue r0 = r10.newQueue()
            java.lang.String r1 = r8.connectionName
            okhttp3.internal.http2.Http2Connection$ReaderRunnable r2 = r8.readerRunnable
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r3 = 0
            r5 = 1
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue$execute$1 r7 = new okhttp3.internal.concurrent.TaskQueue$execute$1
            r7.<init>(r1, r5, r2)
            okhttp3.internal.concurrent.Task r7 = (okhttp3.internal.concurrent.Task) r7
            r0.schedule(r7, r3)
            return
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long r5) {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.readBytesTotal     // Catch: java.lang.Throwable -> L23
            long r0 = r0 + r5
            r4.readBytesTotal = r0     // Catch: java.lang.Throwable -> L23
            long r0 = r4.readBytesTotal     // Catch: java.lang.Throwable -> L23
            long r2 = r4.readBytesAcknowledged     // Catch: java.lang.Throwable -> L23
            long r0 = r0 - r2
            okhttp3.internal.http2.Settings r2 = r4.okHttpSettings     // Catch: java.lang.Throwable -> L23
            int r2 = r2.getInitialWindowSize()     // Catch: java.lang.Throwable -> L23
            int r2 = r2 / 2
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L23
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L21
            r2 = 0
            r4.writeWindowUpdateLater$okhttp(r2, r0)     // Catch: java.lang.Throwable -> L23
            long r2 = r4.readBytesAcknowledged     // Catch: java.lang.Throwable -> L23
            long r2 = r2 + r0
            r4.readBytesAcknowledged = r2     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r4)
            return
        L23:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            throw r5
    }

    public final void writeData(int r17, boolean r18, okio.Buffer r19, long r20) throws java.io.IOException {
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = 0
            int r0 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            r7 = 0
            if (r0 != 0) goto L15
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.data(r3, r2, r4, r7)
            return
        L15:
            r8 = r20
        L17:
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 <= 0) goto L8c
            r10 = 0
            monitor-enter(r16)
            r11 = 0
        L1f:
            long r12 = r1.writeBytesTotal     // Catch: java.lang.Throwable -> L7a java.lang.InterruptedException -> L7c
            long r14 = r1.writeBytesMaximum     // Catch: java.lang.Throwable -> L7a java.lang.InterruptedException -> L7c
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 < 0) goto L4a
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams     // Catch: java.lang.Throwable -> L7a java.lang.InterruptedException -> L7c
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> L7a java.lang.InterruptedException -> L7c
            boolean r0 = r0.containsKey(r12)     // Catch: java.lang.Throwable -> L7a java.lang.InterruptedException -> L7c
            if (r0 == 0) goto L42
            r0 = r16
            r12 = 0
            java.lang.String r13 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r13)     // Catch: java.lang.Throwable -> L7a java.lang.InterruptedException -> L7c
            r13 = r0
            java.lang.Object r13 = (java.lang.Object) r13     // Catch: java.lang.Throwable -> L7a java.lang.InterruptedException -> L7c
            r13.wait()     // Catch: java.lang.Throwable -> L7a java.lang.InterruptedException -> L7c
            goto L1f
        L42:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L7a java.lang.InterruptedException -> L7c
            java.lang.String r5 = "stream closed"
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L7a java.lang.InterruptedException -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7a java.lang.InterruptedException -> L7c
        L4a:
            long r12 = r1.writeBytesMaximum     // Catch: java.lang.Throwable -> L7a
            long r14 = r1.writeBytesTotal     // Catch: java.lang.Throwable -> L7a
            long r12 = r12 - r14
            long r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L7a
            int r10 = (int) r12     // Catch: java.lang.Throwable -> L7a
            okhttp3.internal.http2.Http2Writer r0 = r1.writer     // Catch: java.lang.Throwable -> L7a
            int r0 = r0.maxDataLength()     // Catch: java.lang.Throwable -> L7a
            int r0 = java.lang.Math.min(r10, r0)     // Catch: java.lang.Throwable -> L7a
            r10 = r0
            long r12 = r1.writeBytesTotal     // Catch: java.lang.Throwable -> L7a
            long r14 = (long) r10     // Catch: java.lang.Throwable -> L7a
            long r12 = r12 + r14
            r1.writeBytesTotal = r12     // Catch: java.lang.Throwable -> L7a
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r16)
            long r11 = (long) r10
            long r8 = r8 - r11
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            if (r3 == 0) goto L75
            int r11 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r11 != 0) goto L75
            r11 = 1
            goto L76
        L75:
            r11 = r7
        L76:
            r0.data(r11, r2, r4, r10)
            goto L17
        L7a:
            r0 = move-exception
            goto L8a
        L7c:
            r0 = move-exception
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L7a
            r5.interrupt()     // Catch: java.lang.Throwable -> L7a
            java.io.InterruptedIOException r5 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L7a
            r5.<init>()     // Catch: java.lang.Throwable -> L7a
            throw r5     // Catch: java.lang.Throwable -> L7a
        L8a:
            monitor-exit(r16)
            throw r0
        L8c:
            return
    }

    public final void writeHeaders$okhttp(int r2, boolean r3, java.util.List<okhttp3.internal.http2.Header> r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "alternating"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.headers(r3, r2, r4)
            return
    }

    public final void writePing() throws java.lang.InterruptedException {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            long r1 = r5.awaitPingsSent     // Catch: java.lang.Throwable -> L13
            r3 = 1
            long r1 = r1 + r3
            r5.awaitPingsSent = r1     // Catch: java.lang.Throwable -> L13
            monitor-exit(r5)
            r0 = 3
            r1 = 1330343787(0x4f4b6f6b, float:3.4130767E9)
            r2 = 0
            r5.writePing(r2, r0, r1)
            return
        L13:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public final void writePing(boolean r2, int r3, int r4) {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer     // Catch: java.io.IOException -> L7
            r0.ping(r2, r3, r4)     // Catch: java.io.IOException -> L7
            goto Lb
        L7:
            r0 = move-exception
            r1.failConnection(r0)
        Lb:
            return
    }

    public final void writePingAndAwaitPong() throws java.lang.InterruptedException {
            r0 = this;
            r0.writePing()
            r0.awaitPong()
            return
    }

    public final void writeSynReset$okhttp(int r2, okhttp3.internal.http2.ErrorCode r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "statusCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.rstStream(r2, r3)
            return
    }

    public final void writeSynResetLater$okhttp(int r14, okhttp3.internal.http2.ErrorCode r15) {
            r13 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r13.writerQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r13.connectionName
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 91
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.String r2 = "] writeSynReset"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r8 = 0
            r10 = 1
            r11 = 0
            okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1 r12 = new okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            r2 = r12
            r3 = r1
            r4 = r10
            r5 = r13
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            okhttp3.internal.concurrent.Task r12 = (okhttp3.internal.concurrent.Task) r12
            r0.schedule(r12, r8)
            return
    }

    public final void writeWindowUpdateLater$okhttp(int r16, long r17) {
            r15 = this;
            r7 = r15
            okhttp3.internal.concurrent.TaskQueue r8 = r7.writerQueue
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.connectionName
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            r9 = r16
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r1 = "] windowUpdate"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            r10 = 0
            r12 = 1
            r13 = 0
            okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1 r14 = new okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            r0 = r14
            r2 = r12
            r3 = r15
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            okhttp3.internal.concurrent.Task r14 = (okhttp3.internal.concurrent.Task) r14
            r8.schedule(r14, r10)
            return
    }
}
