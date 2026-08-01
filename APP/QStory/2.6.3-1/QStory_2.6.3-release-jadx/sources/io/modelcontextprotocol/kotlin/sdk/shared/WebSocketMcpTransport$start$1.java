package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport", m556f = "WebSocketMcpTransport.kt", m557l = {42}, m558m = "start$suspendImpl")
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class WebSocketMcpTransport$start$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5142 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketMcpTransport$start$1(AbstractC5142 abstractC5142, InterfaceC5189<? super WebSocketMcpTransport$start$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = abstractC5142;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC5142.m9299(this.this$0, this);
    }
}
