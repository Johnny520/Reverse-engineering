package io.ktor.client.plugins.cache;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.cache.HttpCache", m556f = "HttpCache.kt", m557l = {317, 319}, m558m = "findAndRefresh")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class HttpCache$findAndRefresh$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4725 this$0;

    public HttpCache$findAndRefresh$1(AbstractC4725 abstractC4725, InterfaceC5189<? super HttpCache$findAndRefresh$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        int i = AbstractC4725.f12441;
        throw null;
    }
}
