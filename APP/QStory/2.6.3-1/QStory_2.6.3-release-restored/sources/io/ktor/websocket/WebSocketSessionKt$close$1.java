package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.WebSocketSessionKt", m556f = "WebSocketSession.kt", m557l = {120, 121}, m558m = "close")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class WebSocketSessionKt$close$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public WebSocketSessionKt$close$1(InterfaceC5189<? super WebSocketSessionKt$close$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC5089.m9273(null, null, this);
    }
}
