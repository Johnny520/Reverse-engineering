package io.ktor.websocket;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.InterfaceC5199;
import kotlinx.coroutines.channels.InterfaceC5206;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
@InterfaceC6861(c = "io.ktor.websocket.PingPongKt$pinger$1$rc$1", f = "PingPong.kt", l = {76, 80}, m = "invokeSuspend")
public final class PingPongKt$pinger$1$rc$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5206 $channel;
    final /* synthetic */ InterfaceC5199 $outgoing;
    final /* synthetic */ String $pingMessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PingPongKt$pinger$1$rc$1(InterfaceC5199 interfaceC5199, String str, InterfaceC5206 interfaceC5206, InterfaceC4356<? super PingPongKt$pinger$1$rc$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$outgoing = interfaceC5199;
        this.$pingMessage = str;
        this.$channel = interfaceC5206;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new PingPongKt$pinger$1$rc$1(this.$outgoing, this.$pingMessage, this.$channel, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((PingPongKt$pinger$1$rc$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:16:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            kotlin.AbstractC5184.m10206(r7)
            goto L48
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            r6 = 0
            return r6
        L17:
            kotlin.AbstractC5184.m10206(r7)
            goto L3d
        L1b:
            kotlin.AbstractC5184.m10206(r7)
            飘花落叶言苏楪子哲兰世.飘花落叶言子楪世苏兰哲 r7 = io.ktor.websocket.AbstractC4259.f12780
            java.lang.String r1 = "WebSocket Pinger: sending ping frame"
            r7.trace(r1)
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世 r7 = r6.$outgoing
            io.ktor.websocket.飘花落叶言子楪苏哲世兰 r1 = new io.ktor.websocket.飘花落叶言子楪苏哲世兰
            java.lang.String r4 = r6.$pingMessage
            java.nio.charset.Charset r5 = kotlin.text.AbstractC5131.f14685
            byte[] r4 = p058.AbstractC6854.m12056(r4, r5)
            r1.<init>(r4)
            r6.label = r3
            java.lang.Object r7 = r7.mo8443(r1, r6)
            if (r7 != r0) goto L3d
            goto L47
        L3d:
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r7 = r6.$channel
            r6.label = r2
            java.lang.Object r7 = r7.mo10240(r6)
            if (r7 != r0) goto L48
        L47:
            return r0
        L48:
            io.ktor.websocket.飘花落叶言子楪苏哲兰世 r7 = (io.ktor.websocket.C4281) r7
            byte[] r1 = r7.f12832
            r3 = 0
            int r4 = r1.length
            java.lang.String r1 = kotlin.text.AbstractC5138.m10134(r3, r1, r4)
            java.lang.String r3 = r6.$pingMessage
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L70
            飘花落叶言苏楪子哲兰世.飘花落叶言子楪世苏兰哲 r6 = io.ktor.websocket.AbstractC4259.f12780
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WebSocket Pinger: received valid pong frame "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.trace(r7)
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        L70:
            飘花落叶言苏楪子哲兰世.飘花落叶言子楪世苏兰哲 r1 = io.ktor.websocket.AbstractC4259.f12780
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "WebSocket Pinger: received invalid pong frame "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = ", continue waiting"
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r1.trace(r7)
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.PingPongKt$pinger$1$rc$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
