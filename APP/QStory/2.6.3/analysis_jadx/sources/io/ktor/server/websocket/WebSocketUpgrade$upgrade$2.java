package io.ktor.server.websocket;

import io.ktor.websocket.InterfaceC4258;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.websocket.WebSocketUpgrade$upgrade$2", f = "WebSocketUpgrade.kt", l = {97, 98}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class WebSocketUpgrade$upgrade$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC4258 $webSocket;
    int label;
    final /* synthetic */ C4176 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketUpgrade$upgrade$2(C4176 c4176, InterfaceC4258 interfaceC4258, InterfaceC4357<? super WebSocketUpgrade$upgrade$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c4176;
        this.$webSocket = interfaceC4258;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new WebSocketUpgrade$upgrade$2(this.this$0, this.$webSocket, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((WebSocketUpgrade$upgrade$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r6.mo8548(r5) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L13
            kotlin.AbstractC5185.m10210(r6)     // Catch: java.lang.Throwable -> L11
            goto L3a
        L11:
            r6 = move-exception
            goto L40
        L13:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r2
        L19:
            kotlin.AbstractC5185.m10210(r6)     // Catch: java.lang.Throwable -> L11
            goto L2f
        L1d:
            kotlin.AbstractC5185.m10210(r6)
            io.ktor.server.websocket.飘花落叶言子楪世兰哲苏 r6 = r5.this$0     // Catch: java.lang.Throwable -> L11
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r6 = r6.f12641     // Catch: java.lang.Throwable -> L11
            io.ktor.websocket.飘花落叶言子世楪苏哲兰 r1 = r5.$webSocket     // Catch: java.lang.Throwable -> L11
            r5.label = r4     // Catch: java.lang.Throwable -> L11
            java.lang.Object r6 = r6.invoke(r1, r5)     // Catch: java.lang.Throwable -> L11
            if (r6 != r0) goto L2f
            goto L39
        L2f:
            io.ktor.websocket.飘花落叶言子世楪苏哲兰 r6 = r5.$webSocket     // Catch: java.lang.Throwable -> L11
            r5.label = r3     // Catch: java.lang.Throwable -> L11
            java.lang.Object r6 = r6.mo8548(r5)     // Catch: java.lang.Throwable -> L11
            if (r6 != r0) goto L3a
        L39:
            return r0
        L3a:
            io.ktor.websocket.飘花落叶言子世楪苏哲兰 r5 = r5.$webSocket
            kotlinx.coroutines.AbstractC5399.m10509(r5, r2)
            goto L4c
        L40:
            io.ktor.websocket.飘花落叶言子世楪苏哲兰 r0 = r5.$webSocket     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "WebSocket is cancelled"
            java.util.concurrent.CancellationException r6 = kotlinx.coroutines.AbstractC5399.m10491(r1, r6)     // Catch: java.lang.Throwable -> L4f
            kotlinx.coroutines.AbstractC5399.m10509(r0, r6)     // Catch: java.lang.Throwable -> L4f
            goto L3a
        L4c:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
            return r5
        L4f:
            r6 = move-exception
            io.ktor.websocket.飘花落叶言子世楪苏哲兰 r5 = r5.$webSocket
            kotlinx.coroutines.AbstractC5399.m10509(r5, r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.websocket.WebSocketUpgrade$upgrade$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
