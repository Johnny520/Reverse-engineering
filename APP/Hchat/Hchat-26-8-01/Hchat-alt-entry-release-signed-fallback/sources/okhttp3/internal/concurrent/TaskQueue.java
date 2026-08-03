package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class TaskQueue {
    private okhttp3.internal.concurrent.Task activeTask;
    private boolean cancelActiveTask;
    private final java.util.List<okhttp3.internal.concurrent.Task> futureTasks;
    private final java.lang.String name;
    private boolean shutdown;
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AwaitIdleTask extends okhttp3.internal.concurrent.Task {
        private final java.util.concurrent.CountDownLatch latch;

        public AwaitIdleTask() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = okhttp3.internal.Util.okHttpName
                java.lang.String r2 = " awaitIdle"
                java.lang.String r0 = eh.a.r(r0, r1, r2)
                r1 = 0
                r3.<init>(r0, r1)
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r3.latch = r0
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

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AnonymousClass1 extends okhttp3.internal.concurrent.Task {
        final /* synthetic */ fg.a $block;

        public AnonymousClass1(java.lang.String r1, boolean r2, fg.a r3) {
                r0 = this;
                r0.$block = r3
                r0.<init>(r1, r2)
                return
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r2 = this;
                fg.a r0 = r2.$block
                r0.invoke()
                r0 = -1
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$schedule$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AnonymousClass2 extends okhttp3.internal.concurrent.Task {
        final /* synthetic */ fg.a $block;

        public AnonymousClass2(java.lang.String r3, fg.a r4) {
                r2 = this;
                r2.$block = r4
                r4 = 2
                r0 = 0
                r1 = 0
                r2.<init>(r3, r1, r4, r0)
                return
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r2 = this;
                fg.a r0 = r2.$block
                java.lang.Object r0 = r0.invoke()
                java.lang.Number r0 = (java.lang.Number) r0
                long r0 = r0.longValue()
                return r0
        }
    }

    public TaskQueue(okhttp3.internal.concurrent.TaskRunner r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.taskRunner = r1
            r0.name = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.futureTasks = r1
            return
    }

    public static /* synthetic */ void execute$default(okhttp3.internal.concurrent.TaskQueue r0, java.lang.String r1, long r2, boolean r4, fg.a r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            if (r7 == 0) goto L6
            r2 = 0
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r4 = 1
        Lb:
            r1.getClass()
            r5.getClass()
            okhttp3.internal.concurrent.TaskQueue$execute$1 r6 = new okhttp3.internal.concurrent.TaskQueue$execute$1
            r6.<init>(r1, r4, r5)
            r0.schedule(r6, r2)
            return
    }

    public static /* synthetic */ void schedule$default(okhttp3.internal.concurrent.TaskQueue r0, java.lang.String r1, long r2, fg.a r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L6
            r2 = 0
        L6:
            r1.getClass()
            r4.getClass()
            okhttp3.internal.concurrent.TaskQueue$schedule$2 r5 = new okhttp3.internal.concurrent.TaskQueue$schedule$2
            r5.<init>(r1, r4)
            r0.schedule(r5, r2)
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
            r2 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L19
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L19
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " MUST NOT hold lock on "
            j8.o.i(r0, r1, r2)
            return
        L19:
            okhttp3.internal.concurrent.TaskRunner r0 = r2.taskRunner
            monitor-enter(r0)
            boolean r1 = r2.cancelAllAndDecide$okhttp()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2a
            okhttp3.internal.concurrent.TaskRunner r1 = r2.taskRunner     // Catch: java.lang.Throwable -> L28
            r1.kickCoordinator$okhttp(r2)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r1 = move-exception
            goto L2c
        L2a:
            monitor-exit(r0)
            return
        L2c:
            monitor-exit(r0)
            throw r1
    }

    public final boolean cancelAllAndDecide$okhttp() {
            r5 = this;
            okhttp3.internal.concurrent.Task r0 = r5.activeTask
            r1 = 1
            if (r0 == 0) goto L10
            r0.getClass()
            boolean r0 = r0.getCancelable()
            if (r0 == 0) goto L10
            r5.cancelActiveTask = r1
        L10:
            java.util.List<okhttp3.internal.concurrent.Task> r0 = r5.futureTasks
            int r0 = r0.size()
            int r0 = r0 - r1
            r2 = 0
        L18:
            r3 = -1
            if (r3 >= r0) goto L4d
            java.util.List<okhttp3.internal.concurrent.Task> r3 = r5.futureTasks
            java.lang.Object r3 = r3.get(r0)
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3
            boolean r3 = r3.getCancelable()
            if (r3 == 0) goto L4a
            java.util.List<okhttp3.internal.concurrent.Task> r2 = r5.futureTasks
            java.lang.Object r2 = r2.get(r0)
            okhttp3.internal.concurrent.Task r2 = (okhttp3.internal.concurrent.Task) r2
            okhttp3.internal.concurrent.TaskRunner$Companion r3 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r3 = r3.getLogger()
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            boolean r3 = r3.isLoggable(r4)
            if (r3 == 0) goto L44
            java.lang.String r3 = "canceled"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r2, r5, r3)
        L44:
            java.util.List<okhttp3.internal.concurrent.Task> r2 = r5.futureTasks
            r2.remove(r0)
            r2 = r1
        L4a:
            int r0 = r0 + (-1)
            goto L18
        L4d:
            return r2
    }

    public final void execute(java.lang.String r2, long r3, boolean r5, fg.a r6) {
            r1 = this;
            r2.getClass()
            r6.getClass()
            okhttp3.internal.concurrent.TaskQueue$execute$1 r0 = new okhttp3.internal.concurrent.TaskQueue$execute$1
            r0.<init>(r2, r5, r6)
            r1.schedule(r0, r3)
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
            r2 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r2.taskRunner
            monitor-enter(r0)
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r2.futureTasks     // Catch: java.lang.Throwable -> Lb
            java.util.List r1 = tf.m.P1(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        Lb:
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
            r5 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r5.taskRunner
            monitor-enter(r0)
            okhttp3.internal.concurrent.Task r1 = r5.activeTask     // Catch: java.lang.Throwable -> L17
            r2 = 0
            if (r1 != 0) goto L19
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r5.futureTasks     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L17:
            r1 = move-exception
            goto L5d
        L19:
            okhttp3.internal.concurrent.Task r1 = r5.activeTask     // Catch: java.lang.Throwable -> L17
            boolean r3 = r1 instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L27
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r1 = (okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) r1     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.CountDownLatch r1 = r1.getLatch()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L27:
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r5.futureTasks     // Catch: java.lang.Throwable -> L17
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L17
        L2d:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L17
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3     // Catch: java.lang.Throwable -> L17
            boolean r4 = r3 instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L2d
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r3 = (okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) r3     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.CountDownLatch r1 = r3.getLatch()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L45:
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r1 = new okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            r3 = 0
            boolean r2 = r5.scheduleAndDecide$okhttp(r1, r3, r2)     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L57
            okhttp3.internal.concurrent.TaskRunner r2 = r5.taskRunner     // Catch: java.lang.Throwable -> L17
            r2.kickCoordinator$okhttp(r5)     // Catch: java.lang.Throwable -> L17
        L57:
            java.util.concurrent.CountDownLatch r1 = r1.getLatch()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L5d:
            monitor-exit(r0)
            throw r1
    }

    public final void schedule(java.lang.String r2, long r3, fg.a r5) {
            r1 = this;
            r2.getClass()
            r5.getClass()
            okhttp3.internal.concurrent.TaskQueue$schedule$2 r0 = new okhttp3.internal.concurrent.TaskQueue$schedule$2
            r0.<init>(r2, r5)
            r1.schedule(r0, r3)
            return
    }

    public final void schedule(okhttp3.internal.concurrent.Task r3, long r4) {
            r2 = this;
            r3.getClass()
            okhttp3.internal.concurrent.TaskRunner r0 = r2.taskRunner
            monitor-enter(r0)
            boolean r1 = r2.shutdown     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L41
            boolean r4 = r3.getCancelable()     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L28
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion     // Catch: java.lang.Throwable -> L24
            java.util.logging.Logger r4 = r4.getLogger()     // Catch: java.lang.Throwable -> L24
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L24
            boolean r4 = r4.isLoggable(r5)     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L26
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r3, r2, r4)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r3 = move-exception
            goto L4f
        L26:
            monitor-exit(r0)
            return
        L28:
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion     // Catch: java.lang.Throwable -> L24
            java.util.logging.Logger r4 = r4.getLogger()     // Catch: java.lang.Throwable -> L24
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L24
            boolean r4 = r4.isLoggable(r5)     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L3b
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r3, r2, r4)     // Catch: java.lang.Throwable -> L24
        L3b:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L24
            r3.<init>()     // Catch: java.lang.Throwable -> L24
            throw r3     // Catch: java.lang.Throwable -> L24
        L41:
            r1 = 0
            boolean r3 = r2.scheduleAndDecide$okhttp(r3, r4, r1)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L4d
            okhttp3.internal.concurrent.TaskRunner r3 = r2.taskRunner     // Catch: java.lang.Throwable -> L24
            r3.kickCoordinator$okhttp(r2)     // Catch: java.lang.Throwable -> L24
        L4d:
            monitor-exit(r0)
            return
        L4f:
            monitor-exit(r0)
            throw r3
    }

    public final boolean scheduleAndDecide$okhttp(okhttp3.internal.concurrent.Task r10, long r11, boolean r13) {
            r9 = this;
            r10.getClass()
            r10.initQueue$okhttp(r9)
            okhttp3.internal.concurrent.TaskRunner r0 = r9.taskRunner
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r0.getBackend()
            long r0 = r0.nanoTime()
            long r2 = r0 + r11
            java.util.List<okhttp3.internal.concurrent.Task> r4 = r9.futureTasks
            int r4 = r4.indexOf(r10)
            r5 = 0
            r6 = -1
            if (r4 == r6) goto L3d
            long r7 = r10.getNextExecuteNanoTime$okhttp()
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto L38
            okhttp3.internal.concurrent.TaskRunner$Companion r11 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r11 = r11.getLogger()
            java.util.logging.Level r12 = java.util.logging.Level.FINE
            boolean r11 = r11.isLoggable(r12)
            if (r11 == 0) goto L37
            java.lang.String r11 = "already scheduled"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r10, r9, r11)
        L37:
            return r5
        L38:
            java.util.List<okhttp3.internal.concurrent.Task> r7 = r9.futureTasks
            r7.remove(r4)
        L3d:
            r10.setNextExecuteNanoTime$okhttp(r2)
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r4 = r4.getLogger()
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r4 = r4.isLoggable(r7)
            if (r4 == 0) goto L7a
            if (r13 == 0) goto L64
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r4 = "run again after "
            r13.<init>(r4)
            long r2 = r2 - r0
            java.lang.String r2 = okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(r2)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            goto L77
        L64:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r4 = "scheduled after "
            r13.<init>(r4)
            long r2 = r2 - r0
            java.lang.String r2 = okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(r2)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
        L77:
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r10, r9, r13)
        L7a:
            java.util.List<okhttp3.internal.concurrent.Task> r13 = r9.futureTasks
            java.util.Iterator r13 = r13.iterator()
            r2 = r5
        L81:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L9a
            java.lang.Object r3 = r13.next()
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3
            long r3 = r3.getNextExecuteNanoTime$okhttp()
            long r3 = r3 - r0
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 <= 0) goto L97
            goto L9b
        L97:
            int r2 = r2 + 1
            goto L81
        L9a:
            r2 = r6
        L9b:
            if (r2 != r6) goto La3
            java.util.List<okhttp3.internal.concurrent.Task> r11 = r9.futureTasks
            int r2 = r11.size()
        La3:
            java.util.List<okhttp3.internal.concurrent.Task> r11 = r9.futureTasks
            r11.add(r2, r10)
            if (r2 != 0) goto Lac
            r10 = 1
            return r10
        Lac:
            return r5
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
            r2 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L19
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L19
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " MUST NOT hold lock on "
            j8.o.i(r0, r1, r2)
            return
        L19:
            okhttp3.internal.concurrent.TaskRunner r0 = r2.taskRunner
            monitor-enter(r0)
            r1 = 1
            r2.shutdown = r1     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.cancelAllAndDecide$okhttp()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2d
            okhttp3.internal.concurrent.TaskRunner r1 = r2.taskRunner     // Catch: java.lang.Throwable -> L2b
            r1.kickCoordinator$okhttp(r2)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r1 = move-exception
            goto L2f
        L2d:
            monitor-exit(r0)
            return
        L2f:
            monitor-exit(r0)
            throw r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
