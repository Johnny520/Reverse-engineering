package io.ktor.client.plugins.cache.storage;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", m556f = "FileCacheStorage.kt", m557l = {136, 137, 138, 139, 141, 143, 144, 146, 147, 148, 149, 151, 152, 154, 155}, m558m = "writeCache")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class FileCacheStorage$writeCache$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4720 this$0;

    public FileCacheStorage$writeCache$3(AbstractC4720 abstractC4720, InterfaceC5189<? super FileCacheStorage$writeCache$3> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
