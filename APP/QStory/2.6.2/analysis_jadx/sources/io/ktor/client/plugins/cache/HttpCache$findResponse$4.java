package io.ktor.client.plugins.cache;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", l = {345, 345}, m = "findResponse")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpCache$findResponse$4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC3892 this$0;

    public HttpCache$findResponse$4(AbstractC3892 abstractC3892, InterfaceC4356<? super HttpCache$findResponse$4> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        int i = AbstractC3892.f12091;
        throw null;
    }
}
