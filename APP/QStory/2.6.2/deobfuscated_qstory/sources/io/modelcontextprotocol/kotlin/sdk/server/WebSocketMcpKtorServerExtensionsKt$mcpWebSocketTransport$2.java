package io.modelcontextprotocol.kotlin.sdk.server;

import io.ktor.server.websocket.InterfaceC4180;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.server.WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$2", f = "WebSocketMcpKtorServerExtensions.kt", l = {52, 53, 54}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/websocket/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/websocket/飘花落叶言子楪世苏哲兰;)V"}, k = 3, mv = {2, 1, 0})
final class WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$2(InterfaceC6553 interfaceC6553, InterfaceC4356<? super WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$handler = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$2 webSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$2 = new WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$2(this.$handler, interfaceC4356);
        webSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$2.L$0 = obj;
        return webSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC4180 interfaceC4180, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$2) create(interfaceC4180, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4309.m8751(r1, r6) != r0) goto L21;
     */
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
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L14
            kotlin.AbstractC5184.m10206(r7)
            goto L5c
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r2
        L1a:
            java.lang.Object r1 = r6.L$0
            io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪哲世苏兰 r1 = (io.modelcontextprotocol.kotlin.sdk.server.C4293) r1
            kotlin.AbstractC5184.m10206(r7)
            goto L4e
        L22:
            java.lang.Object r1 = r6.L$0
            io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪哲世苏兰 r1 = (io.modelcontextprotocol.kotlin.sdk.server.C4293) r1
            kotlin.AbstractC5184.m10206(r7)
            goto L41
        L2a:
            kotlin.AbstractC5184.m10206(r7)
            java.lang.Object r7 = r6.L$0
            io.ktor.server.websocket.飘花落叶言子楪世苏哲兰 r7 = (io.ktor.server.websocket.InterfaceC4180) r7
            io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪哲世苏兰 r1 = new io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪哲世苏兰
            r1.<init>(r7)
            r6.L$0 = r1
            r6.label = r5
            java.lang.Object r7 = io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4309.m8750(r1, r6)
            if (r7 != r0) goto L41
            goto L5b
        L41:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r7 = r6.$handler
            r6.L$0 = r1
            r6.label = r4
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L4e
            goto L5b
        L4e:
            r6.L$0 = r2
            r6.label = r3
            r1.getClass()
            java.lang.Object r6 = io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4309.m8751(r1, r6)
            if (r6 != r0) goto L5c
        L5b:
            return r0
        L5c:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.server.WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
