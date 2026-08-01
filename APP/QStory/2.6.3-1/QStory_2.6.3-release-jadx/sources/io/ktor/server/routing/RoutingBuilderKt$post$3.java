package io.ktor.server.routing;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.routing.RoutingBuilderKt$post$3", m556f = "RoutingBuilder.kt", m557l = {376, 152}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
public final class RoutingBuilderKt$post$3 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7380 $body;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingBuilderKt$post$3(InterfaceC7380 interfaceC7380, InterfaceC5189<? super RoutingBuilderKt$post$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.$body = interfaceC7380;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        RoutingBuilderKt$post$3 routingBuilderKt$post$3 = new RoutingBuilderKt$post$3(this.$body, interfaceC5189);
        routingBuilderKt$post$3.L$0 = obj;
        return routingBuilderKt$post$3;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C4987 c4987, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((RoutingBuilderKt$post$3) create(c4987, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C4995 c4995 = ((C4987) this.L$0).f12928;
            AbstractC5227.m9468();
            throw null;
        }
        if (i == 1) {
            C4987 c4987 = (C4987) this.L$1;
            InterfaceC7380 interfaceC7380 = (InterfaceC7380) this.L$0;
            AbstractC6017.m10769(obj);
            if (obj == null) {
                AbstractC5227.m9468();
                throw null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (interfaceC7380.invoke(c4987, obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        C4995 c4995 = ((C4987) this.L$0).f12928;
        AbstractC5227.m9468();
        throw null;
    }
}
