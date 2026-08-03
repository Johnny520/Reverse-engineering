package okhttp3.internal.connection;

import gg.AbstractC1411g;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealConnectionPool {
    public static final Companion Companion = new Companion(null);
    private final TaskQueue cleanupQueue;
    private final RealConnectionPool$cleanupTask$1 cleanupTask;
    private final ConcurrentLinkedQueue<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, int i9, long j3, TimeUnit timeUnit) {
        taskRunner.getClass();
        timeUnit.getClass();
        this.maxIdleConnections = i9;
        this.keepAliveDurationNs = timeUnit.toNanos(j3);
        this.cleanupQueue = taskRunner.newQueue();
        final String strM2255r = AbstractC0921a.m2255r(new StringBuilder(), Util.okHttpName, " ConnectionPool");
        this.cleanupTask = new Task(strM2255r) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return this.this$0.cleanup(System.nanoTime());
            }
        };
        this.connections = new ConcurrentLinkedQueue<>();
        if (j3 > 0) {
            return;
        }
        C2104o.m5291q(AbstractC0255e.m1018g(j3, "keepAliveDuration <= 0: "));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int pruneAndGetAllocationCount(RealConnection realConnection, long j3) {
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
            return 0;
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        int i9 = 0;
        while (i9 < calls.size()) {
            Reference<RealCall> reference = calls.get(i9);
            if (reference.get() != null) {
                i9++;
            } else {
                Platform.Companion.get().logCloseableLeak("A connection to " + realConnection.route().address().url() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).getCallStackTrace());
                calls.remove(i9);
                realConnection.setNoNewExchanges(true);
                if (calls.isEmpty()) {
                    realConnection.setIdleAtNs$okhttp(j3 - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return calls.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean callAcquirePooledConnection(Address address, RealCall realCall, List<Route> list, boolean z9) {
        address.getClass();
        realCall.getClass();
        for (RealConnection realConnection : this.connections) {
            realConnection.getClass();
            synchronized (realConnection) {
                if (z9) {
                    try {
                        if (!realConnection.isMultiplexed$okhttp()) {
                            continue;
                        } else if (!realConnection.isEligible$okhttp(address, list)) {
                            realCall.acquireConnectionNoEvents(realConnection);
                            return true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (!realConnection.isEligible$okhttp(address, list)) {
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long cleanup(long j3) {
        int i9 = 0;
        long j4 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i10 = 0;
        for (RealConnection realConnection2 : this.connections) {
            realConnection2.getClass();
            synchronized (realConnection2) {
                if (pruneAndGetAllocationCount(realConnection2, j3) > 0) {
                    i10++;
                } else {
                    i9++;
                    long idleAtNs$okhttp = j3 - realConnection2.getIdleAtNs$okhttp();
                    if (idleAtNs$okhttp > j4) {
                        realConnection = realConnection2;
                        j4 = idleAtNs$okhttp;
                    }
                }
            }
        }
        long j5 = this.keepAliveDurationNs;
        if (j4 < j5 && i9 <= this.maxIdleConnections) {
            if (i9 > 0) {
                return j5 - j4;
            }
            if (i10 > 0) {
                return j5;
            }
            return -1L;
        }
        realConnection.getClass();
        synchronized (realConnection) {
            if (!realConnection.getCalls().isEmpty()) {
                return 0L;
            }
            if (realConnection.getIdleAtNs$okhttp() + j4 != j3) {
                return 0L;
            }
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
            Util.closeQuietly(realConnection.socket());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.cancelAll();
            }
            return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean connectionBecameIdle(RealConnection realConnection) {
        realConnection.getClass();
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
            return false;
        }
        if (!realConnection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        realConnection.setNoNewExchanges(true);
        this.connections.remove(realConnection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int connectionCount() {
        return this.connections.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void evictAll() {
        Socket socket;
        Iterator<RealConnection> it = this.connections.iterator();
        it.getClass();
        while (it.hasNext()) {
            RealConnection next = it.next();
            next.getClass();
            synchronized (next) {
                if (next.getCalls().isEmpty()) {
                    it.remove();
                    next.setNoNewExchanges(true);
                    socket = next.socket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                Util.closeQuietly(socket);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int idleConnectionCount() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = this.connections;
        int i9 = 0;
        if (concurrentLinkedQueue != null && concurrentLinkedQueue.isEmpty()) {
            return 0;
        }
        for (RealConnection realConnection : concurrentLinkedQueue) {
            realConnection.getClass();
            synchronized (realConnection) {
                zIsEmpty = realConnection.getCalls().isEmpty();
            }
            if (zIsEmpty && (i9 = i9 + 1) < 0) {
                AbstractC0000a.m30P0();
                throw null;
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void put(RealConnection realConnection) {
        realConnection.getClass();
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
        } else {
            this.connections.add(realConnection);
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.connection.RealConnectionPool.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RealConnectionPool get(ConnectionPool connectionPool) {
            connectionPool.getClass();
            return connectionPool.getDelegate$okhttp();
        }

        private Companion() {
        }
    }
}
