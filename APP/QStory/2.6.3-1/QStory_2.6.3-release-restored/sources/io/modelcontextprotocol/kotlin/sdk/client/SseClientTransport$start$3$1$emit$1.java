package io.modelcontextprotocol.kotlin.sdk.client;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.client.SseClientTransport$start$3$1", m556f = "SSEClientTransport.kt", m557l = {88, 96}, m558m = "emit")
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class SseClientTransport$start$3$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5118 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SseClientTransport$start$3$1$emit$1(AbstractC5118 abstractC5118, InterfaceC5189<? super SseClientTransport$start$3$1$emit$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = abstractC5118;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
