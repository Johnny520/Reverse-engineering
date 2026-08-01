package top.suzhelan.qstory.hook.item.mcp.config;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager", f = "McpServerManager.kt", l = {486, 477, 292, 296, 298}, m = "handleMessage", v = 2)
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
    final /* synthetic */ C5871 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpServerManager$handleMessage$1(C5871 c5871, InterfaceC4357<? super McpServerManager$handleMessage$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c5871;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C5871.m11269(this.this$0, null, null, this);
    }
}
