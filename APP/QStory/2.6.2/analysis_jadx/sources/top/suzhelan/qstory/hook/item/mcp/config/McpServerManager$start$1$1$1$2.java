package top.suzhelan.qstory.hook.item.mcp.config;

import com.bumptech.glide.AbstractC3056;
import io.ktor.server.routing.C4154;
import io.ktor.server.routing.C4162;
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
@InterfaceC6861(c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$2", f = "McpServerManager.kt", l = {265}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 3, 0})
final class McpServerManager$start$1$1$1$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C5866 $this_runCatching;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpServerManager$start$1$1$1$2(C5866 c5866, InterfaceC4356<? super McpServerManager$start$1$1$1$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_runCatching = c5866;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        McpServerManager$start$1$1$1$2 mcpServerManager$start$1$1$1$2 = new McpServerManager$start$1$1$1$2(this.$this_runCatching, interfaceC4356);
        mcpServerManager$start$1$1$1$2.L$0 = obj;
        return mcpServerManager$start$1$1$1$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4154 c4154, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((McpServerManager$start$1$1$1$2) create(c4154, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C4154 c4154 = (C4154) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            this.$this_runCatching.f16031.invoke(AbstractC3056.m6668(-3937807582505469351L));
            C5866 c5866 = this.$this_runCatching;
            C4162 c4162 = c4154.f12579;
            String strM6668 = AbstractC3056.m6668(-3937807522375927207L);
            this.L$0 = null;
            this.label = 1;
            if (C5866.m11207(c5866, c4162, strM6668, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250(AbstractC3056.m6668(-3937693499584152999L));
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
