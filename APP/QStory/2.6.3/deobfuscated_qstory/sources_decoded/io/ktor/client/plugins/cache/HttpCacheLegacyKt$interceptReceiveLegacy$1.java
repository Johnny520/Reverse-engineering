package io.ktor.client.plugins.cache;

import com.alibaba.fastjson2.C2942;
import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", f = "HttpCacheLegacy.kt", l = {62, 63, 72}, m = "interceptReceiveLegacy")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpCacheLegacyKt$interceptReceiveLegacy$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public HttpCacheLegacyKt$interceptReceiveLegacy$1(InterfaceC4357<? super HttpCacheLegacyKt$interceptReceiveLegacy$1> interfaceC4357) {
        super(interfaceC4357);
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
            AbstractC5185.m10210(obj2);
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                AbstractC5185.m10210(obj2);
                return C5176.f14739;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
        AbstractC5185.m10210(obj2);
        if (obj2 != null) {
            C2942.m6394();
            return null;
        }
        this.L$0 = null;
        this.label = 2;
        abstractC4194.mo8570(null, this);
        throw null;
    }
}
