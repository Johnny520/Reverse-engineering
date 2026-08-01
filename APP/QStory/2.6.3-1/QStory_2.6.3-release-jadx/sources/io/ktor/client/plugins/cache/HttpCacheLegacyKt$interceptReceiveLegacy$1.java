package io.ktor.client.plugins.cache;

import com.alibaba.fastjson2.C3775;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", m556f = "HttpCacheLegacy.kt", m557l = {62, 63, 72}, m558m = "interceptReceiveLegacy")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class HttpCacheLegacyKt$interceptReceiveLegacy$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public HttpCacheLegacyKt$interceptReceiveLegacy$1(InterfaceC5189<? super HttpCacheLegacyKt$interceptReceiveLegacy$1> interfaceC5189) {
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
            this = new HttpCacheLegacyKt$interceptReceiveLegacy$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                AbstractC6017.m10769(obj2);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
        AbstractC6017.m10769(obj2);
        if (obj2 != null) {
            C3775.m6954();
            return null;
        }
        this.L$0 = null;
        this.label = 2;
        abstractC5026.mo9129(null, this);
        throw null;
    }
}
