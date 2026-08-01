package okhttp3;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0019\u0010 \u001a\u00020\u001f2\n\u0010!\u001a\u00060\u001aR\u00020\u001bH\u0000¢\u0006\u0002\b\"J\u0015\u0010#\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001bH\u0000¢\u0006\u0002\b$J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b%J\u0016\u0010&\u001a\b\u0018\u00010\u001aR\u00020\u001b2\u0006\u0010'\u001a\u00020(H\u0002J)\u0010)\u001a\u00020\u001f\"\u0004\b\u0000\u0010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H*0,2\u0006\u0010!\u001a\u0002H*H\u0002¢\u0006\u0002\u0010-J\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001bH\u0000¢\u0006\u0002\b.J\u0019\u0010)\u001a\u00020\u001f2\n\u0010!\u001a\u00060\u001aR\u00020\u001bH\u0000¢\u0006\u0002\b.J\b\u0010/\u001a\u000200H\u0002J\f\u00101\u001a\b\u0012\u0004\u0012\u00020302J\u0006\u00104\u001a\u00020\u0010J\f\u00105\u001a\b\u0012\u0004\u0012\u00020302J\u0006\u00106\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u001aR\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\f\u0012\b\u0012\u00060\u001aR\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m115d2 = {"Lokhttp3/Dispatcher;", "", "executorService", "Ljava/util/concurrent/ExecutorService;", "(Ljava/util/concurrent/ExecutorService;)V", "()V", "()Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "<set-?>", "Ljava/lang/Runnable;", "idleCallback", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "maxRequests", "", "getMaxRequests", "()I", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "readyAsyncCalls", "Ljava/util/ArrayDeque;", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "runningAsyncCalls", "runningSyncCalls", "cancelAll", "", "enqueue", "call", "enqueue$okhttp", "executed", "executed$okhttp", "-deprecated_executorService", "findExistingCallWithHost", "host", "", "finished", "T", "calls", "Ljava/util/Deque;", "(Ljava/util/Deque;Ljava/lang/Object;)V", "finished$okhttp", "promoteAndExecute", "", "queuedCalls", "", "Lokhttp3/Call;", "queuedCallsCount", "runningCalls", "runningCallsCount", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

    public Dispatcher(java.util.concurrent.ExecutorService r2) {
            r1 = this;
            java.lang.String r0 = "executorService"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.executorServiceOrNull = r2
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
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
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
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 == 0) goto L23
            return r1
        L3a:
            r0 = 0
            return r0
    }

    private final <T> void finished(java.util.Deque<T> r5, T r6) {
            r4 = this;
            r0 = 0
            monitor-enter(r4)
            r1 = 0
            boolean r2 = r5.remove(r6)     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L1c
            java.lang.Runnable r2 = r4.idleCallback     // Catch: java.lang.Throwable -> L24
            r0 = r2
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L24
            monitor-exit(r4)
            boolean r1 = r4.promoteAndExecute()
            if (r1 != 0) goto L1b
            if (r0 == 0) goto L1b
            r0.run()
        L1b:
            return
        L1c:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "Call wasn't in-flight!"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L24
            throw r2     // Catch: java.lang.Throwable -> L24
        L24:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
    }

    private final boolean promoteAndExecute() {
            r7 = this;
            r0 = r7
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L38
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 != 0) goto Ld
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
            java.lang.String r4 = " MUST NOT hold lock on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L38:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            monitor-enter(r7)
            r2 = 0
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r3 = r7.readyAsyncCalls     // Catch: java.lang.Throwable -> Lae
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r4 = "readyAsyncCalls.iterator()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.Throwable -> Lae
        L4e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lae
            if (r4 == 0) goto L88
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lae
            okhttp3.internal.connection.RealCall$AsyncCall r4 = (okhttp3.internal.connection.RealCall.AsyncCall) r4     // Catch: java.lang.Throwable -> Lae
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r5 = r7.runningAsyncCalls     // Catch: java.lang.Throwable -> Lae
            int r5 = r5.size()     // Catch: java.lang.Throwable -> Lae
            int r6 = r7.maxRequests     // Catch: java.lang.Throwable -> Lae
            if (r5 >= r6) goto L88
            java.util.concurrent.atomic.AtomicInteger r5 = r4.getCallsPerHost()     // Catch: java.lang.Throwable -> Lae
            int r5 = r5.get()     // Catch: java.lang.Throwable -> Lae
            int r6 = r7.maxRequestsPerHost     // Catch: java.lang.Throwable -> Lae
            if (r5 >= r6) goto L4e
            r3.remove()     // Catch: java.lang.Throwable -> Lae
            java.util.concurrent.atomic.AtomicInteger r5 = r4.getCallsPerHost()     // Catch: java.lang.Throwable -> Lae
            r5.incrementAndGet()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r5 = "asyncCall"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)     // Catch: java.lang.Throwable -> Lae
            r0.add(r4)     // Catch: java.lang.Throwable -> Lae
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r5 = r7.runningAsyncCalls     // Catch: java.lang.Throwable -> Lae
            r5.add(r4)     // Catch: java.lang.Throwable -> Lae
            goto L4e
        L88:
            int r4 = r7.runningCallsCount()     // Catch: java.lang.Throwable -> Lae
            if (r4 <= 0) goto L90
            r4 = 1
            goto L91
        L90:
            r4 = 0
        L91:
            r1 = r4
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r7)
            r2 = 0
            int r3 = r0.size()
        L9b:
            if (r2 >= r3) goto Lad
            java.lang.Object r4 = r0.get(r2)
            okhttp3.internal.connection.RealCall$AsyncCall r4 = (okhttp3.internal.connection.RealCall.AsyncCall) r4
            java.util.concurrent.ExecutorService r5 = r7.executorService()
            r4.executeOn(r5)
            int r2 = r2 + 1
            goto L9b
        Lad:
            return r1
        Lae:
            r2 = move-exception
            monitor-exit(r7)
            throw r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "executorService", imports = {}))
    /* JADX INFO: renamed from: -deprecated_executorService, reason: not valid java name */
    public final java.util.concurrent.ExecutorService m10272deprecated_executorService() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.executorService()
            return r0
    }

    public final synchronized void cancelAll() {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r3.readyAsyncCalls     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4d
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4d
            okhttp3.internal.connection.RealCall$AsyncCall r1 = (okhttp3.internal.connection.RealCall.AsyncCall) r1     // Catch: java.lang.Throwable -> L4d
            okhttp3.internal.connection.RealCall r2 = r1.getCall()     // Catch: java.lang.Throwable -> L4d
            r2.cancel()     // Catch: java.lang.Throwable -> L4d
            goto L7
        L1b:
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r3.runningAsyncCalls     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4d
        L21:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4d
            okhttp3.internal.connection.RealCall$AsyncCall r1 = (okhttp3.internal.connection.RealCall.AsyncCall) r1     // Catch: java.lang.Throwable -> L4d
            okhttp3.internal.connection.RealCall r2 = r1.getCall()     // Catch: java.lang.Throwable -> L4d
            r2.cancel()     // Catch: java.lang.Throwable -> L4d
            goto L21
        L35:
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r3.runningSyncCalls     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4d
        L3b:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4d
            okhttp3.internal.connection.RealCall r1 = (okhttp3.internal.connection.RealCall) r1     // Catch: java.lang.Throwable -> L4d
            r1.cancel()     // Catch: java.lang.Throwable -> L4d
            goto L3b
        L4b:
            monitor-exit(r3)
            return
        L4d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4d
            throw r0
    }

    public final void enqueue$okhttp(okhttp3.internal.connection.RealCall.AsyncCall r3) {
            r2 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            monitor-enter(r2)
            r0 = 0
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r1 = r2.readyAsyncCalls     // Catch: java.lang.Throwable -> L2b
            r1.add(r3)     // Catch: java.lang.Throwable -> L2b
            okhttp3.internal.connection.RealCall r1 = r3.getCall()     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r1.getForWebSocket()     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L23
            java.lang.String r1 = r3.getHost()     // Catch: java.lang.Throwable -> L2b
            okhttp3.internal.connection.RealCall$AsyncCall r1 = r2.findExistingCallWithHost(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L23
            r3.reuseCallsPerHostFrom(r1)     // Catch: java.lang.Throwable -> L2b
        L23:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r2)
            r2.promoteAndExecute()
            return
        L2b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized void executed$okhttp(okhttp3.internal.connection.RealCall r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r1.runningSyncCalls     // Catch: java.lang.Throwable -> Ld
            r0.add(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public final synchronized java.util.concurrent.ExecutorService executorService() {
            r9 = this;
            monitor-enter(r9)
            java.util.concurrent.ExecutorService r0 = r9.executorServiceOrNull     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L39
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.SynchronousQueue r1 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            r7 = r1
            java.util.concurrent.BlockingQueue r7 = (java.util.concurrent.BlockingQueue) r7     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = okhttp3.internal.Util.okHttpName     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = " Dispatcher"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L40
            r2 = 0
            java.util.concurrent.ThreadFactory r8 = okhttp3.internal.Util.threadFactory(r1, r2)     // Catch: java.lang.Throwable -> L40
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 60
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0     // Catch: java.lang.Throwable -> L40
            r9.executorServiceOrNull = r0     // Catch: java.lang.Throwable -> L40
        L39:
            java.util.concurrent.ExecutorService r0 = r9.executorServiceOrNull     // Catch: java.lang.Throwable -> L40
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r9)
            return r0
        L40:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L40
            throw r0
    }

    public final void finished$okhttp(okhttp3.internal.connection.RealCall.AsyncCall r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.getCallsPerHost()
            r0.decrementAndGet()
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r1.runningAsyncCalls
            java.util.Deque r0 = (java.util.Deque) r0
            r1.finished(r0, r2)
            return
    }

    public final void finished$okhttp(okhttp3.internal.connection.RealCall r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r1.runningSyncCalls
            java.util.Deque r0 = (java.util.Deque) r0
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
            r10 = this;
            monitor-enter(r10)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r10.readyAsyncCalls     // Catch: java.lang.Throwable -> L3e
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r3)     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3e
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L3e
            r3 = r0
            r4 = 0
            java.util.Iterator r5 = r3.iterator()     // Catch: java.lang.Throwable -> L3e
        L19:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r6 == 0) goto L2f
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L3e
            r7 = r6
            okhttp3.internal.connection.RealCall$AsyncCall r7 = (okhttp3.internal.connection.RealCall.AsyncCall) r7     // Catch: java.lang.Throwable -> L3e
            r8 = 0
            okhttp3.internal.connection.RealCall r9 = r7.getCall()     // Catch: java.lang.Throwable -> L3e
            r2.add(r9)     // Catch: java.lang.Throwable -> L3e
            goto L19
        L2f:
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L3e
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "unmodifiableList(readyAsyncCalls.map { it.call })"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r10)
            return r0
        L3e:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L3e
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
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r11.runningSyncCalls     // Catch: java.lang.Throwable -> L48
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L48
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r1 = r11.runningAsyncCalls     // Catch: java.lang.Throwable -> L48
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L48
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r4)     // Catch: java.lang.Throwable -> L48
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L48
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L48
            r4 = r1
            r5 = 0
            java.util.Iterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> L48
        L1d:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto L33
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L48
            r8 = r7
            okhttp3.internal.connection.RealCall$AsyncCall r8 = (okhttp3.internal.connection.RealCall.AsyncCall) r8     // Catch: java.lang.Throwable -> L48
            r9 = 0
            okhttp3.internal.connection.RealCall r10 = r8.getCall()     // Catch: java.lang.Throwable -> L48
            r3.add(r10)     // Catch: java.lang.Throwable -> L48
            goto L1d
        L33:
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L48
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L48
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r3)     // Catch: java.lang.Throwable -> L48
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "unmodifiableList(running…yncCalls.map { it.call })"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r11)
            return r0
        L48:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L48
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

    public final void setMaxRequests(int r4) {
            r3 = this;
            r0 = 1
            if (r4 < r0) goto L4
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L16
            monitor-enter(r3)
            r0 = 0
            r3.maxRequests = r4     // Catch: java.lang.Throwable -> L13
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)
            r3.promoteAndExecute()
            return
        L13:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L16:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "max < 1: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final void setMaxRequestsPerHost(int r4) {
            r3 = this;
            r0 = 1
            if (r4 < r0) goto L4
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L16
            monitor-enter(r3)
            r0 = 0
            r3.maxRequestsPerHost = r4     // Catch: java.lang.Throwable -> L13
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)
            r3.promoteAndExecute()
            return
        L13:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L16:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "max < 1: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }
}
