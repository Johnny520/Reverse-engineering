package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, m115d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m125f = "Delay.kt", m126i = {0, 0, 0, 0, 1, 1, 1, 1}, m127l = {222, 355}, m128m = "invokeSuspend", m129n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue", "timeoutMillis"}, m130s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
final class FlowKt__DelayKt$debounceInternal$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_debounceInternal;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Long> $timeoutMillisSelector;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    FlowKt__DelayKt$debounceInternal$1(kotlin.jvm.functions.Function1<? super T, java.lang.Long> r2, kotlinx.coroutines.flow.Flow<? extends T> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1> r4) {
            r1 = this;
            r1.$timeoutMillisSelector = r2
            r1.$this_debounceInternal = r3
            r0 = 3
            r1.<init>(r0, r4)
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

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r4, kotlinx.coroutines.flow.FlowCollector<? super T> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1
            kotlin.jvm.functions.Function1<T, java.lang.Long> r1 = r3.$timeoutMillisSelector
            kotlinx.coroutines.flow.Flow<T> r2 = r3.$this_debounceInternal
            r0.<init>(r1, r2, r6)
            r0.L$0 = r4
            r0.L$1 = r5
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            r18 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = r18
            int r2 = r1.label
            r4 = 0
            r6 = 1
            r7 = 0
            switch(r2) {
                case 0: goto L4a;
                case 1: goto L31;
                case 2: goto L17;
                default: goto Lf;
            }
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L17:
            r2 = r18
            r8 = r19
            r9 = 0
            java.lang.Object r10 = r2.L$3
            kotlin.jvm.internal.Ref$LongRef r10 = (kotlin.jvm.internal.Ref.LongRef) r10
            java.lang.Object r10 = r2.L$2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r11 = r2.L$1
            kotlinx.coroutines.channels.ReceiveChannel r11 = (kotlinx.coroutines.channels.ReceiveChannel) r11
            java.lang.Object r12 = r2.L$0
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            kotlin.ResultKt.throwOnFailure(r8)
            goto L165
        L31:
            r2 = r18
            r8 = r19
            java.lang.Object r9 = r2.L$3
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref.LongRef) r9
            java.lang.Object r10 = r2.L$2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r11 = r2.L$1
            kotlinx.coroutines.channels.ReceiveChannel r11 = (kotlinx.coroutines.channels.ReceiveChannel) r11
            java.lang.Object r12 = r2.L$0
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            kotlin.ResultKt.throwOnFailure(r8)
            goto Lc9
        L4a:
            kotlin.ResultKt.throwOnFailure(r19)
            r2 = r18
            r8 = r19
            java.lang.Object r9 = r2.L$0
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            java.lang.Object r10 = r2.L$1
            r16 = r10
            kotlinx.coroutines.flow.FlowCollector r16 = (kotlinx.coroutines.flow.FlowCollector) r16
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1 r10 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1
            kotlinx.coroutines.flow.Flow<T> r11 = r2.$this_debounceInternal
            r10.<init>(r11, r7)
            r13 = r10
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r14 = 3
            r15 = 0
            r11 = 0
            r12 = 0
            r10 = r9
            kotlinx.coroutines.channels.ReceiveChannel r9 = kotlinx.coroutines.channels.ProduceKt.produce$default(r10, r11, r12, r13, r14, r15)
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r11 = r9
            r12 = r16
        L76:
            T r9 = r10.element
            kotlinx.coroutines.internal.Symbol r13 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
            if (r9 == r13) goto L16a
            kotlin.jvm.internal.Ref$LongRef r9 = new kotlin.jvm.internal.Ref$LongRef
            r9.<init>()
            T r13 = r10.element
            if (r13 == 0) goto Le1
            kotlin.jvm.functions.Function1<T, java.lang.Long> r13 = r2.$timeoutMillisSelector
            kotlinx.coroutines.internal.Symbol r14 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            T r15 = r10.element
            r16 = 0
            if (r15 != r14) goto L90
            r15 = r7
        L90:
            java.lang.Object r13 = r13.invoke(r15)
            java.lang.Number r13 = (java.lang.Number) r13
            long r13 = r13.longValue()
            r9.element = r13
            long r13 = r9.element
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 < 0) goto La4
            r13 = r6
            goto La5
        La4:
            r13 = 0
        La5:
            if (r13 == 0) goto Ld3
            long r13 = r9.element
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 != 0) goto Le1
            kotlinx.coroutines.internal.Symbol r13 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            T r14 = r10.element
            r15 = 0
            if (r14 != r13) goto Lb5
            r14 = r7
        Lb5:
            r13 = r2
            kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13
            r2.L$0 = r12
            r2.L$1 = r11
            r2.L$2 = r10
            r2.L$3 = r9
            r2.label = r6
            java.lang.Object r13 = r12.emit(r14, r13)
            if (r13 != r0) goto Lc9
            return r0
        Lc9:
            r10.element = r7
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r2
            r2 = r0
            goto Le8
        Ld3:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Debounce timeout should not be negative"
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        Le1:
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r2
            r2 = r0
        Le8:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L106
            r0 = 0
            T r14 = r11.element
            if (r14 == 0) goto Lfc
            long r14 = r10.element
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 <= 0) goto Lfa
            goto Lfc
        Lfa:
            r0 = 0
            goto Lfd
        Lfc:
            r0 = r6
        Lfd:
            if (r0 == 0) goto L100
            goto L106
        L100:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L106:
            r14 = 0
            r8.L$0 = r13
            r8.L$1 = r12
            r8.L$2 = r11
            r8.L$3 = r10
            r0 = 2
            r8.label = r0
            r15 = r8
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            r16 = 0
            kotlinx.coroutines.selects.SelectBuilderImpl r0 = new kotlinx.coroutines.selects.SelectBuilderImpl
            r0.<init>(r15)
            r19 = r0
            r3 = r19
            r0 = r3
            kotlinx.coroutines.selects.SelectBuilder r0 = (kotlinx.coroutines.selects.SelectBuilder) r0     // Catch: java.lang.Throwable -> L147
            r17 = 0
            T r4 = r11.element     // Catch: java.lang.Throwable -> L147
            if (r4 == 0) goto L137
            long r4 = r10.element     // Catch: java.lang.Throwable -> L147
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r6 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1     // Catch: java.lang.Throwable -> L147
            r6.<init>(r13, r11, r7)     // Catch: java.lang.Throwable -> L147
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6     // Catch: java.lang.Throwable -> L147
            r0.onTimeout(r4, r6)     // Catch: java.lang.Throwable -> L147
        L137:
            kotlinx.coroutines.selects.SelectClause1 r4 = r12.getOnReceiveCatching()     // Catch: java.lang.Throwable -> L147
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r5 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2     // Catch: java.lang.Throwable -> L147
            r5.<init>(r11, r13, r7)     // Catch: java.lang.Throwable -> L147
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5     // Catch: java.lang.Throwable -> L147
            r0.invoke(r4, r5)     // Catch: java.lang.Throwable -> L147
            goto L14b
        L147:
            r0 = move-exception
            r3.handleBuilderException(r0)
        L14b:
            java.lang.Object r0 = r3.getResult()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r3) goto L15b
            r3 = r8
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r3)
        L15b:
            if (r0 != r2) goto L15e
            return r2
        L15e:
            r0 = r2
            r2 = r8
            r8 = r9
            r10 = r11
            r11 = r12
            r12 = r13
            r9 = r14
        L165:
            r4 = 0
            r6 = 1
            goto L76
        L16a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
