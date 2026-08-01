package io.ktor.server.routing;

import io.ktor.server.application.AbstractC4066;
import io.ktor.server.application.InterfaceC4065;
import io.ktor.server.response.InterfaceC4134;
import io.ktor.util.C4209;
import io.ktor.util.pipeline.AbstractC4194;
import java.util.List;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.routing.RoutingNode$buildPipeline$1$1", f = "RoutingNode.kt", l = {116}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;V)V"}, k = 3, mv = {2, 0, 0})
final class RoutingNode$buildPipeline$1$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ List<InterfaceC6554> $handlers;
    final /* synthetic */ int $index;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingNode$buildPipeline$1$1(List<InterfaceC6554> list, int i, InterfaceC4357<? super RoutingNode$buildPipeline$1$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$handlers = list;
        this.$index = i;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, C5176 c5176, InterfaceC4357<? super C5176> interfaceC4357) {
        RoutingNode$buildPipeline$1$1 routingNode$buildPipeline$1$1 = new RoutingNode$buildPipeline$1$1(this.$handlers, this.$index, interfaceC4357);
        routingNode$buildPipeline$1$1.L$0 = abstractC4194;
        return routingNode$buildPipeline$1$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        InterfaceC4065 interfaceC4065 = (InterfaceC4065) ((AbstractC4194) this.L$0).f12664;
        interfaceC4065.getClass();
        C4156 c4156 = (C4156) interfaceC4065;
        C4155 c4155 = new C4155(new C4163(c4156));
        C4209 c4209 = AbstractC4066.f12361;
        if (!((InterfaceC4134) c4156.f12586.f318).mo392()) {
            InterfaceC6554 interfaceC6554 = this.$handlers.get(this.$index);
            this.label = 1;
            if (interfaceC6554.invoke(c4155, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c5176;
    }
}
