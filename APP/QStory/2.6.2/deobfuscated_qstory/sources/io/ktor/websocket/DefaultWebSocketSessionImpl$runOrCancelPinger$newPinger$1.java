package io.ktor.websocket;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
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
@InterfaceC6861(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1", f = "DefaultWebSocketSession.kt", l = {310}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 extends SuspendLambda implements InterfaceC6553 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C4260 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1(C4260 c4260, InterfaceC4356<? super DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c4260;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 = new DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1(this.this$0, interfaceC4356);
        defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1.L$0 = obj;
        return defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4262 c4262, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1) create(c4262, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C4262 c4262 = (C4262) this.L$0;
            C4260 c4260 = this.this$0;
            IOException iOException = new IOException("Ping timeout");
            this.label = 1;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4260.f12783;
            if (c4260.m8727(c4262, iOException, this) == coroutineSingletons) {
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
