package io.ktor.client.call;

import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.call.HttpClientCall", m556f = "HttpClientCall.kt", m557l = {111}, m558m = "body")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class HttpClientCall$body$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4700 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientCall$body$1(C4700 c4700, InterfaceC5189<? super HttpClientCall$body$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4700;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4700 c4700 = this.this$0;
        c4700.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new HttpClientCall$body$1(c4700, this);
        }
        Object objM8811 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM8811);
            this.label = 1;
            objM8811 = c4700.m8811(this);
            if (objM8811 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(objM8811);
        }
        objM8811.getClass();
        return objM8811;
    }
}
