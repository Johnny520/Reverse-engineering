package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u001a:\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\b\b\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0007\u001a3\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0002\b\r\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0000\u001a&\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0005H\u0007\u001a3\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m115d2 = {"debounce", "Lkotlinx/coroutines/flow/Flow;", "T", "timeoutMillis", "Lkotlin/Function1;", "", "timeout", "Lkotlin/time/Duration;", "debounceDuration", "debounce-HG0u8IE", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "debounceInternal", "timeoutMillisSelector", "debounceInternal$FlowKt__DelayKt", "fixedPeriodTicker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "Lkotlinx/coroutines/CoroutineScope;", "delayMillis", "initialDelayMillis", "sample", "periodMillis", "period", "sample-HG0u8IE", "kotlinx-coroutines-core"}, m116k = 5, m117mv = {1, 6, 0}, m119xi = 48, m120xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__DelayKt {



    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3 */
    /* JADX INFO: compiled from: Delay.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, m115d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", m125f = "Delay.kt", m126i = {0, 1, 2}, m127l = {314, 316, 317}, m128m = "invokeSuspend", m129n = {"$this$produce", "$this$produce", "$this$produce"}, m130s = {"L$0", "L$0", "L$0"})
    static final class C09163 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ long $initialDelayMillis;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        C09163(long r2, long r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt.C09163> r6) {
                r1 = this;
                r1.$initialDelayMillis = r2
                r1.$delayMillis = r4
                r0 = 2
                r1.<init>(r0, r6)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r8, kotlin.coroutines.Continuation<?> r9) {
                r7 = this;
                kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3 r6 = new kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3
                long r1 = r7.$initialDelayMillis
                long r3 = r7.$delayMillis
                r0 = r6
                r5 = r9
                r0.<init>(r1, r3, r5)
                r6.L$0 = r8
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                return r6
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3 r0 = (kotlinx.coroutines.flow.FlowKt__DelayKt.C09163) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                switch(r1) {
                    case 0: goto L2c;
                    case 1: goto L23;
                    case 2: goto L1a;
                    case 3: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L11:
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r8)
                goto L6c
            L1a:
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r8)
                goto L5b
            L23:
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r8)
                goto L45
            L2c:
                kotlin.ResultKt.throwOnFailure(r8)
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                long r3 = r1.$initialDelayMillis
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r2
                r6 = 1
                r1.label = r6
                java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r3 != r0) goto L45
                return r0
            L45:
            L46:
                kotlinx.coroutines.channels.SendChannel r3 = r2.getChannel()
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r2
                r6 = 2
                r1.label = r6
                java.lang.Object r3 = r3.send(r4, r5)
                if (r3 != r0) goto L5b
                return r0
            L5b:
                long r3 = r1.$delayMillis
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r2
                r6 = 3
                r1.label = r6
                java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r3 != r0) goto L6c
                return r0
            L6c:
                goto L46
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2 */
    /* JADX INFO: compiled from: Delay.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, m115d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", m125f = "Delay.kt", m126i = {0, 0, 0, 0}, m127l = {352}, m128m = "invokeSuspend", m129n = {"downstream", "values", "lastValue", "ticker"}, m130s = {"L$0", "L$1", "L$2", "L$3"})
    static final class C09172<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ long $periodMillis;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_sample;
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;

        C09172(long r2, kotlinx.coroutines.flow.Flow<? extends T> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt.C09172> r5) {
                r1 = this;
                r1.$periodMillis = r2
                r1.$this_sample = r4
                r0 = 3
                r1.<init>(r0, r5)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r2, java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r1 = this;
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                java.lang.Object r0 = r1.invoke(r2, r3, r4)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r5, kotlinx.coroutines.flow.FlowCollector<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                r4 = this;
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2
                long r1 = r4.$periodMillis
                kotlinx.coroutines.flow.Flow<T> r3 = r4.$this_sample
                r0.<init>(r1, r3, r7)
                r0.L$0 = r5
                r0.L$1 = r6
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                r17 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r1 = r17
                int r2 = r1.label
                r3 = 0
                switch(r2) {
                    case 0: goto L35;
                    case 1: goto L14;
                    default: goto Lc;
                }
            Lc:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L14:
                r2 = r17
                r4 = r18
                r5 = 0
                java.lang.Object r6 = r2.L$3
                kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
                java.lang.Object r7 = r2.L$2
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                java.lang.Object r8 = r2.L$1
                kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
                java.lang.Object r9 = r2.L$0
                kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                kotlin.ResultKt.throwOnFailure(r4)
                r15 = r3
                r16 = r2
                r2 = r0
                r0 = r4
                r4 = r16
                goto Ld3
            L35:
                kotlin.ResultKt.throwOnFailure(r18)
                r2 = r17
                r4 = r18
                java.lang.Object r5 = r2.L$0
                kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                java.lang.Object r6 = r2.L$1
                r13 = r6
                kotlinx.coroutines.flow.FlowCollector r13 = (kotlinx.coroutines.flow.FlowCollector) r13
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1 r6 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1
                kotlinx.coroutines.flow.Flow<T> r7 = r2.$this_sample
                r6.<init>(r7, r3)
                r9 = r6
                kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                r10 = 1
                r11 = 0
                r7 = 0
                r8 = -1
                r6 = r5
                kotlinx.coroutines.channels.ReceiveChannel r14 = kotlinx.coroutines.channels.ProduceKt.produce$default(r6, r7, r8, r9, r10, r11)
                kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                r6.<init>()
                r15 = r6
                long r7 = r2.$periodMillis
                r11 = 2
                r12 = 0
                r9 = 0
                r6 = r5
                kotlinx.coroutines.channels.ReceiveChannel r6 = kotlinx.coroutines.flow.FlowKt.fixedPeriodTicker$default(r6, r7, r9, r11, r12)
                r5 = r4
                r9 = r13
                r8 = r14
                r7 = r15
                r4 = r2
                r2 = r0
            L6f:
                T r0 = r7.element
                kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
                if (r0 == r10) goto Ld8
                r10 = 0
                r4.L$0 = r9
                r4.L$1 = r8
                r4.L$2 = r7
                r4.L$3 = r6
                r0 = 1
                r4.label = r0
                r11 = r4
                kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
                r12 = 0
                kotlinx.coroutines.selects.SelectBuilderImpl r0 = new kotlinx.coroutines.selects.SelectBuilderImpl
                r0.<init>(r11)
                r13 = r0
                r0 = r13
                kotlinx.coroutines.selects.SelectBuilder r0 = (kotlinx.coroutines.selects.SelectBuilder) r0     // Catch: java.lang.Throwable -> Lb9
                r14 = 0
                kotlinx.coroutines.selects.SelectClause1 r15 = r8.getOnReceiveCatching()     // Catch: java.lang.Throwable -> Lb9
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1 r3 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1     // Catch: java.lang.Throwable -> Lb6
                r1 = 0
                r3.<init>(r7, r6, r1)     // Catch: java.lang.Throwable -> Lb3
                kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3     // Catch: java.lang.Throwable -> Lb6
                r0.invoke(r15, r3)     // Catch: java.lang.Throwable -> Lb6
                kotlinx.coroutines.selects.SelectClause1 r1 = r6.getOnReceive()     // Catch: java.lang.Throwable -> Lb6
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2 r3 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2     // Catch: java.lang.Throwable -> Lb6
                r15 = 0
                r3.<init>(r7, r9, r15)     // Catch: java.lang.Throwable -> Lb1
                kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3     // Catch: java.lang.Throwable -> Lb1
                r0.invoke(r1, r3)     // Catch: java.lang.Throwable -> Lb1
                goto Lbe
            Lb1:
                r0 = move-exception
                goto Lbb
            Lb3:
                r0 = move-exception
                r15 = r1
                goto Lbb
            Lb6:
                r0 = move-exception
                r15 = 0
                goto Lbb
            Lb9:
                r0 = move-exception
                r15 = r3
            Lbb:
                r13.handleBuilderException(r0)
            Lbe:
                java.lang.Object r0 = r13.getResult()
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r0 != r1) goto Lce
                r1 = r4
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r1)
            Lce:
                if (r0 != r2) goto Ld1
                return r2
            Ld1:
                r0 = r5
                r5 = r10
            Ld3:
                r1 = r17
                r5 = r0
                r3 = r15
                goto L6f
            Ld8:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> r3, long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto L1c
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L10
            return r3
        L10:
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2
            r0.<init>(r4)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlinx.coroutines.flow.Flow r0 = debounceInternal$FlowKt__DelayKt(r3, r0)
            return r0
        L1c:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Debounce timeout should not be negative"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super T, java.lang.Long> r2) {
            kotlinx.coroutines.flow.Flow r0 = debounceInternal$FlowKt__DelayKt(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m10201debounceHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> r2, long r3) {
            long r0 = kotlinx.coroutines.DelayKt.m10159toDelayMillisLRDsOJo(r3)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.debounce(r2, r0)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounceDuration(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super T, kotlin.time.Duration> r2) {
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3
            r0.<init>(r2)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlinx.coroutines.flow.Flow r0 = debounceInternal$FlowKt__DelayKt(r1, r0)
            return r0
    }

    private static final <T> kotlinx.coroutines.flow.Flow<T> debounceInternal$FlowKt__DelayKt(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Long> r3) {
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1
            r1 = 0
            r0.<init>(r3, r2, r1)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(r0)
            return r0
    }

    public static final kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> fixedPeriodTicker(kotlinx.coroutines.CoroutineScope r17, long r18, long r20) {
            r6 = r18
            r8 = r20
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 < 0) goto Le
            r2 = r3
            goto Lf
        Le:
            r2 = r4
        Lf:
            java.lang.String r5 = " ms"
            if (r2 == 0) goto L57
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L18
            goto L19
        L18:
            r3 = r4
        L19:
            if (r3 == 0) goto L35
            kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3 r10 = new kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3
            r5 = 0
            r0 = r10
            r1 = r20
            r3 = r18
            r0.<init>(r1, r3, r5)
            r14 = r10
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r15 = 1
            r16 = 0
            r12 = 0
            r13 = 0
            r11 = r17
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r11, r12, r13, r14, r15, r16)
            return r0
        L35:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected non-negative initial delay, but has "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L57:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected non-negative delay, but has "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel fixedPeriodTicker$default(kotlinx.coroutines.CoroutineScope r0, long r1, long r3, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r3 = r1
        L5:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.flow.FlowKt.fixedPeriodTicker(r0, r1, r3)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> sample(kotlinx.coroutines.flow.Flow<? extends T> r2, long r3) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L18
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2
            r1 = 0
            r0.<init>(r3, r2, r1)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(r0)
            return r0
        L18:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Sample period should be positive"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m10202sampleHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> r2, long r3) {
            long r0 = kotlinx.coroutines.DelayKt.m10159toDelayMillisLRDsOJo(r3)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.sample(r2, r0)
            return r0
    }
}
