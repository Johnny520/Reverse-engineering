package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000 X2\u00020\\2\u00020]:\u0003XYZB+\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001d\u001a\u00020\n2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010!\u001a\b\u0018\u00010 R\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013H\u0082\b¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010$\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\b$\u0010\u0017J-\u0010&\u001a\u00020\u00132\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\f¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\u00132\n\u0010(\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\b-\u0010\u0017J\u001b\u0010/\u001a\u00020\u00012\n\u0010.\u001a\u00060 R\u00020\u0000H\u0002¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\b\u0018\u00010 R\u00020\u0000H\u0002¢\u0006\u0004\b1\u0010\"J\u0019\u00102\u001a\u00020\f2\n\u0010.\u001a\u00060 R\u00020\u0000¢\u0006\u0004\b2\u00103J)\u00106\u001a\u00020\u00132\n\u0010.\u001a\u00060 R\u00020\u00002\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b8\u0010,J\u0015\u00109\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0013¢\u0006\u0004\bA\u0010\u0015J\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\fH\u0082\b¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\fH\u0002¢\u0006\u0004\bH\u0010EJ+\u0010I\u001a\u0004\u0018\u00010\n*\b\u0018\u00010 R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\bI\u0010JR\u0015\u0010\u0010\u001a\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010LR\u0015\u0010\u001f\u001a\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0017R\u0014\u0010O\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0011\u0010S\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bS\u0010ER\u0014\u0010\u0003\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010TR\u001e\u0010V\u001a\f\u0012\b\u0012\u00060 R\u00020\u00000U8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006["}, m115d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlinx/coroutines/scheduling/Task;", "task", "", "addToGlobalQueue", "(Lkotlinx/coroutines/scheduling/Task;)Z", "state", "availableCpuPermits", "(J)I", "blockingTasks", "", "close", "()V", "createNewWorker", "()I", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "createTask", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;)Lkotlinx/coroutines/scheduling/Task;", "createdWorkers", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "currentWorker", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "decrementBlockingTasks", "decrementCreatedWorkers", "tailDispatch", "dispatch", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "incrementBlockingTasks", "()J", "incrementCreatedWorkers", "worker", "parkedWorkersStackNextIndex", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)I", "parkedWorkersStackPop", "parkedWorkersStackPush", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)Z", "oldIndex", "newIndex", "parkedWorkersStackTopUpdate", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V", "releaseCpuPermit", "runSafely", "(Lkotlinx/coroutines/scheduling/Task;)V", "timeout", "shutdown", "(J)V", "skipUnpark", "signalBlockingWork", "(Z)V", "signalCpuWork", "toString", "()Ljava/lang/String;", "tryAcquireCpuPermit", "()Z", "tryCreateWorker", "(J)Z", "tryUnpark", "submitToLocalQueue", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "getAvailableCpuPermits", "I", "getCreatedWorkers", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "J", "isTerminated", "Ljava/lang/String;", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class CoroutineScheduler implements java.util.concurrent.Executor, java.io.Closeable {
    private static final long BLOCKING_MASK = 4398044413952L;
    private static final int BLOCKING_SHIFT = 21;
    private static final int CLAIMED = 0;
    private static final long CPU_PERMITS_MASK = 9223367638808264704L;
    private static final int CPU_PERMITS_SHIFT = 42;
    private static final long CREATED_MASK = 2097151;
    public static final kotlinx.coroutines.scheduling.CoroutineScheduler.Companion Companion = null;
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;
    public static final kotlinx.coroutines.internal.Symbol NOT_IN_STACK = null;
    private static final int PARKED = -1;
    private static final long PARKED_INDEX_MASK = 2097151;
    private static final long PARKED_VERSION_INC = 2097152;
    private static final long PARKED_VERSION_MASK = -2097152;
    private static final int TERMINATED = 1;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isTerminated$FU = null;
    static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater controlState$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater parkedWorkersStack$FU = null;
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;
    public final int corePoolSize;
    public final kotlinx.coroutines.scheduling.GlobalQueue globalBlockingQueue;
    public final kotlinx.coroutines.scheduling.GlobalQueue globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile /* synthetic */ long parkedWorkersStack;
    public final java.lang.String schedulerName;
    public final kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler.Worker> workers;

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m115d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "()V", "BLOCKING_MASK", "", "BLOCKING_SHIFT", "", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
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
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                int r1 = r1.ordinal()
                r2 = 4
                r0[r1] = r2
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                int r1 = r1.ordinal()
                r2 = 5
                r0[r1] = r2
                kotlinx.coroutines.scheduling.CoroutineScheduler.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(m114d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0080\u0004\u0018\u00002\u00020GB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\u001cR*\u0010*\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\tR\u0014\u00100\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010+R\u0012\u0010B\u001a\u00020?8Æ\u0002¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00106¨\u0006F"}, m115d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "", "index", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "taskMode", "", "afterTask", "(I)V", "beforeTask", "Lkotlinx/coroutines/scheduling/Task;", "task", "executeTask", "(Lkotlinx/coroutines/scheduling/Task;)V", "", "scanLocalQueue", "findAnyTask", "(Z)Lkotlinx/coroutines/scheduling/Task;", "findTask", "mode", "idleReset", "inStack", "()Z", "upperBound", "nextInt", "(I)I", "park", "()V", "pollGlobalQueues", "()Lkotlinx/coroutines/scheduling/Task;", "run", "runWorker", "tryAcquireCpuPermit", "tryPark", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "tryReleaseCpu", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "blockingOnly", "trySteal", "tryTerminateWorker", "indexInArray", "I", "getIndexInArray", "()I", "setIndexInArray", "Lkotlinx/coroutines/scheduling/WorkQueue;", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "mayHaveLocalTasks", "Z", "", "minDelayUntilStealableTaskNs", "J", "", "nextParkedWorker", "Ljava/lang/Object;", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "rngState", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "scheduler", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "terminationDeadline", "kotlinx-coroutines-core", "Ljava/lang/Thread;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    public final class Worker extends java.lang.Thread {
        static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater workerCtl$FU = null;
        private volatile int indexInArray;
        public final kotlinx.coroutines.scheduling.WorkQueue localQueue;
        public boolean mayHaveLocalTasks;
        private long minDelayUntilStealableTaskNs;
        private volatile java.lang.Object nextParkedWorker;
        private int rngState;
        public kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState state;
        private long terminationDeadline;
        final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler this$0;
        volatile /* synthetic */ int workerCtl;

        static {
                java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.class
                java.lang.String r1 = "workerCtl"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$FU = r0
                return
        }

        private Worker(kotlinx.coroutines.scheduling.CoroutineScheduler r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = 1
                r1.setDaemon(r0)
                kotlinx.coroutines.scheduling.WorkQueue r0 = new kotlinx.coroutines.scheduling.WorkQueue
                r0.<init>()
                r1.localQueue = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                r1.state = r0
                r0 = 0
                r1.workerCtl = r0
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
                r1.nextParkedWorker = r0
                kotlin.random.Random$Default r0 = kotlin.random.Random.Default
                int r0 = r0.nextInt()
                r1.rngState = r0
                return
        }

        public Worker(kotlinx.coroutines.scheduling.CoroutineScheduler r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                r0.setIndexInArray(r2)
                return
        }

        public static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler access$getThis$0$p(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r1) {
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                return r0
        }

        private final void afterTask(int r6) {
                r5 = this;
                if (r6 != 0) goto L3
                return
            L3:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r5.this$0
                r1 = 0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
                r3 = -2097152(0xffffffffffe00000, double:NaN)
                r2.addAndGet(r0, r3)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r5.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r0 == r1) goto L30
                boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r1 == 0) goto L2c
                r1 = 0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                if (r0 != r2) goto L22
                r2 = 1
                goto L23
            L22:
                r2 = 0
            L23:
                if (r2 == 0) goto L26
                goto L2c
            L26:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            L2c:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                r5.state = r1
            L30:
                return
        }

        private final void beforeTask(int r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                boolean r0 = r1.tryReleaseCpu(r0)
                if (r0 == 0) goto L10
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                r0.signalCpuWork()
            L10:
                return
        }

        private final void executeTask(kotlinx.coroutines.scheduling.Task r4) {
                r3 = this;
                r0 = r4
                r1 = 0
                kotlinx.coroutines.scheduling.TaskContext r2 = r0.taskContext
                int r0 = r2.getTaskMode()
                r3.idleReset(r0)
                r3.beforeTask(r0)
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r3.this$0
                r1.runSafely(r4)
                r3.afterTask(r0)
                return
        }

        private final kotlinx.coroutines.scheduling.Task findAnyTask(boolean r4) {
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L35
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r3.this$0
                int r1 = r1.corePoolSize
                int r1 = r1 * 2
                int r1 = r3.nextInt(r1)
                if (r1 != 0) goto L11
                r1 = 1
                goto L12
            L11:
                r1 = r0
            L12:
                if (r1 == 0) goto L1e
                kotlinx.coroutines.scheduling.Task r2 = r3.pollGlobalQueues()
                if (r2 != 0) goto L1b
                goto L1e
            L1b:
                r0 = r2
                r2 = 0
                return r0
            L1e:
                kotlinx.coroutines.scheduling.WorkQueue r2 = r3.localQueue
                kotlinx.coroutines.scheduling.Task r2 = r2.poll()
                if (r2 != 0) goto L32
                if (r1 != 0) goto L3b
                kotlinx.coroutines.scheduling.Task r2 = r3.pollGlobalQueues()
                if (r2 != 0) goto L2f
                goto L3b
            L2f:
                r0 = r2
                r2 = 0
                return r0
            L32:
                r0 = r2
                r2 = 0
                return r0
            L35:
                kotlinx.coroutines.scheduling.Task r1 = r3.pollGlobalQueues()
                if (r1 != 0) goto L40
            L3b:
                kotlinx.coroutines.scheduling.Task r0 = r3.trySteal(r0)
                return r0
            L40:
                r0 = r1
                r1 = 0
                return r0
        }

        private final void idleReset(int r3) {
                r2 = this;
                r0 = 0
                r2.terminationDeadline = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r2.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                if (r0 != r1) goto L23
                boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r0 == 0) goto L1f
                r0 = 0
                r1 = 1
                if (r3 != r1) goto L15
                goto L16
            L15:
                r1 = 0
            L16:
                if (r1 == 0) goto L19
                goto L1f
            L19:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L1f:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                r2.state = r0
            L23:
                return
        }

        private final boolean inStack() {
                r2 = this;
                java.lang.Object r0 = r2.nextParkedWorker
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
                if (r0 == r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        private final void park() {
                r6 = this;
                long r0 = r6.terminationDeadline
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L13
                long r0 = java.lang.System.nanoTime()
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r6.this$0
                long r4 = r4.idleWorkerKeepAliveNs
                long r0 = r0 + r4
                r6.terminationDeadline = r0
            L13:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.this$0
                long r0 = r0.idleWorkerKeepAliveNs
                java.util.concurrent.locks.LockSupport.parkNanos(r0)
                long r0 = java.lang.System.nanoTime()
                long r4 = r6.terminationDeadline
                long r0 = r0 - r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L2a
                r6.terminationDeadline = r2
                r6.tryTerminateWorker()
            L2a:
                return
        }

        private final kotlinx.coroutines.scheduling.Task pollGlobalQueues() {
                r2 = this;
                r0 = 2
                int r0 = r2.nextInt(r0)
                if (r0 != 0) goto L20
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r2.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalCpuQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                if (r0 != 0) goto L1e
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r2.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalBlockingQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                return r0
            L1e:
                r1 = 0
                return r0
            L20:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r2.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalBlockingQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                if (r0 != 0) goto L37
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r2.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalCpuQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                return r0
            L37:
                r1 = 0
                return r0
        }

        private final void runWorker() {
                r6 = this;
                r0 = 0
            L1:
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r6.this$0
                boolean r1 = r1.isTerminated()
                if (r1 != 0) goto L42
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = r6.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r1 == r2) goto L42
                boolean r1 = r6.mayHaveLocalTasks
                kotlinx.coroutines.scheduling.Task r1 = r6.findTask(r1)
                r2 = 0
                if (r1 == 0) goto L20
                r0 = 0
                r6.minDelayUntilStealableTaskNs = r2
                r6.executeTask(r1)
                goto L1
            L20:
                r4 = 0
                r6.mayHaveLocalTasks = r4
                long r4 = r6.minDelayUntilStealableTaskNs
                int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r4 == 0) goto L3e
                if (r0 != 0) goto L2d
                r0 = 1
                goto L3d
            L2d:
                r0 = 0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                r6.tryReleaseCpu(r4)
                java.lang.Thread.interrupted()
                long r4 = r6.minDelayUntilStealableTaskNs
                java.util.concurrent.locks.LockSupport.parkNanos(r4)
                r6.minDelayUntilStealableTaskNs = r2
            L3d:
                goto L1
            L3e:
                r6.tryPark()
                goto L1
            L42:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                r6.tryReleaseCpu(r1)
                return
        }

        private final boolean tryAcquireCpuPermit() {
                r19 = this;
                r0 = r19
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = r0.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r3 = 1
                if (r1 != r2) goto La
                goto L44
            La:
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.this$0
                r2 = 0
                r10 = r1
                r11 = 0
            Lf:
                long r12 = r10.controlState
                r14 = 0
                r4 = r1
                r5 = 0
                r6 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r6 = r6 & r12
                r8 = 42
                long r6 = r6 >> r8
                int r4 = (int) r6
                r15 = r4
                r16 = 0
                if (r15 != 0) goto L27
                r1 = r16
                goto L3b
            L27:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r17 = r12 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
                r5 = r1
                r6 = r12
                r8 = r17
                boolean r4 = r4.compareAndSet(r5, r6, r8)
                if (r4 == 0) goto L45
                r1 = r3
            L3b:
                if (r1 == 0) goto L42
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r0.state = r1
                goto L44
            L42:
                r3 = r16
            L44:
                return r3
            L45:
                goto Lf
        }

        private final void tryPark() {
                r3 = this;
                boolean r0 = r3.inStack()
                if (r0 != 0) goto Lc
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r3.this$0
                r0.parkedWorkersStackPush(r3)
                return
            Lc:
                boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r0 == 0) goto L27
                r0 = 0
                kotlinx.coroutines.scheduling.WorkQueue r1 = r3.localQueue
                int r1 = r1.getSize$kotlinx_coroutines_core()
                if (r1 != 0) goto L1d
                r1 = 1
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 == 0) goto L21
                goto L27
            L21:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L27:
                r0 = -1
                r3.workerCtl = r0
            L2a:
                boolean r1 = r3.inStack()
                if (r1 == 0) goto L4f
                int r1 = r3.workerCtl
                if (r1 != r0) goto L4f
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r3.this$0
                boolean r1 = r1.isTerminated()
                if (r1 != 0) goto L4f
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = r3.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r1 != r2) goto L43
                goto L4f
            L43:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                r3.tryReleaseCpu(r1)
                java.lang.Thread.interrupted()
                r3.park()
                goto L2a
            L4f:
                return
        }

        private final kotlinx.coroutines.scheduling.Task trySteal(boolean r21) {
                r20 = this;
                r0 = r20
                boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r1 == 0) goto L1d
                r1 = 0
                kotlinx.coroutines.scheduling.WorkQueue r4 = r0.localQueue
                int r4 = r4.getSize$kotlinx_coroutines_core()
                if (r4 != 0) goto L13
                r1 = 1
                goto L14
            L13:
                r1 = 0
            L14:
                if (r1 == 0) goto L17
                goto L1d
            L17:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            L1d:
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.this$0
                r4 = 0
                long r5 = r1.controlState
                r7 = 2097151(0x1fffff, double:1.0361303E-317)
                long r5 = r5 & r7
                int r1 = (int) r5
                r4 = 2
                r5 = 0
                if (r1 >= r4) goto L2d
                return r5
            L2d:
                r4 = 0
                int r4 = r0.nextInt(r1)
                r6 = 0
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                kotlinx.coroutines.scheduling.CoroutineScheduler r8 = r0.this$0
                r9 = 0
            L3c:
                r10 = 0
                if (r9 >= r1) goto La2
                int r12 = r9 + 1
                r13 = 0
                int r4 = r4 + 1
                if (r4 <= r1) goto L48
                r4 = 1
            L48:
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r14 = r8.workers
                java.lang.Object r14 = r14.get(r4)
                kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r14 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r14
                if (r14 == 0) goto L9d
                if (r14 == r0) goto L9d
                boolean r15 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r15 == 0) goto L6f
                r15 = 0
                kotlinx.coroutines.scheduling.WorkQueue r2 = r0.localQueue
                int r2 = r2.getSize$kotlinx_coroutines_core()
                if (r2 != 0) goto L65
                r2 = 1
                goto L66
            L65:
                r2 = 0
            L66:
                if (r2 == 0) goto L69
                goto L6f
            L69:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L6f:
                if (r21 == 0) goto L7a
                kotlinx.coroutines.scheduling.WorkQueue r2 = r0.localQueue
                kotlinx.coroutines.scheduling.WorkQueue r15 = r14.localQueue
                long r16 = r2.tryStealBlockingFrom(r15)
                goto L82
            L7a:
                kotlinx.coroutines.scheduling.WorkQueue r2 = r0.localQueue
                kotlinx.coroutines.scheduling.WorkQueue r15 = r14.localQueue
                long r16 = r2.tryStealFrom(r15)
            L82:
                r18 = r16
                r16 = -1
                r2 = r4
                r3 = r18
                int r16 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
                if (r16 != 0) goto L94
                kotlinx.coroutines.scheduling.WorkQueue r5 = r0.localQueue
                kotlinx.coroutines.scheduling.Task r5 = r5.poll()
                return r5
            L94:
                int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r10 <= 0) goto L9e
                long r6 = java.lang.Math.min(r6, r3)
                goto L9e
            L9d:
                r2 = r4
            L9e:
                r4 = r2
                r9 = r12
                goto L3c
            La2:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r2 == 0) goto Lac
                r10 = r6
            Lac:
                r0.minDelayUntilStealableTaskNs = r10
                return r5
        }

        private final void tryTerminateWorker() {
                r13 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r13.this$0
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r0 = r0.workers
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r13.this$0
                r2 = 0
                monitor-enter(r0)
                r3 = 0
                boolean r4 = r1.isTerminated()     // Catch: java.lang.Throwable -> L6d
                if (r4 == 0) goto L11
                monitor-exit(r0)
                return
            L11:
                r4 = r1
                r5 = 0
                long r6 = r4.controlState     // Catch: java.lang.Throwable -> L6d
                r8 = 2097151(0x1fffff, double:1.0361303E-317)
                long r6 = r6 & r8
                int r4 = (int) r6     // Catch: java.lang.Throwable -> L6d
                int r5 = r1.corePoolSize     // Catch: java.lang.Throwable -> L6d
                if (r4 > r5) goto L20
                monitor-exit(r0)
                return
            L20:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$FU     // Catch: java.lang.Throwable -> L6d
                r5 = -1
                r6 = 1
                boolean r4 = r4.compareAndSet(r13, r5, r6)     // Catch: java.lang.Throwable -> L6d
                if (r4 != 0) goto L2c
                monitor-exit(r0)
                return
            L2c:
                int r4 = r13.getIndexInArray()     // Catch: java.lang.Throwable -> L6d
                r5 = 0
                r13.setIndexInArray(r5)     // Catch: java.lang.Throwable -> L6d
                r1.parkedWorkersStackTopUpdate(r13, r4, r5)     // Catch: java.lang.Throwable -> L6d
                r5 = r1
                r6 = 0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU     // Catch: java.lang.Throwable -> L6d
                long r10 = r7.getAndDecrement(r5)     // Catch: java.lang.Throwable -> L6d
                r7 = r5
                r12 = 0
                long r8 = r8 & r10
                int r7 = (int) r8     // Catch: java.lang.Throwable -> L6d
                r5 = r7
                if (r5 == r4) goto L5d
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r6 = r1.workers     // Catch: java.lang.Throwable -> L6d
                java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L6d
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L6d
                kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r6 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r6     // Catch: java.lang.Throwable -> L6d
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r7 = r1.workers     // Catch: java.lang.Throwable -> L6d
                r7.setSynchronized(r4, r6)     // Catch: java.lang.Throwable -> L6d
                r6.setIndexInArray(r4)     // Catch: java.lang.Throwable -> L6d
                r1.parkedWorkersStackTopUpdate(r6, r5, r4)     // Catch: java.lang.Throwable -> L6d
            L5d:
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r1 = r1.workers     // Catch: java.lang.Throwable -> L6d
                r6 = 0
                r1.setSynchronized(r5, r6)     // Catch: java.lang.Throwable -> L6d
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6d
                monitor-exit(r0)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                r13.state = r0
                return
            L6d:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final kotlinx.coroutines.scheduling.Task findTask(boolean r3) {
                r2 = this;
                boolean r0 = r2.tryAcquireCpuPermit()
                if (r0 == 0) goto Lb
                kotlinx.coroutines.scheduling.Task r0 = r2.findAnyTask(r3)
                return r0
            Lb:
                if (r3 == 0) goto L20
                kotlinx.coroutines.scheduling.WorkQueue r0 = r2.localQueue
                kotlinx.coroutines.scheduling.Task r0 = r0.poll()
                if (r0 != 0) goto L2a
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r2.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalBlockingQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                goto L2a
            L20:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r2.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalBlockingQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            L2a:
                if (r0 != 0) goto L33
                r1 = 1
                kotlinx.coroutines.scheduling.Task r1 = r2.trySteal(r1)
                goto L34
            L33:
                r1 = r0
            L34:
                return r1
        }

        public final int getIndexInArray() {
                r1 = this;
                int r0 = r1.indexInArray
                return r0
        }

        public final java.lang.Object getNextParkedWorker() {
                r1 = this;
                java.lang.Object r0 = r1.nextParkedWorker
                return r0
        }

        public final kotlinx.coroutines.scheduling.CoroutineScheduler getScheduler() {
                r2 = this;
                r0 = 0
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = access$getThis$0$p(r2)
                return r1
        }

        public final int nextInt(int r4) {
                r3 = this;
                int r0 = r3.rngState
                int r1 = r0 << 13
                r0 = r0 ^ r1
                int r1 = r0 >> 17
                r0 = r0 ^ r1
                int r1 = r0 << 5
                r0 = r0 ^ r1
                r3.rngState = r0
                int r1 = r4 + (-1)
                r2 = r1 & r4
                if (r2 != 0) goto L16
                r2 = r0 & r1
                return r2
            L16:
                r2 = 2147483647(0x7fffffff, float:NaN)
                r2 = r2 & r0
                int r2 = r2 % r4
                return r2
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r0 = this;
                r0.runWorker()
                return
        }

        public final void setIndexInArray(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r2.this$0
                java.lang.String r1 = r1.schedulerName
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "-worker-"
                java.lang.StringBuilder r0 = r0.append(r1)
                if (r3 != 0) goto L18
                java.lang.String r1 = "TERMINATED"
                goto L1c
            L18:
                java.lang.String r1 = java.lang.String.valueOf(r3)
            L1c:
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.setName(r0)
                r2.indexInArray = r3
                return
        }

        public final void setNextParkedWorker(java.lang.Object r1) {
                r0 = this;
                r0.nextParkedWorker = r1
                return
        }

        public final boolean tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState r8) {
                r7 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r7.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                if (r0 != r1) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                if (r1 == 0) goto L18
                kotlinx.coroutines.scheduling.CoroutineScheduler r2 = r7.this$0
                r3 = 0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
                r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                r4.addAndGet(r2, r5)
            L18:
                if (r0 == r8) goto L1c
                r7.state = r8
            L1c:
                return r1
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m115d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    public enum WorkerState extends java.lang.Enum<kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState> {
        private static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] $VALUES = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState BLOCKING = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState CPU_ACQUIRED = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState DORMANT = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState PARKING = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState TERMINATED = null;

        private static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] $values() {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[]{r0, r1, r2, r3, r4}
                return r0
        }

        static {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "CPU_ACQUIRED"
                r2 = 0
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "BLOCKING"
                r2 = 1
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "PARKING"
                r2 = 2
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "DORMANT"
                r2 = 3
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "TERMINATED"
                r2 = 4
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = $values()
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.$VALUES = r0
                return
        }

        WorkerState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState valueOf(java.lang.String r1) {
                java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState) r0
                return r0
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] values() {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[]) r0
                return r0
        }
    }

    static {
            kotlinx.coroutines.scheduling.CoroutineScheduler$Companion r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$Companion
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.Companion = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NOT_IN_STACK"
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK = r0
            java.lang.String r0 = "parkedWorkersStack"
            java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler> r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.class
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU = r0
            java.lang.String r0 = "controlState"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU = r0
            java.lang.String r0 = "_isTerminated"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.scheduling.CoroutineScheduler._isTerminated$FU = r0
            return
    }

    public CoroutineScheduler(int r8, int r9, long r10, java.lang.String r12) {
            r7 = this;
            r7.<init>()
            r7.corePoolSize = r8
            r7.maxPoolSize = r9
            r7.idleWorkerKeepAliveNs = r10
            r7.schedulerName = r12
            int r0 = r7.corePoolSize
            r1 = 0
            r2 = 1
            if (r0 < r2) goto L14
            r0 = r2
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto Ld7
            int r0 = r7.maxPoolSize
            int r3 = r7.corePoolSize
            if (r0 < r3) goto L1f
            r0 = r2
            goto L20
        L1f:
            r0 = r1
        L20:
            java.lang.String r3 = "Max pool size "
            if (r0 == 0) goto Lad
            int r0 = r7.maxPoolSize
            r4 = 2097150(0x1ffffe, float:2.938733E-39)
            if (r0 > r4) goto L2d
            r0 = r2
            goto L2e
        L2d:
            r0 = r1
        L2e:
            if (r0 == 0) goto L89
            long r3 = r7.idleWorkerKeepAliveNs
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L3a
            r0 = r2
            goto L3b
        L3a:
            r0 = r1
        L3b:
            if (r0 == 0) goto L63
        L3e:
            kotlinx.coroutines.scheduling.GlobalQueue r0 = new kotlinx.coroutines.scheduling.GlobalQueue
            r0.<init>()
            r7.globalCpuQueue = r0
            kotlinx.coroutines.scheduling.GlobalQueue r0 = new kotlinx.coroutines.scheduling.GlobalQueue
            r0.<init>()
            r7.globalBlockingQueue = r0
            r7.parkedWorkersStack = r5
            kotlinx.coroutines.internal.ResizableAtomicArray r0 = new kotlinx.coroutines.internal.ResizableAtomicArray
            int r3 = r7.corePoolSize
            int r3 = r3 + r2
            r0.<init>(r3)
            r7.workers = r0
            int r0 = r7.corePoolSize
            long r2 = (long) r0
            r0 = 42
            long r2 = r2 << r0
            r7.controlState = r2
            r7._isTerminated = r1
            return
        L63:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Idle worker keep alive time "
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r7.idleWorkerKeepAliveNs
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " must be positive"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L89:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            int r2 = r7.maxPoolSize
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " should not exceed maximal supported number of threads 2097150"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lad:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            int r2 = r7.maxPoolSize
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " should be greater than or equals to core pool size "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r7.corePoolSize
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Ld7:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Core pool size "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r7.corePoolSize
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " should be at least 1"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public /* synthetic */ CoroutineScheduler(int r7, int r8, long r9, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L8
            long r9 = kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS
            r3 = r9
            goto L9
        L8:
            r3 = r9
        L9:
            r9 = r12 & 8
            if (r9 == 0) goto L11
            java.lang.String r11 = "DefaultDispatcher"
            r5 = r11
            goto L12
        L11:
            r5 = r11
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r5)
            return
    }

    private final boolean addToGlobalQueue(kotlinx.coroutines.scheduling.Task r5) {
            r4 = this;
            r0 = r5
            r1 = 0
            kotlinx.coroutines.scheduling.TaskContext r2 = r0.taskContext
            int r2 = r2.getTaskMode()
            r3 = 1
            if (r2 != r3) goto Lc
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r3 == 0) goto L16
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r4.globalBlockingQueue
            boolean r0 = r0.addLast(r5)
            goto L1c
        L16:
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r4.globalCpuQueue
            boolean r0 = r0.addLast(r5)
        L1c:
            return r0
    }

    private final int blockingTasks(long r5) {
            r4 = this;
            r0 = 0
            r1 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r5
            r3 = 21
            long r1 = r1 >> r3
            int r1 = (int) r1
            return r1
    }

    private final int createNewWorker() {
            r20 = this;
            r1 = r20
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r2 = r1.workers
            r3 = 0
            monitor-enter(r2)
            r0 = 0
            boolean r4 = r20.isTerminated()     // Catch: java.lang.Throwable -> L95
            if (r4 == 0) goto L10
            monitor-exit(r2)
            r0 = -1
            return r0
        L10:
            long r4 = r1.controlState     // Catch: java.lang.Throwable -> L95
            r6 = r20
            r7 = 0
            r8 = 2097151(0x1fffff, double:1.0361303E-317)
            long r10 = r4 & r8
            int r6 = (int) r10     // Catch: java.lang.Throwable -> L95
            r7 = r20
            r10 = 0
            r11 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r11 = r11 & r4
            r13 = 21
            long r11 = r11 >> r13
            int r7 = (int) r11     // Catch: java.lang.Throwable -> L95
            int r10 = r6 - r7
            r11 = 0
            int r10 = kotlin.ranges.RangesKt.coerceAtLeast(r10, r11)     // Catch: java.lang.Throwable -> L95
            int r12 = r1.corePoolSize     // Catch: java.lang.Throwable -> L95
            if (r10 < r12) goto L37
            monitor-exit(r2)
            return r11
        L37:
            int r12 = r1.maxPoolSize     // Catch: java.lang.Throwable -> L95
            if (r6 < r12) goto L3d
            monitor-exit(r2)
            return r11
        L3d:
            r12 = r20
            r13 = 0
            long r14 = r12.controlState     // Catch: java.lang.Throwable -> L95
            long r14 = r14 & r8
            int r12 = (int) r14     // Catch: java.lang.Throwable -> L95
            r13 = 1
            int r12 = r12 + r13
            if (r12 <= 0) goto L52
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r14 = r1.workers     // Catch: java.lang.Throwable -> L95
            java.lang.Object r14 = r14.get(r12)     // Catch: java.lang.Throwable -> L95
            if (r14 != 0) goto L52
            r14 = r13
            goto L53
        L52:
            r14 = r11
        L53:
            if (r14 == 0) goto L89
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r14 = new kotlinx.coroutines.scheduling.CoroutineScheduler$Worker     // Catch: java.lang.Throwable -> L95
            r14.<init>(r1, r12)     // Catch: java.lang.Throwable -> L95
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r15 = r1.workers     // Catch: java.lang.Throwable -> L95
            r15.setSynchronized(r12, r14)     // Catch: java.lang.Throwable -> L95
            r15 = r20
            r16 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU     // Catch: java.lang.Throwable -> L95
            long r17 = r11.incrementAndGet(r15)     // Catch: java.lang.Throwable -> L95
            r11 = r15
            r19 = 0
            long r8 = r17 & r8
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L95
            if (r12 != r8) goto L74
            r11 = r13
            goto L75
        L74:
            r11 = 0
        L75:
            if (r11 == 0) goto L7d
            r14.start()     // Catch: java.lang.Throwable -> L95
            int r10 = r10 + r13
            monitor-exit(r2)
            return r10
        L7d:
            java.lang.String r8 = "Failed requirement."
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L95
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L95
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L95
            throw r9     // Catch: java.lang.Throwable -> L95
        L89:
            java.lang.String r8 = "Failed requirement."
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L95
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L95
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L95
            throw r9     // Catch: java.lang.Throwable -> L95
        L95:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    private final int createdWorkers(long r4) {
            r3 = this;
            r0 = 0
            r1 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r4
            int r1 = (int) r1
            return r1
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker currentWorker() {
            r6 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 != 0) goto L10
        Lf:
            goto L1f
        L10:
            r1 = r0
            r3 = 0
            r4 = r1
            r5 = 0
            kotlinx.coroutines.scheduling.CoroutineScheduler r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.access$getThis$0$p(r4)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
            if (r1 == 0) goto Lf
            r2 = r0
        L1f:
            return r2
    }

    private final void decrementBlockingTasks() {
            r4 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            r2 = -2097152(0xffffffffffe00000, double:NaN)
            r1.addAndGet(r4, r2)
            return
    }

    private final int decrementCreatedWorkers() {
            r7 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            long r1 = r1.getAndDecrement(r7)
            r3 = r7
            r4 = 0
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r1
            int r1 = (int) r5
            return r1
    }

    public static /* synthetic */ void dispatch$default(kotlinx.coroutines.scheduling.CoroutineScheduler r0, java.lang.Runnable r1, kotlinx.coroutines.scheduling.TaskContext r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            kotlinx.coroutines.scheduling.TaskContext r2 = kotlinx.coroutines.scheduling.TasksKt.NonBlockingContext
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            r0.dispatch(r1, r2, r3)
            return
    }

    private final int getAvailableCpuPermits() {
            r8 = this;
            r0 = 0
            long r1 = r8.controlState
            r3 = r8
            r4 = 0
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r1
            r7 = 42
            long r5 = r5 >> r7
            int r1 = (int) r5
            return r1
    }

    private final int getCreatedWorkers() {
            r5 = this;
            r0 = 0
            long r1 = r5.controlState
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r3
            int r1 = (int) r1
            return r1
    }

    private final long incrementBlockingTasks() {
            r4 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            r2 = 2097152(0x200000, double:1.036131E-317)
            long r1 = r1.addAndGet(r4, r2)
            return r1
    }

    private final int incrementCreatedWorkers() {
            r7 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            long r1 = r1.incrementAndGet(r7)
            r3 = r7
            r4 = 0
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r1
            int r1 = (int) r5
            return r1
    }

    private final int parkedWorkersStackNextIndex(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r4) {
            r3 = this;
            java.lang.Object r0 = r4.getNextParkedWorker()
        L4:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
            if (r0 != r1) goto Lc
            r1 = -1
            return r1
        Lc:
            if (r0 != 0) goto L10
            r1 = 0
            return r1
        L10:
            r1 = r0
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r1 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r1
            int r2 = r1.getIndexInArray()
            if (r2 == 0) goto L1a
            return r2
        L1a:
            java.lang.Object r0 = r1.getNextParkedWorker()
            goto L4
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker parkedWorkersStackPop() {
            r19 = this;
            r6 = r19
            r7 = r19
            r8 = 0
        L5:
            long r9 = r7.parkedWorkersStack
            r11 = 0
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r9
            int r12 = (int) r0
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r0 = r6.workers
            java.lang.Object r0 = r0.get(r12)
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r0
            if (r0 != 0) goto L1a
            r0 = 0
            return r0
        L1a:
            r13 = r0
            r0 = 2097152(0x200000, double:1.036131E-317)
            long r0 = r0 + r9
            r2 = -2097152(0xffffffffffe00000, double:NaN)
            long r14 = r0 & r2
            int r4 = r6.parkedWorkersStackNextIndex(r13)
            if (r4 >= 0) goto L2b
            goto L44
        L2b:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
            long r1 = (long) r4
            long r16 = r14 | r1
            r1 = r19
            r2 = r9
            r18 = r4
            r4 = r16
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L43
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
            r13.setNextParkedWorker(r0)
            return r13
        L43:
        L44:
            goto L5
    }

    private final long releaseCpuPermit() {
            r4 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            r2 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r1 = r1.addAndGet(r4, r2)
            return r1
    }

    private final void signalBlockingWork(boolean r6) {
            r5 = this;
            r0 = r5
            r1 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            r3 = 2097152(0x200000, double:1.036131E-317)
            long r0 = r2.addAndGet(r0, r3)
            if (r6 == 0) goto Lf
            return
        Lf:
            boolean r2 = r5.tryUnpark()
            if (r2 == 0) goto L16
            return
        L16:
            boolean r2 = r5.tryCreateWorker(r0)
            if (r2 == 0) goto L1d
            return
        L1d:
            r5.tryUnpark()
            return
    }

    private final kotlinx.coroutines.scheduling.Task submitToLocalQueue(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r4, kotlinx.coroutines.scheduling.Task r5, boolean r6) {
            r3 = this;
            if (r4 != 0) goto L3
            return r5
        L3:
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r4.state
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            if (r0 != r1) goto La
            return r5
        La:
            r0 = r5
            r1 = 0
            kotlinx.coroutines.scheduling.TaskContext r2 = r0.taskContext
            int r0 = r2.getTaskMode()
            if (r0 != 0) goto L1b
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r4.state
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
            if (r0 != r1) goto L1b
            return r5
        L1b:
            r0 = 1
            r4.mayHaveLocalTasks = r0
            kotlinx.coroutines.scheduling.WorkQueue r0 = r4.localQueue
            kotlinx.coroutines.scheduling.Task r0 = r0.add(r5, r6)
            return r0
    }

    private final boolean tryAcquireCpuPermit() {
            r15 = this;
            r0 = 0
            r1 = r15
            r2 = 0
        L3:
            long r9 = r1.controlState
            r11 = 0
            r3 = r15
            r4 = 0
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r9
            r7 = 42
            long r5 = r5 >> r7
            int r3 = (int) r5
            r12 = r3
            if (r12 != 0) goto L18
            r3 = 0
            return r3
        L18:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r13 = r9 - r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            r4 = r15
            r5 = r9
            r7 = r13
            boolean r3 = r3.compareAndSet(r4, r5, r7)
            if (r3 == 0) goto L2c
            r3 = 1
            return r3
        L2c:
            goto L3
    }

    private final boolean tryCreateWorker(long r8) {
            r7 = this;
            r0 = r7
            r1 = 0
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r8
            int r0 = (int) r2
            r1 = r7
            r2 = 0
            r3 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r3 = r3 & r8
            r5 = 21
            long r3 = r3 >> r5
            int r1 = (int) r3
            int r2 = r0 - r1
            r3 = 0
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast(r2, r3)
            int r4 = r7.corePoolSize
            if (r2 >= r4) goto L31
            int r4 = r7.createNewWorker()
            r5 = 1
            if (r4 != r5) goto L2e
            int r6 = r7.corePoolSize
            if (r6 <= r5) goto L2e
            r7.createNewWorker()
        L2e:
            if (r4 <= 0) goto L31
            return r5
        L31:
            return r3
    }

    static /* synthetic */ boolean tryCreateWorker$default(kotlinx.coroutines.scheduling.CoroutineScheduler r0, long r1, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            long r1 = r0.controlState
        L6:
            boolean r0 = r0.tryCreateWorker(r1)
            return r0
    }

    private final boolean tryUnpark() {
            r4 = this;
        L1:
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = r4.parkedWorkersStackPop()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$FU
            r3 = -1
            boolean r1 = r2.compareAndSet(r0, r3, r1)
            if (r1 == 0) goto L1
            r1 = r0
            java.lang.Thread r1 = (java.lang.Thread) r1
            java.util.concurrent.locks.LockSupport.unpark(r1)
            r1 = 1
            return r1
    }

    public final int availableCpuPermits(long r5) {
            r4 = this;
            r0 = 0
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r5
            r3 = 42
            long r1 = r1 >> r3
            int r1 = (int) r1
            return r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.shutdown(r0)
            return
    }

    public final kotlinx.coroutines.scheduling.Task createTask(java.lang.Runnable r4, kotlinx.coroutines.scheduling.TaskContext r5) {
            r3 = this;
            kotlinx.coroutines.scheduling.SchedulerTimeSource r0 = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource
            long r0 = r0.nanoTime()
            boolean r2 = r4 instanceof kotlinx.coroutines.scheduling.Task
            if (r2 == 0) goto L18
            r2 = r4
            kotlinx.coroutines.scheduling.Task r2 = (kotlinx.coroutines.scheduling.Task) r2
            r2.submissionTime = r0
            r2 = r4
            kotlinx.coroutines.scheduling.Task r2 = (kotlinx.coroutines.scheduling.Task) r2
            r2.taskContext = r5
            r2 = r4
            kotlinx.coroutines.scheduling.Task r2 = (kotlinx.coroutines.scheduling.Task) r2
            return r2
        L18:
            kotlinx.coroutines.scheduling.TaskImpl r2 = new kotlinx.coroutines.scheduling.TaskImpl
            r2.<init>(r4, r0, r5)
            kotlinx.coroutines.scheduling.Task r2 = (kotlinx.coroutines.scheduling.Task) r2
            return r2
    }

    public final void dispatch(java.lang.Runnable r8, kotlinx.coroutines.scheduling.TaskContext r9, boolean r10) {
            r7 = this;
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L7
            goto La
        L7:
            r0.trackTask()
        La:
            kotlinx.coroutines.scheduling.Task r0 = r7.createTask(r8, r9)
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r1 = r7.currentWorker()
            kotlinx.coroutines.scheduling.Task r2 = r7.submitToLocalQueue(r1, r0, r10)
            if (r2 == 0) goto L2d
            boolean r3 = r7.addToGlobalQueue(r2)
            if (r3 == 0) goto L1f
            goto L2d
        L1f:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r4 = r7.schedulerName
            java.lang.String r5 = " was terminated"
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r4, r5)
            r3.<init>(r4)
            throw r3
        L2d:
            if (r10 == 0) goto L33
            if (r1 == 0) goto L33
            r3 = 1
            goto L34
        L33:
            r3 = 0
        L34:
            r4 = r0
            r5 = 0
            kotlinx.coroutines.scheduling.TaskContext r6 = r4.taskContext
            int r4 = r6.getTaskMode()
            if (r4 != 0) goto L45
            if (r3 == 0) goto L41
            return
        L41:
            r7.signalCpuWork()
            goto L48
        L45:
            r7.signalBlockingWork(r3)
        L48:
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r7) {
            r6 = this;
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            dispatch$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public final boolean isTerminated() {
            r1 = this;
            int r0 = r1._isTerminated
            return r0
    }

    public final boolean parkedWorkersStackPush(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r20) {
            r19 = this;
            java.lang.Object r0 = r20.getNextParkedWorker()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
            r2 = 0
            if (r0 == r1) goto La
            return r2
        La:
            r0 = r19
            r1 = 0
        Ld:
            long r9 = r0.parkedWorkersStack
            r11 = 0
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r9
            int r12 = (int) r3
            r3 = 2097152(0x200000, double:1.036131E-317)
            long r3 = r3 + r9
            r5 = -2097152(0xffffffffffe00000, double:NaN)
            long r13 = r3 & r5
            int r15 = r20.getIndexInArray()
            boolean r3 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r16 = 1
            if (r3 == 0) goto L3b
            r3 = 0
            if (r15 == 0) goto L31
            r3 = r16
            goto L32
        L31:
            r3 = r2
        L32:
            if (r3 == 0) goto L35
            goto L3b
        L35:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L3b:
            r7 = r19
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r3 = r7.workers
            java.lang.Object r3 = r3.get(r12)
            r8 = r20
            r8.setNextParkedWorker(r3)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
            long r4 = (long) r15
            long r17 = r13 | r4
            r4 = r19
            r5 = r9
            r7 = r17
            boolean r3 = r3.compareAndSet(r4, r5, r7)
            if (r3 == 0) goto L59
            return r16
        L59:
            goto Ld
    }

    public final void parkedWorkersStackTopUpdate(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r17, int r18, int r19) {
            r16 = this;
            r0 = r16
            r1 = 0
        L3:
            long r8 = r0.parkedWorkersStack
            r10 = 0
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r8
            int r11 = (int) r2
            r2 = 2097152(0x200000, double:1.036131E-317)
            long r2 = r2 + r8
            r4 = -2097152(0xffffffffffe00000, double:NaN)
            long r12 = r2 & r4
            r14 = r18
            if (r11 != r14) goto L23
            if (r19 != 0) goto L20
            int r2 = r16.parkedWorkersStackNextIndex(r17)
            goto L24
        L20:
            r2 = r19
            goto L24
        L23:
            r2 = r11
        L24:
            r15 = r2
            if (r15 >= 0) goto L28
            goto L38
        L28:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
            long r3 = (long) r15
            long r6 = r12 | r3
            r3 = r16
            r4 = r8
            boolean r2 = r2.compareAndSet(r3, r4, r6)
            if (r2 == 0) goto L37
            return
        L37:
        L38:
            goto L3
    }

    public final void runSafely(kotlinx.coroutines.scheduling.Task r4) {
            r3 = this;
            r4.run()     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto Lb
            goto Le
        Lb:
            r0.unTrackTask()
        Le:
            goto L22
        Lf:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L23
            java.lang.Thread$UncaughtExceptionHandler r2 = r1.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L23
            r2.uncaughtException(r1, r0)     // Catch: java.lang.Throwable -> L23
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto Lb
            goto Le
        L22:
            return
        L23:
            r0 = move-exception
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r1 != 0) goto L2b
            goto L2e
        L2b:
            r1.unTrackTask()
        L2e:
            throw r0
    }

    public final void shutdown(long r18) {
            r17 = this;
            r1 = r17
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler._isTerminated$FU
            r2 = 0
            r3 = 1
            boolean r0 = r0.compareAndSet(r1, r2, r3)
            if (r0 != 0) goto Ld
            return
        Ld:
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r4 = r17.currentWorker()
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r5 = r1.workers
            r6 = 0
            monitor-enter(r5)
            r0 = 0
            r7 = r17
            r8 = 0
            long r9 = r7.controlState     // Catch: java.lang.Throwable -> Ld9
            r11 = 2097151(0x1fffff, double:1.0361303E-317)
            long r9 = r9 & r11
            int r7 = (int) r9
            monitor-exit(r5)
            r0 = r7
            if (r3 > r0) goto L70
            r5 = r3
        L27:
            r6 = r5
            int r5 = r5 + r3
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r7 = r1.workers
            java.lang.Object r7 = r7.get(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r7 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r7
            if (r7 == r4) goto L6b
        L36:
            boolean r8 = r7.isAlive()
            if (r8 == 0) goto L48
            r8 = r7
            java.lang.Thread r8 = (java.lang.Thread) r8
            java.util.concurrent.locks.LockSupport.unpark(r8)
            r8 = r18
            r7.join(r8)
            goto L36
        L48:
            r8 = r18
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r10 = r7.state
            boolean r11 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r11 == 0) goto L63
            r11 = 0
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r12 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            if (r10 != r12) goto L59
            r11 = r3
            goto L5a
        L59:
            r11 = r2
        L5a:
            if (r11 == 0) goto L5d
            goto L63
        L5d:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L63:
            kotlinx.coroutines.scheduling.WorkQueue r11 = r7.localQueue
            kotlinx.coroutines.scheduling.GlobalQueue r12 = r1.globalBlockingQueue
            r11.offloadAllWorkTo(r12)
            goto L6d
        L6b:
            r8 = r18
        L6d:
            if (r6 != r0) goto L27
            goto L72
        L70:
            r8 = r18
        L72:
            kotlinx.coroutines.scheduling.GlobalQueue r5 = r1.globalBlockingQueue
            r5.close()
            kotlinx.coroutines.scheduling.GlobalQueue r5 = r1.globalCpuQueue
            r5.close()
        L7c:
            if (r4 != 0) goto L81
            r5 = 0
            goto L85
        L81:
            kotlinx.coroutines.scheduling.Task r5 = r4.findTask(r3)
        L85:
            if (r5 != 0) goto Ld3
            kotlinx.coroutines.scheduling.GlobalQueue r5 = r1.globalCpuQueue
            java.lang.Object r5 = r5.removeFirstOrNull()
            kotlinx.coroutines.scheduling.Task r5 = (kotlinx.coroutines.scheduling.Task) r5
            if (r5 != 0) goto Ld4
            kotlinx.coroutines.scheduling.GlobalQueue r5 = r1.globalBlockingQueue
            java.lang.Object r5 = r5.removeFirstOrNull()
            kotlinx.coroutines.scheduling.Task r5 = (kotlinx.coroutines.scheduling.Task) r5
            if (r5 != 0) goto Ld3
        L9c:
            if (r4 != 0) goto L9f
            goto La4
        L9f:
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r5 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r4.tryReleaseCpu(r5)
        La4:
            boolean r5 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r5 == 0) goto Lcc
            r5 = 0
            r6 = r17
            r7 = 0
            long r10 = r6.controlState
            r12 = r6
            r13 = 0
            r14 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r14 = r14 & r10
            r16 = 42
            long r14 = r14 >> r16
            int r10 = (int) r14
            int r6 = r1.corePoolSize
            if (r10 != r6) goto Lc3
            r2 = r3
        Lc3:
            if (r2 == 0) goto Lc6
            goto Lcc
        Lc6:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        Lcc:
            r2 = 0
            r1.parkedWorkersStack = r2
            r1.controlState = r2
            return
        Ld3:
        Ld4:
            r1.runSafely(r5)
            goto L7c
        Ld9:
            r0 = move-exception
            r8 = r18
            r2 = r0
            monitor-exit(r5)
            throw r2
    }

    public final void signalCpuWork() {
            r4 = this;
            boolean r0 = r4.tryUnpark()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1
            r1 = 0
            r2 = 0
            boolean r0 = tryCreateWorker$default(r4, r2, r0, r1)
            if (r0 == 0) goto L12
            return
        L12:
            r4.tryUnpark()
            return
    }

    public java.lang.String toString() {
            r17 = this;
            r0 = r17
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r7 = r0.workers
            int r7 = r7.currentLength()
            r8 = 1
        L13:
            if (r8 >= r7) goto L95
            r9 = r8
            int r8 = r8 + 1
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r10 = r0.workers
            java.lang.Object r10 = r10.get(r9)
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r10 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r10
            if (r10 != 0) goto L23
            goto L13
        L23:
            kotlinx.coroutines.scheduling.WorkQueue r11 = r10.localQueue
            int r11 = r11.getSize$kotlinx_coroutines_core()
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r12 = r10.state
            int[] r13 = kotlinx.coroutines.scheduling.CoroutineScheduler.WhenMappings.$EnumSwitchMapping$0
            int r12 = r12.ordinal()
            r12 = r13[r12]
            switch(r12) {
                case 1: goto L90;
                case 2: goto L74;
                case 3: goto L58;
                case 4: goto L3a;
                case 5: goto L37;
                default: goto L36;
            }
        L36:
            goto L93
        L37:
            int r5 = r5 + 1
            goto L93
        L3a:
            int r4 = r4 + 1
            if (r11 <= 0) goto L13
            r12 = r6
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.StringBuilder r13 = r13.append(r11)
            r14 = 100
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.add(r13)
            goto L13
        L58:
            int r3 = r3 + 1
            r12 = r6
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.StringBuilder r13 = r13.append(r11)
            r14 = 99
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.add(r13)
            goto L13
        L74:
            int r2 = r2 + 1
            r12 = r6
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.StringBuilder r13 = r13.append(r11)
            r14 = 98
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.add(r13)
            goto L13
        L90:
            int r1 = r1 + 1
            goto L13
        L93:
            goto L13
        L95:
            long r7 = r0.controlState
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r0.schedulerName
            java.lang.StringBuilder r10 = r9.append(r10)
            r11 = 64
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r17)
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = "[Pool Size {core = "
            java.lang.StringBuilder r10 = r10.append(r11)
            int r11 = r0.corePoolSize
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = ", max = "
            java.lang.StringBuilder r10 = r10.append(r11)
            int r11 = r0.maxPoolSize
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = "}, Worker States {CPU = "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r3)
            java.lang.String r11 = ", blocking = "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.String r11 = ", parked = "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r1)
            java.lang.String r11 = ", dormant = "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r4)
            java.lang.String r11 = ", terminated = "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r5)
            java.lang.String r11 = "}, running workers queues = "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r6)
            java.lang.String r11 = ", global CPU queue size = "
            java.lang.StringBuilder r10 = r10.append(r11)
            kotlinx.coroutines.scheduling.GlobalQueue r11 = r0.globalCpuQueue
            int r11 = r11.getSize()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = ", global blocking queue size = "
            java.lang.StringBuilder r10 = r10.append(r11)
            kotlinx.coroutines.scheduling.GlobalQueue r11 = r0.globalBlockingQueue
            int r11 = r11.getSize()
            r10.append(r11)
            java.lang.String r10 = ", Control State {created workers= "
            java.lang.StringBuilder r10 = r9.append(r10)
            r11 = r17
            r12 = 0
            r13 = 2097151(0x1fffff, double:1.0361303E-317)
            long r13 = r13 & r7
            int r11 = (int) r13
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = ", blocking tasks = "
            java.lang.StringBuilder r10 = r10.append(r11)
            r11 = r17
            r12 = 0
            r13 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r13 = r13 & r7
            r15 = 21
            long r13 = r13 >> r15
            int r11 = (int) r13
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = ", CPUs acquired = "
            java.lang.StringBuilder r10 = r10.append(r11)
            int r11 = r0.corePoolSize
            r12 = r17
            r13 = 0
            r14 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r14 = r14 & r7
            r16 = 42
            long r14 = r14 >> r16
            int r12 = (int) r14
            int r11 = r11 - r12
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = "}]"
            r10.append(r11)
            java.lang.String r9 = r9.toString()
            return r9
    }
}
