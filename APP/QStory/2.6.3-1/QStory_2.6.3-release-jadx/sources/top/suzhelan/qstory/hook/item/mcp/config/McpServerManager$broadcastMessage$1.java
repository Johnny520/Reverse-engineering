package top.suzhelan.qstory.hook.item.mcp.config;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager", m556f = "McpServerManager.kt", m557l = {454}, m558m = "broadcastMessage", m559v = 2)
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 50)
final class McpServerManager$broadcastMessage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6701 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpServerManager$broadcastMessage$1(C6701 c6701, InterfaceC5189<? super McpServerManager$broadcastMessage$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c6701;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C6701 c6701 = this.this$0;
        C6703 c6703 = C6701.f16375;
        return c6701.m11829(null, this);
    }
}
