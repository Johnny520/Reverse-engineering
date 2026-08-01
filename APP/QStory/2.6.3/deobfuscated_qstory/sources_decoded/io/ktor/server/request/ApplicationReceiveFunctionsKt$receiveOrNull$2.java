package io.ktor.server.request;

import io.ktor.server.application.C4058;
import io.ktor.server.application.InterfaceC4057;
import io.ktor.server.engine.C4092;
import io.ktor.server.plugins.ContentTransformationException;
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
@InterfaceC6862(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", l = {115}, m = "receiveOrNull")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ApplicationReceiveFunctionsKt$receiveOrNull$2<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ApplicationReceiveFunctionsKt$receiveOrNull$2(InterfaceC4357<? super ApplicationReceiveFunctionsKt$receiveOrNull$2> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC4057 interfaceC4057;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        C4209 c4209 = AbstractC4131.f12527;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC5185.m10210(obj);
            try {
                this.L$0 = null;
                this.label = 1;
                throw null;
            } catch (ContentTransformationException e) {
                e = e;
                interfaceC4057 = null;
            }
        } else {
            if (i2 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC4057 = (InterfaceC4057) this.L$0;
            try {
                AbstractC5185.m10210(obj);
                return obj;
            } catch (ContentTransformationException e2) {
                e = e2;
            }
        }
        C4058 c4058Mo8460 = interfaceC4057.mo8460();
        c4058Mo8460.getClass();
        ((C4092) c4058Mo8460.f12341).f12437.debug("Conversion failed, null returned", e);
        return null;
    }
}
