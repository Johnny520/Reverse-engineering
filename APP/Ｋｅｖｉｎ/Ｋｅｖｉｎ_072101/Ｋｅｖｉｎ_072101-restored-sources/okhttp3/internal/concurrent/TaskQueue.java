package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00013B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010!\u001a\u00020\"J\r\u0010#\u001a\u00020\u000eH\u0000¢\u0006\u0002\b$J8\u0010%\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u000e2\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0*H\u0086\bø\u0001\u0000J\u0006\u0010+\u001a\u00020,J.\u0010-\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020'2\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00020'0*H\u0086\bø\u0001\u0000J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020'J%\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\b2\u0006\u0010&\u001a\u00020'2\u0006\u00100\u001a\u00020\u000eH\u0000¢\u0006\u0002\b1J\u0006\u0010\u001c\u001a\u00020\"J\b\u00102\u001a\u00020\u0005H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, m115d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "name", "", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/String;)V", "activeTask", "Lokhttp3/internal/concurrent/Task;", "getActiveTask$okhttp", "()Lokhttp3/internal/concurrent/Task;", "setActiveTask$okhttp", "(Lokhttp3/internal/concurrent/Task;)V", "cancelActiveTask", "", "getCancelActiveTask$okhttp", "()Z", "setCancelActiveTask$okhttp", "(Z)V", "futureTasks", "", "getFutureTasks$okhttp", "()Ljava/util/List;", "getName$okhttp", "()Ljava/lang/String;", "scheduledTasks", "", "getScheduledTasks", "shutdown", "getShutdown$okhttp", "setShutdown$okhttp", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "cancelAll", "", "cancelAllAndDecide", "cancelAllAndDecide$okhttp", "execute", "delayNanos", "", "cancelable", "block", "Lkotlin/Function0;", "idleLatch", "Ljava/util/concurrent/CountDownLatch;", "schedule", "task", "scheduleAndDecide", "recurrence", "scheduleAndDecide$okhttp", "toString", "AwaitIdleTask", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class TaskQueue {
    private okhttp3.internal.concurrent.Task activeTask;
    private boolean cancelActiveTask;
    private final java.util.List<okhttp3.internal.concurrent.Task> futureTasks;
    private final java.lang.String name;
    private boolean shutdown;
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;

    /* JADX INFO: compiled from: TaskQueue.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m115d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "()V", "latch", "Ljava/util/concurrent/CountDownLatch;", "getLatch", "()Ljava/util/concurrent/CountDownLatch;", "runOnce", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    private static final class AwaitIdleTask extends okhttp3.internal.concurrent.Task {
        private final java.util.concurrent.CountDownLatch latch;

        public AwaitIdleTask() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = okhttp3.internal.Util.okHttpName
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " awaitIdle"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r2.latch = r0
                return
        }

        public final java.util.concurrent.CountDownLatch getLatch() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.latch
                return r0
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r2 = this;
                java.util.concurrent.CountDownLatch r0 = r2.latch
                r0.countDown()
                r0 = -1
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$execute$1 */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m115d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 176)
    public static final class C10321 extends okhttp3.internal.concurrent.Task {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $block;

        public C10321(java.lang.String r1, boolean r2, kotlin.jvm.functions.Function0<kotlin.Unit> r3) {
                r0 = this;
                r0.$block = r3
                r0.<init>(r1, r2)
                return
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r2 = this;
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r2.$block
                r0.invoke()
                r0 = -1
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$schedule$2 */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m115d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 176)
    public static final class C10332 extends okhttp3.internal.concurrent.Task {
        final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Long> $block;

        public C10332(java.lang.String r4, kotlin.jvm.functions.Function0<java.lang.Long> r5) {
                r3 = this;
                r3.$block = r5
                r0 = 2
                r1 = 0
                r2 = 0
                r3.<init>(r4, r2, r0, r1)
                return
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r2 = this;
                kotlin.jvm.functions.Function0<java.lang.Long> r0 = r2.$block
                java.lang.Object r0 = r0.invoke()
                java.lang.Number r0 = (java.lang.Number) r0
                long r0 = r0.longValue()
                return r0
        }
    }

    public TaskQueue(okhttp3.internal.concurrent.TaskRunner r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.taskRunner = r2
            r1.name = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.futureTasks = r0
            return
    }

    public static /* synthetic */ void execute$default(okhttp3.internal.concurrent.TaskQueue r0, java.lang.String r1, long r2, boolean r4, kotlin.jvm.functions.Function0 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            if (r7 == 0) goto L6
            r2 = 0
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r4 = 1
        Lb:
            java.lang.String r6 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            java.lang.String r6 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue$execute$1 r7 = new okhttp3.internal.concurrent.TaskQueue$execute$1
            r7.<init>(r1, r4, r5)
            okhttp3.internal.concurrent.Task r7 = (okhttp3.internal.concurrent.Task) r7
            r0.schedule(r7, r2)
            return
    }

    public static /* synthetic */ void schedule$default(okhttp3.internal.concurrent.TaskQueue r0, java.lang.String r1, long r2, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L6
            r2 = 0
        L6:
            java.lang.String r5 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue$schedule$2 r6 = new okhttp3.internal.concurrent.TaskQueue$schedule$2
            r6.<init>(r1, r4)
            okhttp3.internal.concurrent.Task r6 = (okhttp3.internal.concurrent.Task) r6
            r0.schedule(r6, r2)
            return
    }

    public static /* synthetic */ void schedule$default(okhttp3.internal.concurrent.TaskQueue r0, okhttp3.internal.concurrent.Task r1, long r2, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            r2 = 0
        L6:
            r0.schedule(r1, r2)
            return
    }

    public final void cancelAll() {
            r5 = this;
            r0 = r5
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
            okhttp3.internal.concurrent.TaskRunner r0 = r5.taskRunner
            monitor-enter(r0)
            r1 = 0
            boolean r2 = r5.cancelAllAndDecide$okhttp()     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L48
            okhttp3.internal.concurrent.TaskRunner r2 = r5.taskRunner     // Catch: java.lang.Throwable -> L4d
            r2.kickCoordinator$okhttp(r5)     // Catch: java.lang.Throwable -> L4d
        L48:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            return
        L4d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean cancelAllAndDecide$okhttp() {
            r6 = this;
            okhttp3.internal.concurrent.Task r0 = r6.activeTask
            r1 = 1
            if (r0 == 0) goto L12
            okhttp3.internal.concurrent.Task r0 = r6.activeTask
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r0 = r0.getCancelable()
            if (r0 == 0) goto L12
            r6.cancelActiveTask = r1
        L12:
            r0 = 0
            java.util.List<okhttp3.internal.concurrent.Task> r2 = r6.futureTasks
            int r2 = r2.size()
            int r2 = r2 - r1
        L1a:
            r1 = -1
            if (r1 >= r2) goto L53
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r6.futureTasks
            java.lang.Object r1 = r1.get(r2)
            okhttp3.internal.concurrent.Task r1 = (okhttp3.internal.concurrent.Task) r1
            boolean r1 = r1.getCancelable()
            if (r1 == 0) goto L50
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r6.futureTasks
            java.lang.Object r1 = r1.get(r2)
            okhttp3.internal.concurrent.Task r1 = (okhttp3.internal.concurrent.Task) r1
            r3 = 0
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r4 = r4.getLogger()
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            boolean r4 = r4.isLoggable(r5)
            if (r4 == 0) goto L49
            r4 = 0
            java.lang.String r4 = "canceled"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r1, r6, r4)
        L49:
            r0 = 1
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r6.futureTasks
            r1.remove(r2)
        L50:
            int r2 = r2 + (-1)
            goto L1a
        L53:
            return r0
    }

    public final void execute(java.lang.String r3, long r4, boolean r6, kotlin.jvm.functions.Function0<kotlin.Unit> r7) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            okhttp3.internal.concurrent.TaskQueue$execute$1 r1 = new okhttp3.internal.concurrent.TaskQueue$execute$1
            r1.<init>(r3, r6, r7)
            okhttp3.internal.concurrent.Task r1 = (okhttp3.internal.concurrent.Task) r1
            r2.schedule(r1, r4)
            return
    }

    public final okhttp3.internal.concurrent.Task getActiveTask$okhttp() {
            r1 = this;
            okhttp3.internal.concurrent.Task r0 = r1.activeTask
            return r0
    }

    public final boolean getCancelActiveTask$okhttp() {
            r1 = this;
            boolean r0 = r1.cancelActiveTask
            return r0
    }

    public final java.util.List<okhttp3.internal.concurrent.Task> getFutureTasks$okhttp() {
            r1 = this;
            java.util.List<okhttp3.internal.concurrent.Task> r0 = r1.futureTasks
            return r0
    }

    public final java.lang.String getName$okhttp() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.util.List<okhttp3.internal.concurrent.Task> getScheduledTasks() {
            r3 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r3.taskRunner
            monitor-enter(r0)
            r1 = 0
            java.util.List<okhttp3.internal.concurrent.Task> r2 = r3.futureTasks     // Catch: java.lang.Throwable -> Le
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> Le
            java.util.List r2 = kotlin.collections.CollectionsKt.toList(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return r2
        Le:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean getShutdown$okhttp() {
            r1 = this;
            boolean r0 = r1.shutdown
            return r0
    }

    public final okhttp3.internal.concurrent.TaskRunner getTaskRunner$okhttp() {
            r1 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r1.taskRunner
            return r0
    }

    public final java.util.concurrent.CountDownLatch idleLatch() {
            r8 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r8.taskRunner
            monitor-enter(r0)
            r1 = 0
            okhttp3.internal.concurrent.Task r2 = r8.activeTask     // Catch: java.lang.Throwable -> L61
            r3 = 0
            if (r2 != 0) goto L18
            java.util.List<okhttp3.internal.concurrent.Task> r2 = r8.futureTasks     // Catch: java.lang.Throwable -> L61
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L18
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L61
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r0)
            return r2
        L18:
            okhttp3.internal.concurrent.Task r2 = r8.activeTask     // Catch: java.lang.Throwable -> L61
            boolean r4 = r2 instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L27
            r3 = r2
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r3 = (okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) r3     // Catch: java.lang.Throwable -> L61
            java.util.concurrent.CountDownLatch r3 = r3.getLatch()     // Catch: java.lang.Throwable -> L61
            monitor-exit(r0)
            return r3
        L27:
            java.util.List<okhttp3.internal.concurrent.Task> r4 = r8.futureTasks     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L61
        L2d:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L46
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L61
            okhttp3.internal.concurrent.Task r5 = (okhttp3.internal.concurrent.Task) r5     // Catch: java.lang.Throwable -> L61
            boolean r6 = r5 instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L2d
            r3 = r5
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r3 = (okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) r3     // Catch: java.lang.Throwable -> L61
            java.util.concurrent.CountDownLatch r3 = r3.getLatch()     // Catch: java.lang.Throwable -> L61
            monitor-exit(r0)
            return r3
        L46:
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r4 = new okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask     // Catch: java.lang.Throwable -> L61
            r4.<init>()     // Catch: java.lang.Throwable -> L61
            r5 = r4
            okhttp3.internal.concurrent.Task r5 = (okhttp3.internal.concurrent.Task) r5     // Catch: java.lang.Throwable -> L61
            r6 = 0
            boolean r3 = r8.scheduleAndDecide$okhttp(r5, r6, r3)     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L5b
            okhttp3.internal.concurrent.TaskRunner r3 = r8.taskRunner     // Catch: java.lang.Throwable -> L61
            r3.kickCoordinator$okhttp(r8)     // Catch: java.lang.Throwable -> L61
        L5b:
            java.util.concurrent.CountDownLatch r3 = r4.getLatch()     // Catch: java.lang.Throwable -> L61
            monitor-exit(r0)
            return r3
        L61:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void schedule(java.lang.String r3, long r4, kotlin.jvm.functions.Function0<java.lang.Long> r6) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            okhttp3.internal.concurrent.TaskQueue$schedule$2 r1 = new okhttp3.internal.concurrent.TaskQueue$schedule$2
            r1.<init>(r3, r6)
            okhttp3.internal.concurrent.Task r1 = (okhttp3.internal.concurrent.Task) r1
            r2.schedule(r1, r4)
            return
    }

    public final void schedule(okhttp3.internal.concurrent.Task r6, long r7) {
            r5 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okhttp3.internal.concurrent.TaskRunner r0 = r5.taskRunner
            monitor-enter(r0)
            r1 = 0
            boolean r2 = r5.shutdown     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L48
            boolean r2 = r6.getCancelable()     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L2c
            r2 = 0
            okhttp3.internal.concurrent.TaskRunner$Companion r3 = okhttp3.internal.concurrent.TaskRunner.Companion     // Catch: java.lang.Throwable -> L59
            java.util.logging.Logger r3 = r3.getLogger()     // Catch: java.lang.Throwable -> L59
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L59
            boolean r3 = r3.isLoggable(r4)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L28
            r3 = 0
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r6, r5, r4)     // Catch: java.lang.Throwable -> L59
        L28:
            monitor-exit(r0)
            return
        L2c:
            r2 = 0
            okhttp3.internal.concurrent.TaskRunner$Companion r3 = okhttp3.internal.concurrent.TaskRunner.Companion     // Catch: java.lang.Throwable -> L59
            java.util.logging.Logger r3 = r3.getLogger()     // Catch: java.lang.Throwable -> L59
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L59
            boolean r3 = r3.isLoggable(r4)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L41
            r3 = 0
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r6, r5, r4)     // Catch: java.lang.Throwable -> L59
        L41:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L59
            r2.<init>()     // Catch: java.lang.Throwable -> L59
            throw r2     // Catch: java.lang.Throwable -> L59
        L48:
            r2 = 0
            boolean r2 = r5.scheduleAndDecide$okhttp(r6, r7, r2)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L54
            okhttp3.internal.concurrent.TaskRunner r2 = r5.taskRunner     // Catch: java.lang.Throwable -> L59
            r2.kickCoordinator$okhttp(r5)     // Catch: java.lang.Throwable -> L59
        L54:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L59
            monitor-exit(r0)
            return
        L59:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean scheduleAndDecide$okhttp(okhttp3.internal.concurrent.Task r20, long r21, boolean r23) {
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r1.initQueue$okhttp(r0)
            okhttp3.internal.concurrent.TaskRunner r2 = r0.taskRunner
            okhttp3.internal.concurrent.TaskRunner$Backend r2 = r2.getBackend()
            long r2 = r2.nanoTime()
            long r4 = r2 + r21
            java.util.List<okhttp3.internal.concurrent.Task> r6 = r0.futureTasks
            int r6 = r6.indexOf(r1)
            r7 = 0
            r8 = -1
            if (r6 == r8) goto L47
            long r9 = r20.getNextExecuteNanoTime$okhttp()
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 > 0) goto L42
            r8 = 0
            okhttp3.internal.concurrent.TaskRunner$Companion r9 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r9 = r9.getLogger()
            java.util.logging.Level r10 = java.util.logging.Level.FINE
            boolean r9 = r9.isLoggable(r10)
            if (r9 == 0) goto L40
            r9 = 0
            java.lang.String r9 = "already scheduled"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r1, r0, r9)
        L40:
            return r7
        L42:
            java.util.List<okhttp3.internal.concurrent.Task> r9 = r0.futureTasks
            r9.remove(r6)
        L47:
            r1.setNextExecuteNanoTime$okhttp(r4)
            r9 = 0
            okhttp3.internal.concurrent.TaskRunner$Companion r10 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r10 = r10.getLogger()
            java.util.logging.Level r11 = java.util.logging.Level.FINE
            boolean r10 = r10.isLoggable(r11)
            if (r10 == 0) goto L93
            r10 = 0
            if (r23 == 0) goto L76
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "run again after "
            java.lang.StringBuilder r11 = r11.append(r12)
            long r12 = r4 - r2
            java.lang.String r12 = okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(r12)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            goto L8f
        L76:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "scheduled after "
            java.lang.StringBuilder r11 = r11.append(r12)
            long r12 = r4 - r2
            java.lang.String r12 = okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(r12)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
        L8f:
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r1, r0, r11)
        L93:
            java.util.List<okhttp3.internal.concurrent.Task> r9 = r0.futureTasks
            r10 = 0
            r11 = 0
            java.util.Iterator r12 = r9.iterator()
        L9c:
            boolean r13 = r12.hasNext()
            r14 = 1
            if (r13 == 0) goto Lc0
            java.lang.Object r13 = r12.next()
            r15 = r13
            okhttp3.internal.concurrent.Task r15 = (okhttp3.internal.concurrent.Task) r15
            r16 = 0
            long r17 = r15.getNextExecuteNanoTime$okhttp()
            long r17 = r17 - r2
            int r17 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r17 <= 0) goto Lb8
            r15 = r14
            goto Lb9
        Lb8:
            r15 = r7
        Lb9:
            if (r15 == 0) goto Lbc
            goto Lc1
        Lbc:
            int r11 = r11 + 1
            goto L9c
        Lc0:
            r11 = r8
        Lc1:
            r9 = r11
            if (r9 != r8) goto Lca
            java.util.List<okhttp3.internal.concurrent.Task> r8 = r0.futureTasks
            int r9 = r8.size()
        Lca:
            java.util.List<okhttp3.internal.concurrent.Task> r8 = r0.futureTasks
            r8.add(r9, r1)
            if (r9 != 0) goto Ld2
            r7 = r14
        Ld2:
            return r7
    }

    public final void setActiveTask$okhttp(okhttp3.internal.concurrent.Task r1) {
            r0 = this;
            r0.activeTask = r1
            return
    }

    public final void setCancelActiveTask$okhttp(boolean r1) {
            r0 = this;
            r0.cancelActiveTask = r1
            return
    }

    public final void setShutdown$okhttp(boolean r1) {
            r0 = this;
            r0.shutdown = r1
            return
    }

    public final void shutdown() {
            r5 = this;
            r0 = r5
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
            okhttp3.internal.concurrent.TaskRunner r0 = r5.taskRunner
            monitor-enter(r0)
            r1 = 0
            r2 = 1
            r5.shutdown = r2     // Catch: java.lang.Throwable -> L50
            boolean r2 = r5.cancelAllAndDecide$okhttp()     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L4b
            okhttp3.internal.concurrent.TaskRunner r2 = r5.taskRunner     // Catch: java.lang.Throwable -> L50
            r2.kickCoordinator$okhttp(r5)     // Catch: java.lang.Throwable -> L50
        L4b:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)
            return
        L50:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
