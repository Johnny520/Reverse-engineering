package top.suzhelan.qstory.hook.item.mcp.config;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager", f = "McpServerManager.kt", l = {486, 477, 292, 296, 298}, m = "handleMessage", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final class McpServerManager$handleMessage$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5866 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpServerManager$handleMessage$1(C5866 c5866, InterfaceC4356<? super McpServerManager$handleMessage$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c5866;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C5866.m11207(this.this$0, null, null, this);
    }
}
