package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Dispatcher {
    private java.util.concurrent.ExecutorService executorServiceOrNull;
    private java.lang.Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final java.util.ArrayDeque<okhttp3.internal.connection.RealCall.AsyncCall> readyAsyncCalls;
    private final java.util.ArrayDeque<okhttp3.internal.connection.RealCall.AsyncCall> runningAsyncCalls;
    private final java.util.ArrayDeque<okhttp3.internal.connection.RealCall> runningSyncCalls;

    public Dispatcher() {
            r1 = this;
            r1.<init>()
            r0 = 64
            r1.maxRequests = r0
            r0 = 5
            r1.maxRequestsPerHost = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.readyAsyncCalls = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.runningAsyncCalls = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.runningSyncCalls = r0
            return
    }

    public Dispatcher(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.executorServiceOrNull = r1
            return
    }

    private final okhttp3.internal.connection.RealCall.AsyncCall findExistingCallWithHost(java.lang.String r4) {
            r3 = this;
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r3.runningAsyncCalls
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealCall$AsyncCall r1 = (okhttp3.internal.connection.RealCall.AsyncCall) r1
            java.lang.String r2 = r1.getHost()
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L6
            return r1
        L1d:
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r3.readyAsyncCalls
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealCall$AsyncCall r1 = (okhttp3.internal.connection.RealCall.AsyncCall) r1
            java.lang.String r2 = r1.getHost()
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L23
            return r1
        L3a:
            r4 = 0
            return r4
    }

    private final <T> void finished(java.util.Deque<T> r1, T r2) {
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            java.lang.Runnable r1 = r0.idleCallback     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            boolean r2 = r0.promoteAndExecute()
            if (r2 != 0) goto L15
            if (r1 == 0) goto L15
            r1.run()
        L15:
            return
        L16:
            r1 = move-exception
            goto L20
        L18:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "Call wasn't in-flight!"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L20:
            monitor-exit(r0)
            throw r1
    }

    private final boolean promoteAndExecute() {
            r6 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1a
            boolean r0 = java.lang.Thread.holdsLock(r6)
            if (r0 != 0) goto Lb
            goto L1a
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " MUST NOT hold lock on "
            j8.o.i(r0, r1, r6)
            r0 = 0
            return r0
        L1a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r6)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r1 = r6.readyAsyncCalls     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L5e
            r1.getClass()     // Catch: java.lang.Throwable -> L5e
        L29:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L60
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L5e
            okhttp3.internal.connection.RealCall$AsyncCall r2 = (okhttp3.internal.connection.RealCall.AsyncCall) r2     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r3 = r6.runningAsyncCalls     // Catch: java.lang.Throwable -> L5e
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L5e
            int r4 = r6.maxRequests     // Catch: java.lang.Throwable -> L5e
            if (r3 >= r4) goto L60
            java.util.concurrent.atomic.AtomicInteger r3 = r2.getCallsPerHost()     // Catch: java.lang.Throwable -> L5e
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L5e
            int r4 = r6.maxRequestsPerHost     // Catch: java.lang.Throwable -> L5e
            if (r3 >= r4) goto L29
            r1.remove()     // Catch: java.lang.Throwable -> L5e
            java.util.concurrent.atomic.AtomicInteger r3 = r2.getCallsPerHost()     // Catch: java.lang.Throwable -> L5e
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L5e
            r0.add(r2)     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r3 = r6.runningAsyncCalls     // Catch: java.lang.Throwable -> L5e
            r3.add(r2)     // Catch: java.lang.Throwable -> L5e
            goto L29
        L5e:
            r0 = move-exception
            goto L82
        L60:
            int r1 = r6.runningCallsCount()     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            if (r1 <= 0) goto L69
            r1 = 1
            goto L6a
        L69:
            r1 = r2
        L6a:
            monitor-exit(r6)
            int r3 = r0.size()
        L6f:
            if (r2 >= r3) goto L81
            java.lang.Object r4 = r0.get(r2)
            okhttp3.internal.connection.RealCall$AsyncCall r4 = (okhttp3.internal.connection.RealCall.AsyncCall) r4
            java.util.concurrent.ExecutorService r5 = r6.executorService()
            r4.executeOn(r5)
            int r2 = r2 + 1
            goto L6f
        L81:
            return r1
        L82:
            monitor-exit(r6)
            throw r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_executorService, reason: not valid java name */
    public final java.util.concurrent.ExecutorService m56deprecated_executorService() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.executorService()
            return r0
    }

    public final synchronized void cancelAll() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r2.readyAsyncCalls     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1b
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1b
            okhttp3.internal.connection.RealCall$AsyncCall r1 = (okhttp3.internal.connection.RealCall.AsyncCall) r1     // Catch: java.lang.Throwable -> L1b
            okhttp3.internal.connection.RealCall r1 = r1.getCall()     // Catch: java.lang.Throwable -> L1b
            r1.cancel()     // Catch: java.lang.Throwable -> L1b
            goto L7
        L1b:
            r0 = move-exception
            goto L4f
        L1d:
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r2.runningAsyncCalls     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1b
        L23:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1b
            okhttp3.internal.connection.RealCall$AsyncCall r1 = (okhttp3.internal.connection.RealCall.AsyncCall) r1     // Catch: java.lang.Throwable -> L1b
            okhttp3.internal.connection.RealCall r1 = r1.getCall()     // Catch: java.lang.Throwable -> L1b
            r1.cancel()     // Catch: java.lang.Throwable -> L1b
            goto L23
        L37:
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r2.runningSyncCalls     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1b
        L3d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1b
            okhttp3.internal.connection.RealCall r1 = (okhttp3.internal.connection.RealCall) r1     // Catch: java.lang.Throwable -> L1b
            r1.cancel()     // Catch: java.lang.Throwable -> L1b
            goto L3d
        L4d:
            monitor-exit(r2)
            return
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0
    }

    public final void enqueue$okhttp(okhttp3.internal.connection.RealCall.AsyncCall r2) {
            r1 = this;
            r2.getClass()
            monitor-enter(r1)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r1.readyAsyncCalls     // Catch: java.lang.Throwable -> L21
            r0.add(r2)     // Catch: java.lang.Throwable -> L21
            okhttp3.internal.connection.RealCall r0 = r2.getCall()     // Catch: java.lang.Throwable -> L21
            boolean r0 = r0.getForWebSocket()     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L23
            java.lang.String r0 = r2.getHost()     // Catch: java.lang.Throwable -> L21
            okhttp3.internal.connection.RealCall$AsyncCall r0 = r1.findExistingCallWithHost(r0)     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L23
            r2.reuseCallsPerHostFrom(r0)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r2 = move-exception
            goto L28
        L23:
            monitor-exit(r1)
            r1.promoteAndExecute()
            return
        L28:
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void executed$okhttp(okhttp3.internal.connection.RealCall r2) {
            r1 = this;
            monitor-enter(r1)
            r2.getClass()     // Catch: java.lang.Throwable -> Lb
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r1.runningSyncCalls     // Catch: java.lang.Throwable -> Lb
            r0.add(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public final synchronized java.util.concurrent.ExecutorService executorService() {
            r9 = this;
            monitor-enter(r9)
            java.util.concurrent.ExecutorService r0 = r9.executorServiceOrNull     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L32
            r7.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = okhttp3.internal.Util.okHttpName     // Catch: java.lang.Throwable -> L32
            r0.append(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = " Dispatcher"
            r0.append(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L32
            r2 = 0
            java.util.concurrent.ThreadFactory r8 = okhttp3.internal.Util.threadFactory(r0, r2)     // Catch: java.lang.Throwable -> L32
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 60
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L32
            r9.executorServiceOrNull = r1     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r0 = move-exception
            goto L3b
        L34:
            java.util.concurrent.ExecutorService r0 = r9.executorServiceOrNull     // Catch: java.lang.Throwable -> L32
            r0.getClass()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r9)
            return r0
        L3b:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L32
            throw r0
    }

    public final void finished$okhttp(okhttp3.internal.connection.RealCall.AsyncCall r2) {
            r1 = this;
            r2.getClass()
            java.util.concurrent.atomic.AtomicInteger r0 = r2.getCallsPerHost()
            r0.decrementAndGet()
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r1.runningAsyncCalls
            r1.finished(r0, r2)
            return
    }

    public final void finished$okhttp(okhttp3.internal.connection.RealCall r2) {
            r1 = this;
            r2.getClass()
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r1.runningSyncCalls
            r1.finished(r0, r2)
            return
    }

    public final synchronized java.lang.Runnable getIdleCallback() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Runnable r0 = r1.idleCallback     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int getMaxRequests() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.maxRequests     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int getMaxRequestsPerHost() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.maxRequestsPerHost     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized java.util.List<okhttp3.Call> queuedCalls() {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r3.readyAsyncCalls     // Catch: java.lang.Throwable -> L24
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L24
            int r2 = tf.n.e1(r0)     // Catch: java.lang.Throwable -> L24
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L24
        L10:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L26
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.connection.RealCall$AsyncCall r2 = (okhttp3.internal.connection.RealCall.AsyncCall) r2     // Catch: java.lang.Throwable -> L24
            okhttp3.internal.connection.RealCall r2 = r2.getCall()     // Catch: java.lang.Throwable -> L24
            r1.add(r2)     // Catch: java.lang.Throwable -> L24
            goto L10
        L24:
            r0 = move-exception
            goto L2f
        L26:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L24
            r0.getClass()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            return r0
        L2f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    public final synchronized int queuedCallsCount() {
            r1 = this;
            monitor-enter(r1)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r1.readyAsyncCalls     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public final synchronized java.util.List<okhttp3.Call> runningCalls() {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r4.runningSyncCalls     // Catch: java.lang.Throwable -> L26
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r1 = r4.runningAsyncCalls     // Catch: java.lang.Throwable -> L26
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L26
            int r3 = tf.n.e1(r1)     // Catch: java.lang.Throwable -> L26
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L26
        L12:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L28
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.connection.RealCall$AsyncCall r3 = (okhttp3.internal.connection.RealCall.AsyncCall) r3     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.connection.RealCall r3 = r3.getCall()     // Catch: java.lang.Throwable -> L26
            r2.add(r3)     // Catch: java.lang.Throwable -> L26
            goto L12
        L26:
            r0 = move-exception
            goto L35
        L28:
            java.util.ArrayList r0 = tf.m.F1(r0, r2)     // Catch: java.lang.Throwable -> L26
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L26
            r0.getClass()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r4)
            return r0
        L35:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L26
            throw r0
    }

    public final synchronized int runningCallsCount() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r2.runningAsyncCalls     // Catch: java.lang.Throwable -> L10
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L10
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r1 = r2.runningSyncCalls     // Catch: java.lang.Throwable -> L10
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L10
            int r0 = r0 + r1
            monitor-exit(r2)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    public final synchronized void setIdleCallback(java.lang.Runnable r1) {
            r0 = this;
            monitor-enter(r0)
            r0.idleCallback = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public final void setMaxRequests(int r2) {
            r1 = this;
            r0 = 1
            if (r2 < r0) goto Le
            monitor-enter(r1)
            r1.maxRequests = r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            r1.promoteAndExecute()
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        Le:
            java.lang.String r0 = "max < 1: "
            java.lang.String r2 = eh.a.l(r2, r0)
            j8.o.q(r2)
            return
    }

    public final void setMaxRequestsPerHost(int r2) {
            r1 = this;
            r0 = 1
            if (r2 < r0) goto Le
            monitor-enter(r1)
            r1.maxRequestsPerHost = r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            r1.promoteAndExecute()
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        Le:
            java.lang.String r0 = "max < 1: "
            java.lang.String r2 = eh.a.l(r2, r0)
            j8.o.q(r2)
            return
    }
}
