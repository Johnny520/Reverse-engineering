package io.ktor.client.plugins.cache.storage;

import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.InterfaceC6313;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", m556f = "HttpCacheStorage.kt", m557l = {119, 131}, m558m = "store")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class HttpCacheStorageKt$store$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public HttpCacheStorageKt$store$3(InterfaceC5189<? super HttpCacheStorageKt$store$3> interfaceC5189) {
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
            this = new HttpCacheStorageKt$store$3(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            throw null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4722 abstractC4722 = (AbstractC4722) this.L$0;
            AbstractC6017.m10769(obj2);
            return abstractC4722;
        }
        if (this.L$1 != null) {
            C3775.m6954();
            return null;
        }
        if (this.L$0 != null) {
            C3775.m6954();
            return null;
        }
        AbstractC6017.m10769(obj2);
        InterfaceC6313 interfaceC6313 = (InterfaceC6313) obj2;
        interfaceC6313.getClass();
        AbstractC6310.m11188(interfaceC6313, -1);
        throw null;
    }
}
