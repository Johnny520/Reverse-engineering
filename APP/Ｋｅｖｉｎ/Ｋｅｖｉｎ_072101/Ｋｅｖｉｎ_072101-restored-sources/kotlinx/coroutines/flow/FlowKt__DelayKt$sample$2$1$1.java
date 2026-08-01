package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, m115d2 = {"<anonymous>", "", "T", "result", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", m125f = "Delay.kt", m126i = {}, m127l = {}, m128m = "invokeSuspend", m129n = {}, m130s = {})
final class FlowKt__DelayKt$sample$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $lastValue;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> $ticker;
    /* synthetic */ java.lang.Object L$0;
    int label;

    FlowKt__DelayKt$sample$2$1$1(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r2, kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1> r4) {
            r1 = this;
            r1.$lastValue = r2
            r1.$ticker = r3
            r0 = 2
            r1.<init>(r0, r4)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r3.$lastValue
            kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> r2 = r3.$ticker
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            r0 = r3
            kotlinx.coroutines.channels.ChannelResult r0 = (kotlinx.coroutines.channels.ChannelResult) r0
            java.lang.Object r0 = r0.m10191unboximpl()
            r1 = r4
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r0 = r2.m10204invokeWpGqRn0(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final java.lang.Object m10204invokeWpGqRn0(java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlinx.coroutines.channels.ChannelResult r0 = kotlinx.coroutines.channels.ChannelResult.m10179boximpl(r3)
            kotlin.coroutines.Continuation r0 = r2.create(r0, r4)
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r9.label
            switch(r0) {
                case 0: goto L10;
                default: goto L8;
            }
        L8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L10:
            kotlin.ResultKt.throwOnFailure(r10)
            r0 = r9
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.ChannelResult r1 = (kotlinx.coroutines.channels.ChannelResult) r1
            java.lang.Object r1 = r1.m10191unboximpl()
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r0.$lastValue
            r3 = 0
            boolean r4 = r1 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r4 != 0) goto L28
            r4 = r1
            r5 = 0
            r2.element = r4
        L28:
            r2 = r1
            kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> r3 = r0.$ticker
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r4 = r0.$lastValue
            r5 = 0
            boolean r6 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r6 == 0) goto L4d
            java.lang.Throwable r6 = kotlinx.coroutines.channels.ChannelResult.m10183exceptionOrNullimpl(r2)
            r7 = 0
            if (r6 != 0) goto L4a
            kotlinx.coroutines.flow.internal.ChildCancelledException r8 = new kotlinx.coroutines.flow.internal.ChildCancelledException
            r8.<init>()
            java.util.concurrent.CancellationException r8 = (java.util.concurrent.CancellationException) r8
            r3.cancel(r8)
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
            r4.element = r3
            goto L4d
        L4a:
            r3 = r6
            r4 = 0
            throw r3
        L4d:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }
}
