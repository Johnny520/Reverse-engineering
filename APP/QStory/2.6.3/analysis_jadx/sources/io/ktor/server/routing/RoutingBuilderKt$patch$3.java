package io.ktor.server.routing;

import com.android.dx.io.Opcodes;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.routing.RoutingBuilderKt$patch$3", f = "RoutingBuilder.kt", l = {376, Opcodes.INVOKE_CUSTOM}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
public final class RoutingBuilderKt$patch$3 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6551 $body;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingBuilderKt$patch$3(InterfaceC6551 interfaceC6551, InterfaceC4357<? super RoutingBuilderKt$patch$3> interfaceC4357) {
        super(2, interfaceC4357);
        this.$body = interfaceC6551;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        RoutingBuilderKt$patch$3 routingBuilderKt$patch$3 = new RoutingBuilderKt$patch$3(this.$body, interfaceC4357);
        routingBuilderKt$patch$3.L$0 = obj;
        return routingBuilderKt$patch$3;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4155 c4155, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((RoutingBuilderKt$patch$3) create(c4155, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C4163 c4163 = ((C4155) this.L$0).f12583;
            AbstractC4395.m8909();
            throw null;
        }
        if (i == 1) {
            C4155 c4155 = (C4155) this.L$1;
            InterfaceC6551 interfaceC6551 = (InterfaceC6551) this.L$0;
            AbstractC5185.m10210(obj);
            if (obj == null) {
                AbstractC4395.m8909();
                throw null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (interfaceC6551.invoke(c4155, obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        C4163 c4163 = ((C4155) this.L$0).f12583;
        AbstractC4395.m8909();
        throw null;
    }
}
