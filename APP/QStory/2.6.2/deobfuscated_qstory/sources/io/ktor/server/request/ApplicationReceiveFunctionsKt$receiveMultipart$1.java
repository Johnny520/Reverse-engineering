package io.ktor.server.request;

import io.ktor.http.content.InterfaceC3976;
import io.ktor.server.plugins.CannotTransformContentToTypeException;
import io.ktor.util.C4208;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", l = {227}, m = "receiveMultipart")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
final class ApplicationReceiveFunctionsKt$receiveMultipart$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ApplicationReceiveFunctionsKt$receiveMultipart$1(InterfaceC4356<? super ApplicationReceiveFunctionsKt$receiveMultipart$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws CannotTransformContentToTypeException {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        C4208 c4208 = AbstractC4130.f12523;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        InterfaceC5086 interfaceC5086M8922 = null;
        if (i2 == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i2 != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        if (obj != null) {
            return obj;
        }
        AbstractC4395.f12971.mo8927(InterfaceC3976.class);
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(InterfaceC3976.class);
        } catch (Throwable unused) {
        }
        interfaceC5086M8922.getClass();
        throw new CannotTransformContentToTypeException(interfaceC5086M8922);
    }
}
