package io.ktor.server.request;

import io.ktor.server.plugins.CannotTransformContentToTypeException;
import io.ktor.util.C5041;
import io.ktor.utils.p007io.InterfaceC5084;
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
@InterfaceC7691(m555c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", m556f = "ApplicationReceiveFunctions.kt", m557l = {227}, m558m = "receiveChannel")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 176)
final class ApplicationReceiveFunctionsKt$receiveChannel$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ApplicationReceiveFunctionsKt$receiveChannel$1(InterfaceC5189<? super ApplicationReceiveFunctionsKt$receiveChannel$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws CannotTransformContentToTypeException {
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
            AbstractC5228.f13320.mo9476(InterfaceC5084.class);
            try {
                AbstractC5228.m9471(InterfaceC5084.class);
            } catch (Throwable unused) {
            }
            this.label = 1;
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        if (obj != null) {
            return obj;
        }
        AbstractC5228.f13320.mo9476(InterfaceC5084.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(InterfaceC5084.class);
        } catch (Throwable unused2) {
        }
        interfaceC5919M9471.getClass();
        throw new CannotTransformContentToTypeException(interfaceC5919M9471);
    }
}
