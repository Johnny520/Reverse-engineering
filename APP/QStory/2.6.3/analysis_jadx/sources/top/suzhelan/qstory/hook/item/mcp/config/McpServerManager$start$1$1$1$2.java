package top.suzhelan.qstory.hook.item.mcp.config;

import io.ktor.server.routing.C4155;
import io.ktor.server.routing.C4163;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$2", f = "McpServerManager.kt", l = {265}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 3, 0})
final class McpServerManager$start$1$1$1$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C5871 $this_runCatching;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpServerManager$start$1$1$1$2(C5871 c5871, InterfaceC4357<? super McpServerManager$start$1$1$1$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_runCatching = c5871;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        McpServerManager$start$1$1$1$2 mcpServerManager$start$1$1$1$2 = new McpServerManager$start$1$1$1$2(this.$this_runCatching, interfaceC4357);
        mcpServerManager$start$1$1$1$2.L$0 = obj;
        return mcpServerManager$start$1$1$1$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4155 c4155, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((McpServerManager$start$1$1$1$2) create(c4155, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C4155 c4155 = (C4155) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            this.$this_runCatching.f16038.invoke(AbstractC8405.m13972(2307));
            C5871 c5871 = this.$this_runCatching;
            C4163 c4163 = c4155.f12583;
            String strM13973 = AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵呜呜喵喵喵");
            this.L$0 = null;
            this.label = 1;
            if (C5871.m11269(c5871, c4163, strM13973, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311(AbstractC8405.m13972(1261));
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
