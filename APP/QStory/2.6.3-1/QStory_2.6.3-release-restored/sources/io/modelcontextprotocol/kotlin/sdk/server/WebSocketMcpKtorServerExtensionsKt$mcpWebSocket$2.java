package io.modelcontextprotocol.kotlin.sdk.server;

import io.ktor.server.routing.InterfaceC5000;
import io.ktor.server.websocket.InterfaceC5013;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.server.WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2", m556f = "WebSocketMcpKtorServerExtensions.kt", m557l = {21}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/server/websocket/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/websocket/飘花落叶言子楪世苏哲兰;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $handler;
    final /* synthetic */ C5131 $options;
    final /* synthetic */ InterfaceC5000 $this_mcpWebSocket;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2(InterfaceC5000 interfaceC5000, C5131 c5131, InterfaceC7383 interfaceC7383, InterfaceC5189<? super WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_mcpWebSocket = interfaceC5000;
        this.$options = c5131;
        this.$handler = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2 webSocketMcpKtorServerExtensionsKt$mcpWebSocket$2 = new WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2(this.$this_mcpWebSocket, this.$options, this.$handler, interfaceC5189);
        webSocketMcpKtorServerExtensionsKt$mcpWebSocket$2.L$0 = obj;
        return webSocketMcpKtorServerExtensionsKt$mcpWebSocket$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC5013 interfaceC5013, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$2) create(interfaceC5013, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC5013 interfaceC5013 = (InterfaceC5013) this.L$0;
            C5131 c5131 = this.$options;
            InterfaceC7383 interfaceC7383 = this.$handler;
            this.label = 1;
            if (AbstractC5130.m9291(interfaceC5013, c5131, interfaceC7383, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
