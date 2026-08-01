package io.ktor.server.request;

import io.ktor.server.plugins.CannotTransformContentToTypeException;
import java.io.InputStream;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.request.ApplicationReceiveFunctionsJvmKt", m556f = "ApplicationReceiveFunctionsJvm.kt", m557l = {18}, m558m = "receiveStream")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 176)
final class ApplicationReceiveFunctionsJvmKt$receiveStream$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ApplicationReceiveFunctionsJvmKt$receiveStream$1(InterfaceC5189<? super ApplicationReceiveFunctionsJvmKt$receiveStream$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws CannotTransformContentToTypeException {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        InterfaceC5919 interfaceC5919M9471 = null;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5228.f13320.mo9476(InputStream.class);
            try {
                AbstractC5228.m9471(InputStream.class);
            } catch (Throwable unused) {
            }
            this.label = 1;
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        if (obj != null) {
            return obj;
        }
        AbstractC5228.f13320.mo9476(InputStream.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(InputStream.class);
        } catch (Throwable unused2) {
        }
        interfaceC5919M9471.getClass();
        throw new CannotTransformContentToTypeException(interfaceC5919M9471);
    }
}
