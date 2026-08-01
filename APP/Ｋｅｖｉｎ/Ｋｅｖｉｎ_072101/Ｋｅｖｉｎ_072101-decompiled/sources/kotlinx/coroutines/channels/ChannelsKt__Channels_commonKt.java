package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Channels.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0001\u001aC\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\t0\n2\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0004\u0012\u0004\u0012\u0002H\b0\f¢\u0006\u0002\b\rH\u0087\b¢\u0006\u0002\u0010\u000e\u001aP\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\t0\u00042\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0004\u0012\u0004\u0012\u0002H\b0\f¢\u0006\u0002\b\rH\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00030\fH\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a5\u0010\u0010\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00030\fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a$\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\u0015\"\b\b\u0000\u0010\t*\u00020\u0016*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0007\u001a'\u0010\u0017\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u0016*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a'\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\t0\u001a\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m115d2 = {"DEFAULT_CLOSE_MESSAGE", "", "cancelConsumed", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "cause", "", "consume", "R", "E", "Lkotlinx/coroutines/channels/BroadcastChannel;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "consumeEach", "action", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onReceiveOrNull", "Lkotlinx/coroutines/selects/SelectClause1;", "", "receiveOrNull", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toList", "", "kotlinx-coroutines-core"}, m116k = 5, m117mv = {1, 6, 0}, m119xi = 48, m120xs = "kotlinx/coroutines/channels/ChannelsKt")
final /* synthetic */ class ChannelsKt__Channels_commonKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 */
    /* JADX INFO: compiled from: Channels.common.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m125f = "Channels.common.kt", m126i = {0, 0}, m127l = {104}, m128m = "consumeEach", m129n = {"action", "$this$consume$iv"}, m130s = {"L$0", "L$1"})
    static final class C08351<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C08351(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C08351> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 */
    /* JADX INFO: compiled from: Channels.common.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m125f = "Channels.common.kt", m126i = {0, 0}, m127l = {129}, m128m = "consumeEach", m129n = {"action", "channel$iv"}, m130s = {"L$0", "L$1"})
    static final class C08363<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C08363(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C08363> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 */
    /* JADX INFO: compiled from: Channels.common.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m125f = "Channels.common.kt", m126i = {0, 0}, m127l = {148}, m128m = "toList", m129n = {"$this$toList_u24lambda_u2d3", "$this$consume$iv$iv"}, m130s = {"L$1", "L$2"})
    static final class C08371<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        C08371(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C08371> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toList(r0, r1)
                return r0
        }
    }

    public static final void cancelConsumed(kotlinx.coroutines.channels.ReceiveChannel<?> r4, java.lang.Throwable r5) {
            r0 = 0
            if (r5 != 0) goto L4
        L3:
            goto L16
        L4:
            r1 = r5
            r2 = 0
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto Ld
            r0 = r1
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
        Ld:
            if (r0 != 0) goto L3
            java.lang.String r0 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r0 = kotlinx.coroutines.ExceptionsKt.CancellationException(r0, r1)
            goto L3
        L16:
            r4.cancel(r0)
            return
    }

    public static final <E, R> R consume(kotlinx.coroutines.channels.BroadcastChannel<E> r5, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> r6) {
            r0 = 0
            kotlinx.coroutines.channels.ReceiveChannel r1 = r5.openSubscription()
            r2 = 0
            r3 = 1
            java.lang.Object r4 = r6.invoke(r1)     // Catch: java.lang.Throwable -> L16
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r1, r2, r3, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return r4
        L16:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r1, r2, r3, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r4
    }

    public static final <E, R> R consume(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r4, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> r5) {
            r0 = 0
            r1 = 0
            r2 = 1
            java.lang.Object r3 = r5.invoke(r4)     // Catch: java.lang.Throwable -> L13
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return r3
        L13:
            r3 = move-exception
            r1 = r3
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.BroadcastChannel<E> r10, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C08363
            if (r0 == 0) goto L14
            r0 = r12
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C08363) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3
            r0.<init>(r12)
        L19:
            r12 = r0
            java.lang.Object r0 = r12.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r12.label
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L4b;
                case 1: goto L2f;
                default: goto L27;
            }
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            r10 = 0
            r11 = 0
            r2 = 0
            java.lang.Object r5 = r12.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r12.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r12.L$0
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L48
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r2
            r2 = r1
            r1 = r0
            goto L78
        L48:
            r1 = move-exception
            goto La8
        L4b:
            kotlin.ResultKt.throwOnFailure(r0)
            r7 = r11
            r11 = 0
            r2 = 0
            kotlinx.coroutines.channels.ReceiveChannel r6 = r10.openSubscription()
            r10 = r6
            r5 = 0
            kotlinx.coroutines.channels.ChannelIterator r8 = r10.iterator()     // Catch: java.lang.Throwable -> La5
            r10 = r11
            r11 = r2
            r2 = r5
            r5 = r8
        L61:
            r12.L$0 = r7     // Catch: java.lang.Throwable -> L48
            r12.L$1 = r6     // Catch: java.lang.Throwable -> L48
            r12.L$2 = r5     // Catch: java.lang.Throwable -> L48
            r12.label = r4     // Catch: java.lang.Throwable -> L48
            java.lang.Object r8 = r5.hasNext(r12)     // Catch: java.lang.Throwable -> L48
            if (r8 != r1) goto L70
            return r1
        L70:
            r9 = r1
            r1 = r0
            r0 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r2
            r2 = r9
        L78:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L9e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L9e
            r8.invoke(r0)     // Catch: java.lang.Throwable -> L9e
            r0 = r1
            r1 = r2
            r2 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            goto L61
        L8e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9e
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r7, r3, r4, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L9e:
            r0 = move-exception
            r6 = r7
            r7 = r8
            r9 = r1
            r1 = r0
            r0 = r9
            goto La8
        La5:
            r1 = move-exception
            r10 = r11
            r11 = r2
        La8:
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r6, r3, r4, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            throw r1
    }

    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r10, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C08351
            if (r0 == 0) goto L14
            r0 = r12
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C08351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            r0.<init>(r12)
        L19:
            r12 = r0
            java.lang.Object r0 = r12.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r12.label
            r3 = 1
            switch(r2) {
                case 0: goto L4c;
                case 1: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2e:
            r10 = 0
            r11 = 0
            r2 = 0
            java.lang.Object r4 = r12.L$2
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            r5 = 0
            java.lang.Object r6 = r12.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r12.L$0
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L49
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            goto L79
        L49:
            r1 = move-exception
            goto Lac
        L4c:
            kotlin.ResultKt.throwOnFailure(r0)
            r7 = r11
            r11 = 0
            r6 = r10
            r10 = 0
            r5 = 0
            r2 = r6
            r4 = 0
            kotlinx.coroutines.channels.ChannelIterator r8 = r2.iterator()     // Catch: java.lang.Throwable -> La8
            r2 = r4
            r4 = r8
            r9 = r11
            r11 = r10
            r10 = r9
        L61:
            r12.L$0 = r7     // Catch: java.lang.Throwable -> L49
            r12.L$1 = r6     // Catch: java.lang.Throwable -> L49
            r12.L$2 = r4     // Catch: java.lang.Throwable -> L49
            r12.label = r3     // Catch: java.lang.Throwable -> L49
            java.lang.Object r8 = r4.hasNext(r12)     // Catch: java.lang.Throwable -> L49
            if (r8 != r1) goto L70
            return r1
        L70:
            r9 = r1
            r1 = r0
            r0 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r9
        L79:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La0
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L90
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> La0
            r8.invoke(r0)     // Catch: java.lang.Throwable -> La0
            r0 = r1
            r1 = r2
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            goto L61
        L90:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La0
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        La0:
            r0 = move-exception
            r5 = r6
            r6 = r7
            r7 = r8
            r9 = r1
            r1 = r0
            r0 = r9
            goto Lac
        La8:
            r1 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
        Lac:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Laf
        Laf:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r1
    }

    private static final <E> java.lang.Object consumeEach$$forInline(kotlinx.coroutines.channels.BroadcastChannel<E> r10, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
            r0 = 0
            r1 = r10
            r2 = 0
            kotlinx.coroutines.channels.ReceiveChannel r3 = r1.openSubscription()
            r4 = r3
            r5 = 0
            r6 = 0
            r7 = 1
            kotlinx.coroutines.channels.ChannelIterator r8 = r4.iterator()     // Catch: java.lang.Throwable -> L3f
        L10:
            r9 = 3
            kotlin.jvm.internal.InlineMarker.mark(r9)     // Catch: java.lang.Throwable -> L3f
            r9 = 0
            kotlin.jvm.internal.InlineMarker.mark(r9)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r9 = r8.hasNext(r6)     // Catch: java.lang.Throwable -> L3f
            kotlin.jvm.internal.InlineMarker.mark(r7)     // Catch: java.lang.Throwable -> L3f
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3f
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L2f
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L3f
            r11.invoke(r9)     // Catch: java.lang.Throwable -> L3f
            goto L10
        L2f:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3f
            kotlin.jvm.internal.InlineMarker.finallyStart(r7)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r3, r6, r7, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r7)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L3f:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r7)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r3, r6, r7, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r7)
            throw r4
    }

    private static final <E> java.lang.Object consumeEach$$forInline(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            r0 = 0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = r1
            r5 = 0
            r6 = 1
            kotlinx.coroutines.channels.ChannelIterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> L3d
        Ld:
            r8 = 3
            kotlin.jvm.internal.InlineMarker.mark(r8)     // Catch: java.lang.Throwable -> L3d
            r8 = 0
            kotlin.jvm.internal.InlineMarker.mark(r8)     // Catch: java.lang.Throwable -> L3d
            r8 = 0
            java.lang.Object r8 = r7.hasNext(r8)     // Catch: java.lang.Throwable -> L3d
            kotlin.jvm.internal.InlineMarker.mark(r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L3d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r8 == 0) goto L2d
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L3d
            r10.invoke(r8)     // Catch: java.lang.Throwable -> L3d
            goto Ld
        L2d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3d
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L3d:
            r4 = move-exception
            r3 = r4
            throw r4     // Catch: java.lang.Throwable -> L41
        L41:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            throw r4
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final <E> kotlinx.coroutines.selects.SelectClause1<E> onReceiveOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1) {
            kotlinx.coroutines.selects.SelectClause1 r0 = r1.getOnReceiveOrNull()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final <E> java.lang.Object receiveOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.coroutines.Continuation<? super E> r2) {
            java.lang.Object r0 = r1.receiveOrNull(r2)
            return r0
    }

    public static final <E> java.lang.Object toList(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r17, kotlin.coroutines.Continuation<? super java.util.List<? extends E>> r18) {
            r0 = r18
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C08371
            if (r1 == 0) goto L16
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C08371) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L1b
        L16:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            r1.<init>(r0)
        L1b:
            r0 = r1
            java.lang.Object r2 = r1.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            switch(r3) {
                case 0: goto L55;
                case 1: goto L2f;
                default: goto L27;
            }
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2f:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.Object r7 = r1.L$3
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            r8 = 0
            java.lang.Object r9 = r1.L$2
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r10 = r1.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r1.L$0
            java.util.List r11 = (java.util.List) r11
            kotlin.ResultKt.throwOnFailure(r2)     // Catch: java.lang.Throwable -> L52
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            goto L95
        L52:
            r0 = move-exception
            goto Lcd
        L55:
            kotlin.ResultKt.throwOnFailure(r2)
            r3 = r17
            java.util.List r4 = kotlin.collections.CollectionsKt.createListBuilder()
            r10 = r4
            r5 = 0
            r6 = 0
            r9 = r3
            r3 = 0
            r8 = 0
            r7 = r9
            r11 = 0
            kotlinx.coroutines.channels.ChannelIterator r12 = r7.iterator()     // Catch: java.lang.Throwable -> Lc8
            r7 = r12
            r15 = r5
            r5 = r3
            r3 = r15
            r16 = r11
            r11 = r4
            r4 = r6
            r6 = r16
        L77:
            r1.L$0 = r11     // Catch: java.lang.Throwable -> L52
            r1.L$1 = r10     // Catch: java.lang.Throwable -> L52
            r1.L$2 = r9     // Catch: java.lang.Throwable -> L52
            r1.L$3 = r7     // Catch: java.lang.Throwable -> L52
            r12 = 1
            r1.label = r12     // Catch: java.lang.Throwable -> L52
            java.lang.Object r12 = r7.hasNext(r1)     // Catch: java.lang.Throwable -> L52
            if (r12 != r0) goto L89
            return r0
        L89:
            r15 = r3
            r3 = r2
            r2 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r15
        L95:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lbf
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lbf
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> Lbf
            r13 = r2
            r14 = 0
            r11.add(r13)     // Catch: java.lang.Throwable -> Lbf
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            goto L77
        Lb1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbf
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r10, r9)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r12)
            return r0
        Lbf:
            r0 = move-exception
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r8 = r9
            r9 = r10
            r10 = r11
            goto Lcd
        Lc8:
            r0 = move-exception
            r4 = r6
            r15 = r5
            r5 = r3
            r3 = r15
        Lcd:
            r6 = r0
            throw r0     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            r0 = move-exception
            r7 = r0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r6)
            throw r7
    }
}
