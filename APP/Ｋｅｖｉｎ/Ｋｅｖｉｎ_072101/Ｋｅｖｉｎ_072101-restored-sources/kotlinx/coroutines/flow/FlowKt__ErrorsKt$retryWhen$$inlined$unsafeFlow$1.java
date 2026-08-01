package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, m115d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ kotlin.jvm.functions.Function4 $predicate$inlined;
    final /* synthetic */ kotlinx.coroutines.flow.Flow $this_retryWhen$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", m125f = "Errors.kt", m126i = {0, 0, 0, 0, 1, 1, 1, 1}, m127l = {117, 119}, m128m = "collect", m129n = {"this", "$this$retryWhen_u24lambda_u2d2", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u2d2", "cause", "attempt"}, m130s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
    public static final class C09291 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 this$0;

        public C09291(kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r1, kotlin.coroutines.Continuation r2) {
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
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.collect(r1, r2)
                return r0
        }
    }

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(kotlinx.coroutines.flow.Flow r1, kotlin.jvm.functions.Function4 r2) {
            r0 = this;
            r0.$this_retryWhen$inlined = r1
            r0.$predicate$inlined = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
            r13 = this;
            boolean r0 = r15 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.C09291
            if (r0 == 0) goto L14
            r0 = r15
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.C09291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1
            r0.<init>(r13, r15)
        L19:
            r15 = r0
            java.lang.Object r0 = r15.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r15.label
            switch(r2) {
                case 0: goto L5c;
                case 1: goto L47;
                case 2: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2d:
            r14 = 0
            long r2 = r15.J$0
            java.lang.Object r4 = r15.L$2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r5 = r15.L$1
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            java.lang.Object r6 = r15.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r6 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r6
            kotlin.ResultKt.throwOnFailure(r0)
            r7 = r6
            r6 = r5
            r5 = r4
            r3 = r2
            r2 = r1
            r1 = r0
            goto Laf
        L47:
            r14 = 0
            int r2 = r15.I$0
            long r3 = r15.J$0
            java.lang.Object r5 = r15.L$1
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            java.lang.Object r6 = r15.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r6 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r6
            kotlin.ResultKt.throwOnFailure(r0)
            r7 = r6
            r6 = r2
            r2 = r1
            r1 = r0
            goto L87
        L5c:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = r13
            r3 = r15
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r3 = 0
            r4 = 0
        L66:
            r6 = 0
            kotlinx.coroutines.flow.Flow r7 = r2.$this_retryWhen$inlined
            r15.L$0 = r2
            r15.L$1 = r14
            r8 = 0
            r15.L$2 = r8
            r15.J$0 = r4
            r15.I$0 = r6
            r8 = 1
            r15.label = r8
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.catchImpl(r7, r14, r15)
            if (r7 != r1) goto L7e
            return r1
        L7e:
            r10 = r4
            r5 = r14
            r14 = r3
            r3 = r10
            r12 = r1
            r1 = r0
            r0 = r7
            r7 = r2
            r2 = r12
        L87:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto Lc5
            kotlin.jvm.functions.Function4 r6 = r7.$predicate$inlined
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            r15.L$0 = r7
            r15.L$1 = r5
            r15.L$2 = r0
            r15.J$0 = r3
            r9 = 2
            r15.label = r9
            r9 = 6
            kotlin.jvm.internal.InlineMarker.mark(r9)
            java.lang.Object r6 = r6.invoke(r5, r0, r8, r15)
            r8 = 7
            kotlin.jvm.internal.InlineMarker.mark(r8)
            if (r6 != r2) goto Lab
            return r2
        Lab:
            r10 = r5
            r5 = r0
            r0 = r6
            r6 = r10
        Laf:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc4
            r0 = 1
            r8 = 1
            long r3 = r3 + r8
            r4 = r3
            r3 = r14
            r14 = r6
            r6 = r0
            r0 = r1
            r1 = r2
            r2 = r7
            goto Lcc
        Lc4:
            throw r5
        Lc5:
            r0 = r1
            r1 = r2
            r2 = r7
            r10 = r3
            r3 = r14
            r14 = r5
            r4 = r10
        Lcc:
            if (r6 != 0) goto L66
        Lcf:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
    }
}
