package io.ktor.server.routing;

import io.ktor.server.application.AbstractC4065;
import io.ktor.server.application.InterfaceC4064;
import io.ktor.server.response.InterfaceC4133;
import io.ktor.util.C4208;
import io.ktor.util.pipeline.AbstractC4193;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.routing.RoutingNode$buildPipeline$1$1", f = "RoutingNode.kt", l = {116}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;V)V"}, k = 3, mv = {2, 0, 0})
final class RoutingNode$buildPipeline$1$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ List<InterfaceC6553> $handlers;
    final /* synthetic */ int $index;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingNode$buildPipeline$1$1(List<InterfaceC6553> list, int i, InterfaceC4356<? super RoutingNode$buildPipeline$1$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$handlers = list;
        this.$index = i;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, C5175 c5175, InterfaceC4356<? super C5175> interfaceC4356) {
        RoutingNode$buildPipeline$1$1 routingNode$buildPipeline$1$1 = new RoutingNode$buildPipeline$1$1(this.$handlers, this.$index, interfaceC4356);
        routingNode$buildPipeline$1$1.L$0 = abstractC4193;
        return routingNode$buildPipeline$1$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC4064 interfaceC4064 = (InterfaceC4064) ((AbstractC4193) this.L$0).f12660;
        interfaceC4064.getClass();
        C4155 c4155 = (C4155) interfaceC4064;
        C4154 c4154 = new C4154(new C4162(c4155));
        C4208 c4208 = AbstractC4065.f12357;
        if (!((InterfaceC4133) c4155.f12582.f318).mo397()) {
            InterfaceC6553 interfaceC6553 = this.$handlers.get(this.$index);
            this.label = 1;
            if (interfaceC6553.invoke(c4154, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c5175;
    }
}
