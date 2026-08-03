package okhttp3.internal.ws;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealWebSocket implements okhttp3.WebSocket, okhttp3.internal.ws.WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final okhttp3.internal.ws.RealWebSocket.Companion Companion = null;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final java.util.List<okhttp3.Protocol> ONLY_HTTP1 = null;
    private boolean awaitingPong;
    private okhttp3.Call call;
    private boolean enqueuedClose;
    private okhttp3.internal.ws.WebSocketExtensions extensions;
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
    private okhttp3.internal.ws.WebSocketReader reader;
    private int receivedCloseCode;
    private java.lang.String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private okhttp3.internal.ws.RealWebSocket.Streams streams;
    private okhttp3.internal.concurrent.TaskQueue taskQueue;
    private okhttp3.internal.ws.WebSocketWriter writer;
    private okhttp3.internal.concurrent.Task writerTask;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Message {
        private final okio.ByteString data;
        private final int formatOpcode;

        public Message(int r1, okio.ByteString r2) {
                r0 = this;
                r2.getClass()
                r0.<init>()
                r0.formatOpcode = r1
                r0.data = r2
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

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static abstract class Streams implements java.io.Closeable {
        private final boolean client;
        private final okio.BufferedSink sink;
        private final okio.BufferedSource source;

        public Streams(boolean r1, okio.BufferedSource r2, okio.BufferedSink r3) {
                r0 = this;
                r2.getClass()
                r3.getClass()
                r0.<init>()
                r0.client = r1
                r0.source = r2
                r0.sink = r3
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

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class WriterTask extends okhttp3.internal.concurrent.Task {
        final /* synthetic */ okhttp3.internal.ws.RealWebSocket this$0;

        public WriterTask(okhttp3.internal.ws.RealWebSocket r4) {
                r3 = this;
                r3.this$0 = r4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = okhttp3.internal.ws.RealWebSocket.access$getName$p(r4)
                r0.append(r4)
                java.lang.String r4 = " writer"
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r0 = 2
                r1 = 0
                r2 = 0
                r3.<init>(r4, r2, r0, r1)
                return
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r3 = this;
                okhttp3.internal.ws.RealWebSocket r0 = r3.this$0     // Catch: java.io.IOException -> Lb
                boolean r0 = r0.writeOneFrame$okhttp()     // Catch: java.io.IOException -> Lb
                if (r0 == 0) goto L12
                r0 = 0
                return r0
            Lb:
                r0 = move-exception
                okhttp3.internal.ws.RealWebSocket r1 = r3.this$0
                r2 = 0
                r1.failWebSocket(r0, r2)
            L12:
                r0 = -1
                return r0
        }
    }


    static {
            okhttp3.internal.ws.RealWebSocket$Companion r0 = new okhttp3.internal.ws.RealWebSocket$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.ws.RealWebSocket.Companion = r0
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
            java.util.List r0 = a.a.x0(r0)
            okhttp3.internal.ws.RealWebSocket.ONLY_HTTP1 = r0
            return
    }

    public RealWebSocket(okhttp3.internal.concurrent.TaskRunner r1, okhttp3.Request r2, okhttp3.WebSocketListener r3, java.util.Random r4, long r5, okhttp3.internal.ws.WebSocketExtensions r7, long r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.originalRequest = r2
            r0.listener = r3
            r0.random = r4
            r0.pingIntervalMillis = r5
            r0.extensions = r7
            r0.minimumDeflateSize = r8
            okhttp3.internal.concurrent.TaskQueue r1 = r1.newQueue()
            r0.taskQueue = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.pongQueue = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.messageAndCloseQueue = r1
            r1 = -1
            r0.receivedCloseCode = r1
            java.lang.String r1 = "GET"
            java.lang.String r3 = r2.method()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L56
            okio.ByteString$Companion r2 = okio.ByteString.Companion
            r1 = 16
            byte[] r3 = new byte[r1]
            r4.nextBytes(r3)
            r6 = 3
            r7 = 0
            r4 = 0
            r5 = 0
            okio.ByteString r1 = okio.ByteString.Companion.of$default(r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = r1.base64()
            r0.key = r1
            return
        L56:
            java.lang.String r1 = "Request must be GET: "
            java.lang.String r2 = r2.method()
            j8.o.z(r2, r1)
            r1 = 0
            throw r1
    }

    public static final /* synthetic */ java.util.ArrayDeque access$getMessageAndCloseQueue$p(okhttp3.internal.ws.RealWebSocket r0) {
            java.util.ArrayDeque<java.lang.Object> r0 = r0.messageAndCloseQueue
            return r0
    }

    public static final /* synthetic */ java.lang.String access$getName$p(okhttp3.internal.ws.RealWebSocket r0) {
            java.lang.String r0 = r0.name
            return r0
    }

    public static final /* synthetic */ boolean access$isValid(okhttp3.internal.ws.RealWebSocket r0, okhttp3.internal.ws.WebSocketExtensions r1) {
            boolean r0 = r0.isValid(r1)
            return r0
    }

    public static final /* synthetic */ void access$setExtensions$p(okhttp3.internal.ws.RealWebSocket r0, okhttp3.internal.ws.WebSocketExtensions r1) {
            r0.extensions = r1
            return
    }

    private final boolean isValid(okhttp3.internal.ws.WebSocketExtensions r6) {
            r5 = this;
            boolean r0 = r6.unknownValues
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Integer r0 = r6.clientMaxWindowBits
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.Integer r0 = r6.serverMaxWindowBits
            r2 = 1
            if (r0 == 0) goto L27
            lg.d r0 = new lg.d
            r3 = 15
            r4 = 8
            r0.<init>(r4, r3, r2)
            java.lang.Integer r6 = r6.serverMaxWindowBits
            int r6 = r6.intValue()
            if (r4 > r6) goto L26
            int r0 = r0.f8043h
            if (r6 > r0) goto L26
            goto L27
        L26:
            return r1
        L27:
            return r2
    }

    private final void runWriter() {
            r8 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L19
            boolean r0 = java.lang.Thread.holdsLock(r8)
            if (r0 == 0) goto Lb
            goto L19
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " MUST hold lock on "
            j8.o.i(r0, r1, r8)
            return
        L19:
            okhttp3.internal.concurrent.Task r3 = r8.writerTask
            if (r3 == 0) goto L26
            okhttp3.internal.concurrent.TaskQueue r2 = r8.taskQueue
            r6 = 2
            r7 = 0
            r4 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r2, r3, r4, r6, r7)
        L26:
            return
    }

    private final synchronized boolean send(okio.ByteString r7, int r8) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch: java.lang.Throwable -> L22
            r1 = 0
            if (r0 != 0) goto L3e
            boolean r0 = r6.enqueuedClose     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto Lb
            goto L3e
        Lb:
            long r2 = r6.queueSize     // Catch: java.lang.Throwable -> L22
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L22
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L22
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L24
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r6)
            return r1
        L22:
            r7 = move-exception
            goto L40
        L24:
            long r0 = r6.queueSize     // Catch: java.lang.Throwable -> L22
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L22
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L22
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch: java.lang.Throwable -> L22
            okhttp3.internal.ws.RealWebSocket$Message r1 = new okhttp3.internal.ws.RealWebSocket$Message     // Catch: java.lang.Throwable -> L22
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L22
            r0.add(r1)     // Catch: java.lang.Throwable -> L22
            r6.runWriter()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r6)
            r7 = 1
            return r7
        L3e:
            monitor-exit(r6)
            return r1
        L40:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L22
            throw r7
    }

    public final void awaitTermination(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            r4.getClass()
            okhttp3.internal.concurrent.TaskQueue r0 = r1.taskQueue
            java.util.concurrent.CountDownLatch r0 = r0.idleLatch()
            r0.await(r2, r4)
            return
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
            r1 = this;
            okhttp3.Call r0 = r1.call
            r0.getClass()
            r0.cancel()
            return
    }

    public final void checkUpgradeSuccess$okhttp(okhttp3.Response r7, okhttp3.internal.connection.Exchange r8) {
            r6 = this;
            r7.getClass()
            int r0 = r7.code()
            r1 = 101(0x65, float:1.42E-43)
            r2 = 39
            if (r0 != r1) goto Lae
            java.lang.String r0 = "Connection"
            r1 = 0
            r3 = 2
            java.lang.String r0 = okhttp3.Response.header$default(r7, r0, r1, r3, r1)
            java.lang.String r4 = "Upgrade"
            boolean r5 = r4.equalsIgnoreCase(r0)
            if (r5 == 0) goto L97
            java.lang.String r0 = okhttp3.Response.header$default(r7, r4, r1, r3, r1)
            java.lang.String r4 = "websocket"
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 == 0) goto L80
            java.lang.String r0 = "Sec-WebSocket-Accept"
            java.lang.String r7 = okhttp3.Response.header$default(r7, r0, r1, r3, r1)
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r6.key
            r1.append(r3)
            java.lang.String r3 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okio.ByteString r0 = r0.sha1()
            java.lang.String r0 = r0.base64()
            boolean r1 = gg.l.a(r0, r7)
            if (r1 == 0) goto L61
            if (r8 == 0) goto L59
            return
        L59:
            java.net.ProtocolException r7 = new java.net.ProtocolException
            java.lang.String r8 = "Web Socket exchange missing: bad interceptor?"
            r7.<init>(r8)
            throw r7
        L61:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected 'Sec-WebSocket-Accept' header value '"
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = "' but was '"
            r1.append(r0)
            r1.append(r7)
            r1.append(r2)
            java.lang.String r7 = r1.toString()
            r8.<init>(r7)
            throw r8
        L80:
            java.net.ProtocolException r7 = new java.net.ProtocolException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected 'Upgrade' header value 'websocket' but was '"
            r8.<init>(r1)
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L97:
            java.net.ProtocolException r7 = new java.net.ProtocolException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected 'Connection' header value 'Upgrade' but was '"
            r8.<init>(r1)
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Lae:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            int r0 = r7.code()
            java.lang.String r7 = r7.message()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected HTTP 101 response but was '"
            r1.<init>(r3)
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            r1.append(r7)
            r1.append(r2)
            java.lang.String r7 = r1.toString()
            r8.<init>(r7)
            throw r8
    }

    @Override // okhttp3.WebSocket
    public boolean close(int r3, java.lang.String r4) {
            r2 = this;
            r0 = 60000(0xea60, double:2.9644E-319)
            boolean r3 = r2.close(r3, r4, r0)
            return r3
    }

    public final synchronized boolean close(int r7, java.lang.String r8, long r9) {
            r6 = this;
            java.lang.String r0 = "reason.size() > 123: "
            monitor-enter(r6)
            okhttp3.internal.ws.WebSocketProtocol r1 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE     // Catch: java.lang.Throwable -> L2a
            r1.validateCloseCode(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto L2c
            okio.ByteString$Companion r1 = okio.ByteString.Companion     // Catch: java.lang.Throwable -> L2a
            okio.ByteString r1 = r1.encodeUtf8(r8)     // Catch: java.lang.Throwable -> L2a
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L2a
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L2a
            r4 = 123(0x7b, double:6.1E-322)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L1c
            goto L2d
        L1c:
            java.lang.String r7 = r0.concat(r8)     // Catch: java.lang.Throwable -> L2a
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L2a
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L2a
            throw r8     // Catch: java.lang.Throwable -> L2a
        L2a:
            r7 = move-exception
            goto L4b
        L2c:
            r1 = 0
        L2d:
            boolean r8 = r6.failed     // Catch: java.lang.Throwable -> L2a
            if (r8 != 0) goto L48
            boolean r8 = r6.enqueuedClose     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto L36
            goto L48
        L36:
            r8 = 1
            r6.enqueuedClose = r8     // Catch: java.lang.Throwable -> L2a
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch: java.lang.Throwable -> L2a
            okhttp3.internal.ws.RealWebSocket$Close r2 = new okhttp3.internal.ws.RealWebSocket$Close     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r7, r1, r9)     // Catch: java.lang.Throwable -> L2a
            r0.add(r2)     // Catch: java.lang.Throwable -> L2a
            r6.runWriter()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r6)
            return r8
        L48:
            monitor-exit(r6)
            r7 = 0
            return r7
        L4b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2a
            throw r7
    }

    public final void connect(okhttp3.OkHttpClient r5) {
            r4 = this;
            r5.getClass()
            okhttp3.Request r0 = r4.originalRequest
            java.lang.String r1 = "Sec-WebSocket-Extensions"
            java.lang.String r0 = r0.header(r1)
            if (r0 == 0) goto L19
            java.net.ProtocolException r5 = new java.net.ProtocolException
            java.lang.String r0 = "Request header not permitted: 'Sec-WebSocket-Extensions'"
            r5.<init>(r0)
            r0 = 0
            r4.failWebSocket(r5, r0)
            return
        L19:
            okhttp3.OkHttpClient$Builder r5 = r5.newBuilder()
            okhttp3.EventListener r0 = okhttp3.EventListener.NONE
            okhttp3.OkHttpClient$Builder r5 = r5.eventListener(r0)
            java.util.List<okhttp3.Protocol> r0 = okhttp3.internal.ws.RealWebSocket.ONLY_HTTP1
            okhttp3.OkHttpClient$Builder r5 = r5.protocols(r0)
            okhttp3.OkHttpClient r5 = r5.build()
            okhttp3.Request r0 = r4.originalRequest
            okhttp3.Request$Builder r0 = r0.newBuilder()
            java.lang.String r2 = "websocket"
            java.lang.String r3 = "Upgrade"
            okhttp3.Request$Builder r0 = r0.header(r3, r2)
            java.lang.String r2 = "Connection"
            okhttp3.Request$Builder r0 = r0.header(r2, r3)
            java.lang.String r2 = "Sec-WebSocket-Key"
            java.lang.String r3 = r4.key
            okhttp3.Request$Builder r0 = r0.header(r2, r3)
            java.lang.String r2 = "Sec-WebSocket-Version"
            java.lang.String r3 = "13"
            okhttp3.Request$Builder r0 = r0.header(r2, r3)
            java.lang.String r2 = "permessage-deflate"
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            okhttp3.Request r0 = r0.build()
            okhttp3.internal.connection.RealCall r1 = new okhttp3.internal.connection.RealCall
            r2 = 1
            r1.<init>(r5, r0, r2)
            r4.call = r1
            okhttp3.internal.ws.RealWebSocket$connect$1 r5 = new okhttp3.internal.ws.RealWebSocket$connect$1
            r5.<init>(r4, r0)
            r1.enqueue(r5)
            return
    }

    public final void failWebSocket(java.lang.Exception r5, okhttp3.Response r6) {
            r4 = this;
            r5.getClass()
            monitor-enter(r4)
            boolean r0 = r4.failed     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto La
            monitor-exit(r4)
            return
        La:
            r0 = 1
            r4.failed = r0     // Catch: java.lang.Throwable -> L46
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r4.streams     // Catch: java.lang.Throwable -> L46
            r1 = 0
            r4.streams = r1     // Catch: java.lang.Throwable -> L46
            okhttp3.internal.ws.WebSocketReader r2 = r4.reader     // Catch: java.lang.Throwable -> L46
            r4.reader = r1     // Catch: java.lang.Throwable -> L46
            okhttp3.internal.ws.WebSocketWriter r3 = r4.writer     // Catch: java.lang.Throwable -> L46
            r4.writer = r1     // Catch: java.lang.Throwable -> L46
            okhttp3.internal.concurrent.TaskQueue r1 = r4.taskQueue     // Catch: java.lang.Throwable -> L46
            r1.shutdown()     // Catch: java.lang.Throwable -> L46
            monitor-exit(r4)
            okhttp3.WebSocketListener r1 = r4.listener     // Catch: java.lang.Throwable -> L35
            r1.onFailure(r4, r5, r6)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L2a
            okhttp3.internal.Util.closeQuietly(r0)
        L2a:
            if (r2 == 0) goto L2f
            okhttp3.internal.Util.closeQuietly(r2)
        L2f:
            if (r3 == 0) goto L34
            okhttp3.internal.Util.closeQuietly(r3)
        L34:
            return
        L35:
            r5 = move-exception
            if (r0 == 0) goto L3b
            okhttp3.internal.Util.closeQuietly(r0)
        L3b:
            if (r2 == 0) goto L40
            okhttp3.internal.Util.closeQuietly(r2)
        L40:
            if (r3 == 0) goto L45
            okhttp3.internal.Util.closeQuietly(r3)
        L45:
            throw r5
        L46:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final okhttp3.WebSocketListener getListener$okhttp() {
            r1 = this;
            okhttp3.WebSocketListener r0 = r1.listener
            return r0
    }

    public final void initReaderAndWriter(java.lang.String r11, okhttp3.internal.ws.RealWebSocket.Streams r12) {
            r10 = this;
            java.lang.String r0 = " ping"
            r11.getClass()
            r12.getClass()
            okhttp3.internal.ws.WebSocketExtensions r1 = r10.extensions
            r1.getClass()
            monitor-enter(r10)
            r10.name = r11     // Catch: java.lang.Throwable -> L81
            r10.streams = r12     // Catch: java.lang.Throwable -> L81
            okhttp3.internal.ws.WebSocketWriter r2 = new okhttp3.internal.ws.WebSocketWriter     // Catch: java.lang.Throwable -> L81
            boolean r3 = r12.getClient()     // Catch: java.lang.Throwable -> L81
            okio.BufferedSink r4 = r12.getSink()     // Catch: java.lang.Throwable -> L81
            java.util.Random r5 = r10.random     // Catch: java.lang.Throwable -> L81
            boolean r6 = r1.perMessageDeflate     // Catch: java.lang.Throwable -> L81
            boolean r7 = r12.getClient()     // Catch: java.lang.Throwable -> L81
            boolean r7 = r1.noContextTakeover(r7)     // Catch: java.lang.Throwable -> L81
            long r8 = r10.minimumDeflateSize     // Catch: java.lang.Throwable -> L81
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L81
            r10.writer = r2     // Catch: java.lang.Throwable -> L81
            okhttp3.internal.ws.RealWebSocket$WriterTask r2 = new okhttp3.internal.ws.RealWebSocket$WriterTask     // Catch: java.lang.Throwable -> L81
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L81
            r10.writerTask = r2     // Catch: java.lang.Throwable -> L81
            long r2 = r10.pingIntervalMillis     // Catch: java.lang.Throwable -> L81
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L57
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L53
            long r2 = r4.toNanos(r2)     // Catch: java.lang.Throwable -> L53
            okhttp3.internal.concurrent.TaskQueue r4 = r10.taskQueue     // Catch: java.lang.Throwable -> L53
            java.lang.String r11 = r11.concat(r0)     // Catch: java.lang.Throwable -> L53
            okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1 r0 = new okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1     // Catch: java.lang.Throwable -> L53
            r0.<init>(r11, r10, r2)     // Catch: java.lang.Throwable -> L53
            r4.schedule(r0, r2)     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r0 = move-exception
            r11 = r0
            r3 = r10
            goto L84
        L57:
            java.util.ArrayDeque<java.lang.Object> r11 = r10.messageAndCloseQueue     // Catch: java.lang.Throwable -> L81
            boolean r11 = r11.isEmpty()     // Catch: java.lang.Throwable -> L81
            if (r11 != 0) goto L62
            r10.runWriter()     // Catch: java.lang.Throwable -> L53
        L62:
            monitor-exit(r10)
            okhttp3.internal.ws.WebSocketReader r0 = new okhttp3.internal.ws.WebSocketReader
            r11 = r1
            boolean r1 = r12.getClient()
            okio.BufferedSource r2 = r12.getSource()
            boolean r4 = r11.perMessageDeflate
            boolean r12 = r12.getClient()
            r12 = r12 ^ 1
            boolean r5 = r11.noContextTakeover(r12)
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r3.reader = r0
            return
        L81:
            r0 = move-exception
            r3 = r10
            r11 = r0
        L84:
            monitor-exit(r10)
            throw r11
    }

    public final void loopReader() {
            r2 = this;
        L0:
            int r0 = r2.receivedCloseCode
            r1 = -1
            if (r0 != r1) goto Le
            okhttp3.internal.ws.WebSocketReader r0 = r2.reader
            r0.getClass()
            r0.processNextFrame()
            goto L0
        Le:
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int r5, java.lang.String r6) {
            r4 = this;
            r6.getClass()
            r0 = -1
            if (r5 == r0) goto L6d
            monitor-enter(r4)
            int r1 = r4.receivedCloseCode     // Catch: java.lang.Throwable -> L2f
            if (r1 != r0) goto L63
            r4.receivedCloseCode = r5     // Catch: java.lang.Throwable -> L2f
            r4.receivedCloseReason = r6     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r4.enqueuedClose     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            if (r0 == 0) goto L31
            java.util.ArrayDeque<java.lang.Object> r0 = r4.messageAndCloseQueue     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L31
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r4.streams     // Catch: java.lang.Throwable -> L2f
            r4.streams = r1     // Catch: java.lang.Throwable -> L2f
            okhttp3.internal.ws.WebSocketReader r2 = r4.reader     // Catch: java.lang.Throwable -> L2f
            r4.reader = r1     // Catch: java.lang.Throwable -> L2f
            okhttp3.internal.ws.WebSocketWriter r3 = r4.writer     // Catch: java.lang.Throwable -> L2f
            r4.writer = r1     // Catch: java.lang.Throwable -> L2f
            okhttp3.internal.concurrent.TaskQueue r1 = r4.taskQueue     // Catch: java.lang.Throwable -> L2f
            r1.shutdown()     // Catch: java.lang.Throwable -> L2f
            r1 = r0
            goto L33
        L2f:
            r5 = move-exception
            goto L6b
        L31:
            r2 = r1
            r3 = r2
        L33:
            monitor-exit(r4)
            okhttp3.WebSocketListener r0 = r4.listener     // Catch: java.lang.Throwable -> L41
            r0.onClosing(r4, r5, r6)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L43
            okhttp3.WebSocketListener r0 = r4.listener     // Catch: java.lang.Throwable -> L41
            r0.onClosed(r4, r5, r6)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r5 = move-exception
            goto L53
        L43:
            if (r1 == 0) goto L48
            okhttp3.internal.Util.closeQuietly(r1)
        L48:
            if (r2 == 0) goto L4d
            okhttp3.internal.Util.closeQuietly(r2)
        L4d:
            if (r3 == 0) goto L52
            okhttp3.internal.Util.closeQuietly(r3)
        L52:
            return
        L53:
            if (r1 == 0) goto L58
            okhttp3.internal.Util.closeQuietly(r1)
        L58:
            if (r2 == 0) goto L5d
            okhttp3.internal.Util.closeQuietly(r2)
        L5d:
            if (r3 == 0) goto L62
            okhttp3.internal.Util.closeQuietly(r3)
        L62:
            throw r5
        L63:
            java.lang.String r5 = "already closed"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2f
            throw r6     // Catch: java.lang.Throwable -> L2f
        L6b:
            monitor-exit(r4)
            throw r5
        L6d:
            java.lang.String r5 = "Failed requirement."
            j8.o.t(r5)
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            okhttp3.WebSocketListener r0 = r1.listener
            r0.onMessage(r1, r2)
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(okio.ByteString r2) {
            r1 = this;
            r2.getClass()
            okhttp3.WebSocketListener r0 = r1.listener
            r0.onMessage(r1, r2)
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            r2.getClass()     // Catch: java.lang.Throwable -> L15
            boolean r0 = r1.failed     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L27
            boolean r0 = r1.enqueuedClose     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            goto L27
        L15:
            r2 = move-exception
            goto L29
        L17:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch: java.lang.Throwable -> L15
            r0.add(r2)     // Catch: java.lang.Throwable -> L15
            r1.runWriter()     // Catch: java.lang.Throwable -> L15
            int r2 = r1.receivedPingCount     // Catch: java.lang.Throwable -> L15
            int r2 = r2 + 1
            r1.receivedPingCount = r2     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return
        L27:
            monitor-exit(r1)
            return
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(okio.ByteString r1) {
            r0 = this;
            monitor-enter(r0)
            r1.getClass()     // Catch: java.lang.Throwable -> Lf
            int r1 = r0.receivedPongCount     // Catch: java.lang.Throwable -> Lf
            int r1 = r1 + 1
            r0.receivedPongCount = r1     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            r0.awaitingPong = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public final synchronized boolean pong(okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            r2.getClass()     // Catch: java.lang.Throwable -> L15
            boolean r0 = r1.failed     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L22
            boolean r0 = r1.enqueuedClose     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            goto L22
        L15:
            r2 = move-exception
            goto L25
        L17:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch: java.lang.Throwable -> L15
            r0.add(r2)     // Catch: java.lang.Throwable -> L15
            r1.runWriter()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            r2 = 1
            return r2
        L22:
            monitor-exit(r1)
            r2 = 0
            return r2
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    public final boolean processNextFrame() {
            r3 = this;
            r0 = 0
            okhttp3.internal.ws.WebSocketReader r1 = r3.reader     // Catch: java.lang.Exception -> L10
            r1.getClass()     // Catch: java.lang.Exception -> L10
            r1.processNextFrame()     // Catch: java.lang.Exception -> L10
            int r1 = r3.receivedCloseCode     // Catch: java.lang.Exception -> L10
            r2 = -1
            if (r1 != r2) goto Lf
            r0 = 1
        Lf:
            return r0
        L10:
            r1 = move-exception
            r2 = 0
            r3.failWebSocket(r1, r2)
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
    public boolean send(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r2 = r0.encodeUtf8(r2)
            r0 = 1
            boolean r2 = r1.send(r2, r0)
            return r2
    }

    @Override // okhttp3.WebSocket
    public boolean send(okio.ByteString r2) {
            r1 = this;
            r2.getClass()
            r0 = 2
            boolean r2 = r1.send(r2, r0)
            return r2
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

    public final void tearDown() {
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

    public final boolean writeOneFrame$okhttp() {
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.failed     // Catch: java.lang.Throwable -> L38
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r12)
            return r1
        L8:
            okhttp3.internal.ws.WebSocketWriter r0 = r12.writer     // Catch: java.lang.Throwable -> L38
            java.util.ArrayDeque<okio.ByteString> r2 = r12.pongQueue     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L38
            r3 = 1
            r4 = 0
            r5 = -1
            if (r2 != 0) goto L73
            java.util.ArrayDeque<java.lang.Object> r6 = r12.messageAndCloseQueue     // Catch: java.lang.Throwable -> L38
            java.lang.Object r6 = r6.poll()     // Catch: java.lang.Throwable -> L38
            boolean r7 = r6 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L69
            int r1 = r12.receivedCloseCode     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r12.receivedCloseReason     // Catch: java.lang.Throwable -> L38
            if (r1 == r5) goto L3b
            okhttp3.internal.ws.RealWebSocket$Streams r5 = r12.streams     // Catch: java.lang.Throwable -> L38
            r12.streams = r4     // Catch: java.lang.Throwable -> L38
            okhttp3.internal.ws.WebSocketReader r8 = r12.reader     // Catch: java.lang.Throwable -> L38
            r12.reader = r4     // Catch: java.lang.Throwable -> L38
            okhttp3.internal.ws.WebSocketWriter r9 = r12.writer     // Catch: java.lang.Throwable -> L38
            r12.writer = r4     // Catch: java.lang.Throwable -> L38
            okhttp3.internal.concurrent.TaskQueue r4 = r12.taskQueue     // Catch: java.lang.Throwable -> L38
            r4.shutdown()     // Catch: java.lang.Throwable -> L38
        L36:
            r4 = r6
            goto L78
        L38:
            r0 = move-exception
            goto Lf2
        L3b:
            r5 = r6
            okhttp3.internal.ws.RealWebSocket$Close r5 = (okhttp3.internal.ws.RealWebSocket.Close) r5     // Catch: java.lang.Throwable -> L38
            long r8 = r5.getCancelAfterCloseMillis()     // Catch: java.lang.Throwable -> L38
            okhttp3.internal.concurrent.TaskQueue r5 = r12.taskQueue     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r10.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r11 = r12.name     // Catch: java.lang.Throwable -> L38
            r10.append(r11)     // Catch: java.lang.Throwable -> L38
            java.lang.String r11 = " cancel"
            r10.append(r11)     // Catch: java.lang.Throwable -> L38
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L38
            long r8 = r11.toNanos(r8)     // Catch: java.lang.Throwable -> L38
            okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1 r11 = new okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1     // Catch: java.lang.Throwable -> L38
            r11.<init>(r10, r3, r12)     // Catch: java.lang.Throwable -> L38
            r5.schedule(r11, r8)     // Catch: java.lang.Throwable -> L38
            r5 = r4
            r8 = r5
            r9 = r8
            goto L36
        L69:
            if (r6 != 0) goto L6d
            monitor-exit(r12)
            return r1
        L6d:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = r5
            r5 = r9
            goto L36
        L73:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = r5
            r5 = r9
        L78:
            monitor-exit(r12)
            if (r2 == 0) goto L86
            r0.getClass()     // Catch: java.lang.Throwable -> L84
            okio.ByteString r2 = (okio.ByteString) r2     // Catch: java.lang.Throwable -> L84
            r0.writePong(r2)     // Catch: java.lang.Throwable -> L84
            goto Lcc
        L84:
            r0 = move-exception
            goto Le2
        L86:
            boolean r2 = r4 instanceof okhttp3.internal.ws.RealWebSocket.Message     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto Lae
            okhttp3.internal.ws.RealWebSocket$Message r4 = (okhttp3.internal.ws.RealWebSocket.Message) r4     // Catch: java.lang.Throwable -> L84
            r0.getClass()     // Catch: java.lang.Throwable -> L84
            int r1 = r4.getFormatOpcode()     // Catch: java.lang.Throwable -> L84
            okio.ByteString r2 = r4.getData()     // Catch: java.lang.Throwable -> L84
            r0.writeMessageFrame(r1, r2)     // Catch: java.lang.Throwable -> L84
            monitor-enter(r12)     // Catch: java.lang.Throwable -> L84
            long r0 = r12.queueSize     // Catch: java.lang.Throwable -> Lab
            okio.ByteString r2 = r4.getData()     // Catch: java.lang.Throwable -> Lab
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lab
            long r6 = (long) r2     // Catch: java.lang.Throwable -> Lab
            long r0 = r0 - r6
            r12.queueSize = r0     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L84
            goto Lcc
        Lab:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L84
        Lae:
            boolean r2 = r4 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto Ldc
            okhttp3.internal.ws.RealWebSocket$Close r4 = (okhttp3.internal.ws.RealWebSocket.Close) r4     // Catch: java.lang.Throwable -> L84
            r0.getClass()     // Catch: java.lang.Throwable -> L84
            int r2 = r4.getCode()     // Catch: java.lang.Throwable -> L84
            okio.ByteString r4 = r4.getReason()     // Catch: java.lang.Throwable -> L84
            r0.writeClose(r2, r4)     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto Lcc
            okhttp3.WebSocketListener r0 = r12.listener     // Catch: java.lang.Throwable -> L84
            r7.getClass()     // Catch: java.lang.Throwable -> L84
            r0.onClosed(r12, r1, r7)     // Catch: java.lang.Throwable -> L84
        Lcc:
            if (r5 == 0) goto Ld1
            okhttp3.internal.Util.closeQuietly(r5)
        Ld1:
            if (r8 == 0) goto Ld6
            okhttp3.internal.Util.closeQuietly(r8)
        Ld6:
            if (r9 == 0) goto Ldb
            okhttp3.internal.Util.closeQuietly(r9)
        Ldb:
            return r3
        Ldc:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L84
            r0.<init>()     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L84
        Le2:
            if (r5 == 0) goto Le7
            okhttp3.internal.Util.closeQuietly(r5)
        Le7:
            if (r8 == 0) goto Lec
            okhttp3.internal.Util.closeQuietly(r8)
        Lec:
            if (r9 == 0) goto Lf1
            okhttp3.internal.Util.closeQuietly(r9)
        Lf1:
            throw r0
        Lf2:
            monitor-exit(r12)
            throw r0
    }

    public final void writePingFrame$okhttp() {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.failed     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L7
            monitor-exit(r7)
            return
        L7:
            okhttp3.internal.ws.WebSocketWriter r0 = r7.writer     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto Ld
            monitor-exit(r7)
            return
        Ld:
            boolean r1 = r7.awaitingPong     // Catch: java.lang.Throwable -> L15
            r2 = -1
            if (r1 == 0) goto L17
            int r1 = r7.sentPingCount     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r0 = move-exception
            goto L50
        L17:
            r1 = r2
        L18:
            int r3 = r7.sentPingCount     // Catch: java.lang.Throwable -> L15
            r4 = 1
            int r3 = r3 + r4
            r7.sentPingCount = r3     // Catch: java.lang.Throwable -> L15
            r7.awaitingPong = r4     // Catch: java.lang.Throwable -> L15
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L45
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.<init>(r5)
            long r5 = r7.pingIntervalMillis
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            java.lang.String r4 = " successful ping/pongs)"
            java.lang.String r1 = j8.b.j(r2, r1, r4)
            r0.<init>(r1)
            r7.failWebSocket(r0, r3)
            return
        L45:
            okio.ByteString r1 = okio.ByteString.EMPTY     // Catch: java.io.IOException -> L4b
            r0.writePing(r1)     // Catch: java.io.IOException -> L4b
            return
        L4b:
            r0 = move-exception
            r7.failWebSocket(r0, r3)
            return
        L50:
            monitor-exit(r7)
            throw r0
    }
}
