package io.ktor.server.request;

import io.ktor.server.plugins.CannotTransformContentToTypeException;
import java.io.InputStream;
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
@InterfaceC6861(c = "io.ktor.server.request.ApplicationReceiveFunctionsJvmKt", f = "ApplicationReceiveFunctionsJvm.kt", l = {18}, m = "receiveStream")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
final class ApplicationReceiveFunctionsJvmKt$receiveStream$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ApplicationReceiveFunctionsJvmKt$receiveStream$1(InterfaceC4356<? super ApplicationReceiveFunctionsJvmKt$receiveStream$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws CannotTransformContentToTypeException {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        InterfaceC5086 interfaceC5086M8922 = null;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC4395.f12971.mo8927(InputStream.class);
            try {
                AbstractC4395.m8922(InputStream.class);
            } catch (Throwable unused) {
            }
            this.label = 1;
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        if (obj != null) {
            return obj;
        }
        AbstractC4395.f12971.mo8927(InputStream.class);
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(InputStream.class);
        } catch (Throwable unused2) {
        }
        interfaceC5086M8922.getClass();
        throw new CannotTransformContentToTypeException(interfaceC5086M8922);
    }
}
