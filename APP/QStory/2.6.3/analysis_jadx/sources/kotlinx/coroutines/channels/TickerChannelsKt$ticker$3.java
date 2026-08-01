package kotlinx.coroutines.channels;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", l = {68, 69}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 2, 0})
final class TickerChannelsKt$ticker$3 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ long $delayMillis;
    final /* synthetic */ long $initialDelayMillis;
    final /* synthetic */ TickerMode $mode;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TickerChannelsKt$ticker$3(TickerMode tickerMode, long j, long j2, InterfaceC4357<? super TickerChannelsKt$ticker$3> interfaceC4357) {
        super(2, interfaceC4357);
        this.$mode = tickerMode;
        this.$delayMillis = j;
        this.$initialDelayMillis = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TickerChannelsKt$ticker$3 tickerChannelsKt$ticker$3 = new TickerChannelsKt$ticker$3(this.$mode, this.$delayMillis, this.$initialDelayMillis, interfaceC4357);
        tickerChannelsKt$ticker$3.L$0 = obj;
        return tickerChannelsKt$ticker$3;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TickerChannelsKt$ticker$3) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (kotlinx.coroutines.channels.AbstractC5205.m10281(r6, r8, r10, r12) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (kotlinx.coroutines.channels.AbstractC5205.m10280(r2, r4, r6, r12) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲 r0 = (kotlinx.coroutines.channels.InterfaceC5196) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r12.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1b
            if (r2 == r5) goto L11
            if (r2 != r4) goto L15
        L11:
            kotlin.AbstractC5185.m10210(r13)
            goto L5e
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r12)
            return r3
        L1b:
            kotlin.AbstractC5185.m10210(r13)
            kotlinx.coroutines.channels.TickerMode r13 = r12.$mode
            int[] r2 = kotlinx.coroutines.channels.AbstractC5197.f14786
            int r13 = r13.ordinal()
            r13 = r2[r13]
            if (r13 == r5) goto L46
            if (r13 != r4) goto L42
            long r6 = r12.$delayMillis
            long r8 = r12.$initialDelayMillis
            r10 = r0
            kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世 r10 = (kotlinx.coroutines.channels.C5204) r10
            r10.getClass()
            r12.L$0 = r3
            r12.label = r4
            r11 = r12
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlinx.coroutines.channels.AbstractC5205.m10281(r6, r8, r10, r11)
            if (r12 != r1) goto L5e
            goto L5d
        L42:
            io.ktor.util.C4211.m8611()
            return r3
        L46:
            r7 = r12
            r12 = r3
            long r2 = r7.$delayMillis
            r13 = r5
            long r4 = r7.$initialDelayMillis
            r6 = r0
            kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世 r6 = (kotlinx.coroutines.channels.C5204) r6
            r6.getClass()
            r7.L$0 = r12
            r7.label = r13
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlinx.coroutines.channels.AbstractC5205.m10280(r2, r4, r6, r7)
            if (r12 != r1) goto L5e
        L5d:
            return r1
        L5e:
            kotlin.飘花落叶言子楪兰苏哲世 r12 = kotlin.C5176.f14739
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
