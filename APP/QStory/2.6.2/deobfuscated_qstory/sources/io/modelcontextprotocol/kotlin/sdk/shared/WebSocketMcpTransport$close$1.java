package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport", f = "WebSocketMcpTransport.kt", l = {91, 92}, m = "close$suspendImpl")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class WebSocketMcpTransport$close$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4309 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketMcpTransport$close$1(AbstractC4309 abstractC4309, InterfaceC4356<? super WebSocketMcpTransport$close$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = abstractC4309;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4309.m8751(this.this$0, this);
    }
}
