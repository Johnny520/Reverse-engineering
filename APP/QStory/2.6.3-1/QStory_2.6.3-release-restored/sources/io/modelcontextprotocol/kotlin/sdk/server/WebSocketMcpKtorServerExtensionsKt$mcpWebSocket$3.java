package io.modelcontextprotocol.kotlin.sdk.server;

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
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.server.WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$3", m556f = "WebSocketMcpKtorServerExtensions.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏世哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏世哲兰;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$3 extends SuspendLambda implements InterfaceC7383 {
    int label;

    public WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$3(InterfaceC5189<? super WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$3> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$3(interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5128 c5128, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((WebSocketMcpKtorServerExtensionsKt$mcpWebSocket$3) create(c5128, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
