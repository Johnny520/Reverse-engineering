package io.ktor.server.request;

import io.ktor.util.C4209;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", l = {100}, m = "receive")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ApplicationReceiveFunctionsKt$receive$3<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ApplicationReceiveFunctionsKt$receive$3(InterfaceC4357<? super ApplicationReceiveFunctionsKt$receive$3> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        C4209 c4209 = AbstractC4131.f12527;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ApplicationReceiveFunctionsKt$receive$3<>(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj2);
            this.label = 1;
            throw null;
        }
        if (i2 != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj2);
        obj2.getClass();
        return obj2;
    }
}
