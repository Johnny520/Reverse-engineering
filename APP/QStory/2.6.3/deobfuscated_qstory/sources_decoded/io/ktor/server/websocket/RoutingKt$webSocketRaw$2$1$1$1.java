package io.ktor.server.websocket;

import io.ktor.server.routing.C4155;
import io.ktor.server.routing.C4163;
import io.ktor.websocket.InterfaceC4258;
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
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.websocket.RoutingKt$webSocketRaw$2$1$1$1", f = "Routing.kt", l = {106}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class RoutingKt$webSocketRaw$2$1$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $handler;
    final /* synthetic */ boolean $negotiateExtensions;
    final /* synthetic */ String $protocol;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: io.ktor.server.websocket.RoutingKt$webSocketRaw$2$1$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6862(c = "io.ktor.server.websocket.RoutingKt$webSocketRaw$2$1$1$1$1", f = "Routing.kt", l = {107}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ C4155 $$this$handle;
        final /* synthetic */ InterfaceC6554 $handler;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6554 interfaceC6554, C4155 c4155, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$handler = interfaceC6554;
            this.$$this$handle = c4155;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, this.$$this$handle, interfaceC4357);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC4258 interfaceC4258, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC4258, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                InterfaceC4258 interfaceC4258 = (InterfaceC4258) this.L$0;
                InterfaceC6554 interfaceC6554 = this.$handler;
                C4163 c4163 = this.$$this$handle.f12583;
                interfaceC4258.getClass();
                C4179 c4179 = new C4179(c4163, interfaceC4258);
                this.label = 1;
                if (interfaceC6554.invoke(c4179, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingKt$webSocketRaw$2$1$1$1(String str, boolean z, InterfaceC6554 interfaceC6554, InterfaceC4357<? super RoutingKt$webSocketRaw$2$1$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$protocol = str;
        this.$negotiateExtensions = z;
        this.$handler = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        RoutingKt$webSocketRaw$2$1$1$1 routingKt$webSocketRaw$2$1$1$1 = new RoutingKt$webSocketRaw$2$1$1$1(this.$protocol, this.$negotiateExtensions, this.$handler, interfaceC4357);
        routingKt$webSocketRaw$2$1$1$1.L$0 = obj;
        return routingKt$webSocketRaw$2$1$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4155 c4155, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((RoutingKt$webSocketRaw$2$1$1$1) create(c4155, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        InterfaceC5087 interfaceC5087M8912 = null;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C4155 c4155 = (C4155) this.L$0;
        C4163 c4163 = c4155.f12583;
        String str = this.$protocol;
        boolean z = this.$negotiateExtensions;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, c4155, null);
        this.label = 1;
        C4176 c4176 = new C4176(c4163, str, z, anonymousClass1);
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C4176.class);
        try {
            interfaceC5087M8912 = AbstractC4396.m8912(C4176.class);
        } catch (Throwable unused) {
        }
        Object objMo8462 = c4163.mo8462(c4176, new C6857(interfaceC5093Mo8917, interfaceC5087M8912), this);
        if (objMo8462 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objMo8462 = c5176;
        }
        return objMo8462 == coroutineSingletons ? coroutineSingletons : c5176;
    }
}
