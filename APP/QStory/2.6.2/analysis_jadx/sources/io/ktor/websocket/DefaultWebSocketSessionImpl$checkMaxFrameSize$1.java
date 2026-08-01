package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", l = {336}, m = "checkMaxFrameSize")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DefaultWebSocketSessionImpl$checkMaxFrameSize$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4260 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketSessionImpl$checkMaxFrameSize$1(C4260 c4260, InterfaceC4356<? super DefaultWebSocketSessionImpl$checkMaxFrameSize$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c4260;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C4260.m8726(this.this$0, null, null, this);
    }
}
