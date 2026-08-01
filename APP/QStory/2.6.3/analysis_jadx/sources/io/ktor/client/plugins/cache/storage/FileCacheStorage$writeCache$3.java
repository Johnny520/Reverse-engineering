package io.ktor.client.plugins.cache.storage;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {136, 137, 138, 139, 141, 143, 144, 146, 147, 148, 149, 151, 152, 154, 155}, m = "writeCache")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FileCacheStorage$writeCache$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC3888 this$0;

    public FileCacheStorage$writeCache$3(AbstractC3888 abstractC3888, InterfaceC4357<? super FileCacheStorage$writeCache$3> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
