package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.WebSocketWriter", m556f = "WebSocketWriter.kt", m557l = {155, 158, 163}, m558m = "flush")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class WebSocketWriter$flush$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5087 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketWriter$flush$1(C5087 c5087, InterfaceC5189<? super WebSocketWriter$flush$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c5087;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m9267(this);
    }
}
