package io.ktor.client.plugins.cache.storage;

import io.ktor.client.plugins.cache.AbstractC4724;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", m556f = "HttpCacheStorage.kt", m557l = {59}, m558m = "store")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class HttpCacheStorageKt$store$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public HttpCacheStorageKt$store$1(InterfaceC5189<? super HttpCacheStorageKt$store$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new HttpCacheStorageKt$store$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            AbstractC4724.m8837(this);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.L$0 != null) {
            throw new ClassCastException();
        }
        AbstractC6017.m10769(obj2);
        obj2.getClass();
        throw new ClassCastException();
    }
}
