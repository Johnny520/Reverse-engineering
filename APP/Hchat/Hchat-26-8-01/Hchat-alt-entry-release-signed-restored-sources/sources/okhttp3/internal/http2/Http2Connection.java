package okhttp3.internal.http2;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import gg.C1425u;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p136j8.C2104o;
import p276sf.C3967n;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Settings settings = new Settings();
        settings.set(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Http2Connection(Builder builder) {
        builder.getClass();
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue taskQueueNewQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = taskQueueNewQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = r2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            final String strM1020i = AbstractC0255e.m1020i(connectionName$okhttp, " ping");
            taskQueueNewQueue.schedule(new Task(strM1020i) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    boolean z9;
                    synchronized (this) {
                        if (this.intervalPongsReceived < this.intervalPingsSent) {
                            z9 = true;
                        } else {
                            this.intervalPingsSent++;
                            z9 = false;
                        }
                    }
                    Http2Connection http2Connection = this;
                    if (z9) {
                        http2Connection.failConnection(null);
                        return -1L;
                    }
                    http2Connection.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Http2Stream newStream(int i9, List<Header> list, boolean z9) throws Throwable {
        Throwable th2;
        boolean z10 = !z9;
        synchronized (this.writer) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.nextStreamId > 1073741823) {
                                try {
                                    shutdown(ErrorCode.REFUSED_STREAM);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            try {
                                if (this.isShutdown) {
                                    throw new ConnectionShutdownException();
                                }
                                int i10 = this.nextStreamId;
                                this.nextStreamId = i10 + 2;
                                Http2Stream http2Stream = new Http2Stream(i10, this, z10, false, null);
                                boolean z11 = !z9 || this.writeBytesTotal >= this.writeBytesMaximum || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
                                if (http2Stream.isOpen()) {
                                    this.streams.put(Integer.valueOf(i10), http2Stream);
                                }
                                if (i9 == 0) {
                                    this.writer.headers(z10, i10, list);
                                } else {
                                    if (this.client) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.writer.pushPromise(i9, i10, list);
                                }
                                if (z11) {
                                    this.writer.flush();
                                }
                                return http2Stream;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        th2 = th;
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z9, TaskRunner taskRunner, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = true;
        }
        if ((i9 & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z9, taskRunner);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void awaitPong() {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void close$okhttp(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i9;
        Object[] array;
        errorCode.getClass();
        errorCode2.getClass();
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        try {
            shutdown(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.streams.isEmpty()) {
                array = null;
            } else {
                array = this.streams.values().toArray(new Http2Stream[0]);
                this.streams.clear();
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void flush() {
        this.writer.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getClient$okhttp() {
        return this.client;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Listener getListener$okhttp() {
        return this.listener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Http2Stream getStream(int i9) {
        return this.streams.get(Integer.valueOf(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Http2Writer getWriter() {
        return this.writer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized boolean isHealthy(long j3) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j3 >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void pushDataLater$okhttp(final int i9, BufferedSource bufferedSource, final int i10, final boolean z9) {
        bufferedSource.getClass();
        final Buffer buffer = new Buffer();
        long j3 = i10;
        bufferedSource.require(j3);
        bufferedSource.read(buffer, j3);
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i9 + "] onData";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    boolean zOnData = this.pushObserver.onData(i9, buffer, i10, z9);
                    if (zOnData) {
                        this.getWriter().rstStream(i9, ErrorCode.CANCEL);
                    }
                    if (!zOnData && !z9) {
                        return -1L;
                    }
                    synchronized (this) {
                        this.currentPushRequests.remove(Integer.valueOf(i9));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void pushHeadersLater$okhttp(final int i9, final List<Header> list, final boolean z9) {
        list.getClass();
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i9 + "] onHeaders";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean zOnHeaders = this.pushObserver.onHeaders(i9, list, z9);
                if (zOnHeaders) {
                    try {
                        this.getWriter().rstStream(i9, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!zOnHeaders && !z9) {
                    return -1L;
                }
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(i9));
                }
                return -1L;
            }
        }, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void pushRequestLater$okhttp(final int i9, final List<Header> list) throws Throwable {
        Throwable th2;
        list.getClass();
        synchronized (this) {
            try {
                if (!this.currentPushRequests.contains(Integer.valueOf(i9))) {
                    this.currentPushRequests.add(Integer.valueOf(i9));
                    TaskQueue taskQueue = this.pushQueue;
                    final String str = this.connectionName + '[' + i9 + "] onRequest";
                    final boolean z9 = true;
                    taskQueue.schedule(new Task(str, z9) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            if (!this.pushObserver.onRequest(i9, list)) {
                                return -1L;
                            }
                            try {
                                this.getWriter().rstStream(i9, ErrorCode.CANCEL);
                                synchronized (this) {
                                    this.currentPushRequests.remove(Integer.valueOf(i9));
                                }
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }, 0L);
                    return;
                }
                try {
                    writeSynResetLater$okhttp(i9, ErrorCode.PROTOCOL_ERROR);
                    return;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void pushResetLater$okhttp(final int i9, final ErrorCode errorCode) {
        errorCode.getClass();
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i9 + "] onReset";
        final boolean z9 = true;
        taskQueue.schedule(new Task(str, z9) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                this.pushObserver.onReset(i9, errorCode);
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(i9));
                }
                return -1L;
            }
        }, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Http2Stream pushStream(int i9, List<Header> list, boolean z9) {
        list.getClass();
        if (!this.client) {
            return newStream(i9, list, z9);
        }
        C2104o.m5276A("Client cannot push requests.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean pushedStream$okhttp(int i9) {
        return i9 != 0 && (i9 & 1) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Http2Stream removeStream$okhttp(int i9) {
        Http2Stream http2StreamRemove;
        http2StreamRemove = this.streams.remove(Integer.valueOf(i9));
        notifyAll();
        return http2StreamRemove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j3 = this.degradedPongsReceived;
            long j4 = this.degradedPingsSent;
            if (j3 < j4) {
                return;
            }
            this.degradedPingsSent = j4 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + ((long) DEGRADED_PONG_TIMEOUT_NS);
            TaskQueue taskQueue = this.writerQueue;
            final String strM2255r = AbstractC0921a.m2255r(new StringBuilder(), this.connectionName, " ping");
            final boolean z9 = true;
            taskQueue.schedule(new Task(strM2255r, z9) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setLastGoodStreamId$okhttp(int i9) {
        this.lastGoodStreamId = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setNextStreamId$okhttp(int i9) {
        this.nextStreamId = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setPeerSettings(Settings settings) {
        settings.getClass();
        this.peerSettings = settings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSettings(Settings settings) {
        settings.getClass();
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
            }
            this.writer.settings(settings);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void shutdown(ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                this.writer.goAway(this.lastGoodStreamId, errorCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void start(boolean z9, TaskRunner taskRunner) {
        taskRunner.getClass();
        if (z9) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r5 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue.C31721(this.connectionName, true, this.readerRunnable), 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void updateConnectionFlowControl$okhttp(long j3) {
        long j4 = this.readBytesTotal + j3;
        this.readBytesTotal = j4;
        long j5 = j4 - this.readBytesAcknowledged;
        if (j5 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j5);
            this.readBytesAcknowledged += j5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.maxDataLength());
        r6 = r2;
        r8.writeBytesTotal += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeData(int i9, boolean z9, Buffer buffer, long j3) {
        int iMin;
        long j4;
        if (j3 == 0) {
            this.writer.data(z9, i9, buffer, 0);
            return;
        }
        while (j3 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j5 = this.writeBytesTotal;
                            long j10 = this.writeBytesMaximum;
                            if (j5 < j10) {
                                break;
                            } else {
                                if (!this.streams.containsKey(Integer.valueOf(i9))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            j3 -= j4;
            this.writer.data(z9 && j3 == 0, i9, buffer, iMin);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeHeaders$okhttp(int i9, boolean z9, List<Header> list) {
        list.getClass();
        this.writer.headers(z9, i9, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writePing() {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writePingAndAwaitPong() {
        writePing();
        awaitPong();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeSynReset$okhttp(int i9, ErrorCode errorCode) {
        errorCode.getClass();
        this.writer.rstStream(i9, errorCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeSynResetLater$okhttp(final int i9, final ErrorCode errorCode) {
        errorCode.getClass();
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + i9 + "] writeSynReset";
        final boolean z9 = true;
        taskQueue.schedule(new Task(str, z9) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.writeSynReset$okhttp(i9, errorCode);
                    return -1L;
                } catch (IOException e6) {
                    this.failConnection(e6);
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeWindowUpdateLater$okhttp(final int i9, final long j3) {
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + i9 + "] windowUpdate";
        final boolean z9 = true;
        taskQueue.schedule(new Task(str, z9) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.getWriter().windowUpdate(i9, j3);
                    return -1L;
                } catch (IOException e6) {
                    this.failConnection(e6);
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream http2Stream) {
                http2Stream.getClass();
                http2Stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void onSettings(Http2Connection http2Connection, Settings settings) {
            http2Connection.getClass();
            settings.getClass();
        }

        public abstract void onStream(Http2Stream http2Stream);

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.http2.Http2Connection.Listener.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.http2.Http2Connection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }

        private Companion() {
        }
    }

    public final void writePing(boolean z9, int i9, int i10) {
        try {
            this.writer.ping(z9, i9, i10);
        } catch (IOException e6) {
            failConnection(e6);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class ReaderRunnable implements Http2Reader.Handler, InterfaceC1220a {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            http2Reader.getClass();
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i9, String str, ByteString byteString, String str2, int i10, long j3) {
            str.getClass();
            byteString.getClass();
            str2.getClass();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void applyAndAckSettings(boolean z9, Settings settings) {
            long initialWindowSize;
            int i9;
            Http2Stream[] http2StreamArr;
            settings.getClass();
            final C1425u c1425u = new C1425u();
            Http2Writer writer = this.this$0.getWriter();
            final Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    try {
                        Settings peerSettings = http2Connection.getPeerSettings();
                        if (!z9) {
                            Settings settings2 = new Settings();
                            settings2.merge(peerSettings);
                            settings2.merge(settings);
                            settings = settings2;
                        }
                        c1425u.f4738g = settings;
                        initialWindowSize = ((long) settings.getInitialWindowSize()) - ((long) peerSettings.getInitialWindowSize());
                        http2StreamArr = (initialWindowSize == 0 || http2Connection.getStreams$okhttp().isEmpty()) ? null : (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                        http2Connection.setPeerSettings((Settings) c1425u.f4738g);
                        TaskQueue taskQueue = http2Connection.settingsListenerQueue;
                        final String str = http2Connection.getConnectionName$okhttp() + " onSettings";
                        final boolean z10 = true;
                        taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                http2Connection.getListener$okhttp().onSettings(http2Connection, (Settings) c1425u.f4738g);
                                return -1L;
                            }
                        }, 0L);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) c1425u.f4738g);
                } catch (IOException e6) {
                    http2Connection.failConnection(e6);
                }
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                    }
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z9, int i9, BufferedSource bufferedSource, int i10) {
            bufferedSource.getClass();
            boolean zPushedStream$okhttp = this.this$0.pushedStream$okhttp(i9);
            Http2Connection http2Connection = this.this$0;
            if (zPushedStream$okhttp) {
                http2Connection.pushDataLater$okhttp(i9, bufferedSource, i10, z9);
                return;
            }
            Http2Stream stream = http2Connection.getStream(i9);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i9, ErrorCode.PROTOCOL_ERROR);
                long j3 = i10;
                this.this$0.updateConnectionFlowControl$okhttp(j3);
                bufferedSource.skip(j3);
                return;
            }
            stream.receiveData(bufferedSource, i10);
            if (z9) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i9, ErrorCode errorCode, ByteString byteString) {
            int i10;
            Object[] array;
            errorCode.getClass();
            byteString.getClass();
            byteString.size();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > i9 && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z9, int i9, int i10, List<Header> list) {
            list.getClass();
            boolean zPushedStream$okhttp = this.this$0.pushedStream$okhttp(i9);
            final Http2Connection http2Connection = this.this$0;
            if (zPushedStream$okhttp) {
                http2Connection.pushHeadersLater$okhttp(i9, list, z9);
                return;
            }
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i9);
                if (stream != null) {
                    stream.receiveHeaders(Util.toHeaders(list), z9);
                    return;
                }
                if (http2Connection.isShutdown) {
                    return;
                }
                if (i9 <= http2Connection.getLastGoodStreamId$okhttp()) {
                    return;
                }
                if (i9 % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i9, http2Connection, false, z9, Util.toHeaders(list));
                http2Connection.setLastGoodStreamId$okhttp(i9);
                http2Connection.getStreams$okhttp().put(Integer.valueOf(i9), http2Stream);
                TaskQueue taskQueueNewQueue = http2Connection.taskRunner.newQueue();
                final String str = http2Connection.getConnectionName$okhttp() + '[' + i9 + "] onStream";
                final boolean z10 = true;
                taskQueueNewQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        try {
                            http2Connection.getListener$okhttp().onStream(http2Stream);
                            return -1L;
                        } catch (IOException e6) {
                            Platform.Companion.get().log("Http2Connection.Listener failure for " + http2Connection.getConnectionName$okhttp(), 4, e6);
                            try {
                                http2Stream.close(ErrorCode.PROTOCOL_ERROR, e6);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:11:0x0020 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x0003 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: okhttp3.internal.http2.ErrorCode */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: okhttp3.internal.http2.ErrorCode */
        /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: okhttp3.internal.http2.ErrorCode */
        /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: okhttp3.internal.http2.ErrorCode */
        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: okhttp3.internal.http2.ErrorCode */
        /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: okhttp3.internal.http2.ErrorCode */
        /* JADX DEBUG: Possible override for method fg.a.invoke()Ljava/lang/Object; */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public void m11061invoke() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e6 = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        this.this$0.close$okhttp(errorCode3, ErrorCode.CANCEL, null);
                        errorCode = errorCode3;
                    } catch (IOException e7) {
                        e6 = e7;
                        ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                        Http2Connection http2Connection = this.this$0;
                        http2Connection.close$okhttp(errorCode4, errorCode4, e6);
                        errorCode = http2Connection;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.this$0.close$okhttp(errorCode, errorCode2, e6);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e10) {
                e6 = e10;
            } catch (Throwable th3) {
                th = th3;
                errorCode = errorCode2;
                this.this$0.close$okhttp(errorCode, errorCode2, e6);
                Util.closeQuietly(this.reader);
                throw th;
            }
            errorCode2 = this.reader;
            Util.closeQuietly((Closeable) errorCode2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z9, final int i9, final int i10) {
            Http2Connection http2Connection = this.this$0;
            if (!z9) {
                TaskQueue taskQueue = http2Connection.writerQueue;
                final String str = this.this$0.getConnectionName$okhttp() + " ping";
                final Http2Connection http2Connection2 = this.this$0;
                final boolean z10 = true;
                taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        http2Connection2.writePing(true, i9, i10);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            synchronized (http2Connection) {
                try {
                    if (i9 == 1) {
                        http2Connection.intervalPongsReceived++;
                    } else if (i9 == 2) {
                        http2Connection.degradedPongsReceived++;
                    } else if (i9 == 3) {
                        http2Connection.awaitPongsReceived++;
                        http2Connection.getClass();
                        http2Connection.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i9, int i10, List<Header> list) throws Throwable {
            list.getClass();
            this.this$0.pushRequestLater$okhttp(i10, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i9, ErrorCode errorCode) {
            errorCode.getClass();
            boolean zPushedStream$okhttp = this.this$0.pushedStream$okhttp(i9);
            Http2Connection http2Connection = this.this$0;
            if (zPushedStream$okhttp) {
                http2Connection.pushResetLater$okhttp(i9, errorCode);
                return;
            }
            Http2Stream http2StreamRemoveStream$okhttp = http2Connection.removeStream$okhttp(i9);
            if (http2StreamRemoveStream$okhttp != null) {
                http2StreamRemoveStream$okhttp.receiveRstStream(errorCode);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z9, final Settings settings) {
            settings.getClass();
            TaskQueue taskQueue = this.this$0.writerQueue;
            final String str = this.this$0.getConnectionName$okhttp() + " applyAndAckSettings";
            final boolean z10 = true;
            taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.applyAndAckSettings(z9, settings);
                    return -1L;
                }
            }, 0L);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i9, long j3) {
            Http2Connection http2Connection = this.this$0;
            if (i9 == 0) {
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j3;
                    http2Connection.notifyAll();
                }
            } else {
                Http2Stream stream = http2Connection.getStream(i9);
                if (stream != null) {
                    synchronized (stream) {
                        stream.addBytesToWriteWindow(j3);
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // p085fg.InterfaceC1220a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m11061invoke();
            return C3967n.f12976a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i9, int i10, int i11, boolean z9) {
        }
    }

    public final void start(boolean z9) {
        start$default(this, z9, null, 2, null);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public BufferedSink sink;
        public Socket socket;
        public BufferedSource source;
        private final TaskRunner taskRunner;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder(boolean z9, TaskRunner taskRunner) {
            taskRunner.getClass();
            this.client = z9;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i9 & 4) != 0) {
                bufferedSource = Okio.buffer(Okio.source(socket));
            }
            if ((i9 & 8) != 0) {
                bufferedSink = Okio.buffer(Okio.sink(socket));
            }
            return builder.socket(socket, str, bufferedSource, bufferedSink);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean getClient$okhttp() {
            return this.client;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            AbstractC1416l.m3831g("connectionName");
            throw null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Listener getListener$okhttp() {
            return this.listener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final BufferedSink getSink$okhttp() {
            BufferedSink bufferedSink = this.sink;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            AbstractC1416l.m3831g("sink");
            throw null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            AbstractC1416l.m3831g("socket");
            throw null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final BufferedSource getSource$okhttp() {
            BufferedSource bufferedSource = this.source;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            AbstractC1416l.m3831g("source");
            throw null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder listener(Listener listener) {
            listener.getClass();
            this.listener = listener;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder pingIntervalMillis(int i9) {
            this.pingIntervalMillis = i9;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder pushObserver(PushObserver pushObserver) {
            pushObserver.getClass();
            this.pushObserver = pushObserver;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setClient$okhttp(boolean z9) {
            this.client = z9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setConnectionName$okhttp(String str) {
            str.getClass();
            this.connectionName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setListener$okhttp(Listener listener) {
            listener.getClass();
            this.listener = listener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setPingIntervalMillis$okhttp(int i9) {
            this.pingIntervalMillis = i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            pushObserver.getClass();
            this.pushObserver = pushObserver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setSink$okhttp(BufferedSink bufferedSink) {
            bufferedSink.getClass();
            this.sink = bufferedSink;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setSocket$okhttp(Socket socket) {
            socket.getClass();
            this.socket = socket;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setSource$okhttp(BufferedSource bufferedSource) {
            bufferedSource.getClass();
            this.source = bufferedSource;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder socket(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            String strConcat;
            socket.getClass();
            str.getClass();
            bufferedSource.getClass();
            bufferedSink.getClass();
            setSocket$okhttp(socket);
            if (this.client) {
                strConcat = Util.okHttpName + ' ' + str;
            } else {
                strConcat = "MockWebServer ".concat(str);
            }
            setConnectionName$okhttp(strConcat);
            setSource$okhttp(bufferedSource);
            setSink$okhttp(bufferedSink);
            return this;
        }

        public final Builder socket(Socket socket, String str) {
            socket.getClass();
            str.getClass();
            return socket$default(this, socket, str, null, null, 12, null);
        }

        public final Builder socket(Socket socket, String str, BufferedSource bufferedSource) {
            socket.getClass();
            str.getClass();
            bufferedSource.getClass();
            return socket$default(this, socket, str, bufferedSource, null, 8, null);
        }

        public final Builder socket(Socket socket) {
            socket.getClass();
            return socket$default(this, socket, null, null, null, 14, null);
        }
    }

    public final void start() {
        start$default(this, false, null, 3, null);
    }

    public final Http2Stream newStream(List<Header> list, boolean z9) {
        list.getClass();
        return newStream(0, list, z9);
    }
}
