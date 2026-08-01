package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", l = {121, 125, 139}, m = "drainQueueAndSerialize")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WebSocketWriter$drainQueueAndSerialize$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4254 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketWriter$drainQueueAndSerialize$1(C4254 c4254, InterfaceC4356<? super WebSocketWriter$drainQueueAndSerialize$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c4254;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m8717(null, null, this);
    }
}
