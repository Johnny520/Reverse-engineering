package io.ktor.server.request;

import io.ktor.server.plugins.CannotTransformContentToTypeException;
import io.ktor.util.C5041;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.InterfaceC5084;
import java.nio.charset.Charset;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlinx.p010io.InterfaceC6313;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", m556f = "ApplicationReceiveFunctions.kt", m557l = {228, 151}, m558m = "receiveText")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 176)
final class ApplicationReceiveFunctionsKt$receiveText$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ApplicationReceiveFunctionsKt$receiveText$1(InterfaceC5189<? super ApplicationReceiveFunctionsKt$receiveText$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Charset charset;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        C5041 c5041 = AbstractC4963.f12872;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        InterfaceC5919 interfaceC5919M9471 = null;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i2 == 1) {
            Charset charset2 = (Charset) this.L$0;
            AbstractC6017.m10769(obj);
            if (obj == null) {
                AbstractC5228.f13320.mo9476(InterfaceC5084.class);
                try {
                    interfaceC5919M9471 = AbstractC5228.m9471(InterfaceC5084.class);
                } catch (Throwable unused) {
                }
                interfaceC5919M9471.getClass();
                throw new CannotTransformContentToTypeException(interfaceC5919M9471);
            }
            this.L$0 = charset2;
            this.label = 2;
            obj = AbstractC5076.m9232((InterfaceC5084) obj, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            charset = charset2;
        } else {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charset = (Charset) this.L$0;
            AbstractC6017.m10769(obj);
        }
        return AbstractC7684.m12636((InterfaceC6313) obj, charset, 2);
    }
}
