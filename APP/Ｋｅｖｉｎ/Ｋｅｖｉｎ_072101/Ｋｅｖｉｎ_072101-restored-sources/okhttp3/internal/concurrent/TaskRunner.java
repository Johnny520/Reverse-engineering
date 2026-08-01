package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: TaskRunner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 #2\u00020\u0001:\u0003\"#$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u001c\u001a\u00020\u0016J\u0015\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001fJ\u0006\u0010 \u001a\u00020\tJ\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m115d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "", "backend", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;)V", "getBackend", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "busyQueues", "", "Lokhttp3/internal/concurrent/TaskQueue;", "coordinatorWaiting", "", "coordinatorWakeUpAt", "", "nextQueueName", "", "readyQueues", "runnable", "Ljava/lang/Runnable;", "activeQueues", "", "afterRun", "", "task", "Lokhttp3/internal/concurrent/Task;", "delayNanos", "awaitTaskToRun", "beforeRun", "cancelAll", "kickCoordinator", "taskQueue", "kickCoordinator$okhttp", "newQueue", "runTask", "Backend", "Companion", "RealBackend", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class TaskRunner {
    public static final okhttp3.internal.concurrent.TaskRunner.Companion Companion = null;
    public static final okhttp3.internal.concurrent.TaskRunner INSTANCE = null;
    private static final java.util.logging.Logger logger = null;
    private final okhttp3.internal.concurrent.TaskRunner.Backend backend;
    private final java.util.List<okhttp3.internal.concurrent.TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName;
    private final java.util.List<okhttp3.internal.concurrent.TaskQueue> readyQueues;
    private final java.lang.Runnable runnable;

    /* JADX INFO: compiled from: TaskRunner.kt */
    @kotlin.Metadata(m114d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\tH&¨\u0006\u000e"}, m115d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "beforeTask", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "coordinatorNotify", "coordinatorWait", "nanos", "", "execute", "runnable", "Ljava/lang/Runnable;", "nanoTime", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public interface Backend {
        void beforeTask(okhttp3.internal.concurrent.TaskRunner r1);

        void coordinatorNotify(okhttp3.internal.concurrent.TaskRunner r1);

        void coordinatorWait(okhttp3.internal.concurrent.TaskRunner r1, long r2);

        void execute(java.lang.Runnable r1);

        long nanoTime();
    }

    /* JADX INFO: compiled from: TaskRunner.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m115d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "()V", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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
                java.util.logging.Logger r0 = okhttp3.internal.concurrent.TaskRunner.access$getLogger$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: TaskRunner.kt */
    @kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0006\u0010\u0013\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m115d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "(Ljava/util/concurrent/ThreadFactory;)V", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "beforeTask", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "coordinatorNotify", "coordinatorWait", "nanos", "", "execute", "runnable", "Ljava/lang/Runnable;", "nanoTime", "shutdown", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class RealBackend implements okhttp3.internal.concurrent.TaskRunner.Backend {
        private final java.util.concurrent.ThreadPoolExecutor executor;

        public RealBackend(java.util.concurrent.ThreadFactory r10) {
                r9 = this;
                java.lang.String r0 = "threadFactory"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                r9.<init>()
                java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
                java.util.concurrent.SynchronousQueue r1 = new java.util.concurrent.SynchronousQueue
                r1.<init>()
                r7 = r1
                java.util.concurrent.BlockingQueue r7 = (java.util.concurrent.BlockingQueue) r7
                r2 = 0
                r3 = 2147483647(0x7fffffff, float:NaN)
                r4 = 60
                r1 = r0
                r8 = r10
                r1.<init>(r2, r3, r4, r6, r7, r8)
                r9.executor = r0
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void beforeTask(okhttp3.internal.concurrent.TaskRunner r2) {
                r1 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(okhttp3.internal.concurrent.TaskRunner r4) {
                r3 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = r4
                r1 = 0
                r2 = r0
                java.lang.Object r2 = (java.lang.Object) r2
                r2.notify()
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(okhttp3.internal.concurrent.TaskRunner r8, long r9) throws java.lang.InterruptedException {
                r7 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r0 = 1000000(0xf4240, double:4.940656E-318)
                long r2 = r9 / r0
                long r0 = r0 * r2
                long r0 = r9 - r0
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L17
                int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r4 <= 0) goto L1e
            L17:
                r4 = r8
                java.lang.Object r4 = (java.lang.Object) r4
                int r5 = (int) r0
                r4.wait(r2, r5)
            L1e:
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                java.lang.String r0 = "runnable"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.util.concurrent.ThreadPoolExecutor r0 = r1.executor
                r0.execute(r2)
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
                r2 = this;
                long r0 = java.lang.System.nanoTime()
                return r0
        }

        public final void shutdown() {
                r1 = this;
                java.util.concurrent.ThreadPoolExecutor r0 = r1.executor
                r0.shutdown()
                return
        }
    }

    static {
            okhttp3.internal.concurrent.TaskRunner$Companion r0 = new okhttp3.internal.concurrent.TaskRunner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.concurrent.TaskRunner.Companion = r0
            okhttp3.internal.concurrent.TaskRunner r0 = new okhttp3.internal.concurrent.TaskRunner
            okhttp3.internal.concurrent.TaskRunner$RealBackend r1 = new okhttp3.internal.concurrent.TaskRunner$RealBackend
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = okhttp3.internal.Util.okHttpName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " TaskRunner"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            java.util.concurrent.ThreadFactory r2 = okhttp3.internal.Util.threadFactory(r2, r3)
            r1.<init>(r2)
            okhttp3.internal.concurrent.TaskRunner$Backend r1 = (okhttp3.internal.concurrent.TaskRunner.Backend) r1
            r0.<init>(r1)
            okhttp3.internal.concurrent.TaskRunner.INSTANCE = r0
            java.lang.Class<okhttp3.internal.concurrent.TaskRunner> r0 = okhttp3.internal.concurrent.TaskRunner.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.lang.String r1 = "getLogger(TaskRunner::class.java.name)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            okhttp3.internal.concurrent.TaskRunner.logger = r0
            return
    }

    public TaskRunner(okhttp3.internal.concurrent.TaskRunner.Backend r2) {
            r1 = this;
            java.lang.String r0 = "backend"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.backend = r2
            r0 = 10000(0x2710, float:1.4013E-41)
            r1.nextQueueName = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.busyQueues = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.readyQueues = r0
            okhttp3.internal.concurrent.TaskRunner$runnable$1 r0 = new okhttp3.internal.concurrent.TaskRunner$runnable$1
            r0.<init>(r1)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.runnable = r0
            return
    }

    public static final /* synthetic */ java.util.logging.Logger access$getLogger$cp() {
            java.util.logging.Logger r0 = okhttp3.internal.concurrent.TaskRunner.logger
            return r0
    }

    public static final /* synthetic */ void access$runTask(okhttp3.internal.concurrent.TaskRunner r0, okhttp3.internal.concurrent.Task r1) {
            r0.runTask(r1)
            return
    }

    private final void afterRun(okhttp3.internal.concurrent.Task r6, long r7) {
            r5 = this;
            r0 = r5
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
            okhttp3.internal.concurrent.TaskQueue r0 = r6.getQueue$okhttp()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.internal.concurrent.Task r1 = r0.getActiveTask$okhttp()
            r2 = 1
            r3 = 0
            if (r1 != r6) goto L4a
            r1 = r2
            goto L4b
        L4a:
            r1 = r3
        L4b:
            if (r1 == 0) goto L80
            boolean r1 = r0.getCancelActiveTask$okhttp()
            r0.setCancelActiveTask$okhttp(r3)
            r3 = 0
            r0.setActiveTask$okhttp(r3)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r3 = r5.busyQueues
            r3.remove(r0)
            r3 = -1
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 == 0) goto L6e
            if (r1 != 0) goto L6e
            boolean r3 = r0.getShutdown$okhttp()
            if (r3 != 0) goto L6e
            r0.scheduleAndDecide$okhttp(r6, r7, r2)
        L6e:
            java.util.List r2 = r0.getFutureTasks$okhttp()
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L7f
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r2 = r5.readyQueues
            r2.add(r0)
        L7f:
            return
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private final void beforeRun(okhttp3.internal.concurrent.Task r6) {
            r5 = this;
            r0 = r5
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
            r0 = -1
            r6.setNextExecuteNanoTime$okhttp(r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r6.getQueue$okhttp()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.util.List r1 = r0.getFutureTasks$okhttp()
            r1.remove(r6)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r5.readyQueues
            r1.remove(r0)
            r0.setActiveTask$okhttp(r6)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r5.busyQueues
            r1.add(r0)
            return
    }

    private final void runTask(okhttp3.internal.concurrent.Task r7) {
            r6 = this;
            r0 = r6
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
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = r7.getName()
            r0.setName(r2)
            r2 = 0
            r2 = -1
            long r4 = r7.runOnce()     // Catch: java.lang.Throwable -> L63
            r2 = r4
            monitor-enter(r6)
            r4 = 0
            r6.afterRun(r7, r2)     // Catch: java.lang.Throwable -> L60
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L60
            monitor-exit(r6)
            r0.setName(r1)
            return
        L60:
            r4 = move-exception
            monitor-exit(r6)
            throw r4
        L63:
            r4 = move-exception
            monitor-enter(r6)
            r5 = 0
            r6.afterRun(r7, r2)     // Catch: java.lang.Throwable -> L71
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L71
            monitor-exit(r6)
            r0.setName(r1)
            throw r4
        L71:
            r4 = move-exception
            monitor-exit(r6)
            throw r4
    }

    public final java.util.List<okhttp3.internal.concurrent.TaskQueue> activeQueues() {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r3.busyQueues     // Catch: java.lang.Throwable -> L10
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L10
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r2 = r3.readyQueues     // Catch: java.lang.Throwable -> L10
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L10
            java.util.List r1 = kotlin.collections.CollectionsKt.plus(r1, r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r3)
            return r1
        L10:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final okhttp3.internal.concurrent.Task awaitTaskToRun() {
            r15 = this;
            r0 = r15
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
        L39:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r15.readyQueues
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L44
            return r1
        L44:
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r15.backend
            long r2 = r0.nanoTime()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = 0
            r6 = 0
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r7 = r15.readyQueues
            java.util.Iterator r7 = r7.iterator()
        L57:
            boolean r8 = r7.hasNext()
            r9 = 0
            if (r8 == 0) goto L89
            java.lang.Object r8 = r7.next()
            okhttp3.internal.concurrent.TaskQueue r8 = (okhttp3.internal.concurrent.TaskQueue) r8
            java.util.List r10 = r8.getFutureTasks$okhttp()
            java.lang.Object r10 = r10.get(r9)
            okhttp3.internal.concurrent.Task r10 = (okhttp3.internal.concurrent.Task) r10
            long r11 = r10.getNextExecuteNanoTime$okhttp()
            long r11 = r11 - r2
            r13 = 0
            long r11 = java.lang.Math.max(r13, r11)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 <= 0) goto L83
            long r4 = java.lang.Math.min(r11, r4)
            goto L57
        L83:
            if (r0 == 0) goto L87
            r6 = 1
            goto L89
        L87:
            r0 = r10
            goto L57
        L89:
            if (r0 == 0) goto La7
            r15.beforeRun(r0)
            if (r6 != 0) goto L9f
            boolean r1 = r15.coordinatorWaiting
            if (r1 != 0) goto La6
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r15.readyQueues
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto La6
        L9f:
            okhttp3.internal.concurrent.TaskRunner$Backend r1 = r15.backend
            java.lang.Runnable r7 = r15.runnable
            r1.execute(r7)
        La6:
            return r0
        La7:
            boolean r7 = r15.coordinatorWaiting
            if (r7 == 0) goto Lb8
            long r7 = r15.coordinatorWakeUpAt
            long r7 = r7 - r2
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 >= 0) goto Lb7
            okhttp3.internal.concurrent.TaskRunner$Backend r7 = r15.backend
            r7.coordinatorNotify(r15)
        Lb7:
            return r1
        Lb8:
            r1 = 1
            r15.coordinatorWaiting = r1
            long r7 = r2 + r4
            r15.coordinatorWakeUpAt = r7
            okhttp3.internal.concurrent.TaskRunner$Backend r1 = r15.backend     // Catch: java.lang.Throwable -> Lc9 java.lang.InterruptedException -> Lcb
            r1.coordinatorWait(r15, r4)     // Catch: java.lang.Throwable -> Lc9 java.lang.InterruptedException -> Lcb
        Lc5:
            r15.coordinatorWaiting = r9
            goto L39
        Lc9:
            r1 = move-exception
            goto Ld0
        Lcb:
            r1 = move-exception
            r15.cancelAll()     // Catch: java.lang.Throwable -> Lc9
            goto Lc5
        Ld0:
            r15.coordinatorWaiting = r9
            throw r1
    }

    public final void cancelAll() {
            r4 = this;
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r4.busyQueues
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            r1 = -1
            if (r1 >= r0) goto L19
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r4.busyQueues
            java.lang.Object r1 = r1.get(r0)
            okhttp3.internal.concurrent.TaskQueue r1 = (okhttp3.internal.concurrent.TaskQueue) r1
            r1.cancelAllAndDecide$okhttp()
            int r0 = r0 + (-1)
            goto L8
        L19:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r4.readyQueues
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L21:
            if (r1 >= r0) goto L40
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r2 = r4.readyQueues
            java.lang.Object r2 = r2.get(r0)
            okhttp3.internal.concurrent.TaskQueue r2 = (okhttp3.internal.concurrent.TaskQueue) r2
            r2.cancelAllAndDecide$okhttp()
            java.util.List r3 = r2.getFutureTasks$okhttp()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L3d
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r3 = r4.readyQueues
            r3.remove(r0)
        L3d:
            int r0 = r0 + (-1)
            goto L21
        L40:
            return
    }

    public final okhttp3.internal.concurrent.TaskRunner.Backend getBackend() {
            r1 = this;
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r1.backend
            return r0
    }

    public final void kickCoordinator$okhttp(okhttp3.internal.concurrent.TaskQueue r6) {
            r5 = this;
            java.lang.String r0 = "taskQueue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            r1 = 0
            boolean r2 = okhttp3.internal.Util.assertionsEnabled
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Thread.holdsLock(r0)
            if (r2 == 0) goto L12
            goto L3d
        L12:
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
        L3d:
            okhttp3.internal.concurrent.Task r0 = r6.getActiveTask$okhttp()
            if (r0 != 0) goto L5b
            java.util.List r0 = r6.getFutureTasks$okhttp()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L56
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r5.readyQueues
            okhttp3.internal.Util.addIfAbsent(r0, r6)
            goto L5b
        L56:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r5.readyQueues
            r0.remove(r6)
        L5b:
            boolean r0 = r5.coordinatorWaiting
            if (r0 == 0) goto L65
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r5.backend
            r0.coordinatorNotify(r5)
            goto L6c
        L65:
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r5.backend
            java.lang.Runnable r1 = r5.runnable
            r0.execute(r1)
        L6c:
            return
    }

    public final okhttp3.internal.concurrent.TaskQueue newQueue() {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            int r1 = r4.nextQueueName     // Catch: java.lang.Throwable -> L23
            int r2 = r1 + 1
            r4.nextQueueName = r2     // Catch: java.lang.Throwable -> L23
            monitor-exit(r4)
            r0 = r1
            okhttp3.internal.concurrent.TaskQueue r1 = new okhttp3.internal.concurrent.TaskQueue
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 81
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r4, r2)
            return r1
        L23:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
