package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b \u0018\u00002\u0002092\u00020::\u00044567B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0002J\u0017\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00032\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0002J\u000f\u0010\u0018\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0018\u0010\u0002J\u001d\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00142\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010\u0002R$\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0014\u00103\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0016¨\u00068"}, m115d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "<init>", "()V", "", "closeQueue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dequeue", "()Ljava/lang/Runnable;", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "enqueue", "(Ljava/lang/Runnable;)V", "", "enqueueImpl", "(Ljava/lang/Runnable;)Z", "", "processNextEvent", "()J", "rescheduleAllDelayed", "resetAll", "now", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "delayedTask", "schedule", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)V", "", "scheduleImpl", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)I", "timeMillis", "Lkotlinx/coroutines/DisposableHandle;", "scheduleInvokeOnTimeout", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "shouldUnpark", "(Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;)Z", "shutdown", "value", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "getNextTime", "nextTime", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public abstract class EventLoopImplBase extends kotlinx.coroutines.EventLoopImplPlatform implements kotlinx.coroutines.Delay {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _delayed$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _queue$FU = null;
    private volatile /* synthetic */ java.lang.Object _delayed;
    private volatile /* synthetic */ int _isCompleted;
    private volatile /* synthetic */ java.lang.Object _queue;

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m115d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "toString", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private final class DelayedResumeTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {
        private final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cont;
        final /* synthetic */ kotlinx.coroutines.EventLoopImplBase this$0;

        public DelayedResumeTask(kotlinx.coroutines.EventLoopImplBase r1, long r2, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.cont = r4
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r4.cont
                kotlinx.coroutines.EventLoopImplBase r1 = r4.this$0
                r2 = 0
                kotlinx.coroutines.CoroutineDispatcher r1 = (kotlinx.coroutines.CoroutineDispatcher) r1
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                r0.resumeUndispatched(r1, r3)
                return
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = super.toString()
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r1 = r2.cont
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
                return r0
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(m114d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m115d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "(JLjava/lang/Runnable;)V", "run", "", "toString", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class DelayedRunnableTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {
        private final java.lang.Runnable block;

        public DelayedRunnableTask(long r1, java.lang.Runnable r3) {
                r0 = this;
                r0.<init>(r1)
                r0.block = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.Runnable r0 = r1.block
                r0.run()
                return
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = super.toString()
                java.lang.Runnable r1 = r2.block
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
                return r0
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(m114d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u0007J\b\u0010$\u001a\u00020%H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m115d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "nanoTime", "", "(J)V", "_heap", "", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "dispose", "", "scheduleTask", "now", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", "", "toString", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    public static abstract class DelayedTask implements java.lang.Runnable, java.lang.Comparable<kotlinx.coroutines.EventLoopImplBase.DelayedTask>, kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.internal.ThreadSafeHeapNode {
        private java.lang.Object _heap;
        private int index;
        public long nanoTime;

        public DelayedTask(long r2) {
                r1 = this;
                r1.<init>()
                r1.nanoTime = r2
                r0 = -1
                r1.index = r0
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(kotlinx.coroutines.EventLoopImplBase.DelayedTask r2) {
                r1 = this;
                r0 = r2
                kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0
                int r0 = r1.compareTo2(r0)
                return r0
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(kotlinx.coroutines.EventLoopImplBase.DelayedTask r6) {
                r5 = this;
                long r0 = r5.nanoTime
                long r2 = r6.nanoTime
                long r0 = r0 - r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto Le
                r2 = 1
                goto L15
            Le:
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 >= 0) goto L14
                r2 = -1
                goto L15
            L14:
                r2 = 0
            L15:
                return r2
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final synchronized void dispose() {
                r3 = this;
                monitor-enter(r3)
                java.lang.Object r0 = r3._heap     // Catch: java.lang.Throwable -> L26
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L26
                if (r0 != r1) goto Lb
                monitor-exit(r3)
                return
            Lb:
                boolean r1 = r0 instanceof kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue     // Catch: java.lang.Throwable -> L26
                if (r1 == 0) goto L13
                r1 = r0
                kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r1 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r1     // Catch: java.lang.Throwable -> L26
                goto L14
            L13:
                r1 = 0
            L14:
                if (r1 != 0) goto L17
            L16:
                goto L1e
            L17:
                r2 = r3
                kotlinx.coroutines.internal.ThreadSafeHeapNode r2 = (kotlinx.coroutines.internal.ThreadSafeHeapNode) r2     // Catch: java.lang.Throwable -> L26
                r1.remove(r2)     // Catch: java.lang.Throwable -> L26
                goto L16
            L1e:
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L26
                r3._heap = r1     // Catch: java.lang.Throwable -> L26
                monitor-exit(r3)
                return
            L26:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
                throw r0
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public kotlinx.coroutines.internal.ThreadSafeHeap<?> getHeap() {
                r2 = this;
                java.lang.Object r0 = r2._heap
                boolean r1 = r0 instanceof kotlinx.coroutines.internal.ThreadSafeHeap
                if (r1 == 0) goto L9
                kotlinx.coroutines.internal.ThreadSafeHeap r0 = (kotlinx.coroutines.internal.ThreadSafeHeap) r0
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        public final synchronized int scheduleTask(long r19, kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue r21, kotlinx.coroutines.EventLoopImplBase r22) {
                r18 = this;
                r1 = r18
                r2 = r19
                r4 = r21
                monitor-enter(r18)
                java.lang.Object r0 = r1._heap     // Catch: java.lang.Throwable -> L6a
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L6a
                if (r0 != r5) goto L12
                monitor-exit(r18)
                r0 = 2
                return r0
            L12:
                r0 = r4
                kotlinx.coroutines.internal.ThreadSafeHeap r0 = (kotlinx.coroutines.internal.ThreadSafeHeap) r0     // Catch: java.lang.Throwable -> L6a
                r5 = r0
                r6 = 0
                r7 = 0
                monitor-enter(r5)     // Catch: java.lang.Throwable -> L6a
                r0 = 0
                kotlinx.coroutines.internal.ThreadSafeHeapNode r8 = r5.firstImpl()     // Catch: java.lang.Throwable -> L67
                kotlinx.coroutines.EventLoopImplBase$DelayedTask r8 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r8     // Catch: java.lang.Throwable -> L67
                r9 = 0
                boolean r10 = kotlinx.coroutines.EventLoopImplBase.access$isCompleted(r22)     // Catch: java.lang.Throwable -> L67
                if (r10 == 0) goto L2b
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6a
                monitor-exit(r18)
                r0 = 1
                return r0
            L2b:
                r10 = 0
                if (r8 != 0) goto L32
                r4.timeNow = r2     // Catch: java.lang.Throwable -> L67
                goto L49
            L32:
                long r12 = r8.nanoTime     // Catch: java.lang.Throwable -> L67
                long r14 = r12 - r2
                int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r14 < 0) goto L3c
                r14 = r2
                goto L3d
            L3c:
                r14 = r12
            L3d:
                long r10 = r4.timeNow     // Catch: java.lang.Throwable -> L67
                long r10 = r14 - r10
                r16 = 0
                int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
                if (r10 <= 0) goto L49
                r4.timeNow = r14     // Catch: java.lang.Throwable -> L67
            L49:
                long r10 = r1.nanoTime     // Catch: java.lang.Throwable -> L67
                long r12 = r4.timeNow     // Catch: java.lang.Throwable -> L67
                long r10 = r10 - r12
                r12 = 0
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 >= 0) goto L58
                long r10 = r4.timeNow     // Catch: java.lang.Throwable -> L67
                r1.nanoTime = r10     // Catch: java.lang.Throwable -> L67
            L58:
                r8 = r1
                kotlinx.coroutines.internal.ThreadSafeHeapNode r8 = (kotlinx.coroutines.internal.ThreadSafeHeapNode) r8     // Catch: java.lang.Throwable -> L67
                r5.addImpl(r8)     // Catch: java.lang.Throwable -> L67
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6a
                monitor-exit(r18)
                r0 = 0
                return r0
            L67:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6a
                throw r0     // Catch: java.lang.Throwable -> L6a
            L6a:
                r0 = move-exception
                monitor-exit(r18)     // Catch: java.lang.Throwable -> L6a
                throw r0
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setHeap(kotlinx.coroutines.internal.ThreadSafeHeap<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2._heap
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()
                if (r0 == r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L10
                r2._heap = r3
                return
            L10:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Failed requirement."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setIndex(int r1) {
                r0 = this;
                r0.index = r1
                return
        }

        public final boolean timeToExecute(long r5) {
                r4 = this;
                long r0 = r4.nanoTime
                long r0 = r5 - r0
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Delayed[nanos="
                java.lang.StringBuilder r0 = r0.append(r1)
                long r1 = r3.nanoTime
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m115d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeNow", "", "(J)V", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    public static final class DelayedTaskQueue extends kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.EventLoopImplBase.DelayedTask> {
        public long timeNow;

        public DelayedTaskQueue(long r1) {
                r0 = this;
                r0.<init>()
                r0.timeNow = r1
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_queue"
            java.lang.Class<kotlinx.coroutines.EventLoopImplBase> r2 = kotlinx.coroutines.EventLoopImplBase.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.EventLoopImplBase._queue$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_delayed"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.EventLoopImplBase._delayed$FU = r0
            return
    }

    public EventLoopImplBase() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._queue = r0
            r1._delayed = r0
            r0 = 0
            r1._isCompleted = r0
            return
    }

    public static final /* synthetic */ boolean access$isCompleted(kotlinx.coroutines.EventLoopImplBase r1) {
            boolean r0 = r1.isCompleted()
            return r0
    }

    private final void closeQueue() {
            r7 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L14
            r0 = 0
            boolean r0 = r7.isCompleted()
            if (r0 == 0) goto Le
            goto L14
        Le:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L14:
            r0 = r7
            r1 = 0
        L16:
            java.lang.Object r2 = r0._queue
            r3 = 0
            if (r2 != 0) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            r5 = 0
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            boolean r4 = androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r7, r5, r6)
            if (r4 == 0) goto L57
            return
        L2b:
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r4 == 0) goto L36
            r4 = r2
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r4 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r4
            r4.close()
            return
        L36:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r2 != r4) goto L3e
            return
        L3e:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r4 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r5 = 8
            r6 = 1
            r4.<init>(r5, r6)
            if (r2 == 0) goto L59
            r5 = r2
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r4.addLast(r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            boolean r5 = androidx.concurrent.futures.C0110xc40028dd.m9m(r5, r7, r2, r4)
            if (r5 == 0) goto L57
            return
        L57:
            goto L16
        L59:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            r5.<init>(r6)
            throw r5
    }

    private final java.lang.Runnable dequeue() {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            java.lang.Object r2 = r0._queue
            r3 = 0
            r4 = 0
            if (r2 != 0) goto Lb
            return r4
        Lb:
            boolean r5 = r2 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r5 == 0) goto L35
            if (r2 == 0) goto L2d
            r4 = r2
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r4 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r4
            java.lang.Object r4 = r4.removeFirstOrNull()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            if (r4 == r5) goto L20
            r5 = r4
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            return r5
        L20:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            r6 = r2
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r6 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r6
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r6 = r6.next()
            androidx.concurrent.futures.C0110xc40028dd.m9m(r5, r7, r2, r6)
            goto L53
        L2d:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }"
            r4.<init>(r5)
            throw r4
        L35:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r2 != r5) goto L3d
            return r4
        L3d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            boolean r4 = androidx.concurrent.futures.C0110xc40028dd.m9m(r5, r7, r2, r4)
            if (r4 == 0) goto L53
            if (r2 == 0) goto L4b
            r4 = r2
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            return r4
        L4b:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            r4.<init>(r5)
            throw r4
        L53:
            goto L2
    }

    private final boolean enqueueImpl(java.lang.Runnable r8) {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            java.lang.Object r2 = r0._queue
            r3 = 0
            boolean r4 = r7.isCompleted()
            r5 = 0
            if (r4 == 0) goto Le
            return r5
        Le:
            r4 = 1
            if (r2 != 0) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            r6 = 0
            boolean r5 = androidx.concurrent.futures.C0110xc40028dd.m9m(r5, r7, r6, r8)
            if (r5 == 0) goto L68
            return r4
        L1c:
            boolean r6 = r2 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r6 == 0) goto L45
            if (r2 == 0) goto L3d
            r6 = r2
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r6 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r6
            int r6 = r6.addLast(r8)
            switch(r6) {
                case 0: goto L3b;
                case 1: goto L2e;
                case 2: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L3c
        L2d:
            return r5
        L2e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            r5 = r2
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r5 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r5
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r5 = r5.next()
            androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r7, r2, r5)
            goto L3c
        L3b:
            return r4
        L3c:
            goto L68
        L3d:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }"
            r4.<init>(r5)
            throw r4
        L45:
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r2 != r6) goto L4d
            return r5
        L4d:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r5 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r6 = 8
            r5.<init>(r6, r4)
            if (r2 == 0) goto L6a
            r6 = r2
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r5.addLast(r6)
            r5.addLast(r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            boolean r6 = androidx.concurrent.futures.C0110xc40028dd.m9m(r6, r7, r2, r5)
            if (r6 == 0) goto L68
            return r4
        L68:
            goto L2
        L6a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            r4.<init>(r6)
            throw r4
    }

    private final boolean isCompleted() {
            r1 = this;
            int r0 = r1._isCompleted
            return r0
    }

    private final void rescheduleAllDelayed() {
            r4 = this;
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            r1 = 0
            if (r0 != 0) goto L9
            r0 = r1
            goto L11
        L9:
            long r2 = r0.nanoTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
        L11:
            if (r0 != 0) goto L18
            long r2 = java.lang.System.nanoTime()
            goto L1c
        L18:
            long r2 = r0.longValue()
        L1c:
            java.lang.Object r0 = r4._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 != 0) goto L25
            r0 = r1
            goto L2b
        L25:
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r0.removeFirstOrNull()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0
        L2b:
            if (r0 != 0) goto L2e
            return
        L2e:
            r4.reschedule(r2, r0)
            goto L1c
    }

    private final int scheduleImpl(long r6, kotlinx.coroutines.EventLoopImplBase.DelayedTask r8) {
            r5 = this;
            boolean r0 = r5.isCompleted()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            java.lang.Object r0 = r5._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 != 0) goto L26
            r0 = r5
            kotlinx.coroutines.EventLoopImplBase r0 = (kotlinx.coroutines.EventLoopImplBase) r0
            r1 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.EventLoopImplBase._delayed$FU
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r3 = new kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue
            r3.<init>(r6)
            r4 = 0
            androidx.concurrent.futures.C0110xc40028dd.m9m(r2, r0, r4, r3)
            java.lang.Object r2 = r0._delayed
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0 = r2
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
        L26:
            int r1 = r8.scheduleTask(r6, r0, r5)
            return r1
    }

    private final void setCompleted(boolean r1) {
            r0 = this;
            r0._isCompleted = r1
            return
    }

    private final boolean shouldUnpark(kotlinx.coroutines.EventLoopImplBase.DelayedTask r2) {
            r1 = this;
            java.lang.Object r0 = r1._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r0.peek()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0
        Le:
            if (r0 != r2) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public java.lang.Object delay(long r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.Delay r0 = (kotlinx.coroutines.Delay) r0
            java.lang.Object r0 = kotlinx.coroutines.Delay.DefaultImpls.delay(r0, r2, r4)
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo10220dispatch(kotlin.coroutines.CoroutineContext r1, java.lang.Runnable r2) {
            r0 = this;
            r0.enqueue(r2)
            return
    }

    public void enqueue(java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.enqueueImpl(r2)
            if (r0 == 0) goto La
            r1.unpark()
            goto Lf
        La:
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            r0.enqueue(r2)
        Lf:
            return
    }

    @Override // kotlinx.coroutines.EventLoop
    protected long getNextTime() {
            r8 = this;
            long r0 = super.getNextTime()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lb
            return r2
        Lb:
            java.lang.Object r0 = r8._queue
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L16
            goto L24
        L16:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r1 == 0) goto L58
            r1 = r0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L24
            return r2
        L24:
            java.lang.Object r1 = r8._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r1 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r1
            r6 = 0
            if (r1 != 0) goto L2d
            r1 = r6
            goto L33
        L2d:
            kotlinx.coroutines.internal.ThreadSafeHeapNode r1 = r1.peek()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r1 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r1
        L33:
            if (r1 != 0) goto L36
            return r4
        L36:
            long r4 = r1.nanoTime
            kotlinx.coroutines.AbstractTimeSource r7 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r7 != 0) goto L3f
            goto L47
        L3f:
            long r6 = r7.nanoTime()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
        L47:
            if (r6 != 0) goto L4e
            long r6 = java.lang.System.nanoTime()
            goto L52
        L4e:
            long r6 = r6.longValue()
        L52:
            long r4 = r4 - r6
            long r2 = kotlin.ranges.RangesKt.coerceAtLeast(r4, r2)
            return r2
        L58:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r1) goto L5f
            return r4
        L5f:
            return r2
    }

    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r2, java.lang.Runnable r4, kotlin.coroutines.CoroutineContext r5) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.Delay r0 = (kotlinx.coroutines.Delay) r0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Delay.DefaultImpls.invokeOnTimeout(r0, r2, r4, r5)
            return r0
    }

    @Override // kotlinx.coroutines.EventLoop
    protected boolean isEmpty() {
            r5 = this;
            boolean r0 = r5.isUnconfinedQueueEmpty()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r5._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L15
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L15
            return r1
        L15:
            java.lang.Object r2 = r5._queue
            r3 = 1
            if (r2 != 0) goto L1c
            r1 = r3
            goto L2f
        L1c:
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r4 == 0) goto L28
            r1 = r2
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            boolean r1 = r1.isEmpty()
            goto L2f
        L28:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r2 != r4) goto L2f
            r1 = r3
        L2f:
            return r1
    }

    @Override // kotlinx.coroutines.EventLoop
    public long processNextEvent() {
            r15 = this;
            boolean r0 = r15.processUnconfinedEvent()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r15._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L6e
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L6e
            kotlinx.coroutines.AbstractTimeSource r3 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            r4 = 0
            if (r3 != 0) goto L1e
            r3 = r4
            goto L26
        L1e:
            long r5 = r3.nanoTime()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
        L26:
            if (r3 != 0) goto L2d
            long r5 = java.lang.System.nanoTime()
            goto L31
        L2d:
            long r5 = r3.longValue()
        L31:
            r3 = r0
            kotlinx.coroutines.internal.ThreadSafeHeap r3 = (kotlinx.coroutines.internal.ThreadSafeHeap) r3
            r7 = 0
            r8 = 0
            monitor-enter(r3)
            r9 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r10 = r3.firstImpl()     // Catch: java.lang.Throwable -> L6b
            if (r10 != 0) goto L42
            monitor-exit(r3)
            r11 = r4
            goto L66
        L42:
            r11 = r10
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r11 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r11     // Catch: java.lang.Throwable -> L6b
            r12 = 0
            boolean r13 = r11.timeToExecute(r5)     // Catch: java.lang.Throwable -> L6b
            r14 = 0
            if (r13 == 0) goto L55
            r13 = r11
            java.lang.Runnable r13 = (java.lang.Runnable) r13     // Catch: java.lang.Throwable -> L6b
            boolean r13 = r15.enqueueImpl(r13)     // Catch: java.lang.Throwable -> L6b
            goto L56
        L55:
            r13 = r14
        L56:
            if (r13 == 0) goto L5e
            kotlinx.coroutines.internal.ThreadSafeHeapNode r11 = r3.removeAtImpl(r14)     // Catch: java.lang.Throwable -> L6b
            goto L62
        L5e:
            r11 = r4
            kotlinx.coroutines.internal.ThreadSafeHeapNode r11 = (kotlinx.coroutines.internal.ThreadSafeHeapNode) r11     // Catch: java.lang.Throwable -> L6b
            r11 = r4
        L62:
            monitor-exit(r3)
        L66:
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r11 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r11
            if (r11 != 0) goto L31
            goto L6e
        L6b:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L6e:
            java.lang.Runnable r3 = r15.dequeue()
            if (r3 == 0) goto L7a
            r4 = 0
            r5 = 0
            r3.run()
            return r1
        L7a:
            long r1 = r15.getNextTime()
            return r1
    }

    protected final void resetAll() {
            r1 = this;
            r0 = 0
            r1._queue = r0
            r1._delayed = r0
            return
    }

    public final void schedule(long r3, kotlinx.coroutines.EventLoopImplBase.DelayedTask r5) {
            r2 = this;
            int r0 = r2.scheduleImpl(r3, r5)
            switch(r0) {
                case 0: goto L19;
                case 1: goto L15;
                case 2: goto L14;
                default: goto L8;
            }
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected result"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L14:
            goto L22
        L15:
            r2.reschedule(r3, r5)
            goto L22
        L19:
            boolean r0 = r2.shouldUnpark(r5)
            if (r0 == 0) goto L22
            r2.unpark()
        L22:
            return
    }

    protected final kotlinx.coroutines.DisposableHandle scheduleInvokeOnTimeout(long r9, java.lang.Runnable r11) {
            r8 = this;
            long r0 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r9)
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L3c
            kotlinx.coroutines.AbstractTimeSource r2 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r2 != 0) goto L15
            r2 = 0
            goto L1d
        L15:
            long r2 = r2.nanoTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L1d:
            if (r2 != 0) goto L24
            long r2 = java.lang.System.nanoTime()
            goto L28
        L24:
            long r2 = r2.longValue()
        L28:
            kotlinx.coroutines.EventLoopImplBase$DelayedRunnableTask r4 = new kotlinx.coroutines.EventLoopImplBase$DelayedRunnableTask
            long r5 = r2 + r0
            r4.<init>(r5, r11)
            r5 = r4
            r6 = 0
            r7 = r5
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r7 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r7
            r8.schedule(r2, r7)
            kotlinx.coroutines.DisposableHandle r4 = (kotlinx.coroutines.DisposableHandle) r4
            goto L41
        L3c:
            kotlinx.coroutines.NonDisposableHandle r2 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r4 = r2
            kotlinx.coroutines.DisposableHandle r4 = (kotlinx.coroutines.DisposableHandle) r4
        L41:
            return r4
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo10221scheduleResumeAfterDelay(long r8, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r10) {
            r7 = this;
            long r0 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r8)
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L3e
            kotlinx.coroutines.AbstractTimeSource r2 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r2 != 0) goto L15
            r2 = 0
            goto L1d
        L15:
            long r2 = r2.nanoTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L1d:
            if (r2 != 0) goto L24
            long r2 = java.lang.System.nanoTime()
            goto L28
        L24:
            long r2 = r2.longValue()
        L28:
            kotlinx.coroutines.EventLoopImplBase$DelayedResumeTask r4 = new kotlinx.coroutines.EventLoopImplBase$DelayedResumeTask
            long r5 = r2 + r0
            r4.<init>(r7, r5, r10)
            r5 = 0
            r6 = r4
            kotlinx.coroutines.DisposableHandle r6 = (kotlinx.coroutines.DisposableHandle) r6
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r10, r6)
            r6 = r4
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r6 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r6
            r7.schedule(r2, r6)
        L3e:
            return
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
            r4 = this;
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            r0.resetEventLoop$kotlinx_coroutines_core()
            r0 = 1
            r4.setCompleted(r0)
            r4.closeQueue()
        Lc:
            long r0 = r4.processNextEvent()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L17
            goto Lc
        L17:
            r4.rescheduleAllDelayed()
            return
    }
}
