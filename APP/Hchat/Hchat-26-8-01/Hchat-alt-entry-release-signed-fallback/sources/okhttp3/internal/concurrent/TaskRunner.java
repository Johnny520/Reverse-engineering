package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
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

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Backend {
        void beforeTask(okhttp3.internal.concurrent.TaskRunner r1);

        void coordinatorNotify(okhttp3.internal.concurrent.TaskRunner r1);

        void coordinatorWait(okhttp3.internal.concurrent.TaskRunner r1, long r2);

        void execute(java.lang.Runnable r1);

        long nanoTime();
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

        public final java.util.logging.Logger getLogger() {
                r1 = this;
                java.util.logging.Logger r0 = okhttp3.internal.concurrent.TaskRunner.access$getLogger$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class RealBackend implements okhttp3.internal.concurrent.TaskRunner.Backend {
        private final java.util.concurrent.ThreadPoolExecutor executor;

        public RealBackend(java.util.concurrent.ThreadFactory r9) {
                r8 = this;
                r9.getClass()
                r8.<init>()
                java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
                java.util.concurrent.SynchronousQueue r6 = new java.util.concurrent.SynchronousQueue
                r6.<init>()
                r1 = 0
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = 60
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                r7 = r9
                r0.<init>(r1, r2, r3, r5, r6, r7)
                r8.executor = r0
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void beforeTask(okhttp3.internal.concurrent.TaskRunner r1) {
                r0 = this;
                r1.getClass()
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(okhttp3.internal.concurrent.TaskRunner r1) {
                r0 = this;
                r1.getClass()
                r1.notify()
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(okhttp3.internal.concurrent.TaskRunner r8, long r9) {
                r7 = this;
                r8.getClass()
                r0 = 1000000(0xf4240, double:4.940656E-318)
                long r2 = r9 / r0
                long r0 = r0 * r2
                long r0 = r9 - r0
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L17
                int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r9 <= 0) goto L16
                goto L17
            L16:
                return
            L17:
                int r9 = (int) r0
                r8.wait(r2, r9)
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                r2.getClass()
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
            r2.append(r3)
            java.lang.String r3 = " TaskRunner"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            java.util.concurrent.ThreadFactory r2 = okhttp3.internal.Util.threadFactory(r2, r3)
            r1.<init>(r2)
            r0.<init>(r1)
            okhttp3.internal.concurrent.TaskRunner.INSTANCE = r0
            java.lang.Class<okhttp3.internal.concurrent.TaskRunner> r0 = okhttp3.internal.concurrent.TaskRunner.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            r0.getClass()
            okhttp3.internal.concurrent.TaskRunner.logger = r0
            return
    }

    public TaskRunner(okhttp3.internal.concurrent.TaskRunner.Backend r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.backend = r1
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.nextQueueName = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.busyQueues = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.readyQueues = r1
            okhttp3.internal.concurrent.TaskRunner$runnable$1 r1 = new okhttp3.internal.concurrent.TaskRunner$runnable$1
            r1.<init>(r0)
            r0.runnable = r1
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

    private final void afterRun(okhttp3.internal.concurrent.Task r5, long r6) {
            r4 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L19
            boolean r0 = java.lang.Thread.holdsLock(r4)
            if (r0 == 0) goto Lb
            goto L19
        Lb:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = " MUST hold lock on "
            j8.o.i(r5, r6, r4)
            return
        L19:
            okhttp3.internal.concurrent.TaskQueue r0 = r5.getQueue$okhttp()
            r0.getClass()
            okhttp3.internal.concurrent.Task r1 = r0.getActiveTask$okhttp()
            if (r1 != r5) goto L59
            boolean r1 = r0.getCancelActiveTask$okhttp()
            r2 = 0
            r0.setCancelActiveTask$okhttp(r2)
            r2 = 0
            r0.setActiveTask$okhttp(r2)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r2 = r4.busyQueues
            r2.remove(r0)
            r2 = -1
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L49
            if (r1 != 0) goto L49
            boolean r1 = r0.getShutdown$okhttp()
            if (r1 != 0) goto L49
            r1 = 1
            r0.scheduleAndDecide$okhttp(r5, r6, r1)
        L49:
            java.util.List r5 = r0.getFutureTasks$okhttp()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L58
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r5 = r4.readyQueues
            r5.add(r0)
        L58:
            return
        L59:
            java.lang.String r5 = "Check failed."
            j8.o.A(r5)
            return
    }

    private final void beforeRun(okhttp3.internal.concurrent.Task r3) {
            r2 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L19
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 == 0) goto Lb
            goto L19
        Lb:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = " MUST hold lock on "
            j8.o.i(r3, r0, r2)
            return
        L19:
            r0 = -1
            r3.setNextExecuteNanoTime$okhttp(r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r3.getQueue$okhttp()
            r0.getClass()
            java.util.List r1 = r0.getFutureTasks$okhttp()
            r1.remove(r3)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r2.readyQueues
            r1.remove(r0)
            r0.setActiveTask$okhttp(r3)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r3 = r2.busyQueues
            r3.add(r0)
            return
    }

    private final void runTask(okhttp3.internal.concurrent.Task r6) {
            r5 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L19
            boolean r0 = java.lang.Thread.holdsLock(r5)
            if (r0 != 0) goto Lb
            goto L19
        Lb:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r0 = " MUST NOT hold lock on "
            j8.o.i(r6, r0, r5)
            return
        L19:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = r6.getName()
            r0.setName(r2)
            long r2 = r6.runOnce()     // Catch: java.lang.Throwable -> L38
            monitor-enter(r5)
            r5.afterRun(r6, r2)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r5)
            r0.setName(r1)
            return
        L35:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L38:
            r2 = move-exception
            monitor-enter(r5)
            r3 = -1
            r5.afterRun(r6, r3)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r5)
            r0.setName(r1)
            throw r2
        L44:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public final java.util.List<okhttp3.internal.concurrent.TaskQueue> activeQueues() {
            r2 = this;
            monitor-enter(r2)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r2.busyQueues     // Catch: java.lang.Throwable -> Lb
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r2.readyQueues     // Catch: java.lang.Throwable -> Lb
            java.util.ArrayList r0 = tf.m.F1(r0, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final okhttp3.internal.concurrent.Task awaitTaskToRun() {
            r14 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1a
            boolean r0 = java.lang.Thread.holdsLock(r14)
            if (r0 == 0) goto Lb
            goto L1a
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " MUST hold lock on "
            j8.o.i(r0, r1, r14)
            r0 = 0
            return r0
        L1a:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r14.readyQueues
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L24
            return r1
        L24:
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.backend
            long r2 = r0.nanoTime()
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r14.readyQueues
            java.util.Iterator r0 = r0.iterator()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r1
        L36:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L68
            java.lang.Object r7 = r0.next()
            okhttp3.internal.concurrent.TaskQueue r7 = (okhttp3.internal.concurrent.TaskQueue) r7
            java.util.List r7 = r7.getFutureTasks$okhttp()
            java.lang.Object r7 = r7.get(r9)
            okhttp3.internal.concurrent.Task r7 = (okhttp3.internal.concurrent.Task) r7
            long r10 = r7.getNextExecuteNanoTime$okhttp()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L62
            long r4 = java.lang.Math.min(r10, r4)
            goto L36
        L62:
            if (r6 == 0) goto L66
            r0 = r8
            goto L69
        L66:
            r6 = r7
            goto L36
        L68:
            r0 = r9
        L69:
            if (r6 == 0) goto L84
            r14.beforeRun(r6)
            if (r0 != 0) goto L7c
            boolean r0 = r14.coordinatorWaiting
            if (r0 != 0) goto L83
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r14.readyQueues
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L83
        L7c:
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.backend
            java.lang.Runnable r1 = r14.runnable
            r0.execute(r1)
        L83:
            return r6
        L84:
            boolean r0 = r14.coordinatorWaiting
            if (r0 == 0) goto L95
            long r6 = r14.coordinatorWakeUpAt
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L94
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.backend
            r0.coordinatorNotify(r14)
        L94:
            return r1
        L95:
            r14.coordinatorWaiting = r8
            long r2 = r2 + r4
            r14.coordinatorWakeUpAt = r2
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.backend     // Catch: java.lang.Throwable -> La3 java.lang.InterruptedException -> La5
            r0.coordinatorWait(r14, r4)     // Catch: java.lang.Throwable -> La3 java.lang.InterruptedException -> La5
        L9f:
            r14.coordinatorWaiting = r9
            goto L1a
        La3:
            r0 = move-exception
            goto La9
        La5:
            r14.cancelAll()     // Catch: java.lang.Throwable -> La3
            goto L9f
        La9:
            r14.coordinatorWaiting = r9
            throw r0
    }

    public final void cancelAll() {
            r3 = this;
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r3.busyQueues
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            r1 = -1
            if (r1 >= r0) goto L19
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r3.busyQueues
            java.lang.Object r1 = r1.get(r0)
            okhttp3.internal.concurrent.TaskQueue r1 = (okhttp3.internal.concurrent.TaskQueue) r1
            r1.cancelAllAndDecide$okhttp()
            int r0 = r0 + (-1)
            goto L8
        L19:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r3.readyQueues
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L21:
            if (r1 >= r0) goto L40
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r2 = r3.readyQueues
            java.lang.Object r2 = r2.get(r0)
            okhttp3.internal.concurrent.TaskQueue r2 = (okhttp3.internal.concurrent.TaskQueue) r2
            r2.cancelAllAndDecide$okhttp()
            java.util.List r2 = r2.getFutureTasks$okhttp()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3d
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r2 = r3.readyQueues
            r2.remove(r0)
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

    public final void kickCoordinator$okhttp(okhttp3.internal.concurrent.TaskQueue r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 == 0) goto Le
            goto L1c
        Le:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = " MUST hold lock on "
            j8.o.i(r3, r0, r2)
            return
        L1c:
            okhttp3.internal.concurrent.Task r0 = r3.getActiveTask$okhttp()
            if (r0 != 0) goto L35
            java.util.List r0 = r3.getFutureTasks$okhttp()
            boolean r0 = r0.isEmpty()
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r2.readyQueues
            if (r0 != 0) goto L32
            okhttp3.internal.Util.addIfAbsent(r1, r3)
            goto L35
        L32:
            r1.remove(r3)
        L35:
            boolean r3 = r2.coordinatorWaiting
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r2.backend
            if (r3 == 0) goto L3f
            r0.coordinatorNotify(r2)
            return
        L3f:
            java.lang.Runnable r3 = r2.runnable
            r0.execute(r3)
            return
    }

    public final okhttp3.internal.concurrent.TaskQueue newQueue() {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.nextQueueName     // Catch: java.lang.Throwable -> L14
            int r1 = r0 + 1
            r3.nextQueueName = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            okhttp3.internal.concurrent.TaskQueue r1 = new okhttp3.internal.concurrent.TaskQueue
            java.lang.String r2 = "Q"
            java.lang.String r0 = eh.a.l(r0, r2)
            r1.<init>(r3, r0)
            return r1
        L14:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}
