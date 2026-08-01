package io.modelcontextprotocol.kotlin.sdk.server;

import io.ktor.server.websocket.InterfaceC5013;
import io.modelcontextprotocol.kotlin.sdk.shared.AbstractC5142;
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
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.server.WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$4", m556f = "WebSocketMcpKtorServerExtensions.kt", m557l = {70, 71, 72}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/server/websocket/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/websocket/飘花落叶言子楪世苏哲兰;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$4 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$4(InterfaceC7383 interfaceC7383, InterfaceC5189<? super WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$4> interfaceC5189) {
        super(2, interfaceC5189);
        this.$handler = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$4 webSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$4 = new WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$4(this.$handler, interfaceC5189);
        webSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$4.L$0 = obj;
        return webSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$4;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC5013 interfaceC5013, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((WebSocketMcpKtorServerExtensionsKt$mcpWebSocketTransport$4) create(interfaceC5013, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (io.modelcontextprotocol.kotlin.sdk.shared.AbstractC5142.m9300(r1, r6) != r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C5126 c5126;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            c5126 = new C5126((InterfaceC5013) this.L$0);
            this.L$0 = c5126;
            this.label = 1;
            if (AbstractC5142.m9299(c5126, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            c5126 = (C5126) this.L$0;
            AbstractC6017.m10769(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5126 = (C5126) this.L$0;
            AbstractC6017.m10769(obj);
            this.L$0 = null;
            this.label = 3;
            c5126.getClass();
        }
        InterfaceC7383 interfaceC7383 = this.$handler;
        this.L$0 = c5126;
        this.label = 2;
        if (interfaceC7383.invoke(c5126, this) != coroutineSingletons) {
            this.L$0 = null;
            this.label = 3;
            c5126.getClass();
        }
        return coroutineSingletons;
    }
}
