package io.ktor.client.plugins.cache;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.cache.HttpCacheEntryKt", f = "HttpCacheEntry.kt", l = {18}, m = "HttpCacheEntry")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpCacheEntryKt$HttpCacheEntry$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public HttpCacheEntryKt$HttpCacheEntry$1(InterfaceC4356<? super HttpCacheEntryKt$HttpCacheEntry$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        AbstractC3891.m8288(this);
        throw null;
    }
}
