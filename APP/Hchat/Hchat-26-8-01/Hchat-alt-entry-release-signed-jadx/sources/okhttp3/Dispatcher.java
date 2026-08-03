package okhttp3;

import gg.AbstractC1416l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p276sf.InterfaceC3954a;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final RealCall.AsyncCall findExistingCallWithHost(String str) {
        for (RealCall.AsyncCall asyncCall : this.runningAsyncCalls) {
            if (AbstractC1416l.m3825a(asyncCall.getHost(), str)) {
                return asyncCall;
            }
        }
        for (RealCall.AsyncCall asyncCall2 : this.readyAsyncCalls) {
            if (AbstractC1416l.m3825a(asyncCall2.getHost(), str)) {
                return asyncCall2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final <T> void finished(Deque<T> deque, T t9) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t9)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.idleCallback;
        }
        if (promoteAndExecute() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean promoteAndExecute() {
        int i9;
        boolean z9;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
                it.getClass();
                while (it.hasNext()) {
                    RealCall.AsyncCall next = it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    }
                    if (next.getCallsPerHost().get() < this.maxRequestsPerHost) {
                        it.remove();
                        next.getCallsPerHost().incrementAndGet();
                        arrayList.add(next);
                        this.runningAsyncCalls.add(next);
                    }
                }
                z9 = runningCallsCount() > 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (i9 = 0; i9 < size; i9++) {
            ((RealCall.AsyncCall) arrayList.get(i9)).executeOn(executorService());
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m10966deprecated_executorService() {
        return executorService();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void cancelAll() {
        try {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                it.next().getCall().cancel();
            }
            Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
            while (it2.hasNext()) {
                it2.next().getCall().cancel();
            }
            Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void enqueue$okhttp(RealCall.AsyncCall asyncCall) {
        RealCall.AsyncCall asyncCallFindExistingCallWithHost;
        asyncCall.getClass();
        synchronized (this) {
            this.readyAsyncCalls.add(asyncCall);
            if (!asyncCall.getCall().getForWebSocket() && (asyncCallFindExistingCallWithHost = findExistingCallWithHost(asyncCall.getHost())) != null) {
                asyncCall.reuseCallsPerHostFrom(asyncCallFindExistingCallWithHost);
            }
        }
        promoteAndExecute();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void executed$okhttp(RealCall realCall) {
        realCall.getClass();
        this.runningSyncCalls.add(realCall);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        try {
            if (this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(Util.okHttpName + " Dispatcher", false));
            }
            executorService = this.executorServiceOrNull;
            executorService.getClass();
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void finished$okhttp(RealCall.AsyncCall asyncCall) {
        asyncCall.getClass();
        asyncCall.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, asyncCall);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized List<Call> queuedCalls() {
        List<Call> listUnmodifiableList;
        try {
            ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(arrayDeque));
            Iterator<T> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } catch (Throwable th2) {
            throw th2;
        }
        return listUnmodifiableList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized List<Call> runningCalls() {
        List<Call> listUnmodifiableList;
        try {
            ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
            ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(arrayDeque2));
            Iterator<T> it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
            }
            listUnmodifiableList = Collections.unmodifiableList(AbstractC4166m.m8397F1(arrayDeque, arrayList));
            listUnmodifiableList.getClass();
        } catch (Throwable th2) {
            throw th2;
        }
        return listUnmodifiableList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setMaxRequests(int i9) {
        if (i9 < 1) {
            C2104o.m5291q(AbstractC0921a.m2249l(i9, "max < 1: "));
            return;
        }
        synchronized (this) {
            this.maxRequests = i9;
        }
        promoteAndExecute();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setMaxRequestsPerHost(int i9) {
        if (i9 < 1) {
            C2104o.m5291q(AbstractC0921a.m2249l(i9, "max < 1: "));
            return;
        }
        synchronized (this) {
            this.maxRequestsPerHost = i9;
        }
        promoteAndExecute();
    }

    public final void finished$okhttp(RealCall realCall) {
        realCall.getClass();
        finished(this.runningSyncCalls, realCall);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(ExecutorService executorService) {
        this();
        executorService.getClass();
        this.executorServiceOrNull = executorService;
    }
}
