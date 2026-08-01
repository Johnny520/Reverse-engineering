package io.ktor.client.statement;

import bsh.C2633;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", l = {123}, m = "bodyAsBytes")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpResponseKt$bodyAsBytes$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public HttpResponseKt$bodyAsBytes$1(InterfaceC4357<? super HttpResponseKt$bodyAsBytes$1> interfaceC4357) {
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
            this = new HttpResponseKt$bodyAsBytes$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj2);
            throw null;
        }
        if (i2 != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj2);
        if (obj2 != null) {
            return (byte[]) obj2;
        }
        C2633.m5343("null cannot be cast to non-null type kotlin.ByteArray");
        return null;
    }
}
