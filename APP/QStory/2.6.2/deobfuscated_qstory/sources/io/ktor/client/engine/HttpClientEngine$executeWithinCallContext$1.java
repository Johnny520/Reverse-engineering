package io.ktor.client.engine;

import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5406;
import p063.InterfaceC6861;
import p241.C8138;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", l = {91, 100}, m = "executeWithinCallContext")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpClientEngine$executeWithinCallContext$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public HttpClientEngine$executeWithinCallContext$1(InterfaceC4356<? super HttpClientEngine$executeWithinCallContext$1> interfaceC4356) {
        super(interfaceC4356);
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
            AbstractC5184.m10206(obj2);
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC5184.m10206(obj2);
                return obj2;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        C8138 c8138 = (C8138) this.L$1;
        if (this.L$0 != null) {
            C2941.m6336();
            return null;
        }
        AbstractC5184.m10206(obj2);
        InterfaceC4359 interfaceC4359 = (InterfaceC4359) obj2;
        interfaceC4359.getClass();
        C5406 c5406M10482 = AbstractC5398.m10482(null, interfaceC4359.plus(new C3876()), new HttpClientEngine$executeWithinCallContext$2(null, c8138, null), 2);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objM10570 = c5406M10482.m10570(this);
        return objM10570 == coroutineSingletons ? coroutineSingletons : objM10570;
    }
}
