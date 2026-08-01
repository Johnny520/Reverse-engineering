package io.ktor.server.websocket;

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
@InterfaceC6861(c = "io.ktor.server.websocket.RoutingKt$webSocket$1", f = "Routing.kt", l = {132}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/websocket/飘花落叶言子楪世兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/websocket/飘花落叶言子楪世兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class RoutingKt$webSocket$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingKt$webSocket$1(InterfaceC6553 interfaceC6553, InterfaceC4356<? super RoutingKt$webSocket$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$handler = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        RoutingKt$webSocket$1 routingKt$webSocket$1 = new RoutingKt$webSocket$1(this.$handler, interfaceC4356);
        routingKt$webSocket$1.L$0 = obj;
        return routingKt$webSocket$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC4176 interfaceC4176, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((RoutingKt$webSocket$1) create(interfaceC4176, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC4176 interfaceC4176 = (InterfaceC4176) this.L$0;
            InterfaceC6553 interfaceC6553 = this.$handler;
            this.label = 1;
            if (AbstractC4177.m8554(interfaceC4176, interfaceC6553, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
