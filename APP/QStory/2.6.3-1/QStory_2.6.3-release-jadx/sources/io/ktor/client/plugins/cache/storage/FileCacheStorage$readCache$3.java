package io.ktor.client.plugins.cache.storage;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", m556f = "FileCacheStorage.kt", m557l = {159, 160, 160, 161, 162, 165, 166, 169, 170, 171, 172, 175, 176, 180, 182}, m558m = "readCache")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class FileCacheStorage$readCache$3 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4720 this$0;

    public FileCacheStorage$readCache$3(AbstractC4720 abstractC4720, InterfaceC5189<? super FileCacheStorage$readCache$3> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
