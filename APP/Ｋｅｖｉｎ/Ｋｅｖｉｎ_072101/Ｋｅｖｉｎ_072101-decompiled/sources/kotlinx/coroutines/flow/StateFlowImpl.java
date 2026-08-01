package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u0010062\b\u0012\u0004\u0012\u00028\u0000072\b\u0012\u0004\u0012\u00028\u0000082\b\u0012\u0004\u0012\u00028\u000009B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u00022\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010\u000fR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R*\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b4\u0010%\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, m115d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expect", "update", "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/StateFlowSlot;", "createSlot", "()Lkotlinx/coroutines/flow/StateFlowSlot;", "", "size", "", "createSlotArray", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "fuse", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "resetReplayCache", "()V", "tryEmit", "(Ljava/lang/Object;)Z", "expectedState", "newState", "updateState", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "sequence", "I", "getValue", "()Ljava/lang/Object;", "setValue", "getValue$annotations", "kotlinx-coroutines-core", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
final class StateFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.StateFlowSlot> implements kotlinx.coroutines.flow.MutableStateFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {
    private volatile /* synthetic */ java.lang.Object _state;
    private int sequence;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1 */
    /* JADX INFO: compiled from: StateFlow.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.StateFlowImpl", m125f = "StateFlow.kt", m126i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m127l = {386, 398, 403}, m128m = "collect", m129n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, m130s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class C09961 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.StateFlowImpl<T> this$0;

        C09961(kotlinx.coroutines.flow.StateFlowImpl<T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlowImpl.C09961> r2) {
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
                kotlinx.coroutines.flow.StateFlowImpl<T> r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.collect(r1, r2)
                return r0
        }
    }

    public StateFlowImpl(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0._state = r1
            return
    }

    public static /* synthetic */ void getValue$annotations() {
            return
    }

    private final boolean updateState(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            r0 = 0
            r1 = 0
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r1 = r11.getSlots()
            r2 = 0
            monitor-enter(r11)
            r3 = 0
            java.lang.Object r4 = r11._state     // Catch: java.lang.Throwable -> L77
            r5 = 0
            if (r12 == 0) goto L16
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r12)     // Catch: java.lang.Throwable -> L77
            if (r6 != 0) goto L16
            monitor-exit(r11)
            return r5
        L16:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r13)     // Catch: java.lang.Throwable -> L77
            r7 = 1
            if (r6 == 0) goto L1f
            monitor-exit(r11)
            return r7
        L1f:
            r11._state = r13     // Catch: java.lang.Throwable -> L77
            int r6 = r11.sequence     // Catch: java.lang.Throwable -> L77
            r0 = r6
            r6 = r0 & 1
            if (r6 != 0) goto L70
            int r0 = r0 + 1
            r11.sequence = r0     // Catch: java.lang.Throwable -> L77
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r6 = r11.getSlots()     // Catch: java.lang.Throwable -> L77
            r1 = r6
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L77
            monitor-exit(r11)
        L36:
            r2 = r1
            kotlinx.coroutines.flow.StateFlowSlot[] r2 = (kotlinx.coroutines.flow.StateFlowSlot[]) r2
            if (r2 != 0) goto L3d
            goto L51
        L3d:
            r3 = 0
            int r4 = r2.length
            r6 = r5
        L40:
            if (r6 >= r4) goto L50
            r8 = r2[r6]
            int r6 = r6 + 1
            r9 = r8
            r10 = 0
            if (r9 != 0) goto L4b
            goto L4e
        L4b:
            r9.makePending()
        L4e:
            goto L40
        L50:
        L51:
            r2 = 0
            monitor-enter(r11)
            r3 = 0
            int r4 = r11.sequence     // Catch: java.lang.Throwable -> L6d
            if (r4 != r0) goto L5f
            int r4 = r0 + 1
            r11.sequence = r4     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r11)
            return r7
        L5f:
            int r4 = r11.sequence     // Catch: java.lang.Throwable -> L6d
            r0 = r4
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r4 = r11.getSlots()     // Catch: java.lang.Throwable -> L6d
            r1 = r4
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r11)
            goto L36
        L6d:
            r3 = move-exception
            monitor-exit(r11)
            throw r3
        L70:
            int r5 = r0 + 2
            r11.sequence = r5     // Catch: java.lang.Throwable -> L77
            monitor-exit(r11)
            return r7
        L77:
            r3 = move-exception
            monitor-exit(r11)
            throw r3
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r11, kotlin.coroutines.Continuation<?> r12) {
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.StateFlowImpl.C09961
            if (r0 == 0) goto L14
            r0 = r12
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.StateFlowImpl.C09961) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r0.<init>(r10, r12)
        L19:
            r12 = r0
            java.lang.Object r0 = r12.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r12.label
            switch(r2) {
                case 0: goto L6e;
                case 1: goto L5b;
                case 2: goto L44;
                case 3: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2d:
            java.lang.Object r11 = r12.L$4
            java.lang.Object r2 = r12.L$3
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r3 = r12.L$2
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            java.lang.Object r4 = r12.L$1
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r5 = r12.L$0
            kotlinx.coroutines.flow.StateFlowImpl r5 = (kotlinx.coroutines.flow.StateFlowImpl) r5
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> Lf1
            goto Lf0
        L44:
            java.lang.Object r11 = r12.L$4
            java.lang.Object r2 = r12.L$3
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r3 = r12.L$2
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            java.lang.Object r4 = r12.L$1
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r5 = r12.L$0
            kotlinx.coroutines.flow.StateFlowImpl r5 = (kotlinx.coroutines.flow.StateFlowImpl) r5
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> Lf1
            goto Ld4
        L5b:
            java.lang.Object r11 = r12.L$2
            r3 = r11
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            java.lang.Object r11 = r12.L$1
            r4 = r11
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r11 = r12.L$0
            r5 = r11
            kotlinx.coroutines.flow.StateFlowImpl r5 = (kotlinx.coroutines.flow.StateFlowImpl) r5
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> Lf1
            goto L92
        L6e:
            kotlin.ResultKt.throwOnFailure(r0)
            r5 = r10
            r4 = r11
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r11 = r5.allocateSlot()
            r3 = r11
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            boolean r11 = r4 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch: java.lang.Throwable -> Lf1
            if (r11 == 0) goto L93
            r11 = r4
            kotlinx.coroutines.flow.SubscribedFlowCollector r11 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r11     // Catch: java.lang.Throwable -> Lf1
            r12.L$0 = r5     // Catch: java.lang.Throwable -> Lf1
            r12.L$1 = r4     // Catch: java.lang.Throwable -> Lf1
            r12.L$2 = r3     // Catch: java.lang.Throwable -> Lf1
            r2 = 1
            r12.label = r2     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r11 = r11.onSubscription(r12)     // Catch: java.lang.Throwable -> Lf1
            if (r11 != r1) goto L92
            return r1
        L92:
        L93:
            r11 = 0
            kotlin.coroutines.CoroutineContext r2 = r12.getContext()     // Catch: java.lang.Throwable -> Lf1
            kotlinx.coroutines.Job$Key r11 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> Lf1
            kotlin.coroutines.CoroutineContext$Key r11 = (kotlin.coroutines.CoroutineContext.Key) r11     // Catch: java.lang.Throwable -> Lf1
            kotlin.coroutines.CoroutineContext$Element r11 = r2.get(r11)     // Catch: java.lang.Throwable -> Lf1
            kotlinx.coroutines.Job r11 = (kotlinx.coroutines.Job) r11     // Catch: java.lang.Throwable -> Lf1
            r2 = 0
            r9 = r2
            r2 = r11
            r11 = r9
        La6:
            java.lang.Object r6 = r5._state     // Catch: java.lang.Throwable -> Lf1
            if (r2 != 0) goto Lac
            goto Laf
        Lac:
            kotlinx.coroutines.JobKt.ensureActive(r2)     // Catch: java.lang.Throwable -> Lf1
        Laf:
            if (r11 == 0) goto Lb7
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r6)     // Catch: java.lang.Throwable -> Lf1
            if (r7 != 0) goto Ld6
        Lb7:
            kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL     // Catch: java.lang.Throwable -> Lf1
            r7 = 0
            if (r6 != r11) goto Lbe
            r8 = 0
            goto Lbf
        Lbe:
            r8 = r6
        Lbf:
            r12.L$0 = r5     // Catch: java.lang.Throwable -> Lf1
            r12.L$1 = r4     // Catch: java.lang.Throwable -> Lf1
            r12.L$2 = r3     // Catch: java.lang.Throwable -> Lf1
            r12.L$3 = r2     // Catch: java.lang.Throwable -> Lf1
            r12.L$4 = r6     // Catch: java.lang.Throwable -> Lf1
            r11 = 2
            r12.label = r11     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r11 = r4.emit(r8, r12)     // Catch: java.lang.Throwable -> Lf1
            if (r11 != r1) goto Ld3
            return r1
        Ld3:
            r11 = r6
        Ld4:
            r6 = r11
            r11 = r6
        Ld6:
            boolean r6 = r3.takePending()     // Catch: java.lang.Throwable -> Lf1
            if (r6 != 0) goto La6
            r12.L$0 = r5     // Catch: java.lang.Throwable -> Lf1
            r12.L$1 = r4     // Catch: java.lang.Throwable -> Lf1
            r12.L$2 = r3     // Catch: java.lang.Throwable -> Lf1
            r12.L$3 = r2     // Catch: java.lang.Throwable -> Lf1
            r12.L$4 = r11     // Catch: java.lang.Throwable -> Lf1
            r6 = 3
            r12.label = r6     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r6 = r3.awaitPending(r12)     // Catch: java.lang.Throwable -> Lf1
            if (r6 != r1) goto Lf0
            return r1
        Lf0:
            goto La6
        Lf1:
            r11 = move-exception
            r1 = r3
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r1 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r1
            r5.freeSlot(r1)
            throw r11
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(T r3, T r4) {
            r2 = this;
            if (r3 != 0) goto L5
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            goto L6
        L5:
            r0 = r3
        L6:
            if (r4 != 0) goto Lb
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            goto Lc
        Lb:
            r1 = r4
        Lc:
            boolean r0 = r2.updateState(r0, r1)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.StateFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.StateFlowSlot r0 = new kotlinx.coroutines.flow.StateFlowSlot
            r0.<init>()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.StateFlowSlot r0 = r1.createSlot()
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.StateFlowSlot[] createSlotArray(int r2) {
            r1 = this;
            kotlinx.coroutines.flow.StateFlowSlot[] r0 = new kotlinx.coroutines.flow.StateFlowSlot[r2]
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] createSlotArray(int r2) {
            r1 = this;
            kotlinx.coroutines.flow.StateFlowSlot[] r0 = r1.createSlotArray(r2)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            r1.setValue(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.flow.StateFlow r0 = (kotlinx.coroutines.flow.StateFlow) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.StateFlowKt.fuseStateFlow(r0, r2, r3, r4)
            return r0
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public java.util.List<T> getReplayCache() {
            r1 = this;
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            return r0
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
            r4 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            java.lang.Object r1 = r4._state
            r2 = 0
            if (r1 != r0) goto L9
            r3 = 0
            r1 = r3
        L9:
            return r1
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "MutableStateFlow.resetReplayCache is not supported"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T r3) {
            r2 = this;
            if (r3 != 0) goto L5
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            goto L6
        L5:
            r0 = r3
        L6:
            r1 = 0
            r2.updateState(r1, r0)
            return
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T r2) {
            r1 = this;
            r1.setValue(r2)
            r0 = 1
            return r0
    }
}
