package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import okhttp3.internal.Util;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p136j8.C2104o;
import tf.AbstractC4166m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class TaskQueue {
    private Task activeTask;
    private boolean cancelActiveTask;
    private final List<Task> futureTasks;
    private final String name;
    private boolean shutdown;
    private final TaskRunner taskRunner;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AwaitIdleTask extends Task {
        private final CountDownLatch latch;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AwaitIdleTask() {
            super(AbstractC0921a.m2255r(new StringBuilder(), Util.okHttpName, " awaitIdle"), false);
            this.latch = new CountDownLatch(1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final CountDownLatch getLatch() {
            return this.latch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.latch.countDown();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$execute$1 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C31721 extends Task {
        final /* synthetic */ InterfaceC1220a $block;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31721(String str, boolean z9, InterfaceC1220a interfaceC1220a) {
            super(str, z9);
            this.$block = interfaceC1220a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.$block.invoke();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$schedule$2 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C31732 extends Task {
        final /* synthetic */ InterfaceC1220a $block;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31732(String str, InterfaceC1220a interfaceC1220a) {
            super(str, false, 2, null);
            this.$block = interfaceC1220a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            return ((Number) this.$block.invoke()).longValue();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TaskQueue(TaskRunner taskRunner, String str) {
        taskRunner.getClass();
        str.getClass();
        this.taskRunner = taskRunner;
        this.name = str;
        this.futureTasks = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void execute$default(TaskQueue taskQueue, String str, long j3, boolean z9, InterfaceC1220a interfaceC1220a, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j3 = 0;
        }
        if ((i9 & 4) != 0) {
            z9 = true;
        }
        str.getClass();
        interfaceC1220a.getClass();
        taskQueue.schedule(new C31721(str, z9, interfaceC1220a), j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String str, long j3, InterfaceC1220a interfaceC1220a, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j3 = 0;
        }
        str.getClass();
        interfaceC1220a.getClass();
        taskQueue.schedule(new C31732(str, interfaceC1220a), j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void cancelAll() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        synchronized (this.taskRunner) {
            if (cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: okhttp3.internal.concurrent.TaskLoggerKt.access$log(okhttp3.internal.concurrent.Task, okhttp3.internal.concurrent.TaskQueue, java.lang.String):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean cancelAllAndDecide$okhttp() {
        Task task = this.activeTask;
        if (task != null) {
            task.getClass();
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z9 = false;
        for (int size = this.futureTasks.size() - 1; -1 < size; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                Task task2 = this.futureTasks.get(size);
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task2, this, "canceled");
                }
                this.futureTasks.remove(size);
                z9 = true;
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void execute(String str, long j3, boolean z9, InterfaceC1220a interfaceC1220a) {
        str.getClass();
        interfaceC1220a.getClass();
        schedule(new C31721(str, z9, interfaceC1220a), j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Task getActiveTask$okhttp() {
        return this.activeTask;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName$okhttp() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Task> getScheduledTasks() {
        List<Task> listM8407P1;
        synchronized (this.taskRunner) {
            listM8407P1 = AbstractC4166m.m8407P1(this.futureTasks);
        }
        return listM8407P1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (this.activeTask == null && this.futureTasks.isEmpty()) {
                return new CountDownLatch(0);
            }
            Task task = this.activeTask;
            if (task instanceof AwaitIdleTask) {
                return ((AwaitIdleTask) task).getLatch();
            }
            for (Task task2 : this.futureTasks) {
                if (task2 instanceof AwaitIdleTask) {
                    return ((AwaitIdleTask) task2).getLatch();
                }
            }
            AwaitIdleTask awaitIdleTask = new AwaitIdleTask();
            if (scheduleAndDecide$okhttp(awaitIdleTask, 0L, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            return awaitIdleTask.getLatch();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void schedule(Task task, long j3) {
        task.getClass();
        synchronized (this.taskRunner) {
            if (!this.shutdown) {
                if (scheduleAndDecide$okhttp(task, j3, false)) {
                    this.taskRunner.kickCoordinator$okhttp(this);
                }
            } else if (task.getCancelable()) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean scheduleAndDecide$okhttp(Task task, long j3, boolean z9) {
        String str;
        task.getClass();
        task.initQueue$okhttp(this);
        long jNanoTime = this.taskRunner.getBackend().nanoTime();
        long j4 = jNanoTime + j3;
        int iIndexOf = this.futureTasks.indexOf(task);
        if (iIndexOf != -1) {
            if (task.getNextExecuteNanoTime$okhttp() <= j4) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(iIndexOf);
        }
        task.setNextExecuteNanoTime$okhttp(j4);
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            if (z9) {
                str = "run again after " + TaskLoggerKt.formatDuration(j4 - jNanoTime);
            } else {
                str = "scheduled after " + TaskLoggerKt.formatDuration(j4 - jNanoTime);
            }
            TaskLoggerKt.log(task, this, str);
        }
        Iterator<Task> it = this.futureTasks.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime$okhttp() - jNanoTime > j3) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.futureTasks.size();
        }
        this.futureTasks.add(size, task);
        return size == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setActiveTask$okhttp(Task task) {
        this.activeTask = task;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setCancelActiveTask$okhttp(boolean z9) {
        this.cancelActiveTask = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setShutdown$okhttp(boolean z9) {
        this.shutdown = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void shutdown() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        synchronized (this.taskRunner) {
            this.shutdown = true;
            if (cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.name;
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long j3, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j3 = 0;
        }
        taskQueue.schedule(task, j3);
    }

    public final void schedule(String str, long j3, InterfaceC1220a interfaceC1220a) {
        str.getClass();
        interfaceC1220a.getClass();
        schedule(new C31732(str, interfaceC1220a), j3);
    }
}
