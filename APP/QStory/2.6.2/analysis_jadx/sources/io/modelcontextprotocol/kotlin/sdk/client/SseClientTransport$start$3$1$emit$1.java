package io.modelcontextprotocol.kotlin.sdk.client;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.client.SseClientTransport$start$3$1", f = "SSEClientTransport.kt", l = {88, 96}, m = "emit")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class SseClientTransport$start$3$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4285 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SseClientTransport$start$3$1$emit$1(AbstractC4285 abstractC4285, InterfaceC4356<? super SseClientTransport$start$3$1$emit$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = abstractC4285;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
