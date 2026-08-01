package io.ktor.client.plugins.cache;

import com.alibaba.fastjson2.C2941;
import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", f = "HttpCacheLegacy.kt", l = {62, 63, 72}, m = "interceptReceiveLegacy")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpCacheLegacyKt$interceptReceiveLegacy$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public HttpCacheLegacyKt$interceptReceiveLegacy$1(InterfaceC4356<? super HttpCacheLegacyKt$interceptReceiveLegacy$1> interfaceC4356) {
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
            this = new HttpCacheLegacyKt$interceptReceiveLegacy$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5184.m10206(obj2);
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                AbstractC5184.m10206(obj2);
                return C5175.f14739;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
        AbstractC5184.m10206(obj2);
        if (obj2 != null) {
            C2941.m6336();
            return null;
        }
        this.L$0 = null;
        this.label = 2;
        abstractC4193.mo8580(null, this);
        throw null;
    }
}
