package io.modelcontextprotocol.kotlin.sdk.client;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.client.StdioClientTransport", f = "StdioClientTransport.kt", l = {118}, m = "processReadBuffer")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class StdioClientTransport$processReadBuffer$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4284 this$0;

    public StdioClientTransport$processReadBuffer$1(AbstractC4284 abstractC4284, InterfaceC4357<? super StdioClientTransport$processReadBuffer$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
