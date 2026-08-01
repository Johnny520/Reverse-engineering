package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", l = {46, 48, 63, 63, 63, 63}, m = "writeLoop")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WebSocketWriter$writeLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4254 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketWriter$writeLoop$1(C4254 c4254, InterfaceC4356<? super WebSocketWriter$writeLoop$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c4254;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C4254.m8716(this.this$0, null, this);
    }
}
