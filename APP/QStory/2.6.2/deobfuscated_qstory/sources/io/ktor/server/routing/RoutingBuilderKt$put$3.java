package io.ktor.server.routing;

import com.android.dx.io.Opcodes;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.routing.RoutingBuilderKt$put$3", f = "RoutingBuilder.kt", l = {376, Opcodes.RSUB_INT}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
public final class RoutingBuilderKt$put$3 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6550 $body;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingBuilderKt$put$3(InterfaceC6550 interfaceC6550, InterfaceC4356<? super RoutingBuilderKt$put$3> interfaceC4356) {
        super(2, interfaceC4356);
        this.$body = interfaceC6550;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        RoutingBuilderKt$put$3 routingBuilderKt$put$3 = new RoutingBuilderKt$put$3(this.$body, interfaceC4356);
        routingBuilderKt$put$3.L$0 = obj;
        return routingBuilderKt$put$3;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4154 c4154, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((RoutingBuilderKt$put$3) create(c4154, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C4162 c4162 = ((C4154) this.L$0).f12579;
            AbstractC4394.m8919();
            throw null;
        }
        if (i == 1) {
            C4154 c4154 = (C4154) this.L$1;
            InterfaceC6550 interfaceC6550 = (InterfaceC6550) this.L$0;
            AbstractC5184.m10206(obj);
            if (obj == null) {
                AbstractC4394.m8919();
                throw null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (interfaceC6550.invoke(c4154, obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        C4162 c4162 = ((C4154) this.L$0).f12579;
        AbstractC4394.m8919();
        throw null;
    }
}
