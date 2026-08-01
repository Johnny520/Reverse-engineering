package io.ktor.client.call;

import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", l = {111}, m = "body")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpClientCall$body$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3867 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientCall$body$1(C3867 c3867, InterfaceC4356<? super HttpClientCall$body$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c3867;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C3867 c3867 = this.this$0;
        c3867.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new HttpClientCall$body$1(c3867, this);
        }
        Object objM8265 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5184.m10206(objM8265);
            this.label = 1;
            objM8265 = c3867.m8265(this);
            if (objM8265 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(objM8265);
        }
        objM8265.getClass();
        return objM8265;
    }
}
