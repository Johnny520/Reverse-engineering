package okhttp3.internal.concurrent;

import gg.AbstractC1411g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import tf.AbstractC4166m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class TaskRunner {
    public static final Companion Companion = new Companion(null);
    public static final TaskRunner INSTANCE = new TaskRunner(new RealBackend(Util.threadFactory(Util.okHttpName + " TaskRunner", true)));
    private static final Logger logger;
    private final Backend backend;
    private final List<TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName;
    private final List<TaskQueue> readyQueues;
    private final Runnable runnable;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Backend {
        void beforeTask(TaskRunner taskRunner);

        void coordinatorNotify(TaskRunner taskRunner);

        void coordinatorWait(TaskRunner taskRunner, long j3);

        void execute(Runnable runnable);

        long nanoTime();
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class RealBackend implements Backend {
        private final ThreadPoolExecutor executor;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public RealBackend(ThreadFactory threadFactory) {
            threadFactory.getClass();
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void beforeTask(TaskRunner taskRunner) {
            taskRunner.getClass();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(TaskRunner taskRunner) {
            taskRunner.getClass();
            taskRunner.notify();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(TaskRunner taskRunner, long j3) throws InterruptedException {
            taskRunner.getClass();
            long j4 = j3 / 1000000;
            long j5 = j3 - (1000000 * j4);
            if (j4 > 0 || j3 > 0) {
                taskRunner.wait(j4, (int) j5);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(Runnable runnable) {
            runnable.getClass();
            this.executor.execute(runnable);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
            return System.nanoTime();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void shutdown() {
            this.executor.shutdown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Logger logger2 = Logger.getLogger(TaskRunner.class.getName());
        logger2.getClass();
        logger = logger2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TaskRunner(Backend backend) {
        backend.getClass();
        this.backend = backend;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, INVOKE, INVOKE, ARITH, CONST_STR, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, INVOKE, THROW, IF, MOVE_EXCEPTION, THROW, INVOKE, INVOKE, MOVE_EXCEPTION] complete} */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            @Override // java.lang.Runnable
            public void run() {
                Task taskAwaitTaskToRun;
                long jNanoTime;
                while (true) {
                    TaskRunner taskRunner = this.this$0;
                    synchronized (taskRunner) {
                        taskAwaitTaskToRun = taskRunner.awaitTaskToRun();
                    }
                    if (taskAwaitTaskToRun == null) {
                        return;
                    }
                    TaskQueue queue$okhttp = taskAwaitTaskToRun.getQueue$okhttp();
                    queue$okhttp.getClass();
                    TaskRunner taskRunner2 = this.this$0;
                    boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jNanoTime = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                        TaskLoggerKt.log(taskAwaitTaskToRun, queue$okhttp, "starting");
                    } else {
                        jNanoTime = -1;
                    }
                    try {
                        taskRunner2.runTask(taskAwaitTaskToRun);
                        if (zIsLoggable) {
                            TaskLoggerKt.log(taskAwaitTaskToRun, queue$okhttp, "finished run in " + TaskLoggerKt.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
                        }
                    } finally {
                    }
                }
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void afterRun(Task task, long j3) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        TaskQueue queue$okhttp = task.getQueue$okhttp();
        queue$okhttp.getClass();
        if (queue$okhttp.getActiveTask$okhttp() != task) {
            C2104o.m5276A("Check failed.");
            return;
        }
        boolean cancelActiveTask$okhttp = queue$okhttp.getCancelActiveTask$okhttp();
        queue$okhttp.setCancelActiveTask$okhttp(false);
        queue$okhttp.setActiveTask$okhttp(null);
        this.busyQueues.remove(queue$okhttp);
        if (j3 != -1 && !cancelActiveTask$okhttp && !queue$okhttp.getShutdown$okhttp()) {
            queue$okhttp.scheduleAndDecide$okhttp(task, j3, true);
        }
        if (queue$okhttp.getFutureTasks$okhttp().isEmpty()) {
            return;
        }
        this.readyQueues.add(queue$okhttp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void beforeRun(Task task) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        task.setNextExecuteNanoTime$okhttp(-1L);
        TaskQueue queue$okhttp = task.getQueue$okhttp();
        queue$okhttp.getClass();
        queue$okhttp.getFutureTasks$okhttp().remove(task);
        this.readyQueues.remove(queue$okhttp);
        queue$okhttp.setActiveTask$okhttp(task);
        this.busyQueues.add(queue$okhttp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final void runTask(Task task) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.getName());
        try {
            long jRunOnce = task.runOnce();
            synchronized (this) {
                afterRun(task, jRunOnce);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (this) {
                afterRun(task, -1L);
                threadCurrentThread.setName(name);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<TaskQueue> activeQueues() {
        ArrayList arrayListM8397F1;
        synchronized (this) {
            arrayListM8397F1 = AbstractC4166m.m8397F1(this.busyQueues, this.readyQueues);
        }
        return arrayListM8397F1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Task awaitTaskToRun() {
        boolean z9;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return null;
        }
        while (!this.readyQueues.isEmpty()) {
            long jNanoTime = this.backend.nanoTime();
            Iterator<TaskQueue> it = this.readyQueues.iterator();
            long jMin = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z9 = false;
                    break;
                }
                Task task2 = it.next().getFutureTasks$okhttp().get(0);
                long jMax = Math.max(0L, task2.getNextExecuteNanoTime$okhttp() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task != null) {
                        z9 = true;
                        break;
                    }
                    task = task2;
                }
            }
            if (task != null) {
                beforeRun(task);
                if (z9 || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                    this.backend.execute(this.runnable);
                }
                return task;
            }
            if (this.coordinatorWaiting) {
                if (jMin < this.coordinatorWakeUpAt - jNanoTime) {
                    this.backend.coordinatorNotify(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = jNanoTime + jMin;
            try {
                try {
                    this.backend.coordinatorWait(this, jMin);
                } catch (InterruptedException unused) {
                    cancelAll();
                }
            } finally {
                this.coordinatorWaiting = false;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0008 */
    public final void cancelAll() {
        int size = this.busyQueues.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.busyQueues.get(size).cancelAllAndDecide$okhttp();
            }
        }
        for (int size2 = this.readyQueues.size() - 1; -1 < size2; size2--) {
            TaskQueue taskQueue = this.readyQueues.get(size2);
            taskQueue.cancelAllAndDecide$okhttp();
            if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Backend getBackend() {
        return this.backend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void kickCoordinator$okhttp(TaskQueue taskQueue) {
        taskQueue.getClass();
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        if (taskQueue.getActiveTask$okhttp() == null) {
            boolean zIsEmpty = taskQueue.getFutureTasks$okhttp().isEmpty();
            List<TaskQueue> list = this.readyQueues;
            if (zIsEmpty) {
                list.remove(taskQueue);
            } else {
                Util.addIfAbsent(list, taskQueue);
            }
        }
        boolean z9 = this.coordinatorWaiting;
        Backend backend = this.backend;
        if (z9) {
            backend.coordinatorNotify(this);
        } else {
            backend.execute(this.runnable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TaskQueue newQueue() {
        int i9;
        synchronized (this) {
            i9 = this.nextQueueName;
            this.nextQueueName = i9 + 1;
        }
        return new TaskQueue(this, AbstractC0921a.m2249l(i9, "Q"));
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.concurrent.TaskRunner.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Logger getLogger() {
            return TaskRunner.logger;
        }

        private Companion() {
        }
    }
}
