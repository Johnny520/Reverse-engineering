package io.ktor.server.sse;

import com.bumptech.glide.AbstractC3888;
import io.ktor.server.routing.C4979;
import io.ktor.server.routing.C4987;
import io.ktor.server.routing.C4995;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7383;
import p075.C7686;
import p079.InterfaceC7691;
import p252.AbstractC8935;
import p252.AbstractC8944;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.sse.RoutingKt$sse$2", m556f = "Routing.kt", m557l = {52}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class RoutingKt$sse$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingKt$sse$2(InterfaceC7383 interfaceC7383, InterfaceC5189<? super RoutingKt$sse$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$handler = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        RoutingKt$sse$2 routingKt$sse$2 = new RoutingKt$sse$2(this.$handler, interfaceC5189);
        routingKt$sse$2.L$0 = obj;
        return routingKt$sse$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C4987 c4987, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((RoutingKt$sse$2) create(c4987, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        InterfaceC5919 interfaceC5919M9471 = null;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C4995 c4995 = ((C4987) this.L$0).f12928;
            C4979 c4979Mo9020 = c4995.mo9020();
            String[] strArr = AbstractC8944.f22758;
            AbstractC3888.m7249(c4979Mo9020, "Content-Type", AbstractC8935.f22734.toString());
            AbstractC3888.m7249(c4995.mo9020(), "Cache-Control", "no-store");
            AbstractC3888.m7249(c4995.mo9020(), "Connection", "keep-alive");
            AbstractC3888.m7249(c4995.mo9020(), "X-Accel-Buffering", "no");
            C5005 c5005 = new C5005(c4995, this.$handler);
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C5005.class);
            try {
                interfaceC5919M9471 = AbstractC5228.m9471(C5005.class);
            } catch (Throwable unused) {
            }
            C7686 c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
            this.label = 1;
            if (c4995.mo9021(c5005, c7686, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
