package io.ktor.websocket;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", l = {290}, m = "sendCloseSequence")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DefaultWebSocketSessionImpl$sendCloseSequence$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4261 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketSessionImpl$sendCloseSequence$1(C4261 c4261, InterfaceC4357<? super DefaultWebSocketSessionImpl$sendCloseSequence$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c4261;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4261 c4261 = this.this$0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4261.f12787;
        return c4261.m8717(null, null, this);
    }
}
