package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.WebSocketWriter", m556f = "WebSocketWriter.kt", m557l = {121, 125, 139}, m558m = "drainQueueAndSerialize")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class WebSocketWriter$drainQueueAndSerialize$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5087 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketWriter$drainQueueAndSerialize$1(C5087 c5087, InterfaceC5189<? super WebSocketWriter$drainQueueAndSerialize$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c5087;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m9266(null, null, this);
    }
}
