package io.ktor.client.engine;

import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6239;
import p079.InterfaceC7691;
import p257.C8968;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", m556f = "HttpClientEngine.kt", m557l = {91, 100}, m558m = "executeWithinCallContext")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class HttpClientEngine$executeWithinCallContext$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public HttpClientEngine$executeWithinCallContext$1(InterfaceC5189<? super HttpClientEngine$executeWithinCallContext$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new HttpClientEngine$executeWithinCallContext$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj2);
                return obj2;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        C8968 c8968 = (C8968) this.L$1;
        if (this.L$0 != null) {
            C3775.m6954();
            return null;
        }
        AbstractC6017.m10769(obj2);
        InterfaceC5192 interfaceC5192 = (InterfaceC5192) obj2;
        interfaceC5192.getClass();
        C6239 c6239M11045 = AbstractC6231.m11045(null, interfaceC5192.plus(new C4709()), new HttpClientEngine$executeWithinCallContext$2(null, c8968, null), 2);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objM11132 = c6239M11045.m11132(this);
        return objM11132 == coroutineSingletons ? coroutineSingletons : objM11132;
    }
}
