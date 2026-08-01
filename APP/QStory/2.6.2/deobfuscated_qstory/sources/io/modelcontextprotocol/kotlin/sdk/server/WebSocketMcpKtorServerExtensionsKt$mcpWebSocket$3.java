package io.modelcontextprotocol.kotlin.sdk.server;

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
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.server.WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$3", f = "WebSocketMcpKtorServerExtensions.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏世哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏世哲兰;)V"}, k = 3, mv = {2, 1, 0})
final class WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$3 extends SuspendLambda implements InterfaceC6553 {
    int label;

    public WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$3(InterfaceC4356<? super WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$3> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$3(interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4295 c4295, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$3) create(c4295, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC5184.m10206(obj);
            return C5175.f14739;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
