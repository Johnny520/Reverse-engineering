package io.ktor.client.plugins.cache.storage;

import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.io.AbstractC5477;
import kotlinx.io.InterfaceC5480;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", l = {119, 131}, m = "store")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpCacheStorageKt$store$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public HttpCacheStorageKt$store$3(InterfaceC4356<? super HttpCacheStorageKt$store$3> interfaceC4356) {
        super(interfaceC4356);
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
            AbstractC5184.m10206(obj2);
            throw null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3889 abstractC3889 = (AbstractC3889) this.L$0;
            AbstractC5184.m10206(obj2);
            return abstractC3889;
        }
        if (this.L$1 != null) {
            C2941.m6336();
            return null;
        }
        if (this.L$0 != null) {
            C2941.m6336();
            return null;
        }
        AbstractC5184.m10206(obj2);
        InterfaceC5480 interfaceC5480 = (InterfaceC5480) obj2;
        interfaceC5480.getClass();
        AbstractC5477.m10625(interfaceC5480, -1);
        throw null;
    }
}
