package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", l = {121, 125, 139}, m = "drainQueueAndSerialize")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WebSocketWriter$drainQueueAndSerialize$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4255 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketWriter$drainQueueAndSerialize$1(C4255 c4255, InterfaceC4357<? super WebSocketWriter$drainQueueAndSerialize$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c4255;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m8707(null, null, this);
    }
}
