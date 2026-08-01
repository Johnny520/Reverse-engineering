package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001hB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020,H\u0002J\u001f\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0096@ø\u0001\u0000¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u0012H\u0002J\b\u0010:\u001a\u00020\u0003H\u0014J\u001d\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0006\u0010<\u001a\u00020\bH\u0014¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020,H\u0002J\u0019\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0019\u0010B\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0012\u0010C\u001a\u00020,2\b\u0010D\u001a\u0004\u0018\u00010\u000fH\u0002J1\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0014\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000eH\u0002¢\u0006\u0002\u0010HJ&\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010O\u001a\u00020\u0012H\u0002J7\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0010\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0002¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020,H\u0016J\u0015\u0010V\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Z\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0010\u0010[\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0012\u0010\\\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\u0003H\u0002J(\u0010]\u001a\u00020,2\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\u0012H\u0002J%\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0006\u0010c\u001a\u00020\u0012H\u0000¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\u0012H\u0000¢\u0006\u0002\bgR\u001a\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006i"}, m115d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "replay", "", "bufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "buffer", "", "", "[Ljava/lang/Object;", "bufferEndIndex", "", "getBufferEndIndex", "()J", "bufferSize", "head", "getHead", "lastReplayedLocked", "getLastReplayedLocked$annotations", "()V", "getLastReplayedLocked", "()Ljava/lang/Object;", "minCollectorIndex", "queueEndIndex", "getQueueEndIndex", "queueSize", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "replayIndex", "replaySize", "getReplaySize", "()I", "totalSize", "getTotalSize", "awaitValue", "", "slot", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelEmitter", "emitter", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "cleanupTailLocked", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "correctCollectorIndexesOnDropOldest", "newHead", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "dropOldestLocked", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSuspend", "enqueueLocked", "item", "findSlotsToResumeLocked", "Lkotlin/coroutines/Continuation;", "resumesIn", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getPeekedValueLockedAt", "index", "growBuffer", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "resetReplayCache", "tryEmit", "", "(Ljava/lang/Object;)Z", "tryEmitLocked", "tryEmitNoCollectorsLocked", "tryPeekLocked", "tryTakeValue", "updateBufferLocked", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateNewCollectorIndexLocked", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "Emitter", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public class SharedFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.SharedFlowSlot> implements kotlinx.coroutines.flow.MutableSharedFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {
    private java.lang.Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.Metadata(m114d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m115d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "index", "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class Emitter implements kotlinx.coroutines.DisposableHandle {
        public final kotlin.coroutines.Continuation<kotlin.Unit> cont;
        public final kotlinx.coroutines.flow.SharedFlowImpl<?> flow;
        public long index;
        public final java.lang.Object value;

        public Emitter(kotlinx.coroutines.flow.SharedFlowImpl<?> r1, long r2, java.lang.Object r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r0 = this;
                r0.<init>()
                r0.flow = r1
                r0.index = r2
                r0.value = r4
                r0.cont = r5
                return
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
                r1 = this;
                kotlinx.coroutines.flow.SharedFlowImpl<?> r0 = r1.flow
                kotlinx.coroutines.flow.SharedFlowImpl.access$cancelEmitter(r0, r1)
                return
        }
    }

    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.channels.BufferOverflow[] r0 = kotlinx.coroutines.channels.BufferOverflow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                kotlinx.coroutines.flow.SharedFlowImpl.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1 */
    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.SharedFlowImpl", m125f = "SharedFlow.kt", m126i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m127l = {373, 380, 383}, m128m = "collect$suspendImpl", m129n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, m130s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class C09921 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.SharedFlowImpl<T> this$0;

        C09921(kotlinx.coroutines.flow.SharedFlowImpl<T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.SharedFlowImpl.C09921> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                r3.result = r4
                int r0 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r3.label = r0
                kotlinx.coroutines.flow.SharedFlowImpl<T> r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = kotlinx.coroutines.flow.SharedFlowImpl.collect$suspendImpl(r0, r1, r2)
                return r0
        }
    }

    public SharedFlowImpl(int r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            r0.<init>()
            r0.replay = r1
            r0.bufferCapacity = r2
            r0.onBufferOverflow = r3
            return
    }

    public static final /* synthetic */ java.lang.Object access$awaitValue(kotlinx.coroutines.flow.SharedFlowImpl r1, kotlinx.coroutines.flow.SharedFlowSlot r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r1.awaitValue(r2, r3)
            return r0
    }

    public static final /* synthetic */ void access$cancelEmitter(kotlinx.coroutines.flow.SharedFlowImpl r0, kotlinx.coroutines.flow.SharedFlowImpl.Emitter r1) {
            r0.cancelEmitter(r1)
            return
    }

    public static final /* synthetic */ java.lang.Object access$emitSuspend(kotlinx.coroutines.flow.SharedFlowImpl r1, java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r1.emitSuspend(r2, r3)
            return r0
    }

    public static final /* synthetic */ void access$enqueueLocked(kotlinx.coroutines.flow.SharedFlowImpl r0, java.lang.Object r1) {
            r0.enqueueLocked(r1)
            return
    }

    public static final /* synthetic */ kotlin.coroutines.Continuation[] access$findSlotsToResumeLocked(kotlinx.coroutines.flow.SharedFlowImpl r1, kotlin.coroutines.Continuation[] r2) {
            kotlin.coroutines.Continuation[] r0 = r1.findSlotsToResumeLocked(r2)
            return r0
    }

    public static final /* synthetic */ int access$getBufferCapacity$p(kotlinx.coroutines.flow.SharedFlowImpl r1) {
            int r0 = r1.bufferCapacity
            return r0
    }

    public static final /* synthetic */ long access$getHead(kotlinx.coroutines.flow.SharedFlowImpl r2) {
            long r0 = r2.getHead()
            return r0
    }

    public static final /* synthetic */ int access$getQueueSize$p(kotlinx.coroutines.flow.SharedFlowImpl r1) {
            int r0 = r1.queueSize
            return r0
    }

    public static final /* synthetic */ int access$getTotalSize(kotlinx.coroutines.flow.SharedFlowImpl r1) {
            int r0 = r1.getTotalSize()
            return r0
    }

    public static final /* synthetic */ void access$setQueueSize$p(kotlinx.coroutines.flow.SharedFlowImpl r0, int r1) {
            r0.queueSize = r1
            return
    }

    public static final /* synthetic */ boolean access$tryEmitLocked(kotlinx.coroutines.flow.SharedFlowImpl r1, java.lang.Object r2) {
            boolean r0 = r1.tryEmitLocked(r2)
            return r0
    }

    public static final /* synthetic */ long access$tryPeekLocked(kotlinx.coroutines.flow.SharedFlowImpl r2, kotlinx.coroutines.flow.SharedFlowSlot r3) {
            long r0 = r2.tryPeekLocked(r3)
            return r0
    }

    private final java.lang.Object awaitValue(kotlinx.coroutines.flow.SharedFlowSlot r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
            r12 = this;
            r0 = 0
            r1 = r14
            r2 = 0
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r5 = 1
            r3.<init>(r4, r5)
            r3.initCancellability()
            r4 = r3
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r5 = 0
            r6 = 0
            monitor-enter(r12)
            r7 = 0
            long r8 = access$tryPeekLocked(r12, r13)     // Catch: java.lang.Throwable -> L58
            r10 = 0
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 >= 0) goto L2c
            r10 = r4
            kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10     // Catch: java.lang.Throwable -> L58
            r13.cont = r10     // Catch: java.lang.Throwable -> L58
            r10 = r4
            kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10     // Catch: java.lang.Throwable -> L58
            r13.cont = r10     // Catch: java.lang.Throwable -> L58
            goto L3b
        L2c:
            r10 = r4
            kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10     // Catch: java.lang.Throwable -> L58
            kotlin.Result$Companion r11 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L58
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L58
            java.lang.Object r11 = kotlin.Result.m8669constructorimpl(r11)     // Catch: java.lang.Throwable -> L58
            r10.resumeWith(r11)     // Catch: java.lang.Throwable -> L58
        L3b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L58
            monitor-exit(r12)
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L4d
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r14)
        L4d:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto L55
            return r1
        L55:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L58:
            r7 = move-exception
            monitor-exit(r12)
            throw r7
    }

    private final void cancelEmitter(kotlinx.coroutines.flow.SharedFlowImpl.Emitter r7) {
            r6 = this;
            r0 = 0
            monitor-enter(r6)
            r1 = 0
            long r2 = r7.index     // Catch: java.lang.Throwable -> L2e
            long r4 = r6.getHead()     // Catch: java.lang.Throwable -> L2e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto Lf
            monitor-exit(r6)
            return
        Lf:
            java.lang.Object[] r2 = r6.buffer     // Catch: java.lang.Throwable -> L2e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L2e
            long r3 = r7.index     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r3 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r2, r3)     // Catch: java.lang.Throwable -> L2e
            if (r3 == r7) goto L1e
            monitor-exit(r6)
            return
        L1e:
            long r3 = r7.index     // Catch: java.lang.Throwable -> L2e
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE     // Catch: java.lang.Throwable -> L2e
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r2, r3, r5)     // Catch: java.lang.Throwable -> L2e
            r6.cleanupTailLocked()     // Catch: java.lang.Throwable -> L2e
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r6)
            return
        L2e:
            r1 = move-exception
            monitor-exit(r6)
            throw r1
    }

    private final void cleanupTailLocked() {
            r5 = this;
            int r0 = r5.bufferCapacity
            if (r0 != 0) goto La
            int r0 = r5.queueSize
            r1 = 1
            if (r0 > r1) goto La
            return
        La:
            java.lang.Object[] r0 = r5.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
        Lf:
            int r1 = r5.queueSize
            if (r1 <= 0) goto L3d
            long r1 = r5.getHead()
            int r3 = r5.getTotalSize()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            java.lang.Object r1 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r1)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            if (r1 != r2) goto L3d
            int r1 = r5.queueSize
            int r1 = r1 + (-1)
            r5.queueSize = r1
            long r1 = r5.getHead()
            int r3 = r5.getTotalSize()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 0
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r0, r1, r3)
            goto Lf
        L3d:
            return
    }

    static /* synthetic */ java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl r6, kotlinx.coroutines.flow.FlowCollector r7, kotlin.coroutines.Continuation r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.SharedFlowImpl.C09921
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.SharedFlowImpl.C09921) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            r0.<init>(r6, r8)
        L19:
            r8 = r0
            java.lang.Object r0 = r8.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r8.label
            switch(r2) {
                case 0: goto L6a;
                case 1: goto L57;
                case 2: goto L42;
                case 3: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            java.lang.Object r6 = r8.L$3
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
            java.lang.Object r7 = r8.L$2
            kotlinx.coroutines.flow.SharedFlowSlot r7 = (kotlinx.coroutines.flow.SharedFlowSlot) r7
            java.lang.Object r2 = r8.L$1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r3 = r8.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r3 = (kotlinx.coroutines.flow.SharedFlowImpl) r3
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> Ld4
            goto Lc0
        L42:
            java.lang.Object r6 = r8.L$3
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
            java.lang.Object r7 = r8.L$2
            kotlinx.coroutines.flow.SharedFlowSlot r7 = (kotlinx.coroutines.flow.SharedFlowSlot) r7
            java.lang.Object r2 = r8.L$1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r3 = r8.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r3 = (kotlinx.coroutines.flow.SharedFlowImpl) r3
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> Ld4
            goto Ld3
        L57:
            java.lang.Object r6 = r8.L$2
            r7 = r6
            kotlinx.coroutines.flow.SharedFlowSlot r7 = (kotlinx.coroutines.flow.SharedFlowSlot) r7
            java.lang.Object r6 = r8.L$1
            r2 = r6
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r6 = r8.L$0
            r3 = r6
            kotlinx.coroutines.flow.SharedFlowImpl r3 = (kotlinx.coroutines.flow.SharedFlowImpl) r3
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> Ld4
            goto L8e
        L6a:
            kotlin.ResultKt.throwOnFailure(r0)
            r3 = r6
            r2 = r7
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r6 = r3.allocateSlot()
            r7 = r6
            kotlinx.coroutines.flow.SharedFlowSlot r7 = (kotlinx.coroutines.flow.SharedFlowSlot) r7
            boolean r6 = r2 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch: java.lang.Throwable -> Ld4
            if (r6 == 0) goto L8f
            r6 = r2
            kotlinx.coroutines.flow.SubscribedFlowCollector r6 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r6     // Catch: java.lang.Throwable -> Ld4
            r8.L$0 = r3     // Catch: java.lang.Throwable -> Ld4
            r8.L$1 = r2     // Catch: java.lang.Throwable -> Ld4
            r8.L$2 = r7     // Catch: java.lang.Throwable -> Ld4
            r4 = 1
            r8.label = r4     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r6 = r6.onSubscription(r8)     // Catch: java.lang.Throwable -> Ld4
            if (r6 != r1) goto L8e
            return r1
        L8e:
        L8f:
            r6 = 0
            kotlin.coroutines.CoroutineContext r4 = r8.getContext()     // Catch: java.lang.Throwable -> Ld4
            kotlinx.coroutines.Job$Key r6 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> Ld4
            kotlin.coroutines.CoroutineContext$Key r6 = (kotlin.coroutines.CoroutineContext.Key) r6     // Catch: java.lang.Throwable -> Ld4
            kotlin.coroutines.CoroutineContext$Element r6 = r4.get(r6)     // Catch: java.lang.Throwable -> Ld4
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6     // Catch: java.lang.Throwable -> Ld4
        L9e:
        L9f:
            java.lang.Object r4 = r3.tryTakeValue(r7)     // Catch: java.lang.Throwable -> Ld4
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE     // Catch: java.lang.Throwable -> Ld4
            if (r4 == r5) goto Lc1
            if (r6 != 0) goto Lab
            goto Lae
        Lab:
            kotlinx.coroutines.JobKt.ensureActive(r6)     // Catch: java.lang.Throwable -> Ld4
        Lae:
            r8.L$0 = r3     // Catch: java.lang.Throwable -> Ld4
            r8.L$1 = r2     // Catch: java.lang.Throwable -> Ld4
            r8.L$2 = r7     // Catch: java.lang.Throwable -> Ld4
            r8.L$3 = r6     // Catch: java.lang.Throwable -> Ld4
            r5 = 3
            r8.label = r5     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r5 = r2.emit(r4, r8)     // Catch: java.lang.Throwable -> Ld4
            if (r5 != r1) goto Lc0
            return r1
        Lc0:
            goto L9e
        Lc1:
            r8.L$0 = r3     // Catch: java.lang.Throwable -> Ld4
            r8.L$1 = r2     // Catch: java.lang.Throwable -> Ld4
            r8.L$2 = r7     // Catch: java.lang.Throwable -> Ld4
            r8.L$3 = r6     // Catch: java.lang.Throwable -> Ld4
            r4 = 2
            r8.label = r4     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r4 = r3.awaitValue(r7, r8)     // Catch: java.lang.Throwable -> Ld4
            if (r4 != r1) goto Ld3
            return r1
        Ld3:
            goto L9f
        Ld4:
            r6 = move-exception
            r1 = r7
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r1 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r1
            r3.freeSlot(r1)
            throw r6
    }

    private final void correctCollectorIndexesOnDropOldest(long r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r0
            kotlinx.coroutines.flow.internal.AbstractSharedFlow r3 = (kotlinx.coroutines.flow.internal.AbstractSharedFlow) r3
            r4 = 0
            int r5 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(r3)
            if (r5 != 0) goto Lf
            goto L3c
        Lf:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r5 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(r3)
            if (r5 != 0) goto L16
            goto L3b
        L16:
            r6 = 0
            int r7 = r5.length
            r8 = 0
        L19:
            if (r8 >= r7) goto L3a
            r9 = r5[r8]
            int r8 = r8 + 1
            r10 = r9
            r11 = 0
            if (r10 == 0) goto L38
            r12 = r10
            kotlinx.coroutines.flow.SharedFlowSlot r12 = (kotlinx.coroutines.flow.SharedFlowSlot) r12
            r13 = 0
            long r14 = r12.index
            r16 = 0
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 < 0) goto L37
            long r14 = r12.index
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 >= 0) goto L37
            r12.index = r1
        L37:
        L38:
            goto L19
        L3a:
        L3b:
        L3c:
            r0.minCollectorIndex = r1
            return
    }

    private final void dropOldestLocked() {
            r5 = this;
            java.lang.Object[] r0 = r5.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            long r1 = r5.getHead()
            r3 = 0
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r0, r1, r3)
            int r0 = r5.bufferSize
            int r0 = r0 + (-1)
            r5.bufferSize = r0
            long r0 = r5.getHead()
            r2 = 1
            long r0 = r0 + r2
            long r2 = r5.replayIndex
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L22
            r5.replayIndex = r0
        L22:
            long r2 = r5.minCollectorIndex
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L2b
            r5.correctCollectorIndexesOnDropOldest(r0)
        L2b:
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L46
            r2 = 0
            long r3 = r5.getHead()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L3c
            r3 = 1
            goto L3d
        L3c:
            r3 = 0
        L3d:
            if (r3 == 0) goto L40
            goto L46
        L40:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L46:
            return
    }

    static /* synthetic */ java.lang.Object emit$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl r2, java.lang.Object r3, kotlin.coroutines.Continuation r4) {
            boolean r0 = r2.tryEmit(r3)
            if (r0 == 0) goto L9
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9:
            java.lang.Object r0 = r2.emitSuspend(r3, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L14
            return r0
        L14:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final java.lang.Object emitSuspend(T r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
            r18 = this;
            r7 = r18
            r8 = 0
            r9 = r20
            r10 = 0
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r9)
            r11 = 1
            r0.<init>(r1, r11)
            r12 = r0
            r12.initCancellability()
            r13 = r12
            kotlinx.coroutines.CancellableContinuation r13 = (kotlinx.coroutines.CancellableContinuation) r13
            r14 = 0
            r0 = 0
            kotlin.coroutines.Continuation<kotlin.Unit>[] r15 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            r16 = 0
            monitor-enter(r18)
            r0 = 0
            boolean r1 = access$tryEmitLocked(r18, r19)     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto L39
            r1 = r13
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1     // Catch: java.lang.Throwable -> Lac
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Lac
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r2 = kotlin.Result.m8669constructorimpl(r2)     // Catch: java.lang.Throwable -> Lac
            r1.resumeWith(r2)     // Catch: java.lang.Throwable -> Lac
            kotlin.coroutines.Continuation[] r1 = access$findSlotsToResumeLocked(r7, r15)     // Catch: java.lang.Throwable -> Lac
            r2 = 0
            goto L6e
        L39:
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r17 = new kotlinx.coroutines.flow.SharedFlowImpl$Emitter     // Catch: java.lang.Throwable -> Lac
            long r1 = access$getHead(r18)     // Catch: java.lang.Throwable -> Lac
            int r3 = access$getTotalSize(r18)     // Catch: java.lang.Throwable -> Lac
            long r3 = (long) r3     // Catch: java.lang.Throwable -> Lac
            long r3 = r3 + r1
            r6 = r13
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch: java.lang.Throwable -> Lac
            r1 = r17
            r2 = r18
            r5 = r19
            r1.<init>(r2, r3, r5, r6)     // Catch: java.lang.Throwable -> Lac
            r1 = r17
            r2 = 0
            access$enqueueLocked(r7, r1)     // Catch: java.lang.Throwable -> Lac
            int r3 = access$getQueueSize$p(r18)     // Catch: java.lang.Throwable -> Lac
            int r3 = r3 + r11
            access$setQueueSize$p(r7, r3)     // Catch: java.lang.Throwable -> Lac
            int r3 = access$getBufferCapacity$p(r18)     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L6a
            kotlin.coroutines.Continuation[] r3 = access$findSlotsToResumeLocked(r7, r15)     // Catch: java.lang.Throwable -> Lac
            r15 = r3
        L6a:
            r1 = r15
            r2 = r17
        L6e:
            monitor-exit(r18)
            r0 = r2
            if (r0 != 0) goto L74
            goto L7c
        L74:
            r2 = r0
            r3 = 0
            r4 = r2
            kotlinx.coroutines.DisposableHandle r4 = (kotlinx.coroutines.DisposableHandle) r4
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r13, r4)
        L7c:
            int r2 = r1.length
            r3 = 0
        L7e:
            if (r3 >= r2) goto L93
            r4 = r1[r3]
            int r3 = r3 + 1
            if (r4 != 0) goto L87
            goto L7e
        L87:
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            java.lang.Object r5 = kotlin.Result.m8669constructorimpl(r5)
            r4.resumeWith(r5)
            goto L7e
        L93:
            java.lang.Object r0 = r12.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto La1
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r20)
        La1:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto La9
            return r0
        La9:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lac:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
    }

    private final void enqueueLocked(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.getTotalSize()
            java.lang.Object[] r1 = r6.buffer
            r2 = 2
            if (r1 != 0) goto L11
            r3 = 0
            r4 = 0
            java.lang.Object[] r2 = r6.growBuffer(r3, r4, r2)
            r1 = r2
            goto L1b
        L11:
            int r3 = r1.length
            if (r0 < r3) goto L1b
            int r3 = r1.length
            int r3 = r3 * r2
            java.lang.Object[] r2 = r6.growBuffer(r1, r0, r3)
            r1 = r2
        L1b:
            long r2 = r6.getHead()
            long r4 = (long) r0
            long r2 = r2 + r4
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r1, r2, r7)
            return
    }

    private final kotlin.coroutines.Continuation<kotlin.Unit>[] findSlotsToResumeLocked(kotlin.coroutines.Continuation<kotlin.Unit>[] r21) {
            r20 = this;
            r0 = r20
            r1 = 0
            r1 = r21
            r2 = 0
            r3 = r21
            int r2 = r3.length
            r4 = r0
            kotlinx.coroutines.flow.internal.AbstractSharedFlow r4 = (kotlinx.coroutines.flow.internal.AbstractSharedFlow) r4
            r5 = 0
            int r6 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(r4)
            if (r6 != 0) goto L15
            goto L7b
        L15:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r6 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(r4)
            if (r6 != 0) goto L1c
            goto L7a
        L1c:
            r7 = 0
            int r8 = r6.length
            r9 = 0
        L1f:
            if (r9 >= r8) goto L78
            r10 = r6[r9]
            int r9 = r9 + 1
            r11 = r10
            r12 = 0
            if (r11 == 0) goto L6f
            r13 = r11
            kotlinx.coroutines.flow.SharedFlowSlot r13 = (kotlinx.coroutines.flow.SharedFlowSlot) r13
            r14 = 0
            kotlin.coroutines.Continuation<? super kotlin.Unit> r15 = r13.cont
            if (r15 != 0) goto L34
            r16 = r1
            goto L71
        L34:
            long r16 = r0.tryPeekLocked(r13)
            r18 = 0
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L41
            r16 = r1
            goto L71
        L41:
            r0 = r1
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r0.length
            if (r2 < r0) goto L61
            r0 = r1
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r3 = r1
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r3 = r3.length
            r16 = r1
            r1 = 2
            int r3 = r3 * r1
            int r1 = java.lang.Math.max(r1, r3)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = r0
            goto L63
        L61:
            r16 = r1
        L63:
            r0 = r1
            kotlin.coroutines.Continuation[] r0 = (kotlin.coroutines.Continuation[]) r0
            int r3 = r2 + 1
            r0[r2] = r15
            r0 = 0
            r13.cont = r0
            r2 = r3
            goto L73
        L6f:
            r16 = r1
        L71:
            r1 = r16
        L73:
            r0 = r20
            r3 = r21
            goto L1f
        L78:
            r16 = r1
        L7a:
        L7b:
            r0 = r1
            kotlin.coroutines.Continuation[] r0 = (kotlin.coroutines.Continuation[]) r0
            return r0
    }

    private final long getBufferEndIndex() {
            r4 = this;
            long r0 = r4.getHead()
            int r2 = r4.bufferSize
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    private final long getHead() {
            r4 = this;
            long r0 = r4.minCollectorIndex
            long r2 = r4.replayIndex
            long r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    protected static /* synthetic */ void getLastReplayedLocked$annotations() {
            return
    }

    private final java.lang.Object getPeekedValueLockedAt(long r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.Object r0 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r3)
            boolean r1 = r0 instanceof kotlinx.coroutines.flow.SharedFlowImpl.Emitter
            if (r1 == 0) goto L14
            r1 = r0
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r1 = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) r1
            java.lang.Object r1 = r1.value
            r0 = r1
            goto L15
        L14:
        L15:
            return r0
    }

    private final long getQueueEndIndex() {
            r4 = this;
            long r0 = r4.getHead()
            int r2 = r4.bufferSize
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = r4.queueSize
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    private final int getReplaySize() {
            r4 = this;
            long r0 = r4.getHead()
            int r2 = r4.bufferSize
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = r4.replayIndex
            long r0 = r0 - r2
            int r0 = (int) r0
            return r0
    }

    private final int getTotalSize() {
            r2 = this;
            int r0 = r2.bufferSize
            int r1 = r2.queueSize
            int r0 = r0 + r1
            return r0
    }

    private final java.lang.Object[] growBuffer(java.lang.Object[] r10, int r11, int r12) {
            r9 = this;
            r0 = 0
            if (r12 <= 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            if (r1 == 0) goto L28
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r2 = r1
            r3 = 0
            r9.buffer = r2
            if (r10 != 0) goto L11
            return r1
        L11:
            long r2 = r9.getHead()
        L16:
            if (r0 >= r11) goto L27
            r4 = r0
            int r0 = r0 + 1
            long r5 = (long) r4
            long r5 = r5 + r2
            long r7 = (long) r4
            long r7 = r7 + r2
            java.lang.Object r7 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r10, r7)
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r1, r5, r7)
            goto L16
        L27:
            return r1
        L28:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Buffer size overflow"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final boolean tryEmitLocked(T r15) {
            r14 = this;
            int r0 = r14.getNCollectors()
            if (r0 != 0) goto Lb
            boolean r0 = r14.tryEmitNoCollectorsLocked(r15)
            return r0
        Lb:
            int r0 = r14.bufferSize
            int r1 = r14.bufferCapacity
            r2 = 1
            if (r0 < r1) goto L2b
            long r0 = r14.minCollectorIndex
            long r3 = r14.replayIndex
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L2b
            kotlinx.coroutines.channels.BufferOverflow r0 = r14.onBufferOverflow
            int[] r1 = kotlinx.coroutines.flow.SharedFlowImpl.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L29;
                case 2: goto L28;
                default: goto L27;
            }
        L27:
            goto L2b
        L28:
            return r2
        L29:
            r0 = 0
            return r0
        L2b:
            r14.enqueueLocked(r15)
            int r0 = r14.bufferSize
            int r0 = r0 + r2
            r14.bufferSize = r0
            int r0 = r14.bufferSize
            int r1 = r14.bufferCapacity
            if (r0 <= r1) goto L3c
            r14.dropOldestLocked()
        L3c:
            int r0 = r14.getReplaySize()
            int r1 = r14.replay
            if (r0 <= r1) goto L58
            long r0 = r14.replayIndex
            r3 = 1
            long r6 = r0 + r3
            long r8 = r14.minCollectorIndex
            long r10 = r14.getBufferEndIndex()
            long r12 = r14.getQueueEndIndex()
            r5 = r14
            r5.updateBufferLocked(r6, r8, r10, r12)
        L58:
            return r2
    }

    private final boolean tryEmitNoCollectorsLocked(T r7) {
            r6 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 1
            if (r0 == 0) goto L1a
            r0 = 0
            int r2 = r6.getNCollectors()
            if (r2 != 0) goto L10
            r2 = r1
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L14
            goto L1a
        L14:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1a:
            int r0 = r6.replay
            if (r0 != 0) goto L1f
            return r1
        L1f:
            r6.enqueueLocked(r7)
            int r0 = r6.bufferSize
            int r0 = r0 + r1
            r6.bufferSize = r0
            int r0 = r6.bufferSize
            int r2 = r6.replay
            if (r0 <= r2) goto L30
            r6.dropOldestLocked()
        L30:
            long r2 = r6.getHead()
            int r0 = r6.bufferSize
            long r4 = (long) r0
            long r2 = r2 + r4
            r6.minCollectorIndex = r2
            return r1
    }

    private final long tryPeekLocked(kotlinx.coroutines.flow.SharedFlowSlot r8) {
            r7 = this;
            long r0 = r8.index
            long r2 = r7.getBufferEndIndex()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lb
            return r0
        Lb:
            int r2 = r7.bufferCapacity
            r3 = -1
            if (r2 <= 0) goto L12
            return r3
        L12:
            long r5 = r7.getHead()
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L1b
            return r3
        L1b:
            int r2 = r7.queueSize
            if (r2 != 0) goto L20
            return r3
        L20:
            return r0
    }

    private final java.lang.Object tryTakeValue(kotlinx.coroutines.flow.SharedFlowSlot r11) {
            r10 = this;
            r0 = 0
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            r1 = 0
            monitor-enter(r10)
            r2 = 0
            long r3 = r10.tryPeekLocked(r11)     // Catch: java.lang.Throwable -> L40
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L13
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE     // Catch: java.lang.Throwable -> L40
            goto L24
        L13:
            long r5 = r11.index     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r10.getPeekedValueLockedAt(r3)     // Catch: java.lang.Throwable -> L40
            r8 = 1
            long r8 = r8 + r3
            r11.index = r8     // Catch: java.lang.Throwable -> L40
            kotlin.coroutines.Continuation[] r8 = r10.updateCollectorIndexLocked$kotlinx_coroutines_core(r5)     // Catch: java.lang.Throwable -> L40
            r0 = r8
            r5 = r7
        L24:
            monitor-exit(r10)
            r1 = r5
            int r2 = r0.length
            r3 = 0
        L2a:
            if (r3 >= r2) goto L3f
            r4 = r0[r3]
            int r3 = r3 + 1
            if (r4 != 0) goto L33
            goto L2a
        L33:
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            java.lang.Object r5 = kotlin.Result.m8669constructorimpl(r5)
            r4.resumeWith(r5)
            goto L2a
        L3f:
            return r1
        L40:
            r2 = move-exception
            monitor-exit(r10)
            throw r2
    }

    private final void updateBufferLocked(long r17, long r19, long r21, long r23) {
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            long r5 = java.lang.Math.min(r3, r1)
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L27
            r7 = 0
            long r10 = r16.getHead()
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 < 0) goto L1d
            r7 = r8
            goto L1e
        L1d:
            r7 = r9
        L1e:
            if (r7 == 0) goto L21
            goto L27
        L21:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L27:
            long r10 = r16.getHead()
        L2b:
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 >= 0) goto L3d
            r12 = r10
            r14 = 1
            long r10 = r10 + r14
            java.lang.Object[] r7 = r0.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r14 = 0
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r7, r12, r14)
            goto L2b
        L3d:
            r0.replayIndex = r1
            r0.minCollectorIndex = r3
            long r10 = r21 - r5
            int r7 = (int) r10
            r0.bufferSize = r7
            long r10 = r23 - r21
            int r7 = (int) r10
            r0.queueSize = r7
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L62
            r7 = 0
            int r10 = r0.bufferSize
            if (r10 < 0) goto L58
            r7 = r8
            goto L59
        L58:
            r7 = r9
        L59:
            if (r7 == 0) goto L5c
            goto L62
        L5c:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L62:
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L79
            r7 = 0
            int r10 = r0.queueSize
            if (r10 < 0) goto L6f
            r7 = r8
            goto L70
        L6f:
            r7 = r9
        L70:
            if (r7 == 0) goto L73
            goto L79
        L73:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L79:
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L99
            r7 = 0
            long r10 = r0.replayIndex
            long r12 = r16.getHead()
            int r14 = r0.bufferSize
            long r14 = (long) r14
            long r12 = r12 + r14
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 > 0) goto L8f
            goto L90
        L8f:
            r8 = r9
        L90:
            if (r8 == 0) goto L93
            goto L99
        L93:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L99:
            return
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r2, kotlin.coroutines.Continuation<?> r3) {
            r1 = this;
            java.lang.Object r0 = collect$suspendImpl(r1, r2, r3)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.SharedFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.SharedFlowSlot r0 = new kotlinx.coroutines.flow.SharedFlowSlot
            r0.<init>()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.SharedFlowSlot r0 = r1.createSlot()
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.SharedFlowSlot[] createSlotArray(int r2) {
            r1 = this;
            kotlinx.coroutines.flow.SharedFlowSlot[] r0 = new kotlinx.coroutines.flow.SharedFlowSlot[r2]
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] createSlotArray(int r2) {
            r1 = this;
            kotlinx.coroutines.flow.SharedFlowSlot[] r0 = r1.createSlotArray(r2)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            java.lang.Object r0 = emit$suspendImpl(r1, r2, r3)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.flow.SharedFlow r0 = (kotlinx.coroutines.flow.SharedFlow) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.SharedFlowKt.fuseSharedFlow(r0, r2, r3, r4)
            return r0
    }

    protected final T getLastReplayedLocked() {
            r5 = this;
            java.lang.Object[] r0 = r5.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            long r1 = r5.replayIndex
            int r3 = r5.getReplaySize()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            java.lang.Object r0 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r1)
            return r0
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public java.util.List<T> getReplayCache() {
            r12 = this;
            r0 = 0
            monitor-enter(r12)
            r1 = 0
            int r2 = r12.getReplaySize()     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto Lf
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r12)
            return r3
        Lf:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L35
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.Object[] r4 = r12.buffer     // Catch: java.lang.Throwable -> L35
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.lang.Throwable -> L35
            r5 = 0
        L1a:
            if (r5 >= r2) goto L2e
            r6 = r5
            int r5 = r5 + 1
            r7 = r3
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Throwable -> L35
            long r8 = r12.replayIndex     // Catch: java.lang.Throwable -> L35
            long r10 = (long) r6     // Catch: java.lang.Throwable -> L35
            long r8 = r8 + r10
            java.lang.Object r8 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r4, r8)     // Catch: java.lang.Throwable -> L35
            r7.add(r8)     // Catch: java.lang.Throwable -> L35
            goto L1a
        L2e:
            monitor-exit(r12)
            r0 = r3
            java.util.List r0 = (java.util.List) r0
            return r0
        L35:
            r1 = move-exception
            monitor-exit(r12)
            throw r1
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
            r11 = this;
            r0 = 0
            monitor-enter(r11)
            r1 = 0
            long r3 = r11.getBufferEndIndex()     // Catch: java.lang.Throwable -> L1c
            long r5 = r11.minCollectorIndex     // Catch: java.lang.Throwable -> L1c
            long r7 = r11.getBufferEndIndex()     // Catch: java.lang.Throwable -> L1c
            long r9 = r11.getQueueEndIndex()     // Catch: java.lang.Throwable -> L1c
            r2 = r11
            r2.updateBufferLocked(r3, r5, r7, r9)     // Catch: java.lang.Throwable -> L1c
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r11)
            return
        L1c:
            r1 = move-exception
            monitor-exit(r11)
            throw r1
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T r7) {
            r6 = this;
            r0 = 0
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            r1 = 0
            monitor-enter(r6)
            r2 = 0
            boolean r3 = r6.tryEmitLocked(r7)     // Catch: java.lang.Throwable -> L30
            r4 = 0
            if (r3 == 0) goto L14
            kotlin.coroutines.Continuation[] r3 = r6.findSlotsToResumeLocked(r0)     // Catch: java.lang.Throwable -> L30
            r0 = r3
            r3 = 1
            goto L15
        L14:
            r3 = r4
        L15:
            monitor-exit(r6)
            r1 = r3
            int r2 = r0.length
        L1a:
            if (r4 >= r2) goto L2f
            r3 = r0[r4]
            int r4 = r4 + 1
            if (r3 != 0) goto L23
            goto L1a
        L23:
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            java.lang.Object r5 = kotlin.Result.m8669constructorimpl(r5)
            r3.resumeWith(r5)
            goto L1a
        L2f:
            return r1
        L30:
            r2 = move-exception
            monitor-exit(r6)
            throw r2
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long r27) {
            r26 = this;
            r9 = r26
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L1b
            r0 = 0
            long r1 = r9.minCollectorIndex
            int r1 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r1 < 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L15
            goto L1b
        L15:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1b:
            long r0 = r9.minCollectorIndex
            int r0 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r0 <= 0) goto L24
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            return r0
        L24:
            long r12 = r26.getHead()
            r0 = 0
            int r2 = r9.bufferSize
            long r2 = (long) r2
            long r2 = r2 + r12
            int r0 = r9.bufferCapacity
            r4 = 1
            if (r0 != 0) goto L39
            int r0 = r9.queueSize
            if (r0 <= 0) goto L39
            long r2 = r2 + r4
        L39:
            r0 = r9
            kotlinx.coroutines.flow.internal.AbstractSharedFlow r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlow) r0
            r1 = 0
            int r6 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(r0)
            if (r6 != 0) goto L46
            r20 = r12
            goto L7f
        L46:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r6 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(r0)
            if (r6 != 0) goto L4f
            r20 = r12
            goto L7e
        L4f:
            r7 = 0
            int r8 = r6.length
            r14 = 0
        L52:
            if (r14 >= r8) goto L7c
            r15 = r6[r14]
            int r14 = r14 + 1
            r16 = r15
            r17 = 0
            if (r16 == 0) goto L77
            r10 = r16
            kotlinx.coroutines.flow.SharedFlowSlot r10 = (kotlinx.coroutines.flow.SharedFlowSlot) r10
            r19 = 0
            r20 = r12
            long r11 = r10.index
            r22 = 0
            int r11 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r11 < 0) goto L76
            long r11 = r10.index
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 >= 0) goto L76
            long r2 = r10.index
        L76:
            goto L79
        L77:
            r20 = r12
        L79:
            r12 = r20
            goto L52
        L7c:
            r20 = r12
        L7e:
        L7f:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L98
            r0 = 0
            long r6 = r9.minCollectorIndex
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 < 0) goto L8e
            r0 = 1
            goto L8f
        L8e:
            r0 = 0
        L8f:
            if (r0 == 0) goto L92
            goto L98
        L92:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L98:
            long r0 = r9.minCollectorIndex
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto La1
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            return r0
        La1:
            long r0 = r26.getBufferEndIndex()
            int r6 = r26.getNCollectors()
            if (r6 <= 0) goto Lb8
            long r6 = r0 - r2
            int r6 = (int) r6
            int r7 = r9.queueSize
            int r8 = r9.bufferCapacity
            int r8 = r8 - r6
            int r6 = java.lang.Math.min(r7, r8)
            goto Lba
        Lb8:
            int r6 = r9.queueSize
        Lba:
            r10 = r6
            kotlin.coroutines.Continuation<kotlin.Unit>[] r6 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            int r7 = r9.queueSize
            long r7 = (long) r7
            long r11 = r0 + r7
            if (r10 <= 0) goto L118
            kotlin.coroutines.Continuation[] r6 = new kotlin.coroutines.Continuation[r10]
            r7 = 0
            java.lang.Object[] r8 = r9.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            r13 = r0
        Lcd:
            int r15 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r15 >= 0) goto L115
            r15 = r0
            long r0 = r0 + r4
            r4 = r15
            java.lang.Object r15 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r8, r4)
            r16 = r0
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            if (r15 == r0) goto L110
            if (r15 == 0) goto L108
            r0 = r15
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r0 = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) r0
            int r0 = r7 + 1
            r1 = r15
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r1 = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) r1
            kotlin.coroutines.Continuation<kotlin.Unit> r1 = r1.cont
            r6[r7] = r1
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r8, r4, r1)
            r1 = r15
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r1 = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) r1
            java.lang.Object r1 = r1.value
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r8, r13, r1)
            r22 = 1
            long r13 = r13 + r22
            if (r0 < r10) goto L102
            r0 = r13
            r13 = r6
            goto L119
        L102:
            r7 = r0
            r0 = r16
            r4 = 1
            goto Lcd
        L108:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter"
            r0.<init>(r1)
            throw r0
        L110:
            r0 = r16
            r4 = 1
            goto Lcd
        L115:
            r0 = r13
            r13 = r6
            goto L119
        L118:
            r13 = r6
        L119:
            long r4 = r0 - r20
            int r14 = (int) r4
            int r4 = r26.getNCollectors()
            if (r4 != 0) goto L123
            r2 = r0
        L123:
            r15 = r2
            long r2 = r9.replayIndex
            int r4 = r9.replay
            int r4 = java.lang.Math.min(r4, r14)
            long r4 = (long) r4
            long r4 = r0 - r4
            long r2 = java.lang.Math.max(r2, r4)
            int r4 = r9.bufferCapacity
            if (r4 != 0) goto L155
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 >= 0) goto L155
            java.lang.Object[] r4 = r9.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Object r4 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r4, r2)
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L155
            r4 = 1
            long r0 = r0 + r4
            long r2 = r2 + r4
            r22 = r0
            r24 = r2
            goto L159
        L155:
            r22 = r0
            r24 = r2
        L159:
            r0 = r26
            r1 = r24
            r3 = r15
            r5 = r22
            r7 = r11
            r0.updateBufferLocked(r1, r3, r5, r7)
            r26.cleanupTailLocked()
            int r0 = r13.length
            if (r0 != 0) goto L16d
            r18 = 1
            goto L16f
        L16d:
            r18 = 0
        L16f:
            if (r18 != 0) goto L175
            kotlin.coroutines.Continuation[] r13 = r9.findSlotsToResumeLocked(r13)
        L175:
            return r13
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
            r4 = this;
            long r0 = r4.replayIndex
            long r2 = r4.minCollectorIndex
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto La
            r4.minCollectorIndex = r0
        La:
            return r0
    }
}
