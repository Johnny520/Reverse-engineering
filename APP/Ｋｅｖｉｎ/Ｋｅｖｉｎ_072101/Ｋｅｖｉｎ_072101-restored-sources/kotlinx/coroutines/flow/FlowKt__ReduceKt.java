package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a!\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aE\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a#\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aG\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001ay\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\r\u001a\u0002H\f2H\b\u0004\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a!\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a#\u0010\u0016\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001as\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u0018\"\b\b\u0001\u0010\u0001*\u0002H\u0018*\b\u0012\u0004\u0012\u0002H\u00010\u00022F\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a!\u0010\u001b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a#\u0010\u001c\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m115d2 = {"first", "T", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "acc", "value", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastOrNull", "reduce", "S", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "single", "singleOrNull", "kotlinx-coroutines-core"}, m116k = 5, m117mv = {1, 6, 0}, m119xi = 48, m120xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m125f = "Reduce.kt", m126i = {0, 0}, m127l = {183}, m128m = "first", m129n = {"result", "collector$iv"}, m130s = {"L$0", "L$1"})
    static final class C09451<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C09451(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C09451> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m125f = "Reduce.kt", m126i = {0, 0, 0}, m127l = {183}, m128m = "first", m129n = {"predicate", "result", "collector$iv"}, m130s = {"L$0", "L$1", "L$2"})
    static final class C09463<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C09463(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C09463> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m125f = "Reduce.kt", m126i = {0, 0}, m127l = {183}, m128m = "firstOrNull", m129n = {"result", "collector$iv"}, m130s = {"L$0", "L$1"})
    static final class C09481<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C09481(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C09481> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m125f = "Reduce.kt", m126i = {0, 0}, m127l = {183}, m128m = "firstOrNull", m129n = {"result", "collector$iv"}, m130s = {"L$0", "L$1"})
    static final class C09493<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C09493(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C09493> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m125f = "Reduce.kt", m126i = {0}, m127l = {44}, m128m = "fold", m129n = {"accumulator"}, m130s = {"L$0"})
    static final class C09501<T, R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C09501(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C09501> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.fold(r0, r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m115d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 176)
    public static final class C09512<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<R> $accumulator;
        final /* synthetic */ kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $operation;

        public C09512(kotlin.jvm.internal.Ref.ObjectRef<R> r1, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
                r0 = this;
                r0.$accumulator = r1
                r0.$operation = r2
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
                if (r0 == 0) goto L14
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r9 = r0.label
                int r9 = r9 - r2
                r0.label = r9
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
                r0.<init>(r7, r9)
            L19:
                r9 = r0
                java.lang.Object r0 = r9.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r9.label
                switch(r2) {
                    case 0: goto L36;
                    case 1: goto L2d;
                    default: goto L25;
                }
            L25:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2d:
                java.lang.Object r8 = r9.L$0
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                kotlin.ResultKt.throwOnFailure(r0)
                r1 = r0
                goto L50
            L36:
                kotlin.ResultKt.throwOnFailure(r0)
                r2 = r7
                kotlin.jvm.internal.Ref$ObjectRef<R> r3 = r2.$accumulator
                kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r2.$operation
                kotlin.jvm.internal.Ref$ObjectRef<R> r5 = r2.$accumulator
                T r5 = r5.element
                r9.L$0 = r3
                r6 = 1
                r9.label = r6
                java.lang.Object r8 = r4.invoke(r5, r8, r9)
                if (r8 != r1) goto L4e
                return r1
            L4e:
                r1 = r8
                r8 = r3
            L50:
                r8.element = r1
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }

        public final java.lang.Object emit$$forInline(T r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r3 = this;
                r0 = 4
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
                r0.<init>(r3, r5)
                r0 = 5
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlin.jvm.internal.Ref$ObjectRef<R> r0 = r3.$accumulator
                kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r3.$operation
                kotlin.jvm.internal.Ref$ObjectRef<R> r2 = r3.$accumulator
                T r2 = r2.element
                java.lang.Object r1 = r1.invoke(r2, r4, r5)
                r0.element = r1
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m125f = "Reduce.kt", m126i = {0}, m127l = {155}, m128m = "last", m129n = {"result"}, m130s = {"L$0"})
    static final class C09521<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C09521(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C09521> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.last(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$last$2 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m115d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    static final class C09532<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $result;

        C09532(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r1) {
                r0 = this;
                r0.$result = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r0 = r1.$result
                r0.element = r2
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m125f = "Reduce.kt", m126i = {0}, m127l = {167}, m128m = "lastOrNull", m129n = {"result"}, m130s = {"L$0"})
    static final class C09541<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C09541(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C09541> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.lastOrNull(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$2 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m115d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    static final class C09552<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<T> $result;

        C09552(kotlin.jvm.internal.Ref.ObjectRef<T> r1) {
                r0 = this;
                r0.$result = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.jvm.internal.Ref$ObjectRef<T> r0 = r1.$result
                r0.element = r2
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m125f = "Reduce.kt", m126i = {0}, m127l = {22}, m128m = "reduce", m129n = {"accumulator"}, m130s = {"L$0"})
    static final class C09561<S, T extends S> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C09561(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C09561> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.reduce(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m115d2 = {"<anonymous>", "", "S", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    static final class C09572<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $accumulator;
        final /* synthetic */ kotlin.jvm.functions.Function3<S, T, kotlin.coroutines.Continuation<? super S>, java.lang.Object> $operation;

        C09572(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r1, kotlin.jvm.functions.Function3<? super S, ? super T, ? super kotlin.coroutines.Continuation<? super S>, ? extends java.lang.Object> r2) {
                r0 = this;
                r0.$accumulator = r1
                r0.$operation = r2
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1
                if (r0 == 0) goto L14
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r9 = r0.label
                int r9 = r9 - r2
                r0.label = r9
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1
                r0.<init>(r7, r9)
            L19:
                r9 = r0
                java.lang.Object r0 = r9.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r9.label
                switch(r2) {
                    case 0: goto L38;
                    case 1: goto L2d;
                    default: goto L25;
                }
            L25:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2d:
                java.lang.Object r1 = r9.L$0
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                kotlin.ResultKt.throwOnFailure(r0)
                r3 = r1
                r1 = r8
                r8 = r0
                goto L5a
            L38:
                kotlin.ResultKt.throwOnFailure(r0)
                r2 = r7
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r3 = r2.$accumulator
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r4 = r2.$accumulator
                T r4 = r4.element
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                if (r4 == r5) goto L5c
                kotlin.jvm.functions.Function3<S, T, kotlin.coroutines.Continuation<? super S>, java.lang.Object> r4 = r2.$operation
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r5 = r2.$accumulator
                T r5 = r5.element
                r9.L$0 = r3
                r6 = 1
                r9.label = r6
                java.lang.Object r2 = r4.invoke(r5, r8, r9)
                if (r2 != r1) goto L58
                return r1
            L58:
                r1 = r8
                r8 = r2
            L5a:
                goto L5d
            L5c:
                r1 = r8
            L5d:
                r3.element = r8
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m125f = "Reduce.kt", m126i = {0}, m127l = {57}, m128m = "single", m129n = {"result"}, m130s = {"L$0"})
    static final class C09581<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C09581(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C09581> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.single(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$2 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m115d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    static final class C09592<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $result;

        C09592(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r1) {
                r0 = this;
                r0.$result = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r0 = r2.$result
                T r0 = r0.element
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                if (r0 != r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L14
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r0 = r2.$result
                r0.element = r3
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L14:
                r0 = 0
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Flow has more than one element"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m125f = "Reduce.kt", m126i = {0, 0}, m127l = {183}, m128m = "singleOrNull", m129n = {"result", "collector$iv"}, m130s = {"L$0", "L$1"})
    static final class C09601<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C09601(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C09601> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.singleOrNull(r0, r1)
                return r0
        }
    }

    public static final <T> java.lang.Object first(kotlinx.coroutines.flow.Flow<? extends T> r8, kotlin.coroutines.Continuation<? super T> r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C09451
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C09451) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            r0.<init>(r9)
        L19:
            r9 = r0
            java.lang.Object r0 = r9.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            switch(r2) {
                case 0: goto L3c;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2d:
            r8 = 0
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1) r1
            java.lang.Object r2 = r9.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3a
            goto L63
        L3a:
            r3 = move-exception
            goto L69
        L3c:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r3
            r3 = 0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1 r4 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
            r4.<init>(r2)
            r5 = r4
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            r9.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            r9.L$1 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            r6 = 1
            r9.label = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            java.lang.Object r5 = r8.collect(r5, r9)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            if (r5 != r1) goto L61
            return r1
        L61:
            r8 = r3
            r1 = r4
        L63:
            goto L6f
        L64:
            r8 = move-exception
            r1 = r4
            r7 = r3
            r3 = r8
            r8 = r7
        L69:
            r4 = r1
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r3, r4)
        L6f:
            T r8 = r2.element
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r8 == r1) goto L79
            T r8 = r2.element
            return r8
        L79:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r1 = "Expected at least one element"
            r8.<init>(r1)
            throw r8
    }

    public static final <T> java.lang.Object first(kotlinx.coroutines.flow.Flow<? extends T> r8, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r9, kotlin.coroutines.Continuation<? super T> r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C09463
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C09463) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r0.<init>(r10)
        L19:
            r10 = r0
            java.lang.Object r0 = r10.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r10.label
            switch(r2) {
                case 0: goto L40;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2d:
            r8 = 0
            java.lang.Object r9 = r10.L$2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r9 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) r9
            java.lang.Object r1 = r10.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r2 = r10.L$0
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3e
            goto L6b
        L3e:
            r3 = move-exception
            goto L72
        L40:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = r9
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r9.element = r3
            r3 = 0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r4 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2
            r4.<init>(r2, r9)
            r5 = r4
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6c
            r10.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6c
            r10.L$1 = r9     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6c
            r10.L$2 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6c
            r6 = 1
            r10.label = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6c
            java.lang.Object r5 = r8.collect(r5, r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6c
            if (r5 != r1) goto L68
            return r1
        L68:
            r1 = r9
            r8 = r3
            r9 = r4
        L6b:
            goto L78
        L6c:
            r8 = move-exception
            r1 = r9
            r9 = r4
            r7 = r3
            r3 = r8
            r8 = r7
        L72:
            r4 = r9
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r3, r4)
        L78:
            T r8 = r1.element
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r8 == r9) goto L82
            T r8 = r1.element
            return r8
        L82:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r9 = "Expected at least one element matching the predicate "
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.stringPlus(r9, r2)
            r8.<init>(r9)
            throw r8
    }

    public static final <T> java.lang.Object firstOrNull(kotlinx.coroutines.flow.Flow<? extends T> r8, kotlin.coroutines.Continuation<? super T> r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C09481
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C09481) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1
            r0.<init>(r9)
        L19:
            r9 = r0
            java.lang.Object r0 = r9.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            switch(r2) {
                case 0: goto L3c;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2d:
            r8 = 0
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) r1
            java.lang.Object r2 = r9.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3a
            goto L5f
        L3a:
            r3 = move-exception
            goto L65
        L3c:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r3 = 0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1 r4 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
            r4.<init>(r2)
            r5 = r4
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r9.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r9.L$1 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r6 = 1
            r9.label = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            java.lang.Object r5 = r8.collect(r5, r9)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            if (r5 != r1) goto L5d
            return r1
        L5d:
            r8 = r3
            r1 = r4
        L5f:
            goto L6b
        L60:
            r8 = move-exception
            r1 = r4
            r7 = r3
            r3 = r8
            r8 = r7
        L65:
            r4 = r1
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r3, r4)
        L6b:
            T r8 = r2.element
            return r8
    }

    public static final <T> java.lang.Object firstOrNull(kotlinx.coroutines.flow.Flow<? extends T> r6, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super T> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C09493
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C09493) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            r0.<init>(r8)
        L19:
            r8 = r0
            java.lang.Object r0 = r8.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r8.label
            switch(r2) {
                case 0: goto L3c;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            r6 = 0
            java.lang.Object r7 = r8.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r7 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) r7
            java.lang.Object r1 = r8.L$0
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3a
            goto L60
        L3a:
            r2 = move-exception
            goto L66
        L3c:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r3 = 0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r4 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2
            r4.<init>(r7, r2)
            r7 = r4
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            r8.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            r8.L$1 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            r5 = 1
            r8.label = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            java.lang.Object r7 = r6.collect(r7, r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r1 = r2
            r6 = r3
            r7 = r4
        L60:
            goto L6c
        L61:
            r6 = move-exception
            r1 = r2
            r7 = r4
            r2 = r6
            r6 = r3
        L66:
            r3 = r7
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r2, r3)
        L6c:
            T r6 = r1.element
            return r6
    }

    public static final <T, R> java.lang.Object fold(kotlinx.coroutines.flow.Flow<? extends T> r5, R r6, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super R> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C09501
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C09501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1
            r0.<init>(r8)
        L19:
            r8 = r0
            java.lang.Object r0 = r8.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r8.label
            switch(r2) {
                case 0: goto L36;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            r5 = 0
            java.lang.Object r6 = r8.L$0
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
            kotlin.ResultKt.throwOnFailure(r0)
            goto L56
        L36:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = 0
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            r3.element = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2 r6 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2
            r6.<init>(r3, r7)
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            r8.L$0 = r3
            r4 = 1
            r8.label = r4
            java.lang.Object r5 = r5.collect(r6, r8)
            if (r5 != r1) goto L54
            return r1
        L54:
            r5 = r2
            r6 = r3
        L56:
            T r7 = r6.element
            return r7
    }

    private static final <T, R> java.lang.Object fold$$forInline(kotlinx.coroutines.flow.Flow<? extends T> r4, R r5, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super R> r7) {
            r0 = 0
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            r1.element = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2
            r2.<init>(r1, r6)
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)
            r4.collect(r2, r7)
            r2 = 1
            kotlin.jvm.internal.InlineMarker.mark(r2)
            T r2 = r1.element
            return r2
    }

    public static final <T> java.lang.Object last(kotlinx.coroutines.flow.Flow<? extends T> r5, kotlin.coroutines.Continuation<? super T> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C09521
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C09521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1
            r0.<init>(r6)
        L19:
            r6 = r0
            java.lang.Object r0 = r6.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            switch(r2) {
                case 0: goto L35;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r6.L$0
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L55
        L35:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r3
            kotlinx.coroutines.flow.FlowKt__ReduceKt$last$2 r3 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$last$2
            r3.<init>(r2)
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            r6.L$0 = r2
            r4 = 1
            r6.label = r4
            java.lang.Object r5 = r5.collect(r3, r6)
            if (r5 != r1) goto L54
            return r1
        L54:
            r5 = r2
        L55:
            T r1 = r5.element
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r1 == r2) goto L5e
            T r1 = r5.element
            return r1
        L5e:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Expected at least one element"
            r1.<init>(r2)
            throw r1
    }

    public static final <T> java.lang.Object lastOrNull(kotlinx.coroutines.flow.Flow<? extends T> r5, kotlin.coroutines.Continuation<? super T> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C09541
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C09541) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1
            r0.<init>(r6)
        L19:
            r6 = r0
            java.lang.Object r0 = r6.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            switch(r2) {
                case 0: goto L35;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r6.L$0
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L51
        L35:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$2 r3 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$2
            r3.<init>(r2)
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            r6.L$0 = r2
            r4 = 1
            r6.label = r4
            java.lang.Object r5 = r5.collect(r3, r6)
            if (r5 != r1) goto L50
            return r1
        L50:
            r5 = r2
        L51:
            T r1 = r5.element
            return r1
    }

    public static final <S, T extends S> java.lang.Object reduce(kotlinx.coroutines.flow.Flow<? extends T> r5, kotlin.jvm.functions.Function3<? super S, ? super T, ? super kotlin.coroutines.Continuation<? super S>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super S> r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C09561
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C09561) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1
            r0.<init>(r7)
        L19:
            r7 = r0
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.label
            switch(r2) {
                case 0: goto L35;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r7.L$0
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L55
        L35:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r3
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2 r3 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2
            r3.<init>(r2, r6)
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            r7.L$0 = r2
            r4 = 1
            r7.label = r4
            java.lang.Object r5 = r5.collect(r3, r7)
            if (r5 != r1) goto L54
            return r1
        L54:
            r5 = r2
        L55:
            T r6 = r5.element
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r6 == r1) goto L5e
            T r6 = r5.element
            return r6
        L5e:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r1 = "Empty flow can't be reduced"
            r6.<init>(r1)
            throw r6
    }

    public static final <T> java.lang.Object single(kotlinx.coroutines.flow.Flow<? extends T> r5, kotlin.coroutines.Continuation<? super T> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C09581
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C09581) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1
            r0.<init>(r6)
        L19:
            r6 = r0
            java.lang.Object r0 = r6.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            switch(r2) {
                case 0: goto L35;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r6.L$0
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L55
        L35:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r3
            kotlinx.coroutines.flow.FlowKt__ReduceKt$single$2 r3 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$single$2
            r3.<init>(r2)
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            r6.L$0 = r2
            r4 = 1
            r6.label = r4
            java.lang.Object r5 = r5.collect(r3, r6)
            if (r5 != r1) goto L54
            return r1
        L54:
            r5 = r2
        L55:
            T r1 = r5.element
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r1 == r2) goto L5e
            T r1 = r5.element
            return r1
        L5e:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Flow is empty"
            r1.<init>(r2)
            throw r1
    }

    public static final <T> java.lang.Object singleOrNull(kotlinx.coroutines.flow.Flow<? extends T> r8, kotlin.coroutines.Continuation<? super T> r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C09601
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C09601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1
            r0.<init>(r9)
        L19:
            r9 = r0
            java.lang.Object r0 = r9.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            switch(r2) {
                case 0: goto L3c;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2d:
            r8 = 0
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1) r1
            java.lang.Object r2 = r9.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3a
            goto L63
        L3a:
            r3 = move-exception
            goto L69
        L3c:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r3
            r3 = 0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 r4 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
            r4.<init>(r2)
            r5 = r4
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            r9.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            r9.L$1 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            r6 = 1
            r9.label = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            java.lang.Object r5 = r8.collect(r5, r9)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            if (r5 != r1) goto L61
            return r1
        L61:
            r8 = r3
            r1 = r4
        L63:
            goto L6f
        L64:
            r8 = move-exception
            r1 = r4
            r7 = r3
            r3 = r8
            r8 = r7
        L69:
            r4 = r1
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r3, r4)
        L6f:
            T r8 = r2.element
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r8 != r1) goto L78
            r8 = 0
            goto L7a
        L78:
            T r8 = r2.element
        L7a:
            return r8
    }
}
