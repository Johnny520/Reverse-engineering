package io.modelcontextprotocol.kotlin.sdk.server;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.server.SseServerTransport", m556f = "SSEServerTransport.kt", m557l = {103}, m558m = "handleMessage")
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class SseServerTransport$handleMessage$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5132 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SseServerTransport$handleMessage$1(AbstractC5132 abstractC5132, InterfaceC5189<? super SseServerTransport$handleMessage$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = abstractC5132;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
