package io.ktor.client.engine;

import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5407;
import p063.InterfaceC6862;
import p241.C8139;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", l = {91, 100}, m = "executeWithinCallContext")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpClientEngine$executeWithinCallContext$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public HttpClientEngine$executeWithinCallContext$1(InterfaceC4357<? super HttpClientEngine$executeWithinCallContext$1> interfaceC4357) {
        super(interfaceC4357);
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
            AbstractC5185.m10210(obj2);
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC5185.m10210(obj2);
                return obj2;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        C8139 c8139 = (C8139) this.L$1;
        if (this.L$0 != null) {
            C2942.m6394();
            return null;
        }
        AbstractC5185.m10210(obj2);
        InterfaceC4360 interfaceC4360 = (InterfaceC4360) obj2;
        interfaceC4360.getClass();
        C5407 c5407M10486 = AbstractC5399.m10486(null, interfaceC4360.plus(new C3877()), new HttpClientEngine$executeWithinCallContext$2(null, c8139, null), 2);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objM10573 = c5407M10486.m10573(this);
        return objM10573 == coroutineSingletons ? coroutineSingletons : objM10573;
    }
}
