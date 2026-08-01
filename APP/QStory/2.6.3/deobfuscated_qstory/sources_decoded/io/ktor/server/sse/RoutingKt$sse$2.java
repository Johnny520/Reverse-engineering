package io.ktor.server.sse;

import com.bumptech.glide.AbstractC3056;
import io.ktor.server.routing.C4147;
import io.ktor.server.routing.C4155;
import io.ktor.server.routing.C4163;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import p052.InterfaceC6554;
import p059.C6857;
import p063.InterfaceC6862;
import p236.AbstractC8106;
import p236.AbstractC8115;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.sse.RoutingKt$sse$2", f = "Routing.kt", l = {52}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class RoutingKt$sse$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingKt$sse$2(InterfaceC6554 interfaceC6554, InterfaceC4357<? super RoutingKt$sse$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$handler = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        RoutingKt$sse$2 routingKt$sse$2 = new RoutingKt$sse$2(this.$handler, interfaceC4357);
        routingKt$sse$2.L$0 = obj;
        return routingKt$sse$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4155 c4155, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((RoutingKt$sse$2) create(c4155, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        InterfaceC5087 interfaceC5087M8912 = null;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C4163 c4163 = ((C4155) this.L$0).f12583;
            C4147 c4147Mo8461 = c4163.mo8461();
            String[] strArr = AbstractC8115.f22413;
            AbstractC3056.m6689(c4147Mo8461, "Content-Type", AbstractC8106.f22389.toString());
            AbstractC3056.m6689(c4163.mo8461(), "Cache-Control", "no-store");
            AbstractC3056.m6689(c4163.mo8461(), "Connection", "keep-alive");
            AbstractC3056.m6689(c4163.mo8461(), "X-Accel-Buffering", "no");
            C4173 c4173 = new C4173(c4163, this.$handler);
            InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C4173.class);
            try {
                interfaceC5087M8912 = AbstractC4396.m8912(C4173.class);
            } catch (Throwable unused) {
            }
            C6857 c6857 = new C6857(interfaceC5093Mo8917, interfaceC5087M8912);
            this.label = 1;
            if (c4163.mo8462(c4173, c6857, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
