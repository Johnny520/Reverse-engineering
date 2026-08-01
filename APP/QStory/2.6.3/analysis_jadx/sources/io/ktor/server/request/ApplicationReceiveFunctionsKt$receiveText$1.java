package io.ktor.server.request;

import io.ktor.server.plugins.CannotTransformContentToTypeException;
import io.ktor.util.C4209;
import io.ktor.utils.io.AbstractC4244;
import io.ktor.utils.io.InterfaceC4252;
import java.nio.charset.Charset;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlinx.io.InterfaceC5481;
import p058.AbstractC6855;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", f = "ApplicationReceiveFunctions.kt", l = {228, 151}, m = "receiveText")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
final class ApplicationReceiveFunctionsKt$receiveText$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ApplicationReceiveFunctionsKt$receiveText$1(InterfaceC4357<? super ApplicationReceiveFunctionsKt$receiveText$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Charset charset;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        C4209 c4209 = AbstractC4131.f12527;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        InterfaceC5087 interfaceC5087M8912 = null;
        if (i2 == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i2 == 1) {
            Charset charset2 = (Charset) this.L$0;
            AbstractC5185.m10210(obj);
            if (obj == null) {
                AbstractC4396.f12975.mo8917(InterfaceC4252.class);
                try {
                    interfaceC5087M8912 = AbstractC4396.m8912(InterfaceC4252.class);
                } catch (Throwable unused) {
                }
                interfaceC5087M8912.getClass();
                throw new CannotTransformContentToTypeException(interfaceC5087M8912);
            }
            this.L$0 = charset2;
            this.label = 2;
            obj = AbstractC4244.m8673((InterfaceC4252) obj, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            charset = charset2;
        } else {
            if (i2 != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charset = (Charset) this.L$0;
            AbstractC5185.m10210(obj);
        }
        return AbstractC6855.m12077((InterfaceC5481) obj, charset, 2);
    }
}
