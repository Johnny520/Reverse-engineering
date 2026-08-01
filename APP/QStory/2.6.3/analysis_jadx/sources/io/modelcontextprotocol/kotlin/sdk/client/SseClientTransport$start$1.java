package io.modelcontextprotocol.kotlin.sdk.client;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.client.SseClientTransport", f = "SSEClientTransport.kt", l = {55, 60, 105}, m = "start")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class SseClientTransport$start$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4285 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SseClientTransport$start$1(AbstractC4285 abstractC4285, InterfaceC4357<? super SseClientTransport$start$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = abstractC4285;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
