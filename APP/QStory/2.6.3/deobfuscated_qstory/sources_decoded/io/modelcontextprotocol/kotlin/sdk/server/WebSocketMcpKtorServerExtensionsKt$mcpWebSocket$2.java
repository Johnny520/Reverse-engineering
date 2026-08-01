package io.modelcontextprotocol.kotlin.sdk.server;

import io.ktor.server.routing.InterfaceC4168;
import io.ktor.server.websocket.InterfaceC4181;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.server.WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2", f = "WebSocketMcpKtorServerExtensions.kt", l = {21}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/websocket/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/websocket/飘花落叶言子楪世苏哲兰;)V"}, k = 3, mv = {2, 1, 0})
final class WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $handler;
    final /* synthetic */ C4299 $options;
    final /* synthetic */ InterfaceC4168 $this_mcpWebSocket;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2(InterfaceC4168 interfaceC4168, C4299 c4299, InterfaceC6554 interfaceC6554, InterfaceC4357<? super WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_mcpWebSocket = interfaceC4168;
        this.$options = c4299;
        this.$handler = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2 webSocketMcpKtorServerExtensionsKt$mcpWebSocket$2 = new WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2(this.$this_mcpWebSocket, this.$options, this.$handler, interfaceC4357);
        webSocketMcpKtorServerExtensionsKt$mcpWebSocket$2.L$0 = obj;
        return webSocketMcpKtorServerExtensionsKt$mcpWebSocket$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC4181 interfaceC4181, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2) create(interfaceC4181, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC4181 interfaceC4181 = (InterfaceC4181) this.L$0;
            C4299 c4299 = this.$options;
            InterfaceC6554 interfaceC6554 = this.$handler;
            this.label = 1;
            if (AbstractC4298.m8732(interfaceC4181, c4299, interfaceC6554, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
