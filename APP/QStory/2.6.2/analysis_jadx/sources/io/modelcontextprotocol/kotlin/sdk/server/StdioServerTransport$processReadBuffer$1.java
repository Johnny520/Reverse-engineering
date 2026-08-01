package io.modelcontextprotocol.kotlin.sdk.server;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.server.StdioServerTransport", f = "StdioServerTransport.kt", l = {106}, m = "processReadBuffer")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class StdioServerTransport$processReadBuffer$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4296 this$0;

    public StdioServerTransport$processReadBuffer$1(AbstractC4296 abstractC4296, InterfaceC4356<? super StdioServerTransport$processReadBuffer$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
