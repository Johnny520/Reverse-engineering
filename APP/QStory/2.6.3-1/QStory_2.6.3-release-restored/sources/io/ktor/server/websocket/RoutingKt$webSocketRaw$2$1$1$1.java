package io.ktor.server.websocket;

import io.ktor.server.routing.C4987;
import io.ktor.server.routing.C4995;
import io.ktor.websocket.InterfaceC5090;
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
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.websocket.RoutingKt$webSocketRaw$2$1$1$1", m556f = "Routing.kt", m557l = {106}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class RoutingKt$webSocketRaw$2$1$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $handler;
    final /* synthetic */ boolean $negotiateExtensions;
    final /* synthetic */ String $protocol;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: io.ktor.server.websocket.RoutingKt$webSocketRaw$2$1$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "io.ktor.server.websocket.RoutingKt$webSocketRaw$2$1$1$1$1", m556f = "Routing.kt", m557l = {107}, m558m = "invokeSuspend")
    public static final class C03721 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C4987 $$this$handle;
        final /* synthetic */ InterfaceC7383 $handler;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03721(InterfaceC7383 interfaceC7383, C4987 c4987, InterfaceC5189<? super C03721> interfaceC5189) {
            super(2, interfaceC5189);
            this.$handler = interfaceC7383;
            this.$$this$handle = c4987;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C03721 c03721 = new C03721(this.$handler, this.$$this$handle, interfaceC5189);
            c03721.L$0 = obj;
            return c03721;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC5090 interfaceC5090, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C03721) create(interfaceC5090, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC5090 interfaceC5090 = (InterfaceC5090) this.L$0;
                InterfaceC7383 interfaceC7383 = this.$handler;
                C4995 c4995 = this.$$this$handle.f12928;
                interfaceC5090.getClass();
                C5011 c5011 = new C5011(c4995, interfaceC5090);
                this.label = 1;
                if (interfaceC7383.invoke(c5011, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingKt$webSocketRaw$2$1$1$1(String str, boolean z, InterfaceC7383 interfaceC7383, InterfaceC5189<? super RoutingKt$webSocketRaw$2$1$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$protocol = str;
        this.$negotiateExtensions = z;
        this.$handler = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        RoutingKt$webSocketRaw$2$1$1$1 routingKt$webSocketRaw$2$1$1$1 = new RoutingKt$webSocketRaw$2$1$1$1(this.$protocol, this.$negotiateExtensions, this.$handler, interfaceC5189);
        routingKt$webSocketRaw$2$1$1$1.L$0 = obj;
        return routingKt$webSocketRaw$2$1$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C4987 c4987, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((RoutingKt$webSocketRaw$2$1$1$1) create(c4987, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        InterfaceC5919 interfaceC5919M9471 = null;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C4987 c4987 = (C4987) this.L$0;
        C4995 c4995 = c4987.f12928;
        String str = this.$protocol;
        boolean z = this.$negotiateExtensions;
        C03721 c03721 = new C03721(this.$handler, c4987, null);
        this.label = 1;
        C5008 c5008 = new C5008(c4995, str, z, c03721);
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C5008.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(C5008.class);
        } catch (Throwable unused) {
        }
        Object objMo9021 = c4995.mo9021(c5008, new C7686(interfaceC5925Mo9476, interfaceC5919M9471), this);
        if (objMo9021 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objMo9021 = c6008;
        }
        return objMo9021 == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
