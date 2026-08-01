package io.ktor.client.plugins.cache;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", l = {317, 319}, m = "findAndRefresh")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpCache$findAndRefresh$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC3893 this$0;

    public HttpCache$findAndRefresh$1(AbstractC3893 abstractC3893, InterfaceC4357<? super HttpCache$findAndRefresh$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        int i = AbstractC3893.f12096;
        throw null;
    }
}
