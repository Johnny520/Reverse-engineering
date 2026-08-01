package io.modelcontextprotocol.kotlin.sdk.server;

import io.ktor.server.routing.InterfaceC4167;
import io.ktor.server.websocket.InterfaceC4180;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.server.WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2", f = "WebSocketMcpKtorServerExtensions.kt", l = {21}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/websocket/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/websocket/飘花落叶言子楪世苏哲兰;)V"}, k = 3, mv = {2, 1, 0})
final class WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $handler;
    final /* synthetic */ C4298 $options;
    final /* synthetic */ InterfaceC4167 $this_mcpWebSocket;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2(InterfaceC4167 interfaceC4167, C4298 c4298, InterfaceC6553 interfaceC6553, InterfaceC4356<? super WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_mcpWebSocket = interfaceC4167;
        this.$options = c4298;
        this.$handler = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2 webSocketMcpKtorServerExtensionsKt$mcpWebSocket$2 = new WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2(this.$this_mcpWebSocket, this.$options, this.$handler, interfaceC4356);
        webSocketMcpKtorServerExtensionsKt$mcpWebSocket$2.L$0 = obj;
        return webSocketMcpKtorServerExtensionsKt$mcpWebSocket$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC4180 interfaceC4180, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2) create(interfaceC4180, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC4180 interfaceC4180 = (InterfaceC4180) this.L$0;
            C4298 c4298 = this.$options;
            InterfaceC6553 interfaceC6553 = this.$handler;
            this.label = 1;
            if (AbstractC4297.m8742(interfaceC4180, c4298, interfaceC6553, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
