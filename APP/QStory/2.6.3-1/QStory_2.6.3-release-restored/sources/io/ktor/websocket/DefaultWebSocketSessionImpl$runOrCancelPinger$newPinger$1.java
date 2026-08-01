package io.ktor.websocket;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1", m556f = "DefaultWebSocketSession.kt", m557l = {310}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 extends SuspendLambda implements InterfaceC7383 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5093 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1(C5093 c5093, InterfaceC5189<? super DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c5093;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 = new DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1(this.this$0, interfaceC5189);
        defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1.L$0 = obj;
        return defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5095 c5095, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1) create(c5095, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C5095 c5095 = (C5095) this.L$0;
            C5093 c5093 = this.this$0;
            IOException iOException = new IOException("Ping timeout");
            this.label = 1;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5093.f13132;
            if (c5093.m9276(c5095, iOException, this) == coroutineSingletons) {
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
