package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: TickerChannels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a/\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m115d2 = {"fixedDelayTicker", "", "delayMillis", "", "initialDelayMillis", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "(JJLkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fixedPeriodTicker", "ticker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "context", "Lkotlin/coroutines/CoroutineContext;", "mode", "Lkotlinx/coroutines/channels/TickerMode;", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class TickerChannelsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.TickerChannelsKt", m125f = "TickerChannels.kt", m126i = {0, 0, 1, 1, 2, 2}, m127l = {106, 108, 109}, m128m = "fixedDelayTicker", m129n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, m130s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    static final class C08801 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C08801(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt.C08801> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                r7.result = r8
                int r0 = r7.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r7.label = r0
                r5 = 0
                r6 = r7
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1 = 0
                r3 = 0
                java.lang.Object r0 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedDelayTicker(r1, r3, r5, r6)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.TickerChannelsKt", m125f = "TickerChannels.kt", m126i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, m127l = {84, 88, 94, 96}, m128m = "fixedPeriodTicker", m129n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, m130s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    static final class C08811 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        long J$1;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C08811(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt.C08811> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                r7.result = r8
                int r0 = r7.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r7.label = r0
                r5 = 0
                r6 = r7
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1 = 0
                r3 = 0
                java.lang.Object r0 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedPeriodTicker(r1, r3, r5, r6)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, m115d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", m125f = "TickerChannels.kt", m126i = {}, m127l = {72, 73}, m128m = "invokeSuspend", m129n = {}, m130s = {})
    static final class C08823 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ long $initialDelayMillis;
        final /* synthetic */ kotlinx.coroutines.channels.TickerMode $mode;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3$WhenMappings */
        /* JADX INFO: compiled from: TickerChannels.kt */
        @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    kotlinx.coroutines.channels.TickerMode[] r0 = kotlinx.coroutines.channels.TickerMode.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD
                    int r1 = r1.ordinal()
                    r2 = 1
                    r0[r1] = r2
                    kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_DELAY
                    int r1 = r1.ordinal()
                    r2 = 2
                    r0[r1] = r2
                    kotlinx.coroutines.channels.TickerChannelsKt.C08823.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        C08823(kotlinx.coroutines.channels.TickerMode r2, long r3, long r5, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt.C08823> r7) {
                r1 = this;
                r1.$mode = r2
                r1.$delayMillis = r3
                r1.$initialDelayMillis = r5
                r0 = 2
                r1.<init>(r0, r7)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r9, kotlin.coroutines.Continuation<?> r10) {
                r8 = this;
                kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 r7 = new kotlinx.coroutines.channels.TickerChannelsKt$ticker$3
                kotlinx.coroutines.channels.TickerMode r1 = r8.$mode
                long r2 = r8.$delayMillis
                long r4 = r8.$initialDelayMillis
                r0 = r7
                r6 = r10
                r0.<init>(r1, r2, r4, r6)
                r7.L$0 = r9
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                return r7
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
                kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 r0 = (kotlinx.coroutines.channels.TickerChannelsKt.C08823) r0
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
                    case 0: goto L1b;
                    case 1: goto L16;
                    case 2: goto L11;
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
                goto L47
            L16:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r11)
                goto L5f
            L1b:
                kotlin.ResultKt.throwOnFailure(r11)
                r1 = r10
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlinx.coroutines.channels.TickerMode r3 = r1.$mode
                int[] r4 = kotlinx.coroutines.channels.TickerChannelsKt.C08823.WhenMappings.$EnumSwitchMapping$0
                int r3 = r3.ordinal()
                r3 = r4[r3]
                switch(r3) {
                    case 1: goto L49;
                    case 2: goto L31;
                    default: goto L30;
                }
            L30:
                goto L60
            L31:
                long r4 = r1.$delayMillis
                long r6 = r1.$initialDelayMillis
                kotlinx.coroutines.channels.SendChannel r8 = r2.getChannel()
                r9 = r1
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                r3 = 2
                r1.label = r3
                java.lang.Object r2 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedDelayTicker(r4, r6, r8, r9)
                if (r2 != r0) goto L46
                return r0
            L46:
                r0 = r1
            L47:
                r1 = r0
                goto L60
            L49:
                long r3 = r1.$delayMillis
                long r5 = r1.$initialDelayMillis
                kotlinx.coroutines.channels.SendChannel r7 = r2.getChannel()
                r8 = r1
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                r9 = 1
                r1.label = r9
                java.lang.Object r2 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedPeriodTicker(r3, r5, r7, r8)
                if (r2 != r0) goto L5e
                return r0
            L5e:
                r0 = r1
            L5f:
                r1 = r0
            L60:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    public static final /* synthetic */ java.lang.Object access$fixedDelayTicker(long r1, long r3, kotlinx.coroutines.channels.SendChannel r5, kotlin.coroutines.Continuation r6) {
            java.lang.Object r0 = fixedDelayTicker(r1, r3, r5, r6)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$fixedPeriodTicker(long r1, long r3, kotlinx.coroutines.channels.SendChannel r5, kotlin.coroutines.Continuation r6) {
            java.lang.Object r0 = fixedPeriodTicker(r1, r3, r5, r6)
            return r0
    }

    private static final java.lang.Object fixedDelayTicker(long r3, long r5, kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.TickerChannelsKt.C08801
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt.C08801) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r8)
        L19:
            r8 = r0
            java.lang.Object r0 = r8.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r8.label
            switch(r2) {
                case 0: goto L4b;
                case 1: goto L41;
                case 2: goto L37;
                case 3: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L2d:
            long r3 = r8.J$0
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L7c
        L37:
            long r3 = r8.J$0
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L6e
        L41:
            long r3 = r8.J$0
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L5d
        L4b:
            kotlin.ResultKt.throwOnFailure(r0)
            r8.L$0 = r7
            r8.J$0 = r3
            r2 = 1
            r8.label = r2
            java.lang.Object r5 = kotlinx.coroutines.DelayKt.delay(r5, r8)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            r5 = r7
        L5d:
        L5e:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r8.L$0 = r5
            r8.J$0 = r3
            r7 = 2
            r8.label = r7
            java.lang.Object r6 = r5.send(r6, r8)
            if (r6 != r1) goto L6e
            return r1
        L6e:
            r8.L$0 = r5
            r8.J$0 = r3
            r6 = 3
            r8.label = r6
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r8)
            if (r6 != r1) goto L7c
            return r1
        L7c:
            goto L5e
    }

    private static final java.lang.Object fixedPeriodTicker(long r18, long r20, kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit> r22, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) {
            r0 = r23
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.TickerChannelsKt.C08811
            if (r1 == 0) goto L16
            r1 = r0
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = (kotlinx.coroutines.channels.TickerChannelsKt.C08811) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L1b
        L16:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            r1.<init>(r0)
        L1b:
            r0 = r1
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 0
            switch(r3) {
                case 0: goto L66;
                case 1: goto L5a;
                case 2: goto L4e;
                case 3: goto L3f;
                case 4: goto L30;
                default: goto L28;
            }
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L30:
            long r5 = r0.J$1
            long r7 = r0.J$0
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            kotlin.ResultKt.throwOnFailure(r1)
            r9 = r5
            r5 = r7
            goto L11b
        L3f:
            long r5 = r0.J$1
            long r7 = r0.J$0
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            kotlin.ResultKt.throwOnFailure(r1)
            r9 = r5
            r5 = r7
            goto L104
        L4e:
            long r5 = r0.J$1
            long r7 = r0.J$0
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            kotlin.ResultKt.throwOnFailure(r1)
            goto Lba
        L5a:
            long r5 = r0.J$1
            long r7 = r0.J$0
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            kotlin.ResultKt.throwOnFailure(r1)
            goto La0
        L66:
            kotlin.ResultKt.throwOnFailure(r1)
            r7 = r18
            r5 = r20
            r3 = r22
            kotlinx.coroutines.AbstractTimeSource r9 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r9 != 0) goto L77
            r9 = r4
            goto L7f
        L77:
            long r9 = r9.nanoTime()
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
        L7f:
            if (r9 != 0) goto L86
            long r9 = java.lang.System.nanoTime()
            goto L8a
        L86:
            long r9 = r9.longValue()
        L8a:
            long r11 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r5)
            long r9 = r9 + r11
            r0.L$0 = r3
            r0.J$0 = r7
            r0.J$1 = r9
            r11 = 1
            r0.label = r11
            java.lang.Object r5 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r5 != r2) goto L9f
            return r2
        L9f:
            r5 = r9
        La0:
            long r9 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r7)
        La4:
            long r5 = r5 + r9
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            r0.L$0 = r3
            r0.J$0 = r5
            r0.J$1 = r9
            r8 = 2
            r0.label = r8
            java.lang.Object r7 = r3.send(r7, r0)
            if (r7 != r2) goto Lb8
            return r2
        Lb8:
            r7 = r5
            r5 = r9
        Lba:
            kotlinx.coroutines.AbstractTimeSource r9 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r9 != 0) goto Lc2
            r9 = r4
            goto Lca
        Lc2:
            long r9 = r9.nanoTime()
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
        Lca:
            if (r9 != 0) goto Ld1
            long r9 = java.lang.System.nanoTime()
            goto Ld5
        Ld1:
            long r9 = r9.longValue()
        Ld5:
            long r11 = r7 - r9
            r13 = 0
            long r11 = kotlin.ranges.RangesKt.coerceAtLeast(r11, r13)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L105
            int r13 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r13 == 0) goto L105
            long r11 = r9 - r7
            long r11 = r11 % r5
            long r7 = r5 - r11
            long r9 = r9 + r7
            long r11 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(r7)
            r0.L$0 = r3
            r0.J$0 = r9
            r0.J$1 = r5
            r13 = 3
            r0.label = r13
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r11, r0)
            if (r7 != r2) goto Lff
            return r2
        Lff:
            r16 = r5
            r5 = r9
            r9 = r16
        L104:
            goto La4
        L105:
            long r9 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(r11)
            r0.L$0 = r3
            r0.J$0 = r7
            r0.J$1 = r5
            r13 = 4
            r0.label = r13
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r9, r0)
            if (r9 != r2) goto L119
            return r2
        L119:
            r9 = r5
            r5 = r7
        L11b:
            goto La4
    }

    public static final kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> ticker(long r16, long r18, kotlin.coroutines.CoroutineContext r20, kotlinx.coroutines.channels.TickerMode r21) {
            r7 = r16
            r9 = r18
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r3 = 1
            r11 = 0
            if (r2 < 0) goto Le
            r2 = r3
            goto Lf
        Le:
            r2 = r11
        Lf:
            java.lang.String r4 = " ms"
            if (r2 == 0) goto L62
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L18
            goto L19
        L18:
            r3 = r11
        L19:
            if (r3 == 0) goto L3e
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r12 = r0
            kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getUnconfined()
            r13 = r20
            kotlin.coroutines.CoroutineContext r14 = r0.plus(r13)
            kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 r15 = new kotlinx.coroutines.channels.TickerChannelsKt$ticker$3
            r6 = 0
            r0 = r15
            r1 = r21
            r2 = r16
            r4 = r18
            r0.<init>(r1, r2, r4, r6)
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce(r12, r14, r11, r15)
            return r0
        L3e:
            r13 = r20
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected non-negative initial delay, but has "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L62:
            r13 = r20
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected non-negative delay, but has "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel ticker$default(long r0, long r2, kotlin.coroutines.CoroutineContext r4, kotlinx.coroutines.channels.TickerMode r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r2 = r0
        L5:
            r7 = r6 & 4
            if (r7 == 0) goto Ld
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
        Ld:
            r6 = r6 & 8
            if (r6 == 0) goto L13
            kotlinx.coroutines.channels.TickerMode r5 = kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD
        L13:
            kotlinx.coroutines.channels.ReceiveChannel r0 = ticker(r0, r2, r4, r5)
            return r0
    }
}
