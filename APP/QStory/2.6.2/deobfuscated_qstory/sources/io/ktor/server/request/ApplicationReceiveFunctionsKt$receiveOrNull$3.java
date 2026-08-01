package io.ktor.server.request;

import io.ktor.server.application.C4057;
import io.ktor.server.application.InterfaceC4056;
import io.ktor.server.engine.C4091;
import io.ktor.server.plugins.ContentTransformationException;
import io.ktor.util.C4208;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", l = {134}, m = "receiveOrNull")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ApplicationReceiveFunctionsKt$receiveOrNull$3<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ApplicationReceiveFunctionsKt$receiveOrNull$3(InterfaceC4356<? super ApplicationReceiveFunctionsKt$receiveOrNull$3> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC4056 interfaceC4056;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        C4208 c4208 = AbstractC4130.f12523;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC5184.m10206(obj);
            try {
                this.L$0 = null;
                this.label = 1;
                Object objM8536 = AbstractC4130.m8536(this);
                return objM8536 == coroutineSingletons ? coroutineSingletons : objM8536;
            } catch (ContentTransformationException e) {
                e = e;
                interfaceC4056 = null;
            }
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC4056 = (InterfaceC4056) this.L$0;
            try {
                AbstractC5184.m10206(obj);
                return obj;
            } catch (ContentTransformationException e2) {
                e = e2;
            }
        }
        C4057 c4057Mo8470 = interfaceC4056.mo8470();
        c4057Mo8470.getClass();
        ((C4091) c4057Mo8470.f12337).f12433.debug("Conversion failed, null returned", e);
        return null;
    }
}
