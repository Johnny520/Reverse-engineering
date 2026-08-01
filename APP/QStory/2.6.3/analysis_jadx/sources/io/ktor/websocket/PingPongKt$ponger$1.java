package io.ktor.websocket;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.InterfaceC5200;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.websocket.PingPongKt$ponger$1", f = "PingPong.kt", l = {117, 32}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class PingPongKt$ponger$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5207 $channel;
    final /* synthetic */ InterfaceC5200 $outgoing;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PingPongKt$ponger$1(InterfaceC5207 interfaceC5207, InterfaceC5200 interfaceC5200, InterfaceC4357<? super PingPongKt$ponger$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$channel = interfaceC5207;
        this.$outgoing = interfaceC5200;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new PingPongKt$ponger$1(this.$channel, this.$outgoing, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((PingPongKt$ponger$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r6.mo8433(r7, r10) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #2 {all -> 0x001e, blocks: (B:7:0x0019, B:19:0x0041, B:23:0x0055, B:25:0x005d, B:14:0x0032, B:18:0x003d), top: B:39:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: ClosedSendChannelException -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {ClosedSendChannelException -> 0x008e, blocks: (B:28:0x0084, B:32:0x008a, B:33:0x008d, B:17:0x0039, B:30:0x0088, B:7:0x0019, B:19:0x0041, B:23:0x0055, B:25:0x005d, B:14:0x0032, B:18:0x003d), top: B:39:0x0007, inners: #0, #2 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0081 -> B:8:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L36
            if (r1 == r4) goto L26
            if (r1 != r3) goto L20
            java.lang.Object r1 = r10.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.coroutines.channels.InterfaceC5212) r1
            java.lang.Object r5 = r10.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r5 = (kotlinx.coroutines.channels.InterfaceC5199) r5
            java.lang.Object r6 = r10.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世 r6 = (kotlinx.coroutines.channels.InterfaceC5200) r6
            kotlin.AbstractC5185.m10210(r11)     // Catch: java.lang.Throwable -> L1e
        L1c:
            r11 = r6
            goto L41
        L1e:
            r10 = move-exception
            goto L88
        L20:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r10)
            return r2
        L26:
            java.lang.Object r1 = r10.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.coroutines.channels.InterfaceC5212) r1
            java.lang.Object r5 = r10.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r5 = (kotlinx.coroutines.channels.InterfaceC5199) r5
            java.lang.Object r6 = r10.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世 r6 = (kotlinx.coroutines.channels.InterfaceC5200) r6
            kotlin.AbstractC5185.m10210(r11)     // Catch: java.lang.Throwable -> L1e
            goto L55
        L36:
            kotlin.AbstractC5185.m10210(r11)
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r5 = r10.$channel     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L8e
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世 r11 = r10.$outgoing     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L8e
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = r5.iterator()     // Catch: java.lang.Throwable -> L1e
        L41:
            r10.L$0 = r11     // Catch: java.lang.Throwable -> L1e
            r10.L$1 = r5     // Catch: java.lang.Throwable -> L1e
            r10.L$2 = r1     // Catch: java.lang.Throwable -> L1e
            r10.label = r4     // Catch: java.lang.Throwable -> L1e
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5191) r1     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r6 = r1.m10264(r10)     // Catch: java.lang.Throwable -> L1e
            if (r6 != r0) goto L52
            goto L83
        L52:
            r9 = r6
            r6 = r11
            r11 = r9
        L55:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1e
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1e
            if (r11 == 0) goto L84
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5191) r1     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r11 = r1.m10262()     // Catch: java.lang.Throwable -> L1e
            io.ktor.websocket.飘花落叶言子楪苏哲世兰 r11 = (io.ktor.websocket.C4281) r11     // Catch: java.lang.Throwable -> L1e
            飘花落叶言苏楪子哲世兰.飘花落叶言子楪世苏兰哲 r7 = io.ktor.websocket.AbstractC4260.f12784     // Catch: java.lang.Throwable -> L1e
            java.lang.String r8 = "Received ping message, sending pong message"
            r7.trace(r8)     // Catch: java.lang.Throwable -> L1e
            io.ktor.websocket.飘花落叶言子楪苏哲兰世 r7 = new io.ktor.websocket.飘花落叶言子楪苏哲兰世     // Catch: java.lang.Throwable -> L1e
            byte[] r11 = r11.f12836     // Catch: java.lang.Throwable -> L1e
            io.ktor.websocket.飘花落叶言子楪哲苏兰世 r8 = io.ktor.websocket.C4276.f12831     // Catch: java.lang.Throwable -> L1e
            r7.<init>(r11, r8)     // Catch: java.lang.Throwable -> L1e
            r10.L$0 = r6     // Catch: java.lang.Throwable -> L1e
            r10.L$1 = r5     // Catch: java.lang.Throwable -> L1e
            r10.L$2 = r1     // Catch: java.lang.Throwable -> L1e
            r10.label = r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r11 = r6.mo8433(r7, r10)     // Catch: java.lang.Throwable -> L1e
            if (r11 != r0) goto L1c
        L83:
            return r0
        L84:
            r5.mo10256(r2)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L8e
            goto L8e
        L88:
            throw r10     // Catch: java.lang.Throwable -> L89
        L89:
            r11 = move-exception
            kotlinx.coroutines.channels.AbstractC5205.m10278(r5, r10)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L8e
            throw r11     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L8e
        L8e:
            kotlin.飘花落叶言子楪兰苏哲世 r10 = kotlin.C5176.f14739
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.PingPongKt$ponger$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
