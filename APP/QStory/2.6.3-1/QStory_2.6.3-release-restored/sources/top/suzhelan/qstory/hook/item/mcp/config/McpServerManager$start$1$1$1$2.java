package top.suzhelan.qstory.hook.item.mcp.config;

import io.ktor.server.routing.C4987;
import io.ktor.server.routing.C4995;
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
@InterfaceC7691(m555c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$2", m556f = "McpServerManager.kt", m557l = {265}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class McpServerManager$start$1$1$1$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C6701 $this_runCatching;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpServerManager$start$1$1$1$2(C6701 c6701, InterfaceC5189<? super McpServerManager$start$1$1$1$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_runCatching = c6701;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        McpServerManager$start$1$1$1$2 mcpServerManager$start$1$1$1$2 = new McpServerManager$start$1$1$1$2(this.$this_runCatching, interfaceC5189);
        mcpServerManager$start$1$1$1$2.L$0 = obj;
        return mcpServerManager$start$1$1$1$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C4987 c4987, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((McpServerManager$start$1$1$1$2) create(c4987, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C4987 c4987 = (C4987) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.$this_runCatching.f16383.invoke("POST /mcp");
            C6701 c6701 = this.$this_runCatching;
            C4995 c4995 = c4987.f12928;
            String strM14532 = "/mcp";
            this.L$0 = null;
            this.label = 1;
            if (C6701.m11828(c6701, c4995, strM14532, this) == coroutineSingletons) {
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
