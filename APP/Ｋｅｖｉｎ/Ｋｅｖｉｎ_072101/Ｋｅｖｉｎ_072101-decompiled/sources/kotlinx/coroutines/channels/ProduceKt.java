package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u009e\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2-\b\u0002\u0010\u0010\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u00162/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001a¨\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2-\b\u0002\u0010\u0010\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u00162/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b\u001aH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001ae\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m115d2 = {"awaitClose", "", "Lkotlinx/coroutines/channels/ProducerScope;", "block", "Lkotlin/Function0;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produce", "Lkotlinx/coroutines/channels/ReceiveChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class ProduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ProduceKt$awaitClose$1 */
    /* JADX INFO: compiled from: Produce.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ProduceKt", m125f = "Produce.kt", m126i = {0, 0}, m127l = {153}, m128m = "awaitClose", m129n = {"$this$awaitClose", "block"}, m130s = {"L$0", "L$1"})
    static final class C08771 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C08771(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ProduceKt.C08771> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r0, r0, r1)
                return r0
        }
    }


    public static final java.lang.Object awaitClose(kotlinx.coroutines.channels.ProducerScope<?> r9, kotlin.jvm.functions.Function0<kotlin.Unit> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ProduceKt.C08771
            if (r0 == 0) goto L14
            r0 = r11
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt.C08771) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r11)
        L19:
            r11 = r0
            java.lang.Object r0 = r11.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r11.label
            switch(r2) {
                case 0: goto L3c;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2d:
            r9 = 0
            java.lang.Object r10 = r11.L$1
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L3a
            goto L8f
        L3a:
            r9 = move-exception
            goto L97
        L3c:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.coroutines.CoroutineContext r2 = r11.getContext()
            kotlinx.coroutines.Job$Key r3 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r3 = (kotlin.coroutines.CoroutineContext.Key) r3
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)
            r3 = 1
            if (r2 != r9) goto L50
            r2 = r3
            goto L51
        L50:
            r2 = 0
        L51:
            if (r2 == 0) goto L9b
        L54:
            r2 = 0
            r11.L$0 = r9     // Catch: java.lang.Throwable -> L3a
            r11.L$1 = r10     // Catch: java.lang.Throwable -> L3a
            r11.label = r3     // Catch: java.lang.Throwable -> L3a
            r4 = r11
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Throwable -> L3a
            r5 = 0
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L3a
            kotlin.coroutines.Continuation r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)     // Catch: java.lang.Throwable -> L3a
            r6.<init>(r7, r3)     // Catch: java.lang.Throwable -> L3a
            r3 = r6
            r3.initCancellability()     // Catch: java.lang.Throwable -> L3a
            r6 = r3
            kotlinx.coroutines.CancellableContinuation r6 = (kotlinx.coroutines.CancellableContinuation) r6     // Catch: java.lang.Throwable -> L3a
            r7 = 0
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r8 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8     // Catch: java.lang.Throwable -> L3a
            r9.invokeOnClose(r8)     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r6 = r3.getResult()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L3a
            if (r6 != r3) goto L8b
            r3 = r11
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3     // Catch: java.lang.Throwable -> L3a
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r3)     // Catch: java.lang.Throwable -> L3a
        L8b:
            if (r6 != r1) goto L8e
            return r1
        L8e:
            r9 = r2
        L8f:
            r10.invoke()
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L97:
            r10.invoke()
            throw r9
        L9b:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ java.lang.Object awaitClose$default(kotlinx.coroutines.channels.ProducerScope r0, kotlin.jvm.functions.Function0 r1, kotlin.coroutines.Continuation r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlinx.coroutines.channels.ProduceKt$awaitClose$2 r1 = kotlinx.coroutines.channels.ProduceKt.C08782.INSTANCE
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
        L8:
            java.lang.Object r0 = awaitClose(r0, r1, r2)
            return r0
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> produce(kotlinx.coroutines.CoroutineScope r7, kotlin.coroutines.CoroutineContext r8, int r9, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10) {
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r10
            kotlinx.coroutines.channels.ReceiveChannel r0 = produce(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> produce(kotlinx.coroutines.CoroutineScope r7, kotlin.coroutines.CoroutineContext r8, int r9, kotlinx.coroutines.CoroutineStart r10, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r11, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r12) {
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            kotlinx.coroutines.channels.ReceiveChannel r0 = produce(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> produce(kotlinx.coroutines.CoroutineScope r4, kotlin.coroutines.CoroutineContext r5, int r6, kotlinx.coroutines.channels.BufferOverflow r7, kotlinx.coroutines.CoroutineStart r8, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r9, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10) {
            r0 = 0
            r1 = 4
            kotlinx.coroutines.channels.Channel r0 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r6, r7, r0, r1, r0)
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r4, r5)
            kotlinx.coroutines.channels.ProducerCoroutine r2 = new kotlinx.coroutines.channels.ProducerCoroutine
            r2.<init>(r1, r0)
            if (r9 == 0) goto L14
            r2.invokeOnCompletion(r9)
        L14:
            r2.start(r8, r2, r10)
            r3 = r2
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            return r3
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel produce$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, int r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        L8:
            r4 = r4 & 2
            if (r4 == 0) goto Ld
            r2 = 0
        Ld:
            kotlinx.coroutines.channels.ReceiveChannel r0 = produce(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel produce$default(kotlinx.coroutines.CoroutineScope r6, kotlin.coroutines.CoroutineContext r7, int r8, kotlinx.coroutines.CoroutineStart r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function2 r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto La
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            r1 = r7
            goto Lb
        La:
            r1 = r7
        Lb:
            r7 = r12 & 2
            if (r7 == 0) goto L12
            r8 = 0
            r2 = r8
            goto L13
        L12:
            r2 = r8
        L13:
            r7 = r12 & 4
            if (r7 == 0) goto L1b
            kotlinx.coroutines.CoroutineStart r9 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r3 = r9
            goto L1c
        L1b:
            r3 = r9
        L1c:
            r7 = r12 & 8
            if (r7 == 0) goto L23
            r10 = 0
            r4 = r10
            goto L24
        L23:
            r4 = r10
        L24:
            r0 = r6
            r5 = r11
            kotlinx.coroutines.channels.ReceiveChannel r6 = produce(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel produce$default(kotlinx.coroutines.CoroutineScope r7, kotlin.coroutines.CoroutineContext r8, int r9, kotlinx.coroutines.channels.BufferOverflow r10, kotlinx.coroutines.CoroutineStart r11, kotlin.jvm.functions.Function1 r12, kotlin.jvm.functions.Function2 r13, int r14, java.lang.Object r15) {
            r15 = r14 & 1
            if (r15 == 0) goto La
            kotlin.coroutines.EmptyCoroutineContext r8 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            r1 = r8
            goto Lb
        La:
            r1 = r8
        Lb:
            r8 = r14 & 2
            if (r8 == 0) goto L12
            r9 = 0
            r2 = r9
            goto L13
        L12:
            r2 = r9
        L13:
            r8 = r14 & 4
            if (r8 == 0) goto L1b
            kotlinx.coroutines.channels.BufferOverflow r10 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r3 = r10
            goto L1c
        L1b:
            r3 = r10
        L1c:
            r8 = r14 & 8
            if (r8 == 0) goto L24
            kotlinx.coroutines.CoroutineStart r11 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r4 = r11
            goto L25
        L24:
            r4 = r11
        L25:
            r8 = r14 & 16
            if (r8 == 0) goto L2c
            r12 = 0
            r5 = r12
            goto L2d
        L2c:
            r5 = r12
        L2d:
            r0 = r7
            r6 = r13
            kotlinx.coroutines.channels.ReceiveChannel r7 = produce(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }
}
