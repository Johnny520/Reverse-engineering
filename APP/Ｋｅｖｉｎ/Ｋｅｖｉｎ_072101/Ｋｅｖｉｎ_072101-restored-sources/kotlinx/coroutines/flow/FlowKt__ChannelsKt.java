package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a/\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a9\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m115d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/channels/BroadcastChannel;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", "", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", "", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "receiveAsFlow", "kotlinx-coroutines-core"}, m116k = 5, m117mv = {1, 6, 0}, m119xi = 48, m120xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ChannelsKt {
    public static final /* synthetic */ java.lang.Object access$emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector r1, kotlinx.coroutines.channels.ReceiveChannel r2, boolean r3, kotlin.coroutines.Continuation r4) {
            java.lang.Object r0 = emitAllImpl$FlowKt__ChannelsKt(r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(kotlinx.coroutines.channels.BroadcastChannel<T> r2) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1
            r1.<init>(r2)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> consumeAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> r9) {
            kotlinx.coroutines.flow.ChannelAsFlow r8 = new kotlinx.coroutines.flow.ChannelAsFlow
            r6 = 28
            r7 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
            return r8
    }

    public static final <T> java.lang.Object emitAll(kotlinx.coroutines.flow.FlowCollector<? super T> r2, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r0 = 1
            java.lang.Object r0 = emitAllImpl$FlowKt__ChannelsKt(r2, r3, r0, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Lc
            return r0
        Lc:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final <T> java.lang.Object emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector<? super T> r7, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r8, boolean r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L19:
            r10 = r0
            java.lang.Object r0 = r10.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r10.label
            switch(r2) {
                case 0: goto L5e;
                case 1: goto L40;
                case 2: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2d:
            boolean r7 = r10.Z$0
            r8 = 0
            java.lang.Object r9 = r10.L$1
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r2 = r10.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L3d
            goto Lb4
        L3d:
            r1 = move-exception
            goto Lb9
        L40:
            r7 = 0
            boolean r8 = r10.Z$0
            java.lang.Object r9 = r10.L$1
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r2 = r10.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            r3 = 0
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L57
            r4 = r0
            kotlinx.coroutines.channels.ChannelResult r4 = (kotlinx.coroutines.channels.ChannelResult) r4     // Catch: java.lang.Throwable -> L57
            java.lang.Object r4 = r4.m10191unboximpl()     // Catch: java.lang.Throwable -> L57
            goto L81
        L57:
            r1 = move-exception
            r7 = r3
            r6 = r8
            r8 = r7
            r7 = r6
            goto Lb9
        L5e:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.flow.FlowKt.ensureActive(r7)
            r2 = 0
            r6 = r2
            r2 = r7
            r7 = r9
            r9 = r8
            r8 = r6
        L6a:
            r3 = 0
            r10.L$0 = r2     // Catch: java.lang.Throwable -> L3d
            r10.L$1 = r9     // Catch: java.lang.Throwable -> L3d
            r10.Z$0 = r7     // Catch: java.lang.Throwable -> L3d
            r4 = 1
            r10.label = r4     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r4 = r9.mo10172receiveCatchingJP2dKIU(r10)     // Catch: java.lang.Throwable -> L3d
            if (r4 != r1) goto L7d
            return r1
        L7d:
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L81:
            r7 = r3
            r3 = r4
            boolean r4 = kotlinx.coroutines.channels.ChannelResult.m10187isClosedimpl(r3)     // Catch: java.lang.Throwable -> Lb5
            if (r4 == 0) goto L9d
            java.lang.Throwable r1 = kotlinx.coroutines.channels.ChannelResult.m10183exceptionOrNullimpl(r3)     // Catch: java.lang.Throwable -> Lb5
            if (r1 != 0) goto L9a
        L91:
            if (r8 == 0) goto L96
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r7)
        L96:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L9a:
            r3 = 0
            throw r1     // Catch: java.lang.Throwable -> Lb5
        L9d:
            java.lang.Object r4 = kotlinx.coroutines.channels.ChannelResult.m10185getOrThrowimpl(r3)     // Catch: java.lang.Throwable -> Lb5
            r10.L$0 = r2     // Catch: java.lang.Throwable -> Lb5
            r10.L$1 = r9     // Catch: java.lang.Throwable -> Lb5
            r10.Z$0 = r8     // Catch: java.lang.Throwable -> Lb5
            r5 = 2
            r10.label = r5     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r4 = r2.emit(r4, r10)     // Catch: java.lang.Throwable -> Lb5
            if (r4 != r1) goto Lb1
            return r1
        Lb1:
            r6 = r8
            r8 = r7
            r7 = r6
        Lb4:
            goto L6a
        Lb5:
            r1 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        Lb9:
            r8 = r1
            throw r1     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r1 = move-exception
            if (r7 == 0) goto Lc2
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r8)
        Lc2:
            throw r1
    }

    public static final <T> kotlinx.coroutines.channels.ReceiveChannel<T> produceIn(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.CoroutineScope r2) {
            kotlinx.coroutines.flow.internal.ChannelFlow r0 = kotlinx.coroutines.flow.internal.ChannelFlowKt.asChannelFlow(r1)
            kotlinx.coroutines.channels.ReceiveChannel r0 = r0.produceImpl(r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> receiveAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> r9) {
            kotlinx.coroutines.flow.ChannelAsFlow r8 = new kotlinx.coroutines.flow.ChannelAsFlow
            r6 = 28
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
            return r8
    }
}
