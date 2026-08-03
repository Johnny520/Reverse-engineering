package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
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

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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

        public Builder(boolean r1, okhttp3.internal.concurrent.TaskRunner r2) {
                r0 = this;
                r2.getClass()
                r0.<init>()
                r0.client = r1
                r0.taskRunner = r2
                okhttp3.internal.http2.Http2Connection$Listener r1 = okhttp3.internal.http2.Http2Connection.Listener.REFUSE_INCOMING_STREAMS
                r0.listener = r1
                okhttp3.internal.http2.PushObserver r1 = okhttp3.internal.http2.PushObserver.CANCEL
                r0.pushObserver = r1
                return
        }

        public static /* synthetic */ okhttp3.internal.http2.Http2Connection.Builder socket$default(okhttp3.internal.http2.Http2Connection.Builder r0, java.net.Socket r1, java.lang.String r2, okio.BufferedSource r3, okio.BufferedSink r4, int r5, java.lang.Object r6) {
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
                gg.l.g(r0)
                r0 = 0
                throw r0
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
                gg.l.g(r0)
                r0 = 0
                throw r0
        }

        public final java.net.Socket getSocket$okhttp() {
                r1 = this;
                java.net.Socket r0 = r1.socket
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "socket"
                gg.l.g(r0)
                r0 = 0
                throw r0
        }

        public final okio.BufferedSource getSource$okhttp() {
                r1 = this;
                okio.BufferedSource r0 = r1.source
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "source"
                gg.l.g(r0)
                r0 = 0
                throw r0
        }

        public final okhttp3.internal.concurrent.TaskRunner getTaskRunner$okhttp() {
                r1 = this;
                okhttp3.internal.concurrent.TaskRunner r0 = r1.taskRunner
                return r0
        }

        public final okhttp3.internal.http2.Http2Connection.Builder listener(okhttp3.internal.http2.Http2Connection.Listener r1) {
                r0 = this;
                r1.getClass()
                r0.listener = r1
                return r0
        }

        public final okhttp3.internal.http2.Http2Connection.Builder pingIntervalMillis(int r1) {
                r0 = this;
                r0.pingIntervalMillis = r1
                return r0
        }

        public final okhttp3.internal.http2.Http2Connection.Builder pushObserver(okhttp3.internal.http2.PushObserver r1) {
                r0 = this;
                r1.getClass()
                r0.pushObserver = r1
                return r0
        }

        public final void setClient$okhttp(boolean r1) {
                r0 = this;
                r0.client = r1
                return
        }

        public final void setConnectionName$okhttp(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                r0.connectionName = r1
                return
        }

        public final void setListener$okhttp(okhttp3.internal.http2.Http2Connection.Listener r1) {
                r0 = this;
                r1.getClass()
                r0.listener = r1
                return
        }

        public final void setPingIntervalMillis$okhttp(int r1) {
                r0 = this;
                r0.pingIntervalMillis = r1
                return
        }

        public final void setPushObserver$okhttp(okhttp3.internal.http2.PushObserver r1) {
                r0 = this;
                r1.getClass()
                r0.pushObserver = r1
                return
        }

        public final void setSink$okhttp(okio.BufferedSink r1) {
                r0 = this;
                r1.getClass()
                r0.sink = r1
                return
        }

        public final void setSocket$okhttp(java.net.Socket r1) {
                r0 = this;
                r1.getClass()
                r0.socket = r1
                return
        }

        public final void setSource$okhttp(okio.BufferedSource r1) {
                r0 = this;
                r1.getClass()
                r0.source = r1
                return
        }

        public final okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket r8) {
                r7 = this;
                r8.getClass()
                r5 = 14
                r6 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r0 = r7
                r1 = r8
                okhttp3.internal.http2.Http2Connection$Builder r8 = socket$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }

        public final okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket r8, java.lang.String r9) {
                r7 = this;
                r8.getClass()
                r9.getClass()
                r5 = 12
                r6 = 0
                r3 = 0
                r4 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                okhttp3.internal.http2.Http2Connection$Builder r8 = socket$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }

        public final okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket r8, java.lang.String r9, okio.BufferedSource r10) {
                r7 = this;
                r8.getClass()
                r9.getClass()
                r10.getClass()
                r5 = 8
                r6 = 0
                r4 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                okhttp3.internal.http2.Http2Connection$Builder r8 = socket$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }

        public final okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket r2, java.lang.String r3, okio.BufferedSource r4, okio.BufferedSink r5) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r4.getClass()
                r5.getClass()
                r1.setSocket$okhttp(r2)
                boolean r2 = r1.client
                if (r2 == 0) goto L2a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = okhttp3.internal.Util.okHttpName
                r2.append(r0)
                r0 = 32
                r2.append(r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                goto L30
            L2a:
                java.lang.String r2 = "MockWebServer "
                java.lang.String r2 = r2.concat(r3)
            L30:
                r1.setConnectionName$okhttp(r2)
                r1.setSource$okhttp(r4)
                r1.setSink$okhttp(r5)
                return r1
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

        public final okhttp3.internal.http2.Settings getDEFAULT_SETTINGS() {
                r1 = this;
                okhttp3.internal.http2.Settings r0 = okhttp3.internal.http2.Http2Connection.access$getDEFAULT_SETTINGS$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static abstract class Listener {
        public static final okhttp3.internal.http2.Http2Connection.Listener.Companion Companion = null;
        public static final okhttp3.internal.http2.Http2Connection.Listener REFUSE_INCOMING_STREAMS = null;

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

        static {
                okhttp3.internal.http2.Http2Connection$Listener$Companion r0 = new okhttp3.internal.http2.Http2Connection$Listener$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.internal.http2.Http2Connection.Listener.Companion = r0
                okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 r0 = new okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
                r0.<init>()
                okhttp3.internal.http2.Http2Connection.Listener.REFUSE_INCOMING_STREAMS = r0
                return
        }

        public Listener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onSettings(okhttp3.internal.http2.Http2Connection r1, okhttp3.internal.http2.Settings r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                return
        }

        public abstract void onStream(okhttp3.internal.http2.Http2Stream r1);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class ReaderRunnable implements okhttp3.internal.http2.Http2Reader.Handler, fg.a {
        private final okhttp3.internal.http2.Http2Reader reader;
        final /* synthetic */ okhttp3.internal.http2.Http2Connection this$0;

        public ReaderRunnable(okhttp3.internal.http2.Http2Connection r1, okhttp3.internal.http2.Http2Reader r2) {
                r0 = this;
                r2.getClass()
                r0.this$0 = r1
                r0.<init>()
                r0.reader = r2
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
                r0 = this;
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int r1, java.lang.String r2, okio.ByteString r3, java.lang.String r4, int r5, long r6) {
                r0 = this;
                r2.getClass()
                r3.getClass()
                r4.getClass()
                return
        }

        public final void applyAndAckSettings(boolean r12, okhttp3.internal.http2.Settings r13) {
                r11 = this;
                r13.getClass()
                gg.u r0 = new gg.u
                r0.<init>()
                okhttp3.internal.http2.Http2Connection r1 = r11.this$0
                okhttp3.internal.http2.Http2Writer r1 = r1.getWriter()
                okhttp3.internal.http2.Http2Connection r2 = r11.this$0
                monitor-enter(r1)
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L8e
                okhttp3.internal.http2.Settings r3 = r2.getPeerSettings()     // Catch: java.lang.Throwable -> L55
                if (r12 == 0) goto L19
                goto L25
            L19:
                okhttp3.internal.http2.Settings r12 = new okhttp3.internal.http2.Settings     // Catch: java.lang.Throwable -> L55
                r12.<init>()     // Catch: java.lang.Throwable -> L55
                r12.merge(r3)     // Catch: java.lang.Throwable -> L55
                r12.merge(r13)     // Catch: java.lang.Throwable -> L55
                r13 = r12
            L25:
                r0.f4564g = r13     // Catch: java.lang.Throwable -> L55
                int r12 = r13.getInitialWindowSize()     // Catch: java.lang.Throwable -> L55
                long r12 = (long) r12     // Catch: java.lang.Throwable -> L55
                int r3 = r3.getInitialWindowSize()     // Catch: java.lang.Throwable -> L55
                long r3 = (long) r3     // Catch: java.lang.Throwable -> L55
                long r12 = r12 - r3
                r3 = 0
                int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
                r6 = 0
                if (r5 == 0) goto L57
                java.util.Map r5 = r2.getStreams$okhttp()     // Catch: java.lang.Throwable -> L55
                boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L55
                if (r5 == 0) goto L44
                goto L57
            L44:
                java.util.Map r5 = r2.getStreams$okhttp()     // Catch: java.lang.Throwable -> L55
                java.util.Collection r5 = r5.values()     // Catch: java.lang.Throwable -> L55
                okhttp3.internal.http2.Http2Stream[] r7 = new okhttp3.internal.http2.Http2Stream[r6]     // Catch: java.lang.Throwable -> L55
                java.lang.Object[] r5 = r5.toArray(r7)     // Catch: java.lang.Throwable -> L55
                okhttp3.internal.http2.Http2Stream[] r5 = (okhttp3.internal.http2.Http2Stream[]) r5     // Catch: java.lang.Throwable -> L55
                goto L58
            L55:
                r12 = move-exception
                goto La8
            L57:
                r5 = 0
            L58:
                java.lang.Object r7 = r0.f4564g     // Catch: java.lang.Throwable -> L55
                okhttp3.internal.http2.Settings r7 = (okhttp3.internal.http2.Settings) r7     // Catch: java.lang.Throwable -> L55
                r2.setPeerSettings(r7)     // Catch: java.lang.Throwable -> L55
                okhttp3.internal.concurrent.TaskQueue r7 = okhttp3.internal.http2.Http2Connection.access$getSettingsListenerQueue$p(r2)     // Catch: java.lang.Throwable -> L55
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
                r8.<init>()     // Catch: java.lang.Throwable -> L55
                java.lang.String r9 = r2.getConnectionName$okhttp()     // Catch: java.lang.Throwable -> L55
                r8.append(r9)     // Catch: java.lang.Throwable -> L55
                java.lang.String r9 = " onSettings"
                r8.append(r9)     // Catch: java.lang.Throwable -> L55
                java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L55
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1 r9 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1     // Catch: java.lang.Throwable -> L55
                r10 = 1
                r9.<init>(r8, r10, r2, r0)     // Catch: java.lang.Throwable -> L55
                r7.schedule(r9, r3)     // Catch: java.lang.Throwable -> L55
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L8e
                okhttp3.internal.http2.Http2Writer r3 = r2.getWriter()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
                java.lang.Object r0 = r0.f4564g     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
                okhttp3.internal.http2.Settings r0 = (okhttp3.internal.http2.Settings) r0     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
                r3.applyAndAckSettings(r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
                goto L94
            L8e:
                r12 = move-exception
                goto Laa
            L90:
                r0 = move-exception
                okhttp3.internal.http2.Http2Connection.access$failConnection(r2, r0)     // Catch: java.lang.Throwable -> L8e
            L94:
                monitor-exit(r1)
                if (r5 == 0) goto La7
                int r0 = r5.length
            L98:
                if (r6 >= r0) goto La7
                r1 = r5[r6]
                monitor-enter(r1)
                r1.addBytesToWriteWindow(r12)     // Catch: java.lang.Throwable -> La4
                monitor-exit(r1)
                int r6 = r6 + 1
                goto L98
            La4:
                r12 = move-exception
                monitor-exit(r1)
                throw r12
            La7:
                return
            La8:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L8e
                throw r12     // Catch: java.lang.Throwable -> L8e
            Laa:
                monitor-exit(r1)
                throw r12
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean r3, int r4, okio.BufferedSource r5, int r6) {
                r2 = this;
                r5.getClass()
                okhttp3.internal.http2.Http2Connection r0 = r2.this$0
                boolean r0 = r0.pushedStream$okhttp(r4)
                okhttp3.internal.http2.Http2Connection r1 = r2.this$0
                if (r0 == 0) goto L11
                r1.pushDataLater$okhttp(r4, r5, r6, r3)
                return
            L11:
                okhttp3.internal.http2.Http2Stream r0 = r1.getStream(r4)
                if (r0 != 0) goto L28
                okhttp3.internal.http2.Http2Connection r3 = r2.this$0
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
                r3.writeSynResetLater$okhttp(r4, r0)
                okhttp3.internal.http2.Http2Connection r3 = r2.this$0
                long r0 = (long) r6
                r3.updateConnectionFlowControl$okhttp(r0)
                r5.skip(r0)
                return
            L28:
                r0.receiveData(r5, r6)
                if (r3 == 0) goto L33
                okhttp3.Headers r3 = okhttp3.internal.Util.EMPTY_HEADERS
                r4 = 1
                r0.receiveHeaders(r3, r4)
            L33:
                return
        }

        public final okhttp3.internal.http2.Http2Reader getReader$okhttp() {
                r1 = this;
                okhttp3.internal.http2.Http2Reader r0 = r1.reader
                return r0
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int r4, okhttp3.internal.http2.ErrorCode r5, okio.ByteString r6) {
                r3 = this;
                r5.getClass()
                r6.getClass()
                r6.size()
                okhttp3.internal.http2.Http2Connection r5 = r3.this$0
                monitor-enter(r5)
                java.util.Map r6 = r5.getStreams$okhttp()     // Catch: java.lang.Throwable -> L45
                java.util.Collection r6 = r6.values()     // Catch: java.lang.Throwable -> L45
                r0 = 0
                okhttp3.internal.http2.Http2Stream[] r1 = new okhttp3.internal.http2.Http2Stream[r0]     // Catch: java.lang.Throwable -> L45
                java.lang.Object[] r6 = r6.toArray(r1)     // Catch: java.lang.Throwable -> L45
                r1 = 1
                okhttp3.internal.http2.Http2Connection.access$setShutdown$p(r5, r1)     // Catch: java.lang.Throwable -> L45
                monitor-exit(r5)
                okhttp3.internal.http2.Http2Stream[] r6 = (okhttp3.internal.http2.Http2Stream[]) r6
                int r5 = r6.length
            L23:
                if (r0 >= r5) goto L44
                r1 = r6[r0]
                int r2 = r1.getId()
                if (r2 <= r4) goto L41
                boolean r2 = r1.isLocallyInitiated()
                if (r2 == 0) goto L41
                okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
                r1.receiveRstStream(r2)
                okhttp3.internal.http2.Http2Connection r2 = r3.this$0
                int r1 = r1.getId()
                r2.removeStream$okhttp(r1)
            L41:
                int r0 = r0 + 1
                goto L23
            L44:
                return
            L45:
                r4 = move-exception
                monitor-exit(r5)
                throw r4
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean r7, int r8, int r9, java.util.List<okhttp3.internal.http2.Header> r10) {
                r6 = this;
                r10.getClass()
                okhttp3.internal.http2.Http2Connection r9 = r6.this$0
                boolean r9 = r9.pushedStream$okhttp(r8)
                okhttp3.internal.http2.Http2Connection r2 = r6.this$0
                if (r9 == 0) goto L11
                r2.pushHeadersLater$okhttp(r8, r10, r7)
                return
            L11:
                monitor-enter(r2)
                okhttp3.internal.http2.Http2Stream r9 = r2.getStream(r8)     // Catch: java.lang.Throwable -> L80
                if (r9 != 0) goto L83
                boolean r9 = okhttp3.internal.http2.Http2Connection.access$isShutdown$p(r2)     // Catch: java.lang.Throwable -> L80
                if (r9 == 0) goto L20
                monitor-exit(r2)
                return
            L20:
                int r9 = r2.getLastGoodStreamId$okhttp()     // Catch: java.lang.Throwable -> L80
                if (r8 > r9) goto L28
                monitor-exit(r2)
                return
            L28:
                int r9 = r8 % 2
                int r0 = r2.getNextStreamId$okhttp()     // Catch: java.lang.Throwable -> L80
                int r0 = r0 % 2
                if (r9 != r0) goto L34
                monitor-exit(r2)
                return
            L34:
                okhttp3.Headers r5 = okhttp3.internal.Util.toHeaders(r10)     // Catch: java.lang.Throwable -> L80
                okhttp3.internal.http2.Http2Stream r0 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L80
                r3 = 0
                r4 = r7
                r1 = r8
                r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L80
                r2.setLastGoodStreamId$okhttp(r1)     // Catch: java.lang.Throwable -> L80
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L80
                java.util.Map r8 = r2.getStreams$okhttp()     // Catch: java.lang.Throwable -> L80
                r8.put(r7, r0)     // Catch: java.lang.Throwable -> L80
                okhttp3.internal.concurrent.TaskRunner r7 = okhttp3.internal.http2.Http2Connection.access$getTaskRunner$p(r2)     // Catch: java.lang.Throwable -> L80
                okhttp3.internal.concurrent.TaskQueue r7 = r7.newQueue()     // Catch: java.lang.Throwable -> L80
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
                r8.<init>()     // Catch: java.lang.Throwable -> L80
                java.lang.String r9 = r2.getConnectionName$okhttp()     // Catch: java.lang.Throwable -> L80
                r8.append(r9)     // Catch: java.lang.Throwable -> L80
                r9 = 91
                r8.append(r9)     // Catch: java.lang.Throwable -> L80
                r8.append(r1)     // Catch: java.lang.Throwable -> L80
                java.lang.String r9 = "] onStream"
                r8.append(r9)     // Catch: java.lang.Throwable -> L80
                java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L80
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1 r9 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1     // Catch: java.lang.Throwable -> L80
                r10 = 1
                r9.<init>(r8, r10, r2, r0)     // Catch: java.lang.Throwable -> L80
                r0 = 0
                r7.schedule(r9, r0)     // Catch: java.lang.Throwable -> L80
                monitor-exit(r2)
                return
            L80:
                r0 = move-exception
                r7 = r0
                goto L8d
            L83:
                r4 = r7
                monitor-exit(r2)
                okhttp3.Headers r7 = okhttp3.internal.Util.toHeaders(r10)
                r9.receiveHeaders(r7, r4)
                return
            L8d:
                monitor-exit(r2)
                throw r7
        }

        @Override // fg.a
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r1 = this;
                r1.m151invoke()
                sf.n r0 = sf.n.f12433a
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public void m151invoke() {
                r5 = this;
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                r1 = 0
                okhttp3.internal.http2.Http2Reader r2 = r5.reader     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
                r2.readConnectionPreface(r5)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            L8:
                okhttp3.internal.http2.Http2Reader r2 = r5.reader     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
                r3 = 0
                boolean r2 = r2.nextFrame(r3, r5)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
                if (r2 != 0) goto L8
                okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.NO_ERROR     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
                okhttp3.internal.http2.Http2Connection r3 = r5.this$0
                r3.close$okhttp(r2, r0, r1)
            L1a:
                okhttp3.internal.http2.Http2Reader r0 = r5.reader
                okhttp3.internal.Util.closeQuietly(r0)
                return
            L20:
                r3 = move-exception
                goto L31
            L22:
                r1 = move-exception
                goto L29
            L24:
                r3 = move-exception
                r2 = r0
                goto L31
            L27:
                r1 = move-exception
                r2 = r0
            L29:
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L20
                okhttp3.internal.http2.Http2Connection r2 = r5.this$0
                r2.close$okhttp(r0, r0, r1)
                goto L1a
            L31:
                okhttp3.internal.http2.Http2Connection r4 = r5.this$0
                r4.close$okhttp(r2, r0, r1)
                okhttp3.internal.http2.Http2Reader r0 = r5.reader
                okhttp3.internal.Util.closeQuietly(r0)
                throw r3
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean r9, int r10, int r11) {
                r8 = this;
                okhttp3.internal.http2.Http2Connection r1 = r8.this$0
                if (r9 == 0) goto L38
                monitor-enter(r1)
                r9 = 1
                r2 = 1
                if (r10 == r9) goto L2c
                r9 = 2
                if (r10 == r9) goto L23
                r9 = 3
                if (r10 == r9) goto L11
                goto L34
            L11:
                long r9 = okhttp3.internal.http2.Http2Connection.access$getAwaitPongsReceived$p(r1)     // Catch: java.lang.Throwable -> L20
                long r9 = r9 + r2
                okhttp3.internal.http2.Http2Connection.access$setAwaitPongsReceived$p(r1, r9)     // Catch: java.lang.Throwable -> L20
                r1.getClass()     // Catch: java.lang.Throwable -> L20
                r1.notifyAll()     // Catch: java.lang.Throwable -> L20
                goto L34
            L20:
                r0 = move-exception
                r9 = r0
                goto L36
            L23:
                long r9 = okhttp3.internal.http2.Http2Connection.access$getDegradedPongsReceived$p(r1)     // Catch: java.lang.Throwable -> L20
                long r9 = r9 + r2
                okhttp3.internal.http2.Http2Connection.access$setDegradedPongsReceived$p(r1, r9)     // Catch: java.lang.Throwable -> L20
                goto L34
            L2c:
                long r9 = okhttp3.internal.http2.Http2Connection.access$getIntervalPongsReceived$p(r1)     // Catch: java.lang.Throwable -> L20
                long r9 = r9 + r2
                okhttp3.internal.http2.Http2Connection.access$setIntervalPongsReceived$p(r1, r9)     // Catch: java.lang.Throwable -> L20
            L34:
                monitor-exit(r1)
                return
            L36:
                monitor-exit(r1)
                throw r9
            L38:
                okhttp3.internal.concurrent.TaskQueue r9 = okhttp3.internal.http2.Http2Connection.access$getWriterQueue$p(r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                okhttp3.internal.http2.Http2Connection r1 = r8.this$0
                java.lang.String r1 = r1.getConnectionName$okhttp()
                r0.append(r1)
                java.lang.String r1 = " ping"
                r0.append(r1)
                java.lang.String r3 = r0.toString()
                okhttp3.internal.http2.Http2Connection r5 = r8.this$0
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1 r2 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                r4 = 1
                r6 = r10
                r7 = r11
                r2.<init>(r3, r4, r5, r6, r7)
                r10 = 0
                r9.schedule(r2, r10)
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int r1, int r2, int r3, boolean r4) {
                r0 = this;
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int r1, int r2, java.util.List<okhttp3.internal.http2.Header> r3) {
                r0 = this;
                r3.getClass()
                okhttp3.internal.http2.Http2Connection r1 = r0.this$0
                r1.pushRequestLater$okhttp(r2, r3)
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int r3, okhttp3.internal.http2.ErrorCode r4) {
                r2 = this;
                r4.getClass()
                okhttp3.internal.http2.Http2Connection r0 = r2.this$0
                boolean r0 = r0.pushedStream$okhttp(r3)
                okhttp3.internal.http2.Http2Connection r1 = r2.this$0
                if (r0 == 0) goto L11
                r1.pushResetLater$okhttp(r3, r4)
                return
            L11:
                okhttp3.internal.http2.Http2Stream r3 = r1.removeStream$okhttp(r3)
                if (r3 == 0) goto L1a
                r3.receiveRstStream(r4)
            L1a:
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean r10, okhttp3.internal.http2.Settings r11) {
                r9 = this;
                r11.getClass()
                okhttp3.internal.http2.Http2Connection r0 = r9.this$0
                okhttp3.internal.concurrent.TaskQueue r0 = okhttp3.internal.http2.Http2Connection.access$getWriterQueue$p(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                okhttp3.internal.http2.Http2Connection r2 = r9.this$0
                java.lang.String r2 = r2.getConnectionName$okhttp()
                r1.append(r2)
                java.lang.String r2 = " applyAndAckSettings"
                r1.append(r2)
                java.lang.String r4 = r1.toString()
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1 r3 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                r5 = 1
                r6 = r9
                r7 = r10
                r8 = r11
                r3.<init>(r4, r5, r6, r7, r8)
                r10 = 0
                r0.schedule(r3, r10)
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int r4, long r5) {
                r3 = this;
                okhttp3.internal.http2.Http2Connection r0 = r3.this$0
                if (r4 != 0) goto L15
                monitor-enter(r0)
                long r1 = r0.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L12
                long r1 = r1 + r5
                okhttp3.internal.http2.Http2Connection.access$setWriteBytesMaximum$p(r0, r1)     // Catch: java.lang.Throwable -> L12
                r0.notifyAll()     // Catch: java.lang.Throwable -> L12
                monitor-exit(r0)
                return
            L12:
                r4 = move-exception
                monitor-exit(r0)
                throw r4
            L15:
                okhttp3.internal.http2.Http2Stream r4 = r0.getStream(r4)
                if (r4 == 0) goto L24
                monitor-enter(r4)
                r4.addBytesToWriteWindow(r5)     // Catch: java.lang.Throwable -> L21
                monitor-exit(r4)
                return
            L21:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            L24:
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
            r1 = 7
            r2 = 65535(0xffff, float:9.1834E-41)
            r0.set(r1, r2)
            r1 = 5
            r2 = 16384(0x4000, float:2.2959E-41)
            r0.set(r1, r2)
            okhttp3.internal.http2.Http2Connection.DEFAULT_SETTINGS = r0
            return
    }

    public Http2Connection(okhttp3.internal.http2.Http2Connection.Builder r7) {
            r6 = this;
            r7.getClass()
            r6.<init>()
            boolean r0 = r7.getClient$okhttp()
            r6.client = r0
            okhttp3.internal.http2.Http2Connection$Listener r1 = r7.getListener$okhttp()
            r6.listener = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r6.streams = r1
            java.lang.String r1 = r7.getConnectionName$okhttp()
            r6.connectionName = r1
            boolean r2 = r7.getClient$okhttp()
            if (r2 == 0) goto L27
            r2 = 3
            goto L28
        L27:
            r2 = 2
        L28:
            r6.nextStreamId = r2
            okhttp3.internal.concurrent.TaskRunner r2 = r7.getTaskRunner$okhttp()
            r6.taskRunner = r2
            okhttp3.internal.concurrent.TaskQueue r3 = r2.newQueue()
            r6.writerQueue = r3
            okhttp3.internal.concurrent.TaskQueue r4 = r2.newQueue()
            r6.pushQueue = r4
            okhttp3.internal.concurrent.TaskQueue r2 = r2.newQueue()
            r6.settingsListenerQueue = r2
            okhttp3.internal.http2.PushObserver r2 = r7.getPushObserver$okhttp()
            r6.pushObserver = r2
            okhttp3.internal.http2.Settings r2 = new okhttp3.internal.http2.Settings
            r2.<init>()
            boolean r4 = r7.getClient$okhttp()
            if (r4 == 0) goto L59
            r4 = 7
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            r2.set(r4, r5)
        L59:
            r6.okHttpSettings = r2
            okhttp3.internal.http2.Settings r2 = okhttp3.internal.http2.Http2Connection.DEFAULT_SETTINGS
            r6.peerSettings = r2
            int r2 = r2.getInitialWindowSize()
            long r4 = (long) r2
            r6.writeBytesMaximum = r4
            java.net.Socket r2 = r7.getSocket$okhttp()
            r6.socket = r2
            okhttp3.internal.http2.Http2Writer r2 = new okhttp3.internal.http2.Http2Writer
            okio.BufferedSink r4 = r7.getSink$okhttp()
            r2.<init>(r4, r0)
            r6.writer = r2
            okhttp3.internal.http2.Http2Connection$ReaderRunnable r2 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable
            okhttp3.internal.http2.Http2Reader r4 = new okhttp3.internal.http2.Http2Reader
            okio.BufferedSource r5 = r7.getSource$okhttp()
            r4.<init>(r5, r0)
            r2.<init>(r6, r4)
            r6.readerRunnable = r2
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r6.currentPushRequests = r0
            int r0 = r7.getPingIntervalMillis$okhttp()
            if (r0 == 0) goto Lad
            int r7 = r7.getPingIntervalMillis$okhttp()
            long r4 = (long) r7
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r7.toNanos(r4)
            java.lang.String r7 = " ping"
            java.lang.String r7 = bc.e.i(r1, r7)
            okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1 r0 = new okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
            r0.<init>(r7, r6, r4)
            r3.schedule(r0, r4)
        Lad:
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

    public static final /* synthetic */ java.util.Set access$getCurrentPushRequests$p(okhttp3.internal.http2.Http2Connection r0) {
            java.util.Set<java.lang.Integer> r0 = r0.currentPushRequests
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

    public static final /* synthetic */ okhttp3.internal.http2.PushObserver access$getPushObserver$p(okhttp3.internal.http2.Http2Connection r0) {
            okhttp3.internal.http2.PushObserver r0 = r0.pushObserver
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.concurrent.TaskQueue access$getSettingsListenerQueue$p(okhttp3.internal.http2.Http2Connection r0) {
            okhttp3.internal.concurrent.TaskQueue r0 = r0.settingsListenerQueue
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.concurrent.TaskRunner access$getTaskRunner$p(okhttp3.internal.http2.Http2Connection r0) {
            okhttp3.internal.concurrent.TaskRunner r0 = r0.taskRunner
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.concurrent.TaskQueue access$getWriterQueue$p(okhttp3.internal.http2.Http2Connection r0) {
            okhttp3.internal.concurrent.TaskQueue r0 = r0.writerQueue
            return r0
    }

    public static final /* synthetic */ boolean access$isShutdown$p(okhttp3.internal.http2.Http2Connection r0) {
            boolean r0 = r0.isShutdown
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

    private final void failConnection(java.io.IOException r2) {
            r1 = this;
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
            r1.close$okhttp(r0, r0, r2)
            return
    }

    private final okhttp3.internal.http2.Http2Stream newStream(int r10, java.util.List<okhttp3.internal.http2.Header> r11, boolean r12) {
            r9 = this;
            r3 = r12 ^ 1
            okhttp3.internal.http2.Http2Writer r6 = r9.writer
            monitor-enter(r6)
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L88
            int r0 = r9.nextStreamId     // Catch: java.lang.Throwable -> L7c
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L18
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L13
            r9.shutdown(r0)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L86
        L18:
            boolean r0 = r9.isShutdown     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L7f
            int r1 = r9.nextStreamId     // Catch: java.lang.Throwable -> L7c
            int r0 = r1 + 2
            r9.nextStreamId = r0     // Catch: java.lang.Throwable -> L7c
            okhttp3.internal.http2.Http2Stream r0 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L7c
            r5 = 0
            r4 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L43
            if (r12 == 0) goto L46
            long r4 = r2.writeBytesTotal     // Catch: java.lang.Throwable -> L43
            long r7 = r2.writeBytesMaximum     // Catch: java.lang.Throwable -> L43
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 >= 0) goto L46
            long r4 = r0.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L43
            long r7 = r0.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L43
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 < 0) goto L41
            goto L46
        L41:
            r12 = 0
            goto L47
        L43:
            r0 = move-exception
        L44:
            r10 = r0
            goto L86
        L46:
            r12 = 1
        L47:
            boolean r4 = r0.isOpen()     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L56
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r2.streams     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L43
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> L43
        L56:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L5f
            if (r10 != 0) goto L62
            okhttp3.internal.http2.Http2Writer r10 = r2.writer     // Catch: java.lang.Throwable -> L5f
            r10.headers(r3, r1, r11)     // Catch: java.lang.Throwable -> L5f
            goto L6b
        L5f:
            r0 = move-exception
        L60:
            r10 = r0
            goto L8b
        L62:
            boolean r3 = r2.client     // Catch: java.lang.Throwable -> L5f
            if (r3 != 0) goto L74
            okhttp3.internal.http2.Http2Writer r3 = r2.writer     // Catch: java.lang.Throwable -> L5f
            r3.pushPromise(r10, r1, r11)     // Catch: java.lang.Throwable -> L5f
        L6b:
            monitor-exit(r6)
            if (r12 == 0) goto L73
            okhttp3.internal.http2.Http2Writer r10 = r2.writer
            r10.flush()
        L73:
            return r0
        L74:
            java.lang.String r10 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5f
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L5f
            throw r11     // Catch: java.lang.Throwable -> L5f
        L7c:
            r0 = move-exception
            r2 = r9
            goto L44
        L7f:
            r2 = r9
            okhttp3.internal.http2.ConnectionShutdownException r10 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L43
            r10.<init>()     // Catch: java.lang.Throwable -> L43
            throw r10     // Catch: java.lang.Throwable -> L43
        L86:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L5f
            throw r10     // Catch: java.lang.Throwable -> L5f
        L88:
            r0 = move-exception
            r2 = r9
            goto L60
        L8b:
            monitor-exit(r6)
            throw r10
    }

    public static /* synthetic */ void start$default(okhttp3.internal.http2.Http2Connection r0, boolean r1, okhttp3.internal.concurrent.TaskRunner r2, int r3, java.lang.Object r4) {
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

    public final synchronized void awaitPong() {
            r4 = this;
            monitor-enter(r4)
        L1:
            long r0 = r4.awaitPongsReceived     // Catch: java.lang.Throwable -> Ld
            long r2 = r4.awaitPingsSent     // Catch: java.lang.Throwable -> Ld
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto Lf
            r4.wait()     // Catch: java.lang.Throwable -> Ld
            goto L1
        Ld:
            r0 = move-exception
            goto L11
        Lf:
            monitor-exit(r4)
            return
        L11:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld
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

    public final void close$okhttp(okhttp3.internal.http2.ErrorCode r4, okhttp3.internal.http2.ErrorCode r5, java.io.IOException r6) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1f
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L11
            goto L1f
        L11:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = " MUST NOT hold lock on "
            j8.o.i(r4, r5, r3)
            return
        L1f:
            r3.shutdown(r4)     // Catch: java.io.IOException -> L22
        L22:
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r3.streams     // Catch: java.lang.Throwable -> L3e
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3e
            r0 = 0
            if (r4 != 0) goto L40
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r3.streams     // Catch: java.lang.Throwable -> L3e
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L3e
            okhttp3.internal.http2.Http2Stream[] r1 = new okhttp3.internal.http2.Http2Stream[r0]     // Catch: java.lang.Throwable -> L3e
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch: java.lang.Throwable -> L3e
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r1 = r3.streams     // Catch: java.lang.Throwable -> L3e
            r1.clear()     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r4 = move-exception
            goto L6b
        L40:
            r4 = 0
        L41:
            monitor-exit(r3)
            okhttp3.internal.http2.Http2Stream[] r4 = (okhttp3.internal.http2.Http2Stream[]) r4
            if (r4 == 0) goto L51
            int r1 = r4.length
        L47:
            if (r0 >= r1) goto L51
            r2 = r4[r0]
            r2.close(r5, r6)     // Catch: java.io.IOException -> L4e
        L4e:
            int r0 = r0 + 1
            goto L47
        L51:
            okhttp3.internal.http2.Http2Writer r4 = r3.writer     // Catch: java.io.IOException -> L56
            r4.close()     // Catch: java.io.IOException -> L56
        L56:
            java.net.Socket r4 = r3.socket     // Catch: java.io.IOException -> L5b
            r4.close()     // Catch: java.io.IOException -> L5b
        L5b:
            okhttp3.internal.concurrent.TaskQueue r4 = r3.writerQueue
            r4.shutdown()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.pushQueue
            r4.shutdown()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.settingsListenerQueue
            r4.shutdown()
            return
        L6b:
            monitor-exit(r3)
            throw r4
    }

    public final void flush() {
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

    public final synchronized okhttp3.internal.http2.Http2Stream getStream(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lf
            okhttp3.internal.http2.Http2Stream r2 = (okhttp3.internal.http2.Http2Stream) r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
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
            boolean r0 = r6.isShutdown     // Catch: java.lang.Throwable -> L18
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r6)
            return r1
        L8:
            long r2 = r6.degradedPongsReceived     // Catch: java.lang.Throwable -> L18
            long r4 = r6.degradedPingsSent     // Catch: java.lang.Throwable -> L18
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L1a
            long r2 = r6.degradedPongDeadlineNs     // Catch: java.lang.Throwable -> L18
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L1a
            monitor-exit(r6)
            return r1
        L18:
            r7 = move-exception
            goto L1d
        L1a:
            monitor-exit(r6)
            r7 = 1
            return r7
        L1d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L18
            throw r7
    }

    public final okhttp3.internal.http2.Http2Stream newStream(java.util.List<okhttp3.internal.http2.Header> r2, boolean r3) {
            r1 = this;
            r2.getClass()
            r0 = 0
            okhttp3.internal.http2.Http2Stream r2 = r1.newStream(r0, r2, r3)
            return r2
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

    public final void pushDataLater$okhttp(int r9, okio.BufferedSource r10, int r11, boolean r12) {
            r8 = this;
            r10.getClass()
            okio.Buffer r5 = new okio.Buffer
            r5.<init>()
            long r0 = (long) r11
            r10.require(r0)
            r10.read(r5, r0)
            okhttp3.internal.concurrent.TaskQueue r10 = r8.pushQueue
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.connectionName
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "] onData"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1 r0 = new okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            r2 = 1
            r3 = r8
            r4 = r9
            r6 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11 = 0
            r10.schedule(r0, r11)
            return
    }

    public final void pushHeadersLater$okhttp(int r11, java.util.List<okhttp3.internal.http2.Header> r12, boolean r13) {
            r10 = this;
            r12.getClass()
            okhttp3.internal.concurrent.TaskQueue r0 = r10.pushQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.connectionName
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = "] onHeaders"
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1 r3 = new okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            r5 = 1
            r6 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11 = 0
            r0.schedule(r3, r11)
            return
    }

    public final void pushRequestLater$okhttp(int r10, java.util.List<okhttp3.internal.http2.Header> r11) {
            r9 = this;
            r11.getClass()
            monitor-enter(r9)
            java.util.Set<java.lang.Integer> r0 = r9.currentPushRequests     // Catch: java.lang.Throwable -> L51
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L51
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L1b
            okhttp3.internal.http2.ErrorCode r11 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L17
            r9.writeSynResetLater$okhttp(r10, r11)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r9)
            return
        L17:
            r0 = move-exception
            r10 = r0
            r6 = r9
            goto L54
        L1b:
            java.util.Set<java.lang.Integer> r0 = r9.currentPushRequests     // Catch: java.lang.Throwable -> L51
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L51
            r0.add(r1)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r9)
            okhttp3.internal.concurrent.TaskQueue r0 = r9.pushQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r9.connectionName
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = "] onRequest"
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1 r3 = new okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
            r5 = 1
            r6 = r9
            r7 = r10
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = 0
            r0.schedule(r3, r10)
            return
        L51:
            r0 = move-exception
            r6 = r9
            r10 = r0
        L54:
            monitor-exit(r9)
            throw r10
    }

    public final void pushResetLater$okhttp(int r10, okhttp3.internal.http2.ErrorCode r11) {
            r9 = this;
            r11.getClass()
            okhttp3.internal.concurrent.TaskQueue r0 = r9.pushQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r9.connectionName
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = "] onReset"
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1 r3 = new okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            r5 = 1
            r6 = r9
            r7 = r10
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = 0
            r0.schedule(r3, r10)
            return
    }

    public final okhttp3.internal.http2.Http2Stream pushStream(int r2, java.util.List<okhttp3.internal.http2.Header> r3, boolean r4) {
            r1 = this;
            r3.getClass()
            boolean r0 = r1.client
            if (r0 != 0) goto Lc
            okhttp3.internal.http2.Http2Stream r2 = r1.newStream(r2, r3, r4)
            return r2
        Lc:
            java.lang.String r2 = "Client cannot push requests."
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    public final boolean pushedStream$okhttp(int r2) {
            r1 = this;
            if (r2 == 0) goto L7
            r0 = 1
            r2 = r2 & r0
            if (r2 != 0) goto L7
            return r0
        L7:
            r2 = 0
            return r2
    }

    public final synchronized okhttp3.internal.http2.Http2Stream removeStream$okhttp(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams     // Catch: java.lang.Throwable -> L12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L12
            okhttp3.internal.http2.Http2Stream r2 = (okhttp3.internal.http2.Http2Stream) r2     // Catch: java.lang.Throwable -> L12
            r1.notifyAll()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    public final void sendDegradedPingLater$okhttp() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.degradedPongsReceived     // Catch: java.lang.Throwable -> L37
            long r2 = r5.degradedPingsSent     // Catch: java.lang.Throwable -> L37
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            r0 = 1
            long r2 = r2 + r0
            r5.degradedPingsSent = r2     // Catch: java.lang.Throwable -> L37
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L37
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L37
            long r0 = r0 + r2
            r5.degradedPongDeadlineNs = r0     // Catch: java.lang.Throwable -> L37
            monitor-exit(r5)
            okhttp3.internal.concurrent.TaskQueue r0 = r5.writerQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.connectionName
            java.lang.String r3 = " ping"
            java.lang.String r1 = eh.a.r(r1, r2, r3)
            okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1 r2 = new okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
            r3 = 1
            r2.<init>(r1, r3, r5)
            r3 = 0
            r0.schedule(r2, r3)
            return
        L37:
            r0 = move-exception
            monitor-exit(r5)
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

    public final void setPeerSettings(okhttp3.internal.http2.Settings r1) {
            r0 = this;
            r1.getClass()
            r0.peerSettings = r1
            return
    }

    public final void setSettings(okhttp3.internal.http2.Settings r3) {
            r2 = this;
            r3.getClass()
            okhttp3.internal.http2.Http2Writer r0 = r2.writer
            monitor-enter(r0)
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L18
            boolean r1 = r2.isShutdown     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            okhttp3.internal.http2.Settings r1 = r2.okHttpSettings     // Catch: java.lang.Throwable -> L1a
            r1.merge(r3)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            okhttp3.internal.http2.Http2Writer r1 = r2.writer     // Catch: java.lang.Throwable -> L18
            r1.settings(r3)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            return
        L18:
            r3 = move-exception
            goto L24
        L1a:
            r3 = move-exception
            goto L22
        L1c:
            okhttp3.internal.http2.ConnectionShutdownException r3 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L1a
            r3.<init>()     // Catch: java.lang.Throwable -> L1a
            throw r3     // Catch: java.lang.Throwable -> L1a
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r3     // Catch: java.lang.Throwable -> L18
        L24:
            monitor-exit(r0)
            throw r3
    }

    public final void shutdown(okhttp3.internal.http2.ErrorCode r5) {
            r4 = this;
            r5.getClass()
            okhttp3.internal.http2.Http2Writer r0 = r4.writer
            monitor-enter(r0)
            monitor-enter(r4)     // Catch: java.lang.Throwable -> Le
            boolean r1 = r4.isShutdown     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L10
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        Le:
            r5 = move-exception
            goto L22
        L10:
            r1 = 1
            r4.isShutdown = r1     // Catch: java.lang.Throwable -> L1f
            int r1 = r4.lastGoodStreamId     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            okhttp3.internal.http2.Http2Writer r2 = r4.writer     // Catch: java.lang.Throwable -> Le
            byte[] r3 = okhttp3.internal.Util.EMPTY_BYTE_ARRAY     // Catch: java.lang.Throwable -> Le
            r2.goAway(r1, r5, r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        L1f:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            throw r5     // Catch: java.lang.Throwable -> Le
        L22:
            monitor-exit(r0)
            throw r5
    }

    public final void start() {
            r3 = this;
            r0 = 0
            r1 = 3
            r2 = 0
            start$default(r3, r2, r0, r1, r0)
            return
    }

    public final void start(boolean r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            start$default(r2, r3, r0, r1, r0)
            return
    }

    public final void start(boolean r5, okhttp3.internal.concurrent.TaskRunner r6) {
            r4 = this;
            r6.getClass()
            if (r5 == 0) goto L24
            okhttp3.internal.http2.Http2Writer r5 = r4.writer
            r5.connectionPreface()
            okhttp3.internal.http2.Http2Writer r5 = r4.writer
            okhttp3.internal.http2.Settings r0 = r4.okHttpSettings
            r5.settings(r0)
            okhttp3.internal.http2.Settings r5 = r4.okHttpSettings
            int r5 = r5.getInitialWindowSize()
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r5 == r0) goto L24
            okhttp3.internal.http2.Http2Writer r1 = r4.writer
            int r5 = r5 - r0
            long r2 = (long) r5
            r5 = 0
            r1.windowUpdate(r5, r2)
        L24:
            okhttp3.internal.concurrent.TaskQueue r5 = r6.newQueue()
            java.lang.String r6 = r4.connectionName
            okhttp3.internal.http2.Http2Connection$ReaderRunnable r0 = r4.readerRunnable
            okhttp3.internal.concurrent.TaskQueue$execute$1 r1 = new okhttp3.internal.concurrent.TaskQueue$execute$1
            r2 = 1
            r1.<init>(r6, r2, r0)
            r2 = 0
            r5.schedule(r1, r2)
            return
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long r3) {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.readBytesTotal     // Catch: java.lang.Throwable -> L20
            long r0 = r0 + r3
            r2.readBytesTotal = r0     // Catch: java.lang.Throwable -> L20
            long r3 = r2.readBytesAcknowledged     // Catch: java.lang.Throwable -> L20
            long r0 = r0 - r3
            okhttp3.internal.http2.Settings r3 = r2.okHttpSettings     // Catch: java.lang.Throwable -> L20
            int r3 = r3.getInitialWindowSize()     // Catch: java.lang.Throwable -> L20
            int r3 = r3 / 2
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L22
            r3 = 0
            r2.writeWindowUpdateLater$okhttp(r3, r0)     // Catch: java.lang.Throwable -> L20
            long r3 = r2.readBytesAcknowledged     // Catch: java.lang.Throwable -> L20
            long r3 = r3 + r0
            r2.readBytesAcknowledged = r3     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r3 = move-exception
            goto L24
        L22:
            monitor-exit(r2)
            return
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    public final void writeData(int r9, boolean r10, okio.Buffer r11, long r12) {
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r12 = r8.writer
            r12.data(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            long r6 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r2 = r8.streams     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            r9 = move-exception
            goto L68
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            okhttp3.internal.http2.Http2Writer r4 = r8.writer     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.maxDataLength()     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L56
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = r3
        L57:
            r4.data(r5, r9, r11, r2)
            goto Ld
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
    }

    public final void writeHeaders$okhttp(int r2, boolean r3, java.util.List<okhttp3.internal.http2.Header> r4) {
            r1 = this;
            r4.getClass()
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.headers(r3, r2, r4)
            return
    }

    public final void writePing() {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.awaitPingsSent     // Catch: java.lang.Throwable -> L12
            r2 = 1
            long r0 = r0 + r2
            r4.awaitPingsSent = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)
            r0 = 3
            r1 = 1330343787(0x4f4b6f6b, float:3.4130767E9)
            r2 = 0
            r4.writePing(r2, r0, r1)
            return
        L12:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    public final void writePing(boolean r2, int r3, int r4) {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer     // Catch: java.io.IOException -> L6
            r0.ping(r2, r3, r4)     // Catch: java.io.IOException -> L6
            return
        L6:
            r2 = move-exception
            r1.failConnection(r2)
            return
    }

    public final void writePingAndAwaitPong() {
            r0 = this;
            r0.writePing()
            r0.awaitPong()
            return
    }

    public final void writeSynReset$okhttp(int r2, okhttp3.internal.http2.ErrorCode r3) {
            r1 = this;
            r3.getClass()
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.rstStream(r2, r3)
            return
    }

    public final void writeSynResetLater$okhttp(int r10, okhttp3.internal.http2.ErrorCode r11) {
            r9 = this;
            r11.getClass()
            okhttp3.internal.concurrent.TaskQueue r0 = r9.writerQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r9.connectionName
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = "] writeSynReset"
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1 r3 = new okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            r5 = 1
            r6 = r9
            r7 = r10
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = 0
            r0.schedule(r3, r10)
            return
    }

    public final void writeWindowUpdateLater$okhttp(int r11, long r12) {
            r10 = this;
            okhttp3.internal.concurrent.TaskQueue r0 = r10.writerQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.connectionName
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = "] windowUpdate"
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1 r3 = new okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            r5 = 1
            r6 = r10
            r7 = r11
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r11 = 0
            r0.schedule(r3, r11)
            return
    }
}
