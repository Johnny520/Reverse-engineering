package io.ktor.server.sse;

import com.bumptech.glide.AbstractC3064;
import io.ktor.server.routing.C4146;
import io.ktor.server.routing.C4154;
import io.ktor.server.routing.C4162;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import p052.InterfaceC6553;
import p059.C6856;
import p063.InterfaceC6861;
import p236.AbstractC8105;
import p236.AbstractC8114;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.sse.RoutingKt$sse$2", f = "Routing.kt", l = {52}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class RoutingKt$sse$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingKt$sse$2(InterfaceC6553 interfaceC6553, InterfaceC4356<? super RoutingKt$sse$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$handler = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        RoutingKt$sse$2 routingKt$sse$2 = new RoutingKt$sse$2(this.$handler, interfaceC4356);
        routingKt$sse$2.L$0 = obj;
        return routingKt$sse$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4154 c4154, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((RoutingKt$sse$2) create(c4154, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        InterfaceC5086 interfaceC5086M8922 = null;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C4162 c4162 = ((C4154) this.L$0).f12579;
            C4146 c4146Mo8471 = c4162.mo8471();
            String[] strArr = AbstractC8114.f22415;
            AbstractC3064.m6780(c4146Mo8471, "Content-Type", AbstractC8105.f22391.toString());
            AbstractC3064.m6780(c4162.mo8471(), "Cache-Control", "no-store");
            AbstractC3064.m6780(c4162.mo8471(), "Connection", "keep-alive");
            AbstractC3064.m6780(c4162.mo8471(), "X-Accel-Buffering", "no");
            C4172 c4172 = new C4172(c4162, this.$handler);
            InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C4172.class);
            try {
                interfaceC5086M8922 = AbstractC4395.m8922(C4172.class);
            } catch (Throwable unused) {
            }
            C6856 c6856 = new C6856(interfaceC5092Mo8927, interfaceC5086M8922);
            this.label = 1;
            if (c4162.mo8472(c4172, c6856, this) == coroutineSingletons) {
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
