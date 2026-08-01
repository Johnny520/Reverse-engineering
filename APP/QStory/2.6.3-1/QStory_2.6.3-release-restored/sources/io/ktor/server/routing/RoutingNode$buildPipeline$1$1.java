package io.ktor.server.routing;

import io.ktor.server.application.AbstractC4898;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.server.response.InterfaceC4966;
import io.ktor.util.C5041;
import io.ktor.util.pipeline.AbstractC5026;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.routing.RoutingNode$buildPipeline$1$1", m556f = "RoutingNode.kt", m557l = {116}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;V)V"}, m152k = 3, m153mv = {2, 0, 0})
final class RoutingNode$buildPipeline$1$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ List<InterfaceC7383> $handlers;
    final /* synthetic */ int $index;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingNode$buildPipeline$1$1(List<InterfaceC7383> list, int i, InterfaceC5189<? super RoutingNode$buildPipeline$1$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$handlers = list;
        this.$index = i;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, C6008 c6008, InterfaceC5189<? super C6008> interfaceC5189) {
        RoutingNode$buildPipeline$1$1 routingNode$buildPipeline$1$1 = new RoutingNode$buildPipeline$1$1(this.$handlers, this.$index, interfaceC5189);
        routingNode$buildPipeline$1$1.L$0 = abstractC5026;
        return routingNode$buildPipeline$1$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC4897 interfaceC4897 = (InterfaceC4897) ((AbstractC5026) this.L$0).f13009;
        interfaceC4897.getClass();
        C4988 c4988 = (C4988) interfaceC4897;
        C4987 c4987 = new C4987(new C4995(c4988));
        C5041 c5041 = AbstractC4898.f12706;
        if (!((InterfaceC4966) c4988.f12931.f663).mo952()) {
            InterfaceC7383 interfaceC7383 = this.$handlers.get(this.$index);
            this.label = 1;
            if (interfaceC7383.invoke(c4987, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c6008;
    }
}
