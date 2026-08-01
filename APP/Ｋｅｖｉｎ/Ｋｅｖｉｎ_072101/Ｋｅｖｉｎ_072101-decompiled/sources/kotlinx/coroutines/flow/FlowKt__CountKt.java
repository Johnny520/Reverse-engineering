package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Count.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001aE\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m115d2 = {"count", "", "T", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m116k = 5, m117mv = {1, 6, 0}, m119xi = 48, m120xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__CountKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$1 */
    /* JADX INFO: compiled from: Count.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__CountKt", m125f = "Count.kt", m126i = {0}, m127l = {18}, m128m = "count", m129n = {"i"}, m130s = {"L$0"})
    static final class C09091<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C09091(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__CountKt.C09091> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.count(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$2 */
    /* JADX INFO: compiled from: Count.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m115d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    static final class C09102<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {

        /* JADX INFO: renamed from: $i */
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef f76$i;

        C09102(kotlin.jvm.internal.Ref.IntRef r1) {
                r0 = this;
                r0.f76$i = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.jvm.internal.Ref$IntRef r0 = r2.f76$i
                kotlin.jvm.internal.Ref$IntRef r1 = r2.f76$i
                int r1 = r1.element
                int r1 = r1 + 1
                r0.element = r1
                kotlin.jvm.internal.Ref$IntRef r0 = r2.f76$i
                int r0 = r0.element
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$3 */
    /* JADX INFO: compiled from: Count.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__CountKt", m125f = "Count.kt", m126i = {0}, m127l = {30}, m128m = "count", m129n = {"i"}, m130s = {"L$0"})
    static final class C09113<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C09113(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__CountKt.C09113> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.count(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$4 */
    /* JADX INFO: compiled from: Count.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m115d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    static final class C09124<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {

        /* JADX INFO: renamed from: $i */
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef f77$i;
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;

        C09124(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1, kotlin.jvm.internal.Ref.IntRef r2) {
                r0 = this;
                r0.$predicate = r1
                r0.f77$i = r2
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1
                if (r0 == 0) goto L14
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r7 = r0.label
                int r7 = r7 - r2
                r0.label = r7
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1
                r0.<init>(r5, r7)
            L19:
                r7 = r0
                java.lang.Object r0 = r7.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r7.label
                r3 = 1
                switch(r2) {
                    case 0: goto L38;
                    case 1: goto L2e;
                    default: goto L26;
                }
            L26:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2e:
                java.lang.Object r6 = r7.L$0
                kotlinx.coroutines.flow.FlowKt__CountKt$count$4 r6 = (kotlinx.coroutines.flow.FlowKt__CountKt.C09124) r6
                kotlin.ResultKt.throwOnFailure(r0)
                r2 = r6
                r6 = r0
                goto L49
            L38:
                kotlin.ResultKt.throwOnFailure(r0)
                r2 = r5
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r4 = r2.$predicate
                r7.L$0 = r2
                r7.label = r3
                java.lang.Object r6 = r4.invoke(r6, r7)
                if (r6 != r1) goto L49
                return r1
            L49:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5e
                kotlin.jvm.internal.Ref$IntRef r6 = r2.f77$i
                kotlin.jvm.internal.Ref$IntRef r1 = r2.f77$i
                int r1 = r1.element
                int r1 = r1 + r3
                r6.element = r1
                kotlin.jvm.internal.Ref$IntRef r6 = r2.f77$i
                int r6 = r6.element
            L5e:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
        }
    }

    public static final <T> java.lang.Object count(kotlinx.coroutines.flow.Flow<? extends T> r5, kotlin.coroutines.Continuation<? super java.lang.Integer> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__CountKt.C09091
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__CountKt$count$1 r0 = (kotlinx.coroutines.flow.FlowKt__CountKt.C09091) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__CountKt$count$1 r0 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$1
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
            kotlin.jvm.internal.Ref$IntRef r5 = (kotlin.jvm.internal.Ref.IntRef) r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L51
        L35:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlinx.coroutines.flow.FlowKt__CountKt$count$2 r3 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$2
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
            int r1 = r5.element
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            return r1
    }

    public static final <T> java.lang.Object count(kotlinx.coroutines.flow.Flow<? extends T> r5, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super java.lang.Integer> r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__CountKt.C09113
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__CountKt$count$3 r0 = (kotlinx.coroutines.flow.FlowKt__CountKt.C09113) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__CountKt$count$3 r0 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$3
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
            kotlin.jvm.internal.Ref$IntRef r5 = (kotlin.jvm.internal.Ref.IntRef) r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L51
        L35:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlinx.coroutines.flow.FlowKt__CountKt$count$4 r3 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$4
            r3.<init>(r6, r2)
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            r7.L$0 = r2
            r4 = 1
            r7.label = r4
            java.lang.Object r5 = r5.collect(r3, r7)
            if (r5 != r1) goto L50
            return r1
        L50:
            r5 = r2
        L51:
            int r6 = r5.element
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            return r6
    }
}
