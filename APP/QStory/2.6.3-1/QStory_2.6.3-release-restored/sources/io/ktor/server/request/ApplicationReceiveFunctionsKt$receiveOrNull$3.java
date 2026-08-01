package io.ktor.server.request;

import io.ktor.server.application.C4890;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.server.engine.C4924;
import io.ktor.server.plugins.ContentTransformationException;
import io.ktor.util.C5041;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.request.ApplicationReceiveFunctionsKt", m556f = "ApplicationReceiveFunctions.kt", m557l = {134}, m558m = "receiveOrNull")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ApplicationReceiveFunctionsKt$receiveOrNull$3<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ApplicationReceiveFunctionsKt$receiveOrNull$3(InterfaceC5189<? super ApplicationReceiveFunctionsKt$receiveOrNull$3> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC4889 interfaceC4889;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        C5041 c5041 = AbstractC4963.f12872;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            try {
                this.L$0 = null;
                this.label = 1;
                Object objM9085 = AbstractC4963.m9085(this);
                return objM9085 == coroutineSingletons ? coroutineSingletons : objM9085;
            } catch (ContentTransformationException e) {
                e = e;
                interfaceC4889 = null;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC4889 = (InterfaceC4889) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                return obj;
            } catch (ContentTransformationException e2) {
                e = e2;
            }
        }
        C4890 c4890Mo9019 = interfaceC4889.mo9019();
        c4890Mo9019.getClass();
        ((C4924) c4890Mo9019.f12686).f12782.debug("Conversion failed, null returned", e);
        return null;
    }
}
