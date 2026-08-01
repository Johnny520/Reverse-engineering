package top.suzhelan.qstory.hook.item.mcp.config;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager", f = "McpServerManager.kt", l = {454}, m = "broadcastMessage", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final class McpServerManager$broadcastMessage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5866 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpServerManager$broadcastMessage$1(C5866 c5866, InterfaceC4356<? super McpServerManager$broadcastMessage$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c5866;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C5866 c5866 = this.this$0;
        C5868 c5868 = C5866.f16023;
        return c5866.m11208(null, this);
    }
}
