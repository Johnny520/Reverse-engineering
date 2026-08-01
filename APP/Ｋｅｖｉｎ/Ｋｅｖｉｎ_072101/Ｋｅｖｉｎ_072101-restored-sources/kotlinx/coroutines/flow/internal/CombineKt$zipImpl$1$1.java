package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H\u008a@"}, m115d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", m125f = "Combine.kt", m126i = {0}, m127l = {129}, m128m = "invokeSuspend", m129n = {"second"}, m130s = {"L$0"})
final class CombineKt$zipImpl$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T1> $flow;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T2> $flow2;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
    final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    int label;


    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 */
    /* JADX INFO: compiled from: Combine.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, m115d2 = {"<anonymous>", "", "T1", "T2", "R", "it"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", m125f = "Combine.kt", m126i = {}, m127l = {130}, m128m = "invokeSuspend", m129n = {}, m130s = {})
    static final class C10052 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.Object $cnt;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T1> $flow;
        final /* synthetic */ kotlin.coroutines.CoroutineContext $scopeContext;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
        final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m115d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
        static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
            final /* synthetic */ java.lang.Object $cnt;
            final /* synthetic */ kotlin.coroutines.CoroutineContext $scopeContext;
            final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
            final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, m115d2 = {"<anonymous>", "", "T1", "T2", "R", "it"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", m125f = "Combine.kt", m126i = {}, m127l = {132, 135, 135}, m128m = "invokeSuspend", m129n = {}, m130s = {})
            static final class C11221 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
                final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
                final /* synthetic */ T1 $value;
                java.lang.Object L$0;
                int label;

                C11221(kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> r2, kotlinx.coroutines.flow.FlowCollector<? super R> r3, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4, T1 r5, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.C10052.AnonymousClass1.C11221> r6) {
                        r1 = this;
                        r1.$second = r2
                        r1.$this_unsafeFlow = r3
                        r1.$transform = r4
                        r1.$value = r5
                        r0 = 2
                        r1.<init>(r0, r6)
                        return
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r8, kotlin.coroutines.Continuation<?> r9) {
                        r7 = this;
                        kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r6 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r7.$second
                        kotlinx.coroutines.flow.FlowCollector<R> r2 = r7.$this_unsafeFlow
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r3 = r7.$transform
                        T1 r4 = r7.$value
                        r0 = r6
                        r5 = r9
                        r0.<init>(r1, r2, r3, r4, r5)
                        kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                        return r6
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.Unit r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                        r1 = this;
                        kotlin.Unit r2 = (kotlin.Unit) r2
                        kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                        java.lang.Object r0 = r1.invoke2(r2, r3)
                        return r0
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final java.lang.Object invoke2(kotlin.Unit r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                        r2 = this;
                        kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                        kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.C10052.AnonymousClass1.C11221) r0
                        kotlin.Unit r1 = kotlin.Unit.INSTANCE
                        java.lang.Object r0 = r0.invokeSuspend(r1)
                        return r0
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                        r10 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r10.label
                        r2 = 0
                        switch(r1) {
                            case 0: goto L30;
                            case 1: goto L24;
                            case 2: goto L18;
                            case 3: goto L12;
                            default: goto La;
                        }
                    La:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L12:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r11)
                        goto L8b
                    L18:
                        r1 = r10
                        java.lang.Object r3 = r1.L$0
                        kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                        kotlin.ResultKt.throwOnFailure(r11)
                        r4 = r3
                        r3 = r1
                        r1 = r11
                        goto L7a
                    L24:
                        r1 = r10
                        kotlin.ResultKt.throwOnFailure(r11)
                        r3 = r11
                        kotlinx.coroutines.channels.ChannelResult r3 = (kotlinx.coroutines.channels.ChannelResult) r3
                        java.lang.Object r3 = r3.m10191unboximpl()
                        goto L43
                    L30:
                        kotlin.ResultKt.throwOnFailure(r11)
                        r1 = r10
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r3 = r1.$second
                        r4 = r1
                        kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                        r5 = 1
                        r1.label = r5
                        java.lang.Object r3 = r3.mo10172receiveCatchingJP2dKIU(r4)
                        if (r3 != r0) goto L43
                        return r0
                    L43:
                        kotlinx.coroutines.flow.FlowCollector<R> r4 = r1.$this_unsafeFlow
                        r5 = 0
                        boolean r6 = r3 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
                        if (r6 == 0) goto L5c
                        java.lang.Throwable r0 = kotlinx.coroutines.channels.ChannelResult.m10183exceptionOrNullimpl(r3)
                        r2 = 0
                        if (r0 != 0) goto L5a
                        kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r6.<init>(r4)
                        java.lang.Throwable r6 = (java.lang.Throwable) r6
                        goto L5b
                    L5a:
                        r6 = r0
                    L5b:
                        throw r6
                    L5c:
                        kotlinx.coroutines.flow.FlowCollector<R> r4 = r1.$this_unsafeFlow
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r5 = r1.$transform
                        T1 r6 = r1.$value
                        kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                        r8 = 0
                        if (r3 != r7) goto L6a
                        r3 = r2
                    L6a:
                        r1.L$0 = r4
                        r7 = 2
                        r1.label = r7
                        java.lang.Object r3 = r5.invoke(r6, r3, r1)
                        if (r3 != r0) goto L76
                        return r0
                    L76:
                        r9 = r1
                        r1 = r11
                        r11 = r3
                        r3 = r9
                    L7a:
                        r5 = r3
                        kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                        r3.L$0 = r2
                        r2 = 3
                        r3.label = r2
                        java.lang.Object r11 = r4.emit(r11, r5)
                        if (r11 != r0) goto L89
                        return r0
                    L89:
                        r11 = r1
                        r0 = r3
                    L8b:
                        kotlin.Unit r1 = kotlin.Unit.INSTANCE
                        return r1
                }
            }

            AnonymousClass1(kotlin.coroutines.CoroutineContext r1, java.lang.Object r2, kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> r3, kotlinx.coroutines.flow.FlowCollector<? super R> r4, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
                    r0 = this;
                    r0.$scopeContext = r1
                    r0.$cnt = r2
                    r0.$second = r3
                    r0.$this_unsafeFlow = r4
                    r0.$transform = r5
                    r0.<init>()
                    return
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final java.lang.Object emit(T1 r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
                    r12 = this;
                    boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    if (r0 == 0) goto L14
                    r0 = r14
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r14 = r0.label
                    int r14 = r14 - r2
                    r0.label = r14
                    goto L19
                L14:
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    r0.<init>(r12, r14)
                L19:
                    r14 = r0
                    java.lang.Object r0 = r14.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r14.label
                    switch(r2) {
                        case 0: goto L31;
                        case 1: goto L2d;
                        default: goto L25;
                    }
                L25:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L2d:
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto L55
                L31:
                    kotlin.ResultKt.throwOnFailure(r0)
                    r2 = r12
                    r7 = r13
                    kotlin.coroutines.CoroutineContext r13 = r2.$scopeContext
                    kotlin.Unit r9 = kotlin.Unit.INSTANCE
                    java.lang.Object r10 = r2.$cnt
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r11 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                    kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r4 = r2.$second
                    kotlinx.coroutines.flow.FlowCollector<R> r5 = r2.$this_unsafeFlow
                    kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r6 = r2.$transform
                    r8 = 0
                    r3 = r11
                    r3.<init>(r4, r5, r6, r7, r8)
                    kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
                    r3 = 1
                    r14.label = r3
                    java.lang.Object r13 = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched(r13, r9, r10, r11, r14)
                    if (r13 != r1) goto L55
                    return r1
                L55:
                    kotlin.Unit r13 = kotlin.Unit.INSTANCE
                    return r13
            }
        }

        C10052(kotlinx.coroutines.flow.Flow<? extends T1> r2, kotlin.coroutines.CoroutineContext r3, java.lang.Object r4, kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> r5, kotlinx.coroutines.flow.FlowCollector<? super R> r6, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.C10052> r8) {
                r1 = this;
                r1.$flow = r2
                r1.$scopeContext = r3
                r1.$cnt = r4
                r1.$second = r5
                r1.$this_unsafeFlow = r6
                r1.$transform = r7
                r0 = 2
                r1.<init>(r0, r8)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r10, kotlin.coroutines.Continuation<?> r11) {
                r9 = this;
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r8 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2
                kotlinx.coroutines.flow.Flow<T1> r1 = r9.$flow
                kotlin.coroutines.CoroutineContext r2 = r9.$scopeContext
                java.lang.Object r3 = r9.$cnt
                kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r4 = r9.$second
                kotlinx.coroutines.flow.FlowCollector<R> r5 = r9.$this_unsafeFlow
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r6 = r9.$transform
                r0 = r8
                r7 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                return r8
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.Unit r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.Unit r2 = (kotlin.Unit) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.Unit r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.C10052) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                switch(r1) {
                    case 0: goto L16;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L11:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r11)
                goto L3c
            L16:
                kotlin.ResultKt.throwOnFailure(r11)
                r1 = r10
                kotlinx.coroutines.flow.Flow<T1> r2 = r1.$flow
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1 r9 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1
                kotlin.coroutines.CoroutineContext r4 = r1.$scopeContext
                java.lang.Object r5 = r1.$cnt
                kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r1.$second
                kotlinx.coroutines.flow.FlowCollector<R> r7 = r1.$this_unsafeFlow
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r1.$transform
                r3 = r9
                r3.<init>(r4, r5, r6, r7, r8)
                kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                r3 = r1
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r4 = 1
                r1.label = r4
                java.lang.Object r2 = r2.collect(r9, r3)
                if (r2 != r0) goto L3b
                return r0
            L3b:
                r0 = r1
            L3c:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    CombineKt$zipImpl$1$1(kotlinx.coroutines.flow.FlowCollector<? super R> r2, kotlinx.coroutines.flow.Flow<? extends T2> r3, kotlinx.coroutines.flow.Flow<? extends T1> r4, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1> r6) {
            r1 = this;
            r1.$this_unsafeFlow = r2
            r1.$flow2 = r3
            r1.$flow = r4
            r1.$transform = r5
            r0 = 2
            r1.<init>(r0, r6)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r8, kotlin.coroutines.Continuation<?> r9) {
            r7 = this;
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1 r6 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1
            kotlinx.coroutines.flow.FlowCollector<R> r1 = r7.$this_unsafeFlow
            kotlinx.coroutines.flow.Flow<T2> r2 = r7.$flow2
            kotlinx.coroutines.flow.Flow<T1> r3 = r7.$flow
            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r7.$transform
            r0 = r6
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.L$0 = r8
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            return r6
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r1.invoke2(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            r24 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = r24
            int r2 = r1.label
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L29;
                case 1: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L15:
            r2 = r24
            r5 = r25
            java.lang.Object r0 = r2.L$0
            r6 = r0
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L23 kotlinx.coroutines.flow.internal.AbortFlowException -> L26
            goto La2
        L23:
            r0 = move-exception
            goto Lb4
        L26:
            r0 = move-exception
            goto Lab
        L29:
            kotlin.ResultKt.throwOnFailure(r25)
            r2 = r24
            r5 = r25
            java.lang.Object r6 = r2.L$0
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r7 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            kotlinx.coroutines.flow.Flow<T2> r8 = r2.$flow2
            r7.<init>(r8, r4)
            r10 = r7
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            r7 = r6
            kotlinx.coroutines.channels.ReceiveChannel r7 = kotlinx.coroutines.channels.ProduceKt.produce$default(r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.CompletableJob r8 = kotlinx.coroutines.JobKt.Job$default(r4, r3, r4)
            r9 = r7
            kotlinx.coroutines.channels.SendChannel r9 = (kotlinx.coroutines.channels.SendChannel) r9
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1 r10 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1
            kotlinx.coroutines.flow.FlowCollector<R> r11 = r2.$this_unsafeFlow
            r10.<init>(r8, r11)
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r9.invokeOnClose(r10)
            kotlin.coroutines.CoroutineContext r15 = r6.getCoroutineContext()     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            java.lang.Object r16 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r15)     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            kotlin.coroutines.CoroutineContext r9 = r6.getCoroutineContext()     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            r10 = r8
            kotlin.coroutines.CoroutineContext r10 = (kotlin.coroutines.CoroutineContext) r10     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            kotlin.coroutines.CoroutineContext r9 = r9.plus(r10)     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r11 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            kotlinx.coroutines.flow.Flow<T1> r14 = r2.$flow     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            kotlinx.coroutines.flow.FlowCollector<R> r12 = r2.$this_unsafeFlow     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r13 = r2.$transform     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            r20 = 0
            r19 = r13
            r13 = r11
            r17 = r7
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            r20 = r11
            kotlin.jvm.functions.Function2 r20 = (kotlin.jvm.functions.Function2) r20     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            r21 = r2
            kotlin.coroutines.Continuation r21 = (kotlin.coroutines.Continuation) r21     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            r2.L$0 = r7     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            r2.label = r3     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            r19 = 0
            r22 = 4
            r23 = 0
            r17 = r9
            r18 = r10
            java.lang.Object r9 = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched$default(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> La6 kotlinx.coroutines.flow.internal.AbortFlowException -> La9
            if (r9 != r0) goto La1
            return r0
        La1:
            r6 = r7
        La2:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r6, r4, r3, r4)
            goto Lb1
        La6:
            r0 = move-exception
            r6 = r7
            goto Lb4
        La9:
            r0 = move-exception
            r6 = r7
        Lab:
            kotlinx.coroutines.flow.FlowCollector<R> r7 = r2.$this_unsafeFlow     // Catch: java.lang.Throwable -> L23
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r0, r7)     // Catch: java.lang.Throwable -> L23
            goto La2
        Lb1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lb4:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r6, r4, r3, r4)
            throw r0
    }
}
