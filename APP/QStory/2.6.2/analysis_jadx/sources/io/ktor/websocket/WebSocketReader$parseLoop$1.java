package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", l = {93, 101}, m = "parseLoop")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WebSocketReader$parseLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4267 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketReader$parseLoop$1(C4267 c4267, InterfaceC4356<? super WebSocketReader$parseLoop$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c4267;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m8732(null, this);
    }
}
