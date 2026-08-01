package io.ktor.server.request;

import io.ktor.server.plugins.CannotTransformContentToTypeException;
import io.ktor.util.C4208;
import io.ktor.utils.io.AbstractC4243;
import io.ktor.utils.io.InterfaceC4251;
import java.nio.charset.Charset;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlinx.io.InterfaceC5480;
import p058.AbstractC6854;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", l = {228, 151}, m = "receiveText")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
final class ApplicationReceiveFunctionsKt$receiveText$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ApplicationReceiveFunctionsKt$receiveText$1(InterfaceC4356<? super ApplicationReceiveFunctionsKt$receiveText$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Charset charset;
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
        if (i2 == 1) {
            Charset charset2 = (Charset) this.L$0;
            AbstractC5184.m10206(obj);
            if (obj == null) {
                AbstractC4395.f12971.mo8927(InterfaceC4251.class);
                try {
                    interfaceC5086M8922 = AbstractC4395.m8922(InterfaceC4251.class);
                } catch (Throwable unused) {
                }
                interfaceC5086M8922.getClass();
                throw new CannotTransformContentToTypeException(interfaceC5086M8922);
            }
            this.L$0 = charset2;
            this.label = 2;
            obj = AbstractC4243.m8683((InterfaceC4251) obj, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            charset = charset2;
        } else {
            if (i2 != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charset = (Charset) this.L$0;
            AbstractC5184.m10206(obj);
        }
        return AbstractC6854.m12049((InterfaceC5480) obj, charset, 2);
    }
}
