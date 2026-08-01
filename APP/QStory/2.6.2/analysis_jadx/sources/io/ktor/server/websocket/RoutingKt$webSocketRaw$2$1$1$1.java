package io.ktor.server.websocket;

import io.ktor.server.routing.C4154;
import io.ktor.server.routing.C4162;
import io.ktor.websocket.InterfaceC4257;
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
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.websocket.RoutingKt$webSocketRaw$2$1$1$1", f = "Routing.kt", l = {106}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class RoutingKt$webSocketRaw$2$1$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $handler;
    final /* synthetic */ boolean $negotiateExtensions;
    final /* synthetic */ String $protocol;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: io.ktor.server.websocket.RoutingKt$webSocketRaw$2$1$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "io.ktor.server.websocket.RoutingKt$webSocketRaw$2$1$1$1$1", f = "Routing.kt", l = {107}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ C4154 $$this$handle;
        final /* synthetic */ InterfaceC6553 $handler;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6553 interfaceC6553, C4154 c4154, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$handler = interfaceC6553;
            this.$$this$handle = c4154;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, this.$$this$handle, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC4257 interfaceC4257, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC4257, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                InterfaceC4257 interfaceC4257 = (InterfaceC4257) this.L$0;
                InterfaceC6553 interfaceC6553 = this.$handler;
                C4162 c4162 = this.$$this$handle.f12579;
                interfaceC4257.getClass();
                C4178 c4178 = new C4178(c4162, interfaceC4257);
                this.label = 1;
                if (interfaceC6553.invoke(c4178, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingKt$webSocketRaw$2$1$1$1(String str, boolean z, InterfaceC6553 interfaceC6553, InterfaceC4356<? super RoutingKt$webSocketRaw$2$1$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$protocol = str;
        this.$negotiateExtensions = z;
        this.$handler = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        RoutingKt$webSocketRaw$2$1$1$1 routingKt$webSocketRaw$2$1$1$1 = new RoutingKt$webSocketRaw$2$1$1$1(this.$protocol, this.$negotiateExtensions, this.$handler, interfaceC4356);
        routingKt$webSocketRaw$2$1$1$1.L$0 = obj;
        return routingKt$webSocketRaw$2$1$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4154 c4154, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((RoutingKt$webSocketRaw$2$1$1$1) create(c4154, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        InterfaceC5086 interfaceC5086M8922 = null;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C4154 c4154 = (C4154) this.L$0;
        C4162 c4162 = c4154.f12579;
        String str = this.$protocol;
        boolean z = this.$negotiateExtensions;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, c4154, null);
        this.label = 1;
        C4175 c4175 = new C4175(c4162, str, z, anonymousClass1);
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C4175.class);
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(C4175.class);
        } catch (Throwable unused) {
        }
        Object objMo8472 = c4162.mo8472(c4175, new C6856(interfaceC5092Mo8927, interfaceC5086M8922), this);
        if (objMo8472 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objMo8472 = c5175;
        }
        return objMo8472 == coroutineSingletons ? coroutineSingletons : c5175;
    }
}
