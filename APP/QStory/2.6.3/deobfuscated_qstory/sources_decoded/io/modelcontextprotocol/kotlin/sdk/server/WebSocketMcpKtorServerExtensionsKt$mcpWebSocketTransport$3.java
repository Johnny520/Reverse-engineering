package io.modelcontextprotocol.kotlin.sdk.server;

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
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.server.WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$3", f = "WebSocketMcpKtorServerExtensions.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪哲世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪哲世苏兰;)V"}, k = 3, mv = {2, 1, 0})
final class WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$3 extends SuspendLambda implements InterfaceC6554 {
    int label;

    public WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$3(InterfaceC4357<? super WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$3> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$3(interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4294 c4294, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$3) create(c4294, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC5185.m10210(obj);
            return C5176.f14739;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
